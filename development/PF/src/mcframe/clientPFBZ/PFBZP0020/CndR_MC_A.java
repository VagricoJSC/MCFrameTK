package mcframe.clientPFBZ.PFBZP0020;

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
 * ブロック"Cnd"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class CndR_MC_A extends MCConstRow {

	/**
	 * Importing error 受信エラー.<p>
	 *
	 */
	public static final String $recv_err_flg = "recv_err_flg";
	/**
	 * Import completed 受信完了.<p>
	 *
	 */
	public static final String $recv_ok_flg = "recv_ok_flg";
	/**
	 * Conversion error 変換エラー.<p>
	 *
	 */
	public static final String $recv_conv_err_flg = "recv_conv_err_flg";
	/**
	 * Conversion completed 変換完了.<p>
	 *
	 */
	public static final String $recv_conv_ok_flg = "recv_conv_ok_flg";
	/**
	 * IF process type ＩＦ処理区分.<p>
	 *
	 */
	public static final String $if_proc_typ = "if_proc_typ";
	/**
	 * IF process type name ＩＦ処理区分名.<p>
	 *
	 */
	public static final String $if_proc_typ_nm = "if_proc_typ_nm";
	/**
	 * Data No. FROM データＮＯ ＦＲＯＭ.<p>
	 *
	 */
	public static final String $data_no_fr = "data_no_fr";
	/**
	 * Data No. TO データＮＯ ＴＯ.<p>
	 *
	 */
	public static final String $data_no_to = "data_no_to";
	/**
	 * External system cd. 外部システムＣＤ.<p>
	 *
	 */
	public static final String $ext_sys_cd = "ext_sys_cd";
	/**
	 * External system name 外部システム名.<p>
	 *
	 */
	public static final String $ext_sys_nm = "ext_sys_nm";
	/**
	 * Receiving date and time FROM 受信日時ＦＲＯＭ.<p>
	 *
	 */
	public static final String $sdrv_tm_fr = "sdrv_tm_fr";
	/**
	 * Receiving date TO 受信日時ＴＯ.<p>
	 *
	 */
	public static final String $sdrv_tm_to = "sdrv_tm_to";
	/**
	 * File name ファイル名.<p>
	 *
	 */
	public static final String $file_nm = "file_nm";
	/**
	 * Log No. ログＮＯ.<p>
	 *
	 */
	public static final String $batch_log_no = "batch_log_no";
	/**
	 * Server request No. サーバリクエストＮＯ.<p>
	 *
	 */
	public static final String $ins_srv_req_no = "ins_srv_req_no";
	/**
	 * Business info. character string 1 業務情報文字列１.<p>
	 *
	 */
	public static final String $attr_char1 = "attr_char1";
	/**
	 * Business info. character string 2 業務情報文字列２.<p>
	 *
	 */
	public static final String $attr_char2 = "attr_char2";
	/**
	 * Business info. character string 3 業務情報文字列３.<p>
	 *
	 */
	public static final String $attr_char3 = "attr_char3";
	/**
	 * Business info. character string 4 業務情報文字列４.<p>
	 *
	 */
	public static final String $attr_char4 = "attr_char4";
	/**
	 * Business info. character string 5 業務情報文字列５.<p>
	 *
	 */
	public static final String $attr_char5 = "attr_char5";
	/**
	 * Business info. character string 6 業務情報文字列６.<p>
	 *
	 */
	public static final String $attr_char6 = "attr_char6";
	/**
	 * Business info. character string 7 業務情報文字列７.<p>
	 *
	 */
	public static final String $attr_char7 = "attr_char7";
	/**
	 * Business info. character string 8 業務情報文字列８.<p>
	 *
	 */
	public static final String $attr_char8 = "attr_char8";
	/**
	 * Business info. character string 9 業務情報文字列９.<p>
	 *
	 */
	public static final String $attr_char9 = "attr_char9";
	/**
	 * Business info. character string 10 業務情報文字列１０.<p>
	 *
	 */
	public static final String $attr_char10 = "attr_char10";
	/**
	 * Business info. character string 11 業務情報文字列１１.<p>
	 *
	 */
	public static final String $attr_char11 = "attr_char11";
	/**
	 * Business info. character string 12 業務情報文字列１２.<p>
	 *
	 */
	public static final String $attr_char12 = "attr_char12";
	/**
	 * Business info. character string 13 業務情報文字列１３.<p>
	 *
	 */
	public static final String $attr_char13 = "attr_char13";
	/**
	 * Business info. character string 14 業務情報文字列１４.<p>
	 *
	 */
	public static final String $attr_char14 = "attr_char14";
	/**
	 * Business info. character string 15 業務情報文字列１５.<p>
	 *
	 */
	public static final String $attr_char15 = "attr_char15";
	/**
	 * Business info. character string 16 業務情報文字列１６.<p>
	 *
	 */
	public static final String $attr_char16 = "attr_char16";
	/**
	 * Business info. character string 17 業務情報文字列１７.<p>
	 *
	 */
	public static final String $attr_char17 = "attr_char17";
	/**
	 * Business info. character string 18 業務情報文字列１８.<p>
	 *
	 */
	public static final String $attr_char18 = "attr_char18";
	/**
	 * Business info. character string 19 業務情報文字列１９.<p>
	 *
	 */
	public static final String $attr_char19 = "attr_char19";
	/**
	 * Business info. character string 20 業務情報文字列２０.<p>
	 *
	 */
	public static final String $attr_char20 = "attr_char20";
	/**
	 * Business info. character string 21 業務情報文字列２１.<p>
	 *
	 */
	public static final String $attr_char21 = "attr_char21";
	/**
	 * Business info. character string 22 業務情報文字列２２.<p>
	 *
	 */
	public static final String $attr_char22 = "attr_char22";
	/**
	 * Business info. character string 23 業務情報文字列２３.<p>
	 *
	 */
	public static final String $attr_char23 = "attr_char23";
	/**
	 * Business info. character string 24 業務情報文字列２４.<p>
	 *
	 */
	public static final String $attr_char24 = "attr_char24";
	/**
	 * Business info. character string 25 業務情報文字列２５.<p>
	 *
	 */
	public static final String $attr_char25 = "attr_char25";
	/**
	 * Business info. character string 26 業務情報文字列２６.<p>
	 *
	 */
	public static final String $attr_char26 = "attr_char26";
	/**
	 * Business info. character string 27 業務情報文字列２７.<p>
	 *
	 */
	public static final String $attr_char27 = "attr_char27";
	/**
	 * Business info. character string 28 業務情報文字列２８.<p>
	 *
	 */
	public static final String $attr_char28 = "attr_char28";
	/**
	 * Business info. character string 29 業務情報文字列２９.<p>
	 *
	 */
	public static final String $attr_char29 = "attr_char29";
	/**
	 * Business info. character string 30 業務情報文字列３０.<p>
	 *
	 */
	public static final String $attr_char30 = "attr_char30";
	/**
	 * Business info. numerical value 1 業務情報数値１.<p>
	 *
	 */
	public static final String $attr_num1 = "attr_num1";
	/**
	 * Business info. numerical value 2 業務情報数値２.<p>
	 *
	 */
	public static final String $attr_num2 = "attr_num2";
	/**
	 * Business info. numerical value 3 業務情報数値３.<p>
	 *
	 */
	public static final String $attr_num3 = "attr_num3";
	/**
	 * Business info. numerical value 4 業務情報数値４.<p>
	 *
	 */
	public static final String $attr_num4 = "attr_num4";
	/**
	 * Business info. numerical value 5 業務情報数値５.<p>
	 *
	 */
	public static final String $attr_num5 = "attr_num5";
	/**
	 * Business info. 16 業務情報１６.<p>
	 *
	 */
	public static final String $attr_dt1 = "attr_dt1";
	/**
	 * Business info. 17 業務情報１７.<p>
	 *
	 */
	public static final String $attr_dt2 = "attr_dt2";
	/**
	 * Business info. 18 業務情報１８.<p>
	 *
	 */
	public static final String $attr_dt3 = "attr_dt3";
	/**
	 * Business info. 19 業務情報１９.<p>
	 *
	 */
	public static final String $attr_dt4 = "attr_dt4";
	/**
	 * Business info. 20 業務情報２０.<p>
	 *
	 */
	public static final String $attr_dt5 = "attr_dt5";
	/**
	 * Business info. date 1 FROM 業務情報日付１ＦＲＯＭ.<p>
	 *
	 */
	public static final String $attr_dt1_fr = "attr_dt1_fr";
	/**
	 * Business info. date 1 TO 業務情報日付１ＴＯ.<p>
	 *
	 */
	public static final String $attr_dt1_to = "attr_dt1_to";
	/**
	 * Business info. date 2 FROM 業務情報日付２ＦＲＯＭ.<p>
	 *
	 */
	public static final String $attr_dt2_fr = "attr_dt2_fr";
	/**
	 * Business info. date 2 TO 業務情報日付２ＴＯ.<p>
	 *
	 */
	public static final String $attr_dt2_to = "attr_dt2_to";
	/**
	 * Business info. date 3 FROM 業務情報日付３ＦＲＯＭ.<p>
	 *
	 */
	public static final String $attr_dt3_fr = "attr_dt3_fr";
	/**
	 * Business info. date 3 TO 業務情報日付３ＴＯ.<p>
	 *
	 */
	public static final String $attr_dt3_to = "attr_dt3_to";
	/**
	 * Business info. date 4 FROM 業務情報日付４ＦＲＯＭ.<p>
	 *
	 */
	public static final String $attr_dt4_fr = "attr_dt4_fr";
	/**
	 * Business info. date 4 TO 業務情報日付４ＴＯ.<p>
	 *
	 */
	public static final String $attr_dt4_to = "attr_dt4_to";
	/**
	 * Business info. date 5 FROM 業務情報日付５ＦＲＯＭ.<p>
	 *
	 */
	public static final String $attr_dt5_fr = "attr_dt5_fr";
	/**
	 * Business info. date 5 TO 業務情報日付５ＴＯ.<p>
	 *
	 */
	public static final String $attr_dt5_to = "attr_dt5_to";
	/**
	 * Business info. date and time 1 FROM 業務情報日時１ＦＲＯＭ.<p>
	 *
	 */
	public static final String $attr_tm1_fr = "attr_tm1_fr";
	/**
	 * Business info. date and time 1 TO 業務情報日時１ＴＯ.<p>
	 *
	 */
	public static final String $attr_tm1_to = "attr_tm1_to";
	/**
	 * Business info. date and time 2 FROM 業務情報日時２ＦＲＯＭ.<p>
	 *
	 */
	public static final String $attr_tm2_fr = "attr_tm2_fr";
	/**
	 * Business info. date and time 2 TO 業務情報日時２ＴＯ.<p>
	 *
	 */
	public static final String $attr_tm2_to = "attr_tm2_to";
	/**
	 * Business info. date and time 3 FROM 業務情報日時３ＦＲＯＭ.<p>
	 *
	 */
	public static final String $attr_tm3_fr = "attr_tm3_fr";
	/**
	 * Business info. date and time 3 TO 業務情報日時３ＴＯ.<p>
	 *
	 */
	public static final String $attr_tm3_to = "attr_tm3_to";
	/**
	 * Business info. date and time 4 FROM 業務情報日時４ＦＲＯＭ.<p>
	 *
	 */
	public static final String $attr_tm4_fr = "attr_tm4_fr";
	/**
	 * Business info. date and time 4 TO 業務情報日時４ＴＯ.<p>
	 *
	 */
	public static final String $attr_tm4_to = "attr_tm4_to";
	/**
	 * Business info. date and time 5 FROM 業務情報日時５ＦＲＯＭ.<p>
	 *
	 */
	public static final String $attr_tm5_fr = "attr_tm5_fr";
	/**
	 * Business info. date and time 5 TO 業務情報日時５ＴＯ.<p>
	 *
	 */
	public static final String $attr_tm5_to = "attr_tm5_to";


	public static final MCMeta recv_err_flg_META = createCommonMeta($recv_err_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta recv_ok_flg_META = createCommonMeta($recv_ok_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta recv_conv_err_flg_META = createCommonMeta($recv_conv_err_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta recv_conv_ok_flg_META = createCommonMeta($recv_conv_ok_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta if_proc_typ_META = createCommonMeta($if_proc_typ, mcframe.commonMA.meta.MA_META.IF_PROC_TYP);
	public static final MCMeta if_proc_typ_nm_META = createCommonMeta($if_proc_typ_nm, mcframe.commonMA.meta.MA_META.IF_PROC_TYP_NM);
	public static final MCMeta data_no_fr_META = createCommonMeta($data_no_fr, mcframe.commonMA.meta.MA_META.IF_DATA_NO);
	public static final MCMeta data_no_to_META = createCommonMeta($data_no_to, mcframe.commonMA.meta.MA_META.IF_DATA_NO);
	public static final MCMeta ext_sys_cd_META = createCommonMeta($ext_sys_cd, mcframe.commonMA.meta.MA_META.EXT_SYS_CD);
	public static final MCMeta ext_sys_nm_META = createCommonMeta($ext_sys_nm, mcframe.commonMA.meta.MA_META.EXT_SYS_NM);
	public static final MCMeta sdrv_tm_fr_META = createCommonMeta($sdrv_tm_fr, mcframe.commonMA.meta.MA_META.TM);
	public static final MCMeta sdrv_tm_to_META = createCommonMeta($sdrv_tm_to, mcframe.commonMA.meta.MA_META.TM);
	public static final MCMeta file_nm_META = createCommonMeta($file_nm, mcframe.commonMA.meta.MA_META.FILE_NM);
	public static final MCMeta batch_log_no_META = createCommonMeta($batch_log_no, mcframe.commonMA.meta.MA_META.BATCH_LOG_NO);
	public static final MCMeta ins_srv_req_no_META = createCommonMeta($ins_srv_req_no, mcframe.commonMA.meta.MA_META.SRV_REQ_NO);
	public static final MCMeta attr_char1_META = createCommonMeta($attr_char1, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR1);
	public static final MCMeta attr_char2_META = createCommonMeta($attr_char2, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR2);
	public static final MCMeta attr_char3_META = createCommonMeta($attr_char3, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR3);
	public static final MCMeta attr_char4_META = createCommonMeta($attr_char4, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR4);
	public static final MCMeta attr_char5_META = createCommonMeta($attr_char5, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR5);
	public static final MCMeta attr_char6_META = createCommonMeta($attr_char6, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR6);
	public static final MCMeta attr_char7_META = createCommonMeta($attr_char7, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR7);
	public static final MCMeta attr_char8_META = createCommonMeta($attr_char8, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR8);
	public static final MCMeta attr_char9_META = createCommonMeta($attr_char9, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR9);
	public static final MCMeta attr_char10_META = createCommonMeta($attr_char10, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR10);
	public static final MCMeta attr_char11_META = createCommonMeta($attr_char11, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR11);
	public static final MCMeta attr_char12_META = createCommonMeta($attr_char12, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR12);
	public static final MCMeta attr_char13_META = createCommonMeta($attr_char13, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR13);
	public static final MCMeta attr_char14_META = createCommonMeta($attr_char14, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR14);
	public static final MCMeta attr_char15_META = createCommonMeta($attr_char15, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR15);
	public static final MCMeta attr_char16_META = createCommonMeta($attr_char16, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR16);
	public static final MCMeta attr_char17_META = createCommonMeta($attr_char17, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR17);
	public static final MCMeta attr_char18_META = createCommonMeta($attr_char18, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR18);
	public static final MCMeta attr_char19_META = createCommonMeta($attr_char19, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR19);
	public static final MCMeta attr_char20_META = createCommonMeta($attr_char20, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR20);
	public static final MCMeta attr_char21_META = createCommonMeta($attr_char21, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR21);
	public static final MCMeta attr_char22_META = createCommonMeta($attr_char22, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR22);
	public static final MCMeta attr_char23_META = createCommonMeta($attr_char23, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR23);
	public static final MCMeta attr_char24_META = createCommonMeta($attr_char24, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR24);
	public static final MCMeta attr_char25_META = createCommonMeta($attr_char25, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR25);
	public static final MCMeta attr_char26_META = createCommonMeta($attr_char26, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR26);
	public static final MCMeta attr_char27_META = createCommonMeta($attr_char27, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR27);
	public static final MCMeta attr_char28_META = createCommonMeta($attr_char28, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR28);
	public static final MCMeta attr_char29_META = createCommonMeta($attr_char29, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR29);
	public static final MCMeta attr_char30_META = createCommonMeta($attr_char30, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR30);
	public static final MCMeta attr_num1_META = createCommonMeta($attr_num1, mcframe.commonMA.meta.MA_META.IF_SUB_NUM1);
	public static final MCMeta attr_num2_META = createCommonMeta($attr_num2, mcframe.commonMA.meta.MA_META.IF_SUB_NUM2);
	public static final MCMeta attr_num3_META = createCommonMeta($attr_num3, mcframe.commonMA.meta.MA_META.IF_SUB_NUM3);
	public static final MCMeta attr_num4_META = createCommonMeta($attr_num4, mcframe.commonMA.meta.MA_META.IF_SUB_NUM4);
	public static final MCMeta attr_num5_META = createCommonMeta($attr_num5, mcframe.commonMA.meta.MA_META.IF_SUB_NUM5);
	public static final MCMeta attr_dt1_META = createCommonMeta($attr_dt1, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta attr_dt2_META = createCommonMeta($attr_dt2, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta attr_dt3_META = createCommonMeta($attr_dt3, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta attr_dt4_META = createCommonMeta($attr_dt4, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta attr_dt5_META = createCommonMeta($attr_dt5, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta attr_dt1_fr_META = createCommonMeta($attr_dt1_fr, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta attr_dt1_to_META = createCommonMeta($attr_dt1_to, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta attr_dt2_fr_META = createCommonMeta($attr_dt2_fr, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta attr_dt2_to_META = createCommonMeta($attr_dt2_to, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta attr_dt3_fr_META = createCommonMeta($attr_dt3_fr, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta attr_dt3_to_META = createCommonMeta($attr_dt3_to, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta attr_dt4_fr_META = createCommonMeta($attr_dt4_fr, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta attr_dt4_to_META = createCommonMeta($attr_dt4_to, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta attr_dt5_fr_META = createCommonMeta($attr_dt5_fr, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta attr_dt5_to_META = createCommonMeta($attr_dt5_to, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta attr_tm1_fr_META = createCommonMeta($attr_tm1_fr, mcframe.commonMA.meta.MA_META.TM);
	public static final MCMeta attr_tm1_to_META = createCommonMeta($attr_tm1_to, mcframe.commonMA.meta.MA_META.TM);
	public static final MCMeta attr_tm2_fr_META = createCommonMeta($attr_tm2_fr, mcframe.commonMA.meta.MA_META.TM);
	public static final MCMeta attr_tm2_to_META = createCommonMeta($attr_tm2_to, mcframe.commonMA.meta.MA_META.TM);
	public static final MCMeta attr_tm3_fr_META = createCommonMeta($attr_tm3_fr, mcframe.commonMA.meta.MA_META.TM);
	public static final MCMeta attr_tm3_to_META = createCommonMeta($attr_tm3_to, mcframe.commonMA.meta.MA_META.TM);
	public static final MCMeta attr_tm4_fr_META = createCommonMeta($attr_tm4_fr, mcframe.commonMA.meta.MA_META.TM);
	public static final MCMeta attr_tm4_to_META = createCommonMeta($attr_tm4_to, mcframe.commonMA.meta.MA_META.TM);
	public static final MCMeta attr_tm5_fr_META = createCommonMeta($attr_tm5_fr, mcframe.commonMA.meta.MA_META.TM);
	public static final MCMeta attr_tm5_to_META = createCommonMeta($attr_tm5_to, mcframe.commonMA.meta.MA_META.TM);

	protected static final ConstMetaList<CndR> constMetas = new ConstMetaList<CndR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			recv_err_flg_META,
			recv_ok_flg_META,
			recv_conv_err_flg_META,
			recv_conv_ok_flg_META,
			if_proc_typ_META,
			if_proc_typ_nm_META,
			data_no_fr_META,
			data_no_to_META,
			ext_sys_cd_META,
			ext_sys_nm_META,
			sdrv_tm_fr_META,
			sdrv_tm_to_META,
			file_nm_META,
			batch_log_no_META,
			ins_srv_req_no_META,
			attr_char1_META,
			attr_char2_META,
			attr_char3_META,
			attr_char4_META,
			attr_char5_META,
			attr_char6_META,
			attr_char7_META,
			attr_char8_META,
			attr_char9_META,
			attr_char10_META,
			attr_char11_META,
			attr_char12_META,
			attr_char13_META,
			attr_char14_META,
			attr_char15_META,
			attr_char16_META,
			attr_char17_META,
			attr_char18_META,
			attr_char19_META,
			attr_char20_META,
			attr_char21_META,
			attr_char22_META,
			attr_char23_META,
			attr_char24_META,
			attr_char25_META,
			attr_char26_META,
			attr_char27_META,
			attr_char28_META,
			attr_char29_META,
			attr_char30_META,
			attr_num1_META,
			attr_num2_META,
			attr_num3_META,
			attr_num4_META,
			attr_num5_META,
			attr_dt1_META,
			attr_dt2_META,
			attr_dt3_META,
			attr_dt4_META,
			attr_dt5_META,
			attr_dt1_fr_META,
			attr_dt1_to_META,
			attr_dt2_fr_META,
			attr_dt2_to_META,
			attr_dt3_fr_META,
			attr_dt3_to_META,
			attr_dt4_fr_META,
			attr_dt4_to_META,
			attr_dt5_fr_META,
			attr_dt5_to_META,
			attr_tm1_fr_META,
			attr_tm1_to_META,
			attr_tm2_fr_META,
			attr_tm2_to_META,
			attr_tm3_fr_META,
			attr_tm3_to_META,
			attr_tm4_fr_META,
			attr_tm4_to_META,
			attr_tm5_fr_META,
			attr_tm5_to_META
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

	/** 項目属性情報のグループ[LIST_OUT_BASE]のキー定数 */
	public static final String $$LIST_OUT_BASE = "LIST_OUT_BASE";
	/** 項目属性情報のグループ[LIST_IN]のキー定数 */
	public static final String $$LIST_IN = "LIST_IN";
	/** 項目属性情報のグループ[LIST_IN_BASE]のキー定数 */
	public static final String $$LIST_IN_BASE = "LIST_IN_BASE";

	/**
	 * グループ毎に定義される項目属性情報です。
	 */
	protected static final MCExtMap EXTMAP = new MCExtMap(
		null,
		new MCExtMap.Entry($$LIST_OUT_BASE, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$LIST_IN, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$LIST_IN_BASE, new MCExtList(
			new String[][]{
			}
		))
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
	protected CndR_MC_A(ConstMetaList<? extends CndR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public CndR clone() {
		return (CndR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public CndR createInstance() {
		return (CndR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public CndR getValues(String... names) {
		return (CndR) super.getValues(names);
	}



	/**
	 * Importing error 受信エラー.<p>
	 *
	 */
	public boolean recv_err_flg() {
		return getConstBoolean(offset + 0, $recv_err_flg);
	}

	/**
	 * Importing error 受信エラー.<p>
	 *
	 */
	public void recv_err_flg(boolean value) {
		setConstBoolean(offset + 0, $recv_err_flg, value);
	}


	/**
	 * Import completed 受信完了.<p>
	 *
	 */
	public boolean recv_ok_flg() {
		return getConstBoolean(offset + 1, $recv_ok_flg);
	}

	/**
	 * Import completed 受信完了.<p>
	 *
	 */
	public void recv_ok_flg(boolean value) {
		setConstBoolean(offset + 1, $recv_ok_flg, value);
	}


	/**
	 * Conversion error 変換エラー.<p>
	 *
	 */
	public boolean recv_conv_err_flg() {
		return getConstBoolean(offset + 2, $recv_conv_err_flg);
	}

	/**
	 * Conversion error 変換エラー.<p>
	 *
	 */
	public void recv_conv_err_flg(boolean value) {
		setConstBoolean(offset + 2, $recv_conv_err_flg, value);
	}


	/**
	 * Conversion completed 変換完了.<p>
	 *
	 */
	public boolean recv_conv_ok_flg() {
		return getConstBoolean(offset + 3, $recv_conv_ok_flg);
	}

	/**
	 * Conversion completed 変換完了.<p>
	 *
	 */
	public void recv_conv_ok_flg(boolean value) {
		setConstBoolean(offset + 3, $recv_conv_ok_flg, value);
	}


	/**
	 * IF process type ＩＦ処理区分.<p>
	 *
	 */
	public String if_proc_typ() {
		return getConstString(offset + 4, $if_proc_typ);
	}

	/**
	 * IF process type ＩＦ処理区分.<p>
	 *
	 */
	public void if_proc_typ(String value) {
		setConstString(offset + 4, $if_proc_typ, value);
	}


	/**
	 * IF process type name ＩＦ処理区分名.<p>
	 *
	 */
	public String if_proc_typ_nm() {
		return getConstString(offset + 5, $if_proc_typ_nm);
	}

	/**
	 * IF process type name ＩＦ処理区分名.<p>
	 *
	 */
	public void if_proc_typ_nm(String value) {
		setConstString(offset + 5, $if_proc_typ_nm, value);
	}


	/**
	 * Data No. FROM データＮＯ ＦＲＯＭ.<p>
	 *
	 */
	public MCNumber data_no_fr() {
		return getConstNumber(offset + 6, $data_no_fr);
	}

	/**
	 * Data No. FROM データＮＯ ＦＲＯＭ.<p>
	 *
	 */
	public void data_no_fr(MCNumber value) {
		setConstNumber(offset + 6, $data_no_fr, value);
	}

	/**
	 * Data No. FROM データＮＯ ＦＲＯＭ.<p>
	 *
	 */
	public void data_no_fr(int value) {
		setConstNumber(offset + 6, $data_no_fr, value);
	}

	/**
	 * Data No. FROM データＮＯ ＦＲＯＭ.<p>
	 *
	 */
	public void data_no_fr(long value) {
		setConstNumber(offset + 6, $data_no_fr, value);
	}

	/**
	 * Data No. FROM データＮＯ ＦＲＯＭ.<p>
	 *
	 */
	public void data_no_fr(float value) {
		setConstNumber(offset + 6, $data_no_fr, value);
	}

	/**
	 * Data No. FROM データＮＯ ＦＲＯＭ.<p>
	 *
	 */
	public void data_no_fr(double value) {
		setConstNumber(offset + 6, $data_no_fr, value);
	}


	/**
	 * Data No. TO データＮＯ ＴＯ.<p>
	 *
	 */
	public MCNumber data_no_to() {
		return getConstNumber(offset + 7, $data_no_to);
	}

	/**
	 * Data No. TO データＮＯ ＴＯ.<p>
	 *
	 */
	public void data_no_to(MCNumber value) {
		setConstNumber(offset + 7, $data_no_to, value);
	}

	/**
	 * Data No. TO データＮＯ ＴＯ.<p>
	 *
	 */
	public void data_no_to(int value) {
		setConstNumber(offset + 7, $data_no_to, value);
	}

	/**
	 * Data No. TO データＮＯ ＴＯ.<p>
	 *
	 */
	public void data_no_to(long value) {
		setConstNumber(offset + 7, $data_no_to, value);
	}

	/**
	 * Data No. TO データＮＯ ＴＯ.<p>
	 *
	 */
	public void data_no_to(float value) {
		setConstNumber(offset + 7, $data_no_to, value);
	}

	/**
	 * Data No. TO データＮＯ ＴＯ.<p>
	 *
	 */
	public void data_no_to(double value) {
		setConstNumber(offset + 7, $data_no_to, value);
	}


	/**
	 * External system cd. 外部システムＣＤ.<p>
	 *
	 */
	public String ext_sys_cd() {
		return getConstString(offset + 8, $ext_sys_cd);
	}

	/**
	 * External system cd. 外部システムＣＤ.<p>
	 *
	 */
	public void ext_sys_cd(String value) {
		setConstString(offset + 8, $ext_sys_cd, value);
	}


	/**
	 * External system name 外部システム名.<p>
	 *
	 */
	public String ext_sys_nm() {
		return getConstString(offset + 9, $ext_sys_nm);
	}

	/**
	 * External system name 外部システム名.<p>
	 *
	 */
	public void ext_sys_nm(String value) {
		setConstString(offset + 9, $ext_sys_nm, value);
	}


	/**
	 * Receiving date and time FROM 受信日時ＦＲＯＭ.<p>
	 *
	 */
	public MCDate sdrv_tm_fr() {
		return getConstDate(offset + 10, $sdrv_tm_fr);
	}

	/**
	 * Receiving date and time FROM 受信日時ＦＲＯＭ.<p>
	 *
	 */
	public void sdrv_tm_fr(MCDate value) {
		setConstDate(offset + 10, $sdrv_tm_fr, value);
	}


	/**
	 * Receiving date TO 受信日時ＴＯ.<p>
	 *
	 */
	public MCDate sdrv_tm_to() {
		return getConstDate(offset + 11, $sdrv_tm_to);
	}

	/**
	 * Receiving date TO 受信日時ＴＯ.<p>
	 *
	 */
	public void sdrv_tm_to(MCDate value) {
		setConstDate(offset + 11, $sdrv_tm_to, value);
	}


	/**
	 * File name ファイル名.<p>
	 *
	 */
	public String file_nm() {
		return getConstString(offset + 12, $file_nm);
	}

	/**
	 * File name ファイル名.<p>
	 *
	 */
	public void file_nm(String value) {
		setConstString(offset + 12, $file_nm, value);
	}


	/**
	 * Log No. ログＮＯ.<p>
	 *
	 */
	public String batch_log_no() {
		return getConstString(offset + 13, $batch_log_no);
	}

	/**
	 * Log No. ログＮＯ.<p>
	 *
	 */
	public void batch_log_no(String value) {
		setConstString(offset + 13, $batch_log_no, value);
	}


	/**
	 * Server request No. サーバリクエストＮＯ.<p>
	 *
	 */
	public String ins_srv_req_no() {
		return getConstString(offset + 14, $ins_srv_req_no);
	}

	/**
	 * Server request No. サーバリクエストＮＯ.<p>
	 *
	 */
	public void ins_srv_req_no(String value) {
		setConstString(offset + 14, $ins_srv_req_no, value);
	}


	/**
	 * Business info. character string 1 業務情報文字列１.<p>
	 *
	 */
	public String attr_char1() {
		return getConstString(offset + 15, $attr_char1);
	}

	/**
	 * Business info. character string 1 業務情報文字列１.<p>
	 *
	 */
	public void attr_char1(String value) {
		setConstString(offset + 15, $attr_char1, value);
	}


	/**
	 * Business info. character string 2 業務情報文字列２.<p>
	 *
	 */
	public String attr_char2() {
		return getConstString(offset + 16, $attr_char2);
	}

	/**
	 * Business info. character string 2 業務情報文字列２.<p>
	 *
	 */
	public void attr_char2(String value) {
		setConstString(offset + 16, $attr_char2, value);
	}


	/**
	 * Business info. character string 3 業務情報文字列３.<p>
	 *
	 */
	public String attr_char3() {
		return getConstString(offset + 17, $attr_char3);
	}

	/**
	 * Business info. character string 3 業務情報文字列３.<p>
	 *
	 */
	public void attr_char3(String value) {
		setConstString(offset + 17, $attr_char3, value);
	}


	/**
	 * Business info. character string 4 業務情報文字列４.<p>
	 *
	 */
	public String attr_char4() {
		return getConstString(offset + 18, $attr_char4);
	}

	/**
	 * Business info. character string 4 業務情報文字列４.<p>
	 *
	 */
	public void attr_char4(String value) {
		setConstString(offset + 18, $attr_char4, value);
	}


	/**
	 * Business info. character string 5 業務情報文字列５.<p>
	 *
	 */
	public String attr_char5() {
		return getConstString(offset + 19, $attr_char5);
	}

	/**
	 * Business info. character string 5 業務情報文字列５.<p>
	 *
	 */
	public void attr_char5(String value) {
		setConstString(offset + 19, $attr_char5, value);
	}


	/**
	 * Business info. character string 6 業務情報文字列６.<p>
	 *
	 */
	public String attr_char6() {
		return getConstString(offset + 20, $attr_char6);
	}

	/**
	 * Business info. character string 6 業務情報文字列６.<p>
	 *
	 */
	public void attr_char6(String value) {
		setConstString(offset + 20, $attr_char6, value);
	}


	/**
	 * Business info. character string 7 業務情報文字列７.<p>
	 *
	 */
	public String attr_char7() {
		return getConstString(offset + 21, $attr_char7);
	}

	/**
	 * Business info. character string 7 業務情報文字列７.<p>
	 *
	 */
	public void attr_char7(String value) {
		setConstString(offset + 21, $attr_char7, value);
	}


	/**
	 * Business info. character string 8 業務情報文字列８.<p>
	 *
	 */
	public String attr_char8() {
		return getConstString(offset + 22, $attr_char8);
	}

	/**
	 * Business info. character string 8 業務情報文字列８.<p>
	 *
	 */
	public void attr_char8(String value) {
		setConstString(offset + 22, $attr_char8, value);
	}


	/**
	 * Business info. character string 9 業務情報文字列９.<p>
	 *
	 */
	public String attr_char9() {
		return getConstString(offset + 23, $attr_char9);
	}

	/**
	 * Business info. character string 9 業務情報文字列９.<p>
	 *
	 */
	public void attr_char9(String value) {
		setConstString(offset + 23, $attr_char9, value);
	}


	/**
	 * Business info. character string 10 業務情報文字列１０.<p>
	 *
	 */
	public String attr_char10() {
		return getConstString(offset + 24, $attr_char10);
	}

	/**
	 * Business info. character string 10 業務情報文字列１０.<p>
	 *
	 */
	public void attr_char10(String value) {
		setConstString(offset + 24, $attr_char10, value);
	}


	/**
	 * Business info. character string 11 業務情報文字列１１.<p>
	 *
	 */
	public String attr_char11() {
		return getConstString(offset + 25, $attr_char11);
	}

	/**
	 * Business info. character string 11 業務情報文字列１１.<p>
	 *
	 */
	public void attr_char11(String value) {
		setConstString(offset + 25, $attr_char11, value);
	}


	/**
	 * Business info. character string 12 業務情報文字列１２.<p>
	 *
	 */
	public String attr_char12() {
		return getConstString(offset + 26, $attr_char12);
	}

	/**
	 * Business info. character string 12 業務情報文字列１２.<p>
	 *
	 */
	public void attr_char12(String value) {
		setConstString(offset + 26, $attr_char12, value);
	}


	/**
	 * Business info. character string 13 業務情報文字列１３.<p>
	 *
	 */
	public String attr_char13() {
		return getConstString(offset + 27, $attr_char13);
	}

	/**
	 * Business info. character string 13 業務情報文字列１３.<p>
	 *
	 */
	public void attr_char13(String value) {
		setConstString(offset + 27, $attr_char13, value);
	}


	/**
	 * Business info. character string 14 業務情報文字列１４.<p>
	 *
	 */
	public String attr_char14() {
		return getConstString(offset + 28, $attr_char14);
	}

	/**
	 * Business info. character string 14 業務情報文字列１４.<p>
	 *
	 */
	public void attr_char14(String value) {
		setConstString(offset + 28, $attr_char14, value);
	}


	/**
	 * Business info. character string 15 業務情報文字列１５.<p>
	 *
	 */
	public String attr_char15() {
		return getConstString(offset + 29, $attr_char15);
	}

	/**
	 * Business info. character string 15 業務情報文字列１５.<p>
	 *
	 */
	public void attr_char15(String value) {
		setConstString(offset + 29, $attr_char15, value);
	}


	/**
	 * Business info. character string 16 業務情報文字列１６.<p>
	 *
	 */
	public String attr_char16() {
		return getConstString(offset + 30, $attr_char16);
	}

	/**
	 * Business info. character string 16 業務情報文字列１６.<p>
	 *
	 */
	public void attr_char16(String value) {
		setConstString(offset + 30, $attr_char16, value);
	}


	/**
	 * Business info. character string 17 業務情報文字列１７.<p>
	 *
	 */
	public String attr_char17() {
		return getConstString(offset + 31, $attr_char17);
	}

	/**
	 * Business info. character string 17 業務情報文字列１７.<p>
	 *
	 */
	public void attr_char17(String value) {
		setConstString(offset + 31, $attr_char17, value);
	}


	/**
	 * Business info. character string 18 業務情報文字列１８.<p>
	 *
	 */
	public String attr_char18() {
		return getConstString(offset + 32, $attr_char18);
	}

	/**
	 * Business info. character string 18 業務情報文字列１８.<p>
	 *
	 */
	public void attr_char18(String value) {
		setConstString(offset + 32, $attr_char18, value);
	}


	/**
	 * Business info. character string 19 業務情報文字列１９.<p>
	 *
	 */
	public String attr_char19() {
		return getConstString(offset + 33, $attr_char19);
	}

	/**
	 * Business info. character string 19 業務情報文字列１９.<p>
	 *
	 */
	public void attr_char19(String value) {
		setConstString(offset + 33, $attr_char19, value);
	}


	/**
	 * Business info. character string 20 業務情報文字列２０.<p>
	 *
	 */
	public String attr_char20() {
		return getConstString(offset + 34, $attr_char20);
	}

	/**
	 * Business info. character string 20 業務情報文字列２０.<p>
	 *
	 */
	public void attr_char20(String value) {
		setConstString(offset + 34, $attr_char20, value);
	}


	/**
	 * Business info. character string 21 業務情報文字列２１.<p>
	 *
	 */
	public String attr_char21() {
		return getConstString(offset + 35, $attr_char21);
	}

	/**
	 * Business info. character string 21 業務情報文字列２１.<p>
	 *
	 */
	public void attr_char21(String value) {
		setConstString(offset + 35, $attr_char21, value);
	}


	/**
	 * Business info. character string 22 業務情報文字列２２.<p>
	 *
	 */
	public String attr_char22() {
		return getConstString(offset + 36, $attr_char22);
	}

	/**
	 * Business info. character string 22 業務情報文字列２２.<p>
	 *
	 */
	public void attr_char22(String value) {
		setConstString(offset + 36, $attr_char22, value);
	}


	/**
	 * Business info. character string 23 業務情報文字列２３.<p>
	 *
	 */
	public String attr_char23() {
		return getConstString(offset + 37, $attr_char23);
	}

	/**
	 * Business info. character string 23 業務情報文字列２３.<p>
	 *
	 */
	public void attr_char23(String value) {
		setConstString(offset + 37, $attr_char23, value);
	}


	/**
	 * Business info. character string 24 業務情報文字列２４.<p>
	 *
	 */
	public String attr_char24() {
		return getConstString(offset + 38, $attr_char24);
	}

	/**
	 * Business info. character string 24 業務情報文字列２４.<p>
	 *
	 */
	public void attr_char24(String value) {
		setConstString(offset + 38, $attr_char24, value);
	}


	/**
	 * Business info. character string 25 業務情報文字列２５.<p>
	 *
	 */
	public String attr_char25() {
		return getConstString(offset + 39, $attr_char25);
	}

	/**
	 * Business info. character string 25 業務情報文字列２５.<p>
	 *
	 */
	public void attr_char25(String value) {
		setConstString(offset + 39, $attr_char25, value);
	}


	/**
	 * Business info. character string 26 業務情報文字列２６.<p>
	 *
	 */
	public String attr_char26() {
		return getConstString(offset + 40, $attr_char26);
	}

	/**
	 * Business info. character string 26 業務情報文字列２６.<p>
	 *
	 */
	public void attr_char26(String value) {
		setConstString(offset + 40, $attr_char26, value);
	}


	/**
	 * Business info. character string 27 業務情報文字列２７.<p>
	 *
	 */
	public String attr_char27() {
		return getConstString(offset + 41, $attr_char27);
	}

	/**
	 * Business info. character string 27 業務情報文字列２７.<p>
	 *
	 */
	public void attr_char27(String value) {
		setConstString(offset + 41, $attr_char27, value);
	}


	/**
	 * Business info. character string 28 業務情報文字列２８.<p>
	 *
	 */
	public String attr_char28() {
		return getConstString(offset + 42, $attr_char28);
	}

	/**
	 * Business info. character string 28 業務情報文字列２８.<p>
	 *
	 */
	public void attr_char28(String value) {
		setConstString(offset + 42, $attr_char28, value);
	}


	/**
	 * Business info. character string 29 業務情報文字列２９.<p>
	 *
	 */
	public String attr_char29() {
		return getConstString(offset + 43, $attr_char29);
	}

	/**
	 * Business info. character string 29 業務情報文字列２９.<p>
	 *
	 */
	public void attr_char29(String value) {
		setConstString(offset + 43, $attr_char29, value);
	}


	/**
	 * Business info. character string 30 業務情報文字列３０.<p>
	 *
	 */
	public String attr_char30() {
		return getConstString(offset + 44, $attr_char30);
	}

	/**
	 * Business info. character string 30 業務情報文字列３０.<p>
	 *
	 */
	public void attr_char30(String value) {
		setConstString(offset + 44, $attr_char30, value);
	}


	/**
	 * Business info. numerical value 1 業務情報数値１.<p>
	 *
	 */
	public MCNumber attr_num1() {
		return getConstNumber(offset + 45, $attr_num1);
	}

	/**
	 * Business info. numerical value 1 業務情報数値１.<p>
	 *
	 */
	public void attr_num1(MCNumber value) {
		setConstNumber(offset + 45, $attr_num1, value);
	}

	/**
	 * Business info. numerical value 1 業務情報数値１.<p>
	 *
	 */
	public void attr_num1(int value) {
		setConstNumber(offset + 45, $attr_num1, value);
	}

	/**
	 * Business info. numerical value 1 業務情報数値１.<p>
	 *
	 */
	public void attr_num1(long value) {
		setConstNumber(offset + 45, $attr_num1, value);
	}

	/**
	 * Business info. numerical value 1 業務情報数値１.<p>
	 *
	 */
	public void attr_num1(float value) {
		setConstNumber(offset + 45, $attr_num1, value);
	}

	/**
	 * Business info. numerical value 1 業務情報数値１.<p>
	 *
	 */
	public void attr_num1(double value) {
		setConstNumber(offset + 45, $attr_num1, value);
	}


	/**
	 * Business info. numerical value 2 業務情報数値２.<p>
	 *
	 */
	public MCNumber attr_num2() {
		return getConstNumber(offset + 46, $attr_num2);
	}

	/**
	 * Business info. numerical value 2 業務情報数値２.<p>
	 *
	 */
	public void attr_num2(MCNumber value) {
		setConstNumber(offset + 46, $attr_num2, value);
	}

	/**
	 * Business info. numerical value 2 業務情報数値２.<p>
	 *
	 */
	public void attr_num2(int value) {
		setConstNumber(offset + 46, $attr_num2, value);
	}

	/**
	 * Business info. numerical value 2 業務情報数値２.<p>
	 *
	 */
	public void attr_num2(long value) {
		setConstNumber(offset + 46, $attr_num2, value);
	}

	/**
	 * Business info. numerical value 2 業務情報数値２.<p>
	 *
	 */
	public void attr_num2(float value) {
		setConstNumber(offset + 46, $attr_num2, value);
	}

	/**
	 * Business info. numerical value 2 業務情報数値２.<p>
	 *
	 */
	public void attr_num2(double value) {
		setConstNumber(offset + 46, $attr_num2, value);
	}


	/**
	 * Business info. numerical value 3 業務情報数値３.<p>
	 *
	 */
	public MCNumber attr_num3() {
		return getConstNumber(offset + 47, $attr_num3);
	}

	/**
	 * Business info. numerical value 3 業務情報数値３.<p>
	 *
	 */
	public void attr_num3(MCNumber value) {
		setConstNumber(offset + 47, $attr_num3, value);
	}

	/**
	 * Business info. numerical value 3 業務情報数値３.<p>
	 *
	 */
	public void attr_num3(int value) {
		setConstNumber(offset + 47, $attr_num3, value);
	}

	/**
	 * Business info. numerical value 3 業務情報数値３.<p>
	 *
	 */
	public void attr_num3(long value) {
		setConstNumber(offset + 47, $attr_num3, value);
	}

	/**
	 * Business info. numerical value 3 業務情報数値３.<p>
	 *
	 */
	public void attr_num3(float value) {
		setConstNumber(offset + 47, $attr_num3, value);
	}

	/**
	 * Business info. numerical value 3 業務情報数値３.<p>
	 *
	 */
	public void attr_num3(double value) {
		setConstNumber(offset + 47, $attr_num3, value);
	}


	/**
	 * Business info. numerical value 4 業務情報数値４.<p>
	 *
	 */
	public MCNumber attr_num4() {
		return getConstNumber(offset + 48, $attr_num4);
	}

	/**
	 * Business info. numerical value 4 業務情報数値４.<p>
	 *
	 */
	public void attr_num4(MCNumber value) {
		setConstNumber(offset + 48, $attr_num4, value);
	}

	/**
	 * Business info. numerical value 4 業務情報数値４.<p>
	 *
	 */
	public void attr_num4(int value) {
		setConstNumber(offset + 48, $attr_num4, value);
	}

	/**
	 * Business info. numerical value 4 業務情報数値４.<p>
	 *
	 */
	public void attr_num4(long value) {
		setConstNumber(offset + 48, $attr_num4, value);
	}

	/**
	 * Business info. numerical value 4 業務情報数値４.<p>
	 *
	 */
	public void attr_num4(float value) {
		setConstNumber(offset + 48, $attr_num4, value);
	}

	/**
	 * Business info. numerical value 4 業務情報数値４.<p>
	 *
	 */
	public void attr_num4(double value) {
		setConstNumber(offset + 48, $attr_num4, value);
	}


	/**
	 * Business info. numerical value 5 業務情報数値５.<p>
	 *
	 */
	public MCNumber attr_num5() {
		return getConstNumber(offset + 49, $attr_num5);
	}

	/**
	 * Business info. numerical value 5 業務情報数値５.<p>
	 *
	 */
	public void attr_num5(MCNumber value) {
		setConstNumber(offset + 49, $attr_num5, value);
	}

	/**
	 * Business info. numerical value 5 業務情報数値５.<p>
	 *
	 */
	public void attr_num5(int value) {
		setConstNumber(offset + 49, $attr_num5, value);
	}

	/**
	 * Business info. numerical value 5 業務情報数値５.<p>
	 *
	 */
	public void attr_num5(long value) {
		setConstNumber(offset + 49, $attr_num5, value);
	}

	/**
	 * Business info. numerical value 5 業務情報数値５.<p>
	 *
	 */
	public void attr_num5(float value) {
		setConstNumber(offset + 49, $attr_num5, value);
	}

	/**
	 * Business info. numerical value 5 業務情報数値５.<p>
	 *
	 */
	public void attr_num5(double value) {
		setConstNumber(offset + 49, $attr_num5, value);
	}


	/**
	 * Business info. 16 業務情報１６.<p>
	 *
	 */
	public MCDate attr_dt1() {
		return getConstDate(offset + 50, $attr_dt1);
	}

	/**
	 * Business info. 16 業務情報１６.<p>
	 *
	 */
	public void attr_dt1(MCDate value) {
		setConstDate(offset + 50, $attr_dt1, value);
	}


	/**
	 * Business info. 17 業務情報１７.<p>
	 *
	 */
	public MCDate attr_dt2() {
		return getConstDate(offset + 51, $attr_dt2);
	}

	/**
	 * Business info. 17 業務情報１７.<p>
	 *
	 */
	public void attr_dt2(MCDate value) {
		setConstDate(offset + 51, $attr_dt2, value);
	}


	/**
	 * Business info. 18 業務情報１８.<p>
	 *
	 */
	public MCDate attr_dt3() {
		return getConstDate(offset + 52, $attr_dt3);
	}

	/**
	 * Business info. 18 業務情報１８.<p>
	 *
	 */
	public void attr_dt3(MCDate value) {
		setConstDate(offset + 52, $attr_dt3, value);
	}


	/**
	 * Business info. 19 業務情報１９.<p>
	 *
	 */
	public MCDate attr_dt4() {
		return getConstDate(offset + 53, $attr_dt4);
	}

	/**
	 * Business info. 19 業務情報１９.<p>
	 *
	 */
	public void attr_dt4(MCDate value) {
		setConstDate(offset + 53, $attr_dt4, value);
	}


	/**
	 * Business info. 20 業務情報２０.<p>
	 *
	 */
	public MCDate attr_dt5() {
		return getConstDate(offset + 54, $attr_dt5);
	}

	/**
	 * Business info. 20 業務情報２０.<p>
	 *
	 */
	public void attr_dt5(MCDate value) {
		setConstDate(offset + 54, $attr_dt5, value);
	}


	/**
	 * Business info. date 1 FROM 業務情報日付１ＦＲＯＭ.<p>
	 *
	 */
	public MCDate attr_dt1_fr() {
		return getConstDate(offset + 55, $attr_dt1_fr);
	}

	/**
	 * Business info. date 1 FROM 業務情報日付１ＦＲＯＭ.<p>
	 *
	 */
	public void attr_dt1_fr(MCDate value) {
		setConstDate(offset + 55, $attr_dt1_fr, value);
	}


	/**
	 * Business info. date 1 TO 業務情報日付１ＴＯ.<p>
	 *
	 */
	public MCDate attr_dt1_to() {
		return getConstDate(offset + 56, $attr_dt1_to);
	}

	/**
	 * Business info. date 1 TO 業務情報日付１ＴＯ.<p>
	 *
	 */
	public void attr_dt1_to(MCDate value) {
		setConstDate(offset + 56, $attr_dt1_to, value);
	}


	/**
	 * Business info. date 2 FROM 業務情報日付２ＦＲＯＭ.<p>
	 *
	 */
	public MCDate attr_dt2_fr() {
		return getConstDate(offset + 57, $attr_dt2_fr);
	}

	/**
	 * Business info. date 2 FROM 業務情報日付２ＦＲＯＭ.<p>
	 *
	 */
	public void attr_dt2_fr(MCDate value) {
		setConstDate(offset + 57, $attr_dt2_fr, value);
	}


	/**
	 * Business info. date 2 TO 業務情報日付２ＴＯ.<p>
	 *
	 */
	public MCDate attr_dt2_to() {
		return getConstDate(offset + 58, $attr_dt2_to);
	}

	/**
	 * Business info. date 2 TO 業務情報日付２ＴＯ.<p>
	 *
	 */
	public void attr_dt2_to(MCDate value) {
		setConstDate(offset + 58, $attr_dt2_to, value);
	}


	/**
	 * Business info. date 3 FROM 業務情報日付３ＦＲＯＭ.<p>
	 *
	 */
	public MCDate attr_dt3_fr() {
		return getConstDate(offset + 59, $attr_dt3_fr);
	}

	/**
	 * Business info. date 3 FROM 業務情報日付３ＦＲＯＭ.<p>
	 *
	 */
	public void attr_dt3_fr(MCDate value) {
		setConstDate(offset + 59, $attr_dt3_fr, value);
	}


	/**
	 * Business info. date 3 TO 業務情報日付３ＴＯ.<p>
	 *
	 */
	public MCDate attr_dt3_to() {
		return getConstDate(offset + 60, $attr_dt3_to);
	}

	/**
	 * Business info. date 3 TO 業務情報日付３ＴＯ.<p>
	 *
	 */
	public void attr_dt3_to(MCDate value) {
		setConstDate(offset + 60, $attr_dt3_to, value);
	}


	/**
	 * Business info. date 4 FROM 業務情報日付４ＦＲＯＭ.<p>
	 *
	 */
	public MCDate attr_dt4_fr() {
		return getConstDate(offset + 61, $attr_dt4_fr);
	}

	/**
	 * Business info. date 4 FROM 業務情報日付４ＦＲＯＭ.<p>
	 *
	 */
	public void attr_dt4_fr(MCDate value) {
		setConstDate(offset + 61, $attr_dt4_fr, value);
	}


	/**
	 * Business info. date 4 TO 業務情報日付４ＴＯ.<p>
	 *
	 */
	public MCDate attr_dt4_to() {
		return getConstDate(offset + 62, $attr_dt4_to);
	}

	/**
	 * Business info. date 4 TO 業務情報日付４ＴＯ.<p>
	 *
	 */
	public void attr_dt4_to(MCDate value) {
		setConstDate(offset + 62, $attr_dt4_to, value);
	}


	/**
	 * Business info. date 5 FROM 業務情報日付５ＦＲＯＭ.<p>
	 *
	 */
	public MCDate attr_dt5_fr() {
		return getConstDate(offset + 63, $attr_dt5_fr);
	}

	/**
	 * Business info. date 5 FROM 業務情報日付５ＦＲＯＭ.<p>
	 *
	 */
	public void attr_dt5_fr(MCDate value) {
		setConstDate(offset + 63, $attr_dt5_fr, value);
	}


	/**
	 * Business info. date 5 TO 業務情報日付５ＴＯ.<p>
	 *
	 */
	public MCDate attr_dt5_to() {
		return getConstDate(offset + 64, $attr_dt5_to);
	}

	/**
	 * Business info. date 5 TO 業務情報日付５ＴＯ.<p>
	 *
	 */
	public void attr_dt5_to(MCDate value) {
		setConstDate(offset + 64, $attr_dt5_to, value);
	}


	/**
	 * Business info. date and time 1 FROM 業務情報日時１ＦＲＯＭ.<p>
	 *
	 */
	public MCDate attr_tm1_fr() {
		return getConstDate(offset + 65, $attr_tm1_fr);
	}

	/**
	 * Business info. date and time 1 FROM 業務情報日時１ＦＲＯＭ.<p>
	 *
	 */
	public void attr_tm1_fr(MCDate value) {
		setConstDate(offset + 65, $attr_tm1_fr, value);
	}


	/**
	 * Business info. date and time 1 TO 業務情報日時１ＴＯ.<p>
	 *
	 */
	public MCDate attr_tm1_to() {
		return getConstDate(offset + 66, $attr_tm1_to);
	}

	/**
	 * Business info. date and time 1 TO 業務情報日時１ＴＯ.<p>
	 *
	 */
	public void attr_tm1_to(MCDate value) {
		setConstDate(offset + 66, $attr_tm1_to, value);
	}


	/**
	 * Business info. date and time 2 FROM 業務情報日時２ＦＲＯＭ.<p>
	 *
	 */
	public MCDate attr_tm2_fr() {
		return getConstDate(offset + 67, $attr_tm2_fr);
	}

	/**
	 * Business info. date and time 2 FROM 業務情報日時２ＦＲＯＭ.<p>
	 *
	 */
	public void attr_tm2_fr(MCDate value) {
		setConstDate(offset + 67, $attr_tm2_fr, value);
	}


	/**
	 * Business info. date and time 2 TO 業務情報日時２ＴＯ.<p>
	 *
	 */
	public MCDate attr_tm2_to() {
		return getConstDate(offset + 68, $attr_tm2_to);
	}

	/**
	 * Business info. date and time 2 TO 業務情報日時２ＴＯ.<p>
	 *
	 */
	public void attr_tm2_to(MCDate value) {
		setConstDate(offset + 68, $attr_tm2_to, value);
	}


	/**
	 * Business info. date and time 3 FROM 業務情報日時３ＦＲＯＭ.<p>
	 *
	 */
	public MCDate attr_tm3_fr() {
		return getConstDate(offset + 69, $attr_tm3_fr);
	}

	/**
	 * Business info. date and time 3 FROM 業務情報日時３ＦＲＯＭ.<p>
	 *
	 */
	public void attr_tm3_fr(MCDate value) {
		setConstDate(offset + 69, $attr_tm3_fr, value);
	}


	/**
	 * Business info. date and time 3 TO 業務情報日時３ＴＯ.<p>
	 *
	 */
	public MCDate attr_tm3_to() {
		return getConstDate(offset + 70, $attr_tm3_to);
	}

	/**
	 * Business info. date and time 3 TO 業務情報日時３ＴＯ.<p>
	 *
	 */
	public void attr_tm3_to(MCDate value) {
		setConstDate(offset + 70, $attr_tm3_to, value);
	}


	/**
	 * Business info. date and time 4 FROM 業務情報日時４ＦＲＯＭ.<p>
	 *
	 */
	public MCDate attr_tm4_fr() {
		return getConstDate(offset + 71, $attr_tm4_fr);
	}

	/**
	 * Business info. date and time 4 FROM 業務情報日時４ＦＲＯＭ.<p>
	 *
	 */
	public void attr_tm4_fr(MCDate value) {
		setConstDate(offset + 71, $attr_tm4_fr, value);
	}


	/**
	 * Business info. date and time 4 TO 業務情報日時４ＴＯ.<p>
	 *
	 */
	public MCDate attr_tm4_to() {
		return getConstDate(offset + 72, $attr_tm4_to);
	}

	/**
	 * Business info. date and time 4 TO 業務情報日時４ＴＯ.<p>
	 *
	 */
	public void attr_tm4_to(MCDate value) {
		setConstDate(offset + 72, $attr_tm4_to, value);
	}


	/**
	 * Business info. date and time 5 FROM 業務情報日時５ＦＲＯＭ.<p>
	 *
	 */
	public MCDate attr_tm5_fr() {
		return getConstDate(offset + 73, $attr_tm5_fr);
	}

	/**
	 * Business info. date and time 5 FROM 業務情報日時５ＦＲＯＭ.<p>
	 *
	 */
	public void attr_tm5_fr(MCDate value) {
		setConstDate(offset + 73, $attr_tm5_fr, value);
	}


	/**
	 * Business info. date and time 5 TO 業務情報日時５ＴＯ.<p>
	 *
	 */
	public MCDate attr_tm5_to() {
		return getConstDate(offset + 74, $attr_tm5_to);
	}

	/**
	 * Business info. date and time 5 TO 業務情報日時５ＴＯ.<p>
	 *
	 */
	public void attr_tm5_to(MCDate value) {
		setConstDate(offset + 74, $attr_tm5_to, value);
	}


	public String getString(String name) {
		if ($if_proc_typ.equalsIgnoreCase(name)) {
			return if_proc_typ();
		}
		if ($if_proc_typ_nm.equalsIgnoreCase(name)) {
			return if_proc_typ_nm();
		}
		if ($ext_sys_cd.equalsIgnoreCase(name)) {
			return ext_sys_cd();
		}
		if ($ext_sys_nm.equalsIgnoreCase(name)) {
			return ext_sys_nm();
		}
		if ($file_nm.equalsIgnoreCase(name)) {
			return file_nm();
		}
		if ($batch_log_no.equalsIgnoreCase(name)) {
			return batch_log_no();
		}
		if ($ins_srv_req_no.equalsIgnoreCase(name)) {
			return ins_srv_req_no();
		}
		if ($attr_char1.equalsIgnoreCase(name)) {
			return attr_char1();
		}
		if ($attr_char2.equalsIgnoreCase(name)) {
			return attr_char2();
		}
		if ($attr_char3.equalsIgnoreCase(name)) {
			return attr_char3();
		}
		if ($attr_char4.equalsIgnoreCase(name)) {
			return attr_char4();
		}
		if ($attr_char5.equalsIgnoreCase(name)) {
			return attr_char5();
		}
		if ($attr_char6.equalsIgnoreCase(name)) {
			return attr_char6();
		}
		if ($attr_char7.equalsIgnoreCase(name)) {
			return attr_char7();
		}
		if ($attr_char8.equalsIgnoreCase(name)) {
			return attr_char8();
		}
		if ($attr_char9.equalsIgnoreCase(name)) {
			return attr_char9();
		}
		if ($attr_char10.equalsIgnoreCase(name)) {
			return attr_char10();
		}
		if ($attr_char11.equalsIgnoreCase(name)) {
			return attr_char11();
		}
		if ($attr_char12.equalsIgnoreCase(name)) {
			return attr_char12();
		}
		if ($attr_char13.equalsIgnoreCase(name)) {
			return attr_char13();
		}
		if ($attr_char14.equalsIgnoreCase(name)) {
			return attr_char14();
		}
		if ($attr_char15.equalsIgnoreCase(name)) {
			return attr_char15();
		}
		if ($attr_char16.equalsIgnoreCase(name)) {
			return attr_char16();
		}
		if ($attr_char17.equalsIgnoreCase(name)) {
			return attr_char17();
		}
		if ($attr_char18.equalsIgnoreCase(name)) {
			return attr_char18();
		}
		if ($attr_char19.equalsIgnoreCase(name)) {
			return attr_char19();
		}
		if ($attr_char20.equalsIgnoreCase(name)) {
			return attr_char20();
		}
		if ($attr_char21.equalsIgnoreCase(name)) {
			return attr_char21();
		}
		if ($attr_char22.equalsIgnoreCase(name)) {
			return attr_char22();
		}
		if ($attr_char23.equalsIgnoreCase(name)) {
			return attr_char23();
		}
		if ($attr_char24.equalsIgnoreCase(name)) {
			return attr_char24();
		}
		if ($attr_char25.equalsIgnoreCase(name)) {
			return attr_char25();
		}
		if ($attr_char26.equalsIgnoreCase(name)) {
			return attr_char26();
		}
		if ($attr_char27.equalsIgnoreCase(name)) {
			return attr_char27();
		}
		if ($attr_char28.equalsIgnoreCase(name)) {
			return attr_char28();
		}
		if ($attr_char29.equalsIgnoreCase(name)) {
			return attr_char29();
		}
		if ($attr_char30.equalsIgnoreCase(name)) {
			return attr_char30();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($data_no_fr.equalsIgnoreCase(name)) {
			return data_no_fr();
		}
		if ($data_no_to.equalsIgnoreCase(name)) {
			return data_no_to();
		}
		if ($attr_num1.equalsIgnoreCase(name)) {
			return attr_num1();
		}
		if ($attr_num2.equalsIgnoreCase(name)) {
			return attr_num2();
		}
		if ($attr_num3.equalsIgnoreCase(name)) {
			return attr_num3();
		}
		if ($attr_num4.equalsIgnoreCase(name)) {
			return attr_num4();
		}
		if ($attr_num5.equalsIgnoreCase(name)) {
			return attr_num5();
		}
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		if ($sdrv_tm_fr.equalsIgnoreCase(name)) {
			return sdrv_tm_fr();
		}
		if ($sdrv_tm_to.equalsIgnoreCase(name)) {
			return sdrv_tm_to();
		}
		if ($attr_dt1.equalsIgnoreCase(name)) {
			return attr_dt1();
		}
		if ($attr_dt2.equalsIgnoreCase(name)) {
			return attr_dt2();
		}
		if ($attr_dt3.equalsIgnoreCase(name)) {
			return attr_dt3();
		}
		if ($attr_dt4.equalsIgnoreCase(name)) {
			return attr_dt4();
		}
		if ($attr_dt5.equalsIgnoreCase(name)) {
			return attr_dt5();
		}
		if ($attr_dt1_fr.equalsIgnoreCase(name)) {
			return attr_dt1_fr();
		}
		if ($attr_dt1_to.equalsIgnoreCase(name)) {
			return attr_dt1_to();
		}
		if ($attr_dt2_fr.equalsIgnoreCase(name)) {
			return attr_dt2_fr();
		}
		if ($attr_dt2_to.equalsIgnoreCase(name)) {
			return attr_dt2_to();
		}
		if ($attr_dt3_fr.equalsIgnoreCase(name)) {
			return attr_dt3_fr();
		}
		if ($attr_dt3_to.equalsIgnoreCase(name)) {
			return attr_dt3_to();
		}
		if ($attr_dt4_fr.equalsIgnoreCase(name)) {
			return attr_dt4_fr();
		}
		if ($attr_dt4_to.equalsIgnoreCase(name)) {
			return attr_dt4_to();
		}
		if ($attr_dt5_fr.equalsIgnoreCase(name)) {
			return attr_dt5_fr();
		}
		if ($attr_dt5_to.equalsIgnoreCase(name)) {
			return attr_dt5_to();
		}
		if ($attr_tm1_fr.equalsIgnoreCase(name)) {
			return attr_tm1_fr();
		}
		if ($attr_tm1_to.equalsIgnoreCase(name)) {
			return attr_tm1_to();
		}
		if ($attr_tm2_fr.equalsIgnoreCase(name)) {
			return attr_tm2_fr();
		}
		if ($attr_tm2_to.equalsIgnoreCase(name)) {
			return attr_tm2_to();
		}
		if ($attr_tm3_fr.equalsIgnoreCase(name)) {
			return attr_tm3_fr();
		}
		if ($attr_tm3_to.equalsIgnoreCase(name)) {
			return attr_tm3_to();
		}
		if ($attr_tm4_fr.equalsIgnoreCase(name)) {
			return attr_tm4_fr();
		}
		if ($attr_tm4_to.equalsIgnoreCase(name)) {
			return attr_tm4_to();
		}
		if ($attr_tm5_fr.equalsIgnoreCase(name)) {
			return attr_tm5_fr();
		}
		if ($attr_tm5_to.equalsIgnoreCase(name)) {
			return attr_tm5_to();
		}
		return super.getDate(name);
	}
	public boolean getBoolean(String name) {
		if ($recv_err_flg.equalsIgnoreCase(name)) {
			return recv_err_flg();
		}
		if ($recv_ok_flg.equalsIgnoreCase(name)) {
			return recv_ok_flg();
		}
		if ($recv_conv_err_flg.equalsIgnoreCase(name)) {
			return recv_conv_err_flg();
		}
		if ($recv_conv_ok_flg.equalsIgnoreCase(name)) {
			return recv_conv_ok_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($if_proc_typ.equalsIgnoreCase(name)) {
			return if_proc_typ();
		}
		if ($if_proc_typ_nm.equalsIgnoreCase(name)) {
			return if_proc_typ_nm();
		}
		if ($ext_sys_cd.equalsIgnoreCase(name)) {
			return ext_sys_cd();
		}
		if ($ext_sys_nm.equalsIgnoreCase(name)) {
			return ext_sys_nm();
		}
		if ($file_nm.equalsIgnoreCase(name)) {
			return file_nm();
		}
		if ($batch_log_no.equalsIgnoreCase(name)) {
			return batch_log_no();
		}
		if ($ins_srv_req_no.equalsIgnoreCase(name)) {
			return ins_srv_req_no();
		}
		if ($attr_char1.equalsIgnoreCase(name)) {
			return attr_char1();
		}
		if ($attr_char2.equalsIgnoreCase(name)) {
			return attr_char2();
		}
		if ($attr_char3.equalsIgnoreCase(name)) {
			return attr_char3();
		}
		if ($attr_char4.equalsIgnoreCase(name)) {
			return attr_char4();
		}
		if ($attr_char5.equalsIgnoreCase(name)) {
			return attr_char5();
		}
		if ($attr_char6.equalsIgnoreCase(name)) {
			return attr_char6();
		}
		if ($attr_char7.equalsIgnoreCase(name)) {
			return attr_char7();
		}
		if ($attr_char8.equalsIgnoreCase(name)) {
			return attr_char8();
		}
		if ($attr_char9.equalsIgnoreCase(name)) {
			return attr_char9();
		}
		if ($attr_char10.equalsIgnoreCase(name)) {
			return attr_char10();
		}
		if ($attr_char11.equalsIgnoreCase(name)) {
			return attr_char11();
		}
		if ($attr_char12.equalsIgnoreCase(name)) {
			return attr_char12();
		}
		if ($attr_char13.equalsIgnoreCase(name)) {
			return attr_char13();
		}
		if ($attr_char14.equalsIgnoreCase(name)) {
			return attr_char14();
		}
		if ($attr_char15.equalsIgnoreCase(name)) {
			return attr_char15();
		}
		if ($attr_char16.equalsIgnoreCase(name)) {
			return attr_char16();
		}
		if ($attr_char17.equalsIgnoreCase(name)) {
			return attr_char17();
		}
		if ($attr_char18.equalsIgnoreCase(name)) {
			return attr_char18();
		}
		if ($attr_char19.equalsIgnoreCase(name)) {
			return attr_char19();
		}
		if ($attr_char20.equalsIgnoreCase(name)) {
			return attr_char20();
		}
		if ($attr_char21.equalsIgnoreCase(name)) {
			return attr_char21();
		}
		if ($attr_char22.equalsIgnoreCase(name)) {
			return attr_char22();
		}
		if ($attr_char23.equalsIgnoreCase(name)) {
			return attr_char23();
		}
		if ($attr_char24.equalsIgnoreCase(name)) {
			return attr_char24();
		}
		if ($attr_char25.equalsIgnoreCase(name)) {
			return attr_char25();
		}
		if ($attr_char26.equalsIgnoreCase(name)) {
			return attr_char26();
		}
		if ($attr_char27.equalsIgnoreCase(name)) {
			return attr_char27();
		}
		if ($attr_char28.equalsIgnoreCase(name)) {
			return attr_char28();
		}
		if ($attr_char29.equalsIgnoreCase(name)) {
			return attr_char29();
		}
		if ($attr_char30.equalsIgnoreCase(name)) {
			return attr_char30();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($data_no_fr.equalsIgnoreCase(name)) {
			return data_no_fr();
		}
		if ($data_no_to.equalsIgnoreCase(name)) {
			return data_no_to();
		}
		if ($attr_num1.equalsIgnoreCase(name)) {
			return attr_num1();
		}
		if ($attr_num2.equalsIgnoreCase(name)) {
			return attr_num2();
		}
		if ($attr_num3.equalsIgnoreCase(name)) {
			return attr_num3();
		}
		if ($attr_num4.equalsIgnoreCase(name)) {
			return attr_num4();
		}
		if ($attr_num5.equalsIgnoreCase(name)) {
			return attr_num5();
		}
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($sdrv_tm_fr.equalsIgnoreCase(name)) {
			return sdrv_tm_fr();
		}
		if ($sdrv_tm_to.equalsIgnoreCase(name)) {
			return sdrv_tm_to();
		}
		if ($attr_dt1.equalsIgnoreCase(name)) {
			return attr_dt1();
		}
		if ($attr_dt2.equalsIgnoreCase(name)) {
			return attr_dt2();
		}
		if ($attr_dt3.equalsIgnoreCase(name)) {
			return attr_dt3();
		}
		if ($attr_dt4.equalsIgnoreCase(name)) {
			return attr_dt4();
		}
		if ($attr_dt5.equalsIgnoreCase(name)) {
			return attr_dt5();
		}
		if ($attr_dt1_fr.equalsIgnoreCase(name)) {
			return attr_dt1_fr();
		}
		if ($attr_dt1_to.equalsIgnoreCase(name)) {
			return attr_dt1_to();
		}
		if ($attr_dt2_fr.equalsIgnoreCase(name)) {
			return attr_dt2_fr();
		}
		if ($attr_dt2_to.equalsIgnoreCase(name)) {
			return attr_dt2_to();
		}
		if ($attr_dt3_fr.equalsIgnoreCase(name)) {
			return attr_dt3_fr();
		}
		if ($attr_dt3_to.equalsIgnoreCase(name)) {
			return attr_dt3_to();
		}
		if ($attr_dt4_fr.equalsIgnoreCase(name)) {
			return attr_dt4_fr();
		}
		if ($attr_dt4_to.equalsIgnoreCase(name)) {
			return attr_dt4_to();
		}
		if ($attr_dt5_fr.equalsIgnoreCase(name)) {
			return attr_dt5_fr();
		}
		if ($attr_dt5_to.equalsIgnoreCase(name)) {
			return attr_dt5_to();
		}
		if ($attr_tm1_fr.equalsIgnoreCase(name)) {
			return attr_tm1_fr();
		}
		if ($attr_tm1_to.equalsIgnoreCase(name)) {
			return attr_tm1_to();
		}
		if ($attr_tm2_fr.equalsIgnoreCase(name)) {
			return attr_tm2_fr();
		}
		if ($attr_tm2_to.equalsIgnoreCase(name)) {
			return attr_tm2_to();
		}
		if ($attr_tm3_fr.equalsIgnoreCase(name)) {
			return attr_tm3_fr();
		}
		if ($attr_tm3_to.equalsIgnoreCase(name)) {
			return attr_tm3_to();
		}
		if ($attr_tm4_fr.equalsIgnoreCase(name)) {
			return attr_tm4_fr();
		}
		if ($attr_tm4_to.equalsIgnoreCase(name)) {
			return attr_tm4_to();
		}
		if ($attr_tm5_fr.equalsIgnoreCase(name)) {
			return attr_tm5_fr();
		}
		if ($attr_tm5_to.equalsIgnoreCase(name)) {
			return attr_tm5_to();
		}
		return super.getDateNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($recv_err_flg.equalsIgnoreCase(name)) {
			return recv_err_flg();
		}
		if ($recv_ok_flg.equalsIgnoreCase(name)) {
			return recv_ok_flg();
		}
		if ($recv_conv_err_flg.equalsIgnoreCase(name)) {
			return recv_conv_err_flg();
		}
		if ($recv_conv_ok_flg.equalsIgnoreCase(name)) {
			return recv_conv_ok_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($if_proc_typ.equalsIgnoreCase(name)) {
			if_proc_typ(value);
			return;
		}
		if ($if_proc_typ_nm.equalsIgnoreCase(name)) {
			if_proc_typ_nm(value);
			return;
		}
		if ($ext_sys_cd.equalsIgnoreCase(name)) {
			ext_sys_cd(value);
			return;
		}
		if ($ext_sys_nm.equalsIgnoreCase(name)) {
			ext_sys_nm(value);
			return;
		}
		if ($file_nm.equalsIgnoreCase(name)) {
			file_nm(value);
			return;
		}
		if ($batch_log_no.equalsIgnoreCase(name)) {
			batch_log_no(value);
			return;
		}
		if ($ins_srv_req_no.equalsIgnoreCase(name)) {
			ins_srv_req_no(value);
			return;
		}
		if ($attr_char1.equalsIgnoreCase(name)) {
			attr_char1(value);
			return;
		}
		if ($attr_char2.equalsIgnoreCase(name)) {
			attr_char2(value);
			return;
		}
		if ($attr_char3.equalsIgnoreCase(name)) {
			attr_char3(value);
			return;
		}
		if ($attr_char4.equalsIgnoreCase(name)) {
			attr_char4(value);
			return;
		}
		if ($attr_char5.equalsIgnoreCase(name)) {
			attr_char5(value);
			return;
		}
		if ($attr_char6.equalsIgnoreCase(name)) {
			attr_char6(value);
			return;
		}
		if ($attr_char7.equalsIgnoreCase(name)) {
			attr_char7(value);
			return;
		}
		if ($attr_char8.equalsIgnoreCase(name)) {
			attr_char8(value);
			return;
		}
		if ($attr_char9.equalsIgnoreCase(name)) {
			attr_char9(value);
			return;
		}
		if ($attr_char10.equalsIgnoreCase(name)) {
			attr_char10(value);
			return;
		}
		if ($attr_char11.equalsIgnoreCase(name)) {
			attr_char11(value);
			return;
		}
		if ($attr_char12.equalsIgnoreCase(name)) {
			attr_char12(value);
			return;
		}
		if ($attr_char13.equalsIgnoreCase(name)) {
			attr_char13(value);
			return;
		}
		if ($attr_char14.equalsIgnoreCase(name)) {
			attr_char14(value);
			return;
		}
		if ($attr_char15.equalsIgnoreCase(name)) {
			attr_char15(value);
			return;
		}
		if ($attr_char16.equalsIgnoreCase(name)) {
			attr_char16(value);
			return;
		}
		if ($attr_char17.equalsIgnoreCase(name)) {
			attr_char17(value);
			return;
		}
		if ($attr_char18.equalsIgnoreCase(name)) {
			attr_char18(value);
			return;
		}
		if ($attr_char19.equalsIgnoreCase(name)) {
			attr_char19(value);
			return;
		}
		if ($attr_char20.equalsIgnoreCase(name)) {
			attr_char20(value);
			return;
		}
		if ($attr_char21.equalsIgnoreCase(name)) {
			attr_char21(value);
			return;
		}
		if ($attr_char22.equalsIgnoreCase(name)) {
			attr_char22(value);
			return;
		}
		if ($attr_char23.equalsIgnoreCase(name)) {
			attr_char23(value);
			return;
		}
		if ($attr_char24.equalsIgnoreCase(name)) {
			attr_char24(value);
			return;
		}
		if ($attr_char25.equalsIgnoreCase(name)) {
			attr_char25(value);
			return;
		}
		if ($attr_char26.equalsIgnoreCase(name)) {
			attr_char26(value);
			return;
		}
		if ($attr_char27.equalsIgnoreCase(name)) {
			attr_char27(value);
			return;
		}
		if ($attr_char28.equalsIgnoreCase(name)) {
			attr_char28(value);
			return;
		}
		if ($attr_char29.equalsIgnoreCase(name)) {
			attr_char29(value);
			return;
		}
		if ($attr_char30.equalsIgnoreCase(name)) {
			attr_char30(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($data_no_fr.equalsIgnoreCase(name)) {
			data_no_fr(value);
			return;
		}
		if ($data_no_to.equalsIgnoreCase(name)) {
			data_no_to(value);
			return;
		}
		if ($attr_num1.equalsIgnoreCase(name)) {
			attr_num1(value);
			return;
		}
		if ($attr_num2.equalsIgnoreCase(name)) {
			attr_num2(value);
			return;
		}
		if ($attr_num3.equalsIgnoreCase(name)) {
			attr_num3(value);
			return;
		}
		if ($attr_num4.equalsIgnoreCase(name)) {
			attr_num4(value);
			return;
		}
		if ($attr_num5.equalsIgnoreCase(name)) {
			attr_num5(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($data_no_fr.equalsIgnoreCase(name)) {
			data_no_fr(value);
			return;
		}
		if ($data_no_to.equalsIgnoreCase(name)) {
			data_no_to(value);
			return;
		}
		if ($attr_num1.equalsIgnoreCase(name)) {
			attr_num1(value);
			return;
		}
		if ($attr_num2.equalsIgnoreCase(name)) {
			attr_num2(value);
			return;
		}
		if ($attr_num3.equalsIgnoreCase(name)) {
			attr_num3(value);
			return;
		}
		if ($attr_num4.equalsIgnoreCase(name)) {
			attr_num4(value);
			return;
		}
		if ($attr_num5.equalsIgnoreCase(name)) {
			attr_num5(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($data_no_fr.equalsIgnoreCase(name)) {
			data_no_fr(value);
			return;
		}
		if ($data_no_to.equalsIgnoreCase(name)) {
			data_no_to(value);
			return;
		}
		if ($attr_num1.equalsIgnoreCase(name)) {
			attr_num1(value);
			return;
		}
		if ($attr_num2.equalsIgnoreCase(name)) {
			attr_num2(value);
			return;
		}
		if ($attr_num3.equalsIgnoreCase(name)) {
			attr_num3(value);
			return;
		}
		if ($attr_num4.equalsIgnoreCase(name)) {
			attr_num4(value);
			return;
		}
		if ($attr_num5.equalsIgnoreCase(name)) {
			attr_num5(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($data_no_fr.equalsIgnoreCase(name)) {
			data_no_fr(value);
			return;
		}
		if ($data_no_to.equalsIgnoreCase(name)) {
			data_no_to(value);
			return;
		}
		if ($attr_num1.equalsIgnoreCase(name)) {
			attr_num1(value);
			return;
		}
		if ($attr_num2.equalsIgnoreCase(name)) {
			attr_num2(value);
			return;
		}
		if ($attr_num3.equalsIgnoreCase(name)) {
			attr_num3(value);
			return;
		}
		if ($attr_num4.equalsIgnoreCase(name)) {
			attr_num4(value);
			return;
		}
		if ($attr_num5.equalsIgnoreCase(name)) {
			attr_num5(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($data_no_fr.equalsIgnoreCase(name)) {
			data_no_fr(value);
			return;
		}
		if ($data_no_to.equalsIgnoreCase(name)) {
			data_no_to(value);
			return;
		}
		if ($attr_num1.equalsIgnoreCase(name)) {
			attr_num1(value);
			return;
		}
		if ($attr_num2.equalsIgnoreCase(name)) {
			attr_num2(value);
			return;
		}
		if ($attr_num3.equalsIgnoreCase(name)) {
			attr_num3(value);
			return;
		}
		if ($attr_num4.equalsIgnoreCase(name)) {
			attr_num4(value);
			return;
		}
		if ($attr_num5.equalsIgnoreCase(name)) {
			attr_num5(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($sdrv_tm_fr.equalsIgnoreCase(name)) {
			sdrv_tm_fr(value);
			return;
		}
		if ($sdrv_tm_to.equalsIgnoreCase(name)) {
			sdrv_tm_to(value);
			return;
		}
		if ($attr_dt1.equalsIgnoreCase(name)) {
			attr_dt1(value);
			return;
		}
		if ($attr_dt2.equalsIgnoreCase(name)) {
			attr_dt2(value);
			return;
		}
		if ($attr_dt3.equalsIgnoreCase(name)) {
			attr_dt3(value);
			return;
		}
		if ($attr_dt4.equalsIgnoreCase(name)) {
			attr_dt4(value);
			return;
		}
		if ($attr_dt5.equalsIgnoreCase(name)) {
			attr_dt5(value);
			return;
		}
		if ($attr_dt1_fr.equalsIgnoreCase(name)) {
			attr_dt1_fr(value);
			return;
		}
		if ($attr_dt1_to.equalsIgnoreCase(name)) {
			attr_dt1_to(value);
			return;
		}
		if ($attr_dt2_fr.equalsIgnoreCase(name)) {
			attr_dt2_fr(value);
			return;
		}
		if ($attr_dt2_to.equalsIgnoreCase(name)) {
			attr_dt2_to(value);
			return;
		}
		if ($attr_dt3_fr.equalsIgnoreCase(name)) {
			attr_dt3_fr(value);
			return;
		}
		if ($attr_dt3_to.equalsIgnoreCase(name)) {
			attr_dt3_to(value);
			return;
		}
		if ($attr_dt4_fr.equalsIgnoreCase(name)) {
			attr_dt4_fr(value);
			return;
		}
		if ($attr_dt4_to.equalsIgnoreCase(name)) {
			attr_dt4_to(value);
			return;
		}
		if ($attr_dt5_fr.equalsIgnoreCase(name)) {
			attr_dt5_fr(value);
			return;
		}
		if ($attr_dt5_to.equalsIgnoreCase(name)) {
			attr_dt5_to(value);
			return;
		}
		if ($attr_tm1_fr.equalsIgnoreCase(name)) {
			attr_tm1_fr(value);
			return;
		}
		if ($attr_tm1_to.equalsIgnoreCase(name)) {
			attr_tm1_to(value);
			return;
		}
		if ($attr_tm2_fr.equalsIgnoreCase(name)) {
			attr_tm2_fr(value);
			return;
		}
		if ($attr_tm2_to.equalsIgnoreCase(name)) {
			attr_tm2_to(value);
			return;
		}
		if ($attr_tm3_fr.equalsIgnoreCase(name)) {
			attr_tm3_fr(value);
			return;
		}
		if ($attr_tm3_to.equalsIgnoreCase(name)) {
			attr_tm3_to(value);
			return;
		}
		if ($attr_tm4_fr.equalsIgnoreCase(name)) {
			attr_tm4_fr(value);
			return;
		}
		if ($attr_tm4_to.equalsIgnoreCase(name)) {
			attr_tm4_to(value);
			return;
		}
		if ($attr_tm5_fr.equalsIgnoreCase(name)) {
			attr_tm5_fr(value);
			return;
		}
		if ($attr_tm5_to.equalsIgnoreCase(name)) {
			attr_tm5_to(value);
			return;
		}
		super.setDate(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($recv_err_flg.equalsIgnoreCase(name)) {
			recv_err_flg(value);
			return;
		}
		if ($recv_ok_flg.equalsIgnoreCase(name)) {
			recv_ok_flg(value);
			return;
		}
		if ($recv_conv_err_flg.equalsIgnoreCase(name)) {
			recv_conv_err_flg(value);
			return;
		}
		if ($recv_conv_ok_flg.equalsIgnoreCase(name)) {
			recv_conv_ok_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($if_proc_typ.equalsIgnoreCase(name)) {
			if_proc_typ(value);
			return;
		}
		if ($if_proc_typ_nm.equalsIgnoreCase(name)) {
			if_proc_typ_nm(value);
			return;
		}
		if ($ext_sys_cd.equalsIgnoreCase(name)) {
			ext_sys_cd(value);
			return;
		}
		if ($ext_sys_nm.equalsIgnoreCase(name)) {
			ext_sys_nm(value);
			return;
		}
		if ($file_nm.equalsIgnoreCase(name)) {
			file_nm(value);
			return;
		}
		if ($batch_log_no.equalsIgnoreCase(name)) {
			batch_log_no(value);
			return;
		}
		if ($ins_srv_req_no.equalsIgnoreCase(name)) {
			ins_srv_req_no(value);
			return;
		}
		if ($attr_char1.equalsIgnoreCase(name)) {
			attr_char1(value);
			return;
		}
		if ($attr_char2.equalsIgnoreCase(name)) {
			attr_char2(value);
			return;
		}
		if ($attr_char3.equalsIgnoreCase(name)) {
			attr_char3(value);
			return;
		}
		if ($attr_char4.equalsIgnoreCase(name)) {
			attr_char4(value);
			return;
		}
		if ($attr_char5.equalsIgnoreCase(name)) {
			attr_char5(value);
			return;
		}
		if ($attr_char6.equalsIgnoreCase(name)) {
			attr_char6(value);
			return;
		}
		if ($attr_char7.equalsIgnoreCase(name)) {
			attr_char7(value);
			return;
		}
		if ($attr_char8.equalsIgnoreCase(name)) {
			attr_char8(value);
			return;
		}
		if ($attr_char9.equalsIgnoreCase(name)) {
			attr_char9(value);
			return;
		}
		if ($attr_char10.equalsIgnoreCase(name)) {
			attr_char10(value);
			return;
		}
		if ($attr_char11.equalsIgnoreCase(name)) {
			attr_char11(value);
			return;
		}
		if ($attr_char12.equalsIgnoreCase(name)) {
			attr_char12(value);
			return;
		}
		if ($attr_char13.equalsIgnoreCase(name)) {
			attr_char13(value);
			return;
		}
		if ($attr_char14.equalsIgnoreCase(name)) {
			attr_char14(value);
			return;
		}
		if ($attr_char15.equalsIgnoreCase(name)) {
			attr_char15(value);
			return;
		}
		if ($attr_char16.equalsIgnoreCase(name)) {
			attr_char16(value);
			return;
		}
		if ($attr_char17.equalsIgnoreCase(name)) {
			attr_char17(value);
			return;
		}
		if ($attr_char18.equalsIgnoreCase(name)) {
			attr_char18(value);
			return;
		}
		if ($attr_char19.equalsIgnoreCase(name)) {
			attr_char19(value);
			return;
		}
		if ($attr_char20.equalsIgnoreCase(name)) {
			attr_char20(value);
			return;
		}
		if ($attr_char21.equalsIgnoreCase(name)) {
			attr_char21(value);
			return;
		}
		if ($attr_char22.equalsIgnoreCase(name)) {
			attr_char22(value);
			return;
		}
		if ($attr_char23.equalsIgnoreCase(name)) {
			attr_char23(value);
			return;
		}
		if ($attr_char24.equalsIgnoreCase(name)) {
			attr_char24(value);
			return;
		}
		if ($attr_char25.equalsIgnoreCase(name)) {
			attr_char25(value);
			return;
		}
		if ($attr_char26.equalsIgnoreCase(name)) {
			attr_char26(value);
			return;
		}
		if ($attr_char27.equalsIgnoreCase(name)) {
			attr_char27(value);
			return;
		}
		if ($attr_char28.equalsIgnoreCase(name)) {
			attr_char28(value);
			return;
		}
		if ($attr_char29.equalsIgnoreCase(name)) {
			attr_char29(value);
			return;
		}
		if ($attr_char30.equalsIgnoreCase(name)) {
			attr_char30(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($data_no_fr.equalsIgnoreCase(name)) {
			data_no_fr(value);
			return;
		}
		if ($data_no_to.equalsIgnoreCase(name)) {
			data_no_to(value);
			return;
		}
		if ($attr_num1.equalsIgnoreCase(name)) {
			attr_num1(value);
			return;
		}
		if ($attr_num2.equalsIgnoreCase(name)) {
			attr_num2(value);
			return;
		}
		if ($attr_num3.equalsIgnoreCase(name)) {
			attr_num3(value);
			return;
		}
		if ($attr_num4.equalsIgnoreCase(name)) {
			attr_num4(value);
			return;
		}
		if ($attr_num5.equalsIgnoreCase(name)) {
			attr_num5(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($data_no_fr.equalsIgnoreCase(name)) {
			data_no_fr(value);
			return;
		}
		if ($data_no_to.equalsIgnoreCase(name)) {
			data_no_to(value);
			return;
		}
		if ($attr_num1.equalsIgnoreCase(name)) {
			attr_num1(value);
			return;
		}
		if ($attr_num2.equalsIgnoreCase(name)) {
			attr_num2(value);
			return;
		}
		if ($attr_num3.equalsIgnoreCase(name)) {
			attr_num3(value);
			return;
		}
		if ($attr_num4.equalsIgnoreCase(name)) {
			attr_num4(value);
			return;
		}
		if ($attr_num5.equalsIgnoreCase(name)) {
			attr_num5(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($data_no_fr.equalsIgnoreCase(name)) {
			data_no_fr(value);
			return;
		}
		if ($data_no_to.equalsIgnoreCase(name)) {
			data_no_to(value);
			return;
		}
		if ($attr_num1.equalsIgnoreCase(name)) {
			attr_num1(value);
			return;
		}
		if ($attr_num2.equalsIgnoreCase(name)) {
			attr_num2(value);
			return;
		}
		if ($attr_num3.equalsIgnoreCase(name)) {
			attr_num3(value);
			return;
		}
		if ($attr_num4.equalsIgnoreCase(name)) {
			attr_num4(value);
			return;
		}
		if ($attr_num5.equalsIgnoreCase(name)) {
			attr_num5(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($data_no_fr.equalsIgnoreCase(name)) {
			data_no_fr(value);
			return;
		}
		if ($data_no_to.equalsIgnoreCase(name)) {
			data_no_to(value);
			return;
		}
		if ($attr_num1.equalsIgnoreCase(name)) {
			attr_num1(value);
			return;
		}
		if ($attr_num2.equalsIgnoreCase(name)) {
			attr_num2(value);
			return;
		}
		if ($attr_num3.equalsIgnoreCase(name)) {
			attr_num3(value);
			return;
		}
		if ($attr_num4.equalsIgnoreCase(name)) {
			attr_num4(value);
			return;
		}
		if ($attr_num5.equalsIgnoreCase(name)) {
			attr_num5(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($data_no_fr.equalsIgnoreCase(name)) {
			data_no_fr(value);
			return;
		}
		if ($data_no_to.equalsIgnoreCase(name)) {
			data_no_to(value);
			return;
		}
		if ($attr_num1.equalsIgnoreCase(name)) {
			attr_num1(value);
			return;
		}
		if ($attr_num2.equalsIgnoreCase(name)) {
			attr_num2(value);
			return;
		}
		if ($attr_num3.equalsIgnoreCase(name)) {
			attr_num3(value);
			return;
		}
		if ($attr_num4.equalsIgnoreCase(name)) {
			attr_num4(value);
			return;
		}
		if ($attr_num5.equalsIgnoreCase(name)) {
			attr_num5(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($sdrv_tm_fr.equalsIgnoreCase(name)) {
			sdrv_tm_fr(value);
			return;
		}
		if ($sdrv_tm_to.equalsIgnoreCase(name)) {
			sdrv_tm_to(value);
			return;
		}
		if ($attr_dt1.equalsIgnoreCase(name)) {
			attr_dt1(value);
			return;
		}
		if ($attr_dt2.equalsIgnoreCase(name)) {
			attr_dt2(value);
			return;
		}
		if ($attr_dt3.equalsIgnoreCase(name)) {
			attr_dt3(value);
			return;
		}
		if ($attr_dt4.equalsIgnoreCase(name)) {
			attr_dt4(value);
			return;
		}
		if ($attr_dt5.equalsIgnoreCase(name)) {
			attr_dt5(value);
			return;
		}
		if ($attr_dt1_fr.equalsIgnoreCase(name)) {
			attr_dt1_fr(value);
			return;
		}
		if ($attr_dt1_to.equalsIgnoreCase(name)) {
			attr_dt1_to(value);
			return;
		}
		if ($attr_dt2_fr.equalsIgnoreCase(name)) {
			attr_dt2_fr(value);
			return;
		}
		if ($attr_dt2_to.equalsIgnoreCase(name)) {
			attr_dt2_to(value);
			return;
		}
		if ($attr_dt3_fr.equalsIgnoreCase(name)) {
			attr_dt3_fr(value);
			return;
		}
		if ($attr_dt3_to.equalsIgnoreCase(name)) {
			attr_dt3_to(value);
			return;
		}
		if ($attr_dt4_fr.equalsIgnoreCase(name)) {
			attr_dt4_fr(value);
			return;
		}
		if ($attr_dt4_to.equalsIgnoreCase(name)) {
			attr_dt4_to(value);
			return;
		}
		if ($attr_dt5_fr.equalsIgnoreCase(name)) {
			attr_dt5_fr(value);
			return;
		}
		if ($attr_dt5_to.equalsIgnoreCase(name)) {
			attr_dt5_to(value);
			return;
		}
		if ($attr_tm1_fr.equalsIgnoreCase(name)) {
			attr_tm1_fr(value);
			return;
		}
		if ($attr_tm1_to.equalsIgnoreCase(name)) {
			attr_tm1_to(value);
			return;
		}
		if ($attr_tm2_fr.equalsIgnoreCase(name)) {
			attr_tm2_fr(value);
			return;
		}
		if ($attr_tm2_to.equalsIgnoreCase(name)) {
			attr_tm2_to(value);
			return;
		}
		if ($attr_tm3_fr.equalsIgnoreCase(name)) {
			attr_tm3_fr(value);
			return;
		}
		if ($attr_tm3_to.equalsIgnoreCase(name)) {
			attr_tm3_to(value);
			return;
		}
		if ($attr_tm4_fr.equalsIgnoreCase(name)) {
			attr_tm4_fr(value);
			return;
		}
		if ($attr_tm4_to.equalsIgnoreCase(name)) {
			attr_tm4_to(value);
			return;
		}
		if ($attr_tm5_fr.equalsIgnoreCase(name)) {
			attr_tm5_fr(value);
			return;
		}
		if ($attr_tm5_to.equalsIgnoreCase(name)) {
			attr_tm5_to(value);
			return;
		}
		super.setDateNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($recv_err_flg.equalsIgnoreCase(name)) {
			recv_err_flg(value);
			return;
		}
		if ($recv_ok_flg.equalsIgnoreCase(name)) {
			recv_ok_flg(value);
			return;
		}
		if ($recv_conv_err_flg.equalsIgnoreCase(name)) {
			recv_conv_err_flg(value);
			return;
		}
		if ($recv_conv_ok_flg.equalsIgnoreCase(name)) {
			recv_conv_ok_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

