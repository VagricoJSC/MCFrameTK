package mcframe.clientMSUA.MSUAP1100;

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
abstract class CndR_MC_A extends mcframe.clientMAUA.MAUAP1010.CndR {

	/**
	 * Transaction pattern type 取引パタン区分.<p>
	 *
	 */
	public static final String $trd_ptn_typ = "trd_ptn_typ";
	/**
	 * Delivery destination cd. (Header) 納品先ＣＤ（ヘッダ）.<p>
	 *
	 */
	public static final String $hdr_dlv_cd = "hdr_dlv_cd";
	/**
	 * Delivery destination name (Header) 納品先名（ヘッダ）.<p>
	 *
	 */
	public static final String $hdr_dlv_nm = "hdr_dlv_nm";
	/**
	 * Miscellaneous delivery destination (Header) 納品先諸口（ヘッダ）.<p>
	 *
	 */
	public static final String $hdr_dlv_sundry_flg = "hdr_dlv_sundry_flg";
	/**
	 * Print price (Header) 価格印字（ヘッダ）.<p>
	 *
	 */
	public static final String $hdr_pri_prnt_flg = "hdr_pri_prnt_flg";
	/**
	 * Delivery destination distribution group cd. (Header) 納品先物流グループＣＤ（ヘッダ）.<p>
	 *
	 */
	public static final String $hdr_dlv_lg_grp_cd = "hdr_dlv_lg_grp_cd";
	/**
	 * Delivery destination distribution group name (Header) 納品先物流グループ名（ヘッダ）.<p>
	 *
	 */
	public static final String $hdr_dlv_lg_grp_nm = "hdr_dlv_lg_grp_nm";
	/**
	 * Delivery destination country cd. (Header) 納品先国ＣＤ（ヘッダ）.<p>
	 *
	 */
	public static final String $hdr_dlv_cntry_cd = "hdr_dlv_cntry_cd";
	/**
	 * Delivery destination country name (Header) 納品先国名（ヘッダ）.<p>
	 *
	 */
	public static final String $hdr_dlv_cntry_nm = "hdr_dlv_cntry_nm";
	/**
	 * Delivery destination zip code (Header) 納品先郵便番号（ヘッダ）.<p>
	 *
	 */
	public static final String $hdr_dlv_zip_cd = "hdr_dlv_zip_cd";
	/**
	 * Delivery destination address 1 (Header) 納品先住所１（ヘッダ）.<p>
	 *
	 */
	public static final String $hdr_dlv_addr1 = "hdr_dlv_addr1";
	/**
	 * Delivery destination address 2 (Header) 納品先住所２（ヘッダ）.<p>
	 *
	 */
	public static final String $hdr_dlv_addr2 = "hdr_dlv_addr2";
	/**
	 * Delivery destination address 3 (Header) 納品先住所３（ヘッダ）.<p>
	 *
	 */
	public static final String $hdr_dlv_addr3 = "hdr_dlv_addr3";
	/**
	 * Delivery destination address 4 (Header) 納品先住所４（ヘッダ）.<p>
	 *
	 */
	public static final String $hdr_dlv_addr4 = "hdr_dlv_addr4";
	/**
	 * Delivery destination TEL (Header) 納品先ＴＥＬ（ヘッダ）.<p>
	 *
	 */
	public static final String $hdr_dlv_tel = "hdr_dlv_tel";
	/**
	 * Delivery destination FAX (Header) 納品先ＦＡＸ（ヘッダ）.<p>
	 *
	 */
	public static final String $hdr_dlv_fax = "hdr_dlv_fax";
	/**
	 * Delivery destination dept. (Header) 納品先部署（ヘッダ）.<p>
	 *
	 */
	public static final String $hdr_dlv_cntct_dpt = "hdr_dlv_cntct_dpt";
	/**
	 * Delivery destination PIC (Header) 納品先担当者（ヘッダ）.<p>
	 *
	 */
	public static final String $hdr_dlv_cntct_psn = "hdr_dlv_cntct_psn";
	/**
	 * Report output locale cd. (Header) 帳票出力ロケールＣＤ（ヘッダ）.<p>
	 *
	 */
	public static final String $hdr_prnt_lcl_cd = "hdr_prnt_lcl_cd";
	/**
	 * Distribution channel cd. 1 (Header) 仕向先ＣＤ１（ヘッダ）.<p>
	 *
	 */
	public static final String $hdr_dest_cd1 = "hdr_dest_cd1";
	/**
	 * Distribution channel name 1 (Header) 仕向先１名（ヘッダ）.<p>
	 *
	 */
	public static final String $hdr_dest_nm1 = "hdr_dest_nm1";
	/**
	 * Distribution channel cd. 2 (Header) 仕向先ＣＤ２（ヘッダ）.<p>
	 *
	 */
	public static final String $hdr_dest_cd2 = "hdr_dest_cd2";
	/**
	 * Distribution channel name 2 (Header) 仕向先２名（ヘッダ）.<p>
	 *
	 */
	public static final String $hdr_dest_nm2 = "hdr_dest_nm2";
	/**
	 * Distribution channel cd. 3 (Header) 仕向先ＣＤ３（ヘッダ）.<p>
	 *
	 */
	public static final String $hdr_dest_cd3 = "hdr_dest_cd3";
	/**
	 * Distribution channel name 3 (Header) 仕向先３名（ヘッダ）.<p>
	 *
	 */
	public static final String $hdr_dest_nm3 = "hdr_dest_nm3";
	/**
	 * Receiving point cd. (Header) 配送先ＣＤ（ヘッダ）.<p>
	 *
	 */
	public static final String $hdr_tdlv_cd = "hdr_tdlv_cd";
	/**
	 * Receiving point name (Header) 配送先名（ヘッダ）.<p>
	 *
	 */
	public static final String $hdr_tdlv_nm = "hdr_tdlv_nm";
	/**
	 * Miscellaneous receiving point (Header) 配送先諸口（ヘッダ）.<p>
	 *
	 */
	public static final String $hdr_tdlv_sundry_flg = "hdr_tdlv_sundry_flg";
	/**
	 * Receiving point distribution group cd. (Header) 配送先物流グループＣＤ（ヘッダ）.<p>
	 *
	 */
	public static final String $hdr_tdlv_lg_grp_cd = "hdr_tdlv_lg_grp_cd";
	/**
	 * Receiving point distribution group name (Header) 配送先物流グループ名（ヘッダ）.<p>
	 *
	 */
	public static final String $hdr_tdlv_lg_grp_nm = "hdr_tdlv_lg_grp_nm";
	/**
	 * Receiving point country cd. (Header) 配送先国ＣＤ（ヘッダ）.<p>
	 *
	 */
	public static final String $hdr_tdlv_cntry_cd = "hdr_tdlv_cntry_cd";
	/**
	 * Receiving point country name (Header) 配送先国名（ヘッダ）.<p>
	 *
	 */
	public static final String $hdr_tdlv_cntry_nm = "hdr_tdlv_cntry_nm";
	/**
	 * Receiving point zip code (Header) 配送先郵便番号（ヘッダ）.<p>
	 *
	 */
	public static final String $hdr_tdlv_zip_cd = "hdr_tdlv_zip_cd";
	/**
	 * Receiving point address 1 (Header) 配送先住所１（ヘッダ）.<p>
	 *
	 */
	public static final String $hdr_tdlv_addr1 = "hdr_tdlv_addr1";
	/**
	 * Receiving point address 2 (Header) 配送先住所２（ヘッダ）.<p>
	 *
	 */
	public static final String $hdr_tdlv_addr2 = "hdr_tdlv_addr2";
	/**
	 * Receiving point address 3 (Header) 配送先住所３（ヘッダ）.<p>
	 *
	 */
	public static final String $hdr_tdlv_addr3 = "hdr_tdlv_addr3";
	/**
	 * Receiving point address 4 (Header) 配送先住所４（ヘッダ）.<p>
	 *
	 */
	public static final String $hdr_tdlv_addr4 = "hdr_tdlv_addr4";
	/**
	 * Receiving point TEL (Header) 配送先ＴＥＬ（ヘッダ）.<p>
	 *
	 */
	public static final String $hdr_tdlv_tel = "hdr_tdlv_tel";
	/**
	 * Receiving point FAX (Header) 配送先ＦＡＸ（ヘッダ）.<p>
	 *
	 */
	public static final String $hdr_tdlv_fax = "hdr_tdlv_fax";
	/**
	 * Receiving point dept. (Header) 配送先部署（ヘッダ）.<p>
	 *
	 */
	public static final String $hdr_tdlv_cntct_dpt = "hdr_tdlv_cntct_dpt";
	/**
	 * Receiving point PIC (Header) 配送先担当者（ヘッダ）.<p>
	 *
	 */
	public static final String $hdr_tdlv_cntct_psn = "hdr_tdlv_cntct_psn";
	/**
	 * Receiving point stopover type (Header) 配送先経由区分（ヘッダ）.<p>
	 *
	 */
	public static final String $hdr_via_dlv_typ = "hdr_via_dlv_typ";
	/**
	 * Receiving point stopover type name (header) 配送先経由区分名（ヘッダ）.<p>
	 *
	 */
	public static final String $hdr_via_dlv_typ_nm = "hdr_via_dlv_typ_nm";
	/**
	 * Receiving point required (Header) 配送先必須（ヘッダ）.<p>
	 *
	 */
	public static final String $hdr_tdlv_req_flg = "hdr_tdlv_req_flg";
	/**
	 * Revenue recording type 売上計上区分.<p>
	 *
	 */
	public static final String $sls_basis_typ = "sls_basis_typ";
	/**
	 * Working group cd. (Header) ワーキンググループＣＤ（ヘッダ）.<p>
	 *
	 */
	public static final String $hdr_wg_cd = "hdr_wg_cd";
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
	 * Taxpaying currency cd. 納税通貨ＣＤ.<p>
	 *
	 */
	public static final String $ptax_cur_cd = "ptax_cur_cd";
	/**
	 * Customer invoice transaction 得意先インボイス取引.<p>
	 *
	 */
	public static final String $cst_iv_flg = "cst_iv_flg";
	/**
	 * Billing carry-over count 請求繰越回数.<p>
	 *
	 */
	public static final String $cst_bill_crryovr_times = "cst_bill_crryovr_times";
	/**
	 * Sales unit price acquisition type (Header) 販売単価取得区分（ヘッダ）.<p>
	 *
	 */
	public static final String $hdr_sls_upri_req_typ = "hdr_sls_upri_req_typ";
	/**
	 * Shipping schedule split type (Header) 出荷予定分割区分（ヘッダ）.<p>
	 *
	 */
	public static final String $hdr_ship_schd_split_typ = "hdr_ship_schd_split_typ";
	/**
	 * Assortment type 品揃区分.<p>
	 *
	 */
	public static final String $assort_typ = "assort_typ";
	/**
	 * Invoice No. インボイスＮＯ.<p>
	 *
	 */
	public static final String $iv_no = "iv_no";
	/**
	 * Auto 自動.<p>
	 *
	 */
	public static final String $iv_num_flg = "iv_num_flg";
	/**
	 * Desired shipping date (Header) 出荷希望日（ヘッダ）.<p>
	 *
	 */
	public static final String $hdr_ship_rqst_dt = "hdr_ship_rqst_dt";
	/**
	 * Desired shipping time (Header) 出荷希望時刻（ヘッダ）.<p>
	 *
	 */
	public static final String $hdr_ship_rqst_hm = "hdr_ship_rqst_hm";
	/**
	 * Desired delivery date (Header) 納入希望日（ヘッダ）.<p>
	 *
	 */
	public static final String $hdr_dlv_rqst_dt = "hdr_dlv_rqst_dt";
	/**
	 * Desired delivery time (Header) 納入希望時刻（ヘッダ）.<p>
	 *
	 */
	public static final String $hdr_dlv_rqst_hm = "hdr_dlv_rqst_hm";
	/**
	 * Day type (Header) 曜日区分（ヘッダ）.<p>
	 *
	 */
	public static final String $hdr_dlv_day_week_typ = "hdr_dlv_day_week_typ";
	/**
	 * Arrival day of week (Header) 着曜日（ヘッダ）.<p>
	 *
	 */
	public static final String $hdr_dlv_day_week_typ_nm = "hdr_dlv_day_week_typ_nm";
	/**
	 * Consignment 貸出.<p>
	 *
	 */
	public static final String $vmi_flg = "vmi_flg";
	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public static final String $trd_unit_qty = "trd_unit_qty";
	/**
	 * Unit price (Transaction currency) 取引通貨単価.<p>
	 *
	 */
	public static final String $trd_cur_upri = "trd_cur_upri";
	/**
	 * Tax cd. 税ＣＤ.<p>
	 *
	 */
	public static final String $tax_cd = "tax_cd";
	/**
	 * Tax name 税名.<p>
	 *
	 */
	public static final String $tax_nm = "tax_nm";
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
	 * Tax inclusive 内税.<p>
	 *
	 */
	public static final String $inc_tax_flg = "inc_tax_flg";
	/**
	 * Discount reason cd. 値引理由ＣＤ.<p>
	 *
	 */
	public static final String $dscnt_rsn_cd = "dscnt_rsn_cd";
	/**
	 * Discount reason name 値引理由名.<p>
	 *
	 */
	public static final String $dscnt_rsn_nm = "dscnt_rsn_nm";
	/**
	 * Unit cost 原価単価.<p>
	 *
	 */
	public static final String $cost_upri = "cost_upri";
	/**
	 * Billing carry-over count 請求繰越回数.<p>
	 *
	 */
	public static final String $bill_crryovr_times = "bill_crryovr_times";
	/**
	 * Assortment group No. 品揃グループＮＯ.<p>
	 *
	 */
	public static final String $set_itm_grp_no = "set_itm_grp_no";
	/**
	 * Desired shipping date 出荷希望日.<p>
	 *
	 */
	public static final String $ship_rqst_dt = "ship_rqst_dt";
	/**
	 * Desired shipping date editability 出荷希望日編集可否.<p>
	 *
	 */
	public static final String $is_editable_ship_rqst_dt = "is_editable_ship_rqst_dt";
	/**
	 * Desired shipping time 出荷希望時刻.<p>
	 *
	 */
	public static final String $ship_rqst_hm = "ship_rqst_hm";
	/**
	 * Desired shipping time editability 出荷希望時刻編集可否.<p>
	 *
	 */
	public static final String $is_editable_ship_rqst_hm = "is_editable_ship_rqst_hm";
	/**
	 * Desired delivery date 納入希望日.<p>
	 *
	 */
	public static final String $dlv_rqst_dt = "dlv_rqst_dt";
	/**
	 * Desired delivery date editability 納入希望日編集可否.<p>
	 *
	 */
	public static final String $is_editable_dlv_rqst_dt = "is_editable_dlv_rqst_dt";
	/**
	 * Desired delivery time 納入希望時刻.<p>
	 *
	 */
	public static final String $dlv_rqst_hm = "dlv_rqst_hm";
	/**
	 * Desired delivery time editability 納入希望時刻編集可否.<p>
	 *
	 */
	public static final String $is_editable_dlv_rqst_hm = "is_editable_dlv_rqst_hm";
	/**
	 * Day type 曜日区分.<p>
	 *
	 */
	public static final String $dlv_day_week_typ = "dlv_day_week_typ";
	/**
	 * Arrival day of week 着曜日.<p>
	 *
	 */
	public static final String $dlv_day_week_typ_nm = "dlv_day_week_typ_nm";
	/**
	 * Arrival day of week editability 着曜日編集可否.<p>
	 *
	 */
	public static final String $is_editable_dlv_day_week_typ_nm = "is_editable_dlv_day_week_typ_nm";
	/**
	 * Scheduled sales date 売上予定日.<p>
	 *
	 */
	public static final String $sls_schd_dt = "sls_schd_dt";
	/**
	 * Delivery destination cd. editability 納品先ＣＤ編集可否.<p>
	 *
	 */
	public static final String $is_editable_dlv_cd = "is_editable_dlv_cd";
	/**
	 * Delivery destination cd. 納品先ＣＤ.<p>
	 *
	 */
	public static final String $dlv_cd = "dlv_cd";
	/**
	 * Delivery destination name 納品先名.<p>
	 *
	 */
	public static final String $dlv_nm = "dlv_nm";
	/**
	 * Miscellaneous delivery destination 納品先諸口.<p>
	 *
	 */
	public static final String $dlv_sundry_flg = "dlv_sundry_flg";
	/**
	 * Print price 価格印字.<p>
	 *
	 */
	public static final String $pri_prnt_flg = "pri_prnt_flg";
	/**
	 * Delivery destination distribution group cd. 納品先物流グループＣＤ.<p>
	 *
	 */
	public static final String $dlv_lg_grp_cd = "dlv_lg_grp_cd";
	/**
	 * Delivery destination distribution group name 納品先物流グループ名.<p>
	 *
	 */
	public static final String $dlv_lg_grp_nm = "dlv_lg_grp_nm";
	/**
	 * Delivery destination country cd. 納品先国ＣＤ.<p>
	 *
	 */
	public static final String $dlv_cntry_cd = "dlv_cntry_cd";
	/**
	 * Delivery destination country name 納品先国名.<p>
	 *
	 */
	public static final String $dlv_cntry_nm = "dlv_cntry_nm";
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
	 * Report output locale cd. 帳票出力ロケールＣＤ.<p>
	 *
	 */
	public static final String $prnt_lcl_cd = "prnt_lcl_cd";
	/**
	 * Receiving point required 配送先必須.<p>
	 *
	 */
	public static final String $tdlv_req_flg = "tdlv_req_flg";
	/**
	 * Distribution channel cd. 1 editability 仕向先ＣＤ１編集可否.<p>
	 *
	 */
	public static final String $is_editable_dest_cd1 = "is_editable_dest_cd1";
	/**
	 * Distribution channel cd. 1 仕向先ＣＤ１.<p>
	 *
	 */
	public static final String $dest_cd1 = "dest_cd1";
	/**
	 * Distribution channel name 1 仕向先１名.<p>
	 *
	 */
	public static final String $dest_nm1 = "dest_nm1";
	/**
	 * Distribution channel cd. 2 editability 仕向先ＣＤ２編集可否.<p>
	 *
	 */
	public static final String $is_editable_dest_cd2 = "is_editable_dest_cd2";
	/**
	 * Distribution channel cd. 2 仕向先ＣＤ２.<p>
	 *
	 */
	public static final String $dest_cd2 = "dest_cd2";
	/**
	 * Distribution channel name 2 仕向先２名.<p>
	 *
	 */
	public static final String $dest_nm2 = "dest_nm2";
	/**
	 * Distribution channel cd. 3 editability 仕向先ＣＤ３編集可否.<p>
	 *
	 */
	public static final String $is_editable_dest_cd3 = "is_editable_dest_cd3";
	/**
	 * Distribution channel cd. 3 仕向先ＣＤ３.<p>
	 *
	 */
	public static final String $dest_cd3 = "dest_cd3";
	/**
	 * Distribution channel name 3 仕向先３名.<p>
	 *
	 */
	public static final String $dest_nm3 = "dest_nm3";
	/**
	 * Receiving point cd. editability 配送先ＣＤ編集可否.<p>
	 *
	 */
	public static final String $is_editable_tdlv_cd = "is_editable_tdlv_cd";
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
	 * Receiving point distribution group cd. 配送先物流グループＣＤ.<p>
	 *
	 */
	public static final String $tdlv_lg_grp_cd = "tdlv_lg_grp_cd";
	/**
	 * Receiving point distribution group name 配送先物流グループ名.<p>
	 *
	 */
	public static final String $tdlv_lg_grp_nm = "tdlv_lg_grp_nm";
	/**
	 * Receiving point country cd. 配送先国ＣＤ.<p>
	 *
	 */
	public static final String $tdlv_cntry_cd = "tdlv_cntry_cd";
	/**
	 * Receiving point country name 配送先国名.<p>
	 *
	 */
	public static final String $tdlv_cntry_nm = "tdlv_cntry_nm";
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
	 * Receiving point stopover type 配送先経由区分.<p>
	 *
	 */
	public static final String $via_dlv_typ = "via_dlv_typ";
	/**
	 * Receiving point stopover name 配送先経由区分名.<p>
	 *
	 */
	public static final String $via_dlv_typ_nm = "via_dlv_typ_nm";
	/**
	 * Sales keeping customer inventory 預り売上.<p>
	 *
	 */
	public static final String $sls_cststk_flg = "sls_cststk_flg";
	/**
	 * Procurement type 手配区分.<p>
	 *
	 */
	public static final String $proc_typ = "proc_typ";
	/**
	 * Split type 分割区分.<p>
	 *
	 */
	public static final String $ship_schd_split_typ = "ship_schd_split_typ";
	/**
	 * Allocation range type 引当範囲区分.<p>
	 *
	 */
	public static final String $alloc_scope_typ = "alloc_scope_typ";
	/**
	 * Allocation type 引当区分.<p>
	 *
	 */
	public static final String $alloc_typ = "alloc_typ";
	/**
	 * Sales unit price acquisition type 販売単価取得区分.<p>
	 *
	 */
	public static final String $sls_upri_req_typ = "sls_upri_req_typ";
	/**
	 * Via sales order entry 受注登録経由.<p>
	 *
	 */
	public static final String $from_slo_reg = "from_slo_reg";


	public static final MCMeta trd_ptn_typ_META = createCommonMeta($trd_ptn_typ, mcframe.commonMA.meta.MA_META.TRD_PTN_TYP);
	public static final MCMeta hdr_dlv_cd_META = createCommonMeta($hdr_dlv_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta hdr_dlv_nm_META = createCommonMeta($hdr_dlv_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta hdr_dlv_sundry_flg_META = createCommonMeta($hdr_dlv_sundry_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta hdr_pri_prnt_flg_META = createCommonMeta($hdr_pri_prnt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta hdr_dlv_lg_grp_cd_META = createCommonMeta($hdr_dlv_lg_grp_cd, mcframe.commonMA.meta.MA_META.LG_GRP_CD);
	public static final MCMeta hdr_dlv_lg_grp_nm_META = createCommonMeta($hdr_dlv_lg_grp_nm, mcframe.commonMA.meta.MA_META.LG_GRP_NM);
	public static final MCMeta hdr_dlv_cntry_cd_META = createCommonMeta($hdr_dlv_cntry_cd, mcframe.commonMA.meta.MA_META.CNTRY_CD);
	public static final MCMeta hdr_dlv_cntry_nm_META = createCommonMeta($hdr_dlv_cntry_nm, mcframe.commonMA.meta.MA_META.CNTRY_NM);
	public static final MCMeta hdr_dlv_zip_cd_META = createCommonMeta($hdr_dlv_zip_cd, mcframe.commonMA.meta.MA_META.ZIP_CD);
	public static final MCMeta hdr_dlv_addr1_META = createCommonMeta($hdr_dlv_addr1, mcframe.commonMA.meta.MA_META.ADDR1);
	public static final MCMeta hdr_dlv_addr2_META = createCommonMeta($hdr_dlv_addr2, mcframe.commonMA.meta.MA_META.ADDR2);
	public static final MCMeta hdr_dlv_addr3_META = createCommonMeta($hdr_dlv_addr3, mcframe.commonMA.meta.MA_META.ADDR3);
	public static final MCMeta hdr_dlv_addr4_META = createCommonMeta($hdr_dlv_addr4, mcframe.commonMA.meta.MA_META.ADDR4);
	public static final MCMeta hdr_dlv_tel_META = createCommonMeta($hdr_dlv_tel, mcframe.commonMA.meta.MA_META.TEL);
	public static final MCMeta hdr_dlv_fax_META = createCommonMeta($hdr_dlv_fax, mcframe.commonMA.meta.MA_META.TEL);
	public static final MCMeta hdr_dlv_cntct_dpt_META = createCommonMeta($hdr_dlv_cntct_dpt, mcframe.commonMA.meta.MA_META.CNTCT_DPT);
	public static final MCMeta hdr_dlv_cntct_psn_META = createCommonMeta($hdr_dlv_cntct_psn, mcframe.commonMA.meta.MA_META.CNTCT_PSN);
	public static final MCMeta hdr_prnt_lcl_cd_META = createCommonMeta($hdr_prnt_lcl_cd, mcframe.commonMA.meta.MA_META.LCL_CD);
	public static final MCMeta hdr_dest_cd1_META = createCommonMeta($hdr_dest_cd1, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta hdr_dest_nm1_META = createCommonMeta($hdr_dest_nm1, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta hdr_dest_cd2_META = createCommonMeta($hdr_dest_cd2, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta hdr_dest_nm2_META = createCommonMeta($hdr_dest_nm2, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta hdr_dest_cd3_META = createCommonMeta($hdr_dest_cd3, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta hdr_dest_nm3_META = createCommonMeta($hdr_dest_nm3, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta hdr_tdlv_cd_META = createCommonMeta($hdr_tdlv_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta hdr_tdlv_nm_META = createCommonMeta($hdr_tdlv_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta hdr_tdlv_sundry_flg_META = createCommonMeta($hdr_tdlv_sundry_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta hdr_tdlv_lg_grp_cd_META = createCommonMeta($hdr_tdlv_lg_grp_cd, mcframe.commonMA.meta.MA_META.LG_GRP_CD);
	public static final MCMeta hdr_tdlv_lg_grp_nm_META = createCommonMeta($hdr_tdlv_lg_grp_nm, mcframe.commonMA.meta.MA_META.LG_GRP_NM);
	public static final MCMeta hdr_tdlv_cntry_cd_META = createCommonMeta($hdr_tdlv_cntry_cd, mcframe.commonMA.meta.MA_META.CNTRY_CD);
	public static final MCMeta hdr_tdlv_cntry_nm_META = createCommonMeta($hdr_tdlv_cntry_nm, mcframe.commonMA.meta.MA_META.CNTRY_NM);
	public static final MCMeta hdr_tdlv_zip_cd_META = createCommonMeta($hdr_tdlv_zip_cd, mcframe.commonMA.meta.MA_META.ZIP_CD);
	public static final MCMeta hdr_tdlv_addr1_META = createCommonMeta($hdr_tdlv_addr1, mcframe.commonMA.meta.MA_META.ADDR1);
	public static final MCMeta hdr_tdlv_addr2_META = createCommonMeta($hdr_tdlv_addr2, mcframe.commonMA.meta.MA_META.ADDR2);
	public static final MCMeta hdr_tdlv_addr3_META = createCommonMeta($hdr_tdlv_addr3, mcframe.commonMA.meta.MA_META.ADDR3);
	public static final MCMeta hdr_tdlv_addr4_META = createCommonMeta($hdr_tdlv_addr4, mcframe.commonMA.meta.MA_META.ADDR4);
	public static final MCMeta hdr_tdlv_tel_META = createCommonMeta($hdr_tdlv_tel, mcframe.commonMA.meta.MA_META.TEL);
	public static final MCMeta hdr_tdlv_fax_META = createCommonMeta($hdr_tdlv_fax, mcframe.commonMA.meta.MA_META.TEL);
	public static final MCMeta hdr_tdlv_cntct_dpt_META = createCommonMeta($hdr_tdlv_cntct_dpt, mcframe.commonMA.meta.MA_META.CNTCT_DPT);
	public static final MCMeta hdr_tdlv_cntct_psn_META = createCommonMeta($hdr_tdlv_cntct_psn, mcframe.commonMA.meta.MA_META.CNTCT_PSN);
	public static final MCMeta hdr_via_dlv_typ_META = createCommonMeta($hdr_via_dlv_typ, mcframe.commonMA.meta.MA_META.VIA_DLV_TYP);
	public static final MCMeta hdr_via_dlv_typ_nm_META = createCommonMeta($hdr_via_dlv_typ_nm, mcframe.commonMA.meta.MA_META.VIA_DLV_TYP_NM);
	public static final MCMeta hdr_tdlv_req_flg_META = createCommonMeta($hdr_tdlv_req_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sls_basis_typ_META = createCommonMeta($sls_basis_typ, mcframe.commonMA.meta.MA_META.SLS_BASIS_TYP);
	public static final MCMeta hdr_wg_cd_META = createCommonMeta($hdr_wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta trd_cur_cd_META = createCommonMeta($trd_cur_cd, mcframe.commonMA.meta.MA_META.CUR_CD);
	public static final MCMeta base_cur_cd_META = createCommonMeta($base_cur_cd, mcframe.commonMA.meta.MA_META.CUR_CD);
	public static final MCMeta ptax_cur_cd_META = createCommonMeta($ptax_cur_cd, mcframe.commonMA.meta.MA_META.CUR_CD);
	public static final MCMeta cst_iv_flg_META = createCommonMeta($cst_iv_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta cst_bill_crryovr_times_META = createCommonMeta($cst_bill_crryovr_times, mcframe.commonMA.meta.MA_META.CRRYOVR_TIMES);
	public static final MCMeta hdr_sls_upri_req_typ_META = createCommonMeta($hdr_sls_upri_req_typ, mcframe.commonMA.meta.MA_META.SLS_UPRI_REQ_TYP);
	public static final MCMeta hdr_ship_schd_split_typ_META = createCommonMeta($hdr_ship_schd_split_typ, mcframe.commonMA.meta.MA_META.SHIP_SCHD_SPLIT_TYP);
	public static final MCMeta assort_typ_META = createCommonMeta($assort_typ, mcframe.commonMS.meta.MS_META.SHIP_ASSORT_TYP);
	public static final MCMeta iv_no_META = createCommonMeta($iv_no, mcframe.commonMA.meta.MA_META.IV_NO);
	public static final MCMeta iv_num_flg_META = createCommonMeta($iv_num_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta hdr_ship_rqst_dt_META = createCommonMeta($hdr_ship_rqst_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta hdr_ship_rqst_hm_META = createCommonMeta($hdr_ship_rqst_hm, mcframe.commonMA.meta.MA_META.HM);
	public static final MCMeta hdr_dlv_rqst_dt_META = createCommonMeta($hdr_dlv_rqst_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta hdr_dlv_rqst_hm_META = createCommonMeta($hdr_dlv_rqst_hm, mcframe.commonMA.meta.MA_META.HM);
	public static final MCMeta hdr_dlv_day_week_typ_META = createCommonMeta($hdr_dlv_day_week_typ, mcframe.commonMA.meta.MA_META.DAY_WEEK_TYP);
	public static final MCMeta hdr_dlv_day_week_typ_nm_META = createCommonMeta($hdr_dlv_day_week_typ_nm, mcframe.commonMA.meta.MA_META.DAY_WEEK_TYP_NM);
	public static final MCMeta vmi_flg_META = createCommonMeta($vmi_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta trd_unit_qty_META = createCommonMeta($trd_unit_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta trd_cur_upri_META = createCommonMeta($trd_cur_upri, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta tax_cd_META = createCommonMeta($tax_cd, mcframe.commonMA.meta.MA_META.TAX_CD);
	public static final MCMeta tax_nm_META = createCommonMeta($tax_nm, mcframe.commonMA.meta.MA_META.TAX_NM);
	public static final MCMeta tax_rate_META = createCommonMeta($tax_rate, mcframe.commonMA.meta.MA_META.TAX_RATE);
	public static final MCMeta tax_typ_META = createCommonMeta($tax_typ, mcframe.commonMA.meta.MA_META.TAX_TYP);
	public static final MCMeta inc_tax_flg_META = createCommonMeta($inc_tax_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta dscnt_rsn_cd_META = createCommonMeta($dscnt_rsn_cd, mcframe.commonMA.meta.MA_META.BIZ_RSN_CD);
	public static final MCMeta dscnt_rsn_nm_META = createCommonMeta($dscnt_rsn_nm, mcframe.commonMA.meta.MA_META.BIZ_RSN_NM);
	public static final MCMeta cost_upri_META = createCommonMeta($cost_upri, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta bill_crryovr_times_META = createCommonMeta($bill_crryovr_times, mcframe.commonMA.meta.MA_META.CRRYOVR_TIMES);
	public static final MCMeta set_itm_grp_no_META = createCommonMeta($set_itm_grp_no, mcframe.commonMA.meta.MA_META.SET_ITM_GRP_NO);
	public static final MCMeta ship_rqst_dt_META = createCommonMeta($ship_rqst_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta is_editable_ship_rqst_dt_META = createCommonMeta($is_editable_ship_rqst_dt, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta ship_rqst_hm_META = createCommonMeta($ship_rqst_hm, mcframe.commonMA.meta.MA_META.HM);
	public static final MCMeta is_editable_ship_rqst_hm_META = createCommonMeta($is_editable_ship_rqst_hm, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta dlv_rqst_dt_META = createCommonMeta($dlv_rqst_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta is_editable_dlv_rqst_dt_META = createCommonMeta($is_editable_dlv_rqst_dt, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta dlv_rqst_hm_META = createCommonMeta($dlv_rqst_hm, mcframe.commonMA.meta.MA_META.HM);
	public static final MCMeta is_editable_dlv_rqst_hm_META = createCommonMeta($is_editable_dlv_rqst_hm, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta dlv_day_week_typ_META = createCommonMeta($dlv_day_week_typ, mcframe.commonMA.meta.MA_META.DAY_WEEK_TYP);
	public static final MCMeta dlv_day_week_typ_nm_META = createCommonMeta($dlv_day_week_typ_nm, mcframe.commonMA.meta.MA_META.DAY_WEEK_TYP_NM);
	public static final MCMeta is_editable_dlv_day_week_typ_nm_META = createCommonMeta($is_editable_dlv_day_week_typ_nm, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sls_schd_dt_META = createCommonMeta($sls_schd_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta is_editable_dlv_cd_META = createCommonMeta($is_editable_dlv_cd, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta dlv_cd_META = createCommonMeta($dlv_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta dlv_nm_META = createCommonMeta($dlv_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta dlv_sundry_flg_META = createCommonMeta($dlv_sundry_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta pri_prnt_flg_META = createCommonMeta($pri_prnt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta dlv_lg_grp_cd_META = createCommonMeta($dlv_lg_grp_cd, mcframe.commonMA.meta.MA_META.LG_GRP_CD);
	public static final MCMeta dlv_lg_grp_nm_META = createCommonMeta($dlv_lg_grp_nm, mcframe.commonMA.meta.MA_META.LG_GRP_NM);
	public static final MCMeta dlv_cntry_cd_META = createCommonMeta($dlv_cntry_cd, mcframe.commonMA.meta.MA_META.CNTRY_CD);
	public static final MCMeta dlv_cntry_nm_META = createCommonMeta($dlv_cntry_nm, mcframe.commonMA.meta.MA_META.CNTRY_NM);
	public static final MCMeta dlv_zip_cd_META = createCommonMeta($dlv_zip_cd, mcframe.commonMA.meta.MA_META.ZIP_CD);
	public static final MCMeta dlv_addr1_META = createCommonMeta($dlv_addr1, mcframe.commonMA.meta.MA_META.ADDR1);
	public static final MCMeta dlv_addr2_META = createCommonMeta($dlv_addr2, mcframe.commonMA.meta.MA_META.ADDR2);
	public static final MCMeta dlv_addr3_META = createCommonMeta($dlv_addr3, mcframe.commonMA.meta.MA_META.ADDR3);
	public static final MCMeta dlv_addr4_META = createCommonMeta($dlv_addr4, mcframe.commonMA.meta.MA_META.ADDR4);
	public static final MCMeta dlv_tel_META = createCommonMeta($dlv_tel, mcframe.commonMA.meta.MA_META.TEL);
	public static final MCMeta dlv_fax_META = createCommonMeta($dlv_fax, mcframe.commonMA.meta.MA_META.TEL);
	public static final MCMeta dlv_cntct_dpt_META = createCommonMeta($dlv_cntct_dpt, mcframe.commonMA.meta.MA_META.CNTCT_DPT);
	public static final MCMeta dlv_cntct_psn_META = createCommonMeta($dlv_cntct_psn, mcframe.commonMA.meta.MA_META.CNTCT_PSN);
	public static final MCMeta prnt_lcl_cd_META = createCommonMeta($prnt_lcl_cd, mcframe.commonMA.meta.MA_META.LCL_CD);
	public static final MCMeta tdlv_req_flg_META = createCommonMeta($tdlv_req_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta is_editable_dest_cd1_META = createCommonMeta($is_editable_dest_cd1, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta dest_cd1_META = createCommonMeta($dest_cd1, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta dest_nm1_META = createCommonMeta($dest_nm1, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta is_editable_dest_cd2_META = createCommonMeta($is_editable_dest_cd2, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta dest_cd2_META = createCommonMeta($dest_cd2, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta dest_nm2_META = createCommonMeta($dest_nm2, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta is_editable_dest_cd3_META = createCommonMeta($is_editable_dest_cd3, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta dest_cd3_META = createCommonMeta($dest_cd3, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta dest_nm3_META = createCommonMeta($dest_nm3, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta is_editable_tdlv_cd_META = createCommonMeta($is_editable_tdlv_cd, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta tdlv_cd_META = createCommonMeta($tdlv_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta tdlv_nm_META = createCommonMeta($tdlv_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta tdlv_sundry_flg_META = createCommonMeta($tdlv_sundry_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta tdlv_lg_grp_cd_META = createCommonMeta($tdlv_lg_grp_cd, mcframe.commonMA.meta.MA_META.LG_GRP_CD);
	public static final MCMeta tdlv_lg_grp_nm_META = createCommonMeta($tdlv_lg_grp_nm, mcframe.commonMA.meta.MA_META.LG_GRP_NM);
	public static final MCMeta tdlv_cntry_cd_META = createCommonMeta($tdlv_cntry_cd, mcframe.commonMA.meta.MA_META.CNTRY_CD);
	public static final MCMeta tdlv_cntry_nm_META = createCommonMeta($tdlv_cntry_nm, mcframe.commonMA.meta.MA_META.CNTRY_NM);
	public static final MCMeta tdlv_zip_cd_META = createCommonMeta($tdlv_zip_cd, mcframe.commonMA.meta.MA_META.ZIP_CD);
	public static final MCMeta tdlv_addr1_META = createCommonMeta($tdlv_addr1, mcframe.commonMA.meta.MA_META.ADDR1);
	public static final MCMeta tdlv_addr2_META = createCommonMeta($tdlv_addr2, mcframe.commonMA.meta.MA_META.ADDR2);
	public static final MCMeta tdlv_addr3_META = createCommonMeta($tdlv_addr3, mcframe.commonMA.meta.MA_META.ADDR3);
	public static final MCMeta tdlv_addr4_META = createCommonMeta($tdlv_addr4, mcframe.commonMA.meta.MA_META.ADDR4);
	public static final MCMeta tdlv_tel_META = createCommonMeta($tdlv_tel, mcframe.commonMA.meta.MA_META.TEL);
	public static final MCMeta tdlv_fax_META = createCommonMeta($tdlv_fax, mcframe.commonMA.meta.MA_META.TEL);
	public static final MCMeta tdlv_cntct_dpt_META = createCommonMeta($tdlv_cntct_dpt, mcframe.commonMA.meta.MA_META.CNTCT_DPT);
	public static final MCMeta tdlv_cntct_psn_META = createCommonMeta($tdlv_cntct_psn, mcframe.commonMA.meta.MA_META.CNTCT_PSN);
	public static final MCMeta via_dlv_typ_META = createCommonMeta($via_dlv_typ, mcframe.commonMA.meta.MA_META.VIA_DLV_TYP);
	public static final MCMeta via_dlv_typ_nm_META = createCommonMeta($via_dlv_typ_nm, mcframe.commonMA.meta.MA_META.VIA_DLV_TYP_NM);
	public static final MCMeta sls_cststk_flg_META = createCommonMeta($sls_cststk_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta proc_typ_META = createCommonMeta($proc_typ, mcframe.commonMA.meta.MA_META.SLO_PROC_TYP);
	public static final MCMeta ship_schd_split_typ_META = createCommonMeta($ship_schd_split_typ, mcframe.commonMA.meta.MA_META.SHIP_SCHD_SPLIT_TYP);
	public static final MCMeta alloc_scope_typ_META = createCommonMeta($alloc_scope_typ, mcframe.commonMA.meta.MA_META.ALLOC_SCOPE_TYP);
	public static final MCMeta alloc_typ_META = createCommonMeta($alloc_typ, mcframe.commonMA.meta.MA_META.ALLOC_TYP);
	public static final MCMeta sls_upri_req_typ_META = createCommonMeta($sls_upri_req_typ, mcframe.commonMA.meta.MA_META.SLS_UPRI_REQ_TYP);
	public static final MCMeta from_slo_reg_META = createCommonMeta($from_slo_reg, mcframe.commonMA.meta.MA_META.FLG);

	protected static final ConstMetaList<CndR> constMetas = new ConstMetaList<CndR>(
		mcframe.clientMAUA.MAUAP1010.CndR.constMetas,
		new MCMeta[]{
			trd_ptn_typ_META,
			hdr_dlv_cd_META,
			hdr_dlv_nm_META,
			hdr_dlv_sundry_flg_META,
			hdr_pri_prnt_flg_META,
			hdr_dlv_lg_grp_cd_META,
			hdr_dlv_lg_grp_nm_META,
			hdr_dlv_cntry_cd_META,
			hdr_dlv_cntry_nm_META,
			hdr_dlv_zip_cd_META,
			hdr_dlv_addr1_META,
			hdr_dlv_addr2_META,
			hdr_dlv_addr3_META,
			hdr_dlv_addr4_META,
			hdr_dlv_tel_META,
			hdr_dlv_fax_META,
			hdr_dlv_cntct_dpt_META,
			hdr_dlv_cntct_psn_META,
			hdr_prnt_lcl_cd_META,
			hdr_dest_cd1_META,
			hdr_dest_nm1_META,
			hdr_dest_cd2_META,
			hdr_dest_nm2_META,
			hdr_dest_cd3_META,
			hdr_dest_nm3_META,
			hdr_tdlv_cd_META,
			hdr_tdlv_nm_META,
			hdr_tdlv_sundry_flg_META,
			hdr_tdlv_lg_grp_cd_META,
			hdr_tdlv_lg_grp_nm_META,
			hdr_tdlv_cntry_cd_META,
			hdr_tdlv_cntry_nm_META,
			hdr_tdlv_zip_cd_META,
			hdr_tdlv_addr1_META,
			hdr_tdlv_addr2_META,
			hdr_tdlv_addr3_META,
			hdr_tdlv_addr4_META,
			hdr_tdlv_tel_META,
			hdr_tdlv_fax_META,
			hdr_tdlv_cntct_dpt_META,
			hdr_tdlv_cntct_psn_META,
			hdr_via_dlv_typ_META,
			hdr_via_dlv_typ_nm_META,
			hdr_tdlv_req_flg_META,
			sls_basis_typ_META,
			hdr_wg_cd_META,
			trd_cur_cd_META,
			base_cur_cd_META,
			ptax_cur_cd_META,
			cst_iv_flg_META,
			cst_bill_crryovr_times_META,
			hdr_sls_upri_req_typ_META,
			hdr_ship_schd_split_typ_META,
			assort_typ_META,
			iv_no_META,
			iv_num_flg_META,
			hdr_ship_rqst_dt_META,
			hdr_ship_rqst_hm_META,
			hdr_dlv_rqst_dt_META,
			hdr_dlv_rqst_hm_META,
			hdr_dlv_day_week_typ_META,
			hdr_dlv_day_week_typ_nm_META,
			vmi_flg_META,
			trd_unit_qty_META,
			trd_cur_upri_META,
			tax_cd_META,
			tax_nm_META,
			tax_rate_META,
			tax_typ_META,
			inc_tax_flg_META,
			dscnt_rsn_cd_META,
			dscnt_rsn_nm_META,
			cost_upri_META,
			bill_crryovr_times_META,
			set_itm_grp_no_META,
			ship_rqst_dt_META,
			is_editable_ship_rqst_dt_META,
			ship_rqst_hm_META,
			is_editable_ship_rqst_hm_META,
			dlv_rqst_dt_META,
			is_editable_dlv_rqst_dt_META,
			dlv_rqst_hm_META,
			is_editable_dlv_rqst_hm_META,
			dlv_day_week_typ_META,
			dlv_day_week_typ_nm_META,
			is_editable_dlv_day_week_typ_nm_META,
			sls_schd_dt_META,
			is_editable_dlv_cd_META,
			dlv_cd_META,
			dlv_nm_META,
			dlv_sundry_flg_META,
			pri_prnt_flg_META,
			dlv_lg_grp_cd_META,
			dlv_lg_grp_nm_META,
			dlv_cntry_cd_META,
			dlv_cntry_nm_META,
			dlv_zip_cd_META,
			dlv_addr1_META,
			dlv_addr2_META,
			dlv_addr3_META,
			dlv_addr4_META,
			dlv_tel_META,
			dlv_fax_META,
			dlv_cntct_dpt_META,
			dlv_cntct_psn_META,
			prnt_lcl_cd_META,
			tdlv_req_flg_META,
			is_editable_dest_cd1_META,
			dest_cd1_META,
			dest_nm1_META,
			is_editable_dest_cd2_META,
			dest_cd2_META,
			dest_nm2_META,
			is_editable_dest_cd3_META,
			dest_cd3_META,
			dest_nm3_META,
			is_editable_tdlv_cd_META,
			tdlv_cd_META,
			tdlv_nm_META,
			tdlv_sundry_flg_META,
			tdlv_lg_grp_cd_META,
			tdlv_lg_grp_nm_META,
			tdlv_cntry_cd_META,
			tdlv_cntry_nm_META,
			tdlv_zip_cd_META,
			tdlv_addr1_META,
			tdlv_addr2_META,
			tdlv_addr3_META,
			tdlv_addr4_META,
			tdlv_tel_META,
			tdlv_fax_META,
			tdlv_cntct_dpt_META,
			tdlv_cntct_psn_META,
			via_dlv_typ_META,
			via_dlv_typ_nm_META,
			sls_cststk_flg_META,
			proc_typ_META,
			ship_schd_split_typ_META,
			alloc_scope_typ_META,
			alloc_typ_META,
			sls_upri_req_typ_META,
			from_slo_reg_META
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
		mcframe.clientMAUA.MAUAP1010.CndR.KEYS,
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
		mcframe.clientMAUA.MAUAP1010.CndR.EXTMAP,
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
	 * Transaction pattern type 取引パタン区分.<p>
	 *
	 */
	public String trd_ptn_typ() {
		return getConstString(offset + 0, $trd_ptn_typ);
	}

	/**
	 * Transaction pattern type 取引パタン区分.<p>
	 *
	 */
	public void trd_ptn_typ(String value) {
		setConstString(offset + 0, $trd_ptn_typ, value);
	}


	/**
	 * Delivery destination cd. (Header) 納品先ＣＤ（ヘッダ）.<p>
	 *
	 */
	public String hdr_dlv_cd() {
		return getConstString(offset + 1, $hdr_dlv_cd);
	}

	/**
	 * Delivery destination cd. (Header) 納品先ＣＤ（ヘッダ）.<p>
	 *
	 */
	public void hdr_dlv_cd(String value) {
		setConstString(offset + 1, $hdr_dlv_cd, value);
	}


	/**
	 * Delivery destination name (Header) 納品先名（ヘッダ）.<p>
	 *
	 */
	public String hdr_dlv_nm() {
		return getConstString(offset + 2, $hdr_dlv_nm);
	}

	/**
	 * Delivery destination name (Header) 納品先名（ヘッダ）.<p>
	 *
	 */
	public void hdr_dlv_nm(String value) {
		setConstString(offset + 2, $hdr_dlv_nm, value);
	}


	/**
	 * Miscellaneous delivery destination (Header) 納品先諸口（ヘッダ）.<p>
	 *
	 */
	public boolean hdr_dlv_sundry_flg() {
		return getConstBoolean(offset + 3, $hdr_dlv_sundry_flg);
	}

	/**
	 * Miscellaneous delivery destination (Header) 納品先諸口（ヘッダ）.<p>
	 *
	 */
	public void hdr_dlv_sundry_flg(boolean value) {
		setConstBoolean(offset + 3, $hdr_dlv_sundry_flg, value);
	}


	/**
	 * Print price (Header) 価格印字（ヘッダ）.<p>
	 *
	 */
	public boolean hdr_pri_prnt_flg() {
		return getConstBoolean(offset + 4, $hdr_pri_prnt_flg);
	}

	/**
	 * Print price (Header) 価格印字（ヘッダ）.<p>
	 *
	 */
	public void hdr_pri_prnt_flg(boolean value) {
		setConstBoolean(offset + 4, $hdr_pri_prnt_flg, value);
	}


	/**
	 * Delivery destination distribution group cd. (Header) 納品先物流グループＣＤ（ヘッダ）.<p>
	 *
	 */
	public String hdr_dlv_lg_grp_cd() {
		return getConstString(offset + 5, $hdr_dlv_lg_grp_cd);
	}

	/**
	 * Delivery destination distribution group cd. (Header) 納品先物流グループＣＤ（ヘッダ）.<p>
	 *
	 */
	public void hdr_dlv_lg_grp_cd(String value) {
		setConstString(offset + 5, $hdr_dlv_lg_grp_cd, value);
	}


	/**
	 * Delivery destination distribution group name (Header) 納品先物流グループ名（ヘッダ）.<p>
	 *
	 */
	public String hdr_dlv_lg_grp_nm() {
		return getConstString(offset + 6, $hdr_dlv_lg_grp_nm);
	}

	/**
	 * Delivery destination distribution group name (Header) 納品先物流グループ名（ヘッダ）.<p>
	 *
	 */
	public void hdr_dlv_lg_grp_nm(String value) {
		setConstString(offset + 6, $hdr_dlv_lg_grp_nm, value);
	}


	/**
	 * Delivery destination country cd. (Header) 納品先国ＣＤ（ヘッダ）.<p>
	 *
	 */
	public String hdr_dlv_cntry_cd() {
		return getConstString(offset + 7, $hdr_dlv_cntry_cd);
	}

	/**
	 * Delivery destination country cd. (Header) 納品先国ＣＤ（ヘッダ）.<p>
	 *
	 */
	public void hdr_dlv_cntry_cd(String value) {
		setConstString(offset + 7, $hdr_dlv_cntry_cd, value);
	}


	/**
	 * Delivery destination country name (Header) 納品先国名（ヘッダ）.<p>
	 *
	 */
	public String hdr_dlv_cntry_nm() {
		return getConstString(offset + 8, $hdr_dlv_cntry_nm);
	}

	/**
	 * Delivery destination country name (Header) 納品先国名（ヘッダ）.<p>
	 *
	 */
	public void hdr_dlv_cntry_nm(String value) {
		setConstString(offset + 8, $hdr_dlv_cntry_nm, value);
	}


	/**
	 * Delivery destination zip code (Header) 納品先郵便番号（ヘッダ）.<p>
	 *
	 */
	public String hdr_dlv_zip_cd() {
		return getConstString(offset + 9, $hdr_dlv_zip_cd);
	}

	/**
	 * Delivery destination zip code (Header) 納品先郵便番号（ヘッダ）.<p>
	 *
	 */
	public void hdr_dlv_zip_cd(String value) {
		setConstString(offset + 9, $hdr_dlv_zip_cd, value);
	}


	/**
	 * Delivery destination address 1 (Header) 納品先住所１（ヘッダ）.<p>
	 *
	 */
	public String hdr_dlv_addr1() {
		return getConstString(offset + 10, $hdr_dlv_addr1);
	}

	/**
	 * Delivery destination address 1 (Header) 納品先住所１（ヘッダ）.<p>
	 *
	 */
	public void hdr_dlv_addr1(String value) {
		setConstString(offset + 10, $hdr_dlv_addr1, value);
	}


	/**
	 * Delivery destination address 2 (Header) 納品先住所２（ヘッダ）.<p>
	 *
	 */
	public String hdr_dlv_addr2() {
		return getConstString(offset + 11, $hdr_dlv_addr2);
	}

	/**
	 * Delivery destination address 2 (Header) 納品先住所２（ヘッダ）.<p>
	 *
	 */
	public void hdr_dlv_addr2(String value) {
		setConstString(offset + 11, $hdr_dlv_addr2, value);
	}


	/**
	 * Delivery destination address 3 (Header) 納品先住所３（ヘッダ）.<p>
	 *
	 */
	public String hdr_dlv_addr3() {
		return getConstString(offset + 12, $hdr_dlv_addr3);
	}

	/**
	 * Delivery destination address 3 (Header) 納品先住所３（ヘッダ）.<p>
	 *
	 */
	public void hdr_dlv_addr3(String value) {
		setConstString(offset + 12, $hdr_dlv_addr3, value);
	}


	/**
	 * Delivery destination address 4 (Header) 納品先住所４（ヘッダ）.<p>
	 *
	 */
	public String hdr_dlv_addr4() {
		return getConstString(offset + 13, $hdr_dlv_addr4);
	}

	/**
	 * Delivery destination address 4 (Header) 納品先住所４（ヘッダ）.<p>
	 *
	 */
	public void hdr_dlv_addr4(String value) {
		setConstString(offset + 13, $hdr_dlv_addr4, value);
	}


	/**
	 * Delivery destination TEL (Header) 納品先ＴＥＬ（ヘッダ）.<p>
	 *
	 */
	public String hdr_dlv_tel() {
		return getConstString(offset + 14, $hdr_dlv_tel);
	}

	/**
	 * Delivery destination TEL (Header) 納品先ＴＥＬ（ヘッダ）.<p>
	 *
	 */
	public void hdr_dlv_tel(String value) {
		setConstString(offset + 14, $hdr_dlv_tel, value);
	}


	/**
	 * Delivery destination FAX (Header) 納品先ＦＡＸ（ヘッダ）.<p>
	 *
	 */
	public String hdr_dlv_fax() {
		return getConstString(offset + 15, $hdr_dlv_fax);
	}

	/**
	 * Delivery destination FAX (Header) 納品先ＦＡＸ（ヘッダ）.<p>
	 *
	 */
	public void hdr_dlv_fax(String value) {
		setConstString(offset + 15, $hdr_dlv_fax, value);
	}


	/**
	 * Delivery destination dept. (Header) 納品先部署（ヘッダ）.<p>
	 *
	 */
	public String hdr_dlv_cntct_dpt() {
		return getConstString(offset + 16, $hdr_dlv_cntct_dpt);
	}

	/**
	 * Delivery destination dept. (Header) 納品先部署（ヘッダ）.<p>
	 *
	 */
	public void hdr_dlv_cntct_dpt(String value) {
		setConstString(offset + 16, $hdr_dlv_cntct_dpt, value);
	}


	/**
	 * Delivery destination PIC (Header) 納品先担当者（ヘッダ）.<p>
	 *
	 */
	public String hdr_dlv_cntct_psn() {
		return getConstString(offset + 17, $hdr_dlv_cntct_psn);
	}

	/**
	 * Delivery destination PIC (Header) 納品先担当者（ヘッダ）.<p>
	 *
	 */
	public void hdr_dlv_cntct_psn(String value) {
		setConstString(offset + 17, $hdr_dlv_cntct_psn, value);
	}


	/**
	 * Report output locale cd. (Header) 帳票出力ロケールＣＤ（ヘッダ）.<p>
	 *
	 */
	public String hdr_prnt_lcl_cd() {
		return getConstString(offset + 18, $hdr_prnt_lcl_cd);
	}

	/**
	 * Report output locale cd. (Header) 帳票出力ロケールＣＤ（ヘッダ）.<p>
	 *
	 */
	public void hdr_prnt_lcl_cd(String value) {
		setConstString(offset + 18, $hdr_prnt_lcl_cd, value);
	}


	/**
	 * Distribution channel cd. 1 (Header) 仕向先ＣＤ１（ヘッダ）.<p>
	 *
	 */
	public String hdr_dest_cd1() {
		return getConstString(offset + 19, $hdr_dest_cd1);
	}

	/**
	 * Distribution channel cd. 1 (Header) 仕向先ＣＤ１（ヘッダ）.<p>
	 *
	 */
	public void hdr_dest_cd1(String value) {
		setConstString(offset + 19, $hdr_dest_cd1, value);
	}


	/**
	 * Distribution channel name 1 (Header) 仕向先１名（ヘッダ）.<p>
	 *
	 */
	public String hdr_dest_nm1() {
		return getConstString(offset + 20, $hdr_dest_nm1);
	}

	/**
	 * Distribution channel name 1 (Header) 仕向先１名（ヘッダ）.<p>
	 *
	 */
	public void hdr_dest_nm1(String value) {
		setConstString(offset + 20, $hdr_dest_nm1, value);
	}


	/**
	 * Distribution channel cd. 2 (Header) 仕向先ＣＤ２（ヘッダ）.<p>
	 *
	 */
	public String hdr_dest_cd2() {
		return getConstString(offset + 21, $hdr_dest_cd2);
	}

	/**
	 * Distribution channel cd. 2 (Header) 仕向先ＣＤ２（ヘッダ）.<p>
	 *
	 */
	public void hdr_dest_cd2(String value) {
		setConstString(offset + 21, $hdr_dest_cd2, value);
	}


	/**
	 * Distribution channel name 2 (Header) 仕向先２名（ヘッダ）.<p>
	 *
	 */
	public String hdr_dest_nm2() {
		return getConstString(offset + 22, $hdr_dest_nm2);
	}

	/**
	 * Distribution channel name 2 (Header) 仕向先２名（ヘッダ）.<p>
	 *
	 */
	public void hdr_dest_nm2(String value) {
		setConstString(offset + 22, $hdr_dest_nm2, value);
	}


	/**
	 * Distribution channel cd. 3 (Header) 仕向先ＣＤ３（ヘッダ）.<p>
	 *
	 */
	public String hdr_dest_cd3() {
		return getConstString(offset + 23, $hdr_dest_cd3);
	}

	/**
	 * Distribution channel cd. 3 (Header) 仕向先ＣＤ３（ヘッダ）.<p>
	 *
	 */
	public void hdr_dest_cd3(String value) {
		setConstString(offset + 23, $hdr_dest_cd3, value);
	}


	/**
	 * Distribution channel name 3 (Header) 仕向先３名（ヘッダ）.<p>
	 *
	 */
	public String hdr_dest_nm3() {
		return getConstString(offset + 24, $hdr_dest_nm3);
	}

	/**
	 * Distribution channel name 3 (Header) 仕向先３名（ヘッダ）.<p>
	 *
	 */
	public void hdr_dest_nm3(String value) {
		setConstString(offset + 24, $hdr_dest_nm3, value);
	}


	/**
	 * Receiving point cd. (Header) 配送先ＣＤ（ヘッダ）.<p>
	 *
	 */
	public String hdr_tdlv_cd() {
		return getConstString(offset + 25, $hdr_tdlv_cd);
	}

	/**
	 * Receiving point cd. (Header) 配送先ＣＤ（ヘッダ）.<p>
	 *
	 */
	public void hdr_tdlv_cd(String value) {
		setConstString(offset + 25, $hdr_tdlv_cd, value);
	}


	/**
	 * Receiving point name (Header) 配送先名（ヘッダ）.<p>
	 *
	 */
	public String hdr_tdlv_nm() {
		return getConstString(offset + 26, $hdr_tdlv_nm);
	}

	/**
	 * Receiving point name (Header) 配送先名（ヘッダ）.<p>
	 *
	 */
	public void hdr_tdlv_nm(String value) {
		setConstString(offset + 26, $hdr_tdlv_nm, value);
	}


	/**
	 * Miscellaneous receiving point (Header) 配送先諸口（ヘッダ）.<p>
	 *
	 */
	public boolean hdr_tdlv_sundry_flg() {
		return getConstBoolean(offset + 27, $hdr_tdlv_sundry_flg);
	}

	/**
	 * Miscellaneous receiving point (Header) 配送先諸口（ヘッダ）.<p>
	 *
	 */
	public void hdr_tdlv_sundry_flg(boolean value) {
		setConstBoolean(offset + 27, $hdr_tdlv_sundry_flg, value);
	}


	/**
	 * Receiving point distribution group cd. (Header) 配送先物流グループＣＤ（ヘッダ）.<p>
	 *
	 */
	public String hdr_tdlv_lg_grp_cd() {
		return getConstString(offset + 28, $hdr_tdlv_lg_grp_cd);
	}

	/**
	 * Receiving point distribution group cd. (Header) 配送先物流グループＣＤ（ヘッダ）.<p>
	 *
	 */
	public void hdr_tdlv_lg_grp_cd(String value) {
		setConstString(offset + 28, $hdr_tdlv_lg_grp_cd, value);
	}


	/**
	 * Receiving point distribution group name (Header) 配送先物流グループ名（ヘッダ）.<p>
	 *
	 */
	public String hdr_tdlv_lg_grp_nm() {
		return getConstString(offset + 29, $hdr_tdlv_lg_grp_nm);
	}

	/**
	 * Receiving point distribution group name (Header) 配送先物流グループ名（ヘッダ）.<p>
	 *
	 */
	public void hdr_tdlv_lg_grp_nm(String value) {
		setConstString(offset + 29, $hdr_tdlv_lg_grp_nm, value);
	}


	/**
	 * Receiving point country cd. (Header) 配送先国ＣＤ（ヘッダ）.<p>
	 *
	 */
	public String hdr_tdlv_cntry_cd() {
		return getConstString(offset + 30, $hdr_tdlv_cntry_cd);
	}

	/**
	 * Receiving point country cd. (Header) 配送先国ＣＤ（ヘッダ）.<p>
	 *
	 */
	public void hdr_tdlv_cntry_cd(String value) {
		setConstString(offset + 30, $hdr_tdlv_cntry_cd, value);
	}


	/**
	 * Receiving point country name (Header) 配送先国名（ヘッダ）.<p>
	 *
	 */
	public String hdr_tdlv_cntry_nm() {
		return getConstString(offset + 31, $hdr_tdlv_cntry_nm);
	}

	/**
	 * Receiving point country name (Header) 配送先国名（ヘッダ）.<p>
	 *
	 */
	public void hdr_tdlv_cntry_nm(String value) {
		setConstString(offset + 31, $hdr_tdlv_cntry_nm, value);
	}


	/**
	 * Receiving point zip code (Header) 配送先郵便番号（ヘッダ）.<p>
	 *
	 */
	public String hdr_tdlv_zip_cd() {
		return getConstString(offset + 32, $hdr_tdlv_zip_cd);
	}

	/**
	 * Receiving point zip code (Header) 配送先郵便番号（ヘッダ）.<p>
	 *
	 */
	public void hdr_tdlv_zip_cd(String value) {
		setConstString(offset + 32, $hdr_tdlv_zip_cd, value);
	}


	/**
	 * Receiving point address 1 (Header) 配送先住所１（ヘッダ）.<p>
	 *
	 */
	public String hdr_tdlv_addr1() {
		return getConstString(offset + 33, $hdr_tdlv_addr1);
	}

	/**
	 * Receiving point address 1 (Header) 配送先住所１（ヘッダ）.<p>
	 *
	 */
	public void hdr_tdlv_addr1(String value) {
		setConstString(offset + 33, $hdr_tdlv_addr1, value);
	}


	/**
	 * Receiving point address 2 (Header) 配送先住所２（ヘッダ）.<p>
	 *
	 */
	public String hdr_tdlv_addr2() {
		return getConstString(offset + 34, $hdr_tdlv_addr2);
	}

	/**
	 * Receiving point address 2 (Header) 配送先住所２（ヘッダ）.<p>
	 *
	 */
	public void hdr_tdlv_addr2(String value) {
		setConstString(offset + 34, $hdr_tdlv_addr2, value);
	}


	/**
	 * Receiving point address 3 (Header) 配送先住所３（ヘッダ）.<p>
	 *
	 */
	public String hdr_tdlv_addr3() {
		return getConstString(offset + 35, $hdr_tdlv_addr3);
	}

	/**
	 * Receiving point address 3 (Header) 配送先住所３（ヘッダ）.<p>
	 *
	 */
	public void hdr_tdlv_addr3(String value) {
		setConstString(offset + 35, $hdr_tdlv_addr3, value);
	}


	/**
	 * Receiving point address 4 (Header) 配送先住所４（ヘッダ）.<p>
	 *
	 */
	public String hdr_tdlv_addr4() {
		return getConstString(offset + 36, $hdr_tdlv_addr4);
	}

	/**
	 * Receiving point address 4 (Header) 配送先住所４（ヘッダ）.<p>
	 *
	 */
	public void hdr_tdlv_addr4(String value) {
		setConstString(offset + 36, $hdr_tdlv_addr4, value);
	}


	/**
	 * Receiving point TEL (Header) 配送先ＴＥＬ（ヘッダ）.<p>
	 *
	 */
	public String hdr_tdlv_tel() {
		return getConstString(offset + 37, $hdr_tdlv_tel);
	}

	/**
	 * Receiving point TEL (Header) 配送先ＴＥＬ（ヘッダ）.<p>
	 *
	 */
	public void hdr_tdlv_tel(String value) {
		setConstString(offset + 37, $hdr_tdlv_tel, value);
	}


	/**
	 * Receiving point FAX (Header) 配送先ＦＡＸ（ヘッダ）.<p>
	 *
	 */
	public String hdr_tdlv_fax() {
		return getConstString(offset + 38, $hdr_tdlv_fax);
	}

	/**
	 * Receiving point FAX (Header) 配送先ＦＡＸ（ヘッダ）.<p>
	 *
	 */
	public void hdr_tdlv_fax(String value) {
		setConstString(offset + 38, $hdr_tdlv_fax, value);
	}


	/**
	 * Receiving point dept. (Header) 配送先部署（ヘッダ）.<p>
	 *
	 */
	public String hdr_tdlv_cntct_dpt() {
		return getConstString(offset + 39, $hdr_tdlv_cntct_dpt);
	}

	/**
	 * Receiving point dept. (Header) 配送先部署（ヘッダ）.<p>
	 *
	 */
	public void hdr_tdlv_cntct_dpt(String value) {
		setConstString(offset + 39, $hdr_tdlv_cntct_dpt, value);
	}


	/**
	 * Receiving point PIC (Header) 配送先担当者（ヘッダ）.<p>
	 *
	 */
	public String hdr_tdlv_cntct_psn() {
		return getConstString(offset + 40, $hdr_tdlv_cntct_psn);
	}

	/**
	 * Receiving point PIC (Header) 配送先担当者（ヘッダ）.<p>
	 *
	 */
	public void hdr_tdlv_cntct_psn(String value) {
		setConstString(offset + 40, $hdr_tdlv_cntct_psn, value);
	}


	/**
	 * Receiving point stopover type (Header) 配送先経由区分（ヘッダ）.<p>
	 *
	 */
	public String hdr_via_dlv_typ() {
		return getConstString(offset + 41, $hdr_via_dlv_typ);
	}

	/**
	 * Receiving point stopover type (Header) 配送先経由区分（ヘッダ）.<p>
	 *
	 */
	public void hdr_via_dlv_typ(String value) {
		setConstString(offset + 41, $hdr_via_dlv_typ, value);
	}


	/**
	 * Receiving point stopover type name (header) 配送先経由区分名（ヘッダ）.<p>
	 *
	 */
	public String hdr_via_dlv_typ_nm() {
		return getConstString(offset + 42, $hdr_via_dlv_typ_nm);
	}

	/**
	 * Receiving point stopover type name (header) 配送先経由区分名（ヘッダ）.<p>
	 *
	 */
	public void hdr_via_dlv_typ_nm(String value) {
		setConstString(offset + 42, $hdr_via_dlv_typ_nm, value);
	}


	/**
	 * Receiving point required (Header) 配送先必須（ヘッダ）.<p>
	 *
	 */
	public boolean hdr_tdlv_req_flg() {
		return getConstBoolean(offset + 43, $hdr_tdlv_req_flg);
	}

	/**
	 * Receiving point required (Header) 配送先必須（ヘッダ）.<p>
	 *
	 */
	public void hdr_tdlv_req_flg(boolean value) {
		setConstBoolean(offset + 43, $hdr_tdlv_req_flg, value);
	}


	/**
	 * Revenue recording type 売上計上区分.<p>
	 *
	 */
	public String sls_basis_typ() {
		return getConstString(offset + 44, $sls_basis_typ);
	}

	/**
	 * Revenue recording type 売上計上区分.<p>
	 *
	 */
	public void sls_basis_typ(String value) {
		setConstString(offset + 44, $sls_basis_typ, value);
	}


	/**
	 * Working group cd. (Header) ワーキンググループＣＤ（ヘッダ）.<p>
	 *
	 */
	public String hdr_wg_cd() {
		return getConstString(offset + 45, $hdr_wg_cd);
	}

	/**
	 * Working group cd. (Header) ワーキンググループＣＤ（ヘッダ）.<p>
	 *
	 */
	public void hdr_wg_cd(String value) {
		setConstString(offset + 45, $hdr_wg_cd, value);
	}


	/**
	 * Transaction currency cd. 取引通貨ＣＤ.<p>
	 *
	 */
	public String trd_cur_cd() {
		return getConstString(offset + 46, $trd_cur_cd);
	}

	/**
	 * Transaction currency cd. 取引通貨ＣＤ.<p>
	 *
	 */
	public void trd_cur_cd(String value) {
		setConstString(offset + 46, $trd_cur_cd, value);
	}


	/**
	 * Base currency cd. 基準通貨ＣＤ.<p>
	 *
	 */
	public String base_cur_cd() {
		return getConstString(offset + 47, $base_cur_cd);
	}

	/**
	 * Base currency cd. 基準通貨ＣＤ.<p>
	 *
	 */
	public void base_cur_cd(String value) {
		setConstString(offset + 47, $base_cur_cd, value);
	}


	/**
	 * Taxpaying currency cd. 納税通貨ＣＤ.<p>
	 *
	 */
	public String ptax_cur_cd() {
		return getConstString(offset + 48, $ptax_cur_cd);
	}

	/**
	 * Taxpaying currency cd. 納税通貨ＣＤ.<p>
	 *
	 */
	public void ptax_cur_cd(String value) {
		setConstString(offset + 48, $ptax_cur_cd, value);
	}


	/**
	 * Customer invoice transaction 得意先インボイス取引.<p>
	 *
	 */
	public boolean cst_iv_flg() {
		return getConstBoolean(offset + 49, $cst_iv_flg);
	}

	/**
	 * Customer invoice transaction 得意先インボイス取引.<p>
	 *
	 */
	public void cst_iv_flg(boolean value) {
		setConstBoolean(offset + 49, $cst_iv_flg, value);
	}


	/**
	 * Billing carry-over count 請求繰越回数.<p>
	 *
	 */
	public MCNumber cst_bill_crryovr_times() {
		return getConstNumber(offset + 50, $cst_bill_crryovr_times);
	}

	/**
	 * Billing carry-over count 請求繰越回数.<p>
	 *
	 */
	public void cst_bill_crryovr_times(MCNumber value) {
		setConstNumber(offset + 50, $cst_bill_crryovr_times, value);
	}

	/**
	 * Billing carry-over count 請求繰越回数.<p>
	 *
	 */
	public void cst_bill_crryovr_times(int value) {
		setConstNumber(offset + 50, $cst_bill_crryovr_times, value);
	}

	/**
	 * Billing carry-over count 請求繰越回数.<p>
	 *
	 */
	public void cst_bill_crryovr_times(long value) {
		setConstNumber(offset + 50, $cst_bill_crryovr_times, value);
	}

	/**
	 * Billing carry-over count 請求繰越回数.<p>
	 *
	 */
	public void cst_bill_crryovr_times(float value) {
		setConstNumber(offset + 50, $cst_bill_crryovr_times, value);
	}

	/**
	 * Billing carry-over count 請求繰越回数.<p>
	 *
	 */
	public void cst_bill_crryovr_times(double value) {
		setConstNumber(offset + 50, $cst_bill_crryovr_times, value);
	}


	/**
	 * Sales unit price acquisition type (Header) 販売単価取得区分（ヘッダ）.<p>
	 *
	 */
	public String hdr_sls_upri_req_typ() {
		return getConstString(offset + 51, $hdr_sls_upri_req_typ);
	}

	/**
	 * Sales unit price acquisition type (Header) 販売単価取得区分（ヘッダ）.<p>
	 *
	 */
	public void hdr_sls_upri_req_typ(String value) {
		setConstString(offset + 51, $hdr_sls_upri_req_typ, value);
	}


	/**
	 * Shipping schedule split type (Header) 出荷予定分割区分（ヘッダ）.<p>
	 *
	 */
	public String hdr_ship_schd_split_typ() {
		return getConstString(offset + 52, $hdr_ship_schd_split_typ);
	}

	/**
	 * Shipping schedule split type (Header) 出荷予定分割区分（ヘッダ）.<p>
	 *
	 */
	public void hdr_ship_schd_split_typ(String value) {
		setConstString(offset + 52, $hdr_ship_schd_split_typ, value);
	}


	/**
	 * Assortment type 品揃区分.<p>
	 *
	 */
	public String assort_typ() {
		return getConstString(offset + 53, $assort_typ);
	}

	/**
	 * Assortment type 品揃区分.<p>
	 *
	 */
	public void assort_typ(String value) {
		setConstString(offset + 53, $assort_typ, value);
	}


	/**
	 * Invoice No. インボイスＮＯ.<p>
	 *
	 */
	public String iv_no() {
		return getConstString(offset + 54, $iv_no);
	}

	/**
	 * Invoice No. インボイスＮＯ.<p>
	 *
	 */
	public void iv_no(String value) {
		setConstString(offset + 54, $iv_no, value);
	}


	/**
	 * Auto 自動.<p>
	 *
	 */
	public boolean iv_num_flg() {
		return getConstBoolean(offset + 55, $iv_num_flg);
	}

	/**
	 * Auto 自動.<p>
	 *
	 */
	public void iv_num_flg(boolean value) {
		setConstBoolean(offset + 55, $iv_num_flg, value);
	}


	/**
	 * Desired shipping date (Header) 出荷希望日（ヘッダ）.<p>
	 *
	 */
	public MCDate hdr_ship_rqst_dt() {
		return getConstDate(offset + 56, $hdr_ship_rqst_dt);
	}

	/**
	 * Desired shipping date (Header) 出荷希望日（ヘッダ）.<p>
	 *
	 */
	public void hdr_ship_rqst_dt(MCDate value) {
		setConstDate(offset + 56, $hdr_ship_rqst_dt, value);
	}


	/**
	 * Desired shipping time (Header) 出荷希望時刻（ヘッダ）.<p>
	 *
	 */
	public MCDate hdr_ship_rqst_hm() {
		return getConstDate(offset + 57, $hdr_ship_rqst_hm);
	}

	/**
	 * Desired shipping time (Header) 出荷希望時刻（ヘッダ）.<p>
	 *
	 */
	public void hdr_ship_rqst_hm(MCDate value) {
		setConstDate(offset + 57, $hdr_ship_rqst_hm, value);
	}


	/**
	 * Desired delivery date (Header) 納入希望日（ヘッダ）.<p>
	 *
	 */
	public MCDate hdr_dlv_rqst_dt() {
		return getConstDate(offset + 58, $hdr_dlv_rqst_dt);
	}

	/**
	 * Desired delivery date (Header) 納入希望日（ヘッダ）.<p>
	 *
	 */
	public void hdr_dlv_rqst_dt(MCDate value) {
		setConstDate(offset + 58, $hdr_dlv_rqst_dt, value);
	}


	/**
	 * Desired delivery time (Header) 納入希望時刻（ヘッダ）.<p>
	 *
	 */
	public MCDate hdr_dlv_rqst_hm() {
		return getConstDate(offset + 59, $hdr_dlv_rqst_hm);
	}

	/**
	 * Desired delivery time (Header) 納入希望時刻（ヘッダ）.<p>
	 *
	 */
	public void hdr_dlv_rqst_hm(MCDate value) {
		setConstDate(offset + 59, $hdr_dlv_rqst_hm, value);
	}


	/**
	 * Day type (Header) 曜日区分（ヘッダ）.<p>
	 *
	 */
	public String hdr_dlv_day_week_typ() {
		return getConstString(offset + 60, $hdr_dlv_day_week_typ);
	}

	/**
	 * Day type (Header) 曜日区分（ヘッダ）.<p>
	 *
	 */
	public void hdr_dlv_day_week_typ(String value) {
		setConstString(offset + 60, $hdr_dlv_day_week_typ, value);
	}


	/**
	 * Arrival day of week (Header) 着曜日（ヘッダ）.<p>
	 *
	 */
	public String hdr_dlv_day_week_typ_nm() {
		return getConstString(offset + 61, $hdr_dlv_day_week_typ_nm);
	}

	/**
	 * Arrival day of week (Header) 着曜日（ヘッダ）.<p>
	 *
	 */
	public void hdr_dlv_day_week_typ_nm(String value) {
		setConstString(offset + 61, $hdr_dlv_day_week_typ_nm, value);
	}


	/**
	 * Consignment 貸出.<p>
	 *
	 */
	public boolean vmi_flg() {
		return getConstBoolean(offset + 62, $vmi_flg);
	}

	/**
	 * Consignment 貸出.<p>
	 *
	 */
	public void vmi_flg(boolean value) {
		setConstBoolean(offset + 62, $vmi_flg, value);
	}


	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public MCNumber trd_unit_qty() {
		return getConstNumber(offset + 63, $trd_unit_qty);
	}

	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public void trd_unit_qty(MCNumber value) {
		setConstNumber(offset + 63, $trd_unit_qty, value);
	}

	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public void trd_unit_qty(int value) {
		setConstNumber(offset + 63, $trd_unit_qty, value);
	}

	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public void trd_unit_qty(long value) {
		setConstNumber(offset + 63, $trd_unit_qty, value);
	}

	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public void trd_unit_qty(float value) {
		setConstNumber(offset + 63, $trd_unit_qty, value);
	}

	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public void trd_unit_qty(double value) {
		setConstNumber(offset + 63, $trd_unit_qty, value);
	}


	/**
	 * Unit price (Transaction currency) 取引通貨単価.<p>
	 *
	 */
	public MCNumber trd_cur_upri() {
		return getConstNumber(offset + 64, $trd_cur_upri);
	}

	/**
	 * Unit price (Transaction currency) 取引通貨単価.<p>
	 *
	 */
	public void trd_cur_upri(MCNumber value) {
		setConstNumber(offset + 64, $trd_cur_upri, value);
	}

	/**
	 * Unit price (Transaction currency) 取引通貨単価.<p>
	 *
	 */
	public void trd_cur_upri(int value) {
		setConstNumber(offset + 64, $trd_cur_upri, value);
	}

	/**
	 * Unit price (Transaction currency) 取引通貨単価.<p>
	 *
	 */
	public void trd_cur_upri(long value) {
		setConstNumber(offset + 64, $trd_cur_upri, value);
	}

	/**
	 * Unit price (Transaction currency) 取引通貨単価.<p>
	 *
	 */
	public void trd_cur_upri(float value) {
		setConstNumber(offset + 64, $trd_cur_upri, value);
	}

	/**
	 * Unit price (Transaction currency) 取引通貨単価.<p>
	 *
	 */
	public void trd_cur_upri(double value) {
		setConstNumber(offset + 64, $trd_cur_upri, value);
	}


	/**
	 * Tax cd. 税ＣＤ.<p>
	 *
	 */
	public String tax_cd() {
		return getConstString(offset + 65, $tax_cd);
	}

	/**
	 * Tax cd. 税ＣＤ.<p>
	 *
	 */
	public void tax_cd(String value) {
		setConstString(offset + 65, $tax_cd, value);
	}


	/**
	 * Tax name 税名.<p>
	 *
	 */
	public String tax_nm() {
		return getConstString(offset + 66, $tax_nm);
	}

	/**
	 * Tax name 税名.<p>
	 *
	 */
	public void tax_nm(String value) {
		setConstString(offset + 66, $tax_nm, value);
	}


	/**
	 * Tax rate 税率.<p>
	 *
	 */
	public MCNumber tax_rate() {
		return getConstNumber(offset + 67, $tax_rate);
	}

	/**
	 * Tax rate 税率.<p>
	 *
	 */
	public void tax_rate(MCNumber value) {
		setConstNumber(offset + 67, $tax_rate, value);
	}

	/**
	 * Tax rate 税率.<p>
	 *
	 */
	public void tax_rate(int value) {
		setConstNumber(offset + 67, $tax_rate, value);
	}

	/**
	 * Tax rate 税率.<p>
	 *
	 */
	public void tax_rate(long value) {
		setConstNumber(offset + 67, $tax_rate, value);
	}

	/**
	 * Tax rate 税率.<p>
	 *
	 */
	public void tax_rate(float value) {
		setConstNumber(offset + 67, $tax_rate, value);
	}

	/**
	 * Tax rate 税率.<p>
	 *
	 */
	public void tax_rate(double value) {
		setConstNumber(offset + 67, $tax_rate, value);
	}


	/**
	 * Tax type 税区分.<p>
	 *
	 */
	public String tax_typ() {
		return getConstString(offset + 68, $tax_typ);
	}

	/**
	 * Tax type 税区分.<p>
	 *
	 */
	public void tax_typ(String value) {
		setConstString(offset + 68, $tax_typ, value);
	}


	/**
	 * Tax inclusive 内税.<p>
	 *
	 */
	public boolean inc_tax_flg() {
		return getConstBoolean(offset + 69, $inc_tax_flg);
	}

	/**
	 * Tax inclusive 内税.<p>
	 *
	 */
	public void inc_tax_flg(boolean value) {
		setConstBoolean(offset + 69, $inc_tax_flg, value);
	}


	/**
	 * Discount reason cd. 値引理由ＣＤ.<p>
	 *
	 */
	public String dscnt_rsn_cd() {
		return getConstString(offset + 70, $dscnt_rsn_cd);
	}

	/**
	 * Discount reason cd. 値引理由ＣＤ.<p>
	 *
	 */
	public void dscnt_rsn_cd(String value) {
		setConstString(offset + 70, $dscnt_rsn_cd, value);
	}


	/**
	 * Discount reason name 値引理由名.<p>
	 *
	 */
	public String dscnt_rsn_nm() {
		return getConstString(offset + 71, $dscnt_rsn_nm);
	}

	/**
	 * Discount reason name 値引理由名.<p>
	 *
	 */
	public void dscnt_rsn_nm(String value) {
		setConstString(offset + 71, $dscnt_rsn_nm, value);
	}


	/**
	 * Unit cost 原価単価.<p>
	 *
	 */
	public MCNumber cost_upri() {
		return getConstNumber(offset + 72, $cost_upri);
	}

	/**
	 * Unit cost 原価単価.<p>
	 *
	 */
	public void cost_upri(MCNumber value) {
		setConstNumber(offset + 72, $cost_upri, value);
	}

	/**
	 * Unit cost 原価単価.<p>
	 *
	 */
	public void cost_upri(int value) {
		setConstNumber(offset + 72, $cost_upri, value);
	}

	/**
	 * Unit cost 原価単価.<p>
	 *
	 */
	public void cost_upri(long value) {
		setConstNumber(offset + 72, $cost_upri, value);
	}

	/**
	 * Unit cost 原価単価.<p>
	 *
	 */
	public void cost_upri(float value) {
		setConstNumber(offset + 72, $cost_upri, value);
	}

	/**
	 * Unit cost 原価単価.<p>
	 *
	 */
	public void cost_upri(double value) {
		setConstNumber(offset + 72, $cost_upri, value);
	}


	/**
	 * Billing carry-over count 請求繰越回数.<p>
	 *
	 */
	public MCNumber bill_crryovr_times() {
		return getConstNumber(offset + 73, $bill_crryovr_times);
	}

	/**
	 * Billing carry-over count 請求繰越回数.<p>
	 *
	 */
	public void bill_crryovr_times(MCNumber value) {
		setConstNumber(offset + 73, $bill_crryovr_times, value);
	}

	/**
	 * Billing carry-over count 請求繰越回数.<p>
	 *
	 */
	public void bill_crryovr_times(int value) {
		setConstNumber(offset + 73, $bill_crryovr_times, value);
	}

	/**
	 * Billing carry-over count 請求繰越回数.<p>
	 *
	 */
	public void bill_crryovr_times(long value) {
		setConstNumber(offset + 73, $bill_crryovr_times, value);
	}

	/**
	 * Billing carry-over count 請求繰越回数.<p>
	 *
	 */
	public void bill_crryovr_times(float value) {
		setConstNumber(offset + 73, $bill_crryovr_times, value);
	}

	/**
	 * Billing carry-over count 請求繰越回数.<p>
	 *
	 */
	public void bill_crryovr_times(double value) {
		setConstNumber(offset + 73, $bill_crryovr_times, value);
	}


	/**
	 * Assortment group No. 品揃グループＮＯ.<p>
	 *
	 */
	public MCNumber set_itm_grp_no() {
		return getConstNumber(offset + 74, $set_itm_grp_no);
	}

	/**
	 * Assortment group No. 品揃グループＮＯ.<p>
	 *
	 */
	public void set_itm_grp_no(MCNumber value) {
		setConstNumber(offset + 74, $set_itm_grp_no, value);
	}

	/**
	 * Assortment group No. 品揃グループＮＯ.<p>
	 *
	 */
	public void set_itm_grp_no(int value) {
		setConstNumber(offset + 74, $set_itm_grp_no, value);
	}

	/**
	 * Assortment group No. 品揃グループＮＯ.<p>
	 *
	 */
	public void set_itm_grp_no(long value) {
		setConstNumber(offset + 74, $set_itm_grp_no, value);
	}

	/**
	 * Assortment group No. 品揃グループＮＯ.<p>
	 *
	 */
	public void set_itm_grp_no(float value) {
		setConstNumber(offset + 74, $set_itm_grp_no, value);
	}

	/**
	 * Assortment group No. 品揃グループＮＯ.<p>
	 *
	 */
	public void set_itm_grp_no(double value) {
		setConstNumber(offset + 74, $set_itm_grp_no, value);
	}


	/**
	 * Desired shipping date 出荷希望日.<p>
	 *
	 */
	public MCDate ship_rqst_dt() {
		return getConstDate(offset + 75, $ship_rqst_dt);
	}

	/**
	 * Desired shipping date 出荷希望日.<p>
	 *
	 */
	public void ship_rqst_dt(MCDate value) {
		setConstDate(offset + 75, $ship_rqst_dt, value);
	}


	/**
	 * Desired shipping date editability 出荷希望日編集可否.<p>
	 *
	 */
	public boolean is_editable_ship_rqst_dt() {
		return getConstBoolean(offset + 76, $is_editable_ship_rqst_dt);
	}

	/**
	 * Desired shipping date editability 出荷希望日編集可否.<p>
	 *
	 */
	public void is_editable_ship_rqst_dt(boolean value) {
		setConstBoolean(offset + 76, $is_editable_ship_rqst_dt, value);
	}


	/**
	 * Desired shipping time 出荷希望時刻.<p>
	 *
	 */
	public MCDate ship_rqst_hm() {
		return getConstDate(offset + 77, $ship_rqst_hm);
	}

	/**
	 * Desired shipping time 出荷希望時刻.<p>
	 *
	 */
	public void ship_rqst_hm(MCDate value) {
		setConstDate(offset + 77, $ship_rqst_hm, value);
	}


	/**
	 * Desired shipping time editability 出荷希望時刻編集可否.<p>
	 *
	 */
	public boolean is_editable_ship_rqst_hm() {
		return getConstBoolean(offset + 78, $is_editable_ship_rqst_hm);
	}

	/**
	 * Desired shipping time editability 出荷希望時刻編集可否.<p>
	 *
	 */
	public void is_editable_ship_rqst_hm(boolean value) {
		setConstBoolean(offset + 78, $is_editable_ship_rqst_hm, value);
	}


	/**
	 * Desired delivery date 納入希望日.<p>
	 *
	 */
	public MCDate dlv_rqst_dt() {
		return getConstDate(offset + 79, $dlv_rqst_dt);
	}

	/**
	 * Desired delivery date 納入希望日.<p>
	 *
	 */
	public void dlv_rqst_dt(MCDate value) {
		setConstDate(offset + 79, $dlv_rqst_dt, value);
	}


	/**
	 * Desired delivery date editability 納入希望日編集可否.<p>
	 *
	 */
	public boolean is_editable_dlv_rqst_dt() {
		return getConstBoolean(offset + 80, $is_editable_dlv_rqst_dt);
	}

	/**
	 * Desired delivery date editability 納入希望日編集可否.<p>
	 *
	 */
	public void is_editable_dlv_rqst_dt(boolean value) {
		setConstBoolean(offset + 80, $is_editable_dlv_rqst_dt, value);
	}


	/**
	 * Desired delivery time 納入希望時刻.<p>
	 *
	 */
	public MCDate dlv_rqst_hm() {
		return getConstDate(offset + 81, $dlv_rqst_hm);
	}

	/**
	 * Desired delivery time 納入希望時刻.<p>
	 *
	 */
	public void dlv_rqst_hm(MCDate value) {
		setConstDate(offset + 81, $dlv_rqst_hm, value);
	}


	/**
	 * Desired delivery time editability 納入希望時刻編集可否.<p>
	 *
	 */
	public boolean is_editable_dlv_rqst_hm() {
		return getConstBoolean(offset + 82, $is_editable_dlv_rqst_hm);
	}

	/**
	 * Desired delivery time editability 納入希望時刻編集可否.<p>
	 *
	 */
	public void is_editable_dlv_rqst_hm(boolean value) {
		setConstBoolean(offset + 82, $is_editable_dlv_rqst_hm, value);
	}


	/**
	 * Day type 曜日区分.<p>
	 *
	 */
	public String dlv_day_week_typ() {
		return getConstString(offset + 83, $dlv_day_week_typ);
	}

	/**
	 * Day type 曜日区分.<p>
	 *
	 */
	public void dlv_day_week_typ(String value) {
		setConstString(offset + 83, $dlv_day_week_typ, value);
	}


	/**
	 * Arrival day of week 着曜日.<p>
	 *
	 */
	public String dlv_day_week_typ_nm() {
		return getConstString(offset + 84, $dlv_day_week_typ_nm);
	}

	/**
	 * Arrival day of week 着曜日.<p>
	 *
	 */
	public void dlv_day_week_typ_nm(String value) {
		setConstString(offset + 84, $dlv_day_week_typ_nm, value);
	}


	/**
	 * Arrival day of week editability 着曜日編集可否.<p>
	 *
	 */
	public boolean is_editable_dlv_day_week_typ_nm() {
		return getConstBoolean(offset + 85, $is_editable_dlv_day_week_typ_nm);
	}

	/**
	 * Arrival day of week editability 着曜日編集可否.<p>
	 *
	 */
	public void is_editable_dlv_day_week_typ_nm(boolean value) {
		setConstBoolean(offset + 85, $is_editable_dlv_day_week_typ_nm, value);
	}


	/**
	 * Scheduled sales date 売上予定日.<p>
	 *
	 */
	public MCDate sls_schd_dt() {
		return getConstDate(offset + 86, $sls_schd_dt);
	}

	/**
	 * Scheduled sales date 売上予定日.<p>
	 *
	 */
	public void sls_schd_dt(MCDate value) {
		setConstDate(offset + 86, $sls_schd_dt, value);
	}


	/**
	 * Delivery destination cd. editability 納品先ＣＤ編集可否.<p>
	 *
	 */
	public boolean is_editable_dlv_cd() {
		return getConstBoolean(offset + 87, $is_editable_dlv_cd);
	}

	/**
	 * Delivery destination cd. editability 納品先ＣＤ編集可否.<p>
	 *
	 */
	public void is_editable_dlv_cd(boolean value) {
		setConstBoolean(offset + 87, $is_editable_dlv_cd, value);
	}


	/**
	 * Delivery destination cd. 納品先ＣＤ.<p>
	 *
	 */
	public String dlv_cd() {
		return getConstString(offset + 88, $dlv_cd);
	}

	/**
	 * Delivery destination cd. 納品先ＣＤ.<p>
	 *
	 */
	public void dlv_cd(String value) {
		setConstString(offset + 88, $dlv_cd, value);
	}


	/**
	 * Delivery destination name 納品先名.<p>
	 *
	 */
	public String dlv_nm() {
		return getConstString(offset + 89, $dlv_nm);
	}

	/**
	 * Delivery destination name 納品先名.<p>
	 *
	 */
	public void dlv_nm(String value) {
		setConstString(offset + 89, $dlv_nm, value);
	}


	/**
	 * Miscellaneous delivery destination 納品先諸口.<p>
	 *
	 */
	public boolean dlv_sundry_flg() {
		return getConstBoolean(offset + 90, $dlv_sundry_flg);
	}

	/**
	 * Miscellaneous delivery destination 納品先諸口.<p>
	 *
	 */
	public void dlv_sundry_flg(boolean value) {
		setConstBoolean(offset + 90, $dlv_sundry_flg, value);
	}


	/**
	 * Print price 価格印字.<p>
	 *
	 */
	public boolean pri_prnt_flg() {
		return getConstBoolean(offset + 91, $pri_prnt_flg);
	}

	/**
	 * Print price 価格印字.<p>
	 *
	 */
	public void pri_prnt_flg(boolean value) {
		setConstBoolean(offset + 91, $pri_prnt_flg, value);
	}


	/**
	 * Delivery destination distribution group cd. 納品先物流グループＣＤ.<p>
	 *
	 */
	public String dlv_lg_grp_cd() {
		return getConstString(offset + 92, $dlv_lg_grp_cd);
	}

	/**
	 * Delivery destination distribution group cd. 納品先物流グループＣＤ.<p>
	 *
	 */
	public void dlv_lg_grp_cd(String value) {
		setConstString(offset + 92, $dlv_lg_grp_cd, value);
	}


	/**
	 * Delivery destination distribution group name 納品先物流グループ名.<p>
	 *
	 */
	public String dlv_lg_grp_nm() {
		return getConstString(offset + 93, $dlv_lg_grp_nm);
	}

	/**
	 * Delivery destination distribution group name 納品先物流グループ名.<p>
	 *
	 */
	public void dlv_lg_grp_nm(String value) {
		setConstString(offset + 93, $dlv_lg_grp_nm, value);
	}


	/**
	 * Delivery destination country cd. 納品先国ＣＤ.<p>
	 *
	 */
	public String dlv_cntry_cd() {
		return getConstString(offset + 94, $dlv_cntry_cd);
	}

	/**
	 * Delivery destination country cd. 納品先国ＣＤ.<p>
	 *
	 */
	public void dlv_cntry_cd(String value) {
		setConstString(offset + 94, $dlv_cntry_cd, value);
	}


	/**
	 * Delivery destination country name 納品先国名.<p>
	 *
	 */
	public String dlv_cntry_nm() {
		return getConstString(offset + 95, $dlv_cntry_nm);
	}

	/**
	 * Delivery destination country name 納品先国名.<p>
	 *
	 */
	public void dlv_cntry_nm(String value) {
		setConstString(offset + 95, $dlv_cntry_nm, value);
	}


	/**
	 * Zip code (Delivery destination) 納品先郵便番号.<p>
	 *
	 */
	public String dlv_zip_cd() {
		return getConstString(offset + 96, $dlv_zip_cd);
	}

	/**
	 * Zip code (Delivery destination) 納品先郵便番号.<p>
	 *
	 */
	public void dlv_zip_cd(String value) {
		setConstString(offset + 96, $dlv_zip_cd, value);
	}


	/**
	 * Address 1 (Delivery destination) 納品先住所１.<p>
	 *
	 */
	public String dlv_addr1() {
		return getConstString(offset + 97, $dlv_addr1);
	}

	/**
	 * Address 1 (Delivery destination) 納品先住所１.<p>
	 *
	 */
	public void dlv_addr1(String value) {
		setConstString(offset + 97, $dlv_addr1, value);
	}


	/**
	 * Address 2 (Delivery destination) 納品先住所２.<p>
	 *
	 */
	public String dlv_addr2() {
		return getConstString(offset + 98, $dlv_addr2);
	}

	/**
	 * Address 2 (Delivery destination) 納品先住所２.<p>
	 *
	 */
	public void dlv_addr2(String value) {
		setConstString(offset + 98, $dlv_addr2, value);
	}


	/**
	 * Address 3 (Delivery destination) 納品先住所３.<p>
	 *
	 */
	public String dlv_addr3() {
		return getConstString(offset + 99, $dlv_addr3);
	}

	/**
	 * Address 3 (Delivery destination) 納品先住所３.<p>
	 *
	 */
	public void dlv_addr3(String value) {
		setConstString(offset + 99, $dlv_addr3, value);
	}


	/**
	 * Address 4 (Delivery destination) 納品先住所４.<p>
	 *
	 */
	public String dlv_addr4() {
		return getConstString(offset + 100, $dlv_addr4);
	}

	/**
	 * Address 4 (Delivery destination) 納品先住所４.<p>
	 *
	 */
	public void dlv_addr4(String value) {
		setConstString(offset + 100, $dlv_addr4, value);
	}


	/**
	 * TEL (Delivery destination) 納品先ＴＥＬ.<p>
	 *
	 */
	public String dlv_tel() {
		return getConstString(offset + 101, $dlv_tel);
	}

	/**
	 * TEL (Delivery destination) 納品先ＴＥＬ.<p>
	 *
	 */
	public void dlv_tel(String value) {
		setConstString(offset + 101, $dlv_tel, value);
	}


	/**
	 * FAX (Delivery destination) 納品先ＦＡＸ.<p>
	 *
	 */
	public String dlv_fax() {
		return getConstString(offset + 102, $dlv_fax);
	}

	/**
	 * FAX (Delivery destination) 納品先ＦＡＸ.<p>
	 *
	 */
	public void dlv_fax(String value) {
		setConstString(offset + 102, $dlv_fax, value);
	}


	/**
	 * Delivery destination dept. 納品先部署.<p>
	 *
	 */
	public String dlv_cntct_dpt() {
		return getConstString(offset + 103, $dlv_cntct_dpt);
	}

	/**
	 * Delivery destination dept. 納品先部署.<p>
	 *
	 */
	public void dlv_cntct_dpt(String value) {
		setConstString(offset + 103, $dlv_cntct_dpt, value);
	}


	/**
	 * Delivery destination PIC 納品先担当者.<p>
	 *
	 */
	public String dlv_cntct_psn() {
		return getConstString(offset + 104, $dlv_cntct_psn);
	}

	/**
	 * Delivery destination PIC 納品先担当者.<p>
	 *
	 */
	public void dlv_cntct_psn(String value) {
		setConstString(offset + 104, $dlv_cntct_psn, value);
	}


	/**
	 * Report output locale cd. 帳票出力ロケールＣＤ.<p>
	 *
	 */
	public String prnt_lcl_cd() {
		return getConstString(offset + 105, $prnt_lcl_cd);
	}

	/**
	 * Report output locale cd. 帳票出力ロケールＣＤ.<p>
	 *
	 */
	public void prnt_lcl_cd(String value) {
		setConstString(offset + 105, $prnt_lcl_cd, value);
	}


	/**
	 * Receiving point required 配送先必須.<p>
	 *
	 */
	public boolean tdlv_req_flg() {
		return getConstBoolean(offset + 106, $tdlv_req_flg);
	}

	/**
	 * Receiving point required 配送先必須.<p>
	 *
	 */
	public void tdlv_req_flg(boolean value) {
		setConstBoolean(offset + 106, $tdlv_req_flg, value);
	}


	/**
	 * Distribution channel cd. 1 editability 仕向先ＣＤ１編集可否.<p>
	 *
	 */
	public boolean is_editable_dest_cd1() {
		return getConstBoolean(offset + 107, $is_editable_dest_cd1);
	}

	/**
	 * Distribution channel cd. 1 editability 仕向先ＣＤ１編集可否.<p>
	 *
	 */
	public void is_editable_dest_cd1(boolean value) {
		setConstBoolean(offset + 107, $is_editable_dest_cd1, value);
	}


	/**
	 * Distribution channel cd. 1 仕向先ＣＤ１.<p>
	 *
	 */
	public String dest_cd1() {
		return getConstString(offset + 108, $dest_cd1);
	}

	/**
	 * Distribution channel cd. 1 仕向先ＣＤ１.<p>
	 *
	 */
	public void dest_cd1(String value) {
		setConstString(offset + 108, $dest_cd1, value);
	}


	/**
	 * Distribution channel name 1 仕向先１名.<p>
	 *
	 */
	public String dest_nm1() {
		return getConstString(offset + 109, $dest_nm1);
	}

	/**
	 * Distribution channel name 1 仕向先１名.<p>
	 *
	 */
	public void dest_nm1(String value) {
		setConstString(offset + 109, $dest_nm1, value);
	}


	/**
	 * Distribution channel cd. 2 editability 仕向先ＣＤ２編集可否.<p>
	 *
	 */
	public boolean is_editable_dest_cd2() {
		return getConstBoolean(offset + 110, $is_editable_dest_cd2);
	}

	/**
	 * Distribution channel cd. 2 editability 仕向先ＣＤ２編集可否.<p>
	 *
	 */
	public void is_editable_dest_cd2(boolean value) {
		setConstBoolean(offset + 110, $is_editable_dest_cd2, value);
	}


	/**
	 * Distribution channel cd. 2 仕向先ＣＤ２.<p>
	 *
	 */
	public String dest_cd2() {
		return getConstString(offset + 111, $dest_cd2);
	}

	/**
	 * Distribution channel cd. 2 仕向先ＣＤ２.<p>
	 *
	 */
	public void dest_cd2(String value) {
		setConstString(offset + 111, $dest_cd2, value);
	}


	/**
	 * Distribution channel name 2 仕向先２名.<p>
	 *
	 */
	public String dest_nm2() {
		return getConstString(offset + 112, $dest_nm2);
	}

	/**
	 * Distribution channel name 2 仕向先２名.<p>
	 *
	 */
	public void dest_nm2(String value) {
		setConstString(offset + 112, $dest_nm2, value);
	}


	/**
	 * Distribution channel cd. 3 editability 仕向先ＣＤ３編集可否.<p>
	 *
	 */
	public boolean is_editable_dest_cd3() {
		return getConstBoolean(offset + 113, $is_editable_dest_cd3);
	}

	/**
	 * Distribution channel cd. 3 editability 仕向先ＣＤ３編集可否.<p>
	 *
	 */
	public void is_editable_dest_cd3(boolean value) {
		setConstBoolean(offset + 113, $is_editable_dest_cd3, value);
	}


	/**
	 * Distribution channel cd. 3 仕向先ＣＤ３.<p>
	 *
	 */
	public String dest_cd3() {
		return getConstString(offset + 114, $dest_cd3);
	}

	/**
	 * Distribution channel cd. 3 仕向先ＣＤ３.<p>
	 *
	 */
	public void dest_cd3(String value) {
		setConstString(offset + 114, $dest_cd3, value);
	}


	/**
	 * Distribution channel name 3 仕向先３名.<p>
	 *
	 */
	public String dest_nm3() {
		return getConstString(offset + 115, $dest_nm3);
	}

	/**
	 * Distribution channel name 3 仕向先３名.<p>
	 *
	 */
	public void dest_nm3(String value) {
		setConstString(offset + 115, $dest_nm3, value);
	}


	/**
	 * Receiving point cd. editability 配送先ＣＤ編集可否.<p>
	 *
	 */
	public boolean is_editable_tdlv_cd() {
		return getConstBoolean(offset + 116, $is_editable_tdlv_cd);
	}

	/**
	 * Receiving point cd. editability 配送先ＣＤ編集可否.<p>
	 *
	 */
	public void is_editable_tdlv_cd(boolean value) {
		setConstBoolean(offset + 116, $is_editable_tdlv_cd, value);
	}


	/**
	 * Receiving point cd. 配送先ＣＤ.<p>
	 *
	 */
	public String tdlv_cd() {
		return getConstString(offset + 117, $tdlv_cd);
	}

	/**
	 * Receiving point cd. 配送先ＣＤ.<p>
	 *
	 */
	public void tdlv_cd(String value) {
		setConstString(offset + 117, $tdlv_cd, value);
	}


	/**
	 * Receiving point name 配送先名.<p>
	 *
	 */
	public String tdlv_nm() {
		return getConstString(offset + 118, $tdlv_nm);
	}

	/**
	 * Receiving point name 配送先名.<p>
	 *
	 */
	public void tdlv_nm(String value) {
		setConstString(offset + 118, $tdlv_nm, value);
	}


	/**
	 * Miscellaneous receiving point 配送先諸口.<p>
	 *
	 */
	public boolean tdlv_sundry_flg() {
		return getConstBoolean(offset + 119, $tdlv_sundry_flg);
	}

	/**
	 * Miscellaneous receiving point 配送先諸口.<p>
	 *
	 */
	public void tdlv_sundry_flg(boolean value) {
		setConstBoolean(offset + 119, $tdlv_sundry_flg, value);
	}


	/**
	 * Receiving point distribution group cd. 配送先物流グループＣＤ.<p>
	 *
	 */
	public String tdlv_lg_grp_cd() {
		return getConstString(offset + 120, $tdlv_lg_grp_cd);
	}

	/**
	 * Receiving point distribution group cd. 配送先物流グループＣＤ.<p>
	 *
	 */
	public void tdlv_lg_grp_cd(String value) {
		setConstString(offset + 120, $tdlv_lg_grp_cd, value);
	}


	/**
	 * Receiving point distribution group name 配送先物流グループ名.<p>
	 *
	 */
	public String tdlv_lg_grp_nm() {
		return getConstString(offset + 121, $tdlv_lg_grp_nm);
	}

	/**
	 * Receiving point distribution group name 配送先物流グループ名.<p>
	 *
	 */
	public void tdlv_lg_grp_nm(String value) {
		setConstString(offset + 121, $tdlv_lg_grp_nm, value);
	}


	/**
	 * Receiving point country cd. 配送先国ＣＤ.<p>
	 *
	 */
	public String tdlv_cntry_cd() {
		return getConstString(offset + 122, $tdlv_cntry_cd);
	}

	/**
	 * Receiving point country cd. 配送先国ＣＤ.<p>
	 *
	 */
	public void tdlv_cntry_cd(String value) {
		setConstString(offset + 122, $tdlv_cntry_cd, value);
	}


	/**
	 * Receiving point country name 配送先国名.<p>
	 *
	 */
	public String tdlv_cntry_nm() {
		return getConstString(offset + 123, $tdlv_cntry_nm);
	}

	/**
	 * Receiving point country name 配送先国名.<p>
	 *
	 */
	public void tdlv_cntry_nm(String value) {
		setConstString(offset + 123, $tdlv_cntry_nm, value);
	}


	/**
	 * Receiving point zip code 配送先郵便番号.<p>
	 *
	 */
	public String tdlv_zip_cd() {
		return getConstString(offset + 124, $tdlv_zip_cd);
	}

	/**
	 * Receiving point zip code 配送先郵便番号.<p>
	 *
	 */
	public void tdlv_zip_cd(String value) {
		setConstString(offset + 124, $tdlv_zip_cd, value);
	}


	/**
	 * Receiving point address 1 配送先住所１.<p>
	 *
	 */
	public String tdlv_addr1() {
		return getConstString(offset + 125, $tdlv_addr1);
	}

	/**
	 * Receiving point address 1 配送先住所１.<p>
	 *
	 */
	public void tdlv_addr1(String value) {
		setConstString(offset + 125, $tdlv_addr1, value);
	}


	/**
	 * Receiving point address 2 配送先住所２.<p>
	 *
	 */
	public String tdlv_addr2() {
		return getConstString(offset + 126, $tdlv_addr2);
	}

	/**
	 * Receiving point address 2 配送先住所２.<p>
	 *
	 */
	public void tdlv_addr2(String value) {
		setConstString(offset + 126, $tdlv_addr2, value);
	}


	/**
	 * Receiving point address 3 配送先住所３.<p>
	 *
	 */
	public String tdlv_addr3() {
		return getConstString(offset + 127, $tdlv_addr3);
	}

	/**
	 * Receiving point address 3 配送先住所３.<p>
	 *
	 */
	public void tdlv_addr3(String value) {
		setConstString(offset + 127, $tdlv_addr3, value);
	}


	/**
	 * Receiving point address 4 配送先住所４.<p>
	 *
	 */
	public String tdlv_addr4() {
		return getConstString(offset + 128, $tdlv_addr4);
	}

	/**
	 * Receiving point address 4 配送先住所４.<p>
	 *
	 */
	public void tdlv_addr4(String value) {
		setConstString(offset + 128, $tdlv_addr4, value);
	}


	/**
	 * Receiving point TEL 配送先ＴＥＬ.<p>
	 *
	 */
	public String tdlv_tel() {
		return getConstString(offset + 129, $tdlv_tel);
	}

	/**
	 * Receiving point TEL 配送先ＴＥＬ.<p>
	 *
	 */
	public void tdlv_tel(String value) {
		setConstString(offset + 129, $tdlv_tel, value);
	}


	/**
	 * Receiving point FAX 配送先ＦＡＸ.<p>
	 *
	 */
	public String tdlv_fax() {
		return getConstString(offset + 130, $tdlv_fax);
	}

	/**
	 * Receiving point FAX 配送先ＦＡＸ.<p>
	 *
	 */
	public void tdlv_fax(String value) {
		setConstString(offset + 130, $tdlv_fax, value);
	}


	/**
	 * Receiving point dept. 配送先部署.<p>
	 *
	 */
	public String tdlv_cntct_dpt() {
		return getConstString(offset + 131, $tdlv_cntct_dpt);
	}

	/**
	 * Receiving point dept. 配送先部署.<p>
	 *
	 */
	public void tdlv_cntct_dpt(String value) {
		setConstString(offset + 131, $tdlv_cntct_dpt, value);
	}


	/**
	 * Receiving point PIC 配送先担当者.<p>
	 *
	 */
	public String tdlv_cntct_psn() {
		return getConstString(offset + 132, $tdlv_cntct_psn);
	}

	/**
	 * Receiving point PIC 配送先担当者.<p>
	 *
	 */
	public void tdlv_cntct_psn(String value) {
		setConstString(offset + 132, $tdlv_cntct_psn, value);
	}


	/**
	 * Receiving point stopover type 配送先経由区分.<p>
	 *
	 */
	public String via_dlv_typ() {
		return getConstString(offset + 133, $via_dlv_typ);
	}

	/**
	 * Receiving point stopover type 配送先経由区分.<p>
	 *
	 */
	public void via_dlv_typ(String value) {
		setConstString(offset + 133, $via_dlv_typ, value);
	}


	/**
	 * Receiving point stopover name 配送先経由区分名.<p>
	 *
	 */
	public String via_dlv_typ_nm() {
		return getConstString(offset + 134, $via_dlv_typ_nm);
	}

	/**
	 * Receiving point stopover name 配送先経由区分名.<p>
	 *
	 */
	public void via_dlv_typ_nm(String value) {
		setConstString(offset + 134, $via_dlv_typ_nm, value);
	}


	/**
	 * Sales keeping customer inventory 預り売上.<p>
	 *
	 */
	public boolean sls_cststk_flg() {
		return getConstBoolean(offset + 135, $sls_cststk_flg);
	}

	/**
	 * Sales keeping customer inventory 預り売上.<p>
	 *
	 */
	public void sls_cststk_flg(boolean value) {
		setConstBoolean(offset + 135, $sls_cststk_flg, value);
	}


	/**
	 * Procurement type 手配区分.<p>
	 *
	 */
	public String proc_typ() {
		return getConstString(offset + 136, $proc_typ);
	}

	/**
	 * Procurement type 手配区分.<p>
	 *
	 */
	public void proc_typ(String value) {
		setConstString(offset + 136, $proc_typ, value);
	}


	/**
	 * Split type 分割区分.<p>
	 *
	 */
	public String ship_schd_split_typ() {
		return getConstString(offset + 137, $ship_schd_split_typ);
	}

	/**
	 * Split type 分割区分.<p>
	 *
	 */
	public void ship_schd_split_typ(String value) {
		setConstString(offset + 137, $ship_schd_split_typ, value);
	}


	/**
	 * Allocation range type 引当範囲区分.<p>
	 *
	 */
	public String alloc_scope_typ() {
		return getConstString(offset + 138, $alloc_scope_typ);
	}

	/**
	 * Allocation range type 引当範囲区分.<p>
	 *
	 */
	public void alloc_scope_typ(String value) {
		setConstString(offset + 138, $alloc_scope_typ, value);
	}


	/**
	 * Allocation type 引当区分.<p>
	 *
	 */
	public String alloc_typ() {
		return getConstString(offset + 139, $alloc_typ);
	}

	/**
	 * Allocation type 引当区分.<p>
	 *
	 */
	public void alloc_typ(String value) {
		setConstString(offset + 139, $alloc_typ, value);
	}


	/**
	 * Sales unit price acquisition type 販売単価取得区分.<p>
	 *
	 */
	public String sls_upri_req_typ() {
		return getConstString(offset + 140, $sls_upri_req_typ);
	}

	/**
	 * Sales unit price acquisition type 販売単価取得区分.<p>
	 *
	 */
	public void sls_upri_req_typ(String value) {
		setConstString(offset + 140, $sls_upri_req_typ, value);
	}


	/**
	 * Via sales order entry 受注登録経由.<p>
	 *
	 */
	public boolean from_slo_reg() {
		return getConstBoolean(offset + 141, $from_slo_reg);
	}

	/**
	 * Via sales order entry 受注登録経由.<p>
	 *
	 */
	public void from_slo_reg(boolean value) {
		setConstBoolean(offset + 141, $from_slo_reg, value);
	}


	public String getString(String name) {
		if ($trd_ptn_typ.equalsIgnoreCase(name)) {
			return trd_ptn_typ();
		}
		if ($hdr_dlv_cd.equalsIgnoreCase(name)) {
			return hdr_dlv_cd();
		}
		if ($hdr_dlv_nm.equalsIgnoreCase(name)) {
			return hdr_dlv_nm();
		}
		if ($hdr_dlv_lg_grp_cd.equalsIgnoreCase(name)) {
			return hdr_dlv_lg_grp_cd();
		}
		if ($hdr_dlv_lg_grp_nm.equalsIgnoreCase(name)) {
			return hdr_dlv_lg_grp_nm();
		}
		if ($hdr_dlv_cntry_cd.equalsIgnoreCase(name)) {
			return hdr_dlv_cntry_cd();
		}
		if ($hdr_dlv_cntry_nm.equalsIgnoreCase(name)) {
			return hdr_dlv_cntry_nm();
		}
		if ($hdr_dlv_zip_cd.equalsIgnoreCase(name)) {
			return hdr_dlv_zip_cd();
		}
		if ($hdr_dlv_addr1.equalsIgnoreCase(name)) {
			return hdr_dlv_addr1();
		}
		if ($hdr_dlv_addr2.equalsIgnoreCase(name)) {
			return hdr_dlv_addr2();
		}
		if ($hdr_dlv_addr3.equalsIgnoreCase(name)) {
			return hdr_dlv_addr3();
		}
		if ($hdr_dlv_addr4.equalsIgnoreCase(name)) {
			return hdr_dlv_addr4();
		}
		if ($hdr_dlv_tel.equalsIgnoreCase(name)) {
			return hdr_dlv_tel();
		}
		if ($hdr_dlv_fax.equalsIgnoreCase(name)) {
			return hdr_dlv_fax();
		}
		if ($hdr_dlv_cntct_dpt.equalsIgnoreCase(name)) {
			return hdr_dlv_cntct_dpt();
		}
		if ($hdr_dlv_cntct_psn.equalsIgnoreCase(name)) {
			return hdr_dlv_cntct_psn();
		}
		if ($hdr_prnt_lcl_cd.equalsIgnoreCase(name)) {
			return hdr_prnt_lcl_cd();
		}
		if ($hdr_dest_cd1.equalsIgnoreCase(name)) {
			return hdr_dest_cd1();
		}
		if ($hdr_dest_nm1.equalsIgnoreCase(name)) {
			return hdr_dest_nm1();
		}
		if ($hdr_dest_cd2.equalsIgnoreCase(name)) {
			return hdr_dest_cd2();
		}
		if ($hdr_dest_nm2.equalsIgnoreCase(name)) {
			return hdr_dest_nm2();
		}
		if ($hdr_dest_cd3.equalsIgnoreCase(name)) {
			return hdr_dest_cd3();
		}
		if ($hdr_dest_nm3.equalsIgnoreCase(name)) {
			return hdr_dest_nm3();
		}
		if ($hdr_tdlv_cd.equalsIgnoreCase(name)) {
			return hdr_tdlv_cd();
		}
		if ($hdr_tdlv_nm.equalsIgnoreCase(name)) {
			return hdr_tdlv_nm();
		}
		if ($hdr_tdlv_lg_grp_cd.equalsIgnoreCase(name)) {
			return hdr_tdlv_lg_grp_cd();
		}
		if ($hdr_tdlv_lg_grp_nm.equalsIgnoreCase(name)) {
			return hdr_tdlv_lg_grp_nm();
		}
		if ($hdr_tdlv_cntry_cd.equalsIgnoreCase(name)) {
			return hdr_tdlv_cntry_cd();
		}
		if ($hdr_tdlv_cntry_nm.equalsIgnoreCase(name)) {
			return hdr_tdlv_cntry_nm();
		}
		if ($hdr_tdlv_zip_cd.equalsIgnoreCase(name)) {
			return hdr_tdlv_zip_cd();
		}
		if ($hdr_tdlv_addr1.equalsIgnoreCase(name)) {
			return hdr_tdlv_addr1();
		}
		if ($hdr_tdlv_addr2.equalsIgnoreCase(name)) {
			return hdr_tdlv_addr2();
		}
		if ($hdr_tdlv_addr3.equalsIgnoreCase(name)) {
			return hdr_tdlv_addr3();
		}
		if ($hdr_tdlv_addr4.equalsIgnoreCase(name)) {
			return hdr_tdlv_addr4();
		}
		if ($hdr_tdlv_tel.equalsIgnoreCase(name)) {
			return hdr_tdlv_tel();
		}
		if ($hdr_tdlv_fax.equalsIgnoreCase(name)) {
			return hdr_tdlv_fax();
		}
		if ($hdr_tdlv_cntct_dpt.equalsIgnoreCase(name)) {
			return hdr_tdlv_cntct_dpt();
		}
		if ($hdr_tdlv_cntct_psn.equalsIgnoreCase(name)) {
			return hdr_tdlv_cntct_psn();
		}
		if ($hdr_via_dlv_typ.equalsIgnoreCase(name)) {
			return hdr_via_dlv_typ();
		}
		if ($hdr_via_dlv_typ_nm.equalsIgnoreCase(name)) {
			return hdr_via_dlv_typ_nm();
		}
		if ($sls_basis_typ.equalsIgnoreCase(name)) {
			return sls_basis_typ();
		}
		if ($hdr_wg_cd.equalsIgnoreCase(name)) {
			return hdr_wg_cd();
		}
		if ($trd_cur_cd.equalsIgnoreCase(name)) {
			return trd_cur_cd();
		}
		if ($base_cur_cd.equalsIgnoreCase(name)) {
			return base_cur_cd();
		}
		if ($ptax_cur_cd.equalsIgnoreCase(name)) {
			return ptax_cur_cd();
		}
		if ($hdr_sls_upri_req_typ.equalsIgnoreCase(name)) {
			return hdr_sls_upri_req_typ();
		}
		if ($hdr_ship_schd_split_typ.equalsIgnoreCase(name)) {
			return hdr_ship_schd_split_typ();
		}
		if ($assort_typ.equalsIgnoreCase(name)) {
			return assort_typ();
		}
		if ($iv_no.equalsIgnoreCase(name)) {
			return iv_no();
		}
		if ($hdr_dlv_day_week_typ.equalsIgnoreCase(name)) {
			return hdr_dlv_day_week_typ();
		}
		if ($hdr_dlv_day_week_typ_nm.equalsIgnoreCase(name)) {
			return hdr_dlv_day_week_typ_nm();
		}
		if ($tax_cd.equalsIgnoreCase(name)) {
			return tax_cd();
		}
		if ($tax_nm.equalsIgnoreCase(name)) {
			return tax_nm();
		}
		if ($tax_typ.equalsIgnoreCase(name)) {
			return tax_typ();
		}
		if ($dscnt_rsn_cd.equalsIgnoreCase(name)) {
			return dscnt_rsn_cd();
		}
		if ($dscnt_rsn_nm.equalsIgnoreCase(name)) {
			return dscnt_rsn_nm();
		}
		if ($dlv_day_week_typ.equalsIgnoreCase(name)) {
			return dlv_day_week_typ();
		}
		if ($dlv_day_week_typ_nm.equalsIgnoreCase(name)) {
			return dlv_day_week_typ_nm();
		}
		if ($dlv_cd.equalsIgnoreCase(name)) {
			return dlv_cd();
		}
		if ($dlv_nm.equalsIgnoreCase(name)) {
			return dlv_nm();
		}
		if ($dlv_lg_grp_cd.equalsIgnoreCase(name)) {
			return dlv_lg_grp_cd();
		}
		if ($dlv_lg_grp_nm.equalsIgnoreCase(name)) {
			return dlv_lg_grp_nm();
		}
		if ($dlv_cntry_cd.equalsIgnoreCase(name)) {
			return dlv_cntry_cd();
		}
		if ($dlv_cntry_nm.equalsIgnoreCase(name)) {
			return dlv_cntry_nm();
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
		if ($dlv_tel.equalsIgnoreCase(name)) {
			return dlv_tel();
		}
		if ($dlv_fax.equalsIgnoreCase(name)) {
			return dlv_fax();
		}
		if ($dlv_cntct_dpt.equalsIgnoreCase(name)) {
			return dlv_cntct_dpt();
		}
		if ($dlv_cntct_psn.equalsIgnoreCase(name)) {
			return dlv_cntct_psn();
		}
		if ($prnt_lcl_cd.equalsIgnoreCase(name)) {
			return prnt_lcl_cd();
		}
		if ($dest_cd1.equalsIgnoreCase(name)) {
			return dest_cd1();
		}
		if ($dest_nm1.equalsIgnoreCase(name)) {
			return dest_nm1();
		}
		if ($dest_cd2.equalsIgnoreCase(name)) {
			return dest_cd2();
		}
		if ($dest_nm2.equalsIgnoreCase(name)) {
			return dest_nm2();
		}
		if ($dest_cd3.equalsIgnoreCase(name)) {
			return dest_cd3();
		}
		if ($dest_nm3.equalsIgnoreCase(name)) {
			return dest_nm3();
		}
		if ($tdlv_cd.equalsIgnoreCase(name)) {
			return tdlv_cd();
		}
		if ($tdlv_nm.equalsIgnoreCase(name)) {
			return tdlv_nm();
		}
		if ($tdlv_lg_grp_cd.equalsIgnoreCase(name)) {
			return tdlv_lg_grp_cd();
		}
		if ($tdlv_lg_grp_nm.equalsIgnoreCase(name)) {
			return tdlv_lg_grp_nm();
		}
		if ($tdlv_cntry_cd.equalsIgnoreCase(name)) {
			return tdlv_cntry_cd();
		}
		if ($tdlv_cntry_nm.equalsIgnoreCase(name)) {
			return tdlv_cntry_nm();
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
		if ($via_dlv_typ.equalsIgnoreCase(name)) {
			return via_dlv_typ();
		}
		if ($via_dlv_typ_nm.equalsIgnoreCase(name)) {
			return via_dlv_typ_nm();
		}
		if ($proc_typ.equalsIgnoreCase(name)) {
			return proc_typ();
		}
		if ($ship_schd_split_typ.equalsIgnoreCase(name)) {
			return ship_schd_split_typ();
		}
		if ($alloc_scope_typ.equalsIgnoreCase(name)) {
			return alloc_scope_typ();
		}
		if ($alloc_typ.equalsIgnoreCase(name)) {
			return alloc_typ();
		}
		if ($sls_upri_req_typ.equalsIgnoreCase(name)) {
			return sls_upri_req_typ();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($cst_bill_crryovr_times.equalsIgnoreCase(name)) {
			return cst_bill_crryovr_times();
		}
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			return trd_unit_qty();
		}
		if ($trd_cur_upri.equalsIgnoreCase(name)) {
			return trd_cur_upri();
		}
		if ($tax_rate.equalsIgnoreCase(name)) {
			return tax_rate();
		}
		if ($cost_upri.equalsIgnoreCase(name)) {
			return cost_upri();
		}
		if ($bill_crryovr_times.equalsIgnoreCase(name)) {
			return bill_crryovr_times();
		}
		if ($set_itm_grp_no.equalsIgnoreCase(name)) {
			return set_itm_grp_no();
		}
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		if ($hdr_ship_rqst_dt.equalsIgnoreCase(name)) {
			return hdr_ship_rqst_dt();
		}
		if ($hdr_ship_rqst_hm.equalsIgnoreCase(name)) {
			return hdr_ship_rqst_hm();
		}
		if ($hdr_dlv_rqst_dt.equalsIgnoreCase(name)) {
			return hdr_dlv_rqst_dt();
		}
		if ($hdr_dlv_rqst_hm.equalsIgnoreCase(name)) {
			return hdr_dlv_rqst_hm();
		}
		if ($ship_rqst_dt.equalsIgnoreCase(name)) {
			return ship_rqst_dt();
		}
		if ($ship_rqst_hm.equalsIgnoreCase(name)) {
			return ship_rqst_hm();
		}
		if ($dlv_rqst_dt.equalsIgnoreCase(name)) {
			return dlv_rqst_dt();
		}
		if ($dlv_rqst_hm.equalsIgnoreCase(name)) {
			return dlv_rqst_hm();
		}
		if ($sls_schd_dt.equalsIgnoreCase(name)) {
			return sls_schd_dt();
		}
		return super.getDate(name);
	}
	public boolean getBoolean(String name) {
		if ($hdr_dlv_sundry_flg.equalsIgnoreCase(name)) {
			return hdr_dlv_sundry_flg();
		}
		if ($hdr_pri_prnt_flg.equalsIgnoreCase(name)) {
			return hdr_pri_prnt_flg();
		}
		if ($hdr_tdlv_sundry_flg.equalsIgnoreCase(name)) {
			return hdr_tdlv_sundry_flg();
		}
		if ($hdr_tdlv_req_flg.equalsIgnoreCase(name)) {
			return hdr_tdlv_req_flg();
		}
		if ($cst_iv_flg.equalsIgnoreCase(name)) {
			return cst_iv_flg();
		}
		if ($iv_num_flg.equalsIgnoreCase(name)) {
			return iv_num_flg();
		}
		if ($vmi_flg.equalsIgnoreCase(name)) {
			return vmi_flg();
		}
		if ($inc_tax_flg.equalsIgnoreCase(name)) {
			return inc_tax_flg();
		}
		if ($is_editable_ship_rqst_dt.equalsIgnoreCase(name)) {
			return is_editable_ship_rqst_dt();
		}
		if ($is_editable_ship_rqst_hm.equalsIgnoreCase(name)) {
			return is_editable_ship_rqst_hm();
		}
		if ($is_editable_dlv_rqst_dt.equalsIgnoreCase(name)) {
			return is_editable_dlv_rqst_dt();
		}
		if ($is_editable_dlv_rqst_hm.equalsIgnoreCase(name)) {
			return is_editable_dlv_rqst_hm();
		}
		if ($is_editable_dlv_day_week_typ_nm.equalsIgnoreCase(name)) {
			return is_editable_dlv_day_week_typ_nm();
		}
		if ($is_editable_dlv_cd.equalsIgnoreCase(name)) {
			return is_editable_dlv_cd();
		}
		if ($dlv_sundry_flg.equalsIgnoreCase(name)) {
			return dlv_sundry_flg();
		}
		if ($pri_prnt_flg.equalsIgnoreCase(name)) {
			return pri_prnt_flg();
		}
		if ($tdlv_req_flg.equalsIgnoreCase(name)) {
			return tdlv_req_flg();
		}
		if ($is_editable_dest_cd1.equalsIgnoreCase(name)) {
			return is_editable_dest_cd1();
		}
		if ($is_editable_dest_cd2.equalsIgnoreCase(name)) {
			return is_editable_dest_cd2();
		}
		if ($is_editable_dest_cd3.equalsIgnoreCase(name)) {
			return is_editable_dest_cd3();
		}
		if ($is_editable_tdlv_cd.equalsIgnoreCase(name)) {
			return is_editable_tdlv_cd();
		}
		if ($tdlv_sundry_flg.equalsIgnoreCase(name)) {
			return tdlv_sundry_flg();
		}
		if ($sls_cststk_flg.equalsIgnoreCase(name)) {
			return sls_cststk_flg();
		}
		if ($from_slo_reg.equalsIgnoreCase(name)) {
			return from_slo_reg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($trd_ptn_typ.equalsIgnoreCase(name)) {
			return trd_ptn_typ();
		}
		if ($hdr_dlv_cd.equalsIgnoreCase(name)) {
			return hdr_dlv_cd();
		}
		if ($hdr_dlv_nm.equalsIgnoreCase(name)) {
			return hdr_dlv_nm();
		}
		if ($hdr_dlv_lg_grp_cd.equalsIgnoreCase(name)) {
			return hdr_dlv_lg_grp_cd();
		}
		if ($hdr_dlv_lg_grp_nm.equalsIgnoreCase(name)) {
			return hdr_dlv_lg_grp_nm();
		}
		if ($hdr_dlv_cntry_cd.equalsIgnoreCase(name)) {
			return hdr_dlv_cntry_cd();
		}
		if ($hdr_dlv_cntry_nm.equalsIgnoreCase(name)) {
			return hdr_dlv_cntry_nm();
		}
		if ($hdr_dlv_zip_cd.equalsIgnoreCase(name)) {
			return hdr_dlv_zip_cd();
		}
		if ($hdr_dlv_addr1.equalsIgnoreCase(name)) {
			return hdr_dlv_addr1();
		}
		if ($hdr_dlv_addr2.equalsIgnoreCase(name)) {
			return hdr_dlv_addr2();
		}
		if ($hdr_dlv_addr3.equalsIgnoreCase(name)) {
			return hdr_dlv_addr3();
		}
		if ($hdr_dlv_addr4.equalsIgnoreCase(name)) {
			return hdr_dlv_addr4();
		}
		if ($hdr_dlv_tel.equalsIgnoreCase(name)) {
			return hdr_dlv_tel();
		}
		if ($hdr_dlv_fax.equalsIgnoreCase(name)) {
			return hdr_dlv_fax();
		}
		if ($hdr_dlv_cntct_dpt.equalsIgnoreCase(name)) {
			return hdr_dlv_cntct_dpt();
		}
		if ($hdr_dlv_cntct_psn.equalsIgnoreCase(name)) {
			return hdr_dlv_cntct_psn();
		}
		if ($hdr_prnt_lcl_cd.equalsIgnoreCase(name)) {
			return hdr_prnt_lcl_cd();
		}
		if ($hdr_dest_cd1.equalsIgnoreCase(name)) {
			return hdr_dest_cd1();
		}
		if ($hdr_dest_nm1.equalsIgnoreCase(name)) {
			return hdr_dest_nm1();
		}
		if ($hdr_dest_cd2.equalsIgnoreCase(name)) {
			return hdr_dest_cd2();
		}
		if ($hdr_dest_nm2.equalsIgnoreCase(name)) {
			return hdr_dest_nm2();
		}
		if ($hdr_dest_cd3.equalsIgnoreCase(name)) {
			return hdr_dest_cd3();
		}
		if ($hdr_dest_nm3.equalsIgnoreCase(name)) {
			return hdr_dest_nm3();
		}
		if ($hdr_tdlv_cd.equalsIgnoreCase(name)) {
			return hdr_tdlv_cd();
		}
		if ($hdr_tdlv_nm.equalsIgnoreCase(name)) {
			return hdr_tdlv_nm();
		}
		if ($hdr_tdlv_lg_grp_cd.equalsIgnoreCase(name)) {
			return hdr_tdlv_lg_grp_cd();
		}
		if ($hdr_tdlv_lg_grp_nm.equalsIgnoreCase(name)) {
			return hdr_tdlv_lg_grp_nm();
		}
		if ($hdr_tdlv_cntry_cd.equalsIgnoreCase(name)) {
			return hdr_tdlv_cntry_cd();
		}
		if ($hdr_tdlv_cntry_nm.equalsIgnoreCase(name)) {
			return hdr_tdlv_cntry_nm();
		}
		if ($hdr_tdlv_zip_cd.equalsIgnoreCase(name)) {
			return hdr_tdlv_zip_cd();
		}
		if ($hdr_tdlv_addr1.equalsIgnoreCase(name)) {
			return hdr_tdlv_addr1();
		}
		if ($hdr_tdlv_addr2.equalsIgnoreCase(name)) {
			return hdr_tdlv_addr2();
		}
		if ($hdr_tdlv_addr3.equalsIgnoreCase(name)) {
			return hdr_tdlv_addr3();
		}
		if ($hdr_tdlv_addr4.equalsIgnoreCase(name)) {
			return hdr_tdlv_addr4();
		}
		if ($hdr_tdlv_tel.equalsIgnoreCase(name)) {
			return hdr_tdlv_tel();
		}
		if ($hdr_tdlv_fax.equalsIgnoreCase(name)) {
			return hdr_tdlv_fax();
		}
		if ($hdr_tdlv_cntct_dpt.equalsIgnoreCase(name)) {
			return hdr_tdlv_cntct_dpt();
		}
		if ($hdr_tdlv_cntct_psn.equalsIgnoreCase(name)) {
			return hdr_tdlv_cntct_psn();
		}
		if ($hdr_via_dlv_typ.equalsIgnoreCase(name)) {
			return hdr_via_dlv_typ();
		}
		if ($hdr_via_dlv_typ_nm.equalsIgnoreCase(name)) {
			return hdr_via_dlv_typ_nm();
		}
		if ($sls_basis_typ.equalsIgnoreCase(name)) {
			return sls_basis_typ();
		}
		if ($hdr_wg_cd.equalsIgnoreCase(name)) {
			return hdr_wg_cd();
		}
		if ($trd_cur_cd.equalsIgnoreCase(name)) {
			return trd_cur_cd();
		}
		if ($base_cur_cd.equalsIgnoreCase(name)) {
			return base_cur_cd();
		}
		if ($ptax_cur_cd.equalsIgnoreCase(name)) {
			return ptax_cur_cd();
		}
		if ($hdr_sls_upri_req_typ.equalsIgnoreCase(name)) {
			return hdr_sls_upri_req_typ();
		}
		if ($hdr_ship_schd_split_typ.equalsIgnoreCase(name)) {
			return hdr_ship_schd_split_typ();
		}
		if ($assort_typ.equalsIgnoreCase(name)) {
			return assort_typ();
		}
		if ($iv_no.equalsIgnoreCase(name)) {
			return iv_no();
		}
		if ($hdr_dlv_day_week_typ.equalsIgnoreCase(name)) {
			return hdr_dlv_day_week_typ();
		}
		if ($hdr_dlv_day_week_typ_nm.equalsIgnoreCase(name)) {
			return hdr_dlv_day_week_typ_nm();
		}
		if ($tax_cd.equalsIgnoreCase(name)) {
			return tax_cd();
		}
		if ($tax_nm.equalsIgnoreCase(name)) {
			return tax_nm();
		}
		if ($tax_typ.equalsIgnoreCase(name)) {
			return tax_typ();
		}
		if ($dscnt_rsn_cd.equalsIgnoreCase(name)) {
			return dscnt_rsn_cd();
		}
		if ($dscnt_rsn_nm.equalsIgnoreCase(name)) {
			return dscnt_rsn_nm();
		}
		if ($dlv_day_week_typ.equalsIgnoreCase(name)) {
			return dlv_day_week_typ();
		}
		if ($dlv_day_week_typ_nm.equalsIgnoreCase(name)) {
			return dlv_day_week_typ_nm();
		}
		if ($dlv_cd.equalsIgnoreCase(name)) {
			return dlv_cd();
		}
		if ($dlv_nm.equalsIgnoreCase(name)) {
			return dlv_nm();
		}
		if ($dlv_lg_grp_cd.equalsIgnoreCase(name)) {
			return dlv_lg_grp_cd();
		}
		if ($dlv_lg_grp_nm.equalsIgnoreCase(name)) {
			return dlv_lg_grp_nm();
		}
		if ($dlv_cntry_cd.equalsIgnoreCase(name)) {
			return dlv_cntry_cd();
		}
		if ($dlv_cntry_nm.equalsIgnoreCase(name)) {
			return dlv_cntry_nm();
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
		if ($dlv_tel.equalsIgnoreCase(name)) {
			return dlv_tel();
		}
		if ($dlv_fax.equalsIgnoreCase(name)) {
			return dlv_fax();
		}
		if ($dlv_cntct_dpt.equalsIgnoreCase(name)) {
			return dlv_cntct_dpt();
		}
		if ($dlv_cntct_psn.equalsIgnoreCase(name)) {
			return dlv_cntct_psn();
		}
		if ($prnt_lcl_cd.equalsIgnoreCase(name)) {
			return prnt_lcl_cd();
		}
		if ($dest_cd1.equalsIgnoreCase(name)) {
			return dest_cd1();
		}
		if ($dest_nm1.equalsIgnoreCase(name)) {
			return dest_nm1();
		}
		if ($dest_cd2.equalsIgnoreCase(name)) {
			return dest_cd2();
		}
		if ($dest_nm2.equalsIgnoreCase(name)) {
			return dest_nm2();
		}
		if ($dest_cd3.equalsIgnoreCase(name)) {
			return dest_cd3();
		}
		if ($dest_nm3.equalsIgnoreCase(name)) {
			return dest_nm3();
		}
		if ($tdlv_cd.equalsIgnoreCase(name)) {
			return tdlv_cd();
		}
		if ($tdlv_nm.equalsIgnoreCase(name)) {
			return tdlv_nm();
		}
		if ($tdlv_lg_grp_cd.equalsIgnoreCase(name)) {
			return tdlv_lg_grp_cd();
		}
		if ($tdlv_lg_grp_nm.equalsIgnoreCase(name)) {
			return tdlv_lg_grp_nm();
		}
		if ($tdlv_cntry_cd.equalsIgnoreCase(name)) {
			return tdlv_cntry_cd();
		}
		if ($tdlv_cntry_nm.equalsIgnoreCase(name)) {
			return tdlv_cntry_nm();
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
		if ($via_dlv_typ.equalsIgnoreCase(name)) {
			return via_dlv_typ();
		}
		if ($via_dlv_typ_nm.equalsIgnoreCase(name)) {
			return via_dlv_typ_nm();
		}
		if ($proc_typ.equalsIgnoreCase(name)) {
			return proc_typ();
		}
		if ($ship_schd_split_typ.equalsIgnoreCase(name)) {
			return ship_schd_split_typ();
		}
		if ($alloc_scope_typ.equalsIgnoreCase(name)) {
			return alloc_scope_typ();
		}
		if ($alloc_typ.equalsIgnoreCase(name)) {
			return alloc_typ();
		}
		if ($sls_upri_req_typ.equalsIgnoreCase(name)) {
			return sls_upri_req_typ();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($cst_bill_crryovr_times.equalsIgnoreCase(name)) {
			return cst_bill_crryovr_times();
		}
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			return trd_unit_qty();
		}
		if ($trd_cur_upri.equalsIgnoreCase(name)) {
			return trd_cur_upri();
		}
		if ($tax_rate.equalsIgnoreCase(name)) {
			return tax_rate();
		}
		if ($cost_upri.equalsIgnoreCase(name)) {
			return cost_upri();
		}
		if ($bill_crryovr_times.equalsIgnoreCase(name)) {
			return bill_crryovr_times();
		}
		if ($set_itm_grp_no.equalsIgnoreCase(name)) {
			return set_itm_grp_no();
		}
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($hdr_ship_rqst_dt.equalsIgnoreCase(name)) {
			return hdr_ship_rqst_dt();
		}
		if ($hdr_ship_rqst_hm.equalsIgnoreCase(name)) {
			return hdr_ship_rqst_hm();
		}
		if ($hdr_dlv_rqst_dt.equalsIgnoreCase(name)) {
			return hdr_dlv_rqst_dt();
		}
		if ($hdr_dlv_rqst_hm.equalsIgnoreCase(name)) {
			return hdr_dlv_rqst_hm();
		}
		if ($ship_rqst_dt.equalsIgnoreCase(name)) {
			return ship_rqst_dt();
		}
		if ($ship_rqst_hm.equalsIgnoreCase(name)) {
			return ship_rqst_hm();
		}
		if ($dlv_rqst_dt.equalsIgnoreCase(name)) {
			return dlv_rqst_dt();
		}
		if ($dlv_rqst_hm.equalsIgnoreCase(name)) {
			return dlv_rqst_hm();
		}
		if ($sls_schd_dt.equalsIgnoreCase(name)) {
			return sls_schd_dt();
		}
		return super.getDateNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($hdr_dlv_sundry_flg.equalsIgnoreCase(name)) {
			return hdr_dlv_sundry_flg();
		}
		if ($hdr_pri_prnt_flg.equalsIgnoreCase(name)) {
			return hdr_pri_prnt_flg();
		}
		if ($hdr_tdlv_sundry_flg.equalsIgnoreCase(name)) {
			return hdr_tdlv_sundry_flg();
		}
		if ($hdr_tdlv_req_flg.equalsIgnoreCase(name)) {
			return hdr_tdlv_req_flg();
		}
		if ($cst_iv_flg.equalsIgnoreCase(name)) {
			return cst_iv_flg();
		}
		if ($iv_num_flg.equalsIgnoreCase(name)) {
			return iv_num_flg();
		}
		if ($vmi_flg.equalsIgnoreCase(name)) {
			return vmi_flg();
		}
		if ($inc_tax_flg.equalsIgnoreCase(name)) {
			return inc_tax_flg();
		}
		if ($is_editable_ship_rqst_dt.equalsIgnoreCase(name)) {
			return is_editable_ship_rqst_dt();
		}
		if ($is_editable_ship_rqst_hm.equalsIgnoreCase(name)) {
			return is_editable_ship_rqst_hm();
		}
		if ($is_editable_dlv_rqst_dt.equalsIgnoreCase(name)) {
			return is_editable_dlv_rqst_dt();
		}
		if ($is_editable_dlv_rqst_hm.equalsIgnoreCase(name)) {
			return is_editable_dlv_rqst_hm();
		}
		if ($is_editable_dlv_day_week_typ_nm.equalsIgnoreCase(name)) {
			return is_editable_dlv_day_week_typ_nm();
		}
		if ($is_editable_dlv_cd.equalsIgnoreCase(name)) {
			return is_editable_dlv_cd();
		}
		if ($dlv_sundry_flg.equalsIgnoreCase(name)) {
			return dlv_sundry_flg();
		}
		if ($pri_prnt_flg.equalsIgnoreCase(name)) {
			return pri_prnt_flg();
		}
		if ($tdlv_req_flg.equalsIgnoreCase(name)) {
			return tdlv_req_flg();
		}
		if ($is_editable_dest_cd1.equalsIgnoreCase(name)) {
			return is_editable_dest_cd1();
		}
		if ($is_editable_dest_cd2.equalsIgnoreCase(name)) {
			return is_editable_dest_cd2();
		}
		if ($is_editable_dest_cd3.equalsIgnoreCase(name)) {
			return is_editable_dest_cd3();
		}
		if ($is_editable_tdlv_cd.equalsIgnoreCase(name)) {
			return is_editable_tdlv_cd();
		}
		if ($tdlv_sundry_flg.equalsIgnoreCase(name)) {
			return tdlv_sundry_flg();
		}
		if ($sls_cststk_flg.equalsIgnoreCase(name)) {
			return sls_cststk_flg();
		}
		if ($from_slo_reg.equalsIgnoreCase(name)) {
			return from_slo_reg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($trd_ptn_typ.equalsIgnoreCase(name)) {
			trd_ptn_typ(value);
			return;
		}
		if ($hdr_dlv_cd.equalsIgnoreCase(name)) {
			hdr_dlv_cd(value);
			return;
		}
		if ($hdr_dlv_nm.equalsIgnoreCase(name)) {
			hdr_dlv_nm(value);
			return;
		}
		if ($hdr_dlv_lg_grp_cd.equalsIgnoreCase(name)) {
			hdr_dlv_lg_grp_cd(value);
			return;
		}
		if ($hdr_dlv_lg_grp_nm.equalsIgnoreCase(name)) {
			hdr_dlv_lg_grp_nm(value);
			return;
		}
		if ($hdr_dlv_cntry_cd.equalsIgnoreCase(name)) {
			hdr_dlv_cntry_cd(value);
			return;
		}
		if ($hdr_dlv_cntry_nm.equalsIgnoreCase(name)) {
			hdr_dlv_cntry_nm(value);
			return;
		}
		if ($hdr_dlv_zip_cd.equalsIgnoreCase(name)) {
			hdr_dlv_zip_cd(value);
			return;
		}
		if ($hdr_dlv_addr1.equalsIgnoreCase(name)) {
			hdr_dlv_addr1(value);
			return;
		}
		if ($hdr_dlv_addr2.equalsIgnoreCase(name)) {
			hdr_dlv_addr2(value);
			return;
		}
		if ($hdr_dlv_addr3.equalsIgnoreCase(name)) {
			hdr_dlv_addr3(value);
			return;
		}
		if ($hdr_dlv_addr4.equalsIgnoreCase(name)) {
			hdr_dlv_addr4(value);
			return;
		}
		if ($hdr_dlv_tel.equalsIgnoreCase(name)) {
			hdr_dlv_tel(value);
			return;
		}
		if ($hdr_dlv_fax.equalsIgnoreCase(name)) {
			hdr_dlv_fax(value);
			return;
		}
		if ($hdr_dlv_cntct_dpt.equalsIgnoreCase(name)) {
			hdr_dlv_cntct_dpt(value);
			return;
		}
		if ($hdr_dlv_cntct_psn.equalsIgnoreCase(name)) {
			hdr_dlv_cntct_psn(value);
			return;
		}
		if ($hdr_prnt_lcl_cd.equalsIgnoreCase(name)) {
			hdr_prnt_lcl_cd(value);
			return;
		}
		if ($hdr_dest_cd1.equalsIgnoreCase(name)) {
			hdr_dest_cd1(value);
			return;
		}
		if ($hdr_dest_nm1.equalsIgnoreCase(name)) {
			hdr_dest_nm1(value);
			return;
		}
		if ($hdr_dest_cd2.equalsIgnoreCase(name)) {
			hdr_dest_cd2(value);
			return;
		}
		if ($hdr_dest_nm2.equalsIgnoreCase(name)) {
			hdr_dest_nm2(value);
			return;
		}
		if ($hdr_dest_cd3.equalsIgnoreCase(name)) {
			hdr_dest_cd3(value);
			return;
		}
		if ($hdr_dest_nm3.equalsIgnoreCase(name)) {
			hdr_dest_nm3(value);
			return;
		}
		if ($hdr_tdlv_cd.equalsIgnoreCase(name)) {
			hdr_tdlv_cd(value);
			return;
		}
		if ($hdr_tdlv_nm.equalsIgnoreCase(name)) {
			hdr_tdlv_nm(value);
			return;
		}
		if ($hdr_tdlv_lg_grp_cd.equalsIgnoreCase(name)) {
			hdr_tdlv_lg_grp_cd(value);
			return;
		}
		if ($hdr_tdlv_lg_grp_nm.equalsIgnoreCase(name)) {
			hdr_tdlv_lg_grp_nm(value);
			return;
		}
		if ($hdr_tdlv_cntry_cd.equalsIgnoreCase(name)) {
			hdr_tdlv_cntry_cd(value);
			return;
		}
		if ($hdr_tdlv_cntry_nm.equalsIgnoreCase(name)) {
			hdr_tdlv_cntry_nm(value);
			return;
		}
		if ($hdr_tdlv_zip_cd.equalsIgnoreCase(name)) {
			hdr_tdlv_zip_cd(value);
			return;
		}
		if ($hdr_tdlv_addr1.equalsIgnoreCase(name)) {
			hdr_tdlv_addr1(value);
			return;
		}
		if ($hdr_tdlv_addr2.equalsIgnoreCase(name)) {
			hdr_tdlv_addr2(value);
			return;
		}
		if ($hdr_tdlv_addr3.equalsIgnoreCase(name)) {
			hdr_tdlv_addr3(value);
			return;
		}
		if ($hdr_tdlv_addr4.equalsIgnoreCase(name)) {
			hdr_tdlv_addr4(value);
			return;
		}
		if ($hdr_tdlv_tel.equalsIgnoreCase(name)) {
			hdr_tdlv_tel(value);
			return;
		}
		if ($hdr_tdlv_fax.equalsIgnoreCase(name)) {
			hdr_tdlv_fax(value);
			return;
		}
		if ($hdr_tdlv_cntct_dpt.equalsIgnoreCase(name)) {
			hdr_tdlv_cntct_dpt(value);
			return;
		}
		if ($hdr_tdlv_cntct_psn.equalsIgnoreCase(name)) {
			hdr_tdlv_cntct_psn(value);
			return;
		}
		if ($hdr_via_dlv_typ.equalsIgnoreCase(name)) {
			hdr_via_dlv_typ(value);
			return;
		}
		if ($hdr_via_dlv_typ_nm.equalsIgnoreCase(name)) {
			hdr_via_dlv_typ_nm(value);
			return;
		}
		if ($sls_basis_typ.equalsIgnoreCase(name)) {
			sls_basis_typ(value);
			return;
		}
		if ($hdr_wg_cd.equalsIgnoreCase(name)) {
			hdr_wg_cd(value);
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
		if ($ptax_cur_cd.equalsIgnoreCase(name)) {
			ptax_cur_cd(value);
			return;
		}
		if ($hdr_sls_upri_req_typ.equalsIgnoreCase(name)) {
			hdr_sls_upri_req_typ(value);
			return;
		}
		if ($hdr_ship_schd_split_typ.equalsIgnoreCase(name)) {
			hdr_ship_schd_split_typ(value);
			return;
		}
		if ($assort_typ.equalsIgnoreCase(name)) {
			assort_typ(value);
			return;
		}
		if ($iv_no.equalsIgnoreCase(name)) {
			iv_no(value);
			return;
		}
		if ($hdr_dlv_day_week_typ.equalsIgnoreCase(name)) {
			hdr_dlv_day_week_typ(value);
			return;
		}
		if ($hdr_dlv_day_week_typ_nm.equalsIgnoreCase(name)) {
			hdr_dlv_day_week_typ_nm(value);
			return;
		}
		if ($tax_cd.equalsIgnoreCase(name)) {
			tax_cd(value);
			return;
		}
		if ($tax_nm.equalsIgnoreCase(name)) {
			tax_nm(value);
			return;
		}
		if ($tax_typ.equalsIgnoreCase(name)) {
			tax_typ(value);
			return;
		}
		if ($dscnt_rsn_cd.equalsIgnoreCase(name)) {
			dscnt_rsn_cd(value);
			return;
		}
		if ($dscnt_rsn_nm.equalsIgnoreCase(name)) {
			dscnt_rsn_nm(value);
			return;
		}
		if ($dlv_day_week_typ.equalsIgnoreCase(name)) {
			dlv_day_week_typ(value);
			return;
		}
		if ($dlv_day_week_typ_nm.equalsIgnoreCase(name)) {
			dlv_day_week_typ_nm(value);
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
		if ($dlv_lg_grp_cd.equalsIgnoreCase(name)) {
			dlv_lg_grp_cd(value);
			return;
		}
		if ($dlv_lg_grp_nm.equalsIgnoreCase(name)) {
			dlv_lg_grp_nm(value);
			return;
		}
		if ($dlv_cntry_cd.equalsIgnoreCase(name)) {
			dlv_cntry_cd(value);
			return;
		}
		if ($dlv_cntry_nm.equalsIgnoreCase(name)) {
			dlv_cntry_nm(value);
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
		if ($dlv_tel.equalsIgnoreCase(name)) {
			dlv_tel(value);
			return;
		}
		if ($dlv_fax.equalsIgnoreCase(name)) {
			dlv_fax(value);
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
		if ($prnt_lcl_cd.equalsIgnoreCase(name)) {
			prnt_lcl_cd(value);
			return;
		}
		if ($dest_cd1.equalsIgnoreCase(name)) {
			dest_cd1(value);
			return;
		}
		if ($dest_nm1.equalsIgnoreCase(name)) {
			dest_nm1(value);
			return;
		}
		if ($dest_cd2.equalsIgnoreCase(name)) {
			dest_cd2(value);
			return;
		}
		if ($dest_nm2.equalsIgnoreCase(name)) {
			dest_nm2(value);
			return;
		}
		if ($dest_cd3.equalsIgnoreCase(name)) {
			dest_cd3(value);
			return;
		}
		if ($dest_nm3.equalsIgnoreCase(name)) {
			dest_nm3(value);
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
		if ($tdlv_lg_grp_cd.equalsIgnoreCase(name)) {
			tdlv_lg_grp_cd(value);
			return;
		}
		if ($tdlv_lg_grp_nm.equalsIgnoreCase(name)) {
			tdlv_lg_grp_nm(value);
			return;
		}
		if ($tdlv_cntry_cd.equalsIgnoreCase(name)) {
			tdlv_cntry_cd(value);
			return;
		}
		if ($tdlv_cntry_nm.equalsIgnoreCase(name)) {
			tdlv_cntry_nm(value);
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
		if ($via_dlv_typ.equalsIgnoreCase(name)) {
			via_dlv_typ(value);
			return;
		}
		if ($via_dlv_typ_nm.equalsIgnoreCase(name)) {
			via_dlv_typ_nm(value);
			return;
		}
		if ($proc_typ.equalsIgnoreCase(name)) {
			proc_typ(value);
			return;
		}
		if ($ship_schd_split_typ.equalsIgnoreCase(name)) {
			ship_schd_split_typ(value);
			return;
		}
		if ($alloc_scope_typ.equalsIgnoreCase(name)) {
			alloc_scope_typ(value);
			return;
		}
		if ($alloc_typ.equalsIgnoreCase(name)) {
			alloc_typ(value);
			return;
		}
		if ($sls_upri_req_typ.equalsIgnoreCase(name)) {
			sls_upri_req_typ(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($cst_bill_crryovr_times.equalsIgnoreCase(name)) {
			cst_bill_crryovr_times(value);
			return;
		}
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
			return;
		}
		if ($trd_cur_upri.equalsIgnoreCase(name)) {
			trd_cur_upri(value);
			return;
		}
		if ($tax_rate.equalsIgnoreCase(name)) {
			tax_rate(value);
			return;
		}
		if ($cost_upri.equalsIgnoreCase(name)) {
			cost_upri(value);
			return;
		}
		if ($bill_crryovr_times.equalsIgnoreCase(name)) {
			bill_crryovr_times(value);
			return;
		}
		if ($set_itm_grp_no.equalsIgnoreCase(name)) {
			set_itm_grp_no(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($cst_bill_crryovr_times.equalsIgnoreCase(name)) {
			cst_bill_crryovr_times(value);
			return;
		}
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
			return;
		}
		if ($trd_cur_upri.equalsIgnoreCase(name)) {
			trd_cur_upri(value);
			return;
		}
		if ($tax_rate.equalsIgnoreCase(name)) {
			tax_rate(value);
			return;
		}
		if ($cost_upri.equalsIgnoreCase(name)) {
			cost_upri(value);
			return;
		}
		if ($bill_crryovr_times.equalsIgnoreCase(name)) {
			bill_crryovr_times(value);
			return;
		}
		if ($set_itm_grp_no.equalsIgnoreCase(name)) {
			set_itm_grp_no(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($cst_bill_crryovr_times.equalsIgnoreCase(name)) {
			cst_bill_crryovr_times(value);
			return;
		}
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
			return;
		}
		if ($trd_cur_upri.equalsIgnoreCase(name)) {
			trd_cur_upri(value);
			return;
		}
		if ($tax_rate.equalsIgnoreCase(name)) {
			tax_rate(value);
			return;
		}
		if ($cost_upri.equalsIgnoreCase(name)) {
			cost_upri(value);
			return;
		}
		if ($bill_crryovr_times.equalsIgnoreCase(name)) {
			bill_crryovr_times(value);
			return;
		}
		if ($set_itm_grp_no.equalsIgnoreCase(name)) {
			set_itm_grp_no(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($cst_bill_crryovr_times.equalsIgnoreCase(name)) {
			cst_bill_crryovr_times(value);
			return;
		}
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
			return;
		}
		if ($trd_cur_upri.equalsIgnoreCase(name)) {
			trd_cur_upri(value);
			return;
		}
		if ($tax_rate.equalsIgnoreCase(name)) {
			tax_rate(value);
			return;
		}
		if ($cost_upri.equalsIgnoreCase(name)) {
			cost_upri(value);
			return;
		}
		if ($bill_crryovr_times.equalsIgnoreCase(name)) {
			bill_crryovr_times(value);
			return;
		}
		if ($set_itm_grp_no.equalsIgnoreCase(name)) {
			set_itm_grp_no(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($cst_bill_crryovr_times.equalsIgnoreCase(name)) {
			cst_bill_crryovr_times(value);
			return;
		}
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
			return;
		}
		if ($trd_cur_upri.equalsIgnoreCase(name)) {
			trd_cur_upri(value);
			return;
		}
		if ($tax_rate.equalsIgnoreCase(name)) {
			tax_rate(value);
			return;
		}
		if ($cost_upri.equalsIgnoreCase(name)) {
			cost_upri(value);
			return;
		}
		if ($bill_crryovr_times.equalsIgnoreCase(name)) {
			bill_crryovr_times(value);
			return;
		}
		if ($set_itm_grp_no.equalsIgnoreCase(name)) {
			set_itm_grp_no(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($hdr_ship_rqst_dt.equalsIgnoreCase(name)) {
			hdr_ship_rqst_dt(value);
			return;
		}
		if ($hdr_ship_rqst_hm.equalsIgnoreCase(name)) {
			hdr_ship_rqst_hm(value);
			return;
		}
		if ($hdr_dlv_rqst_dt.equalsIgnoreCase(name)) {
			hdr_dlv_rqst_dt(value);
			return;
		}
		if ($hdr_dlv_rqst_hm.equalsIgnoreCase(name)) {
			hdr_dlv_rqst_hm(value);
			return;
		}
		if ($ship_rqst_dt.equalsIgnoreCase(name)) {
			ship_rqst_dt(value);
			return;
		}
		if ($ship_rqst_hm.equalsIgnoreCase(name)) {
			ship_rqst_hm(value);
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
		if ($sls_schd_dt.equalsIgnoreCase(name)) {
			sls_schd_dt(value);
			return;
		}
		super.setDate(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($hdr_dlv_sundry_flg.equalsIgnoreCase(name)) {
			hdr_dlv_sundry_flg(value);
			return;
		}
		if ($hdr_pri_prnt_flg.equalsIgnoreCase(name)) {
			hdr_pri_prnt_flg(value);
			return;
		}
		if ($hdr_tdlv_sundry_flg.equalsIgnoreCase(name)) {
			hdr_tdlv_sundry_flg(value);
			return;
		}
		if ($hdr_tdlv_req_flg.equalsIgnoreCase(name)) {
			hdr_tdlv_req_flg(value);
			return;
		}
		if ($cst_iv_flg.equalsIgnoreCase(name)) {
			cst_iv_flg(value);
			return;
		}
		if ($iv_num_flg.equalsIgnoreCase(name)) {
			iv_num_flg(value);
			return;
		}
		if ($vmi_flg.equalsIgnoreCase(name)) {
			vmi_flg(value);
			return;
		}
		if ($inc_tax_flg.equalsIgnoreCase(name)) {
			inc_tax_flg(value);
			return;
		}
		if ($is_editable_ship_rqst_dt.equalsIgnoreCase(name)) {
			is_editable_ship_rqst_dt(value);
			return;
		}
		if ($is_editable_ship_rqst_hm.equalsIgnoreCase(name)) {
			is_editable_ship_rqst_hm(value);
			return;
		}
		if ($is_editable_dlv_rqst_dt.equalsIgnoreCase(name)) {
			is_editable_dlv_rqst_dt(value);
			return;
		}
		if ($is_editable_dlv_rqst_hm.equalsIgnoreCase(name)) {
			is_editable_dlv_rqst_hm(value);
			return;
		}
		if ($is_editable_dlv_day_week_typ_nm.equalsIgnoreCase(name)) {
			is_editable_dlv_day_week_typ_nm(value);
			return;
		}
		if ($is_editable_dlv_cd.equalsIgnoreCase(name)) {
			is_editable_dlv_cd(value);
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
		if ($tdlv_req_flg.equalsIgnoreCase(name)) {
			tdlv_req_flg(value);
			return;
		}
		if ($is_editable_dest_cd1.equalsIgnoreCase(name)) {
			is_editable_dest_cd1(value);
			return;
		}
		if ($is_editable_dest_cd2.equalsIgnoreCase(name)) {
			is_editable_dest_cd2(value);
			return;
		}
		if ($is_editable_dest_cd3.equalsIgnoreCase(name)) {
			is_editable_dest_cd3(value);
			return;
		}
		if ($is_editable_tdlv_cd.equalsIgnoreCase(name)) {
			is_editable_tdlv_cd(value);
			return;
		}
		if ($tdlv_sundry_flg.equalsIgnoreCase(name)) {
			tdlv_sundry_flg(value);
			return;
		}
		if ($sls_cststk_flg.equalsIgnoreCase(name)) {
			sls_cststk_flg(value);
			return;
		}
		if ($from_slo_reg.equalsIgnoreCase(name)) {
			from_slo_reg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($trd_ptn_typ.equalsIgnoreCase(name)) {
			trd_ptn_typ(value);
			return;
		}
		if ($hdr_dlv_cd.equalsIgnoreCase(name)) {
			hdr_dlv_cd(value);
			return;
		}
		if ($hdr_dlv_nm.equalsIgnoreCase(name)) {
			hdr_dlv_nm(value);
			return;
		}
		if ($hdr_dlv_lg_grp_cd.equalsIgnoreCase(name)) {
			hdr_dlv_lg_grp_cd(value);
			return;
		}
		if ($hdr_dlv_lg_grp_nm.equalsIgnoreCase(name)) {
			hdr_dlv_lg_grp_nm(value);
			return;
		}
		if ($hdr_dlv_cntry_cd.equalsIgnoreCase(name)) {
			hdr_dlv_cntry_cd(value);
			return;
		}
		if ($hdr_dlv_cntry_nm.equalsIgnoreCase(name)) {
			hdr_dlv_cntry_nm(value);
			return;
		}
		if ($hdr_dlv_zip_cd.equalsIgnoreCase(name)) {
			hdr_dlv_zip_cd(value);
			return;
		}
		if ($hdr_dlv_addr1.equalsIgnoreCase(name)) {
			hdr_dlv_addr1(value);
			return;
		}
		if ($hdr_dlv_addr2.equalsIgnoreCase(name)) {
			hdr_dlv_addr2(value);
			return;
		}
		if ($hdr_dlv_addr3.equalsIgnoreCase(name)) {
			hdr_dlv_addr3(value);
			return;
		}
		if ($hdr_dlv_addr4.equalsIgnoreCase(name)) {
			hdr_dlv_addr4(value);
			return;
		}
		if ($hdr_dlv_tel.equalsIgnoreCase(name)) {
			hdr_dlv_tel(value);
			return;
		}
		if ($hdr_dlv_fax.equalsIgnoreCase(name)) {
			hdr_dlv_fax(value);
			return;
		}
		if ($hdr_dlv_cntct_dpt.equalsIgnoreCase(name)) {
			hdr_dlv_cntct_dpt(value);
			return;
		}
		if ($hdr_dlv_cntct_psn.equalsIgnoreCase(name)) {
			hdr_dlv_cntct_psn(value);
			return;
		}
		if ($hdr_prnt_lcl_cd.equalsIgnoreCase(name)) {
			hdr_prnt_lcl_cd(value);
			return;
		}
		if ($hdr_dest_cd1.equalsIgnoreCase(name)) {
			hdr_dest_cd1(value);
			return;
		}
		if ($hdr_dest_nm1.equalsIgnoreCase(name)) {
			hdr_dest_nm1(value);
			return;
		}
		if ($hdr_dest_cd2.equalsIgnoreCase(name)) {
			hdr_dest_cd2(value);
			return;
		}
		if ($hdr_dest_nm2.equalsIgnoreCase(name)) {
			hdr_dest_nm2(value);
			return;
		}
		if ($hdr_dest_cd3.equalsIgnoreCase(name)) {
			hdr_dest_cd3(value);
			return;
		}
		if ($hdr_dest_nm3.equalsIgnoreCase(name)) {
			hdr_dest_nm3(value);
			return;
		}
		if ($hdr_tdlv_cd.equalsIgnoreCase(name)) {
			hdr_tdlv_cd(value);
			return;
		}
		if ($hdr_tdlv_nm.equalsIgnoreCase(name)) {
			hdr_tdlv_nm(value);
			return;
		}
		if ($hdr_tdlv_lg_grp_cd.equalsIgnoreCase(name)) {
			hdr_tdlv_lg_grp_cd(value);
			return;
		}
		if ($hdr_tdlv_lg_grp_nm.equalsIgnoreCase(name)) {
			hdr_tdlv_lg_grp_nm(value);
			return;
		}
		if ($hdr_tdlv_cntry_cd.equalsIgnoreCase(name)) {
			hdr_tdlv_cntry_cd(value);
			return;
		}
		if ($hdr_tdlv_cntry_nm.equalsIgnoreCase(name)) {
			hdr_tdlv_cntry_nm(value);
			return;
		}
		if ($hdr_tdlv_zip_cd.equalsIgnoreCase(name)) {
			hdr_tdlv_zip_cd(value);
			return;
		}
		if ($hdr_tdlv_addr1.equalsIgnoreCase(name)) {
			hdr_tdlv_addr1(value);
			return;
		}
		if ($hdr_tdlv_addr2.equalsIgnoreCase(name)) {
			hdr_tdlv_addr2(value);
			return;
		}
		if ($hdr_tdlv_addr3.equalsIgnoreCase(name)) {
			hdr_tdlv_addr3(value);
			return;
		}
		if ($hdr_tdlv_addr4.equalsIgnoreCase(name)) {
			hdr_tdlv_addr4(value);
			return;
		}
		if ($hdr_tdlv_tel.equalsIgnoreCase(name)) {
			hdr_tdlv_tel(value);
			return;
		}
		if ($hdr_tdlv_fax.equalsIgnoreCase(name)) {
			hdr_tdlv_fax(value);
			return;
		}
		if ($hdr_tdlv_cntct_dpt.equalsIgnoreCase(name)) {
			hdr_tdlv_cntct_dpt(value);
			return;
		}
		if ($hdr_tdlv_cntct_psn.equalsIgnoreCase(name)) {
			hdr_tdlv_cntct_psn(value);
			return;
		}
		if ($hdr_via_dlv_typ.equalsIgnoreCase(name)) {
			hdr_via_dlv_typ(value);
			return;
		}
		if ($hdr_via_dlv_typ_nm.equalsIgnoreCase(name)) {
			hdr_via_dlv_typ_nm(value);
			return;
		}
		if ($sls_basis_typ.equalsIgnoreCase(name)) {
			sls_basis_typ(value);
			return;
		}
		if ($hdr_wg_cd.equalsIgnoreCase(name)) {
			hdr_wg_cd(value);
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
		if ($ptax_cur_cd.equalsIgnoreCase(name)) {
			ptax_cur_cd(value);
			return;
		}
		if ($hdr_sls_upri_req_typ.equalsIgnoreCase(name)) {
			hdr_sls_upri_req_typ(value);
			return;
		}
		if ($hdr_ship_schd_split_typ.equalsIgnoreCase(name)) {
			hdr_ship_schd_split_typ(value);
			return;
		}
		if ($assort_typ.equalsIgnoreCase(name)) {
			assort_typ(value);
			return;
		}
		if ($iv_no.equalsIgnoreCase(name)) {
			iv_no(value);
			return;
		}
		if ($hdr_dlv_day_week_typ.equalsIgnoreCase(name)) {
			hdr_dlv_day_week_typ(value);
			return;
		}
		if ($hdr_dlv_day_week_typ_nm.equalsIgnoreCase(name)) {
			hdr_dlv_day_week_typ_nm(value);
			return;
		}
		if ($tax_cd.equalsIgnoreCase(name)) {
			tax_cd(value);
			return;
		}
		if ($tax_nm.equalsIgnoreCase(name)) {
			tax_nm(value);
			return;
		}
		if ($tax_typ.equalsIgnoreCase(name)) {
			tax_typ(value);
			return;
		}
		if ($dscnt_rsn_cd.equalsIgnoreCase(name)) {
			dscnt_rsn_cd(value);
			return;
		}
		if ($dscnt_rsn_nm.equalsIgnoreCase(name)) {
			dscnt_rsn_nm(value);
			return;
		}
		if ($dlv_day_week_typ.equalsIgnoreCase(name)) {
			dlv_day_week_typ(value);
			return;
		}
		if ($dlv_day_week_typ_nm.equalsIgnoreCase(name)) {
			dlv_day_week_typ_nm(value);
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
		if ($dlv_lg_grp_cd.equalsIgnoreCase(name)) {
			dlv_lg_grp_cd(value);
			return;
		}
		if ($dlv_lg_grp_nm.equalsIgnoreCase(name)) {
			dlv_lg_grp_nm(value);
			return;
		}
		if ($dlv_cntry_cd.equalsIgnoreCase(name)) {
			dlv_cntry_cd(value);
			return;
		}
		if ($dlv_cntry_nm.equalsIgnoreCase(name)) {
			dlv_cntry_nm(value);
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
		if ($dlv_tel.equalsIgnoreCase(name)) {
			dlv_tel(value);
			return;
		}
		if ($dlv_fax.equalsIgnoreCase(name)) {
			dlv_fax(value);
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
		if ($prnt_lcl_cd.equalsIgnoreCase(name)) {
			prnt_lcl_cd(value);
			return;
		}
		if ($dest_cd1.equalsIgnoreCase(name)) {
			dest_cd1(value);
			return;
		}
		if ($dest_nm1.equalsIgnoreCase(name)) {
			dest_nm1(value);
			return;
		}
		if ($dest_cd2.equalsIgnoreCase(name)) {
			dest_cd2(value);
			return;
		}
		if ($dest_nm2.equalsIgnoreCase(name)) {
			dest_nm2(value);
			return;
		}
		if ($dest_cd3.equalsIgnoreCase(name)) {
			dest_cd3(value);
			return;
		}
		if ($dest_nm3.equalsIgnoreCase(name)) {
			dest_nm3(value);
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
		if ($tdlv_lg_grp_cd.equalsIgnoreCase(name)) {
			tdlv_lg_grp_cd(value);
			return;
		}
		if ($tdlv_lg_grp_nm.equalsIgnoreCase(name)) {
			tdlv_lg_grp_nm(value);
			return;
		}
		if ($tdlv_cntry_cd.equalsIgnoreCase(name)) {
			tdlv_cntry_cd(value);
			return;
		}
		if ($tdlv_cntry_nm.equalsIgnoreCase(name)) {
			tdlv_cntry_nm(value);
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
		if ($via_dlv_typ.equalsIgnoreCase(name)) {
			via_dlv_typ(value);
			return;
		}
		if ($via_dlv_typ_nm.equalsIgnoreCase(name)) {
			via_dlv_typ_nm(value);
			return;
		}
		if ($proc_typ.equalsIgnoreCase(name)) {
			proc_typ(value);
			return;
		}
		if ($ship_schd_split_typ.equalsIgnoreCase(name)) {
			ship_schd_split_typ(value);
			return;
		}
		if ($alloc_scope_typ.equalsIgnoreCase(name)) {
			alloc_scope_typ(value);
			return;
		}
		if ($alloc_typ.equalsIgnoreCase(name)) {
			alloc_typ(value);
			return;
		}
		if ($sls_upri_req_typ.equalsIgnoreCase(name)) {
			sls_upri_req_typ(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($cst_bill_crryovr_times.equalsIgnoreCase(name)) {
			cst_bill_crryovr_times(value);
			return;
		}
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
			return;
		}
		if ($trd_cur_upri.equalsIgnoreCase(name)) {
			trd_cur_upri(value);
			return;
		}
		if ($tax_rate.equalsIgnoreCase(name)) {
			tax_rate(value);
			return;
		}
		if ($cost_upri.equalsIgnoreCase(name)) {
			cost_upri(value);
			return;
		}
		if ($bill_crryovr_times.equalsIgnoreCase(name)) {
			bill_crryovr_times(value);
			return;
		}
		if ($set_itm_grp_no.equalsIgnoreCase(name)) {
			set_itm_grp_no(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($cst_bill_crryovr_times.equalsIgnoreCase(name)) {
			cst_bill_crryovr_times(value);
			return;
		}
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
			return;
		}
		if ($trd_cur_upri.equalsIgnoreCase(name)) {
			trd_cur_upri(value);
			return;
		}
		if ($tax_rate.equalsIgnoreCase(name)) {
			tax_rate(value);
			return;
		}
		if ($cost_upri.equalsIgnoreCase(name)) {
			cost_upri(value);
			return;
		}
		if ($bill_crryovr_times.equalsIgnoreCase(name)) {
			bill_crryovr_times(value);
			return;
		}
		if ($set_itm_grp_no.equalsIgnoreCase(name)) {
			set_itm_grp_no(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($cst_bill_crryovr_times.equalsIgnoreCase(name)) {
			cst_bill_crryovr_times(value);
			return;
		}
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
			return;
		}
		if ($trd_cur_upri.equalsIgnoreCase(name)) {
			trd_cur_upri(value);
			return;
		}
		if ($tax_rate.equalsIgnoreCase(name)) {
			tax_rate(value);
			return;
		}
		if ($cost_upri.equalsIgnoreCase(name)) {
			cost_upri(value);
			return;
		}
		if ($bill_crryovr_times.equalsIgnoreCase(name)) {
			bill_crryovr_times(value);
			return;
		}
		if ($set_itm_grp_no.equalsIgnoreCase(name)) {
			set_itm_grp_no(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($cst_bill_crryovr_times.equalsIgnoreCase(name)) {
			cst_bill_crryovr_times(value);
			return;
		}
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
			return;
		}
		if ($trd_cur_upri.equalsIgnoreCase(name)) {
			trd_cur_upri(value);
			return;
		}
		if ($tax_rate.equalsIgnoreCase(name)) {
			tax_rate(value);
			return;
		}
		if ($cost_upri.equalsIgnoreCase(name)) {
			cost_upri(value);
			return;
		}
		if ($bill_crryovr_times.equalsIgnoreCase(name)) {
			bill_crryovr_times(value);
			return;
		}
		if ($set_itm_grp_no.equalsIgnoreCase(name)) {
			set_itm_grp_no(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($cst_bill_crryovr_times.equalsIgnoreCase(name)) {
			cst_bill_crryovr_times(value);
			return;
		}
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
			return;
		}
		if ($trd_cur_upri.equalsIgnoreCase(name)) {
			trd_cur_upri(value);
			return;
		}
		if ($tax_rate.equalsIgnoreCase(name)) {
			tax_rate(value);
			return;
		}
		if ($cost_upri.equalsIgnoreCase(name)) {
			cost_upri(value);
			return;
		}
		if ($bill_crryovr_times.equalsIgnoreCase(name)) {
			bill_crryovr_times(value);
			return;
		}
		if ($set_itm_grp_no.equalsIgnoreCase(name)) {
			set_itm_grp_no(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($hdr_ship_rqst_dt.equalsIgnoreCase(name)) {
			hdr_ship_rqst_dt(value);
			return;
		}
		if ($hdr_ship_rqst_hm.equalsIgnoreCase(name)) {
			hdr_ship_rqst_hm(value);
			return;
		}
		if ($hdr_dlv_rqst_dt.equalsIgnoreCase(name)) {
			hdr_dlv_rqst_dt(value);
			return;
		}
		if ($hdr_dlv_rqst_hm.equalsIgnoreCase(name)) {
			hdr_dlv_rqst_hm(value);
			return;
		}
		if ($ship_rqst_dt.equalsIgnoreCase(name)) {
			ship_rqst_dt(value);
			return;
		}
		if ($ship_rqst_hm.equalsIgnoreCase(name)) {
			ship_rqst_hm(value);
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
		if ($sls_schd_dt.equalsIgnoreCase(name)) {
			sls_schd_dt(value);
			return;
		}
		super.setDateNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($hdr_dlv_sundry_flg.equalsIgnoreCase(name)) {
			hdr_dlv_sundry_flg(value);
			return;
		}
		if ($hdr_pri_prnt_flg.equalsIgnoreCase(name)) {
			hdr_pri_prnt_flg(value);
			return;
		}
		if ($hdr_tdlv_sundry_flg.equalsIgnoreCase(name)) {
			hdr_tdlv_sundry_flg(value);
			return;
		}
		if ($hdr_tdlv_req_flg.equalsIgnoreCase(name)) {
			hdr_tdlv_req_flg(value);
			return;
		}
		if ($cst_iv_flg.equalsIgnoreCase(name)) {
			cst_iv_flg(value);
			return;
		}
		if ($iv_num_flg.equalsIgnoreCase(name)) {
			iv_num_flg(value);
			return;
		}
		if ($vmi_flg.equalsIgnoreCase(name)) {
			vmi_flg(value);
			return;
		}
		if ($inc_tax_flg.equalsIgnoreCase(name)) {
			inc_tax_flg(value);
			return;
		}
		if ($is_editable_ship_rqst_dt.equalsIgnoreCase(name)) {
			is_editable_ship_rqst_dt(value);
			return;
		}
		if ($is_editable_ship_rqst_hm.equalsIgnoreCase(name)) {
			is_editable_ship_rqst_hm(value);
			return;
		}
		if ($is_editable_dlv_rqst_dt.equalsIgnoreCase(name)) {
			is_editable_dlv_rqst_dt(value);
			return;
		}
		if ($is_editable_dlv_rqst_hm.equalsIgnoreCase(name)) {
			is_editable_dlv_rqst_hm(value);
			return;
		}
		if ($is_editable_dlv_day_week_typ_nm.equalsIgnoreCase(name)) {
			is_editable_dlv_day_week_typ_nm(value);
			return;
		}
		if ($is_editable_dlv_cd.equalsIgnoreCase(name)) {
			is_editable_dlv_cd(value);
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
		if ($tdlv_req_flg.equalsIgnoreCase(name)) {
			tdlv_req_flg(value);
			return;
		}
		if ($is_editable_dest_cd1.equalsIgnoreCase(name)) {
			is_editable_dest_cd1(value);
			return;
		}
		if ($is_editable_dest_cd2.equalsIgnoreCase(name)) {
			is_editable_dest_cd2(value);
			return;
		}
		if ($is_editable_dest_cd3.equalsIgnoreCase(name)) {
			is_editable_dest_cd3(value);
			return;
		}
		if ($is_editable_tdlv_cd.equalsIgnoreCase(name)) {
			is_editable_tdlv_cd(value);
			return;
		}
		if ($tdlv_sundry_flg.equalsIgnoreCase(name)) {
			tdlv_sundry_flg(value);
			return;
		}
		if ($sls_cststk_flg.equalsIgnoreCase(name)) {
			sls_cststk_flg(value);
			return;
		}
		if ($from_slo_reg.equalsIgnoreCase(name)) {
			from_slo_reg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

