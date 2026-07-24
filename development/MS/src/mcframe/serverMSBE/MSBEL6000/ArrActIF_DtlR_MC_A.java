package mcframe.serverMSBE.MSBEL6000;

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
 * ブロック"ArrActIF_Dtl"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class ArrActIF_DtlR_MC_A extends MCConstRow {

	/**
	 * Data pegging No. データ紐付けＮＯ.<p>
	 *
	 */
	public static final String $peg_no = "peg_no";
	/**
	 * Data update type データ更新区分.<p>
	 *
	 */
	public static final String $data_crud_typ = "data_crud_typ";
	/**
	 * Error flg. エラーＦＬＧ.<p>
	 *
	 */
	public static final String $err_flg = "err_flg";
	/**
	 * Process result status type 処理結果状況区分.<p>
	 *
	 */
	public static final String $rtn_sts_typ = "rtn_sts_typ";
	public static final String $arr_act = "arr_act";
	/**
	 * Progress status type 進捗状況区分.<p>
	 *
	 */
	public static final String $pr_sts_typ = "pr_sts_typ";
	/**
	 * Progress status type name 進捗状況区分名.<p>
	 *
	 */
	public static final String $pr_sts_typ_nm = "pr_sts_typ_nm";
	/**
	 * Asset management type 資産管理区分.<p>
	 *
	 */
	public static final String $asset_mng_typ = "asset_mng_typ";
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
	 * Lot No. numbering type ロットＮＯ発番区分.<p>
	 *
	 */
	public static final String $lot_no_typ = "lot_no_typ";
	/**
	 * Sublot management type サブロット管理区分.<p>
	 *
	 */
	public static final String $sublot_mng_typ = "sublot_mng_typ";
	/**
	 * Sublot No. numbering type サブロットＮＯ発番区分.<p>
	 *
	 */
	public static final String $sublot_no_typ = "sublot_no_typ";
	/**
	 * Vendor lot No. required 業者ロットＮＯ必須.<p>
	 *
	 */
	public static final String $bp_lot_flg = "bp_lot_flg";
	/**
	 * For receipt rack/line 入荷棚・ライン対象.<p>
	 *
	 */
	public static final String $arr_str_ln_tgt_flg = "arr_str_ln_tgt_flg";
	/**
	 * Return-from delivery note details No. 返品元納品書明細ＮＯ.<p>
	 *
	 */
	public static final String $ret_dlv_slip_d_no = "ret_dlv_slip_d_no";
	/**
	 * Fot return-from rack/line 返品元棚・ライン対象.<p>
	 *
	 */
	public static final String $ret_str_ln_tgt_flg = "ret_str_ln_tgt_flg";
	/**
	 * Cancellation recording date 取消計上日.<p>
	 *
	 */
	public static final String $can_ac_dt = "can_ac_dt";
	/**
	 * Receipt date 入荷日.<p>
	 *
	 */
	public static final String $arr_dt = "arr_dt";
	/**
	 * Receipt WG cd. 入荷ＷＧＣＤ.<p>
	 *
	 */
	public static final String $arr_wg_cd = "arr_wg_cd";
	/**
	 * Receipt progress No. 入荷進捗ＮＯ.<p>
	 *
	 */
	public static final String $arr_pr_no = "arr_pr_no";
	/**
	 * Purchase invoice No. 受領インボイスＮＯ.<p>
	 *
	 */
	public static final String $rcpt_iv_no = "rcpt_iv_no";
	/**
	 * Purchase invoice management No. 受領インボイス管理ＮＯ.<p>
	 *
	 */
	public static final String $rcpt_iv_mng_no = "rcpt_iv_mng_no";
	/**
	 * Invoice No. インボイスＮＯ.<p>
	 *
	 */
	public static final String $iv_no = "iv_no";
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
	 * Supply result No. 支給実績ＮＯ.<p>
	 *
	 */
	public static final String $prov_act_no = "prov_act_no";
	/**
	 * Receipt pattern type 入荷パタン区分.<p>
	 *
	 */
	public static final String $arr_ptn_typ = "arr_ptn_typ";
	/**
	 * Cancel remaining flg. 打切ＦＬＧ.<p>
	 *
	 */
	public static final String $abort_flg = "abort_flg";
	/**
	 * Lot creation flg. ロット作成ＦＬＧ.<p>
	 *
	 */
	public static final String $crt_lot_flg = "crt_lot_flg";
	/**
	 * Same lot flg. 同一ロットＦＬＧ.<p>
	 *
	 */
	public static final String $same_lot_flg = "same_lot_flg";
	/**
	 * GR/GI progress management No. 受払進捗管理ＮＯ.<p>
	 *
	 */
	public static final String $io_schd_pr_no = "io_schd_pr_no";
	/**
	 * Supply type 支給区分.<p>
	 *
	 */
	public static final String $prov_typ = "prov_typ";
	/**
	 * Supply recording type 支給計上区分.<p>
	 *
	 */
	public static final String $prov_basis_typ = "prov_basis_typ";
	/**
	 * Mfg. order No. 製造指図ＮＯ.<p>
	 *
	 */
	public static final String $mfg_inst_no = "mfg_inst_no";
	/**
	 * Subcontracting result prior flg. 外注実績先行ＦＬＧ.<p>
	 *
	 */
	public static final String $pre_outsrc_act_flg = "pre_outsrc_act_flg";
	/**
	 * Issue flg. 発行ＦＬＧ.<p>
	 *
	 */
	public static final String $prnt_flg = "prnt_flg";
	/**
	 * Customer inventory 預り.<p>
	 *
	 */
	public static final String $cststk_flg = "cststk_flg";
	/**
	 * Other accounting GI 他勘定出庫.<p>
	 *
	 */
	public static final String $acxfr_gi_flg = "acxfr_gi_flg";
	/**
	 * Expense purchase 経費購買.<p>
	 *
	 */
	public static final String $xpns_purc_flg = "xpns_purc_flg";
	/**
	 * Sales other accounting 販売他勘定.<p>
	 *
	 */
	public static final String $sls_acxfr_flg = "sls_acxfr_flg";
	/**
	 * Purchase 仕入.<p>
	 *
	 */
	public static final String $purc_flg = "purc_flg";
	/**
	 * Sales return 売上返品.<p>
	 *
	 */
	public static final String $sls_rtn_flg = "sls_rtn_flg";
	/**
	 * Transport 移送.<p>
	 *
	 */
	public static final String $xfr_flg = "xfr_flg";
	/**
	 * Transaction unit number of decimal places 取引単位小数部有効桁数.<p>
	 *
	 */
	public static final String $trd_unit_dec_place = "trd_unit_dec_place";
	/**
	 * Active ingredient unit number of decimal places 有効成分単位小数部有効桁数.<p>
	 *
	 */
	public static final String $cont_fctr_dec_place = "cont_fctr_dec_place";
	/**
	 * Update counter (Receipt progress) 更新カウンタ(入荷進捗).<p>
	 *
	 */
	public static final String $arr_pr_upd_cntr = "arr_pr_upd_cntr";
	/**
	 * Update counter (Receipt result) 更新カウンタ(入荷実績).<p>
	 *
	 */
	public static final String $arr_act_upd_cntr = "arr_act_upd_cntr";
	/**
	 * Update counter (Receiving I/V) 更新カウンタ(受領インボイス).<p>
	 *
	 */
	public static final String $rcpt_iv_upd_cntr = "rcpt_iv_upd_cntr";
	/**
	 * Receipt dept. cd. update flg. 入荷部門ＣＤ更新ＦＬＧ.<p>
	 *
	 */
	public static final String $arr_dpt_cd_upd_flg = "arr_dpt_cd_upd_flg";
	/**
	 * Receipt PIC cd. update flg. 入荷担当者ＣＤ更新ＦＬＧ.<p>
	 *
	 */
	public static final String $arr_usr_cd_upd_flg = "arr_usr_cd_upd_flg";
	/**
	 * SEIBAN No. 1 update flg. 手配ＮＯ１更新ＦＬＧ.<p>
	 *
	 */
	public static final String $sno1_upd_flg = "sno1_upd_flg";
	/**
	 * SEIBAN No. 2 update flg. 手配ＮＯ２更新ＦＬＧ.<p>
	 *
	 */
	public static final String $sno2_upd_flg = "sno2_upd_flg";
	/**
	 * SEIBAN No. 3 update flg. 手配ＮＯ３更新ＦＬＧ.<p>
	 *
	 */
	public static final String $sno3_upd_flg = "sno3_upd_flg";
	/**
	 * SEIBAN No. 4 update flg. 手配ＮＯ４更新ＦＬＧ.<p>
	 *
	 */
	public static final String $sno4_upd_flg = "sno4_upd_flg";
	/**
	 * Lot No. update flg. ロットＮＯ更新ＦＬＧ.<p>
	 *
	 */
	public static final String $lot_no_upd_flg = "lot_no_upd_flg";
	/**
	 * Sublot No.?update flg. サブロットＮＯ更新ＦＬＧ.<p>
	 *
	 */
	public static final String $sublot_no_upd_flg = "sublot_no_upd_flg";
	/**
	 * Version No. update flg. 版ＮＯ更新ＦＬＧ.<p>
	 *
	 */
	public static final String $ver_no_upd_flg = "ver_no_upd_flg";
	/**
	 * Inventory arriving point cd. update flg. 在庫着荷先ＣＤ更新ＦＬＧ.<p>
	 *
	 */
	public static final String $stk_arrv_bp_cd_upd_flg = "stk_arrv_bp_cd_upd_flg";
	/**
	 * Grading cd. update flg. 格付ＣＤ更新ＦＬＧ.<p>
	 *
	 */
	public static final String $gd_cd_upd_flg = "gd_cd_upd_flg";
	/**
	 * Conforming type update flg. 良品区分更新ＦＬＧ.<p>
	 *
	 */
	public static final String $quality_typ_upd_flg = "quality_typ_upd_flg";
	/**
	 * Inventory inspection type update flg. 在庫検査区分更新ＦＬＧ.<p>
	 *
	 */
	public static final String $stk_insp_typ_upd_flg = "stk_insp_typ_upd_flg";
	/**
	 * Inventory identification type update flg. 在庫識別区分更新ＦＬＧ.<p>
	 *
	 */
	public static final String $stk_id_typ_upd_flg = "stk_id_typ_upd_flg";
	/**
	 * Inventory BP cd. update flg. 在庫取引先ＣＤ更新ＦＬＧ.<p>
	 *
	 */
	public static final String $stk_bp_cd_upd_flg = "stk_bp_cd_upd_flg";
	/**
	 * Supplier item cd. update flg. 発注先品目ＣＤ更新ＦＬＧ.<p>
	 *
	 */
	public static final String $sppl_itm_cd_upd_flg = "sppl_itm_cd_upd_flg";
	/**
	 * Supplier item name update flg. 発注先品名更新ＦＬＧ.<p>
	 *
	 */
	public static final String $sppl_itm_nm_upd_flg = "sppl_itm_nm_upd_flg";
	/**
	 * Maker cd. update flg. メーカーＣＤ更新ＦＬＧ.<p>
	 *
	 */
	public static final String $maker_cd_upd_flg = "maker_cd_upd_flg";
	/**
	 * Vendor lot No. Update flg. 業者ロットＮＯ更新ＦＬＧ.<p>
	 *
	 */
	public static final String $bp_lot_no_upd_flg = "bp_lot_no_upd_flg";
	/**
	 * Vendor delivery note No. update flg. 業者納品書ＮＯ更新ＦＬＧ.<p>
	 *
	 */
	public static final String $bp_dlv_slip_no_upd_flg = "bp_dlv_slip_no_upd_flg";
	/**
	 * Vendor delivery note details No. update flg. 業者納品書明細ＮＯ更新ＦＬＧ.<p>
	 *
	 */
	public static final String $bp_dlv_slip_d_no_upd_flg = "bp_dlv_slip_d_no_upd_flg";
	/**
	 * Shipping point expiration update flg. 出荷元期限更新ＦＬＧ.<p>
	 *
	 */
	public static final String $ship_fr_valid_dt_upd_flg = "ship_fr_valid_dt_upd_flg";
	/**
	 * Purchase active ingredient update flg. 仕入有効成分更新ＦＬＧ.<p>
	 *
	 */
	public static final String $purc_cont_qty_upd_flg = "purc_cont_qty_upd_flg";
	/**
	 * Inspection contact remarks update flg. 検査連絡備考更新ＦＬＧ.<p>
	 *
	 */
	public static final String $insp_cnt_rmrks_upd_flg = "insp_cnt_rmrks_upd_flg";
	/**
	 * Internal remarks update flg. 内部備考更新ＦＬＧ.<p>
	 *
	 */
	public static final String $intr_rmrks_upd_flg = "intr_rmrks_upd_flg";
	/**
	 * Transaction remarks update flg. 取引備考更新ＦＬＧ.<p>
	 *
	 */
	public static final String $trd_rmrks_upd_flg = "trd_rmrks_upd_flg";
	/**
	 * Transaction details remarks update flg. 取引明細備考更新ＦＬＧ.<p>
	 *
	 */
	public static final String $trd_d_rmrks_upd_flg = "trd_d_rmrks_upd_flg";
	/**
	 * Update spare 1 flg. 予備１更新ＦＬＧ.<p>
	 *
	 */
	public static final String $sub_char1_upd_flg = "sub_char1_upd_flg";
	/**
	 * Update spare 2 flg. 予備２更新ＦＬＧ.<p>
	 *
	 */
	public static final String $sub_char2_upd_flg = "sub_char2_upd_flg";
	/**
	 * Update spare 3 flg. 予備３更新ＦＬＧ.<p>
	 *
	 */
	public static final String $sub_char3_upd_flg = "sub_char3_upd_flg";
	/**
	 * Receipt progress No. update flg. 入荷進捗ＮＯ更新ＦＬＧ.<p>
	 *
	 */
	public static final String $arr_pr_no_upd_flg = "arr_pr_no_upd_flg";
	/**
	 * Invoice No. update flg. インボイスＮＯ更新ＦＬＧ.<p>
	 *
	 */
	public static final String $iv_no_upd_flg = "iv_no_upd_flg";

	public static final String $arr_act_no = $arr_act + ".arr_act_no";
	public static final String $arr_act_rev = $arr_act + ".arr_act_rev";
	public static final String $arr_schd_no = $arr_act + ".arr_schd_no";
	public static final String $trd_cd = $arr_act + ".trd_cd";
	public static final String $trd_ptn_typ = $arr_act + ".trd_ptn_typ";
	public static final String $purc_act_io_no = $arr_act + ".purc_act_io_no";
	public static final String $arr_tm = $arr_act + ".arr_tm";
	public static final String $ac_dt = $arr_act + ".ac_dt";
	public static final String $arr_loc_cd = $arr_act + ".arr_loc_cd";
	public static final String $str_ln_cd = $arr_act + ".str_ln_cd";
	public static final String $arr_dpt_cd = $arr_act + ".arr_dpt_cd";
	public static final String $arr_usr_cd = $arr_act + ".arr_usr_cd";
	public static final String $itm_cd = $arr_act + ".itm_cd";
	public static final String $itm_sub1 = $arr_act + ".itm_sub1";
	public static final String $itm_sub2 = $arr_act + ".itm_sub2";
	public static final String $itm_sub3 = $arr_act + ".itm_sub3";
	public static final String $itm_nm = $arr_act + ".itm_nm";
	public static final String $rcpt_iv_itm_nm = $arr_act + ".rcpt_iv_itm_nm";
	public static final String $sundry_itm_flg = $arr_act + ".sundry_itm_flg";
	public static final String $purc_id_typ = $arr_act + ".purc_id_typ";
	public static final String $stk_mng_typ = $arr_act + ".stk_mng_typ";
	public static final String $sno1 = $arr_act + ".sno1";
	public static final String $sno1_mng_typ = $arr_act + ".sno1_mng_typ";
	public static final String $sno2 = $arr_act + ".sno2";
	public static final String $sno2_mng_typ = $arr_act + ".sno2_mng_typ";
	public static final String $sno3 = $arr_act + ".sno3";
	public static final String $sno3_mng_typ = $arr_act + ".sno3_mng_typ";
	public static final String $sno4 = $arr_act + ".sno4";
	public static final String $sno4_mng_typ = $arr_act + ".sno4_mng_typ";
	public static final String $lot_no = $arr_act + ".lot_no";
	public static final String $sublot_no = $arr_act + ".sublot_no";
	public static final String $ver_no = $arr_act + ".ver_no";
	public static final String $stk_arrv_bp_cd = $arr_act + ".stk_arrv_bp_cd";
	public static final String $gd_cd = $arr_act + ".gd_cd";
	public static final String $quality_typ = $arr_act + ".quality_typ";
	public static final String $stk_insp_typ = $arr_act + ".stk_insp_typ";
	public static final String $stk_id_typ = $arr_act + ".stk_id_typ";
	public static final String $stk_bp_cd = $arr_act + ".stk_bp_cd";
	public static final String $sppl_itm_cd = $arr_act + ".sppl_itm_cd";
	public static final String $sppl_itm_nm = $arr_act + ".sppl_itm_nm";
	public static final String $rqst_dpt_cd = $arr_act + ".rqst_dpt_cd";
	public static final String $rqst_usr_cd = $arr_act + ".rqst_usr_cd";
	public static final String $cst_cd = $arr_act + ".cst_cd";
	public static final String $sret_fr_cd = $arr_act + ".sret_fr_cd";
	public static final String $sppl_cd = $arr_act + ".sppl_cd";
	public static final String $ret_loc_cd = $arr_act + ".ret_loc_cd";
	public static final String $ret_str_ln_cd = $arr_act + ".ret_str_ln_cd";
	public static final String $ret_gd_cd = $arr_act + ".ret_gd_cd";
	public static final String $maker_cd = $arr_act + ".maker_cd";
	public static final String $bp_lot_no = $arr_act + ".bp_lot_no";
	public static final String $bp_dlv_slip_no = $arr_act + ".bp_dlv_slip_no";
	public static final String $bp_dlv_slip_d_no = $arr_act + ".bp_dlv_slip_d_no";
	public static final String $ship_fr_valid_dt = $arr_act + ".ship_fr_valid_dt";
	public static final String $trd_unit_qty = $arr_act + ".trd_unit_qty";
	public static final String $trd_unit_cd = $arr_act + ".trd_unit_cd";
	public static final String $base_unit_qty = $arr_act + ".base_unit_qty";
	public static final String $base_unit_cd = $arr_act + ".base_unit_cd";
	public static final String $trd_cur_amt = $arr_act + ".trd_cur_amt";
	public static final String $trd_cur_tax_amt = $arr_act + ".trd_cur_tax_amt";
	public static final String $base_cur_amt = $arr_act + ".base_cur_amt";
	public static final String $base_cur_tax_amt = $arr_act + ".base_cur_tax_amt";
	public static final String $ptax_cur_amt = $arr_act + ".ptax_cur_amt";
	public static final String $ptax_cur_tax_amt = $arr_act + ".ptax_cur_tax_amt";
	public static final String $purc_cont_qty = $arr_act + ".purc_cont_qty";
	public static final String $rsn_cd = $arr_act + ".rsn_cd";
	public static final String $bd_dpt_cd = $arr_act + ".bd_dpt_cd";
	public static final String $bd_wg_cd = $arr_act + ".bd_wg_cd";
	public static final String $sync_flg = $arr_act + ".sync_flg";
	public static final String $edi_flg = $arr_act + ".edi_flg";
	public static final String $edi_bp_dlv_slip_no = $arr_act + ".edi_bp_dlv_slip_no";
	public static final String $edi_bp_dlv_slip_d_no = $arr_act + ".edi_bp_dlv_slip_d_no";
	public static final String $dlv_slip_no = $arr_act + ".dlv_slip_no";
	public static final String $dlv_slip_d_no = $arr_act + ".dlv_slip_d_no";
	public static final String $insp_cnt_rmrks = $arr_act + ".insp_cnt_rmrks";
	public static final String $intr_rmrks = $arr_act + ".intr_rmrks";
	public static final String $trd_rmrks = $arr_act + ".trd_rmrks";
	public static final String $trd_d_rmrks = $arr_act + ".trd_d_rmrks";
	public static final String $sub_char1 = $arr_act + ".sub_char1";
	public static final String $sub_char2 = $arr_act + ".sub_char2";
	public static final String $sub_char3 = $arr_act + ".sub_char3";
	public static final String $pack_unit_qty = $arr_act + ".pack_unit_qty";
	public static final String $pack_unit_cd = $arr_act + ".pack_unit_cd";
	public static final String $can_flg = $arr_act + ".can_flg";
	public static final String $wms_flg = $arr_act + ".wms_flg";
	public static final String $ext_sys_cd = $arr_act + ".ext_sys_cd";
	public static final String $ext_arr_act_no = $arr_act + ".ext_arr_act_no";
	public static final String $lg_grp_cd = $arr_act + ".lg_grp_cd";
	public static final String $wg_cd = $arr_act + ".wg_cd";

	public static final MCMeta peg_no_META = createCommonMeta($peg_no, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta data_crud_typ_META = createCommonMeta($data_crud_typ, mcframe.commonMA.meta.MA_META.DATA_CRUD_TYP);
	public static final MCMeta err_flg_META = createCommonMeta($err_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta rtn_sts_typ_META = createCommonMeta($rtn_sts_typ, mcframe.commonMA.meta.MA_META.RTN_STS_TYP);
	public static final MCMeta arr_act_META = createInnerRowMeta($arr_act, mcframe.serverMS.dbc.MST_ARR_ACT_R.class);
	public static final MCMeta pr_sts_typ_META = createCommonMeta($pr_sts_typ, mcframe.commonMS.meta.MS_META.PR_STS_TYP);
	public static final MCMeta pr_sts_typ_nm_META = createCommonMeta($pr_sts_typ_nm, mcframe.commonMS.meta.MS_META.PR_STS_TYP_NM);
	public static final MCMeta asset_mng_typ_META = createCommonMeta($asset_mng_typ, mcframe.commonMA.meta.MA_META.ASSET_MNG_TYP);
	public static final MCMeta ver_flg_META = createCommonMeta($ver_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta lot_mng_typ_META = createCommonMeta($lot_mng_typ, mcframe.commonMA.meta.MA_META.LOT_MNG_TYP);
	public static final MCMeta lot_no_typ_META = createCommonMeta($lot_no_typ, mcframe.commonMA.meta.MA_META.LOT_NO_TYP);
	public static final MCMeta sublot_mng_typ_META = createCommonMeta($sublot_mng_typ, mcframe.commonMA.meta.MA_META.SUBLOT_MNG_TYP);
	public static final MCMeta sublot_no_typ_META = createCommonMeta($sublot_no_typ, mcframe.commonMA.meta.MA_META.LOT_NO_TYP);
	public static final MCMeta bp_lot_flg_META = createCommonMeta($bp_lot_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta arr_str_ln_tgt_flg_META = createCommonMeta($arr_str_ln_tgt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta ret_dlv_slip_d_no_META = createCommonMeta($ret_dlv_slip_d_no, mcframe.commonMA.meta.MA_META.DLV_SLIP_D_NO);
	public static final MCMeta ret_str_ln_tgt_flg_META = createCommonMeta($ret_str_ln_tgt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta can_ac_dt_META = createCommonMeta($can_ac_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta arr_dt_META = createCommonMeta($arr_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta arr_wg_cd_META = createCommonMeta($arr_wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta arr_pr_no_META = createCommonMeta($arr_pr_no, mcframe.commonMA.meta.MA_META.ARR_PR_NO);
	public static final MCMeta rcpt_iv_no_META = createCommonMeta($rcpt_iv_no, mcframe.commonMA.meta.MA_META.IV_NO);
	public static final MCMeta rcpt_iv_mng_no_META = createCommonMeta($rcpt_iv_mng_no, mcframe.commonMA.meta.MA_META.RCPT_IV_MNG_NO);
	public static final MCMeta iv_no_META = createCommonMeta($iv_no, mcframe.commonMA.meta.MA_META.IV_NO);
	public static final MCMeta po_no_META = createCommonMeta($po_no, mcframe.commonMA.meta.MA_META.PO_NO);
	public static final MCMeta po_d_no_META = createCommonMeta($po_d_no, mcframe.commonMA.meta.MA_META.PO_D_NO);
	public static final MCMeta prov_act_no_META = createCommonMeta($prov_act_no, mcframe.commonMA.meta.MA_META.PROV_ACT_NO);
	public static final MCMeta arr_ptn_typ_META = createCommonMeta($arr_ptn_typ, mcframe.commonMA.meta.MA_META.ARR_PTN_TYP);
	public static final MCMeta abort_flg_META = createCommonMeta($abort_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta crt_lot_flg_META = createCommonMeta($crt_lot_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta same_lot_flg_META = createCommonMeta($same_lot_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta io_schd_pr_no_META = createCommonMeta($io_schd_pr_no, mcframe.commonMA.meta.MA_META.IO_SCHD_PR_NO);
	public static final MCMeta prov_typ_META = createCommonMeta($prov_typ, mcframe.commonMA.meta.MA_META.PROV_TYP);
	public static final MCMeta prov_basis_typ_META = createCommonMeta($prov_basis_typ, mcframe.commonMA.meta.MA_META.PROV_BASIS_TYP);
	public static final MCMeta mfg_inst_no_META = createCommonMeta($mfg_inst_no, mcframe.commonMA.meta.MA_META.MFG_INST_NO);
	public static final MCMeta pre_outsrc_act_flg_META = createCommonMeta($pre_outsrc_act_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta prnt_flg_META = createCommonMeta($prnt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta cststk_flg_META = createCommonMeta($cststk_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta acxfr_gi_flg_META = createCommonMeta($acxfr_gi_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta xpns_purc_flg_META = createCommonMeta($xpns_purc_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sls_acxfr_flg_META = createCommonMeta($sls_acxfr_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta purc_flg_META = createCommonMeta($purc_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sls_rtn_flg_META = createCommonMeta($sls_rtn_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta xfr_flg_META = createCommonMeta($xfr_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta trd_unit_dec_place_META = createCommonMeta($trd_unit_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta cont_fctr_dec_place_META = createCommonMeta($cont_fctr_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta arr_pr_upd_cntr_META = createCommonMeta($arr_pr_upd_cntr, mcframe.commonMA.meta.MA_META.UPD_CNT);
	public static final MCMeta arr_act_upd_cntr_META = createCommonMeta($arr_act_upd_cntr, mcframe.commonMA.meta.MA_META.UPD_CNT);
	public static final MCMeta rcpt_iv_upd_cntr_META = createCommonMeta($rcpt_iv_upd_cntr, mcframe.commonMA.meta.MA_META.UPD_CNT);
	public static final MCMeta arr_dpt_cd_upd_flg_META = createCommonMeta($arr_dpt_cd_upd_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta arr_usr_cd_upd_flg_META = createCommonMeta($arr_usr_cd_upd_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sno1_upd_flg_META = createCommonMeta($sno1_upd_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sno2_upd_flg_META = createCommonMeta($sno2_upd_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sno3_upd_flg_META = createCommonMeta($sno3_upd_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sno4_upd_flg_META = createCommonMeta($sno4_upd_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta lot_no_upd_flg_META = createCommonMeta($lot_no_upd_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sublot_no_upd_flg_META = createCommonMeta($sublot_no_upd_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta ver_no_upd_flg_META = createCommonMeta($ver_no_upd_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta stk_arrv_bp_cd_upd_flg_META = createCommonMeta($stk_arrv_bp_cd_upd_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta gd_cd_upd_flg_META = createCommonMeta($gd_cd_upd_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta quality_typ_upd_flg_META = createCommonMeta($quality_typ_upd_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta stk_insp_typ_upd_flg_META = createCommonMeta($stk_insp_typ_upd_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta stk_id_typ_upd_flg_META = createCommonMeta($stk_id_typ_upd_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta stk_bp_cd_upd_flg_META = createCommonMeta($stk_bp_cd_upd_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sppl_itm_cd_upd_flg_META = createCommonMeta($sppl_itm_cd_upd_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sppl_itm_nm_upd_flg_META = createCommonMeta($sppl_itm_nm_upd_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta maker_cd_upd_flg_META = createCommonMeta($maker_cd_upd_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta bp_lot_no_upd_flg_META = createCommonMeta($bp_lot_no_upd_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta bp_dlv_slip_no_upd_flg_META = createCommonMeta($bp_dlv_slip_no_upd_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta bp_dlv_slip_d_no_upd_flg_META = createCommonMeta($bp_dlv_slip_d_no_upd_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta ship_fr_valid_dt_upd_flg_META = createCommonMeta($ship_fr_valid_dt_upd_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta purc_cont_qty_upd_flg_META = createCommonMeta($purc_cont_qty_upd_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta insp_cnt_rmrks_upd_flg_META = createCommonMeta($insp_cnt_rmrks_upd_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta intr_rmrks_upd_flg_META = createCommonMeta($intr_rmrks_upd_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta trd_rmrks_upd_flg_META = createCommonMeta($trd_rmrks_upd_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta trd_d_rmrks_upd_flg_META = createCommonMeta($trd_d_rmrks_upd_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sub_char1_upd_flg_META = createCommonMeta($sub_char1_upd_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sub_char2_upd_flg_META = createCommonMeta($sub_char2_upd_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sub_char3_upd_flg_META = createCommonMeta($sub_char3_upd_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta arr_pr_no_upd_flg_META = createCommonMeta($arr_pr_no_upd_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta iv_no_upd_flg_META = createCommonMeta($iv_no_upd_flg, mcframe.commonMA.meta.MA_META.FLG);

	protected static final ConstMetaList<ArrActIF_DtlR> constMetas = new ConstMetaList<ArrActIF_DtlR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			peg_no_META,
			data_crud_typ_META,
			err_flg_META,
			rtn_sts_typ_META,
			arr_act_META,
			pr_sts_typ_META,
			pr_sts_typ_nm_META,
			asset_mng_typ_META,
			ver_flg_META,
			lot_mng_typ_META,
			lot_no_typ_META,
			sublot_mng_typ_META,
			sublot_no_typ_META,
			bp_lot_flg_META,
			arr_str_ln_tgt_flg_META,
			ret_dlv_slip_d_no_META,
			ret_str_ln_tgt_flg_META,
			can_ac_dt_META,
			arr_dt_META,
			arr_wg_cd_META,
			arr_pr_no_META,
			rcpt_iv_no_META,
			rcpt_iv_mng_no_META,
			iv_no_META,
			po_no_META,
			po_d_no_META,
			prov_act_no_META,
			arr_ptn_typ_META,
			abort_flg_META,
			crt_lot_flg_META,
			same_lot_flg_META,
			io_schd_pr_no_META,
			prov_typ_META,
			prov_basis_typ_META,
			mfg_inst_no_META,
			pre_outsrc_act_flg_META,
			prnt_flg_META,
			cststk_flg_META,
			acxfr_gi_flg_META,
			xpns_purc_flg_META,
			sls_acxfr_flg_META,
			purc_flg_META,
			sls_rtn_flg_META,
			xfr_flg_META,
			trd_unit_dec_place_META,
			cont_fctr_dec_place_META,
			arr_pr_upd_cntr_META,
			arr_act_upd_cntr_META,
			rcpt_iv_upd_cntr_META,
			arr_dpt_cd_upd_flg_META,
			arr_usr_cd_upd_flg_META,
			sno1_upd_flg_META,
			sno2_upd_flg_META,
			sno3_upd_flg_META,
			sno4_upd_flg_META,
			lot_no_upd_flg_META,
			sublot_no_upd_flg_META,
			ver_no_upd_flg_META,
			stk_arrv_bp_cd_upd_flg_META,
			gd_cd_upd_flg_META,
			quality_typ_upd_flg_META,
			stk_insp_typ_upd_flg_META,
			stk_id_typ_upd_flg_META,
			stk_bp_cd_upd_flg_META,
			sppl_itm_cd_upd_flg_META,
			sppl_itm_nm_upd_flg_META,
			maker_cd_upd_flg_META,
			bp_lot_no_upd_flg_META,
			bp_dlv_slip_no_upd_flg_META,
			bp_dlv_slip_d_no_upd_flg_META,
			ship_fr_valid_dt_upd_flg_META,
			purc_cont_qty_upd_flg_META,
			insp_cnt_rmrks_upd_flg_META,
			intr_rmrks_upd_flg_META,
			trd_rmrks_upd_flg_META,
			trd_d_rmrks_upd_flg_META,
			sub_char1_upd_flg_META,
			sub_char2_upd_flg_META,
			sub_char3_upd_flg_META,
			arr_pr_no_upd_flg_META,
			iv_no_upd_flg_META
		},
		new String[][]{
			{
				"arr_act_no",
				"arr_act_rev",
				"arr_schd_no",
				"trd_cd",
				"trd_ptn_typ",
				"purc_act_io_no",
				"arr_tm",
				"ac_dt",
				"arr_loc_cd",
				"str_ln_cd",
				"arr_dpt_cd",
				"arr_usr_cd",
				"itm_cd",
				"itm_sub1",
				"itm_sub2",
				"itm_sub3",
				"itm_nm",
				"rcpt_iv_itm_nm",
				"sundry_itm_flg",
				"purc_id_typ",
				"stk_mng_typ",
				"sno1",
				"sno1_mng_typ",
				"sno2",
				"sno2_mng_typ",
				"sno3",
				"sno3_mng_typ",
				"sno4",
				"sno4_mng_typ",
				"lot_no",
				"sublot_no",
				"ver_no",
				"stk_arrv_bp_cd",
				"gd_cd",
				"quality_typ",
				"stk_insp_typ",
				"stk_id_typ",
				"stk_bp_cd",
				"sppl_itm_cd",
				"sppl_itm_nm",
				"rqst_dpt_cd",
				"rqst_usr_cd",
				"cst_cd",
				"sret_fr_cd",
				"sppl_cd",
				"ret_loc_cd",
				"ret_str_ln_cd",
				"ret_gd_cd",
				"maker_cd",
				"bp_lot_no",
				"bp_dlv_slip_no",
				"bp_dlv_slip_d_no",
				"ship_fr_valid_dt",
				"trd_unit_qty",
				"trd_unit_cd",
				"base_unit_qty",
				"base_unit_cd",
				"trd_cur_amt",
				"trd_cur_tax_amt",
				"base_cur_amt",
				"base_cur_tax_amt",
				"ptax_cur_amt",
				"ptax_cur_tax_amt",
				"purc_cont_qty",
				"rsn_cd",
				"bd_dpt_cd",
				"bd_wg_cd",
				"sync_flg",
				"edi_flg",
				"edi_bp_dlv_slip_no",
				"edi_bp_dlv_slip_d_no",
				"dlv_slip_no",
				"dlv_slip_d_no",
				"insp_cnt_rmrks",
				"intr_rmrks",
				"trd_rmrks",
				"trd_d_rmrks",
				"sub_char1",
				"sub_char2",
				"sub_char3",
				"pack_unit_qty",
				"pack_unit_cd",
				"can_flg",
				"wms_flg",
				"ext_sys_cd",
				"ext_arr_act_no",
				"lg_grp_cd",
				"wg_cd"
			},
			{
				$arr_act_no,
				$arr_act_rev,
				$arr_schd_no,
				$trd_cd,
				$trd_ptn_typ,
				$purc_act_io_no,
				$arr_tm,
				$ac_dt,
				$arr_loc_cd,
				$str_ln_cd,
				$arr_dpt_cd,
				$arr_usr_cd,
				$itm_cd,
				$itm_sub1,
				$itm_sub2,
				$itm_sub3,
				$itm_nm,
				$rcpt_iv_itm_nm,
				$sundry_itm_flg,
				$purc_id_typ,
				$stk_mng_typ,
				$sno1,
				$sno1_mng_typ,
				$sno2,
				$sno2_mng_typ,
				$sno3,
				$sno3_mng_typ,
				$sno4,
				$sno4_mng_typ,
				$lot_no,
				$sublot_no,
				$ver_no,
				$stk_arrv_bp_cd,
				$gd_cd,
				$quality_typ,
				$stk_insp_typ,
				$stk_id_typ,
				$stk_bp_cd,
				$sppl_itm_cd,
				$sppl_itm_nm,
				$rqst_dpt_cd,
				$rqst_usr_cd,
				$cst_cd,
				$sret_fr_cd,
				$sppl_cd,
				$ret_loc_cd,
				$ret_str_ln_cd,
				$ret_gd_cd,
				$maker_cd,
				$bp_lot_no,
				$bp_dlv_slip_no,
				$bp_dlv_slip_d_no,
				$ship_fr_valid_dt,
				$trd_unit_qty,
				$trd_unit_cd,
				$base_unit_qty,
				$base_unit_cd,
				$trd_cur_amt,
				$trd_cur_tax_amt,
				$base_cur_amt,
				$base_cur_tax_amt,
				$ptax_cur_amt,
				$ptax_cur_tax_amt,
				$purc_cont_qty,
				$rsn_cd,
				$bd_dpt_cd,
				$bd_wg_cd,
				$sync_flg,
				$edi_flg,
				$edi_bp_dlv_slip_no,
				$edi_bp_dlv_slip_d_no,
				$dlv_slip_no,
				$dlv_slip_d_no,
				$insp_cnt_rmrks,
				$intr_rmrks,
				$trd_rmrks,
				$trd_d_rmrks,
				$sub_char1,
				$sub_char2,
				$sub_char3,
				$pack_unit_qty,
				$pack_unit_cd,
				$can_flg,
				$wms_flg,
				$ext_sys_cd,
				$ext_arr_act_no,
				$lg_grp_cd,
				$wg_cd
			}
		}
	);

	/** 項目属性情報のグループ[REQ_UPD_CNT_CHK]のキー定数 */
	public static final String $$REQ_UPD_CNT_CHK = "REQ_UPD_CNT_CHK";
	/** 項目属性情報のグループ[REQUIRED]のキー定数 */
	public static final String $$REQUIRED = "REQUIRED";
	/** 項目属性情報のグループ[CHK_NUM]のキー定数 */
	public static final String $$CHK_NUM = "CHK_NUM";
	/** 項目属性情報のグループ[CHK_DT]のキー定数 */
	public static final String $$CHK_DT = "CHK_DT";
	/** 項目属性情報のグループ[BEFORE_AFTER]のキー定数 */
	public static final String $$BEFORE_AFTER = "BEFORE_AFTER";
	/** 項目属性情報のグループ[DUPLICATE]のキー定数 */
	public static final String $$DUPLICATE = "DUPLICATE";
	/** 項目属性情報のグループ[CONST]のキー定数 */
	public static final String $$CONST = "CONST";
	/** 項目属性情報のグループ[NULL_VAL]のキー定数 */
	public static final String $$NULL_VAL = "NULL_VAL";
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

	/**
	 * グループ毎に定義される項目属性情報です。
	 */
	protected static final MCExtMap EXTMAP = new MCExtMap(
		null,
		new MCExtMap.Entry($$REQ_UPD_CNT_CHK, new MCExtList(
			new String[][]{
				{$arr_act + ".arr_act_no", "U,D"}	// arr_act.arr_act_no
			}
		)),
		new MCExtMap.Entry($$REQUIRED, new MCExtList(
			new String[][]{
				{$peg_no, "E"},	// peg_no
				{$data_crud_typ, "E"},	// data_crud_typ
				{$arr_act + ".trd_cd", "I,U"},	// arr_act.trd_cd
				{$arr_act + ".trd_ptn_typ", "I,U"},	// arr_act.trd_ptn_typ
				{$arr_act + ".arr_tm", "I,U"},	// arr_act.arr_tm
				{$arr_act + ".ac_dt", "I,U"},	// arr_act.ac_dt
				{$arr_act + ".arr_loc_cd", "I,U"},	// arr_act.arr_loc_cd
				{$arr_act + ".itm_cd", "I,U"},	// arr_act.itm_cd
				{$arr_act + ".itm_sub1", "I,U"},	// arr_act.itm_sub1
				{$arr_act + ".itm_sub2", "I,U"},	// arr_act.itm_sub2
				{$arr_act + ".itm_sub3", "I,U"},	// arr_act.itm_sub3
				{$arr_act + ".trd_unit_qty", "I,U"},	// arr_act.trd_unit_qty
				{$arr_act + ".trd_unit_cd", "I,U"},	// arr_act.trd_unit_cd
				{$arr_act + ".base_unit_qty", "I,U"},	// arr_act.base_unit_qty
				{$arr_act + ".base_unit_cd", "I,U"},	// arr_act.base_unit_cd
				{$can_ac_dt, "U,D"}	// can_ac_dt
			}
		)),
		new MCExtMap.Entry($$CHK_NUM, new MCExtList(
			new String[][]{
				{$arr_act + ".trd_unit_qty", "positive"},	// arr_act.trd_unit_qty
				{$arr_act + ".purc_cont_qty", "positive"}	// arr_act.purc_cont_qty
			}
		)),
		new MCExtMap.Entry($$CHK_DT, new MCExtList(
			new String[][]{
				{$arr_act + ".arr_tm", "tmbfToday"},	// arr_act.arr_tm
				{$arr_act + ".ac_dt", "bfToday"},	// arr_act.ac_dt
				{$can_ac_dt, "bfToday"}	// can_ac_dt
			}
		)),
		new MCExtMap.Entry($$BEFORE_AFTER, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$DUPLICATE, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$CONST, new MCExtList(
			new String[][]{
				{$data_crud_typ, "MAC_DATA_CRUD_TYP"},	// data_crud_typ
				{$arr_act + ".trd_ptn_typ", "MAC_TRD_PTN_TYP"},	// arr_act.trd_ptn_typ
				{$arr_act + ".purc_id_typ", "MAC_PURC_ID_TYP"},	// arr_act.purc_id_typ
				{$arr_act + ".quality_typ", "MAC_QUALITY_TYP"},	// arr_act.quality_typ
				{$arr_act + ".stk_insp_typ", "MSC_STK_INSP_TYP"},	// arr_act.stk_insp_typ
				{$arr_act + ".stk_id_typ", "MSC_STK_ID_TYP"},	// arr_act.stk_id_typ
				{$arr_ptn_typ, "MSC_ARR_PTN_TYP"}	// arr_ptn_typ
			}
		)),
		new MCExtMap.Entry($$NULL_VAL, new MCExtList(
			new String[][]{
				{$arr_act + ".str_ln_cd", "E"},	// arr_act.str_ln_cd
				{$arr_act + ".itm_sub1", "E"},	// arr_act.itm_sub1
				{$arr_act + ".itm_sub2", "E"},	// arr_act.itm_sub2
				{$arr_act + ".itm_sub3", "E"},	// arr_act.itm_sub3
				{$arr_act + ".sno1", "E"},	// arr_act.sno1
				{$arr_act + ".sno2", "E"},	// arr_act.sno2
				{$arr_act + ".sno3", "E"},	// arr_act.sno3
				{$arr_act + ".sno4", "E"}	// arr_act.sno4
			}
		)),
		new MCExtMap.Entry($$LIST_LOGIC, new MCExtList(
			new String[][]{
				{$arr_act + ".trd_cd", "MA.MAUAL0010.Trd"},	// arr_act.trd_cd
				{$arr_act + ".arr_loc_cd", "MA.MAUAL0010.Loc"},	// arr_act.arr_loc_cd
				{$arr_act + ".str_ln_cd", "MA.MAUAL0010.StrLn"},	// arr_act.str_ln_cd
				{$arr_act + ".arr_dpt_cd", "MA.MAUAL0010.Dpt"},	// arr_act.arr_dpt_cd
				{$arr_act + ".arr_usr_cd", "MA.MAUAL0010.Usr"},	// arr_act.arr_usr_cd
				{$arr_act + ".itm_sub3", "MA.MAUAL0010.ItmSub3"},	// arr_act.itm_sub3
				{$arr_act + ".gd_cd", "MA.MAUAL0010.StkGd"},	// arr_act.gd_cd
				{$arr_act + ".cst_cd", "MA.MAUAL0010.Bp"},	// arr_act.cst_cd
				{$arr_act + ".sret_fr_cd", "MA.MAUAL0010.Bp"},	// arr_act.sret_fr_cd
				{$arr_act + ".sppl_cd", "MA.MAUAL0010.Bp"},	// arr_act.sppl_cd
				{$arr_act + ".ret_loc_cd", "MA.MAUAL0010.Loc"},	// arr_act.ret_loc_cd
				{$arr_act + ".ret_str_ln_cd", "MA.MAUAL0010.StrLn"},	// arr_act.ret_str_ln_cd
				{$arr_act + ".ret_gd_cd", "MA.MAUAL0010.StkGd"},	// arr_act.ret_gd_cd
				{$arr_act + ".maker_cd", "MA.MAUAL0010.Bp"},	// arr_act.maker_cd
				{$arr_act + ".trd_unit_cd", "MA.MAUAL0010.ItmUnit"},	// arr_act.trd_unit_cd
				{$arr_act + ".rsn_cd", "MA.MAUAL0010.ArrBizRsn"},	// arr_act.rsn_cd
				{$arr_act + ".bd_dpt_cd", "MA.MAUAL0010.Dpt"},	// arr_act.bd_dpt_cd
				{$arr_act + ".lg_grp_cd", "MA.MAUAL0010.LgGrp"},	// arr_act.lg_grp_cd
				{$arr_act + ".wg_cd", "MA.MAUAL0010.Wg"}	// arr_act.wg_cd
			}
		)),
		new MCExtMap.Entry($$LIST_OUT, new MCExtList(
			new String[][]{
				{$arr_act + ".arr_loc_cd", "arr_str_ln_tgt_flg"},	// arr_act.arr_loc_cd
				{$arr_act + ".itm_sub3", "asset_mng_typ;ver_flg;lot_mng_typ;sublot_mng_typ;lot_no_typ;sublot_no_typ;bp_lot_flg;cont_fctr_dec_place"},	// arr_act.itm_sub3
				{$arr_act + ".ret_loc_cd", "ret_str_ln_tgt_flg"},	// arr_act.ret_loc_cd
				{$arr_act + ".trd_unit_cd", "trd_unit_dec_place"},	// arr_act.trd_unit_cd
				{$arr_act + ".rsn_cd", "acxfr_gi_flg;xpns_purc_flg;purc_flg;sls_rtn_flg;xfr_flg;sls_acxfr_flg"},	// arr_act.rsn_cd
				{$arr_act + ".bd_dpt_cd", "bd_wg_cd"}	// arr_act.bd_dpt_cd
			}
		)),
		new MCExtMap.Entry($$LIST_OUT_BASE, new MCExtList(
			new String[][]{
				{$arr_act + ".arr_loc_cd", "str_ln_tgt_flg"},	// arr_act.arr_loc_cd
				{$arr_act + ".itm_sub3", "asset_mng_typ;ver_flg;lot_mng_typ;sublot_mng_typ;lot_no_typ;sublot_no_typ;bp_lot_flg;cont_fctr_dec_place"},	// arr_act.itm_sub3
				{$arr_act + ".ret_loc_cd", "str_ln_tgt_flg"},	// arr_act.ret_loc_cd
				{$arr_act + ".trd_unit_cd", "dec_place"},	// arr_act.trd_unit_cd
				{$arr_act + ".rsn_cd", "acxfr_gi_flg;xpns_purc_flg;out_purc_flg;out_sls_rtn_flg;out_xfr_flg;sls_acxfr_flg"},	// arr_act.rsn_cd
				{$arr_act + ".bd_dpt_cd", "wg_cd"}	// arr_act.bd_dpt_cd
			}
		)),
		new MCExtMap.Entry($$LIST_IN, new MCExtList(
			new String[][]{
				{$arr_act + ".str_ln_cd", "arr_loc_cd;true"},	// arr_act.str_ln_cd
				{$arr_act + ".arr_dpt_cd", "arr_tm;MAC_DPT_IS_SRCH_TYP.ARR"},	// arr_act.arr_dpt_cd
				{$arr_act + ".itm_sub3", "itm_cd;itm_sub1;itm_sub2;MAC_ITM_IS_SRCH_TYP.NOT_ASSET3"},	// arr_act.itm_sub3
				{$arr_act + ".cst_cd", "MAC_BP_IS_SRCH_TYP.CST"},	// arr_act.cst_cd
				{$arr_act + ".sret_fr_cd", "MAC_BP_IS_SRCH_TYP.DLV"},	// arr_act.sret_fr_cd
				{$arr_act + ".sppl_cd", "MAC_BP_IS_SRCH_TYP.SPPL"},	// arr_act.sppl_cd
				{$arr_act + ".ret_loc_cd", "MAC_LOC_IS_SRCH_TYP.HOUSE"},	// arr_act.ret_loc_cd
				{$arr_act + ".ret_str_ln_cd", "ret_loc_cd;true"},	// arr_act.ret_str_ln_cd
				{$arr_act + ".maker_cd", "MAC_BP_IS_SRCH_TYP.MAKER;true"},	// arr_act.maker_cd
				{$arr_act + ".trd_unit_cd", "itm_cd;itm_sub1;itm_sub2;itm_sub3"},	// arr_act.trd_unit_cd
				{$arr_act + ".bd_dpt_cd", "MAC_DPT_IS_SRCH_TYP.BD;ac_dt"},	// arr_act.bd_dpt_cd
				{$arr_act + ".lg_grp_cd", "true"}	// arr_act.lg_grp_cd
			}
		)),
		new MCExtMap.Entry($$LIST_IN_BASE, new MCExtList(
			new String[][]{
				{$arr_act + ".str_ln_cd", "loc_cd;mode_nullval_flg"},	// arr_act.str_ln_cd
				{$arr_act + ".arr_dpt_cd", "dt;dpt_is_srch_typ"},	// arr_act.arr_dpt_cd
				{$arr_act + ".itm_sub3", "itm_cd;itm_sub1;itm_sub2;itm_is_srch_typ"},	// arr_act.itm_sub3
				{$arr_act + ".cst_cd", "bp_is_srch_typ"},	// arr_act.cst_cd
				{$arr_act + ".sret_fr_cd", "bp_is_srch_typ"},	// arr_act.sret_fr_cd
				{$arr_act + ".sppl_cd", "bp_is_srch_typ"},	// arr_act.sppl_cd
				{$arr_act + ".ret_loc_cd", "loc_is_srch_typ"},	// arr_act.ret_loc_cd
				{$arr_act + ".ret_str_ln_cd", "loc_cd;mode_nullval_flg"},	// arr_act.ret_str_ln_cd
				{$arr_act + ".maker_cd", "bp_is_srch_typ;mode_nullval_flg"},	// arr_act.maker_cd
				{$arr_act + ".trd_unit_cd", "itm_cd;itm_sub1;itm_sub2;itm_sub3"},	// arr_act.trd_unit_cd
				{$arr_act + ".bd_dpt_cd", "dpt_is_srch_typ;dt"},	// arr_act.bd_dpt_cd
				{$arr_act + ".lg_grp_cd", "loc_flg"}	// arr_act.lg_grp_cd
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
	protected ArrActIF_DtlR_MC_A(ConstMetaList<? extends ArrActIF_DtlR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public ArrActIF_DtlR clone() {
		return (ArrActIF_DtlR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public ArrActIF_DtlR createInstance() {
		return (ArrActIF_DtlR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public ArrActIF_DtlR getValues(String... names) {
		return (ArrActIF_DtlR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * Data pegging No. データ紐付けＮＯ.<p>
	 *
	 */
	public MCNumber peg_no() {
		return getConstNumber(offset + 0, $peg_no);
	}

	/**
	 * Data pegging No. データ紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(MCNumber value) {
		setConstNumber(offset + 0, $peg_no, value);
	}

	/**
	 * Data pegging No. データ紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(int value) {
		setConstNumber(offset + 0, $peg_no, value);
	}

	/**
	 * Data pegging No. データ紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(long value) {
		setConstNumber(offset + 0, $peg_no, value);
	}

	/**
	 * Data pegging No. データ紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(float value) {
		setConstNumber(offset + 0, $peg_no, value);
	}

	/**
	 * Data pegging No. データ紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(double value) {
		setConstNumber(offset + 0, $peg_no, value);
	}


	/**
	 * Data update type データ更新区分.<p>
	 *
	 */
	public String data_crud_typ() {
		return getConstString(offset + 1, $data_crud_typ);
	}

	/**
	 * Data update type データ更新区分.<p>
	 *
	 */
	public void data_crud_typ(String value) {
		setConstString(offset + 1, $data_crud_typ, value);
	}


	/**
	 * Error flg. エラーＦＬＧ.<p>
	 *
	 */
	public boolean err_flg() {
		return getConstBoolean(offset + 2, $err_flg);
	}

	/**
	 * Error flg. エラーＦＬＧ.<p>
	 *
	 */
	public void err_flg(boolean value) {
		setConstBoolean(offset + 2, $err_flg, value);
	}


	/**
	 * Process result status type 処理結果状況区分.<p>
	 *
	 */
	public String rtn_sts_typ() {
		return getConstString(offset + 3, $rtn_sts_typ);
	}

	/**
	 * Process result status type 処理結果状況区分.<p>
	 *
	 */
	public void rtn_sts_typ(String value) {
		setConstString(offset + 3, $rtn_sts_typ, value);
	}


	public mcframe.serverMS.dbc.MST_ARR_ACT_R arr_act(){
		return (mcframe.serverMS.dbc.MST_ARR_ACT_R) getConstInnerRow(offset + 4, $arr_act);
	}
	
	public void arr_act(mcframe.serverMS.dbc.MST_ARR_ACT_R row){
		setConstInnerRow(offset + 4, $arr_act, row);
	}


	/**
	 * Progress status type 進捗状況区分.<p>
	 *
	 */
	public String pr_sts_typ() {
		return getConstString(offset + 5, $pr_sts_typ);
	}

	/**
	 * Progress status type 進捗状況区分.<p>
	 *
	 */
	public void pr_sts_typ(String value) {
		setConstString(offset + 5, $pr_sts_typ, value);
	}


	/**
	 * Progress status type name 進捗状況区分名.<p>
	 *
	 */
	public String pr_sts_typ_nm() {
		return getConstString(offset + 6, $pr_sts_typ_nm);
	}

	/**
	 * Progress status type name 進捗状況区分名.<p>
	 *
	 */
	public void pr_sts_typ_nm(String value) {
		setConstString(offset + 6, $pr_sts_typ_nm, value);
	}


	/**
	 * Asset management type 資産管理区分.<p>
	 *
	 */
	public String asset_mng_typ() {
		return getConstString(offset + 7, $asset_mng_typ);
	}

	/**
	 * Asset management type 資産管理区分.<p>
	 *
	 */
	public void asset_mng_typ(String value) {
		setConstString(offset + 7, $asset_mng_typ, value);
	}


	/**
	 * For version control 版管理対象.<p>
	 *
	 */
	public boolean ver_flg() {
		return getConstBoolean(offset + 8, $ver_flg);
	}

	/**
	 * For version control 版管理対象.<p>
	 *
	 */
	public void ver_flg(boolean value) {
		setConstBoolean(offset + 8, $ver_flg, value);
	}


	/**
	 * Lot management type ロット管理区分.<p>
	 *
	 */
	public String lot_mng_typ() {
		return getConstString(offset + 9, $lot_mng_typ);
	}

	/**
	 * Lot management type ロット管理区分.<p>
	 *
	 */
	public void lot_mng_typ(String value) {
		setConstString(offset + 9, $lot_mng_typ, value);
	}


	/**
	 * Lot No. numbering type ロットＮＯ発番区分.<p>
	 *
	 */
	public String lot_no_typ() {
		return getConstString(offset + 10, $lot_no_typ);
	}

	/**
	 * Lot No. numbering type ロットＮＯ発番区分.<p>
	 *
	 */
	public void lot_no_typ(String value) {
		setConstString(offset + 10, $lot_no_typ, value);
	}


	/**
	 * Sublot management type サブロット管理区分.<p>
	 *
	 */
	public String sublot_mng_typ() {
		return getConstString(offset + 11, $sublot_mng_typ);
	}

	/**
	 * Sublot management type サブロット管理区分.<p>
	 *
	 */
	public void sublot_mng_typ(String value) {
		setConstString(offset + 11, $sublot_mng_typ, value);
	}


	/**
	 * Sublot No. numbering type サブロットＮＯ発番区分.<p>
	 *
	 */
	public String sublot_no_typ() {
		return getConstString(offset + 12, $sublot_no_typ);
	}

	/**
	 * Sublot No. numbering type サブロットＮＯ発番区分.<p>
	 *
	 */
	public void sublot_no_typ(String value) {
		setConstString(offset + 12, $sublot_no_typ, value);
	}


	/**
	 * Vendor lot No. required 業者ロットＮＯ必須.<p>
	 *
	 */
	public boolean bp_lot_flg() {
		return getConstBoolean(offset + 13, $bp_lot_flg);
	}

	/**
	 * Vendor lot No. required 業者ロットＮＯ必須.<p>
	 *
	 */
	public void bp_lot_flg(boolean value) {
		setConstBoolean(offset + 13, $bp_lot_flg, value);
	}


	/**
	 * For receipt rack/line 入荷棚・ライン対象.<p>
	 *
	 */
	public boolean arr_str_ln_tgt_flg() {
		return getConstBoolean(offset + 14, $arr_str_ln_tgt_flg);
	}

	/**
	 * For receipt rack/line 入荷棚・ライン対象.<p>
	 *
	 */
	public void arr_str_ln_tgt_flg(boolean value) {
		setConstBoolean(offset + 14, $arr_str_ln_tgt_flg, value);
	}


	/**
	 * Return-from delivery note details No. 返品元納品書明細ＮＯ.<p>
	 *
	 */
	public String ret_dlv_slip_d_no() {
		return getConstString(offset + 15, $ret_dlv_slip_d_no);
	}

	/**
	 * Return-from delivery note details No. 返品元納品書明細ＮＯ.<p>
	 *
	 */
	public void ret_dlv_slip_d_no(String value) {
		setConstString(offset + 15, $ret_dlv_slip_d_no, value);
	}


	/**
	 * Fot return-from rack/line 返品元棚・ライン対象.<p>
	 *
	 */
	public boolean ret_str_ln_tgt_flg() {
		return getConstBoolean(offset + 16, $ret_str_ln_tgt_flg);
	}

	/**
	 * Fot return-from rack/line 返品元棚・ライン対象.<p>
	 *
	 */
	public void ret_str_ln_tgt_flg(boolean value) {
		setConstBoolean(offset + 16, $ret_str_ln_tgt_flg, value);
	}


	/**
	 * Cancellation recording date 取消計上日.<p>
	 *
	 */
	public MCDate can_ac_dt() {
		return getConstDate(offset + 17, $can_ac_dt);
	}

	/**
	 * Cancellation recording date 取消計上日.<p>
	 *
	 */
	public void can_ac_dt(MCDate value) {
		setConstDate(offset + 17, $can_ac_dt, value);
	}


	/**
	 * Receipt date 入荷日.<p>
	 *
	 */
	public MCDate arr_dt() {
		return getConstDate(offset + 18, $arr_dt);
	}

	/**
	 * Receipt date 入荷日.<p>
	 *
	 */
	public void arr_dt(MCDate value) {
		setConstDate(offset + 18, $arr_dt, value);
	}


	/**
	 * Receipt WG cd. 入荷ＷＧＣＤ.<p>
	 *
	 */
	public String arr_wg_cd() {
		return getConstString(offset + 19, $arr_wg_cd);
	}

	/**
	 * Receipt WG cd. 入荷ＷＧＣＤ.<p>
	 *
	 */
	public void arr_wg_cd(String value) {
		setConstString(offset + 19, $arr_wg_cd, value);
	}


	/**
	 * Receipt progress No. 入荷進捗ＮＯ.<p>
	 *
	 */
	public String arr_pr_no() {
		return getConstString(offset + 20, $arr_pr_no);
	}

	/**
	 * Receipt progress No. 入荷進捗ＮＯ.<p>
	 *
	 */
	public void arr_pr_no(String value) {
		setConstString(offset + 20, $arr_pr_no, value);
	}


	/**
	 * Purchase invoice No. 受領インボイスＮＯ.<p>
	 *
	 */
	public String rcpt_iv_no() {
		return getConstString(offset + 21, $rcpt_iv_no);
	}

	/**
	 * Purchase invoice No. 受領インボイスＮＯ.<p>
	 *
	 */
	public void rcpt_iv_no(String value) {
		setConstString(offset + 21, $rcpt_iv_no, value);
	}


	/**
	 * Purchase invoice management No. 受領インボイス管理ＮＯ.<p>
	 *
	 */
	public String rcpt_iv_mng_no() {
		return getConstString(offset + 22, $rcpt_iv_mng_no);
	}

	/**
	 * Purchase invoice management No. 受領インボイス管理ＮＯ.<p>
	 *
	 */
	public void rcpt_iv_mng_no(String value) {
		setConstString(offset + 22, $rcpt_iv_mng_no, value);
	}


	/**
	 * Invoice No. インボイスＮＯ.<p>
	 *
	 */
	public String iv_no() {
		return getConstString(offset + 23, $iv_no);
	}

	/**
	 * Invoice No. インボイスＮＯ.<p>
	 *
	 */
	public void iv_no(String value) {
		setConstString(offset + 23, $iv_no, value);
	}


	/**
	 * PO No. 発注ＮＯ.<p>
	 *
	 */
	public String po_no() {
		return getConstString(offset + 24, $po_no);
	}

	/**
	 * PO No. 発注ＮＯ.<p>
	 *
	 */
	public void po_no(String value) {
		setConstString(offset + 24, $po_no, value);
	}


	/**
	 * PO details No. 発注明細ＮＯ.<p>
	 *
	 */
	public String po_d_no() {
		return getConstString(offset + 25, $po_d_no);
	}

	/**
	 * PO details No. 発注明細ＮＯ.<p>
	 *
	 */
	public void po_d_no(String value) {
		setConstString(offset + 25, $po_d_no, value);
	}


	/**
	 * Supply result No. 支給実績ＮＯ.<p>
	 *
	 */
	public String prov_act_no() {
		return getConstString(offset + 26, $prov_act_no);
	}

	/**
	 * Supply result No. 支給実績ＮＯ.<p>
	 *
	 */
	public void prov_act_no(String value) {
		setConstString(offset + 26, $prov_act_no, value);
	}


	/**
	 * Receipt pattern type 入荷パタン区分.<p>
	 *
	 */
	public String arr_ptn_typ() {
		return getConstString(offset + 27, $arr_ptn_typ);
	}

	/**
	 * Receipt pattern type 入荷パタン区分.<p>
	 *
	 */
	public void arr_ptn_typ(String value) {
		setConstString(offset + 27, $arr_ptn_typ, value);
	}


	/**
	 * Cancel remaining flg. 打切ＦＬＧ.<p>
	 *
	 */
	public boolean abort_flg() {
		return getConstBoolean(offset + 28, $abort_flg);
	}

	/**
	 * Cancel remaining flg. 打切ＦＬＧ.<p>
	 *
	 */
	public void abort_flg(boolean value) {
		setConstBoolean(offset + 28, $abort_flg, value);
	}


	/**
	 * Lot creation flg. ロット作成ＦＬＧ.<p>
	 *
	 */
	public boolean crt_lot_flg() {
		return getConstBoolean(offset + 29, $crt_lot_flg);
	}

	/**
	 * Lot creation flg. ロット作成ＦＬＧ.<p>
	 *
	 */
	public void crt_lot_flg(boolean value) {
		setConstBoolean(offset + 29, $crt_lot_flg, value);
	}


	/**
	 * Same lot flg. 同一ロットＦＬＧ.<p>
	 *
	 */
	public boolean same_lot_flg() {
		return getConstBoolean(offset + 30, $same_lot_flg);
	}

	/**
	 * Same lot flg. 同一ロットＦＬＧ.<p>
	 *
	 */
	public void same_lot_flg(boolean value) {
		setConstBoolean(offset + 30, $same_lot_flg, value);
	}


	/**
	 * GR/GI progress management No. 受払進捗管理ＮＯ.<p>
	 *
	 */
	public String io_schd_pr_no() {
		return getConstString(offset + 31, $io_schd_pr_no);
	}

	/**
	 * GR/GI progress management No. 受払進捗管理ＮＯ.<p>
	 *
	 */
	public void io_schd_pr_no(String value) {
		setConstString(offset + 31, $io_schd_pr_no, value);
	}


	/**
	 * Supply type 支給区分.<p>
	 *
	 */
	public String prov_typ() {
		return getConstString(offset + 32, $prov_typ);
	}

	/**
	 * Supply type 支給区分.<p>
	 *
	 */
	public void prov_typ(String value) {
		setConstString(offset + 32, $prov_typ, value);
	}


	/**
	 * Supply recording type 支給計上区分.<p>
	 *
	 */
	public String prov_basis_typ() {
		return getConstString(offset + 33, $prov_basis_typ);
	}

	/**
	 * Supply recording type 支給計上区分.<p>
	 *
	 */
	public void prov_basis_typ(String value) {
		setConstString(offset + 33, $prov_basis_typ, value);
	}


	/**
	 * Mfg. order No. 製造指図ＮＯ.<p>
	 *
	 */
	public String mfg_inst_no() {
		return getConstString(offset + 34, $mfg_inst_no);
	}

	/**
	 * Mfg. order No. 製造指図ＮＯ.<p>
	 *
	 */
	public void mfg_inst_no(String value) {
		setConstString(offset + 34, $mfg_inst_no, value);
	}


	/**
	 * Subcontracting result prior flg. 外注実績先行ＦＬＧ.<p>
	 *
	 */
	public boolean pre_outsrc_act_flg() {
		return getConstBoolean(offset + 35, $pre_outsrc_act_flg);
	}

	/**
	 * Subcontracting result prior flg. 外注実績先行ＦＬＧ.<p>
	 *
	 */
	public void pre_outsrc_act_flg(boolean value) {
		setConstBoolean(offset + 35, $pre_outsrc_act_flg, value);
	}


	/**
	 * Issue flg. 発行ＦＬＧ.<p>
	 *
	 */
	public boolean prnt_flg() {
		return getConstBoolean(offset + 36, $prnt_flg);
	}

	/**
	 * Issue flg. 発行ＦＬＧ.<p>
	 *
	 */
	public void prnt_flg(boolean value) {
		setConstBoolean(offset + 36, $prnt_flg, value);
	}


	/**
	 * Customer inventory 預り.<p>
	 *
	 */
	public boolean cststk_flg() {
		return getConstBoolean(offset + 37, $cststk_flg);
	}

	/**
	 * Customer inventory 預り.<p>
	 *
	 */
	public void cststk_flg(boolean value) {
		setConstBoolean(offset + 37, $cststk_flg, value);
	}


	/**
	 * Other accounting GI 他勘定出庫.<p>
	 *
	 */
	public boolean acxfr_gi_flg() {
		return getConstBoolean(offset + 38, $acxfr_gi_flg);
	}

	/**
	 * Other accounting GI 他勘定出庫.<p>
	 *
	 */
	public void acxfr_gi_flg(boolean value) {
		setConstBoolean(offset + 38, $acxfr_gi_flg, value);
	}


	/**
	 * Expense purchase 経費購買.<p>
	 *
	 */
	public boolean xpns_purc_flg() {
		return getConstBoolean(offset + 39, $xpns_purc_flg);
	}

	/**
	 * Expense purchase 経費購買.<p>
	 *
	 */
	public void xpns_purc_flg(boolean value) {
		setConstBoolean(offset + 39, $xpns_purc_flg, value);
	}


	/**
	 * Sales other accounting 販売他勘定.<p>
	 *
	 */
	public boolean sls_acxfr_flg() {
		return getConstBoolean(offset + 40, $sls_acxfr_flg);
	}

	/**
	 * Sales other accounting 販売他勘定.<p>
	 *
	 */
	public void sls_acxfr_flg(boolean value) {
		setConstBoolean(offset + 40, $sls_acxfr_flg, value);
	}


	/**
	 * Purchase 仕入.<p>
	 *
	 */
	public boolean purc_flg() {
		return getConstBoolean(offset + 41, $purc_flg);
	}

	/**
	 * Purchase 仕入.<p>
	 *
	 */
	public void purc_flg(boolean value) {
		setConstBoolean(offset + 41, $purc_flg, value);
	}


	/**
	 * Sales return 売上返品.<p>
	 *
	 */
	public boolean sls_rtn_flg() {
		return getConstBoolean(offset + 42, $sls_rtn_flg);
	}

	/**
	 * Sales return 売上返品.<p>
	 *
	 */
	public void sls_rtn_flg(boolean value) {
		setConstBoolean(offset + 42, $sls_rtn_flg, value);
	}


	/**
	 * Transport 移送.<p>
	 *
	 */
	public boolean xfr_flg() {
		return getConstBoolean(offset + 43, $xfr_flg);
	}

	/**
	 * Transport 移送.<p>
	 *
	 */
	public void xfr_flg(boolean value) {
		setConstBoolean(offset + 43, $xfr_flg, value);
	}


	/**
	 * Transaction unit number of decimal places 取引単位小数部有効桁数.<p>
	 *
	 */
	public MCNumber trd_unit_dec_place() {
		return getConstNumber(offset + 44, $trd_unit_dec_place);
	}

	/**
	 * Transaction unit number of decimal places 取引単位小数部有効桁数.<p>
	 *
	 */
	public void trd_unit_dec_place(MCNumber value) {
		setConstNumber(offset + 44, $trd_unit_dec_place, value);
	}

	/**
	 * Transaction unit number of decimal places 取引単位小数部有効桁数.<p>
	 *
	 */
	public void trd_unit_dec_place(int value) {
		setConstNumber(offset + 44, $trd_unit_dec_place, value);
	}

	/**
	 * Transaction unit number of decimal places 取引単位小数部有効桁数.<p>
	 *
	 */
	public void trd_unit_dec_place(long value) {
		setConstNumber(offset + 44, $trd_unit_dec_place, value);
	}

	/**
	 * Transaction unit number of decimal places 取引単位小数部有効桁数.<p>
	 *
	 */
	public void trd_unit_dec_place(float value) {
		setConstNumber(offset + 44, $trd_unit_dec_place, value);
	}

	/**
	 * Transaction unit number of decimal places 取引単位小数部有効桁数.<p>
	 *
	 */
	public void trd_unit_dec_place(double value) {
		setConstNumber(offset + 44, $trd_unit_dec_place, value);
	}


	/**
	 * Active ingredient unit number of decimal places 有効成分単位小数部有効桁数.<p>
	 *
	 */
	public MCNumber cont_fctr_dec_place() {
		return getConstNumber(offset + 45, $cont_fctr_dec_place);
	}

	/**
	 * Active ingredient unit number of decimal places 有効成分単位小数部有効桁数.<p>
	 *
	 */
	public void cont_fctr_dec_place(MCNumber value) {
		setConstNumber(offset + 45, $cont_fctr_dec_place, value);
	}

	/**
	 * Active ingredient unit number of decimal places 有効成分単位小数部有効桁数.<p>
	 *
	 */
	public void cont_fctr_dec_place(int value) {
		setConstNumber(offset + 45, $cont_fctr_dec_place, value);
	}

	/**
	 * Active ingredient unit number of decimal places 有効成分単位小数部有効桁数.<p>
	 *
	 */
	public void cont_fctr_dec_place(long value) {
		setConstNumber(offset + 45, $cont_fctr_dec_place, value);
	}

	/**
	 * Active ingredient unit number of decimal places 有効成分単位小数部有効桁数.<p>
	 *
	 */
	public void cont_fctr_dec_place(float value) {
		setConstNumber(offset + 45, $cont_fctr_dec_place, value);
	}

	/**
	 * Active ingredient unit number of decimal places 有効成分単位小数部有効桁数.<p>
	 *
	 */
	public void cont_fctr_dec_place(double value) {
		setConstNumber(offset + 45, $cont_fctr_dec_place, value);
	}


	/**
	 * Update counter (Receipt progress) 更新カウンタ(入荷進捗).<p>
	 *
	 */
	public MCNumber arr_pr_upd_cntr() {
		return getConstNumber(offset + 46, $arr_pr_upd_cntr);
	}

	/**
	 * Update counter (Receipt progress) 更新カウンタ(入荷進捗).<p>
	 *
	 */
	public void arr_pr_upd_cntr(MCNumber value) {
		setConstNumber(offset + 46, $arr_pr_upd_cntr, value);
	}

	/**
	 * Update counter (Receipt progress) 更新カウンタ(入荷進捗).<p>
	 *
	 */
	public void arr_pr_upd_cntr(int value) {
		setConstNumber(offset + 46, $arr_pr_upd_cntr, value);
	}

	/**
	 * Update counter (Receipt progress) 更新カウンタ(入荷進捗).<p>
	 *
	 */
	public void arr_pr_upd_cntr(long value) {
		setConstNumber(offset + 46, $arr_pr_upd_cntr, value);
	}

	/**
	 * Update counter (Receipt progress) 更新カウンタ(入荷進捗).<p>
	 *
	 */
	public void arr_pr_upd_cntr(float value) {
		setConstNumber(offset + 46, $arr_pr_upd_cntr, value);
	}

	/**
	 * Update counter (Receipt progress) 更新カウンタ(入荷進捗).<p>
	 *
	 */
	public void arr_pr_upd_cntr(double value) {
		setConstNumber(offset + 46, $arr_pr_upd_cntr, value);
	}


	/**
	 * Update counter (Receipt result) 更新カウンタ(入荷実績).<p>
	 *
	 */
	public MCNumber arr_act_upd_cntr() {
		return getConstNumber(offset + 47, $arr_act_upd_cntr);
	}

	/**
	 * Update counter (Receipt result) 更新カウンタ(入荷実績).<p>
	 *
	 */
	public void arr_act_upd_cntr(MCNumber value) {
		setConstNumber(offset + 47, $arr_act_upd_cntr, value);
	}

	/**
	 * Update counter (Receipt result) 更新カウンタ(入荷実績).<p>
	 *
	 */
	public void arr_act_upd_cntr(int value) {
		setConstNumber(offset + 47, $arr_act_upd_cntr, value);
	}

	/**
	 * Update counter (Receipt result) 更新カウンタ(入荷実績).<p>
	 *
	 */
	public void arr_act_upd_cntr(long value) {
		setConstNumber(offset + 47, $arr_act_upd_cntr, value);
	}

	/**
	 * Update counter (Receipt result) 更新カウンタ(入荷実績).<p>
	 *
	 */
	public void arr_act_upd_cntr(float value) {
		setConstNumber(offset + 47, $arr_act_upd_cntr, value);
	}

	/**
	 * Update counter (Receipt result) 更新カウンタ(入荷実績).<p>
	 *
	 */
	public void arr_act_upd_cntr(double value) {
		setConstNumber(offset + 47, $arr_act_upd_cntr, value);
	}


	/**
	 * Update counter (Receiving I/V) 更新カウンタ(受領インボイス).<p>
	 *
	 */
	public MCNumber rcpt_iv_upd_cntr() {
		return getConstNumber(offset + 48, $rcpt_iv_upd_cntr);
	}

	/**
	 * Update counter (Receiving I/V) 更新カウンタ(受領インボイス).<p>
	 *
	 */
	public void rcpt_iv_upd_cntr(MCNumber value) {
		setConstNumber(offset + 48, $rcpt_iv_upd_cntr, value);
	}

	/**
	 * Update counter (Receiving I/V) 更新カウンタ(受領インボイス).<p>
	 *
	 */
	public void rcpt_iv_upd_cntr(int value) {
		setConstNumber(offset + 48, $rcpt_iv_upd_cntr, value);
	}

	/**
	 * Update counter (Receiving I/V) 更新カウンタ(受領インボイス).<p>
	 *
	 */
	public void rcpt_iv_upd_cntr(long value) {
		setConstNumber(offset + 48, $rcpt_iv_upd_cntr, value);
	}

	/**
	 * Update counter (Receiving I/V) 更新カウンタ(受領インボイス).<p>
	 *
	 */
	public void rcpt_iv_upd_cntr(float value) {
		setConstNumber(offset + 48, $rcpt_iv_upd_cntr, value);
	}

	/**
	 * Update counter (Receiving I/V) 更新カウンタ(受領インボイス).<p>
	 *
	 */
	public void rcpt_iv_upd_cntr(double value) {
		setConstNumber(offset + 48, $rcpt_iv_upd_cntr, value);
	}


	/**
	 * Receipt dept. cd. update flg. 入荷部門ＣＤ更新ＦＬＧ.<p>
	 *
	 */
	public boolean arr_dpt_cd_upd_flg() {
		return getConstBoolean(offset + 49, $arr_dpt_cd_upd_flg);
	}

	/**
	 * Receipt dept. cd. update flg. 入荷部門ＣＤ更新ＦＬＧ.<p>
	 *
	 */
	public void arr_dpt_cd_upd_flg(boolean value) {
		setConstBoolean(offset + 49, $arr_dpt_cd_upd_flg, value);
	}


	/**
	 * Receipt PIC cd. update flg. 入荷担当者ＣＤ更新ＦＬＧ.<p>
	 *
	 */
	public boolean arr_usr_cd_upd_flg() {
		return getConstBoolean(offset + 50, $arr_usr_cd_upd_flg);
	}

	/**
	 * Receipt PIC cd. update flg. 入荷担当者ＣＤ更新ＦＬＧ.<p>
	 *
	 */
	public void arr_usr_cd_upd_flg(boolean value) {
		setConstBoolean(offset + 50, $arr_usr_cd_upd_flg, value);
	}


	/**
	 * SEIBAN No. 1 update flg. 手配ＮＯ１更新ＦＬＧ.<p>
	 *
	 */
	public boolean sno1_upd_flg() {
		return getConstBoolean(offset + 51, $sno1_upd_flg);
	}

	/**
	 * SEIBAN No. 1 update flg. 手配ＮＯ１更新ＦＬＧ.<p>
	 *
	 */
	public void sno1_upd_flg(boolean value) {
		setConstBoolean(offset + 51, $sno1_upd_flg, value);
	}


	/**
	 * SEIBAN No. 2 update flg. 手配ＮＯ２更新ＦＬＧ.<p>
	 *
	 */
	public boolean sno2_upd_flg() {
		return getConstBoolean(offset + 52, $sno2_upd_flg);
	}

	/**
	 * SEIBAN No. 2 update flg. 手配ＮＯ２更新ＦＬＧ.<p>
	 *
	 */
	public void sno2_upd_flg(boolean value) {
		setConstBoolean(offset + 52, $sno2_upd_flg, value);
	}


	/**
	 * SEIBAN No. 3 update flg. 手配ＮＯ３更新ＦＬＧ.<p>
	 *
	 */
	public boolean sno3_upd_flg() {
		return getConstBoolean(offset + 53, $sno3_upd_flg);
	}

	/**
	 * SEIBAN No. 3 update flg. 手配ＮＯ３更新ＦＬＧ.<p>
	 *
	 */
	public void sno3_upd_flg(boolean value) {
		setConstBoolean(offset + 53, $sno3_upd_flg, value);
	}


	/**
	 * SEIBAN No. 4 update flg. 手配ＮＯ４更新ＦＬＧ.<p>
	 *
	 */
	public boolean sno4_upd_flg() {
		return getConstBoolean(offset + 54, $sno4_upd_flg);
	}

	/**
	 * SEIBAN No. 4 update flg. 手配ＮＯ４更新ＦＬＧ.<p>
	 *
	 */
	public void sno4_upd_flg(boolean value) {
		setConstBoolean(offset + 54, $sno4_upd_flg, value);
	}


	/**
	 * Lot No. update flg. ロットＮＯ更新ＦＬＧ.<p>
	 *
	 */
	public boolean lot_no_upd_flg() {
		return getConstBoolean(offset + 55, $lot_no_upd_flg);
	}

	/**
	 * Lot No. update flg. ロットＮＯ更新ＦＬＧ.<p>
	 *
	 */
	public void lot_no_upd_flg(boolean value) {
		setConstBoolean(offset + 55, $lot_no_upd_flg, value);
	}


	/**
	 * Sublot No.?update flg. サブロットＮＯ更新ＦＬＧ.<p>
	 *
	 */
	public boolean sublot_no_upd_flg() {
		return getConstBoolean(offset + 56, $sublot_no_upd_flg);
	}

	/**
	 * Sublot No.?update flg. サブロットＮＯ更新ＦＬＧ.<p>
	 *
	 */
	public void sublot_no_upd_flg(boolean value) {
		setConstBoolean(offset + 56, $sublot_no_upd_flg, value);
	}


	/**
	 * Version No. update flg. 版ＮＯ更新ＦＬＧ.<p>
	 *
	 */
	public boolean ver_no_upd_flg() {
		return getConstBoolean(offset + 57, $ver_no_upd_flg);
	}

	/**
	 * Version No. update flg. 版ＮＯ更新ＦＬＧ.<p>
	 *
	 */
	public void ver_no_upd_flg(boolean value) {
		setConstBoolean(offset + 57, $ver_no_upd_flg, value);
	}


	/**
	 * Inventory arriving point cd. update flg. 在庫着荷先ＣＤ更新ＦＬＧ.<p>
	 *
	 */
	public boolean stk_arrv_bp_cd_upd_flg() {
		return getConstBoolean(offset + 58, $stk_arrv_bp_cd_upd_flg);
	}

	/**
	 * Inventory arriving point cd. update flg. 在庫着荷先ＣＤ更新ＦＬＧ.<p>
	 *
	 */
	public void stk_arrv_bp_cd_upd_flg(boolean value) {
		setConstBoolean(offset + 58, $stk_arrv_bp_cd_upd_flg, value);
	}


	/**
	 * Grading cd. update flg. 格付ＣＤ更新ＦＬＧ.<p>
	 *
	 */
	public boolean gd_cd_upd_flg() {
		return getConstBoolean(offset + 59, $gd_cd_upd_flg);
	}

	/**
	 * Grading cd. update flg. 格付ＣＤ更新ＦＬＧ.<p>
	 *
	 */
	public void gd_cd_upd_flg(boolean value) {
		setConstBoolean(offset + 59, $gd_cd_upd_flg, value);
	}


	/**
	 * Conforming type update flg. 良品区分更新ＦＬＧ.<p>
	 *
	 */
	public boolean quality_typ_upd_flg() {
		return getConstBoolean(offset + 60, $quality_typ_upd_flg);
	}

	/**
	 * Conforming type update flg. 良品区分更新ＦＬＧ.<p>
	 *
	 */
	public void quality_typ_upd_flg(boolean value) {
		setConstBoolean(offset + 60, $quality_typ_upd_flg, value);
	}


	/**
	 * Inventory inspection type update flg. 在庫検査区分更新ＦＬＧ.<p>
	 *
	 */
	public boolean stk_insp_typ_upd_flg() {
		return getConstBoolean(offset + 61, $stk_insp_typ_upd_flg);
	}

	/**
	 * Inventory inspection type update flg. 在庫検査区分更新ＦＬＧ.<p>
	 *
	 */
	public void stk_insp_typ_upd_flg(boolean value) {
		setConstBoolean(offset + 61, $stk_insp_typ_upd_flg, value);
	}


	/**
	 * Inventory identification type update flg. 在庫識別区分更新ＦＬＧ.<p>
	 *
	 */
	public boolean stk_id_typ_upd_flg() {
		return getConstBoolean(offset + 62, $stk_id_typ_upd_flg);
	}

	/**
	 * Inventory identification type update flg. 在庫識別区分更新ＦＬＧ.<p>
	 *
	 */
	public void stk_id_typ_upd_flg(boolean value) {
		setConstBoolean(offset + 62, $stk_id_typ_upd_flg, value);
	}


	/**
	 * Inventory BP cd. update flg. 在庫取引先ＣＤ更新ＦＬＧ.<p>
	 *
	 */
	public boolean stk_bp_cd_upd_flg() {
		return getConstBoolean(offset + 63, $stk_bp_cd_upd_flg);
	}

	/**
	 * Inventory BP cd. update flg. 在庫取引先ＣＤ更新ＦＬＧ.<p>
	 *
	 */
	public void stk_bp_cd_upd_flg(boolean value) {
		setConstBoolean(offset + 63, $stk_bp_cd_upd_flg, value);
	}


	/**
	 * Supplier item cd. update flg. 発注先品目ＣＤ更新ＦＬＧ.<p>
	 *
	 */
	public boolean sppl_itm_cd_upd_flg() {
		return getConstBoolean(offset + 64, $sppl_itm_cd_upd_flg);
	}

	/**
	 * Supplier item cd. update flg. 発注先品目ＣＤ更新ＦＬＧ.<p>
	 *
	 */
	public void sppl_itm_cd_upd_flg(boolean value) {
		setConstBoolean(offset + 64, $sppl_itm_cd_upd_flg, value);
	}


	/**
	 * Supplier item name update flg. 発注先品名更新ＦＬＧ.<p>
	 *
	 */
	public boolean sppl_itm_nm_upd_flg() {
		return getConstBoolean(offset + 65, $sppl_itm_nm_upd_flg);
	}

	/**
	 * Supplier item name update flg. 発注先品名更新ＦＬＧ.<p>
	 *
	 */
	public void sppl_itm_nm_upd_flg(boolean value) {
		setConstBoolean(offset + 65, $sppl_itm_nm_upd_flg, value);
	}


	/**
	 * Maker cd. update flg. メーカーＣＤ更新ＦＬＧ.<p>
	 *
	 */
	public boolean maker_cd_upd_flg() {
		return getConstBoolean(offset + 66, $maker_cd_upd_flg);
	}

	/**
	 * Maker cd. update flg. メーカーＣＤ更新ＦＬＧ.<p>
	 *
	 */
	public void maker_cd_upd_flg(boolean value) {
		setConstBoolean(offset + 66, $maker_cd_upd_flg, value);
	}


	/**
	 * Vendor lot No. Update flg. 業者ロットＮＯ更新ＦＬＧ.<p>
	 *
	 */
	public boolean bp_lot_no_upd_flg() {
		return getConstBoolean(offset + 67, $bp_lot_no_upd_flg);
	}

	/**
	 * Vendor lot No. Update flg. 業者ロットＮＯ更新ＦＬＧ.<p>
	 *
	 */
	public void bp_lot_no_upd_flg(boolean value) {
		setConstBoolean(offset + 67, $bp_lot_no_upd_flg, value);
	}


	/**
	 * Vendor delivery note No. update flg. 業者納品書ＮＯ更新ＦＬＧ.<p>
	 *
	 */
	public boolean bp_dlv_slip_no_upd_flg() {
		return getConstBoolean(offset + 68, $bp_dlv_slip_no_upd_flg);
	}

	/**
	 * Vendor delivery note No. update flg. 業者納品書ＮＯ更新ＦＬＧ.<p>
	 *
	 */
	public void bp_dlv_slip_no_upd_flg(boolean value) {
		setConstBoolean(offset + 68, $bp_dlv_slip_no_upd_flg, value);
	}


	/**
	 * Vendor delivery note details No. update flg. 業者納品書明細ＮＯ更新ＦＬＧ.<p>
	 *
	 */
	public boolean bp_dlv_slip_d_no_upd_flg() {
		return getConstBoolean(offset + 69, $bp_dlv_slip_d_no_upd_flg);
	}

	/**
	 * Vendor delivery note details No. update flg. 業者納品書明細ＮＯ更新ＦＬＧ.<p>
	 *
	 */
	public void bp_dlv_slip_d_no_upd_flg(boolean value) {
		setConstBoolean(offset + 69, $bp_dlv_slip_d_no_upd_flg, value);
	}


	/**
	 * Shipping point expiration update flg. 出荷元期限更新ＦＬＧ.<p>
	 *
	 */
	public boolean ship_fr_valid_dt_upd_flg() {
		return getConstBoolean(offset + 70, $ship_fr_valid_dt_upd_flg);
	}

	/**
	 * Shipping point expiration update flg. 出荷元期限更新ＦＬＧ.<p>
	 *
	 */
	public void ship_fr_valid_dt_upd_flg(boolean value) {
		setConstBoolean(offset + 70, $ship_fr_valid_dt_upd_flg, value);
	}


	/**
	 * Purchase active ingredient update flg. 仕入有効成分更新ＦＬＧ.<p>
	 *
	 */
	public boolean purc_cont_qty_upd_flg() {
		return getConstBoolean(offset + 71, $purc_cont_qty_upd_flg);
	}

	/**
	 * Purchase active ingredient update flg. 仕入有効成分更新ＦＬＧ.<p>
	 *
	 */
	public void purc_cont_qty_upd_flg(boolean value) {
		setConstBoolean(offset + 71, $purc_cont_qty_upd_flg, value);
	}


	/**
	 * Inspection contact remarks update flg. 検査連絡備考更新ＦＬＧ.<p>
	 *
	 */
	public boolean insp_cnt_rmrks_upd_flg() {
		return getConstBoolean(offset + 72, $insp_cnt_rmrks_upd_flg);
	}

	/**
	 * Inspection contact remarks update flg. 検査連絡備考更新ＦＬＧ.<p>
	 *
	 */
	public void insp_cnt_rmrks_upd_flg(boolean value) {
		setConstBoolean(offset + 72, $insp_cnt_rmrks_upd_flg, value);
	}


	/**
	 * Internal remarks update flg. 内部備考更新ＦＬＧ.<p>
	 *
	 */
	public boolean intr_rmrks_upd_flg() {
		return getConstBoolean(offset + 73, $intr_rmrks_upd_flg);
	}

	/**
	 * Internal remarks update flg. 内部備考更新ＦＬＧ.<p>
	 *
	 */
	public void intr_rmrks_upd_flg(boolean value) {
		setConstBoolean(offset + 73, $intr_rmrks_upd_flg, value);
	}


	/**
	 * Transaction remarks update flg. 取引備考更新ＦＬＧ.<p>
	 *
	 */
	public boolean trd_rmrks_upd_flg() {
		return getConstBoolean(offset + 74, $trd_rmrks_upd_flg);
	}

	/**
	 * Transaction remarks update flg. 取引備考更新ＦＬＧ.<p>
	 *
	 */
	public void trd_rmrks_upd_flg(boolean value) {
		setConstBoolean(offset + 74, $trd_rmrks_upd_flg, value);
	}


	/**
	 * Transaction details remarks update flg. 取引明細備考更新ＦＬＧ.<p>
	 *
	 */
	public boolean trd_d_rmrks_upd_flg() {
		return getConstBoolean(offset + 75, $trd_d_rmrks_upd_flg);
	}

	/**
	 * Transaction details remarks update flg. 取引明細備考更新ＦＬＧ.<p>
	 *
	 */
	public void trd_d_rmrks_upd_flg(boolean value) {
		setConstBoolean(offset + 75, $trd_d_rmrks_upd_flg, value);
	}


	/**
	 * Update spare 1 flg. 予備１更新ＦＬＧ.<p>
	 *
	 */
	public boolean sub_char1_upd_flg() {
		return getConstBoolean(offset + 76, $sub_char1_upd_flg);
	}

	/**
	 * Update spare 1 flg. 予備１更新ＦＬＧ.<p>
	 *
	 */
	public void sub_char1_upd_flg(boolean value) {
		setConstBoolean(offset + 76, $sub_char1_upd_flg, value);
	}


	/**
	 * Update spare 2 flg. 予備２更新ＦＬＧ.<p>
	 *
	 */
	public boolean sub_char2_upd_flg() {
		return getConstBoolean(offset + 77, $sub_char2_upd_flg);
	}

	/**
	 * Update spare 2 flg. 予備２更新ＦＬＧ.<p>
	 *
	 */
	public void sub_char2_upd_flg(boolean value) {
		setConstBoolean(offset + 77, $sub_char2_upd_flg, value);
	}


	/**
	 * Update spare 3 flg. 予備３更新ＦＬＧ.<p>
	 *
	 */
	public boolean sub_char3_upd_flg() {
		return getConstBoolean(offset + 78, $sub_char3_upd_flg);
	}

	/**
	 * Update spare 3 flg. 予備３更新ＦＬＧ.<p>
	 *
	 */
	public void sub_char3_upd_flg(boolean value) {
		setConstBoolean(offset + 78, $sub_char3_upd_flg, value);
	}


	/**
	 * Receipt progress No. update flg. 入荷進捗ＮＯ更新ＦＬＧ.<p>
	 *
	 */
	public boolean arr_pr_no_upd_flg() {
		return getConstBoolean(offset + 79, $arr_pr_no_upd_flg);
	}

	/**
	 * Receipt progress No. update flg. 入荷進捗ＮＯ更新ＦＬＧ.<p>
	 *
	 */
	public void arr_pr_no_upd_flg(boolean value) {
		setConstBoolean(offset + 79, $arr_pr_no_upd_flg, value);
	}


	/**
	 * Invoice No. update flg. インボイスＮＯ更新ＦＬＧ.<p>
	 *
	 */
	public boolean iv_no_upd_flg() {
		return getConstBoolean(offset + 80, $iv_no_upd_flg);
	}

	/**
	 * Invoice No. update flg. インボイスＮＯ更新ＦＬＧ.<p>
	 *
	 */
	public void iv_no_upd_flg(boolean value) {
		setConstBoolean(offset + 80, $iv_no_upd_flg, value);
	}


	public String getString(String name) {
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			return data_crud_typ();
		}
		if ($rtn_sts_typ.equalsIgnoreCase(name)) {
			return rtn_sts_typ();
		}
		if ($pr_sts_typ.equalsIgnoreCase(name)) {
			return pr_sts_typ();
		}
		if ($pr_sts_typ_nm.equalsIgnoreCase(name)) {
			return pr_sts_typ_nm();
		}
		if ($asset_mng_typ.equalsIgnoreCase(name)) {
			return asset_mng_typ();
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
		if ($ret_dlv_slip_d_no.equalsIgnoreCase(name)) {
			return ret_dlv_slip_d_no();
		}
		if ($arr_wg_cd.equalsIgnoreCase(name)) {
			return arr_wg_cd();
		}
		if ($arr_pr_no.equalsIgnoreCase(name)) {
			return arr_pr_no();
		}
		if ($rcpt_iv_no.equalsIgnoreCase(name)) {
			return rcpt_iv_no();
		}
		if ($rcpt_iv_mng_no.equalsIgnoreCase(name)) {
			return rcpt_iv_mng_no();
		}
		if ($iv_no.equalsIgnoreCase(name)) {
			return iv_no();
		}
		if ($po_no.equalsIgnoreCase(name)) {
			return po_no();
		}
		if ($po_d_no.equalsIgnoreCase(name)) {
			return po_d_no();
		}
		if ($prov_act_no.equalsIgnoreCase(name)) {
			return prov_act_no();
		}
		if ($arr_ptn_typ.equalsIgnoreCase(name)) {
			return arr_ptn_typ();
		}
		if ($io_schd_pr_no.equalsIgnoreCase(name)) {
			return io_schd_pr_no();
		}
		if ($prov_typ.equalsIgnoreCase(name)) {
			return prov_typ();
		}
		if ($prov_basis_typ.equalsIgnoreCase(name)) {
			return prov_basis_typ();
		}
		if ($mfg_inst_no.equalsIgnoreCase(name)) {
			return mfg_inst_no();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($peg_no.equalsIgnoreCase(name)) {
			return peg_no();
		}
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			return trd_unit_dec_place();
		}
		if ($cont_fctr_dec_place.equalsIgnoreCase(name)) {
			return cont_fctr_dec_place();
		}
		if ($arr_pr_upd_cntr.equalsIgnoreCase(name)) {
			return arr_pr_upd_cntr();
		}
		if ($arr_act_upd_cntr.equalsIgnoreCase(name)) {
			return arr_act_upd_cntr();
		}
		if ($rcpt_iv_upd_cntr.equalsIgnoreCase(name)) {
			return rcpt_iv_upd_cntr();
		}
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		if ($can_ac_dt.equalsIgnoreCase(name)) {
			return can_ac_dt();
		}
		if ($arr_dt.equalsIgnoreCase(name)) {
			return arr_dt();
		}
		return super.getDate(name);
	}
	public boolean getBoolean(String name) {
		if ($err_flg.equalsIgnoreCase(name)) {
			return err_flg();
		}
		if ($ver_flg.equalsIgnoreCase(name)) {
			return ver_flg();
		}
		if ($bp_lot_flg.equalsIgnoreCase(name)) {
			return bp_lot_flg();
		}
		if ($arr_str_ln_tgt_flg.equalsIgnoreCase(name)) {
			return arr_str_ln_tgt_flg();
		}
		if ($ret_str_ln_tgt_flg.equalsIgnoreCase(name)) {
			return ret_str_ln_tgt_flg();
		}
		if ($abort_flg.equalsIgnoreCase(name)) {
			return abort_flg();
		}
		if ($crt_lot_flg.equalsIgnoreCase(name)) {
			return crt_lot_flg();
		}
		if ($same_lot_flg.equalsIgnoreCase(name)) {
			return same_lot_flg();
		}
		if ($pre_outsrc_act_flg.equalsIgnoreCase(name)) {
			return pre_outsrc_act_flg();
		}
		if ($prnt_flg.equalsIgnoreCase(name)) {
			return prnt_flg();
		}
		if ($cststk_flg.equalsIgnoreCase(name)) {
			return cststk_flg();
		}
		if ($acxfr_gi_flg.equalsIgnoreCase(name)) {
			return acxfr_gi_flg();
		}
		if ($xpns_purc_flg.equalsIgnoreCase(name)) {
			return xpns_purc_flg();
		}
		if ($sls_acxfr_flg.equalsIgnoreCase(name)) {
			return sls_acxfr_flg();
		}
		if ($purc_flg.equalsIgnoreCase(name)) {
			return purc_flg();
		}
		if ($sls_rtn_flg.equalsIgnoreCase(name)) {
			return sls_rtn_flg();
		}
		if ($xfr_flg.equalsIgnoreCase(name)) {
			return xfr_flg();
		}
		if ($arr_dpt_cd_upd_flg.equalsIgnoreCase(name)) {
			return arr_dpt_cd_upd_flg();
		}
		if ($arr_usr_cd_upd_flg.equalsIgnoreCase(name)) {
			return arr_usr_cd_upd_flg();
		}
		if ($sno1_upd_flg.equalsIgnoreCase(name)) {
			return sno1_upd_flg();
		}
		if ($sno2_upd_flg.equalsIgnoreCase(name)) {
			return sno2_upd_flg();
		}
		if ($sno3_upd_flg.equalsIgnoreCase(name)) {
			return sno3_upd_flg();
		}
		if ($sno4_upd_flg.equalsIgnoreCase(name)) {
			return sno4_upd_flg();
		}
		if ($lot_no_upd_flg.equalsIgnoreCase(name)) {
			return lot_no_upd_flg();
		}
		if ($sublot_no_upd_flg.equalsIgnoreCase(name)) {
			return sublot_no_upd_flg();
		}
		if ($ver_no_upd_flg.equalsIgnoreCase(name)) {
			return ver_no_upd_flg();
		}
		if ($stk_arrv_bp_cd_upd_flg.equalsIgnoreCase(name)) {
			return stk_arrv_bp_cd_upd_flg();
		}
		if ($gd_cd_upd_flg.equalsIgnoreCase(name)) {
			return gd_cd_upd_flg();
		}
		if ($quality_typ_upd_flg.equalsIgnoreCase(name)) {
			return quality_typ_upd_flg();
		}
		if ($stk_insp_typ_upd_flg.equalsIgnoreCase(name)) {
			return stk_insp_typ_upd_flg();
		}
		if ($stk_id_typ_upd_flg.equalsIgnoreCase(name)) {
			return stk_id_typ_upd_flg();
		}
		if ($stk_bp_cd_upd_flg.equalsIgnoreCase(name)) {
			return stk_bp_cd_upd_flg();
		}
		if ($sppl_itm_cd_upd_flg.equalsIgnoreCase(name)) {
			return sppl_itm_cd_upd_flg();
		}
		if ($sppl_itm_nm_upd_flg.equalsIgnoreCase(name)) {
			return sppl_itm_nm_upd_flg();
		}
		if ($maker_cd_upd_flg.equalsIgnoreCase(name)) {
			return maker_cd_upd_flg();
		}
		if ($bp_lot_no_upd_flg.equalsIgnoreCase(name)) {
			return bp_lot_no_upd_flg();
		}
		if ($bp_dlv_slip_no_upd_flg.equalsIgnoreCase(name)) {
			return bp_dlv_slip_no_upd_flg();
		}
		if ($bp_dlv_slip_d_no_upd_flg.equalsIgnoreCase(name)) {
			return bp_dlv_slip_d_no_upd_flg();
		}
		if ($ship_fr_valid_dt_upd_flg.equalsIgnoreCase(name)) {
			return ship_fr_valid_dt_upd_flg();
		}
		if ($purc_cont_qty_upd_flg.equalsIgnoreCase(name)) {
			return purc_cont_qty_upd_flg();
		}
		if ($insp_cnt_rmrks_upd_flg.equalsIgnoreCase(name)) {
			return insp_cnt_rmrks_upd_flg();
		}
		if ($intr_rmrks_upd_flg.equalsIgnoreCase(name)) {
			return intr_rmrks_upd_flg();
		}
		if ($trd_rmrks_upd_flg.equalsIgnoreCase(name)) {
			return trd_rmrks_upd_flg();
		}
		if ($trd_d_rmrks_upd_flg.equalsIgnoreCase(name)) {
			return trd_d_rmrks_upd_flg();
		}
		if ($sub_char1_upd_flg.equalsIgnoreCase(name)) {
			return sub_char1_upd_flg();
		}
		if ($sub_char2_upd_flg.equalsIgnoreCase(name)) {
			return sub_char2_upd_flg();
		}
		if ($sub_char3_upd_flg.equalsIgnoreCase(name)) {
			return sub_char3_upd_flg();
		}
		if ($arr_pr_no_upd_flg.equalsIgnoreCase(name)) {
			return arr_pr_no_upd_flg();
		}
		if ($iv_no_upd_flg.equalsIgnoreCase(name)) {
			return iv_no_upd_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			return data_crud_typ();
		}
		if ($rtn_sts_typ.equalsIgnoreCase(name)) {
			return rtn_sts_typ();
		}
		if ($pr_sts_typ.equalsIgnoreCase(name)) {
			return pr_sts_typ();
		}
		if ($pr_sts_typ_nm.equalsIgnoreCase(name)) {
			return pr_sts_typ_nm();
		}
		if ($asset_mng_typ.equalsIgnoreCase(name)) {
			return asset_mng_typ();
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
		if ($ret_dlv_slip_d_no.equalsIgnoreCase(name)) {
			return ret_dlv_slip_d_no();
		}
		if ($arr_wg_cd.equalsIgnoreCase(name)) {
			return arr_wg_cd();
		}
		if ($arr_pr_no.equalsIgnoreCase(name)) {
			return arr_pr_no();
		}
		if ($rcpt_iv_no.equalsIgnoreCase(name)) {
			return rcpt_iv_no();
		}
		if ($rcpt_iv_mng_no.equalsIgnoreCase(name)) {
			return rcpt_iv_mng_no();
		}
		if ($iv_no.equalsIgnoreCase(name)) {
			return iv_no();
		}
		if ($po_no.equalsIgnoreCase(name)) {
			return po_no();
		}
		if ($po_d_no.equalsIgnoreCase(name)) {
			return po_d_no();
		}
		if ($prov_act_no.equalsIgnoreCase(name)) {
			return prov_act_no();
		}
		if ($arr_ptn_typ.equalsIgnoreCase(name)) {
			return arr_ptn_typ();
		}
		if ($io_schd_pr_no.equalsIgnoreCase(name)) {
			return io_schd_pr_no();
		}
		if ($prov_typ.equalsIgnoreCase(name)) {
			return prov_typ();
		}
		if ($prov_basis_typ.equalsIgnoreCase(name)) {
			return prov_basis_typ();
		}
		if ($mfg_inst_no.equalsIgnoreCase(name)) {
			return mfg_inst_no();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($peg_no.equalsIgnoreCase(name)) {
			return peg_no();
		}
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			return trd_unit_dec_place();
		}
		if ($cont_fctr_dec_place.equalsIgnoreCase(name)) {
			return cont_fctr_dec_place();
		}
		if ($arr_pr_upd_cntr.equalsIgnoreCase(name)) {
			return arr_pr_upd_cntr();
		}
		if ($arr_act_upd_cntr.equalsIgnoreCase(name)) {
			return arr_act_upd_cntr();
		}
		if ($rcpt_iv_upd_cntr.equalsIgnoreCase(name)) {
			return rcpt_iv_upd_cntr();
		}
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($can_ac_dt.equalsIgnoreCase(name)) {
			return can_ac_dt();
		}
		if ($arr_dt.equalsIgnoreCase(name)) {
			return arr_dt();
		}
		return super.getDateNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($err_flg.equalsIgnoreCase(name)) {
			return err_flg();
		}
		if ($ver_flg.equalsIgnoreCase(name)) {
			return ver_flg();
		}
		if ($bp_lot_flg.equalsIgnoreCase(name)) {
			return bp_lot_flg();
		}
		if ($arr_str_ln_tgt_flg.equalsIgnoreCase(name)) {
			return arr_str_ln_tgt_flg();
		}
		if ($ret_str_ln_tgt_flg.equalsIgnoreCase(name)) {
			return ret_str_ln_tgt_flg();
		}
		if ($abort_flg.equalsIgnoreCase(name)) {
			return abort_flg();
		}
		if ($crt_lot_flg.equalsIgnoreCase(name)) {
			return crt_lot_flg();
		}
		if ($same_lot_flg.equalsIgnoreCase(name)) {
			return same_lot_flg();
		}
		if ($pre_outsrc_act_flg.equalsIgnoreCase(name)) {
			return pre_outsrc_act_flg();
		}
		if ($prnt_flg.equalsIgnoreCase(name)) {
			return prnt_flg();
		}
		if ($cststk_flg.equalsIgnoreCase(name)) {
			return cststk_flg();
		}
		if ($acxfr_gi_flg.equalsIgnoreCase(name)) {
			return acxfr_gi_flg();
		}
		if ($xpns_purc_flg.equalsIgnoreCase(name)) {
			return xpns_purc_flg();
		}
		if ($sls_acxfr_flg.equalsIgnoreCase(name)) {
			return sls_acxfr_flg();
		}
		if ($purc_flg.equalsIgnoreCase(name)) {
			return purc_flg();
		}
		if ($sls_rtn_flg.equalsIgnoreCase(name)) {
			return sls_rtn_flg();
		}
		if ($xfr_flg.equalsIgnoreCase(name)) {
			return xfr_flg();
		}
		if ($arr_dpt_cd_upd_flg.equalsIgnoreCase(name)) {
			return arr_dpt_cd_upd_flg();
		}
		if ($arr_usr_cd_upd_flg.equalsIgnoreCase(name)) {
			return arr_usr_cd_upd_flg();
		}
		if ($sno1_upd_flg.equalsIgnoreCase(name)) {
			return sno1_upd_flg();
		}
		if ($sno2_upd_flg.equalsIgnoreCase(name)) {
			return sno2_upd_flg();
		}
		if ($sno3_upd_flg.equalsIgnoreCase(name)) {
			return sno3_upd_flg();
		}
		if ($sno4_upd_flg.equalsIgnoreCase(name)) {
			return sno4_upd_flg();
		}
		if ($lot_no_upd_flg.equalsIgnoreCase(name)) {
			return lot_no_upd_flg();
		}
		if ($sublot_no_upd_flg.equalsIgnoreCase(name)) {
			return sublot_no_upd_flg();
		}
		if ($ver_no_upd_flg.equalsIgnoreCase(name)) {
			return ver_no_upd_flg();
		}
		if ($stk_arrv_bp_cd_upd_flg.equalsIgnoreCase(name)) {
			return stk_arrv_bp_cd_upd_flg();
		}
		if ($gd_cd_upd_flg.equalsIgnoreCase(name)) {
			return gd_cd_upd_flg();
		}
		if ($quality_typ_upd_flg.equalsIgnoreCase(name)) {
			return quality_typ_upd_flg();
		}
		if ($stk_insp_typ_upd_flg.equalsIgnoreCase(name)) {
			return stk_insp_typ_upd_flg();
		}
		if ($stk_id_typ_upd_flg.equalsIgnoreCase(name)) {
			return stk_id_typ_upd_flg();
		}
		if ($stk_bp_cd_upd_flg.equalsIgnoreCase(name)) {
			return stk_bp_cd_upd_flg();
		}
		if ($sppl_itm_cd_upd_flg.equalsIgnoreCase(name)) {
			return sppl_itm_cd_upd_flg();
		}
		if ($sppl_itm_nm_upd_flg.equalsIgnoreCase(name)) {
			return sppl_itm_nm_upd_flg();
		}
		if ($maker_cd_upd_flg.equalsIgnoreCase(name)) {
			return maker_cd_upd_flg();
		}
		if ($bp_lot_no_upd_flg.equalsIgnoreCase(name)) {
			return bp_lot_no_upd_flg();
		}
		if ($bp_dlv_slip_no_upd_flg.equalsIgnoreCase(name)) {
			return bp_dlv_slip_no_upd_flg();
		}
		if ($bp_dlv_slip_d_no_upd_flg.equalsIgnoreCase(name)) {
			return bp_dlv_slip_d_no_upd_flg();
		}
		if ($ship_fr_valid_dt_upd_flg.equalsIgnoreCase(name)) {
			return ship_fr_valid_dt_upd_flg();
		}
		if ($purc_cont_qty_upd_flg.equalsIgnoreCase(name)) {
			return purc_cont_qty_upd_flg();
		}
		if ($insp_cnt_rmrks_upd_flg.equalsIgnoreCase(name)) {
			return insp_cnt_rmrks_upd_flg();
		}
		if ($intr_rmrks_upd_flg.equalsIgnoreCase(name)) {
			return intr_rmrks_upd_flg();
		}
		if ($trd_rmrks_upd_flg.equalsIgnoreCase(name)) {
			return trd_rmrks_upd_flg();
		}
		if ($trd_d_rmrks_upd_flg.equalsIgnoreCase(name)) {
			return trd_d_rmrks_upd_flg();
		}
		if ($sub_char1_upd_flg.equalsIgnoreCase(name)) {
			return sub_char1_upd_flg();
		}
		if ($sub_char2_upd_flg.equalsIgnoreCase(name)) {
			return sub_char2_upd_flg();
		}
		if ($sub_char3_upd_flg.equalsIgnoreCase(name)) {
			return sub_char3_upd_flg();
		}
		if ($arr_pr_no_upd_flg.equalsIgnoreCase(name)) {
			return arr_pr_no_upd_flg();
		}
		if ($iv_no_upd_flg.equalsIgnoreCase(name)) {
			return iv_no_upd_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			data_crud_typ(value);
			return;
		}
		if ($rtn_sts_typ.equalsIgnoreCase(name)) {
			rtn_sts_typ(value);
			return;
		}
		if ($pr_sts_typ.equalsIgnoreCase(name)) {
			pr_sts_typ(value);
			return;
		}
		if ($pr_sts_typ_nm.equalsIgnoreCase(name)) {
			pr_sts_typ_nm(value);
			return;
		}
		if ($asset_mng_typ.equalsIgnoreCase(name)) {
			asset_mng_typ(value);
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
		if ($ret_dlv_slip_d_no.equalsIgnoreCase(name)) {
			ret_dlv_slip_d_no(value);
			return;
		}
		if ($arr_wg_cd.equalsIgnoreCase(name)) {
			arr_wg_cd(value);
			return;
		}
		if ($arr_pr_no.equalsIgnoreCase(name)) {
			arr_pr_no(value);
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
		if ($iv_no.equalsIgnoreCase(name)) {
			iv_no(value);
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
		if ($prov_act_no.equalsIgnoreCase(name)) {
			prov_act_no(value);
			return;
		}
		if ($arr_ptn_typ.equalsIgnoreCase(name)) {
			arr_ptn_typ(value);
			return;
		}
		if ($io_schd_pr_no.equalsIgnoreCase(name)) {
			io_schd_pr_no(value);
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
		if ($mfg_inst_no.equalsIgnoreCase(name)) {
			mfg_inst_no(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			trd_unit_dec_place(value);
			return;
		}
		if ($cont_fctr_dec_place.equalsIgnoreCase(name)) {
			cont_fctr_dec_place(value);
			return;
		}
		if ($arr_pr_upd_cntr.equalsIgnoreCase(name)) {
			arr_pr_upd_cntr(value);
			return;
		}
		if ($arr_act_upd_cntr.equalsIgnoreCase(name)) {
			arr_act_upd_cntr(value);
			return;
		}
		if ($rcpt_iv_upd_cntr.equalsIgnoreCase(name)) {
			rcpt_iv_upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			trd_unit_dec_place(value);
			return;
		}
		if ($cont_fctr_dec_place.equalsIgnoreCase(name)) {
			cont_fctr_dec_place(value);
			return;
		}
		if ($arr_pr_upd_cntr.equalsIgnoreCase(name)) {
			arr_pr_upd_cntr(value);
			return;
		}
		if ($arr_act_upd_cntr.equalsIgnoreCase(name)) {
			arr_act_upd_cntr(value);
			return;
		}
		if ($rcpt_iv_upd_cntr.equalsIgnoreCase(name)) {
			rcpt_iv_upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			trd_unit_dec_place(value);
			return;
		}
		if ($cont_fctr_dec_place.equalsIgnoreCase(name)) {
			cont_fctr_dec_place(value);
			return;
		}
		if ($arr_pr_upd_cntr.equalsIgnoreCase(name)) {
			arr_pr_upd_cntr(value);
			return;
		}
		if ($arr_act_upd_cntr.equalsIgnoreCase(name)) {
			arr_act_upd_cntr(value);
			return;
		}
		if ($rcpt_iv_upd_cntr.equalsIgnoreCase(name)) {
			rcpt_iv_upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			trd_unit_dec_place(value);
			return;
		}
		if ($cont_fctr_dec_place.equalsIgnoreCase(name)) {
			cont_fctr_dec_place(value);
			return;
		}
		if ($arr_pr_upd_cntr.equalsIgnoreCase(name)) {
			arr_pr_upd_cntr(value);
			return;
		}
		if ($arr_act_upd_cntr.equalsIgnoreCase(name)) {
			arr_act_upd_cntr(value);
			return;
		}
		if ($rcpt_iv_upd_cntr.equalsIgnoreCase(name)) {
			rcpt_iv_upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			trd_unit_dec_place(value);
			return;
		}
		if ($cont_fctr_dec_place.equalsIgnoreCase(name)) {
			cont_fctr_dec_place(value);
			return;
		}
		if ($arr_pr_upd_cntr.equalsIgnoreCase(name)) {
			arr_pr_upd_cntr(value);
			return;
		}
		if ($arr_act_upd_cntr.equalsIgnoreCase(name)) {
			arr_act_upd_cntr(value);
			return;
		}
		if ($rcpt_iv_upd_cntr.equalsIgnoreCase(name)) {
			rcpt_iv_upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($can_ac_dt.equalsIgnoreCase(name)) {
			can_ac_dt(value);
			return;
		}
		if ($arr_dt.equalsIgnoreCase(name)) {
			arr_dt(value);
			return;
		}
		super.setDate(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($err_flg.equalsIgnoreCase(name)) {
			err_flg(value);
			return;
		}
		if ($ver_flg.equalsIgnoreCase(name)) {
			ver_flg(value);
			return;
		}
		if ($bp_lot_flg.equalsIgnoreCase(name)) {
			bp_lot_flg(value);
			return;
		}
		if ($arr_str_ln_tgt_flg.equalsIgnoreCase(name)) {
			arr_str_ln_tgt_flg(value);
			return;
		}
		if ($ret_str_ln_tgt_flg.equalsIgnoreCase(name)) {
			ret_str_ln_tgt_flg(value);
			return;
		}
		if ($abort_flg.equalsIgnoreCase(name)) {
			abort_flg(value);
			return;
		}
		if ($crt_lot_flg.equalsIgnoreCase(name)) {
			crt_lot_flg(value);
			return;
		}
		if ($same_lot_flg.equalsIgnoreCase(name)) {
			same_lot_flg(value);
			return;
		}
		if ($pre_outsrc_act_flg.equalsIgnoreCase(name)) {
			pre_outsrc_act_flg(value);
			return;
		}
		if ($prnt_flg.equalsIgnoreCase(name)) {
			prnt_flg(value);
			return;
		}
		if ($cststk_flg.equalsIgnoreCase(name)) {
			cststk_flg(value);
			return;
		}
		if ($acxfr_gi_flg.equalsIgnoreCase(name)) {
			acxfr_gi_flg(value);
			return;
		}
		if ($xpns_purc_flg.equalsIgnoreCase(name)) {
			xpns_purc_flg(value);
			return;
		}
		if ($sls_acxfr_flg.equalsIgnoreCase(name)) {
			sls_acxfr_flg(value);
			return;
		}
		if ($purc_flg.equalsIgnoreCase(name)) {
			purc_flg(value);
			return;
		}
		if ($sls_rtn_flg.equalsIgnoreCase(name)) {
			sls_rtn_flg(value);
			return;
		}
		if ($xfr_flg.equalsIgnoreCase(name)) {
			xfr_flg(value);
			return;
		}
		if ($arr_dpt_cd_upd_flg.equalsIgnoreCase(name)) {
			arr_dpt_cd_upd_flg(value);
			return;
		}
		if ($arr_usr_cd_upd_flg.equalsIgnoreCase(name)) {
			arr_usr_cd_upd_flg(value);
			return;
		}
		if ($sno1_upd_flg.equalsIgnoreCase(name)) {
			sno1_upd_flg(value);
			return;
		}
		if ($sno2_upd_flg.equalsIgnoreCase(name)) {
			sno2_upd_flg(value);
			return;
		}
		if ($sno3_upd_flg.equalsIgnoreCase(name)) {
			sno3_upd_flg(value);
			return;
		}
		if ($sno4_upd_flg.equalsIgnoreCase(name)) {
			sno4_upd_flg(value);
			return;
		}
		if ($lot_no_upd_flg.equalsIgnoreCase(name)) {
			lot_no_upd_flg(value);
			return;
		}
		if ($sublot_no_upd_flg.equalsIgnoreCase(name)) {
			sublot_no_upd_flg(value);
			return;
		}
		if ($ver_no_upd_flg.equalsIgnoreCase(name)) {
			ver_no_upd_flg(value);
			return;
		}
		if ($stk_arrv_bp_cd_upd_flg.equalsIgnoreCase(name)) {
			stk_arrv_bp_cd_upd_flg(value);
			return;
		}
		if ($gd_cd_upd_flg.equalsIgnoreCase(name)) {
			gd_cd_upd_flg(value);
			return;
		}
		if ($quality_typ_upd_flg.equalsIgnoreCase(name)) {
			quality_typ_upd_flg(value);
			return;
		}
		if ($stk_insp_typ_upd_flg.equalsIgnoreCase(name)) {
			stk_insp_typ_upd_flg(value);
			return;
		}
		if ($stk_id_typ_upd_flg.equalsIgnoreCase(name)) {
			stk_id_typ_upd_flg(value);
			return;
		}
		if ($stk_bp_cd_upd_flg.equalsIgnoreCase(name)) {
			stk_bp_cd_upd_flg(value);
			return;
		}
		if ($sppl_itm_cd_upd_flg.equalsIgnoreCase(name)) {
			sppl_itm_cd_upd_flg(value);
			return;
		}
		if ($sppl_itm_nm_upd_flg.equalsIgnoreCase(name)) {
			sppl_itm_nm_upd_flg(value);
			return;
		}
		if ($maker_cd_upd_flg.equalsIgnoreCase(name)) {
			maker_cd_upd_flg(value);
			return;
		}
		if ($bp_lot_no_upd_flg.equalsIgnoreCase(name)) {
			bp_lot_no_upd_flg(value);
			return;
		}
		if ($bp_dlv_slip_no_upd_flg.equalsIgnoreCase(name)) {
			bp_dlv_slip_no_upd_flg(value);
			return;
		}
		if ($bp_dlv_slip_d_no_upd_flg.equalsIgnoreCase(name)) {
			bp_dlv_slip_d_no_upd_flg(value);
			return;
		}
		if ($ship_fr_valid_dt_upd_flg.equalsIgnoreCase(name)) {
			ship_fr_valid_dt_upd_flg(value);
			return;
		}
		if ($purc_cont_qty_upd_flg.equalsIgnoreCase(name)) {
			purc_cont_qty_upd_flg(value);
			return;
		}
		if ($insp_cnt_rmrks_upd_flg.equalsIgnoreCase(name)) {
			insp_cnt_rmrks_upd_flg(value);
			return;
		}
		if ($intr_rmrks_upd_flg.equalsIgnoreCase(name)) {
			intr_rmrks_upd_flg(value);
			return;
		}
		if ($trd_rmrks_upd_flg.equalsIgnoreCase(name)) {
			trd_rmrks_upd_flg(value);
			return;
		}
		if ($trd_d_rmrks_upd_flg.equalsIgnoreCase(name)) {
			trd_d_rmrks_upd_flg(value);
			return;
		}
		if ($sub_char1_upd_flg.equalsIgnoreCase(name)) {
			sub_char1_upd_flg(value);
			return;
		}
		if ($sub_char2_upd_flg.equalsIgnoreCase(name)) {
			sub_char2_upd_flg(value);
			return;
		}
		if ($sub_char3_upd_flg.equalsIgnoreCase(name)) {
			sub_char3_upd_flg(value);
			return;
		}
		if ($arr_pr_no_upd_flg.equalsIgnoreCase(name)) {
			arr_pr_no_upd_flg(value);
			return;
		}
		if ($iv_no_upd_flg.equalsIgnoreCase(name)) {
			iv_no_upd_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			data_crud_typ(value);
			return;
		}
		if ($rtn_sts_typ.equalsIgnoreCase(name)) {
			rtn_sts_typ(value);
			return;
		}
		if ($pr_sts_typ.equalsIgnoreCase(name)) {
			pr_sts_typ(value);
			return;
		}
		if ($pr_sts_typ_nm.equalsIgnoreCase(name)) {
			pr_sts_typ_nm(value);
			return;
		}
		if ($asset_mng_typ.equalsIgnoreCase(name)) {
			asset_mng_typ(value);
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
		if ($ret_dlv_slip_d_no.equalsIgnoreCase(name)) {
			ret_dlv_slip_d_no(value);
			return;
		}
		if ($arr_wg_cd.equalsIgnoreCase(name)) {
			arr_wg_cd(value);
			return;
		}
		if ($arr_pr_no.equalsIgnoreCase(name)) {
			arr_pr_no(value);
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
		if ($iv_no.equalsIgnoreCase(name)) {
			iv_no(value);
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
		if ($prov_act_no.equalsIgnoreCase(name)) {
			prov_act_no(value);
			return;
		}
		if ($arr_ptn_typ.equalsIgnoreCase(name)) {
			arr_ptn_typ(value);
			return;
		}
		if ($io_schd_pr_no.equalsIgnoreCase(name)) {
			io_schd_pr_no(value);
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
		if ($mfg_inst_no.equalsIgnoreCase(name)) {
			mfg_inst_no(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			trd_unit_dec_place(value);
			return;
		}
		if ($cont_fctr_dec_place.equalsIgnoreCase(name)) {
			cont_fctr_dec_place(value);
			return;
		}
		if ($arr_pr_upd_cntr.equalsIgnoreCase(name)) {
			arr_pr_upd_cntr(value);
			return;
		}
		if ($arr_act_upd_cntr.equalsIgnoreCase(name)) {
			arr_act_upd_cntr(value);
			return;
		}
		if ($rcpt_iv_upd_cntr.equalsIgnoreCase(name)) {
			rcpt_iv_upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			trd_unit_dec_place(value);
			return;
		}
		if ($cont_fctr_dec_place.equalsIgnoreCase(name)) {
			cont_fctr_dec_place(value);
			return;
		}
		if ($arr_pr_upd_cntr.equalsIgnoreCase(name)) {
			arr_pr_upd_cntr(value);
			return;
		}
		if ($arr_act_upd_cntr.equalsIgnoreCase(name)) {
			arr_act_upd_cntr(value);
			return;
		}
		if ($rcpt_iv_upd_cntr.equalsIgnoreCase(name)) {
			rcpt_iv_upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			trd_unit_dec_place(value);
			return;
		}
		if ($cont_fctr_dec_place.equalsIgnoreCase(name)) {
			cont_fctr_dec_place(value);
			return;
		}
		if ($arr_pr_upd_cntr.equalsIgnoreCase(name)) {
			arr_pr_upd_cntr(value);
			return;
		}
		if ($arr_act_upd_cntr.equalsIgnoreCase(name)) {
			arr_act_upd_cntr(value);
			return;
		}
		if ($rcpt_iv_upd_cntr.equalsIgnoreCase(name)) {
			rcpt_iv_upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			trd_unit_dec_place(value);
			return;
		}
		if ($cont_fctr_dec_place.equalsIgnoreCase(name)) {
			cont_fctr_dec_place(value);
			return;
		}
		if ($arr_pr_upd_cntr.equalsIgnoreCase(name)) {
			arr_pr_upd_cntr(value);
			return;
		}
		if ($arr_act_upd_cntr.equalsIgnoreCase(name)) {
			arr_act_upd_cntr(value);
			return;
		}
		if ($rcpt_iv_upd_cntr.equalsIgnoreCase(name)) {
			rcpt_iv_upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			trd_unit_dec_place(value);
			return;
		}
		if ($cont_fctr_dec_place.equalsIgnoreCase(name)) {
			cont_fctr_dec_place(value);
			return;
		}
		if ($arr_pr_upd_cntr.equalsIgnoreCase(name)) {
			arr_pr_upd_cntr(value);
			return;
		}
		if ($arr_act_upd_cntr.equalsIgnoreCase(name)) {
			arr_act_upd_cntr(value);
			return;
		}
		if ($rcpt_iv_upd_cntr.equalsIgnoreCase(name)) {
			rcpt_iv_upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($can_ac_dt.equalsIgnoreCase(name)) {
			can_ac_dt(value);
			return;
		}
		if ($arr_dt.equalsIgnoreCase(name)) {
			arr_dt(value);
			return;
		}
		super.setDateNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($err_flg.equalsIgnoreCase(name)) {
			err_flg(value);
			return;
		}
		if ($ver_flg.equalsIgnoreCase(name)) {
			ver_flg(value);
			return;
		}
		if ($bp_lot_flg.equalsIgnoreCase(name)) {
			bp_lot_flg(value);
			return;
		}
		if ($arr_str_ln_tgt_flg.equalsIgnoreCase(name)) {
			arr_str_ln_tgt_flg(value);
			return;
		}
		if ($ret_str_ln_tgt_flg.equalsIgnoreCase(name)) {
			ret_str_ln_tgt_flg(value);
			return;
		}
		if ($abort_flg.equalsIgnoreCase(name)) {
			abort_flg(value);
			return;
		}
		if ($crt_lot_flg.equalsIgnoreCase(name)) {
			crt_lot_flg(value);
			return;
		}
		if ($same_lot_flg.equalsIgnoreCase(name)) {
			same_lot_flg(value);
			return;
		}
		if ($pre_outsrc_act_flg.equalsIgnoreCase(name)) {
			pre_outsrc_act_flg(value);
			return;
		}
		if ($prnt_flg.equalsIgnoreCase(name)) {
			prnt_flg(value);
			return;
		}
		if ($cststk_flg.equalsIgnoreCase(name)) {
			cststk_flg(value);
			return;
		}
		if ($acxfr_gi_flg.equalsIgnoreCase(name)) {
			acxfr_gi_flg(value);
			return;
		}
		if ($xpns_purc_flg.equalsIgnoreCase(name)) {
			xpns_purc_flg(value);
			return;
		}
		if ($sls_acxfr_flg.equalsIgnoreCase(name)) {
			sls_acxfr_flg(value);
			return;
		}
		if ($purc_flg.equalsIgnoreCase(name)) {
			purc_flg(value);
			return;
		}
		if ($sls_rtn_flg.equalsIgnoreCase(name)) {
			sls_rtn_flg(value);
			return;
		}
		if ($xfr_flg.equalsIgnoreCase(name)) {
			xfr_flg(value);
			return;
		}
		if ($arr_dpt_cd_upd_flg.equalsIgnoreCase(name)) {
			arr_dpt_cd_upd_flg(value);
			return;
		}
		if ($arr_usr_cd_upd_flg.equalsIgnoreCase(name)) {
			arr_usr_cd_upd_flg(value);
			return;
		}
		if ($sno1_upd_flg.equalsIgnoreCase(name)) {
			sno1_upd_flg(value);
			return;
		}
		if ($sno2_upd_flg.equalsIgnoreCase(name)) {
			sno2_upd_flg(value);
			return;
		}
		if ($sno3_upd_flg.equalsIgnoreCase(name)) {
			sno3_upd_flg(value);
			return;
		}
		if ($sno4_upd_flg.equalsIgnoreCase(name)) {
			sno4_upd_flg(value);
			return;
		}
		if ($lot_no_upd_flg.equalsIgnoreCase(name)) {
			lot_no_upd_flg(value);
			return;
		}
		if ($sublot_no_upd_flg.equalsIgnoreCase(name)) {
			sublot_no_upd_flg(value);
			return;
		}
		if ($ver_no_upd_flg.equalsIgnoreCase(name)) {
			ver_no_upd_flg(value);
			return;
		}
		if ($stk_arrv_bp_cd_upd_flg.equalsIgnoreCase(name)) {
			stk_arrv_bp_cd_upd_flg(value);
			return;
		}
		if ($gd_cd_upd_flg.equalsIgnoreCase(name)) {
			gd_cd_upd_flg(value);
			return;
		}
		if ($quality_typ_upd_flg.equalsIgnoreCase(name)) {
			quality_typ_upd_flg(value);
			return;
		}
		if ($stk_insp_typ_upd_flg.equalsIgnoreCase(name)) {
			stk_insp_typ_upd_flg(value);
			return;
		}
		if ($stk_id_typ_upd_flg.equalsIgnoreCase(name)) {
			stk_id_typ_upd_flg(value);
			return;
		}
		if ($stk_bp_cd_upd_flg.equalsIgnoreCase(name)) {
			stk_bp_cd_upd_flg(value);
			return;
		}
		if ($sppl_itm_cd_upd_flg.equalsIgnoreCase(name)) {
			sppl_itm_cd_upd_flg(value);
			return;
		}
		if ($sppl_itm_nm_upd_flg.equalsIgnoreCase(name)) {
			sppl_itm_nm_upd_flg(value);
			return;
		}
		if ($maker_cd_upd_flg.equalsIgnoreCase(name)) {
			maker_cd_upd_flg(value);
			return;
		}
		if ($bp_lot_no_upd_flg.equalsIgnoreCase(name)) {
			bp_lot_no_upd_flg(value);
			return;
		}
		if ($bp_dlv_slip_no_upd_flg.equalsIgnoreCase(name)) {
			bp_dlv_slip_no_upd_flg(value);
			return;
		}
		if ($bp_dlv_slip_d_no_upd_flg.equalsIgnoreCase(name)) {
			bp_dlv_slip_d_no_upd_flg(value);
			return;
		}
		if ($ship_fr_valid_dt_upd_flg.equalsIgnoreCase(name)) {
			ship_fr_valid_dt_upd_flg(value);
			return;
		}
		if ($purc_cont_qty_upd_flg.equalsIgnoreCase(name)) {
			purc_cont_qty_upd_flg(value);
			return;
		}
		if ($insp_cnt_rmrks_upd_flg.equalsIgnoreCase(name)) {
			insp_cnt_rmrks_upd_flg(value);
			return;
		}
		if ($intr_rmrks_upd_flg.equalsIgnoreCase(name)) {
			intr_rmrks_upd_flg(value);
			return;
		}
		if ($trd_rmrks_upd_flg.equalsIgnoreCase(name)) {
			trd_rmrks_upd_flg(value);
			return;
		}
		if ($trd_d_rmrks_upd_flg.equalsIgnoreCase(name)) {
			trd_d_rmrks_upd_flg(value);
			return;
		}
		if ($sub_char1_upd_flg.equalsIgnoreCase(name)) {
			sub_char1_upd_flg(value);
			return;
		}
		if ($sub_char2_upd_flg.equalsIgnoreCase(name)) {
			sub_char2_upd_flg(value);
			return;
		}
		if ($sub_char3_upd_flg.equalsIgnoreCase(name)) {
			sub_char3_upd_flg(value);
			return;
		}
		if ($arr_pr_no_upd_flg.equalsIgnoreCase(name)) {
			arr_pr_no_upd_flg(value);
			return;
		}
		if ($iv_no_upd_flg.equalsIgnoreCase(name)) {
			iv_no_upd_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}

	public MCRow getInnerRow(String name) {
		if ($arr_act.equalsIgnoreCase(name)) {
			return arr_act();
		}
		return super.getInnerRow(name);
	}

	public void setInnerRow(String name, MCRow value) {
		if ($arr_act.equalsIgnoreCase(name)) {
			arr_act(
				((MCContainerMeta) arr_act_META).castInnerRow(mcframe.serverMS.dbc.MST_ARR_ACT_R.class, value)
			);
			return;
		}
		super.setInnerRow(name, value);
	}


	/**
	 * Receipt result No. 入荷実績ＮＯ.<p>
	 *
	 */
	public String arr_act_no() {
		return arr_act().arr_act_no();
	}

	/**
	 * Receipt result No. 入荷実績ＮＯ.<p>
	 *
	 */
	public void arr_act_no(String value) {
		arr_act().arr_act_no(value);
	}

	/**
	 * Receipt result rev. number 入荷実績改訂番号.<p>
	 *
	 */
	public MCNumber arr_act_rev() {
		return arr_act().arr_act_rev();
	}

	/**
	 * Receipt result rev. number 入荷実績改訂番号.<p>
	 *
	 */
	public void arr_act_rev(MCNumber value) {
		arr_act().arr_act_rev(value);
	}

	/**
	 * Receipt result rev. number 入荷実績改訂番号.<p>
	 *
	 */
	public void arr_act_rev(int value) {
		arr_act().arr_act_rev(value);
	}

	/**
	 * Receipt result rev. number 入荷実績改訂番号.<p>
	 *
	 */
	public void arr_act_rev(long value) {
		arr_act().arr_act_rev(value);
	}

	/**
	 * Receipt result rev. number 入荷実績改訂番号.<p>
	 *
	 */
	public void arr_act_rev(float value) {
		arr_act().arr_act_rev(value);
	}

	/**
	 * Receipt result rev. number 入荷実績改訂番号.<p>
	 *
	 */
	public void arr_act_rev(double value) {
		arr_act().arr_act_rev(value);
	}

	/**
	 * Receipt schedule No. 入荷予定ＮＯ.<p>
	 *
	 */
	public String arr_schd_no() {
		return arr_act().arr_schd_no();
	}

	/**
	 * Receipt schedule No. 入荷予定ＮＯ.<p>
	 *
	 */
	public void arr_schd_no(String value) {
		arr_act().arr_schd_no(value);
	}

	/**
	 * Transaction cd. 取引ＣＤ.<p>
	 *
	 */
	public String trd_cd() {
		return arr_act().trd_cd();
	}

	/**
	 * Transaction cd. 取引ＣＤ.<p>
	 *
	 */
	public void trd_cd(String value) {
		arr_act().trd_cd(value);
	}

	/**
	 * Transaction pattern type 取引パタン区分.<p>
	 *
	 */
	public String trd_ptn_typ() {
		return arr_act().trd_ptn_typ();
	}

	/**
	 * Transaction pattern type 取引パタン区分.<p>
	 *
	 */
	public void trd_ptn_typ(String value) {
		arr_act().trd_ptn_typ(value);
	}

	/**
	 * Purchase result GR/GI No. 仕入実績受払ＮＯ.<p>
	 *
	 */
	public String purc_act_io_no() {
		return arr_act().purc_act_io_no();
	}

	/**
	 * Purchase result GR/GI No. 仕入実績受払ＮＯ.<p>
	 *
	 */
	public void purc_act_io_no(String value) {
		arr_act().purc_act_io_no(value);
	}

	/**
	 * Receipt date and time 入荷日時.<p>
	 *
	 */
	public MCDate arr_tm() {
		return arr_act().arr_tm();
	}

	/**
	 * Receipt date and time 入荷日時.<p>
	 *
	 */
	public void arr_tm(MCDate value) {
		arr_act().arr_tm(value);
	}

	/**
	 * Recording date 計上日.<p>
	 *
	 */
	public MCDate ac_dt() {
		return arr_act().ac_dt();
	}

	/**
	 * Recording date 計上日.<p>
	 *
	 */
	public void ac_dt(MCDate value) {
		arr_act().ac_dt(value);
	}

	/**
	 * Receipt location cd. 入荷場所ＣＤ.<p>
	 *
	 */
	public String arr_loc_cd() {
		return arr_act().arr_loc_cd();
	}

	/**
	 * Receipt location cd. 入荷場所ＣＤ.<p>
	 *
	 */
	public void arr_loc_cd(String value) {
		arr_act().arr_loc_cd(value);
	}

	/**
	 * Rack/Line cd. 棚・ラインＣＤ.<p>
	 *
	 */
	public String str_ln_cd() {
		return arr_act().str_ln_cd();
	}

	/**
	 * Rack/Line cd. 棚・ラインＣＤ.<p>
	 *
	 */
	public void str_ln_cd(String value) {
		arr_act().str_ln_cd(value);
	}

	/**
	 * Receipt dept. cd. 入荷部門ＣＤ.<p>
	 *
	 */
	public String arr_dpt_cd() {
		return arr_act().arr_dpt_cd();
	}

	/**
	 * Receipt dept. cd. 入荷部門ＣＤ.<p>
	 *
	 */
	public void arr_dpt_cd(String value) {
		arr_act().arr_dpt_cd(value);
	}

	/**
	 * Receipt PIC cd. 入荷担当者ＣＤ.<p>
	 *
	 */
	public String arr_usr_cd() {
		return arr_act().arr_usr_cd();
	}

	/**
	 * Receipt PIC cd. 入荷担当者ＣＤ.<p>
	 *
	 */
	public void arr_usr_cd(String value) {
		arr_act().arr_usr_cd(value);
	}

	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public String itm_cd() {
		return arr_act().itm_cd();
	}

	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public void itm_cd(String value) {
		arr_act().itm_cd(value);
	}

	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public String itm_sub1() {
		return arr_act().itm_sub1();
	}

	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public void itm_sub1(String value) {
		arr_act().itm_sub1(value);
	}

	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public String itm_sub2() {
		return arr_act().itm_sub2();
	}

	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public void itm_sub2(String value) {
		arr_act().itm_sub2(value);
	}

	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public String itm_sub3() {
		return arr_act().itm_sub3();
	}

	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public void itm_sub3(String value) {
		arr_act().itm_sub3(value);
	}

	/**
	 * Item name 品名.<p>
	 *
	 */
	public String itm_nm() {
		return arr_act().itm_nm();
	}

	/**
	 * Item name 品名.<p>
	 *
	 */
	public void itm_nm(String value) {
		arr_act().itm_nm(value);
	}

	/**
	 * Item name for purchase invoice 受領インボイス表記品名.<p>
	 *
	 */
	public String rcpt_iv_itm_nm() {
		return arr_act().rcpt_iv_itm_nm();
	}

	/**
	 * Item name for purchase invoice 受領インボイス表記品名.<p>
	 *
	 */
	public void rcpt_iv_itm_nm(String value) {
		arr_act().rcpt_iv_itm_nm(value);
	}

	/**
	 * Miscellaneous item flg. 諸口品ＦＬＧ.<p>
	 *
	 */
	public boolean sundry_itm_flg() {
		return arr_act().sundry_itm_flg();
	}

	/**
	 * Miscellaneous item flg. 諸口品ＦＬＧ.<p>
	 *
	 */
	public void sundry_itm_flg(boolean value) {
		arr_act().sundry_itm_flg(value);
	}

	/**
	 * Purchase identification type 購買識別区分.<p>
	 *
	 */
	public String purc_id_typ() {
		return arr_act().purc_id_typ();
	}

	/**
	 * Purchase identification type 購買識別区分.<p>
	 *
	 */
	public void purc_id_typ(String value) {
		arr_act().purc_id_typ(value);
	}

	/**
	 * Inventory management type 在庫管理区分.<p>
	 *
	 */
	public String stk_mng_typ() {
		return arr_act().stk_mng_typ();
	}

	/**
	 * Inventory management type 在庫管理区分.<p>
	 *
	 */
	public void stk_mng_typ(String value) {
		arr_act().stk_mng_typ(value);
	}

	/**
	 * SEIBAN No. 1 手配ＮＯ１.<p>
	 *
	 */
	public String sno1() {
		return arr_act().sno1();
	}

	/**
	 * SEIBAN No. 1 手配ＮＯ１.<p>
	 *
	 */
	public void sno1(String value) {
		arr_act().sno1(value);
	}

	/**
	 * SEIBAN No. 1 management type 手配ＮＯ１管理区分.<p>
	 *
	 */
	public String sno1_mng_typ() {
		return arr_act().sno1_mng_typ();
	}

	/**
	 * SEIBAN No. 1 management type 手配ＮＯ１管理区分.<p>
	 *
	 */
	public void sno1_mng_typ(String value) {
		arr_act().sno1_mng_typ(value);
	}

	/**
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public String sno2() {
		return arr_act().sno2();
	}

	/**
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public void sno2(String value) {
		arr_act().sno2(value);
	}

	/**
	 * SEIBAN No. 2 management type 手配ＮＯ２管理区分.<p>
	 *
	 */
	public String sno2_mng_typ() {
		return arr_act().sno2_mng_typ();
	}

	/**
	 * SEIBAN No. 2 management type 手配ＮＯ２管理区分.<p>
	 *
	 */
	public void sno2_mng_typ(String value) {
		arr_act().sno2_mng_typ(value);
	}

	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public String sno3() {
		return arr_act().sno3();
	}

	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public void sno3(String value) {
		arr_act().sno3(value);
	}

	/**
	 * SEIBAN No. 3 management type 手配ＮＯ３管理区分.<p>
	 *
	 */
	public String sno3_mng_typ() {
		return arr_act().sno3_mng_typ();
	}

	/**
	 * SEIBAN No. 3 management type 手配ＮＯ３管理区分.<p>
	 *
	 */
	public void sno3_mng_typ(String value) {
		arr_act().sno3_mng_typ(value);
	}

	/**
	 * SEIBAN No. 4 手配ＮＯ４.<p>
	 *
	 */
	public String sno4() {
		return arr_act().sno4();
	}

	/**
	 * SEIBAN No. 4 手配ＮＯ４.<p>
	 *
	 */
	public void sno4(String value) {
		arr_act().sno4(value);
	}

	/**
	 * SEIBAN No. 4 management type 手配ＮＯ４管理区分.<p>
	 *
	 */
	public String sno4_mng_typ() {
		return arr_act().sno4_mng_typ();
	}

	/**
	 * SEIBAN No. 4 management type 手配ＮＯ４管理区分.<p>
	 *
	 */
	public void sno4_mng_typ(String value) {
		arr_act().sno4_mng_typ(value);
	}

	/**
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public String lot_no() {
		return arr_act().lot_no();
	}

	/**
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public void lot_no(String value) {
		arr_act().lot_no(value);
	}

	/**
	 * Sublot No. サブロットＮＯ.<p>
	 *
	 */
	public String sublot_no() {
		return arr_act().sublot_no();
	}

	/**
	 * Sublot No. サブロットＮＯ.<p>
	 *
	 */
	public void sublot_no(String value) {
		arr_act().sublot_no(value);
	}

	/**
	 * Version No. 版ＮＯ.<p>
	 *
	 */
	public String ver_no() {
		return arr_act().ver_no();
	}

	/**
	 * Version No. 版ＮＯ.<p>
	 *
	 */
	public void ver_no(String value) {
		arr_act().ver_no(value);
	}

	/**
	 * Inventory arriving point cd. 在庫着荷先ＣＤ.<p>
	 *
	 */
	public String stk_arrv_bp_cd() {
		return arr_act().stk_arrv_bp_cd();
	}

	/**
	 * Inventory arriving point cd. 在庫着荷先ＣＤ.<p>
	 *
	 */
	public void stk_arrv_bp_cd(String value) {
		arr_act().stk_arrv_bp_cd(value);
	}

	/**
	 * Grading cd. 格付ＣＤ.<p>
	 *
	 */
	public String gd_cd() {
		return arr_act().gd_cd();
	}

	/**
	 * Grading cd. 格付ＣＤ.<p>
	 *
	 */
	public void gd_cd(String value) {
		arr_act().gd_cd(value);
	}

	/**
	 * Conforming type 良品区分.<p>
	 *
	 */
	public String quality_typ() {
		return arr_act().quality_typ();
	}

	/**
	 * Conforming type 良品区分.<p>
	 *
	 */
	public void quality_typ(String value) {
		arr_act().quality_typ(value);
	}

	/**
	 * Inventory inspection type 在庫検査区分.<p>
	 *
	 */
	public String stk_insp_typ() {
		return arr_act().stk_insp_typ();
	}

	/**
	 * Inventory inspection type 在庫検査区分.<p>
	 *
	 */
	public void stk_insp_typ(String value) {
		arr_act().stk_insp_typ(value);
	}

	/**
	 * Inventory identification type 在庫識別区分.<p>
	 *
	 */
	public String stk_id_typ() {
		return arr_act().stk_id_typ();
	}

	/**
	 * Inventory identification type 在庫識別区分.<p>
	 *
	 */
	public void stk_id_typ(String value) {
		arr_act().stk_id_typ(value);
	}

	/**
	 * Inventory BP cd. 在庫取引先ＣＤ.<p>
	 *
	 */
	public String stk_bp_cd() {
		return arr_act().stk_bp_cd();
	}

	/**
	 * Inventory BP cd. 在庫取引先ＣＤ.<p>
	 *
	 */
	public void stk_bp_cd(String value) {
		arr_act().stk_bp_cd(value);
	}

	/**
	 * Supplier item cd. 発注先品目ＣＤ.<p>
	 *
	 */
	public String sppl_itm_cd() {
		return arr_act().sppl_itm_cd();
	}

	/**
	 * Supplier item cd. 発注先品目ＣＤ.<p>
	 *
	 */
	public void sppl_itm_cd(String value) {
		arr_act().sppl_itm_cd(value);
	}

	/**
	 * Supplier item name 発注先品名.<p>
	 *
	 */
	public String sppl_itm_nm() {
		return arr_act().sppl_itm_nm();
	}

	/**
	 * Supplier item name 発注先品名.<p>
	 *
	 */
	public void sppl_itm_nm(String value) {
		arr_act().sppl_itm_nm(value);
	}

	/**
	 * Requesting dept. cd. 依頼元部門ＣＤ.<p>
	 *
	 */
	public String rqst_dpt_cd() {
		return arr_act().rqst_dpt_cd();
	}

	/**
	 * Requesting dept. cd. 依頼元部門ＣＤ.<p>
	 *
	 */
	public void rqst_dpt_cd(String value) {
		arr_act().rqst_dpt_cd(value);
	}

	/**
	 * Requesting PIC cd. 依頼元担当者ＣＤ.<p>
	 *
	 */
	public String rqst_usr_cd() {
		return arr_act().rqst_usr_cd();
	}

	/**
	 * Requesting PIC cd. 依頼元担当者ＣＤ.<p>
	 *
	 */
	public void rqst_usr_cd(String value) {
		arr_act().rqst_usr_cd(value);
	}

	/**
	 * Customer cd. 得意先ＣＤ.<p>
	 *
	 */
	public String cst_cd() {
		return arr_act().cst_cd();
	}

	/**
	 * Customer cd. 得意先ＣＤ.<p>
	 *
	 */
	public void cst_cd(String value) {
		arr_act().cst_cd(value);
	}

	/**
	 * Pickup company cd. 引取先ＣＤ.<p>
	 *
	 */
	public String sret_fr_cd() {
		return arr_act().sret_fr_cd();
	}

	/**
	 * Pickup company cd. 引取先ＣＤ.<p>
	 *
	 */
	public void sret_fr_cd(String value) {
		arr_act().sret_fr_cd(value);
	}

	/**
	 * Supplier cd. 発注先ＣＤ.<p>
	 *
	 */
	public String sppl_cd() {
		return arr_act().sppl_cd();
	}

	/**
	 * Supplier cd. 発注先ＣＤ.<p>
	 *
	 */
	public void sppl_cd(String value) {
		arr_act().sppl_cd(value);
	}

	/**
	 * Return-from location cd. 返品元場所ＣＤ.<p>
	 *
	 */
	public String ret_loc_cd() {
		return arr_act().ret_loc_cd();
	}

	/**
	 * Return-from location cd. 返品元場所ＣＤ.<p>
	 *
	 */
	public void ret_loc_cd(String value) {
		arr_act().ret_loc_cd(value);
	}

	/**
	 * Return-from rack/line cd. 返品元棚・ラインＣＤ.<p>
	 *
	 */
	public String ret_str_ln_cd() {
		return arr_act().ret_str_ln_cd();
	}

	/**
	 * Return-from rack/line cd. 返品元棚・ラインＣＤ.<p>
	 *
	 */
	public void ret_str_ln_cd(String value) {
		arr_act().ret_str_ln_cd(value);
	}

	/**
	 * Return-from grading cd. 返品元格付ＣＤ.<p>
	 *
	 */
	public String ret_gd_cd() {
		return arr_act().ret_gd_cd();
	}

	/**
	 * Return-from grading cd. 返品元格付ＣＤ.<p>
	 *
	 */
	public void ret_gd_cd(String value) {
		arr_act().ret_gd_cd(value);
	}

	/**
	 * Maker cd. メーカＣＤ.<p>
	 *
	 */
	public String maker_cd() {
		return arr_act().maker_cd();
	}

	/**
	 * Maker cd. メーカＣＤ.<p>
	 *
	 */
	public void maker_cd(String value) {
		arr_act().maker_cd(value);
	}

	/**
	 * Vendor lot No. 業者ロットＮＯ.<p>
	 *
	 */
	public String bp_lot_no() {
		return arr_act().bp_lot_no();
	}

	/**
	 * Vendor lot No. 業者ロットＮＯ.<p>
	 *
	 */
	public void bp_lot_no(String value) {
		arr_act().bp_lot_no(value);
	}

	/**
	 * Vendor delivery note No. 業者納品書ＮＯ.<p>
	 *
	 */
	public String bp_dlv_slip_no() {
		return arr_act().bp_dlv_slip_no();
	}

	/**
	 * Vendor delivery note No. 業者納品書ＮＯ.<p>
	 *
	 */
	public void bp_dlv_slip_no(String value) {
		arr_act().bp_dlv_slip_no(value);
	}

	/**
	 * Vendor delivery note details No. 業者納品書明細ＮＯ.<p>
	 *
	 */
	public String bp_dlv_slip_d_no() {
		return arr_act().bp_dlv_slip_d_no();
	}

	/**
	 * Vendor delivery note details No. 業者納品書明細ＮＯ.<p>
	 *
	 */
	public void bp_dlv_slip_d_no(String value) {
		arr_act().bp_dlv_slip_d_no(value);
	}

	/**
	 * Shipping point deadline 出荷元期限.<p>
	 *
	 */
	public MCDate ship_fr_valid_dt() {
		return arr_act().ship_fr_valid_dt();
	}

	/**
	 * Shipping point deadline 出荷元期限.<p>
	 *
	 */
	public void ship_fr_valid_dt(MCDate value) {
		arr_act().ship_fr_valid_dt(value);
	}

	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public MCNumber trd_unit_qty() {
		return arr_act().trd_unit_qty();
	}

	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public void trd_unit_qty(MCNumber value) {
		arr_act().trd_unit_qty(value);
	}

	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public void trd_unit_qty(int value) {
		arr_act().trd_unit_qty(value);
	}

	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public void trd_unit_qty(long value) {
		arr_act().trd_unit_qty(value);
	}

	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public void trd_unit_qty(float value) {
		arr_act().trd_unit_qty(value);
	}

	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public void trd_unit_qty(double value) {
		arr_act().trd_unit_qty(value);
	}

	/**
	 * Transaction unit cd. 取引単位ＣＤ.<p>
	 *
	 */
	public String trd_unit_cd() {
		return arr_act().trd_unit_cd();
	}

	/**
	 * Transaction unit cd. 取引単位ＣＤ.<p>
	 *
	 */
	public void trd_unit_cd(String value) {
		arr_act().trd_unit_cd(value);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public MCNumber base_unit_qty() {
		return arr_act().base_unit_qty();
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(MCNumber value) {
		arr_act().base_unit_qty(value);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(int value) {
		arr_act().base_unit_qty(value);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(long value) {
		arr_act().base_unit_qty(value);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(float value) {
		arr_act().base_unit_qty(value);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(double value) {
		arr_act().base_unit_qty(value);
	}

	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public String base_unit_cd() {
		return arr_act().base_unit_cd();
	}

	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public void base_unit_cd(String value) {
		arr_act().base_unit_cd(value);
	}

	/**
	 * Amount (Transaction currency) 取引通貨金額.<p>
	 *
	 */
	public MCNumber trd_cur_amt() {
		return arr_act().trd_cur_amt();
	}

	/**
	 * Amount (Transaction currency) 取引通貨金額.<p>
	 *
	 */
	public void trd_cur_amt(MCNumber value) {
		arr_act().trd_cur_amt(value);
	}

	/**
	 * Amount (Transaction currency) 取引通貨金額.<p>
	 *
	 */
	public void trd_cur_amt(int value) {
		arr_act().trd_cur_amt(value);
	}

	/**
	 * Amount (Transaction currency) 取引通貨金額.<p>
	 *
	 */
	public void trd_cur_amt(long value) {
		arr_act().trd_cur_amt(value);
	}

	/**
	 * Amount (Transaction currency) 取引通貨金額.<p>
	 *
	 */
	public void trd_cur_amt(float value) {
		arr_act().trd_cur_amt(value);
	}

	/**
	 * Amount (Transaction currency) 取引通貨金額.<p>
	 *
	 */
	public void trd_cur_amt(double value) {
		arr_act().trd_cur_amt(value);
	}

	/**
	 * Tax amount (Transaction currency) 取引通貨税額.<p>
	 *
	 */
	public MCNumber trd_cur_tax_amt() {
		return arr_act().trd_cur_tax_amt();
	}

	/**
	 * Tax amount (Transaction currency) 取引通貨税額.<p>
	 *
	 */
	public void trd_cur_tax_amt(MCNumber value) {
		arr_act().trd_cur_tax_amt(value);
	}

	/**
	 * Tax amount (Transaction currency) 取引通貨税額.<p>
	 *
	 */
	public void trd_cur_tax_amt(int value) {
		arr_act().trd_cur_tax_amt(value);
	}

	/**
	 * Tax amount (Transaction currency) 取引通貨税額.<p>
	 *
	 */
	public void trd_cur_tax_amt(long value) {
		arr_act().trd_cur_tax_amt(value);
	}

	/**
	 * Tax amount (Transaction currency) 取引通貨税額.<p>
	 *
	 */
	public void trd_cur_tax_amt(float value) {
		arr_act().trd_cur_tax_amt(value);
	}

	/**
	 * Tax amount (Transaction currency) 取引通貨税額.<p>
	 *
	 */
	public void trd_cur_tax_amt(double value) {
		arr_act().trd_cur_tax_amt(value);
	}

	/**
	 * Amount (Base currency) 基準通貨金額.<p>
	 *
	 */
	public MCNumber base_cur_amt() {
		return arr_act().base_cur_amt();
	}

	/**
	 * Amount (Base currency) 基準通貨金額.<p>
	 *
	 */
	public void base_cur_amt(MCNumber value) {
		arr_act().base_cur_amt(value);
	}

	/**
	 * Amount (Base currency) 基準通貨金額.<p>
	 *
	 */
	public void base_cur_amt(int value) {
		arr_act().base_cur_amt(value);
	}

	/**
	 * Amount (Base currency) 基準通貨金額.<p>
	 *
	 */
	public void base_cur_amt(long value) {
		arr_act().base_cur_amt(value);
	}

	/**
	 * Amount (Base currency) 基準通貨金額.<p>
	 *
	 */
	public void base_cur_amt(float value) {
		arr_act().base_cur_amt(value);
	}

	/**
	 * Amount (Base currency) 基準通貨金額.<p>
	 *
	 */
	public void base_cur_amt(double value) {
		arr_act().base_cur_amt(value);
	}

	/**
	 * Tax amount (Base currency) 基準通貨税額.<p>
	 *
	 */
	public MCNumber base_cur_tax_amt() {
		return arr_act().base_cur_tax_amt();
	}

	/**
	 * Tax amount (Base currency) 基準通貨税額.<p>
	 *
	 */
	public void base_cur_tax_amt(MCNumber value) {
		arr_act().base_cur_tax_amt(value);
	}

	/**
	 * Tax amount (Base currency) 基準通貨税額.<p>
	 *
	 */
	public void base_cur_tax_amt(int value) {
		arr_act().base_cur_tax_amt(value);
	}

	/**
	 * Tax amount (Base currency) 基準通貨税額.<p>
	 *
	 */
	public void base_cur_tax_amt(long value) {
		arr_act().base_cur_tax_amt(value);
	}

	/**
	 * Tax amount (Base currency) 基準通貨税額.<p>
	 *
	 */
	public void base_cur_tax_amt(float value) {
		arr_act().base_cur_tax_amt(value);
	}

	/**
	 * Tax amount (Base currency) 基準通貨税額.<p>
	 *
	 */
	public void base_cur_tax_amt(double value) {
		arr_act().base_cur_tax_amt(value);
	}

	/**
	 * Amount (Tax currency) 納税通貨金額.<p>
	 *
	 */
	public MCNumber ptax_cur_amt() {
		return arr_act().ptax_cur_amt();
	}

	/**
	 * Amount (Tax currency) 納税通貨金額.<p>
	 *
	 */
	public void ptax_cur_amt(MCNumber value) {
		arr_act().ptax_cur_amt(value);
	}

	/**
	 * Amount (Tax currency) 納税通貨金額.<p>
	 *
	 */
	public void ptax_cur_amt(int value) {
		arr_act().ptax_cur_amt(value);
	}

	/**
	 * Amount (Tax currency) 納税通貨金額.<p>
	 *
	 */
	public void ptax_cur_amt(long value) {
		arr_act().ptax_cur_amt(value);
	}

	/**
	 * Amount (Tax currency) 納税通貨金額.<p>
	 *
	 */
	public void ptax_cur_amt(float value) {
		arr_act().ptax_cur_amt(value);
	}

	/**
	 * Amount (Tax currency) 納税通貨金額.<p>
	 *
	 */
	public void ptax_cur_amt(double value) {
		arr_act().ptax_cur_amt(value);
	}

	/**
	 * Tax amount (Tax currency) 納税通貨税額.<p>
	 *
	 */
	public MCNumber ptax_cur_tax_amt() {
		return arr_act().ptax_cur_tax_amt();
	}

	/**
	 * Tax amount (Tax currency) 納税通貨税額.<p>
	 *
	 */
	public void ptax_cur_tax_amt(MCNumber value) {
		arr_act().ptax_cur_tax_amt(value);
	}

	/**
	 * Tax amount (Tax currency) 納税通貨税額.<p>
	 *
	 */
	public void ptax_cur_tax_amt(int value) {
		arr_act().ptax_cur_tax_amt(value);
	}

	/**
	 * Tax amount (Tax currency) 納税通貨税額.<p>
	 *
	 */
	public void ptax_cur_tax_amt(long value) {
		arr_act().ptax_cur_tax_amt(value);
	}

	/**
	 * Tax amount (Tax currency) 納税通貨税額.<p>
	 *
	 */
	public void ptax_cur_tax_amt(float value) {
		arr_act().ptax_cur_tax_amt(value);
	}

	/**
	 * Tax amount (Tax currency) 納税通貨税額.<p>
	 *
	 */
	public void ptax_cur_tax_amt(double value) {
		arr_act().ptax_cur_tax_amt(value);
	}

	/**
	 * Purchase active ingredient 仕入有効成分.<p>
	 *
	 */
	public MCNumber purc_cont_qty() {
		return arr_act().purc_cont_qty();
	}

	/**
	 * Purchase active ingredient 仕入有効成分.<p>
	 *
	 */
	public void purc_cont_qty(MCNumber value) {
		arr_act().purc_cont_qty(value);
	}

	/**
	 * Purchase active ingredient 仕入有効成分.<p>
	 *
	 */
	public void purc_cont_qty(int value) {
		arr_act().purc_cont_qty(value);
	}

	/**
	 * Purchase active ingredient 仕入有効成分.<p>
	 *
	 */
	public void purc_cont_qty(long value) {
		arr_act().purc_cont_qty(value);
	}

	/**
	 * Purchase active ingredient 仕入有効成分.<p>
	 *
	 */
	public void purc_cont_qty(float value) {
		arr_act().purc_cont_qty(value);
	}

	/**
	 * Purchase active ingredient 仕入有効成分.<p>
	 *
	 */
	public void purc_cont_qty(double value) {
		arr_act().purc_cont_qty(value);
	}

	/**
	 * Reason cd. 理由ＣＤ.<p>
	 *
	 */
	public String rsn_cd() {
		return arr_act().rsn_cd();
	}

	/**
	 * Reason cd. 理由ＣＤ.<p>
	 *
	 */
	public void rsn_cd(String value) {
		arr_act().rsn_cd(value);
	}

	/**
	 * Charged dept. cd. 負担部門ＣＤ.<p>
	 *
	 */
	public String bd_dpt_cd() {
		return arr_act().bd_dpt_cd();
	}

	/**
	 * Charged dept. cd. 負担部門ＣＤ.<p>
	 *
	 */
	public void bd_dpt_cd(String value) {
		arr_act().bd_dpt_cd(value);
	}

	/**
	 * Charged WG cd. 負担ワーキンググループＣＤ.<p>
	 *
	 */
	public String bd_wg_cd() {
		return arr_act().bd_wg_cd();
	}

	/**
	 * Charged WG cd. 負担ワーキンググループＣＤ.<p>
	 *
	 */
	public void bd_wg_cd(String value) {
		arr_act().bd_wg_cd(value);
	}

	/**
	 * Simultaneous recording flg. 同時計上ＦＬＧ.<p>
	 *
	 */
	public boolean sync_flg() {
		return arr_act().sync_flg();
	}

	/**
	 * Simultaneous recording flg. 同時計上ＦＬＧ.<p>
	 *
	 */
	public void sync_flg(boolean value) {
		arr_act().sync_flg(value);
	}

	/**
	 * EDI flg. ＥＤＩＦＬＧ.<p>
	 *
	 */
	public boolean edi_flg() {
		return arr_act().edi_flg();
	}

	/**
	 * EDI flg. ＥＤＩＦＬＧ.<p>
	 *
	 */
	public void edi_flg(boolean value) {
		arr_act().edi_flg(value);
	}

	/**
	 * EDI vendor delivery note No. ＥＤＩ業者納品書ＮＯ.<p>
	 *
	 */
	public String edi_bp_dlv_slip_no() {
		return arr_act().edi_bp_dlv_slip_no();
	}

	/**
	 * EDI vendor delivery note No. ＥＤＩ業者納品書ＮＯ.<p>
	 *
	 */
	public void edi_bp_dlv_slip_no(String value) {
		arr_act().edi_bp_dlv_slip_no(value);
	}

	/**
	 * EDI vendor delivery note details No. ＥＤＩ業者納品書明細ＮＯ.<p>
	 *
	 */
	public String edi_bp_dlv_slip_d_no() {
		return arr_act().edi_bp_dlv_slip_d_no();
	}

	/**
	 * EDI vendor delivery note details No. ＥＤＩ業者納品書明細ＮＯ.<p>
	 *
	 */
	public void edi_bp_dlv_slip_d_no(String value) {
		arr_act().edi_bp_dlv_slip_d_no(value);
	}

	/**
	 * Delivery note No. 納品書ＮＯ.<p>
	 *
	 */
	public String dlv_slip_no() {
		return arr_act().dlv_slip_no();
	}

	/**
	 * Delivery note No. 納品書ＮＯ.<p>
	 *
	 */
	public void dlv_slip_no(String value) {
		arr_act().dlv_slip_no(value);
	}

	/**
	 * Delivery note details No. 納品書明細ＮＯ.<p>
	 *
	 */
	public String dlv_slip_d_no() {
		return arr_act().dlv_slip_d_no();
	}

	/**
	 * Delivery note details No. 納品書明細ＮＯ.<p>
	 *
	 */
	public void dlv_slip_d_no(String value) {
		arr_act().dlv_slip_d_no(value);
	}

	/**
	 * Inspection contact remarks 検査連絡備考.<p>
	 *
	 */
	public String insp_cnt_rmrks() {
		return arr_act().insp_cnt_rmrks();
	}

	/**
	 * Inspection contact remarks 検査連絡備考.<p>
	 *
	 */
	public void insp_cnt_rmrks(String value) {
		arr_act().insp_cnt_rmrks(value);
	}

	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public String intr_rmrks() {
		return arr_act().intr_rmrks();
	}

	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public void intr_rmrks(String value) {
		arr_act().intr_rmrks(value);
	}

	/**
	 * Transaction remarks 取引備考.<p>
	 *
	 */
	public String trd_rmrks() {
		return arr_act().trd_rmrks();
	}

	/**
	 * Transaction remarks 取引備考.<p>
	 *
	 */
	public void trd_rmrks(String value) {
		arr_act().trd_rmrks(value);
	}

	/**
	 * Transaction details remarks 取引明細備考.<p>
	 *
	 */
	public String trd_d_rmrks() {
		return arr_act().trd_d_rmrks();
	}

	/**
	 * Transaction details remarks 取引明細備考.<p>
	 *
	 */
	public void trd_d_rmrks(String value) {
		arr_act().trd_d_rmrks(value);
	}

	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public String sub_char1() {
		return arr_act().sub_char1();
	}

	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public void sub_char1(String value) {
		arr_act().sub_char1(value);
	}

	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public String sub_char2() {
		return arr_act().sub_char2();
	}

	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public void sub_char2(String value) {
		arr_act().sub_char2(value);
	}

	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public String sub_char3() {
		return arr_act().sub_char3();
	}

	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public void sub_char3(String value) {
		arr_act().sub_char3(value);
	}

	/**
	 * SKU qty. 荷姿単位数量.<p>
	 *
	 */
	public MCNumber pack_unit_qty() {
		return arr_act().pack_unit_qty();
	}

	/**
	 * SKU qty. 荷姿単位数量.<p>
	 *
	 */
	public void pack_unit_qty(MCNumber value) {
		arr_act().pack_unit_qty(value);
	}

	/**
	 * SKU qty. 荷姿単位数量.<p>
	 *
	 */
	public void pack_unit_qty(int value) {
		arr_act().pack_unit_qty(value);
	}

	/**
	 * SKU qty. 荷姿単位数量.<p>
	 *
	 */
	public void pack_unit_qty(long value) {
		arr_act().pack_unit_qty(value);
	}

	/**
	 * SKU qty. 荷姿単位数量.<p>
	 *
	 */
	public void pack_unit_qty(float value) {
		arr_act().pack_unit_qty(value);
	}

	/**
	 * SKU qty. 荷姿単位数量.<p>
	 *
	 */
	public void pack_unit_qty(double value) {
		arr_act().pack_unit_qty(value);
	}

	/**
	 * SKU cd. 荷姿単位ＣＤ.<p>
	 *
	 */
	public String pack_unit_cd() {
		return arr_act().pack_unit_cd();
	}

	/**
	 * SKU cd. 荷姿単位ＣＤ.<p>
	 *
	 */
	public void pack_unit_cd(String value) {
		arr_act().pack_unit_cd(value);
	}

	/**
	 * Cancel flg. 取消ＦＬＧ.<p>
	 *
	 */
	public boolean can_flg() {
		return arr_act().can_flg();
	}

	/**
	 * Cancel flg. 取消ＦＬＧ.<p>
	 *
	 */
	public void can_flg(boolean value) {
		arr_act().can_flg(value);
	}

	/**
	 * WMS ＷＭＳ.<p>
	 *
	 */
	public boolean wms_flg() {
		return arr_act().wms_flg();
	}

	/**
	 * WMS ＷＭＳ.<p>
	 *
	 */
	public void wms_flg(boolean value) {
		arr_act().wms_flg(value);
	}

	/**
	 * External system cd. 外部システムＣＤ.<p>
	 *
	 */
	public String ext_sys_cd() {
		return arr_act().ext_sys_cd();
	}

	/**
	 * External system cd. 外部システムＣＤ.<p>
	 *
	 */
	public void ext_sys_cd(String value) {
		arr_act().ext_sys_cd(value);
	}

	/**
	 * External receipt result No. 外部入荷実績ＮＯ.<p>
	 *
	 */
	public String ext_arr_act_no() {
		return arr_act().ext_arr_act_no();
	}

	/**
	 * External receipt result No. 外部入荷実績ＮＯ.<p>
	 *
	 */
	public void ext_arr_act_no(String value) {
		arr_act().ext_arr_act_no(value);
	}

	/**
	 * Distribution group cd. 物流グループＣＤ.<p>
	 *
	 */
	public String lg_grp_cd() {
		return arr_act().lg_grp_cd();
	}

	/**
	 * Distribution group cd. 物流グループＣＤ.<p>
	 *
	 */
	public void lg_grp_cd(String value) {
		arr_act().lg_grp_cd(value);
	}

	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public String wg_cd() {
		return arr_act().wg_cd();
	}

	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public void wg_cd(String value) {
		arr_act().wg_cd(value);
	}

}

