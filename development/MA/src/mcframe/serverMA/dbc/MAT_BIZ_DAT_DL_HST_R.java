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
import mcframe.commonCore.lang.MCDate;
import mcframe.commonCore.lang.MCNumber;
import mcframe.serverCore.queryapi.IFMCSQL.MCStringPermColumn;
import mcframe.serverCore.queryapi.IFMCSQL.MCNumberPermColumn;
import mcframe.serverCore.queryapi.IFMCSQL.MCDatePermColumn;
import mcframe.serverCore.queryapi.IFMCSQL.MCTimestampPermColumn;
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
 * "業務データダウンロード実行履歴 // Business data download execution history"DBコンテナRowクラスです。<p>
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
 *  	<td>biz_dat_dl_hst_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>業務データダウンロード実行履歴ＮＯ</td>
 *  	<td>Business data download execution history No.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>biz_dat_dl_sts_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>業務データダウンロード実行状況区分</td>
 *  	<td>Business data download execution status type</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>proc_st_tm</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>処理開始日時</td>
 *  	<td>Process start date and time</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>proc_end_tm</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>処理終了日時</td>
 *  	<td>Process end date</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>biz_dat_id</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>業務データＩＤ</td>
 *  	<td>Business data ID</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>biz_dat_dl_cond</td>
 *  	<td>C</td>
 *  	<td>1000</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>業務データダウンロード検索条件</td>
 *  	<td>Business data download search criteria</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>usr_cd</td>
 *  	<td>C</td>
 *  	<td>500</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>担当者ＣＤ</td>
 *  	<td>PIC cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>file_bin</td>
 *  	<td>B</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ファイル</td>
 *  	<td>File</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>file_size</td>
 *  	<td>N</td>
 *  	<td>9,0</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ファイル容量</td>
 *  	<td>File capacity</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>data_cnt</td>
 *  	<td>N</td>
 *  	<td>9,0</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>データ件数</td>
 *  	<td>Number of data items</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>dl_tm</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ダウンロード日時</td>
 *  	<td>Download date and time</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>dl_file_path</td>
 *  	<td>C</td>
 *  	<td>200</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>出力先</td>
 *  	<td>Output destination</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>dl_file_nm</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ファイル名</td>
 *  	<td>File name</td>
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
 *  	<td>biz_dat_file_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ファイル種類区分</td>
 *  	<td>File classification type</td>
 *  </tr>
 * </table>
 *
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
public class MAT_BIZ_DAT_DL_HST_R extends MCDBContainer {

	public static final MCTableType TABLE_TYPE = MCTableType.CO_VIEW;

	public static final String TABLE_NAME = "MAT_BIZ_DAT_DL_HST";

	public static final boolean EX_CTRL = true;
	
	public static final boolean LCL_TABLE = false;
	
	/**
	 * 業務データダウンロード実行履歴ＮＯ. Business data download execution history No..<p>
	 *
	 */
	public static final String $biz_dat_dl_hst_no = "biz_dat_dl_hst_no";
	private static final MCPermColumnInfo _biz_dat_dl_hst_no = createColumnInfo("biz_dat_dl_hst_no");
	public final MCStringPermColumn biz_dat_dl_hst_no = createStringColumn(_biz_dat_dl_hst_no);
	
	/**
	 * 業務データダウンロード実行状況区分. Business data download execution status type.<p>
	 *
	 */
	public static final String $biz_dat_dl_sts_typ = "biz_dat_dl_sts_typ";
	private static final MCPermColumnInfo _biz_dat_dl_sts_typ = createColumnInfo("biz_dat_dl_sts_typ");
	public final MCStringPermColumn biz_dat_dl_sts_typ = createStringColumn(_biz_dat_dl_sts_typ);
	
	/**
	 * 処理開始日時. Process start date and time.<p>
	 *
	 */
	public static final String $proc_st_tm = "proc_st_tm";
	private static final MCPermColumnInfo _proc_st_tm = createColumnInfo("proc_st_tm");
	public final MCDatePermColumn proc_st_tm = createDateColumn(_proc_st_tm);
	
	/**
	 * 処理終了日時. Process end date.<p>
	 *
	 */
	public static final String $proc_end_tm = "proc_end_tm";
	private static final MCPermColumnInfo _proc_end_tm = createColumnInfo("proc_end_tm");
	public final MCDatePermColumn proc_end_tm = createDateColumn(_proc_end_tm);
	
	/**
	 * 業務データＩＤ. Business data ID.<p>
	 *
	 */
	public static final String $biz_dat_id = "biz_dat_id";
	private static final MCPermColumnInfo _biz_dat_id = createColumnInfo("biz_dat_id");
	public final MCStringPermColumn biz_dat_id = createStringColumn(_biz_dat_id);
	
	/**
	 * 業務データダウンロード検索条件. Business data download search criteria.<p>
	 *
	 */
	public static final String $biz_dat_dl_cond = "biz_dat_dl_cond";
	private static final MCPermColumnInfo _biz_dat_dl_cond = createColumnInfo("biz_dat_dl_cond");
	public final MCStringPermColumn biz_dat_dl_cond = createStringColumn(_biz_dat_dl_cond);
	
	/**
	 * 担当者ＣＤ. PIC cd..<p>
	 *
	 */
	public static final String $usr_cd = "usr_cd";
	private static final MCPermColumnInfo _usr_cd = createColumnInfo("usr_cd");
	public final MCStringPermColumn usr_cd = createStringColumn(_usr_cd);
	
	/**
	 * ファイル. File.<p>
	 *
	 */
	public static final String $file_bin = "file_bin";
	private static final MCPermColumnInfo _file_bin = createColumnInfo("file_bin");
	public final MCBinaryPermColumn file_bin = createBinaryColumn(_file_bin);
	
	/**
	 * ファイル容量. File capacity.<p>
	 *
	 */
	public static final String $file_size = "file_size";
	private static final MCPermColumnInfo _file_size = createColumnInfo("file_size");
	public final MCNumberPermColumn file_size = createNumberColumn(_file_size);
	
	/**
	 * データ件数. Number of data items.<p>
	 *
	 */
	public static final String $data_cnt = "data_cnt";
	private static final MCPermColumnInfo _data_cnt = createColumnInfo("data_cnt");
	public final MCNumberPermColumn data_cnt = createNumberColumn(_data_cnt);
	
	/**
	 * ダウンロード日時. Download date and time.<p>
	 *
	 */
	public static final String $dl_tm = "dl_tm";
	private static final MCPermColumnInfo _dl_tm = createColumnInfo("dl_tm");
	public final MCDatePermColumn dl_tm = createDateColumn(_dl_tm);
	
	/**
	 * 出力先. Output destination.<p>
	 *
	 */
	public static final String $dl_file_path = "dl_file_path";
	private static final MCPermColumnInfo _dl_file_path = createColumnInfo("dl_file_path");
	public final MCStringPermColumn dl_file_path = createStringColumn(_dl_file_path);
	
	/**
	 * ファイル名. File name.<p>
	 *
	 */
	public static final String $dl_file_nm = "dl_file_nm";
	private static final MCPermColumnInfo _dl_file_nm = createColumnInfo("dl_file_nm");
	public final MCStringPermColumn dl_file_nm = createStringColumn(_dl_file_nm);
	
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
	 * ファイル種類区分. File classification type.<p>
	 *
	 */
	public static final String $biz_dat_file_typ = "biz_dat_file_typ";
	private static final MCPermColumnInfo _biz_dat_file_typ = createColumnInfo("biz_dat_file_typ");
	public final MCStringPermColumn biz_dat_file_typ = createStringColumn(_biz_dat_file_typ);
	
	public static final MCMeta biz_dat_dl_hst_no_META = createCommonMeta($biz_dat_dl_hst_no, mcframe.commonMA.meta.MA_META.BIZ_DAT_DL_HST_NO);
	public static final MCMeta biz_dat_dl_sts_typ_META = createCommonMeta($biz_dat_dl_sts_typ, mcframe.commonMA.meta.MA_META.BIZ_DAT_DL_STS_TYP);
	public static final MCMeta proc_st_tm_META = createCommonMeta($proc_st_tm, mcframe.commonMA.meta.MA_META.TM);
	public static final MCMeta proc_end_tm_META = createCommonMeta($proc_end_tm, mcframe.commonMA.meta.MA_META.TM);
	public static final MCMeta biz_dat_id_META = createCommonMeta($biz_dat_id, mcframe.commonMA.meta.MA_META.BIZ_DAT_ID);
	public static final MCMeta biz_dat_dl_cond_META = createCommonMeta($biz_dat_dl_cond, mcframe.commonMA.meta.MA_META.BIZ_DAT_DL_COND);
	public static final MCMeta usr_cd_META = createCommonMeta($usr_cd, mcframe.commonMA.meta.MA_META.USR_CD);
	public static final MCMeta file_bin_META = createCommonMeta($file_bin, mcframe.commonMA.meta.MA_META.BIN);
	public static final MCMeta file_size_META = createCommonMeta($file_size, mcframe.commonMA.meta.MA_META.FILE_SIZE);
	public static final MCMeta data_cnt_META = createCommonMeta($data_cnt, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta dl_tm_META = createCommonMeta($dl_tm, mcframe.commonMA.meta.MA_META.TM);
	public static final MCMeta dl_file_path_META = createCommonMeta($dl_file_path, mcframe.commonMA.meta.MA_META.FILE_PATH);
	public static final MCMeta dl_file_nm_META = createCommonMeta($dl_file_nm, mcframe.commonMA.meta.MA_META.FILE_NM);
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
	public static final MCMeta biz_dat_file_typ_META = createCommonMeta($biz_dat_file_typ, mcframe.commonMA.meta.MA_META.BIZ_DAT_FILE_TYP);

	protected static final List<MCForeignInfo> FOREIGN_INFO_LIST = new ArrayList<>();
	static {
	}
	
	protected static final ConstMetaList<MAT_BIZ_DAT_DL_HST_R> constMetas = new ConstMetaList<MAT_BIZ_DAT_DL_HST_R>(
		MCDBContainer.constMetas,
		new MCMeta[]{
			biz_dat_dl_hst_no_META,
			biz_dat_dl_sts_typ_META,
			proc_st_tm_META,
			proc_end_tm_META,
			biz_dat_id_META,
			biz_dat_dl_cond_META,
			usr_cd_META,
			file_bin_META,
			file_size_META,
			data_cnt_META,
			dl_tm_META,
			dl_file_path_META,
			dl_file_nm_META,
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
			biz_dat_file_typ_META
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
	protected MAT_BIZ_DAT_DL_HST_R(ConstMetaList<? extends MAT_BIZ_DAT_DL_HST_R> metas, String alias) {
		super(metas, TABLE_TYPE, TABLE_NAME, alias, EX_CTRL, LCL_TABLE, FOREIGN_INFO_LIST);
		super.setColumnMap(getColumnMap());
	}

	protected MAT_BIZ_DAT_DL_HST_R(ConstMetaList<? extends MAT_BIZ_DAT_DL_HST_R> metas) {
		this(metas, TABLE_NAME);
	}

	protected LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> getColumnMap() {
		LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> COLUMN_MAP = new LinkedHashMap<>();
		COLUMN_MAP.put(
			MAT_BIZ_DAT_DL_HST_R.$biz_dat_dl_hst_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAT_BIZ_DAT_DL_HST_R.$biz_dat_dl_hst_no,
				"biz_dat_dl_hst_no",
				biz_dat_dl_hst_no,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAT_BIZ_DAT_DL_HST_R.$biz_dat_dl_sts_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAT_BIZ_DAT_DL_HST_R.$biz_dat_dl_sts_typ,
				"biz_dat_dl_sts_typ",
				biz_dat_dl_sts_typ,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAT_BIZ_DAT_DL_HST_R.$proc_st_tm,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MAT_BIZ_DAT_DL_HST_R.$proc_st_tm,
				"proc_st_tm",
				proc_st_tm,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAT_BIZ_DAT_DL_HST_R.$proc_end_tm,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MAT_BIZ_DAT_DL_HST_R.$proc_end_tm,
				"proc_end_tm",
				proc_end_tm,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAT_BIZ_DAT_DL_HST_R.$biz_dat_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAT_BIZ_DAT_DL_HST_R.$biz_dat_id,
				"biz_dat_id",
				biz_dat_id,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAT_BIZ_DAT_DL_HST_R.$biz_dat_dl_cond,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAT_BIZ_DAT_DL_HST_R.$biz_dat_dl_cond,
				"biz_dat_dl_cond",
				biz_dat_dl_cond,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAT_BIZ_DAT_DL_HST_R.$usr_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAT_BIZ_DAT_DL_HST_R.$usr_cd,
				"usr_cd",
				usr_cd,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAT_BIZ_DAT_DL_HST_R.$file_bin,
			new MCDBContainerColulmnInfo<MCBinaryPermColumn>(
				MCDataType.BINARY,
				MAT_BIZ_DAT_DL_HST_R.$file_bin,
				"file_bin",
				file_bin,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAT_BIZ_DAT_DL_HST_R.$file_size,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MAT_BIZ_DAT_DL_HST_R.$file_size,
				"file_size",
				file_size,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAT_BIZ_DAT_DL_HST_R.$data_cnt,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MAT_BIZ_DAT_DL_HST_R.$data_cnt,
				"data_cnt",
				data_cnt,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAT_BIZ_DAT_DL_HST_R.$dl_tm,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MAT_BIZ_DAT_DL_HST_R.$dl_tm,
				"dl_tm",
				dl_tm,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAT_BIZ_DAT_DL_HST_R.$dl_file_path,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAT_BIZ_DAT_DL_HST_R.$dl_file_path,
				"dl_file_path",
				dl_file_path,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAT_BIZ_DAT_DL_HST_R.$dl_file_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAT_BIZ_DAT_DL_HST_R.$dl_file_nm,
				"dl_file_nm",
				dl_file_nm,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAT_BIZ_DAT_DL_HST_R.$ins_usr_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAT_BIZ_DAT_DL_HST_R.$ins_usr_id,
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
			MAT_BIZ_DAT_DL_HST_R.$ins_usr_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAT_BIZ_DAT_DL_HST_R.$ins_usr_nm,
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
			MAT_BIZ_DAT_DL_HST_R.$ins_ts,
			new MCDBContainerColulmnInfo<MCTimestampPermColumn>(
				MCDataType.TIMESTAMP,
				MAT_BIZ_DAT_DL_HST_R.$ins_ts,
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
			MAT_BIZ_DAT_DL_HST_R.$ins_func_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAT_BIZ_DAT_DL_HST_R.$ins_func_id,
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
			MAT_BIZ_DAT_DL_HST_R.$upd_cntr,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MAT_BIZ_DAT_DL_HST_R.$upd_cntr,
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
			MAT_BIZ_DAT_DL_HST_R.$upd_usr_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAT_BIZ_DAT_DL_HST_R.$upd_usr_id,
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
			MAT_BIZ_DAT_DL_HST_R.$upd_usr_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAT_BIZ_DAT_DL_HST_R.$upd_usr_nm,
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
			MAT_BIZ_DAT_DL_HST_R.$upd_ts,
			new MCDBContainerColulmnInfo<MCTimestampPermColumn>(
				MCDataType.TIMESTAMP,
				MAT_BIZ_DAT_DL_HST_R.$upd_ts,
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
			MAT_BIZ_DAT_DL_HST_R.$upd_func_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAT_BIZ_DAT_DL_HST_R.$upd_func_id,
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
			MAT_BIZ_DAT_DL_HST_R.$upd_srv_req_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAT_BIZ_DAT_DL_HST_R.$upd_srv_req_no,
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
			MAT_BIZ_DAT_DL_HST_R.$biz_dat_file_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAT_BIZ_DAT_DL_HST_R.$biz_dat_file_typ,
				"biz_dat_file_typ",
				biz_dat_file_typ,
				false,
				true,
				false,
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
	public static MAT_BIZ_DAT_DL_HST_R create() {
		return create(TABLE_NAME);
	}

	/**
	 * 新しいRowを生成します。
	 *
	 * @return 新しいインスタンス
	 */
	public static MAT_BIZ_DAT_DL_HST_R create(String alias) {
		MAT_BIZ_DAT_DL_HST_R row = new MAT_BIZ_DAT_DL_HST_R(constMetas, alias);
		return row;
	}

	/**
	 * 新しいRowを生成し別のRowの内容を設定します。
	 *
	 * @param proto 設定するRow
	 * @return 内容を設定した新しいインスタンス
	 */
	public static <T extends MCRow> MAT_BIZ_DAT_DL_HST_R createByName(T proto) {
		MAT_BIZ_DAT_DL_HST_R row = MAT_BIZ_DAT_DL_HST_R.create();
		copyByName(row, proto);
		return row;
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MAT_BIZ_DAT_DL_HST_R clone() {
		return (MAT_BIZ_DAT_DL_HST_R) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MAT_BIZ_DAT_DL_HST_R createInstance() {
		return (MAT_BIZ_DAT_DL_HST_R) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MAT_BIZ_DAT_DL_HST_R getValues(String... names) {
		return (MAT_BIZ_DAT_DL_HST_R) super.getValues(names);
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
	 public MAW_BIZ_DAT_DL_HST_KEY_R getPkWorkDbc(String alias) {
	 	return MAW_BIZ_DAT_DL_HST_KEY_R.create(alias);
	 }

	/*
	 * MCDBContainerのオーバーライドメソッドです。
	 */
	 public MAW_BIZ_DAT_DL_HST_KEY_R getPkWorkDbc() {
	 	return getPkWorkDbc(MAW_BIZ_DAT_DL_HST_KEY_R.TABLE_NAME);
	 }

	/**
	 * 業務データダウンロード実行履歴ＮＯ. Business data download execution history No..<p>
	 *
	 */
	public String biz_dat_dl_hst_no() {
		return getConstString(offset + 0, $biz_dat_dl_hst_no);
	}

	/**
	 * 業務データダウンロード実行履歴ＮＯ. Business data download execution history No..<p>
	 *
	 */
	public void biz_dat_dl_hst_no(String value) {
		setConstString(offset + 0, $biz_dat_dl_hst_no, value);
	}

	/**
	 * 業務データダウンロード実行状況区分. Business data download execution status type.<p>
	 *
	 */
	public String biz_dat_dl_sts_typ() {
		return getConstString(offset + 1, $biz_dat_dl_sts_typ);
	}

	/**
	 * 業務データダウンロード実行状況区分. Business data download execution status type.<p>
	 *
	 */
	public void biz_dat_dl_sts_typ(String value) {
		setConstString(offset + 1, $biz_dat_dl_sts_typ, value);
	}

	/**
	 * 処理開始日時. Process start date and time.<p>
	 *
	 */
	public MCDate proc_st_tm() {
		return getConstDate(offset + 2, $proc_st_tm);
	}

	/**
	 * 処理開始日時. Process start date and time.<p>
	 *
	 */
	public void proc_st_tm(MCDate value) {
		setConstDate(offset + 2, $proc_st_tm, value);
	}

	/**
	 * 処理終了日時. Process end date.<p>
	 *
	 */
	public MCDate proc_end_tm() {
		return getConstDate(offset + 3, $proc_end_tm);
	}

	/**
	 * 処理終了日時. Process end date.<p>
	 *
	 */
	public void proc_end_tm(MCDate value) {
		setConstDate(offset + 3, $proc_end_tm, value);
	}

	/**
	 * 業務データＩＤ. Business data ID.<p>
	 *
	 */
	public String biz_dat_id() {
		return getConstString(offset + 4, $biz_dat_id);
	}

	/**
	 * 業務データＩＤ. Business data ID.<p>
	 *
	 */
	public void biz_dat_id(String value) {
		setConstString(offset + 4, $biz_dat_id, value);
	}

	/**
	 * 業務データダウンロード検索条件. Business data download search criteria.<p>
	 *
	 */
	public String biz_dat_dl_cond() {
		return getConstString(offset + 5, $biz_dat_dl_cond);
	}

	/**
	 * 業務データダウンロード検索条件. Business data download search criteria.<p>
	 *
	 */
	public void biz_dat_dl_cond(String value) {
		setConstString(offset + 5, $biz_dat_dl_cond, value);
	}

	/**
	 * 担当者ＣＤ. PIC cd..<p>
	 *
	 */
	public String usr_cd() {
		return getConstString(offset + 6, $usr_cd);
	}

	/**
	 * 担当者ＣＤ. PIC cd..<p>
	 *
	 */
	public void usr_cd(String value) {
		setConstString(offset + 6, $usr_cd, value);
	}

	/**
	 * ファイル. File.<p>
	 *
	 */
	public MCBinary file_bin() {
		return getConstBinary(offset + 7, $file_bin);
	}

	/**
	 * ファイル. File.<p>
	 *
	 */
	public void file_bin(MCBinary value) {
		setConstBinary(offset + 7, $file_bin, value);
	}

	/**
	 * ファイル容量. File capacity.<p>
	 *
	 */
	public MCNumber file_size() {
		return getConstNumber(offset + 8, $file_size);
	}

	/**
	 * ファイル容量. File capacity.<p>
	 *
	 */
	public void file_size(MCNumber value) {
		setConstNumber(offset + 8, $file_size, value);
	}
	
	/**
	 * ファイル容量. File capacity.<p>
	 *
	 */
	public void file_size(int value) {
		setConstNumber(offset + 8, $file_size, value);
	}
	
	/**
	 * ファイル容量. File capacity.<p>
	 *
	 */
	public void file_size(long value) {
		setConstNumber(offset + 8, $file_size, value);
	}
	
	/**
	 * ファイル容量. File capacity.<p>
	 *
	 */
	public void file_size(float value) {
		setConstNumber(offset + 8, $file_size, value);
	}
	
	/**
	 * ファイル容量. File capacity.<p>
	 *
	 */
	public void file_size(double value) {
		setConstNumber(offset + 8, $file_size, value);
	}
	
	/**
	 * データ件数. Number of data items.<p>
	 *
	 */
	public MCNumber data_cnt() {
		return getConstNumber(offset + 9, $data_cnt);
	}

	/**
	 * データ件数. Number of data items.<p>
	 *
	 */
	public void data_cnt(MCNumber value) {
		setConstNumber(offset + 9, $data_cnt, value);
	}
	
	/**
	 * データ件数. Number of data items.<p>
	 *
	 */
	public void data_cnt(int value) {
		setConstNumber(offset + 9, $data_cnt, value);
	}
	
	/**
	 * データ件数. Number of data items.<p>
	 *
	 */
	public void data_cnt(long value) {
		setConstNumber(offset + 9, $data_cnt, value);
	}
	
	/**
	 * データ件数. Number of data items.<p>
	 *
	 */
	public void data_cnt(float value) {
		setConstNumber(offset + 9, $data_cnt, value);
	}
	
	/**
	 * データ件数. Number of data items.<p>
	 *
	 */
	public void data_cnt(double value) {
		setConstNumber(offset + 9, $data_cnt, value);
	}
	
	/**
	 * ダウンロード日時. Download date and time.<p>
	 *
	 */
	public MCDate dl_tm() {
		return getConstDate(offset + 10, $dl_tm);
	}

	/**
	 * ダウンロード日時. Download date and time.<p>
	 *
	 */
	public void dl_tm(MCDate value) {
		setConstDate(offset + 10, $dl_tm, value);
	}

	/**
	 * 出力先. Output destination.<p>
	 *
	 */
	public String dl_file_path() {
		return getConstString(offset + 11, $dl_file_path);
	}

	/**
	 * 出力先. Output destination.<p>
	 *
	 */
	public void dl_file_path(String value) {
		setConstString(offset + 11, $dl_file_path, value);
	}

	/**
	 * ファイル名. File name.<p>
	 *
	 */
	public String dl_file_nm() {
		return getConstString(offset + 12, $dl_file_nm);
	}

	/**
	 * ファイル名. File name.<p>
	 *
	 */
	public void dl_file_nm(String value) {
		setConstString(offset + 12, $dl_file_nm, value);
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

	/**
	 * ファイル種類区分. File classification type.<p>
	 *
	 */
	public String biz_dat_file_typ() {
		return getConstString(offset + 23, $biz_dat_file_typ);
	}

	/**
	 * ファイル種類区分. File classification type.<p>
	 *
	 */
	public void biz_dat_file_typ(String value) {
		setConstString(offset + 23, $biz_dat_file_typ, value);
	}

	public String getString(String name) {
		if ($biz_dat_dl_hst_no.equalsIgnoreCase(name)) {
			return biz_dat_dl_hst_no();
		}
		if ($biz_dat_dl_sts_typ.equalsIgnoreCase(name)) {
			return biz_dat_dl_sts_typ();
		}
		if ($biz_dat_id.equalsIgnoreCase(name)) {
			return biz_dat_id();
		}
		if ($biz_dat_dl_cond.equalsIgnoreCase(name)) {
			return biz_dat_dl_cond();
		}
		if ($usr_cd.equalsIgnoreCase(name)) {
			return usr_cd();
		}
		if ($dl_file_path.equalsIgnoreCase(name)) {
			return dl_file_path();
		}
		if ($dl_file_nm.equalsIgnoreCase(name)) {
			return dl_file_nm();
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
		if ($biz_dat_file_typ.equalsIgnoreCase(name)) {
			return biz_dat_file_typ();
		}
		return super.getString(name);
	}

	public MCNumber getNumber(String name) {
		if ($file_size.equalsIgnoreCase(name)) {
			return file_size();
		}
		if ($data_cnt.equalsIgnoreCase(name)) {
			return data_cnt();
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			return upd_cntr();
		}
		return super.getNumber(name);
	}

	public MCDate getDate(String name) {
		if ($proc_st_tm.equalsIgnoreCase(name)) {
			return proc_st_tm();
		}
		if ($proc_end_tm.equalsIgnoreCase(name)) {
			return proc_end_tm();
		}
		if ($dl_tm.equalsIgnoreCase(name)) {
			return dl_tm();
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

	public MCBinary getBinary(String name) {
		if ($file_bin.equalsIgnoreCase(name)) {
			return file_bin();
		}
		return super.getBinary(name);
	}

	public String getStringNE(String name) {
		if ($biz_dat_dl_hst_no.equalsIgnoreCase(name)) {
			return biz_dat_dl_hst_no();
		}
		if ($biz_dat_dl_sts_typ.equalsIgnoreCase(name)) {
			return biz_dat_dl_sts_typ();
		}
		if ($biz_dat_id.equalsIgnoreCase(name)) {
			return biz_dat_id();
		}
		if ($biz_dat_dl_cond.equalsIgnoreCase(name)) {
			return biz_dat_dl_cond();
		}
		if ($usr_cd.equalsIgnoreCase(name)) {
			return usr_cd();
		}
		if ($dl_file_path.equalsIgnoreCase(name)) {
			return dl_file_path();
		}
		if ($dl_file_nm.equalsIgnoreCase(name)) {
			return dl_file_nm();
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
		if ($biz_dat_file_typ.equalsIgnoreCase(name)) {
			return biz_dat_file_typ();
		}
		return super.getStringNE(name);
	}

	public MCNumber getNumberNE(String name) {
		if ($file_size.equalsIgnoreCase(name)) {
			return file_size();
		}
		if ($data_cnt.equalsIgnoreCase(name)) {
			return data_cnt();
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			return upd_cntr();
		}
		return super.getNumberNE(name);
	}

	public MCDate getDateNE(String name) {
		if ($proc_st_tm.equalsIgnoreCase(name)) {
			return proc_st_tm();
		}
		if ($proc_end_tm.equalsIgnoreCase(name)) {
			return proc_end_tm();
		}
		if ($dl_tm.equalsIgnoreCase(name)) {
			return dl_tm();
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

	public MCBinary getBinaryNE(String name) {
		if ($file_bin.equalsIgnoreCase(name)) {
			return file_bin();
		}
		return super.getBinaryNE(name);
	}

	public void setString(String name, String value) {
		if ($biz_dat_dl_hst_no.equalsIgnoreCase(name)) {
			biz_dat_dl_hst_no(value);
			return;
		}
		if ($biz_dat_dl_sts_typ.equalsIgnoreCase(name)) {
			biz_dat_dl_sts_typ(value);
			return;
		}
		if ($biz_dat_id.equalsIgnoreCase(name)) {
			biz_dat_id(value);
			return;
		}
		if ($biz_dat_dl_cond.equalsIgnoreCase(name)) {
			biz_dat_dl_cond(value);
			return;
		}
		if ($usr_cd.equalsIgnoreCase(name)) {
			usr_cd(value);
			return;
		}
		if ($dl_file_path.equalsIgnoreCase(name)) {
			dl_file_path(value);
			return;
		}
		if ($dl_file_nm.equalsIgnoreCase(name)) {
			dl_file_nm(value);
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
		if ($biz_dat_file_typ.equalsIgnoreCase(name)) {
			biz_dat_file_typ(value);
			return;
		}
		super.setString(name, value);
	}

	public void setNumber(String name, MCNumber value) {
		if ($file_size.equalsIgnoreCase(name)) {
			file_size(value);
			return;
		}
		if ($data_cnt.equalsIgnoreCase(name)) {
			data_cnt(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, int value) {
		if ($file_size.equalsIgnoreCase(name)) {
			file_size(value);
			return;
		}
		if ($data_cnt.equalsIgnoreCase(name)) {
			data_cnt(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, long value) {
		if ($file_size.equalsIgnoreCase(name)) {
			file_size(value);
			return;
		}
		if ($data_cnt.equalsIgnoreCase(name)) {
			data_cnt(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, float value) {
		if ($file_size.equalsIgnoreCase(name)) {
			file_size(value);
			return;
		}
		if ($data_cnt.equalsIgnoreCase(name)) {
			data_cnt(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, double value) {
		if ($file_size.equalsIgnoreCase(name)) {
			file_size(value);
			return;
		}
		if ($data_cnt.equalsIgnoreCase(name)) {
			data_cnt(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setDate(String name, MCDate value) {
		if ($proc_st_tm.equalsIgnoreCase(name)) {
			proc_st_tm(value);
			return;
		}
		if ($proc_end_tm.equalsIgnoreCase(name)) {
			proc_end_tm(value);
			return;
		}
		if ($dl_tm.equalsIgnoreCase(name)) {
			dl_tm(value);
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

	public void setBinary(String name, MCBinary value) {
		if ($file_bin.equalsIgnoreCase(name)) {
			file_bin(value);
			return;
		}
		super.setBinary(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($biz_dat_dl_hst_no.equalsIgnoreCase(name)) {
			biz_dat_dl_hst_no(value);
			return;
		}
		if ($biz_dat_dl_sts_typ.equalsIgnoreCase(name)) {
			biz_dat_dl_sts_typ(value);
			return;
		}
		if ($biz_dat_id.equalsIgnoreCase(name)) {
			biz_dat_id(value);
			return;
		}
		if ($biz_dat_dl_cond.equalsIgnoreCase(name)) {
			biz_dat_dl_cond(value);
			return;
		}
		if ($usr_cd.equalsIgnoreCase(name)) {
			usr_cd(value);
			return;
		}
		if ($dl_file_path.equalsIgnoreCase(name)) {
			dl_file_path(value);
			return;
		}
		if ($dl_file_nm.equalsIgnoreCase(name)) {
			dl_file_nm(value);
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
		if ($biz_dat_file_typ.equalsIgnoreCase(name)) {
			biz_dat_file_typ(value);
			return;
		}
		super.setStringNE(name, value);
	}

	public void setNumberNE(String name, MCNumber value) {
		if ($file_size.equalsIgnoreCase(name)) {
			file_size(value);
			return;
		}
		if ($data_cnt.equalsIgnoreCase(name)) {
			data_cnt(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, int value) {
		if ($file_size.equalsIgnoreCase(name)) {
			file_size(value);
			return;
		}
		if ($data_cnt.equalsIgnoreCase(name)) {
			data_cnt(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, long value) {
		if ($file_size.equalsIgnoreCase(name)) {
			file_size(value);
			return;
		}
		if ($data_cnt.equalsIgnoreCase(name)) {
			data_cnt(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, float value) {
		if ($file_size.equalsIgnoreCase(name)) {
			file_size(value);
			return;
		}
		if ($data_cnt.equalsIgnoreCase(name)) {
			data_cnt(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, double value) {
		if ($file_size.equalsIgnoreCase(name)) {
			file_size(value);
			return;
		}
		if ($data_cnt.equalsIgnoreCase(name)) {
			data_cnt(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setDateNE(String name, MCDate value) {
		if ($proc_st_tm.equalsIgnoreCase(name)) {
			proc_st_tm(value);
			return;
		}
		if ($proc_end_tm.equalsIgnoreCase(name)) {
			proc_end_tm(value);
			return;
		}
		if ($dl_tm.equalsIgnoreCase(name)) {
			dl_tm(value);
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

	public void setBinaryNE(String name, MCBinary value) {
		if ($file_bin.equalsIgnoreCase(name)) {
			file_bin(value);
			return;
		}
		super.setBinaryNE(name, value);
	}

}
