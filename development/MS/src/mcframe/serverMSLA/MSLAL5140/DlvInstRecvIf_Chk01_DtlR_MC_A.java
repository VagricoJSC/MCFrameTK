package mcframe.serverMSLA.MSLAL5140;

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
 * ブロック"DlvInstRecvIf_Chk01_Dtl"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class DlvInstRecvIf_Chk01_DtlR_MC_A extends MCConstRow {

	public static final String $dlvInst = "dlvInst";
	/**
	 * Sales order details No. 受注明細ＮＯ.<p>
	 *
	 */
	public static final String $slo_d_no = "slo_d_no";
	/**
	 * Shipping progress No. 出荷進捗ＮＯ.<p>
	 *
	 */
	public static final String $ship_pr_no = "ship_pr_no";
	/**
	 * Transaction pattern type 取引パタン区分.<p>
	 *
	 */
	public static final String $trd_ptn_typ = "trd_ptn_typ";
	/**
	 * Sales order No. 受注ＮＯ.<p>
	 *
	 */
	public static final String $slo_no = "slo_no";
	/**
	 * Sales order date 受注日.<p>
	 *
	 */
	public static final String $slo_dt = "slo_dt";
	/**
	 * Sales dept. cd. 売上部門ＣＤ.<p>
	 *
	 */
	public static final String $sls_dpt_cd = "sls_dpt_cd";
	/**
	 * Sales PIC cd. 売上担当者ＣＤ.<p>
	 *
	 */
	public static final String $sls_usr_cd = "sls_usr_cd";
	/**
	 * Invoice transaction (Master) インボイス取引（マスタ）.<p>
	 *
	 */
	public static final String $cst_iv_flg = "cst_iv_flg";
	/**
	 * Procurement type 手配区分.<p>
	 *
	 */
	public static final String $proc_typ = "proc_typ";
	/**
	 * WG cd. (Sales dept.) ワーキンググループＣＤ（売上部門）.<p>
	 *
	 */
	public static final String $dpt_wg_cd = "dpt_wg_cd";
	/**
	 * Delivery order received No. 納入指示受領ＮＯ.<p>
	 *
	 */
	public static final String $dlv_inst_rcpt_no = "dlv_inst_rcpt_no";
	/**
	 * Delivery order rev. number 納入指示改訂番号.<p>
	 *
	 */
	public static final String $dlv_inst_rcpt_rev = "dlv_inst_rcpt_rev";
	/**
	 * Miscellaneous delivery destination (Master) 納品先諸口（マスタ）.<p>
	 *
	 */
	public static final String $dlv_sundry_flg = "dlv_sundry_flg";
	/**
	 * Receiving point stopover type (Sales order details) 配送先経由区分（受注明細）.<p>
	 *
	 */
	public static final String $slo_via_dlv_typ = "slo_via_dlv_typ";
	/**
	 * Delivery destination name (Master) 納品先名（マスタ）.<p>
	 *
	 */
	public static final String $mst_dlv_nm = "mst_dlv_nm";
	/**
	 * Delivery destination dept. (Master) 納品先部署（マスタ）.<p>
	 *
	 */
	public static final String $mst_dlv_cntct_dpt = "mst_dlv_cntct_dpt";
	/**
	 * Delivery destination PIC (Master) 納品先担当者（マスタ）.<p>
	 *
	 */
	public static final String $mst_dlv_cntct_psn = "mst_dlv_cntct_psn";
	/**
	 * Delivery destination postal code (Master) 納品先郵便番号（マスタ）.<p>
	 *
	 */
	public static final String $mst_dlv_zip_cd = "mst_dlv_zip_cd";
	/**
	 * Delivery destination address 1 (Master) 納品先住所１（マスタ）.<p>
	 *
	 */
	public static final String $mst_dlv_addr1 = "mst_dlv_addr1";
	/**
	 * Delivery address 2 (Master) 納品先住所２（マスタ）.<p>
	 *
	 */
	public static final String $mst_dlv_addr2 = "mst_dlv_addr2";
	/**
	 * Delivery address 3 (Master) 納品先住所３（マスタ）.<p>
	 *
	 */
	public static final String $mst_dlv_addr3 = "mst_dlv_addr3";
	/**
	 * Delivery address 4 (Master) 納品先住所４（マスタ）.<p>
	 *
	 */
	public static final String $mst_dlv_addr4 = "mst_dlv_addr4";
	/**
	 * Delivery destination TEL (Master) 納品先ＴＥＬ（マスタ）.<p>
	 *
	 */
	public static final String $mst_dlv_tel = "mst_dlv_tel";
	/**
	 * Delivery destination FAX (Master) 納品先ＦＡＸ（マスタ）.<p>
	 *
	 */
	public static final String $mst_dlv_fax = "mst_dlv_fax";
	/**
	 * Delivery destination distribution group cd. (Master) 納品先物流グループＣＤ（マスタ）.<p>
	 *
	 */
	public static final String $dlv_lg_grp_cd = "dlv_lg_grp_cd";
	/**
	 * Print price 価格印字.<p>
	 *
	 */
	public static final String $pri_prnt_flg = "pri_prnt_flg";
	/**
	 * Miscellaneous receiving point (master) 配送先諸口（マスタ）.<p>
	 *
	 */
	public static final String $tdlv_sundry_flg = "tdlv_sundry_flg";
	/**
	 * Delivery name (master) 配送先名（マスタ）.<p>
	 *
	 */
	public static final String $mst_tdlv_nm = "mst_tdlv_nm";
	/**
	 * Destination via classification (master) 配送先経由区分（マスタ）.<p>
	 *
	 */
	public static final String $via_dlv_typ = "via_dlv_typ";
	/**
	 * Destination dept. (master) 配送先部署（マスタ）.<p>
	 *
	 */
	public static final String $mst_tdlv_cntct_dpt = "mst_tdlv_cntct_dpt";
	/**
	 * Delivery person in charge (master) 配送先担当者（マスタ）.<p>
	 *
	 */
	public static final String $mst_tdlv_cntct_psn = "mst_tdlv_cntct_psn";
	/**
	 * Delivery destination postal code (master) 配送先郵便番号（マスタ）.<p>
	 *
	 */
	public static final String $mst_tdlv_zip_cd = "mst_tdlv_zip_cd";
	/**
	 * Shipping address 1 (master) 配送先住所１（マスタ）.<p>
	 *
	 */
	public static final String $mst_tdlv_addr1 = "mst_tdlv_addr1";
	/**
	 * Shipping address 2 (master) 配送先住所２（マスタ）.<p>
	 *
	 */
	public static final String $mst_tdlv_addr2 = "mst_tdlv_addr2";
	/**
	 * Shipping address 3 (master) 配送先住所３（マスタ）.<p>
	 *
	 */
	public static final String $mst_tdlv_addr3 = "mst_tdlv_addr3";
	/**
	 * Shipping address 4 (master) 配送先住所４（マスタ）.<p>
	 *
	 */
	public static final String $mst_tdlv_addr4 = "mst_tdlv_addr4";
	/**
	 * Delivery destination TEL (master) 配送先ＴＥＬ（マスタ）.<p>
	 *
	 */
	public static final String $mst_tdlv_tel = "mst_tdlv_tel";
	/**
	 * Delivery destination fax (master) 配送先ＦＡＸ（マスタ）.<p>
	 *
	 */
	public static final String $mst_tdlv_fax = "mst_tdlv_fax";
	/**
	 * Delivery destination distribution group cd. (master) 配送先物流グループＣＤ（マスタ）.<p>
	 *
	 */
	public static final String $tdlv_lg_grp_cd = "tdlv_lg_grp_cd";
	/**
	 * Discount item (Master) 値引品目（マスタ）.<p>
	 *
	 */
	public static final String $dscnt_itm_flg = "dscnt_itm_flg";
	/**
	 * Assortment type 品揃区分.<p>
	 *
	 */
	public static final String $assort_typ = "assort_typ";
	/**
	 * Assortment group No. 品揃グループＮＯ.<p>
	 *
	 */
	public static final String $set_itm_grp_no = "set_itm_grp_no";
	/**
	 * Transaction unit conversion base qty. 取引単位分母数量.<p>
	 *
	 */
	public static final String $trd_unit_conv_base_qty = "trd_unit_conv_base_qty";
	/**
	 * Transaction unit conversion qty. 取引単位換算数量.<p>
	 *
	 */
	public static final String $trd_unit_conv_qty = "trd_unit_conv_qty";
	/**
	 * Transaction unit number of decimal places 取引単位小数部有効桁数.<p>
	 *
	 */
	public static final String $base_unit_dec_place = "base_unit_dec_place";
	/**
	 * Transaction unit rounding type 取引単位端数処理区分.<p>
	 *
	 */
	public static final String $base_unit_rnd_typ = "base_unit_rnd_typ";
	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public static final String $base_unit_cd = "base_unit_cd";
	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public static final String $base_unit_qty = "base_unit_qty";
	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public static final String $intr_rmrks = "intr_rmrks";
	/**
	 * Shipping progress update counter 出荷進捗更新カウンタ.<p>
	 *
	 */
	public static final String $ship_pr_upd_cntr = "ship_pr_upd_cntr";
	/**
	 * Sales order header update counter 受注ヘッダ更新カウンタ.<p>
	 *
	 */
	public static final String $slo_upd_cntr = "slo_upd_cntr";
	/**
	 * Error エラー.<p>
	 *
	 */
	public static final String $err_flg = "err_flg";
	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public static final String $peg_no = "peg_no";

	public static final String $data_lno = $dlvInst + ".data_lno";
	public static final String $data_no = $dlvInst + ".data_no";
	public static final String $data_crud_typ = $dlvInst + ".data_crud_typ";
	public static final String $ext_sys_cd = $dlvInst + ".ext_sys_cd";
	public static final String $exe_sts_typ = $dlvInst + ".exe_sts_typ";
	public static final String $ext_data_no = $dlvInst + ".ext_data_no";
	public static final String $ext_data_lno = $dlvInst + ".ext_data_lno";
	public static final String $data_make_dt = $dlvInst + ".data_make_dt";
	public static final String $imp_flg = $dlvInst + ".imp_flg";
	public static final String $recv_dt = $dlvInst + ".recv_dt";
	public static final String $cst_dlv_inst_no = $dlvInst + ".cst_dlv_inst_no";
	public static final String $cst_dlv_inst_rev = $dlvInst + ".cst_dlv_inst_rev";
	public static final String $cst_dlv_inst_d_no = $dlvInst + ".cst_dlv_inst_d_no";
	public static final String $cst_po_no = $dlvInst + ".cst_po_no";
	public static final String $cst_po_rev = $dlvInst + ".cst_po_rev";
	public static final String $cst_po_d_no = $dlvInst + ".cst_po_d_no";
	public static final String $cst_cd = $dlvInst + ".cst_cd";
	public static final String $dlv_inst_dt = $dlvInst + ".dlv_inst_dt";
	public static final String $dlv_cd = $dlvInst + ".dlv_cd";
	public static final String $dlv_nm = $dlvInst + ".dlv_nm";
	public static final String $dlv_cntct_dpt = $dlvInst + ".dlv_cntct_dpt";
	public static final String $dlv_cntct_psn = $dlvInst + ".dlv_cntct_psn";
	public static final String $dlv_zip_cd = $dlvInst + ".dlv_zip_cd";
	public static final String $dlv_addr1 = $dlvInst + ".dlv_addr1";
	public static final String $dlv_addr2 = $dlvInst + ".dlv_addr2";
	public static final String $dlv_addr3 = $dlvInst + ".dlv_addr3";
	public static final String $dlv_addr4 = $dlvInst + ".dlv_addr4";
	public static final String $dlv_tel = $dlvInst + ".dlv_tel";
	public static final String $dlv_fax = $dlvInst + ".dlv_fax";
	public static final String $dlv_cntry_cd = $dlvInst + ".dlv_cntry_cd";
	public static final String $tdlv_cd = $dlvInst + ".tdlv_cd";
	public static final String $tdlv_nm = $dlvInst + ".tdlv_nm";
	public static final String $tdlv_cntct_dpt = $dlvInst + ".tdlv_cntct_dpt";
	public static final String $tdlv_cntct_psn = $dlvInst + ".tdlv_cntct_psn";
	public static final String $tdlv_zip_cd = $dlvInst + ".tdlv_zip_cd";
	public static final String $tdlv_addr1 = $dlvInst + ".tdlv_addr1";
	public static final String $tdlv_addr2 = $dlvInst + ".tdlv_addr2";
	public static final String $tdlv_addr3 = $dlvInst + ".tdlv_addr3";
	public static final String $tdlv_addr4 = $dlvInst + ".tdlv_addr4";
	public static final String $tdlv_tel = $dlvInst + ".tdlv_tel";
	public static final String $tdlv_fax = $dlvInst + ".tdlv_fax";
	public static final String $tdlv_cntry_cd = $dlvInst + ".tdlv_cntry_cd";
	public static final String $dlv_day_week_typ = $dlvInst + ".dlv_day_week_typ";
	public static final String $pri_prnt_typ = $dlvInst + ".pri_prnt_typ";
	public static final String $cst_itm_cd = $dlvInst + ".cst_itm_cd";
	public static final String $cst_itm_nm = $dlvInst + ".cst_itm_nm";
	public static final String $itm_cd = $dlvInst + ".itm_cd";
	public static final String $itm_sub1 = $dlvInst + ".itm_sub1";
	public static final String $itm_sub2 = $dlvInst + ".itm_sub2";
	public static final String $itm_sub3 = $dlvInst + ".itm_sub3";
	public static final String $itm_nm = $dlvInst + ".itm_nm";
	public static final String $trd_unit_cd = $dlvInst + ".trd_unit_cd";
	public static final String $trd_unit_qty = $dlvInst + ".trd_unit_qty";
	public static final String $dlv_rqst_tm = $dlvInst + ".dlv_rqst_tm";
	public static final String $cst_dlv_inst_rmrks = $dlvInst + ".cst_dlv_inst_rmrks";
	public static final String $cst_dlv_inst_d_rmrks = $dlvInst + ".cst_dlv_inst_d_rmrks";
	public static final String $sub_char1 = $dlvInst + ".sub_char1";
	public static final String $sub_char2 = $dlvInst + ".sub_char2";
	public static final String $sub_char3 = $dlvInst + ".sub_char3";
	public static final String $sub_char4 = $dlvInst + ".sub_char4";
	public static final String $sub_char5 = $dlvInst + ".sub_char5";
	public static final String $sub_char6 = $dlvInst + ".sub_char6";
	public static final String $sub_char7 = $dlvInst + ".sub_char7";
	public static final String $sub_char8 = $dlvInst + ".sub_char8";
	public static final String $sub_char9 = $dlvInst + ".sub_char9";
	public static final String $sub_char10 = $dlvInst + ".sub_char10";
	public static final String $sub_char11 = $dlvInst + ".sub_char11";
	public static final String $sub_char12 = $dlvInst + ".sub_char12";
	public static final String $sub_char13 = $dlvInst + ".sub_char13";
	public static final String $sub_char14 = $dlvInst + ".sub_char14";
	public static final String $sub_char15 = $dlvInst + ".sub_char15";
	public static final String $sub_char16 = $dlvInst + ".sub_char16";
	public static final String $sub_char17 = $dlvInst + ".sub_char17";
	public static final String $sub_char18 = $dlvInst + ".sub_char18";
	public static final String $sub_char19 = $dlvInst + ".sub_char19";
	public static final String $sub_char20 = $dlvInst + ".sub_char20";
	public static final String $sub_char21 = $dlvInst + ".sub_char21";
	public static final String $sub_char22 = $dlvInst + ".sub_char22";
	public static final String $sub_char23 = $dlvInst + ".sub_char23";
	public static final String $sub_char24 = $dlvInst + ".sub_char24";
	public static final String $sub_char25 = $dlvInst + ".sub_char25";
	public static final String $sub_char26 = $dlvInst + ".sub_char26";
	public static final String $sub_char27 = $dlvInst + ".sub_char27";
	public static final String $sub_char28 = $dlvInst + ".sub_char28";
	public static final String $sub_char29 = $dlvInst + ".sub_char29";
	public static final String $sub_char30 = $dlvInst + ".sub_char30";
	public static final String $sub_num1 = $dlvInst + ".sub_num1";
	public static final String $sub_num2 = $dlvInst + ".sub_num2";
	public static final String $sub_num3 = $dlvInst + ".sub_num3";
	public static final String $sub_num4 = $dlvInst + ".sub_num4";
	public static final String $sub_num5 = $dlvInst + ".sub_num5";
	public static final String $sub_dt1 = $dlvInst + ".sub_dt1";
	public static final String $sub_dt2 = $dlvInst + ".sub_dt2";
	public static final String $sub_dt3 = $dlvInst + ".sub_dt3";
	public static final String $sub_dt4 = $dlvInst + ".sub_dt4";
	public static final String $sub_dt5 = $dlvInst + ".sub_dt5";
	public static final String $log_sub_key1 = $dlvInst + ".log_sub_key1";
	public static final String $log_sub_key2 = $dlvInst + ".log_sub_key2";

	public static final MCMeta dlvInst_META = createInnerRowMeta($dlvInst, mcframe.serverMS.dbc.MST_DLV_INST_RECV_IF_R.class);
	public static final MCMeta slo_d_no_META = createCommonMeta($slo_d_no, mcframe.commonMA.meta.MA_META.SLO_D_NO);
	public static final MCMeta ship_pr_no_META = createCommonMeta($ship_pr_no, mcframe.commonMA.meta.MA_META.SHIP_PR_NO);
	public static final MCMeta trd_ptn_typ_META = createCommonMeta($trd_ptn_typ, mcframe.commonMA.meta.MA_META.TRD_PTN_TYP);
	public static final MCMeta slo_no_META = createCommonMeta($slo_no, mcframe.commonMA.meta.MA_META.SLO_NO);
	public static final MCMeta slo_dt_META = createCommonMeta($slo_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta sls_dpt_cd_META = createCommonMeta($sls_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta sls_usr_cd_META = createCommonMeta($sls_usr_cd, mcframe.commonMA.meta.MA_META.USR_CD);
	public static final MCMeta cst_iv_flg_META = createCommonMeta($cst_iv_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta proc_typ_META = createCommonMeta($proc_typ, mcframe.commonMA.meta.MA_META.SLO_PROC_TYP);
	public static final MCMeta dpt_wg_cd_META = createCommonMeta($dpt_wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta dlv_inst_rcpt_no_META = createCommonMeta($dlv_inst_rcpt_no, mcframe.commonMA.meta.MA_META.DLV_INST_RCPT_NO);
	public static final MCMeta dlv_inst_rcpt_rev_META = createCommonMeta($dlv_inst_rcpt_rev, mcframe.commonMA.meta.MA_META.SLIP_REV);
	public static final MCMeta dlv_sundry_flg_META = createCommonMeta($dlv_sundry_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta slo_via_dlv_typ_META = createCommonMeta($slo_via_dlv_typ, mcframe.commonMA.meta.MA_META.VIA_DLV_TYP);
	public static final MCMeta mst_dlv_nm_META = createCommonMeta($mst_dlv_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta mst_dlv_cntct_dpt_META = createCommonMeta($mst_dlv_cntct_dpt, mcframe.commonMA.meta.MA_META.BP_CNTCT_DPT);
	public static final MCMeta mst_dlv_cntct_psn_META = createCommonMeta($mst_dlv_cntct_psn, mcframe.commonMA.meta.MA_META.BP_CNTCT_PSN);
	public static final MCMeta mst_dlv_zip_cd_META = createCommonMeta($mst_dlv_zip_cd, mcframe.commonMA.meta.MA_META.ZIP_CD);
	public static final MCMeta mst_dlv_addr1_META = createCommonMeta($mst_dlv_addr1, mcframe.commonMA.meta.MA_META.ADDR);
	public static final MCMeta mst_dlv_addr2_META = createCommonMeta($mst_dlv_addr2, mcframe.commonMA.meta.MA_META.ADDR);
	public static final MCMeta mst_dlv_addr3_META = createCommonMeta($mst_dlv_addr3, mcframe.commonMA.meta.MA_META.ADDR);
	public static final MCMeta mst_dlv_addr4_META = createCommonMeta($mst_dlv_addr4, mcframe.commonMA.meta.MA_META.ADDR);
	public static final MCMeta mst_dlv_tel_META = createCommonMeta($mst_dlv_tel, mcframe.commonMA.meta.MA_META.TEL);
	public static final MCMeta mst_dlv_fax_META = createCommonMeta($mst_dlv_fax, mcframe.commonMA.meta.MA_META.TEL);
	public static final MCMeta dlv_lg_grp_cd_META = createCommonMeta($dlv_lg_grp_cd, mcframe.commonMA.meta.MA_META.LG_GRP_CD);
	public static final MCMeta pri_prnt_flg_META = createCommonMeta($pri_prnt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta tdlv_sundry_flg_META = createCommonMeta($tdlv_sundry_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta mst_tdlv_nm_META = createCommonMeta($mst_tdlv_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta via_dlv_typ_META = createCommonMeta($via_dlv_typ, mcframe.commonMA.meta.MA_META.VIA_DLV_TYP);
	public static final MCMeta mst_tdlv_cntct_dpt_META = createCommonMeta($mst_tdlv_cntct_dpt, mcframe.commonMA.meta.MA_META.BP_CNTCT_DPT);
	public static final MCMeta mst_tdlv_cntct_psn_META = createCommonMeta($mst_tdlv_cntct_psn, mcframe.commonMA.meta.MA_META.BP_CNTCT_PSN);
	public static final MCMeta mst_tdlv_zip_cd_META = createCommonMeta($mst_tdlv_zip_cd, mcframe.commonMA.meta.MA_META.ZIP_CD);
	public static final MCMeta mst_tdlv_addr1_META = createCommonMeta($mst_tdlv_addr1, mcframe.commonMA.meta.MA_META.ADDR);
	public static final MCMeta mst_tdlv_addr2_META = createCommonMeta($mst_tdlv_addr2, mcframe.commonMA.meta.MA_META.ADDR);
	public static final MCMeta mst_tdlv_addr3_META = createCommonMeta($mst_tdlv_addr3, mcframe.commonMA.meta.MA_META.ADDR);
	public static final MCMeta mst_tdlv_addr4_META = createCommonMeta($mst_tdlv_addr4, mcframe.commonMA.meta.MA_META.ADDR);
	public static final MCMeta mst_tdlv_tel_META = createCommonMeta($mst_tdlv_tel, mcframe.commonMA.meta.MA_META.TEL);
	public static final MCMeta mst_tdlv_fax_META = createCommonMeta($mst_tdlv_fax, mcframe.commonMA.meta.MA_META.TEL);
	public static final MCMeta tdlv_lg_grp_cd_META = createCommonMeta($tdlv_lg_grp_cd, mcframe.commonMA.meta.MA_META.LG_GRP_CD);
	public static final MCMeta dscnt_itm_flg_META = createCommonMeta($dscnt_itm_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta assort_typ_META = createCommonMeta($assort_typ, mcframe.commonMS.meta.MS_META.SHIP_ASSORT_TYP);
	public static final MCMeta set_itm_grp_no_META = createCommonMeta($set_itm_grp_no, mcframe.commonMA.meta.MA_META.SET_ITM_GRP_NO);
	public static final MCMeta trd_unit_conv_base_qty_META = createCommonMeta($trd_unit_conv_base_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta trd_unit_conv_qty_META = createCommonMeta($trd_unit_conv_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta base_unit_dec_place_META = createCommonMeta($base_unit_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta base_unit_rnd_typ_META = createCommonMeta($base_unit_rnd_typ, mcframe.commonMA.meta.MA_META.RND_TYP);
	public static final MCMeta base_unit_cd_META = createCommonMeta($base_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta base_unit_qty_META = createCommonMeta($base_unit_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta intr_rmrks_META = createCommonMeta($intr_rmrks, mcframe.commonMS.meta.MS_META.DLV_INST_RCPT_INTR_RMRKS);
	public static final MCMeta ship_pr_upd_cntr_META = createCommonMeta($ship_pr_upd_cntr, mcframe.commonMA.meta.MA_META.UPD_CNT);
	public static final MCMeta slo_upd_cntr_META = createCommonMeta($slo_upd_cntr, mcframe.commonMA.meta.MA_META.UPD_CNT);
	public static final MCMeta err_flg_META = createCommonMeta($err_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta peg_no_META = createCommonMeta($peg_no, mcframe.commonMA.meta.MA_META.INT);

	protected static final ConstMetaList<DlvInstRecvIf_Chk01_DtlR> constMetas = new ConstMetaList<DlvInstRecvIf_Chk01_DtlR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			dlvInst_META,
			slo_d_no_META,
			ship_pr_no_META,
			trd_ptn_typ_META,
			slo_no_META,
			slo_dt_META,
			sls_dpt_cd_META,
			sls_usr_cd_META,
			cst_iv_flg_META,
			proc_typ_META,
			dpt_wg_cd_META,
			dlv_inst_rcpt_no_META,
			dlv_inst_rcpt_rev_META,
			dlv_sundry_flg_META,
			slo_via_dlv_typ_META,
			mst_dlv_nm_META,
			mst_dlv_cntct_dpt_META,
			mst_dlv_cntct_psn_META,
			mst_dlv_zip_cd_META,
			mst_dlv_addr1_META,
			mst_dlv_addr2_META,
			mst_dlv_addr3_META,
			mst_dlv_addr4_META,
			mst_dlv_tel_META,
			mst_dlv_fax_META,
			dlv_lg_grp_cd_META,
			pri_prnt_flg_META,
			tdlv_sundry_flg_META,
			mst_tdlv_nm_META,
			via_dlv_typ_META,
			mst_tdlv_cntct_dpt_META,
			mst_tdlv_cntct_psn_META,
			mst_tdlv_zip_cd_META,
			mst_tdlv_addr1_META,
			mst_tdlv_addr2_META,
			mst_tdlv_addr3_META,
			mst_tdlv_addr4_META,
			mst_tdlv_tel_META,
			mst_tdlv_fax_META,
			tdlv_lg_grp_cd_META,
			dscnt_itm_flg_META,
			assort_typ_META,
			set_itm_grp_no_META,
			trd_unit_conv_base_qty_META,
			trd_unit_conv_qty_META,
			base_unit_dec_place_META,
			base_unit_rnd_typ_META,
			base_unit_cd_META,
			base_unit_qty_META,
			intr_rmrks_META,
			ship_pr_upd_cntr_META,
			slo_upd_cntr_META,
			err_flg_META,
			peg_no_META
		},
		new String[][]{
			{
				"data_lno",
				"data_no",
				"data_crud_typ",
				"ext_sys_cd",
				"exe_sts_typ",
				"ext_data_no",
				"ext_data_lno",
				"data_make_dt",
				"imp_flg",
				"recv_dt",
				"cst_dlv_inst_no",
				"cst_dlv_inst_rev",
				"cst_dlv_inst_d_no",
				"cst_po_no",
				"cst_po_rev",
				"cst_po_d_no",
				"cst_cd",
				"dlv_inst_dt",
				"dlv_cd",
				"dlv_nm",
				"dlv_cntct_dpt",
				"dlv_cntct_psn",
				"dlv_zip_cd",
				"dlv_addr1",
				"dlv_addr2",
				"dlv_addr3",
				"dlv_addr4",
				"dlv_tel",
				"dlv_fax",
				"dlv_cntry_cd",
				"tdlv_cd",
				"tdlv_nm",
				"tdlv_cntct_dpt",
				"tdlv_cntct_psn",
				"tdlv_zip_cd",
				"tdlv_addr1",
				"tdlv_addr2",
				"tdlv_addr3",
				"tdlv_addr4",
				"tdlv_tel",
				"tdlv_fax",
				"tdlv_cntry_cd",
				"dlv_day_week_typ",
				"pri_prnt_typ",
				"cst_itm_cd",
				"cst_itm_nm",
				"itm_cd",
				"itm_sub1",
				"itm_sub2",
				"itm_sub3",
				"itm_nm",
				"trd_unit_cd",
				"trd_unit_qty",
				"dlv_rqst_tm",
				"cst_dlv_inst_rmrks",
				"cst_dlv_inst_d_rmrks",
				"sub_char1",
				"sub_char2",
				"sub_char3",
				"sub_char4",
				"sub_char5",
				"sub_char6",
				"sub_char7",
				"sub_char8",
				"sub_char9",
				"sub_char10",
				"sub_char11",
				"sub_char12",
				"sub_char13",
				"sub_char14",
				"sub_char15",
				"sub_char16",
				"sub_char17",
				"sub_char18",
				"sub_char19",
				"sub_char20",
				"sub_char21",
				"sub_char22",
				"sub_char23",
				"sub_char24",
				"sub_char25",
				"sub_char26",
				"sub_char27",
				"sub_char28",
				"sub_char29",
				"sub_char30",
				"sub_num1",
				"sub_num2",
				"sub_num3",
				"sub_num4",
				"sub_num5",
				"sub_dt1",
				"sub_dt2",
				"sub_dt3",
				"sub_dt4",
				"sub_dt5",
				"log_sub_key1",
				"log_sub_key2"
			},
			{
				$data_lno,
				$data_no,
				$data_crud_typ,
				$ext_sys_cd,
				$exe_sts_typ,
				$ext_data_no,
				$ext_data_lno,
				$data_make_dt,
				$imp_flg,
				$recv_dt,
				$cst_dlv_inst_no,
				$cst_dlv_inst_rev,
				$cst_dlv_inst_d_no,
				$cst_po_no,
				$cst_po_rev,
				$cst_po_d_no,
				$cst_cd,
				$dlv_inst_dt,
				$dlv_cd,
				$dlv_nm,
				$dlv_cntct_dpt,
				$dlv_cntct_psn,
				$dlv_zip_cd,
				$dlv_addr1,
				$dlv_addr2,
				$dlv_addr3,
				$dlv_addr4,
				$dlv_tel,
				$dlv_fax,
				$dlv_cntry_cd,
				$tdlv_cd,
				$tdlv_nm,
				$tdlv_cntct_dpt,
				$tdlv_cntct_psn,
				$tdlv_zip_cd,
				$tdlv_addr1,
				$tdlv_addr2,
				$tdlv_addr3,
				$tdlv_addr4,
				$tdlv_tel,
				$tdlv_fax,
				$tdlv_cntry_cd,
				$dlv_day_week_typ,
				$pri_prnt_typ,
				$cst_itm_cd,
				$cst_itm_nm,
				$itm_cd,
				$itm_sub1,
				$itm_sub2,
				$itm_sub3,
				$itm_nm,
				$trd_unit_cd,
				$trd_unit_qty,
				$dlv_rqst_tm,
				$cst_dlv_inst_rmrks,
				$cst_dlv_inst_d_rmrks,
				$sub_char1,
				$sub_char2,
				$sub_char3,
				$sub_char4,
				$sub_char5,
				$sub_char6,
				$sub_char7,
				$sub_char8,
				$sub_char9,
				$sub_char10,
				$sub_char11,
				$sub_char12,
				$sub_char13,
				$sub_char14,
				$sub_char15,
				$sub_char16,
				$sub_char17,
				$sub_char18,
				$sub_char19,
				$sub_char20,
				$sub_char21,
				$sub_char22,
				$sub_char23,
				$sub_char24,
				$sub_char25,
				$sub_char26,
				$sub_char27,
				$sub_char28,
				$sub_char29,
				$sub_char30,
				$sub_num1,
				$sub_num2,
				$sub_num3,
				$sub_num4,
				$sub_num5,
				$sub_dt1,
				$sub_dt2,
				$sub_dt3,
				$sub_dt4,
				$sub_dt5,
				$log_sub_key1,
				$log_sub_key2
			}
		}
	);

	/** 項目属性情報のグループ[REQ_UPD_CNT_CHK]のキー定数 */
	public static final String $$REQ_UPD_CNT_CHK = "REQ_UPD_CNT_CHK";
	/** 項目属性情報のグループ[REQUIRED]のキー定数 */
	public static final String $$REQUIRED = "REQUIRED";
	/** 項目属性情報のグループ[CHK_NUM]のキー定数 */
	public static final String $$CHK_NUM = "CHK_NUM";
	/** 項目属性情報のグループ[SMALL_LARGE]のキー定数 */
	public static final String $$SMALL_LARGE = "SMALL_LARGE";
	/** 項目属性情報のグループ[CHK_DT]のキー定数 */
	public static final String $$CHK_DT = "CHK_DT";
	/** 項目属性情報のグループ[BEFORE_AFTER]のキー定数 */
	public static final String $$BEFORE_AFTER = "BEFORE_AFTER";
	/** 項目属性情報のグループ[CHK_PTN]のキー定数 */
	public static final String $$CHK_PTN = "CHK_PTN";
	/** 項目属性情報のグループ[DUPLICATE]のキー定数 */
	public static final String $$DUPLICATE = "DUPLICATE";
	/** 項目属性情報のグループ[TOO_MANY_INPUTS]のキー定数 */
	public static final String $$TOO_MANY_INPUTS = "TOO_MANY_INPUTS";
	/** 項目属性情報のグループ[AT_LEAST_ONE]のキー定数 */
	public static final String $$AT_LEAST_ONE = "AT_LEAST_ONE";
	/** 項目属性情報のグループ[ONLY_ONE_INPUT]のキー定数 */
	public static final String $$ONLY_ONE_INPUT = "ONLY_ONE_INPUT";
	/** 項目属性情報のグループ[LIST_LOGIC]のキー定数 */
	public static final String $$LIST_LOGIC = "LIST_LOGIC";
	/** 項目属性情報のグループ[LIST_OUT]のキー定数 */
	public static final String $$LIST_OUT = "LIST_OUT";
	/** 項目属性情報のグループ[LIST_OUT_BASE]のキー定数 */
	public static final String $$LIST_OUT_BASE = "LIST_OUT_BASE";
	/** 項目属性情報のグループ[LIST_IN]のキー定数 */
	public static final String $$LIST_IN = "LIST_IN";
	/** 項目属性情報のグループ[LIST_IN_BASE]のキー定数 */
	public static final String $$LIST_IN_BASE = "LIST_IN_BASE";
	/** 項目属性情報のグループ[CONST]のキー定数 */
	public static final String $$CONST = "CONST";
	/** 項目属性情報のグループ[NULL_VAL]のキー定数 */
	public static final String $$NULL_VAL = "NULL_VAL";

	/**
	 * グループ毎に定義される項目属性情報です。
	 */
	protected static final MCExtMap EXTMAP = new MCExtMap(
		null,
		new MCExtMap.Entry($$REQ_UPD_CNT_CHK, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$REQUIRED, new MCExtList(
			new String[][]{
				{$dlvInst + ".cst_po_no", "E"},	// dlvInst.cst_po_no
				{$dlvInst + ".cst_cd", "E"}	// dlvInst.cst_cd
			}
		)),
		new MCExtMap.Entry($$CHK_NUM, new MCExtList(
			new String[][]{
				{$dlvInst + ".trd_unit_qty", "positive"}	// dlvInst.trd_unit_qty
			}
		)),
		new MCExtMap.Entry($$SMALL_LARGE, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$CHK_DT, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$BEFORE_AFTER, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$CHK_PTN, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$DUPLICATE, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$TOO_MANY_INPUTS, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$AT_LEAST_ONE, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$ONLY_ONE_INPUT, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$LIST_LOGIC, new MCExtList(
			new String[][]{
				{$dlvInst + ".cst_cd", "MA.MAUAL0010.Bp"},	// dlvInst.cst_cd
				{$dlvInst + ".dlv_cd", "MA.MAUAL0010.Bp"},	// dlvInst.dlv_cd
				{$dlvInst + ".tdlv_cd", "MA.MAUAL0010.Bp"},	// dlvInst.tdlv_cd
				{$dlvInst + ".itm_sub3", "MA.MAUAL0010.ItmSub3"},	// dlvInst.itm_sub3
				{$dlvInst + ".trd_unit_cd", "MA.MAUAL0010.ItmUnit"}	// dlvInst.trd_unit_cd
			}
		)),
		new MCExtMap.Entry($$LIST_OUT, new MCExtList(
			new String[][]{
				{$dlvInst + ".cst_cd", "cst_iv_flg"},	// dlvInst.cst_cd
				{$dlvInst + ".dlv_cd", "mst_dlv_nm;dlv_sundry_flg;pri_prnt_flg;mst_dlv_zip_cd;mst_dlv_addr1;mst_dlv_addr2;mst_dlv_addr3;mst_dlv_addr4;mst_dlv_cntry_cd;mst_dlv_tel;mst_dlv_fax;mst_dlv_cntct_dpt;mst_dlv_cntct_psn;dlv_lg_grp_cd"},	// dlvInst.dlv_cd
				{$dlvInst + ".tdlv_cd", "mst_tdlv_nm;tdlv_sundry_flg;tdlv_lg_grp_cd;mst_tdlv_zip_cd;mst_tdlv_addr1;mst_tdlv_addr2;mst_tdlv_addr3;mst_tdlv_addr4;mst_tdlv_tel;mst_tdlv_fax;mst_tdlv_cntct_dpt;mst_tdlv_cntct_psn;via_dlv_typ"},	// dlvInst.tdlv_cd
				{$dlvInst + ".itm_sub3", "sundry_itm_flg;dscnt_itm_flg;base_unit_cd;base_unit_dec_place;base_unit_rnd_typ"},	// dlvInst.itm_sub3
				{$dlvInst + ".trd_unit_cd", "trd_unit_conv_base_qty;trd_unit_conv_qty"}	// dlvInst.trd_unit_cd
			}
		)),
		new MCExtMap.Entry($$LIST_OUT_BASE, new MCExtList(
			new String[][]{
				{$dlvInst + ".cst_cd", "cst_iv_flg"},	// dlvInst.cst_cd
				{$dlvInst + ".dlv_cd", "bp_nm;dlv_sundry_flg;pri_prnt_flg;zip_cd;addr1;addr2;addr3;addr4;cntry_cd;tel;fax;dlv_cntct_dpt;dlv_cntct_psn;lg_grp_cd"},	// dlvInst.dlv_cd
				{$dlvInst + ".tdlv_cd", "bp_nm;dlv_sundry_flg;lg_grp_cd;zip_cd;addr1;addr2;addr3;addr4;tel;fax;dlv_cntct_dpt;dlv_cntct_psn;via_dlv_typ"},	// dlvInst.tdlv_cd
				{$dlvInst + ".itm_sub3", "sundry_itm_flg;dscnt_itm_flg;unit_cd;dec_place;rnd_typ"},	// dlvInst.itm_sub3
				{$dlvInst + ".trd_unit_cd", "conv_base_qty;conv_qty"}	// dlvInst.trd_unit_cd
			}
		)),
		new MCExtMap.Entry($$LIST_IN, new MCExtList(
			new String[][]{
				{$dlvInst + ".cst_cd", "MAC_BP_IS_SRCH_TYP.CST_NOT_SUNDRY;slo_dt"},	// dlvInst.cst_cd
				{$dlvInst + ".dlv_cd", "MAC_BP_IS_SRCH_TYP.DLV;slo_dt"},	// dlvInst.dlv_cd
				{$dlvInst + ".tdlv_cd", "MAC_BP_IS_SRCH_TYP.TDLV;slo_dt"},	// dlvInst.tdlv_cd
				{$dlvInst + ".itm_sub3", "MAC_ITM_IS_SRCH_TYP.COMM;itm_cd;itm_sub1;itm_sub2"},	// dlvInst.itm_sub3
				{$dlvInst + ".trd_unit_cd", "itm_cd;itm_sub1;itm_sub2;itm_sub3"}	// dlvInst.trd_unit_cd
			}
		)),
		new MCExtMap.Entry($$LIST_IN_BASE, new MCExtList(
			new String[][]{
				{$dlvInst + ".cst_cd", "bp_is_srch_typ;dt"},	// dlvInst.cst_cd
				{$dlvInst + ".dlv_cd", "bp_is_srch_typ;dt"},	// dlvInst.dlv_cd
				{$dlvInst + ".tdlv_cd", "bp_is_srch_typ;dt"},	// dlvInst.tdlv_cd
				{$dlvInst + ".itm_sub3", "itm_is_srch_typ;itm_cd;itm_sub1;itm_sub2"}	// dlvInst.itm_sub3
			}
		)),
		new MCExtMap.Entry($$CONST, new MCExtList(
			new String[][]{
				{$dlvInst + ".data_crud_typ", "MAC_DATA_CRUD_TYP"},	// dlvInst.data_crud_typ
				{$dlvInst + ".dlv_day_week_typ", "MAC_DAY_WEEK_TYP"}	// dlvInst.dlv_day_week_typ
			}
		)),
		new MCExtMap.Entry($$NULL_VAL, new MCExtList(
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
	protected DlvInstRecvIf_Chk01_DtlR_MC_A(ConstMetaList<? extends DlvInstRecvIf_Chk01_DtlR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public DlvInstRecvIf_Chk01_DtlR clone() {
		return (DlvInstRecvIf_Chk01_DtlR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public DlvInstRecvIf_Chk01_DtlR createInstance() {
		return (DlvInstRecvIf_Chk01_DtlR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public DlvInstRecvIf_Chk01_DtlR getValues(String... names) {
		return (DlvInstRecvIf_Chk01_DtlR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	public mcframe.serverMS.dbc.MST_DLV_INST_RECV_IF_R dlvInst(){
		return (mcframe.serverMS.dbc.MST_DLV_INST_RECV_IF_R) getConstInnerRow(offset + 0, $dlvInst);
	}
	
	public void dlvInst(mcframe.serverMS.dbc.MST_DLV_INST_RECV_IF_R row){
		setConstInnerRow(offset + 0, $dlvInst, row);
	}


	/**
	 * Sales order details No. 受注明細ＮＯ.<p>
	 *
	 */
	public String slo_d_no() {
		return getConstString(offset + 1, $slo_d_no);
	}

	/**
	 * Sales order details No. 受注明細ＮＯ.<p>
	 *
	 */
	public void slo_d_no(String value) {
		setConstString(offset + 1, $slo_d_no, value);
	}


	/**
	 * Shipping progress No. 出荷進捗ＮＯ.<p>
	 *
	 */
	public String ship_pr_no() {
		return getConstString(offset + 2, $ship_pr_no);
	}

	/**
	 * Shipping progress No. 出荷進捗ＮＯ.<p>
	 *
	 */
	public void ship_pr_no(String value) {
		setConstString(offset + 2, $ship_pr_no, value);
	}


	/**
	 * Transaction pattern type 取引パタン区分.<p>
	 *
	 */
	public String trd_ptn_typ() {
		return getConstString(offset + 3, $trd_ptn_typ);
	}

	/**
	 * Transaction pattern type 取引パタン区分.<p>
	 *
	 */
	public void trd_ptn_typ(String value) {
		setConstString(offset + 3, $trd_ptn_typ, value);
	}


	/**
	 * Sales order No. 受注ＮＯ.<p>
	 *
	 */
	public String slo_no() {
		return getConstString(offset + 4, $slo_no);
	}

	/**
	 * Sales order No. 受注ＮＯ.<p>
	 *
	 */
	public void slo_no(String value) {
		setConstString(offset + 4, $slo_no, value);
	}


	/**
	 * Sales order date 受注日.<p>
	 *
	 */
	public MCDate slo_dt() {
		return getConstDate(offset + 5, $slo_dt);
	}

	/**
	 * Sales order date 受注日.<p>
	 *
	 */
	public void slo_dt(MCDate value) {
		setConstDate(offset + 5, $slo_dt, value);
	}


	/**
	 * Sales dept. cd. 売上部門ＣＤ.<p>
	 *
	 */
	public String sls_dpt_cd() {
		return getConstString(offset + 6, $sls_dpt_cd);
	}

	/**
	 * Sales dept. cd. 売上部門ＣＤ.<p>
	 *
	 */
	public void sls_dpt_cd(String value) {
		setConstString(offset + 6, $sls_dpt_cd, value);
	}


	/**
	 * Sales PIC cd. 売上担当者ＣＤ.<p>
	 *
	 */
	public String sls_usr_cd() {
		return getConstString(offset + 7, $sls_usr_cd);
	}

	/**
	 * Sales PIC cd. 売上担当者ＣＤ.<p>
	 *
	 */
	public void sls_usr_cd(String value) {
		setConstString(offset + 7, $sls_usr_cd, value);
	}


	/**
	 * Invoice transaction (Master) インボイス取引（マスタ）.<p>
	 *
	 */
	public boolean cst_iv_flg() {
		return getConstBoolean(offset + 8, $cst_iv_flg);
	}

	/**
	 * Invoice transaction (Master) インボイス取引（マスタ）.<p>
	 *
	 */
	public void cst_iv_flg(boolean value) {
		setConstBoolean(offset + 8, $cst_iv_flg, value);
	}


	/**
	 * Procurement type 手配区分.<p>
	 *
	 */
	public String proc_typ() {
		return getConstString(offset + 9, $proc_typ);
	}

	/**
	 * Procurement type 手配区分.<p>
	 *
	 */
	public void proc_typ(String value) {
		setConstString(offset + 9, $proc_typ, value);
	}


	/**
	 * WG cd. (Sales dept.) ワーキンググループＣＤ（売上部門）.<p>
	 *
	 */
	public String dpt_wg_cd() {
		return getConstString(offset + 10, $dpt_wg_cd);
	}

	/**
	 * WG cd. (Sales dept.) ワーキンググループＣＤ（売上部門）.<p>
	 *
	 */
	public void dpt_wg_cd(String value) {
		setConstString(offset + 10, $dpt_wg_cd, value);
	}


	/**
	 * Delivery order received No. 納入指示受領ＮＯ.<p>
	 *
	 */
	public String dlv_inst_rcpt_no() {
		return getConstString(offset + 11, $dlv_inst_rcpt_no);
	}

	/**
	 * Delivery order received No. 納入指示受領ＮＯ.<p>
	 *
	 */
	public void dlv_inst_rcpt_no(String value) {
		setConstString(offset + 11, $dlv_inst_rcpt_no, value);
	}


	/**
	 * Delivery order rev. number 納入指示改訂番号.<p>
	 *
	 */
	public MCNumber dlv_inst_rcpt_rev() {
		return getConstNumber(offset + 12, $dlv_inst_rcpt_rev);
	}

	/**
	 * Delivery order rev. number 納入指示改訂番号.<p>
	 *
	 */
	public void dlv_inst_rcpt_rev(MCNumber value) {
		setConstNumber(offset + 12, $dlv_inst_rcpt_rev, value);
	}

	/**
	 * Delivery order rev. number 納入指示改訂番号.<p>
	 *
	 */
	public void dlv_inst_rcpt_rev(int value) {
		setConstNumber(offset + 12, $dlv_inst_rcpt_rev, value);
	}

	/**
	 * Delivery order rev. number 納入指示改訂番号.<p>
	 *
	 */
	public void dlv_inst_rcpt_rev(long value) {
		setConstNumber(offset + 12, $dlv_inst_rcpt_rev, value);
	}

	/**
	 * Delivery order rev. number 納入指示改訂番号.<p>
	 *
	 */
	public void dlv_inst_rcpt_rev(float value) {
		setConstNumber(offset + 12, $dlv_inst_rcpt_rev, value);
	}

	/**
	 * Delivery order rev. number 納入指示改訂番号.<p>
	 *
	 */
	public void dlv_inst_rcpt_rev(double value) {
		setConstNumber(offset + 12, $dlv_inst_rcpt_rev, value);
	}


	/**
	 * Miscellaneous delivery destination (Master) 納品先諸口（マスタ）.<p>
	 *
	 */
	public boolean dlv_sundry_flg() {
		return getConstBoolean(offset + 13, $dlv_sundry_flg);
	}

	/**
	 * Miscellaneous delivery destination (Master) 納品先諸口（マスタ）.<p>
	 *
	 */
	public void dlv_sundry_flg(boolean value) {
		setConstBoolean(offset + 13, $dlv_sundry_flg, value);
	}


	/**
	 * Receiving point stopover type (Sales order details) 配送先経由区分（受注明細）.<p>
	 *
	 */
	public String slo_via_dlv_typ() {
		return getConstString(offset + 14, $slo_via_dlv_typ);
	}

	/**
	 * Receiving point stopover type (Sales order details) 配送先経由区分（受注明細）.<p>
	 *
	 */
	public void slo_via_dlv_typ(String value) {
		setConstString(offset + 14, $slo_via_dlv_typ, value);
	}


	/**
	 * Delivery destination name (Master) 納品先名（マスタ）.<p>
	 *
	 */
	public String mst_dlv_nm() {
		return getConstString(offset + 15, $mst_dlv_nm);
	}

	/**
	 * Delivery destination name (Master) 納品先名（マスタ）.<p>
	 *
	 */
	public void mst_dlv_nm(String value) {
		setConstString(offset + 15, $mst_dlv_nm, value);
	}


	/**
	 * Delivery destination dept. (Master) 納品先部署（マスタ）.<p>
	 *
	 */
	public String mst_dlv_cntct_dpt() {
		return getConstString(offset + 16, $mst_dlv_cntct_dpt);
	}

	/**
	 * Delivery destination dept. (Master) 納品先部署（マスタ）.<p>
	 *
	 */
	public void mst_dlv_cntct_dpt(String value) {
		setConstString(offset + 16, $mst_dlv_cntct_dpt, value);
	}


	/**
	 * Delivery destination PIC (Master) 納品先担当者（マスタ）.<p>
	 *
	 */
	public String mst_dlv_cntct_psn() {
		return getConstString(offset + 17, $mst_dlv_cntct_psn);
	}

	/**
	 * Delivery destination PIC (Master) 納品先担当者（マスタ）.<p>
	 *
	 */
	public void mst_dlv_cntct_psn(String value) {
		setConstString(offset + 17, $mst_dlv_cntct_psn, value);
	}


	/**
	 * Delivery destination postal code (Master) 納品先郵便番号（マスタ）.<p>
	 *
	 */
	public String mst_dlv_zip_cd() {
		return getConstString(offset + 18, $mst_dlv_zip_cd);
	}

	/**
	 * Delivery destination postal code (Master) 納品先郵便番号（マスタ）.<p>
	 *
	 */
	public void mst_dlv_zip_cd(String value) {
		setConstString(offset + 18, $mst_dlv_zip_cd, value);
	}


	/**
	 * Delivery destination address 1 (Master) 納品先住所１（マスタ）.<p>
	 *
	 */
	public String mst_dlv_addr1() {
		return getConstString(offset + 19, $mst_dlv_addr1);
	}

	/**
	 * Delivery destination address 1 (Master) 納品先住所１（マスタ）.<p>
	 *
	 */
	public void mst_dlv_addr1(String value) {
		setConstString(offset + 19, $mst_dlv_addr1, value);
	}


	/**
	 * Delivery address 2 (Master) 納品先住所２（マスタ）.<p>
	 *
	 */
	public String mst_dlv_addr2() {
		return getConstString(offset + 20, $mst_dlv_addr2);
	}

	/**
	 * Delivery address 2 (Master) 納品先住所２（マスタ）.<p>
	 *
	 */
	public void mst_dlv_addr2(String value) {
		setConstString(offset + 20, $mst_dlv_addr2, value);
	}


	/**
	 * Delivery address 3 (Master) 納品先住所３（マスタ）.<p>
	 *
	 */
	public String mst_dlv_addr3() {
		return getConstString(offset + 21, $mst_dlv_addr3);
	}

	/**
	 * Delivery address 3 (Master) 納品先住所３（マスタ）.<p>
	 *
	 */
	public void mst_dlv_addr3(String value) {
		setConstString(offset + 21, $mst_dlv_addr3, value);
	}


	/**
	 * Delivery address 4 (Master) 納品先住所４（マスタ）.<p>
	 *
	 */
	public String mst_dlv_addr4() {
		return getConstString(offset + 22, $mst_dlv_addr4);
	}

	/**
	 * Delivery address 4 (Master) 納品先住所４（マスタ）.<p>
	 *
	 */
	public void mst_dlv_addr4(String value) {
		setConstString(offset + 22, $mst_dlv_addr4, value);
	}


	/**
	 * Delivery destination TEL (Master) 納品先ＴＥＬ（マスタ）.<p>
	 *
	 */
	public String mst_dlv_tel() {
		return getConstString(offset + 23, $mst_dlv_tel);
	}

	/**
	 * Delivery destination TEL (Master) 納品先ＴＥＬ（マスタ）.<p>
	 *
	 */
	public void mst_dlv_tel(String value) {
		setConstString(offset + 23, $mst_dlv_tel, value);
	}


	/**
	 * Delivery destination FAX (Master) 納品先ＦＡＸ（マスタ）.<p>
	 *
	 */
	public String mst_dlv_fax() {
		return getConstString(offset + 24, $mst_dlv_fax);
	}

	/**
	 * Delivery destination FAX (Master) 納品先ＦＡＸ（マスタ）.<p>
	 *
	 */
	public void mst_dlv_fax(String value) {
		setConstString(offset + 24, $mst_dlv_fax, value);
	}


	/**
	 * Delivery destination distribution group cd. (Master) 納品先物流グループＣＤ（マスタ）.<p>
	 *
	 */
	public String dlv_lg_grp_cd() {
		return getConstString(offset + 25, $dlv_lg_grp_cd);
	}

	/**
	 * Delivery destination distribution group cd. (Master) 納品先物流グループＣＤ（マスタ）.<p>
	 *
	 */
	public void dlv_lg_grp_cd(String value) {
		setConstString(offset + 25, $dlv_lg_grp_cd, value);
	}


	/**
	 * Print price 価格印字.<p>
	 *
	 */
	public boolean pri_prnt_flg() {
		return getConstBoolean(offset + 26, $pri_prnt_flg);
	}

	/**
	 * Print price 価格印字.<p>
	 *
	 */
	public void pri_prnt_flg(boolean value) {
		setConstBoolean(offset + 26, $pri_prnt_flg, value);
	}


	/**
	 * Miscellaneous receiving point (master) 配送先諸口（マスタ）.<p>
	 *
	 */
	public boolean tdlv_sundry_flg() {
		return getConstBoolean(offset + 27, $tdlv_sundry_flg);
	}

	/**
	 * Miscellaneous receiving point (master) 配送先諸口（マスタ）.<p>
	 *
	 */
	public void tdlv_sundry_flg(boolean value) {
		setConstBoolean(offset + 27, $tdlv_sundry_flg, value);
	}


	/**
	 * Delivery name (master) 配送先名（マスタ）.<p>
	 *
	 */
	public String mst_tdlv_nm() {
		return getConstString(offset + 28, $mst_tdlv_nm);
	}

	/**
	 * Delivery name (master) 配送先名（マスタ）.<p>
	 *
	 */
	public void mst_tdlv_nm(String value) {
		setConstString(offset + 28, $mst_tdlv_nm, value);
	}


	/**
	 * Destination via classification (master) 配送先経由区分（マスタ）.<p>
	 *
	 */
	public String via_dlv_typ() {
		return getConstString(offset + 29, $via_dlv_typ);
	}

	/**
	 * Destination via classification (master) 配送先経由区分（マスタ）.<p>
	 *
	 */
	public void via_dlv_typ(String value) {
		setConstString(offset + 29, $via_dlv_typ, value);
	}


	/**
	 * Destination dept. (master) 配送先部署（マスタ）.<p>
	 *
	 */
	public String mst_tdlv_cntct_dpt() {
		return getConstString(offset + 30, $mst_tdlv_cntct_dpt);
	}

	/**
	 * Destination dept. (master) 配送先部署（マスタ）.<p>
	 *
	 */
	public void mst_tdlv_cntct_dpt(String value) {
		setConstString(offset + 30, $mst_tdlv_cntct_dpt, value);
	}


	/**
	 * Delivery person in charge (master) 配送先担当者（マスタ）.<p>
	 *
	 */
	public String mst_tdlv_cntct_psn() {
		return getConstString(offset + 31, $mst_tdlv_cntct_psn);
	}

	/**
	 * Delivery person in charge (master) 配送先担当者（マスタ）.<p>
	 *
	 */
	public void mst_tdlv_cntct_psn(String value) {
		setConstString(offset + 31, $mst_tdlv_cntct_psn, value);
	}


	/**
	 * Delivery destination postal code (master) 配送先郵便番号（マスタ）.<p>
	 *
	 */
	public String mst_tdlv_zip_cd() {
		return getConstString(offset + 32, $mst_tdlv_zip_cd);
	}

	/**
	 * Delivery destination postal code (master) 配送先郵便番号（マスタ）.<p>
	 *
	 */
	public void mst_tdlv_zip_cd(String value) {
		setConstString(offset + 32, $mst_tdlv_zip_cd, value);
	}


	/**
	 * Shipping address 1 (master) 配送先住所１（マスタ）.<p>
	 *
	 */
	public String mst_tdlv_addr1() {
		return getConstString(offset + 33, $mst_tdlv_addr1);
	}

	/**
	 * Shipping address 1 (master) 配送先住所１（マスタ）.<p>
	 *
	 */
	public void mst_tdlv_addr1(String value) {
		setConstString(offset + 33, $mst_tdlv_addr1, value);
	}


	/**
	 * Shipping address 2 (master) 配送先住所２（マスタ）.<p>
	 *
	 */
	public String mst_tdlv_addr2() {
		return getConstString(offset + 34, $mst_tdlv_addr2);
	}

	/**
	 * Shipping address 2 (master) 配送先住所２（マスタ）.<p>
	 *
	 */
	public void mst_tdlv_addr2(String value) {
		setConstString(offset + 34, $mst_tdlv_addr2, value);
	}


	/**
	 * Shipping address 3 (master) 配送先住所３（マスタ）.<p>
	 *
	 */
	public String mst_tdlv_addr3() {
		return getConstString(offset + 35, $mst_tdlv_addr3);
	}

	/**
	 * Shipping address 3 (master) 配送先住所３（マスタ）.<p>
	 *
	 */
	public void mst_tdlv_addr3(String value) {
		setConstString(offset + 35, $mst_tdlv_addr3, value);
	}


	/**
	 * Shipping address 4 (master) 配送先住所４（マスタ）.<p>
	 *
	 */
	public String mst_tdlv_addr4() {
		return getConstString(offset + 36, $mst_tdlv_addr4);
	}

	/**
	 * Shipping address 4 (master) 配送先住所４（マスタ）.<p>
	 *
	 */
	public void mst_tdlv_addr4(String value) {
		setConstString(offset + 36, $mst_tdlv_addr4, value);
	}


	/**
	 * Delivery destination TEL (master) 配送先ＴＥＬ（マスタ）.<p>
	 *
	 */
	public String mst_tdlv_tel() {
		return getConstString(offset + 37, $mst_tdlv_tel);
	}

	/**
	 * Delivery destination TEL (master) 配送先ＴＥＬ（マスタ）.<p>
	 *
	 */
	public void mst_tdlv_tel(String value) {
		setConstString(offset + 37, $mst_tdlv_tel, value);
	}


	/**
	 * Delivery destination fax (master) 配送先ＦＡＸ（マスタ）.<p>
	 *
	 */
	public String mst_tdlv_fax() {
		return getConstString(offset + 38, $mst_tdlv_fax);
	}

	/**
	 * Delivery destination fax (master) 配送先ＦＡＸ（マスタ）.<p>
	 *
	 */
	public void mst_tdlv_fax(String value) {
		setConstString(offset + 38, $mst_tdlv_fax, value);
	}


	/**
	 * Delivery destination distribution group cd. (master) 配送先物流グループＣＤ（マスタ）.<p>
	 *
	 */
	public String tdlv_lg_grp_cd() {
		return getConstString(offset + 39, $tdlv_lg_grp_cd);
	}

	/**
	 * Delivery destination distribution group cd. (master) 配送先物流グループＣＤ（マスタ）.<p>
	 *
	 */
	public void tdlv_lg_grp_cd(String value) {
		setConstString(offset + 39, $tdlv_lg_grp_cd, value);
	}


	/**
	 * Discount item (Master) 値引品目（マスタ）.<p>
	 *
	 */
	public boolean dscnt_itm_flg() {
		return getConstBoolean(offset + 40, $dscnt_itm_flg);
	}

	/**
	 * Discount item (Master) 値引品目（マスタ）.<p>
	 *
	 */
	public void dscnt_itm_flg(boolean value) {
		setConstBoolean(offset + 40, $dscnt_itm_flg, value);
	}


	/**
	 * Assortment type 品揃区分.<p>
	 *
	 */
	public String assort_typ() {
		return getConstString(offset + 41, $assort_typ);
	}

	/**
	 * Assortment type 品揃区分.<p>
	 *
	 */
	public void assort_typ(String value) {
		setConstString(offset + 41, $assort_typ, value);
	}


	/**
	 * Assortment group No. 品揃グループＮＯ.<p>
	 *
	 */
	public MCNumber set_itm_grp_no() {
		return getConstNumber(offset + 42, $set_itm_grp_no);
	}

	/**
	 * Assortment group No. 品揃グループＮＯ.<p>
	 *
	 */
	public void set_itm_grp_no(MCNumber value) {
		setConstNumber(offset + 42, $set_itm_grp_no, value);
	}

	/**
	 * Assortment group No. 品揃グループＮＯ.<p>
	 *
	 */
	public void set_itm_grp_no(int value) {
		setConstNumber(offset + 42, $set_itm_grp_no, value);
	}

	/**
	 * Assortment group No. 品揃グループＮＯ.<p>
	 *
	 */
	public void set_itm_grp_no(long value) {
		setConstNumber(offset + 42, $set_itm_grp_no, value);
	}

	/**
	 * Assortment group No. 品揃グループＮＯ.<p>
	 *
	 */
	public void set_itm_grp_no(float value) {
		setConstNumber(offset + 42, $set_itm_grp_no, value);
	}

	/**
	 * Assortment group No. 品揃グループＮＯ.<p>
	 *
	 */
	public void set_itm_grp_no(double value) {
		setConstNumber(offset + 42, $set_itm_grp_no, value);
	}


	/**
	 * Transaction unit conversion base qty. 取引単位分母数量.<p>
	 *
	 */
	public MCNumber trd_unit_conv_base_qty() {
		return getConstNumber(offset + 43, $trd_unit_conv_base_qty);
	}

	/**
	 * Transaction unit conversion base qty. 取引単位分母数量.<p>
	 *
	 */
	public void trd_unit_conv_base_qty(MCNumber value) {
		setConstNumber(offset + 43, $trd_unit_conv_base_qty, value);
	}

	/**
	 * Transaction unit conversion base qty. 取引単位分母数量.<p>
	 *
	 */
	public void trd_unit_conv_base_qty(int value) {
		setConstNumber(offset + 43, $trd_unit_conv_base_qty, value);
	}

	/**
	 * Transaction unit conversion base qty. 取引単位分母数量.<p>
	 *
	 */
	public void trd_unit_conv_base_qty(long value) {
		setConstNumber(offset + 43, $trd_unit_conv_base_qty, value);
	}

	/**
	 * Transaction unit conversion base qty. 取引単位分母数量.<p>
	 *
	 */
	public void trd_unit_conv_base_qty(float value) {
		setConstNumber(offset + 43, $trd_unit_conv_base_qty, value);
	}

	/**
	 * Transaction unit conversion base qty. 取引単位分母数量.<p>
	 *
	 */
	public void trd_unit_conv_base_qty(double value) {
		setConstNumber(offset + 43, $trd_unit_conv_base_qty, value);
	}


	/**
	 * Transaction unit conversion qty. 取引単位換算数量.<p>
	 *
	 */
	public MCNumber trd_unit_conv_qty() {
		return getConstNumber(offset + 44, $trd_unit_conv_qty);
	}

	/**
	 * Transaction unit conversion qty. 取引単位換算数量.<p>
	 *
	 */
	public void trd_unit_conv_qty(MCNumber value) {
		setConstNumber(offset + 44, $trd_unit_conv_qty, value);
	}

	/**
	 * Transaction unit conversion qty. 取引単位換算数量.<p>
	 *
	 */
	public void trd_unit_conv_qty(int value) {
		setConstNumber(offset + 44, $trd_unit_conv_qty, value);
	}

	/**
	 * Transaction unit conversion qty. 取引単位換算数量.<p>
	 *
	 */
	public void trd_unit_conv_qty(long value) {
		setConstNumber(offset + 44, $trd_unit_conv_qty, value);
	}

	/**
	 * Transaction unit conversion qty. 取引単位換算数量.<p>
	 *
	 */
	public void trd_unit_conv_qty(float value) {
		setConstNumber(offset + 44, $trd_unit_conv_qty, value);
	}

	/**
	 * Transaction unit conversion qty. 取引単位換算数量.<p>
	 *
	 */
	public void trd_unit_conv_qty(double value) {
		setConstNumber(offset + 44, $trd_unit_conv_qty, value);
	}


	/**
	 * Transaction unit number of decimal places 取引単位小数部有効桁数.<p>
	 *
	 */
	public MCNumber base_unit_dec_place() {
		return getConstNumber(offset + 45, $base_unit_dec_place);
	}

	/**
	 * Transaction unit number of decimal places 取引単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(MCNumber value) {
		setConstNumber(offset + 45, $base_unit_dec_place, value);
	}

	/**
	 * Transaction unit number of decimal places 取引単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(int value) {
		setConstNumber(offset + 45, $base_unit_dec_place, value);
	}

	/**
	 * Transaction unit number of decimal places 取引単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(long value) {
		setConstNumber(offset + 45, $base_unit_dec_place, value);
	}

	/**
	 * Transaction unit number of decimal places 取引単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(float value) {
		setConstNumber(offset + 45, $base_unit_dec_place, value);
	}

	/**
	 * Transaction unit number of decimal places 取引単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(double value) {
		setConstNumber(offset + 45, $base_unit_dec_place, value);
	}


	/**
	 * Transaction unit rounding type 取引単位端数処理区分.<p>
	 *
	 */
	public String base_unit_rnd_typ() {
		return getConstString(offset + 46, $base_unit_rnd_typ);
	}

	/**
	 * Transaction unit rounding type 取引単位端数処理区分.<p>
	 *
	 */
	public void base_unit_rnd_typ(String value) {
		setConstString(offset + 46, $base_unit_rnd_typ, value);
	}


	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public String base_unit_cd() {
		return getConstString(offset + 47, $base_unit_cd);
	}

	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public void base_unit_cd(String value) {
		setConstString(offset + 47, $base_unit_cd, value);
	}


	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public MCNumber base_unit_qty() {
		return getConstNumber(offset + 48, $base_unit_qty);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(MCNumber value) {
		setConstNumber(offset + 48, $base_unit_qty, value);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(int value) {
		setConstNumber(offset + 48, $base_unit_qty, value);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(long value) {
		setConstNumber(offset + 48, $base_unit_qty, value);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(float value) {
		setConstNumber(offset + 48, $base_unit_qty, value);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(double value) {
		setConstNumber(offset + 48, $base_unit_qty, value);
	}


	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public String intr_rmrks() {
		return getConstString(offset + 49, $intr_rmrks);
	}

	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public void intr_rmrks(String value) {
		setConstString(offset + 49, $intr_rmrks, value);
	}


	/**
	 * Shipping progress update counter 出荷進捗更新カウンタ.<p>
	 *
	 */
	public MCNumber ship_pr_upd_cntr() {
		return getConstNumber(offset + 50, $ship_pr_upd_cntr);
	}

	/**
	 * Shipping progress update counter 出荷進捗更新カウンタ.<p>
	 *
	 */
	public void ship_pr_upd_cntr(MCNumber value) {
		setConstNumber(offset + 50, $ship_pr_upd_cntr, value);
	}

	/**
	 * Shipping progress update counter 出荷進捗更新カウンタ.<p>
	 *
	 */
	public void ship_pr_upd_cntr(int value) {
		setConstNumber(offset + 50, $ship_pr_upd_cntr, value);
	}

	/**
	 * Shipping progress update counter 出荷進捗更新カウンタ.<p>
	 *
	 */
	public void ship_pr_upd_cntr(long value) {
		setConstNumber(offset + 50, $ship_pr_upd_cntr, value);
	}

	/**
	 * Shipping progress update counter 出荷進捗更新カウンタ.<p>
	 *
	 */
	public void ship_pr_upd_cntr(float value) {
		setConstNumber(offset + 50, $ship_pr_upd_cntr, value);
	}

	/**
	 * Shipping progress update counter 出荷進捗更新カウンタ.<p>
	 *
	 */
	public void ship_pr_upd_cntr(double value) {
		setConstNumber(offset + 50, $ship_pr_upd_cntr, value);
	}


	/**
	 * Sales order header update counter 受注ヘッダ更新カウンタ.<p>
	 *
	 */
	public MCNumber slo_upd_cntr() {
		return getConstNumber(offset + 51, $slo_upd_cntr);
	}

	/**
	 * Sales order header update counter 受注ヘッダ更新カウンタ.<p>
	 *
	 */
	public void slo_upd_cntr(MCNumber value) {
		setConstNumber(offset + 51, $slo_upd_cntr, value);
	}

	/**
	 * Sales order header update counter 受注ヘッダ更新カウンタ.<p>
	 *
	 */
	public void slo_upd_cntr(int value) {
		setConstNumber(offset + 51, $slo_upd_cntr, value);
	}

	/**
	 * Sales order header update counter 受注ヘッダ更新カウンタ.<p>
	 *
	 */
	public void slo_upd_cntr(long value) {
		setConstNumber(offset + 51, $slo_upd_cntr, value);
	}

	/**
	 * Sales order header update counter 受注ヘッダ更新カウンタ.<p>
	 *
	 */
	public void slo_upd_cntr(float value) {
		setConstNumber(offset + 51, $slo_upd_cntr, value);
	}

	/**
	 * Sales order header update counter 受注ヘッダ更新カウンタ.<p>
	 *
	 */
	public void slo_upd_cntr(double value) {
		setConstNumber(offset + 51, $slo_upd_cntr, value);
	}


	/**
	 * Error エラー.<p>
	 *
	 */
	public boolean err_flg() {
		return getConstBoolean(offset + 52, $err_flg);
	}

	/**
	 * Error エラー.<p>
	 *
	 */
	public void err_flg(boolean value) {
		setConstBoolean(offset + 52, $err_flg, value);
	}


	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public MCNumber peg_no() {
		return getConstNumber(offset + 53, $peg_no);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(MCNumber value) {
		setConstNumber(offset + 53, $peg_no, value);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(int value) {
		setConstNumber(offset + 53, $peg_no, value);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(long value) {
		setConstNumber(offset + 53, $peg_no, value);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(float value) {
		setConstNumber(offset + 53, $peg_no, value);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(double value) {
		setConstNumber(offset + 53, $peg_no, value);
	}


	public String getString(String name) {
		if ($slo_d_no.equalsIgnoreCase(name)) {
			return slo_d_no();
		}
		if ($ship_pr_no.equalsIgnoreCase(name)) {
			return ship_pr_no();
		}
		if ($trd_ptn_typ.equalsIgnoreCase(name)) {
			return trd_ptn_typ();
		}
		if ($slo_no.equalsIgnoreCase(name)) {
			return slo_no();
		}
		if ($sls_dpt_cd.equalsIgnoreCase(name)) {
			return sls_dpt_cd();
		}
		if ($sls_usr_cd.equalsIgnoreCase(name)) {
			return sls_usr_cd();
		}
		if ($proc_typ.equalsIgnoreCase(name)) {
			return proc_typ();
		}
		if ($dpt_wg_cd.equalsIgnoreCase(name)) {
			return dpt_wg_cd();
		}
		if ($dlv_inst_rcpt_no.equalsIgnoreCase(name)) {
			return dlv_inst_rcpt_no();
		}
		if ($slo_via_dlv_typ.equalsIgnoreCase(name)) {
			return slo_via_dlv_typ();
		}
		if ($mst_dlv_nm.equalsIgnoreCase(name)) {
			return mst_dlv_nm();
		}
		if ($mst_dlv_cntct_dpt.equalsIgnoreCase(name)) {
			return mst_dlv_cntct_dpt();
		}
		if ($mst_dlv_cntct_psn.equalsIgnoreCase(name)) {
			return mst_dlv_cntct_psn();
		}
		if ($mst_dlv_zip_cd.equalsIgnoreCase(name)) {
			return mst_dlv_zip_cd();
		}
		if ($mst_dlv_addr1.equalsIgnoreCase(name)) {
			return mst_dlv_addr1();
		}
		if ($mst_dlv_addr2.equalsIgnoreCase(name)) {
			return mst_dlv_addr2();
		}
		if ($mst_dlv_addr3.equalsIgnoreCase(name)) {
			return mst_dlv_addr3();
		}
		if ($mst_dlv_addr4.equalsIgnoreCase(name)) {
			return mst_dlv_addr4();
		}
		if ($mst_dlv_tel.equalsIgnoreCase(name)) {
			return mst_dlv_tel();
		}
		if ($mst_dlv_fax.equalsIgnoreCase(name)) {
			return mst_dlv_fax();
		}
		if ($dlv_lg_grp_cd.equalsIgnoreCase(name)) {
			return dlv_lg_grp_cd();
		}
		if ($mst_tdlv_nm.equalsIgnoreCase(name)) {
			return mst_tdlv_nm();
		}
		if ($via_dlv_typ.equalsIgnoreCase(name)) {
			return via_dlv_typ();
		}
		if ($mst_tdlv_cntct_dpt.equalsIgnoreCase(name)) {
			return mst_tdlv_cntct_dpt();
		}
		if ($mst_tdlv_cntct_psn.equalsIgnoreCase(name)) {
			return mst_tdlv_cntct_psn();
		}
		if ($mst_tdlv_zip_cd.equalsIgnoreCase(name)) {
			return mst_tdlv_zip_cd();
		}
		if ($mst_tdlv_addr1.equalsIgnoreCase(name)) {
			return mst_tdlv_addr1();
		}
		if ($mst_tdlv_addr2.equalsIgnoreCase(name)) {
			return mst_tdlv_addr2();
		}
		if ($mst_tdlv_addr3.equalsIgnoreCase(name)) {
			return mst_tdlv_addr3();
		}
		if ($mst_tdlv_addr4.equalsIgnoreCase(name)) {
			return mst_tdlv_addr4();
		}
		if ($mst_tdlv_tel.equalsIgnoreCase(name)) {
			return mst_tdlv_tel();
		}
		if ($mst_tdlv_fax.equalsIgnoreCase(name)) {
			return mst_tdlv_fax();
		}
		if ($tdlv_lg_grp_cd.equalsIgnoreCase(name)) {
			return tdlv_lg_grp_cd();
		}
		if ($assort_typ.equalsIgnoreCase(name)) {
			return assort_typ();
		}
		if ($base_unit_rnd_typ.equalsIgnoreCase(name)) {
			return base_unit_rnd_typ();
		}
		if ($base_unit_cd.equalsIgnoreCase(name)) {
			return base_unit_cd();
		}
		if ($intr_rmrks.equalsIgnoreCase(name)) {
			return intr_rmrks();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($dlv_inst_rcpt_rev.equalsIgnoreCase(name)) {
			return dlv_inst_rcpt_rev();
		}
		if ($set_itm_grp_no.equalsIgnoreCase(name)) {
			return set_itm_grp_no();
		}
		if ($trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			return trd_unit_conv_base_qty();
		}
		if ($trd_unit_conv_qty.equalsIgnoreCase(name)) {
			return trd_unit_conv_qty();
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			return base_unit_dec_place();
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			return base_unit_qty();
		}
		if ($ship_pr_upd_cntr.equalsIgnoreCase(name)) {
			return ship_pr_upd_cntr();
		}
		if ($slo_upd_cntr.equalsIgnoreCase(name)) {
			return slo_upd_cntr();
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			return peg_no();
		}
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		if ($slo_dt.equalsIgnoreCase(name)) {
			return slo_dt();
		}
		return super.getDate(name);
	}
	public boolean getBoolean(String name) {
		if ($cst_iv_flg.equalsIgnoreCase(name)) {
			return cst_iv_flg();
		}
		if ($dlv_sundry_flg.equalsIgnoreCase(name)) {
			return dlv_sundry_flg();
		}
		if ($pri_prnt_flg.equalsIgnoreCase(name)) {
			return pri_prnt_flg();
		}
		if ($tdlv_sundry_flg.equalsIgnoreCase(name)) {
			return tdlv_sundry_flg();
		}
		if ($dscnt_itm_flg.equalsIgnoreCase(name)) {
			return dscnt_itm_flg();
		}
		if ($err_flg.equalsIgnoreCase(name)) {
			return err_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($slo_d_no.equalsIgnoreCase(name)) {
			return slo_d_no();
		}
		if ($ship_pr_no.equalsIgnoreCase(name)) {
			return ship_pr_no();
		}
		if ($trd_ptn_typ.equalsIgnoreCase(name)) {
			return trd_ptn_typ();
		}
		if ($slo_no.equalsIgnoreCase(name)) {
			return slo_no();
		}
		if ($sls_dpt_cd.equalsIgnoreCase(name)) {
			return sls_dpt_cd();
		}
		if ($sls_usr_cd.equalsIgnoreCase(name)) {
			return sls_usr_cd();
		}
		if ($proc_typ.equalsIgnoreCase(name)) {
			return proc_typ();
		}
		if ($dpt_wg_cd.equalsIgnoreCase(name)) {
			return dpt_wg_cd();
		}
		if ($dlv_inst_rcpt_no.equalsIgnoreCase(name)) {
			return dlv_inst_rcpt_no();
		}
		if ($slo_via_dlv_typ.equalsIgnoreCase(name)) {
			return slo_via_dlv_typ();
		}
		if ($mst_dlv_nm.equalsIgnoreCase(name)) {
			return mst_dlv_nm();
		}
		if ($mst_dlv_cntct_dpt.equalsIgnoreCase(name)) {
			return mst_dlv_cntct_dpt();
		}
		if ($mst_dlv_cntct_psn.equalsIgnoreCase(name)) {
			return mst_dlv_cntct_psn();
		}
		if ($mst_dlv_zip_cd.equalsIgnoreCase(name)) {
			return mst_dlv_zip_cd();
		}
		if ($mst_dlv_addr1.equalsIgnoreCase(name)) {
			return mst_dlv_addr1();
		}
		if ($mst_dlv_addr2.equalsIgnoreCase(name)) {
			return mst_dlv_addr2();
		}
		if ($mst_dlv_addr3.equalsIgnoreCase(name)) {
			return mst_dlv_addr3();
		}
		if ($mst_dlv_addr4.equalsIgnoreCase(name)) {
			return mst_dlv_addr4();
		}
		if ($mst_dlv_tel.equalsIgnoreCase(name)) {
			return mst_dlv_tel();
		}
		if ($mst_dlv_fax.equalsIgnoreCase(name)) {
			return mst_dlv_fax();
		}
		if ($dlv_lg_grp_cd.equalsIgnoreCase(name)) {
			return dlv_lg_grp_cd();
		}
		if ($mst_tdlv_nm.equalsIgnoreCase(name)) {
			return mst_tdlv_nm();
		}
		if ($via_dlv_typ.equalsIgnoreCase(name)) {
			return via_dlv_typ();
		}
		if ($mst_tdlv_cntct_dpt.equalsIgnoreCase(name)) {
			return mst_tdlv_cntct_dpt();
		}
		if ($mst_tdlv_cntct_psn.equalsIgnoreCase(name)) {
			return mst_tdlv_cntct_psn();
		}
		if ($mst_tdlv_zip_cd.equalsIgnoreCase(name)) {
			return mst_tdlv_zip_cd();
		}
		if ($mst_tdlv_addr1.equalsIgnoreCase(name)) {
			return mst_tdlv_addr1();
		}
		if ($mst_tdlv_addr2.equalsIgnoreCase(name)) {
			return mst_tdlv_addr2();
		}
		if ($mst_tdlv_addr3.equalsIgnoreCase(name)) {
			return mst_tdlv_addr3();
		}
		if ($mst_tdlv_addr4.equalsIgnoreCase(name)) {
			return mst_tdlv_addr4();
		}
		if ($mst_tdlv_tel.equalsIgnoreCase(name)) {
			return mst_tdlv_tel();
		}
		if ($mst_tdlv_fax.equalsIgnoreCase(name)) {
			return mst_tdlv_fax();
		}
		if ($tdlv_lg_grp_cd.equalsIgnoreCase(name)) {
			return tdlv_lg_grp_cd();
		}
		if ($assort_typ.equalsIgnoreCase(name)) {
			return assort_typ();
		}
		if ($base_unit_rnd_typ.equalsIgnoreCase(name)) {
			return base_unit_rnd_typ();
		}
		if ($base_unit_cd.equalsIgnoreCase(name)) {
			return base_unit_cd();
		}
		if ($intr_rmrks.equalsIgnoreCase(name)) {
			return intr_rmrks();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($dlv_inst_rcpt_rev.equalsIgnoreCase(name)) {
			return dlv_inst_rcpt_rev();
		}
		if ($set_itm_grp_no.equalsIgnoreCase(name)) {
			return set_itm_grp_no();
		}
		if ($trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			return trd_unit_conv_base_qty();
		}
		if ($trd_unit_conv_qty.equalsIgnoreCase(name)) {
			return trd_unit_conv_qty();
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			return base_unit_dec_place();
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			return base_unit_qty();
		}
		if ($ship_pr_upd_cntr.equalsIgnoreCase(name)) {
			return ship_pr_upd_cntr();
		}
		if ($slo_upd_cntr.equalsIgnoreCase(name)) {
			return slo_upd_cntr();
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			return peg_no();
		}
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($slo_dt.equalsIgnoreCase(name)) {
			return slo_dt();
		}
		return super.getDateNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($cst_iv_flg.equalsIgnoreCase(name)) {
			return cst_iv_flg();
		}
		if ($dlv_sundry_flg.equalsIgnoreCase(name)) {
			return dlv_sundry_flg();
		}
		if ($pri_prnt_flg.equalsIgnoreCase(name)) {
			return pri_prnt_flg();
		}
		if ($tdlv_sundry_flg.equalsIgnoreCase(name)) {
			return tdlv_sundry_flg();
		}
		if ($dscnt_itm_flg.equalsIgnoreCase(name)) {
			return dscnt_itm_flg();
		}
		if ($err_flg.equalsIgnoreCase(name)) {
			return err_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($slo_d_no.equalsIgnoreCase(name)) {
			slo_d_no(value);
			return;
		}
		if ($ship_pr_no.equalsIgnoreCase(name)) {
			ship_pr_no(value);
			return;
		}
		if ($trd_ptn_typ.equalsIgnoreCase(name)) {
			trd_ptn_typ(value);
			return;
		}
		if ($slo_no.equalsIgnoreCase(name)) {
			slo_no(value);
			return;
		}
		if ($sls_dpt_cd.equalsIgnoreCase(name)) {
			sls_dpt_cd(value);
			return;
		}
		if ($sls_usr_cd.equalsIgnoreCase(name)) {
			sls_usr_cd(value);
			return;
		}
		if ($proc_typ.equalsIgnoreCase(name)) {
			proc_typ(value);
			return;
		}
		if ($dpt_wg_cd.equalsIgnoreCase(name)) {
			dpt_wg_cd(value);
			return;
		}
		if ($dlv_inst_rcpt_no.equalsIgnoreCase(name)) {
			dlv_inst_rcpt_no(value);
			return;
		}
		if ($slo_via_dlv_typ.equalsIgnoreCase(name)) {
			slo_via_dlv_typ(value);
			return;
		}
		if ($mst_dlv_nm.equalsIgnoreCase(name)) {
			mst_dlv_nm(value);
			return;
		}
		if ($mst_dlv_cntct_dpt.equalsIgnoreCase(name)) {
			mst_dlv_cntct_dpt(value);
			return;
		}
		if ($mst_dlv_cntct_psn.equalsIgnoreCase(name)) {
			mst_dlv_cntct_psn(value);
			return;
		}
		if ($mst_dlv_zip_cd.equalsIgnoreCase(name)) {
			mst_dlv_zip_cd(value);
			return;
		}
		if ($mst_dlv_addr1.equalsIgnoreCase(name)) {
			mst_dlv_addr1(value);
			return;
		}
		if ($mst_dlv_addr2.equalsIgnoreCase(name)) {
			mst_dlv_addr2(value);
			return;
		}
		if ($mst_dlv_addr3.equalsIgnoreCase(name)) {
			mst_dlv_addr3(value);
			return;
		}
		if ($mst_dlv_addr4.equalsIgnoreCase(name)) {
			mst_dlv_addr4(value);
			return;
		}
		if ($mst_dlv_tel.equalsIgnoreCase(name)) {
			mst_dlv_tel(value);
			return;
		}
		if ($mst_dlv_fax.equalsIgnoreCase(name)) {
			mst_dlv_fax(value);
			return;
		}
		if ($dlv_lg_grp_cd.equalsIgnoreCase(name)) {
			dlv_lg_grp_cd(value);
			return;
		}
		if ($mst_tdlv_nm.equalsIgnoreCase(name)) {
			mst_tdlv_nm(value);
			return;
		}
		if ($via_dlv_typ.equalsIgnoreCase(name)) {
			via_dlv_typ(value);
			return;
		}
		if ($mst_tdlv_cntct_dpt.equalsIgnoreCase(name)) {
			mst_tdlv_cntct_dpt(value);
			return;
		}
		if ($mst_tdlv_cntct_psn.equalsIgnoreCase(name)) {
			mst_tdlv_cntct_psn(value);
			return;
		}
		if ($mst_tdlv_zip_cd.equalsIgnoreCase(name)) {
			mst_tdlv_zip_cd(value);
			return;
		}
		if ($mst_tdlv_addr1.equalsIgnoreCase(name)) {
			mst_tdlv_addr1(value);
			return;
		}
		if ($mst_tdlv_addr2.equalsIgnoreCase(name)) {
			mst_tdlv_addr2(value);
			return;
		}
		if ($mst_tdlv_addr3.equalsIgnoreCase(name)) {
			mst_tdlv_addr3(value);
			return;
		}
		if ($mst_tdlv_addr4.equalsIgnoreCase(name)) {
			mst_tdlv_addr4(value);
			return;
		}
		if ($mst_tdlv_tel.equalsIgnoreCase(name)) {
			mst_tdlv_tel(value);
			return;
		}
		if ($mst_tdlv_fax.equalsIgnoreCase(name)) {
			mst_tdlv_fax(value);
			return;
		}
		if ($tdlv_lg_grp_cd.equalsIgnoreCase(name)) {
			tdlv_lg_grp_cd(value);
			return;
		}
		if ($assort_typ.equalsIgnoreCase(name)) {
			assort_typ(value);
			return;
		}
		if ($base_unit_rnd_typ.equalsIgnoreCase(name)) {
			base_unit_rnd_typ(value);
			return;
		}
		if ($base_unit_cd.equalsIgnoreCase(name)) {
			base_unit_cd(value);
			return;
		}
		if ($intr_rmrks.equalsIgnoreCase(name)) {
			intr_rmrks(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($dlv_inst_rcpt_rev.equalsIgnoreCase(name)) {
			dlv_inst_rcpt_rev(value);
			return;
		}
		if ($set_itm_grp_no.equalsIgnoreCase(name)) {
			set_itm_grp_no(value);
			return;
		}
		if ($trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			trd_unit_conv_base_qty(value);
			return;
		}
		if ($trd_unit_conv_qty.equalsIgnoreCase(name)) {
			trd_unit_conv_qty(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($ship_pr_upd_cntr.equalsIgnoreCase(name)) {
			ship_pr_upd_cntr(value);
			return;
		}
		if ($slo_upd_cntr.equalsIgnoreCase(name)) {
			slo_upd_cntr(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($dlv_inst_rcpt_rev.equalsIgnoreCase(name)) {
			dlv_inst_rcpt_rev(value);
			return;
		}
		if ($set_itm_grp_no.equalsIgnoreCase(name)) {
			set_itm_grp_no(value);
			return;
		}
		if ($trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			trd_unit_conv_base_qty(value);
			return;
		}
		if ($trd_unit_conv_qty.equalsIgnoreCase(name)) {
			trd_unit_conv_qty(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($ship_pr_upd_cntr.equalsIgnoreCase(name)) {
			ship_pr_upd_cntr(value);
			return;
		}
		if ($slo_upd_cntr.equalsIgnoreCase(name)) {
			slo_upd_cntr(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($dlv_inst_rcpt_rev.equalsIgnoreCase(name)) {
			dlv_inst_rcpt_rev(value);
			return;
		}
		if ($set_itm_grp_no.equalsIgnoreCase(name)) {
			set_itm_grp_no(value);
			return;
		}
		if ($trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			trd_unit_conv_base_qty(value);
			return;
		}
		if ($trd_unit_conv_qty.equalsIgnoreCase(name)) {
			trd_unit_conv_qty(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($ship_pr_upd_cntr.equalsIgnoreCase(name)) {
			ship_pr_upd_cntr(value);
			return;
		}
		if ($slo_upd_cntr.equalsIgnoreCase(name)) {
			slo_upd_cntr(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($dlv_inst_rcpt_rev.equalsIgnoreCase(name)) {
			dlv_inst_rcpt_rev(value);
			return;
		}
		if ($set_itm_grp_no.equalsIgnoreCase(name)) {
			set_itm_grp_no(value);
			return;
		}
		if ($trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			trd_unit_conv_base_qty(value);
			return;
		}
		if ($trd_unit_conv_qty.equalsIgnoreCase(name)) {
			trd_unit_conv_qty(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($ship_pr_upd_cntr.equalsIgnoreCase(name)) {
			ship_pr_upd_cntr(value);
			return;
		}
		if ($slo_upd_cntr.equalsIgnoreCase(name)) {
			slo_upd_cntr(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($dlv_inst_rcpt_rev.equalsIgnoreCase(name)) {
			dlv_inst_rcpt_rev(value);
			return;
		}
		if ($set_itm_grp_no.equalsIgnoreCase(name)) {
			set_itm_grp_no(value);
			return;
		}
		if ($trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			trd_unit_conv_base_qty(value);
			return;
		}
		if ($trd_unit_conv_qty.equalsIgnoreCase(name)) {
			trd_unit_conv_qty(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($ship_pr_upd_cntr.equalsIgnoreCase(name)) {
			ship_pr_upd_cntr(value);
			return;
		}
		if ($slo_upd_cntr.equalsIgnoreCase(name)) {
			slo_upd_cntr(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($slo_dt.equalsIgnoreCase(name)) {
			slo_dt(value);
			return;
		}
		super.setDate(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($cst_iv_flg.equalsIgnoreCase(name)) {
			cst_iv_flg(value);
			return;
		}
		if ($dlv_sundry_flg.equalsIgnoreCase(name)) {
			dlv_sundry_flg(value);
			return;
		}
		if ($pri_prnt_flg.equalsIgnoreCase(name)) {
			pri_prnt_flg(value);
			return;
		}
		if ($tdlv_sundry_flg.equalsIgnoreCase(name)) {
			tdlv_sundry_flg(value);
			return;
		}
		if ($dscnt_itm_flg.equalsIgnoreCase(name)) {
			dscnt_itm_flg(value);
			return;
		}
		if ($err_flg.equalsIgnoreCase(name)) {
			err_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($slo_d_no.equalsIgnoreCase(name)) {
			slo_d_no(value);
			return;
		}
		if ($ship_pr_no.equalsIgnoreCase(name)) {
			ship_pr_no(value);
			return;
		}
		if ($trd_ptn_typ.equalsIgnoreCase(name)) {
			trd_ptn_typ(value);
			return;
		}
		if ($slo_no.equalsIgnoreCase(name)) {
			slo_no(value);
			return;
		}
		if ($sls_dpt_cd.equalsIgnoreCase(name)) {
			sls_dpt_cd(value);
			return;
		}
		if ($sls_usr_cd.equalsIgnoreCase(name)) {
			sls_usr_cd(value);
			return;
		}
		if ($proc_typ.equalsIgnoreCase(name)) {
			proc_typ(value);
			return;
		}
		if ($dpt_wg_cd.equalsIgnoreCase(name)) {
			dpt_wg_cd(value);
			return;
		}
		if ($dlv_inst_rcpt_no.equalsIgnoreCase(name)) {
			dlv_inst_rcpt_no(value);
			return;
		}
		if ($slo_via_dlv_typ.equalsIgnoreCase(name)) {
			slo_via_dlv_typ(value);
			return;
		}
		if ($mst_dlv_nm.equalsIgnoreCase(name)) {
			mst_dlv_nm(value);
			return;
		}
		if ($mst_dlv_cntct_dpt.equalsIgnoreCase(name)) {
			mst_dlv_cntct_dpt(value);
			return;
		}
		if ($mst_dlv_cntct_psn.equalsIgnoreCase(name)) {
			mst_dlv_cntct_psn(value);
			return;
		}
		if ($mst_dlv_zip_cd.equalsIgnoreCase(name)) {
			mst_dlv_zip_cd(value);
			return;
		}
		if ($mst_dlv_addr1.equalsIgnoreCase(name)) {
			mst_dlv_addr1(value);
			return;
		}
		if ($mst_dlv_addr2.equalsIgnoreCase(name)) {
			mst_dlv_addr2(value);
			return;
		}
		if ($mst_dlv_addr3.equalsIgnoreCase(name)) {
			mst_dlv_addr3(value);
			return;
		}
		if ($mst_dlv_addr4.equalsIgnoreCase(name)) {
			mst_dlv_addr4(value);
			return;
		}
		if ($mst_dlv_tel.equalsIgnoreCase(name)) {
			mst_dlv_tel(value);
			return;
		}
		if ($mst_dlv_fax.equalsIgnoreCase(name)) {
			mst_dlv_fax(value);
			return;
		}
		if ($dlv_lg_grp_cd.equalsIgnoreCase(name)) {
			dlv_lg_grp_cd(value);
			return;
		}
		if ($mst_tdlv_nm.equalsIgnoreCase(name)) {
			mst_tdlv_nm(value);
			return;
		}
		if ($via_dlv_typ.equalsIgnoreCase(name)) {
			via_dlv_typ(value);
			return;
		}
		if ($mst_tdlv_cntct_dpt.equalsIgnoreCase(name)) {
			mst_tdlv_cntct_dpt(value);
			return;
		}
		if ($mst_tdlv_cntct_psn.equalsIgnoreCase(name)) {
			mst_tdlv_cntct_psn(value);
			return;
		}
		if ($mst_tdlv_zip_cd.equalsIgnoreCase(name)) {
			mst_tdlv_zip_cd(value);
			return;
		}
		if ($mst_tdlv_addr1.equalsIgnoreCase(name)) {
			mst_tdlv_addr1(value);
			return;
		}
		if ($mst_tdlv_addr2.equalsIgnoreCase(name)) {
			mst_tdlv_addr2(value);
			return;
		}
		if ($mst_tdlv_addr3.equalsIgnoreCase(name)) {
			mst_tdlv_addr3(value);
			return;
		}
		if ($mst_tdlv_addr4.equalsIgnoreCase(name)) {
			mst_tdlv_addr4(value);
			return;
		}
		if ($mst_tdlv_tel.equalsIgnoreCase(name)) {
			mst_tdlv_tel(value);
			return;
		}
		if ($mst_tdlv_fax.equalsIgnoreCase(name)) {
			mst_tdlv_fax(value);
			return;
		}
		if ($tdlv_lg_grp_cd.equalsIgnoreCase(name)) {
			tdlv_lg_grp_cd(value);
			return;
		}
		if ($assort_typ.equalsIgnoreCase(name)) {
			assort_typ(value);
			return;
		}
		if ($base_unit_rnd_typ.equalsIgnoreCase(name)) {
			base_unit_rnd_typ(value);
			return;
		}
		if ($base_unit_cd.equalsIgnoreCase(name)) {
			base_unit_cd(value);
			return;
		}
		if ($intr_rmrks.equalsIgnoreCase(name)) {
			intr_rmrks(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($dlv_inst_rcpt_rev.equalsIgnoreCase(name)) {
			dlv_inst_rcpt_rev(value);
			return;
		}
		if ($set_itm_grp_no.equalsIgnoreCase(name)) {
			set_itm_grp_no(value);
			return;
		}
		if ($trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			trd_unit_conv_base_qty(value);
			return;
		}
		if ($trd_unit_conv_qty.equalsIgnoreCase(name)) {
			trd_unit_conv_qty(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($ship_pr_upd_cntr.equalsIgnoreCase(name)) {
			ship_pr_upd_cntr(value);
			return;
		}
		if ($slo_upd_cntr.equalsIgnoreCase(name)) {
			slo_upd_cntr(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($dlv_inst_rcpt_rev.equalsIgnoreCase(name)) {
			dlv_inst_rcpt_rev(value);
			return;
		}
		if ($set_itm_grp_no.equalsIgnoreCase(name)) {
			set_itm_grp_no(value);
			return;
		}
		if ($trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			trd_unit_conv_base_qty(value);
			return;
		}
		if ($trd_unit_conv_qty.equalsIgnoreCase(name)) {
			trd_unit_conv_qty(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($ship_pr_upd_cntr.equalsIgnoreCase(name)) {
			ship_pr_upd_cntr(value);
			return;
		}
		if ($slo_upd_cntr.equalsIgnoreCase(name)) {
			slo_upd_cntr(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($dlv_inst_rcpt_rev.equalsIgnoreCase(name)) {
			dlv_inst_rcpt_rev(value);
			return;
		}
		if ($set_itm_grp_no.equalsIgnoreCase(name)) {
			set_itm_grp_no(value);
			return;
		}
		if ($trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			trd_unit_conv_base_qty(value);
			return;
		}
		if ($trd_unit_conv_qty.equalsIgnoreCase(name)) {
			trd_unit_conv_qty(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($ship_pr_upd_cntr.equalsIgnoreCase(name)) {
			ship_pr_upd_cntr(value);
			return;
		}
		if ($slo_upd_cntr.equalsIgnoreCase(name)) {
			slo_upd_cntr(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($dlv_inst_rcpt_rev.equalsIgnoreCase(name)) {
			dlv_inst_rcpt_rev(value);
			return;
		}
		if ($set_itm_grp_no.equalsIgnoreCase(name)) {
			set_itm_grp_no(value);
			return;
		}
		if ($trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			trd_unit_conv_base_qty(value);
			return;
		}
		if ($trd_unit_conv_qty.equalsIgnoreCase(name)) {
			trd_unit_conv_qty(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($ship_pr_upd_cntr.equalsIgnoreCase(name)) {
			ship_pr_upd_cntr(value);
			return;
		}
		if ($slo_upd_cntr.equalsIgnoreCase(name)) {
			slo_upd_cntr(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($dlv_inst_rcpt_rev.equalsIgnoreCase(name)) {
			dlv_inst_rcpt_rev(value);
			return;
		}
		if ($set_itm_grp_no.equalsIgnoreCase(name)) {
			set_itm_grp_no(value);
			return;
		}
		if ($trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			trd_unit_conv_base_qty(value);
			return;
		}
		if ($trd_unit_conv_qty.equalsIgnoreCase(name)) {
			trd_unit_conv_qty(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($ship_pr_upd_cntr.equalsIgnoreCase(name)) {
			ship_pr_upd_cntr(value);
			return;
		}
		if ($slo_upd_cntr.equalsIgnoreCase(name)) {
			slo_upd_cntr(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($slo_dt.equalsIgnoreCase(name)) {
			slo_dt(value);
			return;
		}
		super.setDateNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($cst_iv_flg.equalsIgnoreCase(name)) {
			cst_iv_flg(value);
			return;
		}
		if ($dlv_sundry_flg.equalsIgnoreCase(name)) {
			dlv_sundry_flg(value);
			return;
		}
		if ($pri_prnt_flg.equalsIgnoreCase(name)) {
			pri_prnt_flg(value);
			return;
		}
		if ($tdlv_sundry_flg.equalsIgnoreCase(name)) {
			tdlv_sundry_flg(value);
			return;
		}
		if ($dscnt_itm_flg.equalsIgnoreCase(name)) {
			dscnt_itm_flg(value);
			return;
		}
		if ($err_flg.equalsIgnoreCase(name)) {
			err_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}

	public MCRow getInnerRow(String name) {
		if ($dlvInst.equalsIgnoreCase(name)) {
			return dlvInst();
		}
		return super.getInnerRow(name);
	}

	public void setInnerRow(String name, MCRow value) {
		if ($dlvInst.equalsIgnoreCase(name)) {
			dlvInst(
				((MCContainerMeta) dlvInst_META).castInnerRow(mcframe.serverMS.dbc.MST_DLV_INST_RECV_IF_R.class, value)
			);
			return;
		}
		super.setInnerRow(name, value);
	}


	/**
	 * Data row No. データ行ＮＯ.<p>
	 *
	 */
	public MCNumber data_lno() {
		return dlvInst().data_lno();
	}

	/**
	 * Data row No. データ行ＮＯ.<p>
	 *
	 */
	public void data_lno(MCNumber value) {
		dlvInst().data_lno(value);
	}

	/**
	 * Data row No. データ行ＮＯ.<p>
	 *
	 */
	public void data_lno(int value) {
		dlvInst().data_lno(value);
	}

	/**
	 * Data row No. データ行ＮＯ.<p>
	 *
	 */
	public void data_lno(long value) {
		dlvInst().data_lno(value);
	}

	/**
	 * Data row No. データ行ＮＯ.<p>
	 *
	 */
	public void data_lno(float value) {
		dlvInst().data_lno(value);
	}

	/**
	 * Data row No. データ行ＮＯ.<p>
	 *
	 */
	public void data_lno(double value) {
		dlvInst().data_lno(value);
	}

	/**
	 * Data No. データＮＯ.<p>
	 *
	 */
	public MCNumber data_no() {
		return dlvInst().data_no();
	}

	/**
	 * Data No. データＮＯ.<p>
	 *
	 */
	public void data_no(MCNumber value) {
		dlvInst().data_no(value);
	}

	/**
	 * Data No. データＮＯ.<p>
	 *
	 */
	public void data_no(int value) {
		dlvInst().data_no(value);
	}

	/**
	 * Data No. データＮＯ.<p>
	 *
	 */
	public void data_no(long value) {
		dlvInst().data_no(value);
	}

	/**
	 * Data No. データＮＯ.<p>
	 *
	 */
	public void data_no(float value) {
		dlvInst().data_no(value);
	}

	/**
	 * Data No. データＮＯ.<p>
	 *
	 */
	public void data_no(double value) {
		dlvInst().data_no(value);
	}

	/**
	 * Data update type データ更新区分.<p>
	 *
	 */
	public String data_crud_typ() {
		return dlvInst().data_crud_typ();
	}

	/**
	 * Data update type データ更新区分.<p>
	 *
	 */
	public void data_crud_typ(String value) {
		dlvInst().data_crud_typ(value);
	}

	/**
	 * External system cd. 外部システムＣＤ.<p>
	 *
	 */
	public String ext_sys_cd() {
		return dlvInst().ext_sys_cd();
	}

	/**
	 * External system cd. 外部システムＣＤ.<p>
	 *
	 */
	public void ext_sys_cd(String value) {
		dlvInst().ext_sys_cd(value);
	}

	/**
	 * PG execution status type ＰＧ実行状況区分.<p>
	 *
	 */
	public String exe_sts_typ() {
		return dlvInst().exe_sts_typ();
	}

	/**
	 * PG execution status type ＰＧ実行状況区分.<p>
	 *
	 */
	public void exe_sts_typ(String value) {
		dlvInst().exe_sts_typ(value);
	}

	/**
	 * External system data No. 外部システムデータＮＯ.<p>
	 *
	 */
	public MCNumber ext_data_no() {
		return dlvInst().ext_data_no();
	}

	/**
	 * External system data No. 外部システムデータＮＯ.<p>
	 *
	 */
	public void ext_data_no(MCNumber value) {
		dlvInst().ext_data_no(value);
	}

	/**
	 * External system data No. 外部システムデータＮＯ.<p>
	 *
	 */
	public void ext_data_no(int value) {
		dlvInst().ext_data_no(value);
	}

	/**
	 * External system data No. 外部システムデータＮＯ.<p>
	 *
	 */
	public void ext_data_no(long value) {
		dlvInst().ext_data_no(value);
	}

	/**
	 * External system data No. 外部システムデータＮＯ.<p>
	 *
	 */
	public void ext_data_no(float value) {
		dlvInst().ext_data_no(value);
	}

	/**
	 * External system data No. 外部システムデータＮＯ.<p>
	 *
	 */
	public void ext_data_no(double value) {
		dlvInst().ext_data_no(value);
	}

	/**
	 * External system data row No. 外部システムデータ行ＮＯ.<p>
	 *
	 */
	public MCNumber ext_data_lno() {
		return dlvInst().ext_data_lno();
	}

	/**
	 * External system data row No. 外部システムデータ行ＮＯ.<p>
	 *
	 */
	public void ext_data_lno(MCNumber value) {
		dlvInst().ext_data_lno(value);
	}

	/**
	 * External system data row No. 外部システムデータ行ＮＯ.<p>
	 *
	 */
	public void ext_data_lno(int value) {
		dlvInst().ext_data_lno(value);
	}

	/**
	 * External system data row No. 外部システムデータ行ＮＯ.<p>
	 *
	 */
	public void ext_data_lno(long value) {
		dlvInst().ext_data_lno(value);
	}

	/**
	 * External system data row No. 外部システムデータ行ＮＯ.<p>
	 *
	 */
	public void ext_data_lno(float value) {
		dlvInst().ext_data_lno(value);
	}

	/**
	 * External system data row No. 外部システムデータ行ＮＯ.<p>
	 *
	 */
	public void ext_data_lno(double value) {
		dlvInst().ext_data_lno(value);
	}

	/**
	 * Creation date and time of source record 送信元レコード作成日時.<p>
	 *
	 */
	public MCDate data_make_dt() {
		return dlvInst().data_make_dt();
	}

	/**
	 * Creation date and time of source record 送信元レコード作成日時.<p>
	 *
	 */
	public void data_make_dt(MCDate value) {
		dlvInst().data_make_dt(value);
	}

	/**
	 * To import 取込対象.<p>
	 *
	 */
	public boolean imp_flg() {
		return dlvInst().imp_flg();
	}

	/**
	 * To import 取込対象.<p>
	 *
	 */
	public void imp_flg(boolean value) {
		dlvInst().imp_flg(value);
	}

	/**
	 * Receiving date 受信日.<p>
	 *
	 */
	public MCDate recv_dt() {
		return dlvInst().recv_dt();
	}

	/**
	 * Receiving date 受信日.<p>
	 *
	 */
	public void recv_dt(MCDate value) {
		dlvInst().recv_dt(value);
	}

	/**
	 * Customer delivery order No. 得意先納入指示ＮＯ.<p>
	 *
	 */
	public String cst_dlv_inst_no() {
		return dlvInst().cst_dlv_inst_no();
	}

	/**
	 * Customer delivery order No. 得意先納入指示ＮＯ.<p>
	 *
	 */
	public void cst_dlv_inst_no(String value) {
		dlvInst().cst_dlv_inst_no(value);
	}

	/**
	 * Customer delivery order rev. number 得意先納入指示改訂番号.<p>
	 *
	 */
	public MCNumber cst_dlv_inst_rev() {
		return dlvInst().cst_dlv_inst_rev();
	}

	/**
	 * Customer delivery order rev. number 得意先納入指示改訂番号.<p>
	 *
	 */
	public void cst_dlv_inst_rev(MCNumber value) {
		dlvInst().cst_dlv_inst_rev(value);
	}

	/**
	 * Customer delivery order rev. number 得意先納入指示改訂番号.<p>
	 *
	 */
	public void cst_dlv_inst_rev(int value) {
		dlvInst().cst_dlv_inst_rev(value);
	}

	/**
	 * Customer delivery order rev. number 得意先納入指示改訂番号.<p>
	 *
	 */
	public void cst_dlv_inst_rev(long value) {
		dlvInst().cst_dlv_inst_rev(value);
	}

	/**
	 * Customer delivery order rev. number 得意先納入指示改訂番号.<p>
	 *
	 */
	public void cst_dlv_inst_rev(float value) {
		dlvInst().cst_dlv_inst_rev(value);
	}

	/**
	 * Customer delivery order rev. number 得意先納入指示改訂番号.<p>
	 *
	 */
	public void cst_dlv_inst_rev(double value) {
		dlvInst().cst_dlv_inst_rev(value);
	}

	/**
	 * Customer delivery order details No. 得意先納入指示明細ＮＯ.<p>
	 *
	 */
	public String cst_dlv_inst_d_no() {
		return dlvInst().cst_dlv_inst_d_no();
	}

	/**
	 * Customer delivery order details No. 得意先納入指示明細ＮＯ.<p>
	 *
	 */
	public void cst_dlv_inst_d_no(String value) {
		dlvInst().cst_dlv_inst_d_no(value);
	}

	/**
	 * Customer order No. 得意先注文ＮＯ.<p>
	 *
	 */
	public String cst_po_no() {
		return dlvInst().cst_po_no();
	}

	/**
	 * Customer order No. 得意先注文ＮＯ.<p>
	 *
	 */
	public void cst_po_no(String value) {
		dlvInst().cst_po_no(value);
	}

	/**
	 * Customer order rev. number 得意先注文改訂番号.<p>
	 *
	 */
	public MCNumber cst_po_rev() {
		return dlvInst().cst_po_rev();
	}

	/**
	 * Customer order rev. number 得意先注文改訂番号.<p>
	 *
	 */
	public void cst_po_rev(MCNumber value) {
		dlvInst().cst_po_rev(value);
	}

	/**
	 * Customer order rev. number 得意先注文改訂番号.<p>
	 *
	 */
	public void cst_po_rev(int value) {
		dlvInst().cst_po_rev(value);
	}

	/**
	 * Customer order rev. number 得意先注文改訂番号.<p>
	 *
	 */
	public void cst_po_rev(long value) {
		dlvInst().cst_po_rev(value);
	}

	/**
	 * Customer order rev. number 得意先注文改訂番号.<p>
	 *
	 */
	public void cst_po_rev(float value) {
		dlvInst().cst_po_rev(value);
	}

	/**
	 * Customer order rev. number 得意先注文改訂番号.<p>
	 *
	 */
	public void cst_po_rev(double value) {
		dlvInst().cst_po_rev(value);
	}

	/**
	 * Customer order details No. 得意先注文明細ＮＯ.<p>
	 *
	 */
	public String cst_po_d_no() {
		return dlvInst().cst_po_d_no();
	}

	/**
	 * Customer order details No. 得意先注文明細ＮＯ.<p>
	 *
	 */
	public void cst_po_d_no(String value) {
		dlvInst().cst_po_d_no(value);
	}

	/**
	 * Customer cd. 得意先ＣＤ.<p>
	 *
	 */
	public String cst_cd() {
		return dlvInst().cst_cd();
	}

	/**
	 * Customer cd. 得意先ＣＤ.<p>
	 *
	 */
	public void cst_cd(String value) {
		dlvInst().cst_cd(value);
	}

	/**
	 * Delivery order date 納入指示日.<p>
	 *
	 */
	public MCDate dlv_inst_dt() {
		return dlvInst().dlv_inst_dt();
	}

	/**
	 * Delivery order date 納入指示日.<p>
	 *
	 */
	public void dlv_inst_dt(MCDate value) {
		dlvInst().dlv_inst_dt(value);
	}

	/**
	 * Delivery destination cd. 納品先ＣＤ.<p>
	 *
	 */
	public String dlv_cd() {
		return dlvInst().dlv_cd();
	}

	/**
	 * Delivery destination cd. 納品先ＣＤ.<p>
	 *
	 */
	public void dlv_cd(String value) {
		dlvInst().dlv_cd(value);
	}

	/**
	 * Delivery destination name 納品先名.<p>
	 *
	 */
	public String dlv_nm() {
		return dlvInst().dlv_nm();
	}

	/**
	 * Delivery destination name 納品先名.<p>
	 *
	 */
	public void dlv_nm(String value) {
		dlvInst().dlv_nm(value);
	}

	/**
	 * Delivery destination dept. 納品先部署.<p>
	 *
	 */
	public String dlv_cntct_dpt() {
		return dlvInst().dlv_cntct_dpt();
	}

	/**
	 * Delivery destination dept. 納品先部署.<p>
	 *
	 */
	public void dlv_cntct_dpt(String value) {
		dlvInst().dlv_cntct_dpt(value);
	}

	/**
	 * Delivery destination PIC 納品先担当者.<p>
	 *
	 */
	public String dlv_cntct_psn() {
		return dlvInst().dlv_cntct_psn();
	}

	/**
	 * Delivery destination PIC 納品先担当者.<p>
	 *
	 */
	public void dlv_cntct_psn(String value) {
		dlvInst().dlv_cntct_psn(value);
	}

	/**
	 * Zip code (Delivery destination) 納品先郵便番号.<p>
	 *
	 */
	public String dlv_zip_cd() {
		return dlvInst().dlv_zip_cd();
	}

	/**
	 * Zip code (Delivery destination) 納品先郵便番号.<p>
	 *
	 */
	public void dlv_zip_cd(String value) {
		dlvInst().dlv_zip_cd(value);
	}

	/**
	 * Address 1 (Delivery destination) 納品先住所１.<p>
	 *
	 */
	public String dlv_addr1() {
		return dlvInst().dlv_addr1();
	}

	/**
	 * Address 1 (Delivery destination) 納品先住所１.<p>
	 *
	 */
	public void dlv_addr1(String value) {
		dlvInst().dlv_addr1(value);
	}

	/**
	 * Address 2 (Delivery destination) 納品先住所２.<p>
	 *
	 */
	public String dlv_addr2() {
		return dlvInst().dlv_addr2();
	}

	/**
	 * Address 2 (Delivery destination) 納品先住所２.<p>
	 *
	 */
	public void dlv_addr2(String value) {
		dlvInst().dlv_addr2(value);
	}

	/**
	 * Address 3 (Delivery destination) 納品先住所３.<p>
	 *
	 */
	public String dlv_addr3() {
		return dlvInst().dlv_addr3();
	}

	/**
	 * Address 3 (Delivery destination) 納品先住所３.<p>
	 *
	 */
	public void dlv_addr3(String value) {
		dlvInst().dlv_addr3(value);
	}

	/**
	 * Address 4 (Delivery destination) 納品先住所４.<p>
	 *
	 */
	public String dlv_addr4() {
		return dlvInst().dlv_addr4();
	}

	/**
	 * Address 4 (Delivery destination) 納品先住所４.<p>
	 *
	 */
	public void dlv_addr4(String value) {
		dlvInst().dlv_addr4(value);
	}

	/**
	 * TEL (Delivery destination) 納品先ＴＥＬ.<p>
	 *
	 */
	public String dlv_tel() {
		return dlvInst().dlv_tel();
	}

	/**
	 * TEL (Delivery destination) 納品先ＴＥＬ.<p>
	 *
	 */
	public void dlv_tel(String value) {
		dlvInst().dlv_tel(value);
	}

	/**
	 * FAX (Delivery destination) 納品先ＦＡＸ.<p>
	 *
	 */
	public String dlv_fax() {
		return dlvInst().dlv_fax();
	}

	/**
	 * FAX (Delivery destination) 納品先ＦＡＸ.<p>
	 *
	 */
	public void dlv_fax(String value) {
		dlvInst().dlv_fax(value);
	}

	/**
	 * Delivery destination country cd. 納品先国ＣＤ.<p>
	 *
	 */
	public String dlv_cntry_cd() {
		return dlvInst().dlv_cntry_cd();
	}

	/**
	 * Delivery destination country cd. 納品先国ＣＤ.<p>
	 *
	 */
	public void dlv_cntry_cd(String value) {
		dlvInst().dlv_cntry_cd(value);
	}

	/**
	 * Receiving point cd. 配送先ＣＤ.<p>
	 *
	 */
	public String tdlv_cd() {
		return dlvInst().tdlv_cd();
	}

	/**
	 * Receiving point cd. 配送先ＣＤ.<p>
	 *
	 */
	public void tdlv_cd(String value) {
		dlvInst().tdlv_cd(value);
	}

	/**
	 * Receiving point name 配送先名.<p>
	 *
	 */
	public String tdlv_nm() {
		return dlvInst().tdlv_nm();
	}

	/**
	 * Receiving point name 配送先名.<p>
	 *
	 */
	public void tdlv_nm(String value) {
		dlvInst().tdlv_nm(value);
	}

	/**
	 * Receiving point dept. 配送先部署.<p>
	 *
	 */
	public String tdlv_cntct_dpt() {
		return dlvInst().tdlv_cntct_dpt();
	}

	/**
	 * Receiving point dept. 配送先部署.<p>
	 *
	 */
	public void tdlv_cntct_dpt(String value) {
		dlvInst().tdlv_cntct_dpt(value);
	}

	/**
	 * Receiving point PIC 配送先担当者.<p>
	 *
	 */
	public String tdlv_cntct_psn() {
		return dlvInst().tdlv_cntct_psn();
	}

	/**
	 * Receiving point PIC 配送先担当者.<p>
	 *
	 */
	public void tdlv_cntct_psn(String value) {
		dlvInst().tdlv_cntct_psn(value);
	}

	/**
	 * Receiving point zip code 配送先郵便番号.<p>
	 *
	 */
	public String tdlv_zip_cd() {
		return dlvInst().tdlv_zip_cd();
	}

	/**
	 * Receiving point zip code 配送先郵便番号.<p>
	 *
	 */
	public void tdlv_zip_cd(String value) {
		dlvInst().tdlv_zip_cd(value);
	}

	/**
	 * Receiving point address 1 配送先住所１.<p>
	 *
	 */
	public String tdlv_addr1() {
		return dlvInst().tdlv_addr1();
	}

	/**
	 * Receiving point address 1 配送先住所１.<p>
	 *
	 */
	public void tdlv_addr1(String value) {
		dlvInst().tdlv_addr1(value);
	}

	/**
	 * Receiving point address 2 配送先住所２.<p>
	 *
	 */
	public String tdlv_addr2() {
		return dlvInst().tdlv_addr2();
	}

	/**
	 * Receiving point address 2 配送先住所２.<p>
	 *
	 */
	public void tdlv_addr2(String value) {
		dlvInst().tdlv_addr2(value);
	}

	/**
	 * Receiving point address 3 配送先住所３.<p>
	 *
	 */
	public String tdlv_addr3() {
		return dlvInst().tdlv_addr3();
	}

	/**
	 * Receiving point address 3 配送先住所３.<p>
	 *
	 */
	public void tdlv_addr3(String value) {
		dlvInst().tdlv_addr3(value);
	}

	/**
	 * Receiving point address 4 配送先住所４.<p>
	 *
	 */
	public String tdlv_addr4() {
		return dlvInst().tdlv_addr4();
	}

	/**
	 * Receiving point address 4 配送先住所４.<p>
	 *
	 */
	public void tdlv_addr4(String value) {
		dlvInst().tdlv_addr4(value);
	}

	/**
	 * Receiving point TEL 配送先ＴＥＬ.<p>
	 *
	 */
	public String tdlv_tel() {
		return dlvInst().tdlv_tel();
	}

	/**
	 * Receiving point TEL 配送先ＴＥＬ.<p>
	 *
	 */
	public void tdlv_tel(String value) {
		dlvInst().tdlv_tel(value);
	}

	/**
	 * Receiving point FAX 配送先ＦＡＸ.<p>
	 *
	 */
	public String tdlv_fax() {
		return dlvInst().tdlv_fax();
	}

	/**
	 * Receiving point FAX 配送先ＦＡＸ.<p>
	 *
	 */
	public void tdlv_fax(String value) {
		dlvInst().tdlv_fax(value);
	}

	/**
	 * Receiving point country cd. 配送先国ＣＤ.<p>
	 *
	 */
	public String tdlv_cntry_cd() {
		return dlvInst().tdlv_cntry_cd();
	}

	/**
	 * Receiving point country cd. 配送先国ＣＤ.<p>
	 *
	 */
	public void tdlv_cntry_cd(String value) {
		dlvInst().tdlv_cntry_cd(value);
	}

	/**
	 * Arrival day of week 着曜日.<p>
	 *
	 */
	public String dlv_day_week_typ() {
		return dlvInst().dlv_day_week_typ();
	}

	/**
	 * Arrival day of week 着曜日.<p>
	 *
	 */
	public void dlv_day_week_typ(String value) {
		dlvInst().dlv_day_week_typ(value);
	}

	/**
	 * Print price type 価格印字区分.<p>
	 *
	 */
	public String pri_prnt_typ() {
		return dlvInst().pri_prnt_typ();
	}

	/**
	 * Print price type 価格印字区分.<p>
	 *
	 */
	public void pri_prnt_typ(String value) {
		dlvInst().pri_prnt_typ(value);
	}

	/**
	 * Customer item cd. 得意先品目ＣＤ.<p>
	 *
	 */
	public String cst_itm_cd() {
		return dlvInst().cst_itm_cd();
	}

	/**
	 * Customer item cd. 得意先品目ＣＤ.<p>
	 *
	 */
	public void cst_itm_cd(String value) {
		dlvInst().cst_itm_cd(value);
	}

	/**
	 * Customer item name 得意先品名.<p>
	 *
	 */
	public String cst_itm_nm() {
		return dlvInst().cst_itm_nm();
	}

	/**
	 * Customer item name 得意先品名.<p>
	 *
	 */
	public void cst_itm_nm(String value) {
		dlvInst().cst_itm_nm(value);
	}

	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public String itm_cd() {
		return dlvInst().itm_cd();
	}

	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public void itm_cd(String value) {
		dlvInst().itm_cd(value);
	}

	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public String itm_sub1() {
		return dlvInst().itm_sub1();
	}

	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public void itm_sub1(String value) {
		dlvInst().itm_sub1(value);
	}

	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public String itm_sub2() {
		return dlvInst().itm_sub2();
	}

	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public void itm_sub2(String value) {
		dlvInst().itm_sub2(value);
	}

	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public String itm_sub3() {
		return dlvInst().itm_sub3();
	}

	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public void itm_sub3(String value) {
		dlvInst().itm_sub3(value);
	}

	/**
	 * Item name 品名.<p>
	 *
	 */
	public String itm_nm() {
		return dlvInst().itm_nm();
	}

	/**
	 * Item name 品名.<p>
	 *
	 */
	public void itm_nm(String value) {
		dlvInst().itm_nm(value);
	}

	/**
	 * Transaction unit cd. 取引単位ＣＤ.<p>
	 *
	 */
	public String trd_unit_cd() {
		return dlvInst().trd_unit_cd();
	}

	/**
	 * Transaction unit cd. 取引単位ＣＤ.<p>
	 *
	 */
	public void trd_unit_cd(String value) {
		dlvInst().trd_unit_cd(value);
	}

	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public MCNumber trd_unit_qty() {
		return dlvInst().trd_unit_qty();
	}

	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public void trd_unit_qty(MCNumber value) {
		dlvInst().trd_unit_qty(value);
	}

	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public void trd_unit_qty(int value) {
		dlvInst().trd_unit_qty(value);
	}

	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public void trd_unit_qty(long value) {
		dlvInst().trd_unit_qty(value);
	}

	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public void trd_unit_qty(float value) {
		dlvInst().trd_unit_qty(value);
	}

	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public void trd_unit_qty(double value) {
		dlvInst().trd_unit_qty(value);
	}

	/**
	 * Desired delivery date and time 納入希望日時.<p>
	 *
	 */
	public MCDate dlv_rqst_tm() {
		return dlvInst().dlv_rqst_tm();
	}

	/**
	 * Desired delivery date and time 納入希望日時.<p>
	 *
	 */
	public void dlv_rqst_tm(MCDate value) {
		dlvInst().dlv_rqst_tm(value);
	}

	/**
	 * Customer delivery order remarks 得意先納入指示備考.<p>
	 *
	 */
	public String cst_dlv_inst_rmrks() {
		return dlvInst().cst_dlv_inst_rmrks();
	}

	/**
	 * Customer delivery order remarks 得意先納入指示備考.<p>
	 *
	 */
	public void cst_dlv_inst_rmrks(String value) {
		dlvInst().cst_dlv_inst_rmrks(value);
	}

	/**
	 * Customer delivery order details remarks 得意先納入指示明細備考.<p>
	 *
	 */
	public String cst_dlv_inst_d_rmrks() {
		return dlvInst().cst_dlv_inst_d_rmrks();
	}

	/**
	 * Customer delivery order details remarks 得意先納入指示明細備考.<p>
	 *
	 */
	public void cst_dlv_inst_d_rmrks(String value) {
		dlvInst().cst_dlv_inst_d_rmrks(value);
	}

	/**
	 * Spare CHAR column 1 予備ＣＨＡＲ項目１.<p>
	 *
	 */
	public String sub_char1() {
		return dlvInst().sub_char1();
	}

	/**
	 * Spare CHAR column 1 予備ＣＨＡＲ項目１.<p>
	 *
	 */
	public void sub_char1(String value) {
		dlvInst().sub_char1(value);
	}

	/**
	 * Spare CHAR column 2 予備ＣＨＡＲ項目２.<p>
	 *
	 */
	public String sub_char2() {
		return dlvInst().sub_char2();
	}

	/**
	 * Spare CHAR column 2 予備ＣＨＡＲ項目２.<p>
	 *
	 */
	public void sub_char2(String value) {
		dlvInst().sub_char2(value);
	}

	/**
	 * Spare CHAR column 3 予備ＣＨＡＲ項目３.<p>
	 *
	 */
	public String sub_char3() {
		return dlvInst().sub_char3();
	}

	/**
	 * Spare CHAR column 3 予備ＣＨＡＲ項目３.<p>
	 *
	 */
	public void sub_char3(String value) {
		dlvInst().sub_char3(value);
	}

	/**
	 * Spare CHAR column 4 予備ＣＨＡＲ項目４.<p>
	 *
	 */
	public String sub_char4() {
		return dlvInst().sub_char4();
	}

	/**
	 * Spare CHAR column 4 予備ＣＨＡＲ項目４.<p>
	 *
	 */
	public void sub_char4(String value) {
		dlvInst().sub_char4(value);
	}

	/**
	 * Spare CHAR column 5 予備ＣＨＡＲ項目５.<p>
	 *
	 */
	public String sub_char5() {
		return dlvInst().sub_char5();
	}

	/**
	 * Spare CHAR column 5 予備ＣＨＡＲ項目５.<p>
	 *
	 */
	public void sub_char5(String value) {
		dlvInst().sub_char5(value);
	}

	/**
	 * Spare CHAR column 6 予備ＣＨＡＲ項目６.<p>
	 *
	 */
	public String sub_char6() {
		return dlvInst().sub_char6();
	}

	/**
	 * Spare CHAR column 6 予備ＣＨＡＲ項目６.<p>
	 *
	 */
	public void sub_char6(String value) {
		dlvInst().sub_char6(value);
	}

	/**
	 * Spare CHAR column 7 予備ＣＨＡＲ項目７.<p>
	 *
	 */
	public String sub_char7() {
		return dlvInst().sub_char7();
	}

	/**
	 * Spare CHAR column 7 予備ＣＨＡＲ項目７.<p>
	 *
	 */
	public void sub_char7(String value) {
		dlvInst().sub_char7(value);
	}

	/**
	 * Spare CHAR column 8 予備ＣＨＡＲ項目８.<p>
	 *
	 */
	public String sub_char8() {
		return dlvInst().sub_char8();
	}

	/**
	 * Spare CHAR column 8 予備ＣＨＡＲ項目８.<p>
	 *
	 */
	public void sub_char8(String value) {
		dlvInst().sub_char8(value);
	}

	/**
	 * Spare CHAR column 9 予備ＣＨＡＲ項目９.<p>
	 *
	 */
	public String sub_char9() {
		return dlvInst().sub_char9();
	}

	/**
	 * Spare CHAR column 9 予備ＣＨＡＲ項目９.<p>
	 *
	 */
	public void sub_char9(String value) {
		dlvInst().sub_char9(value);
	}

	/**
	 * Spare CHAR column 10 予備ＣＨＡＲ項目１０.<p>
	 *
	 */
	public String sub_char10() {
		return dlvInst().sub_char10();
	}

	/**
	 * Spare CHAR column 10 予備ＣＨＡＲ項目１０.<p>
	 *
	 */
	public void sub_char10(String value) {
		dlvInst().sub_char10(value);
	}

	/**
	 * Spare CHAR column 11 予備ＣＨＡＲ項目１１.<p>
	 *
	 */
	public String sub_char11() {
		return dlvInst().sub_char11();
	}

	/**
	 * Spare CHAR column 11 予備ＣＨＡＲ項目１１.<p>
	 *
	 */
	public void sub_char11(String value) {
		dlvInst().sub_char11(value);
	}

	/**
	 * Spare CHAR column 12 予備ＣＨＡＲ項目１２.<p>
	 *
	 */
	public String sub_char12() {
		return dlvInst().sub_char12();
	}

	/**
	 * Spare CHAR column 12 予備ＣＨＡＲ項目１２.<p>
	 *
	 */
	public void sub_char12(String value) {
		dlvInst().sub_char12(value);
	}

	/**
	 * Spare CHAR column 13 予備ＣＨＡＲ項目１３.<p>
	 *
	 */
	public String sub_char13() {
		return dlvInst().sub_char13();
	}

	/**
	 * Spare CHAR column 13 予備ＣＨＡＲ項目１３.<p>
	 *
	 */
	public void sub_char13(String value) {
		dlvInst().sub_char13(value);
	}

	/**
	 * Spare CHAR column 14 予備ＣＨＡＲ項目１４.<p>
	 *
	 */
	public String sub_char14() {
		return dlvInst().sub_char14();
	}

	/**
	 * Spare CHAR column 14 予備ＣＨＡＲ項目１４.<p>
	 *
	 */
	public void sub_char14(String value) {
		dlvInst().sub_char14(value);
	}

	/**
	 * Spare CHAR column 15 予備ＣＨＡＲ項目１５.<p>
	 *
	 */
	public String sub_char15() {
		return dlvInst().sub_char15();
	}

	/**
	 * Spare CHAR column 15 予備ＣＨＡＲ項目１５.<p>
	 *
	 */
	public void sub_char15(String value) {
		dlvInst().sub_char15(value);
	}

	/**
	 * Spare CHAR column 16 予備ＣＨＡＲ項目１６.<p>
	 *
	 */
	public String sub_char16() {
		return dlvInst().sub_char16();
	}

	/**
	 * Spare CHAR column 16 予備ＣＨＡＲ項目１６.<p>
	 *
	 */
	public void sub_char16(String value) {
		dlvInst().sub_char16(value);
	}

	/**
	 * Spare CHAR column 17 予備ＣＨＡＲ項目１７.<p>
	 *
	 */
	public String sub_char17() {
		return dlvInst().sub_char17();
	}

	/**
	 * Spare CHAR column 17 予備ＣＨＡＲ項目１７.<p>
	 *
	 */
	public void sub_char17(String value) {
		dlvInst().sub_char17(value);
	}

	/**
	 * Spare CHAR column 18 予備ＣＨＡＲ項目１８.<p>
	 *
	 */
	public String sub_char18() {
		return dlvInst().sub_char18();
	}

	/**
	 * Spare CHAR column 18 予備ＣＨＡＲ項目１８.<p>
	 *
	 */
	public void sub_char18(String value) {
		dlvInst().sub_char18(value);
	}

	/**
	 * Spare CHAR column 19 予備ＣＨＡＲ項目１９.<p>
	 *
	 */
	public String sub_char19() {
		return dlvInst().sub_char19();
	}

	/**
	 * Spare CHAR column 19 予備ＣＨＡＲ項目１９.<p>
	 *
	 */
	public void sub_char19(String value) {
		dlvInst().sub_char19(value);
	}

	/**
	 * Spare CHAR column 20 予備ＣＨＡＲ項目２０.<p>
	 *
	 */
	public String sub_char20() {
		return dlvInst().sub_char20();
	}

	/**
	 * Spare CHAR column 20 予備ＣＨＡＲ項目２０.<p>
	 *
	 */
	public void sub_char20(String value) {
		dlvInst().sub_char20(value);
	}

	/**
	 * Spare CHAR column 21 予備ＣＨＡＲ項目２１.<p>
	 *
	 */
	public String sub_char21() {
		return dlvInst().sub_char21();
	}

	/**
	 * Spare CHAR column 21 予備ＣＨＡＲ項目２１.<p>
	 *
	 */
	public void sub_char21(String value) {
		dlvInst().sub_char21(value);
	}

	/**
	 * Spare CHAR column 22 予備ＣＨＡＲ項目２２.<p>
	 *
	 */
	public String sub_char22() {
		return dlvInst().sub_char22();
	}

	/**
	 * Spare CHAR column 22 予備ＣＨＡＲ項目２２.<p>
	 *
	 */
	public void sub_char22(String value) {
		dlvInst().sub_char22(value);
	}

	/**
	 * Spare CHAR column 23 予備ＣＨＡＲ項目２３.<p>
	 *
	 */
	public String sub_char23() {
		return dlvInst().sub_char23();
	}

	/**
	 * Spare CHAR column 23 予備ＣＨＡＲ項目２３.<p>
	 *
	 */
	public void sub_char23(String value) {
		dlvInst().sub_char23(value);
	}

	/**
	 * Spare CHAR column 24 予備ＣＨＡＲ項目２４.<p>
	 *
	 */
	public String sub_char24() {
		return dlvInst().sub_char24();
	}

	/**
	 * Spare CHAR column 24 予備ＣＨＡＲ項目２４.<p>
	 *
	 */
	public void sub_char24(String value) {
		dlvInst().sub_char24(value);
	}

	/**
	 * Spare CHAR column 25 予備ＣＨＡＲ項目２５.<p>
	 *
	 */
	public String sub_char25() {
		return dlvInst().sub_char25();
	}

	/**
	 * Spare CHAR column 25 予備ＣＨＡＲ項目２５.<p>
	 *
	 */
	public void sub_char25(String value) {
		dlvInst().sub_char25(value);
	}

	/**
	 * Spare CHAR column 26 予備ＣＨＡＲ項目２６.<p>
	 *
	 */
	public String sub_char26() {
		return dlvInst().sub_char26();
	}

	/**
	 * Spare CHAR column 26 予備ＣＨＡＲ項目２６.<p>
	 *
	 */
	public void sub_char26(String value) {
		dlvInst().sub_char26(value);
	}

	/**
	 * Spare CHAR column 27 予備ＣＨＡＲ項目２７.<p>
	 *
	 */
	public String sub_char27() {
		return dlvInst().sub_char27();
	}

	/**
	 * Spare CHAR column 27 予備ＣＨＡＲ項目２７.<p>
	 *
	 */
	public void sub_char27(String value) {
		dlvInst().sub_char27(value);
	}

	/**
	 * Spare CHAR column 28 予備ＣＨＡＲ項目２８.<p>
	 *
	 */
	public String sub_char28() {
		return dlvInst().sub_char28();
	}

	/**
	 * Spare CHAR column 28 予備ＣＨＡＲ項目２８.<p>
	 *
	 */
	public void sub_char28(String value) {
		dlvInst().sub_char28(value);
	}

	/**
	 * Spare CHAR column 29 予備ＣＨＡＲ項目２９.<p>
	 *
	 */
	public String sub_char29() {
		return dlvInst().sub_char29();
	}

	/**
	 * Spare CHAR column 29 予備ＣＨＡＲ項目２９.<p>
	 *
	 */
	public void sub_char29(String value) {
		dlvInst().sub_char29(value);
	}

	/**
	 * Spare CHAR column 30 予備ＣＨＡＲ項目３０.<p>
	 *
	 */
	public String sub_char30() {
		return dlvInst().sub_char30();
	}

	/**
	 * Spare CHAR column 30 予備ＣＨＡＲ項目３０.<p>
	 *
	 */
	public void sub_char30(String value) {
		dlvInst().sub_char30(value);
	}

	/**
	 * Spare NUM column 1 予備ＮＵＭ項目１.<p>
	 *
	 */
	public MCNumber sub_num1() {
		return dlvInst().sub_num1();
	}

	/**
	 * Spare NUM column 1 予備ＮＵＭ項目１.<p>
	 *
	 */
	public void sub_num1(MCNumber value) {
		dlvInst().sub_num1(value);
	}

	/**
	 * Spare NUM column 1 予備ＮＵＭ項目１.<p>
	 *
	 */
	public void sub_num1(int value) {
		dlvInst().sub_num1(value);
	}

	/**
	 * Spare NUM column 1 予備ＮＵＭ項目１.<p>
	 *
	 */
	public void sub_num1(long value) {
		dlvInst().sub_num1(value);
	}

	/**
	 * Spare NUM column 1 予備ＮＵＭ項目１.<p>
	 *
	 */
	public void sub_num1(float value) {
		dlvInst().sub_num1(value);
	}

	/**
	 * Spare NUM column 1 予備ＮＵＭ項目１.<p>
	 *
	 */
	public void sub_num1(double value) {
		dlvInst().sub_num1(value);
	}

	/**
	 * Spare NUM column 2 予備ＮＵＭ項目２.<p>
	 *
	 */
	public MCNumber sub_num2() {
		return dlvInst().sub_num2();
	}

	/**
	 * Spare NUM column 2 予備ＮＵＭ項目２.<p>
	 *
	 */
	public void sub_num2(MCNumber value) {
		dlvInst().sub_num2(value);
	}

	/**
	 * Spare NUM column 2 予備ＮＵＭ項目２.<p>
	 *
	 */
	public void sub_num2(int value) {
		dlvInst().sub_num2(value);
	}

	/**
	 * Spare NUM column 2 予備ＮＵＭ項目２.<p>
	 *
	 */
	public void sub_num2(long value) {
		dlvInst().sub_num2(value);
	}

	/**
	 * Spare NUM column 2 予備ＮＵＭ項目２.<p>
	 *
	 */
	public void sub_num2(float value) {
		dlvInst().sub_num2(value);
	}

	/**
	 * Spare NUM column 2 予備ＮＵＭ項目２.<p>
	 *
	 */
	public void sub_num2(double value) {
		dlvInst().sub_num2(value);
	}

	/**
	 * Spare NUM column 3 予備ＮＵＭ項目３.<p>
	 *
	 */
	public MCNumber sub_num3() {
		return dlvInst().sub_num3();
	}

	/**
	 * Spare NUM column 3 予備ＮＵＭ項目３.<p>
	 *
	 */
	public void sub_num3(MCNumber value) {
		dlvInst().sub_num3(value);
	}

	/**
	 * Spare NUM column 3 予備ＮＵＭ項目３.<p>
	 *
	 */
	public void sub_num3(int value) {
		dlvInst().sub_num3(value);
	}

	/**
	 * Spare NUM column 3 予備ＮＵＭ項目３.<p>
	 *
	 */
	public void sub_num3(long value) {
		dlvInst().sub_num3(value);
	}

	/**
	 * Spare NUM column 3 予備ＮＵＭ項目３.<p>
	 *
	 */
	public void sub_num3(float value) {
		dlvInst().sub_num3(value);
	}

	/**
	 * Spare NUM column 3 予備ＮＵＭ項目３.<p>
	 *
	 */
	public void sub_num3(double value) {
		dlvInst().sub_num3(value);
	}

	/**
	 * Spare NUM column 4 予備ＮＵＭ項目４.<p>
	 *
	 */
	public MCNumber sub_num4() {
		return dlvInst().sub_num4();
	}

	/**
	 * Spare NUM column 4 予備ＮＵＭ項目４.<p>
	 *
	 */
	public void sub_num4(MCNumber value) {
		dlvInst().sub_num4(value);
	}

	/**
	 * Spare NUM column 4 予備ＮＵＭ項目４.<p>
	 *
	 */
	public void sub_num4(int value) {
		dlvInst().sub_num4(value);
	}

	/**
	 * Spare NUM column 4 予備ＮＵＭ項目４.<p>
	 *
	 */
	public void sub_num4(long value) {
		dlvInst().sub_num4(value);
	}

	/**
	 * Spare NUM column 4 予備ＮＵＭ項目４.<p>
	 *
	 */
	public void sub_num4(float value) {
		dlvInst().sub_num4(value);
	}

	/**
	 * Spare NUM column 4 予備ＮＵＭ項目４.<p>
	 *
	 */
	public void sub_num4(double value) {
		dlvInst().sub_num4(value);
	}

	/**
	 * Spare NUM column 5 予備ＮＵＭ項目５.<p>
	 *
	 */
	public MCNumber sub_num5() {
		return dlvInst().sub_num5();
	}

	/**
	 * Spare NUM column 5 予備ＮＵＭ項目５.<p>
	 *
	 */
	public void sub_num5(MCNumber value) {
		dlvInst().sub_num5(value);
	}

	/**
	 * Spare NUM column 5 予備ＮＵＭ項目５.<p>
	 *
	 */
	public void sub_num5(int value) {
		dlvInst().sub_num5(value);
	}

	/**
	 * Spare NUM column 5 予備ＮＵＭ項目５.<p>
	 *
	 */
	public void sub_num5(long value) {
		dlvInst().sub_num5(value);
	}

	/**
	 * Spare NUM column 5 予備ＮＵＭ項目５.<p>
	 *
	 */
	public void sub_num5(float value) {
		dlvInst().sub_num5(value);
	}

	/**
	 * Spare NUM column 5 予備ＮＵＭ項目５.<p>
	 *
	 */
	public void sub_num5(double value) {
		dlvInst().sub_num5(value);
	}

	/**
	 * Spare DATE column 1 予備ＤＡＴＥ項目１.<p>
	 *
	 */
	public MCDate sub_dt1() {
		return dlvInst().sub_dt1();
	}

	/**
	 * Spare DATE column 1 予備ＤＡＴＥ項目１.<p>
	 *
	 */
	public void sub_dt1(MCDate value) {
		dlvInst().sub_dt1(value);
	}

	/**
	 * Spare DATE column 2 予備ＤＡＴＥ項目２.<p>
	 *
	 */
	public MCDate sub_dt2() {
		return dlvInst().sub_dt2();
	}

	/**
	 * Spare DATE column 2 予備ＤＡＴＥ項目２.<p>
	 *
	 */
	public void sub_dt2(MCDate value) {
		dlvInst().sub_dt2(value);
	}

	/**
	 * Spare DATE column 3 予備ＤＡＴＥ項目３.<p>
	 *
	 */
	public MCDate sub_dt3() {
		return dlvInst().sub_dt3();
	}

	/**
	 * Spare DATE column 3 予備ＤＡＴＥ項目３.<p>
	 *
	 */
	public void sub_dt3(MCDate value) {
		dlvInst().sub_dt3(value);
	}

	/**
	 * Spare DATE column 4 予備ＤＡＴＥ項目４.<p>
	 *
	 */
	public MCDate sub_dt4() {
		return dlvInst().sub_dt4();
	}

	/**
	 * Spare DATE column 4 予備ＤＡＴＥ項目４.<p>
	 *
	 */
	public void sub_dt4(MCDate value) {
		dlvInst().sub_dt4(value);
	}

	/**
	 * Spare DATE column 5 予備ＤＡＴＥ項目５.<p>
	 *
	 */
	public MCDate sub_dt5() {
		return dlvInst().sub_dt5();
	}

	/**
	 * Spare DATE column 5 予備ＤＡＴＥ項目５.<p>
	 *
	 */
	public void sub_dt5(MCDate value) {
		dlvInst().sub_dt5(value);
	}

	/**
	 * Log sub key 1 ログサブキー１.<p>
	 *
	 */
	public MCNumber log_sub_key1() {
		return dlvInst().log_sub_key1();
	}

	/**
	 * Log sub key 1 ログサブキー１.<p>
	 *
	 */
	public void log_sub_key1(MCNumber value) {
		dlvInst().log_sub_key1(value);
	}

	/**
	 * Log sub key 1 ログサブキー１.<p>
	 *
	 */
	public void log_sub_key1(int value) {
		dlvInst().log_sub_key1(value);
	}

	/**
	 * Log sub key 1 ログサブキー１.<p>
	 *
	 */
	public void log_sub_key1(long value) {
		dlvInst().log_sub_key1(value);
	}

	/**
	 * Log sub key 1 ログサブキー１.<p>
	 *
	 */
	public void log_sub_key1(float value) {
		dlvInst().log_sub_key1(value);
	}

	/**
	 * Log sub key 1 ログサブキー１.<p>
	 *
	 */
	public void log_sub_key1(double value) {
		dlvInst().log_sub_key1(value);
	}

	/**
	 * Log sub key 2 ログサブキー２.<p>
	 *
	 */
	public MCNumber log_sub_key2() {
		return dlvInst().log_sub_key2();
	}

	/**
	 * Log sub key 2 ログサブキー２.<p>
	 *
	 */
	public void log_sub_key2(MCNumber value) {
		dlvInst().log_sub_key2(value);
	}

	/**
	 * Log sub key 2 ログサブキー２.<p>
	 *
	 */
	public void log_sub_key2(int value) {
		dlvInst().log_sub_key2(value);
	}

	/**
	 * Log sub key 2 ログサブキー２.<p>
	 *
	 */
	public void log_sub_key2(long value) {
		dlvInst().log_sub_key2(value);
	}

	/**
	 * Log sub key 2 ログサブキー２.<p>
	 *
	 */
	public void log_sub_key2(float value) {
		dlvInst().log_sub_key2(value);
	}

	/**
	 * Log sub key 2 ログサブキー２.<p>
	 *
	 */
	public void log_sub_key2(double value) {
		dlvInst().log_sub_key2(value);
	}

}

