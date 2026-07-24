package mcframe.commonMSBD.MSBDR0050;

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
 * ブロック"DlvInstHdr"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class DlvInstHdrR_MC_A extends MCConstRow {

	/**
	 *  帳票ステータス区分名.<p>
	 *
	 */
	public static final String $rpt_sts_typ_nm = "rpt_sts_typ_nm";
	/**
	 *  帳票ステータス区分.<p>
	 *
	 */
	public static final String $rpt_sts_typ = "rpt_sts_typ";
	/**
	 *  納入指示ＮＯ.<p>
	 *
	 */
	public static final String $dlv_inst_no = "dlv_inst_no";
	/**
	 *  納入指示リビジョン.<p>
	 *
	 */
	public static final String $dlv_inst_rev = "dlv_inst_rev";
	/**
	 *  発行日時.<p>
	 *
	 */
	public static final String $print_hm = "print_hm";
	/**
	 *  発注先.<p>
	 *
	 */
	public static final String $sppl_cd = "sppl_cd";
	/**
	 *  発注先郵便番号.<p>
	 *
	 */
	public static final String $sppl_zip_cd = "sppl_zip_cd";
	/**
	 *  発注先住所１.<p>
	 *
	 */
	public static final String $sppl_addr1 = "sppl_addr1";
	/**
	 *  発注先住所２.<p>
	 *
	 */
	public static final String $sppl_addr2 = "sppl_addr2";
	/**
	 *  発注先住所３.<p>
	 *
	 */
	public static final String $sppl_addr3 = "sppl_addr3";
	/**
	 *  発注先住所４.<p>
	 *
	 */
	public static final String $sppl_addr4 = "sppl_addr4";
	/**
	 *  発注先住所.<p>
	 *
	 */
	public static final String $sppl_addr = "sppl_addr";
	/**
	 *  発注先名.<p>
	 *
	 */
	public static final String $sppl_nm = "sppl_nm";
	/**
	 *  発注先別名１.<p>
	 *
	 */
	public static final String $sppl_alt_nm1 = "sppl_alt_nm1";
	/**
	 *  発注先別名２.<p>
	 *
	 */
	public static final String $sppl_alt_nm2 = "sppl_alt_nm2";
	/**
	 *  発注先別名３.<p>
	 *
	 */
	public static final String $sppl_alt_nm3 = "sppl_alt_nm3";
	/**
	 *  発注先別名４.<p>
	 *
	 */
	public static final String $sppl_alt_nm4 = "sppl_alt_nm4";
	/**
	 *  発注先部署名.<p>
	 *
	 */
	public static final String $sppl_cntct_dpt = "sppl_cntct_dpt";
	/**
	 *  発注先担当者.<p>
	 *
	 */
	public static final String $sppl_cntct_psn = "sppl_cntct_psn";
	/**
	 *  発注先担当者敬称.<p>
	 *
	 */
	public static final String $sppl_cntct_psn_title = "sppl_cntct_psn_title";
	/**
	 *  ＴＥＬ（発注先）.<p>
	 *
	 */
	public static final String $sppl_tel = "sppl_tel";
	/**
	 *  ＦＡＸ（発注先）.<p>
	 *
	 */
	public static final String $sppl_fax = "sppl_fax";
	/**
	 *  発注先国名.<p>
	 *
	 */
	public static final String $sppl_cntry_nm = "sppl_cntry_nm";
	/**
	 *  会社.<p>
	 *
	 */
	public static final String $co_cd = "co_cd";
	/**
	 *  会社名.<p>
	 *
	 */
	public static final String $co_nm = "co_nm";
	/**
	 *  部門郵便番号.<p>
	 *
	 */
	public static final String $dpt_zip_cd = "dpt_zip_cd";
	/**
	 *  部門住所１.<p>
	 *
	 */
	public static final String $dpt_addr1 = "dpt_addr1";
	/**
	 *  部門住所２.<p>
	 *
	 */
	public static final String $dpt_addr2 = "dpt_addr2";
	/**
	 *  部門住所３.<p>
	 *
	 */
	public static final String $dpt_addr3 = "dpt_addr3";
	/**
	 *  部門住所４.<p>
	 *
	 */
	public static final String $dpt_addr4 = "dpt_addr4";
	/**
	 *  部門住所.<p>
	 *
	 */
	public static final String $dpt_addr = "dpt_addr";
	/**
	 *  部門ＴＥＬ.<p>
	 *
	 */
	public static final String $dpt_tel = "dpt_tel";
	/**
	 *  部門ＦＡＸ.<p>
	 *
	 */
	public static final String $dpt_fax = "dpt_fax";
	/**
	 *  部門.<p>
	 *
	 */
	public static final String $purc_dpt_cd = "purc_dpt_cd";
	/**
	 *  部門名.<p>
	 *
	 */
	public static final String $purc_dpt_nm = "purc_dpt_nm";
	/**
	 *  部門国名.<p>
	 *
	 */
	public static final String $dpt_cntry_nm = "dpt_cntry_nm";
	/**
	 *  担当者.<p>
	 *
	 */
	public static final String $purc_usr_cd = "purc_usr_cd";
	/**
	 *  担当者名.<p>
	 *
	 */
	public static final String $purc_usr_nm = "purc_usr_nm";
	/**
	 *  発注ＮＯ.<p>
	 *
	 */
	public static final String $po_no = "po_no";
	/**
	 *  発注明細ＮＯ.<p>
	 *
	 */
	public static final String $po_d_no = "po_d_no";
	/**
	 *  弊社品目.<p>
	 *
	 */
	public static final String $itm_cd = "itm_cd";
	/**
	 *  枝番１（表示用）.<p>
	 *
	 */
	public static final String $itm_sub1_view = "itm_sub1_view";
	/**
	 *  枝番１（データ）.<p>
	 *
	 */
	public static final String $itm_sub1_data = "itm_sub1_data";
	/**
	 *  枝番２（表示用）.<p>
	 *
	 */
	public static final String $itm_sub2_view = "itm_sub2_view";
	/**
	 *  枝番２（データ）.<p>
	 *
	 */
	public static final String $itm_sub2_data = "itm_sub2_data";
	/**
	 *  枝番３（表示用）.<p>
	 *
	 */
	public static final String $itm_sub3_view = "itm_sub3_view";
	/**
	 *  枝番３（データ）.<p>
	 *
	 */
	public static final String $itm_sub3_data = "itm_sub3_data";
	/**
	 *  弊社品名.<p>
	 *
	 */
	public static final String $itm_nm = "itm_nm";
	/**
	 *  弊社品目別名１.<p>
	 *
	 */
	public static final String $itm_alt_nm1 = "itm_alt_nm1";
	/**
	 *  弊社品目別名２.<p>
	 *
	 */
	public static final String $itm_alt_nm2 = "itm_alt_nm2";
	/**
	 *  弊社品目別名３.<p>
	 *
	 */
	public static final String $itm_alt_nm3 = "itm_alt_nm3";
	/**
	 *  弊社品目別名４.<p>
	 *
	 */
	public static final String $itm_alt_nm4 = "itm_alt_nm4";
	/**
	 *  版ＮＯ（ラベル）.<p>
	 *
	 */
	public static final String $ver_no_lbl = "ver_no_lbl";
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
	 *  手配ＮＯ２.<p>
	 *
	 */
	public static final String $sno2 = "sno2";
	/**
	 *  手配ＮＯ３.<p>
	 *
	 */
	public static final String $sno3 = "sno3";
	/**
	 *  手配ＮＯ４.<p>
	 *
	 */
	public static final String $sno4 = "sno4";
	/**
	 *  基準単位発注数量.<p>
	 *
	 */
	public static final String $base_unit_qty = "base_unit_qty";
	/**
	 *  基準単位発注数量文字列.<p>
	 *
	 */
	public static final String $s_base_unit_qty = "s_base_unit_qty";
	/**
	 *  基準単位.<p>
	 *
	 */
	public static final String $base_unit_cd = "base_unit_cd";
	/**
	 *  基準単位名.<p>
	 *
	 */
	public static final String $base_unit_nm = "base_unit_nm";
	/**
	 *  発注数量.<p>
	 *
	 */
	public static final String $hdr_trd_unit_qty = "hdr_trd_unit_qty";
	/**
	 *  発注数量文字列.<p>
	 *
	 */
	public static final String $s_hdr_trd_unit_qty = "s_hdr_trd_unit_qty";
	/**
	 *  単位.<p>
	 *
	 */
	public static final String $hdr_trd_unit_cd = "hdr_trd_unit_cd";
	/**
	 *  発注単位名.<p>
	 *
	 */
	public static final String $hdr_trd_unit_nm = "hdr_trd_unit_nm";
	/**
	 *  入荷数量.<p>
	 *
	 */
	public static final String $arr_qty = "arr_qty";
	/**
	 *  入荷数量文字列.<p>
	 *
	 */
	public static final String $s_arr_qty = "s_arr_qty";
	/**
	 *  注文書納期（日付）.<p>
	 *
	 */
	public static final String $dlv_rqst_dt = "dlv_rqst_dt";
	/**
	 *  注文書納期（時刻）.<p>
	 *
	 */
	public static final String $dlv_rqst_tm = "dlv_rqst_tm";
	/**
	 *  貴社品目.<p>
	 *
	 */
	public static final String $sppl_itm_cd = "sppl_itm_cd";
	/**
	 *  貴社品名.<p>
	 *
	 */
	public static final String $sppl_itm_nm = "sppl_itm_nm";
	/**
	 *  貴社ロットＮＯ.<p>
	 *
	 */
	public static final String $bp_lot_no = "bp_lot_no";
	/**
	 *  メーカ.<p>
	 *
	 */
	public static final String $maker_cd = "maker_cd";
	/**
	 *  メーカ名.<p>
	 *
	 */
	public static final String $maker_nm = "maker_nm";
	/**
	 *  メーカ別名１.<p>
	 *
	 */
	public static final String $maker_alt_nm1 = "maker_alt_nm1";
	/**
	 *  メーカ別名２.<p>
	 *
	 */
	public static final String $maker_alt_nm2 = "maker_alt_nm2";
	/**
	 *  メーカ別名３.<p>
	 *
	 */
	public static final String $maker_alt_nm3 = "maker_alt_nm3";
	/**
	 *  メーカ別名４.<p>
	 *
	 */
	public static final String $maker_alt_nm4 = "maker_alt_nm4";
	/**
	 *  納入指示日.<p>
	 *
	 */
	public static final String $dlv_inst_dt = "dlv_inst_dt";
	/**
	 *  納入場所.<p>
	 *
	 */
	public static final String $in_to_loc_cd = "in_to_loc_cd";
	/**
	 *  納入場所名.<p>
	 *
	 */
	public static final String $in_to_loc_nm = "in_to_loc_nm";
	/**
	 *  納入場所別名１.<p>
	 *
	 */
	public static final String $in_to_loc_alt_nm1 = "in_to_loc_alt_nm1";
	/**
	 *  納入場所別名２.<p>
	 *
	 */
	public static final String $in_to_loc_alt_nm2 = "in_to_loc_alt_nm2";
	/**
	 *  納入場所別名３.<p>
	 *
	 */
	public static final String $in_to_loc_alt_nm3 = "in_to_loc_alt_nm3";
	/**
	 *  納入場所別名４.<p>
	 *
	 */
	public static final String $in_to_loc_alt_nm4 = "in_to_loc_alt_nm4";
	/**
	 *  備考.<p>
	 *
	 */
	public static final String $dlv_inst_prnt_rmrks = "dlv_inst_prnt_rmrks";
	/**
	 *  発注予備１.<p>
	 *
	 */
	public static final String $po_sub_char1 = "po_sub_char1";
	/**
	 *  発注予備２.<p>
	 *
	 */
	public static final String $po_sub_char2 = "po_sub_char2";
	/**
	 *  発注予備３.<p>
	 *
	 */
	public static final String $po_sub_char3 = "po_sub_char3";
	/**
	 *  発注明細予備１.<p>
	 *
	 */
	public static final String $po_d_sub_char1 = "po_d_sub_char1";
	/**
	 *  発注明細予備２.<p>
	 *
	 */
	public static final String $po_d_sub_char2 = "po_d_sub_char2";
	/**
	 *  発注明細予備３.<p>
	 *
	 */
	public static final String $po_d_sub_char3 = "po_d_sub_char3";
	/**
	 *  納入指示予備１.<p>
	 *
	 */
	public static final String $dlv_inst_sub_char1 = "dlv_inst_sub_char1";
	/**
	 *  納入指示予備２.<p>
	 *
	 */
	public static final String $dlv_inst_sub_char2 = "dlv_inst_sub_char2";
	/**
	 *  納入指示予備３.<p>
	 *
	 */
	public static final String $dlv_inst_sub_char3 = "dlv_inst_sub_char3";
	/**
	 *  納入場所郵便番号.<p>
	 *
	 */
	public static final String $in_to_loc_zip_cd = "in_to_loc_zip_cd";
	/**
	 *  納入場所住所１.<p>
	 *
	 */
	public static final String $in_to_loc_addr1 = "in_to_loc_addr1";
	/**
	 *  納入場所住所２.<p>
	 *
	 */
	public static final String $in_to_loc_addr2 = "in_to_loc_addr2";
	/**
	 *  納入場所住所３.<p>
	 *
	 */
	public static final String $in_to_loc_addr3 = "in_to_loc_addr3";
	/**
	 *  納入場所住所４.<p>
	 *
	 */
	public static final String $in_to_loc_addr4 = "in_to_loc_addr4";
	/**
	 *  納入場所住所１－４（データ用）.<p>
	 *
	 */
	public static final String $in_to_loc_addr = "in_to_loc_addr";
	/**
	 *  納入場所ＴＥＬ.<p>
	 *
	 */
	public static final String $in_to_loc_tel = "in_to_loc_tel";
	/**
	 *  納入場所ＦＡＸ.<p>
	 *
	 */
	public static final String $in_to_loc_fax = "in_to_loc_fax";
	/**
	 *  納入場所国名.<p>
	 *
	 */
	public static final String $in_to_cntry_nm = "in_to_cntry_nm";
	/**
	 *  納品先郵便番号.<p>
	 *
	 */
	public static final String $dlv_zip_cd = "dlv_zip_cd";
	/**
	 *  納品先住所１.<p>
	 *
	 */
	public static final String $dlv_addr1 = "dlv_addr1";
	/**
	 *  納品先住所２.<p>
	 *
	 */
	public static final String $dlv_addr2 = "dlv_addr2";
	/**
	 *  納品先住所３.<p>
	 *
	 */
	public static final String $dlv_addr3 = "dlv_addr3";
	/**
	 *  納品先住所４.<p>
	 *
	 */
	public static final String $dlv_addr4 = "dlv_addr4";
	/**
	 *  納品先住所１－４（データ用）.<p>
	 *
	 */
	public static final String $dlv_addr = "dlv_addr";
	/**
	 *  納品先ＴＥＬ.<p>
	 *
	 */
	public static final String $dlv_tel = "dlv_tel";
	/**
	 *  納品先ＦＡＸ.<p>
	 *
	 */
	public static final String $dlv_fax = "dlv_fax";
	/**
	 *  納品先国名.<p>
	 *
	 */
	public static final String $dlv_cntry_nm = "dlv_cntry_nm";
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
	 *  配送先住所１－４（データ用）.<p>
	 *
	 */
	public static final String $tdlv_addr = "tdlv_addr";
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
	 *  配送先国名.<p>
	 *
	 */
	public static final String $tdlv_cntry_nm = "tdlv_cntry_nm";


	public static final MCMeta rpt_sts_typ_nm_META = createCommonMeta($rpt_sts_typ_nm, mcframe.commonMA.meta.MA_META.RPT_STS_TYP_NM);
	public static final MCMeta rpt_sts_typ_META = createCommonMeta($rpt_sts_typ, mcframe.commonMA.meta.MA_META.RPT_STS_TYP);
	public static final MCMeta dlv_inst_no_META = createCommonMeta($dlv_inst_no, mcframe.commonMA.meta.MA_META.DLV_INST_NO);
	public static final MCMeta dlv_inst_rev_META = createCommonMeta($dlv_inst_rev, mcframe.commonMA.meta.MA_META.SLIP_REV);
	public static final MCMeta print_hm_META = createCommonMeta($print_hm, mcframe.commonMA.meta.MA_META.HM);
	public static final MCMeta sppl_cd_META = createCommonMeta($sppl_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta sppl_zip_cd_META = createCommonMeta($sppl_zip_cd, mcframe.commonMA.meta.MA_META.ZIP_CD);
	public static final MCMeta sppl_addr1_META = createCommonMeta($sppl_addr1, mcframe.commonMA.meta.MA_META.ADDR);
	public static final MCMeta sppl_addr2_META = createCommonMeta($sppl_addr2, mcframe.commonMA.meta.MA_META.ADDR);
	public static final MCMeta sppl_addr3_META = createCommonMeta($sppl_addr3, mcframe.commonMA.meta.MA_META.ADDR);
	public static final MCMeta sppl_addr4_META = createCommonMeta($sppl_addr4, mcframe.commonMA.meta.MA_META.ADDR);
	public static final MCMeta sppl_addr_META = createStringMeta($sppl_addr);
	public static final MCMeta sppl_nm_META = createCommonMeta($sppl_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta sppl_alt_nm1_META = createCommonMeta($sppl_alt_nm1, mcframe.commonMA.meta.MA_META.BP_ALT_NM1);
	public static final MCMeta sppl_alt_nm2_META = createCommonMeta($sppl_alt_nm2, mcframe.commonMA.meta.MA_META.BP_ALT_NM2);
	public static final MCMeta sppl_alt_nm3_META = createCommonMeta($sppl_alt_nm3, mcframe.commonMA.meta.MA_META.BP_ALT_NM3);
	public static final MCMeta sppl_alt_nm4_META = createCommonMeta($sppl_alt_nm4, mcframe.commonMA.meta.MA_META.BP_ALT_NM4);
	public static final MCMeta sppl_cntct_dpt_META = createCommonMeta($sppl_cntct_dpt, mcframe.commonMA.meta.MA_META.BP_CNTCT_DPT);
	public static final MCMeta sppl_cntct_psn_META = createCommonMeta($sppl_cntct_psn, mcframe.commonMA.meta.MA_META.BP_CNTCT_PSN);
	public static final MCMeta sppl_cntct_psn_title_META = createCommonMeta($sppl_cntct_psn_title, mcframe.commonMA.meta.MA_META.BP_PSN_TITLE);
	public static final MCMeta sppl_tel_META = createCommonMeta($sppl_tel, mcframe.commonMA.meta.MA_META.TEL);
	public static final MCMeta sppl_fax_META = createCommonMeta($sppl_fax, mcframe.commonMA.meta.MA_META.TEL);
	public static final MCMeta sppl_cntry_nm_META = createCommonMeta($sppl_cntry_nm, mcframe.commonMA.meta.MA_META.CNTRY_NM);
	public static final MCMeta co_cd_META = createCommonMeta($co_cd, mcframe.commonMA.meta.MA_META.CO_CD);
	public static final MCMeta co_nm_META = createCommonMeta($co_nm, mcframe.commonMA.meta.MA_META.CO_NM);
	public static final MCMeta dpt_zip_cd_META = createCommonMeta($dpt_zip_cd, mcframe.commonMA.meta.MA_META.ZIP_CD);
	public static final MCMeta dpt_addr1_META = createCommonMeta($dpt_addr1, mcframe.commonMA.meta.MA_META.ADDR);
	public static final MCMeta dpt_addr2_META = createCommonMeta($dpt_addr2, mcframe.commonMA.meta.MA_META.ADDR);
	public static final MCMeta dpt_addr3_META = createCommonMeta($dpt_addr3, mcframe.commonMA.meta.MA_META.ADDR);
	public static final MCMeta dpt_addr4_META = createCommonMeta($dpt_addr4, mcframe.commonMA.meta.MA_META.ADDR);
	public static final MCMeta dpt_addr_META = createStringMeta($dpt_addr);
	public static final MCMeta dpt_tel_META = createCommonMeta($dpt_tel, mcframe.commonMA.meta.MA_META.TEL);
	public static final MCMeta dpt_fax_META = createCommonMeta($dpt_fax, mcframe.commonMA.meta.MA_META.TEL);
	public static final MCMeta purc_dpt_cd_META = createCommonMeta($purc_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta purc_dpt_nm_META = createCommonMeta($purc_dpt_nm, mcframe.commonMA.meta.MA_META.DPT_NM);
	public static final MCMeta dpt_cntry_nm_META = createCommonMeta($dpt_cntry_nm, mcframe.commonMA.meta.MA_META.CNTRY_NM);
	public static final MCMeta purc_usr_cd_META = createCommonMeta($purc_usr_cd, mcframe.commonMA.meta.MA_META.USR_CD);
	public static final MCMeta purc_usr_nm_META = createCommonMeta($purc_usr_nm, mcframe.commonMA.meta.MA_META.USR_NM);
	public static final MCMeta po_no_META = createCommonMeta($po_no, mcframe.commonMA.meta.MA_META.PO_NO);
	public static final MCMeta po_d_no_META = createCommonMeta($po_d_no, mcframe.commonMA.meta.MA_META.PO_D_NO);
	public static final MCMeta itm_cd_META = createCommonMeta($itm_cd, mcframe.commonMA.meta.MA_META.ITM_CD);
	public static final MCMeta itm_sub1_view_META = createCommonMeta($itm_sub1_view, mcframe.commonMA.meta.MA_META.ITM_SUB1);
	public static final MCMeta itm_sub1_data_META = createCommonMeta($itm_sub1_data, mcframe.commonMA.meta.MA_META.ITM_SUB1);
	public static final MCMeta itm_sub2_view_META = createCommonMeta($itm_sub2_view, mcframe.commonMA.meta.MA_META.ITM_SUB2);
	public static final MCMeta itm_sub2_data_META = createCommonMeta($itm_sub2_data, mcframe.commonMA.meta.MA_META.ITM_SUB2);
	public static final MCMeta itm_sub3_view_META = createCommonMeta($itm_sub3_view, mcframe.commonMA.meta.MA_META.ITM_SUB3);
	public static final MCMeta itm_sub3_data_META = createCommonMeta($itm_sub3_data, mcframe.commonMA.meta.MA_META.ITM_SUB3);
	public static final MCMeta itm_nm_META = createCommonMeta($itm_nm, mcframe.commonMA.meta.MA_META.ITM_NM);
	public static final MCMeta itm_alt_nm1_META = createCommonMeta($itm_alt_nm1, mcframe.commonMA.meta.MA_META.ITM_ALT_NM1);
	public static final MCMeta itm_alt_nm2_META = createCommonMeta($itm_alt_nm2, mcframe.commonMA.meta.MA_META.ITM_ALT_NM2);
	public static final MCMeta itm_alt_nm3_META = createCommonMeta($itm_alt_nm3, mcframe.commonMA.meta.MA_META.ITM_ALT_NM3);
	public static final MCMeta itm_alt_nm4_META = createCommonMeta($itm_alt_nm4, mcframe.commonMA.meta.MA_META.ITM_ALT_NM4);
	public static final MCMeta ver_no_lbl_META = createStringMeta($ver_no_lbl);
	public static final MCMeta ver_no_META = createCommonMeta($ver_no, mcframe.commonMA.meta.MA_META.VER_NO);
	public static final MCMeta sno1_META = createCommonMeta($sno1, mcframe.commonMA.meta.MA_META.SNO1);
	public static final MCMeta sno2_META = createCommonMeta($sno2, mcframe.commonMA.meta.MA_META.SNO2);
	public static final MCMeta sno3_META = createCommonMeta($sno3, mcframe.commonMA.meta.MA_META.SNO3);
	public static final MCMeta sno4_META = createCommonMeta($sno4, mcframe.commonMA.meta.MA_META.SNO4);
	public static final MCMeta base_unit_qty_META = createCommonMeta($base_unit_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta s_base_unit_qty_META = createStringMeta($s_base_unit_qty);
	public static final MCMeta base_unit_cd_META = createCommonMeta($base_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta base_unit_nm_META = createCommonMeta($base_unit_nm, mcframe.commonMA.meta.MA_META.UNIT_NM);
	public static final MCMeta hdr_trd_unit_qty_META = createCommonMeta($hdr_trd_unit_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta s_hdr_trd_unit_qty_META = createStringMeta($s_hdr_trd_unit_qty);
	public static final MCMeta hdr_trd_unit_cd_META = createCommonMeta($hdr_trd_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta hdr_trd_unit_nm_META = createCommonMeta($hdr_trd_unit_nm, mcframe.commonMA.meta.MA_META.UNIT_NM);
	public static final MCMeta arr_qty_META = createCommonMeta($arr_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta s_arr_qty_META = createStringMeta($s_arr_qty);
	public static final MCMeta dlv_rqst_dt_META = createCommonMeta($dlv_rqst_dt, mcframe.commonMA.meta.MA_META.TM);
	public static final MCMeta dlv_rqst_tm_META = createCommonMeta($dlv_rqst_tm, mcframe.commonMA.meta.MA_META.TM);
	public static final MCMeta sppl_itm_cd_META = createCommonMeta($sppl_itm_cd, mcframe.commonMA.meta.MA_META.ITM_CD);
	public static final MCMeta sppl_itm_nm_META = createCommonMeta($sppl_itm_nm, mcframe.commonMA.meta.MA_META.ITM_NM);
	public static final MCMeta bp_lot_no_META = createCommonMeta($bp_lot_no, mcframe.commonMA.meta.MA_META.BP_LOT_NO);
	public static final MCMeta maker_cd_META = createCommonMeta($maker_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta maker_nm_META = createCommonMeta($maker_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta maker_alt_nm1_META = createCommonMeta($maker_alt_nm1, mcframe.commonMA.meta.MA_META.BP_ALT_NM1);
	public static final MCMeta maker_alt_nm2_META = createCommonMeta($maker_alt_nm2, mcframe.commonMA.meta.MA_META.BP_ALT_NM2);
	public static final MCMeta maker_alt_nm3_META = createCommonMeta($maker_alt_nm3, mcframe.commonMA.meta.MA_META.BP_ALT_NM3);
	public static final MCMeta maker_alt_nm4_META = createCommonMeta($maker_alt_nm4, mcframe.commonMA.meta.MA_META.BP_ALT_NM4);
	public static final MCMeta dlv_inst_dt_META = createCommonMeta($dlv_inst_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta in_to_loc_cd_META = createCommonMeta($in_to_loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta in_to_loc_nm_META = createCommonMeta($in_to_loc_nm, mcframe.commonMA.meta.MA_META.LOC_NM);
	public static final MCMeta in_to_loc_alt_nm1_META = createCommonMeta($in_to_loc_alt_nm1, mcframe.commonMA.meta.MA_META.BP_ALT_NM1);
	public static final MCMeta in_to_loc_alt_nm2_META = createCommonMeta($in_to_loc_alt_nm2, mcframe.commonMA.meta.MA_META.BP_ALT_NM2);
	public static final MCMeta in_to_loc_alt_nm3_META = createCommonMeta($in_to_loc_alt_nm3, mcframe.commonMA.meta.MA_META.BP_ALT_NM3);
	public static final MCMeta in_to_loc_alt_nm4_META = createCommonMeta($in_to_loc_alt_nm4, mcframe.commonMA.meta.MA_META.BP_ALT_NM4);
	public static final MCMeta dlv_inst_prnt_rmrks_META = createCommonMeta($dlv_inst_prnt_rmrks, mcframe.commonMS.meta.MS_META.DLV_INST_PRINT_RMRKS);
	public static final MCMeta po_sub_char1_META = createCommonMeta($po_sub_char1, mcframe.commonMS.meta.MS_META.PO_SUB_CHAR1);
	public static final MCMeta po_sub_char2_META = createCommonMeta($po_sub_char2, mcframe.commonMS.meta.MS_META.PO_SUB_CHAR2);
	public static final MCMeta po_sub_char3_META = createCommonMeta($po_sub_char3, mcframe.commonMS.meta.MS_META.PO_SUB_CHAR3);
	public static final MCMeta po_d_sub_char1_META = createCommonMeta($po_d_sub_char1, mcframe.commonMS.meta.MS_META.PO_D_SUB_CHAR1);
	public static final MCMeta po_d_sub_char2_META = createCommonMeta($po_d_sub_char2, mcframe.commonMS.meta.MS_META.PO_D_SUB_CHAR2);
	public static final MCMeta po_d_sub_char3_META = createCommonMeta($po_d_sub_char3, mcframe.commonMS.meta.MS_META.PO_D_SUB_CHAR3);
	public static final MCMeta dlv_inst_sub_char1_META = createCommonMeta($dlv_inst_sub_char1, mcframe.commonMS.meta.MS_META.DLV_INST_SUB_CHAR1);
	public static final MCMeta dlv_inst_sub_char2_META = createCommonMeta($dlv_inst_sub_char2, mcframe.commonMS.meta.MS_META.DLV_INST_SUB_CHAR2);
	public static final MCMeta dlv_inst_sub_char3_META = createCommonMeta($dlv_inst_sub_char3, mcframe.commonMS.meta.MS_META.DLV_INST_SUB_CHAR3);
	public static final MCMeta in_to_loc_zip_cd_META = createCommonMeta($in_to_loc_zip_cd, mcframe.commonMA.meta.MA_META.ZIP_CD);
	public static final MCMeta in_to_loc_addr1_META = createCommonMeta($in_to_loc_addr1, mcframe.commonMA.meta.MA_META.ADDR1);
	public static final MCMeta in_to_loc_addr2_META = createCommonMeta($in_to_loc_addr2, mcframe.commonMA.meta.MA_META.ADDR2);
	public static final MCMeta in_to_loc_addr3_META = createCommonMeta($in_to_loc_addr3, mcframe.commonMA.meta.MA_META.ADDR3);
	public static final MCMeta in_to_loc_addr4_META = createCommonMeta($in_to_loc_addr4, mcframe.commonMA.meta.MA_META.ADDR4);
	public static final MCMeta in_to_loc_addr_META = createStringMeta($in_to_loc_addr);
	public static final MCMeta in_to_loc_tel_META = createCommonMeta($in_to_loc_tel, mcframe.commonMA.meta.MA_META.TEL);
	public static final MCMeta in_to_loc_fax_META = createCommonMeta($in_to_loc_fax, mcframe.commonMA.meta.MA_META.TEL);
	public static final MCMeta in_to_cntry_nm_META = createCommonMeta($in_to_cntry_nm, mcframe.commonMA.meta.MA_META.CNTRY_NM);
	public static final MCMeta dlv_zip_cd_META = createCommonMeta($dlv_zip_cd, mcframe.commonMA.meta.MA_META.ZIP_CD);
	public static final MCMeta dlv_addr1_META = createCommonMeta($dlv_addr1, mcframe.commonMA.meta.MA_META.ADDR1);
	public static final MCMeta dlv_addr2_META = createCommonMeta($dlv_addr2, mcframe.commonMA.meta.MA_META.ADDR2);
	public static final MCMeta dlv_addr3_META = createCommonMeta($dlv_addr3, mcframe.commonMA.meta.MA_META.ADDR3);
	public static final MCMeta dlv_addr4_META = createCommonMeta($dlv_addr4, mcframe.commonMA.meta.MA_META.ADDR4);
	public static final MCMeta dlv_addr_META = createStringMeta($dlv_addr);
	public static final MCMeta dlv_tel_META = createCommonMeta($dlv_tel, mcframe.commonMA.meta.MA_META.TEL);
	public static final MCMeta dlv_fax_META = createCommonMeta($dlv_fax, mcframe.commonMA.meta.MA_META.TEL);
	public static final MCMeta dlv_cntry_nm_META = createCommonMeta($dlv_cntry_nm, mcframe.commonMA.meta.MA_META.CNTRY_NM);
	public static final MCMeta tdlv_zip_cd_META = createCommonMeta($tdlv_zip_cd, mcframe.commonMA.meta.MA_META.ZIP_CD);
	public static final MCMeta tdlv_addr1_META = createCommonMeta($tdlv_addr1, mcframe.commonMA.meta.MA_META.ADDR1);
	public static final MCMeta tdlv_addr2_META = createCommonMeta($tdlv_addr2, mcframe.commonMA.meta.MA_META.ADDR2);
	public static final MCMeta tdlv_addr3_META = createCommonMeta($tdlv_addr3, mcframe.commonMA.meta.MA_META.ADDR3);
	public static final MCMeta tdlv_addr4_META = createCommonMeta($tdlv_addr4, mcframe.commonMA.meta.MA_META.ADDR4);
	public static final MCMeta tdlv_addr_META = createStringMeta($tdlv_addr);
	public static final MCMeta tdlv_tel_META = createCommonMeta($tdlv_tel, mcframe.commonMA.meta.MA_META.TEL);
	public static final MCMeta tdlv_fax_META = createCommonMeta($tdlv_fax, mcframe.commonMA.meta.MA_META.TEL);
	public static final MCMeta tdlv_cntry_nm_META = createCommonMeta($tdlv_cntry_nm, mcframe.commonMA.meta.MA_META.CNTRY_NM);

	protected static final ConstMetaList<DlvInstHdrR> constMetas = new ConstMetaList<DlvInstHdrR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			rpt_sts_typ_nm_META,
			rpt_sts_typ_META,
			dlv_inst_no_META,
			dlv_inst_rev_META,
			print_hm_META,
			sppl_cd_META,
			sppl_zip_cd_META,
			sppl_addr1_META,
			sppl_addr2_META,
			sppl_addr3_META,
			sppl_addr4_META,
			sppl_addr_META,
			sppl_nm_META,
			sppl_alt_nm1_META,
			sppl_alt_nm2_META,
			sppl_alt_nm3_META,
			sppl_alt_nm4_META,
			sppl_cntct_dpt_META,
			sppl_cntct_psn_META,
			sppl_cntct_psn_title_META,
			sppl_tel_META,
			sppl_fax_META,
			sppl_cntry_nm_META,
			co_cd_META,
			co_nm_META,
			dpt_zip_cd_META,
			dpt_addr1_META,
			dpt_addr2_META,
			dpt_addr3_META,
			dpt_addr4_META,
			dpt_addr_META,
			dpt_tel_META,
			dpt_fax_META,
			purc_dpt_cd_META,
			purc_dpt_nm_META,
			dpt_cntry_nm_META,
			purc_usr_cd_META,
			purc_usr_nm_META,
			po_no_META,
			po_d_no_META,
			itm_cd_META,
			itm_sub1_view_META,
			itm_sub1_data_META,
			itm_sub2_view_META,
			itm_sub2_data_META,
			itm_sub3_view_META,
			itm_sub3_data_META,
			itm_nm_META,
			itm_alt_nm1_META,
			itm_alt_nm2_META,
			itm_alt_nm3_META,
			itm_alt_nm4_META,
			ver_no_lbl_META,
			ver_no_META,
			sno1_META,
			sno2_META,
			sno3_META,
			sno4_META,
			base_unit_qty_META,
			s_base_unit_qty_META,
			base_unit_cd_META,
			base_unit_nm_META,
			hdr_trd_unit_qty_META,
			s_hdr_trd_unit_qty_META,
			hdr_trd_unit_cd_META,
			hdr_trd_unit_nm_META,
			arr_qty_META,
			s_arr_qty_META,
			dlv_rqst_dt_META,
			dlv_rqst_tm_META,
			sppl_itm_cd_META,
			sppl_itm_nm_META,
			bp_lot_no_META,
			maker_cd_META,
			maker_nm_META,
			maker_alt_nm1_META,
			maker_alt_nm2_META,
			maker_alt_nm3_META,
			maker_alt_nm4_META,
			dlv_inst_dt_META,
			in_to_loc_cd_META,
			in_to_loc_nm_META,
			in_to_loc_alt_nm1_META,
			in_to_loc_alt_nm2_META,
			in_to_loc_alt_nm3_META,
			in_to_loc_alt_nm4_META,
			dlv_inst_prnt_rmrks_META,
			po_sub_char1_META,
			po_sub_char2_META,
			po_sub_char3_META,
			po_d_sub_char1_META,
			po_d_sub_char2_META,
			po_d_sub_char3_META,
			dlv_inst_sub_char1_META,
			dlv_inst_sub_char2_META,
			dlv_inst_sub_char3_META,
			in_to_loc_zip_cd_META,
			in_to_loc_addr1_META,
			in_to_loc_addr2_META,
			in_to_loc_addr3_META,
			in_to_loc_addr4_META,
			in_to_loc_addr_META,
			in_to_loc_tel_META,
			in_to_loc_fax_META,
			in_to_cntry_nm_META,
			dlv_zip_cd_META,
			dlv_addr1_META,
			dlv_addr2_META,
			dlv_addr3_META,
			dlv_addr4_META,
			dlv_addr_META,
			dlv_tel_META,
			dlv_fax_META,
			dlv_cntry_nm_META,
			tdlv_zip_cd_META,
			tdlv_addr1_META,
			tdlv_addr2_META,
			tdlv_addr3_META,
			tdlv_addr4_META,
			tdlv_addr_META,
			tdlv_tel_META,
			tdlv_fax_META,
			tdlv_cntry_nm_META
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
	protected DlvInstHdrR_MC_A(ConstMetaList<? extends DlvInstHdrR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public DlvInstHdrR clone() {
		return (DlvInstHdrR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public DlvInstHdrR createInstance() {
		return (DlvInstHdrR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public DlvInstHdrR getValues(String... names) {
		return (DlvInstHdrR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 *  帳票ステータス区分名.<p>
	 *
	 */
	public String rpt_sts_typ_nm() {
		return getConstString(offset + 0, $rpt_sts_typ_nm);
	}

	/**
	 *  帳票ステータス区分名.<p>
	 *
	 */
	public void rpt_sts_typ_nm(String value) {
		setConstString(offset + 0, $rpt_sts_typ_nm, value);
	}


	/**
	 *  帳票ステータス区分.<p>
	 *
	 */
	public String rpt_sts_typ() {
		return getConstString(offset + 1, $rpt_sts_typ);
	}

	/**
	 *  帳票ステータス区分.<p>
	 *
	 */
	public void rpt_sts_typ(String value) {
		setConstString(offset + 1, $rpt_sts_typ, value);
	}


	/**
	 *  納入指示ＮＯ.<p>
	 *
	 */
	public String dlv_inst_no() {
		return getConstString(offset + 2, $dlv_inst_no);
	}

	/**
	 *  納入指示ＮＯ.<p>
	 *
	 */
	public void dlv_inst_no(String value) {
		setConstString(offset + 2, $dlv_inst_no, value);
	}


	/**
	 *  納入指示リビジョン.<p>
	 *
	 */
	public MCNumber dlv_inst_rev() {
		return getConstNumber(offset + 3, $dlv_inst_rev);
	}

	/**
	 *  納入指示リビジョン.<p>
	 *
	 */
	public void dlv_inst_rev(MCNumber value) {
		setConstNumber(offset + 3, $dlv_inst_rev, value);
	}

	/**
	 *  納入指示リビジョン.<p>
	 *
	 */
	public void dlv_inst_rev(int value) {
		setConstNumber(offset + 3, $dlv_inst_rev, value);
	}

	/**
	 *  納入指示リビジョン.<p>
	 *
	 */
	public void dlv_inst_rev(long value) {
		setConstNumber(offset + 3, $dlv_inst_rev, value);
	}

	/**
	 *  納入指示リビジョン.<p>
	 *
	 */
	public void dlv_inst_rev(float value) {
		setConstNumber(offset + 3, $dlv_inst_rev, value);
	}

	/**
	 *  納入指示リビジョン.<p>
	 *
	 */
	public void dlv_inst_rev(double value) {
		setConstNumber(offset + 3, $dlv_inst_rev, value);
	}


	/**
	 *  発行日時.<p>
	 *
	 */
	public MCDate print_hm() {
		return getConstDate(offset + 4, $print_hm);
	}

	/**
	 *  発行日時.<p>
	 *
	 */
	public void print_hm(MCDate value) {
		setConstDate(offset + 4, $print_hm, value);
	}


	/**
	 *  発注先.<p>
	 *
	 */
	public String sppl_cd() {
		return getConstString(offset + 5, $sppl_cd);
	}

	/**
	 *  発注先.<p>
	 *
	 */
	public void sppl_cd(String value) {
		setConstString(offset + 5, $sppl_cd, value);
	}


	/**
	 *  発注先郵便番号.<p>
	 *
	 */
	public String sppl_zip_cd() {
		return getConstString(offset + 6, $sppl_zip_cd);
	}

	/**
	 *  発注先郵便番号.<p>
	 *
	 */
	public void sppl_zip_cd(String value) {
		setConstString(offset + 6, $sppl_zip_cd, value);
	}


	/**
	 *  発注先住所１.<p>
	 *
	 */
	public String sppl_addr1() {
		return getConstString(offset + 7, $sppl_addr1);
	}

	/**
	 *  発注先住所１.<p>
	 *
	 */
	public void sppl_addr1(String value) {
		setConstString(offset + 7, $sppl_addr1, value);
	}


	/**
	 *  発注先住所２.<p>
	 *
	 */
	public String sppl_addr2() {
		return getConstString(offset + 8, $sppl_addr2);
	}

	/**
	 *  発注先住所２.<p>
	 *
	 */
	public void sppl_addr2(String value) {
		setConstString(offset + 8, $sppl_addr2, value);
	}


	/**
	 *  発注先住所３.<p>
	 *
	 */
	public String sppl_addr3() {
		return getConstString(offset + 9, $sppl_addr3);
	}

	/**
	 *  発注先住所３.<p>
	 *
	 */
	public void sppl_addr3(String value) {
		setConstString(offset + 9, $sppl_addr3, value);
	}


	/**
	 *  発注先住所４.<p>
	 *
	 */
	public String sppl_addr4() {
		return getConstString(offset + 10, $sppl_addr4);
	}

	/**
	 *  発注先住所４.<p>
	 *
	 */
	public void sppl_addr4(String value) {
		setConstString(offset + 10, $sppl_addr4, value);
	}


	/**
	 *  発注先住所.<p>
	 *
	 */
	public String sppl_addr() {
		return getConstString(offset + 11, $sppl_addr);
	}

	/**
	 *  発注先住所.<p>
	 *
	 */
	public void sppl_addr(String value) {
		setConstString(offset + 11, $sppl_addr, value);
	}


	/**
	 *  発注先名.<p>
	 *
	 */
	public String sppl_nm() {
		return getConstString(offset + 12, $sppl_nm);
	}

	/**
	 *  発注先名.<p>
	 *
	 */
	public void sppl_nm(String value) {
		setConstString(offset + 12, $sppl_nm, value);
	}


	/**
	 *  発注先別名１.<p>
	 *
	 */
	public String sppl_alt_nm1() {
		return getConstString(offset + 13, $sppl_alt_nm1);
	}

	/**
	 *  発注先別名１.<p>
	 *
	 */
	public void sppl_alt_nm1(String value) {
		setConstString(offset + 13, $sppl_alt_nm1, value);
	}


	/**
	 *  発注先別名２.<p>
	 *
	 */
	public String sppl_alt_nm2() {
		return getConstString(offset + 14, $sppl_alt_nm2);
	}

	/**
	 *  発注先別名２.<p>
	 *
	 */
	public void sppl_alt_nm2(String value) {
		setConstString(offset + 14, $sppl_alt_nm2, value);
	}


	/**
	 *  発注先別名３.<p>
	 *
	 */
	public String sppl_alt_nm3() {
		return getConstString(offset + 15, $sppl_alt_nm3);
	}

	/**
	 *  発注先別名３.<p>
	 *
	 */
	public void sppl_alt_nm3(String value) {
		setConstString(offset + 15, $sppl_alt_nm3, value);
	}


	/**
	 *  発注先別名４.<p>
	 *
	 */
	public String sppl_alt_nm4() {
		return getConstString(offset + 16, $sppl_alt_nm4);
	}

	/**
	 *  発注先別名４.<p>
	 *
	 */
	public void sppl_alt_nm4(String value) {
		setConstString(offset + 16, $sppl_alt_nm4, value);
	}


	/**
	 *  発注先部署名.<p>
	 *
	 */
	public String sppl_cntct_dpt() {
		return getConstString(offset + 17, $sppl_cntct_dpt);
	}

	/**
	 *  発注先部署名.<p>
	 *
	 */
	public void sppl_cntct_dpt(String value) {
		setConstString(offset + 17, $sppl_cntct_dpt, value);
	}


	/**
	 *  発注先担当者.<p>
	 *
	 */
	public String sppl_cntct_psn() {
		return getConstString(offset + 18, $sppl_cntct_psn);
	}

	/**
	 *  発注先担当者.<p>
	 *
	 */
	public void sppl_cntct_psn(String value) {
		setConstString(offset + 18, $sppl_cntct_psn, value);
	}


	/**
	 *  発注先担当者敬称.<p>
	 *
	 */
	public String sppl_cntct_psn_title() {
		return getConstString(offset + 19, $sppl_cntct_psn_title);
	}

	/**
	 *  発注先担当者敬称.<p>
	 *
	 */
	public void sppl_cntct_psn_title(String value) {
		setConstString(offset + 19, $sppl_cntct_psn_title, value);
	}


	/**
	 *  ＴＥＬ（発注先）.<p>
	 *
	 */
	public String sppl_tel() {
		return getConstString(offset + 20, $sppl_tel);
	}

	/**
	 *  ＴＥＬ（発注先）.<p>
	 *
	 */
	public void sppl_tel(String value) {
		setConstString(offset + 20, $sppl_tel, value);
	}


	/**
	 *  ＦＡＸ（発注先）.<p>
	 *
	 */
	public String sppl_fax() {
		return getConstString(offset + 21, $sppl_fax);
	}

	/**
	 *  ＦＡＸ（発注先）.<p>
	 *
	 */
	public void sppl_fax(String value) {
		setConstString(offset + 21, $sppl_fax, value);
	}


	/**
	 *  発注先国名.<p>
	 *
	 */
	public String sppl_cntry_nm() {
		return getConstString(offset + 22, $sppl_cntry_nm);
	}

	/**
	 *  発注先国名.<p>
	 *
	 */
	public void sppl_cntry_nm(String value) {
		setConstString(offset + 22, $sppl_cntry_nm, value);
	}


	/**
	 *  会社.<p>
	 *
	 */
	public String co_cd() {
		return getConstString(offset + 23, $co_cd);
	}

	/**
	 *  会社.<p>
	 *
	 */
	public void co_cd(String value) {
		setConstString(offset + 23, $co_cd, value);
	}


	/**
	 *  会社名.<p>
	 *
	 */
	public String co_nm() {
		return getConstString(offset + 24, $co_nm);
	}

	/**
	 *  会社名.<p>
	 *
	 */
	public void co_nm(String value) {
		setConstString(offset + 24, $co_nm, value);
	}


	/**
	 *  部門郵便番号.<p>
	 *
	 */
	public String dpt_zip_cd() {
		return getConstString(offset + 25, $dpt_zip_cd);
	}

	/**
	 *  部門郵便番号.<p>
	 *
	 */
	public void dpt_zip_cd(String value) {
		setConstString(offset + 25, $dpt_zip_cd, value);
	}


	/**
	 *  部門住所１.<p>
	 *
	 */
	public String dpt_addr1() {
		return getConstString(offset + 26, $dpt_addr1);
	}

	/**
	 *  部門住所１.<p>
	 *
	 */
	public void dpt_addr1(String value) {
		setConstString(offset + 26, $dpt_addr1, value);
	}


	/**
	 *  部門住所２.<p>
	 *
	 */
	public String dpt_addr2() {
		return getConstString(offset + 27, $dpt_addr2);
	}

	/**
	 *  部門住所２.<p>
	 *
	 */
	public void dpt_addr2(String value) {
		setConstString(offset + 27, $dpt_addr2, value);
	}


	/**
	 *  部門住所３.<p>
	 *
	 */
	public String dpt_addr3() {
		return getConstString(offset + 28, $dpt_addr3);
	}

	/**
	 *  部門住所３.<p>
	 *
	 */
	public void dpt_addr3(String value) {
		setConstString(offset + 28, $dpt_addr3, value);
	}


	/**
	 *  部門住所４.<p>
	 *
	 */
	public String dpt_addr4() {
		return getConstString(offset + 29, $dpt_addr4);
	}

	/**
	 *  部門住所４.<p>
	 *
	 */
	public void dpt_addr4(String value) {
		setConstString(offset + 29, $dpt_addr4, value);
	}


	/**
	 *  部門住所.<p>
	 *
	 */
	public String dpt_addr() {
		return getConstString(offset + 30, $dpt_addr);
	}

	/**
	 *  部門住所.<p>
	 *
	 */
	public void dpt_addr(String value) {
		setConstString(offset + 30, $dpt_addr, value);
	}


	/**
	 *  部門ＴＥＬ.<p>
	 *
	 */
	public String dpt_tel() {
		return getConstString(offset + 31, $dpt_tel);
	}

	/**
	 *  部門ＴＥＬ.<p>
	 *
	 */
	public void dpt_tel(String value) {
		setConstString(offset + 31, $dpt_tel, value);
	}


	/**
	 *  部門ＦＡＸ.<p>
	 *
	 */
	public String dpt_fax() {
		return getConstString(offset + 32, $dpt_fax);
	}

	/**
	 *  部門ＦＡＸ.<p>
	 *
	 */
	public void dpt_fax(String value) {
		setConstString(offset + 32, $dpt_fax, value);
	}


	/**
	 *  部門.<p>
	 *
	 */
	public String purc_dpt_cd() {
		return getConstString(offset + 33, $purc_dpt_cd);
	}

	/**
	 *  部門.<p>
	 *
	 */
	public void purc_dpt_cd(String value) {
		setConstString(offset + 33, $purc_dpt_cd, value);
	}


	/**
	 *  部門名.<p>
	 *
	 */
	public String purc_dpt_nm() {
		return getConstString(offset + 34, $purc_dpt_nm);
	}

	/**
	 *  部門名.<p>
	 *
	 */
	public void purc_dpt_nm(String value) {
		setConstString(offset + 34, $purc_dpt_nm, value);
	}


	/**
	 *  部門国名.<p>
	 *
	 */
	public String dpt_cntry_nm() {
		return getConstString(offset + 35, $dpt_cntry_nm);
	}

	/**
	 *  部門国名.<p>
	 *
	 */
	public void dpt_cntry_nm(String value) {
		setConstString(offset + 35, $dpt_cntry_nm, value);
	}


	/**
	 *  担当者.<p>
	 *
	 */
	public String purc_usr_cd() {
		return getConstString(offset + 36, $purc_usr_cd);
	}

	/**
	 *  担当者.<p>
	 *
	 */
	public void purc_usr_cd(String value) {
		setConstString(offset + 36, $purc_usr_cd, value);
	}


	/**
	 *  担当者名.<p>
	 *
	 */
	public String purc_usr_nm() {
		return getConstString(offset + 37, $purc_usr_nm);
	}

	/**
	 *  担当者名.<p>
	 *
	 */
	public void purc_usr_nm(String value) {
		setConstString(offset + 37, $purc_usr_nm, value);
	}


	/**
	 *  発注ＮＯ.<p>
	 *
	 */
	public String po_no() {
		return getConstString(offset + 38, $po_no);
	}

	/**
	 *  発注ＮＯ.<p>
	 *
	 */
	public void po_no(String value) {
		setConstString(offset + 38, $po_no, value);
	}


	/**
	 *  発注明細ＮＯ.<p>
	 *
	 */
	public String po_d_no() {
		return getConstString(offset + 39, $po_d_no);
	}

	/**
	 *  発注明細ＮＯ.<p>
	 *
	 */
	public void po_d_no(String value) {
		setConstString(offset + 39, $po_d_no, value);
	}


	/**
	 *  弊社品目.<p>
	 *
	 */
	public String itm_cd() {
		return getConstString(offset + 40, $itm_cd);
	}

	/**
	 *  弊社品目.<p>
	 *
	 */
	public void itm_cd(String value) {
		setConstString(offset + 40, $itm_cd, value);
	}


	/**
	 *  枝番１（表示用）.<p>
	 *
	 */
	public String itm_sub1_view() {
		return getConstString(offset + 41, $itm_sub1_view);
	}

	/**
	 *  枝番１（表示用）.<p>
	 *
	 */
	public void itm_sub1_view(String value) {
		setConstString(offset + 41, $itm_sub1_view, value);
	}


	/**
	 *  枝番１（データ）.<p>
	 *
	 */
	public String itm_sub1_data() {
		return getConstString(offset + 42, $itm_sub1_data);
	}

	/**
	 *  枝番１（データ）.<p>
	 *
	 */
	public void itm_sub1_data(String value) {
		setConstString(offset + 42, $itm_sub1_data, value);
	}


	/**
	 *  枝番２（表示用）.<p>
	 *
	 */
	public String itm_sub2_view() {
		return getConstString(offset + 43, $itm_sub2_view);
	}

	/**
	 *  枝番２（表示用）.<p>
	 *
	 */
	public void itm_sub2_view(String value) {
		setConstString(offset + 43, $itm_sub2_view, value);
	}


	/**
	 *  枝番２（データ）.<p>
	 *
	 */
	public String itm_sub2_data() {
		return getConstString(offset + 44, $itm_sub2_data);
	}

	/**
	 *  枝番２（データ）.<p>
	 *
	 */
	public void itm_sub2_data(String value) {
		setConstString(offset + 44, $itm_sub2_data, value);
	}


	/**
	 *  枝番３（表示用）.<p>
	 *
	 */
	public String itm_sub3_view() {
		return getConstString(offset + 45, $itm_sub3_view);
	}

	/**
	 *  枝番３（表示用）.<p>
	 *
	 */
	public void itm_sub3_view(String value) {
		setConstString(offset + 45, $itm_sub3_view, value);
	}


	/**
	 *  枝番３（データ）.<p>
	 *
	 */
	public String itm_sub3_data() {
		return getConstString(offset + 46, $itm_sub3_data);
	}

	/**
	 *  枝番３（データ）.<p>
	 *
	 */
	public void itm_sub3_data(String value) {
		setConstString(offset + 46, $itm_sub3_data, value);
	}


	/**
	 *  弊社品名.<p>
	 *
	 */
	public String itm_nm() {
		return getConstString(offset + 47, $itm_nm);
	}

	/**
	 *  弊社品名.<p>
	 *
	 */
	public void itm_nm(String value) {
		setConstString(offset + 47, $itm_nm, value);
	}


	/**
	 *  弊社品目別名１.<p>
	 *
	 */
	public String itm_alt_nm1() {
		return getConstString(offset + 48, $itm_alt_nm1);
	}

	/**
	 *  弊社品目別名１.<p>
	 *
	 */
	public void itm_alt_nm1(String value) {
		setConstString(offset + 48, $itm_alt_nm1, value);
	}


	/**
	 *  弊社品目別名２.<p>
	 *
	 */
	public String itm_alt_nm2() {
		return getConstString(offset + 49, $itm_alt_nm2);
	}

	/**
	 *  弊社品目別名２.<p>
	 *
	 */
	public void itm_alt_nm2(String value) {
		setConstString(offset + 49, $itm_alt_nm2, value);
	}


	/**
	 *  弊社品目別名３.<p>
	 *
	 */
	public String itm_alt_nm3() {
		return getConstString(offset + 50, $itm_alt_nm3);
	}

	/**
	 *  弊社品目別名３.<p>
	 *
	 */
	public void itm_alt_nm3(String value) {
		setConstString(offset + 50, $itm_alt_nm3, value);
	}


	/**
	 *  弊社品目別名４.<p>
	 *
	 */
	public String itm_alt_nm4() {
		return getConstString(offset + 51, $itm_alt_nm4);
	}

	/**
	 *  弊社品目別名４.<p>
	 *
	 */
	public void itm_alt_nm4(String value) {
		setConstString(offset + 51, $itm_alt_nm4, value);
	}


	/**
	 *  版ＮＯ（ラベル）.<p>
	 *
	 */
	public String ver_no_lbl() {
		return getConstString(offset + 52, $ver_no_lbl);
	}

	/**
	 *  版ＮＯ（ラベル）.<p>
	 *
	 */
	public void ver_no_lbl(String value) {
		setConstString(offset + 52, $ver_no_lbl, value);
	}


	/**
	 *  版ＮＯ.<p>
	 *
	 */
	public String ver_no() {
		return getConstString(offset + 53, $ver_no);
	}

	/**
	 *  版ＮＯ.<p>
	 *
	 */
	public void ver_no(String value) {
		setConstString(offset + 53, $ver_no, value);
	}


	/**
	 *  手配ＮＯ１.<p>
	 *
	 */
	public String sno1() {
		return getConstString(offset + 54, $sno1);
	}

	/**
	 *  手配ＮＯ１.<p>
	 *
	 */
	public void sno1(String value) {
		setConstString(offset + 54, $sno1, value);
	}


	/**
	 *  手配ＮＯ２.<p>
	 *
	 */
	public String sno2() {
		return getConstString(offset + 55, $sno2);
	}

	/**
	 *  手配ＮＯ２.<p>
	 *
	 */
	public void sno2(String value) {
		setConstString(offset + 55, $sno2, value);
	}


	/**
	 *  手配ＮＯ３.<p>
	 *
	 */
	public String sno3() {
		return getConstString(offset + 56, $sno3);
	}

	/**
	 *  手配ＮＯ３.<p>
	 *
	 */
	public void sno3(String value) {
		setConstString(offset + 56, $sno3, value);
	}


	/**
	 *  手配ＮＯ４.<p>
	 *
	 */
	public String sno4() {
		return getConstString(offset + 57, $sno4);
	}

	/**
	 *  手配ＮＯ４.<p>
	 *
	 */
	public void sno4(String value) {
		setConstString(offset + 57, $sno4, value);
	}


	/**
	 *  基準単位発注数量.<p>
	 *
	 */
	public MCNumber base_unit_qty() {
		return getConstNumber(offset + 58, $base_unit_qty);
	}

	/**
	 *  基準単位発注数量.<p>
	 *
	 */
	public void base_unit_qty(MCNumber value) {
		setConstNumber(offset + 58, $base_unit_qty, value);
	}

	/**
	 *  基準単位発注数量.<p>
	 *
	 */
	public void base_unit_qty(int value) {
		setConstNumber(offset + 58, $base_unit_qty, value);
	}

	/**
	 *  基準単位発注数量.<p>
	 *
	 */
	public void base_unit_qty(long value) {
		setConstNumber(offset + 58, $base_unit_qty, value);
	}

	/**
	 *  基準単位発注数量.<p>
	 *
	 */
	public void base_unit_qty(float value) {
		setConstNumber(offset + 58, $base_unit_qty, value);
	}

	/**
	 *  基準単位発注数量.<p>
	 *
	 */
	public void base_unit_qty(double value) {
		setConstNumber(offset + 58, $base_unit_qty, value);
	}


	/**
	 *  基準単位発注数量文字列.<p>
	 *
	 */
	public String s_base_unit_qty() {
		return getConstString(offset + 59, $s_base_unit_qty);
	}

	/**
	 *  基準単位発注数量文字列.<p>
	 *
	 */
	public void s_base_unit_qty(String value) {
		setConstString(offset + 59, $s_base_unit_qty, value);
	}


	/**
	 *  基準単位.<p>
	 *
	 */
	public String base_unit_cd() {
		return getConstString(offset + 60, $base_unit_cd);
	}

	/**
	 *  基準単位.<p>
	 *
	 */
	public void base_unit_cd(String value) {
		setConstString(offset + 60, $base_unit_cd, value);
	}


	/**
	 *  基準単位名.<p>
	 *
	 */
	public String base_unit_nm() {
		return getConstString(offset + 61, $base_unit_nm);
	}

	/**
	 *  基準単位名.<p>
	 *
	 */
	public void base_unit_nm(String value) {
		setConstString(offset + 61, $base_unit_nm, value);
	}


	/**
	 *  発注数量.<p>
	 *
	 */
	public MCNumber hdr_trd_unit_qty() {
		return getConstNumber(offset + 62, $hdr_trd_unit_qty);
	}

	/**
	 *  発注数量.<p>
	 *
	 */
	public void hdr_trd_unit_qty(MCNumber value) {
		setConstNumber(offset + 62, $hdr_trd_unit_qty, value);
	}

	/**
	 *  発注数量.<p>
	 *
	 */
	public void hdr_trd_unit_qty(int value) {
		setConstNumber(offset + 62, $hdr_trd_unit_qty, value);
	}

	/**
	 *  発注数量.<p>
	 *
	 */
	public void hdr_trd_unit_qty(long value) {
		setConstNumber(offset + 62, $hdr_trd_unit_qty, value);
	}

	/**
	 *  発注数量.<p>
	 *
	 */
	public void hdr_trd_unit_qty(float value) {
		setConstNumber(offset + 62, $hdr_trd_unit_qty, value);
	}

	/**
	 *  発注数量.<p>
	 *
	 */
	public void hdr_trd_unit_qty(double value) {
		setConstNumber(offset + 62, $hdr_trd_unit_qty, value);
	}


	/**
	 *  発注数量文字列.<p>
	 *
	 */
	public String s_hdr_trd_unit_qty() {
		return getConstString(offset + 63, $s_hdr_trd_unit_qty);
	}

	/**
	 *  発注数量文字列.<p>
	 *
	 */
	public void s_hdr_trd_unit_qty(String value) {
		setConstString(offset + 63, $s_hdr_trd_unit_qty, value);
	}


	/**
	 *  単位.<p>
	 *
	 */
	public String hdr_trd_unit_cd() {
		return getConstString(offset + 64, $hdr_trd_unit_cd);
	}

	/**
	 *  単位.<p>
	 *
	 */
	public void hdr_trd_unit_cd(String value) {
		setConstString(offset + 64, $hdr_trd_unit_cd, value);
	}


	/**
	 *  発注単位名.<p>
	 *
	 */
	public String hdr_trd_unit_nm() {
		return getConstString(offset + 65, $hdr_trd_unit_nm);
	}

	/**
	 *  発注単位名.<p>
	 *
	 */
	public void hdr_trd_unit_nm(String value) {
		setConstString(offset + 65, $hdr_trd_unit_nm, value);
	}


	/**
	 *  入荷数量.<p>
	 *
	 */
	public MCNumber arr_qty() {
		return getConstNumber(offset + 66, $arr_qty);
	}

	/**
	 *  入荷数量.<p>
	 *
	 */
	public void arr_qty(MCNumber value) {
		setConstNumber(offset + 66, $arr_qty, value);
	}

	/**
	 *  入荷数量.<p>
	 *
	 */
	public void arr_qty(int value) {
		setConstNumber(offset + 66, $arr_qty, value);
	}

	/**
	 *  入荷数量.<p>
	 *
	 */
	public void arr_qty(long value) {
		setConstNumber(offset + 66, $arr_qty, value);
	}

	/**
	 *  入荷数量.<p>
	 *
	 */
	public void arr_qty(float value) {
		setConstNumber(offset + 66, $arr_qty, value);
	}

	/**
	 *  入荷数量.<p>
	 *
	 */
	public void arr_qty(double value) {
		setConstNumber(offset + 66, $arr_qty, value);
	}


	/**
	 *  入荷数量文字列.<p>
	 *
	 */
	public String s_arr_qty() {
		return getConstString(offset + 67, $s_arr_qty);
	}

	/**
	 *  入荷数量文字列.<p>
	 *
	 */
	public void s_arr_qty(String value) {
		setConstString(offset + 67, $s_arr_qty, value);
	}


	/**
	 *  注文書納期（日付）.<p>
	 *
	 */
	public MCDate dlv_rqst_dt() {
		return getConstDate(offset + 68, $dlv_rqst_dt);
	}

	/**
	 *  注文書納期（日付）.<p>
	 *
	 */
	public void dlv_rqst_dt(MCDate value) {
		setConstDate(offset + 68, $dlv_rqst_dt, value);
	}


	/**
	 *  注文書納期（時刻）.<p>
	 *
	 */
	public MCDate dlv_rqst_tm() {
		return getConstDate(offset + 69, $dlv_rqst_tm);
	}

	/**
	 *  注文書納期（時刻）.<p>
	 *
	 */
	public void dlv_rqst_tm(MCDate value) {
		setConstDate(offset + 69, $dlv_rqst_tm, value);
	}


	/**
	 *  貴社品目.<p>
	 *
	 */
	public String sppl_itm_cd() {
		return getConstString(offset + 70, $sppl_itm_cd);
	}

	/**
	 *  貴社品目.<p>
	 *
	 */
	public void sppl_itm_cd(String value) {
		setConstString(offset + 70, $sppl_itm_cd, value);
	}


	/**
	 *  貴社品名.<p>
	 *
	 */
	public String sppl_itm_nm() {
		return getConstString(offset + 71, $sppl_itm_nm);
	}

	/**
	 *  貴社品名.<p>
	 *
	 */
	public void sppl_itm_nm(String value) {
		setConstString(offset + 71, $sppl_itm_nm, value);
	}


	/**
	 *  貴社ロットＮＯ.<p>
	 *
	 */
	public String bp_lot_no() {
		return getConstString(offset + 72, $bp_lot_no);
	}

	/**
	 *  貴社ロットＮＯ.<p>
	 *
	 */
	public void bp_lot_no(String value) {
		setConstString(offset + 72, $bp_lot_no, value);
	}


	/**
	 *  メーカ.<p>
	 *
	 */
	public String maker_cd() {
		return getConstString(offset + 73, $maker_cd);
	}

	/**
	 *  メーカ.<p>
	 *
	 */
	public void maker_cd(String value) {
		setConstString(offset + 73, $maker_cd, value);
	}


	/**
	 *  メーカ名.<p>
	 *
	 */
	public String maker_nm() {
		return getConstString(offset + 74, $maker_nm);
	}

	/**
	 *  メーカ名.<p>
	 *
	 */
	public void maker_nm(String value) {
		setConstString(offset + 74, $maker_nm, value);
	}


	/**
	 *  メーカ別名１.<p>
	 *
	 */
	public String maker_alt_nm1() {
		return getConstString(offset + 75, $maker_alt_nm1);
	}

	/**
	 *  メーカ別名１.<p>
	 *
	 */
	public void maker_alt_nm1(String value) {
		setConstString(offset + 75, $maker_alt_nm1, value);
	}


	/**
	 *  メーカ別名２.<p>
	 *
	 */
	public String maker_alt_nm2() {
		return getConstString(offset + 76, $maker_alt_nm2);
	}

	/**
	 *  メーカ別名２.<p>
	 *
	 */
	public void maker_alt_nm2(String value) {
		setConstString(offset + 76, $maker_alt_nm2, value);
	}


	/**
	 *  メーカ別名３.<p>
	 *
	 */
	public String maker_alt_nm3() {
		return getConstString(offset + 77, $maker_alt_nm3);
	}

	/**
	 *  メーカ別名３.<p>
	 *
	 */
	public void maker_alt_nm3(String value) {
		setConstString(offset + 77, $maker_alt_nm3, value);
	}


	/**
	 *  メーカ別名４.<p>
	 *
	 */
	public String maker_alt_nm4() {
		return getConstString(offset + 78, $maker_alt_nm4);
	}

	/**
	 *  メーカ別名４.<p>
	 *
	 */
	public void maker_alt_nm4(String value) {
		setConstString(offset + 78, $maker_alt_nm4, value);
	}


	/**
	 *  納入指示日.<p>
	 *
	 */
	public MCDate dlv_inst_dt() {
		return getConstDate(offset + 79, $dlv_inst_dt);
	}

	/**
	 *  納入指示日.<p>
	 *
	 */
	public void dlv_inst_dt(MCDate value) {
		setConstDate(offset + 79, $dlv_inst_dt, value);
	}


	/**
	 *  納入場所.<p>
	 *
	 */
	public String in_to_loc_cd() {
		return getConstString(offset + 80, $in_to_loc_cd);
	}

	/**
	 *  納入場所.<p>
	 *
	 */
	public void in_to_loc_cd(String value) {
		setConstString(offset + 80, $in_to_loc_cd, value);
	}


	/**
	 *  納入場所名.<p>
	 *
	 */
	public String in_to_loc_nm() {
		return getConstString(offset + 81, $in_to_loc_nm);
	}

	/**
	 *  納入場所名.<p>
	 *
	 */
	public void in_to_loc_nm(String value) {
		setConstString(offset + 81, $in_to_loc_nm, value);
	}


	/**
	 *  納入場所別名１.<p>
	 *
	 */
	public String in_to_loc_alt_nm1() {
		return getConstString(offset + 82, $in_to_loc_alt_nm1);
	}

	/**
	 *  納入場所別名１.<p>
	 *
	 */
	public void in_to_loc_alt_nm1(String value) {
		setConstString(offset + 82, $in_to_loc_alt_nm1, value);
	}


	/**
	 *  納入場所別名２.<p>
	 *
	 */
	public String in_to_loc_alt_nm2() {
		return getConstString(offset + 83, $in_to_loc_alt_nm2);
	}

	/**
	 *  納入場所別名２.<p>
	 *
	 */
	public void in_to_loc_alt_nm2(String value) {
		setConstString(offset + 83, $in_to_loc_alt_nm2, value);
	}


	/**
	 *  納入場所別名３.<p>
	 *
	 */
	public String in_to_loc_alt_nm3() {
		return getConstString(offset + 84, $in_to_loc_alt_nm3);
	}

	/**
	 *  納入場所別名３.<p>
	 *
	 */
	public void in_to_loc_alt_nm3(String value) {
		setConstString(offset + 84, $in_to_loc_alt_nm3, value);
	}


	/**
	 *  納入場所別名４.<p>
	 *
	 */
	public String in_to_loc_alt_nm4() {
		return getConstString(offset + 85, $in_to_loc_alt_nm4);
	}

	/**
	 *  納入場所別名４.<p>
	 *
	 */
	public void in_to_loc_alt_nm4(String value) {
		setConstString(offset + 85, $in_to_loc_alt_nm4, value);
	}


	/**
	 *  備考.<p>
	 *
	 */
	public String dlv_inst_prnt_rmrks() {
		return getConstString(offset + 86, $dlv_inst_prnt_rmrks);
	}

	/**
	 *  備考.<p>
	 *
	 */
	public void dlv_inst_prnt_rmrks(String value) {
		setConstString(offset + 86, $dlv_inst_prnt_rmrks, value);
	}


	/**
	 *  発注予備１.<p>
	 *
	 */
	public String po_sub_char1() {
		return getConstString(offset + 87, $po_sub_char1);
	}

	/**
	 *  発注予備１.<p>
	 *
	 */
	public void po_sub_char1(String value) {
		setConstString(offset + 87, $po_sub_char1, value);
	}


	/**
	 *  発注予備２.<p>
	 *
	 */
	public String po_sub_char2() {
		return getConstString(offset + 88, $po_sub_char2);
	}

	/**
	 *  発注予備２.<p>
	 *
	 */
	public void po_sub_char2(String value) {
		setConstString(offset + 88, $po_sub_char2, value);
	}


	/**
	 *  発注予備３.<p>
	 *
	 */
	public String po_sub_char3() {
		return getConstString(offset + 89, $po_sub_char3);
	}

	/**
	 *  発注予備３.<p>
	 *
	 */
	public void po_sub_char3(String value) {
		setConstString(offset + 89, $po_sub_char3, value);
	}


	/**
	 *  発注明細予備１.<p>
	 *
	 */
	public String po_d_sub_char1() {
		return getConstString(offset + 90, $po_d_sub_char1);
	}

	/**
	 *  発注明細予備１.<p>
	 *
	 */
	public void po_d_sub_char1(String value) {
		setConstString(offset + 90, $po_d_sub_char1, value);
	}


	/**
	 *  発注明細予備２.<p>
	 *
	 */
	public String po_d_sub_char2() {
		return getConstString(offset + 91, $po_d_sub_char2);
	}

	/**
	 *  発注明細予備２.<p>
	 *
	 */
	public void po_d_sub_char2(String value) {
		setConstString(offset + 91, $po_d_sub_char2, value);
	}


	/**
	 *  発注明細予備３.<p>
	 *
	 */
	public String po_d_sub_char3() {
		return getConstString(offset + 92, $po_d_sub_char3);
	}

	/**
	 *  発注明細予備３.<p>
	 *
	 */
	public void po_d_sub_char3(String value) {
		setConstString(offset + 92, $po_d_sub_char3, value);
	}


	/**
	 *  納入指示予備１.<p>
	 *
	 */
	public String dlv_inst_sub_char1() {
		return getConstString(offset + 93, $dlv_inst_sub_char1);
	}

	/**
	 *  納入指示予備１.<p>
	 *
	 */
	public void dlv_inst_sub_char1(String value) {
		setConstString(offset + 93, $dlv_inst_sub_char1, value);
	}


	/**
	 *  納入指示予備２.<p>
	 *
	 */
	public String dlv_inst_sub_char2() {
		return getConstString(offset + 94, $dlv_inst_sub_char2);
	}

	/**
	 *  納入指示予備２.<p>
	 *
	 */
	public void dlv_inst_sub_char2(String value) {
		setConstString(offset + 94, $dlv_inst_sub_char2, value);
	}


	/**
	 *  納入指示予備３.<p>
	 *
	 */
	public String dlv_inst_sub_char3() {
		return getConstString(offset + 95, $dlv_inst_sub_char3);
	}

	/**
	 *  納入指示予備３.<p>
	 *
	 */
	public void dlv_inst_sub_char3(String value) {
		setConstString(offset + 95, $dlv_inst_sub_char3, value);
	}


	/**
	 *  納入場所郵便番号.<p>
	 *
	 */
	public String in_to_loc_zip_cd() {
		return getConstString(offset + 96, $in_to_loc_zip_cd);
	}

	/**
	 *  納入場所郵便番号.<p>
	 *
	 */
	public void in_to_loc_zip_cd(String value) {
		setConstString(offset + 96, $in_to_loc_zip_cd, value);
	}


	/**
	 *  納入場所住所１.<p>
	 *
	 */
	public String in_to_loc_addr1() {
		return getConstString(offset + 97, $in_to_loc_addr1);
	}

	/**
	 *  納入場所住所１.<p>
	 *
	 */
	public void in_to_loc_addr1(String value) {
		setConstString(offset + 97, $in_to_loc_addr1, value);
	}


	/**
	 *  納入場所住所２.<p>
	 *
	 */
	public String in_to_loc_addr2() {
		return getConstString(offset + 98, $in_to_loc_addr2);
	}

	/**
	 *  納入場所住所２.<p>
	 *
	 */
	public void in_to_loc_addr2(String value) {
		setConstString(offset + 98, $in_to_loc_addr2, value);
	}


	/**
	 *  納入場所住所３.<p>
	 *
	 */
	public String in_to_loc_addr3() {
		return getConstString(offset + 99, $in_to_loc_addr3);
	}

	/**
	 *  納入場所住所３.<p>
	 *
	 */
	public void in_to_loc_addr3(String value) {
		setConstString(offset + 99, $in_to_loc_addr3, value);
	}


	/**
	 *  納入場所住所４.<p>
	 *
	 */
	public String in_to_loc_addr4() {
		return getConstString(offset + 100, $in_to_loc_addr4);
	}

	/**
	 *  納入場所住所４.<p>
	 *
	 */
	public void in_to_loc_addr4(String value) {
		setConstString(offset + 100, $in_to_loc_addr4, value);
	}


	/**
	 *  納入場所住所１－４（データ用）.<p>
	 *
	 */
	public String in_to_loc_addr() {
		return getConstString(offset + 101, $in_to_loc_addr);
	}

	/**
	 *  納入場所住所１－４（データ用）.<p>
	 *
	 */
	public void in_to_loc_addr(String value) {
		setConstString(offset + 101, $in_to_loc_addr, value);
	}


	/**
	 *  納入場所ＴＥＬ.<p>
	 *
	 */
	public String in_to_loc_tel() {
		return getConstString(offset + 102, $in_to_loc_tel);
	}

	/**
	 *  納入場所ＴＥＬ.<p>
	 *
	 */
	public void in_to_loc_tel(String value) {
		setConstString(offset + 102, $in_to_loc_tel, value);
	}


	/**
	 *  納入場所ＦＡＸ.<p>
	 *
	 */
	public String in_to_loc_fax() {
		return getConstString(offset + 103, $in_to_loc_fax);
	}

	/**
	 *  納入場所ＦＡＸ.<p>
	 *
	 */
	public void in_to_loc_fax(String value) {
		setConstString(offset + 103, $in_to_loc_fax, value);
	}


	/**
	 *  納入場所国名.<p>
	 *
	 */
	public String in_to_cntry_nm() {
		return getConstString(offset + 104, $in_to_cntry_nm);
	}

	/**
	 *  納入場所国名.<p>
	 *
	 */
	public void in_to_cntry_nm(String value) {
		setConstString(offset + 104, $in_to_cntry_nm, value);
	}


	/**
	 *  納品先郵便番号.<p>
	 *
	 */
	public String dlv_zip_cd() {
		return getConstString(offset + 105, $dlv_zip_cd);
	}

	/**
	 *  納品先郵便番号.<p>
	 *
	 */
	public void dlv_zip_cd(String value) {
		setConstString(offset + 105, $dlv_zip_cd, value);
	}


	/**
	 *  納品先住所１.<p>
	 *
	 */
	public String dlv_addr1() {
		return getConstString(offset + 106, $dlv_addr1);
	}

	/**
	 *  納品先住所１.<p>
	 *
	 */
	public void dlv_addr1(String value) {
		setConstString(offset + 106, $dlv_addr1, value);
	}


	/**
	 *  納品先住所２.<p>
	 *
	 */
	public String dlv_addr2() {
		return getConstString(offset + 107, $dlv_addr2);
	}

	/**
	 *  納品先住所２.<p>
	 *
	 */
	public void dlv_addr2(String value) {
		setConstString(offset + 107, $dlv_addr2, value);
	}


	/**
	 *  納品先住所３.<p>
	 *
	 */
	public String dlv_addr3() {
		return getConstString(offset + 108, $dlv_addr3);
	}

	/**
	 *  納品先住所３.<p>
	 *
	 */
	public void dlv_addr3(String value) {
		setConstString(offset + 108, $dlv_addr3, value);
	}


	/**
	 *  納品先住所４.<p>
	 *
	 */
	public String dlv_addr4() {
		return getConstString(offset + 109, $dlv_addr4);
	}

	/**
	 *  納品先住所４.<p>
	 *
	 */
	public void dlv_addr4(String value) {
		setConstString(offset + 109, $dlv_addr4, value);
	}


	/**
	 *  納品先住所１－４（データ用）.<p>
	 *
	 */
	public String dlv_addr() {
		return getConstString(offset + 110, $dlv_addr);
	}

	/**
	 *  納品先住所１－４（データ用）.<p>
	 *
	 */
	public void dlv_addr(String value) {
		setConstString(offset + 110, $dlv_addr, value);
	}


	/**
	 *  納品先ＴＥＬ.<p>
	 *
	 */
	public String dlv_tel() {
		return getConstString(offset + 111, $dlv_tel);
	}

	/**
	 *  納品先ＴＥＬ.<p>
	 *
	 */
	public void dlv_tel(String value) {
		setConstString(offset + 111, $dlv_tel, value);
	}


	/**
	 *  納品先ＦＡＸ.<p>
	 *
	 */
	public String dlv_fax() {
		return getConstString(offset + 112, $dlv_fax);
	}

	/**
	 *  納品先ＦＡＸ.<p>
	 *
	 */
	public void dlv_fax(String value) {
		setConstString(offset + 112, $dlv_fax, value);
	}


	/**
	 *  納品先国名.<p>
	 *
	 */
	public String dlv_cntry_nm() {
		return getConstString(offset + 113, $dlv_cntry_nm);
	}

	/**
	 *  納品先国名.<p>
	 *
	 */
	public void dlv_cntry_nm(String value) {
		setConstString(offset + 113, $dlv_cntry_nm, value);
	}


	/**
	 *  配送先郵便番号.<p>
	 *
	 */
	public String tdlv_zip_cd() {
		return getConstString(offset + 114, $tdlv_zip_cd);
	}

	/**
	 *  配送先郵便番号.<p>
	 *
	 */
	public void tdlv_zip_cd(String value) {
		setConstString(offset + 114, $tdlv_zip_cd, value);
	}


	/**
	 *  配送先住所１.<p>
	 *
	 */
	public String tdlv_addr1() {
		return getConstString(offset + 115, $tdlv_addr1);
	}

	/**
	 *  配送先住所１.<p>
	 *
	 */
	public void tdlv_addr1(String value) {
		setConstString(offset + 115, $tdlv_addr1, value);
	}


	/**
	 *  配送先住所２.<p>
	 *
	 */
	public String tdlv_addr2() {
		return getConstString(offset + 116, $tdlv_addr2);
	}

	/**
	 *  配送先住所２.<p>
	 *
	 */
	public void tdlv_addr2(String value) {
		setConstString(offset + 116, $tdlv_addr2, value);
	}


	/**
	 *  配送先住所３.<p>
	 *
	 */
	public String tdlv_addr3() {
		return getConstString(offset + 117, $tdlv_addr3);
	}

	/**
	 *  配送先住所３.<p>
	 *
	 */
	public void tdlv_addr3(String value) {
		setConstString(offset + 117, $tdlv_addr3, value);
	}


	/**
	 *  配送先住所４.<p>
	 *
	 */
	public String tdlv_addr4() {
		return getConstString(offset + 118, $tdlv_addr4);
	}

	/**
	 *  配送先住所４.<p>
	 *
	 */
	public void tdlv_addr4(String value) {
		setConstString(offset + 118, $tdlv_addr4, value);
	}


	/**
	 *  配送先住所１－４（データ用）.<p>
	 *
	 */
	public String tdlv_addr() {
		return getConstString(offset + 119, $tdlv_addr);
	}

	/**
	 *  配送先住所１－４（データ用）.<p>
	 *
	 */
	public void tdlv_addr(String value) {
		setConstString(offset + 119, $tdlv_addr, value);
	}


	/**
	 *  配送先ＴＥＬ.<p>
	 *
	 */
	public String tdlv_tel() {
		return getConstString(offset + 120, $tdlv_tel);
	}

	/**
	 *  配送先ＴＥＬ.<p>
	 *
	 */
	public void tdlv_tel(String value) {
		setConstString(offset + 120, $tdlv_tel, value);
	}


	/**
	 *  配送先ＦＡＸ.<p>
	 *
	 */
	public String tdlv_fax() {
		return getConstString(offset + 121, $tdlv_fax);
	}

	/**
	 *  配送先ＦＡＸ.<p>
	 *
	 */
	public void tdlv_fax(String value) {
		setConstString(offset + 121, $tdlv_fax, value);
	}


	/**
	 *  配送先国名.<p>
	 *
	 */
	public String tdlv_cntry_nm() {
		return getConstString(offset + 122, $tdlv_cntry_nm);
	}

	/**
	 *  配送先国名.<p>
	 *
	 */
	public void tdlv_cntry_nm(String value) {
		setConstString(offset + 122, $tdlv_cntry_nm, value);
	}


	public String getString(String name) {
		if ($rpt_sts_typ_nm.equalsIgnoreCase(name)) {
			return rpt_sts_typ_nm();
		}
		if ($rpt_sts_typ.equalsIgnoreCase(name)) {
			return rpt_sts_typ();
		}
		if ($dlv_inst_no.equalsIgnoreCase(name)) {
			return dlv_inst_no();
		}
		if ($sppl_cd.equalsIgnoreCase(name)) {
			return sppl_cd();
		}
		if ($sppl_zip_cd.equalsIgnoreCase(name)) {
			return sppl_zip_cd();
		}
		if ($sppl_addr1.equalsIgnoreCase(name)) {
			return sppl_addr1();
		}
		if ($sppl_addr2.equalsIgnoreCase(name)) {
			return sppl_addr2();
		}
		if ($sppl_addr3.equalsIgnoreCase(name)) {
			return sppl_addr3();
		}
		if ($sppl_addr4.equalsIgnoreCase(name)) {
			return sppl_addr4();
		}
		if ($sppl_addr.equalsIgnoreCase(name)) {
			return sppl_addr();
		}
		if ($sppl_nm.equalsIgnoreCase(name)) {
			return sppl_nm();
		}
		if ($sppl_alt_nm1.equalsIgnoreCase(name)) {
			return sppl_alt_nm1();
		}
		if ($sppl_alt_nm2.equalsIgnoreCase(name)) {
			return sppl_alt_nm2();
		}
		if ($sppl_alt_nm3.equalsIgnoreCase(name)) {
			return sppl_alt_nm3();
		}
		if ($sppl_alt_nm4.equalsIgnoreCase(name)) {
			return sppl_alt_nm4();
		}
		if ($sppl_cntct_dpt.equalsIgnoreCase(name)) {
			return sppl_cntct_dpt();
		}
		if ($sppl_cntct_psn.equalsIgnoreCase(name)) {
			return sppl_cntct_psn();
		}
		if ($sppl_cntct_psn_title.equalsIgnoreCase(name)) {
			return sppl_cntct_psn_title();
		}
		if ($sppl_tel.equalsIgnoreCase(name)) {
			return sppl_tel();
		}
		if ($sppl_fax.equalsIgnoreCase(name)) {
			return sppl_fax();
		}
		if ($sppl_cntry_nm.equalsIgnoreCase(name)) {
			return sppl_cntry_nm();
		}
		if ($co_cd.equalsIgnoreCase(name)) {
			return co_cd();
		}
		if ($co_nm.equalsIgnoreCase(name)) {
			return co_nm();
		}
		if ($dpt_zip_cd.equalsIgnoreCase(name)) {
			return dpt_zip_cd();
		}
		if ($dpt_addr1.equalsIgnoreCase(name)) {
			return dpt_addr1();
		}
		if ($dpt_addr2.equalsIgnoreCase(name)) {
			return dpt_addr2();
		}
		if ($dpt_addr3.equalsIgnoreCase(name)) {
			return dpt_addr3();
		}
		if ($dpt_addr4.equalsIgnoreCase(name)) {
			return dpt_addr4();
		}
		if ($dpt_addr.equalsIgnoreCase(name)) {
			return dpt_addr();
		}
		if ($dpt_tel.equalsIgnoreCase(name)) {
			return dpt_tel();
		}
		if ($dpt_fax.equalsIgnoreCase(name)) {
			return dpt_fax();
		}
		if ($purc_dpt_cd.equalsIgnoreCase(name)) {
			return purc_dpt_cd();
		}
		if ($purc_dpt_nm.equalsIgnoreCase(name)) {
			return purc_dpt_nm();
		}
		if ($dpt_cntry_nm.equalsIgnoreCase(name)) {
			return dpt_cntry_nm();
		}
		if ($purc_usr_cd.equalsIgnoreCase(name)) {
			return purc_usr_cd();
		}
		if ($purc_usr_nm.equalsIgnoreCase(name)) {
			return purc_usr_nm();
		}
		if ($po_no.equalsIgnoreCase(name)) {
			return po_no();
		}
		if ($po_d_no.equalsIgnoreCase(name)) {
			return po_d_no();
		}
		if ($itm_cd.equalsIgnoreCase(name)) {
			return itm_cd();
		}
		if ($itm_sub1_view.equalsIgnoreCase(name)) {
			return itm_sub1_view();
		}
		if ($itm_sub1_data.equalsIgnoreCase(name)) {
			return itm_sub1_data();
		}
		if ($itm_sub2_view.equalsIgnoreCase(name)) {
			return itm_sub2_view();
		}
		if ($itm_sub2_data.equalsIgnoreCase(name)) {
			return itm_sub2_data();
		}
		if ($itm_sub3_view.equalsIgnoreCase(name)) {
			return itm_sub3_view();
		}
		if ($itm_sub3_data.equalsIgnoreCase(name)) {
			return itm_sub3_data();
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
		if ($ver_no_lbl.equalsIgnoreCase(name)) {
			return ver_no_lbl();
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
		if ($s_base_unit_qty.equalsIgnoreCase(name)) {
			return s_base_unit_qty();
		}
		if ($base_unit_cd.equalsIgnoreCase(name)) {
			return base_unit_cd();
		}
		if ($base_unit_nm.equalsIgnoreCase(name)) {
			return base_unit_nm();
		}
		if ($s_hdr_trd_unit_qty.equalsIgnoreCase(name)) {
			return s_hdr_trd_unit_qty();
		}
		if ($hdr_trd_unit_cd.equalsIgnoreCase(name)) {
			return hdr_trd_unit_cd();
		}
		if ($hdr_trd_unit_nm.equalsIgnoreCase(name)) {
			return hdr_trd_unit_nm();
		}
		if ($s_arr_qty.equalsIgnoreCase(name)) {
			return s_arr_qty();
		}
		if ($sppl_itm_cd.equalsIgnoreCase(name)) {
			return sppl_itm_cd();
		}
		if ($sppl_itm_nm.equalsIgnoreCase(name)) {
			return sppl_itm_nm();
		}
		if ($bp_lot_no.equalsIgnoreCase(name)) {
			return bp_lot_no();
		}
		if ($maker_cd.equalsIgnoreCase(name)) {
			return maker_cd();
		}
		if ($maker_nm.equalsIgnoreCase(name)) {
			return maker_nm();
		}
		if ($maker_alt_nm1.equalsIgnoreCase(name)) {
			return maker_alt_nm1();
		}
		if ($maker_alt_nm2.equalsIgnoreCase(name)) {
			return maker_alt_nm2();
		}
		if ($maker_alt_nm3.equalsIgnoreCase(name)) {
			return maker_alt_nm3();
		}
		if ($maker_alt_nm4.equalsIgnoreCase(name)) {
			return maker_alt_nm4();
		}
		if ($in_to_loc_cd.equalsIgnoreCase(name)) {
			return in_to_loc_cd();
		}
		if ($in_to_loc_nm.equalsIgnoreCase(name)) {
			return in_to_loc_nm();
		}
		if ($in_to_loc_alt_nm1.equalsIgnoreCase(name)) {
			return in_to_loc_alt_nm1();
		}
		if ($in_to_loc_alt_nm2.equalsIgnoreCase(name)) {
			return in_to_loc_alt_nm2();
		}
		if ($in_to_loc_alt_nm3.equalsIgnoreCase(name)) {
			return in_to_loc_alt_nm3();
		}
		if ($in_to_loc_alt_nm4.equalsIgnoreCase(name)) {
			return in_to_loc_alt_nm4();
		}
		if ($dlv_inst_prnt_rmrks.equalsIgnoreCase(name)) {
			return dlv_inst_prnt_rmrks();
		}
		if ($po_sub_char1.equalsIgnoreCase(name)) {
			return po_sub_char1();
		}
		if ($po_sub_char2.equalsIgnoreCase(name)) {
			return po_sub_char2();
		}
		if ($po_sub_char3.equalsIgnoreCase(name)) {
			return po_sub_char3();
		}
		if ($po_d_sub_char1.equalsIgnoreCase(name)) {
			return po_d_sub_char1();
		}
		if ($po_d_sub_char2.equalsIgnoreCase(name)) {
			return po_d_sub_char2();
		}
		if ($po_d_sub_char3.equalsIgnoreCase(name)) {
			return po_d_sub_char3();
		}
		if ($dlv_inst_sub_char1.equalsIgnoreCase(name)) {
			return dlv_inst_sub_char1();
		}
		if ($dlv_inst_sub_char2.equalsIgnoreCase(name)) {
			return dlv_inst_sub_char2();
		}
		if ($dlv_inst_sub_char3.equalsIgnoreCase(name)) {
			return dlv_inst_sub_char3();
		}
		if ($in_to_loc_zip_cd.equalsIgnoreCase(name)) {
			return in_to_loc_zip_cd();
		}
		if ($in_to_loc_addr1.equalsIgnoreCase(name)) {
			return in_to_loc_addr1();
		}
		if ($in_to_loc_addr2.equalsIgnoreCase(name)) {
			return in_to_loc_addr2();
		}
		if ($in_to_loc_addr3.equalsIgnoreCase(name)) {
			return in_to_loc_addr3();
		}
		if ($in_to_loc_addr4.equalsIgnoreCase(name)) {
			return in_to_loc_addr4();
		}
		if ($in_to_loc_addr.equalsIgnoreCase(name)) {
			return in_to_loc_addr();
		}
		if ($in_to_loc_tel.equalsIgnoreCase(name)) {
			return in_to_loc_tel();
		}
		if ($in_to_loc_fax.equalsIgnoreCase(name)) {
			return in_to_loc_fax();
		}
		if ($in_to_cntry_nm.equalsIgnoreCase(name)) {
			return in_to_cntry_nm();
		}
		if ($dlv_zip_cd.equalsIgnoreCase(name)) {
			return dlv_zip_cd();
		}
		if ($dlv_addr1.equalsIgnoreCase(name)) {
			return dlv_addr1();
		}
		if ($dlv_addr2.equalsIgnoreCase(name)) {
			return dlv_addr2();
		}
		if ($dlv_addr3.equalsIgnoreCase(name)) {
			return dlv_addr3();
		}
		if ($dlv_addr4.equalsIgnoreCase(name)) {
			return dlv_addr4();
		}
		if ($dlv_addr.equalsIgnoreCase(name)) {
			return dlv_addr();
		}
		if ($dlv_tel.equalsIgnoreCase(name)) {
			return dlv_tel();
		}
		if ($dlv_fax.equalsIgnoreCase(name)) {
			return dlv_fax();
		}
		if ($dlv_cntry_nm.equalsIgnoreCase(name)) {
			return dlv_cntry_nm();
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
		if ($tdlv_addr.equalsIgnoreCase(name)) {
			return tdlv_addr();
		}
		if ($tdlv_tel.equalsIgnoreCase(name)) {
			return tdlv_tel();
		}
		if ($tdlv_fax.equalsIgnoreCase(name)) {
			return tdlv_fax();
		}
		if ($tdlv_cntry_nm.equalsIgnoreCase(name)) {
			return tdlv_cntry_nm();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($dlv_inst_rev.equalsIgnoreCase(name)) {
			return dlv_inst_rev();
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			return base_unit_qty();
		}
		if ($hdr_trd_unit_qty.equalsIgnoreCase(name)) {
			return hdr_trd_unit_qty();
		}
		if ($arr_qty.equalsIgnoreCase(name)) {
			return arr_qty();
		}
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		if ($print_hm.equalsIgnoreCase(name)) {
			return print_hm();
		}
		if ($dlv_rqst_dt.equalsIgnoreCase(name)) {
			return dlv_rqst_dt();
		}
		if ($dlv_rqst_tm.equalsIgnoreCase(name)) {
			return dlv_rqst_tm();
		}
		if ($dlv_inst_dt.equalsIgnoreCase(name)) {
			return dlv_inst_dt();
		}
		return super.getDate(name);
	}

	public String getStringNE(String name) {
		if ($rpt_sts_typ_nm.equalsIgnoreCase(name)) {
			return rpt_sts_typ_nm();
		}
		if ($rpt_sts_typ.equalsIgnoreCase(name)) {
			return rpt_sts_typ();
		}
		if ($dlv_inst_no.equalsIgnoreCase(name)) {
			return dlv_inst_no();
		}
		if ($sppl_cd.equalsIgnoreCase(name)) {
			return sppl_cd();
		}
		if ($sppl_zip_cd.equalsIgnoreCase(name)) {
			return sppl_zip_cd();
		}
		if ($sppl_addr1.equalsIgnoreCase(name)) {
			return sppl_addr1();
		}
		if ($sppl_addr2.equalsIgnoreCase(name)) {
			return sppl_addr2();
		}
		if ($sppl_addr3.equalsIgnoreCase(name)) {
			return sppl_addr3();
		}
		if ($sppl_addr4.equalsIgnoreCase(name)) {
			return sppl_addr4();
		}
		if ($sppl_addr.equalsIgnoreCase(name)) {
			return sppl_addr();
		}
		if ($sppl_nm.equalsIgnoreCase(name)) {
			return sppl_nm();
		}
		if ($sppl_alt_nm1.equalsIgnoreCase(name)) {
			return sppl_alt_nm1();
		}
		if ($sppl_alt_nm2.equalsIgnoreCase(name)) {
			return sppl_alt_nm2();
		}
		if ($sppl_alt_nm3.equalsIgnoreCase(name)) {
			return sppl_alt_nm3();
		}
		if ($sppl_alt_nm4.equalsIgnoreCase(name)) {
			return sppl_alt_nm4();
		}
		if ($sppl_cntct_dpt.equalsIgnoreCase(name)) {
			return sppl_cntct_dpt();
		}
		if ($sppl_cntct_psn.equalsIgnoreCase(name)) {
			return sppl_cntct_psn();
		}
		if ($sppl_cntct_psn_title.equalsIgnoreCase(name)) {
			return sppl_cntct_psn_title();
		}
		if ($sppl_tel.equalsIgnoreCase(name)) {
			return sppl_tel();
		}
		if ($sppl_fax.equalsIgnoreCase(name)) {
			return sppl_fax();
		}
		if ($sppl_cntry_nm.equalsIgnoreCase(name)) {
			return sppl_cntry_nm();
		}
		if ($co_cd.equalsIgnoreCase(name)) {
			return co_cd();
		}
		if ($co_nm.equalsIgnoreCase(name)) {
			return co_nm();
		}
		if ($dpt_zip_cd.equalsIgnoreCase(name)) {
			return dpt_zip_cd();
		}
		if ($dpt_addr1.equalsIgnoreCase(name)) {
			return dpt_addr1();
		}
		if ($dpt_addr2.equalsIgnoreCase(name)) {
			return dpt_addr2();
		}
		if ($dpt_addr3.equalsIgnoreCase(name)) {
			return dpt_addr3();
		}
		if ($dpt_addr4.equalsIgnoreCase(name)) {
			return dpt_addr4();
		}
		if ($dpt_addr.equalsIgnoreCase(name)) {
			return dpt_addr();
		}
		if ($dpt_tel.equalsIgnoreCase(name)) {
			return dpt_tel();
		}
		if ($dpt_fax.equalsIgnoreCase(name)) {
			return dpt_fax();
		}
		if ($purc_dpt_cd.equalsIgnoreCase(name)) {
			return purc_dpt_cd();
		}
		if ($purc_dpt_nm.equalsIgnoreCase(name)) {
			return purc_dpt_nm();
		}
		if ($dpt_cntry_nm.equalsIgnoreCase(name)) {
			return dpt_cntry_nm();
		}
		if ($purc_usr_cd.equalsIgnoreCase(name)) {
			return purc_usr_cd();
		}
		if ($purc_usr_nm.equalsIgnoreCase(name)) {
			return purc_usr_nm();
		}
		if ($po_no.equalsIgnoreCase(name)) {
			return po_no();
		}
		if ($po_d_no.equalsIgnoreCase(name)) {
			return po_d_no();
		}
		if ($itm_cd.equalsIgnoreCase(name)) {
			return itm_cd();
		}
		if ($itm_sub1_view.equalsIgnoreCase(name)) {
			return itm_sub1_view();
		}
		if ($itm_sub1_data.equalsIgnoreCase(name)) {
			return itm_sub1_data();
		}
		if ($itm_sub2_view.equalsIgnoreCase(name)) {
			return itm_sub2_view();
		}
		if ($itm_sub2_data.equalsIgnoreCase(name)) {
			return itm_sub2_data();
		}
		if ($itm_sub3_view.equalsIgnoreCase(name)) {
			return itm_sub3_view();
		}
		if ($itm_sub3_data.equalsIgnoreCase(name)) {
			return itm_sub3_data();
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
		if ($ver_no_lbl.equalsIgnoreCase(name)) {
			return ver_no_lbl();
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
		if ($s_base_unit_qty.equalsIgnoreCase(name)) {
			return s_base_unit_qty();
		}
		if ($base_unit_cd.equalsIgnoreCase(name)) {
			return base_unit_cd();
		}
		if ($base_unit_nm.equalsIgnoreCase(name)) {
			return base_unit_nm();
		}
		if ($s_hdr_trd_unit_qty.equalsIgnoreCase(name)) {
			return s_hdr_trd_unit_qty();
		}
		if ($hdr_trd_unit_cd.equalsIgnoreCase(name)) {
			return hdr_trd_unit_cd();
		}
		if ($hdr_trd_unit_nm.equalsIgnoreCase(name)) {
			return hdr_trd_unit_nm();
		}
		if ($s_arr_qty.equalsIgnoreCase(name)) {
			return s_arr_qty();
		}
		if ($sppl_itm_cd.equalsIgnoreCase(name)) {
			return sppl_itm_cd();
		}
		if ($sppl_itm_nm.equalsIgnoreCase(name)) {
			return sppl_itm_nm();
		}
		if ($bp_lot_no.equalsIgnoreCase(name)) {
			return bp_lot_no();
		}
		if ($maker_cd.equalsIgnoreCase(name)) {
			return maker_cd();
		}
		if ($maker_nm.equalsIgnoreCase(name)) {
			return maker_nm();
		}
		if ($maker_alt_nm1.equalsIgnoreCase(name)) {
			return maker_alt_nm1();
		}
		if ($maker_alt_nm2.equalsIgnoreCase(name)) {
			return maker_alt_nm2();
		}
		if ($maker_alt_nm3.equalsIgnoreCase(name)) {
			return maker_alt_nm3();
		}
		if ($maker_alt_nm4.equalsIgnoreCase(name)) {
			return maker_alt_nm4();
		}
		if ($in_to_loc_cd.equalsIgnoreCase(name)) {
			return in_to_loc_cd();
		}
		if ($in_to_loc_nm.equalsIgnoreCase(name)) {
			return in_to_loc_nm();
		}
		if ($in_to_loc_alt_nm1.equalsIgnoreCase(name)) {
			return in_to_loc_alt_nm1();
		}
		if ($in_to_loc_alt_nm2.equalsIgnoreCase(name)) {
			return in_to_loc_alt_nm2();
		}
		if ($in_to_loc_alt_nm3.equalsIgnoreCase(name)) {
			return in_to_loc_alt_nm3();
		}
		if ($in_to_loc_alt_nm4.equalsIgnoreCase(name)) {
			return in_to_loc_alt_nm4();
		}
		if ($dlv_inst_prnt_rmrks.equalsIgnoreCase(name)) {
			return dlv_inst_prnt_rmrks();
		}
		if ($po_sub_char1.equalsIgnoreCase(name)) {
			return po_sub_char1();
		}
		if ($po_sub_char2.equalsIgnoreCase(name)) {
			return po_sub_char2();
		}
		if ($po_sub_char3.equalsIgnoreCase(name)) {
			return po_sub_char3();
		}
		if ($po_d_sub_char1.equalsIgnoreCase(name)) {
			return po_d_sub_char1();
		}
		if ($po_d_sub_char2.equalsIgnoreCase(name)) {
			return po_d_sub_char2();
		}
		if ($po_d_sub_char3.equalsIgnoreCase(name)) {
			return po_d_sub_char3();
		}
		if ($dlv_inst_sub_char1.equalsIgnoreCase(name)) {
			return dlv_inst_sub_char1();
		}
		if ($dlv_inst_sub_char2.equalsIgnoreCase(name)) {
			return dlv_inst_sub_char2();
		}
		if ($dlv_inst_sub_char3.equalsIgnoreCase(name)) {
			return dlv_inst_sub_char3();
		}
		if ($in_to_loc_zip_cd.equalsIgnoreCase(name)) {
			return in_to_loc_zip_cd();
		}
		if ($in_to_loc_addr1.equalsIgnoreCase(name)) {
			return in_to_loc_addr1();
		}
		if ($in_to_loc_addr2.equalsIgnoreCase(name)) {
			return in_to_loc_addr2();
		}
		if ($in_to_loc_addr3.equalsIgnoreCase(name)) {
			return in_to_loc_addr3();
		}
		if ($in_to_loc_addr4.equalsIgnoreCase(name)) {
			return in_to_loc_addr4();
		}
		if ($in_to_loc_addr.equalsIgnoreCase(name)) {
			return in_to_loc_addr();
		}
		if ($in_to_loc_tel.equalsIgnoreCase(name)) {
			return in_to_loc_tel();
		}
		if ($in_to_loc_fax.equalsIgnoreCase(name)) {
			return in_to_loc_fax();
		}
		if ($in_to_cntry_nm.equalsIgnoreCase(name)) {
			return in_to_cntry_nm();
		}
		if ($dlv_zip_cd.equalsIgnoreCase(name)) {
			return dlv_zip_cd();
		}
		if ($dlv_addr1.equalsIgnoreCase(name)) {
			return dlv_addr1();
		}
		if ($dlv_addr2.equalsIgnoreCase(name)) {
			return dlv_addr2();
		}
		if ($dlv_addr3.equalsIgnoreCase(name)) {
			return dlv_addr3();
		}
		if ($dlv_addr4.equalsIgnoreCase(name)) {
			return dlv_addr4();
		}
		if ($dlv_addr.equalsIgnoreCase(name)) {
			return dlv_addr();
		}
		if ($dlv_tel.equalsIgnoreCase(name)) {
			return dlv_tel();
		}
		if ($dlv_fax.equalsIgnoreCase(name)) {
			return dlv_fax();
		}
		if ($dlv_cntry_nm.equalsIgnoreCase(name)) {
			return dlv_cntry_nm();
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
		if ($tdlv_addr.equalsIgnoreCase(name)) {
			return tdlv_addr();
		}
		if ($tdlv_tel.equalsIgnoreCase(name)) {
			return tdlv_tel();
		}
		if ($tdlv_fax.equalsIgnoreCase(name)) {
			return tdlv_fax();
		}
		if ($tdlv_cntry_nm.equalsIgnoreCase(name)) {
			return tdlv_cntry_nm();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($dlv_inst_rev.equalsIgnoreCase(name)) {
			return dlv_inst_rev();
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			return base_unit_qty();
		}
		if ($hdr_trd_unit_qty.equalsIgnoreCase(name)) {
			return hdr_trd_unit_qty();
		}
		if ($arr_qty.equalsIgnoreCase(name)) {
			return arr_qty();
		}
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($print_hm.equalsIgnoreCase(name)) {
			return print_hm();
		}
		if ($dlv_rqst_dt.equalsIgnoreCase(name)) {
			return dlv_rqst_dt();
		}
		if ($dlv_rqst_tm.equalsIgnoreCase(name)) {
			return dlv_rqst_tm();
		}
		if ($dlv_inst_dt.equalsIgnoreCase(name)) {
			return dlv_inst_dt();
		}
		return super.getDateNE(name);
	}

	public void setString(String name, String value) {
		if ($rpt_sts_typ_nm.equalsIgnoreCase(name)) {
			rpt_sts_typ_nm(value);
			return;
		}
		if ($rpt_sts_typ.equalsIgnoreCase(name)) {
			rpt_sts_typ(value);
			return;
		}
		if ($dlv_inst_no.equalsIgnoreCase(name)) {
			dlv_inst_no(value);
			return;
		}
		if ($sppl_cd.equalsIgnoreCase(name)) {
			sppl_cd(value);
			return;
		}
		if ($sppl_zip_cd.equalsIgnoreCase(name)) {
			sppl_zip_cd(value);
			return;
		}
		if ($sppl_addr1.equalsIgnoreCase(name)) {
			sppl_addr1(value);
			return;
		}
		if ($sppl_addr2.equalsIgnoreCase(name)) {
			sppl_addr2(value);
			return;
		}
		if ($sppl_addr3.equalsIgnoreCase(name)) {
			sppl_addr3(value);
			return;
		}
		if ($sppl_addr4.equalsIgnoreCase(name)) {
			sppl_addr4(value);
			return;
		}
		if ($sppl_addr.equalsIgnoreCase(name)) {
			sppl_addr(value);
			return;
		}
		if ($sppl_nm.equalsIgnoreCase(name)) {
			sppl_nm(value);
			return;
		}
		if ($sppl_alt_nm1.equalsIgnoreCase(name)) {
			sppl_alt_nm1(value);
			return;
		}
		if ($sppl_alt_nm2.equalsIgnoreCase(name)) {
			sppl_alt_nm2(value);
			return;
		}
		if ($sppl_alt_nm3.equalsIgnoreCase(name)) {
			sppl_alt_nm3(value);
			return;
		}
		if ($sppl_alt_nm4.equalsIgnoreCase(name)) {
			sppl_alt_nm4(value);
			return;
		}
		if ($sppl_cntct_dpt.equalsIgnoreCase(name)) {
			sppl_cntct_dpt(value);
			return;
		}
		if ($sppl_cntct_psn.equalsIgnoreCase(name)) {
			sppl_cntct_psn(value);
			return;
		}
		if ($sppl_cntct_psn_title.equalsIgnoreCase(name)) {
			sppl_cntct_psn_title(value);
			return;
		}
		if ($sppl_tel.equalsIgnoreCase(name)) {
			sppl_tel(value);
			return;
		}
		if ($sppl_fax.equalsIgnoreCase(name)) {
			sppl_fax(value);
			return;
		}
		if ($sppl_cntry_nm.equalsIgnoreCase(name)) {
			sppl_cntry_nm(value);
			return;
		}
		if ($co_cd.equalsIgnoreCase(name)) {
			co_cd(value);
			return;
		}
		if ($co_nm.equalsIgnoreCase(name)) {
			co_nm(value);
			return;
		}
		if ($dpt_zip_cd.equalsIgnoreCase(name)) {
			dpt_zip_cd(value);
			return;
		}
		if ($dpt_addr1.equalsIgnoreCase(name)) {
			dpt_addr1(value);
			return;
		}
		if ($dpt_addr2.equalsIgnoreCase(name)) {
			dpt_addr2(value);
			return;
		}
		if ($dpt_addr3.equalsIgnoreCase(name)) {
			dpt_addr3(value);
			return;
		}
		if ($dpt_addr4.equalsIgnoreCase(name)) {
			dpt_addr4(value);
			return;
		}
		if ($dpt_addr.equalsIgnoreCase(name)) {
			dpt_addr(value);
			return;
		}
		if ($dpt_tel.equalsIgnoreCase(name)) {
			dpt_tel(value);
			return;
		}
		if ($dpt_fax.equalsIgnoreCase(name)) {
			dpt_fax(value);
			return;
		}
		if ($purc_dpt_cd.equalsIgnoreCase(name)) {
			purc_dpt_cd(value);
			return;
		}
		if ($purc_dpt_nm.equalsIgnoreCase(name)) {
			purc_dpt_nm(value);
			return;
		}
		if ($dpt_cntry_nm.equalsIgnoreCase(name)) {
			dpt_cntry_nm(value);
			return;
		}
		if ($purc_usr_cd.equalsIgnoreCase(name)) {
			purc_usr_cd(value);
			return;
		}
		if ($purc_usr_nm.equalsIgnoreCase(name)) {
			purc_usr_nm(value);
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
		if ($itm_cd.equalsIgnoreCase(name)) {
			itm_cd(value);
			return;
		}
		if ($itm_sub1_view.equalsIgnoreCase(name)) {
			itm_sub1_view(value);
			return;
		}
		if ($itm_sub1_data.equalsIgnoreCase(name)) {
			itm_sub1_data(value);
			return;
		}
		if ($itm_sub2_view.equalsIgnoreCase(name)) {
			itm_sub2_view(value);
			return;
		}
		if ($itm_sub2_data.equalsIgnoreCase(name)) {
			itm_sub2_data(value);
			return;
		}
		if ($itm_sub3_view.equalsIgnoreCase(name)) {
			itm_sub3_view(value);
			return;
		}
		if ($itm_sub3_data.equalsIgnoreCase(name)) {
			itm_sub3_data(value);
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
		if ($ver_no_lbl.equalsIgnoreCase(name)) {
			ver_no_lbl(value);
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
		if ($s_base_unit_qty.equalsIgnoreCase(name)) {
			s_base_unit_qty(value);
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
		if ($s_hdr_trd_unit_qty.equalsIgnoreCase(name)) {
			s_hdr_trd_unit_qty(value);
			return;
		}
		if ($hdr_trd_unit_cd.equalsIgnoreCase(name)) {
			hdr_trd_unit_cd(value);
			return;
		}
		if ($hdr_trd_unit_nm.equalsIgnoreCase(name)) {
			hdr_trd_unit_nm(value);
			return;
		}
		if ($s_arr_qty.equalsIgnoreCase(name)) {
			s_arr_qty(value);
			return;
		}
		if ($sppl_itm_cd.equalsIgnoreCase(name)) {
			sppl_itm_cd(value);
			return;
		}
		if ($sppl_itm_nm.equalsIgnoreCase(name)) {
			sppl_itm_nm(value);
			return;
		}
		if ($bp_lot_no.equalsIgnoreCase(name)) {
			bp_lot_no(value);
			return;
		}
		if ($maker_cd.equalsIgnoreCase(name)) {
			maker_cd(value);
			return;
		}
		if ($maker_nm.equalsIgnoreCase(name)) {
			maker_nm(value);
			return;
		}
		if ($maker_alt_nm1.equalsIgnoreCase(name)) {
			maker_alt_nm1(value);
			return;
		}
		if ($maker_alt_nm2.equalsIgnoreCase(name)) {
			maker_alt_nm2(value);
			return;
		}
		if ($maker_alt_nm3.equalsIgnoreCase(name)) {
			maker_alt_nm3(value);
			return;
		}
		if ($maker_alt_nm4.equalsIgnoreCase(name)) {
			maker_alt_nm4(value);
			return;
		}
		if ($in_to_loc_cd.equalsIgnoreCase(name)) {
			in_to_loc_cd(value);
			return;
		}
		if ($in_to_loc_nm.equalsIgnoreCase(name)) {
			in_to_loc_nm(value);
			return;
		}
		if ($in_to_loc_alt_nm1.equalsIgnoreCase(name)) {
			in_to_loc_alt_nm1(value);
			return;
		}
		if ($in_to_loc_alt_nm2.equalsIgnoreCase(name)) {
			in_to_loc_alt_nm2(value);
			return;
		}
		if ($in_to_loc_alt_nm3.equalsIgnoreCase(name)) {
			in_to_loc_alt_nm3(value);
			return;
		}
		if ($in_to_loc_alt_nm4.equalsIgnoreCase(name)) {
			in_to_loc_alt_nm4(value);
			return;
		}
		if ($dlv_inst_prnt_rmrks.equalsIgnoreCase(name)) {
			dlv_inst_prnt_rmrks(value);
			return;
		}
		if ($po_sub_char1.equalsIgnoreCase(name)) {
			po_sub_char1(value);
			return;
		}
		if ($po_sub_char2.equalsIgnoreCase(name)) {
			po_sub_char2(value);
			return;
		}
		if ($po_sub_char3.equalsIgnoreCase(name)) {
			po_sub_char3(value);
			return;
		}
		if ($po_d_sub_char1.equalsIgnoreCase(name)) {
			po_d_sub_char1(value);
			return;
		}
		if ($po_d_sub_char2.equalsIgnoreCase(name)) {
			po_d_sub_char2(value);
			return;
		}
		if ($po_d_sub_char3.equalsIgnoreCase(name)) {
			po_d_sub_char3(value);
			return;
		}
		if ($dlv_inst_sub_char1.equalsIgnoreCase(name)) {
			dlv_inst_sub_char1(value);
			return;
		}
		if ($dlv_inst_sub_char2.equalsIgnoreCase(name)) {
			dlv_inst_sub_char2(value);
			return;
		}
		if ($dlv_inst_sub_char3.equalsIgnoreCase(name)) {
			dlv_inst_sub_char3(value);
			return;
		}
		if ($in_to_loc_zip_cd.equalsIgnoreCase(name)) {
			in_to_loc_zip_cd(value);
			return;
		}
		if ($in_to_loc_addr1.equalsIgnoreCase(name)) {
			in_to_loc_addr1(value);
			return;
		}
		if ($in_to_loc_addr2.equalsIgnoreCase(name)) {
			in_to_loc_addr2(value);
			return;
		}
		if ($in_to_loc_addr3.equalsIgnoreCase(name)) {
			in_to_loc_addr3(value);
			return;
		}
		if ($in_to_loc_addr4.equalsIgnoreCase(name)) {
			in_to_loc_addr4(value);
			return;
		}
		if ($in_to_loc_addr.equalsIgnoreCase(name)) {
			in_to_loc_addr(value);
			return;
		}
		if ($in_to_loc_tel.equalsIgnoreCase(name)) {
			in_to_loc_tel(value);
			return;
		}
		if ($in_to_loc_fax.equalsIgnoreCase(name)) {
			in_to_loc_fax(value);
			return;
		}
		if ($in_to_cntry_nm.equalsIgnoreCase(name)) {
			in_to_cntry_nm(value);
			return;
		}
		if ($dlv_zip_cd.equalsIgnoreCase(name)) {
			dlv_zip_cd(value);
			return;
		}
		if ($dlv_addr1.equalsIgnoreCase(name)) {
			dlv_addr1(value);
			return;
		}
		if ($dlv_addr2.equalsIgnoreCase(name)) {
			dlv_addr2(value);
			return;
		}
		if ($dlv_addr3.equalsIgnoreCase(name)) {
			dlv_addr3(value);
			return;
		}
		if ($dlv_addr4.equalsIgnoreCase(name)) {
			dlv_addr4(value);
			return;
		}
		if ($dlv_addr.equalsIgnoreCase(name)) {
			dlv_addr(value);
			return;
		}
		if ($dlv_tel.equalsIgnoreCase(name)) {
			dlv_tel(value);
			return;
		}
		if ($dlv_fax.equalsIgnoreCase(name)) {
			dlv_fax(value);
			return;
		}
		if ($dlv_cntry_nm.equalsIgnoreCase(name)) {
			dlv_cntry_nm(value);
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
		if ($tdlv_addr.equalsIgnoreCase(name)) {
			tdlv_addr(value);
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
		if ($tdlv_cntry_nm.equalsIgnoreCase(name)) {
			tdlv_cntry_nm(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($dlv_inst_rev.equalsIgnoreCase(name)) {
			dlv_inst_rev(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($hdr_trd_unit_qty.equalsIgnoreCase(name)) {
			hdr_trd_unit_qty(value);
			return;
		}
		if ($arr_qty.equalsIgnoreCase(name)) {
			arr_qty(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($dlv_inst_rev.equalsIgnoreCase(name)) {
			dlv_inst_rev(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($hdr_trd_unit_qty.equalsIgnoreCase(name)) {
			hdr_trd_unit_qty(value);
			return;
		}
		if ($arr_qty.equalsIgnoreCase(name)) {
			arr_qty(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($dlv_inst_rev.equalsIgnoreCase(name)) {
			dlv_inst_rev(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($hdr_trd_unit_qty.equalsIgnoreCase(name)) {
			hdr_trd_unit_qty(value);
			return;
		}
		if ($arr_qty.equalsIgnoreCase(name)) {
			arr_qty(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($dlv_inst_rev.equalsIgnoreCase(name)) {
			dlv_inst_rev(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($hdr_trd_unit_qty.equalsIgnoreCase(name)) {
			hdr_trd_unit_qty(value);
			return;
		}
		if ($arr_qty.equalsIgnoreCase(name)) {
			arr_qty(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($dlv_inst_rev.equalsIgnoreCase(name)) {
			dlv_inst_rev(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($hdr_trd_unit_qty.equalsIgnoreCase(name)) {
			hdr_trd_unit_qty(value);
			return;
		}
		if ($arr_qty.equalsIgnoreCase(name)) {
			arr_qty(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($print_hm.equalsIgnoreCase(name)) {
			print_hm(value);
			return;
		}
		if ($dlv_rqst_dt.equalsIgnoreCase(name)) {
			dlv_rqst_dt(value);
			return;
		}
		if ($dlv_rqst_tm.equalsIgnoreCase(name)) {
			dlv_rqst_tm(value);
			return;
		}
		if ($dlv_inst_dt.equalsIgnoreCase(name)) {
			dlv_inst_dt(value);
			return;
		}
		super.setDate(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($rpt_sts_typ_nm.equalsIgnoreCase(name)) {
			rpt_sts_typ_nm(value);
			return;
		}
		if ($rpt_sts_typ.equalsIgnoreCase(name)) {
			rpt_sts_typ(value);
			return;
		}
		if ($dlv_inst_no.equalsIgnoreCase(name)) {
			dlv_inst_no(value);
			return;
		}
		if ($sppl_cd.equalsIgnoreCase(name)) {
			sppl_cd(value);
			return;
		}
		if ($sppl_zip_cd.equalsIgnoreCase(name)) {
			sppl_zip_cd(value);
			return;
		}
		if ($sppl_addr1.equalsIgnoreCase(name)) {
			sppl_addr1(value);
			return;
		}
		if ($sppl_addr2.equalsIgnoreCase(name)) {
			sppl_addr2(value);
			return;
		}
		if ($sppl_addr3.equalsIgnoreCase(name)) {
			sppl_addr3(value);
			return;
		}
		if ($sppl_addr4.equalsIgnoreCase(name)) {
			sppl_addr4(value);
			return;
		}
		if ($sppl_addr.equalsIgnoreCase(name)) {
			sppl_addr(value);
			return;
		}
		if ($sppl_nm.equalsIgnoreCase(name)) {
			sppl_nm(value);
			return;
		}
		if ($sppl_alt_nm1.equalsIgnoreCase(name)) {
			sppl_alt_nm1(value);
			return;
		}
		if ($sppl_alt_nm2.equalsIgnoreCase(name)) {
			sppl_alt_nm2(value);
			return;
		}
		if ($sppl_alt_nm3.equalsIgnoreCase(name)) {
			sppl_alt_nm3(value);
			return;
		}
		if ($sppl_alt_nm4.equalsIgnoreCase(name)) {
			sppl_alt_nm4(value);
			return;
		}
		if ($sppl_cntct_dpt.equalsIgnoreCase(name)) {
			sppl_cntct_dpt(value);
			return;
		}
		if ($sppl_cntct_psn.equalsIgnoreCase(name)) {
			sppl_cntct_psn(value);
			return;
		}
		if ($sppl_cntct_psn_title.equalsIgnoreCase(name)) {
			sppl_cntct_psn_title(value);
			return;
		}
		if ($sppl_tel.equalsIgnoreCase(name)) {
			sppl_tel(value);
			return;
		}
		if ($sppl_fax.equalsIgnoreCase(name)) {
			sppl_fax(value);
			return;
		}
		if ($sppl_cntry_nm.equalsIgnoreCase(name)) {
			sppl_cntry_nm(value);
			return;
		}
		if ($co_cd.equalsIgnoreCase(name)) {
			co_cd(value);
			return;
		}
		if ($co_nm.equalsIgnoreCase(name)) {
			co_nm(value);
			return;
		}
		if ($dpt_zip_cd.equalsIgnoreCase(name)) {
			dpt_zip_cd(value);
			return;
		}
		if ($dpt_addr1.equalsIgnoreCase(name)) {
			dpt_addr1(value);
			return;
		}
		if ($dpt_addr2.equalsIgnoreCase(name)) {
			dpt_addr2(value);
			return;
		}
		if ($dpt_addr3.equalsIgnoreCase(name)) {
			dpt_addr3(value);
			return;
		}
		if ($dpt_addr4.equalsIgnoreCase(name)) {
			dpt_addr4(value);
			return;
		}
		if ($dpt_addr.equalsIgnoreCase(name)) {
			dpt_addr(value);
			return;
		}
		if ($dpt_tel.equalsIgnoreCase(name)) {
			dpt_tel(value);
			return;
		}
		if ($dpt_fax.equalsIgnoreCase(name)) {
			dpt_fax(value);
			return;
		}
		if ($purc_dpt_cd.equalsIgnoreCase(name)) {
			purc_dpt_cd(value);
			return;
		}
		if ($purc_dpt_nm.equalsIgnoreCase(name)) {
			purc_dpt_nm(value);
			return;
		}
		if ($dpt_cntry_nm.equalsIgnoreCase(name)) {
			dpt_cntry_nm(value);
			return;
		}
		if ($purc_usr_cd.equalsIgnoreCase(name)) {
			purc_usr_cd(value);
			return;
		}
		if ($purc_usr_nm.equalsIgnoreCase(name)) {
			purc_usr_nm(value);
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
		if ($itm_cd.equalsIgnoreCase(name)) {
			itm_cd(value);
			return;
		}
		if ($itm_sub1_view.equalsIgnoreCase(name)) {
			itm_sub1_view(value);
			return;
		}
		if ($itm_sub1_data.equalsIgnoreCase(name)) {
			itm_sub1_data(value);
			return;
		}
		if ($itm_sub2_view.equalsIgnoreCase(name)) {
			itm_sub2_view(value);
			return;
		}
		if ($itm_sub2_data.equalsIgnoreCase(name)) {
			itm_sub2_data(value);
			return;
		}
		if ($itm_sub3_view.equalsIgnoreCase(name)) {
			itm_sub3_view(value);
			return;
		}
		if ($itm_sub3_data.equalsIgnoreCase(name)) {
			itm_sub3_data(value);
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
		if ($ver_no_lbl.equalsIgnoreCase(name)) {
			ver_no_lbl(value);
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
		if ($s_base_unit_qty.equalsIgnoreCase(name)) {
			s_base_unit_qty(value);
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
		if ($s_hdr_trd_unit_qty.equalsIgnoreCase(name)) {
			s_hdr_trd_unit_qty(value);
			return;
		}
		if ($hdr_trd_unit_cd.equalsIgnoreCase(name)) {
			hdr_trd_unit_cd(value);
			return;
		}
		if ($hdr_trd_unit_nm.equalsIgnoreCase(name)) {
			hdr_trd_unit_nm(value);
			return;
		}
		if ($s_arr_qty.equalsIgnoreCase(name)) {
			s_arr_qty(value);
			return;
		}
		if ($sppl_itm_cd.equalsIgnoreCase(name)) {
			sppl_itm_cd(value);
			return;
		}
		if ($sppl_itm_nm.equalsIgnoreCase(name)) {
			sppl_itm_nm(value);
			return;
		}
		if ($bp_lot_no.equalsIgnoreCase(name)) {
			bp_lot_no(value);
			return;
		}
		if ($maker_cd.equalsIgnoreCase(name)) {
			maker_cd(value);
			return;
		}
		if ($maker_nm.equalsIgnoreCase(name)) {
			maker_nm(value);
			return;
		}
		if ($maker_alt_nm1.equalsIgnoreCase(name)) {
			maker_alt_nm1(value);
			return;
		}
		if ($maker_alt_nm2.equalsIgnoreCase(name)) {
			maker_alt_nm2(value);
			return;
		}
		if ($maker_alt_nm3.equalsIgnoreCase(name)) {
			maker_alt_nm3(value);
			return;
		}
		if ($maker_alt_nm4.equalsIgnoreCase(name)) {
			maker_alt_nm4(value);
			return;
		}
		if ($in_to_loc_cd.equalsIgnoreCase(name)) {
			in_to_loc_cd(value);
			return;
		}
		if ($in_to_loc_nm.equalsIgnoreCase(name)) {
			in_to_loc_nm(value);
			return;
		}
		if ($in_to_loc_alt_nm1.equalsIgnoreCase(name)) {
			in_to_loc_alt_nm1(value);
			return;
		}
		if ($in_to_loc_alt_nm2.equalsIgnoreCase(name)) {
			in_to_loc_alt_nm2(value);
			return;
		}
		if ($in_to_loc_alt_nm3.equalsIgnoreCase(name)) {
			in_to_loc_alt_nm3(value);
			return;
		}
		if ($in_to_loc_alt_nm4.equalsIgnoreCase(name)) {
			in_to_loc_alt_nm4(value);
			return;
		}
		if ($dlv_inst_prnt_rmrks.equalsIgnoreCase(name)) {
			dlv_inst_prnt_rmrks(value);
			return;
		}
		if ($po_sub_char1.equalsIgnoreCase(name)) {
			po_sub_char1(value);
			return;
		}
		if ($po_sub_char2.equalsIgnoreCase(name)) {
			po_sub_char2(value);
			return;
		}
		if ($po_sub_char3.equalsIgnoreCase(name)) {
			po_sub_char3(value);
			return;
		}
		if ($po_d_sub_char1.equalsIgnoreCase(name)) {
			po_d_sub_char1(value);
			return;
		}
		if ($po_d_sub_char2.equalsIgnoreCase(name)) {
			po_d_sub_char2(value);
			return;
		}
		if ($po_d_sub_char3.equalsIgnoreCase(name)) {
			po_d_sub_char3(value);
			return;
		}
		if ($dlv_inst_sub_char1.equalsIgnoreCase(name)) {
			dlv_inst_sub_char1(value);
			return;
		}
		if ($dlv_inst_sub_char2.equalsIgnoreCase(name)) {
			dlv_inst_sub_char2(value);
			return;
		}
		if ($dlv_inst_sub_char3.equalsIgnoreCase(name)) {
			dlv_inst_sub_char3(value);
			return;
		}
		if ($in_to_loc_zip_cd.equalsIgnoreCase(name)) {
			in_to_loc_zip_cd(value);
			return;
		}
		if ($in_to_loc_addr1.equalsIgnoreCase(name)) {
			in_to_loc_addr1(value);
			return;
		}
		if ($in_to_loc_addr2.equalsIgnoreCase(name)) {
			in_to_loc_addr2(value);
			return;
		}
		if ($in_to_loc_addr3.equalsIgnoreCase(name)) {
			in_to_loc_addr3(value);
			return;
		}
		if ($in_to_loc_addr4.equalsIgnoreCase(name)) {
			in_to_loc_addr4(value);
			return;
		}
		if ($in_to_loc_addr.equalsIgnoreCase(name)) {
			in_to_loc_addr(value);
			return;
		}
		if ($in_to_loc_tel.equalsIgnoreCase(name)) {
			in_to_loc_tel(value);
			return;
		}
		if ($in_to_loc_fax.equalsIgnoreCase(name)) {
			in_to_loc_fax(value);
			return;
		}
		if ($in_to_cntry_nm.equalsIgnoreCase(name)) {
			in_to_cntry_nm(value);
			return;
		}
		if ($dlv_zip_cd.equalsIgnoreCase(name)) {
			dlv_zip_cd(value);
			return;
		}
		if ($dlv_addr1.equalsIgnoreCase(name)) {
			dlv_addr1(value);
			return;
		}
		if ($dlv_addr2.equalsIgnoreCase(name)) {
			dlv_addr2(value);
			return;
		}
		if ($dlv_addr3.equalsIgnoreCase(name)) {
			dlv_addr3(value);
			return;
		}
		if ($dlv_addr4.equalsIgnoreCase(name)) {
			dlv_addr4(value);
			return;
		}
		if ($dlv_addr.equalsIgnoreCase(name)) {
			dlv_addr(value);
			return;
		}
		if ($dlv_tel.equalsIgnoreCase(name)) {
			dlv_tel(value);
			return;
		}
		if ($dlv_fax.equalsIgnoreCase(name)) {
			dlv_fax(value);
			return;
		}
		if ($dlv_cntry_nm.equalsIgnoreCase(name)) {
			dlv_cntry_nm(value);
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
		if ($tdlv_addr.equalsIgnoreCase(name)) {
			tdlv_addr(value);
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
		if ($tdlv_cntry_nm.equalsIgnoreCase(name)) {
			tdlv_cntry_nm(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($dlv_inst_rev.equalsIgnoreCase(name)) {
			dlv_inst_rev(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($hdr_trd_unit_qty.equalsIgnoreCase(name)) {
			hdr_trd_unit_qty(value);
			return;
		}
		if ($arr_qty.equalsIgnoreCase(name)) {
			arr_qty(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($dlv_inst_rev.equalsIgnoreCase(name)) {
			dlv_inst_rev(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($hdr_trd_unit_qty.equalsIgnoreCase(name)) {
			hdr_trd_unit_qty(value);
			return;
		}
		if ($arr_qty.equalsIgnoreCase(name)) {
			arr_qty(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($dlv_inst_rev.equalsIgnoreCase(name)) {
			dlv_inst_rev(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($hdr_trd_unit_qty.equalsIgnoreCase(name)) {
			hdr_trd_unit_qty(value);
			return;
		}
		if ($arr_qty.equalsIgnoreCase(name)) {
			arr_qty(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($dlv_inst_rev.equalsIgnoreCase(name)) {
			dlv_inst_rev(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($hdr_trd_unit_qty.equalsIgnoreCase(name)) {
			hdr_trd_unit_qty(value);
			return;
		}
		if ($arr_qty.equalsIgnoreCase(name)) {
			arr_qty(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($dlv_inst_rev.equalsIgnoreCase(name)) {
			dlv_inst_rev(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($hdr_trd_unit_qty.equalsIgnoreCase(name)) {
			hdr_trd_unit_qty(value);
			return;
		}
		if ($arr_qty.equalsIgnoreCase(name)) {
			arr_qty(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($print_hm.equalsIgnoreCase(name)) {
			print_hm(value);
			return;
		}
		if ($dlv_rqst_dt.equalsIgnoreCase(name)) {
			dlv_rqst_dt(value);
			return;
		}
		if ($dlv_rqst_tm.equalsIgnoreCase(name)) {
			dlv_rqst_tm(value);
			return;
		}
		if ($dlv_inst_dt.equalsIgnoreCase(name)) {
			dlv_inst_dt(value);
			return;
		}
		super.setDateNE(name, value);
	}



}

