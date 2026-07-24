package mcframe.clientMSBC.MSBCP0190;

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

	public static final String $hrrchy_p = "hrrchy_p";
	public static final String $itm_p = "itm_p";
	/**
	 * Transaction 取引.<p>
	 *
	 */
	public static final String $trd_nm = "trd_nm";
	/**
	 * Data データ.<p>
	 *
	 */
	public static final String $ord_ext_dat_typ_nm = "ord_ext_dat_typ_nm";
	/**
	 * Data No. データＮＯ.<p>
	 *
	 */
	public static final String $ord_ext_dat_no = "ord_ext_dat_no";
	/**
	 * Storage location/delivery destination cd. 格納場所／納品先ＣＤ.<p>
	 *
	 */
	public static final String $strg_dlv_cd = "strg_dlv_cd";
	/**
	 * Storage location name/delivery destination name 格納場所名／納品先名.<p>
	 *
	 */
	public static final String $strg_dlv_nm = "strg_dlv_nm";
	/**
	 * Transaction location/BP cd. 取引場所／取引先ＣＤ.<p>
	 *
	 */
	public static final String $trd_loc_bp_cd = "trd_loc_bp_cd";
	/**
	 * Transaction location name/BP name 取引場所名／取引先名.<p>
	 *
	 */
	public static final String $trd_loc_bp_nm = "trd_loc_bp_nm";
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
	public static final String $base_dec_place = "base_dec_place";
	public static final String $schd_alloc_qty_p = "schd_alloc_qty_p";
	/**
	 * Scheduled storage date 格納予定日.<p>
	 *
	 */
	public static final String $strg_schd_dt = "strg_schd_dt";
	/**
	 * Available date 使用可能予定日.<p>
	 *
	 */
	public static final String $avl_schd_dt = "avl_schd_dt";
	public static final String $sno_wrk_no_p = "sno_wrk_no_p";
	/**
	 * Requirements No. 所要ＮＯ.<p>
	 *
	 */
	public static final String $rqmt_no = "rqmt_no";
	/**
	 * Storage location cd. 格納場所ＣＤ.<p>
	 *
	 */
	public static final String $strg_loc_cd = "strg_loc_cd";
	/**
	 * Storage location name 格納場所名.<p>
	 *
	 */
	public static final String $strg_loc_nm = "strg_loc_nm";
	/**
	 * Item order No. 品目オーダＮＯ.<p>
	 *
	 */
	public static final String $itm_ord_no = "itm_ord_no";
	/**
	 * Simulation order シミュレーションオーダ.<p>
	 *
	 */
	public static final String $sim_ord_flg = "sim_ord_flg";
	/**
	 * Order type オーダ区分.<p>
	 *
	 */
	public static final String $itm_ord_typ = "itm_ord_typ";
	/**
	 * Order type name オーダ区分名.<p>
	 *
	 */
	public static final String $itm_ord_typ_nm = "itm_ord_typ_nm";
	/**
	 * Disallow procurement 手配不許可.<p>
	 *
	 */
	public static final String $not_fix_flg = "not_fix_flg";
	/**
	 * Aggregation まとめ.<p>
	 *
	 */
	public static final String $blk_flg = "blk_flg";
	public static final String $inst_qty_p = "inst_qty_p";
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
	 * Operation pattern 工程パタン.<p>
	 *
	 */
	public static final String $oper_ptn = "oper_ptn";
	/**
	 * BOM pattern 構成パタン.<p>
	 *
	 */
	public static final String $bom_ptn = "bom_ptn";
	public static final String $yield_schd_qty_p = "yield_schd_qty_p";
	/**
	 * Scheduled mfg. start date 製造着手予定日.<p>
	 *
	 */
	public static final String $mfg_st_schd_dt = "mfg_st_schd_dt";
	/**
	 * Scheduled mfg. end date 製造終了予定日.<p>
	 *
	 */
	public static final String $mfg_end_schd_dt = "mfg_end_schd_dt";
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
	 * Maker cd. メーカＣＤ.<p>
	 *
	 */
	public static final String $maker_cd = "maker_cd";
	/**
	 * Maker name メーカ名.<p>
	 *
	 */
	public static final String $maker_nm = "maker_nm";
	public static final String $ver_no_p = "ver_no_p";
	/**
	 * Scheduled PO date 発注予定日.<p>
	 *
	 */
	public static final String $po_schd_dt = "po_schd_dt";
	/**
	 * Scheduled acceptance date 検収予定日.<p>
	 *
	 */
	public static final String $accpt_schd_dt = "accpt_schd_dt";
	/**
	 * Requested location cd. 依頼先場所ＣＤ.<p>
	 *
	 */
	public static final String $rqst_loc_cd = "rqst_loc_cd";
	/**
	 * Location name (Requested) 依頼先場所名.<p>
	 *
	 */
	public static final String $rqst_loc_nm = "rqst_loc_nm";
	/**
	 * Requested WG cd. 依頼先ワーキンググループＣＤ.<p>
	 *
	 */
	public static final String $rqst_wg_cd = "rqst_wg_cd";
	/**
	 * Requested WG name 依頼先ワーキンググループ名.<p>
	 *
	 */
	public static final String $rqst_wg_nm = "rqst_wg_nm";
	/**
	 * Scheduled GI date 出庫予定日.<p>
	 *
	 */
	public static final String $gi_schd_dt = "gi_schd_dt";
	/**
	 * Scheduled inspection start date 検査着手予定日.<p>
	 *
	 */
	public static final String $insp_st_schd_dt = "insp_st_schd_dt";
	/**
	 * Scheduled inspection end date 検査終了予定日.<p>
	 *
	 */
	public static final String $insp_end_schd_dt = "insp_end_schd_dt";
	/**
	 * GR/GI schedule No. 受払予定ＮＯ.<p>
	 *
	 */
	public static final String $io_schd_no = "io_schd_no";
	/**
	 * GR/GI schedule type 受払予定区分.<p>
	 *
	 */
	public static final String $io_schd_typ = "io_schd_typ";
	/**
	 * GR/GI schedule type name 受払予定区分名.<p>
	 *
	 */
	public static final String $io_schd_typ_nm = "io_schd_typ_nm";
	/**
	 * GR/GI schedule status 受払予定状況.<p>
	 *
	 */
	public static final String $io_schd_sts_typ = "io_schd_sts_typ";
	/**
	 * GR/GI schedule status type name 受払予定状況名.<p>
	 *
	 */
	public static final String $io_schd_sts_typ_nm = "io_schd_sts_typ_nm";
	/**
	 * GR/GI progress management No. 受払進捗管理ＮＯ.<p>
	 *
	 */
	public static final String $io_schd_pr_no = "io_schd_pr_no";
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
	public static final String $base_unit_qty_p = "base_unit_qty_p";
	/**
	 * SKU cd. 荷姿ＣＤ.<p>
	 *
	 */
	public static final String $pack_unit_cd = "pack_unit_cd";
	/**
	 * SKU name 荷姿名.<p>
	 *
	 */
	public static final String $pack_unit_nm = "pack_unit_nm";
	/**
	 * SKU number of decimal places 荷姿単位小数部有効桁数.<p>
	 *
	 */
	public static final String $pack_dec_place = "pack_dec_place";
	public static final String $pack_unit_qty_p = "pack_unit_qty_p";
	/**
	 * Inventory location cd. 在庫場所ＣＤ.<p>
	 *
	 */
	public static final String $stk_loc_cd = "stk_loc_cd";
	/**
	 * Inventory location name 在庫場所名.<p>
	 *
	 */
	public static final String $stk_loc_nm = "stk_loc_nm";
	/**
	 * Inventory rack/line cd. 在庫棚・ラインＣＤ.<p>
	 *
	 */
	public static final String $str_ln_cd = "str_ln_cd";
	/**
	 * Inventory rack/line name 在庫棚・ライン名.<p>
	 *
	 */
	public static final String $str_ln_nm = "str_ln_nm";
	/**
	 * Without Inventory rack/line 在庫棚・ライン無.<p>
	 *
	 */
	public static final String $str_ln_cd_none_flg = "str_ln_cd_none_flg";
	/**
	 * In-transit type 積送品区分.<p>
	 *
	 */
	public static final String $in_xfr_typ = "in_xfr_typ";
	/**
	 * In-transit type name 積送品区分名.<p>
	 *
	 */
	public static final String $in_xfr_typ_nm = "in_xfr_typ_nm";
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
	 * Asset type 資産区分.<p>
	 *
	 */
	public static final String $asst_typ = "asst_typ";
	/**
	 * Asset type name 資産区分名.<p>
	 *
	 */
	public static final String $asst_typ_nm = "asst_typ_nm";
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
	 * Simulation No. シミュレーションＮＯ.<p>
	 *
	 */
	public static final String $sim_mrp_no = "sim_mrp_no";
	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public static final String $wg_cd = "wg_cd";
	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public static final String $wg_nm = "wg_nm";
	/**
	 * Remarks 備考.<p>
	 *
	 */
	public static final String $intr_rmrks = "intr_rmrks";
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

	public static final String $hrrchy = $hrrchy_p + ".hrrchy";
	public static final String $extno = $hrrchy_p + ".extno";
	public static final String $par_extno = $hrrchy_p + ".par_extno";
	public static final String $loop_flg = $hrrchy_p + ".loop_flg";
	public static final String $leaf = $hrrchy_p + ".leaf";
	public static final String $leaf_str = $hrrchy_p + ".leaf_str";
	public static final String $itm_cd = $itm_p + ".itm_cd";
	public static final String $itm_sub1 = $itm_p + ".itm_sub1";
	public static final String $itm_sub2 = $itm_p + ".itm_sub2";
	public static final String $itm_sub3 = $itm_p + ".itm_sub3";
	public static final String $itm_nm = $itm_p + ".itm_nm";
	public static final String $schd_alloc_qty = $schd_alloc_qty_p + ".qty";
	public static final String $sno1 = $sno_wrk_no_p + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno1 + "";
	public static final String $sno2 = $sno_wrk_no_p + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno2 + "";
	public static final String $sno3 = $sno_wrk_no_p + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno3 + "";
	public static final String $sno4 = $sno_wrk_no_p + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno4 + "";
	public static final String $wrk_no = $sno_wrk_no_p + ".wrk_no";
	public static final String $wrk_nm = $sno_wrk_no_p + ".wrk_nm";
	public static final String $inst_qty = $inst_qty_p + ".qty";
	public static final String $yield_schd_qty = $yield_schd_qty_p + ".qty";
	public static final String $ver_no = $ver_no_p + ".ver_no";
	public static final String $base_unit_qty = $base_unit_qty_p + ".qty";
	public static final String $pack_unit_qty = $pack_unit_qty_p + ".qty";

	public static final MCMeta hrrchy_p_META = createInnerRowMeta($hrrchy_p, mcframe.clientMAUB.MAUBP5210.HrrchyR.class);
	public static final MCMeta itm_p_META = createInnerRowMeta($itm_p, mcframe.clientMAUB.MAUBP5030.ItmR.class);
	public static final MCMeta trd_nm_META = createCommonMeta($trd_nm, mcframe.commonMS.meta.MS_META.IO_SCHD_TYP_NM);
	public static final MCMeta ord_ext_dat_typ_nm_META = createCommonMeta($ord_ext_dat_typ_nm, mcframe.commonMS.meta.MS_META.ORD_EXT_DAT_TYP_NM);
	public static final MCMeta ord_ext_dat_no_META = createCommonMeta($ord_ext_dat_no, mcframe.commonMA.meta.MA_META.ITM_ORD_NO);
	public static final MCMeta strg_dlv_cd_META = createCommonMeta($strg_dlv_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta strg_dlv_nm_META = createCommonMeta($strg_dlv_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta trd_loc_bp_cd_META = createCommonMeta($trd_loc_bp_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta trd_loc_bp_nm_META = createCommonMeta($trd_loc_bp_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta base_unit_cd_META = createCommonMeta($base_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta base_unit_nm_META = createCommonMeta($base_unit_nm, mcframe.commonMA.meta.MA_META.UNIT_NM);
	public static final MCMeta base_dec_place_META = createCommonMeta($base_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta schd_alloc_qty_p_META = createInnerRowMeta($schd_alloc_qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta strg_schd_dt_META = createCommonMeta($strg_schd_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta avl_schd_dt_META = createCommonMeta($avl_schd_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta sno_wrk_no_p_META = createInnerRowMeta($sno_wrk_no_p, mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.class);
	public static final MCMeta rqmt_no_META = createCommonMeta($rqmt_no, mcframe.commonMA.meta.MA_META.RQMT_NO);
	public static final MCMeta strg_loc_cd_META = createCommonMeta($strg_loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta strg_loc_nm_META = createCommonMeta($strg_loc_nm, mcframe.commonMA.meta.MA_META.LOC_NM);
	public static final MCMeta itm_ord_no_META = createCommonMeta($itm_ord_no, mcframe.commonMA.meta.MA_META.ITM_ORD_NO);
	public static final MCMeta sim_ord_flg_META = createCommonMeta($sim_ord_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta itm_ord_typ_META = createCommonMeta($itm_ord_typ, mcframe.commonMS.meta.MS_META.ITM_ORD_TYP);
	public static final MCMeta itm_ord_typ_nm_META = createCommonMeta($itm_ord_typ_nm, mcframe.commonMS.meta.MS_META.ITM_ORD_TYP_NM);
	public static final MCMeta not_fix_flg_META = createCommonMeta($not_fix_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta blk_flg_META = createCommonMeta($blk_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta inst_qty_p_META = createInnerRowMeta($inst_qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta mfg_loc_cd_META = createCommonMeta($mfg_loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta mfg_loc_nm_META = createCommonMeta($mfg_loc_nm, mcframe.commonMA.meta.MA_META.LOC_NM);
	public static final MCMeta oper_ptn_META = createCommonMeta($oper_ptn, mcframe.commonMA.meta.MA_META.OPER_PTN);
	public static final MCMeta bom_ptn_META = createCommonMeta($bom_ptn, mcframe.commonMA.meta.MA_META.BOM_PTN);
	public static final MCMeta yield_schd_qty_p_META = createInnerRowMeta($yield_schd_qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta mfg_st_schd_dt_META = createCommonMeta($mfg_st_schd_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta mfg_end_schd_dt_META = createCommonMeta($mfg_end_schd_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta sppl_cd_META = createCommonMeta($sppl_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta sppl_nm_META = createCommonMeta($sppl_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta maker_cd_META = createCommonMeta($maker_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta maker_nm_META = createCommonMeta($maker_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta ver_no_p_META = createInnerRowMeta($ver_no_p, mcframe.clientMAUB.MAUBP5250.VerNoR.class);
	public static final MCMeta po_schd_dt_META = createCommonMeta($po_schd_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta accpt_schd_dt_META = createCommonMeta($accpt_schd_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta rqst_loc_cd_META = createCommonMeta($rqst_loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta rqst_loc_nm_META = createCommonMeta($rqst_loc_nm, mcframe.commonMA.meta.MA_META.LOC_NM);
	public static final MCMeta rqst_wg_cd_META = createCommonMeta($rqst_wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta rqst_wg_nm_META = createCommonMeta($rqst_wg_nm, mcframe.commonMA.meta.MA_META.WG_NM);
	public static final MCMeta gi_schd_dt_META = createCommonMeta($gi_schd_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta insp_st_schd_dt_META = createCommonMeta($insp_st_schd_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta insp_end_schd_dt_META = createCommonMeta($insp_end_schd_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta io_schd_no_META = createCommonMeta($io_schd_no, mcframe.commonMA.meta.MA_META.IO_SCHD_NO);
	public static final MCMeta io_schd_typ_META = createCommonMeta($io_schd_typ, mcframe.commonMS.meta.MS_META.IO_SCHD_TYP);
	public static final MCMeta io_schd_typ_nm_META = createCommonMeta($io_schd_typ_nm, mcframe.commonMS.meta.MS_META.IO_SCHD_TYP_NM);
	public static final MCMeta io_schd_sts_typ_META = createCommonMeta($io_schd_sts_typ, mcframe.commonMS.meta.MS_META.IO_SCHD_STS_TYP);
	public static final MCMeta io_schd_sts_typ_nm_META = createCommonMeta($io_schd_sts_typ_nm, mcframe.commonMS.meta.MS_META.IO_SCHD_STS_TYP_NM);
	public static final MCMeta io_schd_pr_no_META = createCommonMeta($io_schd_pr_no, mcframe.commonMA.meta.MA_META.IO_SCHD_PR_NO);
	public static final MCMeta lot_no_META = createCommonMeta($lot_no, mcframe.commonMA.meta.MA_META.LOT_NO);
	public static final MCMeta sublot_no_META = createCommonMeta($sublot_no, mcframe.commonMA.meta.MA_META.SUBLOT_NO);
	public static final MCMeta base_unit_qty_p_META = createInnerRowMeta($base_unit_qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta pack_unit_cd_META = createCommonMeta($pack_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta pack_unit_nm_META = createCommonMeta($pack_unit_nm, mcframe.commonMA.meta.MA_META.UNIT_NM);
	public static final MCMeta pack_dec_place_META = createCommonMeta($pack_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta pack_unit_qty_p_META = createInnerRowMeta($pack_unit_qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta stk_loc_cd_META = createCommonMeta($stk_loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta stk_loc_nm_META = createCommonMeta($stk_loc_nm, mcframe.commonMA.meta.MA_META.LOC_NM);
	public static final MCMeta str_ln_cd_META = createCommonMeta($str_ln_cd, mcframe.commonMA.meta.MA_META.STR_LN_CD);
	public static final MCMeta str_ln_nm_META = createCommonMeta($str_ln_nm, mcframe.commonMA.meta.MA_META.STR_LN_NM);
	public static final MCMeta str_ln_cd_none_flg_META = createCommonMeta($str_ln_cd_none_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta in_xfr_typ_META = createCommonMeta($in_xfr_typ, mcframe.commonMS.meta.MS_META.IN_XFR_TYP);
	public static final MCMeta in_xfr_typ_nm_META = createCommonMeta($in_xfr_typ_nm, mcframe.commonMS.meta.MS_META.IN_XFR_TYP_NM);
	public static final MCMeta quality_typ_META = createCommonMeta($quality_typ, mcframe.commonMA.meta.MA_META.QUALITY_TYP);
	public static final MCMeta quality_typ_nm_META = createCommonMeta($quality_typ_nm, mcframe.commonMA.meta.MA_META.QUALITY_TYP_NM);
	public static final MCMeta stk_insp_typ_META = createCommonMeta($stk_insp_typ, mcframe.commonMS.meta.MS_META.STK_INSP_TYP);
	public static final MCMeta stk_insp_typ_nm_META = createCommonMeta($stk_insp_typ_nm, mcframe.commonMS.meta.MS_META.STK_INSP_TYP_NM);
	public static final MCMeta stk_id_typ_META = createCommonMeta($stk_id_typ, mcframe.commonMS.meta.MS_META.STK_ID_TYP);
	public static final MCMeta stk_id_typ_nm_META = createCommonMeta($stk_id_typ_nm, mcframe.commonMS.meta.MS_META.STK_ID_TYP_NM);
	public static final MCMeta asst_typ_META = createCommonMeta($asst_typ, mcframe.commonMA.meta.MA_META.ASST_TYP);
	public static final MCMeta asst_typ_nm_META = createCommonMeta($asst_typ_nm, mcframe.commonMA.meta.MA_META.ASST_TYP_NM);
	public static final MCMeta gd_cd_META = createCommonMeta($gd_cd, mcframe.commonMA.meta.MA_META.STK_GD_CD);
	public static final MCMeta gd_nm_META = createCommonMeta($gd_nm, mcframe.commonMA.meta.MA_META.STK_GD_NM);
	public static final MCMeta stk_bp_cd_META = createCommonMeta($stk_bp_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta stk_bp_nm_META = createCommonMeta($stk_bp_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta sim_mrp_no_META = createCommonMeta($sim_mrp_no, mcframe.commonMA.meta.MA_META.SIM_MRP_NO);
	public static final MCMeta wg_cd_META = createCommonMeta($wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta wg_nm_META = createCommonMeta($wg_nm, mcframe.commonMA.meta.MA_META.WG_NM);
	public static final MCMeta intr_rmrks_META = createCommonMeta($intr_rmrks, mcframe.commonMS.meta.MS_META.IORD_INTR_RMRKS);
	public static final MCMeta sub_char1_META = createCommonMeta($sub_char1, mcframe.commonMS.meta.MS_META.IORD_SUB_CHAR1);
	public static final MCMeta sub_char2_META = createCommonMeta($sub_char2, mcframe.commonMS.meta.MS_META.IORD_SUB_CHAR2);
	public static final MCMeta sub_char3_META = createCommonMeta($sub_char3, mcframe.commonMS.meta.MS_META.IORD_SUB_CHAR3);

	protected static final ConstMetaList<RsltR> constMetas = new ConstMetaList<RsltR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			hrrchy_p_META,
			itm_p_META,
			trd_nm_META,
			ord_ext_dat_typ_nm_META,
			ord_ext_dat_no_META,
			strg_dlv_cd_META,
			strg_dlv_nm_META,
			trd_loc_bp_cd_META,
			trd_loc_bp_nm_META,
			base_unit_cd_META,
			base_unit_nm_META,
			base_dec_place_META,
			schd_alloc_qty_p_META,
			strg_schd_dt_META,
			avl_schd_dt_META,
			sno_wrk_no_p_META,
			rqmt_no_META,
			strg_loc_cd_META,
			strg_loc_nm_META,
			itm_ord_no_META,
			sim_ord_flg_META,
			itm_ord_typ_META,
			itm_ord_typ_nm_META,
			not_fix_flg_META,
			blk_flg_META,
			inst_qty_p_META,
			mfg_loc_cd_META,
			mfg_loc_nm_META,
			oper_ptn_META,
			bom_ptn_META,
			yield_schd_qty_p_META,
			mfg_st_schd_dt_META,
			mfg_end_schd_dt_META,
			sppl_cd_META,
			sppl_nm_META,
			maker_cd_META,
			maker_nm_META,
			ver_no_p_META,
			po_schd_dt_META,
			accpt_schd_dt_META,
			rqst_loc_cd_META,
			rqst_loc_nm_META,
			rqst_wg_cd_META,
			rqst_wg_nm_META,
			gi_schd_dt_META,
			insp_st_schd_dt_META,
			insp_end_schd_dt_META,
			io_schd_no_META,
			io_schd_typ_META,
			io_schd_typ_nm_META,
			io_schd_sts_typ_META,
			io_schd_sts_typ_nm_META,
			io_schd_pr_no_META,
			lot_no_META,
			sublot_no_META,
			base_unit_qty_p_META,
			pack_unit_cd_META,
			pack_unit_nm_META,
			pack_dec_place_META,
			pack_unit_qty_p_META,
			stk_loc_cd_META,
			stk_loc_nm_META,
			str_ln_cd_META,
			str_ln_nm_META,
			str_ln_cd_none_flg_META,
			in_xfr_typ_META,
			in_xfr_typ_nm_META,
			quality_typ_META,
			quality_typ_nm_META,
			stk_insp_typ_META,
			stk_insp_typ_nm_META,
			stk_id_typ_META,
			stk_id_typ_nm_META,
			asst_typ_META,
			asst_typ_nm_META,
			gd_cd_META,
			gd_nm_META,
			stk_bp_cd_META,
			stk_bp_nm_META,
			sim_mrp_no_META,
			wg_cd_META,
			wg_nm_META,
			intr_rmrks_META,
			sub_char1_META,
			sub_char2_META,
			sub_char3_META
		},
		new String[][]{
			{
				"hrrchy",
				"extno",
				"par_extno",
				"loop_flg",
				"leaf",
				"leaf_str",
				"itm_cd",
				"itm_sub1",
				"itm_sub2",
				"itm_sub3",
				"itm_nm",
				"schd_alloc_qty",
				"sno1",
				"sno2",
				"sno3",
				"sno4",
				"wrk_no",
				"wrk_nm",
				"inst_qty",
				"yield_schd_qty",
				"ver_no",
				"base_unit_qty",
				"pack_unit_qty"
			},
			{
				$hrrchy,
				$extno,
				$par_extno,
				$loop_flg,
				$leaf,
				$leaf_str,
				$itm_cd,
				$itm_sub1,
				$itm_sub2,
				$itm_sub3,
				$itm_nm,
				$schd_alloc_qty,
				$sno1,
				$sno2,
				$sno3,
				$sno4,
				$wrk_no,
				$wrk_nm,
				$inst_qty,
				$yield_schd_qty,
				$ver_no,
				$base_unit_qty,
				$pack_unit_qty
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

	/** 項目属性情報のグループ[DISP_CTL]のキー定数 */
	public static final String $$DISP_CTL = "DISP_CTL";

	/**
	 * グループ毎に定義される項目属性情報です。
	 */
	protected static final MCExtMap EXTMAP = new MCExtMap(
		null,
		new MCExtMap.Entry($$DISP_CTL, new MCExtList(
			new String[][]{
				{$maker_cd, "MAKER"},	// maker_cd
				{$maker_nm, "MAKER"},	// maker_nm
				{$rqst_wg_cd, "WG"},	// rqst_wg_cd
				{$rqst_wg_nm, "WG"},	// rqst_wg_nm
				{$str_ln_cd, "STR_LN"},	// str_ln_cd
				{$str_ln_nm, "STR_LN"},	// str_ln_nm
				{$str_ln_cd_none_flg, "STR_LN"},	// str_ln_cd_none_flg
				{$gd_cd, "STK_GD"},	// gd_cd
				{$gd_nm, "STK_GD"},	// gd_nm
				{$wg_cd, "WG"},	// wg_cd
				{$wg_nm, "WG"}	// wg_nm
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



	public mcframe.clientMAUB.MAUBP5210.HrrchyR hrrchy_p(){
		return (mcframe.clientMAUB.MAUBP5210.HrrchyR) getConstInnerRow(offset + 0, $hrrchy_p);
	}
	
	public void hrrchy_p(mcframe.clientMAUB.MAUBP5210.HrrchyR row){
		setConstInnerRow(offset + 0, $hrrchy_p, row);
	}


	public mcframe.clientMAUB.MAUBP5030.ItmR itm_p(){
		return (mcframe.clientMAUB.MAUBP5030.ItmR) getConstInnerRow(offset + 1, $itm_p);
	}
	
	public void itm_p(mcframe.clientMAUB.MAUBP5030.ItmR row){
		setConstInnerRow(offset + 1, $itm_p, row);
	}


	/**
	 * Transaction 取引.<p>
	 *
	 */
	public String trd_nm() {
		return getConstString(offset + 2, $trd_nm);
	}

	/**
	 * Transaction 取引.<p>
	 *
	 */
	public void trd_nm(String value) {
		setConstString(offset + 2, $trd_nm, value);
	}


	/**
	 * Data データ.<p>
	 *
	 */
	public String ord_ext_dat_typ_nm() {
		return getConstString(offset + 3, $ord_ext_dat_typ_nm);
	}

	/**
	 * Data データ.<p>
	 *
	 */
	public void ord_ext_dat_typ_nm(String value) {
		setConstString(offset + 3, $ord_ext_dat_typ_nm, value);
	}


	/**
	 * Data No. データＮＯ.<p>
	 *
	 */
	public String ord_ext_dat_no() {
		return getConstString(offset + 4, $ord_ext_dat_no);
	}

	/**
	 * Data No. データＮＯ.<p>
	 *
	 */
	public void ord_ext_dat_no(String value) {
		setConstString(offset + 4, $ord_ext_dat_no, value);
	}


	/**
	 * Storage location/delivery destination cd. 格納場所／納品先ＣＤ.<p>
	 *
	 */
	public String strg_dlv_cd() {
		return getConstString(offset + 5, $strg_dlv_cd);
	}

	/**
	 * Storage location/delivery destination cd. 格納場所／納品先ＣＤ.<p>
	 *
	 */
	public void strg_dlv_cd(String value) {
		setConstString(offset + 5, $strg_dlv_cd, value);
	}


	/**
	 * Storage location name/delivery destination name 格納場所名／納品先名.<p>
	 *
	 */
	public String strg_dlv_nm() {
		return getConstString(offset + 6, $strg_dlv_nm);
	}

	/**
	 * Storage location name/delivery destination name 格納場所名／納品先名.<p>
	 *
	 */
	public void strg_dlv_nm(String value) {
		setConstString(offset + 6, $strg_dlv_nm, value);
	}


	/**
	 * Transaction location/BP cd. 取引場所／取引先ＣＤ.<p>
	 *
	 */
	public String trd_loc_bp_cd() {
		return getConstString(offset + 7, $trd_loc_bp_cd);
	}

	/**
	 * Transaction location/BP cd. 取引場所／取引先ＣＤ.<p>
	 *
	 */
	public void trd_loc_bp_cd(String value) {
		setConstString(offset + 7, $trd_loc_bp_cd, value);
	}


	/**
	 * Transaction location name/BP name 取引場所名／取引先名.<p>
	 *
	 */
	public String trd_loc_bp_nm() {
		return getConstString(offset + 8, $trd_loc_bp_nm);
	}

	/**
	 * Transaction location name/BP name 取引場所名／取引先名.<p>
	 *
	 */
	public void trd_loc_bp_nm(String value) {
		setConstString(offset + 8, $trd_loc_bp_nm, value);
	}


	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public String base_unit_cd() {
		return getConstString(offset + 9, $base_unit_cd);
	}

	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public void base_unit_cd(String value) {
		setConstString(offset + 9, $base_unit_cd, value);
	}


	/**
	 * Base unit name 基準単位名.<p>
	 *
	 */
	public String base_unit_nm() {
		return getConstString(offset + 10, $base_unit_nm);
	}

	/**
	 * Base unit name 基準単位名.<p>
	 *
	 */
	public void base_unit_nm(String value) {
		setConstString(offset + 10, $base_unit_nm, value);
	}


	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public MCNumber base_dec_place() {
		return getConstNumber(offset + 11, $base_dec_place);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_dec_place(MCNumber value) {
		setConstNumber(offset + 11, $base_dec_place, value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_dec_place(int value) {
		setConstNumber(offset + 11, $base_dec_place, value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_dec_place(long value) {
		setConstNumber(offset + 11, $base_dec_place, value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_dec_place(float value) {
		setConstNumber(offset + 11, $base_dec_place, value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_dec_place(double value) {
		setConstNumber(offset + 11, $base_dec_place, value);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR schd_alloc_qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 12, $schd_alloc_qty_p);
	}
	
	public void schd_alloc_qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 12, $schd_alloc_qty_p, row);
	}


	/**
	 * Scheduled storage date 格納予定日.<p>
	 *
	 */
	public MCDate strg_schd_dt() {
		return getConstDate(offset + 13, $strg_schd_dt);
	}

	/**
	 * Scheduled storage date 格納予定日.<p>
	 *
	 */
	public void strg_schd_dt(MCDate value) {
		setConstDate(offset + 13, $strg_schd_dt, value);
	}


	/**
	 * Available date 使用可能予定日.<p>
	 *
	 */
	public MCDate avl_schd_dt() {
		return getConstDate(offset + 14, $avl_schd_dt);
	}

	/**
	 * Available date 使用可能予定日.<p>
	 *
	 */
	public void avl_schd_dt(MCDate value) {
		setConstDate(offset + 14, $avl_schd_dt, value);
	}


	public mcframe.clientMSUB.MSUBP5020.SnoWrkNoR sno_wrk_no_p(){
		return (mcframe.clientMSUB.MSUBP5020.SnoWrkNoR) getConstInnerRow(offset + 15, $sno_wrk_no_p);
	}
	
	public void sno_wrk_no_p(mcframe.clientMSUB.MSUBP5020.SnoWrkNoR row){
		setConstInnerRow(offset + 15, $sno_wrk_no_p, row);
	}


	/**
	 * Requirements No. 所要ＮＯ.<p>
	 *
	 */
	public String rqmt_no() {
		return getConstString(offset + 16, $rqmt_no);
	}

	/**
	 * Requirements No. 所要ＮＯ.<p>
	 *
	 */
	public void rqmt_no(String value) {
		setConstString(offset + 16, $rqmt_no, value);
	}


	/**
	 * Storage location cd. 格納場所ＣＤ.<p>
	 *
	 */
	public String strg_loc_cd() {
		return getConstString(offset + 17, $strg_loc_cd);
	}

	/**
	 * Storage location cd. 格納場所ＣＤ.<p>
	 *
	 */
	public void strg_loc_cd(String value) {
		setConstString(offset + 17, $strg_loc_cd, value);
	}


	/**
	 * Storage location name 格納場所名.<p>
	 *
	 */
	public String strg_loc_nm() {
		return getConstString(offset + 18, $strg_loc_nm);
	}

	/**
	 * Storage location name 格納場所名.<p>
	 *
	 */
	public void strg_loc_nm(String value) {
		setConstString(offset + 18, $strg_loc_nm, value);
	}


	/**
	 * Item order No. 品目オーダＮＯ.<p>
	 *
	 */
	public String itm_ord_no() {
		return getConstString(offset + 19, $itm_ord_no);
	}

	/**
	 * Item order No. 品目オーダＮＯ.<p>
	 *
	 */
	public void itm_ord_no(String value) {
		setConstString(offset + 19, $itm_ord_no, value);
	}


	/**
	 * Simulation order シミュレーションオーダ.<p>
	 *
	 */
	public boolean sim_ord_flg() {
		return getConstBoolean(offset + 20, $sim_ord_flg);
	}

	/**
	 * Simulation order シミュレーションオーダ.<p>
	 *
	 */
	public void sim_ord_flg(boolean value) {
		setConstBoolean(offset + 20, $sim_ord_flg, value);
	}


	/**
	 * Order type オーダ区分.<p>
	 *
	 */
	public String itm_ord_typ() {
		return getConstString(offset + 21, $itm_ord_typ);
	}

	/**
	 * Order type オーダ区分.<p>
	 *
	 */
	public void itm_ord_typ(String value) {
		setConstString(offset + 21, $itm_ord_typ, value);
	}


	/**
	 * Order type name オーダ区分名.<p>
	 *
	 */
	public String itm_ord_typ_nm() {
		return getConstString(offset + 22, $itm_ord_typ_nm);
	}

	/**
	 * Order type name オーダ区分名.<p>
	 *
	 */
	public void itm_ord_typ_nm(String value) {
		setConstString(offset + 22, $itm_ord_typ_nm, value);
	}


	/**
	 * Disallow procurement 手配不許可.<p>
	 *
	 */
	public boolean not_fix_flg() {
		return getConstBoolean(offset + 23, $not_fix_flg);
	}

	/**
	 * Disallow procurement 手配不許可.<p>
	 *
	 */
	public void not_fix_flg(boolean value) {
		setConstBoolean(offset + 23, $not_fix_flg, value);
	}


	/**
	 * Aggregation まとめ.<p>
	 *
	 */
	public boolean blk_flg() {
		return getConstBoolean(offset + 24, $blk_flg);
	}

	/**
	 * Aggregation まとめ.<p>
	 *
	 */
	public void blk_flg(boolean value) {
		setConstBoolean(offset + 24, $blk_flg, value);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR inst_qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 25, $inst_qty_p);
	}
	
	public void inst_qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 25, $inst_qty_p, row);
	}


	/**
	 * Mfg. location cd. 製造場所ＣＤ.<p>
	 *
	 */
	public String mfg_loc_cd() {
		return getConstString(offset + 26, $mfg_loc_cd);
	}

	/**
	 * Mfg. location cd. 製造場所ＣＤ.<p>
	 *
	 */
	public void mfg_loc_cd(String value) {
		setConstString(offset + 26, $mfg_loc_cd, value);
	}


	/**
	 * Mfg. location name 製造場所名.<p>
	 *
	 */
	public String mfg_loc_nm() {
		return getConstString(offset + 27, $mfg_loc_nm);
	}

	/**
	 * Mfg. location name 製造場所名.<p>
	 *
	 */
	public void mfg_loc_nm(String value) {
		setConstString(offset + 27, $mfg_loc_nm, value);
	}


	/**
	 * Operation pattern 工程パタン.<p>
	 *
	 */
	public String oper_ptn() {
		return getConstString(offset + 28, $oper_ptn);
	}

	/**
	 * Operation pattern 工程パタン.<p>
	 *
	 */
	public void oper_ptn(String value) {
		setConstString(offset + 28, $oper_ptn, value);
	}


	/**
	 * BOM pattern 構成パタン.<p>
	 *
	 */
	public String bom_ptn() {
		return getConstString(offset + 29, $bom_ptn);
	}

	/**
	 * BOM pattern 構成パタン.<p>
	 *
	 */
	public void bom_ptn(String value) {
		setConstString(offset + 29, $bom_ptn, value);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR yield_schd_qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 30, $yield_schd_qty_p);
	}
	
	public void yield_schd_qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 30, $yield_schd_qty_p, row);
	}


	/**
	 * Scheduled mfg. start date 製造着手予定日.<p>
	 *
	 */
	public MCDate mfg_st_schd_dt() {
		return getConstDate(offset + 31, $mfg_st_schd_dt);
	}

	/**
	 * Scheduled mfg. start date 製造着手予定日.<p>
	 *
	 */
	public void mfg_st_schd_dt(MCDate value) {
		setConstDate(offset + 31, $mfg_st_schd_dt, value);
	}


	/**
	 * Scheduled mfg. end date 製造終了予定日.<p>
	 *
	 */
	public MCDate mfg_end_schd_dt() {
		return getConstDate(offset + 32, $mfg_end_schd_dt);
	}

	/**
	 * Scheduled mfg. end date 製造終了予定日.<p>
	 *
	 */
	public void mfg_end_schd_dt(MCDate value) {
		setConstDate(offset + 32, $mfg_end_schd_dt, value);
	}


	/**
	 * Supplier cd. 発注先ＣＤ.<p>
	 *
	 */
	public String sppl_cd() {
		return getConstString(offset + 33, $sppl_cd);
	}

	/**
	 * Supplier cd. 発注先ＣＤ.<p>
	 *
	 */
	public void sppl_cd(String value) {
		setConstString(offset + 33, $sppl_cd, value);
	}


	/**
	 * Supplier name 発注先名.<p>
	 *
	 */
	public String sppl_nm() {
		return getConstString(offset + 34, $sppl_nm);
	}

	/**
	 * Supplier name 発注先名.<p>
	 *
	 */
	public void sppl_nm(String value) {
		setConstString(offset + 34, $sppl_nm, value);
	}


	/**
	 * Maker cd. メーカＣＤ.<p>
	 *
	 */
	public String maker_cd() {
		return getConstString(offset + 35, $maker_cd);
	}

	/**
	 * Maker cd. メーカＣＤ.<p>
	 *
	 */
	public void maker_cd(String value) {
		setConstString(offset + 35, $maker_cd, value);
	}


	/**
	 * Maker name メーカ名.<p>
	 *
	 */
	public String maker_nm() {
		return getConstString(offset + 36, $maker_nm);
	}

	/**
	 * Maker name メーカ名.<p>
	 *
	 */
	public void maker_nm(String value) {
		setConstString(offset + 36, $maker_nm, value);
	}


	public mcframe.clientMAUB.MAUBP5250.VerNoR ver_no_p(){
		return (mcframe.clientMAUB.MAUBP5250.VerNoR) getConstInnerRow(offset + 37, $ver_no_p);
	}
	
	public void ver_no_p(mcframe.clientMAUB.MAUBP5250.VerNoR row){
		setConstInnerRow(offset + 37, $ver_no_p, row);
	}


	/**
	 * Scheduled PO date 発注予定日.<p>
	 *
	 */
	public MCDate po_schd_dt() {
		return getConstDate(offset + 38, $po_schd_dt);
	}

	/**
	 * Scheduled PO date 発注予定日.<p>
	 *
	 */
	public void po_schd_dt(MCDate value) {
		setConstDate(offset + 38, $po_schd_dt, value);
	}


	/**
	 * Scheduled acceptance date 検収予定日.<p>
	 *
	 */
	public MCDate accpt_schd_dt() {
		return getConstDate(offset + 39, $accpt_schd_dt);
	}

	/**
	 * Scheduled acceptance date 検収予定日.<p>
	 *
	 */
	public void accpt_schd_dt(MCDate value) {
		setConstDate(offset + 39, $accpt_schd_dt, value);
	}


	/**
	 * Requested location cd. 依頼先場所ＣＤ.<p>
	 *
	 */
	public String rqst_loc_cd() {
		return getConstString(offset + 40, $rqst_loc_cd);
	}

	/**
	 * Requested location cd. 依頼先場所ＣＤ.<p>
	 *
	 */
	public void rqst_loc_cd(String value) {
		setConstString(offset + 40, $rqst_loc_cd, value);
	}


	/**
	 * Location name (Requested) 依頼先場所名.<p>
	 *
	 */
	public String rqst_loc_nm() {
		return getConstString(offset + 41, $rqst_loc_nm);
	}

	/**
	 * Location name (Requested) 依頼先場所名.<p>
	 *
	 */
	public void rqst_loc_nm(String value) {
		setConstString(offset + 41, $rqst_loc_nm, value);
	}


	/**
	 * Requested WG cd. 依頼先ワーキンググループＣＤ.<p>
	 *
	 */
	public String rqst_wg_cd() {
		return getConstString(offset + 42, $rqst_wg_cd);
	}

	/**
	 * Requested WG cd. 依頼先ワーキンググループＣＤ.<p>
	 *
	 */
	public void rqst_wg_cd(String value) {
		setConstString(offset + 42, $rqst_wg_cd, value);
	}


	/**
	 * Requested WG name 依頼先ワーキンググループ名.<p>
	 *
	 */
	public String rqst_wg_nm() {
		return getConstString(offset + 43, $rqst_wg_nm);
	}

	/**
	 * Requested WG name 依頼先ワーキンググループ名.<p>
	 *
	 */
	public void rqst_wg_nm(String value) {
		setConstString(offset + 43, $rqst_wg_nm, value);
	}


	/**
	 * Scheduled GI date 出庫予定日.<p>
	 *
	 */
	public MCDate gi_schd_dt() {
		return getConstDate(offset + 44, $gi_schd_dt);
	}

	/**
	 * Scheduled GI date 出庫予定日.<p>
	 *
	 */
	public void gi_schd_dt(MCDate value) {
		setConstDate(offset + 44, $gi_schd_dt, value);
	}


	/**
	 * Scheduled inspection start date 検査着手予定日.<p>
	 *
	 */
	public MCDate insp_st_schd_dt() {
		return getConstDate(offset + 45, $insp_st_schd_dt);
	}

	/**
	 * Scheduled inspection start date 検査着手予定日.<p>
	 *
	 */
	public void insp_st_schd_dt(MCDate value) {
		setConstDate(offset + 45, $insp_st_schd_dt, value);
	}


	/**
	 * Scheduled inspection end date 検査終了予定日.<p>
	 *
	 */
	public MCDate insp_end_schd_dt() {
		return getConstDate(offset + 46, $insp_end_schd_dt);
	}

	/**
	 * Scheduled inspection end date 検査終了予定日.<p>
	 *
	 */
	public void insp_end_schd_dt(MCDate value) {
		setConstDate(offset + 46, $insp_end_schd_dt, value);
	}


	/**
	 * GR/GI schedule No. 受払予定ＮＯ.<p>
	 *
	 */
	public String io_schd_no() {
		return getConstString(offset + 47, $io_schd_no);
	}

	/**
	 * GR/GI schedule No. 受払予定ＮＯ.<p>
	 *
	 */
	public void io_schd_no(String value) {
		setConstString(offset + 47, $io_schd_no, value);
	}


	/**
	 * GR/GI schedule type 受払予定区分.<p>
	 *
	 */
	public String io_schd_typ() {
		return getConstString(offset + 48, $io_schd_typ);
	}

	/**
	 * GR/GI schedule type 受払予定区分.<p>
	 *
	 */
	public void io_schd_typ(String value) {
		setConstString(offset + 48, $io_schd_typ, value);
	}


	/**
	 * GR/GI schedule type name 受払予定区分名.<p>
	 *
	 */
	public String io_schd_typ_nm() {
		return getConstString(offset + 49, $io_schd_typ_nm);
	}

	/**
	 * GR/GI schedule type name 受払予定区分名.<p>
	 *
	 */
	public void io_schd_typ_nm(String value) {
		setConstString(offset + 49, $io_schd_typ_nm, value);
	}


	/**
	 * GR/GI schedule status 受払予定状況.<p>
	 *
	 */
	public String io_schd_sts_typ() {
		return getConstString(offset + 50, $io_schd_sts_typ);
	}

	/**
	 * GR/GI schedule status 受払予定状況.<p>
	 *
	 */
	public void io_schd_sts_typ(String value) {
		setConstString(offset + 50, $io_schd_sts_typ, value);
	}


	/**
	 * GR/GI schedule status type name 受払予定状況名.<p>
	 *
	 */
	public String io_schd_sts_typ_nm() {
		return getConstString(offset + 51, $io_schd_sts_typ_nm);
	}

	/**
	 * GR/GI schedule status type name 受払予定状況名.<p>
	 *
	 */
	public void io_schd_sts_typ_nm(String value) {
		setConstString(offset + 51, $io_schd_sts_typ_nm, value);
	}


	/**
	 * GR/GI progress management No. 受払進捗管理ＮＯ.<p>
	 *
	 */
	public String io_schd_pr_no() {
		return getConstString(offset + 52, $io_schd_pr_no);
	}

	/**
	 * GR/GI progress management No. 受払進捗管理ＮＯ.<p>
	 *
	 */
	public void io_schd_pr_no(String value) {
		setConstString(offset + 52, $io_schd_pr_no, value);
	}


	/**
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public String lot_no() {
		return getConstString(offset + 53, $lot_no);
	}

	/**
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public void lot_no(String value) {
		setConstString(offset + 53, $lot_no, value);
	}


	/**
	 * Sublot No. サブロットＮＯ.<p>
	 *
	 */
	public String sublot_no() {
		return getConstString(offset + 54, $sublot_no);
	}

	/**
	 * Sublot No. サブロットＮＯ.<p>
	 *
	 */
	public void sublot_no(String value) {
		setConstString(offset + 54, $sublot_no, value);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR base_unit_qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 55, $base_unit_qty_p);
	}
	
	public void base_unit_qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 55, $base_unit_qty_p, row);
	}


	/**
	 * SKU cd. 荷姿ＣＤ.<p>
	 *
	 */
	public String pack_unit_cd() {
		return getConstString(offset + 56, $pack_unit_cd);
	}

	/**
	 * SKU cd. 荷姿ＣＤ.<p>
	 *
	 */
	public void pack_unit_cd(String value) {
		setConstString(offset + 56, $pack_unit_cd, value);
	}


	/**
	 * SKU name 荷姿名.<p>
	 *
	 */
	public String pack_unit_nm() {
		return getConstString(offset + 57, $pack_unit_nm);
	}

	/**
	 * SKU name 荷姿名.<p>
	 *
	 */
	public void pack_unit_nm(String value) {
		setConstString(offset + 57, $pack_unit_nm, value);
	}


	/**
	 * SKU number of decimal places 荷姿単位小数部有効桁数.<p>
	 *
	 */
	public MCNumber pack_dec_place() {
		return getConstNumber(offset + 58, $pack_dec_place);
	}

	/**
	 * SKU number of decimal places 荷姿単位小数部有効桁数.<p>
	 *
	 */
	public void pack_dec_place(MCNumber value) {
		setConstNumber(offset + 58, $pack_dec_place, value);
	}

	/**
	 * SKU number of decimal places 荷姿単位小数部有効桁数.<p>
	 *
	 */
	public void pack_dec_place(int value) {
		setConstNumber(offset + 58, $pack_dec_place, value);
	}

	/**
	 * SKU number of decimal places 荷姿単位小数部有効桁数.<p>
	 *
	 */
	public void pack_dec_place(long value) {
		setConstNumber(offset + 58, $pack_dec_place, value);
	}

	/**
	 * SKU number of decimal places 荷姿単位小数部有効桁数.<p>
	 *
	 */
	public void pack_dec_place(float value) {
		setConstNumber(offset + 58, $pack_dec_place, value);
	}

	/**
	 * SKU number of decimal places 荷姿単位小数部有効桁数.<p>
	 *
	 */
	public void pack_dec_place(double value) {
		setConstNumber(offset + 58, $pack_dec_place, value);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR pack_unit_qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 59, $pack_unit_qty_p);
	}
	
	public void pack_unit_qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 59, $pack_unit_qty_p, row);
	}


	/**
	 * Inventory location cd. 在庫場所ＣＤ.<p>
	 *
	 */
	public String stk_loc_cd() {
		return getConstString(offset + 60, $stk_loc_cd);
	}

	/**
	 * Inventory location cd. 在庫場所ＣＤ.<p>
	 *
	 */
	public void stk_loc_cd(String value) {
		setConstString(offset + 60, $stk_loc_cd, value);
	}


	/**
	 * Inventory location name 在庫場所名.<p>
	 *
	 */
	public String stk_loc_nm() {
		return getConstString(offset + 61, $stk_loc_nm);
	}

	/**
	 * Inventory location name 在庫場所名.<p>
	 *
	 */
	public void stk_loc_nm(String value) {
		setConstString(offset + 61, $stk_loc_nm, value);
	}


	/**
	 * Inventory rack/line cd. 在庫棚・ラインＣＤ.<p>
	 *
	 */
	public String str_ln_cd() {
		return getConstString(offset + 62, $str_ln_cd);
	}

	/**
	 * Inventory rack/line cd. 在庫棚・ラインＣＤ.<p>
	 *
	 */
	public void str_ln_cd(String value) {
		setConstString(offset + 62, $str_ln_cd, value);
	}


	/**
	 * Inventory rack/line name 在庫棚・ライン名.<p>
	 *
	 */
	public String str_ln_nm() {
		return getConstString(offset + 63, $str_ln_nm);
	}

	/**
	 * Inventory rack/line name 在庫棚・ライン名.<p>
	 *
	 */
	public void str_ln_nm(String value) {
		setConstString(offset + 63, $str_ln_nm, value);
	}


	/**
	 * Without Inventory rack/line 在庫棚・ライン無.<p>
	 *
	 */
	public boolean str_ln_cd_none_flg() {
		return getConstBoolean(offset + 64, $str_ln_cd_none_flg);
	}

	/**
	 * Without Inventory rack/line 在庫棚・ライン無.<p>
	 *
	 */
	public void str_ln_cd_none_flg(boolean value) {
		setConstBoolean(offset + 64, $str_ln_cd_none_flg, value);
	}


	/**
	 * In-transit type 積送品区分.<p>
	 *
	 */
	public String in_xfr_typ() {
		return getConstString(offset + 65, $in_xfr_typ);
	}

	/**
	 * In-transit type 積送品区分.<p>
	 *
	 */
	public void in_xfr_typ(String value) {
		setConstString(offset + 65, $in_xfr_typ, value);
	}


	/**
	 * In-transit type name 積送品区分名.<p>
	 *
	 */
	public String in_xfr_typ_nm() {
		return getConstString(offset + 66, $in_xfr_typ_nm);
	}

	/**
	 * In-transit type name 積送品区分名.<p>
	 *
	 */
	public void in_xfr_typ_nm(String value) {
		setConstString(offset + 66, $in_xfr_typ_nm, value);
	}


	/**
	 * Conforming type 良品区分.<p>
	 *
	 */
	public String quality_typ() {
		return getConstString(offset + 67, $quality_typ);
	}

	/**
	 * Conforming type 良品区分.<p>
	 *
	 */
	public void quality_typ(String value) {
		setConstString(offset + 67, $quality_typ, value);
	}


	/**
	 * Conforming type name 良品区分名.<p>
	 *
	 */
	public String quality_typ_nm() {
		return getConstString(offset + 68, $quality_typ_nm);
	}

	/**
	 * Conforming type name 良品区分名.<p>
	 *
	 */
	public void quality_typ_nm(String value) {
		setConstString(offset + 68, $quality_typ_nm, value);
	}


	/**
	 * Inventory inspection type 在庫検査区分.<p>
	 *
	 */
	public String stk_insp_typ() {
		return getConstString(offset + 69, $stk_insp_typ);
	}

	/**
	 * Inventory inspection type 在庫検査区分.<p>
	 *
	 */
	public void stk_insp_typ(String value) {
		setConstString(offset + 69, $stk_insp_typ, value);
	}


	/**
	 * Inventory inspection type name 在庫検査区分名.<p>
	 *
	 */
	public String stk_insp_typ_nm() {
		return getConstString(offset + 70, $stk_insp_typ_nm);
	}

	/**
	 * Inventory inspection type name 在庫検査区分名.<p>
	 *
	 */
	public void stk_insp_typ_nm(String value) {
		setConstString(offset + 70, $stk_insp_typ_nm, value);
	}


	/**
	 * Inventory identification type 在庫識別区分.<p>
	 *
	 */
	public String stk_id_typ() {
		return getConstString(offset + 71, $stk_id_typ);
	}

	/**
	 * Inventory identification type 在庫識別区分.<p>
	 *
	 */
	public void stk_id_typ(String value) {
		setConstString(offset + 71, $stk_id_typ, value);
	}


	/**
	 * Inventory identification type name 在庫識別区分名.<p>
	 *
	 */
	public String stk_id_typ_nm() {
		return getConstString(offset + 72, $stk_id_typ_nm);
	}

	/**
	 * Inventory identification type name 在庫識別区分名.<p>
	 *
	 */
	public void stk_id_typ_nm(String value) {
		setConstString(offset + 72, $stk_id_typ_nm, value);
	}


	/**
	 * Asset type 資産区分.<p>
	 *
	 */
	public String asst_typ() {
		return getConstString(offset + 73, $asst_typ);
	}

	/**
	 * Asset type 資産区分.<p>
	 *
	 */
	public void asst_typ(String value) {
		setConstString(offset + 73, $asst_typ, value);
	}


	/**
	 * Asset type name 資産区分名.<p>
	 *
	 */
	public String asst_typ_nm() {
		return getConstString(offset + 74, $asst_typ_nm);
	}

	/**
	 * Asset type name 資産区分名.<p>
	 *
	 */
	public void asst_typ_nm(String value) {
		setConstString(offset + 74, $asst_typ_nm, value);
	}


	/**
	 * Grading cd. 格付ＣＤ.<p>
	 *
	 */
	public String gd_cd() {
		return getConstString(offset + 75, $gd_cd);
	}

	/**
	 * Grading cd. 格付ＣＤ.<p>
	 *
	 */
	public void gd_cd(String value) {
		setConstString(offset + 75, $gd_cd, value);
	}


	/**
	 * Grading name 格付名.<p>
	 *
	 */
	public String gd_nm() {
		return getConstString(offset + 76, $gd_nm);
	}

	/**
	 * Grading name 格付名.<p>
	 *
	 */
	public void gd_nm(String value) {
		setConstString(offset + 76, $gd_nm, value);
	}


	/**
	 * Inventory BP cd. 在庫取引先ＣＤ.<p>
	 *
	 */
	public String stk_bp_cd() {
		return getConstString(offset + 77, $stk_bp_cd);
	}

	/**
	 * Inventory BP cd. 在庫取引先ＣＤ.<p>
	 *
	 */
	public void stk_bp_cd(String value) {
		setConstString(offset + 77, $stk_bp_cd, value);
	}


	/**
	 * Inventory BP name 在庫取引先名.<p>
	 *
	 */
	public String stk_bp_nm() {
		return getConstString(offset + 78, $stk_bp_nm);
	}

	/**
	 * Inventory BP name 在庫取引先名.<p>
	 *
	 */
	public void stk_bp_nm(String value) {
		setConstString(offset + 78, $stk_bp_nm, value);
	}


	/**
	 * Simulation No. シミュレーションＮＯ.<p>
	 *
	 */
	public String sim_mrp_no() {
		return getConstString(offset + 79, $sim_mrp_no);
	}

	/**
	 * Simulation No. シミュレーションＮＯ.<p>
	 *
	 */
	public void sim_mrp_no(String value) {
		setConstString(offset + 79, $sim_mrp_no, value);
	}


	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public String wg_cd() {
		return getConstString(offset + 80, $wg_cd);
	}

	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public void wg_cd(String value) {
		setConstString(offset + 80, $wg_cd, value);
	}


	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public String wg_nm() {
		return getConstString(offset + 81, $wg_nm);
	}

	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public void wg_nm(String value) {
		setConstString(offset + 81, $wg_nm, value);
	}


	/**
	 * Remarks 備考.<p>
	 *
	 */
	public String intr_rmrks() {
		return getConstString(offset + 82, $intr_rmrks);
	}

	/**
	 * Remarks 備考.<p>
	 *
	 */
	public void intr_rmrks(String value) {
		setConstString(offset + 82, $intr_rmrks, value);
	}


	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public String sub_char1() {
		return getConstString(offset + 83, $sub_char1);
	}

	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public void sub_char1(String value) {
		setConstString(offset + 83, $sub_char1, value);
	}


	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public String sub_char2() {
		return getConstString(offset + 84, $sub_char2);
	}

	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public void sub_char2(String value) {
		setConstString(offset + 84, $sub_char2, value);
	}


	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public String sub_char3() {
		return getConstString(offset + 85, $sub_char3);
	}

	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public void sub_char3(String value) {
		setConstString(offset + 85, $sub_char3, value);
	}


	public String getString(String name) {
		if ($trd_nm.equalsIgnoreCase(name)) {
			return trd_nm();
		}
		if ($ord_ext_dat_typ_nm.equalsIgnoreCase(name)) {
			return ord_ext_dat_typ_nm();
		}
		if ($ord_ext_dat_no.equalsIgnoreCase(name)) {
			return ord_ext_dat_no();
		}
		if ($strg_dlv_cd.equalsIgnoreCase(name)) {
			return strg_dlv_cd();
		}
		if ($strg_dlv_nm.equalsIgnoreCase(name)) {
			return strg_dlv_nm();
		}
		if ($trd_loc_bp_cd.equalsIgnoreCase(name)) {
			return trd_loc_bp_cd();
		}
		if ($trd_loc_bp_nm.equalsIgnoreCase(name)) {
			return trd_loc_bp_nm();
		}
		if ($base_unit_cd.equalsIgnoreCase(name)) {
			return base_unit_cd();
		}
		if ($base_unit_nm.equalsIgnoreCase(name)) {
			return base_unit_nm();
		}
		if ($rqmt_no.equalsIgnoreCase(name)) {
			return rqmt_no();
		}
		if ($strg_loc_cd.equalsIgnoreCase(name)) {
			return strg_loc_cd();
		}
		if ($strg_loc_nm.equalsIgnoreCase(name)) {
			return strg_loc_nm();
		}
		if ($itm_ord_no.equalsIgnoreCase(name)) {
			return itm_ord_no();
		}
		if ($itm_ord_typ.equalsIgnoreCase(name)) {
			return itm_ord_typ();
		}
		if ($itm_ord_typ_nm.equalsIgnoreCase(name)) {
			return itm_ord_typ_nm();
		}
		if ($mfg_loc_cd.equalsIgnoreCase(name)) {
			return mfg_loc_cd();
		}
		if ($mfg_loc_nm.equalsIgnoreCase(name)) {
			return mfg_loc_nm();
		}
		if ($oper_ptn.equalsIgnoreCase(name)) {
			return oper_ptn();
		}
		if ($bom_ptn.equalsIgnoreCase(name)) {
			return bom_ptn();
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
		if ($rqst_loc_cd.equalsIgnoreCase(name)) {
			return rqst_loc_cd();
		}
		if ($rqst_loc_nm.equalsIgnoreCase(name)) {
			return rqst_loc_nm();
		}
		if ($rqst_wg_cd.equalsIgnoreCase(name)) {
			return rqst_wg_cd();
		}
		if ($rqst_wg_nm.equalsIgnoreCase(name)) {
			return rqst_wg_nm();
		}
		if ($io_schd_no.equalsIgnoreCase(name)) {
			return io_schd_no();
		}
		if ($io_schd_typ.equalsIgnoreCase(name)) {
			return io_schd_typ();
		}
		if ($io_schd_typ_nm.equalsIgnoreCase(name)) {
			return io_schd_typ_nm();
		}
		if ($io_schd_sts_typ.equalsIgnoreCase(name)) {
			return io_schd_sts_typ();
		}
		if ($io_schd_sts_typ_nm.equalsIgnoreCase(name)) {
			return io_schd_sts_typ_nm();
		}
		if ($io_schd_pr_no.equalsIgnoreCase(name)) {
			return io_schd_pr_no();
		}
		if ($lot_no.equalsIgnoreCase(name)) {
			return lot_no();
		}
		if ($sublot_no.equalsIgnoreCase(name)) {
			return sublot_no();
		}
		if ($pack_unit_cd.equalsIgnoreCase(name)) {
			return pack_unit_cd();
		}
		if ($pack_unit_nm.equalsIgnoreCase(name)) {
			return pack_unit_nm();
		}
		if ($stk_loc_cd.equalsIgnoreCase(name)) {
			return stk_loc_cd();
		}
		if ($stk_loc_nm.equalsIgnoreCase(name)) {
			return stk_loc_nm();
		}
		if ($str_ln_cd.equalsIgnoreCase(name)) {
			return str_ln_cd();
		}
		if ($str_ln_nm.equalsIgnoreCase(name)) {
			return str_ln_nm();
		}
		if ($in_xfr_typ.equalsIgnoreCase(name)) {
			return in_xfr_typ();
		}
		if ($in_xfr_typ_nm.equalsIgnoreCase(name)) {
			return in_xfr_typ_nm();
		}
		if ($quality_typ.equalsIgnoreCase(name)) {
			return quality_typ();
		}
		if ($quality_typ_nm.equalsIgnoreCase(name)) {
			return quality_typ_nm();
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
		if ($asst_typ.equalsIgnoreCase(name)) {
			return asst_typ();
		}
		if ($asst_typ_nm.equalsIgnoreCase(name)) {
			return asst_typ_nm();
		}
		if ($gd_cd.equalsIgnoreCase(name)) {
			return gd_cd();
		}
		if ($gd_nm.equalsIgnoreCase(name)) {
			return gd_nm();
		}
		if ($stk_bp_cd.equalsIgnoreCase(name)) {
			return stk_bp_cd();
		}
		if ($stk_bp_nm.equalsIgnoreCase(name)) {
			return stk_bp_nm();
		}
		if ($sim_mrp_no.equalsIgnoreCase(name)) {
			return sim_mrp_no();
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			return wg_nm();
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
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($base_dec_place.equalsIgnoreCase(name)) {
			return base_dec_place();
		}
		if ($pack_dec_place.equalsIgnoreCase(name)) {
			return pack_dec_place();
		}
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		if ($strg_schd_dt.equalsIgnoreCase(name)) {
			return strg_schd_dt();
		}
		if ($avl_schd_dt.equalsIgnoreCase(name)) {
			return avl_schd_dt();
		}
		if ($mfg_st_schd_dt.equalsIgnoreCase(name)) {
			return mfg_st_schd_dt();
		}
		if ($mfg_end_schd_dt.equalsIgnoreCase(name)) {
			return mfg_end_schd_dt();
		}
		if ($po_schd_dt.equalsIgnoreCase(name)) {
			return po_schd_dt();
		}
		if ($accpt_schd_dt.equalsIgnoreCase(name)) {
			return accpt_schd_dt();
		}
		if ($gi_schd_dt.equalsIgnoreCase(name)) {
			return gi_schd_dt();
		}
		if ($insp_st_schd_dt.equalsIgnoreCase(name)) {
			return insp_st_schd_dt();
		}
		if ($insp_end_schd_dt.equalsIgnoreCase(name)) {
			return insp_end_schd_dt();
		}
		return super.getDate(name);
	}
	public boolean getBoolean(String name) {
		if ($sim_ord_flg.equalsIgnoreCase(name)) {
			return sim_ord_flg();
		}
		if ($not_fix_flg.equalsIgnoreCase(name)) {
			return not_fix_flg();
		}
		if ($blk_flg.equalsIgnoreCase(name)) {
			return blk_flg();
		}
		if ($str_ln_cd_none_flg.equalsIgnoreCase(name)) {
			return str_ln_cd_none_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($trd_nm.equalsIgnoreCase(name)) {
			return trd_nm();
		}
		if ($ord_ext_dat_typ_nm.equalsIgnoreCase(name)) {
			return ord_ext_dat_typ_nm();
		}
		if ($ord_ext_dat_no.equalsIgnoreCase(name)) {
			return ord_ext_dat_no();
		}
		if ($strg_dlv_cd.equalsIgnoreCase(name)) {
			return strg_dlv_cd();
		}
		if ($strg_dlv_nm.equalsIgnoreCase(name)) {
			return strg_dlv_nm();
		}
		if ($trd_loc_bp_cd.equalsIgnoreCase(name)) {
			return trd_loc_bp_cd();
		}
		if ($trd_loc_bp_nm.equalsIgnoreCase(name)) {
			return trd_loc_bp_nm();
		}
		if ($base_unit_cd.equalsIgnoreCase(name)) {
			return base_unit_cd();
		}
		if ($base_unit_nm.equalsIgnoreCase(name)) {
			return base_unit_nm();
		}
		if ($rqmt_no.equalsIgnoreCase(name)) {
			return rqmt_no();
		}
		if ($strg_loc_cd.equalsIgnoreCase(name)) {
			return strg_loc_cd();
		}
		if ($strg_loc_nm.equalsIgnoreCase(name)) {
			return strg_loc_nm();
		}
		if ($itm_ord_no.equalsIgnoreCase(name)) {
			return itm_ord_no();
		}
		if ($itm_ord_typ.equalsIgnoreCase(name)) {
			return itm_ord_typ();
		}
		if ($itm_ord_typ_nm.equalsIgnoreCase(name)) {
			return itm_ord_typ_nm();
		}
		if ($mfg_loc_cd.equalsIgnoreCase(name)) {
			return mfg_loc_cd();
		}
		if ($mfg_loc_nm.equalsIgnoreCase(name)) {
			return mfg_loc_nm();
		}
		if ($oper_ptn.equalsIgnoreCase(name)) {
			return oper_ptn();
		}
		if ($bom_ptn.equalsIgnoreCase(name)) {
			return bom_ptn();
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
		if ($rqst_loc_cd.equalsIgnoreCase(name)) {
			return rqst_loc_cd();
		}
		if ($rqst_loc_nm.equalsIgnoreCase(name)) {
			return rqst_loc_nm();
		}
		if ($rqst_wg_cd.equalsIgnoreCase(name)) {
			return rqst_wg_cd();
		}
		if ($rqst_wg_nm.equalsIgnoreCase(name)) {
			return rqst_wg_nm();
		}
		if ($io_schd_no.equalsIgnoreCase(name)) {
			return io_schd_no();
		}
		if ($io_schd_typ.equalsIgnoreCase(name)) {
			return io_schd_typ();
		}
		if ($io_schd_typ_nm.equalsIgnoreCase(name)) {
			return io_schd_typ_nm();
		}
		if ($io_schd_sts_typ.equalsIgnoreCase(name)) {
			return io_schd_sts_typ();
		}
		if ($io_schd_sts_typ_nm.equalsIgnoreCase(name)) {
			return io_schd_sts_typ_nm();
		}
		if ($io_schd_pr_no.equalsIgnoreCase(name)) {
			return io_schd_pr_no();
		}
		if ($lot_no.equalsIgnoreCase(name)) {
			return lot_no();
		}
		if ($sublot_no.equalsIgnoreCase(name)) {
			return sublot_no();
		}
		if ($pack_unit_cd.equalsIgnoreCase(name)) {
			return pack_unit_cd();
		}
		if ($pack_unit_nm.equalsIgnoreCase(name)) {
			return pack_unit_nm();
		}
		if ($stk_loc_cd.equalsIgnoreCase(name)) {
			return stk_loc_cd();
		}
		if ($stk_loc_nm.equalsIgnoreCase(name)) {
			return stk_loc_nm();
		}
		if ($str_ln_cd.equalsIgnoreCase(name)) {
			return str_ln_cd();
		}
		if ($str_ln_nm.equalsIgnoreCase(name)) {
			return str_ln_nm();
		}
		if ($in_xfr_typ.equalsIgnoreCase(name)) {
			return in_xfr_typ();
		}
		if ($in_xfr_typ_nm.equalsIgnoreCase(name)) {
			return in_xfr_typ_nm();
		}
		if ($quality_typ.equalsIgnoreCase(name)) {
			return quality_typ();
		}
		if ($quality_typ_nm.equalsIgnoreCase(name)) {
			return quality_typ_nm();
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
		if ($asst_typ.equalsIgnoreCase(name)) {
			return asst_typ();
		}
		if ($asst_typ_nm.equalsIgnoreCase(name)) {
			return asst_typ_nm();
		}
		if ($gd_cd.equalsIgnoreCase(name)) {
			return gd_cd();
		}
		if ($gd_nm.equalsIgnoreCase(name)) {
			return gd_nm();
		}
		if ($stk_bp_cd.equalsIgnoreCase(name)) {
			return stk_bp_cd();
		}
		if ($stk_bp_nm.equalsIgnoreCase(name)) {
			return stk_bp_nm();
		}
		if ($sim_mrp_no.equalsIgnoreCase(name)) {
			return sim_mrp_no();
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			return wg_nm();
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
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($base_dec_place.equalsIgnoreCase(name)) {
			return base_dec_place();
		}
		if ($pack_dec_place.equalsIgnoreCase(name)) {
			return pack_dec_place();
		}
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($strg_schd_dt.equalsIgnoreCase(name)) {
			return strg_schd_dt();
		}
		if ($avl_schd_dt.equalsIgnoreCase(name)) {
			return avl_schd_dt();
		}
		if ($mfg_st_schd_dt.equalsIgnoreCase(name)) {
			return mfg_st_schd_dt();
		}
		if ($mfg_end_schd_dt.equalsIgnoreCase(name)) {
			return mfg_end_schd_dt();
		}
		if ($po_schd_dt.equalsIgnoreCase(name)) {
			return po_schd_dt();
		}
		if ($accpt_schd_dt.equalsIgnoreCase(name)) {
			return accpt_schd_dt();
		}
		if ($gi_schd_dt.equalsIgnoreCase(name)) {
			return gi_schd_dt();
		}
		if ($insp_st_schd_dt.equalsIgnoreCase(name)) {
			return insp_st_schd_dt();
		}
		if ($insp_end_schd_dt.equalsIgnoreCase(name)) {
			return insp_end_schd_dt();
		}
		return super.getDateNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($sim_ord_flg.equalsIgnoreCase(name)) {
			return sim_ord_flg();
		}
		if ($not_fix_flg.equalsIgnoreCase(name)) {
			return not_fix_flg();
		}
		if ($blk_flg.equalsIgnoreCase(name)) {
			return blk_flg();
		}
		if ($str_ln_cd_none_flg.equalsIgnoreCase(name)) {
			return str_ln_cd_none_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($trd_nm.equalsIgnoreCase(name)) {
			trd_nm(value);
			return;
		}
		if ($ord_ext_dat_typ_nm.equalsIgnoreCase(name)) {
			ord_ext_dat_typ_nm(value);
			return;
		}
		if ($ord_ext_dat_no.equalsIgnoreCase(name)) {
			ord_ext_dat_no(value);
			return;
		}
		if ($strg_dlv_cd.equalsIgnoreCase(name)) {
			strg_dlv_cd(value);
			return;
		}
		if ($strg_dlv_nm.equalsIgnoreCase(name)) {
			strg_dlv_nm(value);
			return;
		}
		if ($trd_loc_bp_cd.equalsIgnoreCase(name)) {
			trd_loc_bp_cd(value);
			return;
		}
		if ($trd_loc_bp_nm.equalsIgnoreCase(name)) {
			trd_loc_bp_nm(value);
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
		if ($rqmt_no.equalsIgnoreCase(name)) {
			rqmt_no(value);
			return;
		}
		if ($strg_loc_cd.equalsIgnoreCase(name)) {
			strg_loc_cd(value);
			return;
		}
		if ($strg_loc_nm.equalsIgnoreCase(name)) {
			strg_loc_nm(value);
			return;
		}
		if ($itm_ord_no.equalsIgnoreCase(name)) {
			itm_ord_no(value);
			return;
		}
		if ($itm_ord_typ.equalsIgnoreCase(name)) {
			itm_ord_typ(value);
			return;
		}
		if ($itm_ord_typ_nm.equalsIgnoreCase(name)) {
			itm_ord_typ_nm(value);
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
		if ($oper_ptn.equalsIgnoreCase(name)) {
			oper_ptn(value);
			return;
		}
		if ($bom_ptn.equalsIgnoreCase(name)) {
			bom_ptn(value);
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
		if ($rqst_loc_cd.equalsIgnoreCase(name)) {
			rqst_loc_cd(value);
			return;
		}
		if ($rqst_loc_nm.equalsIgnoreCase(name)) {
			rqst_loc_nm(value);
			return;
		}
		if ($rqst_wg_cd.equalsIgnoreCase(name)) {
			rqst_wg_cd(value);
			return;
		}
		if ($rqst_wg_nm.equalsIgnoreCase(name)) {
			rqst_wg_nm(value);
			return;
		}
		if ($io_schd_no.equalsIgnoreCase(name)) {
			io_schd_no(value);
			return;
		}
		if ($io_schd_typ.equalsIgnoreCase(name)) {
			io_schd_typ(value);
			return;
		}
		if ($io_schd_typ_nm.equalsIgnoreCase(name)) {
			io_schd_typ_nm(value);
			return;
		}
		if ($io_schd_sts_typ.equalsIgnoreCase(name)) {
			io_schd_sts_typ(value);
			return;
		}
		if ($io_schd_sts_typ_nm.equalsIgnoreCase(name)) {
			io_schd_sts_typ_nm(value);
			return;
		}
		if ($io_schd_pr_no.equalsIgnoreCase(name)) {
			io_schd_pr_no(value);
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
		if ($pack_unit_cd.equalsIgnoreCase(name)) {
			pack_unit_cd(value);
			return;
		}
		if ($pack_unit_nm.equalsIgnoreCase(name)) {
			pack_unit_nm(value);
			return;
		}
		if ($stk_loc_cd.equalsIgnoreCase(name)) {
			stk_loc_cd(value);
			return;
		}
		if ($stk_loc_nm.equalsIgnoreCase(name)) {
			stk_loc_nm(value);
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
		if ($in_xfr_typ.equalsIgnoreCase(name)) {
			in_xfr_typ(value);
			return;
		}
		if ($in_xfr_typ_nm.equalsIgnoreCase(name)) {
			in_xfr_typ_nm(value);
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
		if ($asst_typ.equalsIgnoreCase(name)) {
			asst_typ(value);
			return;
		}
		if ($asst_typ_nm.equalsIgnoreCase(name)) {
			asst_typ_nm(value);
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
		if ($stk_bp_cd.equalsIgnoreCase(name)) {
			stk_bp_cd(value);
			return;
		}
		if ($stk_bp_nm.equalsIgnoreCase(name)) {
			stk_bp_nm(value);
			return;
		}
		if ($sim_mrp_no.equalsIgnoreCase(name)) {
			sim_mrp_no(value);
			return;
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			wg_cd(value);
			return;
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			wg_nm(value);
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
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($base_dec_place.equalsIgnoreCase(name)) {
			base_dec_place(value);
			return;
		}
		if ($pack_dec_place.equalsIgnoreCase(name)) {
			pack_dec_place(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($base_dec_place.equalsIgnoreCase(name)) {
			base_dec_place(value);
			return;
		}
		if ($pack_dec_place.equalsIgnoreCase(name)) {
			pack_dec_place(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($base_dec_place.equalsIgnoreCase(name)) {
			base_dec_place(value);
			return;
		}
		if ($pack_dec_place.equalsIgnoreCase(name)) {
			pack_dec_place(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($base_dec_place.equalsIgnoreCase(name)) {
			base_dec_place(value);
			return;
		}
		if ($pack_dec_place.equalsIgnoreCase(name)) {
			pack_dec_place(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($base_dec_place.equalsIgnoreCase(name)) {
			base_dec_place(value);
			return;
		}
		if ($pack_dec_place.equalsIgnoreCase(name)) {
			pack_dec_place(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($strg_schd_dt.equalsIgnoreCase(name)) {
			strg_schd_dt(value);
			return;
		}
		if ($avl_schd_dt.equalsIgnoreCase(name)) {
			avl_schd_dt(value);
			return;
		}
		if ($mfg_st_schd_dt.equalsIgnoreCase(name)) {
			mfg_st_schd_dt(value);
			return;
		}
		if ($mfg_end_schd_dt.equalsIgnoreCase(name)) {
			mfg_end_schd_dt(value);
			return;
		}
		if ($po_schd_dt.equalsIgnoreCase(name)) {
			po_schd_dt(value);
			return;
		}
		if ($accpt_schd_dt.equalsIgnoreCase(name)) {
			accpt_schd_dt(value);
			return;
		}
		if ($gi_schd_dt.equalsIgnoreCase(name)) {
			gi_schd_dt(value);
			return;
		}
		if ($insp_st_schd_dt.equalsIgnoreCase(name)) {
			insp_st_schd_dt(value);
			return;
		}
		if ($insp_end_schd_dt.equalsIgnoreCase(name)) {
			insp_end_schd_dt(value);
			return;
		}
		super.setDate(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($sim_ord_flg.equalsIgnoreCase(name)) {
			sim_ord_flg(value);
			return;
		}
		if ($not_fix_flg.equalsIgnoreCase(name)) {
			not_fix_flg(value);
			return;
		}
		if ($blk_flg.equalsIgnoreCase(name)) {
			blk_flg(value);
			return;
		}
		if ($str_ln_cd_none_flg.equalsIgnoreCase(name)) {
			str_ln_cd_none_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($trd_nm.equalsIgnoreCase(name)) {
			trd_nm(value);
			return;
		}
		if ($ord_ext_dat_typ_nm.equalsIgnoreCase(name)) {
			ord_ext_dat_typ_nm(value);
			return;
		}
		if ($ord_ext_dat_no.equalsIgnoreCase(name)) {
			ord_ext_dat_no(value);
			return;
		}
		if ($strg_dlv_cd.equalsIgnoreCase(name)) {
			strg_dlv_cd(value);
			return;
		}
		if ($strg_dlv_nm.equalsIgnoreCase(name)) {
			strg_dlv_nm(value);
			return;
		}
		if ($trd_loc_bp_cd.equalsIgnoreCase(name)) {
			trd_loc_bp_cd(value);
			return;
		}
		if ($trd_loc_bp_nm.equalsIgnoreCase(name)) {
			trd_loc_bp_nm(value);
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
		if ($rqmt_no.equalsIgnoreCase(name)) {
			rqmt_no(value);
			return;
		}
		if ($strg_loc_cd.equalsIgnoreCase(name)) {
			strg_loc_cd(value);
			return;
		}
		if ($strg_loc_nm.equalsIgnoreCase(name)) {
			strg_loc_nm(value);
			return;
		}
		if ($itm_ord_no.equalsIgnoreCase(name)) {
			itm_ord_no(value);
			return;
		}
		if ($itm_ord_typ.equalsIgnoreCase(name)) {
			itm_ord_typ(value);
			return;
		}
		if ($itm_ord_typ_nm.equalsIgnoreCase(name)) {
			itm_ord_typ_nm(value);
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
		if ($oper_ptn.equalsIgnoreCase(name)) {
			oper_ptn(value);
			return;
		}
		if ($bom_ptn.equalsIgnoreCase(name)) {
			bom_ptn(value);
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
		if ($rqst_loc_cd.equalsIgnoreCase(name)) {
			rqst_loc_cd(value);
			return;
		}
		if ($rqst_loc_nm.equalsIgnoreCase(name)) {
			rqst_loc_nm(value);
			return;
		}
		if ($rqst_wg_cd.equalsIgnoreCase(name)) {
			rqst_wg_cd(value);
			return;
		}
		if ($rqst_wg_nm.equalsIgnoreCase(name)) {
			rqst_wg_nm(value);
			return;
		}
		if ($io_schd_no.equalsIgnoreCase(name)) {
			io_schd_no(value);
			return;
		}
		if ($io_schd_typ.equalsIgnoreCase(name)) {
			io_schd_typ(value);
			return;
		}
		if ($io_schd_typ_nm.equalsIgnoreCase(name)) {
			io_schd_typ_nm(value);
			return;
		}
		if ($io_schd_sts_typ.equalsIgnoreCase(name)) {
			io_schd_sts_typ(value);
			return;
		}
		if ($io_schd_sts_typ_nm.equalsIgnoreCase(name)) {
			io_schd_sts_typ_nm(value);
			return;
		}
		if ($io_schd_pr_no.equalsIgnoreCase(name)) {
			io_schd_pr_no(value);
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
		if ($pack_unit_cd.equalsIgnoreCase(name)) {
			pack_unit_cd(value);
			return;
		}
		if ($pack_unit_nm.equalsIgnoreCase(name)) {
			pack_unit_nm(value);
			return;
		}
		if ($stk_loc_cd.equalsIgnoreCase(name)) {
			stk_loc_cd(value);
			return;
		}
		if ($stk_loc_nm.equalsIgnoreCase(name)) {
			stk_loc_nm(value);
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
		if ($in_xfr_typ.equalsIgnoreCase(name)) {
			in_xfr_typ(value);
			return;
		}
		if ($in_xfr_typ_nm.equalsIgnoreCase(name)) {
			in_xfr_typ_nm(value);
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
		if ($asst_typ.equalsIgnoreCase(name)) {
			asst_typ(value);
			return;
		}
		if ($asst_typ_nm.equalsIgnoreCase(name)) {
			asst_typ_nm(value);
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
		if ($stk_bp_cd.equalsIgnoreCase(name)) {
			stk_bp_cd(value);
			return;
		}
		if ($stk_bp_nm.equalsIgnoreCase(name)) {
			stk_bp_nm(value);
			return;
		}
		if ($sim_mrp_no.equalsIgnoreCase(name)) {
			sim_mrp_no(value);
			return;
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			wg_cd(value);
			return;
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			wg_nm(value);
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
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($base_dec_place.equalsIgnoreCase(name)) {
			base_dec_place(value);
			return;
		}
		if ($pack_dec_place.equalsIgnoreCase(name)) {
			pack_dec_place(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($base_dec_place.equalsIgnoreCase(name)) {
			base_dec_place(value);
			return;
		}
		if ($pack_dec_place.equalsIgnoreCase(name)) {
			pack_dec_place(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($base_dec_place.equalsIgnoreCase(name)) {
			base_dec_place(value);
			return;
		}
		if ($pack_dec_place.equalsIgnoreCase(name)) {
			pack_dec_place(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($base_dec_place.equalsIgnoreCase(name)) {
			base_dec_place(value);
			return;
		}
		if ($pack_dec_place.equalsIgnoreCase(name)) {
			pack_dec_place(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($base_dec_place.equalsIgnoreCase(name)) {
			base_dec_place(value);
			return;
		}
		if ($pack_dec_place.equalsIgnoreCase(name)) {
			pack_dec_place(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($strg_schd_dt.equalsIgnoreCase(name)) {
			strg_schd_dt(value);
			return;
		}
		if ($avl_schd_dt.equalsIgnoreCase(name)) {
			avl_schd_dt(value);
			return;
		}
		if ($mfg_st_schd_dt.equalsIgnoreCase(name)) {
			mfg_st_schd_dt(value);
			return;
		}
		if ($mfg_end_schd_dt.equalsIgnoreCase(name)) {
			mfg_end_schd_dt(value);
			return;
		}
		if ($po_schd_dt.equalsIgnoreCase(name)) {
			po_schd_dt(value);
			return;
		}
		if ($accpt_schd_dt.equalsIgnoreCase(name)) {
			accpt_schd_dt(value);
			return;
		}
		if ($gi_schd_dt.equalsIgnoreCase(name)) {
			gi_schd_dt(value);
			return;
		}
		if ($insp_st_schd_dt.equalsIgnoreCase(name)) {
			insp_st_schd_dt(value);
			return;
		}
		if ($insp_end_schd_dt.equalsIgnoreCase(name)) {
			insp_end_schd_dt(value);
			return;
		}
		super.setDateNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($sim_ord_flg.equalsIgnoreCase(name)) {
			sim_ord_flg(value);
			return;
		}
		if ($not_fix_flg.equalsIgnoreCase(name)) {
			not_fix_flg(value);
			return;
		}
		if ($blk_flg.equalsIgnoreCase(name)) {
			blk_flg(value);
			return;
		}
		if ($str_ln_cd_none_flg.equalsIgnoreCase(name)) {
			str_ln_cd_none_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}

	public MCRow getInnerRow(String name) {
		if ($hrrchy_p.equalsIgnoreCase(name)) {
			return hrrchy_p();
		}
		if ($itm_p.equalsIgnoreCase(name)) {
			return itm_p();
		}
		if ($schd_alloc_qty_p.equalsIgnoreCase(name)) {
			return schd_alloc_qty_p();
		}
		if ($sno_wrk_no_p.equalsIgnoreCase(name)) {
			return sno_wrk_no_p();
		}
		if ($inst_qty_p.equalsIgnoreCase(name)) {
			return inst_qty_p();
		}
		if ($yield_schd_qty_p.equalsIgnoreCase(name)) {
			return yield_schd_qty_p();
		}
		if ($ver_no_p.equalsIgnoreCase(name)) {
			return ver_no_p();
		}
		if ($base_unit_qty_p.equalsIgnoreCase(name)) {
			return base_unit_qty_p();
		}
		if ($pack_unit_qty_p.equalsIgnoreCase(name)) {
			return pack_unit_qty_p();
		}
		return super.getInnerRow(name);
	}

	public void setInnerRow(String name, MCRow value) {
		if ($hrrchy_p.equalsIgnoreCase(name)) {
			hrrchy_p(
				((MCContainerMeta) hrrchy_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5210.HrrchyR.class, value)
			);
			return;
		}
		if ($itm_p.equalsIgnoreCase(name)) {
			itm_p(
				((MCContainerMeta) itm_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5030.ItmR.class, value)
			);
			return;
		}
		if ($schd_alloc_qty_p.equalsIgnoreCase(name)) {
			schd_alloc_qty_p(
				((MCContainerMeta) schd_alloc_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($sno_wrk_no_p.equalsIgnoreCase(name)) {
			sno_wrk_no_p(
				((MCContainerMeta) sno_wrk_no_p_META).castInnerRow(mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.class, value)
			);
			return;
		}
		if ($inst_qty_p.equalsIgnoreCase(name)) {
			inst_qty_p(
				((MCContainerMeta) inst_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($yield_schd_qty_p.equalsIgnoreCase(name)) {
			yield_schd_qty_p(
				((MCContainerMeta) yield_schd_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($ver_no_p.equalsIgnoreCase(name)) {
			ver_no_p(
				((MCContainerMeta) ver_no_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5250.VerNoR.class, value)
			);
			return;
		}
		if ($base_unit_qty_p.equalsIgnoreCase(name)) {
			base_unit_qty_p(
				((MCContainerMeta) base_unit_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($pack_unit_qty_p.equalsIgnoreCase(name)) {
			pack_unit_qty_p(
				((MCContainerMeta) pack_unit_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		super.setInnerRow(name, value);
	}


	public MCNumber hrrchy() {
		return hrrchy_p().hrrchy();
	}

	public void hrrchy(MCNumber value) {
		hrrchy_p().hrrchy(value);
	}

	public void hrrchy(int value) {
		hrrchy_p().hrrchy(value);
	}

	public void hrrchy(long value) {
		hrrchy_p().hrrchy(value);
	}

	public void hrrchy(float value) {
		hrrchy_p().hrrchy(value);
	}

	public void hrrchy(double value) {
		hrrchy_p().hrrchy(value);
	}

	public MCNumber extno() {
		return hrrchy_p().extno();
	}

	public void extno(MCNumber value) {
		hrrchy_p().extno(value);
	}

	public void extno(int value) {
		hrrchy_p().extno(value);
	}

	public void extno(long value) {
		hrrchy_p().extno(value);
	}

	public void extno(float value) {
		hrrchy_p().extno(value);
	}

	public void extno(double value) {
		hrrchy_p().extno(value);
	}

	public MCNumber par_extno() {
		return hrrchy_p().par_extno();
	}

	public void par_extno(MCNumber value) {
		hrrchy_p().par_extno(value);
	}

	public void par_extno(int value) {
		hrrchy_p().par_extno(value);
	}

	public void par_extno(long value) {
		hrrchy_p().par_extno(value);
	}

	public void par_extno(float value) {
		hrrchy_p().par_extno(value);
	}

	public void par_extno(double value) {
		hrrchy_p().par_extno(value);
	}

	public boolean loop_flg() {
		return hrrchy_p().loop_flg();
	}

	public void loop_flg(boolean value) {
		hrrchy_p().loop_flg(value);
	}

	public String leaf() {
		return hrrchy_p().leaf();
	}

	public void leaf(String value) {
		hrrchy_p().leaf(value);
	}

	/**
	 * Item 品目.<p>
	 *
	 */
	public String leaf_str() {
		return hrrchy_p().leaf_str();
	}

	/**
	 * Item 品目.<p>
	 *
	 */
	public void leaf_str(String value) {
		hrrchy_p().leaf_str(value);
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

	/**
	 * Allocation scheduled qty. 引当予定数量.<p>
	 *
	 */
	public MCNumber schd_alloc_qty() {
		return schd_alloc_qty_p().qty();
	}

	/**
	 * Allocation scheduled qty. 引当予定数量.<p>
	 *
	 */
	public void schd_alloc_qty(MCNumber value) {
		schd_alloc_qty_p().qty(value);
	}

	/**
	 * Allocation scheduled qty. 引当予定数量.<p>
	 *
	 */
	public void schd_alloc_qty(int value) {
		schd_alloc_qty_p().qty(value);
	}

	/**
	 * Allocation scheduled qty. 引当予定数量.<p>
	 *
	 */
	public void schd_alloc_qty(long value) {
		schd_alloc_qty_p().qty(value);
	}

	/**
	 * Allocation scheduled qty. 引当予定数量.<p>
	 *
	 */
	public void schd_alloc_qty(float value) {
		schd_alloc_qty_p().qty(value);
	}

	/**
	 * Allocation scheduled qty. 引当予定数量.<p>
	 *
	 */
	public void schd_alloc_qty(double value) {
		schd_alloc_qty_p().qty(value);
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
	 * Order scheduled qty. 指図予定数量.<p>
	 *
	 */
	public MCNumber inst_qty() {
		return inst_qty_p().qty();
	}

	/**
	 * Order scheduled qty. 指図予定数量.<p>
	 *
	 */
	public void inst_qty(MCNumber value) {
		inst_qty_p().qty(value);
	}

	/**
	 * Order scheduled qty. 指図予定数量.<p>
	 *
	 */
	public void inst_qty(int value) {
		inst_qty_p().qty(value);
	}

	/**
	 * Order scheduled qty. 指図予定数量.<p>
	 *
	 */
	public void inst_qty(long value) {
		inst_qty_p().qty(value);
	}

	/**
	 * Order scheduled qty. 指図予定数量.<p>
	 *
	 */
	public void inst_qty(float value) {
		inst_qty_p().qty(value);
	}

	/**
	 * Order scheduled qty. 指図予定数量.<p>
	 *
	 */
	public void inst_qty(double value) {
		inst_qty_p().qty(value);
	}

	/**
	 * Output scheduled qty. 出来高予定数量.<p>
	 *
	 */
	public MCNumber yield_schd_qty() {
		return yield_schd_qty_p().qty();
	}

	/**
	 * Output scheduled qty. 出来高予定数量.<p>
	 *
	 */
	public void yield_schd_qty(MCNumber value) {
		yield_schd_qty_p().qty(value);
	}

	/**
	 * Output scheduled qty. 出来高予定数量.<p>
	 *
	 */
	public void yield_schd_qty(int value) {
		yield_schd_qty_p().qty(value);
	}

	/**
	 * Output scheduled qty. 出来高予定数量.<p>
	 *
	 */
	public void yield_schd_qty(long value) {
		yield_schd_qty_p().qty(value);
	}

	/**
	 * Output scheduled qty. 出来高予定数量.<p>
	 *
	 */
	public void yield_schd_qty(float value) {
		yield_schd_qty_p().qty(value);
	}

	/**
	 * Output scheduled qty. 出来高予定数量.<p>
	 *
	 */
	public void yield_schd_qty(double value) {
		yield_schd_qty_p().qty(value);
	}

	public String ver_no() {
		return ver_no_p().ver_no();
	}

	public void ver_no(String value) {
		ver_no_p().ver_no(value);
	}

	/**
	 * Base inventory qty. 基準在庫数量.<p>
	 *
	 */
	public MCNumber base_unit_qty() {
		return base_unit_qty_p().qty();
	}

	/**
	 * Base inventory qty. 基準在庫数量.<p>
	 *
	 */
	public void base_unit_qty(MCNumber value) {
		base_unit_qty_p().qty(value);
	}

	/**
	 * Base inventory qty. 基準在庫数量.<p>
	 *
	 */
	public void base_unit_qty(int value) {
		base_unit_qty_p().qty(value);
	}

	/**
	 * Base inventory qty. 基準在庫数量.<p>
	 *
	 */
	public void base_unit_qty(long value) {
		base_unit_qty_p().qty(value);
	}

	/**
	 * Base inventory qty. 基準在庫数量.<p>
	 *
	 */
	public void base_unit_qty(float value) {
		base_unit_qty_p().qty(value);
	}

	/**
	 * Base inventory qty. 基準在庫数量.<p>
	 *
	 */
	public void base_unit_qty(double value) {
		base_unit_qty_p().qty(value);
	}

	/**
	 * SKU inventory qty. 荷姿在庫数量.<p>
	 *
	 */
	public MCNumber pack_unit_qty() {
		return pack_unit_qty_p().qty();
	}

	/**
	 * SKU inventory qty. 荷姿在庫数量.<p>
	 *
	 */
	public void pack_unit_qty(MCNumber value) {
		pack_unit_qty_p().qty(value);
	}

	/**
	 * SKU inventory qty. 荷姿在庫数量.<p>
	 *
	 */
	public void pack_unit_qty(int value) {
		pack_unit_qty_p().qty(value);
	}

	/**
	 * SKU inventory qty. 荷姿在庫数量.<p>
	 *
	 */
	public void pack_unit_qty(long value) {
		pack_unit_qty_p().qty(value);
	}

	/**
	 * SKU inventory qty. 荷姿在庫数量.<p>
	 *
	 */
	public void pack_unit_qty(float value) {
		pack_unit_qty_p().qty(value);
	}

	/**
	 * SKU inventory qty. 荷姿在庫数量.<p>
	 *
	 */
	public void pack_unit_qty(double value) {
		pack_unit_qty_p().qty(value);
	}

}

