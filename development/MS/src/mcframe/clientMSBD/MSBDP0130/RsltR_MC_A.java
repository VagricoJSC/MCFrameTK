package mcframe.clientMSBD.MSBDP0130;

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
 * ブロック"Rslt"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class RsltR_MC_A extends MCConstRow {

	/**
	 * Select 選択.<p>
	 *
	 */
	public static final String $check = "check";
	public static final String $hdr_readonly_flg = "hdr_readonly_flg";
	/**
	 * Header read-only ヘッダ読取専用.<p>
	 *
	 */
	public static final String $bef_abort_flg = "bef_abort_flg";
	/**
	 * Cancel remaining 打切.<p>
	 *
	 */
	public static final String $abort_flg = "abort_flg";
	/**
	 * Transaction cd. 取引ＣＤ.<p>
	 *
	 */
	public static final String $trd_cd = "trd_cd";
	/**
	 * Transaction name 取引名.<p>
	 *
	 */
	public static final String $trd_nm = "trd_nm";
	/**
	 * Transaction pattern type 取引パタン区分.<p>
	 *
	 */
	public static final String $trd_ptn_typ = "trd_ptn_typ";
	/**
	 * Receipt pattern 入荷パタン.<p>
	 *
	 */
	public static final String $arr_ptn_typ = "arr_ptn_typ";
	/**
	 * Receipt pattern name 入荷パタン名.<p>
	 *
	 */
	public static final String $arr_ptn_typ_nm = "arr_ptn_typ_nm";
	/**
	 * Simultaneous recording 同時計上.<p>
	 *
	 */
	public static final String $sync_flg = "sync_flg";
	/**
	 * Purchase recording type 仕入計上区分.<p>
	 *
	 */
	public static final String $purc_basis_typ = "purc_basis_typ";
	/**
	 * Purchase recording type name 仕入計上区分名.<p>
	 *
	 */
	public static final String $purc_basis_typ_nm = "purc_basis_typ_nm";
	public static final String $purc_ddlv_flg = "purc_ddlv_flg";
	public static final String $arr_skip_flg = "arr_skip_flg";
	/**
	 * Purchase date 仕入日.<p>
	 *
	 */
	public static final String $purc_dt = "purc_dt";
	/**
	 * Recording month 計上年月.<p>
	 *
	 */
	public static final String $ac_ym = "ac_ym";
	public static final String $ac_dt_p = "ac_dt_p";
	public static final String $can_ac_dt_p = "can_ac_dt_p";
	/**
	 * Payment base date 支払起算日.<p>
	 *
	 */
	public static final String $pay_basis_dt = "pay_basis_dt";
	/**
	 * Scheduled payment date 支払予定日.<p>
	 *
	 */
	public static final String $pay_schd_dt = "pay_schd_dt";
	/**
	 * Scheduled purchase date 仕入予定日.<p>
	 *
	 */
	public static final String $purc_schd_dt = "purc_schd_dt";
	/**
	 * Scheduled delivery date 納入予定日.<p>
	 *
	 */
	public static final String $dlv_rqst_dt = "dlv_rqst_dt";
	/**
	 * Scheduled receipt date 入荷予定日.<p>
	 *
	 */
	public static final String $arr_schd_dt = "arr_schd_dt";
	/**
	 * Normal management (Concurrent purchase) schedule 通常管理（仕入同時）予定.<p>
	 *
	 */
	public static final String $schd_sync_flg = "schd_sync_flg";
	/**
	 * Approval No. 承認ＮＯ.<p>
	 *
	 */
	public static final String $aprv_no = "aprv_no";
	/**
	 * Approval status type 承認状況区分.<p>
	 *
	 */
	public static final String $aprv_sts_typ = "aprv_sts_typ";
	/**
	 * Approval status type name 承認状況区分名.<p>
	 *
	 */
	public static final String $aprv_sts_typ_nm = "aprv_sts_typ_nm";
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
	 * PO schedule creating source type 発注予定作成元区分.<p>
	 *
	 */
	public static final String $po_schd_src_typ = "po_schd_src_typ";
	/**
	 * PO schedule creating source type name 発注予定作成元区分名.<p>
	 *
	 */
	public static final String $po_schd_src_typ_nm = "po_schd_src_typ_nm";
	/**
	 * PO schedule creating source No. 発注予定作成元ＮＯ.<p>
	 *
	 */
	public static final String $po_schd_src_no = "po_schd_src_no";
	/**
	 * Purchase I/V No. 受領Ｉ／ＶＮＯ.<p>
	 *
	 */
	public static final String $rcpt_iv_no = "rcpt_iv_no";
	/**
	 * Purchase I/V management No. 受領Ｉ／Ｖ管理ＮＯ.<p>
	 *
	 */
	public static final String $rcpt_iv_mng_no = "rcpt_iv_mng_no";
	/**
	 * Purchase I/V details No. 受領Ｉ／Ｖ明細ＮＯ.<p>
	 *
	 */
	public static final String $rcpt_iv_d_no = "rcpt_iv_d_no";
	/**
	 * Mfg. order No. 製造指図ＮＯ.<p>
	 *
	 */
	public static final String $mfg_inst_no = "mfg_inst_no";
	/**
	 * Mfg. location cd. 製造場所ＣＤ.<p>
	 *
	 */
	public static final String $mfg_loc_cd = "mfg_loc_cd";
	/**
	 * BOM pattern 構成パタン.<p>
	 *
	 */
	public static final String $bom_ptn = "bom_ptn";
	/**
	 * Purchase schedule No. 仕入予定ＮＯ.<p>
	 *
	 */
	public static final String $purc_schd_no = "purc_schd_no";
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
	 * Purchase result sequence number 仕入実績連番.<p>
	 *
	 */
	public static final String $purc_act_seq = "purc_act_seq";
	/**
	 * Purchase result details sequence number 仕入実績明細連番.<p>
	 *
	 */
	public static final String $purc_act_d_seq = "purc_act_d_seq";
	/**
	 * Receipt schedule No. 入荷予定ＮＯ.<p>
	 *
	 */
	public static final String $arr_schd_no = "arr_schd_no";
	/**
	 * Receipt progress No. 入荷進捗ＮＯ.<p>
	 *
	 */
	public static final String $arr_pr_no = "arr_pr_no";
	/**
	 * Receipt result No. 入荷実績ＮＯ.<p>
	 *
	 */
	public static final String $arr_act_no = "arr_act_no";
	/**
	 * Grading before purchase recording cd. 仕入計上前格付ＣＤ.<p>
	 *
	 */
	public static final String $from_gd_cd = "from_gd_cd";
	/**
	 * Rating cd. for saving 退避用格付ＣＤ.<p>
	 *
	 */
	public static final String $tmp_gd_cd = "tmp_gd_cd";
	/**
	 * Conforming type for saving 退避用良品区分.<p>
	 *
	 */
	public static final String $tmp_quality_typ = "tmp_quality_typ";
	/**
	 * Inventory inspection type for saving 退避用在庫検査区分.<p>
	 *
	 */
	public static final String $tmp_stk_insp_typ = "tmp_stk_insp_typ";
	/**
	 * Inventory inspection type for saving 退避用在庫識別区分.<p>
	 *
	 */
	public static final String $tmp_stk_id_typ = "tmp_stk_id_typ";
	/**
	 * Purchase GI location WG cd. 仕入出庫場所ＷＧ ＣＤ.<p>
	 *
	 */
	public static final String $gi_wg_cd = "gi_wg_cd";
	/**
	 * Purchase GI location cd. 仕入出庫場所ＣＤ.<p>
	 *
	 */
	public static final String $gi_loc_cd = "gi_loc_cd";
	/**
	 * Purchase GI rack/line cd. 仕入出庫棚・ラインＣＤ.<p>
	 *
	 */
	public static final String $gi_str_ln_cd = "gi_str_ln_cd";
	/**
	 * Purchase GI SKU cd. 仕入出庫荷姿単位ＣＤ.<p>
	 *
	 */
	public static final String $gi_unit_cd = "gi_unit_cd";
	/**
	 * Multiple details 複数詳細.<p>
	 *
	 */
	public static final String $multi_io_flg = "multi_io_flg";
	/**
	 * Parent purchase result details No. 親仕入実績明細ＮＯ.<p>
	 *
	 */
	public static final String $par_purc_act_d_no = "par_purc_act_d_no";
	/**
	 * Receipt split recording 入荷分割計上.<p>
	 *
	 */
	public static final String $arr_split_flg = "arr_split_flg";
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
	 * Item type 品目区分.<p>
	 *
	 */
	public static final String $itm_typ = "itm_typ";
	/**
	 * Item type name 品目区分名.<p>
	 *
	 */
	public static final String $itm_typ_nm = "itm_typ_nm";
	/**
	 * Item type details cd. 品目区分詳細ＣＤ.<p>
	 *
	 */
	public static final String $itm_typ_d_cd = "itm_typ_d_cd";
	/**
	 * Item type details name 品目区分詳細名.<p>
	 *
	 */
	public static final String $itm_typ_d_nm = "itm_typ_d_nm";
	public static final String $itm_p = "itm_p";
	/**
	 * Item name for I/V Ｉ／Ｖ表記品名.<p>
	 *
	 */
	public static final String $iv_itm_nm = "iv_itm_nm";
	/**
	 * For version control 版管理対象.<p>
	 *
	 */
	public static final String $ver_flg = "ver_flg";
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
	 * Lot No. numbering type ロットＮＯ発番区分.<p>
	 *
	 */
	public static final String $lot_no_typ = "lot_no_typ";
	/**
	 * Sublot No. numbering type サブロットＮＯ発番区分.<p>
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
	 * Miscellaneous item 諸口品.<p>
	 *
	 */
	public static final String $sundry_itm_flg = "sundry_itm_flg";
	/**
	 * Vendor lot required 業者ロット必須.<p>
	 *
	 */
	public static final String $bp_lot_flg = "bp_lot_flg";
	/**
	 * Discount item 値引品.<p>
	 *
	 */
	public static final String $dscnt_itm_flg = "dscnt_itm_flg";
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
	public static final String $itm_grp_p = "itm_grp_p";
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
	 * Payment per transaction 都度支払.<p>
	 *
	 */
	public static final String $pay_spot_flg = "pay_spot_flg";
	/**
	 * AP credit managed BP cd. 債務与信管理先ＣＤ.<p>
	 *
	 */
	public static final String $ap_cred_cd = "ap_cred_cd";
	/**
	 * Purchase lot details split type 仕入ロット明細分割区分.<p>
	 *
	 */
	public static final String $purc_slip_each_lot_typ = "purc_slip_each_lot_typ";
	/**
	 * Allow purchasing unit price change 購買単価変更許可.<p>
	 *
	 */
	public static final String $purc_upri_cng_flg = "purc_upri_cng_flg";
	/**
	 * For I/V transaction Ｉ／Ｖ取引対象.<p>
	 *
	 */
	public static final String $sppl_iv_flg = "sppl_iv_flg";
	/**
	 * Report output locale cd. 帳票出力ロケールＣＤ.<p>
	 *
	 */
	public static final String $prnt_lcl_cd = "prnt_lcl_cd";
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
	 * Purchase tax calculation type 仕入税計算区分.<p>
	 *
	 */
	public static final String $purc_tax_calc_typ = "purc_tax_calc_typ";
	public static final String $sppl_addr_p = "sppl_addr_p";
	/**
	 * For subcontract 下請対象.<p>
	 *
	 */
	public static final String $subcon_flg = "subcon_flg";
	public static final String $sppl_grp_p = "sppl_grp_p";
	/**
	 * AP supplier cd. 買掛先ＣＤ.<p>
	 *
	 */
	public static final String $asppl_cd = "asppl_cd";
	/**
	 * AP supplier name 買掛先名.<p>
	 *
	 */
	public static final String $asppl_nm = "asppl_nm";
	/**
	 * Subcontracting 外注.<p>
	 *
	 */
	public static final String $outsrc_flg = "outsrc_flg";
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
	 * Defective acceptance 検収不良.<p>
	 *
	 */
	public static final String $accpt_dfct_flg = "accpt_dfct_flg";
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
	public static final String $peg_no = "peg_no";
	/**
	 * Transaction unit cd. at PO 発注時取引単位ＣＤ.<p>
	 *
	 */
	public static final String $src_trd_unit_cd = "src_trd_unit_cd";
	/**
	 * Transaction unit conversion qty. at PO 発注時取引単位換算数量.<p>
	 *
	 */
	public static final String $src_trd_unit_conv_qty = "src_trd_unit_conv_qty";
	/**
	 * Transaction unit conversion base qty. at PO 発注時取引単位換算基準数量.<p>
	 *
	 */
	public static final String $src_trd_unit_conv_base_qty = "src_trd_unit_conv_base_qty";
	/**
	 * Transaction unit number of decimal places at PO 発注時取引単位小数部有効桁数.<p>
	 *
	 */
	public static final String $src_trd_unit_dec_place = "src_trd_unit_dec_place";
	/**
	 * Transaction unit rounding type at PO 発注時取引単位端数処理区分.<p>
	 *
	 */
	public static final String $src_trd_unit_rnd_typ = "src_trd_unit_rnd_typ";
	/**
	 * Transaction unit qty. at PO 発注時取引単位数量.<p>
	 *
	 */
	public static final String $src_trd_unit_qty = "src_trd_unit_qty";
	/**
	 * Amount at PO (Transaction currency) 発注時取引通貨金額.<p>
	 *
	 */
	public static final String $src_trd_cur_amt = "src_trd_cur_amt";
	/**
	 * Discount amount at PO (Transaction currency) 発注時取引通貨値引額.<p>
	 *
	 */
	public static final String $src_trd_cur_dscnt_amt = "src_trd_cur_dscnt_amt";
	/**
	 * Chargeable supply amount at PO (Transaction currency) 発注時取引通貨有償支給金額.<p>
	 *
	 */
	public static final String $src_trd_cur_onr_prov_amt = "src_trd_cur_onr_prov_amt";
	/**
	 * Chargeable supply unit price at PO (Transaction currency) 発注時取引通貨有償支給単価.<p>
	 *
	 */
	public static final String $src_trd_cur_onr_prov_upri = "src_trd_cur_onr_prov_upri";
	/**
	 * Subcontracting amount price at PO (Transaction currency) 発注時取引通貨加工金額.<p>
	 *
	 */
	public static final String $src_trd_cur_proc_amt = "src_trd_cur_proc_amt";
	/**
	 * Subcontracting unit price at PO (Transaction currency) 発注時取引通貨加工単価.<p>
	 *
	 */
	public static final String $src_trd_cur_proc_upri = "src_trd_cur_proc_upri";
	/**
	 * Amount at PO (Transaction currency) 発注時取引通貨金額.<p>
	 *
	 */
	public static final String $src_trd_cur_tax_amt = "src_trd_cur_tax_amt";
	/**
	 * Unit price at PO (Transaction currency) 発注時取引通貨単価.<p>
	 *
	 */
	public static final String $src_trd_cur_upri = "src_trd_cur_upri";
	/**
	 * Withholding tax rate at PO 発注時源泉税率.<p>
	 *
	 */
	public static final String $src_wtax_rate = "src_wtax_rate";
	/**
	 * Tax rate at PO 発注時税率.<p>
	 *
	 */
	public static final String $src_tax_rate = "src_tax_rate";
	/**
	 * Tax inclusive flg. at PO 発注時内税ＦＬＧ.<p>
	 *
	 */
	public static final String $src_inc_tax_flg = "src_inc_tax_flg";
	public static final String $base_unit_qty_p = "base_unit_qty_p";
	public static final String $base_unit_qty_bef_p = "base_unit_qty_bef_p";
	public static final String $po_qty_p = "po_qty_p";
	public static final String $arr_qty_p = "arr_qty_p";
	public static final String $purc_schd_qty_p = "purc_schd_qty_p";
	public static final String $purc_qty_p = "purc_qty_p";
	public static final String $accpt_dfct_qty_p = "accpt_dfct_qty_p";
	public static final String $abort_qty_p = "abort_qty_p";
	/**
	 * Purchase progress rate 仕入進捗率.<p>
	 *
	 */
	public static final String $purc_prgrs = "purc_prgrs";
	/**
	 * Re-receipt 再入荷.<p>
	 *
	 */
	public static final String $re_arr_flg = "re_arr_flg";
	/**
	 * Re-receipt location WG 再入荷場所ＷＧ.<p>
	 *
	 */
	public static final String $re_arr_loc_wg_cd = "re_arr_loc_wg_cd";
	/**
	 * Re-receipt location WG name 再入荷場所ＷＧ名.<p>
	 *
	 */
	public static final String $re_arr_loc_wg_nm = "re_arr_loc_wg_nm";
	/**
	 * Re-receipt location cd. 再入荷場所ＣＤ.<p>
	 *
	 */
	public static final String $re_arr_loc_cd = "re_arr_loc_cd";
	/**
	 * Re-receipt location name 再入荷場所名.<p>
	 *
	 */
	public static final String $re_arr_loc_nm = "re_arr_loc_nm";
	/**
	 * For re-receipt rack/line 再入荷棚・ライン対象.<p>
	 *
	 */
	public static final String $re_arr_str_ln_tgt_flg = "re_arr_str_ln_tgt_flg";
	public static final String $re_arr_str_ln_p = "re_arr_str_ln_p";
	/**
	 * Re-receipt factory/distribution warehouse cd. 再入荷場所工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public static final String $re_arr_loc_site_cd = "re_arr_loc_site_cd";
	/**
	 * Re-receipt location calendar cd. 再入荷場所カレンダＣＤ.<p>
	 *
	 */
	public static final String $re_arr_loc_cal_cd = "re_arr_loc_cal_cd";
	/**
	 * Re-receipt location Subcontractor cd. 再入荷場所外注発注先ＣＤ.<p>
	 *
	 */
	public static final String $re_arr_loc_sppl_cd = "re_arr_loc_sppl_cd";
	/**
	 * Re-receipt location Subcontractor calendar cd. 再入荷場所外注発注先カレンダＣＤ.<p>
	 *
	 */
	public static final String $re_arr_loc_sppl_cal_cd = "re_arr_loc_sppl_cal_cd";
	public static final String $re_arr_qty_p = "re_arr_qty_p";
	public static final String $re_arr_rqst_tm_p = "re_arr_rqst_tm_p";
	/**
	 * Scheduled re-receipt purchase date 再入荷仕入予定日.<p>
	 *
	 */
	public static final String $re_arr_purc_schd_dt = "re_arr_purc_schd_dt";
	/**
	 * Re-receipt simultaneously recording 再入荷同時計上.<p>
	 *
	 */
	public static final String $re_arr_sync_flg = "re_arr_sync_flg";
	/**
	 * Free of charge 無償.<p>
	 *
	 */
	public static final String $ncv_flg = "ncv_flg";
	/**
	 * Conforming type 良品区分.<p>
	 *
	 */
	public static final String $quality_typ = "quality_typ";
	/**
	 * Conforming type name 良品区分名.<p>
	 *
	 */
	public static final String $quality_typ_nm = "quality_typ_nm";
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
	public static final String $sno_p = "sno_p";
	/**
	 * Factory/Distribution warehouse cd. 工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public static final String $site_cd = "site_cd";
	/**
	 * Factory/Distribution warehouse name 工場・物流倉庫名.<p>
	 *
	 */
	public static final String $site_nm = "site_nm";
	/**
	 * Delivery location WG cd. 納入場所ＷＧＣＤ.<p>
	 *
	 */
	public static final String $in_to_loc_wg_cd = "in_to_loc_wg_cd";
	/**
	 * Delivery location WG name 納入場所ＷＧ名.<p>
	 *
	 */
	public static final String $in_to_loc_wg_nm = "in_to_loc_wg_nm";
	/**
	 * Delivery location cd. 納入場所ＣＤ.<p>
	 *
	 */
	public static final String $in_to_loc_cd = "in_to_loc_cd";
	/**
	 * Delivery location name 納入場所名.<p>
	 *
	 */
	public static final String $in_to_loc_nm = "in_to_loc_nm";
	/**
	 * Subcontractor 外注先.<p>
	 *
	 */
	public static final String $outsrc_sppl_cd = "outsrc_sppl_cd";
	/**
	 * For delivery location rack/line 納入場所棚・ライン対象.<p>
	 *
	 */
	public static final String $in_to_str_ln_tgt_flg = "in_to_str_ln_tgt_flg";
	public static final String $in_to_str_ln_p = "in_to_str_ln_p";
	/**
	 * Direct-delivery type 直納区分.<p>
	 *
	 */
	public static final String $drct_dlv_typ = "drct_dlv_typ";
	/**
	 * Direct-delivery type name 直納区分名.<p>
	 *
	 */
	public static final String $drct_dlv_typ_nm = "drct_dlv_typ_nm";
	/**
	 * Sales order details No. 受注明細ＮＯ.<p>
	 *
	 */
	public static final String $slo_d_no = "slo_d_no";
	/**
	 * Sales order No. 受注ＮＯ.<p>
	 *
	 */
	public static final String $slo_no = "slo_no";
	/**
	 * For customers IV 得意先ＩＶ対象.<p>
	 *
	 */
	public static final String $cst_iv_flg = "cst_iv_flg";
	/**
	 * Delivery destination calendar cd. 納品先カレンダＣＤ.<p>
	 *
	 */
	public static final String $scst_cal_cd = "scst_cal_cd";
	public static final String $dlv_p = "dlv_p";
	public static final String $tdlv_p = "tdlv_p";
	public static final String $lot_no_p = "lot_no_p";
	/**
	 * Vendor lot No. 業者ロットＮＯ.<p>
	 *
	 */
	public static final String $bp_lot_no = "bp_lot_no";
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
	/**
	 * Shipping point deadline 出荷元期限.<p>
	 *
	 */
	public static final String $slip_fr_valid_dt = "slip_fr_valid_dt";
	public static final String $ver_no_p = "ver_no_p";
	public static final String $org_ver_no = "org_ver_no";
	/**
	 * For active ingredient 有効成分対象.<p>
	 *
	 */
	public static final String $cont_fctr_flg = "cont_fctr_flg";
	/**
	 * Active ingredient number of decimal places 有効成分小数部有効桁数.<p>
	 *
	 */
	public static final String $cont_fctr_dec_place = "cont_fctr_dec_place";
	/**
	 * Rounding type (Active ingredient conversion) 有効成分換算端数処理区分.<p>
	 *
	 */
	public static final String $cont_fctr_rnd_typ = "cont_fctr_rnd_typ";
	public static final String $purc_cont_qty_p = "purc_cont_qty_p";
	public static final String $purc_cont_fctr_p = "purc_cont_fctr_p";
	public static final String $cont_qty_p = "cont_qty_p";
	public static final String $cont_fctr_unit_p = "cont_fctr_unit_p";
	public static final String $std_cont_fctr_p = "std_cont_fctr_p";
	/**
	 * Currency cd. 通貨ＣＤ.<p>
	 *
	 */
	public static final String $trd_cur_cd = "trd_cur_cd";
	/**
	 * Currency name 通貨名.<p>
	 *
	 */
	public static final String $trd_cur_nm = "trd_cur_nm";
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
	 * Details correction 明細訂正.<p>
	 *
	 */
	public static final String $purc_dtl_upd_flg = "purc_dtl_upd_flg";
	/**
	 * Temporary AP 暫定買掛.<p>
	 *
	 */
	public static final String $temp_ap_flg = "temp_ap_flg";
	public static final String $trd_upri_amt_p = "trd_upri_amt_p";
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
	public static final String $trd_cur_proc_upri_p = "trd_cur_proc_upri_p";
	public static final String $trd_cur_proc_amt_p = "trd_cur_proc_amt_p";
	public static final String $trd_cur_onr_prov_upri_p = "trd_cur_onr_prov_upri_p";
	public static final String $trd_cur_onr_prov_amt_p = "trd_cur_onr_prov_amt_p";
	/**
	 * (Before change) Unit price (Transaction currency) 変更前取引通貨単価.<p>
	 *
	 */
	public static final String $old_trd_cur_upri = "old_trd_cur_upri";
	/**
	 * (Before change) Subcontracting unit price (Transaction currency) 変更前取引通貨加工単価.<p>
	 *
	 */
	public static final String $old_trd_cur_proc_upri = "old_trd_cur_proc_upri";
	/**
	 * (Before change) Chargeable supply unit price (Transaction currency) 変更前取引通貨有償支給単価.<p>
	 *
	 */
	public static final String $old_trd_cur_onr_prov_upri = "old_trd_cur_onr_prov_upri";
	/**
	 * Before change temporary unit price flg. 変更前仮単価ＦＬＧ.<p>
	 *
	 */
	public static final String $old_interim_flg = "old_interim_flg";
	/**
	 * Set scheduled rate 予定レート指定.<p>
	 *
	 */
	public static final String $xrate_inpt_flg = "xrate_inpt_flg";
	/**
	 * Schedule rate cd. 予定レートＣＤ.<p>
	 *
	 */
	public static final String $xrate_cd = "xrate_cd";
	public static final String $xrate_p = "xrate_p";
	public static final String $src_xrate = "src_xrate";
	/**
	 * Exchange rounding type 為替端数処理区分.<p>
	 *
	 */
	public static final String $xrate_rnd_typ = "xrate_rnd_typ";
	/**
	 * Base currency cd. 基準通貨ＣＤ.<p>
	 *
	 */
	public static final String $base_cur_cd = "base_cur_cd";
	/**
	 * Base currency name 基準通貨名.<p>
	 *
	 */
	public static final String $base_cur_nm = "base_cur_nm";
	/**
	 * Base amount number of decimal places 基準金額小数部有効桁数.<p>
	 *
	 */
	public static final String $base_cur_amt_dec_place = "base_cur_amt_dec_place";
	/**
	 * Base unit price number of decimal places 基準単価小数部有効桁数.<p>
	 *
	 */
	public static final String $base_cur_upri_dec_place = "base_cur_upri_dec_place";
	public static final String $base_cur_upri_p = "base_cur_upri_p";
	public static final String $base_cur_amt_p = "base_cur_amt_p";
	public static final String $base_cur_inc_tax_amt_p = "base_cur_inc_tax_amt_p";
	public static final String $base_cur_tax_amt_p = "base_cur_tax_amt_p";
	public static final String $base_cur_dscnt_amt_p = "base_cur_dscnt_amt_p";
	public static final String $base_cur_proc_upri_p = "base_cur_proc_upri_p";
	public static final String $base_cur_proc_amt_p = "base_cur_proc_amt_p";
	public static final String $base_cur_onr_prov_upri_p = "base_cur_onr_prov_upri_p";
	public static final String $base_cur_onr_prov_amt_p = "base_cur_onr_prov_amt_p";
	/**
	 * Set tax schedule rate 納税予定レート指定.<p>
	 *
	 */
	public static final String $ptax_xrate_inpt_flg = "ptax_xrate_inpt_flg";
	public static final String $prax_xrate_p = "prax_xrate_p";
	public static final String $src_ptax_xrate = "src_ptax_xrate";
	/**
	 * Taxpaying currency cd. 納税通貨ＣＤ.<p>
	 *
	 */
	public static final String $ptax_cur_cd = "ptax_cur_cd";
	/**
	 * Tax currency name 納税通貨名.<p>
	 *
	 */
	public static final String $ptax_cur_nm = "ptax_cur_nm";
	/**
	 * Tax amount number of decimal places 納税金額小数部有効桁数.<p>
	 *
	 */
	public static final String $ptax_cur_amt_dec_place = "ptax_cur_amt_dec_place";
	/**
	 * Tax unit price number of decimal places 納税単価小数部有効桁数.<p>
	 *
	 */
	public static final String $ptax_cur_upri_dec_place = "ptax_cur_upri_dec_place";
	/**
	 * Taxpaying date 納税日.<p>
	 *
	 */
	public static final String $ptax_dt = "ptax_dt";
	public static final String $ptax_cur_upri_p = "ptax_cur_upri_p";
	public static final String $ptax_cur_amt_p = "ptax_cur_amt_p";
	public static final String $ptax_cur_tax_amt_p = "ptax_cur_tax_amt_p";
	public static final String $ptax_cur_inc_tax_amt_p = "ptax_cur_inc_tax_amt_p";
	public static final String $ptax_cur_dscnt_amt_p = "ptax_cur_dscnt_amt_p";
	public static final String $ptax_cur_proc_upri_p = "ptax_cur_proc_upri_p";
	public static final String $ptax_cur_proc_amt_p = "ptax_cur_proc_amt_p";
	public static final String $ptax_cur_onr_prov_upri_p = "ptax_cur_onr_prov_upri_p";
	public static final String $ptax_cur_onr_prov_amt_p = "ptax_cur_onr_prov_amt_p";
	/**
	 * Withholding tax rate 源泉税率.<p>
	 *
	 */
	public static final String $wtax_rate = "wtax_rate";
	public static final String $wtax_amt_p = "wtax_amt_p";
	/**
	 * Withholding tax rounding type 源泉徴収税端数処理区分.<p>
	 *
	 */
	public static final String $wtax_rnd_typ = "wtax_rnd_typ";
	/**
	 * Supplier item cd. 発注先品目ＣＤ.<p>
	 *
	 */
	public static final String $sppl_itm_cd = "sppl_itm_cd";
	/**
	 * Supplier item name 発注先品名.<p>
	 *
	 */
	public static final String $sppl_itm_nm = "sppl_itm_nm";
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
	 * Expense purchase 経費購買.<p>
	 *
	 */
	public static final String $xpns_purc_flg = "xpns_purc_flg";
	/**
	 * Purchase identification type 購買識別区分.<p>
	 *
	 */
	public static final String $purc_id_typ = "purc_id_typ";
	/**
	 * Purchase identification type name 購買識別区分名.<p>
	 *
	 */
	public static final String $purc_id_typ_nm = "purc_id_typ_nm";
	/**
	 * Inventory inspection type 在庫検査区分.<p>
	 *
	 */
	public static final String $stk_insp_typ = "stk_insp_typ";
	/**
	 * Inventory inspection type name 在庫検査区分名.<p>
	 *
	 */
	public static final String $stk_insp_typ_nm = "stk_insp_typ_nm";
	/**
	 * Inventory identification type 在庫識別区分.<p>
	 *
	 */
	public static final String $stk_id_typ = "stk_id_typ";
	/**
	 * Inventory identification type name 在庫識別区分名.<p>
	 *
	 */
	public static final String $stk_id_typ_nm = "stk_id_typ_nm";
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
	 * Master AP dept. cd. マスタ債務部門ＣＤ.<p>
	 *
	 */
	public static final String $mst_ap_dpt_cd = "mst_ap_dpt_cd";
	/**
	 * Payment carry-over count 支払繰越回数.<p>
	 *
	 */
	public static final String $pay_crryovr_times = "pay_crryovr_times";
	public static final String $usr_dpt_p = "usr_dpt_p";
	/**
	 * AP dept. 債務部門.<p>
	 *
	 */
	public static final String $ap_dpt_flg = "ap_dpt_flg";
	/**
	 * Purchasing dept. WG cd. 購買部門ＷＧＣＤ.<p>
	 *
	 */
	public static final String $purc_dpt_wg_cd = "purc_dpt_wg_cd";
	/**
	 * Purchasing dept. WG name 購買部門ＷＧ名.<p>
	 *
	 */
	public static final String $purc_dpt_wg_nm = "purc_dpt_wg_nm";
	public static final String $bditm_p = "bditm_p";
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
	 * Schedule spare 1 予定予備１.<p>
	 *
	 */
	public static final String $s_sub_char1 = "s_sub_char1";
	/**
	 * Schedule spare 2 予定予備２.<p>
	 *
	 */
	public static final String $s_sub_char2 = "s_sub_char2";
	/**
	 * Schedule spare 3 予定予備３.<p>
	 *
	 */
	public static final String $s_sub_char3 = "s_sub_char3";
	/**
	 * Transaction remarks 取引備考.<p>
	 *
	 */
	public static final String $trd_rmrks = "trd_rmrks";
	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public static final String $intr_rmrks = "intr_rmrks";
	/**
	 * PO sheet remarks 注文書備考.<p>
	 *
	 */
	public static final String $po_print_rmrks = "po_print_rmrks";
	/**
	 * Purchase result spare 1 仕入実績予備１.<p>
	 *
	 */
	public static final String $sub_char1 = "sub_char1";
	/**
	 * Purchase result spare 2 仕入実績予備２.<p>
	 *
	 */
	public static final String $sub_char2 = "sub_char2";
	/**
	 * Purchase result spare 3 仕入実績予備３.<p>
	 *
	 */
	public static final String $sub_char3 = "sub_char3";
	/**
	 * Transaction terms cd. 1 取引条件ＣＤ１.<p>
	 *
	 */
	public static final String $tterm_cd1 = "tterm_cd1";
	/**
	 * Transaction terms name 1 取引条件名１.<p>
	 *
	 */
	public static final String $tterm_nm1 = "tterm_nm1";
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
	 * Transaction terms name 2 取引条件名２.<p>
	 *
	 */
	public static final String $tterm_nm2 = "tterm_nm2";
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
	 * Transaction terms name 3 取引条件名３.<p>
	 *
	 */
	public static final String $tterm_nm3 = "tterm_nm3";
	/**
	 * Transaction terms remarks 3 取引条件備考３.<p>
	 *
	 */
	public static final String $tterm_rmrks3 = "tterm_rmrks3";
	/**
	 * Transaction details remarks 取引明細備考.<p>
	 *
	 */
	public static final String $trd_d_rmrks = "trd_d_rmrks";
	/**
	 * Internal details remarks 内部明細備考.<p>
	 *
	 */
	public static final String $intr_d_rmrks = "intr_d_rmrks";
	/**
	 * Purchase result details spare 1 仕入実績明細予備１.<p>
	 *
	 */
	public static final String $dtl_sub_char1 = "dtl_sub_char1";
	/**
	 * Purchase result details spare 2 仕入実績明細予備２.<p>
	 *
	 */
	public static final String $dtl_sub_char2 = "dtl_sub_char2";
	/**
	 * Purchase result details spare 3 仕入実績明細予備３.<p>
	 *
	 */
	public static final String $dtl_sub_char3 = "dtl_sub_char3";
	/**
	 * PO sheet details remarks 注文書明細備考.<p>
	 *
	 */
	public static final String $po_print_d_rmrks = "po_print_d_rmrks";
	/**
	 * EDI ＥＤＩ.<p>
	 *
	 */
	public static final String $edi_flg = "edi_flg";
	/**
	 * EDI vendor delivery note No. ＥＤＩ業者納品書ＮＯ.<p>
	 *
	 */
	public static final String $edi_bp_dlv_slip_no = "edi_bp_dlv_slip_no";
	/**
	 * EDI vendor delivery note details No. ＥＤＩ業者納品書明細ＮＯ.<p>
	 *
	 */
	public static final String $edi_bp_dlv_slip_d_no = "edi_bp_dlv_slip_d_no";
	/**
	 * Display order 表示順.<p>
	 *
	 */
	public static final String $disp_seq = "disp_seq";
	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public static final String $ins_usr_id = "ins_usr_id";
	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public static final String $ins_usr_nm = "ins_usr_nm";
	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public static final String $ins_func_id = "ins_func_id";
	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public static final String $ins_func_nm = "ins_func_nm";
	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public static final String $ins_ts = "ins_ts";
	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public static final String $upd_usr_id = "upd_usr_id";
	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public static final String $upd_usr_nm = "upd_usr_nm";
	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public static final String $upd_func_id = "upd_func_id";
	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public static final String $upd_func_nm = "upd_func_nm";
	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public static final String $upd_ts = "upd_ts";
	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public static final String $upd_srv_req_no = "upd_srv_req_no";
	public static final String $arr_pr_upd_cntr = "arr_pr_upd_cntr";
	public static final String $purc_act_upd_cntr = "purc_act_upd_cntr";
	public static final String $rcpt_iv_upd_cntr = "rcpt_iv_upd_cntr";
	public static final String $rts_msg_p = "rts_msg_p";
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
	 * Chargeable supply amount (Transaction currency) before change 変更前取引通貨有償支給金額.<p>
	 *
	 */
	public static final String $db_trd_cur_onr_prov_amt = "db_trd_cur_onr_prov_amt";
	/**
	 * (Before change) Chargeable supply unit price (Transaction currency) 変更前取引通貨有償支給単価.<p>
	 *
	 */
	public static final String $db_trd_cur_onr_prov_upri = "db_trd_cur_onr_prov_upri";
	/**
	 * Subcontracting amount (Transaction currency) before change 変更前取引通貨加工金額.<p>
	 *
	 */
	public static final String $db_trd_cur_proc_amt = "db_trd_cur_proc_amt";
	/**
	 * (Before change) Subcontracting unit price (Transaction currency) 変更前取引通貨加工単価.<p>
	 *
	 */
	public static final String $db_trd_cur_proc_upri = "db_trd_cur_proc_upri";
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
	public static final String $sls_sync_flg = "sls_sync_flg";
	/**
	 * Purchase/Acceptance detective qty. 仕入・検収不良数量.<p>
	 *
	 */
	public static final String $purc_act_qty = "purc_act_qty";

	public static final String $ac_dt = $ac_dt_p + ".ac_dt";
	public static final String $can_ac_dt_for_input = $can_ac_dt_p + ".can_ac_dt_for_input";
	public static final String $can_ac_dt = $can_ac_dt_p + ".can_ac_dt_for_call";
	public static final String $ac_dt_after_srch = $can_ac_dt_p + ".ac_dt_after_srch";
	public static final String $itm_cd = $itm_p + ".itm_cd";
	public static final String $itm_sub1 = $itm_p + ".itm_sub1";
	public static final String $itm_sub2 = $itm_p + ".itm_sub2";
	public static final String $itm_sub3 = $itm_p + ".itm_sub3";
	public static final String $itm_nm = $itm_p + ".itm_nm";
	public static final String $itm_grp_cd1 = $itm_grp_p + ".itm_grp_cd1";
	public static final String $itm_grp_nm1 = $itm_grp_p + ".itm_grp_nm1";
	public static final String $itm_grp_cd2 = $itm_grp_p + ".itm_grp_cd2";
	public static final String $itm_grp_nm2 = $itm_grp_p + ".itm_grp_nm2";
	public static final String $itm_grp_cd3 = $itm_grp_p + ".itm_grp_cd3";
	public static final String $itm_grp_nm3 = $itm_grp_p + ".itm_grp_nm3";
	public static final String $itm_grp_cd4 = $itm_grp_p + ".itm_grp_cd4";
	public static final String $itm_grp_nm4 = $itm_grp_p + ".itm_grp_nm4";
	public static final String $itm_grp_cd5 = $itm_grp_p + ".itm_grp_cd5";
	public static final String $itm_grp_nm5 = $itm_grp_p + ".itm_grp_nm5";
	public static final String $itm_grp_cd6 = $itm_grp_p + ".itm_grp_cd6";
	public static final String $itm_grp_nm6 = $itm_grp_p + ".itm_grp_nm6";
	public static final String $itm_grp_cd7 = $itm_grp_p + ".itm_grp_cd7";
	public static final String $itm_grp_nm7 = $itm_grp_p + ".itm_grp_nm7";
	public static final String $itm_grp_cd8 = $itm_grp_p + ".itm_grp_cd8";
	public static final String $itm_grp_nm8 = $itm_grp_p + ".itm_grp_nm8";
	public static final String $itm_grp_cd9 = $itm_grp_p + ".itm_grp_cd9";
	public static final String $itm_grp_nm9 = $itm_grp_p + ".itm_grp_nm9";
	public static final String $itm_grp_cd10 = $itm_grp_p + ".itm_grp_cd10";
	public static final String $itm_grp_nm10 = $itm_grp_p + ".itm_grp_nm10";
	public static final String $sppl_show_dtl = $sppl_addr_p + ".show_dtl";
	public static final String $sppl_cntry_cd = $sppl_addr_p + ".cntry_cd";
	public static final String $sppl_cntry_nm = $sppl_addr_p + ".cntry_nm";
	public static final String $sppl_zip_cd = $sppl_addr_p + ".zip_cd";
	public static final String $sppl_addr1 = $sppl_addr_p + ".addr1";
	public static final String $sppl_addr2 = $sppl_addr_p + ".addr2";
	public static final String $sppl_addr3 = $sppl_addr_p + ".addr3";
	public static final String $sppl_addr4 = $sppl_addr_p + ".addr4";
	public static final String $sppl_tel = $sppl_addr_p + ".tel";
	public static final String $sppl_fax = $sppl_addr_p + ".fax";
	public static final String $sppl_cntct_dpt = $sppl_addr_p + ".cntct_dpt";
	public static final String $sppl_cntct_psn = $sppl_addr_p + ".cntct_psn";
	public static final String $sppl_grp_cd1 = $sppl_grp_p + ".bp_grp_cd1";
	public static final String $sppl_grp_nm1 = $sppl_grp_p + ".bp_grp_nm1";
	public static final String $sppl_grp_cd2 = $sppl_grp_p + ".bp_grp_cd2";
	public static final String $sppl_grp_nm2 = $sppl_grp_p + ".bp_grp_nm2";
	public static final String $sppl_grp_cd3 = $sppl_grp_p + ".bp_grp_cd3";
	public static final String $sppl_grp_nm3 = $sppl_grp_p + ".bp_grp_nm3";
	public static final String $sppl_grp_cd4 = $sppl_grp_p + ".bp_grp_cd4";
	public static final String $sppl_grp_nm4 = $sppl_grp_p + ".bp_grp_nm4";
	public static final String $sppl_grp_cd5 = $sppl_grp_p + ".bp_grp_cd5";
	public static final String $sppl_grp_nm5 = $sppl_grp_p + ".bp_grp_nm5";
	public static final String $sppl_grp_cd6 = $sppl_grp_p + ".bp_grp_cd6";
	public static final String $sppl_grp_nm6 = $sppl_grp_p + ".bp_grp_nm6";
	public static final String $sppl_grp_cd7 = $sppl_grp_p + ".bp_grp_cd7";
	public static final String $sppl_grp_nm7 = $sppl_grp_p + ".bp_grp_nm7";
	public static final String $sppl_grp_cd8 = $sppl_grp_p + ".bp_grp_cd8";
	public static final String $sppl_grp_nm8 = $sppl_grp_p + ".bp_grp_nm8";
	public static final String $sppl_grp_cd9 = $sppl_grp_p + ".bp_grp_cd9";
	public static final String $sppl_grp_nm9 = $sppl_grp_p + ".bp_grp_nm9";
	public static final String $sppl_grp_cd10 = $sppl_grp_p + ".bp_grp_cd10";
	public static final String $sppl_grp_nm10 = $sppl_grp_p + ".bp_grp_nm10";
	public static final String $trd_unit_qty = $trd_unit_qty_p + ".qty";
	public static final String $base_unit_qty = $base_unit_qty_p + ".qty";
	public static final String $base_unit_qty_bef = $base_unit_qty_bef_p + ".qty";
	public static final String $po_qty = $po_qty_p + ".qty";
	public static final String $arr_qty = $arr_qty_p + ".qty";
	public static final String $purc_schd_qty = $purc_schd_qty_p + ".qty";
	public static final String $purc_qty = $purc_qty_p + ".qty";
	public static final String $accpt_dfct_qty = $accpt_dfct_qty_p + ".qty";
	public static final String $abort_qty = $abort_qty_p + ".qty";
	public static final String $re_arr_str_ln_cd = $re_arr_str_ln_p + ".str_ln_cd";
	public static final String $re_arr_str_ln_nm = $re_arr_str_ln_p + ".str_ln_nm";
	public static final String $re_arr_str_ln_cd_none_flg = $re_arr_str_ln_p + ".str_ln_cd_none_flg";
	public static final String $trd_unit_re_arr_qty = $re_arr_qty_p + ".qty";
	public static final String $re_arr_rqst_dt = $re_arr_rqst_tm_p + ".ymd";
	public static final String $re_arr_rqst_hm = $re_arr_rqst_tm_p + ".hm";
	public static final String $sno1 = $sno_p + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno1 + "";
	public static final String $sno2 = $sno_p + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno2 + "";
	public static final String $sno3 = $sno_p + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno3 + "";
	public static final String $sno4 = $sno_p + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno4 + "";
	public static final String $wrk_no = $sno_p + ".wrk_no";
	public static final String $wrk_nm = $sno_p + ".wrk_nm";
	public static final String $in_to_str_ln_cd = $in_to_str_ln_p + ".str_ln_cd";
	public static final String $in_to_str_ln_nm = $in_to_str_ln_p + ".str_ln_nm";
	public static final String $in_to_str_ln_cd_none_flg = $in_to_str_ln_p + ".str_ln_cd_none_flg";
	public static final String $dlv_cd = $dlv_p + ".bp_cd";
	public static final String $dlv_nm = $dlv_p + ".bp_nm";
	public static final String $dlv_sundry_flg = $dlv_p + ".dlv_sundry_flg";
	public static final String $dlv_show_dt = $dlv_p + ".show_dtl";
	public static final String $dlv_cntry_cd = $dlv_p + ".cntry_cd";
	public static final String $dlv_cntry_nm = $dlv_p + ".cntry_nm";
	public static final String $dlv_zip_cd = $dlv_p + ".zip_cd";
	public static final String $dlv_addr1 = $dlv_p + ".addr1";
	public static final String $dlv_addr2 = $dlv_p + ".addr2";
	public static final String $dlv_addr3 = $dlv_p + ".addr3";
	public static final String $dlv_addr4 = $dlv_p + ".addr4";
	public static final String $dlv_tel = $dlv_p + ".tel";
	public static final String $dlv_fax = $dlv_p + ".fax";
	public static final String $tdlv_cd = $tdlv_p + ".bp_cd";
	public static final String $tdlv_nm = $tdlv_p + ".bp_nm";
	public static final String $tdlv_sundry_flg = $tdlv_p + ".dlv_sundry_flg";
	public static final String $tdlv_show_dt = $tdlv_p + ".show_dtl";
	public static final String $tdlv_cntry_cd = $tdlv_p + ".cntry_cd";
	public static final String $tdlv_cntry_nm = $tdlv_p + ".cntry_nm";
	public static final String $tdlv_zip_cd = $tdlv_p + ".zip_cd";
	public static final String $tdlv_addr1 = $tdlv_p + ".addr1";
	public static final String $tdlv_addr2 = $tdlv_p + ".addr2";
	public static final String $tdlv_addr3 = $tdlv_p + ".addr3";
	public static final String $tdlv_addr4 = $tdlv_p + ".addr4";
	public static final String $tdlv_tel = $tdlv_p + ".tel";
	public static final String $tdlv_fax = $tdlv_p + ".fax";
	public static final String $tdlv_cntct_dpt = $tdlv_p + ".dlv_cntct_dpt";
	public static final String $tdlv_cntct_psn = $tdlv_p + ".dlv_cntct_psn";
	public static final String $crt_lot_flg = $lot_no_p + ".crt_lot_flg";
	public static final String $lot_no = $lot_no_p + ".lot_no";
	public static final String $sublot_no = $lot_no_p + ".sublot_no";
	public static final String $ver_no = $ver_no_p + ".ver_no";
	public static final String $purc_cont_qty = $purc_cont_qty_p + ".purc_cont_qty";
	public static final String $purc_cont_fctr = $purc_cont_fctr_p + ".purc_cont_fctr";
	public static final String $std_cont_qty = $cont_qty_p + ".cont_qty";
	public static final String $cont_fctr_unit_cd = $cont_fctr_unit_p + ".cont_fctr_unit_cd";
	public static final String $cont_fctr_unit_nm = $cont_fctr_unit_p + ".cont_fctr_unit_nm";
	public static final String $std_cont_fctr = $std_cont_fctr_p + ".std_cont_fctr";
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
	public static final String $trd_cur_proc_upri = $trd_cur_proc_upri_p + ".upri";
	public static final String $trd_cur_proc_amt = $trd_cur_proc_amt_p + ".amt";
	public static final String $trd_cur_proc_tax_amt = $trd_cur_proc_amt_p + ".tax_amt";
	public static final String $trd_cur_onr_prov_upri = $trd_cur_onr_prov_upri_p + ".upri";
	public static final String $trd_cur_onr_prov_amt = $trd_cur_onr_prov_amt_p + ".amt";
	public static final String $trd_cur_onr_prov_tax_amt = $trd_cur_onr_prov_amt_p + ".tax_amt";
	public static final String $xrate = $xrate_p + ".xrate";
	public static final String $base_cur_upri = $base_cur_upri_p + ".upri";
	public static final String $base_cur_amt = $base_cur_amt_p + ".amt";
	public static final String $base_cur_inc_tax_amt = $base_cur_inc_tax_amt_p + ".amt";
	public static final String $base_cur_tax_amt = $base_cur_tax_amt_p + ".amt";
	public static final String $base_cur_dscnt_amt = $base_cur_dscnt_amt_p + ".amt";
	public static final String $base_cur_proc_upri = $base_cur_proc_upri_p + ".upri";
	public static final String $base_cur_proc_amt = $base_cur_proc_amt_p + ".amt";
	public static final String $base_cur_proc_tax_amt = $base_cur_proc_amt_p + ".tax_amt";
	public static final String $base_cur_onr_prov_upri = $base_cur_onr_prov_upri_p + ".upri";
	public static final String $base_cur_onr_prov_amt = $base_cur_onr_prov_amt_p + ".amt";
	public static final String $base_cur_onr_prov_tax_amt = $base_cur_onr_prov_amt_p + ".tax_amt";
	public static final String $ptax_xrate = $prax_xrate_p + ".xrate";
	public static final String $ptax_cur_upri = $ptax_cur_upri_p + ".upri";
	public static final String $ptax_cur_amt = $ptax_cur_amt_p + ".amt";
	public static final String $ptax_cur_tax_amt = $ptax_cur_tax_amt_p + ".amt";
	public static final String $ptax_cur_inc_tax_amt = $ptax_cur_inc_tax_amt_p + ".amt";
	public static final String $ptax_cur_dscnt_amt = $ptax_cur_dscnt_amt_p + ".amt";
	public static final String $ptax_cur_proc_upri = $ptax_cur_proc_upri_p + ".upri";
	public static final String $ptax_cur_proc_amt = $ptax_cur_proc_amt_p + ".amt";
	public static final String $ptax_cur_proc_tax_amt = $ptax_cur_proc_amt_p + ".tax_amt";
	public static final String $ptax_cur_onr_prov_upri = $ptax_cur_onr_prov_upri_p + ".upri";
	public static final String $ptax_cur_onr_prov_amt = $ptax_cur_onr_prov_amt_p + ".amt";
	public static final String $ptax_cur_onr_prov_tax_amt = $ptax_cur_onr_prov_amt_p + ".tax_amt";
	public static final String $wtax_amt = $wtax_amt_p + ".amt";
	public static final String $purc_usr_cd = $usr_dpt_p + ".usr_cd";
	public static final String $purc_usr_nm = $usr_dpt_p + ".usr_nm";
	public static final String $purc_dpt_cd = $usr_dpt_p + ".dpt_cd";
	public static final String $purc_dpt_nm = $usr_dpt_p + ".dpt_nm";
	public static final String $bd_dpt_cd = $bditm_p + ".bd_dpt_cd";
	public static final String $bd_dpt_nm = $bditm_p + ".bd_dpt_nm";
	public static final String $bd_itm_cd = $bditm_p + ".bd_itm_cd";
	public static final String $bd_itm_sub1 = $bditm_p + ".bd_itm_sub1";
	public static final String $bd_itm_sub2 = $bditm_p + ".bd_itm_sub2";
	public static final String $bd_itm_sub3 = $bditm_p + ".bd_itm_sub3";
	public static final String $bd_itm_nm = $bditm_p + ".bd_itm_nm";
	public static final String $bd_lot_no = $bditm_p + ".bd_lot_no";
	public static final String $bd_sublot_no = $bditm_p + ".bd_sublot_no";
	public static final String $bd_sno1 = $bditm_p + ".bd_sno1";
	public static final String $bd_sno2 = $bditm_p + ".bd_sno2";
	public static final String $bd_sno3 = $bditm_p + ".bd_sno3";
	public static final String $bd_sno4 = $bditm_p + ".bd_sno4";
	public static final String $bd_bp_cd = $bditm_p + ".bd_bp_cd";
	public static final String $bd_bp_nm = $bditm_p + ".bd_bp_nm";
	public static final String $bd_loc_cd = $bditm_p + ".bd_loc_cd";
	public static final String $bd_loc_nm = $bditm_p + ".bd_loc_nm";
	public static final String $bd_ctg_cd = $bditm_p + ".bd_ctg_cd";
	public static final String $bd_ctg_nm = $bditm_p + ".bd_ctg_nm";
	public static final String $bd_oper_cd = $bditm_p + ".bd_oper_cd";
	public static final String $bd_oper_nm = $bditm_p + ".bd_oper_nm";
	public static final String $bd_iv_no = $bditm_p + ".bd_iv_no";
	public static final String $bd_slo_no = $bditm_p + ".bd_slo_no";
	public static final String $bd_po_no = $bditm_p + ".bd_po_no";
	public static final String $rtn_sts_typ = $rts_msg_p + ".rtn_sts_typ";
	public static final String $rtn_sts_typ_nm = $rts_msg_p + ".rtn_sts_typ_nm";
	public static final String $msg_id = $rts_msg_p + ".msg_id";
	public static final String $msg = $rts_msg_p + ".msg";

	public static final MCMeta check_META = createCommonMeta($check, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta hdr_readonly_flg_META = createCommonMeta($hdr_readonly_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta bef_abort_flg_META = createCommonMeta($bef_abort_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta abort_flg_META = createCommonMeta($abort_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta trd_cd_META = createCommonMeta($trd_cd, mcframe.commonMA.meta.MA_META.TRD_CD);
	public static final MCMeta trd_nm_META = createCommonMeta($trd_nm, mcframe.commonMA.meta.MA_META.TRD_NM);
	public static final MCMeta trd_ptn_typ_META = createCommonMeta($trd_ptn_typ, mcframe.commonMA.meta.MA_META.TRD_PTN_TYP);
	public static final MCMeta arr_ptn_typ_META = createCommonMeta($arr_ptn_typ, mcframe.commonMA.meta.MA_META.ARR_PTN_TYP);
	public static final MCMeta arr_ptn_typ_nm_META = createCommonMeta($arr_ptn_typ_nm, mcframe.commonMA.meta.MA_META.ARR_PTN_TYP_NM);
	public static final MCMeta sync_flg_META = createCommonMeta($sync_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta purc_basis_typ_META = createCommonMeta($purc_basis_typ, mcframe.commonMA.meta.MA_META.PURC_BASIS_TYP);
	public static final MCMeta purc_basis_typ_nm_META = createCommonMeta($purc_basis_typ_nm, mcframe.commonMA.meta.MA_META.PURC_BASIS_TYP_NM);
	public static final MCMeta purc_ddlv_flg_META = createCommonMeta($purc_ddlv_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta arr_skip_flg_META = createCommonMeta($arr_skip_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta purc_dt_META = createCommonMeta($purc_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta ac_ym_META = createCommonMeta($ac_ym, mcframe.commonMA.meta.MA_META.YM);
	public static final MCMeta ac_dt_p_META = createInnerRowMeta($ac_dt_p, mcframe.clientMAUB.MAUBP5220.AcDtR.class);
	public static final MCMeta can_ac_dt_p_META = createInnerRowMeta($can_ac_dt_p, mcframe.clientMAUB.MAUBP5240.CanAcDtR.class);
	public static final MCMeta pay_basis_dt_META = createCommonMeta($pay_basis_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta pay_schd_dt_META = createCommonMeta($pay_schd_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta purc_schd_dt_META = createCommonMeta($purc_schd_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta dlv_rqst_dt_META = createCommonMeta($dlv_rqst_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta arr_schd_dt_META = createCommonMeta($arr_schd_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta schd_sync_flg_META = createCommonMeta($schd_sync_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta aprv_no_META = createCommonMeta($aprv_no, mcframe.commonMA.meta.MA_META.APRV_NO);
	public static final MCMeta aprv_sts_typ_META = createCommonMeta($aprv_sts_typ, mcframe.commonMA.meta.MA_META.APRV_STS_TYP);
	public static final MCMeta aprv_sts_typ_nm_META = createCommonMeta($aprv_sts_typ_nm, mcframe.commonMA.meta.MA_META.APRV_STS_TYP_NM);
	public static final MCMeta po_no_META = createCommonMeta($po_no, mcframe.commonMA.meta.MA_META.PO_NO);
	public static final MCMeta po_d_no_META = createCommonMeta($po_d_no, mcframe.commonMA.meta.MA_META.PO_D_NO);
	public static final MCMeta po_schd_src_typ_META = createCommonMeta($po_schd_src_typ, mcframe.commonMS.meta.MS_META.PO_SCHD_SRC_TYP);
	public static final MCMeta po_schd_src_typ_nm_META = createCommonMeta($po_schd_src_typ_nm, mcframe.commonMS.meta.MS_META.PO_SCHD_SRC_TYP_NM);
	public static final MCMeta po_schd_src_no_META = createCommonMeta($po_schd_src_no, mcframe.commonMA.meta.MA_META.PO_SCHD_SRC_NO);
	public static final MCMeta rcpt_iv_no_META = createCommonMeta($rcpt_iv_no, mcframe.commonMA.meta.MA_META.IV_NO);
	public static final MCMeta rcpt_iv_mng_no_META = createCommonMeta($rcpt_iv_mng_no, mcframe.commonMA.meta.MA_META.RCPT_IV_MNG_NO);
	public static final MCMeta rcpt_iv_d_no_META = createCommonMeta($rcpt_iv_d_no, mcframe.commonMA.meta.MA_META.RCPT_IV_D_NO);
	public static final MCMeta mfg_inst_no_META = createCommonMeta($mfg_inst_no, mcframe.commonMA.meta.MA_META.MFG_INST_NO);
	public static final MCMeta mfg_loc_cd_META = createCommonMeta($mfg_loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta bom_ptn_META = createCommonMeta($bom_ptn, mcframe.commonMA.meta.MA_META.BOM_PTN);
	public static final MCMeta purc_schd_no_META = createCommonMeta($purc_schd_no, mcframe.commonMA.meta.MA_META.PURC_SCHD_NO);
	public static final MCMeta purc_act_no_META = createCommonMeta($purc_act_no, mcframe.commonMA.meta.MA_META.PURC_ACT_NO);
	public static final MCMeta purc_act_d_no_META = createCommonMeta($purc_act_d_no, mcframe.commonMA.meta.MA_META.PURC_ACT_D_NO);
	public static final MCMeta purc_act_seq_META = createCommonMeta($purc_act_seq, mcframe.commonMA.meta.MA_META.SLIP_SEQ);
	public static final MCMeta purc_act_d_seq_META = createCommonMeta($purc_act_d_seq, mcframe.commonMA.meta.MA_META.SLIP_SEQ);
	public static final MCMeta arr_schd_no_META = createCommonMeta($arr_schd_no, mcframe.commonMA.meta.MA_META.ARR_SCHD_NO);
	public static final MCMeta arr_pr_no_META = createCommonMeta($arr_pr_no, mcframe.commonMA.meta.MA_META.ARR_PR_NO);
	public static final MCMeta arr_act_no_META = createCommonMeta($arr_act_no, mcframe.commonMA.meta.MA_META.ARR_ACT_NO);
	public static final MCMeta from_gd_cd_META = createCommonMeta($from_gd_cd, mcframe.commonMA.meta.MA_META.STK_GD_CD);
	public static final MCMeta tmp_gd_cd_META = createCommonMeta($tmp_gd_cd, mcframe.commonMA.meta.MA_META.STK_GD_CD);
	public static final MCMeta tmp_quality_typ_META = createCommonMeta($tmp_quality_typ, mcframe.commonMA.meta.MA_META.QUALITY_TYP);
	public static final MCMeta tmp_stk_insp_typ_META = createCommonMeta($tmp_stk_insp_typ, mcframe.commonMS.meta.MS_META.STK_INSP_TYP);
	public static final MCMeta tmp_stk_id_typ_META = createCommonMeta($tmp_stk_id_typ, mcframe.commonMS.meta.MS_META.STK_ID_TYP);
	public static final MCMeta gi_wg_cd_META = createCommonMeta($gi_wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta gi_loc_cd_META = createCommonMeta($gi_loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta gi_str_ln_cd_META = createCommonMeta($gi_str_ln_cd, mcframe.commonMA.meta.MA_META.STR_LN_CD);
	public static final MCMeta gi_unit_cd_META = createCommonMeta($gi_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta multi_io_flg_META = createCommonMeta($multi_io_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta par_purc_act_d_no_META = createCommonMeta($par_purc_act_d_no, mcframe.commonMA.meta.MA_META.PURC_ACT_D_NO);
	public static final MCMeta arr_split_flg_META = createCommonMeta($arr_split_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta asset_mng_typ_META = createCommonMeta($asset_mng_typ, mcframe.commonMA.meta.MA_META.ASSET_MNG_TYP);
	public static final MCMeta asset_mng_typ_nm_META = createCommonMeta($asset_mng_typ_nm, mcframe.commonMA.meta.MA_META.ASSET_MNG_TYP_NM);
	public static final MCMeta itm_typ_META = createCommonMeta($itm_typ, mcframe.commonMA.meta.MA_META.ITM_TYP);
	public static final MCMeta itm_typ_nm_META = createCommonMeta($itm_typ_nm, mcframe.commonMA.meta.MA_META.ITM_TYP_NM);
	public static final MCMeta itm_typ_d_cd_META = createCommonMeta($itm_typ_d_cd, mcframe.commonMA.meta.MA_META.ITM_TYP_D_CD);
	public static final MCMeta itm_typ_d_nm_META = createCommonMeta($itm_typ_d_nm, mcframe.commonMA.meta.MA_META.ITM_TYP_D_NM);
	public static final MCMeta itm_p_META = createInnerRowMeta($itm_p, mcframe.clientMAUB.MAUBP5030.ItmR.class);
	public static final MCMeta iv_itm_nm_META = createCommonMeta($iv_itm_nm, mcframe.commonMA.meta.MA_META.ITM_NM);
	public static final MCMeta ver_flg_META = createCommonMeta($ver_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta lot_mng_typ_META = createCommonMeta($lot_mng_typ, mcframe.commonMA.meta.MA_META.LOT_MNG_TYP);
	public static final MCMeta sublot_mng_typ_META = createCommonMeta($sublot_mng_typ, mcframe.commonMA.meta.MA_META.LOT_MNG_TYP);
	public static final MCMeta lot_no_typ_META = createCommonMeta($lot_no_typ, mcframe.commonMA.meta.MA_META.LOT_NO_TYP);
	public static final MCMeta sublot_no_typ_META = createCommonMeta($sublot_no_typ, mcframe.commonMA.meta.MA_META.LOT_NO_TYP);
	public static final MCMeta sno1_mng_typ_META = createCommonMeta($sno1_mng_typ, mcframe.commonMA.meta.MA_META.SNO_MNG_TYP);
	public static final MCMeta sno2_mng_typ_META = createCommonMeta($sno2_mng_typ, mcframe.commonMA.meta.MA_META.SNO_MNG_TYP);
	public static final MCMeta sno3_mng_typ_META = createCommonMeta($sno3_mng_typ, mcframe.commonMA.meta.MA_META.SNO_MNG_TYP);
	public static final MCMeta sno4_mng_typ_META = createCommonMeta($sno4_mng_typ, mcframe.commonMA.meta.MA_META.SNO_MNG_TYP);
	public static final MCMeta stk_mng_typ_META = createCommonMeta($stk_mng_typ, mcframe.commonMA.meta.MA_META.STK_MNG_TYP);
	public static final MCMeta sundry_itm_flg_META = createCommonMeta($sundry_itm_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta bp_lot_flg_META = createCommonMeta($bp_lot_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta dscnt_itm_flg_META = createCommonMeta($dscnt_itm_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta itm_pay_crryovr_times_META = createCommonMeta($itm_pay_crryovr_times, mcframe.commonMA.meta.MA_META.CRRYOVR_TIMES);
	public static final MCMeta itm_purc_upri_cng_flg_META = createCommonMeta($itm_purc_upri_cng_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta itm_grp_p_META = createInnerRowMeta($itm_grp_p, mcframe.clientMAUB.MAUBP5170.ItmGrpR.class);
	public static final MCMeta sppl_cd_META = createCommonMeta($sppl_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta sppl_nm_META = createCommonMeta($sppl_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta pay_spot_flg_META = createCommonMeta($pay_spot_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta ap_cred_cd_META = createCommonMeta($ap_cred_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta purc_slip_each_lot_typ_META = createCommonMeta($purc_slip_each_lot_typ, mcframe.commonMA.meta.MA_META.SLIP_EACH_LOT_TYP);
	public static final MCMeta purc_upri_cng_flg_META = createCommonMeta($purc_upri_cng_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sppl_iv_flg_META = createCommonMeta($sppl_iv_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta prnt_lcl_cd_META = createCommonMeta($prnt_lcl_cd, mcframe.commonMA.meta.MA_META.LCL_CD);
	public static final MCMeta purc_amt_rnd_typ_META = createCommonMeta($purc_amt_rnd_typ, mcframe.commonMA.meta.MA_META.RND_TYP);
	public static final MCMeta purc_tax_rnd_typ_META = createCommonMeta($purc_tax_rnd_typ, mcframe.commonMA.meta.MA_META.RND_TYP);
	public static final MCMeta purc_tax_calc_typ_META = createCommonMeta($purc_tax_calc_typ, mcframe.commonMA.meta.MA_META.TAX_CALC_TYP);
	public static final MCMeta sppl_addr_p_META = createInnerRowMeta($sppl_addr_p, mcframe.clientMAUB.MAUBP5360.AddrR.class);
	public static final MCMeta subcon_flg_META = createCommonMeta($subcon_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sppl_grp_p_META = createInnerRowMeta($sppl_grp_p, mcframe.clientMAUB.MAUBP5190.BpGrpR.class);
	public static final MCMeta asppl_cd_META = createCommonMeta($asppl_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta asppl_nm_META = createCommonMeta($asppl_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta outsrc_flg_META = createCommonMeta($outsrc_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta maker_cd_META = createCommonMeta($maker_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta maker_nm_META = createCommonMeta($maker_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta accpt_dfct_flg_META = createCommonMeta($accpt_dfct_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta trd_unit_cd_META = createCommonMeta($trd_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta trd_unit_nm_META = createCommonMeta($trd_unit_nm, mcframe.commonMA.meta.MA_META.UNIT_NM);
	public static final MCMeta trd_unit_dec_place_META = createCommonMeta($trd_unit_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta trd_unit_rnd_typ_META = createCommonMeta($trd_unit_rnd_typ, mcframe.commonMA.meta.MA_META.RND_TYP);
	public static final MCMeta trd_unit_conv_base_qty_META = createCommonMeta($trd_unit_conv_base_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta trd_unit_conv_qty_META = createCommonMeta($trd_unit_conv_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta trd_unit_qty_p_META = createInnerRowMeta($trd_unit_qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta base_unit_cd_META = createCommonMeta($base_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta base_unit_nm_META = createCommonMeta($base_unit_nm, mcframe.commonMA.meta.MA_META.UNIT_NM);
	public static final MCMeta base_unit_dec_place_META = createCommonMeta($base_unit_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta base_unit_rnd_typ_META = createCommonMeta($base_unit_rnd_typ, mcframe.commonMA.meta.MA_META.RND_TYP);
	public static final MCMeta peg_no_META = createCommonMeta($peg_no, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta src_trd_unit_cd_META = createCommonMeta($src_trd_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta src_trd_unit_conv_qty_META = createCommonMeta($src_trd_unit_conv_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta src_trd_unit_conv_base_qty_META = createCommonMeta($src_trd_unit_conv_base_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta src_trd_unit_dec_place_META = createCommonMeta($src_trd_unit_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta src_trd_unit_rnd_typ_META = createCommonMeta($src_trd_unit_rnd_typ, mcframe.commonMA.meta.MA_META.RND_TYP);
	public static final MCMeta src_trd_unit_qty_META = createCommonMeta($src_trd_unit_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta src_trd_cur_amt_META = createCommonMeta($src_trd_cur_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta src_trd_cur_dscnt_amt_META = createCommonMeta($src_trd_cur_dscnt_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta src_trd_cur_onr_prov_amt_META = createCommonMeta($src_trd_cur_onr_prov_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta src_trd_cur_onr_prov_upri_META = createCommonMeta($src_trd_cur_onr_prov_upri, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta src_trd_cur_proc_amt_META = createCommonMeta($src_trd_cur_proc_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta src_trd_cur_proc_upri_META = createCommonMeta($src_trd_cur_proc_upri, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta src_trd_cur_tax_amt_META = createCommonMeta($src_trd_cur_tax_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta src_trd_cur_upri_META = createCommonMeta($src_trd_cur_upri, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta src_wtax_rate_META = createCommonMeta($src_wtax_rate, mcframe.commonMA.meta.MA_META.TAX_RATE);
	public static final MCMeta src_tax_rate_META = createCommonMeta($src_tax_rate, mcframe.commonMA.meta.MA_META.TAX_RATE);
	public static final MCMeta src_inc_tax_flg_META = createCommonMeta($src_inc_tax_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta base_unit_qty_p_META = createInnerRowMeta($base_unit_qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta base_unit_qty_bef_p_META = createInnerRowMeta($base_unit_qty_bef_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta po_qty_p_META = createInnerRowMeta($po_qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta arr_qty_p_META = createInnerRowMeta($arr_qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta purc_schd_qty_p_META = createInnerRowMeta($purc_schd_qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta purc_qty_p_META = createInnerRowMeta($purc_qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta accpt_dfct_qty_p_META = createInnerRowMeta($accpt_dfct_qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta abort_qty_p_META = createInnerRowMeta($abort_qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta purc_prgrs_META = createCommonMeta($purc_prgrs, mcframe.commonMA.meta.MA_META.PER);
	public static final MCMeta re_arr_flg_META = createCommonMeta($re_arr_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta re_arr_loc_wg_cd_META = createCommonMeta($re_arr_loc_wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta re_arr_loc_wg_nm_META = createCommonMeta($re_arr_loc_wg_nm, mcframe.commonMA.meta.MA_META.WG_NM);
	public static final MCMeta re_arr_loc_cd_META = createCommonMeta($re_arr_loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta re_arr_loc_nm_META = createCommonMeta($re_arr_loc_nm, mcframe.commonMA.meta.MA_META.LOC_NM);
	public static final MCMeta re_arr_str_ln_tgt_flg_META = createCommonMeta($re_arr_str_ln_tgt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta re_arr_str_ln_p_META = createInnerRowMeta($re_arr_str_ln_p, mcframe.clientMAUB.MAUBP5120.StrLnR.class);
	public static final MCMeta re_arr_loc_site_cd_META = createCommonMeta($re_arr_loc_site_cd, mcframe.commonMA.meta.MA_META.SITE_CD);
	public static final MCMeta re_arr_loc_cal_cd_META = createCommonMeta($re_arr_loc_cal_cd, mcframe.commonMA.meta.MA_META.CAL_CD);
	public static final MCMeta re_arr_loc_sppl_cd_META = createCommonMeta($re_arr_loc_sppl_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta re_arr_loc_sppl_cal_cd_META = createCommonMeta($re_arr_loc_sppl_cal_cd, mcframe.commonMA.meta.MA_META.CAL_CD);
	public static final MCMeta re_arr_qty_p_META = createInnerRowMeta($re_arr_qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta re_arr_rqst_tm_p_META = createInnerRowMeta($re_arr_rqst_tm_p, mcframe.clientMAUB.MAUBP5320.YmdHmR.class);
	public static final MCMeta re_arr_purc_schd_dt_META = createCommonMeta($re_arr_purc_schd_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta re_arr_sync_flg_META = createCommonMeta($re_arr_sync_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta ncv_flg_META = createCommonMeta($ncv_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta quality_typ_META = createCommonMeta($quality_typ, mcframe.commonMA.meta.MA_META.QUALITY_TYP);
	public static final MCMeta quality_typ_nm_META = createCommonMeta($quality_typ_nm, mcframe.commonMA.meta.MA_META.QUALITY_TYP_NM);
	public static final MCMeta gd_cd_META = createCommonMeta($gd_cd, mcframe.commonMA.meta.MA_META.STK_GD_CD);
	public static final MCMeta gd_nm_META = createCommonMeta($gd_nm, mcframe.commonMA.meta.MA_META.STK_GD_NM);
	public static final MCMeta sno_p_META = createInnerRowMeta($sno_p, mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.class);
	public static final MCMeta site_cd_META = createCommonMeta($site_cd, mcframe.commonMA.meta.MA_META.SITE_CD);
	public static final MCMeta site_nm_META = createCommonMeta($site_nm, mcframe.commonMA.meta.MA_META.SITE_NM);
	public static final MCMeta in_to_loc_wg_cd_META = createCommonMeta($in_to_loc_wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta in_to_loc_wg_nm_META = createCommonMeta($in_to_loc_wg_nm, mcframe.commonMA.meta.MA_META.WG_NM);
	public static final MCMeta in_to_loc_cd_META = createCommonMeta($in_to_loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta in_to_loc_nm_META = createCommonMeta($in_to_loc_nm, mcframe.commonMA.meta.MA_META.LOC_NM);
	public static final MCMeta outsrc_sppl_cd_META = createCommonMeta($outsrc_sppl_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta in_to_str_ln_tgt_flg_META = createCommonMeta($in_to_str_ln_tgt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta in_to_str_ln_p_META = createInnerRowMeta($in_to_str_ln_p, mcframe.clientMAUB.MAUBP5120.StrLnR.class);
	public static final MCMeta drct_dlv_typ_META = createCommonMeta($drct_dlv_typ, mcframe.commonMS.meta.MS_META.DRCT_DLV_TYP);
	public static final MCMeta drct_dlv_typ_nm_META = createCommonMeta($drct_dlv_typ_nm, mcframe.commonMS.meta.MS_META.DRCT_DLV_TYP_NM);
	public static final MCMeta slo_d_no_META = createCommonMeta($slo_d_no, mcframe.commonMA.meta.MA_META.SLO_D_NO);
	public static final MCMeta slo_no_META = createCommonMeta($slo_no, mcframe.commonMA.meta.MA_META.SLO_NO);
	public static final MCMeta cst_iv_flg_META = createCommonMeta($cst_iv_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta scst_cal_cd_META = createCommonMeta($scst_cal_cd, mcframe.commonMA.meta.MA_META.CAL_CD);
	public static final MCMeta dlv_p_META = createInnerRowMeta($dlv_p, mcframe.clientMAUB.MAUBP5150.DlvR.class);
	public static final MCMeta tdlv_p_META = createInnerRowMeta($tdlv_p, mcframe.clientMAUB.MAUBP5150.DlvR.class);
	public static final MCMeta lot_no_p_META = createInnerRowMeta($lot_no_p, mcframe.clientMSUB.MSUBP5030.LotNoR.class);
	public static final MCMeta bp_lot_no_META = createCommonMeta($bp_lot_no, mcframe.commonMA.meta.MA_META.BP_LOT_NO);
	public static final MCMeta bp_dlv_slip_no_META = createCommonMeta($bp_dlv_slip_no, mcframe.commonMA.meta.MA_META.BP_DLV_SLIP_NO);
	public static final MCMeta bp_dlv_slip_d_no_META = createCommonMeta($bp_dlv_slip_d_no, mcframe.commonMA.meta.MA_META.BP_DLV_SLIP_D_NO);
	public static final MCMeta slip_fr_valid_dt_META = createCommonMeta($slip_fr_valid_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta ver_no_p_META = createInnerRowMeta($ver_no_p, mcframe.clientMAUB.MAUBP5250.VerNoR.class);
	public static final MCMeta org_ver_no_META = createCommonMeta($org_ver_no, mcframe.commonMA.meta.MA_META.VER_NO);
	public static final MCMeta cont_fctr_flg_META = createCommonMeta($cont_fctr_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta cont_fctr_dec_place_META = createCommonMeta($cont_fctr_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta cont_fctr_rnd_typ_META = createCommonMeta($cont_fctr_rnd_typ, mcframe.commonMA.meta.MA_META.RND_TYP);
	public static final MCMeta purc_cont_qty_p_META = createInnerRowMeta($purc_cont_qty_p, mcframe.clientMAUB.MAUBP5300.PurcContQtyR.class);
	public static final MCMeta purc_cont_fctr_p_META = createInnerRowMeta($purc_cont_fctr_p, mcframe.clientMAUB.MAUBP5330.PurcContFctrR.class);
	public static final MCMeta cont_qty_p_META = createInnerRowMeta($cont_qty_p, mcframe.clientMAUB.MAUBP5260.ContQtyR.class);
	public static final MCMeta cont_fctr_unit_p_META = createInnerRowMeta($cont_fctr_unit_p, mcframe.clientMAUB.MAUBP5270.ContFctrUnitR.class);
	public static final MCMeta std_cont_fctr_p_META = createInnerRowMeta($std_cont_fctr_p, mcframe.clientMAUB.MAUBP5280.StdContFctrR.class);
	public static final MCMeta trd_cur_cd_META = createCommonMeta($trd_cur_cd, mcframe.commonMA.meta.MA_META.CUR_CD);
	public static final MCMeta trd_cur_nm_META = createCommonMeta($trd_cur_nm, mcframe.commonMA.meta.MA_META.CUR_NM);
	public static final MCMeta trd_cur_amt_dec_place_META = createCommonMeta($trd_cur_amt_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta trd_cur_upri_dec_place_META = createCommonMeta($trd_cur_upri_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta purc_dtl_upd_flg_META = createCommonMeta($purc_dtl_upd_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta temp_ap_flg_META = createCommonMeta($temp_ap_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta trd_upri_amt_p_META = createInnerRowMeta($trd_upri_amt_p, mcframe.clientMSUB.MSUBP5070.TrdUpriAmtR.class);
	public static final MCMeta repurc_obli_flg_META = createCommonMeta($repurc_obli_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta outsrc_upri_typ_META = createCommonMeta($outsrc_upri_typ, mcframe.commonMA.meta.MA_META.OUTSRC_UPRI_TYP);
	public static final MCMeta trd_cur_proc_upri_p_META = createInnerRowMeta($trd_cur_proc_upri_p, mcframe.clientMAUB.MAUBP5060.UpriR.class);
	public static final MCMeta trd_cur_proc_amt_p_META = createInnerRowMeta($trd_cur_proc_amt_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta trd_cur_onr_prov_upri_p_META = createInnerRowMeta($trd_cur_onr_prov_upri_p, mcframe.clientMAUB.MAUBP5060.UpriR.class);
	public static final MCMeta trd_cur_onr_prov_amt_p_META = createInnerRowMeta($trd_cur_onr_prov_amt_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta old_trd_cur_upri_META = createCommonMeta($old_trd_cur_upri, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta old_trd_cur_proc_upri_META = createCommonMeta($old_trd_cur_proc_upri, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta old_trd_cur_onr_prov_upri_META = createCommonMeta($old_trd_cur_onr_prov_upri, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta old_interim_flg_META = createCommonMeta($old_interim_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta xrate_inpt_flg_META = createCommonMeta($xrate_inpt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta xrate_cd_META = createCommonMeta($xrate_cd, mcframe.commonMA.meta.MA_META.XRATE_CD);
	public static final MCMeta xrate_p_META = createInnerRowMeta($xrate_p, mcframe.clientMAUB.MAUBP5390.XrateR.class);
	public static final MCMeta src_xrate_META = createCommonMeta($src_xrate, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta xrate_rnd_typ_META = createCommonMeta($xrate_rnd_typ, mcframe.commonMA.meta.MA_META.RND_TYP);
	public static final MCMeta base_cur_cd_META = createCommonMeta($base_cur_cd, mcframe.commonMA.meta.MA_META.CUR_CD);
	public static final MCMeta base_cur_nm_META = createCommonMeta($base_cur_nm, mcframe.commonMA.meta.MA_META.CUR_NM);
	public static final MCMeta base_cur_amt_dec_place_META = createCommonMeta($base_cur_amt_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta base_cur_upri_dec_place_META = createCommonMeta($base_cur_upri_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta base_cur_upri_p_META = createInnerRowMeta($base_cur_upri_p, mcframe.clientMAUB.MAUBP5060.UpriR.class);
	public static final MCMeta base_cur_amt_p_META = createInnerRowMeta($base_cur_amt_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta base_cur_inc_tax_amt_p_META = createInnerRowMeta($base_cur_inc_tax_amt_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta base_cur_tax_amt_p_META = createInnerRowMeta($base_cur_tax_amt_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta base_cur_dscnt_amt_p_META = createInnerRowMeta($base_cur_dscnt_amt_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta base_cur_proc_upri_p_META = createInnerRowMeta($base_cur_proc_upri_p, mcframe.clientMAUB.MAUBP5060.UpriR.class);
	public static final MCMeta base_cur_proc_amt_p_META = createInnerRowMeta($base_cur_proc_amt_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta base_cur_onr_prov_upri_p_META = createInnerRowMeta($base_cur_onr_prov_upri_p, mcframe.clientMAUB.MAUBP5060.UpriR.class);
	public static final MCMeta base_cur_onr_prov_amt_p_META = createInnerRowMeta($base_cur_onr_prov_amt_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta ptax_xrate_inpt_flg_META = createCommonMeta($ptax_xrate_inpt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta prax_xrate_p_META = createInnerRowMeta($prax_xrate_p, mcframe.clientMAUB.MAUBP5390.XrateR.class);
	public static final MCMeta src_ptax_xrate_META = createCommonMeta($src_ptax_xrate, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta ptax_cur_cd_META = createCommonMeta($ptax_cur_cd, mcframe.commonMA.meta.MA_META.CUR_CD);
	public static final MCMeta ptax_cur_nm_META = createCommonMeta($ptax_cur_nm, mcframe.commonMA.meta.MA_META.CUR_NM);
	public static final MCMeta ptax_cur_amt_dec_place_META = createCommonMeta($ptax_cur_amt_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta ptax_cur_upri_dec_place_META = createCommonMeta($ptax_cur_upri_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta ptax_dt_META = createCommonMeta($ptax_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta ptax_cur_upri_p_META = createInnerRowMeta($ptax_cur_upri_p, mcframe.clientMAUB.MAUBP5060.UpriR.class);
	public static final MCMeta ptax_cur_amt_p_META = createInnerRowMeta($ptax_cur_amt_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta ptax_cur_tax_amt_p_META = createInnerRowMeta($ptax_cur_tax_amt_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta ptax_cur_inc_tax_amt_p_META = createInnerRowMeta($ptax_cur_inc_tax_amt_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta ptax_cur_dscnt_amt_p_META = createInnerRowMeta($ptax_cur_dscnt_amt_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta ptax_cur_proc_upri_p_META = createInnerRowMeta($ptax_cur_proc_upri_p, mcframe.clientMAUB.MAUBP5060.UpriR.class);
	public static final MCMeta ptax_cur_proc_amt_p_META = createInnerRowMeta($ptax_cur_proc_amt_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta ptax_cur_onr_prov_upri_p_META = createInnerRowMeta($ptax_cur_onr_prov_upri_p, mcframe.clientMAUB.MAUBP5060.UpriR.class);
	public static final MCMeta ptax_cur_onr_prov_amt_p_META = createInnerRowMeta($ptax_cur_onr_prov_amt_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta wtax_rate_META = createCommonMeta($wtax_rate, mcframe.commonMA.meta.MA_META.WTAX_RATE);
	public static final MCMeta wtax_amt_p_META = createInnerRowMeta($wtax_amt_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta wtax_rnd_typ_META = createCommonMeta($wtax_rnd_typ, mcframe.commonMA.meta.MA_META.RND_TYP);
	public static final MCMeta sppl_itm_cd_META = createCommonMeta($sppl_itm_cd, mcframe.commonMA.meta.MA_META.BP_ITM_CD);
	public static final MCMeta sppl_itm_nm_META = createCommonMeta($sppl_itm_nm, mcframe.commonMA.meta.MA_META.BP_ITM_NM);
	public static final MCMeta cst_itm_cd_META = createCommonMeta($cst_itm_cd, mcframe.commonMA.meta.MA_META.BP_ITM_CD);
	public static final MCMeta cst_itm_nm_META = createCommonMeta($cst_itm_nm, mcframe.commonMA.meta.MA_META.BP_ITM_NM);
	public static final MCMeta purc_rsn_cd_META = createCommonMeta($purc_rsn_cd, mcframe.commonMA.meta.MA_META.BIZ_RSN_CD);
	public static final MCMeta purc_rsn_nm_META = createCommonMeta($purc_rsn_nm, mcframe.commonMA.meta.MA_META.BIZ_RSN_NM);
	public static final MCMeta xpns_purc_flg_META = createCommonMeta($xpns_purc_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta purc_id_typ_META = createCommonMeta($purc_id_typ, mcframe.commonMA.meta.MA_META.PURC_ID_TYP);
	public static final MCMeta purc_id_typ_nm_META = createCommonMeta($purc_id_typ_nm, mcframe.commonMA.meta.MA_META.PURC_ID_TYP_NM);
	public static final MCMeta stk_insp_typ_META = createCommonMeta($stk_insp_typ, mcframe.commonMS.meta.MS_META.STK_INSP_TYP);
	public static final MCMeta stk_insp_typ_nm_META = createCommonMeta($stk_insp_typ_nm, mcframe.commonMS.meta.MS_META.STK_INSP_TYP_NM);
	public static final MCMeta stk_id_typ_META = createCommonMeta($stk_id_typ, mcframe.commonMS.meta.MS_META.STK_ID_TYP);
	public static final MCMeta stk_id_typ_nm_META = createCommonMeta($stk_id_typ_nm, mcframe.commonMS.meta.MS_META.STK_ID_TYP_NM);
	public static final MCMeta ap_dpt_cd_META = createCommonMeta($ap_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta ap_dpt_nm_META = createCommonMeta($ap_dpt_nm, mcframe.commonMA.meta.MA_META.DPT_NM);
	public static final MCMeta mst_ap_dpt_cd_META = createCommonMeta($mst_ap_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta pay_crryovr_times_META = createCommonMeta($pay_crryovr_times, mcframe.commonMA.meta.MA_META.CRRYOVR_TIMES);
	public static final MCMeta usr_dpt_p_META = createInnerRowMeta($usr_dpt_p, mcframe.clientMAUB.MAUBP5230.UsrDptR.class);
	public static final MCMeta ap_dpt_flg_META = createCommonMeta($ap_dpt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta purc_dpt_wg_cd_META = createCommonMeta($purc_dpt_wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta purc_dpt_wg_nm_META = createCommonMeta($purc_dpt_wg_nm, mcframe.commonMA.meta.MA_META.WG_NM);
	public static final MCMeta bditm_p_META = createInnerRowMeta($bditm_p, mcframe.clientMSUB.MSUBP5040.BdItemR.class);
	public static final MCMeta bd_lot_mng_typ_META = createCommonMeta($bd_lot_mng_typ, mcframe.commonMA.meta.MA_META.LOT_MNG_TYP);
	public static final MCMeta bd_sublot_mng_typ_META = createCommonMeta($bd_sublot_mng_typ, mcframe.commonMA.meta.MA_META.LOT_MNG_TYP);
	public static final MCMeta bd_lot_no_typ_META = createCommonMeta($bd_lot_no_typ, mcframe.commonMA.meta.MA_META.LOT_NO_TYP);
	public static final MCMeta bd_sublot_no_typ_META = createCommonMeta($bd_sublot_no_typ, mcframe.commonMA.meta.MA_META.LOT_NO_TYP);
	public static final MCMeta bd_sno1_mng_typ_META = createCommonMeta($bd_sno1_mng_typ, mcframe.commonMA.meta.MA_META.SNO_MNG_TYP);
	public static final MCMeta bd_sno2_mng_typ_META = createCommonMeta($bd_sno2_mng_typ, mcframe.commonMA.meta.MA_META.SNO_MNG_TYP);
	public static final MCMeta bd_sno3_mng_typ_META = createCommonMeta($bd_sno3_mng_typ, mcframe.commonMA.meta.MA_META.SNO_MNG_TYP);
	public static final MCMeta bd_sno4_mng_typ_META = createCommonMeta($bd_sno4_mng_typ, mcframe.commonMA.meta.MA_META.SNO_MNG_TYP);
	public static final MCMeta s_sub_char1_META = createCommonMeta($s_sub_char1, mcframe.commonMS.meta.MS_META.PURC_SCHD_SUB_CHAR1);
	public static final MCMeta s_sub_char2_META = createCommonMeta($s_sub_char2, mcframe.commonMS.meta.MS_META.PURC_SCHD_SUB_CHAR2);
	public static final MCMeta s_sub_char3_META = createCommonMeta($s_sub_char3, mcframe.commonMS.meta.MS_META.PURC_SCHD_SUB_CHAR3);
	public static final MCMeta trd_rmrks_META = createCommonMeta($trd_rmrks, mcframe.commonMA.meta.MA_META.TRD_RMRKS);
	public static final MCMeta intr_rmrks_META = createCommonMeta($intr_rmrks, mcframe.commonMS.meta.MS_META.PURC_ACT_INTR_RMRKS);
	public static final MCMeta po_print_rmrks_META = createCommonMeta($po_print_rmrks, mcframe.commonMS.meta.MS_META.PO_PRINT_RMRKS);
	public static final MCMeta sub_char1_META = createCommonMeta($sub_char1, mcframe.commonMS.meta.MS_META.PURC_ACT_SUB_CHAR1);
	public static final MCMeta sub_char2_META = createCommonMeta($sub_char2, mcframe.commonMS.meta.MS_META.PURC_ACT_SUB_CHAR2);
	public static final MCMeta sub_char3_META = createCommonMeta($sub_char3, mcframe.commonMS.meta.MS_META.PURC_ACT_SUB_CHAR3);
	public static final MCMeta tterm_cd1_META = createCommonMeta($tterm_cd1, mcframe.commonMA.meta.MA_META.TTERM_CD);
	public static final MCMeta tterm_nm1_META = createCommonMeta($tterm_nm1, mcframe.commonMA.meta.MA_META.TTERM_NM);
	public static final MCMeta tterm_rmrks1_META = createCommonMeta($tterm_rmrks1, mcframe.commonMS.meta.MS_META.TTERM_RMRKS1);
	public static final MCMeta tterm_cd2_META = createCommonMeta($tterm_cd2, mcframe.commonMA.meta.MA_META.TTERM_CD);
	public static final MCMeta tterm_nm2_META = createCommonMeta($tterm_nm2, mcframe.commonMA.meta.MA_META.TTERM_NM);
	public static final MCMeta tterm_rmrks2_META = createCommonMeta($tterm_rmrks2, mcframe.commonMS.meta.MS_META.TTERM_RMRKS2);
	public static final MCMeta tterm_cd3_META = createCommonMeta($tterm_cd3, mcframe.commonMA.meta.MA_META.TTERM_CD);
	public static final MCMeta tterm_nm3_META = createCommonMeta($tterm_nm3, mcframe.commonMA.meta.MA_META.TTERM_NM);
	public static final MCMeta tterm_rmrks3_META = createCommonMeta($tterm_rmrks3, mcframe.commonMS.meta.MS_META.TTERM_RMRKS3);
	public static final MCMeta trd_d_rmrks_META = createCommonMeta($trd_d_rmrks, mcframe.commonMA.meta.MA_META.TRD_D_RMRKS);
	public static final MCMeta intr_d_rmrks_META = createCommonMeta($intr_d_rmrks, mcframe.commonMS.meta.MS_META.PURC_ACT_D_INTR_RMRKS);
	public static final MCMeta dtl_sub_char1_META = createCommonMeta($dtl_sub_char1, mcframe.commonMS.meta.MS_META.PURC_ACT_D_SUB_CHAR1);
	public static final MCMeta dtl_sub_char2_META = createCommonMeta($dtl_sub_char2, mcframe.commonMS.meta.MS_META.PURC_ACT_D_SUB_CHAR2);
	public static final MCMeta dtl_sub_char3_META = createCommonMeta($dtl_sub_char3, mcframe.commonMS.meta.MS_META.PURC_ACT_D_SUB_CHAR3);
	public static final MCMeta po_print_d_rmrks_META = createCommonMeta($po_print_d_rmrks, mcframe.commonMS.meta.MS_META.PO_PRINT_D_RMRKS);
	public static final MCMeta edi_flg_META = createCommonMeta($edi_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta edi_bp_dlv_slip_no_META = createCommonMeta($edi_bp_dlv_slip_no, mcframe.commonMA.meta.MA_META.BP_DLV_SLIP_NO);
	public static final MCMeta edi_bp_dlv_slip_d_no_META = createCommonMeta($edi_bp_dlv_slip_d_no, mcframe.commonMA.meta.MA_META.BP_DLV_SLIP_D_NO);
	public static final MCMeta disp_seq_META = createCommonMeta($disp_seq, mcframe.commonMA.meta.MA_META.DISP_SEQ);
	public static final MCMeta ins_usr_id_META = createCommonMeta($ins_usr_id, mcframe.commonMA.meta.MA_META.FCM_USR_ID);
	public static final MCMeta ins_usr_nm_META = createCommonMeta($ins_usr_nm, mcframe.commonMA.meta.MA_META.FCM_USR_NM);
	public static final MCMeta ins_func_id_META = createCommonMeta($ins_func_id, mcframe.commonMA.meta.MA_META.FUNC_ID);
	public static final MCMeta ins_func_nm_META = createCommonMeta($ins_func_nm, mcframe.commonMA.meta.MA_META.FUNC_NM);
	public static final MCMeta ins_ts_META = createCommonMeta($ins_ts, mcframe.commonMA.meta.MA_META.SYS_TS);
	public static final MCMeta upd_usr_id_META = createCommonMeta($upd_usr_id, mcframe.commonMA.meta.MA_META.FCM_USR_ID);
	public static final MCMeta upd_usr_nm_META = createCommonMeta($upd_usr_nm, mcframe.commonMA.meta.MA_META.FCM_USR_NM);
	public static final MCMeta upd_func_id_META = createCommonMeta($upd_func_id, mcframe.commonMA.meta.MA_META.FUNC_ID);
	public static final MCMeta upd_func_nm_META = createCommonMeta($upd_func_nm, mcframe.commonMA.meta.MA_META.FUNC_NM);
	public static final MCMeta upd_ts_META = createCommonMeta($upd_ts, mcframe.commonMA.meta.MA_META.SYS_TS);
	public static final MCMeta upd_srv_req_no_META = createCommonMeta($upd_srv_req_no, mcframe.commonMA.meta.MA_META.SRV_REQ_NO);
	public static final MCMeta arr_pr_upd_cntr_META = createCommonMeta($arr_pr_upd_cntr, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta purc_act_upd_cntr_META = createCommonMeta($purc_act_upd_cntr, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta rcpt_iv_upd_cntr_META = createCommonMeta($rcpt_iv_upd_cntr, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta rts_msg_p_META = createInnerRowMeta($rts_msg_p, mcframe.clientMAUB.MAUBP5310.RtnMsgR.class);
	public static final MCMeta db_trd_unit_cd_META = createCommonMeta($db_trd_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta db_trd_unit_conv_qty_META = createCommonMeta($db_trd_unit_conv_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta db_trd_unit_conv_base_qty_META = createCommonMeta($db_trd_unit_conv_base_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta db_trd_unit_dec_place_META = createCommonMeta($db_trd_unit_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta db_trd_unit_rnd_typ_META = createCommonMeta($db_trd_unit_rnd_typ, mcframe.commonMA.meta.MA_META.RND_TYP);
	public static final MCMeta db_trd_unit_qty_META = createCommonMeta($db_trd_unit_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta db_trd_cur_amt_META = createCommonMeta($db_trd_cur_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta db_trd_cur_dscnt_amt_META = createCommonMeta($db_trd_cur_dscnt_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta db_trd_cur_onr_prov_amt_META = createCommonMeta($db_trd_cur_onr_prov_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta db_trd_cur_onr_prov_upri_META = createCommonMeta($db_trd_cur_onr_prov_upri, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta db_trd_cur_proc_amt_META = createCommonMeta($db_trd_cur_proc_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta db_trd_cur_proc_upri_META = createCommonMeta($db_trd_cur_proc_upri, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta db_trd_cur_tax_amt_META = createCommonMeta($db_trd_cur_tax_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta db_trd_cur_upri_META = createCommonMeta($db_trd_cur_upri, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta db_wtax_rate_META = createCommonMeta($db_wtax_rate, mcframe.commonMA.meta.MA_META.TAX_RATE);
	public static final MCMeta db_tax_rate_META = createCommonMeta($db_tax_rate, mcframe.commonMA.meta.MA_META.TAX_RATE);
	public static final MCMeta db_inc_tax_flg_META = createCommonMeta($db_inc_tax_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sls_sync_flg_META = createCommonMeta($sls_sync_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta purc_act_qty_META = createCommonMeta($purc_act_qty, mcframe.commonMA.meta.MA_META.QTY);

	protected static final ConstMetaList<RsltR> constMetas = new ConstMetaList<RsltR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			check_META,
			hdr_readonly_flg_META,
			bef_abort_flg_META,
			abort_flg_META,
			trd_cd_META,
			trd_nm_META,
			trd_ptn_typ_META,
			arr_ptn_typ_META,
			arr_ptn_typ_nm_META,
			sync_flg_META,
			purc_basis_typ_META,
			purc_basis_typ_nm_META,
			purc_ddlv_flg_META,
			arr_skip_flg_META,
			purc_dt_META,
			ac_ym_META,
			ac_dt_p_META,
			can_ac_dt_p_META,
			pay_basis_dt_META,
			pay_schd_dt_META,
			purc_schd_dt_META,
			dlv_rqst_dt_META,
			arr_schd_dt_META,
			schd_sync_flg_META,
			aprv_no_META,
			aprv_sts_typ_META,
			aprv_sts_typ_nm_META,
			po_no_META,
			po_d_no_META,
			po_schd_src_typ_META,
			po_schd_src_typ_nm_META,
			po_schd_src_no_META,
			rcpt_iv_no_META,
			rcpt_iv_mng_no_META,
			rcpt_iv_d_no_META,
			mfg_inst_no_META,
			mfg_loc_cd_META,
			bom_ptn_META,
			purc_schd_no_META,
			purc_act_no_META,
			purc_act_d_no_META,
			purc_act_seq_META,
			purc_act_d_seq_META,
			arr_schd_no_META,
			arr_pr_no_META,
			arr_act_no_META,
			from_gd_cd_META,
			tmp_gd_cd_META,
			tmp_quality_typ_META,
			tmp_stk_insp_typ_META,
			tmp_stk_id_typ_META,
			gi_wg_cd_META,
			gi_loc_cd_META,
			gi_str_ln_cd_META,
			gi_unit_cd_META,
			multi_io_flg_META,
			par_purc_act_d_no_META,
			arr_split_flg_META,
			asset_mng_typ_META,
			asset_mng_typ_nm_META,
			itm_typ_META,
			itm_typ_nm_META,
			itm_typ_d_cd_META,
			itm_typ_d_nm_META,
			itm_p_META,
			iv_itm_nm_META,
			ver_flg_META,
			lot_mng_typ_META,
			sublot_mng_typ_META,
			lot_no_typ_META,
			sublot_no_typ_META,
			sno1_mng_typ_META,
			sno2_mng_typ_META,
			sno3_mng_typ_META,
			sno4_mng_typ_META,
			stk_mng_typ_META,
			sundry_itm_flg_META,
			bp_lot_flg_META,
			dscnt_itm_flg_META,
			itm_pay_crryovr_times_META,
			itm_purc_upri_cng_flg_META,
			itm_grp_p_META,
			sppl_cd_META,
			sppl_nm_META,
			pay_spot_flg_META,
			ap_cred_cd_META,
			purc_slip_each_lot_typ_META,
			purc_upri_cng_flg_META,
			sppl_iv_flg_META,
			prnt_lcl_cd_META,
			purc_amt_rnd_typ_META,
			purc_tax_rnd_typ_META,
			purc_tax_calc_typ_META,
			sppl_addr_p_META,
			subcon_flg_META,
			sppl_grp_p_META,
			asppl_cd_META,
			asppl_nm_META,
			outsrc_flg_META,
			maker_cd_META,
			maker_nm_META,
			accpt_dfct_flg_META,
			trd_unit_cd_META,
			trd_unit_nm_META,
			trd_unit_dec_place_META,
			trd_unit_rnd_typ_META,
			trd_unit_conv_base_qty_META,
			trd_unit_conv_qty_META,
			trd_unit_qty_p_META,
			base_unit_cd_META,
			base_unit_nm_META,
			base_unit_dec_place_META,
			base_unit_rnd_typ_META,
			peg_no_META,
			src_trd_unit_cd_META,
			src_trd_unit_conv_qty_META,
			src_trd_unit_conv_base_qty_META,
			src_trd_unit_dec_place_META,
			src_trd_unit_rnd_typ_META,
			src_trd_unit_qty_META,
			src_trd_cur_amt_META,
			src_trd_cur_dscnt_amt_META,
			src_trd_cur_onr_prov_amt_META,
			src_trd_cur_onr_prov_upri_META,
			src_trd_cur_proc_amt_META,
			src_trd_cur_proc_upri_META,
			src_trd_cur_tax_amt_META,
			src_trd_cur_upri_META,
			src_wtax_rate_META,
			src_tax_rate_META,
			src_inc_tax_flg_META,
			base_unit_qty_p_META,
			base_unit_qty_bef_p_META,
			po_qty_p_META,
			arr_qty_p_META,
			purc_schd_qty_p_META,
			purc_qty_p_META,
			accpt_dfct_qty_p_META,
			abort_qty_p_META,
			purc_prgrs_META,
			re_arr_flg_META,
			re_arr_loc_wg_cd_META,
			re_arr_loc_wg_nm_META,
			re_arr_loc_cd_META,
			re_arr_loc_nm_META,
			re_arr_str_ln_tgt_flg_META,
			re_arr_str_ln_p_META,
			re_arr_loc_site_cd_META,
			re_arr_loc_cal_cd_META,
			re_arr_loc_sppl_cd_META,
			re_arr_loc_sppl_cal_cd_META,
			re_arr_qty_p_META,
			re_arr_rqst_tm_p_META,
			re_arr_purc_schd_dt_META,
			re_arr_sync_flg_META,
			ncv_flg_META,
			quality_typ_META,
			quality_typ_nm_META,
			gd_cd_META,
			gd_nm_META,
			sno_p_META,
			site_cd_META,
			site_nm_META,
			in_to_loc_wg_cd_META,
			in_to_loc_wg_nm_META,
			in_to_loc_cd_META,
			in_to_loc_nm_META,
			outsrc_sppl_cd_META,
			in_to_str_ln_tgt_flg_META,
			in_to_str_ln_p_META,
			drct_dlv_typ_META,
			drct_dlv_typ_nm_META,
			slo_d_no_META,
			slo_no_META,
			cst_iv_flg_META,
			scst_cal_cd_META,
			dlv_p_META,
			tdlv_p_META,
			lot_no_p_META,
			bp_lot_no_META,
			bp_dlv_slip_no_META,
			bp_dlv_slip_d_no_META,
			slip_fr_valid_dt_META,
			ver_no_p_META,
			org_ver_no_META,
			cont_fctr_flg_META,
			cont_fctr_dec_place_META,
			cont_fctr_rnd_typ_META,
			purc_cont_qty_p_META,
			purc_cont_fctr_p_META,
			cont_qty_p_META,
			cont_fctr_unit_p_META,
			std_cont_fctr_p_META,
			trd_cur_cd_META,
			trd_cur_nm_META,
			trd_cur_amt_dec_place_META,
			trd_cur_upri_dec_place_META,
			purc_dtl_upd_flg_META,
			temp_ap_flg_META,
			trd_upri_amt_p_META,
			repurc_obli_flg_META,
			outsrc_upri_typ_META,
			trd_cur_proc_upri_p_META,
			trd_cur_proc_amt_p_META,
			trd_cur_onr_prov_upri_p_META,
			trd_cur_onr_prov_amt_p_META,
			old_trd_cur_upri_META,
			old_trd_cur_proc_upri_META,
			old_trd_cur_onr_prov_upri_META,
			old_interim_flg_META,
			xrate_inpt_flg_META,
			xrate_cd_META,
			xrate_p_META,
			src_xrate_META,
			xrate_rnd_typ_META,
			base_cur_cd_META,
			base_cur_nm_META,
			base_cur_amt_dec_place_META,
			base_cur_upri_dec_place_META,
			base_cur_upri_p_META,
			base_cur_amt_p_META,
			base_cur_inc_tax_amt_p_META,
			base_cur_tax_amt_p_META,
			base_cur_dscnt_amt_p_META,
			base_cur_proc_upri_p_META,
			base_cur_proc_amt_p_META,
			base_cur_onr_prov_upri_p_META,
			base_cur_onr_prov_amt_p_META,
			ptax_xrate_inpt_flg_META,
			prax_xrate_p_META,
			src_ptax_xrate_META,
			ptax_cur_cd_META,
			ptax_cur_nm_META,
			ptax_cur_amt_dec_place_META,
			ptax_cur_upri_dec_place_META,
			ptax_dt_META,
			ptax_cur_upri_p_META,
			ptax_cur_amt_p_META,
			ptax_cur_tax_amt_p_META,
			ptax_cur_inc_tax_amt_p_META,
			ptax_cur_dscnt_amt_p_META,
			ptax_cur_proc_upri_p_META,
			ptax_cur_proc_amt_p_META,
			ptax_cur_onr_prov_upri_p_META,
			ptax_cur_onr_prov_amt_p_META,
			wtax_rate_META,
			wtax_amt_p_META,
			wtax_rnd_typ_META,
			sppl_itm_cd_META,
			sppl_itm_nm_META,
			cst_itm_cd_META,
			cst_itm_nm_META,
			purc_rsn_cd_META,
			purc_rsn_nm_META,
			xpns_purc_flg_META,
			purc_id_typ_META,
			purc_id_typ_nm_META,
			stk_insp_typ_META,
			stk_insp_typ_nm_META,
			stk_id_typ_META,
			stk_id_typ_nm_META,
			ap_dpt_cd_META,
			ap_dpt_nm_META,
			mst_ap_dpt_cd_META,
			pay_crryovr_times_META,
			usr_dpt_p_META,
			ap_dpt_flg_META,
			purc_dpt_wg_cd_META,
			purc_dpt_wg_nm_META,
			bditm_p_META,
			bd_lot_mng_typ_META,
			bd_sublot_mng_typ_META,
			bd_lot_no_typ_META,
			bd_sublot_no_typ_META,
			bd_sno1_mng_typ_META,
			bd_sno2_mng_typ_META,
			bd_sno3_mng_typ_META,
			bd_sno4_mng_typ_META,
			s_sub_char1_META,
			s_sub_char2_META,
			s_sub_char3_META,
			trd_rmrks_META,
			intr_rmrks_META,
			po_print_rmrks_META,
			sub_char1_META,
			sub_char2_META,
			sub_char3_META,
			tterm_cd1_META,
			tterm_nm1_META,
			tterm_rmrks1_META,
			tterm_cd2_META,
			tterm_nm2_META,
			tterm_rmrks2_META,
			tterm_cd3_META,
			tterm_nm3_META,
			tterm_rmrks3_META,
			trd_d_rmrks_META,
			intr_d_rmrks_META,
			dtl_sub_char1_META,
			dtl_sub_char2_META,
			dtl_sub_char3_META,
			po_print_d_rmrks_META,
			edi_flg_META,
			edi_bp_dlv_slip_no_META,
			edi_bp_dlv_slip_d_no_META,
			disp_seq_META,
			ins_usr_id_META,
			ins_usr_nm_META,
			ins_func_id_META,
			ins_func_nm_META,
			ins_ts_META,
			upd_usr_id_META,
			upd_usr_nm_META,
			upd_func_id_META,
			upd_func_nm_META,
			upd_ts_META,
			upd_srv_req_no_META,
			arr_pr_upd_cntr_META,
			purc_act_upd_cntr_META,
			rcpt_iv_upd_cntr_META,
			rts_msg_p_META,
			db_trd_unit_cd_META,
			db_trd_unit_conv_qty_META,
			db_trd_unit_conv_base_qty_META,
			db_trd_unit_dec_place_META,
			db_trd_unit_rnd_typ_META,
			db_trd_unit_qty_META,
			db_trd_cur_amt_META,
			db_trd_cur_dscnt_amt_META,
			db_trd_cur_onr_prov_amt_META,
			db_trd_cur_onr_prov_upri_META,
			db_trd_cur_proc_amt_META,
			db_trd_cur_proc_upri_META,
			db_trd_cur_tax_amt_META,
			db_trd_cur_upri_META,
			db_wtax_rate_META,
			db_tax_rate_META,
			db_inc_tax_flg_META,
			sls_sync_flg_META,
			purc_act_qty_META
		},
		new String[][]{
			{
				"ac_dt",
				"can_ac_dt_for_input",
				"can_ac_dt",
				"ac_dt_after_srch",
				"itm_cd",
				"itm_sub1",
				"itm_sub2",
				"itm_sub3",
				"itm_nm",
				"itm_grp_cd1",
				"itm_grp_nm1",
				"itm_grp_cd2",
				"itm_grp_nm2",
				"itm_grp_cd3",
				"itm_grp_nm3",
				"itm_grp_cd4",
				"itm_grp_nm4",
				"itm_grp_cd5",
				"itm_grp_nm5",
				"itm_grp_cd6",
				"itm_grp_nm6",
				"itm_grp_cd7",
				"itm_grp_nm7",
				"itm_grp_cd8",
				"itm_grp_nm8",
				"itm_grp_cd9",
				"itm_grp_nm9",
				"itm_grp_cd10",
				"itm_grp_nm10",
				"sppl_cntry_cd",
				"sppl_cntry_nm",
				"sppl_zip_cd",
				"sppl_addr1",
				"sppl_addr2",
				"sppl_addr3",
				"sppl_addr4",
				"sppl_tel",
				"sppl_fax",
				"sppl_cntct_dpt",
				"sppl_cntct_psn",
				"sppl_grp_cd1",
				"sppl_grp_nm1",
				"sppl_grp_cd2",
				"sppl_grp_nm2",
				"sppl_grp_cd3",
				"sppl_grp_nm3",
				"sppl_grp_cd4",
				"sppl_grp_nm4",
				"sppl_grp_cd5",
				"sppl_grp_nm5",
				"sppl_grp_cd6",
				"sppl_grp_nm6",
				"sppl_grp_cd7",
				"sppl_grp_nm7",
				"sppl_grp_cd8",
				"sppl_grp_nm8",
				"sppl_grp_cd9",
				"sppl_grp_nm9",
				"sppl_grp_cd10",
				"sppl_grp_nm10",
				"trd_unit_qty",
				"base_unit_qty",
				"base_unit_qty_bef",
				"po_qty",
				"arr_qty",
				"purc_schd_qty",
				"purc_qty",
				"accpt_dfct_qty",
				"abort_qty",
				"re_arr_str_ln_cd",
				"re_arr_str_ln_nm",
				"re_arr_str_ln_cd_none_flg",
				"trd_unit_re_arr_qty",
				"re_arr_rqst_dt",
				"re_arr_rqst_hm",
				"sno1",
				"sno2",
				"sno3",
				"sno4",
				"wrk_no",
				"wrk_nm",
				"in_to_str_ln_cd",
				"in_to_str_ln_nm",
				"in_to_str_ln_cd_none_flg",
				"dlv_cd",
				"dlv_nm",
				"dlv_sundry_flg",
				"dlv_cntry_cd",
				"dlv_cntry_nm",
				"dlv_zip_cd",
				"dlv_addr1",
				"dlv_addr2",
				"dlv_addr3",
				"dlv_addr4",
				"dlv_tel",
				"dlv_fax",
				"tdlv_cd",
				"tdlv_nm",
				"tdlv_sundry_flg",
				"tdlv_cntry_cd",
				"tdlv_cntry_nm",
				"tdlv_zip_cd",
				"tdlv_addr1",
				"tdlv_addr2",
				"tdlv_addr3",
				"tdlv_addr4",
				"tdlv_tel",
				"tdlv_fax",
				"tdlv_cntct_dpt",
				"tdlv_cntct_psn",
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
				"trd_cur_proc_upri",
				"trd_cur_proc_amt",
				"trd_cur_proc_tax_amt",
				"trd_cur_onr_prov_upri",
				"trd_cur_onr_prov_amt",
				"trd_cur_onr_prov_tax_amt",
				"xrate",
				"base_cur_upri",
				"base_cur_amt",
				"base_cur_inc_tax_amt",
				"base_cur_tax_amt",
				"base_cur_dscnt_amt",
				"base_cur_proc_upri",
				"base_cur_proc_amt",
				"base_cur_proc_tax_amt",
				"base_cur_onr_prov_upri",
				"base_cur_onr_prov_amt",
				"base_cur_onr_prov_tax_amt",
				"ptax_xrate",
				"ptax_cur_upri",
				"ptax_cur_amt",
				"ptax_cur_tax_amt",
				"ptax_cur_inc_tax_amt",
				"ptax_cur_dscnt_amt",
				"ptax_cur_proc_upri",
				"ptax_cur_proc_amt",
				"ptax_cur_proc_tax_amt",
				"ptax_cur_onr_prov_upri",
				"ptax_cur_onr_prov_amt",
				"ptax_cur_onr_prov_tax_amt",
				"wtax_amt",
				"purc_usr_cd",
				"purc_usr_nm",
				"purc_dpt_cd",
				"purc_dpt_nm",
				"bd_dpt_cd",
				"bd_dpt_nm",
				"bd_itm_cd",
				"bd_itm_sub1",
				"bd_itm_sub2",
				"bd_itm_sub3",
				"bd_itm_nm",
				"bd_lot_no",
				"bd_sublot_no",
				"bd_sno1",
				"bd_sno2",
				"bd_sno3",
				"bd_sno4",
				"bd_bp_cd",
				"bd_bp_nm",
				"bd_loc_cd",
				"bd_loc_nm",
				"bd_ctg_cd",
				"bd_ctg_nm",
				"bd_oper_cd",
				"bd_oper_nm",
				"bd_iv_no",
				"bd_slo_no",
				"bd_po_no",
				"rtn_sts_typ",
				"rtn_sts_typ_nm",
				"msg_id",
				"msg"
			},
			{
				$ac_dt,
				$can_ac_dt_for_input,
				$can_ac_dt,
				$ac_dt_after_srch,
				$itm_cd,
				$itm_sub1,
				$itm_sub2,
				$itm_sub3,
				$itm_nm,
				$itm_grp_cd1,
				$itm_grp_nm1,
				$itm_grp_cd2,
				$itm_grp_nm2,
				$itm_grp_cd3,
				$itm_grp_nm3,
				$itm_grp_cd4,
				$itm_grp_nm4,
				$itm_grp_cd5,
				$itm_grp_nm5,
				$itm_grp_cd6,
				$itm_grp_nm6,
				$itm_grp_cd7,
				$itm_grp_nm7,
				$itm_grp_cd8,
				$itm_grp_nm8,
				$itm_grp_cd9,
				$itm_grp_nm9,
				$itm_grp_cd10,
				$itm_grp_nm10,
				$sppl_cntry_cd,
				$sppl_cntry_nm,
				$sppl_zip_cd,
				$sppl_addr1,
				$sppl_addr2,
				$sppl_addr3,
				$sppl_addr4,
				$sppl_tel,
				$sppl_fax,
				$sppl_cntct_dpt,
				$sppl_cntct_psn,
				$sppl_grp_cd1,
				$sppl_grp_nm1,
				$sppl_grp_cd2,
				$sppl_grp_nm2,
				$sppl_grp_cd3,
				$sppl_grp_nm3,
				$sppl_grp_cd4,
				$sppl_grp_nm4,
				$sppl_grp_cd5,
				$sppl_grp_nm5,
				$sppl_grp_cd6,
				$sppl_grp_nm6,
				$sppl_grp_cd7,
				$sppl_grp_nm7,
				$sppl_grp_cd8,
				$sppl_grp_nm8,
				$sppl_grp_cd9,
				$sppl_grp_nm9,
				$sppl_grp_cd10,
				$sppl_grp_nm10,
				$trd_unit_qty,
				$base_unit_qty,
				$base_unit_qty_bef,
				$po_qty,
				$arr_qty,
				$purc_schd_qty,
				$purc_qty,
				$accpt_dfct_qty,
				$abort_qty,
				$re_arr_str_ln_cd,
				$re_arr_str_ln_nm,
				$re_arr_str_ln_cd_none_flg,
				$trd_unit_re_arr_qty,
				$re_arr_rqst_dt,
				$re_arr_rqst_hm,
				$sno1,
				$sno2,
				$sno3,
				$sno4,
				$wrk_no,
				$wrk_nm,
				$in_to_str_ln_cd,
				$in_to_str_ln_nm,
				$in_to_str_ln_cd_none_flg,
				$dlv_cd,
				$dlv_nm,
				$dlv_sundry_flg,
				$dlv_cntry_cd,
				$dlv_cntry_nm,
				$dlv_zip_cd,
				$dlv_addr1,
				$dlv_addr2,
				$dlv_addr3,
				$dlv_addr4,
				$dlv_tel,
				$dlv_fax,
				$tdlv_cd,
				$tdlv_nm,
				$tdlv_sundry_flg,
				$tdlv_cntry_cd,
				$tdlv_cntry_nm,
				$tdlv_zip_cd,
				$tdlv_addr1,
				$tdlv_addr2,
				$tdlv_addr3,
				$tdlv_addr4,
				$tdlv_tel,
				$tdlv_fax,
				$tdlv_cntct_dpt,
				$tdlv_cntct_psn,
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
				$trd_cur_proc_upri,
				$trd_cur_proc_amt,
				$trd_cur_proc_tax_amt,
				$trd_cur_onr_prov_upri,
				$trd_cur_onr_prov_amt,
				$trd_cur_onr_prov_tax_amt,
				$xrate,
				$base_cur_upri,
				$base_cur_amt,
				$base_cur_inc_tax_amt,
				$base_cur_tax_amt,
				$base_cur_dscnt_amt,
				$base_cur_proc_upri,
				$base_cur_proc_amt,
				$base_cur_proc_tax_amt,
				$base_cur_onr_prov_upri,
				$base_cur_onr_prov_amt,
				$base_cur_onr_prov_tax_amt,
				$ptax_xrate,
				$ptax_cur_upri,
				$ptax_cur_amt,
				$ptax_cur_tax_amt,
				$ptax_cur_inc_tax_amt,
				$ptax_cur_dscnt_amt,
				$ptax_cur_proc_upri,
				$ptax_cur_proc_amt,
				$ptax_cur_proc_tax_amt,
				$ptax_cur_onr_prov_upri,
				$ptax_cur_onr_prov_amt,
				$ptax_cur_onr_prov_tax_amt,
				$wtax_amt,
				$purc_usr_cd,
				$purc_usr_nm,
				$purc_dpt_cd,
				$purc_dpt_nm,
				$bd_dpt_cd,
				$bd_dpt_nm,
				$bd_itm_cd,
				$bd_itm_sub1,
				$bd_itm_sub2,
				$bd_itm_sub3,
				$bd_itm_nm,
				$bd_lot_no,
				$bd_sublot_no,
				$bd_sno1,
				$bd_sno2,
				$bd_sno3,
				$bd_sno4,
				$bd_bp_cd,
				$bd_bp_nm,
				$bd_loc_cd,
				$bd_loc_nm,
				$bd_ctg_cd,
				$bd_ctg_nm,
				$bd_oper_cd,
				$bd_oper_nm,
				$bd_iv_no,
				$bd_slo_no,
				$bd_po_no,
				$rtn_sts_typ,
				$rtn_sts_typ_nm,
				$msg_id,
				$msg
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
				{$sppl_cd, "bp_nm;subcon_flg;purc_usr_cd;purc_dpt_cd;sppl_cntct_dpt;sppl_cntct_psn;tel;fax;cntry_cd;cntry_nm;sppl_iv_flg;cur_cd;asppl_cd;purc_amt_rnd_typ;purc_tax_rnd_typ;purc_upri_cng_flg;pay_crryovr_times;ap_dpt_cd;prnt_lcl_cd;pay_spot_flg"},	// sppl_cd
				{$trd_unit_cd, "unit_nm;dec_place;rnd_typ;conv_base_qty;conv_qty"},	// trd_unit_cd
				{$re_arr_loc_cd, "wg_cd;wg_nm;loc_nm;str_ln_tgt_flg;site_cd;cal_cd;sppl_cd;str_ln_cd;str_ln_cd_none_flg"},	// re_arr_loc_cd
				{$re_arr_str_ln_p + ".str_ln_cd", "str_ln_nm"},	// re_arr_str_ln_p.str_ln_cd
				{$re_arr_loc_sppl_cd, "sppl_cal_cd"},	// re_arr_loc_sppl_cd
				{$in_to_loc_cd, "wg_cd;wg_nm;loc_nm;str_ln_tgt_flg;site_cd;str_ln_cd;str_ln_cd_none_flg"},	// in_to_loc_cd
				{$in_to_str_ln_p + ".str_ln_cd", "str_ln_nm"},	// in_to_str_ln_p.str_ln_cd
				{$lot_no_p + ".lot_no", "sublot_no;ver_no"},	// lot_no_p.lot_no
				{$lot_no_p + ".sublot_no", "ver_no"},	// lot_no_p.sublot_no
				{$trd_cur_cd, "cur_nm;amt_dec_place;upri_dec_place"},	// trd_cur_cd
				{$trd_upri_amt_p + ".dscnt_rsn_cd", "biz_rsn_nm"},	// trd_upri_amt_p.dscnt_rsn_cd
				{$purc_rsn_cd, "biz_rsn_nm;xpns_purc_flg"},	// purc_rsn_cd
				{$ap_dpt_cd, "dpt_nm"},	// ap_dpt_cd
				{$usr_dpt_p + ".dpt_cd", "dpt_nm;wg_cd;wg_nm;ap_dpt_flg"},	// usr_dpt_p.dpt_cd
				{$bditm_p + ".bd_dpt_cd", "dpt_nm"},	// bditm_p.bd_dpt_cd
				{$bditm_p + ".bd_itm_cd", "itm_sub1;itm_sub2;itm_sub3;itm_nm;lot_mng_typ;lot_no_typ;sublot_mng_typ;sublot_no_typ;sno1_mng_typ;sno2_mng_typ;sno3_mng_typ;sno4_mng_typ"},	// bditm_p.bd_itm_cd
				{$bditm_p + ".bd_itm_sub1", "itm_sub2;itm_sub3;itm_nm;lot_mng_typ;lot_no_typ;sublot_mng_typ;sublot_no_typ;sno1_mng_typ;sno2_mng_typ;sno3_mng_typ;sno4_mng_typ"},	// bditm_p.bd_itm_sub1
				{$bditm_p + ".bd_itm_sub2", "itm_sub3;itm_nm;lot_mng_typ;lot_no_typ;sublot_mng_typ;sublot_no_typ;sno1_mng_typ;sno2_mng_typ;sno3_mng_typ;sno4_mng_typ"},	// bditm_p.bd_itm_sub2
				{$bditm_p + ".bd_itm_sub3", "itm_nm;lot_mng_typ;lot_no_typ;sublot_mng_typ;sublot_no_typ;sno1_mng_typ;sno2_mng_typ;sno3_mng_typ;sno4_mng_typ"},	// bditm_p.bd_itm_sub3
				{$tterm_cd1, "tterm_nm"},	// tterm_cd1
				{$tterm_cd2, "tterm_nm"},	// tterm_cd2
				{$tterm_cd3, "tterm_nm"}	// tterm_cd3
			}
		)),
		new MCExtMap.Entry($$LIST_IN, new MCExtList(
			new String[][]{
				{$sppl_cd, "MAC_BP_IS_SRCH_TYP.SPPL_PURC;ac_dt"},	// sppl_cd
				{$trd_unit_cd, "itm_cd;itm_sub1;itm_sub2;itm_sub3"},	// trd_unit_cd
				{$re_arr_loc_cd, "MAC_LOC_IS_SRCH_TYP.COMM;itm_cd;itm_sub1;itm_sub2;itm_sub3"},	// re_arr_loc_cd
				{$re_arr_str_ln_p + ".str_ln_cd", "re_arr_loc_cd;true"},	// re_arr_str_ln_p.str_ln_cd
				{$re_arr_loc_sppl_cd, "MAC_BP_IS_SRCH_TYP.SPPL"},	// re_arr_loc_sppl_cd
				{$in_to_loc_cd, "itm_cd;itm_sub1;itm_sub2;itm_sub3"},	// in_to_loc_cd
				{$in_to_str_ln_p + ".str_ln_cd", "in_to_loc_cd;true"},	// in_to_str_ln_p.str_ln_cd
				{$lot_no_p + ".lot_no", "itm_cd;itm_sub1;itm_sub2;itm_sub3"},	// lot_no_p.lot_no
				{$lot_no_p + ".sublot_no", "itm_cd;itm_sub1;itm_sub2;itm_sub3;lot_no"},	// lot_no_p.sublot_no
				{$trd_upri_amt_p + ".dscnt_rsn_cd", "loc_mng_typ"},	// trd_upri_amt_p.dscnt_rsn_cd
				{$ap_dpt_cd, "MAC_DPT_IS_SRCH_TYP.AP;ac_dt"},	// ap_dpt_cd
				{$usr_dpt_p + ".usr_cd", "ac_dt"},	// usr_dpt_p.usr_cd
				{$usr_dpt_p + ".dpt_cd", "MAC_DPT_IS_SRCH_TYP.PURC;ac_dt;purc_usr_cd;true"},	// usr_dpt_p.dpt_cd
				{$bditm_p + ".bd_dpt_cd", "MAC_DPT_IS_SRCH_TYP.BD;ac_dt"},	// bditm_p.bd_dpt_cd
				{$bditm_p + ".bd_itm_cd", "MAC_ITM_IS_SRCH_TYP.ASSET1"},	// bditm_p.bd_itm_cd
				{$bditm_p + ".bd_itm_sub1", "MAC_ITM_IS_SRCH_TYP.ASSET1;bd_itm_cd"},	// bditm_p.bd_itm_sub1
				{$bditm_p + ".bd_itm_sub2", "MAC_ITM_IS_SRCH_TYP.ASSET1;bd_itm_cd;bd_itm_sub1"},	// bditm_p.bd_itm_sub2
				{$bditm_p + ".bd_itm_sub3", "MAC_ITM_IS_SRCH_TYP.ASSET1;bd_itm_cd;bd_itm_sub1;bd_itm_sub2"},	// bditm_p.bd_itm_sub3
				{$tterm_cd1, "MAC_TTERM_TYP.TTERM1"},	// tterm_cd1
				{$tterm_cd2, "MAC_TTERM_TYP.TTERM2"},	// tterm_cd2
				{$tterm_cd3, "MAC_TTERM_TYP.TTERM3"}	// tterm_cd3
			}
		)),
		new MCExtMap.Entry($$LIST_IN_BASE, new MCExtList(
			new String[][]{
				{$sppl_cd, "bp_is_srch_typ;dt"},	// sppl_cd
				{$trd_unit_cd, "itm_cd;itm_sub1;itm_sub2;itm_sub3"},	// trd_unit_cd
				{$re_arr_loc_cd, "loc_is_srch_typ;itm_cd;itm_sub1;itm_sub2;itm_sub3"},	// re_arr_loc_cd
				{$re_arr_str_ln_p + ".str_ln_cd", "loc_cd;mode_nullval_flg"},	// re_arr_str_ln_p.str_ln_cd
				{$re_arr_loc_sppl_cd, "bp_is_srch_typ"},	// re_arr_loc_sppl_cd
				{$in_to_loc_cd, "itm_cd;itm_sub1;itm_sub2;itm_sub3"},	// in_to_loc_cd
				{$in_to_str_ln_p + ".str_ln_cd", "loc_cd;mode_nullval_flg"},	// in_to_str_ln_p.str_ln_cd
				{$lot_no_p + ".lot_no", "itm_cd;itm_sub1;itm_sub2;itm_sub3"},	// lot_no_p.lot_no
				{$lot_no_p + ".sublot_no", "itm_cd;itm_sub1;itm_sub2;itm_sub3;lot_no"},	// lot_no_p.sublot_no
				{$trd_upri_amt_p + ".dscnt_rsn_cd", "purc_dscnt_loc_mng_typ"},	// trd_upri_amt_p.dscnt_rsn_cd
				{$ap_dpt_cd, "dpt_is_srch_typ;dt"},	// ap_dpt_cd
				{$usr_dpt_p + ".usr_cd", "dt"},	// usr_dpt_p.usr_cd
				{$usr_dpt_p + ".dpt_cd", "dpt_is_srch_typ;dt;usr_cd;wr_flg"},	// usr_dpt_p.dpt_cd
				{$bditm_p + ".bd_dpt_cd", "dpt_is_srch_typ;dt"},	// bditm_p.bd_dpt_cd
				{$bditm_p + ".bd_itm_cd", "itm_is_srch_typ"},	// bditm_p.bd_itm_cd
				{$bditm_p + ".bd_itm_sub1", "itm_is_srch_typ;itm_cd"},	// bditm_p.bd_itm_sub1
				{$bditm_p + ".bd_itm_sub2", "itm_is_srch_typ;itm_cd;itm_sub1"},	// bditm_p.bd_itm_sub2
				{$bditm_p + ".bd_itm_sub3", "itm_is_srch_typ;itm_cd;itm_sub1;itm_sub2"},	// bditm_p.bd_itm_sub3
				{$tterm_cd1, "tterm_typ"},	// tterm_cd1
				{$tterm_cd2, "tterm_typ"},	// tterm_cd2
				{$tterm_cd3, "tterm_typ"}	// tterm_cd3
			}
		)),
		new MCExtMap.Entry($$DISP_CTL, new MCExtList(
			new String[][]{
				{$from_gd_cd, "STK_GD"},	// from_gd_cd
				{$tmp_gd_cd, "STK_GD"},	// tmp_gd_cd
				{$gi_wg_cd, "WG"},	// gi_wg_cd
				{$gi_str_ln_cd, "STR_LN"},	// gi_str_ln_cd
				{$ap_cred_cd, "CRED"},	// ap_cred_cd
				{$maker_cd, "MAKER"},	// maker_cd
				{$maker_nm, "MAKER"},	// maker_nm
				{$base_unit_cd, "BASE_UNIT"},	// base_unit_cd
				{$base_unit_nm, "BASE_UNIT"},	// base_unit_nm
				{$base_unit_dec_place, "BASE_UNIT"},	// base_unit_dec_place
				{$base_unit_rnd_typ, "BASE_UNIT"},	// base_unit_rnd_typ
				{$src_wtax_rate, "WTAX"},	// src_wtax_rate
				{$base_unit_qty_p + ".qty", "BASE_UNIT"},	// base_unit_qty_p.qty
				{$base_unit_qty_bef_p + ".qty", "BASE_UNIT"},	// base_unit_qty_bef_p.qty
				{$re_arr_loc_wg_cd, "WG"},	// re_arr_loc_wg_cd
				{$re_arr_loc_wg_nm, "WG"},	// re_arr_loc_wg_nm
				{$re_arr_str_ln_tgt_flg, "STR_LN"},	// re_arr_str_ln_tgt_flg
				{$re_arr_loc_site_cd, "SITE"},	// re_arr_loc_site_cd
				{$gd_cd, "STK_GD"},	// gd_cd
				{$gd_nm, "STK_GD"},	// gd_nm
				{$site_cd, "SITE"},	// site_cd
				{$site_nm, "SITE"},	// site_nm
				{$in_to_loc_wg_cd, "WG"},	// in_to_loc_wg_cd
				{$in_to_loc_wg_nm, "WG"},	// in_to_loc_wg_nm
				{$in_to_str_ln_tgt_flg, "STR_LN"},	// in_to_str_ln_tgt_flg
				{$xrate_inpt_flg, "BASE_CUR"},	// xrate_inpt_flg
				{$xrate_cd, "BASE_CUR"},	// xrate_cd
				{$xrate_p + ".xrate", "BASE_CUR"},	// xrate_p.xrate
				{$xrate_rnd_typ, "BASE_CUR"},	// xrate_rnd_typ
				{$base_cur_cd, "BASE_CUR"},	// base_cur_cd
				{$base_cur_nm, "BASE_CUR"},	// base_cur_nm
				{$base_cur_amt_dec_place, "BASE_CUR"},	// base_cur_amt_dec_place
				{$base_cur_upri_dec_place, "BASE_CUR"},	// base_cur_upri_dec_place
				{$base_cur_upri_p + ".upri", "BASE_CUR"},	// base_cur_upri_p.upri
				{$base_cur_amt_p + ".amt", "BASE_CUR"},	// base_cur_amt_p.amt
				{$base_cur_inc_tax_amt_p + ".amt", "BASE_CUR"},	// base_cur_inc_tax_amt_p.amt
				{$base_cur_tax_amt_p + ".amt", "BASE_CUR"},	// base_cur_tax_amt_p.amt
				{$base_cur_dscnt_amt_p + ".amt", "BASE_CUR"},	// base_cur_dscnt_amt_p.amt
				{$base_cur_proc_upri_p + ".upri", "BASE_CUR"},	// base_cur_proc_upri_p.upri
				{$base_cur_proc_amt_p + ".amt", "BASE_CUR"},	// base_cur_proc_amt_p.amt
				{$base_cur_proc_amt_p + ".tax_amt", "BASE_CUR"},	// base_cur_proc_amt_p.tax_amt
				{$base_cur_onr_prov_upri_p + ".upri", "BASE_CUR"},	// base_cur_onr_prov_upri_p.upri
				{$base_cur_onr_prov_amt_p + ".amt", "BASE_CUR"},	// base_cur_onr_prov_amt_p.amt
				{$base_cur_onr_prov_amt_p + ".tax_amt", "BASE_CUR"},	// base_cur_onr_prov_amt_p.tax_amt
				{$ptax_xrate_inpt_flg, "PTAX"},	// ptax_xrate_inpt_flg
				{$prax_xrate_p + ".xrate", "PTAX"},	// prax_xrate_p.xrate
				{$ptax_cur_cd, "PTAX"},	// ptax_cur_cd
				{$ptax_cur_nm, "PTAX"},	// ptax_cur_nm
				{$ptax_cur_amt_dec_place, "PTAX"},	// ptax_cur_amt_dec_place
				{$ptax_cur_upri_dec_place, "PTAX"},	// ptax_cur_upri_dec_place
				{$ptax_dt, "PTAX"},	// ptax_dt
				{$ptax_cur_upri_p + ".upri", "PTAX"},	// ptax_cur_upri_p.upri
				{$ptax_cur_amt_p + ".amt", "PTAX"},	// ptax_cur_amt_p.amt
				{$ptax_cur_tax_amt_p + ".amt", "PTAX"},	// ptax_cur_tax_amt_p.amt
				{$ptax_cur_inc_tax_amt_p + ".amt", "PTAX"},	// ptax_cur_inc_tax_amt_p.amt
				{$ptax_cur_dscnt_amt_p + ".amt", "PTAX"},	// ptax_cur_dscnt_amt_p.amt
				{$ptax_cur_proc_upri_p + ".upri", "PTAX"},	// ptax_cur_proc_upri_p.upri
				{$ptax_cur_proc_amt_p + ".amt", "PTAX"},	// ptax_cur_proc_amt_p.amt
				{$ptax_cur_proc_amt_p + ".tax_amt", "PTAX"},	// ptax_cur_proc_amt_p.tax_amt
				{$ptax_cur_onr_prov_upri_p + ".upri", "PTAX"},	// ptax_cur_onr_prov_upri_p.upri
				{$ptax_cur_onr_prov_amt_p + ".amt", "PTAX"},	// ptax_cur_onr_prov_amt_p.amt
				{$ptax_cur_onr_prov_amt_p + ".tax_amt", "PTAX"},	// ptax_cur_onr_prov_amt_p.tax_amt
				{$wtax_rate, "WTAX"},	// wtax_rate
				{$wtax_amt_p + ".amt", "WTAX"},	// wtax_amt_p.amt
				{$wtax_rnd_typ, "WTAX"},	// wtax_rnd_typ
				{$purc_dpt_wg_cd, "WG"},	// purc_dpt_wg_cd
				{$purc_dpt_wg_nm, "WG"}	// purc_dpt_wg_nm
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
	protected RsltR_MC_A(ConstMetaList<? extends RsltR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public RsltR clone() {
		return (RsltR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public RsltR createInstance() {
		return (RsltR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public RsltR getValues(String... names) {
		return (RsltR) super.getValues(names);
	}



	/**
	 * Select 選択.<p>
	 *
	 */
	public boolean check() {
		return getConstBoolean(offset + 0, $check);
	}

	/**
	 * Select 選択.<p>
	 *
	 */
	public void check(boolean value) {
		setConstBoolean(offset + 0, $check, value);
	}


	public boolean hdr_readonly_flg() {
		return getConstBoolean(offset + 1, $hdr_readonly_flg);
	}

	public void hdr_readonly_flg(boolean value) {
		setConstBoolean(offset + 1, $hdr_readonly_flg, value);
	}


	/**
	 * Header read-only ヘッダ読取専用.<p>
	 *
	 */
	public boolean bef_abort_flg() {
		return getConstBoolean(offset + 2, $bef_abort_flg);
	}

	/**
	 * Header read-only ヘッダ読取専用.<p>
	 *
	 */
	public void bef_abort_flg(boolean value) {
		setConstBoolean(offset + 2, $bef_abort_flg, value);
	}


	/**
	 * Cancel remaining 打切.<p>
	 *
	 */
	public boolean abort_flg() {
		return getConstBoolean(offset + 3, $abort_flg);
	}

	/**
	 * Cancel remaining 打切.<p>
	 *
	 */
	public void abort_flg(boolean value) {
		setConstBoolean(offset + 3, $abort_flg, value);
	}


	/**
	 * Transaction cd. 取引ＣＤ.<p>
	 *
	 */
	public String trd_cd() {
		return getConstString(offset + 4, $trd_cd);
	}

	/**
	 * Transaction cd. 取引ＣＤ.<p>
	 *
	 */
	public void trd_cd(String value) {
		setConstString(offset + 4, $trd_cd, value);
	}


	/**
	 * Transaction name 取引名.<p>
	 *
	 */
	public String trd_nm() {
		return getConstString(offset + 5, $trd_nm);
	}

	/**
	 * Transaction name 取引名.<p>
	 *
	 */
	public void trd_nm(String value) {
		setConstString(offset + 5, $trd_nm, value);
	}


	/**
	 * Transaction pattern type 取引パタン区分.<p>
	 *
	 */
	public String trd_ptn_typ() {
		return getConstString(offset + 6, $trd_ptn_typ);
	}

	/**
	 * Transaction pattern type 取引パタン区分.<p>
	 *
	 */
	public void trd_ptn_typ(String value) {
		setConstString(offset + 6, $trd_ptn_typ, value);
	}


	/**
	 * Receipt pattern 入荷パタン.<p>
	 *
	 */
	public String arr_ptn_typ() {
		return getConstString(offset + 7, $arr_ptn_typ);
	}

	/**
	 * Receipt pattern 入荷パタン.<p>
	 *
	 */
	public void arr_ptn_typ(String value) {
		setConstString(offset + 7, $arr_ptn_typ, value);
	}


	/**
	 * Receipt pattern name 入荷パタン名.<p>
	 *
	 */
	public String arr_ptn_typ_nm() {
		return getConstString(offset + 8, $arr_ptn_typ_nm);
	}

	/**
	 * Receipt pattern name 入荷パタン名.<p>
	 *
	 */
	public void arr_ptn_typ_nm(String value) {
		setConstString(offset + 8, $arr_ptn_typ_nm, value);
	}


	/**
	 * Simultaneous recording 同時計上.<p>
	 *
	 */
	public boolean sync_flg() {
		return getConstBoolean(offset + 9, $sync_flg);
	}

	/**
	 * Simultaneous recording 同時計上.<p>
	 *
	 */
	public void sync_flg(boolean value) {
		setConstBoolean(offset + 9, $sync_flg, value);
	}


	/**
	 * Purchase recording type 仕入計上区分.<p>
	 *
	 */
	public String purc_basis_typ() {
		return getConstString(offset + 10, $purc_basis_typ);
	}

	/**
	 * Purchase recording type 仕入計上区分.<p>
	 *
	 */
	public void purc_basis_typ(String value) {
		setConstString(offset + 10, $purc_basis_typ, value);
	}


	/**
	 * Purchase recording type name 仕入計上区分名.<p>
	 *
	 */
	public String purc_basis_typ_nm() {
		return getConstString(offset + 11, $purc_basis_typ_nm);
	}

	/**
	 * Purchase recording type name 仕入計上区分名.<p>
	 *
	 */
	public void purc_basis_typ_nm(String value) {
		setConstString(offset + 11, $purc_basis_typ_nm, value);
	}


	public boolean purc_ddlv_flg() {
		return getConstBoolean(offset + 12, $purc_ddlv_flg);
	}

	public void purc_ddlv_flg(boolean value) {
		setConstBoolean(offset + 12, $purc_ddlv_flg, value);
	}


	public boolean arr_skip_flg() {
		return getConstBoolean(offset + 13, $arr_skip_flg);
	}

	public void arr_skip_flg(boolean value) {
		setConstBoolean(offset + 13, $arr_skip_flg, value);
	}


	/**
	 * Purchase date 仕入日.<p>
	 *
	 */
	public MCDate purc_dt() {
		return getConstDate(offset + 14, $purc_dt);
	}

	/**
	 * Purchase date 仕入日.<p>
	 *
	 */
	public void purc_dt(MCDate value) {
		setConstDate(offset + 14, $purc_dt, value);
	}


	/**
	 * Recording month 計上年月.<p>
	 *
	 */
	public MCDate ac_ym() {
		return getConstDate(offset + 15, $ac_ym);
	}

	/**
	 * Recording month 計上年月.<p>
	 *
	 */
	public void ac_ym(MCDate value) {
		setConstDate(offset + 15, $ac_ym, value);
	}


	public mcframe.clientMAUB.MAUBP5220.AcDtR ac_dt_p(){
		return (mcframe.clientMAUB.MAUBP5220.AcDtR) getConstInnerRow(offset + 16, $ac_dt_p);
	}
	
	public void ac_dt_p(mcframe.clientMAUB.MAUBP5220.AcDtR row){
		setConstInnerRow(offset + 16, $ac_dt_p, row);
	}


	public mcframe.clientMAUB.MAUBP5240.CanAcDtR can_ac_dt_p(){
		return (mcframe.clientMAUB.MAUBP5240.CanAcDtR) getConstInnerRow(offset + 17, $can_ac_dt_p);
	}
	
	public void can_ac_dt_p(mcframe.clientMAUB.MAUBP5240.CanAcDtR row){
		setConstInnerRow(offset + 17, $can_ac_dt_p, row);
	}


	/**
	 * Payment base date 支払起算日.<p>
	 *
	 */
	public MCDate pay_basis_dt() {
		return getConstDate(offset + 18, $pay_basis_dt);
	}

	/**
	 * Payment base date 支払起算日.<p>
	 *
	 */
	public void pay_basis_dt(MCDate value) {
		setConstDate(offset + 18, $pay_basis_dt, value);
	}


	/**
	 * Scheduled payment date 支払予定日.<p>
	 *
	 */
	public MCDate pay_schd_dt() {
		return getConstDate(offset + 19, $pay_schd_dt);
	}

	/**
	 * Scheduled payment date 支払予定日.<p>
	 *
	 */
	public void pay_schd_dt(MCDate value) {
		setConstDate(offset + 19, $pay_schd_dt, value);
	}


	/**
	 * Scheduled purchase date 仕入予定日.<p>
	 *
	 */
	public MCDate purc_schd_dt() {
		return getConstDate(offset + 20, $purc_schd_dt);
	}

	/**
	 * Scheduled purchase date 仕入予定日.<p>
	 *
	 */
	public void purc_schd_dt(MCDate value) {
		setConstDate(offset + 20, $purc_schd_dt, value);
	}


	/**
	 * Scheduled delivery date 納入予定日.<p>
	 *
	 */
	public MCDate dlv_rqst_dt() {
		return getConstDate(offset + 21, $dlv_rqst_dt);
	}

	/**
	 * Scheduled delivery date 納入予定日.<p>
	 *
	 */
	public void dlv_rqst_dt(MCDate value) {
		setConstDate(offset + 21, $dlv_rqst_dt, value);
	}


	/**
	 * Scheduled receipt date 入荷予定日.<p>
	 *
	 */
	public MCDate arr_schd_dt() {
		return getConstDate(offset + 22, $arr_schd_dt);
	}

	/**
	 * Scheduled receipt date 入荷予定日.<p>
	 *
	 */
	public void arr_schd_dt(MCDate value) {
		setConstDate(offset + 22, $arr_schd_dt, value);
	}


	/**
	 * Normal management (Concurrent purchase) schedule 通常管理（仕入同時）予定.<p>
	 *
	 */
	public boolean schd_sync_flg() {
		return getConstBoolean(offset + 23, $schd_sync_flg);
	}

	/**
	 * Normal management (Concurrent purchase) schedule 通常管理（仕入同時）予定.<p>
	 *
	 */
	public void schd_sync_flg(boolean value) {
		setConstBoolean(offset + 23, $schd_sync_flg, value);
	}


	/**
	 * Approval No. 承認ＮＯ.<p>
	 *
	 */
	public String aprv_no() {
		return getConstString(offset + 24, $aprv_no);
	}

	/**
	 * Approval No. 承認ＮＯ.<p>
	 *
	 */
	public void aprv_no(String value) {
		setConstString(offset + 24, $aprv_no, value);
	}


	/**
	 * Approval status type 承認状況区分.<p>
	 *
	 */
	public String aprv_sts_typ() {
		return getConstString(offset + 25, $aprv_sts_typ);
	}

	/**
	 * Approval status type 承認状況区分.<p>
	 *
	 */
	public void aprv_sts_typ(String value) {
		setConstString(offset + 25, $aprv_sts_typ, value);
	}


	/**
	 * Approval status type name 承認状況区分名.<p>
	 *
	 */
	public String aprv_sts_typ_nm() {
		return getConstString(offset + 26, $aprv_sts_typ_nm);
	}

	/**
	 * Approval status type name 承認状況区分名.<p>
	 *
	 */
	public void aprv_sts_typ_nm(String value) {
		setConstString(offset + 26, $aprv_sts_typ_nm, value);
	}


	/**
	 * PO No. 発注ＮＯ.<p>
	 *
	 */
	public String po_no() {
		return getConstString(offset + 27, $po_no);
	}

	/**
	 * PO No. 発注ＮＯ.<p>
	 *
	 */
	public void po_no(String value) {
		setConstString(offset + 27, $po_no, value);
	}


	/**
	 * PO details No. 発注明細ＮＯ.<p>
	 *
	 */
	public String po_d_no() {
		return getConstString(offset + 28, $po_d_no);
	}

	/**
	 * PO details No. 発注明細ＮＯ.<p>
	 *
	 */
	public void po_d_no(String value) {
		setConstString(offset + 28, $po_d_no, value);
	}


	/**
	 * PO schedule creating source type 発注予定作成元区分.<p>
	 *
	 */
	public String po_schd_src_typ() {
		return getConstString(offset + 29, $po_schd_src_typ);
	}

	/**
	 * PO schedule creating source type 発注予定作成元区分.<p>
	 *
	 */
	public void po_schd_src_typ(String value) {
		setConstString(offset + 29, $po_schd_src_typ, value);
	}


	/**
	 * PO schedule creating source type name 発注予定作成元区分名.<p>
	 *
	 */
	public String po_schd_src_typ_nm() {
		return getConstString(offset + 30, $po_schd_src_typ_nm);
	}

	/**
	 * PO schedule creating source type name 発注予定作成元区分名.<p>
	 *
	 */
	public void po_schd_src_typ_nm(String value) {
		setConstString(offset + 30, $po_schd_src_typ_nm, value);
	}


	/**
	 * PO schedule creating source No. 発注予定作成元ＮＯ.<p>
	 *
	 */
	public String po_schd_src_no() {
		return getConstString(offset + 31, $po_schd_src_no);
	}

	/**
	 * PO schedule creating source No. 発注予定作成元ＮＯ.<p>
	 *
	 */
	public void po_schd_src_no(String value) {
		setConstString(offset + 31, $po_schd_src_no, value);
	}


	/**
	 * Purchase I/V No. 受領Ｉ／ＶＮＯ.<p>
	 *
	 */
	public String rcpt_iv_no() {
		return getConstString(offset + 32, $rcpt_iv_no);
	}

	/**
	 * Purchase I/V No. 受領Ｉ／ＶＮＯ.<p>
	 *
	 */
	public void rcpt_iv_no(String value) {
		setConstString(offset + 32, $rcpt_iv_no, value);
	}


	/**
	 * Purchase I/V management No. 受領Ｉ／Ｖ管理ＮＯ.<p>
	 *
	 */
	public String rcpt_iv_mng_no() {
		return getConstString(offset + 33, $rcpt_iv_mng_no);
	}

	/**
	 * Purchase I/V management No. 受領Ｉ／Ｖ管理ＮＯ.<p>
	 *
	 */
	public void rcpt_iv_mng_no(String value) {
		setConstString(offset + 33, $rcpt_iv_mng_no, value);
	}


	/**
	 * Purchase I/V details No. 受領Ｉ／Ｖ明細ＮＯ.<p>
	 *
	 */
	public String rcpt_iv_d_no() {
		return getConstString(offset + 34, $rcpt_iv_d_no);
	}

	/**
	 * Purchase I/V details No. 受領Ｉ／Ｖ明細ＮＯ.<p>
	 *
	 */
	public void rcpt_iv_d_no(String value) {
		setConstString(offset + 34, $rcpt_iv_d_no, value);
	}


	/**
	 * Mfg. order No. 製造指図ＮＯ.<p>
	 *
	 */
	public String mfg_inst_no() {
		return getConstString(offset + 35, $mfg_inst_no);
	}

	/**
	 * Mfg. order No. 製造指図ＮＯ.<p>
	 *
	 */
	public void mfg_inst_no(String value) {
		setConstString(offset + 35, $mfg_inst_no, value);
	}


	/**
	 * Mfg. location cd. 製造場所ＣＤ.<p>
	 *
	 */
	public String mfg_loc_cd() {
		return getConstString(offset + 36, $mfg_loc_cd);
	}

	/**
	 * Mfg. location cd. 製造場所ＣＤ.<p>
	 *
	 */
	public void mfg_loc_cd(String value) {
		setConstString(offset + 36, $mfg_loc_cd, value);
	}


	/**
	 * BOM pattern 構成パタン.<p>
	 *
	 */
	public String bom_ptn() {
		return getConstString(offset + 37, $bom_ptn);
	}

	/**
	 * BOM pattern 構成パタン.<p>
	 *
	 */
	public void bom_ptn(String value) {
		setConstString(offset + 37, $bom_ptn, value);
	}


	/**
	 * Purchase schedule No. 仕入予定ＮＯ.<p>
	 *
	 */
	public String purc_schd_no() {
		return getConstString(offset + 38, $purc_schd_no);
	}

	/**
	 * Purchase schedule No. 仕入予定ＮＯ.<p>
	 *
	 */
	public void purc_schd_no(String value) {
		setConstString(offset + 38, $purc_schd_no, value);
	}


	/**
	 * Purchase result No. 仕入実績ＮＯ.<p>
	 *
	 */
	public String purc_act_no() {
		return getConstString(offset + 39, $purc_act_no);
	}

	/**
	 * Purchase result No. 仕入実績ＮＯ.<p>
	 *
	 */
	public void purc_act_no(String value) {
		setConstString(offset + 39, $purc_act_no, value);
	}


	/**
	 * Purchase result details No. 仕入実績明細ＮＯ.<p>
	 *
	 */
	public String purc_act_d_no() {
		return getConstString(offset + 40, $purc_act_d_no);
	}

	/**
	 * Purchase result details No. 仕入実績明細ＮＯ.<p>
	 *
	 */
	public void purc_act_d_no(String value) {
		setConstString(offset + 40, $purc_act_d_no, value);
	}


	/**
	 * Purchase result sequence number 仕入実績連番.<p>
	 *
	 */
	public MCNumber purc_act_seq() {
		return getConstNumber(offset + 41, $purc_act_seq);
	}

	/**
	 * Purchase result sequence number 仕入実績連番.<p>
	 *
	 */
	public void purc_act_seq(MCNumber value) {
		setConstNumber(offset + 41, $purc_act_seq, value);
	}

	/**
	 * Purchase result sequence number 仕入実績連番.<p>
	 *
	 */
	public void purc_act_seq(int value) {
		setConstNumber(offset + 41, $purc_act_seq, value);
	}

	/**
	 * Purchase result sequence number 仕入実績連番.<p>
	 *
	 */
	public void purc_act_seq(long value) {
		setConstNumber(offset + 41, $purc_act_seq, value);
	}

	/**
	 * Purchase result sequence number 仕入実績連番.<p>
	 *
	 */
	public void purc_act_seq(float value) {
		setConstNumber(offset + 41, $purc_act_seq, value);
	}

	/**
	 * Purchase result sequence number 仕入実績連番.<p>
	 *
	 */
	public void purc_act_seq(double value) {
		setConstNumber(offset + 41, $purc_act_seq, value);
	}


	/**
	 * Purchase result details sequence number 仕入実績明細連番.<p>
	 *
	 */
	public MCNumber purc_act_d_seq() {
		return getConstNumber(offset + 42, $purc_act_d_seq);
	}

	/**
	 * Purchase result details sequence number 仕入実績明細連番.<p>
	 *
	 */
	public void purc_act_d_seq(MCNumber value) {
		setConstNumber(offset + 42, $purc_act_d_seq, value);
	}

	/**
	 * Purchase result details sequence number 仕入実績明細連番.<p>
	 *
	 */
	public void purc_act_d_seq(int value) {
		setConstNumber(offset + 42, $purc_act_d_seq, value);
	}

	/**
	 * Purchase result details sequence number 仕入実績明細連番.<p>
	 *
	 */
	public void purc_act_d_seq(long value) {
		setConstNumber(offset + 42, $purc_act_d_seq, value);
	}

	/**
	 * Purchase result details sequence number 仕入実績明細連番.<p>
	 *
	 */
	public void purc_act_d_seq(float value) {
		setConstNumber(offset + 42, $purc_act_d_seq, value);
	}

	/**
	 * Purchase result details sequence number 仕入実績明細連番.<p>
	 *
	 */
	public void purc_act_d_seq(double value) {
		setConstNumber(offset + 42, $purc_act_d_seq, value);
	}


	/**
	 * Receipt schedule No. 入荷予定ＮＯ.<p>
	 *
	 */
	public String arr_schd_no() {
		return getConstString(offset + 43, $arr_schd_no);
	}

	/**
	 * Receipt schedule No. 入荷予定ＮＯ.<p>
	 *
	 */
	public void arr_schd_no(String value) {
		setConstString(offset + 43, $arr_schd_no, value);
	}


	/**
	 * Receipt progress No. 入荷進捗ＮＯ.<p>
	 *
	 */
	public String arr_pr_no() {
		return getConstString(offset + 44, $arr_pr_no);
	}

	/**
	 * Receipt progress No. 入荷進捗ＮＯ.<p>
	 *
	 */
	public void arr_pr_no(String value) {
		setConstString(offset + 44, $arr_pr_no, value);
	}


	/**
	 * Receipt result No. 入荷実績ＮＯ.<p>
	 *
	 */
	public String arr_act_no() {
		return getConstString(offset + 45, $arr_act_no);
	}

	/**
	 * Receipt result No. 入荷実績ＮＯ.<p>
	 *
	 */
	public void arr_act_no(String value) {
		setConstString(offset + 45, $arr_act_no, value);
	}


	/**
	 * Grading before purchase recording cd. 仕入計上前格付ＣＤ.<p>
	 *
	 */
	public String from_gd_cd() {
		return getConstString(offset + 46, $from_gd_cd);
	}

	/**
	 * Grading before purchase recording cd. 仕入計上前格付ＣＤ.<p>
	 *
	 */
	public void from_gd_cd(String value) {
		setConstString(offset + 46, $from_gd_cd, value);
	}


	/**
	 * Rating cd. for saving 退避用格付ＣＤ.<p>
	 *
	 */
	public String tmp_gd_cd() {
		return getConstString(offset + 47, $tmp_gd_cd);
	}

	/**
	 * Rating cd. for saving 退避用格付ＣＤ.<p>
	 *
	 */
	public void tmp_gd_cd(String value) {
		setConstString(offset + 47, $tmp_gd_cd, value);
	}


	/**
	 * Conforming type for saving 退避用良品区分.<p>
	 *
	 */
	public String tmp_quality_typ() {
		return getConstString(offset + 48, $tmp_quality_typ);
	}

	/**
	 * Conforming type for saving 退避用良品区分.<p>
	 *
	 */
	public void tmp_quality_typ(String value) {
		setConstString(offset + 48, $tmp_quality_typ, value);
	}


	/**
	 * Inventory inspection type for saving 退避用在庫検査区分.<p>
	 *
	 */
	public String tmp_stk_insp_typ() {
		return getConstString(offset + 49, $tmp_stk_insp_typ);
	}

	/**
	 * Inventory inspection type for saving 退避用在庫検査区分.<p>
	 *
	 */
	public void tmp_stk_insp_typ(String value) {
		setConstString(offset + 49, $tmp_stk_insp_typ, value);
	}


	/**
	 * Inventory inspection type for saving 退避用在庫識別区分.<p>
	 *
	 */
	public String tmp_stk_id_typ() {
		return getConstString(offset + 50, $tmp_stk_id_typ);
	}

	/**
	 * Inventory inspection type for saving 退避用在庫識別区分.<p>
	 *
	 */
	public void tmp_stk_id_typ(String value) {
		setConstString(offset + 50, $tmp_stk_id_typ, value);
	}


	/**
	 * Purchase GI location WG cd. 仕入出庫場所ＷＧ ＣＤ.<p>
	 *
	 */
	public String gi_wg_cd() {
		return getConstString(offset + 51, $gi_wg_cd);
	}

	/**
	 * Purchase GI location WG cd. 仕入出庫場所ＷＧ ＣＤ.<p>
	 *
	 */
	public void gi_wg_cd(String value) {
		setConstString(offset + 51, $gi_wg_cd, value);
	}


	/**
	 * Purchase GI location cd. 仕入出庫場所ＣＤ.<p>
	 *
	 */
	public String gi_loc_cd() {
		return getConstString(offset + 52, $gi_loc_cd);
	}

	/**
	 * Purchase GI location cd. 仕入出庫場所ＣＤ.<p>
	 *
	 */
	public void gi_loc_cd(String value) {
		setConstString(offset + 52, $gi_loc_cd, value);
	}


	/**
	 * Purchase GI rack/line cd. 仕入出庫棚・ラインＣＤ.<p>
	 *
	 */
	public String gi_str_ln_cd() {
		return getConstString(offset + 53, $gi_str_ln_cd);
	}

	/**
	 * Purchase GI rack/line cd. 仕入出庫棚・ラインＣＤ.<p>
	 *
	 */
	public void gi_str_ln_cd(String value) {
		setConstString(offset + 53, $gi_str_ln_cd, value);
	}


	/**
	 * Purchase GI SKU cd. 仕入出庫荷姿単位ＣＤ.<p>
	 *
	 */
	public String gi_unit_cd() {
		return getConstString(offset + 54, $gi_unit_cd);
	}

	/**
	 * Purchase GI SKU cd. 仕入出庫荷姿単位ＣＤ.<p>
	 *
	 */
	public void gi_unit_cd(String value) {
		setConstString(offset + 54, $gi_unit_cd, value);
	}


	/**
	 * Multiple details 複数詳細.<p>
	 *
	 */
	public boolean multi_io_flg() {
		return getConstBoolean(offset + 55, $multi_io_flg);
	}

	/**
	 * Multiple details 複数詳細.<p>
	 *
	 */
	public void multi_io_flg(boolean value) {
		setConstBoolean(offset + 55, $multi_io_flg, value);
	}


	/**
	 * Parent purchase result details No. 親仕入実績明細ＮＯ.<p>
	 *
	 */
	public String par_purc_act_d_no() {
		return getConstString(offset + 56, $par_purc_act_d_no);
	}

	/**
	 * Parent purchase result details No. 親仕入実績明細ＮＯ.<p>
	 *
	 */
	public void par_purc_act_d_no(String value) {
		setConstString(offset + 56, $par_purc_act_d_no, value);
	}


	/**
	 * Receipt split recording 入荷分割計上.<p>
	 *
	 */
	public boolean arr_split_flg() {
		return getConstBoolean(offset + 57, $arr_split_flg);
	}

	/**
	 * Receipt split recording 入荷分割計上.<p>
	 *
	 */
	public void arr_split_flg(boolean value) {
		setConstBoolean(offset + 57, $arr_split_flg, value);
	}


	/**
	 * Asset management type 資産管理区分.<p>
	 *
	 */
	public String asset_mng_typ() {
		return getConstString(offset + 58, $asset_mng_typ);
	}

	/**
	 * Asset management type 資産管理区分.<p>
	 *
	 */
	public void asset_mng_typ(String value) {
		setConstString(offset + 58, $asset_mng_typ, value);
	}


	/**
	 * Asset management type name 資産管理区分名.<p>
	 *
	 */
	public String asset_mng_typ_nm() {
		return getConstString(offset + 59, $asset_mng_typ_nm);
	}

	/**
	 * Asset management type name 資産管理区分名.<p>
	 *
	 */
	public void asset_mng_typ_nm(String value) {
		setConstString(offset + 59, $asset_mng_typ_nm, value);
	}


	/**
	 * Item type 品目区分.<p>
	 *
	 */
	public String itm_typ() {
		return getConstString(offset + 60, $itm_typ);
	}

	/**
	 * Item type 品目区分.<p>
	 *
	 */
	public void itm_typ(String value) {
		setConstString(offset + 60, $itm_typ, value);
	}


	/**
	 * Item type name 品目区分名.<p>
	 *
	 */
	public String itm_typ_nm() {
		return getConstString(offset + 61, $itm_typ_nm);
	}

	/**
	 * Item type name 品目区分名.<p>
	 *
	 */
	public void itm_typ_nm(String value) {
		setConstString(offset + 61, $itm_typ_nm, value);
	}


	/**
	 * Item type details cd. 品目区分詳細ＣＤ.<p>
	 *
	 */
	public String itm_typ_d_cd() {
		return getConstString(offset + 62, $itm_typ_d_cd);
	}

	/**
	 * Item type details cd. 品目区分詳細ＣＤ.<p>
	 *
	 */
	public void itm_typ_d_cd(String value) {
		setConstString(offset + 62, $itm_typ_d_cd, value);
	}


	/**
	 * Item type details name 品目区分詳細名.<p>
	 *
	 */
	public String itm_typ_d_nm() {
		return getConstString(offset + 63, $itm_typ_d_nm);
	}

	/**
	 * Item type details name 品目区分詳細名.<p>
	 *
	 */
	public void itm_typ_d_nm(String value) {
		setConstString(offset + 63, $itm_typ_d_nm, value);
	}


	public mcframe.clientMAUB.MAUBP5030.ItmR itm_p(){
		return (mcframe.clientMAUB.MAUBP5030.ItmR) getConstInnerRow(offset + 64, $itm_p);
	}
	
	public void itm_p(mcframe.clientMAUB.MAUBP5030.ItmR row){
		setConstInnerRow(offset + 64, $itm_p, row);
	}


	/**
	 * Item name for I/V Ｉ／Ｖ表記品名.<p>
	 *
	 */
	public String iv_itm_nm() {
		return getConstString(offset + 65, $iv_itm_nm);
	}

	/**
	 * Item name for I/V Ｉ／Ｖ表記品名.<p>
	 *
	 */
	public void iv_itm_nm(String value) {
		setConstString(offset + 65, $iv_itm_nm, value);
	}


	/**
	 * For version control 版管理対象.<p>
	 *
	 */
	public boolean ver_flg() {
		return getConstBoolean(offset + 66, $ver_flg);
	}

	/**
	 * For version control 版管理対象.<p>
	 *
	 */
	public void ver_flg(boolean value) {
		setConstBoolean(offset + 66, $ver_flg, value);
	}


	/**
	 * Lot management type ロット管理区分.<p>
	 *
	 */
	public String lot_mng_typ() {
		return getConstString(offset + 67, $lot_mng_typ);
	}

	/**
	 * Lot management type ロット管理区分.<p>
	 *
	 */
	public void lot_mng_typ(String value) {
		setConstString(offset + 67, $lot_mng_typ, value);
	}


	/**
	 * Sublot management type サブロット管理区分.<p>
	 *
	 */
	public String sublot_mng_typ() {
		return getConstString(offset + 68, $sublot_mng_typ);
	}

	/**
	 * Sublot management type サブロット管理区分.<p>
	 *
	 */
	public void sublot_mng_typ(String value) {
		setConstString(offset + 68, $sublot_mng_typ, value);
	}


	/**
	 * Lot No. numbering type ロットＮＯ発番区分.<p>
	 *
	 */
	public String lot_no_typ() {
		return getConstString(offset + 69, $lot_no_typ);
	}

	/**
	 * Lot No. numbering type ロットＮＯ発番区分.<p>
	 *
	 */
	public void lot_no_typ(String value) {
		setConstString(offset + 69, $lot_no_typ, value);
	}


	/**
	 * Sublot No. numbering type サブロットＮＯ発番区分.<p>
	 *
	 */
	public String sublot_no_typ() {
		return getConstString(offset + 70, $sublot_no_typ);
	}

	/**
	 * Sublot No. numbering type サブロットＮＯ発番区分.<p>
	 *
	 */
	public void sublot_no_typ(String value) {
		setConstString(offset + 70, $sublot_no_typ, value);
	}


	/**
	 * SEIBAN No. 1 management type 手配ＮＯ１管理区分.<p>
	 *
	 */
	public String sno1_mng_typ() {
		return getConstString(offset + 71, $sno1_mng_typ);
	}

	/**
	 * SEIBAN No. 1 management type 手配ＮＯ１管理区分.<p>
	 *
	 */
	public void sno1_mng_typ(String value) {
		setConstString(offset + 71, $sno1_mng_typ, value);
	}


	/**
	 * SEIBAN No. 2 management type 手配ＮＯ２管理区分.<p>
	 *
	 */
	public String sno2_mng_typ() {
		return getConstString(offset + 72, $sno2_mng_typ);
	}

	/**
	 * SEIBAN No. 2 management type 手配ＮＯ２管理区分.<p>
	 *
	 */
	public void sno2_mng_typ(String value) {
		setConstString(offset + 72, $sno2_mng_typ, value);
	}


	/**
	 * SEIBAN No. 3 management type 手配ＮＯ３管理区分.<p>
	 *
	 */
	public String sno3_mng_typ() {
		return getConstString(offset + 73, $sno3_mng_typ);
	}

	/**
	 * SEIBAN No. 3 management type 手配ＮＯ３管理区分.<p>
	 *
	 */
	public void sno3_mng_typ(String value) {
		setConstString(offset + 73, $sno3_mng_typ, value);
	}


	/**
	 * SEIBAN No. 4 management type 手配ＮＯ４管理区分.<p>
	 *
	 */
	public String sno4_mng_typ() {
		return getConstString(offset + 74, $sno4_mng_typ);
	}

	/**
	 * SEIBAN No. 4 management type 手配ＮＯ４管理区分.<p>
	 *
	 */
	public void sno4_mng_typ(String value) {
		setConstString(offset + 74, $sno4_mng_typ, value);
	}


	/**
	 * Inventory management type 在庫管理区分.<p>
	 *
	 */
	public String stk_mng_typ() {
		return getConstString(offset + 75, $stk_mng_typ);
	}

	/**
	 * Inventory management type 在庫管理区分.<p>
	 *
	 */
	public void stk_mng_typ(String value) {
		setConstString(offset + 75, $stk_mng_typ, value);
	}


	/**
	 * Miscellaneous item 諸口品.<p>
	 *
	 */
	public boolean sundry_itm_flg() {
		return getConstBoolean(offset + 76, $sundry_itm_flg);
	}

	/**
	 * Miscellaneous item 諸口品.<p>
	 *
	 */
	public void sundry_itm_flg(boolean value) {
		setConstBoolean(offset + 76, $sundry_itm_flg, value);
	}


	/**
	 * Vendor lot required 業者ロット必須.<p>
	 *
	 */
	public boolean bp_lot_flg() {
		return getConstBoolean(offset + 77, $bp_lot_flg);
	}

	/**
	 * Vendor lot required 業者ロット必須.<p>
	 *
	 */
	public void bp_lot_flg(boolean value) {
		setConstBoolean(offset + 77, $bp_lot_flg, value);
	}


	/**
	 * Discount item 値引品.<p>
	 *
	 */
	public boolean dscnt_itm_flg() {
		return getConstBoolean(offset + 78, $dscnt_itm_flg);
	}

	/**
	 * Discount item 値引品.<p>
	 *
	 */
	public void dscnt_itm_flg(boolean value) {
		setConstBoolean(offset + 78, $dscnt_itm_flg, value);
	}


	/**
	 * Item payment carry-over count 品目支払繰越回数.<p>
	 *
	 */
	public MCNumber itm_pay_crryovr_times() {
		return getConstNumber(offset + 79, $itm_pay_crryovr_times);
	}

	/**
	 * Item payment carry-over count 品目支払繰越回数.<p>
	 *
	 */
	public void itm_pay_crryovr_times(MCNumber value) {
		setConstNumber(offset + 79, $itm_pay_crryovr_times, value);
	}

	/**
	 * Item payment carry-over count 品目支払繰越回数.<p>
	 *
	 */
	public void itm_pay_crryovr_times(int value) {
		setConstNumber(offset + 79, $itm_pay_crryovr_times, value);
	}

	/**
	 * Item payment carry-over count 品目支払繰越回数.<p>
	 *
	 */
	public void itm_pay_crryovr_times(long value) {
		setConstNumber(offset + 79, $itm_pay_crryovr_times, value);
	}

	/**
	 * Item payment carry-over count 品目支払繰越回数.<p>
	 *
	 */
	public void itm_pay_crryovr_times(float value) {
		setConstNumber(offset + 79, $itm_pay_crryovr_times, value);
	}

	/**
	 * Item payment carry-over count 品目支払繰越回数.<p>
	 *
	 */
	public void itm_pay_crryovr_times(double value) {
		setConstNumber(offset + 79, $itm_pay_crryovr_times, value);
	}


	/**
	 * Allow item purchasing unit price change 品目購買単価変更許可.<p>
	 *
	 */
	public boolean itm_purc_upri_cng_flg() {
		return getConstBoolean(offset + 80, $itm_purc_upri_cng_flg);
	}

	/**
	 * Allow item purchasing unit price change 品目購買単価変更許可.<p>
	 *
	 */
	public void itm_purc_upri_cng_flg(boolean value) {
		setConstBoolean(offset + 80, $itm_purc_upri_cng_flg, value);
	}


	public mcframe.clientMAUB.MAUBP5170.ItmGrpR itm_grp_p(){
		return (mcframe.clientMAUB.MAUBP5170.ItmGrpR) getConstInnerRow(offset + 81, $itm_grp_p);
	}
	
	public void itm_grp_p(mcframe.clientMAUB.MAUBP5170.ItmGrpR row){
		setConstInnerRow(offset + 81, $itm_grp_p, row);
	}


	/**
	 * Supplier cd. 発注先ＣＤ.<p>
	 *
	 */
	public String sppl_cd() {
		return getConstString(offset + 82, $sppl_cd);
	}

	/**
	 * Supplier cd. 発注先ＣＤ.<p>
	 *
	 */
	public void sppl_cd(String value) {
		setConstString(offset + 82, $sppl_cd, value);
	}


	/**
	 * Supplier name 発注先名.<p>
	 *
	 */
	public String sppl_nm() {
		return getConstString(offset + 83, $sppl_nm);
	}

	/**
	 * Supplier name 発注先名.<p>
	 *
	 */
	public void sppl_nm(String value) {
		setConstString(offset + 83, $sppl_nm, value);
	}


	/**
	 * Payment per transaction 都度支払.<p>
	 *
	 */
	public boolean pay_spot_flg() {
		return getConstBoolean(offset + 84, $pay_spot_flg);
	}

	/**
	 * Payment per transaction 都度支払.<p>
	 *
	 */
	public void pay_spot_flg(boolean value) {
		setConstBoolean(offset + 84, $pay_spot_flg, value);
	}


	/**
	 * AP credit managed BP cd. 債務与信管理先ＣＤ.<p>
	 *
	 */
	public String ap_cred_cd() {
		return getConstString(offset + 85, $ap_cred_cd);
	}

	/**
	 * AP credit managed BP cd. 債務与信管理先ＣＤ.<p>
	 *
	 */
	public void ap_cred_cd(String value) {
		setConstString(offset + 85, $ap_cred_cd, value);
	}


	/**
	 * Purchase lot details split type 仕入ロット明細分割区分.<p>
	 *
	 */
	public String purc_slip_each_lot_typ() {
		return getConstString(offset + 86, $purc_slip_each_lot_typ);
	}

	/**
	 * Purchase lot details split type 仕入ロット明細分割区分.<p>
	 *
	 */
	public void purc_slip_each_lot_typ(String value) {
		setConstString(offset + 86, $purc_slip_each_lot_typ, value);
	}


	/**
	 * Allow purchasing unit price change 購買単価変更許可.<p>
	 *
	 */
	public boolean purc_upri_cng_flg() {
		return getConstBoolean(offset + 87, $purc_upri_cng_flg);
	}

	/**
	 * Allow purchasing unit price change 購買単価変更許可.<p>
	 *
	 */
	public void purc_upri_cng_flg(boolean value) {
		setConstBoolean(offset + 87, $purc_upri_cng_flg, value);
	}


	/**
	 * For I/V transaction Ｉ／Ｖ取引対象.<p>
	 *
	 */
	public boolean sppl_iv_flg() {
		return getConstBoolean(offset + 88, $sppl_iv_flg);
	}

	/**
	 * For I/V transaction Ｉ／Ｖ取引対象.<p>
	 *
	 */
	public void sppl_iv_flg(boolean value) {
		setConstBoolean(offset + 88, $sppl_iv_flg, value);
	}


	/**
	 * Report output locale cd. 帳票出力ロケールＣＤ.<p>
	 *
	 */
	public String prnt_lcl_cd() {
		return getConstString(offset + 89, $prnt_lcl_cd);
	}

	/**
	 * Report output locale cd. 帳票出力ロケールＣＤ.<p>
	 *
	 */
	public void prnt_lcl_cd(String value) {
		setConstString(offset + 89, $prnt_lcl_cd, value);
	}


	/**
	 * Rounding type (Purchase amount) 仕入金額端数処理区分.<p>
	 *
	 */
	public String purc_amt_rnd_typ() {
		return getConstString(offset + 90, $purc_amt_rnd_typ);
	}

	/**
	 * Rounding type (Purchase amount) 仕入金額端数処理区分.<p>
	 *
	 */
	public void purc_amt_rnd_typ(String value) {
		setConstString(offset + 90, $purc_amt_rnd_typ, value);
	}


	/**
	 * Purchase tax rounding type 仕入税端数処理区分.<p>
	 *
	 */
	public String purc_tax_rnd_typ() {
		return getConstString(offset + 91, $purc_tax_rnd_typ);
	}

	/**
	 * Purchase tax rounding type 仕入税端数処理区分.<p>
	 *
	 */
	public void purc_tax_rnd_typ(String value) {
		setConstString(offset + 91, $purc_tax_rnd_typ, value);
	}


	/**
	 * Purchase tax calculation type 仕入税計算区分.<p>
	 *
	 */
	public String purc_tax_calc_typ() {
		return getConstString(offset + 92, $purc_tax_calc_typ);
	}

	/**
	 * Purchase tax calculation type 仕入税計算区分.<p>
	 *
	 */
	public void purc_tax_calc_typ(String value) {
		setConstString(offset + 92, $purc_tax_calc_typ, value);
	}


	public mcframe.clientMAUB.MAUBP5360.AddrR sppl_addr_p(){
		return (mcframe.clientMAUB.MAUBP5360.AddrR) getConstInnerRow(offset + 93, $sppl_addr_p);
	}
	
	public void sppl_addr_p(mcframe.clientMAUB.MAUBP5360.AddrR row){
		setConstInnerRow(offset + 93, $sppl_addr_p, row);
	}


	/**
	 * For subcontract 下請対象.<p>
	 *
	 */
	public boolean subcon_flg() {
		return getConstBoolean(offset + 94, $subcon_flg);
	}

	/**
	 * For subcontract 下請対象.<p>
	 *
	 */
	public void subcon_flg(boolean value) {
		setConstBoolean(offset + 94, $subcon_flg, value);
	}


	public mcframe.clientMAUB.MAUBP5190.BpGrpR sppl_grp_p(){
		return (mcframe.clientMAUB.MAUBP5190.BpGrpR) getConstInnerRow(offset + 95, $sppl_grp_p);
	}
	
	public void sppl_grp_p(mcframe.clientMAUB.MAUBP5190.BpGrpR row){
		setConstInnerRow(offset + 95, $sppl_grp_p, row);
	}


	/**
	 * AP supplier cd. 買掛先ＣＤ.<p>
	 *
	 */
	public String asppl_cd() {
		return getConstString(offset + 96, $asppl_cd);
	}

	/**
	 * AP supplier cd. 買掛先ＣＤ.<p>
	 *
	 */
	public void asppl_cd(String value) {
		setConstString(offset + 96, $asppl_cd, value);
	}


	/**
	 * AP supplier name 買掛先名.<p>
	 *
	 */
	public String asppl_nm() {
		return getConstString(offset + 97, $asppl_nm);
	}

	/**
	 * AP supplier name 買掛先名.<p>
	 *
	 */
	public void asppl_nm(String value) {
		setConstString(offset + 97, $asppl_nm, value);
	}


	/**
	 * Subcontracting 外注.<p>
	 *
	 */
	public boolean outsrc_flg() {
		return getConstBoolean(offset + 98, $outsrc_flg);
	}

	/**
	 * Subcontracting 外注.<p>
	 *
	 */
	public void outsrc_flg(boolean value) {
		setConstBoolean(offset + 98, $outsrc_flg, value);
	}


	/**
	 * Maker cd. メーカＣＤ.<p>
	 *
	 */
	public String maker_cd() {
		return getConstString(offset + 99, $maker_cd);
	}

	/**
	 * Maker cd. メーカＣＤ.<p>
	 *
	 */
	public void maker_cd(String value) {
		setConstString(offset + 99, $maker_cd, value);
	}


	/**
	 * Maker name メーカ名.<p>
	 *
	 */
	public String maker_nm() {
		return getConstString(offset + 100, $maker_nm);
	}

	/**
	 * Maker name メーカ名.<p>
	 *
	 */
	public void maker_nm(String value) {
		setConstString(offset + 100, $maker_nm, value);
	}


	/**
	 * Defective acceptance 検収不良.<p>
	 *
	 */
	public boolean accpt_dfct_flg() {
		return getConstBoolean(offset + 101, $accpt_dfct_flg);
	}

	/**
	 * Defective acceptance 検収不良.<p>
	 *
	 */
	public void accpt_dfct_flg(boolean value) {
		setConstBoolean(offset + 101, $accpt_dfct_flg, value);
	}


	/**
	 * Transaction unit cd. 取引単位ＣＤ.<p>
	 *
	 */
	public String trd_unit_cd() {
		return getConstString(offset + 102, $trd_unit_cd);
	}

	/**
	 * Transaction unit cd. 取引単位ＣＤ.<p>
	 *
	 */
	public void trd_unit_cd(String value) {
		setConstString(offset + 102, $trd_unit_cd, value);
	}


	/**
	 * Transaction unit name 取引単位名.<p>
	 *
	 */
	public String trd_unit_nm() {
		return getConstString(offset + 103, $trd_unit_nm);
	}

	/**
	 * Transaction unit name 取引単位名.<p>
	 *
	 */
	public void trd_unit_nm(String value) {
		setConstString(offset + 103, $trd_unit_nm, value);
	}


	/**
	 * Transaction unit number of decimal places 取引単位小数部有効桁数.<p>
	 *
	 */
	public MCNumber trd_unit_dec_place() {
		return getConstNumber(offset + 104, $trd_unit_dec_place);
	}

	/**
	 * Transaction unit number of decimal places 取引単位小数部有効桁数.<p>
	 *
	 */
	public void trd_unit_dec_place(MCNumber value) {
		setConstNumber(offset + 104, $trd_unit_dec_place, value);
	}

	/**
	 * Transaction unit number of decimal places 取引単位小数部有効桁数.<p>
	 *
	 */
	public void trd_unit_dec_place(int value) {
		setConstNumber(offset + 104, $trd_unit_dec_place, value);
	}

	/**
	 * Transaction unit number of decimal places 取引単位小数部有効桁数.<p>
	 *
	 */
	public void trd_unit_dec_place(long value) {
		setConstNumber(offset + 104, $trd_unit_dec_place, value);
	}

	/**
	 * Transaction unit number of decimal places 取引単位小数部有効桁数.<p>
	 *
	 */
	public void trd_unit_dec_place(float value) {
		setConstNumber(offset + 104, $trd_unit_dec_place, value);
	}

	/**
	 * Transaction unit number of decimal places 取引単位小数部有効桁数.<p>
	 *
	 */
	public void trd_unit_dec_place(double value) {
		setConstNumber(offset + 104, $trd_unit_dec_place, value);
	}


	/**
	 * Transaction unit rounding type 取引単位端数処理区分.<p>
	 *
	 */
	public String trd_unit_rnd_typ() {
		return getConstString(offset + 105, $trd_unit_rnd_typ);
	}

	/**
	 * Transaction unit rounding type 取引単位端数処理区分.<p>
	 *
	 */
	public void trd_unit_rnd_typ(String value) {
		setConstString(offset + 105, $trd_unit_rnd_typ, value);
	}


	/**
	 * Transaction unit conversion base qty. 取引単位換算基準数量.<p>
	 *
	 */
	public MCNumber trd_unit_conv_base_qty() {
		return getConstNumber(offset + 106, $trd_unit_conv_base_qty);
	}

	/**
	 * Transaction unit conversion base qty. 取引単位換算基準数量.<p>
	 *
	 */
	public void trd_unit_conv_base_qty(MCNumber value) {
		setConstNumber(offset + 106, $trd_unit_conv_base_qty, value);
	}

	/**
	 * Transaction unit conversion base qty. 取引単位換算基準数量.<p>
	 *
	 */
	public void trd_unit_conv_base_qty(int value) {
		setConstNumber(offset + 106, $trd_unit_conv_base_qty, value);
	}

	/**
	 * Transaction unit conversion base qty. 取引単位換算基準数量.<p>
	 *
	 */
	public void trd_unit_conv_base_qty(long value) {
		setConstNumber(offset + 106, $trd_unit_conv_base_qty, value);
	}

	/**
	 * Transaction unit conversion base qty. 取引単位換算基準数量.<p>
	 *
	 */
	public void trd_unit_conv_base_qty(float value) {
		setConstNumber(offset + 106, $trd_unit_conv_base_qty, value);
	}

	/**
	 * Transaction unit conversion base qty. 取引単位換算基準数量.<p>
	 *
	 */
	public void trd_unit_conv_base_qty(double value) {
		setConstNumber(offset + 106, $trd_unit_conv_base_qty, value);
	}


	/**
	 * Transaction unit conversion qty. 取引単位換算数量.<p>
	 *
	 */
	public MCNumber trd_unit_conv_qty() {
		return getConstNumber(offset + 107, $trd_unit_conv_qty);
	}

	/**
	 * Transaction unit conversion qty. 取引単位換算数量.<p>
	 *
	 */
	public void trd_unit_conv_qty(MCNumber value) {
		setConstNumber(offset + 107, $trd_unit_conv_qty, value);
	}

	/**
	 * Transaction unit conversion qty. 取引単位換算数量.<p>
	 *
	 */
	public void trd_unit_conv_qty(int value) {
		setConstNumber(offset + 107, $trd_unit_conv_qty, value);
	}

	/**
	 * Transaction unit conversion qty. 取引単位換算数量.<p>
	 *
	 */
	public void trd_unit_conv_qty(long value) {
		setConstNumber(offset + 107, $trd_unit_conv_qty, value);
	}

	/**
	 * Transaction unit conversion qty. 取引単位換算数量.<p>
	 *
	 */
	public void trd_unit_conv_qty(float value) {
		setConstNumber(offset + 107, $trd_unit_conv_qty, value);
	}

	/**
	 * Transaction unit conversion qty. 取引単位換算数量.<p>
	 *
	 */
	public void trd_unit_conv_qty(double value) {
		setConstNumber(offset + 107, $trd_unit_conv_qty, value);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR trd_unit_qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 108, $trd_unit_qty_p);
	}
	
	public void trd_unit_qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 108, $trd_unit_qty_p, row);
	}


	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public String base_unit_cd() {
		return getConstString(offset + 109, $base_unit_cd);
	}

	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public void base_unit_cd(String value) {
		setConstString(offset + 109, $base_unit_cd, value);
	}


	/**
	 * Base unit name 基準単位名.<p>
	 *
	 */
	public String base_unit_nm() {
		return getConstString(offset + 110, $base_unit_nm);
	}

	/**
	 * Base unit name 基準単位名.<p>
	 *
	 */
	public void base_unit_nm(String value) {
		setConstString(offset + 110, $base_unit_nm, value);
	}


	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public MCNumber base_unit_dec_place() {
		return getConstNumber(offset + 111, $base_unit_dec_place);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(MCNumber value) {
		setConstNumber(offset + 111, $base_unit_dec_place, value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(int value) {
		setConstNumber(offset + 111, $base_unit_dec_place, value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(long value) {
		setConstNumber(offset + 111, $base_unit_dec_place, value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(float value) {
		setConstNumber(offset + 111, $base_unit_dec_place, value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(double value) {
		setConstNumber(offset + 111, $base_unit_dec_place, value);
	}


	/**
	 * Base unit rounding type 基準単位端数処理区分.<p>
	 *
	 */
	public String base_unit_rnd_typ() {
		return getConstString(offset + 112, $base_unit_rnd_typ);
	}

	/**
	 * Base unit rounding type 基準単位端数処理区分.<p>
	 *
	 */
	public void base_unit_rnd_typ(String value) {
		setConstString(offset + 112, $base_unit_rnd_typ, value);
	}


	public MCNumber peg_no() {
		return getConstNumber(offset + 113, $peg_no);
	}

	public void peg_no(MCNumber value) {
		setConstNumber(offset + 113, $peg_no, value);
	}

	public void peg_no(int value) {
		setConstNumber(offset + 113, $peg_no, value);
	}

	public void peg_no(long value) {
		setConstNumber(offset + 113, $peg_no, value);
	}

	public void peg_no(float value) {
		setConstNumber(offset + 113, $peg_no, value);
	}

	public void peg_no(double value) {
		setConstNumber(offset + 113, $peg_no, value);
	}


	/**
	 * Transaction unit cd. at PO 発注時取引単位ＣＤ.<p>
	 *
	 */
	public String src_trd_unit_cd() {
		return getConstString(offset + 114, $src_trd_unit_cd);
	}

	/**
	 * Transaction unit cd. at PO 発注時取引単位ＣＤ.<p>
	 *
	 */
	public void src_trd_unit_cd(String value) {
		setConstString(offset + 114, $src_trd_unit_cd, value);
	}


	/**
	 * Transaction unit conversion qty. at PO 発注時取引単位換算数量.<p>
	 *
	 */
	public MCNumber src_trd_unit_conv_qty() {
		return getConstNumber(offset + 115, $src_trd_unit_conv_qty);
	}

	/**
	 * Transaction unit conversion qty. at PO 発注時取引単位換算数量.<p>
	 *
	 */
	public void src_trd_unit_conv_qty(MCNumber value) {
		setConstNumber(offset + 115, $src_trd_unit_conv_qty, value);
	}

	/**
	 * Transaction unit conversion qty. at PO 発注時取引単位換算数量.<p>
	 *
	 */
	public void src_trd_unit_conv_qty(int value) {
		setConstNumber(offset + 115, $src_trd_unit_conv_qty, value);
	}

	/**
	 * Transaction unit conversion qty. at PO 発注時取引単位換算数量.<p>
	 *
	 */
	public void src_trd_unit_conv_qty(long value) {
		setConstNumber(offset + 115, $src_trd_unit_conv_qty, value);
	}

	/**
	 * Transaction unit conversion qty. at PO 発注時取引単位換算数量.<p>
	 *
	 */
	public void src_trd_unit_conv_qty(float value) {
		setConstNumber(offset + 115, $src_trd_unit_conv_qty, value);
	}

	/**
	 * Transaction unit conversion qty. at PO 発注時取引単位換算数量.<p>
	 *
	 */
	public void src_trd_unit_conv_qty(double value) {
		setConstNumber(offset + 115, $src_trd_unit_conv_qty, value);
	}


	/**
	 * Transaction unit conversion base qty. at PO 発注時取引単位換算基準数量.<p>
	 *
	 */
	public MCNumber src_trd_unit_conv_base_qty() {
		return getConstNumber(offset + 116, $src_trd_unit_conv_base_qty);
	}

	/**
	 * Transaction unit conversion base qty. at PO 発注時取引単位換算基準数量.<p>
	 *
	 */
	public void src_trd_unit_conv_base_qty(MCNumber value) {
		setConstNumber(offset + 116, $src_trd_unit_conv_base_qty, value);
	}

	/**
	 * Transaction unit conversion base qty. at PO 発注時取引単位換算基準数量.<p>
	 *
	 */
	public void src_trd_unit_conv_base_qty(int value) {
		setConstNumber(offset + 116, $src_trd_unit_conv_base_qty, value);
	}

	/**
	 * Transaction unit conversion base qty. at PO 発注時取引単位換算基準数量.<p>
	 *
	 */
	public void src_trd_unit_conv_base_qty(long value) {
		setConstNumber(offset + 116, $src_trd_unit_conv_base_qty, value);
	}

	/**
	 * Transaction unit conversion base qty. at PO 発注時取引単位換算基準数量.<p>
	 *
	 */
	public void src_trd_unit_conv_base_qty(float value) {
		setConstNumber(offset + 116, $src_trd_unit_conv_base_qty, value);
	}

	/**
	 * Transaction unit conversion base qty. at PO 発注時取引単位換算基準数量.<p>
	 *
	 */
	public void src_trd_unit_conv_base_qty(double value) {
		setConstNumber(offset + 116, $src_trd_unit_conv_base_qty, value);
	}


	/**
	 * Transaction unit number of decimal places at PO 発注時取引単位小数部有効桁数.<p>
	 *
	 */
	public MCNumber src_trd_unit_dec_place() {
		return getConstNumber(offset + 117, $src_trd_unit_dec_place);
	}

	/**
	 * Transaction unit number of decimal places at PO 発注時取引単位小数部有効桁数.<p>
	 *
	 */
	public void src_trd_unit_dec_place(MCNumber value) {
		setConstNumber(offset + 117, $src_trd_unit_dec_place, value);
	}

	/**
	 * Transaction unit number of decimal places at PO 発注時取引単位小数部有効桁数.<p>
	 *
	 */
	public void src_trd_unit_dec_place(int value) {
		setConstNumber(offset + 117, $src_trd_unit_dec_place, value);
	}

	/**
	 * Transaction unit number of decimal places at PO 発注時取引単位小数部有効桁数.<p>
	 *
	 */
	public void src_trd_unit_dec_place(long value) {
		setConstNumber(offset + 117, $src_trd_unit_dec_place, value);
	}

	/**
	 * Transaction unit number of decimal places at PO 発注時取引単位小数部有効桁数.<p>
	 *
	 */
	public void src_trd_unit_dec_place(float value) {
		setConstNumber(offset + 117, $src_trd_unit_dec_place, value);
	}

	/**
	 * Transaction unit number of decimal places at PO 発注時取引単位小数部有効桁数.<p>
	 *
	 */
	public void src_trd_unit_dec_place(double value) {
		setConstNumber(offset + 117, $src_trd_unit_dec_place, value);
	}


	/**
	 * Transaction unit rounding type at PO 発注時取引単位端数処理区分.<p>
	 *
	 */
	public String src_trd_unit_rnd_typ() {
		return getConstString(offset + 118, $src_trd_unit_rnd_typ);
	}

	/**
	 * Transaction unit rounding type at PO 発注時取引単位端数処理区分.<p>
	 *
	 */
	public void src_trd_unit_rnd_typ(String value) {
		setConstString(offset + 118, $src_trd_unit_rnd_typ, value);
	}


	/**
	 * Transaction unit qty. at PO 発注時取引単位数量.<p>
	 *
	 */
	public MCNumber src_trd_unit_qty() {
		return getConstNumber(offset + 119, $src_trd_unit_qty);
	}

	/**
	 * Transaction unit qty. at PO 発注時取引単位数量.<p>
	 *
	 */
	public void src_trd_unit_qty(MCNumber value) {
		setConstNumber(offset + 119, $src_trd_unit_qty, value);
	}

	/**
	 * Transaction unit qty. at PO 発注時取引単位数量.<p>
	 *
	 */
	public void src_trd_unit_qty(int value) {
		setConstNumber(offset + 119, $src_trd_unit_qty, value);
	}

	/**
	 * Transaction unit qty. at PO 発注時取引単位数量.<p>
	 *
	 */
	public void src_trd_unit_qty(long value) {
		setConstNumber(offset + 119, $src_trd_unit_qty, value);
	}

	/**
	 * Transaction unit qty. at PO 発注時取引単位数量.<p>
	 *
	 */
	public void src_trd_unit_qty(float value) {
		setConstNumber(offset + 119, $src_trd_unit_qty, value);
	}

	/**
	 * Transaction unit qty. at PO 発注時取引単位数量.<p>
	 *
	 */
	public void src_trd_unit_qty(double value) {
		setConstNumber(offset + 119, $src_trd_unit_qty, value);
	}


	/**
	 * Amount at PO (Transaction currency) 発注時取引通貨金額.<p>
	 *
	 */
	public MCNumber src_trd_cur_amt() {
		return getConstNumber(offset + 120, $src_trd_cur_amt);
	}

	/**
	 * Amount at PO (Transaction currency) 発注時取引通貨金額.<p>
	 *
	 */
	public void src_trd_cur_amt(MCNumber value) {
		setConstNumber(offset + 120, $src_trd_cur_amt, value);
	}

	/**
	 * Amount at PO (Transaction currency) 発注時取引通貨金額.<p>
	 *
	 */
	public void src_trd_cur_amt(int value) {
		setConstNumber(offset + 120, $src_trd_cur_amt, value);
	}

	/**
	 * Amount at PO (Transaction currency) 発注時取引通貨金額.<p>
	 *
	 */
	public void src_trd_cur_amt(long value) {
		setConstNumber(offset + 120, $src_trd_cur_amt, value);
	}

	/**
	 * Amount at PO (Transaction currency) 発注時取引通貨金額.<p>
	 *
	 */
	public void src_trd_cur_amt(float value) {
		setConstNumber(offset + 120, $src_trd_cur_amt, value);
	}

	/**
	 * Amount at PO (Transaction currency) 発注時取引通貨金額.<p>
	 *
	 */
	public void src_trd_cur_amt(double value) {
		setConstNumber(offset + 120, $src_trd_cur_amt, value);
	}


	/**
	 * Discount amount at PO (Transaction currency) 発注時取引通貨値引額.<p>
	 *
	 */
	public MCNumber src_trd_cur_dscnt_amt() {
		return getConstNumber(offset + 121, $src_trd_cur_dscnt_amt);
	}

	/**
	 * Discount amount at PO (Transaction currency) 発注時取引通貨値引額.<p>
	 *
	 */
	public void src_trd_cur_dscnt_amt(MCNumber value) {
		setConstNumber(offset + 121, $src_trd_cur_dscnt_amt, value);
	}

	/**
	 * Discount amount at PO (Transaction currency) 発注時取引通貨値引額.<p>
	 *
	 */
	public void src_trd_cur_dscnt_amt(int value) {
		setConstNumber(offset + 121, $src_trd_cur_dscnt_amt, value);
	}

	/**
	 * Discount amount at PO (Transaction currency) 発注時取引通貨値引額.<p>
	 *
	 */
	public void src_trd_cur_dscnt_amt(long value) {
		setConstNumber(offset + 121, $src_trd_cur_dscnt_amt, value);
	}

	/**
	 * Discount amount at PO (Transaction currency) 発注時取引通貨値引額.<p>
	 *
	 */
	public void src_trd_cur_dscnt_amt(float value) {
		setConstNumber(offset + 121, $src_trd_cur_dscnt_amt, value);
	}

	/**
	 * Discount amount at PO (Transaction currency) 発注時取引通貨値引額.<p>
	 *
	 */
	public void src_trd_cur_dscnt_amt(double value) {
		setConstNumber(offset + 121, $src_trd_cur_dscnt_amt, value);
	}


	/**
	 * Chargeable supply amount at PO (Transaction currency) 発注時取引通貨有償支給金額.<p>
	 *
	 */
	public MCNumber src_trd_cur_onr_prov_amt() {
		return getConstNumber(offset + 122, $src_trd_cur_onr_prov_amt);
	}

	/**
	 * Chargeable supply amount at PO (Transaction currency) 発注時取引通貨有償支給金額.<p>
	 *
	 */
	public void src_trd_cur_onr_prov_amt(MCNumber value) {
		setConstNumber(offset + 122, $src_trd_cur_onr_prov_amt, value);
	}

	/**
	 * Chargeable supply amount at PO (Transaction currency) 発注時取引通貨有償支給金額.<p>
	 *
	 */
	public void src_trd_cur_onr_prov_amt(int value) {
		setConstNumber(offset + 122, $src_trd_cur_onr_prov_amt, value);
	}

	/**
	 * Chargeable supply amount at PO (Transaction currency) 発注時取引通貨有償支給金額.<p>
	 *
	 */
	public void src_trd_cur_onr_prov_amt(long value) {
		setConstNumber(offset + 122, $src_trd_cur_onr_prov_amt, value);
	}

	/**
	 * Chargeable supply amount at PO (Transaction currency) 発注時取引通貨有償支給金額.<p>
	 *
	 */
	public void src_trd_cur_onr_prov_amt(float value) {
		setConstNumber(offset + 122, $src_trd_cur_onr_prov_amt, value);
	}

	/**
	 * Chargeable supply amount at PO (Transaction currency) 発注時取引通貨有償支給金額.<p>
	 *
	 */
	public void src_trd_cur_onr_prov_amt(double value) {
		setConstNumber(offset + 122, $src_trd_cur_onr_prov_amt, value);
	}


	/**
	 * Chargeable supply unit price at PO (Transaction currency) 発注時取引通貨有償支給単価.<p>
	 *
	 */
	public MCNumber src_trd_cur_onr_prov_upri() {
		return getConstNumber(offset + 123, $src_trd_cur_onr_prov_upri);
	}

	/**
	 * Chargeable supply unit price at PO (Transaction currency) 発注時取引通貨有償支給単価.<p>
	 *
	 */
	public void src_trd_cur_onr_prov_upri(MCNumber value) {
		setConstNumber(offset + 123, $src_trd_cur_onr_prov_upri, value);
	}

	/**
	 * Chargeable supply unit price at PO (Transaction currency) 発注時取引通貨有償支給単価.<p>
	 *
	 */
	public void src_trd_cur_onr_prov_upri(int value) {
		setConstNumber(offset + 123, $src_trd_cur_onr_prov_upri, value);
	}

	/**
	 * Chargeable supply unit price at PO (Transaction currency) 発注時取引通貨有償支給単価.<p>
	 *
	 */
	public void src_trd_cur_onr_prov_upri(long value) {
		setConstNumber(offset + 123, $src_trd_cur_onr_prov_upri, value);
	}

	/**
	 * Chargeable supply unit price at PO (Transaction currency) 発注時取引通貨有償支給単価.<p>
	 *
	 */
	public void src_trd_cur_onr_prov_upri(float value) {
		setConstNumber(offset + 123, $src_trd_cur_onr_prov_upri, value);
	}

	/**
	 * Chargeable supply unit price at PO (Transaction currency) 発注時取引通貨有償支給単価.<p>
	 *
	 */
	public void src_trd_cur_onr_prov_upri(double value) {
		setConstNumber(offset + 123, $src_trd_cur_onr_prov_upri, value);
	}


	/**
	 * Subcontracting amount price at PO (Transaction currency) 発注時取引通貨加工金額.<p>
	 *
	 */
	public MCNumber src_trd_cur_proc_amt() {
		return getConstNumber(offset + 124, $src_trd_cur_proc_amt);
	}

	/**
	 * Subcontracting amount price at PO (Transaction currency) 発注時取引通貨加工金額.<p>
	 *
	 */
	public void src_trd_cur_proc_amt(MCNumber value) {
		setConstNumber(offset + 124, $src_trd_cur_proc_amt, value);
	}

	/**
	 * Subcontracting amount price at PO (Transaction currency) 発注時取引通貨加工金額.<p>
	 *
	 */
	public void src_trd_cur_proc_amt(int value) {
		setConstNumber(offset + 124, $src_trd_cur_proc_amt, value);
	}

	/**
	 * Subcontracting amount price at PO (Transaction currency) 発注時取引通貨加工金額.<p>
	 *
	 */
	public void src_trd_cur_proc_amt(long value) {
		setConstNumber(offset + 124, $src_trd_cur_proc_amt, value);
	}

	/**
	 * Subcontracting amount price at PO (Transaction currency) 発注時取引通貨加工金額.<p>
	 *
	 */
	public void src_trd_cur_proc_amt(float value) {
		setConstNumber(offset + 124, $src_trd_cur_proc_amt, value);
	}

	/**
	 * Subcontracting amount price at PO (Transaction currency) 発注時取引通貨加工金額.<p>
	 *
	 */
	public void src_trd_cur_proc_amt(double value) {
		setConstNumber(offset + 124, $src_trd_cur_proc_amt, value);
	}


	/**
	 * Subcontracting unit price at PO (Transaction currency) 発注時取引通貨加工単価.<p>
	 *
	 */
	public MCNumber src_trd_cur_proc_upri() {
		return getConstNumber(offset + 125, $src_trd_cur_proc_upri);
	}

	/**
	 * Subcontracting unit price at PO (Transaction currency) 発注時取引通貨加工単価.<p>
	 *
	 */
	public void src_trd_cur_proc_upri(MCNumber value) {
		setConstNumber(offset + 125, $src_trd_cur_proc_upri, value);
	}

	/**
	 * Subcontracting unit price at PO (Transaction currency) 発注時取引通貨加工単価.<p>
	 *
	 */
	public void src_trd_cur_proc_upri(int value) {
		setConstNumber(offset + 125, $src_trd_cur_proc_upri, value);
	}

	/**
	 * Subcontracting unit price at PO (Transaction currency) 発注時取引通貨加工単価.<p>
	 *
	 */
	public void src_trd_cur_proc_upri(long value) {
		setConstNumber(offset + 125, $src_trd_cur_proc_upri, value);
	}

	/**
	 * Subcontracting unit price at PO (Transaction currency) 発注時取引通貨加工単価.<p>
	 *
	 */
	public void src_trd_cur_proc_upri(float value) {
		setConstNumber(offset + 125, $src_trd_cur_proc_upri, value);
	}

	/**
	 * Subcontracting unit price at PO (Transaction currency) 発注時取引通貨加工単価.<p>
	 *
	 */
	public void src_trd_cur_proc_upri(double value) {
		setConstNumber(offset + 125, $src_trd_cur_proc_upri, value);
	}


	/**
	 * Amount at PO (Transaction currency) 発注時取引通貨金額.<p>
	 *
	 */
	public MCNumber src_trd_cur_tax_amt() {
		return getConstNumber(offset + 126, $src_trd_cur_tax_amt);
	}

	/**
	 * Amount at PO (Transaction currency) 発注時取引通貨金額.<p>
	 *
	 */
	public void src_trd_cur_tax_amt(MCNumber value) {
		setConstNumber(offset + 126, $src_trd_cur_tax_amt, value);
	}

	/**
	 * Amount at PO (Transaction currency) 発注時取引通貨金額.<p>
	 *
	 */
	public void src_trd_cur_tax_amt(int value) {
		setConstNumber(offset + 126, $src_trd_cur_tax_amt, value);
	}

	/**
	 * Amount at PO (Transaction currency) 発注時取引通貨金額.<p>
	 *
	 */
	public void src_trd_cur_tax_amt(long value) {
		setConstNumber(offset + 126, $src_trd_cur_tax_amt, value);
	}

	/**
	 * Amount at PO (Transaction currency) 発注時取引通貨金額.<p>
	 *
	 */
	public void src_trd_cur_tax_amt(float value) {
		setConstNumber(offset + 126, $src_trd_cur_tax_amt, value);
	}

	/**
	 * Amount at PO (Transaction currency) 発注時取引通貨金額.<p>
	 *
	 */
	public void src_trd_cur_tax_amt(double value) {
		setConstNumber(offset + 126, $src_trd_cur_tax_amt, value);
	}


	/**
	 * Unit price at PO (Transaction currency) 発注時取引通貨単価.<p>
	 *
	 */
	public MCNumber src_trd_cur_upri() {
		return getConstNumber(offset + 127, $src_trd_cur_upri);
	}

	/**
	 * Unit price at PO (Transaction currency) 発注時取引通貨単価.<p>
	 *
	 */
	public void src_trd_cur_upri(MCNumber value) {
		setConstNumber(offset + 127, $src_trd_cur_upri, value);
	}

	/**
	 * Unit price at PO (Transaction currency) 発注時取引通貨単価.<p>
	 *
	 */
	public void src_trd_cur_upri(int value) {
		setConstNumber(offset + 127, $src_trd_cur_upri, value);
	}

	/**
	 * Unit price at PO (Transaction currency) 発注時取引通貨単価.<p>
	 *
	 */
	public void src_trd_cur_upri(long value) {
		setConstNumber(offset + 127, $src_trd_cur_upri, value);
	}

	/**
	 * Unit price at PO (Transaction currency) 発注時取引通貨単価.<p>
	 *
	 */
	public void src_trd_cur_upri(float value) {
		setConstNumber(offset + 127, $src_trd_cur_upri, value);
	}

	/**
	 * Unit price at PO (Transaction currency) 発注時取引通貨単価.<p>
	 *
	 */
	public void src_trd_cur_upri(double value) {
		setConstNumber(offset + 127, $src_trd_cur_upri, value);
	}


	/**
	 * Withholding tax rate at PO 発注時源泉税率.<p>
	 *
	 */
	public MCNumber src_wtax_rate() {
		return getConstNumber(offset + 128, $src_wtax_rate);
	}

	/**
	 * Withholding tax rate at PO 発注時源泉税率.<p>
	 *
	 */
	public void src_wtax_rate(MCNumber value) {
		setConstNumber(offset + 128, $src_wtax_rate, value);
	}

	/**
	 * Withholding tax rate at PO 発注時源泉税率.<p>
	 *
	 */
	public void src_wtax_rate(int value) {
		setConstNumber(offset + 128, $src_wtax_rate, value);
	}

	/**
	 * Withholding tax rate at PO 発注時源泉税率.<p>
	 *
	 */
	public void src_wtax_rate(long value) {
		setConstNumber(offset + 128, $src_wtax_rate, value);
	}

	/**
	 * Withholding tax rate at PO 発注時源泉税率.<p>
	 *
	 */
	public void src_wtax_rate(float value) {
		setConstNumber(offset + 128, $src_wtax_rate, value);
	}

	/**
	 * Withholding tax rate at PO 発注時源泉税率.<p>
	 *
	 */
	public void src_wtax_rate(double value) {
		setConstNumber(offset + 128, $src_wtax_rate, value);
	}


	/**
	 * Tax rate at PO 発注時税率.<p>
	 *
	 */
	public MCNumber src_tax_rate() {
		return getConstNumber(offset + 129, $src_tax_rate);
	}

	/**
	 * Tax rate at PO 発注時税率.<p>
	 *
	 */
	public void src_tax_rate(MCNumber value) {
		setConstNumber(offset + 129, $src_tax_rate, value);
	}

	/**
	 * Tax rate at PO 発注時税率.<p>
	 *
	 */
	public void src_tax_rate(int value) {
		setConstNumber(offset + 129, $src_tax_rate, value);
	}

	/**
	 * Tax rate at PO 発注時税率.<p>
	 *
	 */
	public void src_tax_rate(long value) {
		setConstNumber(offset + 129, $src_tax_rate, value);
	}

	/**
	 * Tax rate at PO 発注時税率.<p>
	 *
	 */
	public void src_tax_rate(float value) {
		setConstNumber(offset + 129, $src_tax_rate, value);
	}

	/**
	 * Tax rate at PO 発注時税率.<p>
	 *
	 */
	public void src_tax_rate(double value) {
		setConstNumber(offset + 129, $src_tax_rate, value);
	}


	/**
	 * Tax inclusive flg. at PO 発注時内税ＦＬＧ.<p>
	 *
	 */
	public boolean src_inc_tax_flg() {
		return getConstBoolean(offset + 130, $src_inc_tax_flg);
	}

	/**
	 * Tax inclusive flg. at PO 発注時内税ＦＬＧ.<p>
	 *
	 */
	public void src_inc_tax_flg(boolean value) {
		setConstBoolean(offset + 130, $src_inc_tax_flg, value);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR base_unit_qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 131, $base_unit_qty_p);
	}
	
	public void base_unit_qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 131, $base_unit_qty_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR base_unit_qty_bef_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 132, $base_unit_qty_bef_p);
	}
	
	public void base_unit_qty_bef_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 132, $base_unit_qty_bef_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR po_qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 133, $po_qty_p);
	}
	
	public void po_qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 133, $po_qty_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR arr_qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 134, $arr_qty_p);
	}
	
	public void arr_qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 134, $arr_qty_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR purc_schd_qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 135, $purc_schd_qty_p);
	}
	
	public void purc_schd_qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 135, $purc_schd_qty_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR purc_qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 136, $purc_qty_p);
	}
	
	public void purc_qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 136, $purc_qty_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR accpt_dfct_qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 137, $accpt_dfct_qty_p);
	}
	
	public void accpt_dfct_qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 137, $accpt_dfct_qty_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR abort_qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 138, $abort_qty_p);
	}
	
	public void abort_qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 138, $abort_qty_p, row);
	}


	/**
	 * Purchase progress rate 仕入進捗率.<p>
	 *
	 */
	public MCNumber purc_prgrs() {
		return getConstNumber(offset + 139, $purc_prgrs);
	}

	/**
	 * Purchase progress rate 仕入進捗率.<p>
	 *
	 */
	public void purc_prgrs(MCNumber value) {
		setConstNumber(offset + 139, $purc_prgrs, value);
	}

	/**
	 * Purchase progress rate 仕入進捗率.<p>
	 *
	 */
	public void purc_prgrs(int value) {
		setConstNumber(offset + 139, $purc_prgrs, value);
	}

	/**
	 * Purchase progress rate 仕入進捗率.<p>
	 *
	 */
	public void purc_prgrs(long value) {
		setConstNumber(offset + 139, $purc_prgrs, value);
	}

	/**
	 * Purchase progress rate 仕入進捗率.<p>
	 *
	 */
	public void purc_prgrs(float value) {
		setConstNumber(offset + 139, $purc_prgrs, value);
	}

	/**
	 * Purchase progress rate 仕入進捗率.<p>
	 *
	 */
	public void purc_prgrs(double value) {
		setConstNumber(offset + 139, $purc_prgrs, value);
	}


	/**
	 * Re-receipt 再入荷.<p>
	 *
	 */
	public boolean re_arr_flg() {
		return getConstBoolean(offset + 140, $re_arr_flg);
	}

	/**
	 * Re-receipt 再入荷.<p>
	 *
	 */
	public void re_arr_flg(boolean value) {
		setConstBoolean(offset + 140, $re_arr_flg, value);
	}


	/**
	 * Re-receipt location WG 再入荷場所ＷＧ.<p>
	 *
	 */
	public String re_arr_loc_wg_cd() {
		return getConstString(offset + 141, $re_arr_loc_wg_cd);
	}

	/**
	 * Re-receipt location WG 再入荷場所ＷＧ.<p>
	 *
	 */
	public void re_arr_loc_wg_cd(String value) {
		setConstString(offset + 141, $re_arr_loc_wg_cd, value);
	}


	/**
	 * Re-receipt location WG name 再入荷場所ＷＧ名.<p>
	 *
	 */
	public String re_arr_loc_wg_nm() {
		return getConstString(offset + 142, $re_arr_loc_wg_nm);
	}

	/**
	 * Re-receipt location WG name 再入荷場所ＷＧ名.<p>
	 *
	 */
	public void re_arr_loc_wg_nm(String value) {
		setConstString(offset + 142, $re_arr_loc_wg_nm, value);
	}


	/**
	 * Re-receipt location cd. 再入荷場所ＣＤ.<p>
	 *
	 */
	public String re_arr_loc_cd() {
		return getConstString(offset + 143, $re_arr_loc_cd);
	}

	/**
	 * Re-receipt location cd. 再入荷場所ＣＤ.<p>
	 *
	 */
	public void re_arr_loc_cd(String value) {
		setConstString(offset + 143, $re_arr_loc_cd, value);
	}


	/**
	 * Re-receipt location name 再入荷場所名.<p>
	 *
	 */
	public String re_arr_loc_nm() {
		return getConstString(offset + 144, $re_arr_loc_nm);
	}

	/**
	 * Re-receipt location name 再入荷場所名.<p>
	 *
	 */
	public void re_arr_loc_nm(String value) {
		setConstString(offset + 144, $re_arr_loc_nm, value);
	}


	/**
	 * For re-receipt rack/line 再入荷棚・ライン対象.<p>
	 *
	 */
	public boolean re_arr_str_ln_tgt_flg() {
		return getConstBoolean(offset + 145, $re_arr_str_ln_tgt_flg);
	}

	/**
	 * For re-receipt rack/line 再入荷棚・ライン対象.<p>
	 *
	 */
	public void re_arr_str_ln_tgt_flg(boolean value) {
		setConstBoolean(offset + 145, $re_arr_str_ln_tgt_flg, value);
	}


	public mcframe.clientMAUB.MAUBP5120.StrLnR re_arr_str_ln_p(){
		return (mcframe.clientMAUB.MAUBP5120.StrLnR) getConstInnerRow(offset + 146, $re_arr_str_ln_p);
	}
	
	public void re_arr_str_ln_p(mcframe.clientMAUB.MAUBP5120.StrLnR row){
		setConstInnerRow(offset + 146, $re_arr_str_ln_p, row);
	}


	/**
	 * Re-receipt factory/distribution warehouse cd. 再入荷場所工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public String re_arr_loc_site_cd() {
		return getConstString(offset + 147, $re_arr_loc_site_cd);
	}

	/**
	 * Re-receipt factory/distribution warehouse cd. 再入荷場所工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public void re_arr_loc_site_cd(String value) {
		setConstString(offset + 147, $re_arr_loc_site_cd, value);
	}


	/**
	 * Re-receipt location calendar cd. 再入荷場所カレンダＣＤ.<p>
	 *
	 */
	public String re_arr_loc_cal_cd() {
		return getConstString(offset + 148, $re_arr_loc_cal_cd);
	}

	/**
	 * Re-receipt location calendar cd. 再入荷場所カレンダＣＤ.<p>
	 *
	 */
	public void re_arr_loc_cal_cd(String value) {
		setConstString(offset + 148, $re_arr_loc_cal_cd, value);
	}


	/**
	 * Re-receipt location Subcontractor cd. 再入荷場所外注発注先ＣＤ.<p>
	 *
	 */
	public String re_arr_loc_sppl_cd() {
		return getConstString(offset + 149, $re_arr_loc_sppl_cd);
	}

	/**
	 * Re-receipt location Subcontractor cd. 再入荷場所外注発注先ＣＤ.<p>
	 *
	 */
	public void re_arr_loc_sppl_cd(String value) {
		setConstString(offset + 149, $re_arr_loc_sppl_cd, value);
	}


	/**
	 * Re-receipt location Subcontractor calendar cd. 再入荷場所外注発注先カレンダＣＤ.<p>
	 *
	 */
	public String re_arr_loc_sppl_cal_cd() {
		return getConstString(offset + 150, $re_arr_loc_sppl_cal_cd);
	}

	/**
	 * Re-receipt location Subcontractor calendar cd. 再入荷場所外注発注先カレンダＣＤ.<p>
	 *
	 */
	public void re_arr_loc_sppl_cal_cd(String value) {
		setConstString(offset + 150, $re_arr_loc_sppl_cal_cd, value);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR re_arr_qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 151, $re_arr_qty_p);
	}
	
	public void re_arr_qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 151, $re_arr_qty_p, row);
	}


	public mcframe.clientMAUB.MAUBP5320.YmdHmR re_arr_rqst_tm_p(){
		return (mcframe.clientMAUB.MAUBP5320.YmdHmR) getConstInnerRow(offset + 152, $re_arr_rqst_tm_p);
	}
	
	public void re_arr_rqst_tm_p(mcframe.clientMAUB.MAUBP5320.YmdHmR row){
		setConstInnerRow(offset + 152, $re_arr_rqst_tm_p, row);
	}


	/**
	 * Scheduled re-receipt purchase date 再入荷仕入予定日.<p>
	 *
	 */
	public MCDate re_arr_purc_schd_dt() {
		return getConstDate(offset + 153, $re_arr_purc_schd_dt);
	}

	/**
	 * Scheduled re-receipt purchase date 再入荷仕入予定日.<p>
	 *
	 */
	public void re_arr_purc_schd_dt(MCDate value) {
		setConstDate(offset + 153, $re_arr_purc_schd_dt, value);
	}


	/**
	 * Re-receipt simultaneously recording 再入荷同時計上.<p>
	 *
	 */
	public boolean re_arr_sync_flg() {
		return getConstBoolean(offset + 154, $re_arr_sync_flg);
	}

	/**
	 * Re-receipt simultaneously recording 再入荷同時計上.<p>
	 *
	 */
	public void re_arr_sync_flg(boolean value) {
		setConstBoolean(offset + 154, $re_arr_sync_flg, value);
	}


	/**
	 * Free of charge 無償.<p>
	 *
	 */
	public boolean ncv_flg() {
		return getConstBoolean(offset + 155, $ncv_flg);
	}

	/**
	 * Free of charge 無償.<p>
	 *
	 */
	public void ncv_flg(boolean value) {
		setConstBoolean(offset + 155, $ncv_flg, value);
	}


	/**
	 * Conforming type 良品区分.<p>
	 *
	 */
	public String quality_typ() {
		return getConstString(offset + 156, $quality_typ);
	}

	/**
	 * Conforming type 良品区分.<p>
	 *
	 */
	public void quality_typ(String value) {
		setConstString(offset + 156, $quality_typ, value);
	}


	/**
	 * Conforming type name 良品区分名.<p>
	 *
	 */
	public String quality_typ_nm() {
		return getConstString(offset + 157, $quality_typ_nm);
	}

	/**
	 * Conforming type name 良品区分名.<p>
	 *
	 */
	public void quality_typ_nm(String value) {
		setConstString(offset + 157, $quality_typ_nm, value);
	}


	/**
	 * Grading cd. 格付ＣＤ.<p>
	 *
	 */
	public String gd_cd() {
		return getConstString(offset + 158, $gd_cd);
	}

	/**
	 * Grading cd. 格付ＣＤ.<p>
	 *
	 */
	public void gd_cd(String value) {
		setConstString(offset + 158, $gd_cd, value);
	}


	/**
	 * Grading name 格付名.<p>
	 *
	 */
	public String gd_nm() {
		return getConstString(offset + 159, $gd_nm);
	}

	/**
	 * Grading name 格付名.<p>
	 *
	 */
	public void gd_nm(String value) {
		setConstString(offset + 159, $gd_nm, value);
	}


	public mcframe.clientMSUB.MSUBP5020.SnoWrkNoR sno_p(){
		return (mcframe.clientMSUB.MSUBP5020.SnoWrkNoR) getConstInnerRow(offset + 160, $sno_p);
	}
	
	public void sno_p(mcframe.clientMSUB.MSUBP5020.SnoWrkNoR row){
		setConstInnerRow(offset + 160, $sno_p, row);
	}


	/**
	 * Factory/Distribution warehouse cd. 工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public String site_cd() {
		return getConstString(offset + 161, $site_cd);
	}

	/**
	 * Factory/Distribution warehouse cd. 工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public void site_cd(String value) {
		setConstString(offset + 161, $site_cd, value);
	}


	/**
	 * Factory/Distribution warehouse name 工場・物流倉庫名.<p>
	 *
	 */
	public String site_nm() {
		return getConstString(offset + 162, $site_nm);
	}

	/**
	 * Factory/Distribution warehouse name 工場・物流倉庫名.<p>
	 *
	 */
	public void site_nm(String value) {
		setConstString(offset + 162, $site_nm, value);
	}


	/**
	 * Delivery location WG cd. 納入場所ＷＧＣＤ.<p>
	 *
	 */
	public String in_to_loc_wg_cd() {
		return getConstString(offset + 163, $in_to_loc_wg_cd);
	}

	/**
	 * Delivery location WG cd. 納入場所ＷＧＣＤ.<p>
	 *
	 */
	public void in_to_loc_wg_cd(String value) {
		setConstString(offset + 163, $in_to_loc_wg_cd, value);
	}


	/**
	 * Delivery location WG name 納入場所ＷＧ名.<p>
	 *
	 */
	public String in_to_loc_wg_nm() {
		return getConstString(offset + 164, $in_to_loc_wg_nm);
	}

	/**
	 * Delivery location WG name 納入場所ＷＧ名.<p>
	 *
	 */
	public void in_to_loc_wg_nm(String value) {
		setConstString(offset + 164, $in_to_loc_wg_nm, value);
	}


	/**
	 * Delivery location cd. 納入場所ＣＤ.<p>
	 *
	 */
	public String in_to_loc_cd() {
		return getConstString(offset + 165, $in_to_loc_cd);
	}

	/**
	 * Delivery location cd. 納入場所ＣＤ.<p>
	 *
	 */
	public void in_to_loc_cd(String value) {
		setConstString(offset + 165, $in_to_loc_cd, value);
	}


	/**
	 * Delivery location name 納入場所名.<p>
	 *
	 */
	public String in_to_loc_nm() {
		return getConstString(offset + 166, $in_to_loc_nm);
	}

	/**
	 * Delivery location name 納入場所名.<p>
	 *
	 */
	public void in_to_loc_nm(String value) {
		setConstString(offset + 166, $in_to_loc_nm, value);
	}


	/**
	 * Subcontractor 外注先.<p>
	 *
	 */
	public String outsrc_sppl_cd() {
		return getConstString(offset + 167, $outsrc_sppl_cd);
	}

	/**
	 * Subcontractor 外注先.<p>
	 *
	 */
	public void outsrc_sppl_cd(String value) {
		setConstString(offset + 167, $outsrc_sppl_cd, value);
	}


	/**
	 * For delivery location rack/line 納入場所棚・ライン対象.<p>
	 *
	 */
	public boolean in_to_str_ln_tgt_flg() {
		return getConstBoolean(offset + 168, $in_to_str_ln_tgt_flg);
	}

	/**
	 * For delivery location rack/line 納入場所棚・ライン対象.<p>
	 *
	 */
	public void in_to_str_ln_tgt_flg(boolean value) {
		setConstBoolean(offset + 168, $in_to_str_ln_tgt_flg, value);
	}


	public mcframe.clientMAUB.MAUBP5120.StrLnR in_to_str_ln_p(){
		return (mcframe.clientMAUB.MAUBP5120.StrLnR) getConstInnerRow(offset + 169, $in_to_str_ln_p);
	}
	
	public void in_to_str_ln_p(mcframe.clientMAUB.MAUBP5120.StrLnR row){
		setConstInnerRow(offset + 169, $in_to_str_ln_p, row);
	}


	/**
	 * Direct-delivery type 直納区分.<p>
	 *
	 */
	public String drct_dlv_typ() {
		return getConstString(offset + 170, $drct_dlv_typ);
	}

	/**
	 * Direct-delivery type 直納区分.<p>
	 *
	 */
	public void drct_dlv_typ(String value) {
		setConstString(offset + 170, $drct_dlv_typ, value);
	}


	/**
	 * Direct-delivery type name 直納区分名.<p>
	 *
	 */
	public String drct_dlv_typ_nm() {
		return getConstString(offset + 171, $drct_dlv_typ_nm);
	}

	/**
	 * Direct-delivery type name 直納区分名.<p>
	 *
	 */
	public void drct_dlv_typ_nm(String value) {
		setConstString(offset + 171, $drct_dlv_typ_nm, value);
	}


	/**
	 * Sales order details No. 受注明細ＮＯ.<p>
	 *
	 */
	public String slo_d_no() {
		return getConstString(offset + 172, $slo_d_no);
	}

	/**
	 * Sales order details No. 受注明細ＮＯ.<p>
	 *
	 */
	public void slo_d_no(String value) {
		setConstString(offset + 172, $slo_d_no, value);
	}


	/**
	 * Sales order No. 受注ＮＯ.<p>
	 *
	 */
	public String slo_no() {
		return getConstString(offset + 173, $slo_no);
	}

	/**
	 * Sales order No. 受注ＮＯ.<p>
	 *
	 */
	public void slo_no(String value) {
		setConstString(offset + 173, $slo_no, value);
	}


	/**
	 * For customers IV 得意先ＩＶ対象.<p>
	 *
	 */
	public boolean cst_iv_flg() {
		return getConstBoolean(offset + 174, $cst_iv_flg);
	}

	/**
	 * For customers IV 得意先ＩＶ対象.<p>
	 *
	 */
	public void cst_iv_flg(boolean value) {
		setConstBoolean(offset + 174, $cst_iv_flg, value);
	}


	/**
	 * Delivery destination calendar cd. 納品先カレンダＣＤ.<p>
	 *
	 */
	public String scst_cal_cd() {
		return getConstString(offset + 175, $scst_cal_cd);
	}

	/**
	 * Delivery destination calendar cd. 納品先カレンダＣＤ.<p>
	 *
	 */
	public void scst_cal_cd(String value) {
		setConstString(offset + 175, $scst_cal_cd, value);
	}


	public mcframe.clientMAUB.MAUBP5150.DlvR dlv_p(){
		return (mcframe.clientMAUB.MAUBP5150.DlvR) getConstInnerRow(offset + 176, $dlv_p);
	}
	
	public void dlv_p(mcframe.clientMAUB.MAUBP5150.DlvR row){
		setConstInnerRow(offset + 176, $dlv_p, row);
	}


	public mcframe.clientMAUB.MAUBP5150.DlvR tdlv_p(){
		return (mcframe.clientMAUB.MAUBP5150.DlvR) getConstInnerRow(offset + 177, $tdlv_p);
	}
	
	public void tdlv_p(mcframe.clientMAUB.MAUBP5150.DlvR row){
		setConstInnerRow(offset + 177, $tdlv_p, row);
	}


	public mcframe.clientMSUB.MSUBP5030.LotNoR lot_no_p(){
		return (mcframe.clientMSUB.MSUBP5030.LotNoR) getConstInnerRow(offset + 178, $lot_no_p);
	}
	
	public void lot_no_p(mcframe.clientMSUB.MSUBP5030.LotNoR row){
		setConstInnerRow(offset + 178, $lot_no_p, row);
	}


	/**
	 * Vendor lot No. 業者ロットＮＯ.<p>
	 *
	 */
	public String bp_lot_no() {
		return getConstString(offset + 179, $bp_lot_no);
	}

	/**
	 * Vendor lot No. 業者ロットＮＯ.<p>
	 *
	 */
	public void bp_lot_no(String value) {
		setConstString(offset + 179, $bp_lot_no, value);
	}


	/**
	 * Vendor delivery note No. 業者納品書ＮＯ.<p>
	 *
	 */
	public String bp_dlv_slip_no() {
		return getConstString(offset + 180, $bp_dlv_slip_no);
	}

	/**
	 * Vendor delivery note No. 業者納品書ＮＯ.<p>
	 *
	 */
	public void bp_dlv_slip_no(String value) {
		setConstString(offset + 180, $bp_dlv_slip_no, value);
	}


	/**
	 * Vendor delivery note details No. 業者納品書明細ＮＯ.<p>
	 *
	 */
	public String bp_dlv_slip_d_no() {
		return getConstString(offset + 181, $bp_dlv_slip_d_no);
	}

	/**
	 * Vendor delivery note details No. 業者納品書明細ＮＯ.<p>
	 *
	 */
	public void bp_dlv_slip_d_no(String value) {
		setConstString(offset + 181, $bp_dlv_slip_d_no, value);
	}


	/**
	 * Shipping point deadline 出荷元期限.<p>
	 *
	 */
	public MCDate slip_fr_valid_dt() {
		return getConstDate(offset + 182, $slip_fr_valid_dt);
	}

	/**
	 * Shipping point deadline 出荷元期限.<p>
	 *
	 */
	public void slip_fr_valid_dt(MCDate value) {
		setConstDate(offset + 182, $slip_fr_valid_dt, value);
	}


	public mcframe.clientMAUB.MAUBP5250.VerNoR ver_no_p(){
		return (mcframe.clientMAUB.MAUBP5250.VerNoR) getConstInnerRow(offset + 183, $ver_no_p);
	}
	
	public void ver_no_p(mcframe.clientMAUB.MAUBP5250.VerNoR row){
		setConstInnerRow(offset + 183, $ver_no_p, row);
	}


	public String org_ver_no() {
		return getConstString(offset + 184, $org_ver_no);
	}

	public void org_ver_no(String value) {
		setConstString(offset + 184, $org_ver_no, value);
	}


	/**
	 * For active ingredient 有効成分対象.<p>
	 *
	 */
	public boolean cont_fctr_flg() {
		return getConstBoolean(offset + 185, $cont_fctr_flg);
	}

	/**
	 * For active ingredient 有効成分対象.<p>
	 *
	 */
	public void cont_fctr_flg(boolean value) {
		setConstBoolean(offset + 185, $cont_fctr_flg, value);
	}


	/**
	 * Active ingredient number of decimal places 有効成分小数部有効桁数.<p>
	 *
	 */
	public MCNumber cont_fctr_dec_place() {
		return getConstNumber(offset + 186, $cont_fctr_dec_place);
	}

	/**
	 * Active ingredient number of decimal places 有効成分小数部有効桁数.<p>
	 *
	 */
	public void cont_fctr_dec_place(MCNumber value) {
		setConstNumber(offset + 186, $cont_fctr_dec_place, value);
	}

	/**
	 * Active ingredient number of decimal places 有効成分小数部有効桁数.<p>
	 *
	 */
	public void cont_fctr_dec_place(int value) {
		setConstNumber(offset + 186, $cont_fctr_dec_place, value);
	}

	/**
	 * Active ingredient number of decimal places 有効成分小数部有効桁数.<p>
	 *
	 */
	public void cont_fctr_dec_place(long value) {
		setConstNumber(offset + 186, $cont_fctr_dec_place, value);
	}

	/**
	 * Active ingredient number of decimal places 有効成分小数部有効桁数.<p>
	 *
	 */
	public void cont_fctr_dec_place(float value) {
		setConstNumber(offset + 186, $cont_fctr_dec_place, value);
	}

	/**
	 * Active ingredient number of decimal places 有効成分小数部有効桁数.<p>
	 *
	 */
	public void cont_fctr_dec_place(double value) {
		setConstNumber(offset + 186, $cont_fctr_dec_place, value);
	}


	/**
	 * Rounding type (Active ingredient conversion) 有効成分換算端数処理区分.<p>
	 *
	 */
	public String cont_fctr_rnd_typ() {
		return getConstString(offset + 187, $cont_fctr_rnd_typ);
	}

	/**
	 * Rounding type (Active ingredient conversion) 有効成分換算端数処理区分.<p>
	 *
	 */
	public void cont_fctr_rnd_typ(String value) {
		setConstString(offset + 187, $cont_fctr_rnd_typ, value);
	}


	public mcframe.clientMAUB.MAUBP5300.PurcContQtyR purc_cont_qty_p(){
		return (mcframe.clientMAUB.MAUBP5300.PurcContQtyR) getConstInnerRow(offset + 188, $purc_cont_qty_p);
	}
	
	public void purc_cont_qty_p(mcframe.clientMAUB.MAUBP5300.PurcContQtyR row){
		setConstInnerRow(offset + 188, $purc_cont_qty_p, row);
	}


	public mcframe.clientMAUB.MAUBP5330.PurcContFctrR purc_cont_fctr_p(){
		return (mcframe.clientMAUB.MAUBP5330.PurcContFctrR) getConstInnerRow(offset + 189, $purc_cont_fctr_p);
	}
	
	public void purc_cont_fctr_p(mcframe.clientMAUB.MAUBP5330.PurcContFctrR row){
		setConstInnerRow(offset + 189, $purc_cont_fctr_p, row);
	}


	public mcframe.clientMAUB.MAUBP5260.ContQtyR cont_qty_p(){
		return (mcframe.clientMAUB.MAUBP5260.ContQtyR) getConstInnerRow(offset + 190, $cont_qty_p);
	}
	
	public void cont_qty_p(mcframe.clientMAUB.MAUBP5260.ContQtyR row){
		setConstInnerRow(offset + 190, $cont_qty_p, row);
	}


	public mcframe.clientMAUB.MAUBP5270.ContFctrUnitR cont_fctr_unit_p(){
		return (mcframe.clientMAUB.MAUBP5270.ContFctrUnitR) getConstInnerRow(offset + 191, $cont_fctr_unit_p);
	}
	
	public void cont_fctr_unit_p(mcframe.clientMAUB.MAUBP5270.ContFctrUnitR row){
		setConstInnerRow(offset + 191, $cont_fctr_unit_p, row);
	}


	public mcframe.clientMAUB.MAUBP5280.StdContFctrR std_cont_fctr_p(){
		return (mcframe.clientMAUB.MAUBP5280.StdContFctrR) getConstInnerRow(offset + 192, $std_cont_fctr_p);
	}
	
	public void std_cont_fctr_p(mcframe.clientMAUB.MAUBP5280.StdContFctrR row){
		setConstInnerRow(offset + 192, $std_cont_fctr_p, row);
	}


	/**
	 * Currency cd. 通貨ＣＤ.<p>
	 *
	 */
	public String trd_cur_cd() {
		return getConstString(offset + 193, $trd_cur_cd);
	}

	/**
	 * Currency cd. 通貨ＣＤ.<p>
	 *
	 */
	public void trd_cur_cd(String value) {
		setConstString(offset + 193, $trd_cur_cd, value);
	}


	/**
	 * Currency name 通貨名.<p>
	 *
	 */
	public String trd_cur_nm() {
		return getConstString(offset + 194, $trd_cur_nm);
	}

	/**
	 * Currency name 通貨名.<p>
	 *
	 */
	public void trd_cur_nm(String value) {
		setConstString(offset + 194, $trd_cur_nm, value);
	}


	/**
	 * Transaction amount number of decimal places 取引金額小数部有効桁数.<p>
	 *
	 */
	public MCNumber trd_cur_amt_dec_place() {
		return getConstNumber(offset + 195, $trd_cur_amt_dec_place);
	}

	/**
	 * Transaction amount number of decimal places 取引金額小数部有効桁数.<p>
	 *
	 */
	public void trd_cur_amt_dec_place(MCNumber value) {
		setConstNumber(offset + 195, $trd_cur_amt_dec_place, value);
	}

	/**
	 * Transaction amount number of decimal places 取引金額小数部有効桁数.<p>
	 *
	 */
	public void trd_cur_amt_dec_place(int value) {
		setConstNumber(offset + 195, $trd_cur_amt_dec_place, value);
	}

	/**
	 * Transaction amount number of decimal places 取引金額小数部有効桁数.<p>
	 *
	 */
	public void trd_cur_amt_dec_place(long value) {
		setConstNumber(offset + 195, $trd_cur_amt_dec_place, value);
	}

	/**
	 * Transaction amount number of decimal places 取引金額小数部有効桁数.<p>
	 *
	 */
	public void trd_cur_amt_dec_place(float value) {
		setConstNumber(offset + 195, $trd_cur_amt_dec_place, value);
	}

	/**
	 * Transaction amount number of decimal places 取引金額小数部有効桁数.<p>
	 *
	 */
	public void trd_cur_amt_dec_place(double value) {
		setConstNumber(offset + 195, $trd_cur_amt_dec_place, value);
	}


	/**
	 * Transaction unit price number of decimal places 取引単価小数部有効桁数.<p>
	 *
	 */
	public MCNumber trd_cur_upri_dec_place() {
		return getConstNumber(offset + 196, $trd_cur_upri_dec_place);
	}

	/**
	 * Transaction unit price number of decimal places 取引単価小数部有効桁数.<p>
	 *
	 */
	public void trd_cur_upri_dec_place(MCNumber value) {
		setConstNumber(offset + 196, $trd_cur_upri_dec_place, value);
	}

	/**
	 * Transaction unit price number of decimal places 取引単価小数部有効桁数.<p>
	 *
	 */
	public void trd_cur_upri_dec_place(int value) {
		setConstNumber(offset + 196, $trd_cur_upri_dec_place, value);
	}

	/**
	 * Transaction unit price number of decimal places 取引単価小数部有効桁数.<p>
	 *
	 */
	public void trd_cur_upri_dec_place(long value) {
		setConstNumber(offset + 196, $trd_cur_upri_dec_place, value);
	}

	/**
	 * Transaction unit price number of decimal places 取引単価小数部有効桁数.<p>
	 *
	 */
	public void trd_cur_upri_dec_place(float value) {
		setConstNumber(offset + 196, $trd_cur_upri_dec_place, value);
	}

	/**
	 * Transaction unit price number of decimal places 取引単価小数部有効桁数.<p>
	 *
	 */
	public void trd_cur_upri_dec_place(double value) {
		setConstNumber(offset + 196, $trd_cur_upri_dec_place, value);
	}


	/**
	 * Details correction 明細訂正.<p>
	 *
	 */
	public boolean purc_dtl_upd_flg() {
		return getConstBoolean(offset + 197, $purc_dtl_upd_flg);
	}

	/**
	 * Details correction 明細訂正.<p>
	 *
	 */
	public void purc_dtl_upd_flg(boolean value) {
		setConstBoolean(offset + 197, $purc_dtl_upd_flg, value);
	}


	/**
	 * Temporary AP 暫定買掛.<p>
	 *
	 */
	public boolean temp_ap_flg() {
		return getConstBoolean(offset + 198, $temp_ap_flg);
	}

	/**
	 * Temporary AP 暫定買掛.<p>
	 *
	 */
	public void temp_ap_flg(boolean value) {
		setConstBoolean(offset + 198, $temp_ap_flg, value);
	}


	public mcframe.clientMSUB.MSUBP5070.TrdUpriAmtR trd_upri_amt_p(){
		return (mcframe.clientMSUB.MSUBP5070.TrdUpriAmtR) getConstInnerRow(offset + 199, $trd_upri_amt_p);
	}
	
	public void trd_upri_amt_p(mcframe.clientMSUB.MSUBP5070.TrdUpriAmtR row){
		setConstInnerRow(offset + 199, $trd_upri_amt_p, row);
	}


	/**
	 * Repurchase obligation 買戻義務.<p>
	 *
	 */
	public boolean repurc_obli_flg() {
		return getConstBoolean(offset + 200, $repurc_obli_flg);
	}

	/**
	 * Repurchase obligation 買戻義務.<p>
	 *
	 */
	public void repurc_obli_flg(boolean value) {
		setConstBoolean(offset + 200, $repurc_obli_flg, value);
	}


	/**
	 * Subcontracting unit price type 外注単価区分.<p>
	 *
	 */
	public String outsrc_upri_typ() {
		return getConstString(offset + 201, $outsrc_upri_typ);
	}

	/**
	 * Subcontracting unit price type 外注単価区分.<p>
	 *
	 */
	public void outsrc_upri_typ(String value) {
		setConstString(offset + 201, $outsrc_upri_typ, value);
	}


	public mcframe.clientMAUB.MAUBP5060.UpriR trd_cur_proc_upri_p(){
		return (mcframe.clientMAUB.MAUBP5060.UpriR) getConstInnerRow(offset + 202, $trd_cur_proc_upri_p);
	}
	
	public void trd_cur_proc_upri_p(mcframe.clientMAUB.MAUBP5060.UpriR row){
		setConstInnerRow(offset + 202, $trd_cur_proc_upri_p, row);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR trd_cur_proc_amt_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 203, $trd_cur_proc_amt_p);
	}
	
	public void trd_cur_proc_amt_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 203, $trd_cur_proc_amt_p, row);
	}


	public mcframe.clientMAUB.MAUBP5060.UpriR trd_cur_onr_prov_upri_p(){
		return (mcframe.clientMAUB.MAUBP5060.UpriR) getConstInnerRow(offset + 204, $trd_cur_onr_prov_upri_p);
	}
	
	public void trd_cur_onr_prov_upri_p(mcframe.clientMAUB.MAUBP5060.UpriR row){
		setConstInnerRow(offset + 204, $trd_cur_onr_prov_upri_p, row);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR trd_cur_onr_prov_amt_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 205, $trd_cur_onr_prov_amt_p);
	}
	
	public void trd_cur_onr_prov_amt_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 205, $trd_cur_onr_prov_amt_p, row);
	}


	/**
	 * (Before change) Unit price (Transaction currency) 変更前取引通貨単価.<p>
	 *
	 */
	public MCNumber old_trd_cur_upri() {
		return getConstNumber(offset + 206, $old_trd_cur_upri);
	}

	/**
	 * (Before change) Unit price (Transaction currency) 変更前取引通貨単価.<p>
	 *
	 */
	public void old_trd_cur_upri(MCNumber value) {
		setConstNumber(offset + 206, $old_trd_cur_upri, value);
	}

	/**
	 * (Before change) Unit price (Transaction currency) 変更前取引通貨単価.<p>
	 *
	 */
	public void old_trd_cur_upri(int value) {
		setConstNumber(offset + 206, $old_trd_cur_upri, value);
	}

	/**
	 * (Before change) Unit price (Transaction currency) 変更前取引通貨単価.<p>
	 *
	 */
	public void old_trd_cur_upri(long value) {
		setConstNumber(offset + 206, $old_trd_cur_upri, value);
	}

	/**
	 * (Before change) Unit price (Transaction currency) 変更前取引通貨単価.<p>
	 *
	 */
	public void old_trd_cur_upri(float value) {
		setConstNumber(offset + 206, $old_trd_cur_upri, value);
	}

	/**
	 * (Before change) Unit price (Transaction currency) 変更前取引通貨単価.<p>
	 *
	 */
	public void old_trd_cur_upri(double value) {
		setConstNumber(offset + 206, $old_trd_cur_upri, value);
	}


	/**
	 * (Before change) Subcontracting unit price (Transaction currency) 変更前取引通貨加工単価.<p>
	 *
	 */
	public MCNumber old_trd_cur_proc_upri() {
		return getConstNumber(offset + 207, $old_trd_cur_proc_upri);
	}

	/**
	 * (Before change) Subcontracting unit price (Transaction currency) 変更前取引通貨加工単価.<p>
	 *
	 */
	public void old_trd_cur_proc_upri(MCNumber value) {
		setConstNumber(offset + 207, $old_trd_cur_proc_upri, value);
	}

	/**
	 * (Before change) Subcontracting unit price (Transaction currency) 変更前取引通貨加工単価.<p>
	 *
	 */
	public void old_trd_cur_proc_upri(int value) {
		setConstNumber(offset + 207, $old_trd_cur_proc_upri, value);
	}

	/**
	 * (Before change) Subcontracting unit price (Transaction currency) 変更前取引通貨加工単価.<p>
	 *
	 */
	public void old_trd_cur_proc_upri(long value) {
		setConstNumber(offset + 207, $old_trd_cur_proc_upri, value);
	}

	/**
	 * (Before change) Subcontracting unit price (Transaction currency) 変更前取引通貨加工単価.<p>
	 *
	 */
	public void old_trd_cur_proc_upri(float value) {
		setConstNumber(offset + 207, $old_trd_cur_proc_upri, value);
	}

	/**
	 * (Before change) Subcontracting unit price (Transaction currency) 変更前取引通貨加工単価.<p>
	 *
	 */
	public void old_trd_cur_proc_upri(double value) {
		setConstNumber(offset + 207, $old_trd_cur_proc_upri, value);
	}


	/**
	 * (Before change) Chargeable supply unit price (Transaction currency) 変更前取引通貨有償支給単価.<p>
	 *
	 */
	public MCNumber old_trd_cur_onr_prov_upri() {
		return getConstNumber(offset + 208, $old_trd_cur_onr_prov_upri);
	}

	/**
	 * (Before change) Chargeable supply unit price (Transaction currency) 変更前取引通貨有償支給単価.<p>
	 *
	 */
	public void old_trd_cur_onr_prov_upri(MCNumber value) {
		setConstNumber(offset + 208, $old_trd_cur_onr_prov_upri, value);
	}

	/**
	 * (Before change) Chargeable supply unit price (Transaction currency) 変更前取引通貨有償支給単価.<p>
	 *
	 */
	public void old_trd_cur_onr_prov_upri(int value) {
		setConstNumber(offset + 208, $old_trd_cur_onr_prov_upri, value);
	}

	/**
	 * (Before change) Chargeable supply unit price (Transaction currency) 変更前取引通貨有償支給単価.<p>
	 *
	 */
	public void old_trd_cur_onr_prov_upri(long value) {
		setConstNumber(offset + 208, $old_trd_cur_onr_prov_upri, value);
	}

	/**
	 * (Before change) Chargeable supply unit price (Transaction currency) 変更前取引通貨有償支給単価.<p>
	 *
	 */
	public void old_trd_cur_onr_prov_upri(float value) {
		setConstNumber(offset + 208, $old_trd_cur_onr_prov_upri, value);
	}

	/**
	 * (Before change) Chargeable supply unit price (Transaction currency) 変更前取引通貨有償支給単価.<p>
	 *
	 */
	public void old_trd_cur_onr_prov_upri(double value) {
		setConstNumber(offset + 208, $old_trd_cur_onr_prov_upri, value);
	}


	/**
	 * Before change temporary unit price flg. 変更前仮単価ＦＬＧ.<p>
	 *
	 */
	public boolean old_interim_flg() {
		return getConstBoolean(offset + 209, $old_interim_flg);
	}

	/**
	 * Before change temporary unit price flg. 変更前仮単価ＦＬＧ.<p>
	 *
	 */
	public void old_interim_flg(boolean value) {
		setConstBoolean(offset + 209, $old_interim_flg, value);
	}


	/**
	 * Set scheduled rate 予定レート指定.<p>
	 *
	 */
	public boolean xrate_inpt_flg() {
		return getConstBoolean(offset + 210, $xrate_inpt_flg);
	}

	/**
	 * Set scheduled rate 予定レート指定.<p>
	 *
	 */
	public void xrate_inpt_flg(boolean value) {
		setConstBoolean(offset + 210, $xrate_inpt_flg, value);
	}


	/**
	 * Schedule rate cd. 予定レートＣＤ.<p>
	 *
	 */
	public String xrate_cd() {
		return getConstString(offset + 211, $xrate_cd);
	}

	/**
	 * Schedule rate cd. 予定レートＣＤ.<p>
	 *
	 */
	public void xrate_cd(String value) {
		setConstString(offset + 211, $xrate_cd, value);
	}


	public mcframe.clientMAUB.MAUBP5390.XrateR xrate_p(){
		return (mcframe.clientMAUB.MAUBP5390.XrateR) getConstInnerRow(offset + 212, $xrate_p);
	}
	
	public void xrate_p(mcframe.clientMAUB.MAUBP5390.XrateR row){
		setConstInnerRow(offset + 212, $xrate_p, row);
	}


	public MCNumber src_xrate() {
		return getConstNumber(offset + 213, $src_xrate);
	}

	public void src_xrate(MCNumber value) {
		setConstNumber(offset + 213, $src_xrate, value);
	}

	public void src_xrate(int value) {
		setConstNumber(offset + 213, $src_xrate, value);
	}

	public void src_xrate(long value) {
		setConstNumber(offset + 213, $src_xrate, value);
	}

	public void src_xrate(float value) {
		setConstNumber(offset + 213, $src_xrate, value);
	}

	public void src_xrate(double value) {
		setConstNumber(offset + 213, $src_xrate, value);
	}


	/**
	 * Exchange rounding type 為替端数処理区分.<p>
	 *
	 */
	public String xrate_rnd_typ() {
		return getConstString(offset + 214, $xrate_rnd_typ);
	}

	/**
	 * Exchange rounding type 為替端数処理区分.<p>
	 *
	 */
	public void xrate_rnd_typ(String value) {
		setConstString(offset + 214, $xrate_rnd_typ, value);
	}


	/**
	 * Base currency cd. 基準通貨ＣＤ.<p>
	 *
	 */
	public String base_cur_cd() {
		return getConstString(offset + 215, $base_cur_cd);
	}

	/**
	 * Base currency cd. 基準通貨ＣＤ.<p>
	 *
	 */
	public void base_cur_cd(String value) {
		setConstString(offset + 215, $base_cur_cd, value);
	}


	/**
	 * Base currency name 基準通貨名.<p>
	 *
	 */
	public String base_cur_nm() {
		return getConstString(offset + 216, $base_cur_nm);
	}

	/**
	 * Base currency name 基準通貨名.<p>
	 *
	 */
	public void base_cur_nm(String value) {
		setConstString(offset + 216, $base_cur_nm, value);
	}


	/**
	 * Base amount number of decimal places 基準金額小数部有効桁数.<p>
	 *
	 */
	public MCNumber base_cur_amt_dec_place() {
		return getConstNumber(offset + 217, $base_cur_amt_dec_place);
	}

	/**
	 * Base amount number of decimal places 基準金額小数部有効桁数.<p>
	 *
	 */
	public void base_cur_amt_dec_place(MCNumber value) {
		setConstNumber(offset + 217, $base_cur_amt_dec_place, value);
	}

	/**
	 * Base amount number of decimal places 基準金額小数部有効桁数.<p>
	 *
	 */
	public void base_cur_amt_dec_place(int value) {
		setConstNumber(offset + 217, $base_cur_amt_dec_place, value);
	}

	/**
	 * Base amount number of decimal places 基準金額小数部有効桁数.<p>
	 *
	 */
	public void base_cur_amt_dec_place(long value) {
		setConstNumber(offset + 217, $base_cur_amt_dec_place, value);
	}

	/**
	 * Base amount number of decimal places 基準金額小数部有効桁数.<p>
	 *
	 */
	public void base_cur_amt_dec_place(float value) {
		setConstNumber(offset + 217, $base_cur_amt_dec_place, value);
	}

	/**
	 * Base amount number of decimal places 基準金額小数部有効桁数.<p>
	 *
	 */
	public void base_cur_amt_dec_place(double value) {
		setConstNumber(offset + 217, $base_cur_amt_dec_place, value);
	}


	/**
	 * Base unit price number of decimal places 基準単価小数部有効桁数.<p>
	 *
	 */
	public MCNumber base_cur_upri_dec_place() {
		return getConstNumber(offset + 218, $base_cur_upri_dec_place);
	}

	/**
	 * Base unit price number of decimal places 基準単価小数部有効桁数.<p>
	 *
	 */
	public void base_cur_upri_dec_place(MCNumber value) {
		setConstNumber(offset + 218, $base_cur_upri_dec_place, value);
	}

	/**
	 * Base unit price number of decimal places 基準単価小数部有効桁数.<p>
	 *
	 */
	public void base_cur_upri_dec_place(int value) {
		setConstNumber(offset + 218, $base_cur_upri_dec_place, value);
	}

	/**
	 * Base unit price number of decimal places 基準単価小数部有効桁数.<p>
	 *
	 */
	public void base_cur_upri_dec_place(long value) {
		setConstNumber(offset + 218, $base_cur_upri_dec_place, value);
	}

	/**
	 * Base unit price number of decimal places 基準単価小数部有効桁数.<p>
	 *
	 */
	public void base_cur_upri_dec_place(float value) {
		setConstNumber(offset + 218, $base_cur_upri_dec_place, value);
	}

	/**
	 * Base unit price number of decimal places 基準単価小数部有効桁数.<p>
	 *
	 */
	public void base_cur_upri_dec_place(double value) {
		setConstNumber(offset + 218, $base_cur_upri_dec_place, value);
	}


	public mcframe.clientMAUB.MAUBP5060.UpriR base_cur_upri_p(){
		return (mcframe.clientMAUB.MAUBP5060.UpriR) getConstInnerRow(offset + 219, $base_cur_upri_p);
	}
	
	public void base_cur_upri_p(mcframe.clientMAUB.MAUBP5060.UpriR row){
		setConstInnerRow(offset + 219, $base_cur_upri_p, row);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR base_cur_amt_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 220, $base_cur_amt_p);
	}
	
	public void base_cur_amt_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 220, $base_cur_amt_p, row);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR base_cur_inc_tax_amt_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 221, $base_cur_inc_tax_amt_p);
	}
	
	public void base_cur_inc_tax_amt_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 221, $base_cur_inc_tax_amt_p, row);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR base_cur_tax_amt_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 222, $base_cur_tax_amt_p);
	}
	
	public void base_cur_tax_amt_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 222, $base_cur_tax_amt_p, row);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR base_cur_dscnt_amt_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 223, $base_cur_dscnt_amt_p);
	}
	
	public void base_cur_dscnt_amt_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 223, $base_cur_dscnt_amt_p, row);
	}


	public mcframe.clientMAUB.MAUBP5060.UpriR base_cur_proc_upri_p(){
		return (mcframe.clientMAUB.MAUBP5060.UpriR) getConstInnerRow(offset + 224, $base_cur_proc_upri_p);
	}
	
	public void base_cur_proc_upri_p(mcframe.clientMAUB.MAUBP5060.UpriR row){
		setConstInnerRow(offset + 224, $base_cur_proc_upri_p, row);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR base_cur_proc_amt_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 225, $base_cur_proc_amt_p);
	}
	
	public void base_cur_proc_amt_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 225, $base_cur_proc_amt_p, row);
	}


	public mcframe.clientMAUB.MAUBP5060.UpriR base_cur_onr_prov_upri_p(){
		return (mcframe.clientMAUB.MAUBP5060.UpriR) getConstInnerRow(offset + 226, $base_cur_onr_prov_upri_p);
	}
	
	public void base_cur_onr_prov_upri_p(mcframe.clientMAUB.MAUBP5060.UpriR row){
		setConstInnerRow(offset + 226, $base_cur_onr_prov_upri_p, row);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR base_cur_onr_prov_amt_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 227, $base_cur_onr_prov_amt_p);
	}
	
	public void base_cur_onr_prov_amt_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 227, $base_cur_onr_prov_amt_p, row);
	}


	/**
	 * Set tax schedule rate 納税予定レート指定.<p>
	 *
	 */
	public boolean ptax_xrate_inpt_flg() {
		return getConstBoolean(offset + 228, $ptax_xrate_inpt_flg);
	}

	/**
	 * Set tax schedule rate 納税予定レート指定.<p>
	 *
	 */
	public void ptax_xrate_inpt_flg(boolean value) {
		setConstBoolean(offset + 228, $ptax_xrate_inpt_flg, value);
	}


	public mcframe.clientMAUB.MAUBP5390.XrateR prax_xrate_p(){
		return (mcframe.clientMAUB.MAUBP5390.XrateR) getConstInnerRow(offset + 229, $prax_xrate_p);
	}
	
	public void prax_xrate_p(mcframe.clientMAUB.MAUBP5390.XrateR row){
		setConstInnerRow(offset + 229, $prax_xrate_p, row);
	}


	public MCNumber src_ptax_xrate() {
		return getConstNumber(offset + 230, $src_ptax_xrate);
	}

	public void src_ptax_xrate(MCNumber value) {
		setConstNumber(offset + 230, $src_ptax_xrate, value);
	}

	public void src_ptax_xrate(int value) {
		setConstNumber(offset + 230, $src_ptax_xrate, value);
	}

	public void src_ptax_xrate(long value) {
		setConstNumber(offset + 230, $src_ptax_xrate, value);
	}

	public void src_ptax_xrate(float value) {
		setConstNumber(offset + 230, $src_ptax_xrate, value);
	}

	public void src_ptax_xrate(double value) {
		setConstNumber(offset + 230, $src_ptax_xrate, value);
	}


	/**
	 * Taxpaying currency cd. 納税通貨ＣＤ.<p>
	 *
	 */
	public String ptax_cur_cd() {
		return getConstString(offset + 231, $ptax_cur_cd);
	}

	/**
	 * Taxpaying currency cd. 納税通貨ＣＤ.<p>
	 *
	 */
	public void ptax_cur_cd(String value) {
		setConstString(offset + 231, $ptax_cur_cd, value);
	}


	/**
	 * Tax currency name 納税通貨名.<p>
	 *
	 */
	public String ptax_cur_nm() {
		return getConstString(offset + 232, $ptax_cur_nm);
	}

	/**
	 * Tax currency name 納税通貨名.<p>
	 *
	 */
	public void ptax_cur_nm(String value) {
		setConstString(offset + 232, $ptax_cur_nm, value);
	}


	/**
	 * Tax amount number of decimal places 納税金額小数部有効桁数.<p>
	 *
	 */
	public MCNumber ptax_cur_amt_dec_place() {
		return getConstNumber(offset + 233, $ptax_cur_amt_dec_place);
	}

	/**
	 * Tax amount number of decimal places 納税金額小数部有効桁数.<p>
	 *
	 */
	public void ptax_cur_amt_dec_place(MCNumber value) {
		setConstNumber(offset + 233, $ptax_cur_amt_dec_place, value);
	}

	/**
	 * Tax amount number of decimal places 納税金額小数部有効桁数.<p>
	 *
	 */
	public void ptax_cur_amt_dec_place(int value) {
		setConstNumber(offset + 233, $ptax_cur_amt_dec_place, value);
	}

	/**
	 * Tax amount number of decimal places 納税金額小数部有効桁数.<p>
	 *
	 */
	public void ptax_cur_amt_dec_place(long value) {
		setConstNumber(offset + 233, $ptax_cur_amt_dec_place, value);
	}

	/**
	 * Tax amount number of decimal places 納税金額小数部有効桁数.<p>
	 *
	 */
	public void ptax_cur_amt_dec_place(float value) {
		setConstNumber(offset + 233, $ptax_cur_amt_dec_place, value);
	}

	/**
	 * Tax amount number of decimal places 納税金額小数部有効桁数.<p>
	 *
	 */
	public void ptax_cur_amt_dec_place(double value) {
		setConstNumber(offset + 233, $ptax_cur_amt_dec_place, value);
	}


	/**
	 * Tax unit price number of decimal places 納税単価小数部有効桁数.<p>
	 *
	 */
	public MCNumber ptax_cur_upri_dec_place() {
		return getConstNumber(offset + 234, $ptax_cur_upri_dec_place);
	}

	/**
	 * Tax unit price number of decimal places 納税単価小数部有効桁数.<p>
	 *
	 */
	public void ptax_cur_upri_dec_place(MCNumber value) {
		setConstNumber(offset + 234, $ptax_cur_upri_dec_place, value);
	}

	/**
	 * Tax unit price number of decimal places 納税単価小数部有効桁数.<p>
	 *
	 */
	public void ptax_cur_upri_dec_place(int value) {
		setConstNumber(offset + 234, $ptax_cur_upri_dec_place, value);
	}

	/**
	 * Tax unit price number of decimal places 納税単価小数部有効桁数.<p>
	 *
	 */
	public void ptax_cur_upri_dec_place(long value) {
		setConstNumber(offset + 234, $ptax_cur_upri_dec_place, value);
	}

	/**
	 * Tax unit price number of decimal places 納税単価小数部有効桁数.<p>
	 *
	 */
	public void ptax_cur_upri_dec_place(float value) {
		setConstNumber(offset + 234, $ptax_cur_upri_dec_place, value);
	}

	/**
	 * Tax unit price number of decimal places 納税単価小数部有効桁数.<p>
	 *
	 */
	public void ptax_cur_upri_dec_place(double value) {
		setConstNumber(offset + 234, $ptax_cur_upri_dec_place, value);
	}


	/**
	 * Taxpaying date 納税日.<p>
	 *
	 */
	public MCDate ptax_dt() {
		return getConstDate(offset + 235, $ptax_dt);
	}

	/**
	 * Taxpaying date 納税日.<p>
	 *
	 */
	public void ptax_dt(MCDate value) {
		setConstDate(offset + 235, $ptax_dt, value);
	}


	public mcframe.clientMAUB.MAUBP5060.UpriR ptax_cur_upri_p(){
		return (mcframe.clientMAUB.MAUBP5060.UpriR) getConstInnerRow(offset + 236, $ptax_cur_upri_p);
	}
	
	public void ptax_cur_upri_p(mcframe.clientMAUB.MAUBP5060.UpriR row){
		setConstInnerRow(offset + 236, $ptax_cur_upri_p, row);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR ptax_cur_amt_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 237, $ptax_cur_amt_p);
	}
	
	public void ptax_cur_amt_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 237, $ptax_cur_amt_p, row);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR ptax_cur_tax_amt_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 238, $ptax_cur_tax_amt_p);
	}
	
	public void ptax_cur_tax_amt_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 238, $ptax_cur_tax_amt_p, row);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR ptax_cur_inc_tax_amt_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 239, $ptax_cur_inc_tax_amt_p);
	}
	
	public void ptax_cur_inc_tax_amt_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 239, $ptax_cur_inc_tax_amt_p, row);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR ptax_cur_dscnt_amt_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 240, $ptax_cur_dscnt_amt_p);
	}
	
	public void ptax_cur_dscnt_amt_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 240, $ptax_cur_dscnt_amt_p, row);
	}


	public mcframe.clientMAUB.MAUBP5060.UpriR ptax_cur_proc_upri_p(){
		return (mcframe.clientMAUB.MAUBP5060.UpriR) getConstInnerRow(offset + 241, $ptax_cur_proc_upri_p);
	}
	
	public void ptax_cur_proc_upri_p(mcframe.clientMAUB.MAUBP5060.UpriR row){
		setConstInnerRow(offset + 241, $ptax_cur_proc_upri_p, row);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR ptax_cur_proc_amt_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 242, $ptax_cur_proc_amt_p);
	}
	
	public void ptax_cur_proc_amt_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 242, $ptax_cur_proc_amt_p, row);
	}


	public mcframe.clientMAUB.MAUBP5060.UpriR ptax_cur_onr_prov_upri_p(){
		return (mcframe.clientMAUB.MAUBP5060.UpriR) getConstInnerRow(offset + 243, $ptax_cur_onr_prov_upri_p);
	}
	
	public void ptax_cur_onr_prov_upri_p(mcframe.clientMAUB.MAUBP5060.UpriR row){
		setConstInnerRow(offset + 243, $ptax_cur_onr_prov_upri_p, row);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR ptax_cur_onr_prov_amt_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 244, $ptax_cur_onr_prov_amt_p);
	}
	
	public void ptax_cur_onr_prov_amt_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 244, $ptax_cur_onr_prov_amt_p, row);
	}


	/**
	 * Withholding tax rate 源泉税率.<p>
	 *
	 */
	public MCNumber wtax_rate() {
		return getConstNumber(offset + 245, $wtax_rate);
	}

	/**
	 * Withholding tax rate 源泉税率.<p>
	 *
	 */
	public void wtax_rate(MCNumber value) {
		setConstNumber(offset + 245, $wtax_rate, value);
	}

	/**
	 * Withholding tax rate 源泉税率.<p>
	 *
	 */
	public void wtax_rate(int value) {
		setConstNumber(offset + 245, $wtax_rate, value);
	}

	/**
	 * Withholding tax rate 源泉税率.<p>
	 *
	 */
	public void wtax_rate(long value) {
		setConstNumber(offset + 245, $wtax_rate, value);
	}

	/**
	 * Withholding tax rate 源泉税率.<p>
	 *
	 */
	public void wtax_rate(float value) {
		setConstNumber(offset + 245, $wtax_rate, value);
	}

	/**
	 * Withholding tax rate 源泉税率.<p>
	 *
	 */
	public void wtax_rate(double value) {
		setConstNumber(offset + 245, $wtax_rate, value);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR wtax_amt_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 246, $wtax_amt_p);
	}
	
	public void wtax_amt_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 246, $wtax_amt_p, row);
	}


	/**
	 * Withholding tax rounding type 源泉徴収税端数処理区分.<p>
	 *
	 */
	public String wtax_rnd_typ() {
		return getConstString(offset + 247, $wtax_rnd_typ);
	}

	/**
	 * Withholding tax rounding type 源泉徴収税端数処理区分.<p>
	 *
	 */
	public void wtax_rnd_typ(String value) {
		setConstString(offset + 247, $wtax_rnd_typ, value);
	}


	/**
	 * Supplier item cd. 発注先品目ＣＤ.<p>
	 *
	 */
	public String sppl_itm_cd() {
		return getConstString(offset + 248, $sppl_itm_cd);
	}

	/**
	 * Supplier item cd. 発注先品目ＣＤ.<p>
	 *
	 */
	public void sppl_itm_cd(String value) {
		setConstString(offset + 248, $sppl_itm_cd, value);
	}


	/**
	 * Supplier item name 発注先品名.<p>
	 *
	 */
	public String sppl_itm_nm() {
		return getConstString(offset + 249, $sppl_itm_nm);
	}

	/**
	 * Supplier item name 発注先品名.<p>
	 *
	 */
	public void sppl_itm_nm(String value) {
		setConstString(offset + 249, $sppl_itm_nm, value);
	}


	/**
	 * Customer item cd. 得意先品目ＣＤ.<p>
	 *
	 */
	public String cst_itm_cd() {
		return getConstString(offset + 250, $cst_itm_cd);
	}

	/**
	 * Customer item cd. 得意先品目ＣＤ.<p>
	 *
	 */
	public void cst_itm_cd(String value) {
		setConstString(offset + 250, $cst_itm_cd, value);
	}


	/**
	 * Customer item name 得意先品名.<p>
	 *
	 */
	public String cst_itm_nm() {
		return getConstString(offset + 251, $cst_itm_nm);
	}

	/**
	 * Customer item name 得意先品名.<p>
	 *
	 */
	public void cst_itm_nm(String value) {
		setConstString(offset + 251, $cst_itm_nm, value);
	}


	/**
	 * Purchase reason cd. 仕入理由ＣＤ.<p>
	 *
	 */
	public String purc_rsn_cd() {
		return getConstString(offset + 252, $purc_rsn_cd);
	}

	/**
	 * Purchase reason cd. 仕入理由ＣＤ.<p>
	 *
	 */
	public void purc_rsn_cd(String value) {
		setConstString(offset + 252, $purc_rsn_cd, value);
	}


	/**
	 * Purchase reason name 仕入理由名.<p>
	 *
	 */
	public String purc_rsn_nm() {
		return getConstString(offset + 253, $purc_rsn_nm);
	}

	/**
	 * Purchase reason name 仕入理由名.<p>
	 *
	 */
	public void purc_rsn_nm(String value) {
		setConstString(offset + 253, $purc_rsn_nm, value);
	}


	/**
	 * Expense purchase 経費購買.<p>
	 *
	 */
	public boolean xpns_purc_flg() {
		return getConstBoolean(offset + 254, $xpns_purc_flg);
	}

	/**
	 * Expense purchase 経費購買.<p>
	 *
	 */
	public void xpns_purc_flg(boolean value) {
		setConstBoolean(offset + 254, $xpns_purc_flg, value);
	}


	/**
	 * Purchase identification type 購買識別区分.<p>
	 *
	 */
	public String purc_id_typ() {
		return getConstString(offset + 255, $purc_id_typ);
	}

	/**
	 * Purchase identification type 購買識別区分.<p>
	 *
	 */
	public void purc_id_typ(String value) {
		setConstString(offset + 255, $purc_id_typ, value);
	}


	/**
	 * Purchase identification type name 購買識別区分名.<p>
	 *
	 */
	public String purc_id_typ_nm() {
		return getConstString(offset + 256, $purc_id_typ_nm);
	}

	/**
	 * Purchase identification type name 購買識別区分名.<p>
	 *
	 */
	public void purc_id_typ_nm(String value) {
		setConstString(offset + 256, $purc_id_typ_nm, value);
	}


	/**
	 * Inventory inspection type 在庫検査区分.<p>
	 *
	 */
	public String stk_insp_typ() {
		return getConstString(offset + 257, $stk_insp_typ);
	}

	/**
	 * Inventory inspection type 在庫検査区分.<p>
	 *
	 */
	public void stk_insp_typ(String value) {
		setConstString(offset + 257, $stk_insp_typ, value);
	}


	/**
	 * Inventory inspection type name 在庫検査区分名.<p>
	 *
	 */
	public String stk_insp_typ_nm() {
		return getConstString(offset + 258, $stk_insp_typ_nm);
	}

	/**
	 * Inventory inspection type name 在庫検査区分名.<p>
	 *
	 */
	public void stk_insp_typ_nm(String value) {
		setConstString(offset + 258, $stk_insp_typ_nm, value);
	}


	/**
	 * Inventory identification type 在庫識別区分.<p>
	 *
	 */
	public String stk_id_typ() {
		return getConstString(offset + 259, $stk_id_typ);
	}

	/**
	 * Inventory identification type 在庫識別区分.<p>
	 *
	 */
	public void stk_id_typ(String value) {
		setConstString(offset + 259, $stk_id_typ, value);
	}


	/**
	 * Inventory identification type name 在庫識別区分名.<p>
	 *
	 */
	public String stk_id_typ_nm() {
		return getConstString(offset + 260, $stk_id_typ_nm);
	}

	/**
	 * Inventory identification type name 在庫識別区分名.<p>
	 *
	 */
	public void stk_id_typ_nm(String value) {
		setConstString(offset + 260, $stk_id_typ_nm, value);
	}


	/**
	 * AP dept. cd. 債務部門ＣＤ.<p>
	 *
	 */
	public String ap_dpt_cd() {
		return getConstString(offset + 261, $ap_dpt_cd);
	}

	/**
	 * AP dept. cd. 債務部門ＣＤ.<p>
	 *
	 */
	public void ap_dpt_cd(String value) {
		setConstString(offset + 261, $ap_dpt_cd, value);
	}


	/**
	 * AP dept. name 債務部門名.<p>
	 *
	 */
	public String ap_dpt_nm() {
		return getConstString(offset + 262, $ap_dpt_nm);
	}

	/**
	 * AP dept. name 債務部門名.<p>
	 *
	 */
	public void ap_dpt_nm(String value) {
		setConstString(offset + 262, $ap_dpt_nm, value);
	}


	/**
	 * Master AP dept. cd. マスタ債務部門ＣＤ.<p>
	 *
	 */
	public String mst_ap_dpt_cd() {
		return getConstString(offset + 263, $mst_ap_dpt_cd);
	}

	/**
	 * Master AP dept. cd. マスタ債務部門ＣＤ.<p>
	 *
	 */
	public void mst_ap_dpt_cd(String value) {
		setConstString(offset + 263, $mst_ap_dpt_cd, value);
	}


	/**
	 * Payment carry-over count 支払繰越回数.<p>
	 *
	 */
	public MCNumber pay_crryovr_times() {
		return getConstNumber(offset + 264, $pay_crryovr_times);
	}

	/**
	 * Payment carry-over count 支払繰越回数.<p>
	 *
	 */
	public void pay_crryovr_times(MCNumber value) {
		setConstNumber(offset + 264, $pay_crryovr_times, value);
	}

	/**
	 * Payment carry-over count 支払繰越回数.<p>
	 *
	 */
	public void pay_crryovr_times(int value) {
		setConstNumber(offset + 264, $pay_crryovr_times, value);
	}

	/**
	 * Payment carry-over count 支払繰越回数.<p>
	 *
	 */
	public void pay_crryovr_times(long value) {
		setConstNumber(offset + 264, $pay_crryovr_times, value);
	}

	/**
	 * Payment carry-over count 支払繰越回数.<p>
	 *
	 */
	public void pay_crryovr_times(float value) {
		setConstNumber(offset + 264, $pay_crryovr_times, value);
	}

	/**
	 * Payment carry-over count 支払繰越回数.<p>
	 *
	 */
	public void pay_crryovr_times(double value) {
		setConstNumber(offset + 264, $pay_crryovr_times, value);
	}


	public mcframe.clientMAUB.MAUBP5230.UsrDptR usr_dpt_p(){
		return (mcframe.clientMAUB.MAUBP5230.UsrDptR) getConstInnerRow(offset + 265, $usr_dpt_p);
	}
	
	public void usr_dpt_p(mcframe.clientMAUB.MAUBP5230.UsrDptR row){
		setConstInnerRow(offset + 265, $usr_dpt_p, row);
	}


	/**
	 * AP dept. 債務部門.<p>
	 *
	 */
	public boolean ap_dpt_flg() {
		return getConstBoolean(offset + 266, $ap_dpt_flg);
	}

	/**
	 * AP dept. 債務部門.<p>
	 *
	 */
	public void ap_dpt_flg(boolean value) {
		setConstBoolean(offset + 266, $ap_dpt_flg, value);
	}


	/**
	 * Purchasing dept. WG cd. 購買部門ＷＧＣＤ.<p>
	 *
	 */
	public String purc_dpt_wg_cd() {
		return getConstString(offset + 267, $purc_dpt_wg_cd);
	}

	/**
	 * Purchasing dept. WG cd. 購買部門ＷＧＣＤ.<p>
	 *
	 */
	public void purc_dpt_wg_cd(String value) {
		setConstString(offset + 267, $purc_dpt_wg_cd, value);
	}


	/**
	 * Purchasing dept. WG name 購買部門ＷＧ名.<p>
	 *
	 */
	public String purc_dpt_wg_nm() {
		return getConstString(offset + 268, $purc_dpt_wg_nm);
	}

	/**
	 * Purchasing dept. WG name 購買部門ＷＧ名.<p>
	 *
	 */
	public void purc_dpt_wg_nm(String value) {
		setConstString(offset + 268, $purc_dpt_wg_nm, value);
	}


	public mcframe.clientMSUB.MSUBP5040.BdItemR bditm_p(){
		return (mcframe.clientMSUB.MSUBP5040.BdItemR) getConstInnerRow(offset + 269, $bditm_p);
	}
	
	public void bditm_p(mcframe.clientMSUB.MSUBP5040.BdItemR row){
		setConstInnerRow(offset + 269, $bditm_p, row);
	}


	/**
	 * Charged lot management type 負担ロット管理区分.<p>
	 *
	 */
	public String bd_lot_mng_typ() {
		return getConstString(offset + 270, $bd_lot_mng_typ);
	}

	/**
	 * Charged lot management type 負担ロット管理区分.<p>
	 *
	 */
	public void bd_lot_mng_typ(String value) {
		setConstString(offset + 270, $bd_lot_mng_typ, value);
	}


	/**
	 * Charged sublot management type 負担サブロット管理区分.<p>
	 *
	 */
	public String bd_sublot_mng_typ() {
		return getConstString(offset + 271, $bd_sublot_mng_typ);
	}

	/**
	 * Charged sublot management type 負担サブロット管理区分.<p>
	 *
	 */
	public void bd_sublot_mng_typ(String value) {
		setConstString(offset + 271, $bd_sublot_mng_typ, value);
	}


	/**
	 * Charged lot numbering type 負担ロットＮＯ発番区分.<p>
	 *
	 */
	public String bd_lot_no_typ() {
		return getConstString(offset + 272, $bd_lot_no_typ);
	}

	/**
	 * Charged lot numbering type 負担ロットＮＯ発番区分.<p>
	 *
	 */
	public void bd_lot_no_typ(String value) {
		setConstString(offset + 272, $bd_lot_no_typ, value);
	}


	/**
	 * Charged sublot numbering type 負担サブロットＮＯ発番区分.<p>
	 *
	 */
	public String bd_sublot_no_typ() {
		return getConstString(offset + 273, $bd_sublot_no_typ);
	}

	/**
	 * Charged sublot numbering type 負担サブロットＮＯ発番区分.<p>
	 *
	 */
	public void bd_sublot_no_typ(String value) {
		setConstString(offset + 273, $bd_sublot_no_typ, value);
	}


	/**
	 * Charged SEIBAN No. 1 management type 負担手配ＮＯ１管理区分.<p>
	 *
	 */
	public String bd_sno1_mng_typ() {
		return getConstString(offset + 274, $bd_sno1_mng_typ);
	}

	/**
	 * Charged SEIBAN No. 1 management type 負担手配ＮＯ１管理区分.<p>
	 *
	 */
	public void bd_sno1_mng_typ(String value) {
		setConstString(offset + 274, $bd_sno1_mng_typ, value);
	}


	/**
	 * Charged SEIBAN No. 2 management type 負担手配ＮＯ２管理区分.<p>
	 *
	 */
	public String bd_sno2_mng_typ() {
		return getConstString(offset + 275, $bd_sno2_mng_typ);
	}

	/**
	 * Charged SEIBAN No. 2 management type 負担手配ＮＯ２管理区分.<p>
	 *
	 */
	public void bd_sno2_mng_typ(String value) {
		setConstString(offset + 275, $bd_sno2_mng_typ, value);
	}


	/**
	 * Charged SEIBAN No. 3 management type 負担手配ＮＯ３管理区分.<p>
	 *
	 */
	public String bd_sno3_mng_typ() {
		return getConstString(offset + 276, $bd_sno3_mng_typ);
	}

	/**
	 * Charged SEIBAN No. 3 management type 負担手配ＮＯ３管理区分.<p>
	 *
	 */
	public void bd_sno3_mng_typ(String value) {
		setConstString(offset + 276, $bd_sno3_mng_typ, value);
	}


	/**
	 * Charged SEIBAN No. 4 management type 負担手配ＮＯ４管理区分.<p>
	 *
	 */
	public String bd_sno4_mng_typ() {
		return getConstString(offset + 277, $bd_sno4_mng_typ);
	}

	/**
	 * Charged SEIBAN No. 4 management type 負担手配ＮＯ４管理区分.<p>
	 *
	 */
	public void bd_sno4_mng_typ(String value) {
		setConstString(offset + 277, $bd_sno4_mng_typ, value);
	}


	/**
	 * Schedule spare 1 予定予備１.<p>
	 *
	 */
	public String s_sub_char1() {
		return getConstString(offset + 278, $s_sub_char1);
	}

	/**
	 * Schedule spare 1 予定予備１.<p>
	 *
	 */
	public void s_sub_char1(String value) {
		setConstString(offset + 278, $s_sub_char1, value);
	}


	/**
	 * Schedule spare 2 予定予備２.<p>
	 *
	 */
	public String s_sub_char2() {
		return getConstString(offset + 279, $s_sub_char2);
	}

	/**
	 * Schedule spare 2 予定予備２.<p>
	 *
	 */
	public void s_sub_char2(String value) {
		setConstString(offset + 279, $s_sub_char2, value);
	}


	/**
	 * Schedule spare 3 予定予備３.<p>
	 *
	 */
	public String s_sub_char3() {
		return getConstString(offset + 280, $s_sub_char3);
	}

	/**
	 * Schedule spare 3 予定予備３.<p>
	 *
	 */
	public void s_sub_char3(String value) {
		setConstString(offset + 280, $s_sub_char3, value);
	}


	/**
	 * Transaction remarks 取引備考.<p>
	 *
	 */
	public String trd_rmrks() {
		return getConstString(offset + 281, $trd_rmrks);
	}

	/**
	 * Transaction remarks 取引備考.<p>
	 *
	 */
	public void trd_rmrks(String value) {
		setConstString(offset + 281, $trd_rmrks, value);
	}


	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public String intr_rmrks() {
		return getConstString(offset + 282, $intr_rmrks);
	}

	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public void intr_rmrks(String value) {
		setConstString(offset + 282, $intr_rmrks, value);
	}


	/**
	 * PO sheet remarks 注文書備考.<p>
	 *
	 */
	public String po_print_rmrks() {
		return getConstString(offset + 283, $po_print_rmrks);
	}

	/**
	 * PO sheet remarks 注文書備考.<p>
	 *
	 */
	public void po_print_rmrks(String value) {
		setConstString(offset + 283, $po_print_rmrks, value);
	}


	/**
	 * Purchase result spare 1 仕入実績予備１.<p>
	 *
	 */
	public String sub_char1() {
		return getConstString(offset + 284, $sub_char1);
	}

	/**
	 * Purchase result spare 1 仕入実績予備１.<p>
	 *
	 */
	public void sub_char1(String value) {
		setConstString(offset + 284, $sub_char1, value);
	}


	/**
	 * Purchase result spare 2 仕入実績予備２.<p>
	 *
	 */
	public String sub_char2() {
		return getConstString(offset + 285, $sub_char2);
	}

	/**
	 * Purchase result spare 2 仕入実績予備２.<p>
	 *
	 */
	public void sub_char2(String value) {
		setConstString(offset + 285, $sub_char2, value);
	}


	/**
	 * Purchase result spare 3 仕入実績予備３.<p>
	 *
	 */
	public String sub_char3() {
		return getConstString(offset + 286, $sub_char3);
	}

	/**
	 * Purchase result spare 3 仕入実績予備３.<p>
	 *
	 */
	public void sub_char3(String value) {
		setConstString(offset + 286, $sub_char3, value);
	}


	/**
	 * Transaction terms cd. 1 取引条件ＣＤ１.<p>
	 *
	 */
	public String tterm_cd1() {
		return getConstString(offset + 287, $tterm_cd1);
	}

	/**
	 * Transaction terms cd. 1 取引条件ＣＤ１.<p>
	 *
	 */
	public void tterm_cd1(String value) {
		setConstString(offset + 287, $tterm_cd1, value);
	}


	/**
	 * Transaction terms name 1 取引条件名１.<p>
	 *
	 */
	public String tterm_nm1() {
		return getConstString(offset + 288, $tterm_nm1);
	}

	/**
	 * Transaction terms name 1 取引条件名１.<p>
	 *
	 */
	public void tterm_nm1(String value) {
		setConstString(offset + 288, $tterm_nm1, value);
	}


	/**
	 * Transaction terms remarks 1 取引条件備考１.<p>
	 *
	 */
	public String tterm_rmrks1() {
		return getConstString(offset + 289, $tterm_rmrks1);
	}

	/**
	 * Transaction terms remarks 1 取引条件備考１.<p>
	 *
	 */
	public void tterm_rmrks1(String value) {
		setConstString(offset + 289, $tterm_rmrks1, value);
	}


	/**
	 * Transaction terms cd. 2 取引条件ＣＤ２.<p>
	 *
	 */
	public String tterm_cd2() {
		return getConstString(offset + 290, $tterm_cd2);
	}

	/**
	 * Transaction terms cd. 2 取引条件ＣＤ２.<p>
	 *
	 */
	public void tterm_cd2(String value) {
		setConstString(offset + 290, $tterm_cd2, value);
	}


	/**
	 * Transaction terms name 2 取引条件名２.<p>
	 *
	 */
	public String tterm_nm2() {
		return getConstString(offset + 291, $tterm_nm2);
	}

	/**
	 * Transaction terms name 2 取引条件名２.<p>
	 *
	 */
	public void tterm_nm2(String value) {
		setConstString(offset + 291, $tterm_nm2, value);
	}


	/**
	 * Transaction terms remarks 2 取引条件備考２.<p>
	 *
	 */
	public String tterm_rmrks2() {
		return getConstString(offset + 292, $tterm_rmrks2);
	}

	/**
	 * Transaction terms remarks 2 取引条件備考２.<p>
	 *
	 */
	public void tterm_rmrks2(String value) {
		setConstString(offset + 292, $tterm_rmrks2, value);
	}


	/**
	 * Transaction terms cd. 3 取引条件ＣＤ３.<p>
	 *
	 */
	public String tterm_cd3() {
		return getConstString(offset + 293, $tterm_cd3);
	}

	/**
	 * Transaction terms cd. 3 取引条件ＣＤ３.<p>
	 *
	 */
	public void tterm_cd3(String value) {
		setConstString(offset + 293, $tterm_cd3, value);
	}


	/**
	 * Transaction terms name 3 取引条件名３.<p>
	 *
	 */
	public String tterm_nm3() {
		return getConstString(offset + 294, $tterm_nm3);
	}

	/**
	 * Transaction terms name 3 取引条件名３.<p>
	 *
	 */
	public void tterm_nm3(String value) {
		setConstString(offset + 294, $tterm_nm3, value);
	}


	/**
	 * Transaction terms remarks 3 取引条件備考３.<p>
	 *
	 */
	public String tterm_rmrks3() {
		return getConstString(offset + 295, $tterm_rmrks3);
	}

	/**
	 * Transaction terms remarks 3 取引条件備考３.<p>
	 *
	 */
	public void tterm_rmrks3(String value) {
		setConstString(offset + 295, $tterm_rmrks3, value);
	}


	/**
	 * Transaction details remarks 取引明細備考.<p>
	 *
	 */
	public String trd_d_rmrks() {
		return getConstString(offset + 296, $trd_d_rmrks);
	}

	/**
	 * Transaction details remarks 取引明細備考.<p>
	 *
	 */
	public void trd_d_rmrks(String value) {
		setConstString(offset + 296, $trd_d_rmrks, value);
	}


	/**
	 * Internal details remarks 内部明細備考.<p>
	 *
	 */
	public String intr_d_rmrks() {
		return getConstString(offset + 297, $intr_d_rmrks);
	}

	/**
	 * Internal details remarks 内部明細備考.<p>
	 *
	 */
	public void intr_d_rmrks(String value) {
		setConstString(offset + 297, $intr_d_rmrks, value);
	}


	/**
	 * Purchase result details spare 1 仕入実績明細予備１.<p>
	 *
	 */
	public String dtl_sub_char1() {
		return getConstString(offset + 298, $dtl_sub_char1);
	}

	/**
	 * Purchase result details spare 1 仕入実績明細予備１.<p>
	 *
	 */
	public void dtl_sub_char1(String value) {
		setConstString(offset + 298, $dtl_sub_char1, value);
	}


	/**
	 * Purchase result details spare 2 仕入実績明細予備２.<p>
	 *
	 */
	public String dtl_sub_char2() {
		return getConstString(offset + 299, $dtl_sub_char2);
	}

	/**
	 * Purchase result details spare 2 仕入実績明細予備２.<p>
	 *
	 */
	public void dtl_sub_char2(String value) {
		setConstString(offset + 299, $dtl_sub_char2, value);
	}


	/**
	 * Purchase result details spare 3 仕入実績明細予備３.<p>
	 *
	 */
	public String dtl_sub_char3() {
		return getConstString(offset + 300, $dtl_sub_char3);
	}

	/**
	 * Purchase result details spare 3 仕入実績明細予備３.<p>
	 *
	 */
	public void dtl_sub_char3(String value) {
		setConstString(offset + 300, $dtl_sub_char3, value);
	}


	/**
	 * PO sheet details remarks 注文書明細備考.<p>
	 *
	 */
	public String po_print_d_rmrks() {
		return getConstString(offset + 301, $po_print_d_rmrks);
	}

	/**
	 * PO sheet details remarks 注文書明細備考.<p>
	 *
	 */
	public void po_print_d_rmrks(String value) {
		setConstString(offset + 301, $po_print_d_rmrks, value);
	}


	/**
	 * EDI ＥＤＩ.<p>
	 *
	 */
	public boolean edi_flg() {
		return getConstBoolean(offset + 302, $edi_flg);
	}

	/**
	 * EDI ＥＤＩ.<p>
	 *
	 */
	public void edi_flg(boolean value) {
		setConstBoolean(offset + 302, $edi_flg, value);
	}


	/**
	 * EDI vendor delivery note No. ＥＤＩ業者納品書ＮＯ.<p>
	 *
	 */
	public String edi_bp_dlv_slip_no() {
		return getConstString(offset + 303, $edi_bp_dlv_slip_no);
	}

	/**
	 * EDI vendor delivery note No. ＥＤＩ業者納品書ＮＯ.<p>
	 *
	 */
	public void edi_bp_dlv_slip_no(String value) {
		setConstString(offset + 303, $edi_bp_dlv_slip_no, value);
	}


	/**
	 * EDI vendor delivery note details No. ＥＤＩ業者納品書明細ＮＯ.<p>
	 *
	 */
	public String edi_bp_dlv_slip_d_no() {
		return getConstString(offset + 304, $edi_bp_dlv_slip_d_no);
	}

	/**
	 * EDI vendor delivery note details No. ＥＤＩ業者納品書明細ＮＯ.<p>
	 *
	 */
	public void edi_bp_dlv_slip_d_no(String value) {
		setConstString(offset + 304, $edi_bp_dlv_slip_d_no, value);
	}


	/**
	 * Display order 表示順.<p>
	 *
	 */
	public MCNumber disp_seq() {
		return getConstNumber(offset + 305, $disp_seq);
	}

	/**
	 * Display order 表示順.<p>
	 *
	 */
	public void disp_seq(MCNumber value) {
		setConstNumber(offset + 305, $disp_seq, value);
	}

	/**
	 * Display order 表示順.<p>
	 *
	 */
	public void disp_seq(int value) {
		setConstNumber(offset + 305, $disp_seq, value);
	}

	/**
	 * Display order 表示順.<p>
	 *
	 */
	public void disp_seq(long value) {
		setConstNumber(offset + 305, $disp_seq, value);
	}

	/**
	 * Display order 表示順.<p>
	 *
	 */
	public void disp_seq(float value) {
		setConstNumber(offset + 305, $disp_seq, value);
	}

	/**
	 * Display order 表示順.<p>
	 *
	 */
	public void disp_seq(double value) {
		setConstNumber(offset + 305, $disp_seq, value);
	}


	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public String ins_usr_id() {
		return getConstString(offset + 306, $ins_usr_id);
	}

	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public void ins_usr_id(String value) {
		setConstString(offset + 306, $ins_usr_id, value);
	}


	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public String ins_usr_nm() {
		return getConstString(offset + 307, $ins_usr_nm);
	}

	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public void ins_usr_nm(String value) {
		setConstString(offset + 307, $ins_usr_nm, value);
	}


	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public String ins_func_id() {
		return getConstString(offset + 308, $ins_func_id);
	}

	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public void ins_func_id(String value) {
		setConstString(offset + 308, $ins_func_id, value);
	}


	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public String ins_func_nm() {
		return getConstString(offset + 309, $ins_func_nm);
	}

	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public void ins_func_nm(String value) {
		setConstString(offset + 309, $ins_func_nm, value);
	}


	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public MCTimestamp ins_ts() {
		return getConstTimestamp(offset + 310, $ins_ts);
	}

	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public void ins_ts(MCTimestamp value) {
		setConstTimestamp(offset + 310, $ins_ts, value);
	}


	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public String upd_usr_id() {
		return getConstString(offset + 311, $upd_usr_id);
	}

	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public void upd_usr_id(String value) {
		setConstString(offset + 311, $upd_usr_id, value);
	}


	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public String upd_usr_nm() {
		return getConstString(offset + 312, $upd_usr_nm);
	}

	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public void upd_usr_nm(String value) {
		setConstString(offset + 312, $upd_usr_nm, value);
	}


	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public String upd_func_id() {
		return getConstString(offset + 313, $upd_func_id);
	}

	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public void upd_func_id(String value) {
		setConstString(offset + 313, $upd_func_id, value);
	}


	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public String upd_func_nm() {
		return getConstString(offset + 314, $upd_func_nm);
	}

	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public void upd_func_nm(String value) {
		setConstString(offset + 314, $upd_func_nm, value);
	}


	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public MCTimestamp upd_ts() {
		return getConstTimestamp(offset + 315, $upd_ts);
	}

	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public void upd_ts(MCTimestamp value) {
		setConstTimestamp(offset + 315, $upd_ts, value);
	}


	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public String upd_srv_req_no() {
		return getConstString(offset + 316, $upd_srv_req_no);
	}

	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public void upd_srv_req_no(String value) {
		setConstString(offset + 316, $upd_srv_req_no, value);
	}


	public MCNumber arr_pr_upd_cntr() {
		return getConstNumber(offset + 317, $arr_pr_upd_cntr);
	}

	public void arr_pr_upd_cntr(MCNumber value) {
		setConstNumber(offset + 317, $arr_pr_upd_cntr, value);
	}

	public void arr_pr_upd_cntr(int value) {
		setConstNumber(offset + 317, $arr_pr_upd_cntr, value);
	}

	public void arr_pr_upd_cntr(long value) {
		setConstNumber(offset + 317, $arr_pr_upd_cntr, value);
	}

	public void arr_pr_upd_cntr(float value) {
		setConstNumber(offset + 317, $arr_pr_upd_cntr, value);
	}

	public void arr_pr_upd_cntr(double value) {
		setConstNumber(offset + 317, $arr_pr_upd_cntr, value);
	}


	public MCNumber purc_act_upd_cntr() {
		return getConstNumber(offset + 318, $purc_act_upd_cntr);
	}

	public void purc_act_upd_cntr(MCNumber value) {
		setConstNumber(offset + 318, $purc_act_upd_cntr, value);
	}

	public void purc_act_upd_cntr(int value) {
		setConstNumber(offset + 318, $purc_act_upd_cntr, value);
	}

	public void purc_act_upd_cntr(long value) {
		setConstNumber(offset + 318, $purc_act_upd_cntr, value);
	}

	public void purc_act_upd_cntr(float value) {
		setConstNumber(offset + 318, $purc_act_upd_cntr, value);
	}

	public void purc_act_upd_cntr(double value) {
		setConstNumber(offset + 318, $purc_act_upd_cntr, value);
	}


	public MCNumber rcpt_iv_upd_cntr() {
		return getConstNumber(offset + 319, $rcpt_iv_upd_cntr);
	}

	public void rcpt_iv_upd_cntr(MCNumber value) {
		setConstNumber(offset + 319, $rcpt_iv_upd_cntr, value);
	}

	public void rcpt_iv_upd_cntr(int value) {
		setConstNumber(offset + 319, $rcpt_iv_upd_cntr, value);
	}

	public void rcpt_iv_upd_cntr(long value) {
		setConstNumber(offset + 319, $rcpt_iv_upd_cntr, value);
	}

	public void rcpt_iv_upd_cntr(float value) {
		setConstNumber(offset + 319, $rcpt_iv_upd_cntr, value);
	}

	public void rcpt_iv_upd_cntr(double value) {
		setConstNumber(offset + 319, $rcpt_iv_upd_cntr, value);
	}


	public mcframe.clientMAUB.MAUBP5310.RtnMsgR rts_msg_p(){
		return (mcframe.clientMAUB.MAUBP5310.RtnMsgR) getConstInnerRow(offset + 320, $rts_msg_p);
	}
	
	public void rts_msg_p(mcframe.clientMAUB.MAUBP5310.RtnMsgR row){
		setConstInnerRow(offset + 320, $rts_msg_p, row);
	}


	/**
	 * Transaction unit cd. before change 変更前取引単位ＣＤ.<p>
	 *
	 */
	public String db_trd_unit_cd() {
		return getConstString(offset + 321, $db_trd_unit_cd);
	}

	/**
	 * Transaction unit cd. before change 変更前取引単位ＣＤ.<p>
	 *
	 */
	public void db_trd_unit_cd(String value) {
		setConstString(offset + 321, $db_trd_unit_cd, value);
	}


	/**
	 * Transaction unit conversion qty. before change 変更前取引単位換算数量.<p>
	 *
	 */
	public MCNumber db_trd_unit_conv_qty() {
		return getConstNumber(offset + 322, $db_trd_unit_conv_qty);
	}

	/**
	 * Transaction unit conversion qty. before change 変更前取引単位換算数量.<p>
	 *
	 */
	public void db_trd_unit_conv_qty(MCNumber value) {
		setConstNumber(offset + 322, $db_trd_unit_conv_qty, value);
	}

	/**
	 * Transaction unit conversion qty. before change 変更前取引単位換算数量.<p>
	 *
	 */
	public void db_trd_unit_conv_qty(int value) {
		setConstNumber(offset + 322, $db_trd_unit_conv_qty, value);
	}

	/**
	 * Transaction unit conversion qty. before change 変更前取引単位換算数量.<p>
	 *
	 */
	public void db_trd_unit_conv_qty(long value) {
		setConstNumber(offset + 322, $db_trd_unit_conv_qty, value);
	}

	/**
	 * Transaction unit conversion qty. before change 変更前取引単位換算数量.<p>
	 *
	 */
	public void db_trd_unit_conv_qty(float value) {
		setConstNumber(offset + 322, $db_trd_unit_conv_qty, value);
	}

	/**
	 * Transaction unit conversion qty. before change 変更前取引単位換算数量.<p>
	 *
	 */
	public void db_trd_unit_conv_qty(double value) {
		setConstNumber(offset + 322, $db_trd_unit_conv_qty, value);
	}


	/**
	 * Conversion base qty. in transaction unit before change 変更前取引単位換算基準数量.<p>
	 *
	 */
	public MCNumber db_trd_unit_conv_base_qty() {
		return getConstNumber(offset + 323, $db_trd_unit_conv_base_qty);
	}

	/**
	 * Conversion base qty. in transaction unit before change 変更前取引単位換算基準数量.<p>
	 *
	 */
	public void db_trd_unit_conv_base_qty(MCNumber value) {
		setConstNumber(offset + 323, $db_trd_unit_conv_base_qty, value);
	}

	/**
	 * Conversion base qty. in transaction unit before change 変更前取引単位換算基準数量.<p>
	 *
	 */
	public void db_trd_unit_conv_base_qty(int value) {
		setConstNumber(offset + 323, $db_trd_unit_conv_base_qty, value);
	}

	/**
	 * Conversion base qty. in transaction unit before change 変更前取引単位換算基準数量.<p>
	 *
	 */
	public void db_trd_unit_conv_base_qty(long value) {
		setConstNumber(offset + 323, $db_trd_unit_conv_base_qty, value);
	}

	/**
	 * Conversion base qty. in transaction unit before change 変更前取引単位換算基準数量.<p>
	 *
	 */
	public void db_trd_unit_conv_base_qty(float value) {
		setConstNumber(offset + 323, $db_trd_unit_conv_base_qty, value);
	}

	/**
	 * Conversion base qty. in transaction unit before change 変更前取引単位換算基準数量.<p>
	 *
	 */
	public void db_trd_unit_conv_base_qty(double value) {
		setConstNumber(offset + 323, $db_trd_unit_conv_base_qty, value);
	}


	/**
	 * Transaction unit number of decimal places before change 変更前取引単位小数部有効桁数.<p>
	 *
	 */
	public MCNumber db_trd_unit_dec_place() {
		return getConstNumber(offset + 324, $db_trd_unit_dec_place);
	}

	/**
	 * Transaction unit number of decimal places before change 変更前取引単位小数部有効桁数.<p>
	 *
	 */
	public void db_trd_unit_dec_place(MCNumber value) {
		setConstNumber(offset + 324, $db_trd_unit_dec_place, value);
	}

	/**
	 * Transaction unit number of decimal places before change 変更前取引単位小数部有効桁数.<p>
	 *
	 */
	public void db_trd_unit_dec_place(int value) {
		setConstNumber(offset + 324, $db_trd_unit_dec_place, value);
	}

	/**
	 * Transaction unit number of decimal places before change 変更前取引単位小数部有効桁数.<p>
	 *
	 */
	public void db_trd_unit_dec_place(long value) {
		setConstNumber(offset + 324, $db_trd_unit_dec_place, value);
	}

	/**
	 * Transaction unit number of decimal places before change 変更前取引単位小数部有効桁数.<p>
	 *
	 */
	public void db_trd_unit_dec_place(float value) {
		setConstNumber(offset + 324, $db_trd_unit_dec_place, value);
	}

	/**
	 * Transaction unit number of decimal places before change 変更前取引単位小数部有効桁数.<p>
	 *
	 */
	public void db_trd_unit_dec_place(double value) {
		setConstNumber(offset + 324, $db_trd_unit_dec_place, value);
	}


	/**
	 * Transaction unit rounding type before change 変更前取引単位端数処理区分.<p>
	 *
	 */
	public String db_trd_unit_rnd_typ() {
		return getConstString(offset + 325, $db_trd_unit_rnd_typ);
	}

	/**
	 * Transaction unit rounding type before change 変更前取引単位端数処理区分.<p>
	 *
	 */
	public void db_trd_unit_rnd_typ(String value) {
		setConstString(offset + 325, $db_trd_unit_rnd_typ, value);
	}


	/**
	 * Transaction unit qty. before change 変更前取引単位数量.<p>
	 *
	 */
	public MCNumber db_trd_unit_qty() {
		return getConstNumber(offset + 326, $db_trd_unit_qty);
	}

	/**
	 * Transaction unit qty. before change 変更前取引単位数量.<p>
	 *
	 */
	public void db_trd_unit_qty(MCNumber value) {
		setConstNumber(offset + 326, $db_trd_unit_qty, value);
	}

	/**
	 * Transaction unit qty. before change 変更前取引単位数量.<p>
	 *
	 */
	public void db_trd_unit_qty(int value) {
		setConstNumber(offset + 326, $db_trd_unit_qty, value);
	}

	/**
	 * Transaction unit qty. before change 変更前取引単位数量.<p>
	 *
	 */
	public void db_trd_unit_qty(long value) {
		setConstNumber(offset + 326, $db_trd_unit_qty, value);
	}

	/**
	 * Transaction unit qty. before change 変更前取引単位数量.<p>
	 *
	 */
	public void db_trd_unit_qty(float value) {
		setConstNumber(offset + 326, $db_trd_unit_qty, value);
	}

	/**
	 * Transaction unit qty. before change 変更前取引単位数量.<p>
	 *
	 */
	public void db_trd_unit_qty(double value) {
		setConstNumber(offset + 326, $db_trd_unit_qty, value);
	}


	/**
	 * Amount (Transaction currency) before change 変更前取引通貨金額.<p>
	 *
	 */
	public MCNumber db_trd_cur_amt() {
		return getConstNumber(offset + 327, $db_trd_cur_amt);
	}

	/**
	 * Amount (Transaction currency) before change 変更前取引通貨金額.<p>
	 *
	 */
	public void db_trd_cur_amt(MCNumber value) {
		setConstNumber(offset + 327, $db_trd_cur_amt, value);
	}

	/**
	 * Amount (Transaction currency) before change 変更前取引通貨金額.<p>
	 *
	 */
	public void db_trd_cur_amt(int value) {
		setConstNumber(offset + 327, $db_trd_cur_amt, value);
	}

	/**
	 * Amount (Transaction currency) before change 変更前取引通貨金額.<p>
	 *
	 */
	public void db_trd_cur_amt(long value) {
		setConstNumber(offset + 327, $db_trd_cur_amt, value);
	}

	/**
	 * Amount (Transaction currency) before change 変更前取引通貨金額.<p>
	 *
	 */
	public void db_trd_cur_amt(float value) {
		setConstNumber(offset + 327, $db_trd_cur_amt, value);
	}

	/**
	 * Amount (Transaction currency) before change 変更前取引通貨金額.<p>
	 *
	 */
	public void db_trd_cur_amt(double value) {
		setConstNumber(offset + 327, $db_trd_cur_amt, value);
	}


	/**
	 * (Before change) Discount amount (Transaction currency) 変更前取引通貨値引額.<p>
	 *
	 */
	public MCNumber db_trd_cur_dscnt_amt() {
		return getConstNumber(offset + 328, $db_trd_cur_dscnt_amt);
	}

	/**
	 * (Before change) Discount amount (Transaction currency) 変更前取引通貨値引額.<p>
	 *
	 */
	public void db_trd_cur_dscnt_amt(MCNumber value) {
		setConstNumber(offset + 328, $db_trd_cur_dscnt_amt, value);
	}

	/**
	 * (Before change) Discount amount (Transaction currency) 変更前取引通貨値引額.<p>
	 *
	 */
	public void db_trd_cur_dscnt_amt(int value) {
		setConstNumber(offset + 328, $db_trd_cur_dscnt_amt, value);
	}

	/**
	 * (Before change) Discount amount (Transaction currency) 変更前取引通貨値引額.<p>
	 *
	 */
	public void db_trd_cur_dscnt_amt(long value) {
		setConstNumber(offset + 328, $db_trd_cur_dscnt_amt, value);
	}

	/**
	 * (Before change) Discount amount (Transaction currency) 変更前取引通貨値引額.<p>
	 *
	 */
	public void db_trd_cur_dscnt_amt(float value) {
		setConstNumber(offset + 328, $db_trd_cur_dscnt_amt, value);
	}

	/**
	 * (Before change) Discount amount (Transaction currency) 変更前取引通貨値引額.<p>
	 *
	 */
	public void db_trd_cur_dscnt_amt(double value) {
		setConstNumber(offset + 328, $db_trd_cur_dscnt_amt, value);
	}


	/**
	 * Chargeable supply amount (Transaction currency) before change 変更前取引通貨有償支給金額.<p>
	 *
	 */
	public MCNumber db_trd_cur_onr_prov_amt() {
		return getConstNumber(offset + 329, $db_trd_cur_onr_prov_amt);
	}

	/**
	 * Chargeable supply amount (Transaction currency) before change 変更前取引通貨有償支給金額.<p>
	 *
	 */
	public void db_trd_cur_onr_prov_amt(MCNumber value) {
		setConstNumber(offset + 329, $db_trd_cur_onr_prov_amt, value);
	}

	/**
	 * Chargeable supply amount (Transaction currency) before change 変更前取引通貨有償支給金額.<p>
	 *
	 */
	public void db_trd_cur_onr_prov_amt(int value) {
		setConstNumber(offset + 329, $db_trd_cur_onr_prov_amt, value);
	}

	/**
	 * Chargeable supply amount (Transaction currency) before change 変更前取引通貨有償支給金額.<p>
	 *
	 */
	public void db_trd_cur_onr_prov_amt(long value) {
		setConstNumber(offset + 329, $db_trd_cur_onr_prov_amt, value);
	}

	/**
	 * Chargeable supply amount (Transaction currency) before change 変更前取引通貨有償支給金額.<p>
	 *
	 */
	public void db_trd_cur_onr_prov_amt(float value) {
		setConstNumber(offset + 329, $db_trd_cur_onr_prov_amt, value);
	}

	/**
	 * Chargeable supply amount (Transaction currency) before change 変更前取引通貨有償支給金額.<p>
	 *
	 */
	public void db_trd_cur_onr_prov_amt(double value) {
		setConstNumber(offset + 329, $db_trd_cur_onr_prov_amt, value);
	}


	/**
	 * (Before change) Chargeable supply unit price (Transaction currency) 変更前取引通貨有償支給単価.<p>
	 *
	 */
	public MCNumber db_trd_cur_onr_prov_upri() {
		return getConstNumber(offset + 330, $db_trd_cur_onr_prov_upri);
	}

	/**
	 * (Before change) Chargeable supply unit price (Transaction currency) 変更前取引通貨有償支給単価.<p>
	 *
	 */
	public void db_trd_cur_onr_prov_upri(MCNumber value) {
		setConstNumber(offset + 330, $db_trd_cur_onr_prov_upri, value);
	}

	/**
	 * (Before change) Chargeable supply unit price (Transaction currency) 変更前取引通貨有償支給単価.<p>
	 *
	 */
	public void db_trd_cur_onr_prov_upri(int value) {
		setConstNumber(offset + 330, $db_trd_cur_onr_prov_upri, value);
	}

	/**
	 * (Before change) Chargeable supply unit price (Transaction currency) 変更前取引通貨有償支給単価.<p>
	 *
	 */
	public void db_trd_cur_onr_prov_upri(long value) {
		setConstNumber(offset + 330, $db_trd_cur_onr_prov_upri, value);
	}

	/**
	 * (Before change) Chargeable supply unit price (Transaction currency) 変更前取引通貨有償支給単価.<p>
	 *
	 */
	public void db_trd_cur_onr_prov_upri(float value) {
		setConstNumber(offset + 330, $db_trd_cur_onr_prov_upri, value);
	}

	/**
	 * (Before change) Chargeable supply unit price (Transaction currency) 変更前取引通貨有償支給単価.<p>
	 *
	 */
	public void db_trd_cur_onr_prov_upri(double value) {
		setConstNumber(offset + 330, $db_trd_cur_onr_prov_upri, value);
	}


	/**
	 * Subcontracting amount (Transaction currency) before change 変更前取引通貨加工金額.<p>
	 *
	 */
	public MCNumber db_trd_cur_proc_amt() {
		return getConstNumber(offset + 331, $db_trd_cur_proc_amt);
	}

	/**
	 * Subcontracting amount (Transaction currency) before change 変更前取引通貨加工金額.<p>
	 *
	 */
	public void db_trd_cur_proc_amt(MCNumber value) {
		setConstNumber(offset + 331, $db_trd_cur_proc_amt, value);
	}

	/**
	 * Subcontracting amount (Transaction currency) before change 変更前取引通貨加工金額.<p>
	 *
	 */
	public void db_trd_cur_proc_amt(int value) {
		setConstNumber(offset + 331, $db_trd_cur_proc_amt, value);
	}

	/**
	 * Subcontracting amount (Transaction currency) before change 変更前取引通貨加工金額.<p>
	 *
	 */
	public void db_trd_cur_proc_amt(long value) {
		setConstNumber(offset + 331, $db_trd_cur_proc_amt, value);
	}

	/**
	 * Subcontracting amount (Transaction currency) before change 変更前取引通貨加工金額.<p>
	 *
	 */
	public void db_trd_cur_proc_amt(float value) {
		setConstNumber(offset + 331, $db_trd_cur_proc_amt, value);
	}

	/**
	 * Subcontracting amount (Transaction currency) before change 変更前取引通貨加工金額.<p>
	 *
	 */
	public void db_trd_cur_proc_amt(double value) {
		setConstNumber(offset + 331, $db_trd_cur_proc_amt, value);
	}


	/**
	 * (Before change) Subcontracting unit price (Transaction currency) 変更前取引通貨加工単価.<p>
	 *
	 */
	public MCNumber db_trd_cur_proc_upri() {
		return getConstNumber(offset + 332, $db_trd_cur_proc_upri);
	}

	/**
	 * (Before change) Subcontracting unit price (Transaction currency) 変更前取引通貨加工単価.<p>
	 *
	 */
	public void db_trd_cur_proc_upri(MCNumber value) {
		setConstNumber(offset + 332, $db_trd_cur_proc_upri, value);
	}

	/**
	 * (Before change) Subcontracting unit price (Transaction currency) 変更前取引通貨加工単価.<p>
	 *
	 */
	public void db_trd_cur_proc_upri(int value) {
		setConstNumber(offset + 332, $db_trd_cur_proc_upri, value);
	}

	/**
	 * (Before change) Subcontracting unit price (Transaction currency) 変更前取引通貨加工単価.<p>
	 *
	 */
	public void db_trd_cur_proc_upri(long value) {
		setConstNumber(offset + 332, $db_trd_cur_proc_upri, value);
	}

	/**
	 * (Before change) Subcontracting unit price (Transaction currency) 変更前取引通貨加工単価.<p>
	 *
	 */
	public void db_trd_cur_proc_upri(float value) {
		setConstNumber(offset + 332, $db_trd_cur_proc_upri, value);
	}

	/**
	 * (Before change) Subcontracting unit price (Transaction currency) 変更前取引通貨加工単価.<p>
	 *
	 */
	public void db_trd_cur_proc_upri(double value) {
		setConstNumber(offset + 332, $db_trd_cur_proc_upri, value);
	}


	/**
	 * Amount (Transaction currency) before change 変更前取引通貨金額.<p>
	 *
	 */
	public MCNumber db_trd_cur_tax_amt() {
		return getConstNumber(offset + 333, $db_trd_cur_tax_amt);
	}

	/**
	 * Amount (Transaction currency) before change 変更前取引通貨金額.<p>
	 *
	 */
	public void db_trd_cur_tax_amt(MCNumber value) {
		setConstNumber(offset + 333, $db_trd_cur_tax_amt, value);
	}

	/**
	 * Amount (Transaction currency) before change 変更前取引通貨金額.<p>
	 *
	 */
	public void db_trd_cur_tax_amt(int value) {
		setConstNumber(offset + 333, $db_trd_cur_tax_amt, value);
	}

	/**
	 * Amount (Transaction currency) before change 変更前取引通貨金額.<p>
	 *
	 */
	public void db_trd_cur_tax_amt(long value) {
		setConstNumber(offset + 333, $db_trd_cur_tax_amt, value);
	}

	/**
	 * Amount (Transaction currency) before change 変更前取引通貨金額.<p>
	 *
	 */
	public void db_trd_cur_tax_amt(float value) {
		setConstNumber(offset + 333, $db_trd_cur_tax_amt, value);
	}

	/**
	 * Amount (Transaction currency) before change 変更前取引通貨金額.<p>
	 *
	 */
	public void db_trd_cur_tax_amt(double value) {
		setConstNumber(offset + 333, $db_trd_cur_tax_amt, value);
	}


	/**
	 * (Before change) Unit price (Transaction currency) 変更前取引通貨単価.<p>
	 *
	 */
	public MCNumber db_trd_cur_upri() {
		return getConstNumber(offset + 334, $db_trd_cur_upri);
	}

	/**
	 * (Before change) Unit price (Transaction currency) 変更前取引通貨単価.<p>
	 *
	 */
	public void db_trd_cur_upri(MCNumber value) {
		setConstNumber(offset + 334, $db_trd_cur_upri, value);
	}

	/**
	 * (Before change) Unit price (Transaction currency) 変更前取引通貨単価.<p>
	 *
	 */
	public void db_trd_cur_upri(int value) {
		setConstNumber(offset + 334, $db_trd_cur_upri, value);
	}

	/**
	 * (Before change) Unit price (Transaction currency) 変更前取引通貨単価.<p>
	 *
	 */
	public void db_trd_cur_upri(long value) {
		setConstNumber(offset + 334, $db_trd_cur_upri, value);
	}

	/**
	 * (Before change) Unit price (Transaction currency) 変更前取引通貨単価.<p>
	 *
	 */
	public void db_trd_cur_upri(float value) {
		setConstNumber(offset + 334, $db_trd_cur_upri, value);
	}

	/**
	 * (Before change) Unit price (Transaction currency) 変更前取引通貨単価.<p>
	 *
	 */
	public void db_trd_cur_upri(double value) {
		setConstNumber(offset + 334, $db_trd_cur_upri, value);
	}


	/**
	 * Withholding tax rate before change 変更前源泉税率.<p>
	 *
	 */
	public MCNumber db_wtax_rate() {
		return getConstNumber(offset + 335, $db_wtax_rate);
	}

	/**
	 * Withholding tax rate before change 変更前源泉税率.<p>
	 *
	 */
	public void db_wtax_rate(MCNumber value) {
		setConstNumber(offset + 335, $db_wtax_rate, value);
	}

	/**
	 * Withholding tax rate before change 変更前源泉税率.<p>
	 *
	 */
	public void db_wtax_rate(int value) {
		setConstNumber(offset + 335, $db_wtax_rate, value);
	}

	/**
	 * Withholding tax rate before change 変更前源泉税率.<p>
	 *
	 */
	public void db_wtax_rate(long value) {
		setConstNumber(offset + 335, $db_wtax_rate, value);
	}

	/**
	 * Withholding tax rate before change 変更前源泉税率.<p>
	 *
	 */
	public void db_wtax_rate(float value) {
		setConstNumber(offset + 335, $db_wtax_rate, value);
	}

	/**
	 * Withholding tax rate before change 変更前源泉税率.<p>
	 *
	 */
	public void db_wtax_rate(double value) {
		setConstNumber(offset + 335, $db_wtax_rate, value);
	}


	/**
	 * Tax rate before change 変更前税率.<p>
	 *
	 */
	public MCNumber db_tax_rate() {
		return getConstNumber(offset + 336, $db_tax_rate);
	}

	/**
	 * Tax rate before change 変更前税率.<p>
	 *
	 */
	public void db_tax_rate(MCNumber value) {
		setConstNumber(offset + 336, $db_tax_rate, value);
	}

	/**
	 * Tax rate before change 変更前税率.<p>
	 *
	 */
	public void db_tax_rate(int value) {
		setConstNumber(offset + 336, $db_tax_rate, value);
	}

	/**
	 * Tax rate before change 変更前税率.<p>
	 *
	 */
	public void db_tax_rate(long value) {
		setConstNumber(offset + 336, $db_tax_rate, value);
	}

	/**
	 * Tax rate before change 変更前税率.<p>
	 *
	 */
	public void db_tax_rate(float value) {
		setConstNumber(offset + 336, $db_tax_rate, value);
	}

	/**
	 * Tax rate before change 変更前税率.<p>
	 *
	 */
	public void db_tax_rate(double value) {
		setConstNumber(offset + 336, $db_tax_rate, value);
	}


	/**
	 * Tax inclusive flg. before change 変更前内税ＦＬＧ.<p>
	 *
	 */
	public boolean db_inc_tax_flg() {
		return getConstBoolean(offset + 337, $db_inc_tax_flg);
	}

	/**
	 * Tax inclusive flg. before change 変更前内税ＦＬＧ.<p>
	 *
	 */
	public void db_inc_tax_flg(boolean value) {
		setConstBoolean(offset + 337, $db_inc_tax_flg, value);
	}


	public boolean sls_sync_flg() {
		return getConstBoolean(offset + 338, $sls_sync_flg);
	}

	public void sls_sync_flg(boolean value) {
		setConstBoolean(offset + 338, $sls_sync_flg, value);
	}


	/**
	 * Purchase/Acceptance detective qty. 仕入・検収不良数量.<p>
	 *
	 */
	public MCNumber purc_act_qty() {
		return getConstNumber(offset + 339, $purc_act_qty);
	}

	/**
	 * Purchase/Acceptance detective qty. 仕入・検収不良数量.<p>
	 *
	 */
	public void purc_act_qty(MCNumber value) {
		setConstNumber(offset + 339, $purc_act_qty, value);
	}

	/**
	 * Purchase/Acceptance detective qty. 仕入・検収不良数量.<p>
	 *
	 */
	public void purc_act_qty(int value) {
		setConstNumber(offset + 339, $purc_act_qty, value);
	}

	/**
	 * Purchase/Acceptance detective qty. 仕入・検収不良数量.<p>
	 *
	 */
	public void purc_act_qty(long value) {
		setConstNumber(offset + 339, $purc_act_qty, value);
	}

	/**
	 * Purchase/Acceptance detective qty. 仕入・検収不良数量.<p>
	 *
	 */
	public void purc_act_qty(float value) {
		setConstNumber(offset + 339, $purc_act_qty, value);
	}

	/**
	 * Purchase/Acceptance detective qty. 仕入・検収不良数量.<p>
	 *
	 */
	public void purc_act_qty(double value) {
		setConstNumber(offset + 339, $purc_act_qty, value);
	}


	public String getString(String name) {
		if ($trd_cd.equalsIgnoreCase(name)) {
			return trd_cd();
		}
		if ($trd_nm.equalsIgnoreCase(name)) {
			return trd_nm();
		}
		if ($trd_ptn_typ.equalsIgnoreCase(name)) {
			return trd_ptn_typ();
		}
		if ($arr_ptn_typ.equalsIgnoreCase(name)) {
			return arr_ptn_typ();
		}
		if ($arr_ptn_typ_nm.equalsIgnoreCase(name)) {
			return arr_ptn_typ_nm();
		}
		if ($purc_basis_typ.equalsIgnoreCase(name)) {
			return purc_basis_typ();
		}
		if ($purc_basis_typ_nm.equalsIgnoreCase(name)) {
			return purc_basis_typ_nm();
		}
		if ($aprv_no.equalsIgnoreCase(name)) {
			return aprv_no();
		}
		if ($aprv_sts_typ.equalsIgnoreCase(name)) {
			return aprv_sts_typ();
		}
		if ($aprv_sts_typ_nm.equalsIgnoreCase(name)) {
			return aprv_sts_typ_nm();
		}
		if ($po_no.equalsIgnoreCase(name)) {
			return po_no();
		}
		if ($po_d_no.equalsIgnoreCase(name)) {
			return po_d_no();
		}
		if ($po_schd_src_typ.equalsIgnoreCase(name)) {
			return po_schd_src_typ();
		}
		if ($po_schd_src_typ_nm.equalsIgnoreCase(name)) {
			return po_schd_src_typ_nm();
		}
		if ($po_schd_src_no.equalsIgnoreCase(name)) {
			return po_schd_src_no();
		}
		if ($rcpt_iv_no.equalsIgnoreCase(name)) {
			return rcpt_iv_no();
		}
		if ($rcpt_iv_mng_no.equalsIgnoreCase(name)) {
			return rcpt_iv_mng_no();
		}
		if ($rcpt_iv_d_no.equalsIgnoreCase(name)) {
			return rcpt_iv_d_no();
		}
		if ($mfg_inst_no.equalsIgnoreCase(name)) {
			return mfg_inst_no();
		}
		if ($mfg_loc_cd.equalsIgnoreCase(name)) {
			return mfg_loc_cd();
		}
		if ($bom_ptn.equalsIgnoreCase(name)) {
			return bom_ptn();
		}
		if ($purc_schd_no.equalsIgnoreCase(name)) {
			return purc_schd_no();
		}
		if ($purc_act_no.equalsIgnoreCase(name)) {
			return purc_act_no();
		}
		if ($purc_act_d_no.equalsIgnoreCase(name)) {
			return purc_act_d_no();
		}
		if ($arr_schd_no.equalsIgnoreCase(name)) {
			return arr_schd_no();
		}
		if ($arr_pr_no.equalsIgnoreCase(name)) {
			return arr_pr_no();
		}
		if ($arr_act_no.equalsIgnoreCase(name)) {
			return arr_act_no();
		}
		if ($from_gd_cd.equalsIgnoreCase(name)) {
			return from_gd_cd();
		}
		if ($tmp_gd_cd.equalsIgnoreCase(name)) {
			return tmp_gd_cd();
		}
		if ($tmp_quality_typ.equalsIgnoreCase(name)) {
			return tmp_quality_typ();
		}
		if ($tmp_stk_insp_typ.equalsIgnoreCase(name)) {
			return tmp_stk_insp_typ();
		}
		if ($tmp_stk_id_typ.equalsIgnoreCase(name)) {
			return tmp_stk_id_typ();
		}
		if ($gi_wg_cd.equalsIgnoreCase(name)) {
			return gi_wg_cd();
		}
		if ($gi_loc_cd.equalsIgnoreCase(name)) {
			return gi_loc_cd();
		}
		if ($gi_str_ln_cd.equalsIgnoreCase(name)) {
			return gi_str_ln_cd();
		}
		if ($gi_unit_cd.equalsIgnoreCase(name)) {
			return gi_unit_cd();
		}
		if ($par_purc_act_d_no.equalsIgnoreCase(name)) {
			return par_purc_act_d_no();
		}
		if ($asset_mng_typ.equalsIgnoreCase(name)) {
			return asset_mng_typ();
		}
		if ($asset_mng_typ_nm.equalsIgnoreCase(name)) {
			return asset_mng_typ_nm();
		}
		if ($itm_typ.equalsIgnoreCase(name)) {
			return itm_typ();
		}
		if ($itm_typ_nm.equalsIgnoreCase(name)) {
			return itm_typ_nm();
		}
		if ($itm_typ_d_cd.equalsIgnoreCase(name)) {
			return itm_typ_d_cd();
		}
		if ($itm_typ_d_nm.equalsIgnoreCase(name)) {
			return itm_typ_d_nm();
		}
		if ($iv_itm_nm.equalsIgnoreCase(name)) {
			return iv_itm_nm();
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
		if ($sppl_cd.equalsIgnoreCase(name)) {
			return sppl_cd();
		}
		if ($sppl_nm.equalsIgnoreCase(name)) {
			return sppl_nm();
		}
		if ($ap_cred_cd.equalsIgnoreCase(name)) {
			return ap_cred_cd();
		}
		if ($purc_slip_each_lot_typ.equalsIgnoreCase(name)) {
			return purc_slip_each_lot_typ();
		}
		if ($prnt_lcl_cd.equalsIgnoreCase(name)) {
			return prnt_lcl_cd();
		}
		if ($purc_amt_rnd_typ.equalsIgnoreCase(name)) {
			return purc_amt_rnd_typ();
		}
		if ($purc_tax_rnd_typ.equalsIgnoreCase(name)) {
			return purc_tax_rnd_typ();
		}
		if ($purc_tax_calc_typ.equalsIgnoreCase(name)) {
			return purc_tax_calc_typ();
		}
		if ($asppl_cd.equalsIgnoreCase(name)) {
			return asppl_cd();
		}
		if ($asppl_nm.equalsIgnoreCase(name)) {
			return asppl_nm();
		}
		if ($maker_cd.equalsIgnoreCase(name)) {
			return maker_cd();
		}
		if ($maker_nm.equalsIgnoreCase(name)) {
			return maker_nm();
		}
		if ($trd_unit_cd.equalsIgnoreCase(name)) {
			return trd_unit_cd();
		}
		if ($trd_unit_nm.equalsIgnoreCase(name)) {
			return trd_unit_nm();
		}
		if ($trd_unit_rnd_typ.equalsIgnoreCase(name)) {
			return trd_unit_rnd_typ();
		}
		if ($base_unit_cd.equalsIgnoreCase(name)) {
			return base_unit_cd();
		}
		if ($base_unit_nm.equalsIgnoreCase(name)) {
			return base_unit_nm();
		}
		if ($base_unit_rnd_typ.equalsIgnoreCase(name)) {
			return base_unit_rnd_typ();
		}
		if ($src_trd_unit_cd.equalsIgnoreCase(name)) {
			return src_trd_unit_cd();
		}
		if ($src_trd_unit_rnd_typ.equalsIgnoreCase(name)) {
			return src_trd_unit_rnd_typ();
		}
		if ($re_arr_loc_wg_cd.equalsIgnoreCase(name)) {
			return re_arr_loc_wg_cd();
		}
		if ($re_arr_loc_wg_nm.equalsIgnoreCase(name)) {
			return re_arr_loc_wg_nm();
		}
		if ($re_arr_loc_cd.equalsIgnoreCase(name)) {
			return re_arr_loc_cd();
		}
		if ($re_arr_loc_nm.equalsIgnoreCase(name)) {
			return re_arr_loc_nm();
		}
		if ($re_arr_loc_site_cd.equalsIgnoreCase(name)) {
			return re_arr_loc_site_cd();
		}
		if ($re_arr_loc_cal_cd.equalsIgnoreCase(name)) {
			return re_arr_loc_cal_cd();
		}
		if ($re_arr_loc_sppl_cd.equalsIgnoreCase(name)) {
			return re_arr_loc_sppl_cd();
		}
		if ($re_arr_loc_sppl_cal_cd.equalsIgnoreCase(name)) {
			return re_arr_loc_sppl_cal_cd();
		}
		if ($quality_typ.equalsIgnoreCase(name)) {
			return quality_typ();
		}
		if ($quality_typ_nm.equalsIgnoreCase(name)) {
			return quality_typ_nm();
		}
		if ($gd_cd.equalsIgnoreCase(name)) {
			return gd_cd();
		}
		if ($gd_nm.equalsIgnoreCase(name)) {
			return gd_nm();
		}
		if ($site_cd.equalsIgnoreCase(name)) {
			return site_cd();
		}
		if ($site_nm.equalsIgnoreCase(name)) {
			return site_nm();
		}
		if ($in_to_loc_wg_cd.equalsIgnoreCase(name)) {
			return in_to_loc_wg_cd();
		}
		if ($in_to_loc_wg_nm.equalsIgnoreCase(name)) {
			return in_to_loc_wg_nm();
		}
		if ($in_to_loc_cd.equalsIgnoreCase(name)) {
			return in_to_loc_cd();
		}
		if ($in_to_loc_nm.equalsIgnoreCase(name)) {
			return in_to_loc_nm();
		}
		if ($outsrc_sppl_cd.equalsIgnoreCase(name)) {
			return outsrc_sppl_cd();
		}
		if ($drct_dlv_typ.equalsIgnoreCase(name)) {
			return drct_dlv_typ();
		}
		if ($drct_dlv_typ_nm.equalsIgnoreCase(name)) {
			return drct_dlv_typ_nm();
		}
		if ($slo_d_no.equalsIgnoreCase(name)) {
			return slo_d_no();
		}
		if ($slo_no.equalsIgnoreCase(name)) {
			return slo_no();
		}
		if ($scst_cal_cd.equalsIgnoreCase(name)) {
			return scst_cal_cd();
		}
		if ($bp_lot_no.equalsIgnoreCase(name)) {
			return bp_lot_no();
		}
		if ($bp_dlv_slip_no.equalsIgnoreCase(name)) {
			return bp_dlv_slip_no();
		}
		if ($bp_dlv_slip_d_no.equalsIgnoreCase(name)) {
			return bp_dlv_slip_d_no();
		}
		if ($org_ver_no.equalsIgnoreCase(name)) {
			return org_ver_no();
		}
		if ($cont_fctr_rnd_typ.equalsIgnoreCase(name)) {
			return cont_fctr_rnd_typ();
		}
		if ($trd_cur_cd.equalsIgnoreCase(name)) {
			return trd_cur_cd();
		}
		if ($trd_cur_nm.equalsIgnoreCase(name)) {
			return trd_cur_nm();
		}
		if ($outsrc_upri_typ.equalsIgnoreCase(name)) {
			return outsrc_upri_typ();
		}
		if ($xrate_cd.equalsIgnoreCase(name)) {
			return xrate_cd();
		}
		if ($xrate_rnd_typ.equalsIgnoreCase(name)) {
			return xrate_rnd_typ();
		}
		if ($base_cur_cd.equalsIgnoreCase(name)) {
			return base_cur_cd();
		}
		if ($base_cur_nm.equalsIgnoreCase(name)) {
			return base_cur_nm();
		}
		if ($ptax_cur_cd.equalsIgnoreCase(name)) {
			return ptax_cur_cd();
		}
		if ($ptax_cur_nm.equalsIgnoreCase(name)) {
			return ptax_cur_nm();
		}
		if ($wtax_rnd_typ.equalsIgnoreCase(name)) {
			return wtax_rnd_typ();
		}
		if ($sppl_itm_cd.equalsIgnoreCase(name)) {
			return sppl_itm_cd();
		}
		if ($sppl_itm_nm.equalsIgnoreCase(name)) {
			return sppl_itm_nm();
		}
		if ($cst_itm_cd.equalsIgnoreCase(name)) {
			return cst_itm_cd();
		}
		if ($cst_itm_nm.equalsIgnoreCase(name)) {
			return cst_itm_nm();
		}
		if ($purc_rsn_cd.equalsIgnoreCase(name)) {
			return purc_rsn_cd();
		}
		if ($purc_rsn_nm.equalsIgnoreCase(name)) {
			return purc_rsn_nm();
		}
		if ($purc_id_typ.equalsIgnoreCase(name)) {
			return purc_id_typ();
		}
		if ($purc_id_typ_nm.equalsIgnoreCase(name)) {
			return purc_id_typ_nm();
		}
		if ($stk_insp_typ.equalsIgnoreCase(name)) {
			return stk_insp_typ();
		}
		if ($stk_insp_typ_nm.equalsIgnoreCase(name)) {
			return stk_insp_typ_nm();
		}
		if ($stk_id_typ.equalsIgnoreCase(name)) {
			return stk_id_typ();
		}
		if ($stk_id_typ_nm.equalsIgnoreCase(name)) {
			return stk_id_typ_nm();
		}
		if ($ap_dpt_cd.equalsIgnoreCase(name)) {
			return ap_dpt_cd();
		}
		if ($ap_dpt_nm.equalsIgnoreCase(name)) {
			return ap_dpt_nm();
		}
		if ($mst_ap_dpt_cd.equalsIgnoreCase(name)) {
			return mst_ap_dpt_cd();
		}
		if ($purc_dpt_wg_cd.equalsIgnoreCase(name)) {
			return purc_dpt_wg_cd();
		}
		if ($purc_dpt_wg_nm.equalsIgnoreCase(name)) {
			return purc_dpt_wg_nm();
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
		if ($s_sub_char1.equalsIgnoreCase(name)) {
			return s_sub_char1();
		}
		if ($s_sub_char2.equalsIgnoreCase(name)) {
			return s_sub_char2();
		}
		if ($s_sub_char3.equalsIgnoreCase(name)) {
			return s_sub_char3();
		}
		if ($trd_rmrks.equalsIgnoreCase(name)) {
			return trd_rmrks();
		}
		if ($intr_rmrks.equalsIgnoreCase(name)) {
			return intr_rmrks();
		}
		if ($po_print_rmrks.equalsIgnoreCase(name)) {
			return po_print_rmrks();
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
		if ($tterm_cd1.equalsIgnoreCase(name)) {
			return tterm_cd1();
		}
		if ($tterm_nm1.equalsIgnoreCase(name)) {
			return tterm_nm1();
		}
		if ($tterm_rmrks1.equalsIgnoreCase(name)) {
			return tterm_rmrks1();
		}
		if ($tterm_cd2.equalsIgnoreCase(name)) {
			return tterm_cd2();
		}
		if ($tterm_nm2.equalsIgnoreCase(name)) {
			return tterm_nm2();
		}
		if ($tterm_rmrks2.equalsIgnoreCase(name)) {
			return tterm_rmrks2();
		}
		if ($tterm_cd3.equalsIgnoreCase(name)) {
			return tterm_cd3();
		}
		if ($tterm_nm3.equalsIgnoreCase(name)) {
			return tterm_nm3();
		}
		if ($tterm_rmrks3.equalsIgnoreCase(name)) {
			return tterm_rmrks3();
		}
		if ($trd_d_rmrks.equalsIgnoreCase(name)) {
			return trd_d_rmrks();
		}
		if ($intr_d_rmrks.equalsIgnoreCase(name)) {
			return intr_d_rmrks();
		}
		if ($dtl_sub_char1.equalsIgnoreCase(name)) {
			return dtl_sub_char1();
		}
		if ($dtl_sub_char2.equalsIgnoreCase(name)) {
			return dtl_sub_char2();
		}
		if ($dtl_sub_char3.equalsIgnoreCase(name)) {
			return dtl_sub_char3();
		}
		if ($po_print_d_rmrks.equalsIgnoreCase(name)) {
			return po_print_d_rmrks();
		}
		if ($edi_bp_dlv_slip_no.equalsIgnoreCase(name)) {
			return edi_bp_dlv_slip_no();
		}
		if ($edi_bp_dlv_slip_d_no.equalsIgnoreCase(name)) {
			return edi_bp_dlv_slip_d_no();
		}
		if ($ins_usr_id.equalsIgnoreCase(name)) {
			return ins_usr_id();
		}
		if ($ins_usr_nm.equalsIgnoreCase(name)) {
			return ins_usr_nm();
		}
		if ($ins_func_id.equalsIgnoreCase(name)) {
			return ins_func_id();
		}
		if ($ins_func_nm.equalsIgnoreCase(name)) {
			return ins_func_nm();
		}
		if ($upd_usr_id.equalsIgnoreCase(name)) {
			return upd_usr_id();
		}
		if ($upd_usr_nm.equalsIgnoreCase(name)) {
			return upd_usr_nm();
		}
		if ($upd_func_id.equalsIgnoreCase(name)) {
			return upd_func_id();
		}
		if ($upd_func_nm.equalsIgnoreCase(name)) {
			return upd_func_nm();
		}
		if ($upd_srv_req_no.equalsIgnoreCase(name)) {
			return upd_srv_req_no();
		}
		if ($db_trd_unit_cd.equalsIgnoreCase(name)) {
			return db_trd_unit_cd();
		}
		if ($db_trd_unit_rnd_typ.equalsIgnoreCase(name)) {
			return db_trd_unit_rnd_typ();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($purc_act_seq.equalsIgnoreCase(name)) {
			return purc_act_seq();
		}
		if ($purc_act_d_seq.equalsIgnoreCase(name)) {
			return purc_act_d_seq();
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
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			return base_unit_dec_place();
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			return peg_no();
		}
		if ($src_trd_unit_conv_qty.equalsIgnoreCase(name)) {
			return src_trd_unit_conv_qty();
		}
		if ($src_trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			return src_trd_unit_conv_base_qty();
		}
		if ($src_trd_unit_dec_place.equalsIgnoreCase(name)) {
			return src_trd_unit_dec_place();
		}
		if ($src_trd_unit_qty.equalsIgnoreCase(name)) {
			return src_trd_unit_qty();
		}
		if ($src_trd_cur_amt.equalsIgnoreCase(name)) {
			return src_trd_cur_amt();
		}
		if ($src_trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			return src_trd_cur_dscnt_amt();
		}
		if ($src_trd_cur_onr_prov_amt.equalsIgnoreCase(name)) {
			return src_trd_cur_onr_prov_amt();
		}
		if ($src_trd_cur_onr_prov_upri.equalsIgnoreCase(name)) {
			return src_trd_cur_onr_prov_upri();
		}
		if ($src_trd_cur_proc_amt.equalsIgnoreCase(name)) {
			return src_trd_cur_proc_amt();
		}
		if ($src_trd_cur_proc_upri.equalsIgnoreCase(name)) {
			return src_trd_cur_proc_upri();
		}
		if ($src_trd_cur_tax_amt.equalsIgnoreCase(name)) {
			return src_trd_cur_tax_amt();
		}
		if ($src_trd_cur_upri.equalsIgnoreCase(name)) {
			return src_trd_cur_upri();
		}
		if ($src_wtax_rate.equalsIgnoreCase(name)) {
			return src_wtax_rate();
		}
		if ($src_tax_rate.equalsIgnoreCase(name)) {
			return src_tax_rate();
		}
		if ($purc_prgrs.equalsIgnoreCase(name)) {
			return purc_prgrs();
		}
		if ($cont_fctr_dec_place.equalsIgnoreCase(name)) {
			return cont_fctr_dec_place();
		}
		if ($trd_cur_amt_dec_place.equalsIgnoreCase(name)) {
			return trd_cur_amt_dec_place();
		}
		if ($trd_cur_upri_dec_place.equalsIgnoreCase(name)) {
			return trd_cur_upri_dec_place();
		}
		if ($old_trd_cur_upri.equalsIgnoreCase(name)) {
			return old_trd_cur_upri();
		}
		if ($old_trd_cur_proc_upri.equalsIgnoreCase(name)) {
			return old_trd_cur_proc_upri();
		}
		if ($old_trd_cur_onr_prov_upri.equalsIgnoreCase(name)) {
			return old_trd_cur_onr_prov_upri();
		}
		if ($src_xrate.equalsIgnoreCase(name)) {
			return src_xrate();
		}
		if ($base_cur_amt_dec_place.equalsIgnoreCase(name)) {
			return base_cur_amt_dec_place();
		}
		if ($base_cur_upri_dec_place.equalsIgnoreCase(name)) {
			return base_cur_upri_dec_place();
		}
		if ($src_ptax_xrate.equalsIgnoreCase(name)) {
			return src_ptax_xrate();
		}
		if ($ptax_cur_amt_dec_place.equalsIgnoreCase(name)) {
			return ptax_cur_amt_dec_place();
		}
		if ($ptax_cur_upri_dec_place.equalsIgnoreCase(name)) {
			return ptax_cur_upri_dec_place();
		}
		if ($wtax_rate.equalsIgnoreCase(name)) {
			return wtax_rate();
		}
		if ($pay_crryovr_times.equalsIgnoreCase(name)) {
			return pay_crryovr_times();
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			return disp_seq();
		}
		if ($arr_pr_upd_cntr.equalsIgnoreCase(name)) {
			return arr_pr_upd_cntr();
		}
		if ($purc_act_upd_cntr.equalsIgnoreCase(name)) {
			return purc_act_upd_cntr();
		}
		if ($rcpt_iv_upd_cntr.equalsIgnoreCase(name)) {
			return rcpt_iv_upd_cntr();
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
		if ($db_trd_cur_onr_prov_amt.equalsIgnoreCase(name)) {
			return db_trd_cur_onr_prov_amt();
		}
		if ($db_trd_cur_onr_prov_upri.equalsIgnoreCase(name)) {
			return db_trd_cur_onr_prov_upri();
		}
		if ($db_trd_cur_proc_amt.equalsIgnoreCase(name)) {
			return db_trd_cur_proc_amt();
		}
		if ($db_trd_cur_proc_upri.equalsIgnoreCase(name)) {
			return db_trd_cur_proc_upri();
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
		if ($purc_act_qty.equalsIgnoreCase(name)) {
			return purc_act_qty();
		}
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		if ($purc_dt.equalsIgnoreCase(name)) {
			return purc_dt();
		}
		if ($ac_ym.equalsIgnoreCase(name)) {
			return ac_ym();
		}
		if ($pay_basis_dt.equalsIgnoreCase(name)) {
			return pay_basis_dt();
		}
		if ($pay_schd_dt.equalsIgnoreCase(name)) {
			return pay_schd_dt();
		}
		if ($purc_schd_dt.equalsIgnoreCase(name)) {
			return purc_schd_dt();
		}
		if ($dlv_rqst_dt.equalsIgnoreCase(name)) {
			return dlv_rqst_dt();
		}
		if ($arr_schd_dt.equalsIgnoreCase(name)) {
			return arr_schd_dt();
		}
		if ($re_arr_purc_schd_dt.equalsIgnoreCase(name)) {
			return re_arr_purc_schd_dt();
		}
		if ($slip_fr_valid_dt.equalsIgnoreCase(name)) {
			return slip_fr_valid_dt();
		}
		if ($ptax_dt.equalsIgnoreCase(name)) {
			return ptax_dt();
		}
		return super.getDate(name);
	}
	public MCTimestamp getTimestamp(String name) {
		if ($ins_ts.equalsIgnoreCase(name)) {
			return ins_ts();
		}
		if ($upd_ts.equalsIgnoreCase(name)) {
			return upd_ts();
		}
		return super.getTimestamp(name);
	}
	public boolean getBoolean(String name) {
		if ($check.equalsIgnoreCase(name)) {
			return check();
		}
		if ($hdr_readonly_flg.equalsIgnoreCase(name)) {
			return hdr_readonly_flg();
		}
		if ($bef_abort_flg.equalsIgnoreCase(name)) {
			return bef_abort_flg();
		}
		if ($abort_flg.equalsIgnoreCase(name)) {
			return abort_flg();
		}
		if ($sync_flg.equalsIgnoreCase(name)) {
			return sync_flg();
		}
		if ($purc_ddlv_flg.equalsIgnoreCase(name)) {
			return purc_ddlv_flg();
		}
		if ($arr_skip_flg.equalsIgnoreCase(name)) {
			return arr_skip_flg();
		}
		if ($schd_sync_flg.equalsIgnoreCase(name)) {
			return schd_sync_flg();
		}
		if ($multi_io_flg.equalsIgnoreCase(name)) {
			return multi_io_flg();
		}
		if ($arr_split_flg.equalsIgnoreCase(name)) {
			return arr_split_flg();
		}
		if ($ver_flg.equalsIgnoreCase(name)) {
			return ver_flg();
		}
		if ($sundry_itm_flg.equalsIgnoreCase(name)) {
			return sundry_itm_flg();
		}
		if ($bp_lot_flg.equalsIgnoreCase(name)) {
			return bp_lot_flg();
		}
		if ($dscnt_itm_flg.equalsIgnoreCase(name)) {
			return dscnt_itm_flg();
		}
		if ($itm_purc_upri_cng_flg.equalsIgnoreCase(name)) {
			return itm_purc_upri_cng_flg();
		}
		if ($pay_spot_flg.equalsIgnoreCase(name)) {
			return pay_spot_flg();
		}
		if ($purc_upri_cng_flg.equalsIgnoreCase(name)) {
			return purc_upri_cng_flg();
		}
		if ($sppl_iv_flg.equalsIgnoreCase(name)) {
			return sppl_iv_flg();
		}
		if ($subcon_flg.equalsIgnoreCase(name)) {
			return subcon_flg();
		}
		if ($outsrc_flg.equalsIgnoreCase(name)) {
			return outsrc_flg();
		}
		if ($accpt_dfct_flg.equalsIgnoreCase(name)) {
			return accpt_dfct_flg();
		}
		if ($src_inc_tax_flg.equalsIgnoreCase(name)) {
			return src_inc_tax_flg();
		}
		if ($re_arr_flg.equalsIgnoreCase(name)) {
			return re_arr_flg();
		}
		if ($re_arr_str_ln_tgt_flg.equalsIgnoreCase(name)) {
			return re_arr_str_ln_tgt_flg();
		}
		if ($re_arr_sync_flg.equalsIgnoreCase(name)) {
			return re_arr_sync_flg();
		}
		if ($ncv_flg.equalsIgnoreCase(name)) {
			return ncv_flg();
		}
		if ($in_to_str_ln_tgt_flg.equalsIgnoreCase(name)) {
			return in_to_str_ln_tgt_flg();
		}
		if ($cst_iv_flg.equalsIgnoreCase(name)) {
			return cst_iv_flg();
		}
		if ($cont_fctr_flg.equalsIgnoreCase(name)) {
			return cont_fctr_flg();
		}
		if ($purc_dtl_upd_flg.equalsIgnoreCase(name)) {
			return purc_dtl_upd_flg();
		}
		if ($temp_ap_flg.equalsIgnoreCase(name)) {
			return temp_ap_flg();
		}
		if ($repurc_obli_flg.equalsIgnoreCase(name)) {
			return repurc_obli_flg();
		}
		if ($old_interim_flg.equalsIgnoreCase(name)) {
			return old_interim_flg();
		}
		if ($xrate_inpt_flg.equalsIgnoreCase(name)) {
			return xrate_inpt_flg();
		}
		if ($ptax_xrate_inpt_flg.equalsIgnoreCase(name)) {
			return ptax_xrate_inpt_flg();
		}
		if ($xpns_purc_flg.equalsIgnoreCase(name)) {
			return xpns_purc_flg();
		}
		if ($ap_dpt_flg.equalsIgnoreCase(name)) {
			return ap_dpt_flg();
		}
		if ($edi_flg.equalsIgnoreCase(name)) {
			return edi_flg();
		}
		if ($db_inc_tax_flg.equalsIgnoreCase(name)) {
			return db_inc_tax_flg();
		}
		if ($sls_sync_flg.equalsIgnoreCase(name)) {
			return sls_sync_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($trd_cd.equalsIgnoreCase(name)) {
			return trd_cd();
		}
		if ($trd_nm.equalsIgnoreCase(name)) {
			return trd_nm();
		}
		if ($trd_ptn_typ.equalsIgnoreCase(name)) {
			return trd_ptn_typ();
		}
		if ($arr_ptn_typ.equalsIgnoreCase(name)) {
			return arr_ptn_typ();
		}
		if ($arr_ptn_typ_nm.equalsIgnoreCase(name)) {
			return arr_ptn_typ_nm();
		}
		if ($purc_basis_typ.equalsIgnoreCase(name)) {
			return purc_basis_typ();
		}
		if ($purc_basis_typ_nm.equalsIgnoreCase(name)) {
			return purc_basis_typ_nm();
		}
		if ($aprv_no.equalsIgnoreCase(name)) {
			return aprv_no();
		}
		if ($aprv_sts_typ.equalsIgnoreCase(name)) {
			return aprv_sts_typ();
		}
		if ($aprv_sts_typ_nm.equalsIgnoreCase(name)) {
			return aprv_sts_typ_nm();
		}
		if ($po_no.equalsIgnoreCase(name)) {
			return po_no();
		}
		if ($po_d_no.equalsIgnoreCase(name)) {
			return po_d_no();
		}
		if ($po_schd_src_typ.equalsIgnoreCase(name)) {
			return po_schd_src_typ();
		}
		if ($po_schd_src_typ_nm.equalsIgnoreCase(name)) {
			return po_schd_src_typ_nm();
		}
		if ($po_schd_src_no.equalsIgnoreCase(name)) {
			return po_schd_src_no();
		}
		if ($rcpt_iv_no.equalsIgnoreCase(name)) {
			return rcpt_iv_no();
		}
		if ($rcpt_iv_mng_no.equalsIgnoreCase(name)) {
			return rcpt_iv_mng_no();
		}
		if ($rcpt_iv_d_no.equalsIgnoreCase(name)) {
			return rcpt_iv_d_no();
		}
		if ($mfg_inst_no.equalsIgnoreCase(name)) {
			return mfg_inst_no();
		}
		if ($mfg_loc_cd.equalsIgnoreCase(name)) {
			return mfg_loc_cd();
		}
		if ($bom_ptn.equalsIgnoreCase(name)) {
			return bom_ptn();
		}
		if ($purc_schd_no.equalsIgnoreCase(name)) {
			return purc_schd_no();
		}
		if ($purc_act_no.equalsIgnoreCase(name)) {
			return purc_act_no();
		}
		if ($purc_act_d_no.equalsIgnoreCase(name)) {
			return purc_act_d_no();
		}
		if ($arr_schd_no.equalsIgnoreCase(name)) {
			return arr_schd_no();
		}
		if ($arr_pr_no.equalsIgnoreCase(name)) {
			return arr_pr_no();
		}
		if ($arr_act_no.equalsIgnoreCase(name)) {
			return arr_act_no();
		}
		if ($from_gd_cd.equalsIgnoreCase(name)) {
			return from_gd_cd();
		}
		if ($tmp_gd_cd.equalsIgnoreCase(name)) {
			return tmp_gd_cd();
		}
		if ($tmp_quality_typ.equalsIgnoreCase(name)) {
			return tmp_quality_typ();
		}
		if ($tmp_stk_insp_typ.equalsIgnoreCase(name)) {
			return tmp_stk_insp_typ();
		}
		if ($tmp_stk_id_typ.equalsIgnoreCase(name)) {
			return tmp_stk_id_typ();
		}
		if ($gi_wg_cd.equalsIgnoreCase(name)) {
			return gi_wg_cd();
		}
		if ($gi_loc_cd.equalsIgnoreCase(name)) {
			return gi_loc_cd();
		}
		if ($gi_str_ln_cd.equalsIgnoreCase(name)) {
			return gi_str_ln_cd();
		}
		if ($gi_unit_cd.equalsIgnoreCase(name)) {
			return gi_unit_cd();
		}
		if ($par_purc_act_d_no.equalsIgnoreCase(name)) {
			return par_purc_act_d_no();
		}
		if ($asset_mng_typ.equalsIgnoreCase(name)) {
			return asset_mng_typ();
		}
		if ($asset_mng_typ_nm.equalsIgnoreCase(name)) {
			return asset_mng_typ_nm();
		}
		if ($itm_typ.equalsIgnoreCase(name)) {
			return itm_typ();
		}
		if ($itm_typ_nm.equalsIgnoreCase(name)) {
			return itm_typ_nm();
		}
		if ($itm_typ_d_cd.equalsIgnoreCase(name)) {
			return itm_typ_d_cd();
		}
		if ($itm_typ_d_nm.equalsIgnoreCase(name)) {
			return itm_typ_d_nm();
		}
		if ($iv_itm_nm.equalsIgnoreCase(name)) {
			return iv_itm_nm();
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
		if ($sppl_cd.equalsIgnoreCase(name)) {
			return sppl_cd();
		}
		if ($sppl_nm.equalsIgnoreCase(name)) {
			return sppl_nm();
		}
		if ($ap_cred_cd.equalsIgnoreCase(name)) {
			return ap_cred_cd();
		}
		if ($purc_slip_each_lot_typ.equalsIgnoreCase(name)) {
			return purc_slip_each_lot_typ();
		}
		if ($prnt_lcl_cd.equalsIgnoreCase(name)) {
			return prnt_lcl_cd();
		}
		if ($purc_amt_rnd_typ.equalsIgnoreCase(name)) {
			return purc_amt_rnd_typ();
		}
		if ($purc_tax_rnd_typ.equalsIgnoreCase(name)) {
			return purc_tax_rnd_typ();
		}
		if ($purc_tax_calc_typ.equalsIgnoreCase(name)) {
			return purc_tax_calc_typ();
		}
		if ($asppl_cd.equalsIgnoreCase(name)) {
			return asppl_cd();
		}
		if ($asppl_nm.equalsIgnoreCase(name)) {
			return asppl_nm();
		}
		if ($maker_cd.equalsIgnoreCase(name)) {
			return maker_cd();
		}
		if ($maker_nm.equalsIgnoreCase(name)) {
			return maker_nm();
		}
		if ($trd_unit_cd.equalsIgnoreCase(name)) {
			return trd_unit_cd();
		}
		if ($trd_unit_nm.equalsIgnoreCase(name)) {
			return trd_unit_nm();
		}
		if ($trd_unit_rnd_typ.equalsIgnoreCase(name)) {
			return trd_unit_rnd_typ();
		}
		if ($base_unit_cd.equalsIgnoreCase(name)) {
			return base_unit_cd();
		}
		if ($base_unit_nm.equalsIgnoreCase(name)) {
			return base_unit_nm();
		}
		if ($base_unit_rnd_typ.equalsIgnoreCase(name)) {
			return base_unit_rnd_typ();
		}
		if ($src_trd_unit_cd.equalsIgnoreCase(name)) {
			return src_trd_unit_cd();
		}
		if ($src_trd_unit_rnd_typ.equalsIgnoreCase(name)) {
			return src_trd_unit_rnd_typ();
		}
		if ($re_arr_loc_wg_cd.equalsIgnoreCase(name)) {
			return re_arr_loc_wg_cd();
		}
		if ($re_arr_loc_wg_nm.equalsIgnoreCase(name)) {
			return re_arr_loc_wg_nm();
		}
		if ($re_arr_loc_cd.equalsIgnoreCase(name)) {
			return re_arr_loc_cd();
		}
		if ($re_arr_loc_nm.equalsIgnoreCase(name)) {
			return re_arr_loc_nm();
		}
		if ($re_arr_loc_site_cd.equalsIgnoreCase(name)) {
			return re_arr_loc_site_cd();
		}
		if ($re_arr_loc_cal_cd.equalsIgnoreCase(name)) {
			return re_arr_loc_cal_cd();
		}
		if ($re_arr_loc_sppl_cd.equalsIgnoreCase(name)) {
			return re_arr_loc_sppl_cd();
		}
		if ($re_arr_loc_sppl_cal_cd.equalsIgnoreCase(name)) {
			return re_arr_loc_sppl_cal_cd();
		}
		if ($quality_typ.equalsIgnoreCase(name)) {
			return quality_typ();
		}
		if ($quality_typ_nm.equalsIgnoreCase(name)) {
			return quality_typ_nm();
		}
		if ($gd_cd.equalsIgnoreCase(name)) {
			return gd_cd();
		}
		if ($gd_nm.equalsIgnoreCase(name)) {
			return gd_nm();
		}
		if ($site_cd.equalsIgnoreCase(name)) {
			return site_cd();
		}
		if ($site_nm.equalsIgnoreCase(name)) {
			return site_nm();
		}
		if ($in_to_loc_wg_cd.equalsIgnoreCase(name)) {
			return in_to_loc_wg_cd();
		}
		if ($in_to_loc_wg_nm.equalsIgnoreCase(name)) {
			return in_to_loc_wg_nm();
		}
		if ($in_to_loc_cd.equalsIgnoreCase(name)) {
			return in_to_loc_cd();
		}
		if ($in_to_loc_nm.equalsIgnoreCase(name)) {
			return in_to_loc_nm();
		}
		if ($outsrc_sppl_cd.equalsIgnoreCase(name)) {
			return outsrc_sppl_cd();
		}
		if ($drct_dlv_typ.equalsIgnoreCase(name)) {
			return drct_dlv_typ();
		}
		if ($drct_dlv_typ_nm.equalsIgnoreCase(name)) {
			return drct_dlv_typ_nm();
		}
		if ($slo_d_no.equalsIgnoreCase(name)) {
			return slo_d_no();
		}
		if ($slo_no.equalsIgnoreCase(name)) {
			return slo_no();
		}
		if ($scst_cal_cd.equalsIgnoreCase(name)) {
			return scst_cal_cd();
		}
		if ($bp_lot_no.equalsIgnoreCase(name)) {
			return bp_lot_no();
		}
		if ($bp_dlv_slip_no.equalsIgnoreCase(name)) {
			return bp_dlv_slip_no();
		}
		if ($bp_dlv_slip_d_no.equalsIgnoreCase(name)) {
			return bp_dlv_slip_d_no();
		}
		if ($org_ver_no.equalsIgnoreCase(name)) {
			return org_ver_no();
		}
		if ($cont_fctr_rnd_typ.equalsIgnoreCase(name)) {
			return cont_fctr_rnd_typ();
		}
		if ($trd_cur_cd.equalsIgnoreCase(name)) {
			return trd_cur_cd();
		}
		if ($trd_cur_nm.equalsIgnoreCase(name)) {
			return trd_cur_nm();
		}
		if ($outsrc_upri_typ.equalsIgnoreCase(name)) {
			return outsrc_upri_typ();
		}
		if ($xrate_cd.equalsIgnoreCase(name)) {
			return xrate_cd();
		}
		if ($xrate_rnd_typ.equalsIgnoreCase(name)) {
			return xrate_rnd_typ();
		}
		if ($base_cur_cd.equalsIgnoreCase(name)) {
			return base_cur_cd();
		}
		if ($base_cur_nm.equalsIgnoreCase(name)) {
			return base_cur_nm();
		}
		if ($ptax_cur_cd.equalsIgnoreCase(name)) {
			return ptax_cur_cd();
		}
		if ($ptax_cur_nm.equalsIgnoreCase(name)) {
			return ptax_cur_nm();
		}
		if ($wtax_rnd_typ.equalsIgnoreCase(name)) {
			return wtax_rnd_typ();
		}
		if ($sppl_itm_cd.equalsIgnoreCase(name)) {
			return sppl_itm_cd();
		}
		if ($sppl_itm_nm.equalsIgnoreCase(name)) {
			return sppl_itm_nm();
		}
		if ($cst_itm_cd.equalsIgnoreCase(name)) {
			return cst_itm_cd();
		}
		if ($cst_itm_nm.equalsIgnoreCase(name)) {
			return cst_itm_nm();
		}
		if ($purc_rsn_cd.equalsIgnoreCase(name)) {
			return purc_rsn_cd();
		}
		if ($purc_rsn_nm.equalsIgnoreCase(name)) {
			return purc_rsn_nm();
		}
		if ($purc_id_typ.equalsIgnoreCase(name)) {
			return purc_id_typ();
		}
		if ($purc_id_typ_nm.equalsIgnoreCase(name)) {
			return purc_id_typ_nm();
		}
		if ($stk_insp_typ.equalsIgnoreCase(name)) {
			return stk_insp_typ();
		}
		if ($stk_insp_typ_nm.equalsIgnoreCase(name)) {
			return stk_insp_typ_nm();
		}
		if ($stk_id_typ.equalsIgnoreCase(name)) {
			return stk_id_typ();
		}
		if ($stk_id_typ_nm.equalsIgnoreCase(name)) {
			return stk_id_typ_nm();
		}
		if ($ap_dpt_cd.equalsIgnoreCase(name)) {
			return ap_dpt_cd();
		}
		if ($ap_dpt_nm.equalsIgnoreCase(name)) {
			return ap_dpt_nm();
		}
		if ($mst_ap_dpt_cd.equalsIgnoreCase(name)) {
			return mst_ap_dpt_cd();
		}
		if ($purc_dpt_wg_cd.equalsIgnoreCase(name)) {
			return purc_dpt_wg_cd();
		}
		if ($purc_dpt_wg_nm.equalsIgnoreCase(name)) {
			return purc_dpt_wg_nm();
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
		if ($s_sub_char1.equalsIgnoreCase(name)) {
			return s_sub_char1();
		}
		if ($s_sub_char2.equalsIgnoreCase(name)) {
			return s_sub_char2();
		}
		if ($s_sub_char3.equalsIgnoreCase(name)) {
			return s_sub_char3();
		}
		if ($trd_rmrks.equalsIgnoreCase(name)) {
			return trd_rmrks();
		}
		if ($intr_rmrks.equalsIgnoreCase(name)) {
			return intr_rmrks();
		}
		if ($po_print_rmrks.equalsIgnoreCase(name)) {
			return po_print_rmrks();
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
		if ($tterm_cd1.equalsIgnoreCase(name)) {
			return tterm_cd1();
		}
		if ($tterm_nm1.equalsIgnoreCase(name)) {
			return tterm_nm1();
		}
		if ($tterm_rmrks1.equalsIgnoreCase(name)) {
			return tterm_rmrks1();
		}
		if ($tterm_cd2.equalsIgnoreCase(name)) {
			return tterm_cd2();
		}
		if ($tterm_nm2.equalsIgnoreCase(name)) {
			return tterm_nm2();
		}
		if ($tterm_rmrks2.equalsIgnoreCase(name)) {
			return tterm_rmrks2();
		}
		if ($tterm_cd3.equalsIgnoreCase(name)) {
			return tterm_cd3();
		}
		if ($tterm_nm3.equalsIgnoreCase(name)) {
			return tterm_nm3();
		}
		if ($tterm_rmrks3.equalsIgnoreCase(name)) {
			return tterm_rmrks3();
		}
		if ($trd_d_rmrks.equalsIgnoreCase(name)) {
			return trd_d_rmrks();
		}
		if ($intr_d_rmrks.equalsIgnoreCase(name)) {
			return intr_d_rmrks();
		}
		if ($dtl_sub_char1.equalsIgnoreCase(name)) {
			return dtl_sub_char1();
		}
		if ($dtl_sub_char2.equalsIgnoreCase(name)) {
			return dtl_sub_char2();
		}
		if ($dtl_sub_char3.equalsIgnoreCase(name)) {
			return dtl_sub_char3();
		}
		if ($po_print_d_rmrks.equalsIgnoreCase(name)) {
			return po_print_d_rmrks();
		}
		if ($edi_bp_dlv_slip_no.equalsIgnoreCase(name)) {
			return edi_bp_dlv_slip_no();
		}
		if ($edi_bp_dlv_slip_d_no.equalsIgnoreCase(name)) {
			return edi_bp_dlv_slip_d_no();
		}
		if ($ins_usr_id.equalsIgnoreCase(name)) {
			return ins_usr_id();
		}
		if ($ins_usr_nm.equalsIgnoreCase(name)) {
			return ins_usr_nm();
		}
		if ($ins_func_id.equalsIgnoreCase(name)) {
			return ins_func_id();
		}
		if ($ins_func_nm.equalsIgnoreCase(name)) {
			return ins_func_nm();
		}
		if ($upd_usr_id.equalsIgnoreCase(name)) {
			return upd_usr_id();
		}
		if ($upd_usr_nm.equalsIgnoreCase(name)) {
			return upd_usr_nm();
		}
		if ($upd_func_id.equalsIgnoreCase(name)) {
			return upd_func_id();
		}
		if ($upd_func_nm.equalsIgnoreCase(name)) {
			return upd_func_nm();
		}
		if ($upd_srv_req_no.equalsIgnoreCase(name)) {
			return upd_srv_req_no();
		}
		if ($db_trd_unit_cd.equalsIgnoreCase(name)) {
			return db_trd_unit_cd();
		}
		if ($db_trd_unit_rnd_typ.equalsIgnoreCase(name)) {
			return db_trd_unit_rnd_typ();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($purc_act_seq.equalsIgnoreCase(name)) {
			return purc_act_seq();
		}
		if ($purc_act_d_seq.equalsIgnoreCase(name)) {
			return purc_act_d_seq();
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
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			return base_unit_dec_place();
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			return peg_no();
		}
		if ($src_trd_unit_conv_qty.equalsIgnoreCase(name)) {
			return src_trd_unit_conv_qty();
		}
		if ($src_trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			return src_trd_unit_conv_base_qty();
		}
		if ($src_trd_unit_dec_place.equalsIgnoreCase(name)) {
			return src_trd_unit_dec_place();
		}
		if ($src_trd_unit_qty.equalsIgnoreCase(name)) {
			return src_trd_unit_qty();
		}
		if ($src_trd_cur_amt.equalsIgnoreCase(name)) {
			return src_trd_cur_amt();
		}
		if ($src_trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			return src_trd_cur_dscnt_amt();
		}
		if ($src_trd_cur_onr_prov_amt.equalsIgnoreCase(name)) {
			return src_trd_cur_onr_prov_amt();
		}
		if ($src_trd_cur_onr_prov_upri.equalsIgnoreCase(name)) {
			return src_trd_cur_onr_prov_upri();
		}
		if ($src_trd_cur_proc_amt.equalsIgnoreCase(name)) {
			return src_trd_cur_proc_amt();
		}
		if ($src_trd_cur_proc_upri.equalsIgnoreCase(name)) {
			return src_trd_cur_proc_upri();
		}
		if ($src_trd_cur_tax_amt.equalsIgnoreCase(name)) {
			return src_trd_cur_tax_amt();
		}
		if ($src_trd_cur_upri.equalsIgnoreCase(name)) {
			return src_trd_cur_upri();
		}
		if ($src_wtax_rate.equalsIgnoreCase(name)) {
			return src_wtax_rate();
		}
		if ($src_tax_rate.equalsIgnoreCase(name)) {
			return src_tax_rate();
		}
		if ($purc_prgrs.equalsIgnoreCase(name)) {
			return purc_prgrs();
		}
		if ($cont_fctr_dec_place.equalsIgnoreCase(name)) {
			return cont_fctr_dec_place();
		}
		if ($trd_cur_amt_dec_place.equalsIgnoreCase(name)) {
			return trd_cur_amt_dec_place();
		}
		if ($trd_cur_upri_dec_place.equalsIgnoreCase(name)) {
			return trd_cur_upri_dec_place();
		}
		if ($old_trd_cur_upri.equalsIgnoreCase(name)) {
			return old_trd_cur_upri();
		}
		if ($old_trd_cur_proc_upri.equalsIgnoreCase(name)) {
			return old_trd_cur_proc_upri();
		}
		if ($old_trd_cur_onr_prov_upri.equalsIgnoreCase(name)) {
			return old_trd_cur_onr_prov_upri();
		}
		if ($src_xrate.equalsIgnoreCase(name)) {
			return src_xrate();
		}
		if ($base_cur_amt_dec_place.equalsIgnoreCase(name)) {
			return base_cur_amt_dec_place();
		}
		if ($base_cur_upri_dec_place.equalsIgnoreCase(name)) {
			return base_cur_upri_dec_place();
		}
		if ($src_ptax_xrate.equalsIgnoreCase(name)) {
			return src_ptax_xrate();
		}
		if ($ptax_cur_amt_dec_place.equalsIgnoreCase(name)) {
			return ptax_cur_amt_dec_place();
		}
		if ($ptax_cur_upri_dec_place.equalsIgnoreCase(name)) {
			return ptax_cur_upri_dec_place();
		}
		if ($wtax_rate.equalsIgnoreCase(name)) {
			return wtax_rate();
		}
		if ($pay_crryovr_times.equalsIgnoreCase(name)) {
			return pay_crryovr_times();
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			return disp_seq();
		}
		if ($arr_pr_upd_cntr.equalsIgnoreCase(name)) {
			return arr_pr_upd_cntr();
		}
		if ($purc_act_upd_cntr.equalsIgnoreCase(name)) {
			return purc_act_upd_cntr();
		}
		if ($rcpt_iv_upd_cntr.equalsIgnoreCase(name)) {
			return rcpt_iv_upd_cntr();
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
		if ($db_trd_cur_onr_prov_amt.equalsIgnoreCase(name)) {
			return db_trd_cur_onr_prov_amt();
		}
		if ($db_trd_cur_onr_prov_upri.equalsIgnoreCase(name)) {
			return db_trd_cur_onr_prov_upri();
		}
		if ($db_trd_cur_proc_amt.equalsIgnoreCase(name)) {
			return db_trd_cur_proc_amt();
		}
		if ($db_trd_cur_proc_upri.equalsIgnoreCase(name)) {
			return db_trd_cur_proc_upri();
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
		if ($purc_act_qty.equalsIgnoreCase(name)) {
			return purc_act_qty();
		}
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($purc_dt.equalsIgnoreCase(name)) {
			return purc_dt();
		}
		if ($ac_ym.equalsIgnoreCase(name)) {
			return ac_ym();
		}
		if ($pay_basis_dt.equalsIgnoreCase(name)) {
			return pay_basis_dt();
		}
		if ($pay_schd_dt.equalsIgnoreCase(name)) {
			return pay_schd_dt();
		}
		if ($purc_schd_dt.equalsIgnoreCase(name)) {
			return purc_schd_dt();
		}
		if ($dlv_rqst_dt.equalsIgnoreCase(name)) {
			return dlv_rqst_dt();
		}
		if ($arr_schd_dt.equalsIgnoreCase(name)) {
			return arr_schd_dt();
		}
		if ($re_arr_purc_schd_dt.equalsIgnoreCase(name)) {
			return re_arr_purc_schd_dt();
		}
		if ($slip_fr_valid_dt.equalsIgnoreCase(name)) {
			return slip_fr_valid_dt();
		}
		if ($ptax_dt.equalsIgnoreCase(name)) {
			return ptax_dt();
		}
		return super.getDateNE(name);
	}
	public MCTimestamp getTimestampNE(String name) {
		if ($ins_ts.equalsIgnoreCase(name)) {
			return ins_ts();
		}
		if ($upd_ts.equalsIgnoreCase(name)) {
			return upd_ts();
		}
		return super.getTimestampNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($check.equalsIgnoreCase(name)) {
			return check();
		}
		if ($hdr_readonly_flg.equalsIgnoreCase(name)) {
			return hdr_readonly_flg();
		}
		if ($bef_abort_flg.equalsIgnoreCase(name)) {
			return bef_abort_flg();
		}
		if ($abort_flg.equalsIgnoreCase(name)) {
			return abort_flg();
		}
		if ($sync_flg.equalsIgnoreCase(name)) {
			return sync_flg();
		}
		if ($purc_ddlv_flg.equalsIgnoreCase(name)) {
			return purc_ddlv_flg();
		}
		if ($arr_skip_flg.equalsIgnoreCase(name)) {
			return arr_skip_flg();
		}
		if ($schd_sync_flg.equalsIgnoreCase(name)) {
			return schd_sync_flg();
		}
		if ($multi_io_flg.equalsIgnoreCase(name)) {
			return multi_io_flg();
		}
		if ($arr_split_flg.equalsIgnoreCase(name)) {
			return arr_split_flg();
		}
		if ($ver_flg.equalsIgnoreCase(name)) {
			return ver_flg();
		}
		if ($sundry_itm_flg.equalsIgnoreCase(name)) {
			return sundry_itm_flg();
		}
		if ($bp_lot_flg.equalsIgnoreCase(name)) {
			return bp_lot_flg();
		}
		if ($dscnt_itm_flg.equalsIgnoreCase(name)) {
			return dscnt_itm_flg();
		}
		if ($itm_purc_upri_cng_flg.equalsIgnoreCase(name)) {
			return itm_purc_upri_cng_flg();
		}
		if ($pay_spot_flg.equalsIgnoreCase(name)) {
			return pay_spot_flg();
		}
		if ($purc_upri_cng_flg.equalsIgnoreCase(name)) {
			return purc_upri_cng_flg();
		}
		if ($sppl_iv_flg.equalsIgnoreCase(name)) {
			return sppl_iv_flg();
		}
		if ($subcon_flg.equalsIgnoreCase(name)) {
			return subcon_flg();
		}
		if ($outsrc_flg.equalsIgnoreCase(name)) {
			return outsrc_flg();
		}
		if ($accpt_dfct_flg.equalsIgnoreCase(name)) {
			return accpt_dfct_flg();
		}
		if ($src_inc_tax_flg.equalsIgnoreCase(name)) {
			return src_inc_tax_flg();
		}
		if ($re_arr_flg.equalsIgnoreCase(name)) {
			return re_arr_flg();
		}
		if ($re_arr_str_ln_tgt_flg.equalsIgnoreCase(name)) {
			return re_arr_str_ln_tgt_flg();
		}
		if ($re_arr_sync_flg.equalsIgnoreCase(name)) {
			return re_arr_sync_flg();
		}
		if ($ncv_flg.equalsIgnoreCase(name)) {
			return ncv_flg();
		}
		if ($in_to_str_ln_tgt_flg.equalsIgnoreCase(name)) {
			return in_to_str_ln_tgt_flg();
		}
		if ($cst_iv_flg.equalsIgnoreCase(name)) {
			return cst_iv_flg();
		}
		if ($cont_fctr_flg.equalsIgnoreCase(name)) {
			return cont_fctr_flg();
		}
		if ($purc_dtl_upd_flg.equalsIgnoreCase(name)) {
			return purc_dtl_upd_flg();
		}
		if ($temp_ap_flg.equalsIgnoreCase(name)) {
			return temp_ap_flg();
		}
		if ($repurc_obli_flg.equalsIgnoreCase(name)) {
			return repurc_obli_flg();
		}
		if ($old_interim_flg.equalsIgnoreCase(name)) {
			return old_interim_flg();
		}
		if ($xrate_inpt_flg.equalsIgnoreCase(name)) {
			return xrate_inpt_flg();
		}
		if ($ptax_xrate_inpt_flg.equalsIgnoreCase(name)) {
			return ptax_xrate_inpt_flg();
		}
		if ($xpns_purc_flg.equalsIgnoreCase(name)) {
			return xpns_purc_flg();
		}
		if ($ap_dpt_flg.equalsIgnoreCase(name)) {
			return ap_dpt_flg();
		}
		if ($edi_flg.equalsIgnoreCase(name)) {
			return edi_flg();
		}
		if ($db_inc_tax_flg.equalsIgnoreCase(name)) {
			return db_inc_tax_flg();
		}
		if ($sls_sync_flg.equalsIgnoreCase(name)) {
			return sls_sync_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
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
		if ($arr_ptn_typ.equalsIgnoreCase(name)) {
			arr_ptn_typ(value);
			return;
		}
		if ($arr_ptn_typ_nm.equalsIgnoreCase(name)) {
			arr_ptn_typ_nm(value);
			return;
		}
		if ($purc_basis_typ.equalsIgnoreCase(name)) {
			purc_basis_typ(value);
			return;
		}
		if ($purc_basis_typ_nm.equalsIgnoreCase(name)) {
			purc_basis_typ_nm(value);
			return;
		}
		if ($aprv_no.equalsIgnoreCase(name)) {
			aprv_no(value);
			return;
		}
		if ($aprv_sts_typ.equalsIgnoreCase(name)) {
			aprv_sts_typ(value);
			return;
		}
		if ($aprv_sts_typ_nm.equalsIgnoreCase(name)) {
			aprv_sts_typ_nm(value);
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
		if ($po_schd_src_typ.equalsIgnoreCase(name)) {
			po_schd_src_typ(value);
			return;
		}
		if ($po_schd_src_typ_nm.equalsIgnoreCase(name)) {
			po_schd_src_typ_nm(value);
			return;
		}
		if ($po_schd_src_no.equalsIgnoreCase(name)) {
			po_schd_src_no(value);
			return;
		}
		if ($rcpt_iv_no.equalsIgnoreCase(name)) {
			rcpt_iv_no(value);
			return;
		}
		if ($rcpt_iv_mng_no.equalsIgnoreCase(name)) {
			rcpt_iv_mng_no(value);
			return;
		}
		if ($rcpt_iv_d_no.equalsIgnoreCase(name)) {
			rcpt_iv_d_no(value);
			return;
		}
		if ($mfg_inst_no.equalsIgnoreCase(name)) {
			mfg_inst_no(value);
			return;
		}
		if ($mfg_loc_cd.equalsIgnoreCase(name)) {
			mfg_loc_cd(value);
			return;
		}
		if ($bom_ptn.equalsIgnoreCase(name)) {
			bom_ptn(value);
			return;
		}
		if ($purc_schd_no.equalsIgnoreCase(name)) {
			purc_schd_no(value);
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
		if ($arr_schd_no.equalsIgnoreCase(name)) {
			arr_schd_no(value);
			return;
		}
		if ($arr_pr_no.equalsIgnoreCase(name)) {
			arr_pr_no(value);
			return;
		}
		if ($arr_act_no.equalsIgnoreCase(name)) {
			arr_act_no(value);
			return;
		}
		if ($from_gd_cd.equalsIgnoreCase(name)) {
			from_gd_cd(value);
			return;
		}
		if ($tmp_gd_cd.equalsIgnoreCase(name)) {
			tmp_gd_cd(value);
			return;
		}
		if ($tmp_quality_typ.equalsIgnoreCase(name)) {
			tmp_quality_typ(value);
			return;
		}
		if ($tmp_stk_insp_typ.equalsIgnoreCase(name)) {
			tmp_stk_insp_typ(value);
			return;
		}
		if ($tmp_stk_id_typ.equalsIgnoreCase(name)) {
			tmp_stk_id_typ(value);
			return;
		}
		if ($gi_wg_cd.equalsIgnoreCase(name)) {
			gi_wg_cd(value);
			return;
		}
		if ($gi_loc_cd.equalsIgnoreCase(name)) {
			gi_loc_cd(value);
			return;
		}
		if ($gi_str_ln_cd.equalsIgnoreCase(name)) {
			gi_str_ln_cd(value);
			return;
		}
		if ($gi_unit_cd.equalsIgnoreCase(name)) {
			gi_unit_cd(value);
			return;
		}
		if ($par_purc_act_d_no.equalsIgnoreCase(name)) {
			par_purc_act_d_no(value);
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
		if ($itm_typ.equalsIgnoreCase(name)) {
			itm_typ(value);
			return;
		}
		if ($itm_typ_nm.equalsIgnoreCase(name)) {
			itm_typ_nm(value);
			return;
		}
		if ($itm_typ_d_cd.equalsIgnoreCase(name)) {
			itm_typ_d_cd(value);
			return;
		}
		if ($itm_typ_d_nm.equalsIgnoreCase(name)) {
			itm_typ_d_nm(value);
			return;
		}
		if ($iv_itm_nm.equalsIgnoreCase(name)) {
			iv_itm_nm(value);
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
		if ($sppl_cd.equalsIgnoreCase(name)) {
			sppl_cd(value);
			return;
		}
		if ($sppl_nm.equalsIgnoreCase(name)) {
			sppl_nm(value);
			return;
		}
		if ($ap_cred_cd.equalsIgnoreCase(name)) {
			ap_cred_cd(value);
			return;
		}
		if ($purc_slip_each_lot_typ.equalsIgnoreCase(name)) {
			purc_slip_each_lot_typ(value);
			return;
		}
		if ($prnt_lcl_cd.equalsIgnoreCase(name)) {
			prnt_lcl_cd(value);
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
		if ($purc_tax_calc_typ.equalsIgnoreCase(name)) {
			purc_tax_calc_typ(value);
			return;
		}
		if ($asppl_cd.equalsIgnoreCase(name)) {
			asppl_cd(value);
			return;
		}
		if ($asppl_nm.equalsIgnoreCase(name)) {
			asppl_nm(value);
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
		if ($trd_unit_cd.equalsIgnoreCase(name)) {
			trd_unit_cd(value);
			return;
		}
		if ($trd_unit_nm.equalsIgnoreCase(name)) {
			trd_unit_nm(value);
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
		if ($base_unit_nm.equalsIgnoreCase(name)) {
			base_unit_nm(value);
			return;
		}
		if ($base_unit_rnd_typ.equalsIgnoreCase(name)) {
			base_unit_rnd_typ(value);
			return;
		}
		if ($src_trd_unit_cd.equalsIgnoreCase(name)) {
			src_trd_unit_cd(value);
			return;
		}
		if ($src_trd_unit_rnd_typ.equalsIgnoreCase(name)) {
			src_trd_unit_rnd_typ(value);
			return;
		}
		if ($re_arr_loc_wg_cd.equalsIgnoreCase(name)) {
			re_arr_loc_wg_cd(value);
			return;
		}
		if ($re_arr_loc_wg_nm.equalsIgnoreCase(name)) {
			re_arr_loc_wg_nm(value);
			return;
		}
		if ($re_arr_loc_cd.equalsIgnoreCase(name)) {
			re_arr_loc_cd(value);
			return;
		}
		if ($re_arr_loc_nm.equalsIgnoreCase(name)) {
			re_arr_loc_nm(value);
			return;
		}
		if ($re_arr_loc_site_cd.equalsIgnoreCase(name)) {
			re_arr_loc_site_cd(value);
			return;
		}
		if ($re_arr_loc_cal_cd.equalsIgnoreCase(name)) {
			re_arr_loc_cal_cd(value);
			return;
		}
		if ($re_arr_loc_sppl_cd.equalsIgnoreCase(name)) {
			re_arr_loc_sppl_cd(value);
			return;
		}
		if ($re_arr_loc_sppl_cal_cd.equalsIgnoreCase(name)) {
			re_arr_loc_sppl_cal_cd(value);
			return;
		}
		if ($quality_typ.equalsIgnoreCase(name)) {
			quality_typ(value);
			return;
		}
		if ($quality_typ_nm.equalsIgnoreCase(name)) {
			quality_typ_nm(value);
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
		if ($site_cd.equalsIgnoreCase(name)) {
			site_cd(value);
			return;
		}
		if ($site_nm.equalsIgnoreCase(name)) {
			site_nm(value);
			return;
		}
		if ($in_to_loc_wg_cd.equalsIgnoreCase(name)) {
			in_to_loc_wg_cd(value);
			return;
		}
		if ($in_to_loc_wg_nm.equalsIgnoreCase(name)) {
			in_to_loc_wg_nm(value);
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
		if ($outsrc_sppl_cd.equalsIgnoreCase(name)) {
			outsrc_sppl_cd(value);
			return;
		}
		if ($drct_dlv_typ.equalsIgnoreCase(name)) {
			drct_dlv_typ(value);
			return;
		}
		if ($drct_dlv_typ_nm.equalsIgnoreCase(name)) {
			drct_dlv_typ_nm(value);
			return;
		}
		if ($slo_d_no.equalsIgnoreCase(name)) {
			slo_d_no(value);
			return;
		}
		if ($slo_no.equalsIgnoreCase(name)) {
			slo_no(value);
			return;
		}
		if ($scst_cal_cd.equalsIgnoreCase(name)) {
			scst_cal_cd(value);
			return;
		}
		if ($bp_lot_no.equalsIgnoreCase(name)) {
			bp_lot_no(value);
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
		if ($org_ver_no.equalsIgnoreCase(name)) {
			org_ver_no(value);
			return;
		}
		if ($cont_fctr_rnd_typ.equalsIgnoreCase(name)) {
			cont_fctr_rnd_typ(value);
			return;
		}
		if ($trd_cur_cd.equalsIgnoreCase(name)) {
			trd_cur_cd(value);
			return;
		}
		if ($trd_cur_nm.equalsIgnoreCase(name)) {
			trd_cur_nm(value);
			return;
		}
		if ($outsrc_upri_typ.equalsIgnoreCase(name)) {
			outsrc_upri_typ(value);
			return;
		}
		if ($xrate_cd.equalsIgnoreCase(name)) {
			xrate_cd(value);
			return;
		}
		if ($xrate_rnd_typ.equalsIgnoreCase(name)) {
			xrate_rnd_typ(value);
			return;
		}
		if ($base_cur_cd.equalsIgnoreCase(name)) {
			base_cur_cd(value);
			return;
		}
		if ($base_cur_nm.equalsIgnoreCase(name)) {
			base_cur_nm(value);
			return;
		}
		if ($ptax_cur_cd.equalsIgnoreCase(name)) {
			ptax_cur_cd(value);
			return;
		}
		if ($ptax_cur_nm.equalsIgnoreCase(name)) {
			ptax_cur_nm(value);
			return;
		}
		if ($wtax_rnd_typ.equalsIgnoreCase(name)) {
			wtax_rnd_typ(value);
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
		if ($cst_itm_cd.equalsIgnoreCase(name)) {
			cst_itm_cd(value);
			return;
		}
		if ($cst_itm_nm.equalsIgnoreCase(name)) {
			cst_itm_nm(value);
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
		if ($purc_id_typ.equalsIgnoreCase(name)) {
			purc_id_typ(value);
			return;
		}
		if ($purc_id_typ_nm.equalsIgnoreCase(name)) {
			purc_id_typ_nm(value);
			return;
		}
		if ($stk_insp_typ.equalsIgnoreCase(name)) {
			stk_insp_typ(value);
			return;
		}
		if ($stk_insp_typ_nm.equalsIgnoreCase(name)) {
			stk_insp_typ_nm(value);
			return;
		}
		if ($stk_id_typ.equalsIgnoreCase(name)) {
			stk_id_typ(value);
			return;
		}
		if ($stk_id_typ_nm.equalsIgnoreCase(name)) {
			stk_id_typ_nm(value);
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
		if ($mst_ap_dpt_cd.equalsIgnoreCase(name)) {
			mst_ap_dpt_cd(value);
			return;
		}
		if ($purc_dpt_wg_cd.equalsIgnoreCase(name)) {
			purc_dpt_wg_cd(value);
			return;
		}
		if ($purc_dpt_wg_nm.equalsIgnoreCase(name)) {
			purc_dpt_wg_nm(value);
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
		if ($s_sub_char1.equalsIgnoreCase(name)) {
			s_sub_char1(value);
			return;
		}
		if ($s_sub_char2.equalsIgnoreCase(name)) {
			s_sub_char2(value);
			return;
		}
		if ($s_sub_char3.equalsIgnoreCase(name)) {
			s_sub_char3(value);
			return;
		}
		if ($trd_rmrks.equalsIgnoreCase(name)) {
			trd_rmrks(value);
			return;
		}
		if ($intr_rmrks.equalsIgnoreCase(name)) {
			intr_rmrks(value);
			return;
		}
		if ($po_print_rmrks.equalsIgnoreCase(name)) {
			po_print_rmrks(value);
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
		if ($tterm_cd1.equalsIgnoreCase(name)) {
			tterm_cd1(value);
			return;
		}
		if ($tterm_nm1.equalsIgnoreCase(name)) {
			tterm_nm1(value);
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
		if ($tterm_nm2.equalsIgnoreCase(name)) {
			tterm_nm2(value);
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
		if ($tterm_nm3.equalsIgnoreCase(name)) {
			tterm_nm3(value);
			return;
		}
		if ($tterm_rmrks3.equalsIgnoreCase(name)) {
			tterm_rmrks3(value);
			return;
		}
		if ($trd_d_rmrks.equalsIgnoreCase(name)) {
			trd_d_rmrks(value);
			return;
		}
		if ($intr_d_rmrks.equalsIgnoreCase(name)) {
			intr_d_rmrks(value);
			return;
		}
		if ($dtl_sub_char1.equalsIgnoreCase(name)) {
			dtl_sub_char1(value);
			return;
		}
		if ($dtl_sub_char2.equalsIgnoreCase(name)) {
			dtl_sub_char2(value);
			return;
		}
		if ($dtl_sub_char3.equalsIgnoreCase(name)) {
			dtl_sub_char3(value);
			return;
		}
		if ($po_print_d_rmrks.equalsIgnoreCase(name)) {
			po_print_d_rmrks(value);
			return;
		}
		if ($edi_bp_dlv_slip_no.equalsIgnoreCase(name)) {
			edi_bp_dlv_slip_no(value);
			return;
		}
		if ($edi_bp_dlv_slip_d_no.equalsIgnoreCase(name)) {
			edi_bp_dlv_slip_d_no(value);
			return;
		}
		if ($ins_usr_id.equalsIgnoreCase(name)) {
			ins_usr_id(value);
			return;
		}
		if ($ins_usr_nm.equalsIgnoreCase(name)) {
			ins_usr_nm(value);
			return;
		}
		if ($ins_func_id.equalsIgnoreCase(name)) {
			ins_func_id(value);
			return;
		}
		if ($ins_func_nm.equalsIgnoreCase(name)) {
			ins_func_nm(value);
			return;
		}
		if ($upd_usr_id.equalsIgnoreCase(name)) {
			upd_usr_id(value);
			return;
		}
		if ($upd_usr_nm.equalsIgnoreCase(name)) {
			upd_usr_nm(value);
			return;
		}
		if ($upd_func_id.equalsIgnoreCase(name)) {
			upd_func_id(value);
			return;
		}
		if ($upd_func_nm.equalsIgnoreCase(name)) {
			upd_func_nm(value);
			return;
		}
		if ($upd_srv_req_no.equalsIgnoreCase(name)) {
			upd_srv_req_no(value);
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
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($purc_act_seq.equalsIgnoreCase(name)) {
			purc_act_seq(value);
			return;
		}
		if ($purc_act_d_seq.equalsIgnoreCase(name)) {
			purc_act_d_seq(value);
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
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($src_trd_unit_conv_qty.equalsIgnoreCase(name)) {
			src_trd_unit_conv_qty(value);
			return;
		}
		if ($src_trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			src_trd_unit_conv_base_qty(value);
			return;
		}
		if ($src_trd_unit_dec_place.equalsIgnoreCase(name)) {
			src_trd_unit_dec_place(value);
			return;
		}
		if ($src_trd_unit_qty.equalsIgnoreCase(name)) {
			src_trd_unit_qty(value);
			return;
		}
		if ($src_trd_cur_amt.equalsIgnoreCase(name)) {
			src_trd_cur_amt(value);
			return;
		}
		if ($src_trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			src_trd_cur_dscnt_amt(value);
			return;
		}
		if ($src_trd_cur_onr_prov_amt.equalsIgnoreCase(name)) {
			src_trd_cur_onr_prov_amt(value);
			return;
		}
		if ($src_trd_cur_onr_prov_upri.equalsIgnoreCase(name)) {
			src_trd_cur_onr_prov_upri(value);
			return;
		}
		if ($src_trd_cur_proc_amt.equalsIgnoreCase(name)) {
			src_trd_cur_proc_amt(value);
			return;
		}
		if ($src_trd_cur_proc_upri.equalsIgnoreCase(name)) {
			src_trd_cur_proc_upri(value);
			return;
		}
		if ($src_trd_cur_tax_amt.equalsIgnoreCase(name)) {
			src_trd_cur_tax_amt(value);
			return;
		}
		if ($src_trd_cur_upri.equalsIgnoreCase(name)) {
			src_trd_cur_upri(value);
			return;
		}
		if ($src_wtax_rate.equalsIgnoreCase(name)) {
			src_wtax_rate(value);
			return;
		}
		if ($src_tax_rate.equalsIgnoreCase(name)) {
			src_tax_rate(value);
			return;
		}
		if ($purc_prgrs.equalsIgnoreCase(name)) {
			purc_prgrs(value);
			return;
		}
		if ($cont_fctr_dec_place.equalsIgnoreCase(name)) {
			cont_fctr_dec_place(value);
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
		if ($old_trd_cur_upri.equalsIgnoreCase(name)) {
			old_trd_cur_upri(value);
			return;
		}
		if ($old_trd_cur_proc_upri.equalsIgnoreCase(name)) {
			old_trd_cur_proc_upri(value);
			return;
		}
		if ($old_trd_cur_onr_prov_upri.equalsIgnoreCase(name)) {
			old_trd_cur_onr_prov_upri(value);
			return;
		}
		if ($src_xrate.equalsIgnoreCase(name)) {
			src_xrate(value);
			return;
		}
		if ($base_cur_amt_dec_place.equalsIgnoreCase(name)) {
			base_cur_amt_dec_place(value);
			return;
		}
		if ($base_cur_upri_dec_place.equalsIgnoreCase(name)) {
			base_cur_upri_dec_place(value);
			return;
		}
		if ($src_ptax_xrate.equalsIgnoreCase(name)) {
			src_ptax_xrate(value);
			return;
		}
		if ($ptax_cur_amt_dec_place.equalsIgnoreCase(name)) {
			ptax_cur_amt_dec_place(value);
			return;
		}
		if ($ptax_cur_upri_dec_place.equalsIgnoreCase(name)) {
			ptax_cur_upri_dec_place(value);
			return;
		}
		if ($wtax_rate.equalsIgnoreCase(name)) {
			wtax_rate(value);
			return;
		}
		if ($pay_crryovr_times.equalsIgnoreCase(name)) {
			pay_crryovr_times(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($arr_pr_upd_cntr.equalsIgnoreCase(name)) {
			arr_pr_upd_cntr(value);
			return;
		}
		if ($purc_act_upd_cntr.equalsIgnoreCase(name)) {
			purc_act_upd_cntr(value);
			return;
		}
		if ($rcpt_iv_upd_cntr.equalsIgnoreCase(name)) {
			rcpt_iv_upd_cntr(value);
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
		if ($db_trd_cur_onr_prov_amt.equalsIgnoreCase(name)) {
			db_trd_cur_onr_prov_amt(value);
			return;
		}
		if ($db_trd_cur_onr_prov_upri.equalsIgnoreCase(name)) {
			db_trd_cur_onr_prov_upri(value);
			return;
		}
		if ($db_trd_cur_proc_amt.equalsIgnoreCase(name)) {
			db_trd_cur_proc_amt(value);
			return;
		}
		if ($db_trd_cur_proc_upri.equalsIgnoreCase(name)) {
			db_trd_cur_proc_upri(value);
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
		if ($purc_act_qty.equalsIgnoreCase(name)) {
			purc_act_qty(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($purc_act_seq.equalsIgnoreCase(name)) {
			purc_act_seq(value);
			return;
		}
		if ($purc_act_d_seq.equalsIgnoreCase(name)) {
			purc_act_d_seq(value);
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
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($src_trd_unit_conv_qty.equalsIgnoreCase(name)) {
			src_trd_unit_conv_qty(value);
			return;
		}
		if ($src_trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			src_trd_unit_conv_base_qty(value);
			return;
		}
		if ($src_trd_unit_dec_place.equalsIgnoreCase(name)) {
			src_trd_unit_dec_place(value);
			return;
		}
		if ($src_trd_unit_qty.equalsIgnoreCase(name)) {
			src_trd_unit_qty(value);
			return;
		}
		if ($src_trd_cur_amt.equalsIgnoreCase(name)) {
			src_trd_cur_amt(value);
			return;
		}
		if ($src_trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			src_trd_cur_dscnt_amt(value);
			return;
		}
		if ($src_trd_cur_onr_prov_amt.equalsIgnoreCase(name)) {
			src_trd_cur_onr_prov_amt(value);
			return;
		}
		if ($src_trd_cur_onr_prov_upri.equalsIgnoreCase(name)) {
			src_trd_cur_onr_prov_upri(value);
			return;
		}
		if ($src_trd_cur_proc_amt.equalsIgnoreCase(name)) {
			src_trd_cur_proc_amt(value);
			return;
		}
		if ($src_trd_cur_proc_upri.equalsIgnoreCase(name)) {
			src_trd_cur_proc_upri(value);
			return;
		}
		if ($src_trd_cur_tax_amt.equalsIgnoreCase(name)) {
			src_trd_cur_tax_amt(value);
			return;
		}
		if ($src_trd_cur_upri.equalsIgnoreCase(name)) {
			src_trd_cur_upri(value);
			return;
		}
		if ($src_wtax_rate.equalsIgnoreCase(name)) {
			src_wtax_rate(value);
			return;
		}
		if ($src_tax_rate.equalsIgnoreCase(name)) {
			src_tax_rate(value);
			return;
		}
		if ($purc_prgrs.equalsIgnoreCase(name)) {
			purc_prgrs(value);
			return;
		}
		if ($cont_fctr_dec_place.equalsIgnoreCase(name)) {
			cont_fctr_dec_place(value);
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
		if ($old_trd_cur_upri.equalsIgnoreCase(name)) {
			old_trd_cur_upri(value);
			return;
		}
		if ($old_trd_cur_proc_upri.equalsIgnoreCase(name)) {
			old_trd_cur_proc_upri(value);
			return;
		}
		if ($old_trd_cur_onr_prov_upri.equalsIgnoreCase(name)) {
			old_trd_cur_onr_prov_upri(value);
			return;
		}
		if ($src_xrate.equalsIgnoreCase(name)) {
			src_xrate(value);
			return;
		}
		if ($base_cur_amt_dec_place.equalsIgnoreCase(name)) {
			base_cur_amt_dec_place(value);
			return;
		}
		if ($base_cur_upri_dec_place.equalsIgnoreCase(name)) {
			base_cur_upri_dec_place(value);
			return;
		}
		if ($src_ptax_xrate.equalsIgnoreCase(name)) {
			src_ptax_xrate(value);
			return;
		}
		if ($ptax_cur_amt_dec_place.equalsIgnoreCase(name)) {
			ptax_cur_amt_dec_place(value);
			return;
		}
		if ($ptax_cur_upri_dec_place.equalsIgnoreCase(name)) {
			ptax_cur_upri_dec_place(value);
			return;
		}
		if ($wtax_rate.equalsIgnoreCase(name)) {
			wtax_rate(value);
			return;
		}
		if ($pay_crryovr_times.equalsIgnoreCase(name)) {
			pay_crryovr_times(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($arr_pr_upd_cntr.equalsIgnoreCase(name)) {
			arr_pr_upd_cntr(value);
			return;
		}
		if ($purc_act_upd_cntr.equalsIgnoreCase(name)) {
			purc_act_upd_cntr(value);
			return;
		}
		if ($rcpt_iv_upd_cntr.equalsIgnoreCase(name)) {
			rcpt_iv_upd_cntr(value);
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
		if ($db_trd_cur_onr_prov_amt.equalsIgnoreCase(name)) {
			db_trd_cur_onr_prov_amt(value);
			return;
		}
		if ($db_trd_cur_onr_prov_upri.equalsIgnoreCase(name)) {
			db_trd_cur_onr_prov_upri(value);
			return;
		}
		if ($db_trd_cur_proc_amt.equalsIgnoreCase(name)) {
			db_trd_cur_proc_amt(value);
			return;
		}
		if ($db_trd_cur_proc_upri.equalsIgnoreCase(name)) {
			db_trd_cur_proc_upri(value);
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
		if ($purc_act_qty.equalsIgnoreCase(name)) {
			purc_act_qty(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($purc_act_seq.equalsIgnoreCase(name)) {
			purc_act_seq(value);
			return;
		}
		if ($purc_act_d_seq.equalsIgnoreCase(name)) {
			purc_act_d_seq(value);
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
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($src_trd_unit_conv_qty.equalsIgnoreCase(name)) {
			src_trd_unit_conv_qty(value);
			return;
		}
		if ($src_trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			src_trd_unit_conv_base_qty(value);
			return;
		}
		if ($src_trd_unit_dec_place.equalsIgnoreCase(name)) {
			src_trd_unit_dec_place(value);
			return;
		}
		if ($src_trd_unit_qty.equalsIgnoreCase(name)) {
			src_trd_unit_qty(value);
			return;
		}
		if ($src_trd_cur_amt.equalsIgnoreCase(name)) {
			src_trd_cur_amt(value);
			return;
		}
		if ($src_trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			src_trd_cur_dscnt_amt(value);
			return;
		}
		if ($src_trd_cur_onr_prov_amt.equalsIgnoreCase(name)) {
			src_trd_cur_onr_prov_amt(value);
			return;
		}
		if ($src_trd_cur_onr_prov_upri.equalsIgnoreCase(name)) {
			src_trd_cur_onr_prov_upri(value);
			return;
		}
		if ($src_trd_cur_proc_amt.equalsIgnoreCase(name)) {
			src_trd_cur_proc_amt(value);
			return;
		}
		if ($src_trd_cur_proc_upri.equalsIgnoreCase(name)) {
			src_trd_cur_proc_upri(value);
			return;
		}
		if ($src_trd_cur_tax_amt.equalsIgnoreCase(name)) {
			src_trd_cur_tax_amt(value);
			return;
		}
		if ($src_trd_cur_upri.equalsIgnoreCase(name)) {
			src_trd_cur_upri(value);
			return;
		}
		if ($src_wtax_rate.equalsIgnoreCase(name)) {
			src_wtax_rate(value);
			return;
		}
		if ($src_tax_rate.equalsIgnoreCase(name)) {
			src_tax_rate(value);
			return;
		}
		if ($purc_prgrs.equalsIgnoreCase(name)) {
			purc_prgrs(value);
			return;
		}
		if ($cont_fctr_dec_place.equalsIgnoreCase(name)) {
			cont_fctr_dec_place(value);
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
		if ($old_trd_cur_upri.equalsIgnoreCase(name)) {
			old_trd_cur_upri(value);
			return;
		}
		if ($old_trd_cur_proc_upri.equalsIgnoreCase(name)) {
			old_trd_cur_proc_upri(value);
			return;
		}
		if ($old_trd_cur_onr_prov_upri.equalsIgnoreCase(name)) {
			old_trd_cur_onr_prov_upri(value);
			return;
		}
		if ($src_xrate.equalsIgnoreCase(name)) {
			src_xrate(value);
			return;
		}
		if ($base_cur_amt_dec_place.equalsIgnoreCase(name)) {
			base_cur_amt_dec_place(value);
			return;
		}
		if ($base_cur_upri_dec_place.equalsIgnoreCase(name)) {
			base_cur_upri_dec_place(value);
			return;
		}
		if ($src_ptax_xrate.equalsIgnoreCase(name)) {
			src_ptax_xrate(value);
			return;
		}
		if ($ptax_cur_amt_dec_place.equalsIgnoreCase(name)) {
			ptax_cur_amt_dec_place(value);
			return;
		}
		if ($ptax_cur_upri_dec_place.equalsIgnoreCase(name)) {
			ptax_cur_upri_dec_place(value);
			return;
		}
		if ($wtax_rate.equalsIgnoreCase(name)) {
			wtax_rate(value);
			return;
		}
		if ($pay_crryovr_times.equalsIgnoreCase(name)) {
			pay_crryovr_times(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($arr_pr_upd_cntr.equalsIgnoreCase(name)) {
			arr_pr_upd_cntr(value);
			return;
		}
		if ($purc_act_upd_cntr.equalsIgnoreCase(name)) {
			purc_act_upd_cntr(value);
			return;
		}
		if ($rcpt_iv_upd_cntr.equalsIgnoreCase(name)) {
			rcpt_iv_upd_cntr(value);
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
		if ($db_trd_cur_onr_prov_amt.equalsIgnoreCase(name)) {
			db_trd_cur_onr_prov_amt(value);
			return;
		}
		if ($db_trd_cur_onr_prov_upri.equalsIgnoreCase(name)) {
			db_trd_cur_onr_prov_upri(value);
			return;
		}
		if ($db_trd_cur_proc_amt.equalsIgnoreCase(name)) {
			db_trd_cur_proc_amt(value);
			return;
		}
		if ($db_trd_cur_proc_upri.equalsIgnoreCase(name)) {
			db_trd_cur_proc_upri(value);
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
		if ($purc_act_qty.equalsIgnoreCase(name)) {
			purc_act_qty(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($purc_act_seq.equalsIgnoreCase(name)) {
			purc_act_seq(value);
			return;
		}
		if ($purc_act_d_seq.equalsIgnoreCase(name)) {
			purc_act_d_seq(value);
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
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($src_trd_unit_conv_qty.equalsIgnoreCase(name)) {
			src_trd_unit_conv_qty(value);
			return;
		}
		if ($src_trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			src_trd_unit_conv_base_qty(value);
			return;
		}
		if ($src_trd_unit_dec_place.equalsIgnoreCase(name)) {
			src_trd_unit_dec_place(value);
			return;
		}
		if ($src_trd_unit_qty.equalsIgnoreCase(name)) {
			src_trd_unit_qty(value);
			return;
		}
		if ($src_trd_cur_amt.equalsIgnoreCase(name)) {
			src_trd_cur_amt(value);
			return;
		}
		if ($src_trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			src_trd_cur_dscnt_amt(value);
			return;
		}
		if ($src_trd_cur_onr_prov_amt.equalsIgnoreCase(name)) {
			src_trd_cur_onr_prov_amt(value);
			return;
		}
		if ($src_trd_cur_onr_prov_upri.equalsIgnoreCase(name)) {
			src_trd_cur_onr_prov_upri(value);
			return;
		}
		if ($src_trd_cur_proc_amt.equalsIgnoreCase(name)) {
			src_trd_cur_proc_amt(value);
			return;
		}
		if ($src_trd_cur_proc_upri.equalsIgnoreCase(name)) {
			src_trd_cur_proc_upri(value);
			return;
		}
		if ($src_trd_cur_tax_amt.equalsIgnoreCase(name)) {
			src_trd_cur_tax_amt(value);
			return;
		}
		if ($src_trd_cur_upri.equalsIgnoreCase(name)) {
			src_trd_cur_upri(value);
			return;
		}
		if ($src_wtax_rate.equalsIgnoreCase(name)) {
			src_wtax_rate(value);
			return;
		}
		if ($src_tax_rate.equalsIgnoreCase(name)) {
			src_tax_rate(value);
			return;
		}
		if ($purc_prgrs.equalsIgnoreCase(name)) {
			purc_prgrs(value);
			return;
		}
		if ($cont_fctr_dec_place.equalsIgnoreCase(name)) {
			cont_fctr_dec_place(value);
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
		if ($old_trd_cur_upri.equalsIgnoreCase(name)) {
			old_trd_cur_upri(value);
			return;
		}
		if ($old_trd_cur_proc_upri.equalsIgnoreCase(name)) {
			old_trd_cur_proc_upri(value);
			return;
		}
		if ($old_trd_cur_onr_prov_upri.equalsIgnoreCase(name)) {
			old_trd_cur_onr_prov_upri(value);
			return;
		}
		if ($src_xrate.equalsIgnoreCase(name)) {
			src_xrate(value);
			return;
		}
		if ($base_cur_amt_dec_place.equalsIgnoreCase(name)) {
			base_cur_amt_dec_place(value);
			return;
		}
		if ($base_cur_upri_dec_place.equalsIgnoreCase(name)) {
			base_cur_upri_dec_place(value);
			return;
		}
		if ($src_ptax_xrate.equalsIgnoreCase(name)) {
			src_ptax_xrate(value);
			return;
		}
		if ($ptax_cur_amt_dec_place.equalsIgnoreCase(name)) {
			ptax_cur_amt_dec_place(value);
			return;
		}
		if ($ptax_cur_upri_dec_place.equalsIgnoreCase(name)) {
			ptax_cur_upri_dec_place(value);
			return;
		}
		if ($wtax_rate.equalsIgnoreCase(name)) {
			wtax_rate(value);
			return;
		}
		if ($pay_crryovr_times.equalsIgnoreCase(name)) {
			pay_crryovr_times(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($arr_pr_upd_cntr.equalsIgnoreCase(name)) {
			arr_pr_upd_cntr(value);
			return;
		}
		if ($purc_act_upd_cntr.equalsIgnoreCase(name)) {
			purc_act_upd_cntr(value);
			return;
		}
		if ($rcpt_iv_upd_cntr.equalsIgnoreCase(name)) {
			rcpt_iv_upd_cntr(value);
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
		if ($db_trd_cur_onr_prov_amt.equalsIgnoreCase(name)) {
			db_trd_cur_onr_prov_amt(value);
			return;
		}
		if ($db_trd_cur_onr_prov_upri.equalsIgnoreCase(name)) {
			db_trd_cur_onr_prov_upri(value);
			return;
		}
		if ($db_trd_cur_proc_amt.equalsIgnoreCase(name)) {
			db_trd_cur_proc_amt(value);
			return;
		}
		if ($db_trd_cur_proc_upri.equalsIgnoreCase(name)) {
			db_trd_cur_proc_upri(value);
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
		if ($purc_act_qty.equalsIgnoreCase(name)) {
			purc_act_qty(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($purc_act_seq.equalsIgnoreCase(name)) {
			purc_act_seq(value);
			return;
		}
		if ($purc_act_d_seq.equalsIgnoreCase(name)) {
			purc_act_d_seq(value);
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
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($src_trd_unit_conv_qty.equalsIgnoreCase(name)) {
			src_trd_unit_conv_qty(value);
			return;
		}
		if ($src_trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			src_trd_unit_conv_base_qty(value);
			return;
		}
		if ($src_trd_unit_dec_place.equalsIgnoreCase(name)) {
			src_trd_unit_dec_place(value);
			return;
		}
		if ($src_trd_unit_qty.equalsIgnoreCase(name)) {
			src_trd_unit_qty(value);
			return;
		}
		if ($src_trd_cur_amt.equalsIgnoreCase(name)) {
			src_trd_cur_amt(value);
			return;
		}
		if ($src_trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			src_trd_cur_dscnt_amt(value);
			return;
		}
		if ($src_trd_cur_onr_prov_amt.equalsIgnoreCase(name)) {
			src_trd_cur_onr_prov_amt(value);
			return;
		}
		if ($src_trd_cur_onr_prov_upri.equalsIgnoreCase(name)) {
			src_trd_cur_onr_prov_upri(value);
			return;
		}
		if ($src_trd_cur_proc_amt.equalsIgnoreCase(name)) {
			src_trd_cur_proc_amt(value);
			return;
		}
		if ($src_trd_cur_proc_upri.equalsIgnoreCase(name)) {
			src_trd_cur_proc_upri(value);
			return;
		}
		if ($src_trd_cur_tax_amt.equalsIgnoreCase(name)) {
			src_trd_cur_tax_amt(value);
			return;
		}
		if ($src_trd_cur_upri.equalsIgnoreCase(name)) {
			src_trd_cur_upri(value);
			return;
		}
		if ($src_wtax_rate.equalsIgnoreCase(name)) {
			src_wtax_rate(value);
			return;
		}
		if ($src_tax_rate.equalsIgnoreCase(name)) {
			src_tax_rate(value);
			return;
		}
		if ($purc_prgrs.equalsIgnoreCase(name)) {
			purc_prgrs(value);
			return;
		}
		if ($cont_fctr_dec_place.equalsIgnoreCase(name)) {
			cont_fctr_dec_place(value);
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
		if ($old_trd_cur_upri.equalsIgnoreCase(name)) {
			old_trd_cur_upri(value);
			return;
		}
		if ($old_trd_cur_proc_upri.equalsIgnoreCase(name)) {
			old_trd_cur_proc_upri(value);
			return;
		}
		if ($old_trd_cur_onr_prov_upri.equalsIgnoreCase(name)) {
			old_trd_cur_onr_prov_upri(value);
			return;
		}
		if ($src_xrate.equalsIgnoreCase(name)) {
			src_xrate(value);
			return;
		}
		if ($base_cur_amt_dec_place.equalsIgnoreCase(name)) {
			base_cur_amt_dec_place(value);
			return;
		}
		if ($base_cur_upri_dec_place.equalsIgnoreCase(name)) {
			base_cur_upri_dec_place(value);
			return;
		}
		if ($src_ptax_xrate.equalsIgnoreCase(name)) {
			src_ptax_xrate(value);
			return;
		}
		if ($ptax_cur_amt_dec_place.equalsIgnoreCase(name)) {
			ptax_cur_amt_dec_place(value);
			return;
		}
		if ($ptax_cur_upri_dec_place.equalsIgnoreCase(name)) {
			ptax_cur_upri_dec_place(value);
			return;
		}
		if ($wtax_rate.equalsIgnoreCase(name)) {
			wtax_rate(value);
			return;
		}
		if ($pay_crryovr_times.equalsIgnoreCase(name)) {
			pay_crryovr_times(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($arr_pr_upd_cntr.equalsIgnoreCase(name)) {
			arr_pr_upd_cntr(value);
			return;
		}
		if ($purc_act_upd_cntr.equalsIgnoreCase(name)) {
			purc_act_upd_cntr(value);
			return;
		}
		if ($rcpt_iv_upd_cntr.equalsIgnoreCase(name)) {
			rcpt_iv_upd_cntr(value);
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
		if ($db_trd_cur_onr_prov_amt.equalsIgnoreCase(name)) {
			db_trd_cur_onr_prov_amt(value);
			return;
		}
		if ($db_trd_cur_onr_prov_upri.equalsIgnoreCase(name)) {
			db_trd_cur_onr_prov_upri(value);
			return;
		}
		if ($db_trd_cur_proc_amt.equalsIgnoreCase(name)) {
			db_trd_cur_proc_amt(value);
			return;
		}
		if ($db_trd_cur_proc_upri.equalsIgnoreCase(name)) {
			db_trd_cur_proc_upri(value);
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
		if ($purc_act_qty.equalsIgnoreCase(name)) {
			purc_act_qty(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($purc_dt.equalsIgnoreCase(name)) {
			purc_dt(value);
			return;
		}
		if ($ac_ym.equalsIgnoreCase(name)) {
			ac_ym(value);
			return;
		}
		if ($pay_basis_dt.equalsIgnoreCase(name)) {
			pay_basis_dt(value);
			return;
		}
		if ($pay_schd_dt.equalsIgnoreCase(name)) {
			pay_schd_dt(value);
			return;
		}
		if ($purc_schd_dt.equalsIgnoreCase(name)) {
			purc_schd_dt(value);
			return;
		}
		if ($dlv_rqst_dt.equalsIgnoreCase(name)) {
			dlv_rqst_dt(value);
			return;
		}
		if ($arr_schd_dt.equalsIgnoreCase(name)) {
			arr_schd_dt(value);
			return;
		}
		if ($re_arr_purc_schd_dt.equalsIgnoreCase(name)) {
			re_arr_purc_schd_dt(value);
			return;
		}
		if ($slip_fr_valid_dt.equalsIgnoreCase(name)) {
			slip_fr_valid_dt(value);
			return;
		}
		if ($ptax_dt.equalsIgnoreCase(name)) {
			ptax_dt(value);
			return;
		}
		super.setDate(name, value);
	}
	public void setTimestamp(String name, MCTimestamp value) {
		if ($ins_ts.equalsIgnoreCase(name)) {
			ins_ts(value);
			return;
		}
		if ($upd_ts.equalsIgnoreCase(name)) {
			upd_ts(value);
			return;
		}
		super.setTimestamp(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($check.equalsIgnoreCase(name)) {
			check(value);
			return;
		}
		if ($hdr_readonly_flg.equalsIgnoreCase(name)) {
			hdr_readonly_flg(value);
			return;
		}
		if ($bef_abort_flg.equalsIgnoreCase(name)) {
			bef_abort_flg(value);
			return;
		}
		if ($abort_flg.equalsIgnoreCase(name)) {
			abort_flg(value);
			return;
		}
		if ($sync_flg.equalsIgnoreCase(name)) {
			sync_flg(value);
			return;
		}
		if ($purc_ddlv_flg.equalsIgnoreCase(name)) {
			purc_ddlv_flg(value);
			return;
		}
		if ($arr_skip_flg.equalsIgnoreCase(name)) {
			arr_skip_flg(value);
			return;
		}
		if ($schd_sync_flg.equalsIgnoreCase(name)) {
			schd_sync_flg(value);
			return;
		}
		if ($multi_io_flg.equalsIgnoreCase(name)) {
			multi_io_flg(value);
			return;
		}
		if ($arr_split_flg.equalsIgnoreCase(name)) {
			arr_split_flg(value);
			return;
		}
		if ($ver_flg.equalsIgnoreCase(name)) {
			ver_flg(value);
			return;
		}
		if ($sundry_itm_flg.equalsIgnoreCase(name)) {
			sundry_itm_flg(value);
			return;
		}
		if ($bp_lot_flg.equalsIgnoreCase(name)) {
			bp_lot_flg(value);
			return;
		}
		if ($dscnt_itm_flg.equalsIgnoreCase(name)) {
			dscnt_itm_flg(value);
			return;
		}
		if ($itm_purc_upri_cng_flg.equalsIgnoreCase(name)) {
			itm_purc_upri_cng_flg(value);
			return;
		}
		if ($pay_spot_flg.equalsIgnoreCase(name)) {
			pay_spot_flg(value);
			return;
		}
		if ($purc_upri_cng_flg.equalsIgnoreCase(name)) {
			purc_upri_cng_flg(value);
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
		if ($outsrc_flg.equalsIgnoreCase(name)) {
			outsrc_flg(value);
			return;
		}
		if ($accpt_dfct_flg.equalsIgnoreCase(name)) {
			accpt_dfct_flg(value);
			return;
		}
		if ($src_inc_tax_flg.equalsIgnoreCase(name)) {
			src_inc_tax_flg(value);
			return;
		}
		if ($re_arr_flg.equalsIgnoreCase(name)) {
			re_arr_flg(value);
			return;
		}
		if ($re_arr_str_ln_tgt_flg.equalsIgnoreCase(name)) {
			re_arr_str_ln_tgt_flg(value);
			return;
		}
		if ($re_arr_sync_flg.equalsIgnoreCase(name)) {
			re_arr_sync_flg(value);
			return;
		}
		if ($ncv_flg.equalsIgnoreCase(name)) {
			ncv_flg(value);
			return;
		}
		if ($in_to_str_ln_tgt_flg.equalsIgnoreCase(name)) {
			in_to_str_ln_tgt_flg(value);
			return;
		}
		if ($cst_iv_flg.equalsIgnoreCase(name)) {
			cst_iv_flg(value);
			return;
		}
		if ($cont_fctr_flg.equalsIgnoreCase(name)) {
			cont_fctr_flg(value);
			return;
		}
		if ($purc_dtl_upd_flg.equalsIgnoreCase(name)) {
			purc_dtl_upd_flg(value);
			return;
		}
		if ($temp_ap_flg.equalsIgnoreCase(name)) {
			temp_ap_flg(value);
			return;
		}
		if ($repurc_obli_flg.equalsIgnoreCase(name)) {
			repurc_obli_flg(value);
			return;
		}
		if ($old_interim_flg.equalsIgnoreCase(name)) {
			old_interim_flg(value);
			return;
		}
		if ($xrate_inpt_flg.equalsIgnoreCase(name)) {
			xrate_inpt_flg(value);
			return;
		}
		if ($ptax_xrate_inpt_flg.equalsIgnoreCase(name)) {
			ptax_xrate_inpt_flg(value);
			return;
		}
		if ($xpns_purc_flg.equalsIgnoreCase(name)) {
			xpns_purc_flg(value);
			return;
		}
		if ($ap_dpt_flg.equalsIgnoreCase(name)) {
			ap_dpt_flg(value);
			return;
		}
		if ($edi_flg.equalsIgnoreCase(name)) {
			edi_flg(value);
			return;
		}
		if ($db_inc_tax_flg.equalsIgnoreCase(name)) {
			db_inc_tax_flg(value);
			return;
		}
		if ($sls_sync_flg.equalsIgnoreCase(name)) {
			sls_sync_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
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
		if ($arr_ptn_typ.equalsIgnoreCase(name)) {
			arr_ptn_typ(value);
			return;
		}
		if ($arr_ptn_typ_nm.equalsIgnoreCase(name)) {
			arr_ptn_typ_nm(value);
			return;
		}
		if ($purc_basis_typ.equalsIgnoreCase(name)) {
			purc_basis_typ(value);
			return;
		}
		if ($purc_basis_typ_nm.equalsIgnoreCase(name)) {
			purc_basis_typ_nm(value);
			return;
		}
		if ($aprv_no.equalsIgnoreCase(name)) {
			aprv_no(value);
			return;
		}
		if ($aprv_sts_typ.equalsIgnoreCase(name)) {
			aprv_sts_typ(value);
			return;
		}
		if ($aprv_sts_typ_nm.equalsIgnoreCase(name)) {
			aprv_sts_typ_nm(value);
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
		if ($po_schd_src_typ.equalsIgnoreCase(name)) {
			po_schd_src_typ(value);
			return;
		}
		if ($po_schd_src_typ_nm.equalsIgnoreCase(name)) {
			po_schd_src_typ_nm(value);
			return;
		}
		if ($po_schd_src_no.equalsIgnoreCase(name)) {
			po_schd_src_no(value);
			return;
		}
		if ($rcpt_iv_no.equalsIgnoreCase(name)) {
			rcpt_iv_no(value);
			return;
		}
		if ($rcpt_iv_mng_no.equalsIgnoreCase(name)) {
			rcpt_iv_mng_no(value);
			return;
		}
		if ($rcpt_iv_d_no.equalsIgnoreCase(name)) {
			rcpt_iv_d_no(value);
			return;
		}
		if ($mfg_inst_no.equalsIgnoreCase(name)) {
			mfg_inst_no(value);
			return;
		}
		if ($mfg_loc_cd.equalsIgnoreCase(name)) {
			mfg_loc_cd(value);
			return;
		}
		if ($bom_ptn.equalsIgnoreCase(name)) {
			bom_ptn(value);
			return;
		}
		if ($purc_schd_no.equalsIgnoreCase(name)) {
			purc_schd_no(value);
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
		if ($arr_schd_no.equalsIgnoreCase(name)) {
			arr_schd_no(value);
			return;
		}
		if ($arr_pr_no.equalsIgnoreCase(name)) {
			arr_pr_no(value);
			return;
		}
		if ($arr_act_no.equalsIgnoreCase(name)) {
			arr_act_no(value);
			return;
		}
		if ($from_gd_cd.equalsIgnoreCase(name)) {
			from_gd_cd(value);
			return;
		}
		if ($tmp_gd_cd.equalsIgnoreCase(name)) {
			tmp_gd_cd(value);
			return;
		}
		if ($tmp_quality_typ.equalsIgnoreCase(name)) {
			tmp_quality_typ(value);
			return;
		}
		if ($tmp_stk_insp_typ.equalsIgnoreCase(name)) {
			tmp_stk_insp_typ(value);
			return;
		}
		if ($tmp_stk_id_typ.equalsIgnoreCase(name)) {
			tmp_stk_id_typ(value);
			return;
		}
		if ($gi_wg_cd.equalsIgnoreCase(name)) {
			gi_wg_cd(value);
			return;
		}
		if ($gi_loc_cd.equalsIgnoreCase(name)) {
			gi_loc_cd(value);
			return;
		}
		if ($gi_str_ln_cd.equalsIgnoreCase(name)) {
			gi_str_ln_cd(value);
			return;
		}
		if ($gi_unit_cd.equalsIgnoreCase(name)) {
			gi_unit_cd(value);
			return;
		}
		if ($par_purc_act_d_no.equalsIgnoreCase(name)) {
			par_purc_act_d_no(value);
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
		if ($itm_typ.equalsIgnoreCase(name)) {
			itm_typ(value);
			return;
		}
		if ($itm_typ_nm.equalsIgnoreCase(name)) {
			itm_typ_nm(value);
			return;
		}
		if ($itm_typ_d_cd.equalsIgnoreCase(name)) {
			itm_typ_d_cd(value);
			return;
		}
		if ($itm_typ_d_nm.equalsIgnoreCase(name)) {
			itm_typ_d_nm(value);
			return;
		}
		if ($iv_itm_nm.equalsIgnoreCase(name)) {
			iv_itm_nm(value);
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
		if ($sppl_cd.equalsIgnoreCase(name)) {
			sppl_cd(value);
			return;
		}
		if ($sppl_nm.equalsIgnoreCase(name)) {
			sppl_nm(value);
			return;
		}
		if ($ap_cred_cd.equalsIgnoreCase(name)) {
			ap_cred_cd(value);
			return;
		}
		if ($purc_slip_each_lot_typ.equalsIgnoreCase(name)) {
			purc_slip_each_lot_typ(value);
			return;
		}
		if ($prnt_lcl_cd.equalsIgnoreCase(name)) {
			prnt_lcl_cd(value);
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
		if ($purc_tax_calc_typ.equalsIgnoreCase(name)) {
			purc_tax_calc_typ(value);
			return;
		}
		if ($asppl_cd.equalsIgnoreCase(name)) {
			asppl_cd(value);
			return;
		}
		if ($asppl_nm.equalsIgnoreCase(name)) {
			asppl_nm(value);
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
		if ($trd_unit_cd.equalsIgnoreCase(name)) {
			trd_unit_cd(value);
			return;
		}
		if ($trd_unit_nm.equalsIgnoreCase(name)) {
			trd_unit_nm(value);
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
		if ($base_unit_nm.equalsIgnoreCase(name)) {
			base_unit_nm(value);
			return;
		}
		if ($base_unit_rnd_typ.equalsIgnoreCase(name)) {
			base_unit_rnd_typ(value);
			return;
		}
		if ($src_trd_unit_cd.equalsIgnoreCase(name)) {
			src_trd_unit_cd(value);
			return;
		}
		if ($src_trd_unit_rnd_typ.equalsIgnoreCase(name)) {
			src_trd_unit_rnd_typ(value);
			return;
		}
		if ($re_arr_loc_wg_cd.equalsIgnoreCase(name)) {
			re_arr_loc_wg_cd(value);
			return;
		}
		if ($re_arr_loc_wg_nm.equalsIgnoreCase(name)) {
			re_arr_loc_wg_nm(value);
			return;
		}
		if ($re_arr_loc_cd.equalsIgnoreCase(name)) {
			re_arr_loc_cd(value);
			return;
		}
		if ($re_arr_loc_nm.equalsIgnoreCase(name)) {
			re_arr_loc_nm(value);
			return;
		}
		if ($re_arr_loc_site_cd.equalsIgnoreCase(name)) {
			re_arr_loc_site_cd(value);
			return;
		}
		if ($re_arr_loc_cal_cd.equalsIgnoreCase(name)) {
			re_arr_loc_cal_cd(value);
			return;
		}
		if ($re_arr_loc_sppl_cd.equalsIgnoreCase(name)) {
			re_arr_loc_sppl_cd(value);
			return;
		}
		if ($re_arr_loc_sppl_cal_cd.equalsIgnoreCase(name)) {
			re_arr_loc_sppl_cal_cd(value);
			return;
		}
		if ($quality_typ.equalsIgnoreCase(name)) {
			quality_typ(value);
			return;
		}
		if ($quality_typ_nm.equalsIgnoreCase(name)) {
			quality_typ_nm(value);
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
		if ($site_cd.equalsIgnoreCase(name)) {
			site_cd(value);
			return;
		}
		if ($site_nm.equalsIgnoreCase(name)) {
			site_nm(value);
			return;
		}
		if ($in_to_loc_wg_cd.equalsIgnoreCase(name)) {
			in_to_loc_wg_cd(value);
			return;
		}
		if ($in_to_loc_wg_nm.equalsIgnoreCase(name)) {
			in_to_loc_wg_nm(value);
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
		if ($outsrc_sppl_cd.equalsIgnoreCase(name)) {
			outsrc_sppl_cd(value);
			return;
		}
		if ($drct_dlv_typ.equalsIgnoreCase(name)) {
			drct_dlv_typ(value);
			return;
		}
		if ($drct_dlv_typ_nm.equalsIgnoreCase(name)) {
			drct_dlv_typ_nm(value);
			return;
		}
		if ($slo_d_no.equalsIgnoreCase(name)) {
			slo_d_no(value);
			return;
		}
		if ($slo_no.equalsIgnoreCase(name)) {
			slo_no(value);
			return;
		}
		if ($scst_cal_cd.equalsIgnoreCase(name)) {
			scst_cal_cd(value);
			return;
		}
		if ($bp_lot_no.equalsIgnoreCase(name)) {
			bp_lot_no(value);
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
		if ($org_ver_no.equalsIgnoreCase(name)) {
			org_ver_no(value);
			return;
		}
		if ($cont_fctr_rnd_typ.equalsIgnoreCase(name)) {
			cont_fctr_rnd_typ(value);
			return;
		}
		if ($trd_cur_cd.equalsIgnoreCase(name)) {
			trd_cur_cd(value);
			return;
		}
		if ($trd_cur_nm.equalsIgnoreCase(name)) {
			trd_cur_nm(value);
			return;
		}
		if ($outsrc_upri_typ.equalsIgnoreCase(name)) {
			outsrc_upri_typ(value);
			return;
		}
		if ($xrate_cd.equalsIgnoreCase(name)) {
			xrate_cd(value);
			return;
		}
		if ($xrate_rnd_typ.equalsIgnoreCase(name)) {
			xrate_rnd_typ(value);
			return;
		}
		if ($base_cur_cd.equalsIgnoreCase(name)) {
			base_cur_cd(value);
			return;
		}
		if ($base_cur_nm.equalsIgnoreCase(name)) {
			base_cur_nm(value);
			return;
		}
		if ($ptax_cur_cd.equalsIgnoreCase(name)) {
			ptax_cur_cd(value);
			return;
		}
		if ($ptax_cur_nm.equalsIgnoreCase(name)) {
			ptax_cur_nm(value);
			return;
		}
		if ($wtax_rnd_typ.equalsIgnoreCase(name)) {
			wtax_rnd_typ(value);
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
		if ($cst_itm_cd.equalsIgnoreCase(name)) {
			cst_itm_cd(value);
			return;
		}
		if ($cst_itm_nm.equalsIgnoreCase(name)) {
			cst_itm_nm(value);
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
		if ($purc_id_typ.equalsIgnoreCase(name)) {
			purc_id_typ(value);
			return;
		}
		if ($purc_id_typ_nm.equalsIgnoreCase(name)) {
			purc_id_typ_nm(value);
			return;
		}
		if ($stk_insp_typ.equalsIgnoreCase(name)) {
			stk_insp_typ(value);
			return;
		}
		if ($stk_insp_typ_nm.equalsIgnoreCase(name)) {
			stk_insp_typ_nm(value);
			return;
		}
		if ($stk_id_typ.equalsIgnoreCase(name)) {
			stk_id_typ(value);
			return;
		}
		if ($stk_id_typ_nm.equalsIgnoreCase(name)) {
			stk_id_typ_nm(value);
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
		if ($mst_ap_dpt_cd.equalsIgnoreCase(name)) {
			mst_ap_dpt_cd(value);
			return;
		}
		if ($purc_dpt_wg_cd.equalsIgnoreCase(name)) {
			purc_dpt_wg_cd(value);
			return;
		}
		if ($purc_dpt_wg_nm.equalsIgnoreCase(name)) {
			purc_dpt_wg_nm(value);
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
		if ($s_sub_char1.equalsIgnoreCase(name)) {
			s_sub_char1(value);
			return;
		}
		if ($s_sub_char2.equalsIgnoreCase(name)) {
			s_sub_char2(value);
			return;
		}
		if ($s_sub_char3.equalsIgnoreCase(name)) {
			s_sub_char3(value);
			return;
		}
		if ($trd_rmrks.equalsIgnoreCase(name)) {
			trd_rmrks(value);
			return;
		}
		if ($intr_rmrks.equalsIgnoreCase(name)) {
			intr_rmrks(value);
			return;
		}
		if ($po_print_rmrks.equalsIgnoreCase(name)) {
			po_print_rmrks(value);
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
		if ($tterm_cd1.equalsIgnoreCase(name)) {
			tterm_cd1(value);
			return;
		}
		if ($tterm_nm1.equalsIgnoreCase(name)) {
			tterm_nm1(value);
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
		if ($tterm_nm2.equalsIgnoreCase(name)) {
			tterm_nm2(value);
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
		if ($tterm_nm3.equalsIgnoreCase(name)) {
			tterm_nm3(value);
			return;
		}
		if ($tterm_rmrks3.equalsIgnoreCase(name)) {
			tterm_rmrks3(value);
			return;
		}
		if ($trd_d_rmrks.equalsIgnoreCase(name)) {
			trd_d_rmrks(value);
			return;
		}
		if ($intr_d_rmrks.equalsIgnoreCase(name)) {
			intr_d_rmrks(value);
			return;
		}
		if ($dtl_sub_char1.equalsIgnoreCase(name)) {
			dtl_sub_char1(value);
			return;
		}
		if ($dtl_sub_char2.equalsIgnoreCase(name)) {
			dtl_sub_char2(value);
			return;
		}
		if ($dtl_sub_char3.equalsIgnoreCase(name)) {
			dtl_sub_char3(value);
			return;
		}
		if ($po_print_d_rmrks.equalsIgnoreCase(name)) {
			po_print_d_rmrks(value);
			return;
		}
		if ($edi_bp_dlv_slip_no.equalsIgnoreCase(name)) {
			edi_bp_dlv_slip_no(value);
			return;
		}
		if ($edi_bp_dlv_slip_d_no.equalsIgnoreCase(name)) {
			edi_bp_dlv_slip_d_no(value);
			return;
		}
		if ($ins_usr_id.equalsIgnoreCase(name)) {
			ins_usr_id(value);
			return;
		}
		if ($ins_usr_nm.equalsIgnoreCase(name)) {
			ins_usr_nm(value);
			return;
		}
		if ($ins_func_id.equalsIgnoreCase(name)) {
			ins_func_id(value);
			return;
		}
		if ($ins_func_nm.equalsIgnoreCase(name)) {
			ins_func_nm(value);
			return;
		}
		if ($upd_usr_id.equalsIgnoreCase(name)) {
			upd_usr_id(value);
			return;
		}
		if ($upd_usr_nm.equalsIgnoreCase(name)) {
			upd_usr_nm(value);
			return;
		}
		if ($upd_func_id.equalsIgnoreCase(name)) {
			upd_func_id(value);
			return;
		}
		if ($upd_func_nm.equalsIgnoreCase(name)) {
			upd_func_nm(value);
			return;
		}
		if ($upd_srv_req_no.equalsIgnoreCase(name)) {
			upd_srv_req_no(value);
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
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($purc_act_seq.equalsIgnoreCase(name)) {
			purc_act_seq(value);
			return;
		}
		if ($purc_act_d_seq.equalsIgnoreCase(name)) {
			purc_act_d_seq(value);
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
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($src_trd_unit_conv_qty.equalsIgnoreCase(name)) {
			src_trd_unit_conv_qty(value);
			return;
		}
		if ($src_trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			src_trd_unit_conv_base_qty(value);
			return;
		}
		if ($src_trd_unit_dec_place.equalsIgnoreCase(name)) {
			src_trd_unit_dec_place(value);
			return;
		}
		if ($src_trd_unit_qty.equalsIgnoreCase(name)) {
			src_trd_unit_qty(value);
			return;
		}
		if ($src_trd_cur_amt.equalsIgnoreCase(name)) {
			src_trd_cur_amt(value);
			return;
		}
		if ($src_trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			src_trd_cur_dscnt_amt(value);
			return;
		}
		if ($src_trd_cur_onr_prov_amt.equalsIgnoreCase(name)) {
			src_trd_cur_onr_prov_amt(value);
			return;
		}
		if ($src_trd_cur_onr_prov_upri.equalsIgnoreCase(name)) {
			src_trd_cur_onr_prov_upri(value);
			return;
		}
		if ($src_trd_cur_proc_amt.equalsIgnoreCase(name)) {
			src_trd_cur_proc_amt(value);
			return;
		}
		if ($src_trd_cur_proc_upri.equalsIgnoreCase(name)) {
			src_trd_cur_proc_upri(value);
			return;
		}
		if ($src_trd_cur_tax_amt.equalsIgnoreCase(name)) {
			src_trd_cur_tax_amt(value);
			return;
		}
		if ($src_trd_cur_upri.equalsIgnoreCase(name)) {
			src_trd_cur_upri(value);
			return;
		}
		if ($src_wtax_rate.equalsIgnoreCase(name)) {
			src_wtax_rate(value);
			return;
		}
		if ($src_tax_rate.equalsIgnoreCase(name)) {
			src_tax_rate(value);
			return;
		}
		if ($purc_prgrs.equalsIgnoreCase(name)) {
			purc_prgrs(value);
			return;
		}
		if ($cont_fctr_dec_place.equalsIgnoreCase(name)) {
			cont_fctr_dec_place(value);
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
		if ($old_trd_cur_upri.equalsIgnoreCase(name)) {
			old_trd_cur_upri(value);
			return;
		}
		if ($old_trd_cur_proc_upri.equalsIgnoreCase(name)) {
			old_trd_cur_proc_upri(value);
			return;
		}
		if ($old_trd_cur_onr_prov_upri.equalsIgnoreCase(name)) {
			old_trd_cur_onr_prov_upri(value);
			return;
		}
		if ($src_xrate.equalsIgnoreCase(name)) {
			src_xrate(value);
			return;
		}
		if ($base_cur_amt_dec_place.equalsIgnoreCase(name)) {
			base_cur_amt_dec_place(value);
			return;
		}
		if ($base_cur_upri_dec_place.equalsIgnoreCase(name)) {
			base_cur_upri_dec_place(value);
			return;
		}
		if ($src_ptax_xrate.equalsIgnoreCase(name)) {
			src_ptax_xrate(value);
			return;
		}
		if ($ptax_cur_amt_dec_place.equalsIgnoreCase(name)) {
			ptax_cur_amt_dec_place(value);
			return;
		}
		if ($ptax_cur_upri_dec_place.equalsIgnoreCase(name)) {
			ptax_cur_upri_dec_place(value);
			return;
		}
		if ($wtax_rate.equalsIgnoreCase(name)) {
			wtax_rate(value);
			return;
		}
		if ($pay_crryovr_times.equalsIgnoreCase(name)) {
			pay_crryovr_times(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($arr_pr_upd_cntr.equalsIgnoreCase(name)) {
			arr_pr_upd_cntr(value);
			return;
		}
		if ($purc_act_upd_cntr.equalsIgnoreCase(name)) {
			purc_act_upd_cntr(value);
			return;
		}
		if ($rcpt_iv_upd_cntr.equalsIgnoreCase(name)) {
			rcpt_iv_upd_cntr(value);
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
		if ($db_trd_cur_onr_prov_amt.equalsIgnoreCase(name)) {
			db_trd_cur_onr_prov_amt(value);
			return;
		}
		if ($db_trd_cur_onr_prov_upri.equalsIgnoreCase(name)) {
			db_trd_cur_onr_prov_upri(value);
			return;
		}
		if ($db_trd_cur_proc_amt.equalsIgnoreCase(name)) {
			db_trd_cur_proc_amt(value);
			return;
		}
		if ($db_trd_cur_proc_upri.equalsIgnoreCase(name)) {
			db_trd_cur_proc_upri(value);
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
		if ($purc_act_qty.equalsIgnoreCase(name)) {
			purc_act_qty(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($purc_act_seq.equalsIgnoreCase(name)) {
			purc_act_seq(value);
			return;
		}
		if ($purc_act_d_seq.equalsIgnoreCase(name)) {
			purc_act_d_seq(value);
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
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($src_trd_unit_conv_qty.equalsIgnoreCase(name)) {
			src_trd_unit_conv_qty(value);
			return;
		}
		if ($src_trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			src_trd_unit_conv_base_qty(value);
			return;
		}
		if ($src_trd_unit_dec_place.equalsIgnoreCase(name)) {
			src_trd_unit_dec_place(value);
			return;
		}
		if ($src_trd_unit_qty.equalsIgnoreCase(name)) {
			src_trd_unit_qty(value);
			return;
		}
		if ($src_trd_cur_amt.equalsIgnoreCase(name)) {
			src_trd_cur_amt(value);
			return;
		}
		if ($src_trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			src_trd_cur_dscnt_amt(value);
			return;
		}
		if ($src_trd_cur_onr_prov_amt.equalsIgnoreCase(name)) {
			src_trd_cur_onr_prov_amt(value);
			return;
		}
		if ($src_trd_cur_onr_prov_upri.equalsIgnoreCase(name)) {
			src_trd_cur_onr_prov_upri(value);
			return;
		}
		if ($src_trd_cur_proc_amt.equalsIgnoreCase(name)) {
			src_trd_cur_proc_amt(value);
			return;
		}
		if ($src_trd_cur_proc_upri.equalsIgnoreCase(name)) {
			src_trd_cur_proc_upri(value);
			return;
		}
		if ($src_trd_cur_tax_amt.equalsIgnoreCase(name)) {
			src_trd_cur_tax_amt(value);
			return;
		}
		if ($src_trd_cur_upri.equalsIgnoreCase(name)) {
			src_trd_cur_upri(value);
			return;
		}
		if ($src_wtax_rate.equalsIgnoreCase(name)) {
			src_wtax_rate(value);
			return;
		}
		if ($src_tax_rate.equalsIgnoreCase(name)) {
			src_tax_rate(value);
			return;
		}
		if ($purc_prgrs.equalsIgnoreCase(name)) {
			purc_prgrs(value);
			return;
		}
		if ($cont_fctr_dec_place.equalsIgnoreCase(name)) {
			cont_fctr_dec_place(value);
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
		if ($old_trd_cur_upri.equalsIgnoreCase(name)) {
			old_trd_cur_upri(value);
			return;
		}
		if ($old_trd_cur_proc_upri.equalsIgnoreCase(name)) {
			old_trd_cur_proc_upri(value);
			return;
		}
		if ($old_trd_cur_onr_prov_upri.equalsIgnoreCase(name)) {
			old_trd_cur_onr_prov_upri(value);
			return;
		}
		if ($src_xrate.equalsIgnoreCase(name)) {
			src_xrate(value);
			return;
		}
		if ($base_cur_amt_dec_place.equalsIgnoreCase(name)) {
			base_cur_amt_dec_place(value);
			return;
		}
		if ($base_cur_upri_dec_place.equalsIgnoreCase(name)) {
			base_cur_upri_dec_place(value);
			return;
		}
		if ($src_ptax_xrate.equalsIgnoreCase(name)) {
			src_ptax_xrate(value);
			return;
		}
		if ($ptax_cur_amt_dec_place.equalsIgnoreCase(name)) {
			ptax_cur_amt_dec_place(value);
			return;
		}
		if ($ptax_cur_upri_dec_place.equalsIgnoreCase(name)) {
			ptax_cur_upri_dec_place(value);
			return;
		}
		if ($wtax_rate.equalsIgnoreCase(name)) {
			wtax_rate(value);
			return;
		}
		if ($pay_crryovr_times.equalsIgnoreCase(name)) {
			pay_crryovr_times(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($arr_pr_upd_cntr.equalsIgnoreCase(name)) {
			arr_pr_upd_cntr(value);
			return;
		}
		if ($purc_act_upd_cntr.equalsIgnoreCase(name)) {
			purc_act_upd_cntr(value);
			return;
		}
		if ($rcpt_iv_upd_cntr.equalsIgnoreCase(name)) {
			rcpt_iv_upd_cntr(value);
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
		if ($db_trd_cur_onr_prov_amt.equalsIgnoreCase(name)) {
			db_trd_cur_onr_prov_amt(value);
			return;
		}
		if ($db_trd_cur_onr_prov_upri.equalsIgnoreCase(name)) {
			db_trd_cur_onr_prov_upri(value);
			return;
		}
		if ($db_trd_cur_proc_amt.equalsIgnoreCase(name)) {
			db_trd_cur_proc_amt(value);
			return;
		}
		if ($db_trd_cur_proc_upri.equalsIgnoreCase(name)) {
			db_trd_cur_proc_upri(value);
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
		if ($purc_act_qty.equalsIgnoreCase(name)) {
			purc_act_qty(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($purc_act_seq.equalsIgnoreCase(name)) {
			purc_act_seq(value);
			return;
		}
		if ($purc_act_d_seq.equalsIgnoreCase(name)) {
			purc_act_d_seq(value);
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
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($src_trd_unit_conv_qty.equalsIgnoreCase(name)) {
			src_trd_unit_conv_qty(value);
			return;
		}
		if ($src_trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			src_trd_unit_conv_base_qty(value);
			return;
		}
		if ($src_trd_unit_dec_place.equalsIgnoreCase(name)) {
			src_trd_unit_dec_place(value);
			return;
		}
		if ($src_trd_unit_qty.equalsIgnoreCase(name)) {
			src_trd_unit_qty(value);
			return;
		}
		if ($src_trd_cur_amt.equalsIgnoreCase(name)) {
			src_trd_cur_amt(value);
			return;
		}
		if ($src_trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			src_trd_cur_dscnt_amt(value);
			return;
		}
		if ($src_trd_cur_onr_prov_amt.equalsIgnoreCase(name)) {
			src_trd_cur_onr_prov_amt(value);
			return;
		}
		if ($src_trd_cur_onr_prov_upri.equalsIgnoreCase(name)) {
			src_trd_cur_onr_prov_upri(value);
			return;
		}
		if ($src_trd_cur_proc_amt.equalsIgnoreCase(name)) {
			src_trd_cur_proc_amt(value);
			return;
		}
		if ($src_trd_cur_proc_upri.equalsIgnoreCase(name)) {
			src_trd_cur_proc_upri(value);
			return;
		}
		if ($src_trd_cur_tax_amt.equalsIgnoreCase(name)) {
			src_trd_cur_tax_amt(value);
			return;
		}
		if ($src_trd_cur_upri.equalsIgnoreCase(name)) {
			src_trd_cur_upri(value);
			return;
		}
		if ($src_wtax_rate.equalsIgnoreCase(name)) {
			src_wtax_rate(value);
			return;
		}
		if ($src_tax_rate.equalsIgnoreCase(name)) {
			src_tax_rate(value);
			return;
		}
		if ($purc_prgrs.equalsIgnoreCase(name)) {
			purc_prgrs(value);
			return;
		}
		if ($cont_fctr_dec_place.equalsIgnoreCase(name)) {
			cont_fctr_dec_place(value);
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
		if ($old_trd_cur_upri.equalsIgnoreCase(name)) {
			old_trd_cur_upri(value);
			return;
		}
		if ($old_trd_cur_proc_upri.equalsIgnoreCase(name)) {
			old_trd_cur_proc_upri(value);
			return;
		}
		if ($old_trd_cur_onr_prov_upri.equalsIgnoreCase(name)) {
			old_trd_cur_onr_prov_upri(value);
			return;
		}
		if ($src_xrate.equalsIgnoreCase(name)) {
			src_xrate(value);
			return;
		}
		if ($base_cur_amt_dec_place.equalsIgnoreCase(name)) {
			base_cur_amt_dec_place(value);
			return;
		}
		if ($base_cur_upri_dec_place.equalsIgnoreCase(name)) {
			base_cur_upri_dec_place(value);
			return;
		}
		if ($src_ptax_xrate.equalsIgnoreCase(name)) {
			src_ptax_xrate(value);
			return;
		}
		if ($ptax_cur_amt_dec_place.equalsIgnoreCase(name)) {
			ptax_cur_amt_dec_place(value);
			return;
		}
		if ($ptax_cur_upri_dec_place.equalsIgnoreCase(name)) {
			ptax_cur_upri_dec_place(value);
			return;
		}
		if ($wtax_rate.equalsIgnoreCase(name)) {
			wtax_rate(value);
			return;
		}
		if ($pay_crryovr_times.equalsIgnoreCase(name)) {
			pay_crryovr_times(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($arr_pr_upd_cntr.equalsIgnoreCase(name)) {
			arr_pr_upd_cntr(value);
			return;
		}
		if ($purc_act_upd_cntr.equalsIgnoreCase(name)) {
			purc_act_upd_cntr(value);
			return;
		}
		if ($rcpt_iv_upd_cntr.equalsIgnoreCase(name)) {
			rcpt_iv_upd_cntr(value);
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
		if ($db_trd_cur_onr_prov_amt.equalsIgnoreCase(name)) {
			db_trd_cur_onr_prov_amt(value);
			return;
		}
		if ($db_trd_cur_onr_prov_upri.equalsIgnoreCase(name)) {
			db_trd_cur_onr_prov_upri(value);
			return;
		}
		if ($db_trd_cur_proc_amt.equalsIgnoreCase(name)) {
			db_trd_cur_proc_amt(value);
			return;
		}
		if ($db_trd_cur_proc_upri.equalsIgnoreCase(name)) {
			db_trd_cur_proc_upri(value);
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
		if ($purc_act_qty.equalsIgnoreCase(name)) {
			purc_act_qty(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($purc_act_seq.equalsIgnoreCase(name)) {
			purc_act_seq(value);
			return;
		}
		if ($purc_act_d_seq.equalsIgnoreCase(name)) {
			purc_act_d_seq(value);
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
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($src_trd_unit_conv_qty.equalsIgnoreCase(name)) {
			src_trd_unit_conv_qty(value);
			return;
		}
		if ($src_trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			src_trd_unit_conv_base_qty(value);
			return;
		}
		if ($src_trd_unit_dec_place.equalsIgnoreCase(name)) {
			src_trd_unit_dec_place(value);
			return;
		}
		if ($src_trd_unit_qty.equalsIgnoreCase(name)) {
			src_trd_unit_qty(value);
			return;
		}
		if ($src_trd_cur_amt.equalsIgnoreCase(name)) {
			src_trd_cur_amt(value);
			return;
		}
		if ($src_trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			src_trd_cur_dscnt_amt(value);
			return;
		}
		if ($src_trd_cur_onr_prov_amt.equalsIgnoreCase(name)) {
			src_trd_cur_onr_prov_amt(value);
			return;
		}
		if ($src_trd_cur_onr_prov_upri.equalsIgnoreCase(name)) {
			src_trd_cur_onr_prov_upri(value);
			return;
		}
		if ($src_trd_cur_proc_amt.equalsIgnoreCase(name)) {
			src_trd_cur_proc_amt(value);
			return;
		}
		if ($src_trd_cur_proc_upri.equalsIgnoreCase(name)) {
			src_trd_cur_proc_upri(value);
			return;
		}
		if ($src_trd_cur_tax_amt.equalsIgnoreCase(name)) {
			src_trd_cur_tax_amt(value);
			return;
		}
		if ($src_trd_cur_upri.equalsIgnoreCase(name)) {
			src_trd_cur_upri(value);
			return;
		}
		if ($src_wtax_rate.equalsIgnoreCase(name)) {
			src_wtax_rate(value);
			return;
		}
		if ($src_tax_rate.equalsIgnoreCase(name)) {
			src_tax_rate(value);
			return;
		}
		if ($purc_prgrs.equalsIgnoreCase(name)) {
			purc_prgrs(value);
			return;
		}
		if ($cont_fctr_dec_place.equalsIgnoreCase(name)) {
			cont_fctr_dec_place(value);
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
		if ($old_trd_cur_upri.equalsIgnoreCase(name)) {
			old_trd_cur_upri(value);
			return;
		}
		if ($old_trd_cur_proc_upri.equalsIgnoreCase(name)) {
			old_trd_cur_proc_upri(value);
			return;
		}
		if ($old_trd_cur_onr_prov_upri.equalsIgnoreCase(name)) {
			old_trd_cur_onr_prov_upri(value);
			return;
		}
		if ($src_xrate.equalsIgnoreCase(name)) {
			src_xrate(value);
			return;
		}
		if ($base_cur_amt_dec_place.equalsIgnoreCase(name)) {
			base_cur_amt_dec_place(value);
			return;
		}
		if ($base_cur_upri_dec_place.equalsIgnoreCase(name)) {
			base_cur_upri_dec_place(value);
			return;
		}
		if ($src_ptax_xrate.equalsIgnoreCase(name)) {
			src_ptax_xrate(value);
			return;
		}
		if ($ptax_cur_amt_dec_place.equalsIgnoreCase(name)) {
			ptax_cur_amt_dec_place(value);
			return;
		}
		if ($ptax_cur_upri_dec_place.equalsIgnoreCase(name)) {
			ptax_cur_upri_dec_place(value);
			return;
		}
		if ($wtax_rate.equalsIgnoreCase(name)) {
			wtax_rate(value);
			return;
		}
		if ($pay_crryovr_times.equalsIgnoreCase(name)) {
			pay_crryovr_times(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($arr_pr_upd_cntr.equalsIgnoreCase(name)) {
			arr_pr_upd_cntr(value);
			return;
		}
		if ($purc_act_upd_cntr.equalsIgnoreCase(name)) {
			purc_act_upd_cntr(value);
			return;
		}
		if ($rcpt_iv_upd_cntr.equalsIgnoreCase(name)) {
			rcpt_iv_upd_cntr(value);
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
		if ($db_trd_cur_onr_prov_amt.equalsIgnoreCase(name)) {
			db_trd_cur_onr_prov_amt(value);
			return;
		}
		if ($db_trd_cur_onr_prov_upri.equalsIgnoreCase(name)) {
			db_trd_cur_onr_prov_upri(value);
			return;
		}
		if ($db_trd_cur_proc_amt.equalsIgnoreCase(name)) {
			db_trd_cur_proc_amt(value);
			return;
		}
		if ($db_trd_cur_proc_upri.equalsIgnoreCase(name)) {
			db_trd_cur_proc_upri(value);
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
		if ($purc_act_qty.equalsIgnoreCase(name)) {
			purc_act_qty(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($purc_act_seq.equalsIgnoreCase(name)) {
			purc_act_seq(value);
			return;
		}
		if ($purc_act_d_seq.equalsIgnoreCase(name)) {
			purc_act_d_seq(value);
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
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($src_trd_unit_conv_qty.equalsIgnoreCase(name)) {
			src_trd_unit_conv_qty(value);
			return;
		}
		if ($src_trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			src_trd_unit_conv_base_qty(value);
			return;
		}
		if ($src_trd_unit_dec_place.equalsIgnoreCase(name)) {
			src_trd_unit_dec_place(value);
			return;
		}
		if ($src_trd_unit_qty.equalsIgnoreCase(name)) {
			src_trd_unit_qty(value);
			return;
		}
		if ($src_trd_cur_amt.equalsIgnoreCase(name)) {
			src_trd_cur_amt(value);
			return;
		}
		if ($src_trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			src_trd_cur_dscnt_amt(value);
			return;
		}
		if ($src_trd_cur_onr_prov_amt.equalsIgnoreCase(name)) {
			src_trd_cur_onr_prov_amt(value);
			return;
		}
		if ($src_trd_cur_onr_prov_upri.equalsIgnoreCase(name)) {
			src_trd_cur_onr_prov_upri(value);
			return;
		}
		if ($src_trd_cur_proc_amt.equalsIgnoreCase(name)) {
			src_trd_cur_proc_amt(value);
			return;
		}
		if ($src_trd_cur_proc_upri.equalsIgnoreCase(name)) {
			src_trd_cur_proc_upri(value);
			return;
		}
		if ($src_trd_cur_tax_amt.equalsIgnoreCase(name)) {
			src_trd_cur_tax_amt(value);
			return;
		}
		if ($src_trd_cur_upri.equalsIgnoreCase(name)) {
			src_trd_cur_upri(value);
			return;
		}
		if ($src_wtax_rate.equalsIgnoreCase(name)) {
			src_wtax_rate(value);
			return;
		}
		if ($src_tax_rate.equalsIgnoreCase(name)) {
			src_tax_rate(value);
			return;
		}
		if ($purc_prgrs.equalsIgnoreCase(name)) {
			purc_prgrs(value);
			return;
		}
		if ($cont_fctr_dec_place.equalsIgnoreCase(name)) {
			cont_fctr_dec_place(value);
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
		if ($old_trd_cur_upri.equalsIgnoreCase(name)) {
			old_trd_cur_upri(value);
			return;
		}
		if ($old_trd_cur_proc_upri.equalsIgnoreCase(name)) {
			old_trd_cur_proc_upri(value);
			return;
		}
		if ($old_trd_cur_onr_prov_upri.equalsIgnoreCase(name)) {
			old_trd_cur_onr_prov_upri(value);
			return;
		}
		if ($src_xrate.equalsIgnoreCase(name)) {
			src_xrate(value);
			return;
		}
		if ($base_cur_amt_dec_place.equalsIgnoreCase(name)) {
			base_cur_amt_dec_place(value);
			return;
		}
		if ($base_cur_upri_dec_place.equalsIgnoreCase(name)) {
			base_cur_upri_dec_place(value);
			return;
		}
		if ($src_ptax_xrate.equalsIgnoreCase(name)) {
			src_ptax_xrate(value);
			return;
		}
		if ($ptax_cur_amt_dec_place.equalsIgnoreCase(name)) {
			ptax_cur_amt_dec_place(value);
			return;
		}
		if ($ptax_cur_upri_dec_place.equalsIgnoreCase(name)) {
			ptax_cur_upri_dec_place(value);
			return;
		}
		if ($wtax_rate.equalsIgnoreCase(name)) {
			wtax_rate(value);
			return;
		}
		if ($pay_crryovr_times.equalsIgnoreCase(name)) {
			pay_crryovr_times(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($arr_pr_upd_cntr.equalsIgnoreCase(name)) {
			arr_pr_upd_cntr(value);
			return;
		}
		if ($purc_act_upd_cntr.equalsIgnoreCase(name)) {
			purc_act_upd_cntr(value);
			return;
		}
		if ($rcpt_iv_upd_cntr.equalsIgnoreCase(name)) {
			rcpt_iv_upd_cntr(value);
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
		if ($db_trd_cur_onr_prov_amt.equalsIgnoreCase(name)) {
			db_trd_cur_onr_prov_amt(value);
			return;
		}
		if ($db_trd_cur_onr_prov_upri.equalsIgnoreCase(name)) {
			db_trd_cur_onr_prov_upri(value);
			return;
		}
		if ($db_trd_cur_proc_amt.equalsIgnoreCase(name)) {
			db_trd_cur_proc_amt(value);
			return;
		}
		if ($db_trd_cur_proc_upri.equalsIgnoreCase(name)) {
			db_trd_cur_proc_upri(value);
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
		if ($purc_act_qty.equalsIgnoreCase(name)) {
			purc_act_qty(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($purc_dt.equalsIgnoreCase(name)) {
			purc_dt(value);
			return;
		}
		if ($ac_ym.equalsIgnoreCase(name)) {
			ac_ym(value);
			return;
		}
		if ($pay_basis_dt.equalsIgnoreCase(name)) {
			pay_basis_dt(value);
			return;
		}
		if ($pay_schd_dt.equalsIgnoreCase(name)) {
			pay_schd_dt(value);
			return;
		}
		if ($purc_schd_dt.equalsIgnoreCase(name)) {
			purc_schd_dt(value);
			return;
		}
		if ($dlv_rqst_dt.equalsIgnoreCase(name)) {
			dlv_rqst_dt(value);
			return;
		}
		if ($arr_schd_dt.equalsIgnoreCase(name)) {
			arr_schd_dt(value);
			return;
		}
		if ($re_arr_purc_schd_dt.equalsIgnoreCase(name)) {
			re_arr_purc_schd_dt(value);
			return;
		}
		if ($slip_fr_valid_dt.equalsIgnoreCase(name)) {
			slip_fr_valid_dt(value);
			return;
		}
		if ($ptax_dt.equalsIgnoreCase(name)) {
			ptax_dt(value);
			return;
		}
		super.setDateNE(name, value);
	}
	public void setTimestampNE(String name, MCTimestamp value) {
		if ($ins_ts.equalsIgnoreCase(name)) {
			ins_ts(value);
			return;
		}
		if ($upd_ts.equalsIgnoreCase(name)) {
			upd_ts(value);
			return;
		}
		super.setTimestampNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($check.equalsIgnoreCase(name)) {
			check(value);
			return;
		}
		if ($hdr_readonly_flg.equalsIgnoreCase(name)) {
			hdr_readonly_flg(value);
			return;
		}
		if ($bef_abort_flg.equalsIgnoreCase(name)) {
			bef_abort_flg(value);
			return;
		}
		if ($abort_flg.equalsIgnoreCase(name)) {
			abort_flg(value);
			return;
		}
		if ($sync_flg.equalsIgnoreCase(name)) {
			sync_flg(value);
			return;
		}
		if ($purc_ddlv_flg.equalsIgnoreCase(name)) {
			purc_ddlv_flg(value);
			return;
		}
		if ($arr_skip_flg.equalsIgnoreCase(name)) {
			arr_skip_flg(value);
			return;
		}
		if ($schd_sync_flg.equalsIgnoreCase(name)) {
			schd_sync_flg(value);
			return;
		}
		if ($multi_io_flg.equalsIgnoreCase(name)) {
			multi_io_flg(value);
			return;
		}
		if ($arr_split_flg.equalsIgnoreCase(name)) {
			arr_split_flg(value);
			return;
		}
		if ($ver_flg.equalsIgnoreCase(name)) {
			ver_flg(value);
			return;
		}
		if ($sundry_itm_flg.equalsIgnoreCase(name)) {
			sundry_itm_flg(value);
			return;
		}
		if ($bp_lot_flg.equalsIgnoreCase(name)) {
			bp_lot_flg(value);
			return;
		}
		if ($dscnt_itm_flg.equalsIgnoreCase(name)) {
			dscnt_itm_flg(value);
			return;
		}
		if ($itm_purc_upri_cng_flg.equalsIgnoreCase(name)) {
			itm_purc_upri_cng_flg(value);
			return;
		}
		if ($pay_spot_flg.equalsIgnoreCase(name)) {
			pay_spot_flg(value);
			return;
		}
		if ($purc_upri_cng_flg.equalsIgnoreCase(name)) {
			purc_upri_cng_flg(value);
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
		if ($outsrc_flg.equalsIgnoreCase(name)) {
			outsrc_flg(value);
			return;
		}
		if ($accpt_dfct_flg.equalsIgnoreCase(name)) {
			accpt_dfct_flg(value);
			return;
		}
		if ($src_inc_tax_flg.equalsIgnoreCase(name)) {
			src_inc_tax_flg(value);
			return;
		}
		if ($re_arr_flg.equalsIgnoreCase(name)) {
			re_arr_flg(value);
			return;
		}
		if ($re_arr_str_ln_tgt_flg.equalsIgnoreCase(name)) {
			re_arr_str_ln_tgt_flg(value);
			return;
		}
		if ($re_arr_sync_flg.equalsIgnoreCase(name)) {
			re_arr_sync_flg(value);
			return;
		}
		if ($ncv_flg.equalsIgnoreCase(name)) {
			ncv_flg(value);
			return;
		}
		if ($in_to_str_ln_tgt_flg.equalsIgnoreCase(name)) {
			in_to_str_ln_tgt_flg(value);
			return;
		}
		if ($cst_iv_flg.equalsIgnoreCase(name)) {
			cst_iv_flg(value);
			return;
		}
		if ($cont_fctr_flg.equalsIgnoreCase(name)) {
			cont_fctr_flg(value);
			return;
		}
		if ($purc_dtl_upd_flg.equalsIgnoreCase(name)) {
			purc_dtl_upd_flg(value);
			return;
		}
		if ($temp_ap_flg.equalsIgnoreCase(name)) {
			temp_ap_flg(value);
			return;
		}
		if ($repurc_obli_flg.equalsIgnoreCase(name)) {
			repurc_obli_flg(value);
			return;
		}
		if ($old_interim_flg.equalsIgnoreCase(name)) {
			old_interim_flg(value);
			return;
		}
		if ($xrate_inpt_flg.equalsIgnoreCase(name)) {
			xrate_inpt_flg(value);
			return;
		}
		if ($ptax_xrate_inpt_flg.equalsIgnoreCase(name)) {
			ptax_xrate_inpt_flg(value);
			return;
		}
		if ($xpns_purc_flg.equalsIgnoreCase(name)) {
			xpns_purc_flg(value);
			return;
		}
		if ($ap_dpt_flg.equalsIgnoreCase(name)) {
			ap_dpt_flg(value);
			return;
		}
		if ($edi_flg.equalsIgnoreCase(name)) {
			edi_flg(value);
			return;
		}
		if ($db_inc_tax_flg.equalsIgnoreCase(name)) {
			db_inc_tax_flg(value);
			return;
		}
		if ($sls_sync_flg.equalsIgnoreCase(name)) {
			sls_sync_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}

	public MCRow getInnerRow(String name) {
		if ($ac_dt_p.equalsIgnoreCase(name)) {
			return ac_dt_p();
		}
		if ($can_ac_dt_p.equalsIgnoreCase(name)) {
			return can_ac_dt_p();
		}
		if ($itm_p.equalsIgnoreCase(name)) {
			return itm_p();
		}
		if ($itm_grp_p.equalsIgnoreCase(name)) {
			return itm_grp_p();
		}
		if ($sppl_addr_p.equalsIgnoreCase(name)) {
			return sppl_addr_p();
		}
		if ($sppl_grp_p.equalsIgnoreCase(name)) {
			return sppl_grp_p();
		}
		if ($trd_unit_qty_p.equalsIgnoreCase(name)) {
			return trd_unit_qty_p();
		}
		if ($base_unit_qty_p.equalsIgnoreCase(name)) {
			return base_unit_qty_p();
		}
		if ($base_unit_qty_bef_p.equalsIgnoreCase(name)) {
			return base_unit_qty_bef_p();
		}
		if ($po_qty_p.equalsIgnoreCase(name)) {
			return po_qty_p();
		}
		if ($arr_qty_p.equalsIgnoreCase(name)) {
			return arr_qty_p();
		}
		if ($purc_schd_qty_p.equalsIgnoreCase(name)) {
			return purc_schd_qty_p();
		}
		if ($purc_qty_p.equalsIgnoreCase(name)) {
			return purc_qty_p();
		}
		if ($accpt_dfct_qty_p.equalsIgnoreCase(name)) {
			return accpt_dfct_qty_p();
		}
		if ($abort_qty_p.equalsIgnoreCase(name)) {
			return abort_qty_p();
		}
		if ($re_arr_str_ln_p.equalsIgnoreCase(name)) {
			return re_arr_str_ln_p();
		}
		if ($re_arr_qty_p.equalsIgnoreCase(name)) {
			return re_arr_qty_p();
		}
		if ($re_arr_rqst_tm_p.equalsIgnoreCase(name)) {
			return re_arr_rqst_tm_p();
		}
		if ($sno_p.equalsIgnoreCase(name)) {
			return sno_p();
		}
		if ($in_to_str_ln_p.equalsIgnoreCase(name)) {
			return in_to_str_ln_p();
		}
		if ($dlv_p.equalsIgnoreCase(name)) {
			return dlv_p();
		}
		if ($tdlv_p.equalsIgnoreCase(name)) {
			return tdlv_p();
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
		if ($cont_qty_p.equalsIgnoreCase(name)) {
			return cont_qty_p();
		}
		if ($cont_fctr_unit_p.equalsIgnoreCase(name)) {
			return cont_fctr_unit_p();
		}
		if ($std_cont_fctr_p.equalsIgnoreCase(name)) {
			return std_cont_fctr_p();
		}
		if ($trd_upri_amt_p.equalsIgnoreCase(name)) {
			return trd_upri_amt_p();
		}
		if ($trd_cur_proc_upri_p.equalsIgnoreCase(name)) {
			return trd_cur_proc_upri_p();
		}
		if ($trd_cur_proc_amt_p.equalsIgnoreCase(name)) {
			return trd_cur_proc_amt_p();
		}
		if ($trd_cur_onr_prov_upri_p.equalsIgnoreCase(name)) {
			return trd_cur_onr_prov_upri_p();
		}
		if ($trd_cur_onr_prov_amt_p.equalsIgnoreCase(name)) {
			return trd_cur_onr_prov_amt_p();
		}
		if ($xrate_p.equalsIgnoreCase(name)) {
			return xrate_p();
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
		if ($base_cur_proc_upri_p.equalsIgnoreCase(name)) {
			return base_cur_proc_upri_p();
		}
		if ($base_cur_proc_amt_p.equalsIgnoreCase(name)) {
			return base_cur_proc_amt_p();
		}
		if ($base_cur_onr_prov_upri_p.equalsIgnoreCase(name)) {
			return base_cur_onr_prov_upri_p();
		}
		if ($base_cur_onr_prov_amt_p.equalsIgnoreCase(name)) {
			return base_cur_onr_prov_amt_p();
		}
		if ($prax_xrate_p.equalsIgnoreCase(name)) {
			return prax_xrate_p();
		}
		if ($ptax_cur_upri_p.equalsIgnoreCase(name)) {
			return ptax_cur_upri_p();
		}
		if ($ptax_cur_amt_p.equalsIgnoreCase(name)) {
			return ptax_cur_amt_p();
		}
		if ($ptax_cur_tax_amt_p.equalsIgnoreCase(name)) {
			return ptax_cur_tax_amt_p();
		}
		if ($ptax_cur_inc_tax_amt_p.equalsIgnoreCase(name)) {
			return ptax_cur_inc_tax_amt_p();
		}
		if ($ptax_cur_dscnt_amt_p.equalsIgnoreCase(name)) {
			return ptax_cur_dscnt_amt_p();
		}
		if ($ptax_cur_proc_upri_p.equalsIgnoreCase(name)) {
			return ptax_cur_proc_upri_p();
		}
		if ($ptax_cur_proc_amt_p.equalsIgnoreCase(name)) {
			return ptax_cur_proc_amt_p();
		}
		if ($ptax_cur_onr_prov_upri_p.equalsIgnoreCase(name)) {
			return ptax_cur_onr_prov_upri_p();
		}
		if ($ptax_cur_onr_prov_amt_p.equalsIgnoreCase(name)) {
			return ptax_cur_onr_prov_amt_p();
		}
		if ($wtax_amt_p.equalsIgnoreCase(name)) {
			return wtax_amt_p();
		}
		if ($usr_dpt_p.equalsIgnoreCase(name)) {
			return usr_dpt_p();
		}
		if ($bditm_p.equalsIgnoreCase(name)) {
			return bditm_p();
		}
		if ($rts_msg_p.equalsIgnoreCase(name)) {
			return rts_msg_p();
		}
		return super.getInnerRow(name);
	}

	public void setInnerRow(String name, MCRow value) {
		if ($ac_dt_p.equalsIgnoreCase(name)) {
			ac_dt_p(
				((MCContainerMeta) ac_dt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5220.AcDtR.class, value)
			);
			return;
		}
		if ($can_ac_dt_p.equalsIgnoreCase(name)) {
			can_ac_dt_p(
				((MCContainerMeta) can_ac_dt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5240.CanAcDtR.class, value)
			);
			return;
		}
		if ($itm_p.equalsIgnoreCase(name)) {
			itm_p(
				((MCContainerMeta) itm_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5030.ItmR.class, value)
			);
			return;
		}
		if ($itm_grp_p.equalsIgnoreCase(name)) {
			itm_grp_p(
				((MCContainerMeta) itm_grp_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5170.ItmGrpR.class, value)
			);
			return;
		}
		if ($sppl_addr_p.equalsIgnoreCase(name)) {
			sppl_addr_p(
				((MCContainerMeta) sppl_addr_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5360.AddrR.class, value)
			);
			return;
		}
		if ($sppl_grp_p.equalsIgnoreCase(name)) {
			sppl_grp_p(
				((MCContainerMeta) sppl_grp_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5190.BpGrpR.class, value)
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
		if ($base_unit_qty_bef_p.equalsIgnoreCase(name)) {
			base_unit_qty_bef_p(
				((MCContainerMeta) base_unit_qty_bef_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($po_qty_p.equalsIgnoreCase(name)) {
			po_qty_p(
				((MCContainerMeta) po_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($arr_qty_p.equalsIgnoreCase(name)) {
			arr_qty_p(
				((MCContainerMeta) arr_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($purc_schd_qty_p.equalsIgnoreCase(name)) {
			purc_schd_qty_p(
				((MCContainerMeta) purc_schd_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($purc_qty_p.equalsIgnoreCase(name)) {
			purc_qty_p(
				((MCContainerMeta) purc_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($accpt_dfct_qty_p.equalsIgnoreCase(name)) {
			accpt_dfct_qty_p(
				((MCContainerMeta) accpt_dfct_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($abort_qty_p.equalsIgnoreCase(name)) {
			abort_qty_p(
				((MCContainerMeta) abort_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($re_arr_str_ln_p.equalsIgnoreCase(name)) {
			re_arr_str_ln_p(
				((MCContainerMeta) re_arr_str_ln_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5120.StrLnR.class, value)
			);
			return;
		}
		if ($re_arr_qty_p.equalsIgnoreCase(name)) {
			re_arr_qty_p(
				((MCContainerMeta) re_arr_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($re_arr_rqst_tm_p.equalsIgnoreCase(name)) {
			re_arr_rqst_tm_p(
				((MCContainerMeta) re_arr_rqst_tm_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5320.YmdHmR.class, value)
			);
			return;
		}
		if ($sno_p.equalsIgnoreCase(name)) {
			sno_p(
				((MCContainerMeta) sno_p_META).castInnerRow(mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.class, value)
			);
			return;
		}
		if ($in_to_str_ln_p.equalsIgnoreCase(name)) {
			in_to_str_ln_p(
				((MCContainerMeta) in_to_str_ln_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5120.StrLnR.class, value)
			);
			return;
		}
		if ($dlv_p.equalsIgnoreCase(name)) {
			dlv_p(
				((MCContainerMeta) dlv_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5150.DlvR.class, value)
			);
			return;
		}
		if ($tdlv_p.equalsIgnoreCase(name)) {
			tdlv_p(
				((MCContainerMeta) tdlv_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5150.DlvR.class, value)
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
		if ($cont_qty_p.equalsIgnoreCase(name)) {
			cont_qty_p(
				((MCContainerMeta) cont_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5260.ContQtyR.class, value)
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
		if ($trd_upri_amt_p.equalsIgnoreCase(name)) {
			trd_upri_amt_p(
				((MCContainerMeta) trd_upri_amt_p_META).castInnerRow(mcframe.clientMSUB.MSUBP5070.TrdUpriAmtR.class, value)
			);
			return;
		}
		if ($trd_cur_proc_upri_p.equalsIgnoreCase(name)) {
			trd_cur_proc_upri_p(
				((MCContainerMeta) trd_cur_proc_upri_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5060.UpriR.class, value)
			);
			return;
		}
		if ($trd_cur_proc_amt_p.equalsIgnoreCase(name)) {
			trd_cur_proc_amt_p(
				((MCContainerMeta) trd_cur_proc_amt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5050.AmtR.class, value)
			);
			return;
		}
		if ($trd_cur_onr_prov_upri_p.equalsIgnoreCase(name)) {
			trd_cur_onr_prov_upri_p(
				((MCContainerMeta) trd_cur_onr_prov_upri_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5060.UpriR.class, value)
			);
			return;
		}
		if ($trd_cur_onr_prov_amt_p.equalsIgnoreCase(name)) {
			trd_cur_onr_prov_amt_p(
				((MCContainerMeta) trd_cur_onr_prov_amt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5050.AmtR.class, value)
			);
			return;
		}
		if ($xrate_p.equalsIgnoreCase(name)) {
			xrate_p(
				((MCContainerMeta) xrate_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5390.XrateR.class, value)
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
		if ($base_cur_proc_upri_p.equalsIgnoreCase(name)) {
			base_cur_proc_upri_p(
				((MCContainerMeta) base_cur_proc_upri_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5060.UpriR.class, value)
			);
			return;
		}
		if ($base_cur_proc_amt_p.equalsIgnoreCase(name)) {
			base_cur_proc_amt_p(
				((MCContainerMeta) base_cur_proc_amt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5050.AmtR.class, value)
			);
			return;
		}
		if ($base_cur_onr_prov_upri_p.equalsIgnoreCase(name)) {
			base_cur_onr_prov_upri_p(
				((MCContainerMeta) base_cur_onr_prov_upri_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5060.UpriR.class, value)
			);
			return;
		}
		if ($base_cur_onr_prov_amt_p.equalsIgnoreCase(name)) {
			base_cur_onr_prov_amt_p(
				((MCContainerMeta) base_cur_onr_prov_amt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5050.AmtR.class, value)
			);
			return;
		}
		if ($prax_xrate_p.equalsIgnoreCase(name)) {
			prax_xrate_p(
				((MCContainerMeta) prax_xrate_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5390.XrateR.class, value)
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
		if ($ptax_cur_tax_amt_p.equalsIgnoreCase(name)) {
			ptax_cur_tax_amt_p(
				((MCContainerMeta) ptax_cur_tax_amt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5050.AmtR.class, value)
			);
			return;
		}
		if ($ptax_cur_inc_tax_amt_p.equalsIgnoreCase(name)) {
			ptax_cur_inc_tax_amt_p(
				((MCContainerMeta) ptax_cur_inc_tax_amt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5050.AmtR.class, value)
			);
			return;
		}
		if ($ptax_cur_dscnt_amt_p.equalsIgnoreCase(name)) {
			ptax_cur_dscnt_amt_p(
				((MCContainerMeta) ptax_cur_dscnt_amt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5050.AmtR.class, value)
			);
			return;
		}
		if ($ptax_cur_proc_upri_p.equalsIgnoreCase(name)) {
			ptax_cur_proc_upri_p(
				((MCContainerMeta) ptax_cur_proc_upri_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5060.UpriR.class, value)
			);
			return;
		}
		if ($ptax_cur_proc_amt_p.equalsIgnoreCase(name)) {
			ptax_cur_proc_amt_p(
				((MCContainerMeta) ptax_cur_proc_amt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5050.AmtR.class, value)
			);
			return;
		}
		if ($ptax_cur_onr_prov_upri_p.equalsIgnoreCase(name)) {
			ptax_cur_onr_prov_upri_p(
				((MCContainerMeta) ptax_cur_onr_prov_upri_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5060.UpriR.class, value)
			);
			return;
		}
		if ($ptax_cur_onr_prov_amt_p.equalsIgnoreCase(name)) {
			ptax_cur_onr_prov_amt_p(
				((MCContainerMeta) ptax_cur_onr_prov_amt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5050.AmtR.class, value)
			);
			return;
		}
		if ($wtax_amt_p.equalsIgnoreCase(name)) {
			wtax_amt_p(
				((MCContainerMeta) wtax_amt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5050.AmtR.class, value)
			);
			return;
		}
		if ($usr_dpt_p.equalsIgnoreCase(name)) {
			usr_dpt_p(
				((MCContainerMeta) usr_dpt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5230.UsrDptR.class, value)
			);
			return;
		}
		if ($bditm_p.equalsIgnoreCase(name)) {
			bditm_p(
				((MCContainerMeta) bditm_p_META).castInnerRow(mcframe.clientMSUB.MSUBP5040.BdItemR.class, value)
			);
			return;
		}
		if ($rts_msg_p.equalsIgnoreCase(name)) {
			rts_msg_p(
				((MCContainerMeta) rts_msg_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5310.RtnMsgR.class, value)
			);
			return;
		}
		super.setInnerRow(name, value);
	}


	/**
	 * Recording date 計上日.<p>
	 *
	 */
	public MCDate ac_dt() {
		return ac_dt_p().ac_dt();
	}

	/**
	 * Recording date 計上日.<p>
	 *
	 */
	public void ac_dt(MCDate value) {
		ac_dt_p().ac_dt(value);
	}

	public MCDate can_ac_dt_for_input() {
		return can_ac_dt_p().can_ac_dt_for_input();
	}

	public void can_ac_dt_for_input(MCDate value) {
		can_ac_dt_p().can_ac_dt_for_input(value);
	}

	public MCDate can_ac_dt() {
		return can_ac_dt_p().can_ac_dt_for_call();
	}

	public void can_ac_dt(MCDate value) {
		can_ac_dt_p().can_ac_dt_for_call(value);
	}

	public MCDate ac_dt_after_srch() {
		return can_ac_dt_p().ac_dt_after_srch();
	}

	public void ac_dt_after_srch(MCDate value) {
		can_ac_dt_p().ac_dt_after_srch(value);
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

	public String itm_grp_cd1() {
		return itm_grp_p().itm_grp_cd1();
	}

	public void itm_grp_cd1(String value) {
		itm_grp_p().itm_grp_cd1(value);
	}

	public String itm_grp_nm1() {
		return itm_grp_p().itm_grp_nm1();
	}

	public void itm_grp_nm1(String value) {
		itm_grp_p().itm_grp_nm1(value);
	}

	public String itm_grp_cd2() {
		return itm_grp_p().itm_grp_cd2();
	}

	public void itm_grp_cd2(String value) {
		itm_grp_p().itm_grp_cd2(value);
	}

	public String itm_grp_nm2() {
		return itm_grp_p().itm_grp_nm2();
	}

	public void itm_grp_nm2(String value) {
		itm_grp_p().itm_grp_nm2(value);
	}

	public String itm_grp_cd3() {
		return itm_grp_p().itm_grp_cd3();
	}

	public void itm_grp_cd3(String value) {
		itm_grp_p().itm_grp_cd3(value);
	}

	public String itm_grp_nm3() {
		return itm_grp_p().itm_grp_nm3();
	}

	public void itm_grp_nm3(String value) {
		itm_grp_p().itm_grp_nm3(value);
	}

	public String itm_grp_cd4() {
		return itm_grp_p().itm_grp_cd4();
	}

	public void itm_grp_cd4(String value) {
		itm_grp_p().itm_grp_cd4(value);
	}

	public String itm_grp_nm4() {
		return itm_grp_p().itm_grp_nm4();
	}

	public void itm_grp_nm4(String value) {
		itm_grp_p().itm_grp_nm4(value);
	}

	public String itm_grp_cd5() {
		return itm_grp_p().itm_grp_cd5();
	}

	public void itm_grp_cd5(String value) {
		itm_grp_p().itm_grp_cd5(value);
	}

	public String itm_grp_nm5() {
		return itm_grp_p().itm_grp_nm5();
	}

	public void itm_grp_nm5(String value) {
		itm_grp_p().itm_grp_nm5(value);
	}

	public String itm_grp_cd6() {
		return itm_grp_p().itm_grp_cd6();
	}

	public void itm_grp_cd6(String value) {
		itm_grp_p().itm_grp_cd6(value);
	}

	public String itm_grp_nm6() {
		return itm_grp_p().itm_grp_nm6();
	}

	public void itm_grp_nm6(String value) {
		itm_grp_p().itm_grp_nm6(value);
	}

	public String itm_grp_cd7() {
		return itm_grp_p().itm_grp_cd7();
	}

	public void itm_grp_cd7(String value) {
		itm_grp_p().itm_grp_cd7(value);
	}

	public String itm_grp_nm7() {
		return itm_grp_p().itm_grp_nm7();
	}

	public void itm_grp_nm7(String value) {
		itm_grp_p().itm_grp_nm7(value);
	}

	public String itm_grp_cd8() {
		return itm_grp_p().itm_grp_cd8();
	}

	public void itm_grp_cd8(String value) {
		itm_grp_p().itm_grp_cd8(value);
	}

	public String itm_grp_nm8() {
		return itm_grp_p().itm_grp_nm8();
	}

	public void itm_grp_nm8(String value) {
		itm_grp_p().itm_grp_nm8(value);
	}

	public String itm_grp_cd9() {
		return itm_grp_p().itm_grp_cd9();
	}

	public void itm_grp_cd9(String value) {
		itm_grp_p().itm_grp_cd9(value);
	}

	public String itm_grp_nm9() {
		return itm_grp_p().itm_grp_nm9();
	}

	public void itm_grp_nm9(String value) {
		itm_grp_p().itm_grp_nm9(value);
	}

	public String itm_grp_cd10() {
		return itm_grp_p().itm_grp_cd10();
	}

	public void itm_grp_cd10(String value) {
		itm_grp_p().itm_grp_cd10(value);
	}

	public String itm_grp_nm10() {
		return itm_grp_p().itm_grp_nm10();
	}

	public void itm_grp_nm10(String value) {
		itm_grp_p().itm_grp_nm10(value);
	}

	/**
	 * Country cd. 国ＣＤ.<p>
	 *
	 */
	public String sppl_cntry_cd() {
		return sppl_addr_p().cntry_cd();
	}

	/**
	 * Country cd. 国ＣＤ.<p>
	 *
	 */
	public void sppl_cntry_cd(String value) {
		sppl_addr_p().cntry_cd(value);
	}

	/**
	 * Country name 国名.<p>
	 *
	 */
	public String sppl_cntry_nm() {
		return sppl_addr_p().cntry_nm();
	}

	/**
	 * Country name 国名.<p>
	 *
	 */
	public void sppl_cntry_nm(String value) {
		sppl_addr_p().cntry_nm(value);
	}

	/**
	 * Supplier zip code 発注先郵便番号.<p>
	 *
	 */
	public String sppl_zip_cd() {
		return sppl_addr_p().zip_cd();
	}

	/**
	 * Supplier zip code 発注先郵便番号.<p>
	 *
	 */
	public void sppl_zip_cd(String value) {
		sppl_addr_p().zip_cd(value);
	}

	/**
	 * Supplier address 1 発注先住所１.<p>
	 *
	 */
	public String sppl_addr1() {
		return sppl_addr_p().addr1();
	}

	/**
	 * Supplier address 1 発注先住所１.<p>
	 *
	 */
	public void sppl_addr1(String value) {
		sppl_addr_p().addr1(value);
	}

	/**
	 * Supplier address 2 発注先住所２.<p>
	 *
	 */
	public String sppl_addr2() {
		return sppl_addr_p().addr2();
	}

	/**
	 * Supplier address 2 発注先住所２.<p>
	 *
	 */
	public void sppl_addr2(String value) {
		sppl_addr_p().addr2(value);
	}

	/**
	 * Supplier address 3 発注先住所３.<p>
	 *
	 */
	public String sppl_addr3() {
		return sppl_addr_p().addr3();
	}

	/**
	 * Supplier address 3 発注先住所３.<p>
	 *
	 */
	public void sppl_addr3(String value) {
		sppl_addr_p().addr3(value);
	}

	/**
	 * Supplier address 4 発注先住所４.<p>
	 *
	 */
	public String sppl_addr4() {
		return sppl_addr_p().addr4();
	}

	/**
	 * Supplier address 4 発注先住所４.<p>
	 *
	 */
	public void sppl_addr4(String value) {
		sppl_addr_p().addr4(value);
	}

	/**
	 * Supplier TEL 発注先ＴＥＬ.<p>
	 *
	 */
	public String sppl_tel() {
		return sppl_addr_p().tel();
	}

	/**
	 * Supplier TEL 発注先ＴＥＬ.<p>
	 *
	 */
	public void sppl_tel(String value) {
		sppl_addr_p().tel(value);
	}

	/**
	 * Supplier FAX 発注先ＦＡＸ.<p>
	 *
	 */
	public String sppl_fax() {
		return sppl_addr_p().fax();
	}

	/**
	 * Supplier FAX 発注先ＦＡＸ.<p>
	 *
	 */
	public void sppl_fax(String value) {
		sppl_addr_p().fax(value);
	}

	/**
	 * Supplier dept. 発注先部署.<p>
	 *
	 */
	public String sppl_cntct_dpt() {
		return sppl_addr_p().cntct_dpt();
	}

	/**
	 * Supplier dept. 発注先部署.<p>
	 *
	 */
	public void sppl_cntct_dpt(String value) {
		sppl_addr_p().cntct_dpt(value);
	}

	/**
	 * Supplier PIC 発注先担当者.<p>
	 *
	 */
	public String sppl_cntct_psn() {
		return sppl_addr_p().cntct_psn();
	}

	/**
	 * Supplier PIC 発注先担当者.<p>
	 *
	 */
	public void sppl_cntct_psn(String value) {
		sppl_addr_p().cntct_psn(value);
	}

	/**
	 * Supplier classification cd. 1 発注先分類ＣＤ１.<p>
	 *
	 */
	public String sppl_grp_cd1() {
		return sppl_grp_p().bp_grp_cd1();
	}

	/**
	 * Supplier classification cd. 1 発注先分類ＣＤ１.<p>
	 *
	 */
	public void sppl_grp_cd1(String value) {
		sppl_grp_p().bp_grp_cd1(value);
	}

	/**
	 * Supplier classification name 1 発注先分類名１.<p>
	 *
	 */
	public String sppl_grp_nm1() {
		return sppl_grp_p().bp_grp_nm1();
	}

	/**
	 * Supplier classification name 1 発注先分類名１.<p>
	 *
	 */
	public void sppl_grp_nm1(String value) {
		sppl_grp_p().bp_grp_nm1(value);
	}

	/**
	 * Supplier classification cd. 2 発注先分類ＣＤ２.<p>
	 *
	 */
	public String sppl_grp_cd2() {
		return sppl_grp_p().bp_grp_cd2();
	}

	/**
	 * Supplier classification cd. 2 発注先分類ＣＤ２.<p>
	 *
	 */
	public void sppl_grp_cd2(String value) {
		sppl_grp_p().bp_grp_cd2(value);
	}

	/**
	 * Supplier classification name 2 発注先分類名２.<p>
	 *
	 */
	public String sppl_grp_nm2() {
		return sppl_grp_p().bp_grp_nm2();
	}

	/**
	 * Supplier classification name 2 発注先分類名２.<p>
	 *
	 */
	public void sppl_grp_nm2(String value) {
		sppl_grp_p().bp_grp_nm2(value);
	}

	/**
	 * Supplier classification cd. 3 発注先分類ＣＤ３.<p>
	 *
	 */
	public String sppl_grp_cd3() {
		return sppl_grp_p().bp_grp_cd3();
	}

	/**
	 * Supplier classification cd. 3 発注先分類ＣＤ３.<p>
	 *
	 */
	public void sppl_grp_cd3(String value) {
		sppl_grp_p().bp_grp_cd3(value);
	}

	/**
	 * Supplier classification name 3 発注先分類名３.<p>
	 *
	 */
	public String sppl_grp_nm3() {
		return sppl_grp_p().bp_grp_nm3();
	}

	/**
	 * Supplier classification name 3 発注先分類名３.<p>
	 *
	 */
	public void sppl_grp_nm3(String value) {
		sppl_grp_p().bp_grp_nm3(value);
	}

	/**
	 * Supplier classification cd. 4 発注先分類ＣＤ４.<p>
	 *
	 */
	public String sppl_grp_cd4() {
		return sppl_grp_p().bp_grp_cd4();
	}

	/**
	 * Supplier classification cd. 4 発注先分類ＣＤ４.<p>
	 *
	 */
	public void sppl_grp_cd4(String value) {
		sppl_grp_p().bp_grp_cd4(value);
	}

	/**
	 * Supplier classification name 4 発注先分類名４.<p>
	 *
	 */
	public String sppl_grp_nm4() {
		return sppl_grp_p().bp_grp_nm4();
	}

	/**
	 * Supplier classification name 4 発注先分類名４.<p>
	 *
	 */
	public void sppl_grp_nm4(String value) {
		sppl_grp_p().bp_grp_nm4(value);
	}

	/**
	 * Supplier classification cd. 5 発注先分類ＣＤ５.<p>
	 *
	 */
	public String sppl_grp_cd5() {
		return sppl_grp_p().bp_grp_cd5();
	}

	/**
	 * Supplier classification cd. 5 発注先分類ＣＤ５.<p>
	 *
	 */
	public void sppl_grp_cd5(String value) {
		sppl_grp_p().bp_grp_cd5(value);
	}

	/**
	 * Supplier classification name 5 発注先分類名５.<p>
	 *
	 */
	public String sppl_grp_nm5() {
		return sppl_grp_p().bp_grp_nm5();
	}

	/**
	 * Supplier classification name 5 発注先分類名５.<p>
	 *
	 */
	public void sppl_grp_nm5(String value) {
		sppl_grp_p().bp_grp_nm5(value);
	}

	/**
	 * Supplier classification cd. 6 発注先分類ＣＤ６.<p>
	 *
	 */
	public String sppl_grp_cd6() {
		return sppl_grp_p().bp_grp_cd6();
	}

	/**
	 * Supplier classification cd. 6 発注先分類ＣＤ６.<p>
	 *
	 */
	public void sppl_grp_cd6(String value) {
		sppl_grp_p().bp_grp_cd6(value);
	}

	/**
	 * Supplier classification name 6 発注先分類名６.<p>
	 *
	 */
	public String sppl_grp_nm6() {
		return sppl_grp_p().bp_grp_nm6();
	}

	/**
	 * Supplier classification name 6 発注先分類名６.<p>
	 *
	 */
	public void sppl_grp_nm6(String value) {
		sppl_grp_p().bp_grp_nm6(value);
	}

	/**
	 * Supplier classification cd. 7 発注先分類ＣＤ７.<p>
	 *
	 */
	public String sppl_grp_cd7() {
		return sppl_grp_p().bp_grp_cd7();
	}

	/**
	 * Supplier classification cd. 7 発注先分類ＣＤ７.<p>
	 *
	 */
	public void sppl_grp_cd7(String value) {
		sppl_grp_p().bp_grp_cd7(value);
	}

	/**
	 * Supplier classification name 7 発注先分類名７.<p>
	 *
	 */
	public String sppl_grp_nm7() {
		return sppl_grp_p().bp_grp_nm7();
	}

	/**
	 * Supplier classification name 7 発注先分類名７.<p>
	 *
	 */
	public void sppl_grp_nm7(String value) {
		sppl_grp_p().bp_grp_nm7(value);
	}

	/**
	 * Supplier classification cd. 8 発注先分類ＣＤ８.<p>
	 *
	 */
	public String sppl_grp_cd8() {
		return sppl_grp_p().bp_grp_cd8();
	}

	/**
	 * Supplier classification cd. 8 発注先分類ＣＤ８.<p>
	 *
	 */
	public void sppl_grp_cd8(String value) {
		sppl_grp_p().bp_grp_cd8(value);
	}

	/**
	 * Supplier classification name 8 発注先分類名８.<p>
	 *
	 */
	public String sppl_grp_nm8() {
		return sppl_grp_p().bp_grp_nm8();
	}

	/**
	 * Supplier classification name 8 発注先分類名８.<p>
	 *
	 */
	public void sppl_grp_nm8(String value) {
		sppl_grp_p().bp_grp_nm8(value);
	}

	/**
	 * Supplier classification cd. 9 発注先分類ＣＤ９.<p>
	 *
	 */
	public String sppl_grp_cd9() {
		return sppl_grp_p().bp_grp_cd9();
	}

	/**
	 * Supplier classification cd. 9 発注先分類ＣＤ９.<p>
	 *
	 */
	public void sppl_grp_cd9(String value) {
		sppl_grp_p().bp_grp_cd9(value);
	}

	/**
	 * Supplier classification name 9 発注先分類名９.<p>
	 *
	 */
	public String sppl_grp_nm9() {
		return sppl_grp_p().bp_grp_nm9();
	}

	/**
	 * Supplier classification name 9 発注先分類名９.<p>
	 *
	 */
	public void sppl_grp_nm9(String value) {
		sppl_grp_p().bp_grp_nm9(value);
	}

	/**
	 * Supplier classification cd. 10 発注先分類ＣＤ１０.<p>
	 *
	 */
	public String sppl_grp_cd10() {
		return sppl_grp_p().bp_grp_cd10();
	}

	/**
	 * Supplier classification cd. 10 発注先分類ＣＤ１０.<p>
	 *
	 */
	public void sppl_grp_cd10(String value) {
		sppl_grp_p().bp_grp_cd10(value);
	}

	/**
	 * Supplier classification name 10 発注先分類名１０.<p>
	 *
	 */
	public String sppl_grp_nm10() {
		return sppl_grp_p().bp_grp_nm10();
	}

	/**
	 * Supplier classification name 10 発注先分類名１０.<p>
	 *
	 */
	public void sppl_grp_nm10(String value) {
		sppl_grp_p().bp_grp_nm10(value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public MCNumber trd_unit_qty() {
		return trd_unit_qty_p().qty();
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void trd_unit_qty(MCNumber value) {
		trd_unit_qty_p().qty(value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void trd_unit_qty(int value) {
		trd_unit_qty_p().qty(value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void trd_unit_qty(long value) {
		trd_unit_qty_p().qty(value);
	}

	/**
	 * Quantity 数量.<p>
	 *
	 */
	public void trd_unit_qty(float value) {
		trd_unit_qty_p().qty(value);
	}

	/**
	 * Quantity 数量.<p>
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
	 * Before change base unit qty. 変更前基準単位数量.<p>
	 *
	 */
	public MCNumber base_unit_qty_bef() {
		return base_unit_qty_bef_p().qty();
	}

	/**
	 * Before change base unit qty. 変更前基準単位数量.<p>
	 *
	 */
	public void base_unit_qty_bef(MCNumber value) {
		base_unit_qty_bef_p().qty(value);
	}

	/**
	 * Before change base unit qty. 変更前基準単位数量.<p>
	 *
	 */
	public void base_unit_qty_bef(int value) {
		base_unit_qty_bef_p().qty(value);
	}

	/**
	 * Before change base unit qty. 変更前基準単位数量.<p>
	 *
	 */
	public void base_unit_qty_bef(long value) {
		base_unit_qty_bef_p().qty(value);
	}

	/**
	 * Before change base unit qty. 変更前基準単位数量.<p>
	 *
	 */
	public void base_unit_qty_bef(float value) {
		base_unit_qty_bef_p().qty(value);
	}

	/**
	 * Before change base unit qty. 変更前基準単位数量.<p>
	 *
	 */
	public void base_unit_qty_bef(double value) {
		base_unit_qty_bef_p().qty(value);
	}

	/**
	 * PO qty. 発注数量.<p>
	 *
	 */
	public MCNumber po_qty() {
		return po_qty_p().qty();
	}

	/**
	 * PO qty. 発注数量.<p>
	 *
	 */
	public void po_qty(MCNumber value) {
		po_qty_p().qty(value);
	}

	/**
	 * PO qty. 発注数量.<p>
	 *
	 */
	public void po_qty(int value) {
		po_qty_p().qty(value);
	}

	/**
	 * PO qty. 発注数量.<p>
	 *
	 */
	public void po_qty(long value) {
		po_qty_p().qty(value);
	}

	/**
	 * PO qty. 発注数量.<p>
	 *
	 */
	public void po_qty(float value) {
		po_qty_p().qty(value);
	}

	/**
	 * PO qty. 発注数量.<p>
	 *
	 */
	public void po_qty(double value) {
		po_qty_p().qty(value);
	}

	/**
	 * Received qty. 入荷済数量.<p>
	 *
	 */
	public MCNumber arr_qty() {
		return arr_qty_p().qty();
	}

	/**
	 * Received qty. 入荷済数量.<p>
	 *
	 */
	public void arr_qty(MCNumber value) {
		arr_qty_p().qty(value);
	}

	/**
	 * Received qty. 入荷済数量.<p>
	 *
	 */
	public void arr_qty(int value) {
		arr_qty_p().qty(value);
	}

	/**
	 * Received qty. 入荷済数量.<p>
	 *
	 */
	public void arr_qty(long value) {
		arr_qty_p().qty(value);
	}

	/**
	 * Received qty. 入荷済数量.<p>
	 *
	 */
	public void arr_qty(float value) {
		arr_qty_p().qty(value);
	}

	/**
	 * Received qty. 入荷済数量.<p>
	 *
	 */
	public void arr_qty(double value) {
		arr_qty_p().qty(value);
	}

	/**
	 * Scheduled purchase qty. 仕入予定数量.<p>
	 *
	 */
	public MCNumber purc_schd_qty() {
		return purc_schd_qty_p().qty();
	}

	/**
	 * Scheduled purchase qty. 仕入予定数量.<p>
	 *
	 */
	public void purc_schd_qty(MCNumber value) {
		purc_schd_qty_p().qty(value);
	}

	/**
	 * Scheduled purchase qty. 仕入予定数量.<p>
	 *
	 */
	public void purc_schd_qty(int value) {
		purc_schd_qty_p().qty(value);
	}

	/**
	 * Scheduled purchase qty. 仕入予定数量.<p>
	 *
	 */
	public void purc_schd_qty(long value) {
		purc_schd_qty_p().qty(value);
	}

	/**
	 * Scheduled purchase qty. 仕入予定数量.<p>
	 *
	 */
	public void purc_schd_qty(float value) {
		purc_schd_qty_p().qty(value);
	}

	/**
	 * Scheduled purchase qty. 仕入予定数量.<p>
	 *
	 */
	public void purc_schd_qty(double value) {
		purc_schd_qty_p().qty(value);
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
	 * Acceptance defective qty. 検収不良数量.<p>
	 *
	 */
	public MCNumber accpt_dfct_qty() {
		return accpt_dfct_qty_p().qty();
	}

	/**
	 * Acceptance defective qty. 検収不良数量.<p>
	 *
	 */
	public void accpt_dfct_qty(MCNumber value) {
		accpt_dfct_qty_p().qty(value);
	}

	/**
	 * Acceptance defective qty. 検収不良数量.<p>
	 *
	 */
	public void accpt_dfct_qty(int value) {
		accpt_dfct_qty_p().qty(value);
	}

	/**
	 * Acceptance defective qty. 検収不良数量.<p>
	 *
	 */
	public void accpt_dfct_qty(long value) {
		accpt_dfct_qty_p().qty(value);
	}

	/**
	 * Acceptance defective qty. 検収不良数量.<p>
	 *
	 */
	public void accpt_dfct_qty(float value) {
		accpt_dfct_qty_p().qty(value);
	}

	/**
	 * Acceptance defective qty. 検収不良数量.<p>
	 *
	 */
	public void accpt_dfct_qty(double value) {
		accpt_dfct_qty_p().qty(value);
	}

	/**
	 * Cancelled remaining qty. 打切数量.<p>
	 *
	 */
	public MCNumber abort_qty() {
		return abort_qty_p().qty();
	}

	/**
	 * Cancelled remaining qty. 打切数量.<p>
	 *
	 */
	public void abort_qty(MCNumber value) {
		abort_qty_p().qty(value);
	}

	/**
	 * Cancelled remaining qty. 打切数量.<p>
	 *
	 */
	public void abort_qty(int value) {
		abort_qty_p().qty(value);
	}

	/**
	 * Cancelled remaining qty. 打切数量.<p>
	 *
	 */
	public void abort_qty(long value) {
		abort_qty_p().qty(value);
	}

	/**
	 * Cancelled remaining qty. 打切数量.<p>
	 *
	 */
	public void abort_qty(float value) {
		abort_qty_p().qty(value);
	}

	/**
	 * Cancelled remaining qty. 打切数量.<p>
	 *
	 */
	public void abort_qty(double value) {
		abort_qty_p().qty(value);
	}

	/**
	 * Re-receipt rack/line cd. 再入荷棚・ラインＣＤ.<p>
	 *
	 */
	public String re_arr_str_ln_cd() {
		return re_arr_str_ln_p().str_ln_cd();
	}

	/**
	 * Re-receipt rack/line cd. 再入荷棚・ラインＣＤ.<p>
	 *
	 */
	public void re_arr_str_ln_cd(String value) {
		re_arr_str_ln_p().str_ln_cd(value);
	}

	/**
	 * Re-receipt rack/line name 再入荷棚・ライン名.<p>
	 *
	 */
	public String re_arr_str_ln_nm() {
		return re_arr_str_ln_p().str_ln_nm();
	}

	/**
	 * Re-receipt rack/line name 再入荷棚・ライン名.<p>
	 *
	 */
	public void re_arr_str_ln_nm(String value) {
		re_arr_str_ln_p().str_ln_nm(value);
	}

	/**
	 * Re-receipt (Without rack/line) 再入荷棚・ライン無.<p>
	 *
	 */
	public boolean re_arr_str_ln_cd_none_flg() {
		return re_arr_str_ln_p().str_ln_cd_none_flg();
	}

	/**
	 * Re-receipt (Without rack/line) 再入荷棚・ライン無.<p>
	 *
	 */
	public void re_arr_str_ln_cd_none_flg(boolean value) {
		re_arr_str_ln_p().str_ln_cd_none_flg(value);
	}

	/**
	 * Re-receipt qty. 再入荷数量.<p>
	 *
	 */
	public MCNumber trd_unit_re_arr_qty() {
		return re_arr_qty_p().qty();
	}

	/**
	 * Re-receipt qty. 再入荷数量.<p>
	 *
	 */
	public void trd_unit_re_arr_qty(MCNumber value) {
		re_arr_qty_p().qty(value);
	}

	/**
	 * Re-receipt qty. 再入荷数量.<p>
	 *
	 */
	public void trd_unit_re_arr_qty(int value) {
		re_arr_qty_p().qty(value);
	}

	/**
	 * Re-receipt qty. 再入荷数量.<p>
	 *
	 */
	public void trd_unit_re_arr_qty(long value) {
		re_arr_qty_p().qty(value);
	}

	/**
	 * Re-receipt qty. 再入荷数量.<p>
	 *
	 */
	public void trd_unit_re_arr_qty(float value) {
		re_arr_qty_p().qty(value);
	}

	/**
	 * Re-receipt qty. 再入荷数量.<p>
	 *
	 */
	public void trd_unit_re_arr_qty(double value) {
		re_arr_qty_p().qty(value);
	}

	/**
	 * Desired re-receipt date 再入荷希望日.<p>
	 *
	 */
	public MCDate re_arr_rqst_dt() {
		return re_arr_rqst_tm_p().ymd();
	}

	/**
	 * Desired re-receipt date 再入荷希望日.<p>
	 *
	 */
	public void re_arr_rqst_dt(MCDate value) {
		re_arr_rqst_tm_p().ymd(value);
	}

	/**
	 * Desired re-receipt time 再入荷希望時刻.<p>
	 *
	 */
	public MCDate re_arr_rqst_hm() {
		return re_arr_rqst_tm_p().hm();
	}

	/**
	 * Desired re-receipt time 再入荷希望時刻.<p>
	 *
	 */
	public void re_arr_rqst_hm(MCDate value) {
		re_arr_rqst_tm_p().hm(value);
	}

	public String sno1() {
		return sno_p().sno1();
	}

	public void sno1(String value) {
		sno_p().sno1(value);
	}

	public String sno2() {
		return sno_p().sno2();
	}

	public void sno2(String value) {
		sno_p().sno2(value);
	}

	public String sno3() {
		return sno_p().sno3();
	}

	public void sno3(String value) {
		sno_p().sno3(value);
	}

	public String sno4() {
		return sno_p().sno4();
	}

	public void sno4(String value) {
		sno_p().sno4(value);
	}

	public String wrk_no() {
		return sno_p().wrk_no();
	}

	public void wrk_no(String value) {
		sno_p().wrk_no(value);
	}

	public String wrk_nm() {
		return sno_p().wrk_nm();
	}

	public void wrk_nm(String value) {
		sno_p().wrk_nm(value);
	}

	/**
	 * Delivery location rack/line cd. 納入場所棚・ラインＣＤ.<p>
	 *
	 */
	public String in_to_str_ln_cd() {
		return in_to_str_ln_p().str_ln_cd();
	}

	/**
	 * Delivery location rack/line cd. 納入場所棚・ラインＣＤ.<p>
	 *
	 */
	public void in_to_str_ln_cd(String value) {
		in_to_str_ln_p().str_ln_cd(value);
	}

	/**
	 * Delivery location rack/line name 納入場所棚・ライン名.<p>
	 *
	 */
	public String in_to_str_ln_nm() {
		return in_to_str_ln_p().str_ln_nm();
	}

	/**
	 * Delivery location rack/line name 納入場所棚・ライン名.<p>
	 *
	 */
	public void in_to_str_ln_nm(String value) {
		in_to_str_ln_p().str_ln_nm(value);
	}

	/**
	 * Without delivery location rack/line 納入場所棚・ライン無.<p>
	 *
	 */
	public boolean in_to_str_ln_cd_none_flg() {
		return in_to_str_ln_p().str_ln_cd_none_flg();
	}

	/**
	 * Without delivery location rack/line 納入場所棚・ライン無.<p>
	 *
	 */
	public void in_to_str_ln_cd_none_flg(boolean value) {
		in_to_str_ln_p().str_ln_cd_none_flg(value);
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

	public String dlv_cntry_cd() {
		return dlv_p().cntry_cd();
	}

	public void dlv_cntry_cd(String value) {
		dlv_p().cntry_cd(value);
	}

	public String dlv_cntry_nm() {
		return dlv_p().cntry_nm();
	}

	public void dlv_cntry_nm(String value) {
		dlv_p().cntry_nm(value);
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

	/**
	 * Receiving point cd. 配送先ＣＤ.<p>
	 *
	 */
	public String tdlv_cd() {
		return tdlv_p().bp_cd();
	}

	/**
	 * Receiving point cd. 配送先ＣＤ.<p>
	 *
	 */
	public void tdlv_cd(String value) {
		tdlv_p().bp_cd(value);
	}

	/**
	 * Receiving point name 配送先名.<p>
	 *
	 */
	public String tdlv_nm() {
		return tdlv_p().bp_nm();
	}

	/**
	 * Receiving point name 配送先名.<p>
	 *
	 */
	public void tdlv_nm(String value) {
		tdlv_p().bp_nm(value);
	}

	/**
	 * Miscellaneous receiving point 配送先諸口.<p>
	 *
	 */
	public boolean tdlv_sundry_flg() {
		return tdlv_p().dlv_sundry_flg();
	}

	/**
	 * Miscellaneous receiving point 配送先諸口.<p>
	 *
	 */
	public void tdlv_sundry_flg(boolean value) {
		tdlv_p().dlv_sundry_flg(value);
	}

	/**
	 * Receiving point country cd. 配送先国ＣＤ.<p>
	 *
	 */
	public String tdlv_cntry_cd() {
		return tdlv_p().cntry_cd();
	}

	/**
	 * Receiving point country cd. 配送先国ＣＤ.<p>
	 *
	 */
	public void tdlv_cntry_cd(String value) {
		tdlv_p().cntry_cd(value);
	}

	/**
	 * Receiving point country name 配送先国名.<p>
	 *
	 */
	public String tdlv_cntry_nm() {
		return tdlv_p().cntry_nm();
	}

	/**
	 * Receiving point country name 配送先国名.<p>
	 *
	 */
	public void tdlv_cntry_nm(String value) {
		tdlv_p().cntry_nm(value);
	}

	/**
	 * Receiving point zip code 配送先郵便番号.<p>
	 *
	 */
	public String tdlv_zip_cd() {
		return tdlv_p().zip_cd();
	}

	/**
	 * Receiving point zip code 配送先郵便番号.<p>
	 *
	 */
	public void tdlv_zip_cd(String value) {
		tdlv_p().zip_cd(value);
	}

	/**
	 * Receiving point address 1 配送先住所１.<p>
	 *
	 */
	public String tdlv_addr1() {
		return tdlv_p().addr1();
	}

	/**
	 * Receiving point address 1 配送先住所１.<p>
	 *
	 */
	public void tdlv_addr1(String value) {
		tdlv_p().addr1(value);
	}

	/**
	 * Receiving point address 2 配送先住所２.<p>
	 *
	 */
	public String tdlv_addr2() {
		return tdlv_p().addr2();
	}

	/**
	 * Receiving point address 2 配送先住所２.<p>
	 *
	 */
	public void tdlv_addr2(String value) {
		tdlv_p().addr2(value);
	}

	/**
	 * Receiving point address 3 配送先住所３.<p>
	 *
	 */
	public String tdlv_addr3() {
		return tdlv_p().addr3();
	}

	/**
	 * Receiving point address 3 配送先住所３.<p>
	 *
	 */
	public void tdlv_addr3(String value) {
		tdlv_p().addr3(value);
	}

	/**
	 * Receiving point address 4 配送先住所４.<p>
	 *
	 */
	public String tdlv_addr4() {
		return tdlv_p().addr4();
	}

	/**
	 * Receiving point address 4 配送先住所４.<p>
	 *
	 */
	public void tdlv_addr4(String value) {
		tdlv_p().addr4(value);
	}

	/**
	 * Receiving point TEL 配送先ＴＥＬ.<p>
	 *
	 */
	public String tdlv_tel() {
		return tdlv_p().tel();
	}

	/**
	 * Receiving point TEL 配送先ＴＥＬ.<p>
	 *
	 */
	public void tdlv_tel(String value) {
		tdlv_p().tel(value);
	}

	/**
	 * Receiving point FAX 配送先ＦＡＸ.<p>
	 *
	 */
	public String tdlv_fax() {
		return tdlv_p().fax();
	}

	/**
	 * Receiving point FAX 配送先ＦＡＸ.<p>
	 *
	 */
	public void tdlv_fax(String value) {
		tdlv_p().fax(value);
	}

	/**
	 * Receiving point dept. 配送先部署.<p>
	 *
	 */
	public String tdlv_cntct_dpt() {
		return tdlv_p().dlv_cntct_dpt();
	}

	/**
	 * Receiving point dept. 配送先部署.<p>
	 *
	 */
	public void tdlv_cntct_dpt(String value) {
		tdlv_p().dlv_cntct_dpt(value);
	}

	/**
	 * Receiving point PIC 配送先担当者.<p>
	 *
	 */
	public String tdlv_cntct_psn() {
		return tdlv_p().dlv_cntct_psn();
	}

	/**
	 * Receiving point PIC 配送先担当者.<p>
	 *
	 */
	public void tdlv_cntct_psn(String value) {
		tdlv_p().dlv_cntct_psn(value);
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
		return cont_qty_p().cont_qty();
	}

	/**
	 * Standard active ingredient 標準有効成分.<p>
	 *
	 */
	public void std_cont_qty(MCNumber value) {
		cont_qty_p().cont_qty(value);
	}

	/**
	 * Standard active ingredient 標準有効成分.<p>
	 *
	 */
	public void std_cont_qty(int value) {
		cont_qty_p().cont_qty(value);
	}

	/**
	 * Standard active ingredient 標準有効成分.<p>
	 *
	 */
	public void std_cont_qty(long value) {
		cont_qty_p().cont_qty(value);
	}

	/**
	 * Standard active ingredient 標準有効成分.<p>
	 *
	 */
	public void std_cont_qty(float value) {
		cont_qty_p().cont_qty(value);
	}

	/**
	 * Standard active ingredient 標準有効成分.<p>
	 *
	 */
	public void std_cont_qty(double value) {
		cont_qty_p().cont_qty(value);
	}

	public String cont_fctr_unit_cd() {
		return cont_fctr_unit_p().cont_fctr_unit_cd();
	}

	public void cont_fctr_unit_cd(String value) {
		cont_fctr_unit_p().cont_fctr_unit_cd(value);
	}

	public String cont_fctr_unit_nm() {
		return cont_fctr_unit_p().cont_fctr_unit_nm();
	}

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
	 * Subcontracting unit price (Transaction currency) 取引通貨加工単価.<p>
	 *
	 */
	public MCNumber trd_cur_proc_upri() {
		return trd_cur_proc_upri_p().upri();
	}

	/**
	 * Subcontracting unit price (Transaction currency) 取引通貨加工単価.<p>
	 *
	 */
	public void trd_cur_proc_upri(MCNumber value) {
		trd_cur_proc_upri_p().upri(value);
	}

	/**
	 * Subcontracting unit price (Transaction currency) 取引通貨加工単価.<p>
	 *
	 */
	public void trd_cur_proc_upri(int value) {
		trd_cur_proc_upri_p().upri(value);
	}

	/**
	 * Subcontracting unit price (Transaction currency) 取引通貨加工単価.<p>
	 *
	 */
	public void trd_cur_proc_upri(long value) {
		trd_cur_proc_upri_p().upri(value);
	}

	/**
	 * Subcontracting unit price (Transaction currency) 取引通貨加工単価.<p>
	 *
	 */
	public void trd_cur_proc_upri(float value) {
		trd_cur_proc_upri_p().upri(value);
	}

	/**
	 * Subcontracting unit price (Transaction currency) 取引通貨加工単価.<p>
	 *
	 */
	public void trd_cur_proc_upri(double value) {
		trd_cur_proc_upri_p().upri(value);
	}

	/**
	 * Subcontracting amount (Transaction currency) 取引通貨加工金額.<p>
	 *
	 */
	public MCNumber trd_cur_proc_amt() {
		return trd_cur_proc_amt_p().amt();
	}

	/**
	 * Subcontracting amount (Transaction currency) 取引通貨加工金額.<p>
	 *
	 */
	public void trd_cur_proc_amt(MCNumber value) {
		trd_cur_proc_amt_p().amt(value);
	}

	/**
	 * Subcontracting amount (Transaction currency) 取引通貨加工金額.<p>
	 *
	 */
	public void trd_cur_proc_amt(int value) {
		trd_cur_proc_amt_p().amt(value);
	}

	/**
	 * Subcontracting amount (Transaction currency) 取引通貨加工金額.<p>
	 *
	 */
	public void trd_cur_proc_amt(long value) {
		trd_cur_proc_amt_p().amt(value);
	}

	/**
	 * Subcontracting amount (Transaction currency) 取引通貨加工金額.<p>
	 *
	 */
	public void trd_cur_proc_amt(float value) {
		trd_cur_proc_amt_p().amt(value);
	}

	/**
	 * Subcontracting amount (Transaction currency) 取引通貨加工金額.<p>
	 *
	 */
	public void trd_cur_proc_amt(double value) {
		trd_cur_proc_amt_p().amt(value);
	}

	/**
	 * Subcontracting tax amount (Transaction currency) 取引通貨加工税額.<p>
	 *
	 */
	public MCNumber trd_cur_proc_tax_amt() {
		return trd_cur_proc_amt_p().tax_amt();
	}

	/**
	 * Subcontracting tax amount (Transaction currency) 取引通貨加工税額.<p>
	 *
	 */
	public void trd_cur_proc_tax_amt(MCNumber value) {
		trd_cur_proc_amt_p().tax_amt(value);
	}

	/**
	 * Subcontracting tax amount (Transaction currency) 取引通貨加工税額.<p>
	 *
	 */
	public void trd_cur_proc_tax_amt(int value) {
		trd_cur_proc_amt_p().tax_amt(value);
	}

	/**
	 * Subcontracting tax amount (Transaction currency) 取引通貨加工税額.<p>
	 *
	 */
	public void trd_cur_proc_tax_amt(long value) {
		trd_cur_proc_amt_p().tax_amt(value);
	}

	/**
	 * Subcontracting tax amount (Transaction currency) 取引通貨加工税額.<p>
	 *
	 */
	public void trd_cur_proc_tax_amt(float value) {
		trd_cur_proc_amt_p().tax_amt(value);
	}

	/**
	 * Subcontracting tax amount (Transaction currency) 取引通貨加工税額.<p>
	 *
	 */
	public void trd_cur_proc_tax_amt(double value) {
		trd_cur_proc_amt_p().tax_amt(value);
	}

	/**
	 * Chargeable supply unit price (Transaction currency) 取引通貨有償支給単価.<p>
	 *
	 */
	public MCNumber trd_cur_onr_prov_upri() {
		return trd_cur_onr_prov_upri_p().upri();
	}

	/**
	 * Chargeable supply unit price (Transaction currency) 取引通貨有償支給単価.<p>
	 *
	 */
	public void trd_cur_onr_prov_upri(MCNumber value) {
		trd_cur_onr_prov_upri_p().upri(value);
	}

	/**
	 * Chargeable supply unit price (Transaction currency) 取引通貨有償支給単価.<p>
	 *
	 */
	public void trd_cur_onr_prov_upri(int value) {
		trd_cur_onr_prov_upri_p().upri(value);
	}

	/**
	 * Chargeable supply unit price (Transaction currency) 取引通貨有償支給単価.<p>
	 *
	 */
	public void trd_cur_onr_prov_upri(long value) {
		trd_cur_onr_prov_upri_p().upri(value);
	}

	/**
	 * Chargeable supply unit price (Transaction currency) 取引通貨有償支給単価.<p>
	 *
	 */
	public void trd_cur_onr_prov_upri(float value) {
		trd_cur_onr_prov_upri_p().upri(value);
	}

	/**
	 * Chargeable supply unit price (Transaction currency) 取引通貨有償支給単価.<p>
	 *
	 */
	public void trd_cur_onr_prov_upri(double value) {
		trd_cur_onr_prov_upri_p().upri(value);
	}

	/**
	 * Chargeable supply amount (Transaction currency) 取引通貨有償支給金額.<p>
	 *
	 */
	public MCNumber trd_cur_onr_prov_amt() {
		return trd_cur_onr_prov_amt_p().amt();
	}

	/**
	 * Chargeable supply amount (Transaction currency) 取引通貨有償支給金額.<p>
	 *
	 */
	public void trd_cur_onr_prov_amt(MCNumber value) {
		trd_cur_onr_prov_amt_p().amt(value);
	}

	/**
	 * Chargeable supply amount (Transaction currency) 取引通貨有償支給金額.<p>
	 *
	 */
	public void trd_cur_onr_prov_amt(int value) {
		trd_cur_onr_prov_amt_p().amt(value);
	}

	/**
	 * Chargeable supply amount (Transaction currency) 取引通貨有償支給金額.<p>
	 *
	 */
	public void trd_cur_onr_prov_amt(long value) {
		trd_cur_onr_prov_amt_p().amt(value);
	}

	/**
	 * Chargeable supply amount (Transaction currency) 取引通貨有償支給金額.<p>
	 *
	 */
	public void trd_cur_onr_prov_amt(float value) {
		trd_cur_onr_prov_amt_p().amt(value);
	}

	/**
	 * Chargeable supply amount (Transaction currency) 取引通貨有償支給金額.<p>
	 *
	 */
	public void trd_cur_onr_prov_amt(double value) {
		trd_cur_onr_prov_amt_p().amt(value);
	}

	/**
	 * chargeable supply tax amount (Transaction currency) 取引通貨有償支給税額.<p>
	 *
	 */
	public MCNumber trd_cur_onr_prov_tax_amt() {
		return trd_cur_onr_prov_amt_p().tax_amt();
	}

	/**
	 * chargeable supply tax amount (Transaction currency) 取引通貨有償支給税額.<p>
	 *
	 */
	public void trd_cur_onr_prov_tax_amt(MCNumber value) {
		trd_cur_onr_prov_amt_p().tax_amt(value);
	}

	/**
	 * chargeable supply tax amount (Transaction currency) 取引通貨有償支給税額.<p>
	 *
	 */
	public void trd_cur_onr_prov_tax_amt(int value) {
		trd_cur_onr_prov_amt_p().tax_amt(value);
	}

	/**
	 * chargeable supply tax amount (Transaction currency) 取引通貨有償支給税額.<p>
	 *
	 */
	public void trd_cur_onr_prov_tax_amt(long value) {
		trd_cur_onr_prov_amt_p().tax_amt(value);
	}

	/**
	 * chargeable supply tax amount (Transaction currency) 取引通貨有償支給税額.<p>
	 *
	 */
	public void trd_cur_onr_prov_tax_amt(float value) {
		trd_cur_onr_prov_amt_p().tax_amt(value);
	}

	/**
	 * chargeable supply tax amount (Transaction currency) 取引通貨有償支給税額.<p>
	 *
	 */
	public void trd_cur_onr_prov_tax_amt(double value) {
		trd_cur_onr_prov_amt_p().tax_amt(value);
	}

	public MCNumber xrate() {
		return xrate_p().xrate();
	}

	public void xrate(MCNumber value) {
		xrate_p().xrate(value);
	}

	public void xrate(int value) {
		xrate_p().xrate(value);
	}

	public void xrate(long value) {
		xrate_p().xrate(value);
	}

	public void xrate(float value) {
		xrate_p().xrate(value);
	}

	public void xrate(double value) {
		xrate_p().xrate(value);
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
	 * Subcontracting unit price (Base currency) 基準通貨加工単価.<p>
	 *
	 */
	public MCNumber base_cur_proc_upri() {
		return base_cur_proc_upri_p().upri();
	}

	/**
	 * Subcontracting unit price (Base currency) 基準通貨加工単価.<p>
	 *
	 */
	public void base_cur_proc_upri(MCNumber value) {
		base_cur_proc_upri_p().upri(value);
	}

	/**
	 * Subcontracting unit price (Base currency) 基準通貨加工単価.<p>
	 *
	 */
	public void base_cur_proc_upri(int value) {
		base_cur_proc_upri_p().upri(value);
	}

	/**
	 * Subcontracting unit price (Base currency) 基準通貨加工単価.<p>
	 *
	 */
	public void base_cur_proc_upri(long value) {
		base_cur_proc_upri_p().upri(value);
	}

	/**
	 * Subcontracting unit price (Base currency) 基準通貨加工単価.<p>
	 *
	 */
	public void base_cur_proc_upri(float value) {
		base_cur_proc_upri_p().upri(value);
	}

	/**
	 * Subcontracting unit price (Base currency) 基準通貨加工単価.<p>
	 *
	 */
	public void base_cur_proc_upri(double value) {
		base_cur_proc_upri_p().upri(value);
	}

	/**
	 * Subcontracting amount (Base currency) 基準通貨加工金額.<p>
	 *
	 */
	public MCNumber base_cur_proc_amt() {
		return base_cur_proc_amt_p().amt();
	}

	/**
	 * Subcontracting amount (Base currency) 基準通貨加工金額.<p>
	 *
	 */
	public void base_cur_proc_amt(MCNumber value) {
		base_cur_proc_amt_p().amt(value);
	}

	/**
	 * Subcontracting amount (Base currency) 基準通貨加工金額.<p>
	 *
	 */
	public void base_cur_proc_amt(int value) {
		base_cur_proc_amt_p().amt(value);
	}

	/**
	 * Subcontracting amount (Base currency) 基準通貨加工金額.<p>
	 *
	 */
	public void base_cur_proc_amt(long value) {
		base_cur_proc_amt_p().amt(value);
	}

	/**
	 * Subcontracting amount (Base currency) 基準通貨加工金額.<p>
	 *
	 */
	public void base_cur_proc_amt(float value) {
		base_cur_proc_amt_p().amt(value);
	}

	/**
	 * Subcontracting amount (Base currency) 基準通貨加工金額.<p>
	 *
	 */
	public void base_cur_proc_amt(double value) {
		base_cur_proc_amt_p().amt(value);
	}

	/**
	 * Subcontracting tax amount (Base currency) 基準通貨加工税額.<p>
	 *
	 */
	public MCNumber base_cur_proc_tax_amt() {
		return base_cur_proc_amt_p().tax_amt();
	}

	/**
	 * Subcontracting tax amount (Base currency) 基準通貨加工税額.<p>
	 *
	 */
	public void base_cur_proc_tax_amt(MCNumber value) {
		base_cur_proc_amt_p().tax_amt(value);
	}

	/**
	 * Subcontracting tax amount (Base currency) 基準通貨加工税額.<p>
	 *
	 */
	public void base_cur_proc_tax_amt(int value) {
		base_cur_proc_amt_p().tax_amt(value);
	}

	/**
	 * Subcontracting tax amount (Base currency) 基準通貨加工税額.<p>
	 *
	 */
	public void base_cur_proc_tax_amt(long value) {
		base_cur_proc_amt_p().tax_amt(value);
	}

	/**
	 * Subcontracting tax amount (Base currency) 基準通貨加工税額.<p>
	 *
	 */
	public void base_cur_proc_tax_amt(float value) {
		base_cur_proc_amt_p().tax_amt(value);
	}

	/**
	 * Subcontracting tax amount (Base currency) 基準通貨加工税額.<p>
	 *
	 */
	public void base_cur_proc_tax_amt(double value) {
		base_cur_proc_amt_p().tax_amt(value);
	}

	/**
	 * Chargeable supply unit price (Base currency) 基準通貨有償支給単価.<p>
	 *
	 */
	public MCNumber base_cur_onr_prov_upri() {
		return base_cur_onr_prov_upri_p().upri();
	}

	/**
	 * Chargeable supply unit price (Base currency) 基準通貨有償支給単価.<p>
	 *
	 */
	public void base_cur_onr_prov_upri(MCNumber value) {
		base_cur_onr_prov_upri_p().upri(value);
	}

	/**
	 * Chargeable supply unit price (Base currency) 基準通貨有償支給単価.<p>
	 *
	 */
	public void base_cur_onr_prov_upri(int value) {
		base_cur_onr_prov_upri_p().upri(value);
	}

	/**
	 * Chargeable supply unit price (Base currency) 基準通貨有償支給単価.<p>
	 *
	 */
	public void base_cur_onr_prov_upri(long value) {
		base_cur_onr_prov_upri_p().upri(value);
	}

	/**
	 * Chargeable supply unit price (Base currency) 基準通貨有償支給単価.<p>
	 *
	 */
	public void base_cur_onr_prov_upri(float value) {
		base_cur_onr_prov_upri_p().upri(value);
	}

	/**
	 * Chargeable supply unit price (Base currency) 基準通貨有償支給単価.<p>
	 *
	 */
	public void base_cur_onr_prov_upri(double value) {
		base_cur_onr_prov_upri_p().upri(value);
	}

	/**
	 * Chargeable supply amount (Base currency) 基準通貨有償支給金額.<p>
	 *
	 */
	public MCNumber base_cur_onr_prov_amt() {
		return base_cur_onr_prov_amt_p().amt();
	}

	/**
	 * Chargeable supply amount (Base currency) 基準通貨有償支給金額.<p>
	 *
	 */
	public void base_cur_onr_prov_amt(MCNumber value) {
		base_cur_onr_prov_amt_p().amt(value);
	}

	/**
	 * Chargeable supply amount (Base currency) 基準通貨有償支給金額.<p>
	 *
	 */
	public void base_cur_onr_prov_amt(int value) {
		base_cur_onr_prov_amt_p().amt(value);
	}

	/**
	 * Chargeable supply amount (Base currency) 基準通貨有償支給金額.<p>
	 *
	 */
	public void base_cur_onr_prov_amt(long value) {
		base_cur_onr_prov_amt_p().amt(value);
	}

	/**
	 * Chargeable supply amount (Base currency) 基準通貨有償支給金額.<p>
	 *
	 */
	public void base_cur_onr_prov_amt(float value) {
		base_cur_onr_prov_amt_p().amt(value);
	}

	/**
	 * Chargeable supply amount (Base currency) 基準通貨有償支給金額.<p>
	 *
	 */
	public void base_cur_onr_prov_amt(double value) {
		base_cur_onr_prov_amt_p().amt(value);
	}

	/**
	 * Chargeable supply tax amount (Base currency) 基準通貨有償支給税額.<p>
	 *
	 */
	public MCNumber base_cur_onr_prov_tax_amt() {
		return base_cur_onr_prov_amt_p().tax_amt();
	}

	/**
	 * Chargeable supply tax amount (Base currency) 基準通貨有償支給税額.<p>
	 *
	 */
	public void base_cur_onr_prov_tax_amt(MCNumber value) {
		base_cur_onr_prov_amt_p().tax_amt(value);
	}

	/**
	 * Chargeable supply tax amount (Base currency) 基準通貨有償支給税額.<p>
	 *
	 */
	public void base_cur_onr_prov_tax_amt(int value) {
		base_cur_onr_prov_amt_p().tax_amt(value);
	}

	/**
	 * Chargeable supply tax amount (Base currency) 基準通貨有償支給税額.<p>
	 *
	 */
	public void base_cur_onr_prov_tax_amt(long value) {
		base_cur_onr_prov_amt_p().tax_amt(value);
	}

	/**
	 * Chargeable supply tax amount (Base currency) 基準通貨有償支給税額.<p>
	 *
	 */
	public void base_cur_onr_prov_tax_amt(float value) {
		base_cur_onr_prov_amt_p().tax_amt(value);
	}

	/**
	 * Chargeable supply tax amount (Base currency) 基準通貨有償支給税額.<p>
	 *
	 */
	public void base_cur_onr_prov_tax_amt(double value) {
		base_cur_onr_prov_amt_p().tax_amt(value);
	}

	/**
	 * Taxpaying exchange rate 納税為替レート.<p>
	 *
	 */
	public MCNumber ptax_xrate() {
		return prax_xrate_p().xrate();
	}

	/**
	 * Taxpaying exchange rate 納税為替レート.<p>
	 *
	 */
	public void ptax_xrate(MCNumber value) {
		prax_xrate_p().xrate(value);
	}

	/**
	 * Taxpaying exchange rate 納税為替レート.<p>
	 *
	 */
	public void ptax_xrate(int value) {
		prax_xrate_p().xrate(value);
	}

	/**
	 * Taxpaying exchange rate 納税為替レート.<p>
	 *
	 */
	public void ptax_xrate(long value) {
		prax_xrate_p().xrate(value);
	}

	/**
	 * Taxpaying exchange rate 納税為替レート.<p>
	 *
	 */
	public void ptax_xrate(float value) {
		prax_xrate_p().xrate(value);
	}

	/**
	 * Taxpaying exchange rate 納税為替レート.<p>
	 *
	 */
	public void ptax_xrate(double value) {
		prax_xrate_p().xrate(value);
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
	 * Subcontracting unit price (Tax currency) 納税通貨加工単価.<p>
	 *
	 */
	public MCNumber ptax_cur_proc_upri() {
		return ptax_cur_proc_upri_p().upri();
	}

	/**
	 * Subcontracting unit price (Tax currency) 納税通貨加工単価.<p>
	 *
	 */
	public void ptax_cur_proc_upri(MCNumber value) {
		ptax_cur_proc_upri_p().upri(value);
	}

	/**
	 * Subcontracting unit price (Tax currency) 納税通貨加工単価.<p>
	 *
	 */
	public void ptax_cur_proc_upri(int value) {
		ptax_cur_proc_upri_p().upri(value);
	}

	/**
	 * Subcontracting unit price (Tax currency) 納税通貨加工単価.<p>
	 *
	 */
	public void ptax_cur_proc_upri(long value) {
		ptax_cur_proc_upri_p().upri(value);
	}

	/**
	 * Subcontracting unit price (Tax currency) 納税通貨加工単価.<p>
	 *
	 */
	public void ptax_cur_proc_upri(float value) {
		ptax_cur_proc_upri_p().upri(value);
	}

	/**
	 * Subcontracting unit price (Tax currency) 納税通貨加工単価.<p>
	 *
	 */
	public void ptax_cur_proc_upri(double value) {
		ptax_cur_proc_upri_p().upri(value);
	}

	/**
	 * Subcontracting amount (Tax currency) 納税通貨加工金額.<p>
	 *
	 */
	public MCNumber ptax_cur_proc_amt() {
		return ptax_cur_proc_amt_p().amt();
	}

	/**
	 * Subcontracting amount (Tax currency) 納税通貨加工金額.<p>
	 *
	 */
	public void ptax_cur_proc_amt(MCNumber value) {
		ptax_cur_proc_amt_p().amt(value);
	}

	/**
	 * Subcontracting amount (Tax currency) 納税通貨加工金額.<p>
	 *
	 */
	public void ptax_cur_proc_amt(int value) {
		ptax_cur_proc_amt_p().amt(value);
	}

	/**
	 * Subcontracting amount (Tax currency) 納税通貨加工金額.<p>
	 *
	 */
	public void ptax_cur_proc_amt(long value) {
		ptax_cur_proc_amt_p().amt(value);
	}

	/**
	 * Subcontracting amount (Tax currency) 納税通貨加工金額.<p>
	 *
	 */
	public void ptax_cur_proc_amt(float value) {
		ptax_cur_proc_amt_p().amt(value);
	}

	/**
	 * Subcontracting amount (Tax currency) 納税通貨加工金額.<p>
	 *
	 */
	public void ptax_cur_proc_amt(double value) {
		ptax_cur_proc_amt_p().amt(value);
	}

	/**
	 * Subcontracting tax amount (Tax currency) 納税通貨加工税額.<p>
	 *
	 */
	public MCNumber ptax_cur_proc_tax_amt() {
		return ptax_cur_proc_amt_p().tax_amt();
	}

	/**
	 * Subcontracting tax amount (Tax currency) 納税通貨加工税額.<p>
	 *
	 */
	public void ptax_cur_proc_tax_amt(MCNumber value) {
		ptax_cur_proc_amt_p().tax_amt(value);
	}

	/**
	 * Subcontracting tax amount (Tax currency) 納税通貨加工税額.<p>
	 *
	 */
	public void ptax_cur_proc_tax_amt(int value) {
		ptax_cur_proc_amt_p().tax_amt(value);
	}

	/**
	 * Subcontracting tax amount (Tax currency) 納税通貨加工税額.<p>
	 *
	 */
	public void ptax_cur_proc_tax_amt(long value) {
		ptax_cur_proc_amt_p().tax_amt(value);
	}

	/**
	 * Subcontracting tax amount (Tax currency) 納税通貨加工税額.<p>
	 *
	 */
	public void ptax_cur_proc_tax_amt(float value) {
		ptax_cur_proc_amt_p().tax_amt(value);
	}

	/**
	 * Subcontracting tax amount (Tax currency) 納税通貨加工税額.<p>
	 *
	 */
	public void ptax_cur_proc_tax_amt(double value) {
		ptax_cur_proc_amt_p().tax_amt(value);
	}

	/**
	 * Chargeable supply unit price (Tax currency) 納税通貨有償支給単価.<p>
	 *
	 */
	public MCNumber ptax_cur_onr_prov_upri() {
		return ptax_cur_onr_prov_upri_p().upri();
	}

	/**
	 * Chargeable supply unit price (Tax currency) 納税通貨有償支給単価.<p>
	 *
	 */
	public void ptax_cur_onr_prov_upri(MCNumber value) {
		ptax_cur_onr_prov_upri_p().upri(value);
	}

	/**
	 * Chargeable supply unit price (Tax currency) 納税通貨有償支給単価.<p>
	 *
	 */
	public void ptax_cur_onr_prov_upri(int value) {
		ptax_cur_onr_prov_upri_p().upri(value);
	}

	/**
	 * Chargeable supply unit price (Tax currency) 納税通貨有償支給単価.<p>
	 *
	 */
	public void ptax_cur_onr_prov_upri(long value) {
		ptax_cur_onr_prov_upri_p().upri(value);
	}

	/**
	 * Chargeable supply unit price (Tax currency) 納税通貨有償支給単価.<p>
	 *
	 */
	public void ptax_cur_onr_prov_upri(float value) {
		ptax_cur_onr_prov_upri_p().upri(value);
	}

	/**
	 * Chargeable supply unit price (Tax currency) 納税通貨有償支給単価.<p>
	 *
	 */
	public void ptax_cur_onr_prov_upri(double value) {
		ptax_cur_onr_prov_upri_p().upri(value);
	}

	/**
	 * Chargeable supply amount (Tax currency) 納税通貨有償支給金額.<p>
	 *
	 */
	public MCNumber ptax_cur_onr_prov_amt() {
		return ptax_cur_onr_prov_amt_p().amt();
	}

	/**
	 * Chargeable supply amount (Tax currency) 納税通貨有償支給金額.<p>
	 *
	 */
	public void ptax_cur_onr_prov_amt(MCNumber value) {
		ptax_cur_onr_prov_amt_p().amt(value);
	}

	/**
	 * Chargeable supply amount (Tax currency) 納税通貨有償支給金額.<p>
	 *
	 */
	public void ptax_cur_onr_prov_amt(int value) {
		ptax_cur_onr_prov_amt_p().amt(value);
	}

	/**
	 * Chargeable supply amount (Tax currency) 納税通貨有償支給金額.<p>
	 *
	 */
	public void ptax_cur_onr_prov_amt(long value) {
		ptax_cur_onr_prov_amt_p().amt(value);
	}

	/**
	 * Chargeable supply amount (Tax currency) 納税通貨有償支給金額.<p>
	 *
	 */
	public void ptax_cur_onr_prov_amt(float value) {
		ptax_cur_onr_prov_amt_p().amt(value);
	}

	/**
	 * Chargeable supply amount (Tax currency) 納税通貨有償支給金額.<p>
	 *
	 */
	public void ptax_cur_onr_prov_amt(double value) {
		ptax_cur_onr_prov_amt_p().amt(value);
	}

	/**
	 * Chargeable supply tax amount (Tax currency) 納税通貨有償支給税額.<p>
	 *
	 */
	public MCNumber ptax_cur_onr_prov_tax_amt() {
		return ptax_cur_onr_prov_amt_p().tax_amt();
	}

	/**
	 * Chargeable supply tax amount (Tax currency) 納税通貨有償支給税額.<p>
	 *
	 */
	public void ptax_cur_onr_prov_tax_amt(MCNumber value) {
		ptax_cur_onr_prov_amt_p().tax_amt(value);
	}

	/**
	 * Chargeable supply tax amount (Tax currency) 納税通貨有償支給税額.<p>
	 *
	 */
	public void ptax_cur_onr_prov_tax_amt(int value) {
		ptax_cur_onr_prov_amt_p().tax_amt(value);
	}

	/**
	 * Chargeable supply tax amount (Tax currency) 納税通貨有償支給税額.<p>
	 *
	 */
	public void ptax_cur_onr_prov_tax_amt(long value) {
		ptax_cur_onr_prov_amt_p().tax_amt(value);
	}

	/**
	 * Chargeable supply tax amount (Tax currency) 納税通貨有償支給税額.<p>
	 *
	 */
	public void ptax_cur_onr_prov_tax_amt(float value) {
		ptax_cur_onr_prov_amt_p().tax_amt(value);
	}

	/**
	 * Chargeable supply tax amount (Tax currency) 納税通貨有償支給税額.<p>
	 *
	 */
	public void ptax_cur_onr_prov_tax_amt(double value) {
		ptax_cur_onr_prov_amt_p().tax_amt(value);
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

	/**
	 * Purchasing PIC cd. 購買担当者ＣＤ.<p>
	 *
	 */
	public String purc_usr_cd() {
		return usr_dpt_p().usr_cd();
	}

	/**
	 * Purchasing PIC cd. 購買担当者ＣＤ.<p>
	 *
	 */
	public void purc_usr_cd(String value) {
		usr_dpt_p().usr_cd(value);
	}

	/**
	 * Purchasing PIC name 購買担当者名.<p>
	 *
	 */
	public String purc_usr_nm() {
		return usr_dpt_p().usr_nm();
	}

	/**
	 * Purchasing PIC name 購買担当者名.<p>
	 *
	 */
	public void purc_usr_nm(String value) {
		usr_dpt_p().usr_nm(value);
	}

	/**
	 * Purchasing dept. cd. 購買部門ＣＤ.<p>
	 *
	 */
	public String purc_dpt_cd() {
		return usr_dpt_p().dpt_cd();
	}

	/**
	 * Purchasing dept. cd. 購買部門ＣＤ.<p>
	 *
	 */
	public void purc_dpt_cd(String value) {
		usr_dpt_p().dpt_cd(value);
	}

	/**
	 * Purchasing dept. name 購買部門名.<p>
	 *
	 */
	public String purc_dpt_nm() {
		return usr_dpt_p().dpt_nm();
	}

	/**
	 * Purchasing dept. name 購買部門名.<p>
	 *
	 */
	public void purc_dpt_nm(String value) {
		usr_dpt_p().dpt_nm(value);
	}

	public String bd_dpt_cd() {
		return bditm_p().bd_dpt_cd();
	}

	public void bd_dpt_cd(String value) {
		bditm_p().bd_dpt_cd(value);
	}

	public String bd_dpt_nm() {
		return bditm_p().bd_dpt_nm();
	}

	public void bd_dpt_nm(String value) {
		bditm_p().bd_dpt_nm(value);
	}

	public String bd_itm_cd() {
		return bditm_p().bd_itm_cd();
	}

	public void bd_itm_cd(String value) {
		bditm_p().bd_itm_cd(value);
	}

	public String bd_itm_sub1() {
		return bditm_p().bd_itm_sub1();
	}

	public void bd_itm_sub1(String value) {
		bditm_p().bd_itm_sub1(value);
	}

	public String bd_itm_sub2() {
		return bditm_p().bd_itm_sub2();
	}

	public void bd_itm_sub2(String value) {
		bditm_p().bd_itm_sub2(value);
	}

	public String bd_itm_sub3() {
		return bditm_p().bd_itm_sub3();
	}

	public void bd_itm_sub3(String value) {
		bditm_p().bd_itm_sub3(value);
	}

	public String bd_itm_nm() {
		return bditm_p().bd_itm_nm();
	}

	public void bd_itm_nm(String value) {
		bditm_p().bd_itm_nm(value);
	}

	public String bd_lot_no() {
		return bditm_p().bd_lot_no();
	}

	public void bd_lot_no(String value) {
		bditm_p().bd_lot_no(value);
	}

	public String bd_sublot_no() {
		return bditm_p().bd_sublot_no();
	}

	public void bd_sublot_no(String value) {
		bditm_p().bd_sublot_no(value);
	}

	public String bd_sno1() {
		return bditm_p().bd_sno1();
	}

	public void bd_sno1(String value) {
		bditm_p().bd_sno1(value);
	}

	public String bd_sno2() {
		return bditm_p().bd_sno2();
	}

	public void bd_sno2(String value) {
		bditm_p().bd_sno2(value);
	}

	public String bd_sno3() {
		return bditm_p().bd_sno3();
	}

	public void bd_sno3(String value) {
		bditm_p().bd_sno3(value);
	}

	public String bd_sno4() {
		return bditm_p().bd_sno4();
	}

	public void bd_sno4(String value) {
		bditm_p().bd_sno4(value);
	}

	public String bd_bp_cd() {
		return bditm_p().bd_bp_cd();
	}

	public void bd_bp_cd(String value) {
		bditm_p().bd_bp_cd(value);
	}

	public String bd_bp_nm() {
		return bditm_p().bd_bp_nm();
	}

	public void bd_bp_nm(String value) {
		bditm_p().bd_bp_nm(value);
	}

	public String bd_loc_cd() {
		return bditm_p().bd_loc_cd();
	}

	public void bd_loc_cd(String value) {
		bditm_p().bd_loc_cd(value);
	}

	public String bd_loc_nm() {
		return bditm_p().bd_loc_nm();
	}

	public void bd_loc_nm(String value) {
		bditm_p().bd_loc_nm(value);
	}

	public String bd_ctg_cd() {
		return bditm_p().bd_ctg_cd();
	}

	public void bd_ctg_cd(String value) {
		bditm_p().bd_ctg_cd(value);
	}

	public String bd_ctg_nm() {
		return bditm_p().bd_ctg_nm();
	}

	public void bd_ctg_nm(String value) {
		bditm_p().bd_ctg_nm(value);
	}

	public String bd_oper_cd() {
		return bditm_p().bd_oper_cd();
	}

	public void bd_oper_cd(String value) {
		bditm_p().bd_oper_cd(value);
	}

	public String bd_oper_nm() {
		return bditm_p().bd_oper_nm();
	}

	public void bd_oper_nm(String value) {
		bditm_p().bd_oper_nm(value);
	}

	public String bd_iv_no() {
		return bditm_p().bd_iv_no();
	}

	public void bd_iv_no(String value) {
		bditm_p().bd_iv_no(value);
	}

	public String bd_slo_no() {
		return bditm_p().bd_slo_no();
	}

	public void bd_slo_no(String value) {
		bditm_p().bd_slo_no(value);
	}

	public String bd_po_no() {
		return bditm_p().bd_po_no();
	}

	public void bd_po_no(String value) {
		bditm_p().bd_po_no(value);
	}

	public String rtn_sts_typ() {
		return rts_msg_p().rtn_sts_typ();
	}

	public void rtn_sts_typ(String value) {
		rts_msg_p().rtn_sts_typ(value);
	}

	public String rtn_sts_typ_nm() {
		return rts_msg_p().rtn_sts_typ_nm();
	}

	public void rtn_sts_typ_nm(String value) {
		rts_msg_p().rtn_sts_typ_nm(value);
	}

	public String msg_id() {
		return rts_msg_p().msg_id();
	}

	public void msg_id(String value) {
		rts_msg_p().msg_id(value);
	}

	public String msg() {
		return rts_msg_p().msg();
	}

	public void msg(String value) {
		rts_msg_p().msg(value);
	}

}

