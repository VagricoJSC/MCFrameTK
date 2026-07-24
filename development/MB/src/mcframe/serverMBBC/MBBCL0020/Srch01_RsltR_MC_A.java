package mcframe.serverMBBC.MBBCL0020;

import java.util.List;
import java.util.Map;
import java.util.Set;
import mcframe.commonCore.container.MCExtMap;
import mcframe.commonCore.container.MCExtList;
import mcframe.commonCore.container.MCConstRow;
import mcframe.commonCore.container.MCRow;
import mcframe.commonCore.container.MCContainerMeta;
import mcframe.commonCore.meta.MCMeta;
import mcframe.commonCore.lang.MCNumber;
import mcframe.commonCore.lang.MCDate;
import mcframe.commonCore.lang.MCTimestamp;
import mcframe.commonCore.lang.MCDataType;
import mcframe.commonCore.lang.MCBinary;

/**
 * ブロック"Srch01_Rslt"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class Srch01_RsltR_MC_A extends MCConstRow {

	/**
	 * Attached 添付済.<p>
	 *
	 */
	public static final String $archive_flg = "archive_flg";
	/**
	 * Report management No. 帳票管理ＮＯ.<p>
	 *
	 */
	public static final String $data_no = "data_no";
	/**
	 * Version 版.<p>
	 *
	 */
	public static final String $edition = "edition";
	/**
	 * Business type 業務区分.<p>
	 *
	 */
	public static final String $biz_typ = "biz_typ";
	/**
	 * Business type name 業務区分名.<p>
	 *
	 */
	public static final String $biz_typ_nm = "biz_typ_nm";
	/**
	 * Business key 1 業務キー１.<p>
	 *
	 */
	public static final String $biz_key1 = "biz_key1";
	/**
	 * Business key 2 業務キー２.<p>
	 *
	 */
	public static final String $biz_key2 = "biz_key2";
	/**
	 * Business key 3 業務キー３.<p>
	 *
	 */
	public static final String $biz_key3 = "biz_key3";
	/**
	 * Business key 4 業務キー４.<p>
	 *
	 */
	public static final String $biz_key4 = "biz_key4";
	/**
	 * Business key 5 業務キー５.<p>
	 *
	 */
	public static final String $biz_key5 = "biz_key5";
	/**
	 * Business key 6 業務キー６.<p>
	 *
	 */
	public static final String $biz_key6 = "biz_key6";
	/**
	 * Business key 7 業務キー７.<p>
	 *
	 */
	public static final String $biz_key7 = "biz_key7";
	/**
	 * Business key 8 業務キー８.<p>
	 *
	 */
	public static final String $biz_key8 = "biz_key8";
	/**
	 * Business key 9 業務キー９.<p>
	 *
	 */
	public static final String $biz_key9 = "biz_key9";
	/**
	 * Business key 10 業務キー１０.<p>
	 *
	 */
	public static final String $biz_key10 = "biz_key10";
	/**
	 * Transaction date 取引年月日.<p>
	 *
	 */
	public static final String $dt = "dt";
	/**
	 * BP cd. 取引先ＣＤ.<p>
	 *
	 */
	public static final String $bp_cd = "bp_cd";
	/**
	 * BP name 取引先名.<p>
	 *
	 */
	public static final String $bp_nm = "bp_nm";
	/**
	 * Transaction currency cd. 取引通貨ＣＤ.<p>
	 *
	 */
	public static final String $cur_cd = "cur_cd";
	/**
	 * Transaction currency name 取引通貨名.<p>
	 *
	 */
	public static final String $cur_nm = "cur_nm";
	/**
	 * Transaction amount 取引金額.<p>
	 *
	 */
	public static final String $amt = "amt";
	/**
	 * External system cd. 外部システムＣＤ.<p>
	 *
	 */
	public static final String $ext_sys_cd = "ext_sys_cd";
	/**
	 * File server ファイルサーバ.<p>
	 *
	 */
	public static final String $fs_flg = "fs_flg";
	public static final String $doc_id = "doc_id";
	public static final String $preview_url = "preview_url";
	/**
	 * Remarks 1 備考１.<p>
	 *
	 */
	public static final String $rmrks1 = "rmrks1";
	/**
	 * Remarks 2 備考２.<p>
	 *
	 */
	public static final String $rmrks2 = "rmrks2";
	/**
	 * Remarks 3 備考３.<p>
	 *
	 */
	public static final String $rmrks3 = "rmrks3";
	/**
	 * Remarks 4 備考４.<p>
	 *
	 */
	public static final String $rmrks4 = "rmrks4";
	/**
	 * Remarks 5 備考５.<p>
	 *
	 */
	public static final String $rmrks5 = "rmrks5";
	/**
	 * Storage location file path 保存先ファイルパス.<p>
	 *
	 */
	public static final String $file_path = "file_path";
	/**
	 * Storage location file name 保存先ファイル名.<p>
	 *
	 */
	public static final String $file_nm = "file_nm";
	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public static final String $wg_cd = "wg_cd";
	/**
	 * Sales dept. cd. 売上部門ＣＤ.<p>
	 *
	 */
	public static final String $sls_dpt_cd = "sls_dpt_cd";
	/**
	 * Purchasing dept. cd. 購買部門ＣＤ.<p>
	 *
	 */
	public static final String $purc_dpt_cd = "purc_dpt_cd";
	/**
	 * AR dept. cd. 債権部門ＣＤ.<p>
	 *
	 */
	public static final String $ar_dpt_cd = "ar_dpt_cd";
	/**
	 * Billing dept. cd. 請求部門ＣＤ.<p>
	 *
	 */
	public static final String $bill_dpt_cd = "bill_dpt_cd";
	/**
	 * Cd. of dept. in charge of scheduled payee 支払予定管理先担当部門ＣＤ.<p>
	 *
	 */
	public static final String $bsppl_dpt_cd = "bsppl_dpt_cd";
	/**
	 * Delivery destination cd. 納品先ＣＤ.<p>
	 *
	 */
	public static final String $dlv_cd = "dlv_cd";
	/**
	 * Distribution channel cd. 1 仕向先ＣＤ１.<p>
	 *
	 */
	public static final String $dest_cd1 = "dest_cd1";
	/**
	 * Distribution channel cd. 2 仕向先ＣＤ２.<p>
	 *
	 */
	public static final String $dest_cd2 = "dest_cd2";
	/**
	 * Distribution channel cd. 3 仕向先ＣＤ３.<p>
	 *
	 */
	public static final String $dest_cd3 = "dest_cd3";
	/**
	 * Customer cd. 得意先ＣＤ.<p>
	 *
	 */
	public static final String $cst_cd = "cst_cd";
	/**
	 * AR customer cd. 売掛先ＣＤ.<p>
	 *
	 */
	public static final String $acst_cd = "acst_cd";
	/**
	 * Billing customer cd. 請求先ＣＤ.<p>
	 *
	 */
	public static final String $bcst_cd = "bcst_cd";
	/**
	 * Supplier cd. 発注先ＣＤ.<p>
	 *
	 */
	public static final String $sppl_cd = "sppl_cd";
	/**
	 * AP supplier cd. 買掛先ＣＤ.<p>
	 *
	 */
	public static final String $asppl_cd = "asppl_cd";
	/**
	 * Scheduled payee cd. 支払予定管理先ＣＤ.<p>
	 *
	 */
	public static final String $bsppl_cd = "bsppl_cd";
	/**
	 * Payee cd. 支払先ＣＤ.<p>
	 *
	 */
	public static final String $psppl_cd = "psppl_cd";
	/**
	 * Country cd. 国ＣＤ.<p>
	 *
	 */
	public static final String $cntry_cd = "cntry_cd";
	/**
	 * Taxpaying currency cd. 納税通貨ＣＤ.<p>
	 *
	 */
	public static final String $ptax_cur_cd = "ptax_cur_cd";
	/**
	 * Sales project No. 案件ＮＯ.<p>
	 *
	 */
	public static final String $wrk_no = "wrk_no";
	/**
	 * Transaction terms cd. 1 取引条件ＣＤ１.<p>
	 *
	 */
	public static final String $tterm_cd1 = "tterm_cd1";
	/**
	 * Transaction terms cd. 2 取引条件ＣＤ２.<p>
	 *
	 */
	public static final String $tterm_cd2 = "tterm_cd2";
	/**
	 * Transaction terms cd. 3 取引条件ＣＤ３.<p>
	 *
	 */
	public static final String $tterm_cd3 = "tterm_cd3";
	/**
	 * EDI spare CHAR column 1 ＥＤＩ予備ＣＨＡＲ項目１.<p>
	 *
	 */
	public static final String $edi_sub_char1 = "edi_sub_char1";
	/**
	 * EDI spare CHAR column 2 ＥＤＩ予備ＣＨＡＲ項目２.<p>
	 *
	 */
	public static final String $edi_sub_char2 = "edi_sub_char2";
	/**
	 * EDI spare CHAR column 3 ＥＤＩ予備ＣＨＡＲ項目３.<p>
	 *
	 */
	public static final String $edi_sub_char3 = "edi_sub_char3";
	/**
	 * EDI spare CHAR column 4 ＥＤＩ予備ＣＨＡＲ項目４.<p>
	 *
	 */
	public static final String $edi_sub_char4 = "edi_sub_char4";
	/**
	 * EDI spare CHAR column 5 ＥＤＩ予備ＣＨＡＲ項目５.<p>
	 *
	 */
	public static final String $edi_sub_char5 = "edi_sub_char5";
	/**
	 * Report attribute 1 帳票属性１.<p>
	 *
	 */
	public static final String $rpt_attr1 = "rpt_attr1";
	/**
	 * Report attribute 2 帳票属性２.<p>
	 *
	 */
	public static final String $rpt_attr2 = "rpt_attr2";
	/**
	 * Report attribute 3 帳票属性３.<p>
	 *
	 */
	public static final String $rpt_attr3 = "rpt_attr3";
	/**
	 * Report attribute 4 帳票属性４.<p>
	 *
	 */
	public static final String $rpt_attr4 = "rpt_attr4";
	/**
	 * Report attribute 5 帳票属性５.<p>
	 *
	 */
	public static final String $rpt_attr5 = "rpt_attr5";
	/**
	 * Report attribute 6 帳票属性６.<p>
	 *
	 */
	public static final String $rpt_attr6 = "rpt_attr6";
	/**
	 * Report attribute 7 帳票属性７.<p>
	 *
	 */
	public static final String $rpt_attr7 = "rpt_attr7";
	/**
	 * Report attribute 8 帳票属性８.<p>
	 *
	 */
	public static final String $rpt_attr8 = "rpt_attr8";
	/**
	 * Report attribute 9 帳票属性９.<p>
	 *
	 */
	public static final String $rpt_attr9 = "rpt_attr9";
	/**
	 * Report attribute 10 帳票属性１０.<p>
	 *
	 */
	public static final String $rpt_attr10 = "rpt_attr10";
	/**
	 * Report attribute 11 帳票属性１１.<p>
	 *
	 */
	public static final String $rpt_attr11 = "rpt_attr11";
	/**
	 * Report attribute 12 帳票属性１２.<p>
	 *
	 */
	public static final String $rpt_attr12 = "rpt_attr12";
	/**
	 * Report attribute 13 帳票属性１３.<p>
	 *
	 */
	public static final String $rpt_attr13 = "rpt_attr13";
	/**
	 * Report attribute 14 帳票属性１４.<p>
	 *
	 */
	public static final String $rpt_attr14 = "rpt_attr14";
	/**
	 * Report attribute 15 帳票属性１５.<p>
	 *
	 */
	public static final String $rpt_attr15 = "rpt_attr15";
	/**
	 * Report attribute 16 帳票属性１６.<p>
	 *
	 */
	public static final String $rpt_attr16 = "rpt_attr16";
	/**
	 * Report attribute 17 帳票属性１７.<p>
	 *
	 */
	public static final String $rpt_attr17 = "rpt_attr17";
	/**
	 * Report attribute 18 帳票属性１８.<p>
	 *
	 */
	public static final String $rpt_attr18 = "rpt_attr18";
	/**
	 * Report attribute 19 帳票属性１９.<p>
	 *
	 */
	public static final String $rpt_attr19 = "rpt_attr19";
	/**
	 * Report attribute 20 帳票属性２０.<p>
	 *
	 */
	public static final String $rpt_attr20 = "rpt_attr20";
	/**
	 * Data update type データ更新区分.<p>
	 *
	 */
	public static final String $data_crud_typ = "data_crud_typ";
	/**
	 * Data update type name データ更新区分名.<p>
	 *
	 */
	public static final String $data_crud_typ_nm = "data_crud_typ_nm";
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
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public static final String $ins_ts = "ins_ts";
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
	 * Update date and time 更新日時.<p>
	 *
	 */
	public static final String $upd_ts = "upd_ts";
	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public static final String $upd_srv_req_no = "upd_srv_req_no";
	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public static final String $upd_cntr = "upd_cntr";


	public static final MCMeta archive_flg_META = createCommonMeta($archive_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta data_no_META = createCommonMeta($data_no, mcframe.commonMA.meta.MA_META.IT_DAT_NO);
	public static final MCMeta edition_META = createCommonMeta($edition, mcframe.commonMA.meta.MA_META.SLIP_REV);
	public static final MCMeta biz_typ_META = createCommonMeta($biz_typ, mcframe.commonMA.meta.MA_META.BIZ_TYP);
	public static final MCMeta biz_typ_nm_META = createCommonMeta($biz_typ_nm, mcframe.commonMA.meta.MA_META.BIZ_TYP_NM);
	public static final MCMeta biz_key1_META = createCommonMeta($biz_key1, mcframe.commonMA.meta.MA_META.BIZ_KEY);
	public static final MCMeta biz_key2_META = createCommonMeta($biz_key2, mcframe.commonMA.meta.MA_META.BIZ_KEY);
	public static final MCMeta biz_key3_META = createCommonMeta($biz_key3, mcframe.commonMA.meta.MA_META.BIZ_KEY);
	public static final MCMeta biz_key4_META = createCommonMeta($biz_key4, mcframe.commonMA.meta.MA_META.BIZ_KEY);
	public static final MCMeta biz_key5_META = createCommonMeta($biz_key5, mcframe.commonMA.meta.MA_META.BIZ_KEY);
	public static final MCMeta biz_key6_META = createCommonMeta($biz_key6, mcframe.commonMA.meta.MA_META.BIZ_KEY);
	public static final MCMeta biz_key7_META = createCommonMeta($biz_key7, mcframe.commonMA.meta.MA_META.BIZ_KEY);
	public static final MCMeta biz_key8_META = createCommonMeta($biz_key8, mcframe.commonMA.meta.MA_META.BIZ_KEY);
	public static final MCMeta biz_key9_META = createCommonMeta($biz_key9, mcframe.commonMA.meta.MA_META.BIZ_KEY);
	public static final MCMeta biz_key10_META = createCommonMeta($biz_key10, mcframe.commonMA.meta.MA_META.BIZ_KEY);
	public static final MCMeta dt_META = createCommonMeta($dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta bp_cd_META = createCommonMeta($bp_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta bp_nm_META = createCommonMeta($bp_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta cur_cd_META = createCommonMeta($cur_cd, mcframe.commonMA.meta.MA_META.CUR_CD);
	public static final MCMeta cur_nm_META = createCommonMeta($cur_nm, mcframe.commonMA.meta.MA_META.CUR_NM);
	public static final MCMeta amt_META = createCommonMeta($amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta ext_sys_cd_META = createCommonMeta($ext_sys_cd, mcframe.commonMA.meta.MA_META.EXT_SYS_CD);
	public static final MCMeta fs_flg_META = createCommonMeta($fs_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta doc_id_META = createCommonMeta($doc_id, mcframe.commonMA.meta.MA_META.DOC_ID);
	public static final MCMeta preview_url_META = createCommonMeta($preview_url, mcframe.commonMA.meta.MA_META.URL);
	public static final MCMeta rmrks1_META = createCommonMeta($rmrks1, mcframe.commonMA.meta.MA_META.ATTACHMENT_RMRKS);
	public static final MCMeta rmrks2_META = createCommonMeta($rmrks2, mcframe.commonMA.meta.MA_META.ATTACHMENT_RMRKS);
	public static final MCMeta rmrks3_META = createCommonMeta($rmrks3, mcframe.commonMA.meta.MA_META.ATTACHMENT_RMRKS);
	public static final MCMeta rmrks4_META = createCommonMeta($rmrks4, mcframe.commonMA.meta.MA_META.ATTACHMENT_RMRKS);
	public static final MCMeta rmrks5_META = createCommonMeta($rmrks5, mcframe.commonMA.meta.MA_META.ATTACHMENT_RMRKS);
	public static final MCMeta file_path_META = createCommonMeta($file_path, mcframe.commonMA.meta.MA_META.FILE_PATH);
	public static final MCMeta file_nm_META = createCommonMeta($file_nm, mcframe.commonMA.meta.MA_META.FILE_NM);
	public static final MCMeta wg_cd_META = createCommonMeta($wg_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta sls_dpt_cd_META = createCommonMeta($sls_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta purc_dpt_cd_META = createCommonMeta($purc_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta ar_dpt_cd_META = createCommonMeta($ar_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta bill_dpt_cd_META = createCommonMeta($bill_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta bsppl_dpt_cd_META = createCommonMeta($bsppl_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta dlv_cd_META = createCommonMeta($dlv_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta dest_cd1_META = createCommonMeta($dest_cd1, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta dest_cd2_META = createCommonMeta($dest_cd2, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta dest_cd3_META = createCommonMeta($dest_cd3, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta cst_cd_META = createCommonMeta($cst_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta acst_cd_META = createCommonMeta($acst_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta bcst_cd_META = createCommonMeta($bcst_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta sppl_cd_META = createCommonMeta($sppl_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta asppl_cd_META = createCommonMeta($asppl_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta bsppl_cd_META = createCommonMeta($bsppl_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta psppl_cd_META = createCommonMeta($psppl_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta cntry_cd_META = createCommonMeta($cntry_cd, mcframe.commonMA.meta.MA_META.CNTRY_CD);
	public static final MCMeta ptax_cur_cd_META = createCommonMeta($ptax_cur_cd, mcframe.commonMA.meta.MA_META.CUR_CD);
	public static final MCMeta wrk_no_META = createCommonMeta($wrk_no, mcframe.commonMA.meta.MA_META.WRK_NO);
	public static final MCMeta tterm_cd1_META = createCommonMeta($tterm_cd1, mcframe.commonMA.meta.MA_META.TTERM_CD);
	public static final MCMeta tterm_cd2_META = createCommonMeta($tterm_cd2, mcframe.commonMA.meta.MA_META.TTERM_CD);
	public static final MCMeta tterm_cd3_META = createCommonMeta($tterm_cd3, mcframe.commonMA.meta.MA_META.TTERM_CD);
	public static final MCMeta edi_sub_char1_META = createCommonMeta($edi_sub_char1, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR1);
	public static final MCMeta edi_sub_char2_META = createCommonMeta($edi_sub_char2, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR2);
	public static final MCMeta edi_sub_char3_META = createCommonMeta($edi_sub_char3, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR3);
	public static final MCMeta edi_sub_char4_META = createCommonMeta($edi_sub_char4, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR4);
	public static final MCMeta edi_sub_char5_META = createCommonMeta($edi_sub_char5, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR5);
	public static final MCMeta rpt_attr1_META = createCommonMeta($rpt_attr1, mcframe.commonMA.meta.MA_META.ATTACHMENT_RPT_ATTR1);
	public static final MCMeta rpt_attr2_META = createCommonMeta($rpt_attr2, mcframe.commonMA.meta.MA_META.ATTACHMENT_RPT_ATTR2);
	public static final MCMeta rpt_attr3_META = createCommonMeta($rpt_attr3, mcframe.commonMA.meta.MA_META.ATTACHMENT_RPT_ATTR3);
	public static final MCMeta rpt_attr4_META = createCommonMeta($rpt_attr4, mcframe.commonMA.meta.MA_META.ATTACHMENT_RPT_ATTR4);
	public static final MCMeta rpt_attr5_META = createCommonMeta($rpt_attr5, mcframe.commonMA.meta.MA_META.ATTACHMENT_RPT_ATTR5);
	public static final MCMeta rpt_attr6_META = createCommonMeta($rpt_attr6, mcframe.commonMA.meta.MA_META.ATTACHMENT_RPT_ATTR6);
	public static final MCMeta rpt_attr7_META = createCommonMeta($rpt_attr7, mcframe.commonMA.meta.MA_META.ATTACHMENT_RPT_ATTR7);
	public static final MCMeta rpt_attr8_META = createCommonMeta($rpt_attr8, mcframe.commonMA.meta.MA_META.ATTACHMENT_RPT_ATTR8);
	public static final MCMeta rpt_attr9_META = createCommonMeta($rpt_attr9, mcframe.commonMA.meta.MA_META.ATTACHMENT_RPT_ATTR9);
	public static final MCMeta rpt_attr10_META = createCommonMeta($rpt_attr10, mcframe.commonMA.meta.MA_META.ATTACHMENT_RPT_ATTR10);
	public static final MCMeta rpt_attr11_META = createCommonMeta($rpt_attr11, mcframe.commonMA.meta.MA_META.ATTACHMENT_RPT_ATTR11);
	public static final MCMeta rpt_attr12_META = createCommonMeta($rpt_attr12, mcframe.commonMA.meta.MA_META.ATTACHMENT_RPT_ATTR12);
	public static final MCMeta rpt_attr13_META = createCommonMeta($rpt_attr13, mcframe.commonMA.meta.MA_META.ATTACHMENT_RPT_ATTR13);
	public static final MCMeta rpt_attr14_META = createCommonMeta($rpt_attr14, mcframe.commonMA.meta.MA_META.ATTACHMENT_RPT_ATTR14);
	public static final MCMeta rpt_attr15_META = createCommonMeta($rpt_attr15, mcframe.commonMA.meta.MA_META.ATTACHMENT_RPT_ATTR15);
	public static final MCMeta rpt_attr16_META = createCommonMeta($rpt_attr16, mcframe.commonMA.meta.MA_META.ATTACHMENT_RPT_ATTR16);
	public static final MCMeta rpt_attr17_META = createCommonMeta($rpt_attr17, mcframe.commonMA.meta.MA_META.ATTACHMENT_RPT_ATTR17);
	public static final MCMeta rpt_attr18_META = createCommonMeta($rpt_attr18, mcframe.commonMA.meta.MA_META.ATTACHMENT_RPT_ATTR18);
	public static final MCMeta rpt_attr19_META = createCommonMeta($rpt_attr19, mcframe.commonMA.meta.MA_META.ATTACHMENT_RPT_ATTR19);
	public static final MCMeta rpt_attr20_META = createCommonMeta($rpt_attr20, mcframe.commonMA.meta.MA_META.ATTACHMENT_RPT_ATTR20);
	public static final MCMeta data_crud_typ_META = createCommonMeta($data_crud_typ, mcframe.commonMA.meta.MA_META.DATA_CRUD_TYP);
	public static final MCMeta data_crud_typ_nm_META = createCommonMeta($data_crud_typ_nm, mcframe.commonMA.meta.MA_META.DATA_CRUD_TYP_NM);
	public static final MCMeta ins_usr_id_META = createCommonMeta($ins_usr_id, mcframe.commonMA.meta.MA_META.FCM_USR_ID);
	public static final MCMeta ins_usr_nm_META = createCommonMeta($ins_usr_nm, mcframe.commonMA.meta.MA_META.FCM_USR_NM);
	public static final MCMeta ins_func_id_META = createCommonMeta($ins_func_id, mcframe.commonMA.meta.MA_META.FUNC_ID);
	public static final MCMeta ins_func_nm_META = createCommonMeta($ins_func_nm, mcframe.commonMA.meta.MA_META.FUNC_NM);
	public static final MCMeta ins_ts_META = createCommonMeta($ins_ts, mcframe.commonMA.meta.MA_META.SYS_TS);
	public static final MCMeta upd_usr_id_META = createCommonMeta($upd_usr_id, mcframe.commonMA.meta.MA_META.FCM_USR_ID);
	public static final MCMeta upd_usr_nm_META = createCommonMeta($upd_usr_nm, mcframe.commonMA.meta.MA_META.FCM_USR_NM);
	public static final MCMeta upd_func_id_META = createCommonMeta($upd_func_id, mcframe.commonMA.meta.MA_META.FUNC_ID);
	public static final MCMeta upd_func_nm_META = createCommonMeta($upd_func_nm, mcframe.commonMA.meta.MA_META.FUNC_NM);
	public static final MCMeta upd_ts_META = createCommonMeta($upd_ts, mcframe.commonMA.meta.MA_META.SYS_TS);
	public static final MCMeta upd_srv_req_no_META = createCommonMeta($upd_srv_req_no, mcframe.commonMA.meta.MA_META.SRV_REQ_NO);
	public static final MCMeta upd_cntr_META = createCommonMeta($upd_cntr, mcframe.commonMA.meta.MA_META.UPD_CNT);

	protected static final ConstMetaList<Srch01_RsltR> constMetas = new ConstMetaList<Srch01_RsltR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			archive_flg_META,
			data_no_META,
			edition_META,
			biz_typ_META,
			biz_typ_nm_META,
			biz_key1_META,
			biz_key2_META,
			biz_key3_META,
			biz_key4_META,
			biz_key5_META,
			biz_key6_META,
			biz_key7_META,
			biz_key8_META,
			biz_key9_META,
			biz_key10_META,
			dt_META,
			bp_cd_META,
			bp_nm_META,
			cur_cd_META,
			cur_nm_META,
			amt_META,
			ext_sys_cd_META,
			fs_flg_META,
			doc_id_META,
			preview_url_META,
			rmrks1_META,
			rmrks2_META,
			rmrks3_META,
			rmrks4_META,
			rmrks5_META,
			file_path_META,
			file_nm_META,
			wg_cd_META,
			sls_dpt_cd_META,
			purc_dpt_cd_META,
			ar_dpt_cd_META,
			bill_dpt_cd_META,
			bsppl_dpt_cd_META,
			dlv_cd_META,
			dest_cd1_META,
			dest_cd2_META,
			dest_cd3_META,
			cst_cd_META,
			acst_cd_META,
			bcst_cd_META,
			sppl_cd_META,
			asppl_cd_META,
			bsppl_cd_META,
			psppl_cd_META,
			cntry_cd_META,
			ptax_cur_cd_META,
			wrk_no_META,
			tterm_cd1_META,
			tterm_cd2_META,
			tterm_cd3_META,
			edi_sub_char1_META,
			edi_sub_char2_META,
			edi_sub_char3_META,
			edi_sub_char4_META,
			edi_sub_char5_META,
			rpt_attr1_META,
			rpt_attr2_META,
			rpt_attr3_META,
			rpt_attr4_META,
			rpt_attr5_META,
			rpt_attr6_META,
			rpt_attr7_META,
			rpt_attr8_META,
			rpt_attr9_META,
			rpt_attr10_META,
			rpt_attr11_META,
			rpt_attr12_META,
			rpt_attr13_META,
			rpt_attr14_META,
			rpt_attr15_META,
			rpt_attr16_META,
			rpt_attr17_META,
			rpt_attr18_META,
			rpt_attr19_META,
			rpt_attr20_META,
			data_crud_typ_META,
			data_crud_typ_nm_META,
			ins_usr_id_META,
			ins_usr_nm_META,
			ins_func_id_META,
			ins_func_nm_META,
			ins_ts_META,
			upd_usr_id_META,
			upd_usr_nm_META,
			upd_func_id_META,
			upd_func_nm_META,
			upd_ts_META,
			upd_srv_req_no_META,
			upd_cntr_META
		},
		new String[][]{
			{
			},
			{
			}
		}
	);

	/** 項目属性情報のグループ[CONST]のキー定数 */
	public static final String $$CONST = "CONST";

	/**
	 * グループ毎に定義される項目属性情報です。
	 */
	protected static final MCExtMap EXTMAP = new MCExtMap(
		null,
		new MCExtMap.Entry($$CONST, new MCExtList(
			new String[][]{
				{$biz_typ, "MAC_BIZ_TYP"},	// biz_typ
				{$data_crud_typ, "MAC_DATA_CRUD_TYP"}	// data_crud_typ
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
	 * 指定グループの項目属性情報を返します。
	 */
	public Map<String, String> getExtMap(String aGroup){
		if(aGroup == null) return null;
		return EXTMAP.get(aGroup);
	}

	/**
	 * 指定グループの項目属性が登録された項目リストを返します。
	 */
	public List<String> getKeys(String aGroup){
		if(aGroup == null) return null;
		return EXTMAP.getKeyList(aGroup);
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
	protected Srch01_RsltR_MC_A(ConstMetaList<? extends Srch01_RsltR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch01_RsltR clone() {
		return (Srch01_RsltR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch01_RsltR createInstance() {
		return (Srch01_RsltR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch01_RsltR getValues(String... names) {
		return (Srch01_RsltR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * Attached 添付済.<p>
	 *
	 */
	public boolean archive_flg() {
		return getConstBoolean(offset + 0, $archive_flg);
	}

	/**
	 * Attached 添付済.<p>
	 *
	 */
	public void archive_flg(boolean value) {
		setConstBoolean(offset + 0, $archive_flg, value);
	}


	/**
	 * Report management No. 帳票管理ＮＯ.<p>
	 *
	 */
	public String data_no() {
		return getConstString(offset + 1, $data_no);
	}

	/**
	 * Report management No. 帳票管理ＮＯ.<p>
	 *
	 */
	public void data_no(String value) {
		setConstString(offset + 1, $data_no, value);
	}


	/**
	 * Version 版.<p>
	 *
	 */
	public MCNumber edition() {
		return getConstNumber(offset + 2, $edition);
	}

	/**
	 * Version 版.<p>
	 *
	 */
	public void edition(MCNumber value) {
		setConstNumber(offset + 2, $edition, value);
	}

	/**
	 * Version 版.<p>
	 *
	 */
	public void edition(int value) {
		setConstNumber(offset + 2, $edition, value);
	}

	/**
	 * Version 版.<p>
	 *
	 */
	public void edition(long value) {
		setConstNumber(offset + 2, $edition, value);
	}

	/**
	 * Version 版.<p>
	 *
	 */
	public void edition(float value) {
		setConstNumber(offset + 2, $edition, value);
	}

	/**
	 * Version 版.<p>
	 *
	 */
	public void edition(double value) {
		setConstNumber(offset + 2, $edition, value);
	}


	/**
	 * Business type 業務区分.<p>
	 *
	 */
	public String biz_typ() {
		return getConstString(offset + 3, $biz_typ);
	}

	/**
	 * Business type 業務区分.<p>
	 *
	 */
	public void biz_typ(String value) {
		setConstString(offset + 3, $biz_typ, value);
	}


	/**
	 * Business type name 業務区分名.<p>
	 *
	 */
	public String biz_typ_nm() {
		return getConstString(offset + 4, $biz_typ_nm);
	}

	/**
	 * Business type name 業務区分名.<p>
	 *
	 */
	public void biz_typ_nm(String value) {
		setConstString(offset + 4, $biz_typ_nm, value);
	}


	/**
	 * Business key 1 業務キー１.<p>
	 *
	 */
	public String biz_key1() {
		return getConstString(offset + 5, $biz_key1);
	}

	/**
	 * Business key 1 業務キー１.<p>
	 *
	 */
	public void biz_key1(String value) {
		setConstString(offset + 5, $biz_key1, value);
	}


	/**
	 * Business key 2 業務キー２.<p>
	 *
	 */
	public String biz_key2() {
		return getConstString(offset + 6, $biz_key2);
	}

	/**
	 * Business key 2 業務キー２.<p>
	 *
	 */
	public void biz_key2(String value) {
		setConstString(offset + 6, $biz_key2, value);
	}


	/**
	 * Business key 3 業務キー３.<p>
	 *
	 */
	public String biz_key3() {
		return getConstString(offset + 7, $biz_key3);
	}

	/**
	 * Business key 3 業務キー３.<p>
	 *
	 */
	public void biz_key3(String value) {
		setConstString(offset + 7, $biz_key3, value);
	}


	/**
	 * Business key 4 業務キー４.<p>
	 *
	 */
	public String biz_key4() {
		return getConstString(offset + 8, $biz_key4);
	}

	/**
	 * Business key 4 業務キー４.<p>
	 *
	 */
	public void biz_key4(String value) {
		setConstString(offset + 8, $biz_key4, value);
	}


	/**
	 * Business key 5 業務キー５.<p>
	 *
	 */
	public String biz_key5() {
		return getConstString(offset + 9, $biz_key5);
	}

	/**
	 * Business key 5 業務キー５.<p>
	 *
	 */
	public void biz_key5(String value) {
		setConstString(offset + 9, $biz_key5, value);
	}


	/**
	 * Business key 6 業務キー６.<p>
	 *
	 */
	public String biz_key6() {
		return getConstString(offset + 10, $biz_key6);
	}

	/**
	 * Business key 6 業務キー６.<p>
	 *
	 */
	public void biz_key6(String value) {
		setConstString(offset + 10, $biz_key6, value);
	}


	/**
	 * Business key 7 業務キー７.<p>
	 *
	 */
	public String biz_key7() {
		return getConstString(offset + 11, $biz_key7);
	}

	/**
	 * Business key 7 業務キー７.<p>
	 *
	 */
	public void biz_key7(String value) {
		setConstString(offset + 11, $biz_key7, value);
	}


	/**
	 * Business key 8 業務キー８.<p>
	 *
	 */
	public String biz_key8() {
		return getConstString(offset + 12, $biz_key8);
	}

	/**
	 * Business key 8 業務キー８.<p>
	 *
	 */
	public void biz_key8(String value) {
		setConstString(offset + 12, $biz_key8, value);
	}


	/**
	 * Business key 9 業務キー９.<p>
	 *
	 */
	public String biz_key9() {
		return getConstString(offset + 13, $biz_key9);
	}

	/**
	 * Business key 9 業務キー９.<p>
	 *
	 */
	public void biz_key9(String value) {
		setConstString(offset + 13, $biz_key9, value);
	}


	/**
	 * Business key 10 業務キー１０.<p>
	 *
	 */
	public String biz_key10() {
		return getConstString(offset + 14, $biz_key10);
	}

	/**
	 * Business key 10 業務キー１０.<p>
	 *
	 */
	public void biz_key10(String value) {
		setConstString(offset + 14, $biz_key10, value);
	}


	/**
	 * Transaction date 取引年月日.<p>
	 *
	 */
	public MCDate dt() {
		return getConstDate(offset + 15, $dt);
	}

	/**
	 * Transaction date 取引年月日.<p>
	 *
	 */
	public void dt(MCDate value) {
		setConstDate(offset + 15, $dt, value);
	}


	/**
	 * BP cd. 取引先ＣＤ.<p>
	 *
	 */
	public String bp_cd() {
		return getConstString(offset + 16, $bp_cd);
	}

	/**
	 * BP cd. 取引先ＣＤ.<p>
	 *
	 */
	public void bp_cd(String value) {
		setConstString(offset + 16, $bp_cd, value);
	}


	/**
	 * BP name 取引先名.<p>
	 *
	 */
	public String bp_nm() {
		return getConstString(offset + 17, $bp_nm);
	}

	/**
	 * BP name 取引先名.<p>
	 *
	 */
	public void bp_nm(String value) {
		setConstString(offset + 17, $bp_nm, value);
	}


	/**
	 * Transaction currency cd. 取引通貨ＣＤ.<p>
	 *
	 */
	public String cur_cd() {
		return getConstString(offset + 18, $cur_cd);
	}

	/**
	 * Transaction currency cd. 取引通貨ＣＤ.<p>
	 *
	 */
	public void cur_cd(String value) {
		setConstString(offset + 18, $cur_cd, value);
	}


	/**
	 * Transaction currency name 取引通貨名.<p>
	 *
	 */
	public String cur_nm() {
		return getConstString(offset + 19, $cur_nm);
	}

	/**
	 * Transaction currency name 取引通貨名.<p>
	 *
	 */
	public void cur_nm(String value) {
		setConstString(offset + 19, $cur_nm, value);
	}


	/**
	 * Transaction amount 取引金額.<p>
	 *
	 */
	public MCNumber amt() {
		return getConstNumber(offset + 20, $amt);
	}

	/**
	 * Transaction amount 取引金額.<p>
	 *
	 */
	public void amt(MCNumber value) {
		setConstNumber(offset + 20, $amt, value);
	}

	/**
	 * Transaction amount 取引金額.<p>
	 *
	 */
	public void amt(int value) {
		setConstNumber(offset + 20, $amt, value);
	}

	/**
	 * Transaction amount 取引金額.<p>
	 *
	 */
	public void amt(long value) {
		setConstNumber(offset + 20, $amt, value);
	}

	/**
	 * Transaction amount 取引金額.<p>
	 *
	 */
	public void amt(float value) {
		setConstNumber(offset + 20, $amt, value);
	}

	/**
	 * Transaction amount 取引金額.<p>
	 *
	 */
	public void amt(double value) {
		setConstNumber(offset + 20, $amt, value);
	}


	/**
	 * External system cd. 外部システムＣＤ.<p>
	 *
	 */
	public String ext_sys_cd() {
		return getConstString(offset + 21, $ext_sys_cd);
	}

	/**
	 * External system cd. 外部システムＣＤ.<p>
	 *
	 */
	public void ext_sys_cd(String value) {
		setConstString(offset + 21, $ext_sys_cd, value);
	}


	/**
	 * File server ファイルサーバ.<p>
	 *
	 */
	public boolean fs_flg() {
		return getConstBoolean(offset + 22, $fs_flg);
	}

	/**
	 * File server ファイルサーバ.<p>
	 *
	 */
	public void fs_flg(boolean value) {
		setConstBoolean(offset + 22, $fs_flg, value);
	}


	public String doc_id() {
		return getConstString(offset + 23, $doc_id);
	}

	public void doc_id(String value) {
		setConstString(offset + 23, $doc_id, value);
	}


	public String preview_url() {
		return getConstString(offset + 24, $preview_url);
	}

	public void preview_url(String value) {
		setConstString(offset + 24, $preview_url, value);
	}


	/**
	 * Remarks 1 備考１.<p>
	 *
	 */
	public String rmrks1() {
		return getConstString(offset + 25, $rmrks1);
	}

	/**
	 * Remarks 1 備考１.<p>
	 *
	 */
	public void rmrks1(String value) {
		setConstString(offset + 25, $rmrks1, value);
	}


	/**
	 * Remarks 2 備考２.<p>
	 *
	 */
	public String rmrks2() {
		return getConstString(offset + 26, $rmrks2);
	}

	/**
	 * Remarks 2 備考２.<p>
	 *
	 */
	public void rmrks2(String value) {
		setConstString(offset + 26, $rmrks2, value);
	}


	/**
	 * Remarks 3 備考３.<p>
	 *
	 */
	public String rmrks3() {
		return getConstString(offset + 27, $rmrks3);
	}

	/**
	 * Remarks 3 備考３.<p>
	 *
	 */
	public void rmrks3(String value) {
		setConstString(offset + 27, $rmrks3, value);
	}


	/**
	 * Remarks 4 備考４.<p>
	 *
	 */
	public String rmrks4() {
		return getConstString(offset + 28, $rmrks4);
	}

	/**
	 * Remarks 4 備考４.<p>
	 *
	 */
	public void rmrks4(String value) {
		setConstString(offset + 28, $rmrks4, value);
	}


	/**
	 * Remarks 5 備考５.<p>
	 *
	 */
	public String rmrks5() {
		return getConstString(offset + 29, $rmrks5);
	}

	/**
	 * Remarks 5 備考５.<p>
	 *
	 */
	public void rmrks5(String value) {
		setConstString(offset + 29, $rmrks5, value);
	}


	/**
	 * Storage location file path 保存先ファイルパス.<p>
	 *
	 */
	public String file_path() {
		return getConstString(offset + 30, $file_path);
	}

	/**
	 * Storage location file path 保存先ファイルパス.<p>
	 *
	 */
	public void file_path(String value) {
		setConstString(offset + 30, $file_path, value);
	}


	/**
	 * Storage location file name 保存先ファイル名.<p>
	 *
	 */
	public String file_nm() {
		return getConstString(offset + 31, $file_nm);
	}

	/**
	 * Storage location file name 保存先ファイル名.<p>
	 *
	 */
	public void file_nm(String value) {
		setConstString(offset + 31, $file_nm, value);
	}


	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public String wg_cd() {
		return getConstString(offset + 32, $wg_cd);
	}

	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public void wg_cd(String value) {
		setConstString(offset + 32, $wg_cd, value);
	}


	/**
	 * Sales dept. cd. 売上部門ＣＤ.<p>
	 *
	 */
	public String sls_dpt_cd() {
		return getConstString(offset + 33, $sls_dpt_cd);
	}

	/**
	 * Sales dept. cd. 売上部門ＣＤ.<p>
	 *
	 */
	public void sls_dpt_cd(String value) {
		setConstString(offset + 33, $sls_dpt_cd, value);
	}


	/**
	 * Purchasing dept. cd. 購買部門ＣＤ.<p>
	 *
	 */
	public String purc_dpt_cd() {
		return getConstString(offset + 34, $purc_dpt_cd);
	}

	/**
	 * Purchasing dept. cd. 購買部門ＣＤ.<p>
	 *
	 */
	public void purc_dpt_cd(String value) {
		setConstString(offset + 34, $purc_dpt_cd, value);
	}


	/**
	 * AR dept. cd. 債権部門ＣＤ.<p>
	 *
	 */
	public String ar_dpt_cd() {
		return getConstString(offset + 35, $ar_dpt_cd);
	}

	/**
	 * AR dept. cd. 債権部門ＣＤ.<p>
	 *
	 */
	public void ar_dpt_cd(String value) {
		setConstString(offset + 35, $ar_dpt_cd, value);
	}


	/**
	 * Billing dept. cd. 請求部門ＣＤ.<p>
	 *
	 */
	public String bill_dpt_cd() {
		return getConstString(offset + 36, $bill_dpt_cd);
	}

	/**
	 * Billing dept. cd. 請求部門ＣＤ.<p>
	 *
	 */
	public void bill_dpt_cd(String value) {
		setConstString(offset + 36, $bill_dpt_cd, value);
	}


	/**
	 * Cd. of dept. in charge of scheduled payee 支払予定管理先担当部門ＣＤ.<p>
	 *
	 */
	public String bsppl_dpt_cd() {
		return getConstString(offset + 37, $bsppl_dpt_cd);
	}

	/**
	 * Cd. of dept. in charge of scheduled payee 支払予定管理先担当部門ＣＤ.<p>
	 *
	 */
	public void bsppl_dpt_cd(String value) {
		setConstString(offset + 37, $bsppl_dpt_cd, value);
	}


	/**
	 * Delivery destination cd. 納品先ＣＤ.<p>
	 *
	 */
	public String dlv_cd() {
		return getConstString(offset + 38, $dlv_cd);
	}

	/**
	 * Delivery destination cd. 納品先ＣＤ.<p>
	 *
	 */
	public void dlv_cd(String value) {
		setConstString(offset + 38, $dlv_cd, value);
	}


	/**
	 * Distribution channel cd. 1 仕向先ＣＤ１.<p>
	 *
	 */
	public String dest_cd1() {
		return getConstString(offset + 39, $dest_cd1);
	}

	/**
	 * Distribution channel cd. 1 仕向先ＣＤ１.<p>
	 *
	 */
	public void dest_cd1(String value) {
		setConstString(offset + 39, $dest_cd1, value);
	}


	/**
	 * Distribution channel cd. 2 仕向先ＣＤ２.<p>
	 *
	 */
	public String dest_cd2() {
		return getConstString(offset + 40, $dest_cd2);
	}

	/**
	 * Distribution channel cd. 2 仕向先ＣＤ２.<p>
	 *
	 */
	public void dest_cd2(String value) {
		setConstString(offset + 40, $dest_cd2, value);
	}


	/**
	 * Distribution channel cd. 3 仕向先ＣＤ３.<p>
	 *
	 */
	public String dest_cd3() {
		return getConstString(offset + 41, $dest_cd3);
	}

	/**
	 * Distribution channel cd. 3 仕向先ＣＤ３.<p>
	 *
	 */
	public void dest_cd3(String value) {
		setConstString(offset + 41, $dest_cd3, value);
	}


	/**
	 * Customer cd. 得意先ＣＤ.<p>
	 *
	 */
	public String cst_cd() {
		return getConstString(offset + 42, $cst_cd);
	}

	/**
	 * Customer cd. 得意先ＣＤ.<p>
	 *
	 */
	public void cst_cd(String value) {
		setConstString(offset + 42, $cst_cd, value);
	}


	/**
	 * AR customer cd. 売掛先ＣＤ.<p>
	 *
	 */
	public String acst_cd() {
		return getConstString(offset + 43, $acst_cd);
	}

	/**
	 * AR customer cd. 売掛先ＣＤ.<p>
	 *
	 */
	public void acst_cd(String value) {
		setConstString(offset + 43, $acst_cd, value);
	}


	/**
	 * Billing customer cd. 請求先ＣＤ.<p>
	 *
	 */
	public String bcst_cd() {
		return getConstString(offset + 44, $bcst_cd);
	}

	/**
	 * Billing customer cd. 請求先ＣＤ.<p>
	 *
	 */
	public void bcst_cd(String value) {
		setConstString(offset + 44, $bcst_cd, value);
	}


	/**
	 * Supplier cd. 発注先ＣＤ.<p>
	 *
	 */
	public String sppl_cd() {
		return getConstString(offset + 45, $sppl_cd);
	}

	/**
	 * Supplier cd. 発注先ＣＤ.<p>
	 *
	 */
	public void sppl_cd(String value) {
		setConstString(offset + 45, $sppl_cd, value);
	}


	/**
	 * AP supplier cd. 買掛先ＣＤ.<p>
	 *
	 */
	public String asppl_cd() {
		return getConstString(offset + 46, $asppl_cd);
	}

	/**
	 * AP supplier cd. 買掛先ＣＤ.<p>
	 *
	 */
	public void asppl_cd(String value) {
		setConstString(offset + 46, $asppl_cd, value);
	}


	/**
	 * Scheduled payee cd. 支払予定管理先ＣＤ.<p>
	 *
	 */
	public String bsppl_cd() {
		return getConstString(offset + 47, $bsppl_cd);
	}

	/**
	 * Scheduled payee cd. 支払予定管理先ＣＤ.<p>
	 *
	 */
	public void bsppl_cd(String value) {
		setConstString(offset + 47, $bsppl_cd, value);
	}


	/**
	 * Payee cd. 支払先ＣＤ.<p>
	 *
	 */
	public String psppl_cd() {
		return getConstString(offset + 48, $psppl_cd);
	}

	/**
	 * Payee cd. 支払先ＣＤ.<p>
	 *
	 */
	public void psppl_cd(String value) {
		setConstString(offset + 48, $psppl_cd, value);
	}


	/**
	 * Country cd. 国ＣＤ.<p>
	 *
	 */
	public String cntry_cd() {
		return getConstString(offset + 49, $cntry_cd);
	}

	/**
	 * Country cd. 国ＣＤ.<p>
	 *
	 */
	public void cntry_cd(String value) {
		setConstString(offset + 49, $cntry_cd, value);
	}


	/**
	 * Taxpaying currency cd. 納税通貨ＣＤ.<p>
	 *
	 */
	public String ptax_cur_cd() {
		return getConstString(offset + 50, $ptax_cur_cd);
	}

	/**
	 * Taxpaying currency cd. 納税通貨ＣＤ.<p>
	 *
	 */
	public void ptax_cur_cd(String value) {
		setConstString(offset + 50, $ptax_cur_cd, value);
	}


	/**
	 * Sales project No. 案件ＮＯ.<p>
	 *
	 */
	public String wrk_no() {
		return getConstString(offset + 51, $wrk_no);
	}

	/**
	 * Sales project No. 案件ＮＯ.<p>
	 *
	 */
	public void wrk_no(String value) {
		setConstString(offset + 51, $wrk_no, value);
	}


	/**
	 * Transaction terms cd. 1 取引条件ＣＤ１.<p>
	 *
	 */
	public String tterm_cd1() {
		return getConstString(offset + 52, $tterm_cd1);
	}

	/**
	 * Transaction terms cd. 1 取引条件ＣＤ１.<p>
	 *
	 */
	public void tterm_cd1(String value) {
		setConstString(offset + 52, $tterm_cd1, value);
	}


	/**
	 * Transaction terms cd. 2 取引条件ＣＤ２.<p>
	 *
	 */
	public String tterm_cd2() {
		return getConstString(offset + 53, $tterm_cd2);
	}

	/**
	 * Transaction terms cd. 2 取引条件ＣＤ２.<p>
	 *
	 */
	public void tterm_cd2(String value) {
		setConstString(offset + 53, $tterm_cd2, value);
	}


	/**
	 * Transaction terms cd. 3 取引条件ＣＤ３.<p>
	 *
	 */
	public String tterm_cd3() {
		return getConstString(offset + 54, $tterm_cd3);
	}

	/**
	 * Transaction terms cd. 3 取引条件ＣＤ３.<p>
	 *
	 */
	public void tterm_cd3(String value) {
		setConstString(offset + 54, $tterm_cd3, value);
	}


	/**
	 * EDI spare CHAR column 1 ＥＤＩ予備ＣＨＡＲ項目１.<p>
	 *
	 */
	public String edi_sub_char1() {
		return getConstString(offset + 55, $edi_sub_char1);
	}

	/**
	 * EDI spare CHAR column 1 ＥＤＩ予備ＣＨＡＲ項目１.<p>
	 *
	 */
	public void edi_sub_char1(String value) {
		setConstString(offset + 55, $edi_sub_char1, value);
	}


	/**
	 * EDI spare CHAR column 2 ＥＤＩ予備ＣＨＡＲ項目２.<p>
	 *
	 */
	public String edi_sub_char2() {
		return getConstString(offset + 56, $edi_sub_char2);
	}

	/**
	 * EDI spare CHAR column 2 ＥＤＩ予備ＣＨＡＲ項目２.<p>
	 *
	 */
	public void edi_sub_char2(String value) {
		setConstString(offset + 56, $edi_sub_char2, value);
	}


	/**
	 * EDI spare CHAR column 3 ＥＤＩ予備ＣＨＡＲ項目３.<p>
	 *
	 */
	public String edi_sub_char3() {
		return getConstString(offset + 57, $edi_sub_char3);
	}

	/**
	 * EDI spare CHAR column 3 ＥＤＩ予備ＣＨＡＲ項目３.<p>
	 *
	 */
	public void edi_sub_char3(String value) {
		setConstString(offset + 57, $edi_sub_char3, value);
	}


	/**
	 * EDI spare CHAR column 4 ＥＤＩ予備ＣＨＡＲ項目４.<p>
	 *
	 */
	public String edi_sub_char4() {
		return getConstString(offset + 58, $edi_sub_char4);
	}

	/**
	 * EDI spare CHAR column 4 ＥＤＩ予備ＣＨＡＲ項目４.<p>
	 *
	 */
	public void edi_sub_char4(String value) {
		setConstString(offset + 58, $edi_sub_char4, value);
	}


	/**
	 * EDI spare CHAR column 5 ＥＤＩ予備ＣＨＡＲ項目５.<p>
	 *
	 */
	public String edi_sub_char5() {
		return getConstString(offset + 59, $edi_sub_char5);
	}

	/**
	 * EDI spare CHAR column 5 ＥＤＩ予備ＣＨＡＲ項目５.<p>
	 *
	 */
	public void edi_sub_char5(String value) {
		setConstString(offset + 59, $edi_sub_char5, value);
	}


	/**
	 * Report attribute 1 帳票属性１.<p>
	 *
	 */
	public String rpt_attr1() {
		return getConstString(offset + 60, $rpt_attr1);
	}

	/**
	 * Report attribute 1 帳票属性１.<p>
	 *
	 */
	public void rpt_attr1(String value) {
		setConstString(offset + 60, $rpt_attr1, value);
	}


	/**
	 * Report attribute 2 帳票属性２.<p>
	 *
	 */
	public String rpt_attr2() {
		return getConstString(offset + 61, $rpt_attr2);
	}

	/**
	 * Report attribute 2 帳票属性２.<p>
	 *
	 */
	public void rpt_attr2(String value) {
		setConstString(offset + 61, $rpt_attr2, value);
	}


	/**
	 * Report attribute 3 帳票属性３.<p>
	 *
	 */
	public String rpt_attr3() {
		return getConstString(offset + 62, $rpt_attr3);
	}

	/**
	 * Report attribute 3 帳票属性３.<p>
	 *
	 */
	public void rpt_attr3(String value) {
		setConstString(offset + 62, $rpt_attr3, value);
	}


	/**
	 * Report attribute 4 帳票属性４.<p>
	 *
	 */
	public String rpt_attr4() {
		return getConstString(offset + 63, $rpt_attr4);
	}

	/**
	 * Report attribute 4 帳票属性４.<p>
	 *
	 */
	public void rpt_attr4(String value) {
		setConstString(offset + 63, $rpt_attr4, value);
	}


	/**
	 * Report attribute 5 帳票属性５.<p>
	 *
	 */
	public String rpt_attr5() {
		return getConstString(offset + 64, $rpt_attr5);
	}

	/**
	 * Report attribute 5 帳票属性５.<p>
	 *
	 */
	public void rpt_attr5(String value) {
		setConstString(offset + 64, $rpt_attr5, value);
	}


	/**
	 * Report attribute 6 帳票属性６.<p>
	 *
	 */
	public String rpt_attr6() {
		return getConstString(offset + 65, $rpt_attr6);
	}

	/**
	 * Report attribute 6 帳票属性６.<p>
	 *
	 */
	public void rpt_attr6(String value) {
		setConstString(offset + 65, $rpt_attr6, value);
	}


	/**
	 * Report attribute 7 帳票属性７.<p>
	 *
	 */
	public String rpt_attr7() {
		return getConstString(offset + 66, $rpt_attr7);
	}

	/**
	 * Report attribute 7 帳票属性７.<p>
	 *
	 */
	public void rpt_attr7(String value) {
		setConstString(offset + 66, $rpt_attr7, value);
	}


	/**
	 * Report attribute 8 帳票属性８.<p>
	 *
	 */
	public String rpt_attr8() {
		return getConstString(offset + 67, $rpt_attr8);
	}

	/**
	 * Report attribute 8 帳票属性８.<p>
	 *
	 */
	public void rpt_attr8(String value) {
		setConstString(offset + 67, $rpt_attr8, value);
	}


	/**
	 * Report attribute 9 帳票属性９.<p>
	 *
	 */
	public String rpt_attr9() {
		return getConstString(offset + 68, $rpt_attr9);
	}

	/**
	 * Report attribute 9 帳票属性９.<p>
	 *
	 */
	public void rpt_attr9(String value) {
		setConstString(offset + 68, $rpt_attr9, value);
	}


	/**
	 * Report attribute 10 帳票属性１０.<p>
	 *
	 */
	public String rpt_attr10() {
		return getConstString(offset + 69, $rpt_attr10);
	}

	/**
	 * Report attribute 10 帳票属性１０.<p>
	 *
	 */
	public void rpt_attr10(String value) {
		setConstString(offset + 69, $rpt_attr10, value);
	}


	/**
	 * Report attribute 11 帳票属性１１.<p>
	 *
	 */
	public String rpt_attr11() {
		return getConstString(offset + 70, $rpt_attr11);
	}

	/**
	 * Report attribute 11 帳票属性１１.<p>
	 *
	 */
	public void rpt_attr11(String value) {
		setConstString(offset + 70, $rpt_attr11, value);
	}


	/**
	 * Report attribute 12 帳票属性１２.<p>
	 *
	 */
	public String rpt_attr12() {
		return getConstString(offset + 71, $rpt_attr12);
	}

	/**
	 * Report attribute 12 帳票属性１２.<p>
	 *
	 */
	public void rpt_attr12(String value) {
		setConstString(offset + 71, $rpt_attr12, value);
	}


	/**
	 * Report attribute 13 帳票属性１３.<p>
	 *
	 */
	public String rpt_attr13() {
		return getConstString(offset + 72, $rpt_attr13);
	}

	/**
	 * Report attribute 13 帳票属性１３.<p>
	 *
	 */
	public void rpt_attr13(String value) {
		setConstString(offset + 72, $rpt_attr13, value);
	}


	/**
	 * Report attribute 14 帳票属性１４.<p>
	 *
	 */
	public String rpt_attr14() {
		return getConstString(offset + 73, $rpt_attr14);
	}

	/**
	 * Report attribute 14 帳票属性１４.<p>
	 *
	 */
	public void rpt_attr14(String value) {
		setConstString(offset + 73, $rpt_attr14, value);
	}


	/**
	 * Report attribute 15 帳票属性１５.<p>
	 *
	 */
	public String rpt_attr15() {
		return getConstString(offset + 74, $rpt_attr15);
	}

	/**
	 * Report attribute 15 帳票属性１５.<p>
	 *
	 */
	public void rpt_attr15(String value) {
		setConstString(offset + 74, $rpt_attr15, value);
	}


	/**
	 * Report attribute 16 帳票属性１６.<p>
	 *
	 */
	public String rpt_attr16() {
		return getConstString(offset + 75, $rpt_attr16);
	}

	/**
	 * Report attribute 16 帳票属性１６.<p>
	 *
	 */
	public void rpt_attr16(String value) {
		setConstString(offset + 75, $rpt_attr16, value);
	}


	/**
	 * Report attribute 17 帳票属性１７.<p>
	 *
	 */
	public String rpt_attr17() {
		return getConstString(offset + 76, $rpt_attr17);
	}

	/**
	 * Report attribute 17 帳票属性１７.<p>
	 *
	 */
	public void rpt_attr17(String value) {
		setConstString(offset + 76, $rpt_attr17, value);
	}


	/**
	 * Report attribute 18 帳票属性１８.<p>
	 *
	 */
	public String rpt_attr18() {
		return getConstString(offset + 77, $rpt_attr18);
	}

	/**
	 * Report attribute 18 帳票属性１８.<p>
	 *
	 */
	public void rpt_attr18(String value) {
		setConstString(offset + 77, $rpt_attr18, value);
	}


	/**
	 * Report attribute 19 帳票属性１９.<p>
	 *
	 */
	public String rpt_attr19() {
		return getConstString(offset + 78, $rpt_attr19);
	}

	/**
	 * Report attribute 19 帳票属性１９.<p>
	 *
	 */
	public void rpt_attr19(String value) {
		setConstString(offset + 78, $rpt_attr19, value);
	}


	/**
	 * Report attribute 20 帳票属性２０.<p>
	 *
	 */
	public String rpt_attr20() {
		return getConstString(offset + 79, $rpt_attr20);
	}

	/**
	 * Report attribute 20 帳票属性２０.<p>
	 *
	 */
	public void rpt_attr20(String value) {
		setConstString(offset + 79, $rpt_attr20, value);
	}


	/**
	 * Data update type データ更新区分.<p>
	 *
	 */
	public String data_crud_typ() {
		return getConstString(offset + 80, $data_crud_typ);
	}

	/**
	 * Data update type データ更新区分.<p>
	 *
	 */
	public void data_crud_typ(String value) {
		setConstString(offset + 80, $data_crud_typ, value);
	}


	/**
	 * Data update type name データ更新区分名.<p>
	 *
	 */
	public String data_crud_typ_nm() {
		return getConstString(offset + 81, $data_crud_typ_nm);
	}

	/**
	 * Data update type name データ更新区分名.<p>
	 *
	 */
	public void data_crud_typ_nm(String value) {
		setConstString(offset + 81, $data_crud_typ_nm, value);
	}


	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public String ins_usr_id() {
		return getConstString(offset + 82, $ins_usr_id);
	}

	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public void ins_usr_id(String value) {
		setConstString(offset + 82, $ins_usr_id, value);
	}


	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public String ins_usr_nm() {
		return getConstString(offset + 83, $ins_usr_nm);
	}

	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public void ins_usr_nm(String value) {
		setConstString(offset + 83, $ins_usr_nm, value);
	}


	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public String ins_func_id() {
		return getConstString(offset + 84, $ins_func_id);
	}

	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public void ins_func_id(String value) {
		setConstString(offset + 84, $ins_func_id, value);
	}


	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public String ins_func_nm() {
		return getConstString(offset + 85, $ins_func_nm);
	}

	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public void ins_func_nm(String value) {
		setConstString(offset + 85, $ins_func_nm, value);
	}


	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public MCTimestamp ins_ts() {
		return getConstTimestamp(offset + 86, $ins_ts);
	}

	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public void ins_ts(MCTimestamp value) {
		setConstTimestamp(offset + 86, $ins_ts, value);
	}


	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public String upd_usr_id() {
		return getConstString(offset + 87, $upd_usr_id);
	}

	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public void upd_usr_id(String value) {
		setConstString(offset + 87, $upd_usr_id, value);
	}


	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public String upd_usr_nm() {
		return getConstString(offset + 88, $upd_usr_nm);
	}

	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public void upd_usr_nm(String value) {
		setConstString(offset + 88, $upd_usr_nm, value);
	}


	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public String upd_func_id() {
		return getConstString(offset + 89, $upd_func_id);
	}

	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public void upd_func_id(String value) {
		setConstString(offset + 89, $upd_func_id, value);
	}


	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public String upd_func_nm() {
		return getConstString(offset + 90, $upd_func_nm);
	}

	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public void upd_func_nm(String value) {
		setConstString(offset + 90, $upd_func_nm, value);
	}


	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public MCTimestamp upd_ts() {
		return getConstTimestamp(offset + 91, $upd_ts);
	}

	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public void upd_ts(MCTimestamp value) {
		setConstTimestamp(offset + 91, $upd_ts, value);
	}


	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public String upd_srv_req_no() {
		return getConstString(offset + 92, $upd_srv_req_no);
	}

	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public void upd_srv_req_no(String value) {
		setConstString(offset + 92, $upd_srv_req_no, value);
	}


	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public MCNumber upd_cntr() {
		return getConstNumber(offset + 93, $upd_cntr);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(MCNumber value) {
		setConstNumber(offset + 93, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(int value) {
		setConstNumber(offset + 93, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(long value) {
		setConstNumber(offset + 93, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(float value) {
		setConstNumber(offset + 93, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(double value) {
		setConstNumber(offset + 93, $upd_cntr, value);
	}


	public String getString(String name) {
		if ($data_no.equalsIgnoreCase(name)) {
			return data_no();
		}
		if ($biz_typ.equalsIgnoreCase(name)) {
			return biz_typ();
		}
		if ($biz_typ_nm.equalsIgnoreCase(name)) {
			return biz_typ_nm();
		}
		if ($biz_key1.equalsIgnoreCase(name)) {
			return biz_key1();
		}
		if ($biz_key2.equalsIgnoreCase(name)) {
			return biz_key2();
		}
		if ($biz_key3.equalsIgnoreCase(name)) {
			return biz_key3();
		}
		if ($biz_key4.equalsIgnoreCase(name)) {
			return biz_key4();
		}
		if ($biz_key5.equalsIgnoreCase(name)) {
			return biz_key5();
		}
		if ($biz_key6.equalsIgnoreCase(name)) {
			return biz_key6();
		}
		if ($biz_key7.equalsIgnoreCase(name)) {
			return biz_key7();
		}
		if ($biz_key8.equalsIgnoreCase(name)) {
			return biz_key8();
		}
		if ($biz_key9.equalsIgnoreCase(name)) {
			return biz_key9();
		}
		if ($biz_key10.equalsIgnoreCase(name)) {
			return biz_key10();
		}
		if ($bp_cd.equalsIgnoreCase(name)) {
			return bp_cd();
		}
		if ($bp_nm.equalsIgnoreCase(name)) {
			return bp_nm();
		}
		if ($cur_cd.equalsIgnoreCase(name)) {
			return cur_cd();
		}
		if ($cur_nm.equalsIgnoreCase(name)) {
			return cur_nm();
		}
		if ($ext_sys_cd.equalsIgnoreCase(name)) {
			return ext_sys_cd();
		}
		if ($doc_id.equalsIgnoreCase(name)) {
			return doc_id();
		}
		if ($preview_url.equalsIgnoreCase(name)) {
			return preview_url();
		}
		if ($rmrks1.equalsIgnoreCase(name)) {
			return rmrks1();
		}
		if ($rmrks2.equalsIgnoreCase(name)) {
			return rmrks2();
		}
		if ($rmrks3.equalsIgnoreCase(name)) {
			return rmrks3();
		}
		if ($rmrks4.equalsIgnoreCase(name)) {
			return rmrks4();
		}
		if ($rmrks5.equalsIgnoreCase(name)) {
			return rmrks5();
		}
		if ($file_path.equalsIgnoreCase(name)) {
			return file_path();
		}
		if ($file_nm.equalsIgnoreCase(name)) {
			return file_nm();
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($sls_dpt_cd.equalsIgnoreCase(name)) {
			return sls_dpt_cd();
		}
		if ($purc_dpt_cd.equalsIgnoreCase(name)) {
			return purc_dpt_cd();
		}
		if ($ar_dpt_cd.equalsIgnoreCase(name)) {
			return ar_dpt_cd();
		}
		if ($bill_dpt_cd.equalsIgnoreCase(name)) {
			return bill_dpt_cd();
		}
		if ($bsppl_dpt_cd.equalsIgnoreCase(name)) {
			return bsppl_dpt_cd();
		}
		if ($dlv_cd.equalsIgnoreCase(name)) {
			return dlv_cd();
		}
		if ($dest_cd1.equalsIgnoreCase(name)) {
			return dest_cd1();
		}
		if ($dest_cd2.equalsIgnoreCase(name)) {
			return dest_cd2();
		}
		if ($dest_cd3.equalsIgnoreCase(name)) {
			return dest_cd3();
		}
		if ($cst_cd.equalsIgnoreCase(name)) {
			return cst_cd();
		}
		if ($acst_cd.equalsIgnoreCase(name)) {
			return acst_cd();
		}
		if ($bcst_cd.equalsIgnoreCase(name)) {
			return bcst_cd();
		}
		if ($sppl_cd.equalsIgnoreCase(name)) {
			return sppl_cd();
		}
		if ($asppl_cd.equalsIgnoreCase(name)) {
			return asppl_cd();
		}
		if ($bsppl_cd.equalsIgnoreCase(name)) {
			return bsppl_cd();
		}
		if ($psppl_cd.equalsIgnoreCase(name)) {
			return psppl_cd();
		}
		if ($cntry_cd.equalsIgnoreCase(name)) {
			return cntry_cd();
		}
		if ($ptax_cur_cd.equalsIgnoreCase(name)) {
			return ptax_cur_cd();
		}
		if ($wrk_no.equalsIgnoreCase(name)) {
			return wrk_no();
		}
		if ($tterm_cd1.equalsIgnoreCase(name)) {
			return tterm_cd1();
		}
		if ($tterm_cd2.equalsIgnoreCase(name)) {
			return tterm_cd2();
		}
		if ($tterm_cd3.equalsIgnoreCase(name)) {
			return tterm_cd3();
		}
		if ($edi_sub_char1.equalsIgnoreCase(name)) {
			return edi_sub_char1();
		}
		if ($edi_sub_char2.equalsIgnoreCase(name)) {
			return edi_sub_char2();
		}
		if ($edi_sub_char3.equalsIgnoreCase(name)) {
			return edi_sub_char3();
		}
		if ($edi_sub_char4.equalsIgnoreCase(name)) {
			return edi_sub_char4();
		}
		if ($edi_sub_char5.equalsIgnoreCase(name)) {
			return edi_sub_char5();
		}
		if ($rpt_attr1.equalsIgnoreCase(name)) {
			return rpt_attr1();
		}
		if ($rpt_attr2.equalsIgnoreCase(name)) {
			return rpt_attr2();
		}
		if ($rpt_attr3.equalsIgnoreCase(name)) {
			return rpt_attr3();
		}
		if ($rpt_attr4.equalsIgnoreCase(name)) {
			return rpt_attr4();
		}
		if ($rpt_attr5.equalsIgnoreCase(name)) {
			return rpt_attr5();
		}
		if ($rpt_attr6.equalsIgnoreCase(name)) {
			return rpt_attr6();
		}
		if ($rpt_attr7.equalsIgnoreCase(name)) {
			return rpt_attr7();
		}
		if ($rpt_attr8.equalsIgnoreCase(name)) {
			return rpt_attr8();
		}
		if ($rpt_attr9.equalsIgnoreCase(name)) {
			return rpt_attr9();
		}
		if ($rpt_attr10.equalsIgnoreCase(name)) {
			return rpt_attr10();
		}
		if ($rpt_attr11.equalsIgnoreCase(name)) {
			return rpt_attr11();
		}
		if ($rpt_attr12.equalsIgnoreCase(name)) {
			return rpt_attr12();
		}
		if ($rpt_attr13.equalsIgnoreCase(name)) {
			return rpt_attr13();
		}
		if ($rpt_attr14.equalsIgnoreCase(name)) {
			return rpt_attr14();
		}
		if ($rpt_attr15.equalsIgnoreCase(name)) {
			return rpt_attr15();
		}
		if ($rpt_attr16.equalsIgnoreCase(name)) {
			return rpt_attr16();
		}
		if ($rpt_attr17.equalsIgnoreCase(name)) {
			return rpt_attr17();
		}
		if ($rpt_attr18.equalsIgnoreCase(name)) {
			return rpt_attr18();
		}
		if ($rpt_attr19.equalsIgnoreCase(name)) {
			return rpt_attr19();
		}
		if ($rpt_attr20.equalsIgnoreCase(name)) {
			return rpt_attr20();
		}
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			return data_crud_typ();
		}
		if ($data_crud_typ_nm.equalsIgnoreCase(name)) {
			return data_crud_typ_nm();
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
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($edition.equalsIgnoreCase(name)) {
			return edition();
		}
		if ($amt.equalsIgnoreCase(name)) {
			return amt();
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			return upd_cntr();
		}
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		if ($dt.equalsIgnoreCase(name)) {
			return dt();
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
		if ($archive_flg.equalsIgnoreCase(name)) {
			return archive_flg();
		}
		if ($fs_flg.equalsIgnoreCase(name)) {
			return fs_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($data_no.equalsIgnoreCase(name)) {
			return data_no();
		}
		if ($biz_typ.equalsIgnoreCase(name)) {
			return biz_typ();
		}
		if ($biz_typ_nm.equalsIgnoreCase(name)) {
			return biz_typ_nm();
		}
		if ($biz_key1.equalsIgnoreCase(name)) {
			return biz_key1();
		}
		if ($biz_key2.equalsIgnoreCase(name)) {
			return biz_key2();
		}
		if ($biz_key3.equalsIgnoreCase(name)) {
			return biz_key3();
		}
		if ($biz_key4.equalsIgnoreCase(name)) {
			return biz_key4();
		}
		if ($biz_key5.equalsIgnoreCase(name)) {
			return biz_key5();
		}
		if ($biz_key6.equalsIgnoreCase(name)) {
			return biz_key6();
		}
		if ($biz_key7.equalsIgnoreCase(name)) {
			return biz_key7();
		}
		if ($biz_key8.equalsIgnoreCase(name)) {
			return biz_key8();
		}
		if ($biz_key9.equalsIgnoreCase(name)) {
			return biz_key9();
		}
		if ($biz_key10.equalsIgnoreCase(name)) {
			return biz_key10();
		}
		if ($bp_cd.equalsIgnoreCase(name)) {
			return bp_cd();
		}
		if ($bp_nm.equalsIgnoreCase(name)) {
			return bp_nm();
		}
		if ($cur_cd.equalsIgnoreCase(name)) {
			return cur_cd();
		}
		if ($cur_nm.equalsIgnoreCase(name)) {
			return cur_nm();
		}
		if ($ext_sys_cd.equalsIgnoreCase(name)) {
			return ext_sys_cd();
		}
		if ($doc_id.equalsIgnoreCase(name)) {
			return doc_id();
		}
		if ($preview_url.equalsIgnoreCase(name)) {
			return preview_url();
		}
		if ($rmrks1.equalsIgnoreCase(name)) {
			return rmrks1();
		}
		if ($rmrks2.equalsIgnoreCase(name)) {
			return rmrks2();
		}
		if ($rmrks3.equalsIgnoreCase(name)) {
			return rmrks3();
		}
		if ($rmrks4.equalsIgnoreCase(name)) {
			return rmrks4();
		}
		if ($rmrks5.equalsIgnoreCase(name)) {
			return rmrks5();
		}
		if ($file_path.equalsIgnoreCase(name)) {
			return file_path();
		}
		if ($file_nm.equalsIgnoreCase(name)) {
			return file_nm();
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($sls_dpt_cd.equalsIgnoreCase(name)) {
			return sls_dpt_cd();
		}
		if ($purc_dpt_cd.equalsIgnoreCase(name)) {
			return purc_dpt_cd();
		}
		if ($ar_dpt_cd.equalsIgnoreCase(name)) {
			return ar_dpt_cd();
		}
		if ($bill_dpt_cd.equalsIgnoreCase(name)) {
			return bill_dpt_cd();
		}
		if ($bsppl_dpt_cd.equalsIgnoreCase(name)) {
			return bsppl_dpt_cd();
		}
		if ($dlv_cd.equalsIgnoreCase(name)) {
			return dlv_cd();
		}
		if ($dest_cd1.equalsIgnoreCase(name)) {
			return dest_cd1();
		}
		if ($dest_cd2.equalsIgnoreCase(name)) {
			return dest_cd2();
		}
		if ($dest_cd3.equalsIgnoreCase(name)) {
			return dest_cd3();
		}
		if ($cst_cd.equalsIgnoreCase(name)) {
			return cst_cd();
		}
		if ($acst_cd.equalsIgnoreCase(name)) {
			return acst_cd();
		}
		if ($bcst_cd.equalsIgnoreCase(name)) {
			return bcst_cd();
		}
		if ($sppl_cd.equalsIgnoreCase(name)) {
			return sppl_cd();
		}
		if ($asppl_cd.equalsIgnoreCase(name)) {
			return asppl_cd();
		}
		if ($bsppl_cd.equalsIgnoreCase(name)) {
			return bsppl_cd();
		}
		if ($psppl_cd.equalsIgnoreCase(name)) {
			return psppl_cd();
		}
		if ($cntry_cd.equalsIgnoreCase(name)) {
			return cntry_cd();
		}
		if ($ptax_cur_cd.equalsIgnoreCase(name)) {
			return ptax_cur_cd();
		}
		if ($wrk_no.equalsIgnoreCase(name)) {
			return wrk_no();
		}
		if ($tterm_cd1.equalsIgnoreCase(name)) {
			return tterm_cd1();
		}
		if ($tterm_cd2.equalsIgnoreCase(name)) {
			return tterm_cd2();
		}
		if ($tterm_cd3.equalsIgnoreCase(name)) {
			return tterm_cd3();
		}
		if ($edi_sub_char1.equalsIgnoreCase(name)) {
			return edi_sub_char1();
		}
		if ($edi_sub_char2.equalsIgnoreCase(name)) {
			return edi_sub_char2();
		}
		if ($edi_sub_char3.equalsIgnoreCase(name)) {
			return edi_sub_char3();
		}
		if ($edi_sub_char4.equalsIgnoreCase(name)) {
			return edi_sub_char4();
		}
		if ($edi_sub_char5.equalsIgnoreCase(name)) {
			return edi_sub_char5();
		}
		if ($rpt_attr1.equalsIgnoreCase(name)) {
			return rpt_attr1();
		}
		if ($rpt_attr2.equalsIgnoreCase(name)) {
			return rpt_attr2();
		}
		if ($rpt_attr3.equalsIgnoreCase(name)) {
			return rpt_attr3();
		}
		if ($rpt_attr4.equalsIgnoreCase(name)) {
			return rpt_attr4();
		}
		if ($rpt_attr5.equalsIgnoreCase(name)) {
			return rpt_attr5();
		}
		if ($rpt_attr6.equalsIgnoreCase(name)) {
			return rpt_attr6();
		}
		if ($rpt_attr7.equalsIgnoreCase(name)) {
			return rpt_attr7();
		}
		if ($rpt_attr8.equalsIgnoreCase(name)) {
			return rpt_attr8();
		}
		if ($rpt_attr9.equalsIgnoreCase(name)) {
			return rpt_attr9();
		}
		if ($rpt_attr10.equalsIgnoreCase(name)) {
			return rpt_attr10();
		}
		if ($rpt_attr11.equalsIgnoreCase(name)) {
			return rpt_attr11();
		}
		if ($rpt_attr12.equalsIgnoreCase(name)) {
			return rpt_attr12();
		}
		if ($rpt_attr13.equalsIgnoreCase(name)) {
			return rpt_attr13();
		}
		if ($rpt_attr14.equalsIgnoreCase(name)) {
			return rpt_attr14();
		}
		if ($rpt_attr15.equalsIgnoreCase(name)) {
			return rpt_attr15();
		}
		if ($rpt_attr16.equalsIgnoreCase(name)) {
			return rpt_attr16();
		}
		if ($rpt_attr17.equalsIgnoreCase(name)) {
			return rpt_attr17();
		}
		if ($rpt_attr18.equalsIgnoreCase(name)) {
			return rpt_attr18();
		}
		if ($rpt_attr19.equalsIgnoreCase(name)) {
			return rpt_attr19();
		}
		if ($rpt_attr20.equalsIgnoreCase(name)) {
			return rpt_attr20();
		}
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			return data_crud_typ();
		}
		if ($data_crud_typ_nm.equalsIgnoreCase(name)) {
			return data_crud_typ_nm();
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
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($edition.equalsIgnoreCase(name)) {
			return edition();
		}
		if ($amt.equalsIgnoreCase(name)) {
			return amt();
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			return upd_cntr();
		}
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($dt.equalsIgnoreCase(name)) {
			return dt();
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
		if ($archive_flg.equalsIgnoreCase(name)) {
			return archive_flg();
		}
		if ($fs_flg.equalsIgnoreCase(name)) {
			return fs_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($data_no.equalsIgnoreCase(name)) {
			data_no(value);
			return;
		}
		if ($biz_typ.equalsIgnoreCase(name)) {
			biz_typ(value);
			return;
		}
		if ($biz_typ_nm.equalsIgnoreCase(name)) {
			biz_typ_nm(value);
			return;
		}
		if ($biz_key1.equalsIgnoreCase(name)) {
			biz_key1(value);
			return;
		}
		if ($biz_key2.equalsIgnoreCase(name)) {
			biz_key2(value);
			return;
		}
		if ($biz_key3.equalsIgnoreCase(name)) {
			biz_key3(value);
			return;
		}
		if ($biz_key4.equalsIgnoreCase(name)) {
			biz_key4(value);
			return;
		}
		if ($biz_key5.equalsIgnoreCase(name)) {
			biz_key5(value);
			return;
		}
		if ($biz_key6.equalsIgnoreCase(name)) {
			biz_key6(value);
			return;
		}
		if ($biz_key7.equalsIgnoreCase(name)) {
			biz_key7(value);
			return;
		}
		if ($biz_key8.equalsIgnoreCase(name)) {
			biz_key8(value);
			return;
		}
		if ($biz_key9.equalsIgnoreCase(name)) {
			biz_key9(value);
			return;
		}
		if ($biz_key10.equalsIgnoreCase(name)) {
			biz_key10(value);
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
		if ($cur_cd.equalsIgnoreCase(name)) {
			cur_cd(value);
			return;
		}
		if ($cur_nm.equalsIgnoreCase(name)) {
			cur_nm(value);
			return;
		}
		if ($ext_sys_cd.equalsIgnoreCase(name)) {
			ext_sys_cd(value);
			return;
		}
		if ($doc_id.equalsIgnoreCase(name)) {
			doc_id(value);
			return;
		}
		if ($preview_url.equalsIgnoreCase(name)) {
			preview_url(value);
			return;
		}
		if ($rmrks1.equalsIgnoreCase(name)) {
			rmrks1(value);
			return;
		}
		if ($rmrks2.equalsIgnoreCase(name)) {
			rmrks2(value);
			return;
		}
		if ($rmrks3.equalsIgnoreCase(name)) {
			rmrks3(value);
			return;
		}
		if ($rmrks4.equalsIgnoreCase(name)) {
			rmrks4(value);
			return;
		}
		if ($rmrks5.equalsIgnoreCase(name)) {
			rmrks5(value);
			return;
		}
		if ($file_path.equalsIgnoreCase(name)) {
			file_path(value);
			return;
		}
		if ($file_nm.equalsIgnoreCase(name)) {
			file_nm(value);
			return;
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			wg_cd(value);
			return;
		}
		if ($sls_dpt_cd.equalsIgnoreCase(name)) {
			sls_dpt_cd(value);
			return;
		}
		if ($purc_dpt_cd.equalsIgnoreCase(name)) {
			purc_dpt_cd(value);
			return;
		}
		if ($ar_dpt_cd.equalsIgnoreCase(name)) {
			ar_dpt_cd(value);
			return;
		}
		if ($bill_dpt_cd.equalsIgnoreCase(name)) {
			bill_dpt_cd(value);
			return;
		}
		if ($bsppl_dpt_cd.equalsIgnoreCase(name)) {
			bsppl_dpt_cd(value);
			return;
		}
		if ($dlv_cd.equalsIgnoreCase(name)) {
			dlv_cd(value);
			return;
		}
		if ($dest_cd1.equalsIgnoreCase(name)) {
			dest_cd1(value);
			return;
		}
		if ($dest_cd2.equalsIgnoreCase(name)) {
			dest_cd2(value);
			return;
		}
		if ($dest_cd3.equalsIgnoreCase(name)) {
			dest_cd3(value);
			return;
		}
		if ($cst_cd.equalsIgnoreCase(name)) {
			cst_cd(value);
			return;
		}
		if ($acst_cd.equalsIgnoreCase(name)) {
			acst_cd(value);
			return;
		}
		if ($bcst_cd.equalsIgnoreCase(name)) {
			bcst_cd(value);
			return;
		}
		if ($sppl_cd.equalsIgnoreCase(name)) {
			sppl_cd(value);
			return;
		}
		if ($asppl_cd.equalsIgnoreCase(name)) {
			asppl_cd(value);
			return;
		}
		if ($bsppl_cd.equalsIgnoreCase(name)) {
			bsppl_cd(value);
			return;
		}
		if ($psppl_cd.equalsIgnoreCase(name)) {
			psppl_cd(value);
			return;
		}
		if ($cntry_cd.equalsIgnoreCase(name)) {
			cntry_cd(value);
			return;
		}
		if ($ptax_cur_cd.equalsIgnoreCase(name)) {
			ptax_cur_cd(value);
			return;
		}
		if ($wrk_no.equalsIgnoreCase(name)) {
			wrk_no(value);
			return;
		}
		if ($tterm_cd1.equalsIgnoreCase(name)) {
			tterm_cd1(value);
			return;
		}
		if ($tterm_cd2.equalsIgnoreCase(name)) {
			tterm_cd2(value);
			return;
		}
		if ($tterm_cd3.equalsIgnoreCase(name)) {
			tterm_cd3(value);
			return;
		}
		if ($edi_sub_char1.equalsIgnoreCase(name)) {
			edi_sub_char1(value);
			return;
		}
		if ($edi_sub_char2.equalsIgnoreCase(name)) {
			edi_sub_char2(value);
			return;
		}
		if ($edi_sub_char3.equalsIgnoreCase(name)) {
			edi_sub_char3(value);
			return;
		}
		if ($edi_sub_char4.equalsIgnoreCase(name)) {
			edi_sub_char4(value);
			return;
		}
		if ($edi_sub_char5.equalsIgnoreCase(name)) {
			edi_sub_char5(value);
			return;
		}
		if ($rpt_attr1.equalsIgnoreCase(name)) {
			rpt_attr1(value);
			return;
		}
		if ($rpt_attr2.equalsIgnoreCase(name)) {
			rpt_attr2(value);
			return;
		}
		if ($rpt_attr3.equalsIgnoreCase(name)) {
			rpt_attr3(value);
			return;
		}
		if ($rpt_attr4.equalsIgnoreCase(name)) {
			rpt_attr4(value);
			return;
		}
		if ($rpt_attr5.equalsIgnoreCase(name)) {
			rpt_attr5(value);
			return;
		}
		if ($rpt_attr6.equalsIgnoreCase(name)) {
			rpt_attr6(value);
			return;
		}
		if ($rpt_attr7.equalsIgnoreCase(name)) {
			rpt_attr7(value);
			return;
		}
		if ($rpt_attr8.equalsIgnoreCase(name)) {
			rpt_attr8(value);
			return;
		}
		if ($rpt_attr9.equalsIgnoreCase(name)) {
			rpt_attr9(value);
			return;
		}
		if ($rpt_attr10.equalsIgnoreCase(name)) {
			rpt_attr10(value);
			return;
		}
		if ($rpt_attr11.equalsIgnoreCase(name)) {
			rpt_attr11(value);
			return;
		}
		if ($rpt_attr12.equalsIgnoreCase(name)) {
			rpt_attr12(value);
			return;
		}
		if ($rpt_attr13.equalsIgnoreCase(name)) {
			rpt_attr13(value);
			return;
		}
		if ($rpt_attr14.equalsIgnoreCase(name)) {
			rpt_attr14(value);
			return;
		}
		if ($rpt_attr15.equalsIgnoreCase(name)) {
			rpt_attr15(value);
			return;
		}
		if ($rpt_attr16.equalsIgnoreCase(name)) {
			rpt_attr16(value);
			return;
		}
		if ($rpt_attr17.equalsIgnoreCase(name)) {
			rpt_attr17(value);
			return;
		}
		if ($rpt_attr18.equalsIgnoreCase(name)) {
			rpt_attr18(value);
			return;
		}
		if ($rpt_attr19.equalsIgnoreCase(name)) {
			rpt_attr19(value);
			return;
		}
		if ($rpt_attr20.equalsIgnoreCase(name)) {
			rpt_attr20(value);
			return;
		}
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			data_crud_typ(value);
			return;
		}
		if ($data_crud_typ_nm.equalsIgnoreCase(name)) {
			data_crud_typ_nm(value);
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
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($edition.equalsIgnoreCase(name)) {
			edition(value);
			return;
		}
		if ($amt.equalsIgnoreCase(name)) {
			amt(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($edition.equalsIgnoreCase(name)) {
			edition(value);
			return;
		}
		if ($amt.equalsIgnoreCase(name)) {
			amt(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($edition.equalsIgnoreCase(name)) {
			edition(value);
			return;
		}
		if ($amt.equalsIgnoreCase(name)) {
			amt(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($edition.equalsIgnoreCase(name)) {
			edition(value);
			return;
		}
		if ($amt.equalsIgnoreCase(name)) {
			amt(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($edition.equalsIgnoreCase(name)) {
			edition(value);
			return;
		}
		if ($amt.equalsIgnoreCase(name)) {
			amt(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($dt.equalsIgnoreCase(name)) {
			dt(value);
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
		if ($archive_flg.equalsIgnoreCase(name)) {
			archive_flg(value);
			return;
		}
		if ($fs_flg.equalsIgnoreCase(name)) {
			fs_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($data_no.equalsIgnoreCase(name)) {
			data_no(value);
			return;
		}
		if ($biz_typ.equalsIgnoreCase(name)) {
			biz_typ(value);
			return;
		}
		if ($biz_typ_nm.equalsIgnoreCase(name)) {
			biz_typ_nm(value);
			return;
		}
		if ($biz_key1.equalsIgnoreCase(name)) {
			biz_key1(value);
			return;
		}
		if ($biz_key2.equalsIgnoreCase(name)) {
			biz_key2(value);
			return;
		}
		if ($biz_key3.equalsIgnoreCase(name)) {
			biz_key3(value);
			return;
		}
		if ($biz_key4.equalsIgnoreCase(name)) {
			biz_key4(value);
			return;
		}
		if ($biz_key5.equalsIgnoreCase(name)) {
			biz_key5(value);
			return;
		}
		if ($biz_key6.equalsIgnoreCase(name)) {
			biz_key6(value);
			return;
		}
		if ($biz_key7.equalsIgnoreCase(name)) {
			biz_key7(value);
			return;
		}
		if ($biz_key8.equalsIgnoreCase(name)) {
			biz_key8(value);
			return;
		}
		if ($biz_key9.equalsIgnoreCase(name)) {
			biz_key9(value);
			return;
		}
		if ($biz_key10.equalsIgnoreCase(name)) {
			biz_key10(value);
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
		if ($cur_cd.equalsIgnoreCase(name)) {
			cur_cd(value);
			return;
		}
		if ($cur_nm.equalsIgnoreCase(name)) {
			cur_nm(value);
			return;
		}
		if ($ext_sys_cd.equalsIgnoreCase(name)) {
			ext_sys_cd(value);
			return;
		}
		if ($doc_id.equalsIgnoreCase(name)) {
			doc_id(value);
			return;
		}
		if ($preview_url.equalsIgnoreCase(name)) {
			preview_url(value);
			return;
		}
		if ($rmrks1.equalsIgnoreCase(name)) {
			rmrks1(value);
			return;
		}
		if ($rmrks2.equalsIgnoreCase(name)) {
			rmrks2(value);
			return;
		}
		if ($rmrks3.equalsIgnoreCase(name)) {
			rmrks3(value);
			return;
		}
		if ($rmrks4.equalsIgnoreCase(name)) {
			rmrks4(value);
			return;
		}
		if ($rmrks5.equalsIgnoreCase(name)) {
			rmrks5(value);
			return;
		}
		if ($file_path.equalsIgnoreCase(name)) {
			file_path(value);
			return;
		}
		if ($file_nm.equalsIgnoreCase(name)) {
			file_nm(value);
			return;
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			wg_cd(value);
			return;
		}
		if ($sls_dpt_cd.equalsIgnoreCase(name)) {
			sls_dpt_cd(value);
			return;
		}
		if ($purc_dpt_cd.equalsIgnoreCase(name)) {
			purc_dpt_cd(value);
			return;
		}
		if ($ar_dpt_cd.equalsIgnoreCase(name)) {
			ar_dpt_cd(value);
			return;
		}
		if ($bill_dpt_cd.equalsIgnoreCase(name)) {
			bill_dpt_cd(value);
			return;
		}
		if ($bsppl_dpt_cd.equalsIgnoreCase(name)) {
			bsppl_dpt_cd(value);
			return;
		}
		if ($dlv_cd.equalsIgnoreCase(name)) {
			dlv_cd(value);
			return;
		}
		if ($dest_cd1.equalsIgnoreCase(name)) {
			dest_cd1(value);
			return;
		}
		if ($dest_cd2.equalsIgnoreCase(name)) {
			dest_cd2(value);
			return;
		}
		if ($dest_cd3.equalsIgnoreCase(name)) {
			dest_cd3(value);
			return;
		}
		if ($cst_cd.equalsIgnoreCase(name)) {
			cst_cd(value);
			return;
		}
		if ($acst_cd.equalsIgnoreCase(name)) {
			acst_cd(value);
			return;
		}
		if ($bcst_cd.equalsIgnoreCase(name)) {
			bcst_cd(value);
			return;
		}
		if ($sppl_cd.equalsIgnoreCase(name)) {
			sppl_cd(value);
			return;
		}
		if ($asppl_cd.equalsIgnoreCase(name)) {
			asppl_cd(value);
			return;
		}
		if ($bsppl_cd.equalsIgnoreCase(name)) {
			bsppl_cd(value);
			return;
		}
		if ($psppl_cd.equalsIgnoreCase(name)) {
			psppl_cd(value);
			return;
		}
		if ($cntry_cd.equalsIgnoreCase(name)) {
			cntry_cd(value);
			return;
		}
		if ($ptax_cur_cd.equalsIgnoreCase(name)) {
			ptax_cur_cd(value);
			return;
		}
		if ($wrk_no.equalsIgnoreCase(name)) {
			wrk_no(value);
			return;
		}
		if ($tterm_cd1.equalsIgnoreCase(name)) {
			tterm_cd1(value);
			return;
		}
		if ($tterm_cd2.equalsIgnoreCase(name)) {
			tterm_cd2(value);
			return;
		}
		if ($tterm_cd3.equalsIgnoreCase(name)) {
			tterm_cd3(value);
			return;
		}
		if ($edi_sub_char1.equalsIgnoreCase(name)) {
			edi_sub_char1(value);
			return;
		}
		if ($edi_sub_char2.equalsIgnoreCase(name)) {
			edi_sub_char2(value);
			return;
		}
		if ($edi_sub_char3.equalsIgnoreCase(name)) {
			edi_sub_char3(value);
			return;
		}
		if ($edi_sub_char4.equalsIgnoreCase(name)) {
			edi_sub_char4(value);
			return;
		}
		if ($edi_sub_char5.equalsIgnoreCase(name)) {
			edi_sub_char5(value);
			return;
		}
		if ($rpt_attr1.equalsIgnoreCase(name)) {
			rpt_attr1(value);
			return;
		}
		if ($rpt_attr2.equalsIgnoreCase(name)) {
			rpt_attr2(value);
			return;
		}
		if ($rpt_attr3.equalsIgnoreCase(name)) {
			rpt_attr3(value);
			return;
		}
		if ($rpt_attr4.equalsIgnoreCase(name)) {
			rpt_attr4(value);
			return;
		}
		if ($rpt_attr5.equalsIgnoreCase(name)) {
			rpt_attr5(value);
			return;
		}
		if ($rpt_attr6.equalsIgnoreCase(name)) {
			rpt_attr6(value);
			return;
		}
		if ($rpt_attr7.equalsIgnoreCase(name)) {
			rpt_attr7(value);
			return;
		}
		if ($rpt_attr8.equalsIgnoreCase(name)) {
			rpt_attr8(value);
			return;
		}
		if ($rpt_attr9.equalsIgnoreCase(name)) {
			rpt_attr9(value);
			return;
		}
		if ($rpt_attr10.equalsIgnoreCase(name)) {
			rpt_attr10(value);
			return;
		}
		if ($rpt_attr11.equalsIgnoreCase(name)) {
			rpt_attr11(value);
			return;
		}
		if ($rpt_attr12.equalsIgnoreCase(name)) {
			rpt_attr12(value);
			return;
		}
		if ($rpt_attr13.equalsIgnoreCase(name)) {
			rpt_attr13(value);
			return;
		}
		if ($rpt_attr14.equalsIgnoreCase(name)) {
			rpt_attr14(value);
			return;
		}
		if ($rpt_attr15.equalsIgnoreCase(name)) {
			rpt_attr15(value);
			return;
		}
		if ($rpt_attr16.equalsIgnoreCase(name)) {
			rpt_attr16(value);
			return;
		}
		if ($rpt_attr17.equalsIgnoreCase(name)) {
			rpt_attr17(value);
			return;
		}
		if ($rpt_attr18.equalsIgnoreCase(name)) {
			rpt_attr18(value);
			return;
		}
		if ($rpt_attr19.equalsIgnoreCase(name)) {
			rpt_attr19(value);
			return;
		}
		if ($rpt_attr20.equalsIgnoreCase(name)) {
			rpt_attr20(value);
			return;
		}
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			data_crud_typ(value);
			return;
		}
		if ($data_crud_typ_nm.equalsIgnoreCase(name)) {
			data_crud_typ_nm(value);
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
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($edition.equalsIgnoreCase(name)) {
			edition(value);
			return;
		}
		if ($amt.equalsIgnoreCase(name)) {
			amt(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($edition.equalsIgnoreCase(name)) {
			edition(value);
			return;
		}
		if ($amt.equalsIgnoreCase(name)) {
			amt(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($edition.equalsIgnoreCase(name)) {
			edition(value);
			return;
		}
		if ($amt.equalsIgnoreCase(name)) {
			amt(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($edition.equalsIgnoreCase(name)) {
			edition(value);
			return;
		}
		if ($amt.equalsIgnoreCase(name)) {
			amt(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($edition.equalsIgnoreCase(name)) {
			edition(value);
			return;
		}
		if ($amt.equalsIgnoreCase(name)) {
			amt(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($dt.equalsIgnoreCase(name)) {
			dt(value);
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
		if ($archive_flg.equalsIgnoreCase(name)) {
			archive_flg(value);
			return;
		}
		if ($fs_flg.equalsIgnoreCase(name)) {
			fs_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

