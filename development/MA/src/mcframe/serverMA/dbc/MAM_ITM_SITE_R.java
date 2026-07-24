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
 * "品目マスタ（工場・物流倉庫） // Item master (Factory/Distribution warehouse)"DBコンテナRowクラスです。<p>
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
 *  	<td>K</td>
 *  	<td>site_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>工場・物流倉庫ＣＤ</td>
 *  	<td>Factory/Distribution warehouse cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>ntfy_nm</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>届出名</td>
 *  	<td>Notification name</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>plnt_aprv_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>工場出荷承認対象ＦＬＧ</td>
 *  	<td>For factory release approval flg.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>plnt_aprv_role_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>工場出荷承認役割ＣＤ</td>
 *  	<td>Factory release approval role cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>insp_aprv_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>検査承認対象ＦＬＧ</td>
 *  	<td>For inspection approval flg.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>insp_aprv_role_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>検査承認役割ＣＤ</td>
 *  	<td>Inspection approval role cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>mfg_aprv_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>製造承認対象ＦＬＧ</td>
 *  	<td>For mfg. approval flg.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>mfg_aprv_role_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>製造承認役割ＣＤ</td>
 *  	<td>Mfg. approval role cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>xfr_lot_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>移送入荷時ロットＮＯ振替ＦＬＧ</td>
 *  	<td>Lot No. transfer flg. at transport receipt</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>so_prmt_insp_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>検査中ロット出荷許可ＦＬＧ</td>
 *  	<td>Allow inspecting lot shipment flg.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>in_prmt_insp_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>検査中ロット使用許可ＦＬＧ</td>
 *  	<td>Allow inspecting lot use flg.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>num_id</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>発番ＩＤ</td>
 *  	<td>Numbering ID</td>
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
 *  	<td>itm_nm</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td>ITM1.ITM_NM</td>
 *  	<td>品名</td>
 *  	<td>Item name</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>site_nm</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td>SITE1.SITE_NM</td>
 *  	<td>工場・物流倉庫名</td>
 *  	<td>Factory/Distribution warehouse name</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>plnt_aprv_role_nm</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td>APRV_ROLE1.APRV_ROLE_NM</td>
 *  	<td>工場出荷承認役割名</td>
 *  	<td>Factory release approval role name</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>insp_aprv_role_nm</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td>APRV_ROLE2.APRV_ROLE_NM</td>
 *  	<td>検査承認役割名</td>
 *  	<td>Inspection approval role name</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>mfg_aprv_role_nm</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td>APRV_ROLE3.APRV_ROLE_NM</td>
 *  	<td>製造承認役割名</td>
 *  	<td>Mfg. approval role name</td>
 *  </tr>
 * </table>
 *
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
public class MAM_ITM_SITE_R extends MCDBContainer {

	public static final MCTableType TABLE_TYPE = MCTableType.CO_VIEW;

	public static final String TABLE_NAME = "MAM_ITM_SITE";

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
	 * 工場・物流倉庫ＣＤ. Factory/Distribution warehouse cd..<p>
	 *
	 */
	public static final String $site_cd = "site_cd";
	private static final MCPermColumnInfo _site_cd = createColumnInfo("site_cd");
	public final MCStringPermColumn site_cd = createStringColumn(_site_cd);
	
	/**
	 * 届出名. Notification name.<p>
	 *
	 */
	public static final String $ntfy_nm = "ntfy_nm";
	private static final MCPermColumnInfo _ntfy_nm = createColumnInfo("ntfy_nm");
	public final MCStringPermColumn ntfy_nm = createStringColumn(_ntfy_nm);
	
	/**
	 * 工場出荷承認対象ＦＬＧ. For factory release approval flg..<p>
	 *
	 */
	public static final String $plnt_aprv_flg = "plnt_aprv_flg";
	private static final MCPermColumnInfo _plnt_aprv_flg = createColumnInfo("plnt_aprv_flg");
	public final MCBooleanPermColumn plnt_aprv_flg = createBooleanColumn(_plnt_aprv_flg);
	
	/**
	 * 工場出荷承認役割ＣＤ. Factory release approval role cd..<p>
	 *
	 */
	public static final String $plnt_aprv_role_cd = "plnt_aprv_role_cd";
	private static final MCPermColumnInfo _plnt_aprv_role_cd = createColumnInfo("plnt_aprv_role_cd");
	public final MCStringPermColumn plnt_aprv_role_cd = createStringColumn(_plnt_aprv_role_cd);
	
	/**
	 * 検査承認対象ＦＬＧ. For inspection approval flg..<p>
	 *
	 */
	public static final String $insp_aprv_flg = "insp_aprv_flg";
	private static final MCPermColumnInfo _insp_aprv_flg = createColumnInfo("insp_aprv_flg");
	public final MCBooleanPermColumn insp_aprv_flg = createBooleanColumn(_insp_aprv_flg);
	
	/**
	 * 検査承認役割ＣＤ. Inspection approval role cd..<p>
	 *
	 */
	public static final String $insp_aprv_role_cd = "insp_aprv_role_cd";
	private static final MCPermColumnInfo _insp_aprv_role_cd = createColumnInfo("insp_aprv_role_cd");
	public final MCStringPermColumn insp_aprv_role_cd = createStringColumn(_insp_aprv_role_cd);
	
	/**
	 * 製造承認対象ＦＬＧ. For mfg. approval flg..<p>
	 *
	 */
	public static final String $mfg_aprv_flg = "mfg_aprv_flg";
	private static final MCPermColumnInfo _mfg_aprv_flg = createColumnInfo("mfg_aprv_flg");
	public final MCBooleanPermColumn mfg_aprv_flg = createBooleanColumn(_mfg_aprv_flg);
	
	/**
	 * 製造承認役割ＣＤ. Mfg. approval role cd..<p>
	 *
	 */
	public static final String $mfg_aprv_role_cd = "mfg_aprv_role_cd";
	private static final MCPermColumnInfo _mfg_aprv_role_cd = createColumnInfo("mfg_aprv_role_cd");
	public final MCStringPermColumn mfg_aprv_role_cd = createStringColumn(_mfg_aprv_role_cd);
	
	/**
	 * 移送入荷時ロットＮＯ振替ＦＬＧ. Lot No. transfer flg. at transport receipt.<p>
	 *
	 */
	public static final String $xfr_lot_flg = "xfr_lot_flg";
	private static final MCPermColumnInfo _xfr_lot_flg = createColumnInfo("xfr_lot_flg");
	public final MCBooleanPermColumn xfr_lot_flg = createBooleanColumn(_xfr_lot_flg);
	
	/**
	 * 検査中ロット出荷許可ＦＬＧ. Allow inspecting lot shipment flg..<p>
	 *
	 */
	public static final String $so_prmt_insp_flg = "so_prmt_insp_flg";
	private static final MCPermColumnInfo _so_prmt_insp_flg = createColumnInfo("so_prmt_insp_flg");
	public final MCBooleanPermColumn so_prmt_insp_flg = createBooleanColumn(_so_prmt_insp_flg);
	
	/**
	 * 検査中ロット使用許可ＦＬＧ. Allow inspecting lot use flg..<p>
	 *
	 */
	public static final String $in_prmt_insp_flg = "in_prmt_insp_flg";
	private static final MCPermColumnInfo _in_prmt_insp_flg = createColumnInfo("in_prmt_insp_flg");
	public final MCBooleanPermColumn in_prmt_insp_flg = createBooleanColumn(_in_prmt_insp_flg);
	
	/**
	 * 発番ＩＤ. Numbering ID.<p>
	 *
	 */
	public static final String $num_id = "num_id";
	private static final MCPermColumnInfo _num_id = createColumnInfo("num_id");
	public final MCStringPermColumn num_id = createStringColumn(_num_id);
	
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
	 * 品名. Item name.<p>
	 *
	 */
	public static final String $itm_nm = "itm_nm";
	
	/**
	 * 工場・物流倉庫名. Factory/Distribution warehouse name.<p>
	 *
	 */
	public static final String $site_nm = "site_nm";
	
	/**
	 * 工場出荷承認役割名. Factory release approval role name.<p>
	 *
	 */
	public static final String $plnt_aprv_role_nm = "plnt_aprv_role_nm";
	
	/**
	 * 検査承認役割名. Inspection approval role name.<p>
	 *
	 */
	public static final String $insp_aprv_role_nm = "insp_aprv_role_nm";
	
	/**
	 * 製造承認役割名. Mfg. approval role name.<p>
	 *
	 */
	public static final String $mfg_aprv_role_nm = "mfg_aprv_role_nm";
	
	public static final MCMeta itm_cd_META = createCommonMeta($itm_cd, mcframe.commonMA.meta.MA_META.ITM_CD);
	public static final MCMeta itm_sub1_META = createCommonMeta($itm_sub1, mcframe.commonMA.meta.MA_META.ITM_SUB1);
	public static final MCMeta itm_sub2_META = createCommonMeta($itm_sub2, mcframe.commonMA.meta.MA_META.ITM_SUB2);
	public static final MCMeta itm_sub3_META = createCommonMeta($itm_sub3, mcframe.commonMA.meta.MA_META.ITM_SUB3);
	public static final MCMeta site_cd_META = createCommonMeta($site_cd, mcframe.commonMA.meta.MA_META.SITE_CD);
	public static final MCMeta ntfy_nm_META = createCommonMeta($ntfy_nm, mcframe.commonMA.meta.MA_META.NTFY_NM);
	public static final MCMeta plnt_aprv_flg_META = createCommonMeta($plnt_aprv_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta plnt_aprv_role_cd_META = createCommonMeta($plnt_aprv_role_cd, mcframe.commonMA.meta.MA_META.APRV_ROLE_CD);
	public static final MCMeta insp_aprv_flg_META = createCommonMeta($insp_aprv_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta insp_aprv_role_cd_META = createCommonMeta($insp_aprv_role_cd, mcframe.commonMA.meta.MA_META.APRV_ROLE_CD);
	public static final MCMeta mfg_aprv_flg_META = createCommonMeta($mfg_aprv_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta mfg_aprv_role_cd_META = createCommonMeta($mfg_aprv_role_cd, mcframe.commonMA.meta.MA_META.APRV_ROLE_CD);
	public static final MCMeta xfr_lot_flg_META = createCommonMeta($xfr_lot_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta so_prmt_insp_flg_META = createCommonMeta($so_prmt_insp_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta in_prmt_insp_flg_META = createCommonMeta($in_prmt_insp_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta num_id_META = createCommonMeta($num_id, mcframe.commonMA.meta.MA_META.NUM_ID);
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
	public static final MCMeta itm_nm_META = createCommonMeta($itm_nm, mcframe.commonMA.meta.MA_META.ITM_NM);
	public static final MCMeta site_nm_META = createCommonMeta($site_nm, mcframe.commonMA.meta.MA_META.SITE_NM);
	public static final MCMeta plnt_aprv_role_nm_META = createCommonMeta($plnt_aprv_role_nm, mcframe.commonMA.meta.MA_META.APRV_ROLE_NM);
	public static final MCMeta insp_aprv_role_nm_META = createCommonMeta($insp_aprv_role_nm, mcframe.commonMA.meta.MA_META.APRV_ROLE_NM);
	public static final MCMeta mfg_aprv_role_nm_META = createCommonMeta($mfg_aprv_role_nm, mcframe.commonMA.meta.MA_META.APRV_ROLE_NM);

	protected static final List<MCForeignInfo> FOREIGN_INFO_LIST = new ArrayList<>();
	public static final String $SITE1 = "SITE1";
	public static final String $APRV_ROLE1 = "APRV_ROLE1";
	public static final String $APRV_ROLE2 = "APRV_ROLE2";
	public static final String $APRV_ROLE3 = "APRV_ROLE3";
	public static final String $ITM1 = "ITM1";
	static {
		FOREIGN_INFO_LIST.add(
			new MCForeignInfo(
				"MAM_SITE",
				$SITE1,
				new String[][]{
						{"site_cd", "site_cd"}
				},
				() -> {
					return mcframe.serverMA.dbc.MAM_SITE_R.create("SITE1");
				},
				(alias) -> {
					MAM_ITM_SITE_R own = MAM_ITM_SITE_R.create(alias);
					mcframe.serverMA.dbc.MAM_SITE_R ref = mcframe.serverMA.dbc.MAM_SITE_R.create("SITE1");
					MCPredicate cond = value(0).eq(value(0));
					cond = cond.and(own.site_cd.eq(ref.site_cd));
					return cond;
				}
			)
		);
		FOREIGN_INFO_LIST.add(
			new MCForeignInfo(
				"MAM_APRV_ROLE",
				$APRV_ROLE1,
				new String[][]{
						{"plnt_aprv_role_cd", "aprv_role_cd"}
				},
				() -> {
					return mcframe.serverMA.dbc.MAM_APRV_ROLE_R.create("APRV_ROLE1");
				},
				(alias) -> {
					MAM_ITM_SITE_R own = MAM_ITM_SITE_R.create(alias);
					mcframe.serverMA.dbc.MAM_APRV_ROLE_R ref = mcframe.serverMA.dbc.MAM_APRV_ROLE_R.create("APRV_ROLE1");
					MCPredicate cond = value(0).eq(value(0));
					cond = cond.and(own.plnt_aprv_role_cd.eq(ref.aprv_role_cd));
					return cond;
				}
			)
		);
		FOREIGN_INFO_LIST.add(
			new MCForeignInfo(
				"MAM_APRV_ROLE",
				$APRV_ROLE2,
				new String[][]{
						{"insp_aprv_role_cd", "aprv_role_cd"}
				},
				() -> {
					return mcframe.serverMA.dbc.MAM_APRV_ROLE_R.create("APRV_ROLE2");
				},
				(alias) -> {
					MAM_ITM_SITE_R own = MAM_ITM_SITE_R.create(alias);
					mcframe.serverMA.dbc.MAM_APRV_ROLE_R ref = mcframe.serverMA.dbc.MAM_APRV_ROLE_R.create("APRV_ROLE2");
					MCPredicate cond = value(0).eq(value(0));
					cond = cond.and(own.insp_aprv_role_cd.eq(ref.aprv_role_cd));
					return cond;
				}
			)
		);
		FOREIGN_INFO_LIST.add(
			new MCForeignInfo(
				"MAM_APRV_ROLE",
				$APRV_ROLE3,
				new String[][]{
						{"mfg_aprv_role_cd", "aprv_role_cd"}
				},
				() -> {
					return mcframe.serverMA.dbc.MAM_APRV_ROLE_R.create("APRV_ROLE3");
				},
				(alias) -> {
					MAM_ITM_SITE_R own = MAM_ITM_SITE_R.create(alias);
					mcframe.serverMA.dbc.MAM_APRV_ROLE_R ref = mcframe.serverMA.dbc.MAM_APRV_ROLE_R.create("APRV_ROLE3");
					MCPredicate cond = value(0).eq(value(0));
					cond = cond.and(own.mfg_aprv_role_cd.eq(ref.aprv_role_cd));
					return cond;
				}
			)
		);
		FOREIGN_INFO_LIST.add(
			new MCForeignInfo(
				"MAM_ITM_",
				$ITM1,
				new String[][]{
						{"itm_cd", "itm_cd"},
						{"itm_sub1", "itm_sub1"},
						{"itm_sub2", "itm_sub2"},
						{"itm_sub3", "itm_sub3"}
				},
				() -> {
					return mcframe.serverMA.dbc.MAM_ITM__R.create("ITM1");
				},
				(alias) -> {
					MAM_ITM_SITE_R own = MAM_ITM_SITE_R.create(alias);
					mcframe.serverMA.dbc.MAM_ITM__R ref = mcframe.serverMA.dbc.MAM_ITM__R.create("ITM1");
					MCPredicate cond = value(0).eq(value(0));
					cond = cond.and(own.itm_cd.eq(ref.itm_cd));
					cond = cond.and(own.itm_sub1.eq(ref.itm_sub1));
					cond = cond.and(own.itm_sub2.eq(ref.itm_sub2));
					cond = cond.and(own.itm_sub3.eq(ref.itm_sub3));
					return cond;
				}
			)
		);
	}
	
	protected static final ConstMetaList<MAM_ITM_SITE_R> constMetas = new ConstMetaList<MAM_ITM_SITE_R>(
		MCDBContainer.constMetas,
		new MCMeta[]{
			itm_cd_META,
			itm_sub1_META,
			itm_sub2_META,
			itm_sub3_META,
			site_cd_META,
			ntfy_nm_META,
			plnt_aprv_flg_META,
			plnt_aprv_role_cd_META,
			insp_aprv_flg_META,
			insp_aprv_role_cd_META,
			mfg_aprv_flg_META,
			mfg_aprv_role_cd_META,
			xfr_lot_flg_META,
			so_prmt_insp_flg_META,
			in_prmt_insp_flg_META,
			num_id_META,
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
			itm_nm_META,
			site_nm_META,
			plnt_aprv_role_nm_META,
			insp_aprv_role_nm_META,
			mfg_aprv_role_nm_META
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
	protected MAM_ITM_SITE_R(ConstMetaList<? extends MAM_ITM_SITE_R> metas, String alias) {
		super(metas, TABLE_TYPE, TABLE_NAME, alias, EX_CTRL, LCL_TABLE, FOREIGN_INFO_LIST);
		super.setColumnMap(getColumnMap());
	}

	protected MAM_ITM_SITE_R(ConstMetaList<? extends MAM_ITM_SITE_R> metas) {
		this(metas, TABLE_NAME);
	}

	protected LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> getColumnMap() {
		LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> COLUMN_MAP = new LinkedHashMap<>();
		COLUMN_MAP.put(
			MAM_ITM_SITE_R.$itm_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_ITM_SITE_R.$itm_cd,
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
			MAM_ITM_SITE_R.$itm_sub1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_ITM_SITE_R.$itm_sub1,
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
			MAM_ITM_SITE_R.$itm_sub2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_ITM_SITE_R.$itm_sub2,
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
			MAM_ITM_SITE_R.$itm_sub3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_ITM_SITE_R.$itm_sub3,
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
			MAM_ITM_SITE_R.$site_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_ITM_SITE_R.$site_cd,
				"site_cd",
				site_cd,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_ITM_SITE_R.$ntfy_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_ITM_SITE_R.$ntfy_nm,
				"ntfy_nm",
				ntfy_nm,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_ITM_SITE_R.$plnt_aprv_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MAM_ITM_SITE_R.$plnt_aprv_flg,
				"plnt_aprv_flg",
				plnt_aprv_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_ITM_SITE_R.$plnt_aprv_role_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_ITM_SITE_R.$plnt_aprv_role_cd,
				"plnt_aprv_role_cd",
				plnt_aprv_role_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_ITM_SITE_R.$insp_aprv_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MAM_ITM_SITE_R.$insp_aprv_flg,
				"insp_aprv_flg",
				insp_aprv_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_ITM_SITE_R.$insp_aprv_role_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_ITM_SITE_R.$insp_aprv_role_cd,
				"insp_aprv_role_cd",
				insp_aprv_role_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_ITM_SITE_R.$mfg_aprv_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MAM_ITM_SITE_R.$mfg_aprv_flg,
				"mfg_aprv_flg",
				mfg_aprv_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_ITM_SITE_R.$mfg_aprv_role_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_ITM_SITE_R.$mfg_aprv_role_cd,
				"mfg_aprv_role_cd",
				mfg_aprv_role_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_ITM_SITE_R.$xfr_lot_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MAM_ITM_SITE_R.$xfr_lot_flg,
				"xfr_lot_flg",
				xfr_lot_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_ITM_SITE_R.$so_prmt_insp_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MAM_ITM_SITE_R.$so_prmt_insp_flg,
				"so_prmt_insp_flg",
				so_prmt_insp_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_ITM_SITE_R.$in_prmt_insp_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MAM_ITM_SITE_R.$in_prmt_insp_flg,
				"in_prmt_insp_flg",
				in_prmt_insp_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_ITM_SITE_R.$num_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_ITM_SITE_R.$num_id,
				"num_id",
				num_id,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_ITM_SITE_R.$memo1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_ITM_SITE_R.$memo1,
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
			MAM_ITM_SITE_R.$memo2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_ITM_SITE_R.$memo2,
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
			MAM_ITM_SITE_R.$memo3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_ITM_SITE_R.$memo3,
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
			MAM_ITM_SITE_R.$del_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MAM_ITM_SITE_R.$del_flg,
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
			MAM_ITM_SITE_R.$del_usr_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_ITM_SITE_R.$del_usr_id,
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
			MAM_ITM_SITE_R.$del_usr_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_ITM_SITE_R.$del_usr_nm,
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
			MAM_ITM_SITE_R.$del_ts,
			new MCDBContainerColulmnInfo<MCTimestampPermColumn>(
				MCDataType.TIMESTAMP,
				MAM_ITM_SITE_R.$del_ts,
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
			MAM_ITM_SITE_R.$ins_usr_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_ITM_SITE_R.$ins_usr_id,
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
			MAM_ITM_SITE_R.$ins_usr_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_ITM_SITE_R.$ins_usr_nm,
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
			MAM_ITM_SITE_R.$ins_ts,
			new MCDBContainerColulmnInfo<MCTimestampPermColumn>(
				MCDataType.TIMESTAMP,
				MAM_ITM_SITE_R.$ins_ts,
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
			MAM_ITM_SITE_R.$ins_func_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_ITM_SITE_R.$ins_func_id,
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
			MAM_ITM_SITE_R.$upd_cntr,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MAM_ITM_SITE_R.$upd_cntr,
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
			MAM_ITM_SITE_R.$upd_usr_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_ITM_SITE_R.$upd_usr_id,
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
			MAM_ITM_SITE_R.$upd_usr_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_ITM_SITE_R.$upd_usr_nm,
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
			MAM_ITM_SITE_R.$upd_ts,
			new MCDBContainerColulmnInfo<MCTimestampPermColumn>(
				MCDataType.TIMESTAMP,
				MAM_ITM_SITE_R.$upd_ts,
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
			MAM_ITM_SITE_R.$upd_func_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_ITM_SITE_R.$upd_func_id,
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
			MAM_ITM_SITE_R.$upd_srv_req_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_ITM_SITE_R.$upd_srv_req_no,
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
			MAM_ITM_SITE_R.$itm_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_ITM_SITE_R.$itm_nm,
				"itm_nm",
				null,
				false,
				true,
				false,
				false,
				true,
				"ITM1.ITM_NM"
			)
		);
		COLUMN_MAP.put(
			MAM_ITM_SITE_R.$site_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_ITM_SITE_R.$site_nm,
				"site_nm",
				null,
				false,
				true,
				false,
				false,
				true,
				"SITE1.SITE_NM"
			)
		);
		COLUMN_MAP.put(
			MAM_ITM_SITE_R.$plnt_aprv_role_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_ITM_SITE_R.$plnt_aprv_role_nm,
				"plnt_aprv_role_nm",
				null,
				false,
				true,
				false,
				false,
				true,
				"APRV_ROLE1.APRV_ROLE_NM"
			)
		);
		COLUMN_MAP.put(
			MAM_ITM_SITE_R.$insp_aprv_role_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_ITM_SITE_R.$insp_aprv_role_nm,
				"insp_aprv_role_nm",
				null,
				false,
				true,
				false,
				false,
				true,
				"APRV_ROLE2.APRV_ROLE_NM"
			)
		);
		COLUMN_MAP.put(
			MAM_ITM_SITE_R.$mfg_aprv_role_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_ITM_SITE_R.$mfg_aprv_role_nm,
				"mfg_aprv_role_nm",
				null,
				false,
				true,
				false,
				false,
				true,
				"APRV_ROLE3.APRV_ROLE_NM"
			)
		);
		return COLUMN_MAP;
	}

	/**
	 * 新しいRowを生成します。
	 *
	 * @return 新しいインスタンス
	 */
	public static MAM_ITM_SITE_R create() {
		return create(TABLE_NAME);
	}

	/**
	 * 新しいRowを生成します。
	 *
	 * @return 新しいインスタンス
	 */
	public static MAM_ITM_SITE_R create(String alias) {
		MAM_ITM_SITE_R row = new MAM_ITM_SITE_R(constMetas, alias);
		return row;
	}

	/**
	 * 新しいRowを生成し別のRowの内容を設定します。
	 *
	 * @param proto 設定するRow
	 * @return 内容を設定した新しいインスタンス
	 */
	public static <T extends MCRow> MAM_ITM_SITE_R createByName(T proto) {
		MAM_ITM_SITE_R row = MAM_ITM_SITE_R.create();
		copyByName(row, proto);
		return row;
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MAM_ITM_SITE_R clone() {
		return (MAM_ITM_SITE_R) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MAM_ITM_SITE_R createInstance() {
		return (MAM_ITM_SITE_R) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MAM_ITM_SITE_R getValues(String... names) {
		return (MAM_ITM_SITE_R) super.getValues(names);
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
	 public MAW_ITM_SITE_KEY_R getPkWorkDbc(String alias) {
	 	return MAW_ITM_SITE_KEY_R.create(alias);
	 }

	/*
	 * MCDBContainerのオーバーライドメソッドです。
	 */
	 public MAW_ITM_SITE_KEY_R getPkWorkDbc() {
	 	return getPkWorkDbc(MAW_ITM_SITE_KEY_R.TABLE_NAME);
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
	 * 工場・物流倉庫ＣＤ. Factory/Distribution warehouse cd..<p>
	 *
	 */
	public String site_cd() {
		return getConstString(offset + 4, $site_cd);
	}

	/**
	 * 工場・物流倉庫ＣＤ. Factory/Distribution warehouse cd..<p>
	 *
	 */
	public void site_cd(String value) {
		setConstString(offset + 4, $site_cd, value);
	}

	/**
	 * 届出名. Notification name.<p>
	 *
	 */
	public String ntfy_nm() {
		return getConstString(offset + 5, $ntfy_nm);
	}

	/**
	 * 届出名. Notification name.<p>
	 *
	 */
	public void ntfy_nm(String value) {
		setConstString(offset + 5, $ntfy_nm, value);
	}

	/**
	 * 工場出荷承認対象ＦＬＧ. For factory release approval flg..<p>
	 *
	 */
	public boolean plnt_aprv_flg() {
		return getConstBoolean(offset + 6, $plnt_aprv_flg);
	}

	/**
	 * 工場出荷承認対象ＦＬＧ. For factory release approval flg..<p>
	 *
	 */
	public void plnt_aprv_flg(boolean value) {
		setConstBoolean(offset + 6, $plnt_aprv_flg, value);
	}

	/**
	 * 工場出荷承認役割ＣＤ. Factory release approval role cd..<p>
	 *
	 */
	public String plnt_aprv_role_cd() {
		return getConstString(offset + 7, $plnt_aprv_role_cd);
	}

	/**
	 * 工場出荷承認役割ＣＤ. Factory release approval role cd..<p>
	 *
	 */
	public void plnt_aprv_role_cd(String value) {
		setConstString(offset + 7, $plnt_aprv_role_cd, value);
	}

	/**
	 * 検査承認対象ＦＬＧ. For inspection approval flg..<p>
	 *
	 */
	public boolean insp_aprv_flg() {
		return getConstBoolean(offset + 8, $insp_aprv_flg);
	}

	/**
	 * 検査承認対象ＦＬＧ. For inspection approval flg..<p>
	 *
	 */
	public void insp_aprv_flg(boolean value) {
		setConstBoolean(offset + 8, $insp_aprv_flg, value);
	}

	/**
	 * 検査承認役割ＣＤ. Inspection approval role cd..<p>
	 *
	 */
	public String insp_aprv_role_cd() {
		return getConstString(offset + 9, $insp_aprv_role_cd);
	}

	/**
	 * 検査承認役割ＣＤ. Inspection approval role cd..<p>
	 *
	 */
	public void insp_aprv_role_cd(String value) {
		setConstString(offset + 9, $insp_aprv_role_cd, value);
	}

	/**
	 * 製造承認対象ＦＬＧ. For mfg. approval flg..<p>
	 *
	 */
	public boolean mfg_aprv_flg() {
		return getConstBoolean(offset + 10, $mfg_aprv_flg);
	}

	/**
	 * 製造承認対象ＦＬＧ. For mfg. approval flg..<p>
	 *
	 */
	public void mfg_aprv_flg(boolean value) {
		setConstBoolean(offset + 10, $mfg_aprv_flg, value);
	}

	/**
	 * 製造承認役割ＣＤ. Mfg. approval role cd..<p>
	 *
	 */
	public String mfg_aprv_role_cd() {
		return getConstString(offset + 11, $mfg_aprv_role_cd);
	}

	/**
	 * 製造承認役割ＣＤ. Mfg. approval role cd..<p>
	 *
	 */
	public void mfg_aprv_role_cd(String value) {
		setConstString(offset + 11, $mfg_aprv_role_cd, value);
	}

	/**
	 * 移送入荷時ロットＮＯ振替ＦＬＧ. Lot No. transfer flg. at transport receipt.<p>
	 *
	 */
	public boolean xfr_lot_flg() {
		return getConstBoolean(offset + 12, $xfr_lot_flg);
	}

	/**
	 * 移送入荷時ロットＮＯ振替ＦＬＧ. Lot No. transfer flg. at transport receipt.<p>
	 *
	 */
	public void xfr_lot_flg(boolean value) {
		setConstBoolean(offset + 12, $xfr_lot_flg, value);
	}

	/**
	 * 検査中ロット出荷許可ＦＬＧ. Allow inspecting lot shipment flg..<p>
	 *
	 */
	public boolean so_prmt_insp_flg() {
		return getConstBoolean(offset + 13, $so_prmt_insp_flg);
	}

	/**
	 * 検査中ロット出荷許可ＦＬＧ. Allow inspecting lot shipment flg..<p>
	 *
	 */
	public void so_prmt_insp_flg(boolean value) {
		setConstBoolean(offset + 13, $so_prmt_insp_flg, value);
	}

	/**
	 * 検査中ロット使用許可ＦＬＧ. Allow inspecting lot use flg..<p>
	 *
	 */
	public boolean in_prmt_insp_flg() {
		return getConstBoolean(offset + 14, $in_prmt_insp_flg);
	}

	/**
	 * 検査中ロット使用許可ＦＬＧ. Allow inspecting lot use flg..<p>
	 *
	 */
	public void in_prmt_insp_flg(boolean value) {
		setConstBoolean(offset + 14, $in_prmt_insp_flg, value);
	}

	/**
	 * 発番ＩＤ. Numbering ID.<p>
	 *
	 */
	public String num_id() {
		return getConstString(offset + 15, $num_id);
	}

	/**
	 * 発番ＩＤ. Numbering ID.<p>
	 *
	 */
	public void num_id(String value) {
		setConstString(offset + 15, $num_id, value);
	}

	/**
	 * メモ１. Memo 1.<p>
	 *
	 */
	public String memo1() {
		return getConstString(offset + 16, $memo1);
	}

	/**
	 * メモ１. Memo 1.<p>
	 *
	 */
	public void memo1(String value) {
		setConstString(offset + 16, $memo1, value);
	}

	/**
	 * メモ２. Memo 2.<p>
	 *
	 */
	public String memo2() {
		return getConstString(offset + 17, $memo2);
	}

	/**
	 * メモ２. Memo 2.<p>
	 *
	 */
	public void memo2(String value) {
		setConstString(offset + 17, $memo2, value);
	}

	/**
	 * メモ３. Memo 3.<p>
	 *
	 */
	public String memo3() {
		return getConstString(offset + 18, $memo3);
	}

	/**
	 * メモ３. Memo 3.<p>
	 *
	 */
	public void memo3(String value) {
		setConstString(offset + 18, $memo3, value);
	}

	/**
	 * 論理削除ＦＬＧ. Logical delete flg..<p>
	 *
	 */
	public boolean del_flg() {
		return getConstBoolean(offset + 19, $del_flg);
	}

	/**
	 * 論理削除ＦＬＧ. Logical delete flg..<p>
	 *
	 */
	public void del_flg(boolean value) {
		setConstBoolean(offset + 19, $del_flg, value);
	}

	/**
	 * 論理削除ユーザＩＤ. Logical delete user ID.<p>
	 *
	 */
	public String del_usr_id() {
		return getConstString(offset + 20, $del_usr_id);
	}

	/**
	 * 論理削除ユーザＩＤ. Logical delete user ID.<p>
	 *
	 */
	public void del_usr_id(String value) {
		setConstString(offset + 20, $del_usr_id, value);
	}

	/**
	 * 論理削除ユーザ名. Logical delete user name.<p>
	 *
	 */
	public String del_usr_nm() {
		return getConstString(offset + 21, $del_usr_nm);
	}

	/**
	 * 論理削除ユーザ名. Logical delete user name.<p>
	 *
	 */
	public void del_usr_nm(String value) {
		setConstString(offset + 21, $del_usr_nm, value);
	}

	/**
	 * 論理削除日時. Logical delete date and time.<p>
	 *
	 */
	public MCTimestamp del_ts() {
		return getConstTimestamp(offset + 22, $del_ts);
	}

	/**
	 * 論理削除日時. Logical delete date and time.<p>
	 *
	 */
	public void del_ts(MCTimestamp value) {
		setConstTimestamp(offset + 22, $del_ts, value);
	}

	/**
	 * 登録ユーザＩＤ. Entry user ID.<p>
	 *
	 */
	public String ins_usr_id() {
		return getConstString(offset + 23, $ins_usr_id);
	}

	/**
	 * 登録ユーザＩＤ. Entry user ID.<p>
	 *
	 */
	public void ins_usr_id(String value) {
		setConstString(offset + 23, $ins_usr_id, value);
	}

	/**
	 * 登録ユーザ名. Entry user name.<p>
	 *
	 */
	public String ins_usr_nm() {
		return getConstString(offset + 24, $ins_usr_nm);
	}

	/**
	 * 登録ユーザ名. Entry user name.<p>
	 *
	 */
	public void ins_usr_nm(String value) {
		setConstString(offset + 24, $ins_usr_nm, value);
	}

	/**
	 * 登録日時. Entry date and time.<p>
	 *
	 */
	public MCTimestamp ins_ts() {
		return getConstTimestamp(offset + 25, $ins_ts);
	}

	/**
	 * 登録日時. Entry date and time.<p>
	 *
	 */
	public void ins_ts(MCTimestamp value) {
		setConstTimestamp(offset + 25, $ins_ts, value);
	}

	/**
	 * 登録機能ＩＤ. Entry function ID.<p>
	 *
	 */
	public String ins_func_id() {
		return getConstString(offset + 26, $ins_func_id);
	}

	/**
	 * 登録機能ＩＤ. Entry function ID.<p>
	 *
	 */
	public void ins_func_id(String value) {
		setConstString(offset + 26, $ins_func_id, value);
	}

	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public MCNumber upd_cntr() {
		return getConstNumber(offset + 27, $upd_cntr);
	}

	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(MCNumber value) {
		setConstNumber(offset + 27, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(int value) {
		setConstNumber(offset + 27, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(long value) {
		setConstNumber(offset + 27, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(float value) {
		setConstNumber(offset + 27, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(double value) {
		setConstNumber(offset + 27, $upd_cntr, value);
	}
	
	/**
	 * 更新ユーザＩＤ. Update user ID.<p>
	 *
	 */
	public String upd_usr_id() {
		return getConstString(offset + 28, $upd_usr_id);
	}

	/**
	 * 更新ユーザＩＤ. Update user ID.<p>
	 *
	 */
	public void upd_usr_id(String value) {
		setConstString(offset + 28, $upd_usr_id, value);
	}

	/**
	 * 更新ユーザ名. Update user name.<p>
	 *
	 */
	public String upd_usr_nm() {
		return getConstString(offset + 29, $upd_usr_nm);
	}

	/**
	 * 更新ユーザ名. Update user name.<p>
	 *
	 */
	public void upd_usr_nm(String value) {
		setConstString(offset + 29, $upd_usr_nm, value);
	}

	/**
	 * 更新日時. Update date and time.<p>
	 *
	 */
	public MCTimestamp upd_ts() {
		return getConstTimestamp(offset + 30, $upd_ts);
	}

	/**
	 * 更新日時. Update date and time.<p>
	 *
	 */
	public void upd_ts(MCTimestamp value) {
		setConstTimestamp(offset + 30, $upd_ts, value);
	}

	/**
	 * 更新機能ＩＤ. Update function ID.<p>
	 *
	 */
	public String upd_func_id() {
		return getConstString(offset + 31, $upd_func_id);
	}

	/**
	 * 更新機能ＩＤ. Update function ID.<p>
	 *
	 */
	public void upd_func_id(String value) {
		setConstString(offset + 31, $upd_func_id, value);
	}

	/**
	 * 更新リクエストＮＯ. Update request No..<p>
	 *
	 */
	public String upd_srv_req_no() {
		return getConstString(offset + 32, $upd_srv_req_no);
	}

	/**
	 * 更新リクエストＮＯ. Update request No..<p>
	 *
	 */
	public void upd_srv_req_no(String value) {
		setConstString(offset + 32, $upd_srv_req_no, value);
	}

	/**
	 * 品名. Item name.<p>
	 *
	 */
	public String itm_nm() {
		return getConstString(offset + 33, $itm_nm);
	}

	/**
	 * 品名. Item name.<p>
	 *
	 */
	public void itm_nm(String value) {
		setConstString(offset + 33, $itm_nm, value);
	}

	/**
	 * 工場・物流倉庫名. Factory/Distribution warehouse name.<p>
	 *
	 */
	public String site_nm() {
		return getConstString(offset + 34, $site_nm);
	}

	/**
	 * 工場・物流倉庫名. Factory/Distribution warehouse name.<p>
	 *
	 */
	public void site_nm(String value) {
		setConstString(offset + 34, $site_nm, value);
	}

	/**
	 * 工場出荷承認役割名. Factory release approval role name.<p>
	 *
	 */
	public String plnt_aprv_role_nm() {
		return getConstString(offset + 35, $plnt_aprv_role_nm);
	}

	/**
	 * 工場出荷承認役割名. Factory release approval role name.<p>
	 *
	 */
	public void plnt_aprv_role_nm(String value) {
		setConstString(offset + 35, $plnt_aprv_role_nm, value);
	}

	/**
	 * 検査承認役割名. Inspection approval role name.<p>
	 *
	 */
	public String insp_aprv_role_nm() {
		return getConstString(offset + 36, $insp_aprv_role_nm);
	}

	/**
	 * 検査承認役割名. Inspection approval role name.<p>
	 *
	 */
	public void insp_aprv_role_nm(String value) {
		setConstString(offset + 36, $insp_aprv_role_nm, value);
	}

	/**
	 * 製造承認役割名. Mfg. approval role name.<p>
	 *
	 */
	public String mfg_aprv_role_nm() {
		return getConstString(offset + 37, $mfg_aprv_role_nm);
	}

	/**
	 * 製造承認役割名. Mfg. approval role name.<p>
	 *
	 */
	public void mfg_aprv_role_nm(String value) {
		setConstString(offset + 37, $mfg_aprv_role_nm, value);
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
		if ($site_cd.equalsIgnoreCase(name)) {
			return site_cd();
		}
		if ($ntfy_nm.equalsIgnoreCase(name)) {
			return ntfy_nm();
		}
		if ($plnt_aprv_role_cd.equalsIgnoreCase(name)) {
			return plnt_aprv_role_cd();
		}
		if ($insp_aprv_role_cd.equalsIgnoreCase(name)) {
			return insp_aprv_role_cd();
		}
		if ($mfg_aprv_role_cd.equalsIgnoreCase(name)) {
			return mfg_aprv_role_cd();
		}
		if ($num_id.equalsIgnoreCase(name)) {
			return num_id();
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
		if ($itm_nm.equalsIgnoreCase(name)) {
			return itm_nm();
		}
		if ($site_nm.equalsIgnoreCase(name)) {
			return site_nm();
		}
		if ($plnt_aprv_role_nm.equalsIgnoreCase(name)) {
			return plnt_aprv_role_nm();
		}
		if ($insp_aprv_role_nm.equalsIgnoreCase(name)) {
			return insp_aprv_role_nm();
		}
		if ($mfg_aprv_role_nm.equalsIgnoreCase(name)) {
			return mfg_aprv_role_nm();
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
		if ($plnt_aprv_flg.equalsIgnoreCase(name)) {
			return plnt_aprv_flg();
		}
		if ($insp_aprv_flg.equalsIgnoreCase(name)) {
			return insp_aprv_flg();
		}
		if ($mfg_aprv_flg.equalsIgnoreCase(name)) {
			return mfg_aprv_flg();
		}
		if ($xfr_lot_flg.equalsIgnoreCase(name)) {
			return xfr_lot_flg();
		}
		if ($so_prmt_insp_flg.equalsIgnoreCase(name)) {
			return so_prmt_insp_flg();
		}
		if ($in_prmt_insp_flg.equalsIgnoreCase(name)) {
			return in_prmt_insp_flg();
		}
		if ($del_flg.equalsIgnoreCase(name)) {
			return del_flg();
		}
		return super.getBoolean(name);
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
		if ($site_cd.equalsIgnoreCase(name)) {
			return site_cd();
		}
		if ($ntfy_nm.equalsIgnoreCase(name)) {
			return ntfy_nm();
		}
		if ($plnt_aprv_role_cd.equalsIgnoreCase(name)) {
			return plnt_aprv_role_cd();
		}
		if ($insp_aprv_role_cd.equalsIgnoreCase(name)) {
			return insp_aprv_role_cd();
		}
		if ($mfg_aprv_role_cd.equalsIgnoreCase(name)) {
			return mfg_aprv_role_cd();
		}
		if ($num_id.equalsIgnoreCase(name)) {
			return num_id();
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
		if ($itm_nm.equalsIgnoreCase(name)) {
			return itm_nm();
		}
		if ($site_nm.equalsIgnoreCase(name)) {
			return site_nm();
		}
		if ($plnt_aprv_role_nm.equalsIgnoreCase(name)) {
			return plnt_aprv_role_nm();
		}
		if ($insp_aprv_role_nm.equalsIgnoreCase(name)) {
			return insp_aprv_role_nm();
		}
		if ($mfg_aprv_role_nm.equalsIgnoreCase(name)) {
			return mfg_aprv_role_nm();
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
		if ($plnt_aprv_flg.equalsIgnoreCase(name)) {
			return plnt_aprv_flg();
		}
		if ($insp_aprv_flg.equalsIgnoreCase(name)) {
			return insp_aprv_flg();
		}
		if ($mfg_aprv_flg.equalsIgnoreCase(name)) {
			return mfg_aprv_flg();
		}
		if ($xfr_lot_flg.equalsIgnoreCase(name)) {
			return xfr_lot_flg();
		}
		if ($so_prmt_insp_flg.equalsIgnoreCase(name)) {
			return so_prmt_insp_flg();
		}
		if ($in_prmt_insp_flg.equalsIgnoreCase(name)) {
			return in_prmt_insp_flg();
		}
		if ($del_flg.equalsIgnoreCase(name)) {
			return del_flg();
		}
		return super.getBooleanNE(name);
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
		if ($site_cd.equalsIgnoreCase(name)) {
			site_cd(value);
			return;
		}
		if ($ntfy_nm.equalsIgnoreCase(name)) {
			ntfy_nm(value);
			return;
		}
		if ($plnt_aprv_role_cd.equalsIgnoreCase(name)) {
			plnt_aprv_role_cd(value);
			return;
		}
		if ($insp_aprv_role_cd.equalsIgnoreCase(name)) {
			insp_aprv_role_cd(value);
			return;
		}
		if ($mfg_aprv_role_cd.equalsIgnoreCase(name)) {
			mfg_aprv_role_cd(value);
			return;
		}
		if ($num_id.equalsIgnoreCase(name)) {
			num_id(value);
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
		if ($itm_nm.equalsIgnoreCase(name)) {
			itm_nm(value);
			return;
		}
		if ($site_nm.equalsIgnoreCase(name)) {
			site_nm(value);
			return;
		}
		if ($plnt_aprv_role_nm.equalsIgnoreCase(name)) {
			plnt_aprv_role_nm(value);
			return;
		}
		if ($insp_aprv_role_nm.equalsIgnoreCase(name)) {
			insp_aprv_role_nm(value);
			return;
		}
		if ($mfg_aprv_role_nm.equalsIgnoreCase(name)) {
			mfg_aprv_role_nm(value);
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
		if ($plnt_aprv_flg.equalsIgnoreCase(name)) {
			plnt_aprv_flg(value);
			return;
		}
		if ($insp_aprv_flg.equalsIgnoreCase(name)) {
			insp_aprv_flg(value);
			return;
		}
		if ($mfg_aprv_flg.equalsIgnoreCase(name)) {
			mfg_aprv_flg(value);
			return;
		}
		if ($xfr_lot_flg.equalsIgnoreCase(name)) {
			xfr_lot_flg(value);
			return;
		}
		if ($so_prmt_insp_flg.equalsIgnoreCase(name)) {
			so_prmt_insp_flg(value);
			return;
		}
		if ($in_prmt_insp_flg.equalsIgnoreCase(name)) {
			in_prmt_insp_flg(value);
			return;
		}
		if ($del_flg.equalsIgnoreCase(name)) {
			del_flg(value);
			return;
		}
		super.setBoolean(name, value);
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
		if ($site_cd.equalsIgnoreCase(name)) {
			site_cd(value);
			return;
		}
		if ($ntfy_nm.equalsIgnoreCase(name)) {
			ntfy_nm(value);
			return;
		}
		if ($plnt_aprv_role_cd.equalsIgnoreCase(name)) {
			plnt_aprv_role_cd(value);
			return;
		}
		if ($insp_aprv_role_cd.equalsIgnoreCase(name)) {
			insp_aprv_role_cd(value);
			return;
		}
		if ($mfg_aprv_role_cd.equalsIgnoreCase(name)) {
			mfg_aprv_role_cd(value);
			return;
		}
		if ($num_id.equalsIgnoreCase(name)) {
			num_id(value);
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
		if ($itm_nm.equalsIgnoreCase(name)) {
			itm_nm(value);
			return;
		}
		if ($site_nm.equalsIgnoreCase(name)) {
			site_nm(value);
			return;
		}
		if ($plnt_aprv_role_nm.equalsIgnoreCase(name)) {
			plnt_aprv_role_nm(value);
			return;
		}
		if ($insp_aprv_role_nm.equalsIgnoreCase(name)) {
			insp_aprv_role_nm(value);
			return;
		}
		if ($mfg_aprv_role_nm.equalsIgnoreCase(name)) {
			mfg_aprv_role_nm(value);
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
		if ($plnt_aprv_flg.equalsIgnoreCase(name)) {
			plnt_aprv_flg(value);
			return;
		}
		if ($insp_aprv_flg.equalsIgnoreCase(name)) {
			insp_aprv_flg(value);
			return;
		}
		if ($mfg_aprv_flg.equalsIgnoreCase(name)) {
			mfg_aprv_flg(value);
			return;
		}
		if ($xfr_lot_flg.equalsIgnoreCase(name)) {
			xfr_lot_flg(value);
			return;
		}
		if ($so_prmt_insp_flg.equalsIgnoreCase(name)) {
			so_prmt_insp_flg(value);
			return;
		}
		if ($in_prmt_insp_flg.equalsIgnoreCase(name)) {
			in_prmt_insp_flg(value);
			return;
		}
		if ($del_flg.equalsIgnoreCase(name)) {
			del_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}

}
