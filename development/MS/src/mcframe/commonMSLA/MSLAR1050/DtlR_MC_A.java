package mcframe.commonMSLA.MSLAR1050;

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
	 *  寄託者ＣＤ.<p>
	 *
	 */
	public static final String $dpstr_cd = "dpstr_cd";
	/**
	 *  寄託者名.<p>
	 *
	 */
	public static final String $dpstr_nm = "dpstr_nm";
	/**
	 *  倉庫事業者ＣＤ.<p>
	 *
	 */
	public static final String $site_co_cd = "site_co_cd";
	/**
	 *  倉庫事業者名.<p>
	 *
	 */
	public static final String $site_co_nm = "site_co_nm";
	/**
	 *  移動指図ＮＯ.<p>
	 *
	 */
	public static final String $xfr_inst_no = "xfr_inst_no";
	/**
	 *  取引ＣＤ.<p>
	 *
	 */
	public static final String $trd_cd = "trd_cd";
	/**
	 *  取引名.<p>
	 *
	 */
	public static final String $trd_nm = "trd_nm";
	/**
	 *  取引パタン区分.<p>
	 *
	 */
	public static final String $trd_ptn_typ = "trd_ptn_typ";
	/**
	 *  移動予定日.<p>
	 *
	 */
	public static final String $xfr_schd_dt = "xfr_schd_dt";
	/**
	 *  移動指図日.<p>
	 *
	 */
	public static final String $xfr_inst_dt = "xfr_inst_dt";
	/**
	 *  指図部門ＣＤ.<p>
	 *
	 */
	public static final String $inst_dpt_cd = "inst_dpt_cd";
	/**
	 *  指図部門名.<p>
	 *
	 */
	public static final String $inst_dpt_nm = "inst_dpt_nm";
	/**
	 *  指図担当者ＣＤ.<p>
	 *
	 */
	public static final String $inst_usr_cd = "inst_usr_cd";
	/**
	 *  指図担当者名.<p>
	 *
	 */
	public static final String $inst_usr_nm = "inst_usr_nm";
	/**
	 *  移動・移送予定ＮＯ.<p>
	 *
	 */
	public static final String $xfr_schd_no = "xfr_schd_no";
	/**
	 *  移動・移送元区分.<p>
	 *
	 */
	public static final String $xfr_src_typ = "xfr_src_typ";
	/**
	 *  移動・移送元ＮＯ.<p>
	 *
	 */
	public static final String $xfr_src_no = "xfr_src_no";
	/**
	 *  移動指図明細ＮＯ.<p>
	 *
	 */
	public static final String $xfr_inst_d_no = "xfr_inst_d_no";
	/**
	 *  移動引当状況ＮＯ.<p>
	 *
	 */
	public static final String $xfr_alloc_sts_no = "xfr_alloc_sts_no";
	/**
	 *  納品書ＮＯ.<p>
	 *
	 */
	public static final String $dlv_slip_no = "dlv_slip_no";
	/**
	 *  納品書明細ＮＯ.<p>
	 *
	 */
	public static final String $dlv_slip_d_no = "dlv_slip_d_no";
	/**
	 *  物流グループＣＤ.<p>
	 *
	 */
	public static final String $lg_grp_cd = "lg_grp_cd";
	/**
	 *  物流グループ名.<p>
	 *
	 */
	public static final String $lg_grp_nm = "lg_grp_nm";
	/**
	 *  出庫場所ＣＤ.<p>
	 *
	 */
	public static final String $gi_loc_cd = "gi_loc_cd";
	/**
	 *  出庫場所名.<p>
	 *
	 */
	public static final String $gi_loc_nm = "gi_loc_nm";
	/**
	 *  出庫棚・ラインＣＤ.<p>
	 *
	 */
	public static final String $gi_str_ln_cd = "gi_str_ln_cd";
	/**
	 *  出庫棚・ライン名.<p>
	 *
	 */
	public static final String $gi_str_ln_nm = "gi_str_ln_nm";
	/**
	 *  出庫場所ＴＥＬ.<p>
	 *
	 */
	public static final String $gi_loc_tel = "gi_loc_tel";
	/**
	 *  出庫場所ＦＡＸ.<p>
	 *
	 */
	public static final String $gi_loc_fax = "gi_loc_fax";
	/**
	 *  入庫場所ＣＤ.<p>
	 *
	 */
	public static final String $gr_loc_cd = "gr_loc_cd";
	/**
	 *  入庫場所名.<p>
	 *
	 */
	public static final String $gr_loc_nm = "gr_loc_nm";
	/**
	 *  入庫棚・ラインＣＤ.<p>
	 *
	 */
	public static final String $gr_str_ln_cd = "gr_str_ln_cd";
	/**
	 *  入庫棚・ライン名.<p>
	 *
	 */
	public static final String $gr_str_ln_nm = "gr_str_ln_nm";
	/**
	 *  入庫場所ＴＥＬ.<p>
	 *
	 */
	public static final String $gr_loc_tel = "gr_loc_tel";
	/**
	 *  入庫場所ＦＡＸ.<p>
	 *
	 */
	public static final String $gr_loc_fax = "gr_loc_fax";
	/**
	 *  品目ＣＤ.<p>
	 *
	 */
	public static final String $itm_cd = "itm_cd";
	/**
	 *  枝番１.<p>
	 *
	 */
	public static final String $itm_sub1 = "itm_sub1";
	/**
	 *  枝番２.<p>
	 *
	 */
	public static final String $itm_sub2 = "itm_sub2";
	/**
	 *  枝番３.<p>
	 *
	 */
	public static final String $itm_sub3 = "itm_sub3";
	/**
	 *  品名.<p>
	 *
	 */
	public static final String $itm_nm = "itm_nm";
	/**
	 *  ロットＮＯ.<p>
	 *
	 */
	public static final String $lot_no = "lot_no";
	/**
	 *  サブロットＮＯ.<p>
	 *
	 */
	public static final String $sublot_no = "sublot_no";
	/**
	 *  版ＮＯ.<p>
	 *
	 */
	public static final String $ver_no = "ver_no";
	/**
	 *  手配ＮＯ１.<p>
	 *
	 */
	public static final String $sno1 = "sno1";
	/**
	 *  手配ＮＯ１無し可ＦＬＧ.<p>
	 *
	 */
	public static final String $sno1_null_flg = "sno1_null_flg";
	/**
	 *  手配ＮＯ２.<p>
	 *
	 */
	public static final String $sno2 = "sno2";
	/**
	 *  手配ＮＯ２無し可ＦＬＧ.<p>
	 *
	 */
	public static final String $sno2_null_flg = "sno2_null_flg";
	/**
	 *  手配ＮＯ３.<p>
	 *
	 */
	public static final String $sno3 = "sno3";
	/**
	 *  手配ＮＯ３無し可ＦＬＧ.<p>
	 *
	 */
	public static final String $sno3_null_flg = "sno3_null_flg";
	/**
	 *  手配ＮＯ４.<p>
	 *
	 */
	public static final String $sno4 = "sno4";
	/**
	 *  手配ＮＯ４無し可ＦＬＧ.<p>
	 *
	 */
	public static final String $sno4_null_flg = "sno4_null_flg";
	/**
	 *  格付ＣＤ.<p>
	 *
	 */
	public static final String $gd_cd = "gd_cd";
	/**
	 *  格付名.<p>
	 *
	 */
	public static final String $gd_nm = "gd_nm";
	/**
	 *  良品区分.<p>
	 *
	 */
	public static final String $quality_typ = "quality_typ";
	/**
	 *  在庫検査区分.<p>
	 *
	 */
	public static final String $stk_insp_typ = "stk_insp_typ";
	/**
	 *  在庫識別区分.<p>
	 *
	 */
	public static final String $stk_id_typ = "stk_id_typ";
	/**
	 *  在庫取引先ＣＤ.<p>
	 *
	 */
	public static final String $stk_bp_cd = "stk_bp_cd";
	/**
	 *  在庫取引先名.<p>
	 *
	 */
	public static final String $stk_bp_nm = "stk_bp_nm";
	/**
	 *  取引単位数量.<p>
	 *
	 */
	public static final String $trd_unit_qty = "trd_unit_qty";
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
	 *  基準単位数量.<p>
	 *
	 */
	public static final String $base_unit_qty = "base_unit_qty";
	/**
	 *  基準単位ＣＤ.<p>
	 *
	 */
	public static final String $base_unit_cd = "base_unit_cd";
	/**
	 *  基準単位名.<p>
	 *
	 */
	public static final String $base_unit_nm = "base_unit_nm";
	/**
	 *  引当済ＦＬＧ.<p>
	 *
	 */
	public static final String $alloc_flg = "alloc_flg";
	/**
	 *  打切ＦＬＧ.<p>
	 *
	 */
	public static final String $abort_flg = "abort_flg";
	/**
	 *  有効期限.<p>
	 *
	 */
	public static final String $vld_dt = "vld_dt";
	/**
	 *  使用期限.<p>
	 *
	 */
	public static final String $lmt_dt = "lmt_dt";
	/**
	 *  最古入庫日.<p>
	 *
	 */
	public static final String $first_gr_dt = "first_gr_dt";
	/**
	 *  支給区分.<p>
	 *
	 */
	public static final String $prov_typ = "prov_typ";
	/**
	 *  支給計上区分.<p>
	 *
	 */
	public static final String $prov_basis_typ = "prov_basis_typ";
	/**
	 *  支給区分（返品）.<p>
	 *
	 */
	public static final String $ret_prov_typ = "ret_prov_typ";
	/**
	 *  支給計上区分（返品）.<p>
	 *
	 */
	public static final String $ret_prov_basis_typ = "ret_prov_basis_typ";
	/**
	 *  理由ＣＤ.<p>
	 *
	 */
	public static final String $rsn_cd = "rsn_cd";
	/**
	 *  理由名.<p>
	 *
	 */
	public static final String $rsn_nm = "rsn_nm";
	/**
	 *  負担部門ＣＤ.<p>
	 *
	 */
	public static final String $bd_dpt_cd = "bd_dpt_cd";
	/**
	 *  負担部門名.<p>
	 *
	 */
	public static final String $bd_dpt_nm = "bd_dpt_nm";
	/**
	 *  指図備考.<p>
	 *
	 */
	public static final String $inst_rmrks = "inst_rmrks";
	/**
	 *  指図明細備考.<p>
	 *
	 */
	public static final String $inst_d_rmrks = "inst_d_rmrks";
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
	public static final MCMeta dpstr_cd_META = createCommonMeta($dpstr_cd, mcframe.commonMA.meta.MA_META.IF_EXT_SYS_CD);
	public static final MCMeta dpstr_nm_META = createCommonMeta($dpstr_nm, mcframe.commonMA.meta.MA_META.CO_NM);
	public static final MCMeta site_co_cd_META = createCommonMeta($site_co_cd, mcframe.commonMA.meta.MA_META.IF_EXT_SYS_CD);
	public static final MCMeta site_co_nm_META = createCommonMeta($site_co_nm, mcframe.commonMA.meta.MA_META.SITE_CO_NM);
	public static final MCMeta xfr_inst_no_META = createCommonMeta($xfr_inst_no, mcframe.commonMA.meta.MA_META.XFR_INST_NO);
	public static final MCMeta trd_cd_META = createCommonMeta($trd_cd, mcframe.commonMA.meta.MA_META.IF_EXT_SYS_CD);
	public static final MCMeta trd_nm_META = createCommonMeta($trd_nm, mcframe.commonMA.meta.MA_META.TRD_NM);
	public static final MCMeta trd_ptn_typ_META = createCommonMeta($trd_ptn_typ, mcframe.commonMA.meta.MA_META.TRD_PTN_TYP);
	public static final MCMeta xfr_schd_dt_META = createCommonMeta($xfr_schd_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta xfr_inst_dt_META = createCommonMeta($xfr_inst_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta inst_dpt_cd_META = createCommonMeta($inst_dpt_cd, mcframe.commonMA.meta.MA_META.IF_EXT_SYS_CD);
	public static final MCMeta inst_dpt_nm_META = createCommonMeta($inst_dpt_nm, mcframe.commonMA.meta.MA_META.DPT_NM);
	public static final MCMeta inst_usr_cd_META = createCommonMeta($inst_usr_cd, mcframe.commonMA.meta.MA_META.IF_EXT_SYS_CD);
	public static final MCMeta inst_usr_nm_META = createCommonMeta($inst_usr_nm, mcframe.commonMA.meta.MA_META.USR_NM);
	public static final MCMeta xfr_schd_no_META = createCommonMeta($xfr_schd_no, mcframe.commonMA.meta.MA_META.XFR_SCHD_NO);
	public static final MCMeta xfr_src_typ_META = createCommonMeta($xfr_src_typ, mcframe.commonMS.meta.MS_META.XFR_SRC_TYP);
	public static final MCMeta xfr_src_no_META = createCommonMeta($xfr_src_no, mcframe.commonMA.meta.MA_META.XFR_SRC_NO);
	public static final MCMeta xfr_inst_d_no_META = createCommonMeta($xfr_inst_d_no, mcframe.commonMA.meta.MA_META.XFR_INST_D_NO);
	public static final MCMeta xfr_alloc_sts_no_META = createCommonMeta($xfr_alloc_sts_no, mcframe.commonMA.meta.MA_META.XFR_ALLOC_STS_NO);
	public static final MCMeta dlv_slip_no_META = createCommonMeta($dlv_slip_no, mcframe.commonMA.meta.MA_META.DLV_SLIP_NO);
	public static final MCMeta dlv_slip_d_no_META = createCommonMeta($dlv_slip_d_no, mcframe.commonMA.meta.MA_META.DLV_SLIP_D_NO);
	public static final MCMeta lg_grp_cd_META = createCommonMeta($lg_grp_cd, mcframe.commonMA.meta.MA_META.IF_EXT_SYS_CD);
	public static final MCMeta lg_grp_nm_META = createCommonMeta($lg_grp_nm, mcframe.commonMA.meta.MA_META.LG_GRP_NM);
	public static final MCMeta gi_loc_cd_META = createCommonMeta($gi_loc_cd, mcframe.commonMA.meta.MA_META.IF_EXT_SYS_CD);
	public static final MCMeta gi_loc_nm_META = createCommonMeta($gi_loc_nm, mcframe.commonMA.meta.MA_META.LOC_NM);
	public static final MCMeta gi_str_ln_cd_META = createCommonMeta($gi_str_ln_cd, mcframe.commonMA.meta.MA_META.IF_EXT_SYS_CD);
	public static final MCMeta gi_str_ln_nm_META = createCommonMeta($gi_str_ln_nm, mcframe.commonMA.meta.MA_META.STR_LN_NM);
	public static final MCMeta gi_loc_tel_META = createCommonMeta($gi_loc_tel, mcframe.commonMA.meta.MA_META.TEL);
	public static final MCMeta gi_loc_fax_META = createCommonMeta($gi_loc_fax, mcframe.commonMA.meta.MA_META.TEL);
	public static final MCMeta gr_loc_cd_META = createCommonMeta($gr_loc_cd, mcframe.commonMA.meta.MA_META.IF_EXT_SYS_CD);
	public static final MCMeta gr_loc_nm_META = createCommonMeta($gr_loc_nm, mcframe.commonMA.meta.MA_META.LOC_NM);
	public static final MCMeta gr_str_ln_cd_META = createCommonMeta($gr_str_ln_cd, mcframe.commonMA.meta.MA_META.IF_EXT_SYS_CD);
	public static final MCMeta gr_str_ln_nm_META = createCommonMeta($gr_str_ln_nm, mcframe.commonMA.meta.MA_META.STR_LN_NM);
	public static final MCMeta gr_loc_tel_META = createCommonMeta($gr_loc_tel, mcframe.commonMA.meta.MA_META.TEL);
	public static final MCMeta gr_loc_fax_META = createCommonMeta($gr_loc_fax, mcframe.commonMA.meta.MA_META.TEL);
	public static final MCMeta itm_cd_META = createCommonMeta($itm_cd, mcframe.commonMA.meta.MA_META.IF_EXT_SYS_CD);
	public static final MCMeta itm_sub1_META = createCommonMeta($itm_sub1, mcframe.commonMA.meta.MA_META.ITM_SUB1);
	public static final MCMeta itm_sub2_META = createCommonMeta($itm_sub2, mcframe.commonMA.meta.MA_META.ITM_SUB2);
	public static final MCMeta itm_sub3_META = createCommonMeta($itm_sub3, mcframe.commonMA.meta.MA_META.ITM_SUB3);
	public static final MCMeta itm_nm_META = createCommonMeta($itm_nm, mcframe.commonMA.meta.MA_META.ITM_NM);
	public static final MCMeta lot_no_META = createCommonMeta($lot_no, mcframe.commonMA.meta.MA_META.LOT_NO);
	public static final MCMeta sublot_no_META = createCommonMeta($sublot_no, mcframe.commonMA.meta.MA_META.SUBLOT_NO);
	public static final MCMeta ver_no_META = createCommonMeta($ver_no, mcframe.commonMA.meta.MA_META.VER_NO);
	public static final MCMeta sno1_META = createCommonMeta($sno1, mcframe.commonMA.meta.MA_META.SNO1);
	public static final MCMeta sno1_null_flg_META = createCommonMeta($sno1_null_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sno2_META = createCommonMeta($sno2, mcframe.commonMA.meta.MA_META.SNO2);
	public static final MCMeta sno2_null_flg_META = createCommonMeta($sno2_null_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sno3_META = createCommonMeta($sno3, mcframe.commonMA.meta.MA_META.SNO3);
	public static final MCMeta sno3_null_flg_META = createCommonMeta($sno3_null_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sno4_META = createCommonMeta($sno4, mcframe.commonMA.meta.MA_META.SNO4);
	public static final MCMeta sno4_null_flg_META = createCommonMeta($sno4_null_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta gd_cd_META = createCommonMeta($gd_cd, mcframe.commonMA.meta.MA_META.IF_EXT_SYS_CD);
	public static final MCMeta gd_nm_META = createCommonMeta($gd_nm, mcframe.commonMA.meta.MA_META.STK_GD_NM);
	public static final MCMeta quality_typ_META = createCommonMeta($quality_typ, mcframe.commonMA.meta.MA_META.QUALITY_TYP);
	public static final MCMeta stk_insp_typ_META = createCommonMeta($stk_insp_typ, mcframe.commonMS.meta.MS_META.STK_INSP_TYP);
	public static final MCMeta stk_id_typ_META = createCommonMeta($stk_id_typ, mcframe.commonMS.meta.MS_META.STK_ID_TYP);
	public static final MCMeta stk_bp_cd_META = createCommonMeta($stk_bp_cd, mcframe.commonMA.meta.MA_META.IF_EXT_SYS_CD);
	public static final MCMeta stk_bp_nm_META = createCommonMeta($stk_bp_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta trd_unit_qty_META = createCommonMeta($trd_unit_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta trd_unit_cd_META = createCommonMeta($trd_unit_cd, mcframe.commonMA.meta.MA_META.IF_EXT_SYS_CD);
	public static final MCMeta trd_unit_nm_META = createCommonMeta($trd_unit_nm, mcframe.commonMA.meta.MA_META.UNIT_NM);
	public static final MCMeta base_unit_qty_META = createCommonMeta($base_unit_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta base_unit_cd_META = createCommonMeta($base_unit_cd, mcframe.commonMA.meta.MA_META.IF_EXT_SYS_CD);
	public static final MCMeta base_unit_nm_META = createCommonMeta($base_unit_nm, mcframe.commonMA.meta.MA_META.UNIT_NM);
	public static final MCMeta alloc_flg_META = createCommonMeta($alloc_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta abort_flg_META = createCommonMeta($abort_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta vld_dt_META = createCommonMeta($vld_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta lmt_dt_META = createCommonMeta($lmt_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta first_gr_dt_META = createCommonMeta($first_gr_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta prov_typ_META = createCommonMeta($prov_typ, mcframe.commonMA.meta.MA_META.PROV_TYP);
	public static final MCMeta prov_basis_typ_META = createCommonMeta($prov_basis_typ, mcframe.commonMA.meta.MA_META.PROV_BASIS_TYP);
	public static final MCMeta ret_prov_typ_META = createCommonMeta($ret_prov_typ, mcframe.commonMA.meta.MA_META.PROV_TYP);
	public static final MCMeta ret_prov_basis_typ_META = createCommonMeta($ret_prov_basis_typ, mcframe.commonMA.meta.MA_META.PROV_BASIS_TYP);
	public static final MCMeta rsn_cd_META = createCommonMeta($rsn_cd, mcframe.commonMA.meta.MA_META.IF_EXT_SYS_CD);
	public static final MCMeta rsn_nm_META = createCommonMeta($rsn_nm, mcframe.commonMA.meta.MA_META.BIZ_RSN_NM);
	public static final MCMeta bd_dpt_cd_META = createCommonMeta($bd_dpt_cd, mcframe.commonMA.meta.MA_META.IF_EXT_SYS_CD);
	public static final MCMeta bd_dpt_nm_META = createCommonMeta($bd_dpt_nm, mcframe.commonMA.meta.MA_META.DPT_NM);
	public static final MCMeta inst_rmrks_META = createCommonMeta($inst_rmrks, mcframe.commonMS.meta.MS_META.XFR_INST_RMRKS);
	public static final MCMeta inst_d_rmrks_META = createCommonMeta($inst_d_rmrks, mcframe.commonMS.meta.MS_META.XFR_INST_D_RMRKS);
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
			dpstr_cd_META,
			dpstr_nm_META,
			site_co_cd_META,
			site_co_nm_META,
			xfr_inst_no_META,
			trd_cd_META,
			trd_nm_META,
			trd_ptn_typ_META,
			xfr_schd_dt_META,
			xfr_inst_dt_META,
			inst_dpt_cd_META,
			inst_dpt_nm_META,
			inst_usr_cd_META,
			inst_usr_nm_META,
			xfr_schd_no_META,
			xfr_src_typ_META,
			xfr_src_no_META,
			xfr_inst_d_no_META,
			xfr_alloc_sts_no_META,
			dlv_slip_no_META,
			dlv_slip_d_no_META,
			lg_grp_cd_META,
			lg_grp_nm_META,
			gi_loc_cd_META,
			gi_loc_nm_META,
			gi_str_ln_cd_META,
			gi_str_ln_nm_META,
			gi_loc_tel_META,
			gi_loc_fax_META,
			gr_loc_cd_META,
			gr_loc_nm_META,
			gr_str_ln_cd_META,
			gr_str_ln_nm_META,
			gr_loc_tel_META,
			gr_loc_fax_META,
			itm_cd_META,
			itm_sub1_META,
			itm_sub2_META,
			itm_sub3_META,
			itm_nm_META,
			lot_no_META,
			sublot_no_META,
			ver_no_META,
			sno1_META,
			sno1_null_flg_META,
			sno2_META,
			sno2_null_flg_META,
			sno3_META,
			sno3_null_flg_META,
			sno4_META,
			sno4_null_flg_META,
			gd_cd_META,
			gd_nm_META,
			quality_typ_META,
			stk_insp_typ_META,
			stk_id_typ_META,
			stk_bp_cd_META,
			stk_bp_nm_META,
			trd_unit_qty_META,
			trd_unit_cd_META,
			trd_unit_nm_META,
			base_unit_qty_META,
			base_unit_cd_META,
			base_unit_nm_META,
			alloc_flg_META,
			abort_flg_META,
			vld_dt_META,
			lmt_dt_META,
			first_gr_dt_META,
			prov_typ_META,
			prov_basis_typ_META,
			ret_prov_typ_META,
			ret_prov_basis_typ_META,
			rsn_cd_META,
			rsn_nm_META,
			bd_dpt_cd_META,
			bd_dpt_nm_META,
			inst_rmrks_META,
			inst_d_rmrks_META,
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
	 *  寄託者ＣＤ.<p>
	 *
	 */
	public String dpstr_cd() {
		return getConstString(offset + 5, $dpstr_cd);
	}

	/**
	 *  寄託者ＣＤ.<p>
	 *
	 */
	public void dpstr_cd(String value) {
		setConstString(offset + 5, $dpstr_cd, value);
	}


	/**
	 *  寄託者名.<p>
	 *
	 */
	public String dpstr_nm() {
		return getConstString(offset + 6, $dpstr_nm);
	}

	/**
	 *  寄託者名.<p>
	 *
	 */
	public void dpstr_nm(String value) {
		setConstString(offset + 6, $dpstr_nm, value);
	}


	/**
	 *  倉庫事業者ＣＤ.<p>
	 *
	 */
	public String site_co_cd() {
		return getConstString(offset + 7, $site_co_cd);
	}

	/**
	 *  倉庫事業者ＣＤ.<p>
	 *
	 */
	public void site_co_cd(String value) {
		setConstString(offset + 7, $site_co_cd, value);
	}


	/**
	 *  倉庫事業者名.<p>
	 *
	 */
	public String site_co_nm() {
		return getConstString(offset + 8, $site_co_nm);
	}

	/**
	 *  倉庫事業者名.<p>
	 *
	 */
	public void site_co_nm(String value) {
		setConstString(offset + 8, $site_co_nm, value);
	}


	/**
	 *  移動指図ＮＯ.<p>
	 *
	 */
	public String xfr_inst_no() {
		return getConstString(offset + 9, $xfr_inst_no);
	}

	/**
	 *  移動指図ＮＯ.<p>
	 *
	 */
	public void xfr_inst_no(String value) {
		setConstString(offset + 9, $xfr_inst_no, value);
	}


	/**
	 *  取引ＣＤ.<p>
	 *
	 */
	public String trd_cd() {
		return getConstString(offset + 10, $trd_cd);
	}

	/**
	 *  取引ＣＤ.<p>
	 *
	 */
	public void trd_cd(String value) {
		setConstString(offset + 10, $trd_cd, value);
	}


	/**
	 *  取引名.<p>
	 *
	 */
	public String trd_nm() {
		return getConstString(offset + 11, $trd_nm);
	}

	/**
	 *  取引名.<p>
	 *
	 */
	public void trd_nm(String value) {
		setConstString(offset + 11, $trd_nm, value);
	}


	/**
	 *  取引パタン区分.<p>
	 *
	 */
	public String trd_ptn_typ() {
		return getConstString(offset + 12, $trd_ptn_typ);
	}

	/**
	 *  取引パタン区分.<p>
	 *
	 */
	public void trd_ptn_typ(String value) {
		setConstString(offset + 12, $trd_ptn_typ, value);
	}


	/**
	 *  移動予定日.<p>
	 *
	 */
	public MCDate xfr_schd_dt() {
		return getConstDate(offset + 13, $xfr_schd_dt);
	}

	/**
	 *  移動予定日.<p>
	 *
	 */
	public void xfr_schd_dt(MCDate value) {
		setConstDate(offset + 13, $xfr_schd_dt, value);
	}


	/**
	 *  移動指図日.<p>
	 *
	 */
	public MCDate xfr_inst_dt() {
		return getConstDate(offset + 14, $xfr_inst_dt);
	}

	/**
	 *  移動指図日.<p>
	 *
	 */
	public void xfr_inst_dt(MCDate value) {
		setConstDate(offset + 14, $xfr_inst_dt, value);
	}


	/**
	 *  指図部門ＣＤ.<p>
	 *
	 */
	public String inst_dpt_cd() {
		return getConstString(offset + 15, $inst_dpt_cd);
	}

	/**
	 *  指図部門ＣＤ.<p>
	 *
	 */
	public void inst_dpt_cd(String value) {
		setConstString(offset + 15, $inst_dpt_cd, value);
	}


	/**
	 *  指図部門名.<p>
	 *
	 */
	public String inst_dpt_nm() {
		return getConstString(offset + 16, $inst_dpt_nm);
	}

	/**
	 *  指図部門名.<p>
	 *
	 */
	public void inst_dpt_nm(String value) {
		setConstString(offset + 16, $inst_dpt_nm, value);
	}


	/**
	 *  指図担当者ＣＤ.<p>
	 *
	 */
	public String inst_usr_cd() {
		return getConstString(offset + 17, $inst_usr_cd);
	}

	/**
	 *  指図担当者ＣＤ.<p>
	 *
	 */
	public void inst_usr_cd(String value) {
		setConstString(offset + 17, $inst_usr_cd, value);
	}


	/**
	 *  指図担当者名.<p>
	 *
	 */
	public String inst_usr_nm() {
		return getConstString(offset + 18, $inst_usr_nm);
	}

	/**
	 *  指図担当者名.<p>
	 *
	 */
	public void inst_usr_nm(String value) {
		setConstString(offset + 18, $inst_usr_nm, value);
	}


	/**
	 *  移動・移送予定ＮＯ.<p>
	 *
	 */
	public String xfr_schd_no() {
		return getConstString(offset + 19, $xfr_schd_no);
	}

	/**
	 *  移動・移送予定ＮＯ.<p>
	 *
	 */
	public void xfr_schd_no(String value) {
		setConstString(offset + 19, $xfr_schd_no, value);
	}


	/**
	 *  移動・移送元区分.<p>
	 *
	 */
	public String xfr_src_typ() {
		return getConstString(offset + 20, $xfr_src_typ);
	}

	/**
	 *  移動・移送元区分.<p>
	 *
	 */
	public void xfr_src_typ(String value) {
		setConstString(offset + 20, $xfr_src_typ, value);
	}


	/**
	 *  移動・移送元ＮＯ.<p>
	 *
	 */
	public String xfr_src_no() {
		return getConstString(offset + 21, $xfr_src_no);
	}

	/**
	 *  移動・移送元ＮＯ.<p>
	 *
	 */
	public void xfr_src_no(String value) {
		setConstString(offset + 21, $xfr_src_no, value);
	}


	/**
	 *  移動指図明細ＮＯ.<p>
	 *
	 */
	public String xfr_inst_d_no() {
		return getConstString(offset + 22, $xfr_inst_d_no);
	}

	/**
	 *  移動指図明細ＮＯ.<p>
	 *
	 */
	public void xfr_inst_d_no(String value) {
		setConstString(offset + 22, $xfr_inst_d_no, value);
	}


	/**
	 *  移動引当状況ＮＯ.<p>
	 *
	 */
	public String xfr_alloc_sts_no() {
		return getConstString(offset + 23, $xfr_alloc_sts_no);
	}

	/**
	 *  移動引当状況ＮＯ.<p>
	 *
	 */
	public void xfr_alloc_sts_no(String value) {
		setConstString(offset + 23, $xfr_alloc_sts_no, value);
	}


	/**
	 *  納品書ＮＯ.<p>
	 *
	 */
	public String dlv_slip_no() {
		return getConstString(offset + 24, $dlv_slip_no);
	}

	/**
	 *  納品書ＮＯ.<p>
	 *
	 */
	public void dlv_slip_no(String value) {
		setConstString(offset + 24, $dlv_slip_no, value);
	}


	/**
	 *  納品書明細ＮＯ.<p>
	 *
	 */
	public String dlv_slip_d_no() {
		return getConstString(offset + 25, $dlv_slip_d_no);
	}

	/**
	 *  納品書明細ＮＯ.<p>
	 *
	 */
	public void dlv_slip_d_no(String value) {
		setConstString(offset + 25, $dlv_slip_d_no, value);
	}


	/**
	 *  物流グループＣＤ.<p>
	 *
	 */
	public String lg_grp_cd() {
		return getConstString(offset + 26, $lg_grp_cd);
	}

	/**
	 *  物流グループＣＤ.<p>
	 *
	 */
	public void lg_grp_cd(String value) {
		setConstString(offset + 26, $lg_grp_cd, value);
	}


	/**
	 *  物流グループ名.<p>
	 *
	 */
	public String lg_grp_nm() {
		return getConstString(offset + 27, $lg_grp_nm);
	}

	/**
	 *  物流グループ名.<p>
	 *
	 */
	public void lg_grp_nm(String value) {
		setConstString(offset + 27, $lg_grp_nm, value);
	}


	/**
	 *  出庫場所ＣＤ.<p>
	 *
	 */
	public String gi_loc_cd() {
		return getConstString(offset + 28, $gi_loc_cd);
	}

	/**
	 *  出庫場所ＣＤ.<p>
	 *
	 */
	public void gi_loc_cd(String value) {
		setConstString(offset + 28, $gi_loc_cd, value);
	}


	/**
	 *  出庫場所名.<p>
	 *
	 */
	public String gi_loc_nm() {
		return getConstString(offset + 29, $gi_loc_nm);
	}

	/**
	 *  出庫場所名.<p>
	 *
	 */
	public void gi_loc_nm(String value) {
		setConstString(offset + 29, $gi_loc_nm, value);
	}


	/**
	 *  出庫棚・ラインＣＤ.<p>
	 *
	 */
	public String gi_str_ln_cd() {
		return getConstString(offset + 30, $gi_str_ln_cd);
	}

	/**
	 *  出庫棚・ラインＣＤ.<p>
	 *
	 */
	public void gi_str_ln_cd(String value) {
		setConstString(offset + 30, $gi_str_ln_cd, value);
	}


	/**
	 *  出庫棚・ライン名.<p>
	 *
	 */
	public String gi_str_ln_nm() {
		return getConstString(offset + 31, $gi_str_ln_nm);
	}

	/**
	 *  出庫棚・ライン名.<p>
	 *
	 */
	public void gi_str_ln_nm(String value) {
		setConstString(offset + 31, $gi_str_ln_nm, value);
	}


	/**
	 *  出庫場所ＴＥＬ.<p>
	 *
	 */
	public String gi_loc_tel() {
		return getConstString(offset + 32, $gi_loc_tel);
	}

	/**
	 *  出庫場所ＴＥＬ.<p>
	 *
	 */
	public void gi_loc_tel(String value) {
		setConstString(offset + 32, $gi_loc_tel, value);
	}


	/**
	 *  出庫場所ＦＡＸ.<p>
	 *
	 */
	public String gi_loc_fax() {
		return getConstString(offset + 33, $gi_loc_fax);
	}

	/**
	 *  出庫場所ＦＡＸ.<p>
	 *
	 */
	public void gi_loc_fax(String value) {
		setConstString(offset + 33, $gi_loc_fax, value);
	}


	/**
	 *  入庫場所ＣＤ.<p>
	 *
	 */
	public String gr_loc_cd() {
		return getConstString(offset + 34, $gr_loc_cd);
	}

	/**
	 *  入庫場所ＣＤ.<p>
	 *
	 */
	public void gr_loc_cd(String value) {
		setConstString(offset + 34, $gr_loc_cd, value);
	}


	/**
	 *  入庫場所名.<p>
	 *
	 */
	public String gr_loc_nm() {
		return getConstString(offset + 35, $gr_loc_nm);
	}

	/**
	 *  入庫場所名.<p>
	 *
	 */
	public void gr_loc_nm(String value) {
		setConstString(offset + 35, $gr_loc_nm, value);
	}


	/**
	 *  入庫棚・ラインＣＤ.<p>
	 *
	 */
	public String gr_str_ln_cd() {
		return getConstString(offset + 36, $gr_str_ln_cd);
	}

	/**
	 *  入庫棚・ラインＣＤ.<p>
	 *
	 */
	public void gr_str_ln_cd(String value) {
		setConstString(offset + 36, $gr_str_ln_cd, value);
	}


	/**
	 *  入庫棚・ライン名.<p>
	 *
	 */
	public String gr_str_ln_nm() {
		return getConstString(offset + 37, $gr_str_ln_nm);
	}

	/**
	 *  入庫棚・ライン名.<p>
	 *
	 */
	public void gr_str_ln_nm(String value) {
		setConstString(offset + 37, $gr_str_ln_nm, value);
	}


	/**
	 *  入庫場所ＴＥＬ.<p>
	 *
	 */
	public String gr_loc_tel() {
		return getConstString(offset + 38, $gr_loc_tel);
	}

	/**
	 *  入庫場所ＴＥＬ.<p>
	 *
	 */
	public void gr_loc_tel(String value) {
		setConstString(offset + 38, $gr_loc_tel, value);
	}


	/**
	 *  入庫場所ＦＡＸ.<p>
	 *
	 */
	public String gr_loc_fax() {
		return getConstString(offset + 39, $gr_loc_fax);
	}

	/**
	 *  入庫場所ＦＡＸ.<p>
	 *
	 */
	public void gr_loc_fax(String value) {
		setConstString(offset + 39, $gr_loc_fax, value);
	}


	/**
	 *  品目ＣＤ.<p>
	 *
	 */
	public String itm_cd() {
		return getConstString(offset + 40, $itm_cd);
	}

	/**
	 *  品目ＣＤ.<p>
	 *
	 */
	public void itm_cd(String value) {
		setConstString(offset + 40, $itm_cd, value);
	}


	/**
	 *  枝番１.<p>
	 *
	 */
	public String itm_sub1() {
		return getConstString(offset + 41, $itm_sub1);
	}

	/**
	 *  枝番１.<p>
	 *
	 */
	public void itm_sub1(String value) {
		setConstString(offset + 41, $itm_sub1, value);
	}


	/**
	 *  枝番２.<p>
	 *
	 */
	public String itm_sub2() {
		return getConstString(offset + 42, $itm_sub2);
	}

	/**
	 *  枝番２.<p>
	 *
	 */
	public void itm_sub2(String value) {
		setConstString(offset + 42, $itm_sub2, value);
	}


	/**
	 *  枝番３.<p>
	 *
	 */
	public String itm_sub3() {
		return getConstString(offset + 43, $itm_sub3);
	}

	/**
	 *  枝番３.<p>
	 *
	 */
	public void itm_sub3(String value) {
		setConstString(offset + 43, $itm_sub3, value);
	}


	/**
	 *  品名.<p>
	 *
	 */
	public String itm_nm() {
		return getConstString(offset + 44, $itm_nm);
	}

	/**
	 *  品名.<p>
	 *
	 */
	public void itm_nm(String value) {
		setConstString(offset + 44, $itm_nm, value);
	}


	/**
	 *  ロットＮＯ.<p>
	 *
	 */
	public String lot_no() {
		return getConstString(offset + 45, $lot_no);
	}

	/**
	 *  ロットＮＯ.<p>
	 *
	 */
	public void lot_no(String value) {
		setConstString(offset + 45, $lot_no, value);
	}


	/**
	 *  サブロットＮＯ.<p>
	 *
	 */
	public String sublot_no() {
		return getConstString(offset + 46, $sublot_no);
	}

	/**
	 *  サブロットＮＯ.<p>
	 *
	 */
	public void sublot_no(String value) {
		setConstString(offset + 46, $sublot_no, value);
	}


	/**
	 *  版ＮＯ.<p>
	 *
	 */
	public String ver_no() {
		return getConstString(offset + 47, $ver_no);
	}

	/**
	 *  版ＮＯ.<p>
	 *
	 */
	public void ver_no(String value) {
		setConstString(offset + 47, $ver_no, value);
	}


	/**
	 *  手配ＮＯ１.<p>
	 *
	 */
	public String sno1() {
		return getConstString(offset + 48, $sno1);
	}

	/**
	 *  手配ＮＯ１.<p>
	 *
	 */
	public void sno1(String value) {
		setConstString(offset + 48, $sno1, value);
	}


	/**
	 *  手配ＮＯ１無し可ＦＬＧ.<p>
	 *
	 */
	public boolean sno1_null_flg() {
		return getConstBoolean(offset + 49, $sno1_null_flg);
	}

	/**
	 *  手配ＮＯ１無し可ＦＬＧ.<p>
	 *
	 */
	public void sno1_null_flg(boolean value) {
		setConstBoolean(offset + 49, $sno1_null_flg, value);
	}


	/**
	 *  手配ＮＯ２.<p>
	 *
	 */
	public String sno2() {
		return getConstString(offset + 50, $sno2);
	}

	/**
	 *  手配ＮＯ２.<p>
	 *
	 */
	public void sno2(String value) {
		setConstString(offset + 50, $sno2, value);
	}


	/**
	 *  手配ＮＯ２無し可ＦＬＧ.<p>
	 *
	 */
	public boolean sno2_null_flg() {
		return getConstBoolean(offset + 51, $sno2_null_flg);
	}

	/**
	 *  手配ＮＯ２無し可ＦＬＧ.<p>
	 *
	 */
	public void sno2_null_flg(boolean value) {
		setConstBoolean(offset + 51, $sno2_null_flg, value);
	}


	/**
	 *  手配ＮＯ３.<p>
	 *
	 */
	public String sno3() {
		return getConstString(offset + 52, $sno3);
	}

	/**
	 *  手配ＮＯ３.<p>
	 *
	 */
	public void sno3(String value) {
		setConstString(offset + 52, $sno3, value);
	}


	/**
	 *  手配ＮＯ３無し可ＦＬＧ.<p>
	 *
	 */
	public boolean sno3_null_flg() {
		return getConstBoolean(offset + 53, $sno3_null_flg);
	}

	/**
	 *  手配ＮＯ３無し可ＦＬＧ.<p>
	 *
	 */
	public void sno3_null_flg(boolean value) {
		setConstBoolean(offset + 53, $sno3_null_flg, value);
	}


	/**
	 *  手配ＮＯ４.<p>
	 *
	 */
	public String sno4() {
		return getConstString(offset + 54, $sno4);
	}

	/**
	 *  手配ＮＯ４.<p>
	 *
	 */
	public void sno4(String value) {
		setConstString(offset + 54, $sno4, value);
	}


	/**
	 *  手配ＮＯ４無し可ＦＬＧ.<p>
	 *
	 */
	public boolean sno4_null_flg() {
		return getConstBoolean(offset + 55, $sno4_null_flg);
	}

	/**
	 *  手配ＮＯ４無し可ＦＬＧ.<p>
	 *
	 */
	public void sno4_null_flg(boolean value) {
		setConstBoolean(offset + 55, $sno4_null_flg, value);
	}


	/**
	 *  格付ＣＤ.<p>
	 *
	 */
	public String gd_cd() {
		return getConstString(offset + 56, $gd_cd);
	}

	/**
	 *  格付ＣＤ.<p>
	 *
	 */
	public void gd_cd(String value) {
		setConstString(offset + 56, $gd_cd, value);
	}


	/**
	 *  格付名.<p>
	 *
	 */
	public String gd_nm() {
		return getConstString(offset + 57, $gd_nm);
	}

	/**
	 *  格付名.<p>
	 *
	 */
	public void gd_nm(String value) {
		setConstString(offset + 57, $gd_nm, value);
	}


	/**
	 *  良品区分.<p>
	 *
	 */
	public String quality_typ() {
		return getConstString(offset + 58, $quality_typ);
	}

	/**
	 *  良品区分.<p>
	 *
	 */
	public void quality_typ(String value) {
		setConstString(offset + 58, $quality_typ, value);
	}


	/**
	 *  在庫検査区分.<p>
	 *
	 */
	public String stk_insp_typ() {
		return getConstString(offset + 59, $stk_insp_typ);
	}

	/**
	 *  在庫検査区分.<p>
	 *
	 */
	public void stk_insp_typ(String value) {
		setConstString(offset + 59, $stk_insp_typ, value);
	}


	/**
	 *  在庫識別区分.<p>
	 *
	 */
	public String stk_id_typ() {
		return getConstString(offset + 60, $stk_id_typ);
	}

	/**
	 *  在庫識別区分.<p>
	 *
	 */
	public void stk_id_typ(String value) {
		setConstString(offset + 60, $stk_id_typ, value);
	}


	/**
	 *  在庫取引先ＣＤ.<p>
	 *
	 */
	public String stk_bp_cd() {
		return getConstString(offset + 61, $stk_bp_cd);
	}

	/**
	 *  在庫取引先ＣＤ.<p>
	 *
	 */
	public void stk_bp_cd(String value) {
		setConstString(offset + 61, $stk_bp_cd, value);
	}


	/**
	 *  在庫取引先名.<p>
	 *
	 */
	public String stk_bp_nm() {
		return getConstString(offset + 62, $stk_bp_nm);
	}

	/**
	 *  在庫取引先名.<p>
	 *
	 */
	public void stk_bp_nm(String value) {
		setConstString(offset + 62, $stk_bp_nm, value);
	}


	/**
	 *  取引単位数量.<p>
	 *
	 */
	public MCNumber trd_unit_qty() {
		return getConstNumber(offset + 63, $trd_unit_qty);
	}

	/**
	 *  取引単位数量.<p>
	 *
	 */
	public void trd_unit_qty(MCNumber value) {
		setConstNumber(offset + 63, $trd_unit_qty, value);
	}

	/**
	 *  取引単位数量.<p>
	 *
	 */
	public void trd_unit_qty(int value) {
		setConstNumber(offset + 63, $trd_unit_qty, value);
	}

	/**
	 *  取引単位数量.<p>
	 *
	 */
	public void trd_unit_qty(long value) {
		setConstNumber(offset + 63, $trd_unit_qty, value);
	}

	/**
	 *  取引単位数量.<p>
	 *
	 */
	public void trd_unit_qty(float value) {
		setConstNumber(offset + 63, $trd_unit_qty, value);
	}

	/**
	 *  取引単位数量.<p>
	 *
	 */
	public void trd_unit_qty(double value) {
		setConstNumber(offset + 63, $trd_unit_qty, value);
	}


	/**
	 *  取引単位ＣＤ.<p>
	 *
	 */
	public String trd_unit_cd() {
		return getConstString(offset + 64, $trd_unit_cd);
	}

	/**
	 *  取引単位ＣＤ.<p>
	 *
	 */
	public void trd_unit_cd(String value) {
		setConstString(offset + 64, $trd_unit_cd, value);
	}


	/**
	 *  取引単位名.<p>
	 *
	 */
	public String trd_unit_nm() {
		return getConstString(offset + 65, $trd_unit_nm);
	}

	/**
	 *  取引単位名.<p>
	 *
	 */
	public void trd_unit_nm(String value) {
		setConstString(offset + 65, $trd_unit_nm, value);
	}


	/**
	 *  基準単位数量.<p>
	 *
	 */
	public MCNumber base_unit_qty() {
		return getConstNumber(offset + 66, $base_unit_qty);
	}

	/**
	 *  基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(MCNumber value) {
		setConstNumber(offset + 66, $base_unit_qty, value);
	}

	/**
	 *  基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(int value) {
		setConstNumber(offset + 66, $base_unit_qty, value);
	}

	/**
	 *  基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(long value) {
		setConstNumber(offset + 66, $base_unit_qty, value);
	}

	/**
	 *  基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(float value) {
		setConstNumber(offset + 66, $base_unit_qty, value);
	}

	/**
	 *  基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(double value) {
		setConstNumber(offset + 66, $base_unit_qty, value);
	}


	/**
	 *  基準単位ＣＤ.<p>
	 *
	 */
	public String base_unit_cd() {
		return getConstString(offset + 67, $base_unit_cd);
	}

	/**
	 *  基準単位ＣＤ.<p>
	 *
	 */
	public void base_unit_cd(String value) {
		setConstString(offset + 67, $base_unit_cd, value);
	}


	/**
	 *  基準単位名.<p>
	 *
	 */
	public String base_unit_nm() {
		return getConstString(offset + 68, $base_unit_nm);
	}

	/**
	 *  基準単位名.<p>
	 *
	 */
	public void base_unit_nm(String value) {
		setConstString(offset + 68, $base_unit_nm, value);
	}


	/**
	 *  引当済ＦＬＧ.<p>
	 *
	 */
	public boolean alloc_flg() {
		return getConstBoolean(offset + 69, $alloc_flg);
	}

	/**
	 *  引当済ＦＬＧ.<p>
	 *
	 */
	public void alloc_flg(boolean value) {
		setConstBoolean(offset + 69, $alloc_flg, value);
	}


	/**
	 *  打切ＦＬＧ.<p>
	 *
	 */
	public boolean abort_flg() {
		return getConstBoolean(offset + 70, $abort_flg);
	}

	/**
	 *  打切ＦＬＧ.<p>
	 *
	 */
	public void abort_flg(boolean value) {
		setConstBoolean(offset + 70, $abort_flg, value);
	}


	/**
	 *  有効期限.<p>
	 *
	 */
	public MCDate vld_dt() {
		return getConstDate(offset + 71, $vld_dt);
	}

	/**
	 *  有効期限.<p>
	 *
	 */
	public void vld_dt(MCDate value) {
		setConstDate(offset + 71, $vld_dt, value);
	}


	/**
	 *  使用期限.<p>
	 *
	 */
	public MCDate lmt_dt() {
		return getConstDate(offset + 72, $lmt_dt);
	}

	/**
	 *  使用期限.<p>
	 *
	 */
	public void lmt_dt(MCDate value) {
		setConstDate(offset + 72, $lmt_dt, value);
	}


	/**
	 *  最古入庫日.<p>
	 *
	 */
	public MCDate first_gr_dt() {
		return getConstDate(offset + 73, $first_gr_dt);
	}

	/**
	 *  最古入庫日.<p>
	 *
	 */
	public void first_gr_dt(MCDate value) {
		setConstDate(offset + 73, $first_gr_dt, value);
	}


	/**
	 *  支給区分.<p>
	 *
	 */
	public String prov_typ() {
		return getConstString(offset + 74, $prov_typ);
	}

	/**
	 *  支給区分.<p>
	 *
	 */
	public void prov_typ(String value) {
		setConstString(offset + 74, $prov_typ, value);
	}


	/**
	 *  支給計上区分.<p>
	 *
	 */
	public String prov_basis_typ() {
		return getConstString(offset + 75, $prov_basis_typ);
	}

	/**
	 *  支給計上区分.<p>
	 *
	 */
	public void prov_basis_typ(String value) {
		setConstString(offset + 75, $prov_basis_typ, value);
	}


	/**
	 *  支給区分（返品）.<p>
	 *
	 */
	public String ret_prov_typ() {
		return getConstString(offset + 76, $ret_prov_typ);
	}

	/**
	 *  支給区分（返品）.<p>
	 *
	 */
	public void ret_prov_typ(String value) {
		setConstString(offset + 76, $ret_prov_typ, value);
	}


	/**
	 *  支給計上区分（返品）.<p>
	 *
	 */
	public String ret_prov_basis_typ() {
		return getConstString(offset + 77, $ret_prov_basis_typ);
	}

	/**
	 *  支給計上区分（返品）.<p>
	 *
	 */
	public void ret_prov_basis_typ(String value) {
		setConstString(offset + 77, $ret_prov_basis_typ, value);
	}


	/**
	 *  理由ＣＤ.<p>
	 *
	 */
	public String rsn_cd() {
		return getConstString(offset + 78, $rsn_cd);
	}

	/**
	 *  理由ＣＤ.<p>
	 *
	 */
	public void rsn_cd(String value) {
		setConstString(offset + 78, $rsn_cd, value);
	}


	/**
	 *  理由名.<p>
	 *
	 */
	public String rsn_nm() {
		return getConstString(offset + 79, $rsn_nm);
	}

	/**
	 *  理由名.<p>
	 *
	 */
	public void rsn_nm(String value) {
		setConstString(offset + 79, $rsn_nm, value);
	}


	/**
	 *  負担部門ＣＤ.<p>
	 *
	 */
	public String bd_dpt_cd() {
		return getConstString(offset + 80, $bd_dpt_cd);
	}

	/**
	 *  負担部門ＣＤ.<p>
	 *
	 */
	public void bd_dpt_cd(String value) {
		setConstString(offset + 80, $bd_dpt_cd, value);
	}


	/**
	 *  負担部門名.<p>
	 *
	 */
	public String bd_dpt_nm() {
		return getConstString(offset + 81, $bd_dpt_nm);
	}

	/**
	 *  負担部門名.<p>
	 *
	 */
	public void bd_dpt_nm(String value) {
		setConstString(offset + 81, $bd_dpt_nm, value);
	}


	/**
	 *  指図備考.<p>
	 *
	 */
	public String inst_rmrks() {
		return getConstString(offset + 82, $inst_rmrks);
	}

	/**
	 *  指図備考.<p>
	 *
	 */
	public void inst_rmrks(String value) {
		setConstString(offset + 82, $inst_rmrks, value);
	}


	/**
	 *  指図明細備考.<p>
	 *
	 */
	public String inst_d_rmrks() {
		return getConstString(offset + 83, $inst_d_rmrks);
	}

	/**
	 *  指図明細備考.<p>
	 *
	 */
	public void inst_d_rmrks(String value) {
		setConstString(offset + 83, $inst_d_rmrks, value);
	}


	/**
	 *  予備ＣＨＡＲ項目１.<p>
	 *
	 */
	public String sub_char1() {
		return getConstString(offset + 84, $sub_char1);
	}

	/**
	 *  予備ＣＨＡＲ項目１.<p>
	 *
	 */
	public void sub_char1(String value) {
		setConstString(offset + 84, $sub_char1, value);
	}


	/**
	 *  予備ＣＨＡＲ項目２.<p>
	 *
	 */
	public String sub_char2() {
		return getConstString(offset + 85, $sub_char2);
	}

	/**
	 *  予備ＣＨＡＲ項目２.<p>
	 *
	 */
	public void sub_char2(String value) {
		setConstString(offset + 85, $sub_char2, value);
	}


	/**
	 *  予備ＣＨＡＲ項目３.<p>
	 *
	 */
	public String sub_char3() {
		return getConstString(offset + 86, $sub_char3);
	}

	/**
	 *  予備ＣＨＡＲ項目３.<p>
	 *
	 */
	public void sub_char3(String value) {
		setConstString(offset + 86, $sub_char3, value);
	}


	/**
	 *  予備ＣＨＡＲ項目４.<p>
	 *
	 */
	public String sub_char4() {
		return getConstString(offset + 87, $sub_char4);
	}

	/**
	 *  予備ＣＨＡＲ項目４.<p>
	 *
	 */
	public void sub_char4(String value) {
		setConstString(offset + 87, $sub_char4, value);
	}


	/**
	 *  予備ＣＨＡＲ項目５.<p>
	 *
	 */
	public String sub_char5() {
		return getConstString(offset + 88, $sub_char5);
	}

	/**
	 *  予備ＣＨＡＲ項目５.<p>
	 *
	 */
	public void sub_char5(String value) {
		setConstString(offset + 88, $sub_char5, value);
	}


	/**
	 *  予備ＣＨＡＲ項目６.<p>
	 *
	 */
	public String sub_char6() {
		return getConstString(offset + 89, $sub_char6);
	}

	/**
	 *  予備ＣＨＡＲ項目６.<p>
	 *
	 */
	public void sub_char6(String value) {
		setConstString(offset + 89, $sub_char6, value);
	}


	/**
	 *  予備ＣＨＡＲ項目７.<p>
	 *
	 */
	public String sub_char7() {
		return getConstString(offset + 90, $sub_char7);
	}

	/**
	 *  予備ＣＨＡＲ項目７.<p>
	 *
	 */
	public void sub_char7(String value) {
		setConstString(offset + 90, $sub_char7, value);
	}


	/**
	 *  予備ＣＨＡＲ項目８.<p>
	 *
	 */
	public String sub_char8() {
		return getConstString(offset + 91, $sub_char8);
	}

	/**
	 *  予備ＣＨＡＲ項目８.<p>
	 *
	 */
	public void sub_char8(String value) {
		setConstString(offset + 91, $sub_char8, value);
	}


	/**
	 *  予備ＣＨＡＲ項目９.<p>
	 *
	 */
	public String sub_char9() {
		return getConstString(offset + 92, $sub_char9);
	}

	/**
	 *  予備ＣＨＡＲ項目９.<p>
	 *
	 */
	public void sub_char9(String value) {
		setConstString(offset + 92, $sub_char9, value);
	}


	/**
	 *  予備ＣＨＡＲ項目１０.<p>
	 *
	 */
	public String sub_char10() {
		return getConstString(offset + 93, $sub_char10);
	}

	/**
	 *  予備ＣＨＡＲ項目１０.<p>
	 *
	 */
	public void sub_char10(String value) {
		setConstString(offset + 93, $sub_char10, value);
	}


	/**
	 *  予備ＣＨＡＲ項目１１.<p>
	 *
	 */
	public String sub_char11() {
		return getConstString(offset + 94, $sub_char11);
	}

	/**
	 *  予備ＣＨＡＲ項目１１.<p>
	 *
	 */
	public void sub_char11(String value) {
		setConstString(offset + 94, $sub_char11, value);
	}


	/**
	 *  予備ＣＨＡＲ項目１２.<p>
	 *
	 */
	public String sub_char12() {
		return getConstString(offset + 95, $sub_char12);
	}

	/**
	 *  予備ＣＨＡＲ項目１２.<p>
	 *
	 */
	public void sub_char12(String value) {
		setConstString(offset + 95, $sub_char12, value);
	}


	/**
	 *  予備ＣＨＡＲ項目１３.<p>
	 *
	 */
	public String sub_char13() {
		return getConstString(offset + 96, $sub_char13);
	}

	/**
	 *  予備ＣＨＡＲ項目１３.<p>
	 *
	 */
	public void sub_char13(String value) {
		setConstString(offset + 96, $sub_char13, value);
	}


	/**
	 *  予備ＣＨＡＲ項目１４.<p>
	 *
	 */
	public String sub_char14() {
		return getConstString(offset + 97, $sub_char14);
	}

	/**
	 *  予備ＣＨＡＲ項目１４.<p>
	 *
	 */
	public void sub_char14(String value) {
		setConstString(offset + 97, $sub_char14, value);
	}


	/**
	 *  予備ＣＨＡＲ項目１５.<p>
	 *
	 */
	public String sub_char15() {
		return getConstString(offset + 98, $sub_char15);
	}

	/**
	 *  予備ＣＨＡＲ項目１５.<p>
	 *
	 */
	public void sub_char15(String value) {
		setConstString(offset + 98, $sub_char15, value);
	}


	/**
	 *  予備ＣＨＡＲ項目１６.<p>
	 *
	 */
	public String sub_char16() {
		return getConstString(offset + 99, $sub_char16);
	}

	/**
	 *  予備ＣＨＡＲ項目１６.<p>
	 *
	 */
	public void sub_char16(String value) {
		setConstString(offset + 99, $sub_char16, value);
	}


	/**
	 *  予備ＣＨＡＲ項目１７.<p>
	 *
	 */
	public String sub_char17() {
		return getConstString(offset + 100, $sub_char17);
	}

	/**
	 *  予備ＣＨＡＲ項目１７.<p>
	 *
	 */
	public void sub_char17(String value) {
		setConstString(offset + 100, $sub_char17, value);
	}


	/**
	 *  予備ＣＨＡＲ項目１８.<p>
	 *
	 */
	public String sub_char18() {
		return getConstString(offset + 101, $sub_char18);
	}

	/**
	 *  予備ＣＨＡＲ項目１８.<p>
	 *
	 */
	public void sub_char18(String value) {
		setConstString(offset + 101, $sub_char18, value);
	}


	/**
	 *  予備ＣＨＡＲ項目１９.<p>
	 *
	 */
	public String sub_char19() {
		return getConstString(offset + 102, $sub_char19);
	}

	/**
	 *  予備ＣＨＡＲ項目１９.<p>
	 *
	 */
	public void sub_char19(String value) {
		setConstString(offset + 102, $sub_char19, value);
	}


	/**
	 *  予備ＣＨＡＲ項目２０.<p>
	 *
	 */
	public String sub_char20() {
		return getConstString(offset + 103, $sub_char20);
	}

	/**
	 *  予備ＣＨＡＲ項目２０.<p>
	 *
	 */
	public void sub_char20(String value) {
		setConstString(offset + 103, $sub_char20, value);
	}


	/**
	 *  予備ＣＨＡＲ項目２１.<p>
	 *
	 */
	public String sub_char21() {
		return getConstString(offset + 104, $sub_char21);
	}

	/**
	 *  予備ＣＨＡＲ項目２１.<p>
	 *
	 */
	public void sub_char21(String value) {
		setConstString(offset + 104, $sub_char21, value);
	}


	/**
	 *  予備ＣＨＡＲ項目２２.<p>
	 *
	 */
	public String sub_char22() {
		return getConstString(offset + 105, $sub_char22);
	}

	/**
	 *  予備ＣＨＡＲ項目２２.<p>
	 *
	 */
	public void sub_char22(String value) {
		setConstString(offset + 105, $sub_char22, value);
	}


	/**
	 *  予備ＣＨＡＲ項目２３.<p>
	 *
	 */
	public String sub_char23() {
		return getConstString(offset + 106, $sub_char23);
	}

	/**
	 *  予備ＣＨＡＲ項目２３.<p>
	 *
	 */
	public void sub_char23(String value) {
		setConstString(offset + 106, $sub_char23, value);
	}


	/**
	 *  予備ＣＨＡＲ項目２４.<p>
	 *
	 */
	public String sub_char24() {
		return getConstString(offset + 107, $sub_char24);
	}

	/**
	 *  予備ＣＨＡＲ項目２４.<p>
	 *
	 */
	public void sub_char24(String value) {
		setConstString(offset + 107, $sub_char24, value);
	}


	/**
	 *  予備ＣＨＡＲ項目２５.<p>
	 *
	 */
	public String sub_char25() {
		return getConstString(offset + 108, $sub_char25);
	}

	/**
	 *  予備ＣＨＡＲ項目２５.<p>
	 *
	 */
	public void sub_char25(String value) {
		setConstString(offset + 108, $sub_char25, value);
	}


	/**
	 *  予備ＣＨＡＲ項目２６.<p>
	 *
	 */
	public String sub_char26() {
		return getConstString(offset + 109, $sub_char26);
	}

	/**
	 *  予備ＣＨＡＲ項目２６.<p>
	 *
	 */
	public void sub_char26(String value) {
		setConstString(offset + 109, $sub_char26, value);
	}


	/**
	 *  予備ＣＨＡＲ項目２７.<p>
	 *
	 */
	public String sub_char27() {
		return getConstString(offset + 110, $sub_char27);
	}

	/**
	 *  予備ＣＨＡＲ項目２７.<p>
	 *
	 */
	public void sub_char27(String value) {
		setConstString(offset + 110, $sub_char27, value);
	}


	/**
	 *  予備ＣＨＡＲ項目２８.<p>
	 *
	 */
	public String sub_char28() {
		return getConstString(offset + 111, $sub_char28);
	}

	/**
	 *  予備ＣＨＡＲ項目２８.<p>
	 *
	 */
	public void sub_char28(String value) {
		setConstString(offset + 111, $sub_char28, value);
	}


	/**
	 *  予備ＣＨＡＲ項目２９.<p>
	 *
	 */
	public String sub_char29() {
		return getConstString(offset + 112, $sub_char29);
	}

	/**
	 *  予備ＣＨＡＲ項目２９.<p>
	 *
	 */
	public void sub_char29(String value) {
		setConstString(offset + 112, $sub_char29, value);
	}


	/**
	 *  予備ＣＨＡＲ項目３０.<p>
	 *
	 */
	public String sub_char30() {
		return getConstString(offset + 113, $sub_char30);
	}

	/**
	 *  予備ＣＨＡＲ項目３０.<p>
	 *
	 */
	public void sub_char30(String value) {
		setConstString(offset + 113, $sub_char30, value);
	}


	/**
	 *  予備ＮＵＭ項目１.<p>
	 *
	 */
	public MCNumber sub_num1() {
		return getConstNumber(offset + 114, $sub_num1);
	}

	/**
	 *  予備ＮＵＭ項目１.<p>
	 *
	 */
	public void sub_num1(MCNumber value) {
		setConstNumber(offset + 114, $sub_num1, value);
	}

	/**
	 *  予備ＮＵＭ項目１.<p>
	 *
	 */
	public void sub_num1(int value) {
		setConstNumber(offset + 114, $sub_num1, value);
	}

	/**
	 *  予備ＮＵＭ項目１.<p>
	 *
	 */
	public void sub_num1(long value) {
		setConstNumber(offset + 114, $sub_num1, value);
	}

	/**
	 *  予備ＮＵＭ項目１.<p>
	 *
	 */
	public void sub_num1(float value) {
		setConstNumber(offset + 114, $sub_num1, value);
	}

	/**
	 *  予備ＮＵＭ項目１.<p>
	 *
	 */
	public void sub_num1(double value) {
		setConstNumber(offset + 114, $sub_num1, value);
	}


	/**
	 *  予備ＮＵＭ項目２.<p>
	 *
	 */
	public MCNumber sub_num2() {
		return getConstNumber(offset + 115, $sub_num2);
	}

	/**
	 *  予備ＮＵＭ項目２.<p>
	 *
	 */
	public void sub_num2(MCNumber value) {
		setConstNumber(offset + 115, $sub_num2, value);
	}

	/**
	 *  予備ＮＵＭ項目２.<p>
	 *
	 */
	public void sub_num2(int value) {
		setConstNumber(offset + 115, $sub_num2, value);
	}

	/**
	 *  予備ＮＵＭ項目２.<p>
	 *
	 */
	public void sub_num2(long value) {
		setConstNumber(offset + 115, $sub_num2, value);
	}

	/**
	 *  予備ＮＵＭ項目２.<p>
	 *
	 */
	public void sub_num2(float value) {
		setConstNumber(offset + 115, $sub_num2, value);
	}

	/**
	 *  予備ＮＵＭ項目２.<p>
	 *
	 */
	public void sub_num2(double value) {
		setConstNumber(offset + 115, $sub_num2, value);
	}


	/**
	 *  予備ＮＵＭ項目３.<p>
	 *
	 */
	public MCNumber sub_num3() {
		return getConstNumber(offset + 116, $sub_num3);
	}

	/**
	 *  予備ＮＵＭ項目３.<p>
	 *
	 */
	public void sub_num3(MCNumber value) {
		setConstNumber(offset + 116, $sub_num3, value);
	}

	/**
	 *  予備ＮＵＭ項目３.<p>
	 *
	 */
	public void sub_num3(int value) {
		setConstNumber(offset + 116, $sub_num3, value);
	}

	/**
	 *  予備ＮＵＭ項目３.<p>
	 *
	 */
	public void sub_num3(long value) {
		setConstNumber(offset + 116, $sub_num3, value);
	}

	/**
	 *  予備ＮＵＭ項目３.<p>
	 *
	 */
	public void sub_num3(float value) {
		setConstNumber(offset + 116, $sub_num3, value);
	}

	/**
	 *  予備ＮＵＭ項目３.<p>
	 *
	 */
	public void sub_num3(double value) {
		setConstNumber(offset + 116, $sub_num3, value);
	}


	/**
	 *  予備ＮＵＭ項目４.<p>
	 *
	 */
	public MCNumber sub_num4() {
		return getConstNumber(offset + 117, $sub_num4);
	}

	/**
	 *  予備ＮＵＭ項目４.<p>
	 *
	 */
	public void sub_num4(MCNumber value) {
		setConstNumber(offset + 117, $sub_num4, value);
	}

	/**
	 *  予備ＮＵＭ項目４.<p>
	 *
	 */
	public void sub_num4(int value) {
		setConstNumber(offset + 117, $sub_num4, value);
	}

	/**
	 *  予備ＮＵＭ項目４.<p>
	 *
	 */
	public void sub_num4(long value) {
		setConstNumber(offset + 117, $sub_num4, value);
	}

	/**
	 *  予備ＮＵＭ項目４.<p>
	 *
	 */
	public void sub_num4(float value) {
		setConstNumber(offset + 117, $sub_num4, value);
	}

	/**
	 *  予備ＮＵＭ項目４.<p>
	 *
	 */
	public void sub_num4(double value) {
		setConstNumber(offset + 117, $sub_num4, value);
	}


	/**
	 *  予備ＮＵＭ項目５.<p>
	 *
	 */
	public MCNumber sub_num5() {
		return getConstNumber(offset + 118, $sub_num5);
	}

	/**
	 *  予備ＮＵＭ項目５.<p>
	 *
	 */
	public void sub_num5(MCNumber value) {
		setConstNumber(offset + 118, $sub_num5, value);
	}

	/**
	 *  予備ＮＵＭ項目５.<p>
	 *
	 */
	public void sub_num5(int value) {
		setConstNumber(offset + 118, $sub_num5, value);
	}

	/**
	 *  予備ＮＵＭ項目５.<p>
	 *
	 */
	public void sub_num5(long value) {
		setConstNumber(offset + 118, $sub_num5, value);
	}

	/**
	 *  予備ＮＵＭ項目５.<p>
	 *
	 */
	public void sub_num5(float value) {
		setConstNumber(offset + 118, $sub_num5, value);
	}

	/**
	 *  予備ＮＵＭ項目５.<p>
	 *
	 */
	public void sub_num5(double value) {
		setConstNumber(offset + 118, $sub_num5, value);
	}


	/**
	 *  予備ＤＡＴＥ項目１.<p>
	 *
	 */
	public MCDate sub_dt1() {
		return getConstDate(offset + 119, $sub_dt1);
	}

	/**
	 *  予備ＤＡＴＥ項目１.<p>
	 *
	 */
	public void sub_dt1(MCDate value) {
		setConstDate(offset + 119, $sub_dt1, value);
	}


	/**
	 *  予備ＤＡＴＥ項目２.<p>
	 *
	 */
	public MCDate sub_dt2() {
		return getConstDate(offset + 120, $sub_dt2);
	}

	/**
	 *  予備ＤＡＴＥ項目２.<p>
	 *
	 */
	public void sub_dt2(MCDate value) {
		setConstDate(offset + 120, $sub_dt2, value);
	}


	/**
	 *  予備ＤＡＴＥ項目３.<p>
	 *
	 */
	public MCDate sub_dt3() {
		return getConstDate(offset + 121, $sub_dt3);
	}

	/**
	 *  予備ＤＡＴＥ項目３.<p>
	 *
	 */
	public void sub_dt3(MCDate value) {
		setConstDate(offset + 121, $sub_dt3, value);
	}


	/**
	 *  予備ＤＡＴＥ項目４.<p>
	 *
	 */
	public MCDate sub_dt4() {
		return getConstDate(offset + 122, $sub_dt4);
	}

	/**
	 *  予備ＤＡＴＥ項目４.<p>
	 *
	 */
	public void sub_dt4(MCDate value) {
		setConstDate(offset + 122, $sub_dt4, value);
	}


	/**
	 *  予備ＤＡＴＥ項目５.<p>
	 *
	 */
	public MCDate sub_dt5() {
		return getConstDate(offset + 123, $sub_dt5);
	}

	/**
	 *  予備ＤＡＴＥ項目５.<p>
	 *
	 */
	public void sub_dt5(MCDate value) {
		setConstDate(offset + 123, $sub_dt5, value);
	}


	public String getString(String name) {
		if ($trd_typ_cd.equalsIgnoreCase(name)) {
			return trd_typ_cd();
		}
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			return data_crud_typ();
		}
		if ($dpstr_cd.equalsIgnoreCase(name)) {
			return dpstr_cd();
		}
		if ($dpstr_nm.equalsIgnoreCase(name)) {
			return dpstr_nm();
		}
		if ($site_co_cd.equalsIgnoreCase(name)) {
			return site_co_cd();
		}
		if ($site_co_nm.equalsIgnoreCase(name)) {
			return site_co_nm();
		}
		if ($xfr_inst_no.equalsIgnoreCase(name)) {
			return xfr_inst_no();
		}
		if ($trd_cd.equalsIgnoreCase(name)) {
			return trd_cd();
		}
		if ($trd_nm.equalsIgnoreCase(name)) {
			return trd_nm();
		}
		if ($trd_ptn_typ.equalsIgnoreCase(name)) {
			return trd_ptn_typ();
		}
		if ($inst_dpt_cd.equalsIgnoreCase(name)) {
			return inst_dpt_cd();
		}
		if ($inst_dpt_nm.equalsIgnoreCase(name)) {
			return inst_dpt_nm();
		}
		if ($inst_usr_cd.equalsIgnoreCase(name)) {
			return inst_usr_cd();
		}
		if ($inst_usr_nm.equalsIgnoreCase(name)) {
			return inst_usr_nm();
		}
		if ($xfr_schd_no.equalsIgnoreCase(name)) {
			return xfr_schd_no();
		}
		if ($xfr_src_typ.equalsIgnoreCase(name)) {
			return xfr_src_typ();
		}
		if ($xfr_src_no.equalsIgnoreCase(name)) {
			return xfr_src_no();
		}
		if ($xfr_inst_d_no.equalsIgnoreCase(name)) {
			return xfr_inst_d_no();
		}
		if ($xfr_alloc_sts_no.equalsIgnoreCase(name)) {
			return xfr_alloc_sts_no();
		}
		if ($dlv_slip_no.equalsIgnoreCase(name)) {
			return dlv_slip_no();
		}
		if ($dlv_slip_d_no.equalsIgnoreCase(name)) {
			return dlv_slip_d_no();
		}
		if ($lg_grp_cd.equalsIgnoreCase(name)) {
			return lg_grp_cd();
		}
		if ($lg_grp_nm.equalsIgnoreCase(name)) {
			return lg_grp_nm();
		}
		if ($gi_loc_cd.equalsIgnoreCase(name)) {
			return gi_loc_cd();
		}
		if ($gi_loc_nm.equalsIgnoreCase(name)) {
			return gi_loc_nm();
		}
		if ($gi_str_ln_cd.equalsIgnoreCase(name)) {
			return gi_str_ln_cd();
		}
		if ($gi_str_ln_nm.equalsIgnoreCase(name)) {
			return gi_str_ln_nm();
		}
		if ($gi_loc_tel.equalsIgnoreCase(name)) {
			return gi_loc_tel();
		}
		if ($gi_loc_fax.equalsIgnoreCase(name)) {
			return gi_loc_fax();
		}
		if ($gr_loc_cd.equalsIgnoreCase(name)) {
			return gr_loc_cd();
		}
		if ($gr_loc_nm.equalsIgnoreCase(name)) {
			return gr_loc_nm();
		}
		if ($gr_str_ln_cd.equalsIgnoreCase(name)) {
			return gr_str_ln_cd();
		}
		if ($gr_str_ln_nm.equalsIgnoreCase(name)) {
			return gr_str_ln_nm();
		}
		if ($gr_loc_tel.equalsIgnoreCase(name)) {
			return gr_loc_tel();
		}
		if ($gr_loc_fax.equalsIgnoreCase(name)) {
			return gr_loc_fax();
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
		if ($lot_no.equalsIgnoreCase(name)) {
			return lot_no();
		}
		if ($sublot_no.equalsIgnoreCase(name)) {
			return sublot_no();
		}
		if ($ver_no.equalsIgnoreCase(name)) {
			return ver_no();
		}
		if ($sno1.equalsIgnoreCase(name)) {
			return sno1();
		}
		if ($sno2.equalsIgnoreCase(name)) {
			return sno2();
		}
		if ($sno3.equalsIgnoreCase(name)) {
			return sno3();
		}
		if ($sno4.equalsIgnoreCase(name)) {
			return sno4();
		}
		if ($gd_cd.equalsIgnoreCase(name)) {
			return gd_cd();
		}
		if ($gd_nm.equalsIgnoreCase(name)) {
			return gd_nm();
		}
		if ($quality_typ.equalsIgnoreCase(name)) {
			return quality_typ();
		}
		if ($stk_insp_typ.equalsIgnoreCase(name)) {
			return stk_insp_typ();
		}
		if ($stk_id_typ.equalsIgnoreCase(name)) {
			return stk_id_typ();
		}
		if ($stk_bp_cd.equalsIgnoreCase(name)) {
			return stk_bp_cd();
		}
		if ($stk_bp_nm.equalsIgnoreCase(name)) {
			return stk_bp_nm();
		}
		if ($trd_unit_cd.equalsIgnoreCase(name)) {
			return trd_unit_cd();
		}
		if ($trd_unit_nm.equalsIgnoreCase(name)) {
			return trd_unit_nm();
		}
		if ($base_unit_cd.equalsIgnoreCase(name)) {
			return base_unit_cd();
		}
		if ($base_unit_nm.equalsIgnoreCase(name)) {
			return base_unit_nm();
		}
		if ($prov_typ.equalsIgnoreCase(name)) {
			return prov_typ();
		}
		if ($prov_basis_typ.equalsIgnoreCase(name)) {
			return prov_basis_typ();
		}
		if ($ret_prov_typ.equalsIgnoreCase(name)) {
			return ret_prov_typ();
		}
		if ($ret_prov_basis_typ.equalsIgnoreCase(name)) {
			return ret_prov_basis_typ();
		}
		if ($rsn_cd.equalsIgnoreCase(name)) {
			return rsn_cd();
		}
		if ($rsn_nm.equalsIgnoreCase(name)) {
			return rsn_nm();
		}
		if ($bd_dpt_cd.equalsIgnoreCase(name)) {
			return bd_dpt_cd();
		}
		if ($bd_dpt_nm.equalsIgnoreCase(name)) {
			return bd_dpt_nm();
		}
		if ($inst_rmrks.equalsIgnoreCase(name)) {
			return inst_rmrks();
		}
		if ($inst_d_rmrks.equalsIgnoreCase(name)) {
			return inst_d_rmrks();
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
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			return trd_unit_qty();
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			return base_unit_qty();
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
		if ($xfr_schd_dt.equalsIgnoreCase(name)) {
			return xfr_schd_dt();
		}
		if ($xfr_inst_dt.equalsIgnoreCase(name)) {
			return xfr_inst_dt();
		}
		if ($vld_dt.equalsIgnoreCase(name)) {
			return vld_dt();
		}
		if ($lmt_dt.equalsIgnoreCase(name)) {
			return lmt_dt();
		}
		if ($first_gr_dt.equalsIgnoreCase(name)) {
			return first_gr_dt();
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
		if ($sno1_null_flg.equalsIgnoreCase(name)) {
			return sno1_null_flg();
		}
		if ($sno2_null_flg.equalsIgnoreCase(name)) {
			return sno2_null_flg();
		}
		if ($sno3_null_flg.equalsIgnoreCase(name)) {
			return sno3_null_flg();
		}
		if ($sno4_null_flg.equalsIgnoreCase(name)) {
			return sno4_null_flg();
		}
		if ($alloc_flg.equalsIgnoreCase(name)) {
			return alloc_flg();
		}
		if ($abort_flg.equalsIgnoreCase(name)) {
			return abort_flg();
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
		if ($dpstr_cd.equalsIgnoreCase(name)) {
			return dpstr_cd();
		}
		if ($dpstr_nm.equalsIgnoreCase(name)) {
			return dpstr_nm();
		}
		if ($site_co_cd.equalsIgnoreCase(name)) {
			return site_co_cd();
		}
		if ($site_co_nm.equalsIgnoreCase(name)) {
			return site_co_nm();
		}
		if ($xfr_inst_no.equalsIgnoreCase(name)) {
			return xfr_inst_no();
		}
		if ($trd_cd.equalsIgnoreCase(name)) {
			return trd_cd();
		}
		if ($trd_nm.equalsIgnoreCase(name)) {
			return trd_nm();
		}
		if ($trd_ptn_typ.equalsIgnoreCase(name)) {
			return trd_ptn_typ();
		}
		if ($inst_dpt_cd.equalsIgnoreCase(name)) {
			return inst_dpt_cd();
		}
		if ($inst_dpt_nm.equalsIgnoreCase(name)) {
			return inst_dpt_nm();
		}
		if ($inst_usr_cd.equalsIgnoreCase(name)) {
			return inst_usr_cd();
		}
		if ($inst_usr_nm.equalsIgnoreCase(name)) {
			return inst_usr_nm();
		}
		if ($xfr_schd_no.equalsIgnoreCase(name)) {
			return xfr_schd_no();
		}
		if ($xfr_src_typ.equalsIgnoreCase(name)) {
			return xfr_src_typ();
		}
		if ($xfr_src_no.equalsIgnoreCase(name)) {
			return xfr_src_no();
		}
		if ($xfr_inst_d_no.equalsIgnoreCase(name)) {
			return xfr_inst_d_no();
		}
		if ($xfr_alloc_sts_no.equalsIgnoreCase(name)) {
			return xfr_alloc_sts_no();
		}
		if ($dlv_slip_no.equalsIgnoreCase(name)) {
			return dlv_slip_no();
		}
		if ($dlv_slip_d_no.equalsIgnoreCase(name)) {
			return dlv_slip_d_no();
		}
		if ($lg_grp_cd.equalsIgnoreCase(name)) {
			return lg_grp_cd();
		}
		if ($lg_grp_nm.equalsIgnoreCase(name)) {
			return lg_grp_nm();
		}
		if ($gi_loc_cd.equalsIgnoreCase(name)) {
			return gi_loc_cd();
		}
		if ($gi_loc_nm.equalsIgnoreCase(name)) {
			return gi_loc_nm();
		}
		if ($gi_str_ln_cd.equalsIgnoreCase(name)) {
			return gi_str_ln_cd();
		}
		if ($gi_str_ln_nm.equalsIgnoreCase(name)) {
			return gi_str_ln_nm();
		}
		if ($gi_loc_tel.equalsIgnoreCase(name)) {
			return gi_loc_tel();
		}
		if ($gi_loc_fax.equalsIgnoreCase(name)) {
			return gi_loc_fax();
		}
		if ($gr_loc_cd.equalsIgnoreCase(name)) {
			return gr_loc_cd();
		}
		if ($gr_loc_nm.equalsIgnoreCase(name)) {
			return gr_loc_nm();
		}
		if ($gr_str_ln_cd.equalsIgnoreCase(name)) {
			return gr_str_ln_cd();
		}
		if ($gr_str_ln_nm.equalsIgnoreCase(name)) {
			return gr_str_ln_nm();
		}
		if ($gr_loc_tel.equalsIgnoreCase(name)) {
			return gr_loc_tel();
		}
		if ($gr_loc_fax.equalsIgnoreCase(name)) {
			return gr_loc_fax();
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
		if ($lot_no.equalsIgnoreCase(name)) {
			return lot_no();
		}
		if ($sublot_no.equalsIgnoreCase(name)) {
			return sublot_no();
		}
		if ($ver_no.equalsIgnoreCase(name)) {
			return ver_no();
		}
		if ($sno1.equalsIgnoreCase(name)) {
			return sno1();
		}
		if ($sno2.equalsIgnoreCase(name)) {
			return sno2();
		}
		if ($sno3.equalsIgnoreCase(name)) {
			return sno3();
		}
		if ($sno4.equalsIgnoreCase(name)) {
			return sno4();
		}
		if ($gd_cd.equalsIgnoreCase(name)) {
			return gd_cd();
		}
		if ($gd_nm.equalsIgnoreCase(name)) {
			return gd_nm();
		}
		if ($quality_typ.equalsIgnoreCase(name)) {
			return quality_typ();
		}
		if ($stk_insp_typ.equalsIgnoreCase(name)) {
			return stk_insp_typ();
		}
		if ($stk_id_typ.equalsIgnoreCase(name)) {
			return stk_id_typ();
		}
		if ($stk_bp_cd.equalsIgnoreCase(name)) {
			return stk_bp_cd();
		}
		if ($stk_bp_nm.equalsIgnoreCase(name)) {
			return stk_bp_nm();
		}
		if ($trd_unit_cd.equalsIgnoreCase(name)) {
			return trd_unit_cd();
		}
		if ($trd_unit_nm.equalsIgnoreCase(name)) {
			return trd_unit_nm();
		}
		if ($base_unit_cd.equalsIgnoreCase(name)) {
			return base_unit_cd();
		}
		if ($base_unit_nm.equalsIgnoreCase(name)) {
			return base_unit_nm();
		}
		if ($prov_typ.equalsIgnoreCase(name)) {
			return prov_typ();
		}
		if ($prov_basis_typ.equalsIgnoreCase(name)) {
			return prov_basis_typ();
		}
		if ($ret_prov_typ.equalsIgnoreCase(name)) {
			return ret_prov_typ();
		}
		if ($ret_prov_basis_typ.equalsIgnoreCase(name)) {
			return ret_prov_basis_typ();
		}
		if ($rsn_cd.equalsIgnoreCase(name)) {
			return rsn_cd();
		}
		if ($rsn_nm.equalsIgnoreCase(name)) {
			return rsn_nm();
		}
		if ($bd_dpt_cd.equalsIgnoreCase(name)) {
			return bd_dpt_cd();
		}
		if ($bd_dpt_nm.equalsIgnoreCase(name)) {
			return bd_dpt_nm();
		}
		if ($inst_rmrks.equalsIgnoreCase(name)) {
			return inst_rmrks();
		}
		if ($inst_d_rmrks.equalsIgnoreCase(name)) {
			return inst_d_rmrks();
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
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			return trd_unit_qty();
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			return base_unit_qty();
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
		if ($xfr_schd_dt.equalsIgnoreCase(name)) {
			return xfr_schd_dt();
		}
		if ($xfr_inst_dt.equalsIgnoreCase(name)) {
			return xfr_inst_dt();
		}
		if ($vld_dt.equalsIgnoreCase(name)) {
			return vld_dt();
		}
		if ($lmt_dt.equalsIgnoreCase(name)) {
			return lmt_dt();
		}
		if ($first_gr_dt.equalsIgnoreCase(name)) {
			return first_gr_dt();
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
		if ($sno1_null_flg.equalsIgnoreCase(name)) {
			return sno1_null_flg();
		}
		if ($sno2_null_flg.equalsIgnoreCase(name)) {
			return sno2_null_flg();
		}
		if ($sno3_null_flg.equalsIgnoreCase(name)) {
			return sno3_null_flg();
		}
		if ($sno4_null_flg.equalsIgnoreCase(name)) {
			return sno4_null_flg();
		}
		if ($alloc_flg.equalsIgnoreCase(name)) {
			return alloc_flg();
		}
		if ($abort_flg.equalsIgnoreCase(name)) {
			return abort_flg();
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
		if ($dpstr_cd.equalsIgnoreCase(name)) {
			dpstr_cd(value);
			return;
		}
		if ($dpstr_nm.equalsIgnoreCase(name)) {
			dpstr_nm(value);
			return;
		}
		if ($site_co_cd.equalsIgnoreCase(name)) {
			site_co_cd(value);
			return;
		}
		if ($site_co_nm.equalsIgnoreCase(name)) {
			site_co_nm(value);
			return;
		}
		if ($xfr_inst_no.equalsIgnoreCase(name)) {
			xfr_inst_no(value);
			return;
		}
		if ($trd_cd.equalsIgnoreCase(name)) {
			trd_cd(value);
			return;
		}
		if ($trd_nm.equalsIgnoreCase(name)) {
			trd_nm(value);
			return;
		}
		if ($trd_ptn_typ.equalsIgnoreCase(name)) {
			trd_ptn_typ(value);
			return;
		}
		if ($inst_dpt_cd.equalsIgnoreCase(name)) {
			inst_dpt_cd(value);
			return;
		}
		if ($inst_dpt_nm.equalsIgnoreCase(name)) {
			inst_dpt_nm(value);
			return;
		}
		if ($inst_usr_cd.equalsIgnoreCase(name)) {
			inst_usr_cd(value);
			return;
		}
		if ($inst_usr_nm.equalsIgnoreCase(name)) {
			inst_usr_nm(value);
			return;
		}
		if ($xfr_schd_no.equalsIgnoreCase(name)) {
			xfr_schd_no(value);
			return;
		}
		if ($xfr_src_typ.equalsIgnoreCase(name)) {
			xfr_src_typ(value);
			return;
		}
		if ($xfr_src_no.equalsIgnoreCase(name)) {
			xfr_src_no(value);
			return;
		}
		if ($xfr_inst_d_no.equalsIgnoreCase(name)) {
			xfr_inst_d_no(value);
			return;
		}
		if ($xfr_alloc_sts_no.equalsIgnoreCase(name)) {
			xfr_alloc_sts_no(value);
			return;
		}
		if ($dlv_slip_no.equalsIgnoreCase(name)) {
			dlv_slip_no(value);
			return;
		}
		if ($dlv_slip_d_no.equalsIgnoreCase(name)) {
			dlv_slip_d_no(value);
			return;
		}
		if ($lg_grp_cd.equalsIgnoreCase(name)) {
			lg_grp_cd(value);
			return;
		}
		if ($lg_grp_nm.equalsIgnoreCase(name)) {
			lg_grp_nm(value);
			return;
		}
		if ($gi_loc_cd.equalsIgnoreCase(name)) {
			gi_loc_cd(value);
			return;
		}
		if ($gi_loc_nm.equalsIgnoreCase(name)) {
			gi_loc_nm(value);
			return;
		}
		if ($gi_str_ln_cd.equalsIgnoreCase(name)) {
			gi_str_ln_cd(value);
			return;
		}
		if ($gi_str_ln_nm.equalsIgnoreCase(name)) {
			gi_str_ln_nm(value);
			return;
		}
		if ($gi_loc_tel.equalsIgnoreCase(name)) {
			gi_loc_tel(value);
			return;
		}
		if ($gi_loc_fax.equalsIgnoreCase(name)) {
			gi_loc_fax(value);
			return;
		}
		if ($gr_loc_cd.equalsIgnoreCase(name)) {
			gr_loc_cd(value);
			return;
		}
		if ($gr_loc_nm.equalsIgnoreCase(name)) {
			gr_loc_nm(value);
			return;
		}
		if ($gr_str_ln_cd.equalsIgnoreCase(name)) {
			gr_str_ln_cd(value);
			return;
		}
		if ($gr_str_ln_nm.equalsIgnoreCase(name)) {
			gr_str_ln_nm(value);
			return;
		}
		if ($gr_loc_tel.equalsIgnoreCase(name)) {
			gr_loc_tel(value);
			return;
		}
		if ($gr_loc_fax.equalsIgnoreCase(name)) {
			gr_loc_fax(value);
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
		if ($lot_no.equalsIgnoreCase(name)) {
			lot_no(value);
			return;
		}
		if ($sublot_no.equalsIgnoreCase(name)) {
			sublot_no(value);
			return;
		}
		if ($ver_no.equalsIgnoreCase(name)) {
			ver_no(value);
			return;
		}
		if ($sno1.equalsIgnoreCase(name)) {
			sno1(value);
			return;
		}
		if ($sno2.equalsIgnoreCase(name)) {
			sno2(value);
			return;
		}
		if ($sno3.equalsIgnoreCase(name)) {
			sno3(value);
			return;
		}
		if ($sno4.equalsIgnoreCase(name)) {
			sno4(value);
			return;
		}
		if ($gd_cd.equalsIgnoreCase(name)) {
			gd_cd(value);
			return;
		}
		if ($gd_nm.equalsIgnoreCase(name)) {
			gd_nm(value);
			return;
		}
		if ($quality_typ.equalsIgnoreCase(name)) {
			quality_typ(value);
			return;
		}
		if ($stk_insp_typ.equalsIgnoreCase(name)) {
			stk_insp_typ(value);
			return;
		}
		if ($stk_id_typ.equalsIgnoreCase(name)) {
			stk_id_typ(value);
			return;
		}
		if ($stk_bp_cd.equalsIgnoreCase(name)) {
			stk_bp_cd(value);
			return;
		}
		if ($stk_bp_nm.equalsIgnoreCase(name)) {
			stk_bp_nm(value);
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
		if ($base_unit_cd.equalsIgnoreCase(name)) {
			base_unit_cd(value);
			return;
		}
		if ($base_unit_nm.equalsIgnoreCase(name)) {
			base_unit_nm(value);
			return;
		}
		if ($prov_typ.equalsIgnoreCase(name)) {
			prov_typ(value);
			return;
		}
		if ($prov_basis_typ.equalsIgnoreCase(name)) {
			prov_basis_typ(value);
			return;
		}
		if ($ret_prov_typ.equalsIgnoreCase(name)) {
			ret_prov_typ(value);
			return;
		}
		if ($ret_prov_basis_typ.equalsIgnoreCase(name)) {
			ret_prov_basis_typ(value);
			return;
		}
		if ($rsn_cd.equalsIgnoreCase(name)) {
			rsn_cd(value);
			return;
		}
		if ($rsn_nm.equalsIgnoreCase(name)) {
			rsn_nm(value);
			return;
		}
		if ($bd_dpt_cd.equalsIgnoreCase(name)) {
			bd_dpt_cd(value);
			return;
		}
		if ($bd_dpt_nm.equalsIgnoreCase(name)) {
			bd_dpt_nm(value);
			return;
		}
		if ($inst_rmrks.equalsIgnoreCase(name)) {
			inst_rmrks(value);
			return;
		}
		if ($inst_d_rmrks.equalsIgnoreCase(name)) {
			inst_d_rmrks(value);
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
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
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
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
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
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
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
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
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
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
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
		if ($xfr_schd_dt.equalsIgnoreCase(name)) {
			xfr_schd_dt(value);
			return;
		}
		if ($xfr_inst_dt.equalsIgnoreCase(name)) {
			xfr_inst_dt(value);
			return;
		}
		if ($vld_dt.equalsIgnoreCase(name)) {
			vld_dt(value);
			return;
		}
		if ($lmt_dt.equalsIgnoreCase(name)) {
			lmt_dt(value);
			return;
		}
		if ($first_gr_dt.equalsIgnoreCase(name)) {
			first_gr_dt(value);
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
		if ($sno1_null_flg.equalsIgnoreCase(name)) {
			sno1_null_flg(value);
			return;
		}
		if ($sno2_null_flg.equalsIgnoreCase(name)) {
			sno2_null_flg(value);
			return;
		}
		if ($sno3_null_flg.equalsIgnoreCase(name)) {
			sno3_null_flg(value);
			return;
		}
		if ($sno4_null_flg.equalsIgnoreCase(name)) {
			sno4_null_flg(value);
			return;
		}
		if ($alloc_flg.equalsIgnoreCase(name)) {
			alloc_flg(value);
			return;
		}
		if ($abort_flg.equalsIgnoreCase(name)) {
			abort_flg(value);
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
		if ($dpstr_cd.equalsIgnoreCase(name)) {
			dpstr_cd(value);
			return;
		}
		if ($dpstr_nm.equalsIgnoreCase(name)) {
			dpstr_nm(value);
			return;
		}
		if ($site_co_cd.equalsIgnoreCase(name)) {
			site_co_cd(value);
			return;
		}
		if ($site_co_nm.equalsIgnoreCase(name)) {
			site_co_nm(value);
			return;
		}
		if ($xfr_inst_no.equalsIgnoreCase(name)) {
			xfr_inst_no(value);
			return;
		}
		if ($trd_cd.equalsIgnoreCase(name)) {
			trd_cd(value);
			return;
		}
		if ($trd_nm.equalsIgnoreCase(name)) {
			trd_nm(value);
			return;
		}
		if ($trd_ptn_typ.equalsIgnoreCase(name)) {
			trd_ptn_typ(value);
			return;
		}
		if ($inst_dpt_cd.equalsIgnoreCase(name)) {
			inst_dpt_cd(value);
			return;
		}
		if ($inst_dpt_nm.equalsIgnoreCase(name)) {
			inst_dpt_nm(value);
			return;
		}
		if ($inst_usr_cd.equalsIgnoreCase(name)) {
			inst_usr_cd(value);
			return;
		}
		if ($inst_usr_nm.equalsIgnoreCase(name)) {
			inst_usr_nm(value);
			return;
		}
		if ($xfr_schd_no.equalsIgnoreCase(name)) {
			xfr_schd_no(value);
			return;
		}
		if ($xfr_src_typ.equalsIgnoreCase(name)) {
			xfr_src_typ(value);
			return;
		}
		if ($xfr_src_no.equalsIgnoreCase(name)) {
			xfr_src_no(value);
			return;
		}
		if ($xfr_inst_d_no.equalsIgnoreCase(name)) {
			xfr_inst_d_no(value);
			return;
		}
		if ($xfr_alloc_sts_no.equalsIgnoreCase(name)) {
			xfr_alloc_sts_no(value);
			return;
		}
		if ($dlv_slip_no.equalsIgnoreCase(name)) {
			dlv_slip_no(value);
			return;
		}
		if ($dlv_slip_d_no.equalsIgnoreCase(name)) {
			dlv_slip_d_no(value);
			return;
		}
		if ($lg_grp_cd.equalsIgnoreCase(name)) {
			lg_grp_cd(value);
			return;
		}
		if ($lg_grp_nm.equalsIgnoreCase(name)) {
			lg_grp_nm(value);
			return;
		}
		if ($gi_loc_cd.equalsIgnoreCase(name)) {
			gi_loc_cd(value);
			return;
		}
		if ($gi_loc_nm.equalsIgnoreCase(name)) {
			gi_loc_nm(value);
			return;
		}
		if ($gi_str_ln_cd.equalsIgnoreCase(name)) {
			gi_str_ln_cd(value);
			return;
		}
		if ($gi_str_ln_nm.equalsIgnoreCase(name)) {
			gi_str_ln_nm(value);
			return;
		}
		if ($gi_loc_tel.equalsIgnoreCase(name)) {
			gi_loc_tel(value);
			return;
		}
		if ($gi_loc_fax.equalsIgnoreCase(name)) {
			gi_loc_fax(value);
			return;
		}
		if ($gr_loc_cd.equalsIgnoreCase(name)) {
			gr_loc_cd(value);
			return;
		}
		if ($gr_loc_nm.equalsIgnoreCase(name)) {
			gr_loc_nm(value);
			return;
		}
		if ($gr_str_ln_cd.equalsIgnoreCase(name)) {
			gr_str_ln_cd(value);
			return;
		}
		if ($gr_str_ln_nm.equalsIgnoreCase(name)) {
			gr_str_ln_nm(value);
			return;
		}
		if ($gr_loc_tel.equalsIgnoreCase(name)) {
			gr_loc_tel(value);
			return;
		}
		if ($gr_loc_fax.equalsIgnoreCase(name)) {
			gr_loc_fax(value);
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
		if ($lot_no.equalsIgnoreCase(name)) {
			lot_no(value);
			return;
		}
		if ($sublot_no.equalsIgnoreCase(name)) {
			sublot_no(value);
			return;
		}
		if ($ver_no.equalsIgnoreCase(name)) {
			ver_no(value);
			return;
		}
		if ($sno1.equalsIgnoreCase(name)) {
			sno1(value);
			return;
		}
		if ($sno2.equalsIgnoreCase(name)) {
			sno2(value);
			return;
		}
		if ($sno3.equalsIgnoreCase(name)) {
			sno3(value);
			return;
		}
		if ($sno4.equalsIgnoreCase(name)) {
			sno4(value);
			return;
		}
		if ($gd_cd.equalsIgnoreCase(name)) {
			gd_cd(value);
			return;
		}
		if ($gd_nm.equalsIgnoreCase(name)) {
			gd_nm(value);
			return;
		}
		if ($quality_typ.equalsIgnoreCase(name)) {
			quality_typ(value);
			return;
		}
		if ($stk_insp_typ.equalsIgnoreCase(name)) {
			stk_insp_typ(value);
			return;
		}
		if ($stk_id_typ.equalsIgnoreCase(name)) {
			stk_id_typ(value);
			return;
		}
		if ($stk_bp_cd.equalsIgnoreCase(name)) {
			stk_bp_cd(value);
			return;
		}
		if ($stk_bp_nm.equalsIgnoreCase(name)) {
			stk_bp_nm(value);
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
		if ($base_unit_cd.equalsIgnoreCase(name)) {
			base_unit_cd(value);
			return;
		}
		if ($base_unit_nm.equalsIgnoreCase(name)) {
			base_unit_nm(value);
			return;
		}
		if ($prov_typ.equalsIgnoreCase(name)) {
			prov_typ(value);
			return;
		}
		if ($prov_basis_typ.equalsIgnoreCase(name)) {
			prov_basis_typ(value);
			return;
		}
		if ($ret_prov_typ.equalsIgnoreCase(name)) {
			ret_prov_typ(value);
			return;
		}
		if ($ret_prov_basis_typ.equalsIgnoreCase(name)) {
			ret_prov_basis_typ(value);
			return;
		}
		if ($rsn_cd.equalsIgnoreCase(name)) {
			rsn_cd(value);
			return;
		}
		if ($rsn_nm.equalsIgnoreCase(name)) {
			rsn_nm(value);
			return;
		}
		if ($bd_dpt_cd.equalsIgnoreCase(name)) {
			bd_dpt_cd(value);
			return;
		}
		if ($bd_dpt_nm.equalsIgnoreCase(name)) {
			bd_dpt_nm(value);
			return;
		}
		if ($inst_rmrks.equalsIgnoreCase(name)) {
			inst_rmrks(value);
			return;
		}
		if ($inst_d_rmrks.equalsIgnoreCase(name)) {
			inst_d_rmrks(value);
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
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
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
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
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
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
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
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
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
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
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
		if ($xfr_schd_dt.equalsIgnoreCase(name)) {
			xfr_schd_dt(value);
			return;
		}
		if ($xfr_inst_dt.equalsIgnoreCase(name)) {
			xfr_inst_dt(value);
			return;
		}
		if ($vld_dt.equalsIgnoreCase(name)) {
			vld_dt(value);
			return;
		}
		if ($lmt_dt.equalsIgnoreCase(name)) {
			lmt_dt(value);
			return;
		}
		if ($first_gr_dt.equalsIgnoreCase(name)) {
			first_gr_dt(value);
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
		if ($sno1_null_flg.equalsIgnoreCase(name)) {
			sno1_null_flg(value);
			return;
		}
		if ($sno2_null_flg.equalsIgnoreCase(name)) {
			sno2_null_flg(value);
			return;
		}
		if ($sno3_null_flg.equalsIgnoreCase(name)) {
			sno3_null_flg(value);
			return;
		}
		if ($sno4_null_flg.equalsIgnoreCase(name)) {
			sno4_null_flg(value);
			return;
		}
		if ($alloc_flg.equalsIgnoreCase(name)) {
			alloc_flg(value);
			return;
		}
		if ($abort_flg.equalsIgnoreCase(name)) {
			abort_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

