package mcframe.commonMSBB.MSBBR0070;

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
 * ブロック"SloPrmsHdr"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class SloPrmsHdrR_MC_A extends MCConstRow {

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
	 *  納期回答書発行日時.<p>
	 *
	 */
	public static final String $prms_prnt_tm = "prms_prnt_tm";
	/**
	 *  得意先ＣＤ.<p>
	 *
	 */
	public static final String $cst_cd = "cst_cd";
	/**
	 *  得意先郵便番号.<p>
	 *
	 */
	public static final String $cst_zip_cd = "cst_zip_cd";
	/**
	 *  得意先住所１.<p>
	 *
	 */
	public static final String $cst_addr1 = "cst_addr1";
	/**
	 *  得意先住所２.<p>
	 *
	 */
	public static final String $cst_addr2 = "cst_addr2";
	/**
	 *  得意先住所３.<p>
	 *
	 */
	public static final String $cst_addr3 = "cst_addr3";
	/**
	 *  得意先住所４.<p>
	 *
	 */
	public static final String $cst_addr4 = "cst_addr4";
	/**
	 *  得意先住所１～４.<p>
	 *
	 */
	public static final String $cst_addr = "cst_addr";
	/**
	 *  得意先名.<p>
	 *
	 */
	public static final String $cst_nm = "cst_nm";
	/**
	 *  得意先別名１.<p>
	 *
	 */
	public static final String $cst_alt_nm1 = "cst_alt_nm1";
	/**
	 *  得意先別名２.<p>
	 *
	 */
	public static final String $cst_alt_nm2 = "cst_alt_nm2";
	/**
	 *  得意先別名３.<p>
	 *
	 */
	public static final String $cst_alt_nm3 = "cst_alt_nm3";
	/**
	 *  得意先別名４.<p>
	 *
	 */
	public static final String $cst_alt_nm4 = "cst_alt_nm4";
	/**
	 *  得意先部署.<p>
	 *
	 */
	public static final String $cst_cntct_dpt = "cst_cntct_dpt";
	/**
	 *  得意先担当者.<p>
	 *
	 */
	public static final String $cst_cntct_psn = "cst_cntct_psn";
	/**
	 *  得意先担当者敬称.<p>
	 *
	 */
	public static final String $cst_cntct_psn_title = "cst_cntct_psn_title";
	/**
	 *  得意先ＴＥＬ.<p>
	 *
	 */
	public static final String $cst_tel = "cst_tel";
	/**
	 *  得意先ＦＡＸ.<p>
	 *
	 */
	public static final String $cst_fax = "cst_fax";
	/**
	 *  得意先国名.<p>
	 *
	 */
	public static final String $cst_cntry_nm = "cst_cntry_nm";
	/**
	 *  納品先ＣＤ.<p>
	 *
	 */
	public static final String $dlv_cd = "dlv_cd";
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
	 *  納品先住所１～４.<p>
	 *
	 */
	public static final String $dlv_addr = "dlv_addr";
	/**
	 *  納品先名.<p>
	 *
	 */
	public static final String $dlv_nm = "dlv_nm";
	/**
	 *  納品先別名１.<p>
	 *
	 */
	public static final String $dlv_alt_nm1 = "dlv_alt_nm1";
	/**
	 *  納品先別名２.<p>
	 *
	 */
	public static final String $dlv_alt_nm2 = "dlv_alt_nm2";
	/**
	 *  納品先別名３.<p>
	 *
	 */
	public static final String $dlv_alt_nm3 = "dlv_alt_nm3";
	/**
	 *  納品先別名４.<p>
	 *
	 */
	public static final String $dlv_alt_nm4 = "dlv_alt_nm4";
	/**
	 *  納品先部署.<p>
	 *
	 */
	public static final String $dlv_cntct_dpt = "dlv_cntct_dpt";
	/**
	 *  納品先担当者.<p>
	 *
	 */
	public static final String $dlv_cntct_psn = "dlv_cntct_psn";
	/**
	 *  納品先担当者敬称.<p>
	 *
	 */
	public static final String $dlv_cntct_psn_title = "dlv_cntct_psn_title";
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
	 *  会社名.<p>
	 *
	 */
	public static final String $co_nm = "co_nm";
	/**
	 *  自社国名.<p>
	 *
	 */
	public static final String $co_cntry_nm = "co_cntry_nm";
	/**
	 *  売上部門ＣＤ.<p>
	 *
	 */
	public static final String $sls_dpt_cd = "sls_dpt_cd";
	/**
	 *  売上部門郵便番号.<p>
	 *
	 */
	public static final String $sls_dpt_zip_cd = "sls_dpt_zip_cd";
	/**
	 *  売上部門住所１.<p>
	 *
	 */
	public static final String $sls_dpt_addr1 = "sls_dpt_addr1";
	/**
	 *  売上部門住所２.<p>
	 *
	 */
	public static final String $sls_dpt_addr2 = "sls_dpt_addr2";
	/**
	 *  売上部門住所３.<p>
	 *
	 */
	public static final String $sls_dpt_addr3 = "sls_dpt_addr3";
	/**
	 *  売上部門住所４.<p>
	 *
	 */
	public static final String $sls_dpt_addr4 = "sls_dpt_addr4";
	/**
	 *  売上部門住所１～４.<p>
	 *
	 */
	public static final String $sls_dpt_addr = "sls_dpt_addr";
	/**
	 *  売上部門名.<p>
	 *
	 */
	public static final String $sls_dpt_nm = "sls_dpt_nm";
	/**
	 *  売上担当者.<p>
	 *
	 */
	public static final String $sls_usr_cd = "sls_usr_cd";
	/**
	 *  売上担当者名.<p>
	 *
	 */
	public static final String $sls_usr_nm = "sls_usr_nm";
	/**
	 *  売上部門ＴＥＬ.<p>
	 *
	 */
	public static final String $sls_dpt_tel = "sls_dpt_tel";
	/**
	 *  売上部門ＦＡＸ.<p>
	 *
	 */
	public static final String $sls_dpt_fax = "sls_dpt_fax";
	/**
	 *  配送先ＣＤ.<p>
	 *
	 */
	public static final String $tdlv_cd = "tdlv_cd";
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
	 *  配送先住所１～４.<p>
	 *
	 */
	public static final String $tdlv_addr = "tdlv_addr";
	/**
	 *  配送先名.<p>
	 *
	 */
	public static final String $tdlv_nm = "tdlv_nm";
	/**
	 *  配送先部署.<p>
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
	 *  得意先注文ＮＯ.<p>
	 *
	 */
	public static final String $cst_po_no = "cst_po_no";
	/**
	 *  得意先注文明細ＮＯ.<p>
	 *
	 */
	public static final String $cst_po_d_no = "cst_po_d_no";
	/**
	 *  得意先品目ＣＤ.<p>
	 *
	 */
	public static final String $cst_itm_cd = "cst_itm_cd";
	/**
	 *  得意先品名.<p>
	 *
	 */
	public static final String $cst_itm_nm = "cst_itm_nm";
	/**
	 *  基準単位数量.<p>
	 *
	 */
	public static final String $base_unit_qty = "base_unit_qty";
	/**
	 *  基準単位数量文字列.<p>
	 *
	 */
	public static final String $s_base_unit_qty = "s_base_unit_qty";
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
	 *  取引単位数量.<p>
	 *
	 */
	public static final String $trd_unit_qty = "trd_unit_qty";
	/**
	 *  取引単位数量文字列.<p>
	 *
	 */
	public static final String $s_trd_unit_qty = "s_trd_unit_qty";
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
	 *  出荷実績数量.<p>
	 *
	 */
	public static final String $ship_act_qty = "ship_act_qty";
	/**
	 *  出荷実績数量文字列.<p>
	 *
	 */
	public static final String $s_ship_act_qty = "s_ship_act_qty";
	/**
	 *  出荷実績単位名.<p>
	 *
	 */
	public static final String $ship_act_unit_nm = "ship_act_unit_nm";
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
	 *  受注日.<p>
	 *
	 */
	public static final String $slo_dt = "slo_dt";
	/**
	 *  受注ＮＯ.<p>
	 *
	 */
	public static final String $slo_no = "slo_no";
	/**
	 *  受注明細ＮＯ.<p>
	 *
	 */
	public static final String $slo_d_no = "slo_d_no";
	/**
	 *  受注納期回答ヘッダＮＯ.<p>
	 *
	 */
	public static final String $slo_prms_h_no = "slo_prms_h_no";
	/**
	 *  最新納期回答改訂番号.<p>
	 *
	 */
	public static final String $last_prms_rev = "last_prms_rev";
	/**
	 *  品目ＣＤ.<p>
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
	 *  品名.<p>
	 *
	 */
	public static final String $itm_nm = "itm_nm";
	/**
	 *  品目別名１.<p>
	 *
	 */
	public static final String $itm_alt_nm1 = "itm_alt_nm1";
	/**
	 *  品目別名２.<p>
	 *
	 */
	public static final String $itm_alt_nm2 = "itm_alt_nm2";
	/**
	 *  品目別名３.<p>
	 *
	 */
	public static final String $itm_alt_nm3 = "itm_alt_nm3";
	/**
	 *  品目別名４.<p>
	 *
	 */
	public static final String $itm_alt_nm4 = "itm_alt_nm4";
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
	 *  受注予備１.<p>
	 *
	 */
	public static final String $slo_sub_char1 = "slo_sub_char1";
	/**
	 *  受注予備２.<p>
	 *
	 */
	public static final String $slo_sub_char2 = "slo_sub_char2";
	/**
	 *  受注予備３.<p>
	 *
	 */
	public static final String $slo_sub_char3 = "slo_sub_char3";
	/**
	 *  受注明細予備１.<p>
	 *
	 */
	public static final String $slo_d_sub_char1 = "slo_d_sub_char1";
	/**
	 *  受注明細予備２.<p>
	 *
	 */
	public static final String $slo_d_sub_char2 = "slo_d_sub_char2";
	/**
	 *  受注明細予備３.<p>
	 *
	 */
	public static final String $slo_d_sub_char3 = "slo_d_sub_char3";


	public static final MCMeta rpt_sts_typ_nm_META = createCommonMeta($rpt_sts_typ_nm, mcframe.commonMA.meta.MA_META.RPT_STS_TYP_NM);
	public static final MCMeta rpt_sts_typ_META = createCommonMeta($rpt_sts_typ, mcframe.commonMA.meta.MA_META.RPT_STS_TYP);
	public static final MCMeta prms_prnt_tm_META = createCommonMeta($prms_prnt_tm, mcframe.commonMA.meta.MA_META.TM);
	public static final MCMeta cst_cd_META = createCommonMeta($cst_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta cst_zip_cd_META = createCommonMeta($cst_zip_cd, mcframe.commonMA.meta.MA_META.ZIP_CD);
	public static final MCMeta cst_addr1_META = createCommonMeta($cst_addr1, mcframe.commonMA.meta.MA_META.ADDR1);
	public static final MCMeta cst_addr2_META = createCommonMeta($cst_addr2, mcframe.commonMA.meta.MA_META.ADDR2);
	public static final MCMeta cst_addr3_META = createCommonMeta($cst_addr3, mcframe.commonMA.meta.MA_META.ADDR3);
	public static final MCMeta cst_addr4_META = createCommonMeta($cst_addr4, mcframe.commonMA.meta.MA_META.ADDR4);
	public static final MCMeta cst_addr_META = createStringMeta($cst_addr);
	public static final MCMeta cst_nm_META = createCommonMeta($cst_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta cst_alt_nm1_META = createCommonMeta($cst_alt_nm1, mcframe.commonMA.meta.MA_META.BP_ALT_NM1);
	public static final MCMeta cst_alt_nm2_META = createCommonMeta($cst_alt_nm2, mcframe.commonMA.meta.MA_META.BP_ALT_NM2);
	public static final MCMeta cst_alt_nm3_META = createCommonMeta($cst_alt_nm3, mcframe.commonMA.meta.MA_META.BP_ALT_NM3);
	public static final MCMeta cst_alt_nm4_META = createCommonMeta($cst_alt_nm4, mcframe.commonMA.meta.MA_META.BP_ALT_NM4);
	public static final MCMeta cst_cntct_dpt_META = createCommonMeta($cst_cntct_dpt, mcframe.commonMA.meta.MA_META.BP_CNTCT_DPT);
	public static final MCMeta cst_cntct_psn_META = createCommonMeta($cst_cntct_psn, mcframe.commonMA.meta.MA_META.BP_CNTCT_PSN);
	public static final MCMeta cst_cntct_psn_title_META = createCommonMeta($cst_cntct_psn_title, mcframe.commonMA.meta.MA_META.BP_PSN_TITLE);
	public static final MCMeta cst_tel_META = createCommonMeta($cst_tel, mcframe.commonMA.meta.MA_META.TEL);
	public static final MCMeta cst_fax_META = createCommonMeta($cst_fax, mcframe.commonMA.meta.MA_META.TEL);
	public static final MCMeta cst_cntry_nm_META = createCommonMeta($cst_cntry_nm, mcframe.commonMA.meta.MA_META.CNTRY_NM);
	public static final MCMeta dlv_cd_META = createCommonMeta($dlv_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta dlv_zip_cd_META = createCommonMeta($dlv_zip_cd, mcframe.commonMA.meta.MA_META.ZIP_CD);
	public static final MCMeta dlv_addr1_META = createCommonMeta($dlv_addr1, mcframe.commonMA.meta.MA_META.ADDR1);
	public static final MCMeta dlv_addr2_META = createCommonMeta($dlv_addr2, mcframe.commonMA.meta.MA_META.ADDR2);
	public static final MCMeta dlv_addr3_META = createCommonMeta($dlv_addr3, mcframe.commonMA.meta.MA_META.ADDR3);
	public static final MCMeta dlv_addr4_META = createCommonMeta($dlv_addr4, mcframe.commonMA.meta.MA_META.ADDR4);
	public static final MCMeta dlv_addr_META = createStringMeta($dlv_addr);
	public static final MCMeta dlv_nm_META = createCommonMeta($dlv_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta dlv_alt_nm1_META = createCommonMeta($dlv_alt_nm1, mcframe.commonMA.meta.MA_META.BP_ALT_NM1);
	public static final MCMeta dlv_alt_nm2_META = createCommonMeta($dlv_alt_nm2, mcframe.commonMA.meta.MA_META.BP_ALT_NM2);
	public static final MCMeta dlv_alt_nm3_META = createCommonMeta($dlv_alt_nm3, mcframe.commonMA.meta.MA_META.BP_ALT_NM3);
	public static final MCMeta dlv_alt_nm4_META = createCommonMeta($dlv_alt_nm4, mcframe.commonMA.meta.MA_META.BP_ALT_NM4);
	public static final MCMeta dlv_cntct_dpt_META = createCommonMeta($dlv_cntct_dpt, mcframe.commonMA.meta.MA_META.BP_CNTCT_DPT);
	public static final MCMeta dlv_cntct_psn_META = createCommonMeta($dlv_cntct_psn, mcframe.commonMA.meta.MA_META.BP_CNTCT_PSN);
	public static final MCMeta dlv_cntct_psn_title_META = createCommonMeta($dlv_cntct_psn_title, mcframe.commonMA.meta.MA_META.BP_PSN_TITLE);
	public static final MCMeta dlv_tel_META = createCommonMeta($dlv_tel, mcframe.commonMA.meta.MA_META.TEL);
	public static final MCMeta dlv_fax_META = createCommonMeta($dlv_fax, mcframe.commonMA.meta.MA_META.TEL);
	public static final MCMeta dlv_cntry_nm_META = createCommonMeta($dlv_cntry_nm, mcframe.commonMA.meta.MA_META.CNTRY_NM);
	public static final MCMeta co_nm_META = createCommonMeta($co_nm, mcframe.commonMA.meta.MA_META.CO_NM);
	public static final MCMeta co_cntry_nm_META = createCommonMeta($co_cntry_nm, mcframe.commonMA.meta.MA_META.CNTRY_NM);
	public static final MCMeta sls_dpt_cd_META = createCommonMeta($sls_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta sls_dpt_zip_cd_META = createCommonMeta($sls_dpt_zip_cd, mcframe.commonMA.meta.MA_META.ZIP_CD);
	public static final MCMeta sls_dpt_addr1_META = createCommonMeta($sls_dpt_addr1, mcframe.commonMA.meta.MA_META.ADDR1);
	public static final MCMeta sls_dpt_addr2_META = createCommonMeta($sls_dpt_addr2, mcframe.commonMA.meta.MA_META.ADDR2);
	public static final MCMeta sls_dpt_addr3_META = createCommonMeta($sls_dpt_addr3, mcframe.commonMA.meta.MA_META.ADDR3);
	public static final MCMeta sls_dpt_addr4_META = createCommonMeta($sls_dpt_addr4, mcframe.commonMA.meta.MA_META.ADDR4);
	public static final MCMeta sls_dpt_addr_META = createStringMeta($sls_dpt_addr);
	public static final MCMeta sls_dpt_nm_META = createCommonMeta($sls_dpt_nm, mcframe.commonMA.meta.MA_META.DPT_NM);
	public static final MCMeta sls_usr_cd_META = createCommonMeta($sls_usr_cd, mcframe.commonMA.meta.MA_META.USR_CD);
	public static final MCMeta sls_usr_nm_META = createCommonMeta($sls_usr_nm, mcframe.commonMA.meta.MA_META.USR_NM);
	public static final MCMeta sls_dpt_tel_META = createCommonMeta($sls_dpt_tel, mcframe.commonMA.meta.MA_META.TEL);
	public static final MCMeta sls_dpt_fax_META = createCommonMeta($sls_dpt_fax, mcframe.commonMA.meta.MA_META.TEL);
	public static final MCMeta tdlv_cd_META = createCommonMeta($tdlv_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta tdlv_zip_cd_META = createCommonMeta($tdlv_zip_cd, mcframe.commonMA.meta.MA_META.ZIP_CD);
	public static final MCMeta tdlv_addr1_META = createCommonMeta($tdlv_addr1, mcframe.commonMA.meta.MA_META.ADDR1);
	public static final MCMeta tdlv_addr2_META = createCommonMeta($tdlv_addr2, mcframe.commonMA.meta.MA_META.ADDR2);
	public static final MCMeta tdlv_addr3_META = createCommonMeta($tdlv_addr3, mcframe.commonMA.meta.MA_META.ADDR3);
	public static final MCMeta tdlv_addr4_META = createCommonMeta($tdlv_addr4, mcframe.commonMA.meta.MA_META.ADDR4);
	public static final MCMeta tdlv_addr_META = createStringMeta($tdlv_addr);
	public static final MCMeta tdlv_nm_META = createCommonMeta($tdlv_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta tdlv_cntct_dpt_META = createCommonMeta($tdlv_cntct_dpt, mcframe.commonMA.meta.MA_META.BP_CNTCT_DPT);
	public static final MCMeta tdlv_cntct_psn_META = createCommonMeta($tdlv_cntct_psn, mcframe.commonMA.meta.MA_META.BP_CNTCT_PSN);
	public static final MCMeta tdlv_tel_META = createCommonMeta($tdlv_tel, mcframe.commonMA.meta.MA_META.TEL);
	public static final MCMeta tdlv_fax_META = createCommonMeta($tdlv_fax, mcframe.commonMA.meta.MA_META.TEL);
	public static final MCMeta cst_po_no_META = createCommonMeta($cst_po_no, mcframe.commonMA.meta.MA_META.CST_PO_NO);
	public static final MCMeta cst_po_d_no_META = createCommonMeta($cst_po_d_no, mcframe.commonMA.meta.MA_META.CST_PO_D_NO);
	public static final MCMeta cst_itm_cd_META = createCommonMeta($cst_itm_cd, mcframe.commonMA.meta.MA_META.BP_ITM_CD);
	public static final MCMeta cst_itm_nm_META = createCommonMeta($cst_itm_nm, mcframe.commonMA.meta.MA_META.BP_ITM_NM);
	public static final MCMeta base_unit_qty_META = createCommonMeta($base_unit_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta s_base_unit_qty_META = createStringMeta($s_base_unit_qty);
	public static final MCMeta base_unit_cd_META = createCommonMeta($base_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta base_unit_nm_META = createCommonMeta($base_unit_nm, mcframe.commonMA.meta.MA_META.UNIT_NM);
	public static final MCMeta trd_unit_qty_META = createCommonMeta($trd_unit_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta s_trd_unit_qty_META = createStringMeta($s_trd_unit_qty);
	public static final MCMeta trd_unit_cd_META = createCommonMeta($trd_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta trd_unit_nm_META = createCommonMeta($trd_unit_nm, mcframe.commonMA.meta.MA_META.UNIT_NM);
	public static final MCMeta ship_act_qty_META = createCommonMeta($ship_act_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta s_ship_act_qty_META = createStringMeta($s_ship_act_qty);
	public static final MCMeta ship_act_unit_nm_META = createCommonMeta($ship_act_unit_nm, mcframe.commonMA.meta.MA_META.UNIT_NM);
	public static final MCMeta dlv_rqst_dt_META = createCommonMeta($dlv_rqst_dt, mcframe.commonMA.meta.MA_META.TM);
	public static final MCMeta dlv_rqst_tm_META = createCommonMeta($dlv_rqst_tm, mcframe.commonMA.meta.MA_META.TM);
	public static final MCMeta slo_dt_META = createCommonMeta($slo_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta slo_no_META = createCommonMeta($slo_no, mcframe.commonMA.meta.MA_META.SLO_NO);
	public static final MCMeta slo_d_no_META = createCommonMeta($slo_d_no, mcframe.commonMA.meta.MA_META.SLO_D_NO);
	public static final MCMeta slo_prms_h_no_META = createCommonMeta($slo_prms_h_no, mcframe.commonMA.meta.MA_META.SLO_PRMS_H_NO);
	public static final MCMeta last_prms_rev_META = createCommonMeta($last_prms_rev, mcframe.commonMA.meta.MA_META.SLIP_REV);
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
	public static final MCMeta sno1_META = createCommonMeta($sno1, mcframe.commonMA.meta.MA_META.SNO1);
	public static final MCMeta sno2_META = createCommonMeta($sno2, mcframe.commonMA.meta.MA_META.SNO2);
	public static final MCMeta sno3_META = createCommonMeta($sno3, mcframe.commonMA.meta.MA_META.SNO3);
	public static final MCMeta sno4_META = createCommonMeta($sno4, mcframe.commonMA.meta.MA_META.SNO4);
	public static final MCMeta slo_sub_char1_META = createCommonMeta($slo_sub_char1, mcframe.commonMS.meta.MS_META.SLO_SUB_CHAR1);
	public static final MCMeta slo_sub_char2_META = createCommonMeta($slo_sub_char2, mcframe.commonMS.meta.MS_META.SLO_SUB_CHAR2);
	public static final MCMeta slo_sub_char3_META = createCommonMeta($slo_sub_char3, mcframe.commonMS.meta.MS_META.SLO_SUB_CHAR3);
	public static final MCMeta slo_d_sub_char1_META = createCommonMeta($slo_d_sub_char1, mcframe.commonMS.meta.MS_META.SLO_D_SUB_CHAR1);
	public static final MCMeta slo_d_sub_char2_META = createCommonMeta($slo_d_sub_char2, mcframe.commonMS.meta.MS_META.SLO_D_SUB_CHAR2);
	public static final MCMeta slo_d_sub_char3_META = createCommonMeta($slo_d_sub_char3, mcframe.commonMS.meta.MS_META.SLO_D_SUB_CHAR3);

	protected static final ConstMetaList<SloPrmsHdrR> constMetas = new ConstMetaList<SloPrmsHdrR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			rpt_sts_typ_nm_META,
			rpt_sts_typ_META,
			prms_prnt_tm_META,
			cst_cd_META,
			cst_zip_cd_META,
			cst_addr1_META,
			cst_addr2_META,
			cst_addr3_META,
			cst_addr4_META,
			cst_addr_META,
			cst_nm_META,
			cst_alt_nm1_META,
			cst_alt_nm2_META,
			cst_alt_nm3_META,
			cst_alt_nm4_META,
			cst_cntct_dpt_META,
			cst_cntct_psn_META,
			cst_cntct_psn_title_META,
			cst_tel_META,
			cst_fax_META,
			cst_cntry_nm_META,
			dlv_cd_META,
			dlv_zip_cd_META,
			dlv_addr1_META,
			dlv_addr2_META,
			dlv_addr3_META,
			dlv_addr4_META,
			dlv_addr_META,
			dlv_nm_META,
			dlv_alt_nm1_META,
			dlv_alt_nm2_META,
			dlv_alt_nm3_META,
			dlv_alt_nm4_META,
			dlv_cntct_dpt_META,
			dlv_cntct_psn_META,
			dlv_cntct_psn_title_META,
			dlv_tel_META,
			dlv_fax_META,
			dlv_cntry_nm_META,
			co_nm_META,
			co_cntry_nm_META,
			sls_dpt_cd_META,
			sls_dpt_zip_cd_META,
			sls_dpt_addr1_META,
			sls_dpt_addr2_META,
			sls_dpt_addr3_META,
			sls_dpt_addr4_META,
			sls_dpt_addr_META,
			sls_dpt_nm_META,
			sls_usr_cd_META,
			sls_usr_nm_META,
			sls_dpt_tel_META,
			sls_dpt_fax_META,
			tdlv_cd_META,
			tdlv_zip_cd_META,
			tdlv_addr1_META,
			tdlv_addr2_META,
			tdlv_addr3_META,
			tdlv_addr4_META,
			tdlv_addr_META,
			tdlv_nm_META,
			tdlv_cntct_dpt_META,
			tdlv_cntct_psn_META,
			tdlv_tel_META,
			tdlv_fax_META,
			cst_po_no_META,
			cst_po_d_no_META,
			cst_itm_cd_META,
			cst_itm_nm_META,
			base_unit_qty_META,
			s_base_unit_qty_META,
			base_unit_cd_META,
			base_unit_nm_META,
			trd_unit_qty_META,
			s_trd_unit_qty_META,
			trd_unit_cd_META,
			trd_unit_nm_META,
			ship_act_qty_META,
			s_ship_act_qty_META,
			ship_act_unit_nm_META,
			dlv_rqst_dt_META,
			dlv_rqst_tm_META,
			slo_dt_META,
			slo_no_META,
			slo_d_no_META,
			slo_prms_h_no_META,
			last_prms_rev_META,
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
			sno1_META,
			sno2_META,
			sno3_META,
			sno4_META,
			slo_sub_char1_META,
			slo_sub_char2_META,
			slo_sub_char3_META,
			slo_d_sub_char1_META,
			slo_d_sub_char2_META,
			slo_d_sub_char3_META
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
	protected SloPrmsHdrR_MC_A(ConstMetaList<? extends SloPrmsHdrR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public SloPrmsHdrR clone() {
		return (SloPrmsHdrR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public SloPrmsHdrR createInstance() {
		return (SloPrmsHdrR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public SloPrmsHdrR getValues(String... names) {
		return (SloPrmsHdrR) super.getValues(names);
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
	 *  納期回答書発行日時.<p>
	 *
	 */
	public MCDate prms_prnt_tm() {
		return getConstDate(offset + 2, $prms_prnt_tm);
	}

	/**
	 *  納期回答書発行日時.<p>
	 *
	 */
	public void prms_prnt_tm(MCDate value) {
		setConstDate(offset + 2, $prms_prnt_tm, value);
	}


	/**
	 *  得意先ＣＤ.<p>
	 *
	 */
	public String cst_cd() {
		return getConstString(offset + 3, $cst_cd);
	}

	/**
	 *  得意先ＣＤ.<p>
	 *
	 */
	public void cst_cd(String value) {
		setConstString(offset + 3, $cst_cd, value);
	}


	/**
	 *  得意先郵便番号.<p>
	 *
	 */
	public String cst_zip_cd() {
		return getConstString(offset + 4, $cst_zip_cd);
	}

	/**
	 *  得意先郵便番号.<p>
	 *
	 */
	public void cst_zip_cd(String value) {
		setConstString(offset + 4, $cst_zip_cd, value);
	}


	/**
	 *  得意先住所１.<p>
	 *
	 */
	public String cst_addr1() {
		return getConstString(offset + 5, $cst_addr1);
	}

	/**
	 *  得意先住所１.<p>
	 *
	 */
	public void cst_addr1(String value) {
		setConstString(offset + 5, $cst_addr1, value);
	}


	/**
	 *  得意先住所２.<p>
	 *
	 */
	public String cst_addr2() {
		return getConstString(offset + 6, $cst_addr2);
	}

	/**
	 *  得意先住所２.<p>
	 *
	 */
	public void cst_addr2(String value) {
		setConstString(offset + 6, $cst_addr2, value);
	}


	/**
	 *  得意先住所３.<p>
	 *
	 */
	public String cst_addr3() {
		return getConstString(offset + 7, $cst_addr3);
	}

	/**
	 *  得意先住所３.<p>
	 *
	 */
	public void cst_addr3(String value) {
		setConstString(offset + 7, $cst_addr3, value);
	}


	/**
	 *  得意先住所４.<p>
	 *
	 */
	public String cst_addr4() {
		return getConstString(offset + 8, $cst_addr4);
	}

	/**
	 *  得意先住所４.<p>
	 *
	 */
	public void cst_addr4(String value) {
		setConstString(offset + 8, $cst_addr4, value);
	}


	/**
	 *  得意先住所１～４.<p>
	 *
	 */
	public String cst_addr() {
		return getConstString(offset + 9, $cst_addr);
	}

	/**
	 *  得意先住所１～４.<p>
	 *
	 */
	public void cst_addr(String value) {
		setConstString(offset + 9, $cst_addr, value);
	}


	/**
	 *  得意先名.<p>
	 *
	 */
	public String cst_nm() {
		return getConstString(offset + 10, $cst_nm);
	}

	/**
	 *  得意先名.<p>
	 *
	 */
	public void cst_nm(String value) {
		setConstString(offset + 10, $cst_nm, value);
	}


	/**
	 *  得意先別名１.<p>
	 *
	 */
	public String cst_alt_nm1() {
		return getConstString(offset + 11, $cst_alt_nm1);
	}

	/**
	 *  得意先別名１.<p>
	 *
	 */
	public void cst_alt_nm1(String value) {
		setConstString(offset + 11, $cst_alt_nm1, value);
	}


	/**
	 *  得意先別名２.<p>
	 *
	 */
	public String cst_alt_nm2() {
		return getConstString(offset + 12, $cst_alt_nm2);
	}

	/**
	 *  得意先別名２.<p>
	 *
	 */
	public void cst_alt_nm2(String value) {
		setConstString(offset + 12, $cst_alt_nm2, value);
	}


	/**
	 *  得意先別名３.<p>
	 *
	 */
	public String cst_alt_nm3() {
		return getConstString(offset + 13, $cst_alt_nm3);
	}

	/**
	 *  得意先別名３.<p>
	 *
	 */
	public void cst_alt_nm3(String value) {
		setConstString(offset + 13, $cst_alt_nm3, value);
	}


	/**
	 *  得意先別名４.<p>
	 *
	 */
	public String cst_alt_nm4() {
		return getConstString(offset + 14, $cst_alt_nm4);
	}

	/**
	 *  得意先別名４.<p>
	 *
	 */
	public void cst_alt_nm4(String value) {
		setConstString(offset + 14, $cst_alt_nm4, value);
	}


	/**
	 *  得意先部署.<p>
	 *
	 */
	public String cst_cntct_dpt() {
		return getConstString(offset + 15, $cst_cntct_dpt);
	}

	/**
	 *  得意先部署.<p>
	 *
	 */
	public void cst_cntct_dpt(String value) {
		setConstString(offset + 15, $cst_cntct_dpt, value);
	}


	/**
	 *  得意先担当者.<p>
	 *
	 */
	public String cst_cntct_psn() {
		return getConstString(offset + 16, $cst_cntct_psn);
	}

	/**
	 *  得意先担当者.<p>
	 *
	 */
	public void cst_cntct_psn(String value) {
		setConstString(offset + 16, $cst_cntct_psn, value);
	}


	/**
	 *  得意先担当者敬称.<p>
	 *
	 */
	public String cst_cntct_psn_title() {
		return getConstString(offset + 17, $cst_cntct_psn_title);
	}

	/**
	 *  得意先担当者敬称.<p>
	 *
	 */
	public void cst_cntct_psn_title(String value) {
		setConstString(offset + 17, $cst_cntct_psn_title, value);
	}


	/**
	 *  得意先ＴＥＬ.<p>
	 *
	 */
	public String cst_tel() {
		return getConstString(offset + 18, $cst_tel);
	}

	/**
	 *  得意先ＴＥＬ.<p>
	 *
	 */
	public void cst_tel(String value) {
		setConstString(offset + 18, $cst_tel, value);
	}


	/**
	 *  得意先ＦＡＸ.<p>
	 *
	 */
	public String cst_fax() {
		return getConstString(offset + 19, $cst_fax);
	}

	/**
	 *  得意先ＦＡＸ.<p>
	 *
	 */
	public void cst_fax(String value) {
		setConstString(offset + 19, $cst_fax, value);
	}


	/**
	 *  得意先国名.<p>
	 *
	 */
	public String cst_cntry_nm() {
		return getConstString(offset + 20, $cst_cntry_nm);
	}

	/**
	 *  得意先国名.<p>
	 *
	 */
	public void cst_cntry_nm(String value) {
		setConstString(offset + 20, $cst_cntry_nm, value);
	}


	/**
	 *  納品先ＣＤ.<p>
	 *
	 */
	public String dlv_cd() {
		return getConstString(offset + 21, $dlv_cd);
	}

	/**
	 *  納品先ＣＤ.<p>
	 *
	 */
	public void dlv_cd(String value) {
		setConstString(offset + 21, $dlv_cd, value);
	}


	/**
	 *  納品先郵便番号.<p>
	 *
	 */
	public String dlv_zip_cd() {
		return getConstString(offset + 22, $dlv_zip_cd);
	}

	/**
	 *  納品先郵便番号.<p>
	 *
	 */
	public void dlv_zip_cd(String value) {
		setConstString(offset + 22, $dlv_zip_cd, value);
	}


	/**
	 *  納品先住所１.<p>
	 *
	 */
	public String dlv_addr1() {
		return getConstString(offset + 23, $dlv_addr1);
	}

	/**
	 *  納品先住所１.<p>
	 *
	 */
	public void dlv_addr1(String value) {
		setConstString(offset + 23, $dlv_addr1, value);
	}


	/**
	 *  納品先住所２.<p>
	 *
	 */
	public String dlv_addr2() {
		return getConstString(offset + 24, $dlv_addr2);
	}

	/**
	 *  納品先住所２.<p>
	 *
	 */
	public void dlv_addr2(String value) {
		setConstString(offset + 24, $dlv_addr2, value);
	}


	/**
	 *  納品先住所３.<p>
	 *
	 */
	public String dlv_addr3() {
		return getConstString(offset + 25, $dlv_addr3);
	}

	/**
	 *  納品先住所３.<p>
	 *
	 */
	public void dlv_addr3(String value) {
		setConstString(offset + 25, $dlv_addr3, value);
	}


	/**
	 *  納品先住所４.<p>
	 *
	 */
	public String dlv_addr4() {
		return getConstString(offset + 26, $dlv_addr4);
	}

	/**
	 *  納品先住所４.<p>
	 *
	 */
	public void dlv_addr4(String value) {
		setConstString(offset + 26, $dlv_addr4, value);
	}


	/**
	 *  納品先住所１～４.<p>
	 *
	 */
	public String dlv_addr() {
		return getConstString(offset + 27, $dlv_addr);
	}

	/**
	 *  納品先住所１～４.<p>
	 *
	 */
	public void dlv_addr(String value) {
		setConstString(offset + 27, $dlv_addr, value);
	}


	/**
	 *  納品先名.<p>
	 *
	 */
	public String dlv_nm() {
		return getConstString(offset + 28, $dlv_nm);
	}

	/**
	 *  納品先名.<p>
	 *
	 */
	public void dlv_nm(String value) {
		setConstString(offset + 28, $dlv_nm, value);
	}


	/**
	 *  納品先別名１.<p>
	 *
	 */
	public String dlv_alt_nm1() {
		return getConstString(offset + 29, $dlv_alt_nm1);
	}

	/**
	 *  納品先別名１.<p>
	 *
	 */
	public void dlv_alt_nm1(String value) {
		setConstString(offset + 29, $dlv_alt_nm1, value);
	}


	/**
	 *  納品先別名２.<p>
	 *
	 */
	public String dlv_alt_nm2() {
		return getConstString(offset + 30, $dlv_alt_nm2);
	}

	/**
	 *  納品先別名２.<p>
	 *
	 */
	public void dlv_alt_nm2(String value) {
		setConstString(offset + 30, $dlv_alt_nm2, value);
	}


	/**
	 *  納品先別名３.<p>
	 *
	 */
	public String dlv_alt_nm3() {
		return getConstString(offset + 31, $dlv_alt_nm3);
	}

	/**
	 *  納品先別名３.<p>
	 *
	 */
	public void dlv_alt_nm3(String value) {
		setConstString(offset + 31, $dlv_alt_nm3, value);
	}


	/**
	 *  納品先別名４.<p>
	 *
	 */
	public String dlv_alt_nm4() {
		return getConstString(offset + 32, $dlv_alt_nm4);
	}

	/**
	 *  納品先別名４.<p>
	 *
	 */
	public void dlv_alt_nm4(String value) {
		setConstString(offset + 32, $dlv_alt_nm4, value);
	}


	/**
	 *  納品先部署.<p>
	 *
	 */
	public String dlv_cntct_dpt() {
		return getConstString(offset + 33, $dlv_cntct_dpt);
	}

	/**
	 *  納品先部署.<p>
	 *
	 */
	public void dlv_cntct_dpt(String value) {
		setConstString(offset + 33, $dlv_cntct_dpt, value);
	}


	/**
	 *  納品先担当者.<p>
	 *
	 */
	public String dlv_cntct_psn() {
		return getConstString(offset + 34, $dlv_cntct_psn);
	}

	/**
	 *  納品先担当者.<p>
	 *
	 */
	public void dlv_cntct_psn(String value) {
		setConstString(offset + 34, $dlv_cntct_psn, value);
	}


	/**
	 *  納品先担当者敬称.<p>
	 *
	 */
	public String dlv_cntct_psn_title() {
		return getConstString(offset + 35, $dlv_cntct_psn_title);
	}

	/**
	 *  納品先担当者敬称.<p>
	 *
	 */
	public void dlv_cntct_psn_title(String value) {
		setConstString(offset + 35, $dlv_cntct_psn_title, value);
	}


	/**
	 *  納品先ＴＥＬ.<p>
	 *
	 */
	public String dlv_tel() {
		return getConstString(offset + 36, $dlv_tel);
	}

	/**
	 *  納品先ＴＥＬ.<p>
	 *
	 */
	public void dlv_tel(String value) {
		setConstString(offset + 36, $dlv_tel, value);
	}


	/**
	 *  納品先ＦＡＸ.<p>
	 *
	 */
	public String dlv_fax() {
		return getConstString(offset + 37, $dlv_fax);
	}

	/**
	 *  納品先ＦＡＸ.<p>
	 *
	 */
	public void dlv_fax(String value) {
		setConstString(offset + 37, $dlv_fax, value);
	}


	/**
	 *  納品先国名.<p>
	 *
	 */
	public String dlv_cntry_nm() {
		return getConstString(offset + 38, $dlv_cntry_nm);
	}

	/**
	 *  納品先国名.<p>
	 *
	 */
	public void dlv_cntry_nm(String value) {
		setConstString(offset + 38, $dlv_cntry_nm, value);
	}


	/**
	 *  会社名.<p>
	 *
	 */
	public String co_nm() {
		return getConstString(offset + 39, $co_nm);
	}

	/**
	 *  会社名.<p>
	 *
	 */
	public void co_nm(String value) {
		setConstString(offset + 39, $co_nm, value);
	}


	/**
	 *  自社国名.<p>
	 *
	 */
	public String co_cntry_nm() {
		return getConstString(offset + 40, $co_cntry_nm);
	}

	/**
	 *  自社国名.<p>
	 *
	 */
	public void co_cntry_nm(String value) {
		setConstString(offset + 40, $co_cntry_nm, value);
	}


	/**
	 *  売上部門ＣＤ.<p>
	 *
	 */
	public String sls_dpt_cd() {
		return getConstString(offset + 41, $sls_dpt_cd);
	}

	/**
	 *  売上部門ＣＤ.<p>
	 *
	 */
	public void sls_dpt_cd(String value) {
		setConstString(offset + 41, $sls_dpt_cd, value);
	}


	/**
	 *  売上部門郵便番号.<p>
	 *
	 */
	public String sls_dpt_zip_cd() {
		return getConstString(offset + 42, $sls_dpt_zip_cd);
	}

	/**
	 *  売上部門郵便番号.<p>
	 *
	 */
	public void sls_dpt_zip_cd(String value) {
		setConstString(offset + 42, $sls_dpt_zip_cd, value);
	}


	/**
	 *  売上部門住所１.<p>
	 *
	 */
	public String sls_dpt_addr1() {
		return getConstString(offset + 43, $sls_dpt_addr1);
	}

	/**
	 *  売上部門住所１.<p>
	 *
	 */
	public void sls_dpt_addr1(String value) {
		setConstString(offset + 43, $sls_dpt_addr1, value);
	}


	/**
	 *  売上部門住所２.<p>
	 *
	 */
	public String sls_dpt_addr2() {
		return getConstString(offset + 44, $sls_dpt_addr2);
	}

	/**
	 *  売上部門住所２.<p>
	 *
	 */
	public void sls_dpt_addr2(String value) {
		setConstString(offset + 44, $sls_dpt_addr2, value);
	}


	/**
	 *  売上部門住所３.<p>
	 *
	 */
	public String sls_dpt_addr3() {
		return getConstString(offset + 45, $sls_dpt_addr3);
	}

	/**
	 *  売上部門住所３.<p>
	 *
	 */
	public void sls_dpt_addr3(String value) {
		setConstString(offset + 45, $sls_dpt_addr3, value);
	}


	/**
	 *  売上部門住所４.<p>
	 *
	 */
	public String sls_dpt_addr4() {
		return getConstString(offset + 46, $sls_dpt_addr4);
	}

	/**
	 *  売上部門住所４.<p>
	 *
	 */
	public void sls_dpt_addr4(String value) {
		setConstString(offset + 46, $sls_dpt_addr4, value);
	}


	/**
	 *  売上部門住所１～４.<p>
	 *
	 */
	public String sls_dpt_addr() {
		return getConstString(offset + 47, $sls_dpt_addr);
	}

	/**
	 *  売上部門住所１～４.<p>
	 *
	 */
	public void sls_dpt_addr(String value) {
		setConstString(offset + 47, $sls_dpt_addr, value);
	}


	/**
	 *  売上部門名.<p>
	 *
	 */
	public String sls_dpt_nm() {
		return getConstString(offset + 48, $sls_dpt_nm);
	}

	/**
	 *  売上部門名.<p>
	 *
	 */
	public void sls_dpt_nm(String value) {
		setConstString(offset + 48, $sls_dpt_nm, value);
	}


	/**
	 *  売上担当者.<p>
	 *
	 */
	public String sls_usr_cd() {
		return getConstString(offset + 49, $sls_usr_cd);
	}

	/**
	 *  売上担当者.<p>
	 *
	 */
	public void sls_usr_cd(String value) {
		setConstString(offset + 49, $sls_usr_cd, value);
	}


	/**
	 *  売上担当者名.<p>
	 *
	 */
	public String sls_usr_nm() {
		return getConstString(offset + 50, $sls_usr_nm);
	}

	/**
	 *  売上担当者名.<p>
	 *
	 */
	public void sls_usr_nm(String value) {
		setConstString(offset + 50, $sls_usr_nm, value);
	}


	/**
	 *  売上部門ＴＥＬ.<p>
	 *
	 */
	public String sls_dpt_tel() {
		return getConstString(offset + 51, $sls_dpt_tel);
	}

	/**
	 *  売上部門ＴＥＬ.<p>
	 *
	 */
	public void sls_dpt_tel(String value) {
		setConstString(offset + 51, $sls_dpt_tel, value);
	}


	/**
	 *  売上部門ＦＡＸ.<p>
	 *
	 */
	public String sls_dpt_fax() {
		return getConstString(offset + 52, $sls_dpt_fax);
	}

	/**
	 *  売上部門ＦＡＸ.<p>
	 *
	 */
	public void sls_dpt_fax(String value) {
		setConstString(offset + 52, $sls_dpt_fax, value);
	}


	/**
	 *  配送先ＣＤ.<p>
	 *
	 */
	public String tdlv_cd() {
		return getConstString(offset + 53, $tdlv_cd);
	}

	/**
	 *  配送先ＣＤ.<p>
	 *
	 */
	public void tdlv_cd(String value) {
		setConstString(offset + 53, $tdlv_cd, value);
	}


	/**
	 *  配送先郵便番号.<p>
	 *
	 */
	public String tdlv_zip_cd() {
		return getConstString(offset + 54, $tdlv_zip_cd);
	}

	/**
	 *  配送先郵便番号.<p>
	 *
	 */
	public void tdlv_zip_cd(String value) {
		setConstString(offset + 54, $tdlv_zip_cd, value);
	}


	/**
	 *  配送先住所１.<p>
	 *
	 */
	public String tdlv_addr1() {
		return getConstString(offset + 55, $tdlv_addr1);
	}

	/**
	 *  配送先住所１.<p>
	 *
	 */
	public void tdlv_addr1(String value) {
		setConstString(offset + 55, $tdlv_addr1, value);
	}


	/**
	 *  配送先住所２.<p>
	 *
	 */
	public String tdlv_addr2() {
		return getConstString(offset + 56, $tdlv_addr2);
	}

	/**
	 *  配送先住所２.<p>
	 *
	 */
	public void tdlv_addr2(String value) {
		setConstString(offset + 56, $tdlv_addr2, value);
	}


	/**
	 *  配送先住所３.<p>
	 *
	 */
	public String tdlv_addr3() {
		return getConstString(offset + 57, $tdlv_addr3);
	}

	/**
	 *  配送先住所３.<p>
	 *
	 */
	public void tdlv_addr3(String value) {
		setConstString(offset + 57, $tdlv_addr3, value);
	}


	/**
	 *  配送先住所４.<p>
	 *
	 */
	public String tdlv_addr4() {
		return getConstString(offset + 58, $tdlv_addr4);
	}

	/**
	 *  配送先住所４.<p>
	 *
	 */
	public void tdlv_addr4(String value) {
		setConstString(offset + 58, $tdlv_addr4, value);
	}


	/**
	 *  配送先住所１～４.<p>
	 *
	 */
	public String tdlv_addr() {
		return getConstString(offset + 59, $tdlv_addr);
	}

	/**
	 *  配送先住所１～４.<p>
	 *
	 */
	public void tdlv_addr(String value) {
		setConstString(offset + 59, $tdlv_addr, value);
	}


	/**
	 *  配送先名.<p>
	 *
	 */
	public String tdlv_nm() {
		return getConstString(offset + 60, $tdlv_nm);
	}

	/**
	 *  配送先名.<p>
	 *
	 */
	public void tdlv_nm(String value) {
		setConstString(offset + 60, $tdlv_nm, value);
	}


	/**
	 *  配送先部署.<p>
	 *
	 */
	public String tdlv_cntct_dpt() {
		return getConstString(offset + 61, $tdlv_cntct_dpt);
	}

	/**
	 *  配送先部署.<p>
	 *
	 */
	public void tdlv_cntct_dpt(String value) {
		setConstString(offset + 61, $tdlv_cntct_dpt, value);
	}


	/**
	 *  配送先担当者.<p>
	 *
	 */
	public String tdlv_cntct_psn() {
		return getConstString(offset + 62, $tdlv_cntct_psn);
	}

	/**
	 *  配送先担当者.<p>
	 *
	 */
	public void tdlv_cntct_psn(String value) {
		setConstString(offset + 62, $tdlv_cntct_psn, value);
	}


	/**
	 *  配送先ＴＥＬ.<p>
	 *
	 */
	public String tdlv_tel() {
		return getConstString(offset + 63, $tdlv_tel);
	}

	/**
	 *  配送先ＴＥＬ.<p>
	 *
	 */
	public void tdlv_tel(String value) {
		setConstString(offset + 63, $tdlv_tel, value);
	}


	/**
	 *  配送先ＦＡＸ.<p>
	 *
	 */
	public String tdlv_fax() {
		return getConstString(offset + 64, $tdlv_fax);
	}

	/**
	 *  配送先ＦＡＸ.<p>
	 *
	 */
	public void tdlv_fax(String value) {
		setConstString(offset + 64, $tdlv_fax, value);
	}


	/**
	 *  得意先注文ＮＯ.<p>
	 *
	 */
	public String cst_po_no() {
		return getConstString(offset + 65, $cst_po_no);
	}

	/**
	 *  得意先注文ＮＯ.<p>
	 *
	 */
	public void cst_po_no(String value) {
		setConstString(offset + 65, $cst_po_no, value);
	}


	/**
	 *  得意先注文明細ＮＯ.<p>
	 *
	 */
	public String cst_po_d_no() {
		return getConstString(offset + 66, $cst_po_d_no);
	}

	/**
	 *  得意先注文明細ＮＯ.<p>
	 *
	 */
	public void cst_po_d_no(String value) {
		setConstString(offset + 66, $cst_po_d_no, value);
	}


	/**
	 *  得意先品目ＣＤ.<p>
	 *
	 */
	public String cst_itm_cd() {
		return getConstString(offset + 67, $cst_itm_cd);
	}

	/**
	 *  得意先品目ＣＤ.<p>
	 *
	 */
	public void cst_itm_cd(String value) {
		setConstString(offset + 67, $cst_itm_cd, value);
	}


	/**
	 *  得意先品名.<p>
	 *
	 */
	public String cst_itm_nm() {
		return getConstString(offset + 68, $cst_itm_nm);
	}

	/**
	 *  得意先品名.<p>
	 *
	 */
	public void cst_itm_nm(String value) {
		setConstString(offset + 68, $cst_itm_nm, value);
	}


	/**
	 *  基準単位数量.<p>
	 *
	 */
	public MCNumber base_unit_qty() {
		return getConstNumber(offset + 69, $base_unit_qty);
	}

	/**
	 *  基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(MCNumber value) {
		setConstNumber(offset + 69, $base_unit_qty, value);
	}

	/**
	 *  基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(int value) {
		setConstNumber(offset + 69, $base_unit_qty, value);
	}

	/**
	 *  基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(long value) {
		setConstNumber(offset + 69, $base_unit_qty, value);
	}

	/**
	 *  基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(float value) {
		setConstNumber(offset + 69, $base_unit_qty, value);
	}

	/**
	 *  基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(double value) {
		setConstNumber(offset + 69, $base_unit_qty, value);
	}


	/**
	 *  基準単位数量文字列.<p>
	 *
	 */
	public String s_base_unit_qty() {
		return getConstString(offset + 70, $s_base_unit_qty);
	}

	/**
	 *  基準単位数量文字列.<p>
	 *
	 */
	public void s_base_unit_qty(String value) {
		setConstString(offset + 70, $s_base_unit_qty, value);
	}


	/**
	 *  基準単位ＣＤ.<p>
	 *
	 */
	public String base_unit_cd() {
		return getConstString(offset + 71, $base_unit_cd);
	}

	/**
	 *  基準単位ＣＤ.<p>
	 *
	 */
	public void base_unit_cd(String value) {
		setConstString(offset + 71, $base_unit_cd, value);
	}


	/**
	 *  基準単位名.<p>
	 *
	 */
	public String base_unit_nm() {
		return getConstString(offset + 72, $base_unit_nm);
	}

	/**
	 *  基準単位名.<p>
	 *
	 */
	public void base_unit_nm(String value) {
		setConstString(offset + 72, $base_unit_nm, value);
	}


	/**
	 *  取引単位数量.<p>
	 *
	 */
	public MCNumber trd_unit_qty() {
		return getConstNumber(offset + 73, $trd_unit_qty);
	}

	/**
	 *  取引単位数量.<p>
	 *
	 */
	public void trd_unit_qty(MCNumber value) {
		setConstNumber(offset + 73, $trd_unit_qty, value);
	}

	/**
	 *  取引単位数量.<p>
	 *
	 */
	public void trd_unit_qty(int value) {
		setConstNumber(offset + 73, $trd_unit_qty, value);
	}

	/**
	 *  取引単位数量.<p>
	 *
	 */
	public void trd_unit_qty(long value) {
		setConstNumber(offset + 73, $trd_unit_qty, value);
	}

	/**
	 *  取引単位数量.<p>
	 *
	 */
	public void trd_unit_qty(float value) {
		setConstNumber(offset + 73, $trd_unit_qty, value);
	}

	/**
	 *  取引単位数量.<p>
	 *
	 */
	public void trd_unit_qty(double value) {
		setConstNumber(offset + 73, $trd_unit_qty, value);
	}


	/**
	 *  取引単位数量文字列.<p>
	 *
	 */
	public String s_trd_unit_qty() {
		return getConstString(offset + 74, $s_trd_unit_qty);
	}

	/**
	 *  取引単位数量文字列.<p>
	 *
	 */
	public void s_trd_unit_qty(String value) {
		setConstString(offset + 74, $s_trd_unit_qty, value);
	}


	/**
	 *  取引単位ＣＤ.<p>
	 *
	 */
	public String trd_unit_cd() {
		return getConstString(offset + 75, $trd_unit_cd);
	}

	/**
	 *  取引単位ＣＤ.<p>
	 *
	 */
	public void trd_unit_cd(String value) {
		setConstString(offset + 75, $trd_unit_cd, value);
	}


	/**
	 *  取引単位名.<p>
	 *
	 */
	public String trd_unit_nm() {
		return getConstString(offset + 76, $trd_unit_nm);
	}

	/**
	 *  取引単位名.<p>
	 *
	 */
	public void trd_unit_nm(String value) {
		setConstString(offset + 76, $trd_unit_nm, value);
	}


	/**
	 *  出荷実績数量.<p>
	 *
	 */
	public MCNumber ship_act_qty() {
		return getConstNumber(offset + 77, $ship_act_qty);
	}

	/**
	 *  出荷実績数量.<p>
	 *
	 */
	public void ship_act_qty(MCNumber value) {
		setConstNumber(offset + 77, $ship_act_qty, value);
	}

	/**
	 *  出荷実績数量.<p>
	 *
	 */
	public void ship_act_qty(int value) {
		setConstNumber(offset + 77, $ship_act_qty, value);
	}

	/**
	 *  出荷実績数量.<p>
	 *
	 */
	public void ship_act_qty(long value) {
		setConstNumber(offset + 77, $ship_act_qty, value);
	}

	/**
	 *  出荷実績数量.<p>
	 *
	 */
	public void ship_act_qty(float value) {
		setConstNumber(offset + 77, $ship_act_qty, value);
	}

	/**
	 *  出荷実績数量.<p>
	 *
	 */
	public void ship_act_qty(double value) {
		setConstNumber(offset + 77, $ship_act_qty, value);
	}


	/**
	 *  出荷実績数量文字列.<p>
	 *
	 */
	public String s_ship_act_qty() {
		return getConstString(offset + 78, $s_ship_act_qty);
	}

	/**
	 *  出荷実績数量文字列.<p>
	 *
	 */
	public void s_ship_act_qty(String value) {
		setConstString(offset + 78, $s_ship_act_qty, value);
	}


	/**
	 *  出荷実績単位名.<p>
	 *
	 */
	public String ship_act_unit_nm() {
		return getConstString(offset + 79, $ship_act_unit_nm);
	}

	/**
	 *  出荷実績単位名.<p>
	 *
	 */
	public void ship_act_unit_nm(String value) {
		setConstString(offset + 79, $ship_act_unit_nm, value);
	}


	/**
	 *  注文書納期（日付）.<p>
	 *
	 */
	public MCDate dlv_rqst_dt() {
		return getConstDate(offset + 80, $dlv_rqst_dt);
	}

	/**
	 *  注文書納期（日付）.<p>
	 *
	 */
	public void dlv_rqst_dt(MCDate value) {
		setConstDate(offset + 80, $dlv_rqst_dt, value);
	}


	/**
	 *  注文書納期（時刻）.<p>
	 *
	 */
	public MCDate dlv_rqst_tm() {
		return getConstDate(offset + 81, $dlv_rqst_tm);
	}

	/**
	 *  注文書納期（時刻）.<p>
	 *
	 */
	public void dlv_rqst_tm(MCDate value) {
		setConstDate(offset + 81, $dlv_rqst_tm, value);
	}


	/**
	 *  受注日.<p>
	 *
	 */
	public MCDate slo_dt() {
		return getConstDate(offset + 82, $slo_dt);
	}

	/**
	 *  受注日.<p>
	 *
	 */
	public void slo_dt(MCDate value) {
		setConstDate(offset + 82, $slo_dt, value);
	}


	/**
	 *  受注ＮＯ.<p>
	 *
	 */
	public String slo_no() {
		return getConstString(offset + 83, $slo_no);
	}

	/**
	 *  受注ＮＯ.<p>
	 *
	 */
	public void slo_no(String value) {
		setConstString(offset + 83, $slo_no, value);
	}


	/**
	 *  受注明細ＮＯ.<p>
	 *
	 */
	public String slo_d_no() {
		return getConstString(offset + 84, $slo_d_no);
	}

	/**
	 *  受注明細ＮＯ.<p>
	 *
	 */
	public void slo_d_no(String value) {
		setConstString(offset + 84, $slo_d_no, value);
	}


	/**
	 *  受注納期回答ヘッダＮＯ.<p>
	 *
	 */
	public String slo_prms_h_no() {
		return getConstString(offset + 85, $slo_prms_h_no);
	}

	/**
	 *  受注納期回答ヘッダＮＯ.<p>
	 *
	 */
	public void slo_prms_h_no(String value) {
		setConstString(offset + 85, $slo_prms_h_no, value);
	}


	/**
	 *  最新納期回答改訂番号.<p>
	 *
	 */
	public MCNumber last_prms_rev() {
		return getConstNumber(offset + 86, $last_prms_rev);
	}

	/**
	 *  最新納期回答改訂番号.<p>
	 *
	 */
	public void last_prms_rev(MCNumber value) {
		setConstNumber(offset + 86, $last_prms_rev, value);
	}

	/**
	 *  最新納期回答改訂番号.<p>
	 *
	 */
	public void last_prms_rev(int value) {
		setConstNumber(offset + 86, $last_prms_rev, value);
	}

	/**
	 *  最新納期回答改訂番号.<p>
	 *
	 */
	public void last_prms_rev(long value) {
		setConstNumber(offset + 86, $last_prms_rev, value);
	}

	/**
	 *  最新納期回答改訂番号.<p>
	 *
	 */
	public void last_prms_rev(float value) {
		setConstNumber(offset + 86, $last_prms_rev, value);
	}

	/**
	 *  最新納期回答改訂番号.<p>
	 *
	 */
	public void last_prms_rev(double value) {
		setConstNumber(offset + 86, $last_prms_rev, value);
	}


	/**
	 *  品目ＣＤ.<p>
	 *
	 */
	public String itm_cd() {
		return getConstString(offset + 87, $itm_cd);
	}

	/**
	 *  品目ＣＤ.<p>
	 *
	 */
	public void itm_cd(String value) {
		setConstString(offset + 87, $itm_cd, value);
	}


	/**
	 *  枝番１（表示用）.<p>
	 *
	 */
	public String itm_sub1_view() {
		return getConstString(offset + 88, $itm_sub1_view);
	}

	/**
	 *  枝番１（表示用）.<p>
	 *
	 */
	public void itm_sub1_view(String value) {
		setConstString(offset + 88, $itm_sub1_view, value);
	}


	/**
	 *  枝番１（データ）.<p>
	 *
	 */
	public String itm_sub1_data() {
		return getConstString(offset + 89, $itm_sub1_data);
	}

	/**
	 *  枝番１（データ）.<p>
	 *
	 */
	public void itm_sub1_data(String value) {
		setConstString(offset + 89, $itm_sub1_data, value);
	}


	/**
	 *  枝番２（表示用）.<p>
	 *
	 */
	public String itm_sub2_view() {
		return getConstString(offset + 90, $itm_sub2_view);
	}

	/**
	 *  枝番２（表示用）.<p>
	 *
	 */
	public void itm_sub2_view(String value) {
		setConstString(offset + 90, $itm_sub2_view, value);
	}


	/**
	 *  枝番２（データ）.<p>
	 *
	 */
	public String itm_sub2_data() {
		return getConstString(offset + 91, $itm_sub2_data);
	}

	/**
	 *  枝番２（データ）.<p>
	 *
	 */
	public void itm_sub2_data(String value) {
		setConstString(offset + 91, $itm_sub2_data, value);
	}


	/**
	 *  枝番３（表示用）.<p>
	 *
	 */
	public String itm_sub3_view() {
		return getConstString(offset + 92, $itm_sub3_view);
	}

	/**
	 *  枝番３（表示用）.<p>
	 *
	 */
	public void itm_sub3_view(String value) {
		setConstString(offset + 92, $itm_sub3_view, value);
	}


	/**
	 *  枝番３（データ）.<p>
	 *
	 */
	public String itm_sub3_data() {
		return getConstString(offset + 93, $itm_sub3_data);
	}

	/**
	 *  枝番３（データ）.<p>
	 *
	 */
	public void itm_sub3_data(String value) {
		setConstString(offset + 93, $itm_sub3_data, value);
	}


	/**
	 *  品名.<p>
	 *
	 */
	public String itm_nm() {
		return getConstString(offset + 94, $itm_nm);
	}

	/**
	 *  品名.<p>
	 *
	 */
	public void itm_nm(String value) {
		setConstString(offset + 94, $itm_nm, value);
	}


	/**
	 *  品目別名１.<p>
	 *
	 */
	public String itm_alt_nm1() {
		return getConstString(offset + 95, $itm_alt_nm1);
	}

	/**
	 *  品目別名１.<p>
	 *
	 */
	public void itm_alt_nm1(String value) {
		setConstString(offset + 95, $itm_alt_nm1, value);
	}


	/**
	 *  品目別名２.<p>
	 *
	 */
	public String itm_alt_nm2() {
		return getConstString(offset + 96, $itm_alt_nm2);
	}

	/**
	 *  品目別名２.<p>
	 *
	 */
	public void itm_alt_nm2(String value) {
		setConstString(offset + 96, $itm_alt_nm2, value);
	}


	/**
	 *  品目別名３.<p>
	 *
	 */
	public String itm_alt_nm3() {
		return getConstString(offset + 97, $itm_alt_nm3);
	}

	/**
	 *  品目別名３.<p>
	 *
	 */
	public void itm_alt_nm3(String value) {
		setConstString(offset + 97, $itm_alt_nm3, value);
	}


	/**
	 *  品目別名４.<p>
	 *
	 */
	public String itm_alt_nm4() {
		return getConstString(offset + 98, $itm_alt_nm4);
	}

	/**
	 *  品目別名４.<p>
	 *
	 */
	public void itm_alt_nm4(String value) {
		setConstString(offset + 98, $itm_alt_nm4, value);
	}


	/**
	 *  手配ＮＯ１.<p>
	 *
	 */
	public String sno1() {
		return getConstString(offset + 99, $sno1);
	}

	/**
	 *  手配ＮＯ１.<p>
	 *
	 */
	public void sno1(String value) {
		setConstString(offset + 99, $sno1, value);
	}


	/**
	 *  手配ＮＯ２.<p>
	 *
	 */
	public String sno2() {
		return getConstString(offset + 100, $sno2);
	}

	/**
	 *  手配ＮＯ２.<p>
	 *
	 */
	public void sno2(String value) {
		setConstString(offset + 100, $sno2, value);
	}


	/**
	 *  手配ＮＯ３.<p>
	 *
	 */
	public String sno3() {
		return getConstString(offset + 101, $sno3);
	}

	/**
	 *  手配ＮＯ３.<p>
	 *
	 */
	public void sno3(String value) {
		setConstString(offset + 101, $sno3, value);
	}


	/**
	 *  手配ＮＯ４.<p>
	 *
	 */
	public String sno4() {
		return getConstString(offset + 102, $sno4);
	}

	/**
	 *  手配ＮＯ４.<p>
	 *
	 */
	public void sno4(String value) {
		setConstString(offset + 102, $sno4, value);
	}


	/**
	 *  受注予備１.<p>
	 *
	 */
	public String slo_sub_char1() {
		return getConstString(offset + 103, $slo_sub_char1);
	}

	/**
	 *  受注予備１.<p>
	 *
	 */
	public void slo_sub_char1(String value) {
		setConstString(offset + 103, $slo_sub_char1, value);
	}


	/**
	 *  受注予備２.<p>
	 *
	 */
	public String slo_sub_char2() {
		return getConstString(offset + 104, $slo_sub_char2);
	}

	/**
	 *  受注予備２.<p>
	 *
	 */
	public void slo_sub_char2(String value) {
		setConstString(offset + 104, $slo_sub_char2, value);
	}


	/**
	 *  受注予備３.<p>
	 *
	 */
	public String slo_sub_char3() {
		return getConstString(offset + 105, $slo_sub_char3);
	}

	/**
	 *  受注予備３.<p>
	 *
	 */
	public void slo_sub_char3(String value) {
		setConstString(offset + 105, $slo_sub_char3, value);
	}


	/**
	 *  受注明細予備１.<p>
	 *
	 */
	public String slo_d_sub_char1() {
		return getConstString(offset + 106, $slo_d_sub_char1);
	}

	/**
	 *  受注明細予備１.<p>
	 *
	 */
	public void slo_d_sub_char1(String value) {
		setConstString(offset + 106, $slo_d_sub_char1, value);
	}


	/**
	 *  受注明細予備２.<p>
	 *
	 */
	public String slo_d_sub_char2() {
		return getConstString(offset + 107, $slo_d_sub_char2);
	}

	/**
	 *  受注明細予備２.<p>
	 *
	 */
	public void slo_d_sub_char2(String value) {
		setConstString(offset + 107, $slo_d_sub_char2, value);
	}


	/**
	 *  受注明細予備３.<p>
	 *
	 */
	public String slo_d_sub_char3() {
		return getConstString(offset + 108, $slo_d_sub_char3);
	}

	/**
	 *  受注明細予備３.<p>
	 *
	 */
	public void slo_d_sub_char3(String value) {
		setConstString(offset + 108, $slo_d_sub_char3, value);
	}


	public String getString(String name) {
		if ($rpt_sts_typ_nm.equalsIgnoreCase(name)) {
			return rpt_sts_typ_nm();
		}
		if ($rpt_sts_typ.equalsIgnoreCase(name)) {
			return rpt_sts_typ();
		}
		if ($cst_cd.equalsIgnoreCase(name)) {
			return cst_cd();
		}
		if ($cst_zip_cd.equalsIgnoreCase(name)) {
			return cst_zip_cd();
		}
		if ($cst_addr1.equalsIgnoreCase(name)) {
			return cst_addr1();
		}
		if ($cst_addr2.equalsIgnoreCase(name)) {
			return cst_addr2();
		}
		if ($cst_addr3.equalsIgnoreCase(name)) {
			return cst_addr3();
		}
		if ($cst_addr4.equalsIgnoreCase(name)) {
			return cst_addr4();
		}
		if ($cst_addr.equalsIgnoreCase(name)) {
			return cst_addr();
		}
		if ($cst_nm.equalsIgnoreCase(name)) {
			return cst_nm();
		}
		if ($cst_alt_nm1.equalsIgnoreCase(name)) {
			return cst_alt_nm1();
		}
		if ($cst_alt_nm2.equalsIgnoreCase(name)) {
			return cst_alt_nm2();
		}
		if ($cst_alt_nm3.equalsIgnoreCase(name)) {
			return cst_alt_nm3();
		}
		if ($cst_alt_nm4.equalsIgnoreCase(name)) {
			return cst_alt_nm4();
		}
		if ($cst_cntct_dpt.equalsIgnoreCase(name)) {
			return cst_cntct_dpt();
		}
		if ($cst_cntct_psn.equalsIgnoreCase(name)) {
			return cst_cntct_psn();
		}
		if ($cst_cntct_psn_title.equalsIgnoreCase(name)) {
			return cst_cntct_psn_title();
		}
		if ($cst_tel.equalsIgnoreCase(name)) {
			return cst_tel();
		}
		if ($cst_fax.equalsIgnoreCase(name)) {
			return cst_fax();
		}
		if ($cst_cntry_nm.equalsIgnoreCase(name)) {
			return cst_cntry_nm();
		}
		if ($dlv_cd.equalsIgnoreCase(name)) {
			return dlv_cd();
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
		if ($dlv_nm.equalsIgnoreCase(name)) {
			return dlv_nm();
		}
		if ($dlv_alt_nm1.equalsIgnoreCase(name)) {
			return dlv_alt_nm1();
		}
		if ($dlv_alt_nm2.equalsIgnoreCase(name)) {
			return dlv_alt_nm2();
		}
		if ($dlv_alt_nm3.equalsIgnoreCase(name)) {
			return dlv_alt_nm3();
		}
		if ($dlv_alt_nm4.equalsIgnoreCase(name)) {
			return dlv_alt_nm4();
		}
		if ($dlv_cntct_dpt.equalsIgnoreCase(name)) {
			return dlv_cntct_dpt();
		}
		if ($dlv_cntct_psn.equalsIgnoreCase(name)) {
			return dlv_cntct_psn();
		}
		if ($dlv_cntct_psn_title.equalsIgnoreCase(name)) {
			return dlv_cntct_psn_title();
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
		if ($co_nm.equalsIgnoreCase(name)) {
			return co_nm();
		}
		if ($co_cntry_nm.equalsIgnoreCase(name)) {
			return co_cntry_nm();
		}
		if ($sls_dpt_cd.equalsIgnoreCase(name)) {
			return sls_dpt_cd();
		}
		if ($sls_dpt_zip_cd.equalsIgnoreCase(name)) {
			return sls_dpt_zip_cd();
		}
		if ($sls_dpt_addr1.equalsIgnoreCase(name)) {
			return sls_dpt_addr1();
		}
		if ($sls_dpt_addr2.equalsIgnoreCase(name)) {
			return sls_dpt_addr2();
		}
		if ($sls_dpt_addr3.equalsIgnoreCase(name)) {
			return sls_dpt_addr3();
		}
		if ($sls_dpt_addr4.equalsIgnoreCase(name)) {
			return sls_dpt_addr4();
		}
		if ($sls_dpt_addr.equalsIgnoreCase(name)) {
			return sls_dpt_addr();
		}
		if ($sls_dpt_nm.equalsIgnoreCase(name)) {
			return sls_dpt_nm();
		}
		if ($sls_usr_cd.equalsIgnoreCase(name)) {
			return sls_usr_cd();
		}
		if ($sls_usr_nm.equalsIgnoreCase(name)) {
			return sls_usr_nm();
		}
		if ($sls_dpt_tel.equalsIgnoreCase(name)) {
			return sls_dpt_tel();
		}
		if ($sls_dpt_fax.equalsIgnoreCase(name)) {
			return sls_dpt_fax();
		}
		if ($tdlv_cd.equalsIgnoreCase(name)) {
			return tdlv_cd();
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
		if ($tdlv_nm.equalsIgnoreCase(name)) {
			return tdlv_nm();
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
		if ($cst_po_no.equalsIgnoreCase(name)) {
			return cst_po_no();
		}
		if ($cst_po_d_no.equalsIgnoreCase(name)) {
			return cst_po_d_no();
		}
		if ($cst_itm_cd.equalsIgnoreCase(name)) {
			return cst_itm_cd();
		}
		if ($cst_itm_nm.equalsIgnoreCase(name)) {
			return cst_itm_nm();
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
		if ($s_trd_unit_qty.equalsIgnoreCase(name)) {
			return s_trd_unit_qty();
		}
		if ($trd_unit_cd.equalsIgnoreCase(name)) {
			return trd_unit_cd();
		}
		if ($trd_unit_nm.equalsIgnoreCase(name)) {
			return trd_unit_nm();
		}
		if ($s_ship_act_qty.equalsIgnoreCase(name)) {
			return s_ship_act_qty();
		}
		if ($ship_act_unit_nm.equalsIgnoreCase(name)) {
			return ship_act_unit_nm();
		}
		if ($slo_no.equalsIgnoreCase(name)) {
			return slo_no();
		}
		if ($slo_d_no.equalsIgnoreCase(name)) {
			return slo_d_no();
		}
		if ($slo_prms_h_no.equalsIgnoreCase(name)) {
			return slo_prms_h_no();
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
		if ($slo_sub_char1.equalsIgnoreCase(name)) {
			return slo_sub_char1();
		}
		if ($slo_sub_char2.equalsIgnoreCase(name)) {
			return slo_sub_char2();
		}
		if ($slo_sub_char3.equalsIgnoreCase(name)) {
			return slo_sub_char3();
		}
		if ($slo_d_sub_char1.equalsIgnoreCase(name)) {
			return slo_d_sub_char1();
		}
		if ($slo_d_sub_char2.equalsIgnoreCase(name)) {
			return slo_d_sub_char2();
		}
		if ($slo_d_sub_char3.equalsIgnoreCase(name)) {
			return slo_d_sub_char3();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			return base_unit_qty();
		}
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			return trd_unit_qty();
		}
		if ($ship_act_qty.equalsIgnoreCase(name)) {
			return ship_act_qty();
		}
		if ($last_prms_rev.equalsIgnoreCase(name)) {
			return last_prms_rev();
		}
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		if ($prms_prnt_tm.equalsIgnoreCase(name)) {
			return prms_prnt_tm();
		}
		if ($dlv_rqst_dt.equalsIgnoreCase(name)) {
			return dlv_rqst_dt();
		}
		if ($dlv_rqst_tm.equalsIgnoreCase(name)) {
			return dlv_rqst_tm();
		}
		if ($slo_dt.equalsIgnoreCase(name)) {
			return slo_dt();
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
		if ($cst_cd.equalsIgnoreCase(name)) {
			return cst_cd();
		}
		if ($cst_zip_cd.equalsIgnoreCase(name)) {
			return cst_zip_cd();
		}
		if ($cst_addr1.equalsIgnoreCase(name)) {
			return cst_addr1();
		}
		if ($cst_addr2.equalsIgnoreCase(name)) {
			return cst_addr2();
		}
		if ($cst_addr3.equalsIgnoreCase(name)) {
			return cst_addr3();
		}
		if ($cst_addr4.equalsIgnoreCase(name)) {
			return cst_addr4();
		}
		if ($cst_addr.equalsIgnoreCase(name)) {
			return cst_addr();
		}
		if ($cst_nm.equalsIgnoreCase(name)) {
			return cst_nm();
		}
		if ($cst_alt_nm1.equalsIgnoreCase(name)) {
			return cst_alt_nm1();
		}
		if ($cst_alt_nm2.equalsIgnoreCase(name)) {
			return cst_alt_nm2();
		}
		if ($cst_alt_nm3.equalsIgnoreCase(name)) {
			return cst_alt_nm3();
		}
		if ($cst_alt_nm4.equalsIgnoreCase(name)) {
			return cst_alt_nm4();
		}
		if ($cst_cntct_dpt.equalsIgnoreCase(name)) {
			return cst_cntct_dpt();
		}
		if ($cst_cntct_psn.equalsIgnoreCase(name)) {
			return cst_cntct_psn();
		}
		if ($cst_cntct_psn_title.equalsIgnoreCase(name)) {
			return cst_cntct_psn_title();
		}
		if ($cst_tel.equalsIgnoreCase(name)) {
			return cst_tel();
		}
		if ($cst_fax.equalsIgnoreCase(name)) {
			return cst_fax();
		}
		if ($cst_cntry_nm.equalsIgnoreCase(name)) {
			return cst_cntry_nm();
		}
		if ($dlv_cd.equalsIgnoreCase(name)) {
			return dlv_cd();
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
		if ($dlv_nm.equalsIgnoreCase(name)) {
			return dlv_nm();
		}
		if ($dlv_alt_nm1.equalsIgnoreCase(name)) {
			return dlv_alt_nm1();
		}
		if ($dlv_alt_nm2.equalsIgnoreCase(name)) {
			return dlv_alt_nm2();
		}
		if ($dlv_alt_nm3.equalsIgnoreCase(name)) {
			return dlv_alt_nm3();
		}
		if ($dlv_alt_nm4.equalsIgnoreCase(name)) {
			return dlv_alt_nm4();
		}
		if ($dlv_cntct_dpt.equalsIgnoreCase(name)) {
			return dlv_cntct_dpt();
		}
		if ($dlv_cntct_psn.equalsIgnoreCase(name)) {
			return dlv_cntct_psn();
		}
		if ($dlv_cntct_psn_title.equalsIgnoreCase(name)) {
			return dlv_cntct_psn_title();
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
		if ($co_nm.equalsIgnoreCase(name)) {
			return co_nm();
		}
		if ($co_cntry_nm.equalsIgnoreCase(name)) {
			return co_cntry_nm();
		}
		if ($sls_dpt_cd.equalsIgnoreCase(name)) {
			return sls_dpt_cd();
		}
		if ($sls_dpt_zip_cd.equalsIgnoreCase(name)) {
			return sls_dpt_zip_cd();
		}
		if ($sls_dpt_addr1.equalsIgnoreCase(name)) {
			return sls_dpt_addr1();
		}
		if ($sls_dpt_addr2.equalsIgnoreCase(name)) {
			return sls_dpt_addr2();
		}
		if ($sls_dpt_addr3.equalsIgnoreCase(name)) {
			return sls_dpt_addr3();
		}
		if ($sls_dpt_addr4.equalsIgnoreCase(name)) {
			return sls_dpt_addr4();
		}
		if ($sls_dpt_addr.equalsIgnoreCase(name)) {
			return sls_dpt_addr();
		}
		if ($sls_dpt_nm.equalsIgnoreCase(name)) {
			return sls_dpt_nm();
		}
		if ($sls_usr_cd.equalsIgnoreCase(name)) {
			return sls_usr_cd();
		}
		if ($sls_usr_nm.equalsIgnoreCase(name)) {
			return sls_usr_nm();
		}
		if ($sls_dpt_tel.equalsIgnoreCase(name)) {
			return sls_dpt_tel();
		}
		if ($sls_dpt_fax.equalsIgnoreCase(name)) {
			return sls_dpt_fax();
		}
		if ($tdlv_cd.equalsIgnoreCase(name)) {
			return tdlv_cd();
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
		if ($tdlv_nm.equalsIgnoreCase(name)) {
			return tdlv_nm();
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
		if ($cst_po_no.equalsIgnoreCase(name)) {
			return cst_po_no();
		}
		if ($cst_po_d_no.equalsIgnoreCase(name)) {
			return cst_po_d_no();
		}
		if ($cst_itm_cd.equalsIgnoreCase(name)) {
			return cst_itm_cd();
		}
		if ($cst_itm_nm.equalsIgnoreCase(name)) {
			return cst_itm_nm();
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
		if ($s_trd_unit_qty.equalsIgnoreCase(name)) {
			return s_trd_unit_qty();
		}
		if ($trd_unit_cd.equalsIgnoreCase(name)) {
			return trd_unit_cd();
		}
		if ($trd_unit_nm.equalsIgnoreCase(name)) {
			return trd_unit_nm();
		}
		if ($s_ship_act_qty.equalsIgnoreCase(name)) {
			return s_ship_act_qty();
		}
		if ($ship_act_unit_nm.equalsIgnoreCase(name)) {
			return ship_act_unit_nm();
		}
		if ($slo_no.equalsIgnoreCase(name)) {
			return slo_no();
		}
		if ($slo_d_no.equalsIgnoreCase(name)) {
			return slo_d_no();
		}
		if ($slo_prms_h_no.equalsIgnoreCase(name)) {
			return slo_prms_h_no();
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
		if ($slo_sub_char1.equalsIgnoreCase(name)) {
			return slo_sub_char1();
		}
		if ($slo_sub_char2.equalsIgnoreCase(name)) {
			return slo_sub_char2();
		}
		if ($slo_sub_char3.equalsIgnoreCase(name)) {
			return slo_sub_char3();
		}
		if ($slo_d_sub_char1.equalsIgnoreCase(name)) {
			return slo_d_sub_char1();
		}
		if ($slo_d_sub_char2.equalsIgnoreCase(name)) {
			return slo_d_sub_char2();
		}
		if ($slo_d_sub_char3.equalsIgnoreCase(name)) {
			return slo_d_sub_char3();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			return base_unit_qty();
		}
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			return trd_unit_qty();
		}
		if ($ship_act_qty.equalsIgnoreCase(name)) {
			return ship_act_qty();
		}
		if ($last_prms_rev.equalsIgnoreCase(name)) {
			return last_prms_rev();
		}
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($prms_prnt_tm.equalsIgnoreCase(name)) {
			return prms_prnt_tm();
		}
		if ($dlv_rqst_dt.equalsIgnoreCase(name)) {
			return dlv_rqst_dt();
		}
		if ($dlv_rqst_tm.equalsIgnoreCase(name)) {
			return dlv_rqst_tm();
		}
		if ($slo_dt.equalsIgnoreCase(name)) {
			return slo_dt();
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
		if ($cst_cd.equalsIgnoreCase(name)) {
			cst_cd(value);
			return;
		}
		if ($cst_zip_cd.equalsIgnoreCase(name)) {
			cst_zip_cd(value);
			return;
		}
		if ($cst_addr1.equalsIgnoreCase(name)) {
			cst_addr1(value);
			return;
		}
		if ($cst_addr2.equalsIgnoreCase(name)) {
			cst_addr2(value);
			return;
		}
		if ($cst_addr3.equalsIgnoreCase(name)) {
			cst_addr3(value);
			return;
		}
		if ($cst_addr4.equalsIgnoreCase(name)) {
			cst_addr4(value);
			return;
		}
		if ($cst_addr.equalsIgnoreCase(name)) {
			cst_addr(value);
			return;
		}
		if ($cst_nm.equalsIgnoreCase(name)) {
			cst_nm(value);
			return;
		}
		if ($cst_alt_nm1.equalsIgnoreCase(name)) {
			cst_alt_nm1(value);
			return;
		}
		if ($cst_alt_nm2.equalsIgnoreCase(name)) {
			cst_alt_nm2(value);
			return;
		}
		if ($cst_alt_nm3.equalsIgnoreCase(name)) {
			cst_alt_nm3(value);
			return;
		}
		if ($cst_alt_nm4.equalsIgnoreCase(name)) {
			cst_alt_nm4(value);
			return;
		}
		if ($cst_cntct_dpt.equalsIgnoreCase(name)) {
			cst_cntct_dpt(value);
			return;
		}
		if ($cst_cntct_psn.equalsIgnoreCase(name)) {
			cst_cntct_psn(value);
			return;
		}
		if ($cst_cntct_psn_title.equalsIgnoreCase(name)) {
			cst_cntct_psn_title(value);
			return;
		}
		if ($cst_tel.equalsIgnoreCase(name)) {
			cst_tel(value);
			return;
		}
		if ($cst_fax.equalsIgnoreCase(name)) {
			cst_fax(value);
			return;
		}
		if ($cst_cntry_nm.equalsIgnoreCase(name)) {
			cst_cntry_nm(value);
			return;
		}
		if ($dlv_cd.equalsIgnoreCase(name)) {
			dlv_cd(value);
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
		if ($dlv_nm.equalsIgnoreCase(name)) {
			dlv_nm(value);
			return;
		}
		if ($dlv_alt_nm1.equalsIgnoreCase(name)) {
			dlv_alt_nm1(value);
			return;
		}
		if ($dlv_alt_nm2.equalsIgnoreCase(name)) {
			dlv_alt_nm2(value);
			return;
		}
		if ($dlv_alt_nm3.equalsIgnoreCase(name)) {
			dlv_alt_nm3(value);
			return;
		}
		if ($dlv_alt_nm4.equalsIgnoreCase(name)) {
			dlv_alt_nm4(value);
			return;
		}
		if ($dlv_cntct_dpt.equalsIgnoreCase(name)) {
			dlv_cntct_dpt(value);
			return;
		}
		if ($dlv_cntct_psn.equalsIgnoreCase(name)) {
			dlv_cntct_psn(value);
			return;
		}
		if ($dlv_cntct_psn_title.equalsIgnoreCase(name)) {
			dlv_cntct_psn_title(value);
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
		if ($co_nm.equalsIgnoreCase(name)) {
			co_nm(value);
			return;
		}
		if ($co_cntry_nm.equalsIgnoreCase(name)) {
			co_cntry_nm(value);
			return;
		}
		if ($sls_dpt_cd.equalsIgnoreCase(name)) {
			sls_dpt_cd(value);
			return;
		}
		if ($sls_dpt_zip_cd.equalsIgnoreCase(name)) {
			sls_dpt_zip_cd(value);
			return;
		}
		if ($sls_dpt_addr1.equalsIgnoreCase(name)) {
			sls_dpt_addr1(value);
			return;
		}
		if ($sls_dpt_addr2.equalsIgnoreCase(name)) {
			sls_dpt_addr2(value);
			return;
		}
		if ($sls_dpt_addr3.equalsIgnoreCase(name)) {
			sls_dpt_addr3(value);
			return;
		}
		if ($sls_dpt_addr4.equalsIgnoreCase(name)) {
			sls_dpt_addr4(value);
			return;
		}
		if ($sls_dpt_addr.equalsIgnoreCase(name)) {
			sls_dpt_addr(value);
			return;
		}
		if ($sls_dpt_nm.equalsIgnoreCase(name)) {
			sls_dpt_nm(value);
			return;
		}
		if ($sls_usr_cd.equalsIgnoreCase(name)) {
			sls_usr_cd(value);
			return;
		}
		if ($sls_usr_nm.equalsIgnoreCase(name)) {
			sls_usr_nm(value);
			return;
		}
		if ($sls_dpt_tel.equalsIgnoreCase(name)) {
			sls_dpt_tel(value);
			return;
		}
		if ($sls_dpt_fax.equalsIgnoreCase(name)) {
			sls_dpt_fax(value);
			return;
		}
		if ($tdlv_cd.equalsIgnoreCase(name)) {
			tdlv_cd(value);
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
		if ($tdlv_nm.equalsIgnoreCase(name)) {
			tdlv_nm(value);
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
		if ($cst_po_no.equalsIgnoreCase(name)) {
			cst_po_no(value);
			return;
		}
		if ($cst_po_d_no.equalsIgnoreCase(name)) {
			cst_po_d_no(value);
			return;
		}
		if ($cst_itm_cd.equalsIgnoreCase(name)) {
			cst_itm_cd(value);
			return;
		}
		if ($cst_itm_nm.equalsIgnoreCase(name)) {
			cst_itm_nm(value);
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
		if ($s_trd_unit_qty.equalsIgnoreCase(name)) {
			s_trd_unit_qty(value);
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
		if ($s_ship_act_qty.equalsIgnoreCase(name)) {
			s_ship_act_qty(value);
			return;
		}
		if ($ship_act_unit_nm.equalsIgnoreCase(name)) {
			ship_act_unit_nm(value);
			return;
		}
		if ($slo_no.equalsIgnoreCase(name)) {
			slo_no(value);
			return;
		}
		if ($slo_d_no.equalsIgnoreCase(name)) {
			slo_d_no(value);
			return;
		}
		if ($slo_prms_h_no.equalsIgnoreCase(name)) {
			slo_prms_h_no(value);
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
		if ($slo_sub_char1.equalsIgnoreCase(name)) {
			slo_sub_char1(value);
			return;
		}
		if ($slo_sub_char2.equalsIgnoreCase(name)) {
			slo_sub_char2(value);
			return;
		}
		if ($slo_sub_char3.equalsIgnoreCase(name)) {
			slo_sub_char3(value);
			return;
		}
		if ($slo_d_sub_char1.equalsIgnoreCase(name)) {
			slo_d_sub_char1(value);
			return;
		}
		if ($slo_d_sub_char2.equalsIgnoreCase(name)) {
			slo_d_sub_char2(value);
			return;
		}
		if ($slo_d_sub_char3.equalsIgnoreCase(name)) {
			slo_d_sub_char3(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
			return;
		}
		if ($ship_act_qty.equalsIgnoreCase(name)) {
			ship_act_qty(value);
			return;
		}
		if ($last_prms_rev.equalsIgnoreCase(name)) {
			last_prms_rev(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
			return;
		}
		if ($ship_act_qty.equalsIgnoreCase(name)) {
			ship_act_qty(value);
			return;
		}
		if ($last_prms_rev.equalsIgnoreCase(name)) {
			last_prms_rev(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
			return;
		}
		if ($ship_act_qty.equalsIgnoreCase(name)) {
			ship_act_qty(value);
			return;
		}
		if ($last_prms_rev.equalsIgnoreCase(name)) {
			last_prms_rev(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
			return;
		}
		if ($ship_act_qty.equalsIgnoreCase(name)) {
			ship_act_qty(value);
			return;
		}
		if ($last_prms_rev.equalsIgnoreCase(name)) {
			last_prms_rev(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
			return;
		}
		if ($ship_act_qty.equalsIgnoreCase(name)) {
			ship_act_qty(value);
			return;
		}
		if ($last_prms_rev.equalsIgnoreCase(name)) {
			last_prms_rev(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($prms_prnt_tm.equalsIgnoreCase(name)) {
			prms_prnt_tm(value);
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
		if ($slo_dt.equalsIgnoreCase(name)) {
			slo_dt(value);
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
		if ($cst_cd.equalsIgnoreCase(name)) {
			cst_cd(value);
			return;
		}
		if ($cst_zip_cd.equalsIgnoreCase(name)) {
			cst_zip_cd(value);
			return;
		}
		if ($cst_addr1.equalsIgnoreCase(name)) {
			cst_addr1(value);
			return;
		}
		if ($cst_addr2.equalsIgnoreCase(name)) {
			cst_addr2(value);
			return;
		}
		if ($cst_addr3.equalsIgnoreCase(name)) {
			cst_addr3(value);
			return;
		}
		if ($cst_addr4.equalsIgnoreCase(name)) {
			cst_addr4(value);
			return;
		}
		if ($cst_addr.equalsIgnoreCase(name)) {
			cst_addr(value);
			return;
		}
		if ($cst_nm.equalsIgnoreCase(name)) {
			cst_nm(value);
			return;
		}
		if ($cst_alt_nm1.equalsIgnoreCase(name)) {
			cst_alt_nm1(value);
			return;
		}
		if ($cst_alt_nm2.equalsIgnoreCase(name)) {
			cst_alt_nm2(value);
			return;
		}
		if ($cst_alt_nm3.equalsIgnoreCase(name)) {
			cst_alt_nm3(value);
			return;
		}
		if ($cst_alt_nm4.equalsIgnoreCase(name)) {
			cst_alt_nm4(value);
			return;
		}
		if ($cst_cntct_dpt.equalsIgnoreCase(name)) {
			cst_cntct_dpt(value);
			return;
		}
		if ($cst_cntct_psn.equalsIgnoreCase(name)) {
			cst_cntct_psn(value);
			return;
		}
		if ($cst_cntct_psn_title.equalsIgnoreCase(name)) {
			cst_cntct_psn_title(value);
			return;
		}
		if ($cst_tel.equalsIgnoreCase(name)) {
			cst_tel(value);
			return;
		}
		if ($cst_fax.equalsIgnoreCase(name)) {
			cst_fax(value);
			return;
		}
		if ($cst_cntry_nm.equalsIgnoreCase(name)) {
			cst_cntry_nm(value);
			return;
		}
		if ($dlv_cd.equalsIgnoreCase(name)) {
			dlv_cd(value);
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
		if ($dlv_nm.equalsIgnoreCase(name)) {
			dlv_nm(value);
			return;
		}
		if ($dlv_alt_nm1.equalsIgnoreCase(name)) {
			dlv_alt_nm1(value);
			return;
		}
		if ($dlv_alt_nm2.equalsIgnoreCase(name)) {
			dlv_alt_nm2(value);
			return;
		}
		if ($dlv_alt_nm3.equalsIgnoreCase(name)) {
			dlv_alt_nm3(value);
			return;
		}
		if ($dlv_alt_nm4.equalsIgnoreCase(name)) {
			dlv_alt_nm4(value);
			return;
		}
		if ($dlv_cntct_dpt.equalsIgnoreCase(name)) {
			dlv_cntct_dpt(value);
			return;
		}
		if ($dlv_cntct_psn.equalsIgnoreCase(name)) {
			dlv_cntct_psn(value);
			return;
		}
		if ($dlv_cntct_psn_title.equalsIgnoreCase(name)) {
			dlv_cntct_psn_title(value);
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
		if ($co_nm.equalsIgnoreCase(name)) {
			co_nm(value);
			return;
		}
		if ($co_cntry_nm.equalsIgnoreCase(name)) {
			co_cntry_nm(value);
			return;
		}
		if ($sls_dpt_cd.equalsIgnoreCase(name)) {
			sls_dpt_cd(value);
			return;
		}
		if ($sls_dpt_zip_cd.equalsIgnoreCase(name)) {
			sls_dpt_zip_cd(value);
			return;
		}
		if ($sls_dpt_addr1.equalsIgnoreCase(name)) {
			sls_dpt_addr1(value);
			return;
		}
		if ($sls_dpt_addr2.equalsIgnoreCase(name)) {
			sls_dpt_addr2(value);
			return;
		}
		if ($sls_dpt_addr3.equalsIgnoreCase(name)) {
			sls_dpt_addr3(value);
			return;
		}
		if ($sls_dpt_addr4.equalsIgnoreCase(name)) {
			sls_dpt_addr4(value);
			return;
		}
		if ($sls_dpt_addr.equalsIgnoreCase(name)) {
			sls_dpt_addr(value);
			return;
		}
		if ($sls_dpt_nm.equalsIgnoreCase(name)) {
			sls_dpt_nm(value);
			return;
		}
		if ($sls_usr_cd.equalsIgnoreCase(name)) {
			sls_usr_cd(value);
			return;
		}
		if ($sls_usr_nm.equalsIgnoreCase(name)) {
			sls_usr_nm(value);
			return;
		}
		if ($sls_dpt_tel.equalsIgnoreCase(name)) {
			sls_dpt_tel(value);
			return;
		}
		if ($sls_dpt_fax.equalsIgnoreCase(name)) {
			sls_dpt_fax(value);
			return;
		}
		if ($tdlv_cd.equalsIgnoreCase(name)) {
			tdlv_cd(value);
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
		if ($tdlv_nm.equalsIgnoreCase(name)) {
			tdlv_nm(value);
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
		if ($cst_po_no.equalsIgnoreCase(name)) {
			cst_po_no(value);
			return;
		}
		if ($cst_po_d_no.equalsIgnoreCase(name)) {
			cst_po_d_no(value);
			return;
		}
		if ($cst_itm_cd.equalsIgnoreCase(name)) {
			cst_itm_cd(value);
			return;
		}
		if ($cst_itm_nm.equalsIgnoreCase(name)) {
			cst_itm_nm(value);
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
		if ($s_trd_unit_qty.equalsIgnoreCase(name)) {
			s_trd_unit_qty(value);
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
		if ($s_ship_act_qty.equalsIgnoreCase(name)) {
			s_ship_act_qty(value);
			return;
		}
		if ($ship_act_unit_nm.equalsIgnoreCase(name)) {
			ship_act_unit_nm(value);
			return;
		}
		if ($slo_no.equalsIgnoreCase(name)) {
			slo_no(value);
			return;
		}
		if ($slo_d_no.equalsIgnoreCase(name)) {
			slo_d_no(value);
			return;
		}
		if ($slo_prms_h_no.equalsIgnoreCase(name)) {
			slo_prms_h_no(value);
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
		if ($slo_sub_char1.equalsIgnoreCase(name)) {
			slo_sub_char1(value);
			return;
		}
		if ($slo_sub_char2.equalsIgnoreCase(name)) {
			slo_sub_char2(value);
			return;
		}
		if ($slo_sub_char3.equalsIgnoreCase(name)) {
			slo_sub_char3(value);
			return;
		}
		if ($slo_d_sub_char1.equalsIgnoreCase(name)) {
			slo_d_sub_char1(value);
			return;
		}
		if ($slo_d_sub_char2.equalsIgnoreCase(name)) {
			slo_d_sub_char2(value);
			return;
		}
		if ($slo_d_sub_char3.equalsIgnoreCase(name)) {
			slo_d_sub_char3(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
			return;
		}
		if ($ship_act_qty.equalsIgnoreCase(name)) {
			ship_act_qty(value);
			return;
		}
		if ($last_prms_rev.equalsIgnoreCase(name)) {
			last_prms_rev(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
			return;
		}
		if ($ship_act_qty.equalsIgnoreCase(name)) {
			ship_act_qty(value);
			return;
		}
		if ($last_prms_rev.equalsIgnoreCase(name)) {
			last_prms_rev(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
			return;
		}
		if ($ship_act_qty.equalsIgnoreCase(name)) {
			ship_act_qty(value);
			return;
		}
		if ($last_prms_rev.equalsIgnoreCase(name)) {
			last_prms_rev(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
			return;
		}
		if ($ship_act_qty.equalsIgnoreCase(name)) {
			ship_act_qty(value);
			return;
		}
		if ($last_prms_rev.equalsIgnoreCase(name)) {
			last_prms_rev(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
			return;
		}
		if ($ship_act_qty.equalsIgnoreCase(name)) {
			ship_act_qty(value);
			return;
		}
		if ($last_prms_rev.equalsIgnoreCase(name)) {
			last_prms_rev(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($prms_prnt_tm.equalsIgnoreCase(name)) {
			prms_prnt_tm(value);
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
		if ($slo_dt.equalsIgnoreCase(name)) {
			slo_dt(value);
			return;
		}
		super.setDateNE(name, value);
	}



}

