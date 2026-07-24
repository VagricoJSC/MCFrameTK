package mcframe.clientMBBE.MBBEP0030;

import java.util.List;
import java.util.Map;
import java.util.Set;
import mcframe.commonCore.container.MCExtMap;
import mcframe.commonCore.container.MCExtList;
import mcframe.clientCore.container.MCKeyList;
import mcframe.clientCore.container.MCConstRow;
import mcframe.commonCore.container.MCRow;
import mcframe.commonCore.container.MCContainerMeta;
import mcframe.commonCore.meta.MCMeta;
import mcframe.commonCore.lang.MCNumber;
import mcframe.commonCore.lang.MCDate;
import mcframe.commonCore.lang.MCTimestamp;
import mcframe.commonCore.lang.MCDataType;
import mcframe.commonCore.lang.MCBinary;

/**
 * ブロック"Rslt"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class RsltR_MC_A extends MCConstRow {

	/**
	 * Business data ID 業務データＩＤ.<p>
	 *
	 */
	public static final String $biz_dat_id = "biz_dat_id";
	/**
	 * Business data name 業務データ名.<p>
	 *
	 */
	public static final String $biz_dat_nm = "biz_dat_nm";
	/**
	 * Business data acquisition type 業務データ取得区分.<p>
	 *
	 */
	public static final String $biz_dat_get_typ = "biz_dat_get_typ";
	/**
	 * Report form name 帳票フォーム名.<p>
	 *
	 */
	public static final String $form_file_nm = "form_file_nm";
	/**
	 * Cartridge カートリッジ.<p>
	 *
	 */
	public static final String $cartridge = "cartridge";
	/**
	 * Output report 帳票出力.<p>
	 *
	 */
	public static final String $print_flg = "print_flg";
	/**
	 * Download report 帳票をダウンロードする.<p>
	 *
	 */
	public static final String $dwnld_flg = "dwnld_flg";
	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public static final String $ins_usr_id = "ins_usr_id";
	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public static final String $ins_usr_nm = "ins_usr_nm";
	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public static final String $ins_ts = "ins_ts";
	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public static final String $ins_func_id = "ins_func_id";
	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public static final String $ins_func_nm = "ins_func_nm";
	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public static final String $upd_usr_id = "upd_usr_id";
	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public static final String $upd_usr_nm = "upd_usr_nm";
	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public static final String $upd_ts = "upd_ts";
	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public static final String $upd_func_id = "upd_func_id";
	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public static final String $upd_func_nm = "upd_func_nm";
	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public static final String $upd_srv_req_no = "upd_srv_req_no";
	/**
	 * String condition list 文字列条件リスト.<p>
	 *
	 */
	public static final String $str_cnd_list = "str_cnd_list";
	/**
	 * Remarks 1 備考１.<p>
	 *
	 */
	public static final String $biz_dat_rmrks1 = "biz_dat_rmrks1";
	/**
	 * Remarks 2 備考２.<p>
	 *
	 */
	public static final String $biz_dat_rmrks2 = "biz_dat_rmrks2";
	/**
	 * Remarks 3 備考３.<p>
	 *
	 */
	public static final String $biz_dat_rmrks3 = "biz_dat_rmrks3";
	/**
	 * Date condition column 1 日付条件項目１.<p>
	 *
	 */
	public static final String $dt_cond_col1 = "dt_cond_col1";
	/**
	 * Date condition column 2 日付条件項目２.<p>
	 *
	 */
	public static final String $dt_cond_col2 = "dt_cond_col2";
	/**
	 * Date condition column 3 日付条件項目３.<p>
	 *
	 */
	public static final String $dt_cond_col3 = "dt_cond_col3";
	/**
	 * Date condition column 4 日付条件項目４.<p>
	 *
	 */
	public static final String $dt_cond_col4 = "dt_cond_col4";
	/**
	 * Date condition column 5 日付条件項目５.<p>
	 *
	 */
	public static final String $dt_cond_col5 = "dt_cond_col5";
	/**
	 * Date condition column 6 日付条件項目６.<p>
	 *
	 */
	public static final String $dt_cond_col6 = "dt_cond_col6";
	/**
	 * Date condition column 7 日付条件項目７.<p>
	 *
	 */
	public static final String $dt_cond_col7 = "dt_cond_col7";
	/**
	 * Date condition column 8 日付条件項目８.<p>
	 *
	 */
	public static final String $dt_cond_col8 = "dt_cond_col8";
	/**
	 * Date condition column 9 日付条件項目９.<p>
	 *
	 */
	public static final String $dt_cond_col9 = "dt_cond_col9";
	/**
	 * Date condition column 10 日付条件項目１０.<p>
	 *
	 */
	public static final String $dt_cond_col10 = "dt_cond_col10";
	/**
	 * String condition column 1 文字列条件項目１.<p>
	 *
	 */
	public static final String $str_cond_col1 = "str_cond_col1";
	/**
	 * String condition column 2 文字列条件項目２.<p>
	 *
	 */
	public static final String $str_cond_col2 = "str_cond_col2";
	/**
	 * String condition column 3 文字列条件項目３.<p>
	 *
	 */
	public static final String $str_cond_col3 = "str_cond_col3";
	/**
	 * String condition column 4 文字列条件項目４.<p>
	 *
	 */
	public static final String $str_cond_col4 = "str_cond_col4";
	/**
	 * String condition column 5 文字列条件項目５.<p>
	 *
	 */
	public static final String $str_cond_col5 = "str_cond_col5";
	/**
	 * Numerical condition column 1 数値条件項目１.<p>
	 *
	 */
	public static final String $num_cond_col1 = "num_cond_col1";
	/**
	 * Numerical condition column 2 数値条件項目２.<p>
	 *
	 */
	public static final String $num_cond_col2 = "num_cond_col2";
	/**
	 * Numerical condition column 3 数値条件項目３.<p>
	 *
	 */
	public static final String $num_cond_col3 = "num_cond_col3";
	/**
	 * Numerical condition column 4 数値条件項目４.<p>
	 *
	 */
	public static final String $num_cond_col4 = "num_cond_col4";
	/**
	 * Numerical condition column 5 数値条件項目５.<p>
	 *
	 */
	public static final String $num_cond_col5 = "num_cond_col5";
	/**
	 * Flg. criteria column 1 フラグ条件項目１.<p>
	 *
	 */
	public static final String $flg_cond_col1 = "flg_cond_col1";
	/**
	 * Flg. criteria column 2 フラグ条件項目２.<p>
	 *
	 */
	public static final String $flg_cond_col2 = "flg_cond_col2";
	/**
	 * Flg. criteria column 3 フラグ条件項目３.<p>
	 *
	 */
	public static final String $flg_cond_col3 = "flg_cond_col3";
	/**
	 * Flg. criteria column 4 フラグ条件項目４.<p>
	 *
	 */
	public static final String $flg_cond_col4 = "flg_cond_col4";
	/**
	 * Flg. criteria column 5 フラグ条件項目５.<p>
	 *
	 */
	public static final String $flg_cond_col5 = "flg_cond_col5";
	/**
	 * Date condition label 1 日付条件ラベル１.<p>
	 *
	 */
	public static final String $dt_lbl1 = "dt_lbl1";
	/**
	 * Date condition label 2 日付条件ラベル２.<p>
	 *
	 */
	public static final String $dt_lbl2 = "dt_lbl2";
	/**
	 * Date condition label 3 日付条件ラベル３.<p>
	 *
	 */
	public static final String $dt_lbl3 = "dt_lbl3";
	/**
	 * Date condition label 4 日付条件ラベル４.<p>
	 *
	 */
	public static final String $dt_lbl4 = "dt_lbl4";
	/**
	 * Date condition label 5 日付条件ラベル５.<p>
	 *
	 */
	public static final String $dt_lbl5 = "dt_lbl5";
	/**
	 * Date condition label 6 日付条件ラベル６.<p>
	 *
	 */
	public static final String $dt_lbl6 = "dt_lbl6";
	/**
	 * Date condition label 7 日付条件ラベル７.<p>
	 *
	 */
	public static final String $dt_lbl7 = "dt_lbl7";
	/**
	 * Date condition label 8 日付条件ラベル８.<p>
	 *
	 */
	public static final String $dt_lbl8 = "dt_lbl8";
	/**
	 * Date condition label 9 日付条件ラベル９.<p>
	 *
	 */
	public static final String $dt_lbl9 = "dt_lbl9";
	/**
	 * Date condition label 10 日付条件ラベル１０.<p>
	 *
	 */
	public static final String $dt_lbl10 = "dt_lbl10";
	/**
	 * String condition label 1 文字列条件ラベル１.<p>
	 *
	 */
	public static final String $str_lbl1 = "str_lbl1";
	/**
	 * String condition label 2 文字列条件ラベル２.<p>
	 *
	 */
	public static final String $str_lbl2 = "str_lbl2";
	/**
	 * String condition label 3 文字列条件ラベル３.<p>
	 *
	 */
	public static final String $str_lbl3 = "str_lbl3";
	/**
	 * String condition label 4 文字列条件ラベル４.<p>
	 *
	 */
	public static final String $str_lbl4 = "str_lbl4";
	/**
	 * String condition label 5 文字列条件ラベル５.<p>
	 *
	 */
	public static final String $str_lbl5 = "str_lbl5";
	/**
	 * Numerical condition label 1 数値条件ラベル１.<p>
	 *
	 */
	public static final String $num_lbl1 = "num_lbl1";
	/**
	 * Numerical condition label 2 数値条件ラベル２.<p>
	 *
	 */
	public static final String $num_lbl2 = "num_lbl2";
	/**
	 * Numerical condition label 3 数値条件ラベル３.<p>
	 *
	 */
	public static final String $num_lbl3 = "num_lbl3";
	/**
	 * Numerical condition label 4 数値条件ラベル４.<p>
	 *
	 */
	public static final String $num_lbl4 = "num_lbl4";
	/**
	 * Numerical condition label 5 数値条件ラベル５.<p>
	 *
	 */
	public static final String $num_lbl5 = "num_lbl5";
	/**
	 * Flg. criteria label 1 フラグ条件ラベル１.<p>
	 *
	 */
	public static final String $flg_lbl1 = "flg_lbl1";
	/**
	 * Flg. criteria label 2 フラグ条件ラベル２.<p>
	 *
	 */
	public static final String $flg_lbl2 = "flg_lbl2";
	/**
	 * Flg. criteria label 3 フラグ条件ラベル３.<p>
	 *
	 */
	public static final String $flg_lbl3 = "flg_lbl3";
	/**
	 * Flg. criteria label 4 フラグ条件ラベル４.<p>
	 *
	 */
	public static final String $flg_lbl4 = "flg_lbl4";
	/**
	 * Flg. criteria label 5 フラグ条件ラベル５.<p>
	 *
	 */
	public static final String $flg_lbl5 = "flg_lbl5";


	public static final MCMeta biz_dat_id_META = createCommonMeta($biz_dat_id, mcframe.commonMA.meta.MA_META.BIZ_DAT_ID);
	public static final MCMeta biz_dat_nm_META = createCommonMeta($biz_dat_nm, mcframe.commonMA.meta.MA_META.BIZ_DAT_NM);
	public static final MCMeta biz_dat_get_typ_META = createCommonMeta($biz_dat_get_typ, mcframe.commonMA.meta.MA_META.BIZ_DAT_GET_TYP);
	public static final MCMeta form_file_nm_META = createCommonMeta($form_file_nm, mcframe.commonMA.meta.MA_META.PRINT_FILE_NAME);
	public static final MCMeta cartridge_META = createCommonMeta($cartridge, mcframe.commonMA.meta.MA_META.CARTRIDGE);
	public static final MCMeta print_flg_META = createCommonMeta($print_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta dwnld_flg_META = createCommonMeta($dwnld_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta ins_usr_id_META = createCommonMeta($ins_usr_id, mcframe.commonMA.meta.MA_META.FCM_USR_ID);
	public static final MCMeta ins_usr_nm_META = createCommonMeta($ins_usr_nm, mcframe.commonMA.meta.MA_META.FCM_USR_NM);
	public static final MCMeta ins_ts_META = createCommonMeta($ins_ts, mcframe.commonMA.meta.MA_META.SYS_TS);
	public static final MCMeta ins_func_id_META = createCommonMeta($ins_func_id, mcframe.commonMA.meta.MA_META.FUNC_ID);
	public static final MCMeta ins_func_nm_META = createCommonMeta($ins_func_nm, mcframe.commonMA.meta.MA_META.FUNC_NM);
	public static final MCMeta upd_usr_id_META = createCommonMeta($upd_usr_id, mcframe.commonMA.meta.MA_META.FCM_USR_ID);
	public static final MCMeta upd_usr_nm_META = createCommonMeta($upd_usr_nm, mcframe.commonMA.meta.MA_META.FCM_USR_NM);
	public static final MCMeta upd_ts_META = createCommonMeta($upd_ts, mcframe.commonMA.meta.MA_META.SYS_TS);
	public static final MCMeta upd_func_id_META = createCommonMeta($upd_func_id, mcframe.commonMA.meta.MA_META.FUNC_ID);
	public static final MCMeta upd_func_nm_META = createCommonMeta($upd_func_nm, mcframe.commonMA.meta.MA_META.FUNC_NM);
	public static final MCMeta upd_srv_req_no_META = createCommonMeta($upd_srv_req_no, mcframe.commonMA.meta.MA_META.SRV_REQ_NO);
	public static final MCMeta str_cnd_list_META = createStringMeta($str_cnd_list);
	public static final MCMeta biz_dat_rmrks1_META = createCommonMeta($biz_dat_rmrks1, mcframe.commonMA.meta.MA_META.BIZ_DAT_RMRKS);
	public static final MCMeta biz_dat_rmrks2_META = createCommonMeta($biz_dat_rmrks2, mcframe.commonMA.meta.MA_META.BIZ_DAT_RMRKS);
	public static final MCMeta biz_dat_rmrks3_META = createCommonMeta($biz_dat_rmrks3, mcframe.commonMA.meta.MA_META.BIZ_DAT_RMRKS);
	public static final MCMeta dt_cond_col1_META = createCommonMeta($dt_cond_col1, mcframe.commonMA.meta.MA_META.COND_COL);
	public static final MCMeta dt_cond_col2_META = createCommonMeta($dt_cond_col2, mcframe.commonMA.meta.MA_META.COND_COL);
	public static final MCMeta dt_cond_col3_META = createCommonMeta($dt_cond_col3, mcframe.commonMA.meta.MA_META.COND_COL);
	public static final MCMeta dt_cond_col4_META = createCommonMeta($dt_cond_col4, mcframe.commonMA.meta.MA_META.COND_COL);
	public static final MCMeta dt_cond_col5_META = createCommonMeta($dt_cond_col5, mcframe.commonMA.meta.MA_META.COND_COL);
	public static final MCMeta dt_cond_col6_META = createCommonMeta($dt_cond_col6, mcframe.commonMA.meta.MA_META.COND_COL);
	public static final MCMeta dt_cond_col7_META = createCommonMeta($dt_cond_col7, mcframe.commonMA.meta.MA_META.COND_COL);
	public static final MCMeta dt_cond_col8_META = createCommonMeta($dt_cond_col8, mcframe.commonMA.meta.MA_META.COND_COL);
	public static final MCMeta dt_cond_col9_META = createCommonMeta($dt_cond_col9, mcframe.commonMA.meta.MA_META.COND_COL);
	public static final MCMeta dt_cond_col10_META = createCommonMeta($dt_cond_col10, mcframe.commonMA.meta.MA_META.COND_COL);
	public static final MCMeta str_cond_col1_META = createCommonMeta($str_cond_col1, mcframe.commonMA.meta.MA_META.COND_COL);
	public static final MCMeta str_cond_col2_META = createCommonMeta($str_cond_col2, mcframe.commonMA.meta.MA_META.COND_COL);
	public static final MCMeta str_cond_col3_META = createCommonMeta($str_cond_col3, mcframe.commonMA.meta.MA_META.COND_COL);
	public static final MCMeta str_cond_col4_META = createCommonMeta($str_cond_col4, mcframe.commonMA.meta.MA_META.COND_COL);
	public static final MCMeta str_cond_col5_META = createCommonMeta($str_cond_col5, mcframe.commonMA.meta.MA_META.COND_COL);
	public static final MCMeta num_cond_col1_META = createCommonMeta($num_cond_col1, mcframe.commonMA.meta.MA_META.COND_COL);
	public static final MCMeta num_cond_col2_META = createCommonMeta($num_cond_col2, mcframe.commonMA.meta.MA_META.COND_COL);
	public static final MCMeta num_cond_col3_META = createCommonMeta($num_cond_col3, mcframe.commonMA.meta.MA_META.COND_COL);
	public static final MCMeta num_cond_col4_META = createCommonMeta($num_cond_col4, mcframe.commonMA.meta.MA_META.COND_COL);
	public static final MCMeta num_cond_col5_META = createCommonMeta($num_cond_col5, mcframe.commonMA.meta.MA_META.COND_COL);
	public static final MCMeta flg_cond_col1_META = createCommonMeta($flg_cond_col1, mcframe.commonMA.meta.MA_META.COND_COL);
	public static final MCMeta flg_cond_col2_META = createCommonMeta($flg_cond_col2, mcframe.commonMA.meta.MA_META.COND_COL);
	public static final MCMeta flg_cond_col3_META = createCommonMeta($flg_cond_col3, mcframe.commonMA.meta.MA_META.COND_COL);
	public static final MCMeta flg_cond_col4_META = createCommonMeta($flg_cond_col4, mcframe.commonMA.meta.MA_META.COND_COL);
	public static final MCMeta flg_cond_col5_META = createCommonMeta($flg_cond_col5, mcframe.commonMA.meta.MA_META.COND_COL);
	public static final MCMeta dt_lbl1_META = createStringMeta($dt_lbl1);
	public static final MCMeta dt_lbl2_META = createStringMeta($dt_lbl2);
	public static final MCMeta dt_lbl3_META = createStringMeta($dt_lbl3);
	public static final MCMeta dt_lbl4_META = createStringMeta($dt_lbl4);
	public static final MCMeta dt_lbl5_META = createStringMeta($dt_lbl5);
	public static final MCMeta dt_lbl6_META = createStringMeta($dt_lbl6);
	public static final MCMeta dt_lbl7_META = createStringMeta($dt_lbl7);
	public static final MCMeta dt_lbl8_META = createStringMeta($dt_lbl8);
	public static final MCMeta dt_lbl9_META = createStringMeta($dt_lbl9);
	public static final MCMeta dt_lbl10_META = createStringMeta($dt_lbl10);
	public static final MCMeta str_lbl1_META = createStringMeta($str_lbl1);
	public static final MCMeta str_lbl2_META = createStringMeta($str_lbl2);
	public static final MCMeta str_lbl3_META = createStringMeta($str_lbl3);
	public static final MCMeta str_lbl4_META = createStringMeta($str_lbl4);
	public static final MCMeta str_lbl5_META = createStringMeta($str_lbl5);
	public static final MCMeta num_lbl1_META = createStringMeta($num_lbl1);
	public static final MCMeta num_lbl2_META = createStringMeta($num_lbl2);
	public static final MCMeta num_lbl3_META = createStringMeta($num_lbl3);
	public static final MCMeta num_lbl4_META = createStringMeta($num_lbl4);
	public static final MCMeta num_lbl5_META = createStringMeta($num_lbl5);
	public static final MCMeta flg_lbl1_META = createStringMeta($flg_lbl1);
	public static final MCMeta flg_lbl2_META = createStringMeta($flg_lbl2);
	public static final MCMeta flg_lbl3_META = createStringMeta($flg_lbl3);
	public static final MCMeta flg_lbl4_META = createStringMeta($flg_lbl4);
	public static final MCMeta flg_lbl5_META = createStringMeta($flg_lbl5);

	protected static final ConstMetaList<RsltR> constMetas = new ConstMetaList<RsltR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			biz_dat_id_META,
			biz_dat_nm_META,
			biz_dat_get_typ_META,
			form_file_nm_META,
			cartridge_META,
			print_flg_META,
			dwnld_flg_META,
			ins_usr_id_META,
			ins_usr_nm_META,
			ins_ts_META,
			ins_func_id_META,
			ins_func_nm_META,
			upd_usr_id_META,
			upd_usr_nm_META,
			upd_ts_META,
			upd_func_id_META,
			upd_func_nm_META,
			upd_srv_req_no_META,
			str_cnd_list_META,
			biz_dat_rmrks1_META,
			biz_dat_rmrks2_META,
			biz_dat_rmrks3_META,
			dt_cond_col1_META,
			dt_cond_col2_META,
			dt_cond_col3_META,
			dt_cond_col4_META,
			dt_cond_col5_META,
			dt_cond_col6_META,
			dt_cond_col7_META,
			dt_cond_col8_META,
			dt_cond_col9_META,
			dt_cond_col10_META,
			str_cond_col1_META,
			str_cond_col2_META,
			str_cond_col3_META,
			str_cond_col4_META,
			str_cond_col5_META,
			num_cond_col1_META,
			num_cond_col2_META,
			num_cond_col3_META,
			num_cond_col4_META,
			num_cond_col5_META,
			flg_cond_col1_META,
			flg_cond_col2_META,
			flg_cond_col3_META,
			flg_cond_col4_META,
			flg_cond_col5_META,
			dt_lbl1_META,
			dt_lbl2_META,
			dt_lbl3_META,
			dt_lbl4_META,
			dt_lbl5_META,
			dt_lbl6_META,
			dt_lbl7_META,
			dt_lbl8_META,
			dt_lbl9_META,
			dt_lbl10_META,
			str_lbl1_META,
			str_lbl2_META,
			str_lbl3_META,
			str_lbl4_META,
			str_lbl5_META,
			num_lbl1_META,
			num_lbl2_META,
			num_lbl3_META,
			num_lbl4_META,
			num_lbl5_META,
			flg_lbl1_META,
			flg_lbl2_META,
			flg_lbl3_META,
			flg_lbl4_META,
			flg_lbl5_META
		},
		new String[][]{
			{
			},
			{
			}
		}
	);

	/**
	 * "KEYS"グループのキー項目情報です。
	 */
	protected static final MCKeyList KEYS = new MCKeyList(
		null,
		new String[]{
		}
	);


	/**
	 * グループ毎に定義される項目属性情報です。
	 */
	protected static final MCExtMap EXTMAP = new MCExtMap(
		null
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
	 * "KEYS"グループのキー項目情報を返します。
	 */
	public MCKeyList getKeys(){
		return KEYS;
	}

	/**
	 * 指定グループの項目属性情報を返します。
	 */
	public Map<String, String> getExtMap(String aGroup){
		if(aGroup == null) return null;
		return EXTMAP.get(aGroup);
	}

	/**
	 * 指定グループの項目属性が登録された項目リストを返します。
	 */
	public MCKeyList getKeys(String aGroup){
		if(aGroup == null) return null;
		return new MCKeyList(EXTMAP.getKeyList(aGroup));
	}

	/**
	 * 項目属性のグループのSet情報を返します。
	 */
	public Set<String> getExtGroups(){
		Set<String> ret = EXTMAP.keySet();
		return ret;
	}

	/**
	 * コンストラクタです。
	 */
	protected RsltR_MC_A(ConstMetaList<? extends RsltR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public RsltR clone() {
		return (RsltR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public RsltR createInstance() {
		return (RsltR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public RsltR getValues(String... names) {
		return (RsltR) super.getValues(names);
	}



	/**
	 * Business data ID 業務データＩＤ.<p>
	 *
	 */
	public String biz_dat_id() {
		return getConstString(offset + 0, $biz_dat_id);
	}

	/**
	 * Business data ID 業務データＩＤ.<p>
	 *
	 */
	public void biz_dat_id(String value) {
		setConstString(offset + 0, $biz_dat_id, value);
	}


	/**
	 * Business data name 業務データ名.<p>
	 *
	 */
	public String biz_dat_nm() {
		return getConstString(offset + 1, $biz_dat_nm);
	}

	/**
	 * Business data name 業務データ名.<p>
	 *
	 */
	public void biz_dat_nm(String value) {
		setConstString(offset + 1, $biz_dat_nm, value);
	}


	/**
	 * Business data acquisition type 業務データ取得区分.<p>
	 *
	 */
	public String biz_dat_get_typ() {
		return getConstString(offset + 2, $biz_dat_get_typ);
	}

	/**
	 * Business data acquisition type 業務データ取得区分.<p>
	 *
	 */
	public void biz_dat_get_typ(String value) {
		setConstString(offset + 2, $biz_dat_get_typ, value);
	}


	/**
	 * Report form name 帳票フォーム名.<p>
	 *
	 */
	public String form_file_nm() {
		return getConstString(offset + 3, $form_file_nm);
	}

	/**
	 * Report form name 帳票フォーム名.<p>
	 *
	 */
	public void form_file_nm(String value) {
		setConstString(offset + 3, $form_file_nm, value);
	}


	/**
	 * Cartridge カートリッジ.<p>
	 *
	 */
	public String cartridge() {
		return getConstString(offset + 4, $cartridge);
	}

	/**
	 * Cartridge カートリッジ.<p>
	 *
	 */
	public void cartridge(String value) {
		setConstString(offset + 4, $cartridge, value);
	}


	/**
	 * Output report 帳票出力.<p>
	 *
	 */
	public boolean print_flg() {
		return getConstBoolean(offset + 5, $print_flg);
	}

	/**
	 * Output report 帳票出力.<p>
	 *
	 */
	public void print_flg(boolean value) {
		setConstBoolean(offset + 5, $print_flg, value);
	}


	/**
	 * Download report 帳票をダウンロードする.<p>
	 *
	 */
	public boolean dwnld_flg() {
		return getConstBoolean(offset + 6, $dwnld_flg);
	}

	/**
	 * Download report 帳票をダウンロードする.<p>
	 *
	 */
	public void dwnld_flg(boolean value) {
		setConstBoolean(offset + 6, $dwnld_flg, value);
	}


	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public String ins_usr_id() {
		return getConstString(offset + 7, $ins_usr_id);
	}

	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public void ins_usr_id(String value) {
		setConstString(offset + 7, $ins_usr_id, value);
	}


	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public String ins_usr_nm() {
		return getConstString(offset + 8, $ins_usr_nm);
	}

	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public void ins_usr_nm(String value) {
		setConstString(offset + 8, $ins_usr_nm, value);
	}


	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public MCTimestamp ins_ts() {
		return getConstTimestamp(offset + 9, $ins_ts);
	}

	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public void ins_ts(MCTimestamp value) {
		setConstTimestamp(offset + 9, $ins_ts, value);
	}


	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public String ins_func_id() {
		return getConstString(offset + 10, $ins_func_id);
	}

	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public void ins_func_id(String value) {
		setConstString(offset + 10, $ins_func_id, value);
	}


	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public String ins_func_nm() {
		return getConstString(offset + 11, $ins_func_nm);
	}

	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public void ins_func_nm(String value) {
		setConstString(offset + 11, $ins_func_nm, value);
	}


	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public String upd_usr_id() {
		return getConstString(offset + 12, $upd_usr_id);
	}

	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public void upd_usr_id(String value) {
		setConstString(offset + 12, $upd_usr_id, value);
	}


	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public String upd_usr_nm() {
		return getConstString(offset + 13, $upd_usr_nm);
	}

	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public void upd_usr_nm(String value) {
		setConstString(offset + 13, $upd_usr_nm, value);
	}


	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public MCTimestamp upd_ts() {
		return getConstTimestamp(offset + 14, $upd_ts);
	}

	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public void upd_ts(MCTimestamp value) {
		setConstTimestamp(offset + 14, $upd_ts, value);
	}


	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public String upd_func_id() {
		return getConstString(offset + 15, $upd_func_id);
	}

	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public void upd_func_id(String value) {
		setConstString(offset + 15, $upd_func_id, value);
	}


	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public String upd_func_nm() {
		return getConstString(offset + 16, $upd_func_nm);
	}

	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public void upd_func_nm(String value) {
		setConstString(offset + 16, $upd_func_nm, value);
	}


	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public String upd_srv_req_no() {
		return getConstString(offset + 17, $upd_srv_req_no);
	}

	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public void upd_srv_req_no(String value) {
		setConstString(offset + 17, $upd_srv_req_no, value);
	}


	/**
	 * String condition list 文字列条件リスト.<p>
	 *
	 */
	public String str_cnd_list() {
		return getConstString(offset + 18, $str_cnd_list);
	}

	/**
	 * String condition list 文字列条件リスト.<p>
	 *
	 */
	public void str_cnd_list(String value) {
		setConstString(offset + 18, $str_cnd_list, value);
	}


	/**
	 * Remarks 1 備考１.<p>
	 *
	 */
	public String biz_dat_rmrks1() {
		return getConstString(offset + 19, $biz_dat_rmrks1);
	}

	/**
	 * Remarks 1 備考１.<p>
	 *
	 */
	public void biz_dat_rmrks1(String value) {
		setConstString(offset + 19, $biz_dat_rmrks1, value);
	}


	/**
	 * Remarks 2 備考２.<p>
	 *
	 */
	public String biz_dat_rmrks2() {
		return getConstString(offset + 20, $biz_dat_rmrks2);
	}

	/**
	 * Remarks 2 備考２.<p>
	 *
	 */
	public void biz_dat_rmrks2(String value) {
		setConstString(offset + 20, $biz_dat_rmrks2, value);
	}


	/**
	 * Remarks 3 備考３.<p>
	 *
	 */
	public String biz_dat_rmrks3() {
		return getConstString(offset + 21, $biz_dat_rmrks3);
	}

	/**
	 * Remarks 3 備考３.<p>
	 *
	 */
	public void biz_dat_rmrks3(String value) {
		setConstString(offset + 21, $biz_dat_rmrks3, value);
	}


	/**
	 * Date condition column 1 日付条件項目１.<p>
	 *
	 */
	public String dt_cond_col1() {
		return getConstString(offset + 22, $dt_cond_col1);
	}

	/**
	 * Date condition column 1 日付条件項目１.<p>
	 *
	 */
	public void dt_cond_col1(String value) {
		setConstString(offset + 22, $dt_cond_col1, value);
	}


	/**
	 * Date condition column 2 日付条件項目２.<p>
	 *
	 */
	public String dt_cond_col2() {
		return getConstString(offset + 23, $dt_cond_col2);
	}

	/**
	 * Date condition column 2 日付条件項目２.<p>
	 *
	 */
	public void dt_cond_col2(String value) {
		setConstString(offset + 23, $dt_cond_col2, value);
	}


	/**
	 * Date condition column 3 日付条件項目３.<p>
	 *
	 */
	public String dt_cond_col3() {
		return getConstString(offset + 24, $dt_cond_col3);
	}

	/**
	 * Date condition column 3 日付条件項目３.<p>
	 *
	 */
	public void dt_cond_col3(String value) {
		setConstString(offset + 24, $dt_cond_col3, value);
	}


	/**
	 * Date condition column 4 日付条件項目４.<p>
	 *
	 */
	public String dt_cond_col4() {
		return getConstString(offset + 25, $dt_cond_col4);
	}

	/**
	 * Date condition column 4 日付条件項目４.<p>
	 *
	 */
	public void dt_cond_col4(String value) {
		setConstString(offset + 25, $dt_cond_col4, value);
	}


	/**
	 * Date condition column 5 日付条件項目５.<p>
	 *
	 */
	public String dt_cond_col5() {
		return getConstString(offset + 26, $dt_cond_col5);
	}

	/**
	 * Date condition column 5 日付条件項目５.<p>
	 *
	 */
	public void dt_cond_col5(String value) {
		setConstString(offset + 26, $dt_cond_col5, value);
	}


	/**
	 * Date condition column 6 日付条件項目６.<p>
	 *
	 */
	public String dt_cond_col6() {
		return getConstString(offset + 27, $dt_cond_col6);
	}

	/**
	 * Date condition column 6 日付条件項目６.<p>
	 *
	 */
	public void dt_cond_col6(String value) {
		setConstString(offset + 27, $dt_cond_col6, value);
	}


	/**
	 * Date condition column 7 日付条件項目７.<p>
	 *
	 */
	public String dt_cond_col7() {
		return getConstString(offset + 28, $dt_cond_col7);
	}

	/**
	 * Date condition column 7 日付条件項目７.<p>
	 *
	 */
	public void dt_cond_col7(String value) {
		setConstString(offset + 28, $dt_cond_col7, value);
	}


	/**
	 * Date condition column 8 日付条件項目８.<p>
	 *
	 */
	public String dt_cond_col8() {
		return getConstString(offset + 29, $dt_cond_col8);
	}

	/**
	 * Date condition column 8 日付条件項目８.<p>
	 *
	 */
	public void dt_cond_col8(String value) {
		setConstString(offset + 29, $dt_cond_col8, value);
	}


	/**
	 * Date condition column 9 日付条件項目９.<p>
	 *
	 */
	public String dt_cond_col9() {
		return getConstString(offset + 30, $dt_cond_col9);
	}

	/**
	 * Date condition column 9 日付条件項目９.<p>
	 *
	 */
	public void dt_cond_col9(String value) {
		setConstString(offset + 30, $dt_cond_col9, value);
	}


	/**
	 * Date condition column 10 日付条件項目１０.<p>
	 *
	 */
	public String dt_cond_col10() {
		return getConstString(offset + 31, $dt_cond_col10);
	}

	/**
	 * Date condition column 10 日付条件項目１０.<p>
	 *
	 */
	public void dt_cond_col10(String value) {
		setConstString(offset + 31, $dt_cond_col10, value);
	}


	/**
	 * String condition column 1 文字列条件項目１.<p>
	 *
	 */
	public String str_cond_col1() {
		return getConstString(offset + 32, $str_cond_col1);
	}

	/**
	 * String condition column 1 文字列条件項目１.<p>
	 *
	 */
	public void str_cond_col1(String value) {
		setConstString(offset + 32, $str_cond_col1, value);
	}


	/**
	 * String condition column 2 文字列条件項目２.<p>
	 *
	 */
	public String str_cond_col2() {
		return getConstString(offset + 33, $str_cond_col2);
	}

	/**
	 * String condition column 2 文字列条件項目２.<p>
	 *
	 */
	public void str_cond_col2(String value) {
		setConstString(offset + 33, $str_cond_col2, value);
	}


	/**
	 * String condition column 3 文字列条件項目３.<p>
	 *
	 */
	public String str_cond_col3() {
		return getConstString(offset + 34, $str_cond_col3);
	}

	/**
	 * String condition column 3 文字列条件項目３.<p>
	 *
	 */
	public void str_cond_col3(String value) {
		setConstString(offset + 34, $str_cond_col3, value);
	}


	/**
	 * String condition column 4 文字列条件項目４.<p>
	 *
	 */
	public String str_cond_col4() {
		return getConstString(offset + 35, $str_cond_col4);
	}

	/**
	 * String condition column 4 文字列条件項目４.<p>
	 *
	 */
	public void str_cond_col4(String value) {
		setConstString(offset + 35, $str_cond_col4, value);
	}


	/**
	 * String condition column 5 文字列条件項目５.<p>
	 *
	 */
	public String str_cond_col5() {
		return getConstString(offset + 36, $str_cond_col5);
	}

	/**
	 * String condition column 5 文字列条件項目５.<p>
	 *
	 */
	public void str_cond_col5(String value) {
		setConstString(offset + 36, $str_cond_col5, value);
	}


	/**
	 * Numerical condition column 1 数値条件項目１.<p>
	 *
	 */
	public String num_cond_col1() {
		return getConstString(offset + 37, $num_cond_col1);
	}

	/**
	 * Numerical condition column 1 数値条件項目１.<p>
	 *
	 */
	public void num_cond_col1(String value) {
		setConstString(offset + 37, $num_cond_col1, value);
	}


	/**
	 * Numerical condition column 2 数値条件項目２.<p>
	 *
	 */
	public String num_cond_col2() {
		return getConstString(offset + 38, $num_cond_col2);
	}

	/**
	 * Numerical condition column 2 数値条件項目２.<p>
	 *
	 */
	public void num_cond_col2(String value) {
		setConstString(offset + 38, $num_cond_col2, value);
	}


	/**
	 * Numerical condition column 3 数値条件項目３.<p>
	 *
	 */
	public String num_cond_col3() {
		return getConstString(offset + 39, $num_cond_col3);
	}

	/**
	 * Numerical condition column 3 数値条件項目３.<p>
	 *
	 */
	public void num_cond_col3(String value) {
		setConstString(offset + 39, $num_cond_col3, value);
	}


	/**
	 * Numerical condition column 4 数値条件項目４.<p>
	 *
	 */
	public String num_cond_col4() {
		return getConstString(offset + 40, $num_cond_col4);
	}

	/**
	 * Numerical condition column 4 数値条件項目４.<p>
	 *
	 */
	public void num_cond_col4(String value) {
		setConstString(offset + 40, $num_cond_col4, value);
	}


	/**
	 * Numerical condition column 5 数値条件項目５.<p>
	 *
	 */
	public String num_cond_col5() {
		return getConstString(offset + 41, $num_cond_col5);
	}

	/**
	 * Numerical condition column 5 数値条件項目５.<p>
	 *
	 */
	public void num_cond_col5(String value) {
		setConstString(offset + 41, $num_cond_col5, value);
	}


	/**
	 * Flg. criteria column 1 フラグ条件項目１.<p>
	 *
	 */
	public String flg_cond_col1() {
		return getConstString(offset + 42, $flg_cond_col1);
	}

	/**
	 * Flg. criteria column 1 フラグ条件項目１.<p>
	 *
	 */
	public void flg_cond_col1(String value) {
		setConstString(offset + 42, $flg_cond_col1, value);
	}


	/**
	 * Flg. criteria column 2 フラグ条件項目２.<p>
	 *
	 */
	public String flg_cond_col2() {
		return getConstString(offset + 43, $flg_cond_col2);
	}

	/**
	 * Flg. criteria column 2 フラグ条件項目２.<p>
	 *
	 */
	public void flg_cond_col2(String value) {
		setConstString(offset + 43, $flg_cond_col2, value);
	}


	/**
	 * Flg. criteria column 3 フラグ条件項目３.<p>
	 *
	 */
	public String flg_cond_col3() {
		return getConstString(offset + 44, $flg_cond_col3);
	}

	/**
	 * Flg. criteria column 3 フラグ条件項目３.<p>
	 *
	 */
	public void flg_cond_col3(String value) {
		setConstString(offset + 44, $flg_cond_col3, value);
	}


	/**
	 * Flg. criteria column 4 フラグ条件項目４.<p>
	 *
	 */
	public String flg_cond_col4() {
		return getConstString(offset + 45, $flg_cond_col4);
	}

	/**
	 * Flg. criteria column 4 フラグ条件項目４.<p>
	 *
	 */
	public void flg_cond_col4(String value) {
		setConstString(offset + 45, $flg_cond_col4, value);
	}


	/**
	 * Flg. criteria column 5 フラグ条件項目５.<p>
	 *
	 */
	public String flg_cond_col5() {
		return getConstString(offset + 46, $flg_cond_col5);
	}

	/**
	 * Flg. criteria column 5 フラグ条件項目５.<p>
	 *
	 */
	public void flg_cond_col5(String value) {
		setConstString(offset + 46, $flg_cond_col5, value);
	}


	/**
	 * Date condition label 1 日付条件ラベル１.<p>
	 *
	 */
	public String dt_lbl1() {
		return getConstString(offset + 47, $dt_lbl1);
	}

	/**
	 * Date condition label 1 日付条件ラベル１.<p>
	 *
	 */
	public void dt_lbl1(String value) {
		setConstString(offset + 47, $dt_lbl1, value);
	}


	/**
	 * Date condition label 2 日付条件ラベル２.<p>
	 *
	 */
	public String dt_lbl2() {
		return getConstString(offset + 48, $dt_lbl2);
	}

	/**
	 * Date condition label 2 日付条件ラベル２.<p>
	 *
	 */
	public void dt_lbl2(String value) {
		setConstString(offset + 48, $dt_lbl2, value);
	}


	/**
	 * Date condition label 3 日付条件ラベル３.<p>
	 *
	 */
	public String dt_lbl3() {
		return getConstString(offset + 49, $dt_lbl3);
	}

	/**
	 * Date condition label 3 日付条件ラベル３.<p>
	 *
	 */
	public void dt_lbl3(String value) {
		setConstString(offset + 49, $dt_lbl3, value);
	}


	/**
	 * Date condition label 4 日付条件ラベル４.<p>
	 *
	 */
	public String dt_lbl4() {
		return getConstString(offset + 50, $dt_lbl4);
	}

	/**
	 * Date condition label 4 日付条件ラベル４.<p>
	 *
	 */
	public void dt_lbl4(String value) {
		setConstString(offset + 50, $dt_lbl4, value);
	}


	/**
	 * Date condition label 5 日付条件ラベル５.<p>
	 *
	 */
	public String dt_lbl5() {
		return getConstString(offset + 51, $dt_lbl5);
	}

	/**
	 * Date condition label 5 日付条件ラベル５.<p>
	 *
	 */
	public void dt_lbl5(String value) {
		setConstString(offset + 51, $dt_lbl5, value);
	}


	/**
	 * Date condition label 6 日付条件ラベル６.<p>
	 *
	 */
	public String dt_lbl6() {
		return getConstString(offset + 52, $dt_lbl6);
	}

	/**
	 * Date condition label 6 日付条件ラベル６.<p>
	 *
	 */
	public void dt_lbl6(String value) {
		setConstString(offset + 52, $dt_lbl6, value);
	}


	/**
	 * Date condition label 7 日付条件ラベル７.<p>
	 *
	 */
	public String dt_lbl7() {
		return getConstString(offset + 53, $dt_lbl7);
	}

	/**
	 * Date condition label 7 日付条件ラベル７.<p>
	 *
	 */
	public void dt_lbl7(String value) {
		setConstString(offset + 53, $dt_lbl7, value);
	}


	/**
	 * Date condition label 8 日付条件ラベル８.<p>
	 *
	 */
	public String dt_lbl8() {
		return getConstString(offset + 54, $dt_lbl8);
	}

	/**
	 * Date condition label 8 日付条件ラベル８.<p>
	 *
	 */
	public void dt_lbl8(String value) {
		setConstString(offset + 54, $dt_lbl8, value);
	}


	/**
	 * Date condition label 9 日付条件ラベル９.<p>
	 *
	 */
	public String dt_lbl9() {
		return getConstString(offset + 55, $dt_lbl9);
	}

	/**
	 * Date condition label 9 日付条件ラベル９.<p>
	 *
	 */
	public void dt_lbl9(String value) {
		setConstString(offset + 55, $dt_lbl9, value);
	}


	/**
	 * Date condition label 10 日付条件ラベル１０.<p>
	 *
	 */
	public String dt_lbl10() {
		return getConstString(offset + 56, $dt_lbl10);
	}

	/**
	 * Date condition label 10 日付条件ラベル１０.<p>
	 *
	 */
	public void dt_lbl10(String value) {
		setConstString(offset + 56, $dt_lbl10, value);
	}


	/**
	 * String condition label 1 文字列条件ラベル１.<p>
	 *
	 */
	public String str_lbl1() {
		return getConstString(offset + 57, $str_lbl1);
	}

	/**
	 * String condition label 1 文字列条件ラベル１.<p>
	 *
	 */
	public void str_lbl1(String value) {
		setConstString(offset + 57, $str_lbl1, value);
	}


	/**
	 * String condition label 2 文字列条件ラベル２.<p>
	 *
	 */
	public String str_lbl2() {
		return getConstString(offset + 58, $str_lbl2);
	}

	/**
	 * String condition label 2 文字列条件ラベル２.<p>
	 *
	 */
	public void str_lbl2(String value) {
		setConstString(offset + 58, $str_lbl2, value);
	}


	/**
	 * String condition label 3 文字列条件ラベル３.<p>
	 *
	 */
	public String str_lbl3() {
		return getConstString(offset + 59, $str_lbl3);
	}

	/**
	 * String condition label 3 文字列条件ラベル３.<p>
	 *
	 */
	public void str_lbl3(String value) {
		setConstString(offset + 59, $str_lbl3, value);
	}


	/**
	 * String condition label 4 文字列条件ラベル４.<p>
	 *
	 */
	public String str_lbl4() {
		return getConstString(offset + 60, $str_lbl4);
	}

	/**
	 * String condition label 4 文字列条件ラベル４.<p>
	 *
	 */
	public void str_lbl4(String value) {
		setConstString(offset + 60, $str_lbl4, value);
	}


	/**
	 * String condition label 5 文字列条件ラベル５.<p>
	 *
	 */
	public String str_lbl5() {
		return getConstString(offset + 61, $str_lbl5);
	}

	/**
	 * String condition label 5 文字列条件ラベル５.<p>
	 *
	 */
	public void str_lbl5(String value) {
		setConstString(offset + 61, $str_lbl5, value);
	}


	/**
	 * Numerical condition label 1 数値条件ラベル１.<p>
	 *
	 */
	public String num_lbl1() {
		return getConstString(offset + 62, $num_lbl1);
	}

	/**
	 * Numerical condition label 1 数値条件ラベル１.<p>
	 *
	 */
	public void num_lbl1(String value) {
		setConstString(offset + 62, $num_lbl1, value);
	}


	/**
	 * Numerical condition label 2 数値条件ラベル２.<p>
	 *
	 */
	public String num_lbl2() {
		return getConstString(offset + 63, $num_lbl2);
	}

	/**
	 * Numerical condition label 2 数値条件ラベル２.<p>
	 *
	 */
	public void num_lbl2(String value) {
		setConstString(offset + 63, $num_lbl2, value);
	}


	/**
	 * Numerical condition label 3 数値条件ラベル３.<p>
	 *
	 */
	public String num_lbl3() {
		return getConstString(offset + 64, $num_lbl3);
	}

	/**
	 * Numerical condition label 3 数値条件ラベル３.<p>
	 *
	 */
	public void num_lbl3(String value) {
		setConstString(offset + 64, $num_lbl3, value);
	}


	/**
	 * Numerical condition label 4 数値条件ラベル４.<p>
	 *
	 */
	public String num_lbl4() {
		return getConstString(offset + 65, $num_lbl4);
	}

	/**
	 * Numerical condition label 4 数値条件ラベル４.<p>
	 *
	 */
	public void num_lbl4(String value) {
		setConstString(offset + 65, $num_lbl4, value);
	}


	/**
	 * Numerical condition label 5 数値条件ラベル５.<p>
	 *
	 */
	public String num_lbl5() {
		return getConstString(offset + 66, $num_lbl5);
	}

	/**
	 * Numerical condition label 5 数値条件ラベル５.<p>
	 *
	 */
	public void num_lbl5(String value) {
		setConstString(offset + 66, $num_lbl5, value);
	}


	/**
	 * Flg. criteria label 1 フラグ条件ラベル１.<p>
	 *
	 */
	public String flg_lbl1() {
		return getConstString(offset + 67, $flg_lbl1);
	}

	/**
	 * Flg. criteria label 1 フラグ条件ラベル１.<p>
	 *
	 */
	public void flg_lbl1(String value) {
		setConstString(offset + 67, $flg_lbl1, value);
	}


	/**
	 * Flg. criteria label 2 フラグ条件ラベル２.<p>
	 *
	 */
	public String flg_lbl2() {
		return getConstString(offset + 68, $flg_lbl2);
	}

	/**
	 * Flg. criteria label 2 フラグ条件ラベル２.<p>
	 *
	 */
	public void flg_lbl2(String value) {
		setConstString(offset + 68, $flg_lbl2, value);
	}


	/**
	 * Flg. criteria label 3 フラグ条件ラベル３.<p>
	 *
	 */
	public String flg_lbl3() {
		return getConstString(offset + 69, $flg_lbl3);
	}

	/**
	 * Flg. criteria label 3 フラグ条件ラベル３.<p>
	 *
	 */
	public void flg_lbl3(String value) {
		setConstString(offset + 69, $flg_lbl3, value);
	}


	/**
	 * Flg. criteria label 4 フラグ条件ラベル４.<p>
	 *
	 */
	public String flg_lbl4() {
		return getConstString(offset + 70, $flg_lbl4);
	}

	/**
	 * Flg. criteria label 4 フラグ条件ラベル４.<p>
	 *
	 */
	public void flg_lbl4(String value) {
		setConstString(offset + 70, $flg_lbl4, value);
	}


	/**
	 * Flg. criteria label 5 フラグ条件ラベル５.<p>
	 *
	 */
	public String flg_lbl5() {
		return getConstString(offset + 71, $flg_lbl5);
	}

	/**
	 * Flg. criteria label 5 フラグ条件ラベル５.<p>
	 *
	 */
	public void flg_lbl5(String value) {
		setConstString(offset + 71, $flg_lbl5, value);
	}


	public String getString(String name) {
		if ($biz_dat_id.equalsIgnoreCase(name)) {
			return biz_dat_id();
		}
		if ($biz_dat_nm.equalsIgnoreCase(name)) {
			return biz_dat_nm();
		}
		if ($biz_dat_get_typ.equalsIgnoreCase(name)) {
			return biz_dat_get_typ();
		}
		if ($form_file_nm.equalsIgnoreCase(name)) {
			return form_file_nm();
		}
		if ($cartridge.equalsIgnoreCase(name)) {
			return cartridge();
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
		if ($ins_func_nm.equalsIgnoreCase(name)) {
			return ins_func_nm();
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
		if ($upd_func_nm.equalsIgnoreCase(name)) {
			return upd_func_nm();
		}
		if ($upd_srv_req_no.equalsIgnoreCase(name)) {
			return upd_srv_req_no();
		}
		if ($str_cnd_list.equalsIgnoreCase(name)) {
			return str_cnd_list();
		}
		if ($biz_dat_rmrks1.equalsIgnoreCase(name)) {
			return biz_dat_rmrks1();
		}
		if ($biz_dat_rmrks2.equalsIgnoreCase(name)) {
			return biz_dat_rmrks2();
		}
		if ($biz_dat_rmrks3.equalsIgnoreCase(name)) {
			return biz_dat_rmrks3();
		}
		if ($dt_cond_col1.equalsIgnoreCase(name)) {
			return dt_cond_col1();
		}
		if ($dt_cond_col2.equalsIgnoreCase(name)) {
			return dt_cond_col2();
		}
		if ($dt_cond_col3.equalsIgnoreCase(name)) {
			return dt_cond_col3();
		}
		if ($dt_cond_col4.equalsIgnoreCase(name)) {
			return dt_cond_col4();
		}
		if ($dt_cond_col5.equalsIgnoreCase(name)) {
			return dt_cond_col5();
		}
		if ($dt_cond_col6.equalsIgnoreCase(name)) {
			return dt_cond_col6();
		}
		if ($dt_cond_col7.equalsIgnoreCase(name)) {
			return dt_cond_col7();
		}
		if ($dt_cond_col8.equalsIgnoreCase(name)) {
			return dt_cond_col8();
		}
		if ($dt_cond_col9.equalsIgnoreCase(name)) {
			return dt_cond_col9();
		}
		if ($dt_cond_col10.equalsIgnoreCase(name)) {
			return dt_cond_col10();
		}
		if ($str_cond_col1.equalsIgnoreCase(name)) {
			return str_cond_col1();
		}
		if ($str_cond_col2.equalsIgnoreCase(name)) {
			return str_cond_col2();
		}
		if ($str_cond_col3.equalsIgnoreCase(name)) {
			return str_cond_col3();
		}
		if ($str_cond_col4.equalsIgnoreCase(name)) {
			return str_cond_col4();
		}
		if ($str_cond_col5.equalsIgnoreCase(name)) {
			return str_cond_col5();
		}
		if ($num_cond_col1.equalsIgnoreCase(name)) {
			return num_cond_col1();
		}
		if ($num_cond_col2.equalsIgnoreCase(name)) {
			return num_cond_col2();
		}
		if ($num_cond_col3.equalsIgnoreCase(name)) {
			return num_cond_col3();
		}
		if ($num_cond_col4.equalsIgnoreCase(name)) {
			return num_cond_col4();
		}
		if ($num_cond_col5.equalsIgnoreCase(name)) {
			return num_cond_col5();
		}
		if ($flg_cond_col1.equalsIgnoreCase(name)) {
			return flg_cond_col1();
		}
		if ($flg_cond_col2.equalsIgnoreCase(name)) {
			return flg_cond_col2();
		}
		if ($flg_cond_col3.equalsIgnoreCase(name)) {
			return flg_cond_col3();
		}
		if ($flg_cond_col4.equalsIgnoreCase(name)) {
			return flg_cond_col4();
		}
		if ($flg_cond_col5.equalsIgnoreCase(name)) {
			return flg_cond_col5();
		}
		if ($dt_lbl1.equalsIgnoreCase(name)) {
			return dt_lbl1();
		}
		if ($dt_lbl2.equalsIgnoreCase(name)) {
			return dt_lbl2();
		}
		if ($dt_lbl3.equalsIgnoreCase(name)) {
			return dt_lbl3();
		}
		if ($dt_lbl4.equalsIgnoreCase(name)) {
			return dt_lbl4();
		}
		if ($dt_lbl5.equalsIgnoreCase(name)) {
			return dt_lbl5();
		}
		if ($dt_lbl6.equalsIgnoreCase(name)) {
			return dt_lbl6();
		}
		if ($dt_lbl7.equalsIgnoreCase(name)) {
			return dt_lbl7();
		}
		if ($dt_lbl8.equalsIgnoreCase(name)) {
			return dt_lbl8();
		}
		if ($dt_lbl9.equalsIgnoreCase(name)) {
			return dt_lbl9();
		}
		if ($dt_lbl10.equalsIgnoreCase(name)) {
			return dt_lbl10();
		}
		if ($str_lbl1.equalsIgnoreCase(name)) {
			return str_lbl1();
		}
		if ($str_lbl2.equalsIgnoreCase(name)) {
			return str_lbl2();
		}
		if ($str_lbl3.equalsIgnoreCase(name)) {
			return str_lbl3();
		}
		if ($str_lbl4.equalsIgnoreCase(name)) {
			return str_lbl4();
		}
		if ($str_lbl5.equalsIgnoreCase(name)) {
			return str_lbl5();
		}
		if ($num_lbl1.equalsIgnoreCase(name)) {
			return num_lbl1();
		}
		if ($num_lbl2.equalsIgnoreCase(name)) {
			return num_lbl2();
		}
		if ($num_lbl3.equalsIgnoreCase(name)) {
			return num_lbl3();
		}
		if ($num_lbl4.equalsIgnoreCase(name)) {
			return num_lbl4();
		}
		if ($num_lbl5.equalsIgnoreCase(name)) {
			return num_lbl5();
		}
		if ($flg_lbl1.equalsIgnoreCase(name)) {
			return flg_lbl1();
		}
		if ($flg_lbl2.equalsIgnoreCase(name)) {
			return flg_lbl2();
		}
		if ($flg_lbl3.equalsIgnoreCase(name)) {
			return flg_lbl3();
		}
		if ($flg_lbl4.equalsIgnoreCase(name)) {
			return flg_lbl4();
		}
		if ($flg_lbl5.equalsIgnoreCase(name)) {
			return flg_lbl5();
		}
		return super.getString(name);
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
		if ($print_flg.equalsIgnoreCase(name)) {
			return print_flg();
		}
		if ($dwnld_flg.equalsIgnoreCase(name)) {
			return dwnld_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($biz_dat_id.equalsIgnoreCase(name)) {
			return biz_dat_id();
		}
		if ($biz_dat_nm.equalsIgnoreCase(name)) {
			return biz_dat_nm();
		}
		if ($biz_dat_get_typ.equalsIgnoreCase(name)) {
			return biz_dat_get_typ();
		}
		if ($form_file_nm.equalsIgnoreCase(name)) {
			return form_file_nm();
		}
		if ($cartridge.equalsIgnoreCase(name)) {
			return cartridge();
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
		if ($ins_func_nm.equalsIgnoreCase(name)) {
			return ins_func_nm();
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
		if ($upd_func_nm.equalsIgnoreCase(name)) {
			return upd_func_nm();
		}
		if ($upd_srv_req_no.equalsIgnoreCase(name)) {
			return upd_srv_req_no();
		}
		if ($str_cnd_list.equalsIgnoreCase(name)) {
			return str_cnd_list();
		}
		if ($biz_dat_rmrks1.equalsIgnoreCase(name)) {
			return biz_dat_rmrks1();
		}
		if ($biz_dat_rmrks2.equalsIgnoreCase(name)) {
			return biz_dat_rmrks2();
		}
		if ($biz_dat_rmrks3.equalsIgnoreCase(name)) {
			return biz_dat_rmrks3();
		}
		if ($dt_cond_col1.equalsIgnoreCase(name)) {
			return dt_cond_col1();
		}
		if ($dt_cond_col2.equalsIgnoreCase(name)) {
			return dt_cond_col2();
		}
		if ($dt_cond_col3.equalsIgnoreCase(name)) {
			return dt_cond_col3();
		}
		if ($dt_cond_col4.equalsIgnoreCase(name)) {
			return dt_cond_col4();
		}
		if ($dt_cond_col5.equalsIgnoreCase(name)) {
			return dt_cond_col5();
		}
		if ($dt_cond_col6.equalsIgnoreCase(name)) {
			return dt_cond_col6();
		}
		if ($dt_cond_col7.equalsIgnoreCase(name)) {
			return dt_cond_col7();
		}
		if ($dt_cond_col8.equalsIgnoreCase(name)) {
			return dt_cond_col8();
		}
		if ($dt_cond_col9.equalsIgnoreCase(name)) {
			return dt_cond_col9();
		}
		if ($dt_cond_col10.equalsIgnoreCase(name)) {
			return dt_cond_col10();
		}
		if ($str_cond_col1.equalsIgnoreCase(name)) {
			return str_cond_col1();
		}
		if ($str_cond_col2.equalsIgnoreCase(name)) {
			return str_cond_col2();
		}
		if ($str_cond_col3.equalsIgnoreCase(name)) {
			return str_cond_col3();
		}
		if ($str_cond_col4.equalsIgnoreCase(name)) {
			return str_cond_col4();
		}
		if ($str_cond_col5.equalsIgnoreCase(name)) {
			return str_cond_col5();
		}
		if ($num_cond_col1.equalsIgnoreCase(name)) {
			return num_cond_col1();
		}
		if ($num_cond_col2.equalsIgnoreCase(name)) {
			return num_cond_col2();
		}
		if ($num_cond_col3.equalsIgnoreCase(name)) {
			return num_cond_col3();
		}
		if ($num_cond_col4.equalsIgnoreCase(name)) {
			return num_cond_col4();
		}
		if ($num_cond_col5.equalsIgnoreCase(name)) {
			return num_cond_col5();
		}
		if ($flg_cond_col1.equalsIgnoreCase(name)) {
			return flg_cond_col1();
		}
		if ($flg_cond_col2.equalsIgnoreCase(name)) {
			return flg_cond_col2();
		}
		if ($flg_cond_col3.equalsIgnoreCase(name)) {
			return flg_cond_col3();
		}
		if ($flg_cond_col4.equalsIgnoreCase(name)) {
			return flg_cond_col4();
		}
		if ($flg_cond_col5.equalsIgnoreCase(name)) {
			return flg_cond_col5();
		}
		if ($dt_lbl1.equalsIgnoreCase(name)) {
			return dt_lbl1();
		}
		if ($dt_lbl2.equalsIgnoreCase(name)) {
			return dt_lbl2();
		}
		if ($dt_lbl3.equalsIgnoreCase(name)) {
			return dt_lbl3();
		}
		if ($dt_lbl4.equalsIgnoreCase(name)) {
			return dt_lbl4();
		}
		if ($dt_lbl5.equalsIgnoreCase(name)) {
			return dt_lbl5();
		}
		if ($dt_lbl6.equalsIgnoreCase(name)) {
			return dt_lbl6();
		}
		if ($dt_lbl7.equalsIgnoreCase(name)) {
			return dt_lbl7();
		}
		if ($dt_lbl8.equalsIgnoreCase(name)) {
			return dt_lbl8();
		}
		if ($dt_lbl9.equalsIgnoreCase(name)) {
			return dt_lbl9();
		}
		if ($dt_lbl10.equalsIgnoreCase(name)) {
			return dt_lbl10();
		}
		if ($str_lbl1.equalsIgnoreCase(name)) {
			return str_lbl1();
		}
		if ($str_lbl2.equalsIgnoreCase(name)) {
			return str_lbl2();
		}
		if ($str_lbl3.equalsIgnoreCase(name)) {
			return str_lbl3();
		}
		if ($str_lbl4.equalsIgnoreCase(name)) {
			return str_lbl4();
		}
		if ($str_lbl5.equalsIgnoreCase(name)) {
			return str_lbl5();
		}
		if ($num_lbl1.equalsIgnoreCase(name)) {
			return num_lbl1();
		}
		if ($num_lbl2.equalsIgnoreCase(name)) {
			return num_lbl2();
		}
		if ($num_lbl3.equalsIgnoreCase(name)) {
			return num_lbl3();
		}
		if ($num_lbl4.equalsIgnoreCase(name)) {
			return num_lbl4();
		}
		if ($num_lbl5.equalsIgnoreCase(name)) {
			return num_lbl5();
		}
		if ($flg_lbl1.equalsIgnoreCase(name)) {
			return flg_lbl1();
		}
		if ($flg_lbl2.equalsIgnoreCase(name)) {
			return flg_lbl2();
		}
		if ($flg_lbl3.equalsIgnoreCase(name)) {
			return flg_lbl3();
		}
		if ($flg_lbl4.equalsIgnoreCase(name)) {
			return flg_lbl4();
		}
		if ($flg_lbl5.equalsIgnoreCase(name)) {
			return flg_lbl5();
		}
		return super.getStringNE(name);
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
		if ($print_flg.equalsIgnoreCase(name)) {
			return print_flg();
		}
		if ($dwnld_flg.equalsIgnoreCase(name)) {
			return dwnld_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($biz_dat_id.equalsIgnoreCase(name)) {
			biz_dat_id(value);
			return;
		}
		if ($biz_dat_nm.equalsIgnoreCase(name)) {
			biz_dat_nm(value);
			return;
		}
		if ($biz_dat_get_typ.equalsIgnoreCase(name)) {
			biz_dat_get_typ(value);
			return;
		}
		if ($form_file_nm.equalsIgnoreCase(name)) {
			form_file_nm(value);
			return;
		}
		if ($cartridge.equalsIgnoreCase(name)) {
			cartridge(value);
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
		if ($ins_func_nm.equalsIgnoreCase(name)) {
			ins_func_nm(value);
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
		if ($upd_func_nm.equalsIgnoreCase(name)) {
			upd_func_nm(value);
			return;
		}
		if ($upd_srv_req_no.equalsIgnoreCase(name)) {
			upd_srv_req_no(value);
			return;
		}
		if ($str_cnd_list.equalsIgnoreCase(name)) {
			str_cnd_list(value);
			return;
		}
		if ($biz_dat_rmrks1.equalsIgnoreCase(name)) {
			biz_dat_rmrks1(value);
			return;
		}
		if ($biz_dat_rmrks2.equalsIgnoreCase(name)) {
			biz_dat_rmrks2(value);
			return;
		}
		if ($biz_dat_rmrks3.equalsIgnoreCase(name)) {
			biz_dat_rmrks3(value);
			return;
		}
		if ($dt_cond_col1.equalsIgnoreCase(name)) {
			dt_cond_col1(value);
			return;
		}
		if ($dt_cond_col2.equalsIgnoreCase(name)) {
			dt_cond_col2(value);
			return;
		}
		if ($dt_cond_col3.equalsIgnoreCase(name)) {
			dt_cond_col3(value);
			return;
		}
		if ($dt_cond_col4.equalsIgnoreCase(name)) {
			dt_cond_col4(value);
			return;
		}
		if ($dt_cond_col5.equalsIgnoreCase(name)) {
			dt_cond_col5(value);
			return;
		}
		if ($dt_cond_col6.equalsIgnoreCase(name)) {
			dt_cond_col6(value);
			return;
		}
		if ($dt_cond_col7.equalsIgnoreCase(name)) {
			dt_cond_col7(value);
			return;
		}
		if ($dt_cond_col8.equalsIgnoreCase(name)) {
			dt_cond_col8(value);
			return;
		}
		if ($dt_cond_col9.equalsIgnoreCase(name)) {
			dt_cond_col9(value);
			return;
		}
		if ($dt_cond_col10.equalsIgnoreCase(name)) {
			dt_cond_col10(value);
			return;
		}
		if ($str_cond_col1.equalsIgnoreCase(name)) {
			str_cond_col1(value);
			return;
		}
		if ($str_cond_col2.equalsIgnoreCase(name)) {
			str_cond_col2(value);
			return;
		}
		if ($str_cond_col3.equalsIgnoreCase(name)) {
			str_cond_col3(value);
			return;
		}
		if ($str_cond_col4.equalsIgnoreCase(name)) {
			str_cond_col4(value);
			return;
		}
		if ($str_cond_col5.equalsIgnoreCase(name)) {
			str_cond_col5(value);
			return;
		}
		if ($num_cond_col1.equalsIgnoreCase(name)) {
			num_cond_col1(value);
			return;
		}
		if ($num_cond_col2.equalsIgnoreCase(name)) {
			num_cond_col2(value);
			return;
		}
		if ($num_cond_col3.equalsIgnoreCase(name)) {
			num_cond_col3(value);
			return;
		}
		if ($num_cond_col4.equalsIgnoreCase(name)) {
			num_cond_col4(value);
			return;
		}
		if ($num_cond_col5.equalsIgnoreCase(name)) {
			num_cond_col5(value);
			return;
		}
		if ($flg_cond_col1.equalsIgnoreCase(name)) {
			flg_cond_col1(value);
			return;
		}
		if ($flg_cond_col2.equalsIgnoreCase(name)) {
			flg_cond_col2(value);
			return;
		}
		if ($flg_cond_col3.equalsIgnoreCase(name)) {
			flg_cond_col3(value);
			return;
		}
		if ($flg_cond_col4.equalsIgnoreCase(name)) {
			flg_cond_col4(value);
			return;
		}
		if ($flg_cond_col5.equalsIgnoreCase(name)) {
			flg_cond_col5(value);
			return;
		}
		if ($dt_lbl1.equalsIgnoreCase(name)) {
			dt_lbl1(value);
			return;
		}
		if ($dt_lbl2.equalsIgnoreCase(name)) {
			dt_lbl2(value);
			return;
		}
		if ($dt_lbl3.equalsIgnoreCase(name)) {
			dt_lbl3(value);
			return;
		}
		if ($dt_lbl4.equalsIgnoreCase(name)) {
			dt_lbl4(value);
			return;
		}
		if ($dt_lbl5.equalsIgnoreCase(name)) {
			dt_lbl5(value);
			return;
		}
		if ($dt_lbl6.equalsIgnoreCase(name)) {
			dt_lbl6(value);
			return;
		}
		if ($dt_lbl7.equalsIgnoreCase(name)) {
			dt_lbl7(value);
			return;
		}
		if ($dt_lbl8.equalsIgnoreCase(name)) {
			dt_lbl8(value);
			return;
		}
		if ($dt_lbl9.equalsIgnoreCase(name)) {
			dt_lbl9(value);
			return;
		}
		if ($dt_lbl10.equalsIgnoreCase(name)) {
			dt_lbl10(value);
			return;
		}
		if ($str_lbl1.equalsIgnoreCase(name)) {
			str_lbl1(value);
			return;
		}
		if ($str_lbl2.equalsIgnoreCase(name)) {
			str_lbl2(value);
			return;
		}
		if ($str_lbl3.equalsIgnoreCase(name)) {
			str_lbl3(value);
			return;
		}
		if ($str_lbl4.equalsIgnoreCase(name)) {
			str_lbl4(value);
			return;
		}
		if ($str_lbl5.equalsIgnoreCase(name)) {
			str_lbl5(value);
			return;
		}
		if ($num_lbl1.equalsIgnoreCase(name)) {
			num_lbl1(value);
			return;
		}
		if ($num_lbl2.equalsIgnoreCase(name)) {
			num_lbl2(value);
			return;
		}
		if ($num_lbl3.equalsIgnoreCase(name)) {
			num_lbl3(value);
			return;
		}
		if ($num_lbl4.equalsIgnoreCase(name)) {
			num_lbl4(value);
			return;
		}
		if ($num_lbl5.equalsIgnoreCase(name)) {
			num_lbl5(value);
			return;
		}
		if ($flg_lbl1.equalsIgnoreCase(name)) {
			flg_lbl1(value);
			return;
		}
		if ($flg_lbl2.equalsIgnoreCase(name)) {
			flg_lbl2(value);
			return;
		}
		if ($flg_lbl3.equalsIgnoreCase(name)) {
			flg_lbl3(value);
			return;
		}
		if ($flg_lbl4.equalsIgnoreCase(name)) {
			flg_lbl4(value);
			return;
		}
		if ($flg_lbl5.equalsIgnoreCase(name)) {
			flg_lbl5(value);
			return;
		}
		super.setString(name, value);
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
		if ($print_flg.equalsIgnoreCase(name)) {
			print_flg(value);
			return;
		}
		if ($dwnld_flg.equalsIgnoreCase(name)) {
			dwnld_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($biz_dat_id.equalsIgnoreCase(name)) {
			biz_dat_id(value);
			return;
		}
		if ($biz_dat_nm.equalsIgnoreCase(name)) {
			biz_dat_nm(value);
			return;
		}
		if ($biz_dat_get_typ.equalsIgnoreCase(name)) {
			biz_dat_get_typ(value);
			return;
		}
		if ($form_file_nm.equalsIgnoreCase(name)) {
			form_file_nm(value);
			return;
		}
		if ($cartridge.equalsIgnoreCase(name)) {
			cartridge(value);
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
		if ($ins_func_nm.equalsIgnoreCase(name)) {
			ins_func_nm(value);
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
		if ($upd_func_nm.equalsIgnoreCase(name)) {
			upd_func_nm(value);
			return;
		}
		if ($upd_srv_req_no.equalsIgnoreCase(name)) {
			upd_srv_req_no(value);
			return;
		}
		if ($str_cnd_list.equalsIgnoreCase(name)) {
			str_cnd_list(value);
			return;
		}
		if ($biz_dat_rmrks1.equalsIgnoreCase(name)) {
			biz_dat_rmrks1(value);
			return;
		}
		if ($biz_dat_rmrks2.equalsIgnoreCase(name)) {
			biz_dat_rmrks2(value);
			return;
		}
		if ($biz_dat_rmrks3.equalsIgnoreCase(name)) {
			biz_dat_rmrks3(value);
			return;
		}
		if ($dt_cond_col1.equalsIgnoreCase(name)) {
			dt_cond_col1(value);
			return;
		}
		if ($dt_cond_col2.equalsIgnoreCase(name)) {
			dt_cond_col2(value);
			return;
		}
		if ($dt_cond_col3.equalsIgnoreCase(name)) {
			dt_cond_col3(value);
			return;
		}
		if ($dt_cond_col4.equalsIgnoreCase(name)) {
			dt_cond_col4(value);
			return;
		}
		if ($dt_cond_col5.equalsIgnoreCase(name)) {
			dt_cond_col5(value);
			return;
		}
		if ($dt_cond_col6.equalsIgnoreCase(name)) {
			dt_cond_col6(value);
			return;
		}
		if ($dt_cond_col7.equalsIgnoreCase(name)) {
			dt_cond_col7(value);
			return;
		}
		if ($dt_cond_col8.equalsIgnoreCase(name)) {
			dt_cond_col8(value);
			return;
		}
		if ($dt_cond_col9.equalsIgnoreCase(name)) {
			dt_cond_col9(value);
			return;
		}
		if ($dt_cond_col10.equalsIgnoreCase(name)) {
			dt_cond_col10(value);
			return;
		}
		if ($str_cond_col1.equalsIgnoreCase(name)) {
			str_cond_col1(value);
			return;
		}
		if ($str_cond_col2.equalsIgnoreCase(name)) {
			str_cond_col2(value);
			return;
		}
		if ($str_cond_col3.equalsIgnoreCase(name)) {
			str_cond_col3(value);
			return;
		}
		if ($str_cond_col4.equalsIgnoreCase(name)) {
			str_cond_col4(value);
			return;
		}
		if ($str_cond_col5.equalsIgnoreCase(name)) {
			str_cond_col5(value);
			return;
		}
		if ($num_cond_col1.equalsIgnoreCase(name)) {
			num_cond_col1(value);
			return;
		}
		if ($num_cond_col2.equalsIgnoreCase(name)) {
			num_cond_col2(value);
			return;
		}
		if ($num_cond_col3.equalsIgnoreCase(name)) {
			num_cond_col3(value);
			return;
		}
		if ($num_cond_col4.equalsIgnoreCase(name)) {
			num_cond_col4(value);
			return;
		}
		if ($num_cond_col5.equalsIgnoreCase(name)) {
			num_cond_col5(value);
			return;
		}
		if ($flg_cond_col1.equalsIgnoreCase(name)) {
			flg_cond_col1(value);
			return;
		}
		if ($flg_cond_col2.equalsIgnoreCase(name)) {
			flg_cond_col2(value);
			return;
		}
		if ($flg_cond_col3.equalsIgnoreCase(name)) {
			flg_cond_col3(value);
			return;
		}
		if ($flg_cond_col4.equalsIgnoreCase(name)) {
			flg_cond_col4(value);
			return;
		}
		if ($flg_cond_col5.equalsIgnoreCase(name)) {
			flg_cond_col5(value);
			return;
		}
		if ($dt_lbl1.equalsIgnoreCase(name)) {
			dt_lbl1(value);
			return;
		}
		if ($dt_lbl2.equalsIgnoreCase(name)) {
			dt_lbl2(value);
			return;
		}
		if ($dt_lbl3.equalsIgnoreCase(name)) {
			dt_lbl3(value);
			return;
		}
		if ($dt_lbl4.equalsIgnoreCase(name)) {
			dt_lbl4(value);
			return;
		}
		if ($dt_lbl5.equalsIgnoreCase(name)) {
			dt_lbl5(value);
			return;
		}
		if ($dt_lbl6.equalsIgnoreCase(name)) {
			dt_lbl6(value);
			return;
		}
		if ($dt_lbl7.equalsIgnoreCase(name)) {
			dt_lbl7(value);
			return;
		}
		if ($dt_lbl8.equalsIgnoreCase(name)) {
			dt_lbl8(value);
			return;
		}
		if ($dt_lbl9.equalsIgnoreCase(name)) {
			dt_lbl9(value);
			return;
		}
		if ($dt_lbl10.equalsIgnoreCase(name)) {
			dt_lbl10(value);
			return;
		}
		if ($str_lbl1.equalsIgnoreCase(name)) {
			str_lbl1(value);
			return;
		}
		if ($str_lbl2.equalsIgnoreCase(name)) {
			str_lbl2(value);
			return;
		}
		if ($str_lbl3.equalsIgnoreCase(name)) {
			str_lbl3(value);
			return;
		}
		if ($str_lbl4.equalsIgnoreCase(name)) {
			str_lbl4(value);
			return;
		}
		if ($str_lbl5.equalsIgnoreCase(name)) {
			str_lbl5(value);
			return;
		}
		if ($num_lbl1.equalsIgnoreCase(name)) {
			num_lbl1(value);
			return;
		}
		if ($num_lbl2.equalsIgnoreCase(name)) {
			num_lbl2(value);
			return;
		}
		if ($num_lbl3.equalsIgnoreCase(name)) {
			num_lbl3(value);
			return;
		}
		if ($num_lbl4.equalsIgnoreCase(name)) {
			num_lbl4(value);
			return;
		}
		if ($num_lbl5.equalsIgnoreCase(name)) {
			num_lbl5(value);
			return;
		}
		if ($flg_lbl1.equalsIgnoreCase(name)) {
			flg_lbl1(value);
			return;
		}
		if ($flg_lbl2.equalsIgnoreCase(name)) {
			flg_lbl2(value);
			return;
		}
		if ($flg_lbl3.equalsIgnoreCase(name)) {
			flg_lbl3(value);
			return;
		}
		if ($flg_lbl4.equalsIgnoreCase(name)) {
			flg_lbl4(value);
			return;
		}
		if ($flg_lbl5.equalsIgnoreCase(name)) {
			flg_lbl5(value);
			return;
		}
		super.setStringNE(name, value);
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
		if ($print_flg.equalsIgnoreCase(name)) {
			print_flg(value);
			return;
		}
		if ($dwnld_flg.equalsIgnoreCase(name)) {
			dwnld_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

