package mcframe.serverMSBB.MSBBL6010;

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
 * ブロック"SlsAct_Upd02_IvL"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class SlsAct_Upd02_IvLR_MC_A extends MCConstRow {

	/**
	 * Transaction cd. 取引ＣＤ.<p>
	 *
	 */
	public static final String $trd_cd = "trd_cd";
	/**
	 * Transaction pattern type 取引パタン区分.<p>
	 *
	 */
	public static final String $trd_ptn_typ = "trd_ptn_typ";
	/**
	 * Recording date 計上日.<p>
	 *
	 */
	public static final String $ac_dt = "ac_dt";
	/**
	 * Sales dept. cd. 売上部門ＣＤ.<p>
	 *
	 */
	public static final String $sls_dpt_cd = "sls_dpt_cd";
	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public static final String $wg_cd = "wg_cd";
	/**
	 * Sales PIC cd. 売上担当者ＣＤ.<p>
	 *
	 */
	public static final String $sls_usr_cd = "sls_usr_cd";
	/**
	 * Estimated date of unloading 船卸予定日.<p>
	 *
	 */
	public static final String $eta_dt = "eta_dt";
	/**
	 * Customer cd. 得意先ＣＤ.<p>
	 *
	 */
	public static final String $cst_cd = "cst_cd";
	/**
	 * Invoice No. インボイスＮＯ.<p>
	 *
	 */
	public static final String $iv_no = "iv_no";
	/**
	 * Purchase invoice management No. 受領インボイス管理ＮＯ.<p>
	 *
	 */
	public static final String $rcpt_iv_mng_no = "rcpt_iv_mng_no";
	/**
	 * Purchase invoice No. 受領インボイスＮＯ.<p>
	 *
	 */
	public static final String $rcpt_iv_no = "rcpt_iv_no";
	/**
	 * Transaction terms cd. 1 取引条件ＣＤ１.<p>
	 *
	 */
	public static final String $tterm_cd1 = "tterm_cd1";
	/**
	 * Transaction terms remarks 1 取引条件備考１.<p>
	 *
	 */
	public static final String $tterm_rmrks1 = "tterm_rmrks1";
	/**
	 * Transaction terms cd. 2 取引条件ＣＤ２.<p>
	 *
	 */
	public static final String $tterm_cd2 = "tterm_cd2";
	/**
	 * Transaction terms remarks 2 取引条件備考２.<p>
	 *
	 */
	public static final String $tterm_rmrks2 = "tterm_rmrks2";
	/**
	 * Transaction terms cd. 3 取引条件ＣＤ３.<p>
	 *
	 */
	public static final String $tterm_cd3 = "tterm_cd3";
	/**
	 * Transaction terms remarks 3 取引条件備考３.<p>
	 *
	 */
	public static final String $tterm_rmrks3 = "tterm_rmrks3";
	/**
	 * L/C No. Ｌ／ＣＮＯ.<p>
	 *
	 */
	public static final String $lc_no = "lc_no";
	/**
	 * L/C Date Ｌ／Ｃ日付.<p>
	 *
	 */
	public static final String $lc_dt = "lc_dt";
	/**
	 * L/C remarks Ｌ／Ｃ備考.<p>
	 *
	 */
	public static final String $lc_rmrks = "lc_rmrks";
	/**
	 * Scheduled payment receipt date 入金予定日.<p>
	 *
	 */
	public static final String $rcv_schd_dt = "rcv_schd_dt";
	/**
	 * Billing base date 請求起算日.<p>
	 *
	 */
	public static final String $bill_basis_dt = "bill_basis_dt";
	/**
	 * Credit managed BP cd. 与信管理先ＣＤ.<p>
	 *
	 */
	public static final String $cred_cd = "cred_cd";
	/**
	 * Billing customer cd. 請求先ＣＤ.<p>
	 *
	 */
	public static final String $bcst_cd = "bcst_cd";
	/**
	 * AR customer cd. 売掛先ＣＤ.<p>
	 *
	 */
	public static final String $acst_cd = "acst_cd";
	/**
	 * AR dept. cd. 債権部門ＣＤ.<p>
	 *
	 */
	public static final String $ar_dpt_cd = "ar_dpt_cd";
	/**
	 * Customer order No. 得意先注文ＮＯ.<p>
	 *
	 */
	public static final String $cst_po_no = "cst_po_no";
	/**
	 * Transaction currency cd. 取引通貨ＣＤ.<p>
	 *
	 */
	public static final String $trd_cur_cd = "trd_cur_cd";
	/**
	 * Base currency cd. 基準通貨ＣＤ.<p>
	 *
	 */
	public static final String $base_cur_cd = "base_cur_cd";
	/**
	 * Exchange rate cd. 為替レートＣＤ.<p>
	 *
	 */
	public static final String $xrate_cd = "xrate_cd";
	/**
	 * Exchange rate 為替レート.<p>
	 *
	 */
	public static final String $xrate = "xrate";
	/**
	 * Taxpaying currency cd. 納税通貨ＣＤ.<p>
	 *
	 */
	public static final String $ptax_cur_cd = "ptax_cur_cd";
	/**
	 * Taxpaying exchange rate 納税為替レート.<p>
	 *
	 */
	public static final String $ptax_xrate = "ptax_xrate";
	/**
	 * Transaction remarks 取引備考.<p>
	 *
	 */
	public static final String $trd_rmrks = "trd_rmrks";
	/**
	 * Sales order No. 受注ＮＯ.<p>
	 *
	 */
	public static final String $slo_no = "slo_no";
	/**
	 * Quotation No. 見積ＮＯ.<p>
	 *
	 */
	public static final String $qtn_no = "qtn_no";
	/**
	 * Quotation rev. number 見積改訂番号.<p>
	 *
	 */
	public static final String $qtn_rev = "qtn_rev";
	/**
	 * Delivery destination cd. 納品先ＣＤ.<p>
	 *
	 */
	public static final String $dlv_cd = "dlv_cd";
	/**
	 * Miscellaneous delivery destination 納品先諸口.<p>
	 *
	 */
	public static final String $dlv_sundry_flg = "dlv_sundry_flg";
	/**
	 * Delivery destination name 納品先名.<p>
	 *
	 */
	public static final String $dlv_nm = "dlv_nm";
	/**
	 * Zip code (Delivery destination) 納品先郵便番号.<p>
	 *
	 */
	public static final String $dlv_zip_cd = "dlv_zip_cd";
	/**
	 * Address 1 (Delivery destination) 納品先住所１.<p>
	 *
	 */
	public static final String $dlv_addr1 = "dlv_addr1";
	/**
	 * Address 2 (Delivery destination) 納品先住所２.<p>
	 *
	 */
	public static final String $dlv_addr2 = "dlv_addr2";
	/**
	 * Address 3 (Delivery destination) 納品先住所３.<p>
	 *
	 */
	public static final String $dlv_addr3 = "dlv_addr3";
	/**
	 * Address 4 (Delivery destination) 納品先住所４.<p>
	 *
	 */
	public static final String $dlv_addr4 = "dlv_addr4";
	/**
	 * Delivery destination dept. 納品先部署.<p>
	 *
	 */
	public static final String $dlv_cntct_dpt = "dlv_cntct_dpt";
	/**
	 * Delivery destination PIC 納品先担当者.<p>
	 *
	 */
	public static final String $dlv_cntct_psn = "dlv_cntct_psn";
	/**
	 * TEL (Delivery destination) 納品先ＴＥＬ.<p>
	 *
	 */
	public static final String $dlv_tel = "dlv_tel";
	/**
	 * FAX (Delivery destination) 納品先ＦＡＸ.<p>
	 *
	 */
	public static final String $dlv_fax = "dlv_fax";
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
	 * Receiving point cd. 配送先ＣＤ.<p>
	 *
	 */
	public static final String $tdlv_cd = "tdlv_cd";
	/**
	 * Receiving point name 配送先名.<p>
	 *
	 */
	public static final String $tdlv_nm = "tdlv_nm";
	/**
	 * Miscellaneous receiving point 配送先諸口.<p>
	 *
	 */
	public static final String $tdlv_sundry_flg = "tdlv_sundry_flg";
	/**
	 * Receiving point zip code 配送先郵便番号.<p>
	 *
	 */
	public static final String $tdlv_zip_cd = "tdlv_zip_cd";
	/**
	 * Receiving point address 1 配送先住所１.<p>
	 *
	 */
	public static final String $tdlv_addr1 = "tdlv_addr1";
	/**
	 * Receiving point address 2 配送先住所２.<p>
	 *
	 */
	public static final String $tdlv_addr2 = "tdlv_addr2";
	/**
	 * Receiving point address 3 配送先住所３.<p>
	 *
	 */
	public static final String $tdlv_addr3 = "tdlv_addr3";
	/**
	 * Receiving point address 4 配送先住所４.<p>
	 *
	 */
	public static final String $tdlv_addr4 = "tdlv_addr4";
	/**
	 * Receiving point TEL 配送先ＴＥＬ.<p>
	 *
	 */
	public static final String $tdlv_tel = "tdlv_tel";
	/**
	 * Receiving point FAX 配送先ＦＡＸ.<p>
	 *
	 */
	public static final String $tdlv_fax = "tdlv_fax";
	/**
	 * Receiving point dept. 配送先部署.<p>
	 *
	 */
	public static final String $tdlv_cntct_dpt = "tdlv_cntct_dpt";
	/**
	 * Receiving point PIC 配送先担当者.<p>
	 *
	 */
	public static final String $tdlv_cntct_psn = "tdlv_cntct_psn";
	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public static final String $itm_cd = "itm_cd";
	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public static final String $itm_sub1 = "itm_sub1";
	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public static final String $itm_sub2 = "itm_sub2";
	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public static final String $itm_sub3 = "itm_sub3";
	/**
	 * Item name 品名.<p>
	 *
	 */
	public static final String $itm_nm = "itm_nm";
	/**
	 * Item name for invoice インボイス表記用品名.<p>
	 *
	 */
	public static final String $iv_itm_nm = "iv_itm_nm";
	/**
	 * Place of origin cd. 原産地ＣＤ.<p>
	 *
	 */
	public static final String $cntry_org_cd = "cntry_org_cd";
	/**
	 * SEIBAN No. 1 手配ＮＯ１.<p>
	 *
	 */
	public static final String $sno1 = "sno1";
	/**
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public static final String $sno2 = "sno2";
	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public static final String $sno3 = "sno3";
	/**
	 * SEIBAN No. 4 手配ＮＯ４.<p>
	 *
	 */
	public static final String $sno4 = "sno4";
	/**
	 * Transaction unit cd. 取引単位ＣＤ.<p>
	 *
	 */
	public static final String $trd_unit_cd = "trd_unit_cd";
	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public static final String $trd_unit_qty = "trd_unit_qty";
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
	 * Unit price (Transaction currency) 取引通貨単価.<p>
	 *
	 */
	public static final String $trd_cur_upri = "trd_cur_upri";
	/**
	 * Unit cost 原価単価.<p>
	 *
	 */
	public static final String $cost_upri = "cost_upri";
	/**
	 * Total cost 原価金額.<p>
	 *
	 */
	public static final String $cost_amt = "cost_amt";
	/**
	 * Billing carry-over count 請求繰越回数.<p>
	 *
	 */
	public static final String $bill_crryovr_times = "bill_crryovr_times";
	/**
	 * Miscellaneous item 諸口品.<p>
	 *
	 */
	public static final String $sundry_itm_flg = "sundry_itm_flg";
	/**
	 * Item journal cd. 品目仕訳ＣＤ.<p>
	 *
	 */
	public static final String $itm_jnl_cd = "itm_jnl_cd";
	/**
	 * Customer order details No. 得意先注文明細ＮＯ.<p>
	 *
	 */
	public static final String $cst_po_d_no = "cst_po_d_no";
	/**
	 * Customer item cd. 得意先品目ＣＤ.<p>
	 *
	 */
	public static final String $cst_itm_cd = "cst_itm_cd";
	/**
	 * Customer item name 得意先品名.<p>
	 *
	 */
	public static final String $cst_itm_nm = "cst_itm_nm";
	/**
	 * Transaction details remarks 取引明細備考.<p>
	 *
	 */
	public static final String $trd_d_rmrks = "trd_d_rmrks";
	/**
	 * Reason cd. 理由ＣＤ.<p>
	 *
	 */
	public static final String $rsn_cd = "rsn_cd";
	/**
	 * Charged dept. cd. 負担部門ＣＤ.<p>
	 *
	 */
	public static final String $bd_dpt_cd = "bd_dpt_cd";
	/**
	 * Withholding tax rate 源泉税率.<p>
	 *
	 */
	public static final String $wtax_rate = "wtax_rate";
	/**
	 * Sales order details No. 受注明細ＮＯ.<p>
	 *
	 */
	public static final String $slo_d_no = "slo_d_no";
	/**
	 * Shipping schedule No. 出荷予定ＮＯ.<p>
	 *
	 */
	public static final String $ship_schd_no = "ship_schd_no";
	/**
	 * Sales schedule No. 売上予定ＮＯ.<p>
	 *
	 */
	public static final String $sls_schd_no = "sls_schd_no";
	/**
	 * Quotation details No. 見積明細ＮＯ.<p>
	 *
	 */
	public static final String $qtn_d_no = "qtn_d_no";
	/**
	 * Invoice details No. インボイス明細ＮＯ.<p>
	 *
	 */
	public static final String $iv_d_no = "iv_d_no";
	/**
	 * Discount amount (Transaction currency) 取引通貨値引額.<p>
	 *
	 */
	public static final String $trd_cur_dscnt_amt = "trd_cur_dscnt_amt";
	/**
	 * Discount reason cd. 値引理由ＣＤ.<p>
	 *
	 */
	public static final String $dscnt_rsn_cd = "dscnt_rsn_cd";
	/**
	 * Receiving point stopover type 配送先経由区分.<p>
	 *
	 */
	public static final String $via_dlv_typ = "via_dlv_typ";
	/**
	 * Temporary unit price 仮単価.<p>
	 *
	 */
	public static final String $interim_flg = "interim_flg";
	/**
	 * Tax inclusive 内税.<p>
	 *
	 */
	public static final String $inc_tax_flg = "inc_tax_flg";
	/**
	 * Tax cd. 税ＣＤ.<p>
	 *
	 */
	public static final String $tax_cd = "tax_cd";
	/**
	 * Tax rate 税率.<p>
	 *
	 */
	public static final String $tax_rate = "tax_rate";
	/**
	 * Tax type 税区分.<p>
	 *
	 */
	public static final String $tax_typ = "tax_typ";
	/**
	 * SEIBAN No. 1 management type 手配ＮＯ１管理区分.<p>
	 *
	 */
	public static final String $sno1_mng_typ = "sno1_mng_typ";
	/**
	 * SEIBAN No. 2 management type 手配ＮＯ２管理区分.<p>
	 *
	 */
	public static final String $sno2_mng_typ = "sno2_mng_typ";
	/**
	 * SEIBAN No. 3 management type 手配ＮＯ３管理区分.<p>
	 *
	 */
	public static final String $sno3_mng_typ = "sno3_mng_typ";
	/**
	 * SEIBAN No. 4 management type 手配ＮＯ４管理区分.<p>
	 *
	 */
	public static final String $sno4_mng_typ = "sno4_mng_typ";
	/**
	 * Sales result No. 売上実績ＮＯ.<p>
	 *
	 */
	public static final String $sls_act_no = "sls_act_no";
	/**
	 * Sales result sequence number 売上実績連番.<p>
	 *
	 */
	public static final String $sls_act_seq = "sls_act_seq";
	/**
	 * Sales result details No. 売上実績明細ＮＯ.<p>
	 *
	 */
	public static final String $sls_act_d_no = "sls_act_d_no";
	/**
	 * Sales result details sequence number 売上実績明細連番.<p>
	 *
	 */
	public static final String $sls_act_d_seq = "sls_act_d_seq";
	/**
	 * Sales date 売上日.<p>
	 *
	 */
	public static final String $sls_dt = "sls_dt";


	public static final MCMeta trd_cd_META = createCommonMeta($trd_cd, mcframe.commonMA.meta.MA_META.TRD_CD);
	public static final MCMeta trd_ptn_typ_META = createCommonMeta($trd_ptn_typ, mcframe.commonMA.meta.MA_META.TRD_PTN_TYP);
	public static final MCMeta ac_dt_META = createCommonMeta($ac_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta sls_dpt_cd_META = createCommonMeta($sls_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta wg_cd_META = createCommonMeta($wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta sls_usr_cd_META = createCommonMeta($sls_usr_cd, mcframe.commonMA.meta.MA_META.USR_CD);
	public static final MCMeta eta_dt_META = createCommonMeta($eta_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta cst_cd_META = createCommonMeta($cst_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta iv_no_META = createCommonMeta($iv_no, mcframe.commonMA.meta.MA_META.IV_NO);
	public static final MCMeta rcpt_iv_mng_no_META = createCommonMeta($rcpt_iv_mng_no, mcframe.commonMA.meta.MA_META.RCPT_IV_MNG_NO);
	public static final MCMeta rcpt_iv_no_META = createCommonMeta($rcpt_iv_no, mcframe.commonMA.meta.MA_META.IV_NO);
	public static final MCMeta tterm_cd1_META = createCommonMeta($tterm_cd1, mcframe.commonMA.meta.MA_META.TTERM_CD);
	public static final MCMeta tterm_rmrks1_META = createCommonMeta($tterm_rmrks1, mcframe.commonMS.meta.MS_META.TTERM_RMRKS1);
	public static final MCMeta tterm_cd2_META = createCommonMeta($tterm_cd2, mcframe.commonMA.meta.MA_META.TTERM_CD);
	public static final MCMeta tterm_rmrks2_META = createCommonMeta($tterm_rmrks2, mcframe.commonMS.meta.MS_META.TTERM_RMRKS2);
	public static final MCMeta tterm_cd3_META = createCommonMeta($tterm_cd3, mcframe.commonMA.meta.MA_META.TTERM_CD);
	public static final MCMeta tterm_rmrks3_META = createCommonMeta($tterm_rmrks3, mcframe.commonMS.meta.MS_META.TTERM_RMRKS3);
	public static final MCMeta lc_no_META = createCommonMeta($lc_no, mcframe.commonMA.meta.MA_META.LC_NO);
	public static final MCMeta lc_dt_META = createCommonMeta($lc_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta lc_rmrks_META = createCommonMeta($lc_rmrks, mcframe.commonMS.meta.MS_META.LC_RMRKS);
	public static final MCMeta rcv_schd_dt_META = createCommonMeta($rcv_schd_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta bill_basis_dt_META = createCommonMeta($bill_basis_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta cred_cd_META = createCommonMeta($cred_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta bcst_cd_META = createCommonMeta($bcst_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta acst_cd_META = createCommonMeta($acst_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta ar_dpt_cd_META = createCommonMeta($ar_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta cst_po_no_META = createCommonMeta($cst_po_no, mcframe.commonMA.meta.MA_META.CST_PO_NO);
	public static final MCMeta trd_cur_cd_META = createCommonMeta($trd_cur_cd, mcframe.commonMA.meta.MA_META.CUR_CD);
	public static final MCMeta base_cur_cd_META = createCommonMeta($base_cur_cd, mcframe.commonMA.meta.MA_META.CUR_CD);
	public static final MCMeta xrate_cd_META = createCommonMeta($xrate_cd, mcframe.commonMA.meta.MA_META.XRATE_CD);
	public static final MCMeta xrate_META = createCommonMeta($xrate, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta ptax_cur_cd_META = createCommonMeta($ptax_cur_cd, mcframe.commonMA.meta.MA_META.CUR_CD);
	public static final MCMeta ptax_xrate_META = createCommonMeta($ptax_xrate, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta trd_rmrks_META = createCommonMeta($trd_rmrks, mcframe.commonMA.meta.MA_META.TRD_RMRKS);
	public static final MCMeta slo_no_META = createCommonMeta($slo_no, mcframe.commonMA.meta.MA_META.SLO_NO);
	public static final MCMeta qtn_no_META = createCommonMeta($qtn_no, mcframe.commonMA.meta.MA_META.QTN_NO);
	public static final MCMeta qtn_rev_META = createCommonMeta($qtn_rev, mcframe.commonMA.meta.MA_META.SLIP_REV);
	public static final MCMeta dlv_cd_META = createCommonMeta($dlv_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta dlv_sundry_flg_META = createCommonMeta($dlv_sundry_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta dlv_nm_META = createCommonMeta($dlv_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta dlv_zip_cd_META = createCommonMeta($dlv_zip_cd, mcframe.commonMA.meta.MA_META.ZIP_CD);
	public static final MCMeta dlv_addr1_META = createCommonMeta($dlv_addr1, mcframe.commonMA.meta.MA_META.ADDR);
	public static final MCMeta dlv_addr2_META = createCommonMeta($dlv_addr2, mcframe.commonMA.meta.MA_META.ADDR);
	public static final MCMeta dlv_addr3_META = createCommonMeta($dlv_addr3, mcframe.commonMA.meta.MA_META.ADDR);
	public static final MCMeta dlv_addr4_META = createCommonMeta($dlv_addr4, mcframe.commonMA.meta.MA_META.ADDR);
	public static final MCMeta dlv_cntct_dpt_META = createCommonMeta($dlv_cntct_dpt, mcframe.commonMA.meta.MA_META.BP_CNTCT_DPT);
	public static final MCMeta dlv_cntct_psn_META = createCommonMeta($dlv_cntct_psn, mcframe.commonMA.meta.MA_META.BP_CNTCT_PSN);
	public static final MCMeta dlv_tel_META = createCommonMeta($dlv_tel, mcframe.commonMA.meta.MA_META.TEL);
	public static final MCMeta dlv_fax_META = createCommonMeta($dlv_fax, mcframe.commonMA.meta.MA_META.TEL);
	public static final MCMeta dest_cd1_META = createCommonMeta($dest_cd1, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta dest_cd2_META = createCommonMeta($dest_cd2, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta dest_cd3_META = createCommonMeta($dest_cd3, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta tdlv_cd_META = createCommonMeta($tdlv_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta tdlv_nm_META = createCommonMeta($tdlv_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta tdlv_sundry_flg_META = createCommonMeta($tdlv_sundry_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta tdlv_zip_cd_META = createCommonMeta($tdlv_zip_cd, mcframe.commonMA.meta.MA_META.ZIP_CD);
	public static final MCMeta tdlv_addr1_META = createCommonMeta($tdlv_addr1, mcframe.commonMA.meta.MA_META.ADDR);
	public static final MCMeta tdlv_addr2_META = createCommonMeta($tdlv_addr2, mcframe.commonMA.meta.MA_META.ADDR);
	public static final MCMeta tdlv_addr3_META = createCommonMeta($tdlv_addr3, mcframe.commonMA.meta.MA_META.ADDR);
	public static final MCMeta tdlv_addr4_META = createCommonMeta($tdlv_addr4, mcframe.commonMA.meta.MA_META.ADDR);
	public static final MCMeta tdlv_tel_META = createCommonMeta($tdlv_tel, mcframe.commonMA.meta.MA_META.TEL);
	public static final MCMeta tdlv_fax_META = createCommonMeta($tdlv_fax, mcframe.commonMA.meta.MA_META.TEL);
	public static final MCMeta tdlv_cntct_dpt_META = createCommonMeta($tdlv_cntct_dpt, mcframe.commonMA.meta.MA_META.BP_CNTCT_DPT);
	public static final MCMeta tdlv_cntct_psn_META = createCommonMeta($tdlv_cntct_psn, mcframe.commonMA.meta.MA_META.BP_CNTCT_PSN);
	public static final MCMeta itm_cd_META = createCommonMeta($itm_cd, mcframe.commonMA.meta.MA_META.ITM_CD);
	public static final MCMeta itm_sub1_META = createCommonMeta($itm_sub1, mcframe.commonMA.meta.MA_META.ITM_SUB1);
	public static final MCMeta itm_sub2_META = createCommonMeta($itm_sub2, mcframe.commonMA.meta.MA_META.ITM_SUB2);
	public static final MCMeta itm_sub3_META = createCommonMeta($itm_sub3, mcframe.commonMA.meta.MA_META.ITM_SUB3);
	public static final MCMeta itm_nm_META = createCommonMeta($itm_nm, mcframe.commonMA.meta.MA_META.ITM_NM);
	public static final MCMeta iv_itm_nm_META = createCommonMeta($iv_itm_nm, mcframe.commonMA.meta.MA_META.ITM_NM);
	public static final MCMeta cntry_org_cd_META = createCommonMeta($cntry_org_cd, mcframe.commonMA.meta.MA_META.CNTRY_CD);
	public static final MCMeta sno1_META = createCommonMeta($sno1, mcframe.commonMA.meta.MA_META.SNO1);
	public static final MCMeta sno2_META = createCommonMeta($sno2, mcframe.commonMA.meta.MA_META.SNO2);
	public static final MCMeta sno3_META = createCommonMeta($sno3, mcframe.commonMA.meta.MA_META.SNO3);
	public static final MCMeta sno4_META = createCommonMeta($sno4, mcframe.commonMA.meta.MA_META.SNO4);
	public static final MCMeta trd_unit_cd_META = createCommonMeta($trd_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta trd_unit_qty_META = createCommonMeta($trd_unit_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta base_unit_cd_META = createCommonMeta($base_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta base_unit_qty_META = createCommonMeta($base_unit_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta trd_cur_upri_META = createCommonMeta($trd_cur_upri, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta cost_upri_META = createCommonMeta($cost_upri, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta cost_amt_META = createCommonMeta($cost_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta bill_crryovr_times_META = createCommonMeta($bill_crryovr_times, mcframe.commonMA.meta.MA_META.CRRYOVR_TIMES);
	public static final MCMeta sundry_itm_flg_META = createCommonMeta($sundry_itm_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta itm_jnl_cd_META = createCommonMeta($itm_jnl_cd, mcframe.commonMA.meta.MA_META.ITM_JNL_CD);
	public static final MCMeta cst_po_d_no_META = createCommonMeta($cst_po_d_no, mcframe.commonMA.meta.MA_META.CST_PO_D_NO);
	public static final MCMeta cst_itm_cd_META = createCommonMeta($cst_itm_cd, mcframe.commonMA.meta.MA_META.BP_ITM_CD);
	public static final MCMeta cst_itm_nm_META = createCommonMeta($cst_itm_nm, mcframe.commonMA.meta.MA_META.BP_ITM_NM);
	public static final MCMeta trd_d_rmrks_META = createCommonMeta($trd_d_rmrks, mcframe.commonMA.meta.MA_META.TRD_D_RMRKS);
	public static final MCMeta rsn_cd_META = createCommonMeta($rsn_cd, mcframe.commonMA.meta.MA_META.BIZ_RSN_CD);
	public static final MCMeta bd_dpt_cd_META = createCommonMeta($bd_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta wtax_rate_META = createCommonMeta($wtax_rate, mcframe.commonMA.meta.MA_META.TAX_RATE);
	public static final MCMeta slo_d_no_META = createCommonMeta($slo_d_no, mcframe.commonMA.meta.MA_META.SLO_D_NO);
	public static final MCMeta ship_schd_no_META = createCommonMeta($ship_schd_no, mcframe.commonMA.meta.MA_META.SHIP_SCHD_NO);
	public static final MCMeta sls_schd_no_META = createCommonMeta($sls_schd_no, mcframe.commonMA.meta.MA_META.SLS_SCHD_NO);
	public static final MCMeta qtn_d_no_META = createCommonMeta($qtn_d_no, mcframe.commonMA.meta.MA_META.QTN_D_NO);
	public static final MCMeta iv_d_no_META = createCommonMeta($iv_d_no, mcframe.commonMA.meta.MA_META.IV_D_NO);
	public static final MCMeta trd_cur_dscnt_amt_META = createCommonMeta($trd_cur_dscnt_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta dscnt_rsn_cd_META = createCommonMeta($dscnt_rsn_cd, mcframe.commonMA.meta.MA_META.BIZ_RSN_CD);
	public static final MCMeta via_dlv_typ_META = createCommonMeta($via_dlv_typ, mcframe.commonMA.meta.MA_META.VIA_DLV_TYP);
	public static final MCMeta interim_flg_META = createCommonMeta($interim_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta inc_tax_flg_META = createCommonMeta($inc_tax_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta tax_cd_META = createCommonMeta($tax_cd, mcframe.commonMA.meta.MA_META.TAX_CD);
	public static final MCMeta tax_rate_META = createCommonMeta($tax_rate, mcframe.commonMA.meta.MA_META.TAX_RATE);
	public static final MCMeta tax_typ_META = createCommonMeta($tax_typ, mcframe.commonMA.meta.MA_META.TAX_TYP);
	public static final MCMeta sno1_mng_typ_META = createCommonMeta($sno1_mng_typ, mcframe.commonMA.meta.MA_META.SNO_MNG_TYP);
	public static final MCMeta sno2_mng_typ_META = createCommonMeta($sno2_mng_typ, mcframe.commonMA.meta.MA_META.SNO_MNG_TYP);
	public static final MCMeta sno3_mng_typ_META = createCommonMeta($sno3_mng_typ, mcframe.commonMA.meta.MA_META.SNO_MNG_TYP);
	public static final MCMeta sno4_mng_typ_META = createCommonMeta($sno4_mng_typ, mcframe.commonMA.meta.MA_META.SNO_MNG_TYP);
	public static final MCMeta sls_act_no_META = createCommonMeta($sls_act_no, mcframe.commonMA.meta.MA_META.SLS_ACT_NO);
	public static final MCMeta sls_act_seq_META = createCommonMeta($sls_act_seq, mcframe.commonMA.meta.MA_META.SLIP_SEQ);
	public static final MCMeta sls_act_d_no_META = createCommonMeta($sls_act_d_no, mcframe.commonMA.meta.MA_META.SLS_ACT_D_NO);
	public static final MCMeta sls_act_d_seq_META = createCommonMeta($sls_act_d_seq, mcframe.commonMA.meta.MA_META.SLIP_SEQ);
	public static final MCMeta sls_dt_META = createCommonMeta($sls_dt, mcframe.commonMA.meta.MA_META.DT);

	protected static final ConstMetaList<SlsAct_Upd02_IvLR> constMetas = new ConstMetaList<SlsAct_Upd02_IvLR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			trd_cd_META,
			trd_ptn_typ_META,
			ac_dt_META,
			sls_dpt_cd_META,
			wg_cd_META,
			sls_usr_cd_META,
			eta_dt_META,
			cst_cd_META,
			iv_no_META,
			rcpt_iv_mng_no_META,
			rcpt_iv_no_META,
			tterm_cd1_META,
			tterm_rmrks1_META,
			tterm_cd2_META,
			tterm_rmrks2_META,
			tterm_cd3_META,
			tterm_rmrks3_META,
			lc_no_META,
			lc_dt_META,
			lc_rmrks_META,
			rcv_schd_dt_META,
			bill_basis_dt_META,
			cred_cd_META,
			bcst_cd_META,
			acst_cd_META,
			ar_dpt_cd_META,
			cst_po_no_META,
			trd_cur_cd_META,
			base_cur_cd_META,
			xrate_cd_META,
			xrate_META,
			ptax_cur_cd_META,
			ptax_xrate_META,
			trd_rmrks_META,
			slo_no_META,
			qtn_no_META,
			qtn_rev_META,
			dlv_cd_META,
			dlv_sundry_flg_META,
			dlv_nm_META,
			dlv_zip_cd_META,
			dlv_addr1_META,
			dlv_addr2_META,
			dlv_addr3_META,
			dlv_addr4_META,
			dlv_cntct_dpt_META,
			dlv_cntct_psn_META,
			dlv_tel_META,
			dlv_fax_META,
			dest_cd1_META,
			dest_cd2_META,
			dest_cd3_META,
			tdlv_cd_META,
			tdlv_nm_META,
			tdlv_sundry_flg_META,
			tdlv_zip_cd_META,
			tdlv_addr1_META,
			tdlv_addr2_META,
			tdlv_addr3_META,
			tdlv_addr4_META,
			tdlv_tel_META,
			tdlv_fax_META,
			tdlv_cntct_dpt_META,
			tdlv_cntct_psn_META,
			itm_cd_META,
			itm_sub1_META,
			itm_sub2_META,
			itm_sub3_META,
			itm_nm_META,
			iv_itm_nm_META,
			cntry_org_cd_META,
			sno1_META,
			sno2_META,
			sno3_META,
			sno4_META,
			trd_unit_cd_META,
			trd_unit_qty_META,
			base_unit_cd_META,
			base_unit_qty_META,
			trd_cur_upri_META,
			cost_upri_META,
			cost_amt_META,
			bill_crryovr_times_META,
			sundry_itm_flg_META,
			itm_jnl_cd_META,
			cst_po_d_no_META,
			cst_itm_cd_META,
			cst_itm_nm_META,
			trd_d_rmrks_META,
			rsn_cd_META,
			bd_dpt_cd_META,
			wtax_rate_META,
			slo_d_no_META,
			ship_schd_no_META,
			sls_schd_no_META,
			qtn_d_no_META,
			iv_d_no_META,
			trd_cur_dscnt_amt_META,
			dscnt_rsn_cd_META,
			via_dlv_typ_META,
			interim_flg_META,
			inc_tax_flg_META,
			tax_cd_META,
			tax_rate_META,
			tax_typ_META,
			sno1_mng_typ_META,
			sno2_mng_typ_META,
			sno3_mng_typ_META,
			sno4_mng_typ_META,
			sls_act_no_META,
			sls_act_seq_META,
			sls_act_d_no_META,
			sls_act_d_seq_META,
			sls_dt_META
		},
		new String[][]{
			{
			},
			{
			}
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
	protected SlsAct_Upd02_IvLR_MC_A(ConstMetaList<? extends SlsAct_Upd02_IvLR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public SlsAct_Upd02_IvLR clone() {
		return (SlsAct_Upd02_IvLR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public SlsAct_Upd02_IvLR createInstance() {
		return (SlsAct_Upd02_IvLR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public SlsAct_Upd02_IvLR getValues(String... names) {
		return (SlsAct_Upd02_IvLR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * Transaction cd. 取引ＣＤ.<p>
	 *
	 */
	public String trd_cd() {
		return getConstString(offset + 0, $trd_cd);
	}

	/**
	 * Transaction cd. 取引ＣＤ.<p>
	 *
	 */
	public void trd_cd(String value) {
		setConstString(offset + 0, $trd_cd, value);
	}


	/**
	 * Transaction pattern type 取引パタン区分.<p>
	 *
	 */
	public String trd_ptn_typ() {
		return getConstString(offset + 1, $trd_ptn_typ);
	}

	/**
	 * Transaction pattern type 取引パタン区分.<p>
	 *
	 */
	public void trd_ptn_typ(String value) {
		setConstString(offset + 1, $trd_ptn_typ, value);
	}


	/**
	 * Recording date 計上日.<p>
	 *
	 */
	public MCDate ac_dt() {
		return getConstDate(offset + 2, $ac_dt);
	}

	/**
	 * Recording date 計上日.<p>
	 *
	 */
	public void ac_dt(MCDate value) {
		setConstDate(offset + 2, $ac_dt, value);
	}


	/**
	 * Sales dept. cd. 売上部門ＣＤ.<p>
	 *
	 */
	public String sls_dpt_cd() {
		return getConstString(offset + 3, $sls_dpt_cd);
	}

	/**
	 * Sales dept. cd. 売上部門ＣＤ.<p>
	 *
	 */
	public void sls_dpt_cd(String value) {
		setConstString(offset + 3, $sls_dpt_cd, value);
	}


	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public String wg_cd() {
		return getConstString(offset + 4, $wg_cd);
	}

	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public void wg_cd(String value) {
		setConstString(offset + 4, $wg_cd, value);
	}


	/**
	 * Sales PIC cd. 売上担当者ＣＤ.<p>
	 *
	 */
	public String sls_usr_cd() {
		return getConstString(offset + 5, $sls_usr_cd);
	}

	/**
	 * Sales PIC cd. 売上担当者ＣＤ.<p>
	 *
	 */
	public void sls_usr_cd(String value) {
		setConstString(offset + 5, $sls_usr_cd, value);
	}


	/**
	 * Estimated date of unloading 船卸予定日.<p>
	 *
	 */
	public MCDate eta_dt() {
		return getConstDate(offset + 6, $eta_dt);
	}

	/**
	 * Estimated date of unloading 船卸予定日.<p>
	 *
	 */
	public void eta_dt(MCDate value) {
		setConstDate(offset + 6, $eta_dt, value);
	}


	/**
	 * Customer cd. 得意先ＣＤ.<p>
	 *
	 */
	public String cst_cd() {
		return getConstString(offset + 7, $cst_cd);
	}

	/**
	 * Customer cd. 得意先ＣＤ.<p>
	 *
	 */
	public void cst_cd(String value) {
		setConstString(offset + 7, $cst_cd, value);
	}


	/**
	 * Invoice No. インボイスＮＯ.<p>
	 *
	 */
	public String iv_no() {
		return getConstString(offset + 8, $iv_no);
	}

	/**
	 * Invoice No. インボイスＮＯ.<p>
	 *
	 */
	public void iv_no(String value) {
		setConstString(offset + 8, $iv_no, value);
	}


	/**
	 * Purchase invoice management No. 受領インボイス管理ＮＯ.<p>
	 *
	 */
	public String rcpt_iv_mng_no() {
		return getConstString(offset + 9, $rcpt_iv_mng_no);
	}

	/**
	 * Purchase invoice management No. 受領インボイス管理ＮＯ.<p>
	 *
	 */
	public void rcpt_iv_mng_no(String value) {
		setConstString(offset + 9, $rcpt_iv_mng_no, value);
	}


	/**
	 * Purchase invoice No. 受領インボイスＮＯ.<p>
	 *
	 */
	public String rcpt_iv_no() {
		return getConstString(offset + 10, $rcpt_iv_no);
	}

	/**
	 * Purchase invoice No. 受領インボイスＮＯ.<p>
	 *
	 */
	public void rcpt_iv_no(String value) {
		setConstString(offset + 10, $rcpt_iv_no, value);
	}


	/**
	 * Transaction terms cd. 1 取引条件ＣＤ１.<p>
	 *
	 */
	public String tterm_cd1() {
		return getConstString(offset + 11, $tterm_cd1);
	}

	/**
	 * Transaction terms cd. 1 取引条件ＣＤ１.<p>
	 *
	 */
	public void tterm_cd1(String value) {
		setConstString(offset + 11, $tterm_cd1, value);
	}


	/**
	 * Transaction terms remarks 1 取引条件備考１.<p>
	 *
	 */
	public String tterm_rmrks1() {
		return getConstString(offset + 12, $tterm_rmrks1);
	}

	/**
	 * Transaction terms remarks 1 取引条件備考１.<p>
	 *
	 */
	public void tterm_rmrks1(String value) {
		setConstString(offset + 12, $tterm_rmrks1, value);
	}


	/**
	 * Transaction terms cd. 2 取引条件ＣＤ２.<p>
	 *
	 */
	public String tterm_cd2() {
		return getConstString(offset + 13, $tterm_cd2);
	}

	/**
	 * Transaction terms cd. 2 取引条件ＣＤ２.<p>
	 *
	 */
	public void tterm_cd2(String value) {
		setConstString(offset + 13, $tterm_cd2, value);
	}


	/**
	 * Transaction terms remarks 2 取引条件備考２.<p>
	 *
	 */
	public String tterm_rmrks2() {
		return getConstString(offset + 14, $tterm_rmrks2);
	}

	/**
	 * Transaction terms remarks 2 取引条件備考２.<p>
	 *
	 */
	public void tterm_rmrks2(String value) {
		setConstString(offset + 14, $tterm_rmrks2, value);
	}


	/**
	 * Transaction terms cd. 3 取引条件ＣＤ３.<p>
	 *
	 */
	public String tterm_cd3() {
		return getConstString(offset + 15, $tterm_cd3);
	}

	/**
	 * Transaction terms cd. 3 取引条件ＣＤ３.<p>
	 *
	 */
	public void tterm_cd3(String value) {
		setConstString(offset + 15, $tterm_cd3, value);
	}


	/**
	 * Transaction terms remarks 3 取引条件備考３.<p>
	 *
	 */
	public String tterm_rmrks3() {
		return getConstString(offset + 16, $tterm_rmrks3);
	}

	/**
	 * Transaction terms remarks 3 取引条件備考３.<p>
	 *
	 */
	public void tterm_rmrks3(String value) {
		setConstString(offset + 16, $tterm_rmrks3, value);
	}


	/**
	 * L/C No. Ｌ／ＣＮＯ.<p>
	 *
	 */
	public String lc_no() {
		return getConstString(offset + 17, $lc_no);
	}

	/**
	 * L/C No. Ｌ／ＣＮＯ.<p>
	 *
	 */
	public void lc_no(String value) {
		setConstString(offset + 17, $lc_no, value);
	}


	/**
	 * L/C Date Ｌ／Ｃ日付.<p>
	 *
	 */
	public MCDate lc_dt() {
		return getConstDate(offset + 18, $lc_dt);
	}

	/**
	 * L/C Date Ｌ／Ｃ日付.<p>
	 *
	 */
	public void lc_dt(MCDate value) {
		setConstDate(offset + 18, $lc_dt, value);
	}


	/**
	 * L/C remarks Ｌ／Ｃ備考.<p>
	 *
	 */
	public String lc_rmrks() {
		return getConstString(offset + 19, $lc_rmrks);
	}

	/**
	 * L/C remarks Ｌ／Ｃ備考.<p>
	 *
	 */
	public void lc_rmrks(String value) {
		setConstString(offset + 19, $lc_rmrks, value);
	}


	/**
	 * Scheduled payment receipt date 入金予定日.<p>
	 *
	 */
	public MCDate rcv_schd_dt() {
		return getConstDate(offset + 20, $rcv_schd_dt);
	}

	/**
	 * Scheduled payment receipt date 入金予定日.<p>
	 *
	 */
	public void rcv_schd_dt(MCDate value) {
		setConstDate(offset + 20, $rcv_schd_dt, value);
	}


	/**
	 * Billing base date 請求起算日.<p>
	 *
	 */
	public MCDate bill_basis_dt() {
		return getConstDate(offset + 21, $bill_basis_dt);
	}

	/**
	 * Billing base date 請求起算日.<p>
	 *
	 */
	public void bill_basis_dt(MCDate value) {
		setConstDate(offset + 21, $bill_basis_dt, value);
	}


	/**
	 * Credit managed BP cd. 与信管理先ＣＤ.<p>
	 *
	 */
	public String cred_cd() {
		return getConstString(offset + 22, $cred_cd);
	}

	/**
	 * Credit managed BP cd. 与信管理先ＣＤ.<p>
	 *
	 */
	public void cred_cd(String value) {
		setConstString(offset + 22, $cred_cd, value);
	}


	/**
	 * Billing customer cd. 請求先ＣＤ.<p>
	 *
	 */
	public String bcst_cd() {
		return getConstString(offset + 23, $bcst_cd);
	}

	/**
	 * Billing customer cd. 請求先ＣＤ.<p>
	 *
	 */
	public void bcst_cd(String value) {
		setConstString(offset + 23, $bcst_cd, value);
	}


	/**
	 * AR customer cd. 売掛先ＣＤ.<p>
	 *
	 */
	public String acst_cd() {
		return getConstString(offset + 24, $acst_cd);
	}

	/**
	 * AR customer cd. 売掛先ＣＤ.<p>
	 *
	 */
	public void acst_cd(String value) {
		setConstString(offset + 24, $acst_cd, value);
	}


	/**
	 * AR dept. cd. 債権部門ＣＤ.<p>
	 *
	 */
	public String ar_dpt_cd() {
		return getConstString(offset + 25, $ar_dpt_cd);
	}

	/**
	 * AR dept. cd. 債権部門ＣＤ.<p>
	 *
	 */
	public void ar_dpt_cd(String value) {
		setConstString(offset + 25, $ar_dpt_cd, value);
	}


	/**
	 * Customer order No. 得意先注文ＮＯ.<p>
	 *
	 */
	public String cst_po_no() {
		return getConstString(offset + 26, $cst_po_no);
	}

	/**
	 * Customer order No. 得意先注文ＮＯ.<p>
	 *
	 */
	public void cst_po_no(String value) {
		setConstString(offset + 26, $cst_po_no, value);
	}


	/**
	 * Transaction currency cd. 取引通貨ＣＤ.<p>
	 *
	 */
	public String trd_cur_cd() {
		return getConstString(offset + 27, $trd_cur_cd);
	}

	/**
	 * Transaction currency cd. 取引通貨ＣＤ.<p>
	 *
	 */
	public void trd_cur_cd(String value) {
		setConstString(offset + 27, $trd_cur_cd, value);
	}


	/**
	 * Base currency cd. 基準通貨ＣＤ.<p>
	 *
	 */
	public String base_cur_cd() {
		return getConstString(offset + 28, $base_cur_cd);
	}

	/**
	 * Base currency cd. 基準通貨ＣＤ.<p>
	 *
	 */
	public void base_cur_cd(String value) {
		setConstString(offset + 28, $base_cur_cd, value);
	}


	/**
	 * Exchange rate cd. 為替レートＣＤ.<p>
	 *
	 */
	public String xrate_cd() {
		return getConstString(offset + 29, $xrate_cd);
	}

	/**
	 * Exchange rate cd. 為替レートＣＤ.<p>
	 *
	 */
	public void xrate_cd(String value) {
		setConstString(offset + 29, $xrate_cd, value);
	}


	/**
	 * Exchange rate 為替レート.<p>
	 *
	 */
	public MCNumber xrate() {
		return getConstNumber(offset + 30, $xrate);
	}

	/**
	 * Exchange rate 為替レート.<p>
	 *
	 */
	public void xrate(MCNumber value) {
		setConstNumber(offset + 30, $xrate, value);
	}

	/**
	 * Exchange rate 為替レート.<p>
	 *
	 */
	public void xrate(int value) {
		setConstNumber(offset + 30, $xrate, value);
	}

	/**
	 * Exchange rate 為替レート.<p>
	 *
	 */
	public void xrate(long value) {
		setConstNumber(offset + 30, $xrate, value);
	}

	/**
	 * Exchange rate 為替レート.<p>
	 *
	 */
	public void xrate(float value) {
		setConstNumber(offset + 30, $xrate, value);
	}

	/**
	 * Exchange rate 為替レート.<p>
	 *
	 */
	public void xrate(double value) {
		setConstNumber(offset + 30, $xrate, value);
	}


	/**
	 * Taxpaying currency cd. 納税通貨ＣＤ.<p>
	 *
	 */
	public String ptax_cur_cd() {
		return getConstString(offset + 31, $ptax_cur_cd);
	}

	/**
	 * Taxpaying currency cd. 納税通貨ＣＤ.<p>
	 *
	 */
	public void ptax_cur_cd(String value) {
		setConstString(offset + 31, $ptax_cur_cd, value);
	}


	/**
	 * Taxpaying exchange rate 納税為替レート.<p>
	 *
	 */
	public MCNumber ptax_xrate() {
		return getConstNumber(offset + 32, $ptax_xrate);
	}

	/**
	 * Taxpaying exchange rate 納税為替レート.<p>
	 *
	 */
	public void ptax_xrate(MCNumber value) {
		setConstNumber(offset + 32, $ptax_xrate, value);
	}

	/**
	 * Taxpaying exchange rate 納税為替レート.<p>
	 *
	 */
	public void ptax_xrate(int value) {
		setConstNumber(offset + 32, $ptax_xrate, value);
	}

	/**
	 * Taxpaying exchange rate 納税為替レート.<p>
	 *
	 */
	public void ptax_xrate(long value) {
		setConstNumber(offset + 32, $ptax_xrate, value);
	}

	/**
	 * Taxpaying exchange rate 納税為替レート.<p>
	 *
	 */
	public void ptax_xrate(float value) {
		setConstNumber(offset + 32, $ptax_xrate, value);
	}

	/**
	 * Taxpaying exchange rate 納税為替レート.<p>
	 *
	 */
	public void ptax_xrate(double value) {
		setConstNumber(offset + 32, $ptax_xrate, value);
	}


	/**
	 * Transaction remarks 取引備考.<p>
	 *
	 */
	public String trd_rmrks() {
		return getConstString(offset + 33, $trd_rmrks);
	}

	/**
	 * Transaction remarks 取引備考.<p>
	 *
	 */
	public void trd_rmrks(String value) {
		setConstString(offset + 33, $trd_rmrks, value);
	}


	/**
	 * Sales order No. 受注ＮＯ.<p>
	 *
	 */
	public String slo_no() {
		return getConstString(offset + 34, $slo_no);
	}

	/**
	 * Sales order No. 受注ＮＯ.<p>
	 *
	 */
	public void slo_no(String value) {
		setConstString(offset + 34, $slo_no, value);
	}


	/**
	 * Quotation No. 見積ＮＯ.<p>
	 *
	 */
	public String qtn_no() {
		return getConstString(offset + 35, $qtn_no);
	}

	/**
	 * Quotation No. 見積ＮＯ.<p>
	 *
	 */
	public void qtn_no(String value) {
		setConstString(offset + 35, $qtn_no, value);
	}


	/**
	 * Quotation rev. number 見積改訂番号.<p>
	 *
	 */
	public MCNumber qtn_rev() {
		return getConstNumber(offset + 36, $qtn_rev);
	}

	/**
	 * Quotation rev. number 見積改訂番号.<p>
	 *
	 */
	public void qtn_rev(MCNumber value) {
		setConstNumber(offset + 36, $qtn_rev, value);
	}

	/**
	 * Quotation rev. number 見積改訂番号.<p>
	 *
	 */
	public void qtn_rev(int value) {
		setConstNumber(offset + 36, $qtn_rev, value);
	}

	/**
	 * Quotation rev. number 見積改訂番号.<p>
	 *
	 */
	public void qtn_rev(long value) {
		setConstNumber(offset + 36, $qtn_rev, value);
	}

	/**
	 * Quotation rev. number 見積改訂番号.<p>
	 *
	 */
	public void qtn_rev(float value) {
		setConstNumber(offset + 36, $qtn_rev, value);
	}

	/**
	 * Quotation rev. number 見積改訂番号.<p>
	 *
	 */
	public void qtn_rev(double value) {
		setConstNumber(offset + 36, $qtn_rev, value);
	}


	/**
	 * Delivery destination cd. 納品先ＣＤ.<p>
	 *
	 */
	public String dlv_cd() {
		return getConstString(offset + 37, $dlv_cd);
	}

	/**
	 * Delivery destination cd. 納品先ＣＤ.<p>
	 *
	 */
	public void dlv_cd(String value) {
		setConstString(offset + 37, $dlv_cd, value);
	}


	/**
	 * Miscellaneous delivery destination 納品先諸口.<p>
	 *
	 */
	public boolean dlv_sundry_flg() {
		return getConstBoolean(offset + 38, $dlv_sundry_flg);
	}

	/**
	 * Miscellaneous delivery destination 納品先諸口.<p>
	 *
	 */
	public void dlv_sundry_flg(boolean value) {
		setConstBoolean(offset + 38, $dlv_sundry_flg, value);
	}


	/**
	 * Delivery destination name 納品先名.<p>
	 *
	 */
	public String dlv_nm() {
		return getConstString(offset + 39, $dlv_nm);
	}

	/**
	 * Delivery destination name 納品先名.<p>
	 *
	 */
	public void dlv_nm(String value) {
		setConstString(offset + 39, $dlv_nm, value);
	}


	/**
	 * Zip code (Delivery destination) 納品先郵便番号.<p>
	 *
	 */
	public String dlv_zip_cd() {
		return getConstString(offset + 40, $dlv_zip_cd);
	}

	/**
	 * Zip code (Delivery destination) 納品先郵便番号.<p>
	 *
	 */
	public void dlv_zip_cd(String value) {
		setConstString(offset + 40, $dlv_zip_cd, value);
	}


	/**
	 * Address 1 (Delivery destination) 納品先住所１.<p>
	 *
	 */
	public String dlv_addr1() {
		return getConstString(offset + 41, $dlv_addr1);
	}

	/**
	 * Address 1 (Delivery destination) 納品先住所１.<p>
	 *
	 */
	public void dlv_addr1(String value) {
		setConstString(offset + 41, $dlv_addr1, value);
	}


	/**
	 * Address 2 (Delivery destination) 納品先住所２.<p>
	 *
	 */
	public String dlv_addr2() {
		return getConstString(offset + 42, $dlv_addr2);
	}

	/**
	 * Address 2 (Delivery destination) 納品先住所２.<p>
	 *
	 */
	public void dlv_addr2(String value) {
		setConstString(offset + 42, $dlv_addr2, value);
	}


	/**
	 * Address 3 (Delivery destination) 納品先住所３.<p>
	 *
	 */
	public String dlv_addr3() {
		return getConstString(offset + 43, $dlv_addr3);
	}

	/**
	 * Address 3 (Delivery destination) 納品先住所３.<p>
	 *
	 */
	public void dlv_addr3(String value) {
		setConstString(offset + 43, $dlv_addr3, value);
	}


	/**
	 * Address 4 (Delivery destination) 納品先住所４.<p>
	 *
	 */
	public String dlv_addr4() {
		return getConstString(offset + 44, $dlv_addr4);
	}

	/**
	 * Address 4 (Delivery destination) 納品先住所４.<p>
	 *
	 */
	public void dlv_addr4(String value) {
		setConstString(offset + 44, $dlv_addr4, value);
	}


	/**
	 * Delivery destination dept. 納品先部署.<p>
	 *
	 */
	public String dlv_cntct_dpt() {
		return getConstString(offset + 45, $dlv_cntct_dpt);
	}

	/**
	 * Delivery destination dept. 納品先部署.<p>
	 *
	 */
	public void dlv_cntct_dpt(String value) {
		setConstString(offset + 45, $dlv_cntct_dpt, value);
	}


	/**
	 * Delivery destination PIC 納品先担当者.<p>
	 *
	 */
	public String dlv_cntct_psn() {
		return getConstString(offset + 46, $dlv_cntct_psn);
	}

	/**
	 * Delivery destination PIC 納品先担当者.<p>
	 *
	 */
	public void dlv_cntct_psn(String value) {
		setConstString(offset + 46, $dlv_cntct_psn, value);
	}


	/**
	 * TEL (Delivery destination) 納品先ＴＥＬ.<p>
	 *
	 */
	public String dlv_tel() {
		return getConstString(offset + 47, $dlv_tel);
	}

	/**
	 * TEL (Delivery destination) 納品先ＴＥＬ.<p>
	 *
	 */
	public void dlv_tel(String value) {
		setConstString(offset + 47, $dlv_tel, value);
	}


	/**
	 * FAX (Delivery destination) 納品先ＦＡＸ.<p>
	 *
	 */
	public String dlv_fax() {
		return getConstString(offset + 48, $dlv_fax);
	}

	/**
	 * FAX (Delivery destination) 納品先ＦＡＸ.<p>
	 *
	 */
	public void dlv_fax(String value) {
		setConstString(offset + 48, $dlv_fax, value);
	}


	/**
	 * Distribution channel cd. 1 仕向先ＣＤ１.<p>
	 *
	 */
	public String dest_cd1() {
		return getConstString(offset + 49, $dest_cd1);
	}

	/**
	 * Distribution channel cd. 1 仕向先ＣＤ１.<p>
	 *
	 */
	public void dest_cd1(String value) {
		setConstString(offset + 49, $dest_cd1, value);
	}


	/**
	 * Distribution channel cd. 2 仕向先ＣＤ２.<p>
	 *
	 */
	public String dest_cd2() {
		return getConstString(offset + 50, $dest_cd2);
	}

	/**
	 * Distribution channel cd. 2 仕向先ＣＤ２.<p>
	 *
	 */
	public void dest_cd2(String value) {
		setConstString(offset + 50, $dest_cd2, value);
	}


	/**
	 * Distribution channel cd. 3 仕向先ＣＤ３.<p>
	 *
	 */
	public String dest_cd3() {
		return getConstString(offset + 51, $dest_cd3);
	}

	/**
	 * Distribution channel cd. 3 仕向先ＣＤ３.<p>
	 *
	 */
	public void dest_cd3(String value) {
		setConstString(offset + 51, $dest_cd3, value);
	}


	/**
	 * Receiving point cd. 配送先ＣＤ.<p>
	 *
	 */
	public String tdlv_cd() {
		return getConstString(offset + 52, $tdlv_cd);
	}

	/**
	 * Receiving point cd. 配送先ＣＤ.<p>
	 *
	 */
	public void tdlv_cd(String value) {
		setConstString(offset + 52, $tdlv_cd, value);
	}


	/**
	 * Receiving point name 配送先名.<p>
	 *
	 */
	public String tdlv_nm() {
		return getConstString(offset + 53, $tdlv_nm);
	}

	/**
	 * Receiving point name 配送先名.<p>
	 *
	 */
	public void tdlv_nm(String value) {
		setConstString(offset + 53, $tdlv_nm, value);
	}


	/**
	 * Miscellaneous receiving point 配送先諸口.<p>
	 *
	 */
	public boolean tdlv_sundry_flg() {
		return getConstBoolean(offset + 54, $tdlv_sundry_flg);
	}

	/**
	 * Miscellaneous receiving point 配送先諸口.<p>
	 *
	 */
	public void tdlv_sundry_flg(boolean value) {
		setConstBoolean(offset + 54, $tdlv_sundry_flg, value);
	}


	/**
	 * Receiving point zip code 配送先郵便番号.<p>
	 *
	 */
	public String tdlv_zip_cd() {
		return getConstString(offset + 55, $tdlv_zip_cd);
	}

	/**
	 * Receiving point zip code 配送先郵便番号.<p>
	 *
	 */
	public void tdlv_zip_cd(String value) {
		setConstString(offset + 55, $tdlv_zip_cd, value);
	}


	/**
	 * Receiving point address 1 配送先住所１.<p>
	 *
	 */
	public String tdlv_addr1() {
		return getConstString(offset + 56, $tdlv_addr1);
	}

	/**
	 * Receiving point address 1 配送先住所１.<p>
	 *
	 */
	public void tdlv_addr1(String value) {
		setConstString(offset + 56, $tdlv_addr1, value);
	}


	/**
	 * Receiving point address 2 配送先住所２.<p>
	 *
	 */
	public String tdlv_addr2() {
		return getConstString(offset + 57, $tdlv_addr2);
	}

	/**
	 * Receiving point address 2 配送先住所２.<p>
	 *
	 */
	public void tdlv_addr2(String value) {
		setConstString(offset + 57, $tdlv_addr2, value);
	}


	/**
	 * Receiving point address 3 配送先住所３.<p>
	 *
	 */
	public String tdlv_addr3() {
		return getConstString(offset + 58, $tdlv_addr3);
	}

	/**
	 * Receiving point address 3 配送先住所３.<p>
	 *
	 */
	public void tdlv_addr3(String value) {
		setConstString(offset + 58, $tdlv_addr3, value);
	}


	/**
	 * Receiving point address 4 配送先住所４.<p>
	 *
	 */
	public String tdlv_addr4() {
		return getConstString(offset + 59, $tdlv_addr4);
	}

	/**
	 * Receiving point address 4 配送先住所４.<p>
	 *
	 */
	public void tdlv_addr4(String value) {
		setConstString(offset + 59, $tdlv_addr4, value);
	}


	/**
	 * Receiving point TEL 配送先ＴＥＬ.<p>
	 *
	 */
	public String tdlv_tel() {
		return getConstString(offset + 60, $tdlv_tel);
	}

	/**
	 * Receiving point TEL 配送先ＴＥＬ.<p>
	 *
	 */
	public void tdlv_tel(String value) {
		setConstString(offset + 60, $tdlv_tel, value);
	}


	/**
	 * Receiving point FAX 配送先ＦＡＸ.<p>
	 *
	 */
	public String tdlv_fax() {
		return getConstString(offset + 61, $tdlv_fax);
	}

	/**
	 * Receiving point FAX 配送先ＦＡＸ.<p>
	 *
	 */
	public void tdlv_fax(String value) {
		setConstString(offset + 61, $tdlv_fax, value);
	}


	/**
	 * Receiving point dept. 配送先部署.<p>
	 *
	 */
	public String tdlv_cntct_dpt() {
		return getConstString(offset + 62, $tdlv_cntct_dpt);
	}

	/**
	 * Receiving point dept. 配送先部署.<p>
	 *
	 */
	public void tdlv_cntct_dpt(String value) {
		setConstString(offset + 62, $tdlv_cntct_dpt, value);
	}


	/**
	 * Receiving point PIC 配送先担当者.<p>
	 *
	 */
	public String tdlv_cntct_psn() {
		return getConstString(offset + 63, $tdlv_cntct_psn);
	}

	/**
	 * Receiving point PIC 配送先担当者.<p>
	 *
	 */
	public void tdlv_cntct_psn(String value) {
		setConstString(offset + 63, $tdlv_cntct_psn, value);
	}


	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public String itm_cd() {
		return getConstString(offset + 64, $itm_cd);
	}

	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public void itm_cd(String value) {
		setConstString(offset + 64, $itm_cd, value);
	}


	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public String itm_sub1() {
		return getConstString(offset + 65, $itm_sub1);
	}

	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public void itm_sub1(String value) {
		setConstString(offset + 65, $itm_sub1, value);
	}


	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public String itm_sub2() {
		return getConstString(offset + 66, $itm_sub2);
	}

	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public void itm_sub2(String value) {
		setConstString(offset + 66, $itm_sub2, value);
	}


	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public String itm_sub3() {
		return getConstString(offset + 67, $itm_sub3);
	}

	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public void itm_sub3(String value) {
		setConstString(offset + 67, $itm_sub3, value);
	}


	/**
	 * Item name 品名.<p>
	 *
	 */
	public String itm_nm() {
		return getConstString(offset + 68, $itm_nm);
	}

	/**
	 * Item name 品名.<p>
	 *
	 */
	public void itm_nm(String value) {
		setConstString(offset + 68, $itm_nm, value);
	}


	/**
	 * Item name for invoice インボイス表記用品名.<p>
	 *
	 */
	public String iv_itm_nm() {
		return getConstString(offset + 69, $iv_itm_nm);
	}

	/**
	 * Item name for invoice インボイス表記用品名.<p>
	 *
	 */
	public void iv_itm_nm(String value) {
		setConstString(offset + 69, $iv_itm_nm, value);
	}


	/**
	 * Place of origin cd. 原産地ＣＤ.<p>
	 *
	 */
	public String cntry_org_cd() {
		return getConstString(offset + 70, $cntry_org_cd);
	}

	/**
	 * Place of origin cd. 原産地ＣＤ.<p>
	 *
	 */
	public void cntry_org_cd(String value) {
		setConstString(offset + 70, $cntry_org_cd, value);
	}


	/**
	 * SEIBAN No. 1 手配ＮＯ１.<p>
	 *
	 */
	public String sno1() {
		return getConstString(offset + 71, $sno1);
	}

	/**
	 * SEIBAN No. 1 手配ＮＯ１.<p>
	 *
	 */
	public void sno1(String value) {
		setConstString(offset + 71, $sno1, value);
	}


	/**
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public String sno2() {
		return getConstString(offset + 72, $sno2);
	}

	/**
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public void sno2(String value) {
		setConstString(offset + 72, $sno2, value);
	}


	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public String sno3() {
		return getConstString(offset + 73, $sno3);
	}

	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public void sno3(String value) {
		setConstString(offset + 73, $sno3, value);
	}


	/**
	 * SEIBAN No. 4 手配ＮＯ４.<p>
	 *
	 */
	public String sno4() {
		return getConstString(offset + 74, $sno4);
	}

	/**
	 * SEIBAN No. 4 手配ＮＯ４.<p>
	 *
	 */
	public void sno4(String value) {
		setConstString(offset + 74, $sno4, value);
	}


	/**
	 * Transaction unit cd. 取引単位ＣＤ.<p>
	 *
	 */
	public String trd_unit_cd() {
		return getConstString(offset + 75, $trd_unit_cd);
	}

	/**
	 * Transaction unit cd. 取引単位ＣＤ.<p>
	 *
	 */
	public void trd_unit_cd(String value) {
		setConstString(offset + 75, $trd_unit_cd, value);
	}


	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public MCNumber trd_unit_qty() {
		return getConstNumber(offset + 76, $trd_unit_qty);
	}

	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public void trd_unit_qty(MCNumber value) {
		setConstNumber(offset + 76, $trd_unit_qty, value);
	}

	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public void trd_unit_qty(int value) {
		setConstNumber(offset + 76, $trd_unit_qty, value);
	}

	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public void trd_unit_qty(long value) {
		setConstNumber(offset + 76, $trd_unit_qty, value);
	}

	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public void trd_unit_qty(float value) {
		setConstNumber(offset + 76, $trd_unit_qty, value);
	}

	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public void trd_unit_qty(double value) {
		setConstNumber(offset + 76, $trd_unit_qty, value);
	}


	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public String base_unit_cd() {
		return getConstString(offset + 77, $base_unit_cd);
	}

	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public void base_unit_cd(String value) {
		setConstString(offset + 77, $base_unit_cd, value);
	}


	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public MCNumber base_unit_qty() {
		return getConstNumber(offset + 78, $base_unit_qty);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(MCNumber value) {
		setConstNumber(offset + 78, $base_unit_qty, value);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(int value) {
		setConstNumber(offset + 78, $base_unit_qty, value);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(long value) {
		setConstNumber(offset + 78, $base_unit_qty, value);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(float value) {
		setConstNumber(offset + 78, $base_unit_qty, value);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(double value) {
		setConstNumber(offset + 78, $base_unit_qty, value);
	}


	/**
	 * Unit price (Transaction currency) 取引通貨単価.<p>
	 *
	 */
	public MCNumber trd_cur_upri() {
		return getConstNumber(offset + 79, $trd_cur_upri);
	}

	/**
	 * Unit price (Transaction currency) 取引通貨単価.<p>
	 *
	 */
	public void trd_cur_upri(MCNumber value) {
		setConstNumber(offset + 79, $trd_cur_upri, value);
	}

	/**
	 * Unit price (Transaction currency) 取引通貨単価.<p>
	 *
	 */
	public void trd_cur_upri(int value) {
		setConstNumber(offset + 79, $trd_cur_upri, value);
	}

	/**
	 * Unit price (Transaction currency) 取引通貨単価.<p>
	 *
	 */
	public void trd_cur_upri(long value) {
		setConstNumber(offset + 79, $trd_cur_upri, value);
	}

	/**
	 * Unit price (Transaction currency) 取引通貨単価.<p>
	 *
	 */
	public void trd_cur_upri(float value) {
		setConstNumber(offset + 79, $trd_cur_upri, value);
	}

	/**
	 * Unit price (Transaction currency) 取引通貨単価.<p>
	 *
	 */
	public void trd_cur_upri(double value) {
		setConstNumber(offset + 79, $trd_cur_upri, value);
	}


	/**
	 * Unit cost 原価単価.<p>
	 *
	 */
	public MCNumber cost_upri() {
		return getConstNumber(offset + 80, $cost_upri);
	}

	/**
	 * Unit cost 原価単価.<p>
	 *
	 */
	public void cost_upri(MCNumber value) {
		setConstNumber(offset + 80, $cost_upri, value);
	}

	/**
	 * Unit cost 原価単価.<p>
	 *
	 */
	public void cost_upri(int value) {
		setConstNumber(offset + 80, $cost_upri, value);
	}

	/**
	 * Unit cost 原価単価.<p>
	 *
	 */
	public void cost_upri(long value) {
		setConstNumber(offset + 80, $cost_upri, value);
	}

	/**
	 * Unit cost 原価単価.<p>
	 *
	 */
	public void cost_upri(float value) {
		setConstNumber(offset + 80, $cost_upri, value);
	}

	/**
	 * Unit cost 原価単価.<p>
	 *
	 */
	public void cost_upri(double value) {
		setConstNumber(offset + 80, $cost_upri, value);
	}


	/**
	 * Total cost 原価金額.<p>
	 *
	 */
	public MCNumber cost_amt() {
		return getConstNumber(offset + 81, $cost_amt);
	}

	/**
	 * Total cost 原価金額.<p>
	 *
	 */
	public void cost_amt(MCNumber value) {
		setConstNumber(offset + 81, $cost_amt, value);
	}

	/**
	 * Total cost 原価金額.<p>
	 *
	 */
	public void cost_amt(int value) {
		setConstNumber(offset + 81, $cost_amt, value);
	}

	/**
	 * Total cost 原価金額.<p>
	 *
	 */
	public void cost_amt(long value) {
		setConstNumber(offset + 81, $cost_amt, value);
	}

	/**
	 * Total cost 原価金額.<p>
	 *
	 */
	public void cost_amt(float value) {
		setConstNumber(offset + 81, $cost_amt, value);
	}

	/**
	 * Total cost 原価金額.<p>
	 *
	 */
	public void cost_amt(double value) {
		setConstNumber(offset + 81, $cost_amt, value);
	}


	/**
	 * Billing carry-over count 請求繰越回数.<p>
	 *
	 */
	public MCNumber bill_crryovr_times() {
		return getConstNumber(offset + 82, $bill_crryovr_times);
	}

	/**
	 * Billing carry-over count 請求繰越回数.<p>
	 *
	 */
	public void bill_crryovr_times(MCNumber value) {
		setConstNumber(offset + 82, $bill_crryovr_times, value);
	}

	/**
	 * Billing carry-over count 請求繰越回数.<p>
	 *
	 */
	public void bill_crryovr_times(int value) {
		setConstNumber(offset + 82, $bill_crryovr_times, value);
	}

	/**
	 * Billing carry-over count 請求繰越回数.<p>
	 *
	 */
	public void bill_crryovr_times(long value) {
		setConstNumber(offset + 82, $bill_crryovr_times, value);
	}

	/**
	 * Billing carry-over count 請求繰越回数.<p>
	 *
	 */
	public void bill_crryovr_times(float value) {
		setConstNumber(offset + 82, $bill_crryovr_times, value);
	}

	/**
	 * Billing carry-over count 請求繰越回数.<p>
	 *
	 */
	public void bill_crryovr_times(double value) {
		setConstNumber(offset + 82, $bill_crryovr_times, value);
	}


	/**
	 * Miscellaneous item 諸口品.<p>
	 *
	 */
	public boolean sundry_itm_flg() {
		return getConstBoolean(offset + 83, $sundry_itm_flg);
	}

	/**
	 * Miscellaneous item 諸口品.<p>
	 *
	 */
	public void sundry_itm_flg(boolean value) {
		setConstBoolean(offset + 83, $sundry_itm_flg, value);
	}


	/**
	 * Item journal cd. 品目仕訳ＣＤ.<p>
	 *
	 */
	public String itm_jnl_cd() {
		return getConstString(offset + 84, $itm_jnl_cd);
	}

	/**
	 * Item journal cd. 品目仕訳ＣＤ.<p>
	 *
	 */
	public void itm_jnl_cd(String value) {
		setConstString(offset + 84, $itm_jnl_cd, value);
	}


	/**
	 * Customer order details No. 得意先注文明細ＮＯ.<p>
	 *
	 */
	public String cst_po_d_no() {
		return getConstString(offset + 85, $cst_po_d_no);
	}

	/**
	 * Customer order details No. 得意先注文明細ＮＯ.<p>
	 *
	 */
	public void cst_po_d_no(String value) {
		setConstString(offset + 85, $cst_po_d_no, value);
	}


	/**
	 * Customer item cd. 得意先品目ＣＤ.<p>
	 *
	 */
	public String cst_itm_cd() {
		return getConstString(offset + 86, $cst_itm_cd);
	}

	/**
	 * Customer item cd. 得意先品目ＣＤ.<p>
	 *
	 */
	public void cst_itm_cd(String value) {
		setConstString(offset + 86, $cst_itm_cd, value);
	}


	/**
	 * Customer item name 得意先品名.<p>
	 *
	 */
	public String cst_itm_nm() {
		return getConstString(offset + 87, $cst_itm_nm);
	}

	/**
	 * Customer item name 得意先品名.<p>
	 *
	 */
	public void cst_itm_nm(String value) {
		setConstString(offset + 87, $cst_itm_nm, value);
	}


	/**
	 * Transaction details remarks 取引明細備考.<p>
	 *
	 */
	public String trd_d_rmrks() {
		return getConstString(offset + 88, $trd_d_rmrks);
	}

	/**
	 * Transaction details remarks 取引明細備考.<p>
	 *
	 */
	public void trd_d_rmrks(String value) {
		setConstString(offset + 88, $trd_d_rmrks, value);
	}


	/**
	 * Reason cd. 理由ＣＤ.<p>
	 *
	 */
	public String rsn_cd() {
		return getConstString(offset + 89, $rsn_cd);
	}

	/**
	 * Reason cd. 理由ＣＤ.<p>
	 *
	 */
	public void rsn_cd(String value) {
		setConstString(offset + 89, $rsn_cd, value);
	}


	/**
	 * Charged dept. cd. 負担部門ＣＤ.<p>
	 *
	 */
	public String bd_dpt_cd() {
		return getConstString(offset + 90, $bd_dpt_cd);
	}

	/**
	 * Charged dept. cd. 負担部門ＣＤ.<p>
	 *
	 */
	public void bd_dpt_cd(String value) {
		setConstString(offset + 90, $bd_dpt_cd, value);
	}


	/**
	 * Withholding tax rate 源泉税率.<p>
	 *
	 */
	public MCNumber wtax_rate() {
		return getConstNumber(offset + 91, $wtax_rate);
	}

	/**
	 * Withholding tax rate 源泉税率.<p>
	 *
	 */
	public void wtax_rate(MCNumber value) {
		setConstNumber(offset + 91, $wtax_rate, value);
	}

	/**
	 * Withholding tax rate 源泉税率.<p>
	 *
	 */
	public void wtax_rate(int value) {
		setConstNumber(offset + 91, $wtax_rate, value);
	}

	/**
	 * Withholding tax rate 源泉税率.<p>
	 *
	 */
	public void wtax_rate(long value) {
		setConstNumber(offset + 91, $wtax_rate, value);
	}

	/**
	 * Withholding tax rate 源泉税率.<p>
	 *
	 */
	public void wtax_rate(float value) {
		setConstNumber(offset + 91, $wtax_rate, value);
	}

	/**
	 * Withholding tax rate 源泉税率.<p>
	 *
	 */
	public void wtax_rate(double value) {
		setConstNumber(offset + 91, $wtax_rate, value);
	}


	/**
	 * Sales order details No. 受注明細ＮＯ.<p>
	 *
	 */
	public String slo_d_no() {
		return getConstString(offset + 92, $slo_d_no);
	}

	/**
	 * Sales order details No. 受注明細ＮＯ.<p>
	 *
	 */
	public void slo_d_no(String value) {
		setConstString(offset + 92, $slo_d_no, value);
	}


	/**
	 * Shipping schedule No. 出荷予定ＮＯ.<p>
	 *
	 */
	public String ship_schd_no() {
		return getConstString(offset + 93, $ship_schd_no);
	}

	/**
	 * Shipping schedule No. 出荷予定ＮＯ.<p>
	 *
	 */
	public void ship_schd_no(String value) {
		setConstString(offset + 93, $ship_schd_no, value);
	}


	/**
	 * Sales schedule No. 売上予定ＮＯ.<p>
	 *
	 */
	public String sls_schd_no() {
		return getConstString(offset + 94, $sls_schd_no);
	}

	/**
	 * Sales schedule No. 売上予定ＮＯ.<p>
	 *
	 */
	public void sls_schd_no(String value) {
		setConstString(offset + 94, $sls_schd_no, value);
	}


	/**
	 * Quotation details No. 見積明細ＮＯ.<p>
	 *
	 */
	public String qtn_d_no() {
		return getConstString(offset + 95, $qtn_d_no);
	}

	/**
	 * Quotation details No. 見積明細ＮＯ.<p>
	 *
	 */
	public void qtn_d_no(String value) {
		setConstString(offset + 95, $qtn_d_no, value);
	}


	/**
	 * Invoice details No. インボイス明細ＮＯ.<p>
	 *
	 */
	public String iv_d_no() {
		return getConstString(offset + 96, $iv_d_no);
	}

	/**
	 * Invoice details No. インボイス明細ＮＯ.<p>
	 *
	 */
	public void iv_d_no(String value) {
		setConstString(offset + 96, $iv_d_no, value);
	}


	/**
	 * Discount amount (Transaction currency) 取引通貨値引額.<p>
	 *
	 */
	public MCNumber trd_cur_dscnt_amt() {
		return getConstNumber(offset + 97, $trd_cur_dscnt_amt);
	}

	/**
	 * Discount amount (Transaction currency) 取引通貨値引額.<p>
	 *
	 */
	public void trd_cur_dscnt_amt(MCNumber value) {
		setConstNumber(offset + 97, $trd_cur_dscnt_amt, value);
	}

	/**
	 * Discount amount (Transaction currency) 取引通貨値引額.<p>
	 *
	 */
	public void trd_cur_dscnt_amt(int value) {
		setConstNumber(offset + 97, $trd_cur_dscnt_amt, value);
	}

	/**
	 * Discount amount (Transaction currency) 取引通貨値引額.<p>
	 *
	 */
	public void trd_cur_dscnt_amt(long value) {
		setConstNumber(offset + 97, $trd_cur_dscnt_amt, value);
	}

	/**
	 * Discount amount (Transaction currency) 取引通貨値引額.<p>
	 *
	 */
	public void trd_cur_dscnt_amt(float value) {
		setConstNumber(offset + 97, $trd_cur_dscnt_amt, value);
	}

	/**
	 * Discount amount (Transaction currency) 取引通貨値引額.<p>
	 *
	 */
	public void trd_cur_dscnt_amt(double value) {
		setConstNumber(offset + 97, $trd_cur_dscnt_amt, value);
	}


	/**
	 * Discount reason cd. 値引理由ＣＤ.<p>
	 *
	 */
	public String dscnt_rsn_cd() {
		return getConstString(offset + 98, $dscnt_rsn_cd);
	}

	/**
	 * Discount reason cd. 値引理由ＣＤ.<p>
	 *
	 */
	public void dscnt_rsn_cd(String value) {
		setConstString(offset + 98, $dscnt_rsn_cd, value);
	}


	/**
	 * Receiving point stopover type 配送先経由区分.<p>
	 *
	 */
	public String via_dlv_typ() {
		return getConstString(offset + 99, $via_dlv_typ);
	}

	/**
	 * Receiving point stopover type 配送先経由区分.<p>
	 *
	 */
	public void via_dlv_typ(String value) {
		setConstString(offset + 99, $via_dlv_typ, value);
	}


	/**
	 * Temporary unit price 仮単価.<p>
	 *
	 */
	public boolean interim_flg() {
		return getConstBoolean(offset + 100, $interim_flg);
	}

	/**
	 * Temporary unit price 仮単価.<p>
	 *
	 */
	public void interim_flg(boolean value) {
		setConstBoolean(offset + 100, $interim_flg, value);
	}


	/**
	 * Tax inclusive 内税.<p>
	 *
	 */
	public boolean inc_tax_flg() {
		return getConstBoolean(offset + 101, $inc_tax_flg);
	}

	/**
	 * Tax inclusive 内税.<p>
	 *
	 */
	public void inc_tax_flg(boolean value) {
		setConstBoolean(offset + 101, $inc_tax_flg, value);
	}


	/**
	 * Tax cd. 税ＣＤ.<p>
	 *
	 */
	public String tax_cd() {
		return getConstString(offset + 102, $tax_cd);
	}

	/**
	 * Tax cd. 税ＣＤ.<p>
	 *
	 */
	public void tax_cd(String value) {
		setConstString(offset + 102, $tax_cd, value);
	}


	/**
	 * Tax rate 税率.<p>
	 *
	 */
	public MCNumber tax_rate() {
		return getConstNumber(offset + 103, $tax_rate);
	}

	/**
	 * Tax rate 税率.<p>
	 *
	 */
	public void tax_rate(MCNumber value) {
		setConstNumber(offset + 103, $tax_rate, value);
	}

	/**
	 * Tax rate 税率.<p>
	 *
	 */
	public void tax_rate(int value) {
		setConstNumber(offset + 103, $tax_rate, value);
	}

	/**
	 * Tax rate 税率.<p>
	 *
	 */
	public void tax_rate(long value) {
		setConstNumber(offset + 103, $tax_rate, value);
	}

	/**
	 * Tax rate 税率.<p>
	 *
	 */
	public void tax_rate(float value) {
		setConstNumber(offset + 103, $tax_rate, value);
	}

	/**
	 * Tax rate 税率.<p>
	 *
	 */
	public void tax_rate(double value) {
		setConstNumber(offset + 103, $tax_rate, value);
	}


	/**
	 * Tax type 税区分.<p>
	 *
	 */
	public String tax_typ() {
		return getConstString(offset + 104, $tax_typ);
	}

	/**
	 * Tax type 税区分.<p>
	 *
	 */
	public void tax_typ(String value) {
		setConstString(offset + 104, $tax_typ, value);
	}


	/**
	 * SEIBAN No. 1 management type 手配ＮＯ１管理区分.<p>
	 *
	 */
	public String sno1_mng_typ() {
		return getConstString(offset + 105, $sno1_mng_typ);
	}

	/**
	 * SEIBAN No. 1 management type 手配ＮＯ１管理区分.<p>
	 *
	 */
	public void sno1_mng_typ(String value) {
		setConstString(offset + 105, $sno1_mng_typ, value);
	}


	/**
	 * SEIBAN No. 2 management type 手配ＮＯ２管理区分.<p>
	 *
	 */
	public String sno2_mng_typ() {
		return getConstString(offset + 106, $sno2_mng_typ);
	}

	/**
	 * SEIBAN No. 2 management type 手配ＮＯ２管理区分.<p>
	 *
	 */
	public void sno2_mng_typ(String value) {
		setConstString(offset + 106, $sno2_mng_typ, value);
	}


	/**
	 * SEIBAN No. 3 management type 手配ＮＯ３管理区分.<p>
	 *
	 */
	public String sno3_mng_typ() {
		return getConstString(offset + 107, $sno3_mng_typ);
	}

	/**
	 * SEIBAN No. 3 management type 手配ＮＯ３管理区分.<p>
	 *
	 */
	public void sno3_mng_typ(String value) {
		setConstString(offset + 107, $sno3_mng_typ, value);
	}


	/**
	 * SEIBAN No. 4 management type 手配ＮＯ４管理区分.<p>
	 *
	 */
	public String sno4_mng_typ() {
		return getConstString(offset + 108, $sno4_mng_typ);
	}

	/**
	 * SEIBAN No. 4 management type 手配ＮＯ４管理区分.<p>
	 *
	 */
	public void sno4_mng_typ(String value) {
		setConstString(offset + 108, $sno4_mng_typ, value);
	}


	/**
	 * Sales result No. 売上実績ＮＯ.<p>
	 *
	 */
	public String sls_act_no() {
		return getConstString(offset + 109, $sls_act_no);
	}

	/**
	 * Sales result No. 売上実績ＮＯ.<p>
	 *
	 */
	public void sls_act_no(String value) {
		setConstString(offset + 109, $sls_act_no, value);
	}


	/**
	 * Sales result sequence number 売上実績連番.<p>
	 *
	 */
	public MCNumber sls_act_seq() {
		return getConstNumber(offset + 110, $sls_act_seq);
	}

	/**
	 * Sales result sequence number 売上実績連番.<p>
	 *
	 */
	public void sls_act_seq(MCNumber value) {
		setConstNumber(offset + 110, $sls_act_seq, value);
	}

	/**
	 * Sales result sequence number 売上実績連番.<p>
	 *
	 */
	public void sls_act_seq(int value) {
		setConstNumber(offset + 110, $sls_act_seq, value);
	}

	/**
	 * Sales result sequence number 売上実績連番.<p>
	 *
	 */
	public void sls_act_seq(long value) {
		setConstNumber(offset + 110, $sls_act_seq, value);
	}

	/**
	 * Sales result sequence number 売上実績連番.<p>
	 *
	 */
	public void sls_act_seq(float value) {
		setConstNumber(offset + 110, $sls_act_seq, value);
	}

	/**
	 * Sales result sequence number 売上実績連番.<p>
	 *
	 */
	public void sls_act_seq(double value) {
		setConstNumber(offset + 110, $sls_act_seq, value);
	}


	/**
	 * Sales result details No. 売上実績明細ＮＯ.<p>
	 *
	 */
	public String sls_act_d_no() {
		return getConstString(offset + 111, $sls_act_d_no);
	}

	/**
	 * Sales result details No. 売上実績明細ＮＯ.<p>
	 *
	 */
	public void sls_act_d_no(String value) {
		setConstString(offset + 111, $sls_act_d_no, value);
	}


	/**
	 * Sales result details sequence number 売上実績明細連番.<p>
	 *
	 */
	public MCNumber sls_act_d_seq() {
		return getConstNumber(offset + 112, $sls_act_d_seq);
	}

	/**
	 * Sales result details sequence number 売上実績明細連番.<p>
	 *
	 */
	public void sls_act_d_seq(MCNumber value) {
		setConstNumber(offset + 112, $sls_act_d_seq, value);
	}

	/**
	 * Sales result details sequence number 売上実績明細連番.<p>
	 *
	 */
	public void sls_act_d_seq(int value) {
		setConstNumber(offset + 112, $sls_act_d_seq, value);
	}

	/**
	 * Sales result details sequence number 売上実績明細連番.<p>
	 *
	 */
	public void sls_act_d_seq(long value) {
		setConstNumber(offset + 112, $sls_act_d_seq, value);
	}

	/**
	 * Sales result details sequence number 売上実績明細連番.<p>
	 *
	 */
	public void sls_act_d_seq(float value) {
		setConstNumber(offset + 112, $sls_act_d_seq, value);
	}

	/**
	 * Sales result details sequence number 売上実績明細連番.<p>
	 *
	 */
	public void sls_act_d_seq(double value) {
		setConstNumber(offset + 112, $sls_act_d_seq, value);
	}


	/**
	 * Sales date 売上日.<p>
	 *
	 */
	public MCDate sls_dt() {
		return getConstDate(offset + 113, $sls_dt);
	}

	/**
	 * Sales date 売上日.<p>
	 *
	 */
	public void sls_dt(MCDate value) {
		setConstDate(offset + 113, $sls_dt, value);
	}


	public String getString(String name) {
		if ($trd_cd.equalsIgnoreCase(name)) {
			return trd_cd();
		}
		if ($trd_ptn_typ.equalsIgnoreCase(name)) {
			return trd_ptn_typ();
		}
		if ($sls_dpt_cd.equalsIgnoreCase(name)) {
			return sls_dpt_cd();
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($sls_usr_cd.equalsIgnoreCase(name)) {
			return sls_usr_cd();
		}
		if ($cst_cd.equalsIgnoreCase(name)) {
			return cst_cd();
		}
		if ($iv_no.equalsIgnoreCase(name)) {
			return iv_no();
		}
		if ($rcpt_iv_mng_no.equalsIgnoreCase(name)) {
			return rcpt_iv_mng_no();
		}
		if ($rcpt_iv_no.equalsIgnoreCase(name)) {
			return rcpt_iv_no();
		}
		if ($tterm_cd1.equalsIgnoreCase(name)) {
			return tterm_cd1();
		}
		if ($tterm_rmrks1.equalsIgnoreCase(name)) {
			return tterm_rmrks1();
		}
		if ($tterm_cd2.equalsIgnoreCase(name)) {
			return tterm_cd2();
		}
		if ($tterm_rmrks2.equalsIgnoreCase(name)) {
			return tterm_rmrks2();
		}
		if ($tterm_cd3.equalsIgnoreCase(name)) {
			return tterm_cd3();
		}
		if ($tterm_rmrks3.equalsIgnoreCase(name)) {
			return tterm_rmrks3();
		}
		if ($lc_no.equalsIgnoreCase(name)) {
			return lc_no();
		}
		if ($lc_rmrks.equalsIgnoreCase(name)) {
			return lc_rmrks();
		}
		if ($cred_cd.equalsIgnoreCase(name)) {
			return cred_cd();
		}
		if ($bcst_cd.equalsIgnoreCase(name)) {
			return bcst_cd();
		}
		if ($acst_cd.equalsIgnoreCase(name)) {
			return acst_cd();
		}
		if ($ar_dpt_cd.equalsIgnoreCase(name)) {
			return ar_dpt_cd();
		}
		if ($cst_po_no.equalsIgnoreCase(name)) {
			return cst_po_no();
		}
		if ($trd_cur_cd.equalsIgnoreCase(name)) {
			return trd_cur_cd();
		}
		if ($base_cur_cd.equalsIgnoreCase(name)) {
			return base_cur_cd();
		}
		if ($xrate_cd.equalsIgnoreCase(name)) {
			return xrate_cd();
		}
		if ($ptax_cur_cd.equalsIgnoreCase(name)) {
			return ptax_cur_cd();
		}
		if ($trd_rmrks.equalsIgnoreCase(name)) {
			return trd_rmrks();
		}
		if ($slo_no.equalsIgnoreCase(name)) {
			return slo_no();
		}
		if ($qtn_no.equalsIgnoreCase(name)) {
			return qtn_no();
		}
		if ($dlv_cd.equalsIgnoreCase(name)) {
			return dlv_cd();
		}
		if ($dlv_nm.equalsIgnoreCase(name)) {
			return dlv_nm();
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
		if ($dlv_cntct_dpt.equalsIgnoreCase(name)) {
			return dlv_cntct_dpt();
		}
		if ($dlv_cntct_psn.equalsIgnoreCase(name)) {
			return dlv_cntct_psn();
		}
		if ($dlv_tel.equalsIgnoreCase(name)) {
			return dlv_tel();
		}
		if ($dlv_fax.equalsIgnoreCase(name)) {
			return dlv_fax();
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
		if ($tdlv_tel.equalsIgnoreCase(name)) {
			return tdlv_tel();
		}
		if ($tdlv_fax.equalsIgnoreCase(name)) {
			return tdlv_fax();
		}
		if ($tdlv_cntct_dpt.equalsIgnoreCase(name)) {
			return tdlv_cntct_dpt();
		}
		if ($tdlv_cntct_psn.equalsIgnoreCase(name)) {
			return tdlv_cntct_psn();
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
		if ($iv_itm_nm.equalsIgnoreCase(name)) {
			return iv_itm_nm();
		}
		if ($cntry_org_cd.equalsIgnoreCase(name)) {
			return cntry_org_cd();
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
		if ($trd_unit_cd.equalsIgnoreCase(name)) {
			return trd_unit_cd();
		}
		if ($base_unit_cd.equalsIgnoreCase(name)) {
			return base_unit_cd();
		}
		if ($itm_jnl_cd.equalsIgnoreCase(name)) {
			return itm_jnl_cd();
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
		if ($trd_d_rmrks.equalsIgnoreCase(name)) {
			return trd_d_rmrks();
		}
		if ($rsn_cd.equalsIgnoreCase(name)) {
			return rsn_cd();
		}
		if ($bd_dpt_cd.equalsIgnoreCase(name)) {
			return bd_dpt_cd();
		}
		if ($slo_d_no.equalsIgnoreCase(name)) {
			return slo_d_no();
		}
		if ($ship_schd_no.equalsIgnoreCase(name)) {
			return ship_schd_no();
		}
		if ($sls_schd_no.equalsIgnoreCase(name)) {
			return sls_schd_no();
		}
		if ($qtn_d_no.equalsIgnoreCase(name)) {
			return qtn_d_no();
		}
		if ($iv_d_no.equalsIgnoreCase(name)) {
			return iv_d_no();
		}
		if ($dscnt_rsn_cd.equalsIgnoreCase(name)) {
			return dscnt_rsn_cd();
		}
		if ($via_dlv_typ.equalsIgnoreCase(name)) {
			return via_dlv_typ();
		}
		if ($tax_cd.equalsIgnoreCase(name)) {
			return tax_cd();
		}
		if ($tax_typ.equalsIgnoreCase(name)) {
			return tax_typ();
		}
		if ($sno1_mng_typ.equalsIgnoreCase(name)) {
			return sno1_mng_typ();
		}
		if ($sno2_mng_typ.equalsIgnoreCase(name)) {
			return sno2_mng_typ();
		}
		if ($sno3_mng_typ.equalsIgnoreCase(name)) {
			return sno3_mng_typ();
		}
		if ($sno4_mng_typ.equalsIgnoreCase(name)) {
			return sno4_mng_typ();
		}
		if ($sls_act_no.equalsIgnoreCase(name)) {
			return sls_act_no();
		}
		if ($sls_act_d_no.equalsIgnoreCase(name)) {
			return sls_act_d_no();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($xrate.equalsIgnoreCase(name)) {
			return xrate();
		}
		if ($ptax_xrate.equalsIgnoreCase(name)) {
			return ptax_xrate();
		}
		if ($qtn_rev.equalsIgnoreCase(name)) {
			return qtn_rev();
		}
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			return trd_unit_qty();
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			return base_unit_qty();
		}
		if ($trd_cur_upri.equalsIgnoreCase(name)) {
			return trd_cur_upri();
		}
		if ($cost_upri.equalsIgnoreCase(name)) {
			return cost_upri();
		}
		if ($cost_amt.equalsIgnoreCase(name)) {
			return cost_amt();
		}
		if ($bill_crryovr_times.equalsIgnoreCase(name)) {
			return bill_crryovr_times();
		}
		if ($wtax_rate.equalsIgnoreCase(name)) {
			return wtax_rate();
		}
		if ($trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			return trd_cur_dscnt_amt();
		}
		if ($tax_rate.equalsIgnoreCase(name)) {
			return tax_rate();
		}
		if ($sls_act_seq.equalsIgnoreCase(name)) {
			return sls_act_seq();
		}
		if ($sls_act_d_seq.equalsIgnoreCase(name)) {
			return sls_act_d_seq();
		}
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		if ($ac_dt.equalsIgnoreCase(name)) {
			return ac_dt();
		}
		if ($eta_dt.equalsIgnoreCase(name)) {
			return eta_dt();
		}
		if ($lc_dt.equalsIgnoreCase(name)) {
			return lc_dt();
		}
		if ($rcv_schd_dt.equalsIgnoreCase(name)) {
			return rcv_schd_dt();
		}
		if ($bill_basis_dt.equalsIgnoreCase(name)) {
			return bill_basis_dt();
		}
		if ($sls_dt.equalsIgnoreCase(name)) {
			return sls_dt();
		}
		return super.getDate(name);
	}
	public boolean getBoolean(String name) {
		if ($dlv_sundry_flg.equalsIgnoreCase(name)) {
			return dlv_sundry_flg();
		}
		if ($tdlv_sundry_flg.equalsIgnoreCase(name)) {
			return tdlv_sundry_flg();
		}
		if ($sundry_itm_flg.equalsIgnoreCase(name)) {
			return sundry_itm_flg();
		}
		if ($interim_flg.equalsIgnoreCase(name)) {
			return interim_flg();
		}
		if ($inc_tax_flg.equalsIgnoreCase(name)) {
			return inc_tax_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($trd_cd.equalsIgnoreCase(name)) {
			return trd_cd();
		}
		if ($trd_ptn_typ.equalsIgnoreCase(name)) {
			return trd_ptn_typ();
		}
		if ($sls_dpt_cd.equalsIgnoreCase(name)) {
			return sls_dpt_cd();
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($sls_usr_cd.equalsIgnoreCase(name)) {
			return sls_usr_cd();
		}
		if ($cst_cd.equalsIgnoreCase(name)) {
			return cst_cd();
		}
		if ($iv_no.equalsIgnoreCase(name)) {
			return iv_no();
		}
		if ($rcpt_iv_mng_no.equalsIgnoreCase(name)) {
			return rcpt_iv_mng_no();
		}
		if ($rcpt_iv_no.equalsIgnoreCase(name)) {
			return rcpt_iv_no();
		}
		if ($tterm_cd1.equalsIgnoreCase(name)) {
			return tterm_cd1();
		}
		if ($tterm_rmrks1.equalsIgnoreCase(name)) {
			return tterm_rmrks1();
		}
		if ($tterm_cd2.equalsIgnoreCase(name)) {
			return tterm_cd2();
		}
		if ($tterm_rmrks2.equalsIgnoreCase(name)) {
			return tterm_rmrks2();
		}
		if ($tterm_cd3.equalsIgnoreCase(name)) {
			return tterm_cd3();
		}
		if ($tterm_rmrks3.equalsIgnoreCase(name)) {
			return tterm_rmrks3();
		}
		if ($lc_no.equalsIgnoreCase(name)) {
			return lc_no();
		}
		if ($lc_rmrks.equalsIgnoreCase(name)) {
			return lc_rmrks();
		}
		if ($cred_cd.equalsIgnoreCase(name)) {
			return cred_cd();
		}
		if ($bcst_cd.equalsIgnoreCase(name)) {
			return bcst_cd();
		}
		if ($acst_cd.equalsIgnoreCase(name)) {
			return acst_cd();
		}
		if ($ar_dpt_cd.equalsIgnoreCase(name)) {
			return ar_dpt_cd();
		}
		if ($cst_po_no.equalsIgnoreCase(name)) {
			return cst_po_no();
		}
		if ($trd_cur_cd.equalsIgnoreCase(name)) {
			return trd_cur_cd();
		}
		if ($base_cur_cd.equalsIgnoreCase(name)) {
			return base_cur_cd();
		}
		if ($xrate_cd.equalsIgnoreCase(name)) {
			return xrate_cd();
		}
		if ($ptax_cur_cd.equalsIgnoreCase(name)) {
			return ptax_cur_cd();
		}
		if ($trd_rmrks.equalsIgnoreCase(name)) {
			return trd_rmrks();
		}
		if ($slo_no.equalsIgnoreCase(name)) {
			return slo_no();
		}
		if ($qtn_no.equalsIgnoreCase(name)) {
			return qtn_no();
		}
		if ($dlv_cd.equalsIgnoreCase(name)) {
			return dlv_cd();
		}
		if ($dlv_nm.equalsIgnoreCase(name)) {
			return dlv_nm();
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
		if ($dlv_cntct_dpt.equalsIgnoreCase(name)) {
			return dlv_cntct_dpt();
		}
		if ($dlv_cntct_psn.equalsIgnoreCase(name)) {
			return dlv_cntct_psn();
		}
		if ($dlv_tel.equalsIgnoreCase(name)) {
			return dlv_tel();
		}
		if ($dlv_fax.equalsIgnoreCase(name)) {
			return dlv_fax();
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
		if ($tdlv_tel.equalsIgnoreCase(name)) {
			return tdlv_tel();
		}
		if ($tdlv_fax.equalsIgnoreCase(name)) {
			return tdlv_fax();
		}
		if ($tdlv_cntct_dpt.equalsIgnoreCase(name)) {
			return tdlv_cntct_dpt();
		}
		if ($tdlv_cntct_psn.equalsIgnoreCase(name)) {
			return tdlv_cntct_psn();
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
		if ($iv_itm_nm.equalsIgnoreCase(name)) {
			return iv_itm_nm();
		}
		if ($cntry_org_cd.equalsIgnoreCase(name)) {
			return cntry_org_cd();
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
		if ($trd_unit_cd.equalsIgnoreCase(name)) {
			return trd_unit_cd();
		}
		if ($base_unit_cd.equalsIgnoreCase(name)) {
			return base_unit_cd();
		}
		if ($itm_jnl_cd.equalsIgnoreCase(name)) {
			return itm_jnl_cd();
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
		if ($trd_d_rmrks.equalsIgnoreCase(name)) {
			return trd_d_rmrks();
		}
		if ($rsn_cd.equalsIgnoreCase(name)) {
			return rsn_cd();
		}
		if ($bd_dpt_cd.equalsIgnoreCase(name)) {
			return bd_dpt_cd();
		}
		if ($slo_d_no.equalsIgnoreCase(name)) {
			return slo_d_no();
		}
		if ($ship_schd_no.equalsIgnoreCase(name)) {
			return ship_schd_no();
		}
		if ($sls_schd_no.equalsIgnoreCase(name)) {
			return sls_schd_no();
		}
		if ($qtn_d_no.equalsIgnoreCase(name)) {
			return qtn_d_no();
		}
		if ($iv_d_no.equalsIgnoreCase(name)) {
			return iv_d_no();
		}
		if ($dscnt_rsn_cd.equalsIgnoreCase(name)) {
			return dscnt_rsn_cd();
		}
		if ($via_dlv_typ.equalsIgnoreCase(name)) {
			return via_dlv_typ();
		}
		if ($tax_cd.equalsIgnoreCase(name)) {
			return tax_cd();
		}
		if ($tax_typ.equalsIgnoreCase(name)) {
			return tax_typ();
		}
		if ($sno1_mng_typ.equalsIgnoreCase(name)) {
			return sno1_mng_typ();
		}
		if ($sno2_mng_typ.equalsIgnoreCase(name)) {
			return sno2_mng_typ();
		}
		if ($sno3_mng_typ.equalsIgnoreCase(name)) {
			return sno3_mng_typ();
		}
		if ($sno4_mng_typ.equalsIgnoreCase(name)) {
			return sno4_mng_typ();
		}
		if ($sls_act_no.equalsIgnoreCase(name)) {
			return sls_act_no();
		}
		if ($sls_act_d_no.equalsIgnoreCase(name)) {
			return sls_act_d_no();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($xrate.equalsIgnoreCase(name)) {
			return xrate();
		}
		if ($ptax_xrate.equalsIgnoreCase(name)) {
			return ptax_xrate();
		}
		if ($qtn_rev.equalsIgnoreCase(name)) {
			return qtn_rev();
		}
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			return trd_unit_qty();
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			return base_unit_qty();
		}
		if ($trd_cur_upri.equalsIgnoreCase(name)) {
			return trd_cur_upri();
		}
		if ($cost_upri.equalsIgnoreCase(name)) {
			return cost_upri();
		}
		if ($cost_amt.equalsIgnoreCase(name)) {
			return cost_amt();
		}
		if ($bill_crryovr_times.equalsIgnoreCase(name)) {
			return bill_crryovr_times();
		}
		if ($wtax_rate.equalsIgnoreCase(name)) {
			return wtax_rate();
		}
		if ($trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			return trd_cur_dscnt_amt();
		}
		if ($tax_rate.equalsIgnoreCase(name)) {
			return tax_rate();
		}
		if ($sls_act_seq.equalsIgnoreCase(name)) {
			return sls_act_seq();
		}
		if ($sls_act_d_seq.equalsIgnoreCase(name)) {
			return sls_act_d_seq();
		}
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($ac_dt.equalsIgnoreCase(name)) {
			return ac_dt();
		}
		if ($eta_dt.equalsIgnoreCase(name)) {
			return eta_dt();
		}
		if ($lc_dt.equalsIgnoreCase(name)) {
			return lc_dt();
		}
		if ($rcv_schd_dt.equalsIgnoreCase(name)) {
			return rcv_schd_dt();
		}
		if ($bill_basis_dt.equalsIgnoreCase(name)) {
			return bill_basis_dt();
		}
		if ($sls_dt.equalsIgnoreCase(name)) {
			return sls_dt();
		}
		return super.getDateNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($dlv_sundry_flg.equalsIgnoreCase(name)) {
			return dlv_sundry_flg();
		}
		if ($tdlv_sundry_flg.equalsIgnoreCase(name)) {
			return tdlv_sundry_flg();
		}
		if ($sundry_itm_flg.equalsIgnoreCase(name)) {
			return sundry_itm_flg();
		}
		if ($interim_flg.equalsIgnoreCase(name)) {
			return interim_flg();
		}
		if ($inc_tax_flg.equalsIgnoreCase(name)) {
			return inc_tax_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($trd_cd.equalsIgnoreCase(name)) {
			trd_cd(value);
			return;
		}
		if ($trd_ptn_typ.equalsIgnoreCase(name)) {
			trd_ptn_typ(value);
			return;
		}
		if ($sls_dpt_cd.equalsIgnoreCase(name)) {
			sls_dpt_cd(value);
			return;
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			wg_cd(value);
			return;
		}
		if ($sls_usr_cd.equalsIgnoreCase(name)) {
			sls_usr_cd(value);
			return;
		}
		if ($cst_cd.equalsIgnoreCase(name)) {
			cst_cd(value);
			return;
		}
		if ($iv_no.equalsIgnoreCase(name)) {
			iv_no(value);
			return;
		}
		if ($rcpt_iv_mng_no.equalsIgnoreCase(name)) {
			rcpt_iv_mng_no(value);
			return;
		}
		if ($rcpt_iv_no.equalsIgnoreCase(name)) {
			rcpt_iv_no(value);
			return;
		}
		if ($tterm_cd1.equalsIgnoreCase(name)) {
			tterm_cd1(value);
			return;
		}
		if ($tterm_rmrks1.equalsIgnoreCase(name)) {
			tterm_rmrks1(value);
			return;
		}
		if ($tterm_cd2.equalsIgnoreCase(name)) {
			tterm_cd2(value);
			return;
		}
		if ($tterm_rmrks2.equalsIgnoreCase(name)) {
			tterm_rmrks2(value);
			return;
		}
		if ($tterm_cd3.equalsIgnoreCase(name)) {
			tterm_cd3(value);
			return;
		}
		if ($tterm_rmrks3.equalsIgnoreCase(name)) {
			tterm_rmrks3(value);
			return;
		}
		if ($lc_no.equalsIgnoreCase(name)) {
			lc_no(value);
			return;
		}
		if ($lc_rmrks.equalsIgnoreCase(name)) {
			lc_rmrks(value);
			return;
		}
		if ($cred_cd.equalsIgnoreCase(name)) {
			cred_cd(value);
			return;
		}
		if ($bcst_cd.equalsIgnoreCase(name)) {
			bcst_cd(value);
			return;
		}
		if ($acst_cd.equalsIgnoreCase(name)) {
			acst_cd(value);
			return;
		}
		if ($ar_dpt_cd.equalsIgnoreCase(name)) {
			ar_dpt_cd(value);
			return;
		}
		if ($cst_po_no.equalsIgnoreCase(name)) {
			cst_po_no(value);
			return;
		}
		if ($trd_cur_cd.equalsIgnoreCase(name)) {
			trd_cur_cd(value);
			return;
		}
		if ($base_cur_cd.equalsIgnoreCase(name)) {
			base_cur_cd(value);
			return;
		}
		if ($xrate_cd.equalsIgnoreCase(name)) {
			xrate_cd(value);
			return;
		}
		if ($ptax_cur_cd.equalsIgnoreCase(name)) {
			ptax_cur_cd(value);
			return;
		}
		if ($trd_rmrks.equalsIgnoreCase(name)) {
			trd_rmrks(value);
			return;
		}
		if ($slo_no.equalsIgnoreCase(name)) {
			slo_no(value);
			return;
		}
		if ($qtn_no.equalsIgnoreCase(name)) {
			qtn_no(value);
			return;
		}
		if ($dlv_cd.equalsIgnoreCase(name)) {
			dlv_cd(value);
			return;
		}
		if ($dlv_nm.equalsIgnoreCase(name)) {
			dlv_nm(value);
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
		if ($dlv_cntct_dpt.equalsIgnoreCase(name)) {
			dlv_cntct_dpt(value);
			return;
		}
		if ($dlv_cntct_psn.equalsIgnoreCase(name)) {
			dlv_cntct_psn(value);
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
		if ($tdlv_tel.equalsIgnoreCase(name)) {
			tdlv_tel(value);
			return;
		}
		if ($tdlv_fax.equalsIgnoreCase(name)) {
			tdlv_fax(value);
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
		if ($iv_itm_nm.equalsIgnoreCase(name)) {
			iv_itm_nm(value);
			return;
		}
		if ($cntry_org_cd.equalsIgnoreCase(name)) {
			cntry_org_cd(value);
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
		if ($trd_unit_cd.equalsIgnoreCase(name)) {
			trd_unit_cd(value);
			return;
		}
		if ($base_unit_cd.equalsIgnoreCase(name)) {
			base_unit_cd(value);
			return;
		}
		if ($itm_jnl_cd.equalsIgnoreCase(name)) {
			itm_jnl_cd(value);
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
		if ($trd_d_rmrks.equalsIgnoreCase(name)) {
			trd_d_rmrks(value);
			return;
		}
		if ($rsn_cd.equalsIgnoreCase(name)) {
			rsn_cd(value);
			return;
		}
		if ($bd_dpt_cd.equalsIgnoreCase(name)) {
			bd_dpt_cd(value);
			return;
		}
		if ($slo_d_no.equalsIgnoreCase(name)) {
			slo_d_no(value);
			return;
		}
		if ($ship_schd_no.equalsIgnoreCase(name)) {
			ship_schd_no(value);
			return;
		}
		if ($sls_schd_no.equalsIgnoreCase(name)) {
			sls_schd_no(value);
			return;
		}
		if ($qtn_d_no.equalsIgnoreCase(name)) {
			qtn_d_no(value);
			return;
		}
		if ($iv_d_no.equalsIgnoreCase(name)) {
			iv_d_no(value);
			return;
		}
		if ($dscnt_rsn_cd.equalsIgnoreCase(name)) {
			dscnt_rsn_cd(value);
			return;
		}
		if ($via_dlv_typ.equalsIgnoreCase(name)) {
			via_dlv_typ(value);
			return;
		}
		if ($tax_cd.equalsIgnoreCase(name)) {
			tax_cd(value);
			return;
		}
		if ($tax_typ.equalsIgnoreCase(name)) {
			tax_typ(value);
			return;
		}
		if ($sno1_mng_typ.equalsIgnoreCase(name)) {
			sno1_mng_typ(value);
			return;
		}
		if ($sno2_mng_typ.equalsIgnoreCase(name)) {
			sno2_mng_typ(value);
			return;
		}
		if ($sno3_mng_typ.equalsIgnoreCase(name)) {
			sno3_mng_typ(value);
			return;
		}
		if ($sno4_mng_typ.equalsIgnoreCase(name)) {
			sno4_mng_typ(value);
			return;
		}
		if ($sls_act_no.equalsIgnoreCase(name)) {
			sls_act_no(value);
			return;
		}
		if ($sls_act_d_no.equalsIgnoreCase(name)) {
			sls_act_d_no(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($ptax_xrate.equalsIgnoreCase(name)) {
			ptax_xrate(value);
			return;
		}
		if ($qtn_rev.equalsIgnoreCase(name)) {
			qtn_rev(value);
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
		if ($trd_cur_upri.equalsIgnoreCase(name)) {
			trd_cur_upri(value);
			return;
		}
		if ($cost_upri.equalsIgnoreCase(name)) {
			cost_upri(value);
			return;
		}
		if ($cost_amt.equalsIgnoreCase(name)) {
			cost_amt(value);
			return;
		}
		if ($bill_crryovr_times.equalsIgnoreCase(name)) {
			bill_crryovr_times(value);
			return;
		}
		if ($wtax_rate.equalsIgnoreCase(name)) {
			wtax_rate(value);
			return;
		}
		if ($trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			trd_cur_dscnt_amt(value);
			return;
		}
		if ($tax_rate.equalsIgnoreCase(name)) {
			tax_rate(value);
			return;
		}
		if ($sls_act_seq.equalsIgnoreCase(name)) {
			sls_act_seq(value);
			return;
		}
		if ($sls_act_d_seq.equalsIgnoreCase(name)) {
			sls_act_d_seq(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($ptax_xrate.equalsIgnoreCase(name)) {
			ptax_xrate(value);
			return;
		}
		if ($qtn_rev.equalsIgnoreCase(name)) {
			qtn_rev(value);
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
		if ($trd_cur_upri.equalsIgnoreCase(name)) {
			trd_cur_upri(value);
			return;
		}
		if ($cost_upri.equalsIgnoreCase(name)) {
			cost_upri(value);
			return;
		}
		if ($cost_amt.equalsIgnoreCase(name)) {
			cost_amt(value);
			return;
		}
		if ($bill_crryovr_times.equalsIgnoreCase(name)) {
			bill_crryovr_times(value);
			return;
		}
		if ($wtax_rate.equalsIgnoreCase(name)) {
			wtax_rate(value);
			return;
		}
		if ($trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			trd_cur_dscnt_amt(value);
			return;
		}
		if ($tax_rate.equalsIgnoreCase(name)) {
			tax_rate(value);
			return;
		}
		if ($sls_act_seq.equalsIgnoreCase(name)) {
			sls_act_seq(value);
			return;
		}
		if ($sls_act_d_seq.equalsIgnoreCase(name)) {
			sls_act_d_seq(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($ptax_xrate.equalsIgnoreCase(name)) {
			ptax_xrate(value);
			return;
		}
		if ($qtn_rev.equalsIgnoreCase(name)) {
			qtn_rev(value);
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
		if ($trd_cur_upri.equalsIgnoreCase(name)) {
			trd_cur_upri(value);
			return;
		}
		if ($cost_upri.equalsIgnoreCase(name)) {
			cost_upri(value);
			return;
		}
		if ($cost_amt.equalsIgnoreCase(name)) {
			cost_amt(value);
			return;
		}
		if ($bill_crryovr_times.equalsIgnoreCase(name)) {
			bill_crryovr_times(value);
			return;
		}
		if ($wtax_rate.equalsIgnoreCase(name)) {
			wtax_rate(value);
			return;
		}
		if ($trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			trd_cur_dscnt_amt(value);
			return;
		}
		if ($tax_rate.equalsIgnoreCase(name)) {
			tax_rate(value);
			return;
		}
		if ($sls_act_seq.equalsIgnoreCase(name)) {
			sls_act_seq(value);
			return;
		}
		if ($sls_act_d_seq.equalsIgnoreCase(name)) {
			sls_act_d_seq(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($ptax_xrate.equalsIgnoreCase(name)) {
			ptax_xrate(value);
			return;
		}
		if ($qtn_rev.equalsIgnoreCase(name)) {
			qtn_rev(value);
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
		if ($trd_cur_upri.equalsIgnoreCase(name)) {
			trd_cur_upri(value);
			return;
		}
		if ($cost_upri.equalsIgnoreCase(name)) {
			cost_upri(value);
			return;
		}
		if ($cost_amt.equalsIgnoreCase(name)) {
			cost_amt(value);
			return;
		}
		if ($bill_crryovr_times.equalsIgnoreCase(name)) {
			bill_crryovr_times(value);
			return;
		}
		if ($wtax_rate.equalsIgnoreCase(name)) {
			wtax_rate(value);
			return;
		}
		if ($trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			trd_cur_dscnt_amt(value);
			return;
		}
		if ($tax_rate.equalsIgnoreCase(name)) {
			tax_rate(value);
			return;
		}
		if ($sls_act_seq.equalsIgnoreCase(name)) {
			sls_act_seq(value);
			return;
		}
		if ($sls_act_d_seq.equalsIgnoreCase(name)) {
			sls_act_d_seq(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($ptax_xrate.equalsIgnoreCase(name)) {
			ptax_xrate(value);
			return;
		}
		if ($qtn_rev.equalsIgnoreCase(name)) {
			qtn_rev(value);
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
		if ($trd_cur_upri.equalsIgnoreCase(name)) {
			trd_cur_upri(value);
			return;
		}
		if ($cost_upri.equalsIgnoreCase(name)) {
			cost_upri(value);
			return;
		}
		if ($cost_amt.equalsIgnoreCase(name)) {
			cost_amt(value);
			return;
		}
		if ($bill_crryovr_times.equalsIgnoreCase(name)) {
			bill_crryovr_times(value);
			return;
		}
		if ($wtax_rate.equalsIgnoreCase(name)) {
			wtax_rate(value);
			return;
		}
		if ($trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			trd_cur_dscnt_amt(value);
			return;
		}
		if ($tax_rate.equalsIgnoreCase(name)) {
			tax_rate(value);
			return;
		}
		if ($sls_act_seq.equalsIgnoreCase(name)) {
			sls_act_seq(value);
			return;
		}
		if ($sls_act_d_seq.equalsIgnoreCase(name)) {
			sls_act_d_seq(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($ac_dt.equalsIgnoreCase(name)) {
			ac_dt(value);
			return;
		}
		if ($eta_dt.equalsIgnoreCase(name)) {
			eta_dt(value);
			return;
		}
		if ($lc_dt.equalsIgnoreCase(name)) {
			lc_dt(value);
			return;
		}
		if ($rcv_schd_dt.equalsIgnoreCase(name)) {
			rcv_schd_dt(value);
			return;
		}
		if ($bill_basis_dt.equalsIgnoreCase(name)) {
			bill_basis_dt(value);
			return;
		}
		if ($sls_dt.equalsIgnoreCase(name)) {
			sls_dt(value);
			return;
		}
		super.setDate(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($dlv_sundry_flg.equalsIgnoreCase(name)) {
			dlv_sundry_flg(value);
			return;
		}
		if ($tdlv_sundry_flg.equalsIgnoreCase(name)) {
			tdlv_sundry_flg(value);
			return;
		}
		if ($sundry_itm_flg.equalsIgnoreCase(name)) {
			sundry_itm_flg(value);
			return;
		}
		if ($interim_flg.equalsIgnoreCase(name)) {
			interim_flg(value);
			return;
		}
		if ($inc_tax_flg.equalsIgnoreCase(name)) {
			inc_tax_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($trd_cd.equalsIgnoreCase(name)) {
			trd_cd(value);
			return;
		}
		if ($trd_ptn_typ.equalsIgnoreCase(name)) {
			trd_ptn_typ(value);
			return;
		}
		if ($sls_dpt_cd.equalsIgnoreCase(name)) {
			sls_dpt_cd(value);
			return;
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			wg_cd(value);
			return;
		}
		if ($sls_usr_cd.equalsIgnoreCase(name)) {
			sls_usr_cd(value);
			return;
		}
		if ($cst_cd.equalsIgnoreCase(name)) {
			cst_cd(value);
			return;
		}
		if ($iv_no.equalsIgnoreCase(name)) {
			iv_no(value);
			return;
		}
		if ($rcpt_iv_mng_no.equalsIgnoreCase(name)) {
			rcpt_iv_mng_no(value);
			return;
		}
		if ($rcpt_iv_no.equalsIgnoreCase(name)) {
			rcpt_iv_no(value);
			return;
		}
		if ($tterm_cd1.equalsIgnoreCase(name)) {
			tterm_cd1(value);
			return;
		}
		if ($tterm_rmrks1.equalsIgnoreCase(name)) {
			tterm_rmrks1(value);
			return;
		}
		if ($tterm_cd2.equalsIgnoreCase(name)) {
			tterm_cd2(value);
			return;
		}
		if ($tterm_rmrks2.equalsIgnoreCase(name)) {
			tterm_rmrks2(value);
			return;
		}
		if ($tterm_cd3.equalsIgnoreCase(name)) {
			tterm_cd3(value);
			return;
		}
		if ($tterm_rmrks3.equalsIgnoreCase(name)) {
			tterm_rmrks3(value);
			return;
		}
		if ($lc_no.equalsIgnoreCase(name)) {
			lc_no(value);
			return;
		}
		if ($lc_rmrks.equalsIgnoreCase(name)) {
			lc_rmrks(value);
			return;
		}
		if ($cred_cd.equalsIgnoreCase(name)) {
			cred_cd(value);
			return;
		}
		if ($bcst_cd.equalsIgnoreCase(name)) {
			bcst_cd(value);
			return;
		}
		if ($acst_cd.equalsIgnoreCase(name)) {
			acst_cd(value);
			return;
		}
		if ($ar_dpt_cd.equalsIgnoreCase(name)) {
			ar_dpt_cd(value);
			return;
		}
		if ($cst_po_no.equalsIgnoreCase(name)) {
			cst_po_no(value);
			return;
		}
		if ($trd_cur_cd.equalsIgnoreCase(name)) {
			trd_cur_cd(value);
			return;
		}
		if ($base_cur_cd.equalsIgnoreCase(name)) {
			base_cur_cd(value);
			return;
		}
		if ($xrate_cd.equalsIgnoreCase(name)) {
			xrate_cd(value);
			return;
		}
		if ($ptax_cur_cd.equalsIgnoreCase(name)) {
			ptax_cur_cd(value);
			return;
		}
		if ($trd_rmrks.equalsIgnoreCase(name)) {
			trd_rmrks(value);
			return;
		}
		if ($slo_no.equalsIgnoreCase(name)) {
			slo_no(value);
			return;
		}
		if ($qtn_no.equalsIgnoreCase(name)) {
			qtn_no(value);
			return;
		}
		if ($dlv_cd.equalsIgnoreCase(name)) {
			dlv_cd(value);
			return;
		}
		if ($dlv_nm.equalsIgnoreCase(name)) {
			dlv_nm(value);
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
		if ($dlv_cntct_dpt.equalsIgnoreCase(name)) {
			dlv_cntct_dpt(value);
			return;
		}
		if ($dlv_cntct_psn.equalsIgnoreCase(name)) {
			dlv_cntct_psn(value);
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
		if ($tdlv_tel.equalsIgnoreCase(name)) {
			tdlv_tel(value);
			return;
		}
		if ($tdlv_fax.equalsIgnoreCase(name)) {
			tdlv_fax(value);
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
		if ($iv_itm_nm.equalsIgnoreCase(name)) {
			iv_itm_nm(value);
			return;
		}
		if ($cntry_org_cd.equalsIgnoreCase(name)) {
			cntry_org_cd(value);
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
		if ($trd_unit_cd.equalsIgnoreCase(name)) {
			trd_unit_cd(value);
			return;
		}
		if ($base_unit_cd.equalsIgnoreCase(name)) {
			base_unit_cd(value);
			return;
		}
		if ($itm_jnl_cd.equalsIgnoreCase(name)) {
			itm_jnl_cd(value);
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
		if ($trd_d_rmrks.equalsIgnoreCase(name)) {
			trd_d_rmrks(value);
			return;
		}
		if ($rsn_cd.equalsIgnoreCase(name)) {
			rsn_cd(value);
			return;
		}
		if ($bd_dpt_cd.equalsIgnoreCase(name)) {
			bd_dpt_cd(value);
			return;
		}
		if ($slo_d_no.equalsIgnoreCase(name)) {
			slo_d_no(value);
			return;
		}
		if ($ship_schd_no.equalsIgnoreCase(name)) {
			ship_schd_no(value);
			return;
		}
		if ($sls_schd_no.equalsIgnoreCase(name)) {
			sls_schd_no(value);
			return;
		}
		if ($qtn_d_no.equalsIgnoreCase(name)) {
			qtn_d_no(value);
			return;
		}
		if ($iv_d_no.equalsIgnoreCase(name)) {
			iv_d_no(value);
			return;
		}
		if ($dscnt_rsn_cd.equalsIgnoreCase(name)) {
			dscnt_rsn_cd(value);
			return;
		}
		if ($via_dlv_typ.equalsIgnoreCase(name)) {
			via_dlv_typ(value);
			return;
		}
		if ($tax_cd.equalsIgnoreCase(name)) {
			tax_cd(value);
			return;
		}
		if ($tax_typ.equalsIgnoreCase(name)) {
			tax_typ(value);
			return;
		}
		if ($sno1_mng_typ.equalsIgnoreCase(name)) {
			sno1_mng_typ(value);
			return;
		}
		if ($sno2_mng_typ.equalsIgnoreCase(name)) {
			sno2_mng_typ(value);
			return;
		}
		if ($sno3_mng_typ.equalsIgnoreCase(name)) {
			sno3_mng_typ(value);
			return;
		}
		if ($sno4_mng_typ.equalsIgnoreCase(name)) {
			sno4_mng_typ(value);
			return;
		}
		if ($sls_act_no.equalsIgnoreCase(name)) {
			sls_act_no(value);
			return;
		}
		if ($sls_act_d_no.equalsIgnoreCase(name)) {
			sls_act_d_no(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($ptax_xrate.equalsIgnoreCase(name)) {
			ptax_xrate(value);
			return;
		}
		if ($qtn_rev.equalsIgnoreCase(name)) {
			qtn_rev(value);
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
		if ($trd_cur_upri.equalsIgnoreCase(name)) {
			trd_cur_upri(value);
			return;
		}
		if ($cost_upri.equalsIgnoreCase(name)) {
			cost_upri(value);
			return;
		}
		if ($cost_amt.equalsIgnoreCase(name)) {
			cost_amt(value);
			return;
		}
		if ($bill_crryovr_times.equalsIgnoreCase(name)) {
			bill_crryovr_times(value);
			return;
		}
		if ($wtax_rate.equalsIgnoreCase(name)) {
			wtax_rate(value);
			return;
		}
		if ($trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			trd_cur_dscnt_amt(value);
			return;
		}
		if ($tax_rate.equalsIgnoreCase(name)) {
			tax_rate(value);
			return;
		}
		if ($sls_act_seq.equalsIgnoreCase(name)) {
			sls_act_seq(value);
			return;
		}
		if ($sls_act_d_seq.equalsIgnoreCase(name)) {
			sls_act_d_seq(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($ptax_xrate.equalsIgnoreCase(name)) {
			ptax_xrate(value);
			return;
		}
		if ($qtn_rev.equalsIgnoreCase(name)) {
			qtn_rev(value);
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
		if ($trd_cur_upri.equalsIgnoreCase(name)) {
			trd_cur_upri(value);
			return;
		}
		if ($cost_upri.equalsIgnoreCase(name)) {
			cost_upri(value);
			return;
		}
		if ($cost_amt.equalsIgnoreCase(name)) {
			cost_amt(value);
			return;
		}
		if ($bill_crryovr_times.equalsIgnoreCase(name)) {
			bill_crryovr_times(value);
			return;
		}
		if ($wtax_rate.equalsIgnoreCase(name)) {
			wtax_rate(value);
			return;
		}
		if ($trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			trd_cur_dscnt_amt(value);
			return;
		}
		if ($tax_rate.equalsIgnoreCase(name)) {
			tax_rate(value);
			return;
		}
		if ($sls_act_seq.equalsIgnoreCase(name)) {
			sls_act_seq(value);
			return;
		}
		if ($sls_act_d_seq.equalsIgnoreCase(name)) {
			sls_act_d_seq(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($ptax_xrate.equalsIgnoreCase(name)) {
			ptax_xrate(value);
			return;
		}
		if ($qtn_rev.equalsIgnoreCase(name)) {
			qtn_rev(value);
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
		if ($trd_cur_upri.equalsIgnoreCase(name)) {
			trd_cur_upri(value);
			return;
		}
		if ($cost_upri.equalsIgnoreCase(name)) {
			cost_upri(value);
			return;
		}
		if ($cost_amt.equalsIgnoreCase(name)) {
			cost_amt(value);
			return;
		}
		if ($bill_crryovr_times.equalsIgnoreCase(name)) {
			bill_crryovr_times(value);
			return;
		}
		if ($wtax_rate.equalsIgnoreCase(name)) {
			wtax_rate(value);
			return;
		}
		if ($trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			trd_cur_dscnt_amt(value);
			return;
		}
		if ($tax_rate.equalsIgnoreCase(name)) {
			tax_rate(value);
			return;
		}
		if ($sls_act_seq.equalsIgnoreCase(name)) {
			sls_act_seq(value);
			return;
		}
		if ($sls_act_d_seq.equalsIgnoreCase(name)) {
			sls_act_d_seq(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($ptax_xrate.equalsIgnoreCase(name)) {
			ptax_xrate(value);
			return;
		}
		if ($qtn_rev.equalsIgnoreCase(name)) {
			qtn_rev(value);
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
		if ($trd_cur_upri.equalsIgnoreCase(name)) {
			trd_cur_upri(value);
			return;
		}
		if ($cost_upri.equalsIgnoreCase(name)) {
			cost_upri(value);
			return;
		}
		if ($cost_amt.equalsIgnoreCase(name)) {
			cost_amt(value);
			return;
		}
		if ($bill_crryovr_times.equalsIgnoreCase(name)) {
			bill_crryovr_times(value);
			return;
		}
		if ($wtax_rate.equalsIgnoreCase(name)) {
			wtax_rate(value);
			return;
		}
		if ($trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			trd_cur_dscnt_amt(value);
			return;
		}
		if ($tax_rate.equalsIgnoreCase(name)) {
			tax_rate(value);
			return;
		}
		if ($sls_act_seq.equalsIgnoreCase(name)) {
			sls_act_seq(value);
			return;
		}
		if ($sls_act_d_seq.equalsIgnoreCase(name)) {
			sls_act_d_seq(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($ptax_xrate.equalsIgnoreCase(name)) {
			ptax_xrate(value);
			return;
		}
		if ($qtn_rev.equalsIgnoreCase(name)) {
			qtn_rev(value);
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
		if ($trd_cur_upri.equalsIgnoreCase(name)) {
			trd_cur_upri(value);
			return;
		}
		if ($cost_upri.equalsIgnoreCase(name)) {
			cost_upri(value);
			return;
		}
		if ($cost_amt.equalsIgnoreCase(name)) {
			cost_amt(value);
			return;
		}
		if ($bill_crryovr_times.equalsIgnoreCase(name)) {
			bill_crryovr_times(value);
			return;
		}
		if ($wtax_rate.equalsIgnoreCase(name)) {
			wtax_rate(value);
			return;
		}
		if ($trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			trd_cur_dscnt_amt(value);
			return;
		}
		if ($tax_rate.equalsIgnoreCase(name)) {
			tax_rate(value);
			return;
		}
		if ($sls_act_seq.equalsIgnoreCase(name)) {
			sls_act_seq(value);
			return;
		}
		if ($sls_act_d_seq.equalsIgnoreCase(name)) {
			sls_act_d_seq(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($ac_dt.equalsIgnoreCase(name)) {
			ac_dt(value);
			return;
		}
		if ($eta_dt.equalsIgnoreCase(name)) {
			eta_dt(value);
			return;
		}
		if ($lc_dt.equalsIgnoreCase(name)) {
			lc_dt(value);
			return;
		}
		if ($rcv_schd_dt.equalsIgnoreCase(name)) {
			rcv_schd_dt(value);
			return;
		}
		if ($bill_basis_dt.equalsIgnoreCase(name)) {
			bill_basis_dt(value);
			return;
		}
		if ($sls_dt.equalsIgnoreCase(name)) {
			sls_dt(value);
			return;
		}
		super.setDateNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($dlv_sundry_flg.equalsIgnoreCase(name)) {
			dlv_sundry_flg(value);
			return;
		}
		if ($tdlv_sundry_flg.equalsIgnoreCase(name)) {
			tdlv_sundry_flg(value);
			return;
		}
		if ($sundry_itm_flg.equalsIgnoreCase(name)) {
			sundry_itm_flg(value);
			return;
		}
		if ($interim_flg.equalsIgnoreCase(name)) {
			interim_flg(value);
			return;
		}
		if ($inc_tax_flg.equalsIgnoreCase(name)) {
			inc_tax_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

