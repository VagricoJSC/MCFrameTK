package mcframe.clientMSBB.MSBBP1360;

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
 * ブロック"Dtl"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class DtlR_MC_A extends MCConstRow {

	/**
	 * Simultaneous recording 同時計上.<p>
	 *
	 */
	public static final String $sync_flg = "sync_flg";
	/**
	 * Cancel remaining 打切.<p>
	 *
	 */
	public static final String $abort_flg = "abort_flg";
	/**
	 * Scheduled delivery date 納品予定日.<p>
	 *
	 */
	public static final String $dlv_schd_dt = "dlv_schd_dt";
	public static final String $itm_p = "itm_p";
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
	 * Asset management type 資産管理区分.<p>
	 *
	 */
	public static final String $asset_mng_typ = "asset_mng_typ";
	/**
	 * Asset management type name 資産管理区分名.<p>
	 *
	 */
	public static final String $asset_mng_typ_nm = "asset_mng_typ_nm";
	/**
	 * Miscellaneous item 諸口品.<p>
	 *
	 */
	public static final String $sundry_itm_flg = "sundry_itm_flg";
	public static final String $dlv_p = "dlv_p";
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
	 * Transaction unit cd. 取引単位ＣＤ.<p>
	 *
	 */
	public static final String $trd_unit_cd = "trd_unit_cd";
	/**
	 * Transaction unit name 取引単位名.<p>
	 *
	 */
	public static final String $trd_unit_nm = "trd_unit_nm";
	public static final String $trd_unit_qty_p = "trd_unit_qty_p";
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
	public static final String $base_unit_qty_p = "base_unit_qty_p";
	public static final String $sls_schd_qty_p = "sls_schd_qty_p";
	public static final String $sls_qty_p = "sls_qty_p";
	/**
	 * Details correction 明細訂正.<p>
	 *
	 */
	public static final String $sls_dtl_upd_flg = "sls_dtl_upd_flg";
	public static final String $trd_upri_amt_p = "trd_upri_amt_p";
	public static final String $cost_upri_p = "cost_upri_p";
	public static final String $cost_amt_p = "cost_amt_p";
	/**
	 * Gross profit rate 粗利率.<p>
	 *
	 */
	public static final String $prof_rate = "prof_rate";
	public static final String $base_cur_upri_p = "base_cur_upri_p";
	public static final String $base_cur_amt_p = "base_cur_amt_p";
	public static final String $base_cur_inc_tax_amt_p = "base_cur_inc_tax_amt_p";
	public static final String $base_cur_tax_amt_p = "base_cur_tax_amt_p";
	public static final String $base_cur_dscnt_amt_p = "base_cur_dscnt_amt_p";
	public static final String $ptax_cur_upri_p = "ptax_cur_upri_p";
	public static final String $ptax_cur_amt_p = "ptax_cur_amt_p";
	public static final String $ptax_cur_inc_tax_amt_p = "ptax_cur_inc_tax_amt_p";
	public static final String $ptax_cur_tax_amt_p = "ptax_cur_tax_amt_p";
	public static final String $ptax_cur_dscnt_amt_p = "ptax_cur_dscnt_amt_p";
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
	 * Customer order details No. 得意先注文明細ＮＯ.<p>
	 *
	 */
	public static final String $cst_po_d_no = "cst_po_d_no";
	/**
	 * Sales reason cd. 売上理由ＣＤ.<p>
	 *
	 */
	public static final String $sls_rsn_cd = "sls_rsn_cd";
	/**
	 * Sales reason name 売上理由名.<p>
	 *
	 */
	public static final String $sls_rsn_nm = "sls_rsn_nm";
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
	 * Withholding tax rate 源泉税率.<p>
	 *
	 */
	public static final String $wtax_rate = "wtax_rate";
	public static final String $wtax_amt_p = "wtax_amt_p";
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
	 * External purchase result details No. 外部仕入実績明細ＮＯ.<p>
	 *
	 */
	public static final String $ext_purc_act_d_no = "ext_purc_act_d_no";
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
	 * Purchase recording month 仕入計上年月.<p>
	 *
	 */
	public static final String $purc_ac_ym = "purc_ac_ym";
	/**
	 * Purchase recording date 仕入計上日.<p>
	 *
	 */
	public static final String $purc_ac_dt = "purc_ac_dt";
	/**
	 * Purchase date 仕入日.<p>
	 *
	 */
	public static final String $purc_dt = "purc_dt";
	/**
	 * Purchase result No. 仕入実績ＮＯ.<p>
	 *
	 */
	public static final String $purc_act_no = "purc_act_no";
	/**
	 * Purchase result details No. 仕入実績明細ＮＯ.<p>
	 *
	 */
	public static final String $purc_act_d_no = "purc_act_d_no";
	/**
	 * PO No. 発注ＮＯ.<p>
	 *
	 */
	public static final String $po_no = "po_no";
	/**
	 * PO details No. 発注明細ＮＯ.<p>
	 *
	 */
	public static final String $po_d_no = "po_d_no";
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
	 * For invoice transaction インボイス取引対象.<p>
	 *
	 */
	public static final String $sppl_iv_flg = "sppl_iv_flg";
	/**
	 * For subcontract 下請対象.<p>
	 *
	 */
	public static final String $subcon_flg = "subcon_flg";
	/**
	 * Maker cd. メーカＣＤ.<p>
	 *
	 */
	public static final String $maker_cd = "maker_cd";
	/**
	 * Maker name メーカ名.<p>
	 *
	 */
	public static final String $maker_nm = "maker_nm";
	/**
	 * Vendor delivery note No. 業者納品書ＮＯ.<p>
	 *
	 */
	public static final String $bp_dlv_slip_no = "bp_dlv_slip_no";
	/**
	 * Vendor delivery note details No. 業者納品書明細ＮＯ.<p>
	 *
	 */
	public static final String $bp_dlv_slip_d_no = "bp_dlv_slip_d_no";
	public static final String $lot_no_p = "lot_no_p";
	/**
	 * Vendor lot No. 業者ロットＮＯ.<p>
	 *
	 */
	public static final String $bp_lot_no = "bp_lot_no";
	/**
	 * Shipping point deadline 出荷元期限.<p>
	 *
	 */
	public static final String $ship_fr_valid_dt = "ship_fr_valid_dt";
	public static final String $ver_no_p = "ver_no_p";
	public static final String $purc_cont_qty_p = "purc_cont_qty_p";
	public static final String $purc_cont_fctr_p = "purc_cont_fctr_p";
	public static final String $std_cont_qty_p = "std_cont_qty_p";
	public static final String $cont_fctr_unit_p = "cont_fctr_unit_p";
	public static final String $std_cont_fctr_p = "std_cont_fctr_p";
	public static final String $sno_wrk_no_p = "sno_wrk_no_p";
	/**
	 * Purchase currency cd. 仕入通貨ＣＤ.<p>
	 *
	 */
	public static final String $purc_trd_cur_cd = "purc_trd_cur_cd";
	/**
	 * Purchase currency name 仕入通貨名.<p>
	 *
	 */
	public static final String $purc_trd_cur_nm = "purc_trd_cur_nm";
	/**
	 * Specify scheduled purchase rate 仕入予定レート指定.<p>
	 *
	 */
	public static final String $purc_xrate_inpt_flg = "purc_xrate_inpt_flg";
	public static final String $purc_xrate_p = "purc_xrate_p";
	/**
	 * Set scheduled purchase tax rate 仕入予定納税レート指定.<p>
	 *
	 */
	public static final String $purc_ptax_xrate_inpt_flg = "purc_ptax_xrate_inpt_flg";
	public static final String $purc_ptax_xrate_p = "purc_ptax_xrate_p";
	/**
	 * Purchase details correction 仕入明細訂正.<p>
	 *
	 */
	public static final String $purc_dtl_upd_flg = "purc_dtl_upd_flg";
	public static final String $purc_trd_upri_amt_p = "purc_trd_upri_amt_p";
	public static final String $purc_base_cur_upri_p = "purc_base_cur_upri_p";
	public static final String $purc_base_cur_amt_p = "purc_base_cur_amt_p";
	public static final String $purc_base_cur_inc_tax_amt_p = "purc_base_cur_inc_tax_amt_p";
	public static final String $purc_base_cur_tax_amt_p = "purc_base_cur_tax_amt_p";
	public static final String $purc_base_cur_dscnt_amt_p = "purc_base_cur_dscnt_amt_p";
	/**
	 * Taxpaying date 納税日.<p>
	 *
	 */
	public static final String $ptax_dt = "ptax_dt";
	public static final String $purc_ptax_cur_upri_p = "purc_ptax_cur_upri_p";
	public static final String $purc_ptax_cur_amt_p = "purc_ptax_cur_amt_p";
	public static final String $purc_ptax_cur_inc_tax_amt_p = "purc_ptax_cur_inc_tax_amt_p";
	public static final String $purc_ptax_cur_tax_amt_p = "purc_ptax_cur_tax_amt_p";
	public static final String $purc_ptax_cur_dscnt_amt_p = "purc_ptax_cur_dscnt_amt_p";
	/**
	 * Purchase reason cd. 仕入理由ＣＤ.<p>
	 *
	 */
	public static final String $purc_rsn_cd = "purc_rsn_cd";
	/**
	 * Purchase reason name 仕入理由名.<p>
	 *
	 */
	public static final String $purc_rsn_nm = "purc_rsn_nm";
	/**
	 * Purchase charged dept. cd. 仕入負担部門ＣＤ.<p>
	 *
	 */
	public static final String $purc_bd_dpt_cd = "purc_bd_dpt_cd";
	/**
	 * Purchase charged dept. name 仕入負担部門名.<p>
	 *
	 */
	public static final String $purc_bd_dpt_nm = "purc_bd_dpt_nm";
	/**
	 * Purchase withholding tax rate 仕入源泉税率.<p>
	 *
	 */
	public static final String $purc_wtax_rate = "purc_wtax_rate";
	/**
	 * Purchase withholding tax amount 仕入源泉税額.<p>
	 *
	 */
	public static final String $purc_wtax_amt = "purc_wtax_amt";
	public static final String $purc_qty_p = "purc_qty_p";
	/**
	 * Base unit purchase scheduled qty. 基準単位仕入予定数量.<p>
	 *
	 */
	public static final String $base_unit_purc_schd_qty = "base_unit_purc_schd_qty";
	/**
	 * PO sheet remarks 注文書備考.<p>
	 *
	 */
	public static final String $po_print_rmrks = "po_print_rmrks";
	/**
	 * PO sheet details remarks 注文書明細備考.<p>
	 *
	 */
	public static final String $po_print_d_rmrks = "po_print_d_rmrks";
	/**
	 * Sales order details No. 受注明細ＮＯ.<p>
	 *
	 */
	public static final String $slo_d_no = "slo_d_no";
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
	 * Sublot management type サブロット管理区分.<p>
	 *
	 */
	public static final String $sublot_mng_typ = "sublot_mng_typ";
	/**
	 * Lot No. type ロットＮＯ区分.<p>
	 *
	 */
	public static final String $lot_no_typ = "lot_no_typ";
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
	 * Inventory management type 在庫管理区分.<p>
	 *
	 */
	public static final String $stk_mng_typ = "stk_mng_typ";
	/**
	 * Discount item 値引品目.<p>
	 *
	 */
	public static final String $dscnt_itm_flg = "dscnt_itm_flg";
	/**
	 * Billing carry-over count 請求繰越回数.<p>
	 *
	 */
	public static final String $itm_bill_crryovr_times = "itm_bill_crryovr_times";
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
	 * For active ingredient 有効成分対象.<p>
	 *
	 */
	public static final String $cont_fctr_flg = "cont_fctr_flg";
	/**
	 * Rounding type (Active ingredient conversion) 有効成分換算端数処理区分.<p>
	 *
	 */
	public static final String $cont_fctr_rnd_typ = "cont_fctr_rnd_typ";
	/**
	 * Active ingredient number of decimal places 有効成分小数部有効桁数.<p>
	 *
	 */
	public static final String $cont_fctr_dec_place = "cont_fctr_dec_place";
	/**
	 * For version control 版管理対象.<p>
	 *
	 */
	public static final String $ver_flg = "ver_flg";
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
	 * Sales other accounting 販売他勘定.<p>
	 *
	 */
	public static final String $sls_acxfr_flg = "sls_acxfr_flg";
	/**
	 * Expense purchase 経費購買.<p>
	 *
	 */
	public static final String $xpns_purc_flg = "xpns_purc_flg";
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
	 * Sales result details sequence number 売上実績明細連番.<p>
	 *
	 */
	public static final String $sls_act_d_seq = "sls_act_d_seq";
	/**
	 * Sales schedule No. 売上予定ＮＯ.<p>
	 *
	 */
	public static final String $sls_schd_no = "sls_schd_no";
	/**
	 * Purchase schedule No. 仕入予定ＮＯ.<p>
	 *
	 */
	public static final String $purc_schd_no = "purc_schd_no";
	/**
	 * Details row ID 明細行ＩＤ.<p>
	 *
	 */
	public static final String $dtl_row_id = "dtl_row_id";
	/**
	 * Receipt progress No. 入荷進捗ＮＯ.<p>
	 *
	 */
	public static final String $arr_pr_no = "arr_pr_no";
	/**
	 * Shipping progress No. 出荷進捗ＮＯ.<p>
	 *
	 */
	public static final String $ship_pr_no = "ship_pr_no";
	public static final String $outsrc_flg = "outsrc_flg";
	/**
	 * Set lot to be received 入荷予定ロット指定.<p>
	 *
	 */
	public static final String $arr_schd_lot_fix_flg = "arr_schd_lot_fix_flg";
	/**
	 * For market release decision 市場出荷判定対象.<p>
	 *
	 */
	public static final String $mrkt_judg_flg = "mrkt_judg_flg";
	/**
	 * Scheduled unit price (Base unit) 予定単価(基準単位）.<p>
	 *
	 */
	public static final String $base_unit_upri = "base_unit_upri";
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
	 * Update counter (Receipt progress) 更新カウンタ（入荷進捗）.<p>
	 *
	 */
	public static final String $arr_pr_upd_cntr = "arr_pr_upd_cntr";
	/**
	 * Update counter (Shipping progress) 更新カウンタ（出荷進捗）.<p>
	 *
	 */
	public static final String $ship_pr_upd_cntr = "ship_pr_upd_cntr";
	/**
	 * Initial scheduled amount 当初予定金額.<p>
	 *
	 */
	public static final String $init_schd_amt = "init_schd_amt";
	/**
	 * Transaction unit conversion conversion base qty. at schedule 予定時取引単位分母数量.<p>
	 *
	 */
	public static final String $schd_trd_unit_conv_base_qty = "schd_trd_unit_conv_base_qty";
	/**
	 * Transaction unit conversion qty. at schedule 予定時取引単位換算数量.<p>
	 *
	 */
	public static final String $schd_trd_unit_conv_qty = "schd_trd_unit_conv_qty";
	/**
	 * Simultaneous recording (Before change) 同時計上(変更前).<p>
	 *
	 */
	public static final String $org_sync_flg = "org_sync_flg";
	/**
	 * Initial purchase scheduled qty. (Base unit) 当初仕入予定数量（基準単位）.<p>
	 *
	 */
	public static final String $purc_schd_init_qty = "purc_schd_init_qty";
	/**
	 * Initial purchase scheduled discount amount 当初仕入予定値引額.<p>
	 *
	 */
	public static final String $purc_schd_init_dscnt_amt = "purc_schd_init_dscnt_amt";
	/**
	 * Initial purchase scheduled amount 当初仕入予定金額.<p>
	 *
	 */
	public static final String $purc_schd_init_amt = "purc_schd_init_amt";
	/**
	 * Rounding type (Sales amount) 売上金額端数処理区分.<p>
	 *
	 */
	public static final String $purc_amt_rnd_typ = "purc_amt_rnd_typ";
	/**
	 * Rounding type (Sales unit price) 売上単価端数処理区分.<p>
	 *
	 */
	public static final String $purc_upri_rnd_typ = "purc_upri_rnd_typ";
	/**
	 * Sales tax rounding type 売上税端数処理区分.<p>
	 *
	 */
	public static final String $purc_tax_rnd_typ = "purc_tax_rnd_typ";
	/**
	 * Purchase transaction amount number of decimal places 仕入取引金額小数部有効桁数.<p>
	 *
	 */
	public static final String $purc_trd_cur_amt_dec_place = "purc_trd_cur_amt_dec_place";
	/**
	 * Purchase transaction unit price number of decimal places 仕入取引単価小数部有効桁数.<p>
	 *
	 */
	public static final String $purc_trd_cur_upri_dec_place = "purc_trd_cur_upri_dec_place";
	/**
	 * Purchase schedule transaction unit conversion base qty. 仕入予定取引単位分母数量.<p>
	 *
	 */
	public static final String $purc_s_trd_unit_conv_base_qty = "purc_s_trd_unit_conv_base_qty";
	/**
	 * Purchase schedule transaction unit conversion qty. 仕入予定取引単位換算数量.<p>
	 *
	 */
	public static final String $purc_s_trd_unit_conv_qty = "purc_s_trd_unit_conv_qty";
	/**
	 * Purchase transaction unit cd. 仕入取引単位ＣＤ.<p>
	 *
	 */
	public static final String $purc_trd_unit_cd = "purc_trd_unit_cd";
	public static final String $purc_trd_unit_qty_p = "purc_trd_unit_qty_p";
	public static final String $purc_base_unit_qty_p = "purc_base_unit_qty_p";
	/**
	 * Purchase transaction unit conversion base qty. 仕入取引単位分母数量.<p>
	 *
	 */
	public static final String $purc_trd_unit_conv_base_qty = "purc_trd_unit_conv_base_qty";
	/**
	 * Purchase transaction unit conversion qty. 仕入取引単位換算数量.<p>
	 *
	 */
	public static final String $purc_trd_unit_conv_qty = "purc_trd_unit_conv_qty";
	/**
	 * Purchase transaction unit number of decimal places 仕入取引単位小数部有効桁数.<p>
	 *
	 */
	public static final String $purc_trd_unit_dec_place = "purc_trd_unit_dec_place";
	/**
	 * Purchase date (For exchange rate component) 仕入日（為替レート部品用）.<p>
	 *
	 */
	public static final String $xrate_purc_dt = "xrate_purc_dt";
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
	/**
	 * Transaction unit cd. before change 変更前取引単位ＣＤ.<p>
	 *
	 */
	public static final String $db_trd_unit_cd = "db_trd_unit_cd";
	/**
	 * Transaction unit conversion qty. before change 変更前取引単位換算数量.<p>
	 *
	 */
	public static final String $db_trd_unit_conv_qty = "db_trd_unit_conv_qty";
	/**
	 * Conversion base qty. in transaction unit before change 変更前取引単位換算基準数量.<p>
	 *
	 */
	public static final String $db_trd_unit_conv_base_qty = "db_trd_unit_conv_base_qty";
	/**
	 * Transaction unit number of decimal places before change 変更前取引単位小数部有効桁数.<p>
	 *
	 */
	public static final String $db_trd_unit_dec_place = "db_trd_unit_dec_place";
	/**
	 * Transaction unit rounding type before change 変更前取引単位端数処理区分.<p>
	 *
	 */
	public static final String $db_trd_unit_rnd_typ = "db_trd_unit_rnd_typ";
	/**
	 * Transaction unit qty. before change 変更前取引単位数量.<p>
	 *
	 */
	public static final String $db_trd_unit_qty = "db_trd_unit_qty";
	/**
	 * Amount (Transaction currency) before change 変更前取引通貨金額.<p>
	 *
	 */
	public static final String $db_trd_cur_amt = "db_trd_cur_amt";
	/**
	 * (Before change) Discount amount (Transaction currency) 変更前取引通貨値引額.<p>
	 *
	 */
	public static final String $db_trd_cur_dscnt_amt = "db_trd_cur_dscnt_amt";
	/**
	 * Amount (Transaction currency) before change 変更前取引通貨金額.<p>
	 *
	 */
	public static final String $db_trd_cur_tax_amt = "db_trd_cur_tax_amt";
	/**
	 * (Before change) Unit price (Transaction currency) 変更前取引通貨単価.<p>
	 *
	 */
	public static final String $db_trd_cur_upri = "db_trd_cur_upri";
	/**
	 * Withholding tax rate before change 変更前源泉税率.<p>
	 *
	 */
	public static final String $db_wtax_rate = "db_wtax_rate";
	/**
	 * Tax rate before change 変更前税率.<p>
	 *
	 */
	public static final String $db_tax_rate = "db_tax_rate";
	/**
	 * Tax inclusive flg. before change 変更前内税ＦＬＧ.<p>
	 *
	 */
	public static final String $db_inc_tax_flg = "db_inc_tax_flg";
	/**
	 * Initial purchase transaction currency tax amount 仕入当初取引通貨税額.<p>
	 *
	 */
	public static final String $purc_init_trd_cur_tax_amt = "purc_init_trd_cur_tax_amt";
	/**
	 * Initial purchase transaction unit cd. 仕入当初取引単位ＣＤ.<p>
	 *
	 */
	public static final String $purc_init_trd_unit_cd = "purc_init_trd_unit_cd";
	/**
	 * Initial purchase transaction unit qty. 仕入当初取引単位数量.<p>
	 *
	 */
	public static final String $purc_init_trd_unit_qty = "purc_init_trd_unit_qty";
	/**
	 * Initial purchase transaction currency unit price 仕入当初取引通貨単価.<p>
	 *
	 */
	public static final String $purc_init_trd_cur_upri = "purc_init_trd_cur_upri";
	/**
	 * Initial purchase tax inclusive 仕入当初内税.<p>
	 *
	 */
	public static final String $purc_init_inc_tax_flg = "purc_init_inc_tax_flg";
	/**
	 * Initial purchase tax rate 仕入当初税率.<p>
	 *
	 */
	public static final String $purc_init_tax_rate = "purc_init_tax_rate";
	/**
	 * Initial purchase transaction currency discount amount 仕入当初取引通貨値引額.<p>
	 *
	 */
	public static final String $purc_init_trd_cur_dscnt_amt = "purc_init_trd_cur_dscnt_amt";
	/**
	 * Transaction unit cd. before change in purchase 仕入変更前取引単位ＣＤ.<p>
	 *
	 */
	public static final String $purc_db_trd_unit_cd = "purc_db_trd_unit_cd";
	/**
	 * Transaction unit conversion qty. before change in purchase 仕入変更前取引単位換算数量.<p>
	 *
	 */
	public static final String $purc_db_trd_unit_conv_qty = "purc_db_trd_unit_conv_qty";
	/**
	 * Conversion base qty. in transaction unit before change in purchase 仕入変更前取引単位換算基準数量.<p>
	 *
	 */
	public static final String $purc_db_trd_unit_conv_base_qty = "purc_db_trd_unit_conv_base_qty";
	/**
	 * Transaction unit number of decimal places before change in purchase 仕入変更前取引単位小数部有効桁数.<p>
	 *
	 */
	public static final String $purc_db_trd_unit_dec_place = "purc_db_trd_unit_dec_place";
	/**
	 * Transaction unit rounding type before change in purchase 仕入変更前取引単位端数処理区分.<p>
	 *
	 */
	public static final String $purc_db_trd_unit_rnd_typ = "purc_db_trd_unit_rnd_typ";
	/**
	 * Transaction unit qty. before change in purchase 仕入変更前取引単位数量.<p>
	 *
	 */
	public static final String $purc_db_trd_unit_qty = "purc_db_trd_unit_qty";
	/**
	 * Amount (Transaction currency) before change in purchase 仕入変更前取引通貨金額.<p>
	 *
	 */
	public static final String $purc_db_trd_cur_amt = "purc_db_trd_cur_amt";
	/**
	 * Discount amount (Transaction currency) before change in purchase 仕入変更前取引通貨値引額.<p>
	 *
	 */
	public static final String $purc_db_trd_cur_dscnt_amt = "purc_db_trd_cur_dscnt_amt";
	/**
	 * Amount (Transaction currency) before change in purchase 仕入変更前取引通貨金額.<p>
	 *
	 */
	public static final String $purc_db_trd_cur_tax_amt = "purc_db_trd_cur_tax_amt";
	/**
	 * Unit price (Transaction currency) before change in purchase 仕入変更前取引通貨単価.<p>
	 *
	 */
	public static final String $purc_db_trd_cur_upri = "purc_db_trd_cur_upri";
	/**
	 * Tax rate before change in purchase 仕入変更前税率.<p>
	 *
	 */
	public static final String $purc_db_tax_rate = "purc_db_tax_rate";
	/**
	 * Tax inclusive flg. before change in purchase 仕入変更前内税ＦＬＧ.<p>
	 *
	 */
	public static final String $purc_db_inc_tax_flg = "purc_db_inc_tax_flg";
	public static final String $purc_schd_init_ex_amt = "purc_schd_init_ex_amt";
	/**
	 * Before change base unit qty. 変更前基準単位数量.<p>
	 *
	 */
	public static final String $base_unit_qty_bef = "base_unit_qty_bef";
	/**
	 * Purchase/Acceptance detective qty. 仕入・検収不良数量.<p>
	 *
	 */
	public static final String $base_unit_purc_qty = "base_unit_purc_qty";

	public static final String $itm_cd = $itm_p + ".itm_cd";
	public static final String $itm_sub1 = $itm_p + ".itm_sub1";
	public static final String $itm_sub2 = $itm_p + ".itm_sub2";
	public static final String $itm_sub3 = $itm_p + ".itm_sub3";
	public static final String $itm_nm = $itm_p + ".itm_nm";
	public static final String $dlv_cd = $dlv_p + ".bp_cd";
	public static final String $dlv_nm = $dlv_p + ".bp_nm";
	public static final String $dlv_sundry_flg = $dlv_p + ".dlv_sundry_flg";
	public static final String $dlv_zip_cd = $dlv_p + ".zip_cd";
	public static final String $dlv_addr1 = $dlv_p + ".addr1";
	public static final String $dlv_addr2 = $dlv_p + ".addr2";
	public static final String $dlv_addr3 = $dlv_p + ".addr3";
	public static final String $dlv_addr4 = $dlv_p + ".addr4";
	public static final String $dlv_cntct_dpt = $dlv_p + ".dlv_cntct_dpt";
	public static final String $dlv_cntct_psn = $dlv_p + ".dlv_cntct_psn";
	public static final String $dlv_tel = $dlv_p + ".tel";
	public static final String $dlv_fax = $dlv_p + ".fax";
	public static final String $cntry_cd = $dlv_p + ".cntry_cd";
	public static final String $cntry_nm = $dlv_p + ".cntry_nm";
	public static final String $pri_prnt_flg = $dlv_p + ".pri_prnt_flg";
	public static final String $lg_grp_cd = $dlv_p + ".lg_grp_cd";
	public static final String $lg_grp_nm = $dlv_p + ".lg_grp_nm";
	public static final String $trd_unit_qty = $trd_unit_qty_p + ".qty";
	public static final String $base_unit_qty = $base_unit_qty_p + ".qty";
	public static final String $sls_schd_qty = $sls_schd_qty_p + ".qty";
	public static final String $sls_qty = $sls_qty_p + ".qty";
	public static final String $upri_not_tgt_flg = $trd_upri_amt_p + ".upri_not_tgt_flg";
	public static final String $trd_cur_upri = $trd_upri_amt_p + ".trd_cur_upri";
	public static final String $interim_flg = $trd_upri_amt_p + ".interim_flg";
	public static final String $trd_cur_amt = $trd_upri_amt_p + ".trd_cur_amt";
	public static final String $trd_cur_inc_tax_amt = $trd_upri_amt_p + ".trd_cur_inc_tax_amt";
	public static final String $tax_fix_flg = $trd_upri_amt_p + ".tax_fix_flg";
	public static final String $tax_cd = $trd_upri_amt_p + ".tax_cd";
	public static final String $tax_nm = $trd_upri_amt_p + ".tax_nm";
	public static final String $tax_rate = $trd_upri_amt_p + ".tax_rate";
	public static final String $tax_typ = $trd_upri_amt_p + ".tax_typ";
	public static final String $inc_tax_flg = $trd_upri_amt_p + ".inc_tax_flg";
	public static final String $trd_cur_tax_amt = $trd_upri_amt_p + ".trd_cur_tax_amt";
	public static final String $trd_cur_dscnt_amt = $trd_upri_amt_p + ".trd_cur_dscnt_amt";
	public static final String $dscnt_rsn_cd = $trd_upri_amt_p + ".dscnt_rsn_cd";
	public static final String $dscnt_rsn_nm = $trd_upri_amt_p + ".dscnt_rsn_nm";
	public static final String $cost_upri = $cost_upri_p + ".upri";
	public static final String $cost_amt = $cost_amt_p + ".amt";
	public static final String $base_cur_upri = $base_cur_upri_p + ".upri";
	public static final String $base_cur_amt = $base_cur_amt_p + ".amt";
	public static final String $base_cur_inc_tax_amt = $base_cur_inc_tax_amt_p + ".amt";
	public static final String $base_cur_tax_amt = $base_cur_tax_amt_p + ".amt";
	public static final String $base_cur_dscnt_amt = $base_cur_dscnt_amt_p + ".amt";
	public static final String $ptax_cur_upri = $ptax_cur_upri_p + ".upri";
	public static final String $ptax_cur_amt = $ptax_cur_amt_p + ".amt";
	public static final String $ptax_cur_inc_tax_amt = $ptax_cur_inc_tax_amt_p + ".amt";
	public static final String $ptax_cur_tax_amt = $ptax_cur_tax_amt_p + ".amt";
	public static final String $ptax_cur_dscnt_amt = $ptax_cur_dscnt_amt_p + ".amt";
	public static final String $wtax_amt = $wtax_amt_p + ".amt";
	public static final String $crt_lot_flg = $lot_no_p + ".crt_lot_flg";
	public static final String $lot_no = $lot_no_p + ".lot_no";
	public static final String $sublot_no = $lot_no_p + ".sublot_no";
	public static final String $ver_no = $ver_no_p + ".ver_no";
	public static final String $purc_cont_qty = $purc_cont_qty_p + ".purc_cont_qty";
	public static final String $purc_cont_fctr = $purc_cont_fctr_p + ".purc_cont_fctr";
	public static final String $std_cont_qty = $std_cont_qty_p + ".cont_qty";
	public static final String $cont_fctr_unit_cd = $cont_fctr_unit_p + ".cont_fctr_unit_cd";
	public static final String $cont_fctr_unit_nm = $cont_fctr_unit_p + ".cont_fctr_unit_nm";
	public static final String $std_cont_fctr = $std_cont_fctr_p + ".std_cont_fctr";
	public static final String $sno1 = $sno_wrk_no_p + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno1 + "";
	public static final String $sno2 = $sno_wrk_no_p + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno2 + "";
	public static final String $sno3 = $sno_wrk_no_p + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno3 + "";
	public static final String $sno4 = $sno_wrk_no_p + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno4 + "";
	public static final String $wrk_no = $sno_wrk_no_p + ".wrk_no";
	public static final String $wrk_nm = $sno_wrk_no_p + ".wrk_nm";
	public static final String $purc_xrate = $purc_xrate_p + ".xrate";
	public static final String $purc_ptax_xrate = $purc_ptax_xrate_p + ".xrate";
	public static final String $purc_upri_not_tgt_flg = $purc_trd_upri_amt_p + ".upri_not_tgt_flg";
	public static final String $purc_trd_cur_upri = $purc_trd_upri_amt_p + ".trd_cur_upri";
	public static final String $purc_interim_flg = $purc_trd_upri_amt_p + ".interim_flg";
	public static final String $purc_trd_cur_amt = $purc_trd_upri_amt_p + ".trd_cur_amt";
	public static final String $purc_trd_cur_inc_tax_amt = $purc_trd_upri_amt_p + ".trd_cur_inc_tax_amt";
	public static final String $purc_tax_fix_flg = $purc_trd_upri_amt_p + ".tax_fix_flg";
	public static final String $purc_tax_cd = $purc_trd_upri_amt_p + ".tax_cd";
	public static final String $purc_tax_nm = $purc_trd_upri_amt_p + ".tax_nm";
	public static final String $purc_tax_rate = $purc_trd_upri_amt_p + ".tax_rate";
	public static final String $purc_tax_typ = $purc_trd_upri_amt_p + ".tax_typ";
	public static final String $purc_inc_tax_flg = $purc_trd_upri_amt_p + ".inc_tax_flg";
	public static final String $purc_trd_cur_tax_amt = $purc_trd_upri_amt_p + ".trd_cur_tax_amt";
	public static final String $purc_trd_cur_dscnt_amt = $purc_trd_upri_amt_p + ".trd_cur_dscnt_amt";
	public static final String $purc_dscnt_rsn_cd = $purc_trd_upri_amt_p + ".dscnt_rsn_cd";
	public static final String $purc_dscnt_rsn_nm = $purc_trd_upri_amt_p + ".dscnt_rsn_nm";
	public static final String $purc_base_cur_upri = $purc_base_cur_upri_p + ".upri";
	public static final String $purc_base_cur_amt = $purc_base_cur_amt_p + ".amt";
	public static final String $purc_base_cur_inc_tax_amt = $purc_base_cur_inc_tax_amt_p + ".amt";
	public static final String $purc_base_cur_tax_amt = $purc_base_cur_tax_amt_p + ".amt";
	public static final String $purc_base_cur_dscnt_amt = $purc_base_cur_dscnt_amt_p + ".amt";
	public static final String $purc_ptax_cur_upri = $purc_ptax_cur_upri_p + ".upri";
	public static final String $purc_ptax_cur_amt = $purc_ptax_cur_amt_p + ".amt";
	public static final String $purc_ptax_cur_inc_tax_amt = $purc_ptax_cur_inc_tax_amt_p + ".amt";
	public static final String $purc_ptax_cur_tax_amt = $purc_ptax_cur_tax_amt_p + ".amt";
	public static final String $purc_ptax_cur_dscnt_amt = $purc_ptax_cur_dscnt_amt_p + ".amt";
	public static final String $purc_qty = $purc_qty_p + ".qty";
	public static final String $purc_trd_unit_qty = $purc_trd_unit_qty_p + ".qty";
	public static final String $purc_base_unit_qty = $purc_base_unit_qty_p + ".qty";

	public static final MCMeta sync_flg_META = createCommonMeta($sync_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta abort_flg_META = createCommonMeta($abort_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta dlv_schd_dt_META = createCommonMeta($dlv_schd_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta itm_p_META = createInnerRowMeta($itm_p, mcframe.clientMAUB.MAUBP5030.ItmR.class);
	public static final MCMeta cst_itm_cd_META = createCommonMeta($cst_itm_cd, mcframe.commonMA.meta.MA_META.BP_ITM_CD);
	public static final MCMeta cst_itm_nm_META = createCommonMeta($cst_itm_nm, mcframe.commonMA.meta.MA_META.BP_ITM_NM);
	public static final MCMeta asset_mng_typ_META = createCommonMeta($asset_mng_typ, mcframe.commonMA.meta.MA_META.ASSET_MNG_TYP);
	public static final MCMeta asset_mng_typ_nm_META = createCommonMeta($asset_mng_typ_nm, mcframe.commonMA.meta.MA_META.ASSET_MNG_TYP_NM);
	public static final MCMeta sundry_itm_flg_META = createCommonMeta($sundry_itm_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta dlv_p_META = createInnerRowMeta($dlv_p, mcframe.clientMAUB.MAUBP5400.DlvR.class);
	public static final MCMeta dest_cd1_META = createCommonMeta($dest_cd1, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta dest_nm1_META = createCommonMeta($dest_nm1, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta dest_cd2_META = createCommonMeta($dest_cd2, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta dest_nm2_META = createCommonMeta($dest_nm2, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta dest_cd3_META = createCommonMeta($dest_cd3, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta dest_nm3_META = createCommonMeta($dest_nm3, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta trd_unit_cd_META = createCommonMeta($trd_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta trd_unit_nm_META = createCommonMeta($trd_unit_nm, mcframe.commonMA.meta.MA_META.UNIT_NM);
	public static final MCMeta trd_unit_qty_p_META = createInnerRowMeta($trd_unit_qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta base_unit_cd_META = createCommonMeta($base_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta base_unit_nm_META = createCommonMeta($base_unit_nm, mcframe.commonMA.meta.MA_META.UNIT_NM);
	public static final MCMeta base_unit_qty_p_META = createInnerRowMeta($base_unit_qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta sls_schd_qty_p_META = createInnerRowMeta($sls_schd_qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta sls_qty_p_META = createInnerRowMeta($sls_qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta sls_dtl_upd_flg_META = createCommonMeta($sls_dtl_upd_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta trd_upri_amt_p_META = createInnerRowMeta($trd_upri_amt_p, mcframe.clientMSUB.MSUBP5070.TrdUpriAmtR.class);
	public static final MCMeta cost_upri_p_META = createInnerRowMeta($cost_upri_p, mcframe.clientMAUB.MAUBP5060.UpriR.class);
	public static final MCMeta cost_amt_p_META = createInnerRowMeta($cost_amt_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta prof_rate_META = createCommonMeta($prof_rate, mcframe.commonMA.meta.MA_META.RATE);
	public static final MCMeta base_cur_upri_p_META = createInnerRowMeta($base_cur_upri_p, mcframe.clientMAUB.MAUBP5060.UpriR.class);
	public static final MCMeta base_cur_amt_p_META = createInnerRowMeta($base_cur_amt_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta base_cur_inc_tax_amt_p_META = createInnerRowMeta($base_cur_inc_tax_amt_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta base_cur_tax_amt_p_META = createInnerRowMeta($base_cur_tax_amt_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta base_cur_dscnt_amt_p_META = createInnerRowMeta($base_cur_dscnt_amt_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta ptax_cur_upri_p_META = createInnerRowMeta($ptax_cur_upri_p, mcframe.clientMAUB.MAUBP5060.UpriR.class);
	public static final MCMeta ptax_cur_amt_p_META = createInnerRowMeta($ptax_cur_amt_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta ptax_cur_inc_tax_amt_p_META = createInnerRowMeta($ptax_cur_inc_tax_amt_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta ptax_cur_tax_amt_p_META = createInnerRowMeta($ptax_cur_tax_amt_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta ptax_cur_dscnt_amt_p_META = createInnerRowMeta($ptax_cur_dscnt_amt_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta bill_crryovr_times_META = createCommonMeta($bill_crryovr_times, mcframe.commonMA.meta.MA_META.CRRYOVR_TIMES);
	public static final MCMeta gd_cd_META = createCommonMeta($gd_cd, mcframe.commonMA.meta.MA_META.STK_GD_CD);
	public static final MCMeta gd_nm_META = createCommonMeta($gd_nm, mcframe.commonMA.meta.MA_META.STK_GD_NM);
	public static final MCMeta cst_po_d_no_META = createCommonMeta($cst_po_d_no, mcframe.commonMA.meta.MA_META.CST_PO_D_NO);
	public static final MCMeta sls_rsn_cd_META = createCommonMeta($sls_rsn_cd, mcframe.commonMA.meta.MA_META.BIZ_RSN_CD);
	public static final MCMeta sls_rsn_nm_META = createCommonMeta($sls_rsn_nm, mcframe.commonMA.meta.MA_META.BIZ_RSN_NM);
	public static final MCMeta bd_dpt_cd_META = createCommonMeta($bd_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta bd_dpt_nm_META = createCommonMeta($bd_dpt_nm, mcframe.commonMA.meta.MA_META.DPT_NM);
	public static final MCMeta wtax_rate_META = createCommonMeta($wtax_rate, mcframe.commonMA.meta.MA_META.WTAX_RATE);
	public static final MCMeta wtax_amt_p_META = createInnerRowMeta($wtax_amt_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta ext_sys_cd_META = createCommonMeta($ext_sys_cd, mcframe.commonMA.meta.MA_META.EXT_SYS_CD);
	public static final MCMeta ext_sys_nm_META = createCommonMeta($ext_sys_nm, mcframe.commonMA.meta.MA_META.EXT_SYS_NM);
	public static final MCMeta ext_purc_act_d_no_META = createCommonMeta($ext_purc_act_d_no, mcframe.commonMA.meta.MA_META.PURC_ACT_D_NO);
	public static final MCMeta trd_d_rmrks_META = createCommonMeta($trd_d_rmrks, mcframe.commonMA.meta.MA_META.TRD_D_RMRKS);
	public static final MCMeta intr_rmrks_META = createCommonMeta($intr_rmrks, mcframe.commonMS.meta.MS_META.SLS_ACT_D_INTR_RMRKS);
	public static final MCMeta sub_char1_META = createCommonMeta($sub_char1, mcframe.commonMS.meta.MS_META.SLS_ACT_D_SUB_CHAR1);
	public static final MCMeta sub_char2_META = createCommonMeta($sub_char2, mcframe.commonMS.meta.MS_META.SLS_ACT_D_SUB_CHAR2);
	public static final MCMeta sub_char3_META = createCommonMeta($sub_char3, mcframe.commonMS.meta.MS_META.SLS_ACT_D_SUB_CHAR3);
	public static final MCMeta sls_act_d_no_META = createCommonMeta($sls_act_d_no, mcframe.commonMA.meta.MA_META.SLS_ACT_D_NO);
	public static final MCMeta purc_ac_ym_META = createCommonMeta($purc_ac_ym, mcframe.commonMA.meta.MA_META.YM);
	public static final MCMeta purc_ac_dt_META = createCommonMeta($purc_ac_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta purc_dt_META = createCommonMeta($purc_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta purc_act_no_META = createCommonMeta($purc_act_no, mcframe.commonMA.meta.MA_META.PURC_ACT_NO);
	public static final MCMeta purc_act_d_no_META = createCommonMeta($purc_act_d_no, mcframe.commonMA.meta.MA_META.PURC_ACT_D_NO);
	public static final MCMeta po_no_META = createCommonMeta($po_no, mcframe.commonMA.meta.MA_META.PO_NO);
	public static final MCMeta po_d_no_META = createCommonMeta($po_d_no, mcframe.commonMA.meta.MA_META.PO_D_NO);
	public static final MCMeta sppl_cd_META = createCommonMeta($sppl_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta sppl_nm_META = createCommonMeta($sppl_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta sppl_iv_flg_META = createCommonMeta($sppl_iv_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta subcon_flg_META = createCommonMeta($subcon_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta maker_cd_META = createCommonMeta($maker_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta maker_nm_META = createCommonMeta($maker_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta bp_dlv_slip_no_META = createCommonMeta($bp_dlv_slip_no, mcframe.commonMA.meta.MA_META.BP_DLV_SLIP_NO);
	public static final MCMeta bp_dlv_slip_d_no_META = createCommonMeta($bp_dlv_slip_d_no, mcframe.commonMA.meta.MA_META.BP_DLV_SLIP_D_NO);
	public static final MCMeta lot_no_p_META = createInnerRowMeta($lot_no_p, mcframe.clientMSUB.MSUBP5030.LotNoR.class);
	public static final MCMeta bp_lot_no_META = createCommonMeta($bp_lot_no, mcframe.commonMA.meta.MA_META.BP_LOT_NO);
	public static final MCMeta ship_fr_valid_dt_META = createCommonMeta($ship_fr_valid_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta ver_no_p_META = createInnerRowMeta($ver_no_p, mcframe.clientMAUB.MAUBP5250.VerNoR.class);
	public static final MCMeta purc_cont_qty_p_META = createInnerRowMeta($purc_cont_qty_p, mcframe.clientMAUB.MAUBP5300.PurcContQtyR.class);
	public static final MCMeta purc_cont_fctr_p_META = createInnerRowMeta($purc_cont_fctr_p, mcframe.clientMAUB.MAUBP5330.PurcContFctrR.class);
	public static final MCMeta std_cont_qty_p_META = createInnerRowMeta($std_cont_qty_p, mcframe.clientMAUB.MAUBP5260.ContQtyR.class);
	public static final MCMeta cont_fctr_unit_p_META = createInnerRowMeta($cont_fctr_unit_p, mcframe.clientMAUB.MAUBP5270.ContFctrUnitR.class);
	public static final MCMeta std_cont_fctr_p_META = createInnerRowMeta($std_cont_fctr_p, mcframe.clientMAUB.MAUBP5280.StdContFctrR.class);
	public static final MCMeta sno_wrk_no_p_META = createInnerRowMeta($sno_wrk_no_p, mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.class);
	public static final MCMeta purc_trd_cur_cd_META = createCommonMeta($purc_trd_cur_cd, mcframe.commonMA.meta.MA_META.CUR_CD);
	public static final MCMeta purc_trd_cur_nm_META = createCommonMeta($purc_trd_cur_nm, mcframe.commonMA.meta.MA_META.CUR_NM);
	public static final MCMeta purc_xrate_inpt_flg_META = createCommonMeta($purc_xrate_inpt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta purc_xrate_p_META = createInnerRowMeta($purc_xrate_p, mcframe.clientMAUB.MAUBP5390.XrateR.class);
	public static final MCMeta purc_ptax_xrate_inpt_flg_META = createCommonMeta($purc_ptax_xrate_inpt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta purc_ptax_xrate_p_META = createInnerRowMeta($purc_ptax_xrate_p, mcframe.clientMAUB.MAUBP5390.XrateR.class);
	public static final MCMeta purc_dtl_upd_flg_META = createCommonMeta($purc_dtl_upd_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta purc_trd_upri_amt_p_META = createInnerRowMeta($purc_trd_upri_amt_p, mcframe.clientMSUB.MSUBP5070.TrdUpriAmtR.class);
	public static final MCMeta purc_base_cur_upri_p_META = createInnerRowMeta($purc_base_cur_upri_p, mcframe.clientMAUB.MAUBP5060.UpriR.class);
	public static final MCMeta purc_base_cur_amt_p_META = createInnerRowMeta($purc_base_cur_amt_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta purc_base_cur_inc_tax_amt_p_META = createInnerRowMeta($purc_base_cur_inc_tax_amt_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta purc_base_cur_tax_amt_p_META = createInnerRowMeta($purc_base_cur_tax_amt_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta purc_base_cur_dscnt_amt_p_META = createInnerRowMeta($purc_base_cur_dscnt_amt_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta ptax_dt_META = createCommonMeta($ptax_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta purc_ptax_cur_upri_p_META = createInnerRowMeta($purc_ptax_cur_upri_p, mcframe.clientMAUB.MAUBP5060.UpriR.class);
	public static final MCMeta purc_ptax_cur_amt_p_META = createInnerRowMeta($purc_ptax_cur_amt_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta purc_ptax_cur_inc_tax_amt_p_META = createInnerRowMeta($purc_ptax_cur_inc_tax_amt_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta purc_ptax_cur_tax_amt_p_META = createInnerRowMeta($purc_ptax_cur_tax_amt_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta purc_ptax_cur_dscnt_amt_p_META = createInnerRowMeta($purc_ptax_cur_dscnt_amt_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta purc_rsn_cd_META = createCommonMeta($purc_rsn_cd, mcframe.commonMA.meta.MA_META.BIZ_RSN_CD);
	public static final MCMeta purc_rsn_nm_META = createCommonMeta($purc_rsn_nm, mcframe.commonMA.meta.MA_META.BIZ_RSN_NM);
	public static final MCMeta purc_bd_dpt_cd_META = createCommonMeta($purc_bd_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta purc_bd_dpt_nm_META = createCommonMeta($purc_bd_dpt_nm, mcframe.commonMA.meta.MA_META.DPT_NM);
	public static final MCMeta purc_wtax_rate_META = createCommonMeta($purc_wtax_rate, mcframe.commonMA.meta.MA_META.WTAX_RATE);
	public static final MCMeta purc_wtax_amt_META = createCommonMeta($purc_wtax_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta purc_qty_p_META = createInnerRowMeta($purc_qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta base_unit_purc_schd_qty_META = createCommonMeta($base_unit_purc_schd_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta po_print_rmrks_META = createCommonMeta($po_print_rmrks, mcframe.commonMS.meta.MS_META.PO_PRINT_RMRKS);
	public static final MCMeta po_print_d_rmrks_META = createCommonMeta($po_print_d_rmrks, mcframe.commonMS.meta.MS_META.PO_PRINT_D_RMRKS);
	public static final MCMeta slo_d_no_META = createCommonMeta($slo_d_no, mcframe.commonMA.meta.MA_META.SLO_D_NO);
	public static final MCMeta disp_seq_META = createCommonMeta($disp_seq, mcframe.commonMA.meta.MA_META.DISP_SEQ);
	public static final MCMeta lot_mng_typ_META = createCommonMeta($lot_mng_typ, mcframe.commonMA.meta.MA_META.LOT_MNG_TYP);
	public static final MCMeta sublot_mng_typ_META = createCommonMeta($sublot_mng_typ, mcframe.commonMA.meta.MA_META.SUBLOT_MNG_TYP);
	public static final MCMeta lot_no_typ_META = createCommonMeta($lot_no_typ, mcframe.commonMA.meta.MA_META.LOT_NO_TYP);
	public static final MCMeta sublot_no_typ_META = createCommonMeta($sublot_no_typ, mcframe.commonMA.meta.MA_META.LOT_NO_TYP);
	public static final MCMeta sno1_mng_typ_META = createCommonMeta($sno1_mng_typ, mcframe.commonMA.meta.MA_META.SNO_MNG_TYP);
	public static final MCMeta sno2_mng_typ_META = createCommonMeta($sno2_mng_typ, mcframe.commonMA.meta.MA_META.SNO_MNG_TYP);
	public static final MCMeta sno3_mng_typ_META = createCommonMeta($sno3_mng_typ, mcframe.commonMA.meta.MA_META.SNO_MNG_TYP);
	public static final MCMeta sno4_mng_typ_META = createCommonMeta($sno4_mng_typ, mcframe.commonMA.meta.MA_META.SNO_MNG_TYP);
	public static final MCMeta stk_mng_typ_META = createCommonMeta($stk_mng_typ, mcframe.commonMA.meta.MA_META.STK_MNG_TYP);
	public static final MCMeta dscnt_itm_flg_META = createCommonMeta($dscnt_itm_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta itm_bill_crryovr_times_META = createCommonMeta($itm_bill_crryovr_times, mcframe.commonMA.meta.MA_META.CRRYOVR_TIMES);
	public static final MCMeta base_unit_dec_place_META = createCommonMeta($base_unit_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta base_unit_rnd_typ_META = createCommonMeta($base_unit_rnd_typ, mcframe.commonMA.meta.MA_META.RND_TYP);
	public static final MCMeta cont_fctr_flg_META = createCommonMeta($cont_fctr_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta cont_fctr_rnd_typ_META = createCommonMeta($cont_fctr_rnd_typ, mcframe.commonMA.meta.MA_META.RND_TYP);
	public static final MCMeta cont_fctr_dec_place_META = createCommonMeta($cont_fctr_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta ver_flg_META = createCommonMeta($ver_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta trd_unit_dec_place_META = createCommonMeta($trd_unit_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta trd_unit_conv_base_qty_META = createCommonMeta($trd_unit_conv_base_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta trd_unit_conv_qty_META = createCommonMeta($trd_unit_conv_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta trd_unit_rnd_typ_META = createCommonMeta($trd_unit_rnd_typ, mcframe.commonMA.meta.MA_META.RND_TYP);
	public static final MCMeta sls_acxfr_flg_META = createCommonMeta($sls_acxfr_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta xpns_purc_flg_META = createCommonMeta($xpns_purc_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sls_act_no_META = createCommonMeta($sls_act_no, mcframe.commonMA.meta.MA_META.SLS_ACT_NO);
	public static final MCMeta sls_act_seq_META = createCommonMeta($sls_act_seq, mcframe.commonMA.meta.MA_META.SLIP_SEQ);
	public static final MCMeta sls_act_d_seq_META = createCommonMeta($sls_act_d_seq, mcframe.commonMA.meta.MA_META.SLIP_SEQ);
	public static final MCMeta sls_schd_no_META = createCommonMeta($sls_schd_no, mcframe.commonMA.meta.MA_META.SLS_SCHD_NO);
	public static final MCMeta purc_schd_no_META = createCommonMeta($purc_schd_no, mcframe.commonMA.meta.MA_META.PURC_SCHD_NO);
	public static final MCMeta dtl_row_id_META = createCommonMeta($dtl_row_id, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta arr_pr_no_META = createCommonMeta($arr_pr_no, mcframe.commonMA.meta.MA_META.ARR_PR_NO);
	public static final MCMeta ship_pr_no_META = createCommonMeta($ship_pr_no, mcframe.commonMA.meta.MA_META.SHIP_PR_NO);
	public static final MCMeta outsrc_flg_META = createCommonMeta($outsrc_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta arr_schd_lot_fix_flg_META = createCommonMeta($arr_schd_lot_fix_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta mrkt_judg_flg_META = createCommonMeta($mrkt_judg_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta base_unit_upri_META = createCommonMeta($base_unit_upri, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta init_schd_qty_META = createCommonMeta($init_schd_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta init_schd_dscnt_amt_META = createCommonMeta($init_schd_dscnt_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta arr_pr_upd_cntr_META = createCommonMeta($arr_pr_upd_cntr, mcframe.commonMA.meta.MA_META.UPD_CNT);
	public static final MCMeta ship_pr_upd_cntr_META = createCommonMeta($ship_pr_upd_cntr, mcframe.commonMA.meta.MA_META.UPD_CNT);
	public static final MCMeta init_schd_amt_META = createCommonMeta($init_schd_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta schd_trd_unit_conv_base_qty_META = createCommonMeta($schd_trd_unit_conv_base_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta schd_trd_unit_conv_qty_META = createCommonMeta($schd_trd_unit_conv_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta org_sync_flg_META = createCommonMeta($org_sync_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta purc_schd_init_qty_META = createCommonMeta($purc_schd_init_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta purc_schd_init_dscnt_amt_META = createCommonMeta($purc_schd_init_dscnt_amt, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta purc_schd_init_amt_META = createCommonMeta($purc_schd_init_amt, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta purc_amt_rnd_typ_META = createCommonMeta($purc_amt_rnd_typ, mcframe.commonMA.meta.MA_META.RND_TYP);
	public static final MCMeta purc_upri_rnd_typ_META = createCommonMeta($purc_upri_rnd_typ, mcframe.commonMA.meta.MA_META.RND_TYP);
	public static final MCMeta purc_tax_rnd_typ_META = createCommonMeta($purc_tax_rnd_typ, mcframe.commonMA.meta.MA_META.RND_TYP);
	public static final MCMeta purc_trd_cur_amt_dec_place_META = createCommonMeta($purc_trd_cur_amt_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta purc_trd_cur_upri_dec_place_META = createCommonMeta($purc_trd_cur_upri_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta purc_s_trd_unit_conv_base_qty_META = createCommonMeta($purc_s_trd_unit_conv_base_qty, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta purc_s_trd_unit_conv_qty_META = createCommonMeta($purc_s_trd_unit_conv_qty, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta purc_trd_unit_cd_META = createCommonMeta($purc_trd_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta purc_trd_unit_qty_p_META = createInnerRowMeta($purc_trd_unit_qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta purc_base_unit_qty_p_META = createInnerRowMeta($purc_base_unit_qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta purc_trd_unit_conv_base_qty_META = createCommonMeta($purc_trd_unit_conv_base_qty, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta purc_trd_unit_conv_qty_META = createCommonMeta($purc_trd_unit_conv_qty, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta purc_trd_unit_dec_place_META = createCommonMeta($purc_trd_unit_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta xrate_purc_dt_META = createCommonMeta($xrate_purc_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta init_trd_cur_tax_amt_META = createCommonMeta($init_trd_cur_tax_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta init_trd_unit_cd_META = createCommonMeta($init_trd_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta init_trd_unit_qty_META = createCommonMeta($init_trd_unit_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta init_trd_cur_upri_META = createCommonMeta($init_trd_cur_upri, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta init_inc_tax_flg_META = createCommonMeta($init_inc_tax_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta init_tax_rate_META = createCommonMeta($init_tax_rate, mcframe.commonMA.meta.MA_META.TAX_RATE);
	public static final MCMeta init_trd_cur_dscnt_amt_META = createCommonMeta($init_trd_cur_dscnt_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta db_trd_unit_cd_META = createCommonMeta($db_trd_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta db_trd_unit_conv_qty_META = createCommonMeta($db_trd_unit_conv_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta db_trd_unit_conv_base_qty_META = createCommonMeta($db_trd_unit_conv_base_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta db_trd_unit_dec_place_META = createCommonMeta($db_trd_unit_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta db_trd_unit_rnd_typ_META = createCommonMeta($db_trd_unit_rnd_typ, mcframe.commonMA.meta.MA_META.RND_TYP);
	public static final MCMeta db_trd_unit_qty_META = createCommonMeta($db_trd_unit_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta db_trd_cur_amt_META = createCommonMeta($db_trd_cur_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta db_trd_cur_dscnt_amt_META = createCommonMeta($db_trd_cur_dscnt_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta db_trd_cur_tax_amt_META = createCommonMeta($db_trd_cur_tax_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta db_trd_cur_upri_META = createCommonMeta($db_trd_cur_upri, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta db_wtax_rate_META = createCommonMeta($db_wtax_rate, mcframe.commonMA.meta.MA_META.TAX_RATE);
	public static final MCMeta db_tax_rate_META = createCommonMeta($db_tax_rate, mcframe.commonMA.meta.MA_META.TAX_RATE);
	public static final MCMeta db_inc_tax_flg_META = createCommonMeta($db_inc_tax_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta purc_init_trd_cur_tax_amt_META = createCommonMeta($purc_init_trd_cur_tax_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta purc_init_trd_unit_cd_META = createCommonMeta($purc_init_trd_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta purc_init_trd_unit_qty_META = createCommonMeta($purc_init_trd_unit_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta purc_init_trd_cur_upri_META = createCommonMeta($purc_init_trd_cur_upri, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta purc_init_inc_tax_flg_META = createCommonMeta($purc_init_inc_tax_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta purc_init_tax_rate_META = createCommonMeta($purc_init_tax_rate, mcframe.commonMA.meta.MA_META.TAX_RATE);
	public static final MCMeta purc_init_trd_cur_dscnt_amt_META = createCommonMeta($purc_init_trd_cur_dscnt_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta purc_db_trd_unit_cd_META = createCommonMeta($purc_db_trd_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta purc_db_trd_unit_conv_qty_META = createCommonMeta($purc_db_trd_unit_conv_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta purc_db_trd_unit_conv_base_qty_META = createCommonMeta($purc_db_trd_unit_conv_base_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta purc_db_trd_unit_dec_place_META = createCommonMeta($purc_db_trd_unit_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta purc_db_trd_unit_rnd_typ_META = createCommonMeta($purc_db_trd_unit_rnd_typ, mcframe.commonMA.meta.MA_META.RND_TYP);
	public static final MCMeta purc_db_trd_unit_qty_META = createCommonMeta($purc_db_trd_unit_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta purc_db_trd_cur_amt_META = createCommonMeta($purc_db_trd_cur_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta purc_db_trd_cur_dscnt_amt_META = createCommonMeta($purc_db_trd_cur_dscnt_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta purc_db_trd_cur_tax_amt_META = createCommonMeta($purc_db_trd_cur_tax_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta purc_db_trd_cur_upri_META = createCommonMeta($purc_db_trd_cur_upri, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta purc_db_tax_rate_META = createCommonMeta($purc_db_tax_rate, mcframe.commonMA.meta.MA_META.TAX_RATE);
	public static final MCMeta purc_db_inc_tax_flg_META = createCommonMeta($purc_db_inc_tax_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta purc_schd_init_ex_amt_META = createCommonMeta($purc_schd_init_ex_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta base_unit_qty_bef_META = createCommonMeta($base_unit_qty_bef, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta base_unit_purc_qty_META = createCommonMeta($base_unit_purc_qty, mcframe.commonMA.meta.MA_META.QTY);

	protected static final ConstMetaList<DtlR> constMetas = new ConstMetaList<DtlR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			sync_flg_META,
			abort_flg_META,
			dlv_schd_dt_META,
			itm_p_META,
			cst_itm_cd_META,
			cst_itm_nm_META,
			asset_mng_typ_META,
			asset_mng_typ_nm_META,
			sundry_itm_flg_META,
			dlv_p_META,
			dest_cd1_META,
			dest_nm1_META,
			dest_cd2_META,
			dest_nm2_META,
			dest_cd3_META,
			dest_nm3_META,
			trd_unit_cd_META,
			trd_unit_nm_META,
			trd_unit_qty_p_META,
			base_unit_cd_META,
			base_unit_nm_META,
			base_unit_qty_p_META,
			sls_schd_qty_p_META,
			sls_qty_p_META,
			sls_dtl_upd_flg_META,
			trd_upri_amt_p_META,
			cost_upri_p_META,
			cost_amt_p_META,
			prof_rate_META,
			base_cur_upri_p_META,
			base_cur_amt_p_META,
			base_cur_inc_tax_amt_p_META,
			base_cur_tax_amt_p_META,
			base_cur_dscnt_amt_p_META,
			ptax_cur_upri_p_META,
			ptax_cur_amt_p_META,
			ptax_cur_inc_tax_amt_p_META,
			ptax_cur_tax_amt_p_META,
			ptax_cur_dscnt_amt_p_META,
			bill_crryovr_times_META,
			gd_cd_META,
			gd_nm_META,
			cst_po_d_no_META,
			sls_rsn_cd_META,
			sls_rsn_nm_META,
			bd_dpt_cd_META,
			bd_dpt_nm_META,
			wtax_rate_META,
			wtax_amt_p_META,
			ext_sys_cd_META,
			ext_sys_nm_META,
			ext_purc_act_d_no_META,
			trd_d_rmrks_META,
			intr_rmrks_META,
			sub_char1_META,
			sub_char2_META,
			sub_char3_META,
			sls_act_d_no_META,
			purc_ac_ym_META,
			purc_ac_dt_META,
			purc_dt_META,
			purc_act_no_META,
			purc_act_d_no_META,
			po_no_META,
			po_d_no_META,
			sppl_cd_META,
			sppl_nm_META,
			sppl_iv_flg_META,
			subcon_flg_META,
			maker_cd_META,
			maker_nm_META,
			bp_dlv_slip_no_META,
			bp_dlv_slip_d_no_META,
			lot_no_p_META,
			bp_lot_no_META,
			ship_fr_valid_dt_META,
			ver_no_p_META,
			purc_cont_qty_p_META,
			purc_cont_fctr_p_META,
			std_cont_qty_p_META,
			cont_fctr_unit_p_META,
			std_cont_fctr_p_META,
			sno_wrk_no_p_META,
			purc_trd_cur_cd_META,
			purc_trd_cur_nm_META,
			purc_xrate_inpt_flg_META,
			purc_xrate_p_META,
			purc_ptax_xrate_inpt_flg_META,
			purc_ptax_xrate_p_META,
			purc_dtl_upd_flg_META,
			purc_trd_upri_amt_p_META,
			purc_base_cur_upri_p_META,
			purc_base_cur_amt_p_META,
			purc_base_cur_inc_tax_amt_p_META,
			purc_base_cur_tax_amt_p_META,
			purc_base_cur_dscnt_amt_p_META,
			ptax_dt_META,
			purc_ptax_cur_upri_p_META,
			purc_ptax_cur_amt_p_META,
			purc_ptax_cur_inc_tax_amt_p_META,
			purc_ptax_cur_tax_amt_p_META,
			purc_ptax_cur_dscnt_amt_p_META,
			purc_rsn_cd_META,
			purc_rsn_nm_META,
			purc_bd_dpt_cd_META,
			purc_bd_dpt_nm_META,
			purc_wtax_rate_META,
			purc_wtax_amt_META,
			purc_qty_p_META,
			base_unit_purc_schd_qty_META,
			po_print_rmrks_META,
			po_print_d_rmrks_META,
			slo_d_no_META,
			disp_seq_META,
			lot_mng_typ_META,
			sublot_mng_typ_META,
			lot_no_typ_META,
			sublot_no_typ_META,
			sno1_mng_typ_META,
			sno2_mng_typ_META,
			sno3_mng_typ_META,
			sno4_mng_typ_META,
			stk_mng_typ_META,
			dscnt_itm_flg_META,
			itm_bill_crryovr_times_META,
			base_unit_dec_place_META,
			base_unit_rnd_typ_META,
			cont_fctr_flg_META,
			cont_fctr_rnd_typ_META,
			cont_fctr_dec_place_META,
			ver_flg_META,
			trd_unit_dec_place_META,
			trd_unit_conv_base_qty_META,
			trd_unit_conv_qty_META,
			trd_unit_rnd_typ_META,
			sls_acxfr_flg_META,
			xpns_purc_flg_META,
			sls_act_no_META,
			sls_act_seq_META,
			sls_act_d_seq_META,
			sls_schd_no_META,
			purc_schd_no_META,
			dtl_row_id_META,
			arr_pr_no_META,
			ship_pr_no_META,
			outsrc_flg_META,
			arr_schd_lot_fix_flg_META,
			mrkt_judg_flg_META,
			base_unit_upri_META,
			init_schd_qty_META,
			init_schd_dscnt_amt_META,
			arr_pr_upd_cntr_META,
			ship_pr_upd_cntr_META,
			init_schd_amt_META,
			schd_trd_unit_conv_base_qty_META,
			schd_trd_unit_conv_qty_META,
			org_sync_flg_META,
			purc_schd_init_qty_META,
			purc_schd_init_dscnt_amt_META,
			purc_schd_init_amt_META,
			purc_amt_rnd_typ_META,
			purc_upri_rnd_typ_META,
			purc_tax_rnd_typ_META,
			purc_trd_cur_amt_dec_place_META,
			purc_trd_cur_upri_dec_place_META,
			purc_s_trd_unit_conv_base_qty_META,
			purc_s_trd_unit_conv_qty_META,
			purc_trd_unit_cd_META,
			purc_trd_unit_qty_p_META,
			purc_base_unit_qty_p_META,
			purc_trd_unit_conv_base_qty_META,
			purc_trd_unit_conv_qty_META,
			purc_trd_unit_dec_place_META,
			xrate_purc_dt_META,
			init_trd_cur_tax_amt_META,
			init_trd_unit_cd_META,
			init_trd_unit_qty_META,
			init_trd_cur_upri_META,
			init_inc_tax_flg_META,
			init_tax_rate_META,
			init_trd_cur_dscnt_amt_META,
			db_trd_unit_cd_META,
			db_trd_unit_conv_qty_META,
			db_trd_unit_conv_base_qty_META,
			db_trd_unit_dec_place_META,
			db_trd_unit_rnd_typ_META,
			db_trd_unit_qty_META,
			db_trd_cur_amt_META,
			db_trd_cur_dscnt_amt_META,
			db_trd_cur_tax_amt_META,
			db_trd_cur_upri_META,
			db_wtax_rate_META,
			db_tax_rate_META,
			db_inc_tax_flg_META,
			purc_init_trd_cur_tax_amt_META,
			purc_init_trd_unit_cd_META,
			purc_init_trd_unit_qty_META,
			purc_init_trd_cur_upri_META,
			purc_init_inc_tax_flg_META,
			purc_init_tax_rate_META,
			purc_init_trd_cur_dscnt_amt_META,
			purc_db_trd_unit_cd_META,
			purc_db_trd_unit_conv_qty_META,
			purc_db_trd_unit_conv_base_qty_META,
			purc_db_trd_unit_dec_place_META,
			purc_db_trd_unit_rnd_typ_META,
			purc_db_trd_unit_qty_META,
			purc_db_trd_cur_amt_META,
			purc_db_trd_cur_dscnt_amt_META,
			purc_db_trd_cur_tax_amt_META,
			purc_db_trd_cur_upri_META,
			purc_db_tax_rate_META,
			purc_db_inc_tax_flg_META,
			purc_schd_init_ex_amt_META,
			base_unit_qty_bef_META,
			base_unit_purc_qty_META
		},
		new String[][]{
			{
				"itm_cd",
				"itm_sub1",
				"itm_sub2",
				"itm_sub3",
				"itm_nm",
				"dlv_cd",
				"dlv_nm",
				"dlv_sundry_flg",
				"dlv_zip_cd",
				"dlv_addr1",
				"dlv_addr2",
				"dlv_addr3",
				"dlv_addr4",
				"dlv_cntct_dpt",
				"dlv_cntct_psn",
				"dlv_tel",
				"dlv_fax",
				"cntry_cd",
				"cntry_nm",
				"pri_prnt_flg",
				"lg_grp_cd",
				"lg_grp_nm",
				"trd_unit_qty",
				"base_unit_qty",
				"sls_schd_qty",
				"sls_qty",
				"upri_not_tgt_flg",
				"trd_cur_upri",
				"interim_flg",
				"trd_cur_amt",
				"trd_cur_inc_tax_amt",
				"tax_fix_flg",
				"tax_cd",
				"tax_nm",
				"tax_rate",
				"tax_typ",
				"inc_tax_flg",
				"trd_cur_tax_amt",
				"trd_cur_dscnt_amt",
				"dscnt_rsn_cd",
				"dscnt_rsn_nm",
				"cost_upri",
				"cost_amt",
				"base_cur_upri",
				"base_cur_amt",
				"base_cur_inc_tax_amt",
				"base_cur_tax_amt",
				"base_cur_dscnt_amt",
				"ptax_cur_upri",
				"ptax_cur_amt",
				"ptax_cur_inc_tax_amt",
				"ptax_cur_tax_amt",
				"ptax_cur_dscnt_amt",
				"wtax_amt",
				"crt_lot_flg",
				"lot_no",
				"sublot_no",
				"ver_no",
				"purc_cont_qty",
				"purc_cont_fctr",
				"std_cont_qty",
				"cont_fctr_unit_cd",
				"cont_fctr_unit_nm",
				"std_cont_fctr",
				"sno1",
				"sno2",
				"sno3",
				"sno4",
				"wrk_no",
				"wrk_nm",
				"purc_xrate",
				"purc_ptax_xrate",
				"purc_upri_not_tgt_flg",
				"purc_trd_cur_upri",
				"purc_interim_flg",
				"purc_trd_cur_amt",
				"purc_trd_cur_inc_tax_amt",
				"purc_tax_fix_flg",
				"purc_tax_cd",
				"purc_tax_nm",
				"purc_tax_rate",
				"purc_tax_typ",
				"purc_inc_tax_flg",
				"purc_trd_cur_tax_amt",
				"purc_trd_cur_dscnt_amt",
				"purc_dscnt_rsn_cd",
				"purc_dscnt_rsn_nm",
				"purc_base_cur_upri",
				"purc_base_cur_amt",
				"purc_base_cur_inc_tax_amt",
				"purc_base_cur_tax_amt",
				"purc_base_cur_dscnt_amt",
				"purc_ptax_cur_upri",
				"purc_ptax_cur_amt",
				"purc_ptax_cur_inc_tax_amt",
				"purc_ptax_cur_tax_amt",
				"purc_ptax_cur_dscnt_amt",
				"purc_qty",
				"purc_trd_unit_qty",
				"purc_base_unit_qty"
			},
			{
				$itm_cd,
				$itm_sub1,
				$itm_sub2,
				$itm_sub3,
				$itm_nm,
				$dlv_cd,
				$dlv_nm,
				$dlv_sundry_flg,
				$dlv_zip_cd,
				$dlv_addr1,
				$dlv_addr2,
				$dlv_addr3,
				$dlv_addr4,
				$dlv_cntct_dpt,
				$dlv_cntct_psn,
				$dlv_tel,
				$dlv_fax,
				$cntry_cd,
				$cntry_nm,
				$pri_prnt_flg,
				$lg_grp_cd,
				$lg_grp_nm,
				$trd_unit_qty,
				$base_unit_qty,
				$sls_schd_qty,
				$sls_qty,
				$upri_not_tgt_flg,
				$trd_cur_upri,
				$interim_flg,
				$trd_cur_amt,
				$trd_cur_inc_tax_amt,
				$tax_fix_flg,
				$tax_cd,
				$tax_nm,
				$tax_rate,
				$tax_typ,
				$inc_tax_flg,
				$trd_cur_tax_amt,
				$trd_cur_dscnt_amt,
				$dscnt_rsn_cd,
				$dscnt_rsn_nm,
				$cost_upri,
				$cost_amt,
				$base_cur_upri,
				$base_cur_amt,
				$base_cur_inc_tax_amt,
				$base_cur_tax_amt,
				$base_cur_dscnt_amt,
				$ptax_cur_upri,
				$ptax_cur_amt,
				$ptax_cur_inc_tax_amt,
				$ptax_cur_tax_amt,
				$ptax_cur_dscnt_amt,
				$wtax_amt,
				$crt_lot_flg,
				$lot_no,
				$sublot_no,
				$ver_no,
				$purc_cont_qty,
				$purc_cont_fctr,
				$std_cont_qty,
				$cont_fctr_unit_cd,
				$cont_fctr_unit_nm,
				$std_cont_fctr,
				$sno1,
				$sno2,
				$sno3,
				$sno4,
				$wrk_no,
				$wrk_nm,
				$purc_xrate,
				$purc_ptax_xrate,
				$purc_upri_not_tgt_flg,
				$purc_trd_cur_upri,
				$purc_interim_flg,
				$purc_trd_cur_amt,
				$purc_trd_cur_inc_tax_amt,
				$purc_tax_fix_flg,
				$purc_tax_cd,
				$purc_tax_nm,
				$purc_tax_rate,
				$purc_tax_typ,
				$purc_inc_tax_flg,
				$purc_trd_cur_tax_amt,
				$purc_trd_cur_dscnt_amt,
				$purc_dscnt_rsn_cd,
				$purc_dscnt_rsn_nm,
				$purc_base_cur_upri,
				$purc_base_cur_amt,
				$purc_base_cur_inc_tax_amt,
				$purc_base_cur_tax_amt,
				$purc_base_cur_dscnt_amt,
				$purc_ptax_cur_upri,
				$purc_ptax_cur_amt,
				$purc_ptax_cur_inc_tax_amt,
				$purc_ptax_cur_tax_amt,
				$purc_ptax_cur_dscnt_amt,
				$purc_qty,
				$purc_trd_unit_qty,
				$purc_base_unit_qty
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
	/** 項目属性情報のグループ[DISP_CTL]のキー定数 */
	public static final String $$DISP_CTL = "DISP_CTL";

	/**
	 * グループ毎に定義される項目属性情報です。
	 */
	protected static final MCExtMap EXTMAP = new MCExtMap(
		null,
		new MCExtMap.Entry($$LIST_OUT_BASE, new MCExtList(
			new String[][]{
				{$itm_p + ".itm_cd", "itm_sub1;itm_sub2;itm_sub3;itm_nm;asset_mng_typ;asset_mng_typ_nm;sundry_itm_flg;lot_mng_typ;sublot_mng_typ;sno1_mng_typ;sno2_mng_typ;sno3_mng_typ;sno4_mng_typ;unit_cd;unit_nm;dec_place;rnd_typ;stk_mng_typ;dscnt_itm_flg;lot_no_typ;sublot_no_typ;ship_unit_cd;bill_crryovr_times"},	// itm_p.itm_cd
				{$itm_p + ".itm_sub1", "itm_sub2;itm_sub3;itm_nm;asset_mng_typ;asset_mng_typ_nm;sundry_itm_flg;lot_mng_typ;sublot_mng_typ;sno1_mng_typ;sno2_mng_typ;sno3_mng_typ;sno4_mng_typ;unit_cd;unit_nm;dec_place;rnd_typ;stk_mng_typ;dscnt_itm_flg;lot_no_typ;sublot_no_typ;ship_unit_cd;bill_crryovr_times"},	// itm_p.itm_sub1
				{$itm_p + ".itm_sub2", "itm_sub3;itm_nm;asset_mng_typ;asset_mng_typ_nm;sundry_itm_flg;lot_mng_typ;sublot_mng_typ;sno1_mng_typ;sno2_mng_typ;sno3_mng_typ;sno4_mng_typ;unit_cd;unit_nm;dec_place;rnd_typ;stk_mng_typ;dscnt_itm_flg;lot_no_typ;sublot_no_typ;ship_unit_cd;bill_crryovr_times"},	// itm_p.itm_sub2
				{$itm_p + ".itm_sub3", "itm_nm;asset_mng_typ;asset_mng_typ_nm;sundry_itm_flg;lot_mng_typ;sublot_mng_typ;sno1_mng_typ;sno2_mng_typ;sno3_mng_typ;sno4_mng_typ;unit_cd;unit_nm;dec_place;rnd_typ;stk_mng_typ;dscnt_itm_flg;lot_no_typ;sublot_no_typ;ship_unit_cd;bill_crryovr_times"},	// itm_p.itm_sub3
				{$cst_itm_cd, "bp_itm_nm;itm_cd;itm_sub1;itm_sub2;itm_sub3"},	// cst_itm_cd
				{$dlv_p + ".bp_cd", "bp_nm;dlv_sundry_flg;pri_prnt_flg;zip_cd;addr1;addr2;addr3;addr4;cntry_cd;cntry_nm;tel;fax;dlv_cntct_dpt;dlv_cntct_psn"},	// dlv_p.bp_cd
				{$dest_cd1, "bp_nm"},	// dest_cd1
				{$dest_cd2, "bp_nm"},	// dest_cd2
				{$dest_cd3, "bp_nm"},	// dest_cd3
				{$trd_unit_cd, "unit_nm;dec_place;conv_base_qty;conv_qty;rnd_typ"},	// trd_unit_cd
				{$trd_upri_amt_p + ".dscnt_rsn_cd", "biz_rsn_nm"},	// trd_upri_amt_p.dscnt_rsn_cd
				{$sls_rsn_cd, "biz_rsn_nm;sls_acxfr_flg"},	// sls_rsn_cd
				{$bd_dpt_cd, "dpt_nm"},	// bd_dpt_cd
				{$purc_trd_upri_amt_p + ".tax_cd", "tax_nm;tax_rate;inc_tax_flg;tax_typ"},	// purc_trd_upri_amt_p.tax_cd
				{$purc_trd_upri_amt_p + ".dscnt_rsn_cd", "biz_rsn_nm"},	// purc_trd_upri_amt_p.dscnt_rsn_cd
				{$purc_rsn_cd, "biz_rsn_nm;xpns_purc_flg"},	// purc_rsn_cd
				{$purc_bd_dpt_cd, "dpt_nm"}	// purc_bd_dpt_cd
			}
		)),
		new MCExtMap.Entry($$LIST_IN, new MCExtList(
			new String[][]{
				{$itm_p + ".itm_cd", "MAC_ITM_IS_SRCH_TYP.STK2;true"},	// itm_p.itm_cd
				{$itm_p + ".itm_sub1", "MAC_ITM_IS_SRCH_TYP.STK2;true;itm_cd"},	// itm_p.itm_sub1
				{$itm_p + ".itm_sub2", "MAC_ITM_IS_SRCH_TYP.STK2;true;itm_cd;itm_sub1"},	// itm_p.itm_sub2
				{$itm_p + ".itm_sub3", "MAC_ITM_IS_SRCH_TYP.STK2;true;itm_cd;itm_sub1;itm_sub2"},	// itm_p.itm_sub3
				{$cst_itm_cd, "MAC_ITM_IS_SRCH_TYP.STK2;bp_cd;bp_nm;dt"},	// cst_itm_cd
				{$dlv_p + ".bp_cd", "MAC_BP_IS_SRCH_TYP.DLV"},	// dlv_p.bp_cd
				{$dest_cd1, "MAC_BP_IS_SRCH_TYP.DEST"},	// dest_cd1
				{$dest_cd2, "MAC_BP_IS_SRCH_TYP.DEST"},	// dest_cd2
				{$dest_cd3, "MAC_BP_IS_SRCH_TYP.DEST"},	// dest_cd3
				{$trd_unit_cd, "itm_cd;itm_sub1;itm_sub2;itm_sub3"},	// trd_unit_cd
				{$bd_dpt_cd, "MAC_DPT_IS_SRCH_TYP.BD"},	// bd_dpt_cd
				{$purc_trd_upri_amt_p + ".tax_cd", "purc_tax_cd"},	// purc_trd_upri_amt_p.tax_cd
				{$purc_trd_upri_amt_p + ".dscnt_rsn_cd", "purc_biz_rsn_cd"},	// purc_trd_upri_amt_p.dscnt_rsn_cd
				{$purc_bd_dpt_cd, "MAC_DPT_IS_SRCH_TYP.BD"}	// purc_bd_dpt_cd
			}
		)),
		new MCExtMap.Entry($$LIST_IN_BASE, new MCExtList(
			new String[][]{
				{$itm_p + ".itm_cd", "itm_is_srch_typ;release_flg_on"},	// itm_p.itm_cd
				{$itm_p + ".itm_sub1", "itm_is_srch_typ;release_flg_on;itm_cd"},	// itm_p.itm_sub1
				{$itm_p + ".itm_sub2", "itm_is_srch_typ;release_flg_on;itm_cd;itm_sub1"},	// itm_p.itm_sub2
				{$itm_p + ".itm_sub3", "itm_is_srch_typ;true;itm_cd;itm_sub1;itm_sub2"},	// itm_p.itm_sub3
				{$cst_itm_cd, "cst_itm_is_srch_typ;bp_cd;bp_nm;dt"},	// cst_itm_cd
				{$dlv_p + ".bp_cd", "bp_is_srch_typ"},	// dlv_p.bp_cd
				{$dest_cd1, "bp_is_srch_typ"},	// dest_cd1
				{$dest_cd2, "bp_is_srch_typ"},	// dest_cd2
				{$dest_cd3, "bp_is_srch_typ"},	// dest_cd3
				{$trd_unit_cd, "itm_cd;itm_sub1;itm_sub2;itm_sub3"},	// trd_unit_cd
				{$bd_dpt_cd, "dpt_is_srch_typ"},	// bd_dpt_cd
				{$purc_trd_upri_amt_p + ".tax_cd", "tax_cd"},	// purc_trd_upri_amt_p.tax_cd
				{$purc_trd_upri_amt_p + ".dscnt_rsn_cd", "biz_rsn_cd"},	// purc_trd_upri_amt_p.dscnt_rsn_cd
				{$purc_bd_dpt_cd, "dpt_is_srch_typ"}	// purc_bd_dpt_cd
			}
		)),
		new MCExtMap.Entry($$DISP_CTL, new MCExtList(
			new String[][]{
				{$dest_cd1, "DEST1"},	// dest_cd1
				{$dest_nm1, "DEST1"},	// dest_nm1
				{$dest_cd2, "DEST2"},	// dest_cd2
				{$dest_nm2, "DEST2"},	// dest_nm2
				{$dest_cd3, "DEST3"},	// dest_cd3
				{$dest_nm3, "DEST3"},	// dest_nm3
				{$base_unit_cd, "BASE_UNIT"},	// base_unit_cd
				{$base_unit_nm, "BASE_UNIT"},	// base_unit_nm
				{$base_unit_qty_p + ".qty", "BASE_UNIT"},	// base_unit_qty_p.qty
				{$base_cur_upri_p + ".upri", "BASE_CUR"},	// base_cur_upri_p.upri
				{$base_cur_amt_p + ".amt", "BASE_CUR"},	// base_cur_amt_p.amt
				{$base_cur_inc_tax_amt_p + ".amt", "BASE_CUR"},	// base_cur_inc_tax_amt_p.amt
				{$base_cur_tax_amt_p + ".amt", "BASE_CUR"},	// base_cur_tax_amt_p.amt
				{$base_cur_dscnt_amt_p + ".amt", "BASE_CUR"},	// base_cur_dscnt_amt_p.amt
				{$ptax_cur_upri_p + ".upri", "PTAX"},	// ptax_cur_upri_p.upri
				{$ptax_cur_amt_p + ".amt", "PTAX"},	// ptax_cur_amt_p.amt
				{$ptax_cur_inc_tax_amt_p + ".amt", "PTAX"},	// ptax_cur_inc_tax_amt_p.amt
				{$ptax_cur_tax_amt_p + ".amt", "PTAX"},	// ptax_cur_tax_amt_p.amt
				{$ptax_cur_dscnt_amt_p + ".amt", "PTAX"},	// ptax_cur_dscnt_amt_p.amt
				{$gd_cd, "STK_GD"},	// gd_cd
				{$gd_nm, "STK_GD"},	// gd_nm
				{$wtax_rate, "WTAX"},	// wtax_rate
				{$wtax_amt_p + ".amt", "WTAX"},	// wtax_amt_p.amt
				{$maker_cd, "MAKER"},	// maker_cd
				{$maker_nm, "MAKER"},	// maker_nm
				{$purc_xrate_inpt_flg, "BASE_CUR"},	// purc_xrate_inpt_flg
				{$purc_xrate_p + ".xrate", "BASE_CUR"},	// purc_xrate_p.xrate
				{$purc_ptax_xrate_inpt_flg, "PTAX"},	// purc_ptax_xrate_inpt_flg
				{$purc_ptax_xrate_p + ".xrate", "PTAX"},	// purc_ptax_xrate_p.xrate
				{$purc_base_cur_upri_p + ".upri", "BASE_CUR"},	// purc_base_cur_upri_p.upri
				{$purc_base_cur_amt_p + ".amt", "BASE_CUR"},	// purc_base_cur_amt_p.amt
				{$purc_base_cur_inc_tax_amt_p + ".amt", "BASE_CUR"},	// purc_base_cur_inc_tax_amt_p.amt
				{$purc_base_cur_tax_amt_p + ".amt", "BASE_CUR"},	// purc_base_cur_tax_amt_p.amt
				{$purc_base_cur_dscnt_amt_p + ".amt", "BASE_CUR"},	// purc_base_cur_dscnt_amt_p.amt
				{$purc_ptax_cur_upri_p + ".upri", "PTAX"},	// purc_ptax_cur_upri_p.upri
				{$purc_ptax_cur_amt_p + ".amt", "PTAX"},	// purc_ptax_cur_amt_p.amt
				{$purc_ptax_cur_inc_tax_amt_p + ".amt", "PTAX"},	// purc_ptax_cur_inc_tax_amt_p.amt
				{$purc_ptax_cur_tax_amt_p + ".amt", "PTAX"},	// purc_ptax_cur_tax_amt_p.amt
				{$purc_ptax_cur_dscnt_amt_p + ".amt", "PTAX"},	// purc_ptax_cur_dscnt_amt_p.amt
				{$base_unit_purc_schd_qty, "BASE_UNIT"},	// base_unit_purc_schd_qty
				{$base_unit_dec_place, "BASE_UNIT"},	// base_unit_dec_place
				{$base_unit_rnd_typ, "BASE_UNIT"},	// base_unit_rnd_typ
				{$purc_base_unit_qty_p + ".qty", "BASE_UNIT"}	// purc_base_unit_qty_p.qty
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



	/**
	 * Simultaneous recording 同時計上.<p>
	 *
	 */
	public boolean sync_flg() {
		return getConstBoolean(offset + 0, $sync_flg);
	}

	/**
	 * Simultaneous recording 同時計上.<p>
	 *
	 */
	public void sync_flg(boolean value) {
		setConstBoolean(offset + 0, $sync_flg, value);
	}


	/**
	 * Cancel remaining 打切.<p>
	 *
	 */
	public boolean abort_flg() {
		return getConstBoolean(offset + 1, $abort_flg);
	}

	/**
	 * Cancel remaining 打切.<p>
	 *
	 */
	public void abort_flg(boolean value) {
		setConstBoolean(offset + 1, $abort_flg, value);
	}


	/**
	 * Scheduled delivery date 納品予定日.<p>
	 *
	 */
	public MCDate dlv_schd_dt() {
		return getConstDate(offset + 2, $dlv_schd_dt);
	}

	/**
	 * Scheduled delivery date 納品予定日.<p>
	 *
	 */
	public void dlv_schd_dt(MCDate value) {
		setConstDate(offset + 2, $dlv_schd_dt, value);
	}


	public mcframe.clientMAUB.MAUBP5030.ItmR itm_p(){
		return (mcframe.clientMAUB.MAUBP5030.ItmR) getConstInnerRow(offset + 3, $itm_p);
	}
	
	public void itm_p(mcframe.clientMAUB.MAUBP5030.ItmR row){
		setConstInnerRow(offset + 3, $itm_p, row);
	}


	/**
	 * Customer item cd. 得意先品目ＣＤ.<p>
	 *
	 */
	public String cst_itm_cd() {
		return getConstString(offset + 4, $cst_itm_cd);
	}

	/**
	 * Customer item cd. 得意先品目ＣＤ.<p>
	 *
	 */
	public void cst_itm_cd(String value) {
		setConstString(offset + 4, $cst_itm_cd, value);
	}


	/**
	 * Customer item name 得意先品名.<p>
	 *
	 */
	public String cst_itm_nm() {
		return getConstString(offset + 5, $cst_itm_nm);
	}

	/**
	 * Customer item name 得意先品名.<p>
	 *
	 */
	public void cst_itm_nm(String value) {
		setConstString(offset + 5, $cst_itm_nm, value);
	}


	/**
	 * Asset management type 資産管理区分.<p>
	 *
	 */
	public String asset_mng_typ() {
		return getConstString(offset + 6, $asset_mng_typ);
	}

	/**
	 * Asset management type 資産管理区分.<p>
	 *
	 */
	public void asset_mng_typ(String value) {
		setConstString(offset + 6, $asset_mng_typ, value);
	}


	/**
	 * Asset management type name 資産管理区分名.<p>
	 *
	 */
	public String asset_mng_typ_nm() {
		return getConstString(offset + 7, $asset_mng_typ_nm);
	}

	/**
	 * Asset management type name 資産管理区分名.<p>
	 *
	 */
	public void asset_mng_typ_nm(String value) {
		setConstString(offset + 7, $asset_mng_typ_nm, value);
	}


	/**
	 * Miscellaneous item 諸口品.<p>
	 *
	 */
	public boolean sundry_itm_flg() {
		return getConstBoolean(offset + 8, $sundry_itm_flg);
	}

	/**
	 * Miscellaneous item 諸口品.<p>
	 *
	 */
	public void sundry_itm_flg(boolean value) {
		setConstBoolean(offset + 8, $sundry_itm_flg, value);
	}


	public mcframe.clientMAUB.MAUBP5400.DlvR dlv_p(){
		return (mcframe.clientMAUB.MAUBP5400.DlvR) getConstInnerRow(offset + 9, $dlv_p);
	}
	
	public void dlv_p(mcframe.clientMAUB.MAUBP5400.DlvR row){
		setConstInnerRow(offset + 9, $dlv_p, row);
	}


	/**
	 * Distribution channel cd. 1 仕向先ＣＤ１.<p>
	 *
	 */
	public String dest_cd1() {
		return getConstString(offset + 10, $dest_cd1);
	}

	/**
	 * Distribution channel cd. 1 仕向先ＣＤ１.<p>
	 *
	 */
	public void dest_cd1(String value) {
		setConstString(offset + 10, $dest_cd1, value);
	}


	/**
	 * Distribution channel name 1 仕向先名１.<p>
	 *
	 */
	public String dest_nm1() {
		return getConstString(offset + 11, $dest_nm1);
	}

	/**
	 * Distribution channel name 1 仕向先名１.<p>
	 *
	 */
	public void dest_nm1(String value) {
		setConstString(offset + 11, $dest_nm1, value);
	}


	/**
	 * Distribution channel cd. 2 仕向先ＣＤ２.<p>
	 *
	 */
	public String dest_cd2() {
		return getConstString(offset + 12, $dest_cd2);
	}

	/**
	 * Distribution channel cd. 2 仕向先ＣＤ２.<p>
	 *
	 */
	public void dest_cd2(String value) {
		setConstString(offset + 12, $dest_cd2, value);
	}


	/**
	 * Distribution channel name 2 仕向先名２.<p>
	 *
	 */
	public String dest_nm2() {
		return getConstString(offset + 13, $dest_nm2);
	}

	/**
	 * Distribution channel name 2 仕向先名２.<p>
	 *
	 */
	public void dest_nm2(String value) {
		setConstString(offset + 13, $dest_nm2, value);
	}


	/**
	 * Distribution channel cd. 3 仕向先ＣＤ３.<p>
	 *
	 */
	public String dest_cd3() {
		return getConstString(offset + 14, $dest_cd3);
	}

	/**
	 * Distribution channel cd. 3 仕向先ＣＤ３.<p>
	 *
	 */
	public void dest_cd3(String value) {
		setConstString(offset + 14, $dest_cd3, value);
	}


	/**
	 * Distribution channel name 3 仕向先名３.<p>
	 *
	 */
	public String dest_nm3() {
		return getConstString(offset + 15, $dest_nm3);
	}

	/**
	 * Distribution channel name 3 仕向先名３.<p>
	 *
	 */
	public void dest_nm3(String value) {
		setConstString(offset + 15, $dest_nm3, value);
	}


	/**
	 * Transaction unit cd. 取引単位ＣＤ.<p>
	 *
	 */
	public String trd_unit_cd() {
		return getConstString(offset + 16, $trd_unit_cd);
	}

	/**
	 * Transaction unit cd. 取引単位ＣＤ.<p>
	 *
	 */
	public void trd_unit_cd(String value) {
		setConstString(offset + 16, $trd_unit_cd, value);
	}


	/**
	 * Transaction unit name 取引単位名.<p>
	 *
	 */
	public String trd_unit_nm() {
		return getConstString(offset + 17, $trd_unit_nm);
	}

	/**
	 * Transaction unit name 取引単位名.<p>
	 *
	 */
	public void trd_unit_nm(String value) {
		setConstString(offset + 17, $trd_unit_nm, value);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR trd_unit_qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 18, $trd_unit_qty_p);
	}
	
	public void trd_unit_qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 18, $trd_unit_qty_p, row);
	}


	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public String base_unit_cd() {
		return getConstString(offset + 19, $base_unit_cd);
	}

	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public void base_unit_cd(String value) {
		setConstString(offset + 19, $base_unit_cd, value);
	}


	/**
	 * Base unit name 基準単位名.<p>
	 *
	 */
	public String base_unit_nm() {
		return getConstString(offset + 20, $base_unit_nm);
	}

	/**
	 * Base unit name 基準単位名.<p>
	 *
	 */
	public void base_unit_nm(String value) {
		setConstString(offset + 20, $base_unit_nm, value);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR base_unit_qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 21, $base_unit_qty_p);
	}
	
	public void base_unit_qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 21, $base_unit_qty_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR sls_schd_qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 22, $sls_schd_qty_p);
	}
	
	public void sls_schd_qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 22, $sls_schd_qty_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR sls_qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 23, $sls_qty_p);
	}
	
	public void sls_qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 23, $sls_qty_p, row);
	}


	/**
	 * Details correction 明細訂正.<p>
	 *
	 */
	public boolean sls_dtl_upd_flg() {
		return getConstBoolean(offset + 24, $sls_dtl_upd_flg);
	}

	/**
	 * Details correction 明細訂正.<p>
	 *
	 */
	public void sls_dtl_upd_flg(boolean value) {
		setConstBoolean(offset + 24, $sls_dtl_upd_flg, value);
	}


	public mcframe.clientMSUB.MSUBP5070.TrdUpriAmtR trd_upri_amt_p(){
		return (mcframe.clientMSUB.MSUBP5070.TrdUpriAmtR) getConstInnerRow(offset + 25, $trd_upri_amt_p);
	}
	
	public void trd_upri_amt_p(mcframe.clientMSUB.MSUBP5070.TrdUpriAmtR row){
		setConstInnerRow(offset + 25, $trd_upri_amt_p, row);
	}


	public mcframe.clientMAUB.MAUBP5060.UpriR cost_upri_p(){
		return (mcframe.clientMAUB.MAUBP5060.UpriR) getConstInnerRow(offset + 26, $cost_upri_p);
	}
	
	public void cost_upri_p(mcframe.clientMAUB.MAUBP5060.UpriR row){
		setConstInnerRow(offset + 26, $cost_upri_p, row);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR cost_amt_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 27, $cost_amt_p);
	}
	
	public void cost_amt_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 27, $cost_amt_p, row);
	}


	/**
	 * Gross profit rate 粗利率.<p>
	 *
	 */
	public MCNumber prof_rate() {
		return getConstNumber(offset + 28, $prof_rate);
	}

	/**
	 * Gross profit rate 粗利率.<p>
	 *
	 */
	public void prof_rate(MCNumber value) {
		setConstNumber(offset + 28, $prof_rate, value);
	}

	/**
	 * Gross profit rate 粗利率.<p>
	 *
	 */
	public void prof_rate(int value) {
		setConstNumber(offset + 28, $prof_rate, value);
	}

	/**
	 * Gross profit rate 粗利率.<p>
	 *
	 */
	public void prof_rate(long value) {
		setConstNumber(offset + 28, $prof_rate, value);
	}

	/**
	 * Gross profit rate 粗利率.<p>
	 *
	 */
	public void prof_rate(float value) {
		setConstNumber(offset + 28, $prof_rate, value);
	}

	/**
	 * Gross profit rate 粗利率.<p>
	 *
	 */
	public void prof_rate(double value) {
		setConstNumber(offset + 28, $prof_rate, value);
	}


	public mcframe.clientMAUB.MAUBP5060.UpriR base_cur_upri_p(){
		return (mcframe.clientMAUB.MAUBP5060.UpriR) getConstInnerRow(offset + 29, $base_cur_upri_p);
	}
	
	public void base_cur_upri_p(mcframe.clientMAUB.MAUBP5060.UpriR row){
		setConstInnerRow(offset + 29, $base_cur_upri_p, row);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR base_cur_amt_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 30, $base_cur_amt_p);
	}
	
	public void base_cur_amt_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 30, $base_cur_amt_p, row);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR base_cur_inc_tax_amt_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 31, $base_cur_inc_tax_amt_p);
	}
	
	public void base_cur_inc_tax_amt_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 31, $base_cur_inc_tax_amt_p, row);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR base_cur_tax_amt_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 32, $base_cur_tax_amt_p);
	}
	
	public void base_cur_tax_amt_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 32, $base_cur_tax_amt_p, row);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR base_cur_dscnt_amt_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 33, $base_cur_dscnt_amt_p);
	}
	
	public void base_cur_dscnt_amt_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 33, $base_cur_dscnt_amt_p, row);
	}


	public mcframe.clientMAUB.MAUBP5060.UpriR ptax_cur_upri_p(){
		return (mcframe.clientMAUB.MAUBP5060.UpriR) getConstInnerRow(offset + 34, $ptax_cur_upri_p);
	}
	
	public void ptax_cur_upri_p(mcframe.clientMAUB.MAUBP5060.UpriR row){
		setConstInnerRow(offset + 34, $ptax_cur_upri_p, row);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR ptax_cur_amt_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 35, $ptax_cur_amt_p);
	}
	
	public void ptax_cur_amt_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 35, $ptax_cur_amt_p, row);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR ptax_cur_inc_tax_amt_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 36, $ptax_cur_inc_tax_amt_p);
	}
	
	public void ptax_cur_inc_tax_amt_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 36, $ptax_cur_inc_tax_amt_p, row);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR ptax_cur_tax_amt_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 37, $ptax_cur_tax_amt_p);
	}
	
	public void ptax_cur_tax_amt_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 37, $ptax_cur_tax_amt_p, row);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR ptax_cur_dscnt_amt_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 38, $ptax_cur_dscnt_amt_p);
	}
	
	public void ptax_cur_dscnt_amt_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 38, $ptax_cur_dscnt_amt_p, row);
	}


	/**
	 * Billing carry-over count 請求繰越回数.<p>
	 *
	 */
	public MCNumber bill_crryovr_times() {
		return getConstNumber(offset + 39, $bill_crryovr_times);
	}

	/**
	 * Billing carry-over count 請求繰越回数.<p>
	 *
	 */
	public void bill_crryovr_times(MCNumber value) {
		setConstNumber(offset + 39, $bill_crryovr_times, value);
	}

	/**
	 * Billing carry-over count 請求繰越回数.<p>
	 *
	 */
	public void bill_crryovr_times(int value) {
		setConstNumber(offset + 39, $bill_crryovr_times, value);
	}

	/**
	 * Billing carry-over count 請求繰越回数.<p>
	 *
	 */
	public void bill_crryovr_times(long value) {
		setConstNumber(offset + 39, $bill_crryovr_times, value);
	}

	/**
	 * Billing carry-over count 請求繰越回数.<p>
	 *
	 */
	public void bill_crryovr_times(float value) {
		setConstNumber(offset + 39, $bill_crryovr_times, value);
	}

	/**
	 * Billing carry-over count 請求繰越回数.<p>
	 *
	 */
	public void bill_crryovr_times(double value) {
		setConstNumber(offset + 39, $bill_crryovr_times, value);
	}


	/**
	 * Grading cd. 格付ＣＤ.<p>
	 *
	 */
	public String gd_cd() {
		return getConstString(offset + 40, $gd_cd);
	}

	/**
	 * Grading cd. 格付ＣＤ.<p>
	 *
	 */
	public void gd_cd(String value) {
		setConstString(offset + 40, $gd_cd, value);
	}


	/**
	 * Grading name 格付名.<p>
	 *
	 */
	public String gd_nm() {
		return getConstString(offset + 41, $gd_nm);
	}

	/**
	 * Grading name 格付名.<p>
	 *
	 */
	public void gd_nm(String value) {
		setConstString(offset + 41, $gd_nm, value);
	}


	/**
	 * Customer order details No. 得意先注文明細ＮＯ.<p>
	 *
	 */
	public String cst_po_d_no() {
		return getConstString(offset + 42, $cst_po_d_no);
	}

	/**
	 * Customer order details No. 得意先注文明細ＮＯ.<p>
	 *
	 */
	public void cst_po_d_no(String value) {
		setConstString(offset + 42, $cst_po_d_no, value);
	}


	/**
	 * Sales reason cd. 売上理由ＣＤ.<p>
	 *
	 */
	public String sls_rsn_cd() {
		return getConstString(offset + 43, $sls_rsn_cd);
	}

	/**
	 * Sales reason cd. 売上理由ＣＤ.<p>
	 *
	 */
	public void sls_rsn_cd(String value) {
		setConstString(offset + 43, $sls_rsn_cd, value);
	}


	/**
	 * Sales reason name 売上理由名.<p>
	 *
	 */
	public String sls_rsn_nm() {
		return getConstString(offset + 44, $sls_rsn_nm);
	}

	/**
	 * Sales reason name 売上理由名.<p>
	 *
	 */
	public void sls_rsn_nm(String value) {
		setConstString(offset + 44, $sls_rsn_nm, value);
	}


	/**
	 * Charged dept. cd. 負担部門ＣＤ.<p>
	 *
	 */
	public String bd_dpt_cd() {
		return getConstString(offset + 45, $bd_dpt_cd);
	}

	/**
	 * Charged dept. cd. 負担部門ＣＤ.<p>
	 *
	 */
	public void bd_dpt_cd(String value) {
		setConstString(offset + 45, $bd_dpt_cd, value);
	}


	/**
	 * Charged dept. name 負担部門名.<p>
	 *
	 */
	public String bd_dpt_nm() {
		return getConstString(offset + 46, $bd_dpt_nm);
	}

	/**
	 * Charged dept. name 負担部門名.<p>
	 *
	 */
	public void bd_dpt_nm(String value) {
		setConstString(offset + 46, $bd_dpt_nm, value);
	}


	/**
	 * Withholding tax rate 源泉税率.<p>
	 *
	 */
	public MCNumber wtax_rate() {
		return getConstNumber(offset + 47, $wtax_rate);
	}

	/**
	 * Withholding tax rate 源泉税率.<p>
	 *
	 */
	public void wtax_rate(MCNumber value) {
		setConstNumber(offset + 47, $wtax_rate, value);
	}

	/**
	 * Withholding tax rate 源泉税率.<p>
	 *
	 */
	public void wtax_rate(int value) {
		setConstNumber(offset + 47, $wtax_rate, value);
	}

	/**
	 * Withholding tax rate 源泉税率.<p>
	 *
	 */
	public void wtax_rate(long value) {
		setConstNumber(offset + 47, $wtax_rate, value);
	}

	/**
	 * Withholding tax rate 源泉税率.<p>
	 *
	 */
	public void wtax_rate(float value) {
		setConstNumber(offset + 47, $wtax_rate, value);
	}

	/**
	 * Withholding tax rate 源泉税率.<p>
	 *
	 */
	public void wtax_rate(double value) {
		setConstNumber(offset + 47, $wtax_rate, value);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR wtax_amt_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 48, $wtax_amt_p);
	}
	
	public void wtax_amt_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 48, $wtax_amt_p, row);
	}


	/**
	 * External system cd. 外部システムＣＤ.<p>
	 *
	 */
	public String ext_sys_cd() {
		return getConstString(offset + 49, $ext_sys_cd);
	}

	/**
	 * External system cd. 外部システムＣＤ.<p>
	 *
	 */
	public void ext_sys_cd(String value) {
		setConstString(offset + 49, $ext_sys_cd, value);
	}


	/**
	 * External system name 外部システム名.<p>
	 *
	 */
	public String ext_sys_nm() {
		return getConstString(offset + 50, $ext_sys_nm);
	}

	/**
	 * External system name 外部システム名.<p>
	 *
	 */
	public void ext_sys_nm(String value) {
		setConstString(offset + 50, $ext_sys_nm, value);
	}


	/**
	 * External purchase result details No. 外部仕入実績明細ＮＯ.<p>
	 *
	 */
	public String ext_purc_act_d_no() {
		return getConstString(offset + 51, $ext_purc_act_d_no);
	}

	/**
	 * External purchase result details No. 外部仕入実績明細ＮＯ.<p>
	 *
	 */
	public void ext_purc_act_d_no(String value) {
		setConstString(offset + 51, $ext_purc_act_d_no, value);
	}


	/**
	 * Transaction details remarks 取引明細備考.<p>
	 *
	 */
	public String trd_d_rmrks() {
		return getConstString(offset + 52, $trd_d_rmrks);
	}

	/**
	 * Transaction details remarks 取引明細備考.<p>
	 *
	 */
	public void trd_d_rmrks(String value) {
		setConstString(offset + 52, $trd_d_rmrks, value);
	}


	/**
	 * Internal details remarks 内部明細備考.<p>
	 *
	 */
	public String intr_rmrks() {
		return getConstString(offset + 53, $intr_rmrks);
	}

	/**
	 * Internal details remarks 内部明細備考.<p>
	 *
	 */
	public void intr_rmrks(String value) {
		setConstString(offset + 53, $intr_rmrks, value);
	}


	/**
	 * Details spare 1 明細予備１.<p>
	 *
	 */
	public String sub_char1() {
		return getConstString(offset + 54, $sub_char1);
	}

	/**
	 * Details spare 1 明細予備１.<p>
	 *
	 */
	public void sub_char1(String value) {
		setConstString(offset + 54, $sub_char1, value);
	}


	/**
	 * Details spare 2 明細予備２.<p>
	 *
	 */
	public String sub_char2() {
		return getConstString(offset + 55, $sub_char2);
	}

	/**
	 * Details spare 2 明細予備２.<p>
	 *
	 */
	public void sub_char2(String value) {
		setConstString(offset + 55, $sub_char2, value);
	}


	/**
	 * Details spare 3 明細予備３.<p>
	 *
	 */
	public String sub_char3() {
		return getConstString(offset + 56, $sub_char3);
	}

	/**
	 * Details spare 3 明細予備３.<p>
	 *
	 */
	public void sub_char3(String value) {
		setConstString(offset + 56, $sub_char3, value);
	}


	/**
	 * Sales result details No. 売上実績明細ＮＯ.<p>
	 *
	 */
	public String sls_act_d_no() {
		return getConstString(offset + 57, $sls_act_d_no);
	}

	/**
	 * Sales result details No. 売上実績明細ＮＯ.<p>
	 *
	 */
	public void sls_act_d_no(String value) {
		setConstString(offset + 57, $sls_act_d_no, value);
	}


	/**
	 * Purchase recording month 仕入計上年月.<p>
	 *
	 */
	public MCDate purc_ac_ym() {
		return getConstDate(offset + 58, $purc_ac_ym);
	}

	/**
	 * Purchase recording month 仕入計上年月.<p>
	 *
	 */
	public void purc_ac_ym(MCDate value) {
		setConstDate(offset + 58, $purc_ac_ym, value);
	}


	/**
	 * Purchase recording date 仕入計上日.<p>
	 *
	 */
	public MCDate purc_ac_dt() {
		return getConstDate(offset + 59, $purc_ac_dt);
	}

	/**
	 * Purchase recording date 仕入計上日.<p>
	 *
	 */
	public void purc_ac_dt(MCDate value) {
		setConstDate(offset + 59, $purc_ac_dt, value);
	}


	/**
	 * Purchase date 仕入日.<p>
	 *
	 */
	public MCDate purc_dt() {
		return getConstDate(offset + 60, $purc_dt);
	}

	/**
	 * Purchase date 仕入日.<p>
	 *
	 */
	public void purc_dt(MCDate value) {
		setConstDate(offset + 60, $purc_dt, value);
	}


	/**
	 * Purchase result No. 仕入実績ＮＯ.<p>
	 *
	 */
	public String purc_act_no() {
		return getConstString(offset + 61, $purc_act_no);
	}

	/**
	 * Purchase result No. 仕入実績ＮＯ.<p>
	 *
	 */
	public void purc_act_no(String value) {
		setConstString(offset + 61, $purc_act_no, value);
	}


	/**
	 * Purchase result details No. 仕入実績明細ＮＯ.<p>
	 *
	 */
	public String purc_act_d_no() {
		return getConstString(offset + 62, $purc_act_d_no);
	}

	/**
	 * Purchase result details No. 仕入実績明細ＮＯ.<p>
	 *
	 */
	public void purc_act_d_no(String value) {
		setConstString(offset + 62, $purc_act_d_no, value);
	}


	/**
	 * PO No. 発注ＮＯ.<p>
	 *
	 */
	public String po_no() {
		return getConstString(offset + 63, $po_no);
	}

	/**
	 * PO No. 発注ＮＯ.<p>
	 *
	 */
	public void po_no(String value) {
		setConstString(offset + 63, $po_no, value);
	}


	/**
	 * PO details No. 発注明細ＮＯ.<p>
	 *
	 */
	public String po_d_no() {
		return getConstString(offset + 64, $po_d_no);
	}

	/**
	 * PO details No. 発注明細ＮＯ.<p>
	 *
	 */
	public void po_d_no(String value) {
		setConstString(offset + 64, $po_d_no, value);
	}


	/**
	 * Supplier cd. 発注先ＣＤ.<p>
	 *
	 */
	public String sppl_cd() {
		return getConstString(offset + 65, $sppl_cd);
	}

	/**
	 * Supplier cd. 発注先ＣＤ.<p>
	 *
	 */
	public void sppl_cd(String value) {
		setConstString(offset + 65, $sppl_cd, value);
	}


	/**
	 * Supplier name 発注先名.<p>
	 *
	 */
	public String sppl_nm() {
		return getConstString(offset + 66, $sppl_nm);
	}

	/**
	 * Supplier name 発注先名.<p>
	 *
	 */
	public void sppl_nm(String value) {
		setConstString(offset + 66, $sppl_nm, value);
	}


	/**
	 * For invoice transaction インボイス取引対象.<p>
	 *
	 */
	public boolean sppl_iv_flg() {
		return getConstBoolean(offset + 67, $sppl_iv_flg);
	}

	/**
	 * For invoice transaction インボイス取引対象.<p>
	 *
	 */
	public void sppl_iv_flg(boolean value) {
		setConstBoolean(offset + 67, $sppl_iv_flg, value);
	}


	/**
	 * For subcontract 下請対象.<p>
	 *
	 */
	public boolean subcon_flg() {
		return getConstBoolean(offset + 68, $subcon_flg);
	}

	/**
	 * For subcontract 下請対象.<p>
	 *
	 */
	public void subcon_flg(boolean value) {
		setConstBoolean(offset + 68, $subcon_flg, value);
	}


	/**
	 * Maker cd. メーカＣＤ.<p>
	 *
	 */
	public String maker_cd() {
		return getConstString(offset + 69, $maker_cd);
	}

	/**
	 * Maker cd. メーカＣＤ.<p>
	 *
	 */
	public void maker_cd(String value) {
		setConstString(offset + 69, $maker_cd, value);
	}


	/**
	 * Maker name メーカ名.<p>
	 *
	 */
	public String maker_nm() {
		return getConstString(offset + 70, $maker_nm);
	}

	/**
	 * Maker name メーカ名.<p>
	 *
	 */
	public void maker_nm(String value) {
		setConstString(offset + 70, $maker_nm, value);
	}


	/**
	 * Vendor delivery note No. 業者納品書ＮＯ.<p>
	 *
	 */
	public String bp_dlv_slip_no() {
		return getConstString(offset + 71, $bp_dlv_slip_no);
	}

	/**
	 * Vendor delivery note No. 業者納品書ＮＯ.<p>
	 *
	 */
	public void bp_dlv_slip_no(String value) {
		setConstString(offset + 71, $bp_dlv_slip_no, value);
	}


	/**
	 * Vendor delivery note details No. 業者納品書明細ＮＯ.<p>
	 *
	 */
	public String bp_dlv_slip_d_no() {
		return getConstString(offset + 72, $bp_dlv_slip_d_no);
	}

	/**
	 * Vendor delivery note details No. 業者納品書明細ＮＯ.<p>
	 *
	 */
	public void bp_dlv_slip_d_no(String value) {
		setConstString(offset + 72, $bp_dlv_slip_d_no, value);
	}


	public mcframe.clientMSUB.MSUBP5030.LotNoR lot_no_p(){
		return (mcframe.clientMSUB.MSUBP5030.LotNoR) getConstInnerRow(offset + 73, $lot_no_p);
	}
	
	public void lot_no_p(mcframe.clientMSUB.MSUBP5030.LotNoR row){
		setConstInnerRow(offset + 73, $lot_no_p, row);
	}


	/**
	 * Vendor lot No. 業者ロットＮＯ.<p>
	 *
	 */
	public String bp_lot_no() {
		return getConstString(offset + 74, $bp_lot_no);
	}

	/**
	 * Vendor lot No. 業者ロットＮＯ.<p>
	 *
	 */
	public void bp_lot_no(String value) {
		setConstString(offset + 74, $bp_lot_no, value);
	}


	/**
	 * Shipping point deadline 出荷元期限.<p>
	 *
	 */
	public MCDate ship_fr_valid_dt() {
		return getConstDate(offset + 75, $ship_fr_valid_dt);
	}

	/**
	 * Shipping point deadline 出荷元期限.<p>
	 *
	 */
	public void ship_fr_valid_dt(MCDate value) {
		setConstDate(offset + 75, $ship_fr_valid_dt, value);
	}


	public mcframe.clientMAUB.MAUBP5250.VerNoR ver_no_p(){
		return (mcframe.clientMAUB.MAUBP5250.VerNoR) getConstInnerRow(offset + 76, $ver_no_p);
	}
	
	public void ver_no_p(mcframe.clientMAUB.MAUBP5250.VerNoR row){
		setConstInnerRow(offset + 76, $ver_no_p, row);
	}


	public mcframe.clientMAUB.MAUBP5300.PurcContQtyR purc_cont_qty_p(){
		return (mcframe.clientMAUB.MAUBP5300.PurcContQtyR) getConstInnerRow(offset + 77, $purc_cont_qty_p);
	}
	
	public void purc_cont_qty_p(mcframe.clientMAUB.MAUBP5300.PurcContQtyR row){
		setConstInnerRow(offset + 77, $purc_cont_qty_p, row);
	}


	public mcframe.clientMAUB.MAUBP5330.PurcContFctrR purc_cont_fctr_p(){
		return (mcframe.clientMAUB.MAUBP5330.PurcContFctrR) getConstInnerRow(offset + 78, $purc_cont_fctr_p);
	}
	
	public void purc_cont_fctr_p(mcframe.clientMAUB.MAUBP5330.PurcContFctrR row){
		setConstInnerRow(offset + 78, $purc_cont_fctr_p, row);
	}


	public mcframe.clientMAUB.MAUBP5260.ContQtyR std_cont_qty_p(){
		return (mcframe.clientMAUB.MAUBP5260.ContQtyR) getConstInnerRow(offset + 79, $std_cont_qty_p);
	}
	
	public void std_cont_qty_p(mcframe.clientMAUB.MAUBP5260.ContQtyR row){
		setConstInnerRow(offset + 79, $std_cont_qty_p, row);
	}


	public mcframe.clientMAUB.MAUBP5270.ContFctrUnitR cont_fctr_unit_p(){
		return (mcframe.clientMAUB.MAUBP5270.ContFctrUnitR) getConstInnerRow(offset + 80, $cont_fctr_unit_p);
	}
	
	public void cont_fctr_unit_p(mcframe.clientMAUB.MAUBP5270.ContFctrUnitR row){
		setConstInnerRow(offset + 80, $cont_fctr_unit_p, row);
	}


	public mcframe.clientMAUB.MAUBP5280.StdContFctrR std_cont_fctr_p(){
		return (mcframe.clientMAUB.MAUBP5280.StdContFctrR) getConstInnerRow(offset + 81, $std_cont_fctr_p);
	}
	
	public void std_cont_fctr_p(mcframe.clientMAUB.MAUBP5280.StdContFctrR row){
		setConstInnerRow(offset + 81, $std_cont_fctr_p, row);
	}


	public mcframe.clientMSUB.MSUBP5020.SnoWrkNoR sno_wrk_no_p(){
		return (mcframe.clientMSUB.MSUBP5020.SnoWrkNoR) getConstInnerRow(offset + 82, $sno_wrk_no_p);
	}
	
	public void sno_wrk_no_p(mcframe.clientMSUB.MSUBP5020.SnoWrkNoR row){
		setConstInnerRow(offset + 82, $sno_wrk_no_p, row);
	}


	/**
	 * Purchase currency cd. 仕入通貨ＣＤ.<p>
	 *
	 */
	public String purc_trd_cur_cd() {
		return getConstString(offset + 83, $purc_trd_cur_cd);
	}

	/**
	 * Purchase currency cd. 仕入通貨ＣＤ.<p>
	 *
	 */
	public void purc_trd_cur_cd(String value) {
		setConstString(offset + 83, $purc_trd_cur_cd, value);
	}


	/**
	 * Purchase currency name 仕入通貨名.<p>
	 *
	 */
	public String purc_trd_cur_nm() {
		return getConstString(offset + 84, $purc_trd_cur_nm);
	}

	/**
	 * Purchase currency name 仕入通貨名.<p>
	 *
	 */
	public void purc_trd_cur_nm(String value) {
		setConstString(offset + 84, $purc_trd_cur_nm, value);
	}


	/**
	 * Specify scheduled purchase rate 仕入予定レート指定.<p>
	 *
	 */
	public boolean purc_xrate_inpt_flg() {
		return getConstBoolean(offset + 85, $purc_xrate_inpt_flg);
	}

	/**
	 * Specify scheduled purchase rate 仕入予定レート指定.<p>
	 *
	 */
	public void purc_xrate_inpt_flg(boolean value) {
		setConstBoolean(offset + 85, $purc_xrate_inpt_flg, value);
	}


	public mcframe.clientMAUB.MAUBP5390.XrateR purc_xrate_p(){
		return (mcframe.clientMAUB.MAUBP5390.XrateR) getConstInnerRow(offset + 86, $purc_xrate_p);
	}
	
	public void purc_xrate_p(mcframe.clientMAUB.MAUBP5390.XrateR row){
		setConstInnerRow(offset + 86, $purc_xrate_p, row);
	}


	/**
	 * Set scheduled purchase tax rate 仕入予定納税レート指定.<p>
	 *
	 */
	public boolean purc_ptax_xrate_inpt_flg() {
		return getConstBoolean(offset + 87, $purc_ptax_xrate_inpt_flg);
	}

	/**
	 * Set scheduled purchase tax rate 仕入予定納税レート指定.<p>
	 *
	 */
	public void purc_ptax_xrate_inpt_flg(boolean value) {
		setConstBoolean(offset + 87, $purc_ptax_xrate_inpt_flg, value);
	}


	public mcframe.clientMAUB.MAUBP5390.XrateR purc_ptax_xrate_p(){
		return (mcframe.clientMAUB.MAUBP5390.XrateR) getConstInnerRow(offset + 88, $purc_ptax_xrate_p);
	}
	
	public void purc_ptax_xrate_p(mcframe.clientMAUB.MAUBP5390.XrateR row){
		setConstInnerRow(offset + 88, $purc_ptax_xrate_p, row);
	}


	/**
	 * Purchase details correction 仕入明細訂正.<p>
	 *
	 */
	public boolean purc_dtl_upd_flg() {
		return getConstBoolean(offset + 89, $purc_dtl_upd_flg);
	}

	/**
	 * Purchase details correction 仕入明細訂正.<p>
	 *
	 */
	public void purc_dtl_upd_flg(boolean value) {
		setConstBoolean(offset + 89, $purc_dtl_upd_flg, value);
	}


	public mcframe.clientMSUB.MSUBP5070.TrdUpriAmtR purc_trd_upri_amt_p(){
		return (mcframe.clientMSUB.MSUBP5070.TrdUpriAmtR) getConstInnerRow(offset + 90, $purc_trd_upri_amt_p);
	}
	
	public void purc_trd_upri_amt_p(mcframe.clientMSUB.MSUBP5070.TrdUpriAmtR row){
		setConstInnerRow(offset + 90, $purc_trd_upri_amt_p, row);
	}


	public mcframe.clientMAUB.MAUBP5060.UpriR purc_base_cur_upri_p(){
		return (mcframe.clientMAUB.MAUBP5060.UpriR) getConstInnerRow(offset + 91, $purc_base_cur_upri_p);
	}
	
	public void purc_base_cur_upri_p(mcframe.clientMAUB.MAUBP5060.UpriR row){
		setConstInnerRow(offset + 91, $purc_base_cur_upri_p, row);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR purc_base_cur_amt_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 92, $purc_base_cur_amt_p);
	}
	
	public void purc_base_cur_amt_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 92, $purc_base_cur_amt_p, row);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR purc_base_cur_inc_tax_amt_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 93, $purc_base_cur_inc_tax_amt_p);
	}
	
	public void purc_base_cur_inc_tax_amt_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 93, $purc_base_cur_inc_tax_amt_p, row);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR purc_base_cur_tax_amt_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 94, $purc_base_cur_tax_amt_p);
	}
	
	public void purc_base_cur_tax_amt_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 94, $purc_base_cur_tax_amt_p, row);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR purc_base_cur_dscnt_amt_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 95, $purc_base_cur_dscnt_amt_p);
	}
	
	public void purc_base_cur_dscnt_amt_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 95, $purc_base_cur_dscnt_amt_p, row);
	}


	/**
	 * Taxpaying date 納税日.<p>
	 *
	 */
	public MCDate ptax_dt() {
		return getConstDate(offset + 96, $ptax_dt);
	}

	/**
	 * Taxpaying date 納税日.<p>
	 *
	 */
	public void ptax_dt(MCDate value) {
		setConstDate(offset + 96, $ptax_dt, value);
	}


	public mcframe.clientMAUB.MAUBP5060.UpriR purc_ptax_cur_upri_p(){
		return (mcframe.clientMAUB.MAUBP5060.UpriR) getConstInnerRow(offset + 97, $purc_ptax_cur_upri_p);
	}
	
	public void purc_ptax_cur_upri_p(mcframe.clientMAUB.MAUBP5060.UpriR row){
		setConstInnerRow(offset + 97, $purc_ptax_cur_upri_p, row);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR purc_ptax_cur_amt_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 98, $purc_ptax_cur_amt_p);
	}
	
	public void purc_ptax_cur_amt_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 98, $purc_ptax_cur_amt_p, row);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR purc_ptax_cur_inc_tax_amt_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 99, $purc_ptax_cur_inc_tax_amt_p);
	}
	
	public void purc_ptax_cur_inc_tax_amt_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 99, $purc_ptax_cur_inc_tax_amt_p, row);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR purc_ptax_cur_tax_amt_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 100, $purc_ptax_cur_tax_amt_p);
	}
	
	public void purc_ptax_cur_tax_amt_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 100, $purc_ptax_cur_tax_amt_p, row);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR purc_ptax_cur_dscnt_amt_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 101, $purc_ptax_cur_dscnt_amt_p);
	}
	
	public void purc_ptax_cur_dscnt_amt_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 101, $purc_ptax_cur_dscnt_amt_p, row);
	}


	/**
	 * Purchase reason cd. 仕入理由ＣＤ.<p>
	 *
	 */
	public String purc_rsn_cd() {
		return getConstString(offset + 102, $purc_rsn_cd);
	}

	/**
	 * Purchase reason cd. 仕入理由ＣＤ.<p>
	 *
	 */
	public void purc_rsn_cd(String value) {
		setConstString(offset + 102, $purc_rsn_cd, value);
	}


	/**
	 * Purchase reason name 仕入理由名.<p>
	 *
	 */
	public String purc_rsn_nm() {
		return getConstString(offset + 103, $purc_rsn_nm);
	}

	/**
	 * Purchase reason name 仕入理由名.<p>
	 *
	 */
	public void purc_rsn_nm(String value) {
		setConstString(offset + 103, $purc_rsn_nm, value);
	}


	/**
	 * Purchase charged dept. cd. 仕入負担部門ＣＤ.<p>
	 *
	 */
	public String purc_bd_dpt_cd() {
		return getConstString(offset + 104, $purc_bd_dpt_cd);
	}

	/**
	 * Purchase charged dept. cd. 仕入負担部門ＣＤ.<p>
	 *
	 */
	public void purc_bd_dpt_cd(String value) {
		setConstString(offset + 104, $purc_bd_dpt_cd, value);
	}


	/**
	 * Purchase charged dept. name 仕入負担部門名.<p>
	 *
	 */
	public String purc_bd_dpt_nm() {
		return getConstString(offset + 105, $purc_bd_dpt_nm);
	}

	/**
	 * Purchase charged dept. name 仕入負担部門名.<p>
	 *
	 */
	public void purc_bd_dpt_nm(String value) {
		setConstString(offset + 105, $purc_bd_dpt_nm, value);
	}


	/**
	 * Purchase withholding tax rate 仕入源泉税率.<p>
	 *
	 */
	public MCNumber purc_wtax_rate() {
		return getConstNumber(offset + 106, $purc_wtax_rate);
	}

	/**
	 * Purchase withholding tax rate 仕入源泉税率.<p>
	 *
	 */
	public void purc_wtax_rate(MCNumber value) {
		setConstNumber(offset + 106, $purc_wtax_rate, value);
	}

	/**
	 * Purchase withholding tax rate 仕入源泉税率.<p>
	 *
	 */
	public void purc_wtax_rate(int value) {
		setConstNumber(offset + 106, $purc_wtax_rate, value);
	}

	/**
	 * Purchase withholding tax rate 仕入源泉税率.<p>
	 *
	 */
	public void purc_wtax_rate(long value) {
		setConstNumber(offset + 106, $purc_wtax_rate, value);
	}

	/**
	 * Purchase withholding tax rate 仕入源泉税率.<p>
	 *
	 */
	public void purc_wtax_rate(float value) {
		setConstNumber(offset + 106, $purc_wtax_rate, value);
	}

	/**
	 * Purchase withholding tax rate 仕入源泉税率.<p>
	 *
	 */
	public void purc_wtax_rate(double value) {
		setConstNumber(offset + 106, $purc_wtax_rate, value);
	}


	/**
	 * Purchase withholding tax amount 仕入源泉税額.<p>
	 *
	 */
	public MCNumber purc_wtax_amt() {
		return getConstNumber(offset + 107, $purc_wtax_amt);
	}

	/**
	 * Purchase withholding tax amount 仕入源泉税額.<p>
	 *
	 */
	public void purc_wtax_amt(MCNumber value) {
		setConstNumber(offset + 107, $purc_wtax_amt, value);
	}

	/**
	 * Purchase withholding tax amount 仕入源泉税額.<p>
	 *
	 */
	public void purc_wtax_amt(int value) {
		setConstNumber(offset + 107, $purc_wtax_amt, value);
	}

	/**
	 * Purchase withholding tax amount 仕入源泉税額.<p>
	 *
	 */
	public void purc_wtax_amt(long value) {
		setConstNumber(offset + 107, $purc_wtax_amt, value);
	}

	/**
	 * Purchase withholding tax amount 仕入源泉税額.<p>
	 *
	 */
	public void purc_wtax_amt(float value) {
		setConstNumber(offset + 107, $purc_wtax_amt, value);
	}

	/**
	 * Purchase withholding tax amount 仕入源泉税額.<p>
	 *
	 */
	public void purc_wtax_amt(double value) {
		setConstNumber(offset + 107, $purc_wtax_amt, value);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR purc_qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 108, $purc_qty_p);
	}
	
	public void purc_qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 108, $purc_qty_p, row);
	}


	/**
	 * Base unit purchase scheduled qty. 基準単位仕入予定数量.<p>
	 *
	 */
	public MCNumber base_unit_purc_schd_qty() {
		return getConstNumber(offset + 109, $base_unit_purc_schd_qty);
	}

	/**
	 * Base unit purchase scheduled qty. 基準単位仕入予定数量.<p>
	 *
	 */
	public void base_unit_purc_schd_qty(MCNumber value) {
		setConstNumber(offset + 109, $base_unit_purc_schd_qty, value);
	}

	/**
	 * Base unit purchase scheduled qty. 基準単位仕入予定数量.<p>
	 *
	 */
	public void base_unit_purc_schd_qty(int value) {
		setConstNumber(offset + 109, $base_unit_purc_schd_qty, value);
	}

	/**
	 * Base unit purchase scheduled qty. 基準単位仕入予定数量.<p>
	 *
	 */
	public void base_unit_purc_schd_qty(long value) {
		setConstNumber(offset + 109, $base_unit_purc_schd_qty, value);
	}

	/**
	 * Base unit purchase scheduled qty. 基準単位仕入予定数量.<p>
	 *
	 */
	public void base_unit_purc_schd_qty(float value) {
		setConstNumber(offset + 109, $base_unit_purc_schd_qty, value);
	}

	/**
	 * Base unit purchase scheduled qty. 基準単位仕入予定数量.<p>
	 *
	 */
	public void base_unit_purc_schd_qty(double value) {
		setConstNumber(offset + 109, $base_unit_purc_schd_qty, value);
	}


	/**
	 * PO sheet remarks 注文書備考.<p>
	 *
	 */
	public String po_print_rmrks() {
		return getConstString(offset + 110, $po_print_rmrks);
	}

	/**
	 * PO sheet remarks 注文書備考.<p>
	 *
	 */
	public void po_print_rmrks(String value) {
		setConstString(offset + 110, $po_print_rmrks, value);
	}


	/**
	 * PO sheet details remarks 注文書明細備考.<p>
	 *
	 */
	public String po_print_d_rmrks() {
		return getConstString(offset + 111, $po_print_d_rmrks);
	}

	/**
	 * PO sheet details remarks 注文書明細備考.<p>
	 *
	 */
	public void po_print_d_rmrks(String value) {
		setConstString(offset + 111, $po_print_d_rmrks, value);
	}


	/**
	 * Sales order details No. 受注明細ＮＯ.<p>
	 *
	 */
	public String slo_d_no() {
		return getConstString(offset + 112, $slo_d_no);
	}

	/**
	 * Sales order details No. 受注明細ＮＯ.<p>
	 *
	 */
	public void slo_d_no(String value) {
		setConstString(offset + 112, $slo_d_no, value);
	}


	/**
	 * Display order 表示順.<p>
	 *
	 */
	public MCNumber disp_seq() {
		return getConstNumber(offset + 113, $disp_seq);
	}

	/**
	 * Display order 表示順.<p>
	 *
	 */
	public void disp_seq(MCNumber value) {
		setConstNumber(offset + 113, $disp_seq, value);
	}

	/**
	 * Display order 表示順.<p>
	 *
	 */
	public void disp_seq(int value) {
		setConstNumber(offset + 113, $disp_seq, value);
	}

	/**
	 * Display order 表示順.<p>
	 *
	 */
	public void disp_seq(long value) {
		setConstNumber(offset + 113, $disp_seq, value);
	}

	/**
	 * Display order 表示順.<p>
	 *
	 */
	public void disp_seq(float value) {
		setConstNumber(offset + 113, $disp_seq, value);
	}

	/**
	 * Display order 表示順.<p>
	 *
	 */
	public void disp_seq(double value) {
		setConstNumber(offset + 113, $disp_seq, value);
	}


	/**
	 * Lot management type ロット管理区分.<p>
	 *
	 */
	public String lot_mng_typ() {
		return getConstString(offset + 114, $lot_mng_typ);
	}

	/**
	 * Lot management type ロット管理区分.<p>
	 *
	 */
	public void lot_mng_typ(String value) {
		setConstString(offset + 114, $lot_mng_typ, value);
	}


	/**
	 * Sublot management type サブロット管理区分.<p>
	 *
	 */
	public String sublot_mng_typ() {
		return getConstString(offset + 115, $sublot_mng_typ);
	}

	/**
	 * Sublot management type サブロット管理区分.<p>
	 *
	 */
	public void sublot_mng_typ(String value) {
		setConstString(offset + 115, $sublot_mng_typ, value);
	}


	/**
	 * Lot No. type ロットＮＯ区分.<p>
	 *
	 */
	public String lot_no_typ() {
		return getConstString(offset + 116, $lot_no_typ);
	}

	/**
	 * Lot No. type ロットＮＯ区分.<p>
	 *
	 */
	public void lot_no_typ(String value) {
		setConstString(offset + 116, $lot_no_typ, value);
	}


	/**
	 * Sublot No. type サブロットＮＯ区分.<p>
	 *
	 */
	public String sublot_no_typ() {
		return getConstString(offset + 117, $sublot_no_typ);
	}

	/**
	 * Sublot No. type サブロットＮＯ区分.<p>
	 *
	 */
	public void sublot_no_typ(String value) {
		setConstString(offset + 117, $sublot_no_typ, value);
	}


	/**
	 * SEIBAN No. 1 management type 手配ＮＯ１管理区分.<p>
	 *
	 */
	public String sno1_mng_typ() {
		return getConstString(offset + 118, $sno1_mng_typ);
	}

	/**
	 * SEIBAN No. 1 management type 手配ＮＯ１管理区分.<p>
	 *
	 */
	public void sno1_mng_typ(String value) {
		setConstString(offset + 118, $sno1_mng_typ, value);
	}


	/**
	 * SEIBAN No. 2 management type 手配ＮＯ２管理区分.<p>
	 *
	 */
	public String sno2_mng_typ() {
		return getConstString(offset + 119, $sno2_mng_typ);
	}

	/**
	 * SEIBAN No. 2 management type 手配ＮＯ２管理区分.<p>
	 *
	 */
	public void sno2_mng_typ(String value) {
		setConstString(offset + 119, $sno2_mng_typ, value);
	}


	/**
	 * SEIBAN No. 3 management type 手配ＮＯ３管理区分.<p>
	 *
	 */
	public String sno3_mng_typ() {
		return getConstString(offset + 120, $sno3_mng_typ);
	}

	/**
	 * SEIBAN No. 3 management type 手配ＮＯ３管理区分.<p>
	 *
	 */
	public void sno3_mng_typ(String value) {
		setConstString(offset + 120, $sno3_mng_typ, value);
	}


	/**
	 * SEIBAN No. 4 management type 手配ＮＯ４管理区分.<p>
	 *
	 */
	public String sno4_mng_typ() {
		return getConstString(offset + 121, $sno4_mng_typ);
	}

	/**
	 * SEIBAN No. 4 management type 手配ＮＯ４管理区分.<p>
	 *
	 */
	public void sno4_mng_typ(String value) {
		setConstString(offset + 121, $sno4_mng_typ, value);
	}


	/**
	 * Inventory management type 在庫管理区分.<p>
	 *
	 */
	public String stk_mng_typ() {
		return getConstString(offset + 122, $stk_mng_typ);
	}

	/**
	 * Inventory management type 在庫管理区分.<p>
	 *
	 */
	public void stk_mng_typ(String value) {
		setConstString(offset + 122, $stk_mng_typ, value);
	}


	/**
	 * Discount item 値引品目.<p>
	 *
	 */
	public boolean dscnt_itm_flg() {
		return getConstBoolean(offset + 123, $dscnt_itm_flg);
	}

	/**
	 * Discount item 値引品目.<p>
	 *
	 */
	public void dscnt_itm_flg(boolean value) {
		setConstBoolean(offset + 123, $dscnt_itm_flg, value);
	}


	/**
	 * Billing carry-over count 請求繰越回数.<p>
	 *
	 */
	public MCNumber itm_bill_crryovr_times() {
		return getConstNumber(offset + 124, $itm_bill_crryovr_times);
	}

	/**
	 * Billing carry-over count 請求繰越回数.<p>
	 *
	 */
	public void itm_bill_crryovr_times(MCNumber value) {
		setConstNumber(offset + 124, $itm_bill_crryovr_times, value);
	}

	/**
	 * Billing carry-over count 請求繰越回数.<p>
	 *
	 */
	public void itm_bill_crryovr_times(int value) {
		setConstNumber(offset + 124, $itm_bill_crryovr_times, value);
	}

	/**
	 * Billing carry-over count 請求繰越回数.<p>
	 *
	 */
	public void itm_bill_crryovr_times(long value) {
		setConstNumber(offset + 124, $itm_bill_crryovr_times, value);
	}

	/**
	 * Billing carry-over count 請求繰越回数.<p>
	 *
	 */
	public void itm_bill_crryovr_times(float value) {
		setConstNumber(offset + 124, $itm_bill_crryovr_times, value);
	}

	/**
	 * Billing carry-over count 請求繰越回数.<p>
	 *
	 */
	public void itm_bill_crryovr_times(double value) {
		setConstNumber(offset + 124, $itm_bill_crryovr_times, value);
	}


	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public MCNumber base_unit_dec_place() {
		return getConstNumber(offset + 125, $base_unit_dec_place);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(MCNumber value) {
		setConstNumber(offset + 125, $base_unit_dec_place, value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(int value) {
		setConstNumber(offset + 125, $base_unit_dec_place, value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(long value) {
		setConstNumber(offset + 125, $base_unit_dec_place, value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(float value) {
		setConstNumber(offset + 125, $base_unit_dec_place, value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(double value) {
		setConstNumber(offset + 125, $base_unit_dec_place, value);
	}


	/**
	 * Base unit rounding type 基準単位端数処理区分.<p>
	 *
	 */
	public String base_unit_rnd_typ() {
		return getConstString(offset + 126, $base_unit_rnd_typ);
	}

	/**
	 * Base unit rounding type 基準単位端数処理区分.<p>
	 *
	 */
	public void base_unit_rnd_typ(String value) {
		setConstString(offset + 126, $base_unit_rnd_typ, value);
	}


	/**
	 * For active ingredient 有効成分対象.<p>
	 *
	 */
	public boolean cont_fctr_flg() {
		return getConstBoolean(offset + 127, $cont_fctr_flg);
	}

	/**
	 * For active ingredient 有効成分対象.<p>
	 *
	 */
	public void cont_fctr_flg(boolean value) {
		setConstBoolean(offset + 127, $cont_fctr_flg, value);
	}


	/**
	 * Rounding type (Active ingredient conversion) 有効成分換算端数処理区分.<p>
	 *
	 */
	public String cont_fctr_rnd_typ() {
		return getConstString(offset + 128, $cont_fctr_rnd_typ);
	}

	/**
	 * Rounding type (Active ingredient conversion) 有効成分換算端数処理区分.<p>
	 *
	 */
	public void cont_fctr_rnd_typ(String value) {
		setConstString(offset + 128, $cont_fctr_rnd_typ, value);
	}


	/**
	 * Active ingredient number of decimal places 有効成分小数部有効桁数.<p>
	 *
	 */
	public MCNumber cont_fctr_dec_place() {
		return getConstNumber(offset + 129, $cont_fctr_dec_place);
	}

	/**
	 * Active ingredient number of decimal places 有効成分小数部有効桁数.<p>
	 *
	 */
	public void cont_fctr_dec_place(MCNumber value) {
		setConstNumber(offset + 129, $cont_fctr_dec_place, value);
	}

	/**
	 * Active ingredient number of decimal places 有効成分小数部有効桁数.<p>
	 *
	 */
	public void cont_fctr_dec_place(int value) {
		setConstNumber(offset + 129, $cont_fctr_dec_place, value);
	}

	/**
	 * Active ingredient number of decimal places 有効成分小数部有効桁数.<p>
	 *
	 */
	public void cont_fctr_dec_place(long value) {
		setConstNumber(offset + 129, $cont_fctr_dec_place, value);
	}

	/**
	 * Active ingredient number of decimal places 有効成分小数部有効桁数.<p>
	 *
	 */
	public void cont_fctr_dec_place(float value) {
		setConstNumber(offset + 129, $cont_fctr_dec_place, value);
	}

	/**
	 * Active ingredient number of decimal places 有効成分小数部有効桁数.<p>
	 *
	 */
	public void cont_fctr_dec_place(double value) {
		setConstNumber(offset + 129, $cont_fctr_dec_place, value);
	}


	/**
	 * For version control 版管理対象.<p>
	 *
	 */
	public boolean ver_flg() {
		return getConstBoolean(offset + 130, $ver_flg);
	}

	/**
	 * For version control 版管理対象.<p>
	 *
	 */
	public void ver_flg(boolean value) {
		setConstBoolean(offset + 130, $ver_flg, value);
	}


	/**
	 * Transaction unit number of decimal places 取引単位小数部有効桁数.<p>
	 *
	 */
	public MCNumber trd_unit_dec_place() {
		return getConstNumber(offset + 131, $trd_unit_dec_place);
	}

	/**
	 * Transaction unit number of decimal places 取引単位小数部有効桁数.<p>
	 *
	 */
	public void trd_unit_dec_place(MCNumber value) {
		setConstNumber(offset + 131, $trd_unit_dec_place, value);
	}

	/**
	 * Transaction unit number of decimal places 取引単位小数部有効桁数.<p>
	 *
	 */
	public void trd_unit_dec_place(int value) {
		setConstNumber(offset + 131, $trd_unit_dec_place, value);
	}

	/**
	 * Transaction unit number of decimal places 取引単位小数部有効桁数.<p>
	 *
	 */
	public void trd_unit_dec_place(long value) {
		setConstNumber(offset + 131, $trd_unit_dec_place, value);
	}

	/**
	 * Transaction unit number of decimal places 取引単位小数部有効桁数.<p>
	 *
	 */
	public void trd_unit_dec_place(float value) {
		setConstNumber(offset + 131, $trd_unit_dec_place, value);
	}

	/**
	 * Transaction unit number of decimal places 取引単位小数部有効桁数.<p>
	 *
	 */
	public void trd_unit_dec_place(double value) {
		setConstNumber(offset + 131, $trd_unit_dec_place, value);
	}


	/**
	 * Transaction unit conversion base qty. 取引単位分母数量.<p>
	 *
	 */
	public MCNumber trd_unit_conv_base_qty() {
		return getConstNumber(offset + 132, $trd_unit_conv_base_qty);
	}

	/**
	 * Transaction unit conversion base qty. 取引単位分母数量.<p>
	 *
	 */
	public void trd_unit_conv_base_qty(MCNumber value) {
		setConstNumber(offset + 132, $trd_unit_conv_base_qty, value);
	}

	/**
	 * Transaction unit conversion base qty. 取引単位分母数量.<p>
	 *
	 */
	public void trd_unit_conv_base_qty(int value) {
		setConstNumber(offset + 132, $trd_unit_conv_base_qty, value);
	}

	/**
	 * Transaction unit conversion base qty. 取引単位分母数量.<p>
	 *
	 */
	public void trd_unit_conv_base_qty(long value) {
		setConstNumber(offset + 132, $trd_unit_conv_base_qty, value);
	}

	/**
	 * Transaction unit conversion base qty. 取引単位分母数量.<p>
	 *
	 */
	public void trd_unit_conv_base_qty(float value) {
		setConstNumber(offset + 132, $trd_unit_conv_base_qty, value);
	}

	/**
	 * Transaction unit conversion base qty. 取引単位分母数量.<p>
	 *
	 */
	public void trd_unit_conv_base_qty(double value) {
		setConstNumber(offset + 132, $trd_unit_conv_base_qty, value);
	}


	/**
	 * Transaction unit conversion qty. 取引単位換算数量.<p>
	 *
	 */
	public MCNumber trd_unit_conv_qty() {
		return getConstNumber(offset + 133, $trd_unit_conv_qty);
	}

	/**
	 * Transaction unit conversion qty. 取引単位換算数量.<p>
	 *
	 */
	public void trd_unit_conv_qty(MCNumber value) {
		setConstNumber(offset + 133, $trd_unit_conv_qty, value);
	}

	/**
	 * Transaction unit conversion qty. 取引単位換算数量.<p>
	 *
	 */
	public void trd_unit_conv_qty(int value) {
		setConstNumber(offset + 133, $trd_unit_conv_qty, value);
	}

	/**
	 * Transaction unit conversion qty. 取引単位換算数量.<p>
	 *
	 */
	public void trd_unit_conv_qty(long value) {
		setConstNumber(offset + 133, $trd_unit_conv_qty, value);
	}

	/**
	 * Transaction unit conversion qty. 取引単位換算数量.<p>
	 *
	 */
	public void trd_unit_conv_qty(float value) {
		setConstNumber(offset + 133, $trd_unit_conv_qty, value);
	}

	/**
	 * Transaction unit conversion qty. 取引単位換算数量.<p>
	 *
	 */
	public void trd_unit_conv_qty(double value) {
		setConstNumber(offset + 133, $trd_unit_conv_qty, value);
	}


	/**
	 * Transaction unit rounding type 取引単位端数処理区分.<p>
	 *
	 */
	public String trd_unit_rnd_typ() {
		return getConstString(offset + 134, $trd_unit_rnd_typ);
	}

	/**
	 * Transaction unit rounding type 取引単位端数処理区分.<p>
	 *
	 */
	public void trd_unit_rnd_typ(String value) {
		setConstString(offset + 134, $trd_unit_rnd_typ, value);
	}


	/**
	 * Sales other accounting 販売他勘定.<p>
	 *
	 */
	public boolean sls_acxfr_flg() {
		return getConstBoolean(offset + 135, $sls_acxfr_flg);
	}

	/**
	 * Sales other accounting 販売他勘定.<p>
	 *
	 */
	public void sls_acxfr_flg(boolean value) {
		setConstBoolean(offset + 135, $sls_acxfr_flg, value);
	}


	/**
	 * Expense purchase 経費購買.<p>
	 *
	 */
	public boolean xpns_purc_flg() {
		return getConstBoolean(offset + 136, $xpns_purc_flg);
	}

	/**
	 * Expense purchase 経費購買.<p>
	 *
	 */
	public void xpns_purc_flg(boolean value) {
		setConstBoolean(offset + 136, $xpns_purc_flg, value);
	}


	/**
	 * Sales result No. 売上実績ＮＯ.<p>
	 *
	 */
	public String sls_act_no() {
		return getConstString(offset + 137, $sls_act_no);
	}

	/**
	 * Sales result No. 売上実績ＮＯ.<p>
	 *
	 */
	public void sls_act_no(String value) {
		setConstString(offset + 137, $sls_act_no, value);
	}


	/**
	 * Sales result sequence number 売上実績連番.<p>
	 *
	 */
	public MCNumber sls_act_seq() {
		return getConstNumber(offset + 138, $sls_act_seq);
	}

	/**
	 * Sales result sequence number 売上実績連番.<p>
	 *
	 */
	public void sls_act_seq(MCNumber value) {
		setConstNumber(offset + 138, $sls_act_seq, value);
	}

	/**
	 * Sales result sequence number 売上実績連番.<p>
	 *
	 */
	public void sls_act_seq(int value) {
		setConstNumber(offset + 138, $sls_act_seq, value);
	}

	/**
	 * Sales result sequence number 売上実績連番.<p>
	 *
	 */
	public void sls_act_seq(long value) {
		setConstNumber(offset + 138, $sls_act_seq, value);
	}

	/**
	 * Sales result sequence number 売上実績連番.<p>
	 *
	 */
	public void sls_act_seq(float value) {
		setConstNumber(offset + 138, $sls_act_seq, value);
	}

	/**
	 * Sales result sequence number 売上実績連番.<p>
	 *
	 */
	public void sls_act_seq(double value) {
		setConstNumber(offset + 138, $sls_act_seq, value);
	}


	/**
	 * Sales result details sequence number 売上実績明細連番.<p>
	 *
	 */
	public MCNumber sls_act_d_seq() {
		return getConstNumber(offset + 139, $sls_act_d_seq);
	}

	/**
	 * Sales result details sequence number 売上実績明細連番.<p>
	 *
	 */
	public void sls_act_d_seq(MCNumber value) {
		setConstNumber(offset + 139, $sls_act_d_seq, value);
	}

	/**
	 * Sales result details sequence number 売上実績明細連番.<p>
	 *
	 */
	public void sls_act_d_seq(int value) {
		setConstNumber(offset + 139, $sls_act_d_seq, value);
	}

	/**
	 * Sales result details sequence number 売上実績明細連番.<p>
	 *
	 */
	public void sls_act_d_seq(long value) {
		setConstNumber(offset + 139, $sls_act_d_seq, value);
	}

	/**
	 * Sales result details sequence number 売上実績明細連番.<p>
	 *
	 */
	public void sls_act_d_seq(float value) {
		setConstNumber(offset + 139, $sls_act_d_seq, value);
	}

	/**
	 * Sales result details sequence number 売上実績明細連番.<p>
	 *
	 */
	public void sls_act_d_seq(double value) {
		setConstNumber(offset + 139, $sls_act_d_seq, value);
	}


	/**
	 * Sales schedule No. 売上予定ＮＯ.<p>
	 *
	 */
	public String sls_schd_no() {
		return getConstString(offset + 140, $sls_schd_no);
	}

	/**
	 * Sales schedule No. 売上予定ＮＯ.<p>
	 *
	 */
	public void sls_schd_no(String value) {
		setConstString(offset + 140, $sls_schd_no, value);
	}


	/**
	 * Purchase schedule No. 仕入予定ＮＯ.<p>
	 *
	 */
	public String purc_schd_no() {
		return getConstString(offset + 141, $purc_schd_no);
	}

	/**
	 * Purchase schedule No. 仕入予定ＮＯ.<p>
	 *
	 */
	public void purc_schd_no(String value) {
		setConstString(offset + 141, $purc_schd_no, value);
	}


	/**
	 * Details row ID 明細行ＩＤ.<p>
	 *
	 */
	public MCNumber dtl_row_id() {
		return getConstNumber(offset + 142, $dtl_row_id);
	}

	/**
	 * Details row ID 明細行ＩＤ.<p>
	 *
	 */
	public void dtl_row_id(MCNumber value) {
		setConstNumber(offset + 142, $dtl_row_id, value);
	}

	/**
	 * Details row ID 明細行ＩＤ.<p>
	 *
	 */
	public void dtl_row_id(int value) {
		setConstNumber(offset + 142, $dtl_row_id, value);
	}

	/**
	 * Details row ID 明細行ＩＤ.<p>
	 *
	 */
	public void dtl_row_id(long value) {
		setConstNumber(offset + 142, $dtl_row_id, value);
	}

	/**
	 * Details row ID 明細行ＩＤ.<p>
	 *
	 */
	public void dtl_row_id(float value) {
		setConstNumber(offset + 142, $dtl_row_id, value);
	}

	/**
	 * Details row ID 明細行ＩＤ.<p>
	 *
	 */
	public void dtl_row_id(double value) {
		setConstNumber(offset + 142, $dtl_row_id, value);
	}


	/**
	 * Receipt progress No. 入荷進捗ＮＯ.<p>
	 *
	 */
	public String arr_pr_no() {
		return getConstString(offset + 143, $arr_pr_no);
	}

	/**
	 * Receipt progress No. 入荷進捗ＮＯ.<p>
	 *
	 */
	public void arr_pr_no(String value) {
		setConstString(offset + 143, $arr_pr_no, value);
	}


	/**
	 * Shipping progress No. 出荷進捗ＮＯ.<p>
	 *
	 */
	public String ship_pr_no() {
		return getConstString(offset + 144, $ship_pr_no);
	}

	/**
	 * Shipping progress No. 出荷進捗ＮＯ.<p>
	 *
	 */
	public void ship_pr_no(String value) {
		setConstString(offset + 144, $ship_pr_no, value);
	}


	public boolean outsrc_flg() {
		return getConstBoolean(offset + 145, $outsrc_flg);
	}

	public void outsrc_flg(boolean value) {
		setConstBoolean(offset + 145, $outsrc_flg, value);
	}


	/**
	 * Set lot to be received 入荷予定ロット指定.<p>
	 *
	 */
	public boolean arr_schd_lot_fix_flg() {
		return getConstBoolean(offset + 146, $arr_schd_lot_fix_flg);
	}

	/**
	 * Set lot to be received 入荷予定ロット指定.<p>
	 *
	 */
	public void arr_schd_lot_fix_flg(boolean value) {
		setConstBoolean(offset + 146, $arr_schd_lot_fix_flg, value);
	}


	/**
	 * For market release decision 市場出荷判定対象.<p>
	 *
	 */
	public boolean mrkt_judg_flg() {
		return getConstBoolean(offset + 147, $mrkt_judg_flg);
	}

	/**
	 * For market release decision 市場出荷判定対象.<p>
	 *
	 */
	public void mrkt_judg_flg(boolean value) {
		setConstBoolean(offset + 147, $mrkt_judg_flg, value);
	}


	/**
	 * Scheduled unit price (Base unit) 予定単価(基準単位）.<p>
	 *
	 */
	public MCNumber base_unit_upri() {
		return getConstNumber(offset + 148, $base_unit_upri);
	}

	/**
	 * Scheduled unit price (Base unit) 予定単価(基準単位）.<p>
	 *
	 */
	public void base_unit_upri(MCNumber value) {
		setConstNumber(offset + 148, $base_unit_upri, value);
	}

	/**
	 * Scheduled unit price (Base unit) 予定単価(基準単位）.<p>
	 *
	 */
	public void base_unit_upri(int value) {
		setConstNumber(offset + 148, $base_unit_upri, value);
	}

	/**
	 * Scheduled unit price (Base unit) 予定単価(基準単位）.<p>
	 *
	 */
	public void base_unit_upri(long value) {
		setConstNumber(offset + 148, $base_unit_upri, value);
	}

	/**
	 * Scheduled unit price (Base unit) 予定単価(基準単位）.<p>
	 *
	 */
	public void base_unit_upri(float value) {
		setConstNumber(offset + 148, $base_unit_upri, value);
	}

	/**
	 * Scheduled unit price (Base unit) 予定単価(基準単位）.<p>
	 *
	 */
	public void base_unit_upri(double value) {
		setConstNumber(offset + 148, $base_unit_upri, value);
	}


	/**
	 * Initial scheduled qty. (Base unit) 当初予定数量（基準単位）.<p>
	 *
	 */
	public MCNumber init_schd_qty() {
		return getConstNumber(offset + 149, $init_schd_qty);
	}

	/**
	 * Initial scheduled qty. (Base unit) 当初予定数量（基準単位）.<p>
	 *
	 */
	public void init_schd_qty(MCNumber value) {
		setConstNumber(offset + 149, $init_schd_qty, value);
	}

	/**
	 * Initial scheduled qty. (Base unit) 当初予定数量（基準単位）.<p>
	 *
	 */
	public void init_schd_qty(int value) {
		setConstNumber(offset + 149, $init_schd_qty, value);
	}

	/**
	 * Initial scheduled qty. (Base unit) 当初予定数量（基準単位）.<p>
	 *
	 */
	public void init_schd_qty(long value) {
		setConstNumber(offset + 149, $init_schd_qty, value);
	}

	/**
	 * Initial scheduled qty. (Base unit) 当初予定数量（基準単位）.<p>
	 *
	 */
	public void init_schd_qty(float value) {
		setConstNumber(offset + 149, $init_schd_qty, value);
	}

	/**
	 * Initial scheduled qty. (Base unit) 当初予定数量（基準単位）.<p>
	 *
	 */
	public void init_schd_qty(double value) {
		setConstNumber(offset + 149, $init_schd_qty, value);
	}


	/**
	 * Initial scheduled discount amount 当初予定値引額.<p>
	 *
	 */
	public MCNumber init_schd_dscnt_amt() {
		return getConstNumber(offset + 150, $init_schd_dscnt_amt);
	}

	/**
	 * Initial scheduled discount amount 当初予定値引額.<p>
	 *
	 */
	public void init_schd_dscnt_amt(MCNumber value) {
		setConstNumber(offset + 150, $init_schd_dscnt_amt, value);
	}

	/**
	 * Initial scheduled discount amount 当初予定値引額.<p>
	 *
	 */
	public void init_schd_dscnt_amt(int value) {
		setConstNumber(offset + 150, $init_schd_dscnt_amt, value);
	}

	/**
	 * Initial scheduled discount amount 当初予定値引額.<p>
	 *
	 */
	public void init_schd_dscnt_amt(long value) {
		setConstNumber(offset + 150, $init_schd_dscnt_amt, value);
	}

	/**
	 * Initial scheduled discount amount 当初予定値引額.<p>
	 *
	 */
	public void init_schd_dscnt_amt(float value) {
		setConstNumber(offset + 150, $init_schd_dscnt_amt, value);
	}

	/**
	 * Initial scheduled discount amount 当初予定値引額.<p>
	 *
	 */
	public void init_schd_dscnt_amt(double value) {
		setConstNumber(offset + 150, $init_schd_dscnt_amt, value);
	}


	/**
	 * Update counter (Receipt progress) 更新カウンタ（入荷進捗）.<p>
	 *
	 */
	public MCNumber arr_pr_upd_cntr() {
		return getConstNumber(offset + 151, $arr_pr_upd_cntr);
	}

	/**
	 * Update counter (Receipt progress) 更新カウンタ（入荷進捗）.<p>
	 *
	 */
	public void arr_pr_upd_cntr(MCNumber value) {
		setConstNumber(offset + 151, $arr_pr_upd_cntr, value);
	}

	/**
	 * Update counter (Receipt progress) 更新カウンタ（入荷進捗）.<p>
	 *
	 */
	public void arr_pr_upd_cntr(int value) {
		setConstNumber(offset + 151, $arr_pr_upd_cntr, value);
	}

	/**
	 * Update counter (Receipt progress) 更新カウンタ（入荷進捗）.<p>
	 *
	 */
	public void arr_pr_upd_cntr(long value) {
		setConstNumber(offset + 151, $arr_pr_upd_cntr, value);
	}

	/**
	 * Update counter (Receipt progress) 更新カウンタ（入荷進捗）.<p>
	 *
	 */
	public void arr_pr_upd_cntr(float value) {
		setConstNumber(offset + 151, $arr_pr_upd_cntr, value);
	}

	/**
	 * Update counter (Receipt progress) 更新カウンタ（入荷進捗）.<p>
	 *
	 */
	public void arr_pr_upd_cntr(double value) {
		setConstNumber(offset + 151, $arr_pr_upd_cntr, value);
	}


	/**
	 * Update counter (Shipping progress) 更新カウンタ（出荷進捗）.<p>
	 *
	 */
	public MCNumber ship_pr_upd_cntr() {
		return getConstNumber(offset + 152, $ship_pr_upd_cntr);
	}

	/**
	 * Update counter (Shipping progress) 更新カウンタ（出荷進捗）.<p>
	 *
	 */
	public void ship_pr_upd_cntr(MCNumber value) {
		setConstNumber(offset + 152, $ship_pr_upd_cntr, value);
	}

	/**
	 * Update counter (Shipping progress) 更新カウンタ（出荷進捗）.<p>
	 *
	 */
	public void ship_pr_upd_cntr(int value) {
		setConstNumber(offset + 152, $ship_pr_upd_cntr, value);
	}

	/**
	 * Update counter (Shipping progress) 更新カウンタ（出荷進捗）.<p>
	 *
	 */
	public void ship_pr_upd_cntr(long value) {
		setConstNumber(offset + 152, $ship_pr_upd_cntr, value);
	}

	/**
	 * Update counter (Shipping progress) 更新カウンタ（出荷進捗）.<p>
	 *
	 */
	public void ship_pr_upd_cntr(float value) {
		setConstNumber(offset + 152, $ship_pr_upd_cntr, value);
	}

	/**
	 * Update counter (Shipping progress) 更新カウンタ（出荷進捗）.<p>
	 *
	 */
	public void ship_pr_upd_cntr(double value) {
		setConstNumber(offset + 152, $ship_pr_upd_cntr, value);
	}


	/**
	 * Initial scheduled amount 当初予定金額.<p>
	 *
	 */
	public MCNumber init_schd_amt() {
		return getConstNumber(offset + 153, $init_schd_amt);
	}

	/**
	 * Initial scheduled amount 当初予定金額.<p>
	 *
	 */
	public void init_schd_amt(MCNumber value) {
		setConstNumber(offset + 153, $init_schd_amt, value);
	}

	/**
	 * Initial scheduled amount 当初予定金額.<p>
	 *
	 */
	public void init_schd_amt(int value) {
		setConstNumber(offset + 153, $init_schd_amt, value);
	}

	/**
	 * Initial scheduled amount 当初予定金額.<p>
	 *
	 */
	public void init_schd_amt(long value) {
		setConstNumber(offset + 153, $init_schd_amt, value);
	}

	/**
	 * Initial scheduled amount 当初予定金額.<p>
	 *
	 */
	public void init_schd_amt(float value) {
		setConstNumber(offset + 153, $init_schd_amt, value);
	}

	/**
	 * Initial scheduled amount 当初予定金額.<p>
	 *
	 */
	public void init_schd_amt(double value) {
		setConstNumber(offset + 153, $init_schd_amt, value);
	}


	/**
	 * Transaction unit conversion conversion base qty. at schedule 予定時取引単位分母数量.<p>
	 *
	 */
	public MCNumber schd_trd_unit_conv_base_qty() {
		return getConstNumber(offset + 154, $schd_trd_unit_conv_base_qty);
	}

	/**
	 * Transaction unit conversion conversion base qty. at schedule 予定時取引単位分母数量.<p>
	 *
	 */
	public void schd_trd_unit_conv_base_qty(MCNumber value) {
		setConstNumber(offset + 154, $schd_trd_unit_conv_base_qty, value);
	}

	/**
	 * Transaction unit conversion conversion base qty. at schedule 予定時取引単位分母数量.<p>
	 *
	 */
	public void schd_trd_unit_conv_base_qty(int value) {
		setConstNumber(offset + 154, $schd_trd_unit_conv_base_qty, value);
	}

	/**
	 * Transaction unit conversion conversion base qty. at schedule 予定時取引単位分母数量.<p>
	 *
	 */
	public void schd_trd_unit_conv_base_qty(long value) {
		setConstNumber(offset + 154, $schd_trd_unit_conv_base_qty, value);
	}

	/**
	 * Transaction unit conversion conversion base qty. at schedule 予定時取引単位分母数量.<p>
	 *
	 */
	public void schd_trd_unit_conv_base_qty(float value) {
		setConstNumber(offset + 154, $schd_trd_unit_conv_base_qty, value);
	}

	/**
	 * Transaction unit conversion conversion base qty. at schedule 予定時取引単位分母数量.<p>
	 *
	 */
	public void schd_trd_unit_conv_base_qty(double value) {
		setConstNumber(offset + 154, $schd_trd_unit_conv_base_qty, value);
	}


	/**
	 * Transaction unit conversion qty. at schedule 予定時取引単位換算数量.<p>
	 *
	 */
	public MCNumber schd_trd_unit_conv_qty() {
		return getConstNumber(offset + 155, $schd_trd_unit_conv_qty);
	}

	/**
	 * Transaction unit conversion qty. at schedule 予定時取引単位換算数量.<p>
	 *
	 */
	public void schd_trd_unit_conv_qty(MCNumber value) {
		setConstNumber(offset + 155, $schd_trd_unit_conv_qty, value);
	}

	/**
	 * Transaction unit conversion qty. at schedule 予定時取引単位換算数量.<p>
	 *
	 */
	public void schd_trd_unit_conv_qty(int value) {
		setConstNumber(offset + 155, $schd_trd_unit_conv_qty, value);
	}

	/**
	 * Transaction unit conversion qty. at schedule 予定時取引単位換算数量.<p>
	 *
	 */
	public void schd_trd_unit_conv_qty(long value) {
		setConstNumber(offset + 155, $schd_trd_unit_conv_qty, value);
	}

	/**
	 * Transaction unit conversion qty. at schedule 予定時取引単位換算数量.<p>
	 *
	 */
	public void schd_trd_unit_conv_qty(float value) {
		setConstNumber(offset + 155, $schd_trd_unit_conv_qty, value);
	}

	/**
	 * Transaction unit conversion qty. at schedule 予定時取引単位換算数量.<p>
	 *
	 */
	public void schd_trd_unit_conv_qty(double value) {
		setConstNumber(offset + 155, $schd_trd_unit_conv_qty, value);
	}


	/**
	 * Simultaneous recording (Before change) 同時計上(変更前).<p>
	 *
	 */
	public boolean org_sync_flg() {
		return getConstBoolean(offset + 156, $org_sync_flg);
	}

	/**
	 * Simultaneous recording (Before change) 同時計上(変更前).<p>
	 *
	 */
	public void org_sync_flg(boolean value) {
		setConstBoolean(offset + 156, $org_sync_flg, value);
	}


	/**
	 * Initial purchase scheduled qty. (Base unit) 当初仕入予定数量（基準単位）.<p>
	 *
	 */
	public MCNumber purc_schd_init_qty() {
		return getConstNumber(offset + 157, $purc_schd_init_qty);
	}

	/**
	 * Initial purchase scheduled qty. (Base unit) 当初仕入予定数量（基準単位）.<p>
	 *
	 */
	public void purc_schd_init_qty(MCNumber value) {
		setConstNumber(offset + 157, $purc_schd_init_qty, value);
	}

	/**
	 * Initial purchase scheduled qty. (Base unit) 当初仕入予定数量（基準単位）.<p>
	 *
	 */
	public void purc_schd_init_qty(int value) {
		setConstNumber(offset + 157, $purc_schd_init_qty, value);
	}

	/**
	 * Initial purchase scheduled qty. (Base unit) 当初仕入予定数量（基準単位）.<p>
	 *
	 */
	public void purc_schd_init_qty(long value) {
		setConstNumber(offset + 157, $purc_schd_init_qty, value);
	}

	/**
	 * Initial purchase scheduled qty. (Base unit) 当初仕入予定数量（基準単位）.<p>
	 *
	 */
	public void purc_schd_init_qty(float value) {
		setConstNumber(offset + 157, $purc_schd_init_qty, value);
	}

	/**
	 * Initial purchase scheduled qty. (Base unit) 当初仕入予定数量（基準単位）.<p>
	 *
	 */
	public void purc_schd_init_qty(double value) {
		setConstNumber(offset + 157, $purc_schd_init_qty, value);
	}


	/**
	 * Initial purchase scheduled discount amount 当初仕入予定値引額.<p>
	 *
	 */
	public MCNumber purc_schd_init_dscnt_amt() {
		return getConstNumber(offset + 158, $purc_schd_init_dscnt_amt);
	}

	/**
	 * Initial purchase scheduled discount amount 当初仕入予定値引額.<p>
	 *
	 */
	public void purc_schd_init_dscnt_amt(MCNumber value) {
		setConstNumber(offset + 158, $purc_schd_init_dscnt_amt, value);
	}

	/**
	 * Initial purchase scheduled discount amount 当初仕入予定値引額.<p>
	 *
	 */
	public void purc_schd_init_dscnt_amt(int value) {
		setConstNumber(offset + 158, $purc_schd_init_dscnt_amt, value);
	}

	/**
	 * Initial purchase scheduled discount amount 当初仕入予定値引額.<p>
	 *
	 */
	public void purc_schd_init_dscnt_amt(long value) {
		setConstNumber(offset + 158, $purc_schd_init_dscnt_amt, value);
	}

	/**
	 * Initial purchase scheduled discount amount 当初仕入予定値引額.<p>
	 *
	 */
	public void purc_schd_init_dscnt_amt(float value) {
		setConstNumber(offset + 158, $purc_schd_init_dscnt_amt, value);
	}

	/**
	 * Initial purchase scheduled discount amount 当初仕入予定値引額.<p>
	 *
	 */
	public void purc_schd_init_dscnt_amt(double value) {
		setConstNumber(offset + 158, $purc_schd_init_dscnt_amt, value);
	}


	/**
	 * Initial purchase scheduled amount 当初仕入予定金額.<p>
	 *
	 */
	public MCNumber purc_schd_init_amt() {
		return getConstNumber(offset + 159, $purc_schd_init_amt);
	}

	/**
	 * Initial purchase scheduled amount 当初仕入予定金額.<p>
	 *
	 */
	public void purc_schd_init_amt(MCNumber value) {
		setConstNumber(offset + 159, $purc_schd_init_amt, value);
	}

	/**
	 * Initial purchase scheduled amount 当初仕入予定金額.<p>
	 *
	 */
	public void purc_schd_init_amt(int value) {
		setConstNumber(offset + 159, $purc_schd_init_amt, value);
	}

	/**
	 * Initial purchase scheduled amount 当初仕入予定金額.<p>
	 *
	 */
	public void purc_schd_init_amt(long value) {
		setConstNumber(offset + 159, $purc_schd_init_amt, value);
	}

	/**
	 * Initial purchase scheduled amount 当初仕入予定金額.<p>
	 *
	 */
	public void purc_schd_init_amt(float value) {
		setConstNumber(offset + 159, $purc_schd_init_amt, value);
	}

	/**
	 * Initial purchase scheduled amount 当初仕入予定金額.<p>
	 *
	 */
	public void purc_schd_init_amt(double value) {
		setConstNumber(offset + 159, $purc_schd_init_amt, value);
	}


	/**
	 * Rounding type (Sales amount) 売上金額端数処理区分.<p>
	 *
	 */
	public String purc_amt_rnd_typ() {
		return getConstString(offset + 160, $purc_amt_rnd_typ);
	}

	/**
	 * Rounding type (Sales amount) 売上金額端数処理区分.<p>
	 *
	 */
	public void purc_amt_rnd_typ(String value) {
		setConstString(offset + 160, $purc_amt_rnd_typ, value);
	}


	/**
	 * Rounding type (Sales unit price) 売上単価端数処理区分.<p>
	 *
	 */
	public String purc_upri_rnd_typ() {
		return getConstString(offset + 161, $purc_upri_rnd_typ);
	}

	/**
	 * Rounding type (Sales unit price) 売上単価端数処理区分.<p>
	 *
	 */
	public void purc_upri_rnd_typ(String value) {
		setConstString(offset + 161, $purc_upri_rnd_typ, value);
	}


	/**
	 * Sales tax rounding type 売上税端数処理区分.<p>
	 *
	 */
	public String purc_tax_rnd_typ() {
		return getConstString(offset + 162, $purc_tax_rnd_typ);
	}

	/**
	 * Sales tax rounding type 売上税端数処理区分.<p>
	 *
	 */
	public void purc_tax_rnd_typ(String value) {
		setConstString(offset + 162, $purc_tax_rnd_typ, value);
	}


	/**
	 * Purchase transaction amount number of decimal places 仕入取引金額小数部有効桁数.<p>
	 *
	 */
	public MCNumber purc_trd_cur_amt_dec_place() {
		return getConstNumber(offset + 163, $purc_trd_cur_amt_dec_place);
	}

	/**
	 * Purchase transaction amount number of decimal places 仕入取引金額小数部有効桁数.<p>
	 *
	 */
	public void purc_trd_cur_amt_dec_place(MCNumber value) {
		setConstNumber(offset + 163, $purc_trd_cur_amt_dec_place, value);
	}

	/**
	 * Purchase transaction amount number of decimal places 仕入取引金額小数部有効桁数.<p>
	 *
	 */
	public void purc_trd_cur_amt_dec_place(int value) {
		setConstNumber(offset + 163, $purc_trd_cur_amt_dec_place, value);
	}

	/**
	 * Purchase transaction amount number of decimal places 仕入取引金額小数部有効桁数.<p>
	 *
	 */
	public void purc_trd_cur_amt_dec_place(long value) {
		setConstNumber(offset + 163, $purc_trd_cur_amt_dec_place, value);
	}

	/**
	 * Purchase transaction amount number of decimal places 仕入取引金額小数部有効桁数.<p>
	 *
	 */
	public void purc_trd_cur_amt_dec_place(float value) {
		setConstNumber(offset + 163, $purc_trd_cur_amt_dec_place, value);
	}

	/**
	 * Purchase transaction amount number of decimal places 仕入取引金額小数部有効桁数.<p>
	 *
	 */
	public void purc_trd_cur_amt_dec_place(double value) {
		setConstNumber(offset + 163, $purc_trd_cur_amt_dec_place, value);
	}


	/**
	 * Purchase transaction unit price number of decimal places 仕入取引単価小数部有効桁数.<p>
	 *
	 */
	public MCNumber purc_trd_cur_upri_dec_place() {
		return getConstNumber(offset + 164, $purc_trd_cur_upri_dec_place);
	}

	/**
	 * Purchase transaction unit price number of decimal places 仕入取引単価小数部有効桁数.<p>
	 *
	 */
	public void purc_trd_cur_upri_dec_place(MCNumber value) {
		setConstNumber(offset + 164, $purc_trd_cur_upri_dec_place, value);
	}

	/**
	 * Purchase transaction unit price number of decimal places 仕入取引単価小数部有効桁数.<p>
	 *
	 */
	public void purc_trd_cur_upri_dec_place(int value) {
		setConstNumber(offset + 164, $purc_trd_cur_upri_dec_place, value);
	}

	/**
	 * Purchase transaction unit price number of decimal places 仕入取引単価小数部有効桁数.<p>
	 *
	 */
	public void purc_trd_cur_upri_dec_place(long value) {
		setConstNumber(offset + 164, $purc_trd_cur_upri_dec_place, value);
	}

	/**
	 * Purchase transaction unit price number of decimal places 仕入取引単価小数部有効桁数.<p>
	 *
	 */
	public void purc_trd_cur_upri_dec_place(float value) {
		setConstNumber(offset + 164, $purc_trd_cur_upri_dec_place, value);
	}

	/**
	 * Purchase transaction unit price number of decimal places 仕入取引単価小数部有効桁数.<p>
	 *
	 */
	public void purc_trd_cur_upri_dec_place(double value) {
		setConstNumber(offset + 164, $purc_trd_cur_upri_dec_place, value);
	}


	/**
	 * Purchase schedule transaction unit conversion base qty. 仕入予定取引単位分母数量.<p>
	 *
	 */
	public MCNumber purc_s_trd_unit_conv_base_qty() {
		return getConstNumber(offset + 165, $purc_s_trd_unit_conv_base_qty);
	}

	/**
	 * Purchase schedule transaction unit conversion base qty. 仕入予定取引単位分母数量.<p>
	 *
	 */
	public void purc_s_trd_unit_conv_base_qty(MCNumber value) {
		setConstNumber(offset + 165, $purc_s_trd_unit_conv_base_qty, value);
	}

	/**
	 * Purchase schedule transaction unit conversion base qty. 仕入予定取引単位分母数量.<p>
	 *
	 */
	public void purc_s_trd_unit_conv_base_qty(int value) {
		setConstNumber(offset + 165, $purc_s_trd_unit_conv_base_qty, value);
	}

	/**
	 * Purchase schedule transaction unit conversion base qty. 仕入予定取引単位分母数量.<p>
	 *
	 */
	public void purc_s_trd_unit_conv_base_qty(long value) {
		setConstNumber(offset + 165, $purc_s_trd_unit_conv_base_qty, value);
	}

	/**
	 * Purchase schedule transaction unit conversion base qty. 仕入予定取引単位分母数量.<p>
	 *
	 */
	public void purc_s_trd_unit_conv_base_qty(float value) {
		setConstNumber(offset + 165, $purc_s_trd_unit_conv_base_qty, value);
	}

	/**
	 * Purchase schedule transaction unit conversion base qty. 仕入予定取引単位分母数量.<p>
	 *
	 */
	public void purc_s_trd_unit_conv_base_qty(double value) {
		setConstNumber(offset + 165, $purc_s_trd_unit_conv_base_qty, value);
	}


	/**
	 * Purchase schedule transaction unit conversion qty. 仕入予定取引単位換算数量.<p>
	 *
	 */
	public MCNumber purc_s_trd_unit_conv_qty() {
		return getConstNumber(offset + 166, $purc_s_trd_unit_conv_qty);
	}

	/**
	 * Purchase schedule transaction unit conversion qty. 仕入予定取引単位換算数量.<p>
	 *
	 */
	public void purc_s_trd_unit_conv_qty(MCNumber value) {
		setConstNumber(offset + 166, $purc_s_trd_unit_conv_qty, value);
	}

	/**
	 * Purchase schedule transaction unit conversion qty. 仕入予定取引単位換算数量.<p>
	 *
	 */
	public void purc_s_trd_unit_conv_qty(int value) {
		setConstNumber(offset + 166, $purc_s_trd_unit_conv_qty, value);
	}

	/**
	 * Purchase schedule transaction unit conversion qty. 仕入予定取引単位換算数量.<p>
	 *
	 */
	public void purc_s_trd_unit_conv_qty(long value) {
		setConstNumber(offset + 166, $purc_s_trd_unit_conv_qty, value);
	}

	/**
	 * Purchase schedule transaction unit conversion qty. 仕入予定取引単位換算数量.<p>
	 *
	 */
	public void purc_s_trd_unit_conv_qty(float value) {
		setConstNumber(offset + 166, $purc_s_trd_unit_conv_qty, value);
	}

	/**
	 * Purchase schedule transaction unit conversion qty. 仕入予定取引単位換算数量.<p>
	 *
	 */
	public void purc_s_trd_unit_conv_qty(double value) {
		setConstNumber(offset + 166, $purc_s_trd_unit_conv_qty, value);
	}


	/**
	 * Purchase transaction unit cd. 仕入取引単位ＣＤ.<p>
	 *
	 */
	public String purc_trd_unit_cd() {
		return getConstString(offset + 167, $purc_trd_unit_cd);
	}

	/**
	 * Purchase transaction unit cd. 仕入取引単位ＣＤ.<p>
	 *
	 */
	public void purc_trd_unit_cd(String value) {
		setConstString(offset + 167, $purc_trd_unit_cd, value);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR purc_trd_unit_qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 168, $purc_trd_unit_qty_p);
	}
	
	public void purc_trd_unit_qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 168, $purc_trd_unit_qty_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR purc_base_unit_qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 169, $purc_base_unit_qty_p);
	}
	
	public void purc_base_unit_qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 169, $purc_base_unit_qty_p, row);
	}


	/**
	 * Purchase transaction unit conversion base qty. 仕入取引単位分母数量.<p>
	 *
	 */
	public MCNumber purc_trd_unit_conv_base_qty() {
		return getConstNumber(offset + 170, $purc_trd_unit_conv_base_qty);
	}

	/**
	 * Purchase transaction unit conversion base qty. 仕入取引単位分母数量.<p>
	 *
	 */
	public void purc_trd_unit_conv_base_qty(MCNumber value) {
		setConstNumber(offset + 170, $purc_trd_unit_conv_base_qty, value);
	}

	/**
	 * Purchase transaction unit conversion base qty. 仕入取引単位分母数量.<p>
	 *
	 */
	public void purc_trd_unit_conv_base_qty(int value) {
		setConstNumber(offset + 170, $purc_trd_unit_conv_base_qty, value);
	}

	/**
	 * Purchase transaction unit conversion base qty. 仕入取引単位分母数量.<p>
	 *
	 */
	public void purc_trd_unit_conv_base_qty(long value) {
		setConstNumber(offset + 170, $purc_trd_unit_conv_base_qty, value);
	}

	/**
	 * Purchase transaction unit conversion base qty. 仕入取引単位分母数量.<p>
	 *
	 */
	public void purc_trd_unit_conv_base_qty(float value) {
		setConstNumber(offset + 170, $purc_trd_unit_conv_base_qty, value);
	}

	/**
	 * Purchase transaction unit conversion base qty. 仕入取引単位分母数量.<p>
	 *
	 */
	public void purc_trd_unit_conv_base_qty(double value) {
		setConstNumber(offset + 170, $purc_trd_unit_conv_base_qty, value);
	}


	/**
	 * Purchase transaction unit conversion qty. 仕入取引単位換算数量.<p>
	 *
	 */
	public MCNumber purc_trd_unit_conv_qty() {
		return getConstNumber(offset + 171, $purc_trd_unit_conv_qty);
	}

	/**
	 * Purchase transaction unit conversion qty. 仕入取引単位換算数量.<p>
	 *
	 */
	public void purc_trd_unit_conv_qty(MCNumber value) {
		setConstNumber(offset + 171, $purc_trd_unit_conv_qty, value);
	}

	/**
	 * Purchase transaction unit conversion qty. 仕入取引単位換算数量.<p>
	 *
	 */
	public void purc_trd_unit_conv_qty(int value) {
		setConstNumber(offset + 171, $purc_trd_unit_conv_qty, value);
	}

	/**
	 * Purchase transaction unit conversion qty. 仕入取引単位換算数量.<p>
	 *
	 */
	public void purc_trd_unit_conv_qty(long value) {
		setConstNumber(offset + 171, $purc_trd_unit_conv_qty, value);
	}

	/**
	 * Purchase transaction unit conversion qty. 仕入取引単位換算数量.<p>
	 *
	 */
	public void purc_trd_unit_conv_qty(float value) {
		setConstNumber(offset + 171, $purc_trd_unit_conv_qty, value);
	}

	/**
	 * Purchase transaction unit conversion qty. 仕入取引単位換算数量.<p>
	 *
	 */
	public void purc_trd_unit_conv_qty(double value) {
		setConstNumber(offset + 171, $purc_trd_unit_conv_qty, value);
	}


	/**
	 * Purchase transaction unit number of decimal places 仕入取引単位小数部有効桁数.<p>
	 *
	 */
	public MCNumber purc_trd_unit_dec_place() {
		return getConstNumber(offset + 172, $purc_trd_unit_dec_place);
	}

	/**
	 * Purchase transaction unit number of decimal places 仕入取引単位小数部有効桁数.<p>
	 *
	 */
	public void purc_trd_unit_dec_place(MCNumber value) {
		setConstNumber(offset + 172, $purc_trd_unit_dec_place, value);
	}

	/**
	 * Purchase transaction unit number of decimal places 仕入取引単位小数部有効桁数.<p>
	 *
	 */
	public void purc_trd_unit_dec_place(int value) {
		setConstNumber(offset + 172, $purc_trd_unit_dec_place, value);
	}

	/**
	 * Purchase transaction unit number of decimal places 仕入取引単位小数部有効桁数.<p>
	 *
	 */
	public void purc_trd_unit_dec_place(long value) {
		setConstNumber(offset + 172, $purc_trd_unit_dec_place, value);
	}

	/**
	 * Purchase transaction unit number of decimal places 仕入取引単位小数部有効桁数.<p>
	 *
	 */
	public void purc_trd_unit_dec_place(float value) {
		setConstNumber(offset + 172, $purc_trd_unit_dec_place, value);
	}

	/**
	 * Purchase transaction unit number of decimal places 仕入取引単位小数部有効桁数.<p>
	 *
	 */
	public void purc_trd_unit_dec_place(double value) {
		setConstNumber(offset + 172, $purc_trd_unit_dec_place, value);
	}


	/**
	 * Purchase date (For exchange rate component) 仕入日（為替レート部品用）.<p>
	 *
	 */
	public MCDate xrate_purc_dt() {
		return getConstDate(offset + 173, $xrate_purc_dt);
	}

	/**
	 * Purchase date (For exchange rate component) 仕入日（為替レート部品用）.<p>
	 *
	 */
	public void xrate_purc_dt(MCDate value) {
		setConstDate(offset + 173, $xrate_purc_dt, value);
	}


	/**
	 * Initial tax amount (Transaction currency) 当初取引通貨税額.<p>
	 *
	 */
	public MCNumber init_trd_cur_tax_amt() {
		return getConstNumber(offset + 174, $init_trd_cur_tax_amt);
	}

	/**
	 * Initial tax amount (Transaction currency) 当初取引通貨税額.<p>
	 *
	 */
	public void init_trd_cur_tax_amt(MCNumber value) {
		setConstNumber(offset + 174, $init_trd_cur_tax_amt, value);
	}

	/**
	 * Initial tax amount (Transaction currency) 当初取引通貨税額.<p>
	 *
	 */
	public void init_trd_cur_tax_amt(int value) {
		setConstNumber(offset + 174, $init_trd_cur_tax_amt, value);
	}

	/**
	 * Initial tax amount (Transaction currency) 当初取引通貨税額.<p>
	 *
	 */
	public void init_trd_cur_tax_amt(long value) {
		setConstNumber(offset + 174, $init_trd_cur_tax_amt, value);
	}

	/**
	 * Initial tax amount (Transaction currency) 当初取引通貨税額.<p>
	 *
	 */
	public void init_trd_cur_tax_amt(float value) {
		setConstNumber(offset + 174, $init_trd_cur_tax_amt, value);
	}

	/**
	 * Initial tax amount (Transaction currency) 当初取引通貨税額.<p>
	 *
	 */
	public void init_trd_cur_tax_amt(double value) {
		setConstNumber(offset + 174, $init_trd_cur_tax_amt, value);
	}


	/**
	 * Initial transaction unit cd. 当初取引単位ＣＤ.<p>
	 *
	 */
	public String init_trd_unit_cd() {
		return getConstString(offset + 175, $init_trd_unit_cd);
	}

	/**
	 * Initial transaction unit cd. 当初取引単位ＣＤ.<p>
	 *
	 */
	public void init_trd_unit_cd(String value) {
		setConstString(offset + 175, $init_trd_unit_cd, value);
	}


	/**
	 * Initial transaction unit qty. 当初取引単位数量.<p>
	 *
	 */
	public MCNumber init_trd_unit_qty() {
		return getConstNumber(offset + 176, $init_trd_unit_qty);
	}

	/**
	 * Initial transaction unit qty. 当初取引単位数量.<p>
	 *
	 */
	public void init_trd_unit_qty(MCNumber value) {
		setConstNumber(offset + 176, $init_trd_unit_qty, value);
	}

	/**
	 * Initial transaction unit qty. 当初取引単位数量.<p>
	 *
	 */
	public void init_trd_unit_qty(int value) {
		setConstNumber(offset + 176, $init_trd_unit_qty, value);
	}

	/**
	 * Initial transaction unit qty. 当初取引単位数量.<p>
	 *
	 */
	public void init_trd_unit_qty(long value) {
		setConstNumber(offset + 176, $init_trd_unit_qty, value);
	}

	/**
	 * Initial transaction unit qty. 当初取引単位数量.<p>
	 *
	 */
	public void init_trd_unit_qty(float value) {
		setConstNumber(offset + 176, $init_trd_unit_qty, value);
	}

	/**
	 * Initial transaction unit qty. 当初取引単位数量.<p>
	 *
	 */
	public void init_trd_unit_qty(double value) {
		setConstNumber(offset + 176, $init_trd_unit_qty, value);
	}


	/**
	 * Initial unit price (Transaction currency) 当初取引通貨単価.<p>
	 *
	 */
	public MCNumber init_trd_cur_upri() {
		return getConstNumber(offset + 177, $init_trd_cur_upri);
	}

	/**
	 * Initial unit price (Transaction currency) 当初取引通貨単価.<p>
	 *
	 */
	public void init_trd_cur_upri(MCNumber value) {
		setConstNumber(offset + 177, $init_trd_cur_upri, value);
	}

	/**
	 * Initial unit price (Transaction currency) 当初取引通貨単価.<p>
	 *
	 */
	public void init_trd_cur_upri(int value) {
		setConstNumber(offset + 177, $init_trd_cur_upri, value);
	}

	/**
	 * Initial unit price (Transaction currency) 当初取引通貨単価.<p>
	 *
	 */
	public void init_trd_cur_upri(long value) {
		setConstNumber(offset + 177, $init_trd_cur_upri, value);
	}

	/**
	 * Initial unit price (Transaction currency) 当初取引通貨単価.<p>
	 *
	 */
	public void init_trd_cur_upri(float value) {
		setConstNumber(offset + 177, $init_trd_cur_upri, value);
	}

	/**
	 * Initial unit price (Transaction currency) 当初取引通貨単価.<p>
	 *
	 */
	public void init_trd_cur_upri(double value) {
		setConstNumber(offset + 177, $init_trd_cur_upri, value);
	}


	/**
	 * Initial tax inclusive 当初内税.<p>
	 *
	 */
	public boolean init_inc_tax_flg() {
		return getConstBoolean(offset + 178, $init_inc_tax_flg);
	}

	/**
	 * Initial tax inclusive 当初内税.<p>
	 *
	 */
	public void init_inc_tax_flg(boolean value) {
		setConstBoolean(offset + 178, $init_inc_tax_flg, value);
	}


	/**
	 * Initial tax rate 当初税率.<p>
	 *
	 */
	public MCNumber init_tax_rate() {
		return getConstNumber(offset + 179, $init_tax_rate);
	}

	/**
	 * Initial tax rate 当初税率.<p>
	 *
	 */
	public void init_tax_rate(MCNumber value) {
		setConstNumber(offset + 179, $init_tax_rate, value);
	}

	/**
	 * Initial tax rate 当初税率.<p>
	 *
	 */
	public void init_tax_rate(int value) {
		setConstNumber(offset + 179, $init_tax_rate, value);
	}

	/**
	 * Initial tax rate 当初税率.<p>
	 *
	 */
	public void init_tax_rate(long value) {
		setConstNumber(offset + 179, $init_tax_rate, value);
	}

	/**
	 * Initial tax rate 当初税率.<p>
	 *
	 */
	public void init_tax_rate(float value) {
		setConstNumber(offset + 179, $init_tax_rate, value);
	}

	/**
	 * Initial tax rate 当初税率.<p>
	 *
	 */
	public void init_tax_rate(double value) {
		setConstNumber(offset + 179, $init_tax_rate, value);
	}


	/**
	 * Initial discount amount (Transaction currency) 当初取引通貨値引額.<p>
	 *
	 */
	public MCNumber init_trd_cur_dscnt_amt() {
		return getConstNumber(offset + 180, $init_trd_cur_dscnt_amt);
	}

	/**
	 * Initial discount amount (Transaction currency) 当初取引通貨値引額.<p>
	 *
	 */
	public void init_trd_cur_dscnt_amt(MCNumber value) {
		setConstNumber(offset + 180, $init_trd_cur_dscnt_amt, value);
	}

	/**
	 * Initial discount amount (Transaction currency) 当初取引通貨値引額.<p>
	 *
	 */
	public void init_trd_cur_dscnt_amt(int value) {
		setConstNumber(offset + 180, $init_trd_cur_dscnt_amt, value);
	}

	/**
	 * Initial discount amount (Transaction currency) 当初取引通貨値引額.<p>
	 *
	 */
	public void init_trd_cur_dscnt_amt(long value) {
		setConstNumber(offset + 180, $init_trd_cur_dscnt_amt, value);
	}

	/**
	 * Initial discount amount (Transaction currency) 当初取引通貨値引額.<p>
	 *
	 */
	public void init_trd_cur_dscnt_amt(float value) {
		setConstNumber(offset + 180, $init_trd_cur_dscnt_amt, value);
	}

	/**
	 * Initial discount amount (Transaction currency) 当初取引通貨値引額.<p>
	 *
	 */
	public void init_trd_cur_dscnt_amt(double value) {
		setConstNumber(offset + 180, $init_trd_cur_dscnt_amt, value);
	}


	/**
	 * Transaction unit cd. before change 変更前取引単位ＣＤ.<p>
	 *
	 */
	public String db_trd_unit_cd() {
		return getConstString(offset + 181, $db_trd_unit_cd);
	}

	/**
	 * Transaction unit cd. before change 変更前取引単位ＣＤ.<p>
	 *
	 */
	public void db_trd_unit_cd(String value) {
		setConstString(offset + 181, $db_trd_unit_cd, value);
	}


	/**
	 * Transaction unit conversion qty. before change 変更前取引単位換算数量.<p>
	 *
	 */
	public MCNumber db_trd_unit_conv_qty() {
		return getConstNumber(offset + 182, $db_trd_unit_conv_qty);
	}

	/**
	 * Transaction unit conversion qty. before change 変更前取引単位換算数量.<p>
	 *
	 */
	public void db_trd_unit_conv_qty(MCNumber value) {
		setConstNumber(offset + 182, $db_trd_unit_conv_qty, value);
	}

	/**
	 * Transaction unit conversion qty. before change 変更前取引単位換算数量.<p>
	 *
	 */
	public void db_trd_unit_conv_qty(int value) {
		setConstNumber(offset + 182, $db_trd_unit_conv_qty, value);
	}

	/**
	 * Transaction unit conversion qty. before change 変更前取引単位換算数量.<p>
	 *
	 */
	public void db_trd_unit_conv_qty(long value) {
		setConstNumber(offset + 182, $db_trd_unit_conv_qty, value);
	}

	/**
	 * Transaction unit conversion qty. before change 変更前取引単位換算数量.<p>
	 *
	 */
	public void db_trd_unit_conv_qty(float value) {
		setConstNumber(offset + 182, $db_trd_unit_conv_qty, value);
	}

	/**
	 * Transaction unit conversion qty. before change 変更前取引単位換算数量.<p>
	 *
	 */
	public void db_trd_unit_conv_qty(double value) {
		setConstNumber(offset + 182, $db_trd_unit_conv_qty, value);
	}


	/**
	 * Conversion base qty. in transaction unit before change 変更前取引単位換算基準数量.<p>
	 *
	 */
	public MCNumber db_trd_unit_conv_base_qty() {
		return getConstNumber(offset + 183, $db_trd_unit_conv_base_qty);
	}

	/**
	 * Conversion base qty. in transaction unit before change 変更前取引単位換算基準数量.<p>
	 *
	 */
	public void db_trd_unit_conv_base_qty(MCNumber value) {
		setConstNumber(offset + 183, $db_trd_unit_conv_base_qty, value);
	}

	/**
	 * Conversion base qty. in transaction unit before change 変更前取引単位換算基準数量.<p>
	 *
	 */
	public void db_trd_unit_conv_base_qty(int value) {
		setConstNumber(offset + 183, $db_trd_unit_conv_base_qty, value);
	}

	/**
	 * Conversion base qty. in transaction unit before change 変更前取引単位換算基準数量.<p>
	 *
	 */
	public void db_trd_unit_conv_base_qty(long value) {
		setConstNumber(offset + 183, $db_trd_unit_conv_base_qty, value);
	}

	/**
	 * Conversion base qty. in transaction unit before change 変更前取引単位換算基準数量.<p>
	 *
	 */
	public void db_trd_unit_conv_base_qty(float value) {
		setConstNumber(offset + 183, $db_trd_unit_conv_base_qty, value);
	}

	/**
	 * Conversion base qty. in transaction unit before change 変更前取引単位換算基準数量.<p>
	 *
	 */
	public void db_trd_unit_conv_base_qty(double value) {
		setConstNumber(offset + 183, $db_trd_unit_conv_base_qty, value);
	}


	/**
	 * Transaction unit number of decimal places before change 変更前取引単位小数部有効桁数.<p>
	 *
	 */
	public MCNumber db_trd_unit_dec_place() {
		return getConstNumber(offset + 184, $db_trd_unit_dec_place);
	}

	/**
	 * Transaction unit number of decimal places before change 変更前取引単位小数部有効桁数.<p>
	 *
	 */
	public void db_trd_unit_dec_place(MCNumber value) {
		setConstNumber(offset + 184, $db_trd_unit_dec_place, value);
	}

	/**
	 * Transaction unit number of decimal places before change 変更前取引単位小数部有効桁数.<p>
	 *
	 */
	public void db_trd_unit_dec_place(int value) {
		setConstNumber(offset + 184, $db_trd_unit_dec_place, value);
	}

	/**
	 * Transaction unit number of decimal places before change 変更前取引単位小数部有効桁数.<p>
	 *
	 */
	public void db_trd_unit_dec_place(long value) {
		setConstNumber(offset + 184, $db_trd_unit_dec_place, value);
	}

	/**
	 * Transaction unit number of decimal places before change 変更前取引単位小数部有効桁数.<p>
	 *
	 */
	public void db_trd_unit_dec_place(float value) {
		setConstNumber(offset + 184, $db_trd_unit_dec_place, value);
	}

	/**
	 * Transaction unit number of decimal places before change 変更前取引単位小数部有効桁数.<p>
	 *
	 */
	public void db_trd_unit_dec_place(double value) {
		setConstNumber(offset + 184, $db_trd_unit_dec_place, value);
	}


	/**
	 * Transaction unit rounding type before change 変更前取引単位端数処理区分.<p>
	 *
	 */
	public String db_trd_unit_rnd_typ() {
		return getConstString(offset + 185, $db_trd_unit_rnd_typ);
	}

	/**
	 * Transaction unit rounding type before change 変更前取引単位端数処理区分.<p>
	 *
	 */
	public void db_trd_unit_rnd_typ(String value) {
		setConstString(offset + 185, $db_trd_unit_rnd_typ, value);
	}


	/**
	 * Transaction unit qty. before change 変更前取引単位数量.<p>
	 *
	 */
	public MCNumber db_trd_unit_qty() {
		return getConstNumber(offset + 186, $db_trd_unit_qty);
	}

	/**
	 * Transaction unit qty. before change 変更前取引単位数量.<p>
	 *
	 */
	public void db_trd_unit_qty(MCNumber value) {
		setConstNumber(offset + 186, $db_trd_unit_qty, value);
	}

	/**
	 * Transaction unit qty. before change 変更前取引単位数量.<p>
	 *
	 */
	public void db_trd_unit_qty(int value) {
		setConstNumber(offset + 186, $db_trd_unit_qty, value);
	}

	/**
	 * Transaction unit qty. before change 変更前取引単位数量.<p>
	 *
	 */
	public void db_trd_unit_qty(long value) {
		setConstNumber(offset + 186, $db_trd_unit_qty, value);
	}

	/**
	 * Transaction unit qty. before change 変更前取引単位数量.<p>
	 *
	 */
	public void db_trd_unit_qty(float value) {
		setConstNumber(offset + 186, $db_trd_unit_qty, value);
	}

	/**
	 * Transaction unit qty. before change 変更前取引単位数量.<p>
	 *
	 */
	public void db_trd_unit_qty(double value) {
		setConstNumber(offset + 186, $db_trd_unit_qty, value);
	}


	/**
	 * Amount (Transaction currency) before change 変更前取引通貨金額.<p>
	 *
	 */
	public MCNumber db_trd_cur_amt() {
		return getConstNumber(offset + 187, $db_trd_cur_amt);
	}

	/**
	 * Amount (Transaction currency) before change 変更前取引通貨金額.<p>
	 *
	 */
	public void db_trd_cur_amt(MCNumber value) {
		setConstNumber(offset + 187, $db_trd_cur_amt, value);
	}

	/**
	 * Amount (Transaction currency) before change 変更前取引通貨金額.<p>
	 *
	 */
	public void db_trd_cur_amt(int value) {
		setConstNumber(offset + 187, $db_trd_cur_amt, value);
	}

	/**
	 * Amount (Transaction currency) before change 変更前取引通貨金額.<p>
	 *
	 */
	public void db_trd_cur_amt(long value) {
		setConstNumber(offset + 187, $db_trd_cur_amt, value);
	}

	/**
	 * Amount (Transaction currency) before change 変更前取引通貨金額.<p>
	 *
	 */
	public void db_trd_cur_amt(float value) {
		setConstNumber(offset + 187, $db_trd_cur_amt, value);
	}

	/**
	 * Amount (Transaction currency) before change 変更前取引通貨金額.<p>
	 *
	 */
	public void db_trd_cur_amt(double value) {
		setConstNumber(offset + 187, $db_trd_cur_amt, value);
	}


	/**
	 * (Before change) Discount amount (Transaction currency) 変更前取引通貨値引額.<p>
	 *
	 */
	public MCNumber db_trd_cur_dscnt_amt() {
		return getConstNumber(offset + 188, $db_trd_cur_dscnt_amt);
	}

	/**
	 * (Before change) Discount amount (Transaction currency) 変更前取引通貨値引額.<p>
	 *
	 */
	public void db_trd_cur_dscnt_amt(MCNumber value) {
		setConstNumber(offset + 188, $db_trd_cur_dscnt_amt, value);
	}

	/**
	 * (Before change) Discount amount (Transaction currency) 変更前取引通貨値引額.<p>
	 *
	 */
	public void db_trd_cur_dscnt_amt(int value) {
		setConstNumber(offset + 188, $db_trd_cur_dscnt_amt, value);
	}

	/**
	 * (Before change) Discount amount (Transaction currency) 変更前取引通貨値引額.<p>
	 *
	 */
	public void db_trd_cur_dscnt_amt(long value) {
		setConstNumber(offset + 188, $db_trd_cur_dscnt_amt, value);
	}

	/**
	 * (Before change) Discount amount (Transaction currency) 変更前取引通貨値引額.<p>
	 *
	 */
	public void db_trd_cur_dscnt_amt(float value) {
		setConstNumber(offset + 188, $db_trd_cur_dscnt_amt, value);
	}

	/**
	 * (Before change) Discount amount (Transaction currency) 変更前取引通貨値引額.<p>
	 *
	 */
	public void db_trd_cur_dscnt_amt(double value) {
		setConstNumber(offset + 188, $db_trd_cur_dscnt_amt, value);
	}


	/**
	 * Amount (Transaction currency) before change 変更前取引通貨金額.<p>
	 *
	 */
	public MCNumber db_trd_cur_tax_amt() {
		return getConstNumber(offset + 189, $db_trd_cur_tax_amt);
	}

	/**
	 * Amount (Transaction currency) before change 変更前取引通貨金額.<p>
	 *
	 */
	public void db_trd_cur_tax_amt(MCNumber value) {
		setConstNumber(offset + 189, $db_trd_cur_tax_amt, value);
	}

	/**
	 * Amount (Transaction currency) before change 変更前取引通貨金額.<p>
	 *
	 */
	public void db_trd_cur_tax_amt(int value) {
		setConstNumber(offset + 189, $db_trd_cur_tax_amt, value);
	}

	/**
	 * Amount (Transaction currency) before change 変更前取引通貨金額.<p>
	 *
	 */
	public void db_trd_cur_tax_amt(long value) {
		setConstNumber(offset + 189, $db_trd_cur_tax_amt, value);
	}

	/**
	 * Amount (Transaction currency) before change 変更前取引通貨金額.<p>
	 *
	 */
	public void db_trd_cur_tax_amt(float value) {
		setConstNumber(offset + 189, $db_trd_cur_tax_amt, value);
	}

	/**
	 * Amount (Transaction currency) before change 変更前取引通貨金額.<p>
	 *
	 */
	public void db_trd_cur_tax_amt(double value) {
		setConstNumber(offset + 189, $db_trd_cur_tax_amt, value);
	}


	/**
	 * (Before change) Unit price (Transaction currency) 変更前取引通貨単価.<p>
	 *
	 */
	public MCNumber db_trd_cur_upri() {
		return getConstNumber(offset + 190, $db_trd_cur_upri);
	}

	/**
	 * (Before change) Unit price (Transaction currency) 変更前取引通貨単価.<p>
	 *
	 */
	public void db_trd_cur_upri(MCNumber value) {
		setConstNumber(offset + 190, $db_trd_cur_upri, value);
	}

	/**
	 * (Before change) Unit price (Transaction currency) 変更前取引通貨単価.<p>
	 *
	 */
	public void db_trd_cur_upri(int value) {
		setConstNumber(offset + 190, $db_trd_cur_upri, value);
	}

	/**
	 * (Before change) Unit price (Transaction currency) 変更前取引通貨単価.<p>
	 *
	 */
	public void db_trd_cur_upri(long value) {
		setConstNumber(offset + 190, $db_trd_cur_upri, value);
	}

	/**
	 * (Before change) Unit price (Transaction currency) 変更前取引通貨単価.<p>
	 *
	 */
	public void db_trd_cur_upri(float value) {
		setConstNumber(offset + 190, $db_trd_cur_upri, value);
	}

	/**
	 * (Before change) Unit price (Transaction currency) 変更前取引通貨単価.<p>
	 *
	 */
	public void db_trd_cur_upri(double value) {
		setConstNumber(offset + 190, $db_trd_cur_upri, value);
	}


	/**
	 * Withholding tax rate before change 変更前源泉税率.<p>
	 *
	 */
	public MCNumber db_wtax_rate() {
		return getConstNumber(offset + 191, $db_wtax_rate);
	}

	/**
	 * Withholding tax rate before change 変更前源泉税率.<p>
	 *
	 */
	public void db_wtax_rate(MCNumber value) {
		setConstNumber(offset + 191, $db_wtax_rate, value);
	}

	/**
	 * Withholding tax rate before change 変更前源泉税率.<p>
	 *
	 */
	public void db_wtax_rate(int value) {
		setConstNumber(offset + 191, $db_wtax_rate, value);
	}

	/**
	 * Withholding tax rate before change 変更前源泉税率.<p>
	 *
	 */
	public void db_wtax_rate(long value) {
		setConstNumber(offset + 191, $db_wtax_rate, value);
	}

	/**
	 * Withholding tax rate before change 変更前源泉税率.<p>
	 *
	 */
	public void db_wtax_rate(float value) {
		setConstNumber(offset + 191, $db_wtax_rate, value);
	}

	/**
	 * Withholding tax rate before change 変更前源泉税率.<p>
	 *
	 */
	public void db_wtax_rate(double value) {
		setConstNumber(offset + 191, $db_wtax_rate, value);
	}


	/**
	 * Tax rate before change 変更前税率.<p>
	 *
	 */
	public MCNumber db_tax_rate() {
		return getConstNumber(offset + 192, $db_tax_rate);
	}

	/**
	 * Tax rate before change 変更前税率.<p>
	 *
	 */
	public void db_tax_rate(MCNumber value) {
		setConstNumber(offset + 192, $db_tax_rate, value);
	}

	/**
	 * Tax rate before change 変更前税率.<p>
	 *
	 */
	public void db_tax_rate(int value) {
		setConstNumber(offset + 192, $db_tax_rate, value);
	}

	/**
	 * Tax rate before change 変更前税率.<p>
	 *
	 */
	public void db_tax_rate(long value) {
		setConstNumber(offset + 192, $db_tax_rate, value);
	}

	/**
	 * Tax rate before change 変更前税率.<p>
	 *
	 */
	public void db_tax_rate(float value) {
		setConstNumber(offset + 192, $db_tax_rate, value);
	}

	/**
	 * Tax rate before change 変更前税率.<p>
	 *
	 */
	public void db_tax_rate(double value) {
		setConstNumber(offset + 192, $db_tax_rate, value);
	}


	/**
	 * Tax inclusive flg. before change 変更前内税ＦＬＧ.<p>
	 *
	 */
	public boolean db_inc_tax_flg() {
		return getConstBoolean(offset + 193, $db_inc_tax_flg);
	}

	/**
	 * Tax inclusive flg. before change 変更前内税ＦＬＧ.<p>
	 *
	 */
	public void db_inc_tax_flg(boolean value) {
		setConstBoolean(offset + 193, $db_inc_tax_flg, value);
	}


	/**
	 * Initial purchase transaction currency tax amount 仕入当初取引通貨税額.<p>
	 *
	 */
	public MCNumber purc_init_trd_cur_tax_amt() {
		return getConstNumber(offset + 194, $purc_init_trd_cur_tax_amt);
	}

	/**
	 * Initial purchase transaction currency tax amount 仕入当初取引通貨税額.<p>
	 *
	 */
	public void purc_init_trd_cur_tax_amt(MCNumber value) {
		setConstNumber(offset + 194, $purc_init_trd_cur_tax_amt, value);
	}

	/**
	 * Initial purchase transaction currency tax amount 仕入当初取引通貨税額.<p>
	 *
	 */
	public void purc_init_trd_cur_tax_amt(int value) {
		setConstNumber(offset + 194, $purc_init_trd_cur_tax_amt, value);
	}

	/**
	 * Initial purchase transaction currency tax amount 仕入当初取引通貨税額.<p>
	 *
	 */
	public void purc_init_trd_cur_tax_amt(long value) {
		setConstNumber(offset + 194, $purc_init_trd_cur_tax_amt, value);
	}

	/**
	 * Initial purchase transaction currency tax amount 仕入当初取引通貨税額.<p>
	 *
	 */
	public void purc_init_trd_cur_tax_amt(float value) {
		setConstNumber(offset + 194, $purc_init_trd_cur_tax_amt, value);
	}

	/**
	 * Initial purchase transaction currency tax amount 仕入当初取引通貨税額.<p>
	 *
	 */
	public void purc_init_trd_cur_tax_amt(double value) {
		setConstNumber(offset + 194, $purc_init_trd_cur_tax_amt, value);
	}


	/**
	 * Initial purchase transaction unit cd. 仕入当初取引単位ＣＤ.<p>
	 *
	 */
	public String purc_init_trd_unit_cd() {
		return getConstString(offset + 195, $purc_init_trd_unit_cd);
	}

	/**
	 * Initial purchase transaction unit cd. 仕入当初取引単位ＣＤ.<p>
	 *
	 */
	public void purc_init_trd_unit_cd(String value) {
		setConstString(offset + 195, $purc_init_trd_unit_cd, value);
	}


	/**
	 * Initial purchase transaction unit qty. 仕入当初取引単位数量.<p>
	 *
	 */
	public MCNumber purc_init_trd_unit_qty() {
		return getConstNumber(offset + 196, $purc_init_trd_unit_qty);
	}

	/**
	 * Initial purchase transaction unit qty. 仕入当初取引単位数量.<p>
	 *
	 */
	public void purc_init_trd_unit_qty(MCNumber value) {
		setConstNumber(offset + 196, $purc_init_trd_unit_qty, value);
	}

	/**
	 * Initial purchase transaction unit qty. 仕入当初取引単位数量.<p>
	 *
	 */
	public void purc_init_trd_unit_qty(int value) {
		setConstNumber(offset + 196, $purc_init_trd_unit_qty, value);
	}

	/**
	 * Initial purchase transaction unit qty. 仕入当初取引単位数量.<p>
	 *
	 */
	public void purc_init_trd_unit_qty(long value) {
		setConstNumber(offset + 196, $purc_init_trd_unit_qty, value);
	}

	/**
	 * Initial purchase transaction unit qty. 仕入当初取引単位数量.<p>
	 *
	 */
	public void purc_init_trd_unit_qty(float value) {
		setConstNumber(offset + 196, $purc_init_trd_unit_qty, value);
	}

	/**
	 * Initial purchase transaction unit qty. 仕入当初取引単位数量.<p>
	 *
	 */
	public void purc_init_trd_unit_qty(double value) {
		setConstNumber(offset + 196, $purc_init_trd_unit_qty, value);
	}


	/**
	 * Initial purchase transaction currency unit price 仕入当初取引通貨単価.<p>
	 *
	 */
	public MCNumber purc_init_trd_cur_upri() {
		return getConstNumber(offset + 197, $purc_init_trd_cur_upri);
	}

	/**
	 * Initial purchase transaction currency unit price 仕入当初取引通貨単価.<p>
	 *
	 */
	public void purc_init_trd_cur_upri(MCNumber value) {
		setConstNumber(offset + 197, $purc_init_trd_cur_upri, value);
	}

	/**
	 * Initial purchase transaction currency unit price 仕入当初取引通貨単価.<p>
	 *
	 */
	public void purc_init_trd_cur_upri(int value) {
		setConstNumber(offset + 197, $purc_init_trd_cur_upri, value);
	}

	/**
	 * Initial purchase transaction currency unit price 仕入当初取引通貨単価.<p>
	 *
	 */
	public void purc_init_trd_cur_upri(long value) {
		setConstNumber(offset + 197, $purc_init_trd_cur_upri, value);
	}

	/**
	 * Initial purchase transaction currency unit price 仕入当初取引通貨単価.<p>
	 *
	 */
	public void purc_init_trd_cur_upri(float value) {
		setConstNumber(offset + 197, $purc_init_trd_cur_upri, value);
	}

	/**
	 * Initial purchase transaction currency unit price 仕入当初取引通貨単価.<p>
	 *
	 */
	public void purc_init_trd_cur_upri(double value) {
		setConstNumber(offset + 197, $purc_init_trd_cur_upri, value);
	}


	/**
	 * Initial purchase tax inclusive 仕入当初内税.<p>
	 *
	 */
	public boolean purc_init_inc_tax_flg() {
		return getConstBoolean(offset + 198, $purc_init_inc_tax_flg);
	}

	/**
	 * Initial purchase tax inclusive 仕入当初内税.<p>
	 *
	 */
	public void purc_init_inc_tax_flg(boolean value) {
		setConstBoolean(offset + 198, $purc_init_inc_tax_flg, value);
	}


	/**
	 * Initial purchase tax rate 仕入当初税率.<p>
	 *
	 */
	public MCNumber purc_init_tax_rate() {
		return getConstNumber(offset + 199, $purc_init_tax_rate);
	}

	/**
	 * Initial purchase tax rate 仕入当初税率.<p>
	 *
	 */
	public void purc_init_tax_rate(MCNumber value) {
		setConstNumber(offset + 199, $purc_init_tax_rate, value);
	}

	/**
	 * Initial purchase tax rate 仕入当初税率.<p>
	 *
	 */
	public void purc_init_tax_rate(int value) {
		setConstNumber(offset + 199, $purc_init_tax_rate, value);
	}

	/**
	 * Initial purchase tax rate 仕入当初税率.<p>
	 *
	 */
	public void purc_init_tax_rate(long value) {
		setConstNumber(offset + 199, $purc_init_tax_rate, value);
	}

	/**
	 * Initial purchase tax rate 仕入当初税率.<p>
	 *
	 */
	public void purc_init_tax_rate(float value) {
		setConstNumber(offset + 199, $purc_init_tax_rate, value);
	}

	/**
	 * Initial purchase tax rate 仕入当初税率.<p>
	 *
	 */
	public void purc_init_tax_rate(double value) {
		setConstNumber(offset + 199, $purc_init_tax_rate, value);
	}


	/**
	 * Initial purchase transaction currency discount amount 仕入当初取引通貨値引額.<p>
	 *
	 */
	public MCNumber purc_init_trd_cur_dscnt_amt() {
		return getConstNumber(offset + 200, $purc_init_trd_cur_dscnt_amt);
	}

	/**
	 * Initial purchase transaction currency discount amount 仕入当初取引通貨値引額.<p>
	 *
	 */
	public void purc_init_trd_cur_dscnt_amt(MCNumber value) {
		setConstNumber(offset + 200, $purc_init_trd_cur_dscnt_amt, value);
	}

	/**
	 * Initial purchase transaction currency discount amount 仕入当初取引通貨値引額.<p>
	 *
	 */
	public void purc_init_trd_cur_dscnt_amt(int value) {
		setConstNumber(offset + 200, $purc_init_trd_cur_dscnt_amt, value);
	}

	/**
	 * Initial purchase transaction currency discount amount 仕入当初取引通貨値引額.<p>
	 *
	 */
	public void purc_init_trd_cur_dscnt_amt(long value) {
		setConstNumber(offset + 200, $purc_init_trd_cur_dscnt_amt, value);
	}

	/**
	 * Initial purchase transaction currency discount amount 仕入当初取引通貨値引額.<p>
	 *
	 */
	public void purc_init_trd_cur_dscnt_amt(float value) {
		setConstNumber(offset + 200, $purc_init_trd_cur_dscnt_amt, value);
	}

	/**
	 * Initial purchase transaction currency discount amount 仕入当初取引通貨値引額.<p>
	 *
	 */
	public void purc_init_trd_cur_dscnt_amt(double value) {
		setConstNumber(offset + 200, $purc_init_trd_cur_dscnt_amt, value);
	}


	/**
	 * Transaction unit cd. before change in purchase 仕入変更前取引単位ＣＤ.<p>
	 *
	 */
	public String purc_db_trd_unit_cd() {
		return getConstString(offset + 201, $purc_db_trd_unit_cd);
	}

	/**
	 * Transaction unit cd. before change in purchase 仕入変更前取引単位ＣＤ.<p>
	 *
	 */
	public void purc_db_trd_unit_cd(String value) {
		setConstString(offset + 201, $purc_db_trd_unit_cd, value);
	}


	/**
	 * Transaction unit conversion qty. before change in purchase 仕入変更前取引単位換算数量.<p>
	 *
	 */
	public MCNumber purc_db_trd_unit_conv_qty() {
		return getConstNumber(offset + 202, $purc_db_trd_unit_conv_qty);
	}

	/**
	 * Transaction unit conversion qty. before change in purchase 仕入変更前取引単位換算数量.<p>
	 *
	 */
	public void purc_db_trd_unit_conv_qty(MCNumber value) {
		setConstNumber(offset + 202, $purc_db_trd_unit_conv_qty, value);
	}

	/**
	 * Transaction unit conversion qty. before change in purchase 仕入変更前取引単位換算数量.<p>
	 *
	 */
	public void purc_db_trd_unit_conv_qty(int value) {
		setConstNumber(offset + 202, $purc_db_trd_unit_conv_qty, value);
	}

	/**
	 * Transaction unit conversion qty. before change in purchase 仕入変更前取引単位換算数量.<p>
	 *
	 */
	public void purc_db_trd_unit_conv_qty(long value) {
		setConstNumber(offset + 202, $purc_db_trd_unit_conv_qty, value);
	}

	/**
	 * Transaction unit conversion qty. before change in purchase 仕入変更前取引単位換算数量.<p>
	 *
	 */
	public void purc_db_trd_unit_conv_qty(float value) {
		setConstNumber(offset + 202, $purc_db_trd_unit_conv_qty, value);
	}

	/**
	 * Transaction unit conversion qty. before change in purchase 仕入変更前取引単位換算数量.<p>
	 *
	 */
	public void purc_db_trd_unit_conv_qty(double value) {
		setConstNumber(offset + 202, $purc_db_trd_unit_conv_qty, value);
	}


	/**
	 * Conversion base qty. in transaction unit before change in purchase 仕入変更前取引単位換算基準数量.<p>
	 *
	 */
	public MCNumber purc_db_trd_unit_conv_base_qty() {
		return getConstNumber(offset + 203, $purc_db_trd_unit_conv_base_qty);
	}

	/**
	 * Conversion base qty. in transaction unit before change in purchase 仕入変更前取引単位換算基準数量.<p>
	 *
	 */
	public void purc_db_trd_unit_conv_base_qty(MCNumber value) {
		setConstNumber(offset + 203, $purc_db_trd_unit_conv_base_qty, value);
	}

	/**
	 * Conversion base qty. in transaction unit before change in purchase 仕入変更前取引単位換算基準数量.<p>
	 *
	 */
	public void purc_db_trd_unit_conv_base_qty(int value) {
		setConstNumber(offset + 203, $purc_db_trd_unit_conv_base_qty, value);
	}

	/**
	 * Conversion base qty. in transaction unit before change in purchase 仕入変更前取引単位換算基準数量.<p>
	 *
	 */
	public void purc_db_trd_unit_conv_base_qty(long value) {
		setConstNumber(offset + 203, $purc_db_trd_unit_conv_base_qty, value);
	}

	/**
	 * Conversion base qty. in transaction unit before change in purchase 仕入変更前取引単位換算基準数量.<p>
	 *
	 */
	public void purc_db_trd_unit_conv_base_qty(float value) {
		setConstNumber(offset + 203, $purc_db_trd_unit_conv_base_qty, value);
	}

	/**
	 * Conversion base qty. in transaction unit before change in purchase 仕入変更前取引単位換算基準数量.<p>
	 *
	 */
	public void purc_db_trd_unit_conv_base_qty(double value) {
		setConstNumber(offset + 203, $purc_db_trd_unit_conv_base_qty, value);
	}


	/**
	 * Transaction unit number of decimal places before change in purchase 仕入変更前取引単位小数部有効桁数.<p>
	 *
	 */
	public MCNumber purc_db_trd_unit_dec_place() {
		return getConstNumber(offset + 204, $purc_db_trd_unit_dec_place);
	}

	/**
	 * Transaction unit number of decimal places before change in purchase 仕入変更前取引単位小数部有効桁数.<p>
	 *
	 */
	public void purc_db_trd_unit_dec_place(MCNumber value) {
		setConstNumber(offset + 204, $purc_db_trd_unit_dec_place, value);
	}

	/**
	 * Transaction unit number of decimal places before change in purchase 仕入変更前取引単位小数部有効桁数.<p>
	 *
	 */
	public void purc_db_trd_unit_dec_place(int value) {
		setConstNumber(offset + 204, $purc_db_trd_unit_dec_place, value);
	}

	/**
	 * Transaction unit number of decimal places before change in purchase 仕入変更前取引単位小数部有効桁数.<p>
	 *
	 */
	public void purc_db_trd_unit_dec_place(long value) {
		setConstNumber(offset + 204, $purc_db_trd_unit_dec_place, value);
	}

	/**
	 * Transaction unit number of decimal places before change in purchase 仕入変更前取引単位小数部有効桁数.<p>
	 *
	 */
	public void purc_db_trd_unit_dec_place(float value) {
		setConstNumber(offset + 204, $purc_db_trd_unit_dec_place, value);
	}

	/**
	 * Transaction unit number of decimal places before change in purchase 仕入変更前取引単位小数部有効桁数.<p>
	 *
	 */
	public void purc_db_trd_unit_dec_place(double value) {
		setConstNumber(offset + 204, $purc_db_trd_unit_dec_place, value);
	}


	/**
	 * Transaction unit rounding type before change in purchase 仕入変更前取引単位端数処理区分.<p>
	 *
	 */
	public String purc_db_trd_unit_rnd_typ() {
		return getConstString(offset + 205, $purc_db_trd_unit_rnd_typ);
	}

	/**
	 * Transaction unit rounding type before change in purchase 仕入変更前取引単位端数処理区分.<p>
	 *
	 */
	public void purc_db_trd_unit_rnd_typ(String value) {
		setConstString(offset + 205, $purc_db_trd_unit_rnd_typ, value);
	}


	/**
	 * Transaction unit qty. before change in purchase 仕入変更前取引単位数量.<p>
	 *
	 */
	public MCNumber purc_db_trd_unit_qty() {
		return getConstNumber(offset + 206, $purc_db_trd_unit_qty);
	}

	/**
	 * Transaction unit qty. before change in purchase 仕入変更前取引単位数量.<p>
	 *
	 */
	public void purc_db_trd_unit_qty(MCNumber value) {
		setConstNumber(offset + 206, $purc_db_trd_unit_qty, value);
	}

	/**
	 * Transaction unit qty. before change in purchase 仕入変更前取引単位数量.<p>
	 *
	 */
	public void purc_db_trd_unit_qty(int value) {
		setConstNumber(offset + 206, $purc_db_trd_unit_qty, value);
	}

	/**
	 * Transaction unit qty. before change in purchase 仕入変更前取引単位数量.<p>
	 *
	 */
	public void purc_db_trd_unit_qty(long value) {
		setConstNumber(offset + 206, $purc_db_trd_unit_qty, value);
	}

	/**
	 * Transaction unit qty. before change in purchase 仕入変更前取引単位数量.<p>
	 *
	 */
	public void purc_db_trd_unit_qty(float value) {
		setConstNumber(offset + 206, $purc_db_trd_unit_qty, value);
	}

	/**
	 * Transaction unit qty. before change in purchase 仕入変更前取引単位数量.<p>
	 *
	 */
	public void purc_db_trd_unit_qty(double value) {
		setConstNumber(offset + 206, $purc_db_trd_unit_qty, value);
	}


	/**
	 * Amount (Transaction currency) before change in purchase 仕入変更前取引通貨金額.<p>
	 *
	 */
	public MCNumber purc_db_trd_cur_amt() {
		return getConstNumber(offset + 207, $purc_db_trd_cur_amt);
	}

	/**
	 * Amount (Transaction currency) before change in purchase 仕入変更前取引通貨金額.<p>
	 *
	 */
	public void purc_db_trd_cur_amt(MCNumber value) {
		setConstNumber(offset + 207, $purc_db_trd_cur_amt, value);
	}

	/**
	 * Amount (Transaction currency) before change in purchase 仕入変更前取引通貨金額.<p>
	 *
	 */
	public void purc_db_trd_cur_amt(int value) {
		setConstNumber(offset + 207, $purc_db_trd_cur_amt, value);
	}

	/**
	 * Amount (Transaction currency) before change in purchase 仕入変更前取引通貨金額.<p>
	 *
	 */
	public void purc_db_trd_cur_amt(long value) {
		setConstNumber(offset + 207, $purc_db_trd_cur_amt, value);
	}

	/**
	 * Amount (Transaction currency) before change in purchase 仕入変更前取引通貨金額.<p>
	 *
	 */
	public void purc_db_trd_cur_amt(float value) {
		setConstNumber(offset + 207, $purc_db_trd_cur_amt, value);
	}

	/**
	 * Amount (Transaction currency) before change in purchase 仕入変更前取引通貨金額.<p>
	 *
	 */
	public void purc_db_trd_cur_amt(double value) {
		setConstNumber(offset + 207, $purc_db_trd_cur_amt, value);
	}


	/**
	 * Discount amount (Transaction currency) before change in purchase 仕入変更前取引通貨値引額.<p>
	 *
	 */
	public MCNumber purc_db_trd_cur_dscnt_amt() {
		return getConstNumber(offset + 208, $purc_db_trd_cur_dscnt_amt);
	}

	/**
	 * Discount amount (Transaction currency) before change in purchase 仕入変更前取引通貨値引額.<p>
	 *
	 */
	public void purc_db_trd_cur_dscnt_amt(MCNumber value) {
		setConstNumber(offset + 208, $purc_db_trd_cur_dscnt_amt, value);
	}

	/**
	 * Discount amount (Transaction currency) before change in purchase 仕入変更前取引通貨値引額.<p>
	 *
	 */
	public void purc_db_trd_cur_dscnt_amt(int value) {
		setConstNumber(offset + 208, $purc_db_trd_cur_dscnt_amt, value);
	}

	/**
	 * Discount amount (Transaction currency) before change in purchase 仕入変更前取引通貨値引額.<p>
	 *
	 */
	public void purc_db_trd_cur_dscnt_amt(long value) {
		setConstNumber(offset + 208, $purc_db_trd_cur_dscnt_amt, value);
	}

	/**
	 * Discount amount (Transaction currency) before change in purchase 仕入変更前取引通貨値引額.<p>
	 *
	 */
	public void purc_db_trd_cur_dscnt_amt(float value) {
		setConstNumber(offset + 208, $purc_db_trd_cur_dscnt_amt, value);
	}

	/**
	 * Discount amount (Transaction currency) before change in purchase 仕入変更前取引通貨値引額.<p>
	 *
	 */
	public void purc_db_trd_cur_dscnt_amt(double value) {
		setConstNumber(offset + 208, $purc_db_trd_cur_dscnt_amt, value);
	}


	/**
	 * Amount (Transaction currency) before change in purchase 仕入変更前取引通貨金額.<p>
	 *
	 */
	public MCNumber purc_db_trd_cur_tax_amt() {
		return getConstNumber(offset + 209, $purc_db_trd_cur_tax_amt);
	}

	/**
	 * Amount (Transaction currency) before change in purchase 仕入変更前取引通貨金額.<p>
	 *
	 */
	public void purc_db_trd_cur_tax_amt(MCNumber value) {
		setConstNumber(offset + 209, $purc_db_trd_cur_tax_amt, value);
	}

	/**
	 * Amount (Transaction currency) before change in purchase 仕入変更前取引通貨金額.<p>
	 *
	 */
	public void purc_db_trd_cur_tax_amt(int value) {
		setConstNumber(offset + 209, $purc_db_trd_cur_tax_amt, value);
	}

	/**
	 * Amount (Transaction currency) before change in purchase 仕入変更前取引通貨金額.<p>
	 *
	 */
	public void purc_db_trd_cur_tax_amt(long value) {
		setConstNumber(offset + 209, $purc_db_trd_cur_tax_amt, value);
	}

	/**
	 * Amount (Transaction currency) before change in purchase 仕入変更前取引通貨金額.<p>
	 *
	 */
	public void purc_db_trd_cur_tax_amt(float value) {
		setConstNumber(offset + 209, $purc_db_trd_cur_tax_amt, value);
	}

	/**
	 * Amount (Transaction currency) before change in purchase 仕入変更前取引通貨金額.<p>
	 *
	 */
	public void purc_db_trd_cur_tax_amt(double value) {
		setConstNumber(offset + 209, $purc_db_trd_cur_tax_amt, value);
	}


	/**
	 * Unit price (Transaction currency) before change in purchase 仕入変更前取引通貨単価.<p>
	 *
	 */
	public MCNumber purc_db_trd_cur_upri() {
		return getConstNumber(offset + 210, $purc_db_trd_cur_upri);
	}

	/**
	 * Unit price (Transaction currency) before change in purchase 仕入変更前取引通貨単価.<p>
	 *
	 */
	public void purc_db_trd_cur_upri(MCNumber value) {
		setConstNumber(offset + 210, $purc_db_trd_cur_upri, value);
	}

	/**
	 * Unit price (Transaction currency) before change in purchase 仕入変更前取引通貨単価.<p>
	 *
	 */
	public void purc_db_trd_cur_upri(int value) {
		setConstNumber(offset + 210, $purc_db_trd_cur_upri, value);
	}

	/**
	 * Unit price (Transaction currency) before change in purchase 仕入変更前取引通貨単価.<p>
	 *
	 */
	public void purc_db_trd_cur_upri(long value) {
		setConstNumber(offset + 210, $purc_db_trd_cur_upri, value);
	}

	/**
	 * Unit price (Transaction currency) before change in purchase 仕入変更前取引通貨単価.<p>
	 *
	 */
	public void purc_db_trd_cur_upri(float value) {
		setConstNumber(offset + 210, $purc_db_trd_cur_upri, value);
	}

	/**
	 * Unit price (Transaction currency) before change in purchase 仕入変更前取引通貨単価.<p>
	 *
	 */
	public void purc_db_trd_cur_upri(double value) {
		setConstNumber(offset + 210, $purc_db_trd_cur_upri, value);
	}


	/**
	 * Tax rate before change in purchase 仕入変更前税率.<p>
	 *
	 */
	public MCNumber purc_db_tax_rate() {
		return getConstNumber(offset + 211, $purc_db_tax_rate);
	}

	/**
	 * Tax rate before change in purchase 仕入変更前税率.<p>
	 *
	 */
	public void purc_db_tax_rate(MCNumber value) {
		setConstNumber(offset + 211, $purc_db_tax_rate, value);
	}

	/**
	 * Tax rate before change in purchase 仕入変更前税率.<p>
	 *
	 */
	public void purc_db_tax_rate(int value) {
		setConstNumber(offset + 211, $purc_db_tax_rate, value);
	}

	/**
	 * Tax rate before change in purchase 仕入変更前税率.<p>
	 *
	 */
	public void purc_db_tax_rate(long value) {
		setConstNumber(offset + 211, $purc_db_tax_rate, value);
	}

	/**
	 * Tax rate before change in purchase 仕入変更前税率.<p>
	 *
	 */
	public void purc_db_tax_rate(float value) {
		setConstNumber(offset + 211, $purc_db_tax_rate, value);
	}

	/**
	 * Tax rate before change in purchase 仕入変更前税率.<p>
	 *
	 */
	public void purc_db_tax_rate(double value) {
		setConstNumber(offset + 211, $purc_db_tax_rate, value);
	}


	/**
	 * Tax inclusive flg. before change in purchase 仕入変更前内税ＦＬＧ.<p>
	 *
	 */
	public boolean purc_db_inc_tax_flg() {
		return getConstBoolean(offset + 212, $purc_db_inc_tax_flg);
	}

	/**
	 * Tax inclusive flg. before change in purchase 仕入変更前内税ＦＬＧ.<p>
	 *
	 */
	public void purc_db_inc_tax_flg(boolean value) {
		setConstBoolean(offset + 212, $purc_db_inc_tax_flg, value);
	}


	public MCNumber purc_schd_init_ex_amt() {
		return getConstNumber(offset + 213, $purc_schd_init_ex_amt);
	}

	public void purc_schd_init_ex_amt(MCNumber value) {
		setConstNumber(offset + 213, $purc_schd_init_ex_amt, value);
	}

	public void purc_schd_init_ex_amt(int value) {
		setConstNumber(offset + 213, $purc_schd_init_ex_amt, value);
	}

	public void purc_schd_init_ex_amt(long value) {
		setConstNumber(offset + 213, $purc_schd_init_ex_amt, value);
	}

	public void purc_schd_init_ex_amt(float value) {
		setConstNumber(offset + 213, $purc_schd_init_ex_amt, value);
	}

	public void purc_schd_init_ex_amt(double value) {
		setConstNumber(offset + 213, $purc_schd_init_ex_amt, value);
	}


	/**
	 * Before change base unit qty. 変更前基準単位数量.<p>
	 *
	 */
	public MCNumber base_unit_qty_bef() {
		return getConstNumber(offset + 214, $base_unit_qty_bef);
	}

	/**
	 * Before change base unit qty. 変更前基準単位数量.<p>
	 *
	 */
	public void base_unit_qty_bef(MCNumber value) {
		setConstNumber(offset + 214, $base_unit_qty_bef, value);
	}

	/**
	 * Before change base unit qty. 変更前基準単位数量.<p>
	 *
	 */
	public void base_unit_qty_bef(int value) {
		setConstNumber(offset + 214, $base_unit_qty_bef, value);
	}

	/**
	 * Before change base unit qty. 変更前基準単位数量.<p>
	 *
	 */
	public void base_unit_qty_bef(long value) {
		setConstNumber(offset + 214, $base_unit_qty_bef, value);
	}

	/**
	 * Before change base unit qty. 変更前基準単位数量.<p>
	 *
	 */
	public void base_unit_qty_bef(float value) {
		setConstNumber(offset + 214, $base_unit_qty_bef, value);
	}

	/**
	 * Before change base unit qty. 変更前基準単位数量.<p>
	 *
	 */
	public void base_unit_qty_bef(double value) {
		setConstNumber(offset + 214, $base_unit_qty_bef, value);
	}


	/**
	 * Purchase/Acceptance detective qty. 仕入・検収不良数量.<p>
	 *
	 */
	public MCNumber base_unit_purc_qty() {
		return getConstNumber(offset + 215, $base_unit_purc_qty);
	}

	/**
	 * Purchase/Acceptance detective qty. 仕入・検収不良数量.<p>
	 *
	 */
	public void base_unit_purc_qty(MCNumber value) {
		setConstNumber(offset + 215, $base_unit_purc_qty, value);
	}

	/**
	 * Purchase/Acceptance detective qty. 仕入・検収不良数量.<p>
	 *
	 */
	public void base_unit_purc_qty(int value) {
		setConstNumber(offset + 215, $base_unit_purc_qty, value);
	}

	/**
	 * Purchase/Acceptance detective qty. 仕入・検収不良数量.<p>
	 *
	 */
	public void base_unit_purc_qty(long value) {
		setConstNumber(offset + 215, $base_unit_purc_qty, value);
	}

	/**
	 * Purchase/Acceptance detective qty. 仕入・検収不良数量.<p>
	 *
	 */
	public void base_unit_purc_qty(float value) {
		setConstNumber(offset + 215, $base_unit_purc_qty, value);
	}

	/**
	 * Purchase/Acceptance detective qty. 仕入・検収不良数量.<p>
	 *
	 */
	public void base_unit_purc_qty(double value) {
		setConstNumber(offset + 215, $base_unit_purc_qty, value);
	}


	public String getString(String name) {
		if ($cst_itm_cd.equalsIgnoreCase(name)) {
			return cst_itm_cd();
		}
		if ($cst_itm_nm.equalsIgnoreCase(name)) {
			return cst_itm_nm();
		}
		if ($asset_mng_typ.equalsIgnoreCase(name)) {
			return asset_mng_typ();
		}
		if ($asset_mng_typ_nm.equalsIgnoreCase(name)) {
			return asset_mng_typ_nm();
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
		if ($gd_cd.equalsIgnoreCase(name)) {
			return gd_cd();
		}
		if ($gd_nm.equalsIgnoreCase(name)) {
			return gd_nm();
		}
		if ($cst_po_d_no.equalsIgnoreCase(name)) {
			return cst_po_d_no();
		}
		if ($sls_rsn_cd.equalsIgnoreCase(name)) {
			return sls_rsn_cd();
		}
		if ($sls_rsn_nm.equalsIgnoreCase(name)) {
			return sls_rsn_nm();
		}
		if ($bd_dpt_cd.equalsIgnoreCase(name)) {
			return bd_dpt_cd();
		}
		if ($bd_dpt_nm.equalsIgnoreCase(name)) {
			return bd_dpt_nm();
		}
		if ($ext_sys_cd.equalsIgnoreCase(name)) {
			return ext_sys_cd();
		}
		if ($ext_sys_nm.equalsIgnoreCase(name)) {
			return ext_sys_nm();
		}
		if ($ext_purc_act_d_no.equalsIgnoreCase(name)) {
			return ext_purc_act_d_no();
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
		if ($purc_act_no.equalsIgnoreCase(name)) {
			return purc_act_no();
		}
		if ($purc_act_d_no.equalsIgnoreCase(name)) {
			return purc_act_d_no();
		}
		if ($po_no.equalsIgnoreCase(name)) {
			return po_no();
		}
		if ($po_d_no.equalsIgnoreCase(name)) {
			return po_d_no();
		}
		if ($sppl_cd.equalsIgnoreCase(name)) {
			return sppl_cd();
		}
		if ($sppl_nm.equalsIgnoreCase(name)) {
			return sppl_nm();
		}
		if ($maker_cd.equalsIgnoreCase(name)) {
			return maker_cd();
		}
		if ($maker_nm.equalsIgnoreCase(name)) {
			return maker_nm();
		}
		if ($bp_dlv_slip_no.equalsIgnoreCase(name)) {
			return bp_dlv_slip_no();
		}
		if ($bp_dlv_slip_d_no.equalsIgnoreCase(name)) {
			return bp_dlv_slip_d_no();
		}
		if ($bp_lot_no.equalsIgnoreCase(name)) {
			return bp_lot_no();
		}
		if ($purc_trd_cur_cd.equalsIgnoreCase(name)) {
			return purc_trd_cur_cd();
		}
		if ($purc_trd_cur_nm.equalsIgnoreCase(name)) {
			return purc_trd_cur_nm();
		}
		if ($purc_rsn_cd.equalsIgnoreCase(name)) {
			return purc_rsn_cd();
		}
		if ($purc_rsn_nm.equalsIgnoreCase(name)) {
			return purc_rsn_nm();
		}
		if ($purc_bd_dpt_cd.equalsIgnoreCase(name)) {
			return purc_bd_dpt_cd();
		}
		if ($purc_bd_dpt_nm.equalsIgnoreCase(name)) {
			return purc_bd_dpt_nm();
		}
		if ($po_print_rmrks.equalsIgnoreCase(name)) {
			return po_print_rmrks();
		}
		if ($po_print_d_rmrks.equalsIgnoreCase(name)) {
			return po_print_d_rmrks();
		}
		if ($slo_d_no.equalsIgnoreCase(name)) {
			return slo_d_no();
		}
		if ($lot_mng_typ.equalsIgnoreCase(name)) {
			return lot_mng_typ();
		}
		if ($sublot_mng_typ.equalsIgnoreCase(name)) {
			return sublot_mng_typ();
		}
		if ($lot_no_typ.equalsIgnoreCase(name)) {
			return lot_no_typ();
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
		if ($stk_mng_typ.equalsIgnoreCase(name)) {
			return stk_mng_typ();
		}
		if ($base_unit_rnd_typ.equalsIgnoreCase(name)) {
			return base_unit_rnd_typ();
		}
		if ($cont_fctr_rnd_typ.equalsIgnoreCase(name)) {
			return cont_fctr_rnd_typ();
		}
		if ($trd_unit_rnd_typ.equalsIgnoreCase(name)) {
			return trd_unit_rnd_typ();
		}
		if ($sls_act_no.equalsIgnoreCase(name)) {
			return sls_act_no();
		}
		if ($sls_schd_no.equalsIgnoreCase(name)) {
			return sls_schd_no();
		}
		if ($purc_schd_no.equalsIgnoreCase(name)) {
			return purc_schd_no();
		}
		if ($arr_pr_no.equalsIgnoreCase(name)) {
			return arr_pr_no();
		}
		if ($ship_pr_no.equalsIgnoreCase(name)) {
			return ship_pr_no();
		}
		if ($purc_amt_rnd_typ.equalsIgnoreCase(name)) {
			return purc_amt_rnd_typ();
		}
		if ($purc_upri_rnd_typ.equalsIgnoreCase(name)) {
			return purc_upri_rnd_typ();
		}
		if ($purc_tax_rnd_typ.equalsIgnoreCase(name)) {
			return purc_tax_rnd_typ();
		}
		if ($purc_trd_unit_cd.equalsIgnoreCase(name)) {
			return purc_trd_unit_cd();
		}
		if ($init_trd_unit_cd.equalsIgnoreCase(name)) {
			return init_trd_unit_cd();
		}
		if ($db_trd_unit_cd.equalsIgnoreCase(name)) {
			return db_trd_unit_cd();
		}
		if ($db_trd_unit_rnd_typ.equalsIgnoreCase(name)) {
			return db_trd_unit_rnd_typ();
		}
		if ($purc_init_trd_unit_cd.equalsIgnoreCase(name)) {
			return purc_init_trd_unit_cd();
		}
		if ($purc_db_trd_unit_cd.equalsIgnoreCase(name)) {
			return purc_db_trd_unit_cd();
		}
		if ($purc_db_trd_unit_rnd_typ.equalsIgnoreCase(name)) {
			return purc_db_trd_unit_rnd_typ();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($prof_rate.equalsIgnoreCase(name)) {
			return prof_rate();
		}
		if ($bill_crryovr_times.equalsIgnoreCase(name)) {
			return bill_crryovr_times();
		}
		if ($wtax_rate.equalsIgnoreCase(name)) {
			return wtax_rate();
		}
		if ($purc_wtax_rate.equalsIgnoreCase(name)) {
			return purc_wtax_rate();
		}
		if ($purc_wtax_amt.equalsIgnoreCase(name)) {
			return purc_wtax_amt();
		}
		if ($base_unit_purc_schd_qty.equalsIgnoreCase(name)) {
			return base_unit_purc_schd_qty();
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			return disp_seq();
		}
		if ($itm_bill_crryovr_times.equalsIgnoreCase(name)) {
			return itm_bill_crryovr_times();
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			return base_unit_dec_place();
		}
		if ($cont_fctr_dec_place.equalsIgnoreCase(name)) {
			return cont_fctr_dec_place();
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
		if ($sls_act_seq.equalsIgnoreCase(name)) {
			return sls_act_seq();
		}
		if ($sls_act_d_seq.equalsIgnoreCase(name)) {
			return sls_act_d_seq();
		}
		if ($dtl_row_id.equalsIgnoreCase(name)) {
			return dtl_row_id();
		}
		if ($base_unit_upri.equalsIgnoreCase(name)) {
			return base_unit_upri();
		}
		if ($init_schd_qty.equalsIgnoreCase(name)) {
			return init_schd_qty();
		}
		if ($init_schd_dscnt_amt.equalsIgnoreCase(name)) {
			return init_schd_dscnt_amt();
		}
		if ($arr_pr_upd_cntr.equalsIgnoreCase(name)) {
			return arr_pr_upd_cntr();
		}
		if ($ship_pr_upd_cntr.equalsIgnoreCase(name)) {
			return ship_pr_upd_cntr();
		}
		if ($init_schd_amt.equalsIgnoreCase(name)) {
			return init_schd_amt();
		}
		if ($schd_trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			return schd_trd_unit_conv_base_qty();
		}
		if ($schd_trd_unit_conv_qty.equalsIgnoreCase(name)) {
			return schd_trd_unit_conv_qty();
		}
		if ($purc_schd_init_qty.equalsIgnoreCase(name)) {
			return purc_schd_init_qty();
		}
		if ($purc_schd_init_dscnt_amt.equalsIgnoreCase(name)) {
			return purc_schd_init_dscnt_amt();
		}
		if ($purc_schd_init_amt.equalsIgnoreCase(name)) {
			return purc_schd_init_amt();
		}
		if ($purc_trd_cur_amt_dec_place.equalsIgnoreCase(name)) {
			return purc_trd_cur_amt_dec_place();
		}
		if ($purc_trd_cur_upri_dec_place.equalsIgnoreCase(name)) {
			return purc_trd_cur_upri_dec_place();
		}
		if ($purc_s_trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			return purc_s_trd_unit_conv_base_qty();
		}
		if ($purc_s_trd_unit_conv_qty.equalsIgnoreCase(name)) {
			return purc_s_trd_unit_conv_qty();
		}
		if ($purc_trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			return purc_trd_unit_conv_base_qty();
		}
		if ($purc_trd_unit_conv_qty.equalsIgnoreCase(name)) {
			return purc_trd_unit_conv_qty();
		}
		if ($purc_trd_unit_dec_place.equalsIgnoreCase(name)) {
			return purc_trd_unit_dec_place();
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
		if ($db_trd_unit_conv_qty.equalsIgnoreCase(name)) {
			return db_trd_unit_conv_qty();
		}
		if ($db_trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			return db_trd_unit_conv_base_qty();
		}
		if ($db_trd_unit_dec_place.equalsIgnoreCase(name)) {
			return db_trd_unit_dec_place();
		}
		if ($db_trd_unit_qty.equalsIgnoreCase(name)) {
			return db_trd_unit_qty();
		}
		if ($db_trd_cur_amt.equalsIgnoreCase(name)) {
			return db_trd_cur_amt();
		}
		if ($db_trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			return db_trd_cur_dscnt_amt();
		}
		if ($db_trd_cur_tax_amt.equalsIgnoreCase(name)) {
			return db_trd_cur_tax_amt();
		}
		if ($db_trd_cur_upri.equalsIgnoreCase(name)) {
			return db_trd_cur_upri();
		}
		if ($db_wtax_rate.equalsIgnoreCase(name)) {
			return db_wtax_rate();
		}
		if ($db_tax_rate.equalsIgnoreCase(name)) {
			return db_tax_rate();
		}
		if ($purc_init_trd_cur_tax_amt.equalsIgnoreCase(name)) {
			return purc_init_trd_cur_tax_amt();
		}
		if ($purc_init_trd_unit_qty.equalsIgnoreCase(name)) {
			return purc_init_trd_unit_qty();
		}
		if ($purc_init_trd_cur_upri.equalsIgnoreCase(name)) {
			return purc_init_trd_cur_upri();
		}
		if ($purc_init_tax_rate.equalsIgnoreCase(name)) {
			return purc_init_tax_rate();
		}
		if ($purc_init_trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			return purc_init_trd_cur_dscnt_amt();
		}
		if ($purc_db_trd_unit_conv_qty.equalsIgnoreCase(name)) {
			return purc_db_trd_unit_conv_qty();
		}
		if ($purc_db_trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			return purc_db_trd_unit_conv_base_qty();
		}
		if ($purc_db_trd_unit_dec_place.equalsIgnoreCase(name)) {
			return purc_db_trd_unit_dec_place();
		}
		if ($purc_db_trd_unit_qty.equalsIgnoreCase(name)) {
			return purc_db_trd_unit_qty();
		}
		if ($purc_db_trd_cur_amt.equalsIgnoreCase(name)) {
			return purc_db_trd_cur_amt();
		}
		if ($purc_db_trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			return purc_db_trd_cur_dscnt_amt();
		}
		if ($purc_db_trd_cur_tax_amt.equalsIgnoreCase(name)) {
			return purc_db_trd_cur_tax_amt();
		}
		if ($purc_db_trd_cur_upri.equalsIgnoreCase(name)) {
			return purc_db_trd_cur_upri();
		}
		if ($purc_db_tax_rate.equalsIgnoreCase(name)) {
			return purc_db_tax_rate();
		}
		if ($purc_schd_init_ex_amt.equalsIgnoreCase(name)) {
			return purc_schd_init_ex_amt();
		}
		if ($base_unit_qty_bef.equalsIgnoreCase(name)) {
			return base_unit_qty_bef();
		}
		if ($base_unit_purc_qty.equalsIgnoreCase(name)) {
			return base_unit_purc_qty();
		}
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		if ($dlv_schd_dt.equalsIgnoreCase(name)) {
			return dlv_schd_dt();
		}
		if ($purc_ac_ym.equalsIgnoreCase(name)) {
			return purc_ac_ym();
		}
		if ($purc_ac_dt.equalsIgnoreCase(name)) {
			return purc_ac_dt();
		}
		if ($purc_dt.equalsIgnoreCase(name)) {
			return purc_dt();
		}
		if ($ship_fr_valid_dt.equalsIgnoreCase(name)) {
			return ship_fr_valid_dt();
		}
		if ($ptax_dt.equalsIgnoreCase(name)) {
			return ptax_dt();
		}
		if ($xrate_purc_dt.equalsIgnoreCase(name)) {
			return xrate_purc_dt();
		}
		return super.getDate(name);
	}
	public boolean getBoolean(String name) {
		if ($sync_flg.equalsIgnoreCase(name)) {
			return sync_flg();
		}
		if ($abort_flg.equalsIgnoreCase(name)) {
			return abort_flg();
		}
		if ($sundry_itm_flg.equalsIgnoreCase(name)) {
			return sundry_itm_flg();
		}
		if ($sls_dtl_upd_flg.equalsIgnoreCase(name)) {
			return sls_dtl_upd_flg();
		}
		if ($sppl_iv_flg.equalsIgnoreCase(name)) {
			return sppl_iv_flg();
		}
		if ($subcon_flg.equalsIgnoreCase(name)) {
			return subcon_flg();
		}
		if ($purc_xrate_inpt_flg.equalsIgnoreCase(name)) {
			return purc_xrate_inpt_flg();
		}
		if ($purc_ptax_xrate_inpt_flg.equalsIgnoreCase(name)) {
			return purc_ptax_xrate_inpt_flg();
		}
		if ($purc_dtl_upd_flg.equalsIgnoreCase(name)) {
			return purc_dtl_upd_flg();
		}
		if ($dscnt_itm_flg.equalsIgnoreCase(name)) {
			return dscnt_itm_flg();
		}
		if ($cont_fctr_flg.equalsIgnoreCase(name)) {
			return cont_fctr_flg();
		}
		if ($ver_flg.equalsIgnoreCase(name)) {
			return ver_flg();
		}
		if ($sls_acxfr_flg.equalsIgnoreCase(name)) {
			return sls_acxfr_flg();
		}
		if ($xpns_purc_flg.equalsIgnoreCase(name)) {
			return xpns_purc_flg();
		}
		if ($outsrc_flg.equalsIgnoreCase(name)) {
			return outsrc_flg();
		}
		if ($arr_schd_lot_fix_flg.equalsIgnoreCase(name)) {
			return arr_schd_lot_fix_flg();
		}
		if ($mrkt_judg_flg.equalsIgnoreCase(name)) {
			return mrkt_judg_flg();
		}
		if ($org_sync_flg.equalsIgnoreCase(name)) {
			return org_sync_flg();
		}
		if ($init_inc_tax_flg.equalsIgnoreCase(name)) {
			return init_inc_tax_flg();
		}
		if ($db_inc_tax_flg.equalsIgnoreCase(name)) {
			return db_inc_tax_flg();
		}
		if ($purc_init_inc_tax_flg.equalsIgnoreCase(name)) {
			return purc_init_inc_tax_flg();
		}
		if ($purc_db_inc_tax_flg.equalsIgnoreCase(name)) {
			return purc_db_inc_tax_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($cst_itm_cd.equalsIgnoreCase(name)) {
			return cst_itm_cd();
		}
		if ($cst_itm_nm.equalsIgnoreCase(name)) {
			return cst_itm_nm();
		}
		if ($asset_mng_typ.equalsIgnoreCase(name)) {
			return asset_mng_typ();
		}
		if ($asset_mng_typ_nm.equalsIgnoreCase(name)) {
			return asset_mng_typ_nm();
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
		if ($gd_cd.equalsIgnoreCase(name)) {
			return gd_cd();
		}
		if ($gd_nm.equalsIgnoreCase(name)) {
			return gd_nm();
		}
		if ($cst_po_d_no.equalsIgnoreCase(name)) {
			return cst_po_d_no();
		}
		if ($sls_rsn_cd.equalsIgnoreCase(name)) {
			return sls_rsn_cd();
		}
		if ($sls_rsn_nm.equalsIgnoreCase(name)) {
			return sls_rsn_nm();
		}
		if ($bd_dpt_cd.equalsIgnoreCase(name)) {
			return bd_dpt_cd();
		}
		if ($bd_dpt_nm.equalsIgnoreCase(name)) {
			return bd_dpt_nm();
		}
		if ($ext_sys_cd.equalsIgnoreCase(name)) {
			return ext_sys_cd();
		}
		if ($ext_sys_nm.equalsIgnoreCase(name)) {
			return ext_sys_nm();
		}
		if ($ext_purc_act_d_no.equalsIgnoreCase(name)) {
			return ext_purc_act_d_no();
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
		if ($purc_act_no.equalsIgnoreCase(name)) {
			return purc_act_no();
		}
		if ($purc_act_d_no.equalsIgnoreCase(name)) {
			return purc_act_d_no();
		}
		if ($po_no.equalsIgnoreCase(name)) {
			return po_no();
		}
		if ($po_d_no.equalsIgnoreCase(name)) {
			return po_d_no();
		}
		if ($sppl_cd.equalsIgnoreCase(name)) {
			return sppl_cd();
		}
		if ($sppl_nm.equalsIgnoreCase(name)) {
			return sppl_nm();
		}
		if ($maker_cd.equalsIgnoreCase(name)) {
			return maker_cd();
		}
		if ($maker_nm.equalsIgnoreCase(name)) {
			return maker_nm();
		}
		if ($bp_dlv_slip_no.equalsIgnoreCase(name)) {
			return bp_dlv_slip_no();
		}
		if ($bp_dlv_slip_d_no.equalsIgnoreCase(name)) {
			return bp_dlv_slip_d_no();
		}
		if ($bp_lot_no.equalsIgnoreCase(name)) {
			return bp_lot_no();
		}
		if ($purc_trd_cur_cd.equalsIgnoreCase(name)) {
			return purc_trd_cur_cd();
		}
		if ($purc_trd_cur_nm.equalsIgnoreCase(name)) {
			return purc_trd_cur_nm();
		}
		if ($purc_rsn_cd.equalsIgnoreCase(name)) {
			return purc_rsn_cd();
		}
		if ($purc_rsn_nm.equalsIgnoreCase(name)) {
			return purc_rsn_nm();
		}
		if ($purc_bd_dpt_cd.equalsIgnoreCase(name)) {
			return purc_bd_dpt_cd();
		}
		if ($purc_bd_dpt_nm.equalsIgnoreCase(name)) {
			return purc_bd_dpt_nm();
		}
		if ($po_print_rmrks.equalsIgnoreCase(name)) {
			return po_print_rmrks();
		}
		if ($po_print_d_rmrks.equalsIgnoreCase(name)) {
			return po_print_d_rmrks();
		}
		if ($slo_d_no.equalsIgnoreCase(name)) {
			return slo_d_no();
		}
		if ($lot_mng_typ.equalsIgnoreCase(name)) {
			return lot_mng_typ();
		}
		if ($sublot_mng_typ.equalsIgnoreCase(name)) {
			return sublot_mng_typ();
		}
		if ($lot_no_typ.equalsIgnoreCase(name)) {
			return lot_no_typ();
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
		if ($stk_mng_typ.equalsIgnoreCase(name)) {
			return stk_mng_typ();
		}
		if ($base_unit_rnd_typ.equalsIgnoreCase(name)) {
			return base_unit_rnd_typ();
		}
		if ($cont_fctr_rnd_typ.equalsIgnoreCase(name)) {
			return cont_fctr_rnd_typ();
		}
		if ($trd_unit_rnd_typ.equalsIgnoreCase(name)) {
			return trd_unit_rnd_typ();
		}
		if ($sls_act_no.equalsIgnoreCase(name)) {
			return sls_act_no();
		}
		if ($sls_schd_no.equalsIgnoreCase(name)) {
			return sls_schd_no();
		}
		if ($purc_schd_no.equalsIgnoreCase(name)) {
			return purc_schd_no();
		}
		if ($arr_pr_no.equalsIgnoreCase(name)) {
			return arr_pr_no();
		}
		if ($ship_pr_no.equalsIgnoreCase(name)) {
			return ship_pr_no();
		}
		if ($purc_amt_rnd_typ.equalsIgnoreCase(name)) {
			return purc_amt_rnd_typ();
		}
		if ($purc_upri_rnd_typ.equalsIgnoreCase(name)) {
			return purc_upri_rnd_typ();
		}
		if ($purc_tax_rnd_typ.equalsIgnoreCase(name)) {
			return purc_tax_rnd_typ();
		}
		if ($purc_trd_unit_cd.equalsIgnoreCase(name)) {
			return purc_trd_unit_cd();
		}
		if ($init_trd_unit_cd.equalsIgnoreCase(name)) {
			return init_trd_unit_cd();
		}
		if ($db_trd_unit_cd.equalsIgnoreCase(name)) {
			return db_trd_unit_cd();
		}
		if ($db_trd_unit_rnd_typ.equalsIgnoreCase(name)) {
			return db_trd_unit_rnd_typ();
		}
		if ($purc_init_trd_unit_cd.equalsIgnoreCase(name)) {
			return purc_init_trd_unit_cd();
		}
		if ($purc_db_trd_unit_cd.equalsIgnoreCase(name)) {
			return purc_db_trd_unit_cd();
		}
		if ($purc_db_trd_unit_rnd_typ.equalsIgnoreCase(name)) {
			return purc_db_trd_unit_rnd_typ();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($prof_rate.equalsIgnoreCase(name)) {
			return prof_rate();
		}
		if ($bill_crryovr_times.equalsIgnoreCase(name)) {
			return bill_crryovr_times();
		}
		if ($wtax_rate.equalsIgnoreCase(name)) {
			return wtax_rate();
		}
		if ($purc_wtax_rate.equalsIgnoreCase(name)) {
			return purc_wtax_rate();
		}
		if ($purc_wtax_amt.equalsIgnoreCase(name)) {
			return purc_wtax_amt();
		}
		if ($base_unit_purc_schd_qty.equalsIgnoreCase(name)) {
			return base_unit_purc_schd_qty();
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			return disp_seq();
		}
		if ($itm_bill_crryovr_times.equalsIgnoreCase(name)) {
			return itm_bill_crryovr_times();
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			return base_unit_dec_place();
		}
		if ($cont_fctr_dec_place.equalsIgnoreCase(name)) {
			return cont_fctr_dec_place();
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
		if ($sls_act_seq.equalsIgnoreCase(name)) {
			return sls_act_seq();
		}
		if ($sls_act_d_seq.equalsIgnoreCase(name)) {
			return sls_act_d_seq();
		}
		if ($dtl_row_id.equalsIgnoreCase(name)) {
			return dtl_row_id();
		}
		if ($base_unit_upri.equalsIgnoreCase(name)) {
			return base_unit_upri();
		}
		if ($init_schd_qty.equalsIgnoreCase(name)) {
			return init_schd_qty();
		}
		if ($init_schd_dscnt_amt.equalsIgnoreCase(name)) {
			return init_schd_dscnt_amt();
		}
		if ($arr_pr_upd_cntr.equalsIgnoreCase(name)) {
			return arr_pr_upd_cntr();
		}
		if ($ship_pr_upd_cntr.equalsIgnoreCase(name)) {
			return ship_pr_upd_cntr();
		}
		if ($init_schd_amt.equalsIgnoreCase(name)) {
			return init_schd_amt();
		}
		if ($schd_trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			return schd_trd_unit_conv_base_qty();
		}
		if ($schd_trd_unit_conv_qty.equalsIgnoreCase(name)) {
			return schd_trd_unit_conv_qty();
		}
		if ($purc_schd_init_qty.equalsIgnoreCase(name)) {
			return purc_schd_init_qty();
		}
		if ($purc_schd_init_dscnt_amt.equalsIgnoreCase(name)) {
			return purc_schd_init_dscnt_amt();
		}
		if ($purc_schd_init_amt.equalsIgnoreCase(name)) {
			return purc_schd_init_amt();
		}
		if ($purc_trd_cur_amt_dec_place.equalsIgnoreCase(name)) {
			return purc_trd_cur_amt_dec_place();
		}
		if ($purc_trd_cur_upri_dec_place.equalsIgnoreCase(name)) {
			return purc_trd_cur_upri_dec_place();
		}
		if ($purc_s_trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			return purc_s_trd_unit_conv_base_qty();
		}
		if ($purc_s_trd_unit_conv_qty.equalsIgnoreCase(name)) {
			return purc_s_trd_unit_conv_qty();
		}
		if ($purc_trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			return purc_trd_unit_conv_base_qty();
		}
		if ($purc_trd_unit_conv_qty.equalsIgnoreCase(name)) {
			return purc_trd_unit_conv_qty();
		}
		if ($purc_trd_unit_dec_place.equalsIgnoreCase(name)) {
			return purc_trd_unit_dec_place();
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
		if ($db_trd_unit_conv_qty.equalsIgnoreCase(name)) {
			return db_trd_unit_conv_qty();
		}
		if ($db_trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			return db_trd_unit_conv_base_qty();
		}
		if ($db_trd_unit_dec_place.equalsIgnoreCase(name)) {
			return db_trd_unit_dec_place();
		}
		if ($db_trd_unit_qty.equalsIgnoreCase(name)) {
			return db_trd_unit_qty();
		}
		if ($db_trd_cur_amt.equalsIgnoreCase(name)) {
			return db_trd_cur_amt();
		}
		if ($db_trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			return db_trd_cur_dscnt_amt();
		}
		if ($db_trd_cur_tax_amt.equalsIgnoreCase(name)) {
			return db_trd_cur_tax_amt();
		}
		if ($db_trd_cur_upri.equalsIgnoreCase(name)) {
			return db_trd_cur_upri();
		}
		if ($db_wtax_rate.equalsIgnoreCase(name)) {
			return db_wtax_rate();
		}
		if ($db_tax_rate.equalsIgnoreCase(name)) {
			return db_tax_rate();
		}
		if ($purc_init_trd_cur_tax_amt.equalsIgnoreCase(name)) {
			return purc_init_trd_cur_tax_amt();
		}
		if ($purc_init_trd_unit_qty.equalsIgnoreCase(name)) {
			return purc_init_trd_unit_qty();
		}
		if ($purc_init_trd_cur_upri.equalsIgnoreCase(name)) {
			return purc_init_trd_cur_upri();
		}
		if ($purc_init_tax_rate.equalsIgnoreCase(name)) {
			return purc_init_tax_rate();
		}
		if ($purc_init_trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			return purc_init_trd_cur_dscnt_amt();
		}
		if ($purc_db_trd_unit_conv_qty.equalsIgnoreCase(name)) {
			return purc_db_trd_unit_conv_qty();
		}
		if ($purc_db_trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			return purc_db_trd_unit_conv_base_qty();
		}
		if ($purc_db_trd_unit_dec_place.equalsIgnoreCase(name)) {
			return purc_db_trd_unit_dec_place();
		}
		if ($purc_db_trd_unit_qty.equalsIgnoreCase(name)) {
			return purc_db_trd_unit_qty();
		}
		if ($purc_db_trd_cur_amt.equalsIgnoreCase(name)) {
			return purc_db_trd_cur_amt();
		}
		if ($purc_db_trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			return purc_db_trd_cur_dscnt_amt();
		}
		if ($purc_db_trd_cur_tax_amt.equalsIgnoreCase(name)) {
			return purc_db_trd_cur_tax_amt();
		}
		if ($purc_db_trd_cur_upri.equalsIgnoreCase(name)) {
			return purc_db_trd_cur_upri();
		}
		if ($purc_db_tax_rate.equalsIgnoreCase(name)) {
			return purc_db_tax_rate();
		}
		if ($purc_schd_init_ex_amt.equalsIgnoreCase(name)) {
			return purc_schd_init_ex_amt();
		}
		if ($base_unit_qty_bef.equalsIgnoreCase(name)) {
			return base_unit_qty_bef();
		}
		if ($base_unit_purc_qty.equalsIgnoreCase(name)) {
			return base_unit_purc_qty();
		}
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($dlv_schd_dt.equalsIgnoreCase(name)) {
			return dlv_schd_dt();
		}
		if ($purc_ac_ym.equalsIgnoreCase(name)) {
			return purc_ac_ym();
		}
		if ($purc_ac_dt.equalsIgnoreCase(name)) {
			return purc_ac_dt();
		}
		if ($purc_dt.equalsIgnoreCase(name)) {
			return purc_dt();
		}
		if ($ship_fr_valid_dt.equalsIgnoreCase(name)) {
			return ship_fr_valid_dt();
		}
		if ($ptax_dt.equalsIgnoreCase(name)) {
			return ptax_dt();
		}
		if ($xrate_purc_dt.equalsIgnoreCase(name)) {
			return xrate_purc_dt();
		}
		return super.getDateNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($sync_flg.equalsIgnoreCase(name)) {
			return sync_flg();
		}
		if ($abort_flg.equalsIgnoreCase(name)) {
			return abort_flg();
		}
		if ($sundry_itm_flg.equalsIgnoreCase(name)) {
			return sundry_itm_flg();
		}
		if ($sls_dtl_upd_flg.equalsIgnoreCase(name)) {
			return sls_dtl_upd_flg();
		}
		if ($sppl_iv_flg.equalsIgnoreCase(name)) {
			return sppl_iv_flg();
		}
		if ($subcon_flg.equalsIgnoreCase(name)) {
			return subcon_flg();
		}
		if ($purc_xrate_inpt_flg.equalsIgnoreCase(name)) {
			return purc_xrate_inpt_flg();
		}
		if ($purc_ptax_xrate_inpt_flg.equalsIgnoreCase(name)) {
			return purc_ptax_xrate_inpt_flg();
		}
		if ($purc_dtl_upd_flg.equalsIgnoreCase(name)) {
			return purc_dtl_upd_flg();
		}
		if ($dscnt_itm_flg.equalsIgnoreCase(name)) {
			return dscnt_itm_flg();
		}
		if ($cont_fctr_flg.equalsIgnoreCase(name)) {
			return cont_fctr_flg();
		}
		if ($ver_flg.equalsIgnoreCase(name)) {
			return ver_flg();
		}
		if ($sls_acxfr_flg.equalsIgnoreCase(name)) {
			return sls_acxfr_flg();
		}
		if ($xpns_purc_flg.equalsIgnoreCase(name)) {
			return xpns_purc_flg();
		}
		if ($outsrc_flg.equalsIgnoreCase(name)) {
			return outsrc_flg();
		}
		if ($arr_schd_lot_fix_flg.equalsIgnoreCase(name)) {
			return arr_schd_lot_fix_flg();
		}
		if ($mrkt_judg_flg.equalsIgnoreCase(name)) {
			return mrkt_judg_flg();
		}
		if ($org_sync_flg.equalsIgnoreCase(name)) {
			return org_sync_flg();
		}
		if ($init_inc_tax_flg.equalsIgnoreCase(name)) {
			return init_inc_tax_flg();
		}
		if ($db_inc_tax_flg.equalsIgnoreCase(name)) {
			return db_inc_tax_flg();
		}
		if ($purc_init_inc_tax_flg.equalsIgnoreCase(name)) {
			return purc_init_inc_tax_flg();
		}
		if ($purc_db_inc_tax_flg.equalsIgnoreCase(name)) {
			return purc_db_inc_tax_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($cst_itm_cd.equalsIgnoreCase(name)) {
			cst_itm_cd(value);
			return;
		}
		if ($cst_itm_nm.equalsIgnoreCase(name)) {
			cst_itm_nm(value);
			return;
		}
		if ($asset_mng_typ.equalsIgnoreCase(name)) {
			asset_mng_typ(value);
			return;
		}
		if ($asset_mng_typ_nm.equalsIgnoreCase(name)) {
			asset_mng_typ_nm(value);
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
		if ($gd_cd.equalsIgnoreCase(name)) {
			gd_cd(value);
			return;
		}
		if ($gd_nm.equalsIgnoreCase(name)) {
			gd_nm(value);
			return;
		}
		if ($cst_po_d_no.equalsIgnoreCase(name)) {
			cst_po_d_no(value);
			return;
		}
		if ($sls_rsn_cd.equalsIgnoreCase(name)) {
			sls_rsn_cd(value);
			return;
		}
		if ($sls_rsn_nm.equalsIgnoreCase(name)) {
			sls_rsn_nm(value);
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
		if ($ext_sys_cd.equalsIgnoreCase(name)) {
			ext_sys_cd(value);
			return;
		}
		if ($ext_sys_nm.equalsIgnoreCase(name)) {
			ext_sys_nm(value);
			return;
		}
		if ($ext_purc_act_d_no.equalsIgnoreCase(name)) {
			ext_purc_act_d_no(value);
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
		if ($purc_act_no.equalsIgnoreCase(name)) {
			purc_act_no(value);
			return;
		}
		if ($purc_act_d_no.equalsIgnoreCase(name)) {
			purc_act_d_no(value);
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
		if ($sppl_cd.equalsIgnoreCase(name)) {
			sppl_cd(value);
			return;
		}
		if ($sppl_nm.equalsIgnoreCase(name)) {
			sppl_nm(value);
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
		if ($bp_dlv_slip_no.equalsIgnoreCase(name)) {
			bp_dlv_slip_no(value);
			return;
		}
		if ($bp_dlv_slip_d_no.equalsIgnoreCase(name)) {
			bp_dlv_slip_d_no(value);
			return;
		}
		if ($bp_lot_no.equalsIgnoreCase(name)) {
			bp_lot_no(value);
			return;
		}
		if ($purc_trd_cur_cd.equalsIgnoreCase(name)) {
			purc_trd_cur_cd(value);
			return;
		}
		if ($purc_trd_cur_nm.equalsIgnoreCase(name)) {
			purc_trd_cur_nm(value);
			return;
		}
		if ($purc_rsn_cd.equalsIgnoreCase(name)) {
			purc_rsn_cd(value);
			return;
		}
		if ($purc_rsn_nm.equalsIgnoreCase(name)) {
			purc_rsn_nm(value);
			return;
		}
		if ($purc_bd_dpt_cd.equalsIgnoreCase(name)) {
			purc_bd_dpt_cd(value);
			return;
		}
		if ($purc_bd_dpt_nm.equalsIgnoreCase(name)) {
			purc_bd_dpt_nm(value);
			return;
		}
		if ($po_print_rmrks.equalsIgnoreCase(name)) {
			po_print_rmrks(value);
			return;
		}
		if ($po_print_d_rmrks.equalsIgnoreCase(name)) {
			po_print_d_rmrks(value);
			return;
		}
		if ($slo_d_no.equalsIgnoreCase(name)) {
			slo_d_no(value);
			return;
		}
		if ($lot_mng_typ.equalsIgnoreCase(name)) {
			lot_mng_typ(value);
			return;
		}
		if ($sublot_mng_typ.equalsIgnoreCase(name)) {
			sublot_mng_typ(value);
			return;
		}
		if ($lot_no_typ.equalsIgnoreCase(name)) {
			lot_no_typ(value);
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
		if ($stk_mng_typ.equalsIgnoreCase(name)) {
			stk_mng_typ(value);
			return;
		}
		if ($base_unit_rnd_typ.equalsIgnoreCase(name)) {
			base_unit_rnd_typ(value);
			return;
		}
		if ($cont_fctr_rnd_typ.equalsIgnoreCase(name)) {
			cont_fctr_rnd_typ(value);
			return;
		}
		if ($trd_unit_rnd_typ.equalsIgnoreCase(name)) {
			trd_unit_rnd_typ(value);
			return;
		}
		if ($sls_act_no.equalsIgnoreCase(name)) {
			sls_act_no(value);
			return;
		}
		if ($sls_schd_no.equalsIgnoreCase(name)) {
			sls_schd_no(value);
			return;
		}
		if ($purc_schd_no.equalsIgnoreCase(name)) {
			purc_schd_no(value);
			return;
		}
		if ($arr_pr_no.equalsIgnoreCase(name)) {
			arr_pr_no(value);
			return;
		}
		if ($ship_pr_no.equalsIgnoreCase(name)) {
			ship_pr_no(value);
			return;
		}
		if ($purc_amt_rnd_typ.equalsIgnoreCase(name)) {
			purc_amt_rnd_typ(value);
			return;
		}
		if ($purc_upri_rnd_typ.equalsIgnoreCase(name)) {
			purc_upri_rnd_typ(value);
			return;
		}
		if ($purc_tax_rnd_typ.equalsIgnoreCase(name)) {
			purc_tax_rnd_typ(value);
			return;
		}
		if ($purc_trd_unit_cd.equalsIgnoreCase(name)) {
			purc_trd_unit_cd(value);
			return;
		}
		if ($init_trd_unit_cd.equalsIgnoreCase(name)) {
			init_trd_unit_cd(value);
			return;
		}
		if ($db_trd_unit_cd.equalsIgnoreCase(name)) {
			db_trd_unit_cd(value);
			return;
		}
		if ($db_trd_unit_rnd_typ.equalsIgnoreCase(name)) {
			db_trd_unit_rnd_typ(value);
			return;
		}
		if ($purc_init_trd_unit_cd.equalsIgnoreCase(name)) {
			purc_init_trd_unit_cd(value);
			return;
		}
		if ($purc_db_trd_unit_cd.equalsIgnoreCase(name)) {
			purc_db_trd_unit_cd(value);
			return;
		}
		if ($purc_db_trd_unit_rnd_typ.equalsIgnoreCase(name)) {
			purc_db_trd_unit_rnd_typ(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($prof_rate.equalsIgnoreCase(name)) {
			prof_rate(value);
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
		if ($purc_wtax_rate.equalsIgnoreCase(name)) {
			purc_wtax_rate(value);
			return;
		}
		if ($purc_wtax_amt.equalsIgnoreCase(name)) {
			purc_wtax_amt(value);
			return;
		}
		if ($base_unit_purc_schd_qty.equalsIgnoreCase(name)) {
			base_unit_purc_schd_qty(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($itm_bill_crryovr_times.equalsIgnoreCase(name)) {
			itm_bill_crryovr_times(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($cont_fctr_dec_place.equalsIgnoreCase(name)) {
			cont_fctr_dec_place(value);
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
		if ($sls_act_seq.equalsIgnoreCase(name)) {
			sls_act_seq(value);
			return;
		}
		if ($sls_act_d_seq.equalsIgnoreCase(name)) {
			sls_act_d_seq(value);
			return;
		}
		if ($dtl_row_id.equalsIgnoreCase(name)) {
			dtl_row_id(value);
			return;
		}
		if ($base_unit_upri.equalsIgnoreCase(name)) {
			base_unit_upri(value);
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
		if ($arr_pr_upd_cntr.equalsIgnoreCase(name)) {
			arr_pr_upd_cntr(value);
			return;
		}
		if ($ship_pr_upd_cntr.equalsIgnoreCase(name)) {
			ship_pr_upd_cntr(value);
			return;
		}
		if ($init_schd_amt.equalsIgnoreCase(name)) {
			init_schd_amt(value);
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
		if ($purc_schd_init_qty.equalsIgnoreCase(name)) {
			purc_schd_init_qty(value);
			return;
		}
		if ($purc_schd_init_dscnt_amt.equalsIgnoreCase(name)) {
			purc_schd_init_dscnt_amt(value);
			return;
		}
		if ($purc_schd_init_amt.equalsIgnoreCase(name)) {
			purc_schd_init_amt(value);
			return;
		}
		if ($purc_trd_cur_amt_dec_place.equalsIgnoreCase(name)) {
			purc_trd_cur_amt_dec_place(value);
			return;
		}
		if ($purc_trd_cur_upri_dec_place.equalsIgnoreCase(name)) {
			purc_trd_cur_upri_dec_place(value);
			return;
		}
		if ($purc_s_trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			purc_s_trd_unit_conv_base_qty(value);
			return;
		}
		if ($purc_s_trd_unit_conv_qty.equalsIgnoreCase(name)) {
			purc_s_trd_unit_conv_qty(value);
			return;
		}
		if ($purc_trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			purc_trd_unit_conv_base_qty(value);
			return;
		}
		if ($purc_trd_unit_conv_qty.equalsIgnoreCase(name)) {
			purc_trd_unit_conv_qty(value);
			return;
		}
		if ($purc_trd_unit_dec_place.equalsIgnoreCase(name)) {
			purc_trd_unit_dec_place(value);
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
		if ($db_trd_unit_conv_qty.equalsIgnoreCase(name)) {
			db_trd_unit_conv_qty(value);
			return;
		}
		if ($db_trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			db_trd_unit_conv_base_qty(value);
			return;
		}
		if ($db_trd_unit_dec_place.equalsIgnoreCase(name)) {
			db_trd_unit_dec_place(value);
			return;
		}
		if ($db_trd_unit_qty.equalsIgnoreCase(name)) {
			db_trd_unit_qty(value);
			return;
		}
		if ($db_trd_cur_amt.equalsIgnoreCase(name)) {
			db_trd_cur_amt(value);
			return;
		}
		if ($db_trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			db_trd_cur_dscnt_amt(value);
			return;
		}
		if ($db_trd_cur_tax_amt.equalsIgnoreCase(name)) {
			db_trd_cur_tax_amt(value);
			return;
		}
		if ($db_trd_cur_upri.equalsIgnoreCase(name)) {
			db_trd_cur_upri(value);
			return;
		}
		if ($db_wtax_rate.equalsIgnoreCase(name)) {
			db_wtax_rate(value);
			return;
		}
		if ($db_tax_rate.equalsIgnoreCase(name)) {
			db_tax_rate(value);
			return;
		}
		if ($purc_init_trd_cur_tax_amt.equalsIgnoreCase(name)) {
			purc_init_trd_cur_tax_amt(value);
			return;
		}
		if ($purc_init_trd_unit_qty.equalsIgnoreCase(name)) {
			purc_init_trd_unit_qty(value);
			return;
		}
		if ($purc_init_trd_cur_upri.equalsIgnoreCase(name)) {
			purc_init_trd_cur_upri(value);
			return;
		}
		if ($purc_init_tax_rate.equalsIgnoreCase(name)) {
			purc_init_tax_rate(value);
			return;
		}
		if ($purc_init_trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			purc_init_trd_cur_dscnt_amt(value);
			return;
		}
		if ($purc_db_trd_unit_conv_qty.equalsIgnoreCase(name)) {
			purc_db_trd_unit_conv_qty(value);
			return;
		}
		if ($purc_db_trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			purc_db_trd_unit_conv_base_qty(value);
			return;
		}
		if ($purc_db_trd_unit_dec_place.equalsIgnoreCase(name)) {
			purc_db_trd_unit_dec_place(value);
			return;
		}
		if ($purc_db_trd_unit_qty.equalsIgnoreCase(name)) {
			purc_db_trd_unit_qty(value);
			return;
		}
		if ($purc_db_trd_cur_amt.equalsIgnoreCase(name)) {
			purc_db_trd_cur_amt(value);
			return;
		}
		if ($purc_db_trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			purc_db_trd_cur_dscnt_amt(value);
			return;
		}
		if ($purc_db_trd_cur_tax_amt.equalsIgnoreCase(name)) {
			purc_db_trd_cur_tax_amt(value);
			return;
		}
		if ($purc_db_trd_cur_upri.equalsIgnoreCase(name)) {
			purc_db_trd_cur_upri(value);
			return;
		}
		if ($purc_db_tax_rate.equalsIgnoreCase(name)) {
			purc_db_tax_rate(value);
			return;
		}
		if ($purc_schd_init_ex_amt.equalsIgnoreCase(name)) {
			purc_schd_init_ex_amt(value);
			return;
		}
		if ($base_unit_qty_bef.equalsIgnoreCase(name)) {
			base_unit_qty_bef(value);
			return;
		}
		if ($base_unit_purc_qty.equalsIgnoreCase(name)) {
			base_unit_purc_qty(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($prof_rate.equalsIgnoreCase(name)) {
			prof_rate(value);
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
		if ($purc_wtax_rate.equalsIgnoreCase(name)) {
			purc_wtax_rate(value);
			return;
		}
		if ($purc_wtax_amt.equalsIgnoreCase(name)) {
			purc_wtax_amt(value);
			return;
		}
		if ($base_unit_purc_schd_qty.equalsIgnoreCase(name)) {
			base_unit_purc_schd_qty(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($itm_bill_crryovr_times.equalsIgnoreCase(name)) {
			itm_bill_crryovr_times(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($cont_fctr_dec_place.equalsIgnoreCase(name)) {
			cont_fctr_dec_place(value);
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
		if ($sls_act_seq.equalsIgnoreCase(name)) {
			sls_act_seq(value);
			return;
		}
		if ($sls_act_d_seq.equalsIgnoreCase(name)) {
			sls_act_d_seq(value);
			return;
		}
		if ($dtl_row_id.equalsIgnoreCase(name)) {
			dtl_row_id(value);
			return;
		}
		if ($base_unit_upri.equalsIgnoreCase(name)) {
			base_unit_upri(value);
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
		if ($arr_pr_upd_cntr.equalsIgnoreCase(name)) {
			arr_pr_upd_cntr(value);
			return;
		}
		if ($ship_pr_upd_cntr.equalsIgnoreCase(name)) {
			ship_pr_upd_cntr(value);
			return;
		}
		if ($init_schd_amt.equalsIgnoreCase(name)) {
			init_schd_amt(value);
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
		if ($purc_schd_init_qty.equalsIgnoreCase(name)) {
			purc_schd_init_qty(value);
			return;
		}
		if ($purc_schd_init_dscnt_amt.equalsIgnoreCase(name)) {
			purc_schd_init_dscnt_amt(value);
			return;
		}
		if ($purc_schd_init_amt.equalsIgnoreCase(name)) {
			purc_schd_init_amt(value);
			return;
		}
		if ($purc_trd_cur_amt_dec_place.equalsIgnoreCase(name)) {
			purc_trd_cur_amt_dec_place(value);
			return;
		}
		if ($purc_trd_cur_upri_dec_place.equalsIgnoreCase(name)) {
			purc_trd_cur_upri_dec_place(value);
			return;
		}
		if ($purc_s_trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			purc_s_trd_unit_conv_base_qty(value);
			return;
		}
		if ($purc_s_trd_unit_conv_qty.equalsIgnoreCase(name)) {
			purc_s_trd_unit_conv_qty(value);
			return;
		}
		if ($purc_trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			purc_trd_unit_conv_base_qty(value);
			return;
		}
		if ($purc_trd_unit_conv_qty.equalsIgnoreCase(name)) {
			purc_trd_unit_conv_qty(value);
			return;
		}
		if ($purc_trd_unit_dec_place.equalsIgnoreCase(name)) {
			purc_trd_unit_dec_place(value);
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
		if ($db_trd_unit_conv_qty.equalsIgnoreCase(name)) {
			db_trd_unit_conv_qty(value);
			return;
		}
		if ($db_trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			db_trd_unit_conv_base_qty(value);
			return;
		}
		if ($db_trd_unit_dec_place.equalsIgnoreCase(name)) {
			db_trd_unit_dec_place(value);
			return;
		}
		if ($db_trd_unit_qty.equalsIgnoreCase(name)) {
			db_trd_unit_qty(value);
			return;
		}
		if ($db_trd_cur_amt.equalsIgnoreCase(name)) {
			db_trd_cur_amt(value);
			return;
		}
		if ($db_trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			db_trd_cur_dscnt_amt(value);
			return;
		}
		if ($db_trd_cur_tax_amt.equalsIgnoreCase(name)) {
			db_trd_cur_tax_amt(value);
			return;
		}
		if ($db_trd_cur_upri.equalsIgnoreCase(name)) {
			db_trd_cur_upri(value);
			return;
		}
		if ($db_wtax_rate.equalsIgnoreCase(name)) {
			db_wtax_rate(value);
			return;
		}
		if ($db_tax_rate.equalsIgnoreCase(name)) {
			db_tax_rate(value);
			return;
		}
		if ($purc_init_trd_cur_tax_amt.equalsIgnoreCase(name)) {
			purc_init_trd_cur_tax_amt(value);
			return;
		}
		if ($purc_init_trd_unit_qty.equalsIgnoreCase(name)) {
			purc_init_trd_unit_qty(value);
			return;
		}
		if ($purc_init_trd_cur_upri.equalsIgnoreCase(name)) {
			purc_init_trd_cur_upri(value);
			return;
		}
		if ($purc_init_tax_rate.equalsIgnoreCase(name)) {
			purc_init_tax_rate(value);
			return;
		}
		if ($purc_init_trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			purc_init_trd_cur_dscnt_amt(value);
			return;
		}
		if ($purc_db_trd_unit_conv_qty.equalsIgnoreCase(name)) {
			purc_db_trd_unit_conv_qty(value);
			return;
		}
		if ($purc_db_trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			purc_db_trd_unit_conv_base_qty(value);
			return;
		}
		if ($purc_db_trd_unit_dec_place.equalsIgnoreCase(name)) {
			purc_db_trd_unit_dec_place(value);
			return;
		}
		if ($purc_db_trd_unit_qty.equalsIgnoreCase(name)) {
			purc_db_trd_unit_qty(value);
			return;
		}
		if ($purc_db_trd_cur_amt.equalsIgnoreCase(name)) {
			purc_db_trd_cur_amt(value);
			return;
		}
		if ($purc_db_trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			purc_db_trd_cur_dscnt_amt(value);
			return;
		}
		if ($purc_db_trd_cur_tax_amt.equalsIgnoreCase(name)) {
			purc_db_trd_cur_tax_amt(value);
			return;
		}
		if ($purc_db_trd_cur_upri.equalsIgnoreCase(name)) {
			purc_db_trd_cur_upri(value);
			return;
		}
		if ($purc_db_tax_rate.equalsIgnoreCase(name)) {
			purc_db_tax_rate(value);
			return;
		}
		if ($purc_schd_init_ex_amt.equalsIgnoreCase(name)) {
			purc_schd_init_ex_amt(value);
			return;
		}
		if ($base_unit_qty_bef.equalsIgnoreCase(name)) {
			base_unit_qty_bef(value);
			return;
		}
		if ($base_unit_purc_qty.equalsIgnoreCase(name)) {
			base_unit_purc_qty(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($prof_rate.equalsIgnoreCase(name)) {
			prof_rate(value);
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
		if ($purc_wtax_rate.equalsIgnoreCase(name)) {
			purc_wtax_rate(value);
			return;
		}
		if ($purc_wtax_amt.equalsIgnoreCase(name)) {
			purc_wtax_amt(value);
			return;
		}
		if ($base_unit_purc_schd_qty.equalsIgnoreCase(name)) {
			base_unit_purc_schd_qty(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($itm_bill_crryovr_times.equalsIgnoreCase(name)) {
			itm_bill_crryovr_times(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($cont_fctr_dec_place.equalsIgnoreCase(name)) {
			cont_fctr_dec_place(value);
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
		if ($sls_act_seq.equalsIgnoreCase(name)) {
			sls_act_seq(value);
			return;
		}
		if ($sls_act_d_seq.equalsIgnoreCase(name)) {
			sls_act_d_seq(value);
			return;
		}
		if ($dtl_row_id.equalsIgnoreCase(name)) {
			dtl_row_id(value);
			return;
		}
		if ($base_unit_upri.equalsIgnoreCase(name)) {
			base_unit_upri(value);
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
		if ($arr_pr_upd_cntr.equalsIgnoreCase(name)) {
			arr_pr_upd_cntr(value);
			return;
		}
		if ($ship_pr_upd_cntr.equalsIgnoreCase(name)) {
			ship_pr_upd_cntr(value);
			return;
		}
		if ($init_schd_amt.equalsIgnoreCase(name)) {
			init_schd_amt(value);
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
		if ($purc_schd_init_qty.equalsIgnoreCase(name)) {
			purc_schd_init_qty(value);
			return;
		}
		if ($purc_schd_init_dscnt_amt.equalsIgnoreCase(name)) {
			purc_schd_init_dscnt_amt(value);
			return;
		}
		if ($purc_schd_init_amt.equalsIgnoreCase(name)) {
			purc_schd_init_amt(value);
			return;
		}
		if ($purc_trd_cur_amt_dec_place.equalsIgnoreCase(name)) {
			purc_trd_cur_amt_dec_place(value);
			return;
		}
		if ($purc_trd_cur_upri_dec_place.equalsIgnoreCase(name)) {
			purc_trd_cur_upri_dec_place(value);
			return;
		}
		if ($purc_s_trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			purc_s_trd_unit_conv_base_qty(value);
			return;
		}
		if ($purc_s_trd_unit_conv_qty.equalsIgnoreCase(name)) {
			purc_s_trd_unit_conv_qty(value);
			return;
		}
		if ($purc_trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			purc_trd_unit_conv_base_qty(value);
			return;
		}
		if ($purc_trd_unit_conv_qty.equalsIgnoreCase(name)) {
			purc_trd_unit_conv_qty(value);
			return;
		}
		if ($purc_trd_unit_dec_place.equalsIgnoreCase(name)) {
			purc_trd_unit_dec_place(value);
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
		if ($db_trd_unit_conv_qty.equalsIgnoreCase(name)) {
			db_trd_unit_conv_qty(value);
			return;
		}
		if ($db_trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			db_trd_unit_conv_base_qty(value);
			return;
		}
		if ($db_trd_unit_dec_place.equalsIgnoreCase(name)) {
			db_trd_unit_dec_place(value);
			return;
		}
		if ($db_trd_unit_qty.equalsIgnoreCase(name)) {
			db_trd_unit_qty(value);
			return;
		}
		if ($db_trd_cur_amt.equalsIgnoreCase(name)) {
			db_trd_cur_amt(value);
			return;
		}
		if ($db_trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			db_trd_cur_dscnt_amt(value);
			return;
		}
		if ($db_trd_cur_tax_amt.equalsIgnoreCase(name)) {
			db_trd_cur_tax_amt(value);
			return;
		}
		if ($db_trd_cur_upri.equalsIgnoreCase(name)) {
			db_trd_cur_upri(value);
			return;
		}
		if ($db_wtax_rate.equalsIgnoreCase(name)) {
			db_wtax_rate(value);
			return;
		}
		if ($db_tax_rate.equalsIgnoreCase(name)) {
			db_tax_rate(value);
			return;
		}
		if ($purc_init_trd_cur_tax_amt.equalsIgnoreCase(name)) {
			purc_init_trd_cur_tax_amt(value);
			return;
		}
		if ($purc_init_trd_unit_qty.equalsIgnoreCase(name)) {
			purc_init_trd_unit_qty(value);
			return;
		}
		if ($purc_init_trd_cur_upri.equalsIgnoreCase(name)) {
			purc_init_trd_cur_upri(value);
			return;
		}
		if ($purc_init_tax_rate.equalsIgnoreCase(name)) {
			purc_init_tax_rate(value);
			return;
		}
		if ($purc_init_trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			purc_init_trd_cur_dscnt_amt(value);
			return;
		}
		if ($purc_db_trd_unit_conv_qty.equalsIgnoreCase(name)) {
			purc_db_trd_unit_conv_qty(value);
			return;
		}
		if ($purc_db_trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			purc_db_trd_unit_conv_base_qty(value);
			return;
		}
		if ($purc_db_trd_unit_dec_place.equalsIgnoreCase(name)) {
			purc_db_trd_unit_dec_place(value);
			return;
		}
		if ($purc_db_trd_unit_qty.equalsIgnoreCase(name)) {
			purc_db_trd_unit_qty(value);
			return;
		}
		if ($purc_db_trd_cur_amt.equalsIgnoreCase(name)) {
			purc_db_trd_cur_amt(value);
			return;
		}
		if ($purc_db_trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			purc_db_trd_cur_dscnt_amt(value);
			return;
		}
		if ($purc_db_trd_cur_tax_amt.equalsIgnoreCase(name)) {
			purc_db_trd_cur_tax_amt(value);
			return;
		}
		if ($purc_db_trd_cur_upri.equalsIgnoreCase(name)) {
			purc_db_trd_cur_upri(value);
			return;
		}
		if ($purc_db_tax_rate.equalsIgnoreCase(name)) {
			purc_db_tax_rate(value);
			return;
		}
		if ($purc_schd_init_ex_amt.equalsIgnoreCase(name)) {
			purc_schd_init_ex_amt(value);
			return;
		}
		if ($base_unit_qty_bef.equalsIgnoreCase(name)) {
			base_unit_qty_bef(value);
			return;
		}
		if ($base_unit_purc_qty.equalsIgnoreCase(name)) {
			base_unit_purc_qty(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($prof_rate.equalsIgnoreCase(name)) {
			prof_rate(value);
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
		if ($purc_wtax_rate.equalsIgnoreCase(name)) {
			purc_wtax_rate(value);
			return;
		}
		if ($purc_wtax_amt.equalsIgnoreCase(name)) {
			purc_wtax_amt(value);
			return;
		}
		if ($base_unit_purc_schd_qty.equalsIgnoreCase(name)) {
			base_unit_purc_schd_qty(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($itm_bill_crryovr_times.equalsIgnoreCase(name)) {
			itm_bill_crryovr_times(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($cont_fctr_dec_place.equalsIgnoreCase(name)) {
			cont_fctr_dec_place(value);
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
		if ($sls_act_seq.equalsIgnoreCase(name)) {
			sls_act_seq(value);
			return;
		}
		if ($sls_act_d_seq.equalsIgnoreCase(name)) {
			sls_act_d_seq(value);
			return;
		}
		if ($dtl_row_id.equalsIgnoreCase(name)) {
			dtl_row_id(value);
			return;
		}
		if ($base_unit_upri.equalsIgnoreCase(name)) {
			base_unit_upri(value);
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
		if ($arr_pr_upd_cntr.equalsIgnoreCase(name)) {
			arr_pr_upd_cntr(value);
			return;
		}
		if ($ship_pr_upd_cntr.equalsIgnoreCase(name)) {
			ship_pr_upd_cntr(value);
			return;
		}
		if ($init_schd_amt.equalsIgnoreCase(name)) {
			init_schd_amt(value);
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
		if ($purc_schd_init_qty.equalsIgnoreCase(name)) {
			purc_schd_init_qty(value);
			return;
		}
		if ($purc_schd_init_dscnt_amt.equalsIgnoreCase(name)) {
			purc_schd_init_dscnt_amt(value);
			return;
		}
		if ($purc_schd_init_amt.equalsIgnoreCase(name)) {
			purc_schd_init_amt(value);
			return;
		}
		if ($purc_trd_cur_amt_dec_place.equalsIgnoreCase(name)) {
			purc_trd_cur_amt_dec_place(value);
			return;
		}
		if ($purc_trd_cur_upri_dec_place.equalsIgnoreCase(name)) {
			purc_trd_cur_upri_dec_place(value);
			return;
		}
		if ($purc_s_trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			purc_s_trd_unit_conv_base_qty(value);
			return;
		}
		if ($purc_s_trd_unit_conv_qty.equalsIgnoreCase(name)) {
			purc_s_trd_unit_conv_qty(value);
			return;
		}
		if ($purc_trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			purc_trd_unit_conv_base_qty(value);
			return;
		}
		if ($purc_trd_unit_conv_qty.equalsIgnoreCase(name)) {
			purc_trd_unit_conv_qty(value);
			return;
		}
		if ($purc_trd_unit_dec_place.equalsIgnoreCase(name)) {
			purc_trd_unit_dec_place(value);
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
		if ($db_trd_unit_conv_qty.equalsIgnoreCase(name)) {
			db_trd_unit_conv_qty(value);
			return;
		}
		if ($db_trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			db_trd_unit_conv_base_qty(value);
			return;
		}
		if ($db_trd_unit_dec_place.equalsIgnoreCase(name)) {
			db_trd_unit_dec_place(value);
			return;
		}
		if ($db_trd_unit_qty.equalsIgnoreCase(name)) {
			db_trd_unit_qty(value);
			return;
		}
		if ($db_trd_cur_amt.equalsIgnoreCase(name)) {
			db_trd_cur_amt(value);
			return;
		}
		if ($db_trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			db_trd_cur_dscnt_amt(value);
			return;
		}
		if ($db_trd_cur_tax_amt.equalsIgnoreCase(name)) {
			db_trd_cur_tax_amt(value);
			return;
		}
		if ($db_trd_cur_upri.equalsIgnoreCase(name)) {
			db_trd_cur_upri(value);
			return;
		}
		if ($db_wtax_rate.equalsIgnoreCase(name)) {
			db_wtax_rate(value);
			return;
		}
		if ($db_tax_rate.equalsIgnoreCase(name)) {
			db_tax_rate(value);
			return;
		}
		if ($purc_init_trd_cur_tax_amt.equalsIgnoreCase(name)) {
			purc_init_trd_cur_tax_amt(value);
			return;
		}
		if ($purc_init_trd_unit_qty.equalsIgnoreCase(name)) {
			purc_init_trd_unit_qty(value);
			return;
		}
		if ($purc_init_trd_cur_upri.equalsIgnoreCase(name)) {
			purc_init_trd_cur_upri(value);
			return;
		}
		if ($purc_init_tax_rate.equalsIgnoreCase(name)) {
			purc_init_tax_rate(value);
			return;
		}
		if ($purc_init_trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			purc_init_trd_cur_dscnt_amt(value);
			return;
		}
		if ($purc_db_trd_unit_conv_qty.equalsIgnoreCase(name)) {
			purc_db_trd_unit_conv_qty(value);
			return;
		}
		if ($purc_db_trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			purc_db_trd_unit_conv_base_qty(value);
			return;
		}
		if ($purc_db_trd_unit_dec_place.equalsIgnoreCase(name)) {
			purc_db_trd_unit_dec_place(value);
			return;
		}
		if ($purc_db_trd_unit_qty.equalsIgnoreCase(name)) {
			purc_db_trd_unit_qty(value);
			return;
		}
		if ($purc_db_trd_cur_amt.equalsIgnoreCase(name)) {
			purc_db_trd_cur_amt(value);
			return;
		}
		if ($purc_db_trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			purc_db_trd_cur_dscnt_amt(value);
			return;
		}
		if ($purc_db_trd_cur_tax_amt.equalsIgnoreCase(name)) {
			purc_db_trd_cur_tax_amt(value);
			return;
		}
		if ($purc_db_trd_cur_upri.equalsIgnoreCase(name)) {
			purc_db_trd_cur_upri(value);
			return;
		}
		if ($purc_db_tax_rate.equalsIgnoreCase(name)) {
			purc_db_tax_rate(value);
			return;
		}
		if ($purc_schd_init_ex_amt.equalsIgnoreCase(name)) {
			purc_schd_init_ex_amt(value);
			return;
		}
		if ($base_unit_qty_bef.equalsIgnoreCase(name)) {
			base_unit_qty_bef(value);
			return;
		}
		if ($base_unit_purc_qty.equalsIgnoreCase(name)) {
			base_unit_purc_qty(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($prof_rate.equalsIgnoreCase(name)) {
			prof_rate(value);
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
		if ($purc_wtax_rate.equalsIgnoreCase(name)) {
			purc_wtax_rate(value);
			return;
		}
		if ($purc_wtax_amt.equalsIgnoreCase(name)) {
			purc_wtax_amt(value);
			return;
		}
		if ($base_unit_purc_schd_qty.equalsIgnoreCase(name)) {
			base_unit_purc_schd_qty(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($itm_bill_crryovr_times.equalsIgnoreCase(name)) {
			itm_bill_crryovr_times(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($cont_fctr_dec_place.equalsIgnoreCase(name)) {
			cont_fctr_dec_place(value);
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
		if ($sls_act_seq.equalsIgnoreCase(name)) {
			sls_act_seq(value);
			return;
		}
		if ($sls_act_d_seq.equalsIgnoreCase(name)) {
			sls_act_d_seq(value);
			return;
		}
		if ($dtl_row_id.equalsIgnoreCase(name)) {
			dtl_row_id(value);
			return;
		}
		if ($base_unit_upri.equalsIgnoreCase(name)) {
			base_unit_upri(value);
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
		if ($arr_pr_upd_cntr.equalsIgnoreCase(name)) {
			arr_pr_upd_cntr(value);
			return;
		}
		if ($ship_pr_upd_cntr.equalsIgnoreCase(name)) {
			ship_pr_upd_cntr(value);
			return;
		}
		if ($init_schd_amt.equalsIgnoreCase(name)) {
			init_schd_amt(value);
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
		if ($purc_schd_init_qty.equalsIgnoreCase(name)) {
			purc_schd_init_qty(value);
			return;
		}
		if ($purc_schd_init_dscnt_amt.equalsIgnoreCase(name)) {
			purc_schd_init_dscnt_amt(value);
			return;
		}
		if ($purc_schd_init_amt.equalsIgnoreCase(name)) {
			purc_schd_init_amt(value);
			return;
		}
		if ($purc_trd_cur_amt_dec_place.equalsIgnoreCase(name)) {
			purc_trd_cur_amt_dec_place(value);
			return;
		}
		if ($purc_trd_cur_upri_dec_place.equalsIgnoreCase(name)) {
			purc_trd_cur_upri_dec_place(value);
			return;
		}
		if ($purc_s_trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			purc_s_trd_unit_conv_base_qty(value);
			return;
		}
		if ($purc_s_trd_unit_conv_qty.equalsIgnoreCase(name)) {
			purc_s_trd_unit_conv_qty(value);
			return;
		}
		if ($purc_trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			purc_trd_unit_conv_base_qty(value);
			return;
		}
		if ($purc_trd_unit_conv_qty.equalsIgnoreCase(name)) {
			purc_trd_unit_conv_qty(value);
			return;
		}
		if ($purc_trd_unit_dec_place.equalsIgnoreCase(name)) {
			purc_trd_unit_dec_place(value);
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
		if ($db_trd_unit_conv_qty.equalsIgnoreCase(name)) {
			db_trd_unit_conv_qty(value);
			return;
		}
		if ($db_trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			db_trd_unit_conv_base_qty(value);
			return;
		}
		if ($db_trd_unit_dec_place.equalsIgnoreCase(name)) {
			db_trd_unit_dec_place(value);
			return;
		}
		if ($db_trd_unit_qty.equalsIgnoreCase(name)) {
			db_trd_unit_qty(value);
			return;
		}
		if ($db_trd_cur_amt.equalsIgnoreCase(name)) {
			db_trd_cur_amt(value);
			return;
		}
		if ($db_trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			db_trd_cur_dscnt_amt(value);
			return;
		}
		if ($db_trd_cur_tax_amt.equalsIgnoreCase(name)) {
			db_trd_cur_tax_amt(value);
			return;
		}
		if ($db_trd_cur_upri.equalsIgnoreCase(name)) {
			db_trd_cur_upri(value);
			return;
		}
		if ($db_wtax_rate.equalsIgnoreCase(name)) {
			db_wtax_rate(value);
			return;
		}
		if ($db_tax_rate.equalsIgnoreCase(name)) {
			db_tax_rate(value);
			return;
		}
		if ($purc_init_trd_cur_tax_amt.equalsIgnoreCase(name)) {
			purc_init_trd_cur_tax_amt(value);
			return;
		}
		if ($purc_init_trd_unit_qty.equalsIgnoreCase(name)) {
			purc_init_trd_unit_qty(value);
			return;
		}
		if ($purc_init_trd_cur_upri.equalsIgnoreCase(name)) {
			purc_init_trd_cur_upri(value);
			return;
		}
		if ($purc_init_tax_rate.equalsIgnoreCase(name)) {
			purc_init_tax_rate(value);
			return;
		}
		if ($purc_init_trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			purc_init_trd_cur_dscnt_amt(value);
			return;
		}
		if ($purc_db_trd_unit_conv_qty.equalsIgnoreCase(name)) {
			purc_db_trd_unit_conv_qty(value);
			return;
		}
		if ($purc_db_trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			purc_db_trd_unit_conv_base_qty(value);
			return;
		}
		if ($purc_db_trd_unit_dec_place.equalsIgnoreCase(name)) {
			purc_db_trd_unit_dec_place(value);
			return;
		}
		if ($purc_db_trd_unit_qty.equalsIgnoreCase(name)) {
			purc_db_trd_unit_qty(value);
			return;
		}
		if ($purc_db_trd_cur_amt.equalsIgnoreCase(name)) {
			purc_db_trd_cur_amt(value);
			return;
		}
		if ($purc_db_trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			purc_db_trd_cur_dscnt_amt(value);
			return;
		}
		if ($purc_db_trd_cur_tax_amt.equalsIgnoreCase(name)) {
			purc_db_trd_cur_tax_amt(value);
			return;
		}
		if ($purc_db_trd_cur_upri.equalsIgnoreCase(name)) {
			purc_db_trd_cur_upri(value);
			return;
		}
		if ($purc_db_tax_rate.equalsIgnoreCase(name)) {
			purc_db_tax_rate(value);
			return;
		}
		if ($purc_schd_init_ex_amt.equalsIgnoreCase(name)) {
			purc_schd_init_ex_amt(value);
			return;
		}
		if ($base_unit_qty_bef.equalsIgnoreCase(name)) {
			base_unit_qty_bef(value);
			return;
		}
		if ($base_unit_purc_qty.equalsIgnoreCase(name)) {
			base_unit_purc_qty(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($dlv_schd_dt.equalsIgnoreCase(name)) {
			dlv_schd_dt(value);
			return;
		}
		if ($purc_ac_ym.equalsIgnoreCase(name)) {
			purc_ac_ym(value);
			return;
		}
		if ($purc_ac_dt.equalsIgnoreCase(name)) {
			purc_ac_dt(value);
			return;
		}
		if ($purc_dt.equalsIgnoreCase(name)) {
			purc_dt(value);
			return;
		}
		if ($ship_fr_valid_dt.equalsIgnoreCase(name)) {
			ship_fr_valid_dt(value);
			return;
		}
		if ($ptax_dt.equalsIgnoreCase(name)) {
			ptax_dt(value);
			return;
		}
		if ($xrate_purc_dt.equalsIgnoreCase(name)) {
			xrate_purc_dt(value);
			return;
		}
		super.setDate(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($sync_flg.equalsIgnoreCase(name)) {
			sync_flg(value);
			return;
		}
		if ($abort_flg.equalsIgnoreCase(name)) {
			abort_flg(value);
			return;
		}
		if ($sundry_itm_flg.equalsIgnoreCase(name)) {
			sundry_itm_flg(value);
			return;
		}
		if ($sls_dtl_upd_flg.equalsIgnoreCase(name)) {
			sls_dtl_upd_flg(value);
			return;
		}
		if ($sppl_iv_flg.equalsIgnoreCase(name)) {
			sppl_iv_flg(value);
			return;
		}
		if ($subcon_flg.equalsIgnoreCase(name)) {
			subcon_flg(value);
			return;
		}
		if ($purc_xrate_inpt_flg.equalsIgnoreCase(name)) {
			purc_xrate_inpt_flg(value);
			return;
		}
		if ($purc_ptax_xrate_inpt_flg.equalsIgnoreCase(name)) {
			purc_ptax_xrate_inpt_flg(value);
			return;
		}
		if ($purc_dtl_upd_flg.equalsIgnoreCase(name)) {
			purc_dtl_upd_flg(value);
			return;
		}
		if ($dscnt_itm_flg.equalsIgnoreCase(name)) {
			dscnt_itm_flg(value);
			return;
		}
		if ($cont_fctr_flg.equalsIgnoreCase(name)) {
			cont_fctr_flg(value);
			return;
		}
		if ($ver_flg.equalsIgnoreCase(name)) {
			ver_flg(value);
			return;
		}
		if ($sls_acxfr_flg.equalsIgnoreCase(name)) {
			sls_acxfr_flg(value);
			return;
		}
		if ($xpns_purc_flg.equalsIgnoreCase(name)) {
			xpns_purc_flg(value);
			return;
		}
		if ($outsrc_flg.equalsIgnoreCase(name)) {
			outsrc_flg(value);
			return;
		}
		if ($arr_schd_lot_fix_flg.equalsIgnoreCase(name)) {
			arr_schd_lot_fix_flg(value);
			return;
		}
		if ($mrkt_judg_flg.equalsIgnoreCase(name)) {
			mrkt_judg_flg(value);
			return;
		}
		if ($org_sync_flg.equalsIgnoreCase(name)) {
			org_sync_flg(value);
			return;
		}
		if ($init_inc_tax_flg.equalsIgnoreCase(name)) {
			init_inc_tax_flg(value);
			return;
		}
		if ($db_inc_tax_flg.equalsIgnoreCase(name)) {
			db_inc_tax_flg(value);
			return;
		}
		if ($purc_init_inc_tax_flg.equalsIgnoreCase(name)) {
			purc_init_inc_tax_flg(value);
			return;
		}
		if ($purc_db_inc_tax_flg.equalsIgnoreCase(name)) {
			purc_db_inc_tax_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($cst_itm_cd.equalsIgnoreCase(name)) {
			cst_itm_cd(value);
			return;
		}
		if ($cst_itm_nm.equalsIgnoreCase(name)) {
			cst_itm_nm(value);
			return;
		}
		if ($asset_mng_typ.equalsIgnoreCase(name)) {
			asset_mng_typ(value);
			return;
		}
		if ($asset_mng_typ_nm.equalsIgnoreCase(name)) {
			asset_mng_typ_nm(value);
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
		if ($gd_cd.equalsIgnoreCase(name)) {
			gd_cd(value);
			return;
		}
		if ($gd_nm.equalsIgnoreCase(name)) {
			gd_nm(value);
			return;
		}
		if ($cst_po_d_no.equalsIgnoreCase(name)) {
			cst_po_d_no(value);
			return;
		}
		if ($sls_rsn_cd.equalsIgnoreCase(name)) {
			sls_rsn_cd(value);
			return;
		}
		if ($sls_rsn_nm.equalsIgnoreCase(name)) {
			sls_rsn_nm(value);
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
		if ($ext_sys_cd.equalsIgnoreCase(name)) {
			ext_sys_cd(value);
			return;
		}
		if ($ext_sys_nm.equalsIgnoreCase(name)) {
			ext_sys_nm(value);
			return;
		}
		if ($ext_purc_act_d_no.equalsIgnoreCase(name)) {
			ext_purc_act_d_no(value);
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
		if ($purc_act_no.equalsIgnoreCase(name)) {
			purc_act_no(value);
			return;
		}
		if ($purc_act_d_no.equalsIgnoreCase(name)) {
			purc_act_d_no(value);
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
		if ($sppl_cd.equalsIgnoreCase(name)) {
			sppl_cd(value);
			return;
		}
		if ($sppl_nm.equalsIgnoreCase(name)) {
			sppl_nm(value);
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
		if ($bp_dlv_slip_no.equalsIgnoreCase(name)) {
			bp_dlv_slip_no(value);
			return;
		}
		if ($bp_dlv_slip_d_no.equalsIgnoreCase(name)) {
			bp_dlv_slip_d_no(value);
			return;
		}
		if ($bp_lot_no.equalsIgnoreCase(name)) {
			bp_lot_no(value);
			return;
		}
		if ($purc_trd_cur_cd.equalsIgnoreCase(name)) {
			purc_trd_cur_cd(value);
			return;
		}
		if ($purc_trd_cur_nm.equalsIgnoreCase(name)) {
			purc_trd_cur_nm(value);
			return;
		}
		if ($purc_rsn_cd.equalsIgnoreCase(name)) {
			purc_rsn_cd(value);
			return;
		}
		if ($purc_rsn_nm.equalsIgnoreCase(name)) {
			purc_rsn_nm(value);
			return;
		}
		if ($purc_bd_dpt_cd.equalsIgnoreCase(name)) {
			purc_bd_dpt_cd(value);
			return;
		}
		if ($purc_bd_dpt_nm.equalsIgnoreCase(name)) {
			purc_bd_dpt_nm(value);
			return;
		}
		if ($po_print_rmrks.equalsIgnoreCase(name)) {
			po_print_rmrks(value);
			return;
		}
		if ($po_print_d_rmrks.equalsIgnoreCase(name)) {
			po_print_d_rmrks(value);
			return;
		}
		if ($slo_d_no.equalsIgnoreCase(name)) {
			slo_d_no(value);
			return;
		}
		if ($lot_mng_typ.equalsIgnoreCase(name)) {
			lot_mng_typ(value);
			return;
		}
		if ($sublot_mng_typ.equalsIgnoreCase(name)) {
			sublot_mng_typ(value);
			return;
		}
		if ($lot_no_typ.equalsIgnoreCase(name)) {
			lot_no_typ(value);
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
		if ($stk_mng_typ.equalsIgnoreCase(name)) {
			stk_mng_typ(value);
			return;
		}
		if ($base_unit_rnd_typ.equalsIgnoreCase(name)) {
			base_unit_rnd_typ(value);
			return;
		}
		if ($cont_fctr_rnd_typ.equalsIgnoreCase(name)) {
			cont_fctr_rnd_typ(value);
			return;
		}
		if ($trd_unit_rnd_typ.equalsIgnoreCase(name)) {
			trd_unit_rnd_typ(value);
			return;
		}
		if ($sls_act_no.equalsIgnoreCase(name)) {
			sls_act_no(value);
			return;
		}
		if ($sls_schd_no.equalsIgnoreCase(name)) {
			sls_schd_no(value);
			return;
		}
		if ($purc_schd_no.equalsIgnoreCase(name)) {
			purc_schd_no(value);
			return;
		}
		if ($arr_pr_no.equalsIgnoreCase(name)) {
			arr_pr_no(value);
			return;
		}
		if ($ship_pr_no.equalsIgnoreCase(name)) {
			ship_pr_no(value);
			return;
		}
		if ($purc_amt_rnd_typ.equalsIgnoreCase(name)) {
			purc_amt_rnd_typ(value);
			return;
		}
		if ($purc_upri_rnd_typ.equalsIgnoreCase(name)) {
			purc_upri_rnd_typ(value);
			return;
		}
		if ($purc_tax_rnd_typ.equalsIgnoreCase(name)) {
			purc_tax_rnd_typ(value);
			return;
		}
		if ($purc_trd_unit_cd.equalsIgnoreCase(name)) {
			purc_trd_unit_cd(value);
			return;
		}
		if ($init_trd_unit_cd.equalsIgnoreCase(name)) {
			init_trd_unit_cd(value);
			return;
		}
		if ($db_trd_unit_cd.equalsIgnoreCase(name)) {
			db_trd_unit_cd(value);
			return;
		}
		if ($db_trd_unit_rnd_typ.equalsIgnoreCase(name)) {
			db_trd_unit_rnd_typ(value);
			return;
		}
		if ($purc_init_trd_unit_cd.equalsIgnoreCase(name)) {
			purc_init_trd_unit_cd(value);
			return;
		}
		if ($purc_db_trd_unit_cd.equalsIgnoreCase(name)) {
			purc_db_trd_unit_cd(value);
			return;
		}
		if ($purc_db_trd_unit_rnd_typ.equalsIgnoreCase(name)) {
			purc_db_trd_unit_rnd_typ(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($prof_rate.equalsIgnoreCase(name)) {
			prof_rate(value);
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
		if ($purc_wtax_rate.equalsIgnoreCase(name)) {
			purc_wtax_rate(value);
			return;
		}
		if ($purc_wtax_amt.equalsIgnoreCase(name)) {
			purc_wtax_amt(value);
			return;
		}
		if ($base_unit_purc_schd_qty.equalsIgnoreCase(name)) {
			base_unit_purc_schd_qty(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($itm_bill_crryovr_times.equalsIgnoreCase(name)) {
			itm_bill_crryovr_times(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($cont_fctr_dec_place.equalsIgnoreCase(name)) {
			cont_fctr_dec_place(value);
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
		if ($sls_act_seq.equalsIgnoreCase(name)) {
			sls_act_seq(value);
			return;
		}
		if ($sls_act_d_seq.equalsIgnoreCase(name)) {
			sls_act_d_seq(value);
			return;
		}
		if ($dtl_row_id.equalsIgnoreCase(name)) {
			dtl_row_id(value);
			return;
		}
		if ($base_unit_upri.equalsIgnoreCase(name)) {
			base_unit_upri(value);
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
		if ($arr_pr_upd_cntr.equalsIgnoreCase(name)) {
			arr_pr_upd_cntr(value);
			return;
		}
		if ($ship_pr_upd_cntr.equalsIgnoreCase(name)) {
			ship_pr_upd_cntr(value);
			return;
		}
		if ($init_schd_amt.equalsIgnoreCase(name)) {
			init_schd_amt(value);
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
		if ($purc_schd_init_qty.equalsIgnoreCase(name)) {
			purc_schd_init_qty(value);
			return;
		}
		if ($purc_schd_init_dscnt_amt.equalsIgnoreCase(name)) {
			purc_schd_init_dscnt_amt(value);
			return;
		}
		if ($purc_schd_init_amt.equalsIgnoreCase(name)) {
			purc_schd_init_amt(value);
			return;
		}
		if ($purc_trd_cur_amt_dec_place.equalsIgnoreCase(name)) {
			purc_trd_cur_amt_dec_place(value);
			return;
		}
		if ($purc_trd_cur_upri_dec_place.equalsIgnoreCase(name)) {
			purc_trd_cur_upri_dec_place(value);
			return;
		}
		if ($purc_s_trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			purc_s_trd_unit_conv_base_qty(value);
			return;
		}
		if ($purc_s_trd_unit_conv_qty.equalsIgnoreCase(name)) {
			purc_s_trd_unit_conv_qty(value);
			return;
		}
		if ($purc_trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			purc_trd_unit_conv_base_qty(value);
			return;
		}
		if ($purc_trd_unit_conv_qty.equalsIgnoreCase(name)) {
			purc_trd_unit_conv_qty(value);
			return;
		}
		if ($purc_trd_unit_dec_place.equalsIgnoreCase(name)) {
			purc_trd_unit_dec_place(value);
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
		if ($db_trd_unit_conv_qty.equalsIgnoreCase(name)) {
			db_trd_unit_conv_qty(value);
			return;
		}
		if ($db_trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			db_trd_unit_conv_base_qty(value);
			return;
		}
		if ($db_trd_unit_dec_place.equalsIgnoreCase(name)) {
			db_trd_unit_dec_place(value);
			return;
		}
		if ($db_trd_unit_qty.equalsIgnoreCase(name)) {
			db_trd_unit_qty(value);
			return;
		}
		if ($db_trd_cur_amt.equalsIgnoreCase(name)) {
			db_trd_cur_amt(value);
			return;
		}
		if ($db_trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			db_trd_cur_dscnt_amt(value);
			return;
		}
		if ($db_trd_cur_tax_amt.equalsIgnoreCase(name)) {
			db_trd_cur_tax_amt(value);
			return;
		}
		if ($db_trd_cur_upri.equalsIgnoreCase(name)) {
			db_trd_cur_upri(value);
			return;
		}
		if ($db_wtax_rate.equalsIgnoreCase(name)) {
			db_wtax_rate(value);
			return;
		}
		if ($db_tax_rate.equalsIgnoreCase(name)) {
			db_tax_rate(value);
			return;
		}
		if ($purc_init_trd_cur_tax_amt.equalsIgnoreCase(name)) {
			purc_init_trd_cur_tax_amt(value);
			return;
		}
		if ($purc_init_trd_unit_qty.equalsIgnoreCase(name)) {
			purc_init_trd_unit_qty(value);
			return;
		}
		if ($purc_init_trd_cur_upri.equalsIgnoreCase(name)) {
			purc_init_trd_cur_upri(value);
			return;
		}
		if ($purc_init_tax_rate.equalsIgnoreCase(name)) {
			purc_init_tax_rate(value);
			return;
		}
		if ($purc_init_trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			purc_init_trd_cur_dscnt_amt(value);
			return;
		}
		if ($purc_db_trd_unit_conv_qty.equalsIgnoreCase(name)) {
			purc_db_trd_unit_conv_qty(value);
			return;
		}
		if ($purc_db_trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			purc_db_trd_unit_conv_base_qty(value);
			return;
		}
		if ($purc_db_trd_unit_dec_place.equalsIgnoreCase(name)) {
			purc_db_trd_unit_dec_place(value);
			return;
		}
		if ($purc_db_trd_unit_qty.equalsIgnoreCase(name)) {
			purc_db_trd_unit_qty(value);
			return;
		}
		if ($purc_db_trd_cur_amt.equalsIgnoreCase(name)) {
			purc_db_trd_cur_amt(value);
			return;
		}
		if ($purc_db_trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			purc_db_trd_cur_dscnt_amt(value);
			return;
		}
		if ($purc_db_trd_cur_tax_amt.equalsIgnoreCase(name)) {
			purc_db_trd_cur_tax_amt(value);
			return;
		}
		if ($purc_db_trd_cur_upri.equalsIgnoreCase(name)) {
			purc_db_trd_cur_upri(value);
			return;
		}
		if ($purc_db_tax_rate.equalsIgnoreCase(name)) {
			purc_db_tax_rate(value);
			return;
		}
		if ($purc_schd_init_ex_amt.equalsIgnoreCase(name)) {
			purc_schd_init_ex_amt(value);
			return;
		}
		if ($base_unit_qty_bef.equalsIgnoreCase(name)) {
			base_unit_qty_bef(value);
			return;
		}
		if ($base_unit_purc_qty.equalsIgnoreCase(name)) {
			base_unit_purc_qty(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($prof_rate.equalsIgnoreCase(name)) {
			prof_rate(value);
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
		if ($purc_wtax_rate.equalsIgnoreCase(name)) {
			purc_wtax_rate(value);
			return;
		}
		if ($purc_wtax_amt.equalsIgnoreCase(name)) {
			purc_wtax_amt(value);
			return;
		}
		if ($base_unit_purc_schd_qty.equalsIgnoreCase(name)) {
			base_unit_purc_schd_qty(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($itm_bill_crryovr_times.equalsIgnoreCase(name)) {
			itm_bill_crryovr_times(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($cont_fctr_dec_place.equalsIgnoreCase(name)) {
			cont_fctr_dec_place(value);
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
		if ($sls_act_seq.equalsIgnoreCase(name)) {
			sls_act_seq(value);
			return;
		}
		if ($sls_act_d_seq.equalsIgnoreCase(name)) {
			sls_act_d_seq(value);
			return;
		}
		if ($dtl_row_id.equalsIgnoreCase(name)) {
			dtl_row_id(value);
			return;
		}
		if ($base_unit_upri.equalsIgnoreCase(name)) {
			base_unit_upri(value);
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
		if ($arr_pr_upd_cntr.equalsIgnoreCase(name)) {
			arr_pr_upd_cntr(value);
			return;
		}
		if ($ship_pr_upd_cntr.equalsIgnoreCase(name)) {
			ship_pr_upd_cntr(value);
			return;
		}
		if ($init_schd_amt.equalsIgnoreCase(name)) {
			init_schd_amt(value);
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
		if ($purc_schd_init_qty.equalsIgnoreCase(name)) {
			purc_schd_init_qty(value);
			return;
		}
		if ($purc_schd_init_dscnt_amt.equalsIgnoreCase(name)) {
			purc_schd_init_dscnt_amt(value);
			return;
		}
		if ($purc_schd_init_amt.equalsIgnoreCase(name)) {
			purc_schd_init_amt(value);
			return;
		}
		if ($purc_trd_cur_amt_dec_place.equalsIgnoreCase(name)) {
			purc_trd_cur_amt_dec_place(value);
			return;
		}
		if ($purc_trd_cur_upri_dec_place.equalsIgnoreCase(name)) {
			purc_trd_cur_upri_dec_place(value);
			return;
		}
		if ($purc_s_trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			purc_s_trd_unit_conv_base_qty(value);
			return;
		}
		if ($purc_s_trd_unit_conv_qty.equalsIgnoreCase(name)) {
			purc_s_trd_unit_conv_qty(value);
			return;
		}
		if ($purc_trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			purc_trd_unit_conv_base_qty(value);
			return;
		}
		if ($purc_trd_unit_conv_qty.equalsIgnoreCase(name)) {
			purc_trd_unit_conv_qty(value);
			return;
		}
		if ($purc_trd_unit_dec_place.equalsIgnoreCase(name)) {
			purc_trd_unit_dec_place(value);
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
		if ($db_trd_unit_conv_qty.equalsIgnoreCase(name)) {
			db_trd_unit_conv_qty(value);
			return;
		}
		if ($db_trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			db_trd_unit_conv_base_qty(value);
			return;
		}
		if ($db_trd_unit_dec_place.equalsIgnoreCase(name)) {
			db_trd_unit_dec_place(value);
			return;
		}
		if ($db_trd_unit_qty.equalsIgnoreCase(name)) {
			db_trd_unit_qty(value);
			return;
		}
		if ($db_trd_cur_amt.equalsIgnoreCase(name)) {
			db_trd_cur_amt(value);
			return;
		}
		if ($db_trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			db_trd_cur_dscnt_amt(value);
			return;
		}
		if ($db_trd_cur_tax_amt.equalsIgnoreCase(name)) {
			db_trd_cur_tax_amt(value);
			return;
		}
		if ($db_trd_cur_upri.equalsIgnoreCase(name)) {
			db_trd_cur_upri(value);
			return;
		}
		if ($db_wtax_rate.equalsIgnoreCase(name)) {
			db_wtax_rate(value);
			return;
		}
		if ($db_tax_rate.equalsIgnoreCase(name)) {
			db_tax_rate(value);
			return;
		}
		if ($purc_init_trd_cur_tax_amt.equalsIgnoreCase(name)) {
			purc_init_trd_cur_tax_amt(value);
			return;
		}
		if ($purc_init_trd_unit_qty.equalsIgnoreCase(name)) {
			purc_init_trd_unit_qty(value);
			return;
		}
		if ($purc_init_trd_cur_upri.equalsIgnoreCase(name)) {
			purc_init_trd_cur_upri(value);
			return;
		}
		if ($purc_init_tax_rate.equalsIgnoreCase(name)) {
			purc_init_tax_rate(value);
			return;
		}
		if ($purc_init_trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			purc_init_trd_cur_dscnt_amt(value);
			return;
		}
		if ($purc_db_trd_unit_conv_qty.equalsIgnoreCase(name)) {
			purc_db_trd_unit_conv_qty(value);
			return;
		}
		if ($purc_db_trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			purc_db_trd_unit_conv_base_qty(value);
			return;
		}
		if ($purc_db_trd_unit_dec_place.equalsIgnoreCase(name)) {
			purc_db_trd_unit_dec_place(value);
			return;
		}
		if ($purc_db_trd_unit_qty.equalsIgnoreCase(name)) {
			purc_db_trd_unit_qty(value);
			return;
		}
		if ($purc_db_trd_cur_amt.equalsIgnoreCase(name)) {
			purc_db_trd_cur_amt(value);
			return;
		}
		if ($purc_db_trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			purc_db_trd_cur_dscnt_amt(value);
			return;
		}
		if ($purc_db_trd_cur_tax_amt.equalsIgnoreCase(name)) {
			purc_db_trd_cur_tax_amt(value);
			return;
		}
		if ($purc_db_trd_cur_upri.equalsIgnoreCase(name)) {
			purc_db_trd_cur_upri(value);
			return;
		}
		if ($purc_db_tax_rate.equalsIgnoreCase(name)) {
			purc_db_tax_rate(value);
			return;
		}
		if ($purc_schd_init_ex_amt.equalsIgnoreCase(name)) {
			purc_schd_init_ex_amt(value);
			return;
		}
		if ($base_unit_qty_bef.equalsIgnoreCase(name)) {
			base_unit_qty_bef(value);
			return;
		}
		if ($base_unit_purc_qty.equalsIgnoreCase(name)) {
			base_unit_purc_qty(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($prof_rate.equalsIgnoreCase(name)) {
			prof_rate(value);
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
		if ($purc_wtax_rate.equalsIgnoreCase(name)) {
			purc_wtax_rate(value);
			return;
		}
		if ($purc_wtax_amt.equalsIgnoreCase(name)) {
			purc_wtax_amt(value);
			return;
		}
		if ($base_unit_purc_schd_qty.equalsIgnoreCase(name)) {
			base_unit_purc_schd_qty(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($itm_bill_crryovr_times.equalsIgnoreCase(name)) {
			itm_bill_crryovr_times(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($cont_fctr_dec_place.equalsIgnoreCase(name)) {
			cont_fctr_dec_place(value);
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
		if ($sls_act_seq.equalsIgnoreCase(name)) {
			sls_act_seq(value);
			return;
		}
		if ($sls_act_d_seq.equalsIgnoreCase(name)) {
			sls_act_d_seq(value);
			return;
		}
		if ($dtl_row_id.equalsIgnoreCase(name)) {
			dtl_row_id(value);
			return;
		}
		if ($base_unit_upri.equalsIgnoreCase(name)) {
			base_unit_upri(value);
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
		if ($arr_pr_upd_cntr.equalsIgnoreCase(name)) {
			arr_pr_upd_cntr(value);
			return;
		}
		if ($ship_pr_upd_cntr.equalsIgnoreCase(name)) {
			ship_pr_upd_cntr(value);
			return;
		}
		if ($init_schd_amt.equalsIgnoreCase(name)) {
			init_schd_amt(value);
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
		if ($purc_schd_init_qty.equalsIgnoreCase(name)) {
			purc_schd_init_qty(value);
			return;
		}
		if ($purc_schd_init_dscnt_amt.equalsIgnoreCase(name)) {
			purc_schd_init_dscnt_amt(value);
			return;
		}
		if ($purc_schd_init_amt.equalsIgnoreCase(name)) {
			purc_schd_init_amt(value);
			return;
		}
		if ($purc_trd_cur_amt_dec_place.equalsIgnoreCase(name)) {
			purc_trd_cur_amt_dec_place(value);
			return;
		}
		if ($purc_trd_cur_upri_dec_place.equalsIgnoreCase(name)) {
			purc_trd_cur_upri_dec_place(value);
			return;
		}
		if ($purc_s_trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			purc_s_trd_unit_conv_base_qty(value);
			return;
		}
		if ($purc_s_trd_unit_conv_qty.equalsIgnoreCase(name)) {
			purc_s_trd_unit_conv_qty(value);
			return;
		}
		if ($purc_trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			purc_trd_unit_conv_base_qty(value);
			return;
		}
		if ($purc_trd_unit_conv_qty.equalsIgnoreCase(name)) {
			purc_trd_unit_conv_qty(value);
			return;
		}
		if ($purc_trd_unit_dec_place.equalsIgnoreCase(name)) {
			purc_trd_unit_dec_place(value);
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
		if ($db_trd_unit_conv_qty.equalsIgnoreCase(name)) {
			db_trd_unit_conv_qty(value);
			return;
		}
		if ($db_trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			db_trd_unit_conv_base_qty(value);
			return;
		}
		if ($db_trd_unit_dec_place.equalsIgnoreCase(name)) {
			db_trd_unit_dec_place(value);
			return;
		}
		if ($db_trd_unit_qty.equalsIgnoreCase(name)) {
			db_trd_unit_qty(value);
			return;
		}
		if ($db_trd_cur_amt.equalsIgnoreCase(name)) {
			db_trd_cur_amt(value);
			return;
		}
		if ($db_trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			db_trd_cur_dscnt_amt(value);
			return;
		}
		if ($db_trd_cur_tax_amt.equalsIgnoreCase(name)) {
			db_trd_cur_tax_amt(value);
			return;
		}
		if ($db_trd_cur_upri.equalsIgnoreCase(name)) {
			db_trd_cur_upri(value);
			return;
		}
		if ($db_wtax_rate.equalsIgnoreCase(name)) {
			db_wtax_rate(value);
			return;
		}
		if ($db_tax_rate.equalsIgnoreCase(name)) {
			db_tax_rate(value);
			return;
		}
		if ($purc_init_trd_cur_tax_amt.equalsIgnoreCase(name)) {
			purc_init_trd_cur_tax_amt(value);
			return;
		}
		if ($purc_init_trd_unit_qty.equalsIgnoreCase(name)) {
			purc_init_trd_unit_qty(value);
			return;
		}
		if ($purc_init_trd_cur_upri.equalsIgnoreCase(name)) {
			purc_init_trd_cur_upri(value);
			return;
		}
		if ($purc_init_tax_rate.equalsIgnoreCase(name)) {
			purc_init_tax_rate(value);
			return;
		}
		if ($purc_init_trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			purc_init_trd_cur_dscnt_amt(value);
			return;
		}
		if ($purc_db_trd_unit_conv_qty.equalsIgnoreCase(name)) {
			purc_db_trd_unit_conv_qty(value);
			return;
		}
		if ($purc_db_trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			purc_db_trd_unit_conv_base_qty(value);
			return;
		}
		if ($purc_db_trd_unit_dec_place.equalsIgnoreCase(name)) {
			purc_db_trd_unit_dec_place(value);
			return;
		}
		if ($purc_db_trd_unit_qty.equalsIgnoreCase(name)) {
			purc_db_trd_unit_qty(value);
			return;
		}
		if ($purc_db_trd_cur_amt.equalsIgnoreCase(name)) {
			purc_db_trd_cur_amt(value);
			return;
		}
		if ($purc_db_trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			purc_db_trd_cur_dscnt_amt(value);
			return;
		}
		if ($purc_db_trd_cur_tax_amt.equalsIgnoreCase(name)) {
			purc_db_trd_cur_tax_amt(value);
			return;
		}
		if ($purc_db_trd_cur_upri.equalsIgnoreCase(name)) {
			purc_db_trd_cur_upri(value);
			return;
		}
		if ($purc_db_tax_rate.equalsIgnoreCase(name)) {
			purc_db_tax_rate(value);
			return;
		}
		if ($purc_schd_init_ex_amt.equalsIgnoreCase(name)) {
			purc_schd_init_ex_amt(value);
			return;
		}
		if ($base_unit_qty_bef.equalsIgnoreCase(name)) {
			base_unit_qty_bef(value);
			return;
		}
		if ($base_unit_purc_qty.equalsIgnoreCase(name)) {
			base_unit_purc_qty(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($prof_rate.equalsIgnoreCase(name)) {
			prof_rate(value);
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
		if ($purc_wtax_rate.equalsIgnoreCase(name)) {
			purc_wtax_rate(value);
			return;
		}
		if ($purc_wtax_amt.equalsIgnoreCase(name)) {
			purc_wtax_amt(value);
			return;
		}
		if ($base_unit_purc_schd_qty.equalsIgnoreCase(name)) {
			base_unit_purc_schd_qty(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($itm_bill_crryovr_times.equalsIgnoreCase(name)) {
			itm_bill_crryovr_times(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($cont_fctr_dec_place.equalsIgnoreCase(name)) {
			cont_fctr_dec_place(value);
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
		if ($sls_act_seq.equalsIgnoreCase(name)) {
			sls_act_seq(value);
			return;
		}
		if ($sls_act_d_seq.equalsIgnoreCase(name)) {
			sls_act_d_seq(value);
			return;
		}
		if ($dtl_row_id.equalsIgnoreCase(name)) {
			dtl_row_id(value);
			return;
		}
		if ($base_unit_upri.equalsIgnoreCase(name)) {
			base_unit_upri(value);
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
		if ($arr_pr_upd_cntr.equalsIgnoreCase(name)) {
			arr_pr_upd_cntr(value);
			return;
		}
		if ($ship_pr_upd_cntr.equalsIgnoreCase(name)) {
			ship_pr_upd_cntr(value);
			return;
		}
		if ($init_schd_amt.equalsIgnoreCase(name)) {
			init_schd_amt(value);
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
		if ($purc_schd_init_qty.equalsIgnoreCase(name)) {
			purc_schd_init_qty(value);
			return;
		}
		if ($purc_schd_init_dscnt_amt.equalsIgnoreCase(name)) {
			purc_schd_init_dscnt_amt(value);
			return;
		}
		if ($purc_schd_init_amt.equalsIgnoreCase(name)) {
			purc_schd_init_amt(value);
			return;
		}
		if ($purc_trd_cur_amt_dec_place.equalsIgnoreCase(name)) {
			purc_trd_cur_amt_dec_place(value);
			return;
		}
		if ($purc_trd_cur_upri_dec_place.equalsIgnoreCase(name)) {
			purc_trd_cur_upri_dec_place(value);
			return;
		}
		if ($purc_s_trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			purc_s_trd_unit_conv_base_qty(value);
			return;
		}
		if ($purc_s_trd_unit_conv_qty.equalsIgnoreCase(name)) {
			purc_s_trd_unit_conv_qty(value);
			return;
		}
		if ($purc_trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			purc_trd_unit_conv_base_qty(value);
			return;
		}
		if ($purc_trd_unit_conv_qty.equalsIgnoreCase(name)) {
			purc_trd_unit_conv_qty(value);
			return;
		}
		if ($purc_trd_unit_dec_place.equalsIgnoreCase(name)) {
			purc_trd_unit_dec_place(value);
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
		if ($db_trd_unit_conv_qty.equalsIgnoreCase(name)) {
			db_trd_unit_conv_qty(value);
			return;
		}
		if ($db_trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			db_trd_unit_conv_base_qty(value);
			return;
		}
		if ($db_trd_unit_dec_place.equalsIgnoreCase(name)) {
			db_trd_unit_dec_place(value);
			return;
		}
		if ($db_trd_unit_qty.equalsIgnoreCase(name)) {
			db_trd_unit_qty(value);
			return;
		}
		if ($db_trd_cur_amt.equalsIgnoreCase(name)) {
			db_trd_cur_amt(value);
			return;
		}
		if ($db_trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			db_trd_cur_dscnt_amt(value);
			return;
		}
		if ($db_trd_cur_tax_amt.equalsIgnoreCase(name)) {
			db_trd_cur_tax_amt(value);
			return;
		}
		if ($db_trd_cur_upri.equalsIgnoreCase(name)) {
			db_trd_cur_upri(value);
			return;
		}
		if ($db_wtax_rate.equalsIgnoreCase(name)) {
			db_wtax_rate(value);
			return;
		}
		if ($db_tax_rate.equalsIgnoreCase(name)) {
			db_tax_rate(value);
			return;
		}
		if ($purc_init_trd_cur_tax_amt.equalsIgnoreCase(name)) {
			purc_init_trd_cur_tax_amt(value);
			return;
		}
		if ($purc_init_trd_unit_qty.equalsIgnoreCase(name)) {
			purc_init_trd_unit_qty(value);
			return;
		}
		if ($purc_init_trd_cur_upri.equalsIgnoreCase(name)) {
			purc_init_trd_cur_upri(value);
			return;
		}
		if ($purc_init_tax_rate.equalsIgnoreCase(name)) {
			purc_init_tax_rate(value);
			return;
		}
		if ($purc_init_trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			purc_init_trd_cur_dscnt_amt(value);
			return;
		}
		if ($purc_db_trd_unit_conv_qty.equalsIgnoreCase(name)) {
			purc_db_trd_unit_conv_qty(value);
			return;
		}
		if ($purc_db_trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			purc_db_trd_unit_conv_base_qty(value);
			return;
		}
		if ($purc_db_trd_unit_dec_place.equalsIgnoreCase(name)) {
			purc_db_trd_unit_dec_place(value);
			return;
		}
		if ($purc_db_trd_unit_qty.equalsIgnoreCase(name)) {
			purc_db_trd_unit_qty(value);
			return;
		}
		if ($purc_db_trd_cur_amt.equalsIgnoreCase(name)) {
			purc_db_trd_cur_amt(value);
			return;
		}
		if ($purc_db_trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			purc_db_trd_cur_dscnt_amt(value);
			return;
		}
		if ($purc_db_trd_cur_tax_amt.equalsIgnoreCase(name)) {
			purc_db_trd_cur_tax_amt(value);
			return;
		}
		if ($purc_db_trd_cur_upri.equalsIgnoreCase(name)) {
			purc_db_trd_cur_upri(value);
			return;
		}
		if ($purc_db_tax_rate.equalsIgnoreCase(name)) {
			purc_db_tax_rate(value);
			return;
		}
		if ($purc_schd_init_ex_amt.equalsIgnoreCase(name)) {
			purc_schd_init_ex_amt(value);
			return;
		}
		if ($base_unit_qty_bef.equalsIgnoreCase(name)) {
			base_unit_qty_bef(value);
			return;
		}
		if ($base_unit_purc_qty.equalsIgnoreCase(name)) {
			base_unit_purc_qty(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($prof_rate.equalsIgnoreCase(name)) {
			prof_rate(value);
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
		if ($purc_wtax_rate.equalsIgnoreCase(name)) {
			purc_wtax_rate(value);
			return;
		}
		if ($purc_wtax_amt.equalsIgnoreCase(name)) {
			purc_wtax_amt(value);
			return;
		}
		if ($base_unit_purc_schd_qty.equalsIgnoreCase(name)) {
			base_unit_purc_schd_qty(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($itm_bill_crryovr_times.equalsIgnoreCase(name)) {
			itm_bill_crryovr_times(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($cont_fctr_dec_place.equalsIgnoreCase(name)) {
			cont_fctr_dec_place(value);
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
		if ($sls_act_seq.equalsIgnoreCase(name)) {
			sls_act_seq(value);
			return;
		}
		if ($sls_act_d_seq.equalsIgnoreCase(name)) {
			sls_act_d_seq(value);
			return;
		}
		if ($dtl_row_id.equalsIgnoreCase(name)) {
			dtl_row_id(value);
			return;
		}
		if ($base_unit_upri.equalsIgnoreCase(name)) {
			base_unit_upri(value);
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
		if ($arr_pr_upd_cntr.equalsIgnoreCase(name)) {
			arr_pr_upd_cntr(value);
			return;
		}
		if ($ship_pr_upd_cntr.equalsIgnoreCase(name)) {
			ship_pr_upd_cntr(value);
			return;
		}
		if ($init_schd_amt.equalsIgnoreCase(name)) {
			init_schd_amt(value);
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
		if ($purc_schd_init_qty.equalsIgnoreCase(name)) {
			purc_schd_init_qty(value);
			return;
		}
		if ($purc_schd_init_dscnt_amt.equalsIgnoreCase(name)) {
			purc_schd_init_dscnt_amt(value);
			return;
		}
		if ($purc_schd_init_amt.equalsIgnoreCase(name)) {
			purc_schd_init_amt(value);
			return;
		}
		if ($purc_trd_cur_amt_dec_place.equalsIgnoreCase(name)) {
			purc_trd_cur_amt_dec_place(value);
			return;
		}
		if ($purc_trd_cur_upri_dec_place.equalsIgnoreCase(name)) {
			purc_trd_cur_upri_dec_place(value);
			return;
		}
		if ($purc_s_trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			purc_s_trd_unit_conv_base_qty(value);
			return;
		}
		if ($purc_s_trd_unit_conv_qty.equalsIgnoreCase(name)) {
			purc_s_trd_unit_conv_qty(value);
			return;
		}
		if ($purc_trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			purc_trd_unit_conv_base_qty(value);
			return;
		}
		if ($purc_trd_unit_conv_qty.equalsIgnoreCase(name)) {
			purc_trd_unit_conv_qty(value);
			return;
		}
		if ($purc_trd_unit_dec_place.equalsIgnoreCase(name)) {
			purc_trd_unit_dec_place(value);
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
		if ($db_trd_unit_conv_qty.equalsIgnoreCase(name)) {
			db_trd_unit_conv_qty(value);
			return;
		}
		if ($db_trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			db_trd_unit_conv_base_qty(value);
			return;
		}
		if ($db_trd_unit_dec_place.equalsIgnoreCase(name)) {
			db_trd_unit_dec_place(value);
			return;
		}
		if ($db_trd_unit_qty.equalsIgnoreCase(name)) {
			db_trd_unit_qty(value);
			return;
		}
		if ($db_trd_cur_amt.equalsIgnoreCase(name)) {
			db_trd_cur_amt(value);
			return;
		}
		if ($db_trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			db_trd_cur_dscnt_amt(value);
			return;
		}
		if ($db_trd_cur_tax_amt.equalsIgnoreCase(name)) {
			db_trd_cur_tax_amt(value);
			return;
		}
		if ($db_trd_cur_upri.equalsIgnoreCase(name)) {
			db_trd_cur_upri(value);
			return;
		}
		if ($db_wtax_rate.equalsIgnoreCase(name)) {
			db_wtax_rate(value);
			return;
		}
		if ($db_tax_rate.equalsIgnoreCase(name)) {
			db_tax_rate(value);
			return;
		}
		if ($purc_init_trd_cur_tax_amt.equalsIgnoreCase(name)) {
			purc_init_trd_cur_tax_amt(value);
			return;
		}
		if ($purc_init_trd_unit_qty.equalsIgnoreCase(name)) {
			purc_init_trd_unit_qty(value);
			return;
		}
		if ($purc_init_trd_cur_upri.equalsIgnoreCase(name)) {
			purc_init_trd_cur_upri(value);
			return;
		}
		if ($purc_init_tax_rate.equalsIgnoreCase(name)) {
			purc_init_tax_rate(value);
			return;
		}
		if ($purc_init_trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			purc_init_trd_cur_dscnt_amt(value);
			return;
		}
		if ($purc_db_trd_unit_conv_qty.equalsIgnoreCase(name)) {
			purc_db_trd_unit_conv_qty(value);
			return;
		}
		if ($purc_db_trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			purc_db_trd_unit_conv_base_qty(value);
			return;
		}
		if ($purc_db_trd_unit_dec_place.equalsIgnoreCase(name)) {
			purc_db_trd_unit_dec_place(value);
			return;
		}
		if ($purc_db_trd_unit_qty.equalsIgnoreCase(name)) {
			purc_db_trd_unit_qty(value);
			return;
		}
		if ($purc_db_trd_cur_amt.equalsIgnoreCase(name)) {
			purc_db_trd_cur_amt(value);
			return;
		}
		if ($purc_db_trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			purc_db_trd_cur_dscnt_amt(value);
			return;
		}
		if ($purc_db_trd_cur_tax_amt.equalsIgnoreCase(name)) {
			purc_db_trd_cur_tax_amt(value);
			return;
		}
		if ($purc_db_trd_cur_upri.equalsIgnoreCase(name)) {
			purc_db_trd_cur_upri(value);
			return;
		}
		if ($purc_db_tax_rate.equalsIgnoreCase(name)) {
			purc_db_tax_rate(value);
			return;
		}
		if ($purc_schd_init_ex_amt.equalsIgnoreCase(name)) {
			purc_schd_init_ex_amt(value);
			return;
		}
		if ($base_unit_qty_bef.equalsIgnoreCase(name)) {
			base_unit_qty_bef(value);
			return;
		}
		if ($base_unit_purc_qty.equalsIgnoreCase(name)) {
			base_unit_purc_qty(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($dlv_schd_dt.equalsIgnoreCase(name)) {
			dlv_schd_dt(value);
			return;
		}
		if ($purc_ac_ym.equalsIgnoreCase(name)) {
			purc_ac_ym(value);
			return;
		}
		if ($purc_ac_dt.equalsIgnoreCase(name)) {
			purc_ac_dt(value);
			return;
		}
		if ($purc_dt.equalsIgnoreCase(name)) {
			purc_dt(value);
			return;
		}
		if ($ship_fr_valid_dt.equalsIgnoreCase(name)) {
			ship_fr_valid_dt(value);
			return;
		}
		if ($ptax_dt.equalsIgnoreCase(name)) {
			ptax_dt(value);
			return;
		}
		if ($xrate_purc_dt.equalsIgnoreCase(name)) {
			xrate_purc_dt(value);
			return;
		}
		super.setDateNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($sync_flg.equalsIgnoreCase(name)) {
			sync_flg(value);
			return;
		}
		if ($abort_flg.equalsIgnoreCase(name)) {
			abort_flg(value);
			return;
		}
		if ($sundry_itm_flg.equalsIgnoreCase(name)) {
			sundry_itm_flg(value);
			return;
		}
		if ($sls_dtl_upd_flg.equalsIgnoreCase(name)) {
			sls_dtl_upd_flg(value);
			return;
		}
		if ($sppl_iv_flg.equalsIgnoreCase(name)) {
			sppl_iv_flg(value);
			return;
		}
		if ($subcon_flg.equalsIgnoreCase(name)) {
			subcon_flg(value);
			return;
		}
		if ($purc_xrate_inpt_flg.equalsIgnoreCase(name)) {
			purc_xrate_inpt_flg(value);
			return;
		}
		if ($purc_ptax_xrate_inpt_flg.equalsIgnoreCase(name)) {
			purc_ptax_xrate_inpt_flg(value);
			return;
		}
		if ($purc_dtl_upd_flg.equalsIgnoreCase(name)) {
			purc_dtl_upd_flg(value);
			return;
		}
		if ($dscnt_itm_flg.equalsIgnoreCase(name)) {
			dscnt_itm_flg(value);
			return;
		}
		if ($cont_fctr_flg.equalsIgnoreCase(name)) {
			cont_fctr_flg(value);
			return;
		}
		if ($ver_flg.equalsIgnoreCase(name)) {
			ver_flg(value);
			return;
		}
		if ($sls_acxfr_flg.equalsIgnoreCase(name)) {
			sls_acxfr_flg(value);
			return;
		}
		if ($xpns_purc_flg.equalsIgnoreCase(name)) {
			xpns_purc_flg(value);
			return;
		}
		if ($outsrc_flg.equalsIgnoreCase(name)) {
			outsrc_flg(value);
			return;
		}
		if ($arr_schd_lot_fix_flg.equalsIgnoreCase(name)) {
			arr_schd_lot_fix_flg(value);
			return;
		}
		if ($mrkt_judg_flg.equalsIgnoreCase(name)) {
			mrkt_judg_flg(value);
			return;
		}
		if ($org_sync_flg.equalsIgnoreCase(name)) {
			org_sync_flg(value);
			return;
		}
		if ($init_inc_tax_flg.equalsIgnoreCase(name)) {
			init_inc_tax_flg(value);
			return;
		}
		if ($db_inc_tax_flg.equalsIgnoreCase(name)) {
			db_inc_tax_flg(value);
			return;
		}
		if ($purc_init_inc_tax_flg.equalsIgnoreCase(name)) {
			purc_init_inc_tax_flg(value);
			return;
		}
		if ($purc_db_inc_tax_flg.equalsIgnoreCase(name)) {
			purc_db_inc_tax_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}

	public MCRow getInnerRow(String name) {
		if ($itm_p.equalsIgnoreCase(name)) {
			return itm_p();
		}
		if ($dlv_p.equalsIgnoreCase(name)) {
			return dlv_p();
		}
		if ($trd_unit_qty_p.equalsIgnoreCase(name)) {
			return trd_unit_qty_p();
		}
		if ($base_unit_qty_p.equalsIgnoreCase(name)) {
			return base_unit_qty_p();
		}
		if ($sls_schd_qty_p.equalsIgnoreCase(name)) {
			return sls_schd_qty_p();
		}
		if ($sls_qty_p.equalsIgnoreCase(name)) {
			return sls_qty_p();
		}
		if ($trd_upri_amt_p.equalsIgnoreCase(name)) {
			return trd_upri_amt_p();
		}
		if ($cost_upri_p.equalsIgnoreCase(name)) {
			return cost_upri_p();
		}
		if ($cost_amt_p.equalsIgnoreCase(name)) {
			return cost_amt_p();
		}
		if ($base_cur_upri_p.equalsIgnoreCase(name)) {
			return base_cur_upri_p();
		}
		if ($base_cur_amt_p.equalsIgnoreCase(name)) {
			return base_cur_amt_p();
		}
		if ($base_cur_inc_tax_amt_p.equalsIgnoreCase(name)) {
			return base_cur_inc_tax_amt_p();
		}
		if ($base_cur_tax_amt_p.equalsIgnoreCase(name)) {
			return base_cur_tax_amt_p();
		}
		if ($base_cur_dscnt_amt_p.equalsIgnoreCase(name)) {
			return base_cur_dscnt_amt_p();
		}
		if ($ptax_cur_upri_p.equalsIgnoreCase(name)) {
			return ptax_cur_upri_p();
		}
		if ($ptax_cur_amt_p.equalsIgnoreCase(name)) {
			return ptax_cur_amt_p();
		}
		if ($ptax_cur_inc_tax_amt_p.equalsIgnoreCase(name)) {
			return ptax_cur_inc_tax_amt_p();
		}
		if ($ptax_cur_tax_amt_p.equalsIgnoreCase(name)) {
			return ptax_cur_tax_amt_p();
		}
		if ($ptax_cur_dscnt_amt_p.equalsIgnoreCase(name)) {
			return ptax_cur_dscnt_amt_p();
		}
		if ($wtax_amt_p.equalsIgnoreCase(name)) {
			return wtax_amt_p();
		}
		if ($lot_no_p.equalsIgnoreCase(name)) {
			return lot_no_p();
		}
		if ($ver_no_p.equalsIgnoreCase(name)) {
			return ver_no_p();
		}
		if ($purc_cont_qty_p.equalsIgnoreCase(name)) {
			return purc_cont_qty_p();
		}
		if ($purc_cont_fctr_p.equalsIgnoreCase(name)) {
			return purc_cont_fctr_p();
		}
		if ($std_cont_qty_p.equalsIgnoreCase(name)) {
			return std_cont_qty_p();
		}
		if ($cont_fctr_unit_p.equalsIgnoreCase(name)) {
			return cont_fctr_unit_p();
		}
		if ($std_cont_fctr_p.equalsIgnoreCase(name)) {
			return std_cont_fctr_p();
		}
		if ($sno_wrk_no_p.equalsIgnoreCase(name)) {
			return sno_wrk_no_p();
		}
		if ($purc_xrate_p.equalsIgnoreCase(name)) {
			return purc_xrate_p();
		}
		if ($purc_ptax_xrate_p.equalsIgnoreCase(name)) {
			return purc_ptax_xrate_p();
		}
		if ($purc_trd_upri_amt_p.equalsIgnoreCase(name)) {
			return purc_trd_upri_amt_p();
		}
		if ($purc_base_cur_upri_p.equalsIgnoreCase(name)) {
			return purc_base_cur_upri_p();
		}
		if ($purc_base_cur_amt_p.equalsIgnoreCase(name)) {
			return purc_base_cur_amt_p();
		}
		if ($purc_base_cur_inc_tax_amt_p.equalsIgnoreCase(name)) {
			return purc_base_cur_inc_tax_amt_p();
		}
		if ($purc_base_cur_tax_amt_p.equalsIgnoreCase(name)) {
			return purc_base_cur_tax_amt_p();
		}
		if ($purc_base_cur_dscnt_amt_p.equalsIgnoreCase(name)) {
			return purc_base_cur_dscnt_amt_p();
		}
		if ($purc_ptax_cur_upri_p.equalsIgnoreCase(name)) {
			return purc_ptax_cur_upri_p();
		}
		if ($purc_ptax_cur_amt_p.equalsIgnoreCase(name)) {
			return purc_ptax_cur_amt_p();
		}
		if ($purc_ptax_cur_inc_tax_amt_p.equalsIgnoreCase(name)) {
			return purc_ptax_cur_inc_tax_amt_p();
		}
		if ($purc_ptax_cur_tax_amt_p.equalsIgnoreCase(name)) {
			return purc_ptax_cur_tax_amt_p();
		}
		if ($purc_ptax_cur_dscnt_amt_p.equalsIgnoreCase(name)) {
			return purc_ptax_cur_dscnt_amt_p();
		}
		if ($purc_qty_p.equalsIgnoreCase(name)) {
			return purc_qty_p();
		}
		if ($purc_trd_unit_qty_p.equalsIgnoreCase(name)) {
			return purc_trd_unit_qty_p();
		}
		if ($purc_base_unit_qty_p.equalsIgnoreCase(name)) {
			return purc_base_unit_qty_p();
		}
		return super.getInnerRow(name);
	}

	public void setInnerRow(String name, MCRow value) {
		if ($itm_p.equalsIgnoreCase(name)) {
			itm_p(
				((MCContainerMeta) itm_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5030.ItmR.class, value)
			);
			return;
		}
		if ($dlv_p.equalsIgnoreCase(name)) {
			dlv_p(
				((MCContainerMeta) dlv_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5400.DlvR.class, value)
			);
			return;
		}
		if ($trd_unit_qty_p.equalsIgnoreCase(name)) {
			trd_unit_qty_p(
				((MCContainerMeta) trd_unit_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($base_unit_qty_p.equalsIgnoreCase(name)) {
			base_unit_qty_p(
				((MCContainerMeta) base_unit_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($sls_schd_qty_p.equalsIgnoreCase(name)) {
			sls_schd_qty_p(
				((MCContainerMeta) sls_schd_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($sls_qty_p.equalsIgnoreCase(name)) {
			sls_qty_p(
				((MCContainerMeta) sls_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($trd_upri_amt_p.equalsIgnoreCase(name)) {
			trd_upri_amt_p(
				((MCContainerMeta) trd_upri_amt_p_META).castInnerRow(mcframe.clientMSUB.MSUBP5070.TrdUpriAmtR.class, value)
			);
			return;
		}
		if ($cost_upri_p.equalsIgnoreCase(name)) {
			cost_upri_p(
				((MCContainerMeta) cost_upri_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5060.UpriR.class, value)
			);
			return;
		}
		if ($cost_amt_p.equalsIgnoreCase(name)) {
			cost_amt_p(
				((MCContainerMeta) cost_amt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5050.AmtR.class, value)
			);
			return;
		}
		if ($base_cur_upri_p.equalsIgnoreCase(name)) {
			base_cur_upri_p(
				((MCContainerMeta) base_cur_upri_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5060.UpriR.class, value)
			);
			return;
		}
		if ($base_cur_amt_p.equalsIgnoreCase(name)) {
			base_cur_amt_p(
				((MCContainerMeta) base_cur_amt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5050.AmtR.class, value)
			);
			return;
		}
		if ($base_cur_inc_tax_amt_p.equalsIgnoreCase(name)) {
			base_cur_inc_tax_amt_p(
				((MCContainerMeta) base_cur_inc_tax_amt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5050.AmtR.class, value)
			);
			return;
		}
		if ($base_cur_tax_amt_p.equalsIgnoreCase(name)) {
			base_cur_tax_amt_p(
				((MCContainerMeta) base_cur_tax_amt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5050.AmtR.class, value)
			);
			return;
		}
		if ($base_cur_dscnt_amt_p.equalsIgnoreCase(name)) {
			base_cur_dscnt_amt_p(
				((MCContainerMeta) base_cur_dscnt_amt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5050.AmtR.class, value)
			);
			return;
		}
		if ($ptax_cur_upri_p.equalsIgnoreCase(name)) {
			ptax_cur_upri_p(
				((MCContainerMeta) ptax_cur_upri_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5060.UpriR.class, value)
			);
			return;
		}
		if ($ptax_cur_amt_p.equalsIgnoreCase(name)) {
			ptax_cur_amt_p(
				((MCContainerMeta) ptax_cur_amt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5050.AmtR.class, value)
			);
			return;
		}
		if ($ptax_cur_inc_tax_amt_p.equalsIgnoreCase(name)) {
			ptax_cur_inc_tax_amt_p(
				((MCContainerMeta) ptax_cur_inc_tax_amt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5050.AmtR.class, value)
			);
			return;
		}
		if ($ptax_cur_tax_amt_p.equalsIgnoreCase(name)) {
			ptax_cur_tax_amt_p(
				((MCContainerMeta) ptax_cur_tax_amt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5050.AmtR.class, value)
			);
			return;
		}
		if ($ptax_cur_dscnt_amt_p.equalsIgnoreCase(name)) {
			ptax_cur_dscnt_amt_p(
				((MCContainerMeta) ptax_cur_dscnt_amt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5050.AmtR.class, value)
			);
			return;
		}
		if ($wtax_amt_p.equalsIgnoreCase(name)) {
			wtax_amt_p(
				((MCContainerMeta) wtax_amt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5050.AmtR.class, value)
			);
			return;
		}
		if ($lot_no_p.equalsIgnoreCase(name)) {
			lot_no_p(
				((MCContainerMeta) lot_no_p_META).castInnerRow(mcframe.clientMSUB.MSUBP5030.LotNoR.class, value)
			);
			return;
		}
		if ($ver_no_p.equalsIgnoreCase(name)) {
			ver_no_p(
				((MCContainerMeta) ver_no_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5250.VerNoR.class, value)
			);
			return;
		}
		if ($purc_cont_qty_p.equalsIgnoreCase(name)) {
			purc_cont_qty_p(
				((MCContainerMeta) purc_cont_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5300.PurcContQtyR.class, value)
			);
			return;
		}
		if ($purc_cont_fctr_p.equalsIgnoreCase(name)) {
			purc_cont_fctr_p(
				((MCContainerMeta) purc_cont_fctr_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5330.PurcContFctrR.class, value)
			);
			return;
		}
		if ($std_cont_qty_p.equalsIgnoreCase(name)) {
			std_cont_qty_p(
				((MCContainerMeta) std_cont_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5260.ContQtyR.class, value)
			);
			return;
		}
		if ($cont_fctr_unit_p.equalsIgnoreCase(name)) {
			cont_fctr_unit_p(
				((MCContainerMeta) cont_fctr_unit_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5270.ContFctrUnitR.class, value)
			);
			return;
		}
		if ($std_cont_fctr_p.equalsIgnoreCase(name)) {
			std_cont_fctr_p(
				((MCContainerMeta) std_cont_fctr_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5280.StdContFctrR.class, value)
			);
			return;
		}
		if ($sno_wrk_no_p.equalsIgnoreCase(name)) {
			sno_wrk_no_p(
				((MCContainerMeta) sno_wrk_no_p_META).castInnerRow(mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.class, value)
			);
			return;
		}
		if ($purc_xrate_p.equalsIgnoreCase(name)) {
			purc_xrate_p(
				((MCContainerMeta) purc_xrate_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5390.XrateR.class, value)
			);
			return;
		}
		if ($purc_ptax_xrate_p.equalsIgnoreCase(name)) {
			purc_ptax_xrate_p(
				((MCContainerMeta) purc_ptax_xrate_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5390.XrateR.class, value)
			);
			return;
		}
		if ($purc_trd_upri_amt_p.equalsIgnoreCase(name)) {
			purc_trd_upri_amt_p(
				((MCContainerMeta) purc_trd_upri_amt_p_META).castInnerRow(mcframe.clientMSUB.MSUBP5070.TrdUpriAmtR.class, value)
			);
			return;
		}
		if ($purc_base_cur_upri_p.equalsIgnoreCase(name)) {
			purc_base_cur_upri_p(
				((MCContainerMeta) purc_base_cur_upri_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5060.UpriR.class, value)
			);
			return;
		}
		if ($purc_base_cur_amt_p.equalsIgnoreCase(name)) {
			purc_base_cur_amt_p(
				((MCContainerMeta) purc_base_cur_amt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5050.AmtR.class, value)
			);
			return;
		}
		if ($purc_base_cur_inc_tax_amt_p.equalsIgnoreCase(name)) {
			purc_base_cur_inc_tax_amt_p(
				((MCContainerMeta) purc_base_cur_inc_tax_amt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5050.AmtR.class, value)
			);
			return;
		}
		if ($purc_base_cur_tax_amt_p.equalsIgnoreCase(name)) {
			purc_base_cur_tax_amt_p(
				((MCContainerMeta) purc_base_cur_tax_amt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5050.AmtR.class, value)
			);
			return;
		}
		if ($purc_base_cur_dscnt_amt_p.equalsIgnoreCase(name)) {
			purc_base_cur_dscnt_amt_p(
				((MCContainerMeta) purc_base_cur_dscnt_amt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5050.AmtR.class, value)
			);
			return;
		}
		if ($purc_ptax_cur_upri_p.equalsIgnoreCase(name)) {
			purc_ptax_cur_upri_p(
				((MCContainerMeta) purc_ptax_cur_upri_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5060.UpriR.class, value)
			);
			return;
		}
		if ($purc_ptax_cur_amt_p.equalsIgnoreCase(name)) {
			purc_ptax_cur_amt_p(
				((MCContainerMeta) purc_ptax_cur_amt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5050.AmtR.class, value)
			);
			return;
		}
		if ($purc_ptax_cur_inc_tax_amt_p.equalsIgnoreCase(name)) {
			purc_ptax_cur_inc_tax_amt_p(
				((MCContainerMeta) purc_ptax_cur_inc_tax_amt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5050.AmtR.class, value)
			);
			return;
		}
		if ($purc_ptax_cur_tax_amt_p.equalsIgnoreCase(name)) {
			purc_ptax_cur_tax_amt_p(
				((MCContainerMeta) purc_ptax_cur_tax_amt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5050.AmtR.class, value)
			);
			return;
		}
		if ($purc_ptax_cur_dscnt_amt_p.equalsIgnoreCase(name)) {
			purc_ptax_cur_dscnt_amt_p(
				((MCContainerMeta) purc_ptax_cur_dscnt_amt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5050.AmtR.class, value)
			);
			return;
		}
		if ($purc_qty_p.equalsIgnoreCase(name)) {
			purc_qty_p(
				((MCContainerMeta) purc_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($purc_trd_unit_qty_p.equalsIgnoreCase(name)) {
			purc_trd_unit_qty_p(
				((MCContainerMeta) purc_trd_unit_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($purc_base_unit_qty_p.equalsIgnoreCase(name)) {
			purc_base_unit_qty_p(
				((MCContainerMeta) purc_base_unit_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		super.setInnerRow(name, value);
	}


	public String itm_cd() {
		return itm_p().itm_cd();
	}

	public void itm_cd(String value) {
		itm_p().itm_cd(value);
	}

	public String itm_sub1() {
		return itm_p().itm_sub1();
	}

	public void itm_sub1(String value) {
		itm_p().itm_sub1(value);
	}

	public String itm_sub2() {
		return itm_p().itm_sub2();
	}

	public void itm_sub2(String value) {
		itm_p().itm_sub2(value);
	}

	public String itm_sub3() {
		return itm_p().itm_sub3();
	}

	public void itm_sub3(String value) {
		itm_p().itm_sub3(value);
	}

	public String itm_nm() {
		return itm_p().itm_nm();
	}

	public void itm_nm(String value) {
		itm_p().itm_nm(value);
	}

	public String dlv_cd() {
		return dlv_p().bp_cd();
	}

	public void dlv_cd(String value) {
		dlv_p().bp_cd(value);
	}

	public String dlv_nm() {
		return dlv_p().bp_nm();
	}

	public void dlv_nm(String value) {
		dlv_p().bp_nm(value);
	}

	public boolean dlv_sundry_flg() {
		return dlv_p().dlv_sundry_flg();
	}

	public void dlv_sundry_flg(boolean value) {
		dlv_p().dlv_sundry_flg(value);
	}

	public String dlv_zip_cd() {
		return dlv_p().zip_cd();
	}

	public void dlv_zip_cd(String value) {
		dlv_p().zip_cd(value);
	}

	public String dlv_addr1() {
		return dlv_p().addr1();
	}

	public void dlv_addr1(String value) {
		dlv_p().addr1(value);
	}

	public String dlv_addr2() {
		return dlv_p().addr2();
	}

	public void dlv_addr2(String value) {
		dlv_p().addr2(value);
	}

	public String dlv_addr3() {
		return dlv_p().addr3();
	}

	public void dlv_addr3(String value) {
		dlv_p().addr3(value);
	}

	public String dlv_addr4() {
		return dlv_p().addr4();
	}

	public void dlv_addr4(String value) {
		dlv_p().addr4(value);
	}

	public String dlv_cntct_dpt() {
		return dlv_p().dlv_cntct_dpt();
	}

	public void dlv_cntct_dpt(String value) {
		dlv_p().dlv_cntct_dpt(value);
	}

	public String dlv_cntct_psn() {
		return dlv_p().dlv_cntct_psn();
	}

	public void dlv_cntct_psn(String value) {
		dlv_p().dlv_cntct_psn(value);
	}

	public String dlv_tel() {
		return dlv_p().tel();
	}

	public void dlv_tel(String value) {
		dlv_p().tel(value);
	}

	public String dlv_fax() {
		return dlv_p().fax();
	}

	public void dlv_fax(String value) {
		dlv_p().fax(value);
	}

	public String cntry_cd() {
		return dlv_p().cntry_cd();
	}

	public void cntry_cd(String value) {
		dlv_p().cntry_cd(value);
	}

	public String cntry_nm() {
		return dlv_p().cntry_nm();
	}

	public void cntry_nm(String value) {
		dlv_p().cntry_nm(value);
	}

	public boolean pri_prnt_flg() {
		return dlv_p().pri_prnt_flg();
	}

	public void pri_prnt_flg(boolean value) {
		dlv_p().pri_prnt_flg(value);
	}

	public String lg_grp_cd() {
		return dlv_p().lg_grp_cd();
	}

	public void lg_grp_cd(String value) {
		dlv_p().lg_grp_cd(value);
	}

	public String lg_grp_nm() {
		return dlv_p().lg_grp_nm();
	}

	public void lg_grp_nm(String value) {
		dlv_p().lg_grp_nm(value);
	}

	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public MCNumber trd_unit_qty() {
		return trd_unit_qty_p().qty();
	}

	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public void trd_unit_qty(MCNumber value) {
		trd_unit_qty_p().qty(value);
	}

	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public void trd_unit_qty(int value) {
		trd_unit_qty_p().qty(value);
	}

	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public void trd_unit_qty(long value) {
		trd_unit_qty_p().qty(value);
	}

	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public void trd_unit_qty(float value) {
		trd_unit_qty_p().qty(value);
	}

	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public void trd_unit_qty(double value) {
		trd_unit_qty_p().qty(value);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public MCNumber base_unit_qty() {
		return base_unit_qty_p().qty();
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(MCNumber value) {
		base_unit_qty_p().qty(value);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(int value) {
		base_unit_qty_p().qty(value);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(long value) {
		base_unit_qty_p().qty(value);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(float value) {
		base_unit_qty_p().qty(value);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(double value) {
		base_unit_qty_p().qty(value);
	}

	/**
	 * Sales scheduled qty. 売上予定数量.<p>
	 *
	 */
	public MCNumber sls_schd_qty() {
		return sls_schd_qty_p().qty();
	}

	/**
	 * Sales scheduled qty. 売上予定数量.<p>
	 *
	 */
	public void sls_schd_qty(MCNumber value) {
		sls_schd_qty_p().qty(value);
	}

	/**
	 * Sales scheduled qty. 売上予定数量.<p>
	 *
	 */
	public void sls_schd_qty(int value) {
		sls_schd_qty_p().qty(value);
	}

	/**
	 * Sales scheduled qty. 売上予定数量.<p>
	 *
	 */
	public void sls_schd_qty(long value) {
		sls_schd_qty_p().qty(value);
	}

	/**
	 * Sales scheduled qty. 売上予定数量.<p>
	 *
	 */
	public void sls_schd_qty(float value) {
		sls_schd_qty_p().qty(value);
	}

	/**
	 * Sales scheduled qty. 売上予定数量.<p>
	 *
	 */
	public void sls_schd_qty(double value) {
		sls_schd_qty_p().qty(value);
	}

	/**
	 * Sold qty. 売上済数量.<p>
	 *
	 */
	public MCNumber sls_qty() {
		return sls_qty_p().qty();
	}

	/**
	 * Sold qty. 売上済数量.<p>
	 *
	 */
	public void sls_qty(MCNumber value) {
		sls_qty_p().qty(value);
	}

	/**
	 * Sold qty. 売上済数量.<p>
	 *
	 */
	public void sls_qty(int value) {
		sls_qty_p().qty(value);
	}

	/**
	 * Sold qty. 売上済数量.<p>
	 *
	 */
	public void sls_qty(long value) {
		sls_qty_p().qty(value);
	}

	/**
	 * Sold qty. 売上済数量.<p>
	 *
	 */
	public void sls_qty(float value) {
		sls_qty_p().qty(value);
	}

	/**
	 * Sold qty. 売上済数量.<p>
	 *
	 */
	public void sls_qty(double value) {
		sls_qty_p().qty(value);
	}

	public boolean upri_not_tgt_flg() {
		return trd_upri_amt_p().upri_not_tgt_flg();
	}

	public void upri_not_tgt_flg(boolean value) {
		trd_upri_amt_p().upri_not_tgt_flg(value);
	}

	public MCNumber trd_cur_upri() {
		return trd_upri_amt_p().trd_cur_upri();
	}

	public void trd_cur_upri(MCNumber value) {
		trd_upri_amt_p().trd_cur_upri(value);
	}

	public void trd_cur_upri(int value) {
		trd_upri_amt_p().trd_cur_upri(value);
	}

	public void trd_cur_upri(long value) {
		trd_upri_amt_p().trd_cur_upri(value);
	}

	public void trd_cur_upri(float value) {
		trd_upri_amt_p().trd_cur_upri(value);
	}

	public void trd_cur_upri(double value) {
		trd_upri_amt_p().trd_cur_upri(value);
	}

	public boolean interim_flg() {
		return trd_upri_amt_p().interim_flg();
	}

	public void interim_flg(boolean value) {
		trd_upri_amt_p().interim_flg(value);
	}

	public MCNumber trd_cur_amt() {
		return trd_upri_amt_p().trd_cur_amt();
	}

	public void trd_cur_amt(MCNumber value) {
		trd_upri_amt_p().trd_cur_amt(value);
	}

	public void trd_cur_amt(int value) {
		trd_upri_amt_p().trd_cur_amt(value);
	}

	public void trd_cur_amt(long value) {
		trd_upri_amt_p().trd_cur_amt(value);
	}

	public void trd_cur_amt(float value) {
		trd_upri_amt_p().trd_cur_amt(value);
	}

	public void trd_cur_amt(double value) {
		trd_upri_amt_p().trd_cur_amt(value);
	}

	public MCNumber trd_cur_inc_tax_amt() {
		return trd_upri_amt_p().trd_cur_inc_tax_amt();
	}

	public void trd_cur_inc_tax_amt(MCNumber value) {
		trd_upri_amt_p().trd_cur_inc_tax_amt(value);
	}

	public void trd_cur_inc_tax_amt(int value) {
		trd_upri_amt_p().trd_cur_inc_tax_amt(value);
	}

	public void trd_cur_inc_tax_amt(long value) {
		trd_upri_amt_p().trd_cur_inc_tax_amt(value);
	}

	public void trd_cur_inc_tax_amt(float value) {
		trd_upri_amt_p().trd_cur_inc_tax_amt(value);
	}

	public void trd_cur_inc_tax_amt(double value) {
		trd_upri_amt_p().trd_cur_inc_tax_amt(value);
	}

	public boolean tax_fix_flg() {
		return trd_upri_amt_p().tax_fix_flg();
	}

	public void tax_fix_flg(boolean value) {
		trd_upri_amt_p().tax_fix_flg(value);
	}

	public String tax_cd() {
		return trd_upri_amt_p().tax_cd();
	}

	public void tax_cd(String value) {
		trd_upri_amt_p().tax_cd(value);
	}

	public String tax_nm() {
		return trd_upri_amt_p().tax_nm();
	}

	public void tax_nm(String value) {
		trd_upri_amt_p().tax_nm(value);
	}

	public MCNumber tax_rate() {
		return trd_upri_amt_p().tax_rate();
	}

	public void tax_rate(MCNumber value) {
		trd_upri_amt_p().tax_rate(value);
	}

	public void tax_rate(int value) {
		trd_upri_amt_p().tax_rate(value);
	}

	public void tax_rate(long value) {
		trd_upri_amt_p().tax_rate(value);
	}

	public void tax_rate(float value) {
		trd_upri_amt_p().tax_rate(value);
	}

	public void tax_rate(double value) {
		trd_upri_amt_p().tax_rate(value);
	}

	public String tax_typ() {
		return trd_upri_amt_p().tax_typ();
	}

	public void tax_typ(String value) {
		trd_upri_amt_p().tax_typ(value);
	}

	public boolean inc_tax_flg() {
		return trd_upri_amt_p().inc_tax_flg();
	}

	public void inc_tax_flg(boolean value) {
		trd_upri_amt_p().inc_tax_flg(value);
	}

	public MCNumber trd_cur_tax_amt() {
		return trd_upri_amt_p().trd_cur_tax_amt();
	}

	public void trd_cur_tax_amt(MCNumber value) {
		trd_upri_amt_p().trd_cur_tax_amt(value);
	}

	public void trd_cur_tax_amt(int value) {
		trd_upri_amt_p().trd_cur_tax_amt(value);
	}

	public void trd_cur_tax_amt(long value) {
		trd_upri_amt_p().trd_cur_tax_amt(value);
	}

	public void trd_cur_tax_amt(float value) {
		trd_upri_amt_p().trd_cur_tax_amt(value);
	}

	public void trd_cur_tax_amt(double value) {
		trd_upri_amt_p().trd_cur_tax_amt(value);
	}

	public MCNumber trd_cur_dscnt_amt() {
		return trd_upri_amt_p().trd_cur_dscnt_amt();
	}

	public void trd_cur_dscnt_amt(MCNumber value) {
		trd_upri_amt_p().trd_cur_dscnt_amt(value);
	}

	public void trd_cur_dscnt_amt(int value) {
		trd_upri_amt_p().trd_cur_dscnt_amt(value);
	}

	public void trd_cur_dscnt_amt(long value) {
		trd_upri_amt_p().trd_cur_dscnt_amt(value);
	}

	public void trd_cur_dscnt_amt(float value) {
		trd_upri_amt_p().trd_cur_dscnt_amt(value);
	}

	public void trd_cur_dscnt_amt(double value) {
		trd_upri_amt_p().trd_cur_dscnt_amt(value);
	}

	public String dscnt_rsn_cd() {
		return trd_upri_amt_p().dscnt_rsn_cd();
	}

	public void dscnt_rsn_cd(String value) {
		trd_upri_amt_p().dscnt_rsn_cd(value);
	}

	public String dscnt_rsn_nm() {
		return trd_upri_amt_p().dscnt_rsn_nm();
	}

	public void dscnt_rsn_nm(String value) {
		trd_upri_amt_p().dscnt_rsn_nm(value);
	}

	/**
	 * Unit cost 原価単価.<p>
	 *
	 */
	public MCNumber cost_upri() {
		return cost_upri_p().upri();
	}

	/**
	 * Unit cost 原価単価.<p>
	 *
	 */
	public void cost_upri(MCNumber value) {
		cost_upri_p().upri(value);
	}

	/**
	 * Unit cost 原価単価.<p>
	 *
	 */
	public void cost_upri(int value) {
		cost_upri_p().upri(value);
	}

	/**
	 * Unit cost 原価単価.<p>
	 *
	 */
	public void cost_upri(long value) {
		cost_upri_p().upri(value);
	}

	/**
	 * Unit cost 原価単価.<p>
	 *
	 */
	public void cost_upri(float value) {
		cost_upri_p().upri(value);
	}

	/**
	 * Unit cost 原価単価.<p>
	 *
	 */
	public void cost_upri(double value) {
		cost_upri_p().upri(value);
	}

	/**
	 * Total cost 原価金額.<p>
	 *
	 */
	public MCNumber cost_amt() {
		return cost_amt_p().amt();
	}

	/**
	 * Total cost 原価金額.<p>
	 *
	 */
	public void cost_amt(MCNumber value) {
		cost_amt_p().amt(value);
	}

	/**
	 * Total cost 原価金額.<p>
	 *
	 */
	public void cost_amt(int value) {
		cost_amt_p().amt(value);
	}

	/**
	 * Total cost 原価金額.<p>
	 *
	 */
	public void cost_amt(long value) {
		cost_amt_p().amt(value);
	}

	/**
	 * Total cost 原価金額.<p>
	 *
	 */
	public void cost_amt(float value) {
		cost_amt_p().amt(value);
	}

	/**
	 * Total cost 原価金額.<p>
	 *
	 */
	public void cost_amt(double value) {
		cost_amt_p().amt(value);
	}

	/**
	 * Unit price (Base currency) 基準通貨単価.<p>
	 *
	 */
	public MCNumber base_cur_upri() {
		return base_cur_upri_p().upri();
	}

	/**
	 * Unit price (Base currency) 基準通貨単価.<p>
	 *
	 */
	public void base_cur_upri(MCNumber value) {
		base_cur_upri_p().upri(value);
	}

	/**
	 * Unit price (Base currency) 基準通貨単価.<p>
	 *
	 */
	public void base_cur_upri(int value) {
		base_cur_upri_p().upri(value);
	}

	/**
	 * Unit price (Base currency) 基準通貨単価.<p>
	 *
	 */
	public void base_cur_upri(long value) {
		base_cur_upri_p().upri(value);
	}

	/**
	 * Unit price (Base currency) 基準通貨単価.<p>
	 *
	 */
	public void base_cur_upri(float value) {
		base_cur_upri_p().upri(value);
	}

	/**
	 * Unit price (Base currency) 基準通貨単価.<p>
	 *
	 */
	public void base_cur_upri(double value) {
		base_cur_upri_p().upri(value);
	}

	/**
	 * Amount (Base currency) 基準通貨金額.<p>
	 *
	 */
	public MCNumber base_cur_amt() {
		return base_cur_amt_p().amt();
	}

	/**
	 * Amount (Base currency) 基準通貨金額.<p>
	 *
	 */
	public void base_cur_amt(MCNumber value) {
		base_cur_amt_p().amt(value);
	}

	/**
	 * Amount (Base currency) 基準通貨金額.<p>
	 *
	 */
	public void base_cur_amt(int value) {
		base_cur_amt_p().amt(value);
	}

	/**
	 * Amount (Base currency) 基準通貨金額.<p>
	 *
	 */
	public void base_cur_amt(long value) {
		base_cur_amt_p().amt(value);
	}

	/**
	 * Amount (Base currency) 基準通貨金額.<p>
	 *
	 */
	public void base_cur_amt(float value) {
		base_cur_amt_p().amt(value);
	}

	/**
	 * Amount (Base currency) 基準通貨金額.<p>
	 *
	 */
	public void base_cur_amt(double value) {
		base_cur_amt_p().amt(value);
	}

	/**
	 * Tax included amount (Base currency) 基準通貨税込金額.<p>
	 *
	 */
	public MCNumber base_cur_inc_tax_amt() {
		return base_cur_inc_tax_amt_p().amt();
	}

	/**
	 * Tax included amount (Base currency) 基準通貨税込金額.<p>
	 *
	 */
	public void base_cur_inc_tax_amt(MCNumber value) {
		base_cur_inc_tax_amt_p().amt(value);
	}

	/**
	 * Tax included amount (Base currency) 基準通貨税込金額.<p>
	 *
	 */
	public void base_cur_inc_tax_amt(int value) {
		base_cur_inc_tax_amt_p().amt(value);
	}

	/**
	 * Tax included amount (Base currency) 基準通貨税込金額.<p>
	 *
	 */
	public void base_cur_inc_tax_amt(long value) {
		base_cur_inc_tax_amt_p().amt(value);
	}

	/**
	 * Tax included amount (Base currency) 基準通貨税込金額.<p>
	 *
	 */
	public void base_cur_inc_tax_amt(float value) {
		base_cur_inc_tax_amt_p().amt(value);
	}

	/**
	 * Tax included amount (Base currency) 基準通貨税込金額.<p>
	 *
	 */
	public void base_cur_inc_tax_amt(double value) {
		base_cur_inc_tax_amt_p().amt(value);
	}

	/**
	 * Tax amount (Base currency) 基準通貨税額.<p>
	 *
	 */
	public MCNumber base_cur_tax_amt() {
		return base_cur_tax_amt_p().amt();
	}

	/**
	 * Tax amount (Base currency) 基準通貨税額.<p>
	 *
	 */
	public void base_cur_tax_amt(MCNumber value) {
		base_cur_tax_amt_p().amt(value);
	}

	/**
	 * Tax amount (Base currency) 基準通貨税額.<p>
	 *
	 */
	public void base_cur_tax_amt(int value) {
		base_cur_tax_amt_p().amt(value);
	}

	/**
	 * Tax amount (Base currency) 基準通貨税額.<p>
	 *
	 */
	public void base_cur_tax_amt(long value) {
		base_cur_tax_amt_p().amt(value);
	}

	/**
	 * Tax amount (Base currency) 基準通貨税額.<p>
	 *
	 */
	public void base_cur_tax_amt(float value) {
		base_cur_tax_amt_p().amt(value);
	}

	/**
	 * Tax amount (Base currency) 基準通貨税額.<p>
	 *
	 */
	public void base_cur_tax_amt(double value) {
		base_cur_tax_amt_p().amt(value);
	}

	/**
	 * Discount amount (Base currency) 基準通貨値引額.<p>
	 *
	 */
	public MCNumber base_cur_dscnt_amt() {
		return base_cur_dscnt_amt_p().amt();
	}

	/**
	 * Discount amount (Base currency) 基準通貨値引額.<p>
	 *
	 */
	public void base_cur_dscnt_amt(MCNumber value) {
		base_cur_dscnt_amt_p().amt(value);
	}

	/**
	 * Discount amount (Base currency) 基準通貨値引額.<p>
	 *
	 */
	public void base_cur_dscnt_amt(int value) {
		base_cur_dscnt_amt_p().amt(value);
	}

	/**
	 * Discount amount (Base currency) 基準通貨値引額.<p>
	 *
	 */
	public void base_cur_dscnt_amt(long value) {
		base_cur_dscnt_amt_p().amt(value);
	}

	/**
	 * Discount amount (Base currency) 基準通貨値引額.<p>
	 *
	 */
	public void base_cur_dscnt_amt(float value) {
		base_cur_dscnt_amt_p().amt(value);
	}

	/**
	 * Discount amount (Base currency) 基準通貨値引額.<p>
	 *
	 */
	public void base_cur_dscnt_amt(double value) {
		base_cur_dscnt_amt_p().amt(value);
	}

	/**
	 * Unit price (Tax currency) 納税通貨単価.<p>
	 *
	 */
	public MCNumber ptax_cur_upri() {
		return ptax_cur_upri_p().upri();
	}

	/**
	 * Unit price (Tax currency) 納税通貨単価.<p>
	 *
	 */
	public void ptax_cur_upri(MCNumber value) {
		ptax_cur_upri_p().upri(value);
	}

	/**
	 * Unit price (Tax currency) 納税通貨単価.<p>
	 *
	 */
	public void ptax_cur_upri(int value) {
		ptax_cur_upri_p().upri(value);
	}

	/**
	 * Unit price (Tax currency) 納税通貨単価.<p>
	 *
	 */
	public void ptax_cur_upri(long value) {
		ptax_cur_upri_p().upri(value);
	}

	/**
	 * Unit price (Tax currency) 納税通貨単価.<p>
	 *
	 */
	public void ptax_cur_upri(float value) {
		ptax_cur_upri_p().upri(value);
	}

	/**
	 * Unit price (Tax currency) 納税通貨単価.<p>
	 *
	 */
	public void ptax_cur_upri(double value) {
		ptax_cur_upri_p().upri(value);
	}

	/**
	 * Amount (Tax currency) 納税通貨金額.<p>
	 *
	 */
	public MCNumber ptax_cur_amt() {
		return ptax_cur_amt_p().amt();
	}

	/**
	 * Amount (Tax currency) 納税通貨金額.<p>
	 *
	 */
	public void ptax_cur_amt(MCNumber value) {
		ptax_cur_amt_p().amt(value);
	}

	/**
	 * Amount (Tax currency) 納税通貨金額.<p>
	 *
	 */
	public void ptax_cur_amt(int value) {
		ptax_cur_amt_p().amt(value);
	}

	/**
	 * Amount (Tax currency) 納税通貨金額.<p>
	 *
	 */
	public void ptax_cur_amt(long value) {
		ptax_cur_amt_p().amt(value);
	}

	/**
	 * Amount (Tax currency) 納税通貨金額.<p>
	 *
	 */
	public void ptax_cur_amt(float value) {
		ptax_cur_amt_p().amt(value);
	}

	/**
	 * Amount (Tax currency) 納税通貨金額.<p>
	 *
	 */
	public void ptax_cur_amt(double value) {
		ptax_cur_amt_p().amt(value);
	}

	/**
	 * Tax included amount (Tax currency) 納税通貨税込金額.<p>
	 *
	 */
	public MCNumber ptax_cur_inc_tax_amt() {
		return ptax_cur_inc_tax_amt_p().amt();
	}

	/**
	 * Tax included amount (Tax currency) 納税通貨税込金額.<p>
	 *
	 */
	public void ptax_cur_inc_tax_amt(MCNumber value) {
		ptax_cur_inc_tax_amt_p().amt(value);
	}

	/**
	 * Tax included amount (Tax currency) 納税通貨税込金額.<p>
	 *
	 */
	public void ptax_cur_inc_tax_amt(int value) {
		ptax_cur_inc_tax_amt_p().amt(value);
	}

	/**
	 * Tax included amount (Tax currency) 納税通貨税込金額.<p>
	 *
	 */
	public void ptax_cur_inc_tax_amt(long value) {
		ptax_cur_inc_tax_amt_p().amt(value);
	}

	/**
	 * Tax included amount (Tax currency) 納税通貨税込金額.<p>
	 *
	 */
	public void ptax_cur_inc_tax_amt(float value) {
		ptax_cur_inc_tax_amt_p().amt(value);
	}

	/**
	 * Tax included amount (Tax currency) 納税通貨税込金額.<p>
	 *
	 */
	public void ptax_cur_inc_tax_amt(double value) {
		ptax_cur_inc_tax_amt_p().amt(value);
	}

	/**
	 * Tax amount (Tax currency) 納税通貨税額.<p>
	 *
	 */
	public MCNumber ptax_cur_tax_amt() {
		return ptax_cur_tax_amt_p().amt();
	}

	/**
	 * Tax amount (Tax currency) 納税通貨税額.<p>
	 *
	 */
	public void ptax_cur_tax_amt(MCNumber value) {
		ptax_cur_tax_amt_p().amt(value);
	}

	/**
	 * Tax amount (Tax currency) 納税通貨税額.<p>
	 *
	 */
	public void ptax_cur_tax_amt(int value) {
		ptax_cur_tax_amt_p().amt(value);
	}

	/**
	 * Tax amount (Tax currency) 納税通貨税額.<p>
	 *
	 */
	public void ptax_cur_tax_amt(long value) {
		ptax_cur_tax_amt_p().amt(value);
	}

	/**
	 * Tax amount (Tax currency) 納税通貨税額.<p>
	 *
	 */
	public void ptax_cur_tax_amt(float value) {
		ptax_cur_tax_amt_p().amt(value);
	}

	/**
	 * Tax amount (Tax currency) 納税通貨税額.<p>
	 *
	 */
	public void ptax_cur_tax_amt(double value) {
		ptax_cur_tax_amt_p().amt(value);
	}

	/**
	 * Discount amount (Tax currency) 納税通貨値引額.<p>
	 *
	 */
	public MCNumber ptax_cur_dscnt_amt() {
		return ptax_cur_dscnt_amt_p().amt();
	}

	/**
	 * Discount amount (Tax currency) 納税通貨値引額.<p>
	 *
	 */
	public void ptax_cur_dscnt_amt(MCNumber value) {
		ptax_cur_dscnt_amt_p().amt(value);
	}

	/**
	 * Discount amount (Tax currency) 納税通貨値引額.<p>
	 *
	 */
	public void ptax_cur_dscnt_amt(int value) {
		ptax_cur_dscnt_amt_p().amt(value);
	}

	/**
	 * Discount amount (Tax currency) 納税通貨値引額.<p>
	 *
	 */
	public void ptax_cur_dscnt_amt(long value) {
		ptax_cur_dscnt_amt_p().amt(value);
	}

	/**
	 * Discount amount (Tax currency) 納税通貨値引額.<p>
	 *
	 */
	public void ptax_cur_dscnt_amt(float value) {
		ptax_cur_dscnt_amt_p().amt(value);
	}

	/**
	 * Discount amount (Tax currency) 納税通貨値引額.<p>
	 *
	 */
	public void ptax_cur_dscnt_amt(double value) {
		ptax_cur_dscnt_amt_p().amt(value);
	}

	/**
	 * Withholding tax 源泉税額.<p>
	 *
	 */
	public MCNumber wtax_amt() {
		return wtax_amt_p().amt();
	}

	/**
	 * Withholding tax 源泉税額.<p>
	 *
	 */
	public void wtax_amt(MCNumber value) {
		wtax_amt_p().amt(value);
	}

	/**
	 * Withholding tax 源泉税額.<p>
	 *
	 */
	public void wtax_amt(int value) {
		wtax_amt_p().amt(value);
	}

	/**
	 * Withholding tax 源泉税額.<p>
	 *
	 */
	public void wtax_amt(long value) {
		wtax_amt_p().amt(value);
	}

	/**
	 * Withholding tax 源泉税額.<p>
	 *
	 */
	public void wtax_amt(float value) {
		wtax_amt_p().amt(value);
	}

	/**
	 * Withholding tax 源泉税額.<p>
	 *
	 */
	public void wtax_amt(double value) {
		wtax_amt_p().amt(value);
	}

	public boolean crt_lot_flg() {
		return lot_no_p().crt_lot_flg();
	}

	public void crt_lot_flg(boolean value) {
		lot_no_p().crt_lot_flg(value);
	}

	public String lot_no() {
		return lot_no_p().lot_no();
	}

	public void lot_no(String value) {
		lot_no_p().lot_no(value);
	}

	public String sublot_no() {
		return lot_no_p().sublot_no();
	}

	public void sublot_no(String value) {
		lot_no_p().sublot_no(value);
	}

	public String ver_no() {
		return ver_no_p().ver_no();
	}

	public void ver_no(String value) {
		ver_no_p().ver_no(value);
	}

	public MCNumber purc_cont_qty() {
		return purc_cont_qty_p().purc_cont_qty();
	}

	public void purc_cont_qty(MCNumber value) {
		purc_cont_qty_p().purc_cont_qty(value);
	}

	public void purc_cont_qty(int value) {
		purc_cont_qty_p().purc_cont_qty(value);
	}

	public void purc_cont_qty(long value) {
		purc_cont_qty_p().purc_cont_qty(value);
	}

	public void purc_cont_qty(float value) {
		purc_cont_qty_p().purc_cont_qty(value);
	}

	public void purc_cont_qty(double value) {
		purc_cont_qty_p().purc_cont_qty(value);
	}

	public MCNumber purc_cont_fctr() {
		return purc_cont_fctr_p().purc_cont_fctr();
	}

	public void purc_cont_fctr(MCNumber value) {
		purc_cont_fctr_p().purc_cont_fctr(value);
	}

	public void purc_cont_fctr(int value) {
		purc_cont_fctr_p().purc_cont_fctr(value);
	}

	public void purc_cont_fctr(long value) {
		purc_cont_fctr_p().purc_cont_fctr(value);
	}

	public void purc_cont_fctr(float value) {
		purc_cont_fctr_p().purc_cont_fctr(value);
	}

	public void purc_cont_fctr(double value) {
		purc_cont_fctr_p().purc_cont_fctr(value);
	}

	/**
	 * Standard active ingredient 標準有効成分.<p>
	 *
	 */
	public MCNumber std_cont_qty() {
		return std_cont_qty_p().cont_qty();
	}

	/**
	 * Standard active ingredient 標準有効成分.<p>
	 *
	 */
	public void std_cont_qty(MCNumber value) {
		std_cont_qty_p().cont_qty(value);
	}

	/**
	 * Standard active ingredient 標準有効成分.<p>
	 *
	 */
	public void std_cont_qty(int value) {
		std_cont_qty_p().cont_qty(value);
	}

	/**
	 * Standard active ingredient 標準有効成分.<p>
	 *
	 */
	public void std_cont_qty(long value) {
		std_cont_qty_p().cont_qty(value);
	}

	/**
	 * Standard active ingredient 標準有効成分.<p>
	 *
	 */
	public void std_cont_qty(float value) {
		std_cont_qty_p().cont_qty(value);
	}

	/**
	 * Standard active ingredient 標準有効成分.<p>
	 *
	 */
	public void std_cont_qty(double value) {
		std_cont_qty_p().cont_qty(value);
	}

	/**
	 * Active ingredient unit cd. 有効成分単位ＣＤ.<p>
	 *
	 */
	public String cont_fctr_unit_cd() {
		return cont_fctr_unit_p().cont_fctr_unit_cd();
	}

	/**
	 * Active ingredient unit cd. 有効成分単位ＣＤ.<p>
	 *
	 */
	public void cont_fctr_unit_cd(String value) {
		cont_fctr_unit_p().cont_fctr_unit_cd(value);
	}

	/**
	 * Active ingredient unit name 有効成分単位名.<p>
	 *
	 */
	public String cont_fctr_unit_nm() {
		return cont_fctr_unit_p().cont_fctr_unit_nm();
	}

	/**
	 * Active ingredient unit name 有効成分単位名.<p>
	 *
	 */
	public void cont_fctr_unit_nm(String value) {
		cont_fctr_unit_p().cont_fctr_unit_nm(value);
	}

	public MCNumber std_cont_fctr() {
		return std_cont_fctr_p().std_cont_fctr();
	}

	public void std_cont_fctr(MCNumber value) {
		std_cont_fctr_p().std_cont_fctr(value);
	}

	public void std_cont_fctr(int value) {
		std_cont_fctr_p().std_cont_fctr(value);
	}

	public void std_cont_fctr(long value) {
		std_cont_fctr_p().std_cont_fctr(value);
	}

	public void std_cont_fctr(float value) {
		std_cont_fctr_p().std_cont_fctr(value);
	}

	public void std_cont_fctr(double value) {
		std_cont_fctr_p().std_cont_fctr(value);
	}

	public String sno1() {
		return sno_wrk_no_p().sno1();
	}

	public void sno1(String value) {
		sno_wrk_no_p().sno1(value);
	}

	public String sno2() {
		return sno_wrk_no_p().sno2();
	}

	public void sno2(String value) {
		sno_wrk_no_p().sno2(value);
	}

	public String sno3() {
		return sno_wrk_no_p().sno3();
	}

	public void sno3(String value) {
		sno_wrk_no_p().sno3(value);
	}

	public String sno4() {
		return sno_wrk_no_p().sno4();
	}

	public void sno4(String value) {
		sno_wrk_no_p().sno4(value);
	}

	public String wrk_no() {
		return sno_wrk_no_p().wrk_no();
	}

	public void wrk_no(String value) {
		sno_wrk_no_p().wrk_no(value);
	}

	public String wrk_nm() {
		return sno_wrk_no_p().wrk_nm();
	}

	public void wrk_nm(String value) {
		sno_wrk_no_p().wrk_nm(value);
	}

	/**
	 * Purchase exchange rate 仕入為替レート.<p>
	 *
	 */
	public MCNumber purc_xrate() {
		return purc_xrate_p().xrate();
	}

	/**
	 * Purchase exchange rate 仕入為替レート.<p>
	 *
	 */
	public void purc_xrate(MCNumber value) {
		purc_xrate_p().xrate(value);
	}

	/**
	 * Purchase exchange rate 仕入為替レート.<p>
	 *
	 */
	public void purc_xrate(int value) {
		purc_xrate_p().xrate(value);
	}

	/**
	 * Purchase exchange rate 仕入為替レート.<p>
	 *
	 */
	public void purc_xrate(long value) {
		purc_xrate_p().xrate(value);
	}

	/**
	 * Purchase exchange rate 仕入為替レート.<p>
	 *
	 */
	public void purc_xrate(float value) {
		purc_xrate_p().xrate(value);
	}

	/**
	 * Purchase exchange rate 仕入為替レート.<p>
	 *
	 */
	public void purc_xrate(double value) {
		purc_xrate_p().xrate(value);
	}

	/**
	 * Purchase tax exchange rate 仕入納税為替レート.<p>
	 *
	 */
	public MCNumber purc_ptax_xrate() {
		return purc_ptax_xrate_p().xrate();
	}

	/**
	 * Purchase tax exchange rate 仕入納税為替レート.<p>
	 *
	 */
	public void purc_ptax_xrate(MCNumber value) {
		purc_ptax_xrate_p().xrate(value);
	}

	/**
	 * Purchase tax exchange rate 仕入納税為替レート.<p>
	 *
	 */
	public void purc_ptax_xrate(int value) {
		purc_ptax_xrate_p().xrate(value);
	}

	/**
	 * Purchase tax exchange rate 仕入納税為替レート.<p>
	 *
	 */
	public void purc_ptax_xrate(long value) {
		purc_ptax_xrate_p().xrate(value);
	}

	/**
	 * Purchase tax exchange rate 仕入納税為替レート.<p>
	 *
	 */
	public void purc_ptax_xrate(float value) {
		purc_ptax_xrate_p().xrate(value);
	}

	/**
	 * Purchase tax exchange rate 仕入納税為替レート.<p>
	 *
	 */
	public void purc_ptax_xrate(double value) {
		purc_ptax_xrate_p().xrate(value);
	}

	/**
	 * Not for purchase unit price acquisition 仕入単価取得対象外.<p>
	 *
	 */
	public boolean purc_upri_not_tgt_flg() {
		return purc_trd_upri_amt_p().upri_not_tgt_flg();
	}

	/**
	 * Not for purchase unit price acquisition 仕入単価取得対象外.<p>
	 *
	 */
	public void purc_upri_not_tgt_flg(boolean value) {
		purc_trd_upri_amt_p().upri_not_tgt_flg(value);
	}

	/**
	 * Purchase transaction currency unit price 仕入取引通貨単価.<p>
	 *
	 */
	public MCNumber purc_trd_cur_upri() {
		return purc_trd_upri_amt_p().trd_cur_upri();
	}

	/**
	 * Purchase transaction currency unit price 仕入取引通貨単価.<p>
	 *
	 */
	public void purc_trd_cur_upri(MCNumber value) {
		purc_trd_upri_amt_p().trd_cur_upri(value);
	}

	/**
	 * Purchase transaction currency unit price 仕入取引通貨単価.<p>
	 *
	 */
	public void purc_trd_cur_upri(int value) {
		purc_trd_upri_amt_p().trd_cur_upri(value);
	}

	/**
	 * Purchase transaction currency unit price 仕入取引通貨単価.<p>
	 *
	 */
	public void purc_trd_cur_upri(long value) {
		purc_trd_upri_amt_p().trd_cur_upri(value);
	}

	/**
	 * Purchase transaction currency unit price 仕入取引通貨単価.<p>
	 *
	 */
	public void purc_trd_cur_upri(float value) {
		purc_trd_upri_amt_p().trd_cur_upri(value);
	}

	/**
	 * Purchase transaction currency unit price 仕入取引通貨単価.<p>
	 *
	 */
	public void purc_trd_cur_upri(double value) {
		purc_trd_upri_amt_p().trd_cur_upri(value);
	}

	/**
	 * Purchase temporary unit price 仕入仮単価.<p>
	 *
	 */
	public boolean purc_interim_flg() {
		return purc_trd_upri_amt_p().interim_flg();
	}

	/**
	 * Purchase temporary unit price 仕入仮単価.<p>
	 *
	 */
	public void purc_interim_flg(boolean value) {
		purc_trd_upri_amt_p().interim_flg(value);
	}

	/**
	 * Purchase transaction currency amount 仕入取引通貨金額.<p>
	 *
	 */
	public MCNumber purc_trd_cur_amt() {
		return purc_trd_upri_amt_p().trd_cur_amt();
	}

	/**
	 * Purchase transaction currency amount 仕入取引通貨金額.<p>
	 *
	 */
	public void purc_trd_cur_amt(MCNumber value) {
		purc_trd_upri_amt_p().trd_cur_amt(value);
	}

	/**
	 * Purchase transaction currency amount 仕入取引通貨金額.<p>
	 *
	 */
	public void purc_trd_cur_amt(int value) {
		purc_trd_upri_amt_p().trd_cur_amt(value);
	}

	/**
	 * Purchase transaction currency amount 仕入取引通貨金額.<p>
	 *
	 */
	public void purc_trd_cur_amt(long value) {
		purc_trd_upri_amt_p().trd_cur_amt(value);
	}

	/**
	 * Purchase transaction currency amount 仕入取引通貨金額.<p>
	 *
	 */
	public void purc_trd_cur_amt(float value) {
		purc_trd_upri_amt_p().trd_cur_amt(value);
	}

	/**
	 * Purchase transaction currency amount 仕入取引通貨金額.<p>
	 *
	 */
	public void purc_trd_cur_amt(double value) {
		purc_trd_upri_amt_p().trd_cur_amt(value);
	}

	/**
	 * Tax included purchase amount (Transaction currency) 仕入取引通貨税込金額.<p>
	 *
	 */
	public MCNumber purc_trd_cur_inc_tax_amt() {
		return purc_trd_upri_amt_p().trd_cur_inc_tax_amt();
	}

	/**
	 * Tax included purchase amount (Transaction currency) 仕入取引通貨税込金額.<p>
	 *
	 */
	public void purc_trd_cur_inc_tax_amt(MCNumber value) {
		purc_trd_upri_amt_p().trd_cur_inc_tax_amt(value);
	}

	/**
	 * Tax included purchase amount (Transaction currency) 仕入取引通貨税込金額.<p>
	 *
	 */
	public void purc_trd_cur_inc_tax_amt(int value) {
		purc_trd_upri_amt_p().trd_cur_inc_tax_amt(value);
	}

	/**
	 * Tax included purchase amount (Transaction currency) 仕入取引通貨税込金額.<p>
	 *
	 */
	public void purc_trd_cur_inc_tax_amt(long value) {
		purc_trd_upri_amt_p().trd_cur_inc_tax_amt(value);
	}

	/**
	 * Tax included purchase amount (Transaction currency) 仕入取引通貨税込金額.<p>
	 *
	 */
	public void purc_trd_cur_inc_tax_amt(float value) {
		purc_trd_upri_amt_p().trd_cur_inc_tax_amt(value);
	}

	/**
	 * Tax included purchase amount (Transaction currency) 仕入取引通貨税込金額.<p>
	 *
	 */
	public void purc_trd_cur_inc_tax_amt(double value) {
		purc_trd_upri_amt_p().trd_cur_inc_tax_amt(value);
	}

	/**
	 * Specify purchase tax 仕入税指定.<p>
	 *
	 */
	public boolean purc_tax_fix_flg() {
		return purc_trd_upri_amt_p().tax_fix_flg();
	}

	/**
	 * Specify purchase tax 仕入税指定.<p>
	 *
	 */
	public void purc_tax_fix_flg(boolean value) {
		purc_trd_upri_amt_p().tax_fix_flg(value);
	}

	/**
	 * Purchase tax cd. 仕入税ＣＤ.<p>
	 *
	 */
	public String purc_tax_cd() {
		return purc_trd_upri_amt_p().tax_cd();
	}

	/**
	 * Purchase tax cd. 仕入税ＣＤ.<p>
	 *
	 */
	public void purc_tax_cd(String value) {
		purc_trd_upri_amt_p().tax_cd(value);
	}

	/**
	 * Purchase tax type name 仕入税名.<p>
	 *
	 */
	public String purc_tax_nm() {
		return purc_trd_upri_amt_p().tax_nm();
	}

	/**
	 * Purchase tax type name 仕入税名.<p>
	 *
	 */
	public void purc_tax_nm(String value) {
		purc_trd_upri_amt_p().tax_nm(value);
	}

	/**
	 * Purchase tax rate 仕入税率.<p>
	 *
	 */
	public MCNumber purc_tax_rate() {
		return purc_trd_upri_amt_p().tax_rate();
	}

	/**
	 * Purchase tax rate 仕入税率.<p>
	 *
	 */
	public void purc_tax_rate(MCNumber value) {
		purc_trd_upri_amt_p().tax_rate(value);
	}

	/**
	 * Purchase tax rate 仕入税率.<p>
	 *
	 */
	public void purc_tax_rate(int value) {
		purc_trd_upri_amt_p().tax_rate(value);
	}

	/**
	 * Purchase tax rate 仕入税率.<p>
	 *
	 */
	public void purc_tax_rate(long value) {
		purc_trd_upri_amt_p().tax_rate(value);
	}

	/**
	 * Purchase tax rate 仕入税率.<p>
	 *
	 */
	public void purc_tax_rate(float value) {
		purc_trd_upri_amt_p().tax_rate(value);
	}

	/**
	 * Purchase tax rate 仕入税率.<p>
	 *
	 */
	public void purc_tax_rate(double value) {
		purc_trd_upri_amt_p().tax_rate(value);
	}

	/**
	 * Purchase tax type 仕入税区分.<p>
	 *
	 */
	public String purc_tax_typ() {
		return purc_trd_upri_amt_p().tax_typ();
	}

	/**
	 * Purchase tax type 仕入税区分.<p>
	 *
	 */
	public void purc_tax_typ(String value) {
		purc_trd_upri_amt_p().tax_typ(value);
	}

	/**
	 * Purchase tax inclusive 仕入内税.<p>
	 *
	 */
	public boolean purc_inc_tax_flg() {
		return purc_trd_upri_amt_p().inc_tax_flg();
	}

	/**
	 * Purchase tax inclusive 仕入内税.<p>
	 *
	 */
	public void purc_inc_tax_flg(boolean value) {
		purc_trd_upri_amt_p().inc_tax_flg(value);
	}

	/**
	 * Purchase transaction currency tax amount 仕入取引通貨税額.<p>
	 *
	 */
	public MCNumber purc_trd_cur_tax_amt() {
		return purc_trd_upri_amt_p().trd_cur_tax_amt();
	}

	/**
	 * Purchase transaction currency tax amount 仕入取引通貨税額.<p>
	 *
	 */
	public void purc_trd_cur_tax_amt(MCNumber value) {
		purc_trd_upri_amt_p().trd_cur_tax_amt(value);
	}

	/**
	 * Purchase transaction currency tax amount 仕入取引通貨税額.<p>
	 *
	 */
	public void purc_trd_cur_tax_amt(int value) {
		purc_trd_upri_amt_p().trd_cur_tax_amt(value);
	}

	/**
	 * Purchase transaction currency tax amount 仕入取引通貨税額.<p>
	 *
	 */
	public void purc_trd_cur_tax_amt(long value) {
		purc_trd_upri_amt_p().trd_cur_tax_amt(value);
	}

	/**
	 * Purchase transaction currency tax amount 仕入取引通貨税額.<p>
	 *
	 */
	public void purc_trd_cur_tax_amt(float value) {
		purc_trd_upri_amt_p().trd_cur_tax_amt(value);
	}

	/**
	 * Purchase transaction currency tax amount 仕入取引通貨税額.<p>
	 *
	 */
	public void purc_trd_cur_tax_amt(double value) {
		purc_trd_upri_amt_p().trd_cur_tax_amt(value);
	}

	/**
	 * Purchase transaction currency discount amount 仕入取引通貨値引額.<p>
	 *
	 */
	public MCNumber purc_trd_cur_dscnt_amt() {
		return purc_trd_upri_amt_p().trd_cur_dscnt_amt();
	}

	/**
	 * Purchase transaction currency discount amount 仕入取引通貨値引額.<p>
	 *
	 */
	public void purc_trd_cur_dscnt_amt(MCNumber value) {
		purc_trd_upri_amt_p().trd_cur_dscnt_amt(value);
	}

	/**
	 * Purchase transaction currency discount amount 仕入取引通貨値引額.<p>
	 *
	 */
	public void purc_trd_cur_dscnt_amt(int value) {
		purc_trd_upri_amt_p().trd_cur_dscnt_amt(value);
	}

	/**
	 * Purchase transaction currency discount amount 仕入取引通貨値引額.<p>
	 *
	 */
	public void purc_trd_cur_dscnt_amt(long value) {
		purc_trd_upri_amt_p().trd_cur_dscnt_amt(value);
	}

	/**
	 * Purchase transaction currency discount amount 仕入取引通貨値引額.<p>
	 *
	 */
	public void purc_trd_cur_dscnt_amt(float value) {
		purc_trd_upri_amt_p().trd_cur_dscnt_amt(value);
	}

	/**
	 * Purchase transaction currency discount amount 仕入取引通貨値引額.<p>
	 *
	 */
	public void purc_trd_cur_dscnt_amt(double value) {
		purc_trd_upri_amt_p().trd_cur_dscnt_amt(value);
	}

	/**
	 * Purchase discount reason cd. 仕入値引理由ＣＤ.<p>
	 *
	 */
	public String purc_dscnt_rsn_cd() {
		return purc_trd_upri_amt_p().dscnt_rsn_cd();
	}

	/**
	 * Purchase discount reason cd. 仕入値引理由ＣＤ.<p>
	 *
	 */
	public void purc_dscnt_rsn_cd(String value) {
		purc_trd_upri_amt_p().dscnt_rsn_cd(value);
	}

	/**
	 * Purchase discount reason name 仕入値引理由名.<p>
	 *
	 */
	public String purc_dscnt_rsn_nm() {
		return purc_trd_upri_amt_p().dscnt_rsn_nm();
	}

	/**
	 * Purchase discount reason name 仕入値引理由名.<p>
	 *
	 */
	public void purc_dscnt_rsn_nm(String value) {
		purc_trd_upri_amt_p().dscnt_rsn_nm(value);
	}

	/**
	 * Purchase unit price (Base currency) 仕入基準通貨単価.<p>
	 *
	 */
	public MCNumber purc_base_cur_upri() {
		return purc_base_cur_upri_p().upri();
	}

	/**
	 * Purchase unit price (Base currency) 仕入基準通貨単価.<p>
	 *
	 */
	public void purc_base_cur_upri(MCNumber value) {
		purc_base_cur_upri_p().upri(value);
	}

	/**
	 * Purchase unit price (Base currency) 仕入基準通貨単価.<p>
	 *
	 */
	public void purc_base_cur_upri(int value) {
		purc_base_cur_upri_p().upri(value);
	}

	/**
	 * Purchase unit price (Base currency) 仕入基準通貨単価.<p>
	 *
	 */
	public void purc_base_cur_upri(long value) {
		purc_base_cur_upri_p().upri(value);
	}

	/**
	 * Purchase unit price (Base currency) 仕入基準通貨単価.<p>
	 *
	 */
	public void purc_base_cur_upri(float value) {
		purc_base_cur_upri_p().upri(value);
	}

	/**
	 * Purchase unit price (Base currency) 仕入基準通貨単価.<p>
	 *
	 */
	public void purc_base_cur_upri(double value) {
		purc_base_cur_upri_p().upri(value);
	}

	/**
	 * Purchase amount (Base currency) 仕入基準通貨金額.<p>
	 *
	 */
	public MCNumber purc_base_cur_amt() {
		return purc_base_cur_amt_p().amt();
	}

	/**
	 * Purchase amount (Base currency) 仕入基準通貨金額.<p>
	 *
	 */
	public void purc_base_cur_amt(MCNumber value) {
		purc_base_cur_amt_p().amt(value);
	}

	/**
	 * Purchase amount (Base currency) 仕入基準通貨金額.<p>
	 *
	 */
	public void purc_base_cur_amt(int value) {
		purc_base_cur_amt_p().amt(value);
	}

	/**
	 * Purchase amount (Base currency) 仕入基準通貨金額.<p>
	 *
	 */
	public void purc_base_cur_amt(long value) {
		purc_base_cur_amt_p().amt(value);
	}

	/**
	 * Purchase amount (Base currency) 仕入基準通貨金額.<p>
	 *
	 */
	public void purc_base_cur_amt(float value) {
		purc_base_cur_amt_p().amt(value);
	}

	/**
	 * Purchase amount (Base currency) 仕入基準通貨金額.<p>
	 *
	 */
	public void purc_base_cur_amt(double value) {
		purc_base_cur_amt_p().amt(value);
	}

	/**
	 * Tax included purchase amount (Base currency) 仕入基準通貨税込金額.<p>
	 *
	 */
	public MCNumber purc_base_cur_inc_tax_amt() {
		return purc_base_cur_inc_tax_amt_p().amt();
	}

	/**
	 * Tax included purchase amount (Base currency) 仕入基準通貨税込金額.<p>
	 *
	 */
	public void purc_base_cur_inc_tax_amt(MCNumber value) {
		purc_base_cur_inc_tax_amt_p().amt(value);
	}

	/**
	 * Tax included purchase amount (Base currency) 仕入基準通貨税込金額.<p>
	 *
	 */
	public void purc_base_cur_inc_tax_amt(int value) {
		purc_base_cur_inc_tax_amt_p().amt(value);
	}

	/**
	 * Tax included purchase amount (Base currency) 仕入基準通貨税込金額.<p>
	 *
	 */
	public void purc_base_cur_inc_tax_amt(long value) {
		purc_base_cur_inc_tax_amt_p().amt(value);
	}

	/**
	 * Tax included purchase amount (Base currency) 仕入基準通貨税込金額.<p>
	 *
	 */
	public void purc_base_cur_inc_tax_amt(float value) {
		purc_base_cur_inc_tax_amt_p().amt(value);
	}

	/**
	 * Tax included purchase amount (Base currency) 仕入基準通貨税込金額.<p>
	 *
	 */
	public void purc_base_cur_inc_tax_amt(double value) {
		purc_base_cur_inc_tax_amt_p().amt(value);
	}

	/**
	 * Purchase tax amount (Base currency) 仕入基準通貨税額.<p>
	 *
	 */
	public MCNumber purc_base_cur_tax_amt() {
		return purc_base_cur_tax_amt_p().amt();
	}

	/**
	 * Purchase tax amount (Base currency) 仕入基準通貨税額.<p>
	 *
	 */
	public void purc_base_cur_tax_amt(MCNumber value) {
		purc_base_cur_tax_amt_p().amt(value);
	}

	/**
	 * Purchase tax amount (Base currency) 仕入基準通貨税額.<p>
	 *
	 */
	public void purc_base_cur_tax_amt(int value) {
		purc_base_cur_tax_amt_p().amt(value);
	}

	/**
	 * Purchase tax amount (Base currency) 仕入基準通貨税額.<p>
	 *
	 */
	public void purc_base_cur_tax_amt(long value) {
		purc_base_cur_tax_amt_p().amt(value);
	}

	/**
	 * Purchase tax amount (Base currency) 仕入基準通貨税額.<p>
	 *
	 */
	public void purc_base_cur_tax_amt(float value) {
		purc_base_cur_tax_amt_p().amt(value);
	}

	/**
	 * Purchase tax amount (Base currency) 仕入基準通貨税額.<p>
	 *
	 */
	public void purc_base_cur_tax_amt(double value) {
		purc_base_cur_tax_amt_p().amt(value);
	}

	/**
	 * Purchase discount amount (Base currency) 仕入基準通貨値引額.<p>
	 *
	 */
	public MCNumber purc_base_cur_dscnt_amt() {
		return purc_base_cur_dscnt_amt_p().amt();
	}

	/**
	 * Purchase discount amount (Base currency) 仕入基準通貨値引額.<p>
	 *
	 */
	public void purc_base_cur_dscnt_amt(MCNumber value) {
		purc_base_cur_dscnt_amt_p().amt(value);
	}

	/**
	 * Purchase discount amount (Base currency) 仕入基準通貨値引額.<p>
	 *
	 */
	public void purc_base_cur_dscnt_amt(int value) {
		purc_base_cur_dscnt_amt_p().amt(value);
	}

	/**
	 * Purchase discount amount (Base currency) 仕入基準通貨値引額.<p>
	 *
	 */
	public void purc_base_cur_dscnt_amt(long value) {
		purc_base_cur_dscnt_amt_p().amt(value);
	}

	/**
	 * Purchase discount amount (Base currency) 仕入基準通貨値引額.<p>
	 *
	 */
	public void purc_base_cur_dscnt_amt(float value) {
		purc_base_cur_dscnt_amt_p().amt(value);
	}

	/**
	 * Purchase discount amount (Base currency) 仕入基準通貨値引額.<p>
	 *
	 */
	public void purc_base_cur_dscnt_amt(double value) {
		purc_base_cur_dscnt_amt_p().amt(value);
	}

	/**
	 * Purchase unit price (Tax currency) 仕入納税通貨単価.<p>
	 *
	 */
	public MCNumber purc_ptax_cur_upri() {
		return purc_ptax_cur_upri_p().upri();
	}

	/**
	 * Purchase unit price (Tax currency) 仕入納税通貨単価.<p>
	 *
	 */
	public void purc_ptax_cur_upri(MCNumber value) {
		purc_ptax_cur_upri_p().upri(value);
	}

	/**
	 * Purchase unit price (Tax currency) 仕入納税通貨単価.<p>
	 *
	 */
	public void purc_ptax_cur_upri(int value) {
		purc_ptax_cur_upri_p().upri(value);
	}

	/**
	 * Purchase unit price (Tax currency) 仕入納税通貨単価.<p>
	 *
	 */
	public void purc_ptax_cur_upri(long value) {
		purc_ptax_cur_upri_p().upri(value);
	}

	/**
	 * Purchase unit price (Tax currency) 仕入納税通貨単価.<p>
	 *
	 */
	public void purc_ptax_cur_upri(float value) {
		purc_ptax_cur_upri_p().upri(value);
	}

	/**
	 * Purchase unit price (Tax currency) 仕入納税通貨単価.<p>
	 *
	 */
	public void purc_ptax_cur_upri(double value) {
		purc_ptax_cur_upri_p().upri(value);
	}

	/**
	 * Purchase amount (Tax currency) 仕入納税通貨金額.<p>
	 *
	 */
	public MCNumber purc_ptax_cur_amt() {
		return purc_ptax_cur_amt_p().amt();
	}

	/**
	 * Purchase amount (Tax currency) 仕入納税通貨金額.<p>
	 *
	 */
	public void purc_ptax_cur_amt(MCNumber value) {
		purc_ptax_cur_amt_p().amt(value);
	}

	/**
	 * Purchase amount (Tax currency) 仕入納税通貨金額.<p>
	 *
	 */
	public void purc_ptax_cur_amt(int value) {
		purc_ptax_cur_amt_p().amt(value);
	}

	/**
	 * Purchase amount (Tax currency) 仕入納税通貨金額.<p>
	 *
	 */
	public void purc_ptax_cur_amt(long value) {
		purc_ptax_cur_amt_p().amt(value);
	}

	/**
	 * Purchase amount (Tax currency) 仕入納税通貨金額.<p>
	 *
	 */
	public void purc_ptax_cur_amt(float value) {
		purc_ptax_cur_amt_p().amt(value);
	}

	/**
	 * Purchase amount (Tax currency) 仕入納税通貨金額.<p>
	 *
	 */
	public void purc_ptax_cur_amt(double value) {
		purc_ptax_cur_amt_p().amt(value);
	}

	/**
	 * Tax included purchase amount (Tax currency) 仕入納税通貨税込金額.<p>
	 *
	 */
	public MCNumber purc_ptax_cur_inc_tax_amt() {
		return purc_ptax_cur_inc_tax_amt_p().amt();
	}

	/**
	 * Tax included purchase amount (Tax currency) 仕入納税通貨税込金額.<p>
	 *
	 */
	public void purc_ptax_cur_inc_tax_amt(MCNumber value) {
		purc_ptax_cur_inc_tax_amt_p().amt(value);
	}

	/**
	 * Tax included purchase amount (Tax currency) 仕入納税通貨税込金額.<p>
	 *
	 */
	public void purc_ptax_cur_inc_tax_amt(int value) {
		purc_ptax_cur_inc_tax_amt_p().amt(value);
	}

	/**
	 * Tax included purchase amount (Tax currency) 仕入納税通貨税込金額.<p>
	 *
	 */
	public void purc_ptax_cur_inc_tax_amt(long value) {
		purc_ptax_cur_inc_tax_amt_p().amt(value);
	}

	/**
	 * Tax included purchase amount (Tax currency) 仕入納税通貨税込金額.<p>
	 *
	 */
	public void purc_ptax_cur_inc_tax_amt(float value) {
		purc_ptax_cur_inc_tax_amt_p().amt(value);
	}

	/**
	 * Tax included purchase amount (Tax currency) 仕入納税通貨税込金額.<p>
	 *
	 */
	public void purc_ptax_cur_inc_tax_amt(double value) {
		purc_ptax_cur_inc_tax_amt_p().amt(value);
	}

	/**
	 * Purchase tax amount (Tax currency) 仕入納税通貨税額.<p>
	 *
	 */
	public MCNumber purc_ptax_cur_tax_amt() {
		return purc_ptax_cur_tax_amt_p().amt();
	}

	/**
	 * Purchase tax amount (Tax currency) 仕入納税通貨税額.<p>
	 *
	 */
	public void purc_ptax_cur_tax_amt(MCNumber value) {
		purc_ptax_cur_tax_amt_p().amt(value);
	}

	/**
	 * Purchase tax amount (Tax currency) 仕入納税通貨税額.<p>
	 *
	 */
	public void purc_ptax_cur_tax_amt(int value) {
		purc_ptax_cur_tax_amt_p().amt(value);
	}

	/**
	 * Purchase tax amount (Tax currency) 仕入納税通貨税額.<p>
	 *
	 */
	public void purc_ptax_cur_tax_amt(long value) {
		purc_ptax_cur_tax_amt_p().amt(value);
	}

	/**
	 * Purchase tax amount (Tax currency) 仕入納税通貨税額.<p>
	 *
	 */
	public void purc_ptax_cur_tax_amt(float value) {
		purc_ptax_cur_tax_amt_p().amt(value);
	}

	/**
	 * Purchase tax amount (Tax currency) 仕入納税通貨税額.<p>
	 *
	 */
	public void purc_ptax_cur_tax_amt(double value) {
		purc_ptax_cur_tax_amt_p().amt(value);
	}

	/**
	 * Purchase discount amount (Tax currency) 仕入納税通貨値引額.<p>
	 *
	 */
	public MCNumber purc_ptax_cur_dscnt_amt() {
		return purc_ptax_cur_dscnt_amt_p().amt();
	}

	/**
	 * Purchase discount amount (Tax currency) 仕入納税通貨値引額.<p>
	 *
	 */
	public void purc_ptax_cur_dscnt_amt(MCNumber value) {
		purc_ptax_cur_dscnt_amt_p().amt(value);
	}

	/**
	 * Purchase discount amount (Tax currency) 仕入納税通貨値引額.<p>
	 *
	 */
	public void purc_ptax_cur_dscnt_amt(int value) {
		purc_ptax_cur_dscnt_amt_p().amt(value);
	}

	/**
	 * Purchase discount amount (Tax currency) 仕入納税通貨値引額.<p>
	 *
	 */
	public void purc_ptax_cur_dscnt_amt(long value) {
		purc_ptax_cur_dscnt_amt_p().amt(value);
	}

	/**
	 * Purchase discount amount (Tax currency) 仕入納税通貨値引額.<p>
	 *
	 */
	public void purc_ptax_cur_dscnt_amt(float value) {
		purc_ptax_cur_dscnt_amt_p().amt(value);
	}

	/**
	 * Purchase discount amount (Tax currency) 仕入納税通貨値引額.<p>
	 *
	 */
	public void purc_ptax_cur_dscnt_amt(double value) {
		purc_ptax_cur_dscnt_amt_p().amt(value);
	}

	/**
	 * Purchased qty. 仕入済数量.<p>
	 *
	 */
	public MCNumber purc_qty() {
		return purc_qty_p().qty();
	}

	/**
	 * Purchased qty. 仕入済数量.<p>
	 *
	 */
	public void purc_qty(MCNumber value) {
		purc_qty_p().qty(value);
	}

	/**
	 * Purchased qty. 仕入済数量.<p>
	 *
	 */
	public void purc_qty(int value) {
		purc_qty_p().qty(value);
	}

	/**
	 * Purchased qty. 仕入済数量.<p>
	 *
	 */
	public void purc_qty(long value) {
		purc_qty_p().qty(value);
	}

	/**
	 * Purchased qty. 仕入済数量.<p>
	 *
	 */
	public void purc_qty(float value) {
		purc_qty_p().qty(value);
	}

	/**
	 * Purchased qty. 仕入済数量.<p>
	 *
	 */
	public void purc_qty(double value) {
		purc_qty_p().qty(value);
	}

	/**
	 * Purchase transaction unit qty. 仕入取引単位数量.<p>
	 *
	 */
	public MCNumber purc_trd_unit_qty() {
		return purc_trd_unit_qty_p().qty();
	}

	/**
	 * Purchase transaction unit qty. 仕入取引単位数量.<p>
	 *
	 */
	public void purc_trd_unit_qty(MCNumber value) {
		purc_trd_unit_qty_p().qty(value);
	}

	/**
	 * Purchase transaction unit qty. 仕入取引単位数量.<p>
	 *
	 */
	public void purc_trd_unit_qty(int value) {
		purc_trd_unit_qty_p().qty(value);
	}

	/**
	 * Purchase transaction unit qty. 仕入取引単位数量.<p>
	 *
	 */
	public void purc_trd_unit_qty(long value) {
		purc_trd_unit_qty_p().qty(value);
	}

	/**
	 * Purchase transaction unit qty. 仕入取引単位数量.<p>
	 *
	 */
	public void purc_trd_unit_qty(float value) {
		purc_trd_unit_qty_p().qty(value);
	}

	/**
	 * Purchase transaction unit qty. 仕入取引単位数量.<p>
	 *
	 */
	public void purc_trd_unit_qty(double value) {
		purc_trd_unit_qty_p().qty(value);
	}

	/**
	 * Purchase base unit qty. 仕入基準単位数量.<p>
	 *
	 */
	public MCNumber purc_base_unit_qty() {
		return purc_base_unit_qty_p().qty();
	}

	/**
	 * Purchase base unit qty. 仕入基準単位数量.<p>
	 *
	 */
	public void purc_base_unit_qty(MCNumber value) {
		purc_base_unit_qty_p().qty(value);
	}

	/**
	 * Purchase base unit qty. 仕入基準単位数量.<p>
	 *
	 */
	public void purc_base_unit_qty(int value) {
		purc_base_unit_qty_p().qty(value);
	}

	/**
	 * Purchase base unit qty. 仕入基準単位数量.<p>
	 *
	 */
	public void purc_base_unit_qty(long value) {
		purc_base_unit_qty_p().qty(value);
	}

	/**
	 * Purchase base unit qty. 仕入基準単位数量.<p>
	 *
	 */
	public void purc_base_unit_qty(float value) {
		purc_base_unit_qty_p().qty(value);
	}

	/**
	 * Purchase base unit qty. 仕入基準単位数量.<p>
	 *
	 */
	public void purc_base_unit_qty(double value) {
		purc_base_unit_qty_p().qty(value);
	}

}

