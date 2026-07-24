package mcframe.serverMSBB.MSBBL1340;

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
 * ブロック"Srch01_Dtl"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class Srch01_DtlR_MC_A extends MCConstRow {

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
	 * Inventory management type 在庫管理区分.<p>
	 *
	 */
	public static final String $stk_mng_typ = "stk_mng_typ";
	/**
	 * Item name for invoice インボイス表記品名.<p>
	 *
	 */
	public static final String $iv_itm_nm = "iv_itm_nm";
	/**
	 * Miscellaneous item 諸口品.<p>
	 *
	 */
	public static final String $sundry_itm_flg = "sundry_itm_flg";
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
	 * Print price 価格印字.<p>
	 *
	 */
	public static final String $pri_prnt_flg = "pri_prnt_flg";
	/**
	 * Country cd. 国ＣＤ.<p>
	 *
	 */
	public static final String $cntry_cd = "cntry_cd";
	/**
	 * Country name 国名.<p>
	 *
	 */
	public static final String $cntry_nm = "cntry_nm";
	/**
	 * Distribution channel cd. 1 仕向先ＣＤ１.<p>
	 *
	 */
	public static final String $dest_cd1 = "dest_cd1";
	/**
	 * Distribution channel name 1 仕向先名１.<p>
	 *
	 */
	public static final String $dest_nm1 = "dest_nm1";
	/**
	 * Distribution channel cd. 2 仕向先ＣＤ２.<p>
	 *
	 */
	public static final String $dest_cd2 = "dest_cd2";
	/**
	 * Distribution channel name 2 仕向先名２.<p>
	 *
	 */
	public static final String $dest_nm2 = "dest_nm2";
	/**
	 * Distribution channel cd. 3 仕向先ＣＤ３.<p>
	 *
	 */
	public static final String $dest_cd3 = "dest_cd3";
	/**
	 * Distribution channel name 3 仕向先名３.<p>
	 *
	 */
	public static final String $dest_nm3 = "dest_nm3";
	/**
	 * Purchase result No. 仕入実績ＮＯ.<p>
	 *
	 */
	public static final String $purc_act_no = "purc_act_no";
	/**
	 * Purchase result rev. number 仕入実績改訂番号.<p>
	 *
	 */
	public static final String $purc_act_rev = "purc_act_rev";
	/**
	 * Purchase result details No. 仕入実績明細ＮＯ.<p>
	 *
	 */
	public static final String $purc_act_d_no = "purc_act_d_no";
	/**
	 * Direct delivery PO No. 仕入直送発注ＮＯ.<p>
	 *
	 */
	public static final String $purc_ddlv_po_no = "purc_ddlv_po_no";
	/**
	 * Supplier cd. 発注先ＣＤ.<p>
	 *
	 */
	public static final String $sppl_cd = "sppl_cd";
	/**
	 * Supplier name 発注先名.<p>
	 *
	 */
	public static final String $sppl_nm = "sppl_nm";
	/**
	 * Supplier country cd. 発注先国ＣＤ.<p>
	 *
	 */
	public static final String $sppl_cntry_cd = "sppl_cntry_cd";
	/**
	 * Supplier country name 発注先国名.<p>
	 *
	 */
	public static final String $sppl_cntry_nm = "sppl_cntry_nm";
	/**
	 * Return-to name 返品先名.<p>
	 *
	 */
	public static final String $ret_nm = "ret_nm";
	/**
	 * Return-to zip code 返品先郵便番号.<p>
	 *
	 */
	public static final String $ret_zip_cd = "ret_zip_cd";
	/**
	 * Return-to address 1 返品先住所１.<p>
	 *
	 */
	public static final String $ret_addr1 = "ret_addr1";
	/**
	 * Return-to address 2 返品先住所２.<p>
	 *
	 */
	public static final String $ret_addr2 = "ret_addr2";
	/**
	 * Return-to address 3 返品先住所３.<p>
	 *
	 */
	public static final String $ret_addr3 = "ret_addr3";
	/**
	 * Return-to address 4 返品先住所４.<p>
	 *
	 */
	public static final String $ret_addr4 = "ret_addr4";
	/**
	 * Return-to dept. 返品先部署.<p>
	 *
	 */
	public static final String $ret_cntct_dpt = "ret_cntct_dpt";
	/**
	 * Return-to PIC 返品先担当者.<p>
	 *
	 */
	public static final String $ret_cntct_psn = "ret_cntct_psn";
	/**
	 * Return-to PIC form of address 返品先担当者敬称.<p>
	 *
	 */
	public static final String $ret_cntct_psn_title = "ret_cntct_psn_title";
	/**
	 * Return-to TEL 返品先ＴＥＬ.<p>
	 *
	 */
	public static final String $ret_tel = "ret_tel";
	/**
	 * Return-to FAX 返品先ＦＡＸ.<p>
	 *
	 */
	public static final String $ret_fax = "ret_fax";
	/**
	 * Return PIC cd. 返品担当者ＣＤ.<p>
	 *
	 */
	public static final String $ret_usr_cd = "ret_usr_cd";
	/**
	 * Return PIC name 返品担当者名.<p>
	 *
	 */
	public static final String $ret_usr_nm = "ret_usr_nm";
	/**
	 * Return dept. cd. 返品部門ＣＤ.<p>
	 *
	 */
	public static final String $ret_dpt_cd = "ret_dpt_cd";
	/**
	 * Return dept. name 返品部門名.<p>
	 *
	 */
	public static final String $ret_dpt_nm = "ret_dpt_nm";
	/**
	 * Place of origin cd. 原産地ＣＤ.<p>
	 *
	 */
	public static final String $cntry_org_cd = "cntry_org_cd";
	/**
	 * Place of origin name 原産地名.<p>
	 *
	 */
	public static final String $cntry_org_nm = "cntry_org_nm";
	/**
	 * Transaction unit cd. 取引単位ＣＤ.<p>
	 *
	 */
	public static final String $trd_unit_cd = "trd_unit_cd";
	/**
	 * Transaction unit name 取引単位名.<p>
	 *
	 */
	public static final String $trd_unit_nm = "trd_unit_nm";
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
	 * Base unit name 基準単位名.<p>
	 *
	 */
	public static final String $base_unit_nm = "base_unit_nm";
	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public static final String $base_unit_qty = "base_unit_qty";
	/**
	 * Scheduled qty. 予定数量.<p>
	 *
	 */
	public static final String $schd_qty = "schd_qty";
	/**
	 * Receipt qty. 入荷数量.<p>
	 *
	 */
	public static final String $arr_qty = "arr_qty";
	/**
	 * Sales returned qty. 売上返品済数量.<p>
	 *
	 */
	public static final String $sls_ret_qty = "sls_ret_qty";
	/**
	 * Cancelled remaining qty. 打切数量.<p>
	 *
	 */
	public static final String $abort_qty = "abort_qty";
	/**
	 * Unit price (Transaction currency) 取引通貨単価.<p>
	 *
	 */
	public static final String $trd_cur_upri = "trd_cur_upri";
	/**
	 * Not to reacquire unit price 単価再取得対象外.<p>
	 *
	 */
	public static final String $upri_not_tgt_flg = "upri_not_tgt_flg";
	/**
	 * Temporary unit price 仮単価.<p>
	 *
	 */
	public static final String $interim_flg = "interim_flg";
	/**
	 * Amount (Transaction currency) 取引通貨金額.<p>
	 *
	 */
	public static final String $trd_cur_amt = "trd_cur_amt";
	/**
	 * Tax included amount (Transaction currency) 取引通貨税込金額.<p>
	 *
	 */
	public static final String $trd_cur_inc_tax_amt = "trd_cur_inc_tax_amt";
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
	 * Total cost 原価金額.<p>
	 *
	 */
	public static final String $cost_amt = "cost_amt";
	/**
	 * Gross profit rate 粗利率.<p>
	 *
	 */
	public static final String $prof_rate = "prof_rate";
	/**
	 * Set tax 税指定.<p>
	 *
	 */
	public static final String $tax_fix_flg = "tax_fix_flg";
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
	 * Tax amount (Transaction currency) 取引通貨税額.<p>
	 *
	 */
	public static final String $trd_cur_tax_amt = "trd_cur_tax_amt";
	/**
	 * Unit price (Base currency) 基準通貨単価.<p>
	 *
	 */
	public static final String $base_cur_upri = "base_cur_upri";
	/**
	 * Amount (Base currency) 基準通貨金額.<p>
	 *
	 */
	public static final String $base_cur_amt = "base_cur_amt";
	/**
	 * Tax included amount (Base currency) 基準通貨税込金額.<p>
	 *
	 */
	public static final String $base_cur_inc_tax_amt = "base_cur_inc_tax_amt";
	/**
	 * Tax amount (Base currency) 基準通貨税額.<p>
	 *
	 */
	public static final String $base_cur_tax_amt = "base_cur_tax_amt";
	/**
	 * Discount amount (Base currency) 基準通貨値引額.<p>
	 *
	 */
	public static final String $base_cur_dscnt_amt = "base_cur_dscnt_amt";
	/**
	 * Unit price (Tax currency) 納税通貨単価.<p>
	 *
	 */
	public static final String $ptax_cur_upri = "ptax_cur_upri";
	/**
	 * Amount (Tax currency) 納税通貨金額.<p>
	 *
	 */
	public static final String $ptax_cur_amt = "ptax_cur_amt";
	/**
	 * Tax included amount (Tax currency) 納税通貨税込金額.<p>
	 *
	 */
	public static final String $ptax_cur_inc_tax_amt = "ptax_cur_inc_tax_amt";
	/**
	 * Tax amount (Tax currency) 納税通貨税額.<p>
	 *
	 */
	public static final String $ptax_cur_tax_amt = "ptax_cur_tax_amt";
	/**
	 * Discount amount (Tax currency) 納税通貨値引額.<p>
	 *
	 */
	public static final String $ptax_cur_dscnt_amt = "ptax_cur_dscnt_amt";
	/**
	 * Billing carry-over count 請求繰越回数.<p>
	 *
	 */
	public static final String $bill_crryovr_times = "bill_crryovr_times";
	/**
	 * Grading cd. 格付ＣＤ.<p>
	 *
	 */
	public static final String $gd_cd = "gd_cd";
	/**
	 * Grading name 格付名.<p>
	 *
	 */
	public static final String $gd_nm = "gd_nm";
	/**
	 * Location cd. 場所ＣＤ.<p>
	 *
	 */
	public static final String $loc_cd = "loc_cd";
	/**
	 * Location name 場所名.<p>
	 *
	 */
	public static final String $loc_nm = "loc_nm";
	/**
	 * Rack/Line cd. 棚・ラインＣＤ.<p>
	 *
	 */
	public static final String $str_ln_cd = "str_ln_cd";
	/**
	 * Rack/Line name 棚・ライン名.<p>
	 *
	 */
	public static final String $str_ln_nm = "str_ln_nm";
	/**
	 * Without rack/line 棚・ライン無.<p>
	 *
	 */
	public static final String $str_ln_cd_none_flg = "str_ln_cd_none_flg";
	/**
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public static final String $lot_no = "lot_no";
	/**
	 * Sublot No. サブロットＮＯ.<p>
	 *
	 */
	public static final String $sublot_no = "sublot_no";
	/**
	 * For version control 版管理対象.<p>
	 *
	 */
	public static final String $ver_flg = "ver_flg";
	/**
	 * Version No. 版ＮＯ.<p>
	 *
	 */
	public static final String $ver_no = "ver_no";
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
	 * Sales project No. 案件ＮＯ.<p>
	 *
	 */
	public static final String $wrk_no = "wrk_no";
	/**
	 * Sales project name 案件名.<p>
	 *
	 */
	public static final String $wrk_nm = "wrk_nm";
	/**
	 * Consignment 貸出.<p>
	 *
	 */
	public static final String $vmi_flg = "vmi_flg";
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
	 * Return reason cd. 返品理由ＣＤ.<p>
	 *
	 */
	public static final String $ret_rsn_cd = "ret_rsn_cd";
	/**
	 * Return reason name 返品理由名.<p>
	 *
	 */
	public static final String $ret_rsn_nm = "ret_rsn_nm";
	/**
	 * Charged dept. cd. 負担部門ＣＤ.<p>
	 *
	 */
	public static final String $bd_dpt_cd = "bd_dpt_cd";
	/**
	 * Charged dept. name 負担部門名.<p>
	 *
	 */
	public static final String $bd_dpt_nm = "bd_dpt_nm";
	/**
	 * Purchase return reason cd. 仕入返品理由ＣＤ.<p>
	 *
	 */
	public static final String $purc_ret_rsn_cd = "purc_ret_rsn_cd";
	/**
	 * Purchase return reason name 仕入返品理由名.<p>
	 *
	 */
	public static final String $purc_ret_rsn_nm = "purc_ret_rsn_nm";
	/**
	 * AP dept. cd. 債務部門ＣＤ.<p>
	 *
	 */
	public static final String $ap_dpt_cd = "ap_dpt_cd";
	/**
	 * AP dept. name 債務部門名.<p>
	 *
	 */
	public static final String $ap_dpt_nm = "ap_dpt_nm";
	/**
	 * Scheduled payment date 支払予定日.<p>
	 *
	 */
	public static final String $pay_schd_dt = "pay_schd_dt";
	/**
	 * Supplier invoice transaction 発注先インボイス取引.<p>
	 *
	 */
	public static final String $sppl_iv_flg = "sppl_iv_flg";
	/**
	 * Payment per transaction 都度支払.<p>
	 *
	 */
	public static final String $pay_spot_flg = "pay_spot_flg";
	/**
	 * Asset management type 資産管理区分.<p>
	 *
	 */
	public static final String $asset_mng_typ = "asset_mng_typ";
	/**
	 * Withholding tax rate 源泉税率.<p>
	 *
	 */
	public static final String $wtax_rate = "wtax_rate";
	/**
	 * Withholding tax 源泉税額.<p>
	 *
	 */
	public static final String $wtax_amt = "wtax_amt";
	/**
	 * Receipt contact remarks 入荷連絡備考.<p>
	 *
	 */
	public static final String $arr_cnt_rmrks = "arr_cnt_rmrks";
	/**
	 * Transaction details remarks 取引明細備考.<p>
	 *
	 */
	public static final String $trd_d_rmrks = "trd_d_rmrks";
	/**
	 * Internal details remarks 内部明細備考.<p>
	 *
	 */
	public static final String $intr_rmrks = "intr_rmrks";
	/**
	 * Details spare 1 明細予備１.<p>
	 *
	 */
	public static final String $sub_char1 = "sub_char1";
	/**
	 * Details spare 2 明細予備２.<p>
	 *
	 */
	public static final String $sub_char2 = "sub_char2";
	/**
	 * Details spare 3 明細予備３.<p>
	 *
	 */
	public static final String $sub_char3 = "sub_char3";
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
	 * Sales order No. 受注ＮＯ.<p>
	 *
	 */
	public static final String $slo_no = "slo_no";
	/**
	 * Sales order details No. 受注明細ＮＯ.<p>
	 *
	 */
	public static final String $slo_d_no = "slo_d_no";
	/**
	 * Reference sales result No. 参照売上実績ＮＯ.<p>
	 *
	 */
	public static final String $ref_sls_act_no = "ref_sls_act_no";
	/**
	 * Reference sales result details No. 参照売上実績明細ＮＯ.<p>
	 *
	 */
	public static final String $ref_sls_act_d_no = "ref_sls_act_d_no";
	/**
	 * Sales return schedule details No. 売上返品予定明細ＮＯ.<p>
	 *
	 */
	public static final String $sls_ret_schd_d_no = "sls_ret_schd_d_no";
	/**
	 * Receipt result No. 入荷実績ＮＯ.<p>
	 *
	 */
	public static final String $arr_act_no = "arr_act_no";
	/**
	 * Display order 表示順.<p>
	 *
	 */
	public static final String $disp_seq = "disp_seq";
	/**
	 * Lot management type ロット管理区分.<p>
	 *
	 */
	public static final String $lot_mng_typ = "lot_mng_typ";
	/**
	 * Lot No. type ロットＮＯ区分.<p>
	 *
	 */
	public static final String $lot_no_typ = "lot_no_typ";
	/**
	 * Sublot management type サブロット管理区分.<p>
	 *
	 */
	public static final String $sublot_mng_typ = "sublot_mng_typ";
	/**
	 * Sublot No. type サブロットＮＯ区分.<p>
	 *
	 */
	public static final String $sublot_no_typ = "sublot_no_typ";
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
	 * Transaction unit number of decimal places 取引単位小数部有効桁数.<p>
	 *
	 */
	public static final String $trd_unit_dec_place = "trd_unit_dec_place";
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
	 * Transaction unit rounding type 取引単位端数処理区分.<p>
	 *
	 */
	public static final String $trd_unit_rnd_typ = "trd_unit_rnd_typ";
	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public static final String $base_unit_dec_place = "base_unit_dec_place";
	/**
	 * Base unit rounding type 基準単位端数処理区分.<p>
	 *
	 */
	public static final String $base_unit_rnd_typ = "base_unit_rnd_typ";
	/**
	 * For rack/line 棚・ライン対象.<p>
	 *
	 */
	public static final String $str_ln_tgt_flg = "str_ln_tgt_flg";
	/**
	 * Factory/Distribution warehouse cd. 工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public static final String $site_cd = "site_cd";
	/**
	 * Tax inclusive 内税.<p>
	 *
	 */
	public static final String $inc_tax_flg = "inc_tax_flg";
	/**
	 * Reference sales result sequence number 参照売上実績連番.<p>
	 *
	 */
	public static final String $ref_sls_act_seq = "ref_sls_act_seq";
	/**
	 * Reference sales result details sequence number 参照売上実績明細連番.<p>
	 *
	 */
	public static final String $ref_sls_act_d_seq = "ref_sls_act_d_seq";
	/**
	 * Sales recording date (Base) 売上計上日（基）.<p>
	 *
	 */
	public static final String $base_sls_ac_dt = "base_sls_ac_dt";
	/**
	 * Sales return schedule No. 売上返品予定ＮＯ.<p>
	 *
	 */
	public static final String $sls_ret_schd_no = "sls_ret_schd_no";
	/**
	 * Receipt progress No. 入荷進捗ＮＯ.<p>
	 *
	 */
	public static final String $arr_pr_no = "arr_pr_no";
	/**
	 * GR/GI progress management No. 受払進捗管理ＮＯ.<p>
	 *
	 */
	public static final String $io_schd_pr_no = "io_schd_pr_no";
	/**
	 * Miscellaneous delivery destination 納品先諸口.<p>
	 *
	 */
	public static final String $dlv_sundry_flg = "dlv_sundry_flg";
	/**
	 * Sales other accounting 販売他勘定.<p>
	 *
	 */
	public static final String $sls_acxfr_flg = "sls_acxfr_flg";
	/**
	 * Configuration/specification management type 構成・仕様管理区分.<p>
	 *
	 */
	public static final String $comp_spec_typ = "comp_spec_typ";
	/**
	 * Discount item 値引品目.<p>
	 *
	 */
	public static final String $dscnt_itm_flg = "dscnt_itm_flg";
	/**
	 * Cancel remaining (At search) 打切（検索時）.<p>
	 *
	 */
	public static final String $init_abort_flg = "init_abort_flg";
	/**
	 * Transaction unit cd. (Schedule) 取引単位ＣＤ（予定）.<p>
	 *
	 */
	public static final String $schd_trd_unit_cd = "schd_trd_unit_cd";
	/**
	 * Transaction unit qty. (Schedule) 取引単位数量（予定）.<p>
	 *
	 */
	public static final String $schd_trd_unit_qty = "schd_trd_unit_qty";
	/**
	 * Transaction unit number of decimal places (Schedule) 取引単位小数部有効桁数(予定).<p>
	 *
	 */
	public static final String $schd_trd_unit_dec_place = "schd_trd_unit_dec_place";
	/**
	 * Transaction unit conversion base qty. (Schedule) 取引単位分母数量(予定).<p>
	 *
	 */
	public static final String $schd_trd_unit_conv_base_qty = "schd_trd_unit_conv_base_qty";
	/**
	 * Transaction unit conversion qty. (Schedule) 取引単位換算数量(予定).<p>
	 *
	 */
	public static final String $schd_trd_unit_conv_qty = "schd_trd_unit_conv_qty";
	/**
	 * Transaction unit rounding type (Schedule) 取引単位端数処理区分(予定).<p>
	 *
	 */
	public static final String $schd_trd_unit_rnd_typ = "schd_trd_unit_rnd_typ";
	/**
	 * Details row ID 明細行ＩＤ.<p>
	 *
	 */
	public static final String $dtl_row_id = "dtl_row_id";
	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public static final String $peg_no = "peg_no";
	/**
	 * Allow item sales unit price change 品目販売単価変更許可.<p>
	 *
	 */
	public static final String $itm_sls_upri_cng_flg = "itm_sls_upri_cng_flg";
	/**
	 * Item billing carry-over count 品目請求繰越回数.<p>
	 *
	 */
	public static final String $itm_bill_crryovr_times = "itm_bill_crryovr_times";
	/**
	 * Report output locale cd. 帳票出力ロケールＣＤ.<p>
	 *
	 */
	public static final String $prnt_lcl_cd = "prnt_lcl_cd";
	/**
	 * Initial scheduled qty. (Base unit) 当初予定数量（基準単位）.<p>
	 *
	 */
	public static final String $init_schd_qty = "init_schd_qty";
	/**
	 * Initial scheduled discount amount 当初予定値引額.<p>
	 *
	 */
	public static final String $init_schd_dscnt_amt = "init_schd_dscnt_amt";
	/**
	 * Purchase return result No. 仕入返品実績ＮＯ.<p>
	 *
	 */
	public static final String $purc_ret_act_no = "purc_ret_act_no";
	/**
	 * Purchase return result rev. number 仕入返品実績改訂番号.<p>
	 *
	 */
	public static final String $purc_ret_act_rev = "purc_ret_act_rev";
	/**
	 * Purchase return result details No. 仕入返品実績明細ＮＯ.<p>
	 *
	 */
	public static final String $purc_ret_act_d_no = "purc_ret_act_d_no";
	/**
	 * Purchase recording date (Base) 仕入計上日（基）.<p>
	 *
	 */
	public static final String $base_purc_ac_dt = "base_purc_ac_dt";
	/**
	 * Initial amount (Transaction currency) 当初取引通貨金額.<p>
	 *
	 */
	public static final String $init_schd_amt = "init_schd_amt";
	/**
	 * Scheduled No. 予定ＮＯ.<p>
	 *
	 */
	public static final String $schd_no = "schd_no";
	/**
	 * Tax rate (Schedule) 税率（予定）.<p>
	 *
	 */
	public static final String $schd_tax_rate = "schd_tax_rate";
	/**
	 * Tax inclusive (Schedule) 内税（予定）.<p>
	 *
	 */
	public static final String $schd_inc_tax_flg = "schd_inc_tax_flg";
	/**
	 * Sales keeping customer inventory 預り売上.<p>
	 *
	 */
	public static final String $sls_cststk_flg = "sls_cststk_flg";
	/**
	 * Tax cd. (Latest) 税ＣＤ（最新）.<p>
	 *
	 */
	public static final String $new_tax_cd = "new_tax_cd";
	/**
	 * Tax name (Latest) 税名（最新）.<p>
	 *
	 */
	public static final String $new_tax_nm = "new_tax_nm";
	/**
	 * Tax rate (Latest) 税率（最新）.<p>
	 *
	 */
	public static final String $new_tax_rate = "new_tax_rate";
	/**
	 * Tax type (Latest) 税区分（最新）.<p>
	 *
	 */
	public static final String $new_tax_typ = "new_tax_typ";
	/**
	 * Tax inclusive (Latest) 内税（最新）.<p>
	 *
	 */
	public static final String $new_inc_tax_flg = "new_inc_tax_flg";
	/**
	 * Details correction 明細訂正.<p>
	 *
	 */
	public static final String $sls_dtl_upd_flg = "sls_dtl_upd_flg";
	/**
	 * Initial tax amount (Transaction currency) 当初取引通貨税額.<p>
	 *
	 */
	public static final String $init_trd_cur_tax_amt = "init_trd_cur_tax_amt";
	/**
	 * Initial transaction unit cd. 当初取引単位ＣＤ.<p>
	 *
	 */
	public static final String $init_trd_unit_cd = "init_trd_unit_cd";
	/**
	 * Initial transaction unit qty. 当初取引単位数量.<p>
	 *
	 */
	public static final String $init_trd_unit_qty = "init_trd_unit_qty";
	/**
	 * Initial unit price (Transaction currency) 当初取引通貨単価.<p>
	 *
	 */
	public static final String $init_trd_cur_upri = "init_trd_cur_upri";
	/**
	 * Initial tax inclusive 当初内税.<p>
	 *
	 */
	public static final String $init_inc_tax_flg = "init_inc_tax_flg";
	/**
	 * Initial tax rate 当初税率.<p>
	 *
	 */
	public static final String $init_tax_rate = "init_tax_rate";
	/**
	 * Initial discount amount (Transaction currency) 当初取引通貨値引額.<p>
	 *
	 */
	public static final String $init_trd_cur_dscnt_amt = "init_trd_cur_dscnt_amt";


	public static final MCMeta itm_cd_META = createCommonMeta($itm_cd, mcframe.commonMA.meta.MA_META.ITM_CD);
	public static final MCMeta itm_sub1_META = createCommonMeta($itm_sub1, mcframe.commonMA.meta.MA_META.ITM_SUB1);
	public static final MCMeta itm_sub2_META = createCommonMeta($itm_sub2, mcframe.commonMA.meta.MA_META.ITM_SUB2);
	public static final MCMeta itm_sub3_META = createCommonMeta($itm_sub3, mcframe.commonMA.meta.MA_META.ITM_SUB3);
	public static final MCMeta itm_nm_META = createCommonMeta($itm_nm, mcframe.commonMA.meta.MA_META.ITM_NM);
	public static final MCMeta stk_mng_typ_META = createCommonMeta($stk_mng_typ, mcframe.commonMA.meta.MA_META.STK_MNG_TYP);
	public static final MCMeta iv_itm_nm_META = createCommonMeta($iv_itm_nm, mcframe.commonMA.meta.MA_META.ITM_NM);
	public static final MCMeta sundry_itm_flg_META = createCommonMeta($sundry_itm_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta dlv_cd_META = createCommonMeta($dlv_cd, mcframe.commonMA.meta.MA_META.BP_CD);
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
	public static final MCMeta pri_prnt_flg_META = createCommonMeta($pri_prnt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta cntry_cd_META = createCommonMeta($cntry_cd, mcframe.commonMA.meta.MA_META.CNTRY_CD);
	public static final MCMeta cntry_nm_META = createCommonMeta($cntry_nm, mcframe.commonMA.meta.MA_META.CNTRY_NM);
	public static final MCMeta dest_cd1_META = createCommonMeta($dest_cd1, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta dest_nm1_META = createCommonMeta($dest_nm1, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta dest_cd2_META = createCommonMeta($dest_cd2, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta dest_nm2_META = createCommonMeta($dest_nm2, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta dest_cd3_META = createCommonMeta($dest_cd3, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta dest_nm3_META = createCommonMeta($dest_nm3, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta purc_act_no_META = createCommonMeta($purc_act_no, mcframe.commonMA.meta.MA_META.PURC_ACT_NO);
	public static final MCMeta purc_act_rev_META = createCommonMeta($purc_act_rev, mcframe.commonMA.meta.MA_META.SLIP_REV);
	public static final MCMeta purc_act_d_no_META = createCommonMeta($purc_act_d_no, mcframe.commonMA.meta.MA_META.PURC_ACT_D_NO);
	public static final MCMeta purc_ddlv_po_no_META = createCommonMeta($purc_ddlv_po_no, mcframe.commonMA.meta.MA_META.PO_NO);
	public static final MCMeta sppl_cd_META = createCommonMeta($sppl_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta sppl_nm_META = createCommonMeta($sppl_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta sppl_cntry_cd_META = createCommonMeta($sppl_cntry_cd, mcframe.commonMA.meta.MA_META.CNTRY_CD);
	public static final MCMeta sppl_cntry_nm_META = createCommonMeta($sppl_cntry_nm, mcframe.commonMA.meta.MA_META.CNTRY_NM);
	public static final MCMeta ret_nm_META = createCommonMeta($ret_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta ret_zip_cd_META = createCommonMeta($ret_zip_cd, mcframe.commonMA.meta.MA_META.ZIP_CD);
	public static final MCMeta ret_addr1_META = createCommonMeta($ret_addr1, mcframe.commonMA.meta.MA_META.ADDR);
	public static final MCMeta ret_addr2_META = createCommonMeta($ret_addr2, mcframe.commonMA.meta.MA_META.ADDR);
	public static final MCMeta ret_addr3_META = createCommonMeta($ret_addr3, mcframe.commonMA.meta.MA_META.ADDR);
	public static final MCMeta ret_addr4_META = createCommonMeta($ret_addr4, mcframe.commonMA.meta.MA_META.ADDR);
	public static final MCMeta ret_cntct_dpt_META = createCommonMeta($ret_cntct_dpt, mcframe.commonMA.meta.MA_META.BP_CNTCT_DPT);
	public static final MCMeta ret_cntct_psn_META = createCommonMeta($ret_cntct_psn, mcframe.commonMA.meta.MA_META.BP_CNTCT_PSN);
	public static final MCMeta ret_cntct_psn_title_META = createCommonMeta($ret_cntct_psn_title, mcframe.commonMA.meta.MA_META.BP_PSN_TITLE);
	public static final MCMeta ret_tel_META = createCommonMeta($ret_tel, mcframe.commonMA.meta.MA_META.TEL);
	public static final MCMeta ret_fax_META = createCommonMeta($ret_fax, mcframe.commonMA.meta.MA_META.TEL);
	public static final MCMeta ret_usr_cd_META = createCommonMeta($ret_usr_cd, mcframe.commonMA.meta.MA_META.USR_CD);
	public static final MCMeta ret_usr_nm_META = createCommonMeta($ret_usr_nm, mcframe.commonMA.meta.MA_META.USR_NM);
	public static final MCMeta ret_dpt_cd_META = createCommonMeta($ret_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta ret_dpt_nm_META = createCommonMeta($ret_dpt_nm, mcframe.commonMA.meta.MA_META.DPT_NM);
	public static final MCMeta cntry_org_cd_META = createCommonMeta($cntry_org_cd, mcframe.commonMA.meta.MA_META.CNTRY_CD);
	public static final MCMeta cntry_org_nm_META = createCommonMeta($cntry_org_nm, mcframe.commonMA.meta.MA_META.CNTRY_NM);
	public static final MCMeta trd_unit_cd_META = createCommonMeta($trd_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta trd_unit_nm_META = createCommonMeta($trd_unit_nm, mcframe.commonMA.meta.MA_META.UNIT_NM);
	public static final MCMeta trd_unit_qty_META = createCommonMeta($trd_unit_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta base_unit_cd_META = createCommonMeta($base_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta base_unit_nm_META = createCommonMeta($base_unit_nm, mcframe.commonMA.meta.MA_META.UNIT_NM);
	public static final MCMeta base_unit_qty_META = createCommonMeta($base_unit_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta schd_qty_META = createCommonMeta($schd_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta arr_qty_META = createCommonMeta($arr_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta sls_ret_qty_META = createCommonMeta($sls_ret_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta abort_qty_META = createCommonMeta($abort_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta trd_cur_upri_META = createCommonMeta($trd_cur_upri, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta upri_not_tgt_flg_META = createCommonMeta($upri_not_tgt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta interim_flg_META = createCommonMeta($interim_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta trd_cur_amt_META = createCommonMeta($trd_cur_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta trd_cur_inc_tax_amt_META = createCommonMeta($trd_cur_inc_tax_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta trd_cur_dscnt_amt_META = createCommonMeta($trd_cur_dscnt_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta dscnt_rsn_cd_META = createCommonMeta($dscnt_rsn_cd, mcframe.commonMA.meta.MA_META.BIZ_RSN_CD);
	public static final MCMeta dscnt_rsn_nm_META = createCommonMeta($dscnt_rsn_nm, mcframe.commonMA.meta.MA_META.BIZ_RSN_NM);
	public static final MCMeta cost_upri_META = createCommonMeta($cost_upri, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta cost_amt_META = createCommonMeta($cost_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta prof_rate_META = createCommonMeta($prof_rate, mcframe.commonMA.meta.MA_META.PER);
	public static final MCMeta tax_fix_flg_META = createCommonMeta($tax_fix_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta tax_cd_META = createCommonMeta($tax_cd, mcframe.commonMA.meta.MA_META.TAX_CD);
	public static final MCMeta tax_nm_META = createCommonMeta($tax_nm, mcframe.commonMA.meta.MA_META.TAX_NM);
	public static final MCMeta tax_rate_META = createCommonMeta($tax_rate, mcframe.commonMA.meta.MA_META.TAX_RATE);
	public static final MCMeta tax_typ_META = createCommonMeta($tax_typ, mcframe.commonMA.meta.MA_META.TAX_TYP);
	public static final MCMeta trd_cur_tax_amt_META = createCommonMeta($trd_cur_tax_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta base_cur_upri_META = createCommonMeta($base_cur_upri, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta base_cur_amt_META = createCommonMeta($base_cur_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta base_cur_inc_tax_amt_META = createCommonMeta($base_cur_inc_tax_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta base_cur_tax_amt_META = createCommonMeta($base_cur_tax_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta base_cur_dscnt_amt_META = createCommonMeta($base_cur_dscnt_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta ptax_cur_upri_META = createCommonMeta($ptax_cur_upri, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta ptax_cur_amt_META = createCommonMeta($ptax_cur_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta ptax_cur_inc_tax_amt_META = createCommonMeta($ptax_cur_inc_tax_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta ptax_cur_tax_amt_META = createCommonMeta($ptax_cur_tax_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta ptax_cur_dscnt_amt_META = createCommonMeta($ptax_cur_dscnt_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta bill_crryovr_times_META = createCommonMeta($bill_crryovr_times, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta gd_cd_META = createCommonMeta($gd_cd, mcframe.commonMA.meta.MA_META.STK_GD_CD);
	public static final MCMeta gd_nm_META = createCommonMeta($gd_nm, mcframe.commonMA.meta.MA_META.STK_GD_NM);
	public static final MCMeta loc_cd_META = createCommonMeta($loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta loc_nm_META = createCommonMeta($loc_nm, mcframe.commonMA.meta.MA_META.LOC_NM);
	public static final MCMeta str_ln_cd_META = createCommonMeta($str_ln_cd, mcframe.commonMA.meta.MA_META.STR_LN_CD);
	public static final MCMeta str_ln_nm_META = createCommonMeta($str_ln_nm, mcframe.commonMA.meta.MA_META.STR_LN_NM);
	public static final MCMeta str_ln_cd_none_flg_META = createCommonMeta($str_ln_cd_none_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta lot_no_META = createCommonMeta($lot_no, mcframe.commonMA.meta.MA_META.LOT_NO);
	public static final MCMeta sublot_no_META = createCommonMeta($sublot_no, mcframe.commonMA.meta.MA_META.SUBLOT_NO);
	public static final MCMeta ver_flg_META = createCommonMeta($ver_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta ver_no_META = createCommonMeta($ver_no, mcframe.commonMA.meta.MA_META.VER_NO);
	public static final MCMeta sno1_META = createCommonMeta($sno1, mcframe.commonMA.meta.MA_META.SNO1);
	public static final MCMeta sno2_META = createCommonMeta($sno2, mcframe.commonMA.meta.MA_META.SNO2);
	public static final MCMeta sno3_META = createCommonMeta($sno3, mcframe.commonMA.meta.MA_META.SNO3);
	public static final MCMeta sno4_META = createCommonMeta($sno4, mcframe.commonMA.meta.MA_META.SNO4);
	public static final MCMeta wrk_no_META = createCommonMeta($wrk_no, mcframe.commonMA.meta.MA_META.WRK_NO);
	public static final MCMeta wrk_nm_META = createCommonMeta($wrk_nm, mcframe.commonMA.meta.MA_META.WRK_NM);
	public static final MCMeta vmi_flg_META = createCommonMeta($vmi_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta cst_po_d_no_META = createCommonMeta($cst_po_d_no, mcframe.commonMA.meta.MA_META.CST_PO_D_NO);
	public static final MCMeta cst_itm_cd_META = createCommonMeta($cst_itm_cd, mcframe.commonMA.meta.MA_META.BP_ITM_CD);
	public static final MCMeta cst_itm_nm_META = createCommonMeta($cst_itm_nm, mcframe.commonMA.meta.MA_META.BP_ITM_NM);
	public static final MCMeta ret_rsn_cd_META = createCommonMeta($ret_rsn_cd, mcframe.commonMA.meta.MA_META.BIZ_RSN_CD);
	public static final MCMeta ret_rsn_nm_META = createCommonMeta($ret_rsn_nm, mcframe.commonMA.meta.MA_META.BIZ_RSN_NM);
	public static final MCMeta bd_dpt_cd_META = createCommonMeta($bd_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta bd_dpt_nm_META = createCommonMeta($bd_dpt_nm, mcframe.commonMA.meta.MA_META.DPT_NM);
	public static final MCMeta purc_ret_rsn_cd_META = createCommonMeta($purc_ret_rsn_cd, mcframe.commonMA.meta.MA_META.BIZ_RSN_CD);
	public static final MCMeta purc_ret_rsn_nm_META = createCommonMeta($purc_ret_rsn_nm, mcframe.commonMA.meta.MA_META.BIZ_RSN_NM);
	public static final MCMeta ap_dpt_cd_META = createCommonMeta($ap_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta ap_dpt_nm_META = createCommonMeta($ap_dpt_nm, mcframe.commonMA.meta.MA_META.DPT_NM);
	public static final MCMeta pay_schd_dt_META = createCommonMeta($pay_schd_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta sppl_iv_flg_META = createCommonMeta($sppl_iv_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta pay_spot_flg_META = createCommonMeta($pay_spot_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta asset_mng_typ_META = createCommonMeta($asset_mng_typ, mcframe.commonMA.meta.MA_META.ASSET_MNG_TYP);
	public static final MCMeta wtax_rate_META = createCommonMeta($wtax_rate, mcframe.commonMA.meta.MA_META.WTAX_RATE);
	public static final MCMeta wtax_amt_META = createCommonMeta($wtax_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta arr_cnt_rmrks_META = createCommonMeta($arr_cnt_rmrks, mcframe.commonMS.meta.MS_META.ARR_CNT_RMRKS);
	public static final MCMeta trd_d_rmrks_META = createCommonMeta($trd_d_rmrks, mcframe.commonMA.meta.MA_META.TRD_D_RMRKS);
	public static final MCMeta intr_rmrks_META = createCommonMeta($intr_rmrks, mcframe.commonMS.meta.MS_META.SLS_ACT_D_INTR_RMRKS);
	public static final MCMeta sub_char1_META = createCommonMeta($sub_char1, mcframe.commonMS.meta.MS_META.SLS_ACT_D_SUB_CHAR1);
	public static final MCMeta sub_char2_META = createCommonMeta($sub_char2, mcframe.commonMS.meta.MS_META.SLS_ACT_D_SUB_CHAR2);
	public static final MCMeta sub_char3_META = createCommonMeta($sub_char3, mcframe.commonMS.meta.MS_META.SLS_ACT_D_SUB_CHAR3);
	public static final MCMeta sls_act_d_no_META = createCommonMeta($sls_act_d_no, mcframe.commonMA.meta.MA_META.SLS_ACT_D_NO);
	public static final MCMeta sls_act_d_seq_META = createCommonMeta($sls_act_d_seq, mcframe.commonMA.meta.MA_META.SLIP_SEQ);
	public static final MCMeta slo_no_META = createCommonMeta($slo_no, mcframe.commonMA.meta.MA_META.SLO_NO);
	public static final MCMeta slo_d_no_META = createCommonMeta($slo_d_no, mcframe.commonMA.meta.MA_META.SLO_D_NO);
	public static final MCMeta ref_sls_act_no_META = createCommonMeta($ref_sls_act_no, mcframe.commonMA.meta.MA_META.SLS_ACT_NO);
	public static final MCMeta ref_sls_act_d_no_META = createCommonMeta($ref_sls_act_d_no, mcframe.commonMA.meta.MA_META.SLS_ACT_D_NO);
	public static final MCMeta sls_ret_schd_d_no_META = createCommonMeta($sls_ret_schd_d_no, mcframe.commonMA.meta.MA_META.SLS_RET_SCHD_D_NO);
	public static final MCMeta arr_act_no_META = createCommonMeta($arr_act_no, mcframe.commonMA.meta.MA_META.ARR_ACT_NO);
	public static final MCMeta disp_seq_META = createCommonMeta($disp_seq, mcframe.commonMA.meta.MA_META.DISP_SEQ);
	public static final MCMeta lot_mng_typ_META = createCommonMeta($lot_mng_typ, mcframe.commonMA.meta.MA_META.LOT_MNG_TYP);
	public static final MCMeta lot_no_typ_META = createCommonMeta($lot_no_typ, mcframe.commonMA.meta.MA_META.LOT_NO_TYP);
	public static final MCMeta sublot_mng_typ_META = createCommonMeta($sublot_mng_typ, mcframe.commonMA.meta.MA_META.SUBLOT_MNG_TYP);
	public static final MCMeta sublot_no_typ_META = createCommonMeta($sublot_no_typ, mcframe.commonMA.meta.MA_META.LOT_NO_TYP);
	public static final MCMeta sno1_mng_typ_META = createCommonMeta($sno1_mng_typ, mcframe.commonMA.meta.MA_META.SNO_MNG_TYP);
	public static final MCMeta sno2_mng_typ_META = createCommonMeta($sno2_mng_typ, mcframe.commonMA.meta.MA_META.SNO_MNG_TYP);
	public static final MCMeta sno3_mng_typ_META = createCommonMeta($sno3_mng_typ, mcframe.commonMA.meta.MA_META.SNO_MNG_TYP);
	public static final MCMeta sno4_mng_typ_META = createCommonMeta($sno4_mng_typ, mcframe.commonMA.meta.MA_META.SNO_MNG_TYP);
	public static final MCMeta trd_unit_dec_place_META = createCommonMeta($trd_unit_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta trd_unit_conv_base_qty_META = createCommonMeta($trd_unit_conv_base_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta trd_unit_conv_qty_META = createCommonMeta($trd_unit_conv_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta trd_unit_rnd_typ_META = createCommonMeta($trd_unit_rnd_typ, mcframe.commonMA.meta.MA_META.RND_TYP);
	public static final MCMeta base_unit_dec_place_META = createCommonMeta($base_unit_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta base_unit_rnd_typ_META = createCommonMeta($base_unit_rnd_typ, mcframe.commonMA.meta.MA_META.RND_TYP);
	public static final MCMeta str_ln_tgt_flg_META = createCommonMeta($str_ln_tgt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta site_cd_META = createCommonMeta($site_cd, mcframe.commonMA.meta.MA_META.SITE_CD);
	public static final MCMeta inc_tax_flg_META = createCommonMeta($inc_tax_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta ref_sls_act_seq_META = createCommonMeta($ref_sls_act_seq, mcframe.commonMA.meta.MA_META.SLIP_SEQ);
	public static final MCMeta ref_sls_act_d_seq_META = createCommonMeta($ref_sls_act_d_seq, mcframe.commonMA.meta.MA_META.SLIP_SEQ);
	public static final MCMeta base_sls_ac_dt_META = createCommonMeta($base_sls_ac_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta sls_ret_schd_no_META = createCommonMeta($sls_ret_schd_no, mcframe.commonMA.meta.MA_META.SLS_RET_SCHD_NO);
	public static final MCMeta arr_pr_no_META = createCommonMeta($arr_pr_no, mcframe.commonMA.meta.MA_META.ARR_PR_NO);
	public static final MCMeta io_schd_pr_no_META = createCommonMeta($io_schd_pr_no, mcframe.commonMA.meta.MA_META.IO_SCHD_PR_NO);
	public static final MCMeta dlv_sundry_flg_META = createCommonMeta($dlv_sundry_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sls_acxfr_flg_META = createCommonMeta($sls_acxfr_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta comp_spec_typ_META = createCommonMeta($comp_spec_typ, mcframe.commonMA.meta.MA_META.COMP_SPEC_TYP);
	public static final MCMeta dscnt_itm_flg_META = createCommonMeta($dscnt_itm_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta init_abort_flg_META = createCommonMeta($init_abort_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta schd_trd_unit_cd_META = createCommonMeta($schd_trd_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta schd_trd_unit_qty_META = createCommonMeta($schd_trd_unit_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta schd_trd_unit_dec_place_META = createCommonMeta($schd_trd_unit_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta schd_trd_unit_conv_base_qty_META = createCommonMeta($schd_trd_unit_conv_base_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta schd_trd_unit_conv_qty_META = createCommonMeta($schd_trd_unit_conv_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta schd_trd_unit_rnd_typ_META = createCommonMeta($schd_trd_unit_rnd_typ, mcframe.commonMA.meta.MA_META.RND_TYP);
	public static final MCMeta dtl_row_id_META = createCommonMeta($dtl_row_id, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta peg_no_META = createCommonMeta($peg_no, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta itm_sls_upri_cng_flg_META = createCommonMeta($itm_sls_upri_cng_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta itm_bill_crryovr_times_META = createCommonMeta($itm_bill_crryovr_times, mcframe.commonMA.meta.MA_META.CRRYOVR_TIMES);
	public static final MCMeta prnt_lcl_cd_META = createCommonMeta($prnt_lcl_cd, mcframe.commonMA.meta.MA_META.LCL_CD);
	public static final MCMeta init_schd_qty_META = createCommonMeta($init_schd_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta init_schd_dscnt_amt_META = createCommonMeta($init_schd_dscnt_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta purc_ret_act_no_META = createCommonMeta($purc_ret_act_no, mcframe.commonMA.meta.MA_META.PURC_RET_ACT_NO);
	public static final MCMeta purc_ret_act_rev_META = createCommonMeta($purc_ret_act_rev, mcframe.commonMA.meta.MA_META.SLIP_REV);
	public static final MCMeta purc_ret_act_d_no_META = createCommonMeta($purc_ret_act_d_no, mcframe.commonMA.meta.MA_META.PURC_RET_ACT_D_NO);
	public static final MCMeta base_purc_ac_dt_META = createCommonMeta($base_purc_ac_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta init_schd_amt_META = createCommonMeta($init_schd_amt, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta schd_no_META = createStringMeta($schd_no);
	public static final MCMeta schd_tax_rate_META = createCommonMeta($schd_tax_rate, mcframe.commonMA.meta.MA_META.TAX_RATE);
	public static final MCMeta schd_inc_tax_flg_META = createCommonMeta($schd_inc_tax_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sls_cststk_flg_META = createCommonMeta($sls_cststk_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta new_tax_cd_META = createCommonMeta($new_tax_cd, mcframe.commonMA.meta.MA_META.TAX_CD);
	public static final MCMeta new_tax_nm_META = createCommonMeta($new_tax_nm, mcframe.commonMA.meta.MA_META.TAX_NM);
	public static final MCMeta new_tax_rate_META = createCommonMeta($new_tax_rate, mcframe.commonMA.meta.MA_META.TAX_RATE);
	public static final MCMeta new_tax_typ_META = createCommonMeta($new_tax_typ, mcframe.commonMA.meta.MA_META.TAX_TYP);
	public static final MCMeta new_inc_tax_flg_META = createCommonMeta($new_inc_tax_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sls_dtl_upd_flg_META = createCommonMeta($sls_dtl_upd_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta init_trd_cur_tax_amt_META = createCommonMeta($init_trd_cur_tax_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta init_trd_unit_cd_META = createCommonMeta($init_trd_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta init_trd_unit_qty_META = createCommonMeta($init_trd_unit_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta init_trd_cur_upri_META = createCommonMeta($init_trd_cur_upri, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta init_inc_tax_flg_META = createCommonMeta($init_inc_tax_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta init_tax_rate_META = createCommonMeta($init_tax_rate, mcframe.commonMA.meta.MA_META.TAX_RATE);
	public static final MCMeta init_trd_cur_dscnt_amt_META = createCommonMeta($init_trd_cur_dscnt_amt, mcframe.commonMA.meta.MA_META.MONEY);

	protected static final ConstMetaList<Srch01_DtlR> constMetas = new ConstMetaList<Srch01_DtlR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			itm_cd_META,
			itm_sub1_META,
			itm_sub2_META,
			itm_sub3_META,
			itm_nm_META,
			stk_mng_typ_META,
			iv_itm_nm_META,
			sundry_itm_flg_META,
			dlv_cd_META,
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
			pri_prnt_flg_META,
			cntry_cd_META,
			cntry_nm_META,
			dest_cd1_META,
			dest_nm1_META,
			dest_cd2_META,
			dest_nm2_META,
			dest_cd3_META,
			dest_nm3_META,
			purc_act_no_META,
			purc_act_rev_META,
			purc_act_d_no_META,
			purc_ddlv_po_no_META,
			sppl_cd_META,
			sppl_nm_META,
			sppl_cntry_cd_META,
			sppl_cntry_nm_META,
			ret_nm_META,
			ret_zip_cd_META,
			ret_addr1_META,
			ret_addr2_META,
			ret_addr3_META,
			ret_addr4_META,
			ret_cntct_dpt_META,
			ret_cntct_psn_META,
			ret_cntct_psn_title_META,
			ret_tel_META,
			ret_fax_META,
			ret_usr_cd_META,
			ret_usr_nm_META,
			ret_dpt_cd_META,
			ret_dpt_nm_META,
			cntry_org_cd_META,
			cntry_org_nm_META,
			trd_unit_cd_META,
			trd_unit_nm_META,
			trd_unit_qty_META,
			base_unit_cd_META,
			base_unit_nm_META,
			base_unit_qty_META,
			schd_qty_META,
			arr_qty_META,
			sls_ret_qty_META,
			abort_qty_META,
			trd_cur_upri_META,
			upri_not_tgt_flg_META,
			interim_flg_META,
			trd_cur_amt_META,
			trd_cur_inc_tax_amt_META,
			trd_cur_dscnt_amt_META,
			dscnt_rsn_cd_META,
			dscnt_rsn_nm_META,
			cost_upri_META,
			cost_amt_META,
			prof_rate_META,
			tax_fix_flg_META,
			tax_cd_META,
			tax_nm_META,
			tax_rate_META,
			tax_typ_META,
			trd_cur_tax_amt_META,
			base_cur_upri_META,
			base_cur_amt_META,
			base_cur_inc_tax_amt_META,
			base_cur_tax_amt_META,
			base_cur_dscnt_amt_META,
			ptax_cur_upri_META,
			ptax_cur_amt_META,
			ptax_cur_inc_tax_amt_META,
			ptax_cur_tax_amt_META,
			ptax_cur_dscnt_amt_META,
			bill_crryovr_times_META,
			gd_cd_META,
			gd_nm_META,
			loc_cd_META,
			loc_nm_META,
			str_ln_cd_META,
			str_ln_nm_META,
			str_ln_cd_none_flg_META,
			lot_no_META,
			sublot_no_META,
			ver_flg_META,
			ver_no_META,
			sno1_META,
			sno2_META,
			sno3_META,
			sno4_META,
			wrk_no_META,
			wrk_nm_META,
			vmi_flg_META,
			cst_po_d_no_META,
			cst_itm_cd_META,
			cst_itm_nm_META,
			ret_rsn_cd_META,
			ret_rsn_nm_META,
			bd_dpt_cd_META,
			bd_dpt_nm_META,
			purc_ret_rsn_cd_META,
			purc_ret_rsn_nm_META,
			ap_dpt_cd_META,
			ap_dpt_nm_META,
			pay_schd_dt_META,
			sppl_iv_flg_META,
			pay_spot_flg_META,
			asset_mng_typ_META,
			wtax_rate_META,
			wtax_amt_META,
			arr_cnt_rmrks_META,
			trd_d_rmrks_META,
			intr_rmrks_META,
			sub_char1_META,
			sub_char2_META,
			sub_char3_META,
			sls_act_d_no_META,
			sls_act_d_seq_META,
			slo_no_META,
			slo_d_no_META,
			ref_sls_act_no_META,
			ref_sls_act_d_no_META,
			sls_ret_schd_d_no_META,
			arr_act_no_META,
			disp_seq_META,
			lot_mng_typ_META,
			lot_no_typ_META,
			sublot_mng_typ_META,
			sublot_no_typ_META,
			sno1_mng_typ_META,
			sno2_mng_typ_META,
			sno3_mng_typ_META,
			sno4_mng_typ_META,
			trd_unit_dec_place_META,
			trd_unit_conv_base_qty_META,
			trd_unit_conv_qty_META,
			trd_unit_rnd_typ_META,
			base_unit_dec_place_META,
			base_unit_rnd_typ_META,
			str_ln_tgt_flg_META,
			site_cd_META,
			inc_tax_flg_META,
			ref_sls_act_seq_META,
			ref_sls_act_d_seq_META,
			base_sls_ac_dt_META,
			sls_ret_schd_no_META,
			arr_pr_no_META,
			io_schd_pr_no_META,
			dlv_sundry_flg_META,
			sls_acxfr_flg_META,
			comp_spec_typ_META,
			dscnt_itm_flg_META,
			init_abort_flg_META,
			schd_trd_unit_cd_META,
			schd_trd_unit_qty_META,
			schd_trd_unit_dec_place_META,
			schd_trd_unit_conv_base_qty_META,
			schd_trd_unit_conv_qty_META,
			schd_trd_unit_rnd_typ_META,
			dtl_row_id_META,
			peg_no_META,
			itm_sls_upri_cng_flg_META,
			itm_bill_crryovr_times_META,
			prnt_lcl_cd_META,
			init_schd_qty_META,
			init_schd_dscnt_amt_META,
			purc_ret_act_no_META,
			purc_ret_act_rev_META,
			purc_ret_act_d_no_META,
			base_purc_ac_dt_META,
			init_schd_amt_META,
			schd_no_META,
			schd_tax_rate_META,
			schd_inc_tax_flg_META,
			sls_cststk_flg_META,
			new_tax_cd_META,
			new_tax_nm_META,
			new_tax_rate_META,
			new_tax_typ_META,
			new_inc_tax_flg_META,
			sls_dtl_upd_flg_META,
			init_trd_cur_tax_amt_META,
			init_trd_unit_cd_META,
			init_trd_unit_qty_META,
			init_trd_cur_upri_META,
			init_inc_tax_flg_META,
			init_tax_rate_META,
			init_trd_cur_dscnt_amt_META
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
	protected Srch01_DtlR_MC_A(ConstMetaList<? extends Srch01_DtlR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch01_DtlR clone() {
		return (Srch01_DtlR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch01_DtlR createInstance() {
		return (Srch01_DtlR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch01_DtlR getValues(String... names) {
		return (Srch01_DtlR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public String itm_cd() {
		return getConstString(offset + 0, $itm_cd);
	}

	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public void itm_cd(String value) {
		setConstString(offset + 0, $itm_cd, value);
	}


	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public String itm_sub1() {
		return getConstString(offset + 1, $itm_sub1);
	}

	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public void itm_sub1(String value) {
		setConstString(offset + 1, $itm_sub1, value);
	}


	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public String itm_sub2() {
		return getConstString(offset + 2, $itm_sub2);
	}

	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public void itm_sub2(String value) {
		setConstString(offset + 2, $itm_sub2, value);
	}


	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public String itm_sub3() {
		return getConstString(offset + 3, $itm_sub3);
	}

	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public void itm_sub3(String value) {
		setConstString(offset + 3, $itm_sub3, value);
	}


	/**
	 * Item name 品名.<p>
	 *
	 */
	public String itm_nm() {
		return getConstString(offset + 4, $itm_nm);
	}

	/**
	 * Item name 品名.<p>
	 *
	 */
	public void itm_nm(String value) {
		setConstString(offset + 4, $itm_nm, value);
	}


	/**
	 * Inventory management type 在庫管理区分.<p>
	 *
	 */
	public String stk_mng_typ() {
		return getConstString(offset + 5, $stk_mng_typ);
	}

	/**
	 * Inventory management type 在庫管理区分.<p>
	 *
	 */
	public void stk_mng_typ(String value) {
		setConstString(offset + 5, $stk_mng_typ, value);
	}


	/**
	 * Item name for invoice インボイス表記品名.<p>
	 *
	 */
	public String iv_itm_nm() {
		return getConstString(offset + 6, $iv_itm_nm);
	}

	/**
	 * Item name for invoice インボイス表記品名.<p>
	 *
	 */
	public void iv_itm_nm(String value) {
		setConstString(offset + 6, $iv_itm_nm, value);
	}


	/**
	 * Miscellaneous item 諸口品.<p>
	 *
	 */
	public boolean sundry_itm_flg() {
		return getConstBoolean(offset + 7, $sundry_itm_flg);
	}

	/**
	 * Miscellaneous item 諸口品.<p>
	 *
	 */
	public void sundry_itm_flg(boolean value) {
		setConstBoolean(offset + 7, $sundry_itm_flg, value);
	}


	/**
	 * Delivery destination cd. 納品先ＣＤ.<p>
	 *
	 */
	public String dlv_cd() {
		return getConstString(offset + 8, $dlv_cd);
	}

	/**
	 * Delivery destination cd. 納品先ＣＤ.<p>
	 *
	 */
	public void dlv_cd(String value) {
		setConstString(offset + 8, $dlv_cd, value);
	}


	/**
	 * Delivery destination name 納品先名.<p>
	 *
	 */
	public String dlv_nm() {
		return getConstString(offset + 9, $dlv_nm);
	}

	/**
	 * Delivery destination name 納品先名.<p>
	 *
	 */
	public void dlv_nm(String value) {
		setConstString(offset + 9, $dlv_nm, value);
	}


	/**
	 * Zip code (Delivery destination) 納品先郵便番号.<p>
	 *
	 */
	public String dlv_zip_cd() {
		return getConstString(offset + 10, $dlv_zip_cd);
	}

	/**
	 * Zip code (Delivery destination) 納品先郵便番号.<p>
	 *
	 */
	public void dlv_zip_cd(String value) {
		setConstString(offset + 10, $dlv_zip_cd, value);
	}


	/**
	 * Address 1 (Delivery destination) 納品先住所１.<p>
	 *
	 */
	public String dlv_addr1() {
		return getConstString(offset + 11, $dlv_addr1);
	}

	/**
	 * Address 1 (Delivery destination) 納品先住所１.<p>
	 *
	 */
	public void dlv_addr1(String value) {
		setConstString(offset + 11, $dlv_addr1, value);
	}


	/**
	 * Address 2 (Delivery destination) 納品先住所２.<p>
	 *
	 */
	public String dlv_addr2() {
		return getConstString(offset + 12, $dlv_addr2);
	}

	/**
	 * Address 2 (Delivery destination) 納品先住所２.<p>
	 *
	 */
	public void dlv_addr2(String value) {
		setConstString(offset + 12, $dlv_addr2, value);
	}


	/**
	 * Address 3 (Delivery destination) 納品先住所３.<p>
	 *
	 */
	public String dlv_addr3() {
		return getConstString(offset + 13, $dlv_addr3);
	}

	/**
	 * Address 3 (Delivery destination) 納品先住所３.<p>
	 *
	 */
	public void dlv_addr3(String value) {
		setConstString(offset + 13, $dlv_addr3, value);
	}


	/**
	 * Address 4 (Delivery destination) 納品先住所４.<p>
	 *
	 */
	public String dlv_addr4() {
		return getConstString(offset + 14, $dlv_addr4);
	}

	/**
	 * Address 4 (Delivery destination) 納品先住所４.<p>
	 *
	 */
	public void dlv_addr4(String value) {
		setConstString(offset + 14, $dlv_addr4, value);
	}


	/**
	 * Delivery destination dept. 納品先部署.<p>
	 *
	 */
	public String dlv_cntct_dpt() {
		return getConstString(offset + 15, $dlv_cntct_dpt);
	}

	/**
	 * Delivery destination dept. 納品先部署.<p>
	 *
	 */
	public void dlv_cntct_dpt(String value) {
		setConstString(offset + 15, $dlv_cntct_dpt, value);
	}


	/**
	 * Delivery destination PIC 納品先担当者.<p>
	 *
	 */
	public String dlv_cntct_psn() {
		return getConstString(offset + 16, $dlv_cntct_psn);
	}

	/**
	 * Delivery destination PIC 納品先担当者.<p>
	 *
	 */
	public void dlv_cntct_psn(String value) {
		setConstString(offset + 16, $dlv_cntct_psn, value);
	}


	/**
	 * TEL (Delivery destination) 納品先ＴＥＬ.<p>
	 *
	 */
	public String dlv_tel() {
		return getConstString(offset + 17, $dlv_tel);
	}

	/**
	 * TEL (Delivery destination) 納品先ＴＥＬ.<p>
	 *
	 */
	public void dlv_tel(String value) {
		setConstString(offset + 17, $dlv_tel, value);
	}


	/**
	 * FAX (Delivery destination) 納品先ＦＡＸ.<p>
	 *
	 */
	public String dlv_fax() {
		return getConstString(offset + 18, $dlv_fax);
	}

	/**
	 * FAX (Delivery destination) 納品先ＦＡＸ.<p>
	 *
	 */
	public void dlv_fax(String value) {
		setConstString(offset + 18, $dlv_fax, value);
	}


	/**
	 * Print price 価格印字.<p>
	 *
	 */
	public boolean pri_prnt_flg() {
		return getConstBoolean(offset + 19, $pri_prnt_flg);
	}

	/**
	 * Print price 価格印字.<p>
	 *
	 */
	public void pri_prnt_flg(boolean value) {
		setConstBoolean(offset + 19, $pri_prnt_flg, value);
	}


	/**
	 * Country cd. 国ＣＤ.<p>
	 *
	 */
	public String cntry_cd() {
		return getConstString(offset + 20, $cntry_cd);
	}

	/**
	 * Country cd. 国ＣＤ.<p>
	 *
	 */
	public void cntry_cd(String value) {
		setConstString(offset + 20, $cntry_cd, value);
	}


	/**
	 * Country name 国名.<p>
	 *
	 */
	public String cntry_nm() {
		return getConstString(offset + 21, $cntry_nm);
	}

	/**
	 * Country name 国名.<p>
	 *
	 */
	public void cntry_nm(String value) {
		setConstString(offset + 21, $cntry_nm, value);
	}


	/**
	 * Distribution channel cd. 1 仕向先ＣＤ１.<p>
	 *
	 */
	public String dest_cd1() {
		return getConstString(offset + 22, $dest_cd1);
	}

	/**
	 * Distribution channel cd. 1 仕向先ＣＤ１.<p>
	 *
	 */
	public void dest_cd1(String value) {
		setConstString(offset + 22, $dest_cd1, value);
	}


	/**
	 * Distribution channel name 1 仕向先名１.<p>
	 *
	 */
	public String dest_nm1() {
		return getConstString(offset + 23, $dest_nm1);
	}

	/**
	 * Distribution channel name 1 仕向先名１.<p>
	 *
	 */
	public void dest_nm1(String value) {
		setConstString(offset + 23, $dest_nm1, value);
	}


	/**
	 * Distribution channel cd. 2 仕向先ＣＤ２.<p>
	 *
	 */
	public String dest_cd2() {
		return getConstString(offset + 24, $dest_cd2);
	}

	/**
	 * Distribution channel cd. 2 仕向先ＣＤ２.<p>
	 *
	 */
	public void dest_cd2(String value) {
		setConstString(offset + 24, $dest_cd2, value);
	}


	/**
	 * Distribution channel name 2 仕向先名２.<p>
	 *
	 */
	public String dest_nm2() {
		return getConstString(offset + 25, $dest_nm2);
	}

	/**
	 * Distribution channel name 2 仕向先名２.<p>
	 *
	 */
	public void dest_nm2(String value) {
		setConstString(offset + 25, $dest_nm2, value);
	}


	/**
	 * Distribution channel cd. 3 仕向先ＣＤ３.<p>
	 *
	 */
	public String dest_cd3() {
		return getConstString(offset + 26, $dest_cd3);
	}

	/**
	 * Distribution channel cd. 3 仕向先ＣＤ３.<p>
	 *
	 */
	public void dest_cd3(String value) {
		setConstString(offset + 26, $dest_cd3, value);
	}


	/**
	 * Distribution channel name 3 仕向先名３.<p>
	 *
	 */
	public String dest_nm3() {
		return getConstString(offset + 27, $dest_nm3);
	}

	/**
	 * Distribution channel name 3 仕向先名３.<p>
	 *
	 */
	public void dest_nm3(String value) {
		setConstString(offset + 27, $dest_nm3, value);
	}


	/**
	 * Purchase result No. 仕入実績ＮＯ.<p>
	 *
	 */
	public String purc_act_no() {
		return getConstString(offset + 28, $purc_act_no);
	}

	/**
	 * Purchase result No. 仕入実績ＮＯ.<p>
	 *
	 */
	public void purc_act_no(String value) {
		setConstString(offset + 28, $purc_act_no, value);
	}


	/**
	 * Purchase result rev. number 仕入実績改訂番号.<p>
	 *
	 */
	public MCNumber purc_act_rev() {
		return getConstNumber(offset + 29, $purc_act_rev);
	}

	/**
	 * Purchase result rev. number 仕入実績改訂番号.<p>
	 *
	 */
	public void purc_act_rev(MCNumber value) {
		setConstNumber(offset + 29, $purc_act_rev, value);
	}

	/**
	 * Purchase result rev. number 仕入実績改訂番号.<p>
	 *
	 */
	public void purc_act_rev(int value) {
		setConstNumber(offset + 29, $purc_act_rev, value);
	}

	/**
	 * Purchase result rev. number 仕入実績改訂番号.<p>
	 *
	 */
	public void purc_act_rev(long value) {
		setConstNumber(offset + 29, $purc_act_rev, value);
	}

	/**
	 * Purchase result rev. number 仕入実績改訂番号.<p>
	 *
	 */
	public void purc_act_rev(float value) {
		setConstNumber(offset + 29, $purc_act_rev, value);
	}

	/**
	 * Purchase result rev. number 仕入実績改訂番号.<p>
	 *
	 */
	public void purc_act_rev(double value) {
		setConstNumber(offset + 29, $purc_act_rev, value);
	}


	/**
	 * Purchase result details No. 仕入実績明細ＮＯ.<p>
	 *
	 */
	public String purc_act_d_no() {
		return getConstString(offset + 30, $purc_act_d_no);
	}

	/**
	 * Purchase result details No. 仕入実績明細ＮＯ.<p>
	 *
	 */
	public void purc_act_d_no(String value) {
		setConstString(offset + 30, $purc_act_d_no, value);
	}


	/**
	 * Direct delivery PO No. 仕入直送発注ＮＯ.<p>
	 *
	 */
	public String purc_ddlv_po_no() {
		return getConstString(offset + 31, $purc_ddlv_po_no);
	}

	/**
	 * Direct delivery PO No. 仕入直送発注ＮＯ.<p>
	 *
	 */
	public void purc_ddlv_po_no(String value) {
		setConstString(offset + 31, $purc_ddlv_po_no, value);
	}


	/**
	 * Supplier cd. 発注先ＣＤ.<p>
	 *
	 */
	public String sppl_cd() {
		return getConstString(offset + 32, $sppl_cd);
	}

	/**
	 * Supplier cd. 発注先ＣＤ.<p>
	 *
	 */
	public void sppl_cd(String value) {
		setConstString(offset + 32, $sppl_cd, value);
	}


	/**
	 * Supplier name 発注先名.<p>
	 *
	 */
	public String sppl_nm() {
		return getConstString(offset + 33, $sppl_nm);
	}

	/**
	 * Supplier name 発注先名.<p>
	 *
	 */
	public void sppl_nm(String value) {
		setConstString(offset + 33, $sppl_nm, value);
	}


	/**
	 * Supplier country cd. 発注先国ＣＤ.<p>
	 *
	 */
	public String sppl_cntry_cd() {
		return getConstString(offset + 34, $sppl_cntry_cd);
	}

	/**
	 * Supplier country cd. 発注先国ＣＤ.<p>
	 *
	 */
	public void sppl_cntry_cd(String value) {
		setConstString(offset + 34, $sppl_cntry_cd, value);
	}


	/**
	 * Supplier country name 発注先国名.<p>
	 *
	 */
	public String sppl_cntry_nm() {
		return getConstString(offset + 35, $sppl_cntry_nm);
	}

	/**
	 * Supplier country name 発注先国名.<p>
	 *
	 */
	public void sppl_cntry_nm(String value) {
		setConstString(offset + 35, $sppl_cntry_nm, value);
	}


	/**
	 * Return-to name 返品先名.<p>
	 *
	 */
	public String ret_nm() {
		return getConstString(offset + 36, $ret_nm);
	}

	/**
	 * Return-to name 返品先名.<p>
	 *
	 */
	public void ret_nm(String value) {
		setConstString(offset + 36, $ret_nm, value);
	}


	/**
	 * Return-to zip code 返品先郵便番号.<p>
	 *
	 */
	public String ret_zip_cd() {
		return getConstString(offset + 37, $ret_zip_cd);
	}

	/**
	 * Return-to zip code 返品先郵便番号.<p>
	 *
	 */
	public void ret_zip_cd(String value) {
		setConstString(offset + 37, $ret_zip_cd, value);
	}


	/**
	 * Return-to address 1 返品先住所１.<p>
	 *
	 */
	public String ret_addr1() {
		return getConstString(offset + 38, $ret_addr1);
	}

	/**
	 * Return-to address 1 返品先住所１.<p>
	 *
	 */
	public void ret_addr1(String value) {
		setConstString(offset + 38, $ret_addr1, value);
	}


	/**
	 * Return-to address 2 返品先住所２.<p>
	 *
	 */
	public String ret_addr2() {
		return getConstString(offset + 39, $ret_addr2);
	}

	/**
	 * Return-to address 2 返品先住所２.<p>
	 *
	 */
	public void ret_addr2(String value) {
		setConstString(offset + 39, $ret_addr2, value);
	}


	/**
	 * Return-to address 3 返品先住所３.<p>
	 *
	 */
	public String ret_addr3() {
		return getConstString(offset + 40, $ret_addr3);
	}

	/**
	 * Return-to address 3 返品先住所３.<p>
	 *
	 */
	public void ret_addr3(String value) {
		setConstString(offset + 40, $ret_addr3, value);
	}


	/**
	 * Return-to address 4 返品先住所４.<p>
	 *
	 */
	public String ret_addr4() {
		return getConstString(offset + 41, $ret_addr4);
	}

	/**
	 * Return-to address 4 返品先住所４.<p>
	 *
	 */
	public void ret_addr4(String value) {
		setConstString(offset + 41, $ret_addr4, value);
	}


	/**
	 * Return-to dept. 返品先部署.<p>
	 *
	 */
	public String ret_cntct_dpt() {
		return getConstString(offset + 42, $ret_cntct_dpt);
	}

	/**
	 * Return-to dept. 返品先部署.<p>
	 *
	 */
	public void ret_cntct_dpt(String value) {
		setConstString(offset + 42, $ret_cntct_dpt, value);
	}


	/**
	 * Return-to PIC 返品先担当者.<p>
	 *
	 */
	public String ret_cntct_psn() {
		return getConstString(offset + 43, $ret_cntct_psn);
	}

	/**
	 * Return-to PIC 返品先担当者.<p>
	 *
	 */
	public void ret_cntct_psn(String value) {
		setConstString(offset + 43, $ret_cntct_psn, value);
	}


	/**
	 * Return-to PIC form of address 返品先担当者敬称.<p>
	 *
	 */
	public String ret_cntct_psn_title() {
		return getConstString(offset + 44, $ret_cntct_psn_title);
	}

	/**
	 * Return-to PIC form of address 返品先担当者敬称.<p>
	 *
	 */
	public void ret_cntct_psn_title(String value) {
		setConstString(offset + 44, $ret_cntct_psn_title, value);
	}


	/**
	 * Return-to TEL 返品先ＴＥＬ.<p>
	 *
	 */
	public String ret_tel() {
		return getConstString(offset + 45, $ret_tel);
	}

	/**
	 * Return-to TEL 返品先ＴＥＬ.<p>
	 *
	 */
	public void ret_tel(String value) {
		setConstString(offset + 45, $ret_tel, value);
	}


	/**
	 * Return-to FAX 返品先ＦＡＸ.<p>
	 *
	 */
	public String ret_fax() {
		return getConstString(offset + 46, $ret_fax);
	}

	/**
	 * Return-to FAX 返品先ＦＡＸ.<p>
	 *
	 */
	public void ret_fax(String value) {
		setConstString(offset + 46, $ret_fax, value);
	}


	/**
	 * Return PIC cd. 返品担当者ＣＤ.<p>
	 *
	 */
	public String ret_usr_cd() {
		return getConstString(offset + 47, $ret_usr_cd);
	}

	/**
	 * Return PIC cd. 返品担当者ＣＤ.<p>
	 *
	 */
	public void ret_usr_cd(String value) {
		setConstString(offset + 47, $ret_usr_cd, value);
	}


	/**
	 * Return PIC name 返品担当者名.<p>
	 *
	 */
	public String ret_usr_nm() {
		return getConstString(offset + 48, $ret_usr_nm);
	}

	/**
	 * Return PIC name 返品担当者名.<p>
	 *
	 */
	public void ret_usr_nm(String value) {
		setConstString(offset + 48, $ret_usr_nm, value);
	}


	/**
	 * Return dept. cd. 返品部門ＣＤ.<p>
	 *
	 */
	public String ret_dpt_cd() {
		return getConstString(offset + 49, $ret_dpt_cd);
	}

	/**
	 * Return dept. cd. 返品部門ＣＤ.<p>
	 *
	 */
	public void ret_dpt_cd(String value) {
		setConstString(offset + 49, $ret_dpt_cd, value);
	}


	/**
	 * Return dept. name 返品部門名.<p>
	 *
	 */
	public String ret_dpt_nm() {
		return getConstString(offset + 50, $ret_dpt_nm);
	}

	/**
	 * Return dept. name 返品部門名.<p>
	 *
	 */
	public void ret_dpt_nm(String value) {
		setConstString(offset + 50, $ret_dpt_nm, value);
	}


	/**
	 * Place of origin cd. 原産地ＣＤ.<p>
	 *
	 */
	public String cntry_org_cd() {
		return getConstString(offset + 51, $cntry_org_cd);
	}

	/**
	 * Place of origin cd. 原産地ＣＤ.<p>
	 *
	 */
	public void cntry_org_cd(String value) {
		setConstString(offset + 51, $cntry_org_cd, value);
	}


	/**
	 * Place of origin name 原産地名.<p>
	 *
	 */
	public String cntry_org_nm() {
		return getConstString(offset + 52, $cntry_org_nm);
	}

	/**
	 * Place of origin name 原産地名.<p>
	 *
	 */
	public void cntry_org_nm(String value) {
		setConstString(offset + 52, $cntry_org_nm, value);
	}


	/**
	 * Transaction unit cd. 取引単位ＣＤ.<p>
	 *
	 */
	public String trd_unit_cd() {
		return getConstString(offset + 53, $trd_unit_cd);
	}

	/**
	 * Transaction unit cd. 取引単位ＣＤ.<p>
	 *
	 */
	public void trd_unit_cd(String value) {
		setConstString(offset + 53, $trd_unit_cd, value);
	}


	/**
	 * Transaction unit name 取引単位名.<p>
	 *
	 */
	public String trd_unit_nm() {
		return getConstString(offset + 54, $trd_unit_nm);
	}

	/**
	 * Transaction unit name 取引単位名.<p>
	 *
	 */
	public void trd_unit_nm(String value) {
		setConstString(offset + 54, $trd_unit_nm, value);
	}


	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public MCNumber trd_unit_qty() {
		return getConstNumber(offset + 55, $trd_unit_qty);
	}

	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public void trd_unit_qty(MCNumber value) {
		setConstNumber(offset + 55, $trd_unit_qty, value);
	}

	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public void trd_unit_qty(int value) {
		setConstNumber(offset + 55, $trd_unit_qty, value);
	}

	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public void trd_unit_qty(long value) {
		setConstNumber(offset + 55, $trd_unit_qty, value);
	}

	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public void trd_unit_qty(float value) {
		setConstNumber(offset + 55, $trd_unit_qty, value);
	}

	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public void trd_unit_qty(double value) {
		setConstNumber(offset + 55, $trd_unit_qty, value);
	}


	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public String base_unit_cd() {
		return getConstString(offset + 56, $base_unit_cd);
	}

	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public void base_unit_cd(String value) {
		setConstString(offset + 56, $base_unit_cd, value);
	}


	/**
	 * Base unit name 基準単位名.<p>
	 *
	 */
	public String base_unit_nm() {
		return getConstString(offset + 57, $base_unit_nm);
	}

	/**
	 * Base unit name 基準単位名.<p>
	 *
	 */
	public void base_unit_nm(String value) {
		setConstString(offset + 57, $base_unit_nm, value);
	}


	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public MCNumber base_unit_qty() {
		return getConstNumber(offset + 58, $base_unit_qty);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(MCNumber value) {
		setConstNumber(offset + 58, $base_unit_qty, value);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(int value) {
		setConstNumber(offset + 58, $base_unit_qty, value);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(long value) {
		setConstNumber(offset + 58, $base_unit_qty, value);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(float value) {
		setConstNumber(offset + 58, $base_unit_qty, value);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(double value) {
		setConstNumber(offset + 58, $base_unit_qty, value);
	}


	/**
	 * Scheduled qty. 予定数量.<p>
	 *
	 */
	public MCNumber schd_qty() {
		return getConstNumber(offset + 59, $schd_qty);
	}

	/**
	 * Scheduled qty. 予定数量.<p>
	 *
	 */
	public void schd_qty(MCNumber value) {
		setConstNumber(offset + 59, $schd_qty, value);
	}

	/**
	 * Scheduled qty. 予定数量.<p>
	 *
	 */
	public void schd_qty(int value) {
		setConstNumber(offset + 59, $schd_qty, value);
	}

	/**
	 * Scheduled qty. 予定数量.<p>
	 *
	 */
	public void schd_qty(long value) {
		setConstNumber(offset + 59, $schd_qty, value);
	}

	/**
	 * Scheduled qty. 予定数量.<p>
	 *
	 */
	public void schd_qty(float value) {
		setConstNumber(offset + 59, $schd_qty, value);
	}

	/**
	 * Scheduled qty. 予定数量.<p>
	 *
	 */
	public void schd_qty(double value) {
		setConstNumber(offset + 59, $schd_qty, value);
	}


	/**
	 * Receipt qty. 入荷数量.<p>
	 *
	 */
	public MCNumber arr_qty() {
		return getConstNumber(offset + 60, $arr_qty);
	}

	/**
	 * Receipt qty. 入荷数量.<p>
	 *
	 */
	public void arr_qty(MCNumber value) {
		setConstNumber(offset + 60, $arr_qty, value);
	}

	/**
	 * Receipt qty. 入荷数量.<p>
	 *
	 */
	public void arr_qty(int value) {
		setConstNumber(offset + 60, $arr_qty, value);
	}

	/**
	 * Receipt qty. 入荷数量.<p>
	 *
	 */
	public void arr_qty(long value) {
		setConstNumber(offset + 60, $arr_qty, value);
	}

	/**
	 * Receipt qty. 入荷数量.<p>
	 *
	 */
	public void arr_qty(float value) {
		setConstNumber(offset + 60, $arr_qty, value);
	}

	/**
	 * Receipt qty. 入荷数量.<p>
	 *
	 */
	public void arr_qty(double value) {
		setConstNumber(offset + 60, $arr_qty, value);
	}


	/**
	 * Sales returned qty. 売上返品済数量.<p>
	 *
	 */
	public MCNumber sls_ret_qty() {
		return getConstNumber(offset + 61, $sls_ret_qty);
	}

	/**
	 * Sales returned qty. 売上返品済数量.<p>
	 *
	 */
	public void sls_ret_qty(MCNumber value) {
		setConstNumber(offset + 61, $sls_ret_qty, value);
	}

	/**
	 * Sales returned qty. 売上返品済数量.<p>
	 *
	 */
	public void sls_ret_qty(int value) {
		setConstNumber(offset + 61, $sls_ret_qty, value);
	}

	/**
	 * Sales returned qty. 売上返品済数量.<p>
	 *
	 */
	public void sls_ret_qty(long value) {
		setConstNumber(offset + 61, $sls_ret_qty, value);
	}

	/**
	 * Sales returned qty. 売上返品済数量.<p>
	 *
	 */
	public void sls_ret_qty(float value) {
		setConstNumber(offset + 61, $sls_ret_qty, value);
	}

	/**
	 * Sales returned qty. 売上返品済数量.<p>
	 *
	 */
	public void sls_ret_qty(double value) {
		setConstNumber(offset + 61, $sls_ret_qty, value);
	}


	/**
	 * Cancelled remaining qty. 打切数量.<p>
	 *
	 */
	public MCNumber abort_qty() {
		return getConstNumber(offset + 62, $abort_qty);
	}

	/**
	 * Cancelled remaining qty. 打切数量.<p>
	 *
	 */
	public void abort_qty(MCNumber value) {
		setConstNumber(offset + 62, $abort_qty, value);
	}

	/**
	 * Cancelled remaining qty. 打切数量.<p>
	 *
	 */
	public void abort_qty(int value) {
		setConstNumber(offset + 62, $abort_qty, value);
	}

	/**
	 * Cancelled remaining qty. 打切数量.<p>
	 *
	 */
	public void abort_qty(long value) {
		setConstNumber(offset + 62, $abort_qty, value);
	}

	/**
	 * Cancelled remaining qty. 打切数量.<p>
	 *
	 */
	public void abort_qty(float value) {
		setConstNumber(offset + 62, $abort_qty, value);
	}

	/**
	 * Cancelled remaining qty. 打切数量.<p>
	 *
	 */
	public void abort_qty(double value) {
		setConstNumber(offset + 62, $abort_qty, value);
	}


	/**
	 * Unit price (Transaction currency) 取引通貨単価.<p>
	 *
	 */
	public MCNumber trd_cur_upri() {
		return getConstNumber(offset + 63, $trd_cur_upri);
	}

	/**
	 * Unit price (Transaction currency) 取引通貨単価.<p>
	 *
	 */
	public void trd_cur_upri(MCNumber value) {
		setConstNumber(offset + 63, $trd_cur_upri, value);
	}

	/**
	 * Unit price (Transaction currency) 取引通貨単価.<p>
	 *
	 */
	public void trd_cur_upri(int value) {
		setConstNumber(offset + 63, $trd_cur_upri, value);
	}

	/**
	 * Unit price (Transaction currency) 取引通貨単価.<p>
	 *
	 */
	public void trd_cur_upri(long value) {
		setConstNumber(offset + 63, $trd_cur_upri, value);
	}

	/**
	 * Unit price (Transaction currency) 取引通貨単価.<p>
	 *
	 */
	public void trd_cur_upri(float value) {
		setConstNumber(offset + 63, $trd_cur_upri, value);
	}

	/**
	 * Unit price (Transaction currency) 取引通貨単価.<p>
	 *
	 */
	public void trd_cur_upri(double value) {
		setConstNumber(offset + 63, $trd_cur_upri, value);
	}


	/**
	 * Not to reacquire unit price 単価再取得対象外.<p>
	 *
	 */
	public boolean upri_not_tgt_flg() {
		return getConstBoolean(offset + 64, $upri_not_tgt_flg);
	}

	/**
	 * Not to reacquire unit price 単価再取得対象外.<p>
	 *
	 */
	public void upri_not_tgt_flg(boolean value) {
		setConstBoolean(offset + 64, $upri_not_tgt_flg, value);
	}


	/**
	 * Temporary unit price 仮単価.<p>
	 *
	 */
	public boolean interim_flg() {
		return getConstBoolean(offset + 65, $interim_flg);
	}

	/**
	 * Temporary unit price 仮単価.<p>
	 *
	 */
	public void interim_flg(boolean value) {
		setConstBoolean(offset + 65, $interim_flg, value);
	}


	/**
	 * Amount (Transaction currency) 取引通貨金額.<p>
	 *
	 */
	public MCNumber trd_cur_amt() {
		return getConstNumber(offset + 66, $trd_cur_amt);
	}

	/**
	 * Amount (Transaction currency) 取引通貨金額.<p>
	 *
	 */
	public void trd_cur_amt(MCNumber value) {
		setConstNumber(offset + 66, $trd_cur_amt, value);
	}

	/**
	 * Amount (Transaction currency) 取引通貨金額.<p>
	 *
	 */
	public void trd_cur_amt(int value) {
		setConstNumber(offset + 66, $trd_cur_amt, value);
	}

	/**
	 * Amount (Transaction currency) 取引通貨金額.<p>
	 *
	 */
	public void trd_cur_amt(long value) {
		setConstNumber(offset + 66, $trd_cur_amt, value);
	}

	/**
	 * Amount (Transaction currency) 取引通貨金額.<p>
	 *
	 */
	public void trd_cur_amt(float value) {
		setConstNumber(offset + 66, $trd_cur_amt, value);
	}

	/**
	 * Amount (Transaction currency) 取引通貨金額.<p>
	 *
	 */
	public void trd_cur_amt(double value) {
		setConstNumber(offset + 66, $trd_cur_amt, value);
	}


	/**
	 * Tax included amount (Transaction currency) 取引通貨税込金額.<p>
	 *
	 */
	public MCNumber trd_cur_inc_tax_amt() {
		return getConstNumber(offset + 67, $trd_cur_inc_tax_amt);
	}

	/**
	 * Tax included amount (Transaction currency) 取引通貨税込金額.<p>
	 *
	 */
	public void trd_cur_inc_tax_amt(MCNumber value) {
		setConstNumber(offset + 67, $trd_cur_inc_tax_amt, value);
	}

	/**
	 * Tax included amount (Transaction currency) 取引通貨税込金額.<p>
	 *
	 */
	public void trd_cur_inc_tax_amt(int value) {
		setConstNumber(offset + 67, $trd_cur_inc_tax_amt, value);
	}

	/**
	 * Tax included amount (Transaction currency) 取引通貨税込金額.<p>
	 *
	 */
	public void trd_cur_inc_tax_amt(long value) {
		setConstNumber(offset + 67, $trd_cur_inc_tax_amt, value);
	}

	/**
	 * Tax included amount (Transaction currency) 取引通貨税込金額.<p>
	 *
	 */
	public void trd_cur_inc_tax_amt(float value) {
		setConstNumber(offset + 67, $trd_cur_inc_tax_amt, value);
	}

	/**
	 * Tax included amount (Transaction currency) 取引通貨税込金額.<p>
	 *
	 */
	public void trd_cur_inc_tax_amt(double value) {
		setConstNumber(offset + 67, $trd_cur_inc_tax_amt, value);
	}


	/**
	 * Discount amount (Transaction currency) 取引通貨値引額.<p>
	 *
	 */
	public MCNumber trd_cur_dscnt_amt() {
		return getConstNumber(offset + 68, $trd_cur_dscnt_amt);
	}

	/**
	 * Discount amount (Transaction currency) 取引通貨値引額.<p>
	 *
	 */
	public void trd_cur_dscnt_amt(MCNumber value) {
		setConstNumber(offset + 68, $trd_cur_dscnt_amt, value);
	}

	/**
	 * Discount amount (Transaction currency) 取引通貨値引額.<p>
	 *
	 */
	public void trd_cur_dscnt_amt(int value) {
		setConstNumber(offset + 68, $trd_cur_dscnt_amt, value);
	}

	/**
	 * Discount amount (Transaction currency) 取引通貨値引額.<p>
	 *
	 */
	public void trd_cur_dscnt_amt(long value) {
		setConstNumber(offset + 68, $trd_cur_dscnt_amt, value);
	}

	/**
	 * Discount amount (Transaction currency) 取引通貨値引額.<p>
	 *
	 */
	public void trd_cur_dscnt_amt(float value) {
		setConstNumber(offset + 68, $trd_cur_dscnt_amt, value);
	}

	/**
	 * Discount amount (Transaction currency) 取引通貨値引額.<p>
	 *
	 */
	public void trd_cur_dscnt_amt(double value) {
		setConstNumber(offset + 68, $trd_cur_dscnt_amt, value);
	}


	/**
	 * Discount reason cd. 値引理由ＣＤ.<p>
	 *
	 */
	public String dscnt_rsn_cd() {
		return getConstString(offset + 69, $dscnt_rsn_cd);
	}

	/**
	 * Discount reason cd. 値引理由ＣＤ.<p>
	 *
	 */
	public void dscnt_rsn_cd(String value) {
		setConstString(offset + 69, $dscnt_rsn_cd, value);
	}


	/**
	 * Discount reason name 値引理由名.<p>
	 *
	 */
	public String dscnt_rsn_nm() {
		return getConstString(offset + 70, $dscnt_rsn_nm);
	}

	/**
	 * Discount reason name 値引理由名.<p>
	 *
	 */
	public void dscnt_rsn_nm(String value) {
		setConstString(offset + 70, $dscnt_rsn_nm, value);
	}


	/**
	 * Unit cost 原価単価.<p>
	 *
	 */
	public MCNumber cost_upri() {
		return getConstNumber(offset + 71, $cost_upri);
	}

	/**
	 * Unit cost 原価単価.<p>
	 *
	 */
	public void cost_upri(MCNumber value) {
		setConstNumber(offset + 71, $cost_upri, value);
	}

	/**
	 * Unit cost 原価単価.<p>
	 *
	 */
	public void cost_upri(int value) {
		setConstNumber(offset + 71, $cost_upri, value);
	}

	/**
	 * Unit cost 原価単価.<p>
	 *
	 */
	public void cost_upri(long value) {
		setConstNumber(offset + 71, $cost_upri, value);
	}

	/**
	 * Unit cost 原価単価.<p>
	 *
	 */
	public void cost_upri(float value) {
		setConstNumber(offset + 71, $cost_upri, value);
	}

	/**
	 * Unit cost 原価単価.<p>
	 *
	 */
	public void cost_upri(double value) {
		setConstNumber(offset + 71, $cost_upri, value);
	}


	/**
	 * Total cost 原価金額.<p>
	 *
	 */
	public MCNumber cost_amt() {
		return getConstNumber(offset + 72, $cost_amt);
	}

	/**
	 * Total cost 原価金額.<p>
	 *
	 */
	public void cost_amt(MCNumber value) {
		setConstNumber(offset + 72, $cost_amt, value);
	}

	/**
	 * Total cost 原価金額.<p>
	 *
	 */
	public void cost_amt(int value) {
		setConstNumber(offset + 72, $cost_amt, value);
	}

	/**
	 * Total cost 原価金額.<p>
	 *
	 */
	public void cost_amt(long value) {
		setConstNumber(offset + 72, $cost_amt, value);
	}

	/**
	 * Total cost 原価金額.<p>
	 *
	 */
	public void cost_amt(float value) {
		setConstNumber(offset + 72, $cost_amt, value);
	}

	/**
	 * Total cost 原価金額.<p>
	 *
	 */
	public void cost_amt(double value) {
		setConstNumber(offset + 72, $cost_amt, value);
	}


	/**
	 * Gross profit rate 粗利率.<p>
	 *
	 */
	public MCNumber prof_rate() {
		return getConstNumber(offset + 73, $prof_rate);
	}

	/**
	 * Gross profit rate 粗利率.<p>
	 *
	 */
	public void prof_rate(MCNumber value) {
		setConstNumber(offset + 73, $prof_rate, value);
	}

	/**
	 * Gross profit rate 粗利率.<p>
	 *
	 */
	public void prof_rate(int value) {
		setConstNumber(offset + 73, $prof_rate, value);
	}

	/**
	 * Gross profit rate 粗利率.<p>
	 *
	 */
	public void prof_rate(long value) {
		setConstNumber(offset + 73, $prof_rate, value);
	}

	/**
	 * Gross profit rate 粗利率.<p>
	 *
	 */
	public void prof_rate(float value) {
		setConstNumber(offset + 73, $prof_rate, value);
	}

	/**
	 * Gross profit rate 粗利率.<p>
	 *
	 */
	public void prof_rate(double value) {
		setConstNumber(offset + 73, $prof_rate, value);
	}


	/**
	 * Set tax 税指定.<p>
	 *
	 */
	public boolean tax_fix_flg() {
		return getConstBoolean(offset + 74, $tax_fix_flg);
	}

	/**
	 * Set tax 税指定.<p>
	 *
	 */
	public void tax_fix_flg(boolean value) {
		setConstBoolean(offset + 74, $tax_fix_flg, value);
	}


	/**
	 * Tax cd. 税ＣＤ.<p>
	 *
	 */
	public String tax_cd() {
		return getConstString(offset + 75, $tax_cd);
	}

	/**
	 * Tax cd. 税ＣＤ.<p>
	 *
	 */
	public void tax_cd(String value) {
		setConstString(offset + 75, $tax_cd, value);
	}


	/**
	 * Tax name 税名.<p>
	 *
	 */
	public String tax_nm() {
		return getConstString(offset + 76, $tax_nm);
	}

	/**
	 * Tax name 税名.<p>
	 *
	 */
	public void tax_nm(String value) {
		setConstString(offset + 76, $tax_nm, value);
	}


	/**
	 * Tax rate 税率.<p>
	 *
	 */
	public MCNumber tax_rate() {
		return getConstNumber(offset + 77, $tax_rate);
	}

	/**
	 * Tax rate 税率.<p>
	 *
	 */
	public void tax_rate(MCNumber value) {
		setConstNumber(offset + 77, $tax_rate, value);
	}

	/**
	 * Tax rate 税率.<p>
	 *
	 */
	public void tax_rate(int value) {
		setConstNumber(offset + 77, $tax_rate, value);
	}

	/**
	 * Tax rate 税率.<p>
	 *
	 */
	public void tax_rate(long value) {
		setConstNumber(offset + 77, $tax_rate, value);
	}

	/**
	 * Tax rate 税率.<p>
	 *
	 */
	public void tax_rate(float value) {
		setConstNumber(offset + 77, $tax_rate, value);
	}

	/**
	 * Tax rate 税率.<p>
	 *
	 */
	public void tax_rate(double value) {
		setConstNumber(offset + 77, $tax_rate, value);
	}


	/**
	 * Tax type 税区分.<p>
	 *
	 */
	public String tax_typ() {
		return getConstString(offset + 78, $tax_typ);
	}

	/**
	 * Tax type 税区分.<p>
	 *
	 */
	public void tax_typ(String value) {
		setConstString(offset + 78, $tax_typ, value);
	}


	/**
	 * Tax amount (Transaction currency) 取引通貨税額.<p>
	 *
	 */
	public MCNumber trd_cur_tax_amt() {
		return getConstNumber(offset + 79, $trd_cur_tax_amt);
	}

	/**
	 * Tax amount (Transaction currency) 取引通貨税額.<p>
	 *
	 */
	public void trd_cur_tax_amt(MCNumber value) {
		setConstNumber(offset + 79, $trd_cur_tax_amt, value);
	}

	/**
	 * Tax amount (Transaction currency) 取引通貨税額.<p>
	 *
	 */
	public void trd_cur_tax_amt(int value) {
		setConstNumber(offset + 79, $trd_cur_tax_amt, value);
	}

	/**
	 * Tax amount (Transaction currency) 取引通貨税額.<p>
	 *
	 */
	public void trd_cur_tax_amt(long value) {
		setConstNumber(offset + 79, $trd_cur_tax_amt, value);
	}

	/**
	 * Tax amount (Transaction currency) 取引通貨税額.<p>
	 *
	 */
	public void trd_cur_tax_amt(float value) {
		setConstNumber(offset + 79, $trd_cur_tax_amt, value);
	}

	/**
	 * Tax amount (Transaction currency) 取引通貨税額.<p>
	 *
	 */
	public void trd_cur_tax_amt(double value) {
		setConstNumber(offset + 79, $trd_cur_tax_amt, value);
	}


	/**
	 * Unit price (Base currency) 基準通貨単価.<p>
	 *
	 */
	public MCNumber base_cur_upri() {
		return getConstNumber(offset + 80, $base_cur_upri);
	}

	/**
	 * Unit price (Base currency) 基準通貨単価.<p>
	 *
	 */
	public void base_cur_upri(MCNumber value) {
		setConstNumber(offset + 80, $base_cur_upri, value);
	}

	/**
	 * Unit price (Base currency) 基準通貨単価.<p>
	 *
	 */
	public void base_cur_upri(int value) {
		setConstNumber(offset + 80, $base_cur_upri, value);
	}

	/**
	 * Unit price (Base currency) 基準通貨単価.<p>
	 *
	 */
	public void base_cur_upri(long value) {
		setConstNumber(offset + 80, $base_cur_upri, value);
	}

	/**
	 * Unit price (Base currency) 基準通貨単価.<p>
	 *
	 */
	public void base_cur_upri(float value) {
		setConstNumber(offset + 80, $base_cur_upri, value);
	}

	/**
	 * Unit price (Base currency) 基準通貨単価.<p>
	 *
	 */
	public void base_cur_upri(double value) {
		setConstNumber(offset + 80, $base_cur_upri, value);
	}


	/**
	 * Amount (Base currency) 基準通貨金額.<p>
	 *
	 */
	public MCNumber base_cur_amt() {
		return getConstNumber(offset + 81, $base_cur_amt);
	}

	/**
	 * Amount (Base currency) 基準通貨金額.<p>
	 *
	 */
	public void base_cur_amt(MCNumber value) {
		setConstNumber(offset + 81, $base_cur_amt, value);
	}

	/**
	 * Amount (Base currency) 基準通貨金額.<p>
	 *
	 */
	public void base_cur_amt(int value) {
		setConstNumber(offset + 81, $base_cur_amt, value);
	}

	/**
	 * Amount (Base currency) 基準通貨金額.<p>
	 *
	 */
	public void base_cur_amt(long value) {
		setConstNumber(offset + 81, $base_cur_amt, value);
	}

	/**
	 * Amount (Base currency) 基準通貨金額.<p>
	 *
	 */
	public void base_cur_amt(float value) {
		setConstNumber(offset + 81, $base_cur_amt, value);
	}

	/**
	 * Amount (Base currency) 基準通貨金額.<p>
	 *
	 */
	public void base_cur_amt(double value) {
		setConstNumber(offset + 81, $base_cur_amt, value);
	}


	/**
	 * Tax included amount (Base currency) 基準通貨税込金額.<p>
	 *
	 */
	public MCNumber base_cur_inc_tax_amt() {
		return getConstNumber(offset + 82, $base_cur_inc_tax_amt);
	}

	/**
	 * Tax included amount (Base currency) 基準通貨税込金額.<p>
	 *
	 */
	public void base_cur_inc_tax_amt(MCNumber value) {
		setConstNumber(offset + 82, $base_cur_inc_tax_amt, value);
	}

	/**
	 * Tax included amount (Base currency) 基準通貨税込金額.<p>
	 *
	 */
	public void base_cur_inc_tax_amt(int value) {
		setConstNumber(offset + 82, $base_cur_inc_tax_amt, value);
	}

	/**
	 * Tax included amount (Base currency) 基準通貨税込金額.<p>
	 *
	 */
	public void base_cur_inc_tax_amt(long value) {
		setConstNumber(offset + 82, $base_cur_inc_tax_amt, value);
	}

	/**
	 * Tax included amount (Base currency) 基準通貨税込金額.<p>
	 *
	 */
	public void base_cur_inc_tax_amt(float value) {
		setConstNumber(offset + 82, $base_cur_inc_tax_amt, value);
	}

	/**
	 * Tax included amount (Base currency) 基準通貨税込金額.<p>
	 *
	 */
	public void base_cur_inc_tax_amt(double value) {
		setConstNumber(offset + 82, $base_cur_inc_tax_amt, value);
	}


	/**
	 * Tax amount (Base currency) 基準通貨税額.<p>
	 *
	 */
	public MCNumber base_cur_tax_amt() {
		return getConstNumber(offset + 83, $base_cur_tax_amt);
	}

	/**
	 * Tax amount (Base currency) 基準通貨税額.<p>
	 *
	 */
	public void base_cur_tax_amt(MCNumber value) {
		setConstNumber(offset + 83, $base_cur_tax_amt, value);
	}

	/**
	 * Tax amount (Base currency) 基準通貨税額.<p>
	 *
	 */
	public void base_cur_tax_amt(int value) {
		setConstNumber(offset + 83, $base_cur_tax_amt, value);
	}

	/**
	 * Tax amount (Base currency) 基準通貨税額.<p>
	 *
	 */
	public void base_cur_tax_amt(long value) {
		setConstNumber(offset + 83, $base_cur_tax_amt, value);
	}

	/**
	 * Tax amount (Base currency) 基準通貨税額.<p>
	 *
	 */
	public void base_cur_tax_amt(float value) {
		setConstNumber(offset + 83, $base_cur_tax_amt, value);
	}

	/**
	 * Tax amount (Base currency) 基準通貨税額.<p>
	 *
	 */
	public void base_cur_tax_amt(double value) {
		setConstNumber(offset + 83, $base_cur_tax_amt, value);
	}


	/**
	 * Discount amount (Base currency) 基準通貨値引額.<p>
	 *
	 */
	public MCNumber base_cur_dscnt_amt() {
		return getConstNumber(offset + 84, $base_cur_dscnt_amt);
	}

	/**
	 * Discount amount (Base currency) 基準通貨値引額.<p>
	 *
	 */
	public void base_cur_dscnt_amt(MCNumber value) {
		setConstNumber(offset + 84, $base_cur_dscnt_amt, value);
	}

	/**
	 * Discount amount (Base currency) 基準通貨値引額.<p>
	 *
	 */
	public void base_cur_dscnt_amt(int value) {
		setConstNumber(offset + 84, $base_cur_dscnt_amt, value);
	}

	/**
	 * Discount amount (Base currency) 基準通貨値引額.<p>
	 *
	 */
	public void base_cur_dscnt_amt(long value) {
		setConstNumber(offset + 84, $base_cur_dscnt_amt, value);
	}

	/**
	 * Discount amount (Base currency) 基準通貨値引額.<p>
	 *
	 */
	public void base_cur_dscnt_amt(float value) {
		setConstNumber(offset + 84, $base_cur_dscnt_amt, value);
	}

	/**
	 * Discount amount (Base currency) 基準通貨値引額.<p>
	 *
	 */
	public void base_cur_dscnt_amt(double value) {
		setConstNumber(offset + 84, $base_cur_dscnt_amt, value);
	}


	/**
	 * Unit price (Tax currency) 納税通貨単価.<p>
	 *
	 */
	public MCNumber ptax_cur_upri() {
		return getConstNumber(offset + 85, $ptax_cur_upri);
	}

	/**
	 * Unit price (Tax currency) 納税通貨単価.<p>
	 *
	 */
	public void ptax_cur_upri(MCNumber value) {
		setConstNumber(offset + 85, $ptax_cur_upri, value);
	}

	/**
	 * Unit price (Tax currency) 納税通貨単価.<p>
	 *
	 */
	public void ptax_cur_upri(int value) {
		setConstNumber(offset + 85, $ptax_cur_upri, value);
	}

	/**
	 * Unit price (Tax currency) 納税通貨単価.<p>
	 *
	 */
	public void ptax_cur_upri(long value) {
		setConstNumber(offset + 85, $ptax_cur_upri, value);
	}

	/**
	 * Unit price (Tax currency) 納税通貨単価.<p>
	 *
	 */
	public void ptax_cur_upri(float value) {
		setConstNumber(offset + 85, $ptax_cur_upri, value);
	}

	/**
	 * Unit price (Tax currency) 納税通貨単価.<p>
	 *
	 */
	public void ptax_cur_upri(double value) {
		setConstNumber(offset + 85, $ptax_cur_upri, value);
	}


	/**
	 * Amount (Tax currency) 納税通貨金額.<p>
	 *
	 */
	public MCNumber ptax_cur_amt() {
		return getConstNumber(offset + 86, $ptax_cur_amt);
	}

	/**
	 * Amount (Tax currency) 納税通貨金額.<p>
	 *
	 */
	public void ptax_cur_amt(MCNumber value) {
		setConstNumber(offset + 86, $ptax_cur_amt, value);
	}

	/**
	 * Amount (Tax currency) 納税通貨金額.<p>
	 *
	 */
	public void ptax_cur_amt(int value) {
		setConstNumber(offset + 86, $ptax_cur_amt, value);
	}

	/**
	 * Amount (Tax currency) 納税通貨金額.<p>
	 *
	 */
	public void ptax_cur_amt(long value) {
		setConstNumber(offset + 86, $ptax_cur_amt, value);
	}

	/**
	 * Amount (Tax currency) 納税通貨金額.<p>
	 *
	 */
	public void ptax_cur_amt(float value) {
		setConstNumber(offset + 86, $ptax_cur_amt, value);
	}

	/**
	 * Amount (Tax currency) 納税通貨金額.<p>
	 *
	 */
	public void ptax_cur_amt(double value) {
		setConstNumber(offset + 86, $ptax_cur_amt, value);
	}


	/**
	 * Tax included amount (Tax currency) 納税通貨税込金額.<p>
	 *
	 */
	public MCNumber ptax_cur_inc_tax_amt() {
		return getConstNumber(offset + 87, $ptax_cur_inc_tax_amt);
	}

	/**
	 * Tax included amount (Tax currency) 納税通貨税込金額.<p>
	 *
	 */
	public void ptax_cur_inc_tax_amt(MCNumber value) {
		setConstNumber(offset + 87, $ptax_cur_inc_tax_amt, value);
	}

	/**
	 * Tax included amount (Tax currency) 納税通貨税込金額.<p>
	 *
	 */
	public void ptax_cur_inc_tax_amt(int value) {
		setConstNumber(offset + 87, $ptax_cur_inc_tax_amt, value);
	}

	/**
	 * Tax included amount (Tax currency) 納税通貨税込金額.<p>
	 *
	 */
	public void ptax_cur_inc_tax_amt(long value) {
		setConstNumber(offset + 87, $ptax_cur_inc_tax_amt, value);
	}

	/**
	 * Tax included amount (Tax currency) 納税通貨税込金額.<p>
	 *
	 */
	public void ptax_cur_inc_tax_amt(float value) {
		setConstNumber(offset + 87, $ptax_cur_inc_tax_amt, value);
	}

	/**
	 * Tax included amount (Tax currency) 納税通貨税込金額.<p>
	 *
	 */
	public void ptax_cur_inc_tax_amt(double value) {
		setConstNumber(offset + 87, $ptax_cur_inc_tax_amt, value);
	}


	/**
	 * Tax amount (Tax currency) 納税通貨税額.<p>
	 *
	 */
	public MCNumber ptax_cur_tax_amt() {
		return getConstNumber(offset + 88, $ptax_cur_tax_amt);
	}

	/**
	 * Tax amount (Tax currency) 納税通貨税額.<p>
	 *
	 */
	public void ptax_cur_tax_amt(MCNumber value) {
		setConstNumber(offset + 88, $ptax_cur_tax_amt, value);
	}

	/**
	 * Tax amount (Tax currency) 納税通貨税額.<p>
	 *
	 */
	public void ptax_cur_tax_amt(int value) {
		setConstNumber(offset + 88, $ptax_cur_tax_amt, value);
	}

	/**
	 * Tax amount (Tax currency) 納税通貨税額.<p>
	 *
	 */
	public void ptax_cur_tax_amt(long value) {
		setConstNumber(offset + 88, $ptax_cur_tax_amt, value);
	}

	/**
	 * Tax amount (Tax currency) 納税通貨税額.<p>
	 *
	 */
	public void ptax_cur_tax_amt(float value) {
		setConstNumber(offset + 88, $ptax_cur_tax_amt, value);
	}

	/**
	 * Tax amount (Tax currency) 納税通貨税額.<p>
	 *
	 */
	public void ptax_cur_tax_amt(double value) {
		setConstNumber(offset + 88, $ptax_cur_tax_amt, value);
	}


	/**
	 * Discount amount (Tax currency) 納税通貨値引額.<p>
	 *
	 */
	public MCNumber ptax_cur_dscnt_amt() {
		return getConstNumber(offset + 89, $ptax_cur_dscnt_amt);
	}

	/**
	 * Discount amount (Tax currency) 納税通貨値引額.<p>
	 *
	 */
	public void ptax_cur_dscnt_amt(MCNumber value) {
		setConstNumber(offset + 89, $ptax_cur_dscnt_amt, value);
	}

	/**
	 * Discount amount (Tax currency) 納税通貨値引額.<p>
	 *
	 */
	public void ptax_cur_dscnt_amt(int value) {
		setConstNumber(offset + 89, $ptax_cur_dscnt_amt, value);
	}

	/**
	 * Discount amount (Tax currency) 納税通貨値引額.<p>
	 *
	 */
	public void ptax_cur_dscnt_amt(long value) {
		setConstNumber(offset + 89, $ptax_cur_dscnt_amt, value);
	}

	/**
	 * Discount amount (Tax currency) 納税通貨値引額.<p>
	 *
	 */
	public void ptax_cur_dscnt_amt(float value) {
		setConstNumber(offset + 89, $ptax_cur_dscnt_amt, value);
	}

	/**
	 * Discount amount (Tax currency) 納税通貨値引額.<p>
	 *
	 */
	public void ptax_cur_dscnt_amt(double value) {
		setConstNumber(offset + 89, $ptax_cur_dscnt_amt, value);
	}


	/**
	 * Billing carry-over count 請求繰越回数.<p>
	 *
	 */
	public MCNumber bill_crryovr_times() {
		return getConstNumber(offset + 90, $bill_crryovr_times);
	}

	/**
	 * Billing carry-over count 請求繰越回数.<p>
	 *
	 */
	public void bill_crryovr_times(MCNumber value) {
		setConstNumber(offset + 90, $bill_crryovr_times, value);
	}

	/**
	 * Billing carry-over count 請求繰越回数.<p>
	 *
	 */
	public void bill_crryovr_times(int value) {
		setConstNumber(offset + 90, $bill_crryovr_times, value);
	}

	/**
	 * Billing carry-over count 請求繰越回数.<p>
	 *
	 */
	public void bill_crryovr_times(long value) {
		setConstNumber(offset + 90, $bill_crryovr_times, value);
	}

	/**
	 * Billing carry-over count 請求繰越回数.<p>
	 *
	 */
	public void bill_crryovr_times(float value) {
		setConstNumber(offset + 90, $bill_crryovr_times, value);
	}

	/**
	 * Billing carry-over count 請求繰越回数.<p>
	 *
	 */
	public void bill_crryovr_times(double value) {
		setConstNumber(offset + 90, $bill_crryovr_times, value);
	}


	/**
	 * Grading cd. 格付ＣＤ.<p>
	 *
	 */
	public String gd_cd() {
		return getConstString(offset + 91, $gd_cd);
	}

	/**
	 * Grading cd. 格付ＣＤ.<p>
	 *
	 */
	public void gd_cd(String value) {
		setConstString(offset + 91, $gd_cd, value);
	}


	/**
	 * Grading name 格付名.<p>
	 *
	 */
	public String gd_nm() {
		return getConstString(offset + 92, $gd_nm);
	}

	/**
	 * Grading name 格付名.<p>
	 *
	 */
	public void gd_nm(String value) {
		setConstString(offset + 92, $gd_nm, value);
	}


	/**
	 * Location cd. 場所ＣＤ.<p>
	 *
	 */
	public String loc_cd() {
		return getConstString(offset + 93, $loc_cd);
	}

	/**
	 * Location cd. 場所ＣＤ.<p>
	 *
	 */
	public void loc_cd(String value) {
		setConstString(offset + 93, $loc_cd, value);
	}


	/**
	 * Location name 場所名.<p>
	 *
	 */
	public String loc_nm() {
		return getConstString(offset + 94, $loc_nm);
	}

	/**
	 * Location name 場所名.<p>
	 *
	 */
	public void loc_nm(String value) {
		setConstString(offset + 94, $loc_nm, value);
	}


	/**
	 * Rack/Line cd. 棚・ラインＣＤ.<p>
	 *
	 */
	public String str_ln_cd() {
		return getConstString(offset + 95, $str_ln_cd);
	}

	/**
	 * Rack/Line cd. 棚・ラインＣＤ.<p>
	 *
	 */
	public void str_ln_cd(String value) {
		setConstString(offset + 95, $str_ln_cd, value);
	}


	/**
	 * Rack/Line name 棚・ライン名.<p>
	 *
	 */
	public String str_ln_nm() {
		return getConstString(offset + 96, $str_ln_nm);
	}

	/**
	 * Rack/Line name 棚・ライン名.<p>
	 *
	 */
	public void str_ln_nm(String value) {
		setConstString(offset + 96, $str_ln_nm, value);
	}


	/**
	 * Without rack/line 棚・ライン無.<p>
	 *
	 */
	public boolean str_ln_cd_none_flg() {
		return getConstBoolean(offset + 97, $str_ln_cd_none_flg);
	}

	/**
	 * Without rack/line 棚・ライン無.<p>
	 *
	 */
	public void str_ln_cd_none_flg(boolean value) {
		setConstBoolean(offset + 97, $str_ln_cd_none_flg, value);
	}


	/**
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public String lot_no() {
		return getConstString(offset + 98, $lot_no);
	}

	/**
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public void lot_no(String value) {
		setConstString(offset + 98, $lot_no, value);
	}


	/**
	 * Sublot No. サブロットＮＯ.<p>
	 *
	 */
	public String sublot_no() {
		return getConstString(offset + 99, $sublot_no);
	}

	/**
	 * Sublot No. サブロットＮＯ.<p>
	 *
	 */
	public void sublot_no(String value) {
		setConstString(offset + 99, $sublot_no, value);
	}


	/**
	 * For version control 版管理対象.<p>
	 *
	 */
	public boolean ver_flg() {
		return getConstBoolean(offset + 100, $ver_flg);
	}

	/**
	 * For version control 版管理対象.<p>
	 *
	 */
	public void ver_flg(boolean value) {
		setConstBoolean(offset + 100, $ver_flg, value);
	}


	/**
	 * Version No. 版ＮＯ.<p>
	 *
	 */
	public String ver_no() {
		return getConstString(offset + 101, $ver_no);
	}

	/**
	 * Version No. 版ＮＯ.<p>
	 *
	 */
	public void ver_no(String value) {
		setConstString(offset + 101, $ver_no, value);
	}


	/**
	 * SEIBAN No. 1 手配ＮＯ１.<p>
	 *
	 */
	public String sno1() {
		return getConstString(offset + 102, $sno1);
	}

	/**
	 * SEIBAN No. 1 手配ＮＯ１.<p>
	 *
	 */
	public void sno1(String value) {
		setConstString(offset + 102, $sno1, value);
	}


	/**
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public String sno2() {
		return getConstString(offset + 103, $sno2);
	}

	/**
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public void sno2(String value) {
		setConstString(offset + 103, $sno2, value);
	}


	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public String sno3() {
		return getConstString(offset + 104, $sno3);
	}

	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public void sno3(String value) {
		setConstString(offset + 104, $sno3, value);
	}


	/**
	 * SEIBAN No. 4 手配ＮＯ４.<p>
	 *
	 */
	public String sno4() {
		return getConstString(offset + 105, $sno4);
	}

	/**
	 * SEIBAN No. 4 手配ＮＯ４.<p>
	 *
	 */
	public void sno4(String value) {
		setConstString(offset + 105, $sno4, value);
	}


	/**
	 * Sales project No. 案件ＮＯ.<p>
	 *
	 */
	public String wrk_no() {
		return getConstString(offset + 106, $wrk_no);
	}

	/**
	 * Sales project No. 案件ＮＯ.<p>
	 *
	 */
	public void wrk_no(String value) {
		setConstString(offset + 106, $wrk_no, value);
	}


	/**
	 * Sales project name 案件名.<p>
	 *
	 */
	public String wrk_nm() {
		return getConstString(offset + 107, $wrk_nm);
	}

	/**
	 * Sales project name 案件名.<p>
	 *
	 */
	public void wrk_nm(String value) {
		setConstString(offset + 107, $wrk_nm, value);
	}


	/**
	 * Consignment 貸出.<p>
	 *
	 */
	public boolean vmi_flg() {
		return getConstBoolean(offset + 108, $vmi_flg);
	}

	/**
	 * Consignment 貸出.<p>
	 *
	 */
	public void vmi_flg(boolean value) {
		setConstBoolean(offset + 108, $vmi_flg, value);
	}


	/**
	 * Customer order details No. 得意先注文明細ＮＯ.<p>
	 *
	 */
	public String cst_po_d_no() {
		return getConstString(offset + 109, $cst_po_d_no);
	}

	/**
	 * Customer order details No. 得意先注文明細ＮＯ.<p>
	 *
	 */
	public void cst_po_d_no(String value) {
		setConstString(offset + 109, $cst_po_d_no, value);
	}


	/**
	 * Customer item cd. 得意先品目ＣＤ.<p>
	 *
	 */
	public String cst_itm_cd() {
		return getConstString(offset + 110, $cst_itm_cd);
	}

	/**
	 * Customer item cd. 得意先品目ＣＤ.<p>
	 *
	 */
	public void cst_itm_cd(String value) {
		setConstString(offset + 110, $cst_itm_cd, value);
	}


	/**
	 * Customer item name 得意先品名.<p>
	 *
	 */
	public String cst_itm_nm() {
		return getConstString(offset + 111, $cst_itm_nm);
	}

	/**
	 * Customer item name 得意先品名.<p>
	 *
	 */
	public void cst_itm_nm(String value) {
		setConstString(offset + 111, $cst_itm_nm, value);
	}


	/**
	 * Return reason cd. 返品理由ＣＤ.<p>
	 *
	 */
	public String ret_rsn_cd() {
		return getConstString(offset + 112, $ret_rsn_cd);
	}

	/**
	 * Return reason cd. 返品理由ＣＤ.<p>
	 *
	 */
	public void ret_rsn_cd(String value) {
		setConstString(offset + 112, $ret_rsn_cd, value);
	}


	/**
	 * Return reason name 返品理由名.<p>
	 *
	 */
	public String ret_rsn_nm() {
		return getConstString(offset + 113, $ret_rsn_nm);
	}

	/**
	 * Return reason name 返品理由名.<p>
	 *
	 */
	public void ret_rsn_nm(String value) {
		setConstString(offset + 113, $ret_rsn_nm, value);
	}


	/**
	 * Charged dept. cd. 負担部門ＣＤ.<p>
	 *
	 */
	public String bd_dpt_cd() {
		return getConstString(offset + 114, $bd_dpt_cd);
	}

	/**
	 * Charged dept. cd. 負担部門ＣＤ.<p>
	 *
	 */
	public void bd_dpt_cd(String value) {
		setConstString(offset + 114, $bd_dpt_cd, value);
	}


	/**
	 * Charged dept. name 負担部門名.<p>
	 *
	 */
	public String bd_dpt_nm() {
		return getConstString(offset + 115, $bd_dpt_nm);
	}

	/**
	 * Charged dept. name 負担部門名.<p>
	 *
	 */
	public void bd_dpt_nm(String value) {
		setConstString(offset + 115, $bd_dpt_nm, value);
	}


	/**
	 * Purchase return reason cd. 仕入返品理由ＣＤ.<p>
	 *
	 */
	public String purc_ret_rsn_cd() {
		return getConstString(offset + 116, $purc_ret_rsn_cd);
	}

	/**
	 * Purchase return reason cd. 仕入返品理由ＣＤ.<p>
	 *
	 */
	public void purc_ret_rsn_cd(String value) {
		setConstString(offset + 116, $purc_ret_rsn_cd, value);
	}


	/**
	 * Purchase return reason name 仕入返品理由名.<p>
	 *
	 */
	public String purc_ret_rsn_nm() {
		return getConstString(offset + 117, $purc_ret_rsn_nm);
	}

	/**
	 * Purchase return reason name 仕入返品理由名.<p>
	 *
	 */
	public void purc_ret_rsn_nm(String value) {
		setConstString(offset + 117, $purc_ret_rsn_nm, value);
	}


	/**
	 * AP dept. cd. 債務部門ＣＤ.<p>
	 *
	 */
	public String ap_dpt_cd() {
		return getConstString(offset + 118, $ap_dpt_cd);
	}

	/**
	 * AP dept. cd. 債務部門ＣＤ.<p>
	 *
	 */
	public void ap_dpt_cd(String value) {
		setConstString(offset + 118, $ap_dpt_cd, value);
	}


	/**
	 * AP dept. name 債務部門名.<p>
	 *
	 */
	public String ap_dpt_nm() {
		return getConstString(offset + 119, $ap_dpt_nm);
	}

	/**
	 * AP dept. name 債務部門名.<p>
	 *
	 */
	public void ap_dpt_nm(String value) {
		setConstString(offset + 119, $ap_dpt_nm, value);
	}


	/**
	 * Scheduled payment date 支払予定日.<p>
	 *
	 */
	public MCDate pay_schd_dt() {
		return getConstDate(offset + 120, $pay_schd_dt);
	}

	/**
	 * Scheduled payment date 支払予定日.<p>
	 *
	 */
	public void pay_schd_dt(MCDate value) {
		setConstDate(offset + 120, $pay_schd_dt, value);
	}


	/**
	 * Supplier invoice transaction 発注先インボイス取引.<p>
	 *
	 */
	public boolean sppl_iv_flg() {
		return getConstBoolean(offset + 121, $sppl_iv_flg);
	}

	/**
	 * Supplier invoice transaction 発注先インボイス取引.<p>
	 *
	 */
	public void sppl_iv_flg(boolean value) {
		setConstBoolean(offset + 121, $sppl_iv_flg, value);
	}


	/**
	 * Payment per transaction 都度支払.<p>
	 *
	 */
	public boolean pay_spot_flg() {
		return getConstBoolean(offset + 122, $pay_spot_flg);
	}

	/**
	 * Payment per transaction 都度支払.<p>
	 *
	 */
	public void pay_spot_flg(boolean value) {
		setConstBoolean(offset + 122, $pay_spot_flg, value);
	}


	/**
	 * Asset management type 資産管理区分.<p>
	 *
	 */
	public String asset_mng_typ() {
		return getConstString(offset + 123, $asset_mng_typ);
	}

	/**
	 * Asset management type 資産管理区分.<p>
	 *
	 */
	public void asset_mng_typ(String value) {
		setConstString(offset + 123, $asset_mng_typ, value);
	}


	/**
	 * Withholding tax rate 源泉税率.<p>
	 *
	 */
	public MCNumber wtax_rate() {
		return getConstNumber(offset + 124, $wtax_rate);
	}

	/**
	 * Withholding tax rate 源泉税率.<p>
	 *
	 */
	public void wtax_rate(MCNumber value) {
		setConstNumber(offset + 124, $wtax_rate, value);
	}

	/**
	 * Withholding tax rate 源泉税率.<p>
	 *
	 */
	public void wtax_rate(int value) {
		setConstNumber(offset + 124, $wtax_rate, value);
	}

	/**
	 * Withholding tax rate 源泉税率.<p>
	 *
	 */
	public void wtax_rate(long value) {
		setConstNumber(offset + 124, $wtax_rate, value);
	}

	/**
	 * Withholding tax rate 源泉税率.<p>
	 *
	 */
	public void wtax_rate(float value) {
		setConstNumber(offset + 124, $wtax_rate, value);
	}

	/**
	 * Withholding tax rate 源泉税率.<p>
	 *
	 */
	public void wtax_rate(double value) {
		setConstNumber(offset + 124, $wtax_rate, value);
	}


	/**
	 * Withholding tax 源泉税額.<p>
	 *
	 */
	public MCNumber wtax_amt() {
		return getConstNumber(offset + 125, $wtax_amt);
	}

	/**
	 * Withholding tax 源泉税額.<p>
	 *
	 */
	public void wtax_amt(MCNumber value) {
		setConstNumber(offset + 125, $wtax_amt, value);
	}

	/**
	 * Withholding tax 源泉税額.<p>
	 *
	 */
	public void wtax_amt(int value) {
		setConstNumber(offset + 125, $wtax_amt, value);
	}

	/**
	 * Withholding tax 源泉税額.<p>
	 *
	 */
	public void wtax_amt(long value) {
		setConstNumber(offset + 125, $wtax_amt, value);
	}

	/**
	 * Withholding tax 源泉税額.<p>
	 *
	 */
	public void wtax_amt(float value) {
		setConstNumber(offset + 125, $wtax_amt, value);
	}

	/**
	 * Withholding tax 源泉税額.<p>
	 *
	 */
	public void wtax_amt(double value) {
		setConstNumber(offset + 125, $wtax_amt, value);
	}


	/**
	 * Receipt contact remarks 入荷連絡備考.<p>
	 *
	 */
	public String arr_cnt_rmrks() {
		return getConstString(offset + 126, $arr_cnt_rmrks);
	}

	/**
	 * Receipt contact remarks 入荷連絡備考.<p>
	 *
	 */
	public void arr_cnt_rmrks(String value) {
		setConstString(offset + 126, $arr_cnt_rmrks, value);
	}


	/**
	 * Transaction details remarks 取引明細備考.<p>
	 *
	 */
	public String trd_d_rmrks() {
		return getConstString(offset + 127, $trd_d_rmrks);
	}

	/**
	 * Transaction details remarks 取引明細備考.<p>
	 *
	 */
	public void trd_d_rmrks(String value) {
		setConstString(offset + 127, $trd_d_rmrks, value);
	}


	/**
	 * Internal details remarks 内部明細備考.<p>
	 *
	 */
	public String intr_rmrks() {
		return getConstString(offset + 128, $intr_rmrks);
	}

	/**
	 * Internal details remarks 内部明細備考.<p>
	 *
	 */
	public void intr_rmrks(String value) {
		setConstString(offset + 128, $intr_rmrks, value);
	}


	/**
	 * Details spare 1 明細予備１.<p>
	 *
	 */
	public String sub_char1() {
		return getConstString(offset + 129, $sub_char1);
	}

	/**
	 * Details spare 1 明細予備１.<p>
	 *
	 */
	public void sub_char1(String value) {
		setConstString(offset + 129, $sub_char1, value);
	}


	/**
	 * Details spare 2 明細予備２.<p>
	 *
	 */
	public String sub_char2() {
		return getConstString(offset + 130, $sub_char2);
	}

	/**
	 * Details spare 2 明細予備２.<p>
	 *
	 */
	public void sub_char2(String value) {
		setConstString(offset + 130, $sub_char2, value);
	}


	/**
	 * Details spare 3 明細予備３.<p>
	 *
	 */
	public String sub_char3() {
		return getConstString(offset + 131, $sub_char3);
	}

	/**
	 * Details spare 3 明細予備３.<p>
	 *
	 */
	public void sub_char3(String value) {
		setConstString(offset + 131, $sub_char3, value);
	}


	/**
	 * Sales result details No. 売上実績明細ＮＯ.<p>
	 *
	 */
	public String sls_act_d_no() {
		return getConstString(offset + 132, $sls_act_d_no);
	}

	/**
	 * Sales result details No. 売上実績明細ＮＯ.<p>
	 *
	 */
	public void sls_act_d_no(String value) {
		setConstString(offset + 132, $sls_act_d_no, value);
	}


	/**
	 * Sales result details sequence number 売上実績明細連番.<p>
	 *
	 */
	public MCNumber sls_act_d_seq() {
		return getConstNumber(offset + 133, $sls_act_d_seq);
	}

	/**
	 * Sales result details sequence number 売上実績明細連番.<p>
	 *
	 */
	public void sls_act_d_seq(MCNumber value) {
		setConstNumber(offset + 133, $sls_act_d_seq, value);
	}

	/**
	 * Sales result details sequence number 売上実績明細連番.<p>
	 *
	 */
	public void sls_act_d_seq(int value) {
		setConstNumber(offset + 133, $sls_act_d_seq, value);
	}

	/**
	 * Sales result details sequence number 売上実績明細連番.<p>
	 *
	 */
	public void sls_act_d_seq(long value) {
		setConstNumber(offset + 133, $sls_act_d_seq, value);
	}

	/**
	 * Sales result details sequence number 売上実績明細連番.<p>
	 *
	 */
	public void sls_act_d_seq(float value) {
		setConstNumber(offset + 133, $sls_act_d_seq, value);
	}

	/**
	 * Sales result details sequence number 売上実績明細連番.<p>
	 *
	 */
	public void sls_act_d_seq(double value) {
		setConstNumber(offset + 133, $sls_act_d_seq, value);
	}


	/**
	 * Sales order No. 受注ＮＯ.<p>
	 *
	 */
	public String slo_no() {
		return getConstString(offset + 134, $slo_no);
	}

	/**
	 * Sales order No. 受注ＮＯ.<p>
	 *
	 */
	public void slo_no(String value) {
		setConstString(offset + 134, $slo_no, value);
	}


	/**
	 * Sales order details No. 受注明細ＮＯ.<p>
	 *
	 */
	public String slo_d_no() {
		return getConstString(offset + 135, $slo_d_no);
	}

	/**
	 * Sales order details No. 受注明細ＮＯ.<p>
	 *
	 */
	public void slo_d_no(String value) {
		setConstString(offset + 135, $slo_d_no, value);
	}


	/**
	 * Reference sales result No. 参照売上実績ＮＯ.<p>
	 *
	 */
	public String ref_sls_act_no() {
		return getConstString(offset + 136, $ref_sls_act_no);
	}

	/**
	 * Reference sales result No. 参照売上実績ＮＯ.<p>
	 *
	 */
	public void ref_sls_act_no(String value) {
		setConstString(offset + 136, $ref_sls_act_no, value);
	}


	/**
	 * Reference sales result details No. 参照売上実績明細ＮＯ.<p>
	 *
	 */
	public String ref_sls_act_d_no() {
		return getConstString(offset + 137, $ref_sls_act_d_no);
	}

	/**
	 * Reference sales result details No. 参照売上実績明細ＮＯ.<p>
	 *
	 */
	public void ref_sls_act_d_no(String value) {
		setConstString(offset + 137, $ref_sls_act_d_no, value);
	}


	/**
	 * Sales return schedule details No. 売上返品予定明細ＮＯ.<p>
	 *
	 */
	public String sls_ret_schd_d_no() {
		return getConstString(offset + 138, $sls_ret_schd_d_no);
	}

	/**
	 * Sales return schedule details No. 売上返品予定明細ＮＯ.<p>
	 *
	 */
	public void sls_ret_schd_d_no(String value) {
		setConstString(offset + 138, $sls_ret_schd_d_no, value);
	}


	/**
	 * Receipt result No. 入荷実績ＮＯ.<p>
	 *
	 */
	public String arr_act_no() {
		return getConstString(offset + 139, $arr_act_no);
	}

	/**
	 * Receipt result No. 入荷実績ＮＯ.<p>
	 *
	 */
	public void arr_act_no(String value) {
		setConstString(offset + 139, $arr_act_no, value);
	}


	/**
	 * Display order 表示順.<p>
	 *
	 */
	public MCNumber disp_seq() {
		return getConstNumber(offset + 140, $disp_seq);
	}

	/**
	 * Display order 表示順.<p>
	 *
	 */
	public void disp_seq(MCNumber value) {
		setConstNumber(offset + 140, $disp_seq, value);
	}

	/**
	 * Display order 表示順.<p>
	 *
	 */
	public void disp_seq(int value) {
		setConstNumber(offset + 140, $disp_seq, value);
	}

	/**
	 * Display order 表示順.<p>
	 *
	 */
	public void disp_seq(long value) {
		setConstNumber(offset + 140, $disp_seq, value);
	}

	/**
	 * Display order 表示順.<p>
	 *
	 */
	public void disp_seq(float value) {
		setConstNumber(offset + 140, $disp_seq, value);
	}

	/**
	 * Display order 表示順.<p>
	 *
	 */
	public void disp_seq(double value) {
		setConstNumber(offset + 140, $disp_seq, value);
	}


	/**
	 * Lot management type ロット管理区分.<p>
	 *
	 */
	public String lot_mng_typ() {
		return getConstString(offset + 141, $lot_mng_typ);
	}

	/**
	 * Lot management type ロット管理区分.<p>
	 *
	 */
	public void lot_mng_typ(String value) {
		setConstString(offset + 141, $lot_mng_typ, value);
	}


	/**
	 * Lot No. type ロットＮＯ区分.<p>
	 *
	 */
	public String lot_no_typ() {
		return getConstString(offset + 142, $lot_no_typ);
	}

	/**
	 * Lot No. type ロットＮＯ区分.<p>
	 *
	 */
	public void lot_no_typ(String value) {
		setConstString(offset + 142, $lot_no_typ, value);
	}


	/**
	 * Sublot management type サブロット管理区分.<p>
	 *
	 */
	public String sublot_mng_typ() {
		return getConstString(offset + 143, $sublot_mng_typ);
	}

	/**
	 * Sublot management type サブロット管理区分.<p>
	 *
	 */
	public void sublot_mng_typ(String value) {
		setConstString(offset + 143, $sublot_mng_typ, value);
	}


	/**
	 * Sublot No. type サブロットＮＯ区分.<p>
	 *
	 */
	public String sublot_no_typ() {
		return getConstString(offset + 144, $sublot_no_typ);
	}

	/**
	 * Sublot No. type サブロットＮＯ区分.<p>
	 *
	 */
	public void sublot_no_typ(String value) {
		setConstString(offset + 144, $sublot_no_typ, value);
	}


	/**
	 * SEIBAN No. 1 management type 手配ＮＯ１管理区分.<p>
	 *
	 */
	public String sno1_mng_typ() {
		return getConstString(offset + 145, $sno1_mng_typ);
	}

	/**
	 * SEIBAN No. 1 management type 手配ＮＯ１管理区分.<p>
	 *
	 */
	public void sno1_mng_typ(String value) {
		setConstString(offset + 145, $sno1_mng_typ, value);
	}


	/**
	 * SEIBAN No. 2 management type 手配ＮＯ２管理区分.<p>
	 *
	 */
	public String sno2_mng_typ() {
		return getConstString(offset + 146, $sno2_mng_typ);
	}

	/**
	 * SEIBAN No. 2 management type 手配ＮＯ２管理区分.<p>
	 *
	 */
	public void sno2_mng_typ(String value) {
		setConstString(offset + 146, $sno2_mng_typ, value);
	}


	/**
	 * SEIBAN No. 3 management type 手配ＮＯ３管理区分.<p>
	 *
	 */
	public String sno3_mng_typ() {
		return getConstString(offset + 147, $sno3_mng_typ);
	}

	/**
	 * SEIBAN No. 3 management type 手配ＮＯ３管理区分.<p>
	 *
	 */
	public void sno3_mng_typ(String value) {
		setConstString(offset + 147, $sno3_mng_typ, value);
	}


	/**
	 * SEIBAN No. 4 management type 手配ＮＯ４管理区分.<p>
	 *
	 */
	public String sno4_mng_typ() {
		return getConstString(offset + 148, $sno4_mng_typ);
	}

	/**
	 * SEIBAN No. 4 management type 手配ＮＯ４管理区分.<p>
	 *
	 */
	public void sno4_mng_typ(String value) {
		setConstString(offset + 148, $sno4_mng_typ, value);
	}


	/**
	 * Transaction unit number of decimal places 取引単位小数部有効桁数.<p>
	 *
	 */
	public MCNumber trd_unit_dec_place() {
		return getConstNumber(offset + 149, $trd_unit_dec_place);
	}

	/**
	 * Transaction unit number of decimal places 取引単位小数部有効桁数.<p>
	 *
	 */
	public void trd_unit_dec_place(MCNumber value) {
		setConstNumber(offset + 149, $trd_unit_dec_place, value);
	}

	/**
	 * Transaction unit number of decimal places 取引単位小数部有効桁数.<p>
	 *
	 */
	public void trd_unit_dec_place(int value) {
		setConstNumber(offset + 149, $trd_unit_dec_place, value);
	}

	/**
	 * Transaction unit number of decimal places 取引単位小数部有効桁数.<p>
	 *
	 */
	public void trd_unit_dec_place(long value) {
		setConstNumber(offset + 149, $trd_unit_dec_place, value);
	}

	/**
	 * Transaction unit number of decimal places 取引単位小数部有効桁数.<p>
	 *
	 */
	public void trd_unit_dec_place(float value) {
		setConstNumber(offset + 149, $trd_unit_dec_place, value);
	}

	/**
	 * Transaction unit number of decimal places 取引単位小数部有効桁数.<p>
	 *
	 */
	public void trd_unit_dec_place(double value) {
		setConstNumber(offset + 149, $trd_unit_dec_place, value);
	}


	/**
	 * Transaction unit conversion base qty. 取引単位分母数量.<p>
	 *
	 */
	public MCNumber trd_unit_conv_base_qty() {
		return getConstNumber(offset + 150, $trd_unit_conv_base_qty);
	}

	/**
	 * Transaction unit conversion base qty. 取引単位分母数量.<p>
	 *
	 */
	public void trd_unit_conv_base_qty(MCNumber value) {
		setConstNumber(offset + 150, $trd_unit_conv_base_qty, value);
	}

	/**
	 * Transaction unit conversion base qty. 取引単位分母数量.<p>
	 *
	 */
	public void trd_unit_conv_base_qty(int value) {
		setConstNumber(offset + 150, $trd_unit_conv_base_qty, value);
	}

	/**
	 * Transaction unit conversion base qty. 取引単位分母数量.<p>
	 *
	 */
	public void trd_unit_conv_base_qty(long value) {
		setConstNumber(offset + 150, $trd_unit_conv_base_qty, value);
	}

	/**
	 * Transaction unit conversion base qty. 取引単位分母数量.<p>
	 *
	 */
	public void trd_unit_conv_base_qty(float value) {
		setConstNumber(offset + 150, $trd_unit_conv_base_qty, value);
	}

	/**
	 * Transaction unit conversion base qty. 取引単位分母数量.<p>
	 *
	 */
	public void trd_unit_conv_base_qty(double value) {
		setConstNumber(offset + 150, $trd_unit_conv_base_qty, value);
	}


	/**
	 * Transaction unit conversion qty. 取引単位換算数量.<p>
	 *
	 */
	public MCNumber trd_unit_conv_qty() {
		return getConstNumber(offset + 151, $trd_unit_conv_qty);
	}

	/**
	 * Transaction unit conversion qty. 取引単位換算数量.<p>
	 *
	 */
	public void trd_unit_conv_qty(MCNumber value) {
		setConstNumber(offset + 151, $trd_unit_conv_qty, value);
	}

	/**
	 * Transaction unit conversion qty. 取引単位換算数量.<p>
	 *
	 */
	public void trd_unit_conv_qty(int value) {
		setConstNumber(offset + 151, $trd_unit_conv_qty, value);
	}

	/**
	 * Transaction unit conversion qty. 取引単位換算数量.<p>
	 *
	 */
	public void trd_unit_conv_qty(long value) {
		setConstNumber(offset + 151, $trd_unit_conv_qty, value);
	}

	/**
	 * Transaction unit conversion qty. 取引単位換算数量.<p>
	 *
	 */
	public void trd_unit_conv_qty(float value) {
		setConstNumber(offset + 151, $trd_unit_conv_qty, value);
	}

	/**
	 * Transaction unit conversion qty. 取引単位換算数量.<p>
	 *
	 */
	public void trd_unit_conv_qty(double value) {
		setConstNumber(offset + 151, $trd_unit_conv_qty, value);
	}


	/**
	 * Transaction unit rounding type 取引単位端数処理区分.<p>
	 *
	 */
	public String trd_unit_rnd_typ() {
		return getConstString(offset + 152, $trd_unit_rnd_typ);
	}

	/**
	 * Transaction unit rounding type 取引単位端数処理区分.<p>
	 *
	 */
	public void trd_unit_rnd_typ(String value) {
		setConstString(offset + 152, $trd_unit_rnd_typ, value);
	}


	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public MCNumber base_unit_dec_place() {
		return getConstNumber(offset + 153, $base_unit_dec_place);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(MCNumber value) {
		setConstNumber(offset + 153, $base_unit_dec_place, value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(int value) {
		setConstNumber(offset + 153, $base_unit_dec_place, value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(long value) {
		setConstNumber(offset + 153, $base_unit_dec_place, value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(float value) {
		setConstNumber(offset + 153, $base_unit_dec_place, value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(double value) {
		setConstNumber(offset + 153, $base_unit_dec_place, value);
	}


	/**
	 * Base unit rounding type 基準単位端数処理区分.<p>
	 *
	 */
	public String base_unit_rnd_typ() {
		return getConstString(offset + 154, $base_unit_rnd_typ);
	}

	/**
	 * Base unit rounding type 基準単位端数処理区分.<p>
	 *
	 */
	public void base_unit_rnd_typ(String value) {
		setConstString(offset + 154, $base_unit_rnd_typ, value);
	}


	/**
	 * For rack/line 棚・ライン対象.<p>
	 *
	 */
	public boolean str_ln_tgt_flg() {
		return getConstBoolean(offset + 155, $str_ln_tgt_flg);
	}

	/**
	 * For rack/line 棚・ライン対象.<p>
	 *
	 */
	public void str_ln_tgt_flg(boolean value) {
		setConstBoolean(offset + 155, $str_ln_tgt_flg, value);
	}


	/**
	 * Factory/Distribution warehouse cd. 工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public String site_cd() {
		return getConstString(offset + 156, $site_cd);
	}

	/**
	 * Factory/Distribution warehouse cd. 工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public void site_cd(String value) {
		setConstString(offset + 156, $site_cd, value);
	}


	/**
	 * Tax inclusive 内税.<p>
	 *
	 */
	public boolean inc_tax_flg() {
		return getConstBoolean(offset + 157, $inc_tax_flg);
	}

	/**
	 * Tax inclusive 内税.<p>
	 *
	 */
	public void inc_tax_flg(boolean value) {
		setConstBoolean(offset + 157, $inc_tax_flg, value);
	}


	/**
	 * Reference sales result sequence number 参照売上実績連番.<p>
	 *
	 */
	public MCNumber ref_sls_act_seq() {
		return getConstNumber(offset + 158, $ref_sls_act_seq);
	}

	/**
	 * Reference sales result sequence number 参照売上実績連番.<p>
	 *
	 */
	public void ref_sls_act_seq(MCNumber value) {
		setConstNumber(offset + 158, $ref_sls_act_seq, value);
	}

	/**
	 * Reference sales result sequence number 参照売上実績連番.<p>
	 *
	 */
	public void ref_sls_act_seq(int value) {
		setConstNumber(offset + 158, $ref_sls_act_seq, value);
	}

	/**
	 * Reference sales result sequence number 参照売上実績連番.<p>
	 *
	 */
	public void ref_sls_act_seq(long value) {
		setConstNumber(offset + 158, $ref_sls_act_seq, value);
	}

	/**
	 * Reference sales result sequence number 参照売上実績連番.<p>
	 *
	 */
	public void ref_sls_act_seq(float value) {
		setConstNumber(offset + 158, $ref_sls_act_seq, value);
	}

	/**
	 * Reference sales result sequence number 参照売上実績連番.<p>
	 *
	 */
	public void ref_sls_act_seq(double value) {
		setConstNumber(offset + 158, $ref_sls_act_seq, value);
	}


	/**
	 * Reference sales result details sequence number 参照売上実績明細連番.<p>
	 *
	 */
	public MCNumber ref_sls_act_d_seq() {
		return getConstNumber(offset + 159, $ref_sls_act_d_seq);
	}

	/**
	 * Reference sales result details sequence number 参照売上実績明細連番.<p>
	 *
	 */
	public void ref_sls_act_d_seq(MCNumber value) {
		setConstNumber(offset + 159, $ref_sls_act_d_seq, value);
	}

	/**
	 * Reference sales result details sequence number 参照売上実績明細連番.<p>
	 *
	 */
	public void ref_sls_act_d_seq(int value) {
		setConstNumber(offset + 159, $ref_sls_act_d_seq, value);
	}

	/**
	 * Reference sales result details sequence number 参照売上実績明細連番.<p>
	 *
	 */
	public void ref_sls_act_d_seq(long value) {
		setConstNumber(offset + 159, $ref_sls_act_d_seq, value);
	}

	/**
	 * Reference sales result details sequence number 参照売上実績明細連番.<p>
	 *
	 */
	public void ref_sls_act_d_seq(float value) {
		setConstNumber(offset + 159, $ref_sls_act_d_seq, value);
	}

	/**
	 * Reference sales result details sequence number 参照売上実績明細連番.<p>
	 *
	 */
	public void ref_sls_act_d_seq(double value) {
		setConstNumber(offset + 159, $ref_sls_act_d_seq, value);
	}


	/**
	 * Sales recording date (Base) 売上計上日（基）.<p>
	 *
	 */
	public MCDate base_sls_ac_dt() {
		return getConstDate(offset + 160, $base_sls_ac_dt);
	}

	/**
	 * Sales recording date (Base) 売上計上日（基）.<p>
	 *
	 */
	public void base_sls_ac_dt(MCDate value) {
		setConstDate(offset + 160, $base_sls_ac_dt, value);
	}


	/**
	 * Sales return schedule No. 売上返品予定ＮＯ.<p>
	 *
	 */
	public String sls_ret_schd_no() {
		return getConstString(offset + 161, $sls_ret_schd_no);
	}

	/**
	 * Sales return schedule No. 売上返品予定ＮＯ.<p>
	 *
	 */
	public void sls_ret_schd_no(String value) {
		setConstString(offset + 161, $sls_ret_schd_no, value);
	}


	/**
	 * Receipt progress No. 入荷進捗ＮＯ.<p>
	 *
	 */
	public String arr_pr_no() {
		return getConstString(offset + 162, $arr_pr_no);
	}

	/**
	 * Receipt progress No. 入荷進捗ＮＯ.<p>
	 *
	 */
	public void arr_pr_no(String value) {
		setConstString(offset + 162, $arr_pr_no, value);
	}


	/**
	 * GR/GI progress management No. 受払進捗管理ＮＯ.<p>
	 *
	 */
	public String io_schd_pr_no() {
		return getConstString(offset + 163, $io_schd_pr_no);
	}

	/**
	 * GR/GI progress management No. 受払進捗管理ＮＯ.<p>
	 *
	 */
	public void io_schd_pr_no(String value) {
		setConstString(offset + 163, $io_schd_pr_no, value);
	}


	/**
	 * Miscellaneous delivery destination 納品先諸口.<p>
	 *
	 */
	public boolean dlv_sundry_flg() {
		return getConstBoolean(offset + 164, $dlv_sundry_flg);
	}

	/**
	 * Miscellaneous delivery destination 納品先諸口.<p>
	 *
	 */
	public void dlv_sundry_flg(boolean value) {
		setConstBoolean(offset + 164, $dlv_sundry_flg, value);
	}


	/**
	 * Sales other accounting 販売他勘定.<p>
	 *
	 */
	public boolean sls_acxfr_flg() {
		return getConstBoolean(offset + 165, $sls_acxfr_flg);
	}

	/**
	 * Sales other accounting 販売他勘定.<p>
	 *
	 */
	public void sls_acxfr_flg(boolean value) {
		setConstBoolean(offset + 165, $sls_acxfr_flg, value);
	}


	/**
	 * Configuration/specification management type 構成・仕様管理区分.<p>
	 *
	 */
	public String comp_spec_typ() {
		return getConstString(offset + 166, $comp_spec_typ);
	}

	/**
	 * Configuration/specification management type 構成・仕様管理区分.<p>
	 *
	 */
	public void comp_spec_typ(String value) {
		setConstString(offset + 166, $comp_spec_typ, value);
	}


	/**
	 * Discount item 値引品目.<p>
	 *
	 */
	public boolean dscnt_itm_flg() {
		return getConstBoolean(offset + 167, $dscnt_itm_flg);
	}

	/**
	 * Discount item 値引品目.<p>
	 *
	 */
	public void dscnt_itm_flg(boolean value) {
		setConstBoolean(offset + 167, $dscnt_itm_flg, value);
	}


	/**
	 * Cancel remaining (At search) 打切（検索時）.<p>
	 *
	 */
	public boolean init_abort_flg() {
		return getConstBoolean(offset + 168, $init_abort_flg);
	}

	/**
	 * Cancel remaining (At search) 打切（検索時）.<p>
	 *
	 */
	public void init_abort_flg(boolean value) {
		setConstBoolean(offset + 168, $init_abort_flg, value);
	}


	/**
	 * Transaction unit cd. (Schedule) 取引単位ＣＤ（予定）.<p>
	 *
	 */
	public String schd_trd_unit_cd() {
		return getConstString(offset + 169, $schd_trd_unit_cd);
	}

	/**
	 * Transaction unit cd. (Schedule) 取引単位ＣＤ（予定）.<p>
	 *
	 */
	public void schd_trd_unit_cd(String value) {
		setConstString(offset + 169, $schd_trd_unit_cd, value);
	}


	/**
	 * Transaction unit qty. (Schedule) 取引単位数量（予定）.<p>
	 *
	 */
	public MCNumber schd_trd_unit_qty() {
		return getConstNumber(offset + 170, $schd_trd_unit_qty);
	}

	/**
	 * Transaction unit qty. (Schedule) 取引単位数量（予定）.<p>
	 *
	 */
	public void schd_trd_unit_qty(MCNumber value) {
		setConstNumber(offset + 170, $schd_trd_unit_qty, value);
	}

	/**
	 * Transaction unit qty. (Schedule) 取引単位数量（予定）.<p>
	 *
	 */
	public void schd_trd_unit_qty(int value) {
		setConstNumber(offset + 170, $schd_trd_unit_qty, value);
	}

	/**
	 * Transaction unit qty. (Schedule) 取引単位数量（予定）.<p>
	 *
	 */
	public void schd_trd_unit_qty(long value) {
		setConstNumber(offset + 170, $schd_trd_unit_qty, value);
	}

	/**
	 * Transaction unit qty. (Schedule) 取引単位数量（予定）.<p>
	 *
	 */
	public void schd_trd_unit_qty(float value) {
		setConstNumber(offset + 170, $schd_trd_unit_qty, value);
	}

	/**
	 * Transaction unit qty. (Schedule) 取引単位数量（予定）.<p>
	 *
	 */
	public void schd_trd_unit_qty(double value) {
		setConstNumber(offset + 170, $schd_trd_unit_qty, value);
	}


	/**
	 * Transaction unit number of decimal places (Schedule) 取引単位小数部有効桁数(予定).<p>
	 *
	 */
	public MCNumber schd_trd_unit_dec_place() {
		return getConstNumber(offset + 171, $schd_trd_unit_dec_place);
	}

	/**
	 * Transaction unit number of decimal places (Schedule) 取引単位小数部有効桁数(予定).<p>
	 *
	 */
	public void schd_trd_unit_dec_place(MCNumber value) {
		setConstNumber(offset + 171, $schd_trd_unit_dec_place, value);
	}

	/**
	 * Transaction unit number of decimal places (Schedule) 取引単位小数部有効桁数(予定).<p>
	 *
	 */
	public void schd_trd_unit_dec_place(int value) {
		setConstNumber(offset + 171, $schd_trd_unit_dec_place, value);
	}

	/**
	 * Transaction unit number of decimal places (Schedule) 取引単位小数部有効桁数(予定).<p>
	 *
	 */
	public void schd_trd_unit_dec_place(long value) {
		setConstNumber(offset + 171, $schd_trd_unit_dec_place, value);
	}

	/**
	 * Transaction unit number of decimal places (Schedule) 取引単位小数部有効桁数(予定).<p>
	 *
	 */
	public void schd_trd_unit_dec_place(float value) {
		setConstNumber(offset + 171, $schd_trd_unit_dec_place, value);
	}

	/**
	 * Transaction unit number of decimal places (Schedule) 取引単位小数部有効桁数(予定).<p>
	 *
	 */
	public void schd_trd_unit_dec_place(double value) {
		setConstNumber(offset + 171, $schd_trd_unit_dec_place, value);
	}


	/**
	 * Transaction unit conversion base qty. (Schedule) 取引単位分母数量(予定).<p>
	 *
	 */
	public MCNumber schd_trd_unit_conv_base_qty() {
		return getConstNumber(offset + 172, $schd_trd_unit_conv_base_qty);
	}

	/**
	 * Transaction unit conversion base qty. (Schedule) 取引単位分母数量(予定).<p>
	 *
	 */
	public void schd_trd_unit_conv_base_qty(MCNumber value) {
		setConstNumber(offset + 172, $schd_trd_unit_conv_base_qty, value);
	}

	/**
	 * Transaction unit conversion base qty. (Schedule) 取引単位分母数量(予定).<p>
	 *
	 */
	public void schd_trd_unit_conv_base_qty(int value) {
		setConstNumber(offset + 172, $schd_trd_unit_conv_base_qty, value);
	}

	/**
	 * Transaction unit conversion base qty. (Schedule) 取引単位分母数量(予定).<p>
	 *
	 */
	public void schd_trd_unit_conv_base_qty(long value) {
		setConstNumber(offset + 172, $schd_trd_unit_conv_base_qty, value);
	}

	/**
	 * Transaction unit conversion base qty. (Schedule) 取引単位分母数量(予定).<p>
	 *
	 */
	public void schd_trd_unit_conv_base_qty(float value) {
		setConstNumber(offset + 172, $schd_trd_unit_conv_base_qty, value);
	}

	/**
	 * Transaction unit conversion base qty. (Schedule) 取引単位分母数量(予定).<p>
	 *
	 */
	public void schd_trd_unit_conv_base_qty(double value) {
		setConstNumber(offset + 172, $schd_trd_unit_conv_base_qty, value);
	}


	/**
	 * Transaction unit conversion qty. (Schedule) 取引単位換算数量(予定).<p>
	 *
	 */
	public MCNumber schd_trd_unit_conv_qty() {
		return getConstNumber(offset + 173, $schd_trd_unit_conv_qty);
	}

	/**
	 * Transaction unit conversion qty. (Schedule) 取引単位換算数量(予定).<p>
	 *
	 */
	public void schd_trd_unit_conv_qty(MCNumber value) {
		setConstNumber(offset + 173, $schd_trd_unit_conv_qty, value);
	}

	/**
	 * Transaction unit conversion qty. (Schedule) 取引単位換算数量(予定).<p>
	 *
	 */
	public void schd_trd_unit_conv_qty(int value) {
		setConstNumber(offset + 173, $schd_trd_unit_conv_qty, value);
	}

	/**
	 * Transaction unit conversion qty. (Schedule) 取引単位換算数量(予定).<p>
	 *
	 */
	public void schd_trd_unit_conv_qty(long value) {
		setConstNumber(offset + 173, $schd_trd_unit_conv_qty, value);
	}

	/**
	 * Transaction unit conversion qty. (Schedule) 取引単位換算数量(予定).<p>
	 *
	 */
	public void schd_trd_unit_conv_qty(float value) {
		setConstNumber(offset + 173, $schd_trd_unit_conv_qty, value);
	}

	/**
	 * Transaction unit conversion qty. (Schedule) 取引単位換算数量(予定).<p>
	 *
	 */
	public void schd_trd_unit_conv_qty(double value) {
		setConstNumber(offset + 173, $schd_trd_unit_conv_qty, value);
	}


	/**
	 * Transaction unit rounding type (Schedule) 取引単位端数処理区分(予定).<p>
	 *
	 */
	public String schd_trd_unit_rnd_typ() {
		return getConstString(offset + 174, $schd_trd_unit_rnd_typ);
	}

	/**
	 * Transaction unit rounding type (Schedule) 取引単位端数処理区分(予定).<p>
	 *
	 */
	public void schd_trd_unit_rnd_typ(String value) {
		setConstString(offset + 174, $schd_trd_unit_rnd_typ, value);
	}


	/**
	 * Details row ID 明細行ＩＤ.<p>
	 *
	 */
	public MCNumber dtl_row_id() {
		return getConstNumber(offset + 175, $dtl_row_id);
	}

	/**
	 * Details row ID 明細行ＩＤ.<p>
	 *
	 */
	public void dtl_row_id(MCNumber value) {
		setConstNumber(offset + 175, $dtl_row_id, value);
	}

	/**
	 * Details row ID 明細行ＩＤ.<p>
	 *
	 */
	public void dtl_row_id(int value) {
		setConstNumber(offset + 175, $dtl_row_id, value);
	}

	/**
	 * Details row ID 明細行ＩＤ.<p>
	 *
	 */
	public void dtl_row_id(long value) {
		setConstNumber(offset + 175, $dtl_row_id, value);
	}

	/**
	 * Details row ID 明細行ＩＤ.<p>
	 *
	 */
	public void dtl_row_id(float value) {
		setConstNumber(offset + 175, $dtl_row_id, value);
	}

	/**
	 * Details row ID 明細行ＩＤ.<p>
	 *
	 */
	public void dtl_row_id(double value) {
		setConstNumber(offset + 175, $dtl_row_id, value);
	}


	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public MCNumber peg_no() {
		return getConstNumber(offset + 176, $peg_no);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(MCNumber value) {
		setConstNumber(offset + 176, $peg_no, value);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(int value) {
		setConstNumber(offset + 176, $peg_no, value);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(long value) {
		setConstNumber(offset + 176, $peg_no, value);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(float value) {
		setConstNumber(offset + 176, $peg_no, value);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(double value) {
		setConstNumber(offset + 176, $peg_no, value);
	}


	/**
	 * Allow item sales unit price change 品目販売単価変更許可.<p>
	 *
	 */
	public boolean itm_sls_upri_cng_flg() {
		return getConstBoolean(offset + 177, $itm_sls_upri_cng_flg);
	}

	/**
	 * Allow item sales unit price change 品目販売単価変更許可.<p>
	 *
	 */
	public void itm_sls_upri_cng_flg(boolean value) {
		setConstBoolean(offset + 177, $itm_sls_upri_cng_flg, value);
	}


	/**
	 * Item billing carry-over count 品目請求繰越回数.<p>
	 *
	 */
	public MCNumber itm_bill_crryovr_times() {
		return getConstNumber(offset + 178, $itm_bill_crryovr_times);
	}

	/**
	 * Item billing carry-over count 品目請求繰越回数.<p>
	 *
	 */
	public void itm_bill_crryovr_times(MCNumber value) {
		setConstNumber(offset + 178, $itm_bill_crryovr_times, value);
	}

	/**
	 * Item billing carry-over count 品目請求繰越回数.<p>
	 *
	 */
	public void itm_bill_crryovr_times(int value) {
		setConstNumber(offset + 178, $itm_bill_crryovr_times, value);
	}

	/**
	 * Item billing carry-over count 品目請求繰越回数.<p>
	 *
	 */
	public void itm_bill_crryovr_times(long value) {
		setConstNumber(offset + 178, $itm_bill_crryovr_times, value);
	}

	/**
	 * Item billing carry-over count 品目請求繰越回数.<p>
	 *
	 */
	public void itm_bill_crryovr_times(float value) {
		setConstNumber(offset + 178, $itm_bill_crryovr_times, value);
	}

	/**
	 * Item billing carry-over count 品目請求繰越回数.<p>
	 *
	 */
	public void itm_bill_crryovr_times(double value) {
		setConstNumber(offset + 178, $itm_bill_crryovr_times, value);
	}


	/**
	 * Report output locale cd. 帳票出力ロケールＣＤ.<p>
	 *
	 */
	public String prnt_lcl_cd() {
		return getConstString(offset + 179, $prnt_lcl_cd);
	}

	/**
	 * Report output locale cd. 帳票出力ロケールＣＤ.<p>
	 *
	 */
	public void prnt_lcl_cd(String value) {
		setConstString(offset + 179, $prnt_lcl_cd, value);
	}


	/**
	 * Initial scheduled qty. (Base unit) 当初予定数量（基準単位）.<p>
	 *
	 */
	public MCNumber init_schd_qty() {
		return getConstNumber(offset + 180, $init_schd_qty);
	}

	/**
	 * Initial scheduled qty. (Base unit) 当初予定数量（基準単位）.<p>
	 *
	 */
	public void init_schd_qty(MCNumber value) {
		setConstNumber(offset + 180, $init_schd_qty, value);
	}

	/**
	 * Initial scheduled qty. (Base unit) 当初予定数量（基準単位）.<p>
	 *
	 */
	public void init_schd_qty(int value) {
		setConstNumber(offset + 180, $init_schd_qty, value);
	}

	/**
	 * Initial scheduled qty. (Base unit) 当初予定数量（基準単位）.<p>
	 *
	 */
	public void init_schd_qty(long value) {
		setConstNumber(offset + 180, $init_schd_qty, value);
	}

	/**
	 * Initial scheduled qty. (Base unit) 当初予定数量（基準単位）.<p>
	 *
	 */
	public void init_schd_qty(float value) {
		setConstNumber(offset + 180, $init_schd_qty, value);
	}

	/**
	 * Initial scheduled qty. (Base unit) 当初予定数量（基準単位）.<p>
	 *
	 */
	public void init_schd_qty(double value) {
		setConstNumber(offset + 180, $init_schd_qty, value);
	}


	/**
	 * Initial scheduled discount amount 当初予定値引額.<p>
	 *
	 */
	public MCNumber init_schd_dscnt_amt() {
		return getConstNumber(offset + 181, $init_schd_dscnt_amt);
	}

	/**
	 * Initial scheduled discount amount 当初予定値引額.<p>
	 *
	 */
	public void init_schd_dscnt_amt(MCNumber value) {
		setConstNumber(offset + 181, $init_schd_dscnt_amt, value);
	}

	/**
	 * Initial scheduled discount amount 当初予定値引額.<p>
	 *
	 */
	public void init_schd_dscnt_amt(int value) {
		setConstNumber(offset + 181, $init_schd_dscnt_amt, value);
	}

	/**
	 * Initial scheduled discount amount 当初予定値引額.<p>
	 *
	 */
	public void init_schd_dscnt_amt(long value) {
		setConstNumber(offset + 181, $init_schd_dscnt_amt, value);
	}

	/**
	 * Initial scheduled discount amount 当初予定値引額.<p>
	 *
	 */
	public void init_schd_dscnt_amt(float value) {
		setConstNumber(offset + 181, $init_schd_dscnt_amt, value);
	}

	/**
	 * Initial scheduled discount amount 当初予定値引額.<p>
	 *
	 */
	public void init_schd_dscnt_amt(double value) {
		setConstNumber(offset + 181, $init_schd_dscnt_amt, value);
	}


	/**
	 * Purchase return result No. 仕入返品実績ＮＯ.<p>
	 *
	 */
	public String purc_ret_act_no() {
		return getConstString(offset + 182, $purc_ret_act_no);
	}

	/**
	 * Purchase return result No. 仕入返品実績ＮＯ.<p>
	 *
	 */
	public void purc_ret_act_no(String value) {
		setConstString(offset + 182, $purc_ret_act_no, value);
	}


	/**
	 * Purchase return result rev. number 仕入返品実績改訂番号.<p>
	 *
	 */
	public MCNumber purc_ret_act_rev() {
		return getConstNumber(offset + 183, $purc_ret_act_rev);
	}

	/**
	 * Purchase return result rev. number 仕入返品実績改訂番号.<p>
	 *
	 */
	public void purc_ret_act_rev(MCNumber value) {
		setConstNumber(offset + 183, $purc_ret_act_rev, value);
	}

	/**
	 * Purchase return result rev. number 仕入返品実績改訂番号.<p>
	 *
	 */
	public void purc_ret_act_rev(int value) {
		setConstNumber(offset + 183, $purc_ret_act_rev, value);
	}

	/**
	 * Purchase return result rev. number 仕入返品実績改訂番号.<p>
	 *
	 */
	public void purc_ret_act_rev(long value) {
		setConstNumber(offset + 183, $purc_ret_act_rev, value);
	}

	/**
	 * Purchase return result rev. number 仕入返品実績改訂番号.<p>
	 *
	 */
	public void purc_ret_act_rev(float value) {
		setConstNumber(offset + 183, $purc_ret_act_rev, value);
	}

	/**
	 * Purchase return result rev. number 仕入返品実績改訂番号.<p>
	 *
	 */
	public void purc_ret_act_rev(double value) {
		setConstNumber(offset + 183, $purc_ret_act_rev, value);
	}


	/**
	 * Purchase return result details No. 仕入返品実績明細ＮＯ.<p>
	 *
	 */
	public String purc_ret_act_d_no() {
		return getConstString(offset + 184, $purc_ret_act_d_no);
	}

	/**
	 * Purchase return result details No. 仕入返品実績明細ＮＯ.<p>
	 *
	 */
	public void purc_ret_act_d_no(String value) {
		setConstString(offset + 184, $purc_ret_act_d_no, value);
	}


	/**
	 * Purchase recording date (Base) 仕入計上日（基）.<p>
	 *
	 */
	public MCDate base_purc_ac_dt() {
		return getConstDate(offset + 185, $base_purc_ac_dt);
	}

	/**
	 * Purchase recording date (Base) 仕入計上日（基）.<p>
	 *
	 */
	public void base_purc_ac_dt(MCDate value) {
		setConstDate(offset + 185, $base_purc_ac_dt, value);
	}


	/**
	 * Initial amount (Transaction currency) 当初取引通貨金額.<p>
	 *
	 */
	public MCNumber init_schd_amt() {
		return getConstNumber(offset + 186, $init_schd_amt);
	}

	/**
	 * Initial amount (Transaction currency) 当初取引通貨金額.<p>
	 *
	 */
	public void init_schd_amt(MCNumber value) {
		setConstNumber(offset + 186, $init_schd_amt, value);
	}

	/**
	 * Initial amount (Transaction currency) 当初取引通貨金額.<p>
	 *
	 */
	public void init_schd_amt(int value) {
		setConstNumber(offset + 186, $init_schd_amt, value);
	}

	/**
	 * Initial amount (Transaction currency) 当初取引通貨金額.<p>
	 *
	 */
	public void init_schd_amt(long value) {
		setConstNumber(offset + 186, $init_schd_amt, value);
	}

	/**
	 * Initial amount (Transaction currency) 当初取引通貨金額.<p>
	 *
	 */
	public void init_schd_amt(float value) {
		setConstNumber(offset + 186, $init_schd_amt, value);
	}

	/**
	 * Initial amount (Transaction currency) 当初取引通貨金額.<p>
	 *
	 */
	public void init_schd_amt(double value) {
		setConstNumber(offset + 186, $init_schd_amt, value);
	}


	/**
	 * Scheduled No. 予定ＮＯ.<p>
	 *
	 */
	public String schd_no() {
		return getConstString(offset + 187, $schd_no);
	}

	/**
	 * Scheduled No. 予定ＮＯ.<p>
	 *
	 */
	public void schd_no(String value) {
		setConstString(offset + 187, $schd_no, value);
	}


	/**
	 * Tax rate (Schedule) 税率（予定）.<p>
	 *
	 */
	public MCNumber schd_tax_rate() {
		return getConstNumber(offset + 188, $schd_tax_rate);
	}

	/**
	 * Tax rate (Schedule) 税率（予定）.<p>
	 *
	 */
	public void schd_tax_rate(MCNumber value) {
		setConstNumber(offset + 188, $schd_tax_rate, value);
	}

	/**
	 * Tax rate (Schedule) 税率（予定）.<p>
	 *
	 */
	public void schd_tax_rate(int value) {
		setConstNumber(offset + 188, $schd_tax_rate, value);
	}

	/**
	 * Tax rate (Schedule) 税率（予定）.<p>
	 *
	 */
	public void schd_tax_rate(long value) {
		setConstNumber(offset + 188, $schd_tax_rate, value);
	}

	/**
	 * Tax rate (Schedule) 税率（予定）.<p>
	 *
	 */
	public void schd_tax_rate(float value) {
		setConstNumber(offset + 188, $schd_tax_rate, value);
	}

	/**
	 * Tax rate (Schedule) 税率（予定）.<p>
	 *
	 */
	public void schd_tax_rate(double value) {
		setConstNumber(offset + 188, $schd_tax_rate, value);
	}


	/**
	 * Tax inclusive (Schedule) 内税（予定）.<p>
	 *
	 */
	public boolean schd_inc_tax_flg() {
		return getConstBoolean(offset + 189, $schd_inc_tax_flg);
	}

	/**
	 * Tax inclusive (Schedule) 内税（予定）.<p>
	 *
	 */
	public void schd_inc_tax_flg(boolean value) {
		setConstBoolean(offset + 189, $schd_inc_tax_flg, value);
	}


	/**
	 * Sales keeping customer inventory 預り売上.<p>
	 *
	 */
	public boolean sls_cststk_flg() {
		return getConstBoolean(offset + 190, $sls_cststk_flg);
	}

	/**
	 * Sales keeping customer inventory 預り売上.<p>
	 *
	 */
	public void sls_cststk_flg(boolean value) {
		setConstBoolean(offset + 190, $sls_cststk_flg, value);
	}


	/**
	 * Tax cd. (Latest) 税ＣＤ（最新）.<p>
	 *
	 */
	public String new_tax_cd() {
		return getConstString(offset + 191, $new_tax_cd);
	}

	/**
	 * Tax cd. (Latest) 税ＣＤ（最新）.<p>
	 *
	 */
	public void new_tax_cd(String value) {
		setConstString(offset + 191, $new_tax_cd, value);
	}


	/**
	 * Tax name (Latest) 税名（最新）.<p>
	 *
	 */
	public String new_tax_nm() {
		return getConstString(offset + 192, $new_tax_nm);
	}

	/**
	 * Tax name (Latest) 税名（最新）.<p>
	 *
	 */
	public void new_tax_nm(String value) {
		setConstString(offset + 192, $new_tax_nm, value);
	}


	/**
	 * Tax rate (Latest) 税率（最新）.<p>
	 *
	 */
	public MCNumber new_tax_rate() {
		return getConstNumber(offset + 193, $new_tax_rate);
	}

	/**
	 * Tax rate (Latest) 税率（最新）.<p>
	 *
	 */
	public void new_tax_rate(MCNumber value) {
		setConstNumber(offset + 193, $new_tax_rate, value);
	}

	/**
	 * Tax rate (Latest) 税率（最新）.<p>
	 *
	 */
	public void new_tax_rate(int value) {
		setConstNumber(offset + 193, $new_tax_rate, value);
	}

	/**
	 * Tax rate (Latest) 税率（最新）.<p>
	 *
	 */
	public void new_tax_rate(long value) {
		setConstNumber(offset + 193, $new_tax_rate, value);
	}

	/**
	 * Tax rate (Latest) 税率（最新）.<p>
	 *
	 */
	public void new_tax_rate(float value) {
		setConstNumber(offset + 193, $new_tax_rate, value);
	}

	/**
	 * Tax rate (Latest) 税率（最新）.<p>
	 *
	 */
	public void new_tax_rate(double value) {
		setConstNumber(offset + 193, $new_tax_rate, value);
	}


	/**
	 * Tax type (Latest) 税区分（最新）.<p>
	 *
	 */
	public String new_tax_typ() {
		return getConstString(offset + 194, $new_tax_typ);
	}

	/**
	 * Tax type (Latest) 税区分（最新）.<p>
	 *
	 */
	public void new_tax_typ(String value) {
		setConstString(offset + 194, $new_tax_typ, value);
	}


	/**
	 * Tax inclusive (Latest) 内税（最新）.<p>
	 *
	 */
	public boolean new_inc_tax_flg() {
		return getConstBoolean(offset + 195, $new_inc_tax_flg);
	}

	/**
	 * Tax inclusive (Latest) 内税（最新）.<p>
	 *
	 */
	public void new_inc_tax_flg(boolean value) {
		setConstBoolean(offset + 195, $new_inc_tax_flg, value);
	}


	/**
	 * Details correction 明細訂正.<p>
	 *
	 */
	public boolean sls_dtl_upd_flg() {
		return getConstBoolean(offset + 196, $sls_dtl_upd_flg);
	}

	/**
	 * Details correction 明細訂正.<p>
	 *
	 */
	public void sls_dtl_upd_flg(boolean value) {
		setConstBoolean(offset + 196, $sls_dtl_upd_flg, value);
	}


	/**
	 * Initial tax amount (Transaction currency) 当初取引通貨税額.<p>
	 *
	 */
	public MCNumber init_trd_cur_tax_amt() {
		return getConstNumber(offset + 197, $init_trd_cur_tax_amt);
	}

	/**
	 * Initial tax amount (Transaction currency) 当初取引通貨税額.<p>
	 *
	 */
	public void init_trd_cur_tax_amt(MCNumber value) {
		setConstNumber(offset + 197, $init_trd_cur_tax_amt, value);
	}

	/**
	 * Initial tax amount (Transaction currency) 当初取引通貨税額.<p>
	 *
	 */
	public void init_trd_cur_tax_amt(int value) {
		setConstNumber(offset + 197, $init_trd_cur_tax_amt, value);
	}

	/**
	 * Initial tax amount (Transaction currency) 当初取引通貨税額.<p>
	 *
	 */
	public void init_trd_cur_tax_amt(long value) {
		setConstNumber(offset + 197, $init_trd_cur_tax_amt, value);
	}

	/**
	 * Initial tax amount (Transaction currency) 当初取引通貨税額.<p>
	 *
	 */
	public void init_trd_cur_tax_amt(float value) {
		setConstNumber(offset + 197, $init_trd_cur_tax_amt, value);
	}

	/**
	 * Initial tax amount (Transaction currency) 当初取引通貨税額.<p>
	 *
	 */
	public void init_trd_cur_tax_amt(double value) {
		setConstNumber(offset + 197, $init_trd_cur_tax_amt, value);
	}


	/**
	 * Initial transaction unit cd. 当初取引単位ＣＤ.<p>
	 *
	 */
	public String init_trd_unit_cd() {
		return getConstString(offset + 198, $init_trd_unit_cd);
	}

	/**
	 * Initial transaction unit cd. 当初取引単位ＣＤ.<p>
	 *
	 */
	public void init_trd_unit_cd(String value) {
		setConstString(offset + 198, $init_trd_unit_cd, value);
	}


	/**
	 * Initial transaction unit qty. 当初取引単位数量.<p>
	 *
	 */
	public MCNumber init_trd_unit_qty() {
		return getConstNumber(offset + 199, $init_trd_unit_qty);
	}

	/**
	 * Initial transaction unit qty. 当初取引単位数量.<p>
	 *
	 */
	public void init_trd_unit_qty(MCNumber value) {
		setConstNumber(offset + 199, $init_trd_unit_qty, value);
	}

	/**
	 * Initial transaction unit qty. 当初取引単位数量.<p>
	 *
	 */
	public void init_trd_unit_qty(int value) {
		setConstNumber(offset + 199, $init_trd_unit_qty, value);
	}

	/**
	 * Initial transaction unit qty. 当初取引単位数量.<p>
	 *
	 */
	public void init_trd_unit_qty(long value) {
		setConstNumber(offset + 199, $init_trd_unit_qty, value);
	}

	/**
	 * Initial transaction unit qty. 当初取引単位数量.<p>
	 *
	 */
	public void init_trd_unit_qty(float value) {
		setConstNumber(offset + 199, $init_trd_unit_qty, value);
	}

	/**
	 * Initial transaction unit qty. 当初取引単位数量.<p>
	 *
	 */
	public void init_trd_unit_qty(double value) {
		setConstNumber(offset + 199, $init_trd_unit_qty, value);
	}


	/**
	 * Initial unit price (Transaction currency) 当初取引通貨単価.<p>
	 *
	 */
	public MCNumber init_trd_cur_upri() {
		return getConstNumber(offset + 200, $init_trd_cur_upri);
	}

	/**
	 * Initial unit price (Transaction currency) 当初取引通貨単価.<p>
	 *
	 */
	public void init_trd_cur_upri(MCNumber value) {
		setConstNumber(offset + 200, $init_trd_cur_upri, value);
	}

	/**
	 * Initial unit price (Transaction currency) 当初取引通貨単価.<p>
	 *
	 */
	public void init_trd_cur_upri(int value) {
		setConstNumber(offset + 200, $init_trd_cur_upri, value);
	}

	/**
	 * Initial unit price (Transaction currency) 当初取引通貨単価.<p>
	 *
	 */
	public void init_trd_cur_upri(long value) {
		setConstNumber(offset + 200, $init_trd_cur_upri, value);
	}

	/**
	 * Initial unit price (Transaction currency) 当初取引通貨単価.<p>
	 *
	 */
	public void init_trd_cur_upri(float value) {
		setConstNumber(offset + 200, $init_trd_cur_upri, value);
	}

	/**
	 * Initial unit price (Transaction currency) 当初取引通貨単価.<p>
	 *
	 */
	public void init_trd_cur_upri(double value) {
		setConstNumber(offset + 200, $init_trd_cur_upri, value);
	}


	/**
	 * Initial tax inclusive 当初内税.<p>
	 *
	 */
	public boolean init_inc_tax_flg() {
		return getConstBoolean(offset + 201, $init_inc_tax_flg);
	}

	/**
	 * Initial tax inclusive 当初内税.<p>
	 *
	 */
	public void init_inc_tax_flg(boolean value) {
		setConstBoolean(offset + 201, $init_inc_tax_flg, value);
	}


	/**
	 * Initial tax rate 当初税率.<p>
	 *
	 */
	public MCNumber init_tax_rate() {
		return getConstNumber(offset + 202, $init_tax_rate);
	}

	/**
	 * Initial tax rate 当初税率.<p>
	 *
	 */
	public void init_tax_rate(MCNumber value) {
		setConstNumber(offset + 202, $init_tax_rate, value);
	}

	/**
	 * Initial tax rate 当初税率.<p>
	 *
	 */
	public void init_tax_rate(int value) {
		setConstNumber(offset + 202, $init_tax_rate, value);
	}

	/**
	 * Initial tax rate 当初税率.<p>
	 *
	 */
	public void init_tax_rate(long value) {
		setConstNumber(offset + 202, $init_tax_rate, value);
	}

	/**
	 * Initial tax rate 当初税率.<p>
	 *
	 */
	public void init_tax_rate(float value) {
		setConstNumber(offset + 202, $init_tax_rate, value);
	}

	/**
	 * Initial tax rate 当初税率.<p>
	 *
	 */
	public void init_tax_rate(double value) {
		setConstNumber(offset + 202, $init_tax_rate, value);
	}


	/**
	 * Initial discount amount (Transaction currency) 当初取引通貨値引額.<p>
	 *
	 */
	public MCNumber init_trd_cur_dscnt_amt() {
		return getConstNumber(offset + 203, $init_trd_cur_dscnt_amt);
	}

	/**
	 * Initial discount amount (Transaction currency) 当初取引通貨値引額.<p>
	 *
	 */
	public void init_trd_cur_dscnt_amt(MCNumber value) {
		setConstNumber(offset + 203, $init_trd_cur_dscnt_amt, value);
	}

	/**
	 * Initial discount amount (Transaction currency) 当初取引通貨値引額.<p>
	 *
	 */
	public void init_trd_cur_dscnt_amt(int value) {
		setConstNumber(offset + 203, $init_trd_cur_dscnt_amt, value);
	}

	/**
	 * Initial discount amount (Transaction currency) 当初取引通貨値引額.<p>
	 *
	 */
	public void init_trd_cur_dscnt_amt(long value) {
		setConstNumber(offset + 203, $init_trd_cur_dscnt_amt, value);
	}

	/**
	 * Initial discount amount (Transaction currency) 当初取引通貨値引額.<p>
	 *
	 */
	public void init_trd_cur_dscnt_amt(float value) {
		setConstNumber(offset + 203, $init_trd_cur_dscnt_amt, value);
	}

	/**
	 * Initial discount amount (Transaction currency) 当初取引通貨値引額.<p>
	 *
	 */
	public void init_trd_cur_dscnt_amt(double value) {
		setConstNumber(offset + 203, $init_trd_cur_dscnt_amt, value);
	}


	public String getString(String name) {
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
		if ($stk_mng_typ.equalsIgnoreCase(name)) {
			return stk_mng_typ();
		}
		if ($iv_itm_nm.equalsIgnoreCase(name)) {
			return iv_itm_nm();
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
		if ($cntry_cd.equalsIgnoreCase(name)) {
			return cntry_cd();
		}
		if ($cntry_nm.equalsIgnoreCase(name)) {
			return cntry_nm();
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
		if ($purc_act_no.equalsIgnoreCase(name)) {
			return purc_act_no();
		}
		if ($purc_act_d_no.equalsIgnoreCase(name)) {
			return purc_act_d_no();
		}
		if ($purc_ddlv_po_no.equalsIgnoreCase(name)) {
			return purc_ddlv_po_no();
		}
		if ($sppl_cd.equalsIgnoreCase(name)) {
			return sppl_cd();
		}
		if ($sppl_nm.equalsIgnoreCase(name)) {
			return sppl_nm();
		}
		if ($sppl_cntry_cd.equalsIgnoreCase(name)) {
			return sppl_cntry_cd();
		}
		if ($sppl_cntry_nm.equalsIgnoreCase(name)) {
			return sppl_cntry_nm();
		}
		if ($ret_nm.equalsIgnoreCase(name)) {
			return ret_nm();
		}
		if ($ret_zip_cd.equalsIgnoreCase(name)) {
			return ret_zip_cd();
		}
		if ($ret_addr1.equalsIgnoreCase(name)) {
			return ret_addr1();
		}
		if ($ret_addr2.equalsIgnoreCase(name)) {
			return ret_addr2();
		}
		if ($ret_addr3.equalsIgnoreCase(name)) {
			return ret_addr3();
		}
		if ($ret_addr4.equalsIgnoreCase(name)) {
			return ret_addr4();
		}
		if ($ret_cntct_dpt.equalsIgnoreCase(name)) {
			return ret_cntct_dpt();
		}
		if ($ret_cntct_psn.equalsIgnoreCase(name)) {
			return ret_cntct_psn();
		}
		if ($ret_cntct_psn_title.equalsIgnoreCase(name)) {
			return ret_cntct_psn_title();
		}
		if ($ret_tel.equalsIgnoreCase(name)) {
			return ret_tel();
		}
		if ($ret_fax.equalsIgnoreCase(name)) {
			return ret_fax();
		}
		if ($ret_usr_cd.equalsIgnoreCase(name)) {
			return ret_usr_cd();
		}
		if ($ret_usr_nm.equalsIgnoreCase(name)) {
			return ret_usr_nm();
		}
		if ($ret_dpt_cd.equalsIgnoreCase(name)) {
			return ret_dpt_cd();
		}
		if ($ret_dpt_nm.equalsIgnoreCase(name)) {
			return ret_dpt_nm();
		}
		if ($cntry_org_cd.equalsIgnoreCase(name)) {
			return cntry_org_cd();
		}
		if ($cntry_org_nm.equalsIgnoreCase(name)) {
			return cntry_org_nm();
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
		if ($dscnt_rsn_cd.equalsIgnoreCase(name)) {
			return dscnt_rsn_cd();
		}
		if ($dscnt_rsn_nm.equalsIgnoreCase(name)) {
			return dscnt_rsn_nm();
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
		if ($gd_cd.equalsIgnoreCase(name)) {
			return gd_cd();
		}
		if ($gd_nm.equalsIgnoreCase(name)) {
			return gd_nm();
		}
		if ($loc_cd.equalsIgnoreCase(name)) {
			return loc_cd();
		}
		if ($loc_nm.equalsIgnoreCase(name)) {
			return loc_nm();
		}
		if ($str_ln_cd.equalsIgnoreCase(name)) {
			return str_ln_cd();
		}
		if ($str_ln_nm.equalsIgnoreCase(name)) {
			return str_ln_nm();
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
		if ($wrk_no.equalsIgnoreCase(name)) {
			return wrk_no();
		}
		if ($wrk_nm.equalsIgnoreCase(name)) {
			return wrk_nm();
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
		if ($ret_rsn_cd.equalsIgnoreCase(name)) {
			return ret_rsn_cd();
		}
		if ($ret_rsn_nm.equalsIgnoreCase(name)) {
			return ret_rsn_nm();
		}
		if ($bd_dpt_cd.equalsIgnoreCase(name)) {
			return bd_dpt_cd();
		}
		if ($bd_dpt_nm.equalsIgnoreCase(name)) {
			return bd_dpt_nm();
		}
		if ($purc_ret_rsn_cd.equalsIgnoreCase(name)) {
			return purc_ret_rsn_cd();
		}
		if ($purc_ret_rsn_nm.equalsIgnoreCase(name)) {
			return purc_ret_rsn_nm();
		}
		if ($ap_dpt_cd.equalsIgnoreCase(name)) {
			return ap_dpt_cd();
		}
		if ($ap_dpt_nm.equalsIgnoreCase(name)) {
			return ap_dpt_nm();
		}
		if ($asset_mng_typ.equalsIgnoreCase(name)) {
			return asset_mng_typ();
		}
		if ($arr_cnt_rmrks.equalsIgnoreCase(name)) {
			return arr_cnt_rmrks();
		}
		if ($trd_d_rmrks.equalsIgnoreCase(name)) {
			return trd_d_rmrks();
		}
		if ($intr_rmrks.equalsIgnoreCase(name)) {
			return intr_rmrks();
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
		if ($sls_act_d_no.equalsIgnoreCase(name)) {
			return sls_act_d_no();
		}
		if ($slo_no.equalsIgnoreCase(name)) {
			return slo_no();
		}
		if ($slo_d_no.equalsIgnoreCase(name)) {
			return slo_d_no();
		}
		if ($ref_sls_act_no.equalsIgnoreCase(name)) {
			return ref_sls_act_no();
		}
		if ($ref_sls_act_d_no.equalsIgnoreCase(name)) {
			return ref_sls_act_d_no();
		}
		if ($sls_ret_schd_d_no.equalsIgnoreCase(name)) {
			return sls_ret_schd_d_no();
		}
		if ($arr_act_no.equalsIgnoreCase(name)) {
			return arr_act_no();
		}
		if ($lot_mng_typ.equalsIgnoreCase(name)) {
			return lot_mng_typ();
		}
		if ($lot_no_typ.equalsIgnoreCase(name)) {
			return lot_no_typ();
		}
		if ($sublot_mng_typ.equalsIgnoreCase(name)) {
			return sublot_mng_typ();
		}
		if ($sublot_no_typ.equalsIgnoreCase(name)) {
			return sublot_no_typ();
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
		if ($trd_unit_rnd_typ.equalsIgnoreCase(name)) {
			return trd_unit_rnd_typ();
		}
		if ($base_unit_rnd_typ.equalsIgnoreCase(name)) {
			return base_unit_rnd_typ();
		}
		if ($site_cd.equalsIgnoreCase(name)) {
			return site_cd();
		}
		if ($sls_ret_schd_no.equalsIgnoreCase(name)) {
			return sls_ret_schd_no();
		}
		if ($arr_pr_no.equalsIgnoreCase(name)) {
			return arr_pr_no();
		}
		if ($io_schd_pr_no.equalsIgnoreCase(name)) {
			return io_schd_pr_no();
		}
		if ($comp_spec_typ.equalsIgnoreCase(name)) {
			return comp_spec_typ();
		}
		if ($schd_trd_unit_cd.equalsIgnoreCase(name)) {
			return schd_trd_unit_cd();
		}
		if ($schd_trd_unit_rnd_typ.equalsIgnoreCase(name)) {
			return schd_trd_unit_rnd_typ();
		}
		if ($prnt_lcl_cd.equalsIgnoreCase(name)) {
			return prnt_lcl_cd();
		}
		if ($purc_ret_act_no.equalsIgnoreCase(name)) {
			return purc_ret_act_no();
		}
		if ($purc_ret_act_d_no.equalsIgnoreCase(name)) {
			return purc_ret_act_d_no();
		}
		if ($schd_no.equalsIgnoreCase(name)) {
			return schd_no();
		}
		if ($new_tax_cd.equalsIgnoreCase(name)) {
			return new_tax_cd();
		}
		if ($new_tax_nm.equalsIgnoreCase(name)) {
			return new_tax_nm();
		}
		if ($new_tax_typ.equalsIgnoreCase(name)) {
			return new_tax_typ();
		}
		if ($init_trd_unit_cd.equalsIgnoreCase(name)) {
			return init_trd_unit_cd();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($purc_act_rev.equalsIgnoreCase(name)) {
			return purc_act_rev();
		}
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			return trd_unit_qty();
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			return base_unit_qty();
		}
		if ($schd_qty.equalsIgnoreCase(name)) {
			return schd_qty();
		}
		if ($arr_qty.equalsIgnoreCase(name)) {
			return arr_qty();
		}
		if ($sls_ret_qty.equalsIgnoreCase(name)) {
			return sls_ret_qty();
		}
		if ($abort_qty.equalsIgnoreCase(name)) {
			return abort_qty();
		}
		if ($trd_cur_upri.equalsIgnoreCase(name)) {
			return trd_cur_upri();
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			return trd_cur_amt();
		}
		if ($trd_cur_inc_tax_amt.equalsIgnoreCase(name)) {
			return trd_cur_inc_tax_amt();
		}
		if ($trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			return trd_cur_dscnt_amt();
		}
		if ($cost_upri.equalsIgnoreCase(name)) {
			return cost_upri();
		}
		if ($cost_amt.equalsIgnoreCase(name)) {
			return cost_amt();
		}
		if ($prof_rate.equalsIgnoreCase(name)) {
			return prof_rate();
		}
		if ($tax_rate.equalsIgnoreCase(name)) {
			return tax_rate();
		}
		if ($trd_cur_tax_amt.equalsIgnoreCase(name)) {
			return trd_cur_tax_amt();
		}
		if ($base_cur_upri.equalsIgnoreCase(name)) {
			return base_cur_upri();
		}
		if ($base_cur_amt.equalsIgnoreCase(name)) {
			return base_cur_amt();
		}
		if ($base_cur_inc_tax_amt.equalsIgnoreCase(name)) {
			return base_cur_inc_tax_amt();
		}
		if ($base_cur_tax_amt.equalsIgnoreCase(name)) {
			return base_cur_tax_amt();
		}
		if ($base_cur_dscnt_amt.equalsIgnoreCase(name)) {
			return base_cur_dscnt_amt();
		}
		if ($ptax_cur_upri.equalsIgnoreCase(name)) {
			return ptax_cur_upri();
		}
		if ($ptax_cur_amt.equalsIgnoreCase(name)) {
			return ptax_cur_amt();
		}
		if ($ptax_cur_inc_tax_amt.equalsIgnoreCase(name)) {
			return ptax_cur_inc_tax_amt();
		}
		if ($ptax_cur_tax_amt.equalsIgnoreCase(name)) {
			return ptax_cur_tax_amt();
		}
		if ($ptax_cur_dscnt_amt.equalsIgnoreCase(name)) {
			return ptax_cur_dscnt_amt();
		}
		if ($bill_crryovr_times.equalsIgnoreCase(name)) {
			return bill_crryovr_times();
		}
		if ($wtax_rate.equalsIgnoreCase(name)) {
			return wtax_rate();
		}
		if ($wtax_amt.equalsIgnoreCase(name)) {
			return wtax_amt();
		}
		if ($sls_act_d_seq.equalsIgnoreCase(name)) {
			return sls_act_d_seq();
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			return disp_seq();
		}
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			return trd_unit_dec_place();
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
		if ($ref_sls_act_seq.equalsIgnoreCase(name)) {
			return ref_sls_act_seq();
		}
		if ($ref_sls_act_d_seq.equalsIgnoreCase(name)) {
			return ref_sls_act_d_seq();
		}
		if ($schd_trd_unit_qty.equalsIgnoreCase(name)) {
			return schd_trd_unit_qty();
		}
		if ($schd_trd_unit_dec_place.equalsIgnoreCase(name)) {
			return schd_trd_unit_dec_place();
		}
		if ($schd_trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			return schd_trd_unit_conv_base_qty();
		}
		if ($schd_trd_unit_conv_qty.equalsIgnoreCase(name)) {
			return schd_trd_unit_conv_qty();
		}
		if ($dtl_row_id.equalsIgnoreCase(name)) {
			return dtl_row_id();
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			return peg_no();
		}
		if ($itm_bill_crryovr_times.equalsIgnoreCase(name)) {
			return itm_bill_crryovr_times();
		}
		if ($init_schd_qty.equalsIgnoreCase(name)) {
			return init_schd_qty();
		}
		if ($init_schd_dscnt_amt.equalsIgnoreCase(name)) {
			return init_schd_dscnt_amt();
		}
		if ($purc_ret_act_rev.equalsIgnoreCase(name)) {
			return purc_ret_act_rev();
		}
		if ($init_schd_amt.equalsIgnoreCase(name)) {
			return init_schd_amt();
		}
		if ($schd_tax_rate.equalsIgnoreCase(name)) {
			return schd_tax_rate();
		}
		if ($new_tax_rate.equalsIgnoreCase(name)) {
			return new_tax_rate();
		}
		if ($init_trd_cur_tax_amt.equalsIgnoreCase(name)) {
			return init_trd_cur_tax_amt();
		}
		if ($init_trd_unit_qty.equalsIgnoreCase(name)) {
			return init_trd_unit_qty();
		}
		if ($init_trd_cur_upri.equalsIgnoreCase(name)) {
			return init_trd_cur_upri();
		}
		if ($init_tax_rate.equalsIgnoreCase(name)) {
			return init_tax_rate();
		}
		if ($init_trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			return init_trd_cur_dscnt_amt();
		}
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		if ($pay_schd_dt.equalsIgnoreCase(name)) {
			return pay_schd_dt();
		}
		if ($base_sls_ac_dt.equalsIgnoreCase(name)) {
			return base_sls_ac_dt();
		}
		if ($base_purc_ac_dt.equalsIgnoreCase(name)) {
			return base_purc_ac_dt();
		}
		return super.getDate(name);
	}
	public boolean getBoolean(String name) {
		if ($sundry_itm_flg.equalsIgnoreCase(name)) {
			return sundry_itm_flg();
		}
		if ($pri_prnt_flg.equalsIgnoreCase(name)) {
			return pri_prnt_flg();
		}
		if ($upri_not_tgt_flg.equalsIgnoreCase(name)) {
			return upri_not_tgt_flg();
		}
		if ($interim_flg.equalsIgnoreCase(name)) {
			return interim_flg();
		}
		if ($tax_fix_flg.equalsIgnoreCase(name)) {
			return tax_fix_flg();
		}
		if ($str_ln_cd_none_flg.equalsIgnoreCase(name)) {
			return str_ln_cd_none_flg();
		}
		if ($ver_flg.equalsIgnoreCase(name)) {
			return ver_flg();
		}
		if ($vmi_flg.equalsIgnoreCase(name)) {
			return vmi_flg();
		}
		if ($sppl_iv_flg.equalsIgnoreCase(name)) {
			return sppl_iv_flg();
		}
		if ($pay_spot_flg.equalsIgnoreCase(name)) {
			return pay_spot_flg();
		}
		if ($str_ln_tgt_flg.equalsIgnoreCase(name)) {
			return str_ln_tgt_flg();
		}
		if ($inc_tax_flg.equalsIgnoreCase(name)) {
			return inc_tax_flg();
		}
		if ($dlv_sundry_flg.equalsIgnoreCase(name)) {
			return dlv_sundry_flg();
		}
		if ($sls_acxfr_flg.equalsIgnoreCase(name)) {
			return sls_acxfr_flg();
		}
		if ($dscnt_itm_flg.equalsIgnoreCase(name)) {
			return dscnt_itm_flg();
		}
		if ($init_abort_flg.equalsIgnoreCase(name)) {
			return init_abort_flg();
		}
		if ($itm_sls_upri_cng_flg.equalsIgnoreCase(name)) {
			return itm_sls_upri_cng_flg();
		}
		if ($schd_inc_tax_flg.equalsIgnoreCase(name)) {
			return schd_inc_tax_flg();
		}
		if ($sls_cststk_flg.equalsIgnoreCase(name)) {
			return sls_cststk_flg();
		}
		if ($new_inc_tax_flg.equalsIgnoreCase(name)) {
			return new_inc_tax_flg();
		}
		if ($sls_dtl_upd_flg.equalsIgnoreCase(name)) {
			return sls_dtl_upd_flg();
		}
		if ($init_inc_tax_flg.equalsIgnoreCase(name)) {
			return init_inc_tax_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
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
		if ($stk_mng_typ.equalsIgnoreCase(name)) {
			return stk_mng_typ();
		}
		if ($iv_itm_nm.equalsIgnoreCase(name)) {
			return iv_itm_nm();
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
		if ($cntry_cd.equalsIgnoreCase(name)) {
			return cntry_cd();
		}
		if ($cntry_nm.equalsIgnoreCase(name)) {
			return cntry_nm();
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
		if ($purc_act_no.equalsIgnoreCase(name)) {
			return purc_act_no();
		}
		if ($purc_act_d_no.equalsIgnoreCase(name)) {
			return purc_act_d_no();
		}
		if ($purc_ddlv_po_no.equalsIgnoreCase(name)) {
			return purc_ddlv_po_no();
		}
		if ($sppl_cd.equalsIgnoreCase(name)) {
			return sppl_cd();
		}
		if ($sppl_nm.equalsIgnoreCase(name)) {
			return sppl_nm();
		}
		if ($sppl_cntry_cd.equalsIgnoreCase(name)) {
			return sppl_cntry_cd();
		}
		if ($sppl_cntry_nm.equalsIgnoreCase(name)) {
			return sppl_cntry_nm();
		}
		if ($ret_nm.equalsIgnoreCase(name)) {
			return ret_nm();
		}
		if ($ret_zip_cd.equalsIgnoreCase(name)) {
			return ret_zip_cd();
		}
		if ($ret_addr1.equalsIgnoreCase(name)) {
			return ret_addr1();
		}
		if ($ret_addr2.equalsIgnoreCase(name)) {
			return ret_addr2();
		}
		if ($ret_addr3.equalsIgnoreCase(name)) {
			return ret_addr3();
		}
		if ($ret_addr4.equalsIgnoreCase(name)) {
			return ret_addr4();
		}
		if ($ret_cntct_dpt.equalsIgnoreCase(name)) {
			return ret_cntct_dpt();
		}
		if ($ret_cntct_psn.equalsIgnoreCase(name)) {
			return ret_cntct_psn();
		}
		if ($ret_cntct_psn_title.equalsIgnoreCase(name)) {
			return ret_cntct_psn_title();
		}
		if ($ret_tel.equalsIgnoreCase(name)) {
			return ret_tel();
		}
		if ($ret_fax.equalsIgnoreCase(name)) {
			return ret_fax();
		}
		if ($ret_usr_cd.equalsIgnoreCase(name)) {
			return ret_usr_cd();
		}
		if ($ret_usr_nm.equalsIgnoreCase(name)) {
			return ret_usr_nm();
		}
		if ($ret_dpt_cd.equalsIgnoreCase(name)) {
			return ret_dpt_cd();
		}
		if ($ret_dpt_nm.equalsIgnoreCase(name)) {
			return ret_dpt_nm();
		}
		if ($cntry_org_cd.equalsIgnoreCase(name)) {
			return cntry_org_cd();
		}
		if ($cntry_org_nm.equalsIgnoreCase(name)) {
			return cntry_org_nm();
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
		if ($dscnt_rsn_cd.equalsIgnoreCase(name)) {
			return dscnt_rsn_cd();
		}
		if ($dscnt_rsn_nm.equalsIgnoreCase(name)) {
			return dscnt_rsn_nm();
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
		if ($gd_cd.equalsIgnoreCase(name)) {
			return gd_cd();
		}
		if ($gd_nm.equalsIgnoreCase(name)) {
			return gd_nm();
		}
		if ($loc_cd.equalsIgnoreCase(name)) {
			return loc_cd();
		}
		if ($loc_nm.equalsIgnoreCase(name)) {
			return loc_nm();
		}
		if ($str_ln_cd.equalsIgnoreCase(name)) {
			return str_ln_cd();
		}
		if ($str_ln_nm.equalsIgnoreCase(name)) {
			return str_ln_nm();
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
		if ($wrk_no.equalsIgnoreCase(name)) {
			return wrk_no();
		}
		if ($wrk_nm.equalsIgnoreCase(name)) {
			return wrk_nm();
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
		if ($ret_rsn_cd.equalsIgnoreCase(name)) {
			return ret_rsn_cd();
		}
		if ($ret_rsn_nm.equalsIgnoreCase(name)) {
			return ret_rsn_nm();
		}
		if ($bd_dpt_cd.equalsIgnoreCase(name)) {
			return bd_dpt_cd();
		}
		if ($bd_dpt_nm.equalsIgnoreCase(name)) {
			return bd_dpt_nm();
		}
		if ($purc_ret_rsn_cd.equalsIgnoreCase(name)) {
			return purc_ret_rsn_cd();
		}
		if ($purc_ret_rsn_nm.equalsIgnoreCase(name)) {
			return purc_ret_rsn_nm();
		}
		if ($ap_dpt_cd.equalsIgnoreCase(name)) {
			return ap_dpt_cd();
		}
		if ($ap_dpt_nm.equalsIgnoreCase(name)) {
			return ap_dpt_nm();
		}
		if ($asset_mng_typ.equalsIgnoreCase(name)) {
			return asset_mng_typ();
		}
		if ($arr_cnt_rmrks.equalsIgnoreCase(name)) {
			return arr_cnt_rmrks();
		}
		if ($trd_d_rmrks.equalsIgnoreCase(name)) {
			return trd_d_rmrks();
		}
		if ($intr_rmrks.equalsIgnoreCase(name)) {
			return intr_rmrks();
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
		if ($sls_act_d_no.equalsIgnoreCase(name)) {
			return sls_act_d_no();
		}
		if ($slo_no.equalsIgnoreCase(name)) {
			return slo_no();
		}
		if ($slo_d_no.equalsIgnoreCase(name)) {
			return slo_d_no();
		}
		if ($ref_sls_act_no.equalsIgnoreCase(name)) {
			return ref_sls_act_no();
		}
		if ($ref_sls_act_d_no.equalsIgnoreCase(name)) {
			return ref_sls_act_d_no();
		}
		if ($sls_ret_schd_d_no.equalsIgnoreCase(name)) {
			return sls_ret_schd_d_no();
		}
		if ($arr_act_no.equalsIgnoreCase(name)) {
			return arr_act_no();
		}
		if ($lot_mng_typ.equalsIgnoreCase(name)) {
			return lot_mng_typ();
		}
		if ($lot_no_typ.equalsIgnoreCase(name)) {
			return lot_no_typ();
		}
		if ($sublot_mng_typ.equalsIgnoreCase(name)) {
			return sublot_mng_typ();
		}
		if ($sublot_no_typ.equalsIgnoreCase(name)) {
			return sublot_no_typ();
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
		if ($trd_unit_rnd_typ.equalsIgnoreCase(name)) {
			return trd_unit_rnd_typ();
		}
		if ($base_unit_rnd_typ.equalsIgnoreCase(name)) {
			return base_unit_rnd_typ();
		}
		if ($site_cd.equalsIgnoreCase(name)) {
			return site_cd();
		}
		if ($sls_ret_schd_no.equalsIgnoreCase(name)) {
			return sls_ret_schd_no();
		}
		if ($arr_pr_no.equalsIgnoreCase(name)) {
			return arr_pr_no();
		}
		if ($io_schd_pr_no.equalsIgnoreCase(name)) {
			return io_schd_pr_no();
		}
		if ($comp_spec_typ.equalsIgnoreCase(name)) {
			return comp_spec_typ();
		}
		if ($schd_trd_unit_cd.equalsIgnoreCase(name)) {
			return schd_trd_unit_cd();
		}
		if ($schd_trd_unit_rnd_typ.equalsIgnoreCase(name)) {
			return schd_trd_unit_rnd_typ();
		}
		if ($prnt_lcl_cd.equalsIgnoreCase(name)) {
			return prnt_lcl_cd();
		}
		if ($purc_ret_act_no.equalsIgnoreCase(name)) {
			return purc_ret_act_no();
		}
		if ($purc_ret_act_d_no.equalsIgnoreCase(name)) {
			return purc_ret_act_d_no();
		}
		if ($schd_no.equalsIgnoreCase(name)) {
			return schd_no();
		}
		if ($new_tax_cd.equalsIgnoreCase(name)) {
			return new_tax_cd();
		}
		if ($new_tax_nm.equalsIgnoreCase(name)) {
			return new_tax_nm();
		}
		if ($new_tax_typ.equalsIgnoreCase(name)) {
			return new_tax_typ();
		}
		if ($init_trd_unit_cd.equalsIgnoreCase(name)) {
			return init_trd_unit_cd();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($purc_act_rev.equalsIgnoreCase(name)) {
			return purc_act_rev();
		}
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			return trd_unit_qty();
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			return base_unit_qty();
		}
		if ($schd_qty.equalsIgnoreCase(name)) {
			return schd_qty();
		}
		if ($arr_qty.equalsIgnoreCase(name)) {
			return arr_qty();
		}
		if ($sls_ret_qty.equalsIgnoreCase(name)) {
			return sls_ret_qty();
		}
		if ($abort_qty.equalsIgnoreCase(name)) {
			return abort_qty();
		}
		if ($trd_cur_upri.equalsIgnoreCase(name)) {
			return trd_cur_upri();
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			return trd_cur_amt();
		}
		if ($trd_cur_inc_tax_amt.equalsIgnoreCase(name)) {
			return trd_cur_inc_tax_amt();
		}
		if ($trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			return trd_cur_dscnt_amt();
		}
		if ($cost_upri.equalsIgnoreCase(name)) {
			return cost_upri();
		}
		if ($cost_amt.equalsIgnoreCase(name)) {
			return cost_amt();
		}
		if ($prof_rate.equalsIgnoreCase(name)) {
			return prof_rate();
		}
		if ($tax_rate.equalsIgnoreCase(name)) {
			return tax_rate();
		}
		if ($trd_cur_tax_amt.equalsIgnoreCase(name)) {
			return trd_cur_tax_amt();
		}
		if ($base_cur_upri.equalsIgnoreCase(name)) {
			return base_cur_upri();
		}
		if ($base_cur_amt.equalsIgnoreCase(name)) {
			return base_cur_amt();
		}
		if ($base_cur_inc_tax_amt.equalsIgnoreCase(name)) {
			return base_cur_inc_tax_amt();
		}
		if ($base_cur_tax_amt.equalsIgnoreCase(name)) {
			return base_cur_tax_amt();
		}
		if ($base_cur_dscnt_amt.equalsIgnoreCase(name)) {
			return base_cur_dscnt_amt();
		}
		if ($ptax_cur_upri.equalsIgnoreCase(name)) {
			return ptax_cur_upri();
		}
		if ($ptax_cur_amt.equalsIgnoreCase(name)) {
			return ptax_cur_amt();
		}
		if ($ptax_cur_inc_tax_amt.equalsIgnoreCase(name)) {
			return ptax_cur_inc_tax_amt();
		}
		if ($ptax_cur_tax_amt.equalsIgnoreCase(name)) {
			return ptax_cur_tax_amt();
		}
		if ($ptax_cur_dscnt_amt.equalsIgnoreCase(name)) {
			return ptax_cur_dscnt_amt();
		}
		if ($bill_crryovr_times.equalsIgnoreCase(name)) {
			return bill_crryovr_times();
		}
		if ($wtax_rate.equalsIgnoreCase(name)) {
			return wtax_rate();
		}
		if ($wtax_amt.equalsIgnoreCase(name)) {
			return wtax_amt();
		}
		if ($sls_act_d_seq.equalsIgnoreCase(name)) {
			return sls_act_d_seq();
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			return disp_seq();
		}
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			return trd_unit_dec_place();
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
		if ($ref_sls_act_seq.equalsIgnoreCase(name)) {
			return ref_sls_act_seq();
		}
		if ($ref_sls_act_d_seq.equalsIgnoreCase(name)) {
			return ref_sls_act_d_seq();
		}
		if ($schd_trd_unit_qty.equalsIgnoreCase(name)) {
			return schd_trd_unit_qty();
		}
		if ($schd_trd_unit_dec_place.equalsIgnoreCase(name)) {
			return schd_trd_unit_dec_place();
		}
		if ($schd_trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			return schd_trd_unit_conv_base_qty();
		}
		if ($schd_trd_unit_conv_qty.equalsIgnoreCase(name)) {
			return schd_trd_unit_conv_qty();
		}
		if ($dtl_row_id.equalsIgnoreCase(name)) {
			return dtl_row_id();
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			return peg_no();
		}
		if ($itm_bill_crryovr_times.equalsIgnoreCase(name)) {
			return itm_bill_crryovr_times();
		}
		if ($init_schd_qty.equalsIgnoreCase(name)) {
			return init_schd_qty();
		}
		if ($init_schd_dscnt_amt.equalsIgnoreCase(name)) {
			return init_schd_dscnt_amt();
		}
		if ($purc_ret_act_rev.equalsIgnoreCase(name)) {
			return purc_ret_act_rev();
		}
		if ($init_schd_amt.equalsIgnoreCase(name)) {
			return init_schd_amt();
		}
		if ($schd_tax_rate.equalsIgnoreCase(name)) {
			return schd_tax_rate();
		}
		if ($new_tax_rate.equalsIgnoreCase(name)) {
			return new_tax_rate();
		}
		if ($init_trd_cur_tax_amt.equalsIgnoreCase(name)) {
			return init_trd_cur_tax_amt();
		}
		if ($init_trd_unit_qty.equalsIgnoreCase(name)) {
			return init_trd_unit_qty();
		}
		if ($init_trd_cur_upri.equalsIgnoreCase(name)) {
			return init_trd_cur_upri();
		}
		if ($init_tax_rate.equalsIgnoreCase(name)) {
			return init_tax_rate();
		}
		if ($init_trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			return init_trd_cur_dscnt_amt();
		}
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($pay_schd_dt.equalsIgnoreCase(name)) {
			return pay_schd_dt();
		}
		if ($base_sls_ac_dt.equalsIgnoreCase(name)) {
			return base_sls_ac_dt();
		}
		if ($base_purc_ac_dt.equalsIgnoreCase(name)) {
			return base_purc_ac_dt();
		}
		return super.getDateNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($sundry_itm_flg.equalsIgnoreCase(name)) {
			return sundry_itm_flg();
		}
		if ($pri_prnt_flg.equalsIgnoreCase(name)) {
			return pri_prnt_flg();
		}
		if ($upri_not_tgt_flg.equalsIgnoreCase(name)) {
			return upri_not_tgt_flg();
		}
		if ($interim_flg.equalsIgnoreCase(name)) {
			return interim_flg();
		}
		if ($tax_fix_flg.equalsIgnoreCase(name)) {
			return tax_fix_flg();
		}
		if ($str_ln_cd_none_flg.equalsIgnoreCase(name)) {
			return str_ln_cd_none_flg();
		}
		if ($ver_flg.equalsIgnoreCase(name)) {
			return ver_flg();
		}
		if ($vmi_flg.equalsIgnoreCase(name)) {
			return vmi_flg();
		}
		if ($sppl_iv_flg.equalsIgnoreCase(name)) {
			return sppl_iv_flg();
		}
		if ($pay_spot_flg.equalsIgnoreCase(name)) {
			return pay_spot_flg();
		}
		if ($str_ln_tgt_flg.equalsIgnoreCase(name)) {
			return str_ln_tgt_flg();
		}
		if ($inc_tax_flg.equalsIgnoreCase(name)) {
			return inc_tax_flg();
		}
		if ($dlv_sundry_flg.equalsIgnoreCase(name)) {
			return dlv_sundry_flg();
		}
		if ($sls_acxfr_flg.equalsIgnoreCase(name)) {
			return sls_acxfr_flg();
		}
		if ($dscnt_itm_flg.equalsIgnoreCase(name)) {
			return dscnt_itm_flg();
		}
		if ($init_abort_flg.equalsIgnoreCase(name)) {
			return init_abort_flg();
		}
		if ($itm_sls_upri_cng_flg.equalsIgnoreCase(name)) {
			return itm_sls_upri_cng_flg();
		}
		if ($schd_inc_tax_flg.equalsIgnoreCase(name)) {
			return schd_inc_tax_flg();
		}
		if ($sls_cststk_flg.equalsIgnoreCase(name)) {
			return sls_cststk_flg();
		}
		if ($new_inc_tax_flg.equalsIgnoreCase(name)) {
			return new_inc_tax_flg();
		}
		if ($sls_dtl_upd_flg.equalsIgnoreCase(name)) {
			return sls_dtl_upd_flg();
		}
		if ($init_inc_tax_flg.equalsIgnoreCase(name)) {
			return init_inc_tax_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
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
		if ($stk_mng_typ.equalsIgnoreCase(name)) {
			stk_mng_typ(value);
			return;
		}
		if ($iv_itm_nm.equalsIgnoreCase(name)) {
			iv_itm_nm(value);
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
		if ($cntry_cd.equalsIgnoreCase(name)) {
			cntry_cd(value);
			return;
		}
		if ($cntry_nm.equalsIgnoreCase(name)) {
			cntry_nm(value);
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
		if ($purc_act_no.equalsIgnoreCase(name)) {
			purc_act_no(value);
			return;
		}
		if ($purc_act_d_no.equalsIgnoreCase(name)) {
			purc_act_d_no(value);
			return;
		}
		if ($purc_ddlv_po_no.equalsIgnoreCase(name)) {
			purc_ddlv_po_no(value);
			return;
		}
		if ($sppl_cd.equalsIgnoreCase(name)) {
			sppl_cd(value);
			return;
		}
		if ($sppl_nm.equalsIgnoreCase(name)) {
			sppl_nm(value);
			return;
		}
		if ($sppl_cntry_cd.equalsIgnoreCase(name)) {
			sppl_cntry_cd(value);
			return;
		}
		if ($sppl_cntry_nm.equalsIgnoreCase(name)) {
			sppl_cntry_nm(value);
			return;
		}
		if ($ret_nm.equalsIgnoreCase(name)) {
			ret_nm(value);
			return;
		}
		if ($ret_zip_cd.equalsIgnoreCase(name)) {
			ret_zip_cd(value);
			return;
		}
		if ($ret_addr1.equalsIgnoreCase(name)) {
			ret_addr1(value);
			return;
		}
		if ($ret_addr2.equalsIgnoreCase(name)) {
			ret_addr2(value);
			return;
		}
		if ($ret_addr3.equalsIgnoreCase(name)) {
			ret_addr3(value);
			return;
		}
		if ($ret_addr4.equalsIgnoreCase(name)) {
			ret_addr4(value);
			return;
		}
		if ($ret_cntct_dpt.equalsIgnoreCase(name)) {
			ret_cntct_dpt(value);
			return;
		}
		if ($ret_cntct_psn.equalsIgnoreCase(name)) {
			ret_cntct_psn(value);
			return;
		}
		if ($ret_cntct_psn_title.equalsIgnoreCase(name)) {
			ret_cntct_psn_title(value);
			return;
		}
		if ($ret_tel.equalsIgnoreCase(name)) {
			ret_tel(value);
			return;
		}
		if ($ret_fax.equalsIgnoreCase(name)) {
			ret_fax(value);
			return;
		}
		if ($ret_usr_cd.equalsIgnoreCase(name)) {
			ret_usr_cd(value);
			return;
		}
		if ($ret_usr_nm.equalsIgnoreCase(name)) {
			ret_usr_nm(value);
			return;
		}
		if ($ret_dpt_cd.equalsIgnoreCase(name)) {
			ret_dpt_cd(value);
			return;
		}
		if ($ret_dpt_nm.equalsIgnoreCase(name)) {
			ret_dpt_nm(value);
			return;
		}
		if ($cntry_org_cd.equalsIgnoreCase(name)) {
			cntry_org_cd(value);
			return;
		}
		if ($cntry_org_nm.equalsIgnoreCase(name)) {
			cntry_org_nm(value);
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
		if ($dscnt_rsn_cd.equalsIgnoreCase(name)) {
			dscnt_rsn_cd(value);
			return;
		}
		if ($dscnt_rsn_nm.equalsIgnoreCase(name)) {
			dscnt_rsn_nm(value);
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
		if ($gd_cd.equalsIgnoreCase(name)) {
			gd_cd(value);
			return;
		}
		if ($gd_nm.equalsIgnoreCase(name)) {
			gd_nm(value);
			return;
		}
		if ($loc_cd.equalsIgnoreCase(name)) {
			loc_cd(value);
			return;
		}
		if ($loc_nm.equalsIgnoreCase(name)) {
			loc_nm(value);
			return;
		}
		if ($str_ln_cd.equalsIgnoreCase(name)) {
			str_ln_cd(value);
			return;
		}
		if ($str_ln_nm.equalsIgnoreCase(name)) {
			str_ln_nm(value);
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
		if ($wrk_no.equalsIgnoreCase(name)) {
			wrk_no(value);
			return;
		}
		if ($wrk_nm.equalsIgnoreCase(name)) {
			wrk_nm(value);
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
		if ($ret_rsn_cd.equalsIgnoreCase(name)) {
			ret_rsn_cd(value);
			return;
		}
		if ($ret_rsn_nm.equalsIgnoreCase(name)) {
			ret_rsn_nm(value);
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
		if ($purc_ret_rsn_cd.equalsIgnoreCase(name)) {
			purc_ret_rsn_cd(value);
			return;
		}
		if ($purc_ret_rsn_nm.equalsIgnoreCase(name)) {
			purc_ret_rsn_nm(value);
			return;
		}
		if ($ap_dpt_cd.equalsIgnoreCase(name)) {
			ap_dpt_cd(value);
			return;
		}
		if ($ap_dpt_nm.equalsIgnoreCase(name)) {
			ap_dpt_nm(value);
			return;
		}
		if ($asset_mng_typ.equalsIgnoreCase(name)) {
			asset_mng_typ(value);
			return;
		}
		if ($arr_cnt_rmrks.equalsIgnoreCase(name)) {
			arr_cnt_rmrks(value);
			return;
		}
		if ($trd_d_rmrks.equalsIgnoreCase(name)) {
			trd_d_rmrks(value);
			return;
		}
		if ($intr_rmrks.equalsIgnoreCase(name)) {
			intr_rmrks(value);
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
		if ($sls_act_d_no.equalsIgnoreCase(name)) {
			sls_act_d_no(value);
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
		if ($ref_sls_act_no.equalsIgnoreCase(name)) {
			ref_sls_act_no(value);
			return;
		}
		if ($ref_sls_act_d_no.equalsIgnoreCase(name)) {
			ref_sls_act_d_no(value);
			return;
		}
		if ($sls_ret_schd_d_no.equalsIgnoreCase(name)) {
			sls_ret_schd_d_no(value);
			return;
		}
		if ($arr_act_no.equalsIgnoreCase(name)) {
			arr_act_no(value);
			return;
		}
		if ($lot_mng_typ.equalsIgnoreCase(name)) {
			lot_mng_typ(value);
			return;
		}
		if ($lot_no_typ.equalsIgnoreCase(name)) {
			lot_no_typ(value);
			return;
		}
		if ($sublot_mng_typ.equalsIgnoreCase(name)) {
			sublot_mng_typ(value);
			return;
		}
		if ($sublot_no_typ.equalsIgnoreCase(name)) {
			sublot_no_typ(value);
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
		if ($trd_unit_rnd_typ.equalsIgnoreCase(name)) {
			trd_unit_rnd_typ(value);
			return;
		}
		if ($base_unit_rnd_typ.equalsIgnoreCase(name)) {
			base_unit_rnd_typ(value);
			return;
		}
		if ($site_cd.equalsIgnoreCase(name)) {
			site_cd(value);
			return;
		}
		if ($sls_ret_schd_no.equalsIgnoreCase(name)) {
			sls_ret_schd_no(value);
			return;
		}
		if ($arr_pr_no.equalsIgnoreCase(name)) {
			arr_pr_no(value);
			return;
		}
		if ($io_schd_pr_no.equalsIgnoreCase(name)) {
			io_schd_pr_no(value);
			return;
		}
		if ($comp_spec_typ.equalsIgnoreCase(name)) {
			comp_spec_typ(value);
			return;
		}
		if ($schd_trd_unit_cd.equalsIgnoreCase(name)) {
			schd_trd_unit_cd(value);
			return;
		}
		if ($schd_trd_unit_rnd_typ.equalsIgnoreCase(name)) {
			schd_trd_unit_rnd_typ(value);
			return;
		}
		if ($prnt_lcl_cd.equalsIgnoreCase(name)) {
			prnt_lcl_cd(value);
			return;
		}
		if ($purc_ret_act_no.equalsIgnoreCase(name)) {
			purc_ret_act_no(value);
			return;
		}
		if ($purc_ret_act_d_no.equalsIgnoreCase(name)) {
			purc_ret_act_d_no(value);
			return;
		}
		if ($schd_no.equalsIgnoreCase(name)) {
			schd_no(value);
			return;
		}
		if ($new_tax_cd.equalsIgnoreCase(name)) {
			new_tax_cd(value);
			return;
		}
		if ($new_tax_nm.equalsIgnoreCase(name)) {
			new_tax_nm(value);
			return;
		}
		if ($new_tax_typ.equalsIgnoreCase(name)) {
			new_tax_typ(value);
			return;
		}
		if ($init_trd_unit_cd.equalsIgnoreCase(name)) {
			init_trd_unit_cd(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($purc_act_rev.equalsIgnoreCase(name)) {
			purc_act_rev(value);
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
		if ($schd_qty.equalsIgnoreCase(name)) {
			schd_qty(value);
			return;
		}
		if ($arr_qty.equalsIgnoreCase(name)) {
			arr_qty(value);
			return;
		}
		if ($sls_ret_qty.equalsIgnoreCase(name)) {
			sls_ret_qty(value);
			return;
		}
		if ($abort_qty.equalsIgnoreCase(name)) {
			abort_qty(value);
			return;
		}
		if ($trd_cur_upri.equalsIgnoreCase(name)) {
			trd_cur_upri(value);
			return;
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
			return;
		}
		if ($trd_cur_inc_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_inc_tax_amt(value);
			return;
		}
		if ($trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			trd_cur_dscnt_amt(value);
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
		if ($prof_rate.equalsIgnoreCase(name)) {
			prof_rate(value);
			return;
		}
		if ($tax_rate.equalsIgnoreCase(name)) {
			tax_rate(value);
			return;
		}
		if ($trd_cur_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_tax_amt(value);
			return;
		}
		if ($base_cur_upri.equalsIgnoreCase(name)) {
			base_cur_upri(value);
			return;
		}
		if ($base_cur_amt.equalsIgnoreCase(name)) {
			base_cur_amt(value);
			return;
		}
		if ($base_cur_inc_tax_amt.equalsIgnoreCase(name)) {
			base_cur_inc_tax_amt(value);
			return;
		}
		if ($base_cur_tax_amt.equalsIgnoreCase(name)) {
			base_cur_tax_amt(value);
			return;
		}
		if ($base_cur_dscnt_amt.equalsIgnoreCase(name)) {
			base_cur_dscnt_amt(value);
			return;
		}
		if ($ptax_cur_upri.equalsIgnoreCase(name)) {
			ptax_cur_upri(value);
			return;
		}
		if ($ptax_cur_amt.equalsIgnoreCase(name)) {
			ptax_cur_amt(value);
			return;
		}
		if ($ptax_cur_inc_tax_amt.equalsIgnoreCase(name)) {
			ptax_cur_inc_tax_amt(value);
			return;
		}
		if ($ptax_cur_tax_amt.equalsIgnoreCase(name)) {
			ptax_cur_tax_amt(value);
			return;
		}
		if ($ptax_cur_dscnt_amt.equalsIgnoreCase(name)) {
			ptax_cur_dscnt_amt(value);
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
		if ($wtax_amt.equalsIgnoreCase(name)) {
			wtax_amt(value);
			return;
		}
		if ($sls_act_d_seq.equalsIgnoreCase(name)) {
			sls_act_d_seq(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			trd_unit_dec_place(value);
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
		if ($ref_sls_act_seq.equalsIgnoreCase(name)) {
			ref_sls_act_seq(value);
			return;
		}
		if ($ref_sls_act_d_seq.equalsIgnoreCase(name)) {
			ref_sls_act_d_seq(value);
			return;
		}
		if ($schd_trd_unit_qty.equalsIgnoreCase(name)) {
			schd_trd_unit_qty(value);
			return;
		}
		if ($schd_trd_unit_dec_place.equalsIgnoreCase(name)) {
			schd_trd_unit_dec_place(value);
			return;
		}
		if ($schd_trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			schd_trd_unit_conv_base_qty(value);
			return;
		}
		if ($schd_trd_unit_conv_qty.equalsIgnoreCase(name)) {
			schd_trd_unit_conv_qty(value);
			return;
		}
		if ($dtl_row_id.equalsIgnoreCase(name)) {
			dtl_row_id(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($itm_bill_crryovr_times.equalsIgnoreCase(name)) {
			itm_bill_crryovr_times(value);
			return;
		}
		if ($init_schd_qty.equalsIgnoreCase(name)) {
			init_schd_qty(value);
			return;
		}
		if ($init_schd_dscnt_amt.equalsIgnoreCase(name)) {
			init_schd_dscnt_amt(value);
			return;
		}
		if ($purc_ret_act_rev.equalsIgnoreCase(name)) {
			purc_ret_act_rev(value);
			return;
		}
		if ($init_schd_amt.equalsIgnoreCase(name)) {
			init_schd_amt(value);
			return;
		}
		if ($schd_tax_rate.equalsIgnoreCase(name)) {
			schd_tax_rate(value);
			return;
		}
		if ($new_tax_rate.equalsIgnoreCase(name)) {
			new_tax_rate(value);
			return;
		}
		if ($init_trd_cur_tax_amt.equalsIgnoreCase(name)) {
			init_trd_cur_tax_amt(value);
			return;
		}
		if ($init_trd_unit_qty.equalsIgnoreCase(name)) {
			init_trd_unit_qty(value);
			return;
		}
		if ($init_trd_cur_upri.equalsIgnoreCase(name)) {
			init_trd_cur_upri(value);
			return;
		}
		if ($init_tax_rate.equalsIgnoreCase(name)) {
			init_tax_rate(value);
			return;
		}
		if ($init_trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			init_trd_cur_dscnt_amt(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($purc_act_rev.equalsIgnoreCase(name)) {
			purc_act_rev(value);
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
		if ($schd_qty.equalsIgnoreCase(name)) {
			schd_qty(value);
			return;
		}
		if ($arr_qty.equalsIgnoreCase(name)) {
			arr_qty(value);
			return;
		}
		if ($sls_ret_qty.equalsIgnoreCase(name)) {
			sls_ret_qty(value);
			return;
		}
		if ($abort_qty.equalsIgnoreCase(name)) {
			abort_qty(value);
			return;
		}
		if ($trd_cur_upri.equalsIgnoreCase(name)) {
			trd_cur_upri(value);
			return;
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
			return;
		}
		if ($trd_cur_inc_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_inc_tax_amt(value);
			return;
		}
		if ($trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			trd_cur_dscnt_amt(value);
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
		if ($prof_rate.equalsIgnoreCase(name)) {
			prof_rate(value);
			return;
		}
		if ($tax_rate.equalsIgnoreCase(name)) {
			tax_rate(value);
			return;
		}
		if ($trd_cur_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_tax_amt(value);
			return;
		}
		if ($base_cur_upri.equalsIgnoreCase(name)) {
			base_cur_upri(value);
			return;
		}
		if ($base_cur_amt.equalsIgnoreCase(name)) {
			base_cur_amt(value);
			return;
		}
		if ($base_cur_inc_tax_amt.equalsIgnoreCase(name)) {
			base_cur_inc_tax_amt(value);
			return;
		}
		if ($base_cur_tax_amt.equalsIgnoreCase(name)) {
			base_cur_tax_amt(value);
			return;
		}
		if ($base_cur_dscnt_amt.equalsIgnoreCase(name)) {
			base_cur_dscnt_amt(value);
			return;
		}
		if ($ptax_cur_upri.equalsIgnoreCase(name)) {
			ptax_cur_upri(value);
			return;
		}
		if ($ptax_cur_amt.equalsIgnoreCase(name)) {
			ptax_cur_amt(value);
			return;
		}
		if ($ptax_cur_inc_tax_amt.equalsIgnoreCase(name)) {
			ptax_cur_inc_tax_amt(value);
			return;
		}
		if ($ptax_cur_tax_amt.equalsIgnoreCase(name)) {
			ptax_cur_tax_amt(value);
			return;
		}
		if ($ptax_cur_dscnt_amt.equalsIgnoreCase(name)) {
			ptax_cur_dscnt_amt(value);
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
		if ($wtax_amt.equalsIgnoreCase(name)) {
			wtax_amt(value);
			return;
		}
		if ($sls_act_d_seq.equalsIgnoreCase(name)) {
			sls_act_d_seq(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			trd_unit_dec_place(value);
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
		if ($ref_sls_act_seq.equalsIgnoreCase(name)) {
			ref_sls_act_seq(value);
			return;
		}
		if ($ref_sls_act_d_seq.equalsIgnoreCase(name)) {
			ref_sls_act_d_seq(value);
			return;
		}
		if ($schd_trd_unit_qty.equalsIgnoreCase(name)) {
			schd_trd_unit_qty(value);
			return;
		}
		if ($schd_trd_unit_dec_place.equalsIgnoreCase(name)) {
			schd_trd_unit_dec_place(value);
			return;
		}
		if ($schd_trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			schd_trd_unit_conv_base_qty(value);
			return;
		}
		if ($schd_trd_unit_conv_qty.equalsIgnoreCase(name)) {
			schd_trd_unit_conv_qty(value);
			return;
		}
		if ($dtl_row_id.equalsIgnoreCase(name)) {
			dtl_row_id(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($itm_bill_crryovr_times.equalsIgnoreCase(name)) {
			itm_bill_crryovr_times(value);
			return;
		}
		if ($init_schd_qty.equalsIgnoreCase(name)) {
			init_schd_qty(value);
			return;
		}
		if ($init_schd_dscnt_amt.equalsIgnoreCase(name)) {
			init_schd_dscnt_amt(value);
			return;
		}
		if ($purc_ret_act_rev.equalsIgnoreCase(name)) {
			purc_ret_act_rev(value);
			return;
		}
		if ($init_schd_amt.equalsIgnoreCase(name)) {
			init_schd_amt(value);
			return;
		}
		if ($schd_tax_rate.equalsIgnoreCase(name)) {
			schd_tax_rate(value);
			return;
		}
		if ($new_tax_rate.equalsIgnoreCase(name)) {
			new_tax_rate(value);
			return;
		}
		if ($init_trd_cur_tax_amt.equalsIgnoreCase(name)) {
			init_trd_cur_tax_amt(value);
			return;
		}
		if ($init_trd_unit_qty.equalsIgnoreCase(name)) {
			init_trd_unit_qty(value);
			return;
		}
		if ($init_trd_cur_upri.equalsIgnoreCase(name)) {
			init_trd_cur_upri(value);
			return;
		}
		if ($init_tax_rate.equalsIgnoreCase(name)) {
			init_tax_rate(value);
			return;
		}
		if ($init_trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			init_trd_cur_dscnt_amt(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($purc_act_rev.equalsIgnoreCase(name)) {
			purc_act_rev(value);
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
		if ($schd_qty.equalsIgnoreCase(name)) {
			schd_qty(value);
			return;
		}
		if ($arr_qty.equalsIgnoreCase(name)) {
			arr_qty(value);
			return;
		}
		if ($sls_ret_qty.equalsIgnoreCase(name)) {
			sls_ret_qty(value);
			return;
		}
		if ($abort_qty.equalsIgnoreCase(name)) {
			abort_qty(value);
			return;
		}
		if ($trd_cur_upri.equalsIgnoreCase(name)) {
			trd_cur_upri(value);
			return;
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
			return;
		}
		if ($trd_cur_inc_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_inc_tax_amt(value);
			return;
		}
		if ($trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			trd_cur_dscnt_amt(value);
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
		if ($prof_rate.equalsIgnoreCase(name)) {
			prof_rate(value);
			return;
		}
		if ($tax_rate.equalsIgnoreCase(name)) {
			tax_rate(value);
			return;
		}
		if ($trd_cur_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_tax_amt(value);
			return;
		}
		if ($base_cur_upri.equalsIgnoreCase(name)) {
			base_cur_upri(value);
			return;
		}
		if ($base_cur_amt.equalsIgnoreCase(name)) {
			base_cur_amt(value);
			return;
		}
		if ($base_cur_inc_tax_amt.equalsIgnoreCase(name)) {
			base_cur_inc_tax_amt(value);
			return;
		}
		if ($base_cur_tax_amt.equalsIgnoreCase(name)) {
			base_cur_tax_amt(value);
			return;
		}
		if ($base_cur_dscnt_amt.equalsIgnoreCase(name)) {
			base_cur_dscnt_amt(value);
			return;
		}
		if ($ptax_cur_upri.equalsIgnoreCase(name)) {
			ptax_cur_upri(value);
			return;
		}
		if ($ptax_cur_amt.equalsIgnoreCase(name)) {
			ptax_cur_amt(value);
			return;
		}
		if ($ptax_cur_inc_tax_amt.equalsIgnoreCase(name)) {
			ptax_cur_inc_tax_amt(value);
			return;
		}
		if ($ptax_cur_tax_amt.equalsIgnoreCase(name)) {
			ptax_cur_tax_amt(value);
			return;
		}
		if ($ptax_cur_dscnt_amt.equalsIgnoreCase(name)) {
			ptax_cur_dscnt_amt(value);
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
		if ($wtax_amt.equalsIgnoreCase(name)) {
			wtax_amt(value);
			return;
		}
		if ($sls_act_d_seq.equalsIgnoreCase(name)) {
			sls_act_d_seq(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			trd_unit_dec_place(value);
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
		if ($ref_sls_act_seq.equalsIgnoreCase(name)) {
			ref_sls_act_seq(value);
			return;
		}
		if ($ref_sls_act_d_seq.equalsIgnoreCase(name)) {
			ref_sls_act_d_seq(value);
			return;
		}
		if ($schd_trd_unit_qty.equalsIgnoreCase(name)) {
			schd_trd_unit_qty(value);
			return;
		}
		if ($schd_trd_unit_dec_place.equalsIgnoreCase(name)) {
			schd_trd_unit_dec_place(value);
			return;
		}
		if ($schd_trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			schd_trd_unit_conv_base_qty(value);
			return;
		}
		if ($schd_trd_unit_conv_qty.equalsIgnoreCase(name)) {
			schd_trd_unit_conv_qty(value);
			return;
		}
		if ($dtl_row_id.equalsIgnoreCase(name)) {
			dtl_row_id(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($itm_bill_crryovr_times.equalsIgnoreCase(name)) {
			itm_bill_crryovr_times(value);
			return;
		}
		if ($init_schd_qty.equalsIgnoreCase(name)) {
			init_schd_qty(value);
			return;
		}
		if ($init_schd_dscnt_amt.equalsIgnoreCase(name)) {
			init_schd_dscnt_amt(value);
			return;
		}
		if ($purc_ret_act_rev.equalsIgnoreCase(name)) {
			purc_ret_act_rev(value);
			return;
		}
		if ($init_schd_amt.equalsIgnoreCase(name)) {
			init_schd_amt(value);
			return;
		}
		if ($schd_tax_rate.equalsIgnoreCase(name)) {
			schd_tax_rate(value);
			return;
		}
		if ($new_tax_rate.equalsIgnoreCase(name)) {
			new_tax_rate(value);
			return;
		}
		if ($init_trd_cur_tax_amt.equalsIgnoreCase(name)) {
			init_trd_cur_tax_amt(value);
			return;
		}
		if ($init_trd_unit_qty.equalsIgnoreCase(name)) {
			init_trd_unit_qty(value);
			return;
		}
		if ($init_trd_cur_upri.equalsIgnoreCase(name)) {
			init_trd_cur_upri(value);
			return;
		}
		if ($init_tax_rate.equalsIgnoreCase(name)) {
			init_tax_rate(value);
			return;
		}
		if ($init_trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			init_trd_cur_dscnt_amt(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($purc_act_rev.equalsIgnoreCase(name)) {
			purc_act_rev(value);
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
		if ($schd_qty.equalsIgnoreCase(name)) {
			schd_qty(value);
			return;
		}
		if ($arr_qty.equalsIgnoreCase(name)) {
			arr_qty(value);
			return;
		}
		if ($sls_ret_qty.equalsIgnoreCase(name)) {
			sls_ret_qty(value);
			return;
		}
		if ($abort_qty.equalsIgnoreCase(name)) {
			abort_qty(value);
			return;
		}
		if ($trd_cur_upri.equalsIgnoreCase(name)) {
			trd_cur_upri(value);
			return;
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
			return;
		}
		if ($trd_cur_inc_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_inc_tax_amt(value);
			return;
		}
		if ($trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			trd_cur_dscnt_amt(value);
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
		if ($prof_rate.equalsIgnoreCase(name)) {
			prof_rate(value);
			return;
		}
		if ($tax_rate.equalsIgnoreCase(name)) {
			tax_rate(value);
			return;
		}
		if ($trd_cur_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_tax_amt(value);
			return;
		}
		if ($base_cur_upri.equalsIgnoreCase(name)) {
			base_cur_upri(value);
			return;
		}
		if ($base_cur_amt.equalsIgnoreCase(name)) {
			base_cur_amt(value);
			return;
		}
		if ($base_cur_inc_tax_amt.equalsIgnoreCase(name)) {
			base_cur_inc_tax_amt(value);
			return;
		}
		if ($base_cur_tax_amt.equalsIgnoreCase(name)) {
			base_cur_tax_amt(value);
			return;
		}
		if ($base_cur_dscnt_amt.equalsIgnoreCase(name)) {
			base_cur_dscnt_amt(value);
			return;
		}
		if ($ptax_cur_upri.equalsIgnoreCase(name)) {
			ptax_cur_upri(value);
			return;
		}
		if ($ptax_cur_amt.equalsIgnoreCase(name)) {
			ptax_cur_amt(value);
			return;
		}
		if ($ptax_cur_inc_tax_amt.equalsIgnoreCase(name)) {
			ptax_cur_inc_tax_amt(value);
			return;
		}
		if ($ptax_cur_tax_amt.equalsIgnoreCase(name)) {
			ptax_cur_tax_amt(value);
			return;
		}
		if ($ptax_cur_dscnt_amt.equalsIgnoreCase(name)) {
			ptax_cur_dscnt_amt(value);
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
		if ($wtax_amt.equalsIgnoreCase(name)) {
			wtax_amt(value);
			return;
		}
		if ($sls_act_d_seq.equalsIgnoreCase(name)) {
			sls_act_d_seq(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			trd_unit_dec_place(value);
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
		if ($ref_sls_act_seq.equalsIgnoreCase(name)) {
			ref_sls_act_seq(value);
			return;
		}
		if ($ref_sls_act_d_seq.equalsIgnoreCase(name)) {
			ref_sls_act_d_seq(value);
			return;
		}
		if ($schd_trd_unit_qty.equalsIgnoreCase(name)) {
			schd_trd_unit_qty(value);
			return;
		}
		if ($schd_trd_unit_dec_place.equalsIgnoreCase(name)) {
			schd_trd_unit_dec_place(value);
			return;
		}
		if ($schd_trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			schd_trd_unit_conv_base_qty(value);
			return;
		}
		if ($schd_trd_unit_conv_qty.equalsIgnoreCase(name)) {
			schd_trd_unit_conv_qty(value);
			return;
		}
		if ($dtl_row_id.equalsIgnoreCase(name)) {
			dtl_row_id(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($itm_bill_crryovr_times.equalsIgnoreCase(name)) {
			itm_bill_crryovr_times(value);
			return;
		}
		if ($init_schd_qty.equalsIgnoreCase(name)) {
			init_schd_qty(value);
			return;
		}
		if ($init_schd_dscnt_amt.equalsIgnoreCase(name)) {
			init_schd_dscnt_amt(value);
			return;
		}
		if ($purc_ret_act_rev.equalsIgnoreCase(name)) {
			purc_ret_act_rev(value);
			return;
		}
		if ($init_schd_amt.equalsIgnoreCase(name)) {
			init_schd_amt(value);
			return;
		}
		if ($schd_tax_rate.equalsIgnoreCase(name)) {
			schd_tax_rate(value);
			return;
		}
		if ($new_tax_rate.equalsIgnoreCase(name)) {
			new_tax_rate(value);
			return;
		}
		if ($init_trd_cur_tax_amt.equalsIgnoreCase(name)) {
			init_trd_cur_tax_amt(value);
			return;
		}
		if ($init_trd_unit_qty.equalsIgnoreCase(name)) {
			init_trd_unit_qty(value);
			return;
		}
		if ($init_trd_cur_upri.equalsIgnoreCase(name)) {
			init_trd_cur_upri(value);
			return;
		}
		if ($init_tax_rate.equalsIgnoreCase(name)) {
			init_tax_rate(value);
			return;
		}
		if ($init_trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			init_trd_cur_dscnt_amt(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($purc_act_rev.equalsIgnoreCase(name)) {
			purc_act_rev(value);
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
		if ($schd_qty.equalsIgnoreCase(name)) {
			schd_qty(value);
			return;
		}
		if ($arr_qty.equalsIgnoreCase(name)) {
			arr_qty(value);
			return;
		}
		if ($sls_ret_qty.equalsIgnoreCase(name)) {
			sls_ret_qty(value);
			return;
		}
		if ($abort_qty.equalsIgnoreCase(name)) {
			abort_qty(value);
			return;
		}
		if ($trd_cur_upri.equalsIgnoreCase(name)) {
			trd_cur_upri(value);
			return;
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
			return;
		}
		if ($trd_cur_inc_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_inc_tax_amt(value);
			return;
		}
		if ($trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			trd_cur_dscnt_amt(value);
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
		if ($prof_rate.equalsIgnoreCase(name)) {
			prof_rate(value);
			return;
		}
		if ($tax_rate.equalsIgnoreCase(name)) {
			tax_rate(value);
			return;
		}
		if ($trd_cur_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_tax_amt(value);
			return;
		}
		if ($base_cur_upri.equalsIgnoreCase(name)) {
			base_cur_upri(value);
			return;
		}
		if ($base_cur_amt.equalsIgnoreCase(name)) {
			base_cur_amt(value);
			return;
		}
		if ($base_cur_inc_tax_amt.equalsIgnoreCase(name)) {
			base_cur_inc_tax_amt(value);
			return;
		}
		if ($base_cur_tax_amt.equalsIgnoreCase(name)) {
			base_cur_tax_amt(value);
			return;
		}
		if ($base_cur_dscnt_amt.equalsIgnoreCase(name)) {
			base_cur_dscnt_amt(value);
			return;
		}
		if ($ptax_cur_upri.equalsIgnoreCase(name)) {
			ptax_cur_upri(value);
			return;
		}
		if ($ptax_cur_amt.equalsIgnoreCase(name)) {
			ptax_cur_amt(value);
			return;
		}
		if ($ptax_cur_inc_tax_amt.equalsIgnoreCase(name)) {
			ptax_cur_inc_tax_amt(value);
			return;
		}
		if ($ptax_cur_tax_amt.equalsIgnoreCase(name)) {
			ptax_cur_tax_amt(value);
			return;
		}
		if ($ptax_cur_dscnt_amt.equalsIgnoreCase(name)) {
			ptax_cur_dscnt_amt(value);
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
		if ($wtax_amt.equalsIgnoreCase(name)) {
			wtax_amt(value);
			return;
		}
		if ($sls_act_d_seq.equalsIgnoreCase(name)) {
			sls_act_d_seq(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			trd_unit_dec_place(value);
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
		if ($ref_sls_act_seq.equalsIgnoreCase(name)) {
			ref_sls_act_seq(value);
			return;
		}
		if ($ref_sls_act_d_seq.equalsIgnoreCase(name)) {
			ref_sls_act_d_seq(value);
			return;
		}
		if ($schd_trd_unit_qty.equalsIgnoreCase(name)) {
			schd_trd_unit_qty(value);
			return;
		}
		if ($schd_trd_unit_dec_place.equalsIgnoreCase(name)) {
			schd_trd_unit_dec_place(value);
			return;
		}
		if ($schd_trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			schd_trd_unit_conv_base_qty(value);
			return;
		}
		if ($schd_trd_unit_conv_qty.equalsIgnoreCase(name)) {
			schd_trd_unit_conv_qty(value);
			return;
		}
		if ($dtl_row_id.equalsIgnoreCase(name)) {
			dtl_row_id(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($itm_bill_crryovr_times.equalsIgnoreCase(name)) {
			itm_bill_crryovr_times(value);
			return;
		}
		if ($init_schd_qty.equalsIgnoreCase(name)) {
			init_schd_qty(value);
			return;
		}
		if ($init_schd_dscnt_amt.equalsIgnoreCase(name)) {
			init_schd_dscnt_amt(value);
			return;
		}
		if ($purc_ret_act_rev.equalsIgnoreCase(name)) {
			purc_ret_act_rev(value);
			return;
		}
		if ($init_schd_amt.equalsIgnoreCase(name)) {
			init_schd_amt(value);
			return;
		}
		if ($schd_tax_rate.equalsIgnoreCase(name)) {
			schd_tax_rate(value);
			return;
		}
		if ($new_tax_rate.equalsIgnoreCase(name)) {
			new_tax_rate(value);
			return;
		}
		if ($init_trd_cur_tax_amt.equalsIgnoreCase(name)) {
			init_trd_cur_tax_amt(value);
			return;
		}
		if ($init_trd_unit_qty.equalsIgnoreCase(name)) {
			init_trd_unit_qty(value);
			return;
		}
		if ($init_trd_cur_upri.equalsIgnoreCase(name)) {
			init_trd_cur_upri(value);
			return;
		}
		if ($init_tax_rate.equalsIgnoreCase(name)) {
			init_tax_rate(value);
			return;
		}
		if ($init_trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			init_trd_cur_dscnt_amt(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($pay_schd_dt.equalsIgnoreCase(name)) {
			pay_schd_dt(value);
			return;
		}
		if ($base_sls_ac_dt.equalsIgnoreCase(name)) {
			base_sls_ac_dt(value);
			return;
		}
		if ($base_purc_ac_dt.equalsIgnoreCase(name)) {
			base_purc_ac_dt(value);
			return;
		}
		super.setDate(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($sundry_itm_flg.equalsIgnoreCase(name)) {
			sundry_itm_flg(value);
			return;
		}
		if ($pri_prnt_flg.equalsIgnoreCase(name)) {
			pri_prnt_flg(value);
			return;
		}
		if ($upri_not_tgt_flg.equalsIgnoreCase(name)) {
			upri_not_tgt_flg(value);
			return;
		}
		if ($interim_flg.equalsIgnoreCase(name)) {
			interim_flg(value);
			return;
		}
		if ($tax_fix_flg.equalsIgnoreCase(name)) {
			tax_fix_flg(value);
			return;
		}
		if ($str_ln_cd_none_flg.equalsIgnoreCase(name)) {
			str_ln_cd_none_flg(value);
			return;
		}
		if ($ver_flg.equalsIgnoreCase(name)) {
			ver_flg(value);
			return;
		}
		if ($vmi_flg.equalsIgnoreCase(name)) {
			vmi_flg(value);
			return;
		}
		if ($sppl_iv_flg.equalsIgnoreCase(name)) {
			sppl_iv_flg(value);
			return;
		}
		if ($pay_spot_flg.equalsIgnoreCase(name)) {
			pay_spot_flg(value);
			return;
		}
		if ($str_ln_tgt_flg.equalsIgnoreCase(name)) {
			str_ln_tgt_flg(value);
			return;
		}
		if ($inc_tax_flg.equalsIgnoreCase(name)) {
			inc_tax_flg(value);
			return;
		}
		if ($dlv_sundry_flg.equalsIgnoreCase(name)) {
			dlv_sundry_flg(value);
			return;
		}
		if ($sls_acxfr_flg.equalsIgnoreCase(name)) {
			sls_acxfr_flg(value);
			return;
		}
		if ($dscnt_itm_flg.equalsIgnoreCase(name)) {
			dscnt_itm_flg(value);
			return;
		}
		if ($init_abort_flg.equalsIgnoreCase(name)) {
			init_abort_flg(value);
			return;
		}
		if ($itm_sls_upri_cng_flg.equalsIgnoreCase(name)) {
			itm_sls_upri_cng_flg(value);
			return;
		}
		if ($schd_inc_tax_flg.equalsIgnoreCase(name)) {
			schd_inc_tax_flg(value);
			return;
		}
		if ($sls_cststk_flg.equalsIgnoreCase(name)) {
			sls_cststk_flg(value);
			return;
		}
		if ($new_inc_tax_flg.equalsIgnoreCase(name)) {
			new_inc_tax_flg(value);
			return;
		}
		if ($sls_dtl_upd_flg.equalsIgnoreCase(name)) {
			sls_dtl_upd_flg(value);
			return;
		}
		if ($init_inc_tax_flg.equalsIgnoreCase(name)) {
			init_inc_tax_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
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
		if ($stk_mng_typ.equalsIgnoreCase(name)) {
			stk_mng_typ(value);
			return;
		}
		if ($iv_itm_nm.equalsIgnoreCase(name)) {
			iv_itm_nm(value);
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
		if ($cntry_cd.equalsIgnoreCase(name)) {
			cntry_cd(value);
			return;
		}
		if ($cntry_nm.equalsIgnoreCase(name)) {
			cntry_nm(value);
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
		if ($purc_act_no.equalsIgnoreCase(name)) {
			purc_act_no(value);
			return;
		}
		if ($purc_act_d_no.equalsIgnoreCase(name)) {
			purc_act_d_no(value);
			return;
		}
		if ($purc_ddlv_po_no.equalsIgnoreCase(name)) {
			purc_ddlv_po_no(value);
			return;
		}
		if ($sppl_cd.equalsIgnoreCase(name)) {
			sppl_cd(value);
			return;
		}
		if ($sppl_nm.equalsIgnoreCase(name)) {
			sppl_nm(value);
			return;
		}
		if ($sppl_cntry_cd.equalsIgnoreCase(name)) {
			sppl_cntry_cd(value);
			return;
		}
		if ($sppl_cntry_nm.equalsIgnoreCase(name)) {
			sppl_cntry_nm(value);
			return;
		}
		if ($ret_nm.equalsIgnoreCase(name)) {
			ret_nm(value);
			return;
		}
		if ($ret_zip_cd.equalsIgnoreCase(name)) {
			ret_zip_cd(value);
			return;
		}
		if ($ret_addr1.equalsIgnoreCase(name)) {
			ret_addr1(value);
			return;
		}
		if ($ret_addr2.equalsIgnoreCase(name)) {
			ret_addr2(value);
			return;
		}
		if ($ret_addr3.equalsIgnoreCase(name)) {
			ret_addr3(value);
			return;
		}
		if ($ret_addr4.equalsIgnoreCase(name)) {
			ret_addr4(value);
			return;
		}
		if ($ret_cntct_dpt.equalsIgnoreCase(name)) {
			ret_cntct_dpt(value);
			return;
		}
		if ($ret_cntct_psn.equalsIgnoreCase(name)) {
			ret_cntct_psn(value);
			return;
		}
		if ($ret_cntct_psn_title.equalsIgnoreCase(name)) {
			ret_cntct_psn_title(value);
			return;
		}
		if ($ret_tel.equalsIgnoreCase(name)) {
			ret_tel(value);
			return;
		}
		if ($ret_fax.equalsIgnoreCase(name)) {
			ret_fax(value);
			return;
		}
		if ($ret_usr_cd.equalsIgnoreCase(name)) {
			ret_usr_cd(value);
			return;
		}
		if ($ret_usr_nm.equalsIgnoreCase(name)) {
			ret_usr_nm(value);
			return;
		}
		if ($ret_dpt_cd.equalsIgnoreCase(name)) {
			ret_dpt_cd(value);
			return;
		}
		if ($ret_dpt_nm.equalsIgnoreCase(name)) {
			ret_dpt_nm(value);
			return;
		}
		if ($cntry_org_cd.equalsIgnoreCase(name)) {
			cntry_org_cd(value);
			return;
		}
		if ($cntry_org_nm.equalsIgnoreCase(name)) {
			cntry_org_nm(value);
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
		if ($dscnt_rsn_cd.equalsIgnoreCase(name)) {
			dscnt_rsn_cd(value);
			return;
		}
		if ($dscnt_rsn_nm.equalsIgnoreCase(name)) {
			dscnt_rsn_nm(value);
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
		if ($gd_cd.equalsIgnoreCase(name)) {
			gd_cd(value);
			return;
		}
		if ($gd_nm.equalsIgnoreCase(name)) {
			gd_nm(value);
			return;
		}
		if ($loc_cd.equalsIgnoreCase(name)) {
			loc_cd(value);
			return;
		}
		if ($loc_nm.equalsIgnoreCase(name)) {
			loc_nm(value);
			return;
		}
		if ($str_ln_cd.equalsIgnoreCase(name)) {
			str_ln_cd(value);
			return;
		}
		if ($str_ln_nm.equalsIgnoreCase(name)) {
			str_ln_nm(value);
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
		if ($wrk_no.equalsIgnoreCase(name)) {
			wrk_no(value);
			return;
		}
		if ($wrk_nm.equalsIgnoreCase(name)) {
			wrk_nm(value);
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
		if ($ret_rsn_cd.equalsIgnoreCase(name)) {
			ret_rsn_cd(value);
			return;
		}
		if ($ret_rsn_nm.equalsIgnoreCase(name)) {
			ret_rsn_nm(value);
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
		if ($purc_ret_rsn_cd.equalsIgnoreCase(name)) {
			purc_ret_rsn_cd(value);
			return;
		}
		if ($purc_ret_rsn_nm.equalsIgnoreCase(name)) {
			purc_ret_rsn_nm(value);
			return;
		}
		if ($ap_dpt_cd.equalsIgnoreCase(name)) {
			ap_dpt_cd(value);
			return;
		}
		if ($ap_dpt_nm.equalsIgnoreCase(name)) {
			ap_dpt_nm(value);
			return;
		}
		if ($asset_mng_typ.equalsIgnoreCase(name)) {
			asset_mng_typ(value);
			return;
		}
		if ($arr_cnt_rmrks.equalsIgnoreCase(name)) {
			arr_cnt_rmrks(value);
			return;
		}
		if ($trd_d_rmrks.equalsIgnoreCase(name)) {
			trd_d_rmrks(value);
			return;
		}
		if ($intr_rmrks.equalsIgnoreCase(name)) {
			intr_rmrks(value);
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
		if ($sls_act_d_no.equalsIgnoreCase(name)) {
			sls_act_d_no(value);
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
		if ($ref_sls_act_no.equalsIgnoreCase(name)) {
			ref_sls_act_no(value);
			return;
		}
		if ($ref_sls_act_d_no.equalsIgnoreCase(name)) {
			ref_sls_act_d_no(value);
			return;
		}
		if ($sls_ret_schd_d_no.equalsIgnoreCase(name)) {
			sls_ret_schd_d_no(value);
			return;
		}
		if ($arr_act_no.equalsIgnoreCase(name)) {
			arr_act_no(value);
			return;
		}
		if ($lot_mng_typ.equalsIgnoreCase(name)) {
			lot_mng_typ(value);
			return;
		}
		if ($lot_no_typ.equalsIgnoreCase(name)) {
			lot_no_typ(value);
			return;
		}
		if ($sublot_mng_typ.equalsIgnoreCase(name)) {
			sublot_mng_typ(value);
			return;
		}
		if ($sublot_no_typ.equalsIgnoreCase(name)) {
			sublot_no_typ(value);
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
		if ($trd_unit_rnd_typ.equalsIgnoreCase(name)) {
			trd_unit_rnd_typ(value);
			return;
		}
		if ($base_unit_rnd_typ.equalsIgnoreCase(name)) {
			base_unit_rnd_typ(value);
			return;
		}
		if ($site_cd.equalsIgnoreCase(name)) {
			site_cd(value);
			return;
		}
		if ($sls_ret_schd_no.equalsIgnoreCase(name)) {
			sls_ret_schd_no(value);
			return;
		}
		if ($arr_pr_no.equalsIgnoreCase(name)) {
			arr_pr_no(value);
			return;
		}
		if ($io_schd_pr_no.equalsIgnoreCase(name)) {
			io_schd_pr_no(value);
			return;
		}
		if ($comp_spec_typ.equalsIgnoreCase(name)) {
			comp_spec_typ(value);
			return;
		}
		if ($schd_trd_unit_cd.equalsIgnoreCase(name)) {
			schd_trd_unit_cd(value);
			return;
		}
		if ($schd_trd_unit_rnd_typ.equalsIgnoreCase(name)) {
			schd_trd_unit_rnd_typ(value);
			return;
		}
		if ($prnt_lcl_cd.equalsIgnoreCase(name)) {
			prnt_lcl_cd(value);
			return;
		}
		if ($purc_ret_act_no.equalsIgnoreCase(name)) {
			purc_ret_act_no(value);
			return;
		}
		if ($purc_ret_act_d_no.equalsIgnoreCase(name)) {
			purc_ret_act_d_no(value);
			return;
		}
		if ($schd_no.equalsIgnoreCase(name)) {
			schd_no(value);
			return;
		}
		if ($new_tax_cd.equalsIgnoreCase(name)) {
			new_tax_cd(value);
			return;
		}
		if ($new_tax_nm.equalsIgnoreCase(name)) {
			new_tax_nm(value);
			return;
		}
		if ($new_tax_typ.equalsIgnoreCase(name)) {
			new_tax_typ(value);
			return;
		}
		if ($init_trd_unit_cd.equalsIgnoreCase(name)) {
			init_trd_unit_cd(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($purc_act_rev.equalsIgnoreCase(name)) {
			purc_act_rev(value);
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
		if ($schd_qty.equalsIgnoreCase(name)) {
			schd_qty(value);
			return;
		}
		if ($arr_qty.equalsIgnoreCase(name)) {
			arr_qty(value);
			return;
		}
		if ($sls_ret_qty.equalsIgnoreCase(name)) {
			sls_ret_qty(value);
			return;
		}
		if ($abort_qty.equalsIgnoreCase(name)) {
			abort_qty(value);
			return;
		}
		if ($trd_cur_upri.equalsIgnoreCase(name)) {
			trd_cur_upri(value);
			return;
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
			return;
		}
		if ($trd_cur_inc_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_inc_tax_amt(value);
			return;
		}
		if ($trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			trd_cur_dscnt_amt(value);
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
		if ($prof_rate.equalsIgnoreCase(name)) {
			prof_rate(value);
			return;
		}
		if ($tax_rate.equalsIgnoreCase(name)) {
			tax_rate(value);
			return;
		}
		if ($trd_cur_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_tax_amt(value);
			return;
		}
		if ($base_cur_upri.equalsIgnoreCase(name)) {
			base_cur_upri(value);
			return;
		}
		if ($base_cur_amt.equalsIgnoreCase(name)) {
			base_cur_amt(value);
			return;
		}
		if ($base_cur_inc_tax_amt.equalsIgnoreCase(name)) {
			base_cur_inc_tax_amt(value);
			return;
		}
		if ($base_cur_tax_amt.equalsIgnoreCase(name)) {
			base_cur_tax_amt(value);
			return;
		}
		if ($base_cur_dscnt_amt.equalsIgnoreCase(name)) {
			base_cur_dscnt_amt(value);
			return;
		}
		if ($ptax_cur_upri.equalsIgnoreCase(name)) {
			ptax_cur_upri(value);
			return;
		}
		if ($ptax_cur_amt.equalsIgnoreCase(name)) {
			ptax_cur_amt(value);
			return;
		}
		if ($ptax_cur_inc_tax_amt.equalsIgnoreCase(name)) {
			ptax_cur_inc_tax_amt(value);
			return;
		}
		if ($ptax_cur_tax_amt.equalsIgnoreCase(name)) {
			ptax_cur_tax_amt(value);
			return;
		}
		if ($ptax_cur_dscnt_amt.equalsIgnoreCase(name)) {
			ptax_cur_dscnt_amt(value);
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
		if ($wtax_amt.equalsIgnoreCase(name)) {
			wtax_amt(value);
			return;
		}
		if ($sls_act_d_seq.equalsIgnoreCase(name)) {
			sls_act_d_seq(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			trd_unit_dec_place(value);
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
		if ($ref_sls_act_seq.equalsIgnoreCase(name)) {
			ref_sls_act_seq(value);
			return;
		}
		if ($ref_sls_act_d_seq.equalsIgnoreCase(name)) {
			ref_sls_act_d_seq(value);
			return;
		}
		if ($schd_trd_unit_qty.equalsIgnoreCase(name)) {
			schd_trd_unit_qty(value);
			return;
		}
		if ($schd_trd_unit_dec_place.equalsIgnoreCase(name)) {
			schd_trd_unit_dec_place(value);
			return;
		}
		if ($schd_trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			schd_trd_unit_conv_base_qty(value);
			return;
		}
		if ($schd_trd_unit_conv_qty.equalsIgnoreCase(name)) {
			schd_trd_unit_conv_qty(value);
			return;
		}
		if ($dtl_row_id.equalsIgnoreCase(name)) {
			dtl_row_id(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($itm_bill_crryovr_times.equalsIgnoreCase(name)) {
			itm_bill_crryovr_times(value);
			return;
		}
		if ($init_schd_qty.equalsIgnoreCase(name)) {
			init_schd_qty(value);
			return;
		}
		if ($init_schd_dscnt_amt.equalsIgnoreCase(name)) {
			init_schd_dscnt_amt(value);
			return;
		}
		if ($purc_ret_act_rev.equalsIgnoreCase(name)) {
			purc_ret_act_rev(value);
			return;
		}
		if ($init_schd_amt.equalsIgnoreCase(name)) {
			init_schd_amt(value);
			return;
		}
		if ($schd_tax_rate.equalsIgnoreCase(name)) {
			schd_tax_rate(value);
			return;
		}
		if ($new_tax_rate.equalsIgnoreCase(name)) {
			new_tax_rate(value);
			return;
		}
		if ($init_trd_cur_tax_amt.equalsIgnoreCase(name)) {
			init_trd_cur_tax_amt(value);
			return;
		}
		if ($init_trd_unit_qty.equalsIgnoreCase(name)) {
			init_trd_unit_qty(value);
			return;
		}
		if ($init_trd_cur_upri.equalsIgnoreCase(name)) {
			init_trd_cur_upri(value);
			return;
		}
		if ($init_tax_rate.equalsIgnoreCase(name)) {
			init_tax_rate(value);
			return;
		}
		if ($init_trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			init_trd_cur_dscnt_amt(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($purc_act_rev.equalsIgnoreCase(name)) {
			purc_act_rev(value);
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
		if ($schd_qty.equalsIgnoreCase(name)) {
			schd_qty(value);
			return;
		}
		if ($arr_qty.equalsIgnoreCase(name)) {
			arr_qty(value);
			return;
		}
		if ($sls_ret_qty.equalsIgnoreCase(name)) {
			sls_ret_qty(value);
			return;
		}
		if ($abort_qty.equalsIgnoreCase(name)) {
			abort_qty(value);
			return;
		}
		if ($trd_cur_upri.equalsIgnoreCase(name)) {
			trd_cur_upri(value);
			return;
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
			return;
		}
		if ($trd_cur_inc_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_inc_tax_amt(value);
			return;
		}
		if ($trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			trd_cur_dscnt_amt(value);
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
		if ($prof_rate.equalsIgnoreCase(name)) {
			prof_rate(value);
			return;
		}
		if ($tax_rate.equalsIgnoreCase(name)) {
			tax_rate(value);
			return;
		}
		if ($trd_cur_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_tax_amt(value);
			return;
		}
		if ($base_cur_upri.equalsIgnoreCase(name)) {
			base_cur_upri(value);
			return;
		}
		if ($base_cur_amt.equalsIgnoreCase(name)) {
			base_cur_amt(value);
			return;
		}
		if ($base_cur_inc_tax_amt.equalsIgnoreCase(name)) {
			base_cur_inc_tax_amt(value);
			return;
		}
		if ($base_cur_tax_amt.equalsIgnoreCase(name)) {
			base_cur_tax_amt(value);
			return;
		}
		if ($base_cur_dscnt_amt.equalsIgnoreCase(name)) {
			base_cur_dscnt_amt(value);
			return;
		}
		if ($ptax_cur_upri.equalsIgnoreCase(name)) {
			ptax_cur_upri(value);
			return;
		}
		if ($ptax_cur_amt.equalsIgnoreCase(name)) {
			ptax_cur_amt(value);
			return;
		}
		if ($ptax_cur_inc_tax_amt.equalsIgnoreCase(name)) {
			ptax_cur_inc_tax_amt(value);
			return;
		}
		if ($ptax_cur_tax_amt.equalsIgnoreCase(name)) {
			ptax_cur_tax_amt(value);
			return;
		}
		if ($ptax_cur_dscnt_amt.equalsIgnoreCase(name)) {
			ptax_cur_dscnt_amt(value);
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
		if ($wtax_amt.equalsIgnoreCase(name)) {
			wtax_amt(value);
			return;
		}
		if ($sls_act_d_seq.equalsIgnoreCase(name)) {
			sls_act_d_seq(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			trd_unit_dec_place(value);
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
		if ($ref_sls_act_seq.equalsIgnoreCase(name)) {
			ref_sls_act_seq(value);
			return;
		}
		if ($ref_sls_act_d_seq.equalsIgnoreCase(name)) {
			ref_sls_act_d_seq(value);
			return;
		}
		if ($schd_trd_unit_qty.equalsIgnoreCase(name)) {
			schd_trd_unit_qty(value);
			return;
		}
		if ($schd_trd_unit_dec_place.equalsIgnoreCase(name)) {
			schd_trd_unit_dec_place(value);
			return;
		}
		if ($schd_trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			schd_trd_unit_conv_base_qty(value);
			return;
		}
		if ($schd_trd_unit_conv_qty.equalsIgnoreCase(name)) {
			schd_trd_unit_conv_qty(value);
			return;
		}
		if ($dtl_row_id.equalsIgnoreCase(name)) {
			dtl_row_id(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($itm_bill_crryovr_times.equalsIgnoreCase(name)) {
			itm_bill_crryovr_times(value);
			return;
		}
		if ($init_schd_qty.equalsIgnoreCase(name)) {
			init_schd_qty(value);
			return;
		}
		if ($init_schd_dscnt_amt.equalsIgnoreCase(name)) {
			init_schd_dscnt_amt(value);
			return;
		}
		if ($purc_ret_act_rev.equalsIgnoreCase(name)) {
			purc_ret_act_rev(value);
			return;
		}
		if ($init_schd_amt.equalsIgnoreCase(name)) {
			init_schd_amt(value);
			return;
		}
		if ($schd_tax_rate.equalsIgnoreCase(name)) {
			schd_tax_rate(value);
			return;
		}
		if ($new_tax_rate.equalsIgnoreCase(name)) {
			new_tax_rate(value);
			return;
		}
		if ($init_trd_cur_tax_amt.equalsIgnoreCase(name)) {
			init_trd_cur_tax_amt(value);
			return;
		}
		if ($init_trd_unit_qty.equalsIgnoreCase(name)) {
			init_trd_unit_qty(value);
			return;
		}
		if ($init_trd_cur_upri.equalsIgnoreCase(name)) {
			init_trd_cur_upri(value);
			return;
		}
		if ($init_tax_rate.equalsIgnoreCase(name)) {
			init_tax_rate(value);
			return;
		}
		if ($init_trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			init_trd_cur_dscnt_amt(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($purc_act_rev.equalsIgnoreCase(name)) {
			purc_act_rev(value);
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
		if ($schd_qty.equalsIgnoreCase(name)) {
			schd_qty(value);
			return;
		}
		if ($arr_qty.equalsIgnoreCase(name)) {
			arr_qty(value);
			return;
		}
		if ($sls_ret_qty.equalsIgnoreCase(name)) {
			sls_ret_qty(value);
			return;
		}
		if ($abort_qty.equalsIgnoreCase(name)) {
			abort_qty(value);
			return;
		}
		if ($trd_cur_upri.equalsIgnoreCase(name)) {
			trd_cur_upri(value);
			return;
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
			return;
		}
		if ($trd_cur_inc_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_inc_tax_amt(value);
			return;
		}
		if ($trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			trd_cur_dscnt_amt(value);
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
		if ($prof_rate.equalsIgnoreCase(name)) {
			prof_rate(value);
			return;
		}
		if ($tax_rate.equalsIgnoreCase(name)) {
			tax_rate(value);
			return;
		}
		if ($trd_cur_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_tax_amt(value);
			return;
		}
		if ($base_cur_upri.equalsIgnoreCase(name)) {
			base_cur_upri(value);
			return;
		}
		if ($base_cur_amt.equalsIgnoreCase(name)) {
			base_cur_amt(value);
			return;
		}
		if ($base_cur_inc_tax_amt.equalsIgnoreCase(name)) {
			base_cur_inc_tax_amt(value);
			return;
		}
		if ($base_cur_tax_amt.equalsIgnoreCase(name)) {
			base_cur_tax_amt(value);
			return;
		}
		if ($base_cur_dscnt_amt.equalsIgnoreCase(name)) {
			base_cur_dscnt_amt(value);
			return;
		}
		if ($ptax_cur_upri.equalsIgnoreCase(name)) {
			ptax_cur_upri(value);
			return;
		}
		if ($ptax_cur_amt.equalsIgnoreCase(name)) {
			ptax_cur_amt(value);
			return;
		}
		if ($ptax_cur_inc_tax_amt.equalsIgnoreCase(name)) {
			ptax_cur_inc_tax_amt(value);
			return;
		}
		if ($ptax_cur_tax_amt.equalsIgnoreCase(name)) {
			ptax_cur_tax_amt(value);
			return;
		}
		if ($ptax_cur_dscnt_amt.equalsIgnoreCase(name)) {
			ptax_cur_dscnt_amt(value);
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
		if ($wtax_amt.equalsIgnoreCase(name)) {
			wtax_amt(value);
			return;
		}
		if ($sls_act_d_seq.equalsIgnoreCase(name)) {
			sls_act_d_seq(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			trd_unit_dec_place(value);
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
		if ($ref_sls_act_seq.equalsIgnoreCase(name)) {
			ref_sls_act_seq(value);
			return;
		}
		if ($ref_sls_act_d_seq.equalsIgnoreCase(name)) {
			ref_sls_act_d_seq(value);
			return;
		}
		if ($schd_trd_unit_qty.equalsIgnoreCase(name)) {
			schd_trd_unit_qty(value);
			return;
		}
		if ($schd_trd_unit_dec_place.equalsIgnoreCase(name)) {
			schd_trd_unit_dec_place(value);
			return;
		}
		if ($schd_trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			schd_trd_unit_conv_base_qty(value);
			return;
		}
		if ($schd_trd_unit_conv_qty.equalsIgnoreCase(name)) {
			schd_trd_unit_conv_qty(value);
			return;
		}
		if ($dtl_row_id.equalsIgnoreCase(name)) {
			dtl_row_id(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($itm_bill_crryovr_times.equalsIgnoreCase(name)) {
			itm_bill_crryovr_times(value);
			return;
		}
		if ($init_schd_qty.equalsIgnoreCase(name)) {
			init_schd_qty(value);
			return;
		}
		if ($init_schd_dscnt_amt.equalsIgnoreCase(name)) {
			init_schd_dscnt_amt(value);
			return;
		}
		if ($purc_ret_act_rev.equalsIgnoreCase(name)) {
			purc_ret_act_rev(value);
			return;
		}
		if ($init_schd_amt.equalsIgnoreCase(name)) {
			init_schd_amt(value);
			return;
		}
		if ($schd_tax_rate.equalsIgnoreCase(name)) {
			schd_tax_rate(value);
			return;
		}
		if ($new_tax_rate.equalsIgnoreCase(name)) {
			new_tax_rate(value);
			return;
		}
		if ($init_trd_cur_tax_amt.equalsIgnoreCase(name)) {
			init_trd_cur_tax_amt(value);
			return;
		}
		if ($init_trd_unit_qty.equalsIgnoreCase(name)) {
			init_trd_unit_qty(value);
			return;
		}
		if ($init_trd_cur_upri.equalsIgnoreCase(name)) {
			init_trd_cur_upri(value);
			return;
		}
		if ($init_tax_rate.equalsIgnoreCase(name)) {
			init_tax_rate(value);
			return;
		}
		if ($init_trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			init_trd_cur_dscnt_amt(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($purc_act_rev.equalsIgnoreCase(name)) {
			purc_act_rev(value);
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
		if ($schd_qty.equalsIgnoreCase(name)) {
			schd_qty(value);
			return;
		}
		if ($arr_qty.equalsIgnoreCase(name)) {
			arr_qty(value);
			return;
		}
		if ($sls_ret_qty.equalsIgnoreCase(name)) {
			sls_ret_qty(value);
			return;
		}
		if ($abort_qty.equalsIgnoreCase(name)) {
			abort_qty(value);
			return;
		}
		if ($trd_cur_upri.equalsIgnoreCase(name)) {
			trd_cur_upri(value);
			return;
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
			return;
		}
		if ($trd_cur_inc_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_inc_tax_amt(value);
			return;
		}
		if ($trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			trd_cur_dscnt_amt(value);
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
		if ($prof_rate.equalsIgnoreCase(name)) {
			prof_rate(value);
			return;
		}
		if ($tax_rate.equalsIgnoreCase(name)) {
			tax_rate(value);
			return;
		}
		if ($trd_cur_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_tax_amt(value);
			return;
		}
		if ($base_cur_upri.equalsIgnoreCase(name)) {
			base_cur_upri(value);
			return;
		}
		if ($base_cur_amt.equalsIgnoreCase(name)) {
			base_cur_amt(value);
			return;
		}
		if ($base_cur_inc_tax_amt.equalsIgnoreCase(name)) {
			base_cur_inc_tax_amt(value);
			return;
		}
		if ($base_cur_tax_amt.equalsIgnoreCase(name)) {
			base_cur_tax_amt(value);
			return;
		}
		if ($base_cur_dscnt_amt.equalsIgnoreCase(name)) {
			base_cur_dscnt_amt(value);
			return;
		}
		if ($ptax_cur_upri.equalsIgnoreCase(name)) {
			ptax_cur_upri(value);
			return;
		}
		if ($ptax_cur_amt.equalsIgnoreCase(name)) {
			ptax_cur_amt(value);
			return;
		}
		if ($ptax_cur_inc_tax_amt.equalsIgnoreCase(name)) {
			ptax_cur_inc_tax_amt(value);
			return;
		}
		if ($ptax_cur_tax_amt.equalsIgnoreCase(name)) {
			ptax_cur_tax_amt(value);
			return;
		}
		if ($ptax_cur_dscnt_amt.equalsIgnoreCase(name)) {
			ptax_cur_dscnt_amt(value);
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
		if ($wtax_amt.equalsIgnoreCase(name)) {
			wtax_amt(value);
			return;
		}
		if ($sls_act_d_seq.equalsIgnoreCase(name)) {
			sls_act_d_seq(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			trd_unit_dec_place(value);
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
		if ($ref_sls_act_seq.equalsIgnoreCase(name)) {
			ref_sls_act_seq(value);
			return;
		}
		if ($ref_sls_act_d_seq.equalsIgnoreCase(name)) {
			ref_sls_act_d_seq(value);
			return;
		}
		if ($schd_trd_unit_qty.equalsIgnoreCase(name)) {
			schd_trd_unit_qty(value);
			return;
		}
		if ($schd_trd_unit_dec_place.equalsIgnoreCase(name)) {
			schd_trd_unit_dec_place(value);
			return;
		}
		if ($schd_trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			schd_trd_unit_conv_base_qty(value);
			return;
		}
		if ($schd_trd_unit_conv_qty.equalsIgnoreCase(name)) {
			schd_trd_unit_conv_qty(value);
			return;
		}
		if ($dtl_row_id.equalsIgnoreCase(name)) {
			dtl_row_id(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($itm_bill_crryovr_times.equalsIgnoreCase(name)) {
			itm_bill_crryovr_times(value);
			return;
		}
		if ($init_schd_qty.equalsIgnoreCase(name)) {
			init_schd_qty(value);
			return;
		}
		if ($init_schd_dscnt_amt.equalsIgnoreCase(name)) {
			init_schd_dscnt_amt(value);
			return;
		}
		if ($purc_ret_act_rev.equalsIgnoreCase(name)) {
			purc_ret_act_rev(value);
			return;
		}
		if ($init_schd_amt.equalsIgnoreCase(name)) {
			init_schd_amt(value);
			return;
		}
		if ($schd_tax_rate.equalsIgnoreCase(name)) {
			schd_tax_rate(value);
			return;
		}
		if ($new_tax_rate.equalsIgnoreCase(name)) {
			new_tax_rate(value);
			return;
		}
		if ($init_trd_cur_tax_amt.equalsIgnoreCase(name)) {
			init_trd_cur_tax_amt(value);
			return;
		}
		if ($init_trd_unit_qty.equalsIgnoreCase(name)) {
			init_trd_unit_qty(value);
			return;
		}
		if ($init_trd_cur_upri.equalsIgnoreCase(name)) {
			init_trd_cur_upri(value);
			return;
		}
		if ($init_tax_rate.equalsIgnoreCase(name)) {
			init_tax_rate(value);
			return;
		}
		if ($init_trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			init_trd_cur_dscnt_amt(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($purc_act_rev.equalsIgnoreCase(name)) {
			purc_act_rev(value);
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
		if ($schd_qty.equalsIgnoreCase(name)) {
			schd_qty(value);
			return;
		}
		if ($arr_qty.equalsIgnoreCase(name)) {
			arr_qty(value);
			return;
		}
		if ($sls_ret_qty.equalsIgnoreCase(name)) {
			sls_ret_qty(value);
			return;
		}
		if ($abort_qty.equalsIgnoreCase(name)) {
			abort_qty(value);
			return;
		}
		if ($trd_cur_upri.equalsIgnoreCase(name)) {
			trd_cur_upri(value);
			return;
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
			return;
		}
		if ($trd_cur_inc_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_inc_tax_amt(value);
			return;
		}
		if ($trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			trd_cur_dscnt_amt(value);
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
		if ($prof_rate.equalsIgnoreCase(name)) {
			prof_rate(value);
			return;
		}
		if ($tax_rate.equalsIgnoreCase(name)) {
			tax_rate(value);
			return;
		}
		if ($trd_cur_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_tax_amt(value);
			return;
		}
		if ($base_cur_upri.equalsIgnoreCase(name)) {
			base_cur_upri(value);
			return;
		}
		if ($base_cur_amt.equalsIgnoreCase(name)) {
			base_cur_amt(value);
			return;
		}
		if ($base_cur_inc_tax_amt.equalsIgnoreCase(name)) {
			base_cur_inc_tax_amt(value);
			return;
		}
		if ($base_cur_tax_amt.equalsIgnoreCase(name)) {
			base_cur_tax_amt(value);
			return;
		}
		if ($base_cur_dscnt_amt.equalsIgnoreCase(name)) {
			base_cur_dscnt_amt(value);
			return;
		}
		if ($ptax_cur_upri.equalsIgnoreCase(name)) {
			ptax_cur_upri(value);
			return;
		}
		if ($ptax_cur_amt.equalsIgnoreCase(name)) {
			ptax_cur_amt(value);
			return;
		}
		if ($ptax_cur_inc_tax_amt.equalsIgnoreCase(name)) {
			ptax_cur_inc_tax_amt(value);
			return;
		}
		if ($ptax_cur_tax_amt.equalsIgnoreCase(name)) {
			ptax_cur_tax_amt(value);
			return;
		}
		if ($ptax_cur_dscnt_amt.equalsIgnoreCase(name)) {
			ptax_cur_dscnt_amt(value);
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
		if ($wtax_amt.equalsIgnoreCase(name)) {
			wtax_amt(value);
			return;
		}
		if ($sls_act_d_seq.equalsIgnoreCase(name)) {
			sls_act_d_seq(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			trd_unit_dec_place(value);
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
		if ($ref_sls_act_seq.equalsIgnoreCase(name)) {
			ref_sls_act_seq(value);
			return;
		}
		if ($ref_sls_act_d_seq.equalsIgnoreCase(name)) {
			ref_sls_act_d_seq(value);
			return;
		}
		if ($schd_trd_unit_qty.equalsIgnoreCase(name)) {
			schd_trd_unit_qty(value);
			return;
		}
		if ($schd_trd_unit_dec_place.equalsIgnoreCase(name)) {
			schd_trd_unit_dec_place(value);
			return;
		}
		if ($schd_trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			schd_trd_unit_conv_base_qty(value);
			return;
		}
		if ($schd_trd_unit_conv_qty.equalsIgnoreCase(name)) {
			schd_trd_unit_conv_qty(value);
			return;
		}
		if ($dtl_row_id.equalsIgnoreCase(name)) {
			dtl_row_id(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($itm_bill_crryovr_times.equalsIgnoreCase(name)) {
			itm_bill_crryovr_times(value);
			return;
		}
		if ($init_schd_qty.equalsIgnoreCase(name)) {
			init_schd_qty(value);
			return;
		}
		if ($init_schd_dscnt_amt.equalsIgnoreCase(name)) {
			init_schd_dscnt_amt(value);
			return;
		}
		if ($purc_ret_act_rev.equalsIgnoreCase(name)) {
			purc_ret_act_rev(value);
			return;
		}
		if ($init_schd_amt.equalsIgnoreCase(name)) {
			init_schd_amt(value);
			return;
		}
		if ($schd_tax_rate.equalsIgnoreCase(name)) {
			schd_tax_rate(value);
			return;
		}
		if ($new_tax_rate.equalsIgnoreCase(name)) {
			new_tax_rate(value);
			return;
		}
		if ($init_trd_cur_tax_amt.equalsIgnoreCase(name)) {
			init_trd_cur_tax_amt(value);
			return;
		}
		if ($init_trd_unit_qty.equalsIgnoreCase(name)) {
			init_trd_unit_qty(value);
			return;
		}
		if ($init_trd_cur_upri.equalsIgnoreCase(name)) {
			init_trd_cur_upri(value);
			return;
		}
		if ($init_tax_rate.equalsIgnoreCase(name)) {
			init_tax_rate(value);
			return;
		}
		if ($init_trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			init_trd_cur_dscnt_amt(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($pay_schd_dt.equalsIgnoreCase(name)) {
			pay_schd_dt(value);
			return;
		}
		if ($base_sls_ac_dt.equalsIgnoreCase(name)) {
			base_sls_ac_dt(value);
			return;
		}
		if ($base_purc_ac_dt.equalsIgnoreCase(name)) {
			base_purc_ac_dt(value);
			return;
		}
		super.setDateNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($sundry_itm_flg.equalsIgnoreCase(name)) {
			sundry_itm_flg(value);
			return;
		}
		if ($pri_prnt_flg.equalsIgnoreCase(name)) {
			pri_prnt_flg(value);
			return;
		}
		if ($upri_not_tgt_flg.equalsIgnoreCase(name)) {
			upri_not_tgt_flg(value);
			return;
		}
		if ($interim_flg.equalsIgnoreCase(name)) {
			interim_flg(value);
			return;
		}
		if ($tax_fix_flg.equalsIgnoreCase(name)) {
			tax_fix_flg(value);
			return;
		}
		if ($str_ln_cd_none_flg.equalsIgnoreCase(name)) {
			str_ln_cd_none_flg(value);
			return;
		}
		if ($ver_flg.equalsIgnoreCase(name)) {
			ver_flg(value);
			return;
		}
		if ($vmi_flg.equalsIgnoreCase(name)) {
			vmi_flg(value);
			return;
		}
		if ($sppl_iv_flg.equalsIgnoreCase(name)) {
			sppl_iv_flg(value);
			return;
		}
		if ($pay_spot_flg.equalsIgnoreCase(name)) {
			pay_spot_flg(value);
			return;
		}
		if ($str_ln_tgt_flg.equalsIgnoreCase(name)) {
			str_ln_tgt_flg(value);
			return;
		}
		if ($inc_tax_flg.equalsIgnoreCase(name)) {
			inc_tax_flg(value);
			return;
		}
		if ($dlv_sundry_flg.equalsIgnoreCase(name)) {
			dlv_sundry_flg(value);
			return;
		}
		if ($sls_acxfr_flg.equalsIgnoreCase(name)) {
			sls_acxfr_flg(value);
			return;
		}
		if ($dscnt_itm_flg.equalsIgnoreCase(name)) {
			dscnt_itm_flg(value);
			return;
		}
		if ($init_abort_flg.equalsIgnoreCase(name)) {
			init_abort_flg(value);
			return;
		}
		if ($itm_sls_upri_cng_flg.equalsIgnoreCase(name)) {
			itm_sls_upri_cng_flg(value);
			return;
		}
		if ($schd_inc_tax_flg.equalsIgnoreCase(name)) {
			schd_inc_tax_flg(value);
			return;
		}
		if ($sls_cststk_flg.equalsIgnoreCase(name)) {
			sls_cststk_flg(value);
			return;
		}
		if ($new_inc_tax_flg.equalsIgnoreCase(name)) {
			new_inc_tax_flg(value);
			return;
		}
		if ($sls_dtl_upd_flg.equalsIgnoreCase(name)) {
			sls_dtl_upd_flg(value);
			return;
		}
		if ($init_inc_tax_flg.equalsIgnoreCase(name)) {
			init_inc_tax_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

