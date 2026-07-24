package mcframe.serverMSBE.MSBEL5530;

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
 * ブロック"ShipInst_Chk01_Dtl"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class ShipInst_Chk01_DtlR_MC_A extends MCConstRow {

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public static final String $peg_no = "peg_no";
	/**
	 * Error flg. エラーＦＬＧ.<p>
	 *
	 */
	public static final String $err_flg = "err_flg";
	/**
	 * Data update type データ更新区分.<p>
	 *
	 */
	public static final String $data_crud_typ = "data_crud_typ";
	/**
	 * Temporary order details No. 仮指図明細ＮＯ.<p>
	 *
	 */
	public static final String $tmp_inst_d_no = "tmp_inst_d_no";
	/**
	 * Shipping order details No. 出荷指図明細ＮＯ.<p>
	 *
	 */
	public static final String $ship_inst_d_no = "ship_inst_d_no";
	/**
	 * Shipping order No. 出荷指図ＮＯ.<p>
	 *
	 */
	public static final String $ship_inst_no = "ship_inst_no";
	/**
	 * Display order 表示順.<p>
	 *
	 */
	public static final String $disp_seq = "disp_seq";
	/**
	 * Shipping location cd. 出荷場所ＣＤ.<p>
	 *
	 */
	public static final String $ship_loc_cd = "ship_loc_cd";
	/**
	 * Shipping rack/line cd. 出荷棚・ラインＣＤ.<p>
	 *
	 */
	public static final String $ship_str_ln_cd = "ship_str_ln_cd";
	/**
	 * Shipping distribution group cd. 出荷物流グループＣＤ.<p>
	 *
	 */
	public static final String $ship_lg_grp_cd = "ship_lg_grp_cd";
	/**
	 * Allocation location cd. 引当場所ＣＤ.<p>
	 *
	 */
	public static final String $alloc_loc_cd = "alloc_loc_cd";
	/**
	 * Allocation rack/line cd. 引当棚・ラインＣＤ.<p>
	 *
	 */
	public static final String $alloc_str_ln_cd = "alloc_str_ln_cd";
	/**
	 * Delivery rack/line cd. 納品棚・ラインＣＤ.<p>
	 *
	 */
	public static final String $dlv_str_ln_cd = "dlv_str_ln_cd";
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
	 * Miscellaneous item flg. 諸口品ＦＬＧ.<p>
	 *
	 */
	public static final String $sundry_itm_flg = "sundry_itm_flg";
	/**
	 * SEIBAN No. 1 手配ＮＯ１.<p>
	 *
	 */
	public static final String $sno1 = "sno1";
	/**
	 * Allow without SEIBAN No. 1 flg. 手配ＮＯ１無し可ＦＬＧ.<p>
	 *
	 */
	public static final String $sno1_null_flg = "sno1_null_flg";
	/**
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public static final String $sno2 = "sno2";
	/**
	 * Allow without SEIBAN No. 2 flg. 手配ＮＯ２無し可ＦＬＧ.<p>
	 *
	 */
	public static final String $sno2_null_flg = "sno2_null_flg";
	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public static final String $sno3 = "sno3";
	/**
	 * Allow without SEIBAN No. 3 flg. 手配ＮＯ３無し可ＦＬＧ.<p>
	 *
	 */
	public static final String $sno3_null_flg = "sno3_null_flg";
	/**
	 * SEIBAN No. 4 手配ＮＯ４.<p>
	 *
	 */
	public static final String $sno4 = "sno4";
	/**
	 * Allow without SEIBAN No. 4 flg. 手配ＮＯ４無し可ＦＬＧ.<p>
	 *
	 */
	public static final String $sno4_null_flg = "sno4_null_flg";
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
	 * Without lot ロット指定無.<p>
	 *
	 */
	public static final String $lot_none_flg = "lot_none_flg";
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
	 * Version No. 版ＮＯ.<p>
	 *
	 */
	public static final String $ver_no = "ver_no";
	/**
	 * Allocation lot No. 引当ロットＮＯ.<p>
	 *
	 */
	public static final String $alloc_lot_no = "alloc_lot_no";
	/**
	 * Allocation sublot No. 引当サブロットＮＯ.<p>
	 *
	 */
	public static final String $alloc_sublot_no = "alloc_sublot_no";
	/**
	 * Allocation version No. 引当版ＮＯ.<p>
	 *
	 */
	public static final String $alloc_ver_no = "alloc_ver_no";
	/**
	 * Inventory arriving point cd. 在庫着荷先ＣＤ.<p>
	 *
	 */
	public static final String $stk_arrv_bp_cd = "stk_arrv_bp_cd";
	/**
	 * Grading cd. 格付ＣＤ.<p>
	 *
	 */
	public static final String $gd_cd = "gd_cd";
	/**
	 * Conforming type 良品区分.<p>
	 *
	 */
	public static final String $quality_typ = "quality_typ";
	/**
	 * Inventory inspection type 在庫検査区分.<p>
	 *
	 */
	public static final String $stk_insp_typ = "stk_insp_typ";
	/**
	 * Inventory identification type 在庫識別区分.<p>
	 *
	 */
	public static final String $stk_id_typ = "stk_id_typ";
	/**
	 * Inventory BP cd. 在庫取引先ＣＤ.<p>
	 *
	 */
	public static final String $stk_bp_cd = "stk_bp_cd";
	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public static final String $trd_unit_qty = "trd_unit_qty";
	/**
	 * Transaction unit cd. 取引単位ＣＤ.<p>
	 *
	 */
	public static final String $trd_unit_cd = "trd_unit_cd";
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
	 * Allocation input unit qty. 引当入力単位数量.<p>
	 *
	 */
	public static final String $alloc_ent_unit_qty = "alloc_ent_unit_qty";
	/**
	 * Allocation input unit cd. 引当入力単位ＣＤ.<p>
	 *
	 */
	public static final String $alloc_ent_unit_cd = "alloc_ent_unit_cd";
	/**
	 * Allocation base unit qty. 引当基準単位数量.<p>
	 *
	 */
	public static final String $alloc_base_unit_qty = "alloc_base_unit_qty";
	/**
	 * Allocation base unit cd. 引当基準単位ＣＤ.<p>
	 *
	 */
	public static final String $alloc_base_unit_cd = "alloc_base_unit_cd";
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
	 * Cancel remaining flg. 打切ＦＬＧ.<p>
	 *
	 */
	public static final String $abort_flg = "abort_flg";
	/**
	 * Prohibit mixed lots flg. ロット混在不可ＦＬＧ.<p>
	 *
	 */
	public static final String $not_lot_mix_flg = "not_lot_mix_flg";
	/**
	 * Prohibit mixed sublots flg. サブロット混在不可ＦＬＧ.<p>
	 *
	 */
	public static final String $not_sublot_mix_flg = "not_sublot_mix_flg";
	/**
	 * Expiration date FROM 有効期限ＦＲＯＭ.<p>
	 *
	 */
	public static final String $valid_dt_from = "valid_dt_from";
	/**
	 * Expiration date TO 有効期限ＴＯ.<p>
	 *
	 */
	public static final String $valid_dt_to = "valid_dt_to";
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
	 * Shipping notification remarks 出荷連絡備考.<p>
	 *
	 */
	public static final String $ship_cnt_rmrks = "ship_cnt_rmrks";
	/**
	 * Transaction remarks 取引備考.<p>
	 *
	 */
	public static final String $trd_rmrks = "trd_rmrks";
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
	 * Order details remarks 指図明細備考.<p>
	 *
	 */
	public static final String $inst_d_rmrks = "inst_d_rmrks";
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
	 * To allocate flg. 引当対象ＦＬＧ.<p>
	 *
	 */
	public static final String $alloc_tgt_flg = "alloc_tgt_flg";
	/**
	 * Allocation flg. 引当ＦＬＧ.<p>
	 *
	 */
	public static final String $alloc_flg = "alloc_flg";
	/**
	 * Order aggregation flg. 指図まとめフラグ.<p>
	 *
	 */
	public static final String $inst_bndl_flg = "inst_bndl_flg";
	/**
	 * Component check not required at shipping flg. 出荷時構成チェック不要ＦＬＧ.<p>
	 *
	 */
	public static final String $skip_chk_ship_flg = "skip_chk_ship_flg";
	/**
	 * Invoice No. インボイスＮＯ.<p>
	 *
	 */
	public static final String $iv_no = "iv_no";
	/**
	 * Invoice details No. インボイス明細ＮＯ.<p>
	 *
	 */
	public static final String $iv_d_no = "iv_d_no";
	/**
	 * Delivery note details No. 納品書明細ＮＯ.<p>
	 *
	 */
	public static final String $dlv_slip_d_no = "dlv_slip_d_no";
	/**
	 * Delivery note No. 納品書ＮＯ.<p>
	 *
	 */
	public static final String $dlv_slip_no = "dlv_slip_no";
	/**
	 * Allocation range type 引当範囲区分.<p>
	 *
	 */
	public static final String $alloc_scope_typ = "alloc_scope_typ";
	/**
	 * Scheduled shipping date and time 出荷予定日時.<p>
	 *
	 */
	public static final String $ship_schd_tm = "ship_schd_tm";
	public static final String $sas = "sas";
	/**
	 * Header details pegged ヘッダ明細紐付.<p>
	 *
	 */
	public static final String $hdr_dtl_peg = "hdr_dtl_peg";
	/**
	 * WMS ＷＭＳ.<p>
	 *
	 */
	public static final String $wms_flg = "wms_flg";

	public static final String $ship_alloc_sts_no = $sas + ".ship_alloc_sts_no";
	public static final String $sas_alloc_flg = $sas + ".alloc_flg";
	public static final String $pack_unit_qty = $sas + ".pack_unit_qty";
	public static final String $pack_unit_cd = $sas + ".pack_unit_cd";

	public static final MCMeta peg_no_META = createCommonMeta($peg_no, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta err_flg_META = createCommonMeta($err_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta data_crud_typ_META = createCommonMeta($data_crud_typ, mcframe.commonMA.meta.MA_META.DATA_CRUD_TYP);
	public static final MCMeta tmp_inst_d_no_META = createCommonMeta($tmp_inst_d_no, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta ship_inst_d_no_META = createCommonMeta($ship_inst_d_no, mcframe.commonMA.meta.MA_META.SHIP_INST_D_NO);
	public static final MCMeta ship_inst_no_META = createCommonMeta($ship_inst_no, mcframe.commonMA.meta.MA_META.SHIP_INST_NO);
	public static final MCMeta disp_seq_META = createCommonMeta($disp_seq, mcframe.commonMA.meta.MA_META.DISP_SEQ);
	public static final MCMeta ship_loc_cd_META = createCommonMeta($ship_loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta ship_str_ln_cd_META = createCommonMeta($ship_str_ln_cd, mcframe.commonMA.meta.MA_META.STR_LN_CD);
	public static final MCMeta ship_lg_grp_cd_META = createCommonMeta($ship_lg_grp_cd, mcframe.commonMA.meta.MA_META.LG_GRP_CD);
	public static final MCMeta alloc_loc_cd_META = createCommonMeta($alloc_loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta alloc_str_ln_cd_META = createCommonMeta($alloc_str_ln_cd, mcframe.commonMA.meta.MA_META.STR_LN_CD);
	public static final MCMeta dlv_str_ln_cd_META = createCommonMeta($dlv_str_ln_cd, mcframe.commonMA.meta.MA_META.STR_LN_CD);
	public static final MCMeta trd_cd_META = createCommonMeta($trd_cd, mcframe.commonMA.meta.MA_META.TRD_CD);
	public static final MCMeta trd_ptn_typ_META = createCommonMeta($trd_ptn_typ, mcframe.commonMA.meta.MA_META.TRD_PTN_TYP);
	public static final MCMeta itm_cd_META = createCommonMeta($itm_cd, mcframe.commonMA.meta.MA_META.ITM_CD);
	public static final MCMeta itm_sub1_META = createCommonMeta($itm_sub1, mcframe.commonMA.meta.MA_META.ITM_SUB1);
	public static final MCMeta itm_sub2_META = createCommonMeta($itm_sub2, mcframe.commonMA.meta.MA_META.ITM_SUB2);
	public static final MCMeta itm_sub3_META = createCommonMeta($itm_sub3, mcframe.commonMA.meta.MA_META.ITM_SUB3);
	public static final MCMeta itm_nm_META = createCommonMeta($itm_nm, mcframe.commonMA.meta.MA_META.ITM_NM);
	public static final MCMeta iv_itm_nm_META = createCommonMeta($iv_itm_nm, mcframe.commonMA.meta.MA_META.ITM_NM);
	public static final MCMeta sundry_itm_flg_META = createCommonMeta($sundry_itm_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sno1_META = createCommonMeta($sno1, mcframe.commonMA.meta.MA_META.SNO1);
	public static final MCMeta sno1_null_flg_META = createCommonMeta($sno1_null_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sno2_META = createCommonMeta($sno2, mcframe.commonMA.meta.MA_META.SNO2);
	public static final MCMeta sno2_null_flg_META = createCommonMeta($sno2_null_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sno3_META = createCommonMeta($sno3, mcframe.commonMA.meta.MA_META.SNO3);
	public static final MCMeta sno3_null_flg_META = createCommonMeta($sno3_null_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sno4_META = createCommonMeta($sno4, mcframe.commonMA.meta.MA_META.SNO4);
	public static final MCMeta sno4_null_flg_META = createCommonMeta($sno4_null_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta alloc_sno1_META = createCommonMeta($alloc_sno1, mcframe.commonMA.meta.MA_META.SNO1);
	public static final MCMeta alloc_sno2_META = createCommonMeta($alloc_sno2, mcframe.commonMA.meta.MA_META.SNO2);
	public static final MCMeta alloc_sno3_META = createCommonMeta($alloc_sno3, mcframe.commonMA.meta.MA_META.SNO3);
	public static final MCMeta alloc_sno4_META = createCommonMeta($alloc_sno4, mcframe.commonMA.meta.MA_META.SNO4);
	public static final MCMeta lot_none_flg_META = createCommonMeta($lot_none_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta lot_no_META = createCommonMeta($lot_no, mcframe.commonMA.meta.MA_META.LOT_NO);
	public static final MCMeta sublot_no_META = createCommonMeta($sublot_no, mcframe.commonMA.meta.MA_META.SUBLOT_NO);
	public static final MCMeta ver_no_META = createCommonMeta($ver_no, mcframe.commonMA.meta.MA_META.VER_NO);
	public static final MCMeta alloc_lot_no_META = createCommonMeta($alloc_lot_no, mcframe.commonMA.meta.MA_META.LOT_NO);
	public static final MCMeta alloc_sublot_no_META = createCommonMeta($alloc_sublot_no, mcframe.commonMA.meta.MA_META.SUBLOT_NO);
	public static final MCMeta alloc_ver_no_META = createCommonMeta($alloc_ver_no, mcframe.commonMA.meta.MA_META.VER_NO);
	public static final MCMeta stk_arrv_bp_cd_META = createCommonMeta($stk_arrv_bp_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta gd_cd_META = createCommonMeta($gd_cd, mcframe.commonMA.meta.MA_META.STK_GD_CD);
	public static final MCMeta quality_typ_META = createCommonMeta($quality_typ, mcframe.commonMA.meta.MA_META.QUALITY_TYP);
	public static final MCMeta stk_insp_typ_META = createCommonMeta($stk_insp_typ, mcframe.commonMS.meta.MS_META.STK_INSP_TYP);
	public static final MCMeta stk_id_typ_META = createCommonMeta($stk_id_typ, mcframe.commonMS.meta.MS_META.STK_ID_TYP);
	public static final MCMeta stk_bp_cd_META = createCommonMeta($stk_bp_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta trd_unit_qty_META = createCommonMeta($trd_unit_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta trd_unit_cd_META = createCommonMeta($trd_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta base_unit_qty_META = createCommonMeta($base_unit_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta base_unit_cd_META = createCommonMeta($base_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta alloc_ent_unit_qty_META = createCommonMeta($alloc_ent_unit_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta alloc_ent_unit_cd_META = createCommonMeta($alloc_ent_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta alloc_base_unit_qty_META = createCommonMeta($alloc_base_unit_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta alloc_base_unit_cd_META = createCommonMeta($alloc_base_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta rsn_cd_META = createCommonMeta($rsn_cd, mcframe.commonMA.meta.MA_META.BIZ_RSN_CD);
	public static final MCMeta bd_dpt_cd_META = createCommonMeta($bd_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta abort_flg_META = createCommonMeta($abort_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta not_lot_mix_flg_META = createCommonMeta($not_lot_mix_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta not_sublot_mix_flg_META = createCommonMeta($not_sublot_mix_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta valid_dt_from_META = createCommonMeta($valid_dt_from, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta valid_dt_to_META = createCommonMeta($valid_dt_to, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta base_dlv_slip_no_META = createCommonMeta($base_dlv_slip_no, mcframe.commonMA.meta.MA_META.DLV_SLIP_NO);
	public static final MCMeta base_prov_act_no_META = createCommonMeta($base_prov_act_no, mcframe.commonMA.meta.MA_META.PROV_ACT_NO);
	public static final MCMeta base_ac_dt_META = createCommonMeta($base_ac_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta ship_cnt_rmrks_META = createCommonMeta($ship_cnt_rmrks, mcframe.commonMS.meta.MS_META.SHIP_CNT_RMRKS);
	public static final MCMeta trd_rmrks_META = createCommonMeta($trd_rmrks, mcframe.commonMA.meta.MA_META.TRD_RMRKS);
	public static final MCMeta trd_d_rmrks_META = createCommonMeta($trd_d_rmrks, mcframe.commonMA.meta.MA_META.TRD_D_RMRKS);
	public static final MCMeta intr_d_rmrks_META = createCommonMeta($intr_d_rmrks, mcframe.commonMS.meta.MS_META.SHIP_INST_INTR_D_RMRKS);
	public static final MCMeta inst_d_rmrks_META = createCommonMeta($inst_d_rmrks, mcframe.commonMS.meta.MS_META.SHIP_INST_D_RMRKS);
	public static final MCMeta sub_char1_META = createCommonMeta($sub_char1, mcframe.commonMS.meta.MS_META.SHIP_INST_D_SUB_CHAR1);
	public static final MCMeta sub_char2_META = createCommonMeta($sub_char2, mcframe.commonMS.meta.MS_META.SHIP_INST_D_SUB_CHAR2);
	public static final MCMeta sub_char3_META = createCommonMeta($sub_char3, mcframe.commonMS.meta.MS_META.SHIP_INST_D_SUB_CHAR3);
	public static final MCMeta alloc_tgt_flg_META = createCommonMeta($alloc_tgt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta alloc_flg_META = createCommonMeta($alloc_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta inst_bndl_flg_META = createCommonMeta($inst_bndl_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta skip_chk_ship_flg_META = createCommonMeta($skip_chk_ship_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta iv_no_META = createCommonMeta($iv_no, mcframe.commonMA.meta.MA_META.IV_NO);
	public static final MCMeta iv_d_no_META = createCommonMeta($iv_d_no, mcframe.commonMA.meta.MA_META.IV_D_NO);
	public static final MCMeta dlv_slip_d_no_META = createCommonMeta($dlv_slip_d_no, mcframe.commonMA.meta.MA_META.DLV_SLIP_D_NO);
	public static final MCMeta dlv_slip_no_META = createCommonMeta($dlv_slip_no, mcframe.commonMA.meta.MA_META.DLV_SLIP_NO);
	public static final MCMeta alloc_scope_typ_META = createCommonMeta($alloc_scope_typ, mcframe.commonMA.meta.MA_META.ALLOC_SCOPE_TYP);
	public static final MCMeta ship_schd_tm_META = createCommonMeta($ship_schd_tm, mcframe.commonMA.meta.MA_META.TM);
	public static final MCMeta sas_META = createInnerRowMeta($sas, mcframe.serverMS.dbc.MST_SHIP_ALLOC_STS_R.class);
	public static final MCMeta hdr_dtl_peg_META = createCommonMeta($hdr_dtl_peg, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta wms_flg_META = createCommonMeta($wms_flg, mcframe.commonMA.meta.MA_META.FLG);

	protected static final ConstMetaList<ShipInst_Chk01_DtlR> constMetas = new ConstMetaList<ShipInst_Chk01_DtlR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			peg_no_META,
			err_flg_META,
			data_crud_typ_META,
			tmp_inst_d_no_META,
			ship_inst_d_no_META,
			ship_inst_no_META,
			disp_seq_META,
			ship_loc_cd_META,
			ship_str_ln_cd_META,
			ship_lg_grp_cd_META,
			alloc_loc_cd_META,
			alloc_str_ln_cd_META,
			dlv_str_ln_cd_META,
			trd_cd_META,
			trd_ptn_typ_META,
			itm_cd_META,
			itm_sub1_META,
			itm_sub2_META,
			itm_sub3_META,
			itm_nm_META,
			iv_itm_nm_META,
			sundry_itm_flg_META,
			sno1_META,
			sno1_null_flg_META,
			sno2_META,
			sno2_null_flg_META,
			sno3_META,
			sno3_null_flg_META,
			sno4_META,
			sno4_null_flg_META,
			alloc_sno1_META,
			alloc_sno2_META,
			alloc_sno3_META,
			alloc_sno4_META,
			lot_none_flg_META,
			lot_no_META,
			sublot_no_META,
			ver_no_META,
			alloc_lot_no_META,
			alloc_sublot_no_META,
			alloc_ver_no_META,
			stk_arrv_bp_cd_META,
			gd_cd_META,
			quality_typ_META,
			stk_insp_typ_META,
			stk_id_typ_META,
			stk_bp_cd_META,
			trd_unit_qty_META,
			trd_unit_cd_META,
			base_unit_qty_META,
			base_unit_cd_META,
			alloc_ent_unit_qty_META,
			alloc_ent_unit_cd_META,
			alloc_base_unit_qty_META,
			alloc_base_unit_cd_META,
			rsn_cd_META,
			bd_dpt_cd_META,
			abort_flg_META,
			not_lot_mix_flg_META,
			not_sublot_mix_flg_META,
			valid_dt_from_META,
			valid_dt_to_META,
			base_dlv_slip_no_META,
			base_prov_act_no_META,
			base_ac_dt_META,
			ship_cnt_rmrks_META,
			trd_rmrks_META,
			trd_d_rmrks_META,
			intr_d_rmrks_META,
			inst_d_rmrks_META,
			sub_char1_META,
			sub_char2_META,
			sub_char3_META,
			alloc_tgt_flg_META,
			alloc_flg_META,
			inst_bndl_flg_META,
			skip_chk_ship_flg_META,
			iv_no_META,
			iv_d_no_META,
			dlv_slip_d_no_META,
			dlv_slip_no_META,
			alloc_scope_typ_META,
			ship_schd_tm_META,
			sas_META,
			hdr_dtl_peg_META,
			wms_flg_META
		},
		new String[][]{
			{
				"ship_alloc_sts_no",
				"sas_alloc_flg",
				"pack_unit_qty",
				"pack_unit_cd"
			},
			{
				$ship_alloc_sts_no,
				$sas_alloc_flg,
				$pack_unit_qty,
				$pack_unit_cd
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
			}
		)),
		new MCExtMap.Entry($$CHK_NUM, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$SMALL_LARGE, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$CHK_DT, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$BEFORE_AFTER, new MCExtList(
			new String[][]{
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
			}
		)),
		new MCExtMap.Entry($$LIST_OUT, new MCExtList(
			new String[][]{
			}
		)),
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
		)),
		new MCExtMap.Entry($$CONST, new MCExtList(
			new String[][]{
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
	protected ShipInst_Chk01_DtlR_MC_A(ConstMetaList<? extends ShipInst_Chk01_DtlR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public ShipInst_Chk01_DtlR clone() {
		return (ShipInst_Chk01_DtlR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public ShipInst_Chk01_DtlR createInstance() {
		return (ShipInst_Chk01_DtlR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public ShipInst_Chk01_DtlR getValues(String... names) {
		return (ShipInst_Chk01_DtlR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
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
	 * Error flg. エラーＦＬＧ.<p>
	 *
	 */
	public boolean err_flg() {
		return getConstBoolean(offset + 1, $err_flg);
	}

	/**
	 * Error flg. エラーＦＬＧ.<p>
	 *
	 */
	public void err_flg(boolean value) {
		setConstBoolean(offset + 1, $err_flg, value);
	}


	/**
	 * Data update type データ更新区分.<p>
	 *
	 */
	public String data_crud_typ() {
		return getConstString(offset + 2, $data_crud_typ);
	}

	/**
	 * Data update type データ更新区分.<p>
	 *
	 */
	public void data_crud_typ(String value) {
		setConstString(offset + 2, $data_crud_typ, value);
	}


	/**
	 * Temporary order details No. 仮指図明細ＮＯ.<p>
	 *
	 */
	public MCNumber tmp_inst_d_no() {
		return getConstNumber(offset + 3, $tmp_inst_d_no);
	}

	/**
	 * Temporary order details No. 仮指図明細ＮＯ.<p>
	 *
	 */
	public void tmp_inst_d_no(MCNumber value) {
		setConstNumber(offset + 3, $tmp_inst_d_no, value);
	}

	/**
	 * Temporary order details No. 仮指図明細ＮＯ.<p>
	 *
	 */
	public void tmp_inst_d_no(int value) {
		setConstNumber(offset + 3, $tmp_inst_d_no, value);
	}

	/**
	 * Temporary order details No. 仮指図明細ＮＯ.<p>
	 *
	 */
	public void tmp_inst_d_no(long value) {
		setConstNumber(offset + 3, $tmp_inst_d_no, value);
	}

	/**
	 * Temporary order details No. 仮指図明細ＮＯ.<p>
	 *
	 */
	public void tmp_inst_d_no(float value) {
		setConstNumber(offset + 3, $tmp_inst_d_no, value);
	}

	/**
	 * Temporary order details No. 仮指図明細ＮＯ.<p>
	 *
	 */
	public void tmp_inst_d_no(double value) {
		setConstNumber(offset + 3, $tmp_inst_d_no, value);
	}


	/**
	 * Shipping order details No. 出荷指図明細ＮＯ.<p>
	 *
	 */
	public String ship_inst_d_no() {
		return getConstString(offset + 4, $ship_inst_d_no);
	}

	/**
	 * Shipping order details No. 出荷指図明細ＮＯ.<p>
	 *
	 */
	public void ship_inst_d_no(String value) {
		setConstString(offset + 4, $ship_inst_d_no, value);
	}


	/**
	 * Shipping order No. 出荷指図ＮＯ.<p>
	 *
	 */
	public String ship_inst_no() {
		return getConstString(offset + 5, $ship_inst_no);
	}

	/**
	 * Shipping order No. 出荷指図ＮＯ.<p>
	 *
	 */
	public void ship_inst_no(String value) {
		setConstString(offset + 5, $ship_inst_no, value);
	}


	/**
	 * Display order 表示順.<p>
	 *
	 */
	public MCNumber disp_seq() {
		return getConstNumber(offset + 6, $disp_seq);
	}

	/**
	 * Display order 表示順.<p>
	 *
	 */
	public void disp_seq(MCNumber value) {
		setConstNumber(offset + 6, $disp_seq, value);
	}

	/**
	 * Display order 表示順.<p>
	 *
	 */
	public void disp_seq(int value) {
		setConstNumber(offset + 6, $disp_seq, value);
	}

	/**
	 * Display order 表示順.<p>
	 *
	 */
	public void disp_seq(long value) {
		setConstNumber(offset + 6, $disp_seq, value);
	}

	/**
	 * Display order 表示順.<p>
	 *
	 */
	public void disp_seq(float value) {
		setConstNumber(offset + 6, $disp_seq, value);
	}

	/**
	 * Display order 表示順.<p>
	 *
	 */
	public void disp_seq(double value) {
		setConstNumber(offset + 6, $disp_seq, value);
	}


	/**
	 * Shipping location cd. 出荷場所ＣＤ.<p>
	 *
	 */
	public String ship_loc_cd() {
		return getConstString(offset + 7, $ship_loc_cd);
	}

	/**
	 * Shipping location cd. 出荷場所ＣＤ.<p>
	 *
	 */
	public void ship_loc_cd(String value) {
		setConstString(offset + 7, $ship_loc_cd, value);
	}


	/**
	 * Shipping rack/line cd. 出荷棚・ラインＣＤ.<p>
	 *
	 */
	public String ship_str_ln_cd() {
		return getConstString(offset + 8, $ship_str_ln_cd);
	}

	/**
	 * Shipping rack/line cd. 出荷棚・ラインＣＤ.<p>
	 *
	 */
	public void ship_str_ln_cd(String value) {
		setConstString(offset + 8, $ship_str_ln_cd, value);
	}


	/**
	 * Shipping distribution group cd. 出荷物流グループＣＤ.<p>
	 *
	 */
	public String ship_lg_grp_cd() {
		return getConstString(offset + 9, $ship_lg_grp_cd);
	}

	/**
	 * Shipping distribution group cd. 出荷物流グループＣＤ.<p>
	 *
	 */
	public void ship_lg_grp_cd(String value) {
		setConstString(offset + 9, $ship_lg_grp_cd, value);
	}


	/**
	 * Allocation location cd. 引当場所ＣＤ.<p>
	 *
	 */
	public String alloc_loc_cd() {
		return getConstString(offset + 10, $alloc_loc_cd);
	}

	/**
	 * Allocation location cd. 引当場所ＣＤ.<p>
	 *
	 */
	public void alloc_loc_cd(String value) {
		setConstString(offset + 10, $alloc_loc_cd, value);
	}


	/**
	 * Allocation rack/line cd. 引当棚・ラインＣＤ.<p>
	 *
	 */
	public String alloc_str_ln_cd() {
		return getConstString(offset + 11, $alloc_str_ln_cd);
	}

	/**
	 * Allocation rack/line cd. 引当棚・ラインＣＤ.<p>
	 *
	 */
	public void alloc_str_ln_cd(String value) {
		setConstString(offset + 11, $alloc_str_ln_cd, value);
	}


	/**
	 * Delivery rack/line cd. 納品棚・ラインＣＤ.<p>
	 *
	 */
	public String dlv_str_ln_cd() {
		return getConstString(offset + 12, $dlv_str_ln_cd);
	}

	/**
	 * Delivery rack/line cd. 納品棚・ラインＣＤ.<p>
	 *
	 */
	public void dlv_str_ln_cd(String value) {
		setConstString(offset + 12, $dlv_str_ln_cd, value);
	}


	/**
	 * Transaction cd. 取引ＣＤ.<p>
	 *
	 */
	public String trd_cd() {
		return getConstString(offset + 13, $trd_cd);
	}

	/**
	 * Transaction cd. 取引ＣＤ.<p>
	 *
	 */
	public void trd_cd(String value) {
		setConstString(offset + 13, $trd_cd, value);
	}


	/**
	 * Transaction pattern type 取引パタン区分.<p>
	 *
	 */
	public String trd_ptn_typ() {
		return getConstString(offset + 14, $trd_ptn_typ);
	}

	/**
	 * Transaction pattern type 取引パタン区分.<p>
	 *
	 */
	public void trd_ptn_typ(String value) {
		setConstString(offset + 14, $trd_ptn_typ, value);
	}


	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public String itm_cd() {
		return getConstString(offset + 15, $itm_cd);
	}

	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public void itm_cd(String value) {
		setConstString(offset + 15, $itm_cd, value);
	}


	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public String itm_sub1() {
		return getConstString(offset + 16, $itm_sub1);
	}

	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public void itm_sub1(String value) {
		setConstString(offset + 16, $itm_sub1, value);
	}


	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public String itm_sub2() {
		return getConstString(offset + 17, $itm_sub2);
	}

	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public void itm_sub2(String value) {
		setConstString(offset + 17, $itm_sub2, value);
	}


	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public String itm_sub3() {
		return getConstString(offset + 18, $itm_sub3);
	}

	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public void itm_sub3(String value) {
		setConstString(offset + 18, $itm_sub3, value);
	}


	/**
	 * Item name 品名.<p>
	 *
	 */
	public String itm_nm() {
		return getConstString(offset + 19, $itm_nm);
	}

	/**
	 * Item name 品名.<p>
	 *
	 */
	public void itm_nm(String value) {
		setConstString(offset + 19, $itm_nm, value);
	}


	/**
	 * Item name for invoice インボイス表記用品名.<p>
	 *
	 */
	public String iv_itm_nm() {
		return getConstString(offset + 20, $iv_itm_nm);
	}

	/**
	 * Item name for invoice インボイス表記用品名.<p>
	 *
	 */
	public void iv_itm_nm(String value) {
		setConstString(offset + 20, $iv_itm_nm, value);
	}


	/**
	 * Miscellaneous item flg. 諸口品ＦＬＧ.<p>
	 *
	 */
	public boolean sundry_itm_flg() {
		return getConstBoolean(offset + 21, $sundry_itm_flg);
	}

	/**
	 * Miscellaneous item flg. 諸口品ＦＬＧ.<p>
	 *
	 */
	public void sundry_itm_flg(boolean value) {
		setConstBoolean(offset + 21, $sundry_itm_flg, value);
	}


	/**
	 * SEIBAN No. 1 手配ＮＯ１.<p>
	 *
	 */
	public String sno1() {
		return getConstString(offset + 22, $sno1);
	}

	/**
	 * SEIBAN No. 1 手配ＮＯ１.<p>
	 *
	 */
	public void sno1(String value) {
		setConstString(offset + 22, $sno1, value);
	}


	/**
	 * Allow without SEIBAN No. 1 flg. 手配ＮＯ１無し可ＦＬＧ.<p>
	 *
	 */
	public boolean sno1_null_flg() {
		return getConstBoolean(offset + 23, $sno1_null_flg);
	}

	/**
	 * Allow without SEIBAN No. 1 flg. 手配ＮＯ１無し可ＦＬＧ.<p>
	 *
	 */
	public void sno1_null_flg(boolean value) {
		setConstBoolean(offset + 23, $sno1_null_flg, value);
	}


	/**
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public String sno2() {
		return getConstString(offset + 24, $sno2);
	}

	/**
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public void sno2(String value) {
		setConstString(offset + 24, $sno2, value);
	}


	/**
	 * Allow without SEIBAN No. 2 flg. 手配ＮＯ２無し可ＦＬＧ.<p>
	 *
	 */
	public boolean sno2_null_flg() {
		return getConstBoolean(offset + 25, $sno2_null_flg);
	}

	/**
	 * Allow without SEIBAN No. 2 flg. 手配ＮＯ２無し可ＦＬＧ.<p>
	 *
	 */
	public void sno2_null_flg(boolean value) {
		setConstBoolean(offset + 25, $sno2_null_flg, value);
	}


	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public String sno3() {
		return getConstString(offset + 26, $sno3);
	}

	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public void sno3(String value) {
		setConstString(offset + 26, $sno3, value);
	}


	/**
	 * Allow without SEIBAN No. 3 flg. 手配ＮＯ３無し可ＦＬＧ.<p>
	 *
	 */
	public boolean sno3_null_flg() {
		return getConstBoolean(offset + 27, $sno3_null_flg);
	}

	/**
	 * Allow without SEIBAN No. 3 flg. 手配ＮＯ３無し可ＦＬＧ.<p>
	 *
	 */
	public void sno3_null_flg(boolean value) {
		setConstBoolean(offset + 27, $sno3_null_flg, value);
	}


	/**
	 * SEIBAN No. 4 手配ＮＯ４.<p>
	 *
	 */
	public String sno4() {
		return getConstString(offset + 28, $sno4);
	}

	/**
	 * SEIBAN No. 4 手配ＮＯ４.<p>
	 *
	 */
	public void sno4(String value) {
		setConstString(offset + 28, $sno4, value);
	}


	/**
	 * Allow without SEIBAN No. 4 flg. 手配ＮＯ４無し可ＦＬＧ.<p>
	 *
	 */
	public boolean sno4_null_flg() {
		return getConstBoolean(offset + 29, $sno4_null_flg);
	}

	/**
	 * Allow without SEIBAN No. 4 flg. 手配ＮＯ４無し可ＦＬＧ.<p>
	 *
	 */
	public void sno4_null_flg(boolean value) {
		setConstBoolean(offset + 29, $sno4_null_flg, value);
	}


	/**
	 * Allocation SEIBAN No. 1 引当手配ＮＯ１.<p>
	 *
	 */
	public String alloc_sno1() {
		return getConstString(offset + 30, $alloc_sno1);
	}

	/**
	 * Allocation SEIBAN No. 1 引当手配ＮＯ１.<p>
	 *
	 */
	public void alloc_sno1(String value) {
		setConstString(offset + 30, $alloc_sno1, value);
	}


	/**
	 * Allocation SEIBAN No. 2 引当手配ＮＯ２.<p>
	 *
	 */
	public String alloc_sno2() {
		return getConstString(offset + 31, $alloc_sno2);
	}

	/**
	 * Allocation SEIBAN No. 2 引当手配ＮＯ２.<p>
	 *
	 */
	public void alloc_sno2(String value) {
		setConstString(offset + 31, $alloc_sno2, value);
	}


	/**
	 * Allocation SEIBAN No. 3 引当手配ＮＯ３.<p>
	 *
	 */
	public String alloc_sno3() {
		return getConstString(offset + 32, $alloc_sno3);
	}

	/**
	 * Allocation SEIBAN No. 3 引当手配ＮＯ３.<p>
	 *
	 */
	public void alloc_sno3(String value) {
		setConstString(offset + 32, $alloc_sno3, value);
	}


	/**
	 * Allocation SEIBAN No. 4 引当手配ＮＯ４.<p>
	 *
	 */
	public String alloc_sno4() {
		return getConstString(offset + 33, $alloc_sno4);
	}

	/**
	 * Allocation SEIBAN No. 4 引当手配ＮＯ４.<p>
	 *
	 */
	public void alloc_sno4(String value) {
		setConstString(offset + 33, $alloc_sno4, value);
	}


	/**
	 * Without lot ロット指定無.<p>
	 *
	 */
	public boolean lot_none_flg() {
		return getConstBoolean(offset + 34, $lot_none_flg);
	}

	/**
	 * Without lot ロット指定無.<p>
	 *
	 */
	public void lot_none_flg(boolean value) {
		setConstBoolean(offset + 34, $lot_none_flg, value);
	}


	/**
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public String lot_no() {
		return getConstString(offset + 35, $lot_no);
	}

	/**
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public void lot_no(String value) {
		setConstString(offset + 35, $lot_no, value);
	}


	/**
	 * Sublot No. サブロットＮＯ.<p>
	 *
	 */
	public String sublot_no() {
		return getConstString(offset + 36, $sublot_no);
	}

	/**
	 * Sublot No. サブロットＮＯ.<p>
	 *
	 */
	public void sublot_no(String value) {
		setConstString(offset + 36, $sublot_no, value);
	}


	/**
	 * Version No. 版ＮＯ.<p>
	 *
	 */
	public String ver_no() {
		return getConstString(offset + 37, $ver_no);
	}

	/**
	 * Version No. 版ＮＯ.<p>
	 *
	 */
	public void ver_no(String value) {
		setConstString(offset + 37, $ver_no, value);
	}


	/**
	 * Allocation lot No. 引当ロットＮＯ.<p>
	 *
	 */
	public String alloc_lot_no() {
		return getConstString(offset + 38, $alloc_lot_no);
	}

	/**
	 * Allocation lot No. 引当ロットＮＯ.<p>
	 *
	 */
	public void alloc_lot_no(String value) {
		setConstString(offset + 38, $alloc_lot_no, value);
	}


	/**
	 * Allocation sublot No. 引当サブロットＮＯ.<p>
	 *
	 */
	public String alloc_sublot_no() {
		return getConstString(offset + 39, $alloc_sublot_no);
	}

	/**
	 * Allocation sublot No. 引当サブロットＮＯ.<p>
	 *
	 */
	public void alloc_sublot_no(String value) {
		setConstString(offset + 39, $alloc_sublot_no, value);
	}


	/**
	 * Allocation version No. 引当版ＮＯ.<p>
	 *
	 */
	public String alloc_ver_no() {
		return getConstString(offset + 40, $alloc_ver_no);
	}

	/**
	 * Allocation version No. 引当版ＮＯ.<p>
	 *
	 */
	public void alloc_ver_no(String value) {
		setConstString(offset + 40, $alloc_ver_no, value);
	}


	/**
	 * Inventory arriving point cd. 在庫着荷先ＣＤ.<p>
	 *
	 */
	public String stk_arrv_bp_cd() {
		return getConstString(offset + 41, $stk_arrv_bp_cd);
	}

	/**
	 * Inventory arriving point cd. 在庫着荷先ＣＤ.<p>
	 *
	 */
	public void stk_arrv_bp_cd(String value) {
		setConstString(offset + 41, $stk_arrv_bp_cd, value);
	}


	/**
	 * Grading cd. 格付ＣＤ.<p>
	 *
	 */
	public String gd_cd() {
		return getConstString(offset + 42, $gd_cd);
	}

	/**
	 * Grading cd. 格付ＣＤ.<p>
	 *
	 */
	public void gd_cd(String value) {
		setConstString(offset + 42, $gd_cd, value);
	}


	/**
	 * Conforming type 良品区分.<p>
	 *
	 */
	public String quality_typ() {
		return getConstString(offset + 43, $quality_typ);
	}

	/**
	 * Conforming type 良品区分.<p>
	 *
	 */
	public void quality_typ(String value) {
		setConstString(offset + 43, $quality_typ, value);
	}


	/**
	 * Inventory inspection type 在庫検査区分.<p>
	 *
	 */
	public String stk_insp_typ() {
		return getConstString(offset + 44, $stk_insp_typ);
	}

	/**
	 * Inventory inspection type 在庫検査区分.<p>
	 *
	 */
	public void stk_insp_typ(String value) {
		setConstString(offset + 44, $stk_insp_typ, value);
	}


	/**
	 * Inventory identification type 在庫識別区分.<p>
	 *
	 */
	public String stk_id_typ() {
		return getConstString(offset + 45, $stk_id_typ);
	}

	/**
	 * Inventory identification type 在庫識別区分.<p>
	 *
	 */
	public void stk_id_typ(String value) {
		setConstString(offset + 45, $stk_id_typ, value);
	}


	/**
	 * Inventory BP cd. 在庫取引先ＣＤ.<p>
	 *
	 */
	public String stk_bp_cd() {
		return getConstString(offset + 46, $stk_bp_cd);
	}

	/**
	 * Inventory BP cd. 在庫取引先ＣＤ.<p>
	 *
	 */
	public void stk_bp_cd(String value) {
		setConstString(offset + 46, $stk_bp_cd, value);
	}


	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public MCNumber trd_unit_qty() {
		return getConstNumber(offset + 47, $trd_unit_qty);
	}

	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public void trd_unit_qty(MCNumber value) {
		setConstNumber(offset + 47, $trd_unit_qty, value);
	}

	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public void trd_unit_qty(int value) {
		setConstNumber(offset + 47, $trd_unit_qty, value);
	}

	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public void trd_unit_qty(long value) {
		setConstNumber(offset + 47, $trd_unit_qty, value);
	}

	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public void trd_unit_qty(float value) {
		setConstNumber(offset + 47, $trd_unit_qty, value);
	}

	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public void trd_unit_qty(double value) {
		setConstNumber(offset + 47, $trd_unit_qty, value);
	}


	/**
	 * Transaction unit cd. 取引単位ＣＤ.<p>
	 *
	 */
	public String trd_unit_cd() {
		return getConstString(offset + 48, $trd_unit_cd);
	}

	/**
	 * Transaction unit cd. 取引単位ＣＤ.<p>
	 *
	 */
	public void trd_unit_cd(String value) {
		setConstString(offset + 48, $trd_unit_cd, value);
	}


	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public MCNumber base_unit_qty() {
		return getConstNumber(offset + 49, $base_unit_qty);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(MCNumber value) {
		setConstNumber(offset + 49, $base_unit_qty, value);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(int value) {
		setConstNumber(offset + 49, $base_unit_qty, value);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(long value) {
		setConstNumber(offset + 49, $base_unit_qty, value);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(float value) {
		setConstNumber(offset + 49, $base_unit_qty, value);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(double value) {
		setConstNumber(offset + 49, $base_unit_qty, value);
	}


	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public String base_unit_cd() {
		return getConstString(offset + 50, $base_unit_cd);
	}

	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public void base_unit_cd(String value) {
		setConstString(offset + 50, $base_unit_cd, value);
	}


	/**
	 * Allocation input unit qty. 引当入力単位数量.<p>
	 *
	 */
	public MCNumber alloc_ent_unit_qty() {
		return getConstNumber(offset + 51, $alloc_ent_unit_qty);
	}

	/**
	 * Allocation input unit qty. 引当入力単位数量.<p>
	 *
	 */
	public void alloc_ent_unit_qty(MCNumber value) {
		setConstNumber(offset + 51, $alloc_ent_unit_qty, value);
	}

	/**
	 * Allocation input unit qty. 引当入力単位数量.<p>
	 *
	 */
	public void alloc_ent_unit_qty(int value) {
		setConstNumber(offset + 51, $alloc_ent_unit_qty, value);
	}

	/**
	 * Allocation input unit qty. 引当入力単位数量.<p>
	 *
	 */
	public void alloc_ent_unit_qty(long value) {
		setConstNumber(offset + 51, $alloc_ent_unit_qty, value);
	}

	/**
	 * Allocation input unit qty. 引当入力単位数量.<p>
	 *
	 */
	public void alloc_ent_unit_qty(float value) {
		setConstNumber(offset + 51, $alloc_ent_unit_qty, value);
	}

	/**
	 * Allocation input unit qty. 引当入力単位数量.<p>
	 *
	 */
	public void alloc_ent_unit_qty(double value) {
		setConstNumber(offset + 51, $alloc_ent_unit_qty, value);
	}


	/**
	 * Allocation input unit cd. 引当入力単位ＣＤ.<p>
	 *
	 */
	public String alloc_ent_unit_cd() {
		return getConstString(offset + 52, $alloc_ent_unit_cd);
	}

	/**
	 * Allocation input unit cd. 引当入力単位ＣＤ.<p>
	 *
	 */
	public void alloc_ent_unit_cd(String value) {
		setConstString(offset + 52, $alloc_ent_unit_cd, value);
	}


	/**
	 * Allocation base unit qty. 引当基準単位数量.<p>
	 *
	 */
	public MCNumber alloc_base_unit_qty() {
		return getConstNumber(offset + 53, $alloc_base_unit_qty);
	}

	/**
	 * Allocation base unit qty. 引当基準単位数量.<p>
	 *
	 */
	public void alloc_base_unit_qty(MCNumber value) {
		setConstNumber(offset + 53, $alloc_base_unit_qty, value);
	}

	/**
	 * Allocation base unit qty. 引当基準単位数量.<p>
	 *
	 */
	public void alloc_base_unit_qty(int value) {
		setConstNumber(offset + 53, $alloc_base_unit_qty, value);
	}

	/**
	 * Allocation base unit qty. 引当基準単位数量.<p>
	 *
	 */
	public void alloc_base_unit_qty(long value) {
		setConstNumber(offset + 53, $alloc_base_unit_qty, value);
	}

	/**
	 * Allocation base unit qty. 引当基準単位数量.<p>
	 *
	 */
	public void alloc_base_unit_qty(float value) {
		setConstNumber(offset + 53, $alloc_base_unit_qty, value);
	}

	/**
	 * Allocation base unit qty. 引当基準単位数量.<p>
	 *
	 */
	public void alloc_base_unit_qty(double value) {
		setConstNumber(offset + 53, $alloc_base_unit_qty, value);
	}


	/**
	 * Allocation base unit cd. 引当基準単位ＣＤ.<p>
	 *
	 */
	public String alloc_base_unit_cd() {
		return getConstString(offset + 54, $alloc_base_unit_cd);
	}

	/**
	 * Allocation base unit cd. 引当基準単位ＣＤ.<p>
	 *
	 */
	public void alloc_base_unit_cd(String value) {
		setConstString(offset + 54, $alloc_base_unit_cd, value);
	}


	/**
	 * Reason cd. 理由ＣＤ.<p>
	 *
	 */
	public String rsn_cd() {
		return getConstString(offset + 55, $rsn_cd);
	}

	/**
	 * Reason cd. 理由ＣＤ.<p>
	 *
	 */
	public void rsn_cd(String value) {
		setConstString(offset + 55, $rsn_cd, value);
	}


	/**
	 * Charged dept. cd. 負担部門ＣＤ.<p>
	 *
	 */
	public String bd_dpt_cd() {
		return getConstString(offset + 56, $bd_dpt_cd);
	}

	/**
	 * Charged dept. cd. 負担部門ＣＤ.<p>
	 *
	 */
	public void bd_dpt_cd(String value) {
		setConstString(offset + 56, $bd_dpt_cd, value);
	}


	/**
	 * Cancel remaining flg. 打切ＦＬＧ.<p>
	 *
	 */
	public boolean abort_flg() {
		return getConstBoolean(offset + 57, $abort_flg);
	}

	/**
	 * Cancel remaining flg. 打切ＦＬＧ.<p>
	 *
	 */
	public void abort_flg(boolean value) {
		setConstBoolean(offset + 57, $abort_flg, value);
	}


	/**
	 * Prohibit mixed lots flg. ロット混在不可ＦＬＧ.<p>
	 *
	 */
	public boolean not_lot_mix_flg() {
		return getConstBoolean(offset + 58, $not_lot_mix_flg);
	}

	/**
	 * Prohibit mixed lots flg. ロット混在不可ＦＬＧ.<p>
	 *
	 */
	public void not_lot_mix_flg(boolean value) {
		setConstBoolean(offset + 58, $not_lot_mix_flg, value);
	}


	/**
	 * Prohibit mixed sublots flg. サブロット混在不可ＦＬＧ.<p>
	 *
	 */
	public boolean not_sublot_mix_flg() {
		return getConstBoolean(offset + 59, $not_sublot_mix_flg);
	}

	/**
	 * Prohibit mixed sublots flg. サブロット混在不可ＦＬＧ.<p>
	 *
	 */
	public void not_sublot_mix_flg(boolean value) {
		setConstBoolean(offset + 59, $not_sublot_mix_flg, value);
	}


	/**
	 * Expiration date FROM 有効期限ＦＲＯＭ.<p>
	 *
	 */
	public MCDate valid_dt_from() {
		return getConstDate(offset + 60, $valid_dt_from);
	}

	/**
	 * Expiration date FROM 有効期限ＦＲＯＭ.<p>
	 *
	 */
	public void valid_dt_from(MCDate value) {
		setConstDate(offset + 60, $valid_dt_from, value);
	}


	/**
	 * Expiration date TO 有効期限ＴＯ.<p>
	 *
	 */
	public MCDate valid_dt_to() {
		return getConstDate(offset + 61, $valid_dt_to);
	}

	/**
	 * Expiration date TO 有効期限ＴＯ.<p>
	 *
	 */
	public void valid_dt_to(MCDate value) {
		setConstDate(offset + 61, $valid_dt_to, value);
	}


	/**
	 * Return-from delivery note No. 返品元納品書ＮＯ.<p>
	 *
	 */
	public String base_dlv_slip_no() {
		return getConstString(offset + 62, $base_dlv_slip_no);
	}

	/**
	 * Return-from delivery note No. 返品元納品書ＮＯ.<p>
	 *
	 */
	public void base_dlv_slip_no(String value) {
		setConstString(offset + 62, $base_dlv_slip_no, value);
	}


	/**
	 * Return-from supply result No. 返品元支給実績ＮＯ.<p>
	 *
	 */
	public String base_prov_act_no() {
		return getConstString(offset + 63, $base_prov_act_no);
	}

	/**
	 * Return-from supply result No. 返品元支給実績ＮＯ.<p>
	 *
	 */
	public void base_prov_act_no(String value) {
		setConstString(offset + 63, $base_prov_act_no, value);
	}


	/**
	 * Supply recording date (Base) 支給計上日（基）.<p>
	 *
	 */
	public MCDate base_ac_dt() {
		return getConstDate(offset + 64, $base_ac_dt);
	}

	/**
	 * Supply recording date (Base) 支給計上日（基）.<p>
	 *
	 */
	public void base_ac_dt(MCDate value) {
		setConstDate(offset + 64, $base_ac_dt, value);
	}


	/**
	 * Shipping notification remarks 出荷連絡備考.<p>
	 *
	 */
	public String ship_cnt_rmrks() {
		return getConstString(offset + 65, $ship_cnt_rmrks);
	}

	/**
	 * Shipping notification remarks 出荷連絡備考.<p>
	 *
	 */
	public void ship_cnt_rmrks(String value) {
		setConstString(offset + 65, $ship_cnt_rmrks, value);
	}


	/**
	 * Transaction remarks 取引備考.<p>
	 *
	 */
	public String trd_rmrks() {
		return getConstString(offset + 66, $trd_rmrks);
	}

	/**
	 * Transaction remarks 取引備考.<p>
	 *
	 */
	public void trd_rmrks(String value) {
		setConstString(offset + 66, $trd_rmrks, value);
	}


	/**
	 * Transaction details remarks 取引明細備考.<p>
	 *
	 */
	public String trd_d_rmrks() {
		return getConstString(offset + 67, $trd_d_rmrks);
	}

	/**
	 * Transaction details remarks 取引明細備考.<p>
	 *
	 */
	public void trd_d_rmrks(String value) {
		setConstString(offset + 67, $trd_d_rmrks, value);
	}


	/**
	 * Internal details remarks 内部明細備考.<p>
	 *
	 */
	public String intr_d_rmrks() {
		return getConstString(offset + 68, $intr_d_rmrks);
	}

	/**
	 * Internal details remarks 内部明細備考.<p>
	 *
	 */
	public void intr_d_rmrks(String value) {
		setConstString(offset + 68, $intr_d_rmrks, value);
	}


	/**
	 * Order details remarks 指図明細備考.<p>
	 *
	 */
	public String inst_d_rmrks() {
		return getConstString(offset + 69, $inst_d_rmrks);
	}

	/**
	 * Order details remarks 指図明細備考.<p>
	 *
	 */
	public void inst_d_rmrks(String value) {
		setConstString(offset + 69, $inst_d_rmrks, value);
	}


	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public String sub_char1() {
		return getConstString(offset + 70, $sub_char1);
	}

	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public void sub_char1(String value) {
		setConstString(offset + 70, $sub_char1, value);
	}


	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public String sub_char2() {
		return getConstString(offset + 71, $sub_char2);
	}

	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public void sub_char2(String value) {
		setConstString(offset + 71, $sub_char2, value);
	}


	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public String sub_char3() {
		return getConstString(offset + 72, $sub_char3);
	}

	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public void sub_char3(String value) {
		setConstString(offset + 72, $sub_char3, value);
	}


	/**
	 * To allocate flg. 引当対象ＦＬＧ.<p>
	 *
	 */
	public boolean alloc_tgt_flg() {
		return getConstBoolean(offset + 73, $alloc_tgt_flg);
	}

	/**
	 * To allocate flg. 引当対象ＦＬＧ.<p>
	 *
	 */
	public void alloc_tgt_flg(boolean value) {
		setConstBoolean(offset + 73, $alloc_tgt_flg, value);
	}


	/**
	 * Allocation flg. 引当ＦＬＧ.<p>
	 *
	 */
	public boolean alloc_flg() {
		return getConstBoolean(offset + 74, $alloc_flg);
	}

	/**
	 * Allocation flg. 引当ＦＬＧ.<p>
	 *
	 */
	public void alloc_flg(boolean value) {
		setConstBoolean(offset + 74, $alloc_flg, value);
	}


	/**
	 * Order aggregation flg. 指図まとめフラグ.<p>
	 *
	 */
	public boolean inst_bndl_flg() {
		return getConstBoolean(offset + 75, $inst_bndl_flg);
	}

	/**
	 * Order aggregation flg. 指図まとめフラグ.<p>
	 *
	 */
	public void inst_bndl_flg(boolean value) {
		setConstBoolean(offset + 75, $inst_bndl_flg, value);
	}


	/**
	 * Component check not required at shipping flg. 出荷時構成チェック不要ＦＬＧ.<p>
	 *
	 */
	public boolean skip_chk_ship_flg() {
		return getConstBoolean(offset + 76, $skip_chk_ship_flg);
	}

	/**
	 * Component check not required at shipping flg. 出荷時構成チェック不要ＦＬＧ.<p>
	 *
	 */
	public void skip_chk_ship_flg(boolean value) {
		setConstBoolean(offset + 76, $skip_chk_ship_flg, value);
	}


	/**
	 * Invoice No. インボイスＮＯ.<p>
	 *
	 */
	public String iv_no() {
		return getConstString(offset + 77, $iv_no);
	}

	/**
	 * Invoice No. インボイスＮＯ.<p>
	 *
	 */
	public void iv_no(String value) {
		setConstString(offset + 77, $iv_no, value);
	}


	/**
	 * Invoice details No. インボイス明細ＮＯ.<p>
	 *
	 */
	public String iv_d_no() {
		return getConstString(offset + 78, $iv_d_no);
	}

	/**
	 * Invoice details No. インボイス明細ＮＯ.<p>
	 *
	 */
	public void iv_d_no(String value) {
		setConstString(offset + 78, $iv_d_no, value);
	}


	/**
	 * Delivery note details No. 納品書明細ＮＯ.<p>
	 *
	 */
	public String dlv_slip_d_no() {
		return getConstString(offset + 79, $dlv_slip_d_no);
	}

	/**
	 * Delivery note details No. 納品書明細ＮＯ.<p>
	 *
	 */
	public void dlv_slip_d_no(String value) {
		setConstString(offset + 79, $dlv_slip_d_no, value);
	}


	/**
	 * Delivery note No. 納品書ＮＯ.<p>
	 *
	 */
	public String dlv_slip_no() {
		return getConstString(offset + 80, $dlv_slip_no);
	}

	/**
	 * Delivery note No. 納品書ＮＯ.<p>
	 *
	 */
	public void dlv_slip_no(String value) {
		setConstString(offset + 80, $dlv_slip_no, value);
	}


	/**
	 * Allocation range type 引当範囲区分.<p>
	 *
	 */
	public String alloc_scope_typ() {
		return getConstString(offset + 81, $alloc_scope_typ);
	}

	/**
	 * Allocation range type 引当範囲区分.<p>
	 *
	 */
	public void alloc_scope_typ(String value) {
		setConstString(offset + 81, $alloc_scope_typ, value);
	}


	/**
	 * Scheduled shipping date and time 出荷予定日時.<p>
	 *
	 */
	public MCDate ship_schd_tm() {
		return getConstDate(offset + 82, $ship_schd_tm);
	}

	/**
	 * Scheduled shipping date and time 出荷予定日時.<p>
	 *
	 */
	public void ship_schd_tm(MCDate value) {
		setConstDate(offset + 82, $ship_schd_tm, value);
	}


	public mcframe.serverMS.dbc.MST_SHIP_ALLOC_STS_R sas(){
		return (mcframe.serverMS.dbc.MST_SHIP_ALLOC_STS_R) getConstInnerRow(offset + 83, $sas);
	}
	
	public void sas(mcframe.serverMS.dbc.MST_SHIP_ALLOC_STS_R row){
		setConstInnerRow(offset + 83, $sas, row);
	}


	/**
	 * Header details pegged ヘッダ明細紐付.<p>
	 *
	 */
	public MCNumber hdr_dtl_peg() {
		return getConstNumber(offset + 84, $hdr_dtl_peg);
	}

	/**
	 * Header details pegged ヘッダ明細紐付.<p>
	 *
	 */
	public void hdr_dtl_peg(MCNumber value) {
		setConstNumber(offset + 84, $hdr_dtl_peg, value);
	}

	/**
	 * Header details pegged ヘッダ明細紐付.<p>
	 *
	 */
	public void hdr_dtl_peg(int value) {
		setConstNumber(offset + 84, $hdr_dtl_peg, value);
	}

	/**
	 * Header details pegged ヘッダ明細紐付.<p>
	 *
	 */
	public void hdr_dtl_peg(long value) {
		setConstNumber(offset + 84, $hdr_dtl_peg, value);
	}

	/**
	 * Header details pegged ヘッダ明細紐付.<p>
	 *
	 */
	public void hdr_dtl_peg(float value) {
		setConstNumber(offset + 84, $hdr_dtl_peg, value);
	}

	/**
	 * Header details pegged ヘッダ明細紐付.<p>
	 *
	 */
	public void hdr_dtl_peg(double value) {
		setConstNumber(offset + 84, $hdr_dtl_peg, value);
	}


	/**
	 * WMS ＷＭＳ.<p>
	 *
	 */
	public boolean wms_flg() {
		return getConstBoolean(offset + 85, $wms_flg);
	}

	/**
	 * WMS ＷＭＳ.<p>
	 *
	 */
	public void wms_flg(boolean value) {
		setConstBoolean(offset + 85, $wms_flg, value);
	}


	public String getString(String name) {
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			return data_crud_typ();
		}
		if ($ship_inst_d_no.equalsIgnoreCase(name)) {
			return ship_inst_d_no();
		}
		if ($ship_inst_no.equalsIgnoreCase(name)) {
			return ship_inst_no();
		}
		if ($ship_loc_cd.equalsIgnoreCase(name)) {
			return ship_loc_cd();
		}
		if ($ship_str_ln_cd.equalsIgnoreCase(name)) {
			return ship_str_ln_cd();
		}
		if ($ship_lg_grp_cd.equalsIgnoreCase(name)) {
			return ship_lg_grp_cd();
		}
		if ($alloc_loc_cd.equalsIgnoreCase(name)) {
			return alloc_loc_cd();
		}
		if ($alloc_str_ln_cd.equalsIgnoreCase(name)) {
			return alloc_str_ln_cd();
		}
		if ($dlv_str_ln_cd.equalsIgnoreCase(name)) {
			return dlv_str_ln_cd();
		}
		if ($trd_cd.equalsIgnoreCase(name)) {
			return trd_cd();
		}
		if ($trd_ptn_typ.equalsIgnoreCase(name)) {
			return trd_ptn_typ();
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
		if ($lot_no.equalsIgnoreCase(name)) {
			return lot_no();
		}
		if ($sublot_no.equalsIgnoreCase(name)) {
			return sublot_no();
		}
		if ($ver_no.equalsIgnoreCase(name)) {
			return ver_no();
		}
		if ($alloc_lot_no.equalsIgnoreCase(name)) {
			return alloc_lot_no();
		}
		if ($alloc_sublot_no.equalsIgnoreCase(name)) {
			return alloc_sublot_no();
		}
		if ($alloc_ver_no.equalsIgnoreCase(name)) {
			return alloc_ver_no();
		}
		if ($stk_arrv_bp_cd.equalsIgnoreCase(name)) {
			return stk_arrv_bp_cd();
		}
		if ($gd_cd.equalsIgnoreCase(name)) {
			return gd_cd();
		}
		if ($quality_typ.equalsIgnoreCase(name)) {
			return quality_typ();
		}
		if ($stk_insp_typ.equalsIgnoreCase(name)) {
			return stk_insp_typ();
		}
		if ($stk_id_typ.equalsIgnoreCase(name)) {
			return stk_id_typ();
		}
		if ($stk_bp_cd.equalsIgnoreCase(name)) {
			return stk_bp_cd();
		}
		if ($trd_unit_cd.equalsIgnoreCase(name)) {
			return trd_unit_cd();
		}
		if ($base_unit_cd.equalsIgnoreCase(name)) {
			return base_unit_cd();
		}
		if ($alloc_ent_unit_cd.equalsIgnoreCase(name)) {
			return alloc_ent_unit_cd();
		}
		if ($alloc_base_unit_cd.equalsIgnoreCase(name)) {
			return alloc_base_unit_cd();
		}
		if ($rsn_cd.equalsIgnoreCase(name)) {
			return rsn_cd();
		}
		if ($bd_dpt_cd.equalsIgnoreCase(name)) {
			return bd_dpt_cd();
		}
		if ($base_dlv_slip_no.equalsIgnoreCase(name)) {
			return base_dlv_slip_no();
		}
		if ($base_prov_act_no.equalsIgnoreCase(name)) {
			return base_prov_act_no();
		}
		if ($ship_cnt_rmrks.equalsIgnoreCase(name)) {
			return ship_cnt_rmrks();
		}
		if ($trd_rmrks.equalsIgnoreCase(name)) {
			return trd_rmrks();
		}
		if ($trd_d_rmrks.equalsIgnoreCase(name)) {
			return trd_d_rmrks();
		}
		if ($intr_d_rmrks.equalsIgnoreCase(name)) {
			return intr_d_rmrks();
		}
		if ($inst_d_rmrks.equalsIgnoreCase(name)) {
			return inst_d_rmrks();
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
		if ($iv_no.equalsIgnoreCase(name)) {
			return iv_no();
		}
		if ($iv_d_no.equalsIgnoreCase(name)) {
			return iv_d_no();
		}
		if ($dlv_slip_d_no.equalsIgnoreCase(name)) {
			return dlv_slip_d_no();
		}
		if ($dlv_slip_no.equalsIgnoreCase(name)) {
			return dlv_slip_no();
		}
		if ($alloc_scope_typ.equalsIgnoreCase(name)) {
			return alloc_scope_typ();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($peg_no.equalsIgnoreCase(name)) {
			return peg_no();
		}
		if ($tmp_inst_d_no.equalsIgnoreCase(name)) {
			return tmp_inst_d_no();
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			return disp_seq();
		}
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			return trd_unit_qty();
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			return base_unit_qty();
		}
		if ($alloc_ent_unit_qty.equalsIgnoreCase(name)) {
			return alloc_ent_unit_qty();
		}
		if ($alloc_base_unit_qty.equalsIgnoreCase(name)) {
			return alloc_base_unit_qty();
		}
		if ($hdr_dtl_peg.equalsIgnoreCase(name)) {
			return hdr_dtl_peg();
		}
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		if ($valid_dt_from.equalsIgnoreCase(name)) {
			return valid_dt_from();
		}
		if ($valid_dt_to.equalsIgnoreCase(name)) {
			return valid_dt_to();
		}
		if ($base_ac_dt.equalsIgnoreCase(name)) {
			return base_ac_dt();
		}
		if ($ship_schd_tm.equalsIgnoreCase(name)) {
			return ship_schd_tm();
		}
		return super.getDate(name);
	}
	public boolean getBoolean(String name) {
		if ($err_flg.equalsIgnoreCase(name)) {
			return err_flg();
		}
		if ($sundry_itm_flg.equalsIgnoreCase(name)) {
			return sundry_itm_flg();
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
		if ($lot_none_flg.equalsIgnoreCase(name)) {
			return lot_none_flg();
		}
		if ($abort_flg.equalsIgnoreCase(name)) {
			return abort_flg();
		}
		if ($not_lot_mix_flg.equalsIgnoreCase(name)) {
			return not_lot_mix_flg();
		}
		if ($not_sublot_mix_flg.equalsIgnoreCase(name)) {
			return not_sublot_mix_flg();
		}
		if ($alloc_tgt_flg.equalsIgnoreCase(name)) {
			return alloc_tgt_flg();
		}
		if ($alloc_flg.equalsIgnoreCase(name)) {
			return alloc_flg();
		}
		if ($inst_bndl_flg.equalsIgnoreCase(name)) {
			return inst_bndl_flg();
		}
		if ($skip_chk_ship_flg.equalsIgnoreCase(name)) {
			return skip_chk_ship_flg();
		}
		if ($wms_flg.equalsIgnoreCase(name)) {
			return wms_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			return data_crud_typ();
		}
		if ($ship_inst_d_no.equalsIgnoreCase(name)) {
			return ship_inst_d_no();
		}
		if ($ship_inst_no.equalsIgnoreCase(name)) {
			return ship_inst_no();
		}
		if ($ship_loc_cd.equalsIgnoreCase(name)) {
			return ship_loc_cd();
		}
		if ($ship_str_ln_cd.equalsIgnoreCase(name)) {
			return ship_str_ln_cd();
		}
		if ($ship_lg_grp_cd.equalsIgnoreCase(name)) {
			return ship_lg_grp_cd();
		}
		if ($alloc_loc_cd.equalsIgnoreCase(name)) {
			return alloc_loc_cd();
		}
		if ($alloc_str_ln_cd.equalsIgnoreCase(name)) {
			return alloc_str_ln_cd();
		}
		if ($dlv_str_ln_cd.equalsIgnoreCase(name)) {
			return dlv_str_ln_cd();
		}
		if ($trd_cd.equalsIgnoreCase(name)) {
			return trd_cd();
		}
		if ($trd_ptn_typ.equalsIgnoreCase(name)) {
			return trd_ptn_typ();
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
		if ($lot_no.equalsIgnoreCase(name)) {
			return lot_no();
		}
		if ($sublot_no.equalsIgnoreCase(name)) {
			return sublot_no();
		}
		if ($ver_no.equalsIgnoreCase(name)) {
			return ver_no();
		}
		if ($alloc_lot_no.equalsIgnoreCase(name)) {
			return alloc_lot_no();
		}
		if ($alloc_sublot_no.equalsIgnoreCase(name)) {
			return alloc_sublot_no();
		}
		if ($alloc_ver_no.equalsIgnoreCase(name)) {
			return alloc_ver_no();
		}
		if ($stk_arrv_bp_cd.equalsIgnoreCase(name)) {
			return stk_arrv_bp_cd();
		}
		if ($gd_cd.equalsIgnoreCase(name)) {
			return gd_cd();
		}
		if ($quality_typ.equalsIgnoreCase(name)) {
			return quality_typ();
		}
		if ($stk_insp_typ.equalsIgnoreCase(name)) {
			return stk_insp_typ();
		}
		if ($stk_id_typ.equalsIgnoreCase(name)) {
			return stk_id_typ();
		}
		if ($stk_bp_cd.equalsIgnoreCase(name)) {
			return stk_bp_cd();
		}
		if ($trd_unit_cd.equalsIgnoreCase(name)) {
			return trd_unit_cd();
		}
		if ($base_unit_cd.equalsIgnoreCase(name)) {
			return base_unit_cd();
		}
		if ($alloc_ent_unit_cd.equalsIgnoreCase(name)) {
			return alloc_ent_unit_cd();
		}
		if ($alloc_base_unit_cd.equalsIgnoreCase(name)) {
			return alloc_base_unit_cd();
		}
		if ($rsn_cd.equalsIgnoreCase(name)) {
			return rsn_cd();
		}
		if ($bd_dpt_cd.equalsIgnoreCase(name)) {
			return bd_dpt_cd();
		}
		if ($base_dlv_slip_no.equalsIgnoreCase(name)) {
			return base_dlv_slip_no();
		}
		if ($base_prov_act_no.equalsIgnoreCase(name)) {
			return base_prov_act_no();
		}
		if ($ship_cnt_rmrks.equalsIgnoreCase(name)) {
			return ship_cnt_rmrks();
		}
		if ($trd_rmrks.equalsIgnoreCase(name)) {
			return trd_rmrks();
		}
		if ($trd_d_rmrks.equalsIgnoreCase(name)) {
			return trd_d_rmrks();
		}
		if ($intr_d_rmrks.equalsIgnoreCase(name)) {
			return intr_d_rmrks();
		}
		if ($inst_d_rmrks.equalsIgnoreCase(name)) {
			return inst_d_rmrks();
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
		if ($iv_no.equalsIgnoreCase(name)) {
			return iv_no();
		}
		if ($iv_d_no.equalsIgnoreCase(name)) {
			return iv_d_no();
		}
		if ($dlv_slip_d_no.equalsIgnoreCase(name)) {
			return dlv_slip_d_no();
		}
		if ($dlv_slip_no.equalsIgnoreCase(name)) {
			return dlv_slip_no();
		}
		if ($alloc_scope_typ.equalsIgnoreCase(name)) {
			return alloc_scope_typ();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($peg_no.equalsIgnoreCase(name)) {
			return peg_no();
		}
		if ($tmp_inst_d_no.equalsIgnoreCase(name)) {
			return tmp_inst_d_no();
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			return disp_seq();
		}
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			return trd_unit_qty();
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			return base_unit_qty();
		}
		if ($alloc_ent_unit_qty.equalsIgnoreCase(name)) {
			return alloc_ent_unit_qty();
		}
		if ($alloc_base_unit_qty.equalsIgnoreCase(name)) {
			return alloc_base_unit_qty();
		}
		if ($hdr_dtl_peg.equalsIgnoreCase(name)) {
			return hdr_dtl_peg();
		}
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($valid_dt_from.equalsIgnoreCase(name)) {
			return valid_dt_from();
		}
		if ($valid_dt_to.equalsIgnoreCase(name)) {
			return valid_dt_to();
		}
		if ($base_ac_dt.equalsIgnoreCase(name)) {
			return base_ac_dt();
		}
		if ($ship_schd_tm.equalsIgnoreCase(name)) {
			return ship_schd_tm();
		}
		return super.getDateNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($err_flg.equalsIgnoreCase(name)) {
			return err_flg();
		}
		if ($sundry_itm_flg.equalsIgnoreCase(name)) {
			return sundry_itm_flg();
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
		if ($lot_none_flg.equalsIgnoreCase(name)) {
			return lot_none_flg();
		}
		if ($abort_flg.equalsIgnoreCase(name)) {
			return abort_flg();
		}
		if ($not_lot_mix_flg.equalsIgnoreCase(name)) {
			return not_lot_mix_flg();
		}
		if ($not_sublot_mix_flg.equalsIgnoreCase(name)) {
			return not_sublot_mix_flg();
		}
		if ($alloc_tgt_flg.equalsIgnoreCase(name)) {
			return alloc_tgt_flg();
		}
		if ($alloc_flg.equalsIgnoreCase(name)) {
			return alloc_flg();
		}
		if ($inst_bndl_flg.equalsIgnoreCase(name)) {
			return inst_bndl_flg();
		}
		if ($skip_chk_ship_flg.equalsIgnoreCase(name)) {
			return skip_chk_ship_flg();
		}
		if ($wms_flg.equalsIgnoreCase(name)) {
			return wms_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			data_crud_typ(value);
			return;
		}
		if ($ship_inst_d_no.equalsIgnoreCase(name)) {
			ship_inst_d_no(value);
			return;
		}
		if ($ship_inst_no.equalsIgnoreCase(name)) {
			ship_inst_no(value);
			return;
		}
		if ($ship_loc_cd.equalsIgnoreCase(name)) {
			ship_loc_cd(value);
			return;
		}
		if ($ship_str_ln_cd.equalsIgnoreCase(name)) {
			ship_str_ln_cd(value);
			return;
		}
		if ($ship_lg_grp_cd.equalsIgnoreCase(name)) {
			ship_lg_grp_cd(value);
			return;
		}
		if ($alloc_loc_cd.equalsIgnoreCase(name)) {
			alloc_loc_cd(value);
			return;
		}
		if ($alloc_str_ln_cd.equalsIgnoreCase(name)) {
			alloc_str_ln_cd(value);
			return;
		}
		if ($dlv_str_ln_cd.equalsIgnoreCase(name)) {
			dlv_str_ln_cd(value);
			return;
		}
		if ($trd_cd.equalsIgnoreCase(name)) {
			trd_cd(value);
			return;
		}
		if ($trd_ptn_typ.equalsIgnoreCase(name)) {
			trd_ptn_typ(value);
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
		if ($alloc_lot_no.equalsIgnoreCase(name)) {
			alloc_lot_no(value);
			return;
		}
		if ($alloc_sublot_no.equalsIgnoreCase(name)) {
			alloc_sublot_no(value);
			return;
		}
		if ($alloc_ver_no.equalsIgnoreCase(name)) {
			alloc_ver_no(value);
			return;
		}
		if ($stk_arrv_bp_cd.equalsIgnoreCase(name)) {
			stk_arrv_bp_cd(value);
			return;
		}
		if ($gd_cd.equalsIgnoreCase(name)) {
			gd_cd(value);
			return;
		}
		if ($quality_typ.equalsIgnoreCase(name)) {
			quality_typ(value);
			return;
		}
		if ($stk_insp_typ.equalsIgnoreCase(name)) {
			stk_insp_typ(value);
			return;
		}
		if ($stk_id_typ.equalsIgnoreCase(name)) {
			stk_id_typ(value);
			return;
		}
		if ($stk_bp_cd.equalsIgnoreCase(name)) {
			stk_bp_cd(value);
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
		if ($alloc_ent_unit_cd.equalsIgnoreCase(name)) {
			alloc_ent_unit_cd(value);
			return;
		}
		if ($alloc_base_unit_cd.equalsIgnoreCase(name)) {
			alloc_base_unit_cd(value);
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
		if ($base_dlv_slip_no.equalsIgnoreCase(name)) {
			base_dlv_slip_no(value);
			return;
		}
		if ($base_prov_act_no.equalsIgnoreCase(name)) {
			base_prov_act_no(value);
			return;
		}
		if ($ship_cnt_rmrks.equalsIgnoreCase(name)) {
			ship_cnt_rmrks(value);
			return;
		}
		if ($trd_rmrks.equalsIgnoreCase(name)) {
			trd_rmrks(value);
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
		if ($inst_d_rmrks.equalsIgnoreCase(name)) {
			inst_d_rmrks(value);
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
		if ($iv_no.equalsIgnoreCase(name)) {
			iv_no(value);
			return;
		}
		if ($iv_d_no.equalsIgnoreCase(name)) {
			iv_d_no(value);
			return;
		}
		if ($dlv_slip_d_no.equalsIgnoreCase(name)) {
			dlv_slip_d_no(value);
			return;
		}
		if ($dlv_slip_no.equalsIgnoreCase(name)) {
			dlv_slip_no(value);
			return;
		}
		if ($alloc_scope_typ.equalsIgnoreCase(name)) {
			alloc_scope_typ(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($tmp_inst_d_no.equalsIgnoreCase(name)) {
			tmp_inst_d_no(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
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
		if ($alloc_ent_unit_qty.equalsIgnoreCase(name)) {
			alloc_ent_unit_qty(value);
			return;
		}
		if ($alloc_base_unit_qty.equalsIgnoreCase(name)) {
			alloc_base_unit_qty(value);
			return;
		}
		if ($hdr_dtl_peg.equalsIgnoreCase(name)) {
			hdr_dtl_peg(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($tmp_inst_d_no.equalsIgnoreCase(name)) {
			tmp_inst_d_no(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
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
		if ($alloc_ent_unit_qty.equalsIgnoreCase(name)) {
			alloc_ent_unit_qty(value);
			return;
		}
		if ($alloc_base_unit_qty.equalsIgnoreCase(name)) {
			alloc_base_unit_qty(value);
			return;
		}
		if ($hdr_dtl_peg.equalsIgnoreCase(name)) {
			hdr_dtl_peg(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($tmp_inst_d_no.equalsIgnoreCase(name)) {
			tmp_inst_d_no(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
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
		if ($alloc_ent_unit_qty.equalsIgnoreCase(name)) {
			alloc_ent_unit_qty(value);
			return;
		}
		if ($alloc_base_unit_qty.equalsIgnoreCase(name)) {
			alloc_base_unit_qty(value);
			return;
		}
		if ($hdr_dtl_peg.equalsIgnoreCase(name)) {
			hdr_dtl_peg(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($tmp_inst_d_no.equalsIgnoreCase(name)) {
			tmp_inst_d_no(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
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
		if ($alloc_ent_unit_qty.equalsIgnoreCase(name)) {
			alloc_ent_unit_qty(value);
			return;
		}
		if ($alloc_base_unit_qty.equalsIgnoreCase(name)) {
			alloc_base_unit_qty(value);
			return;
		}
		if ($hdr_dtl_peg.equalsIgnoreCase(name)) {
			hdr_dtl_peg(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($tmp_inst_d_no.equalsIgnoreCase(name)) {
			tmp_inst_d_no(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
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
		if ($alloc_ent_unit_qty.equalsIgnoreCase(name)) {
			alloc_ent_unit_qty(value);
			return;
		}
		if ($alloc_base_unit_qty.equalsIgnoreCase(name)) {
			alloc_base_unit_qty(value);
			return;
		}
		if ($hdr_dtl_peg.equalsIgnoreCase(name)) {
			hdr_dtl_peg(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($valid_dt_from.equalsIgnoreCase(name)) {
			valid_dt_from(value);
			return;
		}
		if ($valid_dt_to.equalsIgnoreCase(name)) {
			valid_dt_to(value);
			return;
		}
		if ($base_ac_dt.equalsIgnoreCase(name)) {
			base_ac_dt(value);
			return;
		}
		if ($ship_schd_tm.equalsIgnoreCase(name)) {
			ship_schd_tm(value);
			return;
		}
		super.setDate(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($err_flg.equalsIgnoreCase(name)) {
			err_flg(value);
			return;
		}
		if ($sundry_itm_flg.equalsIgnoreCase(name)) {
			sundry_itm_flg(value);
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
		if ($lot_none_flg.equalsIgnoreCase(name)) {
			lot_none_flg(value);
			return;
		}
		if ($abort_flg.equalsIgnoreCase(name)) {
			abort_flg(value);
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
		if ($alloc_tgt_flg.equalsIgnoreCase(name)) {
			alloc_tgt_flg(value);
			return;
		}
		if ($alloc_flg.equalsIgnoreCase(name)) {
			alloc_flg(value);
			return;
		}
		if ($inst_bndl_flg.equalsIgnoreCase(name)) {
			inst_bndl_flg(value);
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
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			data_crud_typ(value);
			return;
		}
		if ($ship_inst_d_no.equalsIgnoreCase(name)) {
			ship_inst_d_no(value);
			return;
		}
		if ($ship_inst_no.equalsIgnoreCase(name)) {
			ship_inst_no(value);
			return;
		}
		if ($ship_loc_cd.equalsIgnoreCase(name)) {
			ship_loc_cd(value);
			return;
		}
		if ($ship_str_ln_cd.equalsIgnoreCase(name)) {
			ship_str_ln_cd(value);
			return;
		}
		if ($ship_lg_grp_cd.equalsIgnoreCase(name)) {
			ship_lg_grp_cd(value);
			return;
		}
		if ($alloc_loc_cd.equalsIgnoreCase(name)) {
			alloc_loc_cd(value);
			return;
		}
		if ($alloc_str_ln_cd.equalsIgnoreCase(name)) {
			alloc_str_ln_cd(value);
			return;
		}
		if ($dlv_str_ln_cd.equalsIgnoreCase(name)) {
			dlv_str_ln_cd(value);
			return;
		}
		if ($trd_cd.equalsIgnoreCase(name)) {
			trd_cd(value);
			return;
		}
		if ($trd_ptn_typ.equalsIgnoreCase(name)) {
			trd_ptn_typ(value);
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
		if ($alloc_lot_no.equalsIgnoreCase(name)) {
			alloc_lot_no(value);
			return;
		}
		if ($alloc_sublot_no.equalsIgnoreCase(name)) {
			alloc_sublot_no(value);
			return;
		}
		if ($alloc_ver_no.equalsIgnoreCase(name)) {
			alloc_ver_no(value);
			return;
		}
		if ($stk_arrv_bp_cd.equalsIgnoreCase(name)) {
			stk_arrv_bp_cd(value);
			return;
		}
		if ($gd_cd.equalsIgnoreCase(name)) {
			gd_cd(value);
			return;
		}
		if ($quality_typ.equalsIgnoreCase(name)) {
			quality_typ(value);
			return;
		}
		if ($stk_insp_typ.equalsIgnoreCase(name)) {
			stk_insp_typ(value);
			return;
		}
		if ($stk_id_typ.equalsIgnoreCase(name)) {
			stk_id_typ(value);
			return;
		}
		if ($stk_bp_cd.equalsIgnoreCase(name)) {
			stk_bp_cd(value);
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
		if ($alloc_ent_unit_cd.equalsIgnoreCase(name)) {
			alloc_ent_unit_cd(value);
			return;
		}
		if ($alloc_base_unit_cd.equalsIgnoreCase(name)) {
			alloc_base_unit_cd(value);
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
		if ($base_dlv_slip_no.equalsIgnoreCase(name)) {
			base_dlv_slip_no(value);
			return;
		}
		if ($base_prov_act_no.equalsIgnoreCase(name)) {
			base_prov_act_no(value);
			return;
		}
		if ($ship_cnt_rmrks.equalsIgnoreCase(name)) {
			ship_cnt_rmrks(value);
			return;
		}
		if ($trd_rmrks.equalsIgnoreCase(name)) {
			trd_rmrks(value);
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
		if ($inst_d_rmrks.equalsIgnoreCase(name)) {
			inst_d_rmrks(value);
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
		if ($iv_no.equalsIgnoreCase(name)) {
			iv_no(value);
			return;
		}
		if ($iv_d_no.equalsIgnoreCase(name)) {
			iv_d_no(value);
			return;
		}
		if ($dlv_slip_d_no.equalsIgnoreCase(name)) {
			dlv_slip_d_no(value);
			return;
		}
		if ($dlv_slip_no.equalsIgnoreCase(name)) {
			dlv_slip_no(value);
			return;
		}
		if ($alloc_scope_typ.equalsIgnoreCase(name)) {
			alloc_scope_typ(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($tmp_inst_d_no.equalsIgnoreCase(name)) {
			tmp_inst_d_no(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
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
		if ($alloc_ent_unit_qty.equalsIgnoreCase(name)) {
			alloc_ent_unit_qty(value);
			return;
		}
		if ($alloc_base_unit_qty.equalsIgnoreCase(name)) {
			alloc_base_unit_qty(value);
			return;
		}
		if ($hdr_dtl_peg.equalsIgnoreCase(name)) {
			hdr_dtl_peg(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($tmp_inst_d_no.equalsIgnoreCase(name)) {
			tmp_inst_d_no(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
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
		if ($alloc_ent_unit_qty.equalsIgnoreCase(name)) {
			alloc_ent_unit_qty(value);
			return;
		}
		if ($alloc_base_unit_qty.equalsIgnoreCase(name)) {
			alloc_base_unit_qty(value);
			return;
		}
		if ($hdr_dtl_peg.equalsIgnoreCase(name)) {
			hdr_dtl_peg(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($tmp_inst_d_no.equalsIgnoreCase(name)) {
			tmp_inst_d_no(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
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
		if ($alloc_ent_unit_qty.equalsIgnoreCase(name)) {
			alloc_ent_unit_qty(value);
			return;
		}
		if ($alloc_base_unit_qty.equalsIgnoreCase(name)) {
			alloc_base_unit_qty(value);
			return;
		}
		if ($hdr_dtl_peg.equalsIgnoreCase(name)) {
			hdr_dtl_peg(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($tmp_inst_d_no.equalsIgnoreCase(name)) {
			tmp_inst_d_no(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
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
		if ($alloc_ent_unit_qty.equalsIgnoreCase(name)) {
			alloc_ent_unit_qty(value);
			return;
		}
		if ($alloc_base_unit_qty.equalsIgnoreCase(name)) {
			alloc_base_unit_qty(value);
			return;
		}
		if ($hdr_dtl_peg.equalsIgnoreCase(name)) {
			hdr_dtl_peg(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($tmp_inst_d_no.equalsIgnoreCase(name)) {
			tmp_inst_d_no(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
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
		if ($alloc_ent_unit_qty.equalsIgnoreCase(name)) {
			alloc_ent_unit_qty(value);
			return;
		}
		if ($alloc_base_unit_qty.equalsIgnoreCase(name)) {
			alloc_base_unit_qty(value);
			return;
		}
		if ($hdr_dtl_peg.equalsIgnoreCase(name)) {
			hdr_dtl_peg(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($valid_dt_from.equalsIgnoreCase(name)) {
			valid_dt_from(value);
			return;
		}
		if ($valid_dt_to.equalsIgnoreCase(name)) {
			valid_dt_to(value);
			return;
		}
		if ($base_ac_dt.equalsIgnoreCase(name)) {
			base_ac_dt(value);
			return;
		}
		if ($ship_schd_tm.equalsIgnoreCase(name)) {
			ship_schd_tm(value);
			return;
		}
		super.setDateNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($err_flg.equalsIgnoreCase(name)) {
			err_flg(value);
			return;
		}
		if ($sundry_itm_flg.equalsIgnoreCase(name)) {
			sundry_itm_flg(value);
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
		if ($lot_none_flg.equalsIgnoreCase(name)) {
			lot_none_flg(value);
			return;
		}
		if ($abort_flg.equalsIgnoreCase(name)) {
			abort_flg(value);
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
		if ($alloc_tgt_flg.equalsIgnoreCase(name)) {
			alloc_tgt_flg(value);
			return;
		}
		if ($alloc_flg.equalsIgnoreCase(name)) {
			alloc_flg(value);
			return;
		}
		if ($inst_bndl_flg.equalsIgnoreCase(name)) {
			inst_bndl_flg(value);
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
		super.setBooleanNE(name, value);
	}

	public MCRow getInnerRow(String name) {
		if ($sas.equalsIgnoreCase(name)) {
			return sas();
		}
		return super.getInnerRow(name);
	}

	public void setInnerRow(String name, MCRow value) {
		if ($sas.equalsIgnoreCase(name)) {
			sas(
				((MCContainerMeta) sas_META).castInnerRow(mcframe.serverMS.dbc.MST_SHIP_ALLOC_STS_R.class, value)
			);
			return;
		}
		super.setInnerRow(name, value);
	}


	/**
	 * Shipping allocation status No. 出荷引当状況ＮＯ.<p>
	 *
	 */
	public String ship_alloc_sts_no() {
		return sas().ship_alloc_sts_no();
	}

	/**
	 * Shipping allocation status No. 出荷引当状況ＮＯ.<p>
	 *
	 */
	public void ship_alloc_sts_no(String value) {
		sas().ship_alloc_sts_no(value);
	}

	/**
	 * Allocation (Allocation status) 引当（引当状況）.<p>
	 *
	 */
	public boolean sas_alloc_flg() {
		return sas().alloc_flg();
	}

	/**
	 * Allocation (Allocation status) 引当（引当状況）.<p>
	 *
	 */
	public void sas_alloc_flg(boolean value) {
		sas().alloc_flg(value);
	}

	/**
	 * SKU qty. 荷姿単位数量.<p>
	 *
	 */
	public MCNumber pack_unit_qty() {
		return sas().pack_unit_qty();
	}

	/**
	 * SKU qty. 荷姿単位数量.<p>
	 *
	 */
	public void pack_unit_qty(MCNumber value) {
		sas().pack_unit_qty(value);
	}

	/**
	 * SKU qty. 荷姿単位数量.<p>
	 *
	 */
	public void pack_unit_qty(int value) {
		sas().pack_unit_qty(value);
	}

	/**
	 * SKU qty. 荷姿単位数量.<p>
	 *
	 */
	public void pack_unit_qty(long value) {
		sas().pack_unit_qty(value);
	}

	/**
	 * SKU qty. 荷姿単位数量.<p>
	 *
	 */
	public void pack_unit_qty(float value) {
		sas().pack_unit_qty(value);
	}

	/**
	 * SKU qty. 荷姿単位数量.<p>
	 *
	 */
	public void pack_unit_qty(double value) {
		sas().pack_unit_qty(value);
	}

	/**
	 * SKU cd. 荷姿単位ＣＤ.<p>
	 *
	 */
	public String pack_unit_cd() {
		return sas().pack_unit_cd();
	}

	/**
	 * SKU cd. 荷姿単位ＣＤ.<p>
	 *
	 */
	public void pack_unit_cd(String value) {
		sas().pack_unit_cd(value);
	}

}

