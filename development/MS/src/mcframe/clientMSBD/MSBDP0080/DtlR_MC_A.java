package mcframe.clientMSBD.MSBDP0080;

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
	 * Details pegged No. 明細紐付ＮＯ.<p>
	 *
	 */
	public static final String $dtl_peg_no = "dtl_peg_no";
	/**
	 * Select 選択.<p>
	 *
	 */
	public static final String $check = "check";
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
	public static final String $in_to_loc_p = "in_to_loc_p";
	/**
	 * Delivery location WG cd. 納入場所ワーキンググループＣＤ.<p>
	 *
	 */
	public static final String $in_to_loc_wg_cd = "in_to_loc_wg_cd";
	/**
	 * Delivery location WG name 納入場所ワーキンググループ名.<p>
	 *
	 */
	public static final String $in_to_loc_wg_nm = "in_to_loc_wg_nm";
	/**
	 * Print price 価格印字.<p>
	 *
	 */
	public static final String $pri_prnt_flg = "pri_prnt_flg";
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
	 * Subcontractor cd. 外注発注先ＣＤ.<p>
	 *
	 */
	public static final String $outsrc_sppl_cd = "outsrc_sppl_cd";
	/**
	 * For rack/line 棚・ライン対象.<p>
	 *
	 */
	public static final String $str_ln_tgt_flg = "str_ln_tgt_flg";
	/**
	 * Controlling site type 管轄区分.<p>
	 *
	 */
	public static final String $loc_mng_typ = "loc_mng_typ";
	/**
	 * Delivery location calendar cd. 納入場所カレンダＣＤ.<p>
	 *
	 */
	public static final String $in_to_loc_cal_cd = "in_to_loc_cal_cd";
	/**
	 * Factory/Distribution warehouse cd. 工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public static final String $site_cd = "site_cd";
	/**
	 * Distribution group cd. 物流グループＣＤ.<p>
	 *
	 */
	public static final String $lg_grp_cd = "lg_grp_cd";
	/**
	 * Mfg. location group cd. 製造場所グループＣＤ.<p>
	 *
	 */
	public static final String $loc_grp_cd = "loc_grp_cd";
	/**
	 * Available delivery location WG cd. (Before change) 変更前納入場所ワーキンググループＣＤ.<p>
	 *
	 */
	public static final String $bef_in_to_loc_wg_cd = "bef_in_to_loc_wg_cd";
	/**
	 * Distribution group cd. (Before change) 変更前物流グループＣＤ.<p>
	 *
	 */
	public static final String $bef_lg_grp_cd = "bef_lg_grp_cd";
	/**
	 * Before change mfg. location group cd. 変更前製造場所グループＣＤ.<p>
	 *
	 */
	public static final String $bef_loc_grp_cd = "bef_loc_grp_cd";
	public static final String $dlv_rqst_tm_p = "dlv_rqst_tm_p";
	public static final String $itm_p = "itm_p";
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
	 * Asset management type 資産管理区分.<p>
	 *
	 */
	public static final String $asset_mng_typ = "asset_mng_typ";
	/**
	 * Asset management type name 資産管理区分名.<p>
	 *
	 */
	public static final String $asset_mng_typ_nm = "asset_mng_typ_nm";
	public static final String $str_ln_p = "str_ln_p";
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
	 * For purchase delivery note 購買納品書対象.<p>
	 *
	 */
	public static final String $purc_dlv_slip_flg = "purc_dlv_slip_flg";
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
	 * Request source desired available date 依頼元使用可能希望日.<p>
	 *
	 */
	public static final String $rqst_avl_rqst_dt = "rqst_avl_rqst_dt";
	public static final String $rqst_dlv_rqst_tm_p = "rqst_dlv_rqst_tm_p";
	/**
	 * Scheduled purchase date 仕入予定日.<p>
	 *
	 */
	public static final String $purc_schd_dt = "purc_schd_dt";
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
	/**
	 * Simultaneous recording 同時計上.<p>
	 *
	 */
	public static final String $sync_flg = "sync_flg";
	/**
	 * Allow item purchasing unit price change 品目購買単価変更許可.<p>
	 *
	 */
	public static final String $itm_purc_upri_cng_flg = "itm_purc_upri_cng_flg";
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
	public static final String $ver_no_p = "ver_no_p";
	/**
	 * Vendor lot No. 業者ロットＮＯ.<p>
	 *
	 */
	public static final String $bp_lot_no = "bp_lot_no";
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
	 * AP dept. cd. 債務部門ＣＤ.<p>
	 *
	 */
	public static final String $ap_dpt_cd = "ap_dpt_cd";
	/**
	 * AP dept. name 債務部門名.<p>
	 *
	 */
	public static final String $ap_dpt_nm = "ap_dpt_nm";
	public static final String $dlv_p = "dlv_p";
	public static final String $dlv_cal_cd = "dlv_cal_cd";
	public static final String $tdlv_p = "tdlv_p";
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
	 * Confirmation received 請書受領.<p>
	 *
	 */
	public static final String $po_conf_rcpt_flg = "po_conf_rcpt_flg";
	/**
	 * Confirmation received date 請書受領日.<p>
	 *
	 */
	public static final String $po_conf_rcpt_dt = "po_conf_rcpt_dt";
	/**
	 * Unit cd. 単位ＣＤ.<p>
	 *
	 */
	public static final String $trd_unit_cd = "trd_unit_cd";
	/**
	 * Unit name 単位名.<p>
	 *
	 */
	public static final String $trd_unit_nm = "trd_unit_nm";
	/**
	 * Transaction unit number of decimal places 小数部有効桁数（取引単位）.<p>
	 *
	 */
	public static final String $trd_unit_dec_place = "trd_unit_dec_place";
	/**
	 * Transaction unit rounding type 取引単位端数処理区分.<p>
	 *
	 */
	public static final String $trd_unit_rnd_typ = "trd_unit_rnd_typ";
	/**
	 * Conversion base qty. 換算基準数量.<p>
	 *
	 */
	public static final String $trd_unit_conv_base_qty = "trd_unit_conv_base_qty";
	/**
	 * Conversion qty. 換算数量.<p>
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
	 * Cancel remaining 打切.<p>
	 *
	 */
	public static final String $abort_flg = "abort_flg";
	/**
	 * Last cancel remaining 前回打切.<p>
	 *
	 */
	public static final String $bef_abort_flg = "bef_abort_flg";
	public static final String $base_unit_qty_p = "base_unit_qty_p";
	/**
	 * Number of decimal places (Base unit) 小数部有効桁数（基準単位）.<p>
	 *
	 */
	public static final String $base_unit_dec_place = "base_unit_dec_place";
	/**
	 * Base unit rounding type 基準単位端数処理区分.<p>
	 *
	 */
	public static final String $base_unit_rnd_typ = "base_unit_rnd_typ";
	public static final String $inst_cont_qty_p = "inst_cont_qty_p";
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
	public static final String $cont_unit_p = "cont_unit_p";
	public static final String $std_cont_p = "std_cont_p";
	/**
	 * Purchase status type 購買状況区分.<p>
	 *
	 */
	public static final String $purc_sts_typ = "purc_sts_typ";
	/**
	 * Purchase status type name 購買状況区分名.<p>
	 *
	 */
	public static final String $purc_sts_typ_nm = "purc_sts_typ_nm";
	/**
	 * Delivery order qty. 納入指示数量.<p>
	 *
	 */
	public static final String $dlv_inst_qty = "dlv_inst_qty";
	/**
	 * Delivery order replied received qty. 納入指示回答受領数量.<p>
	 *
	 */
	public static final String $dlv_inst_prms_rcpt_qty = "dlv_inst_prms_rcpt_qty";
	/**
	 * Purchase invoice qty. 受領インボイス数量.<p>
	 *
	 */
	public static final String $rcpt_iv_qty = "rcpt_iv_qty";
	/**
	 * Receipt qty. 入荷数量.<p>
	 *
	 */
	public static final String $arr_qty = "arr_qty";
	/**
	 * Purchase qty. 仕入数量.<p>
	 *
	 */
	public static final String $purc_qty = "purc_qty";
	/**
	 * Split receipt schedule 入荷予定分割.<p>
	 *
	 */
	public static final String $arr_schd_split_flg = "arr_schd_split_flg";
	/**
	 * Receipt completed 入荷完了.<p>
	 *
	 */
	public static final String $arr_cmpl_flg = "arr_cmpl_flg";
	/**
	 * Purchase completed 仕入完了.<p>
	 *
	 */
	public static final String $purc_cmpl_flg = "purc_cmpl_flg";
	/**
	 * Payment carry-over count 支払繰越回数.<p>
	 *
	 */
	public static final String $pay_crryovr_times = "pay_crryovr_times";
	/**
	 * Purchase unit price acquisition type 購買単価取得区分.<p>
	 *
	 */
	public static final String $purc_upri_req_typ = "purc_upri_req_typ";
	/**
	 * Purchase unit price acquisition type name 購買単価取得区分名.<p>
	 *
	 */
	public static final String $purc_upri_req_typ_nm = "purc_upri_req_typ_nm";
	public static final String $trd_cur_upri_p = "trd_cur_upri_p";
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
	 * Temporary unit price before change 変更前仮単価.<p>
	 *
	 */
	public static final String $old_interim_flg = "old_interim_flg";
	/**
	 * (Before change) Discount amount (Transaction currency) 変更前取引通貨値引額.<p>
	 *
	 */
	public static final String $old_trd_cur_dscnt_amt = "old_trd_cur_dscnt_amt";
	/**
	 * Discount reason before change 変更前値引理由.<p>
	 *
	 */
	public static final String $old_dscnt_rsn_cd = "old_dscnt_rsn_cd";
	/**
	 * Discount reason name before change 変更前値引理由名.<p>
	 *
	 */
	public static final String $old_dscnt_rsn_nm = "old_dscnt_rsn_nm";
	public static final String $base_cur_upri_p = "base_cur_upri_p";
	public static final String $base_cur_dscnt_amt_p = "base_cur_dscnt_amt_p";
	public static final String $base_cur_amt_p = "base_cur_amt_p";
	public static final String $base_cur_tax_amt_p = "base_cur_tax_amt_p";
	public static final String $base_cur_inc_tax_amt_p = "base_cur_inc_tax_amt_p";
	public static final String $base_cur_proc_upri_p = "base_cur_proc_upri_p";
	public static final String $base_cur_proc_amt_p = "base_cur_proc_amt_p";
	public static final String $base_cur_onr_prov_upri_p = "base_cur_onr_prov_upri_p";
	public static final String $base_cur_onr_prov_amt_p = "base_cur_onr_prov_amt_p";
	public static final String $ptax_cur_upri_p = "ptax_cur_upri_p";
	public static final String $ptax_cur_dscnt_amt_p = "ptax_cur_dscnt_amt_p";
	public static final String $ptax_cur_amt_p = "ptax_cur_amt_p";
	public static final String $ptax_cur_tax_amt_p = "ptax_cur_tax_amt_p";
	public static final String $ptax_cur_inc_tax_amt_p = "ptax_cur_inc_tax_amt_p";
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
	 * Mfg. location cd. 製造場所ＣＤ.<p>
	 *
	 */
	public static final String $mfg_loc_cd = "mfg_loc_cd";
	/**
	 * Mfg. location name 製造場所名.<p>
	 *
	 */
	public static final String $mfg_loc_nm = "mfg_loc_nm";
	/**
	 * BOM pattern 構成パタン.<p>
	 *
	 */
	public static final String $bom_ptn = "bom_ptn";
	/**
	 * Subcontracting 外注.<p>
	 *
	 */
	public static final String $outsrc_flg = "outsrc_flg";
	/**
	 * Mfg. ordered 製造指図済.<p>
	 *
	 */
	public static final String $mfg_inst_flg = "mfg_inst_flg";
	/**
	 * Subcontracting item order No. 外注品目オーダＮＯ.<p>
	 *
	 */
	public static final String $outsrc_itm_ord_no = "outsrc_itm_ord_no";
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
	 * Expense purchase only 経費購買のみ.<p>
	 *
	 */
	public static final String $not_xpns_purc_flg = "not_xpns_purc_flg";
	public static final String $sno_wrk_no_p = "sno_wrk_no_p";
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
	 * Unpegged 紐切れ.<p>
	 *
	 */
	public static final String $rqst_can_flg = "rqst_can_flg";
	/**
	 * PO contact remarks 発注連絡備考.<p>
	 *
	 */
	public static final String $po_cnt_rmrks = "po_cnt_rmrks";
	/**
	 * Internal details remarks 内部明細備考.<p>
	 *
	 */
	public static final String $intr_rmrks = "intr_rmrks";
	/**
	 * Transaction details remarks 取引明細備考.<p>
	 *
	 */
	public static final String $trd_d_rmrks = "trd_d_rmrks";
	/**
	 * PO sheet details remarks 注文書明細備考.<p>
	 *
	 */
	public static final String $po_print_d_rmrks = "po_print_d_rmrks";
	/**
	 * Delivery note details remarks 納品書明細備考.<p>
	 *
	 */
	public static final String $dlv_slip_d_rmrks = "dlv_slip_d_rmrks";
	/**
	 * Receipt contact remarks 入荷連絡備考.<p>
	 *
	 */
	public static final String $arr_cnt_rmrks = "arr_cnt_rmrks";
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
	 * EDI details spare character string 1 ＥＤＩ明細予備文字列１.<p>
	 *
	 */
	public static final String $edi_sub_d_char1 = "edi_sub_d_char1";
	/**
	 * EDI details spare character string 2 ＥＤＩ明細予備文字列２.<p>
	 *
	 */
	public static final String $edi_sub_d_char2 = "edi_sub_d_char2";
	/**
	 * EDI details spare character string 3 ＥＤＩ明細予備文字列３.<p>
	 *
	 */
	public static final String $edi_sub_d_char3 = "edi_sub_d_char3";
	/**
	 * EDI details spare character string 4 ＥＤＩ明細予備文字列４.<p>
	 *
	 */
	public static final String $edi_sub_d_char4 = "edi_sub_d_char4";
	/**
	 * EDI details spare character string 5 ＥＤＩ明細予備文字列５.<p>
	 *
	 */
	public static final String $edi_sub_d_char5 = "edi_sub_d_char5";
	/**
	 * EDI details spare numerical value ＥＤＩ明細予備数値.<p>
	 *
	 */
	public static final String $edi_sub_d_num1 = "edi_sub_d_num1";
	/**
	 * EDI details spare date ＥＤＩ明細予備日付.<p>
	 *
	 */
	public static final String $edi_sub_d_dt1 = "edi_sub_d_dt1";
	/**
	 * External PO details No. 外部発注明細ＮＯ.<p>
	 *
	 */
	public static final String $ext_po_d_no = "ext_po_d_no";
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
	 * Delivery note No. 納品書ＮＯ.<p>
	 *
	 */
	public static final String $dlv_slip_no = "dlv_slip_no";
	/**
	 * Delivery note sequence number 納品書連番.<p>
	 *
	 */
	public static final String $dlv_slip_seq = "dlv_slip_seq";
	/**
	 * Not for delivery note 納品書対象外.<p>
	 *
	 */
	public static final String $dlv_slip_invalid_flg = "dlv_slip_invalid_flg";
	/**
	 * Direct delivery delivery note No. 仕入直送納品書ＮＯ.<p>
	 *
	 */
	public static final String $purc_ddlv_dlv_slip_no = "purc_ddlv_dlv_slip_no";
	/**
	 * Delivery note management No. 納品書管理ＮＯ.<p>
	 *
	 */
	public static final String $dlv_slip_mng_no = "dlv_slip_mng_no";
	/**
	 * Delivery note management sequence number 納品書管理連番.<p>
	 *
	 */
	public static final String $dlv_slip_mng_seq = "dlv_slip_mng_seq";
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
	 * Requesting PIC cd. 依頼元担当者ＣＤ.<p>
	 *
	 */
	public static final String $rqst_fr_usr_cd = "rqst_fr_usr_cd";
	/**
	 * Requesting PIC name 依頼元担当者名.<p>
	 *
	 */
	public static final String $rqst_fr_usr_nm = "rqst_fr_usr_nm";
	/**
	 * Requesting dept. cd. 依頼元部門ＣＤ.<p>
	 *
	 */
	public static final String $rqst_fr_dpt_cd = "rqst_fr_dpt_cd";
	/**
	 * Requesting dept. name 依頼元部門名.<p>
	 *
	 */
	public static final String $rqst_fr_dpt_nm = "rqst_fr_dpt_nm";
	/**
	 * Aggregation まとめ.<p>
	 *
	 */
	public static final String $bndl_flg = "bndl_flg";
	/**
	 * Request source sales order 依頼元受注.<p>
	 *
	 */
	public static final String $rqst_slo_flg = "rqst_slo_flg";
	/**
	 * PO schedule No. 発注予定ＮＯ.<p>
	 *
	 */
	public static final String $po_schd_no = "po_schd_no";
	/**
	 * PO details No. 発注明細ＮＯ.<p>
	 *
	 */
	public static final String $po_d_no = "po_d_no";
	/**
	 * Display order 表示順.<p>
	 *
	 */
	public static final String $disp_seq = "disp_seq";
	/**
	 * Received 入荷済.<p>
	 *
	 */
	public static final String $arr_flg = "arr_flg";
	/**
	 * Purchased 仕入済.<p>
	 *
	 */
	public static final String $purc_flg = "purc_flg";
	/**
	 * Purchase invoice entered 受領インボイス登録済.<p>
	 *
	 */
	public static final String $rcpt_iv_flg = "rcpt_iv_flg";
	/**
	 * Base date 基準日.<p>
	 *
	 */
	public static final String $base_dt = "base_dt";
	/**
	 * PO date 発注日.<p>
	 *
	 */
	public static final String $po_dt = "po_dt";
	/**
	 * With PO schedule 発注予定あり.<p>
	 *
	 */
	public static final String $po_schd_flg = "po_schd_flg";
	/**
	 * Mfg. location WG cd. 製造場所ワーキンググループＣＤ.<p>
	 *
	 */
	public static final String $mfg_loc_wg_cd = "mfg_loc_wg_cd";
	/**
	 * Cancel remaining receipt qty. 入荷残数打切.<p>
	 *
	 */
	public static final String $arr_rem_abort_flg = "arr_rem_abort_flg";
	/**
	 * Cancel remaining purchase qty. 仕入残数打切.<p>
	 *
	 */
	public static final String $purc_rem_abort_flg = "purc_rem_abort_flg";

	public static final String $show_dtl = $in_to_loc_p + ".show_dtl";
	public static final String $in_to_loc_zip_cd = $in_to_loc_p + ".zip_cd";
	public static final String $in_to_loc_addr1 = $in_to_loc_p + ".addr1";
	public static final String $in_to_loc_addr2 = $in_to_loc_p + ".addr2";
	public static final String $in_to_loc_addr3 = $in_to_loc_p + ".addr3";
	public static final String $in_to_loc_addr4 = $in_to_loc_p + ".addr4";
	public static final String $in_to_loc_tel = $in_to_loc_p + ".tel";
	public static final String $in_to_loc_fax = $in_to_loc_p + ".fax";
	public static final String $dlv_rqst_dt = $dlv_rqst_tm_p + ".ymd";
	public static final String $dlv_rqst_hm = $dlv_rqst_tm_p + ".hm";
	public static final String $itm_cd = $itm_p + ".itm_cd";
	public static final String $itm_sub1 = $itm_p + ".itm_sub1";
	public static final String $itm_sub2 = $itm_p + ".itm_sub2";
	public static final String $itm_sub3 = $itm_p + ".itm_sub3";
	public static final String $itm_nm = $itm_p + ".itm_nm";
	public static final String $str_ln_cd = $str_ln_p + ".str_ln_cd";
	public static final String $str_ln_nm = $str_ln_p + ".str_ln_nm";
	public static final String $str_ln_cd_none_flg = $str_ln_p + ".str_ln_cd_none_flg";
	public static final String $rqst_dlv_rqst_dt = $rqst_dlv_rqst_tm_p + ".ymd";
	public static final String $rqst_dlv_rqst_hm = $rqst_dlv_rqst_tm_p + ".hm";
	public static final String $ver_no = $ver_no_p + ".ver_no";
	public static final String $dlv_cd = $dlv_p + ".bp_cd";
	public static final String $dlv_nm = $dlv_p + ".bp_nm";
	public static final String $dlv_sundry_flg = $dlv_p + ".dlv_sundry_flg";
	public static final String $dlv_show_dtl = $dlv_p + ".show_dtl";
	public static final String $dlv_cntry_cd = $dlv_p + ".cntry_cd";
	public static final String $dlv_cntry_nm = $dlv_p + ".cntry_nm";
	public static final String $dlv_zip_cd = $dlv_p + ".zip_cd";
	public static final String $dlv_addr1 = $dlv_p + ".addr1";
	public static final String $dlv_addr2 = $dlv_p + ".addr2";
	public static final String $dlv_addr3 = $dlv_p + ".addr3";
	public static final String $dlv_addr4 = $dlv_p + ".addr4";
	public static final String $dlv_tel = $dlv_p + ".tel";
	public static final String $dlv_fax = $dlv_p + ".fax";
	public static final String $dlv_cntct_dpt = $dlv_p + ".dlv_cntct_dpt";
	public static final String $dlv_cntct_psn = $dlv_p + ".dlv_cntct_psn";
	public static final String $tdlv_cd = $tdlv_p + ".bp_cd";
	public static final String $tdlv_nm = $tdlv_p + ".bp_nm";
	public static final String $tdlv_sundry_flg = $tdlv_p + ".dlv_sundry_flg";
	public static final String $tdlv_show_dtl = $tdlv_p + ".show_dtl";
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
	public static final String $trd_unit_qty = $trd_unit_qty_p + ".qty";
	public static final String $base_unit_qty = $base_unit_qty_p + ".qty";
	public static final String $cont_qty = $inst_cont_qty_p + ".cont_qty";
	public static final String $cont_fctr_unit_cd = $cont_unit_p + ".cont_fctr_unit_cd";
	public static final String $cont_fctr_unit_nm = $cont_unit_p + ".cont_fctr_unit_nm";
	public static final String $std_cont_fctr = $std_cont_p + ".std_cont_fctr";
	public static final String $upri_not_tgt_flg = $trd_cur_upri_p + ".upri_not_tgt_flg";
	public static final String $trd_cur_upri = $trd_cur_upri_p + ".trd_cur_upri";
	public static final String $interim_flg = $trd_cur_upri_p + ".interim_flg";
	public static final String $trd_cur_amt = $trd_cur_upri_p + ".trd_cur_amt";
	public static final String $trd_cur_inc_tax_amt = $trd_cur_upri_p + ".trd_cur_inc_tax_amt";
	public static final String $tax_fix_flg = $trd_cur_upri_p + ".tax_fix_flg";
	public static final String $tax_cd = $trd_cur_upri_p + ".tax_cd";
	public static final String $tax_nm = $trd_cur_upri_p + ".tax_nm";
	public static final String $tax_rate = $trd_cur_upri_p + ".tax_rate";
	public static final String $tax_typ = $trd_cur_upri_p + ".tax_typ";
	public static final String $inc_tax_flg = $trd_cur_upri_p + ".inc_tax_flg";
	public static final String $trd_cur_tax_amt = $trd_cur_upri_p + ".trd_cur_tax_amt";
	public static final String $trd_cur_dscnt_amt = $trd_cur_upri_p + ".trd_cur_dscnt_amt";
	public static final String $dscnt_rsn_cd = $trd_cur_upri_p + ".dscnt_rsn_cd";
	public static final String $dscnt_rsn_nm = $trd_cur_upri_p + ".dscnt_rsn_nm";
	public static final String $trd_cur_proc_upri = $trd_cur_proc_upri_p + ".upri";
	public static final String $trd_cur_proc_amt = $trd_cur_proc_amt_p + ".amt";
	public static final String $trd_cur_proc_tax_amt = $trd_cur_proc_amt_p + ".tax_amt";
	public static final String $trd_cur_onr_prov_upri = $trd_cur_onr_prov_upri_p + ".upri";
	public static final String $trd_cur_onr_prov_amt = $trd_cur_onr_prov_amt_p + ".amt";
	public static final String $trd_cur_onr_prov_tax_amt = $trd_cur_onr_prov_amt_p + ".tax_amt";
	public static final String $base_cur_upri = $base_cur_upri_p + ".upri";
	public static final String $base_cur_dscnt_amt = $base_cur_dscnt_amt_p + ".amt";
	public static final String $base_cur_amt = $base_cur_amt_p + ".amt";
	public static final String $base_cur_tax_amt = $base_cur_tax_amt_p + ".amt";
	public static final String $base_cur_inc_tax_amt = $base_cur_inc_tax_amt_p + ".amt";
	public static final String $base_cur_proc_upri = $base_cur_proc_upri_p + ".upri";
	public static final String $base_cur_proc_amt = $base_cur_proc_amt_p + ".amt";
	public static final String $base_cur_onr_prov_upri = $base_cur_onr_prov_upri_p + ".upri";
	public static final String $base_cur_onr_prov_amt = $base_cur_onr_prov_amt_p + ".amt";
	public static final String $ptax_cur_upri = $ptax_cur_upri_p + ".upri";
	public static final String $ptax_cur_dscnt_amt = $ptax_cur_dscnt_amt_p + ".amt";
	public static final String $ptax_cur_amt = $ptax_cur_amt_p + ".amt";
	public static final String $ptax_cur_tax_amt = $ptax_cur_tax_amt_p + ".amt";
	public static final String $ptax_cur_inc_tax_amt = $ptax_cur_inc_tax_amt_p + ".amt";
	public static final String $ptax_cur_proc_upri = $ptax_cur_proc_upri_p + ".upri";
	public static final String $ptax_cur_proc_amt = $ptax_cur_proc_amt_p + ".amt";
	public static final String $ptax_cur_onr_prov_upri = $ptax_cur_onr_prov_upri_p + ".upri";
	public static final String $ptax_cur_onr_prov_amt = $ptax_cur_onr_prov_amt_p + ".amt";
	public static final String $wtax_amt = $wtax_amt_p + ".amt";
	public static final String $sno1 = $sno_wrk_no_p + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno1 + "";
	public static final String $sno2 = $sno_wrk_no_p + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno2 + "";
	public static final String $sno3 = $sno_wrk_no_p + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno3 + "";
	public static final String $sno4 = $sno_wrk_no_p + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno4 + "";
	public static final String $wrk_no = $sno_wrk_no_p + ".wrk_no";
	public static final String $wrk_nm = $sno_wrk_no_p + ".wrk_nm";
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

	public static final MCMeta dtl_peg_no_META = createCommonMeta($dtl_peg_no, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta check_META = createCommonMeta($check, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta in_to_loc_cd_META = createCommonMeta($in_to_loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta in_to_loc_nm_META = createCommonMeta($in_to_loc_nm, mcframe.commonMA.meta.MA_META.LOC_NM);
	public static final MCMeta in_to_loc_p_META = createInnerRowMeta($in_to_loc_p, mcframe.clientMAUB.MAUBP5360.AddrR.class);
	public static final MCMeta in_to_loc_wg_cd_META = createCommonMeta($in_to_loc_wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta in_to_loc_wg_nm_META = createCommonMeta($in_to_loc_wg_nm, mcframe.commonMA.meta.MA_META.WG_NM);
	public static final MCMeta pri_prnt_flg_META = createCommonMeta($pri_prnt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta drct_dlv_typ_META = createCommonMeta($drct_dlv_typ, mcframe.commonMS.meta.MS_META.DRCT_DLV_TYP);
	public static final MCMeta drct_dlv_typ_nm_META = createCommonMeta($drct_dlv_typ_nm, mcframe.commonMS.meta.MS_META.DRCT_DLV_TYP_NM);
	public static final MCMeta outsrc_sppl_cd_META = createCommonMeta($outsrc_sppl_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta str_ln_tgt_flg_META = createCommonMeta($str_ln_tgt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta loc_mng_typ_META = createCommonMeta($loc_mng_typ, mcframe.commonMA.meta.MA_META.LOC_MNG_TYP);
	public static final MCMeta in_to_loc_cal_cd_META = createCommonMeta($in_to_loc_cal_cd, mcframe.commonMA.meta.MA_META.CAL_CD);
	public static final MCMeta site_cd_META = createCommonMeta($site_cd, mcframe.commonMA.meta.MA_META.SITE_CD);
	public static final MCMeta lg_grp_cd_META = createCommonMeta($lg_grp_cd, mcframe.commonMA.meta.MA_META.LG_GRP_CD);
	public static final MCMeta loc_grp_cd_META = createCommonMeta($loc_grp_cd, mcframe.commonMA.meta.MA_META.LOC_GRP_CD);
	public static final MCMeta bef_in_to_loc_wg_cd_META = createCommonMeta($bef_in_to_loc_wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta bef_lg_grp_cd_META = createCommonMeta($bef_lg_grp_cd, mcframe.commonMA.meta.MA_META.LG_GRP_CD);
	public static final MCMeta bef_loc_grp_cd_META = createCommonMeta($bef_loc_grp_cd, mcframe.commonMA.meta.MA_META.LOC_GRP_CD);
	public static final MCMeta dlv_rqst_tm_p_META = createInnerRowMeta($dlv_rqst_tm_p, mcframe.clientMAUB.MAUBP5320.YmdHmR.class);
	public static final MCMeta itm_p_META = createInnerRowMeta($itm_p, mcframe.clientMAUB.MAUBP5030.ItmR.class);
	public static final MCMeta iv_itm_nm_META = createCommonMeta($iv_itm_nm, mcframe.commonMA.meta.MA_META.ITM_NM);
	public static final MCMeta sundry_itm_flg_META = createCommonMeta($sundry_itm_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta asset_mng_typ_META = createCommonMeta($asset_mng_typ, mcframe.commonMA.meta.MA_META.ASSET_MNG_TYP);
	public static final MCMeta asset_mng_typ_nm_META = createCommonMeta($asset_mng_typ_nm, mcframe.commonMA.meta.MA_META.ASSET_MNG_TYP_NM);
	public static final MCMeta str_ln_p_META = createInnerRowMeta($str_ln_p, mcframe.clientMAUB.MAUBP5120.StrLnR.class);
	public static final MCMeta stk_mng_typ_META = createCommonMeta($stk_mng_typ, mcframe.commonMA.meta.MA_META.STK_MNG_TYP);
	public static final MCMeta arr_skip_flg_META = createCommonMeta($arr_skip_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta purc_dlv_slip_flg_META = createCommonMeta($purc_dlv_slip_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta maker_cd_META = createCommonMeta($maker_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta maker_nm_META = createCommonMeta($maker_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta rqst_avl_rqst_dt_META = createCommonMeta($rqst_avl_rqst_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta rqst_dlv_rqst_tm_p_META = createInnerRowMeta($rqst_dlv_rqst_tm_p, mcframe.clientMAUB.MAUBP5320.YmdHmR.class);
	public static final MCMeta purc_schd_dt_META = createCommonMeta($purc_schd_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta purc_basis_typ_META = createCommonMeta($purc_basis_typ, mcframe.commonMA.meta.MA_META.PURC_BASIS_TYP);
	public static final MCMeta purc_basis_typ_nm_META = createCommonMeta($purc_basis_typ_nm, mcframe.commonMA.meta.MA_META.PURC_BASIS_TYP_NM);
	public static final MCMeta sync_flg_META = createCommonMeta($sync_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta itm_purc_upri_cng_flg_META = createCommonMeta($itm_purc_upri_cng_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta dscnt_itm_flg_META = createCommonMeta($dscnt_itm_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta ver_flg_META = createCommonMeta($ver_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta itm_pay_crryovr_times_META = createCommonMeta($itm_pay_crryovr_times, mcframe.commonMA.meta.MA_META.CRRYOVR_TIMES);
	public static final MCMeta sno1_mng_typ_META = createCommonMeta($sno1_mng_typ, mcframe.commonMA.meta.MA_META.SNO_MNG_TYP);
	public static final MCMeta sno2_mng_typ_META = createCommonMeta($sno2_mng_typ, mcframe.commonMA.meta.MA_META.SNO_MNG_TYP);
	public static final MCMeta sno3_mng_typ_META = createCommonMeta($sno3_mng_typ, mcframe.commonMA.meta.MA_META.SNO_MNG_TYP);
	public static final MCMeta sno4_mng_typ_META = createCommonMeta($sno4_mng_typ, mcframe.commonMA.meta.MA_META.SNO_MNG_TYP);
	public static final MCMeta ver_no_p_META = createInnerRowMeta($ver_no_p, mcframe.clientMAUB.MAUBP5250.VerNoR.class);
	public static final MCMeta bp_lot_no_META = createCommonMeta($bp_lot_no, mcframe.commonMA.meta.MA_META.BP_LOT_NO);
	public static final MCMeta sppl_itm_cd_META = createCommonMeta($sppl_itm_cd, mcframe.commonMA.meta.MA_META.BP_ITM_CD);
	public static final MCMeta sppl_itm_nm_META = createCommonMeta($sppl_itm_nm, mcframe.commonMA.meta.MA_META.BP_ITM_NM);
	public static final MCMeta cst_itm_cd_META = createCommonMeta($cst_itm_cd, mcframe.commonMA.meta.MA_META.BP_ITM_CD);
	public static final MCMeta cst_itm_nm_META = createCommonMeta($cst_itm_nm, mcframe.commonMA.meta.MA_META.BP_ITM_NM);
	public static final MCMeta ap_dpt_cd_META = createCommonMeta($ap_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta ap_dpt_nm_META = createCommonMeta($ap_dpt_nm, mcframe.commonMA.meta.MA_META.DPT_NM);
	public static final MCMeta dlv_p_META = createInnerRowMeta($dlv_p, mcframe.clientMAUB.MAUBP5150.DlvR.class);
	public static final MCMeta dlv_cal_cd_META = createCommonMeta($dlv_cal_cd, mcframe.commonMA.meta.MA_META.CAL_CD);
	public static final MCMeta tdlv_p_META = createInnerRowMeta($tdlv_p, mcframe.clientMAUB.MAUBP5150.DlvR.class);
	public static final MCMeta purc_id_typ_META = createCommonMeta($purc_id_typ, mcframe.commonMA.meta.MA_META.PURC_ID_TYP);
	public static final MCMeta purc_id_typ_nm_META = createCommonMeta($purc_id_typ_nm, mcframe.commonMA.meta.MA_META.PURC_ID_TYP_NM);
	public static final MCMeta po_conf_rcpt_flg_META = createCommonMeta($po_conf_rcpt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta po_conf_rcpt_dt_META = createCommonMeta($po_conf_rcpt_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta trd_unit_cd_META = createCommonMeta($trd_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta trd_unit_nm_META = createCommonMeta($trd_unit_nm, mcframe.commonMA.meta.MA_META.UNIT_NM);
	public static final MCMeta trd_unit_dec_place_META = createCommonMeta($trd_unit_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta trd_unit_rnd_typ_META = createCommonMeta($trd_unit_rnd_typ, mcframe.commonMA.meta.MA_META.RND_TYP);
	public static final MCMeta trd_unit_conv_base_qty_META = createCommonMeta($trd_unit_conv_base_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta trd_unit_conv_qty_META = createCommonMeta($trd_unit_conv_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta trd_unit_qty_p_META = createInnerRowMeta($trd_unit_qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta base_unit_cd_META = createCommonMeta($base_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta base_unit_nm_META = createCommonMeta($base_unit_nm, mcframe.commonMA.meta.MA_META.UNIT_NM);
	public static final MCMeta abort_flg_META = createCommonMeta($abort_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta bef_abort_flg_META = createCommonMeta($bef_abort_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta base_unit_qty_p_META = createInnerRowMeta($base_unit_qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta base_unit_dec_place_META = createCommonMeta($base_unit_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta base_unit_rnd_typ_META = createCommonMeta($base_unit_rnd_typ, mcframe.commonMA.meta.MA_META.RND_TYP);
	public static final MCMeta inst_cont_qty_p_META = createInnerRowMeta($inst_cont_qty_p, mcframe.clientMAUB.MAUBP5260.ContQtyR.class);
	public static final MCMeta cont_fctr_flg_META = createCommonMeta($cont_fctr_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta cont_fctr_dec_place_META = createCommonMeta($cont_fctr_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta cont_fctr_rnd_typ_META = createCommonMeta($cont_fctr_rnd_typ, mcframe.commonMA.meta.MA_META.RND_TYP);
	public static final MCMeta cont_unit_p_META = createInnerRowMeta($cont_unit_p, mcframe.clientMAUB.MAUBP5270.ContFctrUnitR.class);
	public static final MCMeta std_cont_p_META = createInnerRowMeta($std_cont_p, mcframe.clientMAUB.MAUBP5280.StdContFctrR.class);
	public static final MCMeta purc_sts_typ_META = createCommonMeta($purc_sts_typ, mcframe.commonMS.meta.MS_META.PURC_STS_TYP);
	public static final MCMeta purc_sts_typ_nm_META = createCommonMeta($purc_sts_typ_nm, mcframe.commonMS.meta.MS_META.PURC_STS_TYP_NM);
	public static final MCMeta dlv_inst_qty_META = createCommonMeta($dlv_inst_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta dlv_inst_prms_rcpt_qty_META = createCommonMeta($dlv_inst_prms_rcpt_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta rcpt_iv_qty_META = createCommonMeta($rcpt_iv_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta arr_qty_META = createCommonMeta($arr_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta purc_qty_META = createCommonMeta($purc_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta arr_schd_split_flg_META = createCommonMeta($arr_schd_split_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta arr_cmpl_flg_META = createCommonMeta($arr_cmpl_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta purc_cmpl_flg_META = createCommonMeta($purc_cmpl_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta pay_crryovr_times_META = createCommonMeta($pay_crryovr_times, mcframe.commonMA.meta.MA_META.CRRYOVR_TIMES);
	public static final MCMeta purc_upri_req_typ_META = createCommonMeta($purc_upri_req_typ, mcframe.commonMA.meta.MA_META.PURC_UPRI_REQ_TYP);
	public static final MCMeta purc_upri_req_typ_nm_META = createCommonMeta($purc_upri_req_typ_nm, mcframe.commonMA.meta.MA_META.PURC_UPRI_REQ_TYP_NM);
	public static final MCMeta trd_cur_upri_p_META = createInnerRowMeta($trd_cur_upri_p, mcframe.clientMSUB.MSUBP5070.TrdUpriAmtR.class);
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
	public static final MCMeta old_trd_cur_dscnt_amt_META = createCommonMeta($old_trd_cur_dscnt_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta old_dscnt_rsn_cd_META = createCommonMeta($old_dscnt_rsn_cd, mcframe.commonMA.meta.MA_META.BIZ_RSN_CD);
	public static final MCMeta old_dscnt_rsn_nm_META = createCommonMeta($old_dscnt_rsn_nm, mcframe.commonMA.meta.MA_META.BIZ_RSN_NM);
	public static final MCMeta base_cur_upri_p_META = createInnerRowMeta($base_cur_upri_p, mcframe.clientMAUB.MAUBP5060.UpriR.class);
	public static final MCMeta base_cur_dscnt_amt_p_META = createInnerRowMeta($base_cur_dscnt_amt_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta base_cur_amt_p_META = createInnerRowMeta($base_cur_amt_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta base_cur_tax_amt_p_META = createInnerRowMeta($base_cur_tax_amt_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta base_cur_inc_tax_amt_p_META = createInnerRowMeta($base_cur_inc_tax_amt_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta base_cur_proc_upri_p_META = createInnerRowMeta($base_cur_proc_upri_p, mcframe.clientMAUB.MAUBP5060.UpriR.class);
	public static final MCMeta base_cur_proc_amt_p_META = createInnerRowMeta($base_cur_proc_amt_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta base_cur_onr_prov_upri_p_META = createInnerRowMeta($base_cur_onr_prov_upri_p, mcframe.clientMAUB.MAUBP5060.UpriR.class);
	public static final MCMeta base_cur_onr_prov_amt_p_META = createInnerRowMeta($base_cur_onr_prov_amt_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta ptax_cur_upri_p_META = createInnerRowMeta($ptax_cur_upri_p, mcframe.clientMAUB.MAUBP5060.UpriR.class);
	public static final MCMeta ptax_cur_dscnt_amt_p_META = createInnerRowMeta($ptax_cur_dscnt_amt_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta ptax_cur_amt_p_META = createInnerRowMeta($ptax_cur_amt_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta ptax_cur_tax_amt_p_META = createInnerRowMeta($ptax_cur_tax_amt_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta ptax_cur_inc_tax_amt_p_META = createInnerRowMeta($ptax_cur_inc_tax_amt_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta ptax_cur_proc_upri_p_META = createInnerRowMeta($ptax_cur_proc_upri_p, mcframe.clientMAUB.MAUBP5060.UpriR.class);
	public static final MCMeta ptax_cur_proc_amt_p_META = createInnerRowMeta($ptax_cur_proc_amt_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta ptax_cur_onr_prov_upri_p_META = createInnerRowMeta($ptax_cur_onr_prov_upri_p, mcframe.clientMAUB.MAUBP5060.UpriR.class);
	public static final MCMeta ptax_cur_onr_prov_amt_p_META = createInnerRowMeta($ptax_cur_onr_prov_amt_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta wtax_rate_META = createCommonMeta($wtax_rate, mcframe.commonMA.meta.MA_META.WTAX_RATE);
	public static final MCMeta wtax_amt_p_META = createInnerRowMeta($wtax_amt_p, mcframe.clientMAUB.MAUBP5050.AmtR.class);
	public static final MCMeta mfg_loc_cd_META = createCommonMeta($mfg_loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta mfg_loc_nm_META = createCommonMeta($mfg_loc_nm, mcframe.commonMA.meta.MA_META.LOC_NM);
	public static final MCMeta bom_ptn_META = createCommonMeta($bom_ptn, mcframe.commonMA.meta.MA_META.BOM_PTN);
	public static final MCMeta outsrc_flg_META = createCommonMeta($outsrc_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta mfg_inst_flg_META = createCommonMeta($mfg_inst_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta outsrc_itm_ord_no_META = createCommonMeta($outsrc_itm_ord_no, mcframe.commonMA.meta.MA_META.ITM_ORD_NO);
	public static final MCMeta purc_rsn_cd_META = createCommonMeta($purc_rsn_cd, mcframe.commonMA.meta.MA_META.BIZ_RSN_CD);
	public static final MCMeta purc_rsn_nm_META = createCommonMeta($purc_rsn_nm, mcframe.commonMA.meta.MA_META.BIZ_RSN_NM);
	public static final MCMeta xpns_purc_flg_META = createCommonMeta($xpns_purc_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta not_xpns_purc_flg_META = createCommonMeta($not_xpns_purc_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sno_wrk_no_p_META = createInnerRowMeta($sno_wrk_no_p, mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.class);
	public static final MCMeta bditm_p_META = createInnerRowMeta($bditm_p, mcframe.clientMSUB.MSUBP5040.BdItemR.class);
	public static final MCMeta bd_lot_mng_typ_META = createCommonMeta($bd_lot_mng_typ, mcframe.commonMA.meta.MA_META.LOT_MNG_TYP);
	public static final MCMeta bd_sublot_mng_typ_META = createCommonMeta($bd_sublot_mng_typ, mcframe.commonMA.meta.MA_META.LOT_MNG_TYP);
	public static final MCMeta bd_lot_no_typ_META = createCommonMeta($bd_lot_no_typ, mcframe.commonMA.meta.MA_META.LOT_NO_TYP);
	public static final MCMeta bd_sublot_no_typ_META = createCommonMeta($bd_sublot_no_typ, mcframe.commonMA.meta.MA_META.LOT_NO_TYP);
	public static final MCMeta bd_sno1_mng_typ_META = createCommonMeta($bd_sno1_mng_typ, mcframe.commonMA.meta.MA_META.SNO_MNG_TYP);
	public static final MCMeta bd_sno2_mng_typ_META = createCommonMeta($bd_sno2_mng_typ, mcframe.commonMA.meta.MA_META.SNO_MNG_TYP);
	public static final MCMeta bd_sno3_mng_typ_META = createCommonMeta($bd_sno3_mng_typ, mcframe.commonMA.meta.MA_META.SNO_MNG_TYP);
	public static final MCMeta bd_sno4_mng_typ_META = createCommonMeta($bd_sno4_mng_typ, mcframe.commonMA.meta.MA_META.SNO_MNG_TYP);
	public static final MCMeta rqst_can_flg_META = createCommonMeta($rqst_can_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta po_cnt_rmrks_META = createCommonMeta($po_cnt_rmrks, mcframe.commonMS.meta.MS_META.PO_CNT_RMRKS);
	public static final MCMeta intr_rmrks_META = createCommonMeta($intr_rmrks, mcframe.commonMS.meta.MS_META.PO_D_INTR_RMRKS);
	public static final MCMeta trd_d_rmrks_META = createCommonMeta($trd_d_rmrks, mcframe.commonMA.meta.MA_META.TRD_D_RMRKS);
	public static final MCMeta po_print_d_rmrks_META = createCommonMeta($po_print_d_rmrks, mcframe.commonMS.meta.MS_META.PO_PRINT_D_RMRKS);
	public static final MCMeta dlv_slip_d_rmrks_META = createCommonMeta($dlv_slip_d_rmrks, mcframe.commonMA.meta.MA_META.TRD_D_RMRKS);
	public static final MCMeta arr_cnt_rmrks_META = createCommonMeta($arr_cnt_rmrks, mcframe.commonMS.meta.MS_META.ARR_CNT_RMRKS);
	public static final MCMeta sub_char1_META = createCommonMeta($sub_char1, mcframe.commonMS.meta.MS_META.PO_D_SUB_CHAR1);
	public static final MCMeta sub_char2_META = createCommonMeta($sub_char2, mcframe.commonMS.meta.MS_META.PO_D_SUB_CHAR2);
	public static final MCMeta sub_char3_META = createCommonMeta($sub_char3, mcframe.commonMS.meta.MS_META.PO_D_SUB_CHAR3);
	public static final MCMeta edi_sub_d_char1_META = createCommonMeta($edi_sub_d_char1, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR1);
	public static final MCMeta edi_sub_d_char2_META = createCommonMeta($edi_sub_d_char2, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR2);
	public static final MCMeta edi_sub_d_char3_META = createCommonMeta($edi_sub_d_char3, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR3);
	public static final MCMeta edi_sub_d_char4_META = createCommonMeta($edi_sub_d_char4, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR4);
	public static final MCMeta edi_sub_d_char5_META = createCommonMeta($edi_sub_d_char5, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR5);
	public static final MCMeta edi_sub_d_num1_META = createCommonMeta($edi_sub_d_num1, mcframe.commonMA.meta.MA_META.IF_SUB_NUM1);
	public static final MCMeta edi_sub_d_dt1_META = createCommonMeta($edi_sub_d_dt1, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta ext_po_d_no_META = createCommonMeta($ext_po_d_no, mcframe.commonMA.meta.MA_META.EXT_PO_D_NO);
	public static final MCMeta slo_no_META = createCommonMeta($slo_no, mcframe.commonMA.meta.MA_META.SLO_NO);
	public static final MCMeta slo_d_no_META = createCommonMeta($slo_d_no, mcframe.commonMA.meta.MA_META.SLO_D_NO);
	public static final MCMeta dlv_slip_no_META = createCommonMeta($dlv_slip_no, mcframe.commonMA.meta.MA_META.DLV_SLIP_NO);
	public static final MCMeta dlv_slip_seq_META = createCommonMeta($dlv_slip_seq, mcframe.commonMA.meta.MA_META.SLIP_SEQ);
	public static final MCMeta dlv_slip_invalid_flg_META = createCommonMeta($dlv_slip_invalid_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta purc_ddlv_dlv_slip_no_META = createCommonMeta($purc_ddlv_dlv_slip_no, mcframe.commonMA.meta.MA_META.DLV_SLIP_NO);
	public static final MCMeta dlv_slip_mng_no_META = createCommonMeta($dlv_slip_mng_no, mcframe.commonMS.meta.MS_META.DLV_SLIP_MNG_NO);
	public static final MCMeta dlv_slip_mng_seq_META = createCommonMeta($dlv_slip_mng_seq, mcframe.commonMA.meta.MA_META.SLIP_SEQ);
	public static final MCMeta po_schd_src_typ_META = createCommonMeta($po_schd_src_typ, mcframe.commonMS.meta.MS_META.PO_SCHD_SRC_TYP);
	public static final MCMeta po_schd_src_typ_nm_META = createCommonMeta($po_schd_src_typ_nm, mcframe.commonMS.meta.MS_META.PO_SCHD_SRC_TYP_NM);
	public static final MCMeta po_schd_src_no_META = createCommonMeta($po_schd_src_no, mcframe.commonMA.meta.MA_META.PO_SCHD_SRC_NO);
	public static final MCMeta rqst_fr_usr_cd_META = createCommonMeta($rqst_fr_usr_cd, mcframe.commonMA.meta.MA_META.USR_CD);
	public static final MCMeta rqst_fr_usr_nm_META = createCommonMeta($rqst_fr_usr_nm, mcframe.commonMA.meta.MA_META.USR_NM);
	public static final MCMeta rqst_fr_dpt_cd_META = createCommonMeta($rqst_fr_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta rqst_fr_dpt_nm_META = createCommonMeta($rqst_fr_dpt_nm, mcframe.commonMA.meta.MA_META.DPT_NM);
	public static final MCMeta bndl_flg_META = createCommonMeta($bndl_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta rqst_slo_flg_META = createCommonMeta($rqst_slo_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta po_schd_no_META = createCommonMeta($po_schd_no, mcframe.commonMA.meta.MA_META.PO_SCHD_NO);
	public static final MCMeta po_d_no_META = createCommonMeta($po_d_no, mcframe.commonMA.meta.MA_META.PO_D_NO);
	public static final MCMeta disp_seq_META = createCommonMeta($disp_seq, mcframe.commonMA.meta.MA_META.DISP_SEQ);
	public static final MCMeta arr_flg_META = createCommonMeta($arr_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta purc_flg_META = createCommonMeta($purc_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta rcpt_iv_flg_META = createCommonMeta($rcpt_iv_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta base_dt_META = createCommonMeta($base_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta po_dt_META = createCommonMeta($po_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta po_schd_flg_META = createCommonMeta($po_schd_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta mfg_loc_wg_cd_META = createCommonMeta($mfg_loc_wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta arr_rem_abort_flg_META = createCommonMeta($arr_rem_abort_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta purc_rem_abort_flg_META = createCommonMeta($purc_rem_abort_flg, mcframe.commonMA.meta.MA_META.FLG);

	protected static final ConstMetaList<DtlR> constMetas = new ConstMetaList<DtlR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			dtl_peg_no_META,
			check_META,
			in_to_loc_cd_META,
			in_to_loc_nm_META,
			in_to_loc_p_META,
			in_to_loc_wg_cd_META,
			in_to_loc_wg_nm_META,
			pri_prnt_flg_META,
			drct_dlv_typ_META,
			drct_dlv_typ_nm_META,
			outsrc_sppl_cd_META,
			str_ln_tgt_flg_META,
			loc_mng_typ_META,
			in_to_loc_cal_cd_META,
			site_cd_META,
			lg_grp_cd_META,
			loc_grp_cd_META,
			bef_in_to_loc_wg_cd_META,
			bef_lg_grp_cd_META,
			bef_loc_grp_cd_META,
			dlv_rqst_tm_p_META,
			itm_p_META,
			iv_itm_nm_META,
			sundry_itm_flg_META,
			asset_mng_typ_META,
			asset_mng_typ_nm_META,
			str_ln_p_META,
			stk_mng_typ_META,
			arr_skip_flg_META,
			purc_dlv_slip_flg_META,
			maker_cd_META,
			maker_nm_META,
			rqst_avl_rqst_dt_META,
			rqst_dlv_rqst_tm_p_META,
			purc_schd_dt_META,
			purc_basis_typ_META,
			purc_basis_typ_nm_META,
			sync_flg_META,
			itm_purc_upri_cng_flg_META,
			dscnt_itm_flg_META,
			ver_flg_META,
			itm_pay_crryovr_times_META,
			sno1_mng_typ_META,
			sno2_mng_typ_META,
			sno3_mng_typ_META,
			sno4_mng_typ_META,
			ver_no_p_META,
			bp_lot_no_META,
			sppl_itm_cd_META,
			sppl_itm_nm_META,
			cst_itm_cd_META,
			cst_itm_nm_META,
			ap_dpt_cd_META,
			ap_dpt_nm_META,
			dlv_p_META,
			dlv_cal_cd_META,
			tdlv_p_META,
			purc_id_typ_META,
			purc_id_typ_nm_META,
			po_conf_rcpt_flg_META,
			po_conf_rcpt_dt_META,
			trd_unit_cd_META,
			trd_unit_nm_META,
			trd_unit_dec_place_META,
			trd_unit_rnd_typ_META,
			trd_unit_conv_base_qty_META,
			trd_unit_conv_qty_META,
			trd_unit_qty_p_META,
			base_unit_cd_META,
			base_unit_nm_META,
			abort_flg_META,
			bef_abort_flg_META,
			base_unit_qty_p_META,
			base_unit_dec_place_META,
			base_unit_rnd_typ_META,
			inst_cont_qty_p_META,
			cont_fctr_flg_META,
			cont_fctr_dec_place_META,
			cont_fctr_rnd_typ_META,
			cont_unit_p_META,
			std_cont_p_META,
			purc_sts_typ_META,
			purc_sts_typ_nm_META,
			dlv_inst_qty_META,
			dlv_inst_prms_rcpt_qty_META,
			rcpt_iv_qty_META,
			arr_qty_META,
			purc_qty_META,
			arr_schd_split_flg_META,
			arr_cmpl_flg_META,
			purc_cmpl_flg_META,
			pay_crryovr_times_META,
			purc_upri_req_typ_META,
			purc_upri_req_typ_nm_META,
			trd_cur_upri_p_META,
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
			old_trd_cur_dscnt_amt_META,
			old_dscnt_rsn_cd_META,
			old_dscnt_rsn_nm_META,
			base_cur_upri_p_META,
			base_cur_dscnt_amt_p_META,
			base_cur_amt_p_META,
			base_cur_tax_amt_p_META,
			base_cur_inc_tax_amt_p_META,
			base_cur_proc_upri_p_META,
			base_cur_proc_amt_p_META,
			base_cur_onr_prov_upri_p_META,
			base_cur_onr_prov_amt_p_META,
			ptax_cur_upri_p_META,
			ptax_cur_dscnt_amt_p_META,
			ptax_cur_amt_p_META,
			ptax_cur_tax_amt_p_META,
			ptax_cur_inc_tax_amt_p_META,
			ptax_cur_proc_upri_p_META,
			ptax_cur_proc_amt_p_META,
			ptax_cur_onr_prov_upri_p_META,
			ptax_cur_onr_prov_amt_p_META,
			wtax_rate_META,
			wtax_amt_p_META,
			mfg_loc_cd_META,
			mfg_loc_nm_META,
			bom_ptn_META,
			outsrc_flg_META,
			mfg_inst_flg_META,
			outsrc_itm_ord_no_META,
			purc_rsn_cd_META,
			purc_rsn_nm_META,
			xpns_purc_flg_META,
			not_xpns_purc_flg_META,
			sno_wrk_no_p_META,
			bditm_p_META,
			bd_lot_mng_typ_META,
			bd_sublot_mng_typ_META,
			bd_lot_no_typ_META,
			bd_sublot_no_typ_META,
			bd_sno1_mng_typ_META,
			bd_sno2_mng_typ_META,
			bd_sno3_mng_typ_META,
			bd_sno4_mng_typ_META,
			rqst_can_flg_META,
			po_cnt_rmrks_META,
			intr_rmrks_META,
			trd_d_rmrks_META,
			po_print_d_rmrks_META,
			dlv_slip_d_rmrks_META,
			arr_cnt_rmrks_META,
			sub_char1_META,
			sub_char2_META,
			sub_char3_META,
			edi_sub_d_char1_META,
			edi_sub_d_char2_META,
			edi_sub_d_char3_META,
			edi_sub_d_char4_META,
			edi_sub_d_char5_META,
			edi_sub_d_num1_META,
			edi_sub_d_dt1_META,
			ext_po_d_no_META,
			slo_no_META,
			slo_d_no_META,
			dlv_slip_no_META,
			dlv_slip_seq_META,
			dlv_slip_invalid_flg_META,
			purc_ddlv_dlv_slip_no_META,
			dlv_slip_mng_no_META,
			dlv_slip_mng_seq_META,
			po_schd_src_typ_META,
			po_schd_src_typ_nm_META,
			po_schd_src_no_META,
			rqst_fr_usr_cd_META,
			rqst_fr_usr_nm_META,
			rqst_fr_dpt_cd_META,
			rqst_fr_dpt_nm_META,
			bndl_flg_META,
			rqst_slo_flg_META,
			po_schd_no_META,
			po_d_no_META,
			disp_seq_META,
			arr_flg_META,
			purc_flg_META,
			rcpt_iv_flg_META,
			base_dt_META,
			po_dt_META,
			po_schd_flg_META,
			mfg_loc_wg_cd_META,
			arr_rem_abort_flg_META,
			purc_rem_abort_flg_META
		},
		new String[][]{
			{
				"in_to_loc_zip_cd",
				"in_to_loc_addr1",
				"in_to_loc_addr2",
				"in_to_loc_addr3",
				"in_to_loc_addr4",
				"in_to_loc_tel",
				"in_to_loc_fax",
				"dlv_rqst_dt",
				"dlv_rqst_hm",
				"itm_cd",
				"itm_sub1",
				"itm_sub2",
				"itm_sub3",
				"itm_nm",
				"str_ln_cd",
				"str_ln_nm",
				"str_ln_cd_none_flg",
				"rqst_dlv_rqst_dt",
				"rqst_dlv_rqst_hm",
				"ver_no",
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
				"dlv_cntct_dpt",
				"dlv_cntct_psn",
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
				"trd_unit_qty",
				"base_unit_qty",
				"cont_qty",
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
				"base_cur_upri",
				"base_cur_dscnt_amt",
				"base_cur_amt",
				"base_cur_tax_amt",
				"base_cur_inc_tax_amt",
				"base_cur_proc_upri",
				"base_cur_proc_amt",
				"base_cur_onr_prov_upri",
				"base_cur_onr_prov_amt",
				"ptax_cur_upri",
				"ptax_cur_dscnt_amt",
				"ptax_cur_amt",
				"ptax_cur_tax_amt",
				"ptax_cur_inc_tax_amt",
				"ptax_cur_proc_upri",
				"ptax_cur_proc_amt",
				"ptax_cur_onr_prov_upri",
				"ptax_cur_onr_prov_amt",
				"wtax_amt",
				"sno1",
				"sno2",
				"sno3",
				"sno4",
				"wrk_no",
				"wrk_nm",
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
				"bd_po_no"
			},
			{
				$in_to_loc_zip_cd,
				$in_to_loc_addr1,
				$in_to_loc_addr2,
				$in_to_loc_addr3,
				$in_to_loc_addr4,
				$in_to_loc_tel,
				$in_to_loc_fax,
				$dlv_rqst_dt,
				$dlv_rqst_hm,
				$itm_cd,
				$itm_sub1,
				$itm_sub2,
				$itm_sub3,
				$itm_nm,
				$str_ln_cd,
				$str_ln_nm,
				$str_ln_cd_none_flg,
				$rqst_dlv_rqst_dt,
				$rqst_dlv_rqst_hm,
				$ver_no,
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
				$dlv_cntct_dpt,
				$dlv_cntct_psn,
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
				$trd_unit_qty,
				$base_unit_qty,
				$cont_qty,
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
				$base_cur_upri,
				$base_cur_dscnt_amt,
				$base_cur_amt,
				$base_cur_tax_amt,
				$base_cur_inc_tax_amt,
				$base_cur_proc_upri,
				$base_cur_proc_amt,
				$base_cur_onr_prov_upri,
				$base_cur_onr_prov_amt,
				$ptax_cur_upri,
				$ptax_cur_dscnt_amt,
				$ptax_cur_amt,
				$ptax_cur_tax_amt,
				$ptax_cur_inc_tax_amt,
				$ptax_cur_proc_upri,
				$ptax_cur_proc_amt,
				$ptax_cur_onr_prov_upri,
				$ptax_cur_onr_prov_amt,
				$wtax_amt,
				$sno1,
				$sno2,
				$sno3,
				$sno4,
				$wrk_no,
				$wrk_nm,
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
				$bd_po_no
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
				{$in_to_loc_cd, "loc_nm;str_ln_tgt_flg;sppl_cd;wg_cd;wg_nm;loc_mng_typ;zip_cd;addr1;addr2;addr3;addr4;tel;fax;cal_cd;site_cd;lg_grp_cd;loc_grp_cd;str_ln_cd;str_ln_cd_none_flg"},	// in_to_loc_cd
				{$drct_dlv_typ, "drct_dlv_typ_nm"},	// drct_dlv_typ
				{$itm_p + ".itm_cd", "itm_sub1;itm_sub2;itm_sub3;itm_nm;sundry_itm_flg;dscnt_itm_flg;asset_mng_typ;stk_mng_typ;ver_flg;purc_unit_cd;unit_cd;unit_nm;dec_place;rnd_typ;cont_fctr_flg;std_cont_fctr;cont_fctr_unit_cd;cont_fctr_unit_nm;cont_fctr_dec_place;cont_fctr_rnd_typ;purc_upri_cng_flg;purc_tax_cd;wtax_rate;pay_crryovr_times;sno1_mng_typ;sno2_mng_typ;sno3_mng_typ;sno4_mng_typ;arr_skip_flg;maker_nm;purc_id_typ;maker_cd;wg_cd;mfg_loc_nm;bom_ptn;mfg_loc_cd;purc_basis_typ;purc_dlv_slip_flg"},	// itm_p.itm_cd
				{$itm_p + ".itm_sub1", "itm_sub2;itm_sub3;itm_nm;sundry_itm_flg;dscnt_itm_flg;asset_mng_typ;stk_mng_typ;ver_flg;purc_unit_cd;unit_cd;unit_nm;dec_place;rnd_typ;cont_fctr_flg;std_cont_fctr;cont_fctr_unit_cd;cont_fctr_unit_nm;cont_fctr_dec_place;cont_fctr_rnd_typ;purc_upri_cng_flg;purc_tax_cd;wtax_rate;pay_crryovr_times;sno1_mng_typ;sno2_mng_typ;sno3_mng_typ;sno4_mng_typ;arr_skip_flg;maker_nm;purc_id_typ;maker_cd;wg_cd;mfg_loc_nm;bom_ptn;mfg_loc_cd;purc_basis_typ;purc_dlv_slip_flg"},	// itm_p.itm_sub1
				{$itm_p + ".itm_sub2", "itm_sub3;itm_nm;sundry_itm_flg;dscnt_itm_flg;asset_mng_typ;stk_mng_typ;ver_flg;purc_unit_cd;unit_cd;unit_nm;dec_place;rnd_typ;cont_fctr_flg;std_cont_fctr;cont_fctr_unit_cd;cont_fctr_unit_nm;cont_fctr_dec_place;cont_fctr_rnd_typ;purc_upri_cng_flg;purc_tax_cd;wtax_rate;pay_crryovr_times;sno1_mng_typ;sno2_mng_typ;sno3_mng_typ;sno4_mng_typ;arr_skip_flg;maker_nm;purc_id_typ;maker_cd;wg_cd;mfg_loc_nm;bom_ptn;mfg_loc_cd;purc_basis_typ;purc_dlv_slip_flg"},	// itm_p.itm_sub2
				{$itm_p + ".itm_sub3", "itm_nm;sundry_itm_flg;dscnt_itm_flg;asset_mng_typ;stk_mng_typ;ver_flg;purc_unit_cd;unit_cd;unit_nm;dec_place;rnd_typ;cont_fctr_flg;std_cont_fctr;cont_fctr_unit_cd;cont_fctr_unit_nm;cont_fctr_dec_place;cont_fctr_rnd_typ;purc_upri_cng_flg;purc_tax_cd;wtax_rate;pay_crryovr_times;sno1_mng_typ;sno2_mng_typ;sno3_mng_typ;sno4_mng_typ;arr_skip_flg;maker_nm;purc_id_typ;maker_cd;wg_cd;mfg_loc_nm;bom_ptn;mfg_loc_cd;purc_basis_typ;purc_dlv_slip_flg"},	// itm_p.itm_sub3
				{$asset_mng_typ, "asset_mng_typ_nm"},	// asset_mng_typ
				{$str_ln_p + ".str_ln_cd", "str_ln_nm"},	// str_ln_p.str_ln_cd
				{$maker_cd, "bp_nm;purc_id_typ;purc_basis_typ"},	// maker_cd
				{$purc_basis_typ, "purc_basis_typ_nm"},	// purc_basis_typ
				{$ap_dpt_cd, "dpt_nm"},	// ap_dpt_cd
				{$purc_id_typ, "purc_id_typ_nm"},	// purc_id_typ
				{$trd_unit_cd, "unit_nm;dec_place;rnd_typ;conv_base_qty;conv_qty"},	// trd_unit_cd
				{$purc_sts_typ, "purc_sts_typ_nm"},	// purc_sts_typ
				{$purc_upri_req_typ, "purc_upri_req_typ_nm"},	// purc_upri_req_typ
				{$trd_cur_upri_p + ".tax_cd", "tax_nm;tax_typ;tax_rate;inc_tax_flg"},	// trd_cur_upri_p.tax_cd
				{$trd_cur_upri_p + ".dscnt_rsn_cd", "biz_rsn_nm"},	// trd_cur_upri_p.dscnt_rsn_cd
				{$purc_rsn_cd, "biz_rsn_nm;xpns_purc_flg"},	// purc_rsn_cd
				{$bditm_p + ".bd_dpt_cd", "dpt_nm"},	// bditm_p.bd_dpt_cd
				{$bditm_p + ".bd_itm_cd", "itm_sub1;itm_sub2;itm_sub3;itm_nm;lot_mng_typ;lot_no_typ;sublot_mng_typ;sublot_no_typ;sno1_mng_typ;sno2_mng_typ;sno3_mng_typ;sno4_mng_typ"},	// bditm_p.bd_itm_cd
				{$bditm_p + ".bd_itm_sub1", "itm_sub2;itm_sub3;itm_nm;lot_mng_typ;lot_no_typ;sublot_mng_typ;sublot_no_typ;sno1_mng_typ;sno2_mng_typ;sno3_mng_typ;sno4_mng_typ"},	// bditm_p.bd_itm_sub1
				{$bditm_p + ".bd_itm_sub2", "itm_sub3;itm_nm;lot_mng_typ;lot_no_typ;sublot_mng_typ;sublot_no_typ;sno1_mng_typ;sno2_mng_typ;sno3_mng_typ;sno4_mng_typ"},	// bditm_p.bd_itm_sub2
				{$bditm_p + ".bd_itm_sub3", "itm_nm;lot_mng_typ;lot_no_typ;sublot_mng_typ;sublot_no_typ;sno1_mng_typ;sno2_mng_typ;sno3_mng_typ;sno4_mng_typ"},	// bditm_p.bd_itm_sub3
				{$po_schd_src_typ, "po_schd_src_typ_nm"}	// po_schd_src_typ
			}
		)),
		new MCExtMap.Entry($$LIST_IN, new MCExtList(
			new String[][]{
				{$in_to_loc_cd, "MAC_LOC_IS_SRCH_TYP.COMM;itm_cd;itm_sub1;itm_sub2;itm_sub3"},	// in_to_loc_cd
				{$itm_p + ".itm_cd", "rqst_avl_rqst_dt;true;in_to_loc_wg_cd;true;true;true;true"},	// itm_p.itm_cd
				{$itm_p + ".itm_sub1", "rqst_avl_rqst_dt;true;in_to_loc_wg_cd;itm_cd;true;true;true;true"},	// itm_p.itm_sub1
				{$itm_p + ".itm_sub2", "rqst_avl_rqst_dt;true;in_to_loc_wg_cd;itm_cd;itm_sub1;true;true;true;true"},	// itm_p.itm_sub2
				{$itm_p + ".itm_sub3", "rqst_avl_rqst_dt;true;in_to_loc_wg_cd;itm_cd;itm_sub1;itm_sub2;true;true;true;true"},	// itm_p.itm_sub3
				{$str_ln_p + ".str_ln_cd", "in_to_loc_cd"},	// str_ln_p.str_ln_cd
				{$maker_cd, "rqst_avl_rqst_dt;itm_cd;itm_sub1;itm_sub2;itm_sub3;asset_mng_typ;in_to_loc_wg_cd;true;true;true;true;true"},	// maker_cd
				{$ver_no_p + ".ver_no", "itm_cd;itm_sub1;itm_sub2;itm_sub3;site_cd"},	// ver_no_p.ver_no
				{$ap_dpt_cd, "MAC_DPT_IS_SRCH_TYP.AP"},	// ap_dpt_cd
				{$trd_unit_cd, "itm_cd;itm_sub1;itm_sub2;itm_sub3"},	// trd_unit_cd
				{$trd_cur_upri_p + ".dscnt_rsn_cd", "loc_mng_typ"},	// trd_cur_upri_p.dscnt_rsn_cd
				{$mfg_loc_cd, "true;itm_cd;itm_sub1;itm_sub2;itm_sub3;true;true;true"},	// mfg_loc_cd
				{$bom_ptn, "itm_cd;itm_sub1;itm_sub2;itm_sub3;mfg_loc_wg_cd;mfg_loc_cd;true"},	// bom_ptn
				{$purc_rsn_cd, "xpns_purc_flg;not_xpns_purc_flg"},	// purc_rsn_cd
				{$bditm_p + ".bd_dpt_cd", "MAC_DPT_IS_SRCH_TYP.BD"},	// bditm_p.bd_dpt_cd
				{$bditm_p + ".bd_itm_cd", "MAC_ITM_IS_SRCH_TYP.ASSET1"},	// bditm_p.bd_itm_cd
				{$bditm_p + ".bd_itm_sub1", "MAC_ITM_IS_SRCH_TYP.ASSET1;bd_itm_cd"},	// bditm_p.bd_itm_sub1
				{$bditm_p + ".bd_itm_sub2", "MAC_ITM_IS_SRCH_TYP.ASSET1;bd_itm_cd;bd_itm_sub1"},	// bditm_p.bd_itm_sub2
				{$bditm_p + ".bd_itm_sub3", "MAC_ITM_IS_SRCH_TYP.ASSET1;bd_itm_cd;bd_itm_sub1;bd_itm_sub2"}	// bditm_p.bd_itm_sub3
			}
		)),
		new MCExtMap.Entry($$LIST_IN_BASE, new MCExtList(
			new String[][]{
				{$in_to_loc_cd, "loc_is_srch_typ;itm_cd;itm_sub1;itm_sub2;itm_sub3"},	// in_to_loc_cd
				{$itm_p + ".itm_cd", "dt;purc_flg;wg_cd;outsrc_flg;manual_sppl_flg;inc_outsrc_flg;get_maker_flg"},	// itm_p.itm_cd
				{$itm_p + ".itm_sub1", "dt;purc_flg;wg_cd;itm_cd;outsrc_flg;manual_sppl_flg;inc_outsrc_flg;get_maker_flg"},	// itm_p.itm_sub1
				{$itm_p + ".itm_sub2", "dt;purc_flg;wg_cd;itm_cd;itm_sub1;outsrc_flg;manual_sppl_flg;inc_outsrc_flg;get_maker_flg"},	// itm_p.itm_sub2
				{$itm_p + ".itm_sub3", "dt;purc_flg;wg_cd;itm_cd;itm_sub1;itm_sub2;outsrc_flg;manual_sppl_flg;inc_outsrc_flg;get_maker_flg"},	// itm_p.itm_sub3
				{$str_ln_p + ".str_ln_cd", "loc_cd"},	// str_ln_p.str_ln_cd
				{$maker_cd, "master_dt;itm_cd;itm_sub1;itm_sub2;itm_sub3;asset_mng_typ;wg_cd;mode_nullval_flg;maker_flg;manual_sppl_flg;inc_outsrc_flg;purc_basis_typ_flg"},	// maker_cd
				{$ver_no_p + ".ver_no", "itm_cd;itm_sub1;itm_sub2;itm_sub3;site_cd"},	// ver_no_p.ver_no
				{$ap_dpt_cd, "dpt_is_srch_typ"},	// ap_dpt_cd
				{$trd_unit_cd, "itm_cd;itm_sub1;itm_sub2;itm_sub3"},	// trd_unit_cd
				{$trd_cur_upri_p + ".dscnt_rsn_cd", "purc_dscnt_loc_mng_typ"},	// trd_cur_upri_p.dscnt_rsn_cd
				{$mfg_loc_cd, "outsrc_flg;itm_cd;itm_sub1;itm_sub2;itm_sub3;wr_flg;mode_nullval_flg;purc_basis_typ_flg"},	// mfg_loc_cd
				{$bom_ptn, "itm_cd;itm_sub1;itm_sub2;itm_sub3;wg_cd;mfg_loc_cd;purc_basis_typ_flg"},	// bom_ptn
				{$purc_rsn_cd, "xpns_purc_flg;not_xpns_purc_flg"},	// purc_rsn_cd
				{$bditm_p + ".bd_dpt_cd", "dpt_is_srch_typ"},	// bditm_p.bd_dpt_cd
				{$bditm_p + ".bd_itm_cd", "itm_is_srch_typ"},	// bditm_p.bd_itm_cd
				{$bditm_p + ".bd_itm_sub1", "itm_is_srch_typ;itm_cd"},	// bditm_p.bd_itm_sub1
				{$bditm_p + ".bd_itm_sub2", "itm_is_srch_typ;itm_cd;itm_sub1"},	// bditm_p.bd_itm_sub2
				{$bditm_p + ".bd_itm_sub3", "itm_is_srch_typ;itm_cd;itm_sub1;itm_sub2"}	// bditm_p.bd_itm_sub3
			}
		)),
		new MCExtMap.Entry($$DISP_CTL, new MCExtList(
			new String[][]{
				{$in_to_loc_wg_cd, "WG"},	// in_to_loc_wg_cd
				{$in_to_loc_wg_nm, "WG"},	// in_to_loc_wg_nm
				{$str_ln_tgt_flg, "STR_LN"},	// str_ln_tgt_flg
				{$site_cd, "SITE"},	// site_cd
				{$lg_grp_cd, "LG_GRP"},	// lg_grp_cd
				{$loc_grp_cd, "LOC_GRP"},	// loc_grp_cd
				{$bef_in_to_loc_wg_cd, "WG"},	// bef_in_to_loc_wg_cd
				{$bef_lg_grp_cd, "LG_GRP"},	// bef_lg_grp_cd
				{$bef_loc_grp_cd, "LOC_GRP"},	// bef_loc_grp_cd
				{$maker_cd, "MAKER"},	// maker_cd
				{$maker_nm, "MAKER"},	// maker_nm
				{$base_unit_cd, "BASE_UNIT"},	// base_unit_cd
				{$base_unit_nm, "BASE_UNIT"},	// base_unit_nm
				{$base_unit_qty_p + ".qty", "BASE_UNIT"},	// base_unit_qty_p.qty
				{$base_unit_dec_place, "BASE_UNIT"},	// base_unit_dec_place
				{$base_unit_rnd_typ, "BASE_UNIT"},	// base_unit_rnd_typ
				{$base_cur_upri_p + ".upri", "BASE_CUR"},	// base_cur_upri_p.upri
				{$base_cur_dscnt_amt_p + ".amt", "BASE_CUR"},	// base_cur_dscnt_amt_p.amt
				{$base_cur_amt_p + ".amt", "BASE_CUR"},	// base_cur_amt_p.amt
				{$base_cur_tax_amt_p + ".amt", "BASE_CUR"},	// base_cur_tax_amt_p.amt
				{$base_cur_inc_tax_amt_p + ".amt", "BASE_CUR"},	// base_cur_inc_tax_amt_p.amt
				{$base_cur_proc_upri_p + ".upri", "BASE_CUR"},	// base_cur_proc_upri_p.upri
				{$base_cur_proc_amt_p + ".amt", "BASE_CUR"},	// base_cur_proc_amt_p.amt
				{$base_cur_onr_prov_upri_p + ".upri", "BASE_CUR"},	// base_cur_onr_prov_upri_p.upri
				{$base_cur_onr_prov_amt_p + ".amt", "BASE_CUR"},	// base_cur_onr_prov_amt_p.amt
				{$ptax_cur_upri_p + ".upri", "PTAX"},	// ptax_cur_upri_p.upri
				{$ptax_cur_dscnt_amt_p + ".amt", "PTAX"},	// ptax_cur_dscnt_amt_p.amt
				{$ptax_cur_amt_p + ".amt", "PTAX"},	// ptax_cur_amt_p.amt
				{$ptax_cur_tax_amt_p + ".amt", "PTAX"},	// ptax_cur_tax_amt_p.amt
				{$ptax_cur_inc_tax_amt_p + ".amt", "PTAX"},	// ptax_cur_inc_tax_amt_p.amt
				{$ptax_cur_proc_upri_p + ".upri", "PTAX"},	// ptax_cur_proc_upri_p.upri
				{$ptax_cur_proc_amt_p + ".amt", "PTAX"},	// ptax_cur_proc_amt_p.amt
				{$ptax_cur_onr_prov_upri_p + ".upri", "PTAX"},	// ptax_cur_onr_prov_upri_p.upri
				{$ptax_cur_onr_prov_amt_p + ".amt", "PTAX"},	// ptax_cur_onr_prov_amt_p.amt
				{$wtax_rate, "WTAX"},	// wtax_rate
				{$wtax_amt_p + ".amt", "WTAX"},	// wtax_amt_p.amt
				{$mfg_loc_wg_cd, "WG"}	// mfg_loc_wg_cd
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
	 * Details pegged No. 明細紐付ＮＯ.<p>
	 *
	 */
	public MCNumber dtl_peg_no() {
		return getConstNumber(offset + 0, $dtl_peg_no);
	}

	/**
	 * Details pegged No. 明細紐付ＮＯ.<p>
	 *
	 */
	public void dtl_peg_no(MCNumber value) {
		setConstNumber(offset + 0, $dtl_peg_no, value);
	}

	/**
	 * Details pegged No. 明細紐付ＮＯ.<p>
	 *
	 */
	public void dtl_peg_no(int value) {
		setConstNumber(offset + 0, $dtl_peg_no, value);
	}

	/**
	 * Details pegged No. 明細紐付ＮＯ.<p>
	 *
	 */
	public void dtl_peg_no(long value) {
		setConstNumber(offset + 0, $dtl_peg_no, value);
	}

	/**
	 * Details pegged No. 明細紐付ＮＯ.<p>
	 *
	 */
	public void dtl_peg_no(float value) {
		setConstNumber(offset + 0, $dtl_peg_no, value);
	}

	/**
	 * Details pegged No. 明細紐付ＮＯ.<p>
	 *
	 */
	public void dtl_peg_no(double value) {
		setConstNumber(offset + 0, $dtl_peg_no, value);
	}


	/**
	 * Select 選択.<p>
	 *
	 */
	public boolean check() {
		return getConstBoolean(offset + 1, $check);
	}

	/**
	 * Select 選択.<p>
	 *
	 */
	public void check(boolean value) {
		setConstBoolean(offset + 1, $check, value);
	}


	/**
	 * Delivery location cd. 納入場所ＣＤ.<p>
	 *
	 */
	public String in_to_loc_cd() {
		return getConstString(offset + 2, $in_to_loc_cd);
	}

	/**
	 * Delivery location cd. 納入場所ＣＤ.<p>
	 *
	 */
	public void in_to_loc_cd(String value) {
		setConstString(offset + 2, $in_to_loc_cd, value);
	}


	/**
	 * Delivery location name 納入場所名.<p>
	 *
	 */
	public String in_to_loc_nm() {
		return getConstString(offset + 3, $in_to_loc_nm);
	}

	/**
	 * Delivery location name 納入場所名.<p>
	 *
	 */
	public void in_to_loc_nm(String value) {
		setConstString(offset + 3, $in_to_loc_nm, value);
	}


	public mcframe.clientMAUB.MAUBP5360.AddrR in_to_loc_p(){
		return (mcframe.clientMAUB.MAUBP5360.AddrR) getConstInnerRow(offset + 4, $in_to_loc_p);
	}
	
	public void in_to_loc_p(mcframe.clientMAUB.MAUBP5360.AddrR row){
		setConstInnerRow(offset + 4, $in_to_loc_p, row);
	}


	/**
	 * Delivery location WG cd. 納入場所ワーキンググループＣＤ.<p>
	 *
	 */
	public String in_to_loc_wg_cd() {
		return getConstString(offset + 5, $in_to_loc_wg_cd);
	}

	/**
	 * Delivery location WG cd. 納入場所ワーキンググループＣＤ.<p>
	 *
	 */
	public void in_to_loc_wg_cd(String value) {
		setConstString(offset + 5, $in_to_loc_wg_cd, value);
	}


	/**
	 * Delivery location WG name 納入場所ワーキンググループ名.<p>
	 *
	 */
	public String in_to_loc_wg_nm() {
		return getConstString(offset + 6, $in_to_loc_wg_nm);
	}

	/**
	 * Delivery location WG name 納入場所ワーキンググループ名.<p>
	 *
	 */
	public void in_to_loc_wg_nm(String value) {
		setConstString(offset + 6, $in_to_loc_wg_nm, value);
	}


	/**
	 * Print price 価格印字.<p>
	 *
	 */
	public boolean pri_prnt_flg() {
		return getConstBoolean(offset + 7, $pri_prnt_flg);
	}

	/**
	 * Print price 価格印字.<p>
	 *
	 */
	public void pri_prnt_flg(boolean value) {
		setConstBoolean(offset + 7, $pri_prnt_flg, value);
	}


	/**
	 * Direct-delivery type 直納区分.<p>
	 *
	 */
	public String drct_dlv_typ() {
		return getConstString(offset + 8, $drct_dlv_typ);
	}

	/**
	 * Direct-delivery type 直納区分.<p>
	 *
	 */
	public void drct_dlv_typ(String value) {
		setConstString(offset + 8, $drct_dlv_typ, value);
	}


	/**
	 * Direct-delivery type name 直納区分名.<p>
	 *
	 */
	public String drct_dlv_typ_nm() {
		return getConstString(offset + 9, $drct_dlv_typ_nm);
	}

	/**
	 * Direct-delivery type name 直納区分名.<p>
	 *
	 */
	public void drct_dlv_typ_nm(String value) {
		setConstString(offset + 9, $drct_dlv_typ_nm, value);
	}


	/**
	 * Subcontractor cd. 外注発注先ＣＤ.<p>
	 *
	 */
	public String outsrc_sppl_cd() {
		return getConstString(offset + 10, $outsrc_sppl_cd);
	}

	/**
	 * Subcontractor cd. 外注発注先ＣＤ.<p>
	 *
	 */
	public void outsrc_sppl_cd(String value) {
		setConstString(offset + 10, $outsrc_sppl_cd, value);
	}


	/**
	 * For rack/line 棚・ライン対象.<p>
	 *
	 */
	public boolean str_ln_tgt_flg() {
		return getConstBoolean(offset + 11, $str_ln_tgt_flg);
	}

	/**
	 * For rack/line 棚・ライン対象.<p>
	 *
	 */
	public void str_ln_tgt_flg(boolean value) {
		setConstBoolean(offset + 11, $str_ln_tgt_flg, value);
	}


	/**
	 * Controlling site type 管轄区分.<p>
	 *
	 */
	public String loc_mng_typ() {
		return getConstString(offset + 12, $loc_mng_typ);
	}

	/**
	 * Controlling site type 管轄区分.<p>
	 *
	 */
	public void loc_mng_typ(String value) {
		setConstString(offset + 12, $loc_mng_typ, value);
	}


	/**
	 * Delivery location calendar cd. 納入場所カレンダＣＤ.<p>
	 *
	 */
	public String in_to_loc_cal_cd() {
		return getConstString(offset + 13, $in_to_loc_cal_cd);
	}

	/**
	 * Delivery location calendar cd. 納入場所カレンダＣＤ.<p>
	 *
	 */
	public void in_to_loc_cal_cd(String value) {
		setConstString(offset + 13, $in_to_loc_cal_cd, value);
	}


	/**
	 * Factory/Distribution warehouse cd. 工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public String site_cd() {
		return getConstString(offset + 14, $site_cd);
	}

	/**
	 * Factory/Distribution warehouse cd. 工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public void site_cd(String value) {
		setConstString(offset + 14, $site_cd, value);
	}


	/**
	 * Distribution group cd. 物流グループＣＤ.<p>
	 *
	 */
	public String lg_grp_cd() {
		return getConstString(offset + 15, $lg_grp_cd);
	}

	/**
	 * Distribution group cd. 物流グループＣＤ.<p>
	 *
	 */
	public void lg_grp_cd(String value) {
		setConstString(offset + 15, $lg_grp_cd, value);
	}


	/**
	 * Mfg. location group cd. 製造場所グループＣＤ.<p>
	 *
	 */
	public String loc_grp_cd() {
		return getConstString(offset + 16, $loc_grp_cd);
	}

	/**
	 * Mfg. location group cd. 製造場所グループＣＤ.<p>
	 *
	 */
	public void loc_grp_cd(String value) {
		setConstString(offset + 16, $loc_grp_cd, value);
	}


	/**
	 * Available delivery location WG cd. (Before change) 変更前納入場所ワーキンググループＣＤ.<p>
	 *
	 */
	public String bef_in_to_loc_wg_cd() {
		return getConstString(offset + 17, $bef_in_to_loc_wg_cd);
	}

	/**
	 * Available delivery location WG cd. (Before change) 変更前納入場所ワーキンググループＣＤ.<p>
	 *
	 */
	public void bef_in_to_loc_wg_cd(String value) {
		setConstString(offset + 17, $bef_in_to_loc_wg_cd, value);
	}


	/**
	 * Distribution group cd. (Before change) 変更前物流グループＣＤ.<p>
	 *
	 */
	public String bef_lg_grp_cd() {
		return getConstString(offset + 18, $bef_lg_grp_cd);
	}

	/**
	 * Distribution group cd. (Before change) 変更前物流グループＣＤ.<p>
	 *
	 */
	public void bef_lg_grp_cd(String value) {
		setConstString(offset + 18, $bef_lg_grp_cd, value);
	}


	/**
	 * Before change mfg. location group cd. 変更前製造場所グループＣＤ.<p>
	 *
	 */
	public String bef_loc_grp_cd() {
		return getConstString(offset + 19, $bef_loc_grp_cd);
	}

	/**
	 * Before change mfg. location group cd. 変更前製造場所グループＣＤ.<p>
	 *
	 */
	public void bef_loc_grp_cd(String value) {
		setConstString(offset + 19, $bef_loc_grp_cd, value);
	}


	public mcframe.clientMAUB.MAUBP5320.YmdHmR dlv_rqst_tm_p(){
		return (mcframe.clientMAUB.MAUBP5320.YmdHmR) getConstInnerRow(offset + 20, $dlv_rqst_tm_p);
	}
	
	public void dlv_rqst_tm_p(mcframe.clientMAUB.MAUBP5320.YmdHmR row){
		setConstInnerRow(offset + 20, $dlv_rqst_tm_p, row);
	}


	public mcframe.clientMAUB.MAUBP5030.ItmR itm_p(){
		return (mcframe.clientMAUB.MAUBP5030.ItmR) getConstInnerRow(offset + 21, $itm_p);
	}
	
	public void itm_p(mcframe.clientMAUB.MAUBP5030.ItmR row){
		setConstInnerRow(offset + 21, $itm_p, row);
	}


	/**
	 * Item name for invoice インボイス表記品名.<p>
	 *
	 */
	public String iv_itm_nm() {
		return getConstString(offset + 22, $iv_itm_nm);
	}

	/**
	 * Item name for invoice インボイス表記品名.<p>
	 *
	 */
	public void iv_itm_nm(String value) {
		setConstString(offset + 22, $iv_itm_nm, value);
	}


	/**
	 * Miscellaneous item 諸口品.<p>
	 *
	 */
	public boolean sundry_itm_flg() {
		return getConstBoolean(offset + 23, $sundry_itm_flg);
	}

	/**
	 * Miscellaneous item 諸口品.<p>
	 *
	 */
	public void sundry_itm_flg(boolean value) {
		setConstBoolean(offset + 23, $sundry_itm_flg, value);
	}


	/**
	 * Asset management type 資産管理区分.<p>
	 *
	 */
	public String asset_mng_typ() {
		return getConstString(offset + 24, $asset_mng_typ);
	}

	/**
	 * Asset management type 資産管理区分.<p>
	 *
	 */
	public void asset_mng_typ(String value) {
		setConstString(offset + 24, $asset_mng_typ, value);
	}


	/**
	 * Asset management type name 資産管理区分名.<p>
	 *
	 */
	public String asset_mng_typ_nm() {
		return getConstString(offset + 25, $asset_mng_typ_nm);
	}

	/**
	 * Asset management type name 資産管理区分名.<p>
	 *
	 */
	public void asset_mng_typ_nm(String value) {
		setConstString(offset + 25, $asset_mng_typ_nm, value);
	}


	public mcframe.clientMAUB.MAUBP5120.StrLnR str_ln_p(){
		return (mcframe.clientMAUB.MAUBP5120.StrLnR) getConstInnerRow(offset + 26, $str_ln_p);
	}
	
	public void str_ln_p(mcframe.clientMAUB.MAUBP5120.StrLnR row){
		setConstInnerRow(offset + 26, $str_ln_p, row);
	}


	/**
	 * Inventory management type 在庫管理区分.<p>
	 *
	 */
	public String stk_mng_typ() {
		return getConstString(offset + 27, $stk_mng_typ);
	}

	/**
	 * Inventory management type 在庫管理区分.<p>
	 *
	 */
	public void stk_mng_typ(String value) {
		setConstString(offset + 27, $stk_mng_typ, value);
	}


	/**
	 * Receipt unnecessary 入荷不要.<p>
	 *
	 */
	public boolean arr_skip_flg() {
		return getConstBoolean(offset + 28, $arr_skip_flg);
	}

	/**
	 * Receipt unnecessary 入荷不要.<p>
	 *
	 */
	public void arr_skip_flg(boolean value) {
		setConstBoolean(offset + 28, $arr_skip_flg, value);
	}


	/**
	 * For purchase delivery note 購買納品書対象.<p>
	 *
	 */
	public boolean purc_dlv_slip_flg() {
		return getConstBoolean(offset + 29, $purc_dlv_slip_flg);
	}

	/**
	 * For purchase delivery note 購買納品書対象.<p>
	 *
	 */
	public void purc_dlv_slip_flg(boolean value) {
		setConstBoolean(offset + 29, $purc_dlv_slip_flg, value);
	}


	/**
	 * Maker cd. メーカＣＤ.<p>
	 *
	 */
	public String maker_cd() {
		return getConstString(offset + 30, $maker_cd);
	}

	/**
	 * Maker cd. メーカＣＤ.<p>
	 *
	 */
	public void maker_cd(String value) {
		setConstString(offset + 30, $maker_cd, value);
	}


	/**
	 * Maker name メーカ名.<p>
	 *
	 */
	public String maker_nm() {
		return getConstString(offset + 31, $maker_nm);
	}

	/**
	 * Maker name メーカ名.<p>
	 *
	 */
	public void maker_nm(String value) {
		setConstString(offset + 31, $maker_nm, value);
	}


	/**
	 * Request source desired available date 依頼元使用可能希望日.<p>
	 *
	 */
	public MCDate rqst_avl_rqst_dt() {
		return getConstDate(offset + 32, $rqst_avl_rqst_dt);
	}

	/**
	 * Request source desired available date 依頼元使用可能希望日.<p>
	 *
	 */
	public void rqst_avl_rqst_dt(MCDate value) {
		setConstDate(offset + 32, $rqst_avl_rqst_dt, value);
	}


	public mcframe.clientMAUB.MAUBP5320.YmdHmR rqst_dlv_rqst_tm_p(){
		return (mcframe.clientMAUB.MAUBP5320.YmdHmR) getConstInnerRow(offset + 33, $rqst_dlv_rqst_tm_p);
	}
	
	public void rqst_dlv_rqst_tm_p(mcframe.clientMAUB.MAUBP5320.YmdHmR row){
		setConstInnerRow(offset + 33, $rqst_dlv_rqst_tm_p, row);
	}


	/**
	 * Scheduled purchase date 仕入予定日.<p>
	 *
	 */
	public MCDate purc_schd_dt() {
		return getConstDate(offset + 34, $purc_schd_dt);
	}

	/**
	 * Scheduled purchase date 仕入予定日.<p>
	 *
	 */
	public void purc_schd_dt(MCDate value) {
		setConstDate(offset + 34, $purc_schd_dt, value);
	}


	/**
	 * Purchase recording type 仕入計上区分.<p>
	 *
	 */
	public String purc_basis_typ() {
		return getConstString(offset + 35, $purc_basis_typ);
	}

	/**
	 * Purchase recording type 仕入計上区分.<p>
	 *
	 */
	public void purc_basis_typ(String value) {
		setConstString(offset + 35, $purc_basis_typ, value);
	}


	/**
	 * Purchase recording type name 仕入計上区分名.<p>
	 *
	 */
	public String purc_basis_typ_nm() {
		return getConstString(offset + 36, $purc_basis_typ_nm);
	}

	/**
	 * Purchase recording type name 仕入計上区分名.<p>
	 *
	 */
	public void purc_basis_typ_nm(String value) {
		setConstString(offset + 36, $purc_basis_typ_nm, value);
	}


	/**
	 * Simultaneous recording 同時計上.<p>
	 *
	 */
	public boolean sync_flg() {
		return getConstBoolean(offset + 37, $sync_flg);
	}

	/**
	 * Simultaneous recording 同時計上.<p>
	 *
	 */
	public void sync_flg(boolean value) {
		setConstBoolean(offset + 37, $sync_flg, value);
	}


	/**
	 * Allow item purchasing unit price change 品目購買単価変更許可.<p>
	 *
	 */
	public boolean itm_purc_upri_cng_flg() {
		return getConstBoolean(offset + 38, $itm_purc_upri_cng_flg);
	}

	/**
	 * Allow item purchasing unit price change 品目購買単価変更許可.<p>
	 *
	 */
	public void itm_purc_upri_cng_flg(boolean value) {
		setConstBoolean(offset + 38, $itm_purc_upri_cng_flg, value);
	}


	/**
	 * Discount item 値引品目.<p>
	 *
	 */
	public boolean dscnt_itm_flg() {
		return getConstBoolean(offset + 39, $dscnt_itm_flg);
	}

	/**
	 * Discount item 値引品目.<p>
	 *
	 */
	public void dscnt_itm_flg(boolean value) {
		setConstBoolean(offset + 39, $dscnt_itm_flg, value);
	}


	/**
	 * For version control 版管理対象.<p>
	 *
	 */
	public boolean ver_flg() {
		return getConstBoolean(offset + 40, $ver_flg);
	}

	/**
	 * For version control 版管理対象.<p>
	 *
	 */
	public void ver_flg(boolean value) {
		setConstBoolean(offset + 40, $ver_flg, value);
	}


	/**
	 * Item payment carry-over count 品目支払繰越回数.<p>
	 *
	 */
	public MCNumber itm_pay_crryovr_times() {
		return getConstNumber(offset + 41, $itm_pay_crryovr_times);
	}

	/**
	 * Item payment carry-over count 品目支払繰越回数.<p>
	 *
	 */
	public void itm_pay_crryovr_times(MCNumber value) {
		setConstNumber(offset + 41, $itm_pay_crryovr_times, value);
	}

	/**
	 * Item payment carry-over count 品目支払繰越回数.<p>
	 *
	 */
	public void itm_pay_crryovr_times(int value) {
		setConstNumber(offset + 41, $itm_pay_crryovr_times, value);
	}

	/**
	 * Item payment carry-over count 品目支払繰越回数.<p>
	 *
	 */
	public void itm_pay_crryovr_times(long value) {
		setConstNumber(offset + 41, $itm_pay_crryovr_times, value);
	}

	/**
	 * Item payment carry-over count 品目支払繰越回数.<p>
	 *
	 */
	public void itm_pay_crryovr_times(float value) {
		setConstNumber(offset + 41, $itm_pay_crryovr_times, value);
	}

	/**
	 * Item payment carry-over count 品目支払繰越回数.<p>
	 *
	 */
	public void itm_pay_crryovr_times(double value) {
		setConstNumber(offset + 41, $itm_pay_crryovr_times, value);
	}


	/**
	 * SEIBAN No. 1 management type 手配ＮＯ１管理区分.<p>
	 *
	 */
	public String sno1_mng_typ() {
		return getConstString(offset + 42, $sno1_mng_typ);
	}

	/**
	 * SEIBAN No. 1 management type 手配ＮＯ１管理区分.<p>
	 *
	 */
	public void sno1_mng_typ(String value) {
		setConstString(offset + 42, $sno1_mng_typ, value);
	}


	/**
	 * SEIBAN No. 2 management type 手配ＮＯ２管理区分.<p>
	 *
	 */
	public String sno2_mng_typ() {
		return getConstString(offset + 43, $sno2_mng_typ);
	}

	/**
	 * SEIBAN No. 2 management type 手配ＮＯ２管理区分.<p>
	 *
	 */
	public void sno2_mng_typ(String value) {
		setConstString(offset + 43, $sno2_mng_typ, value);
	}


	/**
	 * SEIBAN No. 3 management type 手配ＮＯ３管理区分.<p>
	 *
	 */
	public String sno3_mng_typ() {
		return getConstString(offset + 44, $sno3_mng_typ);
	}

	/**
	 * SEIBAN No. 3 management type 手配ＮＯ３管理区分.<p>
	 *
	 */
	public void sno3_mng_typ(String value) {
		setConstString(offset + 44, $sno3_mng_typ, value);
	}


	/**
	 * SEIBAN No. 4 management type 手配ＮＯ４管理区分.<p>
	 *
	 */
	public String sno4_mng_typ() {
		return getConstString(offset + 45, $sno4_mng_typ);
	}

	/**
	 * SEIBAN No. 4 management type 手配ＮＯ４管理区分.<p>
	 *
	 */
	public void sno4_mng_typ(String value) {
		setConstString(offset + 45, $sno4_mng_typ, value);
	}


	public mcframe.clientMAUB.MAUBP5250.VerNoR ver_no_p(){
		return (mcframe.clientMAUB.MAUBP5250.VerNoR) getConstInnerRow(offset + 46, $ver_no_p);
	}
	
	public void ver_no_p(mcframe.clientMAUB.MAUBP5250.VerNoR row){
		setConstInnerRow(offset + 46, $ver_no_p, row);
	}


	/**
	 * Vendor lot No. 業者ロットＮＯ.<p>
	 *
	 */
	public String bp_lot_no() {
		return getConstString(offset + 47, $bp_lot_no);
	}

	/**
	 * Vendor lot No. 業者ロットＮＯ.<p>
	 *
	 */
	public void bp_lot_no(String value) {
		setConstString(offset + 47, $bp_lot_no, value);
	}


	/**
	 * Supplier item cd. 発注先品目ＣＤ.<p>
	 *
	 */
	public String sppl_itm_cd() {
		return getConstString(offset + 48, $sppl_itm_cd);
	}

	/**
	 * Supplier item cd. 発注先品目ＣＤ.<p>
	 *
	 */
	public void sppl_itm_cd(String value) {
		setConstString(offset + 48, $sppl_itm_cd, value);
	}


	/**
	 * Supplier item name 発注先品名.<p>
	 *
	 */
	public String sppl_itm_nm() {
		return getConstString(offset + 49, $sppl_itm_nm);
	}

	/**
	 * Supplier item name 発注先品名.<p>
	 *
	 */
	public void sppl_itm_nm(String value) {
		setConstString(offset + 49, $sppl_itm_nm, value);
	}


	/**
	 * Customer item cd. 得意先品目ＣＤ.<p>
	 *
	 */
	public String cst_itm_cd() {
		return getConstString(offset + 50, $cst_itm_cd);
	}

	/**
	 * Customer item cd. 得意先品目ＣＤ.<p>
	 *
	 */
	public void cst_itm_cd(String value) {
		setConstString(offset + 50, $cst_itm_cd, value);
	}


	/**
	 * Customer item name 得意先品名.<p>
	 *
	 */
	public String cst_itm_nm() {
		return getConstString(offset + 51, $cst_itm_nm);
	}

	/**
	 * Customer item name 得意先品名.<p>
	 *
	 */
	public void cst_itm_nm(String value) {
		setConstString(offset + 51, $cst_itm_nm, value);
	}


	/**
	 * AP dept. cd. 債務部門ＣＤ.<p>
	 *
	 */
	public String ap_dpt_cd() {
		return getConstString(offset + 52, $ap_dpt_cd);
	}

	/**
	 * AP dept. cd. 債務部門ＣＤ.<p>
	 *
	 */
	public void ap_dpt_cd(String value) {
		setConstString(offset + 52, $ap_dpt_cd, value);
	}


	/**
	 * AP dept. name 債務部門名.<p>
	 *
	 */
	public String ap_dpt_nm() {
		return getConstString(offset + 53, $ap_dpt_nm);
	}

	/**
	 * AP dept. name 債務部門名.<p>
	 *
	 */
	public void ap_dpt_nm(String value) {
		setConstString(offset + 53, $ap_dpt_nm, value);
	}


	public mcframe.clientMAUB.MAUBP5150.DlvR dlv_p(){
		return (mcframe.clientMAUB.MAUBP5150.DlvR) getConstInnerRow(offset + 54, $dlv_p);
	}
	
	public void dlv_p(mcframe.clientMAUB.MAUBP5150.DlvR row){
		setConstInnerRow(offset + 54, $dlv_p, row);
	}


	public String dlv_cal_cd() {
		return getConstString(offset + 55, $dlv_cal_cd);
	}

	public void dlv_cal_cd(String value) {
		setConstString(offset + 55, $dlv_cal_cd, value);
	}


	public mcframe.clientMAUB.MAUBP5150.DlvR tdlv_p(){
		return (mcframe.clientMAUB.MAUBP5150.DlvR) getConstInnerRow(offset + 56, $tdlv_p);
	}
	
	public void tdlv_p(mcframe.clientMAUB.MAUBP5150.DlvR row){
		setConstInnerRow(offset + 56, $tdlv_p, row);
	}


	/**
	 * Purchase identification type 購買識別区分.<p>
	 *
	 */
	public String purc_id_typ() {
		return getConstString(offset + 57, $purc_id_typ);
	}

	/**
	 * Purchase identification type 購買識別区分.<p>
	 *
	 */
	public void purc_id_typ(String value) {
		setConstString(offset + 57, $purc_id_typ, value);
	}


	/**
	 * Purchase identification type name 購買識別区分名.<p>
	 *
	 */
	public String purc_id_typ_nm() {
		return getConstString(offset + 58, $purc_id_typ_nm);
	}

	/**
	 * Purchase identification type name 購買識別区分名.<p>
	 *
	 */
	public void purc_id_typ_nm(String value) {
		setConstString(offset + 58, $purc_id_typ_nm, value);
	}


	/**
	 * Confirmation received 請書受領.<p>
	 *
	 */
	public boolean po_conf_rcpt_flg() {
		return getConstBoolean(offset + 59, $po_conf_rcpt_flg);
	}

	/**
	 * Confirmation received 請書受領.<p>
	 *
	 */
	public void po_conf_rcpt_flg(boolean value) {
		setConstBoolean(offset + 59, $po_conf_rcpt_flg, value);
	}


	/**
	 * Confirmation received date 請書受領日.<p>
	 *
	 */
	public MCDate po_conf_rcpt_dt() {
		return getConstDate(offset + 60, $po_conf_rcpt_dt);
	}

	/**
	 * Confirmation received date 請書受領日.<p>
	 *
	 */
	public void po_conf_rcpt_dt(MCDate value) {
		setConstDate(offset + 60, $po_conf_rcpt_dt, value);
	}


	/**
	 * Unit cd. 単位ＣＤ.<p>
	 *
	 */
	public String trd_unit_cd() {
		return getConstString(offset + 61, $trd_unit_cd);
	}

	/**
	 * Unit cd. 単位ＣＤ.<p>
	 *
	 */
	public void trd_unit_cd(String value) {
		setConstString(offset + 61, $trd_unit_cd, value);
	}


	/**
	 * Unit name 単位名.<p>
	 *
	 */
	public String trd_unit_nm() {
		return getConstString(offset + 62, $trd_unit_nm);
	}

	/**
	 * Unit name 単位名.<p>
	 *
	 */
	public void trd_unit_nm(String value) {
		setConstString(offset + 62, $trd_unit_nm, value);
	}


	/**
	 * Transaction unit number of decimal places 小数部有効桁数（取引単位）.<p>
	 *
	 */
	public MCNumber trd_unit_dec_place() {
		return getConstNumber(offset + 63, $trd_unit_dec_place);
	}

	/**
	 * Transaction unit number of decimal places 小数部有効桁数（取引単位）.<p>
	 *
	 */
	public void trd_unit_dec_place(MCNumber value) {
		setConstNumber(offset + 63, $trd_unit_dec_place, value);
	}

	/**
	 * Transaction unit number of decimal places 小数部有効桁数（取引単位）.<p>
	 *
	 */
	public void trd_unit_dec_place(int value) {
		setConstNumber(offset + 63, $trd_unit_dec_place, value);
	}

	/**
	 * Transaction unit number of decimal places 小数部有効桁数（取引単位）.<p>
	 *
	 */
	public void trd_unit_dec_place(long value) {
		setConstNumber(offset + 63, $trd_unit_dec_place, value);
	}

	/**
	 * Transaction unit number of decimal places 小数部有効桁数（取引単位）.<p>
	 *
	 */
	public void trd_unit_dec_place(float value) {
		setConstNumber(offset + 63, $trd_unit_dec_place, value);
	}

	/**
	 * Transaction unit number of decimal places 小数部有効桁数（取引単位）.<p>
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
	 * Conversion base qty. 換算基準数量.<p>
	 *
	 */
	public MCNumber trd_unit_conv_base_qty() {
		return getConstNumber(offset + 65, $trd_unit_conv_base_qty);
	}

	/**
	 * Conversion base qty. 換算基準数量.<p>
	 *
	 */
	public void trd_unit_conv_base_qty(MCNumber value) {
		setConstNumber(offset + 65, $trd_unit_conv_base_qty, value);
	}

	/**
	 * Conversion base qty. 換算基準数量.<p>
	 *
	 */
	public void trd_unit_conv_base_qty(int value) {
		setConstNumber(offset + 65, $trd_unit_conv_base_qty, value);
	}

	/**
	 * Conversion base qty. 換算基準数量.<p>
	 *
	 */
	public void trd_unit_conv_base_qty(long value) {
		setConstNumber(offset + 65, $trd_unit_conv_base_qty, value);
	}

	/**
	 * Conversion base qty. 換算基準数量.<p>
	 *
	 */
	public void trd_unit_conv_base_qty(float value) {
		setConstNumber(offset + 65, $trd_unit_conv_base_qty, value);
	}

	/**
	 * Conversion base qty. 換算基準数量.<p>
	 *
	 */
	public void trd_unit_conv_base_qty(double value) {
		setConstNumber(offset + 65, $trd_unit_conv_base_qty, value);
	}


	/**
	 * Conversion qty. 換算数量.<p>
	 *
	 */
	public MCNumber trd_unit_conv_qty() {
		return getConstNumber(offset + 66, $trd_unit_conv_qty);
	}

	/**
	 * Conversion qty. 換算数量.<p>
	 *
	 */
	public void trd_unit_conv_qty(MCNumber value) {
		setConstNumber(offset + 66, $trd_unit_conv_qty, value);
	}

	/**
	 * Conversion qty. 換算数量.<p>
	 *
	 */
	public void trd_unit_conv_qty(int value) {
		setConstNumber(offset + 66, $trd_unit_conv_qty, value);
	}

	/**
	 * Conversion qty. 換算数量.<p>
	 *
	 */
	public void trd_unit_conv_qty(long value) {
		setConstNumber(offset + 66, $trd_unit_conv_qty, value);
	}

	/**
	 * Conversion qty. 換算数量.<p>
	 *
	 */
	public void trd_unit_conv_qty(float value) {
		setConstNumber(offset + 66, $trd_unit_conv_qty, value);
	}

	/**
	 * Conversion qty. 換算数量.<p>
	 *
	 */
	public void trd_unit_conv_qty(double value) {
		setConstNumber(offset + 66, $trd_unit_conv_qty, value);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR trd_unit_qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 67, $trd_unit_qty_p);
	}
	
	public void trd_unit_qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 67, $trd_unit_qty_p, row);
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
	 * Base unit name 基準単位名.<p>
	 *
	 */
	public String base_unit_nm() {
		return getConstString(offset + 69, $base_unit_nm);
	}

	/**
	 * Base unit name 基準単位名.<p>
	 *
	 */
	public void base_unit_nm(String value) {
		setConstString(offset + 69, $base_unit_nm, value);
	}


	/**
	 * Cancel remaining 打切.<p>
	 *
	 */
	public boolean abort_flg() {
		return getConstBoolean(offset + 70, $abort_flg);
	}

	/**
	 * Cancel remaining 打切.<p>
	 *
	 */
	public void abort_flg(boolean value) {
		setConstBoolean(offset + 70, $abort_flg, value);
	}


	/**
	 * Last cancel remaining 前回打切.<p>
	 *
	 */
	public boolean bef_abort_flg() {
		return getConstBoolean(offset + 71, $bef_abort_flg);
	}

	/**
	 * Last cancel remaining 前回打切.<p>
	 *
	 */
	public void bef_abort_flg(boolean value) {
		setConstBoolean(offset + 71, $bef_abort_flg, value);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR base_unit_qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 72, $base_unit_qty_p);
	}
	
	public void base_unit_qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 72, $base_unit_qty_p, row);
	}


	/**
	 * Number of decimal places (Base unit) 小数部有効桁数（基準単位）.<p>
	 *
	 */
	public MCNumber base_unit_dec_place() {
		return getConstNumber(offset + 73, $base_unit_dec_place);
	}

	/**
	 * Number of decimal places (Base unit) 小数部有効桁数（基準単位）.<p>
	 *
	 */
	public void base_unit_dec_place(MCNumber value) {
		setConstNumber(offset + 73, $base_unit_dec_place, value);
	}

	/**
	 * Number of decimal places (Base unit) 小数部有効桁数（基準単位）.<p>
	 *
	 */
	public void base_unit_dec_place(int value) {
		setConstNumber(offset + 73, $base_unit_dec_place, value);
	}

	/**
	 * Number of decimal places (Base unit) 小数部有効桁数（基準単位）.<p>
	 *
	 */
	public void base_unit_dec_place(long value) {
		setConstNumber(offset + 73, $base_unit_dec_place, value);
	}

	/**
	 * Number of decimal places (Base unit) 小数部有効桁数（基準単位）.<p>
	 *
	 */
	public void base_unit_dec_place(float value) {
		setConstNumber(offset + 73, $base_unit_dec_place, value);
	}

	/**
	 * Number of decimal places (Base unit) 小数部有効桁数（基準単位）.<p>
	 *
	 */
	public void base_unit_dec_place(double value) {
		setConstNumber(offset + 73, $base_unit_dec_place, value);
	}


	/**
	 * Base unit rounding type 基準単位端数処理区分.<p>
	 *
	 */
	public String base_unit_rnd_typ() {
		return getConstString(offset + 74, $base_unit_rnd_typ);
	}

	/**
	 * Base unit rounding type 基準単位端数処理区分.<p>
	 *
	 */
	public void base_unit_rnd_typ(String value) {
		setConstString(offset + 74, $base_unit_rnd_typ, value);
	}


	public mcframe.clientMAUB.MAUBP5260.ContQtyR inst_cont_qty_p(){
		return (mcframe.clientMAUB.MAUBP5260.ContQtyR) getConstInnerRow(offset + 75, $inst_cont_qty_p);
	}
	
	public void inst_cont_qty_p(mcframe.clientMAUB.MAUBP5260.ContQtyR row){
		setConstInnerRow(offset + 75, $inst_cont_qty_p, row);
	}


	/**
	 * For active ingredient 有効成分対象.<p>
	 *
	 */
	public boolean cont_fctr_flg() {
		return getConstBoolean(offset + 76, $cont_fctr_flg);
	}

	/**
	 * For active ingredient 有効成分対象.<p>
	 *
	 */
	public void cont_fctr_flg(boolean value) {
		setConstBoolean(offset + 76, $cont_fctr_flg, value);
	}


	/**
	 * Active ingredient number of decimal places 有効成分小数部有効桁数.<p>
	 *
	 */
	public MCNumber cont_fctr_dec_place() {
		return getConstNumber(offset + 77, $cont_fctr_dec_place);
	}

	/**
	 * Active ingredient number of decimal places 有効成分小数部有効桁数.<p>
	 *
	 */
	public void cont_fctr_dec_place(MCNumber value) {
		setConstNumber(offset + 77, $cont_fctr_dec_place, value);
	}

	/**
	 * Active ingredient number of decimal places 有効成分小数部有効桁数.<p>
	 *
	 */
	public void cont_fctr_dec_place(int value) {
		setConstNumber(offset + 77, $cont_fctr_dec_place, value);
	}

	/**
	 * Active ingredient number of decimal places 有効成分小数部有効桁数.<p>
	 *
	 */
	public void cont_fctr_dec_place(long value) {
		setConstNumber(offset + 77, $cont_fctr_dec_place, value);
	}

	/**
	 * Active ingredient number of decimal places 有効成分小数部有効桁数.<p>
	 *
	 */
	public void cont_fctr_dec_place(float value) {
		setConstNumber(offset + 77, $cont_fctr_dec_place, value);
	}

	/**
	 * Active ingredient number of decimal places 有効成分小数部有効桁数.<p>
	 *
	 */
	public void cont_fctr_dec_place(double value) {
		setConstNumber(offset + 77, $cont_fctr_dec_place, value);
	}


	/**
	 * Rounding type (Active ingredient conversion) 有効成分換算端数処理区分.<p>
	 *
	 */
	public String cont_fctr_rnd_typ() {
		return getConstString(offset + 78, $cont_fctr_rnd_typ);
	}

	/**
	 * Rounding type (Active ingredient conversion) 有効成分換算端数処理区分.<p>
	 *
	 */
	public void cont_fctr_rnd_typ(String value) {
		setConstString(offset + 78, $cont_fctr_rnd_typ, value);
	}


	public mcframe.clientMAUB.MAUBP5270.ContFctrUnitR cont_unit_p(){
		return (mcframe.clientMAUB.MAUBP5270.ContFctrUnitR) getConstInnerRow(offset + 79, $cont_unit_p);
	}
	
	public void cont_unit_p(mcframe.clientMAUB.MAUBP5270.ContFctrUnitR row){
		setConstInnerRow(offset + 79, $cont_unit_p, row);
	}


	public mcframe.clientMAUB.MAUBP5280.StdContFctrR std_cont_p(){
		return (mcframe.clientMAUB.MAUBP5280.StdContFctrR) getConstInnerRow(offset + 80, $std_cont_p);
	}
	
	public void std_cont_p(mcframe.clientMAUB.MAUBP5280.StdContFctrR row){
		setConstInnerRow(offset + 80, $std_cont_p, row);
	}


	/**
	 * Purchase status type 購買状況区分.<p>
	 *
	 */
	public String purc_sts_typ() {
		return getConstString(offset + 81, $purc_sts_typ);
	}

	/**
	 * Purchase status type 購買状況区分.<p>
	 *
	 */
	public void purc_sts_typ(String value) {
		setConstString(offset + 81, $purc_sts_typ, value);
	}


	/**
	 * Purchase status type name 購買状況区分名.<p>
	 *
	 */
	public String purc_sts_typ_nm() {
		return getConstString(offset + 82, $purc_sts_typ_nm);
	}

	/**
	 * Purchase status type name 購買状況区分名.<p>
	 *
	 */
	public void purc_sts_typ_nm(String value) {
		setConstString(offset + 82, $purc_sts_typ_nm, value);
	}


	/**
	 * Delivery order qty. 納入指示数量.<p>
	 *
	 */
	public MCNumber dlv_inst_qty() {
		return getConstNumber(offset + 83, $dlv_inst_qty);
	}

	/**
	 * Delivery order qty. 納入指示数量.<p>
	 *
	 */
	public void dlv_inst_qty(MCNumber value) {
		setConstNumber(offset + 83, $dlv_inst_qty, value);
	}

	/**
	 * Delivery order qty. 納入指示数量.<p>
	 *
	 */
	public void dlv_inst_qty(int value) {
		setConstNumber(offset + 83, $dlv_inst_qty, value);
	}

	/**
	 * Delivery order qty. 納入指示数量.<p>
	 *
	 */
	public void dlv_inst_qty(long value) {
		setConstNumber(offset + 83, $dlv_inst_qty, value);
	}

	/**
	 * Delivery order qty. 納入指示数量.<p>
	 *
	 */
	public void dlv_inst_qty(float value) {
		setConstNumber(offset + 83, $dlv_inst_qty, value);
	}

	/**
	 * Delivery order qty. 納入指示数量.<p>
	 *
	 */
	public void dlv_inst_qty(double value) {
		setConstNumber(offset + 83, $dlv_inst_qty, value);
	}


	/**
	 * Delivery order replied received qty. 納入指示回答受領数量.<p>
	 *
	 */
	public MCNumber dlv_inst_prms_rcpt_qty() {
		return getConstNumber(offset + 84, $dlv_inst_prms_rcpt_qty);
	}

	/**
	 * Delivery order replied received qty. 納入指示回答受領数量.<p>
	 *
	 */
	public void dlv_inst_prms_rcpt_qty(MCNumber value) {
		setConstNumber(offset + 84, $dlv_inst_prms_rcpt_qty, value);
	}

	/**
	 * Delivery order replied received qty. 納入指示回答受領数量.<p>
	 *
	 */
	public void dlv_inst_prms_rcpt_qty(int value) {
		setConstNumber(offset + 84, $dlv_inst_prms_rcpt_qty, value);
	}

	/**
	 * Delivery order replied received qty. 納入指示回答受領数量.<p>
	 *
	 */
	public void dlv_inst_prms_rcpt_qty(long value) {
		setConstNumber(offset + 84, $dlv_inst_prms_rcpt_qty, value);
	}

	/**
	 * Delivery order replied received qty. 納入指示回答受領数量.<p>
	 *
	 */
	public void dlv_inst_prms_rcpt_qty(float value) {
		setConstNumber(offset + 84, $dlv_inst_prms_rcpt_qty, value);
	}

	/**
	 * Delivery order replied received qty. 納入指示回答受領数量.<p>
	 *
	 */
	public void dlv_inst_prms_rcpt_qty(double value) {
		setConstNumber(offset + 84, $dlv_inst_prms_rcpt_qty, value);
	}


	/**
	 * Purchase invoice qty. 受領インボイス数量.<p>
	 *
	 */
	public MCNumber rcpt_iv_qty() {
		return getConstNumber(offset + 85, $rcpt_iv_qty);
	}

	/**
	 * Purchase invoice qty. 受領インボイス数量.<p>
	 *
	 */
	public void rcpt_iv_qty(MCNumber value) {
		setConstNumber(offset + 85, $rcpt_iv_qty, value);
	}

	/**
	 * Purchase invoice qty. 受領インボイス数量.<p>
	 *
	 */
	public void rcpt_iv_qty(int value) {
		setConstNumber(offset + 85, $rcpt_iv_qty, value);
	}

	/**
	 * Purchase invoice qty. 受領インボイス数量.<p>
	 *
	 */
	public void rcpt_iv_qty(long value) {
		setConstNumber(offset + 85, $rcpt_iv_qty, value);
	}

	/**
	 * Purchase invoice qty. 受領インボイス数量.<p>
	 *
	 */
	public void rcpt_iv_qty(float value) {
		setConstNumber(offset + 85, $rcpt_iv_qty, value);
	}

	/**
	 * Purchase invoice qty. 受領インボイス数量.<p>
	 *
	 */
	public void rcpt_iv_qty(double value) {
		setConstNumber(offset + 85, $rcpt_iv_qty, value);
	}


	/**
	 * Receipt qty. 入荷数量.<p>
	 *
	 */
	public MCNumber arr_qty() {
		return getConstNumber(offset + 86, $arr_qty);
	}

	/**
	 * Receipt qty. 入荷数量.<p>
	 *
	 */
	public void arr_qty(MCNumber value) {
		setConstNumber(offset + 86, $arr_qty, value);
	}

	/**
	 * Receipt qty. 入荷数量.<p>
	 *
	 */
	public void arr_qty(int value) {
		setConstNumber(offset + 86, $arr_qty, value);
	}

	/**
	 * Receipt qty. 入荷数量.<p>
	 *
	 */
	public void arr_qty(long value) {
		setConstNumber(offset + 86, $arr_qty, value);
	}

	/**
	 * Receipt qty. 入荷数量.<p>
	 *
	 */
	public void arr_qty(float value) {
		setConstNumber(offset + 86, $arr_qty, value);
	}

	/**
	 * Receipt qty. 入荷数量.<p>
	 *
	 */
	public void arr_qty(double value) {
		setConstNumber(offset + 86, $arr_qty, value);
	}


	/**
	 * Purchase qty. 仕入数量.<p>
	 *
	 */
	public MCNumber purc_qty() {
		return getConstNumber(offset + 87, $purc_qty);
	}

	/**
	 * Purchase qty. 仕入数量.<p>
	 *
	 */
	public void purc_qty(MCNumber value) {
		setConstNumber(offset + 87, $purc_qty, value);
	}

	/**
	 * Purchase qty. 仕入数量.<p>
	 *
	 */
	public void purc_qty(int value) {
		setConstNumber(offset + 87, $purc_qty, value);
	}

	/**
	 * Purchase qty. 仕入数量.<p>
	 *
	 */
	public void purc_qty(long value) {
		setConstNumber(offset + 87, $purc_qty, value);
	}

	/**
	 * Purchase qty. 仕入数量.<p>
	 *
	 */
	public void purc_qty(float value) {
		setConstNumber(offset + 87, $purc_qty, value);
	}

	/**
	 * Purchase qty. 仕入数量.<p>
	 *
	 */
	public void purc_qty(double value) {
		setConstNumber(offset + 87, $purc_qty, value);
	}


	/**
	 * Split receipt schedule 入荷予定分割.<p>
	 *
	 */
	public boolean arr_schd_split_flg() {
		return getConstBoolean(offset + 88, $arr_schd_split_flg);
	}

	/**
	 * Split receipt schedule 入荷予定分割.<p>
	 *
	 */
	public void arr_schd_split_flg(boolean value) {
		setConstBoolean(offset + 88, $arr_schd_split_flg, value);
	}


	/**
	 * Receipt completed 入荷完了.<p>
	 *
	 */
	public boolean arr_cmpl_flg() {
		return getConstBoolean(offset + 89, $arr_cmpl_flg);
	}

	/**
	 * Receipt completed 入荷完了.<p>
	 *
	 */
	public void arr_cmpl_flg(boolean value) {
		setConstBoolean(offset + 89, $arr_cmpl_flg, value);
	}


	/**
	 * Purchase completed 仕入完了.<p>
	 *
	 */
	public boolean purc_cmpl_flg() {
		return getConstBoolean(offset + 90, $purc_cmpl_flg);
	}

	/**
	 * Purchase completed 仕入完了.<p>
	 *
	 */
	public void purc_cmpl_flg(boolean value) {
		setConstBoolean(offset + 90, $purc_cmpl_flg, value);
	}


	/**
	 * Payment carry-over count 支払繰越回数.<p>
	 *
	 */
	public MCNumber pay_crryovr_times() {
		return getConstNumber(offset + 91, $pay_crryovr_times);
	}

	/**
	 * Payment carry-over count 支払繰越回数.<p>
	 *
	 */
	public void pay_crryovr_times(MCNumber value) {
		setConstNumber(offset + 91, $pay_crryovr_times, value);
	}

	/**
	 * Payment carry-over count 支払繰越回数.<p>
	 *
	 */
	public void pay_crryovr_times(int value) {
		setConstNumber(offset + 91, $pay_crryovr_times, value);
	}

	/**
	 * Payment carry-over count 支払繰越回数.<p>
	 *
	 */
	public void pay_crryovr_times(long value) {
		setConstNumber(offset + 91, $pay_crryovr_times, value);
	}

	/**
	 * Payment carry-over count 支払繰越回数.<p>
	 *
	 */
	public void pay_crryovr_times(float value) {
		setConstNumber(offset + 91, $pay_crryovr_times, value);
	}

	/**
	 * Payment carry-over count 支払繰越回数.<p>
	 *
	 */
	public void pay_crryovr_times(double value) {
		setConstNumber(offset + 91, $pay_crryovr_times, value);
	}


	/**
	 * Purchase unit price acquisition type 購買単価取得区分.<p>
	 *
	 */
	public String purc_upri_req_typ() {
		return getConstString(offset + 92, $purc_upri_req_typ);
	}

	/**
	 * Purchase unit price acquisition type 購買単価取得区分.<p>
	 *
	 */
	public void purc_upri_req_typ(String value) {
		setConstString(offset + 92, $purc_upri_req_typ, value);
	}


	/**
	 * Purchase unit price acquisition type name 購買単価取得区分名.<p>
	 *
	 */
	public String purc_upri_req_typ_nm() {
		return getConstString(offset + 93, $purc_upri_req_typ_nm);
	}

	/**
	 * Purchase unit price acquisition type name 購買単価取得区分名.<p>
	 *
	 */
	public void purc_upri_req_typ_nm(String value) {
		setConstString(offset + 93, $purc_upri_req_typ_nm, value);
	}


	public mcframe.clientMSUB.MSUBP5070.TrdUpriAmtR trd_cur_upri_p(){
		return (mcframe.clientMSUB.MSUBP5070.TrdUpriAmtR) getConstInnerRow(offset + 94, $trd_cur_upri_p);
	}
	
	public void trd_cur_upri_p(mcframe.clientMSUB.MSUBP5070.TrdUpriAmtR row){
		setConstInnerRow(offset + 94, $trd_cur_upri_p, row);
	}


	/**
	 * Repurchase obligation 買戻義務.<p>
	 *
	 */
	public boolean repurc_obli_flg() {
		return getConstBoolean(offset + 95, $repurc_obli_flg);
	}

	/**
	 * Repurchase obligation 買戻義務.<p>
	 *
	 */
	public void repurc_obli_flg(boolean value) {
		setConstBoolean(offset + 95, $repurc_obli_flg, value);
	}


	/**
	 * Subcontracting unit price type 外注単価区分.<p>
	 *
	 */
	public String outsrc_upri_typ() {
		return getConstString(offset + 96, $outsrc_upri_typ);
	}

	/**
	 * Subcontracting unit price type 外注単価区分.<p>
	 *
	 */
	public void outsrc_upri_typ(String value) {
		setConstString(offset + 96, $outsrc_upri_typ, value);
	}


	public mcframe.clientMAUB.MAUBP5060.UpriR trd_cur_proc_upri_p(){
		return (mcframe.clientMAUB.MAUBP5060.UpriR) getConstInnerRow(offset + 97, $trd_cur_proc_upri_p);
	}
	
	public void trd_cur_proc_upri_p(mcframe.clientMAUB.MAUBP5060.UpriR row){
		setConstInnerRow(offset + 97, $trd_cur_proc_upri_p, row);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR trd_cur_proc_amt_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 98, $trd_cur_proc_amt_p);
	}
	
	public void trd_cur_proc_amt_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 98, $trd_cur_proc_amt_p, row);
	}


	public mcframe.clientMAUB.MAUBP5060.UpriR trd_cur_onr_prov_upri_p(){
		return (mcframe.clientMAUB.MAUBP5060.UpriR) getConstInnerRow(offset + 99, $trd_cur_onr_prov_upri_p);
	}
	
	public void trd_cur_onr_prov_upri_p(mcframe.clientMAUB.MAUBP5060.UpriR row){
		setConstInnerRow(offset + 99, $trd_cur_onr_prov_upri_p, row);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR trd_cur_onr_prov_amt_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 100, $trd_cur_onr_prov_amt_p);
	}
	
	public void trd_cur_onr_prov_amt_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 100, $trd_cur_onr_prov_amt_p, row);
	}


	/**
	 * (Before change) Unit price (Transaction currency) 変更前取引通貨単価.<p>
	 *
	 */
	public MCNumber old_trd_cur_upri() {
		return getConstNumber(offset + 101, $old_trd_cur_upri);
	}

	/**
	 * (Before change) Unit price (Transaction currency) 変更前取引通貨単価.<p>
	 *
	 */
	public void old_trd_cur_upri(MCNumber value) {
		setConstNumber(offset + 101, $old_trd_cur_upri, value);
	}

	/**
	 * (Before change) Unit price (Transaction currency) 変更前取引通貨単価.<p>
	 *
	 */
	public void old_trd_cur_upri(int value) {
		setConstNumber(offset + 101, $old_trd_cur_upri, value);
	}

	/**
	 * (Before change) Unit price (Transaction currency) 変更前取引通貨単価.<p>
	 *
	 */
	public void old_trd_cur_upri(long value) {
		setConstNumber(offset + 101, $old_trd_cur_upri, value);
	}

	/**
	 * (Before change) Unit price (Transaction currency) 変更前取引通貨単価.<p>
	 *
	 */
	public void old_trd_cur_upri(float value) {
		setConstNumber(offset + 101, $old_trd_cur_upri, value);
	}

	/**
	 * (Before change) Unit price (Transaction currency) 変更前取引通貨単価.<p>
	 *
	 */
	public void old_trd_cur_upri(double value) {
		setConstNumber(offset + 101, $old_trd_cur_upri, value);
	}


	/**
	 * (Before change) Subcontracting unit price (Transaction currency) 変更前取引通貨加工単価.<p>
	 *
	 */
	public MCNumber old_trd_cur_proc_upri() {
		return getConstNumber(offset + 102, $old_trd_cur_proc_upri);
	}

	/**
	 * (Before change) Subcontracting unit price (Transaction currency) 変更前取引通貨加工単価.<p>
	 *
	 */
	public void old_trd_cur_proc_upri(MCNumber value) {
		setConstNumber(offset + 102, $old_trd_cur_proc_upri, value);
	}

	/**
	 * (Before change) Subcontracting unit price (Transaction currency) 変更前取引通貨加工単価.<p>
	 *
	 */
	public void old_trd_cur_proc_upri(int value) {
		setConstNumber(offset + 102, $old_trd_cur_proc_upri, value);
	}

	/**
	 * (Before change) Subcontracting unit price (Transaction currency) 変更前取引通貨加工単価.<p>
	 *
	 */
	public void old_trd_cur_proc_upri(long value) {
		setConstNumber(offset + 102, $old_trd_cur_proc_upri, value);
	}

	/**
	 * (Before change) Subcontracting unit price (Transaction currency) 変更前取引通貨加工単価.<p>
	 *
	 */
	public void old_trd_cur_proc_upri(float value) {
		setConstNumber(offset + 102, $old_trd_cur_proc_upri, value);
	}

	/**
	 * (Before change) Subcontracting unit price (Transaction currency) 変更前取引通貨加工単価.<p>
	 *
	 */
	public void old_trd_cur_proc_upri(double value) {
		setConstNumber(offset + 102, $old_trd_cur_proc_upri, value);
	}


	/**
	 * (Before change) Chargeable supply unit price (Transaction currency) 変更前取引通貨有償支給単価.<p>
	 *
	 */
	public MCNumber old_trd_cur_onr_prov_upri() {
		return getConstNumber(offset + 103, $old_trd_cur_onr_prov_upri);
	}

	/**
	 * (Before change) Chargeable supply unit price (Transaction currency) 変更前取引通貨有償支給単価.<p>
	 *
	 */
	public void old_trd_cur_onr_prov_upri(MCNumber value) {
		setConstNumber(offset + 103, $old_trd_cur_onr_prov_upri, value);
	}

	/**
	 * (Before change) Chargeable supply unit price (Transaction currency) 変更前取引通貨有償支給単価.<p>
	 *
	 */
	public void old_trd_cur_onr_prov_upri(int value) {
		setConstNumber(offset + 103, $old_trd_cur_onr_prov_upri, value);
	}

	/**
	 * (Before change) Chargeable supply unit price (Transaction currency) 変更前取引通貨有償支給単価.<p>
	 *
	 */
	public void old_trd_cur_onr_prov_upri(long value) {
		setConstNumber(offset + 103, $old_trd_cur_onr_prov_upri, value);
	}

	/**
	 * (Before change) Chargeable supply unit price (Transaction currency) 変更前取引通貨有償支給単価.<p>
	 *
	 */
	public void old_trd_cur_onr_prov_upri(float value) {
		setConstNumber(offset + 103, $old_trd_cur_onr_prov_upri, value);
	}

	/**
	 * (Before change) Chargeable supply unit price (Transaction currency) 変更前取引通貨有償支給単価.<p>
	 *
	 */
	public void old_trd_cur_onr_prov_upri(double value) {
		setConstNumber(offset + 103, $old_trd_cur_onr_prov_upri, value);
	}


	/**
	 * Temporary unit price before change 変更前仮単価.<p>
	 *
	 */
	public boolean old_interim_flg() {
		return getConstBoolean(offset + 104, $old_interim_flg);
	}

	/**
	 * Temporary unit price before change 変更前仮単価.<p>
	 *
	 */
	public void old_interim_flg(boolean value) {
		setConstBoolean(offset + 104, $old_interim_flg, value);
	}


	/**
	 * (Before change) Discount amount (Transaction currency) 変更前取引通貨値引額.<p>
	 *
	 */
	public MCNumber old_trd_cur_dscnt_amt() {
		return getConstNumber(offset + 105, $old_trd_cur_dscnt_amt);
	}

	/**
	 * (Before change) Discount amount (Transaction currency) 変更前取引通貨値引額.<p>
	 *
	 */
	public void old_trd_cur_dscnt_amt(MCNumber value) {
		setConstNumber(offset + 105, $old_trd_cur_dscnt_amt, value);
	}

	/**
	 * (Before change) Discount amount (Transaction currency) 変更前取引通貨値引額.<p>
	 *
	 */
	public void old_trd_cur_dscnt_amt(int value) {
		setConstNumber(offset + 105, $old_trd_cur_dscnt_amt, value);
	}

	/**
	 * (Before change) Discount amount (Transaction currency) 変更前取引通貨値引額.<p>
	 *
	 */
	public void old_trd_cur_dscnt_amt(long value) {
		setConstNumber(offset + 105, $old_trd_cur_dscnt_amt, value);
	}

	/**
	 * (Before change) Discount amount (Transaction currency) 変更前取引通貨値引額.<p>
	 *
	 */
	public void old_trd_cur_dscnt_amt(float value) {
		setConstNumber(offset + 105, $old_trd_cur_dscnt_amt, value);
	}

	/**
	 * (Before change) Discount amount (Transaction currency) 変更前取引通貨値引額.<p>
	 *
	 */
	public void old_trd_cur_dscnt_amt(double value) {
		setConstNumber(offset + 105, $old_trd_cur_dscnt_amt, value);
	}


	/**
	 * Discount reason before change 変更前値引理由.<p>
	 *
	 */
	public String old_dscnt_rsn_cd() {
		return getConstString(offset + 106, $old_dscnt_rsn_cd);
	}

	/**
	 * Discount reason before change 変更前値引理由.<p>
	 *
	 */
	public void old_dscnt_rsn_cd(String value) {
		setConstString(offset + 106, $old_dscnt_rsn_cd, value);
	}


	/**
	 * Discount reason name before change 変更前値引理由名.<p>
	 *
	 */
	public String old_dscnt_rsn_nm() {
		return getConstString(offset + 107, $old_dscnt_rsn_nm);
	}

	/**
	 * Discount reason name before change 変更前値引理由名.<p>
	 *
	 */
	public void old_dscnt_rsn_nm(String value) {
		setConstString(offset + 107, $old_dscnt_rsn_nm, value);
	}


	public mcframe.clientMAUB.MAUBP5060.UpriR base_cur_upri_p(){
		return (mcframe.clientMAUB.MAUBP5060.UpriR) getConstInnerRow(offset + 108, $base_cur_upri_p);
	}
	
	public void base_cur_upri_p(mcframe.clientMAUB.MAUBP5060.UpriR row){
		setConstInnerRow(offset + 108, $base_cur_upri_p, row);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR base_cur_dscnt_amt_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 109, $base_cur_dscnt_amt_p);
	}
	
	public void base_cur_dscnt_amt_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 109, $base_cur_dscnt_amt_p, row);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR base_cur_amt_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 110, $base_cur_amt_p);
	}
	
	public void base_cur_amt_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 110, $base_cur_amt_p, row);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR base_cur_tax_amt_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 111, $base_cur_tax_amt_p);
	}
	
	public void base_cur_tax_amt_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 111, $base_cur_tax_amt_p, row);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR base_cur_inc_tax_amt_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 112, $base_cur_inc_tax_amt_p);
	}
	
	public void base_cur_inc_tax_amt_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 112, $base_cur_inc_tax_amt_p, row);
	}


	public mcframe.clientMAUB.MAUBP5060.UpriR base_cur_proc_upri_p(){
		return (mcframe.clientMAUB.MAUBP5060.UpriR) getConstInnerRow(offset + 113, $base_cur_proc_upri_p);
	}
	
	public void base_cur_proc_upri_p(mcframe.clientMAUB.MAUBP5060.UpriR row){
		setConstInnerRow(offset + 113, $base_cur_proc_upri_p, row);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR base_cur_proc_amt_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 114, $base_cur_proc_amt_p);
	}
	
	public void base_cur_proc_amt_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 114, $base_cur_proc_amt_p, row);
	}


	public mcframe.clientMAUB.MAUBP5060.UpriR base_cur_onr_prov_upri_p(){
		return (mcframe.clientMAUB.MAUBP5060.UpriR) getConstInnerRow(offset + 115, $base_cur_onr_prov_upri_p);
	}
	
	public void base_cur_onr_prov_upri_p(mcframe.clientMAUB.MAUBP5060.UpriR row){
		setConstInnerRow(offset + 115, $base_cur_onr_prov_upri_p, row);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR base_cur_onr_prov_amt_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 116, $base_cur_onr_prov_amt_p);
	}
	
	public void base_cur_onr_prov_amt_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 116, $base_cur_onr_prov_amt_p, row);
	}


	public mcframe.clientMAUB.MAUBP5060.UpriR ptax_cur_upri_p(){
		return (mcframe.clientMAUB.MAUBP5060.UpriR) getConstInnerRow(offset + 117, $ptax_cur_upri_p);
	}
	
	public void ptax_cur_upri_p(mcframe.clientMAUB.MAUBP5060.UpriR row){
		setConstInnerRow(offset + 117, $ptax_cur_upri_p, row);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR ptax_cur_dscnt_amt_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 118, $ptax_cur_dscnt_amt_p);
	}
	
	public void ptax_cur_dscnt_amt_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 118, $ptax_cur_dscnt_amt_p, row);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR ptax_cur_amt_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 119, $ptax_cur_amt_p);
	}
	
	public void ptax_cur_amt_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 119, $ptax_cur_amt_p, row);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR ptax_cur_tax_amt_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 120, $ptax_cur_tax_amt_p);
	}
	
	public void ptax_cur_tax_amt_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 120, $ptax_cur_tax_amt_p, row);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR ptax_cur_inc_tax_amt_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 121, $ptax_cur_inc_tax_amt_p);
	}
	
	public void ptax_cur_inc_tax_amt_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 121, $ptax_cur_inc_tax_amt_p, row);
	}


	public mcframe.clientMAUB.MAUBP5060.UpriR ptax_cur_proc_upri_p(){
		return (mcframe.clientMAUB.MAUBP5060.UpriR) getConstInnerRow(offset + 122, $ptax_cur_proc_upri_p);
	}
	
	public void ptax_cur_proc_upri_p(mcframe.clientMAUB.MAUBP5060.UpriR row){
		setConstInnerRow(offset + 122, $ptax_cur_proc_upri_p, row);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR ptax_cur_proc_amt_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 123, $ptax_cur_proc_amt_p);
	}
	
	public void ptax_cur_proc_amt_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 123, $ptax_cur_proc_amt_p, row);
	}


	public mcframe.clientMAUB.MAUBP5060.UpriR ptax_cur_onr_prov_upri_p(){
		return (mcframe.clientMAUB.MAUBP5060.UpriR) getConstInnerRow(offset + 124, $ptax_cur_onr_prov_upri_p);
	}
	
	public void ptax_cur_onr_prov_upri_p(mcframe.clientMAUB.MAUBP5060.UpriR row){
		setConstInnerRow(offset + 124, $ptax_cur_onr_prov_upri_p, row);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR ptax_cur_onr_prov_amt_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 125, $ptax_cur_onr_prov_amt_p);
	}
	
	public void ptax_cur_onr_prov_amt_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 125, $ptax_cur_onr_prov_amt_p, row);
	}


	/**
	 * Withholding tax rate 源泉税率.<p>
	 *
	 */
	public MCNumber wtax_rate() {
		return getConstNumber(offset + 126, $wtax_rate);
	}

	/**
	 * Withholding tax rate 源泉税率.<p>
	 *
	 */
	public void wtax_rate(MCNumber value) {
		setConstNumber(offset + 126, $wtax_rate, value);
	}

	/**
	 * Withholding tax rate 源泉税率.<p>
	 *
	 */
	public void wtax_rate(int value) {
		setConstNumber(offset + 126, $wtax_rate, value);
	}

	/**
	 * Withholding tax rate 源泉税率.<p>
	 *
	 */
	public void wtax_rate(long value) {
		setConstNumber(offset + 126, $wtax_rate, value);
	}

	/**
	 * Withholding tax rate 源泉税率.<p>
	 *
	 */
	public void wtax_rate(float value) {
		setConstNumber(offset + 126, $wtax_rate, value);
	}

	/**
	 * Withholding tax rate 源泉税率.<p>
	 *
	 */
	public void wtax_rate(double value) {
		setConstNumber(offset + 126, $wtax_rate, value);
	}


	public mcframe.clientMAUB.MAUBP5050.AmtR wtax_amt_p(){
		return (mcframe.clientMAUB.MAUBP5050.AmtR) getConstInnerRow(offset + 127, $wtax_amt_p);
	}
	
	public void wtax_amt_p(mcframe.clientMAUB.MAUBP5050.AmtR row){
		setConstInnerRow(offset + 127, $wtax_amt_p, row);
	}


	/**
	 * Mfg. location cd. 製造場所ＣＤ.<p>
	 *
	 */
	public String mfg_loc_cd() {
		return getConstString(offset + 128, $mfg_loc_cd);
	}

	/**
	 * Mfg. location cd. 製造場所ＣＤ.<p>
	 *
	 */
	public void mfg_loc_cd(String value) {
		setConstString(offset + 128, $mfg_loc_cd, value);
	}


	/**
	 * Mfg. location name 製造場所名.<p>
	 *
	 */
	public String mfg_loc_nm() {
		return getConstString(offset + 129, $mfg_loc_nm);
	}

	/**
	 * Mfg. location name 製造場所名.<p>
	 *
	 */
	public void mfg_loc_nm(String value) {
		setConstString(offset + 129, $mfg_loc_nm, value);
	}


	/**
	 * BOM pattern 構成パタン.<p>
	 *
	 */
	public String bom_ptn() {
		return getConstString(offset + 130, $bom_ptn);
	}

	/**
	 * BOM pattern 構成パタン.<p>
	 *
	 */
	public void bom_ptn(String value) {
		setConstString(offset + 130, $bom_ptn, value);
	}


	/**
	 * Subcontracting 外注.<p>
	 *
	 */
	public boolean outsrc_flg() {
		return getConstBoolean(offset + 131, $outsrc_flg);
	}

	/**
	 * Subcontracting 外注.<p>
	 *
	 */
	public void outsrc_flg(boolean value) {
		setConstBoolean(offset + 131, $outsrc_flg, value);
	}


	/**
	 * Mfg. ordered 製造指図済.<p>
	 *
	 */
	public boolean mfg_inst_flg() {
		return getConstBoolean(offset + 132, $mfg_inst_flg);
	}

	/**
	 * Mfg. ordered 製造指図済.<p>
	 *
	 */
	public void mfg_inst_flg(boolean value) {
		setConstBoolean(offset + 132, $mfg_inst_flg, value);
	}


	/**
	 * Subcontracting item order No. 外注品目オーダＮＯ.<p>
	 *
	 */
	public String outsrc_itm_ord_no() {
		return getConstString(offset + 133, $outsrc_itm_ord_no);
	}

	/**
	 * Subcontracting item order No. 外注品目オーダＮＯ.<p>
	 *
	 */
	public void outsrc_itm_ord_no(String value) {
		setConstString(offset + 133, $outsrc_itm_ord_no, value);
	}


	/**
	 * Purchase reason cd. 仕入理由ＣＤ.<p>
	 *
	 */
	public String purc_rsn_cd() {
		return getConstString(offset + 134, $purc_rsn_cd);
	}

	/**
	 * Purchase reason cd. 仕入理由ＣＤ.<p>
	 *
	 */
	public void purc_rsn_cd(String value) {
		setConstString(offset + 134, $purc_rsn_cd, value);
	}


	/**
	 * Purchase reason name 仕入理由名.<p>
	 *
	 */
	public String purc_rsn_nm() {
		return getConstString(offset + 135, $purc_rsn_nm);
	}

	/**
	 * Purchase reason name 仕入理由名.<p>
	 *
	 */
	public void purc_rsn_nm(String value) {
		setConstString(offset + 135, $purc_rsn_nm, value);
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
	 * Expense purchase only 経費購買のみ.<p>
	 *
	 */
	public boolean not_xpns_purc_flg() {
		return getConstBoolean(offset + 137, $not_xpns_purc_flg);
	}

	/**
	 * Expense purchase only 経費購買のみ.<p>
	 *
	 */
	public void not_xpns_purc_flg(boolean value) {
		setConstBoolean(offset + 137, $not_xpns_purc_flg, value);
	}


	public mcframe.clientMSUB.MSUBP5020.SnoWrkNoR sno_wrk_no_p(){
		return (mcframe.clientMSUB.MSUBP5020.SnoWrkNoR) getConstInnerRow(offset + 138, $sno_wrk_no_p);
	}
	
	public void sno_wrk_no_p(mcframe.clientMSUB.MSUBP5020.SnoWrkNoR row){
		setConstInnerRow(offset + 138, $sno_wrk_no_p, row);
	}


	public mcframe.clientMSUB.MSUBP5040.BdItemR bditm_p(){
		return (mcframe.clientMSUB.MSUBP5040.BdItemR) getConstInnerRow(offset + 139, $bditm_p);
	}
	
	public void bditm_p(mcframe.clientMSUB.MSUBP5040.BdItemR row){
		setConstInnerRow(offset + 139, $bditm_p, row);
	}


	/**
	 * Charged lot management type 負担ロット管理区分.<p>
	 *
	 */
	public String bd_lot_mng_typ() {
		return getConstString(offset + 140, $bd_lot_mng_typ);
	}

	/**
	 * Charged lot management type 負担ロット管理区分.<p>
	 *
	 */
	public void bd_lot_mng_typ(String value) {
		setConstString(offset + 140, $bd_lot_mng_typ, value);
	}


	/**
	 * Charged sublot management type 負担サブロット管理区分.<p>
	 *
	 */
	public String bd_sublot_mng_typ() {
		return getConstString(offset + 141, $bd_sublot_mng_typ);
	}

	/**
	 * Charged sublot management type 負担サブロット管理区分.<p>
	 *
	 */
	public void bd_sublot_mng_typ(String value) {
		setConstString(offset + 141, $bd_sublot_mng_typ, value);
	}


	/**
	 * Charged lot numbering type 負担ロットＮＯ発番区分.<p>
	 *
	 */
	public String bd_lot_no_typ() {
		return getConstString(offset + 142, $bd_lot_no_typ);
	}

	/**
	 * Charged lot numbering type 負担ロットＮＯ発番区分.<p>
	 *
	 */
	public void bd_lot_no_typ(String value) {
		setConstString(offset + 142, $bd_lot_no_typ, value);
	}


	/**
	 * Charged sublot numbering type 負担サブロットＮＯ発番区分.<p>
	 *
	 */
	public String bd_sublot_no_typ() {
		return getConstString(offset + 143, $bd_sublot_no_typ);
	}

	/**
	 * Charged sublot numbering type 負担サブロットＮＯ発番区分.<p>
	 *
	 */
	public void bd_sublot_no_typ(String value) {
		setConstString(offset + 143, $bd_sublot_no_typ, value);
	}


	/**
	 * Charged SEIBAN No. 1 management type 負担手配ＮＯ１管理区分.<p>
	 *
	 */
	public String bd_sno1_mng_typ() {
		return getConstString(offset + 144, $bd_sno1_mng_typ);
	}

	/**
	 * Charged SEIBAN No. 1 management type 負担手配ＮＯ１管理区分.<p>
	 *
	 */
	public void bd_sno1_mng_typ(String value) {
		setConstString(offset + 144, $bd_sno1_mng_typ, value);
	}


	/**
	 * Charged SEIBAN No. 2 management type 負担手配ＮＯ２管理区分.<p>
	 *
	 */
	public String bd_sno2_mng_typ() {
		return getConstString(offset + 145, $bd_sno2_mng_typ);
	}

	/**
	 * Charged SEIBAN No. 2 management type 負担手配ＮＯ２管理区分.<p>
	 *
	 */
	public void bd_sno2_mng_typ(String value) {
		setConstString(offset + 145, $bd_sno2_mng_typ, value);
	}


	/**
	 * Charged SEIBAN No. 3 management type 負担手配ＮＯ３管理区分.<p>
	 *
	 */
	public String bd_sno3_mng_typ() {
		return getConstString(offset + 146, $bd_sno3_mng_typ);
	}

	/**
	 * Charged SEIBAN No. 3 management type 負担手配ＮＯ３管理区分.<p>
	 *
	 */
	public void bd_sno3_mng_typ(String value) {
		setConstString(offset + 146, $bd_sno3_mng_typ, value);
	}


	/**
	 * Charged SEIBAN No. 4 management type 負担手配ＮＯ４管理区分.<p>
	 *
	 */
	public String bd_sno4_mng_typ() {
		return getConstString(offset + 147, $bd_sno4_mng_typ);
	}

	/**
	 * Charged SEIBAN No. 4 management type 負担手配ＮＯ４管理区分.<p>
	 *
	 */
	public void bd_sno4_mng_typ(String value) {
		setConstString(offset + 147, $bd_sno4_mng_typ, value);
	}


	/**
	 * Unpegged 紐切れ.<p>
	 *
	 */
	public boolean rqst_can_flg() {
		return getConstBoolean(offset + 148, $rqst_can_flg);
	}

	/**
	 * Unpegged 紐切れ.<p>
	 *
	 */
	public void rqst_can_flg(boolean value) {
		setConstBoolean(offset + 148, $rqst_can_flg, value);
	}


	/**
	 * PO contact remarks 発注連絡備考.<p>
	 *
	 */
	public String po_cnt_rmrks() {
		return getConstString(offset + 149, $po_cnt_rmrks);
	}

	/**
	 * PO contact remarks 発注連絡備考.<p>
	 *
	 */
	public void po_cnt_rmrks(String value) {
		setConstString(offset + 149, $po_cnt_rmrks, value);
	}


	/**
	 * Internal details remarks 内部明細備考.<p>
	 *
	 */
	public String intr_rmrks() {
		return getConstString(offset + 150, $intr_rmrks);
	}

	/**
	 * Internal details remarks 内部明細備考.<p>
	 *
	 */
	public void intr_rmrks(String value) {
		setConstString(offset + 150, $intr_rmrks, value);
	}


	/**
	 * Transaction details remarks 取引明細備考.<p>
	 *
	 */
	public String trd_d_rmrks() {
		return getConstString(offset + 151, $trd_d_rmrks);
	}

	/**
	 * Transaction details remarks 取引明細備考.<p>
	 *
	 */
	public void trd_d_rmrks(String value) {
		setConstString(offset + 151, $trd_d_rmrks, value);
	}


	/**
	 * PO sheet details remarks 注文書明細備考.<p>
	 *
	 */
	public String po_print_d_rmrks() {
		return getConstString(offset + 152, $po_print_d_rmrks);
	}

	/**
	 * PO sheet details remarks 注文書明細備考.<p>
	 *
	 */
	public void po_print_d_rmrks(String value) {
		setConstString(offset + 152, $po_print_d_rmrks, value);
	}


	/**
	 * Delivery note details remarks 納品書明細備考.<p>
	 *
	 */
	public String dlv_slip_d_rmrks() {
		return getConstString(offset + 153, $dlv_slip_d_rmrks);
	}

	/**
	 * Delivery note details remarks 納品書明細備考.<p>
	 *
	 */
	public void dlv_slip_d_rmrks(String value) {
		setConstString(offset + 153, $dlv_slip_d_rmrks, value);
	}


	/**
	 * Receipt contact remarks 入荷連絡備考.<p>
	 *
	 */
	public String arr_cnt_rmrks() {
		return getConstString(offset + 154, $arr_cnt_rmrks);
	}

	/**
	 * Receipt contact remarks 入荷連絡備考.<p>
	 *
	 */
	public void arr_cnt_rmrks(String value) {
		setConstString(offset + 154, $arr_cnt_rmrks, value);
	}


	/**
	 * Details spare 1 明細予備１.<p>
	 *
	 */
	public String sub_char1() {
		return getConstString(offset + 155, $sub_char1);
	}

	/**
	 * Details spare 1 明細予備１.<p>
	 *
	 */
	public void sub_char1(String value) {
		setConstString(offset + 155, $sub_char1, value);
	}


	/**
	 * Details spare 2 明細予備２.<p>
	 *
	 */
	public String sub_char2() {
		return getConstString(offset + 156, $sub_char2);
	}

	/**
	 * Details spare 2 明細予備２.<p>
	 *
	 */
	public void sub_char2(String value) {
		setConstString(offset + 156, $sub_char2, value);
	}


	/**
	 * Details spare 3 明細予備３.<p>
	 *
	 */
	public String sub_char3() {
		return getConstString(offset + 157, $sub_char3);
	}

	/**
	 * Details spare 3 明細予備３.<p>
	 *
	 */
	public void sub_char3(String value) {
		setConstString(offset + 157, $sub_char3, value);
	}


	/**
	 * EDI details spare character string 1 ＥＤＩ明細予備文字列１.<p>
	 *
	 */
	public String edi_sub_d_char1() {
		return getConstString(offset + 158, $edi_sub_d_char1);
	}

	/**
	 * EDI details spare character string 1 ＥＤＩ明細予備文字列１.<p>
	 *
	 */
	public void edi_sub_d_char1(String value) {
		setConstString(offset + 158, $edi_sub_d_char1, value);
	}


	/**
	 * EDI details spare character string 2 ＥＤＩ明細予備文字列２.<p>
	 *
	 */
	public String edi_sub_d_char2() {
		return getConstString(offset + 159, $edi_sub_d_char2);
	}

	/**
	 * EDI details spare character string 2 ＥＤＩ明細予備文字列２.<p>
	 *
	 */
	public void edi_sub_d_char2(String value) {
		setConstString(offset + 159, $edi_sub_d_char2, value);
	}


	/**
	 * EDI details spare character string 3 ＥＤＩ明細予備文字列３.<p>
	 *
	 */
	public String edi_sub_d_char3() {
		return getConstString(offset + 160, $edi_sub_d_char3);
	}

	/**
	 * EDI details spare character string 3 ＥＤＩ明細予備文字列３.<p>
	 *
	 */
	public void edi_sub_d_char3(String value) {
		setConstString(offset + 160, $edi_sub_d_char3, value);
	}


	/**
	 * EDI details spare character string 4 ＥＤＩ明細予備文字列４.<p>
	 *
	 */
	public String edi_sub_d_char4() {
		return getConstString(offset + 161, $edi_sub_d_char4);
	}

	/**
	 * EDI details spare character string 4 ＥＤＩ明細予備文字列４.<p>
	 *
	 */
	public void edi_sub_d_char4(String value) {
		setConstString(offset + 161, $edi_sub_d_char4, value);
	}


	/**
	 * EDI details spare character string 5 ＥＤＩ明細予備文字列５.<p>
	 *
	 */
	public String edi_sub_d_char5() {
		return getConstString(offset + 162, $edi_sub_d_char5);
	}

	/**
	 * EDI details spare character string 5 ＥＤＩ明細予備文字列５.<p>
	 *
	 */
	public void edi_sub_d_char5(String value) {
		setConstString(offset + 162, $edi_sub_d_char5, value);
	}


	/**
	 * EDI details spare numerical value ＥＤＩ明細予備数値.<p>
	 *
	 */
	public MCNumber edi_sub_d_num1() {
		return getConstNumber(offset + 163, $edi_sub_d_num1);
	}

	/**
	 * EDI details spare numerical value ＥＤＩ明細予備数値.<p>
	 *
	 */
	public void edi_sub_d_num1(MCNumber value) {
		setConstNumber(offset + 163, $edi_sub_d_num1, value);
	}

	/**
	 * EDI details spare numerical value ＥＤＩ明細予備数値.<p>
	 *
	 */
	public void edi_sub_d_num1(int value) {
		setConstNumber(offset + 163, $edi_sub_d_num1, value);
	}

	/**
	 * EDI details spare numerical value ＥＤＩ明細予備数値.<p>
	 *
	 */
	public void edi_sub_d_num1(long value) {
		setConstNumber(offset + 163, $edi_sub_d_num1, value);
	}

	/**
	 * EDI details spare numerical value ＥＤＩ明細予備数値.<p>
	 *
	 */
	public void edi_sub_d_num1(float value) {
		setConstNumber(offset + 163, $edi_sub_d_num1, value);
	}

	/**
	 * EDI details spare numerical value ＥＤＩ明細予備数値.<p>
	 *
	 */
	public void edi_sub_d_num1(double value) {
		setConstNumber(offset + 163, $edi_sub_d_num1, value);
	}


	/**
	 * EDI details spare date ＥＤＩ明細予備日付.<p>
	 *
	 */
	public MCDate edi_sub_d_dt1() {
		return getConstDate(offset + 164, $edi_sub_d_dt1);
	}

	/**
	 * EDI details spare date ＥＤＩ明細予備日付.<p>
	 *
	 */
	public void edi_sub_d_dt1(MCDate value) {
		setConstDate(offset + 164, $edi_sub_d_dt1, value);
	}


	/**
	 * External PO details No. 外部発注明細ＮＯ.<p>
	 *
	 */
	public String ext_po_d_no() {
		return getConstString(offset + 165, $ext_po_d_no);
	}

	/**
	 * External PO details No. 外部発注明細ＮＯ.<p>
	 *
	 */
	public void ext_po_d_no(String value) {
		setConstString(offset + 165, $ext_po_d_no, value);
	}


	/**
	 * Sales order No. 受注ＮＯ.<p>
	 *
	 */
	public String slo_no() {
		return getConstString(offset + 166, $slo_no);
	}

	/**
	 * Sales order No. 受注ＮＯ.<p>
	 *
	 */
	public void slo_no(String value) {
		setConstString(offset + 166, $slo_no, value);
	}


	/**
	 * Sales order details No. 受注明細ＮＯ.<p>
	 *
	 */
	public String slo_d_no() {
		return getConstString(offset + 167, $slo_d_no);
	}

	/**
	 * Sales order details No. 受注明細ＮＯ.<p>
	 *
	 */
	public void slo_d_no(String value) {
		setConstString(offset + 167, $slo_d_no, value);
	}


	/**
	 * Delivery note No. 納品書ＮＯ.<p>
	 *
	 */
	public String dlv_slip_no() {
		return getConstString(offset + 168, $dlv_slip_no);
	}

	/**
	 * Delivery note No. 納品書ＮＯ.<p>
	 *
	 */
	public void dlv_slip_no(String value) {
		setConstString(offset + 168, $dlv_slip_no, value);
	}


	/**
	 * Delivery note sequence number 納品書連番.<p>
	 *
	 */
	public MCNumber dlv_slip_seq() {
		return getConstNumber(offset + 169, $dlv_slip_seq);
	}

	/**
	 * Delivery note sequence number 納品書連番.<p>
	 *
	 */
	public void dlv_slip_seq(MCNumber value) {
		setConstNumber(offset + 169, $dlv_slip_seq, value);
	}

	/**
	 * Delivery note sequence number 納品書連番.<p>
	 *
	 */
	public void dlv_slip_seq(int value) {
		setConstNumber(offset + 169, $dlv_slip_seq, value);
	}

	/**
	 * Delivery note sequence number 納品書連番.<p>
	 *
	 */
	public void dlv_slip_seq(long value) {
		setConstNumber(offset + 169, $dlv_slip_seq, value);
	}

	/**
	 * Delivery note sequence number 納品書連番.<p>
	 *
	 */
	public void dlv_slip_seq(float value) {
		setConstNumber(offset + 169, $dlv_slip_seq, value);
	}

	/**
	 * Delivery note sequence number 納品書連番.<p>
	 *
	 */
	public void dlv_slip_seq(double value) {
		setConstNumber(offset + 169, $dlv_slip_seq, value);
	}


	/**
	 * Not for delivery note 納品書対象外.<p>
	 *
	 */
	public boolean dlv_slip_invalid_flg() {
		return getConstBoolean(offset + 170, $dlv_slip_invalid_flg);
	}

	/**
	 * Not for delivery note 納品書対象外.<p>
	 *
	 */
	public void dlv_slip_invalid_flg(boolean value) {
		setConstBoolean(offset + 170, $dlv_slip_invalid_flg, value);
	}


	/**
	 * Direct delivery delivery note No. 仕入直送納品書ＮＯ.<p>
	 *
	 */
	public String purc_ddlv_dlv_slip_no() {
		return getConstString(offset + 171, $purc_ddlv_dlv_slip_no);
	}

	/**
	 * Direct delivery delivery note No. 仕入直送納品書ＮＯ.<p>
	 *
	 */
	public void purc_ddlv_dlv_slip_no(String value) {
		setConstString(offset + 171, $purc_ddlv_dlv_slip_no, value);
	}


	/**
	 * Delivery note management No. 納品書管理ＮＯ.<p>
	 *
	 */
	public String dlv_slip_mng_no() {
		return getConstString(offset + 172, $dlv_slip_mng_no);
	}

	/**
	 * Delivery note management No. 納品書管理ＮＯ.<p>
	 *
	 */
	public void dlv_slip_mng_no(String value) {
		setConstString(offset + 172, $dlv_slip_mng_no, value);
	}


	/**
	 * Delivery note management sequence number 納品書管理連番.<p>
	 *
	 */
	public MCNumber dlv_slip_mng_seq() {
		return getConstNumber(offset + 173, $dlv_slip_mng_seq);
	}

	/**
	 * Delivery note management sequence number 納品書管理連番.<p>
	 *
	 */
	public void dlv_slip_mng_seq(MCNumber value) {
		setConstNumber(offset + 173, $dlv_slip_mng_seq, value);
	}

	/**
	 * Delivery note management sequence number 納品書管理連番.<p>
	 *
	 */
	public void dlv_slip_mng_seq(int value) {
		setConstNumber(offset + 173, $dlv_slip_mng_seq, value);
	}

	/**
	 * Delivery note management sequence number 納品書管理連番.<p>
	 *
	 */
	public void dlv_slip_mng_seq(long value) {
		setConstNumber(offset + 173, $dlv_slip_mng_seq, value);
	}

	/**
	 * Delivery note management sequence number 納品書管理連番.<p>
	 *
	 */
	public void dlv_slip_mng_seq(float value) {
		setConstNumber(offset + 173, $dlv_slip_mng_seq, value);
	}

	/**
	 * Delivery note management sequence number 納品書管理連番.<p>
	 *
	 */
	public void dlv_slip_mng_seq(double value) {
		setConstNumber(offset + 173, $dlv_slip_mng_seq, value);
	}


	/**
	 * PO schedule creating source type 発注予定作成元区分.<p>
	 *
	 */
	public String po_schd_src_typ() {
		return getConstString(offset + 174, $po_schd_src_typ);
	}

	/**
	 * PO schedule creating source type 発注予定作成元区分.<p>
	 *
	 */
	public void po_schd_src_typ(String value) {
		setConstString(offset + 174, $po_schd_src_typ, value);
	}


	/**
	 * PO schedule creating source type name 発注予定作成元区分名.<p>
	 *
	 */
	public String po_schd_src_typ_nm() {
		return getConstString(offset + 175, $po_schd_src_typ_nm);
	}

	/**
	 * PO schedule creating source type name 発注予定作成元区分名.<p>
	 *
	 */
	public void po_schd_src_typ_nm(String value) {
		setConstString(offset + 175, $po_schd_src_typ_nm, value);
	}


	/**
	 * PO schedule creating source No. 発注予定作成元ＮＯ.<p>
	 *
	 */
	public String po_schd_src_no() {
		return getConstString(offset + 176, $po_schd_src_no);
	}

	/**
	 * PO schedule creating source No. 発注予定作成元ＮＯ.<p>
	 *
	 */
	public void po_schd_src_no(String value) {
		setConstString(offset + 176, $po_schd_src_no, value);
	}


	/**
	 * Requesting PIC cd. 依頼元担当者ＣＤ.<p>
	 *
	 */
	public String rqst_fr_usr_cd() {
		return getConstString(offset + 177, $rqst_fr_usr_cd);
	}

	/**
	 * Requesting PIC cd. 依頼元担当者ＣＤ.<p>
	 *
	 */
	public void rqst_fr_usr_cd(String value) {
		setConstString(offset + 177, $rqst_fr_usr_cd, value);
	}


	/**
	 * Requesting PIC name 依頼元担当者名.<p>
	 *
	 */
	public String rqst_fr_usr_nm() {
		return getConstString(offset + 178, $rqst_fr_usr_nm);
	}

	/**
	 * Requesting PIC name 依頼元担当者名.<p>
	 *
	 */
	public void rqst_fr_usr_nm(String value) {
		setConstString(offset + 178, $rqst_fr_usr_nm, value);
	}


	/**
	 * Requesting dept. cd. 依頼元部門ＣＤ.<p>
	 *
	 */
	public String rqst_fr_dpt_cd() {
		return getConstString(offset + 179, $rqst_fr_dpt_cd);
	}

	/**
	 * Requesting dept. cd. 依頼元部門ＣＤ.<p>
	 *
	 */
	public void rqst_fr_dpt_cd(String value) {
		setConstString(offset + 179, $rqst_fr_dpt_cd, value);
	}


	/**
	 * Requesting dept. name 依頼元部門名.<p>
	 *
	 */
	public String rqst_fr_dpt_nm() {
		return getConstString(offset + 180, $rqst_fr_dpt_nm);
	}

	/**
	 * Requesting dept. name 依頼元部門名.<p>
	 *
	 */
	public void rqst_fr_dpt_nm(String value) {
		setConstString(offset + 180, $rqst_fr_dpt_nm, value);
	}


	/**
	 * Aggregation まとめ.<p>
	 *
	 */
	public boolean bndl_flg() {
		return getConstBoolean(offset + 181, $bndl_flg);
	}

	/**
	 * Aggregation まとめ.<p>
	 *
	 */
	public void bndl_flg(boolean value) {
		setConstBoolean(offset + 181, $bndl_flg, value);
	}


	/**
	 * Request source sales order 依頼元受注.<p>
	 *
	 */
	public boolean rqst_slo_flg() {
		return getConstBoolean(offset + 182, $rqst_slo_flg);
	}

	/**
	 * Request source sales order 依頼元受注.<p>
	 *
	 */
	public void rqst_slo_flg(boolean value) {
		setConstBoolean(offset + 182, $rqst_slo_flg, value);
	}


	/**
	 * PO schedule No. 発注予定ＮＯ.<p>
	 *
	 */
	public String po_schd_no() {
		return getConstString(offset + 183, $po_schd_no);
	}

	/**
	 * PO schedule No. 発注予定ＮＯ.<p>
	 *
	 */
	public void po_schd_no(String value) {
		setConstString(offset + 183, $po_schd_no, value);
	}


	/**
	 * PO details No. 発注明細ＮＯ.<p>
	 *
	 */
	public String po_d_no() {
		return getConstString(offset + 184, $po_d_no);
	}

	/**
	 * PO details No. 発注明細ＮＯ.<p>
	 *
	 */
	public void po_d_no(String value) {
		setConstString(offset + 184, $po_d_no, value);
	}


	/**
	 * Display order 表示順.<p>
	 *
	 */
	public MCNumber disp_seq() {
		return getConstNumber(offset + 185, $disp_seq);
	}

	/**
	 * Display order 表示順.<p>
	 *
	 */
	public void disp_seq(MCNumber value) {
		setConstNumber(offset + 185, $disp_seq, value);
	}

	/**
	 * Display order 表示順.<p>
	 *
	 */
	public void disp_seq(int value) {
		setConstNumber(offset + 185, $disp_seq, value);
	}

	/**
	 * Display order 表示順.<p>
	 *
	 */
	public void disp_seq(long value) {
		setConstNumber(offset + 185, $disp_seq, value);
	}

	/**
	 * Display order 表示順.<p>
	 *
	 */
	public void disp_seq(float value) {
		setConstNumber(offset + 185, $disp_seq, value);
	}

	/**
	 * Display order 表示順.<p>
	 *
	 */
	public void disp_seq(double value) {
		setConstNumber(offset + 185, $disp_seq, value);
	}


	/**
	 * Received 入荷済.<p>
	 *
	 */
	public boolean arr_flg() {
		return getConstBoolean(offset + 186, $arr_flg);
	}

	/**
	 * Received 入荷済.<p>
	 *
	 */
	public void arr_flg(boolean value) {
		setConstBoolean(offset + 186, $arr_flg, value);
	}


	/**
	 * Purchased 仕入済.<p>
	 *
	 */
	public boolean purc_flg() {
		return getConstBoolean(offset + 187, $purc_flg);
	}

	/**
	 * Purchased 仕入済.<p>
	 *
	 */
	public void purc_flg(boolean value) {
		setConstBoolean(offset + 187, $purc_flg, value);
	}


	/**
	 * Purchase invoice entered 受領インボイス登録済.<p>
	 *
	 */
	public boolean rcpt_iv_flg() {
		return getConstBoolean(offset + 188, $rcpt_iv_flg);
	}

	/**
	 * Purchase invoice entered 受領インボイス登録済.<p>
	 *
	 */
	public void rcpt_iv_flg(boolean value) {
		setConstBoolean(offset + 188, $rcpt_iv_flg, value);
	}


	/**
	 * Base date 基準日.<p>
	 *
	 */
	public MCDate base_dt() {
		return getConstDate(offset + 189, $base_dt);
	}

	/**
	 * Base date 基準日.<p>
	 *
	 */
	public void base_dt(MCDate value) {
		setConstDate(offset + 189, $base_dt, value);
	}


	/**
	 * PO date 発注日.<p>
	 *
	 */
	public MCDate po_dt() {
		return getConstDate(offset + 190, $po_dt);
	}

	/**
	 * PO date 発注日.<p>
	 *
	 */
	public void po_dt(MCDate value) {
		setConstDate(offset + 190, $po_dt, value);
	}


	/**
	 * With PO schedule 発注予定あり.<p>
	 *
	 */
	public boolean po_schd_flg() {
		return getConstBoolean(offset + 191, $po_schd_flg);
	}

	/**
	 * With PO schedule 発注予定あり.<p>
	 *
	 */
	public void po_schd_flg(boolean value) {
		setConstBoolean(offset + 191, $po_schd_flg, value);
	}


	/**
	 * Mfg. location WG cd. 製造場所ワーキンググループＣＤ.<p>
	 *
	 */
	public String mfg_loc_wg_cd() {
		return getConstString(offset + 192, $mfg_loc_wg_cd);
	}

	/**
	 * Mfg. location WG cd. 製造場所ワーキンググループＣＤ.<p>
	 *
	 */
	public void mfg_loc_wg_cd(String value) {
		setConstString(offset + 192, $mfg_loc_wg_cd, value);
	}


	/**
	 * Cancel remaining receipt qty. 入荷残数打切.<p>
	 *
	 */
	public boolean arr_rem_abort_flg() {
		return getConstBoolean(offset + 193, $arr_rem_abort_flg);
	}

	/**
	 * Cancel remaining receipt qty. 入荷残数打切.<p>
	 *
	 */
	public void arr_rem_abort_flg(boolean value) {
		setConstBoolean(offset + 193, $arr_rem_abort_flg, value);
	}


	/**
	 * Cancel remaining purchase qty. 仕入残数打切.<p>
	 *
	 */
	public boolean purc_rem_abort_flg() {
		return getConstBoolean(offset + 194, $purc_rem_abort_flg);
	}

	/**
	 * Cancel remaining purchase qty. 仕入残数打切.<p>
	 *
	 */
	public void purc_rem_abort_flg(boolean value) {
		setConstBoolean(offset + 194, $purc_rem_abort_flg, value);
	}


	public String getString(String name) {
		if ($in_to_loc_cd.equalsIgnoreCase(name)) {
			return in_to_loc_cd();
		}
		if ($in_to_loc_nm.equalsIgnoreCase(name)) {
			return in_to_loc_nm();
		}
		if ($in_to_loc_wg_cd.equalsIgnoreCase(name)) {
			return in_to_loc_wg_cd();
		}
		if ($in_to_loc_wg_nm.equalsIgnoreCase(name)) {
			return in_to_loc_wg_nm();
		}
		if ($drct_dlv_typ.equalsIgnoreCase(name)) {
			return drct_dlv_typ();
		}
		if ($drct_dlv_typ_nm.equalsIgnoreCase(name)) {
			return drct_dlv_typ_nm();
		}
		if ($outsrc_sppl_cd.equalsIgnoreCase(name)) {
			return outsrc_sppl_cd();
		}
		if ($loc_mng_typ.equalsIgnoreCase(name)) {
			return loc_mng_typ();
		}
		if ($in_to_loc_cal_cd.equalsIgnoreCase(name)) {
			return in_to_loc_cal_cd();
		}
		if ($site_cd.equalsIgnoreCase(name)) {
			return site_cd();
		}
		if ($lg_grp_cd.equalsIgnoreCase(name)) {
			return lg_grp_cd();
		}
		if ($loc_grp_cd.equalsIgnoreCase(name)) {
			return loc_grp_cd();
		}
		if ($bef_in_to_loc_wg_cd.equalsIgnoreCase(name)) {
			return bef_in_to_loc_wg_cd();
		}
		if ($bef_lg_grp_cd.equalsIgnoreCase(name)) {
			return bef_lg_grp_cd();
		}
		if ($bef_loc_grp_cd.equalsIgnoreCase(name)) {
			return bef_loc_grp_cd();
		}
		if ($iv_itm_nm.equalsIgnoreCase(name)) {
			return iv_itm_nm();
		}
		if ($asset_mng_typ.equalsIgnoreCase(name)) {
			return asset_mng_typ();
		}
		if ($asset_mng_typ_nm.equalsIgnoreCase(name)) {
			return asset_mng_typ_nm();
		}
		if ($stk_mng_typ.equalsIgnoreCase(name)) {
			return stk_mng_typ();
		}
		if ($maker_cd.equalsIgnoreCase(name)) {
			return maker_cd();
		}
		if ($maker_nm.equalsIgnoreCase(name)) {
			return maker_nm();
		}
		if ($purc_basis_typ.equalsIgnoreCase(name)) {
			return purc_basis_typ();
		}
		if ($purc_basis_typ_nm.equalsIgnoreCase(name)) {
			return purc_basis_typ_nm();
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
		if ($bp_lot_no.equalsIgnoreCase(name)) {
			return bp_lot_no();
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
		if ($ap_dpt_cd.equalsIgnoreCase(name)) {
			return ap_dpt_cd();
		}
		if ($ap_dpt_nm.equalsIgnoreCase(name)) {
			return ap_dpt_nm();
		}
		if ($dlv_cal_cd.equalsIgnoreCase(name)) {
			return dlv_cal_cd();
		}
		if ($purc_id_typ.equalsIgnoreCase(name)) {
			return purc_id_typ();
		}
		if ($purc_id_typ_nm.equalsIgnoreCase(name)) {
			return purc_id_typ_nm();
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
		if ($cont_fctr_rnd_typ.equalsIgnoreCase(name)) {
			return cont_fctr_rnd_typ();
		}
		if ($purc_sts_typ.equalsIgnoreCase(name)) {
			return purc_sts_typ();
		}
		if ($purc_sts_typ_nm.equalsIgnoreCase(name)) {
			return purc_sts_typ_nm();
		}
		if ($purc_upri_req_typ.equalsIgnoreCase(name)) {
			return purc_upri_req_typ();
		}
		if ($purc_upri_req_typ_nm.equalsIgnoreCase(name)) {
			return purc_upri_req_typ_nm();
		}
		if ($outsrc_upri_typ.equalsIgnoreCase(name)) {
			return outsrc_upri_typ();
		}
		if ($old_dscnt_rsn_cd.equalsIgnoreCase(name)) {
			return old_dscnt_rsn_cd();
		}
		if ($old_dscnt_rsn_nm.equalsIgnoreCase(name)) {
			return old_dscnt_rsn_nm();
		}
		if ($mfg_loc_cd.equalsIgnoreCase(name)) {
			return mfg_loc_cd();
		}
		if ($mfg_loc_nm.equalsIgnoreCase(name)) {
			return mfg_loc_nm();
		}
		if ($bom_ptn.equalsIgnoreCase(name)) {
			return bom_ptn();
		}
		if ($outsrc_itm_ord_no.equalsIgnoreCase(name)) {
			return outsrc_itm_ord_no();
		}
		if ($purc_rsn_cd.equalsIgnoreCase(name)) {
			return purc_rsn_cd();
		}
		if ($purc_rsn_nm.equalsIgnoreCase(name)) {
			return purc_rsn_nm();
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
		if ($po_cnt_rmrks.equalsIgnoreCase(name)) {
			return po_cnt_rmrks();
		}
		if ($intr_rmrks.equalsIgnoreCase(name)) {
			return intr_rmrks();
		}
		if ($trd_d_rmrks.equalsIgnoreCase(name)) {
			return trd_d_rmrks();
		}
		if ($po_print_d_rmrks.equalsIgnoreCase(name)) {
			return po_print_d_rmrks();
		}
		if ($dlv_slip_d_rmrks.equalsIgnoreCase(name)) {
			return dlv_slip_d_rmrks();
		}
		if ($arr_cnt_rmrks.equalsIgnoreCase(name)) {
			return arr_cnt_rmrks();
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
		if ($edi_sub_d_char1.equalsIgnoreCase(name)) {
			return edi_sub_d_char1();
		}
		if ($edi_sub_d_char2.equalsIgnoreCase(name)) {
			return edi_sub_d_char2();
		}
		if ($edi_sub_d_char3.equalsIgnoreCase(name)) {
			return edi_sub_d_char3();
		}
		if ($edi_sub_d_char4.equalsIgnoreCase(name)) {
			return edi_sub_d_char4();
		}
		if ($edi_sub_d_char5.equalsIgnoreCase(name)) {
			return edi_sub_d_char5();
		}
		if ($ext_po_d_no.equalsIgnoreCase(name)) {
			return ext_po_d_no();
		}
		if ($slo_no.equalsIgnoreCase(name)) {
			return slo_no();
		}
		if ($slo_d_no.equalsIgnoreCase(name)) {
			return slo_d_no();
		}
		if ($dlv_slip_no.equalsIgnoreCase(name)) {
			return dlv_slip_no();
		}
		if ($purc_ddlv_dlv_slip_no.equalsIgnoreCase(name)) {
			return purc_ddlv_dlv_slip_no();
		}
		if ($dlv_slip_mng_no.equalsIgnoreCase(name)) {
			return dlv_slip_mng_no();
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
		if ($rqst_fr_usr_cd.equalsIgnoreCase(name)) {
			return rqst_fr_usr_cd();
		}
		if ($rqst_fr_usr_nm.equalsIgnoreCase(name)) {
			return rqst_fr_usr_nm();
		}
		if ($rqst_fr_dpt_cd.equalsIgnoreCase(name)) {
			return rqst_fr_dpt_cd();
		}
		if ($rqst_fr_dpt_nm.equalsIgnoreCase(name)) {
			return rqst_fr_dpt_nm();
		}
		if ($po_schd_no.equalsIgnoreCase(name)) {
			return po_schd_no();
		}
		if ($po_d_no.equalsIgnoreCase(name)) {
			return po_d_no();
		}
		if ($mfg_loc_wg_cd.equalsIgnoreCase(name)) {
			return mfg_loc_wg_cd();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($dtl_peg_no.equalsIgnoreCase(name)) {
			return dtl_peg_no();
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
		if ($cont_fctr_dec_place.equalsIgnoreCase(name)) {
			return cont_fctr_dec_place();
		}
		if ($dlv_inst_qty.equalsIgnoreCase(name)) {
			return dlv_inst_qty();
		}
		if ($dlv_inst_prms_rcpt_qty.equalsIgnoreCase(name)) {
			return dlv_inst_prms_rcpt_qty();
		}
		if ($rcpt_iv_qty.equalsIgnoreCase(name)) {
			return rcpt_iv_qty();
		}
		if ($arr_qty.equalsIgnoreCase(name)) {
			return arr_qty();
		}
		if ($purc_qty.equalsIgnoreCase(name)) {
			return purc_qty();
		}
		if ($pay_crryovr_times.equalsIgnoreCase(name)) {
			return pay_crryovr_times();
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
		if ($old_trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			return old_trd_cur_dscnt_amt();
		}
		if ($wtax_rate.equalsIgnoreCase(name)) {
			return wtax_rate();
		}
		if ($edi_sub_d_num1.equalsIgnoreCase(name)) {
			return edi_sub_d_num1();
		}
		if ($dlv_slip_seq.equalsIgnoreCase(name)) {
			return dlv_slip_seq();
		}
		if ($dlv_slip_mng_seq.equalsIgnoreCase(name)) {
			return dlv_slip_mng_seq();
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			return disp_seq();
		}
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		if ($rqst_avl_rqst_dt.equalsIgnoreCase(name)) {
			return rqst_avl_rqst_dt();
		}
		if ($purc_schd_dt.equalsIgnoreCase(name)) {
			return purc_schd_dt();
		}
		if ($po_conf_rcpt_dt.equalsIgnoreCase(name)) {
			return po_conf_rcpt_dt();
		}
		if ($edi_sub_d_dt1.equalsIgnoreCase(name)) {
			return edi_sub_d_dt1();
		}
		if ($base_dt.equalsIgnoreCase(name)) {
			return base_dt();
		}
		if ($po_dt.equalsIgnoreCase(name)) {
			return po_dt();
		}
		return super.getDate(name);
	}
	public boolean getBoolean(String name) {
		if ($check.equalsIgnoreCase(name)) {
			return check();
		}
		if ($pri_prnt_flg.equalsIgnoreCase(name)) {
			return pri_prnt_flg();
		}
		if ($str_ln_tgt_flg.equalsIgnoreCase(name)) {
			return str_ln_tgt_flg();
		}
		if ($sundry_itm_flg.equalsIgnoreCase(name)) {
			return sundry_itm_flg();
		}
		if ($arr_skip_flg.equalsIgnoreCase(name)) {
			return arr_skip_flg();
		}
		if ($purc_dlv_slip_flg.equalsIgnoreCase(name)) {
			return purc_dlv_slip_flg();
		}
		if ($sync_flg.equalsIgnoreCase(name)) {
			return sync_flg();
		}
		if ($itm_purc_upri_cng_flg.equalsIgnoreCase(name)) {
			return itm_purc_upri_cng_flg();
		}
		if ($dscnt_itm_flg.equalsIgnoreCase(name)) {
			return dscnt_itm_flg();
		}
		if ($ver_flg.equalsIgnoreCase(name)) {
			return ver_flg();
		}
		if ($po_conf_rcpt_flg.equalsIgnoreCase(name)) {
			return po_conf_rcpt_flg();
		}
		if ($abort_flg.equalsIgnoreCase(name)) {
			return abort_flg();
		}
		if ($bef_abort_flg.equalsIgnoreCase(name)) {
			return bef_abort_flg();
		}
		if ($cont_fctr_flg.equalsIgnoreCase(name)) {
			return cont_fctr_flg();
		}
		if ($arr_schd_split_flg.equalsIgnoreCase(name)) {
			return arr_schd_split_flg();
		}
		if ($arr_cmpl_flg.equalsIgnoreCase(name)) {
			return arr_cmpl_flg();
		}
		if ($purc_cmpl_flg.equalsIgnoreCase(name)) {
			return purc_cmpl_flg();
		}
		if ($repurc_obli_flg.equalsIgnoreCase(name)) {
			return repurc_obli_flg();
		}
		if ($old_interim_flg.equalsIgnoreCase(name)) {
			return old_interim_flg();
		}
		if ($outsrc_flg.equalsIgnoreCase(name)) {
			return outsrc_flg();
		}
		if ($mfg_inst_flg.equalsIgnoreCase(name)) {
			return mfg_inst_flg();
		}
		if ($xpns_purc_flg.equalsIgnoreCase(name)) {
			return xpns_purc_flg();
		}
		if ($not_xpns_purc_flg.equalsIgnoreCase(name)) {
			return not_xpns_purc_flg();
		}
		if ($rqst_can_flg.equalsIgnoreCase(name)) {
			return rqst_can_flg();
		}
		if ($dlv_slip_invalid_flg.equalsIgnoreCase(name)) {
			return dlv_slip_invalid_flg();
		}
		if ($bndl_flg.equalsIgnoreCase(name)) {
			return bndl_flg();
		}
		if ($rqst_slo_flg.equalsIgnoreCase(name)) {
			return rqst_slo_flg();
		}
		if ($arr_flg.equalsIgnoreCase(name)) {
			return arr_flg();
		}
		if ($purc_flg.equalsIgnoreCase(name)) {
			return purc_flg();
		}
		if ($rcpt_iv_flg.equalsIgnoreCase(name)) {
			return rcpt_iv_flg();
		}
		if ($po_schd_flg.equalsIgnoreCase(name)) {
			return po_schd_flg();
		}
		if ($arr_rem_abort_flg.equalsIgnoreCase(name)) {
			return arr_rem_abort_flg();
		}
		if ($purc_rem_abort_flg.equalsIgnoreCase(name)) {
			return purc_rem_abort_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($in_to_loc_cd.equalsIgnoreCase(name)) {
			return in_to_loc_cd();
		}
		if ($in_to_loc_nm.equalsIgnoreCase(name)) {
			return in_to_loc_nm();
		}
		if ($in_to_loc_wg_cd.equalsIgnoreCase(name)) {
			return in_to_loc_wg_cd();
		}
		if ($in_to_loc_wg_nm.equalsIgnoreCase(name)) {
			return in_to_loc_wg_nm();
		}
		if ($drct_dlv_typ.equalsIgnoreCase(name)) {
			return drct_dlv_typ();
		}
		if ($drct_dlv_typ_nm.equalsIgnoreCase(name)) {
			return drct_dlv_typ_nm();
		}
		if ($outsrc_sppl_cd.equalsIgnoreCase(name)) {
			return outsrc_sppl_cd();
		}
		if ($loc_mng_typ.equalsIgnoreCase(name)) {
			return loc_mng_typ();
		}
		if ($in_to_loc_cal_cd.equalsIgnoreCase(name)) {
			return in_to_loc_cal_cd();
		}
		if ($site_cd.equalsIgnoreCase(name)) {
			return site_cd();
		}
		if ($lg_grp_cd.equalsIgnoreCase(name)) {
			return lg_grp_cd();
		}
		if ($loc_grp_cd.equalsIgnoreCase(name)) {
			return loc_grp_cd();
		}
		if ($bef_in_to_loc_wg_cd.equalsIgnoreCase(name)) {
			return bef_in_to_loc_wg_cd();
		}
		if ($bef_lg_grp_cd.equalsIgnoreCase(name)) {
			return bef_lg_grp_cd();
		}
		if ($bef_loc_grp_cd.equalsIgnoreCase(name)) {
			return bef_loc_grp_cd();
		}
		if ($iv_itm_nm.equalsIgnoreCase(name)) {
			return iv_itm_nm();
		}
		if ($asset_mng_typ.equalsIgnoreCase(name)) {
			return asset_mng_typ();
		}
		if ($asset_mng_typ_nm.equalsIgnoreCase(name)) {
			return asset_mng_typ_nm();
		}
		if ($stk_mng_typ.equalsIgnoreCase(name)) {
			return stk_mng_typ();
		}
		if ($maker_cd.equalsIgnoreCase(name)) {
			return maker_cd();
		}
		if ($maker_nm.equalsIgnoreCase(name)) {
			return maker_nm();
		}
		if ($purc_basis_typ.equalsIgnoreCase(name)) {
			return purc_basis_typ();
		}
		if ($purc_basis_typ_nm.equalsIgnoreCase(name)) {
			return purc_basis_typ_nm();
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
		if ($bp_lot_no.equalsIgnoreCase(name)) {
			return bp_lot_no();
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
		if ($ap_dpt_cd.equalsIgnoreCase(name)) {
			return ap_dpt_cd();
		}
		if ($ap_dpt_nm.equalsIgnoreCase(name)) {
			return ap_dpt_nm();
		}
		if ($dlv_cal_cd.equalsIgnoreCase(name)) {
			return dlv_cal_cd();
		}
		if ($purc_id_typ.equalsIgnoreCase(name)) {
			return purc_id_typ();
		}
		if ($purc_id_typ_nm.equalsIgnoreCase(name)) {
			return purc_id_typ_nm();
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
		if ($cont_fctr_rnd_typ.equalsIgnoreCase(name)) {
			return cont_fctr_rnd_typ();
		}
		if ($purc_sts_typ.equalsIgnoreCase(name)) {
			return purc_sts_typ();
		}
		if ($purc_sts_typ_nm.equalsIgnoreCase(name)) {
			return purc_sts_typ_nm();
		}
		if ($purc_upri_req_typ.equalsIgnoreCase(name)) {
			return purc_upri_req_typ();
		}
		if ($purc_upri_req_typ_nm.equalsIgnoreCase(name)) {
			return purc_upri_req_typ_nm();
		}
		if ($outsrc_upri_typ.equalsIgnoreCase(name)) {
			return outsrc_upri_typ();
		}
		if ($old_dscnt_rsn_cd.equalsIgnoreCase(name)) {
			return old_dscnt_rsn_cd();
		}
		if ($old_dscnt_rsn_nm.equalsIgnoreCase(name)) {
			return old_dscnt_rsn_nm();
		}
		if ($mfg_loc_cd.equalsIgnoreCase(name)) {
			return mfg_loc_cd();
		}
		if ($mfg_loc_nm.equalsIgnoreCase(name)) {
			return mfg_loc_nm();
		}
		if ($bom_ptn.equalsIgnoreCase(name)) {
			return bom_ptn();
		}
		if ($outsrc_itm_ord_no.equalsIgnoreCase(name)) {
			return outsrc_itm_ord_no();
		}
		if ($purc_rsn_cd.equalsIgnoreCase(name)) {
			return purc_rsn_cd();
		}
		if ($purc_rsn_nm.equalsIgnoreCase(name)) {
			return purc_rsn_nm();
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
		if ($po_cnt_rmrks.equalsIgnoreCase(name)) {
			return po_cnt_rmrks();
		}
		if ($intr_rmrks.equalsIgnoreCase(name)) {
			return intr_rmrks();
		}
		if ($trd_d_rmrks.equalsIgnoreCase(name)) {
			return trd_d_rmrks();
		}
		if ($po_print_d_rmrks.equalsIgnoreCase(name)) {
			return po_print_d_rmrks();
		}
		if ($dlv_slip_d_rmrks.equalsIgnoreCase(name)) {
			return dlv_slip_d_rmrks();
		}
		if ($arr_cnt_rmrks.equalsIgnoreCase(name)) {
			return arr_cnt_rmrks();
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
		if ($edi_sub_d_char1.equalsIgnoreCase(name)) {
			return edi_sub_d_char1();
		}
		if ($edi_sub_d_char2.equalsIgnoreCase(name)) {
			return edi_sub_d_char2();
		}
		if ($edi_sub_d_char3.equalsIgnoreCase(name)) {
			return edi_sub_d_char3();
		}
		if ($edi_sub_d_char4.equalsIgnoreCase(name)) {
			return edi_sub_d_char4();
		}
		if ($edi_sub_d_char5.equalsIgnoreCase(name)) {
			return edi_sub_d_char5();
		}
		if ($ext_po_d_no.equalsIgnoreCase(name)) {
			return ext_po_d_no();
		}
		if ($slo_no.equalsIgnoreCase(name)) {
			return slo_no();
		}
		if ($slo_d_no.equalsIgnoreCase(name)) {
			return slo_d_no();
		}
		if ($dlv_slip_no.equalsIgnoreCase(name)) {
			return dlv_slip_no();
		}
		if ($purc_ddlv_dlv_slip_no.equalsIgnoreCase(name)) {
			return purc_ddlv_dlv_slip_no();
		}
		if ($dlv_slip_mng_no.equalsIgnoreCase(name)) {
			return dlv_slip_mng_no();
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
		if ($rqst_fr_usr_cd.equalsIgnoreCase(name)) {
			return rqst_fr_usr_cd();
		}
		if ($rqst_fr_usr_nm.equalsIgnoreCase(name)) {
			return rqst_fr_usr_nm();
		}
		if ($rqst_fr_dpt_cd.equalsIgnoreCase(name)) {
			return rqst_fr_dpt_cd();
		}
		if ($rqst_fr_dpt_nm.equalsIgnoreCase(name)) {
			return rqst_fr_dpt_nm();
		}
		if ($po_schd_no.equalsIgnoreCase(name)) {
			return po_schd_no();
		}
		if ($po_d_no.equalsIgnoreCase(name)) {
			return po_d_no();
		}
		if ($mfg_loc_wg_cd.equalsIgnoreCase(name)) {
			return mfg_loc_wg_cd();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($dtl_peg_no.equalsIgnoreCase(name)) {
			return dtl_peg_no();
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
		if ($cont_fctr_dec_place.equalsIgnoreCase(name)) {
			return cont_fctr_dec_place();
		}
		if ($dlv_inst_qty.equalsIgnoreCase(name)) {
			return dlv_inst_qty();
		}
		if ($dlv_inst_prms_rcpt_qty.equalsIgnoreCase(name)) {
			return dlv_inst_prms_rcpt_qty();
		}
		if ($rcpt_iv_qty.equalsIgnoreCase(name)) {
			return rcpt_iv_qty();
		}
		if ($arr_qty.equalsIgnoreCase(name)) {
			return arr_qty();
		}
		if ($purc_qty.equalsIgnoreCase(name)) {
			return purc_qty();
		}
		if ($pay_crryovr_times.equalsIgnoreCase(name)) {
			return pay_crryovr_times();
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
		if ($old_trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			return old_trd_cur_dscnt_amt();
		}
		if ($wtax_rate.equalsIgnoreCase(name)) {
			return wtax_rate();
		}
		if ($edi_sub_d_num1.equalsIgnoreCase(name)) {
			return edi_sub_d_num1();
		}
		if ($dlv_slip_seq.equalsIgnoreCase(name)) {
			return dlv_slip_seq();
		}
		if ($dlv_slip_mng_seq.equalsIgnoreCase(name)) {
			return dlv_slip_mng_seq();
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			return disp_seq();
		}
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($rqst_avl_rqst_dt.equalsIgnoreCase(name)) {
			return rqst_avl_rqst_dt();
		}
		if ($purc_schd_dt.equalsIgnoreCase(name)) {
			return purc_schd_dt();
		}
		if ($po_conf_rcpt_dt.equalsIgnoreCase(name)) {
			return po_conf_rcpt_dt();
		}
		if ($edi_sub_d_dt1.equalsIgnoreCase(name)) {
			return edi_sub_d_dt1();
		}
		if ($base_dt.equalsIgnoreCase(name)) {
			return base_dt();
		}
		if ($po_dt.equalsIgnoreCase(name)) {
			return po_dt();
		}
		return super.getDateNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($check.equalsIgnoreCase(name)) {
			return check();
		}
		if ($pri_prnt_flg.equalsIgnoreCase(name)) {
			return pri_prnt_flg();
		}
		if ($str_ln_tgt_flg.equalsIgnoreCase(name)) {
			return str_ln_tgt_flg();
		}
		if ($sundry_itm_flg.equalsIgnoreCase(name)) {
			return sundry_itm_flg();
		}
		if ($arr_skip_flg.equalsIgnoreCase(name)) {
			return arr_skip_flg();
		}
		if ($purc_dlv_slip_flg.equalsIgnoreCase(name)) {
			return purc_dlv_slip_flg();
		}
		if ($sync_flg.equalsIgnoreCase(name)) {
			return sync_flg();
		}
		if ($itm_purc_upri_cng_flg.equalsIgnoreCase(name)) {
			return itm_purc_upri_cng_flg();
		}
		if ($dscnt_itm_flg.equalsIgnoreCase(name)) {
			return dscnt_itm_flg();
		}
		if ($ver_flg.equalsIgnoreCase(name)) {
			return ver_flg();
		}
		if ($po_conf_rcpt_flg.equalsIgnoreCase(name)) {
			return po_conf_rcpt_flg();
		}
		if ($abort_flg.equalsIgnoreCase(name)) {
			return abort_flg();
		}
		if ($bef_abort_flg.equalsIgnoreCase(name)) {
			return bef_abort_flg();
		}
		if ($cont_fctr_flg.equalsIgnoreCase(name)) {
			return cont_fctr_flg();
		}
		if ($arr_schd_split_flg.equalsIgnoreCase(name)) {
			return arr_schd_split_flg();
		}
		if ($arr_cmpl_flg.equalsIgnoreCase(name)) {
			return arr_cmpl_flg();
		}
		if ($purc_cmpl_flg.equalsIgnoreCase(name)) {
			return purc_cmpl_flg();
		}
		if ($repurc_obli_flg.equalsIgnoreCase(name)) {
			return repurc_obli_flg();
		}
		if ($old_interim_flg.equalsIgnoreCase(name)) {
			return old_interim_flg();
		}
		if ($outsrc_flg.equalsIgnoreCase(name)) {
			return outsrc_flg();
		}
		if ($mfg_inst_flg.equalsIgnoreCase(name)) {
			return mfg_inst_flg();
		}
		if ($xpns_purc_flg.equalsIgnoreCase(name)) {
			return xpns_purc_flg();
		}
		if ($not_xpns_purc_flg.equalsIgnoreCase(name)) {
			return not_xpns_purc_flg();
		}
		if ($rqst_can_flg.equalsIgnoreCase(name)) {
			return rqst_can_flg();
		}
		if ($dlv_slip_invalid_flg.equalsIgnoreCase(name)) {
			return dlv_slip_invalid_flg();
		}
		if ($bndl_flg.equalsIgnoreCase(name)) {
			return bndl_flg();
		}
		if ($rqst_slo_flg.equalsIgnoreCase(name)) {
			return rqst_slo_flg();
		}
		if ($arr_flg.equalsIgnoreCase(name)) {
			return arr_flg();
		}
		if ($purc_flg.equalsIgnoreCase(name)) {
			return purc_flg();
		}
		if ($rcpt_iv_flg.equalsIgnoreCase(name)) {
			return rcpt_iv_flg();
		}
		if ($po_schd_flg.equalsIgnoreCase(name)) {
			return po_schd_flg();
		}
		if ($arr_rem_abort_flg.equalsIgnoreCase(name)) {
			return arr_rem_abort_flg();
		}
		if ($purc_rem_abort_flg.equalsIgnoreCase(name)) {
			return purc_rem_abort_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($in_to_loc_cd.equalsIgnoreCase(name)) {
			in_to_loc_cd(value);
			return;
		}
		if ($in_to_loc_nm.equalsIgnoreCase(name)) {
			in_to_loc_nm(value);
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
		if ($drct_dlv_typ.equalsIgnoreCase(name)) {
			drct_dlv_typ(value);
			return;
		}
		if ($drct_dlv_typ_nm.equalsIgnoreCase(name)) {
			drct_dlv_typ_nm(value);
			return;
		}
		if ($outsrc_sppl_cd.equalsIgnoreCase(name)) {
			outsrc_sppl_cd(value);
			return;
		}
		if ($loc_mng_typ.equalsIgnoreCase(name)) {
			loc_mng_typ(value);
			return;
		}
		if ($in_to_loc_cal_cd.equalsIgnoreCase(name)) {
			in_to_loc_cal_cd(value);
			return;
		}
		if ($site_cd.equalsIgnoreCase(name)) {
			site_cd(value);
			return;
		}
		if ($lg_grp_cd.equalsIgnoreCase(name)) {
			lg_grp_cd(value);
			return;
		}
		if ($loc_grp_cd.equalsIgnoreCase(name)) {
			loc_grp_cd(value);
			return;
		}
		if ($bef_in_to_loc_wg_cd.equalsIgnoreCase(name)) {
			bef_in_to_loc_wg_cd(value);
			return;
		}
		if ($bef_lg_grp_cd.equalsIgnoreCase(name)) {
			bef_lg_grp_cd(value);
			return;
		}
		if ($bef_loc_grp_cd.equalsIgnoreCase(name)) {
			bef_loc_grp_cd(value);
			return;
		}
		if ($iv_itm_nm.equalsIgnoreCase(name)) {
			iv_itm_nm(value);
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
		if ($stk_mng_typ.equalsIgnoreCase(name)) {
			stk_mng_typ(value);
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
		if ($purc_basis_typ.equalsIgnoreCase(name)) {
			purc_basis_typ(value);
			return;
		}
		if ($purc_basis_typ_nm.equalsIgnoreCase(name)) {
			purc_basis_typ_nm(value);
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
		if ($bp_lot_no.equalsIgnoreCase(name)) {
			bp_lot_no(value);
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
		if ($ap_dpt_cd.equalsIgnoreCase(name)) {
			ap_dpt_cd(value);
			return;
		}
		if ($ap_dpt_nm.equalsIgnoreCase(name)) {
			ap_dpt_nm(value);
			return;
		}
		if ($dlv_cal_cd.equalsIgnoreCase(name)) {
			dlv_cal_cd(value);
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
		if ($cont_fctr_rnd_typ.equalsIgnoreCase(name)) {
			cont_fctr_rnd_typ(value);
			return;
		}
		if ($purc_sts_typ.equalsIgnoreCase(name)) {
			purc_sts_typ(value);
			return;
		}
		if ($purc_sts_typ_nm.equalsIgnoreCase(name)) {
			purc_sts_typ_nm(value);
			return;
		}
		if ($purc_upri_req_typ.equalsIgnoreCase(name)) {
			purc_upri_req_typ(value);
			return;
		}
		if ($purc_upri_req_typ_nm.equalsIgnoreCase(name)) {
			purc_upri_req_typ_nm(value);
			return;
		}
		if ($outsrc_upri_typ.equalsIgnoreCase(name)) {
			outsrc_upri_typ(value);
			return;
		}
		if ($old_dscnt_rsn_cd.equalsIgnoreCase(name)) {
			old_dscnt_rsn_cd(value);
			return;
		}
		if ($old_dscnt_rsn_nm.equalsIgnoreCase(name)) {
			old_dscnt_rsn_nm(value);
			return;
		}
		if ($mfg_loc_cd.equalsIgnoreCase(name)) {
			mfg_loc_cd(value);
			return;
		}
		if ($mfg_loc_nm.equalsIgnoreCase(name)) {
			mfg_loc_nm(value);
			return;
		}
		if ($bom_ptn.equalsIgnoreCase(name)) {
			bom_ptn(value);
			return;
		}
		if ($outsrc_itm_ord_no.equalsIgnoreCase(name)) {
			outsrc_itm_ord_no(value);
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
		if ($po_cnt_rmrks.equalsIgnoreCase(name)) {
			po_cnt_rmrks(value);
			return;
		}
		if ($intr_rmrks.equalsIgnoreCase(name)) {
			intr_rmrks(value);
			return;
		}
		if ($trd_d_rmrks.equalsIgnoreCase(name)) {
			trd_d_rmrks(value);
			return;
		}
		if ($po_print_d_rmrks.equalsIgnoreCase(name)) {
			po_print_d_rmrks(value);
			return;
		}
		if ($dlv_slip_d_rmrks.equalsIgnoreCase(name)) {
			dlv_slip_d_rmrks(value);
			return;
		}
		if ($arr_cnt_rmrks.equalsIgnoreCase(name)) {
			arr_cnt_rmrks(value);
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
		if ($edi_sub_d_char1.equalsIgnoreCase(name)) {
			edi_sub_d_char1(value);
			return;
		}
		if ($edi_sub_d_char2.equalsIgnoreCase(name)) {
			edi_sub_d_char2(value);
			return;
		}
		if ($edi_sub_d_char3.equalsIgnoreCase(name)) {
			edi_sub_d_char3(value);
			return;
		}
		if ($edi_sub_d_char4.equalsIgnoreCase(name)) {
			edi_sub_d_char4(value);
			return;
		}
		if ($edi_sub_d_char5.equalsIgnoreCase(name)) {
			edi_sub_d_char5(value);
			return;
		}
		if ($ext_po_d_no.equalsIgnoreCase(name)) {
			ext_po_d_no(value);
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
		if ($dlv_slip_no.equalsIgnoreCase(name)) {
			dlv_slip_no(value);
			return;
		}
		if ($purc_ddlv_dlv_slip_no.equalsIgnoreCase(name)) {
			purc_ddlv_dlv_slip_no(value);
			return;
		}
		if ($dlv_slip_mng_no.equalsIgnoreCase(name)) {
			dlv_slip_mng_no(value);
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
		if ($rqst_fr_usr_cd.equalsIgnoreCase(name)) {
			rqst_fr_usr_cd(value);
			return;
		}
		if ($rqst_fr_usr_nm.equalsIgnoreCase(name)) {
			rqst_fr_usr_nm(value);
			return;
		}
		if ($rqst_fr_dpt_cd.equalsIgnoreCase(name)) {
			rqst_fr_dpt_cd(value);
			return;
		}
		if ($rqst_fr_dpt_nm.equalsIgnoreCase(name)) {
			rqst_fr_dpt_nm(value);
			return;
		}
		if ($po_schd_no.equalsIgnoreCase(name)) {
			po_schd_no(value);
			return;
		}
		if ($po_d_no.equalsIgnoreCase(name)) {
			po_d_no(value);
			return;
		}
		if ($mfg_loc_wg_cd.equalsIgnoreCase(name)) {
			mfg_loc_wg_cd(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($dtl_peg_no.equalsIgnoreCase(name)) {
			dtl_peg_no(value);
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
		if ($cont_fctr_dec_place.equalsIgnoreCase(name)) {
			cont_fctr_dec_place(value);
			return;
		}
		if ($dlv_inst_qty.equalsIgnoreCase(name)) {
			dlv_inst_qty(value);
			return;
		}
		if ($dlv_inst_prms_rcpt_qty.equalsIgnoreCase(name)) {
			dlv_inst_prms_rcpt_qty(value);
			return;
		}
		if ($rcpt_iv_qty.equalsIgnoreCase(name)) {
			rcpt_iv_qty(value);
			return;
		}
		if ($arr_qty.equalsIgnoreCase(name)) {
			arr_qty(value);
			return;
		}
		if ($purc_qty.equalsIgnoreCase(name)) {
			purc_qty(value);
			return;
		}
		if ($pay_crryovr_times.equalsIgnoreCase(name)) {
			pay_crryovr_times(value);
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
		if ($old_trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			old_trd_cur_dscnt_amt(value);
			return;
		}
		if ($wtax_rate.equalsIgnoreCase(name)) {
			wtax_rate(value);
			return;
		}
		if ($edi_sub_d_num1.equalsIgnoreCase(name)) {
			edi_sub_d_num1(value);
			return;
		}
		if ($dlv_slip_seq.equalsIgnoreCase(name)) {
			dlv_slip_seq(value);
			return;
		}
		if ($dlv_slip_mng_seq.equalsIgnoreCase(name)) {
			dlv_slip_mng_seq(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($dtl_peg_no.equalsIgnoreCase(name)) {
			dtl_peg_no(value);
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
		if ($cont_fctr_dec_place.equalsIgnoreCase(name)) {
			cont_fctr_dec_place(value);
			return;
		}
		if ($dlv_inst_qty.equalsIgnoreCase(name)) {
			dlv_inst_qty(value);
			return;
		}
		if ($dlv_inst_prms_rcpt_qty.equalsIgnoreCase(name)) {
			dlv_inst_prms_rcpt_qty(value);
			return;
		}
		if ($rcpt_iv_qty.equalsIgnoreCase(name)) {
			rcpt_iv_qty(value);
			return;
		}
		if ($arr_qty.equalsIgnoreCase(name)) {
			arr_qty(value);
			return;
		}
		if ($purc_qty.equalsIgnoreCase(name)) {
			purc_qty(value);
			return;
		}
		if ($pay_crryovr_times.equalsIgnoreCase(name)) {
			pay_crryovr_times(value);
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
		if ($old_trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			old_trd_cur_dscnt_amt(value);
			return;
		}
		if ($wtax_rate.equalsIgnoreCase(name)) {
			wtax_rate(value);
			return;
		}
		if ($edi_sub_d_num1.equalsIgnoreCase(name)) {
			edi_sub_d_num1(value);
			return;
		}
		if ($dlv_slip_seq.equalsIgnoreCase(name)) {
			dlv_slip_seq(value);
			return;
		}
		if ($dlv_slip_mng_seq.equalsIgnoreCase(name)) {
			dlv_slip_mng_seq(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($dtl_peg_no.equalsIgnoreCase(name)) {
			dtl_peg_no(value);
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
		if ($cont_fctr_dec_place.equalsIgnoreCase(name)) {
			cont_fctr_dec_place(value);
			return;
		}
		if ($dlv_inst_qty.equalsIgnoreCase(name)) {
			dlv_inst_qty(value);
			return;
		}
		if ($dlv_inst_prms_rcpt_qty.equalsIgnoreCase(name)) {
			dlv_inst_prms_rcpt_qty(value);
			return;
		}
		if ($rcpt_iv_qty.equalsIgnoreCase(name)) {
			rcpt_iv_qty(value);
			return;
		}
		if ($arr_qty.equalsIgnoreCase(name)) {
			arr_qty(value);
			return;
		}
		if ($purc_qty.equalsIgnoreCase(name)) {
			purc_qty(value);
			return;
		}
		if ($pay_crryovr_times.equalsIgnoreCase(name)) {
			pay_crryovr_times(value);
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
		if ($old_trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			old_trd_cur_dscnt_amt(value);
			return;
		}
		if ($wtax_rate.equalsIgnoreCase(name)) {
			wtax_rate(value);
			return;
		}
		if ($edi_sub_d_num1.equalsIgnoreCase(name)) {
			edi_sub_d_num1(value);
			return;
		}
		if ($dlv_slip_seq.equalsIgnoreCase(name)) {
			dlv_slip_seq(value);
			return;
		}
		if ($dlv_slip_mng_seq.equalsIgnoreCase(name)) {
			dlv_slip_mng_seq(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($dtl_peg_no.equalsIgnoreCase(name)) {
			dtl_peg_no(value);
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
		if ($cont_fctr_dec_place.equalsIgnoreCase(name)) {
			cont_fctr_dec_place(value);
			return;
		}
		if ($dlv_inst_qty.equalsIgnoreCase(name)) {
			dlv_inst_qty(value);
			return;
		}
		if ($dlv_inst_prms_rcpt_qty.equalsIgnoreCase(name)) {
			dlv_inst_prms_rcpt_qty(value);
			return;
		}
		if ($rcpt_iv_qty.equalsIgnoreCase(name)) {
			rcpt_iv_qty(value);
			return;
		}
		if ($arr_qty.equalsIgnoreCase(name)) {
			arr_qty(value);
			return;
		}
		if ($purc_qty.equalsIgnoreCase(name)) {
			purc_qty(value);
			return;
		}
		if ($pay_crryovr_times.equalsIgnoreCase(name)) {
			pay_crryovr_times(value);
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
		if ($old_trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			old_trd_cur_dscnt_amt(value);
			return;
		}
		if ($wtax_rate.equalsIgnoreCase(name)) {
			wtax_rate(value);
			return;
		}
		if ($edi_sub_d_num1.equalsIgnoreCase(name)) {
			edi_sub_d_num1(value);
			return;
		}
		if ($dlv_slip_seq.equalsIgnoreCase(name)) {
			dlv_slip_seq(value);
			return;
		}
		if ($dlv_slip_mng_seq.equalsIgnoreCase(name)) {
			dlv_slip_mng_seq(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($dtl_peg_no.equalsIgnoreCase(name)) {
			dtl_peg_no(value);
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
		if ($cont_fctr_dec_place.equalsIgnoreCase(name)) {
			cont_fctr_dec_place(value);
			return;
		}
		if ($dlv_inst_qty.equalsIgnoreCase(name)) {
			dlv_inst_qty(value);
			return;
		}
		if ($dlv_inst_prms_rcpt_qty.equalsIgnoreCase(name)) {
			dlv_inst_prms_rcpt_qty(value);
			return;
		}
		if ($rcpt_iv_qty.equalsIgnoreCase(name)) {
			rcpt_iv_qty(value);
			return;
		}
		if ($arr_qty.equalsIgnoreCase(name)) {
			arr_qty(value);
			return;
		}
		if ($purc_qty.equalsIgnoreCase(name)) {
			purc_qty(value);
			return;
		}
		if ($pay_crryovr_times.equalsIgnoreCase(name)) {
			pay_crryovr_times(value);
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
		if ($old_trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			old_trd_cur_dscnt_amt(value);
			return;
		}
		if ($wtax_rate.equalsIgnoreCase(name)) {
			wtax_rate(value);
			return;
		}
		if ($edi_sub_d_num1.equalsIgnoreCase(name)) {
			edi_sub_d_num1(value);
			return;
		}
		if ($dlv_slip_seq.equalsIgnoreCase(name)) {
			dlv_slip_seq(value);
			return;
		}
		if ($dlv_slip_mng_seq.equalsIgnoreCase(name)) {
			dlv_slip_mng_seq(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($rqst_avl_rqst_dt.equalsIgnoreCase(name)) {
			rqst_avl_rqst_dt(value);
			return;
		}
		if ($purc_schd_dt.equalsIgnoreCase(name)) {
			purc_schd_dt(value);
			return;
		}
		if ($po_conf_rcpt_dt.equalsIgnoreCase(name)) {
			po_conf_rcpt_dt(value);
			return;
		}
		if ($edi_sub_d_dt1.equalsIgnoreCase(name)) {
			edi_sub_d_dt1(value);
			return;
		}
		if ($base_dt.equalsIgnoreCase(name)) {
			base_dt(value);
			return;
		}
		if ($po_dt.equalsIgnoreCase(name)) {
			po_dt(value);
			return;
		}
		super.setDate(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($check.equalsIgnoreCase(name)) {
			check(value);
			return;
		}
		if ($pri_prnt_flg.equalsIgnoreCase(name)) {
			pri_prnt_flg(value);
			return;
		}
		if ($str_ln_tgt_flg.equalsIgnoreCase(name)) {
			str_ln_tgt_flg(value);
			return;
		}
		if ($sundry_itm_flg.equalsIgnoreCase(name)) {
			sundry_itm_flg(value);
			return;
		}
		if ($arr_skip_flg.equalsIgnoreCase(name)) {
			arr_skip_flg(value);
			return;
		}
		if ($purc_dlv_slip_flg.equalsIgnoreCase(name)) {
			purc_dlv_slip_flg(value);
			return;
		}
		if ($sync_flg.equalsIgnoreCase(name)) {
			sync_flg(value);
			return;
		}
		if ($itm_purc_upri_cng_flg.equalsIgnoreCase(name)) {
			itm_purc_upri_cng_flg(value);
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
		if ($po_conf_rcpt_flg.equalsIgnoreCase(name)) {
			po_conf_rcpt_flg(value);
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
		if ($cont_fctr_flg.equalsIgnoreCase(name)) {
			cont_fctr_flg(value);
			return;
		}
		if ($arr_schd_split_flg.equalsIgnoreCase(name)) {
			arr_schd_split_flg(value);
			return;
		}
		if ($arr_cmpl_flg.equalsIgnoreCase(name)) {
			arr_cmpl_flg(value);
			return;
		}
		if ($purc_cmpl_flg.equalsIgnoreCase(name)) {
			purc_cmpl_flg(value);
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
		if ($outsrc_flg.equalsIgnoreCase(name)) {
			outsrc_flg(value);
			return;
		}
		if ($mfg_inst_flg.equalsIgnoreCase(name)) {
			mfg_inst_flg(value);
			return;
		}
		if ($xpns_purc_flg.equalsIgnoreCase(name)) {
			xpns_purc_flg(value);
			return;
		}
		if ($not_xpns_purc_flg.equalsIgnoreCase(name)) {
			not_xpns_purc_flg(value);
			return;
		}
		if ($rqst_can_flg.equalsIgnoreCase(name)) {
			rqst_can_flg(value);
			return;
		}
		if ($dlv_slip_invalid_flg.equalsIgnoreCase(name)) {
			dlv_slip_invalid_flg(value);
			return;
		}
		if ($bndl_flg.equalsIgnoreCase(name)) {
			bndl_flg(value);
			return;
		}
		if ($rqst_slo_flg.equalsIgnoreCase(name)) {
			rqst_slo_flg(value);
			return;
		}
		if ($arr_flg.equalsIgnoreCase(name)) {
			arr_flg(value);
			return;
		}
		if ($purc_flg.equalsIgnoreCase(name)) {
			purc_flg(value);
			return;
		}
		if ($rcpt_iv_flg.equalsIgnoreCase(name)) {
			rcpt_iv_flg(value);
			return;
		}
		if ($po_schd_flg.equalsIgnoreCase(name)) {
			po_schd_flg(value);
			return;
		}
		if ($arr_rem_abort_flg.equalsIgnoreCase(name)) {
			arr_rem_abort_flg(value);
			return;
		}
		if ($purc_rem_abort_flg.equalsIgnoreCase(name)) {
			purc_rem_abort_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($in_to_loc_cd.equalsIgnoreCase(name)) {
			in_to_loc_cd(value);
			return;
		}
		if ($in_to_loc_nm.equalsIgnoreCase(name)) {
			in_to_loc_nm(value);
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
		if ($drct_dlv_typ.equalsIgnoreCase(name)) {
			drct_dlv_typ(value);
			return;
		}
		if ($drct_dlv_typ_nm.equalsIgnoreCase(name)) {
			drct_dlv_typ_nm(value);
			return;
		}
		if ($outsrc_sppl_cd.equalsIgnoreCase(name)) {
			outsrc_sppl_cd(value);
			return;
		}
		if ($loc_mng_typ.equalsIgnoreCase(name)) {
			loc_mng_typ(value);
			return;
		}
		if ($in_to_loc_cal_cd.equalsIgnoreCase(name)) {
			in_to_loc_cal_cd(value);
			return;
		}
		if ($site_cd.equalsIgnoreCase(name)) {
			site_cd(value);
			return;
		}
		if ($lg_grp_cd.equalsIgnoreCase(name)) {
			lg_grp_cd(value);
			return;
		}
		if ($loc_grp_cd.equalsIgnoreCase(name)) {
			loc_grp_cd(value);
			return;
		}
		if ($bef_in_to_loc_wg_cd.equalsIgnoreCase(name)) {
			bef_in_to_loc_wg_cd(value);
			return;
		}
		if ($bef_lg_grp_cd.equalsIgnoreCase(name)) {
			bef_lg_grp_cd(value);
			return;
		}
		if ($bef_loc_grp_cd.equalsIgnoreCase(name)) {
			bef_loc_grp_cd(value);
			return;
		}
		if ($iv_itm_nm.equalsIgnoreCase(name)) {
			iv_itm_nm(value);
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
		if ($stk_mng_typ.equalsIgnoreCase(name)) {
			stk_mng_typ(value);
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
		if ($purc_basis_typ.equalsIgnoreCase(name)) {
			purc_basis_typ(value);
			return;
		}
		if ($purc_basis_typ_nm.equalsIgnoreCase(name)) {
			purc_basis_typ_nm(value);
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
		if ($bp_lot_no.equalsIgnoreCase(name)) {
			bp_lot_no(value);
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
		if ($ap_dpt_cd.equalsIgnoreCase(name)) {
			ap_dpt_cd(value);
			return;
		}
		if ($ap_dpt_nm.equalsIgnoreCase(name)) {
			ap_dpt_nm(value);
			return;
		}
		if ($dlv_cal_cd.equalsIgnoreCase(name)) {
			dlv_cal_cd(value);
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
		if ($cont_fctr_rnd_typ.equalsIgnoreCase(name)) {
			cont_fctr_rnd_typ(value);
			return;
		}
		if ($purc_sts_typ.equalsIgnoreCase(name)) {
			purc_sts_typ(value);
			return;
		}
		if ($purc_sts_typ_nm.equalsIgnoreCase(name)) {
			purc_sts_typ_nm(value);
			return;
		}
		if ($purc_upri_req_typ.equalsIgnoreCase(name)) {
			purc_upri_req_typ(value);
			return;
		}
		if ($purc_upri_req_typ_nm.equalsIgnoreCase(name)) {
			purc_upri_req_typ_nm(value);
			return;
		}
		if ($outsrc_upri_typ.equalsIgnoreCase(name)) {
			outsrc_upri_typ(value);
			return;
		}
		if ($old_dscnt_rsn_cd.equalsIgnoreCase(name)) {
			old_dscnt_rsn_cd(value);
			return;
		}
		if ($old_dscnt_rsn_nm.equalsIgnoreCase(name)) {
			old_dscnt_rsn_nm(value);
			return;
		}
		if ($mfg_loc_cd.equalsIgnoreCase(name)) {
			mfg_loc_cd(value);
			return;
		}
		if ($mfg_loc_nm.equalsIgnoreCase(name)) {
			mfg_loc_nm(value);
			return;
		}
		if ($bom_ptn.equalsIgnoreCase(name)) {
			bom_ptn(value);
			return;
		}
		if ($outsrc_itm_ord_no.equalsIgnoreCase(name)) {
			outsrc_itm_ord_no(value);
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
		if ($po_cnt_rmrks.equalsIgnoreCase(name)) {
			po_cnt_rmrks(value);
			return;
		}
		if ($intr_rmrks.equalsIgnoreCase(name)) {
			intr_rmrks(value);
			return;
		}
		if ($trd_d_rmrks.equalsIgnoreCase(name)) {
			trd_d_rmrks(value);
			return;
		}
		if ($po_print_d_rmrks.equalsIgnoreCase(name)) {
			po_print_d_rmrks(value);
			return;
		}
		if ($dlv_slip_d_rmrks.equalsIgnoreCase(name)) {
			dlv_slip_d_rmrks(value);
			return;
		}
		if ($arr_cnt_rmrks.equalsIgnoreCase(name)) {
			arr_cnt_rmrks(value);
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
		if ($edi_sub_d_char1.equalsIgnoreCase(name)) {
			edi_sub_d_char1(value);
			return;
		}
		if ($edi_sub_d_char2.equalsIgnoreCase(name)) {
			edi_sub_d_char2(value);
			return;
		}
		if ($edi_sub_d_char3.equalsIgnoreCase(name)) {
			edi_sub_d_char3(value);
			return;
		}
		if ($edi_sub_d_char4.equalsIgnoreCase(name)) {
			edi_sub_d_char4(value);
			return;
		}
		if ($edi_sub_d_char5.equalsIgnoreCase(name)) {
			edi_sub_d_char5(value);
			return;
		}
		if ($ext_po_d_no.equalsIgnoreCase(name)) {
			ext_po_d_no(value);
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
		if ($dlv_slip_no.equalsIgnoreCase(name)) {
			dlv_slip_no(value);
			return;
		}
		if ($purc_ddlv_dlv_slip_no.equalsIgnoreCase(name)) {
			purc_ddlv_dlv_slip_no(value);
			return;
		}
		if ($dlv_slip_mng_no.equalsIgnoreCase(name)) {
			dlv_slip_mng_no(value);
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
		if ($rqst_fr_usr_cd.equalsIgnoreCase(name)) {
			rqst_fr_usr_cd(value);
			return;
		}
		if ($rqst_fr_usr_nm.equalsIgnoreCase(name)) {
			rqst_fr_usr_nm(value);
			return;
		}
		if ($rqst_fr_dpt_cd.equalsIgnoreCase(name)) {
			rqst_fr_dpt_cd(value);
			return;
		}
		if ($rqst_fr_dpt_nm.equalsIgnoreCase(name)) {
			rqst_fr_dpt_nm(value);
			return;
		}
		if ($po_schd_no.equalsIgnoreCase(name)) {
			po_schd_no(value);
			return;
		}
		if ($po_d_no.equalsIgnoreCase(name)) {
			po_d_no(value);
			return;
		}
		if ($mfg_loc_wg_cd.equalsIgnoreCase(name)) {
			mfg_loc_wg_cd(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($dtl_peg_no.equalsIgnoreCase(name)) {
			dtl_peg_no(value);
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
		if ($cont_fctr_dec_place.equalsIgnoreCase(name)) {
			cont_fctr_dec_place(value);
			return;
		}
		if ($dlv_inst_qty.equalsIgnoreCase(name)) {
			dlv_inst_qty(value);
			return;
		}
		if ($dlv_inst_prms_rcpt_qty.equalsIgnoreCase(name)) {
			dlv_inst_prms_rcpt_qty(value);
			return;
		}
		if ($rcpt_iv_qty.equalsIgnoreCase(name)) {
			rcpt_iv_qty(value);
			return;
		}
		if ($arr_qty.equalsIgnoreCase(name)) {
			arr_qty(value);
			return;
		}
		if ($purc_qty.equalsIgnoreCase(name)) {
			purc_qty(value);
			return;
		}
		if ($pay_crryovr_times.equalsIgnoreCase(name)) {
			pay_crryovr_times(value);
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
		if ($old_trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			old_trd_cur_dscnt_amt(value);
			return;
		}
		if ($wtax_rate.equalsIgnoreCase(name)) {
			wtax_rate(value);
			return;
		}
		if ($edi_sub_d_num1.equalsIgnoreCase(name)) {
			edi_sub_d_num1(value);
			return;
		}
		if ($dlv_slip_seq.equalsIgnoreCase(name)) {
			dlv_slip_seq(value);
			return;
		}
		if ($dlv_slip_mng_seq.equalsIgnoreCase(name)) {
			dlv_slip_mng_seq(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($dtl_peg_no.equalsIgnoreCase(name)) {
			dtl_peg_no(value);
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
		if ($cont_fctr_dec_place.equalsIgnoreCase(name)) {
			cont_fctr_dec_place(value);
			return;
		}
		if ($dlv_inst_qty.equalsIgnoreCase(name)) {
			dlv_inst_qty(value);
			return;
		}
		if ($dlv_inst_prms_rcpt_qty.equalsIgnoreCase(name)) {
			dlv_inst_prms_rcpt_qty(value);
			return;
		}
		if ($rcpt_iv_qty.equalsIgnoreCase(name)) {
			rcpt_iv_qty(value);
			return;
		}
		if ($arr_qty.equalsIgnoreCase(name)) {
			arr_qty(value);
			return;
		}
		if ($purc_qty.equalsIgnoreCase(name)) {
			purc_qty(value);
			return;
		}
		if ($pay_crryovr_times.equalsIgnoreCase(name)) {
			pay_crryovr_times(value);
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
		if ($old_trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			old_trd_cur_dscnt_amt(value);
			return;
		}
		if ($wtax_rate.equalsIgnoreCase(name)) {
			wtax_rate(value);
			return;
		}
		if ($edi_sub_d_num1.equalsIgnoreCase(name)) {
			edi_sub_d_num1(value);
			return;
		}
		if ($dlv_slip_seq.equalsIgnoreCase(name)) {
			dlv_slip_seq(value);
			return;
		}
		if ($dlv_slip_mng_seq.equalsIgnoreCase(name)) {
			dlv_slip_mng_seq(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($dtl_peg_no.equalsIgnoreCase(name)) {
			dtl_peg_no(value);
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
		if ($cont_fctr_dec_place.equalsIgnoreCase(name)) {
			cont_fctr_dec_place(value);
			return;
		}
		if ($dlv_inst_qty.equalsIgnoreCase(name)) {
			dlv_inst_qty(value);
			return;
		}
		if ($dlv_inst_prms_rcpt_qty.equalsIgnoreCase(name)) {
			dlv_inst_prms_rcpt_qty(value);
			return;
		}
		if ($rcpt_iv_qty.equalsIgnoreCase(name)) {
			rcpt_iv_qty(value);
			return;
		}
		if ($arr_qty.equalsIgnoreCase(name)) {
			arr_qty(value);
			return;
		}
		if ($purc_qty.equalsIgnoreCase(name)) {
			purc_qty(value);
			return;
		}
		if ($pay_crryovr_times.equalsIgnoreCase(name)) {
			pay_crryovr_times(value);
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
		if ($old_trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			old_trd_cur_dscnt_amt(value);
			return;
		}
		if ($wtax_rate.equalsIgnoreCase(name)) {
			wtax_rate(value);
			return;
		}
		if ($edi_sub_d_num1.equalsIgnoreCase(name)) {
			edi_sub_d_num1(value);
			return;
		}
		if ($dlv_slip_seq.equalsIgnoreCase(name)) {
			dlv_slip_seq(value);
			return;
		}
		if ($dlv_slip_mng_seq.equalsIgnoreCase(name)) {
			dlv_slip_mng_seq(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($dtl_peg_no.equalsIgnoreCase(name)) {
			dtl_peg_no(value);
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
		if ($cont_fctr_dec_place.equalsIgnoreCase(name)) {
			cont_fctr_dec_place(value);
			return;
		}
		if ($dlv_inst_qty.equalsIgnoreCase(name)) {
			dlv_inst_qty(value);
			return;
		}
		if ($dlv_inst_prms_rcpt_qty.equalsIgnoreCase(name)) {
			dlv_inst_prms_rcpt_qty(value);
			return;
		}
		if ($rcpt_iv_qty.equalsIgnoreCase(name)) {
			rcpt_iv_qty(value);
			return;
		}
		if ($arr_qty.equalsIgnoreCase(name)) {
			arr_qty(value);
			return;
		}
		if ($purc_qty.equalsIgnoreCase(name)) {
			purc_qty(value);
			return;
		}
		if ($pay_crryovr_times.equalsIgnoreCase(name)) {
			pay_crryovr_times(value);
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
		if ($old_trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			old_trd_cur_dscnt_amt(value);
			return;
		}
		if ($wtax_rate.equalsIgnoreCase(name)) {
			wtax_rate(value);
			return;
		}
		if ($edi_sub_d_num1.equalsIgnoreCase(name)) {
			edi_sub_d_num1(value);
			return;
		}
		if ($dlv_slip_seq.equalsIgnoreCase(name)) {
			dlv_slip_seq(value);
			return;
		}
		if ($dlv_slip_mng_seq.equalsIgnoreCase(name)) {
			dlv_slip_mng_seq(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($dtl_peg_no.equalsIgnoreCase(name)) {
			dtl_peg_no(value);
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
		if ($cont_fctr_dec_place.equalsIgnoreCase(name)) {
			cont_fctr_dec_place(value);
			return;
		}
		if ($dlv_inst_qty.equalsIgnoreCase(name)) {
			dlv_inst_qty(value);
			return;
		}
		if ($dlv_inst_prms_rcpt_qty.equalsIgnoreCase(name)) {
			dlv_inst_prms_rcpt_qty(value);
			return;
		}
		if ($rcpt_iv_qty.equalsIgnoreCase(name)) {
			rcpt_iv_qty(value);
			return;
		}
		if ($arr_qty.equalsIgnoreCase(name)) {
			arr_qty(value);
			return;
		}
		if ($purc_qty.equalsIgnoreCase(name)) {
			purc_qty(value);
			return;
		}
		if ($pay_crryovr_times.equalsIgnoreCase(name)) {
			pay_crryovr_times(value);
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
		if ($old_trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			old_trd_cur_dscnt_amt(value);
			return;
		}
		if ($wtax_rate.equalsIgnoreCase(name)) {
			wtax_rate(value);
			return;
		}
		if ($edi_sub_d_num1.equalsIgnoreCase(name)) {
			edi_sub_d_num1(value);
			return;
		}
		if ($dlv_slip_seq.equalsIgnoreCase(name)) {
			dlv_slip_seq(value);
			return;
		}
		if ($dlv_slip_mng_seq.equalsIgnoreCase(name)) {
			dlv_slip_mng_seq(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($rqst_avl_rqst_dt.equalsIgnoreCase(name)) {
			rqst_avl_rqst_dt(value);
			return;
		}
		if ($purc_schd_dt.equalsIgnoreCase(name)) {
			purc_schd_dt(value);
			return;
		}
		if ($po_conf_rcpt_dt.equalsIgnoreCase(name)) {
			po_conf_rcpt_dt(value);
			return;
		}
		if ($edi_sub_d_dt1.equalsIgnoreCase(name)) {
			edi_sub_d_dt1(value);
			return;
		}
		if ($base_dt.equalsIgnoreCase(name)) {
			base_dt(value);
			return;
		}
		if ($po_dt.equalsIgnoreCase(name)) {
			po_dt(value);
			return;
		}
		super.setDateNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($check.equalsIgnoreCase(name)) {
			check(value);
			return;
		}
		if ($pri_prnt_flg.equalsIgnoreCase(name)) {
			pri_prnt_flg(value);
			return;
		}
		if ($str_ln_tgt_flg.equalsIgnoreCase(name)) {
			str_ln_tgt_flg(value);
			return;
		}
		if ($sundry_itm_flg.equalsIgnoreCase(name)) {
			sundry_itm_flg(value);
			return;
		}
		if ($arr_skip_flg.equalsIgnoreCase(name)) {
			arr_skip_flg(value);
			return;
		}
		if ($purc_dlv_slip_flg.equalsIgnoreCase(name)) {
			purc_dlv_slip_flg(value);
			return;
		}
		if ($sync_flg.equalsIgnoreCase(name)) {
			sync_flg(value);
			return;
		}
		if ($itm_purc_upri_cng_flg.equalsIgnoreCase(name)) {
			itm_purc_upri_cng_flg(value);
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
		if ($po_conf_rcpt_flg.equalsIgnoreCase(name)) {
			po_conf_rcpt_flg(value);
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
		if ($cont_fctr_flg.equalsIgnoreCase(name)) {
			cont_fctr_flg(value);
			return;
		}
		if ($arr_schd_split_flg.equalsIgnoreCase(name)) {
			arr_schd_split_flg(value);
			return;
		}
		if ($arr_cmpl_flg.equalsIgnoreCase(name)) {
			arr_cmpl_flg(value);
			return;
		}
		if ($purc_cmpl_flg.equalsIgnoreCase(name)) {
			purc_cmpl_flg(value);
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
		if ($outsrc_flg.equalsIgnoreCase(name)) {
			outsrc_flg(value);
			return;
		}
		if ($mfg_inst_flg.equalsIgnoreCase(name)) {
			mfg_inst_flg(value);
			return;
		}
		if ($xpns_purc_flg.equalsIgnoreCase(name)) {
			xpns_purc_flg(value);
			return;
		}
		if ($not_xpns_purc_flg.equalsIgnoreCase(name)) {
			not_xpns_purc_flg(value);
			return;
		}
		if ($rqst_can_flg.equalsIgnoreCase(name)) {
			rqst_can_flg(value);
			return;
		}
		if ($dlv_slip_invalid_flg.equalsIgnoreCase(name)) {
			dlv_slip_invalid_flg(value);
			return;
		}
		if ($bndl_flg.equalsIgnoreCase(name)) {
			bndl_flg(value);
			return;
		}
		if ($rqst_slo_flg.equalsIgnoreCase(name)) {
			rqst_slo_flg(value);
			return;
		}
		if ($arr_flg.equalsIgnoreCase(name)) {
			arr_flg(value);
			return;
		}
		if ($purc_flg.equalsIgnoreCase(name)) {
			purc_flg(value);
			return;
		}
		if ($rcpt_iv_flg.equalsIgnoreCase(name)) {
			rcpt_iv_flg(value);
			return;
		}
		if ($po_schd_flg.equalsIgnoreCase(name)) {
			po_schd_flg(value);
			return;
		}
		if ($arr_rem_abort_flg.equalsIgnoreCase(name)) {
			arr_rem_abort_flg(value);
			return;
		}
		if ($purc_rem_abort_flg.equalsIgnoreCase(name)) {
			purc_rem_abort_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}

	public MCRow getInnerRow(String name) {
		if ($in_to_loc_p.equalsIgnoreCase(name)) {
			return in_to_loc_p();
		}
		if ($dlv_rqst_tm_p.equalsIgnoreCase(name)) {
			return dlv_rqst_tm_p();
		}
		if ($itm_p.equalsIgnoreCase(name)) {
			return itm_p();
		}
		if ($str_ln_p.equalsIgnoreCase(name)) {
			return str_ln_p();
		}
		if ($rqst_dlv_rqst_tm_p.equalsIgnoreCase(name)) {
			return rqst_dlv_rqst_tm_p();
		}
		if ($ver_no_p.equalsIgnoreCase(name)) {
			return ver_no_p();
		}
		if ($dlv_p.equalsIgnoreCase(name)) {
			return dlv_p();
		}
		if ($tdlv_p.equalsIgnoreCase(name)) {
			return tdlv_p();
		}
		if ($trd_unit_qty_p.equalsIgnoreCase(name)) {
			return trd_unit_qty_p();
		}
		if ($base_unit_qty_p.equalsIgnoreCase(name)) {
			return base_unit_qty_p();
		}
		if ($inst_cont_qty_p.equalsIgnoreCase(name)) {
			return inst_cont_qty_p();
		}
		if ($cont_unit_p.equalsIgnoreCase(name)) {
			return cont_unit_p();
		}
		if ($std_cont_p.equalsIgnoreCase(name)) {
			return std_cont_p();
		}
		if ($trd_cur_upri_p.equalsIgnoreCase(name)) {
			return trd_cur_upri_p();
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
		if ($base_cur_upri_p.equalsIgnoreCase(name)) {
			return base_cur_upri_p();
		}
		if ($base_cur_dscnt_amt_p.equalsIgnoreCase(name)) {
			return base_cur_dscnt_amt_p();
		}
		if ($base_cur_amt_p.equalsIgnoreCase(name)) {
			return base_cur_amt_p();
		}
		if ($base_cur_tax_amt_p.equalsIgnoreCase(name)) {
			return base_cur_tax_amt_p();
		}
		if ($base_cur_inc_tax_amt_p.equalsIgnoreCase(name)) {
			return base_cur_inc_tax_amt_p();
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
		if ($ptax_cur_upri_p.equalsIgnoreCase(name)) {
			return ptax_cur_upri_p();
		}
		if ($ptax_cur_dscnt_amt_p.equalsIgnoreCase(name)) {
			return ptax_cur_dscnt_amt_p();
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
		if ($sno_wrk_no_p.equalsIgnoreCase(name)) {
			return sno_wrk_no_p();
		}
		if ($bditm_p.equalsIgnoreCase(name)) {
			return bditm_p();
		}
		return super.getInnerRow(name);
	}

	public void setInnerRow(String name, MCRow value) {
		if ($in_to_loc_p.equalsIgnoreCase(name)) {
			in_to_loc_p(
				((MCContainerMeta) in_to_loc_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5360.AddrR.class, value)
			);
			return;
		}
		if ($dlv_rqst_tm_p.equalsIgnoreCase(name)) {
			dlv_rqst_tm_p(
				((MCContainerMeta) dlv_rqst_tm_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5320.YmdHmR.class, value)
			);
			return;
		}
		if ($itm_p.equalsIgnoreCase(name)) {
			itm_p(
				((MCContainerMeta) itm_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5030.ItmR.class, value)
			);
			return;
		}
		if ($str_ln_p.equalsIgnoreCase(name)) {
			str_ln_p(
				((MCContainerMeta) str_ln_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5120.StrLnR.class, value)
			);
			return;
		}
		if ($rqst_dlv_rqst_tm_p.equalsIgnoreCase(name)) {
			rqst_dlv_rqst_tm_p(
				((MCContainerMeta) rqst_dlv_rqst_tm_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5320.YmdHmR.class, value)
			);
			return;
		}
		if ($ver_no_p.equalsIgnoreCase(name)) {
			ver_no_p(
				((MCContainerMeta) ver_no_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5250.VerNoR.class, value)
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
		if ($inst_cont_qty_p.equalsIgnoreCase(name)) {
			inst_cont_qty_p(
				((MCContainerMeta) inst_cont_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5260.ContQtyR.class, value)
			);
			return;
		}
		if ($cont_unit_p.equalsIgnoreCase(name)) {
			cont_unit_p(
				((MCContainerMeta) cont_unit_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5270.ContFctrUnitR.class, value)
			);
			return;
		}
		if ($std_cont_p.equalsIgnoreCase(name)) {
			std_cont_p(
				((MCContainerMeta) std_cont_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5280.StdContFctrR.class, value)
			);
			return;
		}
		if ($trd_cur_upri_p.equalsIgnoreCase(name)) {
			trd_cur_upri_p(
				((MCContainerMeta) trd_cur_upri_p_META).castInnerRow(mcframe.clientMSUB.MSUBP5070.TrdUpriAmtR.class, value)
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
		if ($base_cur_upri_p.equalsIgnoreCase(name)) {
			base_cur_upri_p(
				((MCContainerMeta) base_cur_upri_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5060.UpriR.class, value)
			);
			return;
		}
		if ($base_cur_dscnt_amt_p.equalsIgnoreCase(name)) {
			base_cur_dscnt_amt_p(
				((MCContainerMeta) base_cur_dscnt_amt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5050.AmtR.class, value)
			);
			return;
		}
		if ($base_cur_amt_p.equalsIgnoreCase(name)) {
			base_cur_amt_p(
				((MCContainerMeta) base_cur_amt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5050.AmtR.class, value)
			);
			return;
		}
		if ($base_cur_tax_amt_p.equalsIgnoreCase(name)) {
			base_cur_tax_amt_p(
				((MCContainerMeta) base_cur_tax_amt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5050.AmtR.class, value)
			);
			return;
		}
		if ($base_cur_inc_tax_amt_p.equalsIgnoreCase(name)) {
			base_cur_inc_tax_amt_p(
				((MCContainerMeta) base_cur_inc_tax_amt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5050.AmtR.class, value)
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
		if ($ptax_cur_upri_p.equalsIgnoreCase(name)) {
			ptax_cur_upri_p(
				((MCContainerMeta) ptax_cur_upri_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5060.UpriR.class, value)
			);
			return;
		}
		if ($ptax_cur_dscnt_amt_p.equalsIgnoreCase(name)) {
			ptax_cur_dscnt_amt_p(
				((MCContainerMeta) ptax_cur_dscnt_amt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5050.AmtR.class, value)
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
		if ($sno_wrk_no_p.equalsIgnoreCase(name)) {
			sno_wrk_no_p(
				((MCContainerMeta) sno_wrk_no_p_META).castInnerRow(mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.class, value)
			);
			return;
		}
		if ($bditm_p.equalsIgnoreCase(name)) {
			bditm_p(
				((MCContainerMeta) bditm_p_META).castInnerRow(mcframe.clientMSUB.MSUBP5040.BdItemR.class, value)
			);
			return;
		}
		super.setInnerRow(name, value);
	}


	/**
	 * Delivery location zip code 納入場所郵便番号.<p>
	 *
	 */
	public String in_to_loc_zip_cd() {
		return in_to_loc_p().zip_cd();
	}

	/**
	 * Delivery location zip code 納入場所郵便番号.<p>
	 *
	 */
	public void in_to_loc_zip_cd(String value) {
		in_to_loc_p().zip_cd(value);
	}

	/**
	 * Delivery location address 1 納入場所住所１.<p>
	 *
	 */
	public String in_to_loc_addr1() {
		return in_to_loc_p().addr1();
	}

	/**
	 * Delivery location address 1 納入場所住所１.<p>
	 *
	 */
	public void in_to_loc_addr1(String value) {
		in_to_loc_p().addr1(value);
	}

	/**
	 * Delivery location address 2 納入場所住所２.<p>
	 *
	 */
	public String in_to_loc_addr2() {
		return in_to_loc_p().addr2();
	}

	/**
	 * Delivery location address 2 納入場所住所２.<p>
	 *
	 */
	public void in_to_loc_addr2(String value) {
		in_to_loc_p().addr2(value);
	}

	/**
	 * Delivery location address 3 納入場所住所３.<p>
	 *
	 */
	public String in_to_loc_addr3() {
		return in_to_loc_p().addr3();
	}

	/**
	 * Delivery location address 3 納入場所住所３.<p>
	 *
	 */
	public void in_to_loc_addr3(String value) {
		in_to_loc_p().addr3(value);
	}

	/**
	 * Delivery location address 4 納入場所住所４.<p>
	 *
	 */
	public String in_to_loc_addr4() {
		return in_to_loc_p().addr4();
	}

	/**
	 * Delivery location address 4 納入場所住所４.<p>
	 *
	 */
	public void in_to_loc_addr4(String value) {
		in_to_loc_p().addr4(value);
	}

	/**
	 * Delivery location TEL 納入場所ＴＥＬ.<p>
	 *
	 */
	public String in_to_loc_tel() {
		return in_to_loc_p().tel();
	}

	/**
	 * Delivery location TEL 納入場所ＴＥＬ.<p>
	 *
	 */
	public void in_to_loc_tel(String value) {
		in_to_loc_p().tel(value);
	}

	/**
	 * Delivery location FAX 納入場所ＦＡＸ.<p>
	 *
	 */
	public String in_to_loc_fax() {
		return in_to_loc_p().fax();
	}

	/**
	 * Delivery location FAX 納入場所ＦＡＸ.<p>
	 *
	 */
	public void in_to_loc_fax(String value) {
		in_to_loc_p().fax(value);
	}

	/**
	 * Desired delivery date 納入希望日.<p>
	 *
	 */
	public MCDate dlv_rqst_dt() {
		return dlv_rqst_tm_p().ymd();
	}

	/**
	 * Desired delivery date 納入希望日.<p>
	 *
	 */
	public void dlv_rqst_dt(MCDate value) {
		dlv_rqst_tm_p().ymd(value);
	}

	/**
	 * Desired delivery time 納入希望時刻.<p>
	 *
	 */
	public MCDate dlv_rqst_hm() {
		return dlv_rqst_tm_p().hm();
	}

	/**
	 * Desired delivery time 納入希望時刻.<p>
	 *
	 */
	public void dlv_rqst_hm(MCDate value) {
		dlv_rqst_tm_p().hm(value);
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

	public String str_ln_cd() {
		return str_ln_p().str_ln_cd();
	}

	public void str_ln_cd(String value) {
		str_ln_p().str_ln_cd(value);
	}

	public String str_ln_nm() {
		return str_ln_p().str_ln_nm();
	}

	public void str_ln_nm(String value) {
		str_ln_p().str_ln_nm(value);
	}

	public boolean str_ln_cd_none_flg() {
		return str_ln_p().str_ln_cd_none_flg();
	}

	public void str_ln_cd_none_flg(boolean value) {
		str_ln_p().str_ln_cd_none_flg(value);
	}

	/**
	 * Request source desired delivery date 依頼元納入希望日.<p>
	 *
	 */
	public MCDate rqst_dlv_rqst_dt() {
		return rqst_dlv_rqst_tm_p().ymd();
	}

	/**
	 * Request source desired delivery date 依頼元納入希望日.<p>
	 *
	 */
	public void rqst_dlv_rqst_dt(MCDate value) {
		rqst_dlv_rqst_tm_p().ymd(value);
	}

	/**
	 * Request source desired delivery time 依頼元納入希望時刻.<p>
	 *
	 */
	public MCDate rqst_dlv_rqst_hm() {
		return rqst_dlv_rqst_tm_p().hm();
	}

	/**
	 * Request source desired delivery time 依頼元納入希望時刻.<p>
	 *
	 */
	public void rqst_dlv_rqst_hm(MCDate value) {
		rqst_dlv_rqst_tm_p().hm(value);
	}

	public String ver_no() {
		return ver_no_p().ver_no();
	}

	public void ver_no(String value) {
		ver_no_p().ver_no(value);
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
	 * Standard active ingredient 標準有効成分.<p>
	 *
	 */
	public MCNumber cont_qty() {
		return inst_cont_qty_p().cont_qty();
	}

	/**
	 * Standard active ingredient 標準有効成分.<p>
	 *
	 */
	public void cont_qty(MCNumber value) {
		inst_cont_qty_p().cont_qty(value);
	}

	/**
	 * Standard active ingredient 標準有効成分.<p>
	 *
	 */
	public void cont_qty(int value) {
		inst_cont_qty_p().cont_qty(value);
	}

	/**
	 * Standard active ingredient 標準有効成分.<p>
	 *
	 */
	public void cont_qty(long value) {
		inst_cont_qty_p().cont_qty(value);
	}

	/**
	 * Standard active ingredient 標準有効成分.<p>
	 *
	 */
	public void cont_qty(float value) {
		inst_cont_qty_p().cont_qty(value);
	}

	/**
	 * Standard active ingredient 標準有効成分.<p>
	 *
	 */
	public void cont_qty(double value) {
		inst_cont_qty_p().cont_qty(value);
	}

	public String cont_fctr_unit_cd() {
		return cont_unit_p().cont_fctr_unit_cd();
	}

	public void cont_fctr_unit_cd(String value) {
		cont_unit_p().cont_fctr_unit_cd(value);
	}

	public String cont_fctr_unit_nm() {
		return cont_unit_p().cont_fctr_unit_nm();
	}

	public void cont_fctr_unit_nm(String value) {
		cont_unit_p().cont_fctr_unit_nm(value);
	}

	public MCNumber std_cont_fctr() {
		return std_cont_p().std_cont_fctr();
	}

	public void std_cont_fctr(MCNumber value) {
		std_cont_p().std_cont_fctr(value);
	}

	public void std_cont_fctr(int value) {
		std_cont_p().std_cont_fctr(value);
	}

	public void std_cont_fctr(long value) {
		std_cont_p().std_cont_fctr(value);
	}

	public void std_cont_fctr(float value) {
		std_cont_p().std_cont_fctr(value);
	}

	public void std_cont_fctr(double value) {
		std_cont_p().std_cont_fctr(value);
	}

	public boolean upri_not_tgt_flg() {
		return trd_cur_upri_p().upri_not_tgt_flg();
	}

	public void upri_not_tgt_flg(boolean value) {
		trd_cur_upri_p().upri_not_tgt_flg(value);
	}

	public MCNumber trd_cur_upri() {
		return trd_cur_upri_p().trd_cur_upri();
	}

	public void trd_cur_upri(MCNumber value) {
		trd_cur_upri_p().trd_cur_upri(value);
	}

	public void trd_cur_upri(int value) {
		trd_cur_upri_p().trd_cur_upri(value);
	}

	public void trd_cur_upri(long value) {
		trd_cur_upri_p().trd_cur_upri(value);
	}

	public void trd_cur_upri(float value) {
		trd_cur_upri_p().trd_cur_upri(value);
	}

	public void trd_cur_upri(double value) {
		trd_cur_upri_p().trd_cur_upri(value);
	}

	public boolean interim_flg() {
		return trd_cur_upri_p().interim_flg();
	}

	public void interim_flg(boolean value) {
		trd_cur_upri_p().interim_flg(value);
	}

	public MCNumber trd_cur_amt() {
		return trd_cur_upri_p().trd_cur_amt();
	}

	public void trd_cur_amt(MCNumber value) {
		trd_cur_upri_p().trd_cur_amt(value);
	}

	public void trd_cur_amt(int value) {
		trd_cur_upri_p().trd_cur_amt(value);
	}

	public void trd_cur_amt(long value) {
		trd_cur_upri_p().trd_cur_amt(value);
	}

	public void trd_cur_amt(float value) {
		trd_cur_upri_p().trd_cur_amt(value);
	}

	public void trd_cur_amt(double value) {
		trd_cur_upri_p().trd_cur_amt(value);
	}

	public MCNumber trd_cur_inc_tax_amt() {
		return trd_cur_upri_p().trd_cur_inc_tax_amt();
	}

	public void trd_cur_inc_tax_amt(MCNumber value) {
		trd_cur_upri_p().trd_cur_inc_tax_amt(value);
	}

	public void trd_cur_inc_tax_amt(int value) {
		trd_cur_upri_p().trd_cur_inc_tax_amt(value);
	}

	public void trd_cur_inc_tax_amt(long value) {
		trd_cur_upri_p().trd_cur_inc_tax_amt(value);
	}

	public void trd_cur_inc_tax_amt(float value) {
		trd_cur_upri_p().trd_cur_inc_tax_amt(value);
	}

	public void trd_cur_inc_tax_amt(double value) {
		trd_cur_upri_p().trd_cur_inc_tax_amt(value);
	}

	public boolean tax_fix_flg() {
		return trd_cur_upri_p().tax_fix_flg();
	}

	public void tax_fix_flg(boolean value) {
		trd_cur_upri_p().tax_fix_flg(value);
	}

	public String tax_cd() {
		return trd_cur_upri_p().tax_cd();
	}

	public void tax_cd(String value) {
		trd_cur_upri_p().tax_cd(value);
	}

	public String tax_nm() {
		return trd_cur_upri_p().tax_nm();
	}

	public void tax_nm(String value) {
		trd_cur_upri_p().tax_nm(value);
	}

	public MCNumber tax_rate() {
		return trd_cur_upri_p().tax_rate();
	}

	public void tax_rate(MCNumber value) {
		trd_cur_upri_p().tax_rate(value);
	}

	public void tax_rate(int value) {
		trd_cur_upri_p().tax_rate(value);
	}

	public void tax_rate(long value) {
		trd_cur_upri_p().tax_rate(value);
	}

	public void tax_rate(float value) {
		trd_cur_upri_p().tax_rate(value);
	}

	public void tax_rate(double value) {
		trd_cur_upri_p().tax_rate(value);
	}

	public String tax_typ() {
		return trd_cur_upri_p().tax_typ();
	}

	public void tax_typ(String value) {
		trd_cur_upri_p().tax_typ(value);
	}

	public boolean inc_tax_flg() {
		return trd_cur_upri_p().inc_tax_flg();
	}

	public void inc_tax_flg(boolean value) {
		trd_cur_upri_p().inc_tax_flg(value);
	}

	public MCNumber trd_cur_tax_amt() {
		return trd_cur_upri_p().trd_cur_tax_amt();
	}

	public void trd_cur_tax_amt(MCNumber value) {
		trd_cur_upri_p().trd_cur_tax_amt(value);
	}

	public void trd_cur_tax_amt(int value) {
		trd_cur_upri_p().trd_cur_tax_amt(value);
	}

	public void trd_cur_tax_amt(long value) {
		trd_cur_upri_p().trd_cur_tax_amt(value);
	}

	public void trd_cur_tax_amt(float value) {
		trd_cur_upri_p().trd_cur_tax_amt(value);
	}

	public void trd_cur_tax_amt(double value) {
		trd_cur_upri_p().trd_cur_tax_amt(value);
	}

	public MCNumber trd_cur_dscnt_amt() {
		return trd_cur_upri_p().trd_cur_dscnt_amt();
	}

	public void trd_cur_dscnt_amt(MCNumber value) {
		trd_cur_upri_p().trd_cur_dscnt_amt(value);
	}

	public void trd_cur_dscnt_amt(int value) {
		trd_cur_upri_p().trd_cur_dscnt_amt(value);
	}

	public void trd_cur_dscnt_amt(long value) {
		trd_cur_upri_p().trd_cur_dscnt_amt(value);
	}

	public void trd_cur_dscnt_amt(float value) {
		trd_cur_upri_p().trd_cur_dscnt_amt(value);
	}

	public void trd_cur_dscnt_amt(double value) {
		trd_cur_upri_p().trd_cur_dscnt_amt(value);
	}

	public String dscnt_rsn_cd() {
		return trd_cur_upri_p().dscnt_rsn_cd();
	}

	public void dscnt_rsn_cd(String value) {
		trd_cur_upri_p().dscnt_rsn_cd(value);
	}

	public String dscnt_rsn_nm() {
		return trd_cur_upri_p().dscnt_rsn_nm();
	}

	public void dscnt_rsn_nm(String value) {
		trd_cur_upri_p().dscnt_rsn_nm(value);
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

}

