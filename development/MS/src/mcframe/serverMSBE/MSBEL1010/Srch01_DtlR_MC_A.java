package mcframe.serverMSBE.MSBEL1010;

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
	/**
	 * Configuration check not required at shipping 出荷時構成チェック不要.<p>
	 *
	 */
	public static final String $skip_chk_ship_flg = "skip_chk_ship_flg";
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
	public static final String $def_ver_flg = "def_ver_flg";
	/**
	 * Version No. 版ＮＯ.<p>
	 *
	 */
	public static final String $ver_no = "ver_no";
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
	/**
	 * Transaction qty. 取引数量.<p>
	 *
	 */
	public static final String $trd_unit_qty = "trd_unit_qty";
	/**
	 * Cancel remaining 打切.<p>
	 *
	 */
	public static final String $abort_flg = "abort_flg";
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
	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public static final String $base_unit_qty = "base_unit_qty";
	/**
	 * Base unit result qty. 基準単位実績数量.<p>
	 *
	 */
	public static final String $base_unit_act_qty = "base_unit_act_qty";
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
	/**
	 * Packing unit qty. 梱包単位数量.<p>
	 *
	 */
	public static final String $pckg_unit_qty = "pckg_unit_qty";
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
	/**
	 * Scheduled qty. 予定数量.<p>
	 *
	 */
	public static final String $schd_qty = "schd_qty";
	/**
	 * For active ingredient 有効成分対象.<p>
	 *
	 */
	public static final String $cont_fctr_flg = "cont_fctr_flg";
	/**
	 * Active ingredient unit cd. 有効成分単位ＣＤ.<p>
	 *
	 */
	public static final String $cont_fctr_unit_cd = "cont_fctr_unit_cd";
	/**
	 * Active ingredient unit name 有効成分単位名.<p>
	 *
	 */
	public static final String $cont_fctr_unit_nm = "cont_fctr_unit_nm";
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
	/**
	 * Actual active ingredient coefficient 実際有効成分係数.<p>
	 *
	 */
	public static final String $act_cont_fctr = "act_cont_fctr";
	/**
	 * Actual active ingredient 実際有効成分.<p>
	 *
	 */
	public static final String $act_cont_qty = "act_cont_qty";
	/**
	 * Standard active ingredient coefficient 標準有効成分係数.<p>
	 *
	 */
	public static final String $std_cont_fctr = "std_cont_fctr";
	/**
	 * Standard active ingredient 標準有効成分.<p>
	 *
	 */
	public static final String $std_cont_qty = "std_cont_qty";
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
	 * For GI rack/line 出庫棚・ライン対象.<p>
	 *
	 */
	public static final String $gi_str_ln_tgt_flg = "gi_str_ln_tgt_flg";
	/**
	 * GI rack/line cd. 出庫棚・ラインＣＤ.<p>
	 *
	 */
	public static final String $gi_str_ln_cd = "gi_str_ln_cd";
	/**
	 * GI rack/line name 出庫棚・ライン名.<p>
	 *
	 */
	public static final String $gi_str_ln_nm = "gi_str_ln_nm";
	/**
	 * Without GI rack/line 出庫棚・ライン無.<p>
	 *
	 */
	public static final String $gi_str_ln_cd_none_flg = "gi_str_ln_cd_none_flg";
	/**
	 * GR rack/line cd. 入庫棚・ラインＣＤ.<p>
	 *
	 */
	public static final String $gr_str_ln_cd = "gr_str_ln_cd";
	/**
	 * GR rack/line name 入庫棚・ライン名.<p>
	 *
	 */
	public static final String $gr_str_ln_nm = "gr_str_ln_nm";
	/**
	 * Without GR rack/line 入庫棚・ライン無.<p>
	 *
	 */
	public static final String $gr_str_ln_cd_none_flg = "gr_str_ln_cd_none_flg";
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
	 * Allow without SEIBAN No. 1 手配ＮＯ１無し可.<p>
	 *
	 */
	public static final String $sno1_null_flg = "sno1_null_flg";
	/**
	 * SEIBAN No. 1 手配ＮＯ１.<p>
	 *
	 */
	public static final String $sno1 = "sno1";
	/**
	 * Allow without SEIBAN No. 2 手配ＮＯ２無し可.<p>
	 *
	 */
	public static final String $sno2_null_flg = "sno2_null_flg";
	/**
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public static final String $sno2 = "sno2";
	/**
	 * Allow without SEIBAN No. 3 手配ＮＯ３無し可.<p>
	 *
	 */
	public static final String $sno3_null_flg = "sno3_null_flg";
	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public static final String $sno3 = "sno3";
	/**
	 * Allow without SEIBAN No. 4 手配ＮＯ４無し可.<p>
	 *
	 */
	public static final String $sno4_null_flg = "sno4_null_flg";
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
	 * Allocation SEIBAN No. 1 引当手配ＮＯ１.<p>
	 *
	 */
	public static final String $alloc_sno1 = "alloc_sno1";
	/**
	 * Allocation SEIBAN No. 2 引当手配ＮＯ２.<p>
	 *
	 */
	public static final String $alloc_sno2 = "alloc_sno2";
	/**
	 * Allocation SEIBAN No. 3 引当手配ＮＯ３.<p>
	 *
	 */
	public static final String $alloc_sno3 = "alloc_sno3";
	/**
	 * Allocation SEIBAN No. 4 引当手配ＮＯ４.<p>
	 *
	 */
	public static final String $alloc_sno4 = "alloc_sno4";
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
	 * Inventory BP cd. 在庫取引先ＣＤ.<p>
	 *
	 */
	public static final String $stk_bp_cd = "stk_bp_cd";
	/**
	 * Inventory BP name 在庫取引先名.<p>
	 *
	 */
	public static final String $stk_bp_nm = "stk_bp_nm";
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
	 * WMS flg. ＷＭＳＦＬＧ.<p>
	 *
	 */
	public static final String $wms_flg = "wms_flg";
	/**
	 * Last WMS flg. 前回ＷＭＳＦＬＧ.<p>
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
	 * Movement order No. 移動指図ＮＯ.<p>
	 *
	 */
	public static final String $xfr_inst_no = "xfr_inst_no";
	/**
	 * Movement order details No. 移動指図明細ＮＯ.<p>
	 *
	 */
	public static final String $xfr_inst_d_no = "xfr_inst_d_no";
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
	 * Movement/transport schedule No. 移動・移送予定ＮＯ.<p>
	 *
	 */
	public static final String $xfr_schd_no = "xfr_schd_no";
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
	 * GR/GI progress management No. 受払進捗管理ＮＯ.<p>
	 *
	 */
	public static final String $io_schd_pr_no = "io_schd_pr_no";
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
	 * Error エラー.<p>
	 *
	 */
	public static final String $err_flg = "err_flg";


	public static final MCMeta pr_sts_typ_META = createCommonMeta($pr_sts_typ, mcframe.commonMS.meta.MS_META.PR_STS_TYP);
	public static final MCMeta pr_sts_typ_nm_META = createCommonMeta($pr_sts_typ_nm, mcframe.commonMS.meta.MS_META.PR_STS_TYP_NM);
	public static final MCMeta itm_cd_META = createCommonMeta($itm_cd, mcframe.commonMA.meta.MA_META.ITM_CD);
	public static final MCMeta itm_sub1_META = createCommonMeta($itm_sub1, mcframe.commonMA.meta.MA_META.ITM_SUB1);
	public static final MCMeta itm_sub2_META = createCommonMeta($itm_sub2, mcframe.commonMA.meta.MA_META.ITM_SUB2);
	public static final MCMeta itm_sub3_META = createCommonMeta($itm_sub3, mcframe.commonMA.meta.MA_META.ITM_SUB3);
	public static final MCMeta itm_nm_META = createCommonMeta($itm_nm, mcframe.commonMA.meta.MA_META.ITM_NM);
	public static final MCMeta lot_mng_typ_META = createCommonMeta($lot_mng_typ, mcframe.commonMA.meta.MA_META.LOT_MNG_TYP);
	public static final MCMeta sublot_mng_typ_META = createCommonMeta($sublot_mng_typ, mcframe.commonMA.meta.MA_META.SUBLOT_MNG_TYP);
	public static final MCMeta sno1_mng_typ_META = createCommonMeta($sno1_mng_typ, mcframe.commonMA.meta.MA_META.SNO_MNG_TYP);
	public static final MCMeta sno2_mng_typ_META = createCommonMeta($sno2_mng_typ, mcframe.commonMA.meta.MA_META.SNO_MNG_TYP);
	public static final MCMeta sno3_mng_typ_META = createCommonMeta($sno3_mng_typ, mcframe.commonMA.meta.MA_META.SNO_MNG_TYP);
	public static final MCMeta sno4_mng_typ_META = createCommonMeta($sno4_mng_typ, mcframe.commonMA.meta.MA_META.SNO_MNG_TYP);
	public static final MCMeta asset_mng_typ_META = createCommonMeta($asset_mng_typ, mcframe.commonMA.meta.MA_META.ASSET_MNG_TYP);
	public static final MCMeta alloc_flg_META = createCommonMeta($alloc_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta lot_none_flg_META = createCommonMeta($lot_none_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta skip_chk_ship_flg_META = createCommonMeta($skip_chk_ship_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta lot_no_META = createCommonMeta($lot_no, mcframe.commonMA.meta.MA_META.LOT_NO);
	public static final MCMeta sublot_no_META = createCommonMeta($sublot_no, mcframe.commonMA.meta.MA_META.SUBLOT_NO);
	public static final MCMeta def_ver_flg_META = createCommonMeta($def_ver_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta ver_no_META = createCommonMeta($ver_no, mcframe.commonMA.meta.MA_META.VER_NO);
	public static final MCMeta trd_unit_cd_META = createCommonMeta($trd_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta trd_unit_nm_META = createCommonMeta($trd_unit_nm, mcframe.commonMA.meta.MA_META.UNIT_NM);
	public static final MCMeta trd_unit_conv_base_qty_META = createCommonMeta($trd_unit_conv_base_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta trd_unit_conv_qty_META = createCommonMeta($trd_unit_conv_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta trd_unit_dec_place_META = createCommonMeta($trd_unit_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta trd_unit_rnd_typ_META = createCommonMeta($trd_unit_rnd_typ, mcframe.commonMA.meta.MA_META.RND_TYP);
	public static final MCMeta trd_unit_qty_META = createCommonMeta($trd_unit_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta abort_flg_META = createCommonMeta($abort_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta inst_bndl_flg_META = createCommonMeta($inst_bndl_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta inst_bndl_src_flg_META = createCommonMeta($inst_bndl_src_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta base_unit_cd_META = createCommonMeta($base_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta base_unit_nm_META = createCommonMeta($base_unit_nm, mcframe.commonMA.meta.MA_META.UNIT_NM);
	public static final MCMeta base_unit_dec_place_META = createCommonMeta($base_unit_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta base_unit_rnd_typ_META = createCommonMeta($base_unit_rnd_typ, mcframe.commonMA.meta.MA_META.RND_TYP);
	public static final MCMeta base_unit_qty_META = createCommonMeta($base_unit_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta base_unit_act_qty_META = createCommonMeta($base_unit_act_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta pckg_unit_cd_META = createCommonMeta($pckg_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta pckg_unit_nm_META = createCommonMeta($pckg_unit_nm, mcframe.commonMA.meta.MA_META.UNIT_NM);
	public static final MCMeta pckg_unit_conv_base_qty_META = createCommonMeta($pckg_unit_conv_base_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta pckg_unit_conv_qty_META = createCommonMeta($pckg_unit_conv_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta pckg_unit_dec_place_META = createCommonMeta($pckg_unit_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta pckg_unit_qty_META = createCommonMeta($pckg_unit_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta schd_unit_cd_META = createCommonMeta($schd_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta schd_unit_nm_META = createCommonMeta($schd_unit_nm, mcframe.commonMA.meta.MA_META.UNIT_NM);
	public static final MCMeta schd_unit_dec_place_META = createCommonMeta($schd_unit_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta schd_qty_META = createCommonMeta($schd_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta cont_fctr_flg_META = createCommonMeta($cont_fctr_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta cont_fctr_unit_cd_META = createCommonMeta($cont_fctr_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta cont_fctr_unit_nm_META = createCommonMeta($cont_fctr_unit_nm, mcframe.commonMA.meta.MA_META.UNIT_NM);
	public static final MCMeta cont_fctr_dec_place_META = createCommonMeta($cont_fctr_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta cont_fctr_rnd_typ_META = createCommonMeta($cont_fctr_rnd_typ, mcframe.commonMA.meta.MA_META.RND_TYP);
	public static final MCMeta act_cont_fctr_META = createCommonMeta($act_cont_fctr, mcframe.commonMA.meta.MA_META.ACT_CONT_FCTR);
	public static final MCMeta act_cont_qty_META = createCommonMeta($act_cont_qty, mcframe.commonMA.meta.MA_META.CONT_QTY);
	public static final MCMeta std_cont_fctr_META = createCommonMeta($std_cont_fctr, mcframe.commonMA.meta.MA_META.STD_CONT_FCTR);
	public static final MCMeta std_cont_qty_META = createCommonMeta($std_cont_qty, mcframe.commonMA.meta.MA_META.CONT_QTY);
	public static final MCMeta gi_loc_cd_META = createCommonMeta($gi_loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta gi_loc_nm_META = createCommonMeta($gi_loc_nm, mcframe.commonMA.meta.MA_META.LOC_NM);
	public static final MCMeta gi_site_cd_META = createCommonMeta($gi_site_cd, mcframe.commonMA.meta.MA_META.SITE_CD);
	public static final MCMeta gi_sppl_cd_META = createCommonMeta($gi_sppl_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta gi_stk_arrv_bp_cd_META = createCommonMeta($gi_stk_arrv_bp_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta gi_stk_arrv_bp_nm_META = createCommonMeta($gi_stk_arrv_bp_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta gi_str_ln_tgt_flg_META = createCommonMeta($gi_str_ln_tgt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta gi_str_ln_cd_META = createCommonMeta($gi_str_ln_cd, mcframe.commonMA.meta.MA_META.STR_LN_CD);
	public static final MCMeta gi_str_ln_nm_META = createCommonMeta($gi_str_ln_nm, mcframe.commonMA.meta.MA_META.STR_LN_NM);
	public static final MCMeta gi_str_ln_cd_none_flg_META = createCommonMeta($gi_str_ln_cd_none_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta gr_str_ln_cd_META = createCommonMeta($gr_str_ln_cd, mcframe.commonMA.meta.MA_META.STR_LN_CD);
	public static final MCMeta gr_str_ln_nm_META = createCommonMeta($gr_str_ln_nm, mcframe.commonMA.meta.MA_META.STR_LN_NM);
	public static final MCMeta gr_str_ln_cd_none_flg_META = createCommonMeta($gr_str_ln_cd_none_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta gd_cd_META = createCommonMeta($gd_cd, mcframe.commonMA.meta.MA_META.STK_GD_CD);
	public static final MCMeta gd_nm_META = createCommonMeta($gd_nm, mcframe.commonMA.meta.MA_META.STK_GD_NM);
	public static final MCMeta quality_typ_META = createCommonMeta($quality_typ, mcframe.commonMA.meta.MA_META.QUALITY_TYP);
	public static final MCMeta quality_typ_nm_META = createCommonMeta($quality_typ_nm, mcframe.commonMA.meta.MA_META.QUALITY_TYP_NM);
	public static final MCMeta not_lot_mix_flg_META = createCommonMeta($not_lot_mix_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta not_sublot_mix_flg_META = createCommonMeta($not_sublot_mix_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta vld_dt_fr_META = createCommonMeta($vld_dt_fr, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta sno1_null_flg_META = createCommonMeta($sno1_null_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sno1_META = createCommonMeta($sno1, mcframe.commonMA.meta.MA_META.SNO1);
	public static final MCMeta sno2_null_flg_META = createCommonMeta($sno2_null_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sno2_META = createCommonMeta($sno2, mcframe.commonMA.meta.MA_META.SNO2);
	public static final MCMeta sno3_null_flg_META = createCommonMeta($sno3_null_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sno3_META = createCommonMeta($sno3, mcframe.commonMA.meta.MA_META.SNO3);
	public static final MCMeta sno4_null_flg_META = createCommonMeta($sno4_null_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sno4_META = createCommonMeta($sno4, mcframe.commonMA.meta.MA_META.SNO4);
	public static final MCMeta wrk_no_META = createCommonMeta($wrk_no, mcframe.commonMA.meta.MA_META.WRK_NO);
	public static final MCMeta wrk_nm_META = createCommonMeta($wrk_nm, mcframe.commonMA.meta.MA_META.WRK_NM);
	public static final MCMeta alloc_sno1_META = createCommonMeta($alloc_sno1, mcframe.commonMA.meta.MA_META.SNO1);
	public static final MCMeta alloc_sno2_META = createCommonMeta($alloc_sno2, mcframe.commonMA.meta.MA_META.SNO2);
	public static final MCMeta alloc_sno3_META = createCommonMeta($alloc_sno3, mcframe.commonMA.meta.MA_META.SNO3);
	public static final MCMeta alloc_sno4_META = createCommonMeta($alloc_sno4, mcframe.commonMA.meta.MA_META.SNO4);
	public static final MCMeta stk_id_typ_META = createCommonMeta($stk_id_typ, mcframe.commonMS.meta.MS_META.STK_ID_TYP);
	public static final MCMeta stk_id_typ_nm_META = createCommonMeta($stk_id_typ_nm, mcframe.commonMS.meta.MS_META.STK_ID_TYP_NM);
	public static final MCMeta stk_bp_cd_META = createCommonMeta($stk_bp_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta stk_bp_nm_META = createCommonMeta($stk_bp_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta rsn_cd_META = createCommonMeta($rsn_cd, mcframe.commonMA.meta.MA_META.BIZ_RSN_CD);
	public static final MCMeta rsn_nm_META = createCommonMeta($rsn_nm, mcframe.commonMA.meta.MA_META.BIZ_RSN_NM);
	public static final MCMeta acxfr_gi_flg_META = createCommonMeta($acxfr_gi_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta bd_dpt_cd_META = createCommonMeta($bd_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta bd_dpt_nm_META = createCommonMeta($bd_dpt_nm, mcframe.commonMA.meta.MA_META.DPT_NM);
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
	public static final MCMeta xfr_alloc_sts_no_META = createCommonMeta($xfr_alloc_sts_no, mcframe.commonMA.meta.MA_META.XFR_ALLOC_STS_NO);
	public static final MCMeta old_xfr_alloc_sts_no_META = createCommonMeta($old_xfr_alloc_sts_no, mcframe.commonMA.meta.MA_META.XFR_ALLOC_STS_NO);
	public static final MCMeta xfr_inst_no_META = createCommonMeta($xfr_inst_no, mcframe.commonMA.meta.MA_META.XFR_INST_NO);
	public static final MCMeta xfr_inst_d_no_META = createCommonMeta($xfr_inst_d_no, mcframe.commonMA.meta.MA_META.XFR_INST_D_NO);
	public static final MCMeta prov_schd_no_META = createCommonMeta($prov_schd_no, mcframe.commonMA.meta.MA_META.PROV_SCHD_NO);
	public static final MCMeta ret_prov_schd_no_META = createCommonMeta($ret_prov_schd_no, mcframe.commonMA.meta.MA_META.PROV_SCHD_NO);
	public static final MCMeta xfr_schd_no_META = createCommonMeta($xfr_schd_no, mcframe.commonMA.meta.MA_META.XFR_SCHD_NO);
	public static final MCMeta xfr_src_typ_META = createCommonMeta($xfr_src_typ, mcframe.commonMS.meta.MS_META.XFR_SRC_TYP);
	public static final MCMeta xfr_src_typ_nm_META = createCommonMeta($xfr_src_typ_nm, mcframe.commonMS.meta.MS_META.XFR_SRC_TYP_NM);
	public static final MCMeta xfr_src_no_META = createCommonMeta($xfr_src_no, mcframe.commonMA.meta.MA_META.XFR_SRC_NO);
	public static final MCMeta dlv_slip_no_META = createCommonMeta($dlv_slip_no, mcframe.commonMA.meta.MA_META.DLV_SLIP_NO);
	public static final MCMeta dlv_slip_d_no_META = createCommonMeta($dlv_slip_d_no, mcframe.commonMA.meta.MA_META.DLV_SLIP_D_NO);
	public static final MCMeta io_schd_pr_no_META = createCommonMeta($io_schd_pr_no, mcframe.commonMA.meta.MA_META.IO_SCHD_PR_NO);
	public static final MCMeta disp_seq_META = createCommonMeta($disp_seq, mcframe.commonMA.meta.MA_META.DISP_SEQ);
	public static final MCMeta alloc_sts_upd_cntr_META = createCommonMeta($alloc_sts_upd_cntr, mcframe.commonMA.meta.MA_META.UPD_CNT);
	public static final MCMeta err_flg_META = createCommonMeta($err_flg, mcframe.commonMA.meta.MA_META.FLG);

	protected static final ConstMetaList<Srch01_DtlR> constMetas = new ConstMetaList<Srch01_DtlR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			pr_sts_typ_META,
			pr_sts_typ_nm_META,
			itm_cd_META,
			itm_sub1_META,
			itm_sub2_META,
			itm_sub3_META,
			itm_nm_META,
			lot_mng_typ_META,
			sublot_mng_typ_META,
			sno1_mng_typ_META,
			sno2_mng_typ_META,
			sno3_mng_typ_META,
			sno4_mng_typ_META,
			asset_mng_typ_META,
			alloc_flg_META,
			lot_none_flg_META,
			skip_chk_ship_flg_META,
			lot_no_META,
			sublot_no_META,
			def_ver_flg_META,
			ver_no_META,
			trd_unit_cd_META,
			trd_unit_nm_META,
			trd_unit_conv_base_qty_META,
			trd_unit_conv_qty_META,
			trd_unit_dec_place_META,
			trd_unit_rnd_typ_META,
			trd_unit_qty_META,
			abort_flg_META,
			inst_bndl_flg_META,
			inst_bndl_src_flg_META,
			base_unit_cd_META,
			base_unit_nm_META,
			base_unit_dec_place_META,
			base_unit_rnd_typ_META,
			base_unit_qty_META,
			base_unit_act_qty_META,
			pckg_unit_cd_META,
			pckg_unit_nm_META,
			pckg_unit_conv_base_qty_META,
			pckg_unit_conv_qty_META,
			pckg_unit_dec_place_META,
			pckg_unit_qty_META,
			schd_unit_cd_META,
			schd_unit_nm_META,
			schd_unit_dec_place_META,
			schd_qty_META,
			cont_fctr_flg_META,
			cont_fctr_unit_cd_META,
			cont_fctr_unit_nm_META,
			cont_fctr_dec_place_META,
			cont_fctr_rnd_typ_META,
			act_cont_fctr_META,
			act_cont_qty_META,
			std_cont_fctr_META,
			std_cont_qty_META,
			gi_loc_cd_META,
			gi_loc_nm_META,
			gi_site_cd_META,
			gi_sppl_cd_META,
			gi_stk_arrv_bp_cd_META,
			gi_stk_arrv_bp_nm_META,
			gi_str_ln_tgt_flg_META,
			gi_str_ln_cd_META,
			gi_str_ln_nm_META,
			gi_str_ln_cd_none_flg_META,
			gr_str_ln_cd_META,
			gr_str_ln_nm_META,
			gr_str_ln_cd_none_flg_META,
			gd_cd_META,
			gd_nm_META,
			quality_typ_META,
			quality_typ_nm_META,
			not_lot_mix_flg_META,
			not_sublot_mix_flg_META,
			vld_dt_fr_META,
			sno1_null_flg_META,
			sno1_META,
			sno2_null_flg_META,
			sno2_META,
			sno3_null_flg_META,
			sno3_META,
			sno4_null_flg_META,
			sno4_META,
			wrk_no_META,
			wrk_nm_META,
			alloc_sno1_META,
			alloc_sno2_META,
			alloc_sno3_META,
			alloc_sno4_META,
			stk_id_typ_META,
			stk_id_typ_nm_META,
			stk_bp_cd_META,
			stk_bp_nm_META,
			rsn_cd_META,
			rsn_nm_META,
			acxfr_gi_flg_META,
			bd_dpt_cd_META,
			bd_dpt_nm_META,
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
			xfr_alloc_sts_no_META,
			old_xfr_alloc_sts_no_META,
			xfr_inst_no_META,
			xfr_inst_d_no_META,
			prov_schd_no_META,
			ret_prov_schd_no_META,
			xfr_schd_no_META,
			xfr_src_typ_META,
			xfr_src_typ_nm_META,
			xfr_src_no_META,
			dlv_slip_no_META,
			dlv_slip_d_no_META,
			io_schd_pr_no_META,
			disp_seq_META,
			alloc_sts_upd_cntr_META,
			err_flg_META
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
				{$pr_sts_typ, "MSC_PR_STS_TYP"},	// pr_sts_typ
				{$quality_typ, "MAC_QUALITY_TYP"},	// quality_typ
				{$stk_id_typ, "MSC_STK_ID_TYP"},	// stk_id_typ
				{$prov_typ, "MAC_PROV_TYP"},	// prov_typ
				{$prov_basis_typ, "MAC_PROV_BASIS_TYP"},	// prov_basis_typ
				{$ret_prov_typ, "MAC_PROV_TYP"},	// ret_prov_typ
				{$ret_prov_basis_typ, "MAC_PROV_BASIS_TYP"},	// ret_prov_basis_typ
				{$xfr_src_typ, "MSC_XFR_SRC_TYP"}	// xfr_src_typ
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
	 * Progress status type 進捗状況区分.<p>
	 *
	 */
	public String pr_sts_typ() {
		return getConstString(offset + 0, $pr_sts_typ);
	}

	/**
	 * Progress status type 進捗状況区分.<p>
	 *
	 */
	public void pr_sts_typ(String value) {
		setConstString(offset + 0, $pr_sts_typ, value);
	}


	/**
	 * Progress status type name 進捗状況区分名.<p>
	 *
	 */
	public String pr_sts_typ_nm() {
		return getConstString(offset + 1, $pr_sts_typ_nm);
	}

	/**
	 * Progress status type name 進捗状況区分名.<p>
	 *
	 */
	public void pr_sts_typ_nm(String value) {
		setConstString(offset + 1, $pr_sts_typ_nm, value);
	}


	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public String itm_cd() {
		return getConstString(offset + 2, $itm_cd);
	}

	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public void itm_cd(String value) {
		setConstString(offset + 2, $itm_cd, value);
	}


	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public String itm_sub1() {
		return getConstString(offset + 3, $itm_sub1);
	}

	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public void itm_sub1(String value) {
		setConstString(offset + 3, $itm_sub1, value);
	}


	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public String itm_sub2() {
		return getConstString(offset + 4, $itm_sub2);
	}

	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public void itm_sub2(String value) {
		setConstString(offset + 4, $itm_sub2, value);
	}


	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public String itm_sub3() {
		return getConstString(offset + 5, $itm_sub3);
	}

	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public void itm_sub3(String value) {
		setConstString(offset + 5, $itm_sub3, value);
	}


	/**
	 * Item name 品名.<p>
	 *
	 */
	public String itm_nm() {
		return getConstString(offset + 6, $itm_nm);
	}

	/**
	 * Item name 品名.<p>
	 *
	 */
	public void itm_nm(String value) {
		setConstString(offset + 6, $itm_nm, value);
	}


	/**
	 * Lot management type ロット管理区分.<p>
	 *
	 */
	public String lot_mng_typ() {
		return getConstString(offset + 7, $lot_mng_typ);
	}

	/**
	 * Lot management type ロット管理区分.<p>
	 *
	 */
	public void lot_mng_typ(String value) {
		setConstString(offset + 7, $lot_mng_typ, value);
	}


	/**
	 * Sublot management type サブロット管理区分.<p>
	 *
	 */
	public String sublot_mng_typ() {
		return getConstString(offset + 8, $sublot_mng_typ);
	}

	/**
	 * Sublot management type サブロット管理区分.<p>
	 *
	 */
	public void sublot_mng_typ(String value) {
		setConstString(offset + 8, $sublot_mng_typ, value);
	}


	/**
	 * SEIBAN No. 1 management type 手配ＮＯ１管理区分.<p>
	 *
	 */
	public String sno1_mng_typ() {
		return getConstString(offset + 9, $sno1_mng_typ);
	}

	/**
	 * SEIBAN No. 1 management type 手配ＮＯ１管理区分.<p>
	 *
	 */
	public void sno1_mng_typ(String value) {
		setConstString(offset + 9, $sno1_mng_typ, value);
	}


	/**
	 * SEIBAN No. 2 management type 手配ＮＯ２管理区分.<p>
	 *
	 */
	public String sno2_mng_typ() {
		return getConstString(offset + 10, $sno2_mng_typ);
	}

	/**
	 * SEIBAN No. 2 management type 手配ＮＯ２管理区分.<p>
	 *
	 */
	public void sno2_mng_typ(String value) {
		setConstString(offset + 10, $sno2_mng_typ, value);
	}


	/**
	 * SEIBAN No. 3 management type 手配ＮＯ３管理区分.<p>
	 *
	 */
	public String sno3_mng_typ() {
		return getConstString(offset + 11, $sno3_mng_typ);
	}

	/**
	 * SEIBAN No. 3 management type 手配ＮＯ３管理区分.<p>
	 *
	 */
	public void sno3_mng_typ(String value) {
		setConstString(offset + 11, $sno3_mng_typ, value);
	}


	/**
	 * SEIBAN No. 4 management type 手配ＮＯ４管理区分.<p>
	 *
	 */
	public String sno4_mng_typ() {
		return getConstString(offset + 12, $sno4_mng_typ);
	}

	/**
	 * SEIBAN No. 4 management type 手配ＮＯ４管理区分.<p>
	 *
	 */
	public void sno4_mng_typ(String value) {
		setConstString(offset + 12, $sno4_mng_typ, value);
	}


	/**
	 * Asset management type 資産管理区分.<p>
	 *
	 */
	public String asset_mng_typ() {
		return getConstString(offset + 13, $asset_mng_typ);
	}

	/**
	 * Asset management type 資産管理区分.<p>
	 *
	 */
	public void asset_mng_typ(String value) {
		setConstString(offset + 13, $asset_mng_typ, value);
	}


	/**
	 * Allocation 引当.<p>
	 *
	 */
	public boolean alloc_flg() {
		return getConstBoolean(offset + 14, $alloc_flg);
	}

	/**
	 * Allocation 引当.<p>
	 *
	 */
	public void alloc_flg(boolean value) {
		setConstBoolean(offset + 14, $alloc_flg, value);
	}


	/**
	 * Without lot ロット指定無.<p>
	 *
	 */
	public boolean lot_none_flg() {
		return getConstBoolean(offset + 15, $lot_none_flg);
	}

	/**
	 * Without lot ロット指定無.<p>
	 *
	 */
	public void lot_none_flg(boolean value) {
		setConstBoolean(offset + 15, $lot_none_flg, value);
	}


	/**
	 * Configuration check not required at shipping 出荷時構成チェック不要.<p>
	 *
	 */
	public boolean skip_chk_ship_flg() {
		return getConstBoolean(offset + 16, $skip_chk_ship_flg);
	}

	/**
	 * Configuration check not required at shipping 出荷時構成チェック不要.<p>
	 *
	 */
	public void skip_chk_ship_flg(boolean value) {
		setConstBoolean(offset + 16, $skip_chk_ship_flg, value);
	}


	/**
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public String lot_no() {
		return getConstString(offset + 17, $lot_no);
	}

	/**
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public void lot_no(String value) {
		setConstString(offset + 17, $lot_no, value);
	}


	/**
	 * Sublot No. サブロットＮＯ.<p>
	 *
	 */
	public String sublot_no() {
		return getConstString(offset + 18, $sublot_no);
	}

	/**
	 * Sublot No. サブロットＮＯ.<p>
	 *
	 */
	public void sublot_no(String value) {
		setConstString(offset + 18, $sublot_no, value);
	}


	/**
	 * For version control 版管理対象.<p>
	 *
	 */
	public boolean def_ver_flg() {
		return getConstBoolean(offset + 19, $def_ver_flg);
	}

	/**
	 * For version control 版管理対象.<p>
	 *
	 */
	public void def_ver_flg(boolean value) {
		setConstBoolean(offset + 19, $def_ver_flg, value);
	}


	/**
	 * Version No. 版ＮＯ.<p>
	 *
	 */
	public String ver_no() {
		return getConstString(offset + 20, $ver_no);
	}

	/**
	 * Version No. 版ＮＯ.<p>
	 *
	 */
	public void ver_no(String value) {
		setConstString(offset + 20, $ver_no, value);
	}


	/**
	 * Transaction unit cd. 取引単位ＣＤ.<p>
	 *
	 */
	public String trd_unit_cd() {
		return getConstString(offset + 21, $trd_unit_cd);
	}

	/**
	 * Transaction unit cd. 取引単位ＣＤ.<p>
	 *
	 */
	public void trd_unit_cd(String value) {
		setConstString(offset + 21, $trd_unit_cd, value);
	}


	/**
	 * Transaction unit name 取引単位名.<p>
	 *
	 */
	public String trd_unit_nm() {
		return getConstString(offset + 22, $trd_unit_nm);
	}

	/**
	 * Transaction unit name 取引単位名.<p>
	 *
	 */
	public void trd_unit_nm(String value) {
		setConstString(offset + 22, $trd_unit_nm, value);
	}


	/**
	 * Transaction unit conversion base qty. 取引単位換算基準数量.<p>
	 *
	 */
	public MCNumber trd_unit_conv_base_qty() {
		return getConstNumber(offset + 23, $trd_unit_conv_base_qty);
	}

	/**
	 * Transaction unit conversion base qty. 取引単位換算基準数量.<p>
	 *
	 */
	public void trd_unit_conv_base_qty(MCNumber value) {
		setConstNumber(offset + 23, $trd_unit_conv_base_qty, value);
	}

	/**
	 * Transaction unit conversion base qty. 取引単位換算基準数量.<p>
	 *
	 */
	public void trd_unit_conv_base_qty(int value) {
		setConstNumber(offset + 23, $trd_unit_conv_base_qty, value);
	}

	/**
	 * Transaction unit conversion base qty. 取引単位換算基準数量.<p>
	 *
	 */
	public void trd_unit_conv_base_qty(long value) {
		setConstNumber(offset + 23, $trd_unit_conv_base_qty, value);
	}

	/**
	 * Transaction unit conversion base qty. 取引単位換算基準数量.<p>
	 *
	 */
	public void trd_unit_conv_base_qty(float value) {
		setConstNumber(offset + 23, $trd_unit_conv_base_qty, value);
	}

	/**
	 * Transaction unit conversion base qty. 取引単位換算基準数量.<p>
	 *
	 */
	public void trd_unit_conv_base_qty(double value) {
		setConstNumber(offset + 23, $trd_unit_conv_base_qty, value);
	}


	/**
	 * Transaction unit conversion qty. 取引単位換算数量.<p>
	 *
	 */
	public MCNumber trd_unit_conv_qty() {
		return getConstNumber(offset + 24, $trd_unit_conv_qty);
	}

	/**
	 * Transaction unit conversion qty. 取引単位換算数量.<p>
	 *
	 */
	public void trd_unit_conv_qty(MCNumber value) {
		setConstNumber(offset + 24, $trd_unit_conv_qty, value);
	}

	/**
	 * Transaction unit conversion qty. 取引単位換算数量.<p>
	 *
	 */
	public void trd_unit_conv_qty(int value) {
		setConstNumber(offset + 24, $trd_unit_conv_qty, value);
	}

	/**
	 * Transaction unit conversion qty. 取引単位換算数量.<p>
	 *
	 */
	public void trd_unit_conv_qty(long value) {
		setConstNumber(offset + 24, $trd_unit_conv_qty, value);
	}

	/**
	 * Transaction unit conversion qty. 取引単位換算数量.<p>
	 *
	 */
	public void trd_unit_conv_qty(float value) {
		setConstNumber(offset + 24, $trd_unit_conv_qty, value);
	}

	/**
	 * Transaction unit conversion qty. 取引単位換算数量.<p>
	 *
	 */
	public void trd_unit_conv_qty(double value) {
		setConstNumber(offset + 24, $trd_unit_conv_qty, value);
	}


	/**
	 * Transaction unit number of decimal places 取引単位小数部有効桁数.<p>
	 *
	 */
	public MCNumber trd_unit_dec_place() {
		return getConstNumber(offset + 25, $trd_unit_dec_place);
	}

	/**
	 * Transaction unit number of decimal places 取引単位小数部有効桁数.<p>
	 *
	 */
	public void trd_unit_dec_place(MCNumber value) {
		setConstNumber(offset + 25, $trd_unit_dec_place, value);
	}

	/**
	 * Transaction unit number of decimal places 取引単位小数部有効桁数.<p>
	 *
	 */
	public void trd_unit_dec_place(int value) {
		setConstNumber(offset + 25, $trd_unit_dec_place, value);
	}

	/**
	 * Transaction unit number of decimal places 取引単位小数部有効桁数.<p>
	 *
	 */
	public void trd_unit_dec_place(long value) {
		setConstNumber(offset + 25, $trd_unit_dec_place, value);
	}

	/**
	 * Transaction unit number of decimal places 取引単位小数部有効桁数.<p>
	 *
	 */
	public void trd_unit_dec_place(float value) {
		setConstNumber(offset + 25, $trd_unit_dec_place, value);
	}

	/**
	 * Transaction unit number of decimal places 取引単位小数部有効桁数.<p>
	 *
	 */
	public void trd_unit_dec_place(double value) {
		setConstNumber(offset + 25, $trd_unit_dec_place, value);
	}


	/**
	 * Transaction unit rounding type 取引単位端数処理区分.<p>
	 *
	 */
	public String trd_unit_rnd_typ() {
		return getConstString(offset + 26, $trd_unit_rnd_typ);
	}

	/**
	 * Transaction unit rounding type 取引単位端数処理区分.<p>
	 *
	 */
	public void trd_unit_rnd_typ(String value) {
		setConstString(offset + 26, $trd_unit_rnd_typ, value);
	}


	/**
	 * Transaction qty. 取引数量.<p>
	 *
	 */
	public MCNumber trd_unit_qty() {
		return getConstNumber(offset + 27, $trd_unit_qty);
	}

	/**
	 * Transaction qty. 取引数量.<p>
	 *
	 */
	public void trd_unit_qty(MCNumber value) {
		setConstNumber(offset + 27, $trd_unit_qty, value);
	}

	/**
	 * Transaction qty. 取引数量.<p>
	 *
	 */
	public void trd_unit_qty(int value) {
		setConstNumber(offset + 27, $trd_unit_qty, value);
	}

	/**
	 * Transaction qty. 取引数量.<p>
	 *
	 */
	public void trd_unit_qty(long value) {
		setConstNumber(offset + 27, $trd_unit_qty, value);
	}

	/**
	 * Transaction qty. 取引数量.<p>
	 *
	 */
	public void trd_unit_qty(float value) {
		setConstNumber(offset + 27, $trd_unit_qty, value);
	}

	/**
	 * Transaction qty. 取引数量.<p>
	 *
	 */
	public void trd_unit_qty(double value) {
		setConstNumber(offset + 27, $trd_unit_qty, value);
	}


	/**
	 * Cancel remaining 打切.<p>
	 *
	 */
	public boolean abort_flg() {
		return getConstBoolean(offset + 28, $abort_flg);
	}

	/**
	 * Cancel remaining 打切.<p>
	 *
	 */
	public void abort_flg(boolean value) {
		setConstBoolean(offset + 28, $abort_flg, value);
	}


	/**
	 * Order aggregation 指図まとめ.<p>
	 *
	 */
	public boolean inst_bndl_flg() {
		return getConstBoolean(offset + 29, $inst_bndl_flg);
	}

	/**
	 * Order aggregation 指図まとめ.<p>
	 *
	 */
	public void inst_bndl_flg(boolean value) {
		setConstBoolean(offset + 29, $inst_bndl_flg, value);
	}


	/**
	 * Order aggregation-from 指図まとめ元.<p>
	 *
	 */
	public boolean inst_bndl_src_flg() {
		return getConstBoolean(offset + 30, $inst_bndl_src_flg);
	}

	/**
	 * Order aggregation-from 指図まとめ元.<p>
	 *
	 */
	public void inst_bndl_src_flg(boolean value) {
		setConstBoolean(offset + 30, $inst_bndl_src_flg, value);
	}


	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public String base_unit_cd() {
		return getConstString(offset + 31, $base_unit_cd);
	}

	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public void base_unit_cd(String value) {
		setConstString(offset + 31, $base_unit_cd, value);
	}


	/**
	 * Base unit name 基準単位名.<p>
	 *
	 */
	public String base_unit_nm() {
		return getConstString(offset + 32, $base_unit_nm);
	}

	/**
	 * Base unit name 基準単位名.<p>
	 *
	 */
	public void base_unit_nm(String value) {
		setConstString(offset + 32, $base_unit_nm, value);
	}


	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public MCNumber base_unit_dec_place() {
		return getConstNumber(offset + 33, $base_unit_dec_place);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(MCNumber value) {
		setConstNumber(offset + 33, $base_unit_dec_place, value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(int value) {
		setConstNumber(offset + 33, $base_unit_dec_place, value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(long value) {
		setConstNumber(offset + 33, $base_unit_dec_place, value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(float value) {
		setConstNumber(offset + 33, $base_unit_dec_place, value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(double value) {
		setConstNumber(offset + 33, $base_unit_dec_place, value);
	}


	/**
	 * Base unit rounding type 基準単位端数処理区分.<p>
	 *
	 */
	public String base_unit_rnd_typ() {
		return getConstString(offset + 34, $base_unit_rnd_typ);
	}

	/**
	 * Base unit rounding type 基準単位端数処理区分.<p>
	 *
	 */
	public void base_unit_rnd_typ(String value) {
		setConstString(offset + 34, $base_unit_rnd_typ, value);
	}


	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public MCNumber base_unit_qty() {
		return getConstNumber(offset + 35, $base_unit_qty);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(MCNumber value) {
		setConstNumber(offset + 35, $base_unit_qty, value);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(int value) {
		setConstNumber(offset + 35, $base_unit_qty, value);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(long value) {
		setConstNumber(offset + 35, $base_unit_qty, value);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(float value) {
		setConstNumber(offset + 35, $base_unit_qty, value);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(double value) {
		setConstNumber(offset + 35, $base_unit_qty, value);
	}


	/**
	 * Base unit result qty. 基準単位実績数量.<p>
	 *
	 */
	public MCNumber base_unit_act_qty() {
		return getConstNumber(offset + 36, $base_unit_act_qty);
	}

	/**
	 * Base unit result qty. 基準単位実績数量.<p>
	 *
	 */
	public void base_unit_act_qty(MCNumber value) {
		setConstNumber(offset + 36, $base_unit_act_qty, value);
	}

	/**
	 * Base unit result qty. 基準単位実績数量.<p>
	 *
	 */
	public void base_unit_act_qty(int value) {
		setConstNumber(offset + 36, $base_unit_act_qty, value);
	}

	/**
	 * Base unit result qty. 基準単位実績数量.<p>
	 *
	 */
	public void base_unit_act_qty(long value) {
		setConstNumber(offset + 36, $base_unit_act_qty, value);
	}

	/**
	 * Base unit result qty. 基準単位実績数量.<p>
	 *
	 */
	public void base_unit_act_qty(float value) {
		setConstNumber(offset + 36, $base_unit_act_qty, value);
	}

	/**
	 * Base unit result qty. 基準単位実績数量.<p>
	 *
	 */
	public void base_unit_act_qty(double value) {
		setConstNumber(offset + 36, $base_unit_act_qty, value);
	}


	/**
	 * Packing unit cd. 梱包単位ＣＤ.<p>
	 *
	 */
	public String pckg_unit_cd() {
		return getConstString(offset + 37, $pckg_unit_cd);
	}

	/**
	 * Packing unit cd. 梱包単位ＣＤ.<p>
	 *
	 */
	public void pckg_unit_cd(String value) {
		setConstString(offset + 37, $pckg_unit_cd, value);
	}


	/**
	 * Packing unit name 梱包単位名.<p>
	 *
	 */
	public String pckg_unit_nm() {
		return getConstString(offset + 38, $pckg_unit_nm);
	}

	/**
	 * Packing unit name 梱包単位名.<p>
	 *
	 */
	public void pckg_unit_nm(String value) {
		setConstString(offset + 38, $pckg_unit_nm, value);
	}


	/**
	 * Packing unit conversion base qty. 梱包単位換算基準数量.<p>
	 *
	 */
	public MCNumber pckg_unit_conv_base_qty() {
		return getConstNumber(offset + 39, $pckg_unit_conv_base_qty);
	}

	/**
	 * Packing unit conversion base qty. 梱包単位換算基準数量.<p>
	 *
	 */
	public void pckg_unit_conv_base_qty(MCNumber value) {
		setConstNumber(offset + 39, $pckg_unit_conv_base_qty, value);
	}

	/**
	 * Packing unit conversion base qty. 梱包単位換算基準数量.<p>
	 *
	 */
	public void pckg_unit_conv_base_qty(int value) {
		setConstNumber(offset + 39, $pckg_unit_conv_base_qty, value);
	}

	/**
	 * Packing unit conversion base qty. 梱包単位換算基準数量.<p>
	 *
	 */
	public void pckg_unit_conv_base_qty(long value) {
		setConstNumber(offset + 39, $pckg_unit_conv_base_qty, value);
	}

	/**
	 * Packing unit conversion base qty. 梱包単位換算基準数量.<p>
	 *
	 */
	public void pckg_unit_conv_base_qty(float value) {
		setConstNumber(offset + 39, $pckg_unit_conv_base_qty, value);
	}

	/**
	 * Packing unit conversion base qty. 梱包単位換算基準数量.<p>
	 *
	 */
	public void pckg_unit_conv_base_qty(double value) {
		setConstNumber(offset + 39, $pckg_unit_conv_base_qty, value);
	}


	/**
	 * Packing unit conversion qty. 梱包単位換算数量.<p>
	 *
	 */
	public MCNumber pckg_unit_conv_qty() {
		return getConstNumber(offset + 40, $pckg_unit_conv_qty);
	}

	/**
	 * Packing unit conversion qty. 梱包単位換算数量.<p>
	 *
	 */
	public void pckg_unit_conv_qty(MCNumber value) {
		setConstNumber(offset + 40, $pckg_unit_conv_qty, value);
	}

	/**
	 * Packing unit conversion qty. 梱包単位換算数量.<p>
	 *
	 */
	public void pckg_unit_conv_qty(int value) {
		setConstNumber(offset + 40, $pckg_unit_conv_qty, value);
	}

	/**
	 * Packing unit conversion qty. 梱包単位換算数量.<p>
	 *
	 */
	public void pckg_unit_conv_qty(long value) {
		setConstNumber(offset + 40, $pckg_unit_conv_qty, value);
	}

	/**
	 * Packing unit conversion qty. 梱包単位換算数量.<p>
	 *
	 */
	public void pckg_unit_conv_qty(float value) {
		setConstNumber(offset + 40, $pckg_unit_conv_qty, value);
	}

	/**
	 * Packing unit conversion qty. 梱包単位換算数量.<p>
	 *
	 */
	public void pckg_unit_conv_qty(double value) {
		setConstNumber(offset + 40, $pckg_unit_conv_qty, value);
	}


	/**
	 * Packing unit number of decimal places 梱包単位小数部有効桁数.<p>
	 *
	 */
	public MCNumber pckg_unit_dec_place() {
		return getConstNumber(offset + 41, $pckg_unit_dec_place);
	}

	/**
	 * Packing unit number of decimal places 梱包単位小数部有効桁数.<p>
	 *
	 */
	public void pckg_unit_dec_place(MCNumber value) {
		setConstNumber(offset + 41, $pckg_unit_dec_place, value);
	}

	/**
	 * Packing unit number of decimal places 梱包単位小数部有効桁数.<p>
	 *
	 */
	public void pckg_unit_dec_place(int value) {
		setConstNumber(offset + 41, $pckg_unit_dec_place, value);
	}

	/**
	 * Packing unit number of decimal places 梱包単位小数部有効桁数.<p>
	 *
	 */
	public void pckg_unit_dec_place(long value) {
		setConstNumber(offset + 41, $pckg_unit_dec_place, value);
	}

	/**
	 * Packing unit number of decimal places 梱包単位小数部有効桁数.<p>
	 *
	 */
	public void pckg_unit_dec_place(float value) {
		setConstNumber(offset + 41, $pckg_unit_dec_place, value);
	}

	/**
	 * Packing unit number of decimal places 梱包単位小数部有効桁数.<p>
	 *
	 */
	public void pckg_unit_dec_place(double value) {
		setConstNumber(offset + 41, $pckg_unit_dec_place, value);
	}


	/**
	 * Packing unit qty. 梱包単位数量.<p>
	 *
	 */
	public MCNumber pckg_unit_qty() {
		return getConstNumber(offset + 42, $pckg_unit_qty);
	}

	/**
	 * Packing unit qty. 梱包単位数量.<p>
	 *
	 */
	public void pckg_unit_qty(MCNumber value) {
		setConstNumber(offset + 42, $pckg_unit_qty, value);
	}

	/**
	 * Packing unit qty. 梱包単位数量.<p>
	 *
	 */
	public void pckg_unit_qty(int value) {
		setConstNumber(offset + 42, $pckg_unit_qty, value);
	}

	/**
	 * Packing unit qty. 梱包単位数量.<p>
	 *
	 */
	public void pckg_unit_qty(long value) {
		setConstNumber(offset + 42, $pckg_unit_qty, value);
	}

	/**
	 * Packing unit qty. 梱包単位数量.<p>
	 *
	 */
	public void pckg_unit_qty(float value) {
		setConstNumber(offset + 42, $pckg_unit_qty, value);
	}

	/**
	 * Packing unit qty. 梱包単位数量.<p>
	 *
	 */
	public void pckg_unit_qty(double value) {
		setConstNumber(offset + 42, $pckg_unit_qty, value);
	}


	/**
	 * Schedule unit cd. 予定単位ＣＤ.<p>
	 *
	 */
	public String schd_unit_cd() {
		return getConstString(offset + 43, $schd_unit_cd);
	}

	/**
	 * Schedule unit cd. 予定単位ＣＤ.<p>
	 *
	 */
	public void schd_unit_cd(String value) {
		setConstString(offset + 43, $schd_unit_cd, value);
	}


	/**
	 * Schedule unit name 予定単位名.<p>
	 *
	 */
	public String schd_unit_nm() {
		return getConstString(offset + 44, $schd_unit_nm);
	}

	/**
	 * Schedule unit name 予定単位名.<p>
	 *
	 */
	public void schd_unit_nm(String value) {
		setConstString(offset + 44, $schd_unit_nm, value);
	}


	/**
	 * Schedule unit number of decimal places 予定単位小数部有効桁数.<p>
	 *
	 */
	public MCNumber schd_unit_dec_place() {
		return getConstNumber(offset + 45, $schd_unit_dec_place);
	}

	/**
	 * Schedule unit number of decimal places 予定単位小数部有効桁数.<p>
	 *
	 */
	public void schd_unit_dec_place(MCNumber value) {
		setConstNumber(offset + 45, $schd_unit_dec_place, value);
	}

	/**
	 * Schedule unit number of decimal places 予定単位小数部有効桁数.<p>
	 *
	 */
	public void schd_unit_dec_place(int value) {
		setConstNumber(offset + 45, $schd_unit_dec_place, value);
	}

	/**
	 * Schedule unit number of decimal places 予定単位小数部有効桁数.<p>
	 *
	 */
	public void schd_unit_dec_place(long value) {
		setConstNumber(offset + 45, $schd_unit_dec_place, value);
	}

	/**
	 * Schedule unit number of decimal places 予定単位小数部有効桁数.<p>
	 *
	 */
	public void schd_unit_dec_place(float value) {
		setConstNumber(offset + 45, $schd_unit_dec_place, value);
	}

	/**
	 * Schedule unit number of decimal places 予定単位小数部有効桁数.<p>
	 *
	 */
	public void schd_unit_dec_place(double value) {
		setConstNumber(offset + 45, $schd_unit_dec_place, value);
	}


	/**
	 * Scheduled qty. 予定数量.<p>
	 *
	 */
	public MCNumber schd_qty() {
		return getConstNumber(offset + 46, $schd_qty);
	}

	/**
	 * Scheduled qty. 予定数量.<p>
	 *
	 */
	public void schd_qty(MCNumber value) {
		setConstNumber(offset + 46, $schd_qty, value);
	}

	/**
	 * Scheduled qty. 予定数量.<p>
	 *
	 */
	public void schd_qty(int value) {
		setConstNumber(offset + 46, $schd_qty, value);
	}

	/**
	 * Scheduled qty. 予定数量.<p>
	 *
	 */
	public void schd_qty(long value) {
		setConstNumber(offset + 46, $schd_qty, value);
	}

	/**
	 * Scheduled qty. 予定数量.<p>
	 *
	 */
	public void schd_qty(float value) {
		setConstNumber(offset + 46, $schd_qty, value);
	}

	/**
	 * Scheduled qty. 予定数量.<p>
	 *
	 */
	public void schd_qty(double value) {
		setConstNumber(offset + 46, $schd_qty, value);
	}


	/**
	 * For active ingredient 有効成分対象.<p>
	 *
	 */
	public boolean cont_fctr_flg() {
		return getConstBoolean(offset + 47, $cont_fctr_flg);
	}

	/**
	 * For active ingredient 有効成分対象.<p>
	 *
	 */
	public void cont_fctr_flg(boolean value) {
		setConstBoolean(offset + 47, $cont_fctr_flg, value);
	}


	/**
	 * Active ingredient unit cd. 有効成分単位ＣＤ.<p>
	 *
	 */
	public String cont_fctr_unit_cd() {
		return getConstString(offset + 48, $cont_fctr_unit_cd);
	}

	/**
	 * Active ingredient unit cd. 有効成分単位ＣＤ.<p>
	 *
	 */
	public void cont_fctr_unit_cd(String value) {
		setConstString(offset + 48, $cont_fctr_unit_cd, value);
	}


	/**
	 * Active ingredient unit name 有効成分単位名.<p>
	 *
	 */
	public String cont_fctr_unit_nm() {
		return getConstString(offset + 49, $cont_fctr_unit_nm);
	}

	/**
	 * Active ingredient unit name 有効成分単位名.<p>
	 *
	 */
	public void cont_fctr_unit_nm(String value) {
		setConstString(offset + 49, $cont_fctr_unit_nm, value);
	}


	/**
	 * Active ingredient unit number of decimal places 有効成分単位小数部有効桁数.<p>
	 *
	 */
	public MCNumber cont_fctr_dec_place() {
		return getConstNumber(offset + 50, $cont_fctr_dec_place);
	}

	/**
	 * Active ingredient unit number of decimal places 有効成分単位小数部有効桁数.<p>
	 *
	 */
	public void cont_fctr_dec_place(MCNumber value) {
		setConstNumber(offset + 50, $cont_fctr_dec_place, value);
	}

	/**
	 * Active ingredient unit number of decimal places 有効成分単位小数部有効桁数.<p>
	 *
	 */
	public void cont_fctr_dec_place(int value) {
		setConstNumber(offset + 50, $cont_fctr_dec_place, value);
	}

	/**
	 * Active ingredient unit number of decimal places 有効成分単位小数部有効桁数.<p>
	 *
	 */
	public void cont_fctr_dec_place(long value) {
		setConstNumber(offset + 50, $cont_fctr_dec_place, value);
	}

	/**
	 * Active ingredient unit number of decimal places 有効成分単位小数部有効桁数.<p>
	 *
	 */
	public void cont_fctr_dec_place(float value) {
		setConstNumber(offset + 50, $cont_fctr_dec_place, value);
	}

	/**
	 * Active ingredient unit number of decimal places 有効成分単位小数部有効桁数.<p>
	 *
	 */
	public void cont_fctr_dec_place(double value) {
		setConstNumber(offset + 50, $cont_fctr_dec_place, value);
	}


	/**
	 * Active ingredient unit rounding type 有効成分単位端数処理区分.<p>
	 *
	 */
	public String cont_fctr_rnd_typ() {
		return getConstString(offset + 51, $cont_fctr_rnd_typ);
	}

	/**
	 * Active ingredient unit rounding type 有効成分単位端数処理区分.<p>
	 *
	 */
	public void cont_fctr_rnd_typ(String value) {
		setConstString(offset + 51, $cont_fctr_rnd_typ, value);
	}


	/**
	 * Actual active ingredient coefficient 実際有効成分係数.<p>
	 *
	 */
	public MCNumber act_cont_fctr() {
		return getConstNumber(offset + 52, $act_cont_fctr);
	}

	/**
	 * Actual active ingredient coefficient 実際有効成分係数.<p>
	 *
	 */
	public void act_cont_fctr(MCNumber value) {
		setConstNumber(offset + 52, $act_cont_fctr, value);
	}

	/**
	 * Actual active ingredient coefficient 実際有効成分係数.<p>
	 *
	 */
	public void act_cont_fctr(int value) {
		setConstNumber(offset + 52, $act_cont_fctr, value);
	}

	/**
	 * Actual active ingredient coefficient 実際有効成分係数.<p>
	 *
	 */
	public void act_cont_fctr(long value) {
		setConstNumber(offset + 52, $act_cont_fctr, value);
	}

	/**
	 * Actual active ingredient coefficient 実際有効成分係数.<p>
	 *
	 */
	public void act_cont_fctr(float value) {
		setConstNumber(offset + 52, $act_cont_fctr, value);
	}

	/**
	 * Actual active ingredient coefficient 実際有効成分係数.<p>
	 *
	 */
	public void act_cont_fctr(double value) {
		setConstNumber(offset + 52, $act_cont_fctr, value);
	}


	/**
	 * Actual active ingredient 実際有効成分.<p>
	 *
	 */
	public MCNumber act_cont_qty() {
		return getConstNumber(offset + 53, $act_cont_qty);
	}

	/**
	 * Actual active ingredient 実際有効成分.<p>
	 *
	 */
	public void act_cont_qty(MCNumber value) {
		setConstNumber(offset + 53, $act_cont_qty, value);
	}

	/**
	 * Actual active ingredient 実際有効成分.<p>
	 *
	 */
	public void act_cont_qty(int value) {
		setConstNumber(offset + 53, $act_cont_qty, value);
	}

	/**
	 * Actual active ingredient 実際有効成分.<p>
	 *
	 */
	public void act_cont_qty(long value) {
		setConstNumber(offset + 53, $act_cont_qty, value);
	}

	/**
	 * Actual active ingredient 実際有効成分.<p>
	 *
	 */
	public void act_cont_qty(float value) {
		setConstNumber(offset + 53, $act_cont_qty, value);
	}

	/**
	 * Actual active ingredient 実際有効成分.<p>
	 *
	 */
	public void act_cont_qty(double value) {
		setConstNumber(offset + 53, $act_cont_qty, value);
	}


	/**
	 * Standard active ingredient coefficient 標準有効成分係数.<p>
	 *
	 */
	public MCNumber std_cont_fctr() {
		return getConstNumber(offset + 54, $std_cont_fctr);
	}

	/**
	 * Standard active ingredient coefficient 標準有効成分係数.<p>
	 *
	 */
	public void std_cont_fctr(MCNumber value) {
		setConstNumber(offset + 54, $std_cont_fctr, value);
	}

	/**
	 * Standard active ingredient coefficient 標準有効成分係数.<p>
	 *
	 */
	public void std_cont_fctr(int value) {
		setConstNumber(offset + 54, $std_cont_fctr, value);
	}

	/**
	 * Standard active ingredient coefficient 標準有効成分係数.<p>
	 *
	 */
	public void std_cont_fctr(long value) {
		setConstNumber(offset + 54, $std_cont_fctr, value);
	}

	/**
	 * Standard active ingredient coefficient 標準有効成分係数.<p>
	 *
	 */
	public void std_cont_fctr(float value) {
		setConstNumber(offset + 54, $std_cont_fctr, value);
	}

	/**
	 * Standard active ingredient coefficient 標準有効成分係数.<p>
	 *
	 */
	public void std_cont_fctr(double value) {
		setConstNumber(offset + 54, $std_cont_fctr, value);
	}


	/**
	 * Standard active ingredient 標準有効成分.<p>
	 *
	 */
	public MCNumber std_cont_qty() {
		return getConstNumber(offset + 55, $std_cont_qty);
	}

	/**
	 * Standard active ingredient 標準有効成分.<p>
	 *
	 */
	public void std_cont_qty(MCNumber value) {
		setConstNumber(offset + 55, $std_cont_qty, value);
	}

	/**
	 * Standard active ingredient 標準有効成分.<p>
	 *
	 */
	public void std_cont_qty(int value) {
		setConstNumber(offset + 55, $std_cont_qty, value);
	}

	/**
	 * Standard active ingredient 標準有効成分.<p>
	 *
	 */
	public void std_cont_qty(long value) {
		setConstNumber(offset + 55, $std_cont_qty, value);
	}

	/**
	 * Standard active ingredient 標準有効成分.<p>
	 *
	 */
	public void std_cont_qty(float value) {
		setConstNumber(offset + 55, $std_cont_qty, value);
	}

	/**
	 * Standard active ingredient 標準有効成分.<p>
	 *
	 */
	public void std_cont_qty(double value) {
		setConstNumber(offset + 55, $std_cont_qty, value);
	}


	/**
	 * GI location cd. 出庫場所ＣＤ.<p>
	 *
	 */
	public String gi_loc_cd() {
		return getConstString(offset + 56, $gi_loc_cd);
	}

	/**
	 * GI location cd. 出庫場所ＣＤ.<p>
	 *
	 */
	public void gi_loc_cd(String value) {
		setConstString(offset + 56, $gi_loc_cd, value);
	}


	/**
	 * GI location name 出庫場所名.<p>
	 *
	 */
	public String gi_loc_nm() {
		return getConstString(offset + 57, $gi_loc_nm);
	}

	/**
	 * GI location name 出庫場所名.<p>
	 *
	 */
	public void gi_loc_nm(String value) {
		setConstString(offset + 57, $gi_loc_nm, value);
	}


	/**
	 * GI factory/distribution warehouse cd. 出庫工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public String gi_site_cd() {
		return getConstString(offset + 58, $gi_site_cd);
	}

	/**
	 * GI factory/distribution warehouse cd. 出庫工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public void gi_site_cd(String value) {
		setConstString(offset + 58, $gi_site_cd, value);
	}


	/**
	 * GI supplier cd. 出庫発注先ＣＤ.<p>
	 *
	 */
	public String gi_sppl_cd() {
		return getConstString(offset + 59, $gi_sppl_cd);
	}

	/**
	 * GI supplier cd. 出庫発注先ＣＤ.<p>
	 *
	 */
	public void gi_sppl_cd(String value) {
		setConstString(offset + 59, $gi_sppl_cd, value);
	}


	/**
	 * GI inventory arriving point cd. 出庫在庫着荷先ＣＤ.<p>
	 *
	 */
	public String gi_stk_arrv_bp_cd() {
		return getConstString(offset + 60, $gi_stk_arrv_bp_cd);
	}

	/**
	 * GI inventory arriving point cd. 出庫在庫着荷先ＣＤ.<p>
	 *
	 */
	public void gi_stk_arrv_bp_cd(String value) {
		setConstString(offset + 60, $gi_stk_arrv_bp_cd, value);
	}


	/**
	 * GI inventory arriving point name 出庫在庫着荷先名.<p>
	 *
	 */
	public String gi_stk_arrv_bp_nm() {
		return getConstString(offset + 61, $gi_stk_arrv_bp_nm);
	}

	/**
	 * GI inventory arriving point name 出庫在庫着荷先名.<p>
	 *
	 */
	public void gi_stk_arrv_bp_nm(String value) {
		setConstString(offset + 61, $gi_stk_arrv_bp_nm, value);
	}


	/**
	 * For GI rack/line 出庫棚・ライン対象.<p>
	 *
	 */
	public boolean gi_str_ln_tgt_flg() {
		return getConstBoolean(offset + 62, $gi_str_ln_tgt_flg);
	}

	/**
	 * For GI rack/line 出庫棚・ライン対象.<p>
	 *
	 */
	public void gi_str_ln_tgt_flg(boolean value) {
		setConstBoolean(offset + 62, $gi_str_ln_tgt_flg, value);
	}


	/**
	 * GI rack/line cd. 出庫棚・ラインＣＤ.<p>
	 *
	 */
	public String gi_str_ln_cd() {
		return getConstString(offset + 63, $gi_str_ln_cd);
	}

	/**
	 * GI rack/line cd. 出庫棚・ラインＣＤ.<p>
	 *
	 */
	public void gi_str_ln_cd(String value) {
		setConstString(offset + 63, $gi_str_ln_cd, value);
	}


	/**
	 * GI rack/line name 出庫棚・ライン名.<p>
	 *
	 */
	public String gi_str_ln_nm() {
		return getConstString(offset + 64, $gi_str_ln_nm);
	}

	/**
	 * GI rack/line name 出庫棚・ライン名.<p>
	 *
	 */
	public void gi_str_ln_nm(String value) {
		setConstString(offset + 64, $gi_str_ln_nm, value);
	}


	/**
	 * Without GI rack/line 出庫棚・ライン無.<p>
	 *
	 */
	public boolean gi_str_ln_cd_none_flg() {
		return getConstBoolean(offset + 65, $gi_str_ln_cd_none_flg);
	}

	/**
	 * Without GI rack/line 出庫棚・ライン無.<p>
	 *
	 */
	public void gi_str_ln_cd_none_flg(boolean value) {
		setConstBoolean(offset + 65, $gi_str_ln_cd_none_flg, value);
	}


	/**
	 * GR rack/line cd. 入庫棚・ラインＣＤ.<p>
	 *
	 */
	public String gr_str_ln_cd() {
		return getConstString(offset + 66, $gr_str_ln_cd);
	}

	/**
	 * GR rack/line cd. 入庫棚・ラインＣＤ.<p>
	 *
	 */
	public void gr_str_ln_cd(String value) {
		setConstString(offset + 66, $gr_str_ln_cd, value);
	}


	/**
	 * GR rack/line name 入庫棚・ライン名.<p>
	 *
	 */
	public String gr_str_ln_nm() {
		return getConstString(offset + 67, $gr_str_ln_nm);
	}

	/**
	 * GR rack/line name 入庫棚・ライン名.<p>
	 *
	 */
	public void gr_str_ln_nm(String value) {
		setConstString(offset + 67, $gr_str_ln_nm, value);
	}


	/**
	 * Without GR rack/line 入庫棚・ライン無.<p>
	 *
	 */
	public boolean gr_str_ln_cd_none_flg() {
		return getConstBoolean(offset + 68, $gr_str_ln_cd_none_flg);
	}

	/**
	 * Without GR rack/line 入庫棚・ライン無.<p>
	 *
	 */
	public void gr_str_ln_cd_none_flg(boolean value) {
		setConstBoolean(offset + 68, $gr_str_ln_cd_none_flg, value);
	}


	/**
	 * Grading cd. 格付ＣＤ.<p>
	 *
	 */
	public String gd_cd() {
		return getConstString(offset + 69, $gd_cd);
	}

	/**
	 * Grading cd. 格付ＣＤ.<p>
	 *
	 */
	public void gd_cd(String value) {
		setConstString(offset + 69, $gd_cd, value);
	}


	/**
	 * Grading name 格付名.<p>
	 *
	 */
	public String gd_nm() {
		return getConstString(offset + 70, $gd_nm);
	}

	/**
	 * Grading name 格付名.<p>
	 *
	 */
	public void gd_nm(String value) {
		setConstString(offset + 70, $gd_nm, value);
	}


	/**
	 * Conforming type 良品区分.<p>
	 *
	 */
	public String quality_typ() {
		return getConstString(offset + 71, $quality_typ);
	}

	/**
	 * Conforming type 良品区分.<p>
	 *
	 */
	public void quality_typ(String value) {
		setConstString(offset + 71, $quality_typ, value);
	}


	/**
	 * Conforming type name 良品区分名.<p>
	 *
	 */
	public String quality_typ_nm() {
		return getConstString(offset + 72, $quality_typ_nm);
	}

	/**
	 * Conforming type name 良品区分名.<p>
	 *
	 */
	public void quality_typ_nm(String value) {
		setConstString(offset + 72, $quality_typ_nm, value);
	}


	/**
	 * Prohibit mixed lots ロット混在不可.<p>
	 *
	 */
	public boolean not_lot_mix_flg() {
		return getConstBoolean(offset + 73, $not_lot_mix_flg);
	}

	/**
	 * Prohibit mixed lots ロット混在不可.<p>
	 *
	 */
	public void not_lot_mix_flg(boolean value) {
		setConstBoolean(offset + 73, $not_lot_mix_flg, value);
	}


	/**
	 * Prohibit mixed sublots サブロット混在不可.<p>
	 *
	 */
	public boolean not_sublot_mix_flg() {
		return getConstBoolean(offset + 74, $not_sublot_mix_flg);
	}

	/**
	 * Prohibit mixed sublots サブロット混在不可.<p>
	 *
	 */
	public void not_sublot_mix_flg(boolean value) {
		setConstBoolean(offset + 74, $not_sublot_mix_flg, value);
	}


	/**
	 * Expiration date FROM 有効期限ＦＲＯＭ.<p>
	 *
	 */
	public MCDate vld_dt_fr() {
		return getConstDate(offset + 75, $vld_dt_fr);
	}

	/**
	 * Expiration date FROM 有効期限ＦＲＯＭ.<p>
	 *
	 */
	public void vld_dt_fr(MCDate value) {
		setConstDate(offset + 75, $vld_dt_fr, value);
	}


	/**
	 * Allow without SEIBAN No. 1 手配ＮＯ１無し可.<p>
	 *
	 */
	public boolean sno1_null_flg() {
		return getConstBoolean(offset + 76, $sno1_null_flg);
	}

	/**
	 * Allow without SEIBAN No. 1 手配ＮＯ１無し可.<p>
	 *
	 */
	public void sno1_null_flg(boolean value) {
		setConstBoolean(offset + 76, $sno1_null_flg, value);
	}


	/**
	 * SEIBAN No. 1 手配ＮＯ１.<p>
	 *
	 */
	public String sno1() {
		return getConstString(offset + 77, $sno1);
	}

	/**
	 * SEIBAN No. 1 手配ＮＯ１.<p>
	 *
	 */
	public void sno1(String value) {
		setConstString(offset + 77, $sno1, value);
	}


	/**
	 * Allow without SEIBAN No. 2 手配ＮＯ２無し可.<p>
	 *
	 */
	public boolean sno2_null_flg() {
		return getConstBoolean(offset + 78, $sno2_null_flg);
	}

	/**
	 * Allow without SEIBAN No. 2 手配ＮＯ２無し可.<p>
	 *
	 */
	public void sno2_null_flg(boolean value) {
		setConstBoolean(offset + 78, $sno2_null_flg, value);
	}


	/**
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public String sno2() {
		return getConstString(offset + 79, $sno2);
	}

	/**
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public void sno2(String value) {
		setConstString(offset + 79, $sno2, value);
	}


	/**
	 * Allow without SEIBAN No. 3 手配ＮＯ３無し可.<p>
	 *
	 */
	public boolean sno3_null_flg() {
		return getConstBoolean(offset + 80, $sno3_null_flg);
	}

	/**
	 * Allow without SEIBAN No. 3 手配ＮＯ３無し可.<p>
	 *
	 */
	public void sno3_null_flg(boolean value) {
		setConstBoolean(offset + 80, $sno3_null_flg, value);
	}


	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public String sno3() {
		return getConstString(offset + 81, $sno3);
	}

	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public void sno3(String value) {
		setConstString(offset + 81, $sno3, value);
	}


	/**
	 * Allow without SEIBAN No. 4 手配ＮＯ４無し可.<p>
	 *
	 */
	public boolean sno4_null_flg() {
		return getConstBoolean(offset + 82, $sno4_null_flg);
	}

	/**
	 * Allow without SEIBAN No. 4 手配ＮＯ４無し可.<p>
	 *
	 */
	public void sno4_null_flg(boolean value) {
		setConstBoolean(offset + 82, $sno4_null_flg, value);
	}


	/**
	 * SEIBAN No. 4 手配ＮＯ４.<p>
	 *
	 */
	public String sno4() {
		return getConstString(offset + 83, $sno4);
	}

	/**
	 * SEIBAN No. 4 手配ＮＯ４.<p>
	 *
	 */
	public void sno4(String value) {
		setConstString(offset + 83, $sno4, value);
	}


	/**
	 * Sales project No. 案件ＮＯ.<p>
	 *
	 */
	public String wrk_no() {
		return getConstString(offset + 84, $wrk_no);
	}

	/**
	 * Sales project No. 案件ＮＯ.<p>
	 *
	 */
	public void wrk_no(String value) {
		setConstString(offset + 84, $wrk_no, value);
	}


	/**
	 * Sales project name 案件名.<p>
	 *
	 */
	public String wrk_nm() {
		return getConstString(offset + 85, $wrk_nm);
	}

	/**
	 * Sales project name 案件名.<p>
	 *
	 */
	public void wrk_nm(String value) {
		setConstString(offset + 85, $wrk_nm, value);
	}


	/**
	 * Allocation SEIBAN No. 1 引当手配ＮＯ１.<p>
	 *
	 */
	public String alloc_sno1() {
		return getConstString(offset + 86, $alloc_sno1);
	}

	/**
	 * Allocation SEIBAN No. 1 引当手配ＮＯ１.<p>
	 *
	 */
	public void alloc_sno1(String value) {
		setConstString(offset + 86, $alloc_sno1, value);
	}


	/**
	 * Allocation SEIBAN No. 2 引当手配ＮＯ２.<p>
	 *
	 */
	public String alloc_sno2() {
		return getConstString(offset + 87, $alloc_sno2);
	}

	/**
	 * Allocation SEIBAN No. 2 引当手配ＮＯ２.<p>
	 *
	 */
	public void alloc_sno2(String value) {
		setConstString(offset + 87, $alloc_sno2, value);
	}


	/**
	 * Allocation SEIBAN No. 3 引当手配ＮＯ３.<p>
	 *
	 */
	public String alloc_sno3() {
		return getConstString(offset + 88, $alloc_sno3);
	}

	/**
	 * Allocation SEIBAN No. 3 引当手配ＮＯ３.<p>
	 *
	 */
	public void alloc_sno3(String value) {
		setConstString(offset + 88, $alloc_sno3, value);
	}


	/**
	 * Allocation SEIBAN No. 4 引当手配ＮＯ４.<p>
	 *
	 */
	public String alloc_sno4() {
		return getConstString(offset + 89, $alloc_sno4);
	}

	/**
	 * Allocation SEIBAN No. 4 引当手配ＮＯ４.<p>
	 *
	 */
	public void alloc_sno4(String value) {
		setConstString(offset + 89, $alloc_sno4, value);
	}


	/**
	 * Inventory identification type 在庫識別区分.<p>
	 *
	 */
	public String stk_id_typ() {
		return getConstString(offset + 90, $stk_id_typ);
	}

	/**
	 * Inventory identification type 在庫識別区分.<p>
	 *
	 */
	public void stk_id_typ(String value) {
		setConstString(offset + 90, $stk_id_typ, value);
	}


	/**
	 * Inventory identification type name 在庫識別区分名.<p>
	 *
	 */
	public String stk_id_typ_nm() {
		return getConstString(offset + 91, $stk_id_typ_nm);
	}

	/**
	 * Inventory identification type name 在庫識別区分名.<p>
	 *
	 */
	public void stk_id_typ_nm(String value) {
		setConstString(offset + 91, $stk_id_typ_nm, value);
	}


	/**
	 * Inventory BP cd. 在庫取引先ＣＤ.<p>
	 *
	 */
	public String stk_bp_cd() {
		return getConstString(offset + 92, $stk_bp_cd);
	}

	/**
	 * Inventory BP cd. 在庫取引先ＣＤ.<p>
	 *
	 */
	public void stk_bp_cd(String value) {
		setConstString(offset + 92, $stk_bp_cd, value);
	}


	/**
	 * Inventory BP name 在庫取引先名.<p>
	 *
	 */
	public String stk_bp_nm() {
		return getConstString(offset + 93, $stk_bp_nm);
	}

	/**
	 * Inventory BP name 在庫取引先名.<p>
	 *
	 */
	public void stk_bp_nm(String value) {
		setConstString(offset + 93, $stk_bp_nm, value);
	}


	/**
	 * Reason cd. 理由ＣＤ.<p>
	 *
	 */
	public String rsn_cd() {
		return getConstString(offset + 94, $rsn_cd);
	}

	/**
	 * Reason cd. 理由ＣＤ.<p>
	 *
	 */
	public void rsn_cd(String value) {
		setConstString(offset + 94, $rsn_cd, value);
	}


	/**
	 * Reason name 理由名.<p>
	 *
	 */
	public String rsn_nm() {
		return getConstString(offset + 95, $rsn_nm);
	}

	/**
	 * Reason name 理由名.<p>
	 *
	 */
	public void rsn_nm(String value) {
		setConstString(offset + 95, $rsn_nm, value);
	}


	/**
	 * Other accounting GI 他勘定出庫.<p>
	 *
	 */
	public boolean acxfr_gi_flg() {
		return getConstBoolean(offset + 96, $acxfr_gi_flg);
	}

	/**
	 * Other accounting GI 他勘定出庫.<p>
	 *
	 */
	public void acxfr_gi_flg(boolean value) {
		setConstBoolean(offset + 96, $acxfr_gi_flg, value);
	}


	/**
	 * Charged dept. cd. 負担部門ＣＤ.<p>
	 *
	 */
	public String bd_dpt_cd() {
		return getConstString(offset + 97, $bd_dpt_cd);
	}

	/**
	 * Charged dept. cd. 負担部門ＣＤ.<p>
	 *
	 */
	public void bd_dpt_cd(String value) {
		setConstString(offset + 97, $bd_dpt_cd, value);
	}


	/**
	 * Charged dept. name 負担部門名.<p>
	 *
	 */
	public String bd_dpt_nm() {
		return getConstString(offset + 98, $bd_dpt_nm);
	}

	/**
	 * Charged dept. name 負担部門名.<p>
	 *
	 */
	public void bd_dpt_nm(String value) {
		setConstString(offset + 98, $bd_dpt_nm, value);
	}


	/**
	 * Supply type 支給区分.<p>
	 *
	 */
	public String prov_typ() {
		return getConstString(offset + 99, $prov_typ);
	}

	/**
	 * Supply type 支給区分.<p>
	 *
	 */
	public void prov_typ(String value) {
		setConstString(offset + 99, $prov_typ, value);
	}


	/**
	 * Supply type name 支給区分名.<p>
	 *
	 */
	public String prov_typ_nm() {
		return getConstString(offset + 100, $prov_typ_nm);
	}

	/**
	 * Supply type name 支給区分名.<p>
	 *
	 */
	public void prov_typ_nm(String value) {
		setConstString(offset + 100, $prov_typ_nm, value);
	}


	/**
	 * Supply recording type 支給計上区分.<p>
	 *
	 */
	public String prov_basis_typ() {
		return getConstString(offset + 101, $prov_basis_typ);
	}

	/**
	 * Supply recording type 支給計上区分.<p>
	 *
	 */
	public void prov_basis_typ(String value) {
		setConstString(offset + 101, $prov_basis_typ, value);
	}


	/**
	 * Supply recording type name 支給計上区分名.<p>
	 *
	 */
	public String prov_basis_typ_nm() {
		return getConstString(offset + 102, $prov_basis_typ_nm);
	}

	/**
	 * Supply recording type name 支給計上区分名.<p>
	 *
	 */
	public void prov_basis_typ_nm(String value) {
		setConstString(offset + 102, $prov_basis_typ_nm, value);
	}


	/**
	 * Supply type (Return) 支給区分（返品）.<p>
	 *
	 */
	public String ret_prov_typ() {
		return getConstString(offset + 103, $ret_prov_typ);
	}

	/**
	 * Supply type (Return) 支給区分（返品）.<p>
	 *
	 */
	public void ret_prov_typ(String value) {
		setConstString(offset + 103, $ret_prov_typ, value);
	}


	/**
	 * Supply type name (Return) 支給区分名（返品）.<p>
	 *
	 */
	public String ret_prov_typ_nm() {
		return getConstString(offset + 104, $ret_prov_typ_nm);
	}

	/**
	 * Supply type name (Return) 支給区分名（返品）.<p>
	 *
	 */
	public void ret_prov_typ_nm(String value) {
		setConstString(offset + 104, $ret_prov_typ_nm, value);
	}


	/**
	 * Supply recording type (Return) 支給計上区分（返品）.<p>
	 *
	 */
	public String ret_prov_basis_typ() {
		return getConstString(offset + 105, $ret_prov_basis_typ);
	}

	/**
	 * Supply recording type (Return) 支給計上区分（返品）.<p>
	 *
	 */
	public void ret_prov_basis_typ(String value) {
		setConstString(offset + 105, $ret_prov_basis_typ, value);
	}


	/**
	 * Supply recording type name (Return) 支給計上区分名（返品）.<p>
	 *
	 */
	public String ret_prov_basis_typ_nm() {
		return getConstString(offset + 106, $ret_prov_basis_typ_nm);
	}

	/**
	 * Supply recording type name (Return) 支給計上区分名（返品）.<p>
	 *
	 */
	public void ret_prov_basis_typ_nm(String value) {
		setConstString(offset + 106, $ret_prov_basis_typ_nm, value);
	}


	/**
	 * Return-from delivery note No. 返品元納品書ＮＯ.<p>
	 *
	 */
	public String base_dlv_slip_no() {
		return getConstString(offset + 107, $base_dlv_slip_no);
	}

	/**
	 * Return-from delivery note No. 返品元納品書ＮＯ.<p>
	 *
	 */
	public void base_dlv_slip_no(String value) {
		setConstString(offset + 107, $base_dlv_slip_no, value);
	}


	/**
	 * Return-from supply result No. 返品元支給実績ＮＯ.<p>
	 *
	 */
	public String base_prov_act_no() {
		return getConstString(offset + 108, $base_prov_act_no);
	}

	/**
	 * Return-from supply result No. 返品元支給実績ＮＯ.<p>
	 *
	 */
	public void base_prov_act_no(String value) {
		setConstString(offset + 108, $base_prov_act_no, value);
	}


	/**
	 * Supply recording date (Base) 支給計上日（基）.<p>
	 *
	 */
	public MCDate base_ac_dt() {
		return getConstDate(offset + 109, $base_ac_dt);
	}

	/**
	 * Supply recording date (Base) 支給計上日（基）.<p>
	 *
	 */
	public void base_ac_dt(MCDate value) {
		setConstDate(offset + 109, $base_ac_dt, value);
	}


	/**
	 * WMS flg. ＷＭＳＦＬＧ.<p>
	 *
	 */
	public boolean wms_flg() {
		return getConstBoolean(offset + 110, $wms_flg);
	}

	/**
	 * WMS flg. ＷＭＳＦＬＧ.<p>
	 *
	 */
	public void wms_flg(boolean value) {
		setConstBoolean(offset + 110, $wms_flg, value);
	}


	/**
	 * Last WMS flg. 前回ＷＭＳＦＬＧ.<p>
	 *
	 */
	public boolean last_wms_flg() {
		return getConstBoolean(offset + 111, $last_wms_flg);
	}

	/**
	 * Last WMS flg. 前回ＷＭＳＦＬＧ.<p>
	 *
	 */
	public void last_wms_flg(boolean value) {
		setConstBoolean(offset + 111, $last_wms_flg, value);
	}


	/**
	 * For WMS export ＷＭＳ送信対象.<p>
	 *
	 */
	public boolean wms_tgt_flg() {
		return getConstBoolean(offset + 112, $wms_tgt_flg);
	}

	/**
	 * For WMS export ＷＭＳ送信対象.<p>
	 *
	 */
	public void wms_tgt_flg(boolean value) {
		setConstBoolean(offset + 112, $wms_tgt_flg, value);
	}


	/**
	 * Transaction details remarks 取引明細備考.<p>
	 *
	 */
	public String trd_d_rmrks() {
		return getConstString(offset + 113, $trd_d_rmrks);
	}

	/**
	 * Transaction details remarks 取引明細備考.<p>
	 *
	 */
	public void trd_d_rmrks(String value) {
		setConstString(offset + 113, $trd_d_rmrks, value);
	}


	/**
	 * Order details remarks 指図明細備考.<p>
	 *
	 */
	public String inst_d_rmrks() {
		return getConstString(offset + 114, $inst_d_rmrks);
	}

	/**
	 * Order details remarks 指図明細備考.<p>
	 *
	 */
	public void inst_d_rmrks(String value) {
		setConstString(offset + 114, $inst_d_rmrks, value);
	}


	/**
	 * Internal details remarks 内部明細備考.<p>
	 *
	 */
	public String intr_d_rmrks() {
		return getConstString(offset + 115, $intr_d_rmrks);
	}

	/**
	 * Internal details remarks 内部明細備考.<p>
	 *
	 */
	public void intr_d_rmrks(String value) {
		setConstString(offset + 115, $intr_d_rmrks, value);
	}


	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public String sub_char1() {
		return getConstString(offset + 116, $sub_char1);
	}

	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public void sub_char1(String value) {
		setConstString(offset + 116, $sub_char1, value);
	}


	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public String sub_char2() {
		return getConstString(offset + 117, $sub_char2);
	}

	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public void sub_char2(String value) {
		setConstString(offset + 117, $sub_char2, value);
	}


	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public String sub_char3() {
		return getConstString(offset + 118, $sub_char3);
	}

	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public void sub_char3(String value) {
		setConstString(offset + 118, $sub_char3, value);
	}


	/**
	 * Movement allocation status No. 移動引当状況ＮＯ.<p>
	 *
	 */
	public String xfr_alloc_sts_no() {
		return getConstString(offset + 119, $xfr_alloc_sts_no);
	}

	/**
	 * Movement allocation status No. 移動引当状況ＮＯ.<p>
	 *
	 */
	public void xfr_alloc_sts_no(String value) {
		setConstString(offset + 119, $xfr_alloc_sts_no, value);
	}


	/**
	 * Movement allocation before split status No. 分割前移動引当状況ＮＯ.<p>
	 *
	 */
	public String old_xfr_alloc_sts_no() {
		return getConstString(offset + 120, $old_xfr_alloc_sts_no);
	}

	/**
	 * Movement allocation before split status No. 分割前移動引当状況ＮＯ.<p>
	 *
	 */
	public void old_xfr_alloc_sts_no(String value) {
		setConstString(offset + 120, $old_xfr_alloc_sts_no, value);
	}


	/**
	 * Movement order No. 移動指図ＮＯ.<p>
	 *
	 */
	public String xfr_inst_no() {
		return getConstString(offset + 121, $xfr_inst_no);
	}

	/**
	 * Movement order No. 移動指図ＮＯ.<p>
	 *
	 */
	public void xfr_inst_no(String value) {
		setConstString(offset + 121, $xfr_inst_no, value);
	}


	/**
	 * Movement order details No. 移動指図明細ＮＯ.<p>
	 *
	 */
	public String xfr_inst_d_no() {
		return getConstString(offset + 122, $xfr_inst_d_no);
	}

	/**
	 * Movement order details No. 移動指図明細ＮＯ.<p>
	 *
	 */
	public void xfr_inst_d_no(String value) {
		setConstString(offset + 122, $xfr_inst_d_no, value);
	}


	/**
	 * Schedule supply No. 1 支給予定ＮＯ１.<p>
	 *
	 */
	public String prov_schd_no() {
		return getConstString(offset + 123, $prov_schd_no);
	}

	/**
	 * Schedule supply No. 1 支給予定ＮＯ１.<p>
	 *
	 */
	public void prov_schd_no(String value) {
		setConstString(offset + 123, $prov_schd_no, value);
	}


	/**
	 * Schedule supply No. 2 支給予定ＮＯ２.<p>
	 *
	 */
	public String ret_prov_schd_no() {
		return getConstString(offset + 124, $ret_prov_schd_no);
	}

	/**
	 * Schedule supply No. 2 支給予定ＮＯ２.<p>
	 *
	 */
	public void ret_prov_schd_no(String value) {
		setConstString(offset + 124, $ret_prov_schd_no, value);
	}


	/**
	 * Movement/transport schedule No. 移動・移送予定ＮＯ.<p>
	 *
	 */
	public String xfr_schd_no() {
		return getConstString(offset + 125, $xfr_schd_no);
	}

	/**
	 * Movement/transport schedule No. 移動・移送予定ＮＯ.<p>
	 *
	 */
	public void xfr_schd_no(String value) {
		setConstString(offset + 125, $xfr_schd_no, value);
	}


	/**
	 * Source movement/transport type 移動・移送元区分.<p>
	 *
	 */
	public String xfr_src_typ() {
		return getConstString(offset + 126, $xfr_src_typ);
	}

	/**
	 * Source movement/transport type 移動・移送元区分.<p>
	 *
	 */
	public void xfr_src_typ(String value) {
		setConstString(offset + 126, $xfr_src_typ, value);
	}


	/**
	 * Movement/transport source type name 移動・移送元区分名.<p>
	 *
	 */
	public String xfr_src_typ_nm() {
		return getConstString(offset + 127, $xfr_src_typ_nm);
	}

	/**
	 * Movement/transport source type name 移動・移送元区分名.<p>
	 *
	 */
	public void xfr_src_typ_nm(String value) {
		setConstString(offset + 127, $xfr_src_typ_nm, value);
	}


	/**
	 * Source movement/transport No. 移動・移送元ＮＯ.<p>
	 *
	 */
	public String xfr_src_no() {
		return getConstString(offset + 128, $xfr_src_no);
	}

	/**
	 * Source movement/transport No. 移動・移送元ＮＯ.<p>
	 *
	 */
	public void xfr_src_no(String value) {
		setConstString(offset + 128, $xfr_src_no, value);
	}


	/**
	 * Delivery note No. 納品書ＮＯ.<p>
	 *
	 */
	public String dlv_slip_no() {
		return getConstString(offset + 129, $dlv_slip_no);
	}

	/**
	 * Delivery note No. 納品書ＮＯ.<p>
	 *
	 */
	public void dlv_slip_no(String value) {
		setConstString(offset + 129, $dlv_slip_no, value);
	}


	/**
	 * Delivery note details No. 納品書明細ＮＯ.<p>
	 *
	 */
	public String dlv_slip_d_no() {
		return getConstString(offset + 130, $dlv_slip_d_no);
	}

	/**
	 * Delivery note details No. 納品書明細ＮＯ.<p>
	 *
	 */
	public void dlv_slip_d_no(String value) {
		setConstString(offset + 130, $dlv_slip_d_no, value);
	}


	/**
	 * GR/GI progress management No. 受払進捗管理ＮＯ.<p>
	 *
	 */
	public String io_schd_pr_no() {
		return getConstString(offset + 131, $io_schd_pr_no);
	}

	/**
	 * GR/GI progress management No. 受払進捗管理ＮＯ.<p>
	 *
	 */
	public void io_schd_pr_no(String value) {
		setConstString(offset + 131, $io_schd_pr_no, value);
	}


	/**
	 * Display order 表示順.<p>
	 *
	 */
	public MCNumber disp_seq() {
		return getConstNumber(offset + 132, $disp_seq);
	}

	/**
	 * Display order 表示順.<p>
	 *
	 */
	public void disp_seq(MCNumber value) {
		setConstNumber(offset + 132, $disp_seq, value);
	}

	/**
	 * Display order 表示順.<p>
	 *
	 */
	public void disp_seq(int value) {
		setConstNumber(offset + 132, $disp_seq, value);
	}

	/**
	 * Display order 表示順.<p>
	 *
	 */
	public void disp_seq(long value) {
		setConstNumber(offset + 132, $disp_seq, value);
	}

	/**
	 * Display order 表示順.<p>
	 *
	 */
	public void disp_seq(float value) {
		setConstNumber(offset + 132, $disp_seq, value);
	}

	/**
	 * Display order 表示順.<p>
	 *
	 */
	public void disp_seq(double value) {
		setConstNumber(offset + 132, $disp_seq, value);
	}


	/**
	 * Update counter (Allocation status) 更新カウンタ(引当状況).<p>
	 *
	 */
	public MCNumber alloc_sts_upd_cntr() {
		return getConstNumber(offset + 133, $alloc_sts_upd_cntr);
	}

	/**
	 * Update counter (Allocation status) 更新カウンタ(引当状況).<p>
	 *
	 */
	public void alloc_sts_upd_cntr(MCNumber value) {
		setConstNumber(offset + 133, $alloc_sts_upd_cntr, value);
	}

	/**
	 * Update counter (Allocation status) 更新カウンタ(引当状況).<p>
	 *
	 */
	public void alloc_sts_upd_cntr(int value) {
		setConstNumber(offset + 133, $alloc_sts_upd_cntr, value);
	}

	/**
	 * Update counter (Allocation status) 更新カウンタ(引当状況).<p>
	 *
	 */
	public void alloc_sts_upd_cntr(long value) {
		setConstNumber(offset + 133, $alloc_sts_upd_cntr, value);
	}

	/**
	 * Update counter (Allocation status) 更新カウンタ(引当状況).<p>
	 *
	 */
	public void alloc_sts_upd_cntr(float value) {
		setConstNumber(offset + 133, $alloc_sts_upd_cntr, value);
	}

	/**
	 * Update counter (Allocation status) 更新カウンタ(引当状況).<p>
	 *
	 */
	public void alloc_sts_upd_cntr(double value) {
		setConstNumber(offset + 133, $alloc_sts_upd_cntr, value);
	}


	/**
	 * Error エラー.<p>
	 *
	 */
	public boolean err_flg() {
		return getConstBoolean(offset + 134, $err_flg);
	}

	/**
	 * Error エラー.<p>
	 *
	 */
	public void err_flg(boolean value) {
		setConstBoolean(offset + 134, $err_flg, value);
	}


	public String getString(String name) {
		if ($pr_sts_typ.equalsIgnoreCase(name)) {
			return pr_sts_typ();
		}
		if ($pr_sts_typ_nm.equalsIgnoreCase(name)) {
			return pr_sts_typ_nm();
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
		if ($lot_no.equalsIgnoreCase(name)) {
			return lot_no();
		}
		if ($sublot_no.equalsIgnoreCase(name)) {
			return sublot_no();
		}
		if ($ver_no.equalsIgnoreCase(name)) {
			return ver_no();
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
		if ($cont_fctr_unit_cd.equalsIgnoreCase(name)) {
			return cont_fctr_unit_cd();
		}
		if ($cont_fctr_unit_nm.equalsIgnoreCase(name)) {
			return cont_fctr_unit_nm();
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
		if ($gi_stk_arrv_bp_cd.equalsIgnoreCase(name)) {
			return gi_stk_arrv_bp_cd();
		}
		if ($gi_stk_arrv_bp_nm.equalsIgnoreCase(name)) {
			return gi_stk_arrv_bp_nm();
		}
		if ($gi_str_ln_cd.equalsIgnoreCase(name)) {
			return gi_str_ln_cd();
		}
		if ($gi_str_ln_nm.equalsIgnoreCase(name)) {
			return gi_str_ln_nm();
		}
		if ($gr_str_ln_cd.equalsIgnoreCase(name)) {
			return gr_str_ln_cd();
		}
		if ($gr_str_ln_nm.equalsIgnoreCase(name)) {
			return gr_str_ln_nm();
		}
		if ($gd_cd.equalsIgnoreCase(name)) {
			return gd_cd();
		}
		if ($gd_nm.equalsIgnoreCase(name)) {
			return gd_nm();
		}
		if ($quality_typ.equalsIgnoreCase(name)) {
			return quality_typ();
		}
		if ($quality_typ_nm.equalsIgnoreCase(name)) {
			return quality_typ_nm();
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
		if ($alloc_sno1.equalsIgnoreCase(name)) {
			return alloc_sno1();
		}
		if ($alloc_sno2.equalsIgnoreCase(name)) {
			return alloc_sno2();
		}
		if ($alloc_sno3.equalsIgnoreCase(name)) {
			return alloc_sno3();
		}
		if ($alloc_sno4.equalsIgnoreCase(name)) {
			return alloc_sno4();
		}
		if ($stk_id_typ.equalsIgnoreCase(name)) {
			return stk_id_typ();
		}
		if ($stk_id_typ_nm.equalsIgnoreCase(name)) {
			return stk_id_typ_nm();
		}
		if ($stk_bp_cd.equalsIgnoreCase(name)) {
			return stk_bp_cd();
		}
		if ($stk_bp_nm.equalsIgnoreCase(name)) {
			return stk_bp_nm();
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
		if ($xfr_alloc_sts_no.equalsIgnoreCase(name)) {
			return xfr_alloc_sts_no();
		}
		if ($old_xfr_alloc_sts_no.equalsIgnoreCase(name)) {
			return old_xfr_alloc_sts_no();
		}
		if ($xfr_inst_no.equalsIgnoreCase(name)) {
			return xfr_inst_no();
		}
		if ($xfr_inst_d_no.equalsIgnoreCase(name)) {
			return xfr_inst_d_no();
		}
		if ($prov_schd_no.equalsIgnoreCase(name)) {
			return prov_schd_no();
		}
		if ($ret_prov_schd_no.equalsIgnoreCase(name)) {
			return ret_prov_schd_no();
		}
		if ($xfr_schd_no.equalsIgnoreCase(name)) {
			return xfr_schd_no();
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
		if ($dlv_slip_no.equalsIgnoreCase(name)) {
			return dlv_slip_no();
		}
		if ($dlv_slip_d_no.equalsIgnoreCase(name)) {
			return dlv_slip_d_no();
		}
		if ($io_schd_pr_no.equalsIgnoreCase(name)) {
			return io_schd_pr_no();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			return trd_unit_conv_base_qty();
		}
		if ($trd_unit_conv_qty.equalsIgnoreCase(name)) {
			return trd_unit_conv_qty();
		}
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			return trd_unit_dec_place();
		}
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			return trd_unit_qty();
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			return base_unit_dec_place();
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			return base_unit_qty();
		}
		if ($base_unit_act_qty.equalsIgnoreCase(name)) {
			return base_unit_act_qty();
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
		if ($pckg_unit_qty.equalsIgnoreCase(name)) {
			return pckg_unit_qty();
		}
		if ($schd_unit_dec_place.equalsIgnoreCase(name)) {
			return schd_unit_dec_place();
		}
		if ($schd_qty.equalsIgnoreCase(name)) {
			return schd_qty();
		}
		if ($cont_fctr_dec_place.equalsIgnoreCase(name)) {
			return cont_fctr_dec_place();
		}
		if ($act_cont_fctr.equalsIgnoreCase(name)) {
			return act_cont_fctr();
		}
		if ($act_cont_qty.equalsIgnoreCase(name)) {
			return act_cont_qty();
		}
		if ($std_cont_fctr.equalsIgnoreCase(name)) {
			return std_cont_fctr();
		}
		if ($std_cont_qty.equalsIgnoreCase(name)) {
			return std_cont_qty();
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			return disp_seq();
		}
		if ($alloc_sts_upd_cntr.equalsIgnoreCase(name)) {
			return alloc_sts_upd_cntr();
		}
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		if ($vld_dt_fr.equalsIgnoreCase(name)) {
			return vld_dt_fr();
		}
		if ($base_ac_dt.equalsIgnoreCase(name)) {
			return base_ac_dt();
		}
		return super.getDate(name);
	}
	public boolean getBoolean(String name) {
		if ($alloc_flg.equalsIgnoreCase(name)) {
			return alloc_flg();
		}
		if ($lot_none_flg.equalsIgnoreCase(name)) {
			return lot_none_flg();
		}
		if ($skip_chk_ship_flg.equalsIgnoreCase(name)) {
			return skip_chk_ship_flg();
		}
		if ($def_ver_flg.equalsIgnoreCase(name)) {
			return def_ver_flg();
		}
		if ($abort_flg.equalsIgnoreCase(name)) {
			return abort_flg();
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
		if ($gi_str_ln_cd_none_flg.equalsIgnoreCase(name)) {
			return gi_str_ln_cd_none_flg();
		}
		if ($gr_str_ln_cd_none_flg.equalsIgnoreCase(name)) {
			return gr_str_ln_cd_none_flg();
		}
		if ($not_lot_mix_flg.equalsIgnoreCase(name)) {
			return not_lot_mix_flg();
		}
		if ($not_sublot_mix_flg.equalsIgnoreCase(name)) {
			return not_sublot_mix_flg();
		}
		if ($sno1_null_flg.equalsIgnoreCase(name)) {
			return sno1_null_flg();
		}
		if ($sno2_null_flg.equalsIgnoreCase(name)) {
			return sno2_null_flg();
		}
		if ($sno3_null_flg.equalsIgnoreCase(name)) {
			return sno3_null_flg();
		}
		if ($sno4_null_flg.equalsIgnoreCase(name)) {
			return sno4_null_flg();
		}
		if ($acxfr_gi_flg.equalsIgnoreCase(name)) {
			return acxfr_gi_flg();
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
		if ($err_flg.equalsIgnoreCase(name)) {
			return err_flg();
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
		if ($lot_no.equalsIgnoreCase(name)) {
			return lot_no();
		}
		if ($sublot_no.equalsIgnoreCase(name)) {
			return sublot_no();
		}
		if ($ver_no.equalsIgnoreCase(name)) {
			return ver_no();
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
		if ($cont_fctr_unit_cd.equalsIgnoreCase(name)) {
			return cont_fctr_unit_cd();
		}
		if ($cont_fctr_unit_nm.equalsIgnoreCase(name)) {
			return cont_fctr_unit_nm();
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
		if ($gi_stk_arrv_bp_cd.equalsIgnoreCase(name)) {
			return gi_stk_arrv_bp_cd();
		}
		if ($gi_stk_arrv_bp_nm.equalsIgnoreCase(name)) {
			return gi_stk_arrv_bp_nm();
		}
		if ($gi_str_ln_cd.equalsIgnoreCase(name)) {
			return gi_str_ln_cd();
		}
		if ($gi_str_ln_nm.equalsIgnoreCase(name)) {
			return gi_str_ln_nm();
		}
		if ($gr_str_ln_cd.equalsIgnoreCase(name)) {
			return gr_str_ln_cd();
		}
		if ($gr_str_ln_nm.equalsIgnoreCase(name)) {
			return gr_str_ln_nm();
		}
		if ($gd_cd.equalsIgnoreCase(name)) {
			return gd_cd();
		}
		if ($gd_nm.equalsIgnoreCase(name)) {
			return gd_nm();
		}
		if ($quality_typ.equalsIgnoreCase(name)) {
			return quality_typ();
		}
		if ($quality_typ_nm.equalsIgnoreCase(name)) {
			return quality_typ_nm();
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
		if ($alloc_sno1.equalsIgnoreCase(name)) {
			return alloc_sno1();
		}
		if ($alloc_sno2.equalsIgnoreCase(name)) {
			return alloc_sno2();
		}
		if ($alloc_sno3.equalsIgnoreCase(name)) {
			return alloc_sno3();
		}
		if ($alloc_sno4.equalsIgnoreCase(name)) {
			return alloc_sno4();
		}
		if ($stk_id_typ.equalsIgnoreCase(name)) {
			return stk_id_typ();
		}
		if ($stk_id_typ_nm.equalsIgnoreCase(name)) {
			return stk_id_typ_nm();
		}
		if ($stk_bp_cd.equalsIgnoreCase(name)) {
			return stk_bp_cd();
		}
		if ($stk_bp_nm.equalsIgnoreCase(name)) {
			return stk_bp_nm();
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
		if ($xfr_alloc_sts_no.equalsIgnoreCase(name)) {
			return xfr_alloc_sts_no();
		}
		if ($old_xfr_alloc_sts_no.equalsIgnoreCase(name)) {
			return old_xfr_alloc_sts_no();
		}
		if ($xfr_inst_no.equalsIgnoreCase(name)) {
			return xfr_inst_no();
		}
		if ($xfr_inst_d_no.equalsIgnoreCase(name)) {
			return xfr_inst_d_no();
		}
		if ($prov_schd_no.equalsIgnoreCase(name)) {
			return prov_schd_no();
		}
		if ($ret_prov_schd_no.equalsIgnoreCase(name)) {
			return ret_prov_schd_no();
		}
		if ($xfr_schd_no.equalsIgnoreCase(name)) {
			return xfr_schd_no();
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
		if ($dlv_slip_no.equalsIgnoreCase(name)) {
			return dlv_slip_no();
		}
		if ($dlv_slip_d_no.equalsIgnoreCase(name)) {
			return dlv_slip_d_no();
		}
		if ($io_schd_pr_no.equalsIgnoreCase(name)) {
			return io_schd_pr_no();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			return trd_unit_conv_base_qty();
		}
		if ($trd_unit_conv_qty.equalsIgnoreCase(name)) {
			return trd_unit_conv_qty();
		}
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			return trd_unit_dec_place();
		}
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			return trd_unit_qty();
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			return base_unit_dec_place();
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			return base_unit_qty();
		}
		if ($base_unit_act_qty.equalsIgnoreCase(name)) {
			return base_unit_act_qty();
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
		if ($pckg_unit_qty.equalsIgnoreCase(name)) {
			return pckg_unit_qty();
		}
		if ($schd_unit_dec_place.equalsIgnoreCase(name)) {
			return schd_unit_dec_place();
		}
		if ($schd_qty.equalsIgnoreCase(name)) {
			return schd_qty();
		}
		if ($cont_fctr_dec_place.equalsIgnoreCase(name)) {
			return cont_fctr_dec_place();
		}
		if ($act_cont_fctr.equalsIgnoreCase(name)) {
			return act_cont_fctr();
		}
		if ($act_cont_qty.equalsIgnoreCase(name)) {
			return act_cont_qty();
		}
		if ($std_cont_fctr.equalsIgnoreCase(name)) {
			return std_cont_fctr();
		}
		if ($std_cont_qty.equalsIgnoreCase(name)) {
			return std_cont_qty();
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			return disp_seq();
		}
		if ($alloc_sts_upd_cntr.equalsIgnoreCase(name)) {
			return alloc_sts_upd_cntr();
		}
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($vld_dt_fr.equalsIgnoreCase(name)) {
			return vld_dt_fr();
		}
		if ($base_ac_dt.equalsIgnoreCase(name)) {
			return base_ac_dt();
		}
		return super.getDateNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($alloc_flg.equalsIgnoreCase(name)) {
			return alloc_flg();
		}
		if ($lot_none_flg.equalsIgnoreCase(name)) {
			return lot_none_flg();
		}
		if ($skip_chk_ship_flg.equalsIgnoreCase(name)) {
			return skip_chk_ship_flg();
		}
		if ($def_ver_flg.equalsIgnoreCase(name)) {
			return def_ver_flg();
		}
		if ($abort_flg.equalsIgnoreCase(name)) {
			return abort_flg();
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
		if ($gi_str_ln_cd_none_flg.equalsIgnoreCase(name)) {
			return gi_str_ln_cd_none_flg();
		}
		if ($gr_str_ln_cd_none_flg.equalsIgnoreCase(name)) {
			return gr_str_ln_cd_none_flg();
		}
		if ($not_lot_mix_flg.equalsIgnoreCase(name)) {
			return not_lot_mix_flg();
		}
		if ($not_sublot_mix_flg.equalsIgnoreCase(name)) {
			return not_sublot_mix_flg();
		}
		if ($sno1_null_flg.equalsIgnoreCase(name)) {
			return sno1_null_flg();
		}
		if ($sno2_null_flg.equalsIgnoreCase(name)) {
			return sno2_null_flg();
		}
		if ($sno3_null_flg.equalsIgnoreCase(name)) {
			return sno3_null_flg();
		}
		if ($sno4_null_flg.equalsIgnoreCase(name)) {
			return sno4_null_flg();
		}
		if ($acxfr_gi_flg.equalsIgnoreCase(name)) {
			return acxfr_gi_flg();
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
		if ($err_flg.equalsIgnoreCase(name)) {
			return err_flg();
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
		if ($cont_fctr_unit_cd.equalsIgnoreCase(name)) {
			cont_fctr_unit_cd(value);
			return;
		}
		if ($cont_fctr_unit_nm.equalsIgnoreCase(name)) {
			cont_fctr_unit_nm(value);
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
		if ($gi_stk_arrv_bp_cd.equalsIgnoreCase(name)) {
			gi_stk_arrv_bp_cd(value);
			return;
		}
		if ($gi_stk_arrv_bp_nm.equalsIgnoreCase(name)) {
			gi_stk_arrv_bp_nm(value);
			return;
		}
		if ($gi_str_ln_cd.equalsIgnoreCase(name)) {
			gi_str_ln_cd(value);
			return;
		}
		if ($gi_str_ln_nm.equalsIgnoreCase(name)) {
			gi_str_ln_nm(value);
			return;
		}
		if ($gr_str_ln_cd.equalsIgnoreCase(name)) {
			gr_str_ln_cd(value);
			return;
		}
		if ($gr_str_ln_nm.equalsIgnoreCase(name)) {
			gr_str_ln_nm(value);
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
		if ($quality_typ.equalsIgnoreCase(name)) {
			quality_typ(value);
			return;
		}
		if ($quality_typ_nm.equalsIgnoreCase(name)) {
			quality_typ_nm(value);
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
		if ($alloc_sno1.equalsIgnoreCase(name)) {
			alloc_sno1(value);
			return;
		}
		if ($alloc_sno2.equalsIgnoreCase(name)) {
			alloc_sno2(value);
			return;
		}
		if ($alloc_sno3.equalsIgnoreCase(name)) {
			alloc_sno3(value);
			return;
		}
		if ($alloc_sno4.equalsIgnoreCase(name)) {
			alloc_sno4(value);
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
		if ($stk_bp_cd.equalsIgnoreCase(name)) {
			stk_bp_cd(value);
			return;
		}
		if ($stk_bp_nm.equalsIgnoreCase(name)) {
			stk_bp_nm(value);
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
		if ($xfr_alloc_sts_no.equalsIgnoreCase(name)) {
			xfr_alloc_sts_no(value);
			return;
		}
		if ($old_xfr_alloc_sts_no.equalsIgnoreCase(name)) {
			old_xfr_alloc_sts_no(value);
			return;
		}
		if ($xfr_inst_no.equalsIgnoreCase(name)) {
			xfr_inst_no(value);
			return;
		}
		if ($xfr_inst_d_no.equalsIgnoreCase(name)) {
			xfr_inst_d_no(value);
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
		if ($xfr_schd_no.equalsIgnoreCase(name)) {
			xfr_schd_no(value);
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
		if ($dlv_slip_no.equalsIgnoreCase(name)) {
			dlv_slip_no(value);
			return;
		}
		if ($dlv_slip_d_no.equalsIgnoreCase(name)) {
			dlv_slip_d_no(value);
			return;
		}
		if ($io_schd_pr_no.equalsIgnoreCase(name)) {
			io_schd_pr_no(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
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
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
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
		if ($base_unit_act_qty.equalsIgnoreCase(name)) {
			base_unit_act_qty(value);
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
		if ($pckg_unit_qty.equalsIgnoreCase(name)) {
			pckg_unit_qty(value);
			return;
		}
		if ($schd_unit_dec_place.equalsIgnoreCase(name)) {
			schd_unit_dec_place(value);
			return;
		}
		if ($schd_qty.equalsIgnoreCase(name)) {
			schd_qty(value);
			return;
		}
		if ($cont_fctr_dec_place.equalsIgnoreCase(name)) {
			cont_fctr_dec_place(value);
			return;
		}
		if ($act_cont_fctr.equalsIgnoreCase(name)) {
			act_cont_fctr(value);
			return;
		}
		if ($act_cont_qty.equalsIgnoreCase(name)) {
			act_cont_qty(value);
			return;
		}
		if ($std_cont_fctr.equalsIgnoreCase(name)) {
			std_cont_fctr(value);
			return;
		}
		if ($std_cont_qty.equalsIgnoreCase(name)) {
			std_cont_qty(value);
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
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
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
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
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
		if ($base_unit_act_qty.equalsIgnoreCase(name)) {
			base_unit_act_qty(value);
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
		if ($pckg_unit_qty.equalsIgnoreCase(name)) {
			pckg_unit_qty(value);
			return;
		}
		if ($schd_unit_dec_place.equalsIgnoreCase(name)) {
			schd_unit_dec_place(value);
			return;
		}
		if ($schd_qty.equalsIgnoreCase(name)) {
			schd_qty(value);
			return;
		}
		if ($cont_fctr_dec_place.equalsIgnoreCase(name)) {
			cont_fctr_dec_place(value);
			return;
		}
		if ($act_cont_fctr.equalsIgnoreCase(name)) {
			act_cont_fctr(value);
			return;
		}
		if ($act_cont_qty.equalsIgnoreCase(name)) {
			act_cont_qty(value);
			return;
		}
		if ($std_cont_fctr.equalsIgnoreCase(name)) {
			std_cont_fctr(value);
			return;
		}
		if ($std_cont_qty.equalsIgnoreCase(name)) {
			std_cont_qty(value);
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
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
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
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
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
		if ($base_unit_act_qty.equalsIgnoreCase(name)) {
			base_unit_act_qty(value);
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
		if ($pckg_unit_qty.equalsIgnoreCase(name)) {
			pckg_unit_qty(value);
			return;
		}
		if ($schd_unit_dec_place.equalsIgnoreCase(name)) {
			schd_unit_dec_place(value);
			return;
		}
		if ($schd_qty.equalsIgnoreCase(name)) {
			schd_qty(value);
			return;
		}
		if ($cont_fctr_dec_place.equalsIgnoreCase(name)) {
			cont_fctr_dec_place(value);
			return;
		}
		if ($act_cont_fctr.equalsIgnoreCase(name)) {
			act_cont_fctr(value);
			return;
		}
		if ($act_cont_qty.equalsIgnoreCase(name)) {
			act_cont_qty(value);
			return;
		}
		if ($std_cont_fctr.equalsIgnoreCase(name)) {
			std_cont_fctr(value);
			return;
		}
		if ($std_cont_qty.equalsIgnoreCase(name)) {
			std_cont_qty(value);
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
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
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
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
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
		if ($base_unit_act_qty.equalsIgnoreCase(name)) {
			base_unit_act_qty(value);
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
		if ($pckg_unit_qty.equalsIgnoreCase(name)) {
			pckg_unit_qty(value);
			return;
		}
		if ($schd_unit_dec_place.equalsIgnoreCase(name)) {
			schd_unit_dec_place(value);
			return;
		}
		if ($schd_qty.equalsIgnoreCase(name)) {
			schd_qty(value);
			return;
		}
		if ($cont_fctr_dec_place.equalsIgnoreCase(name)) {
			cont_fctr_dec_place(value);
			return;
		}
		if ($act_cont_fctr.equalsIgnoreCase(name)) {
			act_cont_fctr(value);
			return;
		}
		if ($act_cont_qty.equalsIgnoreCase(name)) {
			act_cont_qty(value);
			return;
		}
		if ($std_cont_fctr.equalsIgnoreCase(name)) {
			std_cont_fctr(value);
			return;
		}
		if ($std_cont_qty.equalsIgnoreCase(name)) {
			std_cont_qty(value);
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
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
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
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
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
		if ($base_unit_act_qty.equalsIgnoreCase(name)) {
			base_unit_act_qty(value);
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
		if ($pckg_unit_qty.equalsIgnoreCase(name)) {
			pckg_unit_qty(value);
			return;
		}
		if ($schd_unit_dec_place.equalsIgnoreCase(name)) {
			schd_unit_dec_place(value);
			return;
		}
		if ($schd_qty.equalsIgnoreCase(name)) {
			schd_qty(value);
			return;
		}
		if ($cont_fctr_dec_place.equalsIgnoreCase(name)) {
			cont_fctr_dec_place(value);
			return;
		}
		if ($act_cont_fctr.equalsIgnoreCase(name)) {
			act_cont_fctr(value);
			return;
		}
		if ($act_cont_qty.equalsIgnoreCase(name)) {
			act_cont_qty(value);
			return;
		}
		if ($std_cont_fctr.equalsIgnoreCase(name)) {
			std_cont_fctr(value);
			return;
		}
		if ($std_cont_qty.equalsIgnoreCase(name)) {
			std_cont_qty(value);
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
		super.setNumber(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($vld_dt_fr.equalsIgnoreCase(name)) {
			vld_dt_fr(value);
			return;
		}
		if ($base_ac_dt.equalsIgnoreCase(name)) {
			base_ac_dt(value);
			return;
		}
		super.setDate(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($alloc_flg.equalsIgnoreCase(name)) {
			alloc_flg(value);
			return;
		}
		if ($lot_none_flg.equalsIgnoreCase(name)) {
			lot_none_flg(value);
			return;
		}
		if ($skip_chk_ship_flg.equalsIgnoreCase(name)) {
			skip_chk_ship_flg(value);
			return;
		}
		if ($def_ver_flg.equalsIgnoreCase(name)) {
			def_ver_flg(value);
			return;
		}
		if ($abort_flg.equalsIgnoreCase(name)) {
			abort_flg(value);
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
		if ($gi_str_ln_cd_none_flg.equalsIgnoreCase(name)) {
			gi_str_ln_cd_none_flg(value);
			return;
		}
		if ($gr_str_ln_cd_none_flg.equalsIgnoreCase(name)) {
			gr_str_ln_cd_none_flg(value);
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
		if ($sno1_null_flg.equalsIgnoreCase(name)) {
			sno1_null_flg(value);
			return;
		}
		if ($sno2_null_flg.equalsIgnoreCase(name)) {
			sno2_null_flg(value);
			return;
		}
		if ($sno3_null_flg.equalsIgnoreCase(name)) {
			sno3_null_flg(value);
			return;
		}
		if ($sno4_null_flg.equalsIgnoreCase(name)) {
			sno4_null_flg(value);
			return;
		}
		if ($acxfr_gi_flg.equalsIgnoreCase(name)) {
			acxfr_gi_flg(value);
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
		if ($err_flg.equalsIgnoreCase(name)) {
			err_flg(value);
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
		if ($cont_fctr_unit_cd.equalsIgnoreCase(name)) {
			cont_fctr_unit_cd(value);
			return;
		}
		if ($cont_fctr_unit_nm.equalsIgnoreCase(name)) {
			cont_fctr_unit_nm(value);
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
		if ($gi_stk_arrv_bp_cd.equalsIgnoreCase(name)) {
			gi_stk_arrv_bp_cd(value);
			return;
		}
		if ($gi_stk_arrv_bp_nm.equalsIgnoreCase(name)) {
			gi_stk_arrv_bp_nm(value);
			return;
		}
		if ($gi_str_ln_cd.equalsIgnoreCase(name)) {
			gi_str_ln_cd(value);
			return;
		}
		if ($gi_str_ln_nm.equalsIgnoreCase(name)) {
			gi_str_ln_nm(value);
			return;
		}
		if ($gr_str_ln_cd.equalsIgnoreCase(name)) {
			gr_str_ln_cd(value);
			return;
		}
		if ($gr_str_ln_nm.equalsIgnoreCase(name)) {
			gr_str_ln_nm(value);
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
		if ($quality_typ.equalsIgnoreCase(name)) {
			quality_typ(value);
			return;
		}
		if ($quality_typ_nm.equalsIgnoreCase(name)) {
			quality_typ_nm(value);
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
		if ($alloc_sno1.equalsIgnoreCase(name)) {
			alloc_sno1(value);
			return;
		}
		if ($alloc_sno2.equalsIgnoreCase(name)) {
			alloc_sno2(value);
			return;
		}
		if ($alloc_sno3.equalsIgnoreCase(name)) {
			alloc_sno3(value);
			return;
		}
		if ($alloc_sno4.equalsIgnoreCase(name)) {
			alloc_sno4(value);
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
		if ($stk_bp_cd.equalsIgnoreCase(name)) {
			stk_bp_cd(value);
			return;
		}
		if ($stk_bp_nm.equalsIgnoreCase(name)) {
			stk_bp_nm(value);
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
		if ($xfr_alloc_sts_no.equalsIgnoreCase(name)) {
			xfr_alloc_sts_no(value);
			return;
		}
		if ($old_xfr_alloc_sts_no.equalsIgnoreCase(name)) {
			old_xfr_alloc_sts_no(value);
			return;
		}
		if ($xfr_inst_no.equalsIgnoreCase(name)) {
			xfr_inst_no(value);
			return;
		}
		if ($xfr_inst_d_no.equalsIgnoreCase(name)) {
			xfr_inst_d_no(value);
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
		if ($xfr_schd_no.equalsIgnoreCase(name)) {
			xfr_schd_no(value);
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
		if ($dlv_slip_no.equalsIgnoreCase(name)) {
			dlv_slip_no(value);
			return;
		}
		if ($dlv_slip_d_no.equalsIgnoreCase(name)) {
			dlv_slip_d_no(value);
			return;
		}
		if ($io_schd_pr_no.equalsIgnoreCase(name)) {
			io_schd_pr_no(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
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
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
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
		if ($base_unit_act_qty.equalsIgnoreCase(name)) {
			base_unit_act_qty(value);
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
		if ($pckg_unit_qty.equalsIgnoreCase(name)) {
			pckg_unit_qty(value);
			return;
		}
		if ($schd_unit_dec_place.equalsIgnoreCase(name)) {
			schd_unit_dec_place(value);
			return;
		}
		if ($schd_qty.equalsIgnoreCase(name)) {
			schd_qty(value);
			return;
		}
		if ($cont_fctr_dec_place.equalsIgnoreCase(name)) {
			cont_fctr_dec_place(value);
			return;
		}
		if ($act_cont_fctr.equalsIgnoreCase(name)) {
			act_cont_fctr(value);
			return;
		}
		if ($act_cont_qty.equalsIgnoreCase(name)) {
			act_cont_qty(value);
			return;
		}
		if ($std_cont_fctr.equalsIgnoreCase(name)) {
			std_cont_fctr(value);
			return;
		}
		if ($std_cont_qty.equalsIgnoreCase(name)) {
			std_cont_qty(value);
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
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
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
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
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
		if ($base_unit_act_qty.equalsIgnoreCase(name)) {
			base_unit_act_qty(value);
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
		if ($pckg_unit_qty.equalsIgnoreCase(name)) {
			pckg_unit_qty(value);
			return;
		}
		if ($schd_unit_dec_place.equalsIgnoreCase(name)) {
			schd_unit_dec_place(value);
			return;
		}
		if ($schd_qty.equalsIgnoreCase(name)) {
			schd_qty(value);
			return;
		}
		if ($cont_fctr_dec_place.equalsIgnoreCase(name)) {
			cont_fctr_dec_place(value);
			return;
		}
		if ($act_cont_fctr.equalsIgnoreCase(name)) {
			act_cont_fctr(value);
			return;
		}
		if ($act_cont_qty.equalsIgnoreCase(name)) {
			act_cont_qty(value);
			return;
		}
		if ($std_cont_fctr.equalsIgnoreCase(name)) {
			std_cont_fctr(value);
			return;
		}
		if ($std_cont_qty.equalsIgnoreCase(name)) {
			std_cont_qty(value);
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
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
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
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
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
		if ($base_unit_act_qty.equalsIgnoreCase(name)) {
			base_unit_act_qty(value);
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
		if ($pckg_unit_qty.equalsIgnoreCase(name)) {
			pckg_unit_qty(value);
			return;
		}
		if ($schd_unit_dec_place.equalsIgnoreCase(name)) {
			schd_unit_dec_place(value);
			return;
		}
		if ($schd_qty.equalsIgnoreCase(name)) {
			schd_qty(value);
			return;
		}
		if ($cont_fctr_dec_place.equalsIgnoreCase(name)) {
			cont_fctr_dec_place(value);
			return;
		}
		if ($act_cont_fctr.equalsIgnoreCase(name)) {
			act_cont_fctr(value);
			return;
		}
		if ($act_cont_qty.equalsIgnoreCase(name)) {
			act_cont_qty(value);
			return;
		}
		if ($std_cont_fctr.equalsIgnoreCase(name)) {
			std_cont_fctr(value);
			return;
		}
		if ($std_cont_qty.equalsIgnoreCase(name)) {
			std_cont_qty(value);
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
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
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
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
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
		if ($base_unit_act_qty.equalsIgnoreCase(name)) {
			base_unit_act_qty(value);
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
		if ($pckg_unit_qty.equalsIgnoreCase(name)) {
			pckg_unit_qty(value);
			return;
		}
		if ($schd_unit_dec_place.equalsIgnoreCase(name)) {
			schd_unit_dec_place(value);
			return;
		}
		if ($schd_qty.equalsIgnoreCase(name)) {
			schd_qty(value);
			return;
		}
		if ($cont_fctr_dec_place.equalsIgnoreCase(name)) {
			cont_fctr_dec_place(value);
			return;
		}
		if ($act_cont_fctr.equalsIgnoreCase(name)) {
			act_cont_fctr(value);
			return;
		}
		if ($act_cont_qty.equalsIgnoreCase(name)) {
			act_cont_qty(value);
			return;
		}
		if ($std_cont_fctr.equalsIgnoreCase(name)) {
			std_cont_fctr(value);
			return;
		}
		if ($std_cont_qty.equalsIgnoreCase(name)) {
			std_cont_qty(value);
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
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
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
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
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
		if ($base_unit_act_qty.equalsIgnoreCase(name)) {
			base_unit_act_qty(value);
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
		if ($pckg_unit_qty.equalsIgnoreCase(name)) {
			pckg_unit_qty(value);
			return;
		}
		if ($schd_unit_dec_place.equalsIgnoreCase(name)) {
			schd_unit_dec_place(value);
			return;
		}
		if ($schd_qty.equalsIgnoreCase(name)) {
			schd_qty(value);
			return;
		}
		if ($cont_fctr_dec_place.equalsIgnoreCase(name)) {
			cont_fctr_dec_place(value);
			return;
		}
		if ($act_cont_fctr.equalsIgnoreCase(name)) {
			act_cont_fctr(value);
			return;
		}
		if ($act_cont_qty.equalsIgnoreCase(name)) {
			act_cont_qty(value);
			return;
		}
		if ($std_cont_fctr.equalsIgnoreCase(name)) {
			std_cont_fctr(value);
			return;
		}
		if ($std_cont_qty.equalsIgnoreCase(name)) {
			std_cont_qty(value);
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
		super.setNumberNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($vld_dt_fr.equalsIgnoreCase(name)) {
			vld_dt_fr(value);
			return;
		}
		if ($base_ac_dt.equalsIgnoreCase(name)) {
			base_ac_dt(value);
			return;
		}
		super.setDateNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($alloc_flg.equalsIgnoreCase(name)) {
			alloc_flg(value);
			return;
		}
		if ($lot_none_flg.equalsIgnoreCase(name)) {
			lot_none_flg(value);
			return;
		}
		if ($skip_chk_ship_flg.equalsIgnoreCase(name)) {
			skip_chk_ship_flg(value);
			return;
		}
		if ($def_ver_flg.equalsIgnoreCase(name)) {
			def_ver_flg(value);
			return;
		}
		if ($abort_flg.equalsIgnoreCase(name)) {
			abort_flg(value);
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
		if ($gi_str_ln_cd_none_flg.equalsIgnoreCase(name)) {
			gi_str_ln_cd_none_flg(value);
			return;
		}
		if ($gr_str_ln_cd_none_flg.equalsIgnoreCase(name)) {
			gr_str_ln_cd_none_flg(value);
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
		if ($sno1_null_flg.equalsIgnoreCase(name)) {
			sno1_null_flg(value);
			return;
		}
		if ($sno2_null_flg.equalsIgnoreCase(name)) {
			sno2_null_flg(value);
			return;
		}
		if ($sno3_null_flg.equalsIgnoreCase(name)) {
			sno3_null_flg(value);
			return;
		}
		if ($sno4_null_flg.equalsIgnoreCase(name)) {
			sno4_null_flg(value);
			return;
		}
		if ($acxfr_gi_flg.equalsIgnoreCase(name)) {
			acxfr_gi_flg(value);
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
		if ($err_flg.equalsIgnoreCase(name)) {
			err_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

