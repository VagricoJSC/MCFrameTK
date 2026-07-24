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
 * "品目マスタ送信ＩＦ // Item master export IF"DBコンテナRowクラスです。<p>
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
 *  	<td>itm_cd</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>品目ＣＤ</td>
 *  	<td>Item cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>K</td>
 *  	<td>itm_sub1</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>枝番１</td>
 *  	<td>Branch No. 1</td>
 *  </tr>
 *  <tr >
 *  	<td>K</td>
 *  	<td>itm_sub2</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>枝番２</td>
 *  	<td>Branch No. 2</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>K</td>
 *  	<td>itm_sub3</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>枝番３</td>
 *  	<td>Branch No. 3</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>itm_nm</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>品目名</td>
 *  	<td>Item name</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>itm_nm_lcl1</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>品目名（ロケール１）</td>
 *  	<td>Item name (Locale1)</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>itm_nm_lcl2</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>品目名（ロケール２）</td>
 *  	<td>Item name (Locale2)</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>itm_nm_lcl3</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>品目名（ロケール３）</td>
 *  	<td>Item name (Locale3)</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>itm_nm_lcl4</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>品目名（ロケール４）</td>
 *  	<td>Item name (Locale4)</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>itm_nm_lcl5</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>品目名（ロケール５）</td>
 *  	<td>Item name (Locale5)</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>unit_nm</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>単位名</td>
 *  	<td>Unit name</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>unit_nm_lcl1</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>単位名（ロケール１）</td>
 *  	<td>Unit name (Locale 1)</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>unit_nm_lcl2</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>単位名（ロケール２）</td>
 *  	<td>Unit name (Locale 2)</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>unit_nm_lcl3</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>単位名（ロケール３）</td>
 *  	<td>Unit name (Locale 3)</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>unit_nm_lcl4</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>単位名（ロケール４）</td>
 *  	<td>Unit name (Locale 4)</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>unit_nm_lcl5</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>単位名（ロケール５）</td>
 *  	<td>Unit name (Locale 5)</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>itm_typ_nm</td>
 *  	<td>C</td>
 *  	<td>1000</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>品目区分名</td>
 *  	<td>Item type name</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>itm_typ_nm_lcl1</td>
 *  	<td>C</td>
 *  	<td>1000</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>品目区分名（ロケール１）</td>
 *  	<td>Item type name (Locale1)</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>itm_typ_nm_lcl2</td>
 *  	<td>C</td>
 *  	<td>1000</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>品目区分名（ロケール２）</td>
 *  	<td>Item type name (Locale2)</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>itm_typ_nm_lcl3</td>
 *  	<td>C</td>
 *  	<td>1000</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>品目区分名（ロケール３）</td>
 *  	<td>Item type name (Locale3)</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>itm_typ_nm_lcl4</td>
 *  	<td>C</td>
 *  	<td>1000</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>品目区分名（ロケール４）</td>
 *  	<td>Item type name (Locale4)</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>itm_typ_nm_lcl5</td>
 *  	<td>C</td>
 *  	<td>1000</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>品目区分名（ロケール５）</td>
 *  	<td>Item type name (Locale5)</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>itm_typ_d_nm</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>品目区分詳細名</td>
 *  	<td>Item type details name</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>itm_typ_d_nm_lcl1</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>品目区分詳細名（ロケール１）</td>
 *  	<td>Item type details name (Locale1)</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>itm_typ_d_nm_lcl2</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>品目区分詳細名（ロケール２）</td>
 *  	<td>Item type details name (Locale2)</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>itm_typ_d_nm_lcl3</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>品目区分詳細名（ロケール３）</td>
 *  	<td>Item type details name (Locale3)</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>itm_typ_d_nm_lcl4</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>品目区分詳細名（ロケール４）</td>
 *  	<td>Item type details name (Locale4)</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>itm_typ_d_nm_lcl5</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>品目区分詳細名（ロケール５）</td>
 *  	<td>Item type details name (Locale5)</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>itm_jnl_nm</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>品目仕訳名</td>
 *  	<td>Item journal name</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>itm_jnl_nm_lcl1</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>品目仕訳名（ロケール１）</td>
 *  	<td>Item journal name (Locale1)</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>itm_jnl_nm_lcl2</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>品目仕訳名（ロケール２）</td>
 *  	<td>Item journal name (Locale2)</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>itm_jnl_nm_lcl3</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>品目仕訳名（ロケール３）</td>
 *  	<td>Item journal name (Locale3)</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>itm_jnl_nm_lcl4</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>品目仕訳名（ロケール４）</td>
 *  	<td>Item journal name (Locale4)</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>itm_jnl_nm_lcl5</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>品目仕訳名（ロケール５）</td>
 *  	<td>Item journal name (Locale5)</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>ac_itm_grp_nm</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>会計品目分類名</td>
 *  	<td>Accounting item classification name</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>ac_itm_grp_nm_lcl1</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>会計品目分類名（ロケール１）</td>
 *  	<td>Accounting item classification name (Locale1)</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>ac_itm_grp_nm_lcl2</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>会計品目分類名（ロケール２）</td>
 *  	<td>Accounting item classification name (Locale2)</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>ac_itm_grp_nm_lcl3</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>会計品目分類名（ロケール３）</td>
 *  	<td>Accounting item classification name (Locale3)</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>ac_itm_grp_nm_lcl4</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>会計品目分類名（ロケール４）</td>
 *  	<td>Accounting item classification name (Locale4)</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>ac_itm_grp_nm_lcl5</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>会計品目分類名（ロケール５）</td>
 *  	<td>Accounting item classification name (Locale5)</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>itm_grp_cd1</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>品目分類ＣＤ１</td>
 *  	<td>Item classification cd. 1</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>itm_grp_nm1</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>品目分類名１</td>
 *  	<td>Item classification name 1</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>itm_grp_nm1_lcl1</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>品目分類名１（ロケール１）</td>
 *  	<td>Item classification name 1 (Locale1)</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>itm_grp_nm1_lcl2</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>品目分類名１（ロケール２）</td>
 *  	<td>Item classification name 1 (Locale2)</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>itm_grp_nm1_lcl3</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>品目分類名１（ロケール３）</td>
 *  	<td>Item classification name 1 (Locale3)</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>itm_grp_nm1_lcl4</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>品目分類名１（ロケール４）</td>
 *  	<td>Item classification name 1 (Locale4)</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>itm_grp_nm1_lcl5</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>品目分類名１（ロケール５）</td>
 *  	<td>Item classification name 1 (Locale5)</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>itm_grp_cd2</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>品目分類ＣＤ２</td>
 *  	<td>Item classification cd. 2</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>itm_grp_nm2</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>品目分類名２</td>
 *  	<td>Item classification name 2</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>itm_grp_nm2_lcl1</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>品目分類名２（ロケール１）</td>
 *  	<td>Item classification name 2 (Locale1)</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>itm_grp_nm2_lcl2</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>品目分類名２（ロケール２）</td>
 *  	<td>Item classification name 2 (Locale2)</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>itm_grp_nm2_lcl3</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>品目分類名２（ロケール３）</td>
 *  	<td>Item classification name 2 (Locale3)</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>itm_grp_nm2_lcl4</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>品目分類名２（ロケール４）</td>
 *  	<td>Item classification name 2 (Locale4)</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>itm_grp_nm2_lcl5</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>品目分類名２（ロケール５）</td>
 *  	<td>Item classification name 2 (Locale5)</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>itm_grp_cd3</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>品目分類ＣＤ３</td>
 *  	<td>Item classification cd. 3</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>itm_grp_nm3</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>品目分類名３</td>
 *  	<td>Item classification name 3</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>itm_grp_nm3_lcl1</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>品目分類名３（ロケール１）</td>
 *  	<td>Item classification name 3 (Locale1)</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>itm_grp_nm3_lcl2</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>品目分類名３（ロケール２）</td>
 *  	<td>Item classification name 3 (Locale2)</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>itm_grp_nm3_lcl3</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>品目分類名３（ロケール３）</td>
 *  	<td>Item classification name 3 (Locale3)</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>itm_grp_nm3_lcl4</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>品目分類名３（ロケール４）</td>
 *  	<td>Item classification name 3 (Locale4)</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>itm_grp_nm3_lcl5</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>品目分類名３（ロケール５）</td>
 *  	<td>Item classification name 3 (Locale5)</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>itm_grp_cd4</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>品目分類ＣＤ４</td>
 *  	<td>Item classification cd. 4</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>itm_grp_nm4</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>品目分類名４</td>
 *  	<td>Item classification name 4</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>itm_grp_nm4_lcl1</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>品目分類名４（ロケール１）</td>
 *  	<td>Item classification name 4 (Locale1)</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>itm_grp_nm4_lcl2</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>品目分類名４（ロケール２）</td>
 *  	<td>Item classification name 4 (Locale2)</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>itm_grp_nm4_lcl3</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>品目分類名４（ロケール３）</td>
 *  	<td>Item classification name 4 (Locale3)</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>itm_grp_nm4_lcl4</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>品目分類名４（ロケール４）</td>
 *  	<td>Item classification name 4 (Locale4)</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>itm_grp_nm4_lcl5</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>品目分類名４（ロケール５）</td>
 *  	<td>Item classification name 4 (Locale5)</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>itm_grp_cd5</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>品目分類ＣＤ５</td>
 *  	<td>Item classification cd. 5</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>itm_grp_nm5</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>品目分類名５</td>
 *  	<td>Item classification name 5</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>itm_grp_nm5_lcl1</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>品目分類名５（ロケール１）</td>
 *  	<td>Item classification name 5 (Locale1)</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>itm_grp_nm5_lcl2</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>品目分類名５（ロケール２）</td>
 *  	<td>Item classification name 5 (Locale2)</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>itm_grp_nm5_lcl3</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>品目分類名５（ロケール３）</td>
 *  	<td>Item classification name 5 (Locale3)</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>itm_grp_nm5_lcl4</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>品目分類名５（ロケール４）</td>
 *  	<td>Item classification name 5 (Locale4)</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>itm_grp_nm5_lcl5</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>品目分類名５（ロケール５）</td>
 *  	<td>Item classification name 5 (Locale5)</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>itm_grp_cd6</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>品目分類ＣＤ６</td>
 *  	<td>Item classification cd. 6</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>itm_grp_nm6</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>品目分類名６</td>
 *  	<td>Item classification name 6</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>itm_grp_nm6_lcl1</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>品目分類名６（ロケール１）</td>
 *  	<td>Item classification name 6 (Locale1)</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>itm_grp_nm6_lcl2</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>品目分類名６（ロケール２）</td>
 *  	<td>Item classification name 6 (Locale2)</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>itm_grp_nm6_lcl3</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>品目分類名６（ロケール３）</td>
 *  	<td>Item classification name 6 (Locale3)</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>itm_grp_nm6_lcl4</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>品目分類名６（ロケール４）</td>
 *  	<td>Item classification name 6 (Locale4)</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>itm_grp_nm6_lcl5</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>品目分類名６（ロケール５）</td>
 *  	<td>Item classification name 6 (Locale5)</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>itm_grp_cd7</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>品目分類ＣＤ７</td>
 *  	<td>Item classification cd. 7</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>itm_grp_nm7</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>品目分類名７</td>
 *  	<td>Item classification name 7</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>itm_grp_nm7_lcl1</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>品目分類名７（ロケール１）</td>
 *  	<td>Item classification name 7 (Locale1)</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>itm_grp_nm7_lcl2</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>品目分類名７（ロケール２）</td>
 *  	<td>Item classification name 7 (Locale2)</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>itm_grp_nm7_lcl3</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>品目分類名７（ロケール３）</td>
 *  	<td>Item classification name 7 (Locale3)</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>itm_grp_nm7_lcl4</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>品目分類名７（ロケール４）</td>
 *  	<td>Item classification name 7 (Locale4)</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>itm_grp_nm7_lcl5</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>品目分類名７（ロケール５）</td>
 *  	<td>Item classification name 7 (Locale5)</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>itm_grp_cd8</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>品目分類ＣＤ８</td>
 *  	<td>Item classification cd. 8</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>itm_grp_nm8</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>品目分類名８</td>
 *  	<td>Item classification name 8</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>itm_grp_nm8_lcl1</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>品目分類名８（ロケール１）</td>
 *  	<td>Item classification name 8 (Locale1)</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>itm_grp_nm8_lcl2</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>品目分類名８（ロケール２）</td>
 *  	<td>Item classification name 8 (Locale2)</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>itm_grp_nm8_lcl3</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>品目分類名８（ロケール３）</td>
 *  	<td>Item classification name 8 (Locale3)</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>itm_grp_nm8_lcl4</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>品目分類名８（ロケール４）</td>
 *  	<td>Item classification name 8 (Locale4)</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>itm_grp_nm8_lcl5</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>品目分類名８（ロケール５）</td>
 *  	<td>Item classification name 8 (Locale5)</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>itm_grp_cd9</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>品目分類ＣＤ９</td>
 *  	<td>Item classification cd. 9</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>itm_grp_nm9</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>品目分類名９</td>
 *  	<td>Item classification name 9</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>itm_grp_nm9_lcl1</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>品目分類名９（ロケール１）</td>
 *  	<td>Item classification name 9 (Locale1)</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>itm_grp_nm9_lcl2</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>品目分類名９（ロケール２）</td>
 *  	<td>Item classification name 9 (Locale2)</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>itm_grp_nm9_lcl3</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>品目分類名９（ロケール３）</td>
 *  	<td>Item classification name 9 (Locale3)</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>itm_grp_nm9_lcl4</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>品目分類名９（ロケール４）</td>
 *  	<td>Item classification name 9 (Locale4)</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>itm_grp_nm9_lcl5</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>品目分類名９（ロケール５）</td>
 *  	<td>Item classification name 9 (Locale5)</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>itm_grp_cd10</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>品目分類ＣＤ１０</td>
 *  	<td>Item classification cd. 10</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>itm_grp_nm10</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>品目分類名１０</td>
 *  	<td>Item classification name 10</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>itm_grp_nm10_lcl1</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>品目分類名１０（ロケール１）</td>
 *  	<td>Item classification name 10 (Locale1)</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>itm_grp_nm10_lcl2</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>品目分類名１０（ロケール２）</td>
 *  	<td>Item classification name 10 (Locale2)</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>itm_grp_nm10_lcl3</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>品目分類名１０（ロケール３）</td>
 *  	<td>Item classification name 10 (Locale3)</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>itm_grp_nm10_lcl4</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>品目分類名１０（ロケール４）</td>
 *  	<td>Item classification name 10 (Locale4)</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>itm_grp_nm10_lcl5</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>品目分類名１０（ロケール５）</td>
 *  	<td>Item classification name 10 (Locale5)</td>
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
public class MAVM_ITM_IF_ALL_R extends MCDBContainer {

	public static final MCTableType TABLE_TYPE = MCTableType.VIEW;

	public static final String TABLE_NAME = "MAVM_ITM_IF_ALL";

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
	 * 品目名. Item name.<p>
	 *
	 */
	public static final String $itm_nm = "itm_nm";
	private static final MCPermColumnInfo _itm_nm = createColumnInfo("itm_nm");
	public final MCStringPermColumn itm_nm = createStringColumn(_itm_nm);
	
	/**
	 * 品目名（ロケール１）. Item name (Locale1).<p>
	 *
	 */
	public static final String $itm_nm_lcl1 = "itm_nm_lcl1";
	private static final MCPermColumnInfo _itm_nm_lcl1 = createColumnInfo("itm_nm_lcl1");
	public final MCStringPermColumn itm_nm_lcl1 = createStringColumn(_itm_nm_lcl1);
	
	/**
	 * 品目名（ロケール２）. Item name (Locale2).<p>
	 *
	 */
	public static final String $itm_nm_lcl2 = "itm_nm_lcl2";
	private static final MCPermColumnInfo _itm_nm_lcl2 = createColumnInfo("itm_nm_lcl2");
	public final MCStringPermColumn itm_nm_lcl2 = createStringColumn(_itm_nm_lcl2);
	
	/**
	 * 品目名（ロケール３）. Item name (Locale3).<p>
	 *
	 */
	public static final String $itm_nm_lcl3 = "itm_nm_lcl3";
	private static final MCPermColumnInfo _itm_nm_lcl3 = createColumnInfo("itm_nm_lcl3");
	public final MCStringPermColumn itm_nm_lcl3 = createStringColumn(_itm_nm_lcl3);
	
	/**
	 * 品目名（ロケール４）. Item name (Locale4).<p>
	 *
	 */
	public static final String $itm_nm_lcl4 = "itm_nm_lcl4";
	private static final MCPermColumnInfo _itm_nm_lcl4 = createColumnInfo("itm_nm_lcl4");
	public final MCStringPermColumn itm_nm_lcl4 = createStringColumn(_itm_nm_lcl4);
	
	/**
	 * 品目名（ロケール５）. Item name (Locale5).<p>
	 *
	 */
	public static final String $itm_nm_lcl5 = "itm_nm_lcl5";
	private static final MCPermColumnInfo _itm_nm_lcl5 = createColumnInfo("itm_nm_lcl5");
	public final MCStringPermColumn itm_nm_lcl5 = createStringColumn(_itm_nm_lcl5);
	
	/**
	 * 単位名. Unit name.<p>
	 *
	 */
	public static final String $unit_nm = "unit_nm";
	private static final MCPermColumnInfo _unit_nm = createColumnInfo("unit_nm");
	public final MCStringPermColumn unit_nm = createStringColumn(_unit_nm);
	
	/**
	 * 単位名（ロケール１）. Unit name (Locale 1).<p>
	 *
	 */
	public static final String $unit_nm_lcl1 = "unit_nm_lcl1";
	private static final MCPermColumnInfo _unit_nm_lcl1 = createColumnInfo("unit_nm_lcl1");
	public final MCStringPermColumn unit_nm_lcl1 = createStringColumn(_unit_nm_lcl1);
	
	/**
	 * 単位名（ロケール２）. Unit name (Locale 2).<p>
	 *
	 */
	public static final String $unit_nm_lcl2 = "unit_nm_lcl2";
	private static final MCPermColumnInfo _unit_nm_lcl2 = createColumnInfo("unit_nm_lcl2");
	public final MCStringPermColumn unit_nm_lcl2 = createStringColumn(_unit_nm_lcl2);
	
	/**
	 * 単位名（ロケール３）. Unit name (Locale 3).<p>
	 *
	 */
	public static final String $unit_nm_lcl3 = "unit_nm_lcl3";
	private static final MCPermColumnInfo _unit_nm_lcl3 = createColumnInfo("unit_nm_lcl3");
	public final MCStringPermColumn unit_nm_lcl3 = createStringColumn(_unit_nm_lcl3);
	
	/**
	 * 単位名（ロケール４）. Unit name (Locale 4).<p>
	 *
	 */
	public static final String $unit_nm_lcl4 = "unit_nm_lcl4";
	private static final MCPermColumnInfo _unit_nm_lcl4 = createColumnInfo("unit_nm_lcl4");
	public final MCStringPermColumn unit_nm_lcl4 = createStringColumn(_unit_nm_lcl4);
	
	/**
	 * 単位名（ロケール５）. Unit name (Locale 5).<p>
	 *
	 */
	public static final String $unit_nm_lcl5 = "unit_nm_lcl5";
	private static final MCPermColumnInfo _unit_nm_lcl5 = createColumnInfo("unit_nm_lcl5");
	public final MCStringPermColumn unit_nm_lcl5 = createStringColumn(_unit_nm_lcl5);
	
	/**
	 * 品目区分名. Item type name.<p>
	 *
	 */
	public static final String $itm_typ_nm = "itm_typ_nm";
	private static final MCPermColumnInfo _itm_typ_nm = createColumnInfo("itm_typ_nm");
	public final MCStringPermColumn itm_typ_nm = createStringColumn(_itm_typ_nm);
	
	/**
	 * 品目区分名（ロケール１）. Item type name (Locale1).<p>
	 *
	 */
	public static final String $itm_typ_nm_lcl1 = "itm_typ_nm_lcl1";
	private static final MCPermColumnInfo _itm_typ_nm_lcl1 = createColumnInfo("itm_typ_nm_lcl1");
	public final MCStringPermColumn itm_typ_nm_lcl1 = createStringColumn(_itm_typ_nm_lcl1);
	
	/**
	 * 品目区分名（ロケール２）. Item type name (Locale2).<p>
	 *
	 */
	public static final String $itm_typ_nm_lcl2 = "itm_typ_nm_lcl2";
	private static final MCPermColumnInfo _itm_typ_nm_lcl2 = createColumnInfo("itm_typ_nm_lcl2");
	public final MCStringPermColumn itm_typ_nm_lcl2 = createStringColumn(_itm_typ_nm_lcl2);
	
	/**
	 * 品目区分名（ロケール３）. Item type name (Locale3).<p>
	 *
	 */
	public static final String $itm_typ_nm_lcl3 = "itm_typ_nm_lcl3";
	private static final MCPermColumnInfo _itm_typ_nm_lcl3 = createColumnInfo("itm_typ_nm_lcl3");
	public final MCStringPermColumn itm_typ_nm_lcl3 = createStringColumn(_itm_typ_nm_lcl3);
	
	/**
	 * 品目区分名（ロケール４）. Item type name (Locale4).<p>
	 *
	 */
	public static final String $itm_typ_nm_lcl4 = "itm_typ_nm_lcl4";
	private static final MCPermColumnInfo _itm_typ_nm_lcl4 = createColumnInfo("itm_typ_nm_lcl4");
	public final MCStringPermColumn itm_typ_nm_lcl4 = createStringColumn(_itm_typ_nm_lcl4);
	
	/**
	 * 品目区分名（ロケール５）. Item type name (Locale5).<p>
	 *
	 */
	public static final String $itm_typ_nm_lcl5 = "itm_typ_nm_lcl5";
	private static final MCPermColumnInfo _itm_typ_nm_lcl5 = createColumnInfo("itm_typ_nm_lcl5");
	public final MCStringPermColumn itm_typ_nm_lcl5 = createStringColumn(_itm_typ_nm_lcl5);
	
	/**
	 * 品目区分詳細名. Item type details name.<p>
	 *
	 */
	public static final String $itm_typ_d_nm = "itm_typ_d_nm";
	private static final MCPermColumnInfo _itm_typ_d_nm = createColumnInfo("itm_typ_d_nm");
	public final MCStringPermColumn itm_typ_d_nm = createStringColumn(_itm_typ_d_nm);
	
	/**
	 * 品目区分詳細名（ロケール１）. Item type details name (Locale1).<p>
	 *
	 */
	public static final String $itm_typ_d_nm_lcl1 = "itm_typ_d_nm_lcl1";
	private static final MCPermColumnInfo _itm_typ_d_nm_lcl1 = createColumnInfo("itm_typ_d_nm_lcl1");
	public final MCStringPermColumn itm_typ_d_nm_lcl1 = createStringColumn(_itm_typ_d_nm_lcl1);
	
	/**
	 * 品目区分詳細名（ロケール２）. Item type details name (Locale2).<p>
	 *
	 */
	public static final String $itm_typ_d_nm_lcl2 = "itm_typ_d_nm_lcl2";
	private static final MCPermColumnInfo _itm_typ_d_nm_lcl2 = createColumnInfo("itm_typ_d_nm_lcl2");
	public final MCStringPermColumn itm_typ_d_nm_lcl2 = createStringColumn(_itm_typ_d_nm_lcl2);
	
	/**
	 * 品目区分詳細名（ロケール３）. Item type details name (Locale3).<p>
	 *
	 */
	public static final String $itm_typ_d_nm_lcl3 = "itm_typ_d_nm_lcl3";
	private static final MCPermColumnInfo _itm_typ_d_nm_lcl3 = createColumnInfo("itm_typ_d_nm_lcl3");
	public final MCStringPermColumn itm_typ_d_nm_lcl3 = createStringColumn(_itm_typ_d_nm_lcl3);
	
	/**
	 * 品目区分詳細名（ロケール４）. Item type details name (Locale4).<p>
	 *
	 */
	public static final String $itm_typ_d_nm_lcl4 = "itm_typ_d_nm_lcl4";
	private static final MCPermColumnInfo _itm_typ_d_nm_lcl4 = createColumnInfo("itm_typ_d_nm_lcl4");
	public final MCStringPermColumn itm_typ_d_nm_lcl4 = createStringColumn(_itm_typ_d_nm_lcl4);
	
	/**
	 * 品目区分詳細名（ロケール５）. Item type details name (Locale5).<p>
	 *
	 */
	public static final String $itm_typ_d_nm_lcl5 = "itm_typ_d_nm_lcl5";
	private static final MCPermColumnInfo _itm_typ_d_nm_lcl5 = createColumnInfo("itm_typ_d_nm_lcl5");
	public final MCStringPermColumn itm_typ_d_nm_lcl5 = createStringColumn(_itm_typ_d_nm_lcl5);
	
	/**
	 * 品目仕訳名. Item journal name.<p>
	 *
	 */
	public static final String $itm_jnl_nm = "itm_jnl_nm";
	private static final MCPermColumnInfo _itm_jnl_nm = createColumnInfo("itm_jnl_nm");
	public final MCStringPermColumn itm_jnl_nm = createStringColumn(_itm_jnl_nm);
	
	/**
	 * 品目仕訳名（ロケール１）. Item journal name (Locale1).<p>
	 *
	 */
	public static final String $itm_jnl_nm_lcl1 = "itm_jnl_nm_lcl1";
	private static final MCPermColumnInfo _itm_jnl_nm_lcl1 = createColumnInfo("itm_jnl_nm_lcl1");
	public final MCStringPermColumn itm_jnl_nm_lcl1 = createStringColumn(_itm_jnl_nm_lcl1);
	
	/**
	 * 品目仕訳名（ロケール２）. Item journal name (Locale2).<p>
	 *
	 */
	public static final String $itm_jnl_nm_lcl2 = "itm_jnl_nm_lcl2";
	private static final MCPermColumnInfo _itm_jnl_nm_lcl2 = createColumnInfo("itm_jnl_nm_lcl2");
	public final MCStringPermColumn itm_jnl_nm_lcl2 = createStringColumn(_itm_jnl_nm_lcl2);
	
	/**
	 * 品目仕訳名（ロケール３）. Item journal name (Locale3).<p>
	 *
	 */
	public static final String $itm_jnl_nm_lcl3 = "itm_jnl_nm_lcl3";
	private static final MCPermColumnInfo _itm_jnl_nm_lcl3 = createColumnInfo("itm_jnl_nm_lcl3");
	public final MCStringPermColumn itm_jnl_nm_lcl3 = createStringColumn(_itm_jnl_nm_lcl3);
	
	/**
	 * 品目仕訳名（ロケール４）. Item journal name (Locale4).<p>
	 *
	 */
	public static final String $itm_jnl_nm_lcl4 = "itm_jnl_nm_lcl4";
	private static final MCPermColumnInfo _itm_jnl_nm_lcl4 = createColumnInfo("itm_jnl_nm_lcl4");
	public final MCStringPermColumn itm_jnl_nm_lcl4 = createStringColumn(_itm_jnl_nm_lcl4);
	
	/**
	 * 品目仕訳名（ロケール５）. Item journal name (Locale5).<p>
	 *
	 */
	public static final String $itm_jnl_nm_lcl5 = "itm_jnl_nm_lcl5";
	private static final MCPermColumnInfo _itm_jnl_nm_lcl5 = createColumnInfo("itm_jnl_nm_lcl5");
	public final MCStringPermColumn itm_jnl_nm_lcl5 = createStringColumn(_itm_jnl_nm_lcl5);
	
	/**
	 * 会計品目分類名. Accounting item classification name.<p>
	 *
	 */
	public static final String $ac_itm_grp_nm = "ac_itm_grp_nm";
	private static final MCPermColumnInfo _ac_itm_grp_nm = createColumnInfo("ac_itm_grp_nm");
	public final MCStringPermColumn ac_itm_grp_nm = createStringColumn(_ac_itm_grp_nm);
	
	/**
	 * 会計品目分類名（ロケール１）. Accounting item classification name (Locale1).<p>
	 *
	 */
	public static final String $ac_itm_grp_nm_lcl1 = "ac_itm_grp_nm_lcl1";
	private static final MCPermColumnInfo _ac_itm_grp_nm_lcl1 = createColumnInfo("ac_itm_grp_nm_lcl1");
	public final MCStringPermColumn ac_itm_grp_nm_lcl1 = createStringColumn(_ac_itm_grp_nm_lcl1);
	
	/**
	 * 会計品目分類名（ロケール２）. Accounting item classification name (Locale2).<p>
	 *
	 */
	public static final String $ac_itm_grp_nm_lcl2 = "ac_itm_grp_nm_lcl2";
	private static final MCPermColumnInfo _ac_itm_grp_nm_lcl2 = createColumnInfo("ac_itm_grp_nm_lcl2");
	public final MCStringPermColumn ac_itm_grp_nm_lcl2 = createStringColumn(_ac_itm_grp_nm_lcl2);
	
	/**
	 * 会計品目分類名（ロケール３）. Accounting item classification name (Locale3).<p>
	 *
	 */
	public static final String $ac_itm_grp_nm_lcl3 = "ac_itm_grp_nm_lcl3";
	private static final MCPermColumnInfo _ac_itm_grp_nm_lcl3 = createColumnInfo("ac_itm_grp_nm_lcl3");
	public final MCStringPermColumn ac_itm_grp_nm_lcl3 = createStringColumn(_ac_itm_grp_nm_lcl3);
	
	/**
	 * 会計品目分類名（ロケール４）. Accounting item classification name (Locale4).<p>
	 *
	 */
	public static final String $ac_itm_grp_nm_lcl4 = "ac_itm_grp_nm_lcl4";
	private static final MCPermColumnInfo _ac_itm_grp_nm_lcl4 = createColumnInfo("ac_itm_grp_nm_lcl4");
	public final MCStringPermColumn ac_itm_grp_nm_lcl4 = createStringColumn(_ac_itm_grp_nm_lcl4);
	
	/**
	 * 会計品目分類名（ロケール５）. Accounting item classification name (Locale5).<p>
	 *
	 */
	public static final String $ac_itm_grp_nm_lcl5 = "ac_itm_grp_nm_lcl5";
	private static final MCPermColumnInfo _ac_itm_grp_nm_lcl5 = createColumnInfo("ac_itm_grp_nm_lcl5");
	public final MCStringPermColumn ac_itm_grp_nm_lcl5 = createStringColumn(_ac_itm_grp_nm_lcl5);
	
	/**
	 * 品目分類ＣＤ１. Item classification cd. 1.<p>
	 *
	 */
	public static final String $itm_grp_cd1 = "itm_grp_cd1";
	private static final MCPermColumnInfo _itm_grp_cd1 = createColumnInfo("itm_grp_cd1");
	public final MCStringPermColumn itm_grp_cd1 = createStringColumn(_itm_grp_cd1);
	
	/**
	 * 品目分類名１. Item classification name 1.<p>
	 *
	 */
	public static final String $itm_grp_nm1 = "itm_grp_nm1";
	private static final MCPermColumnInfo _itm_grp_nm1 = createColumnInfo("itm_grp_nm1");
	public final MCStringPermColumn itm_grp_nm1 = createStringColumn(_itm_grp_nm1);
	
	/**
	 * 品目分類名１（ロケール１）. Item classification name 1 (Locale1).<p>
	 *
	 */
	public static final String $itm_grp_nm1_lcl1 = "itm_grp_nm1_lcl1";
	private static final MCPermColumnInfo _itm_grp_nm1_lcl1 = createColumnInfo("itm_grp_nm1_lcl1");
	public final MCStringPermColumn itm_grp_nm1_lcl1 = createStringColumn(_itm_grp_nm1_lcl1);
	
	/**
	 * 品目分類名１（ロケール２）. Item classification name 1 (Locale2).<p>
	 *
	 */
	public static final String $itm_grp_nm1_lcl2 = "itm_grp_nm1_lcl2";
	private static final MCPermColumnInfo _itm_grp_nm1_lcl2 = createColumnInfo("itm_grp_nm1_lcl2");
	public final MCStringPermColumn itm_grp_nm1_lcl2 = createStringColumn(_itm_grp_nm1_lcl2);
	
	/**
	 * 品目分類名１（ロケール３）. Item classification name 1 (Locale3).<p>
	 *
	 */
	public static final String $itm_grp_nm1_lcl3 = "itm_grp_nm1_lcl3";
	private static final MCPermColumnInfo _itm_grp_nm1_lcl3 = createColumnInfo("itm_grp_nm1_lcl3");
	public final MCStringPermColumn itm_grp_nm1_lcl3 = createStringColumn(_itm_grp_nm1_lcl3);
	
	/**
	 * 品目分類名１（ロケール４）. Item classification name 1 (Locale4).<p>
	 *
	 */
	public static final String $itm_grp_nm1_lcl4 = "itm_grp_nm1_lcl4";
	private static final MCPermColumnInfo _itm_grp_nm1_lcl4 = createColumnInfo("itm_grp_nm1_lcl4");
	public final MCStringPermColumn itm_grp_nm1_lcl4 = createStringColumn(_itm_grp_nm1_lcl4);
	
	/**
	 * 品目分類名１（ロケール５）. Item classification name 1 (Locale5).<p>
	 *
	 */
	public static final String $itm_grp_nm1_lcl5 = "itm_grp_nm1_lcl5";
	private static final MCPermColumnInfo _itm_grp_nm1_lcl5 = createColumnInfo("itm_grp_nm1_lcl5");
	public final MCStringPermColumn itm_grp_nm1_lcl5 = createStringColumn(_itm_grp_nm1_lcl5);
	
	/**
	 * 品目分類ＣＤ２. Item classification cd. 2.<p>
	 *
	 */
	public static final String $itm_grp_cd2 = "itm_grp_cd2";
	private static final MCPermColumnInfo _itm_grp_cd2 = createColumnInfo("itm_grp_cd2");
	public final MCStringPermColumn itm_grp_cd2 = createStringColumn(_itm_grp_cd2);
	
	/**
	 * 品目分類名２. Item classification name 2.<p>
	 *
	 */
	public static final String $itm_grp_nm2 = "itm_grp_nm2";
	private static final MCPermColumnInfo _itm_grp_nm2 = createColumnInfo("itm_grp_nm2");
	public final MCStringPermColumn itm_grp_nm2 = createStringColumn(_itm_grp_nm2);
	
	/**
	 * 品目分類名２（ロケール１）. Item classification name 2 (Locale1).<p>
	 *
	 */
	public static final String $itm_grp_nm2_lcl1 = "itm_grp_nm2_lcl1";
	private static final MCPermColumnInfo _itm_grp_nm2_lcl1 = createColumnInfo("itm_grp_nm2_lcl1");
	public final MCStringPermColumn itm_grp_nm2_lcl1 = createStringColumn(_itm_grp_nm2_lcl1);
	
	/**
	 * 品目分類名２（ロケール２）. Item classification name 2 (Locale2).<p>
	 *
	 */
	public static final String $itm_grp_nm2_lcl2 = "itm_grp_nm2_lcl2";
	private static final MCPermColumnInfo _itm_grp_nm2_lcl2 = createColumnInfo("itm_grp_nm2_lcl2");
	public final MCStringPermColumn itm_grp_nm2_lcl2 = createStringColumn(_itm_grp_nm2_lcl2);
	
	/**
	 * 品目分類名２（ロケール３）. Item classification name 2 (Locale3).<p>
	 *
	 */
	public static final String $itm_grp_nm2_lcl3 = "itm_grp_nm2_lcl3";
	private static final MCPermColumnInfo _itm_grp_nm2_lcl3 = createColumnInfo("itm_grp_nm2_lcl3");
	public final MCStringPermColumn itm_grp_nm2_lcl3 = createStringColumn(_itm_grp_nm2_lcl3);
	
	/**
	 * 品目分類名２（ロケール４）. Item classification name 2 (Locale4).<p>
	 *
	 */
	public static final String $itm_grp_nm2_lcl4 = "itm_grp_nm2_lcl4";
	private static final MCPermColumnInfo _itm_grp_nm2_lcl4 = createColumnInfo("itm_grp_nm2_lcl4");
	public final MCStringPermColumn itm_grp_nm2_lcl4 = createStringColumn(_itm_grp_nm2_lcl4);
	
	/**
	 * 品目分類名２（ロケール５）. Item classification name 2 (Locale5).<p>
	 *
	 */
	public static final String $itm_grp_nm2_lcl5 = "itm_grp_nm2_lcl5";
	private static final MCPermColumnInfo _itm_grp_nm2_lcl5 = createColumnInfo("itm_grp_nm2_lcl5");
	public final MCStringPermColumn itm_grp_nm2_lcl5 = createStringColumn(_itm_grp_nm2_lcl5);
	
	/**
	 * 品目分類ＣＤ３. Item classification cd. 3.<p>
	 *
	 */
	public static final String $itm_grp_cd3 = "itm_grp_cd3";
	private static final MCPermColumnInfo _itm_grp_cd3 = createColumnInfo("itm_grp_cd3");
	public final MCStringPermColumn itm_grp_cd3 = createStringColumn(_itm_grp_cd3);
	
	/**
	 * 品目分類名３. Item classification name 3.<p>
	 *
	 */
	public static final String $itm_grp_nm3 = "itm_grp_nm3";
	private static final MCPermColumnInfo _itm_grp_nm3 = createColumnInfo("itm_grp_nm3");
	public final MCStringPermColumn itm_grp_nm3 = createStringColumn(_itm_grp_nm3);
	
	/**
	 * 品目分類名３（ロケール１）. Item classification name 3 (Locale1).<p>
	 *
	 */
	public static final String $itm_grp_nm3_lcl1 = "itm_grp_nm3_lcl1";
	private static final MCPermColumnInfo _itm_grp_nm3_lcl1 = createColumnInfo("itm_grp_nm3_lcl1");
	public final MCStringPermColumn itm_grp_nm3_lcl1 = createStringColumn(_itm_grp_nm3_lcl1);
	
	/**
	 * 品目分類名３（ロケール２）. Item classification name 3 (Locale2).<p>
	 *
	 */
	public static final String $itm_grp_nm3_lcl2 = "itm_grp_nm3_lcl2";
	private static final MCPermColumnInfo _itm_grp_nm3_lcl2 = createColumnInfo("itm_grp_nm3_lcl2");
	public final MCStringPermColumn itm_grp_nm3_lcl2 = createStringColumn(_itm_grp_nm3_lcl2);
	
	/**
	 * 品目分類名３（ロケール３）. Item classification name 3 (Locale3).<p>
	 *
	 */
	public static final String $itm_grp_nm3_lcl3 = "itm_grp_nm3_lcl3";
	private static final MCPermColumnInfo _itm_grp_nm3_lcl3 = createColumnInfo("itm_grp_nm3_lcl3");
	public final MCStringPermColumn itm_grp_nm3_lcl3 = createStringColumn(_itm_grp_nm3_lcl3);
	
	/**
	 * 品目分類名３（ロケール４）. Item classification name 3 (Locale4).<p>
	 *
	 */
	public static final String $itm_grp_nm3_lcl4 = "itm_grp_nm3_lcl4";
	private static final MCPermColumnInfo _itm_grp_nm3_lcl4 = createColumnInfo("itm_grp_nm3_lcl4");
	public final MCStringPermColumn itm_grp_nm3_lcl4 = createStringColumn(_itm_grp_nm3_lcl4);
	
	/**
	 * 品目分類名３（ロケール５）. Item classification name 3 (Locale5).<p>
	 *
	 */
	public static final String $itm_grp_nm3_lcl5 = "itm_grp_nm3_lcl5";
	private static final MCPermColumnInfo _itm_grp_nm3_lcl5 = createColumnInfo("itm_grp_nm3_lcl5");
	public final MCStringPermColumn itm_grp_nm3_lcl5 = createStringColumn(_itm_grp_nm3_lcl5);
	
	/**
	 * 品目分類ＣＤ４. Item classification cd. 4.<p>
	 *
	 */
	public static final String $itm_grp_cd4 = "itm_grp_cd4";
	private static final MCPermColumnInfo _itm_grp_cd4 = createColumnInfo("itm_grp_cd4");
	public final MCStringPermColumn itm_grp_cd4 = createStringColumn(_itm_grp_cd4);
	
	/**
	 * 品目分類名４. Item classification name 4.<p>
	 *
	 */
	public static final String $itm_grp_nm4 = "itm_grp_nm4";
	private static final MCPermColumnInfo _itm_grp_nm4 = createColumnInfo("itm_grp_nm4");
	public final MCStringPermColumn itm_grp_nm4 = createStringColumn(_itm_grp_nm4);
	
	/**
	 * 品目分類名４（ロケール１）. Item classification name 4 (Locale1).<p>
	 *
	 */
	public static final String $itm_grp_nm4_lcl1 = "itm_grp_nm4_lcl1";
	private static final MCPermColumnInfo _itm_grp_nm4_lcl1 = createColumnInfo("itm_grp_nm4_lcl1");
	public final MCStringPermColumn itm_grp_nm4_lcl1 = createStringColumn(_itm_grp_nm4_lcl1);
	
	/**
	 * 品目分類名４（ロケール２）. Item classification name 4 (Locale2).<p>
	 *
	 */
	public static final String $itm_grp_nm4_lcl2 = "itm_grp_nm4_lcl2";
	private static final MCPermColumnInfo _itm_grp_nm4_lcl2 = createColumnInfo("itm_grp_nm4_lcl2");
	public final MCStringPermColumn itm_grp_nm4_lcl2 = createStringColumn(_itm_grp_nm4_lcl2);
	
	/**
	 * 品目分類名４（ロケール３）. Item classification name 4 (Locale3).<p>
	 *
	 */
	public static final String $itm_grp_nm4_lcl3 = "itm_grp_nm4_lcl3";
	private static final MCPermColumnInfo _itm_grp_nm4_lcl3 = createColumnInfo("itm_grp_nm4_lcl3");
	public final MCStringPermColumn itm_grp_nm4_lcl3 = createStringColumn(_itm_grp_nm4_lcl3);
	
	/**
	 * 品目分類名４（ロケール４）. Item classification name 4 (Locale4).<p>
	 *
	 */
	public static final String $itm_grp_nm4_lcl4 = "itm_grp_nm4_lcl4";
	private static final MCPermColumnInfo _itm_grp_nm4_lcl4 = createColumnInfo("itm_grp_nm4_lcl4");
	public final MCStringPermColumn itm_grp_nm4_lcl4 = createStringColumn(_itm_grp_nm4_lcl4);
	
	/**
	 * 品目分類名４（ロケール５）. Item classification name 4 (Locale5).<p>
	 *
	 */
	public static final String $itm_grp_nm4_lcl5 = "itm_grp_nm4_lcl5";
	private static final MCPermColumnInfo _itm_grp_nm4_lcl5 = createColumnInfo("itm_grp_nm4_lcl5");
	public final MCStringPermColumn itm_grp_nm4_lcl5 = createStringColumn(_itm_grp_nm4_lcl5);
	
	/**
	 * 品目分類ＣＤ５. Item classification cd. 5.<p>
	 *
	 */
	public static final String $itm_grp_cd5 = "itm_grp_cd5";
	private static final MCPermColumnInfo _itm_grp_cd5 = createColumnInfo("itm_grp_cd5");
	public final MCStringPermColumn itm_grp_cd5 = createStringColumn(_itm_grp_cd5);
	
	/**
	 * 品目分類名５. Item classification name 5.<p>
	 *
	 */
	public static final String $itm_grp_nm5 = "itm_grp_nm5";
	private static final MCPermColumnInfo _itm_grp_nm5 = createColumnInfo("itm_grp_nm5");
	public final MCStringPermColumn itm_grp_nm5 = createStringColumn(_itm_grp_nm5);
	
	/**
	 * 品目分類名５（ロケール１）. Item classification name 5 (Locale1).<p>
	 *
	 */
	public static final String $itm_grp_nm5_lcl1 = "itm_grp_nm5_lcl1";
	private static final MCPermColumnInfo _itm_grp_nm5_lcl1 = createColumnInfo("itm_grp_nm5_lcl1");
	public final MCStringPermColumn itm_grp_nm5_lcl1 = createStringColumn(_itm_grp_nm5_lcl1);
	
	/**
	 * 品目分類名５（ロケール２）. Item classification name 5 (Locale2).<p>
	 *
	 */
	public static final String $itm_grp_nm5_lcl2 = "itm_grp_nm5_lcl2";
	private static final MCPermColumnInfo _itm_grp_nm5_lcl2 = createColumnInfo("itm_grp_nm5_lcl2");
	public final MCStringPermColumn itm_grp_nm5_lcl2 = createStringColumn(_itm_grp_nm5_lcl2);
	
	/**
	 * 品目分類名５（ロケール３）. Item classification name 5 (Locale3).<p>
	 *
	 */
	public static final String $itm_grp_nm5_lcl3 = "itm_grp_nm5_lcl3";
	private static final MCPermColumnInfo _itm_grp_nm5_lcl3 = createColumnInfo("itm_grp_nm5_lcl3");
	public final MCStringPermColumn itm_grp_nm5_lcl3 = createStringColumn(_itm_grp_nm5_lcl3);
	
	/**
	 * 品目分類名５（ロケール４）. Item classification name 5 (Locale4).<p>
	 *
	 */
	public static final String $itm_grp_nm5_lcl4 = "itm_grp_nm5_lcl4";
	private static final MCPermColumnInfo _itm_grp_nm5_lcl4 = createColumnInfo("itm_grp_nm5_lcl4");
	public final MCStringPermColumn itm_grp_nm5_lcl4 = createStringColumn(_itm_grp_nm5_lcl4);
	
	/**
	 * 品目分類名５（ロケール５）. Item classification name 5 (Locale5).<p>
	 *
	 */
	public static final String $itm_grp_nm5_lcl5 = "itm_grp_nm5_lcl5";
	private static final MCPermColumnInfo _itm_grp_nm5_lcl5 = createColumnInfo("itm_grp_nm5_lcl5");
	public final MCStringPermColumn itm_grp_nm5_lcl5 = createStringColumn(_itm_grp_nm5_lcl5);
	
	/**
	 * 品目分類ＣＤ６. Item classification cd. 6.<p>
	 *
	 */
	public static final String $itm_grp_cd6 = "itm_grp_cd6";
	private static final MCPermColumnInfo _itm_grp_cd6 = createColumnInfo("itm_grp_cd6");
	public final MCStringPermColumn itm_grp_cd6 = createStringColumn(_itm_grp_cd6);
	
	/**
	 * 品目分類名６. Item classification name 6.<p>
	 *
	 */
	public static final String $itm_grp_nm6 = "itm_grp_nm6";
	private static final MCPermColumnInfo _itm_grp_nm6 = createColumnInfo("itm_grp_nm6");
	public final MCStringPermColumn itm_grp_nm6 = createStringColumn(_itm_grp_nm6);
	
	/**
	 * 品目分類名６（ロケール１）. Item classification name 6 (Locale1).<p>
	 *
	 */
	public static final String $itm_grp_nm6_lcl1 = "itm_grp_nm6_lcl1";
	private static final MCPermColumnInfo _itm_grp_nm6_lcl1 = createColumnInfo("itm_grp_nm6_lcl1");
	public final MCStringPermColumn itm_grp_nm6_lcl1 = createStringColumn(_itm_grp_nm6_lcl1);
	
	/**
	 * 品目分類名６（ロケール２）. Item classification name 6 (Locale2).<p>
	 *
	 */
	public static final String $itm_grp_nm6_lcl2 = "itm_grp_nm6_lcl2";
	private static final MCPermColumnInfo _itm_grp_nm6_lcl2 = createColumnInfo("itm_grp_nm6_lcl2");
	public final MCStringPermColumn itm_grp_nm6_lcl2 = createStringColumn(_itm_grp_nm6_lcl2);
	
	/**
	 * 品目分類名６（ロケール３）. Item classification name 6 (Locale3).<p>
	 *
	 */
	public static final String $itm_grp_nm6_lcl3 = "itm_grp_nm6_lcl3";
	private static final MCPermColumnInfo _itm_grp_nm6_lcl3 = createColumnInfo("itm_grp_nm6_lcl3");
	public final MCStringPermColumn itm_grp_nm6_lcl3 = createStringColumn(_itm_grp_nm6_lcl3);
	
	/**
	 * 品目分類名６（ロケール４）. Item classification name 6 (Locale4).<p>
	 *
	 */
	public static final String $itm_grp_nm6_lcl4 = "itm_grp_nm6_lcl4";
	private static final MCPermColumnInfo _itm_grp_nm6_lcl4 = createColumnInfo("itm_grp_nm6_lcl4");
	public final MCStringPermColumn itm_grp_nm6_lcl4 = createStringColumn(_itm_grp_nm6_lcl4);
	
	/**
	 * 品目分類名６（ロケール５）. Item classification name 6 (Locale5).<p>
	 *
	 */
	public static final String $itm_grp_nm6_lcl5 = "itm_grp_nm6_lcl5";
	private static final MCPermColumnInfo _itm_grp_nm6_lcl5 = createColumnInfo("itm_grp_nm6_lcl5");
	public final MCStringPermColumn itm_grp_nm6_lcl5 = createStringColumn(_itm_grp_nm6_lcl5);
	
	/**
	 * 品目分類ＣＤ７. Item classification cd. 7.<p>
	 *
	 */
	public static final String $itm_grp_cd7 = "itm_grp_cd7";
	private static final MCPermColumnInfo _itm_grp_cd7 = createColumnInfo("itm_grp_cd7");
	public final MCStringPermColumn itm_grp_cd7 = createStringColumn(_itm_grp_cd7);
	
	/**
	 * 品目分類名７. Item classification name 7.<p>
	 *
	 */
	public static final String $itm_grp_nm7 = "itm_grp_nm7";
	private static final MCPermColumnInfo _itm_grp_nm7 = createColumnInfo("itm_grp_nm7");
	public final MCStringPermColumn itm_grp_nm7 = createStringColumn(_itm_grp_nm7);
	
	/**
	 * 品目分類名７（ロケール１）. Item classification name 7 (Locale1).<p>
	 *
	 */
	public static final String $itm_grp_nm7_lcl1 = "itm_grp_nm7_lcl1";
	private static final MCPermColumnInfo _itm_grp_nm7_lcl1 = createColumnInfo("itm_grp_nm7_lcl1");
	public final MCStringPermColumn itm_grp_nm7_lcl1 = createStringColumn(_itm_grp_nm7_lcl1);
	
	/**
	 * 品目分類名７（ロケール２）. Item classification name 7 (Locale2).<p>
	 *
	 */
	public static final String $itm_grp_nm7_lcl2 = "itm_grp_nm7_lcl2";
	private static final MCPermColumnInfo _itm_grp_nm7_lcl2 = createColumnInfo("itm_grp_nm7_lcl2");
	public final MCStringPermColumn itm_grp_nm7_lcl2 = createStringColumn(_itm_grp_nm7_lcl2);
	
	/**
	 * 品目分類名７（ロケール３）. Item classification name 7 (Locale3).<p>
	 *
	 */
	public static final String $itm_grp_nm7_lcl3 = "itm_grp_nm7_lcl3";
	private static final MCPermColumnInfo _itm_grp_nm7_lcl3 = createColumnInfo("itm_grp_nm7_lcl3");
	public final MCStringPermColumn itm_grp_nm7_lcl3 = createStringColumn(_itm_grp_nm7_lcl3);
	
	/**
	 * 品目分類名７（ロケール４）. Item classification name 7 (Locale4).<p>
	 *
	 */
	public static final String $itm_grp_nm7_lcl4 = "itm_grp_nm7_lcl4";
	private static final MCPermColumnInfo _itm_grp_nm7_lcl4 = createColumnInfo("itm_grp_nm7_lcl4");
	public final MCStringPermColumn itm_grp_nm7_lcl4 = createStringColumn(_itm_grp_nm7_lcl4);
	
	/**
	 * 品目分類名７（ロケール５）. Item classification name 7 (Locale5).<p>
	 *
	 */
	public static final String $itm_grp_nm7_lcl5 = "itm_grp_nm7_lcl5";
	private static final MCPermColumnInfo _itm_grp_nm7_lcl5 = createColumnInfo("itm_grp_nm7_lcl5");
	public final MCStringPermColumn itm_grp_nm7_lcl5 = createStringColumn(_itm_grp_nm7_lcl5);
	
	/**
	 * 品目分類ＣＤ８. Item classification cd. 8.<p>
	 *
	 */
	public static final String $itm_grp_cd8 = "itm_grp_cd8";
	private static final MCPermColumnInfo _itm_grp_cd8 = createColumnInfo("itm_grp_cd8");
	public final MCStringPermColumn itm_grp_cd8 = createStringColumn(_itm_grp_cd8);
	
	/**
	 * 品目分類名８. Item classification name 8.<p>
	 *
	 */
	public static final String $itm_grp_nm8 = "itm_grp_nm8";
	private static final MCPermColumnInfo _itm_grp_nm8 = createColumnInfo("itm_grp_nm8");
	public final MCStringPermColumn itm_grp_nm8 = createStringColumn(_itm_grp_nm8);
	
	/**
	 * 品目分類名８（ロケール１）. Item classification name 8 (Locale1).<p>
	 *
	 */
	public static final String $itm_grp_nm8_lcl1 = "itm_grp_nm8_lcl1";
	private static final MCPermColumnInfo _itm_grp_nm8_lcl1 = createColumnInfo("itm_grp_nm8_lcl1");
	public final MCStringPermColumn itm_grp_nm8_lcl1 = createStringColumn(_itm_grp_nm8_lcl1);
	
	/**
	 * 品目分類名８（ロケール２）. Item classification name 8 (Locale2).<p>
	 *
	 */
	public static final String $itm_grp_nm8_lcl2 = "itm_grp_nm8_lcl2";
	private static final MCPermColumnInfo _itm_grp_nm8_lcl2 = createColumnInfo("itm_grp_nm8_lcl2");
	public final MCStringPermColumn itm_grp_nm8_lcl2 = createStringColumn(_itm_grp_nm8_lcl2);
	
	/**
	 * 品目分類名８（ロケール３）. Item classification name 8 (Locale3).<p>
	 *
	 */
	public static final String $itm_grp_nm8_lcl3 = "itm_grp_nm8_lcl3";
	private static final MCPermColumnInfo _itm_grp_nm8_lcl3 = createColumnInfo("itm_grp_nm8_lcl3");
	public final MCStringPermColumn itm_grp_nm8_lcl3 = createStringColumn(_itm_grp_nm8_lcl3);
	
	/**
	 * 品目分類名８（ロケール４）. Item classification name 8 (Locale4).<p>
	 *
	 */
	public static final String $itm_grp_nm8_lcl4 = "itm_grp_nm8_lcl4";
	private static final MCPermColumnInfo _itm_grp_nm8_lcl4 = createColumnInfo("itm_grp_nm8_lcl4");
	public final MCStringPermColumn itm_grp_nm8_lcl4 = createStringColumn(_itm_grp_nm8_lcl4);
	
	/**
	 * 品目分類名８（ロケール５）. Item classification name 8 (Locale5).<p>
	 *
	 */
	public static final String $itm_grp_nm8_lcl5 = "itm_grp_nm8_lcl5";
	private static final MCPermColumnInfo _itm_grp_nm8_lcl5 = createColumnInfo("itm_grp_nm8_lcl5");
	public final MCStringPermColumn itm_grp_nm8_lcl5 = createStringColumn(_itm_grp_nm8_lcl5);
	
	/**
	 * 品目分類ＣＤ９. Item classification cd. 9.<p>
	 *
	 */
	public static final String $itm_grp_cd9 = "itm_grp_cd9";
	private static final MCPermColumnInfo _itm_grp_cd9 = createColumnInfo("itm_grp_cd9");
	public final MCStringPermColumn itm_grp_cd9 = createStringColumn(_itm_grp_cd9);
	
	/**
	 * 品目分類名９. Item classification name 9.<p>
	 *
	 */
	public static final String $itm_grp_nm9 = "itm_grp_nm9";
	private static final MCPermColumnInfo _itm_grp_nm9 = createColumnInfo("itm_grp_nm9");
	public final MCStringPermColumn itm_grp_nm9 = createStringColumn(_itm_grp_nm9);
	
	/**
	 * 品目分類名９（ロケール１）. Item classification name 9 (Locale1).<p>
	 *
	 */
	public static final String $itm_grp_nm9_lcl1 = "itm_grp_nm9_lcl1";
	private static final MCPermColumnInfo _itm_grp_nm9_lcl1 = createColumnInfo("itm_grp_nm9_lcl1");
	public final MCStringPermColumn itm_grp_nm9_lcl1 = createStringColumn(_itm_grp_nm9_lcl1);
	
	/**
	 * 品目分類名９（ロケール２）. Item classification name 9 (Locale2).<p>
	 *
	 */
	public static final String $itm_grp_nm9_lcl2 = "itm_grp_nm9_lcl2";
	private static final MCPermColumnInfo _itm_grp_nm9_lcl2 = createColumnInfo("itm_grp_nm9_lcl2");
	public final MCStringPermColumn itm_grp_nm9_lcl2 = createStringColumn(_itm_grp_nm9_lcl2);
	
	/**
	 * 品目分類名９（ロケール３）. Item classification name 9 (Locale3).<p>
	 *
	 */
	public static final String $itm_grp_nm9_lcl3 = "itm_grp_nm9_lcl3";
	private static final MCPermColumnInfo _itm_grp_nm9_lcl3 = createColumnInfo("itm_grp_nm9_lcl3");
	public final MCStringPermColumn itm_grp_nm9_lcl3 = createStringColumn(_itm_grp_nm9_lcl3);
	
	/**
	 * 品目分類名９（ロケール４）. Item classification name 9 (Locale4).<p>
	 *
	 */
	public static final String $itm_grp_nm9_lcl4 = "itm_grp_nm9_lcl4";
	private static final MCPermColumnInfo _itm_grp_nm9_lcl4 = createColumnInfo("itm_grp_nm9_lcl4");
	public final MCStringPermColumn itm_grp_nm9_lcl4 = createStringColumn(_itm_grp_nm9_lcl4);
	
	/**
	 * 品目分類名９（ロケール５）. Item classification name 9 (Locale5).<p>
	 *
	 */
	public static final String $itm_grp_nm9_lcl5 = "itm_grp_nm9_lcl5";
	private static final MCPermColumnInfo _itm_grp_nm9_lcl5 = createColumnInfo("itm_grp_nm9_lcl5");
	public final MCStringPermColumn itm_grp_nm9_lcl5 = createStringColumn(_itm_grp_nm9_lcl5);
	
	/**
	 * 品目分類ＣＤ１０. Item classification cd. 10.<p>
	 *
	 */
	public static final String $itm_grp_cd10 = "itm_grp_cd10";
	private static final MCPermColumnInfo _itm_grp_cd10 = createColumnInfo("itm_grp_cd10");
	public final MCStringPermColumn itm_grp_cd10 = createStringColumn(_itm_grp_cd10);
	
	/**
	 * 品目分類名１０. Item classification name 10.<p>
	 *
	 */
	public static final String $itm_grp_nm10 = "itm_grp_nm10";
	private static final MCPermColumnInfo _itm_grp_nm10 = createColumnInfo("itm_grp_nm10");
	public final MCStringPermColumn itm_grp_nm10 = createStringColumn(_itm_grp_nm10);
	
	/**
	 * 品目分類名１０（ロケール１）. Item classification name 10 (Locale1).<p>
	 *
	 */
	public static final String $itm_grp_nm10_lcl1 = "itm_grp_nm10_lcl1";
	private static final MCPermColumnInfo _itm_grp_nm10_lcl1 = createColumnInfo("itm_grp_nm10_lcl1");
	public final MCStringPermColumn itm_grp_nm10_lcl1 = createStringColumn(_itm_grp_nm10_lcl1);
	
	/**
	 * 品目分類名１０（ロケール２）. Item classification name 10 (Locale2).<p>
	 *
	 */
	public static final String $itm_grp_nm10_lcl2 = "itm_grp_nm10_lcl2";
	private static final MCPermColumnInfo _itm_grp_nm10_lcl2 = createColumnInfo("itm_grp_nm10_lcl2");
	public final MCStringPermColumn itm_grp_nm10_lcl2 = createStringColumn(_itm_grp_nm10_lcl2);
	
	/**
	 * 品目分類名１０（ロケール３）. Item classification name 10 (Locale3).<p>
	 *
	 */
	public static final String $itm_grp_nm10_lcl3 = "itm_grp_nm10_lcl3";
	private static final MCPermColumnInfo _itm_grp_nm10_lcl3 = createColumnInfo("itm_grp_nm10_lcl3");
	public final MCStringPermColumn itm_grp_nm10_lcl3 = createStringColumn(_itm_grp_nm10_lcl3);
	
	/**
	 * 品目分類名１０（ロケール４）. Item classification name 10 (Locale4).<p>
	 *
	 */
	public static final String $itm_grp_nm10_lcl4 = "itm_grp_nm10_lcl4";
	private static final MCPermColumnInfo _itm_grp_nm10_lcl4 = createColumnInfo("itm_grp_nm10_lcl4");
	public final MCStringPermColumn itm_grp_nm10_lcl4 = createStringColumn(_itm_grp_nm10_lcl4);
	
	/**
	 * 品目分類名１０（ロケール５）. Item classification name 10 (Locale5).<p>
	 *
	 */
	public static final String $itm_grp_nm10_lcl5 = "itm_grp_nm10_lcl5";
	private static final MCPermColumnInfo _itm_grp_nm10_lcl5 = createColumnInfo("itm_grp_nm10_lcl5");
	public final MCStringPermColumn itm_grp_nm10_lcl5 = createStringColumn(_itm_grp_nm10_lcl5);
	
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
	public static final MCMeta itm_cd_META = createCommonMeta($itm_cd, mcframe.commonMA.meta.MA_META.ITM_CD);
	public static final MCMeta itm_sub1_META = createCommonMeta($itm_sub1, mcframe.commonMA.meta.MA_META.ITM_SUB1);
	public static final MCMeta itm_sub2_META = createCommonMeta($itm_sub2, mcframe.commonMA.meta.MA_META.ITM_SUB2);
	public static final MCMeta itm_sub3_META = createCommonMeta($itm_sub3, mcframe.commonMA.meta.MA_META.ITM_SUB3);
	public static final MCMeta itm_nm_META = createCommonMeta($itm_nm, mcframe.commonMA.meta.MA_META.ITM_NM);
	public static final MCMeta itm_nm_lcl1_META = createCommonMeta($itm_nm_lcl1, mcframe.commonMA.meta.MA_META.ITM_NM);
	public static final MCMeta itm_nm_lcl2_META = createCommonMeta($itm_nm_lcl2, mcframe.commonMA.meta.MA_META.ITM_NM);
	public static final MCMeta itm_nm_lcl3_META = createCommonMeta($itm_nm_lcl3, mcframe.commonMA.meta.MA_META.ITM_NM);
	public static final MCMeta itm_nm_lcl4_META = createCommonMeta($itm_nm_lcl4, mcframe.commonMA.meta.MA_META.ITM_NM);
	public static final MCMeta itm_nm_lcl5_META = createCommonMeta($itm_nm_lcl5, mcframe.commonMA.meta.MA_META.ITM_NM);
	public static final MCMeta unit_nm_META = createCommonMeta($unit_nm, mcframe.commonMA.meta.MA_META.UNIT_NM);
	public static final MCMeta unit_nm_lcl1_META = createCommonMeta($unit_nm_lcl1, mcframe.commonMA.meta.MA_META.UNIT_NM);
	public static final MCMeta unit_nm_lcl2_META = createCommonMeta($unit_nm_lcl2, mcframe.commonMA.meta.MA_META.UNIT_NM);
	public static final MCMeta unit_nm_lcl3_META = createCommonMeta($unit_nm_lcl3, mcframe.commonMA.meta.MA_META.UNIT_NM);
	public static final MCMeta unit_nm_lcl4_META = createCommonMeta($unit_nm_lcl4, mcframe.commonMA.meta.MA_META.UNIT_NM);
	public static final MCMeta unit_nm_lcl5_META = createCommonMeta($unit_nm_lcl5, mcframe.commonMA.meta.MA_META.UNIT_NM);
	public static final MCMeta itm_typ_nm_META = createCommonMeta($itm_typ_nm, mcframe.commonMA.meta.MA_META.ITM_TYP_NM);
	public static final MCMeta itm_typ_nm_lcl1_META = createCommonMeta($itm_typ_nm_lcl1, mcframe.commonMA.meta.MA_META.ITM_TYP_NM);
	public static final MCMeta itm_typ_nm_lcl2_META = createCommonMeta($itm_typ_nm_lcl2, mcframe.commonMA.meta.MA_META.ITM_TYP_NM);
	public static final MCMeta itm_typ_nm_lcl3_META = createCommonMeta($itm_typ_nm_lcl3, mcframe.commonMA.meta.MA_META.ITM_TYP_NM);
	public static final MCMeta itm_typ_nm_lcl4_META = createCommonMeta($itm_typ_nm_lcl4, mcframe.commonMA.meta.MA_META.ITM_TYP_NM);
	public static final MCMeta itm_typ_nm_lcl5_META = createCommonMeta($itm_typ_nm_lcl5, mcframe.commonMA.meta.MA_META.ITM_TYP_NM);
	public static final MCMeta itm_typ_d_nm_META = createCommonMeta($itm_typ_d_nm, mcframe.commonMA.meta.MA_META.ITM_TYP_D_NM);
	public static final MCMeta itm_typ_d_nm_lcl1_META = createCommonMeta($itm_typ_d_nm_lcl1, mcframe.commonMA.meta.MA_META.ITM_TYP_D_NM);
	public static final MCMeta itm_typ_d_nm_lcl2_META = createCommonMeta($itm_typ_d_nm_lcl2, mcframe.commonMA.meta.MA_META.ITM_TYP_D_NM);
	public static final MCMeta itm_typ_d_nm_lcl3_META = createCommonMeta($itm_typ_d_nm_lcl3, mcframe.commonMA.meta.MA_META.ITM_TYP_D_NM);
	public static final MCMeta itm_typ_d_nm_lcl4_META = createCommonMeta($itm_typ_d_nm_lcl4, mcframe.commonMA.meta.MA_META.ITM_TYP_D_NM);
	public static final MCMeta itm_typ_d_nm_lcl5_META = createCommonMeta($itm_typ_d_nm_lcl5, mcframe.commonMA.meta.MA_META.ITM_TYP_D_NM);
	public static final MCMeta itm_jnl_nm_META = createCommonMeta($itm_jnl_nm, mcframe.commonMA.meta.MA_META.ITM_JNL_NM);
	public static final MCMeta itm_jnl_nm_lcl1_META = createCommonMeta($itm_jnl_nm_lcl1, mcframe.commonMA.meta.MA_META.ITM_JNL_NM);
	public static final MCMeta itm_jnl_nm_lcl2_META = createCommonMeta($itm_jnl_nm_lcl2, mcframe.commonMA.meta.MA_META.ITM_JNL_NM);
	public static final MCMeta itm_jnl_nm_lcl3_META = createCommonMeta($itm_jnl_nm_lcl3, mcframe.commonMA.meta.MA_META.ITM_JNL_NM);
	public static final MCMeta itm_jnl_nm_lcl4_META = createCommonMeta($itm_jnl_nm_lcl4, mcframe.commonMA.meta.MA_META.ITM_JNL_NM);
	public static final MCMeta itm_jnl_nm_lcl5_META = createCommonMeta($itm_jnl_nm_lcl5, mcframe.commonMA.meta.MA_META.ITM_JNL_NM);
	public static final MCMeta ac_itm_grp_nm_META = createCommonMeta($ac_itm_grp_nm, mcframe.commonMA.meta.MA_META.AC_ITM_GRP_NM);
	public static final MCMeta ac_itm_grp_nm_lcl1_META = createCommonMeta($ac_itm_grp_nm_lcl1, mcframe.commonMA.meta.MA_META.AC_ITM_GRP_NM);
	public static final MCMeta ac_itm_grp_nm_lcl2_META = createCommonMeta($ac_itm_grp_nm_lcl2, mcframe.commonMA.meta.MA_META.AC_ITM_GRP_NM);
	public static final MCMeta ac_itm_grp_nm_lcl3_META = createCommonMeta($ac_itm_grp_nm_lcl3, mcframe.commonMA.meta.MA_META.AC_ITM_GRP_NM);
	public static final MCMeta ac_itm_grp_nm_lcl4_META = createCommonMeta($ac_itm_grp_nm_lcl4, mcframe.commonMA.meta.MA_META.AC_ITM_GRP_NM);
	public static final MCMeta ac_itm_grp_nm_lcl5_META = createCommonMeta($ac_itm_grp_nm_lcl5, mcframe.commonMA.meta.MA_META.AC_ITM_GRP_NM);
	public static final MCMeta itm_grp_cd1_META = createCommonMeta($itm_grp_cd1, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta itm_grp_nm1_META = createCommonMeta($itm_grp_nm1, mcframe.commonMA.meta.MA_META.ITM_GRP_NM);
	public static final MCMeta itm_grp_nm1_lcl1_META = createCommonMeta($itm_grp_nm1_lcl1, mcframe.commonMA.meta.MA_META.ITM_GRP_NM);
	public static final MCMeta itm_grp_nm1_lcl2_META = createCommonMeta($itm_grp_nm1_lcl2, mcframe.commonMA.meta.MA_META.ITM_GRP_NM);
	public static final MCMeta itm_grp_nm1_lcl3_META = createCommonMeta($itm_grp_nm1_lcl3, mcframe.commonMA.meta.MA_META.ITM_GRP_NM);
	public static final MCMeta itm_grp_nm1_lcl4_META = createCommonMeta($itm_grp_nm1_lcl4, mcframe.commonMA.meta.MA_META.ITM_GRP_NM);
	public static final MCMeta itm_grp_nm1_lcl5_META = createCommonMeta($itm_grp_nm1_lcl5, mcframe.commonMA.meta.MA_META.ITM_GRP_NM);
	public static final MCMeta itm_grp_cd2_META = createCommonMeta($itm_grp_cd2, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta itm_grp_nm2_META = createCommonMeta($itm_grp_nm2, mcframe.commonMA.meta.MA_META.ITM_GRP_NM);
	public static final MCMeta itm_grp_nm2_lcl1_META = createCommonMeta($itm_grp_nm2_lcl1, mcframe.commonMA.meta.MA_META.ITM_GRP_NM);
	public static final MCMeta itm_grp_nm2_lcl2_META = createCommonMeta($itm_grp_nm2_lcl2, mcframe.commonMA.meta.MA_META.ITM_GRP_NM);
	public static final MCMeta itm_grp_nm2_lcl3_META = createCommonMeta($itm_grp_nm2_lcl3, mcframe.commonMA.meta.MA_META.ITM_GRP_NM);
	public static final MCMeta itm_grp_nm2_lcl4_META = createCommonMeta($itm_grp_nm2_lcl4, mcframe.commonMA.meta.MA_META.ITM_GRP_NM);
	public static final MCMeta itm_grp_nm2_lcl5_META = createCommonMeta($itm_grp_nm2_lcl5, mcframe.commonMA.meta.MA_META.ITM_GRP_NM);
	public static final MCMeta itm_grp_cd3_META = createCommonMeta($itm_grp_cd3, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta itm_grp_nm3_META = createCommonMeta($itm_grp_nm3, mcframe.commonMA.meta.MA_META.ITM_GRP_NM);
	public static final MCMeta itm_grp_nm3_lcl1_META = createCommonMeta($itm_grp_nm3_lcl1, mcframe.commonMA.meta.MA_META.ITM_GRP_NM);
	public static final MCMeta itm_grp_nm3_lcl2_META = createCommonMeta($itm_grp_nm3_lcl2, mcframe.commonMA.meta.MA_META.ITM_GRP_NM);
	public static final MCMeta itm_grp_nm3_lcl3_META = createCommonMeta($itm_grp_nm3_lcl3, mcframe.commonMA.meta.MA_META.ITM_GRP_NM);
	public static final MCMeta itm_grp_nm3_lcl4_META = createCommonMeta($itm_grp_nm3_lcl4, mcframe.commonMA.meta.MA_META.ITM_GRP_NM);
	public static final MCMeta itm_grp_nm3_lcl5_META = createCommonMeta($itm_grp_nm3_lcl5, mcframe.commonMA.meta.MA_META.ITM_GRP_NM);
	public static final MCMeta itm_grp_cd4_META = createCommonMeta($itm_grp_cd4, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta itm_grp_nm4_META = createCommonMeta($itm_grp_nm4, mcframe.commonMA.meta.MA_META.ITM_GRP_NM);
	public static final MCMeta itm_grp_nm4_lcl1_META = createCommonMeta($itm_grp_nm4_lcl1, mcframe.commonMA.meta.MA_META.ITM_GRP_NM);
	public static final MCMeta itm_grp_nm4_lcl2_META = createCommonMeta($itm_grp_nm4_lcl2, mcframe.commonMA.meta.MA_META.ITM_GRP_NM);
	public static final MCMeta itm_grp_nm4_lcl3_META = createCommonMeta($itm_grp_nm4_lcl3, mcframe.commonMA.meta.MA_META.ITM_GRP_NM);
	public static final MCMeta itm_grp_nm4_lcl4_META = createCommonMeta($itm_grp_nm4_lcl4, mcframe.commonMA.meta.MA_META.ITM_GRP_NM);
	public static final MCMeta itm_grp_nm4_lcl5_META = createCommonMeta($itm_grp_nm4_lcl5, mcframe.commonMA.meta.MA_META.ITM_GRP_NM);
	public static final MCMeta itm_grp_cd5_META = createCommonMeta($itm_grp_cd5, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta itm_grp_nm5_META = createCommonMeta($itm_grp_nm5, mcframe.commonMA.meta.MA_META.ITM_GRP_NM);
	public static final MCMeta itm_grp_nm5_lcl1_META = createCommonMeta($itm_grp_nm5_lcl1, mcframe.commonMA.meta.MA_META.ITM_GRP_NM);
	public static final MCMeta itm_grp_nm5_lcl2_META = createCommonMeta($itm_grp_nm5_lcl2, mcframe.commonMA.meta.MA_META.ITM_GRP_NM);
	public static final MCMeta itm_grp_nm5_lcl3_META = createCommonMeta($itm_grp_nm5_lcl3, mcframe.commonMA.meta.MA_META.ITM_GRP_NM);
	public static final MCMeta itm_grp_nm5_lcl4_META = createCommonMeta($itm_grp_nm5_lcl4, mcframe.commonMA.meta.MA_META.ITM_GRP_NM);
	public static final MCMeta itm_grp_nm5_lcl5_META = createCommonMeta($itm_grp_nm5_lcl5, mcframe.commonMA.meta.MA_META.ITM_GRP_NM);
	public static final MCMeta itm_grp_cd6_META = createCommonMeta($itm_grp_cd6, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta itm_grp_nm6_META = createCommonMeta($itm_grp_nm6, mcframe.commonMA.meta.MA_META.ITM_GRP_NM);
	public static final MCMeta itm_grp_nm6_lcl1_META = createCommonMeta($itm_grp_nm6_lcl1, mcframe.commonMA.meta.MA_META.ITM_GRP_NM);
	public static final MCMeta itm_grp_nm6_lcl2_META = createCommonMeta($itm_grp_nm6_lcl2, mcframe.commonMA.meta.MA_META.ITM_GRP_NM);
	public static final MCMeta itm_grp_nm6_lcl3_META = createCommonMeta($itm_grp_nm6_lcl3, mcframe.commonMA.meta.MA_META.ITM_GRP_NM);
	public static final MCMeta itm_grp_nm6_lcl4_META = createCommonMeta($itm_grp_nm6_lcl4, mcframe.commonMA.meta.MA_META.ITM_GRP_NM);
	public static final MCMeta itm_grp_nm6_lcl5_META = createCommonMeta($itm_grp_nm6_lcl5, mcframe.commonMA.meta.MA_META.ITM_GRP_NM);
	public static final MCMeta itm_grp_cd7_META = createCommonMeta($itm_grp_cd7, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta itm_grp_nm7_META = createCommonMeta($itm_grp_nm7, mcframe.commonMA.meta.MA_META.ITM_GRP_NM);
	public static final MCMeta itm_grp_nm7_lcl1_META = createCommonMeta($itm_grp_nm7_lcl1, mcframe.commonMA.meta.MA_META.ITM_GRP_NM);
	public static final MCMeta itm_grp_nm7_lcl2_META = createCommonMeta($itm_grp_nm7_lcl2, mcframe.commonMA.meta.MA_META.ITM_GRP_NM);
	public static final MCMeta itm_grp_nm7_lcl3_META = createCommonMeta($itm_grp_nm7_lcl3, mcframe.commonMA.meta.MA_META.ITM_GRP_NM);
	public static final MCMeta itm_grp_nm7_lcl4_META = createCommonMeta($itm_grp_nm7_lcl4, mcframe.commonMA.meta.MA_META.ITM_GRP_NM);
	public static final MCMeta itm_grp_nm7_lcl5_META = createCommonMeta($itm_grp_nm7_lcl5, mcframe.commonMA.meta.MA_META.ITM_GRP_NM);
	public static final MCMeta itm_grp_cd8_META = createCommonMeta($itm_grp_cd8, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta itm_grp_nm8_META = createCommonMeta($itm_grp_nm8, mcframe.commonMA.meta.MA_META.ITM_GRP_NM);
	public static final MCMeta itm_grp_nm8_lcl1_META = createCommonMeta($itm_grp_nm8_lcl1, mcframe.commonMA.meta.MA_META.ITM_GRP_NM);
	public static final MCMeta itm_grp_nm8_lcl2_META = createCommonMeta($itm_grp_nm8_lcl2, mcframe.commonMA.meta.MA_META.ITM_GRP_NM);
	public static final MCMeta itm_grp_nm8_lcl3_META = createCommonMeta($itm_grp_nm8_lcl3, mcframe.commonMA.meta.MA_META.ITM_GRP_NM);
	public static final MCMeta itm_grp_nm8_lcl4_META = createCommonMeta($itm_grp_nm8_lcl4, mcframe.commonMA.meta.MA_META.ITM_GRP_NM);
	public static final MCMeta itm_grp_nm8_lcl5_META = createCommonMeta($itm_grp_nm8_lcl5, mcframe.commonMA.meta.MA_META.ITM_GRP_NM);
	public static final MCMeta itm_grp_cd9_META = createCommonMeta($itm_grp_cd9, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta itm_grp_nm9_META = createCommonMeta($itm_grp_nm9, mcframe.commonMA.meta.MA_META.ITM_GRP_NM);
	public static final MCMeta itm_grp_nm9_lcl1_META = createCommonMeta($itm_grp_nm9_lcl1, mcframe.commonMA.meta.MA_META.ITM_GRP_NM);
	public static final MCMeta itm_grp_nm9_lcl2_META = createCommonMeta($itm_grp_nm9_lcl2, mcframe.commonMA.meta.MA_META.ITM_GRP_NM);
	public static final MCMeta itm_grp_nm9_lcl3_META = createCommonMeta($itm_grp_nm9_lcl3, mcframe.commonMA.meta.MA_META.ITM_GRP_NM);
	public static final MCMeta itm_grp_nm9_lcl4_META = createCommonMeta($itm_grp_nm9_lcl4, mcframe.commonMA.meta.MA_META.ITM_GRP_NM);
	public static final MCMeta itm_grp_nm9_lcl5_META = createCommonMeta($itm_grp_nm9_lcl5, mcframe.commonMA.meta.MA_META.ITM_GRP_NM);
	public static final MCMeta itm_grp_cd10_META = createCommonMeta($itm_grp_cd10, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta itm_grp_nm10_META = createCommonMeta($itm_grp_nm10, mcframe.commonMA.meta.MA_META.ITM_GRP_NM);
	public static final MCMeta itm_grp_nm10_lcl1_META = createCommonMeta($itm_grp_nm10_lcl1, mcframe.commonMA.meta.MA_META.ITM_GRP_NM);
	public static final MCMeta itm_grp_nm10_lcl2_META = createCommonMeta($itm_grp_nm10_lcl2, mcframe.commonMA.meta.MA_META.ITM_GRP_NM);
	public static final MCMeta itm_grp_nm10_lcl3_META = createCommonMeta($itm_grp_nm10_lcl3, mcframe.commonMA.meta.MA_META.ITM_GRP_NM);
	public static final MCMeta itm_grp_nm10_lcl4_META = createCommonMeta($itm_grp_nm10_lcl4, mcframe.commonMA.meta.MA_META.ITM_GRP_NM);
	public static final MCMeta itm_grp_nm10_lcl5_META = createCommonMeta($itm_grp_nm10_lcl5, mcframe.commonMA.meta.MA_META.ITM_GRP_NM);
	public static final MCMeta memo1_META = createCommonMeta($memo1, mcframe.commonMA.meta.MA_META.MST_MEMO1);
	public static final MCMeta memo2_META = createCommonMeta($memo2, mcframe.commonMA.meta.MA_META.MST_MEMO2);
	public static final MCMeta memo3_META = createCommonMeta($memo3, mcframe.commonMA.meta.MA_META.MST_MEMO3);

	protected static final List<MCForeignInfo> FOREIGN_INFO_LIST = new ArrayList<>();
	static {
	}
	
	protected static final ConstMetaList<MAVM_ITM_IF_ALL_R> constMetas = new ConstMetaList<MAVM_ITM_IF_ALL_R>(
		MCDBContainer.constMetas,
		new MCMeta[]{
			co_cd_META,
			itm_cd_META,
			itm_sub1_META,
			itm_sub2_META,
			itm_sub3_META,
			itm_nm_META,
			itm_nm_lcl1_META,
			itm_nm_lcl2_META,
			itm_nm_lcl3_META,
			itm_nm_lcl4_META,
			itm_nm_lcl5_META,
			unit_nm_META,
			unit_nm_lcl1_META,
			unit_nm_lcl2_META,
			unit_nm_lcl3_META,
			unit_nm_lcl4_META,
			unit_nm_lcl5_META,
			itm_typ_nm_META,
			itm_typ_nm_lcl1_META,
			itm_typ_nm_lcl2_META,
			itm_typ_nm_lcl3_META,
			itm_typ_nm_lcl4_META,
			itm_typ_nm_lcl5_META,
			itm_typ_d_nm_META,
			itm_typ_d_nm_lcl1_META,
			itm_typ_d_nm_lcl2_META,
			itm_typ_d_nm_lcl3_META,
			itm_typ_d_nm_lcl4_META,
			itm_typ_d_nm_lcl5_META,
			itm_jnl_nm_META,
			itm_jnl_nm_lcl1_META,
			itm_jnl_nm_lcl2_META,
			itm_jnl_nm_lcl3_META,
			itm_jnl_nm_lcl4_META,
			itm_jnl_nm_lcl5_META,
			ac_itm_grp_nm_META,
			ac_itm_grp_nm_lcl1_META,
			ac_itm_grp_nm_lcl2_META,
			ac_itm_grp_nm_lcl3_META,
			ac_itm_grp_nm_lcl4_META,
			ac_itm_grp_nm_lcl5_META,
			itm_grp_cd1_META,
			itm_grp_nm1_META,
			itm_grp_nm1_lcl1_META,
			itm_grp_nm1_lcl2_META,
			itm_grp_nm1_lcl3_META,
			itm_grp_nm1_lcl4_META,
			itm_grp_nm1_lcl5_META,
			itm_grp_cd2_META,
			itm_grp_nm2_META,
			itm_grp_nm2_lcl1_META,
			itm_grp_nm2_lcl2_META,
			itm_grp_nm2_lcl3_META,
			itm_grp_nm2_lcl4_META,
			itm_grp_nm2_lcl5_META,
			itm_grp_cd3_META,
			itm_grp_nm3_META,
			itm_grp_nm3_lcl1_META,
			itm_grp_nm3_lcl2_META,
			itm_grp_nm3_lcl3_META,
			itm_grp_nm3_lcl4_META,
			itm_grp_nm3_lcl5_META,
			itm_grp_cd4_META,
			itm_grp_nm4_META,
			itm_grp_nm4_lcl1_META,
			itm_grp_nm4_lcl2_META,
			itm_grp_nm4_lcl3_META,
			itm_grp_nm4_lcl4_META,
			itm_grp_nm4_lcl5_META,
			itm_grp_cd5_META,
			itm_grp_nm5_META,
			itm_grp_nm5_lcl1_META,
			itm_grp_nm5_lcl2_META,
			itm_grp_nm5_lcl3_META,
			itm_grp_nm5_lcl4_META,
			itm_grp_nm5_lcl5_META,
			itm_grp_cd6_META,
			itm_grp_nm6_META,
			itm_grp_nm6_lcl1_META,
			itm_grp_nm6_lcl2_META,
			itm_grp_nm6_lcl3_META,
			itm_grp_nm6_lcl4_META,
			itm_grp_nm6_lcl5_META,
			itm_grp_cd7_META,
			itm_grp_nm7_META,
			itm_grp_nm7_lcl1_META,
			itm_grp_nm7_lcl2_META,
			itm_grp_nm7_lcl3_META,
			itm_grp_nm7_lcl4_META,
			itm_grp_nm7_lcl5_META,
			itm_grp_cd8_META,
			itm_grp_nm8_META,
			itm_grp_nm8_lcl1_META,
			itm_grp_nm8_lcl2_META,
			itm_grp_nm8_lcl3_META,
			itm_grp_nm8_lcl4_META,
			itm_grp_nm8_lcl5_META,
			itm_grp_cd9_META,
			itm_grp_nm9_META,
			itm_grp_nm9_lcl1_META,
			itm_grp_nm9_lcl2_META,
			itm_grp_nm9_lcl3_META,
			itm_grp_nm9_lcl4_META,
			itm_grp_nm9_lcl5_META,
			itm_grp_cd10_META,
			itm_grp_nm10_META,
			itm_grp_nm10_lcl1_META,
			itm_grp_nm10_lcl2_META,
			itm_grp_nm10_lcl3_META,
			itm_grp_nm10_lcl4_META,
			itm_grp_nm10_lcl5_META,
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
	protected MAVM_ITM_IF_ALL_R(ConstMetaList<? extends MAVM_ITM_IF_ALL_R> metas, String alias) {
		super(metas, TABLE_TYPE, TABLE_NAME, alias, EX_CTRL, LCL_TABLE, FOREIGN_INFO_LIST);
		super.setColumnMap(getColumnMap());
	}

	protected MAVM_ITM_IF_ALL_R(ConstMetaList<? extends MAVM_ITM_IF_ALL_R> metas) {
		this(metas, TABLE_NAME);
	}

	protected LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> getColumnMap() {
		LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> COLUMN_MAP = new LinkedHashMap<>();
		COLUMN_MAP.put(
			MAVM_ITM_IF_ALL_R.$co_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_ITM_IF_ALL_R.$co_cd,
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
			MAVM_ITM_IF_ALL_R.$itm_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_ITM_IF_ALL_R.$itm_cd,
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
			MAVM_ITM_IF_ALL_R.$itm_sub1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_ITM_IF_ALL_R.$itm_sub1,
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
			MAVM_ITM_IF_ALL_R.$itm_sub2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_ITM_IF_ALL_R.$itm_sub2,
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
			MAVM_ITM_IF_ALL_R.$itm_sub3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_ITM_IF_ALL_R.$itm_sub3,
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
			MAVM_ITM_IF_ALL_R.$itm_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_ITM_IF_ALL_R.$itm_nm,
				"itm_nm",
				itm_nm,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_ITM_IF_ALL_R.$itm_nm_lcl1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_ITM_IF_ALL_R.$itm_nm_lcl1,
				"itm_nm_lcl1",
				itm_nm_lcl1,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_ITM_IF_ALL_R.$itm_nm_lcl2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_ITM_IF_ALL_R.$itm_nm_lcl2,
				"itm_nm_lcl2",
				itm_nm_lcl2,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_ITM_IF_ALL_R.$itm_nm_lcl3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_ITM_IF_ALL_R.$itm_nm_lcl3,
				"itm_nm_lcl3",
				itm_nm_lcl3,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_ITM_IF_ALL_R.$itm_nm_lcl4,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_ITM_IF_ALL_R.$itm_nm_lcl4,
				"itm_nm_lcl4",
				itm_nm_lcl4,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_ITM_IF_ALL_R.$itm_nm_lcl5,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_ITM_IF_ALL_R.$itm_nm_lcl5,
				"itm_nm_lcl5",
				itm_nm_lcl5,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_ITM_IF_ALL_R.$unit_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_ITM_IF_ALL_R.$unit_nm,
				"unit_nm",
				unit_nm,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_ITM_IF_ALL_R.$unit_nm_lcl1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_ITM_IF_ALL_R.$unit_nm_lcl1,
				"unit_nm_lcl1",
				unit_nm_lcl1,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_ITM_IF_ALL_R.$unit_nm_lcl2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_ITM_IF_ALL_R.$unit_nm_lcl2,
				"unit_nm_lcl2",
				unit_nm_lcl2,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_ITM_IF_ALL_R.$unit_nm_lcl3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_ITM_IF_ALL_R.$unit_nm_lcl3,
				"unit_nm_lcl3",
				unit_nm_lcl3,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_ITM_IF_ALL_R.$unit_nm_lcl4,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_ITM_IF_ALL_R.$unit_nm_lcl4,
				"unit_nm_lcl4",
				unit_nm_lcl4,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_ITM_IF_ALL_R.$unit_nm_lcl5,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_ITM_IF_ALL_R.$unit_nm_lcl5,
				"unit_nm_lcl5",
				unit_nm_lcl5,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_ITM_IF_ALL_R.$itm_typ_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_ITM_IF_ALL_R.$itm_typ_nm,
				"itm_typ_nm",
				itm_typ_nm,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_ITM_IF_ALL_R.$itm_typ_nm_lcl1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_ITM_IF_ALL_R.$itm_typ_nm_lcl1,
				"itm_typ_nm_lcl1",
				itm_typ_nm_lcl1,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_ITM_IF_ALL_R.$itm_typ_nm_lcl2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_ITM_IF_ALL_R.$itm_typ_nm_lcl2,
				"itm_typ_nm_lcl2",
				itm_typ_nm_lcl2,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_ITM_IF_ALL_R.$itm_typ_nm_lcl3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_ITM_IF_ALL_R.$itm_typ_nm_lcl3,
				"itm_typ_nm_lcl3",
				itm_typ_nm_lcl3,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_ITM_IF_ALL_R.$itm_typ_nm_lcl4,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_ITM_IF_ALL_R.$itm_typ_nm_lcl4,
				"itm_typ_nm_lcl4",
				itm_typ_nm_lcl4,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_ITM_IF_ALL_R.$itm_typ_nm_lcl5,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_ITM_IF_ALL_R.$itm_typ_nm_lcl5,
				"itm_typ_nm_lcl5",
				itm_typ_nm_lcl5,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_ITM_IF_ALL_R.$itm_typ_d_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_ITM_IF_ALL_R.$itm_typ_d_nm,
				"itm_typ_d_nm",
				itm_typ_d_nm,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_ITM_IF_ALL_R.$itm_typ_d_nm_lcl1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_ITM_IF_ALL_R.$itm_typ_d_nm_lcl1,
				"itm_typ_d_nm_lcl1",
				itm_typ_d_nm_lcl1,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_ITM_IF_ALL_R.$itm_typ_d_nm_lcl2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_ITM_IF_ALL_R.$itm_typ_d_nm_lcl2,
				"itm_typ_d_nm_lcl2",
				itm_typ_d_nm_lcl2,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_ITM_IF_ALL_R.$itm_typ_d_nm_lcl3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_ITM_IF_ALL_R.$itm_typ_d_nm_lcl3,
				"itm_typ_d_nm_lcl3",
				itm_typ_d_nm_lcl3,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_ITM_IF_ALL_R.$itm_typ_d_nm_lcl4,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_ITM_IF_ALL_R.$itm_typ_d_nm_lcl4,
				"itm_typ_d_nm_lcl4",
				itm_typ_d_nm_lcl4,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_ITM_IF_ALL_R.$itm_typ_d_nm_lcl5,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_ITM_IF_ALL_R.$itm_typ_d_nm_lcl5,
				"itm_typ_d_nm_lcl5",
				itm_typ_d_nm_lcl5,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_ITM_IF_ALL_R.$itm_jnl_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_ITM_IF_ALL_R.$itm_jnl_nm,
				"itm_jnl_nm",
				itm_jnl_nm,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_ITM_IF_ALL_R.$itm_jnl_nm_lcl1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_ITM_IF_ALL_R.$itm_jnl_nm_lcl1,
				"itm_jnl_nm_lcl1",
				itm_jnl_nm_lcl1,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_ITM_IF_ALL_R.$itm_jnl_nm_lcl2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_ITM_IF_ALL_R.$itm_jnl_nm_lcl2,
				"itm_jnl_nm_lcl2",
				itm_jnl_nm_lcl2,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_ITM_IF_ALL_R.$itm_jnl_nm_lcl3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_ITM_IF_ALL_R.$itm_jnl_nm_lcl3,
				"itm_jnl_nm_lcl3",
				itm_jnl_nm_lcl3,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_ITM_IF_ALL_R.$itm_jnl_nm_lcl4,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_ITM_IF_ALL_R.$itm_jnl_nm_lcl4,
				"itm_jnl_nm_lcl4",
				itm_jnl_nm_lcl4,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_ITM_IF_ALL_R.$itm_jnl_nm_lcl5,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_ITM_IF_ALL_R.$itm_jnl_nm_lcl5,
				"itm_jnl_nm_lcl5",
				itm_jnl_nm_lcl5,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_ITM_IF_ALL_R.$ac_itm_grp_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_ITM_IF_ALL_R.$ac_itm_grp_nm,
				"ac_itm_grp_nm",
				ac_itm_grp_nm,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_ITM_IF_ALL_R.$ac_itm_grp_nm_lcl1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_ITM_IF_ALL_R.$ac_itm_grp_nm_lcl1,
				"ac_itm_grp_nm_lcl1",
				ac_itm_grp_nm_lcl1,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_ITM_IF_ALL_R.$ac_itm_grp_nm_lcl2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_ITM_IF_ALL_R.$ac_itm_grp_nm_lcl2,
				"ac_itm_grp_nm_lcl2",
				ac_itm_grp_nm_lcl2,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_ITM_IF_ALL_R.$ac_itm_grp_nm_lcl3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_ITM_IF_ALL_R.$ac_itm_grp_nm_lcl3,
				"ac_itm_grp_nm_lcl3",
				ac_itm_grp_nm_lcl3,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_ITM_IF_ALL_R.$ac_itm_grp_nm_lcl4,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_ITM_IF_ALL_R.$ac_itm_grp_nm_lcl4,
				"ac_itm_grp_nm_lcl4",
				ac_itm_grp_nm_lcl4,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_ITM_IF_ALL_R.$ac_itm_grp_nm_lcl5,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_ITM_IF_ALL_R.$ac_itm_grp_nm_lcl5,
				"ac_itm_grp_nm_lcl5",
				ac_itm_grp_nm_lcl5,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_ITM_IF_ALL_R.$itm_grp_cd1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_ITM_IF_ALL_R.$itm_grp_cd1,
				"itm_grp_cd1",
				itm_grp_cd1,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_ITM_IF_ALL_R.$itm_grp_nm1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_ITM_IF_ALL_R.$itm_grp_nm1,
				"itm_grp_nm1",
				itm_grp_nm1,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_ITM_IF_ALL_R.$itm_grp_nm1_lcl1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_ITM_IF_ALL_R.$itm_grp_nm1_lcl1,
				"itm_grp_nm1_lcl1",
				itm_grp_nm1_lcl1,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_ITM_IF_ALL_R.$itm_grp_nm1_lcl2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_ITM_IF_ALL_R.$itm_grp_nm1_lcl2,
				"itm_grp_nm1_lcl2",
				itm_grp_nm1_lcl2,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_ITM_IF_ALL_R.$itm_grp_nm1_lcl3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_ITM_IF_ALL_R.$itm_grp_nm1_lcl3,
				"itm_grp_nm1_lcl3",
				itm_grp_nm1_lcl3,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_ITM_IF_ALL_R.$itm_grp_nm1_lcl4,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_ITM_IF_ALL_R.$itm_grp_nm1_lcl4,
				"itm_grp_nm1_lcl4",
				itm_grp_nm1_lcl4,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_ITM_IF_ALL_R.$itm_grp_nm1_lcl5,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_ITM_IF_ALL_R.$itm_grp_nm1_lcl5,
				"itm_grp_nm1_lcl5",
				itm_grp_nm1_lcl5,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_ITM_IF_ALL_R.$itm_grp_cd2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_ITM_IF_ALL_R.$itm_grp_cd2,
				"itm_grp_cd2",
				itm_grp_cd2,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_ITM_IF_ALL_R.$itm_grp_nm2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_ITM_IF_ALL_R.$itm_grp_nm2,
				"itm_grp_nm2",
				itm_grp_nm2,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_ITM_IF_ALL_R.$itm_grp_nm2_lcl1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_ITM_IF_ALL_R.$itm_grp_nm2_lcl1,
				"itm_grp_nm2_lcl1",
				itm_grp_nm2_lcl1,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_ITM_IF_ALL_R.$itm_grp_nm2_lcl2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_ITM_IF_ALL_R.$itm_grp_nm2_lcl2,
				"itm_grp_nm2_lcl2",
				itm_grp_nm2_lcl2,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_ITM_IF_ALL_R.$itm_grp_nm2_lcl3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_ITM_IF_ALL_R.$itm_grp_nm2_lcl3,
				"itm_grp_nm2_lcl3",
				itm_grp_nm2_lcl3,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_ITM_IF_ALL_R.$itm_grp_nm2_lcl4,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_ITM_IF_ALL_R.$itm_grp_nm2_lcl4,
				"itm_grp_nm2_lcl4",
				itm_grp_nm2_lcl4,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_ITM_IF_ALL_R.$itm_grp_nm2_lcl5,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_ITM_IF_ALL_R.$itm_grp_nm2_lcl5,
				"itm_grp_nm2_lcl5",
				itm_grp_nm2_lcl5,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_ITM_IF_ALL_R.$itm_grp_cd3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_ITM_IF_ALL_R.$itm_grp_cd3,
				"itm_grp_cd3",
				itm_grp_cd3,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_ITM_IF_ALL_R.$itm_grp_nm3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_ITM_IF_ALL_R.$itm_grp_nm3,
				"itm_grp_nm3",
				itm_grp_nm3,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_ITM_IF_ALL_R.$itm_grp_nm3_lcl1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_ITM_IF_ALL_R.$itm_grp_nm3_lcl1,
				"itm_grp_nm3_lcl1",
				itm_grp_nm3_lcl1,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_ITM_IF_ALL_R.$itm_grp_nm3_lcl2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_ITM_IF_ALL_R.$itm_grp_nm3_lcl2,
				"itm_grp_nm3_lcl2",
				itm_grp_nm3_lcl2,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_ITM_IF_ALL_R.$itm_grp_nm3_lcl3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_ITM_IF_ALL_R.$itm_grp_nm3_lcl3,
				"itm_grp_nm3_lcl3",
				itm_grp_nm3_lcl3,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_ITM_IF_ALL_R.$itm_grp_nm3_lcl4,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_ITM_IF_ALL_R.$itm_grp_nm3_lcl4,
				"itm_grp_nm3_lcl4",
				itm_grp_nm3_lcl4,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_ITM_IF_ALL_R.$itm_grp_nm3_lcl5,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_ITM_IF_ALL_R.$itm_grp_nm3_lcl5,
				"itm_grp_nm3_lcl5",
				itm_grp_nm3_lcl5,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_ITM_IF_ALL_R.$itm_grp_cd4,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_ITM_IF_ALL_R.$itm_grp_cd4,
				"itm_grp_cd4",
				itm_grp_cd4,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_ITM_IF_ALL_R.$itm_grp_nm4,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_ITM_IF_ALL_R.$itm_grp_nm4,
				"itm_grp_nm4",
				itm_grp_nm4,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_ITM_IF_ALL_R.$itm_grp_nm4_lcl1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_ITM_IF_ALL_R.$itm_grp_nm4_lcl1,
				"itm_grp_nm4_lcl1",
				itm_grp_nm4_lcl1,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_ITM_IF_ALL_R.$itm_grp_nm4_lcl2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_ITM_IF_ALL_R.$itm_grp_nm4_lcl2,
				"itm_grp_nm4_lcl2",
				itm_grp_nm4_lcl2,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_ITM_IF_ALL_R.$itm_grp_nm4_lcl3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_ITM_IF_ALL_R.$itm_grp_nm4_lcl3,
				"itm_grp_nm4_lcl3",
				itm_grp_nm4_lcl3,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_ITM_IF_ALL_R.$itm_grp_nm4_lcl4,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_ITM_IF_ALL_R.$itm_grp_nm4_lcl4,
				"itm_grp_nm4_lcl4",
				itm_grp_nm4_lcl4,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_ITM_IF_ALL_R.$itm_grp_nm4_lcl5,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_ITM_IF_ALL_R.$itm_grp_nm4_lcl5,
				"itm_grp_nm4_lcl5",
				itm_grp_nm4_lcl5,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_ITM_IF_ALL_R.$itm_grp_cd5,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_ITM_IF_ALL_R.$itm_grp_cd5,
				"itm_grp_cd5",
				itm_grp_cd5,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_ITM_IF_ALL_R.$itm_grp_nm5,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_ITM_IF_ALL_R.$itm_grp_nm5,
				"itm_grp_nm5",
				itm_grp_nm5,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_ITM_IF_ALL_R.$itm_grp_nm5_lcl1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_ITM_IF_ALL_R.$itm_grp_nm5_lcl1,
				"itm_grp_nm5_lcl1",
				itm_grp_nm5_lcl1,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_ITM_IF_ALL_R.$itm_grp_nm5_lcl2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_ITM_IF_ALL_R.$itm_grp_nm5_lcl2,
				"itm_grp_nm5_lcl2",
				itm_grp_nm5_lcl2,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_ITM_IF_ALL_R.$itm_grp_nm5_lcl3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_ITM_IF_ALL_R.$itm_grp_nm5_lcl3,
				"itm_grp_nm5_lcl3",
				itm_grp_nm5_lcl3,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_ITM_IF_ALL_R.$itm_grp_nm5_lcl4,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_ITM_IF_ALL_R.$itm_grp_nm5_lcl4,
				"itm_grp_nm5_lcl4",
				itm_grp_nm5_lcl4,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_ITM_IF_ALL_R.$itm_grp_nm5_lcl5,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_ITM_IF_ALL_R.$itm_grp_nm5_lcl5,
				"itm_grp_nm5_lcl5",
				itm_grp_nm5_lcl5,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_ITM_IF_ALL_R.$itm_grp_cd6,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_ITM_IF_ALL_R.$itm_grp_cd6,
				"itm_grp_cd6",
				itm_grp_cd6,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_ITM_IF_ALL_R.$itm_grp_nm6,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_ITM_IF_ALL_R.$itm_grp_nm6,
				"itm_grp_nm6",
				itm_grp_nm6,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_ITM_IF_ALL_R.$itm_grp_nm6_lcl1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_ITM_IF_ALL_R.$itm_grp_nm6_lcl1,
				"itm_grp_nm6_lcl1",
				itm_grp_nm6_lcl1,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_ITM_IF_ALL_R.$itm_grp_nm6_lcl2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_ITM_IF_ALL_R.$itm_grp_nm6_lcl2,
				"itm_grp_nm6_lcl2",
				itm_grp_nm6_lcl2,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_ITM_IF_ALL_R.$itm_grp_nm6_lcl3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_ITM_IF_ALL_R.$itm_grp_nm6_lcl3,
				"itm_grp_nm6_lcl3",
				itm_grp_nm6_lcl3,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_ITM_IF_ALL_R.$itm_grp_nm6_lcl4,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_ITM_IF_ALL_R.$itm_grp_nm6_lcl4,
				"itm_grp_nm6_lcl4",
				itm_grp_nm6_lcl4,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_ITM_IF_ALL_R.$itm_grp_nm6_lcl5,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_ITM_IF_ALL_R.$itm_grp_nm6_lcl5,
				"itm_grp_nm6_lcl5",
				itm_grp_nm6_lcl5,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_ITM_IF_ALL_R.$itm_grp_cd7,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_ITM_IF_ALL_R.$itm_grp_cd7,
				"itm_grp_cd7",
				itm_grp_cd7,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_ITM_IF_ALL_R.$itm_grp_nm7,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_ITM_IF_ALL_R.$itm_grp_nm7,
				"itm_grp_nm7",
				itm_grp_nm7,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_ITM_IF_ALL_R.$itm_grp_nm7_lcl1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_ITM_IF_ALL_R.$itm_grp_nm7_lcl1,
				"itm_grp_nm7_lcl1",
				itm_grp_nm7_lcl1,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_ITM_IF_ALL_R.$itm_grp_nm7_lcl2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_ITM_IF_ALL_R.$itm_grp_nm7_lcl2,
				"itm_grp_nm7_lcl2",
				itm_grp_nm7_lcl2,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_ITM_IF_ALL_R.$itm_grp_nm7_lcl3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_ITM_IF_ALL_R.$itm_grp_nm7_lcl3,
				"itm_grp_nm7_lcl3",
				itm_grp_nm7_lcl3,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_ITM_IF_ALL_R.$itm_grp_nm7_lcl4,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_ITM_IF_ALL_R.$itm_grp_nm7_lcl4,
				"itm_grp_nm7_lcl4",
				itm_grp_nm7_lcl4,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_ITM_IF_ALL_R.$itm_grp_nm7_lcl5,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_ITM_IF_ALL_R.$itm_grp_nm7_lcl5,
				"itm_grp_nm7_lcl5",
				itm_grp_nm7_lcl5,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_ITM_IF_ALL_R.$itm_grp_cd8,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_ITM_IF_ALL_R.$itm_grp_cd8,
				"itm_grp_cd8",
				itm_grp_cd8,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_ITM_IF_ALL_R.$itm_grp_nm8,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_ITM_IF_ALL_R.$itm_grp_nm8,
				"itm_grp_nm8",
				itm_grp_nm8,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_ITM_IF_ALL_R.$itm_grp_nm8_lcl1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_ITM_IF_ALL_R.$itm_grp_nm8_lcl1,
				"itm_grp_nm8_lcl1",
				itm_grp_nm8_lcl1,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_ITM_IF_ALL_R.$itm_grp_nm8_lcl2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_ITM_IF_ALL_R.$itm_grp_nm8_lcl2,
				"itm_grp_nm8_lcl2",
				itm_grp_nm8_lcl2,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_ITM_IF_ALL_R.$itm_grp_nm8_lcl3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_ITM_IF_ALL_R.$itm_grp_nm8_lcl3,
				"itm_grp_nm8_lcl3",
				itm_grp_nm8_lcl3,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_ITM_IF_ALL_R.$itm_grp_nm8_lcl4,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_ITM_IF_ALL_R.$itm_grp_nm8_lcl4,
				"itm_grp_nm8_lcl4",
				itm_grp_nm8_lcl4,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_ITM_IF_ALL_R.$itm_grp_nm8_lcl5,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_ITM_IF_ALL_R.$itm_grp_nm8_lcl5,
				"itm_grp_nm8_lcl5",
				itm_grp_nm8_lcl5,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_ITM_IF_ALL_R.$itm_grp_cd9,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_ITM_IF_ALL_R.$itm_grp_cd9,
				"itm_grp_cd9",
				itm_grp_cd9,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_ITM_IF_ALL_R.$itm_grp_nm9,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_ITM_IF_ALL_R.$itm_grp_nm9,
				"itm_grp_nm9",
				itm_grp_nm9,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_ITM_IF_ALL_R.$itm_grp_nm9_lcl1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_ITM_IF_ALL_R.$itm_grp_nm9_lcl1,
				"itm_grp_nm9_lcl1",
				itm_grp_nm9_lcl1,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_ITM_IF_ALL_R.$itm_grp_nm9_lcl2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_ITM_IF_ALL_R.$itm_grp_nm9_lcl2,
				"itm_grp_nm9_lcl2",
				itm_grp_nm9_lcl2,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_ITM_IF_ALL_R.$itm_grp_nm9_lcl3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_ITM_IF_ALL_R.$itm_grp_nm9_lcl3,
				"itm_grp_nm9_lcl3",
				itm_grp_nm9_lcl3,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_ITM_IF_ALL_R.$itm_grp_nm9_lcl4,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_ITM_IF_ALL_R.$itm_grp_nm9_lcl4,
				"itm_grp_nm9_lcl4",
				itm_grp_nm9_lcl4,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_ITM_IF_ALL_R.$itm_grp_nm9_lcl5,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_ITM_IF_ALL_R.$itm_grp_nm9_lcl5,
				"itm_grp_nm9_lcl5",
				itm_grp_nm9_lcl5,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_ITM_IF_ALL_R.$itm_grp_cd10,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_ITM_IF_ALL_R.$itm_grp_cd10,
				"itm_grp_cd10",
				itm_grp_cd10,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_ITM_IF_ALL_R.$itm_grp_nm10,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_ITM_IF_ALL_R.$itm_grp_nm10,
				"itm_grp_nm10",
				itm_grp_nm10,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_ITM_IF_ALL_R.$itm_grp_nm10_lcl1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_ITM_IF_ALL_R.$itm_grp_nm10_lcl1,
				"itm_grp_nm10_lcl1",
				itm_grp_nm10_lcl1,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_ITM_IF_ALL_R.$itm_grp_nm10_lcl2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_ITM_IF_ALL_R.$itm_grp_nm10_lcl2,
				"itm_grp_nm10_lcl2",
				itm_grp_nm10_lcl2,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_ITM_IF_ALL_R.$itm_grp_nm10_lcl3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_ITM_IF_ALL_R.$itm_grp_nm10_lcl3,
				"itm_grp_nm10_lcl3",
				itm_grp_nm10_lcl3,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_ITM_IF_ALL_R.$itm_grp_nm10_lcl4,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_ITM_IF_ALL_R.$itm_grp_nm10_lcl4,
				"itm_grp_nm10_lcl4",
				itm_grp_nm10_lcl4,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_ITM_IF_ALL_R.$itm_grp_nm10_lcl5,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_ITM_IF_ALL_R.$itm_grp_nm10_lcl5,
				"itm_grp_nm10_lcl5",
				itm_grp_nm10_lcl5,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_ITM_IF_ALL_R.$memo1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_ITM_IF_ALL_R.$memo1,
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
			MAVM_ITM_IF_ALL_R.$memo2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_ITM_IF_ALL_R.$memo2,
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
			MAVM_ITM_IF_ALL_R.$memo3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_ITM_IF_ALL_R.$memo3,
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
	public static MAVM_ITM_IF_ALL_R create() {
		return create(TABLE_NAME);
	}

	/**
	 * 新しいRowを生成します。
	 *
	 * @return 新しいインスタンス
	 */
	public static MAVM_ITM_IF_ALL_R create(String alias) {
		MAVM_ITM_IF_ALL_R row = new MAVM_ITM_IF_ALL_R(constMetas, alias);
		return row;
	}

	/**
	 * 新しいRowを生成し別のRowの内容を設定します。
	 *
	 * @param proto 設定するRow
	 * @return 内容を設定した新しいインスタンス
	 */
	public static <T extends MCRow> MAVM_ITM_IF_ALL_R createByName(T proto) {
		MAVM_ITM_IF_ALL_R row = MAVM_ITM_IF_ALL_R.create();
		copyByName(row, proto);
		return row;
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MAVM_ITM_IF_ALL_R clone() {
		return (MAVM_ITM_IF_ALL_R) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MAVM_ITM_IF_ALL_R createInstance() {
		return (MAVM_ITM_IF_ALL_R) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MAVM_ITM_IF_ALL_R getValues(String... names) {
		return (MAVM_ITM_IF_ALL_R) super.getValues(names);
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
	 * 品目ＣＤ. Item cd..<p>
	 *
	 */
	public String itm_cd() {
		return getConstString(offset + 1, $itm_cd);
	}

	/**
	 * 品目ＣＤ. Item cd..<p>
	 *
	 */
	public void itm_cd(String value) {
		setConstString(offset + 1, $itm_cd, value);
	}

	/**
	 * 枝番１. Branch No. 1.<p>
	 *
	 */
	public String itm_sub1() {
		return getConstString(offset + 2, $itm_sub1);
	}

	/**
	 * 枝番１. Branch No. 1.<p>
	 *
	 */
	public void itm_sub1(String value) {
		setConstString(offset + 2, $itm_sub1, value);
	}

	/**
	 * 枝番２. Branch No. 2.<p>
	 *
	 */
	public String itm_sub2() {
		return getConstString(offset + 3, $itm_sub2);
	}

	/**
	 * 枝番２. Branch No. 2.<p>
	 *
	 */
	public void itm_sub2(String value) {
		setConstString(offset + 3, $itm_sub2, value);
	}

	/**
	 * 枝番３. Branch No. 3.<p>
	 *
	 */
	public String itm_sub3() {
		return getConstString(offset + 4, $itm_sub3);
	}

	/**
	 * 枝番３. Branch No. 3.<p>
	 *
	 */
	public void itm_sub3(String value) {
		setConstString(offset + 4, $itm_sub3, value);
	}

	/**
	 * 品目名. Item name.<p>
	 *
	 */
	public String itm_nm() {
		return getConstString(offset + 5, $itm_nm);
	}

	/**
	 * 品目名. Item name.<p>
	 *
	 */
	public void itm_nm(String value) {
		setConstString(offset + 5, $itm_nm, value);
	}

	/**
	 * 品目名（ロケール１）. Item name (Locale1).<p>
	 *
	 */
	public String itm_nm_lcl1() {
		return getConstString(offset + 6, $itm_nm_lcl1);
	}

	/**
	 * 品目名（ロケール１）. Item name (Locale1).<p>
	 *
	 */
	public void itm_nm_lcl1(String value) {
		setConstString(offset + 6, $itm_nm_lcl1, value);
	}

	/**
	 * 品目名（ロケール２）. Item name (Locale2).<p>
	 *
	 */
	public String itm_nm_lcl2() {
		return getConstString(offset + 7, $itm_nm_lcl2);
	}

	/**
	 * 品目名（ロケール２）. Item name (Locale2).<p>
	 *
	 */
	public void itm_nm_lcl2(String value) {
		setConstString(offset + 7, $itm_nm_lcl2, value);
	}

	/**
	 * 品目名（ロケール３）. Item name (Locale3).<p>
	 *
	 */
	public String itm_nm_lcl3() {
		return getConstString(offset + 8, $itm_nm_lcl3);
	}

	/**
	 * 品目名（ロケール３）. Item name (Locale3).<p>
	 *
	 */
	public void itm_nm_lcl3(String value) {
		setConstString(offset + 8, $itm_nm_lcl3, value);
	}

	/**
	 * 品目名（ロケール４）. Item name (Locale4).<p>
	 *
	 */
	public String itm_nm_lcl4() {
		return getConstString(offset + 9, $itm_nm_lcl4);
	}

	/**
	 * 品目名（ロケール４）. Item name (Locale4).<p>
	 *
	 */
	public void itm_nm_lcl4(String value) {
		setConstString(offset + 9, $itm_nm_lcl4, value);
	}

	/**
	 * 品目名（ロケール５）. Item name (Locale5).<p>
	 *
	 */
	public String itm_nm_lcl5() {
		return getConstString(offset + 10, $itm_nm_lcl5);
	}

	/**
	 * 品目名（ロケール５）. Item name (Locale5).<p>
	 *
	 */
	public void itm_nm_lcl5(String value) {
		setConstString(offset + 10, $itm_nm_lcl5, value);
	}

	/**
	 * 単位名. Unit name.<p>
	 *
	 */
	public String unit_nm() {
		return getConstString(offset + 11, $unit_nm);
	}

	/**
	 * 単位名. Unit name.<p>
	 *
	 */
	public void unit_nm(String value) {
		setConstString(offset + 11, $unit_nm, value);
	}

	/**
	 * 単位名（ロケール１）. Unit name (Locale 1).<p>
	 *
	 */
	public String unit_nm_lcl1() {
		return getConstString(offset + 12, $unit_nm_lcl1);
	}

	/**
	 * 単位名（ロケール１）. Unit name (Locale 1).<p>
	 *
	 */
	public void unit_nm_lcl1(String value) {
		setConstString(offset + 12, $unit_nm_lcl1, value);
	}

	/**
	 * 単位名（ロケール２）. Unit name (Locale 2).<p>
	 *
	 */
	public String unit_nm_lcl2() {
		return getConstString(offset + 13, $unit_nm_lcl2);
	}

	/**
	 * 単位名（ロケール２）. Unit name (Locale 2).<p>
	 *
	 */
	public void unit_nm_lcl2(String value) {
		setConstString(offset + 13, $unit_nm_lcl2, value);
	}

	/**
	 * 単位名（ロケール３）. Unit name (Locale 3).<p>
	 *
	 */
	public String unit_nm_lcl3() {
		return getConstString(offset + 14, $unit_nm_lcl3);
	}

	/**
	 * 単位名（ロケール３）. Unit name (Locale 3).<p>
	 *
	 */
	public void unit_nm_lcl3(String value) {
		setConstString(offset + 14, $unit_nm_lcl3, value);
	}

	/**
	 * 単位名（ロケール４）. Unit name (Locale 4).<p>
	 *
	 */
	public String unit_nm_lcl4() {
		return getConstString(offset + 15, $unit_nm_lcl4);
	}

	/**
	 * 単位名（ロケール４）. Unit name (Locale 4).<p>
	 *
	 */
	public void unit_nm_lcl4(String value) {
		setConstString(offset + 15, $unit_nm_lcl4, value);
	}

	/**
	 * 単位名（ロケール５）. Unit name (Locale 5).<p>
	 *
	 */
	public String unit_nm_lcl5() {
		return getConstString(offset + 16, $unit_nm_lcl5);
	}

	/**
	 * 単位名（ロケール５）. Unit name (Locale 5).<p>
	 *
	 */
	public void unit_nm_lcl5(String value) {
		setConstString(offset + 16, $unit_nm_lcl5, value);
	}

	/**
	 * 品目区分名. Item type name.<p>
	 *
	 */
	public String itm_typ_nm() {
		return getConstString(offset + 17, $itm_typ_nm);
	}

	/**
	 * 品目区分名. Item type name.<p>
	 *
	 */
	public void itm_typ_nm(String value) {
		setConstString(offset + 17, $itm_typ_nm, value);
	}

	/**
	 * 品目区分名（ロケール１）. Item type name (Locale1).<p>
	 *
	 */
	public String itm_typ_nm_lcl1() {
		return getConstString(offset + 18, $itm_typ_nm_lcl1);
	}

	/**
	 * 品目区分名（ロケール１）. Item type name (Locale1).<p>
	 *
	 */
	public void itm_typ_nm_lcl1(String value) {
		setConstString(offset + 18, $itm_typ_nm_lcl1, value);
	}

	/**
	 * 品目区分名（ロケール２）. Item type name (Locale2).<p>
	 *
	 */
	public String itm_typ_nm_lcl2() {
		return getConstString(offset + 19, $itm_typ_nm_lcl2);
	}

	/**
	 * 品目区分名（ロケール２）. Item type name (Locale2).<p>
	 *
	 */
	public void itm_typ_nm_lcl2(String value) {
		setConstString(offset + 19, $itm_typ_nm_lcl2, value);
	}

	/**
	 * 品目区分名（ロケール３）. Item type name (Locale3).<p>
	 *
	 */
	public String itm_typ_nm_lcl3() {
		return getConstString(offset + 20, $itm_typ_nm_lcl3);
	}

	/**
	 * 品目区分名（ロケール３）. Item type name (Locale3).<p>
	 *
	 */
	public void itm_typ_nm_lcl3(String value) {
		setConstString(offset + 20, $itm_typ_nm_lcl3, value);
	}

	/**
	 * 品目区分名（ロケール４）. Item type name (Locale4).<p>
	 *
	 */
	public String itm_typ_nm_lcl4() {
		return getConstString(offset + 21, $itm_typ_nm_lcl4);
	}

	/**
	 * 品目区分名（ロケール４）. Item type name (Locale4).<p>
	 *
	 */
	public void itm_typ_nm_lcl4(String value) {
		setConstString(offset + 21, $itm_typ_nm_lcl4, value);
	}

	/**
	 * 品目区分名（ロケール５）. Item type name (Locale5).<p>
	 *
	 */
	public String itm_typ_nm_lcl5() {
		return getConstString(offset + 22, $itm_typ_nm_lcl5);
	}

	/**
	 * 品目区分名（ロケール５）. Item type name (Locale5).<p>
	 *
	 */
	public void itm_typ_nm_lcl5(String value) {
		setConstString(offset + 22, $itm_typ_nm_lcl5, value);
	}

	/**
	 * 品目区分詳細名. Item type details name.<p>
	 *
	 */
	public String itm_typ_d_nm() {
		return getConstString(offset + 23, $itm_typ_d_nm);
	}

	/**
	 * 品目区分詳細名. Item type details name.<p>
	 *
	 */
	public void itm_typ_d_nm(String value) {
		setConstString(offset + 23, $itm_typ_d_nm, value);
	}

	/**
	 * 品目区分詳細名（ロケール１）. Item type details name (Locale1).<p>
	 *
	 */
	public String itm_typ_d_nm_lcl1() {
		return getConstString(offset + 24, $itm_typ_d_nm_lcl1);
	}

	/**
	 * 品目区分詳細名（ロケール１）. Item type details name (Locale1).<p>
	 *
	 */
	public void itm_typ_d_nm_lcl1(String value) {
		setConstString(offset + 24, $itm_typ_d_nm_lcl1, value);
	}

	/**
	 * 品目区分詳細名（ロケール２）. Item type details name (Locale2).<p>
	 *
	 */
	public String itm_typ_d_nm_lcl2() {
		return getConstString(offset + 25, $itm_typ_d_nm_lcl2);
	}

	/**
	 * 品目区分詳細名（ロケール２）. Item type details name (Locale2).<p>
	 *
	 */
	public void itm_typ_d_nm_lcl2(String value) {
		setConstString(offset + 25, $itm_typ_d_nm_lcl2, value);
	}

	/**
	 * 品目区分詳細名（ロケール３）. Item type details name (Locale3).<p>
	 *
	 */
	public String itm_typ_d_nm_lcl3() {
		return getConstString(offset + 26, $itm_typ_d_nm_lcl3);
	}

	/**
	 * 品目区分詳細名（ロケール３）. Item type details name (Locale3).<p>
	 *
	 */
	public void itm_typ_d_nm_lcl3(String value) {
		setConstString(offset + 26, $itm_typ_d_nm_lcl3, value);
	}

	/**
	 * 品目区分詳細名（ロケール４）. Item type details name (Locale4).<p>
	 *
	 */
	public String itm_typ_d_nm_lcl4() {
		return getConstString(offset + 27, $itm_typ_d_nm_lcl4);
	}

	/**
	 * 品目区分詳細名（ロケール４）. Item type details name (Locale4).<p>
	 *
	 */
	public void itm_typ_d_nm_lcl4(String value) {
		setConstString(offset + 27, $itm_typ_d_nm_lcl4, value);
	}

	/**
	 * 品目区分詳細名（ロケール５）. Item type details name (Locale5).<p>
	 *
	 */
	public String itm_typ_d_nm_lcl5() {
		return getConstString(offset + 28, $itm_typ_d_nm_lcl5);
	}

	/**
	 * 品目区分詳細名（ロケール５）. Item type details name (Locale5).<p>
	 *
	 */
	public void itm_typ_d_nm_lcl5(String value) {
		setConstString(offset + 28, $itm_typ_d_nm_lcl5, value);
	}

	/**
	 * 品目仕訳名. Item journal name.<p>
	 *
	 */
	public String itm_jnl_nm() {
		return getConstString(offset + 29, $itm_jnl_nm);
	}

	/**
	 * 品目仕訳名. Item journal name.<p>
	 *
	 */
	public void itm_jnl_nm(String value) {
		setConstString(offset + 29, $itm_jnl_nm, value);
	}

	/**
	 * 品目仕訳名（ロケール１）. Item journal name (Locale1).<p>
	 *
	 */
	public String itm_jnl_nm_lcl1() {
		return getConstString(offset + 30, $itm_jnl_nm_lcl1);
	}

	/**
	 * 品目仕訳名（ロケール１）. Item journal name (Locale1).<p>
	 *
	 */
	public void itm_jnl_nm_lcl1(String value) {
		setConstString(offset + 30, $itm_jnl_nm_lcl1, value);
	}

	/**
	 * 品目仕訳名（ロケール２）. Item journal name (Locale2).<p>
	 *
	 */
	public String itm_jnl_nm_lcl2() {
		return getConstString(offset + 31, $itm_jnl_nm_lcl2);
	}

	/**
	 * 品目仕訳名（ロケール２）. Item journal name (Locale2).<p>
	 *
	 */
	public void itm_jnl_nm_lcl2(String value) {
		setConstString(offset + 31, $itm_jnl_nm_lcl2, value);
	}

	/**
	 * 品目仕訳名（ロケール３）. Item journal name (Locale3).<p>
	 *
	 */
	public String itm_jnl_nm_lcl3() {
		return getConstString(offset + 32, $itm_jnl_nm_lcl3);
	}

	/**
	 * 品目仕訳名（ロケール３）. Item journal name (Locale3).<p>
	 *
	 */
	public void itm_jnl_nm_lcl3(String value) {
		setConstString(offset + 32, $itm_jnl_nm_lcl3, value);
	}

	/**
	 * 品目仕訳名（ロケール４）. Item journal name (Locale4).<p>
	 *
	 */
	public String itm_jnl_nm_lcl4() {
		return getConstString(offset + 33, $itm_jnl_nm_lcl4);
	}

	/**
	 * 品目仕訳名（ロケール４）. Item journal name (Locale4).<p>
	 *
	 */
	public void itm_jnl_nm_lcl4(String value) {
		setConstString(offset + 33, $itm_jnl_nm_lcl4, value);
	}

	/**
	 * 品目仕訳名（ロケール５）. Item journal name (Locale5).<p>
	 *
	 */
	public String itm_jnl_nm_lcl5() {
		return getConstString(offset + 34, $itm_jnl_nm_lcl5);
	}

	/**
	 * 品目仕訳名（ロケール５）. Item journal name (Locale5).<p>
	 *
	 */
	public void itm_jnl_nm_lcl5(String value) {
		setConstString(offset + 34, $itm_jnl_nm_lcl5, value);
	}

	/**
	 * 会計品目分類名. Accounting item classification name.<p>
	 *
	 */
	public String ac_itm_grp_nm() {
		return getConstString(offset + 35, $ac_itm_grp_nm);
	}

	/**
	 * 会計品目分類名. Accounting item classification name.<p>
	 *
	 */
	public void ac_itm_grp_nm(String value) {
		setConstString(offset + 35, $ac_itm_grp_nm, value);
	}

	/**
	 * 会計品目分類名（ロケール１）. Accounting item classification name (Locale1).<p>
	 *
	 */
	public String ac_itm_grp_nm_lcl1() {
		return getConstString(offset + 36, $ac_itm_grp_nm_lcl1);
	}

	/**
	 * 会計品目分類名（ロケール１）. Accounting item classification name (Locale1).<p>
	 *
	 */
	public void ac_itm_grp_nm_lcl1(String value) {
		setConstString(offset + 36, $ac_itm_grp_nm_lcl1, value);
	}

	/**
	 * 会計品目分類名（ロケール２）. Accounting item classification name (Locale2).<p>
	 *
	 */
	public String ac_itm_grp_nm_lcl2() {
		return getConstString(offset + 37, $ac_itm_grp_nm_lcl2);
	}

	/**
	 * 会計品目分類名（ロケール２）. Accounting item classification name (Locale2).<p>
	 *
	 */
	public void ac_itm_grp_nm_lcl2(String value) {
		setConstString(offset + 37, $ac_itm_grp_nm_lcl2, value);
	}

	/**
	 * 会計品目分類名（ロケール３）. Accounting item classification name (Locale3).<p>
	 *
	 */
	public String ac_itm_grp_nm_lcl3() {
		return getConstString(offset + 38, $ac_itm_grp_nm_lcl3);
	}

	/**
	 * 会計品目分類名（ロケール３）. Accounting item classification name (Locale3).<p>
	 *
	 */
	public void ac_itm_grp_nm_lcl3(String value) {
		setConstString(offset + 38, $ac_itm_grp_nm_lcl3, value);
	}

	/**
	 * 会計品目分類名（ロケール４）. Accounting item classification name (Locale4).<p>
	 *
	 */
	public String ac_itm_grp_nm_lcl4() {
		return getConstString(offset + 39, $ac_itm_grp_nm_lcl4);
	}

	/**
	 * 会計品目分類名（ロケール４）. Accounting item classification name (Locale4).<p>
	 *
	 */
	public void ac_itm_grp_nm_lcl4(String value) {
		setConstString(offset + 39, $ac_itm_grp_nm_lcl4, value);
	}

	/**
	 * 会計品目分類名（ロケール５）. Accounting item classification name (Locale5).<p>
	 *
	 */
	public String ac_itm_grp_nm_lcl5() {
		return getConstString(offset + 40, $ac_itm_grp_nm_lcl5);
	}

	/**
	 * 会計品目分類名（ロケール５）. Accounting item classification name (Locale5).<p>
	 *
	 */
	public void ac_itm_grp_nm_lcl5(String value) {
		setConstString(offset + 40, $ac_itm_grp_nm_lcl5, value);
	}

	/**
	 * 品目分類ＣＤ１. Item classification cd. 1.<p>
	 *
	 */
	public String itm_grp_cd1() {
		return getConstString(offset + 41, $itm_grp_cd1);
	}

	/**
	 * 品目分類ＣＤ１. Item classification cd. 1.<p>
	 *
	 */
	public void itm_grp_cd1(String value) {
		setConstString(offset + 41, $itm_grp_cd1, value);
	}

	/**
	 * 品目分類名１. Item classification name 1.<p>
	 *
	 */
	public String itm_grp_nm1() {
		return getConstString(offset + 42, $itm_grp_nm1);
	}

	/**
	 * 品目分類名１. Item classification name 1.<p>
	 *
	 */
	public void itm_grp_nm1(String value) {
		setConstString(offset + 42, $itm_grp_nm1, value);
	}

	/**
	 * 品目分類名１（ロケール１）. Item classification name 1 (Locale1).<p>
	 *
	 */
	public String itm_grp_nm1_lcl1() {
		return getConstString(offset + 43, $itm_grp_nm1_lcl1);
	}

	/**
	 * 品目分類名１（ロケール１）. Item classification name 1 (Locale1).<p>
	 *
	 */
	public void itm_grp_nm1_lcl1(String value) {
		setConstString(offset + 43, $itm_grp_nm1_lcl1, value);
	}

	/**
	 * 品目分類名１（ロケール２）. Item classification name 1 (Locale2).<p>
	 *
	 */
	public String itm_grp_nm1_lcl2() {
		return getConstString(offset + 44, $itm_grp_nm1_lcl2);
	}

	/**
	 * 品目分類名１（ロケール２）. Item classification name 1 (Locale2).<p>
	 *
	 */
	public void itm_grp_nm1_lcl2(String value) {
		setConstString(offset + 44, $itm_grp_nm1_lcl2, value);
	}

	/**
	 * 品目分類名１（ロケール３）. Item classification name 1 (Locale3).<p>
	 *
	 */
	public String itm_grp_nm1_lcl3() {
		return getConstString(offset + 45, $itm_grp_nm1_lcl3);
	}

	/**
	 * 品目分類名１（ロケール３）. Item classification name 1 (Locale3).<p>
	 *
	 */
	public void itm_grp_nm1_lcl3(String value) {
		setConstString(offset + 45, $itm_grp_nm1_lcl3, value);
	}

	/**
	 * 品目分類名１（ロケール４）. Item classification name 1 (Locale4).<p>
	 *
	 */
	public String itm_grp_nm1_lcl4() {
		return getConstString(offset + 46, $itm_grp_nm1_lcl4);
	}

	/**
	 * 品目分類名１（ロケール４）. Item classification name 1 (Locale4).<p>
	 *
	 */
	public void itm_grp_nm1_lcl4(String value) {
		setConstString(offset + 46, $itm_grp_nm1_lcl4, value);
	}

	/**
	 * 品目分類名１（ロケール５）. Item classification name 1 (Locale5).<p>
	 *
	 */
	public String itm_grp_nm1_lcl5() {
		return getConstString(offset + 47, $itm_grp_nm1_lcl5);
	}

	/**
	 * 品目分類名１（ロケール５）. Item classification name 1 (Locale5).<p>
	 *
	 */
	public void itm_grp_nm1_lcl5(String value) {
		setConstString(offset + 47, $itm_grp_nm1_lcl5, value);
	}

	/**
	 * 品目分類ＣＤ２. Item classification cd. 2.<p>
	 *
	 */
	public String itm_grp_cd2() {
		return getConstString(offset + 48, $itm_grp_cd2);
	}

	/**
	 * 品目分類ＣＤ２. Item classification cd. 2.<p>
	 *
	 */
	public void itm_grp_cd2(String value) {
		setConstString(offset + 48, $itm_grp_cd2, value);
	}

	/**
	 * 品目分類名２. Item classification name 2.<p>
	 *
	 */
	public String itm_grp_nm2() {
		return getConstString(offset + 49, $itm_grp_nm2);
	}

	/**
	 * 品目分類名２. Item classification name 2.<p>
	 *
	 */
	public void itm_grp_nm2(String value) {
		setConstString(offset + 49, $itm_grp_nm2, value);
	}

	/**
	 * 品目分類名２（ロケール１）. Item classification name 2 (Locale1).<p>
	 *
	 */
	public String itm_grp_nm2_lcl1() {
		return getConstString(offset + 50, $itm_grp_nm2_lcl1);
	}

	/**
	 * 品目分類名２（ロケール１）. Item classification name 2 (Locale1).<p>
	 *
	 */
	public void itm_grp_nm2_lcl1(String value) {
		setConstString(offset + 50, $itm_grp_nm2_lcl1, value);
	}

	/**
	 * 品目分類名２（ロケール２）. Item classification name 2 (Locale2).<p>
	 *
	 */
	public String itm_grp_nm2_lcl2() {
		return getConstString(offset + 51, $itm_grp_nm2_lcl2);
	}

	/**
	 * 品目分類名２（ロケール２）. Item classification name 2 (Locale2).<p>
	 *
	 */
	public void itm_grp_nm2_lcl2(String value) {
		setConstString(offset + 51, $itm_grp_nm2_lcl2, value);
	}

	/**
	 * 品目分類名２（ロケール３）. Item classification name 2 (Locale3).<p>
	 *
	 */
	public String itm_grp_nm2_lcl3() {
		return getConstString(offset + 52, $itm_grp_nm2_lcl3);
	}

	/**
	 * 品目分類名２（ロケール３）. Item classification name 2 (Locale3).<p>
	 *
	 */
	public void itm_grp_nm2_lcl3(String value) {
		setConstString(offset + 52, $itm_grp_nm2_lcl3, value);
	}

	/**
	 * 品目分類名２（ロケール４）. Item classification name 2 (Locale4).<p>
	 *
	 */
	public String itm_grp_nm2_lcl4() {
		return getConstString(offset + 53, $itm_grp_nm2_lcl4);
	}

	/**
	 * 品目分類名２（ロケール４）. Item classification name 2 (Locale4).<p>
	 *
	 */
	public void itm_grp_nm2_lcl4(String value) {
		setConstString(offset + 53, $itm_grp_nm2_lcl4, value);
	}

	/**
	 * 品目分類名２（ロケール５）. Item classification name 2 (Locale5).<p>
	 *
	 */
	public String itm_grp_nm2_lcl5() {
		return getConstString(offset + 54, $itm_grp_nm2_lcl5);
	}

	/**
	 * 品目分類名２（ロケール５）. Item classification name 2 (Locale5).<p>
	 *
	 */
	public void itm_grp_nm2_lcl5(String value) {
		setConstString(offset + 54, $itm_grp_nm2_lcl5, value);
	}

	/**
	 * 品目分類ＣＤ３. Item classification cd. 3.<p>
	 *
	 */
	public String itm_grp_cd3() {
		return getConstString(offset + 55, $itm_grp_cd3);
	}

	/**
	 * 品目分類ＣＤ３. Item classification cd. 3.<p>
	 *
	 */
	public void itm_grp_cd3(String value) {
		setConstString(offset + 55, $itm_grp_cd3, value);
	}

	/**
	 * 品目分類名３. Item classification name 3.<p>
	 *
	 */
	public String itm_grp_nm3() {
		return getConstString(offset + 56, $itm_grp_nm3);
	}

	/**
	 * 品目分類名３. Item classification name 3.<p>
	 *
	 */
	public void itm_grp_nm3(String value) {
		setConstString(offset + 56, $itm_grp_nm3, value);
	}

	/**
	 * 品目分類名３（ロケール１）. Item classification name 3 (Locale1).<p>
	 *
	 */
	public String itm_grp_nm3_lcl1() {
		return getConstString(offset + 57, $itm_grp_nm3_lcl1);
	}

	/**
	 * 品目分類名３（ロケール１）. Item classification name 3 (Locale1).<p>
	 *
	 */
	public void itm_grp_nm3_lcl1(String value) {
		setConstString(offset + 57, $itm_grp_nm3_lcl1, value);
	}

	/**
	 * 品目分類名３（ロケール２）. Item classification name 3 (Locale2).<p>
	 *
	 */
	public String itm_grp_nm3_lcl2() {
		return getConstString(offset + 58, $itm_grp_nm3_lcl2);
	}

	/**
	 * 品目分類名３（ロケール２）. Item classification name 3 (Locale2).<p>
	 *
	 */
	public void itm_grp_nm3_lcl2(String value) {
		setConstString(offset + 58, $itm_grp_nm3_lcl2, value);
	}

	/**
	 * 品目分類名３（ロケール３）. Item classification name 3 (Locale3).<p>
	 *
	 */
	public String itm_grp_nm3_lcl3() {
		return getConstString(offset + 59, $itm_grp_nm3_lcl3);
	}

	/**
	 * 品目分類名３（ロケール３）. Item classification name 3 (Locale3).<p>
	 *
	 */
	public void itm_grp_nm3_lcl3(String value) {
		setConstString(offset + 59, $itm_grp_nm3_lcl3, value);
	}

	/**
	 * 品目分類名３（ロケール４）. Item classification name 3 (Locale4).<p>
	 *
	 */
	public String itm_grp_nm3_lcl4() {
		return getConstString(offset + 60, $itm_grp_nm3_lcl4);
	}

	/**
	 * 品目分類名３（ロケール４）. Item classification name 3 (Locale4).<p>
	 *
	 */
	public void itm_grp_nm3_lcl4(String value) {
		setConstString(offset + 60, $itm_grp_nm3_lcl4, value);
	}

	/**
	 * 品目分類名３（ロケール５）. Item classification name 3 (Locale5).<p>
	 *
	 */
	public String itm_grp_nm3_lcl5() {
		return getConstString(offset + 61, $itm_grp_nm3_lcl5);
	}

	/**
	 * 品目分類名３（ロケール５）. Item classification name 3 (Locale5).<p>
	 *
	 */
	public void itm_grp_nm3_lcl5(String value) {
		setConstString(offset + 61, $itm_grp_nm3_lcl5, value);
	}

	/**
	 * 品目分類ＣＤ４. Item classification cd. 4.<p>
	 *
	 */
	public String itm_grp_cd4() {
		return getConstString(offset + 62, $itm_grp_cd4);
	}

	/**
	 * 品目分類ＣＤ４. Item classification cd. 4.<p>
	 *
	 */
	public void itm_grp_cd4(String value) {
		setConstString(offset + 62, $itm_grp_cd4, value);
	}

	/**
	 * 品目分類名４. Item classification name 4.<p>
	 *
	 */
	public String itm_grp_nm4() {
		return getConstString(offset + 63, $itm_grp_nm4);
	}

	/**
	 * 品目分類名４. Item classification name 4.<p>
	 *
	 */
	public void itm_grp_nm4(String value) {
		setConstString(offset + 63, $itm_grp_nm4, value);
	}

	/**
	 * 品目分類名４（ロケール１）. Item classification name 4 (Locale1).<p>
	 *
	 */
	public String itm_grp_nm4_lcl1() {
		return getConstString(offset + 64, $itm_grp_nm4_lcl1);
	}

	/**
	 * 品目分類名４（ロケール１）. Item classification name 4 (Locale1).<p>
	 *
	 */
	public void itm_grp_nm4_lcl1(String value) {
		setConstString(offset + 64, $itm_grp_nm4_lcl1, value);
	}

	/**
	 * 品目分類名４（ロケール２）. Item classification name 4 (Locale2).<p>
	 *
	 */
	public String itm_grp_nm4_lcl2() {
		return getConstString(offset + 65, $itm_grp_nm4_lcl2);
	}

	/**
	 * 品目分類名４（ロケール２）. Item classification name 4 (Locale2).<p>
	 *
	 */
	public void itm_grp_nm4_lcl2(String value) {
		setConstString(offset + 65, $itm_grp_nm4_lcl2, value);
	}

	/**
	 * 品目分類名４（ロケール３）. Item classification name 4 (Locale3).<p>
	 *
	 */
	public String itm_grp_nm4_lcl3() {
		return getConstString(offset + 66, $itm_grp_nm4_lcl3);
	}

	/**
	 * 品目分類名４（ロケール３）. Item classification name 4 (Locale3).<p>
	 *
	 */
	public void itm_grp_nm4_lcl3(String value) {
		setConstString(offset + 66, $itm_grp_nm4_lcl3, value);
	}

	/**
	 * 品目分類名４（ロケール４）. Item classification name 4 (Locale4).<p>
	 *
	 */
	public String itm_grp_nm4_lcl4() {
		return getConstString(offset + 67, $itm_grp_nm4_lcl4);
	}

	/**
	 * 品目分類名４（ロケール４）. Item classification name 4 (Locale4).<p>
	 *
	 */
	public void itm_grp_nm4_lcl4(String value) {
		setConstString(offset + 67, $itm_grp_nm4_lcl4, value);
	}

	/**
	 * 品目分類名４（ロケール５）. Item classification name 4 (Locale5).<p>
	 *
	 */
	public String itm_grp_nm4_lcl5() {
		return getConstString(offset + 68, $itm_grp_nm4_lcl5);
	}

	/**
	 * 品目分類名４（ロケール５）. Item classification name 4 (Locale5).<p>
	 *
	 */
	public void itm_grp_nm4_lcl5(String value) {
		setConstString(offset + 68, $itm_grp_nm4_lcl5, value);
	}

	/**
	 * 品目分類ＣＤ５. Item classification cd. 5.<p>
	 *
	 */
	public String itm_grp_cd5() {
		return getConstString(offset + 69, $itm_grp_cd5);
	}

	/**
	 * 品目分類ＣＤ５. Item classification cd. 5.<p>
	 *
	 */
	public void itm_grp_cd5(String value) {
		setConstString(offset + 69, $itm_grp_cd5, value);
	}

	/**
	 * 品目分類名５. Item classification name 5.<p>
	 *
	 */
	public String itm_grp_nm5() {
		return getConstString(offset + 70, $itm_grp_nm5);
	}

	/**
	 * 品目分類名５. Item classification name 5.<p>
	 *
	 */
	public void itm_grp_nm5(String value) {
		setConstString(offset + 70, $itm_grp_nm5, value);
	}

	/**
	 * 品目分類名５（ロケール１）. Item classification name 5 (Locale1).<p>
	 *
	 */
	public String itm_grp_nm5_lcl1() {
		return getConstString(offset + 71, $itm_grp_nm5_lcl1);
	}

	/**
	 * 品目分類名５（ロケール１）. Item classification name 5 (Locale1).<p>
	 *
	 */
	public void itm_grp_nm5_lcl1(String value) {
		setConstString(offset + 71, $itm_grp_nm5_lcl1, value);
	}

	/**
	 * 品目分類名５（ロケール２）. Item classification name 5 (Locale2).<p>
	 *
	 */
	public String itm_grp_nm5_lcl2() {
		return getConstString(offset + 72, $itm_grp_nm5_lcl2);
	}

	/**
	 * 品目分類名５（ロケール２）. Item classification name 5 (Locale2).<p>
	 *
	 */
	public void itm_grp_nm5_lcl2(String value) {
		setConstString(offset + 72, $itm_grp_nm5_lcl2, value);
	}

	/**
	 * 品目分類名５（ロケール３）. Item classification name 5 (Locale3).<p>
	 *
	 */
	public String itm_grp_nm5_lcl3() {
		return getConstString(offset + 73, $itm_grp_nm5_lcl3);
	}

	/**
	 * 品目分類名５（ロケール３）. Item classification name 5 (Locale3).<p>
	 *
	 */
	public void itm_grp_nm5_lcl3(String value) {
		setConstString(offset + 73, $itm_grp_nm5_lcl3, value);
	}

	/**
	 * 品目分類名５（ロケール４）. Item classification name 5 (Locale4).<p>
	 *
	 */
	public String itm_grp_nm5_lcl4() {
		return getConstString(offset + 74, $itm_grp_nm5_lcl4);
	}

	/**
	 * 品目分類名５（ロケール４）. Item classification name 5 (Locale4).<p>
	 *
	 */
	public void itm_grp_nm5_lcl4(String value) {
		setConstString(offset + 74, $itm_grp_nm5_lcl4, value);
	}

	/**
	 * 品目分類名５（ロケール５）. Item classification name 5 (Locale5).<p>
	 *
	 */
	public String itm_grp_nm5_lcl5() {
		return getConstString(offset + 75, $itm_grp_nm5_lcl5);
	}

	/**
	 * 品目分類名５（ロケール５）. Item classification name 5 (Locale5).<p>
	 *
	 */
	public void itm_grp_nm5_lcl5(String value) {
		setConstString(offset + 75, $itm_grp_nm5_lcl5, value);
	}

	/**
	 * 品目分類ＣＤ６. Item classification cd. 6.<p>
	 *
	 */
	public String itm_grp_cd6() {
		return getConstString(offset + 76, $itm_grp_cd6);
	}

	/**
	 * 品目分類ＣＤ６. Item classification cd. 6.<p>
	 *
	 */
	public void itm_grp_cd6(String value) {
		setConstString(offset + 76, $itm_grp_cd6, value);
	}

	/**
	 * 品目分類名６. Item classification name 6.<p>
	 *
	 */
	public String itm_grp_nm6() {
		return getConstString(offset + 77, $itm_grp_nm6);
	}

	/**
	 * 品目分類名６. Item classification name 6.<p>
	 *
	 */
	public void itm_grp_nm6(String value) {
		setConstString(offset + 77, $itm_grp_nm6, value);
	}

	/**
	 * 品目分類名６（ロケール１）. Item classification name 6 (Locale1).<p>
	 *
	 */
	public String itm_grp_nm6_lcl1() {
		return getConstString(offset + 78, $itm_grp_nm6_lcl1);
	}

	/**
	 * 品目分類名６（ロケール１）. Item classification name 6 (Locale1).<p>
	 *
	 */
	public void itm_grp_nm6_lcl1(String value) {
		setConstString(offset + 78, $itm_grp_nm6_lcl1, value);
	}

	/**
	 * 品目分類名６（ロケール２）. Item classification name 6 (Locale2).<p>
	 *
	 */
	public String itm_grp_nm6_lcl2() {
		return getConstString(offset + 79, $itm_grp_nm6_lcl2);
	}

	/**
	 * 品目分類名６（ロケール２）. Item classification name 6 (Locale2).<p>
	 *
	 */
	public void itm_grp_nm6_lcl2(String value) {
		setConstString(offset + 79, $itm_grp_nm6_lcl2, value);
	}

	/**
	 * 品目分類名６（ロケール３）. Item classification name 6 (Locale3).<p>
	 *
	 */
	public String itm_grp_nm6_lcl3() {
		return getConstString(offset + 80, $itm_grp_nm6_lcl3);
	}

	/**
	 * 品目分類名６（ロケール３）. Item classification name 6 (Locale3).<p>
	 *
	 */
	public void itm_grp_nm6_lcl3(String value) {
		setConstString(offset + 80, $itm_grp_nm6_lcl3, value);
	}

	/**
	 * 品目分類名６（ロケール４）. Item classification name 6 (Locale4).<p>
	 *
	 */
	public String itm_grp_nm6_lcl4() {
		return getConstString(offset + 81, $itm_grp_nm6_lcl4);
	}

	/**
	 * 品目分類名６（ロケール４）. Item classification name 6 (Locale4).<p>
	 *
	 */
	public void itm_grp_nm6_lcl4(String value) {
		setConstString(offset + 81, $itm_grp_nm6_lcl4, value);
	}

	/**
	 * 品目分類名６（ロケール５）. Item classification name 6 (Locale5).<p>
	 *
	 */
	public String itm_grp_nm6_lcl5() {
		return getConstString(offset + 82, $itm_grp_nm6_lcl5);
	}

	/**
	 * 品目分類名６（ロケール５）. Item classification name 6 (Locale5).<p>
	 *
	 */
	public void itm_grp_nm6_lcl5(String value) {
		setConstString(offset + 82, $itm_grp_nm6_lcl5, value);
	}

	/**
	 * 品目分類ＣＤ７. Item classification cd. 7.<p>
	 *
	 */
	public String itm_grp_cd7() {
		return getConstString(offset + 83, $itm_grp_cd7);
	}

	/**
	 * 品目分類ＣＤ７. Item classification cd. 7.<p>
	 *
	 */
	public void itm_grp_cd7(String value) {
		setConstString(offset + 83, $itm_grp_cd7, value);
	}

	/**
	 * 品目分類名７. Item classification name 7.<p>
	 *
	 */
	public String itm_grp_nm7() {
		return getConstString(offset + 84, $itm_grp_nm7);
	}

	/**
	 * 品目分類名７. Item classification name 7.<p>
	 *
	 */
	public void itm_grp_nm7(String value) {
		setConstString(offset + 84, $itm_grp_nm7, value);
	}

	/**
	 * 品目分類名７（ロケール１）. Item classification name 7 (Locale1).<p>
	 *
	 */
	public String itm_grp_nm7_lcl1() {
		return getConstString(offset + 85, $itm_grp_nm7_lcl1);
	}

	/**
	 * 品目分類名７（ロケール１）. Item classification name 7 (Locale1).<p>
	 *
	 */
	public void itm_grp_nm7_lcl1(String value) {
		setConstString(offset + 85, $itm_grp_nm7_lcl1, value);
	}

	/**
	 * 品目分類名７（ロケール２）. Item classification name 7 (Locale2).<p>
	 *
	 */
	public String itm_grp_nm7_lcl2() {
		return getConstString(offset + 86, $itm_grp_nm7_lcl2);
	}

	/**
	 * 品目分類名７（ロケール２）. Item classification name 7 (Locale2).<p>
	 *
	 */
	public void itm_grp_nm7_lcl2(String value) {
		setConstString(offset + 86, $itm_grp_nm7_lcl2, value);
	}

	/**
	 * 品目分類名７（ロケール３）. Item classification name 7 (Locale3).<p>
	 *
	 */
	public String itm_grp_nm7_lcl3() {
		return getConstString(offset + 87, $itm_grp_nm7_lcl3);
	}

	/**
	 * 品目分類名７（ロケール３）. Item classification name 7 (Locale3).<p>
	 *
	 */
	public void itm_grp_nm7_lcl3(String value) {
		setConstString(offset + 87, $itm_grp_nm7_lcl3, value);
	}

	/**
	 * 品目分類名７（ロケール４）. Item classification name 7 (Locale4).<p>
	 *
	 */
	public String itm_grp_nm7_lcl4() {
		return getConstString(offset + 88, $itm_grp_nm7_lcl4);
	}

	/**
	 * 品目分類名７（ロケール４）. Item classification name 7 (Locale4).<p>
	 *
	 */
	public void itm_grp_nm7_lcl4(String value) {
		setConstString(offset + 88, $itm_grp_nm7_lcl4, value);
	}

	/**
	 * 品目分類名７（ロケール５）. Item classification name 7 (Locale5).<p>
	 *
	 */
	public String itm_grp_nm7_lcl5() {
		return getConstString(offset + 89, $itm_grp_nm7_lcl5);
	}

	/**
	 * 品目分類名７（ロケール５）. Item classification name 7 (Locale5).<p>
	 *
	 */
	public void itm_grp_nm7_lcl5(String value) {
		setConstString(offset + 89, $itm_grp_nm7_lcl5, value);
	}

	/**
	 * 品目分類ＣＤ８. Item classification cd. 8.<p>
	 *
	 */
	public String itm_grp_cd8() {
		return getConstString(offset + 90, $itm_grp_cd8);
	}

	/**
	 * 品目分類ＣＤ８. Item classification cd. 8.<p>
	 *
	 */
	public void itm_grp_cd8(String value) {
		setConstString(offset + 90, $itm_grp_cd8, value);
	}

	/**
	 * 品目分類名８. Item classification name 8.<p>
	 *
	 */
	public String itm_grp_nm8() {
		return getConstString(offset + 91, $itm_grp_nm8);
	}

	/**
	 * 品目分類名８. Item classification name 8.<p>
	 *
	 */
	public void itm_grp_nm8(String value) {
		setConstString(offset + 91, $itm_grp_nm8, value);
	}

	/**
	 * 品目分類名８（ロケール１）. Item classification name 8 (Locale1).<p>
	 *
	 */
	public String itm_grp_nm8_lcl1() {
		return getConstString(offset + 92, $itm_grp_nm8_lcl1);
	}

	/**
	 * 品目分類名８（ロケール１）. Item classification name 8 (Locale1).<p>
	 *
	 */
	public void itm_grp_nm8_lcl1(String value) {
		setConstString(offset + 92, $itm_grp_nm8_lcl1, value);
	}

	/**
	 * 品目分類名８（ロケール２）. Item classification name 8 (Locale2).<p>
	 *
	 */
	public String itm_grp_nm8_lcl2() {
		return getConstString(offset + 93, $itm_grp_nm8_lcl2);
	}

	/**
	 * 品目分類名８（ロケール２）. Item classification name 8 (Locale2).<p>
	 *
	 */
	public void itm_grp_nm8_lcl2(String value) {
		setConstString(offset + 93, $itm_grp_nm8_lcl2, value);
	}

	/**
	 * 品目分類名８（ロケール３）. Item classification name 8 (Locale3).<p>
	 *
	 */
	public String itm_grp_nm8_lcl3() {
		return getConstString(offset + 94, $itm_grp_nm8_lcl3);
	}

	/**
	 * 品目分類名８（ロケール３）. Item classification name 8 (Locale3).<p>
	 *
	 */
	public void itm_grp_nm8_lcl3(String value) {
		setConstString(offset + 94, $itm_grp_nm8_lcl3, value);
	}

	/**
	 * 品目分類名８（ロケール４）. Item classification name 8 (Locale4).<p>
	 *
	 */
	public String itm_grp_nm8_lcl4() {
		return getConstString(offset + 95, $itm_grp_nm8_lcl4);
	}

	/**
	 * 品目分類名８（ロケール４）. Item classification name 8 (Locale4).<p>
	 *
	 */
	public void itm_grp_nm8_lcl4(String value) {
		setConstString(offset + 95, $itm_grp_nm8_lcl4, value);
	}

	/**
	 * 品目分類名８（ロケール５）. Item classification name 8 (Locale5).<p>
	 *
	 */
	public String itm_grp_nm8_lcl5() {
		return getConstString(offset + 96, $itm_grp_nm8_lcl5);
	}

	/**
	 * 品目分類名８（ロケール５）. Item classification name 8 (Locale5).<p>
	 *
	 */
	public void itm_grp_nm8_lcl5(String value) {
		setConstString(offset + 96, $itm_grp_nm8_lcl5, value);
	}

	/**
	 * 品目分類ＣＤ９. Item classification cd. 9.<p>
	 *
	 */
	public String itm_grp_cd9() {
		return getConstString(offset + 97, $itm_grp_cd9);
	}

	/**
	 * 品目分類ＣＤ９. Item classification cd. 9.<p>
	 *
	 */
	public void itm_grp_cd9(String value) {
		setConstString(offset + 97, $itm_grp_cd9, value);
	}

	/**
	 * 品目分類名９. Item classification name 9.<p>
	 *
	 */
	public String itm_grp_nm9() {
		return getConstString(offset + 98, $itm_grp_nm9);
	}

	/**
	 * 品目分類名９. Item classification name 9.<p>
	 *
	 */
	public void itm_grp_nm9(String value) {
		setConstString(offset + 98, $itm_grp_nm9, value);
	}

	/**
	 * 品目分類名９（ロケール１）. Item classification name 9 (Locale1).<p>
	 *
	 */
	public String itm_grp_nm9_lcl1() {
		return getConstString(offset + 99, $itm_grp_nm9_lcl1);
	}

	/**
	 * 品目分類名９（ロケール１）. Item classification name 9 (Locale1).<p>
	 *
	 */
	public void itm_grp_nm9_lcl1(String value) {
		setConstString(offset + 99, $itm_grp_nm9_lcl1, value);
	}

	/**
	 * 品目分類名９（ロケール２）. Item classification name 9 (Locale2).<p>
	 *
	 */
	public String itm_grp_nm9_lcl2() {
		return getConstString(offset + 100, $itm_grp_nm9_lcl2);
	}

	/**
	 * 品目分類名９（ロケール２）. Item classification name 9 (Locale2).<p>
	 *
	 */
	public void itm_grp_nm9_lcl2(String value) {
		setConstString(offset + 100, $itm_grp_nm9_lcl2, value);
	}

	/**
	 * 品目分類名９（ロケール３）. Item classification name 9 (Locale3).<p>
	 *
	 */
	public String itm_grp_nm9_lcl3() {
		return getConstString(offset + 101, $itm_grp_nm9_lcl3);
	}

	/**
	 * 品目分類名９（ロケール３）. Item classification name 9 (Locale3).<p>
	 *
	 */
	public void itm_grp_nm9_lcl3(String value) {
		setConstString(offset + 101, $itm_grp_nm9_lcl3, value);
	}

	/**
	 * 品目分類名９（ロケール４）. Item classification name 9 (Locale4).<p>
	 *
	 */
	public String itm_grp_nm9_lcl4() {
		return getConstString(offset + 102, $itm_grp_nm9_lcl4);
	}

	/**
	 * 品目分類名９（ロケール４）. Item classification name 9 (Locale4).<p>
	 *
	 */
	public void itm_grp_nm9_lcl4(String value) {
		setConstString(offset + 102, $itm_grp_nm9_lcl4, value);
	}

	/**
	 * 品目分類名９（ロケール５）. Item classification name 9 (Locale5).<p>
	 *
	 */
	public String itm_grp_nm9_lcl5() {
		return getConstString(offset + 103, $itm_grp_nm9_lcl5);
	}

	/**
	 * 品目分類名９（ロケール５）. Item classification name 9 (Locale5).<p>
	 *
	 */
	public void itm_grp_nm9_lcl5(String value) {
		setConstString(offset + 103, $itm_grp_nm9_lcl5, value);
	}

	/**
	 * 品目分類ＣＤ１０. Item classification cd. 10.<p>
	 *
	 */
	public String itm_grp_cd10() {
		return getConstString(offset + 104, $itm_grp_cd10);
	}

	/**
	 * 品目分類ＣＤ１０. Item classification cd. 10.<p>
	 *
	 */
	public void itm_grp_cd10(String value) {
		setConstString(offset + 104, $itm_grp_cd10, value);
	}

	/**
	 * 品目分類名１０. Item classification name 10.<p>
	 *
	 */
	public String itm_grp_nm10() {
		return getConstString(offset + 105, $itm_grp_nm10);
	}

	/**
	 * 品目分類名１０. Item classification name 10.<p>
	 *
	 */
	public void itm_grp_nm10(String value) {
		setConstString(offset + 105, $itm_grp_nm10, value);
	}

	/**
	 * 品目分類名１０（ロケール１）. Item classification name 10 (Locale1).<p>
	 *
	 */
	public String itm_grp_nm10_lcl1() {
		return getConstString(offset + 106, $itm_grp_nm10_lcl1);
	}

	/**
	 * 品目分類名１０（ロケール１）. Item classification name 10 (Locale1).<p>
	 *
	 */
	public void itm_grp_nm10_lcl1(String value) {
		setConstString(offset + 106, $itm_grp_nm10_lcl1, value);
	}

	/**
	 * 品目分類名１０（ロケール２）. Item classification name 10 (Locale2).<p>
	 *
	 */
	public String itm_grp_nm10_lcl2() {
		return getConstString(offset + 107, $itm_grp_nm10_lcl2);
	}

	/**
	 * 品目分類名１０（ロケール２）. Item classification name 10 (Locale2).<p>
	 *
	 */
	public void itm_grp_nm10_lcl2(String value) {
		setConstString(offset + 107, $itm_grp_nm10_lcl2, value);
	}

	/**
	 * 品目分類名１０（ロケール３）. Item classification name 10 (Locale3).<p>
	 *
	 */
	public String itm_grp_nm10_lcl3() {
		return getConstString(offset + 108, $itm_grp_nm10_lcl3);
	}

	/**
	 * 品目分類名１０（ロケール３）. Item classification name 10 (Locale3).<p>
	 *
	 */
	public void itm_grp_nm10_lcl3(String value) {
		setConstString(offset + 108, $itm_grp_nm10_lcl3, value);
	}

	/**
	 * 品目分類名１０（ロケール４）. Item classification name 10 (Locale4).<p>
	 *
	 */
	public String itm_grp_nm10_lcl4() {
		return getConstString(offset + 109, $itm_grp_nm10_lcl4);
	}

	/**
	 * 品目分類名１０（ロケール４）. Item classification name 10 (Locale4).<p>
	 *
	 */
	public void itm_grp_nm10_lcl4(String value) {
		setConstString(offset + 109, $itm_grp_nm10_lcl4, value);
	}

	/**
	 * 品目分類名１０（ロケール５）. Item classification name 10 (Locale5).<p>
	 *
	 */
	public String itm_grp_nm10_lcl5() {
		return getConstString(offset + 110, $itm_grp_nm10_lcl5);
	}

	/**
	 * 品目分類名１０（ロケール５）. Item classification name 10 (Locale5).<p>
	 *
	 */
	public void itm_grp_nm10_lcl5(String value) {
		setConstString(offset + 110, $itm_grp_nm10_lcl5, value);
	}

	/**
	 * メモ１. Memo 1.<p>
	 *
	 */
	public String memo1() {
		return getConstString(offset + 111, $memo1);
	}

	/**
	 * メモ１. Memo 1.<p>
	 *
	 */
	public void memo1(String value) {
		setConstString(offset + 111, $memo1, value);
	}

	/**
	 * メモ２. Memo 2.<p>
	 *
	 */
	public String memo2() {
		return getConstString(offset + 112, $memo2);
	}

	/**
	 * メモ２. Memo 2.<p>
	 *
	 */
	public void memo2(String value) {
		setConstString(offset + 112, $memo2, value);
	}

	/**
	 * メモ３. Memo 3.<p>
	 *
	 */
	public String memo3() {
		return getConstString(offset + 113, $memo3);
	}

	/**
	 * メモ３. Memo 3.<p>
	 *
	 */
	public void memo3(String value) {
		setConstString(offset + 113, $memo3, value);
	}

	public String getString(String name) {
		if ($co_cd.equalsIgnoreCase(name)) {
			return co_cd();
		}
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
		if ($itm_nm.equalsIgnoreCase(name)) {
			return itm_nm();
		}
		if ($itm_nm_lcl1.equalsIgnoreCase(name)) {
			return itm_nm_lcl1();
		}
		if ($itm_nm_lcl2.equalsIgnoreCase(name)) {
			return itm_nm_lcl2();
		}
		if ($itm_nm_lcl3.equalsIgnoreCase(name)) {
			return itm_nm_lcl3();
		}
		if ($itm_nm_lcl4.equalsIgnoreCase(name)) {
			return itm_nm_lcl4();
		}
		if ($itm_nm_lcl5.equalsIgnoreCase(name)) {
			return itm_nm_lcl5();
		}
		if ($unit_nm.equalsIgnoreCase(name)) {
			return unit_nm();
		}
		if ($unit_nm_lcl1.equalsIgnoreCase(name)) {
			return unit_nm_lcl1();
		}
		if ($unit_nm_lcl2.equalsIgnoreCase(name)) {
			return unit_nm_lcl2();
		}
		if ($unit_nm_lcl3.equalsIgnoreCase(name)) {
			return unit_nm_lcl3();
		}
		if ($unit_nm_lcl4.equalsIgnoreCase(name)) {
			return unit_nm_lcl4();
		}
		if ($unit_nm_lcl5.equalsIgnoreCase(name)) {
			return unit_nm_lcl5();
		}
		if ($itm_typ_nm.equalsIgnoreCase(name)) {
			return itm_typ_nm();
		}
		if ($itm_typ_nm_lcl1.equalsIgnoreCase(name)) {
			return itm_typ_nm_lcl1();
		}
		if ($itm_typ_nm_lcl2.equalsIgnoreCase(name)) {
			return itm_typ_nm_lcl2();
		}
		if ($itm_typ_nm_lcl3.equalsIgnoreCase(name)) {
			return itm_typ_nm_lcl3();
		}
		if ($itm_typ_nm_lcl4.equalsIgnoreCase(name)) {
			return itm_typ_nm_lcl4();
		}
		if ($itm_typ_nm_lcl5.equalsIgnoreCase(name)) {
			return itm_typ_nm_lcl5();
		}
		if ($itm_typ_d_nm.equalsIgnoreCase(name)) {
			return itm_typ_d_nm();
		}
		if ($itm_typ_d_nm_lcl1.equalsIgnoreCase(name)) {
			return itm_typ_d_nm_lcl1();
		}
		if ($itm_typ_d_nm_lcl2.equalsIgnoreCase(name)) {
			return itm_typ_d_nm_lcl2();
		}
		if ($itm_typ_d_nm_lcl3.equalsIgnoreCase(name)) {
			return itm_typ_d_nm_lcl3();
		}
		if ($itm_typ_d_nm_lcl4.equalsIgnoreCase(name)) {
			return itm_typ_d_nm_lcl4();
		}
		if ($itm_typ_d_nm_lcl5.equalsIgnoreCase(name)) {
			return itm_typ_d_nm_lcl5();
		}
		if ($itm_jnl_nm.equalsIgnoreCase(name)) {
			return itm_jnl_nm();
		}
		if ($itm_jnl_nm_lcl1.equalsIgnoreCase(name)) {
			return itm_jnl_nm_lcl1();
		}
		if ($itm_jnl_nm_lcl2.equalsIgnoreCase(name)) {
			return itm_jnl_nm_lcl2();
		}
		if ($itm_jnl_nm_lcl3.equalsIgnoreCase(name)) {
			return itm_jnl_nm_lcl3();
		}
		if ($itm_jnl_nm_lcl4.equalsIgnoreCase(name)) {
			return itm_jnl_nm_lcl4();
		}
		if ($itm_jnl_nm_lcl5.equalsIgnoreCase(name)) {
			return itm_jnl_nm_lcl5();
		}
		if ($ac_itm_grp_nm.equalsIgnoreCase(name)) {
			return ac_itm_grp_nm();
		}
		if ($ac_itm_grp_nm_lcl1.equalsIgnoreCase(name)) {
			return ac_itm_grp_nm_lcl1();
		}
		if ($ac_itm_grp_nm_lcl2.equalsIgnoreCase(name)) {
			return ac_itm_grp_nm_lcl2();
		}
		if ($ac_itm_grp_nm_lcl3.equalsIgnoreCase(name)) {
			return ac_itm_grp_nm_lcl3();
		}
		if ($ac_itm_grp_nm_lcl4.equalsIgnoreCase(name)) {
			return ac_itm_grp_nm_lcl4();
		}
		if ($ac_itm_grp_nm_lcl5.equalsIgnoreCase(name)) {
			return ac_itm_grp_nm_lcl5();
		}
		if ($itm_grp_cd1.equalsIgnoreCase(name)) {
			return itm_grp_cd1();
		}
		if ($itm_grp_nm1.equalsIgnoreCase(name)) {
			return itm_grp_nm1();
		}
		if ($itm_grp_nm1_lcl1.equalsIgnoreCase(name)) {
			return itm_grp_nm1_lcl1();
		}
		if ($itm_grp_nm1_lcl2.equalsIgnoreCase(name)) {
			return itm_grp_nm1_lcl2();
		}
		if ($itm_grp_nm1_lcl3.equalsIgnoreCase(name)) {
			return itm_grp_nm1_lcl3();
		}
		if ($itm_grp_nm1_lcl4.equalsIgnoreCase(name)) {
			return itm_grp_nm1_lcl4();
		}
		if ($itm_grp_nm1_lcl5.equalsIgnoreCase(name)) {
			return itm_grp_nm1_lcl5();
		}
		if ($itm_grp_cd2.equalsIgnoreCase(name)) {
			return itm_grp_cd2();
		}
		if ($itm_grp_nm2.equalsIgnoreCase(name)) {
			return itm_grp_nm2();
		}
		if ($itm_grp_nm2_lcl1.equalsIgnoreCase(name)) {
			return itm_grp_nm2_lcl1();
		}
		if ($itm_grp_nm2_lcl2.equalsIgnoreCase(name)) {
			return itm_grp_nm2_lcl2();
		}
		if ($itm_grp_nm2_lcl3.equalsIgnoreCase(name)) {
			return itm_grp_nm2_lcl3();
		}
		if ($itm_grp_nm2_lcl4.equalsIgnoreCase(name)) {
			return itm_grp_nm2_lcl4();
		}
		if ($itm_grp_nm2_lcl5.equalsIgnoreCase(name)) {
			return itm_grp_nm2_lcl5();
		}
		if ($itm_grp_cd3.equalsIgnoreCase(name)) {
			return itm_grp_cd3();
		}
		if ($itm_grp_nm3.equalsIgnoreCase(name)) {
			return itm_grp_nm3();
		}
		if ($itm_grp_nm3_lcl1.equalsIgnoreCase(name)) {
			return itm_grp_nm3_lcl1();
		}
		if ($itm_grp_nm3_lcl2.equalsIgnoreCase(name)) {
			return itm_grp_nm3_lcl2();
		}
		if ($itm_grp_nm3_lcl3.equalsIgnoreCase(name)) {
			return itm_grp_nm3_lcl3();
		}
		if ($itm_grp_nm3_lcl4.equalsIgnoreCase(name)) {
			return itm_grp_nm3_lcl4();
		}
		if ($itm_grp_nm3_lcl5.equalsIgnoreCase(name)) {
			return itm_grp_nm3_lcl5();
		}
		if ($itm_grp_cd4.equalsIgnoreCase(name)) {
			return itm_grp_cd4();
		}
		if ($itm_grp_nm4.equalsIgnoreCase(name)) {
			return itm_grp_nm4();
		}
		if ($itm_grp_nm4_lcl1.equalsIgnoreCase(name)) {
			return itm_grp_nm4_lcl1();
		}
		if ($itm_grp_nm4_lcl2.equalsIgnoreCase(name)) {
			return itm_grp_nm4_lcl2();
		}
		if ($itm_grp_nm4_lcl3.equalsIgnoreCase(name)) {
			return itm_grp_nm4_lcl3();
		}
		if ($itm_grp_nm4_lcl4.equalsIgnoreCase(name)) {
			return itm_grp_nm4_lcl4();
		}
		if ($itm_grp_nm4_lcl5.equalsIgnoreCase(name)) {
			return itm_grp_nm4_lcl5();
		}
		if ($itm_grp_cd5.equalsIgnoreCase(name)) {
			return itm_grp_cd5();
		}
		if ($itm_grp_nm5.equalsIgnoreCase(name)) {
			return itm_grp_nm5();
		}
		if ($itm_grp_nm5_lcl1.equalsIgnoreCase(name)) {
			return itm_grp_nm5_lcl1();
		}
		if ($itm_grp_nm5_lcl2.equalsIgnoreCase(name)) {
			return itm_grp_nm5_lcl2();
		}
		if ($itm_grp_nm5_lcl3.equalsIgnoreCase(name)) {
			return itm_grp_nm5_lcl3();
		}
		if ($itm_grp_nm5_lcl4.equalsIgnoreCase(name)) {
			return itm_grp_nm5_lcl4();
		}
		if ($itm_grp_nm5_lcl5.equalsIgnoreCase(name)) {
			return itm_grp_nm5_lcl5();
		}
		if ($itm_grp_cd6.equalsIgnoreCase(name)) {
			return itm_grp_cd6();
		}
		if ($itm_grp_nm6.equalsIgnoreCase(name)) {
			return itm_grp_nm6();
		}
		if ($itm_grp_nm6_lcl1.equalsIgnoreCase(name)) {
			return itm_grp_nm6_lcl1();
		}
		if ($itm_grp_nm6_lcl2.equalsIgnoreCase(name)) {
			return itm_grp_nm6_lcl2();
		}
		if ($itm_grp_nm6_lcl3.equalsIgnoreCase(name)) {
			return itm_grp_nm6_lcl3();
		}
		if ($itm_grp_nm6_lcl4.equalsIgnoreCase(name)) {
			return itm_grp_nm6_lcl4();
		}
		if ($itm_grp_nm6_lcl5.equalsIgnoreCase(name)) {
			return itm_grp_nm6_lcl5();
		}
		if ($itm_grp_cd7.equalsIgnoreCase(name)) {
			return itm_grp_cd7();
		}
		if ($itm_grp_nm7.equalsIgnoreCase(name)) {
			return itm_grp_nm7();
		}
		if ($itm_grp_nm7_lcl1.equalsIgnoreCase(name)) {
			return itm_grp_nm7_lcl1();
		}
		if ($itm_grp_nm7_lcl2.equalsIgnoreCase(name)) {
			return itm_grp_nm7_lcl2();
		}
		if ($itm_grp_nm7_lcl3.equalsIgnoreCase(name)) {
			return itm_grp_nm7_lcl3();
		}
		if ($itm_grp_nm7_lcl4.equalsIgnoreCase(name)) {
			return itm_grp_nm7_lcl4();
		}
		if ($itm_grp_nm7_lcl5.equalsIgnoreCase(name)) {
			return itm_grp_nm7_lcl5();
		}
		if ($itm_grp_cd8.equalsIgnoreCase(name)) {
			return itm_grp_cd8();
		}
		if ($itm_grp_nm8.equalsIgnoreCase(name)) {
			return itm_grp_nm8();
		}
		if ($itm_grp_nm8_lcl1.equalsIgnoreCase(name)) {
			return itm_grp_nm8_lcl1();
		}
		if ($itm_grp_nm8_lcl2.equalsIgnoreCase(name)) {
			return itm_grp_nm8_lcl2();
		}
		if ($itm_grp_nm8_lcl3.equalsIgnoreCase(name)) {
			return itm_grp_nm8_lcl3();
		}
		if ($itm_grp_nm8_lcl4.equalsIgnoreCase(name)) {
			return itm_grp_nm8_lcl4();
		}
		if ($itm_grp_nm8_lcl5.equalsIgnoreCase(name)) {
			return itm_grp_nm8_lcl5();
		}
		if ($itm_grp_cd9.equalsIgnoreCase(name)) {
			return itm_grp_cd9();
		}
		if ($itm_grp_nm9.equalsIgnoreCase(name)) {
			return itm_grp_nm9();
		}
		if ($itm_grp_nm9_lcl1.equalsIgnoreCase(name)) {
			return itm_grp_nm9_lcl1();
		}
		if ($itm_grp_nm9_lcl2.equalsIgnoreCase(name)) {
			return itm_grp_nm9_lcl2();
		}
		if ($itm_grp_nm9_lcl3.equalsIgnoreCase(name)) {
			return itm_grp_nm9_lcl3();
		}
		if ($itm_grp_nm9_lcl4.equalsIgnoreCase(name)) {
			return itm_grp_nm9_lcl4();
		}
		if ($itm_grp_nm9_lcl5.equalsIgnoreCase(name)) {
			return itm_grp_nm9_lcl5();
		}
		if ($itm_grp_cd10.equalsIgnoreCase(name)) {
			return itm_grp_cd10();
		}
		if ($itm_grp_nm10.equalsIgnoreCase(name)) {
			return itm_grp_nm10();
		}
		if ($itm_grp_nm10_lcl1.equalsIgnoreCase(name)) {
			return itm_grp_nm10_lcl1();
		}
		if ($itm_grp_nm10_lcl2.equalsIgnoreCase(name)) {
			return itm_grp_nm10_lcl2();
		}
		if ($itm_grp_nm10_lcl3.equalsIgnoreCase(name)) {
			return itm_grp_nm10_lcl3();
		}
		if ($itm_grp_nm10_lcl4.equalsIgnoreCase(name)) {
			return itm_grp_nm10_lcl4();
		}
		if ($itm_grp_nm10_lcl5.equalsIgnoreCase(name)) {
			return itm_grp_nm10_lcl5();
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
		if ($itm_nm.equalsIgnoreCase(name)) {
			return itm_nm();
		}
		if ($itm_nm_lcl1.equalsIgnoreCase(name)) {
			return itm_nm_lcl1();
		}
		if ($itm_nm_lcl2.equalsIgnoreCase(name)) {
			return itm_nm_lcl2();
		}
		if ($itm_nm_lcl3.equalsIgnoreCase(name)) {
			return itm_nm_lcl3();
		}
		if ($itm_nm_lcl4.equalsIgnoreCase(name)) {
			return itm_nm_lcl4();
		}
		if ($itm_nm_lcl5.equalsIgnoreCase(name)) {
			return itm_nm_lcl5();
		}
		if ($unit_nm.equalsIgnoreCase(name)) {
			return unit_nm();
		}
		if ($unit_nm_lcl1.equalsIgnoreCase(name)) {
			return unit_nm_lcl1();
		}
		if ($unit_nm_lcl2.equalsIgnoreCase(name)) {
			return unit_nm_lcl2();
		}
		if ($unit_nm_lcl3.equalsIgnoreCase(name)) {
			return unit_nm_lcl3();
		}
		if ($unit_nm_lcl4.equalsIgnoreCase(name)) {
			return unit_nm_lcl4();
		}
		if ($unit_nm_lcl5.equalsIgnoreCase(name)) {
			return unit_nm_lcl5();
		}
		if ($itm_typ_nm.equalsIgnoreCase(name)) {
			return itm_typ_nm();
		}
		if ($itm_typ_nm_lcl1.equalsIgnoreCase(name)) {
			return itm_typ_nm_lcl1();
		}
		if ($itm_typ_nm_lcl2.equalsIgnoreCase(name)) {
			return itm_typ_nm_lcl2();
		}
		if ($itm_typ_nm_lcl3.equalsIgnoreCase(name)) {
			return itm_typ_nm_lcl3();
		}
		if ($itm_typ_nm_lcl4.equalsIgnoreCase(name)) {
			return itm_typ_nm_lcl4();
		}
		if ($itm_typ_nm_lcl5.equalsIgnoreCase(name)) {
			return itm_typ_nm_lcl5();
		}
		if ($itm_typ_d_nm.equalsIgnoreCase(name)) {
			return itm_typ_d_nm();
		}
		if ($itm_typ_d_nm_lcl1.equalsIgnoreCase(name)) {
			return itm_typ_d_nm_lcl1();
		}
		if ($itm_typ_d_nm_lcl2.equalsIgnoreCase(name)) {
			return itm_typ_d_nm_lcl2();
		}
		if ($itm_typ_d_nm_lcl3.equalsIgnoreCase(name)) {
			return itm_typ_d_nm_lcl3();
		}
		if ($itm_typ_d_nm_lcl4.equalsIgnoreCase(name)) {
			return itm_typ_d_nm_lcl4();
		}
		if ($itm_typ_d_nm_lcl5.equalsIgnoreCase(name)) {
			return itm_typ_d_nm_lcl5();
		}
		if ($itm_jnl_nm.equalsIgnoreCase(name)) {
			return itm_jnl_nm();
		}
		if ($itm_jnl_nm_lcl1.equalsIgnoreCase(name)) {
			return itm_jnl_nm_lcl1();
		}
		if ($itm_jnl_nm_lcl2.equalsIgnoreCase(name)) {
			return itm_jnl_nm_lcl2();
		}
		if ($itm_jnl_nm_lcl3.equalsIgnoreCase(name)) {
			return itm_jnl_nm_lcl3();
		}
		if ($itm_jnl_nm_lcl4.equalsIgnoreCase(name)) {
			return itm_jnl_nm_lcl4();
		}
		if ($itm_jnl_nm_lcl5.equalsIgnoreCase(name)) {
			return itm_jnl_nm_lcl5();
		}
		if ($ac_itm_grp_nm.equalsIgnoreCase(name)) {
			return ac_itm_grp_nm();
		}
		if ($ac_itm_grp_nm_lcl1.equalsIgnoreCase(name)) {
			return ac_itm_grp_nm_lcl1();
		}
		if ($ac_itm_grp_nm_lcl2.equalsIgnoreCase(name)) {
			return ac_itm_grp_nm_lcl2();
		}
		if ($ac_itm_grp_nm_lcl3.equalsIgnoreCase(name)) {
			return ac_itm_grp_nm_lcl3();
		}
		if ($ac_itm_grp_nm_lcl4.equalsIgnoreCase(name)) {
			return ac_itm_grp_nm_lcl4();
		}
		if ($ac_itm_grp_nm_lcl5.equalsIgnoreCase(name)) {
			return ac_itm_grp_nm_lcl5();
		}
		if ($itm_grp_cd1.equalsIgnoreCase(name)) {
			return itm_grp_cd1();
		}
		if ($itm_grp_nm1.equalsIgnoreCase(name)) {
			return itm_grp_nm1();
		}
		if ($itm_grp_nm1_lcl1.equalsIgnoreCase(name)) {
			return itm_grp_nm1_lcl1();
		}
		if ($itm_grp_nm1_lcl2.equalsIgnoreCase(name)) {
			return itm_grp_nm1_lcl2();
		}
		if ($itm_grp_nm1_lcl3.equalsIgnoreCase(name)) {
			return itm_grp_nm1_lcl3();
		}
		if ($itm_grp_nm1_lcl4.equalsIgnoreCase(name)) {
			return itm_grp_nm1_lcl4();
		}
		if ($itm_grp_nm1_lcl5.equalsIgnoreCase(name)) {
			return itm_grp_nm1_lcl5();
		}
		if ($itm_grp_cd2.equalsIgnoreCase(name)) {
			return itm_grp_cd2();
		}
		if ($itm_grp_nm2.equalsIgnoreCase(name)) {
			return itm_grp_nm2();
		}
		if ($itm_grp_nm2_lcl1.equalsIgnoreCase(name)) {
			return itm_grp_nm2_lcl1();
		}
		if ($itm_grp_nm2_lcl2.equalsIgnoreCase(name)) {
			return itm_grp_nm2_lcl2();
		}
		if ($itm_grp_nm2_lcl3.equalsIgnoreCase(name)) {
			return itm_grp_nm2_lcl3();
		}
		if ($itm_grp_nm2_lcl4.equalsIgnoreCase(name)) {
			return itm_grp_nm2_lcl4();
		}
		if ($itm_grp_nm2_lcl5.equalsIgnoreCase(name)) {
			return itm_grp_nm2_lcl5();
		}
		if ($itm_grp_cd3.equalsIgnoreCase(name)) {
			return itm_grp_cd3();
		}
		if ($itm_grp_nm3.equalsIgnoreCase(name)) {
			return itm_grp_nm3();
		}
		if ($itm_grp_nm3_lcl1.equalsIgnoreCase(name)) {
			return itm_grp_nm3_lcl1();
		}
		if ($itm_grp_nm3_lcl2.equalsIgnoreCase(name)) {
			return itm_grp_nm3_lcl2();
		}
		if ($itm_grp_nm3_lcl3.equalsIgnoreCase(name)) {
			return itm_grp_nm3_lcl3();
		}
		if ($itm_grp_nm3_lcl4.equalsIgnoreCase(name)) {
			return itm_grp_nm3_lcl4();
		}
		if ($itm_grp_nm3_lcl5.equalsIgnoreCase(name)) {
			return itm_grp_nm3_lcl5();
		}
		if ($itm_grp_cd4.equalsIgnoreCase(name)) {
			return itm_grp_cd4();
		}
		if ($itm_grp_nm4.equalsIgnoreCase(name)) {
			return itm_grp_nm4();
		}
		if ($itm_grp_nm4_lcl1.equalsIgnoreCase(name)) {
			return itm_grp_nm4_lcl1();
		}
		if ($itm_grp_nm4_lcl2.equalsIgnoreCase(name)) {
			return itm_grp_nm4_lcl2();
		}
		if ($itm_grp_nm4_lcl3.equalsIgnoreCase(name)) {
			return itm_grp_nm4_lcl3();
		}
		if ($itm_grp_nm4_lcl4.equalsIgnoreCase(name)) {
			return itm_grp_nm4_lcl4();
		}
		if ($itm_grp_nm4_lcl5.equalsIgnoreCase(name)) {
			return itm_grp_nm4_lcl5();
		}
		if ($itm_grp_cd5.equalsIgnoreCase(name)) {
			return itm_grp_cd5();
		}
		if ($itm_grp_nm5.equalsIgnoreCase(name)) {
			return itm_grp_nm5();
		}
		if ($itm_grp_nm5_lcl1.equalsIgnoreCase(name)) {
			return itm_grp_nm5_lcl1();
		}
		if ($itm_grp_nm5_lcl2.equalsIgnoreCase(name)) {
			return itm_grp_nm5_lcl2();
		}
		if ($itm_grp_nm5_lcl3.equalsIgnoreCase(name)) {
			return itm_grp_nm5_lcl3();
		}
		if ($itm_grp_nm5_lcl4.equalsIgnoreCase(name)) {
			return itm_grp_nm5_lcl4();
		}
		if ($itm_grp_nm5_lcl5.equalsIgnoreCase(name)) {
			return itm_grp_nm5_lcl5();
		}
		if ($itm_grp_cd6.equalsIgnoreCase(name)) {
			return itm_grp_cd6();
		}
		if ($itm_grp_nm6.equalsIgnoreCase(name)) {
			return itm_grp_nm6();
		}
		if ($itm_grp_nm6_lcl1.equalsIgnoreCase(name)) {
			return itm_grp_nm6_lcl1();
		}
		if ($itm_grp_nm6_lcl2.equalsIgnoreCase(name)) {
			return itm_grp_nm6_lcl2();
		}
		if ($itm_grp_nm6_lcl3.equalsIgnoreCase(name)) {
			return itm_grp_nm6_lcl3();
		}
		if ($itm_grp_nm6_lcl4.equalsIgnoreCase(name)) {
			return itm_grp_nm6_lcl4();
		}
		if ($itm_grp_nm6_lcl5.equalsIgnoreCase(name)) {
			return itm_grp_nm6_lcl5();
		}
		if ($itm_grp_cd7.equalsIgnoreCase(name)) {
			return itm_grp_cd7();
		}
		if ($itm_grp_nm7.equalsIgnoreCase(name)) {
			return itm_grp_nm7();
		}
		if ($itm_grp_nm7_lcl1.equalsIgnoreCase(name)) {
			return itm_grp_nm7_lcl1();
		}
		if ($itm_grp_nm7_lcl2.equalsIgnoreCase(name)) {
			return itm_grp_nm7_lcl2();
		}
		if ($itm_grp_nm7_lcl3.equalsIgnoreCase(name)) {
			return itm_grp_nm7_lcl3();
		}
		if ($itm_grp_nm7_lcl4.equalsIgnoreCase(name)) {
			return itm_grp_nm7_lcl4();
		}
		if ($itm_grp_nm7_lcl5.equalsIgnoreCase(name)) {
			return itm_grp_nm7_lcl5();
		}
		if ($itm_grp_cd8.equalsIgnoreCase(name)) {
			return itm_grp_cd8();
		}
		if ($itm_grp_nm8.equalsIgnoreCase(name)) {
			return itm_grp_nm8();
		}
		if ($itm_grp_nm8_lcl1.equalsIgnoreCase(name)) {
			return itm_grp_nm8_lcl1();
		}
		if ($itm_grp_nm8_lcl2.equalsIgnoreCase(name)) {
			return itm_grp_nm8_lcl2();
		}
		if ($itm_grp_nm8_lcl3.equalsIgnoreCase(name)) {
			return itm_grp_nm8_lcl3();
		}
		if ($itm_grp_nm8_lcl4.equalsIgnoreCase(name)) {
			return itm_grp_nm8_lcl4();
		}
		if ($itm_grp_nm8_lcl5.equalsIgnoreCase(name)) {
			return itm_grp_nm8_lcl5();
		}
		if ($itm_grp_cd9.equalsIgnoreCase(name)) {
			return itm_grp_cd9();
		}
		if ($itm_grp_nm9.equalsIgnoreCase(name)) {
			return itm_grp_nm9();
		}
		if ($itm_grp_nm9_lcl1.equalsIgnoreCase(name)) {
			return itm_grp_nm9_lcl1();
		}
		if ($itm_grp_nm9_lcl2.equalsIgnoreCase(name)) {
			return itm_grp_nm9_lcl2();
		}
		if ($itm_grp_nm9_lcl3.equalsIgnoreCase(name)) {
			return itm_grp_nm9_lcl3();
		}
		if ($itm_grp_nm9_lcl4.equalsIgnoreCase(name)) {
			return itm_grp_nm9_lcl4();
		}
		if ($itm_grp_nm9_lcl5.equalsIgnoreCase(name)) {
			return itm_grp_nm9_lcl5();
		}
		if ($itm_grp_cd10.equalsIgnoreCase(name)) {
			return itm_grp_cd10();
		}
		if ($itm_grp_nm10.equalsIgnoreCase(name)) {
			return itm_grp_nm10();
		}
		if ($itm_grp_nm10_lcl1.equalsIgnoreCase(name)) {
			return itm_grp_nm10_lcl1();
		}
		if ($itm_grp_nm10_lcl2.equalsIgnoreCase(name)) {
			return itm_grp_nm10_lcl2();
		}
		if ($itm_grp_nm10_lcl3.equalsIgnoreCase(name)) {
			return itm_grp_nm10_lcl3();
		}
		if ($itm_grp_nm10_lcl4.equalsIgnoreCase(name)) {
			return itm_grp_nm10_lcl4();
		}
		if ($itm_grp_nm10_lcl5.equalsIgnoreCase(name)) {
			return itm_grp_nm10_lcl5();
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
		if ($itm_nm.equalsIgnoreCase(name)) {
			itm_nm(value);
			return;
		}
		if ($itm_nm_lcl1.equalsIgnoreCase(name)) {
			itm_nm_lcl1(value);
			return;
		}
		if ($itm_nm_lcl2.equalsIgnoreCase(name)) {
			itm_nm_lcl2(value);
			return;
		}
		if ($itm_nm_lcl3.equalsIgnoreCase(name)) {
			itm_nm_lcl3(value);
			return;
		}
		if ($itm_nm_lcl4.equalsIgnoreCase(name)) {
			itm_nm_lcl4(value);
			return;
		}
		if ($itm_nm_lcl5.equalsIgnoreCase(name)) {
			itm_nm_lcl5(value);
			return;
		}
		if ($unit_nm.equalsIgnoreCase(name)) {
			unit_nm(value);
			return;
		}
		if ($unit_nm_lcl1.equalsIgnoreCase(name)) {
			unit_nm_lcl1(value);
			return;
		}
		if ($unit_nm_lcl2.equalsIgnoreCase(name)) {
			unit_nm_lcl2(value);
			return;
		}
		if ($unit_nm_lcl3.equalsIgnoreCase(name)) {
			unit_nm_lcl3(value);
			return;
		}
		if ($unit_nm_lcl4.equalsIgnoreCase(name)) {
			unit_nm_lcl4(value);
			return;
		}
		if ($unit_nm_lcl5.equalsIgnoreCase(name)) {
			unit_nm_lcl5(value);
			return;
		}
		if ($itm_typ_nm.equalsIgnoreCase(name)) {
			itm_typ_nm(value);
			return;
		}
		if ($itm_typ_nm_lcl1.equalsIgnoreCase(name)) {
			itm_typ_nm_lcl1(value);
			return;
		}
		if ($itm_typ_nm_lcl2.equalsIgnoreCase(name)) {
			itm_typ_nm_lcl2(value);
			return;
		}
		if ($itm_typ_nm_lcl3.equalsIgnoreCase(name)) {
			itm_typ_nm_lcl3(value);
			return;
		}
		if ($itm_typ_nm_lcl4.equalsIgnoreCase(name)) {
			itm_typ_nm_lcl4(value);
			return;
		}
		if ($itm_typ_nm_lcl5.equalsIgnoreCase(name)) {
			itm_typ_nm_lcl5(value);
			return;
		}
		if ($itm_typ_d_nm.equalsIgnoreCase(name)) {
			itm_typ_d_nm(value);
			return;
		}
		if ($itm_typ_d_nm_lcl1.equalsIgnoreCase(name)) {
			itm_typ_d_nm_lcl1(value);
			return;
		}
		if ($itm_typ_d_nm_lcl2.equalsIgnoreCase(name)) {
			itm_typ_d_nm_lcl2(value);
			return;
		}
		if ($itm_typ_d_nm_lcl3.equalsIgnoreCase(name)) {
			itm_typ_d_nm_lcl3(value);
			return;
		}
		if ($itm_typ_d_nm_lcl4.equalsIgnoreCase(name)) {
			itm_typ_d_nm_lcl4(value);
			return;
		}
		if ($itm_typ_d_nm_lcl5.equalsIgnoreCase(name)) {
			itm_typ_d_nm_lcl5(value);
			return;
		}
		if ($itm_jnl_nm.equalsIgnoreCase(name)) {
			itm_jnl_nm(value);
			return;
		}
		if ($itm_jnl_nm_lcl1.equalsIgnoreCase(name)) {
			itm_jnl_nm_lcl1(value);
			return;
		}
		if ($itm_jnl_nm_lcl2.equalsIgnoreCase(name)) {
			itm_jnl_nm_lcl2(value);
			return;
		}
		if ($itm_jnl_nm_lcl3.equalsIgnoreCase(name)) {
			itm_jnl_nm_lcl3(value);
			return;
		}
		if ($itm_jnl_nm_lcl4.equalsIgnoreCase(name)) {
			itm_jnl_nm_lcl4(value);
			return;
		}
		if ($itm_jnl_nm_lcl5.equalsIgnoreCase(name)) {
			itm_jnl_nm_lcl5(value);
			return;
		}
		if ($ac_itm_grp_nm.equalsIgnoreCase(name)) {
			ac_itm_grp_nm(value);
			return;
		}
		if ($ac_itm_grp_nm_lcl1.equalsIgnoreCase(name)) {
			ac_itm_grp_nm_lcl1(value);
			return;
		}
		if ($ac_itm_grp_nm_lcl2.equalsIgnoreCase(name)) {
			ac_itm_grp_nm_lcl2(value);
			return;
		}
		if ($ac_itm_grp_nm_lcl3.equalsIgnoreCase(name)) {
			ac_itm_grp_nm_lcl3(value);
			return;
		}
		if ($ac_itm_grp_nm_lcl4.equalsIgnoreCase(name)) {
			ac_itm_grp_nm_lcl4(value);
			return;
		}
		if ($ac_itm_grp_nm_lcl5.equalsIgnoreCase(name)) {
			ac_itm_grp_nm_lcl5(value);
			return;
		}
		if ($itm_grp_cd1.equalsIgnoreCase(name)) {
			itm_grp_cd1(value);
			return;
		}
		if ($itm_grp_nm1.equalsIgnoreCase(name)) {
			itm_grp_nm1(value);
			return;
		}
		if ($itm_grp_nm1_lcl1.equalsIgnoreCase(name)) {
			itm_grp_nm1_lcl1(value);
			return;
		}
		if ($itm_grp_nm1_lcl2.equalsIgnoreCase(name)) {
			itm_grp_nm1_lcl2(value);
			return;
		}
		if ($itm_grp_nm1_lcl3.equalsIgnoreCase(name)) {
			itm_grp_nm1_lcl3(value);
			return;
		}
		if ($itm_grp_nm1_lcl4.equalsIgnoreCase(name)) {
			itm_grp_nm1_lcl4(value);
			return;
		}
		if ($itm_grp_nm1_lcl5.equalsIgnoreCase(name)) {
			itm_grp_nm1_lcl5(value);
			return;
		}
		if ($itm_grp_cd2.equalsIgnoreCase(name)) {
			itm_grp_cd2(value);
			return;
		}
		if ($itm_grp_nm2.equalsIgnoreCase(name)) {
			itm_grp_nm2(value);
			return;
		}
		if ($itm_grp_nm2_lcl1.equalsIgnoreCase(name)) {
			itm_grp_nm2_lcl1(value);
			return;
		}
		if ($itm_grp_nm2_lcl2.equalsIgnoreCase(name)) {
			itm_grp_nm2_lcl2(value);
			return;
		}
		if ($itm_grp_nm2_lcl3.equalsIgnoreCase(name)) {
			itm_grp_nm2_lcl3(value);
			return;
		}
		if ($itm_grp_nm2_lcl4.equalsIgnoreCase(name)) {
			itm_grp_nm2_lcl4(value);
			return;
		}
		if ($itm_grp_nm2_lcl5.equalsIgnoreCase(name)) {
			itm_grp_nm2_lcl5(value);
			return;
		}
		if ($itm_grp_cd3.equalsIgnoreCase(name)) {
			itm_grp_cd3(value);
			return;
		}
		if ($itm_grp_nm3.equalsIgnoreCase(name)) {
			itm_grp_nm3(value);
			return;
		}
		if ($itm_grp_nm3_lcl1.equalsIgnoreCase(name)) {
			itm_grp_nm3_lcl1(value);
			return;
		}
		if ($itm_grp_nm3_lcl2.equalsIgnoreCase(name)) {
			itm_grp_nm3_lcl2(value);
			return;
		}
		if ($itm_grp_nm3_lcl3.equalsIgnoreCase(name)) {
			itm_grp_nm3_lcl3(value);
			return;
		}
		if ($itm_grp_nm3_lcl4.equalsIgnoreCase(name)) {
			itm_grp_nm3_lcl4(value);
			return;
		}
		if ($itm_grp_nm3_lcl5.equalsIgnoreCase(name)) {
			itm_grp_nm3_lcl5(value);
			return;
		}
		if ($itm_grp_cd4.equalsIgnoreCase(name)) {
			itm_grp_cd4(value);
			return;
		}
		if ($itm_grp_nm4.equalsIgnoreCase(name)) {
			itm_grp_nm4(value);
			return;
		}
		if ($itm_grp_nm4_lcl1.equalsIgnoreCase(name)) {
			itm_grp_nm4_lcl1(value);
			return;
		}
		if ($itm_grp_nm4_lcl2.equalsIgnoreCase(name)) {
			itm_grp_nm4_lcl2(value);
			return;
		}
		if ($itm_grp_nm4_lcl3.equalsIgnoreCase(name)) {
			itm_grp_nm4_lcl3(value);
			return;
		}
		if ($itm_grp_nm4_lcl4.equalsIgnoreCase(name)) {
			itm_grp_nm4_lcl4(value);
			return;
		}
		if ($itm_grp_nm4_lcl5.equalsIgnoreCase(name)) {
			itm_grp_nm4_lcl5(value);
			return;
		}
		if ($itm_grp_cd5.equalsIgnoreCase(name)) {
			itm_grp_cd5(value);
			return;
		}
		if ($itm_grp_nm5.equalsIgnoreCase(name)) {
			itm_grp_nm5(value);
			return;
		}
		if ($itm_grp_nm5_lcl1.equalsIgnoreCase(name)) {
			itm_grp_nm5_lcl1(value);
			return;
		}
		if ($itm_grp_nm5_lcl2.equalsIgnoreCase(name)) {
			itm_grp_nm5_lcl2(value);
			return;
		}
		if ($itm_grp_nm5_lcl3.equalsIgnoreCase(name)) {
			itm_grp_nm5_lcl3(value);
			return;
		}
		if ($itm_grp_nm5_lcl4.equalsIgnoreCase(name)) {
			itm_grp_nm5_lcl4(value);
			return;
		}
		if ($itm_grp_nm5_lcl5.equalsIgnoreCase(name)) {
			itm_grp_nm5_lcl5(value);
			return;
		}
		if ($itm_grp_cd6.equalsIgnoreCase(name)) {
			itm_grp_cd6(value);
			return;
		}
		if ($itm_grp_nm6.equalsIgnoreCase(name)) {
			itm_grp_nm6(value);
			return;
		}
		if ($itm_grp_nm6_lcl1.equalsIgnoreCase(name)) {
			itm_grp_nm6_lcl1(value);
			return;
		}
		if ($itm_grp_nm6_lcl2.equalsIgnoreCase(name)) {
			itm_grp_nm6_lcl2(value);
			return;
		}
		if ($itm_grp_nm6_lcl3.equalsIgnoreCase(name)) {
			itm_grp_nm6_lcl3(value);
			return;
		}
		if ($itm_grp_nm6_lcl4.equalsIgnoreCase(name)) {
			itm_grp_nm6_lcl4(value);
			return;
		}
		if ($itm_grp_nm6_lcl5.equalsIgnoreCase(name)) {
			itm_grp_nm6_lcl5(value);
			return;
		}
		if ($itm_grp_cd7.equalsIgnoreCase(name)) {
			itm_grp_cd7(value);
			return;
		}
		if ($itm_grp_nm7.equalsIgnoreCase(name)) {
			itm_grp_nm7(value);
			return;
		}
		if ($itm_grp_nm7_lcl1.equalsIgnoreCase(name)) {
			itm_grp_nm7_lcl1(value);
			return;
		}
		if ($itm_grp_nm7_lcl2.equalsIgnoreCase(name)) {
			itm_grp_nm7_lcl2(value);
			return;
		}
		if ($itm_grp_nm7_lcl3.equalsIgnoreCase(name)) {
			itm_grp_nm7_lcl3(value);
			return;
		}
		if ($itm_grp_nm7_lcl4.equalsIgnoreCase(name)) {
			itm_grp_nm7_lcl4(value);
			return;
		}
		if ($itm_grp_nm7_lcl5.equalsIgnoreCase(name)) {
			itm_grp_nm7_lcl5(value);
			return;
		}
		if ($itm_grp_cd8.equalsIgnoreCase(name)) {
			itm_grp_cd8(value);
			return;
		}
		if ($itm_grp_nm8.equalsIgnoreCase(name)) {
			itm_grp_nm8(value);
			return;
		}
		if ($itm_grp_nm8_lcl1.equalsIgnoreCase(name)) {
			itm_grp_nm8_lcl1(value);
			return;
		}
		if ($itm_grp_nm8_lcl2.equalsIgnoreCase(name)) {
			itm_grp_nm8_lcl2(value);
			return;
		}
		if ($itm_grp_nm8_lcl3.equalsIgnoreCase(name)) {
			itm_grp_nm8_lcl3(value);
			return;
		}
		if ($itm_grp_nm8_lcl4.equalsIgnoreCase(name)) {
			itm_grp_nm8_lcl4(value);
			return;
		}
		if ($itm_grp_nm8_lcl5.equalsIgnoreCase(name)) {
			itm_grp_nm8_lcl5(value);
			return;
		}
		if ($itm_grp_cd9.equalsIgnoreCase(name)) {
			itm_grp_cd9(value);
			return;
		}
		if ($itm_grp_nm9.equalsIgnoreCase(name)) {
			itm_grp_nm9(value);
			return;
		}
		if ($itm_grp_nm9_lcl1.equalsIgnoreCase(name)) {
			itm_grp_nm9_lcl1(value);
			return;
		}
		if ($itm_grp_nm9_lcl2.equalsIgnoreCase(name)) {
			itm_grp_nm9_lcl2(value);
			return;
		}
		if ($itm_grp_nm9_lcl3.equalsIgnoreCase(name)) {
			itm_grp_nm9_lcl3(value);
			return;
		}
		if ($itm_grp_nm9_lcl4.equalsIgnoreCase(name)) {
			itm_grp_nm9_lcl4(value);
			return;
		}
		if ($itm_grp_nm9_lcl5.equalsIgnoreCase(name)) {
			itm_grp_nm9_lcl5(value);
			return;
		}
		if ($itm_grp_cd10.equalsIgnoreCase(name)) {
			itm_grp_cd10(value);
			return;
		}
		if ($itm_grp_nm10.equalsIgnoreCase(name)) {
			itm_grp_nm10(value);
			return;
		}
		if ($itm_grp_nm10_lcl1.equalsIgnoreCase(name)) {
			itm_grp_nm10_lcl1(value);
			return;
		}
		if ($itm_grp_nm10_lcl2.equalsIgnoreCase(name)) {
			itm_grp_nm10_lcl2(value);
			return;
		}
		if ($itm_grp_nm10_lcl3.equalsIgnoreCase(name)) {
			itm_grp_nm10_lcl3(value);
			return;
		}
		if ($itm_grp_nm10_lcl4.equalsIgnoreCase(name)) {
			itm_grp_nm10_lcl4(value);
			return;
		}
		if ($itm_grp_nm10_lcl5.equalsIgnoreCase(name)) {
			itm_grp_nm10_lcl5(value);
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
		if ($itm_nm.equalsIgnoreCase(name)) {
			itm_nm(value);
			return;
		}
		if ($itm_nm_lcl1.equalsIgnoreCase(name)) {
			itm_nm_lcl1(value);
			return;
		}
		if ($itm_nm_lcl2.equalsIgnoreCase(name)) {
			itm_nm_lcl2(value);
			return;
		}
		if ($itm_nm_lcl3.equalsIgnoreCase(name)) {
			itm_nm_lcl3(value);
			return;
		}
		if ($itm_nm_lcl4.equalsIgnoreCase(name)) {
			itm_nm_lcl4(value);
			return;
		}
		if ($itm_nm_lcl5.equalsIgnoreCase(name)) {
			itm_nm_lcl5(value);
			return;
		}
		if ($unit_nm.equalsIgnoreCase(name)) {
			unit_nm(value);
			return;
		}
		if ($unit_nm_lcl1.equalsIgnoreCase(name)) {
			unit_nm_lcl1(value);
			return;
		}
		if ($unit_nm_lcl2.equalsIgnoreCase(name)) {
			unit_nm_lcl2(value);
			return;
		}
		if ($unit_nm_lcl3.equalsIgnoreCase(name)) {
			unit_nm_lcl3(value);
			return;
		}
		if ($unit_nm_lcl4.equalsIgnoreCase(name)) {
			unit_nm_lcl4(value);
			return;
		}
		if ($unit_nm_lcl5.equalsIgnoreCase(name)) {
			unit_nm_lcl5(value);
			return;
		}
		if ($itm_typ_nm.equalsIgnoreCase(name)) {
			itm_typ_nm(value);
			return;
		}
		if ($itm_typ_nm_lcl1.equalsIgnoreCase(name)) {
			itm_typ_nm_lcl1(value);
			return;
		}
		if ($itm_typ_nm_lcl2.equalsIgnoreCase(name)) {
			itm_typ_nm_lcl2(value);
			return;
		}
		if ($itm_typ_nm_lcl3.equalsIgnoreCase(name)) {
			itm_typ_nm_lcl3(value);
			return;
		}
		if ($itm_typ_nm_lcl4.equalsIgnoreCase(name)) {
			itm_typ_nm_lcl4(value);
			return;
		}
		if ($itm_typ_nm_lcl5.equalsIgnoreCase(name)) {
			itm_typ_nm_lcl5(value);
			return;
		}
		if ($itm_typ_d_nm.equalsIgnoreCase(name)) {
			itm_typ_d_nm(value);
			return;
		}
		if ($itm_typ_d_nm_lcl1.equalsIgnoreCase(name)) {
			itm_typ_d_nm_lcl1(value);
			return;
		}
		if ($itm_typ_d_nm_lcl2.equalsIgnoreCase(name)) {
			itm_typ_d_nm_lcl2(value);
			return;
		}
		if ($itm_typ_d_nm_lcl3.equalsIgnoreCase(name)) {
			itm_typ_d_nm_lcl3(value);
			return;
		}
		if ($itm_typ_d_nm_lcl4.equalsIgnoreCase(name)) {
			itm_typ_d_nm_lcl4(value);
			return;
		}
		if ($itm_typ_d_nm_lcl5.equalsIgnoreCase(name)) {
			itm_typ_d_nm_lcl5(value);
			return;
		}
		if ($itm_jnl_nm.equalsIgnoreCase(name)) {
			itm_jnl_nm(value);
			return;
		}
		if ($itm_jnl_nm_lcl1.equalsIgnoreCase(name)) {
			itm_jnl_nm_lcl1(value);
			return;
		}
		if ($itm_jnl_nm_lcl2.equalsIgnoreCase(name)) {
			itm_jnl_nm_lcl2(value);
			return;
		}
		if ($itm_jnl_nm_lcl3.equalsIgnoreCase(name)) {
			itm_jnl_nm_lcl3(value);
			return;
		}
		if ($itm_jnl_nm_lcl4.equalsIgnoreCase(name)) {
			itm_jnl_nm_lcl4(value);
			return;
		}
		if ($itm_jnl_nm_lcl5.equalsIgnoreCase(name)) {
			itm_jnl_nm_lcl5(value);
			return;
		}
		if ($ac_itm_grp_nm.equalsIgnoreCase(name)) {
			ac_itm_grp_nm(value);
			return;
		}
		if ($ac_itm_grp_nm_lcl1.equalsIgnoreCase(name)) {
			ac_itm_grp_nm_lcl1(value);
			return;
		}
		if ($ac_itm_grp_nm_lcl2.equalsIgnoreCase(name)) {
			ac_itm_grp_nm_lcl2(value);
			return;
		}
		if ($ac_itm_grp_nm_lcl3.equalsIgnoreCase(name)) {
			ac_itm_grp_nm_lcl3(value);
			return;
		}
		if ($ac_itm_grp_nm_lcl4.equalsIgnoreCase(name)) {
			ac_itm_grp_nm_lcl4(value);
			return;
		}
		if ($ac_itm_grp_nm_lcl5.equalsIgnoreCase(name)) {
			ac_itm_grp_nm_lcl5(value);
			return;
		}
		if ($itm_grp_cd1.equalsIgnoreCase(name)) {
			itm_grp_cd1(value);
			return;
		}
		if ($itm_grp_nm1.equalsIgnoreCase(name)) {
			itm_grp_nm1(value);
			return;
		}
		if ($itm_grp_nm1_lcl1.equalsIgnoreCase(name)) {
			itm_grp_nm1_lcl1(value);
			return;
		}
		if ($itm_grp_nm1_lcl2.equalsIgnoreCase(name)) {
			itm_grp_nm1_lcl2(value);
			return;
		}
		if ($itm_grp_nm1_lcl3.equalsIgnoreCase(name)) {
			itm_grp_nm1_lcl3(value);
			return;
		}
		if ($itm_grp_nm1_lcl4.equalsIgnoreCase(name)) {
			itm_grp_nm1_lcl4(value);
			return;
		}
		if ($itm_grp_nm1_lcl5.equalsIgnoreCase(name)) {
			itm_grp_nm1_lcl5(value);
			return;
		}
		if ($itm_grp_cd2.equalsIgnoreCase(name)) {
			itm_grp_cd2(value);
			return;
		}
		if ($itm_grp_nm2.equalsIgnoreCase(name)) {
			itm_grp_nm2(value);
			return;
		}
		if ($itm_grp_nm2_lcl1.equalsIgnoreCase(name)) {
			itm_grp_nm2_lcl1(value);
			return;
		}
		if ($itm_grp_nm2_lcl2.equalsIgnoreCase(name)) {
			itm_grp_nm2_lcl2(value);
			return;
		}
		if ($itm_grp_nm2_lcl3.equalsIgnoreCase(name)) {
			itm_grp_nm2_lcl3(value);
			return;
		}
		if ($itm_grp_nm2_lcl4.equalsIgnoreCase(name)) {
			itm_grp_nm2_lcl4(value);
			return;
		}
		if ($itm_grp_nm2_lcl5.equalsIgnoreCase(name)) {
			itm_grp_nm2_lcl5(value);
			return;
		}
		if ($itm_grp_cd3.equalsIgnoreCase(name)) {
			itm_grp_cd3(value);
			return;
		}
		if ($itm_grp_nm3.equalsIgnoreCase(name)) {
			itm_grp_nm3(value);
			return;
		}
		if ($itm_grp_nm3_lcl1.equalsIgnoreCase(name)) {
			itm_grp_nm3_lcl1(value);
			return;
		}
		if ($itm_grp_nm3_lcl2.equalsIgnoreCase(name)) {
			itm_grp_nm3_lcl2(value);
			return;
		}
		if ($itm_grp_nm3_lcl3.equalsIgnoreCase(name)) {
			itm_grp_nm3_lcl3(value);
			return;
		}
		if ($itm_grp_nm3_lcl4.equalsIgnoreCase(name)) {
			itm_grp_nm3_lcl4(value);
			return;
		}
		if ($itm_grp_nm3_lcl5.equalsIgnoreCase(name)) {
			itm_grp_nm3_lcl5(value);
			return;
		}
		if ($itm_grp_cd4.equalsIgnoreCase(name)) {
			itm_grp_cd4(value);
			return;
		}
		if ($itm_grp_nm4.equalsIgnoreCase(name)) {
			itm_grp_nm4(value);
			return;
		}
		if ($itm_grp_nm4_lcl1.equalsIgnoreCase(name)) {
			itm_grp_nm4_lcl1(value);
			return;
		}
		if ($itm_grp_nm4_lcl2.equalsIgnoreCase(name)) {
			itm_grp_nm4_lcl2(value);
			return;
		}
		if ($itm_grp_nm4_lcl3.equalsIgnoreCase(name)) {
			itm_grp_nm4_lcl3(value);
			return;
		}
		if ($itm_grp_nm4_lcl4.equalsIgnoreCase(name)) {
			itm_grp_nm4_lcl4(value);
			return;
		}
		if ($itm_grp_nm4_lcl5.equalsIgnoreCase(name)) {
			itm_grp_nm4_lcl5(value);
			return;
		}
		if ($itm_grp_cd5.equalsIgnoreCase(name)) {
			itm_grp_cd5(value);
			return;
		}
		if ($itm_grp_nm5.equalsIgnoreCase(name)) {
			itm_grp_nm5(value);
			return;
		}
		if ($itm_grp_nm5_lcl1.equalsIgnoreCase(name)) {
			itm_grp_nm5_lcl1(value);
			return;
		}
		if ($itm_grp_nm5_lcl2.equalsIgnoreCase(name)) {
			itm_grp_nm5_lcl2(value);
			return;
		}
		if ($itm_grp_nm5_lcl3.equalsIgnoreCase(name)) {
			itm_grp_nm5_lcl3(value);
			return;
		}
		if ($itm_grp_nm5_lcl4.equalsIgnoreCase(name)) {
			itm_grp_nm5_lcl4(value);
			return;
		}
		if ($itm_grp_nm5_lcl5.equalsIgnoreCase(name)) {
			itm_grp_nm5_lcl5(value);
			return;
		}
		if ($itm_grp_cd6.equalsIgnoreCase(name)) {
			itm_grp_cd6(value);
			return;
		}
		if ($itm_grp_nm6.equalsIgnoreCase(name)) {
			itm_grp_nm6(value);
			return;
		}
		if ($itm_grp_nm6_lcl1.equalsIgnoreCase(name)) {
			itm_grp_nm6_lcl1(value);
			return;
		}
		if ($itm_grp_nm6_lcl2.equalsIgnoreCase(name)) {
			itm_grp_nm6_lcl2(value);
			return;
		}
		if ($itm_grp_nm6_lcl3.equalsIgnoreCase(name)) {
			itm_grp_nm6_lcl3(value);
			return;
		}
		if ($itm_grp_nm6_lcl4.equalsIgnoreCase(name)) {
			itm_grp_nm6_lcl4(value);
			return;
		}
		if ($itm_grp_nm6_lcl5.equalsIgnoreCase(name)) {
			itm_grp_nm6_lcl5(value);
			return;
		}
		if ($itm_grp_cd7.equalsIgnoreCase(name)) {
			itm_grp_cd7(value);
			return;
		}
		if ($itm_grp_nm7.equalsIgnoreCase(name)) {
			itm_grp_nm7(value);
			return;
		}
		if ($itm_grp_nm7_lcl1.equalsIgnoreCase(name)) {
			itm_grp_nm7_lcl1(value);
			return;
		}
		if ($itm_grp_nm7_lcl2.equalsIgnoreCase(name)) {
			itm_grp_nm7_lcl2(value);
			return;
		}
		if ($itm_grp_nm7_lcl3.equalsIgnoreCase(name)) {
			itm_grp_nm7_lcl3(value);
			return;
		}
		if ($itm_grp_nm7_lcl4.equalsIgnoreCase(name)) {
			itm_grp_nm7_lcl4(value);
			return;
		}
		if ($itm_grp_nm7_lcl5.equalsIgnoreCase(name)) {
			itm_grp_nm7_lcl5(value);
			return;
		}
		if ($itm_grp_cd8.equalsIgnoreCase(name)) {
			itm_grp_cd8(value);
			return;
		}
		if ($itm_grp_nm8.equalsIgnoreCase(name)) {
			itm_grp_nm8(value);
			return;
		}
		if ($itm_grp_nm8_lcl1.equalsIgnoreCase(name)) {
			itm_grp_nm8_lcl1(value);
			return;
		}
		if ($itm_grp_nm8_lcl2.equalsIgnoreCase(name)) {
			itm_grp_nm8_lcl2(value);
			return;
		}
		if ($itm_grp_nm8_lcl3.equalsIgnoreCase(name)) {
			itm_grp_nm8_lcl3(value);
			return;
		}
		if ($itm_grp_nm8_lcl4.equalsIgnoreCase(name)) {
			itm_grp_nm8_lcl4(value);
			return;
		}
		if ($itm_grp_nm8_lcl5.equalsIgnoreCase(name)) {
			itm_grp_nm8_lcl5(value);
			return;
		}
		if ($itm_grp_cd9.equalsIgnoreCase(name)) {
			itm_grp_cd9(value);
			return;
		}
		if ($itm_grp_nm9.equalsIgnoreCase(name)) {
			itm_grp_nm9(value);
			return;
		}
		if ($itm_grp_nm9_lcl1.equalsIgnoreCase(name)) {
			itm_grp_nm9_lcl1(value);
			return;
		}
		if ($itm_grp_nm9_lcl2.equalsIgnoreCase(name)) {
			itm_grp_nm9_lcl2(value);
			return;
		}
		if ($itm_grp_nm9_lcl3.equalsIgnoreCase(name)) {
			itm_grp_nm9_lcl3(value);
			return;
		}
		if ($itm_grp_nm9_lcl4.equalsIgnoreCase(name)) {
			itm_grp_nm9_lcl4(value);
			return;
		}
		if ($itm_grp_nm9_lcl5.equalsIgnoreCase(name)) {
			itm_grp_nm9_lcl5(value);
			return;
		}
		if ($itm_grp_cd10.equalsIgnoreCase(name)) {
			itm_grp_cd10(value);
			return;
		}
		if ($itm_grp_nm10.equalsIgnoreCase(name)) {
			itm_grp_nm10(value);
			return;
		}
		if ($itm_grp_nm10_lcl1.equalsIgnoreCase(name)) {
			itm_grp_nm10_lcl1(value);
			return;
		}
		if ($itm_grp_nm10_lcl2.equalsIgnoreCase(name)) {
			itm_grp_nm10_lcl2(value);
			return;
		}
		if ($itm_grp_nm10_lcl3.equalsIgnoreCase(name)) {
			itm_grp_nm10_lcl3(value);
			return;
		}
		if ($itm_grp_nm10_lcl4.equalsIgnoreCase(name)) {
			itm_grp_nm10_lcl4(value);
			return;
		}
		if ($itm_grp_nm10_lcl5.equalsIgnoreCase(name)) {
			itm_grp_nm10_lcl5(value);
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
