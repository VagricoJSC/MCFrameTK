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
import mcframe.commonCore.lang.MCBinary;
import mcframe.commonCore.lang.MCNumber;
import mcframe.serverCore.queryapi.IFMCSQL.MCStringPermColumn;
import mcframe.serverCore.queryapi.IFMCSQL.MCNumberPermColumn;
import mcframe.serverCore.queryapi.IFMCSQL.MCTimestampPermColumn;
import mcframe.serverCore.queryapi.IFMCSQL.MCBooleanPermColumn;
import mcframe.serverCore.queryapi.IFMCSQL.MCBinaryPermColumn;
import mcframe.commonCore.meta.MCMeta;
import mcframe.commonCore.lang.MCDataType;
import mcframe.commonCore.lang.MCTimestamp;
import mcframe.serverCore.queryapi.MCDBContainer;
import mcframe.serverCore.queryapi.MCDBContainer.MCTableType;
import mcframe.serverCore.queryapi.IFMCSQL.MCPermColumn;
import mcframe.serverCore.queryapi.IFMCSQL.MCPermColumnInfo;
import mcframe.serverCore.queryapi.MCForeignInfo;

/**
 * "品目マスタ_（共通）_更新用ビュー // Item master view"DBコンテナRowクラスです。<p>
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
 *  	<td>C</td>
 *  	<td>itm_nm</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>品名</td>
 *  	<td>Item name</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>itm_alt_nm1</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>品目別名１</td>
 *  	<td>Item alias name 1</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>itm_alt_nm2</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>品目別名２</td>
 *  	<td>Item alias name 2</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>itm_alt_nm3</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>品目別名３</td>
 *  	<td>Item alias name 3</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>itm_alt_nm4</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>品目別名４</td>
 *  	<td>Item alias name 4</td>
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
 *  	<td>stk_mng_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>在庫管理区分</td>
 *  	<td>Inventory management type</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>asset_mng_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>資産管理区分</td>
 *  	<td>Asset management type</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>sundry_itm_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>諸口品ＦＬＧ</td>
 *  	<td>Miscellaneous item flg.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>dscnt_itm_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>値引品目ＦＬＧ</td>
 *  	<td>Discount item flg.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>unit_cd</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>単位ＣＤ</td>
 *  	<td>Unit cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>dec_place</td>
 *  	<td>N</td>
 *  	<td>2,0</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>小数部有効桁数</td>
 *  	<td>Number of decimal places</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>rnd_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>端数処理区分</td>
 *  	<td>Rounding type</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>dim_unit_cd</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>容積単位ＣＤ</td>
 *  	<td>Volume unit cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>dim</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>容積</td>
 *  	<td>Volume</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>wt_unit_cd</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>重量単位ＣＤ</td>
 *  	<td>Weight unit cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>wt</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>重量</td>
 *  	<td>Weight</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>conts_unit_cd</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>入り目単位ＣＤ</td>
 *  	<td>Conversion unit cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>conts_qty</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>入り目数</td>
 *  	<td>Conversion qty.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>unit_dim</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>単位容積（ｍ３）</td>
 *  	<td>Unit volume (m3)</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>unit_wt</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>単位重量（ＫＧ）</td>
 *  	<td>Unit weight (KG)</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>hs_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＨＳ ＣＤ</td>
 *  	<td>HS cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>jan_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＪＡＮ区分</td>
 *  	<td>JAN type</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>jan_cd</td>
 *  	<td>C</td>
 *  	<td>13</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＪＡＮ ＣＤ</td>
 *  	<td>JAN cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>itf_cd</td>
 *  	<td>C</td>
 *  	<td>16</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＩＴＦ ＣＤ</td>
 *  	<td>ITF cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>gtin_cd</td>
 *  	<td>C</td>
 *  	<td>14</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＧＴＩＮ ＣＤ</td>
 *  	<td>GTIN cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>th_image</td>
 *  	<td>B</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>サムネイル画像</td>
 *  	<td>Thumbnail image</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>sls_itm_grp_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>販売品目体系ＣＤ</td>
 *  	<td>Sales item system cd.</td>
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
 * </table>
 *
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
public class MAM_ITM_CMN_UPD_R extends MCDBContainer {

	public static final MCTableType TABLE_TYPE = MCTableType.VIEW;

	public static final String TABLE_NAME = "MAM_ITM_CMN_UPD";

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
	 * 品名. Item name.<p>
	 *
	 */
	public static final String $itm_nm = "itm_nm";
	private static final MCPermColumnInfo _itm_nm = createColumnInfo("itm_nm");
	public final MCStringPermColumn itm_nm = createStringColumn(_itm_nm);
	
	/**
	 * 品目別名１. Item alias name 1.<p>
	 *
	 */
	public static final String $itm_alt_nm1 = "itm_alt_nm1";
	private static final MCPermColumnInfo _itm_alt_nm1 = createColumnInfo("itm_alt_nm1");
	public final MCStringPermColumn itm_alt_nm1 = createStringColumn(_itm_alt_nm1);
	
	/**
	 * 品目別名２. Item alias name 2.<p>
	 *
	 */
	public static final String $itm_alt_nm2 = "itm_alt_nm2";
	private static final MCPermColumnInfo _itm_alt_nm2 = createColumnInfo("itm_alt_nm2");
	public final MCStringPermColumn itm_alt_nm2 = createStringColumn(_itm_alt_nm2);
	
	/**
	 * 品目別名３. Item alias name 3.<p>
	 *
	 */
	public static final String $itm_alt_nm3 = "itm_alt_nm3";
	private static final MCPermColumnInfo _itm_alt_nm3 = createColumnInfo("itm_alt_nm3");
	public final MCStringPermColumn itm_alt_nm3 = createStringColumn(_itm_alt_nm3);
	
	/**
	 * 品目別名４. Item alias name 4.<p>
	 *
	 */
	public static final String $itm_alt_nm4 = "itm_alt_nm4";
	private static final MCPermColumnInfo _itm_alt_nm4 = createColumnInfo("itm_alt_nm4");
	public final MCStringPermColumn itm_alt_nm4 = createStringColumn(_itm_alt_nm4);
	
	/**
	 * 品目分類ＣＤ１. Item classification cd. 1.<p>
	 *
	 */
	public static final String $itm_grp_cd1 = "itm_grp_cd1";
	private static final MCPermColumnInfo _itm_grp_cd1 = createColumnInfo("itm_grp_cd1");
	public final MCStringPermColumn itm_grp_cd1 = createStringColumn(_itm_grp_cd1);
	
	/**
	 * 品目分類ＣＤ２. Item classification cd. 2.<p>
	 *
	 */
	public static final String $itm_grp_cd2 = "itm_grp_cd2";
	private static final MCPermColumnInfo _itm_grp_cd2 = createColumnInfo("itm_grp_cd2");
	public final MCStringPermColumn itm_grp_cd2 = createStringColumn(_itm_grp_cd2);
	
	/**
	 * 品目分類ＣＤ３. Item classification cd. 3.<p>
	 *
	 */
	public static final String $itm_grp_cd3 = "itm_grp_cd3";
	private static final MCPermColumnInfo _itm_grp_cd3 = createColumnInfo("itm_grp_cd3");
	public final MCStringPermColumn itm_grp_cd3 = createStringColumn(_itm_grp_cd3);
	
	/**
	 * 品目分類ＣＤ４. Item classification cd. 4.<p>
	 *
	 */
	public static final String $itm_grp_cd4 = "itm_grp_cd4";
	private static final MCPermColumnInfo _itm_grp_cd4 = createColumnInfo("itm_grp_cd4");
	public final MCStringPermColumn itm_grp_cd4 = createStringColumn(_itm_grp_cd4);
	
	/**
	 * 品目分類ＣＤ５. Item classification cd. 5.<p>
	 *
	 */
	public static final String $itm_grp_cd5 = "itm_grp_cd5";
	private static final MCPermColumnInfo _itm_grp_cd5 = createColumnInfo("itm_grp_cd5");
	public final MCStringPermColumn itm_grp_cd5 = createStringColumn(_itm_grp_cd5);
	
	/**
	 * 品目分類ＣＤ６. Item classification cd. 6.<p>
	 *
	 */
	public static final String $itm_grp_cd6 = "itm_grp_cd6";
	private static final MCPermColumnInfo _itm_grp_cd6 = createColumnInfo("itm_grp_cd6");
	public final MCStringPermColumn itm_grp_cd6 = createStringColumn(_itm_grp_cd6);
	
	/**
	 * 品目分類ＣＤ７. Item classification cd. 7.<p>
	 *
	 */
	public static final String $itm_grp_cd7 = "itm_grp_cd7";
	private static final MCPermColumnInfo _itm_grp_cd7 = createColumnInfo("itm_grp_cd7");
	public final MCStringPermColumn itm_grp_cd7 = createStringColumn(_itm_grp_cd7);
	
	/**
	 * 品目分類ＣＤ８. Item classification cd. 8.<p>
	 *
	 */
	public static final String $itm_grp_cd8 = "itm_grp_cd8";
	private static final MCPermColumnInfo _itm_grp_cd8 = createColumnInfo("itm_grp_cd8");
	public final MCStringPermColumn itm_grp_cd8 = createStringColumn(_itm_grp_cd8);
	
	/**
	 * 品目分類ＣＤ９. Item classification cd. 9.<p>
	 *
	 */
	public static final String $itm_grp_cd9 = "itm_grp_cd9";
	private static final MCPermColumnInfo _itm_grp_cd9 = createColumnInfo("itm_grp_cd9");
	public final MCStringPermColumn itm_grp_cd9 = createStringColumn(_itm_grp_cd9);
	
	/**
	 * 品目分類ＣＤ１０. Item classification cd. 10.<p>
	 *
	 */
	public static final String $itm_grp_cd10 = "itm_grp_cd10";
	private static final MCPermColumnInfo _itm_grp_cd10 = createColumnInfo("itm_grp_cd10");
	public final MCStringPermColumn itm_grp_cd10 = createStringColumn(_itm_grp_cd10);
	
	/**
	 * 在庫管理区分. Inventory management type.<p>
	 *
	 */
	public static final String $stk_mng_typ = "stk_mng_typ";
	private static final MCPermColumnInfo _stk_mng_typ = createColumnInfo("stk_mng_typ");
	public final MCStringPermColumn stk_mng_typ = createStringColumn(_stk_mng_typ);
	
	/**
	 * 資産管理区分. Asset management type.<p>
	 *
	 */
	public static final String $asset_mng_typ = "asset_mng_typ";
	private static final MCPermColumnInfo _asset_mng_typ = createColumnInfo("asset_mng_typ");
	public final MCStringPermColumn asset_mng_typ = createStringColumn(_asset_mng_typ);
	
	/**
	 * 諸口品ＦＬＧ. Miscellaneous item flg..<p>
	 *
	 */
	public static final String $sundry_itm_flg = "sundry_itm_flg";
	private static final MCPermColumnInfo _sundry_itm_flg = createColumnInfo("sundry_itm_flg");
	public final MCBooleanPermColumn sundry_itm_flg = createBooleanColumn(_sundry_itm_flg);
	
	/**
	 * 値引品目ＦＬＧ. Discount item flg..<p>
	 *
	 */
	public static final String $dscnt_itm_flg = "dscnt_itm_flg";
	private static final MCPermColumnInfo _dscnt_itm_flg = createColumnInfo("dscnt_itm_flg");
	public final MCBooleanPermColumn dscnt_itm_flg = createBooleanColumn(_dscnt_itm_flg);
	
	/**
	 * 単位ＣＤ. Unit cd..<p>
	 *
	 */
	public static final String $unit_cd = "unit_cd";
	private static final MCPermColumnInfo _unit_cd = createColumnInfo("unit_cd");
	public final MCStringPermColumn unit_cd = createStringColumn(_unit_cd);
	
	/**
	 * 小数部有効桁数. Number of decimal places.<p>
	 *
	 */
	public static final String $dec_place = "dec_place";
	private static final MCPermColumnInfo _dec_place = createColumnInfo("dec_place");
	public final MCNumberPermColumn dec_place = createNumberColumn(_dec_place);
	
	/**
	 * 端数処理区分. Rounding type.<p>
	 *
	 */
	public static final String $rnd_typ = "rnd_typ";
	private static final MCPermColumnInfo _rnd_typ = createColumnInfo("rnd_typ");
	public final MCStringPermColumn rnd_typ = createStringColumn(_rnd_typ);
	
	/**
	 * 容積単位ＣＤ. Volume unit cd..<p>
	 *
	 */
	public static final String $dim_unit_cd = "dim_unit_cd";
	private static final MCPermColumnInfo _dim_unit_cd = createColumnInfo("dim_unit_cd");
	public final MCStringPermColumn dim_unit_cd = createStringColumn(_dim_unit_cd);
	
	/**
	 * 容積. Volume.<p>
	 *
	 */
	public static final String $dim = "dim";
	private static final MCPermColumnInfo _dim = createColumnInfo("dim");
	public final MCNumberPermColumn dim = createNumberColumn(_dim);
	
	/**
	 * 重量単位ＣＤ. Weight unit cd..<p>
	 *
	 */
	public static final String $wt_unit_cd = "wt_unit_cd";
	private static final MCPermColumnInfo _wt_unit_cd = createColumnInfo("wt_unit_cd");
	public final MCStringPermColumn wt_unit_cd = createStringColumn(_wt_unit_cd);
	
	/**
	 * 重量. Weight.<p>
	 *
	 */
	public static final String $wt = "wt";
	private static final MCPermColumnInfo _wt = createColumnInfo("wt");
	public final MCNumberPermColumn wt = createNumberColumn(_wt);
	
	/**
	 * 入り目単位ＣＤ. Conversion unit cd..<p>
	 *
	 */
	public static final String $conts_unit_cd = "conts_unit_cd";
	private static final MCPermColumnInfo _conts_unit_cd = createColumnInfo("conts_unit_cd");
	public final MCStringPermColumn conts_unit_cd = createStringColumn(_conts_unit_cd);
	
	/**
	 * 入り目数. Conversion qty..<p>
	 *
	 */
	public static final String $conts_qty = "conts_qty";
	private static final MCPermColumnInfo _conts_qty = createColumnInfo("conts_qty");
	public final MCNumberPermColumn conts_qty = createNumberColumn(_conts_qty);
	
	/**
	 * 単位容積（ｍ３）. Unit volume (m3).<p>
	 *
	 */
	public static final String $unit_dim = "unit_dim";
	private static final MCPermColumnInfo _unit_dim = createColumnInfo("unit_dim");
	public final MCNumberPermColumn unit_dim = createNumberColumn(_unit_dim);
	
	/**
	 * 単位重量（ＫＧ）. Unit weight (KG).<p>
	 *
	 */
	public static final String $unit_wt = "unit_wt";
	private static final MCPermColumnInfo _unit_wt = createColumnInfo("unit_wt");
	public final MCNumberPermColumn unit_wt = createNumberColumn(_unit_wt);
	
	/**
	 * ＨＳ ＣＤ. HS cd..<p>
	 *
	 */
	public static final String $hs_cd = "hs_cd";
	private static final MCPermColumnInfo _hs_cd = createColumnInfo("hs_cd");
	public final MCStringPermColumn hs_cd = createStringColumn(_hs_cd);
	
	/**
	 * ＪＡＮ区分. JAN type.<p>
	 *
	 */
	public static final String $jan_typ = "jan_typ";
	private static final MCPermColumnInfo _jan_typ = createColumnInfo("jan_typ");
	public final MCStringPermColumn jan_typ = createStringColumn(_jan_typ);
	
	/**
	 * ＪＡＮ ＣＤ. JAN cd..<p>
	 *
	 */
	public static final String $jan_cd = "jan_cd";
	private static final MCPermColumnInfo _jan_cd = createColumnInfo("jan_cd");
	public final MCStringPermColumn jan_cd = createStringColumn(_jan_cd);
	
	/**
	 * ＩＴＦ ＣＤ. ITF cd..<p>
	 *
	 */
	public static final String $itf_cd = "itf_cd";
	private static final MCPermColumnInfo _itf_cd = createColumnInfo("itf_cd");
	public final MCStringPermColumn itf_cd = createStringColumn(_itf_cd);
	
	/**
	 * ＧＴＩＮ ＣＤ. GTIN cd..<p>
	 *
	 */
	public static final String $gtin_cd = "gtin_cd";
	private static final MCPermColumnInfo _gtin_cd = createColumnInfo("gtin_cd");
	public final MCStringPermColumn gtin_cd = createStringColumn(_gtin_cd);
	
	/**
	 * サムネイル画像. Thumbnail image.<p>
	 *
	 */
	public static final String $th_image = "th_image";
	private static final MCPermColumnInfo _th_image = createColumnInfo("th_image");
	public final MCBinaryPermColumn th_image = createBinaryColumn(_th_image);
	
	/**
	 * 販売品目体系ＣＤ. Sales item system cd..<p>
	 *
	 */
	public static final String $sls_itm_grp_cd = "sls_itm_grp_cd";
	private static final MCPermColumnInfo _sls_itm_grp_cd = createColumnInfo("sls_itm_grp_cd");
	public final MCStringPermColumn sls_itm_grp_cd = createStringColumn(_sls_itm_grp_cd);
	
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
	
	public static final MCMeta itm_cd_META = createCommonMeta($itm_cd, mcframe.commonMA.meta.MA_META.ITM_CD);
	public static final MCMeta itm_sub1_META = createCommonMeta($itm_sub1, mcframe.commonMA.meta.MA_META.ITM_SUB1);
	public static final MCMeta itm_sub2_META = createCommonMeta($itm_sub2, mcframe.commonMA.meta.MA_META.ITM_SUB2);
	public static final MCMeta itm_sub3_META = createCommonMeta($itm_sub3, mcframe.commonMA.meta.MA_META.ITM_SUB3);
	public static final MCMeta itm_nm_META = createCommonMeta($itm_nm, mcframe.commonMA.meta.MA_META.ITM_NM);
	public static final MCMeta itm_alt_nm1_META = createCommonMeta($itm_alt_nm1, mcframe.commonMA.meta.MA_META.ITM_ALT_NM1);
	public static final MCMeta itm_alt_nm2_META = createCommonMeta($itm_alt_nm2, mcframe.commonMA.meta.MA_META.ITM_ALT_NM2);
	public static final MCMeta itm_alt_nm3_META = createCommonMeta($itm_alt_nm3, mcframe.commonMA.meta.MA_META.ITM_ALT_NM3);
	public static final MCMeta itm_alt_nm4_META = createCommonMeta($itm_alt_nm4, mcframe.commonMA.meta.MA_META.ITM_ALT_NM4);
	public static final MCMeta itm_grp_cd1_META = createCommonMeta($itm_grp_cd1, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta itm_grp_cd2_META = createCommonMeta($itm_grp_cd2, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta itm_grp_cd3_META = createCommonMeta($itm_grp_cd3, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta itm_grp_cd4_META = createCommonMeta($itm_grp_cd4, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta itm_grp_cd5_META = createCommonMeta($itm_grp_cd5, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta itm_grp_cd6_META = createCommonMeta($itm_grp_cd6, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta itm_grp_cd7_META = createCommonMeta($itm_grp_cd7, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta itm_grp_cd8_META = createCommonMeta($itm_grp_cd8, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta itm_grp_cd9_META = createCommonMeta($itm_grp_cd9, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta itm_grp_cd10_META = createCommonMeta($itm_grp_cd10, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta stk_mng_typ_META = createCommonMeta($stk_mng_typ, mcframe.commonMA.meta.MA_META.STK_MNG_TYP);
	public static final MCMeta asset_mng_typ_META = createCommonMeta($asset_mng_typ, mcframe.commonMA.meta.MA_META.ASSET_MNG_TYP);
	public static final MCMeta sundry_itm_flg_META = createCommonMeta($sundry_itm_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta dscnt_itm_flg_META = createCommonMeta($dscnt_itm_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta unit_cd_META = createCommonMeta($unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta dec_place_META = createCommonMeta($dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta rnd_typ_META = createCommonMeta($rnd_typ, mcframe.commonMA.meta.MA_META.RND_TYP);
	public static final MCMeta dim_unit_cd_META = createCommonMeta($dim_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta dim_META = createCommonMeta($dim, mcframe.commonMA.meta.MA_META.DIM);
	public static final MCMeta wt_unit_cd_META = createCommonMeta($wt_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta wt_META = createCommonMeta($wt, mcframe.commonMA.meta.MA_META.WT);
	public static final MCMeta conts_unit_cd_META = createCommonMeta($conts_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta conts_qty_META = createCommonMeta($conts_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta unit_dim_META = createCommonMeta($unit_dim, mcframe.commonMA.meta.MA_META.DIM);
	public static final MCMeta unit_wt_META = createCommonMeta($unit_wt, mcframe.commonMA.meta.MA_META.WT);
	public static final MCMeta hs_cd_META = createCommonMeta($hs_cd, mcframe.commonMA.meta.MA_META.HS_CD);
	public static final MCMeta jan_typ_META = createCommonMeta($jan_typ, mcframe.commonMA.meta.MA_META.JAN_TYP);
	public static final MCMeta jan_cd_META = createCommonMeta($jan_cd, mcframe.commonMA.meta.MA_META.JAN_CD);
	public static final MCMeta itf_cd_META = createCommonMeta($itf_cd, mcframe.commonMA.meta.MA_META.ITF_CD);
	public static final MCMeta gtin_cd_META = createCommonMeta($gtin_cd, mcframe.commonMA.meta.MA_META.GTIN_CD);
	public static final MCMeta th_image_META = createCommonMeta($th_image, mcframe.commonMA.meta.MA_META.BIN);
	public static final MCMeta sls_itm_grp_cd_META = createCommonMeta($sls_itm_grp_cd, mcframe.commonMA.meta.MA_META.SLS_ITM_GRP_CD);
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

	protected static final List<MCForeignInfo> FOREIGN_INFO_LIST = new ArrayList<>();
	static {
	}
	
	protected static final ConstMetaList<MAM_ITM_CMN_UPD_R> constMetas = new ConstMetaList<MAM_ITM_CMN_UPD_R>(
		MCDBContainer.constMetas,
		new MCMeta[]{
			itm_cd_META,
			itm_sub1_META,
			itm_sub2_META,
			itm_sub3_META,
			itm_nm_META,
			itm_alt_nm1_META,
			itm_alt_nm2_META,
			itm_alt_nm3_META,
			itm_alt_nm4_META,
			itm_grp_cd1_META,
			itm_grp_cd2_META,
			itm_grp_cd3_META,
			itm_grp_cd4_META,
			itm_grp_cd5_META,
			itm_grp_cd6_META,
			itm_grp_cd7_META,
			itm_grp_cd8_META,
			itm_grp_cd9_META,
			itm_grp_cd10_META,
			stk_mng_typ_META,
			asset_mng_typ_META,
			sundry_itm_flg_META,
			dscnt_itm_flg_META,
			unit_cd_META,
			dec_place_META,
			rnd_typ_META,
			dim_unit_cd_META,
			dim_META,
			wt_unit_cd_META,
			wt_META,
			conts_unit_cd_META,
			conts_qty_META,
			unit_dim_META,
			unit_wt_META,
			hs_cd_META,
			jan_typ_META,
			jan_cd_META,
			itf_cd_META,
			gtin_cd_META,
			th_image_META,
			sls_itm_grp_cd_META,
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
	protected MAM_ITM_CMN_UPD_R(ConstMetaList<? extends MAM_ITM_CMN_UPD_R> metas, String alias) {
		super(metas, TABLE_TYPE, TABLE_NAME, alias, EX_CTRL, LCL_TABLE, FOREIGN_INFO_LIST);
		super.setColumnMap(getColumnMap());
	}

	protected MAM_ITM_CMN_UPD_R(ConstMetaList<? extends MAM_ITM_CMN_UPD_R> metas) {
		this(metas, TABLE_NAME);
	}

	protected LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> getColumnMap() {
		LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> COLUMN_MAP = new LinkedHashMap<>();
		COLUMN_MAP.put(
			MAM_ITM_CMN_UPD_R.$itm_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_ITM_CMN_UPD_R.$itm_cd,
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
			MAM_ITM_CMN_UPD_R.$itm_sub1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_ITM_CMN_UPD_R.$itm_sub1,
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
			MAM_ITM_CMN_UPD_R.$itm_sub2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_ITM_CMN_UPD_R.$itm_sub2,
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
			MAM_ITM_CMN_UPD_R.$itm_sub3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_ITM_CMN_UPD_R.$itm_sub3,
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
			MAM_ITM_CMN_UPD_R.$itm_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_ITM_CMN_UPD_R.$itm_nm,
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
			MAM_ITM_CMN_UPD_R.$itm_alt_nm1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_ITM_CMN_UPD_R.$itm_alt_nm1,
				"itm_alt_nm1",
				itm_alt_nm1,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_ITM_CMN_UPD_R.$itm_alt_nm2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_ITM_CMN_UPD_R.$itm_alt_nm2,
				"itm_alt_nm2",
				itm_alt_nm2,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_ITM_CMN_UPD_R.$itm_alt_nm3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_ITM_CMN_UPD_R.$itm_alt_nm3,
				"itm_alt_nm3",
				itm_alt_nm3,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_ITM_CMN_UPD_R.$itm_alt_nm4,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_ITM_CMN_UPD_R.$itm_alt_nm4,
				"itm_alt_nm4",
				itm_alt_nm4,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_ITM_CMN_UPD_R.$itm_grp_cd1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_ITM_CMN_UPD_R.$itm_grp_cd1,
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
			MAM_ITM_CMN_UPD_R.$itm_grp_cd2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_ITM_CMN_UPD_R.$itm_grp_cd2,
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
			MAM_ITM_CMN_UPD_R.$itm_grp_cd3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_ITM_CMN_UPD_R.$itm_grp_cd3,
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
			MAM_ITM_CMN_UPD_R.$itm_grp_cd4,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_ITM_CMN_UPD_R.$itm_grp_cd4,
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
			MAM_ITM_CMN_UPD_R.$itm_grp_cd5,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_ITM_CMN_UPD_R.$itm_grp_cd5,
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
			MAM_ITM_CMN_UPD_R.$itm_grp_cd6,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_ITM_CMN_UPD_R.$itm_grp_cd6,
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
			MAM_ITM_CMN_UPD_R.$itm_grp_cd7,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_ITM_CMN_UPD_R.$itm_grp_cd7,
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
			MAM_ITM_CMN_UPD_R.$itm_grp_cd8,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_ITM_CMN_UPD_R.$itm_grp_cd8,
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
			MAM_ITM_CMN_UPD_R.$itm_grp_cd9,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_ITM_CMN_UPD_R.$itm_grp_cd9,
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
			MAM_ITM_CMN_UPD_R.$itm_grp_cd10,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_ITM_CMN_UPD_R.$itm_grp_cd10,
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
			MAM_ITM_CMN_UPD_R.$stk_mng_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_ITM_CMN_UPD_R.$stk_mng_typ,
				"stk_mng_typ",
				stk_mng_typ,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_ITM_CMN_UPD_R.$asset_mng_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_ITM_CMN_UPD_R.$asset_mng_typ,
				"asset_mng_typ",
				asset_mng_typ,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_ITM_CMN_UPD_R.$sundry_itm_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MAM_ITM_CMN_UPD_R.$sundry_itm_flg,
				"sundry_itm_flg",
				sundry_itm_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_ITM_CMN_UPD_R.$dscnt_itm_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MAM_ITM_CMN_UPD_R.$dscnt_itm_flg,
				"dscnt_itm_flg",
				dscnt_itm_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_ITM_CMN_UPD_R.$unit_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_ITM_CMN_UPD_R.$unit_cd,
				"unit_cd",
				unit_cd,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_ITM_CMN_UPD_R.$dec_place,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MAM_ITM_CMN_UPD_R.$dec_place,
				"dec_place",
				dec_place,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_ITM_CMN_UPD_R.$rnd_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_ITM_CMN_UPD_R.$rnd_typ,
				"rnd_typ",
				rnd_typ,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_ITM_CMN_UPD_R.$dim_unit_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_ITM_CMN_UPD_R.$dim_unit_cd,
				"dim_unit_cd",
				dim_unit_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_ITM_CMN_UPD_R.$dim,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MAM_ITM_CMN_UPD_R.$dim,
				"dim",
				dim,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_ITM_CMN_UPD_R.$wt_unit_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_ITM_CMN_UPD_R.$wt_unit_cd,
				"wt_unit_cd",
				wt_unit_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_ITM_CMN_UPD_R.$wt,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MAM_ITM_CMN_UPD_R.$wt,
				"wt",
				wt,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_ITM_CMN_UPD_R.$conts_unit_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_ITM_CMN_UPD_R.$conts_unit_cd,
				"conts_unit_cd",
				conts_unit_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_ITM_CMN_UPD_R.$conts_qty,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MAM_ITM_CMN_UPD_R.$conts_qty,
				"conts_qty",
				conts_qty,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_ITM_CMN_UPD_R.$unit_dim,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MAM_ITM_CMN_UPD_R.$unit_dim,
				"unit_dim",
				unit_dim,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_ITM_CMN_UPD_R.$unit_wt,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MAM_ITM_CMN_UPD_R.$unit_wt,
				"unit_wt",
				unit_wt,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_ITM_CMN_UPD_R.$hs_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_ITM_CMN_UPD_R.$hs_cd,
				"hs_cd",
				hs_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_ITM_CMN_UPD_R.$jan_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_ITM_CMN_UPD_R.$jan_typ,
				"jan_typ",
				jan_typ,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_ITM_CMN_UPD_R.$jan_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_ITM_CMN_UPD_R.$jan_cd,
				"jan_cd",
				jan_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_ITM_CMN_UPD_R.$itf_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_ITM_CMN_UPD_R.$itf_cd,
				"itf_cd",
				itf_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_ITM_CMN_UPD_R.$gtin_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_ITM_CMN_UPD_R.$gtin_cd,
				"gtin_cd",
				gtin_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_ITM_CMN_UPD_R.$th_image,
			new MCDBContainerColulmnInfo<MCBinaryPermColumn>(
				MCDataType.BINARY,
				MAM_ITM_CMN_UPD_R.$th_image,
				"th_image",
				th_image,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_ITM_CMN_UPD_R.$sls_itm_grp_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_ITM_CMN_UPD_R.$sls_itm_grp_cd,
				"sls_itm_grp_cd",
				sls_itm_grp_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_ITM_CMN_UPD_R.$memo1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_ITM_CMN_UPD_R.$memo1,
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
			MAM_ITM_CMN_UPD_R.$memo2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_ITM_CMN_UPD_R.$memo2,
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
			MAM_ITM_CMN_UPD_R.$memo3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_ITM_CMN_UPD_R.$memo3,
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
			MAM_ITM_CMN_UPD_R.$del_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MAM_ITM_CMN_UPD_R.$del_flg,
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
			MAM_ITM_CMN_UPD_R.$del_usr_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_ITM_CMN_UPD_R.$del_usr_id,
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
			MAM_ITM_CMN_UPD_R.$del_usr_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_ITM_CMN_UPD_R.$del_usr_nm,
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
			MAM_ITM_CMN_UPD_R.$del_ts,
			new MCDBContainerColulmnInfo<MCTimestampPermColumn>(
				MCDataType.TIMESTAMP,
				MAM_ITM_CMN_UPD_R.$del_ts,
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
			MAM_ITM_CMN_UPD_R.$ins_usr_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_ITM_CMN_UPD_R.$ins_usr_id,
				"ins_usr_id",
				ins_usr_id,
				false,
				true,
				true,
				true,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_ITM_CMN_UPD_R.$ins_usr_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_ITM_CMN_UPD_R.$ins_usr_nm,
				"ins_usr_nm",
				ins_usr_nm,
				false,
				true,
				true,
				true,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_ITM_CMN_UPD_R.$ins_ts,
			new MCDBContainerColulmnInfo<MCTimestampPermColumn>(
				MCDataType.TIMESTAMP,
				MAM_ITM_CMN_UPD_R.$ins_ts,
				"ins_ts",
				ins_ts,
				false,
				true,
				true,
				true,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_ITM_CMN_UPD_R.$ins_func_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_ITM_CMN_UPD_R.$ins_func_id,
				"ins_func_id",
				ins_func_id,
				false,
				true,
				true,
				true,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_ITM_CMN_UPD_R.$upd_cntr,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MAM_ITM_CMN_UPD_R.$upd_cntr,
				"upd_cntr",
				upd_cntr,
				false,
				true,
				true,
				true,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_ITM_CMN_UPD_R.$upd_usr_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_ITM_CMN_UPD_R.$upd_usr_id,
				"upd_usr_id",
				upd_usr_id,
				false,
				true,
				true,
				true,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_ITM_CMN_UPD_R.$upd_usr_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_ITM_CMN_UPD_R.$upd_usr_nm,
				"upd_usr_nm",
				upd_usr_nm,
				false,
				true,
				true,
				true,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_ITM_CMN_UPD_R.$upd_ts,
			new MCDBContainerColulmnInfo<MCTimestampPermColumn>(
				MCDataType.TIMESTAMP,
				MAM_ITM_CMN_UPD_R.$upd_ts,
				"upd_ts",
				upd_ts,
				false,
				true,
				true,
				true,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_ITM_CMN_UPD_R.$upd_func_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_ITM_CMN_UPD_R.$upd_func_id,
				"upd_func_id",
				upd_func_id,
				false,
				true,
				true,
				true,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_ITM_CMN_UPD_R.$upd_srv_req_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_ITM_CMN_UPD_R.$upd_srv_req_no,
				"upd_srv_req_no",
				upd_srv_req_no,
				false,
				true,
				true,
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
	public static MAM_ITM_CMN_UPD_R create() {
		return create(TABLE_NAME);
	}

	/**
	 * 新しいRowを生成します。
	 *
	 * @return 新しいインスタンス
	 */
	public static MAM_ITM_CMN_UPD_R create(String alias) {
		MAM_ITM_CMN_UPD_R row = new MAM_ITM_CMN_UPD_R(constMetas, alias);
		return row;
	}

	/**
	 * 新しいRowを生成し別のRowの内容を設定します。
	 *
	 * @param proto 設定するRow
	 * @return 内容を設定した新しいインスタンス
	 */
	public static <T extends MCRow> MAM_ITM_CMN_UPD_R createByName(T proto) {
		MAM_ITM_CMN_UPD_R row = MAM_ITM_CMN_UPD_R.create();
		copyByName(row, proto);
		return row;
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MAM_ITM_CMN_UPD_R clone() {
		return (MAM_ITM_CMN_UPD_R) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MAM_ITM_CMN_UPD_R createInstance() {
		return (MAM_ITM_CMN_UPD_R) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MAM_ITM_CMN_UPD_R getValues(String... names) {
		return (MAM_ITM_CMN_UPD_R) super.getValues(names);
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
	 * 品名. Item name.<p>
	 *
	 */
	public String itm_nm() {
		return getConstString(offset + 4, $itm_nm);
	}

	/**
	 * 品名. Item name.<p>
	 *
	 */
	public void itm_nm(String value) {
		setConstString(offset + 4, $itm_nm, value);
	}

	/**
	 * 品目別名１. Item alias name 1.<p>
	 *
	 */
	public String itm_alt_nm1() {
		return getConstString(offset + 5, $itm_alt_nm1);
	}

	/**
	 * 品目別名１. Item alias name 1.<p>
	 *
	 */
	public void itm_alt_nm1(String value) {
		setConstString(offset + 5, $itm_alt_nm1, value);
	}

	/**
	 * 品目別名２. Item alias name 2.<p>
	 *
	 */
	public String itm_alt_nm2() {
		return getConstString(offset + 6, $itm_alt_nm2);
	}

	/**
	 * 品目別名２. Item alias name 2.<p>
	 *
	 */
	public void itm_alt_nm2(String value) {
		setConstString(offset + 6, $itm_alt_nm2, value);
	}

	/**
	 * 品目別名３. Item alias name 3.<p>
	 *
	 */
	public String itm_alt_nm3() {
		return getConstString(offset + 7, $itm_alt_nm3);
	}

	/**
	 * 品目別名３. Item alias name 3.<p>
	 *
	 */
	public void itm_alt_nm3(String value) {
		setConstString(offset + 7, $itm_alt_nm3, value);
	}

	/**
	 * 品目別名４. Item alias name 4.<p>
	 *
	 */
	public String itm_alt_nm4() {
		return getConstString(offset + 8, $itm_alt_nm4);
	}

	/**
	 * 品目別名４. Item alias name 4.<p>
	 *
	 */
	public void itm_alt_nm4(String value) {
		setConstString(offset + 8, $itm_alt_nm4, value);
	}

	/**
	 * 品目分類ＣＤ１. Item classification cd. 1.<p>
	 *
	 */
	public String itm_grp_cd1() {
		return getConstString(offset + 9, $itm_grp_cd1);
	}

	/**
	 * 品目分類ＣＤ１. Item classification cd. 1.<p>
	 *
	 */
	public void itm_grp_cd1(String value) {
		setConstString(offset + 9, $itm_grp_cd1, value);
	}

	/**
	 * 品目分類ＣＤ２. Item classification cd. 2.<p>
	 *
	 */
	public String itm_grp_cd2() {
		return getConstString(offset + 10, $itm_grp_cd2);
	}

	/**
	 * 品目分類ＣＤ２. Item classification cd. 2.<p>
	 *
	 */
	public void itm_grp_cd2(String value) {
		setConstString(offset + 10, $itm_grp_cd2, value);
	}

	/**
	 * 品目分類ＣＤ３. Item classification cd. 3.<p>
	 *
	 */
	public String itm_grp_cd3() {
		return getConstString(offset + 11, $itm_grp_cd3);
	}

	/**
	 * 品目分類ＣＤ３. Item classification cd. 3.<p>
	 *
	 */
	public void itm_grp_cd3(String value) {
		setConstString(offset + 11, $itm_grp_cd3, value);
	}

	/**
	 * 品目分類ＣＤ４. Item classification cd. 4.<p>
	 *
	 */
	public String itm_grp_cd4() {
		return getConstString(offset + 12, $itm_grp_cd4);
	}

	/**
	 * 品目分類ＣＤ４. Item classification cd. 4.<p>
	 *
	 */
	public void itm_grp_cd4(String value) {
		setConstString(offset + 12, $itm_grp_cd4, value);
	}

	/**
	 * 品目分類ＣＤ５. Item classification cd. 5.<p>
	 *
	 */
	public String itm_grp_cd5() {
		return getConstString(offset + 13, $itm_grp_cd5);
	}

	/**
	 * 品目分類ＣＤ５. Item classification cd. 5.<p>
	 *
	 */
	public void itm_grp_cd5(String value) {
		setConstString(offset + 13, $itm_grp_cd5, value);
	}

	/**
	 * 品目分類ＣＤ６. Item classification cd. 6.<p>
	 *
	 */
	public String itm_grp_cd6() {
		return getConstString(offset + 14, $itm_grp_cd6);
	}

	/**
	 * 品目分類ＣＤ６. Item classification cd. 6.<p>
	 *
	 */
	public void itm_grp_cd6(String value) {
		setConstString(offset + 14, $itm_grp_cd6, value);
	}

	/**
	 * 品目分類ＣＤ７. Item classification cd. 7.<p>
	 *
	 */
	public String itm_grp_cd7() {
		return getConstString(offset + 15, $itm_grp_cd7);
	}

	/**
	 * 品目分類ＣＤ７. Item classification cd. 7.<p>
	 *
	 */
	public void itm_grp_cd7(String value) {
		setConstString(offset + 15, $itm_grp_cd7, value);
	}

	/**
	 * 品目分類ＣＤ８. Item classification cd. 8.<p>
	 *
	 */
	public String itm_grp_cd8() {
		return getConstString(offset + 16, $itm_grp_cd8);
	}

	/**
	 * 品目分類ＣＤ８. Item classification cd. 8.<p>
	 *
	 */
	public void itm_grp_cd8(String value) {
		setConstString(offset + 16, $itm_grp_cd8, value);
	}

	/**
	 * 品目分類ＣＤ９. Item classification cd. 9.<p>
	 *
	 */
	public String itm_grp_cd9() {
		return getConstString(offset + 17, $itm_grp_cd9);
	}

	/**
	 * 品目分類ＣＤ９. Item classification cd. 9.<p>
	 *
	 */
	public void itm_grp_cd9(String value) {
		setConstString(offset + 17, $itm_grp_cd9, value);
	}

	/**
	 * 品目分類ＣＤ１０. Item classification cd. 10.<p>
	 *
	 */
	public String itm_grp_cd10() {
		return getConstString(offset + 18, $itm_grp_cd10);
	}

	/**
	 * 品目分類ＣＤ１０. Item classification cd. 10.<p>
	 *
	 */
	public void itm_grp_cd10(String value) {
		setConstString(offset + 18, $itm_grp_cd10, value);
	}

	/**
	 * 在庫管理区分. Inventory management type.<p>
	 *
	 */
	public String stk_mng_typ() {
		return getConstString(offset + 19, $stk_mng_typ);
	}

	/**
	 * 在庫管理区分. Inventory management type.<p>
	 *
	 */
	public void stk_mng_typ(String value) {
		setConstString(offset + 19, $stk_mng_typ, value);
	}

	/**
	 * 資産管理区分. Asset management type.<p>
	 *
	 */
	public String asset_mng_typ() {
		return getConstString(offset + 20, $asset_mng_typ);
	}

	/**
	 * 資産管理区分. Asset management type.<p>
	 *
	 */
	public void asset_mng_typ(String value) {
		setConstString(offset + 20, $asset_mng_typ, value);
	}

	/**
	 * 諸口品ＦＬＧ. Miscellaneous item flg..<p>
	 *
	 */
	public boolean sundry_itm_flg() {
		return getConstBoolean(offset + 21, $sundry_itm_flg);
	}

	/**
	 * 諸口品ＦＬＧ. Miscellaneous item flg..<p>
	 *
	 */
	public void sundry_itm_flg(boolean value) {
		setConstBoolean(offset + 21, $sundry_itm_flg, value);
	}

	/**
	 * 値引品目ＦＬＧ. Discount item flg..<p>
	 *
	 */
	public boolean dscnt_itm_flg() {
		return getConstBoolean(offset + 22, $dscnt_itm_flg);
	}

	/**
	 * 値引品目ＦＬＧ. Discount item flg..<p>
	 *
	 */
	public void dscnt_itm_flg(boolean value) {
		setConstBoolean(offset + 22, $dscnt_itm_flg, value);
	}

	/**
	 * 単位ＣＤ. Unit cd..<p>
	 *
	 */
	public String unit_cd() {
		return getConstString(offset + 23, $unit_cd);
	}

	/**
	 * 単位ＣＤ. Unit cd..<p>
	 *
	 */
	public void unit_cd(String value) {
		setConstString(offset + 23, $unit_cd, value);
	}

	/**
	 * 小数部有効桁数. Number of decimal places.<p>
	 *
	 */
	public MCNumber dec_place() {
		return getConstNumber(offset + 24, $dec_place);
	}

	/**
	 * 小数部有効桁数. Number of decimal places.<p>
	 *
	 */
	public void dec_place(MCNumber value) {
		setConstNumber(offset + 24, $dec_place, value);
	}
	
	/**
	 * 小数部有効桁数. Number of decimal places.<p>
	 *
	 */
	public void dec_place(int value) {
		setConstNumber(offset + 24, $dec_place, value);
	}
	
	/**
	 * 小数部有効桁数. Number of decimal places.<p>
	 *
	 */
	public void dec_place(long value) {
		setConstNumber(offset + 24, $dec_place, value);
	}
	
	/**
	 * 小数部有効桁数. Number of decimal places.<p>
	 *
	 */
	public void dec_place(float value) {
		setConstNumber(offset + 24, $dec_place, value);
	}
	
	/**
	 * 小数部有効桁数. Number of decimal places.<p>
	 *
	 */
	public void dec_place(double value) {
		setConstNumber(offset + 24, $dec_place, value);
	}
	
	/**
	 * 端数処理区分. Rounding type.<p>
	 *
	 */
	public String rnd_typ() {
		return getConstString(offset + 25, $rnd_typ);
	}

	/**
	 * 端数処理区分. Rounding type.<p>
	 *
	 */
	public void rnd_typ(String value) {
		setConstString(offset + 25, $rnd_typ, value);
	}

	/**
	 * 容積単位ＣＤ. Volume unit cd..<p>
	 *
	 */
	public String dim_unit_cd() {
		return getConstString(offset + 26, $dim_unit_cd);
	}

	/**
	 * 容積単位ＣＤ. Volume unit cd..<p>
	 *
	 */
	public void dim_unit_cd(String value) {
		setConstString(offset + 26, $dim_unit_cd, value);
	}

	/**
	 * 容積. Volume.<p>
	 *
	 */
	public MCNumber dim() {
		return getConstNumber(offset + 27, $dim);
	}

	/**
	 * 容積. Volume.<p>
	 *
	 */
	public void dim(MCNumber value) {
		setConstNumber(offset + 27, $dim, value);
	}
	
	/**
	 * 容積. Volume.<p>
	 *
	 */
	public void dim(int value) {
		setConstNumber(offset + 27, $dim, value);
	}
	
	/**
	 * 容積. Volume.<p>
	 *
	 */
	public void dim(long value) {
		setConstNumber(offset + 27, $dim, value);
	}
	
	/**
	 * 容積. Volume.<p>
	 *
	 */
	public void dim(float value) {
		setConstNumber(offset + 27, $dim, value);
	}
	
	/**
	 * 容積. Volume.<p>
	 *
	 */
	public void dim(double value) {
		setConstNumber(offset + 27, $dim, value);
	}
	
	/**
	 * 重量単位ＣＤ. Weight unit cd..<p>
	 *
	 */
	public String wt_unit_cd() {
		return getConstString(offset + 28, $wt_unit_cd);
	}

	/**
	 * 重量単位ＣＤ. Weight unit cd..<p>
	 *
	 */
	public void wt_unit_cd(String value) {
		setConstString(offset + 28, $wt_unit_cd, value);
	}

	/**
	 * 重量. Weight.<p>
	 *
	 */
	public MCNumber wt() {
		return getConstNumber(offset + 29, $wt);
	}

	/**
	 * 重量. Weight.<p>
	 *
	 */
	public void wt(MCNumber value) {
		setConstNumber(offset + 29, $wt, value);
	}
	
	/**
	 * 重量. Weight.<p>
	 *
	 */
	public void wt(int value) {
		setConstNumber(offset + 29, $wt, value);
	}
	
	/**
	 * 重量. Weight.<p>
	 *
	 */
	public void wt(long value) {
		setConstNumber(offset + 29, $wt, value);
	}
	
	/**
	 * 重量. Weight.<p>
	 *
	 */
	public void wt(float value) {
		setConstNumber(offset + 29, $wt, value);
	}
	
	/**
	 * 重量. Weight.<p>
	 *
	 */
	public void wt(double value) {
		setConstNumber(offset + 29, $wt, value);
	}
	
	/**
	 * 入り目単位ＣＤ. Conversion unit cd..<p>
	 *
	 */
	public String conts_unit_cd() {
		return getConstString(offset + 30, $conts_unit_cd);
	}

	/**
	 * 入り目単位ＣＤ. Conversion unit cd..<p>
	 *
	 */
	public void conts_unit_cd(String value) {
		setConstString(offset + 30, $conts_unit_cd, value);
	}

	/**
	 * 入り目数. Conversion qty..<p>
	 *
	 */
	public MCNumber conts_qty() {
		return getConstNumber(offset + 31, $conts_qty);
	}

	/**
	 * 入り目数. Conversion qty..<p>
	 *
	 */
	public void conts_qty(MCNumber value) {
		setConstNumber(offset + 31, $conts_qty, value);
	}
	
	/**
	 * 入り目数. Conversion qty..<p>
	 *
	 */
	public void conts_qty(int value) {
		setConstNumber(offset + 31, $conts_qty, value);
	}
	
	/**
	 * 入り目数. Conversion qty..<p>
	 *
	 */
	public void conts_qty(long value) {
		setConstNumber(offset + 31, $conts_qty, value);
	}
	
	/**
	 * 入り目数. Conversion qty..<p>
	 *
	 */
	public void conts_qty(float value) {
		setConstNumber(offset + 31, $conts_qty, value);
	}
	
	/**
	 * 入り目数. Conversion qty..<p>
	 *
	 */
	public void conts_qty(double value) {
		setConstNumber(offset + 31, $conts_qty, value);
	}
	
	/**
	 * 単位容積（ｍ３）. Unit volume (m3).<p>
	 *
	 */
	public MCNumber unit_dim() {
		return getConstNumber(offset + 32, $unit_dim);
	}

	/**
	 * 単位容積（ｍ３）. Unit volume (m3).<p>
	 *
	 */
	public void unit_dim(MCNumber value) {
		setConstNumber(offset + 32, $unit_dim, value);
	}
	
	/**
	 * 単位容積（ｍ３）. Unit volume (m3).<p>
	 *
	 */
	public void unit_dim(int value) {
		setConstNumber(offset + 32, $unit_dim, value);
	}
	
	/**
	 * 単位容積（ｍ３）. Unit volume (m3).<p>
	 *
	 */
	public void unit_dim(long value) {
		setConstNumber(offset + 32, $unit_dim, value);
	}
	
	/**
	 * 単位容積（ｍ３）. Unit volume (m3).<p>
	 *
	 */
	public void unit_dim(float value) {
		setConstNumber(offset + 32, $unit_dim, value);
	}
	
	/**
	 * 単位容積（ｍ３）. Unit volume (m3).<p>
	 *
	 */
	public void unit_dim(double value) {
		setConstNumber(offset + 32, $unit_dim, value);
	}
	
	/**
	 * 単位重量（ＫＧ）. Unit weight (KG).<p>
	 *
	 */
	public MCNumber unit_wt() {
		return getConstNumber(offset + 33, $unit_wt);
	}

	/**
	 * 単位重量（ＫＧ）. Unit weight (KG).<p>
	 *
	 */
	public void unit_wt(MCNumber value) {
		setConstNumber(offset + 33, $unit_wt, value);
	}
	
	/**
	 * 単位重量（ＫＧ）. Unit weight (KG).<p>
	 *
	 */
	public void unit_wt(int value) {
		setConstNumber(offset + 33, $unit_wt, value);
	}
	
	/**
	 * 単位重量（ＫＧ）. Unit weight (KG).<p>
	 *
	 */
	public void unit_wt(long value) {
		setConstNumber(offset + 33, $unit_wt, value);
	}
	
	/**
	 * 単位重量（ＫＧ）. Unit weight (KG).<p>
	 *
	 */
	public void unit_wt(float value) {
		setConstNumber(offset + 33, $unit_wt, value);
	}
	
	/**
	 * 単位重量（ＫＧ）. Unit weight (KG).<p>
	 *
	 */
	public void unit_wt(double value) {
		setConstNumber(offset + 33, $unit_wt, value);
	}
	
	/**
	 * ＨＳ ＣＤ. HS cd..<p>
	 *
	 */
	public String hs_cd() {
		return getConstString(offset + 34, $hs_cd);
	}

	/**
	 * ＨＳ ＣＤ. HS cd..<p>
	 *
	 */
	public void hs_cd(String value) {
		setConstString(offset + 34, $hs_cd, value);
	}

	/**
	 * ＪＡＮ区分. JAN type.<p>
	 *
	 */
	public String jan_typ() {
		return getConstString(offset + 35, $jan_typ);
	}

	/**
	 * ＪＡＮ区分. JAN type.<p>
	 *
	 */
	public void jan_typ(String value) {
		setConstString(offset + 35, $jan_typ, value);
	}

	/**
	 * ＪＡＮ ＣＤ. JAN cd..<p>
	 *
	 */
	public String jan_cd() {
		return getConstString(offset + 36, $jan_cd);
	}

	/**
	 * ＪＡＮ ＣＤ. JAN cd..<p>
	 *
	 */
	public void jan_cd(String value) {
		setConstString(offset + 36, $jan_cd, value);
	}

	/**
	 * ＩＴＦ ＣＤ. ITF cd..<p>
	 *
	 */
	public String itf_cd() {
		return getConstString(offset + 37, $itf_cd);
	}

	/**
	 * ＩＴＦ ＣＤ. ITF cd..<p>
	 *
	 */
	public void itf_cd(String value) {
		setConstString(offset + 37, $itf_cd, value);
	}

	/**
	 * ＧＴＩＮ ＣＤ. GTIN cd..<p>
	 *
	 */
	public String gtin_cd() {
		return getConstString(offset + 38, $gtin_cd);
	}

	/**
	 * ＧＴＩＮ ＣＤ. GTIN cd..<p>
	 *
	 */
	public void gtin_cd(String value) {
		setConstString(offset + 38, $gtin_cd, value);
	}

	/**
	 * サムネイル画像. Thumbnail image.<p>
	 *
	 */
	public MCBinary th_image() {
		return getConstBinary(offset + 39, $th_image);
	}

	/**
	 * サムネイル画像. Thumbnail image.<p>
	 *
	 */
	public void th_image(MCBinary value) {
		setConstBinary(offset + 39, $th_image, value);
	}

	/**
	 * 販売品目体系ＣＤ. Sales item system cd..<p>
	 *
	 */
	public String sls_itm_grp_cd() {
		return getConstString(offset + 40, $sls_itm_grp_cd);
	}

	/**
	 * 販売品目体系ＣＤ. Sales item system cd..<p>
	 *
	 */
	public void sls_itm_grp_cd(String value) {
		setConstString(offset + 40, $sls_itm_grp_cd, value);
	}

	/**
	 * メモ１. Memo 1.<p>
	 *
	 */
	public String memo1() {
		return getConstString(offset + 41, $memo1);
	}

	/**
	 * メモ１. Memo 1.<p>
	 *
	 */
	public void memo1(String value) {
		setConstString(offset + 41, $memo1, value);
	}

	/**
	 * メモ２. Memo 2.<p>
	 *
	 */
	public String memo2() {
		return getConstString(offset + 42, $memo2);
	}

	/**
	 * メモ２. Memo 2.<p>
	 *
	 */
	public void memo2(String value) {
		setConstString(offset + 42, $memo2, value);
	}

	/**
	 * メモ３. Memo 3.<p>
	 *
	 */
	public String memo3() {
		return getConstString(offset + 43, $memo3);
	}

	/**
	 * メモ３. Memo 3.<p>
	 *
	 */
	public void memo3(String value) {
		setConstString(offset + 43, $memo3, value);
	}

	/**
	 * 論理削除ＦＬＧ. Logical delete flg..<p>
	 *
	 */
	public boolean del_flg() {
		return getConstBoolean(offset + 44, $del_flg);
	}

	/**
	 * 論理削除ＦＬＧ. Logical delete flg..<p>
	 *
	 */
	public void del_flg(boolean value) {
		setConstBoolean(offset + 44, $del_flg, value);
	}

	/**
	 * 論理削除ユーザＩＤ. Logical delete user ID.<p>
	 *
	 */
	public String del_usr_id() {
		return getConstString(offset + 45, $del_usr_id);
	}

	/**
	 * 論理削除ユーザＩＤ. Logical delete user ID.<p>
	 *
	 */
	public void del_usr_id(String value) {
		setConstString(offset + 45, $del_usr_id, value);
	}

	/**
	 * 論理削除ユーザ名. Logical delete user name.<p>
	 *
	 */
	public String del_usr_nm() {
		return getConstString(offset + 46, $del_usr_nm);
	}

	/**
	 * 論理削除ユーザ名. Logical delete user name.<p>
	 *
	 */
	public void del_usr_nm(String value) {
		setConstString(offset + 46, $del_usr_nm, value);
	}

	/**
	 * 論理削除日時. Logical delete date and time.<p>
	 *
	 */
	public MCTimestamp del_ts() {
		return getConstTimestamp(offset + 47, $del_ts);
	}

	/**
	 * 論理削除日時. Logical delete date and time.<p>
	 *
	 */
	public void del_ts(MCTimestamp value) {
		setConstTimestamp(offset + 47, $del_ts, value);
	}

	/**
	 * 登録ユーザＩＤ. Entry user ID.<p>
	 *
	 */
	public String ins_usr_id() {
		return getConstString(offset + 48, $ins_usr_id);
	}

	/**
	 * 登録ユーザＩＤ. Entry user ID.<p>
	 *
	 */
	public void ins_usr_id(String value) {
		setConstString(offset + 48, $ins_usr_id, value);
	}

	/**
	 * 登録ユーザ名. Entry user name.<p>
	 *
	 */
	public String ins_usr_nm() {
		return getConstString(offset + 49, $ins_usr_nm);
	}

	/**
	 * 登録ユーザ名. Entry user name.<p>
	 *
	 */
	public void ins_usr_nm(String value) {
		setConstString(offset + 49, $ins_usr_nm, value);
	}

	/**
	 * 登録日時. Entry date and time.<p>
	 *
	 */
	public MCTimestamp ins_ts() {
		return getConstTimestamp(offset + 50, $ins_ts);
	}

	/**
	 * 登録日時. Entry date and time.<p>
	 *
	 */
	public void ins_ts(MCTimestamp value) {
		setConstTimestamp(offset + 50, $ins_ts, value);
	}

	/**
	 * 登録機能ＩＤ. Entry function ID.<p>
	 *
	 */
	public String ins_func_id() {
		return getConstString(offset + 51, $ins_func_id);
	}

	/**
	 * 登録機能ＩＤ. Entry function ID.<p>
	 *
	 */
	public void ins_func_id(String value) {
		setConstString(offset + 51, $ins_func_id, value);
	}

	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public MCNumber upd_cntr() {
		return getConstNumber(offset + 52, $upd_cntr);
	}

	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(MCNumber value) {
		setConstNumber(offset + 52, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(int value) {
		setConstNumber(offset + 52, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(long value) {
		setConstNumber(offset + 52, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(float value) {
		setConstNumber(offset + 52, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(double value) {
		setConstNumber(offset + 52, $upd_cntr, value);
	}
	
	/**
	 * 更新ユーザＩＤ. Update user ID.<p>
	 *
	 */
	public String upd_usr_id() {
		return getConstString(offset + 53, $upd_usr_id);
	}

	/**
	 * 更新ユーザＩＤ. Update user ID.<p>
	 *
	 */
	public void upd_usr_id(String value) {
		setConstString(offset + 53, $upd_usr_id, value);
	}

	/**
	 * 更新ユーザ名. Update user name.<p>
	 *
	 */
	public String upd_usr_nm() {
		return getConstString(offset + 54, $upd_usr_nm);
	}

	/**
	 * 更新ユーザ名. Update user name.<p>
	 *
	 */
	public void upd_usr_nm(String value) {
		setConstString(offset + 54, $upd_usr_nm, value);
	}

	/**
	 * 更新日時. Update date and time.<p>
	 *
	 */
	public MCTimestamp upd_ts() {
		return getConstTimestamp(offset + 55, $upd_ts);
	}

	/**
	 * 更新日時. Update date and time.<p>
	 *
	 */
	public void upd_ts(MCTimestamp value) {
		setConstTimestamp(offset + 55, $upd_ts, value);
	}

	/**
	 * 更新機能ＩＤ. Update function ID.<p>
	 *
	 */
	public String upd_func_id() {
		return getConstString(offset + 56, $upd_func_id);
	}

	/**
	 * 更新機能ＩＤ. Update function ID.<p>
	 *
	 */
	public void upd_func_id(String value) {
		setConstString(offset + 56, $upd_func_id, value);
	}

	/**
	 * 更新リクエストＮＯ. Update request No..<p>
	 *
	 */
	public String upd_srv_req_no() {
		return getConstString(offset + 57, $upd_srv_req_no);
	}

	/**
	 * 更新リクエストＮＯ. Update request No..<p>
	 *
	 */
	public void upd_srv_req_no(String value) {
		setConstString(offset + 57, $upd_srv_req_no, value);
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
		if ($itm_nm.equalsIgnoreCase(name)) {
			return itm_nm();
		}
		if ($itm_alt_nm1.equalsIgnoreCase(name)) {
			return itm_alt_nm1();
		}
		if ($itm_alt_nm2.equalsIgnoreCase(name)) {
			return itm_alt_nm2();
		}
		if ($itm_alt_nm3.equalsIgnoreCase(name)) {
			return itm_alt_nm3();
		}
		if ($itm_alt_nm4.equalsIgnoreCase(name)) {
			return itm_alt_nm4();
		}
		if ($itm_grp_cd1.equalsIgnoreCase(name)) {
			return itm_grp_cd1();
		}
		if ($itm_grp_cd2.equalsIgnoreCase(name)) {
			return itm_grp_cd2();
		}
		if ($itm_grp_cd3.equalsIgnoreCase(name)) {
			return itm_grp_cd3();
		}
		if ($itm_grp_cd4.equalsIgnoreCase(name)) {
			return itm_grp_cd4();
		}
		if ($itm_grp_cd5.equalsIgnoreCase(name)) {
			return itm_grp_cd5();
		}
		if ($itm_grp_cd6.equalsIgnoreCase(name)) {
			return itm_grp_cd6();
		}
		if ($itm_grp_cd7.equalsIgnoreCase(name)) {
			return itm_grp_cd7();
		}
		if ($itm_grp_cd8.equalsIgnoreCase(name)) {
			return itm_grp_cd8();
		}
		if ($itm_grp_cd9.equalsIgnoreCase(name)) {
			return itm_grp_cd9();
		}
		if ($itm_grp_cd10.equalsIgnoreCase(name)) {
			return itm_grp_cd10();
		}
		if ($stk_mng_typ.equalsIgnoreCase(name)) {
			return stk_mng_typ();
		}
		if ($asset_mng_typ.equalsIgnoreCase(name)) {
			return asset_mng_typ();
		}
		if ($unit_cd.equalsIgnoreCase(name)) {
			return unit_cd();
		}
		if ($rnd_typ.equalsIgnoreCase(name)) {
			return rnd_typ();
		}
		if ($dim_unit_cd.equalsIgnoreCase(name)) {
			return dim_unit_cd();
		}
		if ($wt_unit_cd.equalsIgnoreCase(name)) {
			return wt_unit_cd();
		}
		if ($conts_unit_cd.equalsIgnoreCase(name)) {
			return conts_unit_cd();
		}
		if ($hs_cd.equalsIgnoreCase(name)) {
			return hs_cd();
		}
		if ($jan_typ.equalsIgnoreCase(name)) {
			return jan_typ();
		}
		if ($jan_cd.equalsIgnoreCase(name)) {
			return jan_cd();
		}
		if ($itf_cd.equalsIgnoreCase(name)) {
			return itf_cd();
		}
		if ($gtin_cd.equalsIgnoreCase(name)) {
			return gtin_cd();
		}
		if ($sls_itm_grp_cd.equalsIgnoreCase(name)) {
			return sls_itm_grp_cd();
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
		return super.getString(name);
	}

	public MCNumber getNumber(String name) {
		if ($dec_place.equalsIgnoreCase(name)) {
			return dec_place();
		}
		if ($dim.equalsIgnoreCase(name)) {
			return dim();
		}
		if ($wt.equalsIgnoreCase(name)) {
			return wt();
		}
		if ($conts_qty.equalsIgnoreCase(name)) {
			return conts_qty();
		}
		if ($unit_dim.equalsIgnoreCase(name)) {
			return unit_dim();
		}
		if ($unit_wt.equalsIgnoreCase(name)) {
			return unit_wt();
		}
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
		if ($sundry_itm_flg.equalsIgnoreCase(name)) {
			return sundry_itm_flg();
		}
		if ($dscnt_itm_flg.equalsIgnoreCase(name)) {
			return dscnt_itm_flg();
		}
		if ($del_flg.equalsIgnoreCase(name)) {
			return del_flg();
		}
		return super.getBoolean(name);
	}

	public MCBinary getBinary(String name) {
		if ($th_image.equalsIgnoreCase(name)) {
			return th_image();
		}
		return super.getBinary(name);
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
		if ($itm_nm.equalsIgnoreCase(name)) {
			return itm_nm();
		}
		if ($itm_alt_nm1.equalsIgnoreCase(name)) {
			return itm_alt_nm1();
		}
		if ($itm_alt_nm2.equalsIgnoreCase(name)) {
			return itm_alt_nm2();
		}
		if ($itm_alt_nm3.equalsIgnoreCase(name)) {
			return itm_alt_nm3();
		}
		if ($itm_alt_nm4.equalsIgnoreCase(name)) {
			return itm_alt_nm4();
		}
		if ($itm_grp_cd1.equalsIgnoreCase(name)) {
			return itm_grp_cd1();
		}
		if ($itm_grp_cd2.equalsIgnoreCase(name)) {
			return itm_grp_cd2();
		}
		if ($itm_grp_cd3.equalsIgnoreCase(name)) {
			return itm_grp_cd3();
		}
		if ($itm_grp_cd4.equalsIgnoreCase(name)) {
			return itm_grp_cd4();
		}
		if ($itm_grp_cd5.equalsIgnoreCase(name)) {
			return itm_grp_cd5();
		}
		if ($itm_grp_cd6.equalsIgnoreCase(name)) {
			return itm_grp_cd6();
		}
		if ($itm_grp_cd7.equalsIgnoreCase(name)) {
			return itm_grp_cd7();
		}
		if ($itm_grp_cd8.equalsIgnoreCase(name)) {
			return itm_grp_cd8();
		}
		if ($itm_grp_cd9.equalsIgnoreCase(name)) {
			return itm_grp_cd9();
		}
		if ($itm_grp_cd10.equalsIgnoreCase(name)) {
			return itm_grp_cd10();
		}
		if ($stk_mng_typ.equalsIgnoreCase(name)) {
			return stk_mng_typ();
		}
		if ($asset_mng_typ.equalsIgnoreCase(name)) {
			return asset_mng_typ();
		}
		if ($unit_cd.equalsIgnoreCase(name)) {
			return unit_cd();
		}
		if ($rnd_typ.equalsIgnoreCase(name)) {
			return rnd_typ();
		}
		if ($dim_unit_cd.equalsIgnoreCase(name)) {
			return dim_unit_cd();
		}
		if ($wt_unit_cd.equalsIgnoreCase(name)) {
			return wt_unit_cd();
		}
		if ($conts_unit_cd.equalsIgnoreCase(name)) {
			return conts_unit_cd();
		}
		if ($hs_cd.equalsIgnoreCase(name)) {
			return hs_cd();
		}
		if ($jan_typ.equalsIgnoreCase(name)) {
			return jan_typ();
		}
		if ($jan_cd.equalsIgnoreCase(name)) {
			return jan_cd();
		}
		if ($itf_cd.equalsIgnoreCase(name)) {
			return itf_cd();
		}
		if ($gtin_cd.equalsIgnoreCase(name)) {
			return gtin_cd();
		}
		if ($sls_itm_grp_cd.equalsIgnoreCase(name)) {
			return sls_itm_grp_cd();
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
		return super.getStringNE(name);
	}

	public MCNumber getNumberNE(String name) {
		if ($dec_place.equalsIgnoreCase(name)) {
			return dec_place();
		}
		if ($dim.equalsIgnoreCase(name)) {
			return dim();
		}
		if ($wt.equalsIgnoreCase(name)) {
			return wt();
		}
		if ($conts_qty.equalsIgnoreCase(name)) {
			return conts_qty();
		}
		if ($unit_dim.equalsIgnoreCase(name)) {
			return unit_dim();
		}
		if ($unit_wt.equalsIgnoreCase(name)) {
			return unit_wt();
		}
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
		if ($sundry_itm_flg.equalsIgnoreCase(name)) {
			return sundry_itm_flg();
		}
		if ($dscnt_itm_flg.equalsIgnoreCase(name)) {
			return dscnt_itm_flg();
		}
		if ($del_flg.equalsIgnoreCase(name)) {
			return del_flg();
		}
		return super.getBooleanNE(name);
	}

	public MCBinary getBinaryNE(String name) {
		if ($th_image.equalsIgnoreCase(name)) {
			return th_image();
		}
		return super.getBinaryNE(name);
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
		if ($itm_nm.equalsIgnoreCase(name)) {
			itm_nm(value);
			return;
		}
		if ($itm_alt_nm1.equalsIgnoreCase(name)) {
			itm_alt_nm1(value);
			return;
		}
		if ($itm_alt_nm2.equalsIgnoreCase(name)) {
			itm_alt_nm2(value);
			return;
		}
		if ($itm_alt_nm3.equalsIgnoreCase(name)) {
			itm_alt_nm3(value);
			return;
		}
		if ($itm_alt_nm4.equalsIgnoreCase(name)) {
			itm_alt_nm4(value);
			return;
		}
		if ($itm_grp_cd1.equalsIgnoreCase(name)) {
			itm_grp_cd1(value);
			return;
		}
		if ($itm_grp_cd2.equalsIgnoreCase(name)) {
			itm_grp_cd2(value);
			return;
		}
		if ($itm_grp_cd3.equalsIgnoreCase(name)) {
			itm_grp_cd3(value);
			return;
		}
		if ($itm_grp_cd4.equalsIgnoreCase(name)) {
			itm_grp_cd4(value);
			return;
		}
		if ($itm_grp_cd5.equalsIgnoreCase(name)) {
			itm_grp_cd5(value);
			return;
		}
		if ($itm_grp_cd6.equalsIgnoreCase(name)) {
			itm_grp_cd6(value);
			return;
		}
		if ($itm_grp_cd7.equalsIgnoreCase(name)) {
			itm_grp_cd7(value);
			return;
		}
		if ($itm_grp_cd8.equalsIgnoreCase(name)) {
			itm_grp_cd8(value);
			return;
		}
		if ($itm_grp_cd9.equalsIgnoreCase(name)) {
			itm_grp_cd9(value);
			return;
		}
		if ($itm_grp_cd10.equalsIgnoreCase(name)) {
			itm_grp_cd10(value);
			return;
		}
		if ($stk_mng_typ.equalsIgnoreCase(name)) {
			stk_mng_typ(value);
			return;
		}
		if ($asset_mng_typ.equalsIgnoreCase(name)) {
			asset_mng_typ(value);
			return;
		}
		if ($unit_cd.equalsIgnoreCase(name)) {
			unit_cd(value);
			return;
		}
		if ($rnd_typ.equalsIgnoreCase(name)) {
			rnd_typ(value);
			return;
		}
		if ($dim_unit_cd.equalsIgnoreCase(name)) {
			dim_unit_cd(value);
			return;
		}
		if ($wt_unit_cd.equalsIgnoreCase(name)) {
			wt_unit_cd(value);
			return;
		}
		if ($conts_unit_cd.equalsIgnoreCase(name)) {
			conts_unit_cd(value);
			return;
		}
		if ($hs_cd.equalsIgnoreCase(name)) {
			hs_cd(value);
			return;
		}
		if ($jan_typ.equalsIgnoreCase(name)) {
			jan_typ(value);
			return;
		}
		if ($jan_cd.equalsIgnoreCase(name)) {
			jan_cd(value);
			return;
		}
		if ($itf_cd.equalsIgnoreCase(name)) {
			itf_cd(value);
			return;
		}
		if ($gtin_cd.equalsIgnoreCase(name)) {
			gtin_cd(value);
			return;
		}
		if ($sls_itm_grp_cd.equalsIgnoreCase(name)) {
			sls_itm_grp_cd(value);
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
		super.setString(name, value);
	}

	public void setNumber(String name, MCNumber value) {
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($dim.equalsIgnoreCase(name)) {
			dim(value);
			return;
		}
		if ($wt.equalsIgnoreCase(name)) {
			wt(value);
			return;
		}
		if ($conts_qty.equalsIgnoreCase(name)) {
			conts_qty(value);
			return;
		}
		if ($unit_dim.equalsIgnoreCase(name)) {
			unit_dim(value);
			return;
		}
		if ($unit_wt.equalsIgnoreCase(name)) {
			unit_wt(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, int value) {
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($dim.equalsIgnoreCase(name)) {
			dim(value);
			return;
		}
		if ($wt.equalsIgnoreCase(name)) {
			wt(value);
			return;
		}
		if ($conts_qty.equalsIgnoreCase(name)) {
			conts_qty(value);
			return;
		}
		if ($unit_dim.equalsIgnoreCase(name)) {
			unit_dim(value);
			return;
		}
		if ($unit_wt.equalsIgnoreCase(name)) {
			unit_wt(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, long value) {
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($dim.equalsIgnoreCase(name)) {
			dim(value);
			return;
		}
		if ($wt.equalsIgnoreCase(name)) {
			wt(value);
			return;
		}
		if ($conts_qty.equalsIgnoreCase(name)) {
			conts_qty(value);
			return;
		}
		if ($unit_dim.equalsIgnoreCase(name)) {
			unit_dim(value);
			return;
		}
		if ($unit_wt.equalsIgnoreCase(name)) {
			unit_wt(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, float value) {
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($dim.equalsIgnoreCase(name)) {
			dim(value);
			return;
		}
		if ($wt.equalsIgnoreCase(name)) {
			wt(value);
			return;
		}
		if ($conts_qty.equalsIgnoreCase(name)) {
			conts_qty(value);
			return;
		}
		if ($unit_dim.equalsIgnoreCase(name)) {
			unit_dim(value);
			return;
		}
		if ($unit_wt.equalsIgnoreCase(name)) {
			unit_wt(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, double value) {
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($dim.equalsIgnoreCase(name)) {
			dim(value);
			return;
		}
		if ($wt.equalsIgnoreCase(name)) {
			wt(value);
			return;
		}
		if ($conts_qty.equalsIgnoreCase(name)) {
			conts_qty(value);
			return;
		}
		if ($unit_dim.equalsIgnoreCase(name)) {
			unit_dim(value);
			return;
		}
		if ($unit_wt.equalsIgnoreCase(name)) {
			unit_wt(value);
			return;
		}
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
		if ($sundry_itm_flg.equalsIgnoreCase(name)) {
			sundry_itm_flg(value);
			return;
		}
		if ($dscnt_itm_flg.equalsIgnoreCase(name)) {
			dscnt_itm_flg(value);
			return;
		}
		if ($del_flg.equalsIgnoreCase(name)) {
			del_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setBinary(String name, MCBinary value) {
		if ($th_image.equalsIgnoreCase(name)) {
			th_image(value);
			return;
		}
		super.setBinary(name, value);
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
		if ($itm_nm.equalsIgnoreCase(name)) {
			itm_nm(value);
			return;
		}
		if ($itm_alt_nm1.equalsIgnoreCase(name)) {
			itm_alt_nm1(value);
			return;
		}
		if ($itm_alt_nm2.equalsIgnoreCase(name)) {
			itm_alt_nm2(value);
			return;
		}
		if ($itm_alt_nm3.equalsIgnoreCase(name)) {
			itm_alt_nm3(value);
			return;
		}
		if ($itm_alt_nm4.equalsIgnoreCase(name)) {
			itm_alt_nm4(value);
			return;
		}
		if ($itm_grp_cd1.equalsIgnoreCase(name)) {
			itm_grp_cd1(value);
			return;
		}
		if ($itm_grp_cd2.equalsIgnoreCase(name)) {
			itm_grp_cd2(value);
			return;
		}
		if ($itm_grp_cd3.equalsIgnoreCase(name)) {
			itm_grp_cd3(value);
			return;
		}
		if ($itm_grp_cd4.equalsIgnoreCase(name)) {
			itm_grp_cd4(value);
			return;
		}
		if ($itm_grp_cd5.equalsIgnoreCase(name)) {
			itm_grp_cd5(value);
			return;
		}
		if ($itm_grp_cd6.equalsIgnoreCase(name)) {
			itm_grp_cd6(value);
			return;
		}
		if ($itm_grp_cd7.equalsIgnoreCase(name)) {
			itm_grp_cd7(value);
			return;
		}
		if ($itm_grp_cd8.equalsIgnoreCase(name)) {
			itm_grp_cd8(value);
			return;
		}
		if ($itm_grp_cd9.equalsIgnoreCase(name)) {
			itm_grp_cd9(value);
			return;
		}
		if ($itm_grp_cd10.equalsIgnoreCase(name)) {
			itm_grp_cd10(value);
			return;
		}
		if ($stk_mng_typ.equalsIgnoreCase(name)) {
			stk_mng_typ(value);
			return;
		}
		if ($asset_mng_typ.equalsIgnoreCase(name)) {
			asset_mng_typ(value);
			return;
		}
		if ($unit_cd.equalsIgnoreCase(name)) {
			unit_cd(value);
			return;
		}
		if ($rnd_typ.equalsIgnoreCase(name)) {
			rnd_typ(value);
			return;
		}
		if ($dim_unit_cd.equalsIgnoreCase(name)) {
			dim_unit_cd(value);
			return;
		}
		if ($wt_unit_cd.equalsIgnoreCase(name)) {
			wt_unit_cd(value);
			return;
		}
		if ($conts_unit_cd.equalsIgnoreCase(name)) {
			conts_unit_cd(value);
			return;
		}
		if ($hs_cd.equalsIgnoreCase(name)) {
			hs_cd(value);
			return;
		}
		if ($jan_typ.equalsIgnoreCase(name)) {
			jan_typ(value);
			return;
		}
		if ($jan_cd.equalsIgnoreCase(name)) {
			jan_cd(value);
			return;
		}
		if ($itf_cd.equalsIgnoreCase(name)) {
			itf_cd(value);
			return;
		}
		if ($gtin_cd.equalsIgnoreCase(name)) {
			gtin_cd(value);
			return;
		}
		if ($sls_itm_grp_cd.equalsIgnoreCase(name)) {
			sls_itm_grp_cd(value);
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
		super.setStringNE(name, value);
	}

	public void setNumberNE(String name, MCNumber value) {
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($dim.equalsIgnoreCase(name)) {
			dim(value);
			return;
		}
		if ($wt.equalsIgnoreCase(name)) {
			wt(value);
			return;
		}
		if ($conts_qty.equalsIgnoreCase(name)) {
			conts_qty(value);
			return;
		}
		if ($unit_dim.equalsIgnoreCase(name)) {
			unit_dim(value);
			return;
		}
		if ($unit_wt.equalsIgnoreCase(name)) {
			unit_wt(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, int value) {
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($dim.equalsIgnoreCase(name)) {
			dim(value);
			return;
		}
		if ($wt.equalsIgnoreCase(name)) {
			wt(value);
			return;
		}
		if ($conts_qty.equalsIgnoreCase(name)) {
			conts_qty(value);
			return;
		}
		if ($unit_dim.equalsIgnoreCase(name)) {
			unit_dim(value);
			return;
		}
		if ($unit_wt.equalsIgnoreCase(name)) {
			unit_wt(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, long value) {
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($dim.equalsIgnoreCase(name)) {
			dim(value);
			return;
		}
		if ($wt.equalsIgnoreCase(name)) {
			wt(value);
			return;
		}
		if ($conts_qty.equalsIgnoreCase(name)) {
			conts_qty(value);
			return;
		}
		if ($unit_dim.equalsIgnoreCase(name)) {
			unit_dim(value);
			return;
		}
		if ($unit_wt.equalsIgnoreCase(name)) {
			unit_wt(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, float value) {
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($dim.equalsIgnoreCase(name)) {
			dim(value);
			return;
		}
		if ($wt.equalsIgnoreCase(name)) {
			wt(value);
			return;
		}
		if ($conts_qty.equalsIgnoreCase(name)) {
			conts_qty(value);
			return;
		}
		if ($unit_dim.equalsIgnoreCase(name)) {
			unit_dim(value);
			return;
		}
		if ($unit_wt.equalsIgnoreCase(name)) {
			unit_wt(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, double value) {
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($dim.equalsIgnoreCase(name)) {
			dim(value);
			return;
		}
		if ($wt.equalsIgnoreCase(name)) {
			wt(value);
			return;
		}
		if ($conts_qty.equalsIgnoreCase(name)) {
			conts_qty(value);
			return;
		}
		if ($unit_dim.equalsIgnoreCase(name)) {
			unit_dim(value);
			return;
		}
		if ($unit_wt.equalsIgnoreCase(name)) {
			unit_wt(value);
			return;
		}
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
		if ($sundry_itm_flg.equalsIgnoreCase(name)) {
			sundry_itm_flg(value);
			return;
		}
		if ($dscnt_itm_flg.equalsIgnoreCase(name)) {
			dscnt_itm_flg(value);
			return;
		}
		if ($del_flg.equalsIgnoreCase(name)) {
			del_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}

	public void setBinaryNE(String name, MCBinary value) {
		if ($th_image.equalsIgnoreCase(name)) {
			th_image(value);
			return;
		}
		super.setBinaryNE(name, value);
	}

}
