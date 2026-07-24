package mcframe.serverMSBC.MSBCL5010;

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
 * ブロック"Ord_Upd01_Dtl1"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class Ord_Upd01_Dtl1R_MC_A extends MCConstRow {

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public static final String $peg_no = "peg_no";
	/**
	 * MRP type ＭＲＰタイプ.<p>
	 *
	 */
	public static final String $mrp_typ = "mrp_typ";
	/**
	 * Data update type データ更新区分.<p>
	 *
	 */
	public static final String $data_crud_typ = "data_crud_typ";
	/**
	 * Order status type after update 更新後オーダ状況区分.<p>
	 *
	 */
	public static final String $a_itm_ord_sts_typ = "a_itm_ord_sts_typ";
	/**
	 * Order status type before update 更新前オーダ状況区分.<p>
	 *
	 */
	public static final String $b_itm_ord_sts_typ = "b_itm_ord_sts_typ";
	public static final String $ord = "ord";
	/**
	 * Caller mfg. order flg. 呼出元製造指図ＦＬＧ.<p>
	 *
	 */
	public static final String $is_src_mfg_inst_flg = "is_src_mfg_inst_flg";
	/**
	 * Storage location distribution group cd. 格納場所物流グループＣＤ.<p>
	 *
	 */
	public static final String $strg_lg_grp_cd = "strg_lg_grp_cd";
	/**
	 * Storage location supplier cd. 格納場所発注先ＣＤ.<p>
	 *
	 */
	public static final String $strg_sppl_cd = "strg_sppl_cd";
	/**
	 * Subcontractor cd. 外注発注先ＣＤ.<p>
	 *
	 */
	public static final String $mfg_sppl_cd = "mfg_sppl_cd";
	/**
	 * Subcontracting maker cd. 外注メーカＣＤ.<p>
	 *
	 */
	public static final String $mfg_maker_cd = "mfg_maker_cd";
	/**
	 * Requested location distribution group cd. 依頼先場所物流グループＣＤ.<p>
	 *
	 */
	public static final String $rqst_to_lg_grp_cd = "rqst_to_lg_grp_cd";
	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public static final String $unit_cd = "unit_cd";
	/**
	 * Operation order generation 工程オーダ生成.<p>
	 *
	 */
	public static final String $oper_ord_pr_flg = "oper_ord_pr_flg";
	/**
	 * Generate GR/GI schedule 受払予定生成.<p>
	 *
	 */
	public static final String $io_schd_pr_flg = "io_schd_pr_flg";
	/**
	 * Requested location distribution group cd. 依頼先場所物流グループＣＤ.<p>
	 *
	 */
	public static final String $rqst_lg_grp_cd = "rqst_lg_grp_cd";
	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public static final String $dec_place = "dec_place";
	/**
	 * Error エラー.<p>
	 *
	 */
	public static final String $err_flg = "err_flg";
	/**
	 * Item details item cd. 品目詳細品目ＣＤ.<p>
	 *
	 */
	public static final String $chk_itm_cd = "chk_itm_cd";
	/**
	 * WG mfg. ＷＧ製造.<p>
	 *
	 */
	public static final String $chk_wg_mfg_flg = "chk_wg_mfg_flg";
	/**
	 * WG Distribution ＷＧ物流.<p>
	 *
	 */
	public static final String $chk_wg_lg_flg = "chk_wg_lg_flg";
	/**
	 * Storage location WG cd. 格納場所ＷＧＣＤ.<p>
	 *
	 */
	public static final String $chk_strg_loc_wg_cd = "chk_strg_loc_wg_cd";
	/**
	 * Storage location distribution group cd. 格納場所物流グループＣＤ.<p>
	 *
	 */
	public static final String $chk_strg_loc_lg_grp_cd = "chk_strg_loc_lg_grp_cd";
	/**
	 * Storage location factory/distribution cd. 格納場所工場・物流ＣＤ.<p>
	 *
	 */
	public static final String $chk_strg_loc_site_cd = "chk_strg_loc_site_cd";
	/**
	 * Mfg. location WG cd. 製造場所ワーキンググループＣＤ.<p>
	 *
	 */
	public static final String $chk_mfg_loc_wg_cd = "chk_mfg_loc_wg_cd";
	/**
	 * Requested location WG cd. 依頼先場所ワーキンググループＣＤ.<p>
	 *
	 */
	public static final String $chk_rqst_loc_wg_cd = "chk_rqst_loc_wg_cd";
	/**
	 * Requested location distribution group cd. 依頼先場所物流グループＣＤ.<p>
	 *
	 */
	public static final String $chk_rqst_loc_lg_grp_cd = "chk_rqst_loc_lg_grp_cd";
	/**
	 * For item version control 品目版管理対象.<p>
	 *
	 */
	public static final String $chk_itm_ver_flg = "chk_itm_ver_flg";
	/**
	 * For inspection 検査対象.<p>
	 *
	 */
	public static final String $chk_itm_insp_flg = "chk_itm_insp_flg";
	/**
	 * Effective version No. 有効版ＮＯ.<p>
	 *
	 */
	public static final String $chk_valid_ver_no_flg = "chk_valid_ver_no_flg";
	/**
	 * WG cd. before correction 訂正前ワーキンググループＣＤ.<p>
	 *
	 */
	public static final String $chk_b_wg_cd = "chk_b_wg_cd";
	/**
	 * Order status type before correction 訂正前オーダ状況区分.<p>
	 *
	 */
	public static final String $chk_b_itm_ord_sts_typ = "chk_b_itm_ord_sts_typ";
	/**
	 * Item procurement disapproval master exist 手配不許可品目マスタ存在.<p>
	 *
	 */
	public static final String $chk_not_fix_flg = "chk_not_fix_flg";
	/**
	 * Item prohibit master exist 品目禁止マスタ存在.<p>
	 *
	 */
	public static final String $chk_itm_stop_flg = "chk_itm_stop_flg";
	/**
	 * Order prohibited date オーダ禁止日.<p>
	 *
	 */
	public static final String $chk_order_stop_dt = "chk_order_stop_dt";
	/**
	 * Supplier prohibited master exist 発注先禁止マスタ存在.<p>
	 *
	 */
	public static final String $chk_sppl_stop_flg = "chk_sppl_stop_flg";
	/**
	 * Supplier prohibited date 発注先禁止日.<p>
	 *
	 */
	public static final String $chk_sppl_stop_dt = "chk_sppl_stop_dt";
	/**
	 * Mfg. location supplier prohibited master exist 製造場所発注先禁止マスタ存在.<p>
	 *
	 */
	public static final String $chk_mfg_sppl_stop_flg = "chk_mfg_sppl_stop_flg";
	/**
	 * Mfg. location supplier prohibited date 製造場所発注先禁止日.<p>
	 *
	 */
	public static final String $chk_mfg_sppl_stop_dt = "chk_mfg_sppl_stop_dt";
	/**
	 * Item master SEIBAN No. 1 management type 品目マスタ手配ＮＯ１管理区分.<p>
	 *
	 */
	public static final String $chk_itm_sno1_mng_typ = "chk_itm_sno1_mng_typ";
	/**
	 * Item master SEIBAN No. 2 management type 品目マスタ手配ＮＯ２管理区分.<p>
	 *
	 */
	public static final String $chk_itm_sno2_mng_typ = "chk_itm_sno2_mng_typ";
	/**
	 * Item master SEIBAN No. 3 management type 品目マスタ手配ＮＯ３管理区分.<p>
	 *
	 */
	public static final String $chk_itm_sno3_mng_typ = "chk_itm_sno3_mng_typ";
	/**
	 * Item master SEIBAN No. 4 management type 品目マスタ手配ＮＯ４管理区分.<p>
	 *
	 */
	public static final String $chk_itm_sno4_mng_typ = "chk_itm_sno4_mng_typ";
	/**
	 * Scheduler exclusion スケジューラ排他.<p>
	 *
	 */
	public static final String $chk_sche_ord_flg = "chk_sche_ord_flg";
	/**
	 * Default operation デフォルト工程.<p>
	 *
	 */
	public static final String $chk_dft_oper_flg = "chk_dft_oper_flg";
	/**
	 * Allow inspecting lot use 検査中ロット使用許可.<p>
	 *
	 */
	public static final String $in_prmt_insp_flg = "in_prmt_insp_flg";
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
	 * Inventory management type 在庫管理区分.<p>
	 *
	 */
	public static final String $stk_mng_typ = "stk_mng_typ";
	/**
	 * Item name 品名.<p>
	 *
	 */
	public static final String $itm_nm = "itm_nm";
	/**
	 * Base unit name 基準単位名.<p>
	 *
	 */
	public static final String $unit_nm = "unit_nm";
	/**
	 * For active ingredient 有効成分対象.<p>
	 *
	 */
	public static final String $cont_fctr_flg = "cont_fctr_flg";
	/**
	 * Active ingredient (Order scheduled qty.) 有効成分(指図予定数量).<p>
	 *
	 */
	public static final String $cont_fctr_inst_qty = "cont_fctr_inst_qty";
	/**
	 * Active ingredient (Output scheduled qty.) 有効成分(出来高予定数量).<p>
	 *
	 */
	public static final String $cont_fctr_schd_yield = "cont_fctr_schd_yield";
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
	 * Standard coefficient 標準係数.<p>
	 *
	 */
	public static final String $std_cont_fctr = "std_cont_fctr";
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
	 * Storage factory/distribution warehouse cd. 格納先工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public static final String $strg_site_cd = "strg_site_cd";
	/**
	 * Storage factory/distribution warehouse name 格納先工場・物流倉庫名.<p>
	 *
	 */
	public static final String $strg_site_nm = "strg_site_nm";
	/**
	 * Storage location group cd. 格納場所グループＣＤ.<p>
	 *
	 */
	public static final String $strg_loc_grp_cd = "strg_loc_grp_cd";
	/**
	 * Storage location group name 格納場所グループ名.<p>
	 *
	 */
	public static final String $strg_loc_grp_nm = "strg_loc_grp_nm";
	/**
	 * Storage location distribution group name 格納場所物流グループ名.<p>
	 *
	 */
	public static final String $strg_lg_grp_nm = "strg_lg_grp_nm";
	/**
	 * Storage location gross allocation location group cd. 格納場所総量引当場所グループＣＤ.<p>
	 *
	 */
	public static final String $strg_alloc_grp_cd = "strg_alloc_grp_cd";
	/**
	 * Storage location gross allocation location group name 格納場所総量引当場所グループ名.<p>
	 *
	 */
	public static final String $strg_alloc_grp_nm = "strg_alloc_grp_nm";
	/**
	 * Storage location name 格納場所名.<p>
	 *
	 */
	public static final String $strg_loc_nm = "strg_loc_nm";
	/**
	 * Mfg. factory/distribution warehouse cd. 製造場所工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public static final String $mfg_site_cd = "mfg_site_cd";
	/**
	 * Mfg. factory/distribution warehouse name 製造場所工場・物流倉庫名.<p>
	 *
	 */
	public static final String $mfg_site_nm = "mfg_site_nm";
	/**
	 * Mfg. location group cd. 製造場所グループＣＤ.<p>
	 *
	 */
	public static final String $mfg_loc_grp_cd = "mfg_loc_grp_cd";
	/**
	 * Mfg. location group name 製造場所グループ名.<p>
	 *
	 */
	public static final String $mfg_loc_grp_nm = "mfg_loc_grp_nm";
	/**
	 * Mfg. location name 製造場所名.<p>
	 *
	 */
	public static final String $mfg_loc_nm = "mfg_loc_nm";
	/**
	 * Supplier name 発注先名.<p>
	 *
	 */
	public static final String $sppl_nm = "sppl_nm";
	/**
	 * Maker name メーカ名.<p>
	 *
	 */
	public static final String $maker_nm = "maker_nm";
	/**
	 * Factory/Distribution warehouse cd. (Requested) 依頼先工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public static final String $rqst_site_cd = "rqst_site_cd";
	/**
	 * Factory/Distribution warehouse name (Requested) 依頼先工場・物流倉庫名.<p>
	 *
	 */
	public static final String $rqst_site_nm = "rqst_site_nm";
	/**
	 * Requested location group cd. 依頼先場所グループＣＤ.<p>
	 *
	 */
	public static final String $rqst_loc_grp_cd = "rqst_loc_grp_cd";
	/**
	 * Requested location group name 依頼先場所グループ名.<p>
	 *
	 */
	public static final String $rqst_loc_grp_nm = "rqst_loc_grp_nm";
	/**
	 * Location name (Requested) 依頼先場所名.<p>
	 *
	 */
	public static final String $rqst_loc_nm = "rqst_loc_nm";
	/**
	 * Requested WG name 依頼先ワーキンググループ名.<p>
	 *
	 */
	public static final String $rqst_wg_nm = "rqst_wg_nm";
	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public static final String $wg_nm = "wg_nm";
	/**
	 * Operation order status type 工程オーダ状況区分.<p>
	 *
	 */
	public static final String $oper_ord_sts_typ = "oper_ord_sts_typ";
	/**
	 * Unplanned subcontracting order 計画外外注発注.<p>
	 *
	 */
	public static final String $uplnd_outsrc_flg = "uplnd_outsrc_flg";
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
	/**
	 * Scheduler frozen スケジューラ凍結.<p>
	 *
	 */
	public static final String $scheduler_frozen_flg = "scheduler_frozen_flg";

	public static final String $itm_ord_no = $ord + ".itm_ord_no";
	public static final String $itm_ord_typ = $ord + ".itm_ord_typ";
	public static final String $ord_gnrt_typ = $ord + ".ord_gnrt_typ";
	public static final String $itm_cd = $ord + ".itm_cd";
	public static final String $itm_sub1 = $ord + ".itm_sub1";
	public static final String $itm_sub2 = $ord + ".itm_sub2";
	public static final String $itm_sub3 = $ord + ".itm_sub3";
	public static final String $ver_no = $ord + ".ver_no";
	public static final String $strg_loc_cd = $ord + ".strg_loc_cd";
	public static final String $mfg_loc_cd = $ord + ".mfg_loc_cd";
	public static final String $mst_mfg_loc_cd = $ord + ".mst_mfg_loc_cd";
	public static final String $sppl_cd = $ord + ".sppl_cd";
	public static final String $maker_cd = $ord + ".maker_cd";
	public static final String $rqst_loc_cd = $ord + ".rqst_loc_cd";
	public static final String $rqst_wg_cd = $ord + ".rqst_wg_cd";
	public static final String $bom_ptn = $ord + ".bom_ptn";
	public static final String $oper_ptn = $ord + ".oper_ptn";
	public static final String $inst_qty = $ord + ".inst_qty";
	public static final String $yield_schd_qty = $ord + ".yield_schd_qty";
	public static final String $nmr_qty = $ord + ".nmr_qty";
	public static final String $dnm_qty = $ord + ".dnm_qty";
	public static final String $fxd_yield_qty = $ord + ".fxd_yield_qty";
	public static final String $itm_ord_sts_typ = $ord + ".itm_ord_sts_typ";
	public static final String $fix_dt = $ord + ".fix_dt";
	public static final String $po_schd_dt = $ord + ".po_schd_dt";
	public static final String $mrp_po_schd_dt = $ord + ".mrp_po_schd_dt";
	public static final String $mrp_purc_lt = $ord + ".mrp_purc_lt";
	public static final String $purc_lt = $ord + ".purc_lt";
	public static final String $mfg_st_schd_dt = $ord + ".mfg_st_schd_dt";
	public static final String $mrp_mfg_st_schd_dt = $ord + ".mrp_mfg_st_schd_dt";
	public static final String $mfg_end_schd_dt = $ord + ".mfg_end_schd_dt";
	public static final String $mrp_mfg_end_schd_dt = $ord + ".mrp_mfg_end_schd_dt";
	public static final String $mrp_mfg_lt = $ord + ".mrp_mfg_lt";
	public static final String $mfg_lt = $ord + ".mfg_lt";
	public static final String $gi_schd_dt = $ord + ".gi_schd_dt";
	public static final String $mrp_gi_schd_dt = $ord + ".mrp_gi_schd_dt";
	public static final String $strg_schd_dt = $ord + ".strg_schd_dt";
	public static final String $mrp_strg_schd_dt = $ord + ".mrp_strg_schd_dt";
	public static final String $xfr_lt = $ord + ".xfr_lt";
	public static final String $accpt_schd_dt = $ord + ".accpt_schd_dt";
	public static final String $mrp_accpt_schd_dt = $ord + ".mrp_accpt_schd_dt";
	public static final String $accpt_insp_lt = $ord + ".accpt_insp_lt";
	public static final String $insp_st_schd_dt = $ord + ".insp_st_schd_dt";
	public static final String $mrp_insp_st_schd_dt = $ord + ".mrp_insp_st_schd_dt";
	public static final String $insp_end_schd_dt = $ord + ".insp_end_schd_dt";
	public static final String $mrp_insp_end_schd_dt = $ord + ".mrp_insp_end_schd_dt";
	public static final String $insp_lt = $ord + ".insp_lt";
	public static final String $insp_offst = $ord + ".insp_offst";
	public static final String $avl_schd_dt = $ord + ".avl_schd_dt";
	public static final String $mrp_avl_schd_dt = $ord + ".mrp_avl_schd_dt";
	public static final String $master_dt = $ord + ".master_dt";
	public static final String $sno1 = $ord + ".sno1";
	public static final String $sno_typ1 = $ord + ".sno_typ1";
	public static final String $sno2 = $ord + ".sno2";
	public static final String $sno_typ2 = $ord + ".sno_typ2";
	public static final String $sno3 = $ord + ".sno3";
	public static final String $sno_typ3 = $ord + ".sno_typ3";
	public static final String $sno4 = $ord + ".sno4";
	public static final String $sno_typ4 = $ord + ".sno_typ4";
	public static final String $lmt_dt = $ord + ".lmt_dt";
	public static final String $wg_cd = $ord + ".wg_cd";
	public static final String $not_fix_flg = $ord + ".not_fix_flg";
	public static final String $ord_fix_pd = $ord + ".ord_fix_pd";
	public static final String $rqmt_no = $ord + ".rqmt_no";
	public static final String $inst_po_cnt_rmrks = $ord + ".inst_po_cnt_rmrks";
	public static final String $sim_mrp_no = $ord + ".sim_mrp_no";
	public static final String $io_schd_pr_no = $ord + ".io_schd_pr_no";
	public static final String $intr_rmrks = $ord + ".intr_rmrks";
	public static final String $sub_char1 = $ord + ".sub_char1";
	public static final String $sub_char2 = $ord + ".sub_char2";
	public static final String $sub_char3 = $ord + ".sub_char3";
	public static final String $inst_itm_ord_sts_typ = $ord + ".inst_itm_ord_sts_typ";
	public static final String $ord_rcv_flg = $ord + ".ord_rcv_flg";
	public static final String $ord_snd_flg = $ord + ".ord_snd_flg";
	public static final String $ext_sys_cd = $ord + ".ext_sys_cd";
	public static final String $ext_itm_ord_no = $ord + ".ext_itm_ord_no";
	public static final String $for_scheduler_frozen_flg = $ord + ".for_scheduler_frozen_flg";

	public static final MCMeta peg_no_META = createCommonMeta($peg_no, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta mrp_typ_META = createCommonMeta($mrp_typ, mcframe.commonMS.meta.MS_META.MRP_TYP);
	public static final MCMeta data_crud_typ_META = createCommonMeta($data_crud_typ, mcframe.commonMA.meta.MA_META.DATA_CRUD_TYP);
	public static final MCMeta a_itm_ord_sts_typ_META = createCommonMeta($a_itm_ord_sts_typ, mcframe.commonMS.meta.MS_META.ITM_ORD_STS_TYP);
	public static final MCMeta b_itm_ord_sts_typ_META = createCommonMeta($b_itm_ord_sts_typ, mcframe.commonMS.meta.MS_META.ITM_ORD_STS_TYP);
	public static final MCMeta ord_META = createInnerRowMeta($ord, mcframe.serverMS.dbc.MST_ITM_ORDER_R.class);
	public static final MCMeta is_src_mfg_inst_flg_META = createCommonMeta($is_src_mfg_inst_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta strg_lg_grp_cd_META = createCommonMeta($strg_lg_grp_cd, mcframe.commonMA.meta.MA_META.LG_GRP_CD);
	public static final MCMeta strg_sppl_cd_META = createCommonMeta($strg_sppl_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta mfg_sppl_cd_META = createCommonMeta($mfg_sppl_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta mfg_maker_cd_META = createCommonMeta($mfg_maker_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta rqst_to_lg_grp_cd_META = createCommonMeta($rqst_to_lg_grp_cd, mcframe.commonMA.meta.MA_META.LG_GRP_CD);
	public static final MCMeta unit_cd_META = createCommonMeta($unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta oper_ord_pr_flg_META = createCommonMeta($oper_ord_pr_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta io_schd_pr_flg_META = createCommonMeta($io_schd_pr_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta rqst_lg_grp_cd_META = createCommonMeta($rqst_lg_grp_cd, mcframe.commonMA.meta.MA_META.LG_GRP_CD);
	public static final MCMeta dec_place_META = createCommonMeta($dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta err_flg_META = createCommonMeta($err_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta chk_itm_cd_META = createCommonMeta($chk_itm_cd, mcframe.commonMA.meta.MA_META.ITM_CD);
	public static final MCMeta chk_wg_mfg_flg_META = createCommonMeta($chk_wg_mfg_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta chk_wg_lg_flg_META = createCommonMeta($chk_wg_lg_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta chk_strg_loc_wg_cd_META = createCommonMeta($chk_strg_loc_wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta chk_strg_loc_lg_grp_cd_META = createCommonMeta($chk_strg_loc_lg_grp_cd, mcframe.commonMA.meta.MA_META.LG_GRP_CD);
	public static final MCMeta chk_strg_loc_site_cd_META = createCommonMeta($chk_strg_loc_site_cd, mcframe.commonMA.meta.MA_META.SITE_CD);
	public static final MCMeta chk_mfg_loc_wg_cd_META = createCommonMeta($chk_mfg_loc_wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta chk_rqst_loc_wg_cd_META = createCommonMeta($chk_rqst_loc_wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta chk_rqst_loc_lg_grp_cd_META = createCommonMeta($chk_rqst_loc_lg_grp_cd, mcframe.commonMA.meta.MA_META.LG_GRP_CD);
	public static final MCMeta chk_itm_ver_flg_META = createCommonMeta($chk_itm_ver_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta chk_itm_insp_flg_META = createCommonMeta($chk_itm_insp_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta chk_valid_ver_no_flg_META = createCommonMeta($chk_valid_ver_no_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta chk_b_wg_cd_META = createCommonMeta($chk_b_wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta chk_b_itm_ord_sts_typ_META = createCommonMeta($chk_b_itm_ord_sts_typ, mcframe.commonMS.meta.MS_META.ITM_ORD_STS_TYP);
	public static final MCMeta chk_not_fix_flg_META = createCommonMeta($chk_not_fix_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta chk_itm_stop_flg_META = createCommonMeta($chk_itm_stop_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta chk_order_stop_dt_META = createCommonMeta($chk_order_stop_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta chk_sppl_stop_flg_META = createCommonMeta($chk_sppl_stop_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta chk_sppl_stop_dt_META = createCommonMeta($chk_sppl_stop_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta chk_mfg_sppl_stop_flg_META = createCommonMeta($chk_mfg_sppl_stop_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta chk_mfg_sppl_stop_dt_META = createCommonMeta($chk_mfg_sppl_stop_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta chk_itm_sno1_mng_typ_META = createCommonMeta($chk_itm_sno1_mng_typ, mcframe.commonMA.meta.MA_META.SNO_MNG_TYP);
	public static final MCMeta chk_itm_sno2_mng_typ_META = createCommonMeta($chk_itm_sno2_mng_typ, mcframe.commonMA.meta.MA_META.SNO_MNG_TYP);
	public static final MCMeta chk_itm_sno3_mng_typ_META = createCommonMeta($chk_itm_sno3_mng_typ, mcframe.commonMA.meta.MA_META.SNO_MNG_TYP);
	public static final MCMeta chk_itm_sno4_mng_typ_META = createCommonMeta($chk_itm_sno4_mng_typ, mcframe.commonMA.meta.MA_META.SNO_MNG_TYP);
	public static final MCMeta chk_sche_ord_flg_META = createCommonMeta($chk_sche_ord_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta chk_dft_oper_flg_META = createCommonMeta($chk_dft_oper_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta in_prmt_insp_flg_META = createCommonMeta($in_prmt_insp_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta lot_mng_typ_META = createCommonMeta($lot_mng_typ, mcframe.commonMA.meta.MA_META.LOT_MNG_TYP);
	public static final MCMeta sublot_mng_typ_META = createCommonMeta($sublot_mng_typ, mcframe.commonMA.meta.MA_META.SUBLOT_MNG_TYP);
	public static final MCMeta stk_mng_typ_META = createCommonMeta($stk_mng_typ, mcframe.commonMA.meta.MA_META.STK_MNG_TYP);
	public static final MCMeta itm_nm_META = createCommonMeta($itm_nm, mcframe.commonMA.meta.MA_META.ITM_NM);
	public static final MCMeta unit_nm_META = createCommonMeta($unit_nm, mcframe.commonMA.meta.MA_META.UNIT_NM);
	public static final MCMeta cont_fctr_flg_META = createCommonMeta($cont_fctr_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta cont_fctr_inst_qty_META = createCommonMeta($cont_fctr_inst_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta cont_fctr_schd_yield_META = createCommonMeta($cont_fctr_schd_yield, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta cont_fctr_unit_cd_META = createCommonMeta($cont_fctr_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta cont_fctr_unit_nm_META = createCommonMeta($cont_fctr_unit_nm, mcframe.commonMA.meta.MA_META.UNIT_NM);
	public static final MCMeta std_cont_fctr_META = createCommonMeta($std_cont_fctr, mcframe.commonMA.meta.MA_META.STD_CONT_FCTR);
	public static final MCMeta cont_fctr_rnd_typ_META = createCommonMeta($cont_fctr_rnd_typ, mcframe.commonMA.meta.MA_META.RND_TYP);
	public static final MCMeta cont_fctr_dec_place_META = createCommonMeta($cont_fctr_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta strg_site_cd_META = createCommonMeta($strg_site_cd, mcframe.commonMA.meta.MA_META.SITE_CD);
	public static final MCMeta strg_site_nm_META = createCommonMeta($strg_site_nm, mcframe.commonMA.meta.MA_META.SITE_NM);
	public static final MCMeta strg_loc_grp_cd_META = createCommonMeta($strg_loc_grp_cd, mcframe.commonMA.meta.MA_META.LOC_GRP_CD);
	public static final MCMeta strg_loc_grp_nm_META = createCommonMeta($strg_loc_grp_nm, mcframe.commonMA.meta.MA_META.LOC_GRP_NM);
	public static final MCMeta strg_lg_grp_nm_META = createCommonMeta($strg_lg_grp_nm, mcframe.commonMA.meta.MA_META.LG_GRP_NM);
	public static final MCMeta strg_alloc_grp_cd_META = createCommonMeta($strg_alloc_grp_cd, mcframe.commonMA.meta.MA_META.ALLOC_GRP_CD);
	public static final MCMeta strg_alloc_grp_nm_META = createCommonMeta($strg_alloc_grp_nm, mcframe.commonMA.meta.MA_META.ALLOC_GRP_NM);
	public static final MCMeta strg_loc_nm_META = createCommonMeta($strg_loc_nm, mcframe.commonMA.meta.MA_META.LOC_NM);
	public static final MCMeta mfg_site_cd_META = createCommonMeta($mfg_site_cd, mcframe.commonMA.meta.MA_META.SITE_CD);
	public static final MCMeta mfg_site_nm_META = createCommonMeta($mfg_site_nm, mcframe.commonMA.meta.MA_META.SITE_NM);
	public static final MCMeta mfg_loc_grp_cd_META = createCommonMeta($mfg_loc_grp_cd, mcframe.commonMA.meta.MA_META.LOC_GRP_CD);
	public static final MCMeta mfg_loc_grp_nm_META = createCommonMeta($mfg_loc_grp_nm, mcframe.commonMA.meta.MA_META.LOC_GRP_NM);
	public static final MCMeta mfg_loc_nm_META = createCommonMeta($mfg_loc_nm, mcframe.commonMA.meta.MA_META.LOC_NM);
	public static final MCMeta sppl_nm_META = createCommonMeta($sppl_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta maker_nm_META = createCommonMeta($maker_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta rqst_site_cd_META = createCommonMeta($rqst_site_cd, mcframe.commonMA.meta.MA_META.SITE_CD);
	public static final MCMeta rqst_site_nm_META = createCommonMeta($rqst_site_nm, mcframe.commonMA.meta.MA_META.SITE_NM);
	public static final MCMeta rqst_loc_grp_cd_META = createCommonMeta($rqst_loc_grp_cd, mcframe.commonMA.meta.MA_META.LOC_GRP_CD);
	public static final MCMeta rqst_loc_grp_nm_META = createCommonMeta($rqst_loc_grp_nm, mcframe.commonMA.meta.MA_META.LOC_GRP_NM);
	public static final MCMeta rqst_loc_nm_META = createCommonMeta($rqst_loc_nm, mcframe.commonMA.meta.MA_META.LOC_NM);
	public static final MCMeta rqst_wg_nm_META = createCommonMeta($rqst_wg_nm, mcframe.commonMA.meta.MA_META.WG_NM);
	public static final MCMeta wg_nm_META = createCommonMeta($wg_nm, mcframe.commonMA.meta.MA_META.WG_NM);
	public static final MCMeta oper_ord_sts_typ_META = createCommonMeta($oper_ord_sts_typ, mcframe.commonMS.meta.MS_META.OPER_ORD_STS_TYP);
	public static final MCMeta uplnd_outsrc_flg_META = createCommonMeta($uplnd_outsrc_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta wrk_no_META = createCommonMeta($wrk_no, mcframe.commonMA.meta.MA_META.WRK_NO);
	public static final MCMeta wrk_nm_META = createCommonMeta($wrk_nm, mcframe.commonMA.meta.MA_META.WRK_NM);
	public static final MCMeta itm_typ_META = createCommonMeta($itm_typ, mcframe.commonMA.meta.MA_META.ITM_TYP);
	public static final MCMeta itm_typ_nm_META = createCommonMeta($itm_typ_nm, mcframe.commonMA.meta.MA_META.ITM_TYP_NM);
	public static final MCMeta itm_typ_d_cd_META = createCommonMeta($itm_typ_d_cd, mcframe.commonMA.meta.MA_META.ITM_TYP_D_CD);
	public static final MCMeta itm_typ_d_nm_META = createCommonMeta($itm_typ_d_nm, mcframe.commonMA.meta.MA_META.ITM_TYP_D_NM);
	public static final MCMeta scheduler_frozen_flg_META = createCommonMeta($scheduler_frozen_flg, mcframe.commonMA.meta.MA_META.FLG);

	protected static final ConstMetaList<Ord_Upd01_Dtl1R> constMetas = new ConstMetaList<Ord_Upd01_Dtl1R>(
		MCConstRow.constMetas,
		new MCMeta[]{
			peg_no_META,
			mrp_typ_META,
			data_crud_typ_META,
			a_itm_ord_sts_typ_META,
			b_itm_ord_sts_typ_META,
			ord_META,
			is_src_mfg_inst_flg_META,
			strg_lg_grp_cd_META,
			strg_sppl_cd_META,
			mfg_sppl_cd_META,
			mfg_maker_cd_META,
			rqst_to_lg_grp_cd_META,
			unit_cd_META,
			oper_ord_pr_flg_META,
			io_schd_pr_flg_META,
			rqst_lg_grp_cd_META,
			dec_place_META,
			err_flg_META,
			chk_itm_cd_META,
			chk_wg_mfg_flg_META,
			chk_wg_lg_flg_META,
			chk_strg_loc_wg_cd_META,
			chk_strg_loc_lg_grp_cd_META,
			chk_strg_loc_site_cd_META,
			chk_mfg_loc_wg_cd_META,
			chk_rqst_loc_wg_cd_META,
			chk_rqst_loc_lg_grp_cd_META,
			chk_itm_ver_flg_META,
			chk_itm_insp_flg_META,
			chk_valid_ver_no_flg_META,
			chk_b_wg_cd_META,
			chk_b_itm_ord_sts_typ_META,
			chk_not_fix_flg_META,
			chk_itm_stop_flg_META,
			chk_order_stop_dt_META,
			chk_sppl_stop_flg_META,
			chk_sppl_stop_dt_META,
			chk_mfg_sppl_stop_flg_META,
			chk_mfg_sppl_stop_dt_META,
			chk_itm_sno1_mng_typ_META,
			chk_itm_sno2_mng_typ_META,
			chk_itm_sno3_mng_typ_META,
			chk_itm_sno4_mng_typ_META,
			chk_sche_ord_flg_META,
			chk_dft_oper_flg_META,
			in_prmt_insp_flg_META,
			lot_mng_typ_META,
			sublot_mng_typ_META,
			stk_mng_typ_META,
			itm_nm_META,
			unit_nm_META,
			cont_fctr_flg_META,
			cont_fctr_inst_qty_META,
			cont_fctr_schd_yield_META,
			cont_fctr_unit_cd_META,
			cont_fctr_unit_nm_META,
			std_cont_fctr_META,
			cont_fctr_rnd_typ_META,
			cont_fctr_dec_place_META,
			strg_site_cd_META,
			strg_site_nm_META,
			strg_loc_grp_cd_META,
			strg_loc_grp_nm_META,
			strg_lg_grp_nm_META,
			strg_alloc_grp_cd_META,
			strg_alloc_grp_nm_META,
			strg_loc_nm_META,
			mfg_site_cd_META,
			mfg_site_nm_META,
			mfg_loc_grp_cd_META,
			mfg_loc_grp_nm_META,
			mfg_loc_nm_META,
			sppl_nm_META,
			maker_nm_META,
			rqst_site_cd_META,
			rqst_site_nm_META,
			rqst_loc_grp_cd_META,
			rqst_loc_grp_nm_META,
			rqst_loc_nm_META,
			rqst_wg_nm_META,
			wg_nm_META,
			oper_ord_sts_typ_META,
			uplnd_outsrc_flg_META,
			wrk_no_META,
			wrk_nm_META,
			itm_typ_META,
			itm_typ_nm_META,
			itm_typ_d_cd_META,
			itm_typ_d_nm_META,
			scheduler_frozen_flg_META
		},
		new String[][]{
			{
				"itm_ord_no",
				"itm_ord_typ",
				"ord_gnrt_typ",
				"itm_cd",
				"itm_sub1",
				"itm_sub2",
				"itm_sub3",
				"ver_no",
				"strg_loc_cd",
				"mfg_loc_cd",
				"mst_mfg_loc_cd",
				"sppl_cd",
				"maker_cd",
				"rqst_loc_cd",
				"rqst_wg_cd",
				"bom_ptn",
				"oper_ptn",
				"inst_qty",
				"yield_schd_qty",
				"nmr_qty",
				"dnm_qty",
				"fxd_yield_qty",
				"itm_ord_sts_typ",
				"fix_dt",
				"po_schd_dt",
				"mrp_po_schd_dt",
				"mrp_purc_lt",
				"purc_lt",
				"mfg_st_schd_dt",
				"mrp_mfg_st_schd_dt",
				"mfg_end_schd_dt",
				"mrp_mfg_end_schd_dt",
				"mrp_mfg_lt",
				"mfg_lt",
				"gi_schd_dt",
				"mrp_gi_schd_dt",
				"strg_schd_dt",
				"mrp_strg_schd_dt",
				"xfr_lt",
				"accpt_schd_dt",
				"mrp_accpt_schd_dt",
				"accpt_insp_lt",
				"insp_st_schd_dt",
				"mrp_insp_st_schd_dt",
				"insp_end_schd_dt",
				"mrp_insp_end_schd_dt",
				"insp_lt",
				"insp_offst",
				"avl_schd_dt",
				"mrp_avl_schd_dt",
				"master_dt",
				"sno1",
				"sno_typ1",
				"sno2",
				"sno_typ2",
				"sno3",
				"sno_typ3",
				"sno4",
				"sno_typ4",
				"lmt_dt",
				"wg_cd",
				"not_fix_flg",
				"ord_fix_pd",
				"rqmt_no",
				"inst_po_cnt_rmrks",
				"sim_mrp_no",
				"io_schd_pr_no",
				"intr_rmrks",
				"sub_char1",
				"sub_char2",
				"sub_char3",
				"inst_itm_ord_sts_typ",
				"ord_rcv_flg",
				"ord_snd_flg",
				"ext_sys_cd",
				"ext_itm_ord_no",
				"for_scheduler_frozen_flg"
			},
			{
				$itm_ord_no,
				$itm_ord_typ,
				$ord_gnrt_typ,
				$itm_cd,
				$itm_sub1,
				$itm_sub2,
				$itm_sub3,
				$ver_no,
				$strg_loc_cd,
				$mfg_loc_cd,
				$mst_mfg_loc_cd,
				$sppl_cd,
				$maker_cd,
				$rqst_loc_cd,
				$rqst_wg_cd,
				$bom_ptn,
				$oper_ptn,
				$inst_qty,
				$yield_schd_qty,
				$nmr_qty,
				$dnm_qty,
				$fxd_yield_qty,
				$itm_ord_sts_typ,
				$fix_dt,
				$po_schd_dt,
				$mrp_po_schd_dt,
				$mrp_purc_lt,
				$purc_lt,
				$mfg_st_schd_dt,
				$mrp_mfg_st_schd_dt,
				$mfg_end_schd_dt,
				$mrp_mfg_end_schd_dt,
				$mrp_mfg_lt,
				$mfg_lt,
				$gi_schd_dt,
				$mrp_gi_schd_dt,
				$strg_schd_dt,
				$mrp_strg_schd_dt,
				$xfr_lt,
				$accpt_schd_dt,
				$mrp_accpt_schd_dt,
				$accpt_insp_lt,
				$insp_st_schd_dt,
				$mrp_insp_st_schd_dt,
				$insp_end_schd_dt,
				$mrp_insp_end_schd_dt,
				$insp_lt,
				$insp_offst,
				$avl_schd_dt,
				$mrp_avl_schd_dt,
				$master_dt,
				$sno1,
				$sno_typ1,
				$sno2,
				$sno_typ2,
				$sno3,
				$sno_typ3,
				$sno4,
				$sno_typ4,
				$lmt_dt,
				$wg_cd,
				$not_fix_flg,
				$ord_fix_pd,
				$rqmt_no,
				$inst_po_cnt_rmrks,
				$sim_mrp_no,
				$io_schd_pr_no,
				$intr_rmrks,
				$sub_char1,
				$sub_char2,
				$sub_char3,
				$inst_itm_ord_sts_typ,
				$ord_rcv_flg,
				$ord_snd_flg,
				$ext_sys_cd,
				$ext_itm_ord_no,
				$for_scheduler_frozen_flg
			}
		}
	);

	/** 項目属性情報のグループ[NULL_VAL]のキー定数 */
	public static final String $$NULL_VAL = "NULL_VAL";
	/** 項目属性情報のグループ[CHK_NUM]のキー定数 */
	public static final String $$CHK_NUM = "CHK_NUM";
	/** 項目属性情報のグループ[LIST_LOGIC]のキー定数 */
	public static final String $$LIST_LOGIC = "LIST_LOGIC";
	/** 項目属性情報のグループ[LIST_IN]のキー定数 */
	public static final String $$LIST_IN = "LIST_IN";
	/** 項目属性情報のグループ[LIST_IN_BASE]のキー定数 */
	public static final String $$LIST_IN_BASE = "LIST_IN_BASE";

	/**
	 * グループ毎に定義される項目属性情報です。
	 */
	protected static final MCExtMap EXTMAP = new MCExtMap(
		null,
		new MCExtMap.Entry($$NULL_VAL, new MCExtList(
			new String[][]{
				{$ord + ".strg_loc_cd", "E"},	// ord.strg_loc_cd
				{$ord + ".mfg_loc_cd", "E"},	// ord.mfg_loc_cd
				{$ord + ".mst_mfg_loc_cd", "E"},	// ord.mst_mfg_loc_cd
				{$ord + ".sppl_cd", "E"},	// ord.sppl_cd
				{$ord + ".maker_cd", "E"},	// ord.maker_cd
				{$ord + ".rqst_loc_cd", "E"},	// ord.rqst_loc_cd
				{$ord + ".sno1", "E"},	// ord.sno1
				{$ord + ".sno2", "E"},	// ord.sno2
				{$ord + ".sno3", "E"},	// ord.sno3
				{$ord + ".sno4", "E"},	// ord.sno4
				{$strg_sppl_cd, "E"}	// strg_sppl_cd
			}
		)),
		new MCExtMap.Entry($$CHK_NUM, new MCExtList(
			new String[][]{
				{$ord + ".inst_qty", "positive"},	// ord.inst_qty
				{$ord + ".yield_schd_qty", "positive"}	// ord.yield_schd_qty
			}
		)),
		new MCExtMap.Entry($$LIST_LOGIC, new MCExtList(
			new String[][]{
				{$ord + ".oper_ptn", "MA.MAUAL0010.ItmOper"}	// ord.oper_ptn
			}
		)),
		new MCExtMap.Entry($$LIST_IN, new MCExtList(
			new String[][]{
				{$ord + ".oper_ptn", "itm_cd;itm_sub1;itm_sub2;itm_sub3;mfg_loc_cd;master_dt;true"}	// ord.oper_ptn
			}
		)),
		new MCExtMap.Entry($$LIST_IN_BASE, new MCExtList(
			new String[][]{
				{$ord + ".oper_ptn", "itm_cd;itm_sub1;itm_sub2;itm_sub3;loc_cd;dt;mode_nullval_flg"}	// ord.oper_ptn
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
	protected Ord_Upd01_Dtl1R_MC_A(ConstMetaList<? extends Ord_Upd01_Dtl1R> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Ord_Upd01_Dtl1R clone() {
		return (Ord_Upd01_Dtl1R) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Ord_Upd01_Dtl1R createInstance() {
		return (Ord_Upd01_Dtl1R) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Ord_Upd01_Dtl1R getValues(String... names) {
		return (Ord_Upd01_Dtl1R) super.getValues(names);
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
	 * MRP type ＭＲＰタイプ.<p>
	 *
	 */
	public String mrp_typ() {
		return getConstString(offset + 1, $mrp_typ);
	}

	/**
	 * MRP type ＭＲＰタイプ.<p>
	 *
	 */
	public void mrp_typ(String value) {
		setConstString(offset + 1, $mrp_typ, value);
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
	 * Order status type after update 更新後オーダ状況区分.<p>
	 *
	 */
	public String a_itm_ord_sts_typ() {
		return getConstString(offset + 3, $a_itm_ord_sts_typ);
	}

	/**
	 * Order status type after update 更新後オーダ状況区分.<p>
	 *
	 */
	public void a_itm_ord_sts_typ(String value) {
		setConstString(offset + 3, $a_itm_ord_sts_typ, value);
	}


	/**
	 * Order status type before update 更新前オーダ状況区分.<p>
	 *
	 */
	public String b_itm_ord_sts_typ() {
		return getConstString(offset + 4, $b_itm_ord_sts_typ);
	}

	/**
	 * Order status type before update 更新前オーダ状況区分.<p>
	 *
	 */
	public void b_itm_ord_sts_typ(String value) {
		setConstString(offset + 4, $b_itm_ord_sts_typ, value);
	}


	public mcframe.serverMS.dbc.MST_ITM_ORDER_R ord(){
		return (mcframe.serverMS.dbc.MST_ITM_ORDER_R) getConstInnerRow(offset + 5, $ord);
	}
	
	public void ord(mcframe.serverMS.dbc.MST_ITM_ORDER_R row){
		setConstInnerRow(offset + 5, $ord, row);
	}


	/**
	 * Caller mfg. order flg. 呼出元製造指図ＦＬＧ.<p>
	 *
	 */
	public boolean is_src_mfg_inst_flg() {
		return getConstBoolean(offset + 6, $is_src_mfg_inst_flg);
	}

	/**
	 * Caller mfg. order flg. 呼出元製造指図ＦＬＧ.<p>
	 *
	 */
	public void is_src_mfg_inst_flg(boolean value) {
		setConstBoolean(offset + 6, $is_src_mfg_inst_flg, value);
	}


	/**
	 * Storage location distribution group cd. 格納場所物流グループＣＤ.<p>
	 *
	 */
	public String strg_lg_grp_cd() {
		return getConstString(offset + 7, $strg_lg_grp_cd);
	}

	/**
	 * Storage location distribution group cd. 格納場所物流グループＣＤ.<p>
	 *
	 */
	public void strg_lg_grp_cd(String value) {
		setConstString(offset + 7, $strg_lg_grp_cd, value);
	}


	/**
	 * Storage location supplier cd. 格納場所発注先ＣＤ.<p>
	 *
	 */
	public String strg_sppl_cd() {
		return getConstString(offset + 8, $strg_sppl_cd);
	}

	/**
	 * Storage location supplier cd. 格納場所発注先ＣＤ.<p>
	 *
	 */
	public void strg_sppl_cd(String value) {
		setConstString(offset + 8, $strg_sppl_cd, value);
	}


	/**
	 * Subcontractor cd. 外注発注先ＣＤ.<p>
	 *
	 */
	public String mfg_sppl_cd() {
		return getConstString(offset + 9, $mfg_sppl_cd);
	}

	/**
	 * Subcontractor cd. 外注発注先ＣＤ.<p>
	 *
	 */
	public void mfg_sppl_cd(String value) {
		setConstString(offset + 9, $mfg_sppl_cd, value);
	}


	/**
	 * Subcontracting maker cd. 外注メーカＣＤ.<p>
	 *
	 */
	public String mfg_maker_cd() {
		return getConstString(offset + 10, $mfg_maker_cd);
	}

	/**
	 * Subcontracting maker cd. 外注メーカＣＤ.<p>
	 *
	 */
	public void mfg_maker_cd(String value) {
		setConstString(offset + 10, $mfg_maker_cd, value);
	}


	/**
	 * Requested location distribution group cd. 依頼先場所物流グループＣＤ.<p>
	 *
	 */
	public String rqst_to_lg_grp_cd() {
		return getConstString(offset + 11, $rqst_to_lg_grp_cd);
	}

	/**
	 * Requested location distribution group cd. 依頼先場所物流グループＣＤ.<p>
	 *
	 */
	public void rqst_to_lg_grp_cd(String value) {
		setConstString(offset + 11, $rqst_to_lg_grp_cd, value);
	}


	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public String unit_cd() {
		return getConstString(offset + 12, $unit_cd);
	}

	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public void unit_cd(String value) {
		setConstString(offset + 12, $unit_cd, value);
	}


	/**
	 * Operation order generation 工程オーダ生成.<p>
	 *
	 */
	public boolean oper_ord_pr_flg() {
		return getConstBoolean(offset + 13, $oper_ord_pr_flg);
	}

	/**
	 * Operation order generation 工程オーダ生成.<p>
	 *
	 */
	public void oper_ord_pr_flg(boolean value) {
		setConstBoolean(offset + 13, $oper_ord_pr_flg, value);
	}


	/**
	 * Generate GR/GI schedule 受払予定生成.<p>
	 *
	 */
	public boolean io_schd_pr_flg() {
		return getConstBoolean(offset + 14, $io_schd_pr_flg);
	}

	/**
	 * Generate GR/GI schedule 受払予定生成.<p>
	 *
	 */
	public void io_schd_pr_flg(boolean value) {
		setConstBoolean(offset + 14, $io_schd_pr_flg, value);
	}


	/**
	 * Requested location distribution group cd. 依頼先場所物流グループＣＤ.<p>
	 *
	 */
	public String rqst_lg_grp_cd() {
		return getConstString(offset + 15, $rqst_lg_grp_cd);
	}

	/**
	 * Requested location distribution group cd. 依頼先場所物流グループＣＤ.<p>
	 *
	 */
	public void rqst_lg_grp_cd(String value) {
		setConstString(offset + 15, $rqst_lg_grp_cd, value);
	}


	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public MCNumber dec_place() {
		return getConstNumber(offset + 16, $dec_place);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void dec_place(MCNumber value) {
		setConstNumber(offset + 16, $dec_place, value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void dec_place(int value) {
		setConstNumber(offset + 16, $dec_place, value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void dec_place(long value) {
		setConstNumber(offset + 16, $dec_place, value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void dec_place(float value) {
		setConstNumber(offset + 16, $dec_place, value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void dec_place(double value) {
		setConstNumber(offset + 16, $dec_place, value);
	}


	/**
	 * Error エラー.<p>
	 *
	 */
	public boolean err_flg() {
		return getConstBoolean(offset + 17, $err_flg);
	}

	/**
	 * Error エラー.<p>
	 *
	 */
	public void err_flg(boolean value) {
		setConstBoolean(offset + 17, $err_flg, value);
	}


	/**
	 * Item details item cd. 品目詳細品目ＣＤ.<p>
	 *
	 */
	public String chk_itm_cd() {
		return getConstString(offset + 18, $chk_itm_cd);
	}

	/**
	 * Item details item cd. 品目詳細品目ＣＤ.<p>
	 *
	 */
	public void chk_itm_cd(String value) {
		setConstString(offset + 18, $chk_itm_cd, value);
	}


	/**
	 * WG mfg. ＷＧ製造.<p>
	 *
	 */
	public boolean chk_wg_mfg_flg() {
		return getConstBoolean(offset + 19, $chk_wg_mfg_flg);
	}

	/**
	 * WG mfg. ＷＧ製造.<p>
	 *
	 */
	public void chk_wg_mfg_flg(boolean value) {
		setConstBoolean(offset + 19, $chk_wg_mfg_flg, value);
	}


	/**
	 * WG Distribution ＷＧ物流.<p>
	 *
	 */
	public boolean chk_wg_lg_flg() {
		return getConstBoolean(offset + 20, $chk_wg_lg_flg);
	}

	/**
	 * WG Distribution ＷＧ物流.<p>
	 *
	 */
	public void chk_wg_lg_flg(boolean value) {
		setConstBoolean(offset + 20, $chk_wg_lg_flg, value);
	}


	/**
	 * Storage location WG cd. 格納場所ＷＧＣＤ.<p>
	 *
	 */
	public String chk_strg_loc_wg_cd() {
		return getConstString(offset + 21, $chk_strg_loc_wg_cd);
	}

	/**
	 * Storage location WG cd. 格納場所ＷＧＣＤ.<p>
	 *
	 */
	public void chk_strg_loc_wg_cd(String value) {
		setConstString(offset + 21, $chk_strg_loc_wg_cd, value);
	}


	/**
	 * Storage location distribution group cd. 格納場所物流グループＣＤ.<p>
	 *
	 */
	public String chk_strg_loc_lg_grp_cd() {
		return getConstString(offset + 22, $chk_strg_loc_lg_grp_cd);
	}

	/**
	 * Storage location distribution group cd. 格納場所物流グループＣＤ.<p>
	 *
	 */
	public void chk_strg_loc_lg_grp_cd(String value) {
		setConstString(offset + 22, $chk_strg_loc_lg_grp_cd, value);
	}


	/**
	 * Storage location factory/distribution cd. 格納場所工場・物流ＣＤ.<p>
	 *
	 */
	public String chk_strg_loc_site_cd() {
		return getConstString(offset + 23, $chk_strg_loc_site_cd);
	}

	/**
	 * Storage location factory/distribution cd. 格納場所工場・物流ＣＤ.<p>
	 *
	 */
	public void chk_strg_loc_site_cd(String value) {
		setConstString(offset + 23, $chk_strg_loc_site_cd, value);
	}


	/**
	 * Mfg. location WG cd. 製造場所ワーキンググループＣＤ.<p>
	 *
	 */
	public String chk_mfg_loc_wg_cd() {
		return getConstString(offset + 24, $chk_mfg_loc_wg_cd);
	}

	/**
	 * Mfg. location WG cd. 製造場所ワーキンググループＣＤ.<p>
	 *
	 */
	public void chk_mfg_loc_wg_cd(String value) {
		setConstString(offset + 24, $chk_mfg_loc_wg_cd, value);
	}


	/**
	 * Requested location WG cd. 依頼先場所ワーキンググループＣＤ.<p>
	 *
	 */
	public String chk_rqst_loc_wg_cd() {
		return getConstString(offset + 25, $chk_rqst_loc_wg_cd);
	}

	/**
	 * Requested location WG cd. 依頼先場所ワーキンググループＣＤ.<p>
	 *
	 */
	public void chk_rqst_loc_wg_cd(String value) {
		setConstString(offset + 25, $chk_rqst_loc_wg_cd, value);
	}


	/**
	 * Requested location distribution group cd. 依頼先場所物流グループＣＤ.<p>
	 *
	 */
	public String chk_rqst_loc_lg_grp_cd() {
		return getConstString(offset + 26, $chk_rqst_loc_lg_grp_cd);
	}

	/**
	 * Requested location distribution group cd. 依頼先場所物流グループＣＤ.<p>
	 *
	 */
	public void chk_rqst_loc_lg_grp_cd(String value) {
		setConstString(offset + 26, $chk_rqst_loc_lg_grp_cd, value);
	}


	/**
	 * For item version control 品目版管理対象.<p>
	 *
	 */
	public boolean chk_itm_ver_flg() {
		return getConstBoolean(offset + 27, $chk_itm_ver_flg);
	}

	/**
	 * For item version control 品目版管理対象.<p>
	 *
	 */
	public void chk_itm_ver_flg(boolean value) {
		setConstBoolean(offset + 27, $chk_itm_ver_flg, value);
	}


	/**
	 * For inspection 検査対象.<p>
	 *
	 */
	public boolean chk_itm_insp_flg() {
		return getConstBoolean(offset + 28, $chk_itm_insp_flg);
	}

	/**
	 * For inspection 検査対象.<p>
	 *
	 */
	public void chk_itm_insp_flg(boolean value) {
		setConstBoolean(offset + 28, $chk_itm_insp_flg, value);
	}


	/**
	 * Effective version No. 有効版ＮＯ.<p>
	 *
	 */
	public boolean chk_valid_ver_no_flg() {
		return getConstBoolean(offset + 29, $chk_valid_ver_no_flg);
	}

	/**
	 * Effective version No. 有効版ＮＯ.<p>
	 *
	 */
	public void chk_valid_ver_no_flg(boolean value) {
		setConstBoolean(offset + 29, $chk_valid_ver_no_flg, value);
	}


	/**
	 * WG cd. before correction 訂正前ワーキンググループＣＤ.<p>
	 *
	 */
	public String chk_b_wg_cd() {
		return getConstString(offset + 30, $chk_b_wg_cd);
	}

	/**
	 * WG cd. before correction 訂正前ワーキンググループＣＤ.<p>
	 *
	 */
	public void chk_b_wg_cd(String value) {
		setConstString(offset + 30, $chk_b_wg_cd, value);
	}


	/**
	 * Order status type before correction 訂正前オーダ状況区分.<p>
	 *
	 */
	public String chk_b_itm_ord_sts_typ() {
		return getConstString(offset + 31, $chk_b_itm_ord_sts_typ);
	}

	/**
	 * Order status type before correction 訂正前オーダ状況区分.<p>
	 *
	 */
	public void chk_b_itm_ord_sts_typ(String value) {
		setConstString(offset + 31, $chk_b_itm_ord_sts_typ, value);
	}


	/**
	 * Item procurement disapproval master exist 手配不許可品目マスタ存在.<p>
	 *
	 */
	public boolean chk_not_fix_flg() {
		return getConstBoolean(offset + 32, $chk_not_fix_flg);
	}

	/**
	 * Item procurement disapproval master exist 手配不許可品目マスタ存在.<p>
	 *
	 */
	public void chk_not_fix_flg(boolean value) {
		setConstBoolean(offset + 32, $chk_not_fix_flg, value);
	}


	/**
	 * Item prohibit master exist 品目禁止マスタ存在.<p>
	 *
	 */
	public boolean chk_itm_stop_flg() {
		return getConstBoolean(offset + 33, $chk_itm_stop_flg);
	}

	/**
	 * Item prohibit master exist 品目禁止マスタ存在.<p>
	 *
	 */
	public void chk_itm_stop_flg(boolean value) {
		setConstBoolean(offset + 33, $chk_itm_stop_flg, value);
	}


	/**
	 * Order prohibited date オーダ禁止日.<p>
	 *
	 */
	public MCDate chk_order_stop_dt() {
		return getConstDate(offset + 34, $chk_order_stop_dt);
	}

	/**
	 * Order prohibited date オーダ禁止日.<p>
	 *
	 */
	public void chk_order_stop_dt(MCDate value) {
		setConstDate(offset + 34, $chk_order_stop_dt, value);
	}


	/**
	 * Supplier prohibited master exist 発注先禁止マスタ存在.<p>
	 *
	 */
	public boolean chk_sppl_stop_flg() {
		return getConstBoolean(offset + 35, $chk_sppl_stop_flg);
	}

	/**
	 * Supplier prohibited master exist 発注先禁止マスタ存在.<p>
	 *
	 */
	public void chk_sppl_stop_flg(boolean value) {
		setConstBoolean(offset + 35, $chk_sppl_stop_flg, value);
	}


	/**
	 * Supplier prohibited date 発注先禁止日.<p>
	 *
	 */
	public MCDate chk_sppl_stop_dt() {
		return getConstDate(offset + 36, $chk_sppl_stop_dt);
	}

	/**
	 * Supplier prohibited date 発注先禁止日.<p>
	 *
	 */
	public void chk_sppl_stop_dt(MCDate value) {
		setConstDate(offset + 36, $chk_sppl_stop_dt, value);
	}


	/**
	 * Mfg. location supplier prohibited master exist 製造場所発注先禁止マスタ存在.<p>
	 *
	 */
	public boolean chk_mfg_sppl_stop_flg() {
		return getConstBoolean(offset + 37, $chk_mfg_sppl_stop_flg);
	}

	/**
	 * Mfg. location supplier prohibited master exist 製造場所発注先禁止マスタ存在.<p>
	 *
	 */
	public void chk_mfg_sppl_stop_flg(boolean value) {
		setConstBoolean(offset + 37, $chk_mfg_sppl_stop_flg, value);
	}


	/**
	 * Mfg. location supplier prohibited date 製造場所発注先禁止日.<p>
	 *
	 */
	public MCDate chk_mfg_sppl_stop_dt() {
		return getConstDate(offset + 38, $chk_mfg_sppl_stop_dt);
	}

	/**
	 * Mfg. location supplier prohibited date 製造場所発注先禁止日.<p>
	 *
	 */
	public void chk_mfg_sppl_stop_dt(MCDate value) {
		setConstDate(offset + 38, $chk_mfg_sppl_stop_dt, value);
	}


	/**
	 * Item master SEIBAN No. 1 management type 品目マスタ手配ＮＯ１管理区分.<p>
	 *
	 */
	public String chk_itm_sno1_mng_typ() {
		return getConstString(offset + 39, $chk_itm_sno1_mng_typ);
	}

	/**
	 * Item master SEIBAN No. 1 management type 品目マスタ手配ＮＯ１管理区分.<p>
	 *
	 */
	public void chk_itm_sno1_mng_typ(String value) {
		setConstString(offset + 39, $chk_itm_sno1_mng_typ, value);
	}


	/**
	 * Item master SEIBAN No. 2 management type 品目マスタ手配ＮＯ２管理区分.<p>
	 *
	 */
	public String chk_itm_sno2_mng_typ() {
		return getConstString(offset + 40, $chk_itm_sno2_mng_typ);
	}

	/**
	 * Item master SEIBAN No. 2 management type 品目マスタ手配ＮＯ２管理区分.<p>
	 *
	 */
	public void chk_itm_sno2_mng_typ(String value) {
		setConstString(offset + 40, $chk_itm_sno2_mng_typ, value);
	}


	/**
	 * Item master SEIBAN No. 3 management type 品目マスタ手配ＮＯ３管理区分.<p>
	 *
	 */
	public String chk_itm_sno3_mng_typ() {
		return getConstString(offset + 41, $chk_itm_sno3_mng_typ);
	}

	/**
	 * Item master SEIBAN No. 3 management type 品目マスタ手配ＮＯ３管理区分.<p>
	 *
	 */
	public void chk_itm_sno3_mng_typ(String value) {
		setConstString(offset + 41, $chk_itm_sno3_mng_typ, value);
	}


	/**
	 * Item master SEIBAN No. 4 management type 品目マスタ手配ＮＯ４管理区分.<p>
	 *
	 */
	public String chk_itm_sno4_mng_typ() {
		return getConstString(offset + 42, $chk_itm_sno4_mng_typ);
	}

	/**
	 * Item master SEIBAN No. 4 management type 品目マスタ手配ＮＯ４管理区分.<p>
	 *
	 */
	public void chk_itm_sno4_mng_typ(String value) {
		setConstString(offset + 42, $chk_itm_sno4_mng_typ, value);
	}


	/**
	 * Scheduler exclusion スケジューラ排他.<p>
	 *
	 */
	public boolean chk_sche_ord_flg() {
		return getConstBoolean(offset + 43, $chk_sche_ord_flg);
	}

	/**
	 * Scheduler exclusion スケジューラ排他.<p>
	 *
	 */
	public void chk_sche_ord_flg(boolean value) {
		setConstBoolean(offset + 43, $chk_sche_ord_flg, value);
	}


	/**
	 * Default operation デフォルト工程.<p>
	 *
	 */
	public boolean chk_dft_oper_flg() {
		return getConstBoolean(offset + 44, $chk_dft_oper_flg);
	}

	/**
	 * Default operation デフォルト工程.<p>
	 *
	 */
	public void chk_dft_oper_flg(boolean value) {
		setConstBoolean(offset + 44, $chk_dft_oper_flg, value);
	}


	/**
	 * Allow inspecting lot use 検査中ロット使用許可.<p>
	 *
	 */
	public boolean in_prmt_insp_flg() {
		return getConstBoolean(offset + 45, $in_prmt_insp_flg);
	}

	/**
	 * Allow inspecting lot use 検査中ロット使用許可.<p>
	 *
	 */
	public void in_prmt_insp_flg(boolean value) {
		setConstBoolean(offset + 45, $in_prmt_insp_flg, value);
	}


	/**
	 * Lot management type ロット管理区分.<p>
	 *
	 */
	public String lot_mng_typ() {
		return getConstString(offset + 46, $lot_mng_typ);
	}

	/**
	 * Lot management type ロット管理区分.<p>
	 *
	 */
	public void lot_mng_typ(String value) {
		setConstString(offset + 46, $lot_mng_typ, value);
	}


	/**
	 * Sublot management type サブロット管理区分.<p>
	 *
	 */
	public String sublot_mng_typ() {
		return getConstString(offset + 47, $sublot_mng_typ);
	}

	/**
	 * Sublot management type サブロット管理区分.<p>
	 *
	 */
	public void sublot_mng_typ(String value) {
		setConstString(offset + 47, $sublot_mng_typ, value);
	}


	/**
	 * Inventory management type 在庫管理区分.<p>
	 *
	 */
	public String stk_mng_typ() {
		return getConstString(offset + 48, $stk_mng_typ);
	}

	/**
	 * Inventory management type 在庫管理区分.<p>
	 *
	 */
	public void stk_mng_typ(String value) {
		setConstString(offset + 48, $stk_mng_typ, value);
	}


	/**
	 * Item name 品名.<p>
	 *
	 */
	public String itm_nm() {
		return getConstString(offset + 49, $itm_nm);
	}

	/**
	 * Item name 品名.<p>
	 *
	 */
	public void itm_nm(String value) {
		setConstString(offset + 49, $itm_nm, value);
	}


	/**
	 * Base unit name 基準単位名.<p>
	 *
	 */
	public String unit_nm() {
		return getConstString(offset + 50, $unit_nm);
	}

	/**
	 * Base unit name 基準単位名.<p>
	 *
	 */
	public void unit_nm(String value) {
		setConstString(offset + 50, $unit_nm, value);
	}


	/**
	 * For active ingredient 有効成分対象.<p>
	 *
	 */
	public boolean cont_fctr_flg() {
		return getConstBoolean(offset + 51, $cont_fctr_flg);
	}

	/**
	 * For active ingredient 有効成分対象.<p>
	 *
	 */
	public void cont_fctr_flg(boolean value) {
		setConstBoolean(offset + 51, $cont_fctr_flg, value);
	}


	/**
	 * Active ingredient (Order scheduled qty.) 有効成分(指図予定数量).<p>
	 *
	 */
	public MCNumber cont_fctr_inst_qty() {
		return getConstNumber(offset + 52, $cont_fctr_inst_qty);
	}

	/**
	 * Active ingredient (Order scheduled qty.) 有効成分(指図予定数量).<p>
	 *
	 */
	public void cont_fctr_inst_qty(MCNumber value) {
		setConstNumber(offset + 52, $cont_fctr_inst_qty, value);
	}

	/**
	 * Active ingredient (Order scheduled qty.) 有効成分(指図予定数量).<p>
	 *
	 */
	public void cont_fctr_inst_qty(int value) {
		setConstNumber(offset + 52, $cont_fctr_inst_qty, value);
	}

	/**
	 * Active ingredient (Order scheduled qty.) 有効成分(指図予定数量).<p>
	 *
	 */
	public void cont_fctr_inst_qty(long value) {
		setConstNumber(offset + 52, $cont_fctr_inst_qty, value);
	}

	/**
	 * Active ingredient (Order scheduled qty.) 有効成分(指図予定数量).<p>
	 *
	 */
	public void cont_fctr_inst_qty(float value) {
		setConstNumber(offset + 52, $cont_fctr_inst_qty, value);
	}

	/**
	 * Active ingredient (Order scheduled qty.) 有効成分(指図予定数量).<p>
	 *
	 */
	public void cont_fctr_inst_qty(double value) {
		setConstNumber(offset + 52, $cont_fctr_inst_qty, value);
	}


	/**
	 * Active ingredient (Output scheduled qty.) 有効成分(出来高予定数量).<p>
	 *
	 */
	public MCNumber cont_fctr_schd_yield() {
		return getConstNumber(offset + 53, $cont_fctr_schd_yield);
	}

	/**
	 * Active ingredient (Output scheduled qty.) 有効成分(出来高予定数量).<p>
	 *
	 */
	public void cont_fctr_schd_yield(MCNumber value) {
		setConstNumber(offset + 53, $cont_fctr_schd_yield, value);
	}

	/**
	 * Active ingredient (Output scheduled qty.) 有効成分(出来高予定数量).<p>
	 *
	 */
	public void cont_fctr_schd_yield(int value) {
		setConstNumber(offset + 53, $cont_fctr_schd_yield, value);
	}

	/**
	 * Active ingredient (Output scheduled qty.) 有効成分(出来高予定数量).<p>
	 *
	 */
	public void cont_fctr_schd_yield(long value) {
		setConstNumber(offset + 53, $cont_fctr_schd_yield, value);
	}

	/**
	 * Active ingredient (Output scheduled qty.) 有効成分(出来高予定数量).<p>
	 *
	 */
	public void cont_fctr_schd_yield(float value) {
		setConstNumber(offset + 53, $cont_fctr_schd_yield, value);
	}

	/**
	 * Active ingredient (Output scheduled qty.) 有効成分(出来高予定数量).<p>
	 *
	 */
	public void cont_fctr_schd_yield(double value) {
		setConstNumber(offset + 53, $cont_fctr_schd_yield, value);
	}


	/**
	 * Active ingredient unit cd. 有効成分単位ＣＤ.<p>
	 *
	 */
	public String cont_fctr_unit_cd() {
		return getConstString(offset + 54, $cont_fctr_unit_cd);
	}

	/**
	 * Active ingredient unit cd. 有効成分単位ＣＤ.<p>
	 *
	 */
	public void cont_fctr_unit_cd(String value) {
		setConstString(offset + 54, $cont_fctr_unit_cd, value);
	}


	/**
	 * Active ingredient unit name 有効成分単位名.<p>
	 *
	 */
	public String cont_fctr_unit_nm() {
		return getConstString(offset + 55, $cont_fctr_unit_nm);
	}

	/**
	 * Active ingredient unit name 有効成分単位名.<p>
	 *
	 */
	public void cont_fctr_unit_nm(String value) {
		setConstString(offset + 55, $cont_fctr_unit_nm, value);
	}


	/**
	 * Standard coefficient 標準係数.<p>
	 *
	 */
	public MCNumber std_cont_fctr() {
		return getConstNumber(offset + 56, $std_cont_fctr);
	}

	/**
	 * Standard coefficient 標準係数.<p>
	 *
	 */
	public void std_cont_fctr(MCNumber value) {
		setConstNumber(offset + 56, $std_cont_fctr, value);
	}

	/**
	 * Standard coefficient 標準係数.<p>
	 *
	 */
	public void std_cont_fctr(int value) {
		setConstNumber(offset + 56, $std_cont_fctr, value);
	}

	/**
	 * Standard coefficient 標準係数.<p>
	 *
	 */
	public void std_cont_fctr(long value) {
		setConstNumber(offset + 56, $std_cont_fctr, value);
	}

	/**
	 * Standard coefficient 標準係数.<p>
	 *
	 */
	public void std_cont_fctr(float value) {
		setConstNumber(offset + 56, $std_cont_fctr, value);
	}

	/**
	 * Standard coefficient 標準係数.<p>
	 *
	 */
	public void std_cont_fctr(double value) {
		setConstNumber(offset + 56, $std_cont_fctr, value);
	}


	/**
	 * Rounding type (Active ingredient conversion) 有効成分換算端数処理区分.<p>
	 *
	 */
	public String cont_fctr_rnd_typ() {
		return getConstString(offset + 57, $cont_fctr_rnd_typ);
	}

	/**
	 * Rounding type (Active ingredient conversion) 有効成分換算端数処理区分.<p>
	 *
	 */
	public void cont_fctr_rnd_typ(String value) {
		setConstString(offset + 57, $cont_fctr_rnd_typ, value);
	}


	/**
	 * Active ingredient number of decimal places 有効成分小数部有効桁数.<p>
	 *
	 */
	public MCNumber cont_fctr_dec_place() {
		return getConstNumber(offset + 58, $cont_fctr_dec_place);
	}

	/**
	 * Active ingredient number of decimal places 有効成分小数部有効桁数.<p>
	 *
	 */
	public void cont_fctr_dec_place(MCNumber value) {
		setConstNumber(offset + 58, $cont_fctr_dec_place, value);
	}

	/**
	 * Active ingredient number of decimal places 有効成分小数部有効桁数.<p>
	 *
	 */
	public void cont_fctr_dec_place(int value) {
		setConstNumber(offset + 58, $cont_fctr_dec_place, value);
	}

	/**
	 * Active ingredient number of decimal places 有効成分小数部有効桁数.<p>
	 *
	 */
	public void cont_fctr_dec_place(long value) {
		setConstNumber(offset + 58, $cont_fctr_dec_place, value);
	}

	/**
	 * Active ingredient number of decimal places 有効成分小数部有効桁数.<p>
	 *
	 */
	public void cont_fctr_dec_place(float value) {
		setConstNumber(offset + 58, $cont_fctr_dec_place, value);
	}

	/**
	 * Active ingredient number of decimal places 有効成分小数部有効桁数.<p>
	 *
	 */
	public void cont_fctr_dec_place(double value) {
		setConstNumber(offset + 58, $cont_fctr_dec_place, value);
	}


	/**
	 * Storage factory/distribution warehouse cd. 格納先工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public String strg_site_cd() {
		return getConstString(offset + 59, $strg_site_cd);
	}

	/**
	 * Storage factory/distribution warehouse cd. 格納先工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public void strg_site_cd(String value) {
		setConstString(offset + 59, $strg_site_cd, value);
	}


	/**
	 * Storage factory/distribution warehouse name 格納先工場・物流倉庫名.<p>
	 *
	 */
	public String strg_site_nm() {
		return getConstString(offset + 60, $strg_site_nm);
	}

	/**
	 * Storage factory/distribution warehouse name 格納先工場・物流倉庫名.<p>
	 *
	 */
	public void strg_site_nm(String value) {
		setConstString(offset + 60, $strg_site_nm, value);
	}


	/**
	 * Storage location group cd. 格納場所グループＣＤ.<p>
	 *
	 */
	public String strg_loc_grp_cd() {
		return getConstString(offset + 61, $strg_loc_grp_cd);
	}

	/**
	 * Storage location group cd. 格納場所グループＣＤ.<p>
	 *
	 */
	public void strg_loc_grp_cd(String value) {
		setConstString(offset + 61, $strg_loc_grp_cd, value);
	}


	/**
	 * Storage location group name 格納場所グループ名.<p>
	 *
	 */
	public String strg_loc_grp_nm() {
		return getConstString(offset + 62, $strg_loc_grp_nm);
	}

	/**
	 * Storage location group name 格納場所グループ名.<p>
	 *
	 */
	public void strg_loc_grp_nm(String value) {
		setConstString(offset + 62, $strg_loc_grp_nm, value);
	}


	/**
	 * Storage location distribution group name 格納場所物流グループ名.<p>
	 *
	 */
	public String strg_lg_grp_nm() {
		return getConstString(offset + 63, $strg_lg_grp_nm);
	}

	/**
	 * Storage location distribution group name 格納場所物流グループ名.<p>
	 *
	 */
	public void strg_lg_grp_nm(String value) {
		setConstString(offset + 63, $strg_lg_grp_nm, value);
	}


	/**
	 * Storage location gross allocation location group cd. 格納場所総量引当場所グループＣＤ.<p>
	 *
	 */
	public String strg_alloc_grp_cd() {
		return getConstString(offset + 64, $strg_alloc_grp_cd);
	}

	/**
	 * Storage location gross allocation location group cd. 格納場所総量引当場所グループＣＤ.<p>
	 *
	 */
	public void strg_alloc_grp_cd(String value) {
		setConstString(offset + 64, $strg_alloc_grp_cd, value);
	}


	/**
	 * Storage location gross allocation location group name 格納場所総量引当場所グループ名.<p>
	 *
	 */
	public String strg_alloc_grp_nm() {
		return getConstString(offset + 65, $strg_alloc_grp_nm);
	}

	/**
	 * Storage location gross allocation location group name 格納場所総量引当場所グループ名.<p>
	 *
	 */
	public void strg_alloc_grp_nm(String value) {
		setConstString(offset + 65, $strg_alloc_grp_nm, value);
	}


	/**
	 * Storage location name 格納場所名.<p>
	 *
	 */
	public String strg_loc_nm() {
		return getConstString(offset + 66, $strg_loc_nm);
	}

	/**
	 * Storage location name 格納場所名.<p>
	 *
	 */
	public void strg_loc_nm(String value) {
		setConstString(offset + 66, $strg_loc_nm, value);
	}


	/**
	 * Mfg. factory/distribution warehouse cd. 製造場所工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public String mfg_site_cd() {
		return getConstString(offset + 67, $mfg_site_cd);
	}

	/**
	 * Mfg. factory/distribution warehouse cd. 製造場所工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public void mfg_site_cd(String value) {
		setConstString(offset + 67, $mfg_site_cd, value);
	}


	/**
	 * Mfg. factory/distribution warehouse name 製造場所工場・物流倉庫名.<p>
	 *
	 */
	public String mfg_site_nm() {
		return getConstString(offset + 68, $mfg_site_nm);
	}

	/**
	 * Mfg. factory/distribution warehouse name 製造場所工場・物流倉庫名.<p>
	 *
	 */
	public void mfg_site_nm(String value) {
		setConstString(offset + 68, $mfg_site_nm, value);
	}


	/**
	 * Mfg. location group cd. 製造場所グループＣＤ.<p>
	 *
	 */
	public String mfg_loc_grp_cd() {
		return getConstString(offset + 69, $mfg_loc_grp_cd);
	}

	/**
	 * Mfg. location group cd. 製造場所グループＣＤ.<p>
	 *
	 */
	public void mfg_loc_grp_cd(String value) {
		setConstString(offset + 69, $mfg_loc_grp_cd, value);
	}


	/**
	 * Mfg. location group name 製造場所グループ名.<p>
	 *
	 */
	public String mfg_loc_grp_nm() {
		return getConstString(offset + 70, $mfg_loc_grp_nm);
	}

	/**
	 * Mfg. location group name 製造場所グループ名.<p>
	 *
	 */
	public void mfg_loc_grp_nm(String value) {
		setConstString(offset + 70, $mfg_loc_grp_nm, value);
	}


	/**
	 * Mfg. location name 製造場所名.<p>
	 *
	 */
	public String mfg_loc_nm() {
		return getConstString(offset + 71, $mfg_loc_nm);
	}

	/**
	 * Mfg. location name 製造場所名.<p>
	 *
	 */
	public void mfg_loc_nm(String value) {
		setConstString(offset + 71, $mfg_loc_nm, value);
	}


	/**
	 * Supplier name 発注先名.<p>
	 *
	 */
	public String sppl_nm() {
		return getConstString(offset + 72, $sppl_nm);
	}

	/**
	 * Supplier name 発注先名.<p>
	 *
	 */
	public void sppl_nm(String value) {
		setConstString(offset + 72, $sppl_nm, value);
	}


	/**
	 * Maker name メーカ名.<p>
	 *
	 */
	public String maker_nm() {
		return getConstString(offset + 73, $maker_nm);
	}

	/**
	 * Maker name メーカ名.<p>
	 *
	 */
	public void maker_nm(String value) {
		setConstString(offset + 73, $maker_nm, value);
	}


	/**
	 * Factory/Distribution warehouse cd. (Requested) 依頼先工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public String rqst_site_cd() {
		return getConstString(offset + 74, $rqst_site_cd);
	}

	/**
	 * Factory/Distribution warehouse cd. (Requested) 依頼先工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public void rqst_site_cd(String value) {
		setConstString(offset + 74, $rqst_site_cd, value);
	}


	/**
	 * Factory/Distribution warehouse name (Requested) 依頼先工場・物流倉庫名.<p>
	 *
	 */
	public String rqst_site_nm() {
		return getConstString(offset + 75, $rqst_site_nm);
	}

	/**
	 * Factory/Distribution warehouse name (Requested) 依頼先工場・物流倉庫名.<p>
	 *
	 */
	public void rqst_site_nm(String value) {
		setConstString(offset + 75, $rqst_site_nm, value);
	}


	/**
	 * Requested location group cd. 依頼先場所グループＣＤ.<p>
	 *
	 */
	public String rqst_loc_grp_cd() {
		return getConstString(offset + 76, $rqst_loc_grp_cd);
	}

	/**
	 * Requested location group cd. 依頼先場所グループＣＤ.<p>
	 *
	 */
	public void rqst_loc_grp_cd(String value) {
		setConstString(offset + 76, $rqst_loc_grp_cd, value);
	}


	/**
	 * Requested location group name 依頼先場所グループ名.<p>
	 *
	 */
	public String rqst_loc_grp_nm() {
		return getConstString(offset + 77, $rqst_loc_grp_nm);
	}

	/**
	 * Requested location group name 依頼先場所グループ名.<p>
	 *
	 */
	public void rqst_loc_grp_nm(String value) {
		setConstString(offset + 77, $rqst_loc_grp_nm, value);
	}


	/**
	 * Location name (Requested) 依頼先場所名.<p>
	 *
	 */
	public String rqst_loc_nm() {
		return getConstString(offset + 78, $rqst_loc_nm);
	}

	/**
	 * Location name (Requested) 依頼先場所名.<p>
	 *
	 */
	public void rqst_loc_nm(String value) {
		setConstString(offset + 78, $rqst_loc_nm, value);
	}


	/**
	 * Requested WG name 依頼先ワーキンググループ名.<p>
	 *
	 */
	public String rqst_wg_nm() {
		return getConstString(offset + 79, $rqst_wg_nm);
	}

	/**
	 * Requested WG name 依頼先ワーキンググループ名.<p>
	 *
	 */
	public void rqst_wg_nm(String value) {
		setConstString(offset + 79, $rqst_wg_nm, value);
	}


	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public String wg_nm() {
		return getConstString(offset + 80, $wg_nm);
	}

	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public void wg_nm(String value) {
		setConstString(offset + 80, $wg_nm, value);
	}


	/**
	 * Operation order status type 工程オーダ状況区分.<p>
	 *
	 */
	public String oper_ord_sts_typ() {
		return getConstString(offset + 81, $oper_ord_sts_typ);
	}

	/**
	 * Operation order status type 工程オーダ状況区分.<p>
	 *
	 */
	public void oper_ord_sts_typ(String value) {
		setConstString(offset + 81, $oper_ord_sts_typ, value);
	}


	/**
	 * Unplanned subcontracting order 計画外外注発注.<p>
	 *
	 */
	public boolean uplnd_outsrc_flg() {
		return getConstBoolean(offset + 82, $uplnd_outsrc_flg);
	}

	/**
	 * Unplanned subcontracting order 計画外外注発注.<p>
	 *
	 */
	public void uplnd_outsrc_flg(boolean value) {
		setConstBoolean(offset + 82, $uplnd_outsrc_flg, value);
	}


	/**
	 * Sales project No. 案件ＮＯ.<p>
	 *
	 */
	public String wrk_no() {
		return getConstString(offset + 83, $wrk_no);
	}

	/**
	 * Sales project No. 案件ＮＯ.<p>
	 *
	 */
	public void wrk_no(String value) {
		setConstString(offset + 83, $wrk_no, value);
	}


	/**
	 * Sales project name 案件名.<p>
	 *
	 */
	public String wrk_nm() {
		return getConstString(offset + 84, $wrk_nm);
	}

	/**
	 * Sales project name 案件名.<p>
	 *
	 */
	public void wrk_nm(String value) {
		setConstString(offset + 84, $wrk_nm, value);
	}


	/**
	 * Item type 品目区分.<p>
	 *
	 */
	public String itm_typ() {
		return getConstString(offset + 85, $itm_typ);
	}

	/**
	 * Item type 品目区分.<p>
	 *
	 */
	public void itm_typ(String value) {
		setConstString(offset + 85, $itm_typ, value);
	}


	/**
	 * Item type name 品目区分名.<p>
	 *
	 */
	public String itm_typ_nm() {
		return getConstString(offset + 86, $itm_typ_nm);
	}

	/**
	 * Item type name 品目区分名.<p>
	 *
	 */
	public void itm_typ_nm(String value) {
		setConstString(offset + 86, $itm_typ_nm, value);
	}


	/**
	 * Item type details cd. 品目区分詳細ＣＤ.<p>
	 *
	 */
	public String itm_typ_d_cd() {
		return getConstString(offset + 87, $itm_typ_d_cd);
	}

	/**
	 * Item type details cd. 品目区分詳細ＣＤ.<p>
	 *
	 */
	public void itm_typ_d_cd(String value) {
		setConstString(offset + 87, $itm_typ_d_cd, value);
	}


	/**
	 * Item type details name 品目区分詳細名.<p>
	 *
	 */
	public String itm_typ_d_nm() {
		return getConstString(offset + 88, $itm_typ_d_nm);
	}

	/**
	 * Item type details name 品目区分詳細名.<p>
	 *
	 */
	public void itm_typ_d_nm(String value) {
		setConstString(offset + 88, $itm_typ_d_nm, value);
	}


	/**
	 * Scheduler frozen スケジューラ凍結.<p>
	 *
	 */
	public boolean scheduler_frozen_flg() {
		return getConstBoolean(offset + 89, $scheduler_frozen_flg);
	}

	/**
	 * Scheduler frozen スケジューラ凍結.<p>
	 *
	 */
	public void scheduler_frozen_flg(boolean value) {
		setConstBoolean(offset + 89, $scheduler_frozen_flg, value);
	}


	public String getString(String name) {
		if ($mrp_typ.equalsIgnoreCase(name)) {
			return mrp_typ();
		}
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			return data_crud_typ();
		}
		if ($a_itm_ord_sts_typ.equalsIgnoreCase(name)) {
			return a_itm_ord_sts_typ();
		}
		if ($b_itm_ord_sts_typ.equalsIgnoreCase(name)) {
			return b_itm_ord_sts_typ();
		}
		if ($strg_lg_grp_cd.equalsIgnoreCase(name)) {
			return strg_lg_grp_cd();
		}
		if ($strg_sppl_cd.equalsIgnoreCase(name)) {
			return strg_sppl_cd();
		}
		if ($mfg_sppl_cd.equalsIgnoreCase(name)) {
			return mfg_sppl_cd();
		}
		if ($mfg_maker_cd.equalsIgnoreCase(name)) {
			return mfg_maker_cd();
		}
		if ($rqst_to_lg_grp_cd.equalsIgnoreCase(name)) {
			return rqst_to_lg_grp_cd();
		}
		if ($unit_cd.equalsIgnoreCase(name)) {
			return unit_cd();
		}
		if ($rqst_lg_grp_cd.equalsIgnoreCase(name)) {
			return rqst_lg_grp_cd();
		}
		if ($chk_itm_cd.equalsIgnoreCase(name)) {
			return chk_itm_cd();
		}
		if ($chk_strg_loc_wg_cd.equalsIgnoreCase(name)) {
			return chk_strg_loc_wg_cd();
		}
		if ($chk_strg_loc_lg_grp_cd.equalsIgnoreCase(name)) {
			return chk_strg_loc_lg_grp_cd();
		}
		if ($chk_strg_loc_site_cd.equalsIgnoreCase(name)) {
			return chk_strg_loc_site_cd();
		}
		if ($chk_mfg_loc_wg_cd.equalsIgnoreCase(name)) {
			return chk_mfg_loc_wg_cd();
		}
		if ($chk_rqst_loc_wg_cd.equalsIgnoreCase(name)) {
			return chk_rqst_loc_wg_cd();
		}
		if ($chk_rqst_loc_lg_grp_cd.equalsIgnoreCase(name)) {
			return chk_rqst_loc_lg_grp_cd();
		}
		if ($chk_b_wg_cd.equalsIgnoreCase(name)) {
			return chk_b_wg_cd();
		}
		if ($chk_b_itm_ord_sts_typ.equalsIgnoreCase(name)) {
			return chk_b_itm_ord_sts_typ();
		}
		if ($chk_itm_sno1_mng_typ.equalsIgnoreCase(name)) {
			return chk_itm_sno1_mng_typ();
		}
		if ($chk_itm_sno2_mng_typ.equalsIgnoreCase(name)) {
			return chk_itm_sno2_mng_typ();
		}
		if ($chk_itm_sno3_mng_typ.equalsIgnoreCase(name)) {
			return chk_itm_sno3_mng_typ();
		}
		if ($chk_itm_sno4_mng_typ.equalsIgnoreCase(name)) {
			return chk_itm_sno4_mng_typ();
		}
		if ($lot_mng_typ.equalsIgnoreCase(name)) {
			return lot_mng_typ();
		}
		if ($sublot_mng_typ.equalsIgnoreCase(name)) {
			return sublot_mng_typ();
		}
		if ($stk_mng_typ.equalsIgnoreCase(name)) {
			return stk_mng_typ();
		}
		if ($itm_nm.equalsIgnoreCase(name)) {
			return itm_nm();
		}
		if ($unit_nm.equalsIgnoreCase(name)) {
			return unit_nm();
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
		if ($strg_site_cd.equalsIgnoreCase(name)) {
			return strg_site_cd();
		}
		if ($strg_site_nm.equalsIgnoreCase(name)) {
			return strg_site_nm();
		}
		if ($strg_loc_grp_cd.equalsIgnoreCase(name)) {
			return strg_loc_grp_cd();
		}
		if ($strg_loc_grp_nm.equalsIgnoreCase(name)) {
			return strg_loc_grp_nm();
		}
		if ($strg_lg_grp_nm.equalsIgnoreCase(name)) {
			return strg_lg_grp_nm();
		}
		if ($strg_alloc_grp_cd.equalsIgnoreCase(name)) {
			return strg_alloc_grp_cd();
		}
		if ($strg_alloc_grp_nm.equalsIgnoreCase(name)) {
			return strg_alloc_grp_nm();
		}
		if ($strg_loc_nm.equalsIgnoreCase(name)) {
			return strg_loc_nm();
		}
		if ($mfg_site_cd.equalsIgnoreCase(name)) {
			return mfg_site_cd();
		}
		if ($mfg_site_nm.equalsIgnoreCase(name)) {
			return mfg_site_nm();
		}
		if ($mfg_loc_grp_cd.equalsIgnoreCase(name)) {
			return mfg_loc_grp_cd();
		}
		if ($mfg_loc_grp_nm.equalsIgnoreCase(name)) {
			return mfg_loc_grp_nm();
		}
		if ($mfg_loc_nm.equalsIgnoreCase(name)) {
			return mfg_loc_nm();
		}
		if ($sppl_nm.equalsIgnoreCase(name)) {
			return sppl_nm();
		}
		if ($maker_nm.equalsIgnoreCase(name)) {
			return maker_nm();
		}
		if ($rqst_site_cd.equalsIgnoreCase(name)) {
			return rqst_site_cd();
		}
		if ($rqst_site_nm.equalsIgnoreCase(name)) {
			return rqst_site_nm();
		}
		if ($rqst_loc_grp_cd.equalsIgnoreCase(name)) {
			return rqst_loc_grp_cd();
		}
		if ($rqst_loc_grp_nm.equalsIgnoreCase(name)) {
			return rqst_loc_grp_nm();
		}
		if ($rqst_loc_nm.equalsIgnoreCase(name)) {
			return rqst_loc_nm();
		}
		if ($rqst_wg_nm.equalsIgnoreCase(name)) {
			return rqst_wg_nm();
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			return wg_nm();
		}
		if ($oper_ord_sts_typ.equalsIgnoreCase(name)) {
			return oper_ord_sts_typ();
		}
		if ($wrk_no.equalsIgnoreCase(name)) {
			return wrk_no();
		}
		if ($wrk_nm.equalsIgnoreCase(name)) {
			return wrk_nm();
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
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($peg_no.equalsIgnoreCase(name)) {
			return peg_no();
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			return dec_place();
		}
		if ($cont_fctr_inst_qty.equalsIgnoreCase(name)) {
			return cont_fctr_inst_qty();
		}
		if ($cont_fctr_schd_yield.equalsIgnoreCase(name)) {
			return cont_fctr_schd_yield();
		}
		if ($std_cont_fctr.equalsIgnoreCase(name)) {
			return std_cont_fctr();
		}
		if ($cont_fctr_dec_place.equalsIgnoreCase(name)) {
			return cont_fctr_dec_place();
		}
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		if ($chk_order_stop_dt.equalsIgnoreCase(name)) {
			return chk_order_stop_dt();
		}
		if ($chk_sppl_stop_dt.equalsIgnoreCase(name)) {
			return chk_sppl_stop_dt();
		}
		if ($chk_mfg_sppl_stop_dt.equalsIgnoreCase(name)) {
			return chk_mfg_sppl_stop_dt();
		}
		return super.getDate(name);
	}
	public boolean getBoolean(String name) {
		if ($is_src_mfg_inst_flg.equalsIgnoreCase(name)) {
			return is_src_mfg_inst_flg();
		}
		if ($oper_ord_pr_flg.equalsIgnoreCase(name)) {
			return oper_ord_pr_flg();
		}
		if ($io_schd_pr_flg.equalsIgnoreCase(name)) {
			return io_schd_pr_flg();
		}
		if ($err_flg.equalsIgnoreCase(name)) {
			return err_flg();
		}
		if ($chk_wg_mfg_flg.equalsIgnoreCase(name)) {
			return chk_wg_mfg_flg();
		}
		if ($chk_wg_lg_flg.equalsIgnoreCase(name)) {
			return chk_wg_lg_flg();
		}
		if ($chk_itm_ver_flg.equalsIgnoreCase(name)) {
			return chk_itm_ver_flg();
		}
		if ($chk_itm_insp_flg.equalsIgnoreCase(name)) {
			return chk_itm_insp_flg();
		}
		if ($chk_valid_ver_no_flg.equalsIgnoreCase(name)) {
			return chk_valid_ver_no_flg();
		}
		if ($chk_not_fix_flg.equalsIgnoreCase(name)) {
			return chk_not_fix_flg();
		}
		if ($chk_itm_stop_flg.equalsIgnoreCase(name)) {
			return chk_itm_stop_flg();
		}
		if ($chk_sppl_stop_flg.equalsIgnoreCase(name)) {
			return chk_sppl_stop_flg();
		}
		if ($chk_mfg_sppl_stop_flg.equalsIgnoreCase(name)) {
			return chk_mfg_sppl_stop_flg();
		}
		if ($chk_sche_ord_flg.equalsIgnoreCase(name)) {
			return chk_sche_ord_flg();
		}
		if ($chk_dft_oper_flg.equalsIgnoreCase(name)) {
			return chk_dft_oper_flg();
		}
		if ($in_prmt_insp_flg.equalsIgnoreCase(name)) {
			return in_prmt_insp_flg();
		}
		if ($cont_fctr_flg.equalsIgnoreCase(name)) {
			return cont_fctr_flg();
		}
		if ($uplnd_outsrc_flg.equalsIgnoreCase(name)) {
			return uplnd_outsrc_flg();
		}
		if ($scheduler_frozen_flg.equalsIgnoreCase(name)) {
			return scheduler_frozen_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($mrp_typ.equalsIgnoreCase(name)) {
			return mrp_typ();
		}
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			return data_crud_typ();
		}
		if ($a_itm_ord_sts_typ.equalsIgnoreCase(name)) {
			return a_itm_ord_sts_typ();
		}
		if ($b_itm_ord_sts_typ.equalsIgnoreCase(name)) {
			return b_itm_ord_sts_typ();
		}
		if ($strg_lg_grp_cd.equalsIgnoreCase(name)) {
			return strg_lg_grp_cd();
		}
		if ($strg_sppl_cd.equalsIgnoreCase(name)) {
			return strg_sppl_cd();
		}
		if ($mfg_sppl_cd.equalsIgnoreCase(name)) {
			return mfg_sppl_cd();
		}
		if ($mfg_maker_cd.equalsIgnoreCase(name)) {
			return mfg_maker_cd();
		}
		if ($rqst_to_lg_grp_cd.equalsIgnoreCase(name)) {
			return rqst_to_lg_grp_cd();
		}
		if ($unit_cd.equalsIgnoreCase(name)) {
			return unit_cd();
		}
		if ($rqst_lg_grp_cd.equalsIgnoreCase(name)) {
			return rqst_lg_grp_cd();
		}
		if ($chk_itm_cd.equalsIgnoreCase(name)) {
			return chk_itm_cd();
		}
		if ($chk_strg_loc_wg_cd.equalsIgnoreCase(name)) {
			return chk_strg_loc_wg_cd();
		}
		if ($chk_strg_loc_lg_grp_cd.equalsIgnoreCase(name)) {
			return chk_strg_loc_lg_grp_cd();
		}
		if ($chk_strg_loc_site_cd.equalsIgnoreCase(name)) {
			return chk_strg_loc_site_cd();
		}
		if ($chk_mfg_loc_wg_cd.equalsIgnoreCase(name)) {
			return chk_mfg_loc_wg_cd();
		}
		if ($chk_rqst_loc_wg_cd.equalsIgnoreCase(name)) {
			return chk_rqst_loc_wg_cd();
		}
		if ($chk_rqst_loc_lg_grp_cd.equalsIgnoreCase(name)) {
			return chk_rqst_loc_lg_grp_cd();
		}
		if ($chk_b_wg_cd.equalsIgnoreCase(name)) {
			return chk_b_wg_cd();
		}
		if ($chk_b_itm_ord_sts_typ.equalsIgnoreCase(name)) {
			return chk_b_itm_ord_sts_typ();
		}
		if ($chk_itm_sno1_mng_typ.equalsIgnoreCase(name)) {
			return chk_itm_sno1_mng_typ();
		}
		if ($chk_itm_sno2_mng_typ.equalsIgnoreCase(name)) {
			return chk_itm_sno2_mng_typ();
		}
		if ($chk_itm_sno3_mng_typ.equalsIgnoreCase(name)) {
			return chk_itm_sno3_mng_typ();
		}
		if ($chk_itm_sno4_mng_typ.equalsIgnoreCase(name)) {
			return chk_itm_sno4_mng_typ();
		}
		if ($lot_mng_typ.equalsIgnoreCase(name)) {
			return lot_mng_typ();
		}
		if ($sublot_mng_typ.equalsIgnoreCase(name)) {
			return sublot_mng_typ();
		}
		if ($stk_mng_typ.equalsIgnoreCase(name)) {
			return stk_mng_typ();
		}
		if ($itm_nm.equalsIgnoreCase(name)) {
			return itm_nm();
		}
		if ($unit_nm.equalsIgnoreCase(name)) {
			return unit_nm();
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
		if ($strg_site_cd.equalsIgnoreCase(name)) {
			return strg_site_cd();
		}
		if ($strg_site_nm.equalsIgnoreCase(name)) {
			return strg_site_nm();
		}
		if ($strg_loc_grp_cd.equalsIgnoreCase(name)) {
			return strg_loc_grp_cd();
		}
		if ($strg_loc_grp_nm.equalsIgnoreCase(name)) {
			return strg_loc_grp_nm();
		}
		if ($strg_lg_grp_nm.equalsIgnoreCase(name)) {
			return strg_lg_grp_nm();
		}
		if ($strg_alloc_grp_cd.equalsIgnoreCase(name)) {
			return strg_alloc_grp_cd();
		}
		if ($strg_alloc_grp_nm.equalsIgnoreCase(name)) {
			return strg_alloc_grp_nm();
		}
		if ($strg_loc_nm.equalsIgnoreCase(name)) {
			return strg_loc_nm();
		}
		if ($mfg_site_cd.equalsIgnoreCase(name)) {
			return mfg_site_cd();
		}
		if ($mfg_site_nm.equalsIgnoreCase(name)) {
			return mfg_site_nm();
		}
		if ($mfg_loc_grp_cd.equalsIgnoreCase(name)) {
			return mfg_loc_grp_cd();
		}
		if ($mfg_loc_grp_nm.equalsIgnoreCase(name)) {
			return mfg_loc_grp_nm();
		}
		if ($mfg_loc_nm.equalsIgnoreCase(name)) {
			return mfg_loc_nm();
		}
		if ($sppl_nm.equalsIgnoreCase(name)) {
			return sppl_nm();
		}
		if ($maker_nm.equalsIgnoreCase(name)) {
			return maker_nm();
		}
		if ($rqst_site_cd.equalsIgnoreCase(name)) {
			return rqst_site_cd();
		}
		if ($rqst_site_nm.equalsIgnoreCase(name)) {
			return rqst_site_nm();
		}
		if ($rqst_loc_grp_cd.equalsIgnoreCase(name)) {
			return rqst_loc_grp_cd();
		}
		if ($rqst_loc_grp_nm.equalsIgnoreCase(name)) {
			return rqst_loc_grp_nm();
		}
		if ($rqst_loc_nm.equalsIgnoreCase(name)) {
			return rqst_loc_nm();
		}
		if ($rqst_wg_nm.equalsIgnoreCase(name)) {
			return rqst_wg_nm();
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			return wg_nm();
		}
		if ($oper_ord_sts_typ.equalsIgnoreCase(name)) {
			return oper_ord_sts_typ();
		}
		if ($wrk_no.equalsIgnoreCase(name)) {
			return wrk_no();
		}
		if ($wrk_nm.equalsIgnoreCase(name)) {
			return wrk_nm();
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
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($peg_no.equalsIgnoreCase(name)) {
			return peg_no();
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			return dec_place();
		}
		if ($cont_fctr_inst_qty.equalsIgnoreCase(name)) {
			return cont_fctr_inst_qty();
		}
		if ($cont_fctr_schd_yield.equalsIgnoreCase(name)) {
			return cont_fctr_schd_yield();
		}
		if ($std_cont_fctr.equalsIgnoreCase(name)) {
			return std_cont_fctr();
		}
		if ($cont_fctr_dec_place.equalsIgnoreCase(name)) {
			return cont_fctr_dec_place();
		}
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($chk_order_stop_dt.equalsIgnoreCase(name)) {
			return chk_order_stop_dt();
		}
		if ($chk_sppl_stop_dt.equalsIgnoreCase(name)) {
			return chk_sppl_stop_dt();
		}
		if ($chk_mfg_sppl_stop_dt.equalsIgnoreCase(name)) {
			return chk_mfg_sppl_stop_dt();
		}
		return super.getDateNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($is_src_mfg_inst_flg.equalsIgnoreCase(name)) {
			return is_src_mfg_inst_flg();
		}
		if ($oper_ord_pr_flg.equalsIgnoreCase(name)) {
			return oper_ord_pr_flg();
		}
		if ($io_schd_pr_flg.equalsIgnoreCase(name)) {
			return io_schd_pr_flg();
		}
		if ($err_flg.equalsIgnoreCase(name)) {
			return err_flg();
		}
		if ($chk_wg_mfg_flg.equalsIgnoreCase(name)) {
			return chk_wg_mfg_flg();
		}
		if ($chk_wg_lg_flg.equalsIgnoreCase(name)) {
			return chk_wg_lg_flg();
		}
		if ($chk_itm_ver_flg.equalsIgnoreCase(name)) {
			return chk_itm_ver_flg();
		}
		if ($chk_itm_insp_flg.equalsIgnoreCase(name)) {
			return chk_itm_insp_flg();
		}
		if ($chk_valid_ver_no_flg.equalsIgnoreCase(name)) {
			return chk_valid_ver_no_flg();
		}
		if ($chk_not_fix_flg.equalsIgnoreCase(name)) {
			return chk_not_fix_flg();
		}
		if ($chk_itm_stop_flg.equalsIgnoreCase(name)) {
			return chk_itm_stop_flg();
		}
		if ($chk_sppl_stop_flg.equalsIgnoreCase(name)) {
			return chk_sppl_stop_flg();
		}
		if ($chk_mfg_sppl_stop_flg.equalsIgnoreCase(name)) {
			return chk_mfg_sppl_stop_flg();
		}
		if ($chk_sche_ord_flg.equalsIgnoreCase(name)) {
			return chk_sche_ord_flg();
		}
		if ($chk_dft_oper_flg.equalsIgnoreCase(name)) {
			return chk_dft_oper_flg();
		}
		if ($in_prmt_insp_flg.equalsIgnoreCase(name)) {
			return in_prmt_insp_flg();
		}
		if ($cont_fctr_flg.equalsIgnoreCase(name)) {
			return cont_fctr_flg();
		}
		if ($uplnd_outsrc_flg.equalsIgnoreCase(name)) {
			return uplnd_outsrc_flg();
		}
		if ($scheduler_frozen_flg.equalsIgnoreCase(name)) {
			return scheduler_frozen_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($mrp_typ.equalsIgnoreCase(name)) {
			mrp_typ(value);
			return;
		}
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			data_crud_typ(value);
			return;
		}
		if ($a_itm_ord_sts_typ.equalsIgnoreCase(name)) {
			a_itm_ord_sts_typ(value);
			return;
		}
		if ($b_itm_ord_sts_typ.equalsIgnoreCase(name)) {
			b_itm_ord_sts_typ(value);
			return;
		}
		if ($strg_lg_grp_cd.equalsIgnoreCase(name)) {
			strg_lg_grp_cd(value);
			return;
		}
		if ($strg_sppl_cd.equalsIgnoreCase(name)) {
			strg_sppl_cd(value);
			return;
		}
		if ($mfg_sppl_cd.equalsIgnoreCase(name)) {
			mfg_sppl_cd(value);
			return;
		}
		if ($mfg_maker_cd.equalsIgnoreCase(name)) {
			mfg_maker_cd(value);
			return;
		}
		if ($rqst_to_lg_grp_cd.equalsIgnoreCase(name)) {
			rqst_to_lg_grp_cd(value);
			return;
		}
		if ($unit_cd.equalsIgnoreCase(name)) {
			unit_cd(value);
			return;
		}
		if ($rqst_lg_grp_cd.equalsIgnoreCase(name)) {
			rqst_lg_grp_cd(value);
			return;
		}
		if ($chk_itm_cd.equalsIgnoreCase(name)) {
			chk_itm_cd(value);
			return;
		}
		if ($chk_strg_loc_wg_cd.equalsIgnoreCase(name)) {
			chk_strg_loc_wg_cd(value);
			return;
		}
		if ($chk_strg_loc_lg_grp_cd.equalsIgnoreCase(name)) {
			chk_strg_loc_lg_grp_cd(value);
			return;
		}
		if ($chk_strg_loc_site_cd.equalsIgnoreCase(name)) {
			chk_strg_loc_site_cd(value);
			return;
		}
		if ($chk_mfg_loc_wg_cd.equalsIgnoreCase(name)) {
			chk_mfg_loc_wg_cd(value);
			return;
		}
		if ($chk_rqst_loc_wg_cd.equalsIgnoreCase(name)) {
			chk_rqst_loc_wg_cd(value);
			return;
		}
		if ($chk_rqst_loc_lg_grp_cd.equalsIgnoreCase(name)) {
			chk_rqst_loc_lg_grp_cd(value);
			return;
		}
		if ($chk_b_wg_cd.equalsIgnoreCase(name)) {
			chk_b_wg_cd(value);
			return;
		}
		if ($chk_b_itm_ord_sts_typ.equalsIgnoreCase(name)) {
			chk_b_itm_ord_sts_typ(value);
			return;
		}
		if ($chk_itm_sno1_mng_typ.equalsIgnoreCase(name)) {
			chk_itm_sno1_mng_typ(value);
			return;
		}
		if ($chk_itm_sno2_mng_typ.equalsIgnoreCase(name)) {
			chk_itm_sno2_mng_typ(value);
			return;
		}
		if ($chk_itm_sno3_mng_typ.equalsIgnoreCase(name)) {
			chk_itm_sno3_mng_typ(value);
			return;
		}
		if ($chk_itm_sno4_mng_typ.equalsIgnoreCase(name)) {
			chk_itm_sno4_mng_typ(value);
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
		if ($stk_mng_typ.equalsIgnoreCase(name)) {
			stk_mng_typ(value);
			return;
		}
		if ($itm_nm.equalsIgnoreCase(name)) {
			itm_nm(value);
			return;
		}
		if ($unit_nm.equalsIgnoreCase(name)) {
			unit_nm(value);
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
		if ($strg_site_cd.equalsIgnoreCase(name)) {
			strg_site_cd(value);
			return;
		}
		if ($strg_site_nm.equalsIgnoreCase(name)) {
			strg_site_nm(value);
			return;
		}
		if ($strg_loc_grp_cd.equalsIgnoreCase(name)) {
			strg_loc_grp_cd(value);
			return;
		}
		if ($strg_loc_grp_nm.equalsIgnoreCase(name)) {
			strg_loc_grp_nm(value);
			return;
		}
		if ($strg_lg_grp_nm.equalsIgnoreCase(name)) {
			strg_lg_grp_nm(value);
			return;
		}
		if ($strg_alloc_grp_cd.equalsIgnoreCase(name)) {
			strg_alloc_grp_cd(value);
			return;
		}
		if ($strg_alloc_grp_nm.equalsIgnoreCase(name)) {
			strg_alloc_grp_nm(value);
			return;
		}
		if ($strg_loc_nm.equalsIgnoreCase(name)) {
			strg_loc_nm(value);
			return;
		}
		if ($mfg_site_cd.equalsIgnoreCase(name)) {
			mfg_site_cd(value);
			return;
		}
		if ($mfg_site_nm.equalsIgnoreCase(name)) {
			mfg_site_nm(value);
			return;
		}
		if ($mfg_loc_grp_cd.equalsIgnoreCase(name)) {
			mfg_loc_grp_cd(value);
			return;
		}
		if ($mfg_loc_grp_nm.equalsIgnoreCase(name)) {
			mfg_loc_grp_nm(value);
			return;
		}
		if ($mfg_loc_nm.equalsIgnoreCase(name)) {
			mfg_loc_nm(value);
			return;
		}
		if ($sppl_nm.equalsIgnoreCase(name)) {
			sppl_nm(value);
			return;
		}
		if ($maker_nm.equalsIgnoreCase(name)) {
			maker_nm(value);
			return;
		}
		if ($rqst_site_cd.equalsIgnoreCase(name)) {
			rqst_site_cd(value);
			return;
		}
		if ($rqst_site_nm.equalsIgnoreCase(name)) {
			rqst_site_nm(value);
			return;
		}
		if ($rqst_loc_grp_cd.equalsIgnoreCase(name)) {
			rqst_loc_grp_cd(value);
			return;
		}
		if ($rqst_loc_grp_nm.equalsIgnoreCase(name)) {
			rqst_loc_grp_nm(value);
			return;
		}
		if ($rqst_loc_nm.equalsIgnoreCase(name)) {
			rqst_loc_nm(value);
			return;
		}
		if ($rqst_wg_nm.equalsIgnoreCase(name)) {
			rqst_wg_nm(value);
			return;
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			wg_nm(value);
			return;
		}
		if ($oper_ord_sts_typ.equalsIgnoreCase(name)) {
			oper_ord_sts_typ(value);
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
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($cont_fctr_inst_qty.equalsIgnoreCase(name)) {
			cont_fctr_inst_qty(value);
			return;
		}
		if ($cont_fctr_schd_yield.equalsIgnoreCase(name)) {
			cont_fctr_schd_yield(value);
			return;
		}
		if ($std_cont_fctr.equalsIgnoreCase(name)) {
			std_cont_fctr(value);
			return;
		}
		if ($cont_fctr_dec_place.equalsIgnoreCase(name)) {
			cont_fctr_dec_place(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($cont_fctr_inst_qty.equalsIgnoreCase(name)) {
			cont_fctr_inst_qty(value);
			return;
		}
		if ($cont_fctr_schd_yield.equalsIgnoreCase(name)) {
			cont_fctr_schd_yield(value);
			return;
		}
		if ($std_cont_fctr.equalsIgnoreCase(name)) {
			std_cont_fctr(value);
			return;
		}
		if ($cont_fctr_dec_place.equalsIgnoreCase(name)) {
			cont_fctr_dec_place(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($cont_fctr_inst_qty.equalsIgnoreCase(name)) {
			cont_fctr_inst_qty(value);
			return;
		}
		if ($cont_fctr_schd_yield.equalsIgnoreCase(name)) {
			cont_fctr_schd_yield(value);
			return;
		}
		if ($std_cont_fctr.equalsIgnoreCase(name)) {
			std_cont_fctr(value);
			return;
		}
		if ($cont_fctr_dec_place.equalsIgnoreCase(name)) {
			cont_fctr_dec_place(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($cont_fctr_inst_qty.equalsIgnoreCase(name)) {
			cont_fctr_inst_qty(value);
			return;
		}
		if ($cont_fctr_schd_yield.equalsIgnoreCase(name)) {
			cont_fctr_schd_yield(value);
			return;
		}
		if ($std_cont_fctr.equalsIgnoreCase(name)) {
			std_cont_fctr(value);
			return;
		}
		if ($cont_fctr_dec_place.equalsIgnoreCase(name)) {
			cont_fctr_dec_place(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($cont_fctr_inst_qty.equalsIgnoreCase(name)) {
			cont_fctr_inst_qty(value);
			return;
		}
		if ($cont_fctr_schd_yield.equalsIgnoreCase(name)) {
			cont_fctr_schd_yield(value);
			return;
		}
		if ($std_cont_fctr.equalsIgnoreCase(name)) {
			std_cont_fctr(value);
			return;
		}
		if ($cont_fctr_dec_place.equalsIgnoreCase(name)) {
			cont_fctr_dec_place(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($chk_order_stop_dt.equalsIgnoreCase(name)) {
			chk_order_stop_dt(value);
			return;
		}
		if ($chk_sppl_stop_dt.equalsIgnoreCase(name)) {
			chk_sppl_stop_dt(value);
			return;
		}
		if ($chk_mfg_sppl_stop_dt.equalsIgnoreCase(name)) {
			chk_mfg_sppl_stop_dt(value);
			return;
		}
		super.setDate(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($is_src_mfg_inst_flg.equalsIgnoreCase(name)) {
			is_src_mfg_inst_flg(value);
			return;
		}
		if ($oper_ord_pr_flg.equalsIgnoreCase(name)) {
			oper_ord_pr_flg(value);
			return;
		}
		if ($io_schd_pr_flg.equalsIgnoreCase(name)) {
			io_schd_pr_flg(value);
			return;
		}
		if ($err_flg.equalsIgnoreCase(name)) {
			err_flg(value);
			return;
		}
		if ($chk_wg_mfg_flg.equalsIgnoreCase(name)) {
			chk_wg_mfg_flg(value);
			return;
		}
		if ($chk_wg_lg_flg.equalsIgnoreCase(name)) {
			chk_wg_lg_flg(value);
			return;
		}
		if ($chk_itm_ver_flg.equalsIgnoreCase(name)) {
			chk_itm_ver_flg(value);
			return;
		}
		if ($chk_itm_insp_flg.equalsIgnoreCase(name)) {
			chk_itm_insp_flg(value);
			return;
		}
		if ($chk_valid_ver_no_flg.equalsIgnoreCase(name)) {
			chk_valid_ver_no_flg(value);
			return;
		}
		if ($chk_not_fix_flg.equalsIgnoreCase(name)) {
			chk_not_fix_flg(value);
			return;
		}
		if ($chk_itm_stop_flg.equalsIgnoreCase(name)) {
			chk_itm_stop_flg(value);
			return;
		}
		if ($chk_sppl_stop_flg.equalsIgnoreCase(name)) {
			chk_sppl_stop_flg(value);
			return;
		}
		if ($chk_mfg_sppl_stop_flg.equalsIgnoreCase(name)) {
			chk_mfg_sppl_stop_flg(value);
			return;
		}
		if ($chk_sche_ord_flg.equalsIgnoreCase(name)) {
			chk_sche_ord_flg(value);
			return;
		}
		if ($chk_dft_oper_flg.equalsIgnoreCase(name)) {
			chk_dft_oper_flg(value);
			return;
		}
		if ($in_prmt_insp_flg.equalsIgnoreCase(name)) {
			in_prmt_insp_flg(value);
			return;
		}
		if ($cont_fctr_flg.equalsIgnoreCase(name)) {
			cont_fctr_flg(value);
			return;
		}
		if ($uplnd_outsrc_flg.equalsIgnoreCase(name)) {
			uplnd_outsrc_flg(value);
			return;
		}
		if ($scheduler_frozen_flg.equalsIgnoreCase(name)) {
			scheduler_frozen_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($mrp_typ.equalsIgnoreCase(name)) {
			mrp_typ(value);
			return;
		}
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			data_crud_typ(value);
			return;
		}
		if ($a_itm_ord_sts_typ.equalsIgnoreCase(name)) {
			a_itm_ord_sts_typ(value);
			return;
		}
		if ($b_itm_ord_sts_typ.equalsIgnoreCase(name)) {
			b_itm_ord_sts_typ(value);
			return;
		}
		if ($strg_lg_grp_cd.equalsIgnoreCase(name)) {
			strg_lg_grp_cd(value);
			return;
		}
		if ($strg_sppl_cd.equalsIgnoreCase(name)) {
			strg_sppl_cd(value);
			return;
		}
		if ($mfg_sppl_cd.equalsIgnoreCase(name)) {
			mfg_sppl_cd(value);
			return;
		}
		if ($mfg_maker_cd.equalsIgnoreCase(name)) {
			mfg_maker_cd(value);
			return;
		}
		if ($rqst_to_lg_grp_cd.equalsIgnoreCase(name)) {
			rqst_to_lg_grp_cd(value);
			return;
		}
		if ($unit_cd.equalsIgnoreCase(name)) {
			unit_cd(value);
			return;
		}
		if ($rqst_lg_grp_cd.equalsIgnoreCase(name)) {
			rqst_lg_grp_cd(value);
			return;
		}
		if ($chk_itm_cd.equalsIgnoreCase(name)) {
			chk_itm_cd(value);
			return;
		}
		if ($chk_strg_loc_wg_cd.equalsIgnoreCase(name)) {
			chk_strg_loc_wg_cd(value);
			return;
		}
		if ($chk_strg_loc_lg_grp_cd.equalsIgnoreCase(name)) {
			chk_strg_loc_lg_grp_cd(value);
			return;
		}
		if ($chk_strg_loc_site_cd.equalsIgnoreCase(name)) {
			chk_strg_loc_site_cd(value);
			return;
		}
		if ($chk_mfg_loc_wg_cd.equalsIgnoreCase(name)) {
			chk_mfg_loc_wg_cd(value);
			return;
		}
		if ($chk_rqst_loc_wg_cd.equalsIgnoreCase(name)) {
			chk_rqst_loc_wg_cd(value);
			return;
		}
		if ($chk_rqst_loc_lg_grp_cd.equalsIgnoreCase(name)) {
			chk_rqst_loc_lg_grp_cd(value);
			return;
		}
		if ($chk_b_wg_cd.equalsIgnoreCase(name)) {
			chk_b_wg_cd(value);
			return;
		}
		if ($chk_b_itm_ord_sts_typ.equalsIgnoreCase(name)) {
			chk_b_itm_ord_sts_typ(value);
			return;
		}
		if ($chk_itm_sno1_mng_typ.equalsIgnoreCase(name)) {
			chk_itm_sno1_mng_typ(value);
			return;
		}
		if ($chk_itm_sno2_mng_typ.equalsIgnoreCase(name)) {
			chk_itm_sno2_mng_typ(value);
			return;
		}
		if ($chk_itm_sno3_mng_typ.equalsIgnoreCase(name)) {
			chk_itm_sno3_mng_typ(value);
			return;
		}
		if ($chk_itm_sno4_mng_typ.equalsIgnoreCase(name)) {
			chk_itm_sno4_mng_typ(value);
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
		if ($stk_mng_typ.equalsIgnoreCase(name)) {
			stk_mng_typ(value);
			return;
		}
		if ($itm_nm.equalsIgnoreCase(name)) {
			itm_nm(value);
			return;
		}
		if ($unit_nm.equalsIgnoreCase(name)) {
			unit_nm(value);
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
		if ($strg_site_cd.equalsIgnoreCase(name)) {
			strg_site_cd(value);
			return;
		}
		if ($strg_site_nm.equalsIgnoreCase(name)) {
			strg_site_nm(value);
			return;
		}
		if ($strg_loc_grp_cd.equalsIgnoreCase(name)) {
			strg_loc_grp_cd(value);
			return;
		}
		if ($strg_loc_grp_nm.equalsIgnoreCase(name)) {
			strg_loc_grp_nm(value);
			return;
		}
		if ($strg_lg_grp_nm.equalsIgnoreCase(name)) {
			strg_lg_grp_nm(value);
			return;
		}
		if ($strg_alloc_grp_cd.equalsIgnoreCase(name)) {
			strg_alloc_grp_cd(value);
			return;
		}
		if ($strg_alloc_grp_nm.equalsIgnoreCase(name)) {
			strg_alloc_grp_nm(value);
			return;
		}
		if ($strg_loc_nm.equalsIgnoreCase(name)) {
			strg_loc_nm(value);
			return;
		}
		if ($mfg_site_cd.equalsIgnoreCase(name)) {
			mfg_site_cd(value);
			return;
		}
		if ($mfg_site_nm.equalsIgnoreCase(name)) {
			mfg_site_nm(value);
			return;
		}
		if ($mfg_loc_grp_cd.equalsIgnoreCase(name)) {
			mfg_loc_grp_cd(value);
			return;
		}
		if ($mfg_loc_grp_nm.equalsIgnoreCase(name)) {
			mfg_loc_grp_nm(value);
			return;
		}
		if ($mfg_loc_nm.equalsIgnoreCase(name)) {
			mfg_loc_nm(value);
			return;
		}
		if ($sppl_nm.equalsIgnoreCase(name)) {
			sppl_nm(value);
			return;
		}
		if ($maker_nm.equalsIgnoreCase(name)) {
			maker_nm(value);
			return;
		}
		if ($rqst_site_cd.equalsIgnoreCase(name)) {
			rqst_site_cd(value);
			return;
		}
		if ($rqst_site_nm.equalsIgnoreCase(name)) {
			rqst_site_nm(value);
			return;
		}
		if ($rqst_loc_grp_cd.equalsIgnoreCase(name)) {
			rqst_loc_grp_cd(value);
			return;
		}
		if ($rqst_loc_grp_nm.equalsIgnoreCase(name)) {
			rqst_loc_grp_nm(value);
			return;
		}
		if ($rqst_loc_nm.equalsIgnoreCase(name)) {
			rqst_loc_nm(value);
			return;
		}
		if ($rqst_wg_nm.equalsIgnoreCase(name)) {
			rqst_wg_nm(value);
			return;
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			wg_nm(value);
			return;
		}
		if ($oper_ord_sts_typ.equalsIgnoreCase(name)) {
			oper_ord_sts_typ(value);
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
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($cont_fctr_inst_qty.equalsIgnoreCase(name)) {
			cont_fctr_inst_qty(value);
			return;
		}
		if ($cont_fctr_schd_yield.equalsIgnoreCase(name)) {
			cont_fctr_schd_yield(value);
			return;
		}
		if ($std_cont_fctr.equalsIgnoreCase(name)) {
			std_cont_fctr(value);
			return;
		}
		if ($cont_fctr_dec_place.equalsIgnoreCase(name)) {
			cont_fctr_dec_place(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($cont_fctr_inst_qty.equalsIgnoreCase(name)) {
			cont_fctr_inst_qty(value);
			return;
		}
		if ($cont_fctr_schd_yield.equalsIgnoreCase(name)) {
			cont_fctr_schd_yield(value);
			return;
		}
		if ($std_cont_fctr.equalsIgnoreCase(name)) {
			std_cont_fctr(value);
			return;
		}
		if ($cont_fctr_dec_place.equalsIgnoreCase(name)) {
			cont_fctr_dec_place(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($cont_fctr_inst_qty.equalsIgnoreCase(name)) {
			cont_fctr_inst_qty(value);
			return;
		}
		if ($cont_fctr_schd_yield.equalsIgnoreCase(name)) {
			cont_fctr_schd_yield(value);
			return;
		}
		if ($std_cont_fctr.equalsIgnoreCase(name)) {
			std_cont_fctr(value);
			return;
		}
		if ($cont_fctr_dec_place.equalsIgnoreCase(name)) {
			cont_fctr_dec_place(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($cont_fctr_inst_qty.equalsIgnoreCase(name)) {
			cont_fctr_inst_qty(value);
			return;
		}
		if ($cont_fctr_schd_yield.equalsIgnoreCase(name)) {
			cont_fctr_schd_yield(value);
			return;
		}
		if ($std_cont_fctr.equalsIgnoreCase(name)) {
			std_cont_fctr(value);
			return;
		}
		if ($cont_fctr_dec_place.equalsIgnoreCase(name)) {
			cont_fctr_dec_place(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($cont_fctr_inst_qty.equalsIgnoreCase(name)) {
			cont_fctr_inst_qty(value);
			return;
		}
		if ($cont_fctr_schd_yield.equalsIgnoreCase(name)) {
			cont_fctr_schd_yield(value);
			return;
		}
		if ($std_cont_fctr.equalsIgnoreCase(name)) {
			std_cont_fctr(value);
			return;
		}
		if ($cont_fctr_dec_place.equalsIgnoreCase(name)) {
			cont_fctr_dec_place(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($chk_order_stop_dt.equalsIgnoreCase(name)) {
			chk_order_stop_dt(value);
			return;
		}
		if ($chk_sppl_stop_dt.equalsIgnoreCase(name)) {
			chk_sppl_stop_dt(value);
			return;
		}
		if ($chk_mfg_sppl_stop_dt.equalsIgnoreCase(name)) {
			chk_mfg_sppl_stop_dt(value);
			return;
		}
		super.setDateNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($is_src_mfg_inst_flg.equalsIgnoreCase(name)) {
			is_src_mfg_inst_flg(value);
			return;
		}
		if ($oper_ord_pr_flg.equalsIgnoreCase(name)) {
			oper_ord_pr_flg(value);
			return;
		}
		if ($io_schd_pr_flg.equalsIgnoreCase(name)) {
			io_schd_pr_flg(value);
			return;
		}
		if ($err_flg.equalsIgnoreCase(name)) {
			err_flg(value);
			return;
		}
		if ($chk_wg_mfg_flg.equalsIgnoreCase(name)) {
			chk_wg_mfg_flg(value);
			return;
		}
		if ($chk_wg_lg_flg.equalsIgnoreCase(name)) {
			chk_wg_lg_flg(value);
			return;
		}
		if ($chk_itm_ver_flg.equalsIgnoreCase(name)) {
			chk_itm_ver_flg(value);
			return;
		}
		if ($chk_itm_insp_flg.equalsIgnoreCase(name)) {
			chk_itm_insp_flg(value);
			return;
		}
		if ($chk_valid_ver_no_flg.equalsIgnoreCase(name)) {
			chk_valid_ver_no_flg(value);
			return;
		}
		if ($chk_not_fix_flg.equalsIgnoreCase(name)) {
			chk_not_fix_flg(value);
			return;
		}
		if ($chk_itm_stop_flg.equalsIgnoreCase(name)) {
			chk_itm_stop_flg(value);
			return;
		}
		if ($chk_sppl_stop_flg.equalsIgnoreCase(name)) {
			chk_sppl_stop_flg(value);
			return;
		}
		if ($chk_mfg_sppl_stop_flg.equalsIgnoreCase(name)) {
			chk_mfg_sppl_stop_flg(value);
			return;
		}
		if ($chk_sche_ord_flg.equalsIgnoreCase(name)) {
			chk_sche_ord_flg(value);
			return;
		}
		if ($chk_dft_oper_flg.equalsIgnoreCase(name)) {
			chk_dft_oper_flg(value);
			return;
		}
		if ($in_prmt_insp_flg.equalsIgnoreCase(name)) {
			in_prmt_insp_flg(value);
			return;
		}
		if ($cont_fctr_flg.equalsIgnoreCase(name)) {
			cont_fctr_flg(value);
			return;
		}
		if ($uplnd_outsrc_flg.equalsIgnoreCase(name)) {
			uplnd_outsrc_flg(value);
			return;
		}
		if ($scheduler_frozen_flg.equalsIgnoreCase(name)) {
			scheduler_frozen_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}

	public MCRow getInnerRow(String name) {
		if ($ord.equalsIgnoreCase(name)) {
			return ord();
		}
		return super.getInnerRow(name);
	}

	public void setInnerRow(String name, MCRow value) {
		if ($ord.equalsIgnoreCase(name)) {
			ord(
				((MCContainerMeta) ord_META).castInnerRow(mcframe.serverMS.dbc.MST_ITM_ORDER_R.class, value)
			);
			return;
		}
		super.setInnerRow(name, value);
	}


	/**
	 * Item order No. 品目オーダＮＯ.<p>
	 *
	 */
	public String itm_ord_no() {
		return ord().itm_ord_no();
	}

	/**
	 * Item order No. 品目オーダＮＯ.<p>
	 *
	 */
	public void itm_ord_no(String value) {
		ord().itm_ord_no(value);
	}

	/**
	 * Order type オーダ区分.<p>
	 *
	 */
	public String itm_ord_typ() {
		return ord().itm_ord_typ();
	}

	/**
	 * Order type オーダ区分.<p>
	 *
	 */
	public void itm_ord_typ(String value) {
		ord().itm_ord_typ(value);
	}

	/**
	 * Order generation type オーダ生成区分.<p>
	 *
	 */
	public String ord_gnrt_typ() {
		return ord().ord_gnrt_typ();
	}

	/**
	 * Order generation type オーダ生成区分.<p>
	 *
	 */
	public void ord_gnrt_typ(String value) {
		ord().ord_gnrt_typ(value);
	}

	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public String itm_cd() {
		return ord().itm_cd();
	}

	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public void itm_cd(String value) {
		ord().itm_cd(value);
	}

	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public String itm_sub1() {
		return ord().itm_sub1();
	}

	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public void itm_sub1(String value) {
		ord().itm_sub1(value);
	}

	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public String itm_sub2() {
		return ord().itm_sub2();
	}

	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public void itm_sub2(String value) {
		ord().itm_sub2(value);
	}

	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public String itm_sub3() {
		return ord().itm_sub3();
	}

	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public void itm_sub3(String value) {
		ord().itm_sub3(value);
	}

	/**
	 * Version No. 版ＮＯ.<p>
	 *
	 */
	public String ver_no() {
		return ord().ver_no();
	}

	/**
	 * Version No. 版ＮＯ.<p>
	 *
	 */
	public void ver_no(String value) {
		ord().ver_no(value);
	}

	/**
	 * Storage location cd. 格納場所ＣＤ.<p>
	 *
	 */
	public String strg_loc_cd() {
		return ord().strg_loc_cd();
	}

	/**
	 * Storage location cd. 格納場所ＣＤ.<p>
	 *
	 */
	public void strg_loc_cd(String value) {
		ord().strg_loc_cd(value);
	}

	/**
	 * Mfg. location cd. 製造場所ＣＤ.<p>
	 *
	 */
	public String mfg_loc_cd() {
		return ord().mfg_loc_cd();
	}

	/**
	 * Mfg. location cd. 製造場所ＣＤ.<p>
	 *
	 */
	public void mfg_loc_cd(String value) {
		ord().mfg_loc_cd(value);
	}

	/**
	 * Master mfg. location cd. マスタ製造場所ＣＤ.<p>
	 *
	 */
	public String mst_mfg_loc_cd() {
		return ord().mst_mfg_loc_cd();
	}

	/**
	 * Master mfg. location cd. マスタ製造場所ＣＤ.<p>
	 *
	 */
	public void mst_mfg_loc_cd(String value) {
		ord().mst_mfg_loc_cd(value);
	}

	/**
	 * Supplier cd. 発注先ＣＤ.<p>
	 *
	 */
	public String sppl_cd() {
		return ord().sppl_cd();
	}

	/**
	 * Supplier cd. 発注先ＣＤ.<p>
	 *
	 */
	public void sppl_cd(String value) {
		ord().sppl_cd(value);
	}

	/**
	 * Maker cd. メーカＣＤ.<p>
	 *
	 */
	public String maker_cd() {
		return ord().maker_cd();
	}

	/**
	 * Maker cd. メーカＣＤ.<p>
	 *
	 */
	public void maker_cd(String value) {
		ord().maker_cd(value);
	}

	/**
	 * Requested location cd. 依頼先場所ＣＤ.<p>
	 *
	 */
	public String rqst_loc_cd() {
		return ord().rqst_loc_cd();
	}

	/**
	 * Requested location cd. 依頼先場所ＣＤ.<p>
	 *
	 */
	public void rqst_loc_cd(String value) {
		ord().rqst_loc_cd(value);
	}

	/**
	 * Requested WG cd. 依頼先ワーキンググループＣＤ.<p>
	 *
	 */
	public String rqst_wg_cd() {
		return ord().rqst_wg_cd();
	}

	/**
	 * Requested WG cd. 依頼先ワーキンググループＣＤ.<p>
	 *
	 */
	public void rqst_wg_cd(String value) {
		ord().rqst_wg_cd(value);
	}

	/**
	 * BOM pattern 構成パタン.<p>
	 *
	 */
	public String bom_ptn() {
		return ord().bom_ptn();
	}

	/**
	 * BOM pattern 構成パタン.<p>
	 *
	 */
	public void bom_ptn(String value) {
		ord().bom_ptn(value);
	}

	/**
	 * Operation pattern 工程パタン.<p>
	 *
	 */
	public String oper_ptn() {
		return ord().oper_ptn();
	}

	/**
	 * Operation pattern 工程パタン.<p>
	 *
	 */
	public void oper_ptn(String value) {
		ord().oper_ptn(value);
	}

	/**
	 * Order scheduled qty. 指図予定数量.<p>
	 *
	 */
	public MCNumber inst_qty() {
		return ord().inst_qty();
	}

	/**
	 * Order scheduled qty. 指図予定数量.<p>
	 *
	 */
	public void inst_qty(MCNumber value) {
		ord().inst_qty(value);
	}

	/**
	 * Order scheduled qty. 指図予定数量.<p>
	 *
	 */
	public void inst_qty(int value) {
		ord().inst_qty(value);
	}

	/**
	 * Order scheduled qty. 指図予定数量.<p>
	 *
	 */
	public void inst_qty(long value) {
		ord().inst_qty(value);
	}

	/**
	 * Order scheduled qty. 指図予定数量.<p>
	 *
	 */
	public void inst_qty(float value) {
		ord().inst_qty(value);
	}

	/**
	 * Order scheduled qty. 指図予定数量.<p>
	 *
	 */
	public void inst_qty(double value) {
		ord().inst_qty(value);
	}

	/**
	 * Output scheduled qty. 出来高予定数量.<p>
	 *
	 */
	public MCNumber yield_schd_qty() {
		return ord().yield_schd_qty();
	}

	/**
	 * Output scheduled qty. 出来高予定数量.<p>
	 *
	 */
	public void yield_schd_qty(MCNumber value) {
		ord().yield_schd_qty(value);
	}

	/**
	 * Output scheduled qty. 出来高予定数量.<p>
	 *
	 */
	public void yield_schd_qty(int value) {
		ord().yield_schd_qty(value);
	}

	/**
	 * Output scheduled qty. 出来高予定数量.<p>
	 *
	 */
	public void yield_schd_qty(long value) {
		ord().yield_schd_qty(value);
	}

	/**
	 * Output scheduled qty. 出来高予定数量.<p>
	 *
	 */
	public void yield_schd_qty(float value) {
		ord().yield_schd_qty(value);
	}

	/**
	 * Output scheduled qty. 出来高予定数量.<p>
	 *
	 */
	public void yield_schd_qty(double value) {
		ord().yield_schd_qty(value);
	}

	/**
	 * Yield numerator 歩留分子.<p>
	 *
	 */
	public MCNumber nmr_qty() {
		return ord().nmr_qty();
	}

	/**
	 * Yield numerator 歩留分子.<p>
	 *
	 */
	public void nmr_qty(MCNumber value) {
		ord().nmr_qty(value);
	}

	/**
	 * Yield numerator 歩留分子.<p>
	 *
	 */
	public void nmr_qty(int value) {
		ord().nmr_qty(value);
	}

	/**
	 * Yield numerator 歩留分子.<p>
	 *
	 */
	public void nmr_qty(long value) {
		ord().nmr_qty(value);
	}

	/**
	 * Yield numerator 歩留分子.<p>
	 *
	 */
	public void nmr_qty(float value) {
		ord().nmr_qty(value);
	}

	/**
	 * Yield numerator 歩留分子.<p>
	 *
	 */
	public void nmr_qty(double value) {
		ord().nmr_qty(value);
	}

	/**
	 * Yield denominator 歩留分母.<p>
	 *
	 */
	public MCNumber dnm_qty() {
		return ord().dnm_qty();
	}

	/**
	 * Yield denominator 歩留分母.<p>
	 *
	 */
	public void dnm_qty(MCNumber value) {
		ord().dnm_qty(value);
	}

	/**
	 * Yield denominator 歩留分母.<p>
	 *
	 */
	public void dnm_qty(int value) {
		ord().dnm_qty(value);
	}

	/**
	 * Yield denominator 歩留分母.<p>
	 *
	 */
	public void dnm_qty(long value) {
		ord().dnm_qty(value);
	}

	/**
	 * Yield denominator 歩留分母.<p>
	 *
	 */
	public void dnm_qty(float value) {
		ord().dnm_qty(value);
	}

	/**
	 * Yield denominator 歩留分母.<p>
	 *
	 */
	public void dnm_qty(double value) {
		ord().dnm_qty(value);
	}

	/**
	 * Constant yield qty. 固定歩留数量.<p>
	 *
	 */
	public MCNumber fxd_yield_qty() {
		return ord().fxd_yield_qty();
	}

	/**
	 * Constant yield qty. 固定歩留数量.<p>
	 *
	 */
	public void fxd_yield_qty(MCNumber value) {
		ord().fxd_yield_qty(value);
	}

	/**
	 * Constant yield qty. 固定歩留数量.<p>
	 *
	 */
	public void fxd_yield_qty(int value) {
		ord().fxd_yield_qty(value);
	}

	/**
	 * Constant yield qty. 固定歩留数量.<p>
	 *
	 */
	public void fxd_yield_qty(long value) {
		ord().fxd_yield_qty(value);
	}

	/**
	 * Constant yield qty. 固定歩留数量.<p>
	 *
	 */
	public void fxd_yield_qty(float value) {
		ord().fxd_yield_qty(value);
	}

	/**
	 * Constant yield qty. 固定歩留数量.<p>
	 *
	 */
	public void fxd_yield_qty(double value) {
		ord().fxd_yield_qty(value);
	}

	/**
	 * Order status type オーダ状況区分.<p>
	 *
	 */
	public String itm_ord_sts_typ() {
		return ord().itm_ord_sts_typ();
	}

	/**
	 * Order status type オーダ状況区分.<p>
	 *
	 */
	public void itm_ord_sts_typ(String value) {
		ord().itm_ord_sts_typ(value);
	}

	/**
	 * Firm date 確定日.<p>
	 *
	 */
	public MCDate fix_dt() {
		return ord().fix_dt();
	}

	/**
	 * Firm date 確定日.<p>
	 *
	 */
	public void fix_dt(MCDate value) {
		ord().fix_dt(value);
	}

	/**
	 * Scheduled PO date 発注予定日.<p>
	 *
	 */
	public MCDate po_schd_dt() {
		return ord().po_schd_dt();
	}

	/**
	 * Scheduled PO date 発注予定日.<p>
	 *
	 */
	public void po_schd_dt(MCDate value) {
		ord().po_schd_dt(value);
	}

	/**
	 * Scheduled PO date (MRP) 発注予定日（ＭＲＰ）.<p>
	 *
	 */
	public MCDate mrp_po_schd_dt() {
		return ord().mrp_po_schd_dt();
	}

	/**
	 * Scheduled PO date (MRP) 発注予定日（ＭＲＰ）.<p>
	 *
	 */
	public void mrp_po_schd_dt(MCDate value) {
		ord().mrp_po_schd_dt(value);
	}

	/**
	 * Purchase LT (MRP) 購入ＬＴ（ＭＲＰ）.<p>
	 *
	 */
	public MCNumber mrp_purc_lt() {
		return ord().mrp_purc_lt();
	}

	/**
	 * Purchase LT (MRP) 購入ＬＴ（ＭＲＰ）.<p>
	 *
	 */
	public void mrp_purc_lt(MCNumber value) {
		ord().mrp_purc_lt(value);
	}

	/**
	 * Purchase LT (MRP) 購入ＬＴ（ＭＲＰ）.<p>
	 *
	 */
	public void mrp_purc_lt(int value) {
		ord().mrp_purc_lt(value);
	}

	/**
	 * Purchase LT (MRP) 購入ＬＴ（ＭＲＰ）.<p>
	 *
	 */
	public void mrp_purc_lt(long value) {
		ord().mrp_purc_lt(value);
	}

	/**
	 * Purchase LT (MRP) 購入ＬＴ（ＭＲＰ）.<p>
	 *
	 */
	public void mrp_purc_lt(float value) {
		ord().mrp_purc_lt(value);
	}

	/**
	 * Purchase LT (MRP) 購入ＬＴ（ＭＲＰ）.<p>
	 *
	 */
	public void mrp_purc_lt(double value) {
		ord().mrp_purc_lt(value);
	}

	/**
	 * Purchase LT 購入ＬＴ.<p>
	 *
	 */
	public MCNumber purc_lt() {
		return ord().purc_lt();
	}

	/**
	 * Purchase LT 購入ＬＴ.<p>
	 *
	 */
	public void purc_lt(MCNumber value) {
		ord().purc_lt(value);
	}

	/**
	 * Purchase LT 購入ＬＴ.<p>
	 *
	 */
	public void purc_lt(int value) {
		ord().purc_lt(value);
	}

	/**
	 * Purchase LT 購入ＬＴ.<p>
	 *
	 */
	public void purc_lt(long value) {
		ord().purc_lt(value);
	}

	/**
	 * Purchase LT 購入ＬＴ.<p>
	 *
	 */
	public void purc_lt(float value) {
		ord().purc_lt(value);
	}

	/**
	 * Purchase LT 購入ＬＴ.<p>
	 *
	 */
	public void purc_lt(double value) {
		ord().purc_lt(value);
	}

	/**
	 * Scheduled mfg. start date 製造着手予定日.<p>
	 *
	 */
	public MCDate mfg_st_schd_dt() {
		return ord().mfg_st_schd_dt();
	}

	/**
	 * Scheduled mfg. start date 製造着手予定日.<p>
	 *
	 */
	public void mfg_st_schd_dt(MCDate value) {
		ord().mfg_st_schd_dt(value);
	}

	/**
	 * Scheduled mfg. start date (MRP) 製造着手予定日（ＭＲＰ）.<p>
	 *
	 */
	public MCDate mrp_mfg_st_schd_dt() {
		return ord().mrp_mfg_st_schd_dt();
	}

	/**
	 * Scheduled mfg. start date (MRP) 製造着手予定日（ＭＲＰ）.<p>
	 *
	 */
	public void mrp_mfg_st_schd_dt(MCDate value) {
		ord().mrp_mfg_st_schd_dt(value);
	}

	/**
	 * Scheduled mfg. end date 製造終了予定日.<p>
	 *
	 */
	public MCDate mfg_end_schd_dt() {
		return ord().mfg_end_schd_dt();
	}

	/**
	 * Scheduled mfg. end date 製造終了予定日.<p>
	 *
	 */
	public void mfg_end_schd_dt(MCDate value) {
		ord().mfg_end_schd_dt(value);
	}

	/**
	 * Scheduled mfg. end date (MRP) 製造終了予定日（ＭＲＰ）.<p>
	 *
	 */
	public MCDate mrp_mfg_end_schd_dt() {
		return ord().mrp_mfg_end_schd_dt();
	}

	/**
	 * Scheduled mfg. end date (MRP) 製造終了予定日（ＭＲＰ）.<p>
	 *
	 */
	public void mrp_mfg_end_schd_dt(MCDate value) {
		ord().mrp_mfg_end_schd_dt(value);
	}

	/**
	 * Mfg. LT (MRP) 製造ＬＴ（ＭＲＰ）.<p>
	 *
	 */
	public MCNumber mrp_mfg_lt() {
		return ord().mrp_mfg_lt();
	}

	/**
	 * Mfg. LT (MRP) 製造ＬＴ（ＭＲＰ）.<p>
	 *
	 */
	public void mrp_mfg_lt(MCNumber value) {
		ord().mrp_mfg_lt(value);
	}

	/**
	 * Mfg. LT (MRP) 製造ＬＴ（ＭＲＰ）.<p>
	 *
	 */
	public void mrp_mfg_lt(int value) {
		ord().mrp_mfg_lt(value);
	}

	/**
	 * Mfg. LT (MRP) 製造ＬＴ（ＭＲＰ）.<p>
	 *
	 */
	public void mrp_mfg_lt(long value) {
		ord().mrp_mfg_lt(value);
	}

	/**
	 * Mfg. LT (MRP) 製造ＬＴ（ＭＲＰ）.<p>
	 *
	 */
	public void mrp_mfg_lt(float value) {
		ord().mrp_mfg_lt(value);
	}

	/**
	 * Mfg. LT (MRP) 製造ＬＴ（ＭＲＰ）.<p>
	 *
	 */
	public void mrp_mfg_lt(double value) {
		ord().mrp_mfg_lt(value);
	}

	/**
	 * Mfg. LT 製造ＬＴ.<p>
	 *
	 */
	public MCNumber mfg_lt() {
		return ord().mfg_lt();
	}

	/**
	 * Mfg. LT 製造ＬＴ.<p>
	 *
	 */
	public void mfg_lt(MCNumber value) {
		ord().mfg_lt(value);
	}

	/**
	 * Mfg. LT 製造ＬＴ.<p>
	 *
	 */
	public void mfg_lt(int value) {
		ord().mfg_lt(value);
	}

	/**
	 * Mfg. LT 製造ＬＴ.<p>
	 *
	 */
	public void mfg_lt(long value) {
		ord().mfg_lt(value);
	}

	/**
	 * Mfg. LT 製造ＬＴ.<p>
	 *
	 */
	public void mfg_lt(float value) {
		ord().mfg_lt(value);
	}

	/**
	 * Mfg. LT 製造ＬＴ.<p>
	 *
	 */
	public void mfg_lt(double value) {
		ord().mfg_lt(value);
	}

	/**
	 * Scheduled GI date 出庫予定日.<p>
	 *
	 */
	public MCDate gi_schd_dt() {
		return ord().gi_schd_dt();
	}

	/**
	 * Scheduled GI date 出庫予定日.<p>
	 *
	 */
	public void gi_schd_dt(MCDate value) {
		ord().gi_schd_dt(value);
	}

	/**
	 * Scheduled GI date (MRP) 出庫予定日（ＭＲＰ）.<p>
	 *
	 */
	public MCDate mrp_gi_schd_dt() {
		return ord().mrp_gi_schd_dt();
	}

	/**
	 * Scheduled GI date (MRP) 出庫予定日（ＭＲＰ）.<p>
	 *
	 */
	public void mrp_gi_schd_dt(MCDate value) {
		ord().mrp_gi_schd_dt(value);
	}

	/**
	 * Scheduled storage completion date 格納完了予定日.<p>
	 *
	 */
	public MCDate strg_schd_dt() {
		return ord().strg_schd_dt();
	}

	/**
	 * Scheduled storage completion date 格納完了予定日.<p>
	 *
	 */
	public void strg_schd_dt(MCDate value) {
		ord().strg_schd_dt(value);
	}

	/**
	 * Scheduled storage completion date (MRP) 格納完了予定日（ＭＲＰ）.<p>
	 *
	 */
	public MCDate mrp_strg_schd_dt() {
		return ord().mrp_strg_schd_dt();
	}

	/**
	 * Scheduled storage completion date (MRP) 格納完了予定日（ＭＲＰ）.<p>
	 *
	 */
	public void mrp_strg_schd_dt(MCDate value) {
		ord().mrp_strg_schd_dt(value);
	}

	/**
	 * Movement LT 移動ＬＴ.<p>
	 *
	 */
	public MCNumber xfr_lt() {
		return ord().xfr_lt();
	}

	/**
	 * Movement LT 移動ＬＴ.<p>
	 *
	 */
	public void xfr_lt(MCNumber value) {
		ord().xfr_lt(value);
	}

	/**
	 * Movement LT 移動ＬＴ.<p>
	 *
	 */
	public void xfr_lt(int value) {
		ord().xfr_lt(value);
	}

	/**
	 * Movement LT 移動ＬＴ.<p>
	 *
	 */
	public void xfr_lt(long value) {
		ord().xfr_lt(value);
	}

	/**
	 * Movement LT 移動ＬＴ.<p>
	 *
	 */
	public void xfr_lt(float value) {
		ord().xfr_lt(value);
	}

	/**
	 * Movement LT 移動ＬＴ.<p>
	 *
	 */
	public void xfr_lt(double value) {
		ord().xfr_lt(value);
	}

	/**
	 * Scheduled acceptance date 検収予定日.<p>
	 *
	 */
	public MCDate accpt_schd_dt() {
		return ord().accpt_schd_dt();
	}

	/**
	 * Scheduled acceptance date 検収予定日.<p>
	 *
	 */
	public void accpt_schd_dt(MCDate value) {
		ord().accpt_schd_dt(value);
	}

	/**
	 * Scheduled acceptance date (MRP) 検収予定日（ＭＲＰ）.<p>
	 *
	 */
	public MCDate mrp_accpt_schd_dt() {
		return ord().mrp_accpt_schd_dt();
	}

	/**
	 * Scheduled acceptance date (MRP) 検収予定日（ＭＲＰ）.<p>
	 *
	 */
	public void mrp_accpt_schd_dt(MCDate value) {
		ord().mrp_accpt_schd_dt(value);
	}

	/**
	 * Acceptance LT 検収ＬＴ.<p>
	 *
	 */
	public MCNumber accpt_insp_lt() {
		return ord().accpt_insp_lt();
	}

	/**
	 * Acceptance LT 検収ＬＴ.<p>
	 *
	 */
	public void accpt_insp_lt(MCNumber value) {
		ord().accpt_insp_lt(value);
	}

	/**
	 * Acceptance LT 検収ＬＴ.<p>
	 *
	 */
	public void accpt_insp_lt(int value) {
		ord().accpt_insp_lt(value);
	}

	/**
	 * Acceptance LT 検収ＬＴ.<p>
	 *
	 */
	public void accpt_insp_lt(long value) {
		ord().accpt_insp_lt(value);
	}

	/**
	 * Acceptance LT 検収ＬＴ.<p>
	 *
	 */
	public void accpt_insp_lt(float value) {
		ord().accpt_insp_lt(value);
	}

	/**
	 * Acceptance LT 検収ＬＴ.<p>
	 *
	 */
	public void accpt_insp_lt(double value) {
		ord().accpt_insp_lt(value);
	}

	/**
	 * Scheduled inspection start date 検査着手予定日.<p>
	 *
	 */
	public MCDate insp_st_schd_dt() {
		return ord().insp_st_schd_dt();
	}

	/**
	 * Scheduled inspection start date 検査着手予定日.<p>
	 *
	 */
	public void insp_st_schd_dt(MCDate value) {
		ord().insp_st_schd_dt(value);
	}

	/**
	 * Scheduled inspection start date (MRP) 検査着手予定日（ＭＲＰ）.<p>
	 *
	 */
	public MCDate mrp_insp_st_schd_dt() {
		return ord().mrp_insp_st_schd_dt();
	}

	/**
	 * Scheduled inspection start date (MRP) 検査着手予定日（ＭＲＰ）.<p>
	 *
	 */
	public void mrp_insp_st_schd_dt(MCDate value) {
		ord().mrp_insp_st_schd_dt(value);
	}

	/**
	 * Scheduled inspection end date 検査終了予定日.<p>
	 *
	 */
	public MCDate insp_end_schd_dt() {
		return ord().insp_end_schd_dt();
	}

	/**
	 * Scheduled inspection end date 検査終了予定日.<p>
	 *
	 */
	public void insp_end_schd_dt(MCDate value) {
		ord().insp_end_schd_dt(value);
	}

	/**
	 * Scheduled inspection end date (MRP) 検査終了予定日（ＭＲＰ）.<p>
	 *
	 */
	public MCDate mrp_insp_end_schd_dt() {
		return ord().mrp_insp_end_schd_dt();
	}

	/**
	 * Scheduled inspection end date (MRP) 検査終了予定日（ＭＲＰ）.<p>
	 *
	 */
	public void mrp_insp_end_schd_dt(MCDate value) {
		ord().mrp_insp_end_schd_dt(value);
	}

	/**
	 * Inspection LT 検査ＬＴ.<p>
	 *
	 */
	public MCNumber insp_lt() {
		return ord().insp_lt();
	}

	/**
	 * Inspection LT 検査ＬＴ.<p>
	 *
	 */
	public void insp_lt(MCNumber value) {
		ord().insp_lt(value);
	}

	/**
	 * Inspection LT 検査ＬＴ.<p>
	 *
	 */
	public void insp_lt(int value) {
		ord().insp_lt(value);
	}

	/**
	 * Inspection LT 検査ＬＴ.<p>
	 *
	 */
	public void insp_lt(long value) {
		ord().insp_lt(value);
	}

	/**
	 * Inspection LT 検査ＬＴ.<p>
	 *
	 */
	public void insp_lt(float value) {
		ord().insp_lt(value);
	}

	/**
	 * Inspection LT 検査ＬＴ.<p>
	 *
	 */
	public void insp_lt(double value) {
		ord().insp_lt(value);
	}

	/**
	 * Inspection offset 検査オフセット.<p>
	 *
	 */
	public MCNumber insp_offst() {
		return ord().insp_offst();
	}

	/**
	 * Inspection offset 検査オフセット.<p>
	 *
	 */
	public void insp_offst(MCNumber value) {
		ord().insp_offst(value);
	}

	/**
	 * Inspection offset 検査オフセット.<p>
	 *
	 */
	public void insp_offst(int value) {
		ord().insp_offst(value);
	}

	/**
	 * Inspection offset 検査オフセット.<p>
	 *
	 */
	public void insp_offst(long value) {
		ord().insp_offst(value);
	}

	/**
	 * Inspection offset 検査オフセット.<p>
	 *
	 */
	public void insp_offst(float value) {
		ord().insp_offst(value);
	}

	/**
	 * Inspection offset 検査オフセット.<p>
	 *
	 */
	public void insp_offst(double value) {
		ord().insp_offst(value);
	}

	/**
	 * Available date 使用可能予定日.<p>
	 *
	 */
	public MCDate avl_schd_dt() {
		return ord().avl_schd_dt();
	}

	/**
	 * Available date 使用可能予定日.<p>
	 *
	 */
	public void avl_schd_dt(MCDate value) {
		ord().avl_schd_dt(value);
	}

	/**
	 * Available date (MRP) 使用可能予定日（ＭＲＰ）.<p>
	 *
	 */
	public MCDate mrp_avl_schd_dt() {
		return ord().mrp_avl_schd_dt();
	}

	/**
	 * Available date (MRP) 使用可能予定日（ＭＲＰ）.<p>
	 *
	 */
	public void mrp_avl_schd_dt(MCDate value) {
		ord().mrp_avl_schd_dt(value);
	}

	/**
	 * Master application date マスタ適用日.<p>
	 *
	 */
	public MCDate master_dt() {
		return ord().master_dt();
	}

	/**
	 * Master application date マスタ適用日.<p>
	 *
	 */
	public void master_dt(MCDate value) {
		ord().master_dt(value);
	}

	/**
	 * SEIBAN No. 1 手配ＮＯ１.<p>
	 *
	 */
	public String sno1() {
		return ord().sno1();
	}

	/**
	 * SEIBAN No. 1 手配ＮＯ１.<p>
	 *
	 */
	public void sno1(String value) {
		ord().sno1(value);
	}

	/**
	 * SEIBAN No. 1 type 手配ＮＯ１区分.<p>
	 *
	 */
	public String sno_typ1() {
		return ord().sno_typ1();
	}

	/**
	 * SEIBAN No. 1 type 手配ＮＯ１区分.<p>
	 *
	 */
	public void sno_typ1(String value) {
		ord().sno_typ1(value);
	}

	/**
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public String sno2() {
		return ord().sno2();
	}

	/**
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public void sno2(String value) {
		ord().sno2(value);
	}

	/**
	 * SEIBAN No. 2 type 手配ＮＯ２区分.<p>
	 *
	 */
	public String sno_typ2() {
		return ord().sno_typ2();
	}

	/**
	 * SEIBAN No. 2 type 手配ＮＯ２区分.<p>
	 *
	 */
	public void sno_typ2(String value) {
		ord().sno_typ2(value);
	}

	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public String sno3() {
		return ord().sno3();
	}

	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public void sno3(String value) {
		ord().sno3(value);
	}

	/**
	 * SEIBAN No. 3 type 手配ＮＯ３区分.<p>
	 *
	 */
	public String sno_typ3() {
		return ord().sno_typ3();
	}

	/**
	 * SEIBAN No. 3 type 手配ＮＯ３区分.<p>
	 *
	 */
	public void sno_typ3(String value) {
		ord().sno_typ3(value);
	}

	/**
	 * SEIBAN No. 4 手配ＮＯ４.<p>
	 *
	 */
	public String sno4() {
		return ord().sno4();
	}

	/**
	 * SEIBAN No. 4 手配ＮＯ４.<p>
	 *
	 */
	public void sno4(String value) {
		ord().sno4(value);
	}

	/**
	 * SEIBAN No. 4 type 手配ＮＯ４区分.<p>
	 *
	 */
	public String sno_typ4() {
		return ord().sno_typ4();
	}

	/**
	 * SEIBAN No. 4 type 手配ＮＯ４区分.<p>
	 *
	 */
	public void sno_typ4(String value) {
		ord().sno_typ4(value);
	}

	/**
	 * Expired date 期限切れ日.<p>
	 *
	 */
	public MCDate lmt_dt() {
		return ord().lmt_dt();
	}

	/**
	 * Expired date 期限切れ日.<p>
	 *
	 */
	public void lmt_dt(MCDate value) {
		ord().lmt_dt(value);
	}

	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public String wg_cd() {
		return ord().wg_cd();
	}

	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public void wg_cd(String value) {
		ord().wg_cd(value);
	}

	/**
	 * Disallow procurement 手配不許可.<p>
	 *
	 */
	public boolean not_fix_flg() {
		return ord().not_fix_flg();
	}

	/**
	 * Disallow procurement 手配不許可.<p>
	 *
	 */
	public void not_fix_flg(boolean value) {
		ord().not_fix_flg(value);
	}

	/**
	 * Order auto-firming period (Date) オーダ自動確定期間（日）.<p>
	 *
	 */
	public MCNumber ord_fix_pd() {
		return ord().ord_fix_pd();
	}

	/**
	 * Order auto-firming period (Date) オーダ自動確定期間（日）.<p>
	 *
	 */
	public void ord_fix_pd(MCNumber value) {
		ord().ord_fix_pd(value);
	}

	/**
	 * Order auto-firming period (Date) オーダ自動確定期間（日）.<p>
	 *
	 */
	public void ord_fix_pd(int value) {
		ord().ord_fix_pd(value);
	}

	/**
	 * Order auto-firming period (Date) オーダ自動確定期間（日）.<p>
	 *
	 */
	public void ord_fix_pd(long value) {
		ord().ord_fix_pd(value);
	}

	/**
	 * Order auto-firming period (Date) オーダ自動確定期間（日）.<p>
	 *
	 */
	public void ord_fix_pd(float value) {
		ord().ord_fix_pd(value);
	}

	/**
	 * Order auto-firming period (Date) オーダ自動確定期間（日）.<p>
	 *
	 */
	public void ord_fix_pd(double value) {
		ord().ord_fix_pd(value);
	}

	/**
	 * Requirements No. 所要ＮＯ.<p>
	 *
	 */
	public String rqmt_no() {
		return ord().rqmt_no();
	}

	/**
	 * Requirements No. 所要ＮＯ.<p>
	 *
	 */
	public void rqmt_no(String value) {
		ord().rqmt_no(value);
	}

	/**
	 * Order/PO contact remarks 指図・発注連絡備考.<p>
	 *
	 */
	public String inst_po_cnt_rmrks() {
		return ord().inst_po_cnt_rmrks();
	}

	/**
	 * Order/PO contact remarks 指図・発注連絡備考.<p>
	 *
	 */
	public void inst_po_cnt_rmrks(String value) {
		ord().inst_po_cnt_rmrks(value);
	}

	/**
	 * Simulation No. シミュレーションＮＯ.<p>
	 *
	 */
	public String sim_mrp_no() {
		return ord().sim_mrp_no();
	}

	/**
	 * Simulation No. シミュレーションＮＯ.<p>
	 *
	 */
	public void sim_mrp_no(String value) {
		ord().sim_mrp_no(value);
	}

	/**
	 * GR/GI progress management No. 受払進捗管理ＮＯ.<p>
	 *
	 */
	public String io_schd_pr_no() {
		return ord().io_schd_pr_no();
	}

	/**
	 * GR/GI progress management No. 受払進捗管理ＮＯ.<p>
	 *
	 */
	public void io_schd_pr_no(String value) {
		ord().io_schd_pr_no(value);
	}

	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public String intr_rmrks() {
		return ord().intr_rmrks();
	}

	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public void intr_rmrks(String value) {
		ord().intr_rmrks(value);
	}

	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public String sub_char1() {
		return ord().sub_char1();
	}

	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public void sub_char1(String value) {
		ord().sub_char1(value);
	}

	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public String sub_char2() {
		return ord().sub_char2();
	}

	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public void sub_char2(String value) {
		ord().sub_char2(value);
	}

	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public String sub_char3() {
		return ord().sub_char3();
	}

	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public void sub_char3(String value) {
		ord().sub_char3(value);
	}

	/**
	 * Item order at mfg. order status type 製造指図時品目オーダ状況区分.<p>
	 *
	 */
	public String inst_itm_ord_sts_typ() {
		return ord().inst_itm_ord_sts_typ();
	}

	/**
	 * Item order at mfg. order status type 製造指図時品目オーダ状況区分.<p>
	 *
	 */
	public void inst_itm_ord_sts_typ(String value) {
		ord().inst_itm_ord_sts_typ(value);
	}

	/**
	 * Order import オーダ受信.<p>
	 *
	 */
	public boolean ord_rcv_flg() {
		return ord().ord_rcv_flg();
	}

	/**
	 * Order import オーダ受信.<p>
	 *
	 */
	public void ord_rcv_flg(boolean value) {
		ord().ord_rcv_flg(value);
	}

	/**
	 * Export Order オーダ送信.<p>
	 *
	 */
	public boolean ord_snd_flg() {
		return ord().ord_snd_flg();
	}

	/**
	 * Export Order オーダ送信.<p>
	 *
	 */
	public void ord_snd_flg(boolean value) {
		ord().ord_snd_flg(value);
	}

	/**
	 * External system cd. 外部システムＣＤ.<p>
	 *
	 */
	public String ext_sys_cd() {
		return ord().ext_sys_cd();
	}

	/**
	 * External system cd. 外部システムＣＤ.<p>
	 *
	 */
	public void ext_sys_cd(String value) {
		ord().ext_sys_cd(value);
	}

	/**
	 * External item order No. 外部品目オーダＮＯ.<p>
	 *
	 */
	public String ext_itm_ord_no() {
		return ord().ext_itm_ord_no();
	}

	/**
	 * External item order No. 外部品目オーダＮＯ.<p>
	 *
	 */
	public void ext_itm_ord_no(String value) {
		ord().ext_itm_ord_no(value);
	}

	/**
	 * Scheduler frozen target スケジューラ凍結対象.<p>
	 *
	 */
	public boolean for_scheduler_frozen_flg() {
		return ord().for_scheduler_frozen_flg();
	}

	/**
	 * Scheduler frozen target スケジューラ凍結対象.<p>
	 *
	 */
	public void for_scheduler_frozen_flg(boolean value) {
		ord().for_scheduler_frozen_flg(value);
	}

}

