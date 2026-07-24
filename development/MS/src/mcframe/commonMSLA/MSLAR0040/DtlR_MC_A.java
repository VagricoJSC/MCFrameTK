package mcframe.commonMSLA.MSLAR0040;

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
 * ブロック"Dtl"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class DtlR_MC_A extends MCConstRow {

	/**
	 *  データ行ＮＯ.<p>
	 *
	 */
	public static final String $data_lno = "data_lno";
	/**
	 *  データＮＯ.<p>
	 *
	 */
	public static final String $data_no = "data_no";
	/**
	 *  取引種別ＣＤ.<p>
	 *
	 */
	public static final String $trd_typ_cd = "trd_typ_cd";
	/**
	 *  送信元レコード作成日時.<p>
	 *
	 */
	public static final String $data_make_dt = "data_make_dt";
	/**
	 *  データ更新区分.<p>
	 *
	 */
	public static final String $data_crud_typ = "data_crud_typ";
	/**
	 *  納入指示ＮＯ.<p>
	 *
	 */
	public static final String $dlv_inst_no = "dlv_inst_no";
	/**
	 *  納入指示改訂番号.<p>
	 *
	 */
	public static final String $dlv_inst_rev = "dlv_inst_rev";
	/**
	 *  納入指示明細ＮＯ.<p>
	 *
	 */
	public static final String $dlv_inst_d_no = "dlv_inst_d_no";
	/**
	 *  納入指示ＧＮＯ.<p>
	 *
	 */
	public static final String $dlv_inst_grp_no = "dlv_inst_grp_no";
	/**
	 *  発注ＮＯ.<p>
	 *
	 */
	public static final String $po_no = "po_no";
	/**
	 *  発注改訂番号.<p>
	 *
	 */
	public static final String $po_rev = "po_rev";
	/**
	 *  発注明細ＮＯ.<p>
	 *
	 */
	public static final String $po_d_no = "po_d_no";
	/**
	 *  発注者ＣＤ.<p>
	 *
	 */
	public static final String $po_co_cd = "po_co_cd";
	/**
	 *  発注者名.<p>
	 *
	 */
	public static final String $po_co_nm = "po_co_nm";
	/**
	 *  発注者国ＣＤ.<p>
	 *
	 */
	public static final String $po_co_cntry_cd = "po_co_cntry_cd";
	/**
	 *  受注者ＣＤ.<p>
	 *
	 */
	public static final String $slo_co_cd = "slo_co_cd";
	/**
	 *  受注者名.<p>
	 *
	 */
	public static final String $slo_co_nm = "slo_co_nm";
	/**
	 *  受注者国ＣＤ.<p>
	 *
	 */
	public static final String $slo_co_cntry_cd = "slo_co_cntry_cd";
	/**
	 *  納入指示日.<p>
	 *
	 */
	public static final String $dlv_inst_dt = "dlv_inst_dt";
	/**
	 *  納入指示書備考.<p>
	 *
	 */
	public static final String $dlv_inst_print_rmrks = "dlv_inst_print_rmrks";
	/**
	 *  納入指示書明細備考.<p>
	 *
	 */
	public static final String $dlv_inst_print_d_rmrks = "dlv_inst_print_d_rmrks";
	/**
	 *  納入先識別区分.<p>
	 *
	 */
	public static final String $in_to_id_typ = "in_to_id_typ";
	/**
	 *  納入先識別ＣＤ.<p>
	 *
	 */
	public static final String $in_to_id_cd = "in_to_id_cd";
	/**
	 *  納入先名.<p>
	 *
	 */
	public static final String $in_to_nm = "in_to_nm";
	/**
	 *  納入先郵便番号.<p>
	 *
	 */
	public static final String $in_to_zip_cd = "in_to_zip_cd";
	/**
	 *  納入先住所１.<p>
	 *
	 */
	public static final String $in_to_addr1 = "in_to_addr1";
	/**
	 *  納入先住所２.<p>
	 *
	 */
	public static final String $in_to_addr2 = "in_to_addr2";
	/**
	 *  納入先住所３.<p>
	 *
	 */
	public static final String $in_to_addr3 = "in_to_addr3";
	/**
	 *  納入先住所４.<p>
	 *
	 */
	public static final String $in_to_addr4 = "in_to_addr4";
	/**
	 *  納入先担当部署.<p>
	 *
	 */
	public static final String $in_to_cntct_dpt = "in_to_cntct_dpt";
	/**
	 *  納入先担当者.<p>
	 *
	 */
	public static final String $in_to_cntct_psn = "in_to_cntct_psn";
	/**
	 *  納入先ＴＥＬ.<p>
	 *
	 */
	public static final String $in_to_tel = "in_to_tel";
	/**
	 *  納入先ＦＡＸ.<p>
	 *
	 */
	public static final String $in_to_fax = "in_to_fax";
	/**
	 *  納入先諸口ＦＬＧ.<p>
	 *
	 */
	public static final String $in_to_sundry_flg = "in_to_sundry_flg";
	/**
	 *  納入先国ＣＤ.<p>
	 *
	 */
	public static final String $in_to_cntry_cd = "in_to_cntry_cd";
	/**
	 *  配送先ＣＤ.<p>
	 *
	 */
	public static final String $tdlv_cd = "tdlv_cd";
	/**
	 *  配送先名.<p>
	 *
	 */
	public static final String $tdlv_nm = "tdlv_nm";
	/**
	 *  配送先郵便番号.<p>
	 *
	 */
	public static final String $tdlv_zip_cd = "tdlv_zip_cd";
	/**
	 *  配送先住所１.<p>
	 *
	 */
	public static final String $tdlv_addr1 = "tdlv_addr1";
	/**
	 *  配送先住所２.<p>
	 *
	 */
	public static final String $tdlv_addr2 = "tdlv_addr2";
	/**
	 *  配送先住所３.<p>
	 *
	 */
	public static final String $tdlv_addr3 = "tdlv_addr3";
	/**
	 *  配送先住所４.<p>
	 *
	 */
	public static final String $tdlv_addr4 = "tdlv_addr4";
	/**
	 *  配送先担当部署.<p>
	 *
	 */
	public static final String $tdlv_cntct_dpt = "tdlv_cntct_dpt";
	/**
	 *  配送先担当者.<p>
	 *
	 */
	public static final String $tdlv_cntct_psn = "tdlv_cntct_psn";
	/**
	 *  配送先ＴＥＬ.<p>
	 *
	 */
	public static final String $tdlv_tel = "tdlv_tel";
	/**
	 *  配送先ＦＡＸ.<p>
	 *
	 */
	public static final String $tdlv_fax = "tdlv_fax";
	/**
	 *  配送先諸口ＦＬＧ.<p>
	 *
	 */
	public static final String $tdlv_sundry_flg = "tdlv_sundry_flg";
	/**
	 *  配送先国ＣＤ.<p>
	 *
	 */
	public static final String $tdlv_cntry_cd = "tdlv_cntry_cd";
	/**
	 *  着曜日.<p>
	 *
	 */
	public static final String $dlv_day_week_typ = "dlv_day_week_typ";
	/**
	 *  価格印字区分.<p>
	 *
	 */
	public static final String $pri_prnt_typ = "pri_prnt_typ";
	/**
	 *  発注者品目ＣＤ.<p>
	 *
	 */
	public static final String $po_co_itm_cd = "po_co_itm_cd";
	/**
	 *  発注者枝番１.<p>
	 *
	 */
	public static final String $po_co_itm_sub1 = "po_co_itm_sub1";
	/**
	 *  発注者枝番２.<p>
	 *
	 */
	public static final String $po_co_itm_sub2 = "po_co_itm_sub2";
	/**
	 *  発注者枝番３.<p>
	 *
	 */
	public static final String $po_co_itm_sub3 = "po_co_itm_sub3";
	/**
	 *  発注者諸口品ＦＬＧ.<p>
	 *
	 */
	public static final String $po_co_sundry_itm_flg = "po_co_sundry_itm_flg";
	/**
	 *  発注者品名.<p>
	 *
	 */
	public static final String $po_co_itm_nm = "po_co_itm_nm";
	/**
	 *  発注者インボイス表記品名.<p>
	 *
	 */
	public static final String $po_co_iv_itm_nm = "po_co_iv_itm_nm";
	/**
	 *  受注者品目ＣＤ.<p>
	 *
	 */
	public static final String $slo_co_itm_cd = "slo_co_itm_cd";
	/**
	 *  受注者枝番１.<p>
	 *
	 */
	public static final String $slo_co_itm_sub1 = "slo_co_itm_sub1";
	/**
	 *  受注者枝番２.<p>
	 *
	 */
	public static final String $slo_co_itm_sub2 = "slo_co_itm_sub2";
	/**
	 *  受注者枝番３.<p>
	 *
	 */
	public static final String $slo_co_itm_sub3 = "slo_co_itm_sub3";
	/**
	 *  受注者品名.<p>
	 *
	 */
	public static final String $slo_co_itm_nm = "slo_co_itm_nm";
	/**
	 *  取引単位ＣＤ.<p>
	 *
	 */
	public static final String $trd_unit_cd = "trd_unit_cd";
	/**
	 *  取引単位名.<p>
	 *
	 */
	public static final String $trd_unit_nm = "trd_unit_nm";
	/**
	 *  取引単位数量.<p>
	 *
	 */
	public static final String $trd_unit_qty = "trd_unit_qty";
	/**
	 *  納入希望日.<p>
	 *
	 */
	public static final String $dlv_rqst_dt = "dlv_rqst_dt";
	/**
	 *  納入希望時刻.<p>
	 *
	 */
	public static final String $dlv_rqst_hm = "dlv_rqst_hm";
	/**
	 *  予備ＣＨＡＲ項目１.<p>
	 *
	 */
	public static final String $sub_char1 = "sub_char1";
	/**
	 *  予備ＣＨＡＲ項目２.<p>
	 *
	 */
	public static final String $sub_char2 = "sub_char2";
	/**
	 *  予備ＣＨＡＲ項目３.<p>
	 *
	 */
	public static final String $sub_char3 = "sub_char3";
	/**
	 *  予備ＣＨＡＲ項目４.<p>
	 *
	 */
	public static final String $sub_char4 = "sub_char4";
	/**
	 *  予備ＣＨＡＲ項目５.<p>
	 *
	 */
	public static final String $sub_char5 = "sub_char5";
	/**
	 *  予備ＣＨＡＲ項目６.<p>
	 *
	 */
	public static final String $sub_char6 = "sub_char6";
	/**
	 *  予備ＣＨＡＲ項目７.<p>
	 *
	 */
	public static final String $sub_char7 = "sub_char7";
	/**
	 *  予備ＣＨＡＲ項目８.<p>
	 *
	 */
	public static final String $sub_char8 = "sub_char8";
	/**
	 *  予備ＣＨＡＲ項目９.<p>
	 *
	 */
	public static final String $sub_char9 = "sub_char9";
	/**
	 *  予備ＣＨＡＲ項目１０.<p>
	 *
	 */
	public static final String $sub_char10 = "sub_char10";
	/**
	 *  予備ＣＨＡＲ項目１１.<p>
	 *
	 */
	public static final String $sub_char11 = "sub_char11";
	/**
	 *  予備ＣＨＡＲ項目１２.<p>
	 *
	 */
	public static final String $sub_char12 = "sub_char12";
	/**
	 *  予備ＣＨＡＲ項目１３.<p>
	 *
	 */
	public static final String $sub_char13 = "sub_char13";
	/**
	 *  予備ＣＨＡＲ項目１４.<p>
	 *
	 */
	public static final String $sub_char14 = "sub_char14";
	/**
	 *  予備ＣＨＡＲ項目１５.<p>
	 *
	 */
	public static final String $sub_char15 = "sub_char15";
	/**
	 *  予備ＣＨＡＲ項目１６.<p>
	 *
	 */
	public static final String $sub_char16 = "sub_char16";
	/**
	 *  予備ＣＨＡＲ項目１７.<p>
	 *
	 */
	public static final String $sub_char17 = "sub_char17";
	/**
	 *  予備ＣＨＡＲ項目１８.<p>
	 *
	 */
	public static final String $sub_char18 = "sub_char18";
	/**
	 *  予備ＣＨＡＲ項目１９.<p>
	 *
	 */
	public static final String $sub_char19 = "sub_char19";
	/**
	 *  予備ＣＨＡＲ項目２０.<p>
	 *
	 */
	public static final String $sub_char20 = "sub_char20";
	/**
	 *  予備ＣＨＡＲ項目２１.<p>
	 *
	 */
	public static final String $sub_char21 = "sub_char21";
	/**
	 *  予備ＣＨＡＲ項目２２.<p>
	 *
	 */
	public static final String $sub_char22 = "sub_char22";
	/**
	 *  予備ＣＨＡＲ項目２３.<p>
	 *
	 */
	public static final String $sub_char23 = "sub_char23";
	/**
	 *  予備ＣＨＡＲ項目２４.<p>
	 *
	 */
	public static final String $sub_char24 = "sub_char24";
	/**
	 *  予備ＣＨＡＲ項目２５.<p>
	 *
	 */
	public static final String $sub_char25 = "sub_char25";
	/**
	 *  予備ＣＨＡＲ項目２６.<p>
	 *
	 */
	public static final String $sub_char26 = "sub_char26";
	/**
	 *  予備ＣＨＡＲ項目２７.<p>
	 *
	 */
	public static final String $sub_char27 = "sub_char27";
	/**
	 *  予備ＣＨＡＲ項目２８.<p>
	 *
	 */
	public static final String $sub_char28 = "sub_char28";
	/**
	 *  予備ＣＨＡＲ項目２９.<p>
	 *
	 */
	public static final String $sub_char29 = "sub_char29";
	/**
	 *  予備ＣＨＡＲ項目３０.<p>
	 *
	 */
	public static final String $sub_char30 = "sub_char30";
	/**
	 *  予備ＮＵＭ項目１.<p>
	 *
	 */
	public static final String $sub_num1 = "sub_num1";
	/**
	 *  予備ＮＵＭ項目２.<p>
	 *
	 */
	public static final String $sub_num2 = "sub_num2";
	/**
	 *  予備ＮＵＭ項目３.<p>
	 *
	 */
	public static final String $sub_num3 = "sub_num3";
	/**
	 *  予備ＮＵＭ項目４.<p>
	 *
	 */
	public static final String $sub_num4 = "sub_num4";
	/**
	 *  予備ＮＵＭ項目５.<p>
	 *
	 */
	public static final String $sub_num5 = "sub_num5";
	/**
	 *  予備ＤＡＴＥ項目１.<p>
	 *
	 */
	public static final String $sub_dt1 = "sub_dt1";
	/**
	 *  予備ＤＡＴＥ項目２.<p>
	 *
	 */
	public static final String $sub_dt2 = "sub_dt2";
	/**
	 *  予備ＤＡＴＥ項目３.<p>
	 *
	 */
	public static final String $sub_dt3 = "sub_dt3";
	/**
	 *  予備ＤＡＴＥ項目４.<p>
	 *
	 */
	public static final String $sub_dt4 = "sub_dt4";
	/**
	 *  予備ＤＡＴＥ項目５.<p>
	 *
	 */
	public static final String $sub_dt5 = "sub_dt5";


	public static final MCMeta data_lno_META = createCommonMeta($data_lno, mcframe.commonMA.meta.MA_META.IF_DATA_LNO);
	public static final MCMeta data_no_META = createCommonMeta($data_no, mcframe.commonMA.meta.MA_META.IF_DATA_NO);
	public static final MCMeta trd_typ_cd_META = createCommonMeta($trd_typ_cd, mcframe.commonMA.meta.MA_META.IF_TRD_TYP_CD);
	public static final MCMeta data_make_dt_META = createCommonMeta($data_make_dt, mcframe.commonMA.meta.MA_META.YMDHMS);
	public static final MCMeta data_crud_typ_META = createCommonMeta($data_crud_typ, mcframe.commonMA.meta.MA_META.DATA_CRUD_TYP);
	public static final MCMeta dlv_inst_no_META = createCommonMeta($dlv_inst_no, mcframe.commonMA.meta.MA_META.DLV_INST_NO);
	public static final MCMeta dlv_inst_rev_META = createCommonMeta($dlv_inst_rev, mcframe.commonMA.meta.MA_META.SLIP_REV);
	public static final MCMeta dlv_inst_d_no_META = createCommonMeta($dlv_inst_d_no, mcframe.commonMA.meta.MA_META.DLV_INST_D_NO);
	public static final MCMeta dlv_inst_grp_no_META = createCommonMeta($dlv_inst_grp_no, mcframe.commonMS.meta.MS_META.DLV_INST_GRP_NO);
	public static final MCMeta po_no_META = createCommonMeta($po_no, mcframe.commonMA.meta.MA_META.CST_PO_NO);
	public static final MCMeta po_rev_META = createCommonMeta($po_rev, mcframe.commonMA.meta.MA_META.SLIP_REV);
	public static final MCMeta po_d_no_META = createCommonMeta($po_d_no, mcframe.commonMA.meta.MA_META.CST_PO_D_NO);
	public static final MCMeta po_co_cd_META = createCommonMeta($po_co_cd, mcframe.commonMA.meta.MA_META.IF_EXT_SYS_CD);
	public static final MCMeta po_co_nm_META = createCommonMeta($po_co_nm, mcframe.commonMA.meta.MA_META.IF_EXT_SYS_NM);
	public static final MCMeta po_co_cntry_cd_META = createCommonMeta($po_co_cntry_cd, mcframe.commonMA.meta.MA_META.IF_EXT_SYS_CD);
	public static final MCMeta slo_co_cd_META = createCommonMeta($slo_co_cd, mcframe.commonMA.meta.MA_META.IF_EXT_SYS_CD);
	public static final MCMeta slo_co_nm_META = createCommonMeta($slo_co_nm, mcframe.commonMA.meta.MA_META.IF_EXT_SYS_NM);
	public static final MCMeta slo_co_cntry_cd_META = createCommonMeta($slo_co_cntry_cd, mcframe.commonMA.meta.MA_META.IF_EXT_SYS_CD);
	public static final MCMeta dlv_inst_dt_META = createCommonMeta($dlv_inst_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta dlv_inst_print_rmrks_META = createCommonMeta($dlv_inst_print_rmrks, mcframe.commonMS.meta.MS_META.DLV_INST_PRINT_RMRKS);
	public static final MCMeta dlv_inst_print_d_rmrks_META = createCommonMeta($dlv_inst_print_d_rmrks, mcframe.commonMS.meta.MS_META.DLV_INST_PRINT_D_RMRKS);
	public static final MCMeta in_to_id_typ_META = createCommonMeta($in_to_id_typ, mcframe.commonMS.meta.MS_META.SHIP_TO_ID_TYP);
	public static final MCMeta in_to_id_cd_META = createCommonMeta($in_to_id_cd, mcframe.commonMA.meta.MA_META.IF_EXT_SYS_CD);
	public static final MCMeta in_to_nm_META = createCommonMeta($in_to_nm, mcframe.commonMA.meta.MA_META.IF_EXT_SYS_NM);
	public static final MCMeta in_to_zip_cd_META = createCommonMeta($in_to_zip_cd, mcframe.commonMA.meta.MA_META.ZIP_CD);
	public static final MCMeta in_to_addr1_META = createCommonMeta($in_to_addr1, mcframe.commonMA.meta.MA_META.ADDR);
	public static final MCMeta in_to_addr2_META = createCommonMeta($in_to_addr2, mcframe.commonMA.meta.MA_META.ADDR);
	public static final MCMeta in_to_addr3_META = createCommonMeta($in_to_addr3, mcframe.commonMA.meta.MA_META.ADDR);
	public static final MCMeta in_to_addr4_META = createCommonMeta($in_to_addr4, mcframe.commonMA.meta.MA_META.ADDR);
	public static final MCMeta in_to_cntct_dpt_META = createCommonMeta($in_to_cntct_dpt, mcframe.commonMA.meta.MA_META.BP_CNTCT_DPT);
	public static final MCMeta in_to_cntct_psn_META = createCommonMeta($in_to_cntct_psn, mcframe.commonMA.meta.MA_META.BP_CNTCT_PSN);
	public static final MCMeta in_to_tel_META = createCommonMeta($in_to_tel, mcframe.commonMA.meta.MA_META.TEL);
	public static final MCMeta in_to_fax_META = createCommonMeta($in_to_fax, mcframe.commonMA.meta.MA_META.TEL);
	public static final MCMeta in_to_sundry_flg_META = createCommonMeta($in_to_sundry_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta in_to_cntry_cd_META = createCommonMeta($in_to_cntry_cd, mcframe.commonMA.meta.MA_META.IF_EXT_SYS_CD);
	public static final MCMeta tdlv_cd_META = createCommonMeta($tdlv_cd, mcframe.commonMA.meta.MA_META.IF_EXT_SYS_CD);
	public static final MCMeta tdlv_nm_META = createCommonMeta($tdlv_nm, mcframe.commonMA.meta.MA_META.IF_EXT_SYS_NM);
	public static final MCMeta tdlv_zip_cd_META = createCommonMeta($tdlv_zip_cd, mcframe.commonMA.meta.MA_META.ZIP_CD);
	public static final MCMeta tdlv_addr1_META = createCommonMeta($tdlv_addr1, mcframe.commonMA.meta.MA_META.ADDR);
	public static final MCMeta tdlv_addr2_META = createCommonMeta($tdlv_addr2, mcframe.commonMA.meta.MA_META.ADDR);
	public static final MCMeta tdlv_addr3_META = createCommonMeta($tdlv_addr3, mcframe.commonMA.meta.MA_META.ADDR);
	public static final MCMeta tdlv_addr4_META = createCommonMeta($tdlv_addr4, mcframe.commonMA.meta.MA_META.ADDR);
	public static final MCMeta tdlv_cntct_dpt_META = createCommonMeta($tdlv_cntct_dpt, mcframe.commonMA.meta.MA_META.BP_CNTCT_DPT);
	public static final MCMeta tdlv_cntct_psn_META = createCommonMeta($tdlv_cntct_psn, mcframe.commonMA.meta.MA_META.BP_CNTCT_PSN);
	public static final MCMeta tdlv_tel_META = createCommonMeta($tdlv_tel, mcframe.commonMA.meta.MA_META.TEL);
	public static final MCMeta tdlv_fax_META = createCommonMeta($tdlv_fax, mcframe.commonMA.meta.MA_META.TEL);
	public static final MCMeta tdlv_sundry_flg_META = createCommonMeta($tdlv_sundry_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta tdlv_cntry_cd_META = createCommonMeta($tdlv_cntry_cd, mcframe.commonMA.meta.MA_META.IF_EXT_SYS_CD);
	public static final MCMeta dlv_day_week_typ_META = createCommonMeta($dlv_day_week_typ, mcframe.commonMA.meta.MA_META.DAY_WEEK_TYP);
	public static final MCMeta pri_prnt_typ_META = createCommonMeta($pri_prnt_typ, mcframe.commonMA.meta.MA_META.PRI_PRNT_TYP);
	public static final MCMeta po_co_itm_cd_META = createCommonMeta($po_co_itm_cd, mcframe.commonMA.meta.MA_META.IF_EXT_SYS_CD);
	public static final MCMeta po_co_itm_sub1_META = createCommonMeta($po_co_itm_sub1, mcframe.commonMA.meta.MA_META.ITM_SUB1);
	public static final MCMeta po_co_itm_sub2_META = createCommonMeta($po_co_itm_sub2, mcframe.commonMA.meta.MA_META.ITM_SUB2);
	public static final MCMeta po_co_itm_sub3_META = createCommonMeta($po_co_itm_sub3, mcframe.commonMA.meta.MA_META.ITM_SUB3);
	public static final MCMeta po_co_sundry_itm_flg_META = createCommonMeta($po_co_sundry_itm_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta po_co_itm_nm_META = createCommonMeta($po_co_itm_nm, mcframe.commonMA.meta.MA_META.IF_EXT_SYS_NM);
	public static final MCMeta po_co_iv_itm_nm_META = createCommonMeta($po_co_iv_itm_nm, mcframe.commonMA.meta.MA_META.ITM_NM);
	public static final MCMeta slo_co_itm_cd_META = createCommonMeta($slo_co_itm_cd, mcframe.commonMA.meta.MA_META.IF_EXT_SYS_CD);
	public static final MCMeta slo_co_itm_sub1_META = createCommonMeta($slo_co_itm_sub1, mcframe.commonMA.meta.MA_META.ITM_SUB1);
	public static final MCMeta slo_co_itm_sub2_META = createCommonMeta($slo_co_itm_sub2, mcframe.commonMA.meta.MA_META.ITM_SUB2);
	public static final MCMeta slo_co_itm_sub3_META = createCommonMeta($slo_co_itm_sub3, mcframe.commonMA.meta.MA_META.ITM_SUB3);
	public static final MCMeta slo_co_itm_nm_META = createCommonMeta($slo_co_itm_nm, mcframe.commonMA.meta.MA_META.IF_EXT_SYS_NM);
	public static final MCMeta trd_unit_cd_META = createCommonMeta($trd_unit_cd, mcframe.commonMA.meta.MA_META.IF_EXT_SYS_CD);
	public static final MCMeta trd_unit_nm_META = createCommonMeta($trd_unit_nm, mcframe.commonMA.meta.MA_META.IF_EXT_SYS_NM);
	public static final MCMeta trd_unit_qty_META = createCommonMeta($trd_unit_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta dlv_rqst_dt_META = createCommonMeta($dlv_rqst_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta dlv_rqst_hm_META = createCommonMeta($dlv_rqst_hm, mcframe.commonMA.meta.MA_META.HM);
	public static final MCMeta sub_char1_META = createCommonMeta($sub_char1, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR1);
	public static final MCMeta sub_char2_META = createCommonMeta($sub_char2, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR2);
	public static final MCMeta sub_char3_META = createCommonMeta($sub_char3, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR3);
	public static final MCMeta sub_char4_META = createCommonMeta($sub_char4, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR4);
	public static final MCMeta sub_char5_META = createCommonMeta($sub_char5, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR5);
	public static final MCMeta sub_char6_META = createCommonMeta($sub_char6, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR6);
	public static final MCMeta sub_char7_META = createCommonMeta($sub_char7, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR7);
	public static final MCMeta sub_char8_META = createCommonMeta($sub_char8, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR8);
	public static final MCMeta sub_char9_META = createCommonMeta($sub_char9, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR9);
	public static final MCMeta sub_char10_META = createCommonMeta($sub_char10, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR10);
	public static final MCMeta sub_char11_META = createCommonMeta($sub_char11, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR11);
	public static final MCMeta sub_char12_META = createCommonMeta($sub_char12, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR12);
	public static final MCMeta sub_char13_META = createCommonMeta($sub_char13, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR13);
	public static final MCMeta sub_char14_META = createCommonMeta($sub_char14, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR14);
	public static final MCMeta sub_char15_META = createCommonMeta($sub_char15, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR15);
	public static final MCMeta sub_char16_META = createCommonMeta($sub_char16, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR16);
	public static final MCMeta sub_char17_META = createCommonMeta($sub_char17, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR17);
	public static final MCMeta sub_char18_META = createCommonMeta($sub_char18, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR18);
	public static final MCMeta sub_char19_META = createCommonMeta($sub_char19, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR19);
	public static final MCMeta sub_char20_META = createCommonMeta($sub_char20, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR20);
	public static final MCMeta sub_char21_META = createCommonMeta($sub_char21, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR21);
	public static final MCMeta sub_char22_META = createCommonMeta($sub_char22, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR22);
	public static final MCMeta sub_char23_META = createCommonMeta($sub_char23, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR23);
	public static final MCMeta sub_char24_META = createCommonMeta($sub_char24, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR24);
	public static final MCMeta sub_char25_META = createCommonMeta($sub_char25, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR25);
	public static final MCMeta sub_char26_META = createCommonMeta($sub_char26, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR26);
	public static final MCMeta sub_char27_META = createCommonMeta($sub_char27, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR27);
	public static final MCMeta sub_char28_META = createCommonMeta($sub_char28, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR28);
	public static final MCMeta sub_char29_META = createCommonMeta($sub_char29, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR29);
	public static final MCMeta sub_char30_META = createCommonMeta($sub_char30, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR30);
	public static final MCMeta sub_num1_META = createCommonMeta($sub_num1, mcframe.commonMA.meta.MA_META.IF_SUB_NUM1);
	public static final MCMeta sub_num2_META = createCommonMeta($sub_num2, mcframe.commonMA.meta.MA_META.IF_SUB_NUM2);
	public static final MCMeta sub_num3_META = createCommonMeta($sub_num3, mcframe.commonMA.meta.MA_META.IF_SUB_NUM3);
	public static final MCMeta sub_num4_META = createCommonMeta($sub_num4, mcframe.commonMA.meta.MA_META.IF_SUB_NUM4);
	public static final MCMeta sub_num5_META = createCommonMeta($sub_num5, mcframe.commonMA.meta.MA_META.IF_SUB_NUM5);
	public static final MCMeta sub_dt1_META = createCommonMeta($sub_dt1, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta sub_dt2_META = createCommonMeta($sub_dt2, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta sub_dt3_META = createCommonMeta($sub_dt3, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta sub_dt4_META = createCommonMeta($sub_dt4, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta sub_dt5_META = createCommonMeta($sub_dt5, mcframe.commonMA.meta.MA_META.DT);

	protected static final ConstMetaList<DtlR> constMetas = new ConstMetaList<DtlR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			data_lno_META,
			data_no_META,
			trd_typ_cd_META,
			data_make_dt_META,
			data_crud_typ_META,
			dlv_inst_no_META,
			dlv_inst_rev_META,
			dlv_inst_d_no_META,
			dlv_inst_grp_no_META,
			po_no_META,
			po_rev_META,
			po_d_no_META,
			po_co_cd_META,
			po_co_nm_META,
			po_co_cntry_cd_META,
			slo_co_cd_META,
			slo_co_nm_META,
			slo_co_cntry_cd_META,
			dlv_inst_dt_META,
			dlv_inst_print_rmrks_META,
			dlv_inst_print_d_rmrks_META,
			in_to_id_typ_META,
			in_to_id_cd_META,
			in_to_nm_META,
			in_to_zip_cd_META,
			in_to_addr1_META,
			in_to_addr2_META,
			in_to_addr3_META,
			in_to_addr4_META,
			in_to_cntct_dpt_META,
			in_to_cntct_psn_META,
			in_to_tel_META,
			in_to_fax_META,
			in_to_sundry_flg_META,
			in_to_cntry_cd_META,
			tdlv_cd_META,
			tdlv_nm_META,
			tdlv_zip_cd_META,
			tdlv_addr1_META,
			tdlv_addr2_META,
			tdlv_addr3_META,
			tdlv_addr4_META,
			tdlv_cntct_dpt_META,
			tdlv_cntct_psn_META,
			tdlv_tel_META,
			tdlv_fax_META,
			tdlv_sundry_flg_META,
			tdlv_cntry_cd_META,
			dlv_day_week_typ_META,
			pri_prnt_typ_META,
			po_co_itm_cd_META,
			po_co_itm_sub1_META,
			po_co_itm_sub2_META,
			po_co_itm_sub3_META,
			po_co_sundry_itm_flg_META,
			po_co_itm_nm_META,
			po_co_iv_itm_nm_META,
			slo_co_itm_cd_META,
			slo_co_itm_sub1_META,
			slo_co_itm_sub2_META,
			slo_co_itm_sub3_META,
			slo_co_itm_nm_META,
			trd_unit_cd_META,
			trd_unit_nm_META,
			trd_unit_qty_META,
			dlv_rqst_dt_META,
			dlv_rqst_hm_META,
			sub_char1_META,
			sub_char2_META,
			sub_char3_META,
			sub_char4_META,
			sub_char5_META,
			sub_char6_META,
			sub_char7_META,
			sub_char8_META,
			sub_char9_META,
			sub_char10_META,
			sub_char11_META,
			sub_char12_META,
			sub_char13_META,
			sub_char14_META,
			sub_char15_META,
			sub_char16_META,
			sub_char17_META,
			sub_char18_META,
			sub_char19_META,
			sub_char20_META,
			sub_char21_META,
			sub_char22_META,
			sub_char23_META,
			sub_char24_META,
			sub_char25_META,
			sub_char26_META,
			sub_char27_META,
			sub_char28_META,
			sub_char29_META,
			sub_char30_META,
			sub_num1_META,
			sub_num2_META,
			sub_num3_META,
			sub_num4_META,
			sub_num5_META,
			sub_dt1_META,
			sub_dt2_META,
			sub_dt3_META,
			sub_dt4_META,
			sub_dt5_META
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
	protected DtlR_MC_A(ConstMetaList<? extends DtlR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public DtlR clone() {
		return (DtlR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public DtlR createInstance() {
		return (DtlR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public DtlR getValues(String... names) {
		return (DtlR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 *  データ行ＮＯ.<p>
	 *
	 */
	public MCNumber data_lno() {
		return getConstNumber(offset + 0, $data_lno);
	}

	/**
	 *  データ行ＮＯ.<p>
	 *
	 */
	public void data_lno(MCNumber value) {
		setConstNumber(offset + 0, $data_lno, value);
	}

	/**
	 *  データ行ＮＯ.<p>
	 *
	 */
	public void data_lno(int value) {
		setConstNumber(offset + 0, $data_lno, value);
	}

	/**
	 *  データ行ＮＯ.<p>
	 *
	 */
	public void data_lno(long value) {
		setConstNumber(offset + 0, $data_lno, value);
	}

	/**
	 *  データ行ＮＯ.<p>
	 *
	 */
	public void data_lno(float value) {
		setConstNumber(offset + 0, $data_lno, value);
	}

	/**
	 *  データ行ＮＯ.<p>
	 *
	 */
	public void data_lno(double value) {
		setConstNumber(offset + 0, $data_lno, value);
	}


	/**
	 *  データＮＯ.<p>
	 *
	 */
	public MCNumber data_no() {
		return getConstNumber(offset + 1, $data_no);
	}

	/**
	 *  データＮＯ.<p>
	 *
	 */
	public void data_no(MCNumber value) {
		setConstNumber(offset + 1, $data_no, value);
	}

	/**
	 *  データＮＯ.<p>
	 *
	 */
	public void data_no(int value) {
		setConstNumber(offset + 1, $data_no, value);
	}

	/**
	 *  データＮＯ.<p>
	 *
	 */
	public void data_no(long value) {
		setConstNumber(offset + 1, $data_no, value);
	}

	/**
	 *  データＮＯ.<p>
	 *
	 */
	public void data_no(float value) {
		setConstNumber(offset + 1, $data_no, value);
	}

	/**
	 *  データＮＯ.<p>
	 *
	 */
	public void data_no(double value) {
		setConstNumber(offset + 1, $data_no, value);
	}


	/**
	 *  取引種別ＣＤ.<p>
	 *
	 */
	public String trd_typ_cd() {
		return getConstString(offset + 2, $trd_typ_cd);
	}

	/**
	 *  取引種別ＣＤ.<p>
	 *
	 */
	public void trd_typ_cd(String value) {
		setConstString(offset + 2, $trd_typ_cd, value);
	}


	/**
	 *  送信元レコード作成日時.<p>
	 *
	 */
	public MCDate data_make_dt() {
		return getConstDate(offset + 3, $data_make_dt);
	}

	/**
	 *  送信元レコード作成日時.<p>
	 *
	 */
	public void data_make_dt(MCDate value) {
		setConstDate(offset + 3, $data_make_dt, value);
	}


	/**
	 *  データ更新区分.<p>
	 *
	 */
	public String data_crud_typ() {
		return getConstString(offset + 4, $data_crud_typ);
	}

	/**
	 *  データ更新区分.<p>
	 *
	 */
	public void data_crud_typ(String value) {
		setConstString(offset + 4, $data_crud_typ, value);
	}


	/**
	 *  納入指示ＮＯ.<p>
	 *
	 */
	public String dlv_inst_no() {
		return getConstString(offset + 5, $dlv_inst_no);
	}

	/**
	 *  納入指示ＮＯ.<p>
	 *
	 */
	public void dlv_inst_no(String value) {
		setConstString(offset + 5, $dlv_inst_no, value);
	}


	/**
	 *  納入指示改訂番号.<p>
	 *
	 */
	public MCNumber dlv_inst_rev() {
		return getConstNumber(offset + 6, $dlv_inst_rev);
	}

	/**
	 *  納入指示改訂番号.<p>
	 *
	 */
	public void dlv_inst_rev(MCNumber value) {
		setConstNumber(offset + 6, $dlv_inst_rev, value);
	}

	/**
	 *  納入指示改訂番号.<p>
	 *
	 */
	public void dlv_inst_rev(int value) {
		setConstNumber(offset + 6, $dlv_inst_rev, value);
	}

	/**
	 *  納入指示改訂番号.<p>
	 *
	 */
	public void dlv_inst_rev(long value) {
		setConstNumber(offset + 6, $dlv_inst_rev, value);
	}

	/**
	 *  納入指示改訂番号.<p>
	 *
	 */
	public void dlv_inst_rev(float value) {
		setConstNumber(offset + 6, $dlv_inst_rev, value);
	}

	/**
	 *  納入指示改訂番号.<p>
	 *
	 */
	public void dlv_inst_rev(double value) {
		setConstNumber(offset + 6, $dlv_inst_rev, value);
	}


	/**
	 *  納入指示明細ＮＯ.<p>
	 *
	 */
	public String dlv_inst_d_no() {
		return getConstString(offset + 7, $dlv_inst_d_no);
	}

	/**
	 *  納入指示明細ＮＯ.<p>
	 *
	 */
	public void dlv_inst_d_no(String value) {
		setConstString(offset + 7, $dlv_inst_d_no, value);
	}


	/**
	 *  納入指示ＧＮＯ.<p>
	 *
	 */
	public String dlv_inst_grp_no() {
		return getConstString(offset + 8, $dlv_inst_grp_no);
	}

	/**
	 *  納入指示ＧＮＯ.<p>
	 *
	 */
	public void dlv_inst_grp_no(String value) {
		setConstString(offset + 8, $dlv_inst_grp_no, value);
	}


	/**
	 *  発注ＮＯ.<p>
	 *
	 */
	public String po_no() {
		return getConstString(offset + 9, $po_no);
	}

	/**
	 *  発注ＮＯ.<p>
	 *
	 */
	public void po_no(String value) {
		setConstString(offset + 9, $po_no, value);
	}


	/**
	 *  発注改訂番号.<p>
	 *
	 */
	public MCNumber po_rev() {
		return getConstNumber(offset + 10, $po_rev);
	}

	/**
	 *  発注改訂番号.<p>
	 *
	 */
	public void po_rev(MCNumber value) {
		setConstNumber(offset + 10, $po_rev, value);
	}

	/**
	 *  発注改訂番号.<p>
	 *
	 */
	public void po_rev(int value) {
		setConstNumber(offset + 10, $po_rev, value);
	}

	/**
	 *  発注改訂番号.<p>
	 *
	 */
	public void po_rev(long value) {
		setConstNumber(offset + 10, $po_rev, value);
	}

	/**
	 *  発注改訂番号.<p>
	 *
	 */
	public void po_rev(float value) {
		setConstNumber(offset + 10, $po_rev, value);
	}

	/**
	 *  発注改訂番号.<p>
	 *
	 */
	public void po_rev(double value) {
		setConstNumber(offset + 10, $po_rev, value);
	}


	/**
	 *  発注明細ＮＯ.<p>
	 *
	 */
	public String po_d_no() {
		return getConstString(offset + 11, $po_d_no);
	}

	/**
	 *  発注明細ＮＯ.<p>
	 *
	 */
	public void po_d_no(String value) {
		setConstString(offset + 11, $po_d_no, value);
	}


	/**
	 *  発注者ＣＤ.<p>
	 *
	 */
	public String po_co_cd() {
		return getConstString(offset + 12, $po_co_cd);
	}

	/**
	 *  発注者ＣＤ.<p>
	 *
	 */
	public void po_co_cd(String value) {
		setConstString(offset + 12, $po_co_cd, value);
	}


	/**
	 *  発注者名.<p>
	 *
	 */
	public String po_co_nm() {
		return getConstString(offset + 13, $po_co_nm);
	}

	/**
	 *  発注者名.<p>
	 *
	 */
	public void po_co_nm(String value) {
		setConstString(offset + 13, $po_co_nm, value);
	}


	/**
	 *  発注者国ＣＤ.<p>
	 *
	 */
	public String po_co_cntry_cd() {
		return getConstString(offset + 14, $po_co_cntry_cd);
	}

	/**
	 *  発注者国ＣＤ.<p>
	 *
	 */
	public void po_co_cntry_cd(String value) {
		setConstString(offset + 14, $po_co_cntry_cd, value);
	}


	/**
	 *  受注者ＣＤ.<p>
	 *
	 */
	public String slo_co_cd() {
		return getConstString(offset + 15, $slo_co_cd);
	}

	/**
	 *  受注者ＣＤ.<p>
	 *
	 */
	public void slo_co_cd(String value) {
		setConstString(offset + 15, $slo_co_cd, value);
	}


	/**
	 *  受注者名.<p>
	 *
	 */
	public String slo_co_nm() {
		return getConstString(offset + 16, $slo_co_nm);
	}

	/**
	 *  受注者名.<p>
	 *
	 */
	public void slo_co_nm(String value) {
		setConstString(offset + 16, $slo_co_nm, value);
	}


	/**
	 *  受注者国ＣＤ.<p>
	 *
	 */
	public String slo_co_cntry_cd() {
		return getConstString(offset + 17, $slo_co_cntry_cd);
	}

	/**
	 *  受注者国ＣＤ.<p>
	 *
	 */
	public void slo_co_cntry_cd(String value) {
		setConstString(offset + 17, $slo_co_cntry_cd, value);
	}


	/**
	 *  納入指示日.<p>
	 *
	 */
	public MCDate dlv_inst_dt() {
		return getConstDate(offset + 18, $dlv_inst_dt);
	}

	/**
	 *  納入指示日.<p>
	 *
	 */
	public void dlv_inst_dt(MCDate value) {
		setConstDate(offset + 18, $dlv_inst_dt, value);
	}


	/**
	 *  納入指示書備考.<p>
	 *
	 */
	public String dlv_inst_print_rmrks() {
		return getConstString(offset + 19, $dlv_inst_print_rmrks);
	}

	/**
	 *  納入指示書備考.<p>
	 *
	 */
	public void dlv_inst_print_rmrks(String value) {
		setConstString(offset + 19, $dlv_inst_print_rmrks, value);
	}


	/**
	 *  納入指示書明細備考.<p>
	 *
	 */
	public String dlv_inst_print_d_rmrks() {
		return getConstString(offset + 20, $dlv_inst_print_d_rmrks);
	}

	/**
	 *  納入指示書明細備考.<p>
	 *
	 */
	public void dlv_inst_print_d_rmrks(String value) {
		setConstString(offset + 20, $dlv_inst_print_d_rmrks, value);
	}


	/**
	 *  納入先識別区分.<p>
	 *
	 */
	public String in_to_id_typ() {
		return getConstString(offset + 21, $in_to_id_typ);
	}

	/**
	 *  納入先識別区分.<p>
	 *
	 */
	public void in_to_id_typ(String value) {
		setConstString(offset + 21, $in_to_id_typ, value);
	}


	/**
	 *  納入先識別ＣＤ.<p>
	 *
	 */
	public String in_to_id_cd() {
		return getConstString(offset + 22, $in_to_id_cd);
	}

	/**
	 *  納入先識別ＣＤ.<p>
	 *
	 */
	public void in_to_id_cd(String value) {
		setConstString(offset + 22, $in_to_id_cd, value);
	}


	/**
	 *  納入先名.<p>
	 *
	 */
	public String in_to_nm() {
		return getConstString(offset + 23, $in_to_nm);
	}

	/**
	 *  納入先名.<p>
	 *
	 */
	public void in_to_nm(String value) {
		setConstString(offset + 23, $in_to_nm, value);
	}


	/**
	 *  納入先郵便番号.<p>
	 *
	 */
	public String in_to_zip_cd() {
		return getConstString(offset + 24, $in_to_zip_cd);
	}

	/**
	 *  納入先郵便番号.<p>
	 *
	 */
	public void in_to_zip_cd(String value) {
		setConstString(offset + 24, $in_to_zip_cd, value);
	}


	/**
	 *  納入先住所１.<p>
	 *
	 */
	public String in_to_addr1() {
		return getConstString(offset + 25, $in_to_addr1);
	}

	/**
	 *  納入先住所１.<p>
	 *
	 */
	public void in_to_addr1(String value) {
		setConstString(offset + 25, $in_to_addr1, value);
	}


	/**
	 *  納入先住所２.<p>
	 *
	 */
	public String in_to_addr2() {
		return getConstString(offset + 26, $in_to_addr2);
	}

	/**
	 *  納入先住所２.<p>
	 *
	 */
	public void in_to_addr2(String value) {
		setConstString(offset + 26, $in_to_addr2, value);
	}


	/**
	 *  納入先住所３.<p>
	 *
	 */
	public String in_to_addr3() {
		return getConstString(offset + 27, $in_to_addr3);
	}

	/**
	 *  納入先住所３.<p>
	 *
	 */
	public void in_to_addr3(String value) {
		setConstString(offset + 27, $in_to_addr3, value);
	}


	/**
	 *  納入先住所４.<p>
	 *
	 */
	public String in_to_addr4() {
		return getConstString(offset + 28, $in_to_addr4);
	}

	/**
	 *  納入先住所４.<p>
	 *
	 */
	public void in_to_addr4(String value) {
		setConstString(offset + 28, $in_to_addr4, value);
	}


	/**
	 *  納入先担当部署.<p>
	 *
	 */
	public String in_to_cntct_dpt() {
		return getConstString(offset + 29, $in_to_cntct_dpt);
	}

	/**
	 *  納入先担当部署.<p>
	 *
	 */
	public void in_to_cntct_dpt(String value) {
		setConstString(offset + 29, $in_to_cntct_dpt, value);
	}


	/**
	 *  納入先担当者.<p>
	 *
	 */
	public String in_to_cntct_psn() {
		return getConstString(offset + 30, $in_to_cntct_psn);
	}

	/**
	 *  納入先担当者.<p>
	 *
	 */
	public void in_to_cntct_psn(String value) {
		setConstString(offset + 30, $in_to_cntct_psn, value);
	}


	/**
	 *  納入先ＴＥＬ.<p>
	 *
	 */
	public String in_to_tel() {
		return getConstString(offset + 31, $in_to_tel);
	}

	/**
	 *  納入先ＴＥＬ.<p>
	 *
	 */
	public void in_to_tel(String value) {
		setConstString(offset + 31, $in_to_tel, value);
	}


	/**
	 *  納入先ＦＡＸ.<p>
	 *
	 */
	public String in_to_fax() {
		return getConstString(offset + 32, $in_to_fax);
	}

	/**
	 *  納入先ＦＡＸ.<p>
	 *
	 */
	public void in_to_fax(String value) {
		setConstString(offset + 32, $in_to_fax, value);
	}


	/**
	 *  納入先諸口ＦＬＧ.<p>
	 *
	 */
	public boolean in_to_sundry_flg() {
		return getConstBoolean(offset + 33, $in_to_sundry_flg);
	}

	/**
	 *  納入先諸口ＦＬＧ.<p>
	 *
	 */
	public void in_to_sundry_flg(boolean value) {
		setConstBoolean(offset + 33, $in_to_sundry_flg, value);
	}


	/**
	 *  納入先国ＣＤ.<p>
	 *
	 */
	public String in_to_cntry_cd() {
		return getConstString(offset + 34, $in_to_cntry_cd);
	}

	/**
	 *  納入先国ＣＤ.<p>
	 *
	 */
	public void in_to_cntry_cd(String value) {
		setConstString(offset + 34, $in_to_cntry_cd, value);
	}


	/**
	 *  配送先ＣＤ.<p>
	 *
	 */
	public String tdlv_cd() {
		return getConstString(offset + 35, $tdlv_cd);
	}

	/**
	 *  配送先ＣＤ.<p>
	 *
	 */
	public void tdlv_cd(String value) {
		setConstString(offset + 35, $tdlv_cd, value);
	}


	/**
	 *  配送先名.<p>
	 *
	 */
	public String tdlv_nm() {
		return getConstString(offset + 36, $tdlv_nm);
	}

	/**
	 *  配送先名.<p>
	 *
	 */
	public void tdlv_nm(String value) {
		setConstString(offset + 36, $tdlv_nm, value);
	}


	/**
	 *  配送先郵便番号.<p>
	 *
	 */
	public String tdlv_zip_cd() {
		return getConstString(offset + 37, $tdlv_zip_cd);
	}

	/**
	 *  配送先郵便番号.<p>
	 *
	 */
	public void tdlv_zip_cd(String value) {
		setConstString(offset + 37, $tdlv_zip_cd, value);
	}


	/**
	 *  配送先住所１.<p>
	 *
	 */
	public String tdlv_addr1() {
		return getConstString(offset + 38, $tdlv_addr1);
	}

	/**
	 *  配送先住所１.<p>
	 *
	 */
	public void tdlv_addr1(String value) {
		setConstString(offset + 38, $tdlv_addr1, value);
	}


	/**
	 *  配送先住所２.<p>
	 *
	 */
	public String tdlv_addr2() {
		return getConstString(offset + 39, $tdlv_addr2);
	}

	/**
	 *  配送先住所２.<p>
	 *
	 */
	public void tdlv_addr2(String value) {
		setConstString(offset + 39, $tdlv_addr2, value);
	}


	/**
	 *  配送先住所３.<p>
	 *
	 */
	public String tdlv_addr3() {
		return getConstString(offset + 40, $tdlv_addr3);
	}

	/**
	 *  配送先住所３.<p>
	 *
	 */
	public void tdlv_addr3(String value) {
		setConstString(offset + 40, $tdlv_addr3, value);
	}


	/**
	 *  配送先住所４.<p>
	 *
	 */
	public String tdlv_addr4() {
		return getConstString(offset + 41, $tdlv_addr4);
	}

	/**
	 *  配送先住所４.<p>
	 *
	 */
	public void tdlv_addr4(String value) {
		setConstString(offset + 41, $tdlv_addr4, value);
	}


	/**
	 *  配送先担当部署.<p>
	 *
	 */
	public String tdlv_cntct_dpt() {
		return getConstString(offset + 42, $tdlv_cntct_dpt);
	}

	/**
	 *  配送先担当部署.<p>
	 *
	 */
	public void tdlv_cntct_dpt(String value) {
		setConstString(offset + 42, $tdlv_cntct_dpt, value);
	}


	/**
	 *  配送先担当者.<p>
	 *
	 */
	public String tdlv_cntct_psn() {
		return getConstString(offset + 43, $tdlv_cntct_psn);
	}

	/**
	 *  配送先担当者.<p>
	 *
	 */
	public void tdlv_cntct_psn(String value) {
		setConstString(offset + 43, $tdlv_cntct_psn, value);
	}


	/**
	 *  配送先ＴＥＬ.<p>
	 *
	 */
	public String tdlv_tel() {
		return getConstString(offset + 44, $tdlv_tel);
	}

	/**
	 *  配送先ＴＥＬ.<p>
	 *
	 */
	public void tdlv_tel(String value) {
		setConstString(offset + 44, $tdlv_tel, value);
	}


	/**
	 *  配送先ＦＡＸ.<p>
	 *
	 */
	public String tdlv_fax() {
		return getConstString(offset + 45, $tdlv_fax);
	}

	/**
	 *  配送先ＦＡＸ.<p>
	 *
	 */
	public void tdlv_fax(String value) {
		setConstString(offset + 45, $tdlv_fax, value);
	}


	/**
	 *  配送先諸口ＦＬＧ.<p>
	 *
	 */
	public boolean tdlv_sundry_flg() {
		return getConstBoolean(offset + 46, $tdlv_sundry_flg);
	}

	/**
	 *  配送先諸口ＦＬＧ.<p>
	 *
	 */
	public void tdlv_sundry_flg(boolean value) {
		setConstBoolean(offset + 46, $tdlv_sundry_flg, value);
	}


	/**
	 *  配送先国ＣＤ.<p>
	 *
	 */
	public String tdlv_cntry_cd() {
		return getConstString(offset + 47, $tdlv_cntry_cd);
	}

	/**
	 *  配送先国ＣＤ.<p>
	 *
	 */
	public void tdlv_cntry_cd(String value) {
		setConstString(offset + 47, $tdlv_cntry_cd, value);
	}


	/**
	 *  着曜日.<p>
	 *
	 */
	public String dlv_day_week_typ() {
		return getConstString(offset + 48, $dlv_day_week_typ);
	}

	/**
	 *  着曜日.<p>
	 *
	 */
	public void dlv_day_week_typ(String value) {
		setConstString(offset + 48, $dlv_day_week_typ, value);
	}


	/**
	 *  価格印字区分.<p>
	 *
	 */
	public String pri_prnt_typ() {
		return getConstString(offset + 49, $pri_prnt_typ);
	}

	/**
	 *  価格印字区分.<p>
	 *
	 */
	public void pri_prnt_typ(String value) {
		setConstString(offset + 49, $pri_prnt_typ, value);
	}


	/**
	 *  発注者品目ＣＤ.<p>
	 *
	 */
	public String po_co_itm_cd() {
		return getConstString(offset + 50, $po_co_itm_cd);
	}

	/**
	 *  発注者品目ＣＤ.<p>
	 *
	 */
	public void po_co_itm_cd(String value) {
		setConstString(offset + 50, $po_co_itm_cd, value);
	}


	/**
	 *  発注者枝番１.<p>
	 *
	 */
	public String po_co_itm_sub1() {
		return getConstString(offset + 51, $po_co_itm_sub1);
	}

	/**
	 *  発注者枝番１.<p>
	 *
	 */
	public void po_co_itm_sub1(String value) {
		setConstString(offset + 51, $po_co_itm_sub1, value);
	}


	/**
	 *  発注者枝番２.<p>
	 *
	 */
	public String po_co_itm_sub2() {
		return getConstString(offset + 52, $po_co_itm_sub2);
	}

	/**
	 *  発注者枝番２.<p>
	 *
	 */
	public void po_co_itm_sub2(String value) {
		setConstString(offset + 52, $po_co_itm_sub2, value);
	}


	/**
	 *  発注者枝番３.<p>
	 *
	 */
	public String po_co_itm_sub3() {
		return getConstString(offset + 53, $po_co_itm_sub3);
	}

	/**
	 *  発注者枝番３.<p>
	 *
	 */
	public void po_co_itm_sub3(String value) {
		setConstString(offset + 53, $po_co_itm_sub3, value);
	}


	/**
	 *  発注者諸口品ＦＬＧ.<p>
	 *
	 */
	public boolean po_co_sundry_itm_flg() {
		return getConstBoolean(offset + 54, $po_co_sundry_itm_flg);
	}

	/**
	 *  発注者諸口品ＦＬＧ.<p>
	 *
	 */
	public void po_co_sundry_itm_flg(boolean value) {
		setConstBoolean(offset + 54, $po_co_sundry_itm_flg, value);
	}


	/**
	 *  発注者品名.<p>
	 *
	 */
	public String po_co_itm_nm() {
		return getConstString(offset + 55, $po_co_itm_nm);
	}

	/**
	 *  発注者品名.<p>
	 *
	 */
	public void po_co_itm_nm(String value) {
		setConstString(offset + 55, $po_co_itm_nm, value);
	}


	/**
	 *  発注者インボイス表記品名.<p>
	 *
	 */
	public String po_co_iv_itm_nm() {
		return getConstString(offset + 56, $po_co_iv_itm_nm);
	}

	/**
	 *  発注者インボイス表記品名.<p>
	 *
	 */
	public void po_co_iv_itm_nm(String value) {
		setConstString(offset + 56, $po_co_iv_itm_nm, value);
	}


	/**
	 *  受注者品目ＣＤ.<p>
	 *
	 */
	public String slo_co_itm_cd() {
		return getConstString(offset + 57, $slo_co_itm_cd);
	}

	/**
	 *  受注者品目ＣＤ.<p>
	 *
	 */
	public void slo_co_itm_cd(String value) {
		setConstString(offset + 57, $slo_co_itm_cd, value);
	}


	/**
	 *  受注者枝番１.<p>
	 *
	 */
	public String slo_co_itm_sub1() {
		return getConstString(offset + 58, $slo_co_itm_sub1);
	}

	/**
	 *  受注者枝番１.<p>
	 *
	 */
	public void slo_co_itm_sub1(String value) {
		setConstString(offset + 58, $slo_co_itm_sub1, value);
	}


	/**
	 *  受注者枝番２.<p>
	 *
	 */
	public String slo_co_itm_sub2() {
		return getConstString(offset + 59, $slo_co_itm_sub2);
	}

	/**
	 *  受注者枝番２.<p>
	 *
	 */
	public void slo_co_itm_sub2(String value) {
		setConstString(offset + 59, $slo_co_itm_sub2, value);
	}


	/**
	 *  受注者枝番３.<p>
	 *
	 */
	public String slo_co_itm_sub3() {
		return getConstString(offset + 60, $slo_co_itm_sub3);
	}

	/**
	 *  受注者枝番３.<p>
	 *
	 */
	public void slo_co_itm_sub3(String value) {
		setConstString(offset + 60, $slo_co_itm_sub3, value);
	}


	/**
	 *  受注者品名.<p>
	 *
	 */
	public String slo_co_itm_nm() {
		return getConstString(offset + 61, $slo_co_itm_nm);
	}

	/**
	 *  受注者品名.<p>
	 *
	 */
	public void slo_co_itm_nm(String value) {
		setConstString(offset + 61, $slo_co_itm_nm, value);
	}


	/**
	 *  取引単位ＣＤ.<p>
	 *
	 */
	public String trd_unit_cd() {
		return getConstString(offset + 62, $trd_unit_cd);
	}

	/**
	 *  取引単位ＣＤ.<p>
	 *
	 */
	public void trd_unit_cd(String value) {
		setConstString(offset + 62, $trd_unit_cd, value);
	}


	/**
	 *  取引単位名.<p>
	 *
	 */
	public String trd_unit_nm() {
		return getConstString(offset + 63, $trd_unit_nm);
	}

	/**
	 *  取引単位名.<p>
	 *
	 */
	public void trd_unit_nm(String value) {
		setConstString(offset + 63, $trd_unit_nm, value);
	}


	/**
	 *  取引単位数量.<p>
	 *
	 */
	public MCNumber trd_unit_qty() {
		return getConstNumber(offset + 64, $trd_unit_qty);
	}

	/**
	 *  取引単位数量.<p>
	 *
	 */
	public void trd_unit_qty(MCNumber value) {
		setConstNumber(offset + 64, $trd_unit_qty, value);
	}

	/**
	 *  取引単位数量.<p>
	 *
	 */
	public void trd_unit_qty(int value) {
		setConstNumber(offset + 64, $trd_unit_qty, value);
	}

	/**
	 *  取引単位数量.<p>
	 *
	 */
	public void trd_unit_qty(long value) {
		setConstNumber(offset + 64, $trd_unit_qty, value);
	}

	/**
	 *  取引単位数量.<p>
	 *
	 */
	public void trd_unit_qty(float value) {
		setConstNumber(offset + 64, $trd_unit_qty, value);
	}

	/**
	 *  取引単位数量.<p>
	 *
	 */
	public void trd_unit_qty(double value) {
		setConstNumber(offset + 64, $trd_unit_qty, value);
	}


	/**
	 *  納入希望日.<p>
	 *
	 */
	public MCDate dlv_rqst_dt() {
		return getConstDate(offset + 65, $dlv_rqst_dt);
	}

	/**
	 *  納入希望日.<p>
	 *
	 */
	public void dlv_rqst_dt(MCDate value) {
		setConstDate(offset + 65, $dlv_rqst_dt, value);
	}


	/**
	 *  納入希望時刻.<p>
	 *
	 */
	public MCDate dlv_rqst_hm() {
		return getConstDate(offset + 66, $dlv_rqst_hm);
	}

	/**
	 *  納入希望時刻.<p>
	 *
	 */
	public void dlv_rqst_hm(MCDate value) {
		setConstDate(offset + 66, $dlv_rqst_hm, value);
	}


	/**
	 *  予備ＣＨＡＲ項目１.<p>
	 *
	 */
	public String sub_char1() {
		return getConstString(offset + 67, $sub_char1);
	}

	/**
	 *  予備ＣＨＡＲ項目１.<p>
	 *
	 */
	public void sub_char1(String value) {
		setConstString(offset + 67, $sub_char1, value);
	}


	/**
	 *  予備ＣＨＡＲ項目２.<p>
	 *
	 */
	public String sub_char2() {
		return getConstString(offset + 68, $sub_char2);
	}

	/**
	 *  予備ＣＨＡＲ項目２.<p>
	 *
	 */
	public void sub_char2(String value) {
		setConstString(offset + 68, $sub_char2, value);
	}


	/**
	 *  予備ＣＨＡＲ項目３.<p>
	 *
	 */
	public String sub_char3() {
		return getConstString(offset + 69, $sub_char3);
	}

	/**
	 *  予備ＣＨＡＲ項目３.<p>
	 *
	 */
	public void sub_char3(String value) {
		setConstString(offset + 69, $sub_char3, value);
	}


	/**
	 *  予備ＣＨＡＲ項目４.<p>
	 *
	 */
	public String sub_char4() {
		return getConstString(offset + 70, $sub_char4);
	}

	/**
	 *  予備ＣＨＡＲ項目４.<p>
	 *
	 */
	public void sub_char4(String value) {
		setConstString(offset + 70, $sub_char4, value);
	}


	/**
	 *  予備ＣＨＡＲ項目５.<p>
	 *
	 */
	public String sub_char5() {
		return getConstString(offset + 71, $sub_char5);
	}

	/**
	 *  予備ＣＨＡＲ項目５.<p>
	 *
	 */
	public void sub_char5(String value) {
		setConstString(offset + 71, $sub_char5, value);
	}


	/**
	 *  予備ＣＨＡＲ項目６.<p>
	 *
	 */
	public String sub_char6() {
		return getConstString(offset + 72, $sub_char6);
	}

	/**
	 *  予備ＣＨＡＲ項目６.<p>
	 *
	 */
	public void sub_char6(String value) {
		setConstString(offset + 72, $sub_char6, value);
	}


	/**
	 *  予備ＣＨＡＲ項目７.<p>
	 *
	 */
	public String sub_char7() {
		return getConstString(offset + 73, $sub_char7);
	}

	/**
	 *  予備ＣＨＡＲ項目７.<p>
	 *
	 */
	public void sub_char7(String value) {
		setConstString(offset + 73, $sub_char7, value);
	}


	/**
	 *  予備ＣＨＡＲ項目８.<p>
	 *
	 */
	public String sub_char8() {
		return getConstString(offset + 74, $sub_char8);
	}

	/**
	 *  予備ＣＨＡＲ項目８.<p>
	 *
	 */
	public void sub_char8(String value) {
		setConstString(offset + 74, $sub_char8, value);
	}


	/**
	 *  予備ＣＨＡＲ項目９.<p>
	 *
	 */
	public String sub_char9() {
		return getConstString(offset + 75, $sub_char9);
	}

	/**
	 *  予備ＣＨＡＲ項目９.<p>
	 *
	 */
	public void sub_char9(String value) {
		setConstString(offset + 75, $sub_char9, value);
	}


	/**
	 *  予備ＣＨＡＲ項目１０.<p>
	 *
	 */
	public String sub_char10() {
		return getConstString(offset + 76, $sub_char10);
	}

	/**
	 *  予備ＣＨＡＲ項目１０.<p>
	 *
	 */
	public void sub_char10(String value) {
		setConstString(offset + 76, $sub_char10, value);
	}


	/**
	 *  予備ＣＨＡＲ項目１１.<p>
	 *
	 */
	public String sub_char11() {
		return getConstString(offset + 77, $sub_char11);
	}

	/**
	 *  予備ＣＨＡＲ項目１１.<p>
	 *
	 */
	public void sub_char11(String value) {
		setConstString(offset + 77, $sub_char11, value);
	}


	/**
	 *  予備ＣＨＡＲ項目１２.<p>
	 *
	 */
	public String sub_char12() {
		return getConstString(offset + 78, $sub_char12);
	}

	/**
	 *  予備ＣＨＡＲ項目１２.<p>
	 *
	 */
	public void sub_char12(String value) {
		setConstString(offset + 78, $sub_char12, value);
	}


	/**
	 *  予備ＣＨＡＲ項目１３.<p>
	 *
	 */
	public String sub_char13() {
		return getConstString(offset + 79, $sub_char13);
	}

	/**
	 *  予備ＣＨＡＲ項目１３.<p>
	 *
	 */
	public void sub_char13(String value) {
		setConstString(offset + 79, $sub_char13, value);
	}


	/**
	 *  予備ＣＨＡＲ項目１４.<p>
	 *
	 */
	public String sub_char14() {
		return getConstString(offset + 80, $sub_char14);
	}

	/**
	 *  予備ＣＨＡＲ項目１４.<p>
	 *
	 */
	public void sub_char14(String value) {
		setConstString(offset + 80, $sub_char14, value);
	}


	/**
	 *  予備ＣＨＡＲ項目１５.<p>
	 *
	 */
	public String sub_char15() {
		return getConstString(offset + 81, $sub_char15);
	}

	/**
	 *  予備ＣＨＡＲ項目１５.<p>
	 *
	 */
	public void sub_char15(String value) {
		setConstString(offset + 81, $sub_char15, value);
	}


	/**
	 *  予備ＣＨＡＲ項目１６.<p>
	 *
	 */
	public String sub_char16() {
		return getConstString(offset + 82, $sub_char16);
	}

	/**
	 *  予備ＣＨＡＲ項目１６.<p>
	 *
	 */
	public void sub_char16(String value) {
		setConstString(offset + 82, $sub_char16, value);
	}


	/**
	 *  予備ＣＨＡＲ項目１７.<p>
	 *
	 */
	public String sub_char17() {
		return getConstString(offset + 83, $sub_char17);
	}

	/**
	 *  予備ＣＨＡＲ項目１７.<p>
	 *
	 */
	public void sub_char17(String value) {
		setConstString(offset + 83, $sub_char17, value);
	}


	/**
	 *  予備ＣＨＡＲ項目１８.<p>
	 *
	 */
	public String sub_char18() {
		return getConstString(offset + 84, $sub_char18);
	}

	/**
	 *  予備ＣＨＡＲ項目１８.<p>
	 *
	 */
	public void sub_char18(String value) {
		setConstString(offset + 84, $sub_char18, value);
	}


	/**
	 *  予備ＣＨＡＲ項目１９.<p>
	 *
	 */
	public String sub_char19() {
		return getConstString(offset + 85, $sub_char19);
	}

	/**
	 *  予備ＣＨＡＲ項目１９.<p>
	 *
	 */
	public void sub_char19(String value) {
		setConstString(offset + 85, $sub_char19, value);
	}


	/**
	 *  予備ＣＨＡＲ項目２０.<p>
	 *
	 */
	public String sub_char20() {
		return getConstString(offset + 86, $sub_char20);
	}

	/**
	 *  予備ＣＨＡＲ項目２０.<p>
	 *
	 */
	public void sub_char20(String value) {
		setConstString(offset + 86, $sub_char20, value);
	}


	/**
	 *  予備ＣＨＡＲ項目２１.<p>
	 *
	 */
	public String sub_char21() {
		return getConstString(offset + 87, $sub_char21);
	}

	/**
	 *  予備ＣＨＡＲ項目２１.<p>
	 *
	 */
	public void sub_char21(String value) {
		setConstString(offset + 87, $sub_char21, value);
	}


	/**
	 *  予備ＣＨＡＲ項目２２.<p>
	 *
	 */
	public String sub_char22() {
		return getConstString(offset + 88, $sub_char22);
	}

	/**
	 *  予備ＣＨＡＲ項目２２.<p>
	 *
	 */
	public void sub_char22(String value) {
		setConstString(offset + 88, $sub_char22, value);
	}


	/**
	 *  予備ＣＨＡＲ項目２３.<p>
	 *
	 */
	public String sub_char23() {
		return getConstString(offset + 89, $sub_char23);
	}

	/**
	 *  予備ＣＨＡＲ項目２３.<p>
	 *
	 */
	public void sub_char23(String value) {
		setConstString(offset + 89, $sub_char23, value);
	}


	/**
	 *  予備ＣＨＡＲ項目２４.<p>
	 *
	 */
	public String sub_char24() {
		return getConstString(offset + 90, $sub_char24);
	}

	/**
	 *  予備ＣＨＡＲ項目２４.<p>
	 *
	 */
	public void sub_char24(String value) {
		setConstString(offset + 90, $sub_char24, value);
	}


	/**
	 *  予備ＣＨＡＲ項目２５.<p>
	 *
	 */
	public String sub_char25() {
		return getConstString(offset + 91, $sub_char25);
	}

	/**
	 *  予備ＣＨＡＲ項目２５.<p>
	 *
	 */
	public void sub_char25(String value) {
		setConstString(offset + 91, $sub_char25, value);
	}


	/**
	 *  予備ＣＨＡＲ項目２６.<p>
	 *
	 */
	public String sub_char26() {
		return getConstString(offset + 92, $sub_char26);
	}

	/**
	 *  予備ＣＨＡＲ項目２６.<p>
	 *
	 */
	public void sub_char26(String value) {
		setConstString(offset + 92, $sub_char26, value);
	}


	/**
	 *  予備ＣＨＡＲ項目２７.<p>
	 *
	 */
	public String sub_char27() {
		return getConstString(offset + 93, $sub_char27);
	}

	/**
	 *  予備ＣＨＡＲ項目２７.<p>
	 *
	 */
	public void sub_char27(String value) {
		setConstString(offset + 93, $sub_char27, value);
	}


	/**
	 *  予備ＣＨＡＲ項目２８.<p>
	 *
	 */
	public String sub_char28() {
		return getConstString(offset + 94, $sub_char28);
	}

	/**
	 *  予備ＣＨＡＲ項目２８.<p>
	 *
	 */
	public void sub_char28(String value) {
		setConstString(offset + 94, $sub_char28, value);
	}


	/**
	 *  予備ＣＨＡＲ項目２９.<p>
	 *
	 */
	public String sub_char29() {
		return getConstString(offset + 95, $sub_char29);
	}

	/**
	 *  予備ＣＨＡＲ項目２９.<p>
	 *
	 */
	public void sub_char29(String value) {
		setConstString(offset + 95, $sub_char29, value);
	}


	/**
	 *  予備ＣＨＡＲ項目３０.<p>
	 *
	 */
	public String sub_char30() {
		return getConstString(offset + 96, $sub_char30);
	}

	/**
	 *  予備ＣＨＡＲ項目３０.<p>
	 *
	 */
	public void sub_char30(String value) {
		setConstString(offset + 96, $sub_char30, value);
	}


	/**
	 *  予備ＮＵＭ項目１.<p>
	 *
	 */
	public MCNumber sub_num1() {
		return getConstNumber(offset + 97, $sub_num1);
	}

	/**
	 *  予備ＮＵＭ項目１.<p>
	 *
	 */
	public void sub_num1(MCNumber value) {
		setConstNumber(offset + 97, $sub_num1, value);
	}

	/**
	 *  予備ＮＵＭ項目１.<p>
	 *
	 */
	public void sub_num1(int value) {
		setConstNumber(offset + 97, $sub_num1, value);
	}

	/**
	 *  予備ＮＵＭ項目１.<p>
	 *
	 */
	public void sub_num1(long value) {
		setConstNumber(offset + 97, $sub_num1, value);
	}

	/**
	 *  予備ＮＵＭ項目１.<p>
	 *
	 */
	public void sub_num1(float value) {
		setConstNumber(offset + 97, $sub_num1, value);
	}

	/**
	 *  予備ＮＵＭ項目１.<p>
	 *
	 */
	public void sub_num1(double value) {
		setConstNumber(offset + 97, $sub_num1, value);
	}


	/**
	 *  予備ＮＵＭ項目２.<p>
	 *
	 */
	public MCNumber sub_num2() {
		return getConstNumber(offset + 98, $sub_num2);
	}

	/**
	 *  予備ＮＵＭ項目２.<p>
	 *
	 */
	public void sub_num2(MCNumber value) {
		setConstNumber(offset + 98, $sub_num2, value);
	}

	/**
	 *  予備ＮＵＭ項目２.<p>
	 *
	 */
	public void sub_num2(int value) {
		setConstNumber(offset + 98, $sub_num2, value);
	}

	/**
	 *  予備ＮＵＭ項目２.<p>
	 *
	 */
	public void sub_num2(long value) {
		setConstNumber(offset + 98, $sub_num2, value);
	}

	/**
	 *  予備ＮＵＭ項目２.<p>
	 *
	 */
	public void sub_num2(float value) {
		setConstNumber(offset + 98, $sub_num2, value);
	}

	/**
	 *  予備ＮＵＭ項目２.<p>
	 *
	 */
	public void sub_num2(double value) {
		setConstNumber(offset + 98, $sub_num2, value);
	}


	/**
	 *  予備ＮＵＭ項目３.<p>
	 *
	 */
	public MCNumber sub_num3() {
		return getConstNumber(offset + 99, $sub_num3);
	}

	/**
	 *  予備ＮＵＭ項目３.<p>
	 *
	 */
	public void sub_num3(MCNumber value) {
		setConstNumber(offset + 99, $sub_num3, value);
	}

	/**
	 *  予備ＮＵＭ項目３.<p>
	 *
	 */
	public void sub_num3(int value) {
		setConstNumber(offset + 99, $sub_num3, value);
	}

	/**
	 *  予備ＮＵＭ項目３.<p>
	 *
	 */
	public void sub_num3(long value) {
		setConstNumber(offset + 99, $sub_num3, value);
	}

	/**
	 *  予備ＮＵＭ項目３.<p>
	 *
	 */
	public void sub_num3(float value) {
		setConstNumber(offset + 99, $sub_num3, value);
	}

	/**
	 *  予備ＮＵＭ項目３.<p>
	 *
	 */
	public void sub_num3(double value) {
		setConstNumber(offset + 99, $sub_num3, value);
	}


	/**
	 *  予備ＮＵＭ項目４.<p>
	 *
	 */
	public MCNumber sub_num4() {
		return getConstNumber(offset + 100, $sub_num4);
	}

	/**
	 *  予備ＮＵＭ項目４.<p>
	 *
	 */
	public void sub_num4(MCNumber value) {
		setConstNumber(offset + 100, $sub_num4, value);
	}

	/**
	 *  予備ＮＵＭ項目４.<p>
	 *
	 */
	public void sub_num4(int value) {
		setConstNumber(offset + 100, $sub_num4, value);
	}

	/**
	 *  予備ＮＵＭ項目４.<p>
	 *
	 */
	public void sub_num4(long value) {
		setConstNumber(offset + 100, $sub_num4, value);
	}

	/**
	 *  予備ＮＵＭ項目４.<p>
	 *
	 */
	public void sub_num4(float value) {
		setConstNumber(offset + 100, $sub_num4, value);
	}

	/**
	 *  予備ＮＵＭ項目４.<p>
	 *
	 */
	public void sub_num4(double value) {
		setConstNumber(offset + 100, $sub_num4, value);
	}


	/**
	 *  予備ＮＵＭ項目５.<p>
	 *
	 */
	public MCNumber sub_num5() {
		return getConstNumber(offset + 101, $sub_num5);
	}

	/**
	 *  予備ＮＵＭ項目５.<p>
	 *
	 */
	public void sub_num5(MCNumber value) {
		setConstNumber(offset + 101, $sub_num5, value);
	}

	/**
	 *  予備ＮＵＭ項目５.<p>
	 *
	 */
	public void sub_num5(int value) {
		setConstNumber(offset + 101, $sub_num5, value);
	}

	/**
	 *  予備ＮＵＭ項目５.<p>
	 *
	 */
	public void sub_num5(long value) {
		setConstNumber(offset + 101, $sub_num5, value);
	}

	/**
	 *  予備ＮＵＭ項目５.<p>
	 *
	 */
	public void sub_num5(float value) {
		setConstNumber(offset + 101, $sub_num5, value);
	}

	/**
	 *  予備ＮＵＭ項目５.<p>
	 *
	 */
	public void sub_num5(double value) {
		setConstNumber(offset + 101, $sub_num5, value);
	}


	/**
	 *  予備ＤＡＴＥ項目１.<p>
	 *
	 */
	public MCDate sub_dt1() {
		return getConstDate(offset + 102, $sub_dt1);
	}

	/**
	 *  予備ＤＡＴＥ項目１.<p>
	 *
	 */
	public void sub_dt1(MCDate value) {
		setConstDate(offset + 102, $sub_dt1, value);
	}


	/**
	 *  予備ＤＡＴＥ項目２.<p>
	 *
	 */
	public MCDate sub_dt2() {
		return getConstDate(offset + 103, $sub_dt2);
	}

	/**
	 *  予備ＤＡＴＥ項目２.<p>
	 *
	 */
	public void sub_dt2(MCDate value) {
		setConstDate(offset + 103, $sub_dt2, value);
	}


	/**
	 *  予備ＤＡＴＥ項目３.<p>
	 *
	 */
	public MCDate sub_dt3() {
		return getConstDate(offset + 104, $sub_dt3);
	}

	/**
	 *  予備ＤＡＴＥ項目３.<p>
	 *
	 */
	public void sub_dt3(MCDate value) {
		setConstDate(offset + 104, $sub_dt3, value);
	}


	/**
	 *  予備ＤＡＴＥ項目４.<p>
	 *
	 */
	public MCDate sub_dt4() {
		return getConstDate(offset + 105, $sub_dt4);
	}

	/**
	 *  予備ＤＡＴＥ項目４.<p>
	 *
	 */
	public void sub_dt4(MCDate value) {
		setConstDate(offset + 105, $sub_dt4, value);
	}


	/**
	 *  予備ＤＡＴＥ項目５.<p>
	 *
	 */
	public MCDate sub_dt5() {
		return getConstDate(offset + 106, $sub_dt5);
	}

	/**
	 *  予備ＤＡＴＥ項目５.<p>
	 *
	 */
	public void sub_dt5(MCDate value) {
		setConstDate(offset + 106, $sub_dt5, value);
	}


	public String getString(String name) {
		if ($trd_typ_cd.equalsIgnoreCase(name)) {
			return trd_typ_cd();
		}
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			return data_crud_typ();
		}
		if ($dlv_inst_no.equalsIgnoreCase(name)) {
			return dlv_inst_no();
		}
		if ($dlv_inst_d_no.equalsIgnoreCase(name)) {
			return dlv_inst_d_no();
		}
		if ($dlv_inst_grp_no.equalsIgnoreCase(name)) {
			return dlv_inst_grp_no();
		}
		if ($po_no.equalsIgnoreCase(name)) {
			return po_no();
		}
		if ($po_d_no.equalsIgnoreCase(name)) {
			return po_d_no();
		}
		if ($po_co_cd.equalsIgnoreCase(name)) {
			return po_co_cd();
		}
		if ($po_co_nm.equalsIgnoreCase(name)) {
			return po_co_nm();
		}
		if ($po_co_cntry_cd.equalsIgnoreCase(name)) {
			return po_co_cntry_cd();
		}
		if ($slo_co_cd.equalsIgnoreCase(name)) {
			return slo_co_cd();
		}
		if ($slo_co_nm.equalsIgnoreCase(name)) {
			return slo_co_nm();
		}
		if ($slo_co_cntry_cd.equalsIgnoreCase(name)) {
			return slo_co_cntry_cd();
		}
		if ($dlv_inst_print_rmrks.equalsIgnoreCase(name)) {
			return dlv_inst_print_rmrks();
		}
		if ($dlv_inst_print_d_rmrks.equalsIgnoreCase(name)) {
			return dlv_inst_print_d_rmrks();
		}
		if ($in_to_id_typ.equalsIgnoreCase(name)) {
			return in_to_id_typ();
		}
		if ($in_to_id_cd.equalsIgnoreCase(name)) {
			return in_to_id_cd();
		}
		if ($in_to_nm.equalsIgnoreCase(name)) {
			return in_to_nm();
		}
		if ($in_to_zip_cd.equalsIgnoreCase(name)) {
			return in_to_zip_cd();
		}
		if ($in_to_addr1.equalsIgnoreCase(name)) {
			return in_to_addr1();
		}
		if ($in_to_addr2.equalsIgnoreCase(name)) {
			return in_to_addr2();
		}
		if ($in_to_addr3.equalsIgnoreCase(name)) {
			return in_to_addr3();
		}
		if ($in_to_addr4.equalsIgnoreCase(name)) {
			return in_to_addr4();
		}
		if ($in_to_cntct_dpt.equalsIgnoreCase(name)) {
			return in_to_cntct_dpt();
		}
		if ($in_to_cntct_psn.equalsIgnoreCase(name)) {
			return in_to_cntct_psn();
		}
		if ($in_to_tel.equalsIgnoreCase(name)) {
			return in_to_tel();
		}
		if ($in_to_fax.equalsIgnoreCase(name)) {
			return in_to_fax();
		}
		if ($in_to_cntry_cd.equalsIgnoreCase(name)) {
			return in_to_cntry_cd();
		}
		if ($tdlv_cd.equalsIgnoreCase(name)) {
			return tdlv_cd();
		}
		if ($tdlv_nm.equalsIgnoreCase(name)) {
			return tdlv_nm();
		}
		if ($tdlv_zip_cd.equalsIgnoreCase(name)) {
			return tdlv_zip_cd();
		}
		if ($tdlv_addr1.equalsIgnoreCase(name)) {
			return tdlv_addr1();
		}
		if ($tdlv_addr2.equalsIgnoreCase(name)) {
			return tdlv_addr2();
		}
		if ($tdlv_addr3.equalsIgnoreCase(name)) {
			return tdlv_addr3();
		}
		if ($tdlv_addr4.equalsIgnoreCase(name)) {
			return tdlv_addr4();
		}
		if ($tdlv_cntct_dpt.equalsIgnoreCase(name)) {
			return tdlv_cntct_dpt();
		}
		if ($tdlv_cntct_psn.equalsIgnoreCase(name)) {
			return tdlv_cntct_psn();
		}
		if ($tdlv_tel.equalsIgnoreCase(name)) {
			return tdlv_tel();
		}
		if ($tdlv_fax.equalsIgnoreCase(name)) {
			return tdlv_fax();
		}
		if ($tdlv_cntry_cd.equalsIgnoreCase(name)) {
			return tdlv_cntry_cd();
		}
		if ($dlv_day_week_typ.equalsIgnoreCase(name)) {
			return dlv_day_week_typ();
		}
		if ($pri_prnt_typ.equalsIgnoreCase(name)) {
			return pri_prnt_typ();
		}
		if ($po_co_itm_cd.equalsIgnoreCase(name)) {
			return po_co_itm_cd();
		}
		if ($po_co_itm_sub1.equalsIgnoreCase(name)) {
			return po_co_itm_sub1();
		}
		if ($po_co_itm_sub2.equalsIgnoreCase(name)) {
			return po_co_itm_sub2();
		}
		if ($po_co_itm_sub3.equalsIgnoreCase(name)) {
			return po_co_itm_sub3();
		}
		if ($po_co_itm_nm.equalsIgnoreCase(name)) {
			return po_co_itm_nm();
		}
		if ($po_co_iv_itm_nm.equalsIgnoreCase(name)) {
			return po_co_iv_itm_nm();
		}
		if ($slo_co_itm_cd.equalsIgnoreCase(name)) {
			return slo_co_itm_cd();
		}
		if ($slo_co_itm_sub1.equalsIgnoreCase(name)) {
			return slo_co_itm_sub1();
		}
		if ($slo_co_itm_sub2.equalsIgnoreCase(name)) {
			return slo_co_itm_sub2();
		}
		if ($slo_co_itm_sub3.equalsIgnoreCase(name)) {
			return slo_co_itm_sub3();
		}
		if ($slo_co_itm_nm.equalsIgnoreCase(name)) {
			return slo_co_itm_nm();
		}
		if ($trd_unit_cd.equalsIgnoreCase(name)) {
			return trd_unit_cd();
		}
		if ($trd_unit_nm.equalsIgnoreCase(name)) {
			return trd_unit_nm();
		}
		if ($sub_char1.equalsIgnoreCase(name)) {
			return sub_char1();
		}
		if ($sub_char2.equalsIgnoreCase(name)) {
			return sub_char2();
		}
		if ($sub_char3.equalsIgnoreCase(name)) {
			return sub_char3();
		}
		if ($sub_char4.equalsIgnoreCase(name)) {
			return sub_char4();
		}
		if ($sub_char5.equalsIgnoreCase(name)) {
			return sub_char5();
		}
		if ($sub_char6.equalsIgnoreCase(name)) {
			return sub_char6();
		}
		if ($sub_char7.equalsIgnoreCase(name)) {
			return sub_char7();
		}
		if ($sub_char8.equalsIgnoreCase(name)) {
			return sub_char8();
		}
		if ($sub_char9.equalsIgnoreCase(name)) {
			return sub_char9();
		}
		if ($sub_char10.equalsIgnoreCase(name)) {
			return sub_char10();
		}
		if ($sub_char11.equalsIgnoreCase(name)) {
			return sub_char11();
		}
		if ($sub_char12.equalsIgnoreCase(name)) {
			return sub_char12();
		}
		if ($sub_char13.equalsIgnoreCase(name)) {
			return sub_char13();
		}
		if ($sub_char14.equalsIgnoreCase(name)) {
			return sub_char14();
		}
		if ($sub_char15.equalsIgnoreCase(name)) {
			return sub_char15();
		}
		if ($sub_char16.equalsIgnoreCase(name)) {
			return sub_char16();
		}
		if ($sub_char17.equalsIgnoreCase(name)) {
			return sub_char17();
		}
		if ($sub_char18.equalsIgnoreCase(name)) {
			return sub_char18();
		}
		if ($sub_char19.equalsIgnoreCase(name)) {
			return sub_char19();
		}
		if ($sub_char20.equalsIgnoreCase(name)) {
			return sub_char20();
		}
		if ($sub_char21.equalsIgnoreCase(name)) {
			return sub_char21();
		}
		if ($sub_char22.equalsIgnoreCase(name)) {
			return sub_char22();
		}
		if ($sub_char23.equalsIgnoreCase(name)) {
			return sub_char23();
		}
		if ($sub_char24.equalsIgnoreCase(name)) {
			return sub_char24();
		}
		if ($sub_char25.equalsIgnoreCase(name)) {
			return sub_char25();
		}
		if ($sub_char26.equalsIgnoreCase(name)) {
			return sub_char26();
		}
		if ($sub_char27.equalsIgnoreCase(name)) {
			return sub_char27();
		}
		if ($sub_char28.equalsIgnoreCase(name)) {
			return sub_char28();
		}
		if ($sub_char29.equalsIgnoreCase(name)) {
			return sub_char29();
		}
		if ($sub_char30.equalsIgnoreCase(name)) {
			return sub_char30();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($data_lno.equalsIgnoreCase(name)) {
			return data_lno();
		}
		if ($data_no.equalsIgnoreCase(name)) {
			return data_no();
		}
		if ($dlv_inst_rev.equalsIgnoreCase(name)) {
			return dlv_inst_rev();
		}
		if ($po_rev.equalsIgnoreCase(name)) {
			return po_rev();
		}
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			return trd_unit_qty();
		}
		if ($sub_num1.equalsIgnoreCase(name)) {
			return sub_num1();
		}
		if ($sub_num2.equalsIgnoreCase(name)) {
			return sub_num2();
		}
		if ($sub_num3.equalsIgnoreCase(name)) {
			return sub_num3();
		}
		if ($sub_num4.equalsIgnoreCase(name)) {
			return sub_num4();
		}
		if ($sub_num5.equalsIgnoreCase(name)) {
			return sub_num5();
		}
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		if ($data_make_dt.equalsIgnoreCase(name)) {
			return data_make_dt();
		}
		if ($dlv_inst_dt.equalsIgnoreCase(name)) {
			return dlv_inst_dt();
		}
		if ($dlv_rqst_dt.equalsIgnoreCase(name)) {
			return dlv_rqst_dt();
		}
		if ($dlv_rqst_hm.equalsIgnoreCase(name)) {
			return dlv_rqst_hm();
		}
		if ($sub_dt1.equalsIgnoreCase(name)) {
			return sub_dt1();
		}
		if ($sub_dt2.equalsIgnoreCase(name)) {
			return sub_dt2();
		}
		if ($sub_dt3.equalsIgnoreCase(name)) {
			return sub_dt3();
		}
		if ($sub_dt4.equalsIgnoreCase(name)) {
			return sub_dt4();
		}
		if ($sub_dt5.equalsIgnoreCase(name)) {
			return sub_dt5();
		}
		return super.getDate(name);
	}
	public boolean getBoolean(String name) {
		if ($in_to_sundry_flg.equalsIgnoreCase(name)) {
			return in_to_sundry_flg();
		}
		if ($tdlv_sundry_flg.equalsIgnoreCase(name)) {
			return tdlv_sundry_flg();
		}
		if ($po_co_sundry_itm_flg.equalsIgnoreCase(name)) {
			return po_co_sundry_itm_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($trd_typ_cd.equalsIgnoreCase(name)) {
			return trd_typ_cd();
		}
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			return data_crud_typ();
		}
		if ($dlv_inst_no.equalsIgnoreCase(name)) {
			return dlv_inst_no();
		}
		if ($dlv_inst_d_no.equalsIgnoreCase(name)) {
			return dlv_inst_d_no();
		}
		if ($dlv_inst_grp_no.equalsIgnoreCase(name)) {
			return dlv_inst_grp_no();
		}
		if ($po_no.equalsIgnoreCase(name)) {
			return po_no();
		}
		if ($po_d_no.equalsIgnoreCase(name)) {
			return po_d_no();
		}
		if ($po_co_cd.equalsIgnoreCase(name)) {
			return po_co_cd();
		}
		if ($po_co_nm.equalsIgnoreCase(name)) {
			return po_co_nm();
		}
		if ($po_co_cntry_cd.equalsIgnoreCase(name)) {
			return po_co_cntry_cd();
		}
		if ($slo_co_cd.equalsIgnoreCase(name)) {
			return slo_co_cd();
		}
		if ($slo_co_nm.equalsIgnoreCase(name)) {
			return slo_co_nm();
		}
		if ($slo_co_cntry_cd.equalsIgnoreCase(name)) {
			return slo_co_cntry_cd();
		}
		if ($dlv_inst_print_rmrks.equalsIgnoreCase(name)) {
			return dlv_inst_print_rmrks();
		}
		if ($dlv_inst_print_d_rmrks.equalsIgnoreCase(name)) {
			return dlv_inst_print_d_rmrks();
		}
		if ($in_to_id_typ.equalsIgnoreCase(name)) {
			return in_to_id_typ();
		}
		if ($in_to_id_cd.equalsIgnoreCase(name)) {
			return in_to_id_cd();
		}
		if ($in_to_nm.equalsIgnoreCase(name)) {
			return in_to_nm();
		}
		if ($in_to_zip_cd.equalsIgnoreCase(name)) {
			return in_to_zip_cd();
		}
		if ($in_to_addr1.equalsIgnoreCase(name)) {
			return in_to_addr1();
		}
		if ($in_to_addr2.equalsIgnoreCase(name)) {
			return in_to_addr2();
		}
		if ($in_to_addr3.equalsIgnoreCase(name)) {
			return in_to_addr3();
		}
		if ($in_to_addr4.equalsIgnoreCase(name)) {
			return in_to_addr4();
		}
		if ($in_to_cntct_dpt.equalsIgnoreCase(name)) {
			return in_to_cntct_dpt();
		}
		if ($in_to_cntct_psn.equalsIgnoreCase(name)) {
			return in_to_cntct_psn();
		}
		if ($in_to_tel.equalsIgnoreCase(name)) {
			return in_to_tel();
		}
		if ($in_to_fax.equalsIgnoreCase(name)) {
			return in_to_fax();
		}
		if ($in_to_cntry_cd.equalsIgnoreCase(name)) {
			return in_to_cntry_cd();
		}
		if ($tdlv_cd.equalsIgnoreCase(name)) {
			return tdlv_cd();
		}
		if ($tdlv_nm.equalsIgnoreCase(name)) {
			return tdlv_nm();
		}
		if ($tdlv_zip_cd.equalsIgnoreCase(name)) {
			return tdlv_zip_cd();
		}
		if ($tdlv_addr1.equalsIgnoreCase(name)) {
			return tdlv_addr1();
		}
		if ($tdlv_addr2.equalsIgnoreCase(name)) {
			return tdlv_addr2();
		}
		if ($tdlv_addr3.equalsIgnoreCase(name)) {
			return tdlv_addr3();
		}
		if ($tdlv_addr4.equalsIgnoreCase(name)) {
			return tdlv_addr4();
		}
		if ($tdlv_cntct_dpt.equalsIgnoreCase(name)) {
			return tdlv_cntct_dpt();
		}
		if ($tdlv_cntct_psn.equalsIgnoreCase(name)) {
			return tdlv_cntct_psn();
		}
		if ($tdlv_tel.equalsIgnoreCase(name)) {
			return tdlv_tel();
		}
		if ($tdlv_fax.equalsIgnoreCase(name)) {
			return tdlv_fax();
		}
		if ($tdlv_cntry_cd.equalsIgnoreCase(name)) {
			return tdlv_cntry_cd();
		}
		if ($dlv_day_week_typ.equalsIgnoreCase(name)) {
			return dlv_day_week_typ();
		}
		if ($pri_prnt_typ.equalsIgnoreCase(name)) {
			return pri_prnt_typ();
		}
		if ($po_co_itm_cd.equalsIgnoreCase(name)) {
			return po_co_itm_cd();
		}
		if ($po_co_itm_sub1.equalsIgnoreCase(name)) {
			return po_co_itm_sub1();
		}
		if ($po_co_itm_sub2.equalsIgnoreCase(name)) {
			return po_co_itm_sub2();
		}
		if ($po_co_itm_sub3.equalsIgnoreCase(name)) {
			return po_co_itm_sub3();
		}
		if ($po_co_itm_nm.equalsIgnoreCase(name)) {
			return po_co_itm_nm();
		}
		if ($po_co_iv_itm_nm.equalsIgnoreCase(name)) {
			return po_co_iv_itm_nm();
		}
		if ($slo_co_itm_cd.equalsIgnoreCase(name)) {
			return slo_co_itm_cd();
		}
		if ($slo_co_itm_sub1.equalsIgnoreCase(name)) {
			return slo_co_itm_sub1();
		}
		if ($slo_co_itm_sub2.equalsIgnoreCase(name)) {
			return slo_co_itm_sub2();
		}
		if ($slo_co_itm_sub3.equalsIgnoreCase(name)) {
			return slo_co_itm_sub3();
		}
		if ($slo_co_itm_nm.equalsIgnoreCase(name)) {
			return slo_co_itm_nm();
		}
		if ($trd_unit_cd.equalsIgnoreCase(name)) {
			return trd_unit_cd();
		}
		if ($trd_unit_nm.equalsIgnoreCase(name)) {
			return trd_unit_nm();
		}
		if ($sub_char1.equalsIgnoreCase(name)) {
			return sub_char1();
		}
		if ($sub_char2.equalsIgnoreCase(name)) {
			return sub_char2();
		}
		if ($sub_char3.equalsIgnoreCase(name)) {
			return sub_char3();
		}
		if ($sub_char4.equalsIgnoreCase(name)) {
			return sub_char4();
		}
		if ($sub_char5.equalsIgnoreCase(name)) {
			return sub_char5();
		}
		if ($sub_char6.equalsIgnoreCase(name)) {
			return sub_char6();
		}
		if ($sub_char7.equalsIgnoreCase(name)) {
			return sub_char7();
		}
		if ($sub_char8.equalsIgnoreCase(name)) {
			return sub_char8();
		}
		if ($sub_char9.equalsIgnoreCase(name)) {
			return sub_char9();
		}
		if ($sub_char10.equalsIgnoreCase(name)) {
			return sub_char10();
		}
		if ($sub_char11.equalsIgnoreCase(name)) {
			return sub_char11();
		}
		if ($sub_char12.equalsIgnoreCase(name)) {
			return sub_char12();
		}
		if ($sub_char13.equalsIgnoreCase(name)) {
			return sub_char13();
		}
		if ($sub_char14.equalsIgnoreCase(name)) {
			return sub_char14();
		}
		if ($sub_char15.equalsIgnoreCase(name)) {
			return sub_char15();
		}
		if ($sub_char16.equalsIgnoreCase(name)) {
			return sub_char16();
		}
		if ($sub_char17.equalsIgnoreCase(name)) {
			return sub_char17();
		}
		if ($sub_char18.equalsIgnoreCase(name)) {
			return sub_char18();
		}
		if ($sub_char19.equalsIgnoreCase(name)) {
			return sub_char19();
		}
		if ($sub_char20.equalsIgnoreCase(name)) {
			return sub_char20();
		}
		if ($sub_char21.equalsIgnoreCase(name)) {
			return sub_char21();
		}
		if ($sub_char22.equalsIgnoreCase(name)) {
			return sub_char22();
		}
		if ($sub_char23.equalsIgnoreCase(name)) {
			return sub_char23();
		}
		if ($sub_char24.equalsIgnoreCase(name)) {
			return sub_char24();
		}
		if ($sub_char25.equalsIgnoreCase(name)) {
			return sub_char25();
		}
		if ($sub_char26.equalsIgnoreCase(name)) {
			return sub_char26();
		}
		if ($sub_char27.equalsIgnoreCase(name)) {
			return sub_char27();
		}
		if ($sub_char28.equalsIgnoreCase(name)) {
			return sub_char28();
		}
		if ($sub_char29.equalsIgnoreCase(name)) {
			return sub_char29();
		}
		if ($sub_char30.equalsIgnoreCase(name)) {
			return sub_char30();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($data_lno.equalsIgnoreCase(name)) {
			return data_lno();
		}
		if ($data_no.equalsIgnoreCase(name)) {
			return data_no();
		}
		if ($dlv_inst_rev.equalsIgnoreCase(name)) {
			return dlv_inst_rev();
		}
		if ($po_rev.equalsIgnoreCase(name)) {
			return po_rev();
		}
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			return trd_unit_qty();
		}
		if ($sub_num1.equalsIgnoreCase(name)) {
			return sub_num1();
		}
		if ($sub_num2.equalsIgnoreCase(name)) {
			return sub_num2();
		}
		if ($sub_num3.equalsIgnoreCase(name)) {
			return sub_num3();
		}
		if ($sub_num4.equalsIgnoreCase(name)) {
			return sub_num4();
		}
		if ($sub_num5.equalsIgnoreCase(name)) {
			return sub_num5();
		}
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($data_make_dt.equalsIgnoreCase(name)) {
			return data_make_dt();
		}
		if ($dlv_inst_dt.equalsIgnoreCase(name)) {
			return dlv_inst_dt();
		}
		if ($dlv_rqst_dt.equalsIgnoreCase(name)) {
			return dlv_rqst_dt();
		}
		if ($dlv_rqst_hm.equalsIgnoreCase(name)) {
			return dlv_rqst_hm();
		}
		if ($sub_dt1.equalsIgnoreCase(name)) {
			return sub_dt1();
		}
		if ($sub_dt2.equalsIgnoreCase(name)) {
			return sub_dt2();
		}
		if ($sub_dt3.equalsIgnoreCase(name)) {
			return sub_dt3();
		}
		if ($sub_dt4.equalsIgnoreCase(name)) {
			return sub_dt4();
		}
		if ($sub_dt5.equalsIgnoreCase(name)) {
			return sub_dt5();
		}
		return super.getDateNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($in_to_sundry_flg.equalsIgnoreCase(name)) {
			return in_to_sundry_flg();
		}
		if ($tdlv_sundry_flg.equalsIgnoreCase(name)) {
			return tdlv_sundry_flg();
		}
		if ($po_co_sundry_itm_flg.equalsIgnoreCase(name)) {
			return po_co_sundry_itm_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($trd_typ_cd.equalsIgnoreCase(name)) {
			trd_typ_cd(value);
			return;
		}
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			data_crud_typ(value);
			return;
		}
		if ($dlv_inst_no.equalsIgnoreCase(name)) {
			dlv_inst_no(value);
			return;
		}
		if ($dlv_inst_d_no.equalsIgnoreCase(name)) {
			dlv_inst_d_no(value);
			return;
		}
		if ($dlv_inst_grp_no.equalsIgnoreCase(name)) {
			dlv_inst_grp_no(value);
			return;
		}
		if ($po_no.equalsIgnoreCase(name)) {
			po_no(value);
			return;
		}
		if ($po_d_no.equalsIgnoreCase(name)) {
			po_d_no(value);
			return;
		}
		if ($po_co_cd.equalsIgnoreCase(name)) {
			po_co_cd(value);
			return;
		}
		if ($po_co_nm.equalsIgnoreCase(name)) {
			po_co_nm(value);
			return;
		}
		if ($po_co_cntry_cd.equalsIgnoreCase(name)) {
			po_co_cntry_cd(value);
			return;
		}
		if ($slo_co_cd.equalsIgnoreCase(name)) {
			slo_co_cd(value);
			return;
		}
		if ($slo_co_nm.equalsIgnoreCase(name)) {
			slo_co_nm(value);
			return;
		}
		if ($slo_co_cntry_cd.equalsIgnoreCase(name)) {
			slo_co_cntry_cd(value);
			return;
		}
		if ($dlv_inst_print_rmrks.equalsIgnoreCase(name)) {
			dlv_inst_print_rmrks(value);
			return;
		}
		if ($dlv_inst_print_d_rmrks.equalsIgnoreCase(name)) {
			dlv_inst_print_d_rmrks(value);
			return;
		}
		if ($in_to_id_typ.equalsIgnoreCase(name)) {
			in_to_id_typ(value);
			return;
		}
		if ($in_to_id_cd.equalsIgnoreCase(name)) {
			in_to_id_cd(value);
			return;
		}
		if ($in_to_nm.equalsIgnoreCase(name)) {
			in_to_nm(value);
			return;
		}
		if ($in_to_zip_cd.equalsIgnoreCase(name)) {
			in_to_zip_cd(value);
			return;
		}
		if ($in_to_addr1.equalsIgnoreCase(name)) {
			in_to_addr1(value);
			return;
		}
		if ($in_to_addr2.equalsIgnoreCase(name)) {
			in_to_addr2(value);
			return;
		}
		if ($in_to_addr3.equalsIgnoreCase(name)) {
			in_to_addr3(value);
			return;
		}
		if ($in_to_addr4.equalsIgnoreCase(name)) {
			in_to_addr4(value);
			return;
		}
		if ($in_to_cntct_dpt.equalsIgnoreCase(name)) {
			in_to_cntct_dpt(value);
			return;
		}
		if ($in_to_cntct_psn.equalsIgnoreCase(name)) {
			in_to_cntct_psn(value);
			return;
		}
		if ($in_to_tel.equalsIgnoreCase(name)) {
			in_to_tel(value);
			return;
		}
		if ($in_to_fax.equalsIgnoreCase(name)) {
			in_to_fax(value);
			return;
		}
		if ($in_to_cntry_cd.equalsIgnoreCase(name)) {
			in_to_cntry_cd(value);
			return;
		}
		if ($tdlv_cd.equalsIgnoreCase(name)) {
			tdlv_cd(value);
			return;
		}
		if ($tdlv_nm.equalsIgnoreCase(name)) {
			tdlv_nm(value);
			return;
		}
		if ($tdlv_zip_cd.equalsIgnoreCase(name)) {
			tdlv_zip_cd(value);
			return;
		}
		if ($tdlv_addr1.equalsIgnoreCase(name)) {
			tdlv_addr1(value);
			return;
		}
		if ($tdlv_addr2.equalsIgnoreCase(name)) {
			tdlv_addr2(value);
			return;
		}
		if ($tdlv_addr3.equalsIgnoreCase(name)) {
			tdlv_addr3(value);
			return;
		}
		if ($tdlv_addr4.equalsIgnoreCase(name)) {
			tdlv_addr4(value);
			return;
		}
		if ($tdlv_cntct_dpt.equalsIgnoreCase(name)) {
			tdlv_cntct_dpt(value);
			return;
		}
		if ($tdlv_cntct_psn.equalsIgnoreCase(name)) {
			tdlv_cntct_psn(value);
			return;
		}
		if ($tdlv_tel.equalsIgnoreCase(name)) {
			tdlv_tel(value);
			return;
		}
		if ($tdlv_fax.equalsIgnoreCase(name)) {
			tdlv_fax(value);
			return;
		}
		if ($tdlv_cntry_cd.equalsIgnoreCase(name)) {
			tdlv_cntry_cd(value);
			return;
		}
		if ($dlv_day_week_typ.equalsIgnoreCase(name)) {
			dlv_day_week_typ(value);
			return;
		}
		if ($pri_prnt_typ.equalsIgnoreCase(name)) {
			pri_prnt_typ(value);
			return;
		}
		if ($po_co_itm_cd.equalsIgnoreCase(name)) {
			po_co_itm_cd(value);
			return;
		}
		if ($po_co_itm_sub1.equalsIgnoreCase(name)) {
			po_co_itm_sub1(value);
			return;
		}
		if ($po_co_itm_sub2.equalsIgnoreCase(name)) {
			po_co_itm_sub2(value);
			return;
		}
		if ($po_co_itm_sub3.equalsIgnoreCase(name)) {
			po_co_itm_sub3(value);
			return;
		}
		if ($po_co_itm_nm.equalsIgnoreCase(name)) {
			po_co_itm_nm(value);
			return;
		}
		if ($po_co_iv_itm_nm.equalsIgnoreCase(name)) {
			po_co_iv_itm_nm(value);
			return;
		}
		if ($slo_co_itm_cd.equalsIgnoreCase(name)) {
			slo_co_itm_cd(value);
			return;
		}
		if ($slo_co_itm_sub1.equalsIgnoreCase(name)) {
			slo_co_itm_sub1(value);
			return;
		}
		if ($slo_co_itm_sub2.equalsIgnoreCase(name)) {
			slo_co_itm_sub2(value);
			return;
		}
		if ($slo_co_itm_sub3.equalsIgnoreCase(name)) {
			slo_co_itm_sub3(value);
			return;
		}
		if ($slo_co_itm_nm.equalsIgnoreCase(name)) {
			slo_co_itm_nm(value);
			return;
		}
		if ($trd_unit_cd.equalsIgnoreCase(name)) {
			trd_unit_cd(value);
			return;
		}
		if ($trd_unit_nm.equalsIgnoreCase(name)) {
			trd_unit_nm(value);
			return;
		}
		if ($sub_char1.equalsIgnoreCase(name)) {
			sub_char1(value);
			return;
		}
		if ($sub_char2.equalsIgnoreCase(name)) {
			sub_char2(value);
			return;
		}
		if ($sub_char3.equalsIgnoreCase(name)) {
			sub_char3(value);
			return;
		}
		if ($sub_char4.equalsIgnoreCase(name)) {
			sub_char4(value);
			return;
		}
		if ($sub_char5.equalsIgnoreCase(name)) {
			sub_char5(value);
			return;
		}
		if ($sub_char6.equalsIgnoreCase(name)) {
			sub_char6(value);
			return;
		}
		if ($sub_char7.equalsIgnoreCase(name)) {
			sub_char7(value);
			return;
		}
		if ($sub_char8.equalsIgnoreCase(name)) {
			sub_char8(value);
			return;
		}
		if ($sub_char9.equalsIgnoreCase(name)) {
			sub_char9(value);
			return;
		}
		if ($sub_char10.equalsIgnoreCase(name)) {
			sub_char10(value);
			return;
		}
		if ($sub_char11.equalsIgnoreCase(name)) {
			sub_char11(value);
			return;
		}
		if ($sub_char12.equalsIgnoreCase(name)) {
			sub_char12(value);
			return;
		}
		if ($sub_char13.equalsIgnoreCase(name)) {
			sub_char13(value);
			return;
		}
		if ($sub_char14.equalsIgnoreCase(name)) {
			sub_char14(value);
			return;
		}
		if ($sub_char15.equalsIgnoreCase(name)) {
			sub_char15(value);
			return;
		}
		if ($sub_char16.equalsIgnoreCase(name)) {
			sub_char16(value);
			return;
		}
		if ($sub_char17.equalsIgnoreCase(name)) {
			sub_char17(value);
			return;
		}
		if ($sub_char18.equalsIgnoreCase(name)) {
			sub_char18(value);
			return;
		}
		if ($sub_char19.equalsIgnoreCase(name)) {
			sub_char19(value);
			return;
		}
		if ($sub_char20.equalsIgnoreCase(name)) {
			sub_char20(value);
			return;
		}
		if ($sub_char21.equalsIgnoreCase(name)) {
			sub_char21(value);
			return;
		}
		if ($sub_char22.equalsIgnoreCase(name)) {
			sub_char22(value);
			return;
		}
		if ($sub_char23.equalsIgnoreCase(name)) {
			sub_char23(value);
			return;
		}
		if ($sub_char24.equalsIgnoreCase(name)) {
			sub_char24(value);
			return;
		}
		if ($sub_char25.equalsIgnoreCase(name)) {
			sub_char25(value);
			return;
		}
		if ($sub_char26.equalsIgnoreCase(name)) {
			sub_char26(value);
			return;
		}
		if ($sub_char27.equalsIgnoreCase(name)) {
			sub_char27(value);
			return;
		}
		if ($sub_char28.equalsIgnoreCase(name)) {
			sub_char28(value);
			return;
		}
		if ($sub_char29.equalsIgnoreCase(name)) {
			sub_char29(value);
			return;
		}
		if ($sub_char30.equalsIgnoreCase(name)) {
			sub_char30(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($data_lno.equalsIgnoreCase(name)) {
			data_lno(value);
			return;
		}
		if ($data_no.equalsIgnoreCase(name)) {
			data_no(value);
			return;
		}
		if ($dlv_inst_rev.equalsIgnoreCase(name)) {
			dlv_inst_rev(value);
			return;
		}
		if ($po_rev.equalsIgnoreCase(name)) {
			po_rev(value);
			return;
		}
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
			return;
		}
		if ($sub_num1.equalsIgnoreCase(name)) {
			sub_num1(value);
			return;
		}
		if ($sub_num2.equalsIgnoreCase(name)) {
			sub_num2(value);
			return;
		}
		if ($sub_num3.equalsIgnoreCase(name)) {
			sub_num3(value);
			return;
		}
		if ($sub_num4.equalsIgnoreCase(name)) {
			sub_num4(value);
			return;
		}
		if ($sub_num5.equalsIgnoreCase(name)) {
			sub_num5(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($data_lno.equalsIgnoreCase(name)) {
			data_lno(value);
			return;
		}
		if ($data_no.equalsIgnoreCase(name)) {
			data_no(value);
			return;
		}
		if ($dlv_inst_rev.equalsIgnoreCase(name)) {
			dlv_inst_rev(value);
			return;
		}
		if ($po_rev.equalsIgnoreCase(name)) {
			po_rev(value);
			return;
		}
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
			return;
		}
		if ($sub_num1.equalsIgnoreCase(name)) {
			sub_num1(value);
			return;
		}
		if ($sub_num2.equalsIgnoreCase(name)) {
			sub_num2(value);
			return;
		}
		if ($sub_num3.equalsIgnoreCase(name)) {
			sub_num3(value);
			return;
		}
		if ($sub_num4.equalsIgnoreCase(name)) {
			sub_num4(value);
			return;
		}
		if ($sub_num5.equalsIgnoreCase(name)) {
			sub_num5(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($data_lno.equalsIgnoreCase(name)) {
			data_lno(value);
			return;
		}
		if ($data_no.equalsIgnoreCase(name)) {
			data_no(value);
			return;
		}
		if ($dlv_inst_rev.equalsIgnoreCase(name)) {
			dlv_inst_rev(value);
			return;
		}
		if ($po_rev.equalsIgnoreCase(name)) {
			po_rev(value);
			return;
		}
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
			return;
		}
		if ($sub_num1.equalsIgnoreCase(name)) {
			sub_num1(value);
			return;
		}
		if ($sub_num2.equalsIgnoreCase(name)) {
			sub_num2(value);
			return;
		}
		if ($sub_num3.equalsIgnoreCase(name)) {
			sub_num3(value);
			return;
		}
		if ($sub_num4.equalsIgnoreCase(name)) {
			sub_num4(value);
			return;
		}
		if ($sub_num5.equalsIgnoreCase(name)) {
			sub_num5(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($data_lno.equalsIgnoreCase(name)) {
			data_lno(value);
			return;
		}
		if ($data_no.equalsIgnoreCase(name)) {
			data_no(value);
			return;
		}
		if ($dlv_inst_rev.equalsIgnoreCase(name)) {
			dlv_inst_rev(value);
			return;
		}
		if ($po_rev.equalsIgnoreCase(name)) {
			po_rev(value);
			return;
		}
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
			return;
		}
		if ($sub_num1.equalsIgnoreCase(name)) {
			sub_num1(value);
			return;
		}
		if ($sub_num2.equalsIgnoreCase(name)) {
			sub_num2(value);
			return;
		}
		if ($sub_num3.equalsIgnoreCase(name)) {
			sub_num3(value);
			return;
		}
		if ($sub_num4.equalsIgnoreCase(name)) {
			sub_num4(value);
			return;
		}
		if ($sub_num5.equalsIgnoreCase(name)) {
			sub_num5(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($data_lno.equalsIgnoreCase(name)) {
			data_lno(value);
			return;
		}
		if ($data_no.equalsIgnoreCase(name)) {
			data_no(value);
			return;
		}
		if ($dlv_inst_rev.equalsIgnoreCase(name)) {
			dlv_inst_rev(value);
			return;
		}
		if ($po_rev.equalsIgnoreCase(name)) {
			po_rev(value);
			return;
		}
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
			return;
		}
		if ($sub_num1.equalsIgnoreCase(name)) {
			sub_num1(value);
			return;
		}
		if ($sub_num2.equalsIgnoreCase(name)) {
			sub_num2(value);
			return;
		}
		if ($sub_num3.equalsIgnoreCase(name)) {
			sub_num3(value);
			return;
		}
		if ($sub_num4.equalsIgnoreCase(name)) {
			sub_num4(value);
			return;
		}
		if ($sub_num5.equalsIgnoreCase(name)) {
			sub_num5(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($data_make_dt.equalsIgnoreCase(name)) {
			data_make_dt(value);
			return;
		}
		if ($dlv_inst_dt.equalsIgnoreCase(name)) {
			dlv_inst_dt(value);
			return;
		}
		if ($dlv_rqst_dt.equalsIgnoreCase(name)) {
			dlv_rqst_dt(value);
			return;
		}
		if ($dlv_rqst_hm.equalsIgnoreCase(name)) {
			dlv_rqst_hm(value);
			return;
		}
		if ($sub_dt1.equalsIgnoreCase(name)) {
			sub_dt1(value);
			return;
		}
		if ($sub_dt2.equalsIgnoreCase(name)) {
			sub_dt2(value);
			return;
		}
		if ($sub_dt3.equalsIgnoreCase(name)) {
			sub_dt3(value);
			return;
		}
		if ($sub_dt4.equalsIgnoreCase(name)) {
			sub_dt4(value);
			return;
		}
		if ($sub_dt5.equalsIgnoreCase(name)) {
			sub_dt5(value);
			return;
		}
		super.setDate(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($in_to_sundry_flg.equalsIgnoreCase(name)) {
			in_to_sundry_flg(value);
			return;
		}
		if ($tdlv_sundry_flg.equalsIgnoreCase(name)) {
			tdlv_sundry_flg(value);
			return;
		}
		if ($po_co_sundry_itm_flg.equalsIgnoreCase(name)) {
			po_co_sundry_itm_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($trd_typ_cd.equalsIgnoreCase(name)) {
			trd_typ_cd(value);
			return;
		}
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			data_crud_typ(value);
			return;
		}
		if ($dlv_inst_no.equalsIgnoreCase(name)) {
			dlv_inst_no(value);
			return;
		}
		if ($dlv_inst_d_no.equalsIgnoreCase(name)) {
			dlv_inst_d_no(value);
			return;
		}
		if ($dlv_inst_grp_no.equalsIgnoreCase(name)) {
			dlv_inst_grp_no(value);
			return;
		}
		if ($po_no.equalsIgnoreCase(name)) {
			po_no(value);
			return;
		}
		if ($po_d_no.equalsIgnoreCase(name)) {
			po_d_no(value);
			return;
		}
		if ($po_co_cd.equalsIgnoreCase(name)) {
			po_co_cd(value);
			return;
		}
		if ($po_co_nm.equalsIgnoreCase(name)) {
			po_co_nm(value);
			return;
		}
		if ($po_co_cntry_cd.equalsIgnoreCase(name)) {
			po_co_cntry_cd(value);
			return;
		}
		if ($slo_co_cd.equalsIgnoreCase(name)) {
			slo_co_cd(value);
			return;
		}
		if ($slo_co_nm.equalsIgnoreCase(name)) {
			slo_co_nm(value);
			return;
		}
		if ($slo_co_cntry_cd.equalsIgnoreCase(name)) {
			slo_co_cntry_cd(value);
			return;
		}
		if ($dlv_inst_print_rmrks.equalsIgnoreCase(name)) {
			dlv_inst_print_rmrks(value);
			return;
		}
		if ($dlv_inst_print_d_rmrks.equalsIgnoreCase(name)) {
			dlv_inst_print_d_rmrks(value);
			return;
		}
		if ($in_to_id_typ.equalsIgnoreCase(name)) {
			in_to_id_typ(value);
			return;
		}
		if ($in_to_id_cd.equalsIgnoreCase(name)) {
			in_to_id_cd(value);
			return;
		}
		if ($in_to_nm.equalsIgnoreCase(name)) {
			in_to_nm(value);
			return;
		}
		if ($in_to_zip_cd.equalsIgnoreCase(name)) {
			in_to_zip_cd(value);
			return;
		}
		if ($in_to_addr1.equalsIgnoreCase(name)) {
			in_to_addr1(value);
			return;
		}
		if ($in_to_addr2.equalsIgnoreCase(name)) {
			in_to_addr2(value);
			return;
		}
		if ($in_to_addr3.equalsIgnoreCase(name)) {
			in_to_addr3(value);
			return;
		}
		if ($in_to_addr4.equalsIgnoreCase(name)) {
			in_to_addr4(value);
			return;
		}
		if ($in_to_cntct_dpt.equalsIgnoreCase(name)) {
			in_to_cntct_dpt(value);
			return;
		}
		if ($in_to_cntct_psn.equalsIgnoreCase(name)) {
			in_to_cntct_psn(value);
			return;
		}
		if ($in_to_tel.equalsIgnoreCase(name)) {
			in_to_tel(value);
			return;
		}
		if ($in_to_fax.equalsIgnoreCase(name)) {
			in_to_fax(value);
			return;
		}
		if ($in_to_cntry_cd.equalsIgnoreCase(name)) {
			in_to_cntry_cd(value);
			return;
		}
		if ($tdlv_cd.equalsIgnoreCase(name)) {
			tdlv_cd(value);
			return;
		}
		if ($tdlv_nm.equalsIgnoreCase(name)) {
			tdlv_nm(value);
			return;
		}
		if ($tdlv_zip_cd.equalsIgnoreCase(name)) {
			tdlv_zip_cd(value);
			return;
		}
		if ($tdlv_addr1.equalsIgnoreCase(name)) {
			tdlv_addr1(value);
			return;
		}
		if ($tdlv_addr2.equalsIgnoreCase(name)) {
			tdlv_addr2(value);
			return;
		}
		if ($tdlv_addr3.equalsIgnoreCase(name)) {
			tdlv_addr3(value);
			return;
		}
		if ($tdlv_addr4.equalsIgnoreCase(name)) {
			tdlv_addr4(value);
			return;
		}
		if ($tdlv_cntct_dpt.equalsIgnoreCase(name)) {
			tdlv_cntct_dpt(value);
			return;
		}
		if ($tdlv_cntct_psn.equalsIgnoreCase(name)) {
			tdlv_cntct_psn(value);
			return;
		}
		if ($tdlv_tel.equalsIgnoreCase(name)) {
			tdlv_tel(value);
			return;
		}
		if ($tdlv_fax.equalsIgnoreCase(name)) {
			tdlv_fax(value);
			return;
		}
		if ($tdlv_cntry_cd.equalsIgnoreCase(name)) {
			tdlv_cntry_cd(value);
			return;
		}
		if ($dlv_day_week_typ.equalsIgnoreCase(name)) {
			dlv_day_week_typ(value);
			return;
		}
		if ($pri_prnt_typ.equalsIgnoreCase(name)) {
			pri_prnt_typ(value);
			return;
		}
		if ($po_co_itm_cd.equalsIgnoreCase(name)) {
			po_co_itm_cd(value);
			return;
		}
		if ($po_co_itm_sub1.equalsIgnoreCase(name)) {
			po_co_itm_sub1(value);
			return;
		}
		if ($po_co_itm_sub2.equalsIgnoreCase(name)) {
			po_co_itm_sub2(value);
			return;
		}
		if ($po_co_itm_sub3.equalsIgnoreCase(name)) {
			po_co_itm_sub3(value);
			return;
		}
		if ($po_co_itm_nm.equalsIgnoreCase(name)) {
			po_co_itm_nm(value);
			return;
		}
		if ($po_co_iv_itm_nm.equalsIgnoreCase(name)) {
			po_co_iv_itm_nm(value);
			return;
		}
		if ($slo_co_itm_cd.equalsIgnoreCase(name)) {
			slo_co_itm_cd(value);
			return;
		}
		if ($slo_co_itm_sub1.equalsIgnoreCase(name)) {
			slo_co_itm_sub1(value);
			return;
		}
		if ($slo_co_itm_sub2.equalsIgnoreCase(name)) {
			slo_co_itm_sub2(value);
			return;
		}
		if ($slo_co_itm_sub3.equalsIgnoreCase(name)) {
			slo_co_itm_sub3(value);
			return;
		}
		if ($slo_co_itm_nm.equalsIgnoreCase(name)) {
			slo_co_itm_nm(value);
			return;
		}
		if ($trd_unit_cd.equalsIgnoreCase(name)) {
			trd_unit_cd(value);
			return;
		}
		if ($trd_unit_nm.equalsIgnoreCase(name)) {
			trd_unit_nm(value);
			return;
		}
		if ($sub_char1.equalsIgnoreCase(name)) {
			sub_char1(value);
			return;
		}
		if ($sub_char2.equalsIgnoreCase(name)) {
			sub_char2(value);
			return;
		}
		if ($sub_char3.equalsIgnoreCase(name)) {
			sub_char3(value);
			return;
		}
		if ($sub_char4.equalsIgnoreCase(name)) {
			sub_char4(value);
			return;
		}
		if ($sub_char5.equalsIgnoreCase(name)) {
			sub_char5(value);
			return;
		}
		if ($sub_char6.equalsIgnoreCase(name)) {
			sub_char6(value);
			return;
		}
		if ($sub_char7.equalsIgnoreCase(name)) {
			sub_char7(value);
			return;
		}
		if ($sub_char8.equalsIgnoreCase(name)) {
			sub_char8(value);
			return;
		}
		if ($sub_char9.equalsIgnoreCase(name)) {
			sub_char9(value);
			return;
		}
		if ($sub_char10.equalsIgnoreCase(name)) {
			sub_char10(value);
			return;
		}
		if ($sub_char11.equalsIgnoreCase(name)) {
			sub_char11(value);
			return;
		}
		if ($sub_char12.equalsIgnoreCase(name)) {
			sub_char12(value);
			return;
		}
		if ($sub_char13.equalsIgnoreCase(name)) {
			sub_char13(value);
			return;
		}
		if ($sub_char14.equalsIgnoreCase(name)) {
			sub_char14(value);
			return;
		}
		if ($sub_char15.equalsIgnoreCase(name)) {
			sub_char15(value);
			return;
		}
		if ($sub_char16.equalsIgnoreCase(name)) {
			sub_char16(value);
			return;
		}
		if ($sub_char17.equalsIgnoreCase(name)) {
			sub_char17(value);
			return;
		}
		if ($sub_char18.equalsIgnoreCase(name)) {
			sub_char18(value);
			return;
		}
		if ($sub_char19.equalsIgnoreCase(name)) {
			sub_char19(value);
			return;
		}
		if ($sub_char20.equalsIgnoreCase(name)) {
			sub_char20(value);
			return;
		}
		if ($sub_char21.equalsIgnoreCase(name)) {
			sub_char21(value);
			return;
		}
		if ($sub_char22.equalsIgnoreCase(name)) {
			sub_char22(value);
			return;
		}
		if ($sub_char23.equalsIgnoreCase(name)) {
			sub_char23(value);
			return;
		}
		if ($sub_char24.equalsIgnoreCase(name)) {
			sub_char24(value);
			return;
		}
		if ($sub_char25.equalsIgnoreCase(name)) {
			sub_char25(value);
			return;
		}
		if ($sub_char26.equalsIgnoreCase(name)) {
			sub_char26(value);
			return;
		}
		if ($sub_char27.equalsIgnoreCase(name)) {
			sub_char27(value);
			return;
		}
		if ($sub_char28.equalsIgnoreCase(name)) {
			sub_char28(value);
			return;
		}
		if ($sub_char29.equalsIgnoreCase(name)) {
			sub_char29(value);
			return;
		}
		if ($sub_char30.equalsIgnoreCase(name)) {
			sub_char30(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($data_lno.equalsIgnoreCase(name)) {
			data_lno(value);
			return;
		}
		if ($data_no.equalsIgnoreCase(name)) {
			data_no(value);
			return;
		}
		if ($dlv_inst_rev.equalsIgnoreCase(name)) {
			dlv_inst_rev(value);
			return;
		}
		if ($po_rev.equalsIgnoreCase(name)) {
			po_rev(value);
			return;
		}
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
			return;
		}
		if ($sub_num1.equalsIgnoreCase(name)) {
			sub_num1(value);
			return;
		}
		if ($sub_num2.equalsIgnoreCase(name)) {
			sub_num2(value);
			return;
		}
		if ($sub_num3.equalsIgnoreCase(name)) {
			sub_num3(value);
			return;
		}
		if ($sub_num4.equalsIgnoreCase(name)) {
			sub_num4(value);
			return;
		}
		if ($sub_num5.equalsIgnoreCase(name)) {
			sub_num5(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($data_lno.equalsIgnoreCase(name)) {
			data_lno(value);
			return;
		}
		if ($data_no.equalsIgnoreCase(name)) {
			data_no(value);
			return;
		}
		if ($dlv_inst_rev.equalsIgnoreCase(name)) {
			dlv_inst_rev(value);
			return;
		}
		if ($po_rev.equalsIgnoreCase(name)) {
			po_rev(value);
			return;
		}
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
			return;
		}
		if ($sub_num1.equalsIgnoreCase(name)) {
			sub_num1(value);
			return;
		}
		if ($sub_num2.equalsIgnoreCase(name)) {
			sub_num2(value);
			return;
		}
		if ($sub_num3.equalsIgnoreCase(name)) {
			sub_num3(value);
			return;
		}
		if ($sub_num4.equalsIgnoreCase(name)) {
			sub_num4(value);
			return;
		}
		if ($sub_num5.equalsIgnoreCase(name)) {
			sub_num5(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($data_lno.equalsIgnoreCase(name)) {
			data_lno(value);
			return;
		}
		if ($data_no.equalsIgnoreCase(name)) {
			data_no(value);
			return;
		}
		if ($dlv_inst_rev.equalsIgnoreCase(name)) {
			dlv_inst_rev(value);
			return;
		}
		if ($po_rev.equalsIgnoreCase(name)) {
			po_rev(value);
			return;
		}
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
			return;
		}
		if ($sub_num1.equalsIgnoreCase(name)) {
			sub_num1(value);
			return;
		}
		if ($sub_num2.equalsIgnoreCase(name)) {
			sub_num2(value);
			return;
		}
		if ($sub_num3.equalsIgnoreCase(name)) {
			sub_num3(value);
			return;
		}
		if ($sub_num4.equalsIgnoreCase(name)) {
			sub_num4(value);
			return;
		}
		if ($sub_num5.equalsIgnoreCase(name)) {
			sub_num5(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($data_lno.equalsIgnoreCase(name)) {
			data_lno(value);
			return;
		}
		if ($data_no.equalsIgnoreCase(name)) {
			data_no(value);
			return;
		}
		if ($dlv_inst_rev.equalsIgnoreCase(name)) {
			dlv_inst_rev(value);
			return;
		}
		if ($po_rev.equalsIgnoreCase(name)) {
			po_rev(value);
			return;
		}
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
			return;
		}
		if ($sub_num1.equalsIgnoreCase(name)) {
			sub_num1(value);
			return;
		}
		if ($sub_num2.equalsIgnoreCase(name)) {
			sub_num2(value);
			return;
		}
		if ($sub_num3.equalsIgnoreCase(name)) {
			sub_num3(value);
			return;
		}
		if ($sub_num4.equalsIgnoreCase(name)) {
			sub_num4(value);
			return;
		}
		if ($sub_num5.equalsIgnoreCase(name)) {
			sub_num5(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($data_lno.equalsIgnoreCase(name)) {
			data_lno(value);
			return;
		}
		if ($data_no.equalsIgnoreCase(name)) {
			data_no(value);
			return;
		}
		if ($dlv_inst_rev.equalsIgnoreCase(name)) {
			dlv_inst_rev(value);
			return;
		}
		if ($po_rev.equalsIgnoreCase(name)) {
			po_rev(value);
			return;
		}
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
			return;
		}
		if ($sub_num1.equalsIgnoreCase(name)) {
			sub_num1(value);
			return;
		}
		if ($sub_num2.equalsIgnoreCase(name)) {
			sub_num2(value);
			return;
		}
		if ($sub_num3.equalsIgnoreCase(name)) {
			sub_num3(value);
			return;
		}
		if ($sub_num4.equalsIgnoreCase(name)) {
			sub_num4(value);
			return;
		}
		if ($sub_num5.equalsIgnoreCase(name)) {
			sub_num5(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($data_make_dt.equalsIgnoreCase(name)) {
			data_make_dt(value);
			return;
		}
		if ($dlv_inst_dt.equalsIgnoreCase(name)) {
			dlv_inst_dt(value);
			return;
		}
		if ($dlv_rqst_dt.equalsIgnoreCase(name)) {
			dlv_rqst_dt(value);
			return;
		}
		if ($dlv_rqst_hm.equalsIgnoreCase(name)) {
			dlv_rqst_hm(value);
			return;
		}
		if ($sub_dt1.equalsIgnoreCase(name)) {
			sub_dt1(value);
			return;
		}
		if ($sub_dt2.equalsIgnoreCase(name)) {
			sub_dt2(value);
			return;
		}
		if ($sub_dt3.equalsIgnoreCase(name)) {
			sub_dt3(value);
			return;
		}
		if ($sub_dt4.equalsIgnoreCase(name)) {
			sub_dt4(value);
			return;
		}
		if ($sub_dt5.equalsIgnoreCase(name)) {
			sub_dt5(value);
			return;
		}
		super.setDateNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($in_to_sundry_flg.equalsIgnoreCase(name)) {
			in_to_sundry_flg(value);
			return;
		}
		if ($tdlv_sundry_flg.equalsIgnoreCase(name)) {
			tdlv_sundry_flg(value);
			return;
		}
		if ($po_co_sundry_itm_flg.equalsIgnoreCase(name)) {
			po_co_sundry_itm_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

