package mcframe.clientMSBE.MSBEP1010;

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
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public static final String $peg_no = "peg_no";
	/**
	 * Select 選択.<p>
	 *
	 */
	public static final String $check = "check";
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
	public static final String $itm_p = "itm_p";
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
	 * Asset management type 資産管理区分.<p>
	 *
	 */
	public static final String $asset_mng_typ = "asset_mng_typ";
	/**
	 * Allocation 引当.<p>
	 *
	 */
	public static final String $alloc_flg = "alloc_flg";
	/**
	 * Without lot ロット指定無.<p>
	 *
	 */
	public static final String $lot_none_flg = "lot_none_flg";
	public static final String $lot_no_p = "lot_no_p";
	/**
	 * For version control 版管理対象.<p>
	 *
	 */
	public static final String $def_ver_flg = "def_ver_flg";
	public static final String $ver_no_p = "ver_no_p";
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
	 * Transaction unit number of decimal places 取引単位小数部有効桁数.<p>
	 *
	 */
	public static final String $trd_unit_dec_place = "trd_unit_dec_place";
	/**
	 * Transaction unit rounding type 取引単位端数処理区分.<p>
	 *
	 */
	public static final String $trd_unit_rnd_typ = "trd_unit_rnd_typ";
	public static final String $trd_unit_qty_p = "trd_unit_qty_p";
	/**
	 * Cancel remaining schedule 予定打切.<p>
	 *
	 */
	public static final String $schd_abort_flg = "schd_abort_flg";
	/**
	 * Cancel remaining order 指図打切.<p>
	 *
	 */
	public static final String $inst_abort_flg = "inst_abort_flg";
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
	public static final String $base_unit_qty_p = "base_unit_qty_p";
	public static final String $base_unit_act_qty_p = "base_unit_act_qty_p";
	/**
	 * Aggregation まとめ.<p>
	 *
	 */
	public static final String $ttl_flg = "ttl_flg";
	/**
	 * Order aggregation 指図まとめ.<p>
	 *
	 */
	public static final String $inst_bndl_flg = "inst_bndl_flg";
	/**
	 * Order aggregation-from 指図まとめ元.<p>
	 *
	 */
	public static final String $inst_bndl_src_flg = "inst_bndl_src_flg";
	/**
	 * Packing unit cd. 梱包単位ＣＤ.<p>
	 *
	 */
	public static final String $pckg_unit_cd = "pckg_unit_cd";
	/**
	 * Packing unit name 梱包単位名.<p>
	 *
	 */
	public static final String $pckg_unit_nm = "pckg_unit_nm";
	/**
	 * Packing unit conversion base qty. 梱包単位換算基準数量.<p>
	 *
	 */
	public static final String $pckg_unit_conv_base_qty = "pckg_unit_conv_base_qty";
	/**
	 * Packing unit conversion qty. 梱包単位換算数量.<p>
	 *
	 */
	public static final String $pckg_unit_conv_qty = "pckg_unit_conv_qty";
	/**
	 * Packing unit number of decimal places 梱包単位小数部有効桁数.<p>
	 *
	 */
	public static final String $pckg_unit_dec_place = "pckg_unit_dec_place";
	public static final String $pckg_unit_qty_p = "pckg_unit_qty_p";
	/**
	 * Schedule unit cd. 予定単位ＣＤ.<p>
	 *
	 */
	public static final String $schd_unit_cd = "schd_unit_cd";
	/**
	 * Schedule unit name 予定単位名.<p>
	 *
	 */
	public static final String $schd_unit_nm = "schd_unit_nm";
	/**
	 * Schedule unit number of decimal places 予定単位小数部有効桁数.<p>
	 *
	 */
	public static final String $schd_unit_dec_place = "schd_unit_dec_place";
	public static final String $schd_qty_p = "schd_qty_p";
	/**
	 * For active ingredient 有効成分対象.<p>
	 *
	 */
	public static final String $cont_fctr_flg = "cont_fctr_flg";
	public static final String $cont_fctr_unit_p = "cont_fctr_unit_p";
	/**
	 * Active ingredient unit number of decimal places 有効成分単位小数部有効桁数.<p>
	 *
	 */
	public static final String $cont_fctr_dec_place = "cont_fctr_dec_place";
	/**
	 * Active ingredient unit rounding type 有効成分単位端数処理区分.<p>
	 *
	 */
	public static final String $cont_fctr_rnd_typ = "cont_fctr_rnd_typ";
	public static final String $act_cont_fctr_p = "act_cont_fctr_p";
	public static final String $act_cont_qty_p = "act_cont_qty_p";
	public static final String $std_cont_fctr_p = "std_cont_fctr_p";
	public static final String $std_cont_qty_p = "std_cont_qty_p";
	/**
	 * GI location cd. 出庫場所ＣＤ.<p>
	 *
	 */
	public static final String $gi_loc_cd = "gi_loc_cd";
	/**
	 * GI location name 出庫場所名.<p>
	 *
	 */
	public static final String $gi_loc_nm = "gi_loc_nm";
	/**
	 * GI factory/distribution warehouse cd. 出庫工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public static final String $gi_site_cd = "gi_site_cd";
	/**
	 * GI supplier cd. 出庫発注先ＣＤ.<p>
	 *
	 */
	public static final String $gi_sppl_cd = "gi_sppl_cd";
	/**
	 * For GI rack/line 出庫棚・ライン対象.<p>
	 *
	 */
	public static final String $gi_str_ln_tgt_flg = "gi_str_ln_tgt_flg";
	public static final String $gi_str_ln_p = "gi_str_ln_p";
	public static final String $gr_str_ln_p = "gr_str_ln_p";
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
	public static final String $sno_wrk_no_p = "sno_wrk_no_p";
	public static final String $alloc_sno_wrk_no_p = "alloc_sno_wrk_no_p";
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
	public static final String $stk_bp_p = "stk_bp_p";
	/**
	 * GI inventory arriving point cd. 出庫在庫着荷先ＣＤ.<p>
	 *
	 */
	public static final String $gi_stk_arrv_bp_cd = "gi_stk_arrv_bp_cd";
	/**
	 * GI inventory arriving point name 出庫在庫着荷先名.<p>
	 *
	 */
	public static final String $gi_stk_arrv_bp_nm = "gi_stk_arrv_bp_nm";
	/**
	 * Reason cd. 理由ＣＤ.<p>
	 *
	 */
	public static final String $rsn_cd = "rsn_cd";
	/**
	 * Reason name 理由名.<p>
	 *
	 */
	public static final String $rsn_nm = "rsn_nm";
	/**
	 * Other accounting GI 他勘定出庫.<p>
	 *
	 */
	public static final String $acxfr_gi_flg = "acxfr_gi_flg";
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
	 * Configuration check not required at shipping 出荷時構成チェック不要.<p>
	 *
	 */
	public static final String $skip_chk_ship_flg = "skip_chk_ship_flg";
	/**
	 * Supply type 支給区分.<p>
	 *
	 */
	public static final String $prov_typ = "prov_typ";
	/**
	 * Supply type name 支給区分名.<p>
	 *
	 */
	public static final String $prov_typ_nm = "prov_typ_nm";
	/**
	 * Supply recording type 支給計上区分.<p>
	 *
	 */
	public static final String $prov_basis_typ = "prov_basis_typ";
	/**
	 * Supply recording type name 支給計上区分名.<p>
	 *
	 */
	public static final String $prov_basis_typ_nm = "prov_basis_typ_nm";
	/**
	 * Supply type (Return) 支給区分（返品）.<p>
	 *
	 */
	public static final String $ret_prov_typ = "ret_prov_typ";
	/**
	 * Supply type name (Return) 支給区分名（返品）.<p>
	 *
	 */
	public static final String $ret_prov_typ_nm = "ret_prov_typ_nm";
	/**
	 * Supply recording type (Return) 支給計上区分（返品）.<p>
	 *
	 */
	public static final String $ret_prov_basis_typ = "ret_prov_basis_typ";
	/**
	 * Supply recording type name (Return) 支給計上区分名（返品）.<p>
	 *
	 */
	public static final String $ret_prov_basis_typ_nm = "ret_prov_basis_typ_nm";
	/**
	 * Return-from delivery note No. 返品元納品書ＮＯ.<p>
	 *
	 */
	public static final String $base_dlv_slip_no = "base_dlv_slip_no";
	/**
	 * Return-from supply result No. 返品元支給実績ＮＯ.<p>
	 *
	 */
	public static final String $base_prov_act_no = "base_prov_act_no";
	/**
	 * Supply recording date (Base) 支給計上日（基）.<p>
	 *
	 */
	public static final String $base_ac_dt = "base_ac_dt";
	/**
	 * Current WMS 今回ＷＭＳ.<p>
	 *
	 */
	public static final String $wms_flg = "wms_flg";
	/**
	 * Last WMS 前回ＷＭＳ.<p>
	 *
	 */
	public static final String $last_wms_flg = "last_wms_flg";
	/**
	 * For WMS export ＷＭＳ送信対象.<p>
	 *
	 */
	public static final String $wms_tgt_flg = "wms_tgt_flg";
	/**
	 * Transaction details remarks 取引明細備考.<p>
	 *
	 */
	public static final String $trd_d_rmrks = "trd_d_rmrks";
	/**
	 * Order details remarks 指図明細備考.<p>
	 *
	 */
	public static final String $inst_d_rmrks = "inst_d_rmrks";
	/**
	 * Internal details remarks 内部明細備考.<p>
	 *
	 */
	public static final String $intr_d_rmrks = "intr_d_rmrks";
	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public static final String $sub_char1 = "sub_char1";
	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public static final String $sub_char2 = "sub_char2";
	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public static final String $sub_char3 = "sub_char3";
	/**
	 * Source movement/transport type 移動・移送元区分.<p>
	 *
	 */
	public static final String $xfr_src_typ = "xfr_src_typ";
	/**
	 * Movement/transport source type name 移動・移送元区分名.<p>
	 *
	 */
	public static final String $xfr_src_typ_nm = "xfr_src_typ_nm";
	/**
	 * Source movement/transport No. 移動・移送元ＮＯ.<p>
	 *
	 */
	public static final String $xfr_src_no = "xfr_src_no";
	/**
	 * Movement/transport schedule No. 移動・移送予定ＮＯ.<p>
	 *
	 */
	public static final String $xfr_schd_no = "xfr_schd_no";
	/**
	 * Movement allocation status No. 移動引当状況ＮＯ.<p>
	 *
	 */
	public static final String $xfr_alloc_sts_no = "xfr_alloc_sts_no";
	/**
	 * Movement allocation before split status No. 分割前移動引当状況ＮＯ.<p>
	 *
	 */
	public static final String $old_xfr_alloc_sts_no = "old_xfr_alloc_sts_no";
	/**
	 * Movement order details No. 移動指図明細ＮＯ.<p>
	 *
	 */
	public static final String $xfr_inst_d_no = "xfr_inst_d_no";
	/**
	 * Delivery note No. 納品書ＮＯ.<p>
	 *
	 */
	public static final String $dlv_slip_no = "dlv_slip_no";
	/**
	 * Delivery note details No. 納品書明細ＮＯ.<p>
	 *
	 */
	public static final String $dlv_slip_d_no = "dlv_slip_d_no";
	/**
	 * Schedule supply No. 1 支給予定ＮＯ１.<p>
	 *
	 */
	public static final String $prov_schd_no = "prov_schd_no";
	/**
	 * Schedule supply No. 2 支給予定ＮＯ２.<p>
	 *
	 */
	public static final String $ret_prov_schd_no = "ret_prov_schd_no";
	/**
	 * GR/GI progress management No. 受払進捗管理ＮＯ.<p>
	 *
	 */
	public static final String $io_schd_pr_no = "io_schd_pr_no";
	/**
	 * Prohibit mixed lots ロット混在不可.<p>
	 *
	 */
	public static final String $not_lot_mix_flg = "not_lot_mix_flg";
	/**
	 * Prohibit mixed sublots サブロット混在不可.<p>
	 *
	 */
	public static final String $not_sublot_mix_flg = "not_sublot_mix_flg";
	/**
	 * Expiration date FROM 有効期限ＦＲＯＭ.<p>
	 *
	 */
	public static final String $vld_dt_fr = "vld_dt_fr";
	/**
	 * Display order 表示順.<p>
	 *
	 */
	public static final String $disp_seq = "disp_seq";
	/**
	 * Update counter (Allocation status) 更新カウンタ(引当状況).<p>
	 *
	 */
	public static final String $alloc_sts_upd_cntr = "alloc_sts_upd_cntr";
	/**
	 * Order aggregation pegging No. 指図まとめ紐付けＮＯ.<p>
	 *
	 */
	public static final String $inst_bndl_peg_no = "inst_bndl_peg_no";
	/**
	 * Order aggregation-to pegging No. 指図まとめ先紐付けＮＯ.<p>
	 *
	 */
	public static final String $inst_bndl_to_peg_no = "inst_bndl_to_peg_no";
	/**
	 * Inventory info. location type 在庫情報場所区分.<p>
	 *
	 */
	public static final String $stk_info_loc_typ = "stk_info_loc_typ";
	/**
	 * Remaining allocation 引当残.<p>
	 *
	 */
	public static final String $no_alloc_flg = "no_alloc_flg";
	/**
	 * Copy コピー.<p>
	 *
	 */
	public static final String $copy_flg = "copy_flg";

	public static final String $itm_cd = $itm_p + ".itm_cd";
	public static final String $itm_sub1 = $itm_p + ".itm_sub1";
	public static final String $itm_sub2 = $itm_p + ".itm_sub2";
	public static final String $itm_sub3 = $itm_p + ".itm_sub3";
	public static final String $itm_nm = $itm_p + ".itm_nm";
	public static final String $crt_lot_flg = $lot_no_p + ".crt_lot_flg";
	public static final String $lot_no = $lot_no_p + ".lot_no";
	public static final String $sublot_no = $lot_no_p + ".sublot_no";
	public static final String $ver_no = $ver_no_p + ".ver_no";
	public static final String $trd_unit_qty = $trd_unit_qty_p + ".qty";
	public static final String $base_unit_qty = $base_unit_qty_p + ".qty";
	public static final String $base_unit_act_qty = $base_unit_act_qty_p + ".qty";
	public static final String $pckg_unit_qty = $pckg_unit_qty_p + ".qty";
	public static final String $schd_qty = $schd_qty_p + ".qty";
	public static final String $cont_fctr_unit_cd = $cont_fctr_unit_p + ".cont_fctr_unit_cd";
	public static final String $cont_fctr_unit_nm = $cont_fctr_unit_p + ".cont_fctr_unit_nm";
	public static final String $act_cont_fctr = $act_cont_fctr_p + ".act_cont_fctr";
	public static final String $act_cont_qty = $act_cont_qty_p + ".cont_qty";
	public static final String $std_cont_fctr = $std_cont_fctr_p + ".std_cont_fctr";
	public static final String $std_cont_qty = $std_cont_qty_p + ".cont_qty";
	public static final String $gi_str_ln_cd = $gi_str_ln_p + ".str_ln_cd";
	public static final String $gi_str_ln_nm = $gi_str_ln_p + ".str_ln_nm";
	public static final String $gi_str_ln_cd_none_flg = $gi_str_ln_p + ".str_ln_cd_none_flg";
	public static final String $gr_str_ln_cd = $gr_str_ln_p + ".str_ln_cd";
	public static final String $gr_str_ln_nm = $gr_str_ln_p + ".str_ln_nm";
	public static final String $gr_str_ln_cd_none_flg = $gr_str_ln_p + ".str_ln_cd_none_flg";
	public static final String $sno1 = $sno_wrk_no_p + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno1 + "";
	public static final String $sno1_null_flg = $sno_wrk_no_p + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno1_null_flg + "";
	public static final String $sno2 = $sno_wrk_no_p + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno2 + "";
	public static final String $sno2_null_flg = $sno_wrk_no_p + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno2_null_flg + "";
	public static final String $sno3 = $sno_wrk_no_p + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno3 + "";
	public static final String $sno3_null_flg = $sno_wrk_no_p + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno3_null_flg + "";
	public static final String $sno4 = $sno_wrk_no_p + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno4 + "";
	public static final String $sno4_null_flg = $sno_wrk_no_p + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno4_null_flg + "";
	public static final String $wrk_no = $sno_wrk_no_p + ".wrk_no";
	public static final String $wrk_nm = $sno_wrk_no_p + ".wrk_nm";
	public static final String $alloc_sno1 = $alloc_sno_wrk_no_p + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno1 + "";
	public static final String $alloc_sno2 = $alloc_sno_wrk_no_p + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno2 + "";
	public static final String $alloc_sno3 = $alloc_sno_wrk_no_p + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno3 + "";
	public static final String $alloc_sno4 = $alloc_sno_wrk_no_p + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno4 + "";
	public static final String $stk_bp_cd = $stk_bp_p + ".stk_bp_cd";
	public static final String $stk_bp_nm = $stk_bp_p + ".stk_bp_nm";

	public static final MCMeta peg_no_META = createCommonMeta($peg_no, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta check_META = createCommonMeta($check, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta pr_sts_typ_META = createCommonMeta($pr_sts_typ, mcframe.commonMS.meta.MS_META.PR_STS_TYP);
	public static final MCMeta pr_sts_typ_nm_META = createCommonMeta($pr_sts_typ_nm, mcframe.commonMS.meta.MS_META.PR_STS_TYP_NM);
	public static final MCMeta itm_p_META = createInnerRowMeta($itm_p, mcframe.clientMAUB.MAUBP5030.ItmR.class);
	public static final MCMeta lot_mng_typ_META = createCommonMeta($lot_mng_typ, mcframe.commonMA.meta.MA_META.LOT_MNG_TYP);
	public static final MCMeta sublot_mng_typ_META = createCommonMeta($sublot_mng_typ, mcframe.commonMA.meta.MA_META.SUBLOT_MNG_TYP);
	public static final MCMeta sno1_mng_typ_META = createCommonMeta($sno1_mng_typ, mcframe.commonMA.meta.MA_META.SNO_MNG_TYP);
	public static final MCMeta sno2_mng_typ_META = createCommonMeta($sno2_mng_typ, mcframe.commonMA.meta.MA_META.SNO_MNG_TYP);
	public static final MCMeta sno3_mng_typ_META = createCommonMeta($sno3_mng_typ, mcframe.commonMA.meta.MA_META.SNO_MNG_TYP);
	public static final MCMeta sno4_mng_typ_META = createCommonMeta($sno4_mng_typ, mcframe.commonMA.meta.MA_META.SNO_MNG_TYP);
	public static final MCMeta asset_mng_typ_META = createCommonMeta($asset_mng_typ, mcframe.commonMA.meta.MA_META.ASSET_MNG_TYP);
	public static final MCMeta alloc_flg_META = createCommonMeta($alloc_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta lot_none_flg_META = createCommonMeta($lot_none_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta lot_no_p_META = createInnerRowMeta($lot_no_p, mcframe.clientMSUB.MSUBP5030.LotNoR.class);
	public static final MCMeta def_ver_flg_META = createCommonMeta($def_ver_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta ver_no_p_META = createInnerRowMeta($ver_no_p, mcframe.clientMAUB.MAUBP5250.VerNoR.class);
	public static final MCMeta trd_unit_cd_META = createCommonMeta($trd_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta trd_unit_nm_META = createCommonMeta($trd_unit_nm, mcframe.commonMA.meta.MA_META.UNIT_NM);
	public static final MCMeta trd_unit_conv_base_qty_META = createCommonMeta($trd_unit_conv_base_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta trd_unit_conv_qty_META = createCommonMeta($trd_unit_conv_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta trd_unit_dec_place_META = createCommonMeta($trd_unit_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta trd_unit_rnd_typ_META = createCommonMeta($trd_unit_rnd_typ, mcframe.commonMA.meta.MA_META.RND_TYP);
	public static final MCMeta trd_unit_qty_p_META = createInnerRowMeta($trd_unit_qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta schd_abort_flg_META = createCommonMeta($schd_abort_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta inst_abort_flg_META = createCommonMeta($inst_abort_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta base_unit_cd_META = createCommonMeta($base_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta base_unit_nm_META = createCommonMeta($base_unit_nm, mcframe.commonMA.meta.MA_META.UNIT_NM);
	public static final MCMeta base_unit_dec_place_META = createCommonMeta($base_unit_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta base_unit_rnd_typ_META = createCommonMeta($base_unit_rnd_typ, mcframe.commonMA.meta.MA_META.RND_TYP);
	public static final MCMeta base_unit_qty_p_META = createInnerRowMeta($base_unit_qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta base_unit_act_qty_p_META = createInnerRowMeta($base_unit_act_qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta ttl_flg_META = createCommonMeta($ttl_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta inst_bndl_flg_META = createCommonMeta($inst_bndl_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta inst_bndl_src_flg_META = createCommonMeta($inst_bndl_src_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta pckg_unit_cd_META = createCommonMeta($pckg_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta pckg_unit_nm_META = createCommonMeta($pckg_unit_nm, mcframe.commonMA.meta.MA_META.UNIT_NM);
	public static final MCMeta pckg_unit_conv_base_qty_META = createCommonMeta($pckg_unit_conv_base_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta pckg_unit_conv_qty_META = createCommonMeta($pckg_unit_conv_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta pckg_unit_dec_place_META = createCommonMeta($pckg_unit_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta pckg_unit_qty_p_META = createInnerRowMeta($pckg_unit_qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta schd_unit_cd_META = createCommonMeta($schd_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta schd_unit_nm_META = createCommonMeta($schd_unit_nm, mcframe.commonMA.meta.MA_META.UNIT_NM);
	public static final MCMeta schd_unit_dec_place_META = createCommonMeta($schd_unit_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta schd_qty_p_META = createInnerRowMeta($schd_qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta cont_fctr_flg_META = createCommonMeta($cont_fctr_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta cont_fctr_unit_p_META = createInnerRowMeta($cont_fctr_unit_p, mcframe.clientMAUB.MAUBP5270.ContFctrUnitR.class);
	public static final MCMeta cont_fctr_dec_place_META = createCommonMeta($cont_fctr_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta cont_fctr_rnd_typ_META = createCommonMeta($cont_fctr_rnd_typ, mcframe.commonMA.meta.MA_META.RND_TYP);
	public static final MCMeta act_cont_fctr_p_META = createInnerRowMeta($act_cont_fctr_p, mcframe.clientMAUB.MAUBP5290.ActContFctrR.class);
	public static final MCMeta act_cont_qty_p_META = createInnerRowMeta($act_cont_qty_p, mcframe.clientMAUB.MAUBP5260.ContQtyR.class);
	public static final MCMeta std_cont_fctr_p_META = createInnerRowMeta($std_cont_fctr_p, mcframe.clientMAUB.MAUBP5280.StdContFctrR.class);
	public static final MCMeta std_cont_qty_p_META = createInnerRowMeta($std_cont_qty_p, mcframe.clientMAUB.MAUBP5260.ContQtyR.class);
	public static final MCMeta gi_loc_cd_META = createCommonMeta($gi_loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta gi_loc_nm_META = createCommonMeta($gi_loc_nm, mcframe.commonMA.meta.MA_META.LOC_NM);
	public static final MCMeta gi_site_cd_META = createCommonMeta($gi_site_cd, mcframe.commonMA.meta.MA_META.SITE_CD);
	public static final MCMeta gi_sppl_cd_META = createCommonMeta($gi_sppl_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta gi_str_ln_tgt_flg_META = createCommonMeta($gi_str_ln_tgt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta gi_str_ln_p_META = createInnerRowMeta($gi_str_ln_p, mcframe.clientMAUB.MAUBP5120.StrLnR.class);
	public static final MCMeta gr_str_ln_p_META = createInnerRowMeta($gr_str_ln_p, mcframe.clientMAUB.MAUBP5120.StrLnR.class);
	public static final MCMeta quality_typ_META = createCommonMeta($quality_typ, mcframe.commonMA.meta.MA_META.QUALITY_TYP);
	public static final MCMeta quality_typ_nm_META = createCommonMeta($quality_typ_nm, mcframe.commonMA.meta.MA_META.QUALITY_TYP_NM);
	public static final MCMeta gd_cd_META = createCommonMeta($gd_cd, mcframe.commonMA.meta.MA_META.STK_GD_CD);
	public static final MCMeta gd_nm_META = createCommonMeta($gd_nm, mcframe.commonMA.meta.MA_META.STK_GD_NM);
	public static final MCMeta sno_wrk_no_p_META = createInnerRowMeta($sno_wrk_no_p, mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.class);
	public static final MCMeta alloc_sno_wrk_no_p_META = createInnerRowMeta($alloc_sno_wrk_no_p, mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.class);
	public static final MCMeta stk_id_typ_META = createCommonMeta($stk_id_typ, mcframe.commonMS.meta.MS_META.STK_ID_TYP);
	public static final MCMeta stk_id_typ_nm_META = createCommonMeta($stk_id_typ_nm, mcframe.commonMS.meta.MS_META.STK_ID_TYP_NM);
	public static final MCMeta stk_bp_p_META = createInnerRowMeta($stk_bp_p, mcframe.clientMSUB.MSUBP5050.StkBpR.class);
	public static final MCMeta gi_stk_arrv_bp_cd_META = createCommonMeta($gi_stk_arrv_bp_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta gi_stk_arrv_bp_nm_META = createCommonMeta($gi_stk_arrv_bp_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta rsn_cd_META = createCommonMeta($rsn_cd, mcframe.commonMA.meta.MA_META.BIZ_RSN_CD);
	public static final MCMeta rsn_nm_META = createCommonMeta($rsn_nm, mcframe.commonMA.meta.MA_META.BIZ_RSN_NM);
	public static final MCMeta acxfr_gi_flg_META = createCommonMeta($acxfr_gi_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta bd_dpt_cd_META = createCommonMeta($bd_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta bd_dpt_nm_META = createCommonMeta($bd_dpt_nm, mcframe.commonMA.meta.MA_META.DPT_NM);
	public static final MCMeta skip_chk_ship_flg_META = createCommonMeta($skip_chk_ship_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta prov_typ_META = createCommonMeta($prov_typ, mcframe.commonMA.meta.MA_META.PROV_TYP);
	public static final MCMeta prov_typ_nm_META = createCommonMeta($prov_typ_nm, mcframe.commonMA.meta.MA_META.PROV_TYP_NM);
	public static final MCMeta prov_basis_typ_META = createCommonMeta($prov_basis_typ, mcframe.commonMA.meta.MA_META.PROV_BASIS_TYP);
	public static final MCMeta prov_basis_typ_nm_META = createCommonMeta($prov_basis_typ_nm, mcframe.commonMA.meta.MA_META.PROV_BASIS_TYP_NM);
	public static final MCMeta ret_prov_typ_META = createCommonMeta($ret_prov_typ, mcframe.commonMA.meta.MA_META.PROV_TYP);
	public static final MCMeta ret_prov_typ_nm_META = createCommonMeta($ret_prov_typ_nm, mcframe.commonMA.meta.MA_META.PROV_TYP_NM);
	public static final MCMeta ret_prov_basis_typ_META = createCommonMeta($ret_prov_basis_typ, mcframe.commonMA.meta.MA_META.PROV_BASIS_TYP);
	public static final MCMeta ret_prov_basis_typ_nm_META = createCommonMeta($ret_prov_basis_typ_nm, mcframe.commonMA.meta.MA_META.PROV_BASIS_TYP_NM);
	public static final MCMeta base_dlv_slip_no_META = createCommonMeta($base_dlv_slip_no, mcframe.commonMA.meta.MA_META.DLV_SLIP_NO);
	public static final MCMeta base_prov_act_no_META = createCommonMeta($base_prov_act_no, mcframe.commonMA.meta.MA_META.PROV_ACT_NO);
	public static final MCMeta base_ac_dt_META = createCommonMeta($base_ac_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta wms_flg_META = createCommonMeta($wms_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta last_wms_flg_META = createCommonMeta($last_wms_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta wms_tgt_flg_META = createCommonMeta($wms_tgt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta trd_d_rmrks_META = createCommonMeta($trd_d_rmrks, mcframe.commonMA.meta.MA_META.TRD_D_RMRKS);
	public static final MCMeta inst_d_rmrks_META = createCommonMeta($inst_d_rmrks, mcframe.commonMS.meta.MS_META.XFR_INST_D_RMRKS);
	public static final MCMeta intr_d_rmrks_META = createCommonMeta($intr_d_rmrks, mcframe.commonMS.meta.MS_META.XFR_INST_INTR_D_RMRKS);
	public static final MCMeta sub_char1_META = createCommonMeta($sub_char1, mcframe.commonMS.meta.MS_META.XFR_INST_D_SUB_CHAR1);
	public static final MCMeta sub_char2_META = createCommonMeta($sub_char2, mcframe.commonMS.meta.MS_META.XFR_INST_D_SUB_CHAR2);
	public static final MCMeta sub_char3_META = createCommonMeta($sub_char3, mcframe.commonMS.meta.MS_META.XFR_INST_D_SUB_CHAR3);
	public static final MCMeta xfr_src_typ_META = createCommonMeta($xfr_src_typ, mcframe.commonMS.meta.MS_META.XFR_SRC_TYP);
	public static final MCMeta xfr_src_typ_nm_META = createCommonMeta($xfr_src_typ_nm, mcframe.commonMS.meta.MS_META.XFR_SRC_TYP_NM);
	public static final MCMeta xfr_src_no_META = createCommonMeta($xfr_src_no, mcframe.commonMA.meta.MA_META.XFR_SRC_NO);
	public static final MCMeta xfr_schd_no_META = createCommonMeta($xfr_schd_no, mcframe.commonMA.meta.MA_META.XFR_SCHD_NO);
	public static final MCMeta xfr_alloc_sts_no_META = createCommonMeta($xfr_alloc_sts_no, mcframe.commonMA.meta.MA_META.XFR_ALLOC_STS_NO);
	public static final MCMeta old_xfr_alloc_sts_no_META = createCommonMeta($old_xfr_alloc_sts_no, mcframe.commonMA.meta.MA_META.XFR_ALLOC_STS_NO);
	public static final MCMeta xfr_inst_d_no_META = createCommonMeta($xfr_inst_d_no, mcframe.commonMA.meta.MA_META.XFR_INST_D_NO);
	public static final MCMeta dlv_slip_no_META = createCommonMeta($dlv_slip_no, mcframe.commonMA.meta.MA_META.DLV_SLIP_NO);
	public static final MCMeta dlv_slip_d_no_META = createCommonMeta($dlv_slip_d_no, mcframe.commonMA.meta.MA_META.DLV_SLIP_D_NO);
	public static final MCMeta prov_schd_no_META = createCommonMeta($prov_schd_no, mcframe.commonMA.meta.MA_META.PROV_SCHD_NO);
	public static final MCMeta ret_prov_schd_no_META = createCommonMeta($ret_prov_schd_no, mcframe.commonMA.meta.MA_META.PROV_SCHD_NO);
	public static final MCMeta io_schd_pr_no_META = createCommonMeta($io_schd_pr_no, mcframe.commonMA.meta.MA_META.IO_SCHD_PR_NO);
	public static final MCMeta not_lot_mix_flg_META = createCommonMeta($not_lot_mix_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta not_sublot_mix_flg_META = createCommonMeta($not_sublot_mix_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta vld_dt_fr_META = createCommonMeta($vld_dt_fr, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta disp_seq_META = createCommonMeta($disp_seq, mcframe.commonMA.meta.MA_META.DISP_SEQ);
	public static final MCMeta alloc_sts_upd_cntr_META = createCommonMeta($alloc_sts_upd_cntr, mcframe.commonMA.meta.MA_META.UPD_CNT);
	public static final MCMeta inst_bndl_peg_no_META = createCommonMeta($inst_bndl_peg_no, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta inst_bndl_to_peg_no_META = createCommonMeta($inst_bndl_to_peg_no, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta stk_info_loc_typ_META = createCommonMeta($stk_info_loc_typ, mcframe.commonMS.meta.MS_META.STK_INFO_LOC_TYP);
	public static final MCMeta no_alloc_flg_META = createCommonMeta($no_alloc_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta copy_flg_META = createCommonMeta($copy_flg, mcframe.commonMA.meta.MA_META.FLG);

	protected static final ConstMetaList<DtlR> constMetas = new ConstMetaList<DtlR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			peg_no_META,
			check_META,
			pr_sts_typ_META,
			pr_sts_typ_nm_META,
			itm_p_META,
			lot_mng_typ_META,
			sublot_mng_typ_META,
			sno1_mng_typ_META,
			sno2_mng_typ_META,
			sno3_mng_typ_META,
			sno4_mng_typ_META,
			asset_mng_typ_META,
			alloc_flg_META,
			lot_none_flg_META,
			lot_no_p_META,
			def_ver_flg_META,
			ver_no_p_META,
			trd_unit_cd_META,
			trd_unit_nm_META,
			trd_unit_conv_base_qty_META,
			trd_unit_conv_qty_META,
			trd_unit_dec_place_META,
			trd_unit_rnd_typ_META,
			trd_unit_qty_p_META,
			schd_abort_flg_META,
			inst_abort_flg_META,
			base_unit_cd_META,
			base_unit_nm_META,
			base_unit_dec_place_META,
			base_unit_rnd_typ_META,
			base_unit_qty_p_META,
			base_unit_act_qty_p_META,
			ttl_flg_META,
			inst_bndl_flg_META,
			inst_bndl_src_flg_META,
			pckg_unit_cd_META,
			pckg_unit_nm_META,
			pckg_unit_conv_base_qty_META,
			pckg_unit_conv_qty_META,
			pckg_unit_dec_place_META,
			pckg_unit_qty_p_META,
			schd_unit_cd_META,
			schd_unit_nm_META,
			schd_unit_dec_place_META,
			schd_qty_p_META,
			cont_fctr_flg_META,
			cont_fctr_unit_p_META,
			cont_fctr_dec_place_META,
			cont_fctr_rnd_typ_META,
			act_cont_fctr_p_META,
			act_cont_qty_p_META,
			std_cont_fctr_p_META,
			std_cont_qty_p_META,
			gi_loc_cd_META,
			gi_loc_nm_META,
			gi_site_cd_META,
			gi_sppl_cd_META,
			gi_str_ln_tgt_flg_META,
			gi_str_ln_p_META,
			gr_str_ln_p_META,
			quality_typ_META,
			quality_typ_nm_META,
			gd_cd_META,
			gd_nm_META,
			sno_wrk_no_p_META,
			alloc_sno_wrk_no_p_META,
			stk_id_typ_META,
			stk_id_typ_nm_META,
			stk_bp_p_META,
			gi_stk_arrv_bp_cd_META,
			gi_stk_arrv_bp_nm_META,
			rsn_cd_META,
			rsn_nm_META,
			acxfr_gi_flg_META,
			bd_dpt_cd_META,
			bd_dpt_nm_META,
			skip_chk_ship_flg_META,
			prov_typ_META,
			prov_typ_nm_META,
			prov_basis_typ_META,
			prov_basis_typ_nm_META,
			ret_prov_typ_META,
			ret_prov_typ_nm_META,
			ret_prov_basis_typ_META,
			ret_prov_basis_typ_nm_META,
			base_dlv_slip_no_META,
			base_prov_act_no_META,
			base_ac_dt_META,
			wms_flg_META,
			last_wms_flg_META,
			wms_tgt_flg_META,
			trd_d_rmrks_META,
			inst_d_rmrks_META,
			intr_d_rmrks_META,
			sub_char1_META,
			sub_char2_META,
			sub_char3_META,
			xfr_src_typ_META,
			xfr_src_typ_nm_META,
			xfr_src_no_META,
			xfr_schd_no_META,
			xfr_alloc_sts_no_META,
			old_xfr_alloc_sts_no_META,
			xfr_inst_d_no_META,
			dlv_slip_no_META,
			dlv_slip_d_no_META,
			prov_schd_no_META,
			ret_prov_schd_no_META,
			io_schd_pr_no_META,
			not_lot_mix_flg_META,
			not_sublot_mix_flg_META,
			vld_dt_fr_META,
			disp_seq_META,
			alloc_sts_upd_cntr_META,
			inst_bndl_peg_no_META,
			inst_bndl_to_peg_no_META,
			stk_info_loc_typ_META,
			no_alloc_flg_META,
			copy_flg_META
		},
		new String[][]{
			{
				"itm_cd",
				"itm_sub1",
				"itm_sub2",
				"itm_sub3",
				"itm_nm",
				"crt_lot_flg",
				"lot_no",
				"sublot_no",
				"ver_no",
				"trd_unit_qty",
				"base_unit_qty",
				"base_unit_act_qty",
				"pckg_unit_qty",
				"schd_qty",
				"cont_fctr_unit_cd",
				"cont_fctr_unit_nm",
				"act_cont_fctr",
				"act_cont_qty",
				"std_cont_fctr",
				"std_cont_qty",
				"gi_str_ln_cd",
				"gi_str_ln_nm",
				"gi_str_ln_cd_none_flg",
				"gr_str_ln_cd",
				"gr_str_ln_nm",
				"gr_str_ln_cd_none_flg",
				"sno1",
				"sno1_null_flg",
				"sno2",
				"sno2_null_flg",
				"sno3",
				"sno3_null_flg",
				"sno4",
				"sno4_null_flg",
				"wrk_no",
				"wrk_nm",
				"alloc_sno1",
				"alloc_sno2",
				"alloc_sno3",
				"alloc_sno4",
				"stk_bp_cd",
				"stk_bp_nm"
			},
			{
				$itm_cd,
				$itm_sub1,
				$itm_sub2,
				$itm_sub3,
				$itm_nm,
				$crt_lot_flg,
				$lot_no,
				$sublot_no,
				$ver_no,
				$trd_unit_qty,
				$base_unit_qty,
				$base_unit_act_qty,
				$pckg_unit_qty,
				$schd_qty,
				$cont_fctr_unit_cd,
				$cont_fctr_unit_nm,
				$act_cont_fctr,
				$act_cont_qty,
				$std_cont_fctr,
				$std_cont_qty,
				$gi_str_ln_cd,
				$gi_str_ln_nm,
				$gi_str_ln_cd_none_flg,
				$gr_str_ln_cd,
				$gr_str_ln_nm,
				$gr_str_ln_cd_none_flg,
				$sno1,
				$sno1_null_flg,
				$sno2,
				$sno2_null_flg,
				$sno3,
				$sno3_null_flg,
				$sno4,
				$sno4_null_flg,
				$wrk_no,
				$wrk_nm,
				$alloc_sno1,
				$alloc_sno2,
				$alloc_sno3,
				$alloc_sno4,
				$stk_bp_cd,
				$stk_bp_nm
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
				{$itm_p + ".itm_cd", "itm_sub1;itm_sub2;itm_sub3;itm_nm;unit_cd;unit_nm;dec_place;rnd_typ;lot_mng_typ;sublot_mng_typ;sno1_mng_typ;sno2_mng_typ;sno3_mng_typ;sno4_mng_typ;asset_mng_typ;ver_flg;cont_fctr_flg;std_cont_fctr;cont_fctr_unit_cd;cont_fctr_unit_nm;cont_fctr_rnd_typ;cont_fctr_dec_place;pckg_unit_cd;skip_chk_ship_flg"},	// itm_p.itm_cd
				{$itm_p + ".itm_sub1", "itm_sub2;itm_sub3;itm_nm;unit_cd;unit_nm;dec_place;rnd_typ;lot_mng_typ;sublot_mng_typ;sno1_mng_typ;sno2_mng_typ;sno3_mng_typ;sno4_mng_typ;asset_mng_typ;ver_flg;cont_fctr_flg;std_cont_fctr;cont_fctr_unit_cd;cont_fctr_unit_nm;cont_fctr_rnd_typ;cont_fctr_dec_place;pckg_unit_cd;skip_chk_ship_flg"},	// itm_p.itm_sub1
				{$itm_p + ".itm_sub2", "itm_sub3;itm_nm;unit_cd;unit_nm;dec_place;rnd_typ;lot_mng_typ;sublot_mng_typ;sno1_mng_typ;sno2_mng_typ;sno3_mng_typ;sno4_mng_typ;asset_mng_typ;ver_flg;cont_fctr_flg;std_cont_fctr;cont_fctr_unit_cd;cont_fctr_unit_nm;cont_fctr_rnd_typ;cont_fctr_dec_place;pckg_unit_cd;skip_chk_ship_flg"},	// itm_p.itm_sub2
				{$itm_p + ".itm_sub3", "itm_nm;unit_cd;unit_nm;dec_place;rnd_typ;lot_mng_typ;sublot_mng_typ;sno1_mng_typ;sno2_mng_typ;sno3_mng_typ;sno4_mng_typ;asset_mng_typ;ver_flg;cont_fctr_flg;std_cont_fctr;cont_fctr_unit_cd;cont_fctr_unit_nm;cont_fctr_rnd_typ;cont_fctr_dec_place;pckg_unit_cd;skip_chk_ship_flg"},	// itm_p.itm_sub3
				{$lot_no_p + ".lot_no", "sublot_no;ver_no;act_cont_fctr"},	// lot_no_p.lot_no
				{$lot_no_p + ".sublot_no", "ver_no;act_cont_fctr"},	// lot_no_p.sublot_no
				{$trd_unit_cd, "unit_nm;conv_base_qty;conv_qty;dec_place;rnd_typ"},	// trd_unit_cd
				{$pckg_unit_cd, "unit_nm;conv_base_qty;conv_qty;dec_place"},	// pckg_unit_cd
				{$cont_fctr_unit_p + ".cont_fctr_unit_cd", "unit_nm;dec_place;rnd_typ"},	// cont_fctr_unit_p.cont_fctr_unit_cd
				{$gi_loc_cd, "loc_nm;str_ln_tgt_flg;sppl_cd;site_cd"},	// gi_loc_cd
				{$quality_typ, "quality_typ_nm"},	// quality_typ
				{$gd_cd, "gd_nm"},	// gd_cd
				{$stk_id_typ, "stk_id_typ_nm"},	// stk_id_typ
				{$stk_bp_p + ".stk_bp_cd", "bp_nm"},	// stk_bp_p.stk_bp_cd
				{$gi_stk_arrv_bp_cd, "bp_nm"},	// gi_stk_arrv_bp_cd
				{$rsn_cd, "biz_rsn_nm;acxfr_gi_flg"},	// rsn_cd
				{$bd_dpt_cd, "dpt_nm"},	// bd_dpt_cd
				{$prov_typ, "prov_typ_nm"},	// prov_typ
				{$prov_basis_typ, "prov_basis_typ_nm"},	// prov_basis_typ
				{$ret_prov_typ, "prov_typ_nm"},	// ret_prov_typ
				{$ret_prov_basis_typ, "prov_basis_typ_nm"}	// ret_prov_basis_typ
			}
		)),
		new MCExtMap.Entry($$LIST_IN, new MCExtList(
			new String[][]{
				{$itm_p + ".itm_cd", "MAC_ITM_IS_SRCH_TYP.STK1"},	// itm_p.itm_cd
				{$itm_p + ".itm_sub1", "MAC_ITM_IS_SRCH_TYP.STK1;itm_cd"},	// itm_p.itm_sub1
				{$itm_p + ".itm_sub2", "MAC_ITM_IS_SRCH_TYP.STK1;itm_cd;itm_sub1"},	// itm_p.itm_sub2
				{$itm_p + ".itm_sub3", "MAC_ITM_IS_SRCH_TYP.STK1;itm_cd;itm_sub1;itm_sub2"},	// itm_p.itm_sub3
				{$lot_no_p + ".lot_no", "itm_cd;itm_sub1;itm_sub2;itm_sub3"},	// lot_no_p.lot_no
				{$lot_no_p + ".sublot_no", "itm_cd;itm_sub1;itm_sub2;itm_sub3;lot_no"},	// lot_no_p.sublot_no
				{$trd_unit_cd, "itm_cd;itm_sub1;itm_sub2;itm_sub3"},	// trd_unit_cd
				{$pckg_unit_cd, "itm_cd;itm_sub1;itm_sub2;itm_sub3"},	// pckg_unit_cd
				{$gi_loc_cd, "Hdr_lg_grp_cd"},	// gi_loc_cd
				{$stk_id_typ, "gi_sppl_cd"},	// stk_id_typ
				{$stk_bp_p + ".stk_bp_cd", "true"},	// stk_bp_p.stk_bp_cd
				{$gi_stk_arrv_bp_cd, "gi_sppl_cd;true"},	// gi_stk_arrv_bp_cd
				{$bd_dpt_cd, "MAC_DPT_IS_SRCH_TYP.BD;xfr_inst_dt"},	// bd_dpt_cd
				{$prov_typ, "asset_mng_typ"}	// prov_typ
			}
		)),
		new MCExtMap.Entry($$LIST_IN_BASE, new MCExtList(
			new String[][]{
				{$itm_p + ".itm_cd", "itm_is_srch_typ"},	// itm_p.itm_cd
				{$itm_p + ".itm_sub1", "itm_is_srch_typ;itm_cd"},	// itm_p.itm_sub1
				{$itm_p + ".itm_sub2", "itm_is_srch_typ;itm_cd;itm_sub1"},	// itm_p.itm_sub2
				{$itm_p + ".itm_sub3", "itm_is_srch_typ;itm_cd;itm_sub1;itm_sub2"},	// itm_p.itm_sub3
				{$lot_no_p + ".lot_no", "itm_cd;itm_sub1;itm_sub2;itm_sub3"},	// lot_no_p.lot_no
				{$lot_no_p + ".sublot_no", "itm_cd;itm_sub1;itm_sub2;itm_sub3;lot_no"},	// lot_no_p.sublot_no
				{$trd_unit_cd, "itm_cd;itm_sub1;itm_sub2;itm_sub3"},	// trd_unit_cd
				{$pckg_unit_cd, "itm_cd;itm_sub1;itm_sub2;itm_sub3"},	// pckg_unit_cd
				{$gi_loc_cd, "lg_grp_cd"},	// gi_loc_cd
				{$stk_bp_p + ".stk_bp_cd", "mode_nullval_flg"},	// stk_bp_p.stk_bp_cd
				{$gi_stk_arrv_bp_cd, "bp_cd;mode_nullval_flg"},	// gi_stk_arrv_bp_cd
				{$bd_dpt_cd, "dpt_is_srch_typ;dt"},	// bd_dpt_cd
				{$prov_typ, "asset_mng_typ"}	// prov_typ
			}
		)),
		new MCExtMap.Entry($$DISP_CTL, new MCExtList(
			new String[][]{
				{$base_unit_cd, "BASE_UNIT"},	// base_unit_cd
				{$base_unit_nm, "BASE_UNIT"},	// base_unit_nm
				{$base_unit_dec_place, "BASE_UNIT"},	// base_unit_dec_place
				{$base_unit_rnd_typ, "BASE_UNIT"},	// base_unit_rnd_typ
				{$base_unit_qty_p + ".qty", "BASE_UNIT"},	// base_unit_qty_p.qty
				{$base_unit_act_qty_p + ".qty", "BASE_UNIT"},	// base_unit_act_qty_p.qty
				{$gi_site_cd, "SITE"},	// gi_site_cd
				{$gi_str_ln_tgt_flg, "STR_LN"},	// gi_str_ln_tgt_flg
				{$gd_cd, "STK_GD"},	// gd_cd
				{$gd_nm, "STK_GD"}	// gd_nm
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
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public MCNumber peg_no() {
		return getConstNumber(offset + 0, $peg_no);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(MCNumber value) {
		setConstNumber(offset + 0, $peg_no, value);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(int value) {
		setConstNumber(offset + 0, $peg_no, value);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(long value) {
		setConstNumber(offset + 0, $peg_no, value);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(float value) {
		setConstNumber(offset + 0, $peg_no, value);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(double value) {
		setConstNumber(offset + 0, $peg_no, value);
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
	 * Progress status type 進捗状況区分.<p>
	 *
	 */
	public String pr_sts_typ() {
		return getConstString(offset + 2, $pr_sts_typ);
	}

	/**
	 * Progress status type 進捗状況区分.<p>
	 *
	 */
	public void pr_sts_typ(String value) {
		setConstString(offset + 2, $pr_sts_typ, value);
	}


	/**
	 * Progress status type name 進捗状況区分名.<p>
	 *
	 */
	public String pr_sts_typ_nm() {
		return getConstString(offset + 3, $pr_sts_typ_nm);
	}

	/**
	 * Progress status type name 進捗状況区分名.<p>
	 *
	 */
	public void pr_sts_typ_nm(String value) {
		setConstString(offset + 3, $pr_sts_typ_nm, value);
	}


	public mcframe.clientMAUB.MAUBP5030.ItmR itm_p(){
		return (mcframe.clientMAUB.MAUBP5030.ItmR) getConstInnerRow(offset + 4, $itm_p);
	}
	
	public void itm_p(mcframe.clientMAUB.MAUBP5030.ItmR row){
		setConstInnerRow(offset + 4, $itm_p, row);
	}


	/**
	 * Lot management type ロット管理区分.<p>
	 *
	 */
	public String lot_mng_typ() {
		return getConstString(offset + 5, $lot_mng_typ);
	}

	/**
	 * Lot management type ロット管理区分.<p>
	 *
	 */
	public void lot_mng_typ(String value) {
		setConstString(offset + 5, $lot_mng_typ, value);
	}


	/**
	 * Sublot management type サブロット管理区分.<p>
	 *
	 */
	public String sublot_mng_typ() {
		return getConstString(offset + 6, $sublot_mng_typ);
	}

	/**
	 * Sublot management type サブロット管理区分.<p>
	 *
	 */
	public void sublot_mng_typ(String value) {
		setConstString(offset + 6, $sublot_mng_typ, value);
	}


	/**
	 * SEIBAN No. 1 management type 手配ＮＯ１管理区分.<p>
	 *
	 */
	public String sno1_mng_typ() {
		return getConstString(offset + 7, $sno1_mng_typ);
	}

	/**
	 * SEIBAN No. 1 management type 手配ＮＯ１管理区分.<p>
	 *
	 */
	public void sno1_mng_typ(String value) {
		setConstString(offset + 7, $sno1_mng_typ, value);
	}


	/**
	 * SEIBAN No. 2 management type 手配ＮＯ２管理区分.<p>
	 *
	 */
	public String sno2_mng_typ() {
		return getConstString(offset + 8, $sno2_mng_typ);
	}

	/**
	 * SEIBAN No. 2 management type 手配ＮＯ２管理区分.<p>
	 *
	 */
	public void sno2_mng_typ(String value) {
		setConstString(offset + 8, $sno2_mng_typ, value);
	}


	/**
	 * SEIBAN No. 3 management type 手配ＮＯ３管理区分.<p>
	 *
	 */
	public String sno3_mng_typ() {
		return getConstString(offset + 9, $sno3_mng_typ);
	}

	/**
	 * SEIBAN No. 3 management type 手配ＮＯ３管理区分.<p>
	 *
	 */
	public void sno3_mng_typ(String value) {
		setConstString(offset + 9, $sno3_mng_typ, value);
	}


	/**
	 * SEIBAN No. 4 management type 手配ＮＯ４管理区分.<p>
	 *
	 */
	public String sno4_mng_typ() {
		return getConstString(offset + 10, $sno4_mng_typ);
	}

	/**
	 * SEIBAN No. 4 management type 手配ＮＯ４管理区分.<p>
	 *
	 */
	public void sno4_mng_typ(String value) {
		setConstString(offset + 10, $sno4_mng_typ, value);
	}


	/**
	 * Asset management type 資産管理区分.<p>
	 *
	 */
	public String asset_mng_typ() {
		return getConstString(offset + 11, $asset_mng_typ);
	}

	/**
	 * Asset management type 資産管理区分.<p>
	 *
	 */
	public void asset_mng_typ(String value) {
		setConstString(offset + 11, $asset_mng_typ, value);
	}


	/**
	 * Allocation 引当.<p>
	 *
	 */
	public boolean alloc_flg() {
		return getConstBoolean(offset + 12, $alloc_flg);
	}

	/**
	 * Allocation 引当.<p>
	 *
	 */
	public void alloc_flg(boolean value) {
		setConstBoolean(offset + 12, $alloc_flg, value);
	}


	/**
	 * Without lot ロット指定無.<p>
	 *
	 */
	public boolean lot_none_flg() {
		return getConstBoolean(offset + 13, $lot_none_flg);
	}

	/**
	 * Without lot ロット指定無.<p>
	 *
	 */
	public void lot_none_flg(boolean value) {
		setConstBoolean(offset + 13, $lot_none_flg, value);
	}


	public mcframe.clientMSUB.MSUBP5030.LotNoR lot_no_p(){
		return (mcframe.clientMSUB.MSUBP5030.LotNoR) getConstInnerRow(offset + 14, $lot_no_p);
	}
	
	public void lot_no_p(mcframe.clientMSUB.MSUBP5030.LotNoR row){
		setConstInnerRow(offset + 14, $lot_no_p, row);
	}


	/**
	 * For version control 版管理対象.<p>
	 *
	 */
	public boolean def_ver_flg() {
		return getConstBoolean(offset + 15, $def_ver_flg);
	}

	/**
	 * For version control 版管理対象.<p>
	 *
	 */
	public void def_ver_flg(boolean value) {
		setConstBoolean(offset + 15, $def_ver_flg, value);
	}


	public mcframe.clientMAUB.MAUBP5250.VerNoR ver_no_p(){
		return (mcframe.clientMAUB.MAUBP5250.VerNoR) getConstInnerRow(offset + 16, $ver_no_p);
	}
	
	public void ver_no_p(mcframe.clientMAUB.MAUBP5250.VerNoR row){
		setConstInnerRow(offset + 16, $ver_no_p, row);
	}


	/**
	 * Transaction unit cd. 取引単位ＣＤ.<p>
	 *
	 */
	public String trd_unit_cd() {
		return getConstString(offset + 17, $trd_unit_cd);
	}

	/**
	 * Transaction unit cd. 取引単位ＣＤ.<p>
	 *
	 */
	public void trd_unit_cd(String value) {
		setConstString(offset + 17, $trd_unit_cd, value);
	}


	/**
	 * Transaction unit name 取引単位名.<p>
	 *
	 */
	public String trd_unit_nm() {
		return getConstString(offset + 18, $trd_unit_nm);
	}

	/**
	 * Transaction unit name 取引単位名.<p>
	 *
	 */
	public void trd_unit_nm(String value) {
		setConstString(offset + 18, $trd_unit_nm, value);
	}


	/**
	 * Transaction unit conversion base qty. 取引単位換算基準数量.<p>
	 *
	 */
	public MCNumber trd_unit_conv_base_qty() {
		return getConstNumber(offset + 19, $trd_unit_conv_base_qty);
	}

	/**
	 * Transaction unit conversion base qty. 取引単位換算基準数量.<p>
	 *
	 */
	public void trd_unit_conv_base_qty(MCNumber value) {
		setConstNumber(offset + 19, $trd_unit_conv_base_qty, value);
	}

	/**
	 * Transaction unit conversion base qty. 取引単位換算基準数量.<p>
	 *
	 */
	public void trd_unit_conv_base_qty(int value) {
		setConstNumber(offset + 19, $trd_unit_conv_base_qty, value);
	}

	/**
	 * Transaction unit conversion base qty. 取引単位換算基準数量.<p>
	 *
	 */
	public void trd_unit_conv_base_qty(long value) {
		setConstNumber(offset + 19, $trd_unit_conv_base_qty, value);
	}

	/**
	 * Transaction unit conversion base qty. 取引単位換算基準数量.<p>
	 *
	 */
	public void trd_unit_conv_base_qty(float value) {
		setConstNumber(offset + 19, $trd_unit_conv_base_qty, value);
	}

	/**
	 * Transaction unit conversion base qty. 取引単位換算基準数量.<p>
	 *
	 */
	public void trd_unit_conv_base_qty(double value) {
		setConstNumber(offset + 19, $trd_unit_conv_base_qty, value);
	}


	/**
	 * Transaction unit conversion qty. 取引単位換算数量.<p>
	 *
	 */
	public MCNumber trd_unit_conv_qty() {
		return getConstNumber(offset + 20, $trd_unit_conv_qty);
	}

	/**
	 * Transaction unit conversion qty. 取引単位換算数量.<p>
	 *
	 */
	public void trd_unit_conv_qty(MCNumber value) {
		setConstNumber(offset + 20, $trd_unit_conv_qty, value);
	}

	/**
	 * Transaction unit conversion qty. 取引単位換算数量.<p>
	 *
	 */
	public void trd_unit_conv_qty(int value) {
		setConstNumber(offset + 20, $trd_unit_conv_qty, value);
	}

	/**
	 * Transaction unit conversion qty. 取引単位換算数量.<p>
	 *
	 */
	public void trd_unit_conv_qty(long value) {
		setConstNumber(offset + 20, $trd_unit_conv_qty, value);
	}

	/**
	 * Transaction unit conversion qty. 取引単位換算数量.<p>
	 *
	 */
	public void trd_unit_conv_qty(float value) {
		setConstNumber(offset + 20, $trd_unit_conv_qty, value);
	}

	/**
	 * Transaction unit conversion qty. 取引単位換算数量.<p>
	 *
	 */
	public void trd_unit_conv_qty(double value) {
		setConstNumber(offset + 20, $trd_unit_conv_qty, value);
	}


	/**
	 * Transaction unit number of decimal places 取引単位小数部有効桁数.<p>
	 *
	 */
	public MCNumber trd_unit_dec_place() {
		return getConstNumber(offset + 21, $trd_unit_dec_place);
	}

	/**
	 * Transaction unit number of decimal places 取引単位小数部有効桁数.<p>
	 *
	 */
	public void trd_unit_dec_place(MCNumber value) {
		setConstNumber(offset + 21, $trd_unit_dec_place, value);
	}

	/**
	 * Transaction unit number of decimal places 取引単位小数部有効桁数.<p>
	 *
	 */
	public void trd_unit_dec_place(int value) {
		setConstNumber(offset + 21, $trd_unit_dec_place, value);
	}

	/**
	 * Transaction unit number of decimal places 取引単位小数部有効桁数.<p>
	 *
	 */
	public void trd_unit_dec_place(long value) {
		setConstNumber(offset + 21, $trd_unit_dec_place, value);
	}

	/**
	 * Transaction unit number of decimal places 取引単位小数部有効桁数.<p>
	 *
	 */
	public void trd_unit_dec_place(float value) {
		setConstNumber(offset + 21, $trd_unit_dec_place, value);
	}

	/**
	 * Transaction unit number of decimal places 取引単位小数部有効桁数.<p>
	 *
	 */
	public void trd_unit_dec_place(double value) {
		setConstNumber(offset + 21, $trd_unit_dec_place, value);
	}


	/**
	 * Transaction unit rounding type 取引単位端数処理区分.<p>
	 *
	 */
	public String trd_unit_rnd_typ() {
		return getConstString(offset + 22, $trd_unit_rnd_typ);
	}

	/**
	 * Transaction unit rounding type 取引単位端数処理区分.<p>
	 *
	 */
	public void trd_unit_rnd_typ(String value) {
		setConstString(offset + 22, $trd_unit_rnd_typ, value);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR trd_unit_qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 23, $trd_unit_qty_p);
	}
	
	public void trd_unit_qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 23, $trd_unit_qty_p, row);
	}


	/**
	 * Cancel remaining schedule 予定打切.<p>
	 *
	 */
	public boolean schd_abort_flg() {
		return getConstBoolean(offset + 24, $schd_abort_flg);
	}

	/**
	 * Cancel remaining schedule 予定打切.<p>
	 *
	 */
	public void schd_abort_flg(boolean value) {
		setConstBoolean(offset + 24, $schd_abort_flg, value);
	}


	/**
	 * Cancel remaining order 指図打切.<p>
	 *
	 */
	public boolean inst_abort_flg() {
		return getConstBoolean(offset + 25, $inst_abort_flg);
	}

	/**
	 * Cancel remaining order 指図打切.<p>
	 *
	 */
	public void inst_abort_flg(boolean value) {
		setConstBoolean(offset + 25, $inst_abort_flg, value);
	}


	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public String base_unit_cd() {
		return getConstString(offset + 26, $base_unit_cd);
	}

	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public void base_unit_cd(String value) {
		setConstString(offset + 26, $base_unit_cd, value);
	}


	/**
	 * Base unit name 基準単位名.<p>
	 *
	 */
	public String base_unit_nm() {
		return getConstString(offset + 27, $base_unit_nm);
	}

	/**
	 * Base unit name 基準単位名.<p>
	 *
	 */
	public void base_unit_nm(String value) {
		setConstString(offset + 27, $base_unit_nm, value);
	}


	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public MCNumber base_unit_dec_place() {
		return getConstNumber(offset + 28, $base_unit_dec_place);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(MCNumber value) {
		setConstNumber(offset + 28, $base_unit_dec_place, value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(int value) {
		setConstNumber(offset + 28, $base_unit_dec_place, value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(long value) {
		setConstNumber(offset + 28, $base_unit_dec_place, value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(float value) {
		setConstNumber(offset + 28, $base_unit_dec_place, value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(double value) {
		setConstNumber(offset + 28, $base_unit_dec_place, value);
	}


	/**
	 * Base unit rounding type 基準単位端数処理区分.<p>
	 *
	 */
	public String base_unit_rnd_typ() {
		return getConstString(offset + 29, $base_unit_rnd_typ);
	}

	/**
	 * Base unit rounding type 基準単位端数処理区分.<p>
	 *
	 */
	public void base_unit_rnd_typ(String value) {
		setConstString(offset + 29, $base_unit_rnd_typ, value);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR base_unit_qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 30, $base_unit_qty_p);
	}
	
	public void base_unit_qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 30, $base_unit_qty_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR base_unit_act_qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 31, $base_unit_act_qty_p);
	}
	
	public void base_unit_act_qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 31, $base_unit_act_qty_p, row);
	}


	/**
	 * Aggregation まとめ.<p>
	 *
	 */
	public boolean ttl_flg() {
		return getConstBoolean(offset + 32, $ttl_flg);
	}

	/**
	 * Aggregation まとめ.<p>
	 *
	 */
	public void ttl_flg(boolean value) {
		setConstBoolean(offset + 32, $ttl_flg, value);
	}


	/**
	 * Order aggregation 指図まとめ.<p>
	 *
	 */
	public boolean inst_bndl_flg() {
		return getConstBoolean(offset + 33, $inst_bndl_flg);
	}

	/**
	 * Order aggregation 指図まとめ.<p>
	 *
	 */
	public void inst_bndl_flg(boolean value) {
		setConstBoolean(offset + 33, $inst_bndl_flg, value);
	}


	/**
	 * Order aggregation-from 指図まとめ元.<p>
	 *
	 */
	public boolean inst_bndl_src_flg() {
		return getConstBoolean(offset + 34, $inst_bndl_src_flg);
	}

	/**
	 * Order aggregation-from 指図まとめ元.<p>
	 *
	 */
	public void inst_bndl_src_flg(boolean value) {
		setConstBoolean(offset + 34, $inst_bndl_src_flg, value);
	}


	/**
	 * Packing unit cd. 梱包単位ＣＤ.<p>
	 *
	 */
	public String pckg_unit_cd() {
		return getConstString(offset + 35, $pckg_unit_cd);
	}

	/**
	 * Packing unit cd. 梱包単位ＣＤ.<p>
	 *
	 */
	public void pckg_unit_cd(String value) {
		setConstString(offset + 35, $pckg_unit_cd, value);
	}


	/**
	 * Packing unit name 梱包単位名.<p>
	 *
	 */
	public String pckg_unit_nm() {
		return getConstString(offset + 36, $pckg_unit_nm);
	}

	/**
	 * Packing unit name 梱包単位名.<p>
	 *
	 */
	public void pckg_unit_nm(String value) {
		setConstString(offset + 36, $pckg_unit_nm, value);
	}


	/**
	 * Packing unit conversion base qty. 梱包単位換算基準数量.<p>
	 *
	 */
	public MCNumber pckg_unit_conv_base_qty() {
		return getConstNumber(offset + 37, $pckg_unit_conv_base_qty);
	}

	/**
	 * Packing unit conversion base qty. 梱包単位換算基準数量.<p>
	 *
	 */
	public void pckg_unit_conv_base_qty(MCNumber value) {
		setConstNumber(offset + 37, $pckg_unit_conv_base_qty, value);
	}

	/**
	 * Packing unit conversion base qty. 梱包単位換算基準数量.<p>
	 *
	 */
	public void pckg_unit_conv_base_qty(int value) {
		setConstNumber(offset + 37, $pckg_unit_conv_base_qty, value);
	}

	/**
	 * Packing unit conversion base qty. 梱包単位換算基準数量.<p>
	 *
	 */
	public void pckg_unit_conv_base_qty(long value) {
		setConstNumber(offset + 37, $pckg_unit_conv_base_qty, value);
	}

	/**
	 * Packing unit conversion base qty. 梱包単位換算基準数量.<p>
	 *
	 */
	public void pckg_unit_conv_base_qty(float value) {
		setConstNumber(offset + 37, $pckg_unit_conv_base_qty, value);
	}

	/**
	 * Packing unit conversion base qty. 梱包単位換算基準数量.<p>
	 *
	 */
	public void pckg_unit_conv_base_qty(double value) {
		setConstNumber(offset + 37, $pckg_unit_conv_base_qty, value);
	}


	/**
	 * Packing unit conversion qty. 梱包単位換算数量.<p>
	 *
	 */
	public MCNumber pckg_unit_conv_qty() {
		return getConstNumber(offset + 38, $pckg_unit_conv_qty);
	}

	/**
	 * Packing unit conversion qty. 梱包単位換算数量.<p>
	 *
	 */
	public void pckg_unit_conv_qty(MCNumber value) {
		setConstNumber(offset + 38, $pckg_unit_conv_qty, value);
	}

	/**
	 * Packing unit conversion qty. 梱包単位換算数量.<p>
	 *
	 */
	public void pckg_unit_conv_qty(int value) {
		setConstNumber(offset + 38, $pckg_unit_conv_qty, value);
	}

	/**
	 * Packing unit conversion qty. 梱包単位換算数量.<p>
	 *
	 */
	public void pckg_unit_conv_qty(long value) {
		setConstNumber(offset + 38, $pckg_unit_conv_qty, value);
	}

	/**
	 * Packing unit conversion qty. 梱包単位換算数量.<p>
	 *
	 */
	public void pckg_unit_conv_qty(float value) {
		setConstNumber(offset + 38, $pckg_unit_conv_qty, value);
	}

	/**
	 * Packing unit conversion qty. 梱包単位換算数量.<p>
	 *
	 */
	public void pckg_unit_conv_qty(double value) {
		setConstNumber(offset + 38, $pckg_unit_conv_qty, value);
	}


	/**
	 * Packing unit number of decimal places 梱包単位小数部有効桁数.<p>
	 *
	 */
	public MCNumber pckg_unit_dec_place() {
		return getConstNumber(offset + 39, $pckg_unit_dec_place);
	}

	/**
	 * Packing unit number of decimal places 梱包単位小数部有効桁数.<p>
	 *
	 */
	public void pckg_unit_dec_place(MCNumber value) {
		setConstNumber(offset + 39, $pckg_unit_dec_place, value);
	}

	/**
	 * Packing unit number of decimal places 梱包単位小数部有効桁数.<p>
	 *
	 */
	public void pckg_unit_dec_place(int value) {
		setConstNumber(offset + 39, $pckg_unit_dec_place, value);
	}

	/**
	 * Packing unit number of decimal places 梱包単位小数部有効桁数.<p>
	 *
	 */
	public void pckg_unit_dec_place(long value) {
		setConstNumber(offset + 39, $pckg_unit_dec_place, value);
	}

	/**
	 * Packing unit number of decimal places 梱包単位小数部有効桁数.<p>
	 *
	 */
	public void pckg_unit_dec_place(float value) {
		setConstNumber(offset + 39, $pckg_unit_dec_place, value);
	}

	/**
	 * Packing unit number of decimal places 梱包単位小数部有効桁数.<p>
	 *
	 */
	public void pckg_unit_dec_place(double value) {
		setConstNumber(offset + 39, $pckg_unit_dec_place, value);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR pckg_unit_qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 40, $pckg_unit_qty_p);
	}
	
	public void pckg_unit_qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 40, $pckg_unit_qty_p, row);
	}


	/**
	 * Schedule unit cd. 予定単位ＣＤ.<p>
	 *
	 */
	public String schd_unit_cd() {
		return getConstString(offset + 41, $schd_unit_cd);
	}

	/**
	 * Schedule unit cd. 予定単位ＣＤ.<p>
	 *
	 */
	public void schd_unit_cd(String value) {
		setConstString(offset + 41, $schd_unit_cd, value);
	}


	/**
	 * Schedule unit name 予定単位名.<p>
	 *
	 */
	public String schd_unit_nm() {
		return getConstString(offset + 42, $schd_unit_nm);
	}

	/**
	 * Schedule unit name 予定単位名.<p>
	 *
	 */
	public void schd_unit_nm(String value) {
		setConstString(offset + 42, $schd_unit_nm, value);
	}


	/**
	 * Schedule unit number of decimal places 予定単位小数部有効桁数.<p>
	 *
	 */
	public MCNumber schd_unit_dec_place() {
		return getConstNumber(offset + 43, $schd_unit_dec_place);
	}

	/**
	 * Schedule unit number of decimal places 予定単位小数部有効桁数.<p>
	 *
	 */
	public void schd_unit_dec_place(MCNumber value) {
		setConstNumber(offset + 43, $schd_unit_dec_place, value);
	}

	/**
	 * Schedule unit number of decimal places 予定単位小数部有効桁数.<p>
	 *
	 */
	public void schd_unit_dec_place(int value) {
		setConstNumber(offset + 43, $schd_unit_dec_place, value);
	}

	/**
	 * Schedule unit number of decimal places 予定単位小数部有効桁数.<p>
	 *
	 */
	public void schd_unit_dec_place(long value) {
		setConstNumber(offset + 43, $schd_unit_dec_place, value);
	}

	/**
	 * Schedule unit number of decimal places 予定単位小数部有効桁数.<p>
	 *
	 */
	public void schd_unit_dec_place(float value) {
		setConstNumber(offset + 43, $schd_unit_dec_place, value);
	}

	/**
	 * Schedule unit number of decimal places 予定単位小数部有効桁数.<p>
	 *
	 */
	public void schd_unit_dec_place(double value) {
		setConstNumber(offset + 43, $schd_unit_dec_place, value);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR schd_qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 44, $schd_qty_p);
	}
	
	public void schd_qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 44, $schd_qty_p, row);
	}


	/**
	 * For active ingredient 有効成分対象.<p>
	 *
	 */
	public boolean cont_fctr_flg() {
		return getConstBoolean(offset + 45, $cont_fctr_flg);
	}

	/**
	 * For active ingredient 有効成分対象.<p>
	 *
	 */
	public void cont_fctr_flg(boolean value) {
		setConstBoolean(offset + 45, $cont_fctr_flg, value);
	}


	public mcframe.clientMAUB.MAUBP5270.ContFctrUnitR cont_fctr_unit_p(){
		return (mcframe.clientMAUB.MAUBP5270.ContFctrUnitR) getConstInnerRow(offset + 46, $cont_fctr_unit_p);
	}
	
	public void cont_fctr_unit_p(mcframe.clientMAUB.MAUBP5270.ContFctrUnitR row){
		setConstInnerRow(offset + 46, $cont_fctr_unit_p, row);
	}


	/**
	 * Active ingredient unit number of decimal places 有効成分単位小数部有効桁数.<p>
	 *
	 */
	public MCNumber cont_fctr_dec_place() {
		return getConstNumber(offset + 47, $cont_fctr_dec_place);
	}

	/**
	 * Active ingredient unit number of decimal places 有効成分単位小数部有効桁数.<p>
	 *
	 */
	public void cont_fctr_dec_place(MCNumber value) {
		setConstNumber(offset + 47, $cont_fctr_dec_place, value);
	}

	/**
	 * Active ingredient unit number of decimal places 有効成分単位小数部有効桁数.<p>
	 *
	 */
	public void cont_fctr_dec_place(int value) {
		setConstNumber(offset + 47, $cont_fctr_dec_place, value);
	}

	/**
	 * Active ingredient unit number of decimal places 有効成分単位小数部有効桁数.<p>
	 *
	 */
	public void cont_fctr_dec_place(long value) {
		setConstNumber(offset + 47, $cont_fctr_dec_place, value);
	}

	/**
	 * Active ingredient unit number of decimal places 有効成分単位小数部有効桁数.<p>
	 *
	 */
	public void cont_fctr_dec_place(float value) {
		setConstNumber(offset + 47, $cont_fctr_dec_place, value);
	}

	/**
	 * Active ingredient unit number of decimal places 有効成分単位小数部有効桁数.<p>
	 *
	 */
	public void cont_fctr_dec_place(double value) {
		setConstNumber(offset + 47, $cont_fctr_dec_place, value);
	}


	/**
	 * Active ingredient unit rounding type 有効成分単位端数処理区分.<p>
	 *
	 */
	public String cont_fctr_rnd_typ() {
		return getConstString(offset + 48, $cont_fctr_rnd_typ);
	}

	/**
	 * Active ingredient unit rounding type 有効成分単位端数処理区分.<p>
	 *
	 */
	public void cont_fctr_rnd_typ(String value) {
		setConstString(offset + 48, $cont_fctr_rnd_typ, value);
	}


	public mcframe.clientMAUB.MAUBP5290.ActContFctrR act_cont_fctr_p(){
		return (mcframe.clientMAUB.MAUBP5290.ActContFctrR) getConstInnerRow(offset + 49, $act_cont_fctr_p);
	}
	
	public void act_cont_fctr_p(mcframe.clientMAUB.MAUBP5290.ActContFctrR row){
		setConstInnerRow(offset + 49, $act_cont_fctr_p, row);
	}


	public mcframe.clientMAUB.MAUBP5260.ContQtyR act_cont_qty_p(){
		return (mcframe.clientMAUB.MAUBP5260.ContQtyR) getConstInnerRow(offset + 50, $act_cont_qty_p);
	}
	
	public void act_cont_qty_p(mcframe.clientMAUB.MAUBP5260.ContQtyR row){
		setConstInnerRow(offset + 50, $act_cont_qty_p, row);
	}


	public mcframe.clientMAUB.MAUBP5280.StdContFctrR std_cont_fctr_p(){
		return (mcframe.clientMAUB.MAUBP5280.StdContFctrR) getConstInnerRow(offset + 51, $std_cont_fctr_p);
	}
	
	public void std_cont_fctr_p(mcframe.clientMAUB.MAUBP5280.StdContFctrR row){
		setConstInnerRow(offset + 51, $std_cont_fctr_p, row);
	}


	public mcframe.clientMAUB.MAUBP5260.ContQtyR std_cont_qty_p(){
		return (mcframe.clientMAUB.MAUBP5260.ContQtyR) getConstInnerRow(offset + 52, $std_cont_qty_p);
	}
	
	public void std_cont_qty_p(mcframe.clientMAUB.MAUBP5260.ContQtyR row){
		setConstInnerRow(offset + 52, $std_cont_qty_p, row);
	}


	/**
	 * GI location cd. 出庫場所ＣＤ.<p>
	 *
	 */
	public String gi_loc_cd() {
		return getConstString(offset + 53, $gi_loc_cd);
	}

	/**
	 * GI location cd. 出庫場所ＣＤ.<p>
	 *
	 */
	public void gi_loc_cd(String value) {
		setConstString(offset + 53, $gi_loc_cd, value);
	}


	/**
	 * GI location name 出庫場所名.<p>
	 *
	 */
	public String gi_loc_nm() {
		return getConstString(offset + 54, $gi_loc_nm);
	}

	/**
	 * GI location name 出庫場所名.<p>
	 *
	 */
	public void gi_loc_nm(String value) {
		setConstString(offset + 54, $gi_loc_nm, value);
	}


	/**
	 * GI factory/distribution warehouse cd. 出庫工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public String gi_site_cd() {
		return getConstString(offset + 55, $gi_site_cd);
	}

	/**
	 * GI factory/distribution warehouse cd. 出庫工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public void gi_site_cd(String value) {
		setConstString(offset + 55, $gi_site_cd, value);
	}


	/**
	 * GI supplier cd. 出庫発注先ＣＤ.<p>
	 *
	 */
	public String gi_sppl_cd() {
		return getConstString(offset + 56, $gi_sppl_cd);
	}

	/**
	 * GI supplier cd. 出庫発注先ＣＤ.<p>
	 *
	 */
	public void gi_sppl_cd(String value) {
		setConstString(offset + 56, $gi_sppl_cd, value);
	}


	/**
	 * For GI rack/line 出庫棚・ライン対象.<p>
	 *
	 */
	public boolean gi_str_ln_tgt_flg() {
		return getConstBoolean(offset + 57, $gi_str_ln_tgt_flg);
	}

	/**
	 * For GI rack/line 出庫棚・ライン対象.<p>
	 *
	 */
	public void gi_str_ln_tgt_flg(boolean value) {
		setConstBoolean(offset + 57, $gi_str_ln_tgt_flg, value);
	}


	public mcframe.clientMAUB.MAUBP5120.StrLnR gi_str_ln_p(){
		return (mcframe.clientMAUB.MAUBP5120.StrLnR) getConstInnerRow(offset + 58, $gi_str_ln_p);
	}
	
	public void gi_str_ln_p(mcframe.clientMAUB.MAUBP5120.StrLnR row){
		setConstInnerRow(offset + 58, $gi_str_ln_p, row);
	}


	public mcframe.clientMAUB.MAUBP5120.StrLnR gr_str_ln_p(){
		return (mcframe.clientMAUB.MAUBP5120.StrLnR) getConstInnerRow(offset + 59, $gr_str_ln_p);
	}
	
	public void gr_str_ln_p(mcframe.clientMAUB.MAUBP5120.StrLnR row){
		setConstInnerRow(offset + 59, $gr_str_ln_p, row);
	}


	/**
	 * Conforming type 良品区分.<p>
	 *
	 */
	public String quality_typ() {
		return getConstString(offset + 60, $quality_typ);
	}

	/**
	 * Conforming type 良品区分.<p>
	 *
	 */
	public void quality_typ(String value) {
		setConstString(offset + 60, $quality_typ, value);
	}


	/**
	 * Conforming type name 良品区分名.<p>
	 *
	 */
	public String quality_typ_nm() {
		return getConstString(offset + 61, $quality_typ_nm);
	}

	/**
	 * Conforming type name 良品区分名.<p>
	 *
	 */
	public void quality_typ_nm(String value) {
		setConstString(offset + 61, $quality_typ_nm, value);
	}


	/**
	 * Grading cd. 格付ＣＤ.<p>
	 *
	 */
	public String gd_cd() {
		return getConstString(offset + 62, $gd_cd);
	}

	/**
	 * Grading cd. 格付ＣＤ.<p>
	 *
	 */
	public void gd_cd(String value) {
		setConstString(offset + 62, $gd_cd, value);
	}


	/**
	 * Grading name 格付名.<p>
	 *
	 */
	public String gd_nm() {
		return getConstString(offset + 63, $gd_nm);
	}

	/**
	 * Grading name 格付名.<p>
	 *
	 */
	public void gd_nm(String value) {
		setConstString(offset + 63, $gd_nm, value);
	}


	public mcframe.clientMSUB.MSUBP5020.SnoWrkNoR sno_wrk_no_p(){
		return (mcframe.clientMSUB.MSUBP5020.SnoWrkNoR) getConstInnerRow(offset + 64, $sno_wrk_no_p);
	}
	
	public void sno_wrk_no_p(mcframe.clientMSUB.MSUBP5020.SnoWrkNoR row){
		setConstInnerRow(offset + 64, $sno_wrk_no_p, row);
	}


	public mcframe.clientMSUB.MSUBP5020.SnoWrkNoR alloc_sno_wrk_no_p(){
		return (mcframe.clientMSUB.MSUBP5020.SnoWrkNoR) getConstInnerRow(offset + 65, $alloc_sno_wrk_no_p);
	}
	
	public void alloc_sno_wrk_no_p(mcframe.clientMSUB.MSUBP5020.SnoWrkNoR row){
		setConstInnerRow(offset + 65, $alloc_sno_wrk_no_p, row);
	}


	/**
	 * Inventory identification type 在庫識別区分.<p>
	 *
	 */
	public String stk_id_typ() {
		return getConstString(offset + 66, $stk_id_typ);
	}

	/**
	 * Inventory identification type 在庫識別区分.<p>
	 *
	 */
	public void stk_id_typ(String value) {
		setConstString(offset + 66, $stk_id_typ, value);
	}


	/**
	 * Inventory identification type name 在庫識別区分名.<p>
	 *
	 */
	public String stk_id_typ_nm() {
		return getConstString(offset + 67, $stk_id_typ_nm);
	}

	/**
	 * Inventory identification type name 在庫識別区分名.<p>
	 *
	 */
	public void stk_id_typ_nm(String value) {
		setConstString(offset + 67, $stk_id_typ_nm, value);
	}


	public mcframe.clientMSUB.MSUBP5050.StkBpR stk_bp_p(){
		return (mcframe.clientMSUB.MSUBP5050.StkBpR) getConstInnerRow(offset + 68, $stk_bp_p);
	}
	
	public void stk_bp_p(mcframe.clientMSUB.MSUBP5050.StkBpR row){
		setConstInnerRow(offset + 68, $stk_bp_p, row);
	}


	/**
	 * GI inventory arriving point cd. 出庫在庫着荷先ＣＤ.<p>
	 *
	 */
	public String gi_stk_arrv_bp_cd() {
		return getConstString(offset + 69, $gi_stk_arrv_bp_cd);
	}

	/**
	 * GI inventory arriving point cd. 出庫在庫着荷先ＣＤ.<p>
	 *
	 */
	public void gi_stk_arrv_bp_cd(String value) {
		setConstString(offset + 69, $gi_stk_arrv_bp_cd, value);
	}


	/**
	 * GI inventory arriving point name 出庫在庫着荷先名.<p>
	 *
	 */
	public String gi_stk_arrv_bp_nm() {
		return getConstString(offset + 70, $gi_stk_arrv_bp_nm);
	}

	/**
	 * GI inventory arriving point name 出庫在庫着荷先名.<p>
	 *
	 */
	public void gi_stk_arrv_bp_nm(String value) {
		setConstString(offset + 70, $gi_stk_arrv_bp_nm, value);
	}


	/**
	 * Reason cd. 理由ＣＤ.<p>
	 *
	 */
	public String rsn_cd() {
		return getConstString(offset + 71, $rsn_cd);
	}

	/**
	 * Reason cd. 理由ＣＤ.<p>
	 *
	 */
	public void rsn_cd(String value) {
		setConstString(offset + 71, $rsn_cd, value);
	}


	/**
	 * Reason name 理由名.<p>
	 *
	 */
	public String rsn_nm() {
		return getConstString(offset + 72, $rsn_nm);
	}

	/**
	 * Reason name 理由名.<p>
	 *
	 */
	public void rsn_nm(String value) {
		setConstString(offset + 72, $rsn_nm, value);
	}


	/**
	 * Other accounting GI 他勘定出庫.<p>
	 *
	 */
	public boolean acxfr_gi_flg() {
		return getConstBoolean(offset + 73, $acxfr_gi_flg);
	}

	/**
	 * Other accounting GI 他勘定出庫.<p>
	 *
	 */
	public void acxfr_gi_flg(boolean value) {
		setConstBoolean(offset + 73, $acxfr_gi_flg, value);
	}


	/**
	 * Charged dept. cd. 負担部門ＣＤ.<p>
	 *
	 */
	public String bd_dpt_cd() {
		return getConstString(offset + 74, $bd_dpt_cd);
	}

	/**
	 * Charged dept. cd. 負担部門ＣＤ.<p>
	 *
	 */
	public void bd_dpt_cd(String value) {
		setConstString(offset + 74, $bd_dpt_cd, value);
	}


	/**
	 * Charged dept. name 負担部門名.<p>
	 *
	 */
	public String bd_dpt_nm() {
		return getConstString(offset + 75, $bd_dpt_nm);
	}

	/**
	 * Charged dept. name 負担部門名.<p>
	 *
	 */
	public void bd_dpt_nm(String value) {
		setConstString(offset + 75, $bd_dpt_nm, value);
	}


	/**
	 * Configuration check not required at shipping 出荷時構成チェック不要.<p>
	 *
	 */
	public boolean skip_chk_ship_flg() {
		return getConstBoolean(offset + 76, $skip_chk_ship_flg);
	}

	/**
	 * Configuration check not required at shipping 出荷時構成チェック不要.<p>
	 *
	 */
	public void skip_chk_ship_flg(boolean value) {
		setConstBoolean(offset + 76, $skip_chk_ship_flg, value);
	}


	/**
	 * Supply type 支給区分.<p>
	 *
	 */
	public String prov_typ() {
		return getConstString(offset + 77, $prov_typ);
	}

	/**
	 * Supply type 支給区分.<p>
	 *
	 */
	public void prov_typ(String value) {
		setConstString(offset + 77, $prov_typ, value);
	}


	/**
	 * Supply type name 支給区分名.<p>
	 *
	 */
	public String prov_typ_nm() {
		return getConstString(offset + 78, $prov_typ_nm);
	}

	/**
	 * Supply type name 支給区分名.<p>
	 *
	 */
	public void prov_typ_nm(String value) {
		setConstString(offset + 78, $prov_typ_nm, value);
	}


	/**
	 * Supply recording type 支給計上区分.<p>
	 *
	 */
	public String prov_basis_typ() {
		return getConstString(offset + 79, $prov_basis_typ);
	}

	/**
	 * Supply recording type 支給計上区分.<p>
	 *
	 */
	public void prov_basis_typ(String value) {
		setConstString(offset + 79, $prov_basis_typ, value);
	}


	/**
	 * Supply recording type name 支給計上区分名.<p>
	 *
	 */
	public String prov_basis_typ_nm() {
		return getConstString(offset + 80, $prov_basis_typ_nm);
	}

	/**
	 * Supply recording type name 支給計上区分名.<p>
	 *
	 */
	public void prov_basis_typ_nm(String value) {
		setConstString(offset + 80, $prov_basis_typ_nm, value);
	}


	/**
	 * Supply type (Return) 支給区分（返品）.<p>
	 *
	 */
	public String ret_prov_typ() {
		return getConstString(offset + 81, $ret_prov_typ);
	}

	/**
	 * Supply type (Return) 支給区分（返品）.<p>
	 *
	 */
	public void ret_prov_typ(String value) {
		setConstString(offset + 81, $ret_prov_typ, value);
	}


	/**
	 * Supply type name (Return) 支給区分名（返品）.<p>
	 *
	 */
	public String ret_prov_typ_nm() {
		return getConstString(offset + 82, $ret_prov_typ_nm);
	}

	/**
	 * Supply type name (Return) 支給区分名（返品）.<p>
	 *
	 */
	public void ret_prov_typ_nm(String value) {
		setConstString(offset + 82, $ret_prov_typ_nm, value);
	}


	/**
	 * Supply recording type (Return) 支給計上区分（返品）.<p>
	 *
	 */
	public String ret_prov_basis_typ() {
		return getConstString(offset + 83, $ret_prov_basis_typ);
	}

	/**
	 * Supply recording type (Return) 支給計上区分（返品）.<p>
	 *
	 */
	public void ret_prov_basis_typ(String value) {
		setConstString(offset + 83, $ret_prov_basis_typ, value);
	}


	/**
	 * Supply recording type name (Return) 支給計上区分名（返品）.<p>
	 *
	 */
	public String ret_prov_basis_typ_nm() {
		return getConstString(offset + 84, $ret_prov_basis_typ_nm);
	}

	/**
	 * Supply recording type name (Return) 支給計上区分名（返品）.<p>
	 *
	 */
	public void ret_prov_basis_typ_nm(String value) {
		setConstString(offset + 84, $ret_prov_basis_typ_nm, value);
	}


	/**
	 * Return-from delivery note No. 返品元納品書ＮＯ.<p>
	 *
	 */
	public String base_dlv_slip_no() {
		return getConstString(offset + 85, $base_dlv_slip_no);
	}

	/**
	 * Return-from delivery note No. 返品元納品書ＮＯ.<p>
	 *
	 */
	public void base_dlv_slip_no(String value) {
		setConstString(offset + 85, $base_dlv_slip_no, value);
	}


	/**
	 * Return-from supply result No. 返品元支給実績ＮＯ.<p>
	 *
	 */
	public String base_prov_act_no() {
		return getConstString(offset + 86, $base_prov_act_no);
	}

	/**
	 * Return-from supply result No. 返品元支給実績ＮＯ.<p>
	 *
	 */
	public void base_prov_act_no(String value) {
		setConstString(offset + 86, $base_prov_act_no, value);
	}


	/**
	 * Supply recording date (Base) 支給計上日（基）.<p>
	 *
	 */
	public MCDate base_ac_dt() {
		return getConstDate(offset + 87, $base_ac_dt);
	}

	/**
	 * Supply recording date (Base) 支給計上日（基）.<p>
	 *
	 */
	public void base_ac_dt(MCDate value) {
		setConstDate(offset + 87, $base_ac_dt, value);
	}


	/**
	 * Current WMS 今回ＷＭＳ.<p>
	 *
	 */
	public boolean wms_flg() {
		return getConstBoolean(offset + 88, $wms_flg);
	}

	/**
	 * Current WMS 今回ＷＭＳ.<p>
	 *
	 */
	public void wms_flg(boolean value) {
		setConstBoolean(offset + 88, $wms_flg, value);
	}


	/**
	 * Last WMS 前回ＷＭＳ.<p>
	 *
	 */
	public boolean last_wms_flg() {
		return getConstBoolean(offset + 89, $last_wms_flg);
	}

	/**
	 * Last WMS 前回ＷＭＳ.<p>
	 *
	 */
	public void last_wms_flg(boolean value) {
		setConstBoolean(offset + 89, $last_wms_flg, value);
	}


	/**
	 * For WMS export ＷＭＳ送信対象.<p>
	 *
	 */
	public boolean wms_tgt_flg() {
		return getConstBoolean(offset + 90, $wms_tgt_flg);
	}

	/**
	 * For WMS export ＷＭＳ送信対象.<p>
	 *
	 */
	public void wms_tgt_flg(boolean value) {
		setConstBoolean(offset + 90, $wms_tgt_flg, value);
	}


	/**
	 * Transaction details remarks 取引明細備考.<p>
	 *
	 */
	public String trd_d_rmrks() {
		return getConstString(offset + 91, $trd_d_rmrks);
	}

	/**
	 * Transaction details remarks 取引明細備考.<p>
	 *
	 */
	public void trd_d_rmrks(String value) {
		setConstString(offset + 91, $trd_d_rmrks, value);
	}


	/**
	 * Order details remarks 指図明細備考.<p>
	 *
	 */
	public String inst_d_rmrks() {
		return getConstString(offset + 92, $inst_d_rmrks);
	}

	/**
	 * Order details remarks 指図明細備考.<p>
	 *
	 */
	public void inst_d_rmrks(String value) {
		setConstString(offset + 92, $inst_d_rmrks, value);
	}


	/**
	 * Internal details remarks 内部明細備考.<p>
	 *
	 */
	public String intr_d_rmrks() {
		return getConstString(offset + 93, $intr_d_rmrks);
	}

	/**
	 * Internal details remarks 内部明細備考.<p>
	 *
	 */
	public void intr_d_rmrks(String value) {
		setConstString(offset + 93, $intr_d_rmrks, value);
	}


	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public String sub_char1() {
		return getConstString(offset + 94, $sub_char1);
	}

	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public void sub_char1(String value) {
		setConstString(offset + 94, $sub_char1, value);
	}


	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public String sub_char2() {
		return getConstString(offset + 95, $sub_char2);
	}

	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public void sub_char2(String value) {
		setConstString(offset + 95, $sub_char2, value);
	}


	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public String sub_char3() {
		return getConstString(offset + 96, $sub_char3);
	}

	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public void sub_char3(String value) {
		setConstString(offset + 96, $sub_char3, value);
	}


	/**
	 * Source movement/transport type 移動・移送元区分.<p>
	 *
	 */
	public String xfr_src_typ() {
		return getConstString(offset + 97, $xfr_src_typ);
	}

	/**
	 * Source movement/transport type 移動・移送元区分.<p>
	 *
	 */
	public void xfr_src_typ(String value) {
		setConstString(offset + 97, $xfr_src_typ, value);
	}


	/**
	 * Movement/transport source type name 移動・移送元区分名.<p>
	 *
	 */
	public String xfr_src_typ_nm() {
		return getConstString(offset + 98, $xfr_src_typ_nm);
	}

	/**
	 * Movement/transport source type name 移動・移送元区分名.<p>
	 *
	 */
	public void xfr_src_typ_nm(String value) {
		setConstString(offset + 98, $xfr_src_typ_nm, value);
	}


	/**
	 * Source movement/transport No. 移動・移送元ＮＯ.<p>
	 *
	 */
	public String xfr_src_no() {
		return getConstString(offset + 99, $xfr_src_no);
	}

	/**
	 * Source movement/transport No. 移動・移送元ＮＯ.<p>
	 *
	 */
	public void xfr_src_no(String value) {
		setConstString(offset + 99, $xfr_src_no, value);
	}


	/**
	 * Movement/transport schedule No. 移動・移送予定ＮＯ.<p>
	 *
	 */
	public String xfr_schd_no() {
		return getConstString(offset + 100, $xfr_schd_no);
	}

	/**
	 * Movement/transport schedule No. 移動・移送予定ＮＯ.<p>
	 *
	 */
	public void xfr_schd_no(String value) {
		setConstString(offset + 100, $xfr_schd_no, value);
	}


	/**
	 * Movement allocation status No. 移動引当状況ＮＯ.<p>
	 *
	 */
	public String xfr_alloc_sts_no() {
		return getConstString(offset + 101, $xfr_alloc_sts_no);
	}

	/**
	 * Movement allocation status No. 移動引当状況ＮＯ.<p>
	 *
	 */
	public void xfr_alloc_sts_no(String value) {
		setConstString(offset + 101, $xfr_alloc_sts_no, value);
	}


	/**
	 * Movement allocation before split status No. 分割前移動引当状況ＮＯ.<p>
	 *
	 */
	public String old_xfr_alloc_sts_no() {
		return getConstString(offset + 102, $old_xfr_alloc_sts_no);
	}

	/**
	 * Movement allocation before split status No. 分割前移動引当状況ＮＯ.<p>
	 *
	 */
	public void old_xfr_alloc_sts_no(String value) {
		setConstString(offset + 102, $old_xfr_alloc_sts_no, value);
	}


	/**
	 * Movement order details No. 移動指図明細ＮＯ.<p>
	 *
	 */
	public String xfr_inst_d_no() {
		return getConstString(offset + 103, $xfr_inst_d_no);
	}

	/**
	 * Movement order details No. 移動指図明細ＮＯ.<p>
	 *
	 */
	public void xfr_inst_d_no(String value) {
		setConstString(offset + 103, $xfr_inst_d_no, value);
	}


	/**
	 * Delivery note No. 納品書ＮＯ.<p>
	 *
	 */
	public String dlv_slip_no() {
		return getConstString(offset + 104, $dlv_slip_no);
	}

	/**
	 * Delivery note No. 納品書ＮＯ.<p>
	 *
	 */
	public void dlv_slip_no(String value) {
		setConstString(offset + 104, $dlv_slip_no, value);
	}


	/**
	 * Delivery note details No. 納品書明細ＮＯ.<p>
	 *
	 */
	public String dlv_slip_d_no() {
		return getConstString(offset + 105, $dlv_slip_d_no);
	}

	/**
	 * Delivery note details No. 納品書明細ＮＯ.<p>
	 *
	 */
	public void dlv_slip_d_no(String value) {
		setConstString(offset + 105, $dlv_slip_d_no, value);
	}


	/**
	 * Schedule supply No. 1 支給予定ＮＯ１.<p>
	 *
	 */
	public String prov_schd_no() {
		return getConstString(offset + 106, $prov_schd_no);
	}

	/**
	 * Schedule supply No. 1 支給予定ＮＯ１.<p>
	 *
	 */
	public void prov_schd_no(String value) {
		setConstString(offset + 106, $prov_schd_no, value);
	}


	/**
	 * Schedule supply No. 2 支給予定ＮＯ２.<p>
	 *
	 */
	public String ret_prov_schd_no() {
		return getConstString(offset + 107, $ret_prov_schd_no);
	}

	/**
	 * Schedule supply No. 2 支給予定ＮＯ２.<p>
	 *
	 */
	public void ret_prov_schd_no(String value) {
		setConstString(offset + 107, $ret_prov_schd_no, value);
	}


	/**
	 * GR/GI progress management No. 受払進捗管理ＮＯ.<p>
	 *
	 */
	public String io_schd_pr_no() {
		return getConstString(offset + 108, $io_schd_pr_no);
	}

	/**
	 * GR/GI progress management No. 受払進捗管理ＮＯ.<p>
	 *
	 */
	public void io_schd_pr_no(String value) {
		setConstString(offset + 108, $io_schd_pr_no, value);
	}


	/**
	 * Prohibit mixed lots ロット混在不可.<p>
	 *
	 */
	public boolean not_lot_mix_flg() {
		return getConstBoolean(offset + 109, $not_lot_mix_flg);
	}

	/**
	 * Prohibit mixed lots ロット混在不可.<p>
	 *
	 */
	public void not_lot_mix_flg(boolean value) {
		setConstBoolean(offset + 109, $not_lot_mix_flg, value);
	}


	/**
	 * Prohibit mixed sublots サブロット混在不可.<p>
	 *
	 */
	public boolean not_sublot_mix_flg() {
		return getConstBoolean(offset + 110, $not_sublot_mix_flg);
	}

	/**
	 * Prohibit mixed sublots サブロット混在不可.<p>
	 *
	 */
	public void not_sublot_mix_flg(boolean value) {
		setConstBoolean(offset + 110, $not_sublot_mix_flg, value);
	}


	/**
	 * Expiration date FROM 有効期限ＦＲＯＭ.<p>
	 *
	 */
	public MCDate vld_dt_fr() {
		return getConstDate(offset + 111, $vld_dt_fr);
	}

	/**
	 * Expiration date FROM 有効期限ＦＲＯＭ.<p>
	 *
	 */
	public void vld_dt_fr(MCDate value) {
		setConstDate(offset + 111, $vld_dt_fr, value);
	}


	/**
	 * Display order 表示順.<p>
	 *
	 */
	public MCNumber disp_seq() {
		return getConstNumber(offset + 112, $disp_seq);
	}

	/**
	 * Display order 表示順.<p>
	 *
	 */
	public void disp_seq(MCNumber value) {
		setConstNumber(offset + 112, $disp_seq, value);
	}

	/**
	 * Display order 表示順.<p>
	 *
	 */
	public void disp_seq(int value) {
		setConstNumber(offset + 112, $disp_seq, value);
	}

	/**
	 * Display order 表示順.<p>
	 *
	 */
	public void disp_seq(long value) {
		setConstNumber(offset + 112, $disp_seq, value);
	}

	/**
	 * Display order 表示順.<p>
	 *
	 */
	public void disp_seq(float value) {
		setConstNumber(offset + 112, $disp_seq, value);
	}

	/**
	 * Display order 表示順.<p>
	 *
	 */
	public void disp_seq(double value) {
		setConstNumber(offset + 112, $disp_seq, value);
	}


	/**
	 * Update counter (Allocation status) 更新カウンタ(引当状況).<p>
	 *
	 */
	public MCNumber alloc_sts_upd_cntr() {
		return getConstNumber(offset + 113, $alloc_sts_upd_cntr);
	}

	/**
	 * Update counter (Allocation status) 更新カウンタ(引当状況).<p>
	 *
	 */
	public void alloc_sts_upd_cntr(MCNumber value) {
		setConstNumber(offset + 113, $alloc_sts_upd_cntr, value);
	}

	/**
	 * Update counter (Allocation status) 更新カウンタ(引当状況).<p>
	 *
	 */
	public void alloc_sts_upd_cntr(int value) {
		setConstNumber(offset + 113, $alloc_sts_upd_cntr, value);
	}

	/**
	 * Update counter (Allocation status) 更新カウンタ(引当状況).<p>
	 *
	 */
	public void alloc_sts_upd_cntr(long value) {
		setConstNumber(offset + 113, $alloc_sts_upd_cntr, value);
	}

	/**
	 * Update counter (Allocation status) 更新カウンタ(引当状況).<p>
	 *
	 */
	public void alloc_sts_upd_cntr(float value) {
		setConstNumber(offset + 113, $alloc_sts_upd_cntr, value);
	}

	/**
	 * Update counter (Allocation status) 更新カウンタ(引当状況).<p>
	 *
	 */
	public void alloc_sts_upd_cntr(double value) {
		setConstNumber(offset + 113, $alloc_sts_upd_cntr, value);
	}


	/**
	 * Order aggregation pegging No. 指図まとめ紐付けＮＯ.<p>
	 *
	 */
	public MCNumber inst_bndl_peg_no() {
		return getConstNumber(offset + 114, $inst_bndl_peg_no);
	}

	/**
	 * Order aggregation pegging No. 指図まとめ紐付けＮＯ.<p>
	 *
	 */
	public void inst_bndl_peg_no(MCNumber value) {
		setConstNumber(offset + 114, $inst_bndl_peg_no, value);
	}

	/**
	 * Order aggregation pegging No. 指図まとめ紐付けＮＯ.<p>
	 *
	 */
	public void inst_bndl_peg_no(int value) {
		setConstNumber(offset + 114, $inst_bndl_peg_no, value);
	}

	/**
	 * Order aggregation pegging No. 指図まとめ紐付けＮＯ.<p>
	 *
	 */
	public void inst_bndl_peg_no(long value) {
		setConstNumber(offset + 114, $inst_bndl_peg_no, value);
	}

	/**
	 * Order aggregation pegging No. 指図まとめ紐付けＮＯ.<p>
	 *
	 */
	public void inst_bndl_peg_no(float value) {
		setConstNumber(offset + 114, $inst_bndl_peg_no, value);
	}

	/**
	 * Order aggregation pegging No. 指図まとめ紐付けＮＯ.<p>
	 *
	 */
	public void inst_bndl_peg_no(double value) {
		setConstNumber(offset + 114, $inst_bndl_peg_no, value);
	}


	/**
	 * Order aggregation-to pegging No. 指図まとめ先紐付けＮＯ.<p>
	 *
	 */
	public MCNumber inst_bndl_to_peg_no() {
		return getConstNumber(offset + 115, $inst_bndl_to_peg_no);
	}

	/**
	 * Order aggregation-to pegging No. 指図まとめ先紐付けＮＯ.<p>
	 *
	 */
	public void inst_bndl_to_peg_no(MCNumber value) {
		setConstNumber(offset + 115, $inst_bndl_to_peg_no, value);
	}

	/**
	 * Order aggregation-to pegging No. 指図まとめ先紐付けＮＯ.<p>
	 *
	 */
	public void inst_bndl_to_peg_no(int value) {
		setConstNumber(offset + 115, $inst_bndl_to_peg_no, value);
	}

	/**
	 * Order aggregation-to pegging No. 指図まとめ先紐付けＮＯ.<p>
	 *
	 */
	public void inst_bndl_to_peg_no(long value) {
		setConstNumber(offset + 115, $inst_bndl_to_peg_no, value);
	}

	/**
	 * Order aggregation-to pegging No. 指図まとめ先紐付けＮＯ.<p>
	 *
	 */
	public void inst_bndl_to_peg_no(float value) {
		setConstNumber(offset + 115, $inst_bndl_to_peg_no, value);
	}

	/**
	 * Order aggregation-to pegging No. 指図まとめ先紐付けＮＯ.<p>
	 *
	 */
	public void inst_bndl_to_peg_no(double value) {
		setConstNumber(offset + 115, $inst_bndl_to_peg_no, value);
	}


	/**
	 * Inventory info. location type 在庫情報場所区分.<p>
	 *
	 */
	public String stk_info_loc_typ() {
		return getConstString(offset + 116, $stk_info_loc_typ);
	}

	/**
	 * Inventory info. location type 在庫情報場所区分.<p>
	 *
	 */
	public void stk_info_loc_typ(String value) {
		setConstString(offset + 116, $stk_info_loc_typ, value);
	}


	/**
	 * Remaining allocation 引当残.<p>
	 *
	 */
	public boolean no_alloc_flg() {
		return getConstBoolean(offset + 117, $no_alloc_flg);
	}

	/**
	 * Remaining allocation 引当残.<p>
	 *
	 */
	public void no_alloc_flg(boolean value) {
		setConstBoolean(offset + 117, $no_alloc_flg, value);
	}


	/**
	 * Copy コピー.<p>
	 *
	 */
	public boolean copy_flg() {
		return getConstBoolean(offset + 118, $copy_flg);
	}

	/**
	 * Copy コピー.<p>
	 *
	 */
	public void copy_flg(boolean value) {
		setConstBoolean(offset + 118, $copy_flg, value);
	}


	public String getString(String name) {
		if ($pr_sts_typ.equalsIgnoreCase(name)) {
			return pr_sts_typ();
		}
		if ($pr_sts_typ_nm.equalsIgnoreCase(name)) {
			return pr_sts_typ_nm();
		}
		if ($lot_mng_typ.equalsIgnoreCase(name)) {
			return lot_mng_typ();
		}
		if ($sublot_mng_typ.equalsIgnoreCase(name)) {
			return sublot_mng_typ();
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
		if ($asset_mng_typ.equalsIgnoreCase(name)) {
			return asset_mng_typ();
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
		if ($pckg_unit_cd.equalsIgnoreCase(name)) {
			return pckg_unit_cd();
		}
		if ($pckg_unit_nm.equalsIgnoreCase(name)) {
			return pckg_unit_nm();
		}
		if ($schd_unit_cd.equalsIgnoreCase(name)) {
			return schd_unit_cd();
		}
		if ($schd_unit_nm.equalsIgnoreCase(name)) {
			return schd_unit_nm();
		}
		if ($cont_fctr_rnd_typ.equalsIgnoreCase(name)) {
			return cont_fctr_rnd_typ();
		}
		if ($gi_loc_cd.equalsIgnoreCase(name)) {
			return gi_loc_cd();
		}
		if ($gi_loc_nm.equalsIgnoreCase(name)) {
			return gi_loc_nm();
		}
		if ($gi_site_cd.equalsIgnoreCase(name)) {
			return gi_site_cd();
		}
		if ($gi_sppl_cd.equalsIgnoreCase(name)) {
			return gi_sppl_cd();
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
		if ($stk_id_typ.equalsIgnoreCase(name)) {
			return stk_id_typ();
		}
		if ($stk_id_typ_nm.equalsIgnoreCase(name)) {
			return stk_id_typ_nm();
		}
		if ($gi_stk_arrv_bp_cd.equalsIgnoreCase(name)) {
			return gi_stk_arrv_bp_cd();
		}
		if ($gi_stk_arrv_bp_nm.equalsIgnoreCase(name)) {
			return gi_stk_arrv_bp_nm();
		}
		if ($rsn_cd.equalsIgnoreCase(name)) {
			return rsn_cd();
		}
		if ($rsn_nm.equalsIgnoreCase(name)) {
			return rsn_nm();
		}
		if ($bd_dpt_cd.equalsIgnoreCase(name)) {
			return bd_dpt_cd();
		}
		if ($bd_dpt_nm.equalsIgnoreCase(name)) {
			return bd_dpt_nm();
		}
		if ($prov_typ.equalsIgnoreCase(name)) {
			return prov_typ();
		}
		if ($prov_typ_nm.equalsIgnoreCase(name)) {
			return prov_typ_nm();
		}
		if ($prov_basis_typ.equalsIgnoreCase(name)) {
			return prov_basis_typ();
		}
		if ($prov_basis_typ_nm.equalsIgnoreCase(name)) {
			return prov_basis_typ_nm();
		}
		if ($ret_prov_typ.equalsIgnoreCase(name)) {
			return ret_prov_typ();
		}
		if ($ret_prov_typ_nm.equalsIgnoreCase(name)) {
			return ret_prov_typ_nm();
		}
		if ($ret_prov_basis_typ.equalsIgnoreCase(name)) {
			return ret_prov_basis_typ();
		}
		if ($ret_prov_basis_typ_nm.equalsIgnoreCase(name)) {
			return ret_prov_basis_typ_nm();
		}
		if ($base_dlv_slip_no.equalsIgnoreCase(name)) {
			return base_dlv_slip_no();
		}
		if ($base_prov_act_no.equalsIgnoreCase(name)) {
			return base_prov_act_no();
		}
		if ($trd_d_rmrks.equalsIgnoreCase(name)) {
			return trd_d_rmrks();
		}
		if ($inst_d_rmrks.equalsIgnoreCase(name)) {
			return inst_d_rmrks();
		}
		if ($intr_d_rmrks.equalsIgnoreCase(name)) {
			return intr_d_rmrks();
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
		if ($xfr_src_typ.equalsIgnoreCase(name)) {
			return xfr_src_typ();
		}
		if ($xfr_src_typ_nm.equalsIgnoreCase(name)) {
			return xfr_src_typ_nm();
		}
		if ($xfr_src_no.equalsIgnoreCase(name)) {
			return xfr_src_no();
		}
		if ($xfr_schd_no.equalsIgnoreCase(name)) {
			return xfr_schd_no();
		}
		if ($xfr_alloc_sts_no.equalsIgnoreCase(name)) {
			return xfr_alloc_sts_no();
		}
		if ($old_xfr_alloc_sts_no.equalsIgnoreCase(name)) {
			return old_xfr_alloc_sts_no();
		}
		if ($xfr_inst_d_no.equalsIgnoreCase(name)) {
			return xfr_inst_d_no();
		}
		if ($dlv_slip_no.equalsIgnoreCase(name)) {
			return dlv_slip_no();
		}
		if ($dlv_slip_d_no.equalsIgnoreCase(name)) {
			return dlv_slip_d_no();
		}
		if ($prov_schd_no.equalsIgnoreCase(name)) {
			return prov_schd_no();
		}
		if ($ret_prov_schd_no.equalsIgnoreCase(name)) {
			return ret_prov_schd_no();
		}
		if ($io_schd_pr_no.equalsIgnoreCase(name)) {
			return io_schd_pr_no();
		}
		if ($stk_info_loc_typ.equalsIgnoreCase(name)) {
			return stk_info_loc_typ();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($peg_no.equalsIgnoreCase(name)) {
			return peg_no();
		}
		if ($trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			return trd_unit_conv_base_qty();
		}
		if ($trd_unit_conv_qty.equalsIgnoreCase(name)) {
			return trd_unit_conv_qty();
		}
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			return trd_unit_dec_place();
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			return base_unit_dec_place();
		}
		if ($pckg_unit_conv_base_qty.equalsIgnoreCase(name)) {
			return pckg_unit_conv_base_qty();
		}
		if ($pckg_unit_conv_qty.equalsIgnoreCase(name)) {
			return pckg_unit_conv_qty();
		}
		if ($pckg_unit_dec_place.equalsIgnoreCase(name)) {
			return pckg_unit_dec_place();
		}
		if ($schd_unit_dec_place.equalsIgnoreCase(name)) {
			return schd_unit_dec_place();
		}
		if ($cont_fctr_dec_place.equalsIgnoreCase(name)) {
			return cont_fctr_dec_place();
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			return disp_seq();
		}
		if ($alloc_sts_upd_cntr.equalsIgnoreCase(name)) {
			return alloc_sts_upd_cntr();
		}
		if ($inst_bndl_peg_no.equalsIgnoreCase(name)) {
			return inst_bndl_peg_no();
		}
		if ($inst_bndl_to_peg_no.equalsIgnoreCase(name)) {
			return inst_bndl_to_peg_no();
		}
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		if ($base_ac_dt.equalsIgnoreCase(name)) {
			return base_ac_dt();
		}
		if ($vld_dt_fr.equalsIgnoreCase(name)) {
			return vld_dt_fr();
		}
		return super.getDate(name);
	}
	public boolean getBoolean(String name) {
		if ($check.equalsIgnoreCase(name)) {
			return check();
		}
		if ($alloc_flg.equalsIgnoreCase(name)) {
			return alloc_flg();
		}
		if ($lot_none_flg.equalsIgnoreCase(name)) {
			return lot_none_flg();
		}
		if ($def_ver_flg.equalsIgnoreCase(name)) {
			return def_ver_flg();
		}
		if ($schd_abort_flg.equalsIgnoreCase(name)) {
			return schd_abort_flg();
		}
		if ($inst_abort_flg.equalsIgnoreCase(name)) {
			return inst_abort_flg();
		}
		if ($ttl_flg.equalsIgnoreCase(name)) {
			return ttl_flg();
		}
		if ($inst_bndl_flg.equalsIgnoreCase(name)) {
			return inst_bndl_flg();
		}
		if ($inst_bndl_src_flg.equalsIgnoreCase(name)) {
			return inst_bndl_src_flg();
		}
		if ($cont_fctr_flg.equalsIgnoreCase(name)) {
			return cont_fctr_flg();
		}
		if ($gi_str_ln_tgt_flg.equalsIgnoreCase(name)) {
			return gi_str_ln_tgt_flg();
		}
		if ($acxfr_gi_flg.equalsIgnoreCase(name)) {
			return acxfr_gi_flg();
		}
		if ($skip_chk_ship_flg.equalsIgnoreCase(name)) {
			return skip_chk_ship_flg();
		}
		if ($wms_flg.equalsIgnoreCase(name)) {
			return wms_flg();
		}
		if ($last_wms_flg.equalsIgnoreCase(name)) {
			return last_wms_flg();
		}
		if ($wms_tgt_flg.equalsIgnoreCase(name)) {
			return wms_tgt_flg();
		}
		if ($not_lot_mix_flg.equalsIgnoreCase(name)) {
			return not_lot_mix_flg();
		}
		if ($not_sublot_mix_flg.equalsIgnoreCase(name)) {
			return not_sublot_mix_flg();
		}
		if ($no_alloc_flg.equalsIgnoreCase(name)) {
			return no_alloc_flg();
		}
		if ($copy_flg.equalsIgnoreCase(name)) {
			return copy_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($pr_sts_typ.equalsIgnoreCase(name)) {
			return pr_sts_typ();
		}
		if ($pr_sts_typ_nm.equalsIgnoreCase(name)) {
			return pr_sts_typ_nm();
		}
		if ($lot_mng_typ.equalsIgnoreCase(name)) {
			return lot_mng_typ();
		}
		if ($sublot_mng_typ.equalsIgnoreCase(name)) {
			return sublot_mng_typ();
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
		if ($asset_mng_typ.equalsIgnoreCase(name)) {
			return asset_mng_typ();
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
		if ($pckg_unit_cd.equalsIgnoreCase(name)) {
			return pckg_unit_cd();
		}
		if ($pckg_unit_nm.equalsIgnoreCase(name)) {
			return pckg_unit_nm();
		}
		if ($schd_unit_cd.equalsIgnoreCase(name)) {
			return schd_unit_cd();
		}
		if ($schd_unit_nm.equalsIgnoreCase(name)) {
			return schd_unit_nm();
		}
		if ($cont_fctr_rnd_typ.equalsIgnoreCase(name)) {
			return cont_fctr_rnd_typ();
		}
		if ($gi_loc_cd.equalsIgnoreCase(name)) {
			return gi_loc_cd();
		}
		if ($gi_loc_nm.equalsIgnoreCase(name)) {
			return gi_loc_nm();
		}
		if ($gi_site_cd.equalsIgnoreCase(name)) {
			return gi_site_cd();
		}
		if ($gi_sppl_cd.equalsIgnoreCase(name)) {
			return gi_sppl_cd();
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
		if ($stk_id_typ.equalsIgnoreCase(name)) {
			return stk_id_typ();
		}
		if ($stk_id_typ_nm.equalsIgnoreCase(name)) {
			return stk_id_typ_nm();
		}
		if ($gi_stk_arrv_bp_cd.equalsIgnoreCase(name)) {
			return gi_stk_arrv_bp_cd();
		}
		if ($gi_stk_arrv_bp_nm.equalsIgnoreCase(name)) {
			return gi_stk_arrv_bp_nm();
		}
		if ($rsn_cd.equalsIgnoreCase(name)) {
			return rsn_cd();
		}
		if ($rsn_nm.equalsIgnoreCase(name)) {
			return rsn_nm();
		}
		if ($bd_dpt_cd.equalsIgnoreCase(name)) {
			return bd_dpt_cd();
		}
		if ($bd_dpt_nm.equalsIgnoreCase(name)) {
			return bd_dpt_nm();
		}
		if ($prov_typ.equalsIgnoreCase(name)) {
			return prov_typ();
		}
		if ($prov_typ_nm.equalsIgnoreCase(name)) {
			return prov_typ_nm();
		}
		if ($prov_basis_typ.equalsIgnoreCase(name)) {
			return prov_basis_typ();
		}
		if ($prov_basis_typ_nm.equalsIgnoreCase(name)) {
			return prov_basis_typ_nm();
		}
		if ($ret_prov_typ.equalsIgnoreCase(name)) {
			return ret_prov_typ();
		}
		if ($ret_prov_typ_nm.equalsIgnoreCase(name)) {
			return ret_prov_typ_nm();
		}
		if ($ret_prov_basis_typ.equalsIgnoreCase(name)) {
			return ret_prov_basis_typ();
		}
		if ($ret_prov_basis_typ_nm.equalsIgnoreCase(name)) {
			return ret_prov_basis_typ_nm();
		}
		if ($base_dlv_slip_no.equalsIgnoreCase(name)) {
			return base_dlv_slip_no();
		}
		if ($base_prov_act_no.equalsIgnoreCase(name)) {
			return base_prov_act_no();
		}
		if ($trd_d_rmrks.equalsIgnoreCase(name)) {
			return trd_d_rmrks();
		}
		if ($inst_d_rmrks.equalsIgnoreCase(name)) {
			return inst_d_rmrks();
		}
		if ($intr_d_rmrks.equalsIgnoreCase(name)) {
			return intr_d_rmrks();
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
		if ($xfr_src_typ.equalsIgnoreCase(name)) {
			return xfr_src_typ();
		}
		if ($xfr_src_typ_nm.equalsIgnoreCase(name)) {
			return xfr_src_typ_nm();
		}
		if ($xfr_src_no.equalsIgnoreCase(name)) {
			return xfr_src_no();
		}
		if ($xfr_schd_no.equalsIgnoreCase(name)) {
			return xfr_schd_no();
		}
		if ($xfr_alloc_sts_no.equalsIgnoreCase(name)) {
			return xfr_alloc_sts_no();
		}
		if ($old_xfr_alloc_sts_no.equalsIgnoreCase(name)) {
			return old_xfr_alloc_sts_no();
		}
		if ($xfr_inst_d_no.equalsIgnoreCase(name)) {
			return xfr_inst_d_no();
		}
		if ($dlv_slip_no.equalsIgnoreCase(name)) {
			return dlv_slip_no();
		}
		if ($dlv_slip_d_no.equalsIgnoreCase(name)) {
			return dlv_slip_d_no();
		}
		if ($prov_schd_no.equalsIgnoreCase(name)) {
			return prov_schd_no();
		}
		if ($ret_prov_schd_no.equalsIgnoreCase(name)) {
			return ret_prov_schd_no();
		}
		if ($io_schd_pr_no.equalsIgnoreCase(name)) {
			return io_schd_pr_no();
		}
		if ($stk_info_loc_typ.equalsIgnoreCase(name)) {
			return stk_info_loc_typ();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($peg_no.equalsIgnoreCase(name)) {
			return peg_no();
		}
		if ($trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			return trd_unit_conv_base_qty();
		}
		if ($trd_unit_conv_qty.equalsIgnoreCase(name)) {
			return trd_unit_conv_qty();
		}
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			return trd_unit_dec_place();
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			return base_unit_dec_place();
		}
		if ($pckg_unit_conv_base_qty.equalsIgnoreCase(name)) {
			return pckg_unit_conv_base_qty();
		}
		if ($pckg_unit_conv_qty.equalsIgnoreCase(name)) {
			return pckg_unit_conv_qty();
		}
		if ($pckg_unit_dec_place.equalsIgnoreCase(name)) {
			return pckg_unit_dec_place();
		}
		if ($schd_unit_dec_place.equalsIgnoreCase(name)) {
			return schd_unit_dec_place();
		}
		if ($cont_fctr_dec_place.equalsIgnoreCase(name)) {
			return cont_fctr_dec_place();
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			return disp_seq();
		}
		if ($alloc_sts_upd_cntr.equalsIgnoreCase(name)) {
			return alloc_sts_upd_cntr();
		}
		if ($inst_bndl_peg_no.equalsIgnoreCase(name)) {
			return inst_bndl_peg_no();
		}
		if ($inst_bndl_to_peg_no.equalsIgnoreCase(name)) {
			return inst_bndl_to_peg_no();
		}
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($base_ac_dt.equalsIgnoreCase(name)) {
			return base_ac_dt();
		}
		if ($vld_dt_fr.equalsIgnoreCase(name)) {
			return vld_dt_fr();
		}
		return super.getDateNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($check.equalsIgnoreCase(name)) {
			return check();
		}
		if ($alloc_flg.equalsIgnoreCase(name)) {
			return alloc_flg();
		}
		if ($lot_none_flg.equalsIgnoreCase(name)) {
			return lot_none_flg();
		}
		if ($def_ver_flg.equalsIgnoreCase(name)) {
			return def_ver_flg();
		}
		if ($schd_abort_flg.equalsIgnoreCase(name)) {
			return schd_abort_flg();
		}
		if ($inst_abort_flg.equalsIgnoreCase(name)) {
			return inst_abort_flg();
		}
		if ($ttl_flg.equalsIgnoreCase(name)) {
			return ttl_flg();
		}
		if ($inst_bndl_flg.equalsIgnoreCase(name)) {
			return inst_bndl_flg();
		}
		if ($inst_bndl_src_flg.equalsIgnoreCase(name)) {
			return inst_bndl_src_flg();
		}
		if ($cont_fctr_flg.equalsIgnoreCase(name)) {
			return cont_fctr_flg();
		}
		if ($gi_str_ln_tgt_flg.equalsIgnoreCase(name)) {
			return gi_str_ln_tgt_flg();
		}
		if ($acxfr_gi_flg.equalsIgnoreCase(name)) {
			return acxfr_gi_flg();
		}
		if ($skip_chk_ship_flg.equalsIgnoreCase(name)) {
			return skip_chk_ship_flg();
		}
		if ($wms_flg.equalsIgnoreCase(name)) {
			return wms_flg();
		}
		if ($last_wms_flg.equalsIgnoreCase(name)) {
			return last_wms_flg();
		}
		if ($wms_tgt_flg.equalsIgnoreCase(name)) {
			return wms_tgt_flg();
		}
		if ($not_lot_mix_flg.equalsIgnoreCase(name)) {
			return not_lot_mix_flg();
		}
		if ($not_sublot_mix_flg.equalsIgnoreCase(name)) {
			return not_sublot_mix_flg();
		}
		if ($no_alloc_flg.equalsIgnoreCase(name)) {
			return no_alloc_flg();
		}
		if ($copy_flg.equalsIgnoreCase(name)) {
			return copy_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($pr_sts_typ.equalsIgnoreCase(name)) {
			pr_sts_typ(value);
			return;
		}
		if ($pr_sts_typ_nm.equalsIgnoreCase(name)) {
			pr_sts_typ_nm(value);
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
		if ($asset_mng_typ.equalsIgnoreCase(name)) {
			asset_mng_typ(value);
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
		if ($pckg_unit_cd.equalsIgnoreCase(name)) {
			pckg_unit_cd(value);
			return;
		}
		if ($pckg_unit_nm.equalsIgnoreCase(name)) {
			pckg_unit_nm(value);
			return;
		}
		if ($schd_unit_cd.equalsIgnoreCase(name)) {
			schd_unit_cd(value);
			return;
		}
		if ($schd_unit_nm.equalsIgnoreCase(name)) {
			schd_unit_nm(value);
			return;
		}
		if ($cont_fctr_rnd_typ.equalsIgnoreCase(name)) {
			cont_fctr_rnd_typ(value);
			return;
		}
		if ($gi_loc_cd.equalsIgnoreCase(name)) {
			gi_loc_cd(value);
			return;
		}
		if ($gi_loc_nm.equalsIgnoreCase(name)) {
			gi_loc_nm(value);
			return;
		}
		if ($gi_site_cd.equalsIgnoreCase(name)) {
			gi_site_cd(value);
			return;
		}
		if ($gi_sppl_cd.equalsIgnoreCase(name)) {
			gi_sppl_cd(value);
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
		if ($stk_id_typ.equalsIgnoreCase(name)) {
			stk_id_typ(value);
			return;
		}
		if ($stk_id_typ_nm.equalsIgnoreCase(name)) {
			stk_id_typ_nm(value);
			return;
		}
		if ($gi_stk_arrv_bp_cd.equalsIgnoreCase(name)) {
			gi_stk_arrv_bp_cd(value);
			return;
		}
		if ($gi_stk_arrv_bp_nm.equalsIgnoreCase(name)) {
			gi_stk_arrv_bp_nm(value);
			return;
		}
		if ($rsn_cd.equalsIgnoreCase(name)) {
			rsn_cd(value);
			return;
		}
		if ($rsn_nm.equalsIgnoreCase(name)) {
			rsn_nm(value);
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
		if ($prov_typ.equalsIgnoreCase(name)) {
			prov_typ(value);
			return;
		}
		if ($prov_typ_nm.equalsIgnoreCase(name)) {
			prov_typ_nm(value);
			return;
		}
		if ($prov_basis_typ.equalsIgnoreCase(name)) {
			prov_basis_typ(value);
			return;
		}
		if ($prov_basis_typ_nm.equalsIgnoreCase(name)) {
			prov_basis_typ_nm(value);
			return;
		}
		if ($ret_prov_typ.equalsIgnoreCase(name)) {
			ret_prov_typ(value);
			return;
		}
		if ($ret_prov_typ_nm.equalsIgnoreCase(name)) {
			ret_prov_typ_nm(value);
			return;
		}
		if ($ret_prov_basis_typ.equalsIgnoreCase(name)) {
			ret_prov_basis_typ(value);
			return;
		}
		if ($ret_prov_basis_typ_nm.equalsIgnoreCase(name)) {
			ret_prov_basis_typ_nm(value);
			return;
		}
		if ($base_dlv_slip_no.equalsIgnoreCase(name)) {
			base_dlv_slip_no(value);
			return;
		}
		if ($base_prov_act_no.equalsIgnoreCase(name)) {
			base_prov_act_no(value);
			return;
		}
		if ($trd_d_rmrks.equalsIgnoreCase(name)) {
			trd_d_rmrks(value);
			return;
		}
		if ($inst_d_rmrks.equalsIgnoreCase(name)) {
			inst_d_rmrks(value);
			return;
		}
		if ($intr_d_rmrks.equalsIgnoreCase(name)) {
			intr_d_rmrks(value);
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
		if ($xfr_src_typ.equalsIgnoreCase(name)) {
			xfr_src_typ(value);
			return;
		}
		if ($xfr_src_typ_nm.equalsIgnoreCase(name)) {
			xfr_src_typ_nm(value);
			return;
		}
		if ($xfr_src_no.equalsIgnoreCase(name)) {
			xfr_src_no(value);
			return;
		}
		if ($xfr_schd_no.equalsIgnoreCase(name)) {
			xfr_schd_no(value);
			return;
		}
		if ($xfr_alloc_sts_no.equalsIgnoreCase(name)) {
			xfr_alloc_sts_no(value);
			return;
		}
		if ($old_xfr_alloc_sts_no.equalsIgnoreCase(name)) {
			old_xfr_alloc_sts_no(value);
			return;
		}
		if ($xfr_inst_d_no.equalsIgnoreCase(name)) {
			xfr_inst_d_no(value);
			return;
		}
		if ($dlv_slip_no.equalsIgnoreCase(name)) {
			dlv_slip_no(value);
			return;
		}
		if ($dlv_slip_d_no.equalsIgnoreCase(name)) {
			dlv_slip_d_no(value);
			return;
		}
		if ($prov_schd_no.equalsIgnoreCase(name)) {
			prov_schd_no(value);
			return;
		}
		if ($ret_prov_schd_no.equalsIgnoreCase(name)) {
			ret_prov_schd_no(value);
			return;
		}
		if ($io_schd_pr_no.equalsIgnoreCase(name)) {
			io_schd_pr_no(value);
			return;
		}
		if ($stk_info_loc_typ.equalsIgnoreCase(name)) {
			stk_info_loc_typ(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
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
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			trd_unit_dec_place(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($pckg_unit_conv_base_qty.equalsIgnoreCase(name)) {
			pckg_unit_conv_base_qty(value);
			return;
		}
		if ($pckg_unit_conv_qty.equalsIgnoreCase(name)) {
			pckg_unit_conv_qty(value);
			return;
		}
		if ($pckg_unit_dec_place.equalsIgnoreCase(name)) {
			pckg_unit_dec_place(value);
			return;
		}
		if ($schd_unit_dec_place.equalsIgnoreCase(name)) {
			schd_unit_dec_place(value);
			return;
		}
		if ($cont_fctr_dec_place.equalsIgnoreCase(name)) {
			cont_fctr_dec_place(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($alloc_sts_upd_cntr.equalsIgnoreCase(name)) {
			alloc_sts_upd_cntr(value);
			return;
		}
		if ($inst_bndl_peg_no.equalsIgnoreCase(name)) {
			inst_bndl_peg_no(value);
			return;
		}
		if ($inst_bndl_to_peg_no.equalsIgnoreCase(name)) {
			inst_bndl_to_peg_no(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
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
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			trd_unit_dec_place(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($pckg_unit_conv_base_qty.equalsIgnoreCase(name)) {
			pckg_unit_conv_base_qty(value);
			return;
		}
		if ($pckg_unit_conv_qty.equalsIgnoreCase(name)) {
			pckg_unit_conv_qty(value);
			return;
		}
		if ($pckg_unit_dec_place.equalsIgnoreCase(name)) {
			pckg_unit_dec_place(value);
			return;
		}
		if ($schd_unit_dec_place.equalsIgnoreCase(name)) {
			schd_unit_dec_place(value);
			return;
		}
		if ($cont_fctr_dec_place.equalsIgnoreCase(name)) {
			cont_fctr_dec_place(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($alloc_sts_upd_cntr.equalsIgnoreCase(name)) {
			alloc_sts_upd_cntr(value);
			return;
		}
		if ($inst_bndl_peg_no.equalsIgnoreCase(name)) {
			inst_bndl_peg_no(value);
			return;
		}
		if ($inst_bndl_to_peg_no.equalsIgnoreCase(name)) {
			inst_bndl_to_peg_no(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
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
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			trd_unit_dec_place(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($pckg_unit_conv_base_qty.equalsIgnoreCase(name)) {
			pckg_unit_conv_base_qty(value);
			return;
		}
		if ($pckg_unit_conv_qty.equalsIgnoreCase(name)) {
			pckg_unit_conv_qty(value);
			return;
		}
		if ($pckg_unit_dec_place.equalsIgnoreCase(name)) {
			pckg_unit_dec_place(value);
			return;
		}
		if ($schd_unit_dec_place.equalsIgnoreCase(name)) {
			schd_unit_dec_place(value);
			return;
		}
		if ($cont_fctr_dec_place.equalsIgnoreCase(name)) {
			cont_fctr_dec_place(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($alloc_sts_upd_cntr.equalsIgnoreCase(name)) {
			alloc_sts_upd_cntr(value);
			return;
		}
		if ($inst_bndl_peg_no.equalsIgnoreCase(name)) {
			inst_bndl_peg_no(value);
			return;
		}
		if ($inst_bndl_to_peg_no.equalsIgnoreCase(name)) {
			inst_bndl_to_peg_no(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
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
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			trd_unit_dec_place(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($pckg_unit_conv_base_qty.equalsIgnoreCase(name)) {
			pckg_unit_conv_base_qty(value);
			return;
		}
		if ($pckg_unit_conv_qty.equalsIgnoreCase(name)) {
			pckg_unit_conv_qty(value);
			return;
		}
		if ($pckg_unit_dec_place.equalsIgnoreCase(name)) {
			pckg_unit_dec_place(value);
			return;
		}
		if ($schd_unit_dec_place.equalsIgnoreCase(name)) {
			schd_unit_dec_place(value);
			return;
		}
		if ($cont_fctr_dec_place.equalsIgnoreCase(name)) {
			cont_fctr_dec_place(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($alloc_sts_upd_cntr.equalsIgnoreCase(name)) {
			alloc_sts_upd_cntr(value);
			return;
		}
		if ($inst_bndl_peg_no.equalsIgnoreCase(name)) {
			inst_bndl_peg_no(value);
			return;
		}
		if ($inst_bndl_to_peg_no.equalsIgnoreCase(name)) {
			inst_bndl_to_peg_no(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
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
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			trd_unit_dec_place(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($pckg_unit_conv_base_qty.equalsIgnoreCase(name)) {
			pckg_unit_conv_base_qty(value);
			return;
		}
		if ($pckg_unit_conv_qty.equalsIgnoreCase(name)) {
			pckg_unit_conv_qty(value);
			return;
		}
		if ($pckg_unit_dec_place.equalsIgnoreCase(name)) {
			pckg_unit_dec_place(value);
			return;
		}
		if ($schd_unit_dec_place.equalsIgnoreCase(name)) {
			schd_unit_dec_place(value);
			return;
		}
		if ($cont_fctr_dec_place.equalsIgnoreCase(name)) {
			cont_fctr_dec_place(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($alloc_sts_upd_cntr.equalsIgnoreCase(name)) {
			alloc_sts_upd_cntr(value);
			return;
		}
		if ($inst_bndl_peg_no.equalsIgnoreCase(name)) {
			inst_bndl_peg_no(value);
			return;
		}
		if ($inst_bndl_to_peg_no.equalsIgnoreCase(name)) {
			inst_bndl_to_peg_no(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($base_ac_dt.equalsIgnoreCase(name)) {
			base_ac_dt(value);
			return;
		}
		if ($vld_dt_fr.equalsIgnoreCase(name)) {
			vld_dt_fr(value);
			return;
		}
		super.setDate(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($check.equalsIgnoreCase(name)) {
			check(value);
			return;
		}
		if ($alloc_flg.equalsIgnoreCase(name)) {
			alloc_flg(value);
			return;
		}
		if ($lot_none_flg.equalsIgnoreCase(name)) {
			lot_none_flg(value);
			return;
		}
		if ($def_ver_flg.equalsIgnoreCase(name)) {
			def_ver_flg(value);
			return;
		}
		if ($schd_abort_flg.equalsIgnoreCase(name)) {
			schd_abort_flg(value);
			return;
		}
		if ($inst_abort_flg.equalsIgnoreCase(name)) {
			inst_abort_flg(value);
			return;
		}
		if ($ttl_flg.equalsIgnoreCase(name)) {
			ttl_flg(value);
			return;
		}
		if ($inst_bndl_flg.equalsIgnoreCase(name)) {
			inst_bndl_flg(value);
			return;
		}
		if ($inst_bndl_src_flg.equalsIgnoreCase(name)) {
			inst_bndl_src_flg(value);
			return;
		}
		if ($cont_fctr_flg.equalsIgnoreCase(name)) {
			cont_fctr_flg(value);
			return;
		}
		if ($gi_str_ln_tgt_flg.equalsIgnoreCase(name)) {
			gi_str_ln_tgt_flg(value);
			return;
		}
		if ($acxfr_gi_flg.equalsIgnoreCase(name)) {
			acxfr_gi_flg(value);
			return;
		}
		if ($skip_chk_ship_flg.equalsIgnoreCase(name)) {
			skip_chk_ship_flg(value);
			return;
		}
		if ($wms_flg.equalsIgnoreCase(name)) {
			wms_flg(value);
			return;
		}
		if ($last_wms_flg.equalsIgnoreCase(name)) {
			last_wms_flg(value);
			return;
		}
		if ($wms_tgt_flg.equalsIgnoreCase(name)) {
			wms_tgt_flg(value);
			return;
		}
		if ($not_lot_mix_flg.equalsIgnoreCase(name)) {
			not_lot_mix_flg(value);
			return;
		}
		if ($not_sublot_mix_flg.equalsIgnoreCase(name)) {
			not_sublot_mix_flg(value);
			return;
		}
		if ($no_alloc_flg.equalsIgnoreCase(name)) {
			no_alloc_flg(value);
			return;
		}
		if ($copy_flg.equalsIgnoreCase(name)) {
			copy_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($pr_sts_typ.equalsIgnoreCase(name)) {
			pr_sts_typ(value);
			return;
		}
		if ($pr_sts_typ_nm.equalsIgnoreCase(name)) {
			pr_sts_typ_nm(value);
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
		if ($asset_mng_typ.equalsIgnoreCase(name)) {
			asset_mng_typ(value);
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
		if ($pckg_unit_cd.equalsIgnoreCase(name)) {
			pckg_unit_cd(value);
			return;
		}
		if ($pckg_unit_nm.equalsIgnoreCase(name)) {
			pckg_unit_nm(value);
			return;
		}
		if ($schd_unit_cd.equalsIgnoreCase(name)) {
			schd_unit_cd(value);
			return;
		}
		if ($schd_unit_nm.equalsIgnoreCase(name)) {
			schd_unit_nm(value);
			return;
		}
		if ($cont_fctr_rnd_typ.equalsIgnoreCase(name)) {
			cont_fctr_rnd_typ(value);
			return;
		}
		if ($gi_loc_cd.equalsIgnoreCase(name)) {
			gi_loc_cd(value);
			return;
		}
		if ($gi_loc_nm.equalsIgnoreCase(name)) {
			gi_loc_nm(value);
			return;
		}
		if ($gi_site_cd.equalsIgnoreCase(name)) {
			gi_site_cd(value);
			return;
		}
		if ($gi_sppl_cd.equalsIgnoreCase(name)) {
			gi_sppl_cd(value);
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
		if ($stk_id_typ.equalsIgnoreCase(name)) {
			stk_id_typ(value);
			return;
		}
		if ($stk_id_typ_nm.equalsIgnoreCase(name)) {
			stk_id_typ_nm(value);
			return;
		}
		if ($gi_stk_arrv_bp_cd.equalsIgnoreCase(name)) {
			gi_stk_arrv_bp_cd(value);
			return;
		}
		if ($gi_stk_arrv_bp_nm.equalsIgnoreCase(name)) {
			gi_stk_arrv_bp_nm(value);
			return;
		}
		if ($rsn_cd.equalsIgnoreCase(name)) {
			rsn_cd(value);
			return;
		}
		if ($rsn_nm.equalsIgnoreCase(name)) {
			rsn_nm(value);
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
		if ($prov_typ.equalsIgnoreCase(name)) {
			prov_typ(value);
			return;
		}
		if ($prov_typ_nm.equalsIgnoreCase(name)) {
			prov_typ_nm(value);
			return;
		}
		if ($prov_basis_typ.equalsIgnoreCase(name)) {
			prov_basis_typ(value);
			return;
		}
		if ($prov_basis_typ_nm.equalsIgnoreCase(name)) {
			prov_basis_typ_nm(value);
			return;
		}
		if ($ret_prov_typ.equalsIgnoreCase(name)) {
			ret_prov_typ(value);
			return;
		}
		if ($ret_prov_typ_nm.equalsIgnoreCase(name)) {
			ret_prov_typ_nm(value);
			return;
		}
		if ($ret_prov_basis_typ.equalsIgnoreCase(name)) {
			ret_prov_basis_typ(value);
			return;
		}
		if ($ret_prov_basis_typ_nm.equalsIgnoreCase(name)) {
			ret_prov_basis_typ_nm(value);
			return;
		}
		if ($base_dlv_slip_no.equalsIgnoreCase(name)) {
			base_dlv_slip_no(value);
			return;
		}
		if ($base_prov_act_no.equalsIgnoreCase(name)) {
			base_prov_act_no(value);
			return;
		}
		if ($trd_d_rmrks.equalsIgnoreCase(name)) {
			trd_d_rmrks(value);
			return;
		}
		if ($inst_d_rmrks.equalsIgnoreCase(name)) {
			inst_d_rmrks(value);
			return;
		}
		if ($intr_d_rmrks.equalsIgnoreCase(name)) {
			intr_d_rmrks(value);
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
		if ($xfr_src_typ.equalsIgnoreCase(name)) {
			xfr_src_typ(value);
			return;
		}
		if ($xfr_src_typ_nm.equalsIgnoreCase(name)) {
			xfr_src_typ_nm(value);
			return;
		}
		if ($xfr_src_no.equalsIgnoreCase(name)) {
			xfr_src_no(value);
			return;
		}
		if ($xfr_schd_no.equalsIgnoreCase(name)) {
			xfr_schd_no(value);
			return;
		}
		if ($xfr_alloc_sts_no.equalsIgnoreCase(name)) {
			xfr_alloc_sts_no(value);
			return;
		}
		if ($old_xfr_alloc_sts_no.equalsIgnoreCase(name)) {
			old_xfr_alloc_sts_no(value);
			return;
		}
		if ($xfr_inst_d_no.equalsIgnoreCase(name)) {
			xfr_inst_d_no(value);
			return;
		}
		if ($dlv_slip_no.equalsIgnoreCase(name)) {
			dlv_slip_no(value);
			return;
		}
		if ($dlv_slip_d_no.equalsIgnoreCase(name)) {
			dlv_slip_d_no(value);
			return;
		}
		if ($prov_schd_no.equalsIgnoreCase(name)) {
			prov_schd_no(value);
			return;
		}
		if ($ret_prov_schd_no.equalsIgnoreCase(name)) {
			ret_prov_schd_no(value);
			return;
		}
		if ($io_schd_pr_no.equalsIgnoreCase(name)) {
			io_schd_pr_no(value);
			return;
		}
		if ($stk_info_loc_typ.equalsIgnoreCase(name)) {
			stk_info_loc_typ(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
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
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			trd_unit_dec_place(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($pckg_unit_conv_base_qty.equalsIgnoreCase(name)) {
			pckg_unit_conv_base_qty(value);
			return;
		}
		if ($pckg_unit_conv_qty.equalsIgnoreCase(name)) {
			pckg_unit_conv_qty(value);
			return;
		}
		if ($pckg_unit_dec_place.equalsIgnoreCase(name)) {
			pckg_unit_dec_place(value);
			return;
		}
		if ($schd_unit_dec_place.equalsIgnoreCase(name)) {
			schd_unit_dec_place(value);
			return;
		}
		if ($cont_fctr_dec_place.equalsIgnoreCase(name)) {
			cont_fctr_dec_place(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($alloc_sts_upd_cntr.equalsIgnoreCase(name)) {
			alloc_sts_upd_cntr(value);
			return;
		}
		if ($inst_bndl_peg_no.equalsIgnoreCase(name)) {
			inst_bndl_peg_no(value);
			return;
		}
		if ($inst_bndl_to_peg_no.equalsIgnoreCase(name)) {
			inst_bndl_to_peg_no(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
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
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			trd_unit_dec_place(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($pckg_unit_conv_base_qty.equalsIgnoreCase(name)) {
			pckg_unit_conv_base_qty(value);
			return;
		}
		if ($pckg_unit_conv_qty.equalsIgnoreCase(name)) {
			pckg_unit_conv_qty(value);
			return;
		}
		if ($pckg_unit_dec_place.equalsIgnoreCase(name)) {
			pckg_unit_dec_place(value);
			return;
		}
		if ($schd_unit_dec_place.equalsIgnoreCase(name)) {
			schd_unit_dec_place(value);
			return;
		}
		if ($cont_fctr_dec_place.equalsIgnoreCase(name)) {
			cont_fctr_dec_place(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($alloc_sts_upd_cntr.equalsIgnoreCase(name)) {
			alloc_sts_upd_cntr(value);
			return;
		}
		if ($inst_bndl_peg_no.equalsIgnoreCase(name)) {
			inst_bndl_peg_no(value);
			return;
		}
		if ($inst_bndl_to_peg_no.equalsIgnoreCase(name)) {
			inst_bndl_to_peg_no(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
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
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			trd_unit_dec_place(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($pckg_unit_conv_base_qty.equalsIgnoreCase(name)) {
			pckg_unit_conv_base_qty(value);
			return;
		}
		if ($pckg_unit_conv_qty.equalsIgnoreCase(name)) {
			pckg_unit_conv_qty(value);
			return;
		}
		if ($pckg_unit_dec_place.equalsIgnoreCase(name)) {
			pckg_unit_dec_place(value);
			return;
		}
		if ($schd_unit_dec_place.equalsIgnoreCase(name)) {
			schd_unit_dec_place(value);
			return;
		}
		if ($cont_fctr_dec_place.equalsIgnoreCase(name)) {
			cont_fctr_dec_place(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($alloc_sts_upd_cntr.equalsIgnoreCase(name)) {
			alloc_sts_upd_cntr(value);
			return;
		}
		if ($inst_bndl_peg_no.equalsIgnoreCase(name)) {
			inst_bndl_peg_no(value);
			return;
		}
		if ($inst_bndl_to_peg_no.equalsIgnoreCase(name)) {
			inst_bndl_to_peg_no(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
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
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			trd_unit_dec_place(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($pckg_unit_conv_base_qty.equalsIgnoreCase(name)) {
			pckg_unit_conv_base_qty(value);
			return;
		}
		if ($pckg_unit_conv_qty.equalsIgnoreCase(name)) {
			pckg_unit_conv_qty(value);
			return;
		}
		if ($pckg_unit_dec_place.equalsIgnoreCase(name)) {
			pckg_unit_dec_place(value);
			return;
		}
		if ($schd_unit_dec_place.equalsIgnoreCase(name)) {
			schd_unit_dec_place(value);
			return;
		}
		if ($cont_fctr_dec_place.equalsIgnoreCase(name)) {
			cont_fctr_dec_place(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($alloc_sts_upd_cntr.equalsIgnoreCase(name)) {
			alloc_sts_upd_cntr(value);
			return;
		}
		if ($inst_bndl_peg_no.equalsIgnoreCase(name)) {
			inst_bndl_peg_no(value);
			return;
		}
		if ($inst_bndl_to_peg_no.equalsIgnoreCase(name)) {
			inst_bndl_to_peg_no(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
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
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			trd_unit_dec_place(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($pckg_unit_conv_base_qty.equalsIgnoreCase(name)) {
			pckg_unit_conv_base_qty(value);
			return;
		}
		if ($pckg_unit_conv_qty.equalsIgnoreCase(name)) {
			pckg_unit_conv_qty(value);
			return;
		}
		if ($pckg_unit_dec_place.equalsIgnoreCase(name)) {
			pckg_unit_dec_place(value);
			return;
		}
		if ($schd_unit_dec_place.equalsIgnoreCase(name)) {
			schd_unit_dec_place(value);
			return;
		}
		if ($cont_fctr_dec_place.equalsIgnoreCase(name)) {
			cont_fctr_dec_place(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($alloc_sts_upd_cntr.equalsIgnoreCase(name)) {
			alloc_sts_upd_cntr(value);
			return;
		}
		if ($inst_bndl_peg_no.equalsIgnoreCase(name)) {
			inst_bndl_peg_no(value);
			return;
		}
		if ($inst_bndl_to_peg_no.equalsIgnoreCase(name)) {
			inst_bndl_to_peg_no(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($base_ac_dt.equalsIgnoreCase(name)) {
			base_ac_dt(value);
			return;
		}
		if ($vld_dt_fr.equalsIgnoreCase(name)) {
			vld_dt_fr(value);
			return;
		}
		super.setDateNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($check.equalsIgnoreCase(name)) {
			check(value);
			return;
		}
		if ($alloc_flg.equalsIgnoreCase(name)) {
			alloc_flg(value);
			return;
		}
		if ($lot_none_flg.equalsIgnoreCase(name)) {
			lot_none_flg(value);
			return;
		}
		if ($def_ver_flg.equalsIgnoreCase(name)) {
			def_ver_flg(value);
			return;
		}
		if ($schd_abort_flg.equalsIgnoreCase(name)) {
			schd_abort_flg(value);
			return;
		}
		if ($inst_abort_flg.equalsIgnoreCase(name)) {
			inst_abort_flg(value);
			return;
		}
		if ($ttl_flg.equalsIgnoreCase(name)) {
			ttl_flg(value);
			return;
		}
		if ($inst_bndl_flg.equalsIgnoreCase(name)) {
			inst_bndl_flg(value);
			return;
		}
		if ($inst_bndl_src_flg.equalsIgnoreCase(name)) {
			inst_bndl_src_flg(value);
			return;
		}
		if ($cont_fctr_flg.equalsIgnoreCase(name)) {
			cont_fctr_flg(value);
			return;
		}
		if ($gi_str_ln_tgt_flg.equalsIgnoreCase(name)) {
			gi_str_ln_tgt_flg(value);
			return;
		}
		if ($acxfr_gi_flg.equalsIgnoreCase(name)) {
			acxfr_gi_flg(value);
			return;
		}
		if ($skip_chk_ship_flg.equalsIgnoreCase(name)) {
			skip_chk_ship_flg(value);
			return;
		}
		if ($wms_flg.equalsIgnoreCase(name)) {
			wms_flg(value);
			return;
		}
		if ($last_wms_flg.equalsIgnoreCase(name)) {
			last_wms_flg(value);
			return;
		}
		if ($wms_tgt_flg.equalsIgnoreCase(name)) {
			wms_tgt_flg(value);
			return;
		}
		if ($not_lot_mix_flg.equalsIgnoreCase(name)) {
			not_lot_mix_flg(value);
			return;
		}
		if ($not_sublot_mix_flg.equalsIgnoreCase(name)) {
			not_sublot_mix_flg(value);
			return;
		}
		if ($no_alloc_flg.equalsIgnoreCase(name)) {
			no_alloc_flg(value);
			return;
		}
		if ($copy_flg.equalsIgnoreCase(name)) {
			copy_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}

	public MCRow getInnerRow(String name) {
		if ($itm_p.equalsIgnoreCase(name)) {
			return itm_p();
		}
		if ($lot_no_p.equalsIgnoreCase(name)) {
			return lot_no_p();
		}
		if ($ver_no_p.equalsIgnoreCase(name)) {
			return ver_no_p();
		}
		if ($trd_unit_qty_p.equalsIgnoreCase(name)) {
			return trd_unit_qty_p();
		}
		if ($base_unit_qty_p.equalsIgnoreCase(name)) {
			return base_unit_qty_p();
		}
		if ($base_unit_act_qty_p.equalsIgnoreCase(name)) {
			return base_unit_act_qty_p();
		}
		if ($pckg_unit_qty_p.equalsIgnoreCase(name)) {
			return pckg_unit_qty_p();
		}
		if ($schd_qty_p.equalsIgnoreCase(name)) {
			return schd_qty_p();
		}
		if ($cont_fctr_unit_p.equalsIgnoreCase(name)) {
			return cont_fctr_unit_p();
		}
		if ($act_cont_fctr_p.equalsIgnoreCase(name)) {
			return act_cont_fctr_p();
		}
		if ($act_cont_qty_p.equalsIgnoreCase(name)) {
			return act_cont_qty_p();
		}
		if ($std_cont_fctr_p.equalsIgnoreCase(name)) {
			return std_cont_fctr_p();
		}
		if ($std_cont_qty_p.equalsIgnoreCase(name)) {
			return std_cont_qty_p();
		}
		if ($gi_str_ln_p.equalsIgnoreCase(name)) {
			return gi_str_ln_p();
		}
		if ($gr_str_ln_p.equalsIgnoreCase(name)) {
			return gr_str_ln_p();
		}
		if ($sno_wrk_no_p.equalsIgnoreCase(name)) {
			return sno_wrk_no_p();
		}
		if ($alloc_sno_wrk_no_p.equalsIgnoreCase(name)) {
			return alloc_sno_wrk_no_p();
		}
		if ($stk_bp_p.equalsIgnoreCase(name)) {
			return stk_bp_p();
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
		if ($base_unit_act_qty_p.equalsIgnoreCase(name)) {
			base_unit_act_qty_p(
				((MCContainerMeta) base_unit_act_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($pckg_unit_qty_p.equalsIgnoreCase(name)) {
			pckg_unit_qty_p(
				((MCContainerMeta) pckg_unit_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($schd_qty_p.equalsIgnoreCase(name)) {
			schd_qty_p(
				((MCContainerMeta) schd_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($cont_fctr_unit_p.equalsIgnoreCase(name)) {
			cont_fctr_unit_p(
				((MCContainerMeta) cont_fctr_unit_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5270.ContFctrUnitR.class, value)
			);
			return;
		}
		if ($act_cont_fctr_p.equalsIgnoreCase(name)) {
			act_cont_fctr_p(
				((MCContainerMeta) act_cont_fctr_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5290.ActContFctrR.class, value)
			);
			return;
		}
		if ($act_cont_qty_p.equalsIgnoreCase(name)) {
			act_cont_qty_p(
				((MCContainerMeta) act_cont_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5260.ContQtyR.class, value)
			);
			return;
		}
		if ($std_cont_fctr_p.equalsIgnoreCase(name)) {
			std_cont_fctr_p(
				((MCContainerMeta) std_cont_fctr_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5280.StdContFctrR.class, value)
			);
			return;
		}
		if ($std_cont_qty_p.equalsIgnoreCase(name)) {
			std_cont_qty_p(
				((MCContainerMeta) std_cont_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5260.ContQtyR.class, value)
			);
			return;
		}
		if ($gi_str_ln_p.equalsIgnoreCase(name)) {
			gi_str_ln_p(
				((MCContainerMeta) gi_str_ln_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5120.StrLnR.class, value)
			);
			return;
		}
		if ($gr_str_ln_p.equalsIgnoreCase(name)) {
			gr_str_ln_p(
				((MCContainerMeta) gr_str_ln_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5120.StrLnR.class, value)
			);
			return;
		}
		if ($sno_wrk_no_p.equalsIgnoreCase(name)) {
			sno_wrk_no_p(
				((MCContainerMeta) sno_wrk_no_p_META).castInnerRow(mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.class, value)
			);
			return;
		}
		if ($alloc_sno_wrk_no_p.equalsIgnoreCase(name)) {
			alloc_sno_wrk_no_p(
				((MCContainerMeta) alloc_sno_wrk_no_p_META).castInnerRow(mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.class, value)
			);
			return;
		}
		if ($stk_bp_p.equalsIgnoreCase(name)) {
			stk_bp_p(
				((MCContainerMeta) stk_bp_p_META).castInnerRow(mcframe.clientMSUB.MSUBP5050.StkBpR.class, value)
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
	 * Base unit result qty. 基準単位実績数量.<p>
	 *
	 */
	public MCNumber base_unit_act_qty() {
		return base_unit_act_qty_p().qty();
	}

	/**
	 * Base unit result qty. 基準単位実績数量.<p>
	 *
	 */
	public void base_unit_act_qty(MCNumber value) {
		base_unit_act_qty_p().qty(value);
	}

	/**
	 * Base unit result qty. 基準単位実績数量.<p>
	 *
	 */
	public void base_unit_act_qty(int value) {
		base_unit_act_qty_p().qty(value);
	}

	/**
	 * Base unit result qty. 基準単位実績数量.<p>
	 *
	 */
	public void base_unit_act_qty(long value) {
		base_unit_act_qty_p().qty(value);
	}

	/**
	 * Base unit result qty. 基準単位実績数量.<p>
	 *
	 */
	public void base_unit_act_qty(float value) {
		base_unit_act_qty_p().qty(value);
	}

	/**
	 * Base unit result qty. 基準単位実績数量.<p>
	 *
	 */
	public void base_unit_act_qty(double value) {
		base_unit_act_qty_p().qty(value);
	}

	/**
	 * Packing unit qty. 梱包単位数量.<p>
	 *
	 */
	public MCNumber pckg_unit_qty() {
		return pckg_unit_qty_p().qty();
	}

	/**
	 * Packing unit qty. 梱包単位数量.<p>
	 *
	 */
	public void pckg_unit_qty(MCNumber value) {
		pckg_unit_qty_p().qty(value);
	}

	/**
	 * Packing unit qty. 梱包単位数量.<p>
	 *
	 */
	public void pckg_unit_qty(int value) {
		pckg_unit_qty_p().qty(value);
	}

	/**
	 * Packing unit qty. 梱包単位数量.<p>
	 *
	 */
	public void pckg_unit_qty(long value) {
		pckg_unit_qty_p().qty(value);
	}

	/**
	 * Packing unit qty. 梱包単位数量.<p>
	 *
	 */
	public void pckg_unit_qty(float value) {
		pckg_unit_qty_p().qty(value);
	}

	/**
	 * Packing unit qty. 梱包単位数量.<p>
	 *
	 */
	public void pckg_unit_qty(double value) {
		pckg_unit_qty_p().qty(value);
	}

	/**
	 * Scheduled qty. 予定数量.<p>
	 *
	 */
	public MCNumber schd_qty() {
		return schd_qty_p().qty();
	}

	/**
	 * Scheduled qty. 予定数量.<p>
	 *
	 */
	public void schd_qty(MCNumber value) {
		schd_qty_p().qty(value);
	}

	/**
	 * Scheduled qty. 予定数量.<p>
	 *
	 */
	public void schd_qty(int value) {
		schd_qty_p().qty(value);
	}

	/**
	 * Scheduled qty. 予定数量.<p>
	 *
	 */
	public void schd_qty(long value) {
		schd_qty_p().qty(value);
	}

	/**
	 * Scheduled qty. 予定数量.<p>
	 *
	 */
	public void schd_qty(float value) {
		schd_qty_p().qty(value);
	}

	/**
	 * Scheduled qty. 予定数量.<p>
	 *
	 */
	public void schd_qty(double value) {
		schd_qty_p().qty(value);
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

	/**
	 * Actual active ingredient coefficient 実際有効成分係数.<p>
	 *
	 */
	public MCNumber act_cont_fctr() {
		return act_cont_fctr_p().act_cont_fctr();
	}

	/**
	 * Actual active ingredient coefficient 実際有効成分係数.<p>
	 *
	 */
	public void act_cont_fctr(MCNumber value) {
		act_cont_fctr_p().act_cont_fctr(value);
	}

	/**
	 * Actual active ingredient coefficient 実際有効成分係数.<p>
	 *
	 */
	public void act_cont_fctr(int value) {
		act_cont_fctr_p().act_cont_fctr(value);
	}

	/**
	 * Actual active ingredient coefficient 実際有効成分係数.<p>
	 *
	 */
	public void act_cont_fctr(long value) {
		act_cont_fctr_p().act_cont_fctr(value);
	}

	/**
	 * Actual active ingredient coefficient 実際有効成分係数.<p>
	 *
	 */
	public void act_cont_fctr(float value) {
		act_cont_fctr_p().act_cont_fctr(value);
	}

	/**
	 * Actual active ingredient coefficient 実際有効成分係数.<p>
	 *
	 */
	public void act_cont_fctr(double value) {
		act_cont_fctr_p().act_cont_fctr(value);
	}

	/**
	 * Actual active ingredient 実際有効成分.<p>
	 *
	 */
	public MCNumber act_cont_qty() {
		return act_cont_qty_p().cont_qty();
	}

	/**
	 * Actual active ingredient 実際有効成分.<p>
	 *
	 */
	public void act_cont_qty(MCNumber value) {
		act_cont_qty_p().cont_qty(value);
	}

	/**
	 * Actual active ingredient 実際有効成分.<p>
	 *
	 */
	public void act_cont_qty(int value) {
		act_cont_qty_p().cont_qty(value);
	}

	/**
	 * Actual active ingredient 実際有効成分.<p>
	 *
	 */
	public void act_cont_qty(long value) {
		act_cont_qty_p().cont_qty(value);
	}

	/**
	 * Actual active ingredient 実際有効成分.<p>
	 *
	 */
	public void act_cont_qty(float value) {
		act_cont_qty_p().cont_qty(value);
	}

	/**
	 * Actual active ingredient 実際有効成分.<p>
	 *
	 */
	public void act_cont_qty(double value) {
		act_cont_qty_p().cont_qty(value);
	}

	/**
	 * Standard active ingredient coefficient 標準有効成分係数.<p>
	 *
	 */
	public MCNumber std_cont_fctr() {
		return std_cont_fctr_p().std_cont_fctr();
	}

	/**
	 * Standard active ingredient coefficient 標準有効成分係数.<p>
	 *
	 */
	public void std_cont_fctr(MCNumber value) {
		std_cont_fctr_p().std_cont_fctr(value);
	}

	/**
	 * Standard active ingredient coefficient 標準有効成分係数.<p>
	 *
	 */
	public void std_cont_fctr(int value) {
		std_cont_fctr_p().std_cont_fctr(value);
	}

	/**
	 * Standard active ingredient coefficient 標準有効成分係数.<p>
	 *
	 */
	public void std_cont_fctr(long value) {
		std_cont_fctr_p().std_cont_fctr(value);
	}

	/**
	 * Standard active ingredient coefficient 標準有効成分係数.<p>
	 *
	 */
	public void std_cont_fctr(float value) {
		std_cont_fctr_p().std_cont_fctr(value);
	}

	/**
	 * Standard active ingredient coefficient 標準有効成分係数.<p>
	 *
	 */
	public void std_cont_fctr(double value) {
		std_cont_fctr_p().std_cont_fctr(value);
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
	 * GI rack/line cd. 出庫棚・ラインＣＤ.<p>
	 *
	 */
	public String gi_str_ln_cd() {
		return gi_str_ln_p().str_ln_cd();
	}

	/**
	 * GI rack/line cd. 出庫棚・ラインＣＤ.<p>
	 *
	 */
	public void gi_str_ln_cd(String value) {
		gi_str_ln_p().str_ln_cd(value);
	}

	/**
	 * GI rack/line name 出庫棚・ライン名.<p>
	 *
	 */
	public String gi_str_ln_nm() {
		return gi_str_ln_p().str_ln_nm();
	}

	/**
	 * GI rack/line name 出庫棚・ライン名.<p>
	 *
	 */
	public void gi_str_ln_nm(String value) {
		gi_str_ln_p().str_ln_nm(value);
	}

	public boolean gi_str_ln_cd_none_flg() {
		return gi_str_ln_p().str_ln_cd_none_flg();
	}

	public void gi_str_ln_cd_none_flg(boolean value) {
		gi_str_ln_p().str_ln_cd_none_flg(value);
	}

	/**
	 * GR rack/line cd. 入庫棚・ラインＣＤ.<p>
	 *
	 */
	public String gr_str_ln_cd() {
		return gr_str_ln_p().str_ln_cd();
	}

	/**
	 * GR rack/line cd. 入庫棚・ラインＣＤ.<p>
	 *
	 */
	public void gr_str_ln_cd(String value) {
		gr_str_ln_p().str_ln_cd(value);
	}

	/**
	 * GR rack/line name 入庫棚・ライン名.<p>
	 *
	 */
	public String gr_str_ln_nm() {
		return gr_str_ln_p().str_ln_nm();
	}

	/**
	 * GR rack/line name 入庫棚・ライン名.<p>
	 *
	 */
	public void gr_str_ln_nm(String value) {
		gr_str_ln_p().str_ln_nm(value);
	}

	public boolean gr_str_ln_cd_none_flg() {
		return gr_str_ln_p().str_ln_cd_none_flg();
	}

	public void gr_str_ln_cd_none_flg(boolean value) {
		gr_str_ln_p().str_ln_cd_none_flg(value);
	}

	public String sno1() {
		return sno_wrk_no_p().sno1();
	}

	public void sno1(String value) {
		sno_wrk_no_p().sno1(value);
	}

	public boolean sno1_null_flg() {
		return sno_wrk_no_p().sno1_null_flg();
	}

	public void sno1_null_flg(boolean value) {
		sno_wrk_no_p().sno1_null_flg(value);
	}

	public String sno2() {
		return sno_wrk_no_p().sno2();
	}

	public void sno2(String value) {
		sno_wrk_no_p().sno2(value);
	}

	public boolean sno2_null_flg() {
		return sno_wrk_no_p().sno2_null_flg();
	}

	public void sno2_null_flg(boolean value) {
		sno_wrk_no_p().sno2_null_flg(value);
	}

	public String sno3() {
		return sno_wrk_no_p().sno3();
	}

	public void sno3(String value) {
		sno_wrk_no_p().sno3(value);
	}

	public boolean sno3_null_flg() {
		return sno_wrk_no_p().sno3_null_flg();
	}

	public void sno3_null_flg(boolean value) {
		sno_wrk_no_p().sno3_null_flg(value);
	}

	public String sno4() {
		return sno_wrk_no_p().sno4();
	}

	public void sno4(String value) {
		sno_wrk_no_p().sno4(value);
	}

	public boolean sno4_null_flg() {
		return sno_wrk_no_p().sno4_null_flg();
	}

	public void sno4_null_flg(boolean value) {
		sno_wrk_no_p().sno4_null_flg(value);
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
	 * Allocation SEIBAN No. 1 引当手配ＮＯ１.<p>
	 *
	 */
	public String alloc_sno1() {
		return alloc_sno_wrk_no_p().sno1();
	}

	/**
	 * Allocation SEIBAN No. 1 引当手配ＮＯ１.<p>
	 *
	 */
	public void alloc_sno1(String value) {
		alloc_sno_wrk_no_p().sno1(value);
	}

	/**
	 * Allocation SEIBAN No. 2 引当手配ＮＯ２.<p>
	 *
	 */
	public String alloc_sno2() {
		return alloc_sno_wrk_no_p().sno2();
	}

	/**
	 * Allocation SEIBAN No. 2 引当手配ＮＯ２.<p>
	 *
	 */
	public void alloc_sno2(String value) {
		alloc_sno_wrk_no_p().sno2(value);
	}

	/**
	 * Allocation SEIBAN No. 3 引当手配ＮＯ３.<p>
	 *
	 */
	public String alloc_sno3() {
		return alloc_sno_wrk_no_p().sno3();
	}

	/**
	 * Allocation SEIBAN No. 3 引当手配ＮＯ３.<p>
	 *
	 */
	public void alloc_sno3(String value) {
		alloc_sno_wrk_no_p().sno3(value);
	}

	/**
	 * Allocation SEIBAN No. 4 引当手配ＮＯ４.<p>
	 *
	 */
	public String alloc_sno4() {
		return alloc_sno_wrk_no_p().sno4();
	}

	/**
	 * Allocation SEIBAN No. 4 引当手配ＮＯ４.<p>
	 *
	 */
	public void alloc_sno4(String value) {
		alloc_sno_wrk_no_p().sno4(value);
	}

	public String stk_bp_cd() {
		return stk_bp_p().stk_bp_cd();
	}

	public void stk_bp_cd(String value) {
		stk_bp_p().stk_bp_cd(value);
	}

	public String stk_bp_nm() {
		return stk_bp_p().stk_bp_nm();
	}

	public void stk_bp_nm(String value) {
		stk_bp_p().stk_bp_nm(value);
	}

}

