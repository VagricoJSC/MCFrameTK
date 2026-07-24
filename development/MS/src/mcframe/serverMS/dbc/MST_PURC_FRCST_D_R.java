package mcframe.serverMS.dbc;

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
import mcframe.commonCore.lang.MCNumber;
import mcframe.serverCore.queryapi.IFMCSQL.MCStringPermColumn;
import mcframe.serverCore.queryapi.IFMCSQL.MCNumberPermColumn;
import mcframe.serverCore.queryapi.IFMCSQL.MCDatePermColumn;
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
 * "購買内示明細 // Purchase forecast details"DBコンテナRowクラスです。<p>
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
 *  	<td>purc_frcst_d_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>購買内示明細ＮＯ</td>
 *  	<td>Purchase forecast details No.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>purc_frcst_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>購買内示ＮＯ</td>
 *  	<td>Purchase forecast No.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>purc_frcst_fix_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>購買内示確定ＮＯ</td>
 *  	<td>Purchase forecast firm No.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>pf_period_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>内示期間区分</td>
 *  	<td>Forecast period type</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>pf_period_st_dt</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>内示期間開始日</td>
 *  	<td>Forecast period start date</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>pf_period_end_dt</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>内示期間終了日</td>
 *  	<td>Forecast period end date</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>fix_period_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>確定期間ＦＬＧ</td>
 *  	<td>Firm period flg.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>trd_unit_pf_qty</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>取引単位内示数量</td>
 *  	<td>Transaction unit forecast qty.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>base_unit_pf_qty</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>基準単位内示数量</td>
 *  	<td>Base unit forecast qty.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>trd_unit_schd_qty</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>取引単位予定数量</td>
 *  	<td>Transaction unit scheduled qty.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>base_unit_schd_qty</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>基準単位予定数量</td>
 *  	<td>Base unit scheduled qty.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>trd_unit_prms_qty</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>取引単位回答数量</td>
 *  	<td>Transaction unit replied qty.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>base_unit_prms_qty</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>基準単位回答数量</td>
 *  	<td>Base unit replied qty.</td>
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
public class MST_PURC_FRCST_D_R extends MCDBContainer {

	public static final MCTableType TABLE_TYPE = MCTableType.CO_VIEW;

	public static final String TABLE_NAME = "MST_PURC_FRCST_D";

	public static final boolean EX_CTRL = false;
	
	public static final boolean LCL_TABLE = false;
	
	/**
	 * 購買内示明細ＮＯ. Purchase forecast details No..<p>
	 *
	 */
	public static final String $purc_frcst_d_no = "purc_frcst_d_no";
	private static final MCPermColumnInfo _purc_frcst_d_no = createColumnInfo("purc_frcst_d_no");
	public final MCStringPermColumn purc_frcst_d_no = createStringColumn(_purc_frcst_d_no);
	
	/**
	 * 購買内示ＮＯ. Purchase forecast No..<p>
	 *
	 */
	public static final String $purc_frcst_no = "purc_frcst_no";
	private static final MCPermColumnInfo _purc_frcst_no = createColumnInfo("purc_frcst_no");
	public final MCStringPermColumn purc_frcst_no = createStringColumn(_purc_frcst_no);
	
	/**
	 * 購買内示確定ＮＯ. Purchase forecast firm No..<p>
	 *
	 */
	public static final String $purc_frcst_fix_no = "purc_frcst_fix_no";
	private static final MCPermColumnInfo _purc_frcst_fix_no = createColumnInfo("purc_frcst_fix_no");
	public final MCStringPermColumn purc_frcst_fix_no = createStringColumn(_purc_frcst_fix_no);
	
	/**
	 * 内示期間区分. Forecast period type.<p>
	 *
	 */
	public static final String $pf_period_typ = "pf_period_typ";
	private static final MCPermColumnInfo _pf_period_typ = createColumnInfo("pf_period_typ");
	public final MCStringPermColumn pf_period_typ = createStringColumn(_pf_period_typ);
	
	/**
	 * 内示期間開始日. Forecast period start date.<p>
	 *
	 */
	public static final String $pf_period_st_dt = "pf_period_st_dt";
	private static final MCPermColumnInfo _pf_period_st_dt = createColumnInfo("pf_period_st_dt");
	public final MCDatePermColumn pf_period_st_dt = createDateColumn(_pf_period_st_dt);
	
	/**
	 * 内示期間終了日. Forecast period end date.<p>
	 *
	 */
	public static final String $pf_period_end_dt = "pf_period_end_dt";
	private static final MCPermColumnInfo _pf_period_end_dt = createColumnInfo("pf_period_end_dt");
	public final MCDatePermColumn pf_period_end_dt = createDateColumn(_pf_period_end_dt);
	
	/**
	 * 確定期間ＦＬＧ. Firm period flg..<p>
	 *
	 */
	public static final String $fix_period_flg = "fix_period_flg";
	private static final MCPermColumnInfo _fix_period_flg = createColumnInfo("fix_period_flg");
	public final MCBooleanPermColumn fix_period_flg = createBooleanColumn(_fix_period_flg);
	
	/**
	 * 取引単位内示数量. Transaction unit forecast qty..<p>
	 *
	 */
	public static final String $trd_unit_pf_qty = "trd_unit_pf_qty";
	private static final MCPermColumnInfo _trd_unit_pf_qty = createColumnInfo("trd_unit_pf_qty");
	public final MCNumberPermColumn trd_unit_pf_qty = createNumberColumn(_trd_unit_pf_qty);
	
	/**
	 * 基準単位内示数量. Base unit forecast qty..<p>
	 *
	 */
	public static final String $base_unit_pf_qty = "base_unit_pf_qty";
	private static final MCPermColumnInfo _base_unit_pf_qty = createColumnInfo("base_unit_pf_qty");
	public final MCNumberPermColumn base_unit_pf_qty = createNumberColumn(_base_unit_pf_qty);
	
	/**
	 * 取引単位予定数量. Transaction unit scheduled qty..<p>
	 *
	 */
	public static final String $trd_unit_schd_qty = "trd_unit_schd_qty";
	private static final MCPermColumnInfo _trd_unit_schd_qty = createColumnInfo("trd_unit_schd_qty");
	public final MCNumberPermColumn trd_unit_schd_qty = createNumberColumn(_trd_unit_schd_qty);
	
	/**
	 * 基準単位予定数量. Base unit scheduled qty..<p>
	 *
	 */
	public static final String $base_unit_schd_qty = "base_unit_schd_qty";
	private static final MCPermColumnInfo _base_unit_schd_qty = createColumnInfo("base_unit_schd_qty");
	public final MCNumberPermColumn base_unit_schd_qty = createNumberColumn(_base_unit_schd_qty);
	
	/**
	 * 取引単位回答数量. Transaction unit replied qty..<p>
	 *
	 */
	public static final String $trd_unit_prms_qty = "trd_unit_prms_qty";
	private static final MCPermColumnInfo _trd_unit_prms_qty = createColumnInfo("trd_unit_prms_qty");
	public final MCNumberPermColumn trd_unit_prms_qty = createNumberColumn(_trd_unit_prms_qty);
	
	/**
	 * 基準単位回答数量. Base unit replied qty..<p>
	 *
	 */
	public static final String $base_unit_prms_qty = "base_unit_prms_qty";
	private static final MCPermColumnInfo _base_unit_prms_qty = createColumnInfo("base_unit_prms_qty");
	public final MCNumberPermColumn base_unit_prms_qty = createNumberColumn(_base_unit_prms_qty);
	
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
	
	public static final MCMeta purc_frcst_d_no_META = createCommonMeta($purc_frcst_d_no, mcframe.commonMA.meta.MA_META.PURC_FRCST_D_NO);
	public static final MCMeta purc_frcst_no_META = createCommonMeta($purc_frcst_no, mcframe.commonMA.meta.MA_META.PURC_FRCST_NO);
	public static final MCMeta purc_frcst_fix_no_META = createCommonMeta($purc_frcst_fix_no, mcframe.commonMA.meta.MA_META.PURC_FRCST_FIX_NO);
	public static final MCMeta pf_period_typ_META = createCommonMeta($pf_period_typ, mcframe.commonMA.meta.MA_META.PERIOD_TYP);
	public static final MCMeta pf_period_st_dt_META = createCommonMeta($pf_period_st_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta pf_period_end_dt_META = createCommonMeta($pf_period_end_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta fix_period_flg_META = createCommonMeta($fix_period_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta trd_unit_pf_qty_META = createCommonMeta($trd_unit_pf_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta base_unit_pf_qty_META = createCommonMeta($base_unit_pf_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta trd_unit_schd_qty_META = createCommonMeta($trd_unit_schd_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta base_unit_schd_qty_META = createCommonMeta($base_unit_schd_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta trd_unit_prms_qty_META = createCommonMeta($trd_unit_prms_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta base_unit_prms_qty_META = createCommonMeta($base_unit_prms_qty, mcframe.commonMA.meta.MA_META.QTY);
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
	
	protected static final ConstMetaList<MST_PURC_FRCST_D_R> constMetas = new ConstMetaList<MST_PURC_FRCST_D_R>(
		MCDBContainer.constMetas,
		new MCMeta[]{
			purc_frcst_d_no_META,
			purc_frcst_no_META,
			purc_frcst_fix_no_META,
			pf_period_typ_META,
			pf_period_st_dt_META,
			pf_period_end_dt_META,
			fix_period_flg_META,
			trd_unit_pf_qty_META,
			base_unit_pf_qty_META,
			trd_unit_schd_qty_META,
			base_unit_schd_qty_META,
			trd_unit_prms_qty_META,
			base_unit_prms_qty_META,
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
	protected MST_PURC_FRCST_D_R(ConstMetaList<? extends MST_PURC_FRCST_D_R> metas, String alias) {
		super(metas, TABLE_TYPE, TABLE_NAME, alias, EX_CTRL, LCL_TABLE, FOREIGN_INFO_LIST);
		super.setColumnMap(getColumnMap());
	}

	protected MST_PURC_FRCST_D_R(ConstMetaList<? extends MST_PURC_FRCST_D_R> metas) {
		this(metas, TABLE_NAME);
	}

	protected LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> getColumnMap() {
		LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> COLUMN_MAP = new LinkedHashMap<>();
		COLUMN_MAP.put(
			MST_PURC_FRCST_D_R.$purc_frcst_d_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PURC_FRCST_D_R.$purc_frcst_d_no,
				"purc_frcst_d_no",
				purc_frcst_d_no,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_PURC_FRCST_D_R.$purc_frcst_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PURC_FRCST_D_R.$purc_frcst_no,
				"purc_frcst_no",
				purc_frcst_no,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_PURC_FRCST_D_R.$purc_frcst_fix_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PURC_FRCST_D_R.$purc_frcst_fix_no,
				"purc_frcst_fix_no",
				purc_frcst_fix_no,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_PURC_FRCST_D_R.$pf_period_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PURC_FRCST_D_R.$pf_period_typ,
				"pf_period_typ",
				pf_period_typ,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_PURC_FRCST_D_R.$pf_period_st_dt,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MST_PURC_FRCST_D_R.$pf_period_st_dt,
				"pf_period_st_dt",
				pf_period_st_dt,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_PURC_FRCST_D_R.$pf_period_end_dt,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MST_PURC_FRCST_D_R.$pf_period_end_dt,
				"pf_period_end_dt",
				pf_period_end_dt,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_PURC_FRCST_D_R.$fix_period_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MST_PURC_FRCST_D_R.$fix_period_flg,
				"fix_period_flg",
				fix_period_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_PURC_FRCST_D_R.$trd_unit_pf_qty,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_PURC_FRCST_D_R.$trd_unit_pf_qty,
				"trd_unit_pf_qty",
				trd_unit_pf_qty,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_PURC_FRCST_D_R.$base_unit_pf_qty,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_PURC_FRCST_D_R.$base_unit_pf_qty,
				"base_unit_pf_qty",
				base_unit_pf_qty,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_PURC_FRCST_D_R.$trd_unit_schd_qty,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_PURC_FRCST_D_R.$trd_unit_schd_qty,
				"trd_unit_schd_qty",
				trd_unit_schd_qty,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_PURC_FRCST_D_R.$base_unit_schd_qty,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_PURC_FRCST_D_R.$base_unit_schd_qty,
				"base_unit_schd_qty",
				base_unit_schd_qty,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_PURC_FRCST_D_R.$trd_unit_prms_qty,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_PURC_FRCST_D_R.$trd_unit_prms_qty,
				"trd_unit_prms_qty",
				trd_unit_prms_qty,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_PURC_FRCST_D_R.$base_unit_prms_qty,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_PURC_FRCST_D_R.$base_unit_prms_qty,
				"base_unit_prms_qty",
				base_unit_prms_qty,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_PURC_FRCST_D_R.$ins_usr_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PURC_FRCST_D_R.$ins_usr_id,
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
			MST_PURC_FRCST_D_R.$ins_usr_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PURC_FRCST_D_R.$ins_usr_nm,
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
			MST_PURC_FRCST_D_R.$ins_ts,
			new MCDBContainerColulmnInfo<MCTimestampPermColumn>(
				MCDataType.TIMESTAMP,
				MST_PURC_FRCST_D_R.$ins_ts,
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
			MST_PURC_FRCST_D_R.$ins_func_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PURC_FRCST_D_R.$ins_func_id,
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
			MST_PURC_FRCST_D_R.$upd_cntr,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_PURC_FRCST_D_R.$upd_cntr,
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
			MST_PURC_FRCST_D_R.$upd_usr_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PURC_FRCST_D_R.$upd_usr_id,
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
			MST_PURC_FRCST_D_R.$upd_usr_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PURC_FRCST_D_R.$upd_usr_nm,
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
			MST_PURC_FRCST_D_R.$upd_ts,
			new MCDBContainerColulmnInfo<MCTimestampPermColumn>(
				MCDataType.TIMESTAMP,
				MST_PURC_FRCST_D_R.$upd_ts,
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
			MST_PURC_FRCST_D_R.$upd_func_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PURC_FRCST_D_R.$upd_func_id,
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
			MST_PURC_FRCST_D_R.$upd_srv_req_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PURC_FRCST_D_R.$upd_srv_req_no,
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
	public static MST_PURC_FRCST_D_R create() {
		return create(TABLE_NAME);
	}

	/**
	 * 新しいRowを生成します。
	 *
	 * @return 新しいインスタンス
	 */
	public static MST_PURC_FRCST_D_R create(String alias) {
		MST_PURC_FRCST_D_R row = new MST_PURC_FRCST_D_R(constMetas, alias);
		return row;
	}

	/**
	 * 新しいRowを生成し別のRowの内容を設定します。
	 *
	 * @param proto 設定するRow
	 * @return 内容を設定した新しいインスタンス
	 */
	public static <T extends MCRow> MST_PURC_FRCST_D_R createByName(T proto) {
		MST_PURC_FRCST_D_R row = MST_PURC_FRCST_D_R.create();
		copyByName(row, proto);
		return row;
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MST_PURC_FRCST_D_R clone() {
		return (MST_PURC_FRCST_D_R) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MST_PURC_FRCST_D_R createInstance() {
		return (MST_PURC_FRCST_D_R) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MST_PURC_FRCST_D_R getValues(String... names) {
		return (MST_PURC_FRCST_D_R) super.getValues(names);
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
	 public MSW_PURC_FRCST_D_KEY_R getPkWorkDbc(String alias) {
	 	return MSW_PURC_FRCST_D_KEY_R.create(alias);
	 }

	/*
	 * MCDBContainerのオーバーライドメソッドです。
	 */
	 public MSW_PURC_FRCST_D_KEY_R getPkWorkDbc() {
	 	return getPkWorkDbc(MSW_PURC_FRCST_D_KEY_R.TABLE_NAME);
	 }

	/**
	 * 購買内示明細ＮＯ. Purchase forecast details No..<p>
	 *
	 */
	public String purc_frcst_d_no() {
		return getConstString(offset + 0, $purc_frcst_d_no);
	}

	/**
	 * 購買内示明細ＮＯ. Purchase forecast details No..<p>
	 *
	 */
	public void purc_frcst_d_no(String value) {
		setConstString(offset + 0, $purc_frcst_d_no, value);
	}

	/**
	 * 購買内示ＮＯ. Purchase forecast No..<p>
	 *
	 */
	public String purc_frcst_no() {
		return getConstString(offset + 1, $purc_frcst_no);
	}

	/**
	 * 購買内示ＮＯ. Purchase forecast No..<p>
	 *
	 */
	public void purc_frcst_no(String value) {
		setConstString(offset + 1, $purc_frcst_no, value);
	}

	/**
	 * 購買内示確定ＮＯ. Purchase forecast firm No..<p>
	 *
	 */
	public String purc_frcst_fix_no() {
		return getConstString(offset + 2, $purc_frcst_fix_no);
	}

	/**
	 * 購買内示確定ＮＯ. Purchase forecast firm No..<p>
	 *
	 */
	public void purc_frcst_fix_no(String value) {
		setConstString(offset + 2, $purc_frcst_fix_no, value);
	}

	/**
	 * 内示期間区分. Forecast period type.<p>
	 *
	 */
	public String pf_period_typ() {
		return getConstString(offset + 3, $pf_period_typ);
	}

	/**
	 * 内示期間区分. Forecast period type.<p>
	 *
	 */
	public void pf_period_typ(String value) {
		setConstString(offset + 3, $pf_period_typ, value);
	}

	/**
	 * 内示期間開始日. Forecast period start date.<p>
	 *
	 */
	public MCDate pf_period_st_dt() {
		return getConstDate(offset + 4, $pf_period_st_dt);
	}

	/**
	 * 内示期間開始日. Forecast period start date.<p>
	 *
	 */
	public void pf_period_st_dt(MCDate value) {
		setConstDate(offset + 4, $pf_period_st_dt, value);
	}

	/**
	 * 内示期間終了日. Forecast period end date.<p>
	 *
	 */
	public MCDate pf_period_end_dt() {
		return getConstDate(offset + 5, $pf_period_end_dt);
	}

	/**
	 * 内示期間終了日. Forecast period end date.<p>
	 *
	 */
	public void pf_period_end_dt(MCDate value) {
		setConstDate(offset + 5, $pf_period_end_dt, value);
	}

	/**
	 * 確定期間ＦＬＧ. Firm period flg..<p>
	 *
	 */
	public boolean fix_period_flg() {
		return getConstBoolean(offset + 6, $fix_period_flg);
	}

	/**
	 * 確定期間ＦＬＧ. Firm period flg..<p>
	 *
	 */
	public void fix_period_flg(boolean value) {
		setConstBoolean(offset + 6, $fix_period_flg, value);
	}

	/**
	 * 取引単位内示数量. Transaction unit forecast qty..<p>
	 *
	 */
	public MCNumber trd_unit_pf_qty() {
		return getConstNumber(offset + 7, $trd_unit_pf_qty);
	}

	/**
	 * 取引単位内示数量. Transaction unit forecast qty..<p>
	 *
	 */
	public void trd_unit_pf_qty(MCNumber value) {
		setConstNumber(offset + 7, $trd_unit_pf_qty, value);
	}
	
	/**
	 * 取引単位内示数量. Transaction unit forecast qty..<p>
	 *
	 */
	public void trd_unit_pf_qty(int value) {
		setConstNumber(offset + 7, $trd_unit_pf_qty, value);
	}
	
	/**
	 * 取引単位内示数量. Transaction unit forecast qty..<p>
	 *
	 */
	public void trd_unit_pf_qty(long value) {
		setConstNumber(offset + 7, $trd_unit_pf_qty, value);
	}
	
	/**
	 * 取引単位内示数量. Transaction unit forecast qty..<p>
	 *
	 */
	public void trd_unit_pf_qty(float value) {
		setConstNumber(offset + 7, $trd_unit_pf_qty, value);
	}
	
	/**
	 * 取引単位内示数量. Transaction unit forecast qty..<p>
	 *
	 */
	public void trd_unit_pf_qty(double value) {
		setConstNumber(offset + 7, $trd_unit_pf_qty, value);
	}
	
	/**
	 * 基準単位内示数量. Base unit forecast qty..<p>
	 *
	 */
	public MCNumber base_unit_pf_qty() {
		return getConstNumber(offset + 8, $base_unit_pf_qty);
	}

	/**
	 * 基準単位内示数量. Base unit forecast qty..<p>
	 *
	 */
	public void base_unit_pf_qty(MCNumber value) {
		setConstNumber(offset + 8, $base_unit_pf_qty, value);
	}
	
	/**
	 * 基準単位内示数量. Base unit forecast qty..<p>
	 *
	 */
	public void base_unit_pf_qty(int value) {
		setConstNumber(offset + 8, $base_unit_pf_qty, value);
	}
	
	/**
	 * 基準単位内示数量. Base unit forecast qty..<p>
	 *
	 */
	public void base_unit_pf_qty(long value) {
		setConstNumber(offset + 8, $base_unit_pf_qty, value);
	}
	
	/**
	 * 基準単位内示数量. Base unit forecast qty..<p>
	 *
	 */
	public void base_unit_pf_qty(float value) {
		setConstNumber(offset + 8, $base_unit_pf_qty, value);
	}
	
	/**
	 * 基準単位内示数量. Base unit forecast qty..<p>
	 *
	 */
	public void base_unit_pf_qty(double value) {
		setConstNumber(offset + 8, $base_unit_pf_qty, value);
	}
	
	/**
	 * 取引単位予定数量. Transaction unit scheduled qty..<p>
	 *
	 */
	public MCNumber trd_unit_schd_qty() {
		return getConstNumber(offset + 9, $trd_unit_schd_qty);
	}

	/**
	 * 取引単位予定数量. Transaction unit scheduled qty..<p>
	 *
	 */
	public void trd_unit_schd_qty(MCNumber value) {
		setConstNumber(offset + 9, $trd_unit_schd_qty, value);
	}
	
	/**
	 * 取引単位予定数量. Transaction unit scheduled qty..<p>
	 *
	 */
	public void trd_unit_schd_qty(int value) {
		setConstNumber(offset + 9, $trd_unit_schd_qty, value);
	}
	
	/**
	 * 取引単位予定数量. Transaction unit scheduled qty..<p>
	 *
	 */
	public void trd_unit_schd_qty(long value) {
		setConstNumber(offset + 9, $trd_unit_schd_qty, value);
	}
	
	/**
	 * 取引単位予定数量. Transaction unit scheduled qty..<p>
	 *
	 */
	public void trd_unit_schd_qty(float value) {
		setConstNumber(offset + 9, $trd_unit_schd_qty, value);
	}
	
	/**
	 * 取引単位予定数量. Transaction unit scheduled qty..<p>
	 *
	 */
	public void trd_unit_schd_qty(double value) {
		setConstNumber(offset + 9, $trd_unit_schd_qty, value);
	}
	
	/**
	 * 基準単位予定数量. Base unit scheduled qty..<p>
	 *
	 */
	public MCNumber base_unit_schd_qty() {
		return getConstNumber(offset + 10, $base_unit_schd_qty);
	}

	/**
	 * 基準単位予定数量. Base unit scheduled qty..<p>
	 *
	 */
	public void base_unit_schd_qty(MCNumber value) {
		setConstNumber(offset + 10, $base_unit_schd_qty, value);
	}
	
	/**
	 * 基準単位予定数量. Base unit scheduled qty..<p>
	 *
	 */
	public void base_unit_schd_qty(int value) {
		setConstNumber(offset + 10, $base_unit_schd_qty, value);
	}
	
	/**
	 * 基準単位予定数量. Base unit scheduled qty..<p>
	 *
	 */
	public void base_unit_schd_qty(long value) {
		setConstNumber(offset + 10, $base_unit_schd_qty, value);
	}
	
	/**
	 * 基準単位予定数量. Base unit scheduled qty..<p>
	 *
	 */
	public void base_unit_schd_qty(float value) {
		setConstNumber(offset + 10, $base_unit_schd_qty, value);
	}
	
	/**
	 * 基準単位予定数量. Base unit scheduled qty..<p>
	 *
	 */
	public void base_unit_schd_qty(double value) {
		setConstNumber(offset + 10, $base_unit_schd_qty, value);
	}
	
	/**
	 * 取引単位回答数量. Transaction unit replied qty..<p>
	 *
	 */
	public MCNumber trd_unit_prms_qty() {
		return getConstNumber(offset + 11, $trd_unit_prms_qty);
	}

	/**
	 * 取引単位回答数量. Transaction unit replied qty..<p>
	 *
	 */
	public void trd_unit_prms_qty(MCNumber value) {
		setConstNumber(offset + 11, $trd_unit_prms_qty, value);
	}
	
	/**
	 * 取引単位回答数量. Transaction unit replied qty..<p>
	 *
	 */
	public void trd_unit_prms_qty(int value) {
		setConstNumber(offset + 11, $trd_unit_prms_qty, value);
	}
	
	/**
	 * 取引単位回答数量. Transaction unit replied qty..<p>
	 *
	 */
	public void trd_unit_prms_qty(long value) {
		setConstNumber(offset + 11, $trd_unit_prms_qty, value);
	}
	
	/**
	 * 取引単位回答数量. Transaction unit replied qty..<p>
	 *
	 */
	public void trd_unit_prms_qty(float value) {
		setConstNumber(offset + 11, $trd_unit_prms_qty, value);
	}
	
	/**
	 * 取引単位回答数量. Transaction unit replied qty..<p>
	 *
	 */
	public void trd_unit_prms_qty(double value) {
		setConstNumber(offset + 11, $trd_unit_prms_qty, value);
	}
	
	/**
	 * 基準単位回答数量. Base unit replied qty..<p>
	 *
	 */
	public MCNumber base_unit_prms_qty() {
		return getConstNumber(offset + 12, $base_unit_prms_qty);
	}

	/**
	 * 基準単位回答数量. Base unit replied qty..<p>
	 *
	 */
	public void base_unit_prms_qty(MCNumber value) {
		setConstNumber(offset + 12, $base_unit_prms_qty, value);
	}
	
	/**
	 * 基準単位回答数量. Base unit replied qty..<p>
	 *
	 */
	public void base_unit_prms_qty(int value) {
		setConstNumber(offset + 12, $base_unit_prms_qty, value);
	}
	
	/**
	 * 基準単位回答数量. Base unit replied qty..<p>
	 *
	 */
	public void base_unit_prms_qty(long value) {
		setConstNumber(offset + 12, $base_unit_prms_qty, value);
	}
	
	/**
	 * 基準単位回答数量. Base unit replied qty..<p>
	 *
	 */
	public void base_unit_prms_qty(float value) {
		setConstNumber(offset + 12, $base_unit_prms_qty, value);
	}
	
	/**
	 * 基準単位回答数量. Base unit replied qty..<p>
	 *
	 */
	public void base_unit_prms_qty(double value) {
		setConstNumber(offset + 12, $base_unit_prms_qty, value);
	}
	
	/**
	 * 登録ユーザＩＤ. Entry user ID.<p>
	 *
	 */
	public String ins_usr_id() {
		return getConstString(offset + 13, $ins_usr_id);
	}

	/**
	 * 登録ユーザＩＤ. Entry user ID.<p>
	 *
	 */
	public void ins_usr_id(String value) {
		setConstString(offset + 13, $ins_usr_id, value);
	}

	/**
	 * 登録ユーザ名. Entry user name.<p>
	 *
	 */
	public String ins_usr_nm() {
		return getConstString(offset + 14, $ins_usr_nm);
	}

	/**
	 * 登録ユーザ名. Entry user name.<p>
	 *
	 */
	public void ins_usr_nm(String value) {
		setConstString(offset + 14, $ins_usr_nm, value);
	}

	/**
	 * 登録日時. Entry date and time.<p>
	 *
	 */
	public MCTimestamp ins_ts() {
		return getConstTimestamp(offset + 15, $ins_ts);
	}

	/**
	 * 登録日時. Entry date and time.<p>
	 *
	 */
	public void ins_ts(MCTimestamp value) {
		setConstTimestamp(offset + 15, $ins_ts, value);
	}

	/**
	 * 登録機能ＩＤ. Entry function ID.<p>
	 *
	 */
	public String ins_func_id() {
		return getConstString(offset + 16, $ins_func_id);
	}

	/**
	 * 登録機能ＩＤ. Entry function ID.<p>
	 *
	 */
	public void ins_func_id(String value) {
		setConstString(offset + 16, $ins_func_id, value);
	}

	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public MCNumber upd_cntr() {
		return getConstNumber(offset + 17, $upd_cntr);
	}

	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(MCNumber value) {
		setConstNumber(offset + 17, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(int value) {
		setConstNumber(offset + 17, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(long value) {
		setConstNumber(offset + 17, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(float value) {
		setConstNumber(offset + 17, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(double value) {
		setConstNumber(offset + 17, $upd_cntr, value);
	}
	
	/**
	 * 更新ユーザＩＤ. Update user ID.<p>
	 *
	 */
	public String upd_usr_id() {
		return getConstString(offset + 18, $upd_usr_id);
	}

	/**
	 * 更新ユーザＩＤ. Update user ID.<p>
	 *
	 */
	public void upd_usr_id(String value) {
		setConstString(offset + 18, $upd_usr_id, value);
	}

	/**
	 * 更新ユーザ名. Update user name.<p>
	 *
	 */
	public String upd_usr_nm() {
		return getConstString(offset + 19, $upd_usr_nm);
	}

	/**
	 * 更新ユーザ名. Update user name.<p>
	 *
	 */
	public void upd_usr_nm(String value) {
		setConstString(offset + 19, $upd_usr_nm, value);
	}

	/**
	 * 更新日時. Update date and time.<p>
	 *
	 */
	public MCTimestamp upd_ts() {
		return getConstTimestamp(offset + 20, $upd_ts);
	}

	/**
	 * 更新日時. Update date and time.<p>
	 *
	 */
	public void upd_ts(MCTimestamp value) {
		setConstTimestamp(offset + 20, $upd_ts, value);
	}

	/**
	 * 更新機能ＩＤ. Update function ID.<p>
	 *
	 */
	public String upd_func_id() {
		return getConstString(offset + 21, $upd_func_id);
	}

	/**
	 * 更新機能ＩＤ. Update function ID.<p>
	 *
	 */
	public void upd_func_id(String value) {
		setConstString(offset + 21, $upd_func_id, value);
	}

	/**
	 * 更新リクエストＮＯ. Update request No..<p>
	 *
	 */
	public String upd_srv_req_no() {
		return getConstString(offset + 22, $upd_srv_req_no);
	}

	/**
	 * 更新リクエストＮＯ. Update request No..<p>
	 *
	 */
	public void upd_srv_req_no(String value) {
		setConstString(offset + 22, $upd_srv_req_no, value);
	}

	public String getString(String name) {
		if ($purc_frcst_d_no.equalsIgnoreCase(name)) {
			return purc_frcst_d_no();
		}
		if ($purc_frcst_no.equalsIgnoreCase(name)) {
			return purc_frcst_no();
		}
		if ($purc_frcst_fix_no.equalsIgnoreCase(name)) {
			return purc_frcst_fix_no();
		}
		if ($pf_period_typ.equalsIgnoreCase(name)) {
			return pf_period_typ();
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
		if ($trd_unit_pf_qty.equalsIgnoreCase(name)) {
			return trd_unit_pf_qty();
		}
		if ($base_unit_pf_qty.equalsIgnoreCase(name)) {
			return base_unit_pf_qty();
		}
		if ($trd_unit_schd_qty.equalsIgnoreCase(name)) {
			return trd_unit_schd_qty();
		}
		if ($base_unit_schd_qty.equalsIgnoreCase(name)) {
			return base_unit_schd_qty();
		}
		if ($trd_unit_prms_qty.equalsIgnoreCase(name)) {
			return trd_unit_prms_qty();
		}
		if ($base_unit_prms_qty.equalsIgnoreCase(name)) {
			return base_unit_prms_qty();
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			return upd_cntr();
		}
		return super.getNumber(name);
	}

	public MCDate getDate(String name) {
		if ($pf_period_st_dt.equalsIgnoreCase(name)) {
			return pf_period_st_dt();
		}
		if ($pf_period_end_dt.equalsIgnoreCase(name)) {
			return pf_period_end_dt();
		}
		return super.getDate(name);
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
		if ($fix_period_flg.equalsIgnoreCase(name)) {
			return fix_period_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($purc_frcst_d_no.equalsIgnoreCase(name)) {
			return purc_frcst_d_no();
		}
		if ($purc_frcst_no.equalsIgnoreCase(name)) {
			return purc_frcst_no();
		}
		if ($purc_frcst_fix_no.equalsIgnoreCase(name)) {
			return purc_frcst_fix_no();
		}
		if ($pf_period_typ.equalsIgnoreCase(name)) {
			return pf_period_typ();
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
		if ($trd_unit_pf_qty.equalsIgnoreCase(name)) {
			return trd_unit_pf_qty();
		}
		if ($base_unit_pf_qty.equalsIgnoreCase(name)) {
			return base_unit_pf_qty();
		}
		if ($trd_unit_schd_qty.equalsIgnoreCase(name)) {
			return trd_unit_schd_qty();
		}
		if ($base_unit_schd_qty.equalsIgnoreCase(name)) {
			return base_unit_schd_qty();
		}
		if ($trd_unit_prms_qty.equalsIgnoreCase(name)) {
			return trd_unit_prms_qty();
		}
		if ($base_unit_prms_qty.equalsIgnoreCase(name)) {
			return base_unit_prms_qty();
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			return upd_cntr();
		}
		return super.getNumberNE(name);
	}

	public MCDate getDateNE(String name) {
		if ($pf_period_st_dt.equalsIgnoreCase(name)) {
			return pf_period_st_dt();
		}
		if ($pf_period_end_dt.equalsIgnoreCase(name)) {
			return pf_period_end_dt();
		}
		return super.getDateNE(name);
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
		if ($fix_period_flg.equalsIgnoreCase(name)) {
			return fix_period_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($purc_frcst_d_no.equalsIgnoreCase(name)) {
			purc_frcst_d_no(value);
			return;
		}
		if ($purc_frcst_no.equalsIgnoreCase(name)) {
			purc_frcst_no(value);
			return;
		}
		if ($purc_frcst_fix_no.equalsIgnoreCase(name)) {
			purc_frcst_fix_no(value);
			return;
		}
		if ($pf_period_typ.equalsIgnoreCase(name)) {
			pf_period_typ(value);
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
		if ($trd_unit_pf_qty.equalsIgnoreCase(name)) {
			trd_unit_pf_qty(value);
			return;
		}
		if ($base_unit_pf_qty.equalsIgnoreCase(name)) {
			base_unit_pf_qty(value);
			return;
		}
		if ($trd_unit_schd_qty.equalsIgnoreCase(name)) {
			trd_unit_schd_qty(value);
			return;
		}
		if ($base_unit_schd_qty.equalsIgnoreCase(name)) {
			base_unit_schd_qty(value);
			return;
		}
		if ($trd_unit_prms_qty.equalsIgnoreCase(name)) {
			trd_unit_prms_qty(value);
			return;
		}
		if ($base_unit_prms_qty.equalsIgnoreCase(name)) {
			base_unit_prms_qty(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, int value) {
		if ($trd_unit_pf_qty.equalsIgnoreCase(name)) {
			trd_unit_pf_qty(value);
			return;
		}
		if ($base_unit_pf_qty.equalsIgnoreCase(name)) {
			base_unit_pf_qty(value);
			return;
		}
		if ($trd_unit_schd_qty.equalsIgnoreCase(name)) {
			trd_unit_schd_qty(value);
			return;
		}
		if ($base_unit_schd_qty.equalsIgnoreCase(name)) {
			base_unit_schd_qty(value);
			return;
		}
		if ($trd_unit_prms_qty.equalsIgnoreCase(name)) {
			trd_unit_prms_qty(value);
			return;
		}
		if ($base_unit_prms_qty.equalsIgnoreCase(name)) {
			base_unit_prms_qty(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, long value) {
		if ($trd_unit_pf_qty.equalsIgnoreCase(name)) {
			trd_unit_pf_qty(value);
			return;
		}
		if ($base_unit_pf_qty.equalsIgnoreCase(name)) {
			base_unit_pf_qty(value);
			return;
		}
		if ($trd_unit_schd_qty.equalsIgnoreCase(name)) {
			trd_unit_schd_qty(value);
			return;
		}
		if ($base_unit_schd_qty.equalsIgnoreCase(name)) {
			base_unit_schd_qty(value);
			return;
		}
		if ($trd_unit_prms_qty.equalsIgnoreCase(name)) {
			trd_unit_prms_qty(value);
			return;
		}
		if ($base_unit_prms_qty.equalsIgnoreCase(name)) {
			base_unit_prms_qty(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, float value) {
		if ($trd_unit_pf_qty.equalsIgnoreCase(name)) {
			trd_unit_pf_qty(value);
			return;
		}
		if ($base_unit_pf_qty.equalsIgnoreCase(name)) {
			base_unit_pf_qty(value);
			return;
		}
		if ($trd_unit_schd_qty.equalsIgnoreCase(name)) {
			trd_unit_schd_qty(value);
			return;
		}
		if ($base_unit_schd_qty.equalsIgnoreCase(name)) {
			base_unit_schd_qty(value);
			return;
		}
		if ($trd_unit_prms_qty.equalsIgnoreCase(name)) {
			trd_unit_prms_qty(value);
			return;
		}
		if ($base_unit_prms_qty.equalsIgnoreCase(name)) {
			base_unit_prms_qty(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, double value) {
		if ($trd_unit_pf_qty.equalsIgnoreCase(name)) {
			trd_unit_pf_qty(value);
			return;
		}
		if ($base_unit_pf_qty.equalsIgnoreCase(name)) {
			base_unit_pf_qty(value);
			return;
		}
		if ($trd_unit_schd_qty.equalsIgnoreCase(name)) {
			trd_unit_schd_qty(value);
			return;
		}
		if ($base_unit_schd_qty.equalsIgnoreCase(name)) {
			base_unit_schd_qty(value);
			return;
		}
		if ($trd_unit_prms_qty.equalsIgnoreCase(name)) {
			trd_unit_prms_qty(value);
			return;
		}
		if ($base_unit_prms_qty.equalsIgnoreCase(name)) {
			base_unit_prms_qty(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setDate(String name, MCDate value) {
		if ($pf_period_st_dt.equalsIgnoreCase(name)) {
			pf_period_st_dt(value);
			return;
		}
		if ($pf_period_end_dt.equalsIgnoreCase(name)) {
			pf_period_end_dt(value);
			return;
		}
		super.setDate(name, value);
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
		if ($fix_period_flg.equalsIgnoreCase(name)) {
			fix_period_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($purc_frcst_d_no.equalsIgnoreCase(name)) {
			purc_frcst_d_no(value);
			return;
		}
		if ($purc_frcst_no.equalsIgnoreCase(name)) {
			purc_frcst_no(value);
			return;
		}
		if ($purc_frcst_fix_no.equalsIgnoreCase(name)) {
			purc_frcst_fix_no(value);
			return;
		}
		if ($pf_period_typ.equalsIgnoreCase(name)) {
			pf_period_typ(value);
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
		if ($trd_unit_pf_qty.equalsIgnoreCase(name)) {
			trd_unit_pf_qty(value);
			return;
		}
		if ($base_unit_pf_qty.equalsIgnoreCase(name)) {
			base_unit_pf_qty(value);
			return;
		}
		if ($trd_unit_schd_qty.equalsIgnoreCase(name)) {
			trd_unit_schd_qty(value);
			return;
		}
		if ($base_unit_schd_qty.equalsIgnoreCase(name)) {
			base_unit_schd_qty(value);
			return;
		}
		if ($trd_unit_prms_qty.equalsIgnoreCase(name)) {
			trd_unit_prms_qty(value);
			return;
		}
		if ($base_unit_prms_qty.equalsIgnoreCase(name)) {
			base_unit_prms_qty(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, int value) {
		if ($trd_unit_pf_qty.equalsIgnoreCase(name)) {
			trd_unit_pf_qty(value);
			return;
		}
		if ($base_unit_pf_qty.equalsIgnoreCase(name)) {
			base_unit_pf_qty(value);
			return;
		}
		if ($trd_unit_schd_qty.equalsIgnoreCase(name)) {
			trd_unit_schd_qty(value);
			return;
		}
		if ($base_unit_schd_qty.equalsIgnoreCase(name)) {
			base_unit_schd_qty(value);
			return;
		}
		if ($trd_unit_prms_qty.equalsIgnoreCase(name)) {
			trd_unit_prms_qty(value);
			return;
		}
		if ($base_unit_prms_qty.equalsIgnoreCase(name)) {
			base_unit_prms_qty(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, long value) {
		if ($trd_unit_pf_qty.equalsIgnoreCase(name)) {
			trd_unit_pf_qty(value);
			return;
		}
		if ($base_unit_pf_qty.equalsIgnoreCase(name)) {
			base_unit_pf_qty(value);
			return;
		}
		if ($trd_unit_schd_qty.equalsIgnoreCase(name)) {
			trd_unit_schd_qty(value);
			return;
		}
		if ($base_unit_schd_qty.equalsIgnoreCase(name)) {
			base_unit_schd_qty(value);
			return;
		}
		if ($trd_unit_prms_qty.equalsIgnoreCase(name)) {
			trd_unit_prms_qty(value);
			return;
		}
		if ($base_unit_prms_qty.equalsIgnoreCase(name)) {
			base_unit_prms_qty(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, float value) {
		if ($trd_unit_pf_qty.equalsIgnoreCase(name)) {
			trd_unit_pf_qty(value);
			return;
		}
		if ($base_unit_pf_qty.equalsIgnoreCase(name)) {
			base_unit_pf_qty(value);
			return;
		}
		if ($trd_unit_schd_qty.equalsIgnoreCase(name)) {
			trd_unit_schd_qty(value);
			return;
		}
		if ($base_unit_schd_qty.equalsIgnoreCase(name)) {
			base_unit_schd_qty(value);
			return;
		}
		if ($trd_unit_prms_qty.equalsIgnoreCase(name)) {
			trd_unit_prms_qty(value);
			return;
		}
		if ($base_unit_prms_qty.equalsIgnoreCase(name)) {
			base_unit_prms_qty(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, double value) {
		if ($trd_unit_pf_qty.equalsIgnoreCase(name)) {
			trd_unit_pf_qty(value);
			return;
		}
		if ($base_unit_pf_qty.equalsIgnoreCase(name)) {
			base_unit_pf_qty(value);
			return;
		}
		if ($trd_unit_schd_qty.equalsIgnoreCase(name)) {
			trd_unit_schd_qty(value);
			return;
		}
		if ($base_unit_schd_qty.equalsIgnoreCase(name)) {
			base_unit_schd_qty(value);
			return;
		}
		if ($trd_unit_prms_qty.equalsIgnoreCase(name)) {
			trd_unit_prms_qty(value);
			return;
		}
		if ($base_unit_prms_qty.equalsIgnoreCase(name)) {
			base_unit_prms_qty(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setDateNE(String name, MCDate value) {
		if ($pf_period_st_dt.equalsIgnoreCase(name)) {
			pf_period_st_dt(value);
			return;
		}
		if ($pf_period_end_dt.equalsIgnoreCase(name)) {
			pf_period_end_dt(value);
			return;
		}
		super.setDateNE(name, value);
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
		if ($fix_period_flg.equalsIgnoreCase(name)) {
			fix_period_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}

}
