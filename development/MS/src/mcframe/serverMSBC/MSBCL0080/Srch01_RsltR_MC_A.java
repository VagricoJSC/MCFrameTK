package mcframe.serverMSBC.MSBCL0080;

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
 * ブロック"Srch01_Rslt"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class Srch01_RsltR_MC_A extends MCConstRow {

	/**
	 * Item order No. 品目オーダＮＯ.<p>
	 *
	 */
	public static final String $itm_ord_no = "itm_ord_no";
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
	 * Item status 品目状況.<p>
	 *
	 */
	public static final String $itm_ord_sts_typ = "itm_ord_sts_typ";
	/**
	 * Item status name 品目状況名.<p>
	 *
	 */
	public static final String $itm_ord_sts_typ_nm = "itm_ord_sts_typ_nm";
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
	 * Version No. 版ＮＯ.<p>
	 *
	 */
	public static final String $ver_no = "ver_no";
	/**
	 * Aggregation まとめ.<p>
	 *
	 */
	public static final String $bndl_flg = "bndl_flg";
	/**
	 * Order scheduled qty. 指図予定数量.<p>
	 *
	 */
	public static final String $inst_qty = "inst_qty";
	/**
	 * Output scheduled qty. 出来高予定数量.<p>
	 *
	 */
	public static final String $yield_schd_qty = "yield_schd_qty";
	/**
	 * Output scheduled qty. (Order/PO) 出来高予定数量（指図・発注）.<p>
	 *
	 */
	public static final String $inst_yield_schd_qty = "inst_yield_schd_qty";
	/**
	 * Receipt/output result qty. 入荷・出来高実績数量.<p>
	 *
	 */
	public static final String $yield_act_qty = "yield_act_qty";
	/**
	 * Purchase result qty. 仕入実績数量.<p>
	 *
	 */
	public static final String $purc_act_qty = "purc_act_qty";
	/**
	 * Inspection result qty. 検査実績数量.<p>
	 *
	 */
	public static final String $insp_act_qty = "insp_act_qty";
	/**
	 * Remaining receipt/output 入荷・出来高残数.<p>
	 *
	 */
	public static final String $yield_remain_qty = "yield_remain_qty";
	/**
	 * Remaining purchase qty. 仕入残数.<p>
	 *
	 */
	public static final String $purc_remain_qty = "purc_remain_qty";
	/**
	 * Remaining inspection qty. 検査残数.<p>
	 *
	 */
	public static final String $insp_remain_qty = "insp_remain_qty";
	/**
	 * Allocation scheduled qty. 引当予定数量.<p>
	 *
	 */
	public static final String $schd_alloc_qty = "schd_alloc_qty";
	/**
	 * Surplus qty. 余剰数量.<p>
	 *
	 */
	public static final String $surplus_qty = "surplus_qty";
	/**
	 * Cancelled remaining qty. 打切数量.<p>
	 *
	 */
	public static final String $abort_qty = "abort_qty";
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
	 * Receipt/output progress rate 入荷・出来高進捗率.<p>
	 *
	 */
	public static final String $arr_yield_rate = "arr_yield_rate";
	/**
	 * Purchase progress rate 仕入進捗率.<p>
	 *
	 */
	public static final String $purc_rate = "purc_rate";
	/**
	 * Active ingredient (Order scheduled qty.) 有効成分(指図予定数量).<p>
	 *
	 */
	public static final String $cont_fctr_inst_qty = "cont_fctr_inst_qty";
	/**
	 * Active ingredient (Output scheduled qty.) 有効成分(出来高予定数量).<p>
	 *
	 */
	public static final String $cont_fctr_schd_yield_qty = "cont_fctr_schd_yield_qty";
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
	 * Scheduled PO date (MRP) 発注予定日（ＭＲＰ）.<p>
	 *
	 */
	public static final String $mrp_po_schd_dt = "mrp_po_schd_dt";
	/**
	 * Scheduled PO date 発注予定日.<p>
	 *
	 */
	public static final String $po_schd_dt = "po_schd_dt";
	/**
	 * PO date 発注日.<p>
	 *
	 */
	public static final String $latest_po_d_dt = "latest_po_d_dt";
	/**
	 * Scheduled GI date (MRP) 出庫予定日（ＭＲＰ）.<p>
	 *
	 */
	public static final String $mrp_gi_schd_dt = "mrp_gi_schd_dt";
	/**
	 * Scheduled GI date 出庫予定日.<p>
	 *
	 */
	public static final String $gi_schd_dt = "gi_schd_dt";
	/**
	 * Scheduled GI date (Order) 出庫予定日（指図）.<p>
	 *
	 */
	public static final String $inst_gi_schd_dt = "inst_gi_schd_dt";
	/**
	 * GI date 出庫日.<p>
	 *
	 */
	public static final String $latest_gi_act_dt = "latest_gi_act_dt";
	/**
	 * Scheduled mfg. start date (MRP) 製造着手予定日（ＭＲＰ）.<p>
	 *
	 */
	public static final String $mrp_mfg_st_schd_dt = "mrp_mfg_st_schd_dt";
	/**
	 * Scheduled mfg. start date 製造着手予定日.<p>
	 *
	 */
	public static final String $mfg_st_schd_dt = "mfg_st_schd_dt";
	/**
	 * Scheduled mfg. start date (Order) 製造着手予定日（指図）.<p>
	 *
	 */
	public static final String $inst_mfg_st_schd_dt = "inst_mfg_st_schd_dt";
	/**
	 * Mfg. start date 製造着手日.<p>
	 *
	 */
	public static final String $latest_mfg_st_act_dt = "latest_mfg_st_act_dt";
	/**
	 * Scheduled mfg. end date (MRP) 製造終了予定日（ＭＲＰ）.<p>
	 *
	 */
	public static final String $mrp_mfg_end_schd_dt = "mrp_mfg_end_schd_dt";
	/**
	 * Scheduled mfg. end date 製造終了予定日.<p>
	 *
	 */
	public static final String $mfg_end_schd_dt = "mfg_end_schd_dt";
	/**
	 * Scheduled mfg. end date (Order) 製造終了予定日（指図）.<p>
	 *
	 */
	public static final String $inst_mfg_end_schd_dt = "inst_mfg_end_schd_dt";
	/**
	 * Mfg. end date 製造終了日.<p>
	 *
	 */
	public static final String $latest_mfg_end_act_dt = "latest_mfg_end_act_dt";
	/**
	 * Mfg. LT (MRP) 製造ＬＴ（ＭＲＰ）.<p>
	 *
	 */
	public static final String $mrp_mfg_lt = "mrp_mfg_lt";
	/**
	 * Mfg. LT 製造ＬＴ.<p>
	 *
	 */
	public static final String $mfg_lt = "mfg_lt";
	/**
	 * Mfg. LT (Result) 製造ＬＴ（実績）.<p>
	 *
	 */
	public static final String $act_mfg_lt = "act_mfg_lt";
	/**
	 * Scheduled storage completion date (MRP) 格納完了予定日（ＭＲＰ）.<p>
	 *
	 */
	public static final String $mrp_strg_schd_dt = "mrp_strg_schd_dt";
	/**
	 * Scheduled storage completion date 格納完了予定日.<p>
	 *
	 */
	public static final String $strg_schd_dt = "strg_schd_dt";
	/**
	 * Scheduled storage completion date (Order/PO) 格納完了予定日（指図・発注）.<p>
	 *
	 */
	public static final String $inst_strg_schd_dt = "inst_strg_schd_dt";
	/**
	 * Storage date 格納日.<p>
	 *
	 */
	public static final String $latest_strg_act_dt = "latest_strg_act_dt";
	/**
	 * Purchase LT (MRP) 購入ＬＴ（ＭＲＰ）.<p>
	 *
	 */
	public static final String $mrp_purc_lt = "mrp_purc_lt";
	/**
	 * Purchase LT 購入ＬＴ.<p>
	 *
	 */
	public static final String $purc_lt = "purc_lt";
	/**
	 * Purchase LT (Result) 購入ＬＴ（実績）.<p>
	 *
	 */
	public static final String $act_purc_lt = "act_purc_lt";
	/**
	 * Scheduled acceptance date (MRP) 検収予定日（ＭＲＰ）.<p>
	 *
	 */
	public static final String $mrp_accpt_schd_dt = "mrp_accpt_schd_dt";
	/**
	 * Scheduled acceptance date 検収予定日.<p>
	 *
	 */
	public static final String $accpt_schd_dt = "accpt_schd_dt";
	/**
	 * Scheduled acceptance date (PO) 検収予定日（発注）.<p>
	 *
	 */
	public static final String $inst_accpt_schd_dt = "inst_accpt_schd_dt";
	/**
	 * Acceptance date 検収日.<p>
	 *
	 */
	public static final String $latest_accpt_act_dt = "latest_accpt_act_dt";
	/**
	 * Scheduled inspection start date (MRP) 検査着手予定日（ＭＲＰ）.<p>
	 *
	 */
	public static final String $mrp_insp_st_schd_dt = "mrp_insp_st_schd_dt";
	/**
	 * Scheduled inspection start date 検査着手予定日.<p>
	 *
	 */
	public static final String $insp_st_schd_dt = "insp_st_schd_dt";
	/**
	 * Scheduled inspection start date (Order/PO) 検査着手予定日（指図・発注）.<p>
	 *
	 */
	public static final String $inst_insp_st_schd_dt = "inst_insp_st_schd_dt";
	/**
	 * Inspection start date 検査着手日.<p>
	 *
	 */
	public static final String $latest_insp_st_act_dt = "latest_insp_st_act_dt";
	/**
	 * Scheduled inspection end date (MRP) 検査終了予定日（ＭＲＰ）.<p>
	 *
	 */
	public static final String $mrp_insp_end_schd_dt = "mrp_insp_end_schd_dt";
	/**
	 * Scheduled inspection end date 検査終了予定日.<p>
	 *
	 */
	public static final String $insp_end_schd_dt = "insp_end_schd_dt";
	/**
	 * Scheduled inspection end date (Order/PO) 検査終了予定日（指図・発注）.<p>
	 *
	 */
	public static final String $inst_insp_end_schd_dt = "inst_insp_end_schd_dt";
	/**
	 * Inspection end date 検査終了日.<p>
	 *
	 */
	public static final String $latest_insp_end_act_dt = "latest_insp_end_act_dt";
	/**
	 * Available date (MRP) 使用可能予定日（ＭＲＰ）.<p>
	 *
	 */
	public static final String $mrp_avl_schd_dt = "mrp_avl_schd_dt";
	/**
	 * Available date 使用可能予定日.<p>
	 *
	 */
	public static final String $avl_schd_dt = "avl_schd_dt";
	/**
	 * Available date (Order/PO) 使用可能予定日（指図・発注）.<p>
	 *
	 */
	public static final String $po_avl_schd_dt = "po_avl_schd_dt";
	/**
	 * Available date 使用可能日.<p>
	 *
	 */
	public static final String $avl_dt = "avl_dt";
	/**
	 * Available date (GR/GI schedule) 使用可能予定日（受払予定）.<p>
	 *
	 */
	public static final String $io_avl_schd_dt = "io_avl_schd_dt";
	/**
	 * Delay expectation 遅れ見込.<p>
	 *
	 */
	public static final String $delay_expt_flg = "delay_expt_flg";
	/**
	 * Scheduled allocation date 引当予定日.<p>
	 *
	 */
	public static final String $schd_so_dt = "schd_so_dt";
	/**
	 * Extra days for scheduled usage 使用予定余裕日数.<p>
	 *
	 */
	public static final String $margin_days = "margin_days";
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
	 * Operation pattern 工程パタン.<p>
	 *
	 */
	public static final String $oper_ptn = "oper_ptn";
	/**
	 * BOM pattern 構成パタン.<p>
	 *
	 */
	public static final String $bom_ptn = "bom_ptn";
	/**
	 * Requirements No. 所要ＮＯ.<p>
	 *
	 */
	public static final String $rqmt_no = "rqmt_no";
	/**
	 * Disallow procurement 手配不許可.<p>
	 *
	 */
	public static final String $not_fix_flg = "not_fix_flg";
	/**
	 * SEIBAN No. 1 手配ＮＯ１.<p>
	 *
	 */
	public static final String $sno1 = "sno1";
	/**
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public static final String $sno2 = "sno2";
	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public static final String $sno3 = "sno3";
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
	 * Order generation type オーダ生成区分.<p>
	 *
	 */
	public static final String $ord_gnrt_typ = "ord_gnrt_typ";
	/**
	 * Order generation type name オーダ生成区分名.<p>
	 *
	 */
	public static final String $ord_gnrt_typ_nm = "ord_gnrt_typ_nm";
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
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public static final String $intr_rmrks = "intr_rmrks";
	/**
	 * Firm date 確定日.<p>
	 *
	 */
	public static final String $fix_dt = "fix_dt";
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
	 * Order import オーダ受信.<p>
	 *
	 */
	public static final String $ord_rcv_flg = "ord_rcv_flg";
	/**
	 * Export Order オーダ送信.<p>
	 *
	 */
	public static final String $ord_snd_flg = "ord_snd_flg";
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
	 * External item order No. 外部品目オーダＮＯ.<p>
	 *
	 */
	public static final String $ext_itm_ord_no = "ext_itm_ord_no";
	/**
	 * Scheduler frozen target スケジューラ凍結対象.<p>
	 *
	 */
	public static final String $for_scheduler_frozen_flg = "for_scheduler_frozen_flg";
	/**
	 * Scheduler frozen スケジューラ凍結.<p>
	 *
	 */
	public static final String $scheduler_frozen_flg = "scheduler_frozen_flg";
	/**
	 * Shortage of required qty. 必要数量不足.<p>
	 *
	 */
	public static final String $schd_yield_red_flg = "schd_yield_red_flg";
	/**
	 * Start date delayed 着手日遅れ.<p>
	 *
	 */
	public static final String $st_dt_red_flg = "st_dt_red_flg";
	/**
	 * End date delayed 終了日遅れ.<p>
	 *
	 */
	public static final String $end_dt_red_flg = "end_dt_red_flg";
	/**
	 * Available date delayed 使用可能予定日遅れ.<p>
	 *
	 */
	public static final String $avl_schd_dt_red_flg = "avl_schd_dt_red_flg";
	/**
	 * Allocation schedule delayed 引当予定遅れ.<p>
	 *
	 */
	public static final String $alloc_pln_red_flg = "alloc_pln_red_flg";
	/**
	 * Surplus order 余剰オーダ.<p>
	 *
	 */
	public static final String $surplus_ord_flg = "surplus_ord_flg";
	/**
	 * No abnormality 異常なし.<p>
	 *
	 */
	public static final String $no_problem_flg = "no_problem_flg";
	/**
	 * Item classification cd. 1 品目分類ＣＤ１.<p>
	 *
	 */
	public static final String $itm_grp_cd1 = "itm_grp_cd1";
	/**
	 * Item classification name 1 品目分類名１.<p>
	 *
	 */
	public static final String $itm_grp_nm1 = "itm_grp_nm1";
	/**
	 * Item classification cd. 2 品目分類ＣＤ２.<p>
	 *
	 */
	public static final String $itm_grp_cd2 = "itm_grp_cd2";
	/**
	 * Item classification name 2 品目分類名２.<p>
	 *
	 */
	public static final String $itm_grp_nm2 = "itm_grp_nm2";
	/**
	 * Item classification cd. 3 品目分類ＣＤ３.<p>
	 *
	 */
	public static final String $itm_grp_cd3 = "itm_grp_cd3";
	/**
	 * Item classification name 3 品目分類名３.<p>
	 *
	 */
	public static final String $itm_grp_nm3 = "itm_grp_nm3";
	/**
	 * Item classification cd. 4 品目分類ＣＤ４.<p>
	 *
	 */
	public static final String $itm_grp_cd4 = "itm_grp_cd4";
	/**
	 * Item classification name 4 品目分類名４.<p>
	 *
	 */
	public static final String $itm_grp_nm4 = "itm_grp_nm4";
	/**
	 * Item classification cd. 5 品目分類ＣＤ５.<p>
	 *
	 */
	public static final String $itm_grp_cd5 = "itm_grp_cd5";
	/**
	 * Item classification name 5 品目分類名５.<p>
	 *
	 */
	public static final String $itm_grp_nm5 = "itm_grp_nm5";
	/**
	 * Item classification cd. 6 品目分類ＣＤ６.<p>
	 *
	 */
	public static final String $itm_grp_cd6 = "itm_grp_cd6";
	/**
	 * Item classification name 6 品目分類名６.<p>
	 *
	 */
	public static final String $itm_grp_nm6 = "itm_grp_nm6";
	/**
	 * Item classification cd. 7 品目分類ＣＤ７.<p>
	 *
	 */
	public static final String $itm_grp_cd7 = "itm_grp_cd7";
	/**
	 * Item classification name 7 品目分類名７.<p>
	 *
	 */
	public static final String $itm_grp_nm7 = "itm_grp_nm7";
	/**
	 * Item classification cd. 8 品目分類ＣＤ８.<p>
	 *
	 */
	public static final String $itm_grp_cd8 = "itm_grp_cd8";
	/**
	 * Item classification name 8 品目分類名８.<p>
	 *
	 */
	public static final String $itm_grp_nm8 = "itm_grp_nm8";
	/**
	 * Item classification cd. 9 品目分類ＣＤ９.<p>
	 *
	 */
	public static final String $itm_grp_cd9 = "itm_grp_cd9";
	/**
	 * Item classification name 9 品目分類名９.<p>
	 *
	 */
	public static final String $itm_grp_nm9 = "itm_grp_nm9";
	/**
	 * Item classification cd. 10 品目分類ＣＤ１０.<p>
	 *
	 */
	public static final String $itm_grp_cd10 = "itm_grp_cd10";
	/**
	 * Item classification name 10 品目分類名１０.<p>
	 *
	 */
	public static final String $itm_grp_nm10 = "itm_grp_nm10";
	/**
	 * Supplier classification cd. 1 発注先分類ＣＤ１.<p>
	 *
	 */
	public static final String $sppl_grp_cd1 = "sppl_grp_cd1";
	/**
	 * Supplier classification name 1 発注先分類名１.<p>
	 *
	 */
	public static final String $sppl_grp_nm1 = "sppl_grp_nm1";
	/**
	 * Supplier classification cd. 2 発注先分類ＣＤ２.<p>
	 *
	 */
	public static final String $sppl_grp_cd2 = "sppl_grp_cd2";
	/**
	 * Supplier classification name 2 発注先分類名２.<p>
	 *
	 */
	public static final String $sppl_grp_nm2 = "sppl_grp_nm2";
	/**
	 * Supplier classification cd. 3 発注先分類ＣＤ３.<p>
	 *
	 */
	public static final String $sppl_grp_cd3 = "sppl_grp_cd3";
	/**
	 * Supplier classification name 3 発注先分類名３.<p>
	 *
	 */
	public static final String $sppl_grp_nm3 = "sppl_grp_nm3";
	/**
	 * Supplier classification cd. 4 発注先分類ＣＤ４.<p>
	 *
	 */
	public static final String $sppl_grp_cd4 = "sppl_grp_cd4";
	/**
	 * Supplier classification name 4 発注先分類名４.<p>
	 *
	 */
	public static final String $sppl_grp_nm4 = "sppl_grp_nm4";
	/**
	 * Supplier classification cd. 5 発注先分類ＣＤ５.<p>
	 *
	 */
	public static final String $sppl_grp_cd5 = "sppl_grp_cd5";
	/**
	 * Supplier classification name 5 発注先分類名５.<p>
	 *
	 */
	public static final String $sppl_grp_nm5 = "sppl_grp_nm5";
	/**
	 * Supplier classification cd. 6 発注先分類ＣＤ６.<p>
	 *
	 */
	public static final String $sppl_grp_cd6 = "sppl_grp_cd6";
	/**
	 * Supplier classification name 6 発注先分類名６.<p>
	 *
	 */
	public static final String $sppl_grp_nm6 = "sppl_grp_nm6";
	/**
	 * Supplier classification cd. 7 発注先分類ＣＤ７.<p>
	 *
	 */
	public static final String $sppl_grp_cd7 = "sppl_grp_cd7";
	/**
	 * Supplier classification name 7 発注先分類名７.<p>
	 *
	 */
	public static final String $sppl_grp_nm7 = "sppl_grp_nm7";
	/**
	 * Supplier classification cd. 8 発注先分類ＣＤ８.<p>
	 *
	 */
	public static final String $sppl_grp_cd8 = "sppl_grp_cd8";
	/**
	 * Supplier classification name 8 発注先分類名８.<p>
	 *
	 */
	public static final String $sppl_grp_nm8 = "sppl_grp_nm8";
	/**
	 * Supplier classification cd. 9 発注先分類ＣＤ９.<p>
	 *
	 */
	public static final String $sppl_grp_cd9 = "sppl_grp_cd9";
	/**
	 * Supplier classification name 9 発注先分類名９.<p>
	 *
	 */
	public static final String $sppl_grp_nm9 = "sppl_grp_nm9";
	/**
	 * Supplier classification cd. 10 発注先分類ＣＤ１０.<p>
	 *
	 */
	public static final String $sppl_grp_cd10 = "sppl_grp_cd10";
	/**
	 * Supplier classification name 10 発注先分類名１０.<p>
	 *
	 */
	public static final String $sppl_grp_nm10 = "sppl_grp_nm10";
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
	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public static final String $dec_place = "dec_place";
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


	public static final MCMeta itm_ord_no_META = createCommonMeta($itm_ord_no, mcframe.commonMA.meta.MA_META.ITM_ORD_NO);
	public static final MCMeta itm_ord_typ_META = createCommonMeta($itm_ord_typ, mcframe.commonMS.meta.MS_META.ITM_ORD_TYP);
	public static final MCMeta itm_ord_typ_nm_META = createCommonMeta($itm_ord_typ_nm, mcframe.commonMS.meta.MS_META.ITM_ORD_TYP_NM);
	public static final MCMeta itm_ord_sts_typ_META = createCommonMeta($itm_ord_sts_typ, mcframe.commonMS.meta.MS_META.ITM_ORD_STS_TYP);
	public static final MCMeta itm_ord_sts_typ_nm_META = createCommonMeta($itm_ord_sts_typ_nm, mcframe.commonMS.meta.MS_META.ITM_ORD_STS_TYP_NM);
	public static final MCMeta itm_typ_META = createCommonMeta($itm_typ, mcframe.commonMA.meta.MA_META.ITM_TYP);
	public static final MCMeta itm_typ_nm_META = createCommonMeta($itm_typ_nm, mcframe.commonMA.meta.MA_META.ITM_TYP_NM);
	public static final MCMeta itm_typ_d_cd_META = createCommonMeta($itm_typ_d_cd, mcframe.commonMA.meta.MA_META.ITM_TYP_D_CD);
	public static final MCMeta itm_typ_d_nm_META = createCommonMeta($itm_typ_d_nm, mcframe.commonMA.meta.MA_META.ITM_TYP_D_NM);
	public static final MCMeta itm_cd_META = createCommonMeta($itm_cd, mcframe.commonMA.meta.MA_META.ITM_CD);
	public static final MCMeta itm_sub1_META = createCommonMeta($itm_sub1, mcframe.commonMA.meta.MA_META.ITM_SUB1);
	public static final MCMeta itm_sub2_META = createCommonMeta($itm_sub2, mcframe.commonMA.meta.MA_META.ITM_SUB2);
	public static final MCMeta itm_sub3_META = createCommonMeta($itm_sub3, mcframe.commonMA.meta.MA_META.ITM_SUB3);
	public static final MCMeta itm_nm_META = createCommonMeta($itm_nm, mcframe.commonMA.meta.MA_META.ITM_NM);
	public static final MCMeta ver_no_META = createCommonMeta($ver_no, mcframe.commonMA.meta.MA_META.VER_NO);
	public static final MCMeta bndl_flg_META = createCommonMeta($bndl_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta inst_qty_META = createCommonMeta($inst_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta yield_schd_qty_META = createCommonMeta($yield_schd_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta inst_yield_schd_qty_META = createCommonMeta($inst_yield_schd_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta yield_act_qty_META = createCommonMeta($yield_act_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta purc_act_qty_META = createCommonMeta($purc_act_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta insp_act_qty_META = createCommonMeta($insp_act_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta yield_remain_qty_META = createCommonMeta($yield_remain_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta purc_remain_qty_META = createCommonMeta($purc_remain_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta insp_remain_qty_META = createCommonMeta($insp_remain_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta schd_alloc_qty_META = createCommonMeta($schd_alloc_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta surplus_qty_META = createCommonMeta($surplus_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta abort_qty_META = createCommonMeta($abort_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta base_unit_cd_META = createCommonMeta($base_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta base_unit_nm_META = createCommonMeta($base_unit_nm, mcframe.commonMA.meta.MA_META.UNIT_NM);
	public static final MCMeta arr_yield_rate_META = createCommonMeta($arr_yield_rate, mcframe.commonMA.meta.MA_META.RATE);
	public static final MCMeta purc_rate_META = createCommonMeta($purc_rate, mcframe.commonMA.meta.MA_META.RATE);
	public static final MCMeta cont_fctr_inst_qty_META = createCommonMeta($cont_fctr_inst_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta cont_fctr_schd_yield_qty_META = createCommonMeta($cont_fctr_schd_yield_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta cont_fctr_unit_cd_META = createCommonMeta($cont_fctr_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta cont_fctr_unit_nm_META = createCommonMeta($cont_fctr_unit_nm, mcframe.commonMA.meta.MA_META.UNIT_NM);
	public static final MCMeta std_cont_fctr_META = createCommonMeta($std_cont_fctr, mcframe.commonMA.meta.MA_META.STD_CONT_FCTR);
	public static final MCMeta mrp_po_schd_dt_META = createCommonMeta($mrp_po_schd_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta po_schd_dt_META = createCommonMeta($po_schd_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta latest_po_d_dt_META = createCommonMeta($latest_po_d_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta mrp_gi_schd_dt_META = createCommonMeta($mrp_gi_schd_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta gi_schd_dt_META = createCommonMeta($gi_schd_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta inst_gi_schd_dt_META = createCommonMeta($inst_gi_schd_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta latest_gi_act_dt_META = createCommonMeta($latest_gi_act_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta mrp_mfg_st_schd_dt_META = createCommonMeta($mrp_mfg_st_schd_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta mfg_st_schd_dt_META = createCommonMeta($mfg_st_schd_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta inst_mfg_st_schd_dt_META = createCommonMeta($inst_mfg_st_schd_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta latest_mfg_st_act_dt_META = createCommonMeta($latest_mfg_st_act_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta mrp_mfg_end_schd_dt_META = createCommonMeta($mrp_mfg_end_schd_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta mfg_end_schd_dt_META = createCommonMeta($mfg_end_schd_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta inst_mfg_end_schd_dt_META = createCommonMeta($inst_mfg_end_schd_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta latest_mfg_end_act_dt_META = createCommonMeta($latest_mfg_end_act_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta mrp_mfg_lt_META = createCommonMeta($mrp_mfg_lt, mcframe.commonMA.meta.MA_META.LT);
	public static final MCMeta mfg_lt_META = createCommonMeta($mfg_lt, mcframe.commonMA.meta.MA_META.LT);
	public static final MCMeta act_mfg_lt_META = createCommonMeta($act_mfg_lt, mcframe.commonMA.meta.MA_META.LT);
	public static final MCMeta mrp_strg_schd_dt_META = createCommonMeta($mrp_strg_schd_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta strg_schd_dt_META = createCommonMeta($strg_schd_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta inst_strg_schd_dt_META = createCommonMeta($inst_strg_schd_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta latest_strg_act_dt_META = createCommonMeta($latest_strg_act_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta mrp_purc_lt_META = createCommonMeta($mrp_purc_lt, mcframe.commonMA.meta.MA_META.LT);
	public static final MCMeta purc_lt_META = createCommonMeta($purc_lt, mcframe.commonMA.meta.MA_META.LT);
	public static final MCMeta act_purc_lt_META = createCommonMeta($act_purc_lt, mcframe.commonMA.meta.MA_META.LT);
	public static final MCMeta mrp_accpt_schd_dt_META = createCommonMeta($mrp_accpt_schd_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta accpt_schd_dt_META = createCommonMeta($accpt_schd_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta inst_accpt_schd_dt_META = createCommonMeta($inst_accpt_schd_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta latest_accpt_act_dt_META = createCommonMeta($latest_accpt_act_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta mrp_insp_st_schd_dt_META = createCommonMeta($mrp_insp_st_schd_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta insp_st_schd_dt_META = createCommonMeta($insp_st_schd_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta inst_insp_st_schd_dt_META = createCommonMeta($inst_insp_st_schd_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta latest_insp_st_act_dt_META = createCommonMeta($latest_insp_st_act_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta mrp_insp_end_schd_dt_META = createCommonMeta($mrp_insp_end_schd_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta insp_end_schd_dt_META = createCommonMeta($insp_end_schd_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta inst_insp_end_schd_dt_META = createCommonMeta($inst_insp_end_schd_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta latest_insp_end_act_dt_META = createCommonMeta($latest_insp_end_act_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta mrp_avl_schd_dt_META = createCommonMeta($mrp_avl_schd_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta avl_schd_dt_META = createCommonMeta($avl_schd_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta po_avl_schd_dt_META = createCommonMeta($po_avl_schd_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta avl_dt_META = createCommonMeta($avl_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta io_avl_schd_dt_META = createCommonMeta($io_avl_schd_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta delay_expt_flg_META = createCommonMeta($delay_expt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta schd_so_dt_META = createCommonMeta($schd_so_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta margin_days_META = createCommonMeta($margin_days, mcframe.commonMA.meta.MA_META.DAYS);
	public static final MCMeta strg_loc_cd_META = createCommonMeta($strg_loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta strg_loc_nm_META = createCommonMeta($strg_loc_nm, mcframe.commonMA.meta.MA_META.LOC_NM);
	public static final MCMeta mfg_loc_cd_META = createCommonMeta($mfg_loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta mfg_loc_nm_META = createCommonMeta($mfg_loc_nm, mcframe.commonMA.meta.MA_META.LOC_NM);
	public static final MCMeta sppl_cd_META = createCommonMeta($sppl_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta sppl_nm_META = createCommonMeta($sppl_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta maker_cd_META = createCommonMeta($maker_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta maker_nm_META = createCommonMeta($maker_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta rqst_loc_cd_META = createCommonMeta($rqst_loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta rqst_loc_nm_META = createCommonMeta($rqst_loc_nm, mcframe.commonMA.meta.MA_META.LOC_NM);
	public static final MCMeta rqst_wg_cd_META = createCommonMeta($rqst_wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta rqst_wg_nm_META = createCommonMeta($rqst_wg_nm, mcframe.commonMA.meta.MA_META.WG_NM);
	public static final MCMeta oper_ptn_META = createCommonMeta($oper_ptn, mcframe.commonMA.meta.MA_META.OPER_PTN);
	public static final MCMeta bom_ptn_META = createCommonMeta($bom_ptn, mcframe.commonMA.meta.MA_META.BOM_PTN);
	public static final MCMeta rqmt_no_META = createCommonMeta($rqmt_no, mcframe.commonMA.meta.MA_META.RQMT_NO);
	public static final MCMeta not_fix_flg_META = createCommonMeta($not_fix_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sno1_META = createCommonMeta($sno1, mcframe.commonMA.meta.MA_META.SNO1);
	public static final MCMeta sno2_META = createCommonMeta($sno2, mcframe.commonMA.meta.MA_META.SNO2);
	public static final MCMeta sno3_META = createCommonMeta($sno3, mcframe.commonMA.meta.MA_META.SNO3);
	public static final MCMeta sno4_META = createCommonMeta($sno4, mcframe.commonMA.meta.MA_META.SNO4);
	public static final MCMeta wrk_no_META = createCommonMeta($wrk_no, mcframe.commonMA.meta.MA_META.WRK_NO);
	public static final MCMeta wrk_nm_META = createCommonMeta($wrk_nm, mcframe.commonMA.meta.MA_META.WRK_NM);
	public static final MCMeta ord_gnrt_typ_META = createCommonMeta($ord_gnrt_typ, mcframe.commonMS.meta.MS_META.ORD_GNRT_TYP);
	public static final MCMeta ord_gnrt_typ_nm_META = createCommonMeta($ord_gnrt_typ_nm, mcframe.commonMS.meta.MS_META.ORD_GNRT_TYP_NM);
	public static final MCMeta sim_mrp_no_META = createCommonMeta($sim_mrp_no, mcframe.commonMA.meta.MA_META.SIM_MRP_NO);
	public static final MCMeta wg_cd_META = createCommonMeta($wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta wg_nm_META = createCommonMeta($wg_nm, mcframe.commonMA.meta.MA_META.WG_NM);
	public static final MCMeta intr_rmrks_META = createCommonMeta($intr_rmrks, mcframe.commonMS.meta.MS_META.IORD_INTR_RMRKS);
	public static final MCMeta fix_dt_META = createCommonMeta($fix_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta sub_char1_META = createCommonMeta($sub_char1, mcframe.commonMS.meta.MS_META.IORD_SUB_CHAR1);
	public static final MCMeta sub_char2_META = createCommonMeta($sub_char2, mcframe.commonMS.meta.MS_META.IORD_SUB_CHAR2);
	public static final MCMeta sub_char3_META = createCommonMeta($sub_char3, mcframe.commonMS.meta.MS_META.IORD_SUB_CHAR3);
	public static final MCMeta ord_rcv_flg_META = createCommonMeta($ord_rcv_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta ord_snd_flg_META = createCommonMeta($ord_snd_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta ext_sys_cd_META = createCommonMeta($ext_sys_cd, mcframe.commonMA.meta.MA_META.EXT_SYS_CD);
	public static final MCMeta ext_sys_nm_META = createCommonMeta($ext_sys_nm, mcframe.commonMA.meta.MA_META.EXT_SYS_NM);
	public static final MCMeta ext_itm_ord_no_META = createCommonMeta($ext_itm_ord_no, mcframe.commonMA.meta.MA_META.EXT_ITM_ORD_NO);
	public static final MCMeta for_scheduler_frozen_flg_META = createCommonMeta($for_scheduler_frozen_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta scheduler_frozen_flg_META = createCommonMeta($scheduler_frozen_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta schd_yield_red_flg_META = createCommonMeta($schd_yield_red_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta st_dt_red_flg_META = createCommonMeta($st_dt_red_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta end_dt_red_flg_META = createCommonMeta($end_dt_red_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta avl_schd_dt_red_flg_META = createCommonMeta($avl_schd_dt_red_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta alloc_pln_red_flg_META = createCommonMeta($alloc_pln_red_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta surplus_ord_flg_META = createCommonMeta($surplus_ord_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta no_problem_flg_META = createCommonMeta($no_problem_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta itm_grp_cd1_META = createCommonMeta($itm_grp_cd1, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta itm_grp_nm1_META = createCommonMeta($itm_grp_nm1, mcframe.commonMA.meta.MA_META.ITM_GRP_NM);
	public static final MCMeta itm_grp_cd2_META = createCommonMeta($itm_grp_cd2, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta itm_grp_nm2_META = createCommonMeta($itm_grp_nm2, mcframe.commonMA.meta.MA_META.ITM_GRP_NM);
	public static final MCMeta itm_grp_cd3_META = createCommonMeta($itm_grp_cd3, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta itm_grp_nm3_META = createCommonMeta($itm_grp_nm3, mcframe.commonMA.meta.MA_META.ITM_GRP_NM);
	public static final MCMeta itm_grp_cd4_META = createCommonMeta($itm_grp_cd4, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta itm_grp_nm4_META = createCommonMeta($itm_grp_nm4, mcframe.commonMA.meta.MA_META.ITM_GRP_NM);
	public static final MCMeta itm_grp_cd5_META = createCommonMeta($itm_grp_cd5, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta itm_grp_nm5_META = createCommonMeta($itm_grp_nm5, mcframe.commonMA.meta.MA_META.ITM_GRP_NM);
	public static final MCMeta itm_grp_cd6_META = createCommonMeta($itm_grp_cd6, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta itm_grp_nm6_META = createCommonMeta($itm_grp_nm6, mcframe.commonMA.meta.MA_META.ITM_GRP_NM);
	public static final MCMeta itm_grp_cd7_META = createCommonMeta($itm_grp_cd7, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta itm_grp_nm7_META = createCommonMeta($itm_grp_nm7, mcframe.commonMA.meta.MA_META.ITM_GRP_NM);
	public static final MCMeta itm_grp_cd8_META = createCommonMeta($itm_grp_cd8, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta itm_grp_nm8_META = createCommonMeta($itm_grp_nm8, mcframe.commonMA.meta.MA_META.ITM_GRP_NM);
	public static final MCMeta itm_grp_cd9_META = createCommonMeta($itm_grp_cd9, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta itm_grp_nm9_META = createCommonMeta($itm_grp_nm9, mcframe.commonMA.meta.MA_META.ITM_GRP_NM);
	public static final MCMeta itm_grp_cd10_META = createCommonMeta($itm_grp_cd10, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta itm_grp_nm10_META = createCommonMeta($itm_grp_nm10, mcframe.commonMA.meta.MA_META.ITM_GRP_NM);
	public static final MCMeta sppl_grp_cd1_META = createCommonMeta($sppl_grp_cd1, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta sppl_grp_nm1_META = createCommonMeta($sppl_grp_nm1, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta sppl_grp_cd2_META = createCommonMeta($sppl_grp_cd2, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta sppl_grp_nm2_META = createCommonMeta($sppl_grp_nm2, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta sppl_grp_cd3_META = createCommonMeta($sppl_grp_cd3, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta sppl_grp_nm3_META = createCommonMeta($sppl_grp_nm3, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta sppl_grp_cd4_META = createCommonMeta($sppl_grp_cd4, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta sppl_grp_nm4_META = createCommonMeta($sppl_grp_nm4, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta sppl_grp_cd5_META = createCommonMeta($sppl_grp_cd5, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta sppl_grp_nm5_META = createCommonMeta($sppl_grp_nm5, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta sppl_grp_cd6_META = createCommonMeta($sppl_grp_cd6, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta sppl_grp_nm6_META = createCommonMeta($sppl_grp_nm6, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta sppl_grp_cd7_META = createCommonMeta($sppl_grp_cd7, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta sppl_grp_nm7_META = createCommonMeta($sppl_grp_nm7, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta sppl_grp_cd8_META = createCommonMeta($sppl_grp_cd8, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta sppl_grp_nm8_META = createCommonMeta($sppl_grp_nm8, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta sppl_grp_cd9_META = createCommonMeta($sppl_grp_cd9, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta sppl_grp_nm9_META = createCommonMeta($sppl_grp_nm9, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta sppl_grp_cd10_META = createCommonMeta($sppl_grp_cd10, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta sppl_grp_nm10_META = createCommonMeta($sppl_grp_nm10, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
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
	public static final MCMeta dec_place_META = createCommonMeta($dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta cont_fctr_flg_META = createCommonMeta($cont_fctr_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta cont_fctr_dec_place_META = createCommonMeta($cont_fctr_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta cont_fctr_rnd_typ_META = createCommonMeta($cont_fctr_rnd_typ, mcframe.commonMA.meta.MA_META.RND_TYP);

	protected static final ConstMetaList<Srch01_RsltR> constMetas = new ConstMetaList<Srch01_RsltR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			itm_ord_no_META,
			itm_ord_typ_META,
			itm_ord_typ_nm_META,
			itm_ord_sts_typ_META,
			itm_ord_sts_typ_nm_META,
			itm_typ_META,
			itm_typ_nm_META,
			itm_typ_d_cd_META,
			itm_typ_d_nm_META,
			itm_cd_META,
			itm_sub1_META,
			itm_sub2_META,
			itm_sub3_META,
			itm_nm_META,
			ver_no_META,
			bndl_flg_META,
			inst_qty_META,
			yield_schd_qty_META,
			inst_yield_schd_qty_META,
			yield_act_qty_META,
			purc_act_qty_META,
			insp_act_qty_META,
			yield_remain_qty_META,
			purc_remain_qty_META,
			insp_remain_qty_META,
			schd_alloc_qty_META,
			surplus_qty_META,
			abort_qty_META,
			base_unit_cd_META,
			base_unit_nm_META,
			arr_yield_rate_META,
			purc_rate_META,
			cont_fctr_inst_qty_META,
			cont_fctr_schd_yield_qty_META,
			cont_fctr_unit_cd_META,
			cont_fctr_unit_nm_META,
			std_cont_fctr_META,
			mrp_po_schd_dt_META,
			po_schd_dt_META,
			latest_po_d_dt_META,
			mrp_gi_schd_dt_META,
			gi_schd_dt_META,
			inst_gi_schd_dt_META,
			latest_gi_act_dt_META,
			mrp_mfg_st_schd_dt_META,
			mfg_st_schd_dt_META,
			inst_mfg_st_schd_dt_META,
			latest_mfg_st_act_dt_META,
			mrp_mfg_end_schd_dt_META,
			mfg_end_schd_dt_META,
			inst_mfg_end_schd_dt_META,
			latest_mfg_end_act_dt_META,
			mrp_mfg_lt_META,
			mfg_lt_META,
			act_mfg_lt_META,
			mrp_strg_schd_dt_META,
			strg_schd_dt_META,
			inst_strg_schd_dt_META,
			latest_strg_act_dt_META,
			mrp_purc_lt_META,
			purc_lt_META,
			act_purc_lt_META,
			mrp_accpt_schd_dt_META,
			accpt_schd_dt_META,
			inst_accpt_schd_dt_META,
			latest_accpt_act_dt_META,
			mrp_insp_st_schd_dt_META,
			insp_st_schd_dt_META,
			inst_insp_st_schd_dt_META,
			latest_insp_st_act_dt_META,
			mrp_insp_end_schd_dt_META,
			insp_end_schd_dt_META,
			inst_insp_end_schd_dt_META,
			latest_insp_end_act_dt_META,
			mrp_avl_schd_dt_META,
			avl_schd_dt_META,
			po_avl_schd_dt_META,
			avl_dt_META,
			io_avl_schd_dt_META,
			delay_expt_flg_META,
			schd_so_dt_META,
			margin_days_META,
			strg_loc_cd_META,
			strg_loc_nm_META,
			mfg_loc_cd_META,
			mfg_loc_nm_META,
			sppl_cd_META,
			sppl_nm_META,
			maker_cd_META,
			maker_nm_META,
			rqst_loc_cd_META,
			rqst_loc_nm_META,
			rqst_wg_cd_META,
			rqst_wg_nm_META,
			oper_ptn_META,
			bom_ptn_META,
			rqmt_no_META,
			not_fix_flg_META,
			sno1_META,
			sno2_META,
			sno3_META,
			sno4_META,
			wrk_no_META,
			wrk_nm_META,
			ord_gnrt_typ_META,
			ord_gnrt_typ_nm_META,
			sim_mrp_no_META,
			wg_cd_META,
			wg_nm_META,
			intr_rmrks_META,
			fix_dt_META,
			sub_char1_META,
			sub_char2_META,
			sub_char3_META,
			ord_rcv_flg_META,
			ord_snd_flg_META,
			ext_sys_cd_META,
			ext_sys_nm_META,
			ext_itm_ord_no_META,
			for_scheduler_frozen_flg_META,
			scheduler_frozen_flg_META,
			schd_yield_red_flg_META,
			st_dt_red_flg_META,
			end_dt_red_flg_META,
			avl_schd_dt_red_flg_META,
			alloc_pln_red_flg_META,
			surplus_ord_flg_META,
			no_problem_flg_META,
			itm_grp_cd1_META,
			itm_grp_nm1_META,
			itm_grp_cd2_META,
			itm_grp_nm2_META,
			itm_grp_cd3_META,
			itm_grp_nm3_META,
			itm_grp_cd4_META,
			itm_grp_nm4_META,
			itm_grp_cd5_META,
			itm_grp_nm5_META,
			itm_grp_cd6_META,
			itm_grp_nm6_META,
			itm_grp_cd7_META,
			itm_grp_nm7_META,
			itm_grp_cd8_META,
			itm_grp_nm8_META,
			itm_grp_cd9_META,
			itm_grp_nm9_META,
			itm_grp_cd10_META,
			itm_grp_nm10_META,
			sppl_grp_cd1_META,
			sppl_grp_nm1_META,
			sppl_grp_cd2_META,
			sppl_grp_nm2_META,
			sppl_grp_cd3_META,
			sppl_grp_nm3_META,
			sppl_grp_cd4_META,
			sppl_grp_nm4_META,
			sppl_grp_cd5_META,
			sppl_grp_nm5_META,
			sppl_grp_cd6_META,
			sppl_grp_nm6_META,
			sppl_grp_cd7_META,
			sppl_grp_nm7_META,
			sppl_grp_cd8_META,
			sppl_grp_nm8_META,
			sppl_grp_cd9_META,
			sppl_grp_nm9_META,
			sppl_grp_cd10_META,
			sppl_grp_nm10_META,
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
			dec_place_META,
			cont_fctr_flg_META,
			cont_fctr_dec_place_META,
			cont_fctr_rnd_typ_META
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
				{$itm_ord_typ, "MSC_ITM_ORD_TYP"},	// itm_ord_typ
				{$itm_ord_sts_typ, "MSC_ITM_ORD_STS_TYP"},	// itm_ord_sts_typ
				{$itm_typ, "MAC_ITM_TYP"},	// itm_typ
				{$ord_gnrt_typ, "MSC_ORD_GNRT_TYP"}	// ord_gnrt_typ
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
	protected Srch01_RsltR_MC_A(ConstMetaList<? extends Srch01_RsltR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch01_RsltR clone() {
		return (Srch01_RsltR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch01_RsltR createInstance() {
		return (Srch01_RsltR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch01_RsltR getValues(String... names) {
		return (Srch01_RsltR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * Item order No. 品目オーダＮＯ.<p>
	 *
	 */
	public String itm_ord_no() {
		return getConstString(offset + 0, $itm_ord_no);
	}

	/**
	 * Item order No. 品目オーダＮＯ.<p>
	 *
	 */
	public void itm_ord_no(String value) {
		setConstString(offset + 0, $itm_ord_no, value);
	}


	/**
	 * Order type オーダ区分.<p>
	 *
	 */
	public String itm_ord_typ() {
		return getConstString(offset + 1, $itm_ord_typ);
	}

	/**
	 * Order type オーダ区分.<p>
	 *
	 */
	public void itm_ord_typ(String value) {
		setConstString(offset + 1, $itm_ord_typ, value);
	}


	/**
	 * Order type name オーダ区分名.<p>
	 *
	 */
	public String itm_ord_typ_nm() {
		return getConstString(offset + 2, $itm_ord_typ_nm);
	}

	/**
	 * Order type name オーダ区分名.<p>
	 *
	 */
	public void itm_ord_typ_nm(String value) {
		setConstString(offset + 2, $itm_ord_typ_nm, value);
	}


	/**
	 * Item status 品目状況.<p>
	 *
	 */
	public String itm_ord_sts_typ() {
		return getConstString(offset + 3, $itm_ord_sts_typ);
	}

	/**
	 * Item status 品目状況.<p>
	 *
	 */
	public void itm_ord_sts_typ(String value) {
		setConstString(offset + 3, $itm_ord_sts_typ, value);
	}


	/**
	 * Item status name 品目状況名.<p>
	 *
	 */
	public String itm_ord_sts_typ_nm() {
		return getConstString(offset + 4, $itm_ord_sts_typ_nm);
	}

	/**
	 * Item status name 品目状況名.<p>
	 *
	 */
	public void itm_ord_sts_typ_nm(String value) {
		setConstString(offset + 4, $itm_ord_sts_typ_nm, value);
	}


	/**
	 * Item type 品目区分.<p>
	 *
	 */
	public String itm_typ() {
		return getConstString(offset + 5, $itm_typ);
	}

	/**
	 * Item type 品目区分.<p>
	 *
	 */
	public void itm_typ(String value) {
		setConstString(offset + 5, $itm_typ, value);
	}


	/**
	 * Item type name 品目区分名.<p>
	 *
	 */
	public String itm_typ_nm() {
		return getConstString(offset + 6, $itm_typ_nm);
	}

	/**
	 * Item type name 品目区分名.<p>
	 *
	 */
	public void itm_typ_nm(String value) {
		setConstString(offset + 6, $itm_typ_nm, value);
	}


	/**
	 * Item type details cd. 品目区分詳細ＣＤ.<p>
	 *
	 */
	public String itm_typ_d_cd() {
		return getConstString(offset + 7, $itm_typ_d_cd);
	}

	/**
	 * Item type details cd. 品目区分詳細ＣＤ.<p>
	 *
	 */
	public void itm_typ_d_cd(String value) {
		setConstString(offset + 7, $itm_typ_d_cd, value);
	}


	/**
	 * Item type details name 品目区分詳細名.<p>
	 *
	 */
	public String itm_typ_d_nm() {
		return getConstString(offset + 8, $itm_typ_d_nm);
	}

	/**
	 * Item type details name 品目区分詳細名.<p>
	 *
	 */
	public void itm_typ_d_nm(String value) {
		setConstString(offset + 8, $itm_typ_d_nm, value);
	}


	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public String itm_cd() {
		return getConstString(offset + 9, $itm_cd);
	}

	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public void itm_cd(String value) {
		setConstString(offset + 9, $itm_cd, value);
	}


	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public String itm_sub1() {
		return getConstString(offset + 10, $itm_sub1);
	}

	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public void itm_sub1(String value) {
		setConstString(offset + 10, $itm_sub1, value);
	}


	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public String itm_sub2() {
		return getConstString(offset + 11, $itm_sub2);
	}

	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public void itm_sub2(String value) {
		setConstString(offset + 11, $itm_sub2, value);
	}


	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public String itm_sub3() {
		return getConstString(offset + 12, $itm_sub3);
	}

	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public void itm_sub3(String value) {
		setConstString(offset + 12, $itm_sub3, value);
	}


	/**
	 * Item name 品名.<p>
	 *
	 */
	public String itm_nm() {
		return getConstString(offset + 13, $itm_nm);
	}

	/**
	 * Item name 品名.<p>
	 *
	 */
	public void itm_nm(String value) {
		setConstString(offset + 13, $itm_nm, value);
	}


	/**
	 * Version No. 版ＮＯ.<p>
	 *
	 */
	public String ver_no() {
		return getConstString(offset + 14, $ver_no);
	}

	/**
	 * Version No. 版ＮＯ.<p>
	 *
	 */
	public void ver_no(String value) {
		setConstString(offset + 14, $ver_no, value);
	}


	/**
	 * Aggregation まとめ.<p>
	 *
	 */
	public boolean bndl_flg() {
		return getConstBoolean(offset + 15, $bndl_flg);
	}

	/**
	 * Aggregation まとめ.<p>
	 *
	 */
	public void bndl_flg(boolean value) {
		setConstBoolean(offset + 15, $bndl_flg, value);
	}


	/**
	 * Order scheduled qty. 指図予定数量.<p>
	 *
	 */
	public MCNumber inst_qty() {
		return getConstNumber(offset + 16, $inst_qty);
	}

	/**
	 * Order scheduled qty. 指図予定数量.<p>
	 *
	 */
	public void inst_qty(MCNumber value) {
		setConstNumber(offset + 16, $inst_qty, value);
	}

	/**
	 * Order scheduled qty. 指図予定数量.<p>
	 *
	 */
	public void inst_qty(int value) {
		setConstNumber(offset + 16, $inst_qty, value);
	}

	/**
	 * Order scheduled qty. 指図予定数量.<p>
	 *
	 */
	public void inst_qty(long value) {
		setConstNumber(offset + 16, $inst_qty, value);
	}

	/**
	 * Order scheduled qty. 指図予定数量.<p>
	 *
	 */
	public void inst_qty(float value) {
		setConstNumber(offset + 16, $inst_qty, value);
	}

	/**
	 * Order scheduled qty. 指図予定数量.<p>
	 *
	 */
	public void inst_qty(double value) {
		setConstNumber(offset + 16, $inst_qty, value);
	}


	/**
	 * Output scheduled qty. 出来高予定数量.<p>
	 *
	 */
	public MCNumber yield_schd_qty() {
		return getConstNumber(offset + 17, $yield_schd_qty);
	}

	/**
	 * Output scheduled qty. 出来高予定数量.<p>
	 *
	 */
	public void yield_schd_qty(MCNumber value) {
		setConstNumber(offset + 17, $yield_schd_qty, value);
	}

	/**
	 * Output scheduled qty. 出来高予定数量.<p>
	 *
	 */
	public void yield_schd_qty(int value) {
		setConstNumber(offset + 17, $yield_schd_qty, value);
	}

	/**
	 * Output scheduled qty. 出来高予定数量.<p>
	 *
	 */
	public void yield_schd_qty(long value) {
		setConstNumber(offset + 17, $yield_schd_qty, value);
	}

	/**
	 * Output scheduled qty. 出来高予定数量.<p>
	 *
	 */
	public void yield_schd_qty(float value) {
		setConstNumber(offset + 17, $yield_schd_qty, value);
	}

	/**
	 * Output scheduled qty. 出来高予定数量.<p>
	 *
	 */
	public void yield_schd_qty(double value) {
		setConstNumber(offset + 17, $yield_schd_qty, value);
	}


	/**
	 * Output scheduled qty. (Order/PO) 出来高予定数量（指図・発注）.<p>
	 *
	 */
	public MCNumber inst_yield_schd_qty() {
		return getConstNumber(offset + 18, $inst_yield_schd_qty);
	}

	/**
	 * Output scheduled qty. (Order/PO) 出来高予定数量（指図・発注）.<p>
	 *
	 */
	public void inst_yield_schd_qty(MCNumber value) {
		setConstNumber(offset + 18, $inst_yield_schd_qty, value);
	}

	/**
	 * Output scheduled qty. (Order/PO) 出来高予定数量（指図・発注）.<p>
	 *
	 */
	public void inst_yield_schd_qty(int value) {
		setConstNumber(offset + 18, $inst_yield_schd_qty, value);
	}

	/**
	 * Output scheduled qty. (Order/PO) 出来高予定数量（指図・発注）.<p>
	 *
	 */
	public void inst_yield_schd_qty(long value) {
		setConstNumber(offset + 18, $inst_yield_schd_qty, value);
	}

	/**
	 * Output scheduled qty. (Order/PO) 出来高予定数量（指図・発注）.<p>
	 *
	 */
	public void inst_yield_schd_qty(float value) {
		setConstNumber(offset + 18, $inst_yield_schd_qty, value);
	}

	/**
	 * Output scheduled qty. (Order/PO) 出来高予定数量（指図・発注）.<p>
	 *
	 */
	public void inst_yield_schd_qty(double value) {
		setConstNumber(offset + 18, $inst_yield_schd_qty, value);
	}


	/**
	 * Receipt/output result qty. 入荷・出来高実績数量.<p>
	 *
	 */
	public MCNumber yield_act_qty() {
		return getConstNumber(offset + 19, $yield_act_qty);
	}

	/**
	 * Receipt/output result qty. 入荷・出来高実績数量.<p>
	 *
	 */
	public void yield_act_qty(MCNumber value) {
		setConstNumber(offset + 19, $yield_act_qty, value);
	}

	/**
	 * Receipt/output result qty. 入荷・出来高実績数量.<p>
	 *
	 */
	public void yield_act_qty(int value) {
		setConstNumber(offset + 19, $yield_act_qty, value);
	}

	/**
	 * Receipt/output result qty. 入荷・出来高実績数量.<p>
	 *
	 */
	public void yield_act_qty(long value) {
		setConstNumber(offset + 19, $yield_act_qty, value);
	}

	/**
	 * Receipt/output result qty. 入荷・出来高実績数量.<p>
	 *
	 */
	public void yield_act_qty(float value) {
		setConstNumber(offset + 19, $yield_act_qty, value);
	}

	/**
	 * Receipt/output result qty. 入荷・出来高実績数量.<p>
	 *
	 */
	public void yield_act_qty(double value) {
		setConstNumber(offset + 19, $yield_act_qty, value);
	}


	/**
	 * Purchase result qty. 仕入実績数量.<p>
	 *
	 */
	public MCNumber purc_act_qty() {
		return getConstNumber(offset + 20, $purc_act_qty);
	}

	/**
	 * Purchase result qty. 仕入実績数量.<p>
	 *
	 */
	public void purc_act_qty(MCNumber value) {
		setConstNumber(offset + 20, $purc_act_qty, value);
	}

	/**
	 * Purchase result qty. 仕入実績数量.<p>
	 *
	 */
	public void purc_act_qty(int value) {
		setConstNumber(offset + 20, $purc_act_qty, value);
	}

	/**
	 * Purchase result qty. 仕入実績数量.<p>
	 *
	 */
	public void purc_act_qty(long value) {
		setConstNumber(offset + 20, $purc_act_qty, value);
	}

	/**
	 * Purchase result qty. 仕入実績数量.<p>
	 *
	 */
	public void purc_act_qty(float value) {
		setConstNumber(offset + 20, $purc_act_qty, value);
	}

	/**
	 * Purchase result qty. 仕入実績数量.<p>
	 *
	 */
	public void purc_act_qty(double value) {
		setConstNumber(offset + 20, $purc_act_qty, value);
	}


	/**
	 * Inspection result qty. 検査実績数量.<p>
	 *
	 */
	public MCNumber insp_act_qty() {
		return getConstNumber(offset + 21, $insp_act_qty);
	}

	/**
	 * Inspection result qty. 検査実績数量.<p>
	 *
	 */
	public void insp_act_qty(MCNumber value) {
		setConstNumber(offset + 21, $insp_act_qty, value);
	}

	/**
	 * Inspection result qty. 検査実績数量.<p>
	 *
	 */
	public void insp_act_qty(int value) {
		setConstNumber(offset + 21, $insp_act_qty, value);
	}

	/**
	 * Inspection result qty. 検査実績数量.<p>
	 *
	 */
	public void insp_act_qty(long value) {
		setConstNumber(offset + 21, $insp_act_qty, value);
	}

	/**
	 * Inspection result qty. 検査実績数量.<p>
	 *
	 */
	public void insp_act_qty(float value) {
		setConstNumber(offset + 21, $insp_act_qty, value);
	}

	/**
	 * Inspection result qty. 検査実績数量.<p>
	 *
	 */
	public void insp_act_qty(double value) {
		setConstNumber(offset + 21, $insp_act_qty, value);
	}


	/**
	 * Remaining receipt/output 入荷・出来高残数.<p>
	 *
	 */
	public MCNumber yield_remain_qty() {
		return getConstNumber(offset + 22, $yield_remain_qty);
	}

	/**
	 * Remaining receipt/output 入荷・出来高残数.<p>
	 *
	 */
	public void yield_remain_qty(MCNumber value) {
		setConstNumber(offset + 22, $yield_remain_qty, value);
	}

	/**
	 * Remaining receipt/output 入荷・出来高残数.<p>
	 *
	 */
	public void yield_remain_qty(int value) {
		setConstNumber(offset + 22, $yield_remain_qty, value);
	}

	/**
	 * Remaining receipt/output 入荷・出来高残数.<p>
	 *
	 */
	public void yield_remain_qty(long value) {
		setConstNumber(offset + 22, $yield_remain_qty, value);
	}

	/**
	 * Remaining receipt/output 入荷・出来高残数.<p>
	 *
	 */
	public void yield_remain_qty(float value) {
		setConstNumber(offset + 22, $yield_remain_qty, value);
	}

	/**
	 * Remaining receipt/output 入荷・出来高残数.<p>
	 *
	 */
	public void yield_remain_qty(double value) {
		setConstNumber(offset + 22, $yield_remain_qty, value);
	}


	/**
	 * Remaining purchase qty. 仕入残数.<p>
	 *
	 */
	public MCNumber purc_remain_qty() {
		return getConstNumber(offset + 23, $purc_remain_qty);
	}

	/**
	 * Remaining purchase qty. 仕入残数.<p>
	 *
	 */
	public void purc_remain_qty(MCNumber value) {
		setConstNumber(offset + 23, $purc_remain_qty, value);
	}

	/**
	 * Remaining purchase qty. 仕入残数.<p>
	 *
	 */
	public void purc_remain_qty(int value) {
		setConstNumber(offset + 23, $purc_remain_qty, value);
	}

	/**
	 * Remaining purchase qty. 仕入残数.<p>
	 *
	 */
	public void purc_remain_qty(long value) {
		setConstNumber(offset + 23, $purc_remain_qty, value);
	}

	/**
	 * Remaining purchase qty. 仕入残数.<p>
	 *
	 */
	public void purc_remain_qty(float value) {
		setConstNumber(offset + 23, $purc_remain_qty, value);
	}

	/**
	 * Remaining purchase qty. 仕入残数.<p>
	 *
	 */
	public void purc_remain_qty(double value) {
		setConstNumber(offset + 23, $purc_remain_qty, value);
	}


	/**
	 * Remaining inspection qty. 検査残数.<p>
	 *
	 */
	public MCNumber insp_remain_qty() {
		return getConstNumber(offset + 24, $insp_remain_qty);
	}

	/**
	 * Remaining inspection qty. 検査残数.<p>
	 *
	 */
	public void insp_remain_qty(MCNumber value) {
		setConstNumber(offset + 24, $insp_remain_qty, value);
	}

	/**
	 * Remaining inspection qty. 検査残数.<p>
	 *
	 */
	public void insp_remain_qty(int value) {
		setConstNumber(offset + 24, $insp_remain_qty, value);
	}

	/**
	 * Remaining inspection qty. 検査残数.<p>
	 *
	 */
	public void insp_remain_qty(long value) {
		setConstNumber(offset + 24, $insp_remain_qty, value);
	}

	/**
	 * Remaining inspection qty. 検査残数.<p>
	 *
	 */
	public void insp_remain_qty(float value) {
		setConstNumber(offset + 24, $insp_remain_qty, value);
	}

	/**
	 * Remaining inspection qty. 検査残数.<p>
	 *
	 */
	public void insp_remain_qty(double value) {
		setConstNumber(offset + 24, $insp_remain_qty, value);
	}


	/**
	 * Allocation scheduled qty. 引当予定数量.<p>
	 *
	 */
	public MCNumber schd_alloc_qty() {
		return getConstNumber(offset + 25, $schd_alloc_qty);
	}

	/**
	 * Allocation scheduled qty. 引当予定数量.<p>
	 *
	 */
	public void schd_alloc_qty(MCNumber value) {
		setConstNumber(offset + 25, $schd_alloc_qty, value);
	}

	/**
	 * Allocation scheduled qty. 引当予定数量.<p>
	 *
	 */
	public void schd_alloc_qty(int value) {
		setConstNumber(offset + 25, $schd_alloc_qty, value);
	}

	/**
	 * Allocation scheduled qty. 引当予定数量.<p>
	 *
	 */
	public void schd_alloc_qty(long value) {
		setConstNumber(offset + 25, $schd_alloc_qty, value);
	}

	/**
	 * Allocation scheduled qty. 引当予定数量.<p>
	 *
	 */
	public void schd_alloc_qty(float value) {
		setConstNumber(offset + 25, $schd_alloc_qty, value);
	}

	/**
	 * Allocation scheduled qty. 引当予定数量.<p>
	 *
	 */
	public void schd_alloc_qty(double value) {
		setConstNumber(offset + 25, $schd_alloc_qty, value);
	}


	/**
	 * Surplus qty. 余剰数量.<p>
	 *
	 */
	public MCNumber surplus_qty() {
		return getConstNumber(offset + 26, $surplus_qty);
	}

	/**
	 * Surplus qty. 余剰数量.<p>
	 *
	 */
	public void surplus_qty(MCNumber value) {
		setConstNumber(offset + 26, $surplus_qty, value);
	}

	/**
	 * Surplus qty. 余剰数量.<p>
	 *
	 */
	public void surplus_qty(int value) {
		setConstNumber(offset + 26, $surplus_qty, value);
	}

	/**
	 * Surplus qty. 余剰数量.<p>
	 *
	 */
	public void surplus_qty(long value) {
		setConstNumber(offset + 26, $surplus_qty, value);
	}

	/**
	 * Surplus qty. 余剰数量.<p>
	 *
	 */
	public void surplus_qty(float value) {
		setConstNumber(offset + 26, $surplus_qty, value);
	}

	/**
	 * Surplus qty. 余剰数量.<p>
	 *
	 */
	public void surplus_qty(double value) {
		setConstNumber(offset + 26, $surplus_qty, value);
	}


	/**
	 * Cancelled remaining qty. 打切数量.<p>
	 *
	 */
	public MCNumber abort_qty() {
		return getConstNumber(offset + 27, $abort_qty);
	}

	/**
	 * Cancelled remaining qty. 打切数量.<p>
	 *
	 */
	public void abort_qty(MCNumber value) {
		setConstNumber(offset + 27, $abort_qty, value);
	}

	/**
	 * Cancelled remaining qty. 打切数量.<p>
	 *
	 */
	public void abort_qty(int value) {
		setConstNumber(offset + 27, $abort_qty, value);
	}

	/**
	 * Cancelled remaining qty. 打切数量.<p>
	 *
	 */
	public void abort_qty(long value) {
		setConstNumber(offset + 27, $abort_qty, value);
	}

	/**
	 * Cancelled remaining qty. 打切数量.<p>
	 *
	 */
	public void abort_qty(float value) {
		setConstNumber(offset + 27, $abort_qty, value);
	}

	/**
	 * Cancelled remaining qty. 打切数量.<p>
	 *
	 */
	public void abort_qty(double value) {
		setConstNumber(offset + 27, $abort_qty, value);
	}


	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public String base_unit_cd() {
		return getConstString(offset + 28, $base_unit_cd);
	}

	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public void base_unit_cd(String value) {
		setConstString(offset + 28, $base_unit_cd, value);
	}


	/**
	 * Base unit name 基準単位名.<p>
	 *
	 */
	public String base_unit_nm() {
		return getConstString(offset + 29, $base_unit_nm);
	}

	/**
	 * Base unit name 基準単位名.<p>
	 *
	 */
	public void base_unit_nm(String value) {
		setConstString(offset + 29, $base_unit_nm, value);
	}


	/**
	 * Receipt/output progress rate 入荷・出来高進捗率.<p>
	 *
	 */
	public MCNumber arr_yield_rate() {
		return getConstNumber(offset + 30, $arr_yield_rate);
	}

	/**
	 * Receipt/output progress rate 入荷・出来高進捗率.<p>
	 *
	 */
	public void arr_yield_rate(MCNumber value) {
		setConstNumber(offset + 30, $arr_yield_rate, value);
	}

	/**
	 * Receipt/output progress rate 入荷・出来高進捗率.<p>
	 *
	 */
	public void arr_yield_rate(int value) {
		setConstNumber(offset + 30, $arr_yield_rate, value);
	}

	/**
	 * Receipt/output progress rate 入荷・出来高進捗率.<p>
	 *
	 */
	public void arr_yield_rate(long value) {
		setConstNumber(offset + 30, $arr_yield_rate, value);
	}

	/**
	 * Receipt/output progress rate 入荷・出来高進捗率.<p>
	 *
	 */
	public void arr_yield_rate(float value) {
		setConstNumber(offset + 30, $arr_yield_rate, value);
	}

	/**
	 * Receipt/output progress rate 入荷・出来高進捗率.<p>
	 *
	 */
	public void arr_yield_rate(double value) {
		setConstNumber(offset + 30, $arr_yield_rate, value);
	}


	/**
	 * Purchase progress rate 仕入進捗率.<p>
	 *
	 */
	public MCNumber purc_rate() {
		return getConstNumber(offset + 31, $purc_rate);
	}

	/**
	 * Purchase progress rate 仕入進捗率.<p>
	 *
	 */
	public void purc_rate(MCNumber value) {
		setConstNumber(offset + 31, $purc_rate, value);
	}

	/**
	 * Purchase progress rate 仕入進捗率.<p>
	 *
	 */
	public void purc_rate(int value) {
		setConstNumber(offset + 31, $purc_rate, value);
	}

	/**
	 * Purchase progress rate 仕入進捗率.<p>
	 *
	 */
	public void purc_rate(long value) {
		setConstNumber(offset + 31, $purc_rate, value);
	}

	/**
	 * Purchase progress rate 仕入進捗率.<p>
	 *
	 */
	public void purc_rate(float value) {
		setConstNumber(offset + 31, $purc_rate, value);
	}

	/**
	 * Purchase progress rate 仕入進捗率.<p>
	 *
	 */
	public void purc_rate(double value) {
		setConstNumber(offset + 31, $purc_rate, value);
	}


	/**
	 * Active ingredient (Order scheduled qty.) 有効成分(指図予定数量).<p>
	 *
	 */
	public MCNumber cont_fctr_inst_qty() {
		return getConstNumber(offset + 32, $cont_fctr_inst_qty);
	}

	/**
	 * Active ingredient (Order scheduled qty.) 有効成分(指図予定数量).<p>
	 *
	 */
	public void cont_fctr_inst_qty(MCNumber value) {
		setConstNumber(offset + 32, $cont_fctr_inst_qty, value);
	}

	/**
	 * Active ingredient (Order scheduled qty.) 有効成分(指図予定数量).<p>
	 *
	 */
	public void cont_fctr_inst_qty(int value) {
		setConstNumber(offset + 32, $cont_fctr_inst_qty, value);
	}

	/**
	 * Active ingredient (Order scheduled qty.) 有効成分(指図予定数量).<p>
	 *
	 */
	public void cont_fctr_inst_qty(long value) {
		setConstNumber(offset + 32, $cont_fctr_inst_qty, value);
	}

	/**
	 * Active ingredient (Order scheduled qty.) 有効成分(指図予定数量).<p>
	 *
	 */
	public void cont_fctr_inst_qty(float value) {
		setConstNumber(offset + 32, $cont_fctr_inst_qty, value);
	}

	/**
	 * Active ingredient (Order scheduled qty.) 有効成分(指図予定数量).<p>
	 *
	 */
	public void cont_fctr_inst_qty(double value) {
		setConstNumber(offset + 32, $cont_fctr_inst_qty, value);
	}


	/**
	 * Active ingredient (Output scheduled qty.) 有効成分(出来高予定数量).<p>
	 *
	 */
	public MCNumber cont_fctr_schd_yield_qty() {
		return getConstNumber(offset + 33, $cont_fctr_schd_yield_qty);
	}

	/**
	 * Active ingredient (Output scheduled qty.) 有効成分(出来高予定数量).<p>
	 *
	 */
	public void cont_fctr_schd_yield_qty(MCNumber value) {
		setConstNumber(offset + 33, $cont_fctr_schd_yield_qty, value);
	}

	/**
	 * Active ingredient (Output scheduled qty.) 有効成分(出来高予定数量).<p>
	 *
	 */
	public void cont_fctr_schd_yield_qty(int value) {
		setConstNumber(offset + 33, $cont_fctr_schd_yield_qty, value);
	}

	/**
	 * Active ingredient (Output scheduled qty.) 有効成分(出来高予定数量).<p>
	 *
	 */
	public void cont_fctr_schd_yield_qty(long value) {
		setConstNumber(offset + 33, $cont_fctr_schd_yield_qty, value);
	}

	/**
	 * Active ingredient (Output scheduled qty.) 有効成分(出来高予定数量).<p>
	 *
	 */
	public void cont_fctr_schd_yield_qty(float value) {
		setConstNumber(offset + 33, $cont_fctr_schd_yield_qty, value);
	}

	/**
	 * Active ingredient (Output scheduled qty.) 有効成分(出来高予定数量).<p>
	 *
	 */
	public void cont_fctr_schd_yield_qty(double value) {
		setConstNumber(offset + 33, $cont_fctr_schd_yield_qty, value);
	}


	/**
	 * Active ingredient unit cd. 有効成分単位ＣＤ.<p>
	 *
	 */
	public String cont_fctr_unit_cd() {
		return getConstString(offset + 34, $cont_fctr_unit_cd);
	}

	/**
	 * Active ingredient unit cd. 有効成分単位ＣＤ.<p>
	 *
	 */
	public void cont_fctr_unit_cd(String value) {
		setConstString(offset + 34, $cont_fctr_unit_cd, value);
	}


	/**
	 * Active ingredient unit name 有効成分単位名.<p>
	 *
	 */
	public String cont_fctr_unit_nm() {
		return getConstString(offset + 35, $cont_fctr_unit_nm);
	}

	/**
	 * Active ingredient unit name 有効成分単位名.<p>
	 *
	 */
	public void cont_fctr_unit_nm(String value) {
		setConstString(offset + 35, $cont_fctr_unit_nm, value);
	}


	/**
	 * Standard coefficient 標準係数.<p>
	 *
	 */
	public MCNumber std_cont_fctr() {
		return getConstNumber(offset + 36, $std_cont_fctr);
	}

	/**
	 * Standard coefficient 標準係数.<p>
	 *
	 */
	public void std_cont_fctr(MCNumber value) {
		setConstNumber(offset + 36, $std_cont_fctr, value);
	}

	/**
	 * Standard coefficient 標準係数.<p>
	 *
	 */
	public void std_cont_fctr(int value) {
		setConstNumber(offset + 36, $std_cont_fctr, value);
	}

	/**
	 * Standard coefficient 標準係数.<p>
	 *
	 */
	public void std_cont_fctr(long value) {
		setConstNumber(offset + 36, $std_cont_fctr, value);
	}

	/**
	 * Standard coefficient 標準係数.<p>
	 *
	 */
	public void std_cont_fctr(float value) {
		setConstNumber(offset + 36, $std_cont_fctr, value);
	}

	/**
	 * Standard coefficient 標準係数.<p>
	 *
	 */
	public void std_cont_fctr(double value) {
		setConstNumber(offset + 36, $std_cont_fctr, value);
	}


	/**
	 * Scheduled PO date (MRP) 発注予定日（ＭＲＰ）.<p>
	 *
	 */
	public MCDate mrp_po_schd_dt() {
		return getConstDate(offset + 37, $mrp_po_schd_dt);
	}

	/**
	 * Scheduled PO date (MRP) 発注予定日（ＭＲＰ）.<p>
	 *
	 */
	public void mrp_po_schd_dt(MCDate value) {
		setConstDate(offset + 37, $mrp_po_schd_dt, value);
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
	 * PO date 発注日.<p>
	 *
	 */
	public MCDate latest_po_d_dt() {
		return getConstDate(offset + 39, $latest_po_d_dt);
	}

	/**
	 * PO date 発注日.<p>
	 *
	 */
	public void latest_po_d_dt(MCDate value) {
		setConstDate(offset + 39, $latest_po_d_dt, value);
	}


	/**
	 * Scheduled GI date (MRP) 出庫予定日（ＭＲＰ）.<p>
	 *
	 */
	public MCDate mrp_gi_schd_dt() {
		return getConstDate(offset + 40, $mrp_gi_schd_dt);
	}

	/**
	 * Scheduled GI date (MRP) 出庫予定日（ＭＲＰ）.<p>
	 *
	 */
	public void mrp_gi_schd_dt(MCDate value) {
		setConstDate(offset + 40, $mrp_gi_schd_dt, value);
	}


	/**
	 * Scheduled GI date 出庫予定日.<p>
	 *
	 */
	public MCDate gi_schd_dt() {
		return getConstDate(offset + 41, $gi_schd_dt);
	}

	/**
	 * Scheduled GI date 出庫予定日.<p>
	 *
	 */
	public void gi_schd_dt(MCDate value) {
		setConstDate(offset + 41, $gi_schd_dt, value);
	}


	/**
	 * Scheduled GI date (Order) 出庫予定日（指図）.<p>
	 *
	 */
	public MCDate inst_gi_schd_dt() {
		return getConstDate(offset + 42, $inst_gi_schd_dt);
	}

	/**
	 * Scheduled GI date (Order) 出庫予定日（指図）.<p>
	 *
	 */
	public void inst_gi_schd_dt(MCDate value) {
		setConstDate(offset + 42, $inst_gi_schd_dt, value);
	}


	/**
	 * GI date 出庫日.<p>
	 *
	 */
	public MCDate latest_gi_act_dt() {
		return getConstDate(offset + 43, $latest_gi_act_dt);
	}

	/**
	 * GI date 出庫日.<p>
	 *
	 */
	public void latest_gi_act_dt(MCDate value) {
		setConstDate(offset + 43, $latest_gi_act_dt, value);
	}


	/**
	 * Scheduled mfg. start date (MRP) 製造着手予定日（ＭＲＰ）.<p>
	 *
	 */
	public MCDate mrp_mfg_st_schd_dt() {
		return getConstDate(offset + 44, $mrp_mfg_st_schd_dt);
	}

	/**
	 * Scheduled mfg. start date (MRP) 製造着手予定日（ＭＲＰ）.<p>
	 *
	 */
	public void mrp_mfg_st_schd_dt(MCDate value) {
		setConstDate(offset + 44, $mrp_mfg_st_schd_dt, value);
	}


	/**
	 * Scheduled mfg. start date 製造着手予定日.<p>
	 *
	 */
	public MCDate mfg_st_schd_dt() {
		return getConstDate(offset + 45, $mfg_st_schd_dt);
	}

	/**
	 * Scheduled mfg. start date 製造着手予定日.<p>
	 *
	 */
	public void mfg_st_schd_dt(MCDate value) {
		setConstDate(offset + 45, $mfg_st_schd_dt, value);
	}


	/**
	 * Scheduled mfg. start date (Order) 製造着手予定日（指図）.<p>
	 *
	 */
	public MCDate inst_mfg_st_schd_dt() {
		return getConstDate(offset + 46, $inst_mfg_st_schd_dt);
	}

	/**
	 * Scheduled mfg. start date (Order) 製造着手予定日（指図）.<p>
	 *
	 */
	public void inst_mfg_st_schd_dt(MCDate value) {
		setConstDate(offset + 46, $inst_mfg_st_schd_dt, value);
	}


	/**
	 * Mfg. start date 製造着手日.<p>
	 *
	 */
	public MCDate latest_mfg_st_act_dt() {
		return getConstDate(offset + 47, $latest_mfg_st_act_dt);
	}

	/**
	 * Mfg. start date 製造着手日.<p>
	 *
	 */
	public void latest_mfg_st_act_dt(MCDate value) {
		setConstDate(offset + 47, $latest_mfg_st_act_dt, value);
	}


	/**
	 * Scheduled mfg. end date (MRP) 製造終了予定日（ＭＲＰ）.<p>
	 *
	 */
	public MCDate mrp_mfg_end_schd_dt() {
		return getConstDate(offset + 48, $mrp_mfg_end_schd_dt);
	}

	/**
	 * Scheduled mfg. end date (MRP) 製造終了予定日（ＭＲＰ）.<p>
	 *
	 */
	public void mrp_mfg_end_schd_dt(MCDate value) {
		setConstDate(offset + 48, $mrp_mfg_end_schd_dt, value);
	}


	/**
	 * Scheduled mfg. end date 製造終了予定日.<p>
	 *
	 */
	public MCDate mfg_end_schd_dt() {
		return getConstDate(offset + 49, $mfg_end_schd_dt);
	}

	/**
	 * Scheduled mfg. end date 製造終了予定日.<p>
	 *
	 */
	public void mfg_end_schd_dt(MCDate value) {
		setConstDate(offset + 49, $mfg_end_schd_dt, value);
	}


	/**
	 * Scheduled mfg. end date (Order) 製造終了予定日（指図）.<p>
	 *
	 */
	public MCDate inst_mfg_end_schd_dt() {
		return getConstDate(offset + 50, $inst_mfg_end_schd_dt);
	}

	/**
	 * Scheduled mfg. end date (Order) 製造終了予定日（指図）.<p>
	 *
	 */
	public void inst_mfg_end_schd_dt(MCDate value) {
		setConstDate(offset + 50, $inst_mfg_end_schd_dt, value);
	}


	/**
	 * Mfg. end date 製造終了日.<p>
	 *
	 */
	public MCDate latest_mfg_end_act_dt() {
		return getConstDate(offset + 51, $latest_mfg_end_act_dt);
	}

	/**
	 * Mfg. end date 製造終了日.<p>
	 *
	 */
	public void latest_mfg_end_act_dt(MCDate value) {
		setConstDate(offset + 51, $latest_mfg_end_act_dt, value);
	}


	/**
	 * Mfg. LT (MRP) 製造ＬＴ（ＭＲＰ）.<p>
	 *
	 */
	public MCNumber mrp_mfg_lt() {
		return getConstNumber(offset + 52, $mrp_mfg_lt);
	}

	/**
	 * Mfg. LT (MRP) 製造ＬＴ（ＭＲＰ）.<p>
	 *
	 */
	public void mrp_mfg_lt(MCNumber value) {
		setConstNumber(offset + 52, $mrp_mfg_lt, value);
	}

	/**
	 * Mfg. LT (MRP) 製造ＬＴ（ＭＲＰ）.<p>
	 *
	 */
	public void mrp_mfg_lt(int value) {
		setConstNumber(offset + 52, $mrp_mfg_lt, value);
	}

	/**
	 * Mfg. LT (MRP) 製造ＬＴ（ＭＲＰ）.<p>
	 *
	 */
	public void mrp_mfg_lt(long value) {
		setConstNumber(offset + 52, $mrp_mfg_lt, value);
	}

	/**
	 * Mfg. LT (MRP) 製造ＬＴ（ＭＲＰ）.<p>
	 *
	 */
	public void mrp_mfg_lt(float value) {
		setConstNumber(offset + 52, $mrp_mfg_lt, value);
	}

	/**
	 * Mfg. LT (MRP) 製造ＬＴ（ＭＲＰ）.<p>
	 *
	 */
	public void mrp_mfg_lt(double value) {
		setConstNumber(offset + 52, $mrp_mfg_lt, value);
	}


	/**
	 * Mfg. LT 製造ＬＴ.<p>
	 *
	 */
	public MCNumber mfg_lt() {
		return getConstNumber(offset + 53, $mfg_lt);
	}

	/**
	 * Mfg. LT 製造ＬＴ.<p>
	 *
	 */
	public void mfg_lt(MCNumber value) {
		setConstNumber(offset + 53, $mfg_lt, value);
	}

	/**
	 * Mfg. LT 製造ＬＴ.<p>
	 *
	 */
	public void mfg_lt(int value) {
		setConstNumber(offset + 53, $mfg_lt, value);
	}

	/**
	 * Mfg. LT 製造ＬＴ.<p>
	 *
	 */
	public void mfg_lt(long value) {
		setConstNumber(offset + 53, $mfg_lt, value);
	}

	/**
	 * Mfg. LT 製造ＬＴ.<p>
	 *
	 */
	public void mfg_lt(float value) {
		setConstNumber(offset + 53, $mfg_lt, value);
	}

	/**
	 * Mfg. LT 製造ＬＴ.<p>
	 *
	 */
	public void mfg_lt(double value) {
		setConstNumber(offset + 53, $mfg_lt, value);
	}


	/**
	 * Mfg. LT (Result) 製造ＬＴ（実績）.<p>
	 *
	 */
	public MCNumber act_mfg_lt() {
		return getConstNumber(offset + 54, $act_mfg_lt);
	}

	/**
	 * Mfg. LT (Result) 製造ＬＴ（実績）.<p>
	 *
	 */
	public void act_mfg_lt(MCNumber value) {
		setConstNumber(offset + 54, $act_mfg_lt, value);
	}

	/**
	 * Mfg. LT (Result) 製造ＬＴ（実績）.<p>
	 *
	 */
	public void act_mfg_lt(int value) {
		setConstNumber(offset + 54, $act_mfg_lt, value);
	}

	/**
	 * Mfg. LT (Result) 製造ＬＴ（実績）.<p>
	 *
	 */
	public void act_mfg_lt(long value) {
		setConstNumber(offset + 54, $act_mfg_lt, value);
	}

	/**
	 * Mfg. LT (Result) 製造ＬＴ（実績）.<p>
	 *
	 */
	public void act_mfg_lt(float value) {
		setConstNumber(offset + 54, $act_mfg_lt, value);
	}

	/**
	 * Mfg. LT (Result) 製造ＬＴ（実績）.<p>
	 *
	 */
	public void act_mfg_lt(double value) {
		setConstNumber(offset + 54, $act_mfg_lt, value);
	}


	/**
	 * Scheduled storage completion date (MRP) 格納完了予定日（ＭＲＰ）.<p>
	 *
	 */
	public MCDate mrp_strg_schd_dt() {
		return getConstDate(offset + 55, $mrp_strg_schd_dt);
	}

	/**
	 * Scheduled storage completion date (MRP) 格納完了予定日（ＭＲＰ）.<p>
	 *
	 */
	public void mrp_strg_schd_dt(MCDate value) {
		setConstDate(offset + 55, $mrp_strg_schd_dt, value);
	}


	/**
	 * Scheduled storage completion date 格納完了予定日.<p>
	 *
	 */
	public MCDate strg_schd_dt() {
		return getConstDate(offset + 56, $strg_schd_dt);
	}

	/**
	 * Scheduled storage completion date 格納完了予定日.<p>
	 *
	 */
	public void strg_schd_dt(MCDate value) {
		setConstDate(offset + 56, $strg_schd_dt, value);
	}


	/**
	 * Scheduled storage completion date (Order/PO) 格納完了予定日（指図・発注）.<p>
	 *
	 */
	public MCDate inst_strg_schd_dt() {
		return getConstDate(offset + 57, $inst_strg_schd_dt);
	}

	/**
	 * Scheduled storage completion date (Order/PO) 格納完了予定日（指図・発注）.<p>
	 *
	 */
	public void inst_strg_schd_dt(MCDate value) {
		setConstDate(offset + 57, $inst_strg_schd_dt, value);
	}


	/**
	 * Storage date 格納日.<p>
	 *
	 */
	public MCDate latest_strg_act_dt() {
		return getConstDate(offset + 58, $latest_strg_act_dt);
	}

	/**
	 * Storage date 格納日.<p>
	 *
	 */
	public void latest_strg_act_dt(MCDate value) {
		setConstDate(offset + 58, $latest_strg_act_dt, value);
	}


	/**
	 * Purchase LT (MRP) 購入ＬＴ（ＭＲＰ）.<p>
	 *
	 */
	public MCNumber mrp_purc_lt() {
		return getConstNumber(offset + 59, $mrp_purc_lt);
	}

	/**
	 * Purchase LT (MRP) 購入ＬＴ（ＭＲＰ）.<p>
	 *
	 */
	public void mrp_purc_lt(MCNumber value) {
		setConstNumber(offset + 59, $mrp_purc_lt, value);
	}

	/**
	 * Purchase LT (MRP) 購入ＬＴ（ＭＲＰ）.<p>
	 *
	 */
	public void mrp_purc_lt(int value) {
		setConstNumber(offset + 59, $mrp_purc_lt, value);
	}

	/**
	 * Purchase LT (MRP) 購入ＬＴ（ＭＲＰ）.<p>
	 *
	 */
	public void mrp_purc_lt(long value) {
		setConstNumber(offset + 59, $mrp_purc_lt, value);
	}

	/**
	 * Purchase LT (MRP) 購入ＬＴ（ＭＲＰ）.<p>
	 *
	 */
	public void mrp_purc_lt(float value) {
		setConstNumber(offset + 59, $mrp_purc_lt, value);
	}

	/**
	 * Purchase LT (MRP) 購入ＬＴ（ＭＲＰ）.<p>
	 *
	 */
	public void mrp_purc_lt(double value) {
		setConstNumber(offset + 59, $mrp_purc_lt, value);
	}


	/**
	 * Purchase LT 購入ＬＴ.<p>
	 *
	 */
	public MCNumber purc_lt() {
		return getConstNumber(offset + 60, $purc_lt);
	}

	/**
	 * Purchase LT 購入ＬＴ.<p>
	 *
	 */
	public void purc_lt(MCNumber value) {
		setConstNumber(offset + 60, $purc_lt, value);
	}

	/**
	 * Purchase LT 購入ＬＴ.<p>
	 *
	 */
	public void purc_lt(int value) {
		setConstNumber(offset + 60, $purc_lt, value);
	}

	/**
	 * Purchase LT 購入ＬＴ.<p>
	 *
	 */
	public void purc_lt(long value) {
		setConstNumber(offset + 60, $purc_lt, value);
	}

	/**
	 * Purchase LT 購入ＬＴ.<p>
	 *
	 */
	public void purc_lt(float value) {
		setConstNumber(offset + 60, $purc_lt, value);
	}

	/**
	 * Purchase LT 購入ＬＴ.<p>
	 *
	 */
	public void purc_lt(double value) {
		setConstNumber(offset + 60, $purc_lt, value);
	}


	/**
	 * Purchase LT (Result) 購入ＬＴ（実績）.<p>
	 *
	 */
	public MCNumber act_purc_lt() {
		return getConstNumber(offset + 61, $act_purc_lt);
	}

	/**
	 * Purchase LT (Result) 購入ＬＴ（実績）.<p>
	 *
	 */
	public void act_purc_lt(MCNumber value) {
		setConstNumber(offset + 61, $act_purc_lt, value);
	}

	/**
	 * Purchase LT (Result) 購入ＬＴ（実績）.<p>
	 *
	 */
	public void act_purc_lt(int value) {
		setConstNumber(offset + 61, $act_purc_lt, value);
	}

	/**
	 * Purchase LT (Result) 購入ＬＴ（実績）.<p>
	 *
	 */
	public void act_purc_lt(long value) {
		setConstNumber(offset + 61, $act_purc_lt, value);
	}

	/**
	 * Purchase LT (Result) 購入ＬＴ（実績）.<p>
	 *
	 */
	public void act_purc_lt(float value) {
		setConstNumber(offset + 61, $act_purc_lt, value);
	}

	/**
	 * Purchase LT (Result) 購入ＬＴ（実績）.<p>
	 *
	 */
	public void act_purc_lt(double value) {
		setConstNumber(offset + 61, $act_purc_lt, value);
	}


	/**
	 * Scheduled acceptance date (MRP) 検収予定日（ＭＲＰ）.<p>
	 *
	 */
	public MCDate mrp_accpt_schd_dt() {
		return getConstDate(offset + 62, $mrp_accpt_schd_dt);
	}

	/**
	 * Scheduled acceptance date (MRP) 検収予定日（ＭＲＰ）.<p>
	 *
	 */
	public void mrp_accpt_schd_dt(MCDate value) {
		setConstDate(offset + 62, $mrp_accpt_schd_dt, value);
	}


	/**
	 * Scheduled acceptance date 検収予定日.<p>
	 *
	 */
	public MCDate accpt_schd_dt() {
		return getConstDate(offset + 63, $accpt_schd_dt);
	}

	/**
	 * Scheduled acceptance date 検収予定日.<p>
	 *
	 */
	public void accpt_schd_dt(MCDate value) {
		setConstDate(offset + 63, $accpt_schd_dt, value);
	}


	/**
	 * Scheduled acceptance date (PO) 検収予定日（発注）.<p>
	 *
	 */
	public MCDate inst_accpt_schd_dt() {
		return getConstDate(offset + 64, $inst_accpt_schd_dt);
	}

	/**
	 * Scheduled acceptance date (PO) 検収予定日（発注）.<p>
	 *
	 */
	public void inst_accpt_schd_dt(MCDate value) {
		setConstDate(offset + 64, $inst_accpt_schd_dt, value);
	}


	/**
	 * Acceptance date 検収日.<p>
	 *
	 */
	public MCDate latest_accpt_act_dt() {
		return getConstDate(offset + 65, $latest_accpt_act_dt);
	}

	/**
	 * Acceptance date 検収日.<p>
	 *
	 */
	public void latest_accpt_act_dt(MCDate value) {
		setConstDate(offset + 65, $latest_accpt_act_dt, value);
	}


	/**
	 * Scheduled inspection start date (MRP) 検査着手予定日（ＭＲＰ）.<p>
	 *
	 */
	public MCDate mrp_insp_st_schd_dt() {
		return getConstDate(offset + 66, $mrp_insp_st_schd_dt);
	}

	/**
	 * Scheduled inspection start date (MRP) 検査着手予定日（ＭＲＰ）.<p>
	 *
	 */
	public void mrp_insp_st_schd_dt(MCDate value) {
		setConstDate(offset + 66, $mrp_insp_st_schd_dt, value);
	}


	/**
	 * Scheduled inspection start date 検査着手予定日.<p>
	 *
	 */
	public MCDate insp_st_schd_dt() {
		return getConstDate(offset + 67, $insp_st_schd_dt);
	}

	/**
	 * Scheduled inspection start date 検査着手予定日.<p>
	 *
	 */
	public void insp_st_schd_dt(MCDate value) {
		setConstDate(offset + 67, $insp_st_schd_dt, value);
	}


	/**
	 * Scheduled inspection start date (Order/PO) 検査着手予定日（指図・発注）.<p>
	 *
	 */
	public MCDate inst_insp_st_schd_dt() {
		return getConstDate(offset + 68, $inst_insp_st_schd_dt);
	}

	/**
	 * Scheduled inspection start date (Order/PO) 検査着手予定日（指図・発注）.<p>
	 *
	 */
	public void inst_insp_st_schd_dt(MCDate value) {
		setConstDate(offset + 68, $inst_insp_st_schd_dt, value);
	}


	/**
	 * Inspection start date 検査着手日.<p>
	 *
	 */
	public MCDate latest_insp_st_act_dt() {
		return getConstDate(offset + 69, $latest_insp_st_act_dt);
	}

	/**
	 * Inspection start date 検査着手日.<p>
	 *
	 */
	public void latest_insp_st_act_dt(MCDate value) {
		setConstDate(offset + 69, $latest_insp_st_act_dt, value);
	}


	/**
	 * Scheduled inspection end date (MRP) 検査終了予定日（ＭＲＰ）.<p>
	 *
	 */
	public MCDate mrp_insp_end_schd_dt() {
		return getConstDate(offset + 70, $mrp_insp_end_schd_dt);
	}

	/**
	 * Scheduled inspection end date (MRP) 検査終了予定日（ＭＲＰ）.<p>
	 *
	 */
	public void mrp_insp_end_schd_dt(MCDate value) {
		setConstDate(offset + 70, $mrp_insp_end_schd_dt, value);
	}


	/**
	 * Scheduled inspection end date 検査終了予定日.<p>
	 *
	 */
	public MCDate insp_end_schd_dt() {
		return getConstDate(offset + 71, $insp_end_schd_dt);
	}

	/**
	 * Scheduled inspection end date 検査終了予定日.<p>
	 *
	 */
	public void insp_end_schd_dt(MCDate value) {
		setConstDate(offset + 71, $insp_end_schd_dt, value);
	}


	/**
	 * Scheduled inspection end date (Order/PO) 検査終了予定日（指図・発注）.<p>
	 *
	 */
	public MCDate inst_insp_end_schd_dt() {
		return getConstDate(offset + 72, $inst_insp_end_schd_dt);
	}

	/**
	 * Scheduled inspection end date (Order/PO) 検査終了予定日（指図・発注）.<p>
	 *
	 */
	public void inst_insp_end_schd_dt(MCDate value) {
		setConstDate(offset + 72, $inst_insp_end_schd_dt, value);
	}


	/**
	 * Inspection end date 検査終了日.<p>
	 *
	 */
	public MCDate latest_insp_end_act_dt() {
		return getConstDate(offset + 73, $latest_insp_end_act_dt);
	}

	/**
	 * Inspection end date 検査終了日.<p>
	 *
	 */
	public void latest_insp_end_act_dt(MCDate value) {
		setConstDate(offset + 73, $latest_insp_end_act_dt, value);
	}


	/**
	 * Available date (MRP) 使用可能予定日（ＭＲＰ）.<p>
	 *
	 */
	public MCDate mrp_avl_schd_dt() {
		return getConstDate(offset + 74, $mrp_avl_schd_dt);
	}

	/**
	 * Available date (MRP) 使用可能予定日（ＭＲＰ）.<p>
	 *
	 */
	public void mrp_avl_schd_dt(MCDate value) {
		setConstDate(offset + 74, $mrp_avl_schd_dt, value);
	}


	/**
	 * Available date 使用可能予定日.<p>
	 *
	 */
	public MCDate avl_schd_dt() {
		return getConstDate(offset + 75, $avl_schd_dt);
	}

	/**
	 * Available date 使用可能予定日.<p>
	 *
	 */
	public void avl_schd_dt(MCDate value) {
		setConstDate(offset + 75, $avl_schd_dt, value);
	}


	/**
	 * Available date (Order/PO) 使用可能予定日（指図・発注）.<p>
	 *
	 */
	public MCDate po_avl_schd_dt() {
		return getConstDate(offset + 76, $po_avl_schd_dt);
	}

	/**
	 * Available date (Order/PO) 使用可能予定日（指図・発注）.<p>
	 *
	 */
	public void po_avl_schd_dt(MCDate value) {
		setConstDate(offset + 76, $po_avl_schd_dt, value);
	}


	/**
	 * Available date 使用可能日.<p>
	 *
	 */
	public MCDate avl_dt() {
		return getConstDate(offset + 77, $avl_dt);
	}

	/**
	 * Available date 使用可能日.<p>
	 *
	 */
	public void avl_dt(MCDate value) {
		setConstDate(offset + 77, $avl_dt, value);
	}


	/**
	 * Available date (GR/GI schedule) 使用可能予定日（受払予定）.<p>
	 *
	 */
	public MCDate io_avl_schd_dt() {
		return getConstDate(offset + 78, $io_avl_schd_dt);
	}

	/**
	 * Available date (GR/GI schedule) 使用可能予定日（受払予定）.<p>
	 *
	 */
	public void io_avl_schd_dt(MCDate value) {
		setConstDate(offset + 78, $io_avl_schd_dt, value);
	}


	/**
	 * Delay expectation 遅れ見込.<p>
	 *
	 */
	public boolean delay_expt_flg() {
		return getConstBoolean(offset + 79, $delay_expt_flg);
	}

	/**
	 * Delay expectation 遅れ見込.<p>
	 *
	 */
	public void delay_expt_flg(boolean value) {
		setConstBoolean(offset + 79, $delay_expt_flg, value);
	}


	/**
	 * Scheduled allocation date 引当予定日.<p>
	 *
	 */
	public MCDate schd_so_dt() {
		return getConstDate(offset + 80, $schd_so_dt);
	}

	/**
	 * Scheduled allocation date 引当予定日.<p>
	 *
	 */
	public void schd_so_dt(MCDate value) {
		setConstDate(offset + 80, $schd_so_dt, value);
	}


	/**
	 * Extra days for scheduled usage 使用予定余裕日数.<p>
	 *
	 */
	public MCNumber margin_days() {
		return getConstNumber(offset + 81, $margin_days);
	}

	/**
	 * Extra days for scheduled usage 使用予定余裕日数.<p>
	 *
	 */
	public void margin_days(MCNumber value) {
		setConstNumber(offset + 81, $margin_days, value);
	}

	/**
	 * Extra days for scheduled usage 使用予定余裕日数.<p>
	 *
	 */
	public void margin_days(int value) {
		setConstNumber(offset + 81, $margin_days, value);
	}

	/**
	 * Extra days for scheduled usage 使用予定余裕日数.<p>
	 *
	 */
	public void margin_days(long value) {
		setConstNumber(offset + 81, $margin_days, value);
	}

	/**
	 * Extra days for scheduled usage 使用予定余裕日数.<p>
	 *
	 */
	public void margin_days(float value) {
		setConstNumber(offset + 81, $margin_days, value);
	}

	/**
	 * Extra days for scheduled usage 使用予定余裕日数.<p>
	 *
	 */
	public void margin_days(double value) {
		setConstNumber(offset + 81, $margin_days, value);
	}


	/**
	 * Storage location cd. 格納場所ＣＤ.<p>
	 *
	 */
	public String strg_loc_cd() {
		return getConstString(offset + 82, $strg_loc_cd);
	}

	/**
	 * Storage location cd. 格納場所ＣＤ.<p>
	 *
	 */
	public void strg_loc_cd(String value) {
		setConstString(offset + 82, $strg_loc_cd, value);
	}


	/**
	 * Storage location name 格納場所名.<p>
	 *
	 */
	public String strg_loc_nm() {
		return getConstString(offset + 83, $strg_loc_nm);
	}

	/**
	 * Storage location name 格納場所名.<p>
	 *
	 */
	public void strg_loc_nm(String value) {
		setConstString(offset + 83, $strg_loc_nm, value);
	}


	/**
	 * Mfg. location cd. 製造場所ＣＤ.<p>
	 *
	 */
	public String mfg_loc_cd() {
		return getConstString(offset + 84, $mfg_loc_cd);
	}

	/**
	 * Mfg. location cd. 製造場所ＣＤ.<p>
	 *
	 */
	public void mfg_loc_cd(String value) {
		setConstString(offset + 84, $mfg_loc_cd, value);
	}


	/**
	 * Mfg. location name 製造場所名.<p>
	 *
	 */
	public String mfg_loc_nm() {
		return getConstString(offset + 85, $mfg_loc_nm);
	}

	/**
	 * Mfg. location name 製造場所名.<p>
	 *
	 */
	public void mfg_loc_nm(String value) {
		setConstString(offset + 85, $mfg_loc_nm, value);
	}


	/**
	 * Supplier cd. 発注先ＣＤ.<p>
	 *
	 */
	public String sppl_cd() {
		return getConstString(offset + 86, $sppl_cd);
	}

	/**
	 * Supplier cd. 発注先ＣＤ.<p>
	 *
	 */
	public void sppl_cd(String value) {
		setConstString(offset + 86, $sppl_cd, value);
	}


	/**
	 * Supplier name 発注先名.<p>
	 *
	 */
	public String sppl_nm() {
		return getConstString(offset + 87, $sppl_nm);
	}

	/**
	 * Supplier name 発注先名.<p>
	 *
	 */
	public void sppl_nm(String value) {
		setConstString(offset + 87, $sppl_nm, value);
	}


	/**
	 * Maker cd. メーカＣＤ.<p>
	 *
	 */
	public String maker_cd() {
		return getConstString(offset + 88, $maker_cd);
	}

	/**
	 * Maker cd. メーカＣＤ.<p>
	 *
	 */
	public void maker_cd(String value) {
		setConstString(offset + 88, $maker_cd, value);
	}


	/**
	 * Maker name メーカ名.<p>
	 *
	 */
	public String maker_nm() {
		return getConstString(offset + 89, $maker_nm);
	}

	/**
	 * Maker name メーカ名.<p>
	 *
	 */
	public void maker_nm(String value) {
		setConstString(offset + 89, $maker_nm, value);
	}


	/**
	 * Requested location cd. 依頼先場所ＣＤ.<p>
	 *
	 */
	public String rqst_loc_cd() {
		return getConstString(offset + 90, $rqst_loc_cd);
	}

	/**
	 * Requested location cd. 依頼先場所ＣＤ.<p>
	 *
	 */
	public void rqst_loc_cd(String value) {
		setConstString(offset + 90, $rqst_loc_cd, value);
	}


	/**
	 * Location name (Requested) 依頼先場所名.<p>
	 *
	 */
	public String rqst_loc_nm() {
		return getConstString(offset + 91, $rqst_loc_nm);
	}

	/**
	 * Location name (Requested) 依頼先場所名.<p>
	 *
	 */
	public void rqst_loc_nm(String value) {
		setConstString(offset + 91, $rqst_loc_nm, value);
	}


	/**
	 * Requested WG cd. 依頼先ワーキンググループＣＤ.<p>
	 *
	 */
	public String rqst_wg_cd() {
		return getConstString(offset + 92, $rqst_wg_cd);
	}

	/**
	 * Requested WG cd. 依頼先ワーキンググループＣＤ.<p>
	 *
	 */
	public void rqst_wg_cd(String value) {
		setConstString(offset + 92, $rqst_wg_cd, value);
	}


	/**
	 * Requested WG name 依頼先ワーキンググループ名.<p>
	 *
	 */
	public String rqst_wg_nm() {
		return getConstString(offset + 93, $rqst_wg_nm);
	}

	/**
	 * Requested WG name 依頼先ワーキンググループ名.<p>
	 *
	 */
	public void rqst_wg_nm(String value) {
		setConstString(offset + 93, $rqst_wg_nm, value);
	}


	/**
	 * Operation pattern 工程パタン.<p>
	 *
	 */
	public String oper_ptn() {
		return getConstString(offset + 94, $oper_ptn);
	}

	/**
	 * Operation pattern 工程パタン.<p>
	 *
	 */
	public void oper_ptn(String value) {
		setConstString(offset + 94, $oper_ptn, value);
	}


	/**
	 * BOM pattern 構成パタン.<p>
	 *
	 */
	public String bom_ptn() {
		return getConstString(offset + 95, $bom_ptn);
	}

	/**
	 * BOM pattern 構成パタン.<p>
	 *
	 */
	public void bom_ptn(String value) {
		setConstString(offset + 95, $bom_ptn, value);
	}


	/**
	 * Requirements No. 所要ＮＯ.<p>
	 *
	 */
	public String rqmt_no() {
		return getConstString(offset + 96, $rqmt_no);
	}

	/**
	 * Requirements No. 所要ＮＯ.<p>
	 *
	 */
	public void rqmt_no(String value) {
		setConstString(offset + 96, $rqmt_no, value);
	}


	/**
	 * Disallow procurement 手配不許可.<p>
	 *
	 */
	public boolean not_fix_flg() {
		return getConstBoolean(offset + 97, $not_fix_flg);
	}

	/**
	 * Disallow procurement 手配不許可.<p>
	 *
	 */
	public void not_fix_flg(boolean value) {
		setConstBoolean(offset + 97, $not_fix_flg, value);
	}


	/**
	 * SEIBAN No. 1 手配ＮＯ１.<p>
	 *
	 */
	public String sno1() {
		return getConstString(offset + 98, $sno1);
	}

	/**
	 * SEIBAN No. 1 手配ＮＯ１.<p>
	 *
	 */
	public void sno1(String value) {
		setConstString(offset + 98, $sno1, value);
	}


	/**
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public String sno2() {
		return getConstString(offset + 99, $sno2);
	}

	/**
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public void sno2(String value) {
		setConstString(offset + 99, $sno2, value);
	}


	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public String sno3() {
		return getConstString(offset + 100, $sno3);
	}

	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public void sno3(String value) {
		setConstString(offset + 100, $sno3, value);
	}


	/**
	 * SEIBAN No. 4 手配ＮＯ４.<p>
	 *
	 */
	public String sno4() {
		return getConstString(offset + 101, $sno4);
	}

	/**
	 * SEIBAN No. 4 手配ＮＯ４.<p>
	 *
	 */
	public void sno4(String value) {
		setConstString(offset + 101, $sno4, value);
	}


	/**
	 * Sales project No. 案件ＮＯ.<p>
	 *
	 */
	public String wrk_no() {
		return getConstString(offset + 102, $wrk_no);
	}

	/**
	 * Sales project No. 案件ＮＯ.<p>
	 *
	 */
	public void wrk_no(String value) {
		setConstString(offset + 102, $wrk_no, value);
	}


	/**
	 * Sales project name 案件名.<p>
	 *
	 */
	public String wrk_nm() {
		return getConstString(offset + 103, $wrk_nm);
	}

	/**
	 * Sales project name 案件名.<p>
	 *
	 */
	public void wrk_nm(String value) {
		setConstString(offset + 103, $wrk_nm, value);
	}


	/**
	 * Order generation type オーダ生成区分.<p>
	 *
	 */
	public String ord_gnrt_typ() {
		return getConstString(offset + 104, $ord_gnrt_typ);
	}

	/**
	 * Order generation type オーダ生成区分.<p>
	 *
	 */
	public void ord_gnrt_typ(String value) {
		setConstString(offset + 104, $ord_gnrt_typ, value);
	}


	/**
	 * Order generation type name オーダ生成区分名.<p>
	 *
	 */
	public String ord_gnrt_typ_nm() {
		return getConstString(offset + 105, $ord_gnrt_typ_nm);
	}

	/**
	 * Order generation type name オーダ生成区分名.<p>
	 *
	 */
	public void ord_gnrt_typ_nm(String value) {
		setConstString(offset + 105, $ord_gnrt_typ_nm, value);
	}


	/**
	 * Simulation No. シミュレーションＮＯ.<p>
	 *
	 */
	public String sim_mrp_no() {
		return getConstString(offset + 106, $sim_mrp_no);
	}

	/**
	 * Simulation No. シミュレーションＮＯ.<p>
	 *
	 */
	public void sim_mrp_no(String value) {
		setConstString(offset + 106, $sim_mrp_no, value);
	}


	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public String wg_cd() {
		return getConstString(offset + 107, $wg_cd);
	}

	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public void wg_cd(String value) {
		setConstString(offset + 107, $wg_cd, value);
	}


	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public String wg_nm() {
		return getConstString(offset + 108, $wg_nm);
	}

	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public void wg_nm(String value) {
		setConstString(offset + 108, $wg_nm, value);
	}


	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public String intr_rmrks() {
		return getConstString(offset + 109, $intr_rmrks);
	}

	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public void intr_rmrks(String value) {
		setConstString(offset + 109, $intr_rmrks, value);
	}


	/**
	 * Firm date 確定日.<p>
	 *
	 */
	public MCDate fix_dt() {
		return getConstDate(offset + 110, $fix_dt);
	}

	/**
	 * Firm date 確定日.<p>
	 *
	 */
	public void fix_dt(MCDate value) {
		setConstDate(offset + 110, $fix_dt, value);
	}


	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public String sub_char1() {
		return getConstString(offset + 111, $sub_char1);
	}

	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public void sub_char1(String value) {
		setConstString(offset + 111, $sub_char1, value);
	}


	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public String sub_char2() {
		return getConstString(offset + 112, $sub_char2);
	}

	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public void sub_char2(String value) {
		setConstString(offset + 112, $sub_char2, value);
	}


	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public String sub_char3() {
		return getConstString(offset + 113, $sub_char3);
	}

	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public void sub_char3(String value) {
		setConstString(offset + 113, $sub_char3, value);
	}


	/**
	 * Order import オーダ受信.<p>
	 *
	 */
	public boolean ord_rcv_flg() {
		return getConstBoolean(offset + 114, $ord_rcv_flg);
	}

	/**
	 * Order import オーダ受信.<p>
	 *
	 */
	public void ord_rcv_flg(boolean value) {
		setConstBoolean(offset + 114, $ord_rcv_flg, value);
	}


	/**
	 * Export Order オーダ送信.<p>
	 *
	 */
	public boolean ord_snd_flg() {
		return getConstBoolean(offset + 115, $ord_snd_flg);
	}

	/**
	 * Export Order オーダ送信.<p>
	 *
	 */
	public void ord_snd_flg(boolean value) {
		setConstBoolean(offset + 115, $ord_snd_flg, value);
	}


	/**
	 * External system cd. 外部システムＣＤ.<p>
	 *
	 */
	public String ext_sys_cd() {
		return getConstString(offset + 116, $ext_sys_cd);
	}

	/**
	 * External system cd. 外部システムＣＤ.<p>
	 *
	 */
	public void ext_sys_cd(String value) {
		setConstString(offset + 116, $ext_sys_cd, value);
	}


	/**
	 * External system name 外部システム名.<p>
	 *
	 */
	public String ext_sys_nm() {
		return getConstString(offset + 117, $ext_sys_nm);
	}

	/**
	 * External system name 外部システム名.<p>
	 *
	 */
	public void ext_sys_nm(String value) {
		setConstString(offset + 117, $ext_sys_nm, value);
	}


	/**
	 * External item order No. 外部品目オーダＮＯ.<p>
	 *
	 */
	public String ext_itm_ord_no() {
		return getConstString(offset + 118, $ext_itm_ord_no);
	}

	/**
	 * External item order No. 外部品目オーダＮＯ.<p>
	 *
	 */
	public void ext_itm_ord_no(String value) {
		setConstString(offset + 118, $ext_itm_ord_no, value);
	}


	/**
	 * Scheduler frozen target スケジューラ凍結対象.<p>
	 *
	 */
	public boolean for_scheduler_frozen_flg() {
		return getConstBoolean(offset + 119, $for_scheduler_frozen_flg);
	}

	/**
	 * Scheduler frozen target スケジューラ凍結対象.<p>
	 *
	 */
	public void for_scheduler_frozen_flg(boolean value) {
		setConstBoolean(offset + 119, $for_scheduler_frozen_flg, value);
	}


	/**
	 * Scheduler frozen スケジューラ凍結.<p>
	 *
	 */
	public boolean scheduler_frozen_flg() {
		return getConstBoolean(offset + 120, $scheduler_frozen_flg);
	}

	/**
	 * Scheduler frozen スケジューラ凍結.<p>
	 *
	 */
	public void scheduler_frozen_flg(boolean value) {
		setConstBoolean(offset + 120, $scheduler_frozen_flg, value);
	}


	/**
	 * Shortage of required qty. 必要数量不足.<p>
	 *
	 */
	public boolean schd_yield_red_flg() {
		return getConstBoolean(offset + 121, $schd_yield_red_flg);
	}

	/**
	 * Shortage of required qty. 必要数量不足.<p>
	 *
	 */
	public void schd_yield_red_flg(boolean value) {
		setConstBoolean(offset + 121, $schd_yield_red_flg, value);
	}


	/**
	 * Start date delayed 着手日遅れ.<p>
	 *
	 */
	public boolean st_dt_red_flg() {
		return getConstBoolean(offset + 122, $st_dt_red_flg);
	}

	/**
	 * Start date delayed 着手日遅れ.<p>
	 *
	 */
	public void st_dt_red_flg(boolean value) {
		setConstBoolean(offset + 122, $st_dt_red_flg, value);
	}


	/**
	 * End date delayed 終了日遅れ.<p>
	 *
	 */
	public boolean end_dt_red_flg() {
		return getConstBoolean(offset + 123, $end_dt_red_flg);
	}

	/**
	 * End date delayed 終了日遅れ.<p>
	 *
	 */
	public void end_dt_red_flg(boolean value) {
		setConstBoolean(offset + 123, $end_dt_red_flg, value);
	}


	/**
	 * Available date delayed 使用可能予定日遅れ.<p>
	 *
	 */
	public boolean avl_schd_dt_red_flg() {
		return getConstBoolean(offset + 124, $avl_schd_dt_red_flg);
	}

	/**
	 * Available date delayed 使用可能予定日遅れ.<p>
	 *
	 */
	public void avl_schd_dt_red_flg(boolean value) {
		setConstBoolean(offset + 124, $avl_schd_dt_red_flg, value);
	}


	/**
	 * Allocation schedule delayed 引当予定遅れ.<p>
	 *
	 */
	public boolean alloc_pln_red_flg() {
		return getConstBoolean(offset + 125, $alloc_pln_red_flg);
	}

	/**
	 * Allocation schedule delayed 引当予定遅れ.<p>
	 *
	 */
	public void alloc_pln_red_flg(boolean value) {
		setConstBoolean(offset + 125, $alloc_pln_red_flg, value);
	}


	/**
	 * Surplus order 余剰オーダ.<p>
	 *
	 */
	public boolean surplus_ord_flg() {
		return getConstBoolean(offset + 126, $surplus_ord_flg);
	}

	/**
	 * Surplus order 余剰オーダ.<p>
	 *
	 */
	public void surplus_ord_flg(boolean value) {
		setConstBoolean(offset + 126, $surplus_ord_flg, value);
	}


	/**
	 * No abnormality 異常なし.<p>
	 *
	 */
	public boolean no_problem_flg() {
		return getConstBoolean(offset + 127, $no_problem_flg);
	}

	/**
	 * No abnormality 異常なし.<p>
	 *
	 */
	public void no_problem_flg(boolean value) {
		setConstBoolean(offset + 127, $no_problem_flg, value);
	}


	/**
	 * Item classification cd. 1 品目分類ＣＤ１.<p>
	 *
	 */
	public String itm_grp_cd1() {
		return getConstString(offset + 128, $itm_grp_cd1);
	}

	/**
	 * Item classification cd. 1 品目分類ＣＤ１.<p>
	 *
	 */
	public void itm_grp_cd1(String value) {
		setConstString(offset + 128, $itm_grp_cd1, value);
	}


	/**
	 * Item classification name 1 品目分類名１.<p>
	 *
	 */
	public String itm_grp_nm1() {
		return getConstString(offset + 129, $itm_grp_nm1);
	}

	/**
	 * Item classification name 1 品目分類名１.<p>
	 *
	 */
	public void itm_grp_nm1(String value) {
		setConstString(offset + 129, $itm_grp_nm1, value);
	}


	/**
	 * Item classification cd. 2 品目分類ＣＤ２.<p>
	 *
	 */
	public String itm_grp_cd2() {
		return getConstString(offset + 130, $itm_grp_cd2);
	}

	/**
	 * Item classification cd. 2 品目分類ＣＤ２.<p>
	 *
	 */
	public void itm_grp_cd2(String value) {
		setConstString(offset + 130, $itm_grp_cd2, value);
	}


	/**
	 * Item classification name 2 品目分類名２.<p>
	 *
	 */
	public String itm_grp_nm2() {
		return getConstString(offset + 131, $itm_grp_nm2);
	}

	/**
	 * Item classification name 2 品目分類名２.<p>
	 *
	 */
	public void itm_grp_nm2(String value) {
		setConstString(offset + 131, $itm_grp_nm2, value);
	}


	/**
	 * Item classification cd. 3 品目分類ＣＤ３.<p>
	 *
	 */
	public String itm_grp_cd3() {
		return getConstString(offset + 132, $itm_grp_cd3);
	}

	/**
	 * Item classification cd. 3 品目分類ＣＤ３.<p>
	 *
	 */
	public void itm_grp_cd3(String value) {
		setConstString(offset + 132, $itm_grp_cd3, value);
	}


	/**
	 * Item classification name 3 品目分類名３.<p>
	 *
	 */
	public String itm_grp_nm3() {
		return getConstString(offset + 133, $itm_grp_nm3);
	}

	/**
	 * Item classification name 3 品目分類名３.<p>
	 *
	 */
	public void itm_grp_nm3(String value) {
		setConstString(offset + 133, $itm_grp_nm3, value);
	}


	/**
	 * Item classification cd. 4 品目分類ＣＤ４.<p>
	 *
	 */
	public String itm_grp_cd4() {
		return getConstString(offset + 134, $itm_grp_cd4);
	}

	/**
	 * Item classification cd. 4 品目分類ＣＤ４.<p>
	 *
	 */
	public void itm_grp_cd4(String value) {
		setConstString(offset + 134, $itm_grp_cd4, value);
	}


	/**
	 * Item classification name 4 品目分類名４.<p>
	 *
	 */
	public String itm_grp_nm4() {
		return getConstString(offset + 135, $itm_grp_nm4);
	}

	/**
	 * Item classification name 4 品目分類名４.<p>
	 *
	 */
	public void itm_grp_nm4(String value) {
		setConstString(offset + 135, $itm_grp_nm4, value);
	}


	/**
	 * Item classification cd. 5 品目分類ＣＤ５.<p>
	 *
	 */
	public String itm_grp_cd5() {
		return getConstString(offset + 136, $itm_grp_cd5);
	}

	/**
	 * Item classification cd. 5 品目分類ＣＤ５.<p>
	 *
	 */
	public void itm_grp_cd5(String value) {
		setConstString(offset + 136, $itm_grp_cd5, value);
	}


	/**
	 * Item classification name 5 品目分類名５.<p>
	 *
	 */
	public String itm_grp_nm5() {
		return getConstString(offset + 137, $itm_grp_nm5);
	}

	/**
	 * Item classification name 5 品目分類名５.<p>
	 *
	 */
	public void itm_grp_nm5(String value) {
		setConstString(offset + 137, $itm_grp_nm5, value);
	}


	/**
	 * Item classification cd. 6 品目分類ＣＤ６.<p>
	 *
	 */
	public String itm_grp_cd6() {
		return getConstString(offset + 138, $itm_grp_cd6);
	}

	/**
	 * Item classification cd. 6 品目分類ＣＤ６.<p>
	 *
	 */
	public void itm_grp_cd6(String value) {
		setConstString(offset + 138, $itm_grp_cd6, value);
	}


	/**
	 * Item classification name 6 品目分類名６.<p>
	 *
	 */
	public String itm_grp_nm6() {
		return getConstString(offset + 139, $itm_grp_nm6);
	}

	/**
	 * Item classification name 6 品目分類名６.<p>
	 *
	 */
	public void itm_grp_nm6(String value) {
		setConstString(offset + 139, $itm_grp_nm6, value);
	}


	/**
	 * Item classification cd. 7 品目分類ＣＤ７.<p>
	 *
	 */
	public String itm_grp_cd7() {
		return getConstString(offset + 140, $itm_grp_cd7);
	}

	/**
	 * Item classification cd. 7 品目分類ＣＤ７.<p>
	 *
	 */
	public void itm_grp_cd7(String value) {
		setConstString(offset + 140, $itm_grp_cd7, value);
	}


	/**
	 * Item classification name 7 品目分類名７.<p>
	 *
	 */
	public String itm_grp_nm7() {
		return getConstString(offset + 141, $itm_grp_nm7);
	}

	/**
	 * Item classification name 7 品目分類名７.<p>
	 *
	 */
	public void itm_grp_nm7(String value) {
		setConstString(offset + 141, $itm_grp_nm7, value);
	}


	/**
	 * Item classification cd. 8 品目分類ＣＤ８.<p>
	 *
	 */
	public String itm_grp_cd8() {
		return getConstString(offset + 142, $itm_grp_cd8);
	}

	/**
	 * Item classification cd. 8 品目分類ＣＤ８.<p>
	 *
	 */
	public void itm_grp_cd8(String value) {
		setConstString(offset + 142, $itm_grp_cd8, value);
	}


	/**
	 * Item classification name 8 品目分類名８.<p>
	 *
	 */
	public String itm_grp_nm8() {
		return getConstString(offset + 143, $itm_grp_nm8);
	}

	/**
	 * Item classification name 8 品目分類名８.<p>
	 *
	 */
	public void itm_grp_nm8(String value) {
		setConstString(offset + 143, $itm_grp_nm8, value);
	}


	/**
	 * Item classification cd. 9 品目分類ＣＤ９.<p>
	 *
	 */
	public String itm_grp_cd9() {
		return getConstString(offset + 144, $itm_grp_cd9);
	}

	/**
	 * Item classification cd. 9 品目分類ＣＤ９.<p>
	 *
	 */
	public void itm_grp_cd9(String value) {
		setConstString(offset + 144, $itm_grp_cd9, value);
	}


	/**
	 * Item classification name 9 品目分類名９.<p>
	 *
	 */
	public String itm_grp_nm9() {
		return getConstString(offset + 145, $itm_grp_nm9);
	}

	/**
	 * Item classification name 9 品目分類名９.<p>
	 *
	 */
	public void itm_grp_nm9(String value) {
		setConstString(offset + 145, $itm_grp_nm9, value);
	}


	/**
	 * Item classification cd. 10 品目分類ＣＤ１０.<p>
	 *
	 */
	public String itm_grp_cd10() {
		return getConstString(offset + 146, $itm_grp_cd10);
	}

	/**
	 * Item classification cd. 10 品目分類ＣＤ１０.<p>
	 *
	 */
	public void itm_grp_cd10(String value) {
		setConstString(offset + 146, $itm_grp_cd10, value);
	}


	/**
	 * Item classification name 10 品目分類名１０.<p>
	 *
	 */
	public String itm_grp_nm10() {
		return getConstString(offset + 147, $itm_grp_nm10);
	}

	/**
	 * Item classification name 10 品目分類名１０.<p>
	 *
	 */
	public void itm_grp_nm10(String value) {
		setConstString(offset + 147, $itm_grp_nm10, value);
	}


	/**
	 * Supplier classification cd. 1 発注先分類ＣＤ１.<p>
	 *
	 */
	public String sppl_grp_cd1() {
		return getConstString(offset + 148, $sppl_grp_cd1);
	}

	/**
	 * Supplier classification cd. 1 発注先分類ＣＤ１.<p>
	 *
	 */
	public void sppl_grp_cd1(String value) {
		setConstString(offset + 148, $sppl_grp_cd1, value);
	}


	/**
	 * Supplier classification name 1 発注先分類名１.<p>
	 *
	 */
	public String sppl_grp_nm1() {
		return getConstString(offset + 149, $sppl_grp_nm1);
	}

	/**
	 * Supplier classification name 1 発注先分類名１.<p>
	 *
	 */
	public void sppl_grp_nm1(String value) {
		setConstString(offset + 149, $sppl_grp_nm1, value);
	}


	/**
	 * Supplier classification cd. 2 発注先分類ＣＤ２.<p>
	 *
	 */
	public String sppl_grp_cd2() {
		return getConstString(offset + 150, $sppl_grp_cd2);
	}

	/**
	 * Supplier classification cd. 2 発注先分類ＣＤ２.<p>
	 *
	 */
	public void sppl_grp_cd2(String value) {
		setConstString(offset + 150, $sppl_grp_cd2, value);
	}


	/**
	 * Supplier classification name 2 発注先分類名２.<p>
	 *
	 */
	public String sppl_grp_nm2() {
		return getConstString(offset + 151, $sppl_grp_nm2);
	}

	/**
	 * Supplier classification name 2 発注先分類名２.<p>
	 *
	 */
	public void sppl_grp_nm2(String value) {
		setConstString(offset + 151, $sppl_grp_nm2, value);
	}


	/**
	 * Supplier classification cd. 3 発注先分類ＣＤ３.<p>
	 *
	 */
	public String sppl_grp_cd3() {
		return getConstString(offset + 152, $sppl_grp_cd3);
	}

	/**
	 * Supplier classification cd. 3 発注先分類ＣＤ３.<p>
	 *
	 */
	public void sppl_grp_cd3(String value) {
		setConstString(offset + 152, $sppl_grp_cd3, value);
	}


	/**
	 * Supplier classification name 3 発注先分類名３.<p>
	 *
	 */
	public String sppl_grp_nm3() {
		return getConstString(offset + 153, $sppl_grp_nm3);
	}

	/**
	 * Supplier classification name 3 発注先分類名３.<p>
	 *
	 */
	public void sppl_grp_nm3(String value) {
		setConstString(offset + 153, $sppl_grp_nm3, value);
	}


	/**
	 * Supplier classification cd. 4 発注先分類ＣＤ４.<p>
	 *
	 */
	public String sppl_grp_cd4() {
		return getConstString(offset + 154, $sppl_grp_cd4);
	}

	/**
	 * Supplier classification cd. 4 発注先分類ＣＤ４.<p>
	 *
	 */
	public void sppl_grp_cd4(String value) {
		setConstString(offset + 154, $sppl_grp_cd4, value);
	}


	/**
	 * Supplier classification name 4 発注先分類名４.<p>
	 *
	 */
	public String sppl_grp_nm4() {
		return getConstString(offset + 155, $sppl_grp_nm4);
	}

	/**
	 * Supplier classification name 4 発注先分類名４.<p>
	 *
	 */
	public void sppl_grp_nm4(String value) {
		setConstString(offset + 155, $sppl_grp_nm4, value);
	}


	/**
	 * Supplier classification cd. 5 発注先分類ＣＤ５.<p>
	 *
	 */
	public String sppl_grp_cd5() {
		return getConstString(offset + 156, $sppl_grp_cd5);
	}

	/**
	 * Supplier classification cd. 5 発注先分類ＣＤ５.<p>
	 *
	 */
	public void sppl_grp_cd5(String value) {
		setConstString(offset + 156, $sppl_grp_cd5, value);
	}


	/**
	 * Supplier classification name 5 発注先分類名５.<p>
	 *
	 */
	public String sppl_grp_nm5() {
		return getConstString(offset + 157, $sppl_grp_nm5);
	}

	/**
	 * Supplier classification name 5 発注先分類名５.<p>
	 *
	 */
	public void sppl_grp_nm5(String value) {
		setConstString(offset + 157, $sppl_grp_nm5, value);
	}


	/**
	 * Supplier classification cd. 6 発注先分類ＣＤ６.<p>
	 *
	 */
	public String sppl_grp_cd6() {
		return getConstString(offset + 158, $sppl_grp_cd6);
	}

	/**
	 * Supplier classification cd. 6 発注先分類ＣＤ６.<p>
	 *
	 */
	public void sppl_grp_cd6(String value) {
		setConstString(offset + 158, $sppl_grp_cd6, value);
	}


	/**
	 * Supplier classification name 6 発注先分類名６.<p>
	 *
	 */
	public String sppl_grp_nm6() {
		return getConstString(offset + 159, $sppl_grp_nm6);
	}

	/**
	 * Supplier classification name 6 発注先分類名６.<p>
	 *
	 */
	public void sppl_grp_nm6(String value) {
		setConstString(offset + 159, $sppl_grp_nm6, value);
	}


	/**
	 * Supplier classification cd. 7 発注先分類ＣＤ７.<p>
	 *
	 */
	public String sppl_grp_cd7() {
		return getConstString(offset + 160, $sppl_grp_cd7);
	}

	/**
	 * Supplier classification cd. 7 発注先分類ＣＤ７.<p>
	 *
	 */
	public void sppl_grp_cd7(String value) {
		setConstString(offset + 160, $sppl_grp_cd7, value);
	}


	/**
	 * Supplier classification name 7 発注先分類名７.<p>
	 *
	 */
	public String sppl_grp_nm7() {
		return getConstString(offset + 161, $sppl_grp_nm7);
	}

	/**
	 * Supplier classification name 7 発注先分類名７.<p>
	 *
	 */
	public void sppl_grp_nm7(String value) {
		setConstString(offset + 161, $sppl_grp_nm7, value);
	}


	/**
	 * Supplier classification cd. 8 発注先分類ＣＤ８.<p>
	 *
	 */
	public String sppl_grp_cd8() {
		return getConstString(offset + 162, $sppl_grp_cd8);
	}

	/**
	 * Supplier classification cd. 8 発注先分類ＣＤ８.<p>
	 *
	 */
	public void sppl_grp_cd8(String value) {
		setConstString(offset + 162, $sppl_grp_cd8, value);
	}


	/**
	 * Supplier classification name 8 発注先分類名８.<p>
	 *
	 */
	public String sppl_grp_nm8() {
		return getConstString(offset + 163, $sppl_grp_nm8);
	}

	/**
	 * Supplier classification name 8 発注先分類名８.<p>
	 *
	 */
	public void sppl_grp_nm8(String value) {
		setConstString(offset + 163, $sppl_grp_nm8, value);
	}


	/**
	 * Supplier classification cd. 9 発注先分類ＣＤ９.<p>
	 *
	 */
	public String sppl_grp_cd9() {
		return getConstString(offset + 164, $sppl_grp_cd9);
	}

	/**
	 * Supplier classification cd. 9 発注先分類ＣＤ９.<p>
	 *
	 */
	public void sppl_grp_cd9(String value) {
		setConstString(offset + 164, $sppl_grp_cd9, value);
	}


	/**
	 * Supplier classification name 9 発注先分類名９.<p>
	 *
	 */
	public String sppl_grp_nm9() {
		return getConstString(offset + 165, $sppl_grp_nm9);
	}

	/**
	 * Supplier classification name 9 発注先分類名９.<p>
	 *
	 */
	public void sppl_grp_nm9(String value) {
		setConstString(offset + 165, $sppl_grp_nm9, value);
	}


	/**
	 * Supplier classification cd. 10 発注先分類ＣＤ１０.<p>
	 *
	 */
	public String sppl_grp_cd10() {
		return getConstString(offset + 166, $sppl_grp_cd10);
	}

	/**
	 * Supplier classification cd. 10 発注先分類ＣＤ１０.<p>
	 *
	 */
	public void sppl_grp_cd10(String value) {
		setConstString(offset + 166, $sppl_grp_cd10, value);
	}


	/**
	 * Supplier classification name 10 発注先分類名１０.<p>
	 *
	 */
	public String sppl_grp_nm10() {
		return getConstString(offset + 167, $sppl_grp_nm10);
	}

	/**
	 * Supplier classification name 10 発注先分類名１０.<p>
	 *
	 */
	public void sppl_grp_nm10(String value) {
		setConstString(offset + 167, $sppl_grp_nm10, value);
	}


	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public String ins_usr_id() {
		return getConstString(offset + 168, $ins_usr_id);
	}

	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public void ins_usr_id(String value) {
		setConstString(offset + 168, $ins_usr_id, value);
	}


	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public String ins_usr_nm() {
		return getConstString(offset + 169, $ins_usr_nm);
	}

	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public void ins_usr_nm(String value) {
		setConstString(offset + 169, $ins_usr_nm, value);
	}


	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public String ins_func_id() {
		return getConstString(offset + 170, $ins_func_id);
	}

	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public void ins_func_id(String value) {
		setConstString(offset + 170, $ins_func_id, value);
	}


	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public String ins_func_nm() {
		return getConstString(offset + 171, $ins_func_nm);
	}

	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public void ins_func_nm(String value) {
		setConstString(offset + 171, $ins_func_nm, value);
	}


	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public MCTimestamp ins_ts() {
		return getConstTimestamp(offset + 172, $ins_ts);
	}

	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public void ins_ts(MCTimestamp value) {
		setConstTimestamp(offset + 172, $ins_ts, value);
	}


	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public String upd_usr_id() {
		return getConstString(offset + 173, $upd_usr_id);
	}

	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public void upd_usr_id(String value) {
		setConstString(offset + 173, $upd_usr_id, value);
	}


	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public String upd_usr_nm() {
		return getConstString(offset + 174, $upd_usr_nm);
	}

	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public void upd_usr_nm(String value) {
		setConstString(offset + 174, $upd_usr_nm, value);
	}


	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public String upd_func_id() {
		return getConstString(offset + 175, $upd_func_id);
	}

	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public void upd_func_id(String value) {
		setConstString(offset + 175, $upd_func_id, value);
	}


	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public String upd_func_nm() {
		return getConstString(offset + 176, $upd_func_nm);
	}

	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public void upd_func_nm(String value) {
		setConstString(offset + 176, $upd_func_nm, value);
	}


	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public MCTimestamp upd_ts() {
		return getConstTimestamp(offset + 177, $upd_ts);
	}

	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public void upd_ts(MCTimestamp value) {
		setConstTimestamp(offset + 177, $upd_ts, value);
	}


	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public String upd_srv_req_no() {
		return getConstString(offset + 178, $upd_srv_req_no);
	}

	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public void upd_srv_req_no(String value) {
		setConstString(offset + 178, $upd_srv_req_no, value);
	}


	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public MCNumber dec_place() {
		return getConstNumber(offset + 179, $dec_place);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void dec_place(MCNumber value) {
		setConstNumber(offset + 179, $dec_place, value);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void dec_place(int value) {
		setConstNumber(offset + 179, $dec_place, value);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void dec_place(long value) {
		setConstNumber(offset + 179, $dec_place, value);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void dec_place(float value) {
		setConstNumber(offset + 179, $dec_place, value);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void dec_place(double value) {
		setConstNumber(offset + 179, $dec_place, value);
	}


	/**
	 * For active ingredient 有効成分対象.<p>
	 *
	 */
	public boolean cont_fctr_flg() {
		return getConstBoolean(offset + 180, $cont_fctr_flg);
	}

	/**
	 * For active ingredient 有効成分対象.<p>
	 *
	 */
	public void cont_fctr_flg(boolean value) {
		setConstBoolean(offset + 180, $cont_fctr_flg, value);
	}


	/**
	 * Active ingredient number of decimal places 有効成分小数部有効桁数.<p>
	 *
	 */
	public MCNumber cont_fctr_dec_place() {
		return getConstNumber(offset + 181, $cont_fctr_dec_place);
	}

	/**
	 * Active ingredient number of decimal places 有効成分小数部有効桁数.<p>
	 *
	 */
	public void cont_fctr_dec_place(MCNumber value) {
		setConstNumber(offset + 181, $cont_fctr_dec_place, value);
	}

	/**
	 * Active ingredient number of decimal places 有効成分小数部有効桁数.<p>
	 *
	 */
	public void cont_fctr_dec_place(int value) {
		setConstNumber(offset + 181, $cont_fctr_dec_place, value);
	}

	/**
	 * Active ingredient number of decimal places 有効成分小数部有効桁数.<p>
	 *
	 */
	public void cont_fctr_dec_place(long value) {
		setConstNumber(offset + 181, $cont_fctr_dec_place, value);
	}

	/**
	 * Active ingredient number of decimal places 有効成分小数部有効桁数.<p>
	 *
	 */
	public void cont_fctr_dec_place(float value) {
		setConstNumber(offset + 181, $cont_fctr_dec_place, value);
	}

	/**
	 * Active ingredient number of decimal places 有効成分小数部有効桁数.<p>
	 *
	 */
	public void cont_fctr_dec_place(double value) {
		setConstNumber(offset + 181, $cont_fctr_dec_place, value);
	}


	/**
	 * Rounding type (Active ingredient conversion) 有効成分換算端数処理区分.<p>
	 *
	 */
	public String cont_fctr_rnd_typ() {
		return getConstString(offset + 182, $cont_fctr_rnd_typ);
	}

	/**
	 * Rounding type (Active ingredient conversion) 有効成分換算端数処理区分.<p>
	 *
	 */
	public void cont_fctr_rnd_typ(String value) {
		setConstString(offset + 182, $cont_fctr_rnd_typ, value);
	}


	public String getString(String name) {
		if ($itm_ord_no.equalsIgnoreCase(name)) {
			return itm_ord_no();
		}
		if ($itm_ord_typ.equalsIgnoreCase(name)) {
			return itm_ord_typ();
		}
		if ($itm_ord_typ_nm.equalsIgnoreCase(name)) {
			return itm_ord_typ_nm();
		}
		if ($itm_ord_sts_typ.equalsIgnoreCase(name)) {
			return itm_ord_sts_typ();
		}
		if ($itm_ord_sts_typ_nm.equalsIgnoreCase(name)) {
			return itm_ord_sts_typ_nm();
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
		if ($ver_no.equalsIgnoreCase(name)) {
			return ver_no();
		}
		if ($base_unit_cd.equalsIgnoreCase(name)) {
			return base_unit_cd();
		}
		if ($base_unit_nm.equalsIgnoreCase(name)) {
			return base_unit_nm();
		}
		if ($cont_fctr_unit_cd.equalsIgnoreCase(name)) {
			return cont_fctr_unit_cd();
		}
		if ($cont_fctr_unit_nm.equalsIgnoreCase(name)) {
			return cont_fctr_unit_nm();
		}
		if ($strg_loc_cd.equalsIgnoreCase(name)) {
			return strg_loc_cd();
		}
		if ($strg_loc_nm.equalsIgnoreCase(name)) {
			return strg_loc_nm();
		}
		if ($mfg_loc_cd.equalsIgnoreCase(name)) {
			return mfg_loc_cd();
		}
		if ($mfg_loc_nm.equalsIgnoreCase(name)) {
			return mfg_loc_nm();
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
		if ($oper_ptn.equalsIgnoreCase(name)) {
			return oper_ptn();
		}
		if ($bom_ptn.equalsIgnoreCase(name)) {
			return bom_ptn();
		}
		if ($rqmt_no.equalsIgnoreCase(name)) {
			return rqmt_no();
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
		if ($ord_gnrt_typ.equalsIgnoreCase(name)) {
			return ord_gnrt_typ();
		}
		if ($ord_gnrt_typ_nm.equalsIgnoreCase(name)) {
			return ord_gnrt_typ_nm();
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
		if ($ext_sys_cd.equalsIgnoreCase(name)) {
			return ext_sys_cd();
		}
		if ($ext_sys_nm.equalsIgnoreCase(name)) {
			return ext_sys_nm();
		}
		if ($ext_itm_ord_no.equalsIgnoreCase(name)) {
			return ext_itm_ord_no();
		}
		if ($itm_grp_cd1.equalsIgnoreCase(name)) {
			return itm_grp_cd1();
		}
		if ($itm_grp_nm1.equalsIgnoreCase(name)) {
			return itm_grp_nm1();
		}
		if ($itm_grp_cd2.equalsIgnoreCase(name)) {
			return itm_grp_cd2();
		}
		if ($itm_grp_nm2.equalsIgnoreCase(name)) {
			return itm_grp_nm2();
		}
		if ($itm_grp_cd3.equalsIgnoreCase(name)) {
			return itm_grp_cd3();
		}
		if ($itm_grp_nm3.equalsIgnoreCase(name)) {
			return itm_grp_nm3();
		}
		if ($itm_grp_cd4.equalsIgnoreCase(name)) {
			return itm_grp_cd4();
		}
		if ($itm_grp_nm4.equalsIgnoreCase(name)) {
			return itm_grp_nm4();
		}
		if ($itm_grp_cd5.equalsIgnoreCase(name)) {
			return itm_grp_cd5();
		}
		if ($itm_grp_nm5.equalsIgnoreCase(name)) {
			return itm_grp_nm5();
		}
		if ($itm_grp_cd6.equalsIgnoreCase(name)) {
			return itm_grp_cd6();
		}
		if ($itm_grp_nm6.equalsIgnoreCase(name)) {
			return itm_grp_nm6();
		}
		if ($itm_grp_cd7.equalsIgnoreCase(name)) {
			return itm_grp_cd7();
		}
		if ($itm_grp_nm7.equalsIgnoreCase(name)) {
			return itm_grp_nm7();
		}
		if ($itm_grp_cd8.equalsIgnoreCase(name)) {
			return itm_grp_cd8();
		}
		if ($itm_grp_nm8.equalsIgnoreCase(name)) {
			return itm_grp_nm8();
		}
		if ($itm_grp_cd9.equalsIgnoreCase(name)) {
			return itm_grp_cd9();
		}
		if ($itm_grp_nm9.equalsIgnoreCase(name)) {
			return itm_grp_nm9();
		}
		if ($itm_grp_cd10.equalsIgnoreCase(name)) {
			return itm_grp_cd10();
		}
		if ($itm_grp_nm10.equalsIgnoreCase(name)) {
			return itm_grp_nm10();
		}
		if ($sppl_grp_cd1.equalsIgnoreCase(name)) {
			return sppl_grp_cd1();
		}
		if ($sppl_grp_nm1.equalsIgnoreCase(name)) {
			return sppl_grp_nm1();
		}
		if ($sppl_grp_cd2.equalsIgnoreCase(name)) {
			return sppl_grp_cd2();
		}
		if ($sppl_grp_nm2.equalsIgnoreCase(name)) {
			return sppl_grp_nm2();
		}
		if ($sppl_grp_cd3.equalsIgnoreCase(name)) {
			return sppl_grp_cd3();
		}
		if ($sppl_grp_nm3.equalsIgnoreCase(name)) {
			return sppl_grp_nm3();
		}
		if ($sppl_grp_cd4.equalsIgnoreCase(name)) {
			return sppl_grp_cd4();
		}
		if ($sppl_grp_nm4.equalsIgnoreCase(name)) {
			return sppl_grp_nm4();
		}
		if ($sppl_grp_cd5.equalsIgnoreCase(name)) {
			return sppl_grp_cd5();
		}
		if ($sppl_grp_nm5.equalsIgnoreCase(name)) {
			return sppl_grp_nm5();
		}
		if ($sppl_grp_cd6.equalsIgnoreCase(name)) {
			return sppl_grp_cd6();
		}
		if ($sppl_grp_nm6.equalsIgnoreCase(name)) {
			return sppl_grp_nm6();
		}
		if ($sppl_grp_cd7.equalsIgnoreCase(name)) {
			return sppl_grp_cd7();
		}
		if ($sppl_grp_nm7.equalsIgnoreCase(name)) {
			return sppl_grp_nm7();
		}
		if ($sppl_grp_cd8.equalsIgnoreCase(name)) {
			return sppl_grp_cd8();
		}
		if ($sppl_grp_nm8.equalsIgnoreCase(name)) {
			return sppl_grp_nm8();
		}
		if ($sppl_grp_cd9.equalsIgnoreCase(name)) {
			return sppl_grp_cd9();
		}
		if ($sppl_grp_nm9.equalsIgnoreCase(name)) {
			return sppl_grp_nm9();
		}
		if ($sppl_grp_cd10.equalsIgnoreCase(name)) {
			return sppl_grp_cd10();
		}
		if ($sppl_grp_nm10.equalsIgnoreCase(name)) {
			return sppl_grp_nm10();
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
		if ($cont_fctr_rnd_typ.equalsIgnoreCase(name)) {
			return cont_fctr_rnd_typ();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($inst_qty.equalsIgnoreCase(name)) {
			return inst_qty();
		}
		if ($yield_schd_qty.equalsIgnoreCase(name)) {
			return yield_schd_qty();
		}
		if ($inst_yield_schd_qty.equalsIgnoreCase(name)) {
			return inst_yield_schd_qty();
		}
		if ($yield_act_qty.equalsIgnoreCase(name)) {
			return yield_act_qty();
		}
		if ($purc_act_qty.equalsIgnoreCase(name)) {
			return purc_act_qty();
		}
		if ($insp_act_qty.equalsIgnoreCase(name)) {
			return insp_act_qty();
		}
		if ($yield_remain_qty.equalsIgnoreCase(name)) {
			return yield_remain_qty();
		}
		if ($purc_remain_qty.equalsIgnoreCase(name)) {
			return purc_remain_qty();
		}
		if ($insp_remain_qty.equalsIgnoreCase(name)) {
			return insp_remain_qty();
		}
		if ($schd_alloc_qty.equalsIgnoreCase(name)) {
			return schd_alloc_qty();
		}
		if ($surplus_qty.equalsIgnoreCase(name)) {
			return surplus_qty();
		}
		if ($abort_qty.equalsIgnoreCase(name)) {
			return abort_qty();
		}
		if ($arr_yield_rate.equalsIgnoreCase(name)) {
			return arr_yield_rate();
		}
		if ($purc_rate.equalsIgnoreCase(name)) {
			return purc_rate();
		}
		if ($cont_fctr_inst_qty.equalsIgnoreCase(name)) {
			return cont_fctr_inst_qty();
		}
		if ($cont_fctr_schd_yield_qty.equalsIgnoreCase(name)) {
			return cont_fctr_schd_yield_qty();
		}
		if ($std_cont_fctr.equalsIgnoreCase(name)) {
			return std_cont_fctr();
		}
		if ($mrp_mfg_lt.equalsIgnoreCase(name)) {
			return mrp_mfg_lt();
		}
		if ($mfg_lt.equalsIgnoreCase(name)) {
			return mfg_lt();
		}
		if ($act_mfg_lt.equalsIgnoreCase(name)) {
			return act_mfg_lt();
		}
		if ($mrp_purc_lt.equalsIgnoreCase(name)) {
			return mrp_purc_lt();
		}
		if ($purc_lt.equalsIgnoreCase(name)) {
			return purc_lt();
		}
		if ($act_purc_lt.equalsIgnoreCase(name)) {
			return act_purc_lt();
		}
		if ($margin_days.equalsIgnoreCase(name)) {
			return margin_days();
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			return dec_place();
		}
		if ($cont_fctr_dec_place.equalsIgnoreCase(name)) {
			return cont_fctr_dec_place();
		}
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		if ($mrp_po_schd_dt.equalsIgnoreCase(name)) {
			return mrp_po_schd_dt();
		}
		if ($po_schd_dt.equalsIgnoreCase(name)) {
			return po_schd_dt();
		}
		if ($latest_po_d_dt.equalsIgnoreCase(name)) {
			return latest_po_d_dt();
		}
		if ($mrp_gi_schd_dt.equalsIgnoreCase(name)) {
			return mrp_gi_schd_dt();
		}
		if ($gi_schd_dt.equalsIgnoreCase(name)) {
			return gi_schd_dt();
		}
		if ($inst_gi_schd_dt.equalsIgnoreCase(name)) {
			return inst_gi_schd_dt();
		}
		if ($latest_gi_act_dt.equalsIgnoreCase(name)) {
			return latest_gi_act_dt();
		}
		if ($mrp_mfg_st_schd_dt.equalsIgnoreCase(name)) {
			return mrp_mfg_st_schd_dt();
		}
		if ($mfg_st_schd_dt.equalsIgnoreCase(name)) {
			return mfg_st_schd_dt();
		}
		if ($inst_mfg_st_schd_dt.equalsIgnoreCase(name)) {
			return inst_mfg_st_schd_dt();
		}
		if ($latest_mfg_st_act_dt.equalsIgnoreCase(name)) {
			return latest_mfg_st_act_dt();
		}
		if ($mrp_mfg_end_schd_dt.equalsIgnoreCase(name)) {
			return mrp_mfg_end_schd_dt();
		}
		if ($mfg_end_schd_dt.equalsIgnoreCase(name)) {
			return mfg_end_schd_dt();
		}
		if ($inst_mfg_end_schd_dt.equalsIgnoreCase(name)) {
			return inst_mfg_end_schd_dt();
		}
		if ($latest_mfg_end_act_dt.equalsIgnoreCase(name)) {
			return latest_mfg_end_act_dt();
		}
		if ($mrp_strg_schd_dt.equalsIgnoreCase(name)) {
			return mrp_strg_schd_dt();
		}
		if ($strg_schd_dt.equalsIgnoreCase(name)) {
			return strg_schd_dt();
		}
		if ($inst_strg_schd_dt.equalsIgnoreCase(name)) {
			return inst_strg_schd_dt();
		}
		if ($latest_strg_act_dt.equalsIgnoreCase(name)) {
			return latest_strg_act_dt();
		}
		if ($mrp_accpt_schd_dt.equalsIgnoreCase(name)) {
			return mrp_accpt_schd_dt();
		}
		if ($accpt_schd_dt.equalsIgnoreCase(name)) {
			return accpt_schd_dt();
		}
		if ($inst_accpt_schd_dt.equalsIgnoreCase(name)) {
			return inst_accpt_schd_dt();
		}
		if ($latest_accpt_act_dt.equalsIgnoreCase(name)) {
			return latest_accpt_act_dt();
		}
		if ($mrp_insp_st_schd_dt.equalsIgnoreCase(name)) {
			return mrp_insp_st_schd_dt();
		}
		if ($insp_st_schd_dt.equalsIgnoreCase(name)) {
			return insp_st_schd_dt();
		}
		if ($inst_insp_st_schd_dt.equalsIgnoreCase(name)) {
			return inst_insp_st_schd_dt();
		}
		if ($latest_insp_st_act_dt.equalsIgnoreCase(name)) {
			return latest_insp_st_act_dt();
		}
		if ($mrp_insp_end_schd_dt.equalsIgnoreCase(name)) {
			return mrp_insp_end_schd_dt();
		}
		if ($insp_end_schd_dt.equalsIgnoreCase(name)) {
			return insp_end_schd_dt();
		}
		if ($inst_insp_end_schd_dt.equalsIgnoreCase(name)) {
			return inst_insp_end_schd_dt();
		}
		if ($latest_insp_end_act_dt.equalsIgnoreCase(name)) {
			return latest_insp_end_act_dt();
		}
		if ($mrp_avl_schd_dt.equalsIgnoreCase(name)) {
			return mrp_avl_schd_dt();
		}
		if ($avl_schd_dt.equalsIgnoreCase(name)) {
			return avl_schd_dt();
		}
		if ($po_avl_schd_dt.equalsIgnoreCase(name)) {
			return po_avl_schd_dt();
		}
		if ($avl_dt.equalsIgnoreCase(name)) {
			return avl_dt();
		}
		if ($io_avl_schd_dt.equalsIgnoreCase(name)) {
			return io_avl_schd_dt();
		}
		if ($schd_so_dt.equalsIgnoreCase(name)) {
			return schd_so_dt();
		}
		if ($fix_dt.equalsIgnoreCase(name)) {
			return fix_dt();
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
		if ($bndl_flg.equalsIgnoreCase(name)) {
			return bndl_flg();
		}
		if ($delay_expt_flg.equalsIgnoreCase(name)) {
			return delay_expt_flg();
		}
		if ($not_fix_flg.equalsIgnoreCase(name)) {
			return not_fix_flg();
		}
		if ($ord_rcv_flg.equalsIgnoreCase(name)) {
			return ord_rcv_flg();
		}
		if ($ord_snd_flg.equalsIgnoreCase(name)) {
			return ord_snd_flg();
		}
		if ($for_scheduler_frozen_flg.equalsIgnoreCase(name)) {
			return for_scheduler_frozen_flg();
		}
		if ($scheduler_frozen_flg.equalsIgnoreCase(name)) {
			return scheduler_frozen_flg();
		}
		if ($schd_yield_red_flg.equalsIgnoreCase(name)) {
			return schd_yield_red_flg();
		}
		if ($st_dt_red_flg.equalsIgnoreCase(name)) {
			return st_dt_red_flg();
		}
		if ($end_dt_red_flg.equalsIgnoreCase(name)) {
			return end_dt_red_flg();
		}
		if ($avl_schd_dt_red_flg.equalsIgnoreCase(name)) {
			return avl_schd_dt_red_flg();
		}
		if ($alloc_pln_red_flg.equalsIgnoreCase(name)) {
			return alloc_pln_red_flg();
		}
		if ($surplus_ord_flg.equalsIgnoreCase(name)) {
			return surplus_ord_flg();
		}
		if ($no_problem_flg.equalsIgnoreCase(name)) {
			return no_problem_flg();
		}
		if ($cont_fctr_flg.equalsIgnoreCase(name)) {
			return cont_fctr_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($itm_ord_no.equalsIgnoreCase(name)) {
			return itm_ord_no();
		}
		if ($itm_ord_typ.equalsIgnoreCase(name)) {
			return itm_ord_typ();
		}
		if ($itm_ord_typ_nm.equalsIgnoreCase(name)) {
			return itm_ord_typ_nm();
		}
		if ($itm_ord_sts_typ.equalsIgnoreCase(name)) {
			return itm_ord_sts_typ();
		}
		if ($itm_ord_sts_typ_nm.equalsIgnoreCase(name)) {
			return itm_ord_sts_typ_nm();
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
		if ($ver_no.equalsIgnoreCase(name)) {
			return ver_no();
		}
		if ($base_unit_cd.equalsIgnoreCase(name)) {
			return base_unit_cd();
		}
		if ($base_unit_nm.equalsIgnoreCase(name)) {
			return base_unit_nm();
		}
		if ($cont_fctr_unit_cd.equalsIgnoreCase(name)) {
			return cont_fctr_unit_cd();
		}
		if ($cont_fctr_unit_nm.equalsIgnoreCase(name)) {
			return cont_fctr_unit_nm();
		}
		if ($strg_loc_cd.equalsIgnoreCase(name)) {
			return strg_loc_cd();
		}
		if ($strg_loc_nm.equalsIgnoreCase(name)) {
			return strg_loc_nm();
		}
		if ($mfg_loc_cd.equalsIgnoreCase(name)) {
			return mfg_loc_cd();
		}
		if ($mfg_loc_nm.equalsIgnoreCase(name)) {
			return mfg_loc_nm();
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
		if ($oper_ptn.equalsIgnoreCase(name)) {
			return oper_ptn();
		}
		if ($bom_ptn.equalsIgnoreCase(name)) {
			return bom_ptn();
		}
		if ($rqmt_no.equalsIgnoreCase(name)) {
			return rqmt_no();
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
		if ($ord_gnrt_typ.equalsIgnoreCase(name)) {
			return ord_gnrt_typ();
		}
		if ($ord_gnrt_typ_nm.equalsIgnoreCase(name)) {
			return ord_gnrt_typ_nm();
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
		if ($ext_sys_cd.equalsIgnoreCase(name)) {
			return ext_sys_cd();
		}
		if ($ext_sys_nm.equalsIgnoreCase(name)) {
			return ext_sys_nm();
		}
		if ($ext_itm_ord_no.equalsIgnoreCase(name)) {
			return ext_itm_ord_no();
		}
		if ($itm_grp_cd1.equalsIgnoreCase(name)) {
			return itm_grp_cd1();
		}
		if ($itm_grp_nm1.equalsIgnoreCase(name)) {
			return itm_grp_nm1();
		}
		if ($itm_grp_cd2.equalsIgnoreCase(name)) {
			return itm_grp_cd2();
		}
		if ($itm_grp_nm2.equalsIgnoreCase(name)) {
			return itm_grp_nm2();
		}
		if ($itm_grp_cd3.equalsIgnoreCase(name)) {
			return itm_grp_cd3();
		}
		if ($itm_grp_nm3.equalsIgnoreCase(name)) {
			return itm_grp_nm3();
		}
		if ($itm_grp_cd4.equalsIgnoreCase(name)) {
			return itm_grp_cd4();
		}
		if ($itm_grp_nm4.equalsIgnoreCase(name)) {
			return itm_grp_nm4();
		}
		if ($itm_grp_cd5.equalsIgnoreCase(name)) {
			return itm_grp_cd5();
		}
		if ($itm_grp_nm5.equalsIgnoreCase(name)) {
			return itm_grp_nm5();
		}
		if ($itm_grp_cd6.equalsIgnoreCase(name)) {
			return itm_grp_cd6();
		}
		if ($itm_grp_nm6.equalsIgnoreCase(name)) {
			return itm_grp_nm6();
		}
		if ($itm_grp_cd7.equalsIgnoreCase(name)) {
			return itm_grp_cd7();
		}
		if ($itm_grp_nm7.equalsIgnoreCase(name)) {
			return itm_grp_nm7();
		}
		if ($itm_grp_cd8.equalsIgnoreCase(name)) {
			return itm_grp_cd8();
		}
		if ($itm_grp_nm8.equalsIgnoreCase(name)) {
			return itm_grp_nm8();
		}
		if ($itm_grp_cd9.equalsIgnoreCase(name)) {
			return itm_grp_cd9();
		}
		if ($itm_grp_nm9.equalsIgnoreCase(name)) {
			return itm_grp_nm9();
		}
		if ($itm_grp_cd10.equalsIgnoreCase(name)) {
			return itm_grp_cd10();
		}
		if ($itm_grp_nm10.equalsIgnoreCase(name)) {
			return itm_grp_nm10();
		}
		if ($sppl_grp_cd1.equalsIgnoreCase(name)) {
			return sppl_grp_cd1();
		}
		if ($sppl_grp_nm1.equalsIgnoreCase(name)) {
			return sppl_grp_nm1();
		}
		if ($sppl_grp_cd2.equalsIgnoreCase(name)) {
			return sppl_grp_cd2();
		}
		if ($sppl_grp_nm2.equalsIgnoreCase(name)) {
			return sppl_grp_nm2();
		}
		if ($sppl_grp_cd3.equalsIgnoreCase(name)) {
			return sppl_grp_cd3();
		}
		if ($sppl_grp_nm3.equalsIgnoreCase(name)) {
			return sppl_grp_nm3();
		}
		if ($sppl_grp_cd4.equalsIgnoreCase(name)) {
			return sppl_grp_cd4();
		}
		if ($sppl_grp_nm4.equalsIgnoreCase(name)) {
			return sppl_grp_nm4();
		}
		if ($sppl_grp_cd5.equalsIgnoreCase(name)) {
			return sppl_grp_cd5();
		}
		if ($sppl_grp_nm5.equalsIgnoreCase(name)) {
			return sppl_grp_nm5();
		}
		if ($sppl_grp_cd6.equalsIgnoreCase(name)) {
			return sppl_grp_cd6();
		}
		if ($sppl_grp_nm6.equalsIgnoreCase(name)) {
			return sppl_grp_nm6();
		}
		if ($sppl_grp_cd7.equalsIgnoreCase(name)) {
			return sppl_grp_cd7();
		}
		if ($sppl_grp_nm7.equalsIgnoreCase(name)) {
			return sppl_grp_nm7();
		}
		if ($sppl_grp_cd8.equalsIgnoreCase(name)) {
			return sppl_grp_cd8();
		}
		if ($sppl_grp_nm8.equalsIgnoreCase(name)) {
			return sppl_grp_nm8();
		}
		if ($sppl_grp_cd9.equalsIgnoreCase(name)) {
			return sppl_grp_cd9();
		}
		if ($sppl_grp_nm9.equalsIgnoreCase(name)) {
			return sppl_grp_nm9();
		}
		if ($sppl_grp_cd10.equalsIgnoreCase(name)) {
			return sppl_grp_cd10();
		}
		if ($sppl_grp_nm10.equalsIgnoreCase(name)) {
			return sppl_grp_nm10();
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
		if ($cont_fctr_rnd_typ.equalsIgnoreCase(name)) {
			return cont_fctr_rnd_typ();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($inst_qty.equalsIgnoreCase(name)) {
			return inst_qty();
		}
		if ($yield_schd_qty.equalsIgnoreCase(name)) {
			return yield_schd_qty();
		}
		if ($inst_yield_schd_qty.equalsIgnoreCase(name)) {
			return inst_yield_schd_qty();
		}
		if ($yield_act_qty.equalsIgnoreCase(name)) {
			return yield_act_qty();
		}
		if ($purc_act_qty.equalsIgnoreCase(name)) {
			return purc_act_qty();
		}
		if ($insp_act_qty.equalsIgnoreCase(name)) {
			return insp_act_qty();
		}
		if ($yield_remain_qty.equalsIgnoreCase(name)) {
			return yield_remain_qty();
		}
		if ($purc_remain_qty.equalsIgnoreCase(name)) {
			return purc_remain_qty();
		}
		if ($insp_remain_qty.equalsIgnoreCase(name)) {
			return insp_remain_qty();
		}
		if ($schd_alloc_qty.equalsIgnoreCase(name)) {
			return schd_alloc_qty();
		}
		if ($surplus_qty.equalsIgnoreCase(name)) {
			return surplus_qty();
		}
		if ($abort_qty.equalsIgnoreCase(name)) {
			return abort_qty();
		}
		if ($arr_yield_rate.equalsIgnoreCase(name)) {
			return arr_yield_rate();
		}
		if ($purc_rate.equalsIgnoreCase(name)) {
			return purc_rate();
		}
		if ($cont_fctr_inst_qty.equalsIgnoreCase(name)) {
			return cont_fctr_inst_qty();
		}
		if ($cont_fctr_schd_yield_qty.equalsIgnoreCase(name)) {
			return cont_fctr_schd_yield_qty();
		}
		if ($std_cont_fctr.equalsIgnoreCase(name)) {
			return std_cont_fctr();
		}
		if ($mrp_mfg_lt.equalsIgnoreCase(name)) {
			return mrp_mfg_lt();
		}
		if ($mfg_lt.equalsIgnoreCase(name)) {
			return mfg_lt();
		}
		if ($act_mfg_lt.equalsIgnoreCase(name)) {
			return act_mfg_lt();
		}
		if ($mrp_purc_lt.equalsIgnoreCase(name)) {
			return mrp_purc_lt();
		}
		if ($purc_lt.equalsIgnoreCase(name)) {
			return purc_lt();
		}
		if ($act_purc_lt.equalsIgnoreCase(name)) {
			return act_purc_lt();
		}
		if ($margin_days.equalsIgnoreCase(name)) {
			return margin_days();
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			return dec_place();
		}
		if ($cont_fctr_dec_place.equalsIgnoreCase(name)) {
			return cont_fctr_dec_place();
		}
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($mrp_po_schd_dt.equalsIgnoreCase(name)) {
			return mrp_po_schd_dt();
		}
		if ($po_schd_dt.equalsIgnoreCase(name)) {
			return po_schd_dt();
		}
		if ($latest_po_d_dt.equalsIgnoreCase(name)) {
			return latest_po_d_dt();
		}
		if ($mrp_gi_schd_dt.equalsIgnoreCase(name)) {
			return mrp_gi_schd_dt();
		}
		if ($gi_schd_dt.equalsIgnoreCase(name)) {
			return gi_schd_dt();
		}
		if ($inst_gi_schd_dt.equalsIgnoreCase(name)) {
			return inst_gi_schd_dt();
		}
		if ($latest_gi_act_dt.equalsIgnoreCase(name)) {
			return latest_gi_act_dt();
		}
		if ($mrp_mfg_st_schd_dt.equalsIgnoreCase(name)) {
			return mrp_mfg_st_schd_dt();
		}
		if ($mfg_st_schd_dt.equalsIgnoreCase(name)) {
			return mfg_st_schd_dt();
		}
		if ($inst_mfg_st_schd_dt.equalsIgnoreCase(name)) {
			return inst_mfg_st_schd_dt();
		}
		if ($latest_mfg_st_act_dt.equalsIgnoreCase(name)) {
			return latest_mfg_st_act_dt();
		}
		if ($mrp_mfg_end_schd_dt.equalsIgnoreCase(name)) {
			return mrp_mfg_end_schd_dt();
		}
		if ($mfg_end_schd_dt.equalsIgnoreCase(name)) {
			return mfg_end_schd_dt();
		}
		if ($inst_mfg_end_schd_dt.equalsIgnoreCase(name)) {
			return inst_mfg_end_schd_dt();
		}
		if ($latest_mfg_end_act_dt.equalsIgnoreCase(name)) {
			return latest_mfg_end_act_dt();
		}
		if ($mrp_strg_schd_dt.equalsIgnoreCase(name)) {
			return mrp_strg_schd_dt();
		}
		if ($strg_schd_dt.equalsIgnoreCase(name)) {
			return strg_schd_dt();
		}
		if ($inst_strg_schd_dt.equalsIgnoreCase(name)) {
			return inst_strg_schd_dt();
		}
		if ($latest_strg_act_dt.equalsIgnoreCase(name)) {
			return latest_strg_act_dt();
		}
		if ($mrp_accpt_schd_dt.equalsIgnoreCase(name)) {
			return mrp_accpt_schd_dt();
		}
		if ($accpt_schd_dt.equalsIgnoreCase(name)) {
			return accpt_schd_dt();
		}
		if ($inst_accpt_schd_dt.equalsIgnoreCase(name)) {
			return inst_accpt_schd_dt();
		}
		if ($latest_accpt_act_dt.equalsIgnoreCase(name)) {
			return latest_accpt_act_dt();
		}
		if ($mrp_insp_st_schd_dt.equalsIgnoreCase(name)) {
			return mrp_insp_st_schd_dt();
		}
		if ($insp_st_schd_dt.equalsIgnoreCase(name)) {
			return insp_st_schd_dt();
		}
		if ($inst_insp_st_schd_dt.equalsIgnoreCase(name)) {
			return inst_insp_st_schd_dt();
		}
		if ($latest_insp_st_act_dt.equalsIgnoreCase(name)) {
			return latest_insp_st_act_dt();
		}
		if ($mrp_insp_end_schd_dt.equalsIgnoreCase(name)) {
			return mrp_insp_end_schd_dt();
		}
		if ($insp_end_schd_dt.equalsIgnoreCase(name)) {
			return insp_end_schd_dt();
		}
		if ($inst_insp_end_schd_dt.equalsIgnoreCase(name)) {
			return inst_insp_end_schd_dt();
		}
		if ($latest_insp_end_act_dt.equalsIgnoreCase(name)) {
			return latest_insp_end_act_dt();
		}
		if ($mrp_avl_schd_dt.equalsIgnoreCase(name)) {
			return mrp_avl_schd_dt();
		}
		if ($avl_schd_dt.equalsIgnoreCase(name)) {
			return avl_schd_dt();
		}
		if ($po_avl_schd_dt.equalsIgnoreCase(name)) {
			return po_avl_schd_dt();
		}
		if ($avl_dt.equalsIgnoreCase(name)) {
			return avl_dt();
		}
		if ($io_avl_schd_dt.equalsIgnoreCase(name)) {
			return io_avl_schd_dt();
		}
		if ($schd_so_dt.equalsIgnoreCase(name)) {
			return schd_so_dt();
		}
		if ($fix_dt.equalsIgnoreCase(name)) {
			return fix_dt();
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
		if ($bndl_flg.equalsIgnoreCase(name)) {
			return bndl_flg();
		}
		if ($delay_expt_flg.equalsIgnoreCase(name)) {
			return delay_expt_flg();
		}
		if ($not_fix_flg.equalsIgnoreCase(name)) {
			return not_fix_flg();
		}
		if ($ord_rcv_flg.equalsIgnoreCase(name)) {
			return ord_rcv_flg();
		}
		if ($ord_snd_flg.equalsIgnoreCase(name)) {
			return ord_snd_flg();
		}
		if ($for_scheduler_frozen_flg.equalsIgnoreCase(name)) {
			return for_scheduler_frozen_flg();
		}
		if ($scheduler_frozen_flg.equalsIgnoreCase(name)) {
			return scheduler_frozen_flg();
		}
		if ($schd_yield_red_flg.equalsIgnoreCase(name)) {
			return schd_yield_red_flg();
		}
		if ($st_dt_red_flg.equalsIgnoreCase(name)) {
			return st_dt_red_flg();
		}
		if ($end_dt_red_flg.equalsIgnoreCase(name)) {
			return end_dt_red_flg();
		}
		if ($avl_schd_dt_red_flg.equalsIgnoreCase(name)) {
			return avl_schd_dt_red_flg();
		}
		if ($alloc_pln_red_flg.equalsIgnoreCase(name)) {
			return alloc_pln_red_flg();
		}
		if ($surplus_ord_flg.equalsIgnoreCase(name)) {
			return surplus_ord_flg();
		}
		if ($no_problem_flg.equalsIgnoreCase(name)) {
			return no_problem_flg();
		}
		if ($cont_fctr_flg.equalsIgnoreCase(name)) {
			return cont_fctr_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
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
		if ($itm_ord_sts_typ.equalsIgnoreCase(name)) {
			itm_ord_sts_typ(value);
			return;
		}
		if ($itm_ord_sts_typ_nm.equalsIgnoreCase(name)) {
			itm_ord_sts_typ_nm(value);
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
		if ($ver_no.equalsIgnoreCase(name)) {
			ver_no(value);
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
		if ($cont_fctr_unit_cd.equalsIgnoreCase(name)) {
			cont_fctr_unit_cd(value);
			return;
		}
		if ($cont_fctr_unit_nm.equalsIgnoreCase(name)) {
			cont_fctr_unit_nm(value);
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
		if ($mfg_loc_cd.equalsIgnoreCase(name)) {
			mfg_loc_cd(value);
			return;
		}
		if ($mfg_loc_nm.equalsIgnoreCase(name)) {
			mfg_loc_nm(value);
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
		if ($oper_ptn.equalsIgnoreCase(name)) {
			oper_ptn(value);
			return;
		}
		if ($bom_ptn.equalsIgnoreCase(name)) {
			bom_ptn(value);
			return;
		}
		if ($rqmt_no.equalsIgnoreCase(name)) {
			rqmt_no(value);
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
		if ($ord_gnrt_typ.equalsIgnoreCase(name)) {
			ord_gnrt_typ(value);
			return;
		}
		if ($ord_gnrt_typ_nm.equalsIgnoreCase(name)) {
			ord_gnrt_typ_nm(value);
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
		if ($ext_sys_cd.equalsIgnoreCase(name)) {
			ext_sys_cd(value);
			return;
		}
		if ($ext_sys_nm.equalsIgnoreCase(name)) {
			ext_sys_nm(value);
			return;
		}
		if ($ext_itm_ord_no.equalsIgnoreCase(name)) {
			ext_itm_ord_no(value);
			return;
		}
		if ($itm_grp_cd1.equalsIgnoreCase(name)) {
			itm_grp_cd1(value);
			return;
		}
		if ($itm_grp_nm1.equalsIgnoreCase(name)) {
			itm_grp_nm1(value);
			return;
		}
		if ($itm_grp_cd2.equalsIgnoreCase(name)) {
			itm_grp_cd2(value);
			return;
		}
		if ($itm_grp_nm2.equalsIgnoreCase(name)) {
			itm_grp_nm2(value);
			return;
		}
		if ($itm_grp_cd3.equalsIgnoreCase(name)) {
			itm_grp_cd3(value);
			return;
		}
		if ($itm_grp_nm3.equalsIgnoreCase(name)) {
			itm_grp_nm3(value);
			return;
		}
		if ($itm_grp_cd4.equalsIgnoreCase(name)) {
			itm_grp_cd4(value);
			return;
		}
		if ($itm_grp_nm4.equalsIgnoreCase(name)) {
			itm_grp_nm4(value);
			return;
		}
		if ($itm_grp_cd5.equalsIgnoreCase(name)) {
			itm_grp_cd5(value);
			return;
		}
		if ($itm_grp_nm5.equalsIgnoreCase(name)) {
			itm_grp_nm5(value);
			return;
		}
		if ($itm_grp_cd6.equalsIgnoreCase(name)) {
			itm_grp_cd6(value);
			return;
		}
		if ($itm_grp_nm6.equalsIgnoreCase(name)) {
			itm_grp_nm6(value);
			return;
		}
		if ($itm_grp_cd7.equalsIgnoreCase(name)) {
			itm_grp_cd7(value);
			return;
		}
		if ($itm_grp_nm7.equalsIgnoreCase(name)) {
			itm_grp_nm7(value);
			return;
		}
		if ($itm_grp_cd8.equalsIgnoreCase(name)) {
			itm_grp_cd8(value);
			return;
		}
		if ($itm_grp_nm8.equalsIgnoreCase(name)) {
			itm_grp_nm8(value);
			return;
		}
		if ($itm_grp_cd9.equalsIgnoreCase(name)) {
			itm_grp_cd9(value);
			return;
		}
		if ($itm_grp_nm9.equalsIgnoreCase(name)) {
			itm_grp_nm9(value);
			return;
		}
		if ($itm_grp_cd10.equalsIgnoreCase(name)) {
			itm_grp_cd10(value);
			return;
		}
		if ($itm_grp_nm10.equalsIgnoreCase(name)) {
			itm_grp_nm10(value);
			return;
		}
		if ($sppl_grp_cd1.equalsIgnoreCase(name)) {
			sppl_grp_cd1(value);
			return;
		}
		if ($sppl_grp_nm1.equalsIgnoreCase(name)) {
			sppl_grp_nm1(value);
			return;
		}
		if ($sppl_grp_cd2.equalsIgnoreCase(name)) {
			sppl_grp_cd2(value);
			return;
		}
		if ($sppl_grp_nm2.equalsIgnoreCase(name)) {
			sppl_grp_nm2(value);
			return;
		}
		if ($sppl_grp_cd3.equalsIgnoreCase(name)) {
			sppl_grp_cd3(value);
			return;
		}
		if ($sppl_grp_nm3.equalsIgnoreCase(name)) {
			sppl_grp_nm3(value);
			return;
		}
		if ($sppl_grp_cd4.equalsIgnoreCase(name)) {
			sppl_grp_cd4(value);
			return;
		}
		if ($sppl_grp_nm4.equalsIgnoreCase(name)) {
			sppl_grp_nm4(value);
			return;
		}
		if ($sppl_grp_cd5.equalsIgnoreCase(name)) {
			sppl_grp_cd5(value);
			return;
		}
		if ($sppl_grp_nm5.equalsIgnoreCase(name)) {
			sppl_grp_nm5(value);
			return;
		}
		if ($sppl_grp_cd6.equalsIgnoreCase(name)) {
			sppl_grp_cd6(value);
			return;
		}
		if ($sppl_grp_nm6.equalsIgnoreCase(name)) {
			sppl_grp_nm6(value);
			return;
		}
		if ($sppl_grp_cd7.equalsIgnoreCase(name)) {
			sppl_grp_cd7(value);
			return;
		}
		if ($sppl_grp_nm7.equalsIgnoreCase(name)) {
			sppl_grp_nm7(value);
			return;
		}
		if ($sppl_grp_cd8.equalsIgnoreCase(name)) {
			sppl_grp_cd8(value);
			return;
		}
		if ($sppl_grp_nm8.equalsIgnoreCase(name)) {
			sppl_grp_nm8(value);
			return;
		}
		if ($sppl_grp_cd9.equalsIgnoreCase(name)) {
			sppl_grp_cd9(value);
			return;
		}
		if ($sppl_grp_nm9.equalsIgnoreCase(name)) {
			sppl_grp_nm9(value);
			return;
		}
		if ($sppl_grp_cd10.equalsIgnoreCase(name)) {
			sppl_grp_cd10(value);
			return;
		}
		if ($sppl_grp_nm10.equalsIgnoreCase(name)) {
			sppl_grp_nm10(value);
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
		if ($cont_fctr_rnd_typ.equalsIgnoreCase(name)) {
			cont_fctr_rnd_typ(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($inst_qty.equalsIgnoreCase(name)) {
			inst_qty(value);
			return;
		}
		if ($yield_schd_qty.equalsIgnoreCase(name)) {
			yield_schd_qty(value);
			return;
		}
		if ($inst_yield_schd_qty.equalsIgnoreCase(name)) {
			inst_yield_schd_qty(value);
			return;
		}
		if ($yield_act_qty.equalsIgnoreCase(name)) {
			yield_act_qty(value);
			return;
		}
		if ($purc_act_qty.equalsIgnoreCase(name)) {
			purc_act_qty(value);
			return;
		}
		if ($insp_act_qty.equalsIgnoreCase(name)) {
			insp_act_qty(value);
			return;
		}
		if ($yield_remain_qty.equalsIgnoreCase(name)) {
			yield_remain_qty(value);
			return;
		}
		if ($purc_remain_qty.equalsIgnoreCase(name)) {
			purc_remain_qty(value);
			return;
		}
		if ($insp_remain_qty.equalsIgnoreCase(name)) {
			insp_remain_qty(value);
			return;
		}
		if ($schd_alloc_qty.equalsIgnoreCase(name)) {
			schd_alloc_qty(value);
			return;
		}
		if ($surplus_qty.equalsIgnoreCase(name)) {
			surplus_qty(value);
			return;
		}
		if ($abort_qty.equalsIgnoreCase(name)) {
			abort_qty(value);
			return;
		}
		if ($arr_yield_rate.equalsIgnoreCase(name)) {
			arr_yield_rate(value);
			return;
		}
		if ($purc_rate.equalsIgnoreCase(name)) {
			purc_rate(value);
			return;
		}
		if ($cont_fctr_inst_qty.equalsIgnoreCase(name)) {
			cont_fctr_inst_qty(value);
			return;
		}
		if ($cont_fctr_schd_yield_qty.equalsIgnoreCase(name)) {
			cont_fctr_schd_yield_qty(value);
			return;
		}
		if ($std_cont_fctr.equalsIgnoreCase(name)) {
			std_cont_fctr(value);
			return;
		}
		if ($mrp_mfg_lt.equalsIgnoreCase(name)) {
			mrp_mfg_lt(value);
			return;
		}
		if ($mfg_lt.equalsIgnoreCase(name)) {
			mfg_lt(value);
			return;
		}
		if ($act_mfg_lt.equalsIgnoreCase(name)) {
			act_mfg_lt(value);
			return;
		}
		if ($mrp_purc_lt.equalsIgnoreCase(name)) {
			mrp_purc_lt(value);
			return;
		}
		if ($purc_lt.equalsIgnoreCase(name)) {
			purc_lt(value);
			return;
		}
		if ($act_purc_lt.equalsIgnoreCase(name)) {
			act_purc_lt(value);
			return;
		}
		if ($margin_days.equalsIgnoreCase(name)) {
			margin_days(value);
			return;
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($cont_fctr_dec_place.equalsIgnoreCase(name)) {
			cont_fctr_dec_place(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($inst_qty.equalsIgnoreCase(name)) {
			inst_qty(value);
			return;
		}
		if ($yield_schd_qty.equalsIgnoreCase(name)) {
			yield_schd_qty(value);
			return;
		}
		if ($inst_yield_schd_qty.equalsIgnoreCase(name)) {
			inst_yield_schd_qty(value);
			return;
		}
		if ($yield_act_qty.equalsIgnoreCase(name)) {
			yield_act_qty(value);
			return;
		}
		if ($purc_act_qty.equalsIgnoreCase(name)) {
			purc_act_qty(value);
			return;
		}
		if ($insp_act_qty.equalsIgnoreCase(name)) {
			insp_act_qty(value);
			return;
		}
		if ($yield_remain_qty.equalsIgnoreCase(name)) {
			yield_remain_qty(value);
			return;
		}
		if ($purc_remain_qty.equalsIgnoreCase(name)) {
			purc_remain_qty(value);
			return;
		}
		if ($insp_remain_qty.equalsIgnoreCase(name)) {
			insp_remain_qty(value);
			return;
		}
		if ($schd_alloc_qty.equalsIgnoreCase(name)) {
			schd_alloc_qty(value);
			return;
		}
		if ($surplus_qty.equalsIgnoreCase(name)) {
			surplus_qty(value);
			return;
		}
		if ($abort_qty.equalsIgnoreCase(name)) {
			abort_qty(value);
			return;
		}
		if ($arr_yield_rate.equalsIgnoreCase(name)) {
			arr_yield_rate(value);
			return;
		}
		if ($purc_rate.equalsIgnoreCase(name)) {
			purc_rate(value);
			return;
		}
		if ($cont_fctr_inst_qty.equalsIgnoreCase(name)) {
			cont_fctr_inst_qty(value);
			return;
		}
		if ($cont_fctr_schd_yield_qty.equalsIgnoreCase(name)) {
			cont_fctr_schd_yield_qty(value);
			return;
		}
		if ($std_cont_fctr.equalsIgnoreCase(name)) {
			std_cont_fctr(value);
			return;
		}
		if ($mrp_mfg_lt.equalsIgnoreCase(name)) {
			mrp_mfg_lt(value);
			return;
		}
		if ($mfg_lt.equalsIgnoreCase(name)) {
			mfg_lt(value);
			return;
		}
		if ($act_mfg_lt.equalsIgnoreCase(name)) {
			act_mfg_lt(value);
			return;
		}
		if ($mrp_purc_lt.equalsIgnoreCase(name)) {
			mrp_purc_lt(value);
			return;
		}
		if ($purc_lt.equalsIgnoreCase(name)) {
			purc_lt(value);
			return;
		}
		if ($act_purc_lt.equalsIgnoreCase(name)) {
			act_purc_lt(value);
			return;
		}
		if ($margin_days.equalsIgnoreCase(name)) {
			margin_days(value);
			return;
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($cont_fctr_dec_place.equalsIgnoreCase(name)) {
			cont_fctr_dec_place(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($inst_qty.equalsIgnoreCase(name)) {
			inst_qty(value);
			return;
		}
		if ($yield_schd_qty.equalsIgnoreCase(name)) {
			yield_schd_qty(value);
			return;
		}
		if ($inst_yield_schd_qty.equalsIgnoreCase(name)) {
			inst_yield_schd_qty(value);
			return;
		}
		if ($yield_act_qty.equalsIgnoreCase(name)) {
			yield_act_qty(value);
			return;
		}
		if ($purc_act_qty.equalsIgnoreCase(name)) {
			purc_act_qty(value);
			return;
		}
		if ($insp_act_qty.equalsIgnoreCase(name)) {
			insp_act_qty(value);
			return;
		}
		if ($yield_remain_qty.equalsIgnoreCase(name)) {
			yield_remain_qty(value);
			return;
		}
		if ($purc_remain_qty.equalsIgnoreCase(name)) {
			purc_remain_qty(value);
			return;
		}
		if ($insp_remain_qty.equalsIgnoreCase(name)) {
			insp_remain_qty(value);
			return;
		}
		if ($schd_alloc_qty.equalsIgnoreCase(name)) {
			schd_alloc_qty(value);
			return;
		}
		if ($surplus_qty.equalsIgnoreCase(name)) {
			surplus_qty(value);
			return;
		}
		if ($abort_qty.equalsIgnoreCase(name)) {
			abort_qty(value);
			return;
		}
		if ($arr_yield_rate.equalsIgnoreCase(name)) {
			arr_yield_rate(value);
			return;
		}
		if ($purc_rate.equalsIgnoreCase(name)) {
			purc_rate(value);
			return;
		}
		if ($cont_fctr_inst_qty.equalsIgnoreCase(name)) {
			cont_fctr_inst_qty(value);
			return;
		}
		if ($cont_fctr_schd_yield_qty.equalsIgnoreCase(name)) {
			cont_fctr_schd_yield_qty(value);
			return;
		}
		if ($std_cont_fctr.equalsIgnoreCase(name)) {
			std_cont_fctr(value);
			return;
		}
		if ($mrp_mfg_lt.equalsIgnoreCase(name)) {
			mrp_mfg_lt(value);
			return;
		}
		if ($mfg_lt.equalsIgnoreCase(name)) {
			mfg_lt(value);
			return;
		}
		if ($act_mfg_lt.equalsIgnoreCase(name)) {
			act_mfg_lt(value);
			return;
		}
		if ($mrp_purc_lt.equalsIgnoreCase(name)) {
			mrp_purc_lt(value);
			return;
		}
		if ($purc_lt.equalsIgnoreCase(name)) {
			purc_lt(value);
			return;
		}
		if ($act_purc_lt.equalsIgnoreCase(name)) {
			act_purc_lt(value);
			return;
		}
		if ($margin_days.equalsIgnoreCase(name)) {
			margin_days(value);
			return;
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($cont_fctr_dec_place.equalsIgnoreCase(name)) {
			cont_fctr_dec_place(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($inst_qty.equalsIgnoreCase(name)) {
			inst_qty(value);
			return;
		}
		if ($yield_schd_qty.equalsIgnoreCase(name)) {
			yield_schd_qty(value);
			return;
		}
		if ($inst_yield_schd_qty.equalsIgnoreCase(name)) {
			inst_yield_schd_qty(value);
			return;
		}
		if ($yield_act_qty.equalsIgnoreCase(name)) {
			yield_act_qty(value);
			return;
		}
		if ($purc_act_qty.equalsIgnoreCase(name)) {
			purc_act_qty(value);
			return;
		}
		if ($insp_act_qty.equalsIgnoreCase(name)) {
			insp_act_qty(value);
			return;
		}
		if ($yield_remain_qty.equalsIgnoreCase(name)) {
			yield_remain_qty(value);
			return;
		}
		if ($purc_remain_qty.equalsIgnoreCase(name)) {
			purc_remain_qty(value);
			return;
		}
		if ($insp_remain_qty.equalsIgnoreCase(name)) {
			insp_remain_qty(value);
			return;
		}
		if ($schd_alloc_qty.equalsIgnoreCase(name)) {
			schd_alloc_qty(value);
			return;
		}
		if ($surplus_qty.equalsIgnoreCase(name)) {
			surplus_qty(value);
			return;
		}
		if ($abort_qty.equalsIgnoreCase(name)) {
			abort_qty(value);
			return;
		}
		if ($arr_yield_rate.equalsIgnoreCase(name)) {
			arr_yield_rate(value);
			return;
		}
		if ($purc_rate.equalsIgnoreCase(name)) {
			purc_rate(value);
			return;
		}
		if ($cont_fctr_inst_qty.equalsIgnoreCase(name)) {
			cont_fctr_inst_qty(value);
			return;
		}
		if ($cont_fctr_schd_yield_qty.equalsIgnoreCase(name)) {
			cont_fctr_schd_yield_qty(value);
			return;
		}
		if ($std_cont_fctr.equalsIgnoreCase(name)) {
			std_cont_fctr(value);
			return;
		}
		if ($mrp_mfg_lt.equalsIgnoreCase(name)) {
			mrp_mfg_lt(value);
			return;
		}
		if ($mfg_lt.equalsIgnoreCase(name)) {
			mfg_lt(value);
			return;
		}
		if ($act_mfg_lt.equalsIgnoreCase(name)) {
			act_mfg_lt(value);
			return;
		}
		if ($mrp_purc_lt.equalsIgnoreCase(name)) {
			mrp_purc_lt(value);
			return;
		}
		if ($purc_lt.equalsIgnoreCase(name)) {
			purc_lt(value);
			return;
		}
		if ($act_purc_lt.equalsIgnoreCase(name)) {
			act_purc_lt(value);
			return;
		}
		if ($margin_days.equalsIgnoreCase(name)) {
			margin_days(value);
			return;
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($cont_fctr_dec_place.equalsIgnoreCase(name)) {
			cont_fctr_dec_place(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($inst_qty.equalsIgnoreCase(name)) {
			inst_qty(value);
			return;
		}
		if ($yield_schd_qty.equalsIgnoreCase(name)) {
			yield_schd_qty(value);
			return;
		}
		if ($inst_yield_schd_qty.equalsIgnoreCase(name)) {
			inst_yield_schd_qty(value);
			return;
		}
		if ($yield_act_qty.equalsIgnoreCase(name)) {
			yield_act_qty(value);
			return;
		}
		if ($purc_act_qty.equalsIgnoreCase(name)) {
			purc_act_qty(value);
			return;
		}
		if ($insp_act_qty.equalsIgnoreCase(name)) {
			insp_act_qty(value);
			return;
		}
		if ($yield_remain_qty.equalsIgnoreCase(name)) {
			yield_remain_qty(value);
			return;
		}
		if ($purc_remain_qty.equalsIgnoreCase(name)) {
			purc_remain_qty(value);
			return;
		}
		if ($insp_remain_qty.equalsIgnoreCase(name)) {
			insp_remain_qty(value);
			return;
		}
		if ($schd_alloc_qty.equalsIgnoreCase(name)) {
			schd_alloc_qty(value);
			return;
		}
		if ($surplus_qty.equalsIgnoreCase(name)) {
			surplus_qty(value);
			return;
		}
		if ($abort_qty.equalsIgnoreCase(name)) {
			abort_qty(value);
			return;
		}
		if ($arr_yield_rate.equalsIgnoreCase(name)) {
			arr_yield_rate(value);
			return;
		}
		if ($purc_rate.equalsIgnoreCase(name)) {
			purc_rate(value);
			return;
		}
		if ($cont_fctr_inst_qty.equalsIgnoreCase(name)) {
			cont_fctr_inst_qty(value);
			return;
		}
		if ($cont_fctr_schd_yield_qty.equalsIgnoreCase(name)) {
			cont_fctr_schd_yield_qty(value);
			return;
		}
		if ($std_cont_fctr.equalsIgnoreCase(name)) {
			std_cont_fctr(value);
			return;
		}
		if ($mrp_mfg_lt.equalsIgnoreCase(name)) {
			mrp_mfg_lt(value);
			return;
		}
		if ($mfg_lt.equalsIgnoreCase(name)) {
			mfg_lt(value);
			return;
		}
		if ($act_mfg_lt.equalsIgnoreCase(name)) {
			act_mfg_lt(value);
			return;
		}
		if ($mrp_purc_lt.equalsIgnoreCase(name)) {
			mrp_purc_lt(value);
			return;
		}
		if ($purc_lt.equalsIgnoreCase(name)) {
			purc_lt(value);
			return;
		}
		if ($act_purc_lt.equalsIgnoreCase(name)) {
			act_purc_lt(value);
			return;
		}
		if ($margin_days.equalsIgnoreCase(name)) {
			margin_days(value);
			return;
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($cont_fctr_dec_place.equalsIgnoreCase(name)) {
			cont_fctr_dec_place(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($mrp_po_schd_dt.equalsIgnoreCase(name)) {
			mrp_po_schd_dt(value);
			return;
		}
		if ($po_schd_dt.equalsIgnoreCase(name)) {
			po_schd_dt(value);
			return;
		}
		if ($latest_po_d_dt.equalsIgnoreCase(name)) {
			latest_po_d_dt(value);
			return;
		}
		if ($mrp_gi_schd_dt.equalsIgnoreCase(name)) {
			mrp_gi_schd_dt(value);
			return;
		}
		if ($gi_schd_dt.equalsIgnoreCase(name)) {
			gi_schd_dt(value);
			return;
		}
		if ($inst_gi_schd_dt.equalsIgnoreCase(name)) {
			inst_gi_schd_dt(value);
			return;
		}
		if ($latest_gi_act_dt.equalsIgnoreCase(name)) {
			latest_gi_act_dt(value);
			return;
		}
		if ($mrp_mfg_st_schd_dt.equalsIgnoreCase(name)) {
			mrp_mfg_st_schd_dt(value);
			return;
		}
		if ($mfg_st_schd_dt.equalsIgnoreCase(name)) {
			mfg_st_schd_dt(value);
			return;
		}
		if ($inst_mfg_st_schd_dt.equalsIgnoreCase(name)) {
			inst_mfg_st_schd_dt(value);
			return;
		}
		if ($latest_mfg_st_act_dt.equalsIgnoreCase(name)) {
			latest_mfg_st_act_dt(value);
			return;
		}
		if ($mrp_mfg_end_schd_dt.equalsIgnoreCase(name)) {
			mrp_mfg_end_schd_dt(value);
			return;
		}
		if ($mfg_end_schd_dt.equalsIgnoreCase(name)) {
			mfg_end_schd_dt(value);
			return;
		}
		if ($inst_mfg_end_schd_dt.equalsIgnoreCase(name)) {
			inst_mfg_end_schd_dt(value);
			return;
		}
		if ($latest_mfg_end_act_dt.equalsIgnoreCase(name)) {
			latest_mfg_end_act_dt(value);
			return;
		}
		if ($mrp_strg_schd_dt.equalsIgnoreCase(name)) {
			mrp_strg_schd_dt(value);
			return;
		}
		if ($strg_schd_dt.equalsIgnoreCase(name)) {
			strg_schd_dt(value);
			return;
		}
		if ($inst_strg_schd_dt.equalsIgnoreCase(name)) {
			inst_strg_schd_dt(value);
			return;
		}
		if ($latest_strg_act_dt.equalsIgnoreCase(name)) {
			latest_strg_act_dt(value);
			return;
		}
		if ($mrp_accpt_schd_dt.equalsIgnoreCase(name)) {
			mrp_accpt_schd_dt(value);
			return;
		}
		if ($accpt_schd_dt.equalsIgnoreCase(name)) {
			accpt_schd_dt(value);
			return;
		}
		if ($inst_accpt_schd_dt.equalsIgnoreCase(name)) {
			inst_accpt_schd_dt(value);
			return;
		}
		if ($latest_accpt_act_dt.equalsIgnoreCase(name)) {
			latest_accpt_act_dt(value);
			return;
		}
		if ($mrp_insp_st_schd_dt.equalsIgnoreCase(name)) {
			mrp_insp_st_schd_dt(value);
			return;
		}
		if ($insp_st_schd_dt.equalsIgnoreCase(name)) {
			insp_st_schd_dt(value);
			return;
		}
		if ($inst_insp_st_schd_dt.equalsIgnoreCase(name)) {
			inst_insp_st_schd_dt(value);
			return;
		}
		if ($latest_insp_st_act_dt.equalsIgnoreCase(name)) {
			latest_insp_st_act_dt(value);
			return;
		}
		if ($mrp_insp_end_schd_dt.equalsIgnoreCase(name)) {
			mrp_insp_end_schd_dt(value);
			return;
		}
		if ($insp_end_schd_dt.equalsIgnoreCase(name)) {
			insp_end_schd_dt(value);
			return;
		}
		if ($inst_insp_end_schd_dt.equalsIgnoreCase(name)) {
			inst_insp_end_schd_dt(value);
			return;
		}
		if ($latest_insp_end_act_dt.equalsIgnoreCase(name)) {
			latest_insp_end_act_dt(value);
			return;
		}
		if ($mrp_avl_schd_dt.equalsIgnoreCase(name)) {
			mrp_avl_schd_dt(value);
			return;
		}
		if ($avl_schd_dt.equalsIgnoreCase(name)) {
			avl_schd_dt(value);
			return;
		}
		if ($po_avl_schd_dt.equalsIgnoreCase(name)) {
			po_avl_schd_dt(value);
			return;
		}
		if ($avl_dt.equalsIgnoreCase(name)) {
			avl_dt(value);
			return;
		}
		if ($io_avl_schd_dt.equalsIgnoreCase(name)) {
			io_avl_schd_dt(value);
			return;
		}
		if ($schd_so_dt.equalsIgnoreCase(name)) {
			schd_so_dt(value);
			return;
		}
		if ($fix_dt.equalsIgnoreCase(name)) {
			fix_dt(value);
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
		if ($bndl_flg.equalsIgnoreCase(name)) {
			bndl_flg(value);
			return;
		}
		if ($delay_expt_flg.equalsIgnoreCase(name)) {
			delay_expt_flg(value);
			return;
		}
		if ($not_fix_flg.equalsIgnoreCase(name)) {
			not_fix_flg(value);
			return;
		}
		if ($ord_rcv_flg.equalsIgnoreCase(name)) {
			ord_rcv_flg(value);
			return;
		}
		if ($ord_snd_flg.equalsIgnoreCase(name)) {
			ord_snd_flg(value);
			return;
		}
		if ($for_scheduler_frozen_flg.equalsIgnoreCase(name)) {
			for_scheduler_frozen_flg(value);
			return;
		}
		if ($scheduler_frozen_flg.equalsIgnoreCase(name)) {
			scheduler_frozen_flg(value);
			return;
		}
		if ($schd_yield_red_flg.equalsIgnoreCase(name)) {
			schd_yield_red_flg(value);
			return;
		}
		if ($st_dt_red_flg.equalsIgnoreCase(name)) {
			st_dt_red_flg(value);
			return;
		}
		if ($end_dt_red_flg.equalsIgnoreCase(name)) {
			end_dt_red_flg(value);
			return;
		}
		if ($avl_schd_dt_red_flg.equalsIgnoreCase(name)) {
			avl_schd_dt_red_flg(value);
			return;
		}
		if ($alloc_pln_red_flg.equalsIgnoreCase(name)) {
			alloc_pln_red_flg(value);
			return;
		}
		if ($surplus_ord_flg.equalsIgnoreCase(name)) {
			surplus_ord_flg(value);
			return;
		}
		if ($no_problem_flg.equalsIgnoreCase(name)) {
			no_problem_flg(value);
			return;
		}
		if ($cont_fctr_flg.equalsIgnoreCase(name)) {
			cont_fctr_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
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
		if ($itm_ord_sts_typ.equalsIgnoreCase(name)) {
			itm_ord_sts_typ(value);
			return;
		}
		if ($itm_ord_sts_typ_nm.equalsIgnoreCase(name)) {
			itm_ord_sts_typ_nm(value);
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
		if ($ver_no.equalsIgnoreCase(name)) {
			ver_no(value);
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
		if ($cont_fctr_unit_cd.equalsIgnoreCase(name)) {
			cont_fctr_unit_cd(value);
			return;
		}
		if ($cont_fctr_unit_nm.equalsIgnoreCase(name)) {
			cont_fctr_unit_nm(value);
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
		if ($mfg_loc_cd.equalsIgnoreCase(name)) {
			mfg_loc_cd(value);
			return;
		}
		if ($mfg_loc_nm.equalsIgnoreCase(name)) {
			mfg_loc_nm(value);
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
		if ($oper_ptn.equalsIgnoreCase(name)) {
			oper_ptn(value);
			return;
		}
		if ($bom_ptn.equalsIgnoreCase(name)) {
			bom_ptn(value);
			return;
		}
		if ($rqmt_no.equalsIgnoreCase(name)) {
			rqmt_no(value);
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
		if ($ord_gnrt_typ.equalsIgnoreCase(name)) {
			ord_gnrt_typ(value);
			return;
		}
		if ($ord_gnrt_typ_nm.equalsIgnoreCase(name)) {
			ord_gnrt_typ_nm(value);
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
		if ($ext_sys_cd.equalsIgnoreCase(name)) {
			ext_sys_cd(value);
			return;
		}
		if ($ext_sys_nm.equalsIgnoreCase(name)) {
			ext_sys_nm(value);
			return;
		}
		if ($ext_itm_ord_no.equalsIgnoreCase(name)) {
			ext_itm_ord_no(value);
			return;
		}
		if ($itm_grp_cd1.equalsIgnoreCase(name)) {
			itm_grp_cd1(value);
			return;
		}
		if ($itm_grp_nm1.equalsIgnoreCase(name)) {
			itm_grp_nm1(value);
			return;
		}
		if ($itm_grp_cd2.equalsIgnoreCase(name)) {
			itm_grp_cd2(value);
			return;
		}
		if ($itm_grp_nm2.equalsIgnoreCase(name)) {
			itm_grp_nm2(value);
			return;
		}
		if ($itm_grp_cd3.equalsIgnoreCase(name)) {
			itm_grp_cd3(value);
			return;
		}
		if ($itm_grp_nm3.equalsIgnoreCase(name)) {
			itm_grp_nm3(value);
			return;
		}
		if ($itm_grp_cd4.equalsIgnoreCase(name)) {
			itm_grp_cd4(value);
			return;
		}
		if ($itm_grp_nm4.equalsIgnoreCase(name)) {
			itm_grp_nm4(value);
			return;
		}
		if ($itm_grp_cd5.equalsIgnoreCase(name)) {
			itm_grp_cd5(value);
			return;
		}
		if ($itm_grp_nm5.equalsIgnoreCase(name)) {
			itm_grp_nm5(value);
			return;
		}
		if ($itm_grp_cd6.equalsIgnoreCase(name)) {
			itm_grp_cd6(value);
			return;
		}
		if ($itm_grp_nm6.equalsIgnoreCase(name)) {
			itm_grp_nm6(value);
			return;
		}
		if ($itm_grp_cd7.equalsIgnoreCase(name)) {
			itm_grp_cd7(value);
			return;
		}
		if ($itm_grp_nm7.equalsIgnoreCase(name)) {
			itm_grp_nm7(value);
			return;
		}
		if ($itm_grp_cd8.equalsIgnoreCase(name)) {
			itm_grp_cd8(value);
			return;
		}
		if ($itm_grp_nm8.equalsIgnoreCase(name)) {
			itm_grp_nm8(value);
			return;
		}
		if ($itm_grp_cd9.equalsIgnoreCase(name)) {
			itm_grp_cd9(value);
			return;
		}
		if ($itm_grp_nm9.equalsIgnoreCase(name)) {
			itm_grp_nm9(value);
			return;
		}
		if ($itm_grp_cd10.equalsIgnoreCase(name)) {
			itm_grp_cd10(value);
			return;
		}
		if ($itm_grp_nm10.equalsIgnoreCase(name)) {
			itm_grp_nm10(value);
			return;
		}
		if ($sppl_grp_cd1.equalsIgnoreCase(name)) {
			sppl_grp_cd1(value);
			return;
		}
		if ($sppl_grp_nm1.equalsIgnoreCase(name)) {
			sppl_grp_nm1(value);
			return;
		}
		if ($sppl_grp_cd2.equalsIgnoreCase(name)) {
			sppl_grp_cd2(value);
			return;
		}
		if ($sppl_grp_nm2.equalsIgnoreCase(name)) {
			sppl_grp_nm2(value);
			return;
		}
		if ($sppl_grp_cd3.equalsIgnoreCase(name)) {
			sppl_grp_cd3(value);
			return;
		}
		if ($sppl_grp_nm3.equalsIgnoreCase(name)) {
			sppl_grp_nm3(value);
			return;
		}
		if ($sppl_grp_cd4.equalsIgnoreCase(name)) {
			sppl_grp_cd4(value);
			return;
		}
		if ($sppl_grp_nm4.equalsIgnoreCase(name)) {
			sppl_grp_nm4(value);
			return;
		}
		if ($sppl_grp_cd5.equalsIgnoreCase(name)) {
			sppl_grp_cd5(value);
			return;
		}
		if ($sppl_grp_nm5.equalsIgnoreCase(name)) {
			sppl_grp_nm5(value);
			return;
		}
		if ($sppl_grp_cd6.equalsIgnoreCase(name)) {
			sppl_grp_cd6(value);
			return;
		}
		if ($sppl_grp_nm6.equalsIgnoreCase(name)) {
			sppl_grp_nm6(value);
			return;
		}
		if ($sppl_grp_cd7.equalsIgnoreCase(name)) {
			sppl_grp_cd7(value);
			return;
		}
		if ($sppl_grp_nm7.equalsIgnoreCase(name)) {
			sppl_grp_nm7(value);
			return;
		}
		if ($sppl_grp_cd8.equalsIgnoreCase(name)) {
			sppl_grp_cd8(value);
			return;
		}
		if ($sppl_grp_nm8.equalsIgnoreCase(name)) {
			sppl_grp_nm8(value);
			return;
		}
		if ($sppl_grp_cd9.equalsIgnoreCase(name)) {
			sppl_grp_cd9(value);
			return;
		}
		if ($sppl_grp_nm9.equalsIgnoreCase(name)) {
			sppl_grp_nm9(value);
			return;
		}
		if ($sppl_grp_cd10.equalsIgnoreCase(name)) {
			sppl_grp_cd10(value);
			return;
		}
		if ($sppl_grp_nm10.equalsIgnoreCase(name)) {
			sppl_grp_nm10(value);
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
		if ($cont_fctr_rnd_typ.equalsIgnoreCase(name)) {
			cont_fctr_rnd_typ(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($inst_qty.equalsIgnoreCase(name)) {
			inst_qty(value);
			return;
		}
		if ($yield_schd_qty.equalsIgnoreCase(name)) {
			yield_schd_qty(value);
			return;
		}
		if ($inst_yield_schd_qty.equalsIgnoreCase(name)) {
			inst_yield_schd_qty(value);
			return;
		}
		if ($yield_act_qty.equalsIgnoreCase(name)) {
			yield_act_qty(value);
			return;
		}
		if ($purc_act_qty.equalsIgnoreCase(name)) {
			purc_act_qty(value);
			return;
		}
		if ($insp_act_qty.equalsIgnoreCase(name)) {
			insp_act_qty(value);
			return;
		}
		if ($yield_remain_qty.equalsIgnoreCase(name)) {
			yield_remain_qty(value);
			return;
		}
		if ($purc_remain_qty.equalsIgnoreCase(name)) {
			purc_remain_qty(value);
			return;
		}
		if ($insp_remain_qty.equalsIgnoreCase(name)) {
			insp_remain_qty(value);
			return;
		}
		if ($schd_alloc_qty.equalsIgnoreCase(name)) {
			schd_alloc_qty(value);
			return;
		}
		if ($surplus_qty.equalsIgnoreCase(name)) {
			surplus_qty(value);
			return;
		}
		if ($abort_qty.equalsIgnoreCase(name)) {
			abort_qty(value);
			return;
		}
		if ($arr_yield_rate.equalsIgnoreCase(name)) {
			arr_yield_rate(value);
			return;
		}
		if ($purc_rate.equalsIgnoreCase(name)) {
			purc_rate(value);
			return;
		}
		if ($cont_fctr_inst_qty.equalsIgnoreCase(name)) {
			cont_fctr_inst_qty(value);
			return;
		}
		if ($cont_fctr_schd_yield_qty.equalsIgnoreCase(name)) {
			cont_fctr_schd_yield_qty(value);
			return;
		}
		if ($std_cont_fctr.equalsIgnoreCase(name)) {
			std_cont_fctr(value);
			return;
		}
		if ($mrp_mfg_lt.equalsIgnoreCase(name)) {
			mrp_mfg_lt(value);
			return;
		}
		if ($mfg_lt.equalsIgnoreCase(name)) {
			mfg_lt(value);
			return;
		}
		if ($act_mfg_lt.equalsIgnoreCase(name)) {
			act_mfg_lt(value);
			return;
		}
		if ($mrp_purc_lt.equalsIgnoreCase(name)) {
			mrp_purc_lt(value);
			return;
		}
		if ($purc_lt.equalsIgnoreCase(name)) {
			purc_lt(value);
			return;
		}
		if ($act_purc_lt.equalsIgnoreCase(name)) {
			act_purc_lt(value);
			return;
		}
		if ($margin_days.equalsIgnoreCase(name)) {
			margin_days(value);
			return;
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($cont_fctr_dec_place.equalsIgnoreCase(name)) {
			cont_fctr_dec_place(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($inst_qty.equalsIgnoreCase(name)) {
			inst_qty(value);
			return;
		}
		if ($yield_schd_qty.equalsIgnoreCase(name)) {
			yield_schd_qty(value);
			return;
		}
		if ($inst_yield_schd_qty.equalsIgnoreCase(name)) {
			inst_yield_schd_qty(value);
			return;
		}
		if ($yield_act_qty.equalsIgnoreCase(name)) {
			yield_act_qty(value);
			return;
		}
		if ($purc_act_qty.equalsIgnoreCase(name)) {
			purc_act_qty(value);
			return;
		}
		if ($insp_act_qty.equalsIgnoreCase(name)) {
			insp_act_qty(value);
			return;
		}
		if ($yield_remain_qty.equalsIgnoreCase(name)) {
			yield_remain_qty(value);
			return;
		}
		if ($purc_remain_qty.equalsIgnoreCase(name)) {
			purc_remain_qty(value);
			return;
		}
		if ($insp_remain_qty.equalsIgnoreCase(name)) {
			insp_remain_qty(value);
			return;
		}
		if ($schd_alloc_qty.equalsIgnoreCase(name)) {
			schd_alloc_qty(value);
			return;
		}
		if ($surplus_qty.equalsIgnoreCase(name)) {
			surplus_qty(value);
			return;
		}
		if ($abort_qty.equalsIgnoreCase(name)) {
			abort_qty(value);
			return;
		}
		if ($arr_yield_rate.equalsIgnoreCase(name)) {
			arr_yield_rate(value);
			return;
		}
		if ($purc_rate.equalsIgnoreCase(name)) {
			purc_rate(value);
			return;
		}
		if ($cont_fctr_inst_qty.equalsIgnoreCase(name)) {
			cont_fctr_inst_qty(value);
			return;
		}
		if ($cont_fctr_schd_yield_qty.equalsIgnoreCase(name)) {
			cont_fctr_schd_yield_qty(value);
			return;
		}
		if ($std_cont_fctr.equalsIgnoreCase(name)) {
			std_cont_fctr(value);
			return;
		}
		if ($mrp_mfg_lt.equalsIgnoreCase(name)) {
			mrp_mfg_lt(value);
			return;
		}
		if ($mfg_lt.equalsIgnoreCase(name)) {
			mfg_lt(value);
			return;
		}
		if ($act_mfg_lt.equalsIgnoreCase(name)) {
			act_mfg_lt(value);
			return;
		}
		if ($mrp_purc_lt.equalsIgnoreCase(name)) {
			mrp_purc_lt(value);
			return;
		}
		if ($purc_lt.equalsIgnoreCase(name)) {
			purc_lt(value);
			return;
		}
		if ($act_purc_lt.equalsIgnoreCase(name)) {
			act_purc_lt(value);
			return;
		}
		if ($margin_days.equalsIgnoreCase(name)) {
			margin_days(value);
			return;
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($cont_fctr_dec_place.equalsIgnoreCase(name)) {
			cont_fctr_dec_place(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($inst_qty.equalsIgnoreCase(name)) {
			inst_qty(value);
			return;
		}
		if ($yield_schd_qty.equalsIgnoreCase(name)) {
			yield_schd_qty(value);
			return;
		}
		if ($inst_yield_schd_qty.equalsIgnoreCase(name)) {
			inst_yield_schd_qty(value);
			return;
		}
		if ($yield_act_qty.equalsIgnoreCase(name)) {
			yield_act_qty(value);
			return;
		}
		if ($purc_act_qty.equalsIgnoreCase(name)) {
			purc_act_qty(value);
			return;
		}
		if ($insp_act_qty.equalsIgnoreCase(name)) {
			insp_act_qty(value);
			return;
		}
		if ($yield_remain_qty.equalsIgnoreCase(name)) {
			yield_remain_qty(value);
			return;
		}
		if ($purc_remain_qty.equalsIgnoreCase(name)) {
			purc_remain_qty(value);
			return;
		}
		if ($insp_remain_qty.equalsIgnoreCase(name)) {
			insp_remain_qty(value);
			return;
		}
		if ($schd_alloc_qty.equalsIgnoreCase(name)) {
			schd_alloc_qty(value);
			return;
		}
		if ($surplus_qty.equalsIgnoreCase(name)) {
			surplus_qty(value);
			return;
		}
		if ($abort_qty.equalsIgnoreCase(name)) {
			abort_qty(value);
			return;
		}
		if ($arr_yield_rate.equalsIgnoreCase(name)) {
			arr_yield_rate(value);
			return;
		}
		if ($purc_rate.equalsIgnoreCase(name)) {
			purc_rate(value);
			return;
		}
		if ($cont_fctr_inst_qty.equalsIgnoreCase(name)) {
			cont_fctr_inst_qty(value);
			return;
		}
		if ($cont_fctr_schd_yield_qty.equalsIgnoreCase(name)) {
			cont_fctr_schd_yield_qty(value);
			return;
		}
		if ($std_cont_fctr.equalsIgnoreCase(name)) {
			std_cont_fctr(value);
			return;
		}
		if ($mrp_mfg_lt.equalsIgnoreCase(name)) {
			mrp_mfg_lt(value);
			return;
		}
		if ($mfg_lt.equalsIgnoreCase(name)) {
			mfg_lt(value);
			return;
		}
		if ($act_mfg_lt.equalsIgnoreCase(name)) {
			act_mfg_lt(value);
			return;
		}
		if ($mrp_purc_lt.equalsIgnoreCase(name)) {
			mrp_purc_lt(value);
			return;
		}
		if ($purc_lt.equalsIgnoreCase(name)) {
			purc_lt(value);
			return;
		}
		if ($act_purc_lt.equalsIgnoreCase(name)) {
			act_purc_lt(value);
			return;
		}
		if ($margin_days.equalsIgnoreCase(name)) {
			margin_days(value);
			return;
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($cont_fctr_dec_place.equalsIgnoreCase(name)) {
			cont_fctr_dec_place(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($inst_qty.equalsIgnoreCase(name)) {
			inst_qty(value);
			return;
		}
		if ($yield_schd_qty.equalsIgnoreCase(name)) {
			yield_schd_qty(value);
			return;
		}
		if ($inst_yield_schd_qty.equalsIgnoreCase(name)) {
			inst_yield_schd_qty(value);
			return;
		}
		if ($yield_act_qty.equalsIgnoreCase(name)) {
			yield_act_qty(value);
			return;
		}
		if ($purc_act_qty.equalsIgnoreCase(name)) {
			purc_act_qty(value);
			return;
		}
		if ($insp_act_qty.equalsIgnoreCase(name)) {
			insp_act_qty(value);
			return;
		}
		if ($yield_remain_qty.equalsIgnoreCase(name)) {
			yield_remain_qty(value);
			return;
		}
		if ($purc_remain_qty.equalsIgnoreCase(name)) {
			purc_remain_qty(value);
			return;
		}
		if ($insp_remain_qty.equalsIgnoreCase(name)) {
			insp_remain_qty(value);
			return;
		}
		if ($schd_alloc_qty.equalsIgnoreCase(name)) {
			schd_alloc_qty(value);
			return;
		}
		if ($surplus_qty.equalsIgnoreCase(name)) {
			surplus_qty(value);
			return;
		}
		if ($abort_qty.equalsIgnoreCase(name)) {
			abort_qty(value);
			return;
		}
		if ($arr_yield_rate.equalsIgnoreCase(name)) {
			arr_yield_rate(value);
			return;
		}
		if ($purc_rate.equalsIgnoreCase(name)) {
			purc_rate(value);
			return;
		}
		if ($cont_fctr_inst_qty.equalsIgnoreCase(name)) {
			cont_fctr_inst_qty(value);
			return;
		}
		if ($cont_fctr_schd_yield_qty.equalsIgnoreCase(name)) {
			cont_fctr_schd_yield_qty(value);
			return;
		}
		if ($std_cont_fctr.equalsIgnoreCase(name)) {
			std_cont_fctr(value);
			return;
		}
		if ($mrp_mfg_lt.equalsIgnoreCase(name)) {
			mrp_mfg_lt(value);
			return;
		}
		if ($mfg_lt.equalsIgnoreCase(name)) {
			mfg_lt(value);
			return;
		}
		if ($act_mfg_lt.equalsIgnoreCase(name)) {
			act_mfg_lt(value);
			return;
		}
		if ($mrp_purc_lt.equalsIgnoreCase(name)) {
			mrp_purc_lt(value);
			return;
		}
		if ($purc_lt.equalsIgnoreCase(name)) {
			purc_lt(value);
			return;
		}
		if ($act_purc_lt.equalsIgnoreCase(name)) {
			act_purc_lt(value);
			return;
		}
		if ($margin_days.equalsIgnoreCase(name)) {
			margin_days(value);
			return;
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($cont_fctr_dec_place.equalsIgnoreCase(name)) {
			cont_fctr_dec_place(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($inst_qty.equalsIgnoreCase(name)) {
			inst_qty(value);
			return;
		}
		if ($yield_schd_qty.equalsIgnoreCase(name)) {
			yield_schd_qty(value);
			return;
		}
		if ($inst_yield_schd_qty.equalsIgnoreCase(name)) {
			inst_yield_schd_qty(value);
			return;
		}
		if ($yield_act_qty.equalsIgnoreCase(name)) {
			yield_act_qty(value);
			return;
		}
		if ($purc_act_qty.equalsIgnoreCase(name)) {
			purc_act_qty(value);
			return;
		}
		if ($insp_act_qty.equalsIgnoreCase(name)) {
			insp_act_qty(value);
			return;
		}
		if ($yield_remain_qty.equalsIgnoreCase(name)) {
			yield_remain_qty(value);
			return;
		}
		if ($purc_remain_qty.equalsIgnoreCase(name)) {
			purc_remain_qty(value);
			return;
		}
		if ($insp_remain_qty.equalsIgnoreCase(name)) {
			insp_remain_qty(value);
			return;
		}
		if ($schd_alloc_qty.equalsIgnoreCase(name)) {
			schd_alloc_qty(value);
			return;
		}
		if ($surplus_qty.equalsIgnoreCase(name)) {
			surplus_qty(value);
			return;
		}
		if ($abort_qty.equalsIgnoreCase(name)) {
			abort_qty(value);
			return;
		}
		if ($arr_yield_rate.equalsIgnoreCase(name)) {
			arr_yield_rate(value);
			return;
		}
		if ($purc_rate.equalsIgnoreCase(name)) {
			purc_rate(value);
			return;
		}
		if ($cont_fctr_inst_qty.equalsIgnoreCase(name)) {
			cont_fctr_inst_qty(value);
			return;
		}
		if ($cont_fctr_schd_yield_qty.equalsIgnoreCase(name)) {
			cont_fctr_schd_yield_qty(value);
			return;
		}
		if ($std_cont_fctr.equalsIgnoreCase(name)) {
			std_cont_fctr(value);
			return;
		}
		if ($mrp_mfg_lt.equalsIgnoreCase(name)) {
			mrp_mfg_lt(value);
			return;
		}
		if ($mfg_lt.equalsIgnoreCase(name)) {
			mfg_lt(value);
			return;
		}
		if ($act_mfg_lt.equalsIgnoreCase(name)) {
			act_mfg_lt(value);
			return;
		}
		if ($mrp_purc_lt.equalsIgnoreCase(name)) {
			mrp_purc_lt(value);
			return;
		}
		if ($purc_lt.equalsIgnoreCase(name)) {
			purc_lt(value);
			return;
		}
		if ($act_purc_lt.equalsIgnoreCase(name)) {
			act_purc_lt(value);
			return;
		}
		if ($margin_days.equalsIgnoreCase(name)) {
			margin_days(value);
			return;
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($cont_fctr_dec_place.equalsIgnoreCase(name)) {
			cont_fctr_dec_place(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($mrp_po_schd_dt.equalsIgnoreCase(name)) {
			mrp_po_schd_dt(value);
			return;
		}
		if ($po_schd_dt.equalsIgnoreCase(name)) {
			po_schd_dt(value);
			return;
		}
		if ($latest_po_d_dt.equalsIgnoreCase(name)) {
			latest_po_d_dt(value);
			return;
		}
		if ($mrp_gi_schd_dt.equalsIgnoreCase(name)) {
			mrp_gi_schd_dt(value);
			return;
		}
		if ($gi_schd_dt.equalsIgnoreCase(name)) {
			gi_schd_dt(value);
			return;
		}
		if ($inst_gi_schd_dt.equalsIgnoreCase(name)) {
			inst_gi_schd_dt(value);
			return;
		}
		if ($latest_gi_act_dt.equalsIgnoreCase(name)) {
			latest_gi_act_dt(value);
			return;
		}
		if ($mrp_mfg_st_schd_dt.equalsIgnoreCase(name)) {
			mrp_mfg_st_schd_dt(value);
			return;
		}
		if ($mfg_st_schd_dt.equalsIgnoreCase(name)) {
			mfg_st_schd_dt(value);
			return;
		}
		if ($inst_mfg_st_schd_dt.equalsIgnoreCase(name)) {
			inst_mfg_st_schd_dt(value);
			return;
		}
		if ($latest_mfg_st_act_dt.equalsIgnoreCase(name)) {
			latest_mfg_st_act_dt(value);
			return;
		}
		if ($mrp_mfg_end_schd_dt.equalsIgnoreCase(name)) {
			mrp_mfg_end_schd_dt(value);
			return;
		}
		if ($mfg_end_schd_dt.equalsIgnoreCase(name)) {
			mfg_end_schd_dt(value);
			return;
		}
		if ($inst_mfg_end_schd_dt.equalsIgnoreCase(name)) {
			inst_mfg_end_schd_dt(value);
			return;
		}
		if ($latest_mfg_end_act_dt.equalsIgnoreCase(name)) {
			latest_mfg_end_act_dt(value);
			return;
		}
		if ($mrp_strg_schd_dt.equalsIgnoreCase(name)) {
			mrp_strg_schd_dt(value);
			return;
		}
		if ($strg_schd_dt.equalsIgnoreCase(name)) {
			strg_schd_dt(value);
			return;
		}
		if ($inst_strg_schd_dt.equalsIgnoreCase(name)) {
			inst_strg_schd_dt(value);
			return;
		}
		if ($latest_strg_act_dt.equalsIgnoreCase(name)) {
			latest_strg_act_dt(value);
			return;
		}
		if ($mrp_accpt_schd_dt.equalsIgnoreCase(name)) {
			mrp_accpt_schd_dt(value);
			return;
		}
		if ($accpt_schd_dt.equalsIgnoreCase(name)) {
			accpt_schd_dt(value);
			return;
		}
		if ($inst_accpt_schd_dt.equalsIgnoreCase(name)) {
			inst_accpt_schd_dt(value);
			return;
		}
		if ($latest_accpt_act_dt.equalsIgnoreCase(name)) {
			latest_accpt_act_dt(value);
			return;
		}
		if ($mrp_insp_st_schd_dt.equalsIgnoreCase(name)) {
			mrp_insp_st_schd_dt(value);
			return;
		}
		if ($insp_st_schd_dt.equalsIgnoreCase(name)) {
			insp_st_schd_dt(value);
			return;
		}
		if ($inst_insp_st_schd_dt.equalsIgnoreCase(name)) {
			inst_insp_st_schd_dt(value);
			return;
		}
		if ($latest_insp_st_act_dt.equalsIgnoreCase(name)) {
			latest_insp_st_act_dt(value);
			return;
		}
		if ($mrp_insp_end_schd_dt.equalsIgnoreCase(name)) {
			mrp_insp_end_schd_dt(value);
			return;
		}
		if ($insp_end_schd_dt.equalsIgnoreCase(name)) {
			insp_end_schd_dt(value);
			return;
		}
		if ($inst_insp_end_schd_dt.equalsIgnoreCase(name)) {
			inst_insp_end_schd_dt(value);
			return;
		}
		if ($latest_insp_end_act_dt.equalsIgnoreCase(name)) {
			latest_insp_end_act_dt(value);
			return;
		}
		if ($mrp_avl_schd_dt.equalsIgnoreCase(name)) {
			mrp_avl_schd_dt(value);
			return;
		}
		if ($avl_schd_dt.equalsIgnoreCase(name)) {
			avl_schd_dt(value);
			return;
		}
		if ($po_avl_schd_dt.equalsIgnoreCase(name)) {
			po_avl_schd_dt(value);
			return;
		}
		if ($avl_dt.equalsIgnoreCase(name)) {
			avl_dt(value);
			return;
		}
		if ($io_avl_schd_dt.equalsIgnoreCase(name)) {
			io_avl_schd_dt(value);
			return;
		}
		if ($schd_so_dt.equalsIgnoreCase(name)) {
			schd_so_dt(value);
			return;
		}
		if ($fix_dt.equalsIgnoreCase(name)) {
			fix_dt(value);
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
		if ($bndl_flg.equalsIgnoreCase(name)) {
			bndl_flg(value);
			return;
		}
		if ($delay_expt_flg.equalsIgnoreCase(name)) {
			delay_expt_flg(value);
			return;
		}
		if ($not_fix_flg.equalsIgnoreCase(name)) {
			not_fix_flg(value);
			return;
		}
		if ($ord_rcv_flg.equalsIgnoreCase(name)) {
			ord_rcv_flg(value);
			return;
		}
		if ($ord_snd_flg.equalsIgnoreCase(name)) {
			ord_snd_flg(value);
			return;
		}
		if ($for_scheduler_frozen_flg.equalsIgnoreCase(name)) {
			for_scheduler_frozen_flg(value);
			return;
		}
		if ($scheduler_frozen_flg.equalsIgnoreCase(name)) {
			scheduler_frozen_flg(value);
			return;
		}
		if ($schd_yield_red_flg.equalsIgnoreCase(name)) {
			schd_yield_red_flg(value);
			return;
		}
		if ($st_dt_red_flg.equalsIgnoreCase(name)) {
			st_dt_red_flg(value);
			return;
		}
		if ($end_dt_red_flg.equalsIgnoreCase(name)) {
			end_dt_red_flg(value);
			return;
		}
		if ($avl_schd_dt_red_flg.equalsIgnoreCase(name)) {
			avl_schd_dt_red_flg(value);
			return;
		}
		if ($alloc_pln_red_flg.equalsIgnoreCase(name)) {
			alloc_pln_red_flg(value);
			return;
		}
		if ($surplus_ord_flg.equalsIgnoreCase(name)) {
			surplus_ord_flg(value);
			return;
		}
		if ($no_problem_flg.equalsIgnoreCase(name)) {
			no_problem_flg(value);
			return;
		}
		if ($cont_fctr_flg.equalsIgnoreCase(name)) {
			cont_fctr_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

