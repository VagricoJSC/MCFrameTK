package mcframe.serverMSLA.MSLAL9110;

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
 * ブロック"PoRecvIf_Chk01_Cnd"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class PoRecvIf_Chk01_CndR_MC_A extends MCConstRow {

	public static final String $poif = "poif";
	/**
	 * Error エラー.<p>
	 *
	 */
	public static final String $err_flg = "err_flg";
	/**
	 * PO No. 発注ＮＯ.<p>
	 *
	 */
	public static final String $po_no = "po_no";
	/**
	 * PO rev. number 発注改訂番号.<p>
	 *
	 */
	public static final String $po_rev = "po_rev";
	/**
	 * PO details No. 発注明細ＮＯ.<p>
	 *
	 */
	public static final String $po_d_no = "po_d_no";
	/**
	 * Header data update type ヘッダデータ更新区分.<p>
	 *
	 */
	public static final String $hdr_data_crud_typ = "hdr_data_crud_typ";
	/**
	 * Purchasing dept. WG cd. 購買部門ＷＧ ＣＤ.<p>
	 *
	 */
	public static final String $purc_dpt_wg_cd = "purc_dpt_wg_cd";
	/**
	 * Supplier dept. 発注先部署.<p>
	 *
	 */
	public static final String $sppl_cntct_dpt = "sppl_cntct_dpt";
	/**
	 * Supplier PIC 発注先担当者.<p>
	 *
	 */
	public static final String $sppl_cntct_psn = "sppl_cntct_psn";
	/**
	 * Supplier zip code 発注先郵便番号.<p>
	 *
	 */
	public static final String $sppl_zip_cd = "sppl_zip_cd";
	/**
	 * Supplier address 1 発注先住所１.<p>
	 *
	 */
	public static final String $sppl_addr1 = "sppl_addr1";
	/**
	 * Supplier address 2 発注先住所２.<p>
	 *
	 */
	public static final String $sppl_addr2 = "sppl_addr2";
	/**
	 * Supplier address 3 発注先住所３.<p>
	 *
	 */
	public static final String $sppl_addr3 = "sppl_addr3";
	/**
	 * Supplier address 4 発注先住所４.<p>
	 *
	 */
	public static final String $sppl_addr4 = "sppl_addr4";
	/**
	 * Supplier TEL 発注先ＴＥＬ.<p>
	 *
	 */
	public static final String $sppl_tel = "sppl_tel";
	/**
	 * Supplier FAX 発注先ＦＡＸ.<p>
	 *
	 */
	public static final String $sppl_fax = "sppl_fax";
	/**
	 * Report output locale cd. 帳票出力ロケールＣＤ.<p>
	 *
	 */
	public static final String $prnt_lcl_cd = "prnt_lcl_cd";
	/**
	 * Supplier invoice transaction 発注先インボイス取引.<p>
	 *
	 */
	public static final String $sppl_iv_flg = "sppl_iv_flg";
	/**
	 * For subcontract 下請対象.<p>
	 *
	 */
	public static final String $subcon_flg = "subcon_flg";
	/**
	 * Repurchase obligation 買戻義務.<p>
	 *
	 */
	public static final String $repurc_obli_flg = "repurc_obli_flg";
	/**
	 * Subcontracting unit price type 外注単価区分.<p>
	 *
	 */
	public static final String $outsrc_upri_typ = "outsrc_upri_typ";
	/**
	 * Supplier payment carry-over count 発注先支払繰越回数.<p>
	 *
	 */
	public static final String $sppl_pay_crryovr_times = "sppl_pay_crryovr_times";
	/**
	 * Allow changing supplier purchasing unit price 発注先購買単価変更許可.<p>
	 *
	 */
	public static final String $sppl_purc_upri_cng_flg = "sppl_purc_upri_cng_flg";
	/**
	 * Supplier delivery note cd. 発注先納品書ＣＤ.<p>
	 *
	 */
	public static final String $sppl_ship_form_cd = "sppl_ship_form_cd";
	/**
	 * Rounding type (Purchase amount) 仕入金額端数処理区分.<p>
	 *
	 */
	public static final String $purc_amt_rnd_typ = "purc_amt_rnd_typ";
	/**
	 * Purchase tax rounding type 仕入税端数処理区分.<p>
	 *
	 */
	public static final String $purc_tax_rnd_typ = "purc_tax_rnd_typ";
	/**
	 * Supplier calendar cd. 発注先カレンダＣＤ.<p>
	 *
	 */
	public static final String $sppl_cal_cd = "sppl_cal_cd";
	/**
	 * Display PO sheet cd. (Master) 注文書表示ＣＤ（マスタ）.<p>
	 *
	 */
	public static final String $sppl_po_print_cd = "sppl_po_print_cd";
	/**
	 * Transaction amount number of decimal places 取引金額小数部有効桁数.<p>
	 *
	 */
	public static final String $trd_cur_amt_dec_place = "trd_cur_amt_dec_place";
	/**
	 * Transaction unit price number of decimal places 取引単価小数部有効桁数.<p>
	 *
	 */
	public static final String $trd_cur_upri_dec_place = "trd_cur_upri_dec_place";
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
	 * Withholding tax rounding type 源泉徴収税端数処理区分.<p>
	 *
	 */
	public static final String $wtax_rnd_typ = "wtax_rnd_typ";
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
	 * Tax rate 税率.<p>
	 *
	 */
	public static final String $tax_rate = "tax_rate";
	/**
	 * Subcontracting amount (Transaction currency) 取引通貨加工金額.<p>
	 *
	 */
	public static final String $trd_cur_proc_amt = "trd_cur_proc_amt";
	/**
	 * Chargeable supply amount (Transaction currency) 取引通貨有償支給金額.<p>
	 *
	 */
	public static final String $trd_cur_onr_prov_amt = "trd_cur_onr_prov_amt";
	/**
	 * Amount (Transaction currency) 取引通貨金額.<p>
	 *
	 */
	public static final String $trd_cur_amt = "trd_cur_amt";
	/**
	 * Tax amount (Transaction currency) 取引通貨税額.<p>
	 *
	 */
	public static final String $trd_cur_tax_amt = "trd_cur_tax_amt";
	/**
	 * Withholding tax 源泉税額.<p>
	 *
	 */
	public static final String $wtax_amt = "wtax_amt";
	/**
	 * Amount number of decimal places (Master) 金額小数部有効桁数（マスタ）.<p>
	 *
	 */
	public static final String $sppl_amt_dec_place = "sppl_amt_dec_place";
	/**
	 * Unit price number of decimal places (Master) 単価小数部有効桁数（マスタ）.<p>
	 *
	 */
	public static final String $sppl_upri_dec_place = "sppl_upri_dec_place";
	/**
	 * Sales project No. 案件ＮＯ.<p>
	 *
	 */
	public static final String $wrk_no = "wrk_no";
	/**
	 * AP dept. cd. (Master) 債務部門ＣＤ（マスタ）.<p>
	 *
	 */
	public static final String $sppl_ap_dpt_cd = "sppl_ap_dpt_cd";
	/**
	 * Transaction currency cd. (Master) 取引通貨ＣＤ（マスタ）.<p>
	 *
	 */
	public static final String $sppl_trd_cur_cd = "sppl_trd_cur_cd";
	/**
	 * Purchase unit price acquisition type (Master) 購買単価取得区分（マスタ）.<p>
	 *
	 */
	public static final String $sppl_purc_upri_req_typ = "sppl_purc_upri_req_typ";
	/**
	 * Transaction terms cd. 1 (Master) 取引条件ＣＤ１（マスタ）.<p>
	 *
	 */
	public static final String $sppl_tterm_cd1 = "sppl_tterm_cd1";
	/**
	 * Transaction terms cd. 2 (Master) 取引条件ＣＤ２（マスタ）.<p>
	 *
	 */
	public static final String $sppl_tterm_cd2 = "sppl_tterm_cd2";
	/**
	 * Transaction terms cd. 3 (Master) 取引条件ＣＤ３（マスタ）.<p>
	 *
	 */
	public static final String $sppl_tterm_cd3 = "sppl_tterm_cd3";
	/**
	 * Item name (Master) 品名（マスタ）.<p>
	 *
	 */
	public static final String $mst_itm_nm = "mst_itm_nm";
	/**
	 * Asset management type 資産管理区分.<p>
	 *
	 */
	public static final String $asset_mng_typ = "asset_mng_typ";
	/**
	 * Miscellaneous item 諸口品.<p>
	 *
	 */
	public static final String $sundry_itm_flg = "sundry_itm_flg";
	/**
	 * Discount item 値引品目.<p>
	 *
	 */
	public static final String $dscnt_itm_flg = "dscnt_itm_flg";
	/**
	 * For version control 版管理対象.<p>
	 *
	 */
	public static final String $ver_flg = "ver_flg";
	/**
	 * Item payment carry-over count 品目支払繰越回数.<p>
	 *
	 */
	public static final String $itm_pay_crryovr_times = "itm_pay_crryovr_times";
	/**
	 * Allow item purchasing unit price change 品目購買単価変更許可.<p>
	 *
	 */
	public static final String $itm_purc_upri_cng_flg = "itm_purc_upri_cng_flg";
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
	 * Receipt unnecessary 入荷不要.<p>
	 *
	 */
	public static final String $arr_skip_flg = "arr_skip_flg";
	/**
	 * Transaction unit number of decimal places 取引単位小数部有効桁数.<p>
	 *
	 */
	public static final String $trd_unit_dec_place = "trd_unit_dec_place";
	/**
	 * Transaction unit rounding type 取引単位端数処理区分.<p>
	 *
	 */
	public static final String $trd_unit_rnd_typ = "trd_unit_rnd_typ";
	/**
	 * Transaction unit conversion base qty. 取引単位換算基準数量.<p>
	 *
	 */
	public static final String $trd_unit_conv_base_qty = "trd_unit_conv_base_qty";
	/**
	 * Transaction unit conversion qty. 取引単位換算数量.<p>
	 *
	 */
	public static final String $trd_unit_conv_qty = "trd_unit_conv_qty";
	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public static final String $base_unit_qty = "base_unit_qty";
	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public static final String $base_unit_cd = "base_unit_cd";
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
	 * Direct-delivery type 直納区分.<p>
	 *
	 */
	public static final String $drct_dlv_typ = "drct_dlv_typ";
	/**
	 * For rack/line 棚・ライン対象.<p>
	 *
	 */
	public static final String $str_ln_tgt_flg = "str_ln_tgt_flg";
	/**
	 * Delivery location WG 納入場所ＷＧ.<p>
	 *
	 */
	public static final String $in_to_loc_wg_cd = "in_to_loc_wg_cd";
	/**
	 * Factory/Distribution warehouse cd. 工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public static final String $site_cd = "site_cd";
	/**
	 * Subcontractor cd. 外注発注先ＣＤ.<p>
	 *
	 */
	public static final String $outsrc_sppl_cd = "outsrc_sppl_cd";
	/**
	 * Delivery location calendar cd. 納入場所カレンダＣＤ.<p>
	 *
	 */
	public static final String $in_to_loc_cal_cd = "in_to_loc_cal_cd";
	/**
	 * Distribution group cd. 物流グループＣＤ.<p>
	 *
	 */
	public static final String $lg_grp_cd = "lg_grp_cd";
	/**
	 * Subcontracting flg. 外注ＦＬＧ.<p>
	 *
	 */
	public static final String $outsrc_flg = "outsrc_flg";
	/**
	 * Request source desired delivery date and time 依頼元納入希望日時.<p>
	 *
	 */
	public static final String $rqst_dlv_rqst_tm = "rqst_dlv_rqst_tm";
	/**
	 * Expenses purchasing flg. (Purchase reason) 経費購買ＦＬＧ（仕入理由）.<p>
	 *
	 */
	public static final String $xpns_purc_flg = "xpns_purc_flg";
	/**
	 * Charged lot management type 負担ロット管理区分.<p>
	 *
	 */
	public static final String $bd_lot_mng_typ = "bd_lot_mng_typ";
	/**
	 * Charged sublot management type 負担サブロット管理区分.<p>
	 *
	 */
	public static final String $bd_sublot_mng_typ = "bd_sublot_mng_typ";
	/**
	 * Charged lot numbering type 負担ロットＮＯ発番区分.<p>
	 *
	 */
	public static final String $bd_lot_no_typ = "bd_lot_no_typ";
	/**
	 * Charged sublot numbering type 負担サブロットＮＯ発番区分.<p>
	 *
	 */
	public static final String $bd_sublot_no_typ = "bd_sublot_no_typ";
	/**
	 * Charged SEIBAN No. 1 management type 負担手配ＮＯ１管理区分.<p>
	 *
	 */
	public static final String $bd_sno1_mng_typ = "bd_sno1_mng_typ";
	/**
	 * Charged SEIBAN No. 2 management type 負担手配ＮＯ２管理区分.<p>
	 *
	 */
	public static final String $bd_sno2_mng_typ = "bd_sno2_mng_typ";
	/**
	 * Charged SEIBAN No. 3 management type 負担手配ＮＯ３管理区分.<p>
	 *
	 */
	public static final String $bd_sno3_mng_typ = "bd_sno3_mng_typ";
	/**
	 * Charged SEIBAN No. 4 management type 負担手配ＮＯ４管理区分.<p>
	 *
	 */
	public static final String $bd_sno4_mng_typ = "bd_sno4_mng_typ";
	/**
	 * Current EDI 今回ＥＤＩ.<p>
	 *
	 */
	public static final String $edi_flg = "edi_flg";
	/**
	 * GR/GI progress management No. 受払進捗管理ＮＯ.<p>
	 *
	 */
	public static final String $io_schd_pr_no = "io_schd_pr_no";
	/**
	 * Subcontracting item order No. 外注品目オーダＮＯ.<p>
	 *
	 */
	public static final String $outsrc_itm_ord_no = "outsrc_itm_ord_no";
	/**
	 * Cancel remaining flg. 打切ＦＬＧ.<p>
	 *
	 */
	public static final String $abort_flg = "abort_flg";
	/**
	 * Last cancel remaining flg. 前回打切ＦＬＧ.<p>
	 *
	 */
	public static final String $bef_abort_flg = "bef_abort_flg";
	/**
	 * PO rev. No. before update 更新前発注改訂番号.<p>
	 *
	 */
	public static final String $bef_po_rev = "bef_po_rev";
	/**
	 * Display order 表示順.<p>
	 *
	 */
	public static final String $disp_seq = "disp_seq";
	/**
	 * Purchase unit price acquisition base date 購買単価取得基準日.<p>
	 *
	 */
	public static final String $purc_upri_req_base_dt = "purc_upri_req_base_dt";
	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public static final String $peg_no = "peg_no";
	/**
	 * Purchase recording type 仕入計上区分.<p>
	 *
	 */
	public static final String $purc_basis_typ = "purc_basis_typ";

	public static final String $data_lno = $poif + ".data_lno";
	public static final String $data_no = $poif + ".data_no";
	public static final String $data_crud_typ = $poif + ".data_crud_typ";
	public static final String $exe_sts_typ = $poif + ".exe_sts_typ";
	public static final String $ext_sys_cd = $poif + ".ext_sys_cd";
	public static final String $ext_data_lno = $poif + ".ext_data_lno";
	public static final String $ext_data_no = $poif + ".ext_data_no";
	public static final String $data_make_dt = $poif + ".data_make_dt";
	public static final String $imp_flg = $poif + ".imp_flg";
	public static final String $recv_dt = $poif + ".recv_dt";
	public static final String $ext_po_no = $poif + ".ext_po_no";
	public static final String $ext_po_d_no = $poif + ".ext_po_d_no";
	public static final String $prnt_po_flg = $poif + ".prnt_po_flg";
	public static final String $prnt_dlv_flg = $poif + ".prnt_dlv_flg";
	public static final String $po_dt = $poif + ".po_dt";
	public static final String $trd_cd = $poif + ".trd_cd";
	public static final String $trd_ptn_typ = $poif + ".trd_ptn_typ";
	public static final String $sppl_cd = $poif + ".sppl_cd";
	public static final String $purc_dpt_cd = $poif + ".purc_dpt_cd";
	public static final String $purc_usr_cd = $poif + ".purc_usr_cd";
	public static final String $trd_cur_cd = $poif + ".trd_cur_cd";
	public static final String $xrate = $poif + ".xrate";
	public static final String $xrate_inpt_flg = $poif + ".xrate_inpt_flg";
	public static final String $ptax_xrate = $poif + ".ptax_xrate";
	public static final String $ptax_xrate_inpt_flg = $poif + ".ptax_xrate_inpt_flg";
	public static final String $po_print_cd = $poif + ".po_print_cd";
	public static final String $upd_po_print_schd_dt = $poif + ".upd_po_print_schd_dt";
	public static final String $crct_rsn_cd = $poif + ".crct_rsn_cd";
	public static final String $tterm_cd1 = $poif + ".tterm_cd1";
	public static final String $tterm_rmrks1 = $poif + ".tterm_rmrks1";
	public static final String $tterm_cd2 = $poif + ".tterm_cd2";
	public static final String $tterm_rmrks2 = $poif + ".tterm_rmrks2";
	public static final String $tterm_cd3 = $poif + ".tterm_cd3";
	public static final String $tterm_rmrks3 = $poif + ".tterm_rmrks3";
	public static final String $trd_rmrks = $poif + ".trd_rmrks";
	public static final String $intr_rmrks = $poif + ".intr_rmrks";
	public static final String $po_print_rmrks = $poif + ".po_print_rmrks";
	public static final String $dlv_slip_rmrks = $poif + ".dlv_slip_rmrks";
	public static final String $itm_cd = $poif + ".itm_cd";
	public static final String $itm_sub1 = $poif + ".itm_sub1";
	public static final String $itm_sub2 = $poif + ".itm_sub2";
	public static final String $itm_sub3 = $poif + ".itm_sub3";
	public static final String $itm_nm = $poif + ".itm_nm";
	public static final String $iv_itm_nm = $poif + ".iv_itm_nm";
	public static final String $ver_no = $poif + ".ver_no";
	public static final String $sno1 = $poif + ".sno1";
	public static final String $sno2 = $poif + ".sno2";
	public static final String $sno3 = $poif + ".sno3";
	public static final String $sno4 = $poif + ".sno4";
	public static final String $purc_id_typ = $poif + ".purc_id_typ";
	public static final String $sppl_itm_cd = $poif + ".sppl_itm_cd";
	public static final String $sppl_itm_nm = $poif + ".sppl_itm_nm";
	public static final String $maker_cd = $poif + ".maker_cd";
	public static final String $bp_lot_no = $poif + ".bp_lot_no";
	public static final String $in_to_loc_cd = $poif + ".in_to_loc_cd";
	public static final String $str_ln_cd = $poif + ".str_ln_cd";
	public static final String $mfg_loc_cd = $poif + ".mfg_loc_cd";
	public static final String $bom_ptn = $poif + ".bom_ptn";
	public static final String $dlv_rqst_tm = $poif + ".dlv_rqst_tm";
	public static final String $rqst_avl_rqst_dt = $poif + ".rqst_avl_rqst_dt";
	public static final String $purc_schd_dt = $poif + ".purc_schd_dt";
	public static final String $sync_flg = $poif + ".sync_flg";
	public static final String $trd_unit_qty = $poif + ".trd_unit_qty";
	public static final String $trd_unit_cd = $poif + ".trd_unit_cd";
	public static final String $purc_upri_req_typ = $poif + ".purc_upri_req_typ";
	public static final String $upri_not_tgt_flg = $poif + ".upri_not_tgt_flg";
	public static final String $trd_cur_upri = $poif + ".trd_cur_upri";
	public static final String $interim_flg = $poif + ".interim_flg";
	public static final String $tax_fix_flg = $poif + ".tax_fix_flg";
	public static final String $tax_cd = $poif + ".tax_cd";
	public static final String $trd_cur_dscnt_amt = $poif + ".trd_cur_dscnt_amt";
	public static final String $dscnt_rsn_cd = $poif + ".dscnt_rsn_cd";
	public static final String $trd_cur_proc_upri = $poif + ".trd_cur_proc_upri";
	public static final String $trd_cur_onr_prov_upri = $poif + ".trd_cur_onr_prov_upri";
	public static final String $wtax_rate = $poif + ".wtax_rate";
	public static final String $purc_rsn_cd = $poif + ".purc_rsn_cd";
	public static final String $pri_print_flg = $poif + ".pri_print_flg";
	public static final String $po_conf_rcpt_flg = $poif + ".po_conf_rcpt_flg";
	public static final String $po_conf_rcpt_dt = $poif + ".po_conf_rcpt_dt";
	public static final String $pay_crryovr_times = $poif + ".pay_crryovr_times";
	public static final String $ap_dpt_cd = $poif + ".ap_dpt_cd";
	public static final String $bd_dpt_cd = $poif + ".bd_dpt_cd";
	public static final String $bd_itm_cd = $poif + ".bd_itm_cd";
	public static final String $bd_itm_sub1 = $poif + ".bd_itm_sub1";
	public static final String $bd_itm_sub2 = $poif + ".bd_itm_sub2";
	public static final String $bd_itm_sub3 = $poif + ".bd_itm_sub3";
	public static final String $bd_sno1 = $poif + ".bd_sno1";
	public static final String $bd_sno2 = $poif + ".bd_sno2";
	public static final String $bd_sno3 = $poif + ".bd_sno3";
	public static final String $bd_sno4 = $poif + ".bd_sno4";
	public static final String $bd_loc_cd = $poif + ".bd_loc_cd";
	public static final String $bd_lot_no = $poif + ".bd_lot_no";
	public static final String $bd_sublot_no = $poif + ".bd_sublot_no";
	public static final String $bd_ctg_cd = $poif + ".bd_ctg_cd";
	public static final String $bd_oper_cd = $poif + ".bd_oper_cd";
	public static final String $bd_slo_no = $poif + ".bd_slo_no";
	public static final String $bd_iv_no = $poif + ".bd_iv_no";
	public static final String $bd_po_no = $poif + ".bd_po_no";
	public static final String $intr_d_rmrks = $poif + ".intr_d_rmrks";
	public static final String $trd_d_rmrks = $poif + ".trd_d_rmrks";
	public static final String $po_print_d_rmrks = $poif + ".po_print_d_rmrks";
	public static final String $arr_cnt_rmrks = $poif + ".arr_cnt_rmrks";
	public static final String $dlv_slip_d_rmrks = $poif + ".dlv_slip_d_rmrks";
	public static final String $edi_sub_char1 = $poif + ".edi_sub_char1";
	public static final String $edi_sub_char2 = $poif + ".edi_sub_char2";
	public static final String $edi_sub_char3 = $poif + ".edi_sub_char3";
	public static final String $edi_sub_char4 = $poif + ".edi_sub_char4";
	public static final String $edi_sub_char5 = $poif + ".edi_sub_char5";
	public static final String $edi_sub_num1 = $poif + ".edi_sub_num1";
	public static final String $edi_sub_dt1 = $poif + ".edi_sub_dt1";
	public static final String $edi_sub_d_char1 = $poif + ".edi_sub_d_char1";
	public static final String $edi_sub_d_char2 = $poif + ".edi_sub_d_char2";
	public static final String $edi_sub_d_char3 = $poif + ".edi_sub_d_char3";
	public static final String $edi_sub_d_char4 = $poif + ".edi_sub_d_char4";
	public static final String $edi_sub_d_char5 = $poif + ".edi_sub_d_char5";
	public static final String $edi_sub_d_num1 = $poif + ".edi_sub_d_num1";
	public static final String $edi_sub_d_dt1 = $poif + ".edi_sub_d_dt1";

	public static final MCMeta poif_META = createInnerRowMeta($poif, mcframe.serverMS.dbc.MST_PO_RECV_IF_R.class);
	public static final MCMeta err_flg_META = createCommonMeta($err_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta po_no_META = createCommonMeta($po_no, mcframe.commonMA.meta.MA_META.PO_NO);
	public static final MCMeta po_rev_META = createCommonMeta($po_rev, mcframe.commonMA.meta.MA_META.SLIP_REV);
	public static final MCMeta po_d_no_META = createCommonMeta($po_d_no, mcframe.commonMA.meta.MA_META.PO_D_NO);
	public static final MCMeta hdr_data_crud_typ_META = createCommonMeta($hdr_data_crud_typ, mcframe.commonMA.meta.MA_META.DATA_CRUD_TYP);
	public static final MCMeta purc_dpt_wg_cd_META = createCommonMeta($purc_dpt_wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta sppl_cntct_dpt_META = createCommonMeta($sppl_cntct_dpt, mcframe.commonMA.meta.MA_META.BP_CNTCT_DPT);
	public static final MCMeta sppl_cntct_psn_META = createCommonMeta($sppl_cntct_psn, mcframe.commonMA.meta.MA_META.BP_CNTCT_PSN);
	public static final MCMeta sppl_zip_cd_META = createCommonMeta($sppl_zip_cd, mcframe.commonMA.meta.MA_META.ZIP_CD);
	public static final MCMeta sppl_addr1_META = createCommonMeta($sppl_addr1, mcframe.commonMA.meta.MA_META.ADDR);
	public static final MCMeta sppl_addr2_META = createCommonMeta($sppl_addr2, mcframe.commonMA.meta.MA_META.ADDR);
	public static final MCMeta sppl_addr3_META = createCommonMeta($sppl_addr3, mcframe.commonMA.meta.MA_META.ADDR);
	public static final MCMeta sppl_addr4_META = createCommonMeta($sppl_addr4, mcframe.commonMA.meta.MA_META.ADDR);
	public static final MCMeta sppl_tel_META = createCommonMeta($sppl_tel, mcframe.commonMA.meta.MA_META.TEL);
	public static final MCMeta sppl_fax_META = createCommonMeta($sppl_fax, mcframe.commonMA.meta.MA_META.TEL);
	public static final MCMeta prnt_lcl_cd_META = createCommonMeta($prnt_lcl_cd, mcframe.commonMA.meta.MA_META.LCL_CD);
	public static final MCMeta sppl_iv_flg_META = createCommonMeta($sppl_iv_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta subcon_flg_META = createCommonMeta($subcon_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta repurc_obli_flg_META = createCommonMeta($repurc_obli_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta outsrc_upri_typ_META = createCommonMeta($outsrc_upri_typ, mcframe.commonMA.meta.MA_META.OUTSRC_UPRI_TYP);
	public static final MCMeta sppl_pay_crryovr_times_META = createCommonMeta($sppl_pay_crryovr_times, mcframe.commonMA.meta.MA_META.CRRYOVR_TIMES);
	public static final MCMeta sppl_purc_upri_cng_flg_META = createCommonMeta($sppl_purc_upri_cng_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sppl_ship_form_cd_META = createCommonMeta($sppl_ship_form_cd, mcframe.commonMA.meta.MA_META.SLIP_FORM_CD);
	public static final MCMeta purc_amt_rnd_typ_META = createCommonMeta($purc_amt_rnd_typ, mcframe.commonMA.meta.MA_META.RND_TYP);
	public static final MCMeta purc_tax_rnd_typ_META = createCommonMeta($purc_tax_rnd_typ, mcframe.commonMA.meta.MA_META.RND_TYP);
	public static final MCMeta sppl_cal_cd_META = createCommonMeta($sppl_cal_cd, mcframe.commonMA.meta.MA_META.CAL_CD);
	public static final MCMeta sppl_po_print_cd_META = createCommonMeta($sppl_po_print_cd, mcframe.commonMA.meta.MA_META.PO_PRINT_CD);
	public static final MCMeta trd_cur_amt_dec_place_META = createCommonMeta($trd_cur_amt_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta trd_cur_upri_dec_place_META = createCommonMeta($trd_cur_upri_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta base_cur_cd_META = createCommonMeta($base_cur_cd, mcframe.commonMA.meta.MA_META.CUR_CD);
	public static final MCMeta ptax_cur_cd_META = createCommonMeta($ptax_cur_cd, mcframe.commonMA.meta.MA_META.CUR_CD);
	public static final MCMeta wtax_rnd_typ_META = createCommonMeta($wtax_rnd_typ, mcframe.commonMA.meta.MA_META.RND_TYP);
	public static final MCMeta tax_typ_META = createCommonMeta($tax_typ, mcframe.commonMA.meta.MA_META.TAX_TYP);
	public static final MCMeta inc_tax_flg_META = createCommonMeta($inc_tax_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta tax_rate_META = createCommonMeta($tax_rate, mcframe.commonMA.meta.MA_META.TAX_RATE);
	public static final MCMeta trd_cur_proc_amt_META = createCommonMeta($trd_cur_proc_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta trd_cur_onr_prov_amt_META = createCommonMeta($trd_cur_onr_prov_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta trd_cur_amt_META = createCommonMeta($trd_cur_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta trd_cur_tax_amt_META = createCommonMeta($trd_cur_tax_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta wtax_amt_META = createCommonMeta($wtax_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta sppl_amt_dec_place_META = createCommonMeta($sppl_amt_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta sppl_upri_dec_place_META = createCommonMeta($sppl_upri_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta wrk_no_META = createCommonMeta($wrk_no, mcframe.commonMA.meta.MA_META.WRK_NO);
	public static final MCMeta sppl_ap_dpt_cd_META = createCommonMeta($sppl_ap_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta sppl_trd_cur_cd_META = createCommonMeta($sppl_trd_cur_cd, mcframe.commonMA.meta.MA_META.CUR_CD);
	public static final MCMeta sppl_purc_upri_req_typ_META = createCommonMeta($sppl_purc_upri_req_typ, mcframe.commonMA.meta.MA_META.PURC_UPRI_REQ_TYP);
	public static final MCMeta sppl_tterm_cd1_META = createCommonMeta($sppl_tterm_cd1, mcframe.commonMA.meta.MA_META.TTERM_CD);
	public static final MCMeta sppl_tterm_cd2_META = createCommonMeta($sppl_tterm_cd2, mcframe.commonMA.meta.MA_META.TTERM_CD);
	public static final MCMeta sppl_tterm_cd3_META = createCommonMeta($sppl_tterm_cd3, mcframe.commonMA.meta.MA_META.TTERM_CD);
	public static final MCMeta mst_itm_nm_META = createCommonMeta($mst_itm_nm, mcframe.commonMA.meta.MA_META.ITM_NM);
	public static final MCMeta asset_mng_typ_META = createCommonMeta($asset_mng_typ, mcframe.commonMA.meta.MA_META.ASSET_MNG_TYP);
	public static final MCMeta sundry_itm_flg_META = createCommonMeta($sundry_itm_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta dscnt_itm_flg_META = createCommonMeta($dscnt_itm_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta ver_flg_META = createCommonMeta($ver_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta itm_pay_crryovr_times_META = createCommonMeta($itm_pay_crryovr_times, mcframe.commonMA.meta.MA_META.CRRYOVR_TIMES);
	public static final MCMeta itm_purc_upri_cng_flg_META = createCommonMeta($itm_purc_upri_cng_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sno1_mng_typ_META = createCommonMeta($sno1_mng_typ, mcframe.commonMA.meta.MA_META.SNO_MNG_TYP);
	public static final MCMeta sno2_mng_typ_META = createCommonMeta($sno2_mng_typ, mcframe.commonMA.meta.MA_META.SNO_MNG_TYP);
	public static final MCMeta sno3_mng_typ_META = createCommonMeta($sno3_mng_typ, mcframe.commonMA.meta.MA_META.SNO_MNG_TYP);
	public static final MCMeta sno4_mng_typ_META = createCommonMeta($sno4_mng_typ, mcframe.commonMA.meta.MA_META.SNO_MNG_TYP);
	public static final MCMeta stk_mng_typ_META = createCommonMeta($stk_mng_typ, mcframe.commonMA.meta.MA_META.STK_MNG_TYP);
	public static final MCMeta arr_skip_flg_META = createCommonMeta($arr_skip_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta trd_unit_dec_place_META = createCommonMeta($trd_unit_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta trd_unit_rnd_typ_META = createCommonMeta($trd_unit_rnd_typ, mcframe.commonMA.meta.MA_META.RND_TYP);
	public static final MCMeta trd_unit_conv_base_qty_META = createCommonMeta($trd_unit_conv_base_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta trd_unit_conv_qty_META = createCommonMeta($trd_unit_conv_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta base_unit_qty_META = createCommonMeta($base_unit_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta base_unit_cd_META = createCommonMeta($base_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta base_unit_dec_place_META = createCommonMeta($base_unit_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta base_unit_rnd_typ_META = createCommonMeta($base_unit_rnd_typ, mcframe.commonMA.meta.MA_META.RND_TYP);
	public static final MCMeta drct_dlv_typ_META = createCommonMeta($drct_dlv_typ, mcframe.commonMS.meta.MS_META.DRCT_DLV_TYP);
	public static final MCMeta str_ln_tgt_flg_META = createCommonMeta($str_ln_tgt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta in_to_loc_wg_cd_META = createCommonMeta($in_to_loc_wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta site_cd_META = createCommonMeta($site_cd, mcframe.commonMA.meta.MA_META.SITE_CD);
	public static final MCMeta outsrc_sppl_cd_META = createCommonMeta($outsrc_sppl_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta in_to_loc_cal_cd_META = createCommonMeta($in_to_loc_cal_cd, mcframe.commonMA.meta.MA_META.CAL_CD);
	public static final MCMeta lg_grp_cd_META = createCommonMeta($lg_grp_cd, mcframe.commonMA.meta.MA_META.LG_GRP_CD);
	public static final MCMeta outsrc_flg_META = createCommonMeta($outsrc_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta rqst_dlv_rqst_tm_META = createCommonMeta($rqst_dlv_rqst_tm, mcframe.commonMA.meta.MA_META.TM);
	public static final MCMeta xpns_purc_flg_META = createCommonMeta($xpns_purc_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta bd_lot_mng_typ_META = createCommonMeta($bd_lot_mng_typ, mcframe.commonMA.meta.MA_META.LOT_MNG_TYP);
	public static final MCMeta bd_sublot_mng_typ_META = createCommonMeta($bd_sublot_mng_typ, mcframe.commonMA.meta.MA_META.LOT_MNG_TYP);
	public static final MCMeta bd_lot_no_typ_META = createCommonMeta($bd_lot_no_typ, mcframe.commonMA.meta.MA_META.LOT_NO_TYP);
	public static final MCMeta bd_sublot_no_typ_META = createCommonMeta($bd_sublot_no_typ, mcframe.commonMA.meta.MA_META.LOT_NO_TYP);
	public static final MCMeta bd_sno1_mng_typ_META = createCommonMeta($bd_sno1_mng_typ, mcframe.commonMA.meta.MA_META.SNO_MNG_TYP);
	public static final MCMeta bd_sno2_mng_typ_META = createCommonMeta($bd_sno2_mng_typ, mcframe.commonMA.meta.MA_META.SNO_MNG_TYP);
	public static final MCMeta bd_sno3_mng_typ_META = createCommonMeta($bd_sno3_mng_typ, mcframe.commonMA.meta.MA_META.SNO_MNG_TYP);
	public static final MCMeta bd_sno4_mng_typ_META = createCommonMeta($bd_sno4_mng_typ, mcframe.commonMA.meta.MA_META.SNO_MNG_TYP);
	public static final MCMeta edi_flg_META = createCommonMeta($edi_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta io_schd_pr_no_META = createCommonMeta($io_schd_pr_no, mcframe.commonMA.meta.MA_META.IO_SCHD_PR_NO);
	public static final MCMeta outsrc_itm_ord_no_META = createCommonMeta($outsrc_itm_ord_no, mcframe.commonMA.meta.MA_META.ITM_ORD_NO);
	public static final MCMeta abort_flg_META = createCommonMeta($abort_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta bef_abort_flg_META = createCommonMeta($bef_abort_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta bef_po_rev_META = createCommonMeta($bef_po_rev, mcframe.commonMA.meta.MA_META.SLIP_REV);
	public static final MCMeta disp_seq_META = createCommonMeta($disp_seq, mcframe.commonMA.meta.MA_META.DISP_SEQ);
	public static final MCMeta purc_upri_req_base_dt_META = createCommonMeta($purc_upri_req_base_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta peg_no_META = createCommonMeta($peg_no, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta purc_basis_typ_META = createCommonMeta($purc_basis_typ, mcframe.commonMA.meta.MA_META.PURC_BASIS_TYP);

	protected static final ConstMetaList<PoRecvIf_Chk01_CndR> constMetas = new ConstMetaList<PoRecvIf_Chk01_CndR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			poif_META,
			err_flg_META,
			po_no_META,
			po_rev_META,
			po_d_no_META,
			hdr_data_crud_typ_META,
			purc_dpt_wg_cd_META,
			sppl_cntct_dpt_META,
			sppl_cntct_psn_META,
			sppl_zip_cd_META,
			sppl_addr1_META,
			sppl_addr2_META,
			sppl_addr3_META,
			sppl_addr4_META,
			sppl_tel_META,
			sppl_fax_META,
			prnt_lcl_cd_META,
			sppl_iv_flg_META,
			subcon_flg_META,
			repurc_obli_flg_META,
			outsrc_upri_typ_META,
			sppl_pay_crryovr_times_META,
			sppl_purc_upri_cng_flg_META,
			sppl_ship_form_cd_META,
			purc_amt_rnd_typ_META,
			purc_tax_rnd_typ_META,
			sppl_cal_cd_META,
			sppl_po_print_cd_META,
			trd_cur_amt_dec_place_META,
			trd_cur_upri_dec_place_META,
			base_cur_cd_META,
			ptax_cur_cd_META,
			wtax_rnd_typ_META,
			tax_typ_META,
			inc_tax_flg_META,
			tax_rate_META,
			trd_cur_proc_amt_META,
			trd_cur_onr_prov_amt_META,
			trd_cur_amt_META,
			trd_cur_tax_amt_META,
			wtax_amt_META,
			sppl_amt_dec_place_META,
			sppl_upri_dec_place_META,
			wrk_no_META,
			sppl_ap_dpt_cd_META,
			sppl_trd_cur_cd_META,
			sppl_purc_upri_req_typ_META,
			sppl_tterm_cd1_META,
			sppl_tterm_cd2_META,
			sppl_tterm_cd3_META,
			mst_itm_nm_META,
			asset_mng_typ_META,
			sundry_itm_flg_META,
			dscnt_itm_flg_META,
			ver_flg_META,
			itm_pay_crryovr_times_META,
			itm_purc_upri_cng_flg_META,
			sno1_mng_typ_META,
			sno2_mng_typ_META,
			sno3_mng_typ_META,
			sno4_mng_typ_META,
			stk_mng_typ_META,
			arr_skip_flg_META,
			trd_unit_dec_place_META,
			trd_unit_rnd_typ_META,
			trd_unit_conv_base_qty_META,
			trd_unit_conv_qty_META,
			base_unit_qty_META,
			base_unit_cd_META,
			base_unit_dec_place_META,
			base_unit_rnd_typ_META,
			drct_dlv_typ_META,
			str_ln_tgt_flg_META,
			in_to_loc_wg_cd_META,
			site_cd_META,
			outsrc_sppl_cd_META,
			in_to_loc_cal_cd_META,
			lg_grp_cd_META,
			outsrc_flg_META,
			rqst_dlv_rqst_tm_META,
			xpns_purc_flg_META,
			bd_lot_mng_typ_META,
			bd_sublot_mng_typ_META,
			bd_lot_no_typ_META,
			bd_sublot_no_typ_META,
			bd_sno1_mng_typ_META,
			bd_sno2_mng_typ_META,
			bd_sno3_mng_typ_META,
			bd_sno4_mng_typ_META,
			edi_flg_META,
			io_schd_pr_no_META,
			outsrc_itm_ord_no_META,
			abort_flg_META,
			bef_abort_flg_META,
			bef_po_rev_META,
			disp_seq_META,
			purc_upri_req_base_dt_META,
			peg_no_META,
			purc_basis_typ_META
		},
		new String[][]{
			{
				"data_lno",
				"data_no",
				"data_crud_typ",
				"exe_sts_typ",
				"ext_sys_cd",
				"ext_data_lno",
				"ext_data_no",
				"data_make_dt",
				"imp_flg",
				"recv_dt",
				"ext_po_no",
				"ext_po_d_no",
				"prnt_po_flg",
				"prnt_dlv_flg",
				"po_dt",
				"trd_cd",
				"trd_ptn_typ",
				"sppl_cd",
				"purc_dpt_cd",
				"purc_usr_cd",
				"trd_cur_cd",
				"xrate",
				"xrate_inpt_flg",
				"ptax_xrate",
				"ptax_xrate_inpt_flg",
				"po_print_cd",
				"upd_po_print_schd_dt",
				"crct_rsn_cd",
				"tterm_cd1",
				"tterm_rmrks1",
				"tterm_cd2",
				"tterm_rmrks2",
				"tterm_cd3",
				"tterm_rmrks3",
				"trd_rmrks",
				"intr_rmrks",
				"po_print_rmrks",
				"dlv_slip_rmrks",
				"itm_cd",
				"itm_sub1",
				"itm_sub2",
				"itm_sub3",
				"itm_nm",
				"iv_itm_nm",
				"ver_no",
				"sno1",
				"sno2",
				"sno3",
				"sno4",
				"purc_id_typ",
				"sppl_itm_cd",
				"sppl_itm_nm",
				"maker_cd",
				"bp_lot_no",
				"in_to_loc_cd",
				"str_ln_cd",
				"mfg_loc_cd",
				"bom_ptn",
				"dlv_rqst_tm",
				"rqst_avl_rqst_dt",
				"purc_schd_dt",
				"sync_flg",
				"trd_unit_qty",
				"trd_unit_cd",
				"purc_upri_req_typ",
				"upri_not_tgt_flg",
				"trd_cur_upri",
				"interim_flg",
				"tax_fix_flg",
				"tax_cd",
				"trd_cur_dscnt_amt",
				"dscnt_rsn_cd",
				"trd_cur_proc_upri",
				"trd_cur_onr_prov_upri",
				"wtax_rate",
				"purc_rsn_cd",
				"pri_print_flg",
				"po_conf_rcpt_flg",
				"po_conf_rcpt_dt",
				"pay_crryovr_times",
				"ap_dpt_cd",
				"bd_dpt_cd",
				"bd_itm_cd",
				"bd_itm_sub1",
				"bd_itm_sub2",
				"bd_itm_sub3",
				"bd_sno1",
				"bd_sno2",
				"bd_sno3",
				"bd_sno4",
				"bd_loc_cd",
				"bd_lot_no",
				"bd_sublot_no",
				"bd_ctg_cd",
				"bd_oper_cd",
				"bd_slo_no",
				"bd_iv_no",
				"bd_po_no",
				"intr_d_rmrks",
				"trd_d_rmrks",
				"po_print_d_rmrks",
				"arr_cnt_rmrks",
				"dlv_slip_d_rmrks",
				"edi_sub_char1",
				"edi_sub_char2",
				"edi_sub_char3",
				"edi_sub_char4",
				"edi_sub_char5",
				"edi_sub_num1",
				"edi_sub_dt1",
				"edi_sub_d_char1",
				"edi_sub_d_char2",
				"edi_sub_d_char3",
				"edi_sub_d_char4",
				"edi_sub_d_char5",
				"edi_sub_d_num1",
				"edi_sub_d_dt1"
			},
			{
				$data_lno,
				$data_no,
				$data_crud_typ,
				$exe_sts_typ,
				$ext_sys_cd,
				$ext_data_lno,
				$ext_data_no,
				$data_make_dt,
				$imp_flg,
				$recv_dt,
				$ext_po_no,
				$ext_po_d_no,
				$prnt_po_flg,
				$prnt_dlv_flg,
				$po_dt,
				$trd_cd,
				$trd_ptn_typ,
				$sppl_cd,
				$purc_dpt_cd,
				$purc_usr_cd,
				$trd_cur_cd,
				$xrate,
				$xrate_inpt_flg,
				$ptax_xrate,
				$ptax_xrate_inpt_flg,
				$po_print_cd,
				$upd_po_print_schd_dt,
				$crct_rsn_cd,
				$tterm_cd1,
				$tterm_rmrks1,
				$tterm_cd2,
				$tterm_rmrks2,
				$tterm_cd3,
				$tterm_rmrks3,
				$trd_rmrks,
				$intr_rmrks,
				$po_print_rmrks,
				$dlv_slip_rmrks,
				$itm_cd,
				$itm_sub1,
				$itm_sub2,
				$itm_sub3,
				$itm_nm,
				$iv_itm_nm,
				$ver_no,
				$sno1,
				$sno2,
				$sno3,
				$sno4,
				$purc_id_typ,
				$sppl_itm_cd,
				$sppl_itm_nm,
				$maker_cd,
				$bp_lot_no,
				$in_to_loc_cd,
				$str_ln_cd,
				$mfg_loc_cd,
				$bom_ptn,
				$dlv_rqst_tm,
				$rqst_avl_rqst_dt,
				$purc_schd_dt,
				$sync_flg,
				$trd_unit_qty,
				$trd_unit_cd,
				$purc_upri_req_typ,
				$upri_not_tgt_flg,
				$trd_cur_upri,
				$interim_flg,
				$tax_fix_flg,
				$tax_cd,
				$trd_cur_dscnt_amt,
				$dscnt_rsn_cd,
				$trd_cur_proc_upri,
				$trd_cur_onr_prov_upri,
				$wtax_rate,
				$purc_rsn_cd,
				$pri_print_flg,
				$po_conf_rcpt_flg,
				$po_conf_rcpt_dt,
				$pay_crryovr_times,
				$ap_dpt_cd,
				$bd_dpt_cd,
				$bd_itm_cd,
				$bd_itm_sub1,
				$bd_itm_sub2,
				$bd_itm_sub3,
				$bd_sno1,
				$bd_sno2,
				$bd_sno3,
				$bd_sno4,
				$bd_loc_cd,
				$bd_lot_no,
				$bd_sublot_no,
				$bd_ctg_cd,
				$bd_oper_cd,
				$bd_slo_no,
				$bd_iv_no,
				$bd_po_no,
				$intr_d_rmrks,
				$trd_d_rmrks,
				$po_print_d_rmrks,
				$arr_cnt_rmrks,
				$dlv_slip_d_rmrks,
				$edi_sub_char1,
				$edi_sub_char2,
				$edi_sub_char3,
				$edi_sub_char4,
				$edi_sub_char5,
				$edi_sub_num1,
				$edi_sub_dt1,
				$edi_sub_d_char1,
				$edi_sub_d_char2,
				$edi_sub_d_char3,
				$edi_sub_d_char4,
				$edi_sub_d_char5,
				$edi_sub_d_num1,
				$edi_sub_d_dt1
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
				{$poif + ".ext_po_no", "E"},	// poif.ext_po_no
				{$poif + ".ext_po_d_no", "E"}	// poif.ext_po_d_no
			}
		)),
		new MCExtMap.Entry($$CHK_NUM, new MCExtList(
			new String[][]{
				{$poif + ".xrate", "positive"},	// poif.xrate
				{$poif + ".ptax_xrate", "positive"},	// poif.ptax_xrate
				{$poif + ".trd_unit_qty", "positive"}	// poif.trd_unit_qty
			}
		)),
		new MCExtMap.Entry($$SMALL_LARGE, new MCExtList(
			new String[][]{
				{$poif + ".trd_cur_upri", "0:"},	// poif.trd_cur_upri
				{$poif + ".trd_cur_dscnt_amt", "0:"},	// poif.trd_cur_dscnt_amt
				{$poif + ".trd_cur_proc_upri", "0:"},	// poif.trd_cur_proc_upri
				{$poif + ".trd_cur_onr_prov_upri", "0:"},	// poif.trd_cur_onr_prov_upri
				{$poif + ".wtax_rate", "0:"},	// poif.wtax_rate
				{$poif + ".pay_crryovr_times", "0:"}	// poif.pay_crryovr_times
			}
		)),
		new MCExtMap.Entry($$CHK_DT, new MCExtList(
			new String[][]{
				{$poif + ".po_dt", "bfToday"}	// poif.po_dt
			}
		)),
		new MCExtMap.Entry($$BEFORE_AFTER, new MCExtList(
			new String[][]{
				{$poif + ".po_dt", "dlv_rqst_dt:BF,purc_schd_dt:BF"},	// poif.po_dt
				{$poif + ".dlv_rqst_tm", "dlv_rqst_dt:AF"},	// poif.dlv_rqst_tm
				{$poif + ".purc_schd_dt", "purc_schd_dt:AF"}	// poif.purc_schd_dt
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
				{$poif + ".sppl_cd", "MA.MAUAL0010.Bp"},	// poif.sppl_cd
				{$poif + ".purc_dpt_cd", "MA.MAUAL0010.Dpt"},	// poif.purc_dpt_cd
				{$poif + ".purc_usr_cd", "MA.MAUAL0010.Usr"},	// poif.purc_usr_cd
				{$poif + ".trd_cur_cd", "MA.MAUAL0010.Cur"},	// poif.trd_cur_cd
				{$poif + ".po_print_cd", "MA.MAUAL0010.PoPrint"},	// poif.po_print_cd
				{$poif + ".crct_rsn_cd", "MS.MSUAL0050.PoCrctRsn"},	// poif.crct_rsn_cd
				{$poif + ".tterm_cd1", "MA.MAUAL0010.Tterm"},	// poif.tterm_cd1
				{$poif + ".tterm_cd2", "MA.MAUAL0010.Tterm"},	// poif.tterm_cd2
				{$poif + ".tterm_cd3", "MA.MAUAL0010.Tterm"},	// poif.tterm_cd3
				{$poif + ".itm_sub3", "MA.MAUAL0010.ItmSub3"},	// poif.itm_sub3
				{$poif + ".maker_cd", "MA.MAUAL0010.Bp"},	// poif.maker_cd
				{$poif + ".in_to_loc_cd", "MA.MAUAL0010.Loc"},	// poif.in_to_loc_cd
				{$poif + ".str_ln_cd", "MA.MAUAL0010.StrLn"},	// poif.str_ln_cd
				{$poif + ".mfg_loc_cd", "MA.MAUAL0010.Loc"},	// poif.mfg_loc_cd
				{$poif + ".trd_unit_cd", "MA.MAUAL0010.ItmUnit"},	// poif.trd_unit_cd
				{$poif + ".dscnt_rsn_cd", "MA.MAUAL0010.PurcDscntBizRsn"},	// poif.dscnt_rsn_cd
				{$poif + ".purc_rsn_cd", "MA.MAUAL0010.PurcBizRsn"},	// poif.purc_rsn_cd
				{$poif + ".ap_dpt_cd", "MA.MAUAL0010.Dpt"},	// poif.ap_dpt_cd
				{$poif + ".bd_dpt_cd", "MA.MAUAL0010.Dpt"},	// poif.bd_dpt_cd
				{$poif + ".bd_itm_sub3", "MA.MAUAL0010.ItmSub3"},	// poif.bd_itm_sub3
				{$poif + ".bd_loc_cd", "MA.MAUAL0010.Loc"},	// poif.bd_loc_cd
				{$poif + ".bd_ctg_cd", "MA.MAUAL0010.CostCtg"},	// poif.bd_ctg_cd
				{$poif + ".bd_oper_cd", "MA.MAUAL0010.Oper"},	// poif.bd_oper_cd
				{$base_cur_cd, "MA.MAUAL0010.Cur"},	// base_cur_cd
				{$ptax_cur_cd, "MA.MAUAL0010.Cur"}	// ptax_cur_cd
			}
		)),
		new MCExtMap.Entry($$LIST_OUT, new MCExtList(
			new String[][]{
				{$poif + ".sppl_cd", "sppl_iv_flg;prnt_lcl_cd;subcon_flg;sppl_pay_crryovr_times;sppl_cal_cd;purc_amt_rnd_typ;purc_tax_rnd_typ;sppl_ship_form_cd;sppl_po_print_cd;sppl_tel;sppl_fax;sppl_zip_cd;sppl_addr1;sppl_addr2;sppl_addr3;sppl_addr4;sppl_cntct_dpt;sppl_cntct_psn;sppl_ap_dpt_cd;sppl_trd_cur_cd;sppl_upri_dec_place;sppl_amt_dec_place;sppl_purc_upri_req_typ;sppl_tterm_cd1;sppl_tterm_cd2;sppl_tterm_cd3;sppl_purc_upri_cng_flg;repurc_obli_flg;outsrc_upri_typ"},	// poif.sppl_cd
				{$poif + ".purc_dpt_cd", "purc_dpt_wg_cd"},	// poif.purc_dpt_cd
				{$poif + ".trd_cur_cd", "trd_cur_amt_dec_place;trd_cur_upri_dec_place"},	// poif.trd_cur_cd
				{$poif + ".itm_sub3", "sundry_itm_flg;mst_itm_nm;dscnt_itm_flg;asset_mng_typ;ver_flg;arr_skip_flg;base_unit_cd;base_unit_dec_place;base_unit_rnd_typ;sno1_mng_typ;sno2_mng_typ;sno3_mng_typ;sno4_mng_typ;itm_pay_crryovr_times;stk_mng_typ;itm_purc_upri_cng_flg"},	// poif.itm_sub3
				{$poif + ".in_to_loc_cd", "in_to_loc_wg_cd;str_ln_tgt_flg;outsrc_sppl_cd;in_to_loc_cal_cd;site_cd;lg_grp_cd"},	// poif.in_to_loc_cd
				{$poif + ".purc_rsn_cd", "xpns_purc_flg"},	// poif.purc_rsn_cd
				{$poif + ".bd_itm_sub3", "bd_lot_mng_typ;bd_lot_no_typ;bd_sublot_mng_typ;bd_sublot_no_typ;bd_sno1_mng_typ;bd_sno2_mng_typ;bd_sno3_mng_typ;bd_sno4_mng_typ"}	// poif.bd_itm_sub3
			}
		)),
		new MCExtMap.Entry($$LIST_OUT_BASE, new MCExtList(
			new String[][]{
				{$poif + ".sppl_cd", "sppl_iv_flg;prnt_lcl_cd;subcon_flg;pay_crryovr_times;sppl_cal_cd;purc_amt_rnd_typ;purc_tax_rnd_typ;sppl_ship_form_cd;po_print_cd;tel;fax;zip_cd;addr1;addr2;addr3;addr4;sppl_cntct_dpt;sppl_cntct_psn;ap_dpt_cd;cur_cd;upri_dec_place;amt_dec_place;purc_upri_req_typ;sppl_tterm_cd1;sppl_tterm_cd2;sppl_tterm_cd3;purc_upri_cng_flg;repurc_obli_flg;outsrc_upri_typ"},	// poif.sppl_cd
				{$poif + ".purc_dpt_cd", "wg_cd"},	// poif.purc_dpt_cd
				{$poif + ".trd_cur_cd", "amt_dec_place;upri_dec_place"},	// poif.trd_cur_cd
				{$poif + ".itm_sub3", "sundry_itm_flg;itm_nm;dscnt_itm_flg;asset_mng_typ;ver_flg;arr_skip_flg;unit_cd;dec_place;rnd_typ;sno1_mng_typ;sno2_mng_typ;sno3_mng_typ;sno4_mng_typ;pay_crryovr_times;stk_mng_typ;purc_upri_cng_flg"},	// poif.itm_sub3
				{$poif + ".in_to_loc_cd", "wg_cd;str_ln_tgt_flg;sppl_cd;cal_cd;site_cd;lg_grp_cd"},	// poif.in_to_loc_cd
				{$poif + ".purc_rsn_cd", "xpns_purc_flg"},	// poif.purc_rsn_cd
				{$poif + ".bd_itm_sub3", "lot_mng_typ;lot_no_typ;sublot_mng_typ;sublot_no_typ;sno1_mng_typ;sno2_mng_typ;sno3_mng_typ;sno4_mng_typ"}	// poif.bd_itm_sub3
			}
		)),
		new MCExtMap.Entry($$LIST_IN, new MCExtList(
			new String[][]{
				{$poif + ".sppl_cd", "MAC_BP_IS_SRCH_TYP.SPPL;po_dt"},	// poif.sppl_cd
				{$poif + ".purc_dpt_cd", "MAC_DPT_IS_SRCH_TYP.PURC;po_dt;purc_usr_cd"},	// poif.purc_dpt_cd
				{$poif + ".purc_usr_cd", "po_dt"},	// poif.purc_usr_cd
				{$poif + ".tterm_cd1", "MAC_TTERM_TYP.TTERM1"},	// poif.tterm_cd1
				{$poif + ".tterm_cd2", "MAC_TTERM_TYP.TTERM2"},	// poif.tterm_cd2
				{$poif + ".tterm_cd3", "MAC_TTERM_TYP.TTERM3"},	// poif.tterm_cd3
				{$poif + ".itm_sub3", "MAC_ITM_IS_SRCH_TYP.NOT_ASSET3;itm_cd;itm_sub1;itm_sub2"},	// poif.itm_sub3
				{$poif + ".maker_cd", "MAC_BP_IS_SRCH_TYP.MAKER;true"},	// poif.maker_cd
				{$poif + ".in_to_loc_cd", "MAC_LOC_IS_SRCH_TYP.COMM;po_dt"},	// poif.in_to_loc_cd
				{$poif + ".str_ln_cd", "in_to_loc_cd;true"},	// poif.str_ln_cd
				{$poif + ".mfg_loc_cd", "MAC_LOC_IS_SRCH_TYP.COMM;true"},	// poif.mfg_loc_cd
				{$poif + ".trd_unit_cd", "itm_cd;itm_sub1;itm_sub2;itm_sub3"},	// poif.trd_unit_cd
				{$poif + ".ap_dpt_cd", "MAC_DPT_IS_SRCH_TYP.AP;po_dt"},	// poif.ap_dpt_cd
				{$poif + ".bd_dpt_cd", "MAC_DPT_IS_SRCH_TYP.BD;po_dt"},	// poif.bd_dpt_cd
				{$poif + ".bd_itm_sub3", "MAC_ITM_IS_SRCH_TYP.ASSET1;bd_itm_cd;bd_itm_sub1;bd_itm_sub2"},	// poif.bd_itm_sub3
				{$poif + ".bd_loc_cd", "MAC_LOC_IS_SRCH_TYP.COMM"}	// poif.bd_loc_cd
			}
		)),
		new MCExtMap.Entry($$LIST_IN_BASE, new MCExtList(
			new String[][]{
				{$poif + ".sppl_cd", "bp_is_srch_typ;dt"},	// poif.sppl_cd
				{$poif + ".purc_dpt_cd", "dpt_is_srch_typ;dt;usr_cd"},	// poif.purc_dpt_cd
				{$poif + ".purc_usr_cd", "dt"},	// poif.purc_usr_cd
				{$poif + ".tterm_cd1", "tterm_typ"},	// poif.tterm_cd1
				{$poif + ".tterm_cd2", "tterm_typ"},	// poif.tterm_cd2
				{$poif + ".tterm_cd3", "tterm_typ"},	// poif.tterm_cd3
				{$poif + ".itm_sub3", "itm_is_srch_typ;itm_cd;itm_sub1;itm_sub2"},	// poif.itm_sub3
				{$poif + ".maker_cd", "bp_is_srch_typ;mode_nullval_flg"},	// poif.maker_cd
				{$poif + ".in_to_loc_cd", "loc_is_srch_typ;dt"},	// poif.in_to_loc_cd
				{$poif + ".str_ln_cd", "loc_cd;mode_nullval_flg"},	// poif.str_ln_cd
				{$poif + ".mfg_loc_cd", "loc_is_srch_typ;mode_nullval_flg"},	// poif.mfg_loc_cd
				{$poif + ".trd_unit_cd", "itm_cd;itm_sub1;itm_sub2;itm_sub3"},	// poif.trd_unit_cd
				{$poif + ".ap_dpt_cd", "dpt_is_srch_typ;dt"},	// poif.ap_dpt_cd
				{$poif + ".bd_dpt_cd", "dpt_is_srch_typ;dt"},	// poif.bd_dpt_cd
				{$poif + ".bd_itm_sub3", "itm_is_srch_typ;itm_cd;itm_sub1;itm_sub2"},	// poif.bd_itm_sub3
				{$poif + ".bd_loc_cd", "loc_is_srch_typ"}	// poif.bd_loc_cd
			}
		)),
		new MCExtMap.Entry($$CONST, new MCExtList(
			new String[][]{
				{$poif + ".data_crud_typ", "MAC_DATA_CRUD_TYP"},	// poif.data_crud_typ
				{$poif + ".trd_ptn_typ", "MAC_TRD_PTN_TYP"},	// poif.trd_ptn_typ
				{$poif + ".purc_id_typ", "MAC_PURC_ID_TYP"},	// poif.purc_id_typ
				{$poif + ".purc_upri_req_typ", "MAC_PURC_UPRI_REQ_TYP"}	// poif.purc_upri_req_typ
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
	protected PoRecvIf_Chk01_CndR_MC_A(ConstMetaList<? extends PoRecvIf_Chk01_CndR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public PoRecvIf_Chk01_CndR clone() {
		return (PoRecvIf_Chk01_CndR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public PoRecvIf_Chk01_CndR createInstance() {
		return (PoRecvIf_Chk01_CndR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public PoRecvIf_Chk01_CndR getValues(String... names) {
		return (PoRecvIf_Chk01_CndR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	public mcframe.serverMS.dbc.MST_PO_RECV_IF_R poif(){
		return (mcframe.serverMS.dbc.MST_PO_RECV_IF_R) getConstInnerRow(offset + 0, $poif);
	}
	
	public void poif(mcframe.serverMS.dbc.MST_PO_RECV_IF_R row){
		setConstInnerRow(offset + 0, $poif, row);
	}


	/**
	 * Error エラー.<p>
	 *
	 */
	public boolean err_flg() {
		return getConstBoolean(offset + 1, $err_flg);
	}

	/**
	 * Error エラー.<p>
	 *
	 */
	public void err_flg(boolean value) {
		setConstBoolean(offset + 1, $err_flg, value);
	}


	/**
	 * PO No. 発注ＮＯ.<p>
	 *
	 */
	public String po_no() {
		return getConstString(offset + 2, $po_no);
	}

	/**
	 * PO No. 発注ＮＯ.<p>
	 *
	 */
	public void po_no(String value) {
		setConstString(offset + 2, $po_no, value);
	}


	/**
	 * PO rev. number 発注改訂番号.<p>
	 *
	 */
	public MCNumber po_rev() {
		return getConstNumber(offset + 3, $po_rev);
	}

	/**
	 * PO rev. number 発注改訂番号.<p>
	 *
	 */
	public void po_rev(MCNumber value) {
		setConstNumber(offset + 3, $po_rev, value);
	}

	/**
	 * PO rev. number 発注改訂番号.<p>
	 *
	 */
	public void po_rev(int value) {
		setConstNumber(offset + 3, $po_rev, value);
	}

	/**
	 * PO rev. number 発注改訂番号.<p>
	 *
	 */
	public void po_rev(long value) {
		setConstNumber(offset + 3, $po_rev, value);
	}

	/**
	 * PO rev. number 発注改訂番号.<p>
	 *
	 */
	public void po_rev(float value) {
		setConstNumber(offset + 3, $po_rev, value);
	}

	/**
	 * PO rev. number 発注改訂番号.<p>
	 *
	 */
	public void po_rev(double value) {
		setConstNumber(offset + 3, $po_rev, value);
	}


	/**
	 * PO details No. 発注明細ＮＯ.<p>
	 *
	 */
	public String po_d_no() {
		return getConstString(offset + 4, $po_d_no);
	}

	/**
	 * PO details No. 発注明細ＮＯ.<p>
	 *
	 */
	public void po_d_no(String value) {
		setConstString(offset + 4, $po_d_no, value);
	}


	/**
	 * Header data update type ヘッダデータ更新区分.<p>
	 *
	 */
	public String hdr_data_crud_typ() {
		return getConstString(offset + 5, $hdr_data_crud_typ);
	}

	/**
	 * Header data update type ヘッダデータ更新区分.<p>
	 *
	 */
	public void hdr_data_crud_typ(String value) {
		setConstString(offset + 5, $hdr_data_crud_typ, value);
	}


	/**
	 * Purchasing dept. WG cd. 購買部門ＷＧ ＣＤ.<p>
	 *
	 */
	public String purc_dpt_wg_cd() {
		return getConstString(offset + 6, $purc_dpt_wg_cd);
	}

	/**
	 * Purchasing dept. WG cd. 購買部門ＷＧ ＣＤ.<p>
	 *
	 */
	public void purc_dpt_wg_cd(String value) {
		setConstString(offset + 6, $purc_dpt_wg_cd, value);
	}


	/**
	 * Supplier dept. 発注先部署.<p>
	 *
	 */
	public String sppl_cntct_dpt() {
		return getConstString(offset + 7, $sppl_cntct_dpt);
	}

	/**
	 * Supplier dept. 発注先部署.<p>
	 *
	 */
	public void sppl_cntct_dpt(String value) {
		setConstString(offset + 7, $sppl_cntct_dpt, value);
	}


	/**
	 * Supplier PIC 発注先担当者.<p>
	 *
	 */
	public String sppl_cntct_psn() {
		return getConstString(offset + 8, $sppl_cntct_psn);
	}

	/**
	 * Supplier PIC 発注先担当者.<p>
	 *
	 */
	public void sppl_cntct_psn(String value) {
		setConstString(offset + 8, $sppl_cntct_psn, value);
	}


	/**
	 * Supplier zip code 発注先郵便番号.<p>
	 *
	 */
	public String sppl_zip_cd() {
		return getConstString(offset + 9, $sppl_zip_cd);
	}

	/**
	 * Supplier zip code 発注先郵便番号.<p>
	 *
	 */
	public void sppl_zip_cd(String value) {
		setConstString(offset + 9, $sppl_zip_cd, value);
	}


	/**
	 * Supplier address 1 発注先住所１.<p>
	 *
	 */
	public String sppl_addr1() {
		return getConstString(offset + 10, $sppl_addr1);
	}

	/**
	 * Supplier address 1 発注先住所１.<p>
	 *
	 */
	public void sppl_addr1(String value) {
		setConstString(offset + 10, $sppl_addr1, value);
	}


	/**
	 * Supplier address 2 発注先住所２.<p>
	 *
	 */
	public String sppl_addr2() {
		return getConstString(offset + 11, $sppl_addr2);
	}

	/**
	 * Supplier address 2 発注先住所２.<p>
	 *
	 */
	public void sppl_addr2(String value) {
		setConstString(offset + 11, $sppl_addr2, value);
	}


	/**
	 * Supplier address 3 発注先住所３.<p>
	 *
	 */
	public String sppl_addr3() {
		return getConstString(offset + 12, $sppl_addr3);
	}

	/**
	 * Supplier address 3 発注先住所３.<p>
	 *
	 */
	public void sppl_addr3(String value) {
		setConstString(offset + 12, $sppl_addr3, value);
	}


	/**
	 * Supplier address 4 発注先住所４.<p>
	 *
	 */
	public String sppl_addr4() {
		return getConstString(offset + 13, $sppl_addr4);
	}

	/**
	 * Supplier address 4 発注先住所４.<p>
	 *
	 */
	public void sppl_addr4(String value) {
		setConstString(offset + 13, $sppl_addr4, value);
	}


	/**
	 * Supplier TEL 発注先ＴＥＬ.<p>
	 *
	 */
	public String sppl_tel() {
		return getConstString(offset + 14, $sppl_tel);
	}

	/**
	 * Supplier TEL 発注先ＴＥＬ.<p>
	 *
	 */
	public void sppl_tel(String value) {
		setConstString(offset + 14, $sppl_tel, value);
	}


	/**
	 * Supplier FAX 発注先ＦＡＸ.<p>
	 *
	 */
	public String sppl_fax() {
		return getConstString(offset + 15, $sppl_fax);
	}

	/**
	 * Supplier FAX 発注先ＦＡＸ.<p>
	 *
	 */
	public void sppl_fax(String value) {
		setConstString(offset + 15, $sppl_fax, value);
	}


	/**
	 * Report output locale cd. 帳票出力ロケールＣＤ.<p>
	 *
	 */
	public String prnt_lcl_cd() {
		return getConstString(offset + 16, $prnt_lcl_cd);
	}

	/**
	 * Report output locale cd. 帳票出力ロケールＣＤ.<p>
	 *
	 */
	public void prnt_lcl_cd(String value) {
		setConstString(offset + 16, $prnt_lcl_cd, value);
	}


	/**
	 * Supplier invoice transaction 発注先インボイス取引.<p>
	 *
	 */
	public boolean sppl_iv_flg() {
		return getConstBoolean(offset + 17, $sppl_iv_flg);
	}

	/**
	 * Supplier invoice transaction 発注先インボイス取引.<p>
	 *
	 */
	public void sppl_iv_flg(boolean value) {
		setConstBoolean(offset + 17, $sppl_iv_flg, value);
	}


	/**
	 * For subcontract 下請対象.<p>
	 *
	 */
	public boolean subcon_flg() {
		return getConstBoolean(offset + 18, $subcon_flg);
	}

	/**
	 * For subcontract 下請対象.<p>
	 *
	 */
	public void subcon_flg(boolean value) {
		setConstBoolean(offset + 18, $subcon_flg, value);
	}


	/**
	 * Repurchase obligation 買戻義務.<p>
	 *
	 */
	public boolean repurc_obli_flg() {
		return getConstBoolean(offset + 19, $repurc_obli_flg);
	}

	/**
	 * Repurchase obligation 買戻義務.<p>
	 *
	 */
	public void repurc_obli_flg(boolean value) {
		setConstBoolean(offset + 19, $repurc_obli_flg, value);
	}


	/**
	 * Subcontracting unit price type 外注単価区分.<p>
	 *
	 */
	public String outsrc_upri_typ() {
		return getConstString(offset + 20, $outsrc_upri_typ);
	}

	/**
	 * Subcontracting unit price type 外注単価区分.<p>
	 *
	 */
	public void outsrc_upri_typ(String value) {
		setConstString(offset + 20, $outsrc_upri_typ, value);
	}


	/**
	 * Supplier payment carry-over count 発注先支払繰越回数.<p>
	 *
	 */
	public MCNumber sppl_pay_crryovr_times() {
		return getConstNumber(offset + 21, $sppl_pay_crryovr_times);
	}

	/**
	 * Supplier payment carry-over count 発注先支払繰越回数.<p>
	 *
	 */
	public void sppl_pay_crryovr_times(MCNumber value) {
		setConstNumber(offset + 21, $sppl_pay_crryovr_times, value);
	}

	/**
	 * Supplier payment carry-over count 発注先支払繰越回数.<p>
	 *
	 */
	public void sppl_pay_crryovr_times(int value) {
		setConstNumber(offset + 21, $sppl_pay_crryovr_times, value);
	}

	/**
	 * Supplier payment carry-over count 発注先支払繰越回数.<p>
	 *
	 */
	public void sppl_pay_crryovr_times(long value) {
		setConstNumber(offset + 21, $sppl_pay_crryovr_times, value);
	}

	/**
	 * Supplier payment carry-over count 発注先支払繰越回数.<p>
	 *
	 */
	public void sppl_pay_crryovr_times(float value) {
		setConstNumber(offset + 21, $sppl_pay_crryovr_times, value);
	}

	/**
	 * Supplier payment carry-over count 発注先支払繰越回数.<p>
	 *
	 */
	public void sppl_pay_crryovr_times(double value) {
		setConstNumber(offset + 21, $sppl_pay_crryovr_times, value);
	}


	/**
	 * Allow changing supplier purchasing unit price 発注先購買単価変更許可.<p>
	 *
	 */
	public boolean sppl_purc_upri_cng_flg() {
		return getConstBoolean(offset + 22, $sppl_purc_upri_cng_flg);
	}

	/**
	 * Allow changing supplier purchasing unit price 発注先購買単価変更許可.<p>
	 *
	 */
	public void sppl_purc_upri_cng_flg(boolean value) {
		setConstBoolean(offset + 22, $sppl_purc_upri_cng_flg, value);
	}


	/**
	 * Supplier delivery note cd. 発注先納品書ＣＤ.<p>
	 *
	 */
	public String sppl_ship_form_cd() {
		return getConstString(offset + 23, $sppl_ship_form_cd);
	}

	/**
	 * Supplier delivery note cd. 発注先納品書ＣＤ.<p>
	 *
	 */
	public void sppl_ship_form_cd(String value) {
		setConstString(offset + 23, $sppl_ship_form_cd, value);
	}


	/**
	 * Rounding type (Purchase amount) 仕入金額端数処理区分.<p>
	 *
	 */
	public String purc_amt_rnd_typ() {
		return getConstString(offset + 24, $purc_amt_rnd_typ);
	}

	/**
	 * Rounding type (Purchase amount) 仕入金額端数処理区分.<p>
	 *
	 */
	public void purc_amt_rnd_typ(String value) {
		setConstString(offset + 24, $purc_amt_rnd_typ, value);
	}


	/**
	 * Purchase tax rounding type 仕入税端数処理区分.<p>
	 *
	 */
	public String purc_tax_rnd_typ() {
		return getConstString(offset + 25, $purc_tax_rnd_typ);
	}

	/**
	 * Purchase tax rounding type 仕入税端数処理区分.<p>
	 *
	 */
	public void purc_tax_rnd_typ(String value) {
		setConstString(offset + 25, $purc_tax_rnd_typ, value);
	}


	/**
	 * Supplier calendar cd. 発注先カレンダＣＤ.<p>
	 *
	 */
	public String sppl_cal_cd() {
		return getConstString(offset + 26, $sppl_cal_cd);
	}

	/**
	 * Supplier calendar cd. 発注先カレンダＣＤ.<p>
	 *
	 */
	public void sppl_cal_cd(String value) {
		setConstString(offset + 26, $sppl_cal_cd, value);
	}


	/**
	 * Display PO sheet cd. (Master) 注文書表示ＣＤ（マスタ）.<p>
	 *
	 */
	public String sppl_po_print_cd() {
		return getConstString(offset + 27, $sppl_po_print_cd);
	}

	/**
	 * Display PO sheet cd. (Master) 注文書表示ＣＤ（マスタ）.<p>
	 *
	 */
	public void sppl_po_print_cd(String value) {
		setConstString(offset + 27, $sppl_po_print_cd, value);
	}


	/**
	 * Transaction amount number of decimal places 取引金額小数部有効桁数.<p>
	 *
	 */
	public MCNumber trd_cur_amt_dec_place() {
		return getConstNumber(offset + 28, $trd_cur_amt_dec_place);
	}

	/**
	 * Transaction amount number of decimal places 取引金額小数部有効桁数.<p>
	 *
	 */
	public void trd_cur_amt_dec_place(MCNumber value) {
		setConstNumber(offset + 28, $trd_cur_amt_dec_place, value);
	}

	/**
	 * Transaction amount number of decimal places 取引金額小数部有効桁数.<p>
	 *
	 */
	public void trd_cur_amt_dec_place(int value) {
		setConstNumber(offset + 28, $trd_cur_amt_dec_place, value);
	}

	/**
	 * Transaction amount number of decimal places 取引金額小数部有効桁数.<p>
	 *
	 */
	public void trd_cur_amt_dec_place(long value) {
		setConstNumber(offset + 28, $trd_cur_amt_dec_place, value);
	}

	/**
	 * Transaction amount number of decimal places 取引金額小数部有効桁数.<p>
	 *
	 */
	public void trd_cur_amt_dec_place(float value) {
		setConstNumber(offset + 28, $trd_cur_amt_dec_place, value);
	}

	/**
	 * Transaction amount number of decimal places 取引金額小数部有効桁数.<p>
	 *
	 */
	public void trd_cur_amt_dec_place(double value) {
		setConstNumber(offset + 28, $trd_cur_amt_dec_place, value);
	}


	/**
	 * Transaction unit price number of decimal places 取引単価小数部有効桁数.<p>
	 *
	 */
	public MCNumber trd_cur_upri_dec_place() {
		return getConstNumber(offset + 29, $trd_cur_upri_dec_place);
	}

	/**
	 * Transaction unit price number of decimal places 取引単価小数部有効桁数.<p>
	 *
	 */
	public void trd_cur_upri_dec_place(MCNumber value) {
		setConstNumber(offset + 29, $trd_cur_upri_dec_place, value);
	}

	/**
	 * Transaction unit price number of decimal places 取引単価小数部有効桁数.<p>
	 *
	 */
	public void trd_cur_upri_dec_place(int value) {
		setConstNumber(offset + 29, $trd_cur_upri_dec_place, value);
	}

	/**
	 * Transaction unit price number of decimal places 取引単価小数部有効桁数.<p>
	 *
	 */
	public void trd_cur_upri_dec_place(long value) {
		setConstNumber(offset + 29, $trd_cur_upri_dec_place, value);
	}

	/**
	 * Transaction unit price number of decimal places 取引単価小数部有効桁数.<p>
	 *
	 */
	public void trd_cur_upri_dec_place(float value) {
		setConstNumber(offset + 29, $trd_cur_upri_dec_place, value);
	}

	/**
	 * Transaction unit price number of decimal places 取引単価小数部有効桁数.<p>
	 *
	 */
	public void trd_cur_upri_dec_place(double value) {
		setConstNumber(offset + 29, $trd_cur_upri_dec_place, value);
	}


	/**
	 * Base currency cd. 基準通貨ＣＤ.<p>
	 *
	 */
	public String base_cur_cd() {
		return getConstString(offset + 30, $base_cur_cd);
	}

	/**
	 * Base currency cd. 基準通貨ＣＤ.<p>
	 *
	 */
	public void base_cur_cd(String value) {
		setConstString(offset + 30, $base_cur_cd, value);
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
	 * Withholding tax rounding type 源泉徴収税端数処理区分.<p>
	 *
	 */
	public String wtax_rnd_typ() {
		return getConstString(offset + 32, $wtax_rnd_typ);
	}

	/**
	 * Withholding tax rounding type 源泉徴収税端数処理区分.<p>
	 *
	 */
	public void wtax_rnd_typ(String value) {
		setConstString(offset + 32, $wtax_rnd_typ, value);
	}


	/**
	 * Tax type 税区分.<p>
	 *
	 */
	public String tax_typ() {
		return getConstString(offset + 33, $tax_typ);
	}

	/**
	 * Tax type 税区分.<p>
	 *
	 */
	public void tax_typ(String value) {
		setConstString(offset + 33, $tax_typ, value);
	}


	/**
	 * Tax inclusive 内税.<p>
	 *
	 */
	public boolean inc_tax_flg() {
		return getConstBoolean(offset + 34, $inc_tax_flg);
	}

	/**
	 * Tax inclusive 内税.<p>
	 *
	 */
	public void inc_tax_flg(boolean value) {
		setConstBoolean(offset + 34, $inc_tax_flg, value);
	}


	/**
	 * Tax rate 税率.<p>
	 *
	 */
	public MCNumber tax_rate() {
		return getConstNumber(offset + 35, $tax_rate);
	}

	/**
	 * Tax rate 税率.<p>
	 *
	 */
	public void tax_rate(MCNumber value) {
		setConstNumber(offset + 35, $tax_rate, value);
	}

	/**
	 * Tax rate 税率.<p>
	 *
	 */
	public void tax_rate(int value) {
		setConstNumber(offset + 35, $tax_rate, value);
	}

	/**
	 * Tax rate 税率.<p>
	 *
	 */
	public void tax_rate(long value) {
		setConstNumber(offset + 35, $tax_rate, value);
	}

	/**
	 * Tax rate 税率.<p>
	 *
	 */
	public void tax_rate(float value) {
		setConstNumber(offset + 35, $tax_rate, value);
	}

	/**
	 * Tax rate 税率.<p>
	 *
	 */
	public void tax_rate(double value) {
		setConstNumber(offset + 35, $tax_rate, value);
	}


	/**
	 * Subcontracting amount (Transaction currency) 取引通貨加工金額.<p>
	 *
	 */
	public MCNumber trd_cur_proc_amt() {
		return getConstNumber(offset + 36, $trd_cur_proc_amt);
	}

	/**
	 * Subcontracting amount (Transaction currency) 取引通貨加工金額.<p>
	 *
	 */
	public void trd_cur_proc_amt(MCNumber value) {
		setConstNumber(offset + 36, $trd_cur_proc_amt, value);
	}

	/**
	 * Subcontracting amount (Transaction currency) 取引通貨加工金額.<p>
	 *
	 */
	public void trd_cur_proc_amt(int value) {
		setConstNumber(offset + 36, $trd_cur_proc_amt, value);
	}

	/**
	 * Subcontracting amount (Transaction currency) 取引通貨加工金額.<p>
	 *
	 */
	public void trd_cur_proc_amt(long value) {
		setConstNumber(offset + 36, $trd_cur_proc_amt, value);
	}

	/**
	 * Subcontracting amount (Transaction currency) 取引通貨加工金額.<p>
	 *
	 */
	public void trd_cur_proc_amt(float value) {
		setConstNumber(offset + 36, $trd_cur_proc_amt, value);
	}

	/**
	 * Subcontracting amount (Transaction currency) 取引通貨加工金額.<p>
	 *
	 */
	public void trd_cur_proc_amt(double value) {
		setConstNumber(offset + 36, $trd_cur_proc_amt, value);
	}


	/**
	 * Chargeable supply amount (Transaction currency) 取引通貨有償支給金額.<p>
	 *
	 */
	public MCNumber trd_cur_onr_prov_amt() {
		return getConstNumber(offset + 37, $trd_cur_onr_prov_amt);
	}

	/**
	 * Chargeable supply amount (Transaction currency) 取引通貨有償支給金額.<p>
	 *
	 */
	public void trd_cur_onr_prov_amt(MCNumber value) {
		setConstNumber(offset + 37, $trd_cur_onr_prov_amt, value);
	}

	/**
	 * Chargeable supply amount (Transaction currency) 取引通貨有償支給金額.<p>
	 *
	 */
	public void trd_cur_onr_prov_amt(int value) {
		setConstNumber(offset + 37, $trd_cur_onr_prov_amt, value);
	}

	/**
	 * Chargeable supply amount (Transaction currency) 取引通貨有償支給金額.<p>
	 *
	 */
	public void trd_cur_onr_prov_amt(long value) {
		setConstNumber(offset + 37, $trd_cur_onr_prov_amt, value);
	}

	/**
	 * Chargeable supply amount (Transaction currency) 取引通貨有償支給金額.<p>
	 *
	 */
	public void trd_cur_onr_prov_amt(float value) {
		setConstNumber(offset + 37, $trd_cur_onr_prov_amt, value);
	}

	/**
	 * Chargeable supply amount (Transaction currency) 取引通貨有償支給金額.<p>
	 *
	 */
	public void trd_cur_onr_prov_amt(double value) {
		setConstNumber(offset + 37, $trd_cur_onr_prov_amt, value);
	}


	/**
	 * Amount (Transaction currency) 取引通貨金額.<p>
	 *
	 */
	public MCNumber trd_cur_amt() {
		return getConstNumber(offset + 38, $trd_cur_amt);
	}

	/**
	 * Amount (Transaction currency) 取引通貨金額.<p>
	 *
	 */
	public void trd_cur_amt(MCNumber value) {
		setConstNumber(offset + 38, $trd_cur_amt, value);
	}

	/**
	 * Amount (Transaction currency) 取引通貨金額.<p>
	 *
	 */
	public void trd_cur_amt(int value) {
		setConstNumber(offset + 38, $trd_cur_amt, value);
	}

	/**
	 * Amount (Transaction currency) 取引通貨金額.<p>
	 *
	 */
	public void trd_cur_amt(long value) {
		setConstNumber(offset + 38, $trd_cur_amt, value);
	}

	/**
	 * Amount (Transaction currency) 取引通貨金額.<p>
	 *
	 */
	public void trd_cur_amt(float value) {
		setConstNumber(offset + 38, $trd_cur_amt, value);
	}

	/**
	 * Amount (Transaction currency) 取引通貨金額.<p>
	 *
	 */
	public void trd_cur_amt(double value) {
		setConstNumber(offset + 38, $trd_cur_amt, value);
	}


	/**
	 * Tax amount (Transaction currency) 取引通貨税額.<p>
	 *
	 */
	public MCNumber trd_cur_tax_amt() {
		return getConstNumber(offset + 39, $trd_cur_tax_amt);
	}

	/**
	 * Tax amount (Transaction currency) 取引通貨税額.<p>
	 *
	 */
	public void trd_cur_tax_amt(MCNumber value) {
		setConstNumber(offset + 39, $trd_cur_tax_amt, value);
	}

	/**
	 * Tax amount (Transaction currency) 取引通貨税額.<p>
	 *
	 */
	public void trd_cur_tax_amt(int value) {
		setConstNumber(offset + 39, $trd_cur_tax_amt, value);
	}

	/**
	 * Tax amount (Transaction currency) 取引通貨税額.<p>
	 *
	 */
	public void trd_cur_tax_amt(long value) {
		setConstNumber(offset + 39, $trd_cur_tax_amt, value);
	}

	/**
	 * Tax amount (Transaction currency) 取引通貨税額.<p>
	 *
	 */
	public void trd_cur_tax_amt(float value) {
		setConstNumber(offset + 39, $trd_cur_tax_amt, value);
	}

	/**
	 * Tax amount (Transaction currency) 取引通貨税額.<p>
	 *
	 */
	public void trd_cur_tax_amt(double value) {
		setConstNumber(offset + 39, $trd_cur_tax_amt, value);
	}


	/**
	 * Withholding tax 源泉税額.<p>
	 *
	 */
	public MCNumber wtax_amt() {
		return getConstNumber(offset + 40, $wtax_amt);
	}

	/**
	 * Withholding tax 源泉税額.<p>
	 *
	 */
	public void wtax_amt(MCNumber value) {
		setConstNumber(offset + 40, $wtax_amt, value);
	}

	/**
	 * Withholding tax 源泉税額.<p>
	 *
	 */
	public void wtax_amt(int value) {
		setConstNumber(offset + 40, $wtax_amt, value);
	}

	/**
	 * Withholding tax 源泉税額.<p>
	 *
	 */
	public void wtax_amt(long value) {
		setConstNumber(offset + 40, $wtax_amt, value);
	}

	/**
	 * Withholding tax 源泉税額.<p>
	 *
	 */
	public void wtax_amt(float value) {
		setConstNumber(offset + 40, $wtax_amt, value);
	}

	/**
	 * Withholding tax 源泉税額.<p>
	 *
	 */
	public void wtax_amt(double value) {
		setConstNumber(offset + 40, $wtax_amt, value);
	}


	/**
	 * Amount number of decimal places (Master) 金額小数部有効桁数（マスタ）.<p>
	 *
	 */
	public MCNumber sppl_amt_dec_place() {
		return getConstNumber(offset + 41, $sppl_amt_dec_place);
	}

	/**
	 * Amount number of decimal places (Master) 金額小数部有効桁数（マスタ）.<p>
	 *
	 */
	public void sppl_amt_dec_place(MCNumber value) {
		setConstNumber(offset + 41, $sppl_amt_dec_place, value);
	}

	/**
	 * Amount number of decimal places (Master) 金額小数部有効桁数（マスタ）.<p>
	 *
	 */
	public void sppl_amt_dec_place(int value) {
		setConstNumber(offset + 41, $sppl_amt_dec_place, value);
	}

	/**
	 * Amount number of decimal places (Master) 金額小数部有効桁数（マスタ）.<p>
	 *
	 */
	public void sppl_amt_dec_place(long value) {
		setConstNumber(offset + 41, $sppl_amt_dec_place, value);
	}

	/**
	 * Amount number of decimal places (Master) 金額小数部有効桁数（マスタ）.<p>
	 *
	 */
	public void sppl_amt_dec_place(float value) {
		setConstNumber(offset + 41, $sppl_amt_dec_place, value);
	}

	/**
	 * Amount number of decimal places (Master) 金額小数部有効桁数（マスタ）.<p>
	 *
	 */
	public void sppl_amt_dec_place(double value) {
		setConstNumber(offset + 41, $sppl_amt_dec_place, value);
	}


	/**
	 * Unit price number of decimal places (Master) 単価小数部有効桁数（マスタ）.<p>
	 *
	 */
	public MCNumber sppl_upri_dec_place() {
		return getConstNumber(offset + 42, $sppl_upri_dec_place);
	}

	/**
	 * Unit price number of decimal places (Master) 単価小数部有効桁数（マスタ）.<p>
	 *
	 */
	public void sppl_upri_dec_place(MCNumber value) {
		setConstNumber(offset + 42, $sppl_upri_dec_place, value);
	}

	/**
	 * Unit price number of decimal places (Master) 単価小数部有効桁数（マスタ）.<p>
	 *
	 */
	public void sppl_upri_dec_place(int value) {
		setConstNumber(offset + 42, $sppl_upri_dec_place, value);
	}

	/**
	 * Unit price number of decimal places (Master) 単価小数部有効桁数（マスタ）.<p>
	 *
	 */
	public void sppl_upri_dec_place(long value) {
		setConstNumber(offset + 42, $sppl_upri_dec_place, value);
	}

	/**
	 * Unit price number of decimal places (Master) 単価小数部有効桁数（マスタ）.<p>
	 *
	 */
	public void sppl_upri_dec_place(float value) {
		setConstNumber(offset + 42, $sppl_upri_dec_place, value);
	}

	/**
	 * Unit price number of decimal places (Master) 単価小数部有効桁数（マスタ）.<p>
	 *
	 */
	public void sppl_upri_dec_place(double value) {
		setConstNumber(offset + 42, $sppl_upri_dec_place, value);
	}


	/**
	 * Sales project No. 案件ＮＯ.<p>
	 *
	 */
	public String wrk_no() {
		return getConstString(offset + 43, $wrk_no);
	}

	/**
	 * Sales project No. 案件ＮＯ.<p>
	 *
	 */
	public void wrk_no(String value) {
		setConstString(offset + 43, $wrk_no, value);
	}


	/**
	 * AP dept. cd. (Master) 債務部門ＣＤ（マスタ）.<p>
	 *
	 */
	public String sppl_ap_dpt_cd() {
		return getConstString(offset + 44, $sppl_ap_dpt_cd);
	}

	/**
	 * AP dept. cd. (Master) 債務部門ＣＤ（マスタ）.<p>
	 *
	 */
	public void sppl_ap_dpt_cd(String value) {
		setConstString(offset + 44, $sppl_ap_dpt_cd, value);
	}


	/**
	 * Transaction currency cd. (Master) 取引通貨ＣＤ（マスタ）.<p>
	 *
	 */
	public String sppl_trd_cur_cd() {
		return getConstString(offset + 45, $sppl_trd_cur_cd);
	}

	/**
	 * Transaction currency cd. (Master) 取引通貨ＣＤ（マスタ）.<p>
	 *
	 */
	public void sppl_trd_cur_cd(String value) {
		setConstString(offset + 45, $sppl_trd_cur_cd, value);
	}


	/**
	 * Purchase unit price acquisition type (Master) 購買単価取得区分（マスタ）.<p>
	 *
	 */
	public String sppl_purc_upri_req_typ() {
		return getConstString(offset + 46, $sppl_purc_upri_req_typ);
	}

	/**
	 * Purchase unit price acquisition type (Master) 購買単価取得区分（マスタ）.<p>
	 *
	 */
	public void sppl_purc_upri_req_typ(String value) {
		setConstString(offset + 46, $sppl_purc_upri_req_typ, value);
	}


	/**
	 * Transaction terms cd. 1 (Master) 取引条件ＣＤ１（マスタ）.<p>
	 *
	 */
	public String sppl_tterm_cd1() {
		return getConstString(offset + 47, $sppl_tterm_cd1);
	}

	/**
	 * Transaction terms cd. 1 (Master) 取引条件ＣＤ１（マスタ）.<p>
	 *
	 */
	public void sppl_tterm_cd1(String value) {
		setConstString(offset + 47, $sppl_tterm_cd1, value);
	}


	/**
	 * Transaction terms cd. 2 (Master) 取引条件ＣＤ２（マスタ）.<p>
	 *
	 */
	public String sppl_tterm_cd2() {
		return getConstString(offset + 48, $sppl_tterm_cd2);
	}

	/**
	 * Transaction terms cd. 2 (Master) 取引条件ＣＤ２（マスタ）.<p>
	 *
	 */
	public void sppl_tterm_cd2(String value) {
		setConstString(offset + 48, $sppl_tterm_cd2, value);
	}


	/**
	 * Transaction terms cd. 3 (Master) 取引条件ＣＤ３（マスタ）.<p>
	 *
	 */
	public String sppl_tterm_cd3() {
		return getConstString(offset + 49, $sppl_tterm_cd3);
	}

	/**
	 * Transaction terms cd. 3 (Master) 取引条件ＣＤ３（マスタ）.<p>
	 *
	 */
	public void sppl_tterm_cd3(String value) {
		setConstString(offset + 49, $sppl_tterm_cd3, value);
	}


	/**
	 * Item name (Master) 品名（マスタ）.<p>
	 *
	 */
	public String mst_itm_nm() {
		return getConstString(offset + 50, $mst_itm_nm);
	}

	/**
	 * Item name (Master) 品名（マスタ）.<p>
	 *
	 */
	public void mst_itm_nm(String value) {
		setConstString(offset + 50, $mst_itm_nm, value);
	}


	/**
	 * Asset management type 資産管理区分.<p>
	 *
	 */
	public String asset_mng_typ() {
		return getConstString(offset + 51, $asset_mng_typ);
	}

	/**
	 * Asset management type 資産管理区分.<p>
	 *
	 */
	public void asset_mng_typ(String value) {
		setConstString(offset + 51, $asset_mng_typ, value);
	}


	/**
	 * Miscellaneous item 諸口品.<p>
	 *
	 */
	public boolean sundry_itm_flg() {
		return getConstBoolean(offset + 52, $sundry_itm_flg);
	}

	/**
	 * Miscellaneous item 諸口品.<p>
	 *
	 */
	public void sundry_itm_flg(boolean value) {
		setConstBoolean(offset + 52, $sundry_itm_flg, value);
	}


	/**
	 * Discount item 値引品目.<p>
	 *
	 */
	public boolean dscnt_itm_flg() {
		return getConstBoolean(offset + 53, $dscnt_itm_flg);
	}

	/**
	 * Discount item 値引品目.<p>
	 *
	 */
	public void dscnt_itm_flg(boolean value) {
		setConstBoolean(offset + 53, $dscnt_itm_flg, value);
	}


	/**
	 * For version control 版管理対象.<p>
	 *
	 */
	public boolean ver_flg() {
		return getConstBoolean(offset + 54, $ver_flg);
	}

	/**
	 * For version control 版管理対象.<p>
	 *
	 */
	public void ver_flg(boolean value) {
		setConstBoolean(offset + 54, $ver_flg, value);
	}


	/**
	 * Item payment carry-over count 品目支払繰越回数.<p>
	 *
	 */
	public MCNumber itm_pay_crryovr_times() {
		return getConstNumber(offset + 55, $itm_pay_crryovr_times);
	}

	/**
	 * Item payment carry-over count 品目支払繰越回数.<p>
	 *
	 */
	public void itm_pay_crryovr_times(MCNumber value) {
		setConstNumber(offset + 55, $itm_pay_crryovr_times, value);
	}

	/**
	 * Item payment carry-over count 品目支払繰越回数.<p>
	 *
	 */
	public void itm_pay_crryovr_times(int value) {
		setConstNumber(offset + 55, $itm_pay_crryovr_times, value);
	}

	/**
	 * Item payment carry-over count 品目支払繰越回数.<p>
	 *
	 */
	public void itm_pay_crryovr_times(long value) {
		setConstNumber(offset + 55, $itm_pay_crryovr_times, value);
	}

	/**
	 * Item payment carry-over count 品目支払繰越回数.<p>
	 *
	 */
	public void itm_pay_crryovr_times(float value) {
		setConstNumber(offset + 55, $itm_pay_crryovr_times, value);
	}

	/**
	 * Item payment carry-over count 品目支払繰越回数.<p>
	 *
	 */
	public void itm_pay_crryovr_times(double value) {
		setConstNumber(offset + 55, $itm_pay_crryovr_times, value);
	}


	/**
	 * Allow item purchasing unit price change 品目購買単価変更許可.<p>
	 *
	 */
	public boolean itm_purc_upri_cng_flg() {
		return getConstBoolean(offset + 56, $itm_purc_upri_cng_flg);
	}

	/**
	 * Allow item purchasing unit price change 品目購買単価変更許可.<p>
	 *
	 */
	public void itm_purc_upri_cng_flg(boolean value) {
		setConstBoolean(offset + 56, $itm_purc_upri_cng_flg, value);
	}


	/**
	 * SEIBAN No. 1 management type 手配ＮＯ１管理区分.<p>
	 *
	 */
	public String sno1_mng_typ() {
		return getConstString(offset + 57, $sno1_mng_typ);
	}

	/**
	 * SEIBAN No. 1 management type 手配ＮＯ１管理区分.<p>
	 *
	 */
	public void sno1_mng_typ(String value) {
		setConstString(offset + 57, $sno1_mng_typ, value);
	}


	/**
	 * SEIBAN No. 2 management type 手配ＮＯ２管理区分.<p>
	 *
	 */
	public String sno2_mng_typ() {
		return getConstString(offset + 58, $sno2_mng_typ);
	}

	/**
	 * SEIBAN No. 2 management type 手配ＮＯ２管理区分.<p>
	 *
	 */
	public void sno2_mng_typ(String value) {
		setConstString(offset + 58, $sno2_mng_typ, value);
	}


	/**
	 * SEIBAN No. 3 management type 手配ＮＯ３管理区分.<p>
	 *
	 */
	public String sno3_mng_typ() {
		return getConstString(offset + 59, $sno3_mng_typ);
	}

	/**
	 * SEIBAN No. 3 management type 手配ＮＯ３管理区分.<p>
	 *
	 */
	public void sno3_mng_typ(String value) {
		setConstString(offset + 59, $sno3_mng_typ, value);
	}


	/**
	 * SEIBAN No. 4 management type 手配ＮＯ４管理区分.<p>
	 *
	 */
	public String sno4_mng_typ() {
		return getConstString(offset + 60, $sno4_mng_typ);
	}

	/**
	 * SEIBAN No. 4 management type 手配ＮＯ４管理区分.<p>
	 *
	 */
	public void sno4_mng_typ(String value) {
		setConstString(offset + 60, $sno4_mng_typ, value);
	}


	/**
	 * Inventory management type 在庫管理区分.<p>
	 *
	 */
	public String stk_mng_typ() {
		return getConstString(offset + 61, $stk_mng_typ);
	}

	/**
	 * Inventory management type 在庫管理区分.<p>
	 *
	 */
	public void stk_mng_typ(String value) {
		setConstString(offset + 61, $stk_mng_typ, value);
	}


	/**
	 * Receipt unnecessary 入荷不要.<p>
	 *
	 */
	public boolean arr_skip_flg() {
		return getConstBoolean(offset + 62, $arr_skip_flg);
	}

	/**
	 * Receipt unnecessary 入荷不要.<p>
	 *
	 */
	public void arr_skip_flg(boolean value) {
		setConstBoolean(offset + 62, $arr_skip_flg, value);
	}


	/**
	 * Transaction unit number of decimal places 取引単位小数部有効桁数.<p>
	 *
	 */
	public MCNumber trd_unit_dec_place() {
		return getConstNumber(offset + 63, $trd_unit_dec_place);
	}

	/**
	 * Transaction unit number of decimal places 取引単位小数部有効桁数.<p>
	 *
	 */
	public void trd_unit_dec_place(MCNumber value) {
		setConstNumber(offset + 63, $trd_unit_dec_place, value);
	}

	/**
	 * Transaction unit number of decimal places 取引単位小数部有効桁数.<p>
	 *
	 */
	public void trd_unit_dec_place(int value) {
		setConstNumber(offset + 63, $trd_unit_dec_place, value);
	}

	/**
	 * Transaction unit number of decimal places 取引単位小数部有効桁数.<p>
	 *
	 */
	public void trd_unit_dec_place(long value) {
		setConstNumber(offset + 63, $trd_unit_dec_place, value);
	}

	/**
	 * Transaction unit number of decimal places 取引単位小数部有効桁数.<p>
	 *
	 */
	public void trd_unit_dec_place(float value) {
		setConstNumber(offset + 63, $trd_unit_dec_place, value);
	}

	/**
	 * Transaction unit number of decimal places 取引単位小数部有効桁数.<p>
	 *
	 */
	public void trd_unit_dec_place(double value) {
		setConstNumber(offset + 63, $trd_unit_dec_place, value);
	}


	/**
	 * Transaction unit rounding type 取引単位端数処理区分.<p>
	 *
	 */
	public String trd_unit_rnd_typ() {
		return getConstString(offset + 64, $trd_unit_rnd_typ);
	}

	/**
	 * Transaction unit rounding type 取引単位端数処理区分.<p>
	 *
	 */
	public void trd_unit_rnd_typ(String value) {
		setConstString(offset + 64, $trd_unit_rnd_typ, value);
	}


	/**
	 * Transaction unit conversion base qty. 取引単位換算基準数量.<p>
	 *
	 */
	public MCNumber trd_unit_conv_base_qty() {
		return getConstNumber(offset + 65, $trd_unit_conv_base_qty);
	}

	/**
	 * Transaction unit conversion base qty. 取引単位換算基準数量.<p>
	 *
	 */
	public void trd_unit_conv_base_qty(MCNumber value) {
		setConstNumber(offset + 65, $trd_unit_conv_base_qty, value);
	}

	/**
	 * Transaction unit conversion base qty. 取引単位換算基準数量.<p>
	 *
	 */
	public void trd_unit_conv_base_qty(int value) {
		setConstNumber(offset + 65, $trd_unit_conv_base_qty, value);
	}

	/**
	 * Transaction unit conversion base qty. 取引単位換算基準数量.<p>
	 *
	 */
	public void trd_unit_conv_base_qty(long value) {
		setConstNumber(offset + 65, $trd_unit_conv_base_qty, value);
	}

	/**
	 * Transaction unit conversion base qty. 取引単位換算基準数量.<p>
	 *
	 */
	public void trd_unit_conv_base_qty(float value) {
		setConstNumber(offset + 65, $trd_unit_conv_base_qty, value);
	}

	/**
	 * Transaction unit conversion base qty. 取引単位換算基準数量.<p>
	 *
	 */
	public void trd_unit_conv_base_qty(double value) {
		setConstNumber(offset + 65, $trd_unit_conv_base_qty, value);
	}


	/**
	 * Transaction unit conversion qty. 取引単位換算数量.<p>
	 *
	 */
	public MCNumber trd_unit_conv_qty() {
		return getConstNumber(offset + 66, $trd_unit_conv_qty);
	}

	/**
	 * Transaction unit conversion qty. 取引単位換算数量.<p>
	 *
	 */
	public void trd_unit_conv_qty(MCNumber value) {
		setConstNumber(offset + 66, $trd_unit_conv_qty, value);
	}

	/**
	 * Transaction unit conversion qty. 取引単位換算数量.<p>
	 *
	 */
	public void trd_unit_conv_qty(int value) {
		setConstNumber(offset + 66, $trd_unit_conv_qty, value);
	}

	/**
	 * Transaction unit conversion qty. 取引単位換算数量.<p>
	 *
	 */
	public void trd_unit_conv_qty(long value) {
		setConstNumber(offset + 66, $trd_unit_conv_qty, value);
	}

	/**
	 * Transaction unit conversion qty. 取引単位換算数量.<p>
	 *
	 */
	public void trd_unit_conv_qty(float value) {
		setConstNumber(offset + 66, $trd_unit_conv_qty, value);
	}

	/**
	 * Transaction unit conversion qty. 取引単位換算数量.<p>
	 *
	 */
	public void trd_unit_conv_qty(double value) {
		setConstNumber(offset + 66, $trd_unit_conv_qty, value);
	}


	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public MCNumber base_unit_qty() {
		return getConstNumber(offset + 67, $base_unit_qty);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(MCNumber value) {
		setConstNumber(offset + 67, $base_unit_qty, value);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(int value) {
		setConstNumber(offset + 67, $base_unit_qty, value);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(long value) {
		setConstNumber(offset + 67, $base_unit_qty, value);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(float value) {
		setConstNumber(offset + 67, $base_unit_qty, value);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(double value) {
		setConstNumber(offset + 67, $base_unit_qty, value);
	}


	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public String base_unit_cd() {
		return getConstString(offset + 68, $base_unit_cd);
	}

	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public void base_unit_cd(String value) {
		setConstString(offset + 68, $base_unit_cd, value);
	}


	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public MCNumber base_unit_dec_place() {
		return getConstNumber(offset + 69, $base_unit_dec_place);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(MCNumber value) {
		setConstNumber(offset + 69, $base_unit_dec_place, value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(int value) {
		setConstNumber(offset + 69, $base_unit_dec_place, value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(long value) {
		setConstNumber(offset + 69, $base_unit_dec_place, value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(float value) {
		setConstNumber(offset + 69, $base_unit_dec_place, value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(double value) {
		setConstNumber(offset + 69, $base_unit_dec_place, value);
	}


	/**
	 * Base unit rounding type 基準単位端数処理区分.<p>
	 *
	 */
	public String base_unit_rnd_typ() {
		return getConstString(offset + 70, $base_unit_rnd_typ);
	}

	/**
	 * Base unit rounding type 基準単位端数処理区分.<p>
	 *
	 */
	public void base_unit_rnd_typ(String value) {
		setConstString(offset + 70, $base_unit_rnd_typ, value);
	}


	/**
	 * Direct-delivery type 直納区分.<p>
	 *
	 */
	public String drct_dlv_typ() {
		return getConstString(offset + 71, $drct_dlv_typ);
	}

	/**
	 * Direct-delivery type 直納区分.<p>
	 *
	 */
	public void drct_dlv_typ(String value) {
		setConstString(offset + 71, $drct_dlv_typ, value);
	}


	/**
	 * For rack/line 棚・ライン対象.<p>
	 *
	 */
	public boolean str_ln_tgt_flg() {
		return getConstBoolean(offset + 72, $str_ln_tgt_flg);
	}

	/**
	 * For rack/line 棚・ライン対象.<p>
	 *
	 */
	public void str_ln_tgt_flg(boolean value) {
		setConstBoolean(offset + 72, $str_ln_tgt_flg, value);
	}


	/**
	 * Delivery location WG 納入場所ＷＧ.<p>
	 *
	 */
	public String in_to_loc_wg_cd() {
		return getConstString(offset + 73, $in_to_loc_wg_cd);
	}

	/**
	 * Delivery location WG 納入場所ＷＧ.<p>
	 *
	 */
	public void in_to_loc_wg_cd(String value) {
		setConstString(offset + 73, $in_to_loc_wg_cd, value);
	}


	/**
	 * Factory/Distribution warehouse cd. 工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public String site_cd() {
		return getConstString(offset + 74, $site_cd);
	}

	/**
	 * Factory/Distribution warehouse cd. 工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public void site_cd(String value) {
		setConstString(offset + 74, $site_cd, value);
	}


	/**
	 * Subcontractor cd. 外注発注先ＣＤ.<p>
	 *
	 */
	public String outsrc_sppl_cd() {
		return getConstString(offset + 75, $outsrc_sppl_cd);
	}

	/**
	 * Subcontractor cd. 外注発注先ＣＤ.<p>
	 *
	 */
	public void outsrc_sppl_cd(String value) {
		setConstString(offset + 75, $outsrc_sppl_cd, value);
	}


	/**
	 * Delivery location calendar cd. 納入場所カレンダＣＤ.<p>
	 *
	 */
	public String in_to_loc_cal_cd() {
		return getConstString(offset + 76, $in_to_loc_cal_cd);
	}

	/**
	 * Delivery location calendar cd. 納入場所カレンダＣＤ.<p>
	 *
	 */
	public void in_to_loc_cal_cd(String value) {
		setConstString(offset + 76, $in_to_loc_cal_cd, value);
	}


	/**
	 * Distribution group cd. 物流グループＣＤ.<p>
	 *
	 */
	public String lg_grp_cd() {
		return getConstString(offset + 77, $lg_grp_cd);
	}

	/**
	 * Distribution group cd. 物流グループＣＤ.<p>
	 *
	 */
	public void lg_grp_cd(String value) {
		setConstString(offset + 77, $lg_grp_cd, value);
	}


	/**
	 * Subcontracting flg. 外注ＦＬＧ.<p>
	 *
	 */
	public boolean outsrc_flg() {
		return getConstBoolean(offset + 78, $outsrc_flg);
	}

	/**
	 * Subcontracting flg. 外注ＦＬＧ.<p>
	 *
	 */
	public void outsrc_flg(boolean value) {
		setConstBoolean(offset + 78, $outsrc_flg, value);
	}


	/**
	 * Request source desired delivery date and time 依頼元納入希望日時.<p>
	 *
	 */
	public MCDate rqst_dlv_rqst_tm() {
		return getConstDate(offset + 79, $rqst_dlv_rqst_tm);
	}

	/**
	 * Request source desired delivery date and time 依頼元納入希望日時.<p>
	 *
	 */
	public void rqst_dlv_rqst_tm(MCDate value) {
		setConstDate(offset + 79, $rqst_dlv_rqst_tm, value);
	}


	/**
	 * Expenses purchasing flg. (Purchase reason) 経費購買ＦＬＧ（仕入理由）.<p>
	 *
	 */
	public boolean xpns_purc_flg() {
		return getConstBoolean(offset + 80, $xpns_purc_flg);
	}

	/**
	 * Expenses purchasing flg. (Purchase reason) 経費購買ＦＬＧ（仕入理由）.<p>
	 *
	 */
	public void xpns_purc_flg(boolean value) {
		setConstBoolean(offset + 80, $xpns_purc_flg, value);
	}


	/**
	 * Charged lot management type 負担ロット管理区分.<p>
	 *
	 */
	public String bd_lot_mng_typ() {
		return getConstString(offset + 81, $bd_lot_mng_typ);
	}

	/**
	 * Charged lot management type 負担ロット管理区分.<p>
	 *
	 */
	public void bd_lot_mng_typ(String value) {
		setConstString(offset + 81, $bd_lot_mng_typ, value);
	}


	/**
	 * Charged sublot management type 負担サブロット管理区分.<p>
	 *
	 */
	public String bd_sublot_mng_typ() {
		return getConstString(offset + 82, $bd_sublot_mng_typ);
	}

	/**
	 * Charged sublot management type 負担サブロット管理区分.<p>
	 *
	 */
	public void bd_sublot_mng_typ(String value) {
		setConstString(offset + 82, $bd_sublot_mng_typ, value);
	}


	/**
	 * Charged lot numbering type 負担ロットＮＯ発番区分.<p>
	 *
	 */
	public String bd_lot_no_typ() {
		return getConstString(offset + 83, $bd_lot_no_typ);
	}

	/**
	 * Charged lot numbering type 負担ロットＮＯ発番区分.<p>
	 *
	 */
	public void bd_lot_no_typ(String value) {
		setConstString(offset + 83, $bd_lot_no_typ, value);
	}


	/**
	 * Charged sublot numbering type 負担サブロットＮＯ発番区分.<p>
	 *
	 */
	public String bd_sublot_no_typ() {
		return getConstString(offset + 84, $bd_sublot_no_typ);
	}

	/**
	 * Charged sublot numbering type 負担サブロットＮＯ発番区分.<p>
	 *
	 */
	public void bd_sublot_no_typ(String value) {
		setConstString(offset + 84, $bd_sublot_no_typ, value);
	}


	/**
	 * Charged SEIBAN No. 1 management type 負担手配ＮＯ１管理区分.<p>
	 *
	 */
	public String bd_sno1_mng_typ() {
		return getConstString(offset + 85, $bd_sno1_mng_typ);
	}

	/**
	 * Charged SEIBAN No. 1 management type 負担手配ＮＯ１管理区分.<p>
	 *
	 */
	public void bd_sno1_mng_typ(String value) {
		setConstString(offset + 85, $bd_sno1_mng_typ, value);
	}


	/**
	 * Charged SEIBAN No. 2 management type 負担手配ＮＯ２管理区分.<p>
	 *
	 */
	public String bd_sno2_mng_typ() {
		return getConstString(offset + 86, $bd_sno2_mng_typ);
	}

	/**
	 * Charged SEIBAN No. 2 management type 負担手配ＮＯ２管理区分.<p>
	 *
	 */
	public void bd_sno2_mng_typ(String value) {
		setConstString(offset + 86, $bd_sno2_mng_typ, value);
	}


	/**
	 * Charged SEIBAN No. 3 management type 負担手配ＮＯ３管理区分.<p>
	 *
	 */
	public String bd_sno3_mng_typ() {
		return getConstString(offset + 87, $bd_sno3_mng_typ);
	}

	/**
	 * Charged SEIBAN No. 3 management type 負担手配ＮＯ３管理区分.<p>
	 *
	 */
	public void bd_sno3_mng_typ(String value) {
		setConstString(offset + 87, $bd_sno3_mng_typ, value);
	}


	/**
	 * Charged SEIBAN No. 4 management type 負担手配ＮＯ４管理区分.<p>
	 *
	 */
	public String bd_sno4_mng_typ() {
		return getConstString(offset + 88, $bd_sno4_mng_typ);
	}

	/**
	 * Charged SEIBAN No. 4 management type 負担手配ＮＯ４管理区分.<p>
	 *
	 */
	public void bd_sno4_mng_typ(String value) {
		setConstString(offset + 88, $bd_sno4_mng_typ, value);
	}


	/**
	 * Current EDI 今回ＥＤＩ.<p>
	 *
	 */
	public boolean edi_flg() {
		return getConstBoolean(offset + 89, $edi_flg);
	}

	/**
	 * Current EDI 今回ＥＤＩ.<p>
	 *
	 */
	public void edi_flg(boolean value) {
		setConstBoolean(offset + 89, $edi_flg, value);
	}


	/**
	 * GR/GI progress management No. 受払進捗管理ＮＯ.<p>
	 *
	 */
	public String io_schd_pr_no() {
		return getConstString(offset + 90, $io_schd_pr_no);
	}

	/**
	 * GR/GI progress management No. 受払進捗管理ＮＯ.<p>
	 *
	 */
	public void io_schd_pr_no(String value) {
		setConstString(offset + 90, $io_schd_pr_no, value);
	}


	/**
	 * Subcontracting item order No. 外注品目オーダＮＯ.<p>
	 *
	 */
	public String outsrc_itm_ord_no() {
		return getConstString(offset + 91, $outsrc_itm_ord_no);
	}

	/**
	 * Subcontracting item order No. 外注品目オーダＮＯ.<p>
	 *
	 */
	public void outsrc_itm_ord_no(String value) {
		setConstString(offset + 91, $outsrc_itm_ord_no, value);
	}


	/**
	 * Cancel remaining flg. 打切ＦＬＧ.<p>
	 *
	 */
	public boolean abort_flg() {
		return getConstBoolean(offset + 92, $abort_flg);
	}

	/**
	 * Cancel remaining flg. 打切ＦＬＧ.<p>
	 *
	 */
	public void abort_flg(boolean value) {
		setConstBoolean(offset + 92, $abort_flg, value);
	}


	/**
	 * Last cancel remaining flg. 前回打切ＦＬＧ.<p>
	 *
	 */
	public boolean bef_abort_flg() {
		return getConstBoolean(offset + 93, $bef_abort_flg);
	}

	/**
	 * Last cancel remaining flg. 前回打切ＦＬＧ.<p>
	 *
	 */
	public void bef_abort_flg(boolean value) {
		setConstBoolean(offset + 93, $bef_abort_flg, value);
	}


	/**
	 * PO rev. No. before update 更新前発注改訂番号.<p>
	 *
	 */
	public MCNumber bef_po_rev() {
		return getConstNumber(offset + 94, $bef_po_rev);
	}

	/**
	 * PO rev. No. before update 更新前発注改訂番号.<p>
	 *
	 */
	public void bef_po_rev(MCNumber value) {
		setConstNumber(offset + 94, $bef_po_rev, value);
	}

	/**
	 * PO rev. No. before update 更新前発注改訂番号.<p>
	 *
	 */
	public void bef_po_rev(int value) {
		setConstNumber(offset + 94, $bef_po_rev, value);
	}

	/**
	 * PO rev. No. before update 更新前発注改訂番号.<p>
	 *
	 */
	public void bef_po_rev(long value) {
		setConstNumber(offset + 94, $bef_po_rev, value);
	}

	/**
	 * PO rev. No. before update 更新前発注改訂番号.<p>
	 *
	 */
	public void bef_po_rev(float value) {
		setConstNumber(offset + 94, $bef_po_rev, value);
	}

	/**
	 * PO rev. No. before update 更新前発注改訂番号.<p>
	 *
	 */
	public void bef_po_rev(double value) {
		setConstNumber(offset + 94, $bef_po_rev, value);
	}


	/**
	 * Display order 表示順.<p>
	 *
	 */
	public MCNumber disp_seq() {
		return getConstNumber(offset + 95, $disp_seq);
	}

	/**
	 * Display order 表示順.<p>
	 *
	 */
	public void disp_seq(MCNumber value) {
		setConstNumber(offset + 95, $disp_seq, value);
	}

	/**
	 * Display order 表示順.<p>
	 *
	 */
	public void disp_seq(int value) {
		setConstNumber(offset + 95, $disp_seq, value);
	}

	/**
	 * Display order 表示順.<p>
	 *
	 */
	public void disp_seq(long value) {
		setConstNumber(offset + 95, $disp_seq, value);
	}

	/**
	 * Display order 表示順.<p>
	 *
	 */
	public void disp_seq(float value) {
		setConstNumber(offset + 95, $disp_seq, value);
	}

	/**
	 * Display order 表示順.<p>
	 *
	 */
	public void disp_seq(double value) {
		setConstNumber(offset + 95, $disp_seq, value);
	}


	/**
	 * Purchase unit price acquisition base date 購買単価取得基準日.<p>
	 *
	 */
	public MCDate purc_upri_req_base_dt() {
		return getConstDate(offset + 96, $purc_upri_req_base_dt);
	}

	/**
	 * Purchase unit price acquisition base date 購買単価取得基準日.<p>
	 *
	 */
	public void purc_upri_req_base_dt(MCDate value) {
		setConstDate(offset + 96, $purc_upri_req_base_dt, value);
	}


	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public MCNumber peg_no() {
		return getConstNumber(offset + 97, $peg_no);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(MCNumber value) {
		setConstNumber(offset + 97, $peg_no, value);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(int value) {
		setConstNumber(offset + 97, $peg_no, value);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(long value) {
		setConstNumber(offset + 97, $peg_no, value);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(float value) {
		setConstNumber(offset + 97, $peg_no, value);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(double value) {
		setConstNumber(offset + 97, $peg_no, value);
	}


	/**
	 * Purchase recording type 仕入計上区分.<p>
	 *
	 */
	public String purc_basis_typ() {
		return getConstString(offset + 98, $purc_basis_typ);
	}

	/**
	 * Purchase recording type 仕入計上区分.<p>
	 *
	 */
	public void purc_basis_typ(String value) {
		setConstString(offset + 98, $purc_basis_typ, value);
	}


	public String getString(String name) {
		if ($po_no.equalsIgnoreCase(name)) {
			return po_no();
		}
		if ($po_d_no.equalsIgnoreCase(name)) {
			return po_d_no();
		}
		if ($hdr_data_crud_typ.equalsIgnoreCase(name)) {
			return hdr_data_crud_typ();
		}
		if ($purc_dpt_wg_cd.equalsIgnoreCase(name)) {
			return purc_dpt_wg_cd();
		}
		if ($sppl_cntct_dpt.equalsIgnoreCase(name)) {
			return sppl_cntct_dpt();
		}
		if ($sppl_cntct_psn.equalsIgnoreCase(name)) {
			return sppl_cntct_psn();
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
		if ($sppl_tel.equalsIgnoreCase(name)) {
			return sppl_tel();
		}
		if ($sppl_fax.equalsIgnoreCase(name)) {
			return sppl_fax();
		}
		if ($prnt_lcl_cd.equalsIgnoreCase(name)) {
			return prnt_lcl_cd();
		}
		if ($outsrc_upri_typ.equalsIgnoreCase(name)) {
			return outsrc_upri_typ();
		}
		if ($sppl_ship_form_cd.equalsIgnoreCase(name)) {
			return sppl_ship_form_cd();
		}
		if ($purc_amt_rnd_typ.equalsIgnoreCase(name)) {
			return purc_amt_rnd_typ();
		}
		if ($purc_tax_rnd_typ.equalsIgnoreCase(name)) {
			return purc_tax_rnd_typ();
		}
		if ($sppl_cal_cd.equalsIgnoreCase(name)) {
			return sppl_cal_cd();
		}
		if ($sppl_po_print_cd.equalsIgnoreCase(name)) {
			return sppl_po_print_cd();
		}
		if ($base_cur_cd.equalsIgnoreCase(name)) {
			return base_cur_cd();
		}
		if ($ptax_cur_cd.equalsIgnoreCase(name)) {
			return ptax_cur_cd();
		}
		if ($wtax_rnd_typ.equalsIgnoreCase(name)) {
			return wtax_rnd_typ();
		}
		if ($tax_typ.equalsIgnoreCase(name)) {
			return tax_typ();
		}
		if ($wrk_no.equalsIgnoreCase(name)) {
			return wrk_no();
		}
		if ($sppl_ap_dpt_cd.equalsIgnoreCase(name)) {
			return sppl_ap_dpt_cd();
		}
		if ($sppl_trd_cur_cd.equalsIgnoreCase(name)) {
			return sppl_trd_cur_cd();
		}
		if ($sppl_purc_upri_req_typ.equalsIgnoreCase(name)) {
			return sppl_purc_upri_req_typ();
		}
		if ($sppl_tterm_cd1.equalsIgnoreCase(name)) {
			return sppl_tterm_cd1();
		}
		if ($sppl_tterm_cd2.equalsIgnoreCase(name)) {
			return sppl_tterm_cd2();
		}
		if ($sppl_tterm_cd3.equalsIgnoreCase(name)) {
			return sppl_tterm_cd3();
		}
		if ($mst_itm_nm.equalsIgnoreCase(name)) {
			return mst_itm_nm();
		}
		if ($asset_mng_typ.equalsIgnoreCase(name)) {
			return asset_mng_typ();
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
		if ($trd_unit_rnd_typ.equalsIgnoreCase(name)) {
			return trd_unit_rnd_typ();
		}
		if ($base_unit_cd.equalsIgnoreCase(name)) {
			return base_unit_cd();
		}
		if ($base_unit_rnd_typ.equalsIgnoreCase(name)) {
			return base_unit_rnd_typ();
		}
		if ($drct_dlv_typ.equalsIgnoreCase(name)) {
			return drct_dlv_typ();
		}
		if ($in_to_loc_wg_cd.equalsIgnoreCase(name)) {
			return in_to_loc_wg_cd();
		}
		if ($site_cd.equalsIgnoreCase(name)) {
			return site_cd();
		}
		if ($outsrc_sppl_cd.equalsIgnoreCase(name)) {
			return outsrc_sppl_cd();
		}
		if ($in_to_loc_cal_cd.equalsIgnoreCase(name)) {
			return in_to_loc_cal_cd();
		}
		if ($lg_grp_cd.equalsIgnoreCase(name)) {
			return lg_grp_cd();
		}
		if ($bd_lot_mng_typ.equalsIgnoreCase(name)) {
			return bd_lot_mng_typ();
		}
		if ($bd_sublot_mng_typ.equalsIgnoreCase(name)) {
			return bd_sublot_mng_typ();
		}
		if ($bd_lot_no_typ.equalsIgnoreCase(name)) {
			return bd_lot_no_typ();
		}
		if ($bd_sublot_no_typ.equalsIgnoreCase(name)) {
			return bd_sublot_no_typ();
		}
		if ($bd_sno1_mng_typ.equalsIgnoreCase(name)) {
			return bd_sno1_mng_typ();
		}
		if ($bd_sno2_mng_typ.equalsIgnoreCase(name)) {
			return bd_sno2_mng_typ();
		}
		if ($bd_sno3_mng_typ.equalsIgnoreCase(name)) {
			return bd_sno3_mng_typ();
		}
		if ($bd_sno4_mng_typ.equalsIgnoreCase(name)) {
			return bd_sno4_mng_typ();
		}
		if ($io_schd_pr_no.equalsIgnoreCase(name)) {
			return io_schd_pr_no();
		}
		if ($outsrc_itm_ord_no.equalsIgnoreCase(name)) {
			return outsrc_itm_ord_no();
		}
		if ($purc_basis_typ.equalsIgnoreCase(name)) {
			return purc_basis_typ();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($po_rev.equalsIgnoreCase(name)) {
			return po_rev();
		}
		if ($sppl_pay_crryovr_times.equalsIgnoreCase(name)) {
			return sppl_pay_crryovr_times();
		}
		if ($trd_cur_amt_dec_place.equalsIgnoreCase(name)) {
			return trd_cur_amt_dec_place();
		}
		if ($trd_cur_upri_dec_place.equalsIgnoreCase(name)) {
			return trd_cur_upri_dec_place();
		}
		if ($tax_rate.equalsIgnoreCase(name)) {
			return tax_rate();
		}
		if ($trd_cur_proc_amt.equalsIgnoreCase(name)) {
			return trd_cur_proc_amt();
		}
		if ($trd_cur_onr_prov_amt.equalsIgnoreCase(name)) {
			return trd_cur_onr_prov_amt();
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			return trd_cur_amt();
		}
		if ($trd_cur_tax_amt.equalsIgnoreCase(name)) {
			return trd_cur_tax_amt();
		}
		if ($wtax_amt.equalsIgnoreCase(name)) {
			return wtax_amt();
		}
		if ($sppl_amt_dec_place.equalsIgnoreCase(name)) {
			return sppl_amt_dec_place();
		}
		if ($sppl_upri_dec_place.equalsIgnoreCase(name)) {
			return sppl_upri_dec_place();
		}
		if ($itm_pay_crryovr_times.equalsIgnoreCase(name)) {
			return itm_pay_crryovr_times();
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
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			return base_unit_qty();
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			return base_unit_dec_place();
		}
		if ($bef_po_rev.equalsIgnoreCase(name)) {
			return bef_po_rev();
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			return disp_seq();
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			return peg_no();
		}
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		if ($rqst_dlv_rqst_tm.equalsIgnoreCase(name)) {
			return rqst_dlv_rqst_tm();
		}
		if ($purc_upri_req_base_dt.equalsIgnoreCase(name)) {
			return purc_upri_req_base_dt();
		}
		return super.getDate(name);
	}
	public boolean getBoolean(String name) {
		if ($err_flg.equalsIgnoreCase(name)) {
			return err_flg();
		}
		if ($sppl_iv_flg.equalsIgnoreCase(name)) {
			return sppl_iv_flg();
		}
		if ($subcon_flg.equalsIgnoreCase(name)) {
			return subcon_flg();
		}
		if ($repurc_obli_flg.equalsIgnoreCase(name)) {
			return repurc_obli_flg();
		}
		if ($sppl_purc_upri_cng_flg.equalsIgnoreCase(name)) {
			return sppl_purc_upri_cng_flg();
		}
		if ($inc_tax_flg.equalsIgnoreCase(name)) {
			return inc_tax_flg();
		}
		if ($sundry_itm_flg.equalsIgnoreCase(name)) {
			return sundry_itm_flg();
		}
		if ($dscnt_itm_flg.equalsIgnoreCase(name)) {
			return dscnt_itm_flg();
		}
		if ($ver_flg.equalsIgnoreCase(name)) {
			return ver_flg();
		}
		if ($itm_purc_upri_cng_flg.equalsIgnoreCase(name)) {
			return itm_purc_upri_cng_flg();
		}
		if ($arr_skip_flg.equalsIgnoreCase(name)) {
			return arr_skip_flg();
		}
		if ($str_ln_tgt_flg.equalsIgnoreCase(name)) {
			return str_ln_tgt_flg();
		}
		if ($outsrc_flg.equalsIgnoreCase(name)) {
			return outsrc_flg();
		}
		if ($xpns_purc_flg.equalsIgnoreCase(name)) {
			return xpns_purc_flg();
		}
		if ($edi_flg.equalsIgnoreCase(name)) {
			return edi_flg();
		}
		if ($abort_flg.equalsIgnoreCase(name)) {
			return abort_flg();
		}
		if ($bef_abort_flg.equalsIgnoreCase(name)) {
			return bef_abort_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($po_no.equalsIgnoreCase(name)) {
			return po_no();
		}
		if ($po_d_no.equalsIgnoreCase(name)) {
			return po_d_no();
		}
		if ($hdr_data_crud_typ.equalsIgnoreCase(name)) {
			return hdr_data_crud_typ();
		}
		if ($purc_dpt_wg_cd.equalsIgnoreCase(name)) {
			return purc_dpt_wg_cd();
		}
		if ($sppl_cntct_dpt.equalsIgnoreCase(name)) {
			return sppl_cntct_dpt();
		}
		if ($sppl_cntct_psn.equalsIgnoreCase(name)) {
			return sppl_cntct_psn();
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
		if ($sppl_tel.equalsIgnoreCase(name)) {
			return sppl_tel();
		}
		if ($sppl_fax.equalsIgnoreCase(name)) {
			return sppl_fax();
		}
		if ($prnt_lcl_cd.equalsIgnoreCase(name)) {
			return prnt_lcl_cd();
		}
		if ($outsrc_upri_typ.equalsIgnoreCase(name)) {
			return outsrc_upri_typ();
		}
		if ($sppl_ship_form_cd.equalsIgnoreCase(name)) {
			return sppl_ship_form_cd();
		}
		if ($purc_amt_rnd_typ.equalsIgnoreCase(name)) {
			return purc_amt_rnd_typ();
		}
		if ($purc_tax_rnd_typ.equalsIgnoreCase(name)) {
			return purc_tax_rnd_typ();
		}
		if ($sppl_cal_cd.equalsIgnoreCase(name)) {
			return sppl_cal_cd();
		}
		if ($sppl_po_print_cd.equalsIgnoreCase(name)) {
			return sppl_po_print_cd();
		}
		if ($base_cur_cd.equalsIgnoreCase(name)) {
			return base_cur_cd();
		}
		if ($ptax_cur_cd.equalsIgnoreCase(name)) {
			return ptax_cur_cd();
		}
		if ($wtax_rnd_typ.equalsIgnoreCase(name)) {
			return wtax_rnd_typ();
		}
		if ($tax_typ.equalsIgnoreCase(name)) {
			return tax_typ();
		}
		if ($wrk_no.equalsIgnoreCase(name)) {
			return wrk_no();
		}
		if ($sppl_ap_dpt_cd.equalsIgnoreCase(name)) {
			return sppl_ap_dpt_cd();
		}
		if ($sppl_trd_cur_cd.equalsIgnoreCase(name)) {
			return sppl_trd_cur_cd();
		}
		if ($sppl_purc_upri_req_typ.equalsIgnoreCase(name)) {
			return sppl_purc_upri_req_typ();
		}
		if ($sppl_tterm_cd1.equalsIgnoreCase(name)) {
			return sppl_tterm_cd1();
		}
		if ($sppl_tterm_cd2.equalsIgnoreCase(name)) {
			return sppl_tterm_cd2();
		}
		if ($sppl_tterm_cd3.equalsIgnoreCase(name)) {
			return sppl_tterm_cd3();
		}
		if ($mst_itm_nm.equalsIgnoreCase(name)) {
			return mst_itm_nm();
		}
		if ($asset_mng_typ.equalsIgnoreCase(name)) {
			return asset_mng_typ();
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
		if ($trd_unit_rnd_typ.equalsIgnoreCase(name)) {
			return trd_unit_rnd_typ();
		}
		if ($base_unit_cd.equalsIgnoreCase(name)) {
			return base_unit_cd();
		}
		if ($base_unit_rnd_typ.equalsIgnoreCase(name)) {
			return base_unit_rnd_typ();
		}
		if ($drct_dlv_typ.equalsIgnoreCase(name)) {
			return drct_dlv_typ();
		}
		if ($in_to_loc_wg_cd.equalsIgnoreCase(name)) {
			return in_to_loc_wg_cd();
		}
		if ($site_cd.equalsIgnoreCase(name)) {
			return site_cd();
		}
		if ($outsrc_sppl_cd.equalsIgnoreCase(name)) {
			return outsrc_sppl_cd();
		}
		if ($in_to_loc_cal_cd.equalsIgnoreCase(name)) {
			return in_to_loc_cal_cd();
		}
		if ($lg_grp_cd.equalsIgnoreCase(name)) {
			return lg_grp_cd();
		}
		if ($bd_lot_mng_typ.equalsIgnoreCase(name)) {
			return bd_lot_mng_typ();
		}
		if ($bd_sublot_mng_typ.equalsIgnoreCase(name)) {
			return bd_sublot_mng_typ();
		}
		if ($bd_lot_no_typ.equalsIgnoreCase(name)) {
			return bd_lot_no_typ();
		}
		if ($bd_sublot_no_typ.equalsIgnoreCase(name)) {
			return bd_sublot_no_typ();
		}
		if ($bd_sno1_mng_typ.equalsIgnoreCase(name)) {
			return bd_sno1_mng_typ();
		}
		if ($bd_sno2_mng_typ.equalsIgnoreCase(name)) {
			return bd_sno2_mng_typ();
		}
		if ($bd_sno3_mng_typ.equalsIgnoreCase(name)) {
			return bd_sno3_mng_typ();
		}
		if ($bd_sno4_mng_typ.equalsIgnoreCase(name)) {
			return bd_sno4_mng_typ();
		}
		if ($io_schd_pr_no.equalsIgnoreCase(name)) {
			return io_schd_pr_no();
		}
		if ($outsrc_itm_ord_no.equalsIgnoreCase(name)) {
			return outsrc_itm_ord_no();
		}
		if ($purc_basis_typ.equalsIgnoreCase(name)) {
			return purc_basis_typ();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($po_rev.equalsIgnoreCase(name)) {
			return po_rev();
		}
		if ($sppl_pay_crryovr_times.equalsIgnoreCase(name)) {
			return sppl_pay_crryovr_times();
		}
		if ($trd_cur_amt_dec_place.equalsIgnoreCase(name)) {
			return trd_cur_amt_dec_place();
		}
		if ($trd_cur_upri_dec_place.equalsIgnoreCase(name)) {
			return trd_cur_upri_dec_place();
		}
		if ($tax_rate.equalsIgnoreCase(name)) {
			return tax_rate();
		}
		if ($trd_cur_proc_amt.equalsIgnoreCase(name)) {
			return trd_cur_proc_amt();
		}
		if ($trd_cur_onr_prov_amt.equalsIgnoreCase(name)) {
			return trd_cur_onr_prov_amt();
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			return trd_cur_amt();
		}
		if ($trd_cur_tax_amt.equalsIgnoreCase(name)) {
			return trd_cur_tax_amt();
		}
		if ($wtax_amt.equalsIgnoreCase(name)) {
			return wtax_amt();
		}
		if ($sppl_amt_dec_place.equalsIgnoreCase(name)) {
			return sppl_amt_dec_place();
		}
		if ($sppl_upri_dec_place.equalsIgnoreCase(name)) {
			return sppl_upri_dec_place();
		}
		if ($itm_pay_crryovr_times.equalsIgnoreCase(name)) {
			return itm_pay_crryovr_times();
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
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			return base_unit_qty();
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			return base_unit_dec_place();
		}
		if ($bef_po_rev.equalsIgnoreCase(name)) {
			return bef_po_rev();
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			return disp_seq();
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			return peg_no();
		}
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($rqst_dlv_rqst_tm.equalsIgnoreCase(name)) {
			return rqst_dlv_rqst_tm();
		}
		if ($purc_upri_req_base_dt.equalsIgnoreCase(name)) {
			return purc_upri_req_base_dt();
		}
		return super.getDateNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($err_flg.equalsIgnoreCase(name)) {
			return err_flg();
		}
		if ($sppl_iv_flg.equalsIgnoreCase(name)) {
			return sppl_iv_flg();
		}
		if ($subcon_flg.equalsIgnoreCase(name)) {
			return subcon_flg();
		}
		if ($repurc_obli_flg.equalsIgnoreCase(name)) {
			return repurc_obli_flg();
		}
		if ($sppl_purc_upri_cng_flg.equalsIgnoreCase(name)) {
			return sppl_purc_upri_cng_flg();
		}
		if ($inc_tax_flg.equalsIgnoreCase(name)) {
			return inc_tax_flg();
		}
		if ($sundry_itm_flg.equalsIgnoreCase(name)) {
			return sundry_itm_flg();
		}
		if ($dscnt_itm_flg.equalsIgnoreCase(name)) {
			return dscnt_itm_flg();
		}
		if ($ver_flg.equalsIgnoreCase(name)) {
			return ver_flg();
		}
		if ($itm_purc_upri_cng_flg.equalsIgnoreCase(name)) {
			return itm_purc_upri_cng_flg();
		}
		if ($arr_skip_flg.equalsIgnoreCase(name)) {
			return arr_skip_flg();
		}
		if ($str_ln_tgt_flg.equalsIgnoreCase(name)) {
			return str_ln_tgt_flg();
		}
		if ($outsrc_flg.equalsIgnoreCase(name)) {
			return outsrc_flg();
		}
		if ($xpns_purc_flg.equalsIgnoreCase(name)) {
			return xpns_purc_flg();
		}
		if ($edi_flg.equalsIgnoreCase(name)) {
			return edi_flg();
		}
		if ($abort_flg.equalsIgnoreCase(name)) {
			return abort_flg();
		}
		if ($bef_abort_flg.equalsIgnoreCase(name)) {
			return bef_abort_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($po_no.equalsIgnoreCase(name)) {
			po_no(value);
			return;
		}
		if ($po_d_no.equalsIgnoreCase(name)) {
			po_d_no(value);
			return;
		}
		if ($hdr_data_crud_typ.equalsIgnoreCase(name)) {
			hdr_data_crud_typ(value);
			return;
		}
		if ($purc_dpt_wg_cd.equalsIgnoreCase(name)) {
			purc_dpt_wg_cd(value);
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
		if ($sppl_tel.equalsIgnoreCase(name)) {
			sppl_tel(value);
			return;
		}
		if ($sppl_fax.equalsIgnoreCase(name)) {
			sppl_fax(value);
			return;
		}
		if ($prnt_lcl_cd.equalsIgnoreCase(name)) {
			prnt_lcl_cd(value);
			return;
		}
		if ($outsrc_upri_typ.equalsIgnoreCase(name)) {
			outsrc_upri_typ(value);
			return;
		}
		if ($sppl_ship_form_cd.equalsIgnoreCase(name)) {
			sppl_ship_form_cd(value);
			return;
		}
		if ($purc_amt_rnd_typ.equalsIgnoreCase(name)) {
			purc_amt_rnd_typ(value);
			return;
		}
		if ($purc_tax_rnd_typ.equalsIgnoreCase(name)) {
			purc_tax_rnd_typ(value);
			return;
		}
		if ($sppl_cal_cd.equalsIgnoreCase(name)) {
			sppl_cal_cd(value);
			return;
		}
		if ($sppl_po_print_cd.equalsIgnoreCase(name)) {
			sppl_po_print_cd(value);
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
		if ($wtax_rnd_typ.equalsIgnoreCase(name)) {
			wtax_rnd_typ(value);
			return;
		}
		if ($tax_typ.equalsIgnoreCase(name)) {
			tax_typ(value);
			return;
		}
		if ($wrk_no.equalsIgnoreCase(name)) {
			wrk_no(value);
			return;
		}
		if ($sppl_ap_dpt_cd.equalsIgnoreCase(name)) {
			sppl_ap_dpt_cd(value);
			return;
		}
		if ($sppl_trd_cur_cd.equalsIgnoreCase(name)) {
			sppl_trd_cur_cd(value);
			return;
		}
		if ($sppl_purc_upri_req_typ.equalsIgnoreCase(name)) {
			sppl_purc_upri_req_typ(value);
			return;
		}
		if ($sppl_tterm_cd1.equalsIgnoreCase(name)) {
			sppl_tterm_cd1(value);
			return;
		}
		if ($sppl_tterm_cd2.equalsIgnoreCase(name)) {
			sppl_tterm_cd2(value);
			return;
		}
		if ($sppl_tterm_cd3.equalsIgnoreCase(name)) {
			sppl_tterm_cd3(value);
			return;
		}
		if ($mst_itm_nm.equalsIgnoreCase(name)) {
			mst_itm_nm(value);
			return;
		}
		if ($asset_mng_typ.equalsIgnoreCase(name)) {
			asset_mng_typ(value);
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
		if ($trd_unit_rnd_typ.equalsIgnoreCase(name)) {
			trd_unit_rnd_typ(value);
			return;
		}
		if ($base_unit_cd.equalsIgnoreCase(name)) {
			base_unit_cd(value);
			return;
		}
		if ($base_unit_rnd_typ.equalsIgnoreCase(name)) {
			base_unit_rnd_typ(value);
			return;
		}
		if ($drct_dlv_typ.equalsIgnoreCase(name)) {
			drct_dlv_typ(value);
			return;
		}
		if ($in_to_loc_wg_cd.equalsIgnoreCase(name)) {
			in_to_loc_wg_cd(value);
			return;
		}
		if ($site_cd.equalsIgnoreCase(name)) {
			site_cd(value);
			return;
		}
		if ($outsrc_sppl_cd.equalsIgnoreCase(name)) {
			outsrc_sppl_cd(value);
			return;
		}
		if ($in_to_loc_cal_cd.equalsIgnoreCase(name)) {
			in_to_loc_cal_cd(value);
			return;
		}
		if ($lg_grp_cd.equalsIgnoreCase(name)) {
			lg_grp_cd(value);
			return;
		}
		if ($bd_lot_mng_typ.equalsIgnoreCase(name)) {
			bd_lot_mng_typ(value);
			return;
		}
		if ($bd_sublot_mng_typ.equalsIgnoreCase(name)) {
			bd_sublot_mng_typ(value);
			return;
		}
		if ($bd_lot_no_typ.equalsIgnoreCase(name)) {
			bd_lot_no_typ(value);
			return;
		}
		if ($bd_sublot_no_typ.equalsIgnoreCase(name)) {
			bd_sublot_no_typ(value);
			return;
		}
		if ($bd_sno1_mng_typ.equalsIgnoreCase(name)) {
			bd_sno1_mng_typ(value);
			return;
		}
		if ($bd_sno2_mng_typ.equalsIgnoreCase(name)) {
			bd_sno2_mng_typ(value);
			return;
		}
		if ($bd_sno3_mng_typ.equalsIgnoreCase(name)) {
			bd_sno3_mng_typ(value);
			return;
		}
		if ($bd_sno4_mng_typ.equalsIgnoreCase(name)) {
			bd_sno4_mng_typ(value);
			return;
		}
		if ($io_schd_pr_no.equalsIgnoreCase(name)) {
			io_schd_pr_no(value);
			return;
		}
		if ($outsrc_itm_ord_no.equalsIgnoreCase(name)) {
			outsrc_itm_ord_no(value);
			return;
		}
		if ($purc_basis_typ.equalsIgnoreCase(name)) {
			purc_basis_typ(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($po_rev.equalsIgnoreCase(name)) {
			po_rev(value);
			return;
		}
		if ($sppl_pay_crryovr_times.equalsIgnoreCase(name)) {
			sppl_pay_crryovr_times(value);
			return;
		}
		if ($trd_cur_amt_dec_place.equalsIgnoreCase(name)) {
			trd_cur_amt_dec_place(value);
			return;
		}
		if ($trd_cur_upri_dec_place.equalsIgnoreCase(name)) {
			trd_cur_upri_dec_place(value);
			return;
		}
		if ($tax_rate.equalsIgnoreCase(name)) {
			tax_rate(value);
			return;
		}
		if ($trd_cur_proc_amt.equalsIgnoreCase(name)) {
			trd_cur_proc_amt(value);
			return;
		}
		if ($trd_cur_onr_prov_amt.equalsIgnoreCase(name)) {
			trd_cur_onr_prov_amt(value);
			return;
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
			return;
		}
		if ($trd_cur_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_tax_amt(value);
			return;
		}
		if ($wtax_amt.equalsIgnoreCase(name)) {
			wtax_amt(value);
			return;
		}
		if ($sppl_amt_dec_place.equalsIgnoreCase(name)) {
			sppl_amt_dec_place(value);
			return;
		}
		if ($sppl_upri_dec_place.equalsIgnoreCase(name)) {
			sppl_upri_dec_place(value);
			return;
		}
		if ($itm_pay_crryovr_times.equalsIgnoreCase(name)) {
			itm_pay_crryovr_times(value);
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
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($bef_po_rev.equalsIgnoreCase(name)) {
			bef_po_rev(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($po_rev.equalsIgnoreCase(name)) {
			po_rev(value);
			return;
		}
		if ($sppl_pay_crryovr_times.equalsIgnoreCase(name)) {
			sppl_pay_crryovr_times(value);
			return;
		}
		if ($trd_cur_amt_dec_place.equalsIgnoreCase(name)) {
			trd_cur_amt_dec_place(value);
			return;
		}
		if ($trd_cur_upri_dec_place.equalsIgnoreCase(name)) {
			trd_cur_upri_dec_place(value);
			return;
		}
		if ($tax_rate.equalsIgnoreCase(name)) {
			tax_rate(value);
			return;
		}
		if ($trd_cur_proc_amt.equalsIgnoreCase(name)) {
			trd_cur_proc_amt(value);
			return;
		}
		if ($trd_cur_onr_prov_amt.equalsIgnoreCase(name)) {
			trd_cur_onr_prov_amt(value);
			return;
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
			return;
		}
		if ($trd_cur_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_tax_amt(value);
			return;
		}
		if ($wtax_amt.equalsIgnoreCase(name)) {
			wtax_amt(value);
			return;
		}
		if ($sppl_amt_dec_place.equalsIgnoreCase(name)) {
			sppl_amt_dec_place(value);
			return;
		}
		if ($sppl_upri_dec_place.equalsIgnoreCase(name)) {
			sppl_upri_dec_place(value);
			return;
		}
		if ($itm_pay_crryovr_times.equalsIgnoreCase(name)) {
			itm_pay_crryovr_times(value);
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
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($bef_po_rev.equalsIgnoreCase(name)) {
			bef_po_rev(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($po_rev.equalsIgnoreCase(name)) {
			po_rev(value);
			return;
		}
		if ($sppl_pay_crryovr_times.equalsIgnoreCase(name)) {
			sppl_pay_crryovr_times(value);
			return;
		}
		if ($trd_cur_amt_dec_place.equalsIgnoreCase(name)) {
			trd_cur_amt_dec_place(value);
			return;
		}
		if ($trd_cur_upri_dec_place.equalsIgnoreCase(name)) {
			trd_cur_upri_dec_place(value);
			return;
		}
		if ($tax_rate.equalsIgnoreCase(name)) {
			tax_rate(value);
			return;
		}
		if ($trd_cur_proc_amt.equalsIgnoreCase(name)) {
			trd_cur_proc_amt(value);
			return;
		}
		if ($trd_cur_onr_prov_amt.equalsIgnoreCase(name)) {
			trd_cur_onr_prov_amt(value);
			return;
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
			return;
		}
		if ($trd_cur_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_tax_amt(value);
			return;
		}
		if ($wtax_amt.equalsIgnoreCase(name)) {
			wtax_amt(value);
			return;
		}
		if ($sppl_amt_dec_place.equalsIgnoreCase(name)) {
			sppl_amt_dec_place(value);
			return;
		}
		if ($sppl_upri_dec_place.equalsIgnoreCase(name)) {
			sppl_upri_dec_place(value);
			return;
		}
		if ($itm_pay_crryovr_times.equalsIgnoreCase(name)) {
			itm_pay_crryovr_times(value);
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
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($bef_po_rev.equalsIgnoreCase(name)) {
			bef_po_rev(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($po_rev.equalsIgnoreCase(name)) {
			po_rev(value);
			return;
		}
		if ($sppl_pay_crryovr_times.equalsIgnoreCase(name)) {
			sppl_pay_crryovr_times(value);
			return;
		}
		if ($trd_cur_amt_dec_place.equalsIgnoreCase(name)) {
			trd_cur_amt_dec_place(value);
			return;
		}
		if ($trd_cur_upri_dec_place.equalsIgnoreCase(name)) {
			trd_cur_upri_dec_place(value);
			return;
		}
		if ($tax_rate.equalsIgnoreCase(name)) {
			tax_rate(value);
			return;
		}
		if ($trd_cur_proc_amt.equalsIgnoreCase(name)) {
			trd_cur_proc_amt(value);
			return;
		}
		if ($trd_cur_onr_prov_amt.equalsIgnoreCase(name)) {
			trd_cur_onr_prov_amt(value);
			return;
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
			return;
		}
		if ($trd_cur_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_tax_amt(value);
			return;
		}
		if ($wtax_amt.equalsIgnoreCase(name)) {
			wtax_amt(value);
			return;
		}
		if ($sppl_amt_dec_place.equalsIgnoreCase(name)) {
			sppl_amt_dec_place(value);
			return;
		}
		if ($sppl_upri_dec_place.equalsIgnoreCase(name)) {
			sppl_upri_dec_place(value);
			return;
		}
		if ($itm_pay_crryovr_times.equalsIgnoreCase(name)) {
			itm_pay_crryovr_times(value);
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
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($bef_po_rev.equalsIgnoreCase(name)) {
			bef_po_rev(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($po_rev.equalsIgnoreCase(name)) {
			po_rev(value);
			return;
		}
		if ($sppl_pay_crryovr_times.equalsIgnoreCase(name)) {
			sppl_pay_crryovr_times(value);
			return;
		}
		if ($trd_cur_amt_dec_place.equalsIgnoreCase(name)) {
			trd_cur_amt_dec_place(value);
			return;
		}
		if ($trd_cur_upri_dec_place.equalsIgnoreCase(name)) {
			trd_cur_upri_dec_place(value);
			return;
		}
		if ($tax_rate.equalsIgnoreCase(name)) {
			tax_rate(value);
			return;
		}
		if ($trd_cur_proc_amt.equalsIgnoreCase(name)) {
			trd_cur_proc_amt(value);
			return;
		}
		if ($trd_cur_onr_prov_amt.equalsIgnoreCase(name)) {
			trd_cur_onr_prov_amt(value);
			return;
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
			return;
		}
		if ($trd_cur_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_tax_amt(value);
			return;
		}
		if ($wtax_amt.equalsIgnoreCase(name)) {
			wtax_amt(value);
			return;
		}
		if ($sppl_amt_dec_place.equalsIgnoreCase(name)) {
			sppl_amt_dec_place(value);
			return;
		}
		if ($sppl_upri_dec_place.equalsIgnoreCase(name)) {
			sppl_upri_dec_place(value);
			return;
		}
		if ($itm_pay_crryovr_times.equalsIgnoreCase(name)) {
			itm_pay_crryovr_times(value);
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
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($bef_po_rev.equalsIgnoreCase(name)) {
			bef_po_rev(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($rqst_dlv_rqst_tm.equalsIgnoreCase(name)) {
			rqst_dlv_rqst_tm(value);
			return;
		}
		if ($purc_upri_req_base_dt.equalsIgnoreCase(name)) {
			purc_upri_req_base_dt(value);
			return;
		}
		super.setDate(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($err_flg.equalsIgnoreCase(name)) {
			err_flg(value);
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
		if ($repurc_obli_flg.equalsIgnoreCase(name)) {
			repurc_obli_flg(value);
			return;
		}
		if ($sppl_purc_upri_cng_flg.equalsIgnoreCase(name)) {
			sppl_purc_upri_cng_flg(value);
			return;
		}
		if ($inc_tax_flg.equalsIgnoreCase(name)) {
			inc_tax_flg(value);
			return;
		}
		if ($sundry_itm_flg.equalsIgnoreCase(name)) {
			sundry_itm_flg(value);
			return;
		}
		if ($dscnt_itm_flg.equalsIgnoreCase(name)) {
			dscnt_itm_flg(value);
			return;
		}
		if ($ver_flg.equalsIgnoreCase(name)) {
			ver_flg(value);
			return;
		}
		if ($itm_purc_upri_cng_flg.equalsIgnoreCase(name)) {
			itm_purc_upri_cng_flg(value);
			return;
		}
		if ($arr_skip_flg.equalsIgnoreCase(name)) {
			arr_skip_flg(value);
			return;
		}
		if ($str_ln_tgt_flg.equalsIgnoreCase(name)) {
			str_ln_tgt_flg(value);
			return;
		}
		if ($outsrc_flg.equalsIgnoreCase(name)) {
			outsrc_flg(value);
			return;
		}
		if ($xpns_purc_flg.equalsIgnoreCase(name)) {
			xpns_purc_flg(value);
			return;
		}
		if ($edi_flg.equalsIgnoreCase(name)) {
			edi_flg(value);
			return;
		}
		if ($abort_flg.equalsIgnoreCase(name)) {
			abort_flg(value);
			return;
		}
		if ($bef_abort_flg.equalsIgnoreCase(name)) {
			bef_abort_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($po_no.equalsIgnoreCase(name)) {
			po_no(value);
			return;
		}
		if ($po_d_no.equalsIgnoreCase(name)) {
			po_d_no(value);
			return;
		}
		if ($hdr_data_crud_typ.equalsIgnoreCase(name)) {
			hdr_data_crud_typ(value);
			return;
		}
		if ($purc_dpt_wg_cd.equalsIgnoreCase(name)) {
			purc_dpt_wg_cd(value);
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
		if ($sppl_tel.equalsIgnoreCase(name)) {
			sppl_tel(value);
			return;
		}
		if ($sppl_fax.equalsIgnoreCase(name)) {
			sppl_fax(value);
			return;
		}
		if ($prnt_lcl_cd.equalsIgnoreCase(name)) {
			prnt_lcl_cd(value);
			return;
		}
		if ($outsrc_upri_typ.equalsIgnoreCase(name)) {
			outsrc_upri_typ(value);
			return;
		}
		if ($sppl_ship_form_cd.equalsIgnoreCase(name)) {
			sppl_ship_form_cd(value);
			return;
		}
		if ($purc_amt_rnd_typ.equalsIgnoreCase(name)) {
			purc_amt_rnd_typ(value);
			return;
		}
		if ($purc_tax_rnd_typ.equalsIgnoreCase(name)) {
			purc_tax_rnd_typ(value);
			return;
		}
		if ($sppl_cal_cd.equalsIgnoreCase(name)) {
			sppl_cal_cd(value);
			return;
		}
		if ($sppl_po_print_cd.equalsIgnoreCase(name)) {
			sppl_po_print_cd(value);
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
		if ($wtax_rnd_typ.equalsIgnoreCase(name)) {
			wtax_rnd_typ(value);
			return;
		}
		if ($tax_typ.equalsIgnoreCase(name)) {
			tax_typ(value);
			return;
		}
		if ($wrk_no.equalsIgnoreCase(name)) {
			wrk_no(value);
			return;
		}
		if ($sppl_ap_dpt_cd.equalsIgnoreCase(name)) {
			sppl_ap_dpt_cd(value);
			return;
		}
		if ($sppl_trd_cur_cd.equalsIgnoreCase(name)) {
			sppl_trd_cur_cd(value);
			return;
		}
		if ($sppl_purc_upri_req_typ.equalsIgnoreCase(name)) {
			sppl_purc_upri_req_typ(value);
			return;
		}
		if ($sppl_tterm_cd1.equalsIgnoreCase(name)) {
			sppl_tterm_cd1(value);
			return;
		}
		if ($sppl_tterm_cd2.equalsIgnoreCase(name)) {
			sppl_tterm_cd2(value);
			return;
		}
		if ($sppl_tterm_cd3.equalsIgnoreCase(name)) {
			sppl_tterm_cd3(value);
			return;
		}
		if ($mst_itm_nm.equalsIgnoreCase(name)) {
			mst_itm_nm(value);
			return;
		}
		if ($asset_mng_typ.equalsIgnoreCase(name)) {
			asset_mng_typ(value);
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
		if ($trd_unit_rnd_typ.equalsIgnoreCase(name)) {
			trd_unit_rnd_typ(value);
			return;
		}
		if ($base_unit_cd.equalsIgnoreCase(name)) {
			base_unit_cd(value);
			return;
		}
		if ($base_unit_rnd_typ.equalsIgnoreCase(name)) {
			base_unit_rnd_typ(value);
			return;
		}
		if ($drct_dlv_typ.equalsIgnoreCase(name)) {
			drct_dlv_typ(value);
			return;
		}
		if ($in_to_loc_wg_cd.equalsIgnoreCase(name)) {
			in_to_loc_wg_cd(value);
			return;
		}
		if ($site_cd.equalsIgnoreCase(name)) {
			site_cd(value);
			return;
		}
		if ($outsrc_sppl_cd.equalsIgnoreCase(name)) {
			outsrc_sppl_cd(value);
			return;
		}
		if ($in_to_loc_cal_cd.equalsIgnoreCase(name)) {
			in_to_loc_cal_cd(value);
			return;
		}
		if ($lg_grp_cd.equalsIgnoreCase(name)) {
			lg_grp_cd(value);
			return;
		}
		if ($bd_lot_mng_typ.equalsIgnoreCase(name)) {
			bd_lot_mng_typ(value);
			return;
		}
		if ($bd_sublot_mng_typ.equalsIgnoreCase(name)) {
			bd_sublot_mng_typ(value);
			return;
		}
		if ($bd_lot_no_typ.equalsIgnoreCase(name)) {
			bd_lot_no_typ(value);
			return;
		}
		if ($bd_sublot_no_typ.equalsIgnoreCase(name)) {
			bd_sublot_no_typ(value);
			return;
		}
		if ($bd_sno1_mng_typ.equalsIgnoreCase(name)) {
			bd_sno1_mng_typ(value);
			return;
		}
		if ($bd_sno2_mng_typ.equalsIgnoreCase(name)) {
			bd_sno2_mng_typ(value);
			return;
		}
		if ($bd_sno3_mng_typ.equalsIgnoreCase(name)) {
			bd_sno3_mng_typ(value);
			return;
		}
		if ($bd_sno4_mng_typ.equalsIgnoreCase(name)) {
			bd_sno4_mng_typ(value);
			return;
		}
		if ($io_schd_pr_no.equalsIgnoreCase(name)) {
			io_schd_pr_no(value);
			return;
		}
		if ($outsrc_itm_ord_no.equalsIgnoreCase(name)) {
			outsrc_itm_ord_no(value);
			return;
		}
		if ($purc_basis_typ.equalsIgnoreCase(name)) {
			purc_basis_typ(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($po_rev.equalsIgnoreCase(name)) {
			po_rev(value);
			return;
		}
		if ($sppl_pay_crryovr_times.equalsIgnoreCase(name)) {
			sppl_pay_crryovr_times(value);
			return;
		}
		if ($trd_cur_amt_dec_place.equalsIgnoreCase(name)) {
			trd_cur_amt_dec_place(value);
			return;
		}
		if ($trd_cur_upri_dec_place.equalsIgnoreCase(name)) {
			trd_cur_upri_dec_place(value);
			return;
		}
		if ($tax_rate.equalsIgnoreCase(name)) {
			tax_rate(value);
			return;
		}
		if ($trd_cur_proc_amt.equalsIgnoreCase(name)) {
			trd_cur_proc_amt(value);
			return;
		}
		if ($trd_cur_onr_prov_amt.equalsIgnoreCase(name)) {
			trd_cur_onr_prov_amt(value);
			return;
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
			return;
		}
		if ($trd_cur_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_tax_amt(value);
			return;
		}
		if ($wtax_amt.equalsIgnoreCase(name)) {
			wtax_amt(value);
			return;
		}
		if ($sppl_amt_dec_place.equalsIgnoreCase(name)) {
			sppl_amt_dec_place(value);
			return;
		}
		if ($sppl_upri_dec_place.equalsIgnoreCase(name)) {
			sppl_upri_dec_place(value);
			return;
		}
		if ($itm_pay_crryovr_times.equalsIgnoreCase(name)) {
			itm_pay_crryovr_times(value);
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
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($bef_po_rev.equalsIgnoreCase(name)) {
			bef_po_rev(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($po_rev.equalsIgnoreCase(name)) {
			po_rev(value);
			return;
		}
		if ($sppl_pay_crryovr_times.equalsIgnoreCase(name)) {
			sppl_pay_crryovr_times(value);
			return;
		}
		if ($trd_cur_amt_dec_place.equalsIgnoreCase(name)) {
			trd_cur_amt_dec_place(value);
			return;
		}
		if ($trd_cur_upri_dec_place.equalsIgnoreCase(name)) {
			trd_cur_upri_dec_place(value);
			return;
		}
		if ($tax_rate.equalsIgnoreCase(name)) {
			tax_rate(value);
			return;
		}
		if ($trd_cur_proc_amt.equalsIgnoreCase(name)) {
			trd_cur_proc_amt(value);
			return;
		}
		if ($trd_cur_onr_prov_amt.equalsIgnoreCase(name)) {
			trd_cur_onr_prov_amt(value);
			return;
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
			return;
		}
		if ($trd_cur_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_tax_amt(value);
			return;
		}
		if ($wtax_amt.equalsIgnoreCase(name)) {
			wtax_amt(value);
			return;
		}
		if ($sppl_amt_dec_place.equalsIgnoreCase(name)) {
			sppl_amt_dec_place(value);
			return;
		}
		if ($sppl_upri_dec_place.equalsIgnoreCase(name)) {
			sppl_upri_dec_place(value);
			return;
		}
		if ($itm_pay_crryovr_times.equalsIgnoreCase(name)) {
			itm_pay_crryovr_times(value);
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
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($bef_po_rev.equalsIgnoreCase(name)) {
			bef_po_rev(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($po_rev.equalsIgnoreCase(name)) {
			po_rev(value);
			return;
		}
		if ($sppl_pay_crryovr_times.equalsIgnoreCase(name)) {
			sppl_pay_crryovr_times(value);
			return;
		}
		if ($trd_cur_amt_dec_place.equalsIgnoreCase(name)) {
			trd_cur_amt_dec_place(value);
			return;
		}
		if ($trd_cur_upri_dec_place.equalsIgnoreCase(name)) {
			trd_cur_upri_dec_place(value);
			return;
		}
		if ($tax_rate.equalsIgnoreCase(name)) {
			tax_rate(value);
			return;
		}
		if ($trd_cur_proc_amt.equalsIgnoreCase(name)) {
			trd_cur_proc_amt(value);
			return;
		}
		if ($trd_cur_onr_prov_amt.equalsIgnoreCase(name)) {
			trd_cur_onr_prov_amt(value);
			return;
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
			return;
		}
		if ($trd_cur_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_tax_amt(value);
			return;
		}
		if ($wtax_amt.equalsIgnoreCase(name)) {
			wtax_amt(value);
			return;
		}
		if ($sppl_amt_dec_place.equalsIgnoreCase(name)) {
			sppl_amt_dec_place(value);
			return;
		}
		if ($sppl_upri_dec_place.equalsIgnoreCase(name)) {
			sppl_upri_dec_place(value);
			return;
		}
		if ($itm_pay_crryovr_times.equalsIgnoreCase(name)) {
			itm_pay_crryovr_times(value);
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
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($bef_po_rev.equalsIgnoreCase(name)) {
			bef_po_rev(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($po_rev.equalsIgnoreCase(name)) {
			po_rev(value);
			return;
		}
		if ($sppl_pay_crryovr_times.equalsIgnoreCase(name)) {
			sppl_pay_crryovr_times(value);
			return;
		}
		if ($trd_cur_amt_dec_place.equalsIgnoreCase(name)) {
			trd_cur_amt_dec_place(value);
			return;
		}
		if ($trd_cur_upri_dec_place.equalsIgnoreCase(name)) {
			trd_cur_upri_dec_place(value);
			return;
		}
		if ($tax_rate.equalsIgnoreCase(name)) {
			tax_rate(value);
			return;
		}
		if ($trd_cur_proc_amt.equalsIgnoreCase(name)) {
			trd_cur_proc_amt(value);
			return;
		}
		if ($trd_cur_onr_prov_amt.equalsIgnoreCase(name)) {
			trd_cur_onr_prov_amt(value);
			return;
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
			return;
		}
		if ($trd_cur_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_tax_amt(value);
			return;
		}
		if ($wtax_amt.equalsIgnoreCase(name)) {
			wtax_amt(value);
			return;
		}
		if ($sppl_amt_dec_place.equalsIgnoreCase(name)) {
			sppl_amt_dec_place(value);
			return;
		}
		if ($sppl_upri_dec_place.equalsIgnoreCase(name)) {
			sppl_upri_dec_place(value);
			return;
		}
		if ($itm_pay_crryovr_times.equalsIgnoreCase(name)) {
			itm_pay_crryovr_times(value);
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
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($bef_po_rev.equalsIgnoreCase(name)) {
			bef_po_rev(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($po_rev.equalsIgnoreCase(name)) {
			po_rev(value);
			return;
		}
		if ($sppl_pay_crryovr_times.equalsIgnoreCase(name)) {
			sppl_pay_crryovr_times(value);
			return;
		}
		if ($trd_cur_amt_dec_place.equalsIgnoreCase(name)) {
			trd_cur_amt_dec_place(value);
			return;
		}
		if ($trd_cur_upri_dec_place.equalsIgnoreCase(name)) {
			trd_cur_upri_dec_place(value);
			return;
		}
		if ($tax_rate.equalsIgnoreCase(name)) {
			tax_rate(value);
			return;
		}
		if ($trd_cur_proc_amt.equalsIgnoreCase(name)) {
			trd_cur_proc_amt(value);
			return;
		}
		if ($trd_cur_onr_prov_amt.equalsIgnoreCase(name)) {
			trd_cur_onr_prov_amt(value);
			return;
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
			return;
		}
		if ($trd_cur_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_tax_amt(value);
			return;
		}
		if ($wtax_amt.equalsIgnoreCase(name)) {
			wtax_amt(value);
			return;
		}
		if ($sppl_amt_dec_place.equalsIgnoreCase(name)) {
			sppl_amt_dec_place(value);
			return;
		}
		if ($sppl_upri_dec_place.equalsIgnoreCase(name)) {
			sppl_upri_dec_place(value);
			return;
		}
		if ($itm_pay_crryovr_times.equalsIgnoreCase(name)) {
			itm_pay_crryovr_times(value);
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
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($bef_po_rev.equalsIgnoreCase(name)) {
			bef_po_rev(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($rqst_dlv_rqst_tm.equalsIgnoreCase(name)) {
			rqst_dlv_rqst_tm(value);
			return;
		}
		if ($purc_upri_req_base_dt.equalsIgnoreCase(name)) {
			purc_upri_req_base_dt(value);
			return;
		}
		super.setDateNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($err_flg.equalsIgnoreCase(name)) {
			err_flg(value);
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
		if ($repurc_obli_flg.equalsIgnoreCase(name)) {
			repurc_obli_flg(value);
			return;
		}
		if ($sppl_purc_upri_cng_flg.equalsIgnoreCase(name)) {
			sppl_purc_upri_cng_flg(value);
			return;
		}
		if ($inc_tax_flg.equalsIgnoreCase(name)) {
			inc_tax_flg(value);
			return;
		}
		if ($sundry_itm_flg.equalsIgnoreCase(name)) {
			sundry_itm_flg(value);
			return;
		}
		if ($dscnt_itm_flg.equalsIgnoreCase(name)) {
			dscnt_itm_flg(value);
			return;
		}
		if ($ver_flg.equalsIgnoreCase(name)) {
			ver_flg(value);
			return;
		}
		if ($itm_purc_upri_cng_flg.equalsIgnoreCase(name)) {
			itm_purc_upri_cng_flg(value);
			return;
		}
		if ($arr_skip_flg.equalsIgnoreCase(name)) {
			arr_skip_flg(value);
			return;
		}
		if ($str_ln_tgt_flg.equalsIgnoreCase(name)) {
			str_ln_tgt_flg(value);
			return;
		}
		if ($outsrc_flg.equalsIgnoreCase(name)) {
			outsrc_flg(value);
			return;
		}
		if ($xpns_purc_flg.equalsIgnoreCase(name)) {
			xpns_purc_flg(value);
			return;
		}
		if ($edi_flg.equalsIgnoreCase(name)) {
			edi_flg(value);
			return;
		}
		if ($abort_flg.equalsIgnoreCase(name)) {
			abort_flg(value);
			return;
		}
		if ($bef_abort_flg.equalsIgnoreCase(name)) {
			bef_abort_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}

	public MCRow getInnerRow(String name) {
		if ($poif.equalsIgnoreCase(name)) {
			return poif();
		}
		return super.getInnerRow(name);
	}

	public void setInnerRow(String name, MCRow value) {
		if ($poif.equalsIgnoreCase(name)) {
			poif(
				((MCContainerMeta) poif_META).castInnerRow(mcframe.serverMS.dbc.MST_PO_RECV_IF_R.class, value)
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
		return poif().data_lno();
	}

	/**
	 * Data row No. データ行ＮＯ.<p>
	 *
	 */
	public void data_lno(MCNumber value) {
		poif().data_lno(value);
	}

	/**
	 * Data row No. データ行ＮＯ.<p>
	 *
	 */
	public void data_lno(int value) {
		poif().data_lno(value);
	}

	/**
	 * Data row No. データ行ＮＯ.<p>
	 *
	 */
	public void data_lno(long value) {
		poif().data_lno(value);
	}

	/**
	 * Data row No. データ行ＮＯ.<p>
	 *
	 */
	public void data_lno(float value) {
		poif().data_lno(value);
	}

	/**
	 * Data row No. データ行ＮＯ.<p>
	 *
	 */
	public void data_lno(double value) {
		poif().data_lno(value);
	}

	/**
	 * Data No. データＮＯ.<p>
	 *
	 */
	public MCNumber data_no() {
		return poif().data_no();
	}

	/**
	 * Data No. データＮＯ.<p>
	 *
	 */
	public void data_no(MCNumber value) {
		poif().data_no(value);
	}

	/**
	 * Data No. データＮＯ.<p>
	 *
	 */
	public void data_no(int value) {
		poif().data_no(value);
	}

	/**
	 * Data No. データＮＯ.<p>
	 *
	 */
	public void data_no(long value) {
		poif().data_no(value);
	}

	/**
	 * Data No. データＮＯ.<p>
	 *
	 */
	public void data_no(float value) {
		poif().data_no(value);
	}

	/**
	 * Data No. データＮＯ.<p>
	 *
	 */
	public void data_no(double value) {
		poif().data_no(value);
	}

	/**
	 * Data update type データ更新区分.<p>
	 *
	 */
	public String data_crud_typ() {
		return poif().data_crud_typ();
	}

	/**
	 * Data update type データ更新区分.<p>
	 *
	 */
	public void data_crud_typ(String value) {
		poif().data_crud_typ(value);
	}

	/**
	 * PG execution status type ＰＧ実行状況区分.<p>
	 *
	 */
	public String exe_sts_typ() {
		return poif().exe_sts_typ();
	}

	/**
	 * PG execution status type ＰＧ実行状況区分.<p>
	 *
	 */
	public void exe_sts_typ(String value) {
		poif().exe_sts_typ(value);
	}

	/**
	 * External system cd. 外部システムＣＤ.<p>
	 *
	 */
	public String ext_sys_cd() {
		return poif().ext_sys_cd();
	}

	/**
	 * External system cd. 外部システムＣＤ.<p>
	 *
	 */
	public void ext_sys_cd(String value) {
		poif().ext_sys_cd(value);
	}

	/**
	 * External system data row No. 外部システムデータ行ＮＯ.<p>
	 *
	 */
	public MCNumber ext_data_lno() {
		return poif().ext_data_lno();
	}

	/**
	 * External system data row No. 外部システムデータ行ＮＯ.<p>
	 *
	 */
	public void ext_data_lno(MCNumber value) {
		poif().ext_data_lno(value);
	}

	/**
	 * External system data row No. 外部システムデータ行ＮＯ.<p>
	 *
	 */
	public void ext_data_lno(int value) {
		poif().ext_data_lno(value);
	}

	/**
	 * External system data row No. 外部システムデータ行ＮＯ.<p>
	 *
	 */
	public void ext_data_lno(long value) {
		poif().ext_data_lno(value);
	}

	/**
	 * External system data row No. 外部システムデータ行ＮＯ.<p>
	 *
	 */
	public void ext_data_lno(float value) {
		poif().ext_data_lno(value);
	}

	/**
	 * External system data row No. 外部システムデータ行ＮＯ.<p>
	 *
	 */
	public void ext_data_lno(double value) {
		poif().ext_data_lno(value);
	}

	/**
	 * External system data No. 外部システムデータＮＯ.<p>
	 *
	 */
	public MCNumber ext_data_no() {
		return poif().ext_data_no();
	}

	/**
	 * External system data No. 外部システムデータＮＯ.<p>
	 *
	 */
	public void ext_data_no(MCNumber value) {
		poif().ext_data_no(value);
	}

	/**
	 * External system data No. 外部システムデータＮＯ.<p>
	 *
	 */
	public void ext_data_no(int value) {
		poif().ext_data_no(value);
	}

	/**
	 * External system data No. 外部システムデータＮＯ.<p>
	 *
	 */
	public void ext_data_no(long value) {
		poif().ext_data_no(value);
	}

	/**
	 * External system data No. 外部システムデータＮＯ.<p>
	 *
	 */
	public void ext_data_no(float value) {
		poif().ext_data_no(value);
	}

	/**
	 * External system data No. 外部システムデータＮＯ.<p>
	 *
	 */
	public void ext_data_no(double value) {
		poif().ext_data_no(value);
	}

	/**
	 * Creation date and time of source record 送信元レコード作成日時.<p>
	 *
	 */
	public MCDate data_make_dt() {
		return poif().data_make_dt();
	}

	/**
	 * Creation date and time of source record 送信元レコード作成日時.<p>
	 *
	 */
	public void data_make_dt(MCDate value) {
		poif().data_make_dt(value);
	}

	/**
	 * To import flg. 取込対象ＦＬＧ.<p>
	 *
	 */
	public boolean imp_flg() {
		return poif().imp_flg();
	}

	/**
	 * To import flg. 取込対象ＦＬＧ.<p>
	 *
	 */
	public void imp_flg(boolean value) {
		poif().imp_flg(value);
	}

	/**
	 * Receiving date 受信日.<p>
	 *
	 */
	public MCDate recv_dt() {
		return poif().recv_dt();
	}

	/**
	 * Receiving date 受信日.<p>
	 *
	 */
	public void recv_dt(MCDate value) {
		poif().recv_dt(value);
	}

	/**
	 * External PO No. 外部発注ＮＯ.<p>
	 *
	 */
	public String ext_po_no() {
		return poif().ext_po_no();
	}

	/**
	 * External PO No. 外部発注ＮＯ.<p>
	 *
	 */
	public void ext_po_no(String value) {
		poif().ext_po_no(value);
	}

	/**
	 * External PO details No. 外部発注明細ＮＯ.<p>
	 *
	 */
	public String ext_po_d_no() {
		return poif().ext_po_d_no();
	}

	/**
	 * External PO details No. 外部発注明細ＮＯ.<p>
	 *
	 */
	public void ext_po_d_no(String value) {
		poif().ext_po_d_no(value);
	}

	/**
	 * PO sheet issue flg. 注文書発行ＦＬＧ.<p>
	 *
	 */
	public boolean prnt_po_flg() {
		return poif().prnt_po_flg();
	}

	/**
	 * PO sheet issue flg. 注文書発行ＦＬＧ.<p>
	 *
	 */
	public void prnt_po_flg(boolean value) {
		poif().prnt_po_flg(value);
	}

	/**
	 * Delivery note issue flg. 納品書発行ＦＬＧ.<p>
	 *
	 */
	public boolean prnt_dlv_flg() {
		return poif().prnt_dlv_flg();
	}

	/**
	 * Delivery note issue flg. 納品書発行ＦＬＧ.<p>
	 *
	 */
	public void prnt_dlv_flg(boolean value) {
		poif().prnt_dlv_flg(value);
	}

	/**
	 * PO date 発注日.<p>
	 *
	 */
	public MCDate po_dt() {
		return poif().po_dt();
	}

	/**
	 * PO date 発注日.<p>
	 *
	 */
	public void po_dt(MCDate value) {
		poif().po_dt(value);
	}

	/**
	 * Transaction cd. 取引ＣＤ.<p>
	 *
	 */
	public String trd_cd() {
		return poif().trd_cd();
	}

	/**
	 * Transaction cd. 取引ＣＤ.<p>
	 *
	 */
	public void trd_cd(String value) {
		poif().trd_cd(value);
	}

	/**
	 * Transaction pattern type 取引パタン区分.<p>
	 *
	 */
	public String trd_ptn_typ() {
		return poif().trd_ptn_typ();
	}

	/**
	 * Transaction pattern type 取引パタン区分.<p>
	 *
	 */
	public void trd_ptn_typ(String value) {
		poif().trd_ptn_typ(value);
	}

	/**
	 * Supplier cd. 発注先ＣＤ.<p>
	 *
	 */
	public String sppl_cd() {
		return poif().sppl_cd();
	}

	/**
	 * Supplier cd. 発注先ＣＤ.<p>
	 *
	 */
	public void sppl_cd(String value) {
		poif().sppl_cd(value);
	}

	/**
	 * Purchasing dept. cd. 購買部門ＣＤ.<p>
	 *
	 */
	public String purc_dpt_cd() {
		return poif().purc_dpt_cd();
	}

	/**
	 * Purchasing dept. cd. 購買部門ＣＤ.<p>
	 *
	 */
	public void purc_dpt_cd(String value) {
		poif().purc_dpt_cd(value);
	}

	/**
	 * Purchasing PIC cd. 購買担当者ＣＤ.<p>
	 *
	 */
	public String purc_usr_cd() {
		return poif().purc_usr_cd();
	}

	/**
	 * Purchasing PIC cd. 購買担当者ＣＤ.<p>
	 *
	 */
	public void purc_usr_cd(String value) {
		poif().purc_usr_cd(value);
	}

	/**
	 * Transaction currency cd. 取引通貨ＣＤ.<p>
	 *
	 */
	public String trd_cur_cd() {
		return poif().trd_cur_cd();
	}

	/**
	 * Transaction currency cd. 取引通貨ＣＤ.<p>
	 *
	 */
	public void trd_cur_cd(String value) {
		poif().trd_cur_cd(value);
	}

	/**
	 * Exchange rate 為替レート.<p>
	 *
	 */
	public MCNumber xrate() {
		return poif().xrate();
	}

	/**
	 * Exchange rate 為替レート.<p>
	 *
	 */
	public void xrate(MCNumber value) {
		poif().xrate(value);
	}

	/**
	 * Exchange rate 為替レート.<p>
	 *
	 */
	public void xrate(int value) {
		poif().xrate(value);
	}

	/**
	 * Exchange rate 為替レート.<p>
	 *
	 */
	public void xrate(long value) {
		poif().xrate(value);
	}

	/**
	 * Exchange rate 為替レート.<p>
	 *
	 */
	public void xrate(float value) {
		poif().xrate(value);
	}

	/**
	 * Exchange rate 為替レート.<p>
	 *
	 */
	public void xrate(double value) {
		poif().xrate(value);
	}

	/**
	 * Set exchange rate flg. 為替レート指定ＦＬＧ.<p>
	 *
	 */
	public boolean xrate_inpt_flg() {
		return poif().xrate_inpt_flg();
	}

	/**
	 * Set exchange rate flg. 為替レート指定ＦＬＧ.<p>
	 *
	 */
	public void xrate_inpt_flg(boolean value) {
		poif().xrate_inpt_flg(value);
	}

	/**
	 * Taxpaying exchange rate 納税為替レート.<p>
	 *
	 */
	public MCNumber ptax_xrate() {
		return poif().ptax_xrate();
	}

	/**
	 * Taxpaying exchange rate 納税為替レート.<p>
	 *
	 */
	public void ptax_xrate(MCNumber value) {
		poif().ptax_xrate(value);
	}

	/**
	 * Taxpaying exchange rate 納税為替レート.<p>
	 *
	 */
	public void ptax_xrate(int value) {
		poif().ptax_xrate(value);
	}

	/**
	 * Taxpaying exchange rate 納税為替レート.<p>
	 *
	 */
	public void ptax_xrate(long value) {
		poif().ptax_xrate(value);
	}

	/**
	 * Taxpaying exchange rate 納税為替レート.<p>
	 *
	 */
	public void ptax_xrate(float value) {
		poif().ptax_xrate(value);
	}

	/**
	 * Taxpaying exchange rate 納税為替レート.<p>
	 *
	 */
	public void ptax_xrate(double value) {
		poif().ptax_xrate(value);
	}

	/**
	 * Taxpaying exchange rate specification flg. 納税為替レート指定ＦＬＧ.<p>
	 *
	 */
	public boolean ptax_xrate_inpt_flg() {
		return poif().ptax_xrate_inpt_flg();
	}

	/**
	 * Taxpaying exchange rate specification flg. 納税為替レート指定ＦＬＧ.<p>
	 *
	 */
	public void ptax_xrate_inpt_flg(boolean value) {
		poif().ptax_xrate_inpt_flg(value);
	}

	/**
	 * Display PO sheet cd. 注文書表示ＣＤ.<p>
	 *
	 */
	public String po_print_cd() {
		return poif().po_print_cd();
	}

	/**
	 * Display PO sheet cd. 注文書表示ＣＤ.<p>
	 *
	 */
	public void po_print_cd(String value) {
		poif().po_print_cd(value);
	}

	/**
	 * Scheduled change PO sheet issue date after change 変更注文書発行予定日.<p>
	 *
	 */
	public MCDate upd_po_print_schd_dt() {
		return poif().upd_po_print_schd_dt();
	}

	/**
	 * Scheduled change PO sheet issue date after change 変更注文書発行予定日.<p>
	 *
	 */
	public void upd_po_print_schd_dt(MCDate value) {
		poif().upd_po_print_schd_dt(value);
	}

	/**
	 * Correction reason cd. 訂正理由ＣＤ.<p>
	 *
	 */
	public String crct_rsn_cd() {
		return poif().crct_rsn_cd();
	}

	/**
	 * Correction reason cd. 訂正理由ＣＤ.<p>
	 *
	 */
	public void crct_rsn_cd(String value) {
		poif().crct_rsn_cd(value);
	}

	/**
	 * Transaction terms cd. 1 取引条件ＣＤ１.<p>
	 *
	 */
	public String tterm_cd1() {
		return poif().tterm_cd1();
	}

	/**
	 * Transaction terms cd. 1 取引条件ＣＤ１.<p>
	 *
	 */
	public void tterm_cd1(String value) {
		poif().tterm_cd1(value);
	}

	/**
	 * Transaction terms remarks 1 取引条件備考１.<p>
	 *
	 */
	public String tterm_rmrks1() {
		return poif().tterm_rmrks1();
	}

	/**
	 * Transaction terms remarks 1 取引条件備考１.<p>
	 *
	 */
	public void tterm_rmrks1(String value) {
		poif().tterm_rmrks1(value);
	}

	/**
	 * Transaction terms cd. 2 取引条件ＣＤ２.<p>
	 *
	 */
	public String tterm_cd2() {
		return poif().tterm_cd2();
	}

	/**
	 * Transaction terms cd. 2 取引条件ＣＤ２.<p>
	 *
	 */
	public void tterm_cd2(String value) {
		poif().tterm_cd2(value);
	}

	/**
	 * Transaction terms remarks 2 取引条件備考２.<p>
	 *
	 */
	public String tterm_rmrks2() {
		return poif().tterm_rmrks2();
	}

	/**
	 * Transaction terms remarks 2 取引条件備考２.<p>
	 *
	 */
	public void tterm_rmrks2(String value) {
		poif().tterm_rmrks2(value);
	}

	/**
	 * Transaction terms cd. 3 取引条件ＣＤ３.<p>
	 *
	 */
	public String tterm_cd3() {
		return poif().tterm_cd3();
	}

	/**
	 * Transaction terms cd. 3 取引条件ＣＤ３.<p>
	 *
	 */
	public void tterm_cd3(String value) {
		poif().tterm_cd3(value);
	}

	/**
	 * Transaction terms remarks 3 取引条件備考３.<p>
	 *
	 */
	public String tterm_rmrks3() {
		return poif().tterm_rmrks3();
	}

	/**
	 * Transaction terms remarks 3 取引条件備考３.<p>
	 *
	 */
	public void tterm_rmrks3(String value) {
		poif().tterm_rmrks3(value);
	}

	/**
	 * Transaction remarks 取引備考.<p>
	 *
	 */
	public String trd_rmrks() {
		return poif().trd_rmrks();
	}

	/**
	 * Transaction remarks 取引備考.<p>
	 *
	 */
	public void trd_rmrks(String value) {
		poif().trd_rmrks(value);
	}

	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public String intr_rmrks() {
		return poif().intr_rmrks();
	}

	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public void intr_rmrks(String value) {
		poif().intr_rmrks(value);
	}

	/**
	 * PO sheet remarks 注文書備考.<p>
	 *
	 */
	public String po_print_rmrks() {
		return poif().po_print_rmrks();
	}

	/**
	 * PO sheet remarks 注文書備考.<p>
	 *
	 */
	public void po_print_rmrks(String value) {
		poif().po_print_rmrks(value);
	}

	/**
	 * Delivery note remarks 納品書備考.<p>
	 *
	 */
	public String dlv_slip_rmrks() {
		return poif().dlv_slip_rmrks();
	}

	/**
	 * Delivery note remarks 納品書備考.<p>
	 *
	 */
	public void dlv_slip_rmrks(String value) {
		poif().dlv_slip_rmrks(value);
	}

	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public String itm_cd() {
		return poif().itm_cd();
	}

	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public void itm_cd(String value) {
		poif().itm_cd(value);
	}

	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public String itm_sub1() {
		return poif().itm_sub1();
	}

	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public void itm_sub1(String value) {
		poif().itm_sub1(value);
	}

	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public String itm_sub2() {
		return poif().itm_sub2();
	}

	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public void itm_sub2(String value) {
		poif().itm_sub2(value);
	}

	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public String itm_sub3() {
		return poif().itm_sub3();
	}

	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public void itm_sub3(String value) {
		poif().itm_sub3(value);
	}

	/**
	 * Item name 品名.<p>
	 *
	 */
	public String itm_nm() {
		return poif().itm_nm();
	}

	/**
	 * Item name 品名.<p>
	 *
	 */
	public void itm_nm(String value) {
		poif().itm_nm(value);
	}

	/**
	 * Item name for invoice インボイス表記品名.<p>
	 *
	 */
	public String iv_itm_nm() {
		return poif().iv_itm_nm();
	}

	/**
	 * Item name for invoice インボイス表記品名.<p>
	 *
	 */
	public void iv_itm_nm(String value) {
		poif().iv_itm_nm(value);
	}

	/**
	 * Version No. 版ＮＯ.<p>
	 *
	 */
	public String ver_no() {
		return poif().ver_no();
	}

	/**
	 * Version No. 版ＮＯ.<p>
	 *
	 */
	public void ver_no(String value) {
		poif().ver_no(value);
	}

	/**
	 * SEIBAN No. 1 手配ＮＯ１.<p>
	 *
	 */
	public String sno1() {
		return poif().sno1();
	}

	/**
	 * SEIBAN No. 1 手配ＮＯ１.<p>
	 *
	 */
	public void sno1(String value) {
		poif().sno1(value);
	}

	/**
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public String sno2() {
		return poif().sno2();
	}

	/**
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public void sno2(String value) {
		poif().sno2(value);
	}

	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public String sno3() {
		return poif().sno3();
	}

	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public void sno3(String value) {
		poif().sno3(value);
	}

	/**
	 * SEIBAN No. 4 手配ＮＯ４.<p>
	 *
	 */
	public String sno4() {
		return poif().sno4();
	}

	/**
	 * SEIBAN No. 4 手配ＮＯ４.<p>
	 *
	 */
	public void sno4(String value) {
		poif().sno4(value);
	}

	/**
	 * Purchase identification type 購買識別区分.<p>
	 *
	 */
	public String purc_id_typ() {
		return poif().purc_id_typ();
	}

	/**
	 * Purchase identification type 購買識別区分.<p>
	 *
	 */
	public void purc_id_typ(String value) {
		poif().purc_id_typ(value);
	}

	/**
	 * Supplier item cd. 発注先品目ＣＤ.<p>
	 *
	 */
	public String sppl_itm_cd() {
		return poif().sppl_itm_cd();
	}

	/**
	 * Supplier item cd. 発注先品目ＣＤ.<p>
	 *
	 */
	public void sppl_itm_cd(String value) {
		poif().sppl_itm_cd(value);
	}

	/**
	 * Supplier item name 発注先品名.<p>
	 *
	 */
	public String sppl_itm_nm() {
		return poif().sppl_itm_nm();
	}

	/**
	 * Supplier item name 発注先品名.<p>
	 *
	 */
	public void sppl_itm_nm(String value) {
		poif().sppl_itm_nm(value);
	}

	/**
	 * Maker cd. メーカＣＤ.<p>
	 *
	 */
	public String maker_cd() {
		return poif().maker_cd();
	}

	/**
	 * Maker cd. メーカＣＤ.<p>
	 *
	 */
	public void maker_cd(String value) {
		poif().maker_cd(value);
	}

	/**
	 * Vendor lot No. 業者ロットＮＯ.<p>
	 *
	 */
	public String bp_lot_no() {
		return poif().bp_lot_no();
	}

	/**
	 * Vendor lot No. 業者ロットＮＯ.<p>
	 *
	 */
	public void bp_lot_no(String value) {
		poif().bp_lot_no(value);
	}

	/**
	 * Delivery location cd. 納入場所ＣＤ.<p>
	 *
	 */
	public String in_to_loc_cd() {
		return poif().in_to_loc_cd();
	}

	/**
	 * Delivery location cd. 納入場所ＣＤ.<p>
	 *
	 */
	public void in_to_loc_cd(String value) {
		poif().in_to_loc_cd(value);
	}

	/**
	 * Rack/Line cd. 棚・ラインＣＤ.<p>
	 *
	 */
	public String str_ln_cd() {
		return poif().str_ln_cd();
	}

	/**
	 * Rack/Line cd. 棚・ラインＣＤ.<p>
	 *
	 */
	public void str_ln_cd(String value) {
		poif().str_ln_cd(value);
	}

	/**
	 * Mfg. location cd. 製造場所ＣＤ.<p>
	 *
	 */
	public String mfg_loc_cd() {
		return poif().mfg_loc_cd();
	}

	/**
	 * Mfg. location cd. 製造場所ＣＤ.<p>
	 *
	 */
	public void mfg_loc_cd(String value) {
		poif().mfg_loc_cd(value);
	}

	/**
	 * BOM pattern 構成パタン.<p>
	 *
	 */
	public String bom_ptn() {
		return poif().bom_ptn();
	}

	/**
	 * BOM pattern 構成パタン.<p>
	 *
	 */
	public void bom_ptn(String value) {
		poif().bom_ptn(value);
	}

	/**
	 * Desired delivery date and time 納入希望日時.<p>
	 *
	 */
	public MCDate dlv_rqst_tm() {
		return poif().dlv_rqst_tm();
	}

	/**
	 * Desired delivery date and time 納入希望日時.<p>
	 *
	 */
	public void dlv_rqst_tm(MCDate value) {
		poif().dlv_rqst_tm(value);
	}

	/**
	 * Request source desired available date 依頼元使用可能希望日.<p>
	 *
	 */
	public MCDate rqst_avl_rqst_dt() {
		return poif().rqst_avl_rqst_dt();
	}

	/**
	 * Request source desired available date 依頼元使用可能希望日.<p>
	 *
	 */
	public void rqst_avl_rqst_dt(MCDate value) {
		poif().rqst_avl_rqst_dt(value);
	}

	/**
	 * Scheduled purchase date 仕入予定日.<p>
	 *
	 */
	public MCDate purc_schd_dt() {
		return poif().purc_schd_dt();
	}

	/**
	 * Scheduled purchase date 仕入予定日.<p>
	 *
	 */
	public void purc_schd_dt(MCDate value) {
		poif().purc_schd_dt(value);
	}

	/**
	 * Simultaneous recording flg. 同時計上ＦＬＧ.<p>
	 *
	 */
	public boolean sync_flg() {
		return poif().sync_flg();
	}

	/**
	 * Simultaneous recording flg. 同時計上ＦＬＧ.<p>
	 *
	 */
	public void sync_flg(boolean value) {
		poif().sync_flg(value);
	}

	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public MCNumber trd_unit_qty() {
		return poif().trd_unit_qty();
	}

	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public void trd_unit_qty(MCNumber value) {
		poif().trd_unit_qty(value);
	}

	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public void trd_unit_qty(int value) {
		poif().trd_unit_qty(value);
	}

	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public void trd_unit_qty(long value) {
		poif().trd_unit_qty(value);
	}

	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public void trd_unit_qty(float value) {
		poif().trd_unit_qty(value);
	}

	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public void trd_unit_qty(double value) {
		poif().trd_unit_qty(value);
	}

	/**
	 * Transaction unit cd. 取引単位ＣＤ.<p>
	 *
	 */
	public String trd_unit_cd() {
		return poif().trd_unit_cd();
	}

	/**
	 * Transaction unit cd. 取引単位ＣＤ.<p>
	 *
	 */
	public void trd_unit_cd(String value) {
		poif().trd_unit_cd(value);
	}

	/**
	 * Purchase unit price acquisition type 購買単価取得区分.<p>
	 *
	 */
	public String purc_upri_req_typ() {
		return poif().purc_upri_req_typ();
	}

	/**
	 * Purchase unit price acquisition type 購買単価取得区分.<p>
	 *
	 */
	public void purc_upri_req_typ(String value) {
		poif().purc_upri_req_typ(value);
	}

	/**
	 * Not to acquire unit price flg. 単価取得対象外ＦＬＧ.<p>
	 *
	 */
	public boolean upri_not_tgt_flg() {
		return poif().upri_not_tgt_flg();
	}

	/**
	 * Not to acquire unit price flg. 単価取得対象外ＦＬＧ.<p>
	 *
	 */
	public void upri_not_tgt_flg(boolean value) {
		poif().upri_not_tgt_flg(value);
	}

	/**
	 * Unit price (Transaction currency) 取引通貨単価.<p>
	 *
	 */
	public MCNumber trd_cur_upri() {
		return poif().trd_cur_upri();
	}

	/**
	 * Unit price (Transaction currency) 取引通貨単価.<p>
	 *
	 */
	public void trd_cur_upri(MCNumber value) {
		poif().trd_cur_upri(value);
	}

	/**
	 * Unit price (Transaction currency) 取引通貨単価.<p>
	 *
	 */
	public void trd_cur_upri(int value) {
		poif().trd_cur_upri(value);
	}

	/**
	 * Unit price (Transaction currency) 取引通貨単価.<p>
	 *
	 */
	public void trd_cur_upri(long value) {
		poif().trd_cur_upri(value);
	}

	/**
	 * Unit price (Transaction currency) 取引通貨単価.<p>
	 *
	 */
	public void trd_cur_upri(float value) {
		poif().trd_cur_upri(value);
	}

	/**
	 * Unit price (Transaction currency) 取引通貨単価.<p>
	 *
	 */
	public void trd_cur_upri(double value) {
		poif().trd_cur_upri(value);
	}

	/**
	 * Temporary unit price flg. 仮単価ＦＬＧ.<p>
	 *
	 */
	public boolean interim_flg() {
		return poif().interim_flg();
	}

	/**
	 * Temporary unit price flg. 仮単価ＦＬＧ.<p>
	 *
	 */
	public void interim_flg(boolean value) {
		poif().interim_flg(value);
	}

	/**
	 * Tax specified flg. 税指定ＦＬＧ.<p>
	 *
	 */
	public boolean tax_fix_flg() {
		return poif().tax_fix_flg();
	}

	/**
	 * Tax specified flg. 税指定ＦＬＧ.<p>
	 *
	 */
	public void tax_fix_flg(boolean value) {
		poif().tax_fix_flg(value);
	}

	/**
	 * Tax cd. 税ＣＤ.<p>
	 *
	 */
	public String tax_cd() {
		return poif().tax_cd();
	}

	/**
	 * Tax cd. 税ＣＤ.<p>
	 *
	 */
	public void tax_cd(String value) {
		poif().tax_cd(value);
	}

	/**
	 * Discount amount (Transaction currency) 取引通貨値引額.<p>
	 *
	 */
	public MCNumber trd_cur_dscnt_amt() {
		return poif().trd_cur_dscnt_amt();
	}

	/**
	 * Discount amount (Transaction currency) 取引通貨値引額.<p>
	 *
	 */
	public void trd_cur_dscnt_amt(MCNumber value) {
		poif().trd_cur_dscnt_amt(value);
	}

	/**
	 * Discount amount (Transaction currency) 取引通貨値引額.<p>
	 *
	 */
	public void trd_cur_dscnt_amt(int value) {
		poif().trd_cur_dscnt_amt(value);
	}

	/**
	 * Discount amount (Transaction currency) 取引通貨値引額.<p>
	 *
	 */
	public void trd_cur_dscnt_amt(long value) {
		poif().trd_cur_dscnt_amt(value);
	}

	/**
	 * Discount amount (Transaction currency) 取引通貨値引額.<p>
	 *
	 */
	public void trd_cur_dscnt_amt(float value) {
		poif().trd_cur_dscnt_amt(value);
	}

	/**
	 * Discount amount (Transaction currency) 取引通貨値引額.<p>
	 *
	 */
	public void trd_cur_dscnt_amt(double value) {
		poif().trd_cur_dscnt_amt(value);
	}

	/**
	 * Discount reason cd. 値引理由ＣＤ.<p>
	 *
	 */
	public String dscnt_rsn_cd() {
		return poif().dscnt_rsn_cd();
	}

	/**
	 * Discount reason cd. 値引理由ＣＤ.<p>
	 *
	 */
	public void dscnt_rsn_cd(String value) {
		poif().dscnt_rsn_cd(value);
	}

	/**
	 * Subcontracting unit price (Transaction currency) 取引通貨加工単価.<p>
	 *
	 */
	public MCNumber trd_cur_proc_upri() {
		return poif().trd_cur_proc_upri();
	}

	/**
	 * Subcontracting unit price (Transaction currency) 取引通貨加工単価.<p>
	 *
	 */
	public void trd_cur_proc_upri(MCNumber value) {
		poif().trd_cur_proc_upri(value);
	}

	/**
	 * Subcontracting unit price (Transaction currency) 取引通貨加工単価.<p>
	 *
	 */
	public void trd_cur_proc_upri(int value) {
		poif().trd_cur_proc_upri(value);
	}

	/**
	 * Subcontracting unit price (Transaction currency) 取引通貨加工単価.<p>
	 *
	 */
	public void trd_cur_proc_upri(long value) {
		poif().trd_cur_proc_upri(value);
	}

	/**
	 * Subcontracting unit price (Transaction currency) 取引通貨加工単価.<p>
	 *
	 */
	public void trd_cur_proc_upri(float value) {
		poif().trd_cur_proc_upri(value);
	}

	/**
	 * Subcontracting unit price (Transaction currency) 取引通貨加工単価.<p>
	 *
	 */
	public void trd_cur_proc_upri(double value) {
		poif().trd_cur_proc_upri(value);
	}

	/**
	 * Chargeable supply unit price (Transaction currency) 取引通貨有償支給単価.<p>
	 *
	 */
	public MCNumber trd_cur_onr_prov_upri() {
		return poif().trd_cur_onr_prov_upri();
	}

	/**
	 * Chargeable supply unit price (Transaction currency) 取引通貨有償支給単価.<p>
	 *
	 */
	public void trd_cur_onr_prov_upri(MCNumber value) {
		poif().trd_cur_onr_prov_upri(value);
	}

	/**
	 * Chargeable supply unit price (Transaction currency) 取引通貨有償支給単価.<p>
	 *
	 */
	public void trd_cur_onr_prov_upri(int value) {
		poif().trd_cur_onr_prov_upri(value);
	}

	/**
	 * Chargeable supply unit price (Transaction currency) 取引通貨有償支給単価.<p>
	 *
	 */
	public void trd_cur_onr_prov_upri(long value) {
		poif().trd_cur_onr_prov_upri(value);
	}

	/**
	 * Chargeable supply unit price (Transaction currency) 取引通貨有償支給単価.<p>
	 *
	 */
	public void trd_cur_onr_prov_upri(float value) {
		poif().trd_cur_onr_prov_upri(value);
	}

	/**
	 * Chargeable supply unit price (Transaction currency) 取引通貨有償支給単価.<p>
	 *
	 */
	public void trd_cur_onr_prov_upri(double value) {
		poif().trd_cur_onr_prov_upri(value);
	}

	/**
	 * Withholding tax rate 源泉税率.<p>
	 *
	 */
	public MCNumber wtax_rate() {
		return poif().wtax_rate();
	}

	/**
	 * Withholding tax rate 源泉税率.<p>
	 *
	 */
	public void wtax_rate(MCNumber value) {
		poif().wtax_rate(value);
	}

	/**
	 * Withholding tax rate 源泉税率.<p>
	 *
	 */
	public void wtax_rate(int value) {
		poif().wtax_rate(value);
	}

	/**
	 * Withholding tax rate 源泉税率.<p>
	 *
	 */
	public void wtax_rate(long value) {
		poif().wtax_rate(value);
	}

	/**
	 * Withholding tax rate 源泉税率.<p>
	 *
	 */
	public void wtax_rate(float value) {
		poif().wtax_rate(value);
	}

	/**
	 * Withholding tax rate 源泉税率.<p>
	 *
	 */
	public void wtax_rate(double value) {
		poif().wtax_rate(value);
	}

	/**
	 * Purchase reason cd. 仕入理由ＣＤ.<p>
	 *
	 */
	public String purc_rsn_cd() {
		return poif().purc_rsn_cd();
	}

	/**
	 * Purchase reason cd. 仕入理由ＣＤ.<p>
	 *
	 */
	public void purc_rsn_cd(String value) {
		poif().purc_rsn_cd(value);
	}

	/**
	 * Print price flg. 価格印字ＦＬＧ.<p>
	 *
	 */
	public boolean pri_print_flg() {
		return poif().pri_print_flg();
	}

	/**
	 * Print price flg. 価格印字ＦＬＧ.<p>
	 *
	 */
	public void pri_print_flg(boolean value) {
		poif().pri_print_flg(value);
	}

	/**
	 * Confirmation received flg. 請書受領ＦＬＧ.<p>
	 *
	 */
	public boolean po_conf_rcpt_flg() {
		return poif().po_conf_rcpt_flg();
	}

	/**
	 * Confirmation received flg. 請書受領ＦＬＧ.<p>
	 *
	 */
	public void po_conf_rcpt_flg(boolean value) {
		poif().po_conf_rcpt_flg(value);
	}

	/**
	 * Confirmation received date 請書受領日.<p>
	 *
	 */
	public MCDate po_conf_rcpt_dt() {
		return poif().po_conf_rcpt_dt();
	}

	/**
	 * Confirmation received date 請書受領日.<p>
	 *
	 */
	public void po_conf_rcpt_dt(MCDate value) {
		poif().po_conf_rcpt_dt(value);
	}

	/**
	 * Payment carry-over count 支払繰越回数.<p>
	 *
	 */
	public MCNumber pay_crryovr_times() {
		return poif().pay_crryovr_times();
	}

	/**
	 * Payment carry-over count 支払繰越回数.<p>
	 *
	 */
	public void pay_crryovr_times(MCNumber value) {
		poif().pay_crryovr_times(value);
	}

	/**
	 * Payment carry-over count 支払繰越回数.<p>
	 *
	 */
	public void pay_crryovr_times(int value) {
		poif().pay_crryovr_times(value);
	}

	/**
	 * Payment carry-over count 支払繰越回数.<p>
	 *
	 */
	public void pay_crryovr_times(long value) {
		poif().pay_crryovr_times(value);
	}

	/**
	 * Payment carry-over count 支払繰越回数.<p>
	 *
	 */
	public void pay_crryovr_times(float value) {
		poif().pay_crryovr_times(value);
	}

	/**
	 * Payment carry-over count 支払繰越回数.<p>
	 *
	 */
	public void pay_crryovr_times(double value) {
		poif().pay_crryovr_times(value);
	}

	/**
	 * AP dept. cd. 債務部門ＣＤ.<p>
	 *
	 */
	public String ap_dpt_cd() {
		return poif().ap_dpt_cd();
	}

	/**
	 * AP dept. cd. 債務部門ＣＤ.<p>
	 *
	 */
	public void ap_dpt_cd(String value) {
		poif().ap_dpt_cd(value);
	}

	/**
	 * Charged dept. cd. 負担部門ＣＤ.<p>
	 *
	 */
	public String bd_dpt_cd() {
		return poif().bd_dpt_cd();
	}

	/**
	 * Charged dept. cd. 負担部門ＣＤ.<p>
	 *
	 */
	public void bd_dpt_cd(String value) {
		poif().bd_dpt_cd(value);
	}

	/**
	 * Charged item cd. 負担品目ＣＤ.<p>
	 *
	 */
	public String bd_itm_cd() {
		return poif().bd_itm_cd();
	}

	/**
	 * Charged item cd. 負担品目ＣＤ.<p>
	 *
	 */
	public void bd_itm_cd(String value) {
		poif().bd_itm_cd(value);
	}

	/**
	 * Charged branch No. 1 負担枝番１.<p>
	 *
	 */
	public String bd_itm_sub1() {
		return poif().bd_itm_sub1();
	}

	/**
	 * Charged branch No. 1 負担枝番１.<p>
	 *
	 */
	public void bd_itm_sub1(String value) {
		poif().bd_itm_sub1(value);
	}

	/**
	 * Charged branch No. 2 負担枝番２.<p>
	 *
	 */
	public String bd_itm_sub2() {
		return poif().bd_itm_sub2();
	}

	/**
	 * Charged branch No. 2 負担枝番２.<p>
	 *
	 */
	public void bd_itm_sub2(String value) {
		poif().bd_itm_sub2(value);
	}

	/**
	 * Charged branch No. 3 負担枝番３.<p>
	 *
	 */
	public String bd_itm_sub3() {
		return poif().bd_itm_sub3();
	}

	/**
	 * Charged branch No. 3 負担枝番３.<p>
	 *
	 */
	public void bd_itm_sub3(String value) {
		poif().bd_itm_sub3(value);
	}

	/**
	 * Charged SEIBAN No. 1 負担手配ＮＯ１.<p>
	 *
	 */
	public String bd_sno1() {
		return poif().bd_sno1();
	}

	/**
	 * Charged SEIBAN No. 1 負担手配ＮＯ１.<p>
	 *
	 */
	public void bd_sno1(String value) {
		poif().bd_sno1(value);
	}

	/**
	 * Charged SEIBAN No. 2 負担手配ＮＯ２.<p>
	 *
	 */
	public String bd_sno2() {
		return poif().bd_sno2();
	}

	/**
	 * Charged SEIBAN No. 2 負担手配ＮＯ２.<p>
	 *
	 */
	public void bd_sno2(String value) {
		poif().bd_sno2(value);
	}

	/**
	 * Charged SEIBAN No. 3 負担手配ＮＯ３.<p>
	 *
	 */
	public String bd_sno3() {
		return poif().bd_sno3();
	}

	/**
	 * Charged SEIBAN No. 3 負担手配ＮＯ３.<p>
	 *
	 */
	public void bd_sno3(String value) {
		poif().bd_sno3(value);
	}

	/**
	 * Charged SEIBAN No. 4 負担手配ＮＯ４.<p>
	 *
	 */
	public String bd_sno4() {
		return poif().bd_sno4();
	}

	/**
	 * Charged SEIBAN No. 4 負担手配ＮＯ４.<p>
	 *
	 */
	public void bd_sno4(String value) {
		poif().bd_sno4(value);
	}

	/**
	 * Charged location cd. 負担場所ＣＤ.<p>
	 *
	 */
	public String bd_loc_cd() {
		return poif().bd_loc_cd();
	}

	/**
	 * Charged location cd. 負担場所ＣＤ.<p>
	 *
	 */
	public void bd_loc_cd(String value) {
		poif().bd_loc_cd(value);
	}

	/**
	 * Charged lot No. 負担ロットＮＯ.<p>
	 *
	 */
	public String bd_lot_no() {
		return poif().bd_lot_no();
	}

	/**
	 * Charged lot No. 負担ロットＮＯ.<p>
	 *
	 */
	public void bd_lot_no(String value) {
		poif().bd_lot_no(value);
	}

	/**
	 * Charged sublot No. 負担サブロットＮＯ.<p>
	 *
	 */
	public String bd_sublot_no() {
		return poif().bd_sublot_no();
	}

	/**
	 * Charged sublot No. 負担サブロットＮＯ.<p>
	 *
	 */
	public void bd_sublot_no(String value) {
		poif().bd_sublot_no(value);
	}

	/**
	 * Charged item category cd. 負担品群ＣＤ.<p>
	 *
	 */
	public String bd_ctg_cd() {
		return poif().bd_ctg_cd();
	}

	/**
	 * Charged item category cd. 負担品群ＣＤ.<p>
	 *
	 */
	public void bd_ctg_cd(String value) {
		poif().bd_ctg_cd(value);
	}

	/**
	 * Charged operation cd. 負担工程ＣＤ.<p>
	 *
	 */
	public String bd_oper_cd() {
		return poif().bd_oper_cd();
	}

	/**
	 * Charged operation cd. 負担工程ＣＤ.<p>
	 *
	 */
	public void bd_oper_cd(String value) {
		poif().bd_oper_cd(value);
	}

	/**
	 * Charged sales No. 負担受注ＮＯ.<p>
	 *
	 */
	public String bd_slo_no() {
		return poif().bd_slo_no();
	}

	/**
	 * Charged sales No. 負担受注ＮＯ.<p>
	 *
	 */
	public void bd_slo_no(String value) {
		poif().bd_slo_no(value);
	}

	/**
	 * Charged invoice No. 負担インボイスＮＯ.<p>
	 *
	 */
	public String bd_iv_no() {
		return poif().bd_iv_no();
	}

	/**
	 * Charged invoice No. 負担インボイスＮＯ.<p>
	 *
	 */
	public void bd_iv_no(String value) {
		poif().bd_iv_no(value);
	}

	/**
	 * Charged PO No. 負担発注ＮＯ.<p>
	 *
	 */
	public String bd_po_no() {
		return poif().bd_po_no();
	}

	/**
	 * Charged PO No. 負担発注ＮＯ.<p>
	 *
	 */
	public void bd_po_no(String value) {
		poif().bd_po_no(value);
	}

	/**
	 * Internal details remarks 内部明細備考.<p>
	 *
	 */
	public String intr_d_rmrks() {
		return poif().intr_d_rmrks();
	}

	/**
	 * Internal details remarks 内部明細備考.<p>
	 *
	 */
	public void intr_d_rmrks(String value) {
		poif().intr_d_rmrks(value);
	}

	/**
	 * Transaction details remarks 取引明細備考.<p>
	 *
	 */
	public String trd_d_rmrks() {
		return poif().trd_d_rmrks();
	}

	/**
	 * Transaction details remarks 取引明細備考.<p>
	 *
	 */
	public void trd_d_rmrks(String value) {
		poif().trd_d_rmrks(value);
	}

	/**
	 * PO sheet details remarks 注文書明細備考.<p>
	 *
	 */
	public String po_print_d_rmrks() {
		return poif().po_print_d_rmrks();
	}

	/**
	 * PO sheet details remarks 注文書明細備考.<p>
	 *
	 */
	public void po_print_d_rmrks(String value) {
		poif().po_print_d_rmrks(value);
	}

	/**
	 * Receipt contact remarks 入荷連絡備考.<p>
	 *
	 */
	public String arr_cnt_rmrks() {
		return poif().arr_cnt_rmrks();
	}

	/**
	 * Receipt contact remarks 入荷連絡備考.<p>
	 *
	 */
	public void arr_cnt_rmrks(String value) {
		poif().arr_cnt_rmrks(value);
	}

	/**
	 * Delivery note details remarks 納品書明細備考.<p>
	 *
	 */
	public String dlv_slip_d_rmrks() {
		return poif().dlv_slip_d_rmrks();
	}

	/**
	 * Delivery note details remarks 納品書明細備考.<p>
	 *
	 */
	public void dlv_slip_d_rmrks(String value) {
		poif().dlv_slip_d_rmrks(value);
	}

	/**
	 * EDI spare character string 1 ＥＤＩ予備文字列１.<p>
	 *
	 */
	public String edi_sub_char1() {
		return poif().edi_sub_char1();
	}

	/**
	 * EDI spare character string 1 ＥＤＩ予備文字列１.<p>
	 *
	 */
	public void edi_sub_char1(String value) {
		poif().edi_sub_char1(value);
	}

	/**
	 * EDI spare character string 2 ＥＤＩ予備文字列２.<p>
	 *
	 */
	public String edi_sub_char2() {
		return poif().edi_sub_char2();
	}

	/**
	 * EDI spare character string 2 ＥＤＩ予備文字列２.<p>
	 *
	 */
	public void edi_sub_char2(String value) {
		poif().edi_sub_char2(value);
	}

	/**
	 * EDI spare character string 3 ＥＤＩ予備文字列３.<p>
	 *
	 */
	public String edi_sub_char3() {
		return poif().edi_sub_char3();
	}

	/**
	 * EDI spare character string 3 ＥＤＩ予備文字列３.<p>
	 *
	 */
	public void edi_sub_char3(String value) {
		poif().edi_sub_char3(value);
	}

	/**
	 * EDI spare character string 4 ＥＤＩ予備文字列４.<p>
	 *
	 */
	public String edi_sub_char4() {
		return poif().edi_sub_char4();
	}

	/**
	 * EDI spare character string 4 ＥＤＩ予備文字列４.<p>
	 *
	 */
	public void edi_sub_char4(String value) {
		poif().edi_sub_char4(value);
	}

	/**
	 * EDI spare character string 5 ＥＤＩ予備文字列５.<p>
	 *
	 */
	public String edi_sub_char5() {
		return poif().edi_sub_char5();
	}

	/**
	 * EDI spare character string 5 ＥＤＩ予備文字列５.<p>
	 *
	 */
	public void edi_sub_char5(String value) {
		poif().edi_sub_char5(value);
	}

	/**
	 * EDI spare numerical value ＥＤＩ予備数値.<p>
	 *
	 */
	public MCNumber edi_sub_num1() {
		return poif().edi_sub_num1();
	}

	/**
	 * EDI spare numerical value ＥＤＩ予備数値.<p>
	 *
	 */
	public void edi_sub_num1(MCNumber value) {
		poif().edi_sub_num1(value);
	}

	/**
	 * EDI spare numerical value ＥＤＩ予備数値.<p>
	 *
	 */
	public void edi_sub_num1(int value) {
		poif().edi_sub_num1(value);
	}

	/**
	 * EDI spare numerical value ＥＤＩ予備数値.<p>
	 *
	 */
	public void edi_sub_num1(long value) {
		poif().edi_sub_num1(value);
	}

	/**
	 * EDI spare numerical value ＥＤＩ予備数値.<p>
	 *
	 */
	public void edi_sub_num1(float value) {
		poif().edi_sub_num1(value);
	}

	/**
	 * EDI spare numerical value ＥＤＩ予備数値.<p>
	 *
	 */
	public void edi_sub_num1(double value) {
		poif().edi_sub_num1(value);
	}

	/**
	 * EDI spare date ＥＤＩ予備日付.<p>
	 *
	 */
	public MCDate edi_sub_dt1() {
		return poif().edi_sub_dt1();
	}

	/**
	 * EDI spare date ＥＤＩ予備日付.<p>
	 *
	 */
	public void edi_sub_dt1(MCDate value) {
		poif().edi_sub_dt1(value);
	}

	/**
	 * EDI details spare character string 1 ＥＤＩ明細予備文字列１.<p>
	 *
	 */
	public String edi_sub_d_char1() {
		return poif().edi_sub_d_char1();
	}

	/**
	 * EDI details spare character string 1 ＥＤＩ明細予備文字列１.<p>
	 *
	 */
	public void edi_sub_d_char1(String value) {
		poif().edi_sub_d_char1(value);
	}

	/**
	 * EDI details spare character string 2 ＥＤＩ明細予備文字列２.<p>
	 *
	 */
	public String edi_sub_d_char2() {
		return poif().edi_sub_d_char2();
	}

	/**
	 * EDI details spare character string 2 ＥＤＩ明細予備文字列２.<p>
	 *
	 */
	public void edi_sub_d_char2(String value) {
		poif().edi_sub_d_char2(value);
	}

	/**
	 * EDI details spare character string 3 ＥＤＩ明細予備文字列３.<p>
	 *
	 */
	public String edi_sub_d_char3() {
		return poif().edi_sub_d_char3();
	}

	/**
	 * EDI details spare character string 3 ＥＤＩ明細予備文字列３.<p>
	 *
	 */
	public void edi_sub_d_char3(String value) {
		poif().edi_sub_d_char3(value);
	}

	/**
	 * EDI details spare character string 4 ＥＤＩ明細予備文字列４.<p>
	 *
	 */
	public String edi_sub_d_char4() {
		return poif().edi_sub_d_char4();
	}

	/**
	 * EDI details spare character string 4 ＥＤＩ明細予備文字列４.<p>
	 *
	 */
	public void edi_sub_d_char4(String value) {
		poif().edi_sub_d_char4(value);
	}

	/**
	 * EDI details spare character string 5 ＥＤＩ明細予備文字列５.<p>
	 *
	 */
	public String edi_sub_d_char5() {
		return poif().edi_sub_d_char5();
	}

	/**
	 * EDI details spare character string 5 ＥＤＩ明細予備文字列５.<p>
	 *
	 */
	public void edi_sub_d_char5(String value) {
		poif().edi_sub_d_char5(value);
	}

	/**
	 * EDI details spare numerical value ＥＤＩ明細予備数値.<p>
	 *
	 */
	public MCNumber edi_sub_d_num1() {
		return poif().edi_sub_d_num1();
	}

	/**
	 * EDI details spare numerical value ＥＤＩ明細予備数値.<p>
	 *
	 */
	public void edi_sub_d_num1(MCNumber value) {
		poif().edi_sub_d_num1(value);
	}

	/**
	 * EDI details spare numerical value ＥＤＩ明細予備数値.<p>
	 *
	 */
	public void edi_sub_d_num1(int value) {
		poif().edi_sub_d_num1(value);
	}

	/**
	 * EDI details spare numerical value ＥＤＩ明細予備数値.<p>
	 *
	 */
	public void edi_sub_d_num1(long value) {
		poif().edi_sub_d_num1(value);
	}

	/**
	 * EDI details spare numerical value ＥＤＩ明細予備数値.<p>
	 *
	 */
	public void edi_sub_d_num1(float value) {
		poif().edi_sub_d_num1(value);
	}

	/**
	 * EDI details spare numerical value ＥＤＩ明細予備数値.<p>
	 *
	 */
	public void edi_sub_d_num1(double value) {
		poif().edi_sub_d_num1(value);
	}

	/**
	 * EDI details spare date ＥＤＩ明細予備日付.<p>
	 *
	 */
	public MCDate edi_sub_d_dt1() {
		return poif().edi_sub_d_dt1();
	}

	/**
	 * EDI details spare date ＥＤＩ明細予備日付.<p>
	 *
	 */
	public void edi_sub_d_dt1(MCDate value) {
		poif().edi_sub_d_dt1(value);
	}

}

