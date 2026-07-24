package mcframe.clientMSBC.MSBCP0080;

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
	public static final String $itm_p = "itm_p";
	public static final String $ver_no_p = "ver_no_p";
	/**
	 * Aggregation まとめ.<p>
	 *
	 */
	public static final String $bndl_flg = "bndl_flg";
	public static final String $inst_qty_p = "inst_qty_p";
	public static final String $yield_schd_qty_p = "yield_schd_qty_p";
	public static final String $inst_yield_schd_qty_p = "inst_yield_schd_qty_p";
	public static final String $yield_act_qty_p = "yield_act_qty_p";
	public static final String $purc_act_qty_p = "purc_act_qty_p";
	public static final String $insp_act_qty_p = "insp_act_qty_p";
	public static final String $yield_remain_qty_p = "yield_remain_qty_p";
	public static final String $purc_remain_qty_p = "purc_remain_qty_p";
	public static final String $insp_remain_qty_p = "insp_remain_qty_p";
	public static final String $schd_alloc_qty_p = "schd_alloc_qty_p";
	public static final String $surplus_qty_p = "surplus_qty_p";
	public static final String $abort_qty_p = "abort_qty_p";
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
	public static final String $cont_fctr_inst_qty_p = "cont_fctr_inst_qty_p";
	public static final String $cont_fctr_schd_yield_qty_p = "cont_fctr_schd_yield_qty_p";
	public static final String $cont_unit_p = "cont_unit_p";
	public static final String $std_cont_p = "std_cont_p";
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
	public static final String $sno_wrk_no_p = "sno_wrk_no_p";
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
	public static final String $itm_grp_p = "itm_grp_p";
	public static final String $bp_grp_p = "bp_grp_p";
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

	public static final String $itm_cd = $itm_p + ".itm_cd";
	public static final String $itm_sub1 = $itm_p + ".itm_sub1";
	public static final String $itm_sub2 = $itm_p + ".itm_sub2";
	public static final String $itm_sub3 = $itm_p + ".itm_sub3";
	public static final String $itm_nm = $itm_p + ".itm_nm";
	public static final String $ver_no = $ver_no_p + ".ver_no";
	public static final String $inst_qty = $inst_qty_p + ".qty";
	public static final String $yield_schd_qty = $yield_schd_qty_p + ".qty";
	public static final String $inst_yield_schd_qty = $inst_yield_schd_qty_p + ".qty";
	public static final String $yield_act_qty = $yield_act_qty_p + ".qty";
	public static final String $purc_act_qty = $purc_act_qty_p + ".qty";
	public static final String $insp_act_qty = $insp_act_qty_p + ".qty";
	public static final String $yield_remain_qty = $yield_remain_qty_p + ".qty";
	public static final String $purc_remain_qty = $purc_remain_qty_p + ".qty";
	public static final String $insp_remain_qty = $insp_remain_qty_p + ".qty";
	public static final String $schd_alloc_qty = $schd_alloc_qty_p + ".qty";
	public static final String $surplus_qty = $surplus_qty_p + ".qty";
	public static final String $abort_qty = $abort_qty_p + ".qty";
	public static final String $cont_fctr_inst_qty = $cont_fctr_inst_qty_p + ".cont_qty";
	public static final String $cont_fctr_schd_yield_qty = $cont_fctr_schd_yield_qty_p + ".cont_qty";
	public static final String $cont_fctr_unit_cd = $cont_unit_p + ".cont_fctr_unit_cd";
	public static final String $cont_fctr_unit_nm = $cont_unit_p + ".cont_fctr_unit_nm";
	public static final String $std_cont_fctr = $std_cont_p + ".std_cont_fctr";
	public static final String $sno1 = $sno_wrk_no_p + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno1 + "";
	public static final String $sno2 = $sno_wrk_no_p + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno2 + "";
	public static final String $sno3 = $sno_wrk_no_p + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno3 + "";
	public static final String $sno4 = $sno_wrk_no_p + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno4 + "";
	public static final String $wrk_no = $sno_wrk_no_p + ".wrk_no";
	public static final String $wrk_nm = $sno_wrk_no_p + ".wrk_nm";
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
	public static final String $bp_grp_cd1 = $bp_grp_p + ".bp_grp_cd1";
	public static final String $bp_grp_nm1 = $bp_grp_p + ".bp_grp_nm1";
	public static final String $bp_grp_cd2 = $bp_grp_p + ".bp_grp_cd2";
	public static final String $bp_grp_nm2 = $bp_grp_p + ".bp_grp_nm2";
	public static final String $bp_grp_cd3 = $bp_grp_p + ".bp_grp_cd3";
	public static final String $bp_grp_nm3 = $bp_grp_p + ".bp_grp_nm3";
	public static final String $bp_grp_cd4 = $bp_grp_p + ".bp_grp_cd4";
	public static final String $bp_grp_nm4 = $bp_grp_p + ".bp_grp_nm4";
	public static final String $bp_grp_cd5 = $bp_grp_p + ".bp_grp_cd5";
	public static final String $bp_grp_nm5 = $bp_grp_p + ".bp_grp_nm5";
	public static final String $bp_grp_cd6 = $bp_grp_p + ".bp_grp_cd6";
	public static final String $bp_grp_nm6 = $bp_grp_p + ".bp_grp_nm6";
	public static final String $bp_grp_cd7 = $bp_grp_p + ".bp_grp_cd7";
	public static final String $bp_grp_nm7 = $bp_grp_p + ".bp_grp_nm7";
	public static final String $bp_grp_cd8 = $bp_grp_p + ".bp_grp_cd8";
	public static final String $bp_grp_nm8 = $bp_grp_p + ".bp_grp_nm8";
	public static final String $bp_grp_cd9 = $bp_grp_p + ".bp_grp_cd9";
	public static final String $bp_grp_nm9 = $bp_grp_p + ".bp_grp_nm9";
	public static final String $bp_grp_cd10 = $bp_grp_p + ".bp_grp_cd10";
	public static final String $bp_grp_nm10 = $bp_grp_p + ".bp_grp_nm10";

	public static final MCMeta itm_ord_no_META = createCommonMeta($itm_ord_no, mcframe.commonMA.meta.MA_META.ITM_ORD_NO);
	public static final MCMeta itm_ord_typ_META = createCommonMeta($itm_ord_typ, mcframe.commonMS.meta.MS_META.ITM_ORD_TYP);
	public static final MCMeta itm_ord_typ_nm_META = createCommonMeta($itm_ord_typ_nm, mcframe.commonMS.meta.MS_META.ITM_ORD_TYP_NM);
	public static final MCMeta itm_ord_sts_typ_META = createCommonMeta($itm_ord_sts_typ, mcframe.commonMS.meta.MS_META.ITM_ORD_STS_TYP);
	public static final MCMeta itm_ord_sts_typ_nm_META = createCommonMeta($itm_ord_sts_typ_nm, mcframe.commonMS.meta.MS_META.ITM_ORD_STS_TYP_NM);
	public static final MCMeta itm_typ_META = createCommonMeta($itm_typ, mcframe.commonMA.meta.MA_META.ITM_TYP);
	public static final MCMeta itm_typ_nm_META = createCommonMeta($itm_typ_nm, mcframe.commonMA.meta.MA_META.ITM_TYP_NM);
	public static final MCMeta itm_typ_d_cd_META = createCommonMeta($itm_typ_d_cd, mcframe.commonMA.meta.MA_META.ITM_TYP_D_CD);
	public static final MCMeta itm_typ_d_nm_META = createCommonMeta($itm_typ_d_nm, mcframe.commonMA.meta.MA_META.ITM_TYP_D_NM);
	public static final MCMeta itm_p_META = createInnerRowMeta($itm_p, mcframe.clientMAUB.MAUBP5030.ItmR.class);
	public static final MCMeta ver_no_p_META = createInnerRowMeta($ver_no_p, mcframe.clientMAUB.MAUBP5250.VerNoR.class);
	public static final MCMeta bndl_flg_META = createCommonMeta($bndl_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta inst_qty_p_META = createInnerRowMeta($inst_qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta yield_schd_qty_p_META = createInnerRowMeta($yield_schd_qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta inst_yield_schd_qty_p_META = createInnerRowMeta($inst_yield_schd_qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta yield_act_qty_p_META = createInnerRowMeta($yield_act_qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta purc_act_qty_p_META = createInnerRowMeta($purc_act_qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta insp_act_qty_p_META = createInnerRowMeta($insp_act_qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta yield_remain_qty_p_META = createInnerRowMeta($yield_remain_qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta purc_remain_qty_p_META = createInnerRowMeta($purc_remain_qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta insp_remain_qty_p_META = createInnerRowMeta($insp_remain_qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta schd_alloc_qty_p_META = createInnerRowMeta($schd_alloc_qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta surplus_qty_p_META = createInnerRowMeta($surplus_qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta abort_qty_p_META = createInnerRowMeta($abort_qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta base_unit_cd_META = createCommonMeta($base_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta base_unit_nm_META = createCommonMeta($base_unit_nm, mcframe.commonMA.meta.MA_META.UNIT_NM);
	public static final MCMeta arr_yield_rate_META = createCommonMeta($arr_yield_rate, mcframe.commonMA.meta.MA_META.RATE);
	public static final MCMeta purc_rate_META = createCommonMeta($purc_rate, mcframe.commonMA.meta.MA_META.RATE);
	public static final MCMeta cont_fctr_inst_qty_p_META = createInnerRowMeta($cont_fctr_inst_qty_p, mcframe.clientMAUB.MAUBP5260.ContQtyR.class);
	public static final MCMeta cont_fctr_schd_yield_qty_p_META = createInnerRowMeta($cont_fctr_schd_yield_qty_p, mcframe.clientMAUB.MAUBP5260.ContQtyR.class);
	public static final MCMeta cont_unit_p_META = createInnerRowMeta($cont_unit_p, mcframe.clientMAUB.MAUBP5270.ContFctrUnitR.class);
	public static final MCMeta std_cont_p_META = createInnerRowMeta($std_cont_p, mcframe.clientMAUB.MAUBP5280.StdContFctrR.class);
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
	public static final MCMeta sno_wrk_no_p_META = createInnerRowMeta($sno_wrk_no_p, mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.class);
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
	public static final MCMeta itm_grp_p_META = createInnerRowMeta($itm_grp_p, mcframe.clientMAUB.MAUBP5170.ItmGrpR.class);
	public static final MCMeta bp_grp_p_META = createInnerRowMeta($bp_grp_p, mcframe.clientMAUB.MAUBP5190.BpGrpR.class);
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

	protected static final ConstMetaList<RsltR> constMetas = new ConstMetaList<RsltR>(
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
			itm_p_META,
			ver_no_p_META,
			bndl_flg_META,
			inst_qty_p_META,
			yield_schd_qty_p_META,
			inst_yield_schd_qty_p_META,
			yield_act_qty_p_META,
			purc_act_qty_p_META,
			insp_act_qty_p_META,
			yield_remain_qty_p_META,
			purc_remain_qty_p_META,
			insp_remain_qty_p_META,
			schd_alloc_qty_p_META,
			surplus_qty_p_META,
			abort_qty_p_META,
			base_unit_cd_META,
			base_unit_nm_META,
			arr_yield_rate_META,
			purc_rate_META,
			cont_fctr_inst_qty_p_META,
			cont_fctr_schd_yield_qty_p_META,
			cont_unit_p_META,
			std_cont_p_META,
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
			sno_wrk_no_p_META,
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
			itm_grp_p_META,
			bp_grp_p_META,
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
				"itm_cd",
				"itm_sub1",
				"itm_sub2",
				"itm_sub3",
				"itm_nm",
				"ver_no",
				"inst_qty",
				"yield_schd_qty",
				"inst_yield_schd_qty",
				"yield_act_qty",
				"purc_act_qty",
				"insp_act_qty",
				"yield_remain_qty",
				"purc_remain_qty",
				"insp_remain_qty",
				"schd_alloc_qty",
				"surplus_qty",
				"abort_qty",
				"cont_fctr_inst_qty",
				"cont_fctr_schd_yield_qty",
				"cont_fctr_unit_cd",
				"cont_fctr_unit_nm",
				"std_cont_fctr",
				"sno1",
				"sno2",
				"sno3",
				"sno4",
				"wrk_no",
				"wrk_nm",
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
				"bp_grp_cd1",
				"bp_grp_nm1",
				"bp_grp_cd2",
				"bp_grp_nm2",
				"bp_grp_cd3",
				"bp_grp_nm3",
				"bp_grp_cd4",
				"bp_grp_nm4",
				"bp_grp_cd5",
				"bp_grp_nm5",
				"bp_grp_cd6",
				"bp_grp_nm6",
				"bp_grp_cd7",
				"bp_grp_nm7",
				"bp_grp_cd8",
				"bp_grp_nm8",
				"bp_grp_cd9",
				"bp_grp_nm9",
				"bp_grp_cd10",
				"bp_grp_nm10"
			},
			{
				$itm_cd,
				$itm_sub1,
				$itm_sub2,
				$itm_sub3,
				$itm_nm,
				$ver_no,
				$inst_qty,
				$yield_schd_qty,
				$inst_yield_schd_qty,
				$yield_act_qty,
				$purc_act_qty,
				$insp_act_qty,
				$yield_remain_qty,
				$purc_remain_qty,
				$insp_remain_qty,
				$schd_alloc_qty,
				$surplus_qty,
				$abort_qty,
				$cont_fctr_inst_qty,
				$cont_fctr_schd_yield_qty,
				$cont_fctr_unit_cd,
				$cont_fctr_unit_nm,
				$std_cont_fctr,
				$sno1,
				$sno2,
				$sno3,
				$sno4,
				$wrk_no,
				$wrk_nm,
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
				$bp_grp_cd1,
				$bp_grp_nm1,
				$bp_grp_cd2,
				$bp_grp_nm2,
				$bp_grp_cd3,
				$bp_grp_nm3,
				$bp_grp_cd4,
				$bp_grp_nm4,
				$bp_grp_cd5,
				$bp_grp_nm5,
				$bp_grp_cd6,
				$bp_grp_nm6,
				$bp_grp_cd7,
				$bp_grp_nm7,
				$bp_grp_cd8,
				$bp_grp_nm8,
				$bp_grp_cd9,
				$bp_grp_nm9,
				$bp_grp_cd10,
				$bp_grp_nm10
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
		new MCExtMap.Entry($$DISP_CTL, new MCExtList(
			new String[][]{
				{$maker_cd, "MAKER"},	// maker_cd
				{$maker_nm, "MAKER"},	// maker_nm
				{$rqst_wg_cd, "WG"},	// rqst_wg_cd
				{$rqst_wg_nm, "WG"},	// rqst_wg_nm
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


	public mcframe.clientMAUB.MAUBP5030.ItmR itm_p(){
		return (mcframe.clientMAUB.MAUBP5030.ItmR) getConstInnerRow(offset + 9, $itm_p);
	}
	
	public void itm_p(mcframe.clientMAUB.MAUBP5030.ItmR row){
		setConstInnerRow(offset + 9, $itm_p, row);
	}


	public mcframe.clientMAUB.MAUBP5250.VerNoR ver_no_p(){
		return (mcframe.clientMAUB.MAUBP5250.VerNoR) getConstInnerRow(offset + 10, $ver_no_p);
	}
	
	public void ver_no_p(mcframe.clientMAUB.MAUBP5250.VerNoR row){
		setConstInnerRow(offset + 10, $ver_no_p, row);
	}


	/**
	 * Aggregation まとめ.<p>
	 *
	 */
	public boolean bndl_flg() {
		return getConstBoolean(offset + 11, $bndl_flg);
	}

	/**
	 * Aggregation まとめ.<p>
	 *
	 */
	public void bndl_flg(boolean value) {
		setConstBoolean(offset + 11, $bndl_flg, value);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR inst_qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 12, $inst_qty_p);
	}
	
	public void inst_qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 12, $inst_qty_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR yield_schd_qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 13, $yield_schd_qty_p);
	}
	
	public void yield_schd_qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 13, $yield_schd_qty_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR inst_yield_schd_qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 14, $inst_yield_schd_qty_p);
	}
	
	public void inst_yield_schd_qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 14, $inst_yield_schd_qty_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR yield_act_qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 15, $yield_act_qty_p);
	}
	
	public void yield_act_qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 15, $yield_act_qty_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR purc_act_qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 16, $purc_act_qty_p);
	}
	
	public void purc_act_qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 16, $purc_act_qty_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR insp_act_qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 17, $insp_act_qty_p);
	}
	
	public void insp_act_qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 17, $insp_act_qty_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR yield_remain_qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 18, $yield_remain_qty_p);
	}
	
	public void yield_remain_qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 18, $yield_remain_qty_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR purc_remain_qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 19, $purc_remain_qty_p);
	}
	
	public void purc_remain_qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 19, $purc_remain_qty_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR insp_remain_qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 20, $insp_remain_qty_p);
	}
	
	public void insp_remain_qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 20, $insp_remain_qty_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR schd_alloc_qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 21, $schd_alloc_qty_p);
	}
	
	public void schd_alloc_qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 21, $schd_alloc_qty_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR surplus_qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 22, $surplus_qty_p);
	}
	
	public void surplus_qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 22, $surplus_qty_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR abort_qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 23, $abort_qty_p);
	}
	
	public void abort_qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 23, $abort_qty_p, row);
	}


	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public String base_unit_cd() {
		return getConstString(offset + 24, $base_unit_cd);
	}

	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public void base_unit_cd(String value) {
		setConstString(offset + 24, $base_unit_cd, value);
	}


	/**
	 * Base unit name 基準単位名.<p>
	 *
	 */
	public String base_unit_nm() {
		return getConstString(offset + 25, $base_unit_nm);
	}

	/**
	 * Base unit name 基準単位名.<p>
	 *
	 */
	public void base_unit_nm(String value) {
		setConstString(offset + 25, $base_unit_nm, value);
	}


	/**
	 * Receipt/output progress rate 入荷・出来高進捗率.<p>
	 *
	 */
	public MCNumber arr_yield_rate() {
		return getConstNumber(offset + 26, $arr_yield_rate);
	}

	/**
	 * Receipt/output progress rate 入荷・出来高進捗率.<p>
	 *
	 */
	public void arr_yield_rate(MCNumber value) {
		setConstNumber(offset + 26, $arr_yield_rate, value);
	}

	/**
	 * Receipt/output progress rate 入荷・出来高進捗率.<p>
	 *
	 */
	public void arr_yield_rate(int value) {
		setConstNumber(offset + 26, $arr_yield_rate, value);
	}

	/**
	 * Receipt/output progress rate 入荷・出来高進捗率.<p>
	 *
	 */
	public void arr_yield_rate(long value) {
		setConstNumber(offset + 26, $arr_yield_rate, value);
	}

	/**
	 * Receipt/output progress rate 入荷・出来高進捗率.<p>
	 *
	 */
	public void arr_yield_rate(float value) {
		setConstNumber(offset + 26, $arr_yield_rate, value);
	}

	/**
	 * Receipt/output progress rate 入荷・出来高進捗率.<p>
	 *
	 */
	public void arr_yield_rate(double value) {
		setConstNumber(offset + 26, $arr_yield_rate, value);
	}


	/**
	 * Purchase progress rate 仕入進捗率.<p>
	 *
	 */
	public MCNumber purc_rate() {
		return getConstNumber(offset + 27, $purc_rate);
	}

	/**
	 * Purchase progress rate 仕入進捗率.<p>
	 *
	 */
	public void purc_rate(MCNumber value) {
		setConstNumber(offset + 27, $purc_rate, value);
	}

	/**
	 * Purchase progress rate 仕入進捗率.<p>
	 *
	 */
	public void purc_rate(int value) {
		setConstNumber(offset + 27, $purc_rate, value);
	}

	/**
	 * Purchase progress rate 仕入進捗率.<p>
	 *
	 */
	public void purc_rate(long value) {
		setConstNumber(offset + 27, $purc_rate, value);
	}

	/**
	 * Purchase progress rate 仕入進捗率.<p>
	 *
	 */
	public void purc_rate(float value) {
		setConstNumber(offset + 27, $purc_rate, value);
	}

	/**
	 * Purchase progress rate 仕入進捗率.<p>
	 *
	 */
	public void purc_rate(double value) {
		setConstNumber(offset + 27, $purc_rate, value);
	}


	public mcframe.clientMAUB.MAUBP5260.ContQtyR cont_fctr_inst_qty_p(){
		return (mcframe.clientMAUB.MAUBP5260.ContQtyR) getConstInnerRow(offset + 28, $cont_fctr_inst_qty_p);
	}
	
	public void cont_fctr_inst_qty_p(mcframe.clientMAUB.MAUBP5260.ContQtyR row){
		setConstInnerRow(offset + 28, $cont_fctr_inst_qty_p, row);
	}


	public mcframe.clientMAUB.MAUBP5260.ContQtyR cont_fctr_schd_yield_qty_p(){
		return (mcframe.clientMAUB.MAUBP5260.ContQtyR) getConstInnerRow(offset + 29, $cont_fctr_schd_yield_qty_p);
	}
	
	public void cont_fctr_schd_yield_qty_p(mcframe.clientMAUB.MAUBP5260.ContQtyR row){
		setConstInnerRow(offset + 29, $cont_fctr_schd_yield_qty_p, row);
	}


	public mcframe.clientMAUB.MAUBP5270.ContFctrUnitR cont_unit_p(){
		return (mcframe.clientMAUB.MAUBP5270.ContFctrUnitR) getConstInnerRow(offset + 30, $cont_unit_p);
	}
	
	public void cont_unit_p(mcframe.clientMAUB.MAUBP5270.ContFctrUnitR row){
		setConstInnerRow(offset + 30, $cont_unit_p, row);
	}


	public mcframe.clientMAUB.MAUBP5280.StdContFctrR std_cont_p(){
		return (mcframe.clientMAUB.MAUBP5280.StdContFctrR) getConstInnerRow(offset + 31, $std_cont_p);
	}
	
	public void std_cont_p(mcframe.clientMAUB.MAUBP5280.StdContFctrR row){
		setConstInnerRow(offset + 31, $std_cont_p, row);
	}


	/**
	 * Scheduled PO date (MRP) 発注予定日（ＭＲＰ）.<p>
	 *
	 */
	public MCDate mrp_po_schd_dt() {
		return getConstDate(offset + 32, $mrp_po_schd_dt);
	}

	/**
	 * Scheduled PO date (MRP) 発注予定日（ＭＲＰ）.<p>
	 *
	 */
	public void mrp_po_schd_dt(MCDate value) {
		setConstDate(offset + 32, $mrp_po_schd_dt, value);
	}


	/**
	 * Scheduled PO date 発注予定日.<p>
	 *
	 */
	public MCDate po_schd_dt() {
		return getConstDate(offset + 33, $po_schd_dt);
	}

	/**
	 * Scheduled PO date 発注予定日.<p>
	 *
	 */
	public void po_schd_dt(MCDate value) {
		setConstDate(offset + 33, $po_schd_dt, value);
	}


	/**
	 * PO date 発注日.<p>
	 *
	 */
	public MCDate latest_po_d_dt() {
		return getConstDate(offset + 34, $latest_po_d_dt);
	}

	/**
	 * PO date 発注日.<p>
	 *
	 */
	public void latest_po_d_dt(MCDate value) {
		setConstDate(offset + 34, $latest_po_d_dt, value);
	}


	/**
	 * Scheduled GI date (MRP) 出庫予定日（ＭＲＰ）.<p>
	 *
	 */
	public MCDate mrp_gi_schd_dt() {
		return getConstDate(offset + 35, $mrp_gi_schd_dt);
	}

	/**
	 * Scheduled GI date (MRP) 出庫予定日（ＭＲＰ）.<p>
	 *
	 */
	public void mrp_gi_schd_dt(MCDate value) {
		setConstDate(offset + 35, $mrp_gi_schd_dt, value);
	}


	/**
	 * Scheduled GI date 出庫予定日.<p>
	 *
	 */
	public MCDate gi_schd_dt() {
		return getConstDate(offset + 36, $gi_schd_dt);
	}

	/**
	 * Scheduled GI date 出庫予定日.<p>
	 *
	 */
	public void gi_schd_dt(MCDate value) {
		setConstDate(offset + 36, $gi_schd_dt, value);
	}


	/**
	 * Scheduled GI date (Order) 出庫予定日（指図）.<p>
	 *
	 */
	public MCDate inst_gi_schd_dt() {
		return getConstDate(offset + 37, $inst_gi_schd_dt);
	}

	/**
	 * Scheduled GI date (Order) 出庫予定日（指図）.<p>
	 *
	 */
	public void inst_gi_schd_dt(MCDate value) {
		setConstDate(offset + 37, $inst_gi_schd_dt, value);
	}


	/**
	 * GI date 出庫日.<p>
	 *
	 */
	public MCDate latest_gi_act_dt() {
		return getConstDate(offset + 38, $latest_gi_act_dt);
	}

	/**
	 * GI date 出庫日.<p>
	 *
	 */
	public void latest_gi_act_dt(MCDate value) {
		setConstDate(offset + 38, $latest_gi_act_dt, value);
	}


	/**
	 * Scheduled mfg. start date (MRP) 製造着手予定日（ＭＲＰ）.<p>
	 *
	 */
	public MCDate mrp_mfg_st_schd_dt() {
		return getConstDate(offset + 39, $mrp_mfg_st_schd_dt);
	}

	/**
	 * Scheduled mfg. start date (MRP) 製造着手予定日（ＭＲＰ）.<p>
	 *
	 */
	public void mrp_mfg_st_schd_dt(MCDate value) {
		setConstDate(offset + 39, $mrp_mfg_st_schd_dt, value);
	}


	/**
	 * Scheduled mfg. start date 製造着手予定日.<p>
	 *
	 */
	public MCDate mfg_st_schd_dt() {
		return getConstDate(offset + 40, $mfg_st_schd_dt);
	}

	/**
	 * Scheduled mfg. start date 製造着手予定日.<p>
	 *
	 */
	public void mfg_st_schd_dt(MCDate value) {
		setConstDate(offset + 40, $mfg_st_schd_dt, value);
	}


	/**
	 * Scheduled mfg. start date (Order) 製造着手予定日（指図）.<p>
	 *
	 */
	public MCDate inst_mfg_st_schd_dt() {
		return getConstDate(offset + 41, $inst_mfg_st_schd_dt);
	}

	/**
	 * Scheduled mfg. start date (Order) 製造着手予定日（指図）.<p>
	 *
	 */
	public void inst_mfg_st_schd_dt(MCDate value) {
		setConstDate(offset + 41, $inst_mfg_st_schd_dt, value);
	}


	/**
	 * Mfg. start date 製造着手日.<p>
	 *
	 */
	public MCDate latest_mfg_st_act_dt() {
		return getConstDate(offset + 42, $latest_mfg_st_act_dt);
	}

	/**
	 * Mfg. start date 製造着手日.<p>
	 *
	 */
	public void latest_mfg_st_act_dt(MCDate value) {
		setConstDate(offset + 42, $latest_mfg_st_act_dt, value);
	}


	/**
	 * Scheduled mfg. end date (MRP) 製造終了予定日（ＭＲＰ）.<p>
	 *
	 */
	public MCDate mrp_mfg_end_schd_dt() {
		return getConstDate(offset + 43, $mrp_mfg_end_schd_dt);
	}

	/**
	 * Scheduled mfg. end date (MRP) 製造終了予定日（ＭＲＰ）.<p>
	 *
	 */
	public void mrp_mfg_end_schd_dt(MCDate value) {
		setConstDate(offset + 43, $mrp_mfg_end_schd_dt, value);
	}


	/**
	 * Scheduled mfg. end date 製造終了予定日.<p>
	 *
	 */
	public MCDate mfg_end_schd_dt() {
		return getConstDate(offset + 44, $mfg_end_schd_dt);
	}

	/**
	 * Scheduled mfg. end date 製造終了予定日.<p>
	 *
	 */
	public void mfg_end_schd_dt(MCDate value) {
		setConstDate(offset + 44, $mfg_end_schd_dt, value);
	}


	/**
	 * Scheduled mfg. end date (Order) 製造終了予定日（指図）.<p>
	 *
	 */
	public MCDate inst_mfg_end_schd_dt() {
		return getConstDate(offset + 45, $inst_mfg_end_schd_dt);
	}

	/**
	 * Scheduled mfg. end date (Order) 製造終了予定日（指図）.<p>
	 *
	 */
	public void inst_mfg_end_schd_dt(MCDate value) {
		setConstDate(offset + 45, $inst_mfg_end_schd_dt, value);
	}


	/**
	 * Mfg. end date 製造終了日.<p>
	 *
	 */
	public MCDate latest_mfg_end_act_dt() {
		return getConstDate(offset + 46, $latest_mfg_end_act_dt);
	}

	/**
	 * Mfg. end date 製造終了日.<p>
	 *
	 */
	public void latest_mfg_end_act_dt(MCDate value) {
		setConstDate(offset + 46, $latest_mfg_end_act_dt, value);
	}


	/**
	 * Mfg. LT (MRP) 製造ＬＴ（ＭＲＰ）.<p>
	 *
	 */
	public MCNumber mrp_mfg_lt() {
		return getConstNumber(offset + 47, $mrp_mfg_lt);
	}

	/**
	 * Mfg. LT (MRP) 製造ＬＴ（ＭＲＰ）.<p>
	 *
	 */
	public void mrp_mfg_lt(MCNumber value) {
		setConstNumber(offset + 47, $mrp_mfg_lt, value);
	}

	/**
	 * Mfg. LT (MRP) 製造ＬＴ（ＭＲＰ）.<p>
	 *
	 */
	public void mrp_mfg_lt(int value) {
		setConstNumber(offset + 47, $mrp_mfg_lt, value);
	}

	/**
	 * Mfg. LT (MRP) 製造ＬＴ（ＭＲＰ）.<p>
	 *
	 */
	public void mrp_mfg_lt(long value) {
		setConstNumber(offset + 47, $mrp_mfg_lt, value);
	}

	/**
	 * Mfg. LT (MRP) 製造ＬＴ（ＭＲＰ）.<p>
	 *
	 */
	public void mrp_mfg_lt(float value) {
		setConstNumber(offset + 47, $mrp_mfg_lt, value);
	}

	/**
	 * Mfg. LT (MRP) 製造ＬＴ（ＭＲＰ）.<p>
	 *
	 */
	public void mrp_mfg_lt(double value) {
		setConstNumber(offset + 47, $mrp_mfg_lt, value);
	}


	/**
	 * Mfg. LT 製造ＬＴ.<p>
	 *
	 */
	public MCNumber mfg_lt() {
		return getConstNumber(offset + 48, $mfg_lt);
	}

	/**
	 * Mfg. LT 製造ＬＴ.<p>
	 *
	 */
	public void mfg_lt(MCNumber value) {
		setConstNumber(offset + 48, $mfg_lt, value);
	}

	/**
	 * Mfg. LT 製造ＬＴ.<p>
	 *
	 */
	public void mfg_lt(int value) {
		setConstNumber(offset + 48, $mfg_lt, value);
	}

	/**
	 * Mfg. LT 製造ＬＴ.<p>
	 *
	 */
	public void mfg_lt(long value) {
		setConstNumber(offset + 48, $mfg_lt, value);
	}

	/**
	 * Mfg. LT 製造ＬＴ.<p>
	 *
	 */
	public void mfg_lt(float value) {
		setConstNumber(offset + 48, $mfg_lt, value);
	}

	/**
	 * Mfg. LT 製造ＬＴ.<p>
	 *
	 */
	public void mfg_lt(double value) {
		setConstNumber(offset + 48, $mfg_lt, value);
	}


	/**
	 * Mfg. LT (Result) 製造ＬＴ（実績）.<p>
	 *
	 */
	public MCNumber act_mfg_lt() {
		return getConstNumber(offset + 49, $act_mfg_lt);
	}

	/**
	 * Mfg. LT (Result) 製造ＬＴ（実績）.<p>
	 *
	 */
	public void act_mfg_lt(MCNumber value) {
		setConstNumber(offset + 49, $act_mfg_lt, value);
	}

	/**
	 * Mfg. LT (Result) 製造ＬＴ（実績）.<p>
	 *
	 */
	public void act_mfg_lt(int value) {
		setConstNumber(offset + 49, $act_mfg_lt, value);
	}

	/**
	 * Mfg. LT (Result) 製造ＬＴ（実績）.<p>
	 *
	 */
	public void act_mfg_lt(long value) {
		setConstNumber(offset + 49, $act_mfg_lt, value);
	}

	/**
	 * Mfg. LT (Result) 製造ＬＴ（実績）.<p>
	 *
	 */
	public void act_mfg_lt(float value) {
		setConstNumber(offset + 49, $act_mfg_lt, value);
	}

	/**
	 * Mfg. LT (Result) 製造ＬＴ（実績）.<p>
	 *
	 */
	public void act_mfg_lt(double value) {
		setConstNumber(offset + 49, $act_mfg_lt, value);
	}


	/**
	 * Scheduled storage completion date (MRP) 格納完了予定日（ＭＲＰ）.<p>
	 *
	 */
	public MCDate mrp_strg_schd_dt() {
		return getConstDate(offset + 50, $mrp_strg_schd_dt);
	}

	/**
	 * Scheduled storage completion date (MRP) 格納完了予定日（ＭＲＰ）.<p>
	 *
	 */
	public void mrp_strg_schd_dt(MCDate value) {
		setConstDate(offset + 50, $mrp_strg_schd_dt, value);
	}


	/**
	 * Scheduled storage completion date 格納完了予定日.<p>
	 *
	 */
	public MCDate strg_schd_dt() {
		return getConstDate(offset + 51, $strg_schd_dt);
	}

	/**
	 * Scheduled storage completion date 格納完了予定日.<p>
	 *
	 */
	public void strg_schd_dt(MCDate value) {
		setConstDate(offset + 51, $strg_schd_dt, value);
	}


	/**
	 * Scheduled storage completion date (Order/PO) 格納完了予定日（指図・発注）.<p>
	 *
	 */
	public MCDate inst_strg_schd_dt() {
		return getConstDate(offset + 52, $inst_strg_schd_dt);
	}

	/**
	 * Scheduled storage completion date (Order/PO) 格納完了予定日（指図・発注）.<p>
	 *
	 */
	public void inst_strg_schd_dt(MCDate value) {
		setConstDate(offset + 52, $inst_strg_schd_dt, value);
	}


	/**
	 * Storage date 格納日.<p>
	 *
	 */
	public MCDate latest_strg_act_dt() {
		return getConstDate(offset + 53, $latest_strg_act_dt);
	}

	/**
	 * Storage date 格納日.<p>
	 *
	 */
	public void latest_strg_act_dt(MCDate value) {
		setConstDate(offset + 53, $latest_strg_act_dt, value);
	}


	/**
	 * Purchase LT (MRP) 購入ＬＴ（ＭＲＰ）.<p>
	 *
	 */
	public MCNumber mrp_purc_lt() {
		return getConstNumber(offset + 54, $mrp_purc_lt);
	}

	/**
	 * Purchase LT (MRP) 購入ＬＴ（ＭＲＰ）.<p>
	 *
	 */
	public void mrp_purc_lt(MCNumber value) {
		setConstNumber(offset + 54, $mrp_purc_lt, value);
	}

	/**
	 * Purchase LT (MRP) 購入ＬＴ（ＭＲＰ）.<p>
	 *
	 */
	public void mrp_purc_lt(int value) {
		setConstNumber(offset + 54, $mrp_purc_lt, value);
	}

	/**
	 * Purchase LT (MRP) 購入ＬＴ（ＭＲＰ）.<p>
	 *
	 */
	public void mrp_purc_lt(long value) {
		setConstNumber(offset + 54, $mrp_purc_lt, value);
	}

	/**
	 * Purchase LT (MRP) 購入ＬＴ（ＭＲＰ）.<p>
	 *
	 */
	public void mrp_purc_lt(float value) {
		setConstNumber(offset + 54, $mrp_purc_lt, value);
	}

	/**
	 * Purchase LT (MRP) 購入ＬＴ（ＭＲＰ）.<p>
	 *
	 */
	public void mrp_purc_lt(double value) {
		setConstNumber(offset + 54, $mrp_purc_lt, value);
	}


	/**
	 * Purchase LT 購入ＬＴ.<p>
	 *
	 */
	public MCNumber purc_lt() {
		return getConstNumber(offset + 55, $purc_lt);
	}

	/**
	 * Purchase LT 購入ＬＴ.<p>
	 *
	 */
	public void purc_lt(MCNumber value) {
		setConstNumber(offset + 55, $purc_lt, value);
	}

	/**
	 * Purchase LT 購入ＬＴ.<p>
	 *
	 */
	public void purc_lt(int value) {
		setConstNumber(offset + 55, $purc_lt, value);
	}

	/**
	 * Purchase LT 購入ＬＴ.<p>
	 *
	 */
	public void purc_lt(long value) {
		setConstNumber(offset + 55, $purc_lt, value);
	}

	/**
	 * Purchase LT 購入ＬＴ.<p>
	 *
	 */
	public void purc_lt(float value) {
		setConstNumber(offset + 55, $purc_lt, value);
	}

	/**
	 * Purchase LT 購入ＬＴ.<p>
	 *
	 */
	public void purc_lt(double value) {
		setConstNumber(offset + 55, $purc_lt, value);
	}


	/**
	 * Purchase LT (Result) 購入ＬＴ（実績）.<p>
	 *
	 */
	public MCNumber act_purc_lt() {
		return getConstNumber(offset + 56, $act_purc_lt);
	}

	/**
	 * Purchase LT (Result) 購入ＬＴ（実績）.<p>
	 *
	 */
	public void act_purc_lt(MCNumber value) {
		setConstNumber(offset + 56, $act_purc_lt, value);
	}

	/**
	 * Purchase LT (Result) 購入ＬＴ（実績）.<p>
	 *
	 */
	public void act_purc_lt(int value) {
		setConstNumber(offset + 56, $act_purc_lt, value);
	}

	/**
	 * Purchase LT (Result) 購入ＬＴ（実績）.<p>
	 *
	 */
	public void act_purc_lt(long value) {
		setConstNumber(offset + 56, $act_purc_lt, value);
	}

	/**
	 * Purchase LT (Result) 購入ＬＴ（実績）.<p>
	 *
	 */
	public void act_purc_lt(float value) {
		setConstNumber(offset + 56, $act_purc_lt, value);
	}

	/**
	 * Purchase LT (Result) 購入ＬＴ（実績）.<p>
	 *
	 */
	public void act_purc_lt(double value) {
		setConstNumber(offset + 56, $act_purc_lt, value);
	}


	/**
	 * Scheduled acceptance date (MRP) 検収予定日（ＭＲＰ）.<p>
	 *
	 */
	public MCDate mrp_accpt_schd_dt() {
		return getConstDate(offset + 57, $mrp_accpt_schd_dt);
	}

	/**
	 * Scheduled acceptance date (MRP) 検収予定日（ＭＲＰ）.<p>
	 *
	 */
	public void mrp_accpt_schd_dt(MCDate value) {
		setConstDate(offset + 57, $mrp_accpt_schd_dt, value);
	}


	/**
	 * Scheduled acceptance date 検収予定日.<p>
	 *
	 */
	public MCDate accpt_schd_dt() {
		return getConstDate(offset + 58, $accpt_schd_dt);
	}

	/**
	 * Scheduled acceptance date 検収予定日.<p>
	 *
	 */
	public void accpt_schd_dt(MCDate value) {
		setConstDate(offset + 58, $accpt_schd_dt, value);
	}


	/**
	 * Scheduled acceptance date (PO) 検収予定日（発注）.<p>
	 *
	 */
	public MCDate inst_accpt_schd_dt() {
		return getConstDate(offset + 59, $inst_accpt_schd_dt);
	}

	/**
	 * Scheduled acceptance date (PO) 検収予定日（発注）.<p>
	 *
	 */
	public void inst_accpt_schd_dt(MCDate value) {
		setConstDate(offset + 59, $inst_accpt_schd_dt, value);
	}


	/**
	 * Acceptance date 検収日.<p>
	 *
	 */
	public MCDate latest_accpt_act_dt() {
		return getConstDate(offset + 60, $latest_accpt_act_dt);
	}

	/**
	 * Acceptance date 検収日.<p>
	 *
	 */
	public void latest_accpt_act_dt(MCDate value) {
		setConstDate(offset + 60, $latest_accpt_act_dt, value);
	}


	/**
	 * Scheduled inspection start date (MRP) 検査着手予定日（ＭＲＰ）.<p>
	 *
	 */
	public MCDate mrp_insp_st_schd_dt() {
		return getConstDate(offset + 61, $mrp_insp_st_schd_dt);
	}

	/**
	 * Scheduled inspection start date (MRP) 検査着手予定日（ＭＲＰ）.<p>
	 *
	 */
	public void mrp_insp_st_schd_dt(MCDate value) {
		setConstDate(offset + 61, $mrp_insp_st_schd_dt, value);
	}


	/**
	 * Scheduled inspection start date 検査着手予定日.<p>
	 *
	 */
	public MCDate insp_st_schd_dt() {
		return getConstDate(offset + 62, $insp_st_schd_dt);
	}

	/**
	 * Scheduled inspection start date 検査着手予定日.<p>
	 *
	 */
	public void insp_st_schd_dt(MCDate value) {
		setConstDate(offset + 62, $insp_st_schd_dt, value);
	}


	/**
	 * Scheduled inspection start date (Order/PO) 検査着手予定日（指図・発注）.<p>
	 *
	 */
	public MCDate inst_insp_st_schd_dt() {
		return getConstDate(offset + 63, $inst_insp_st_schd_dt);
	}

	/**
	 * Scheduled inspection start date (Order/PO) 検査着手予定日（指図・発注）.<p>
	 *
	 */
	public void inst_insp_st_schd_dt(MCDate value) {
		setConstDate(offset + 63, $inst_insp_st_schd_dt, value);
	}


	/**
	 * Inspection start date 検査着手日.<p>
	 *
	 */
	public MCDate latest_insp_st_act_dt() {
		return getConstDate(offset + 64, $latest_insp_st_act_dt);
	}

	/**
	 * Inspection start date 検査着手日.<p>
	 *
	 */
	public void latest_insp_st_act_dt(MCDate value) {
		setConstDate(offset + 64, $latest_insp_st_act_dt, value);
	}


	/**
	 * Scheduled inspection end date (MRP) 検査終了予定日（ＭＲＰ）.<p>
	 *
	 */
	public MCDate mrp_insp_end_schd_dt() {
		return getConstDate(offset + 65, $mrp_insp_end_schd_dt);
	}

	/**
	 * Scheduled inspection end date (MRP) 検査終了予定日（ＭＲＰ）.<p>
	 *
	 */
	public void mrp_insp_end_schd_dt(MCDate value) {
		setConstDate(offset + 65, $mrp_insp_end_schd_dt, value);
	}


	/**
	 * Scheduled inspection end date 検査終了予定日.<p>
	 *
	 */
	public MCDate insp_end_schd_dt() {
		return getConstDate(offset + 66, $insp_end_schd_dt);
	}

	/**
	 * Scheduled inspection end date 検査終了予定日.<p>
	 *
	 */
	public void insp_end_schd_dt(MCDate value) {
		setConstDate(offset + 66, $insp_end_schd_dt, value);
	}


	/**
	 * Scheduled inspection end date (Order/PO) 検査終了予定日（指図・発注）.<p>
	 *
	 */
	public MCDate inst_insp_end_schd_dt() {
		return getConstDate(offset + 67, $inst_insp_end_schd_dt);
	}

	/**
	 * Scheduled inspection end date (Order/PO) 検査終了予定日（指図・発注）.<p>
	 *
	 */
	public void inst_insp_end_schd_dt(MCDate value) {
		setConstDate(offset + 67, $inst_insp_end_schd_dt, value);
	}


	/**
	 * Inspection end date 検査終了日.<p>
	 *
	 */
	public MCDate latest_insp_end_act_dt() {
		return getConstDate(offset + 68, $latest_insp_end_act_dt);
	}

	/**
	 * Inspection end date 検査終了日.<p>
	 *
	 */
	public void latest_insp_end_act_dt(MCDate value) {
		setConstDate(offset + 68, $latest_insp_end_act_dt, value);
	}


	/**
	 * Available date (MRP) 使用可能予定日（ＭＲＰ）.<p>
	 *
	 */
	public MCDate mrp_avl_schd_dt() {
		return getConstDate(offset + 69, $mrp_avl_schd_dt);
	}

	/**
	 * Available date (MRP) 使用可能予定日（ＭＲＰ）.<p>
	 *
	 */
	public void mrp_avl_schd_dt(MCDate value) {
		setConstDate(offset + 69, $mrp_avl_schd_dt, value);
	}


	/**
	 * Available date 使用可能予定日.<p>
	 *
	 */
	public MCDate avl_schd_dt() {
		return getConstDate(offset + 70, $avl_schd_dt);
	}

	/**
	 * Available date 使用可能予定日.<p>
	 *
	 */
	public void avl_schd_dt(MCDate value) {
		setConstDate(offset + 70, $avl_schd_dt, value);
	}


	/**
	 * Available date (Order/PO) 使用可能予定日（指図・発注）.<p>
	 *
	 */
	public MCDate po_avl_schd_dt() {
		return getConstDate(offset + 71, $po_avl_schd_dt);
	}

	/**
	 * Available date (Order/PO) 使用可能予定日（指図・発注）.<p>
	 *
	 */
	public void po_avl_schd_dt(MCDate value) {
		setConstDate(offset + 71, $po_avl_schd_dt, value);
	}


	/**
	 * Available date 使用可能日.<p>
	 *
	 */
	public MCDate avl_dt() {
		return getConstDate(offset + 72, $avl_dt);
	}

	/**
	 * Available date 使用可能日.<p>
	 *
	 */
	public void avl_dt(MCDate value) {
		setConstDate(offset + 72, $avl_dt, value);
	}


	/**
	 * Available date (GR/GI schedule) 使用可能予定日（受払予定）.<p>
	 *
	 */
	public MCDate io_avl_schd_dt() {
		return getConstDate(offset + 73, $io_avl_schd_dt);
	}

	/**
	 * Available date (GR/GI schedule) 使用可能予定日（受払予定）.<p>
	 *
	 */
	public void io_avl_schd_dt(MCDate value) {
		setConstDate(offset + 73, $io_avl_schd_dt, value);
	}


	/**
	 * Delay expectation 遅れ見込.<p>
	 *
	 */
	public boolean delay_expt_flg() {
		return getConstBoolean(offset + 74, $delay_expt_flg);
	}

	/**
	 * Delay expectation 遅れ見込.<p>
	 *
	 */
	public void delay_expt_flg(boolean value) {
		setConstBoolean(offset + 74, $delay_expt_flg, value);
	}


	/**
	 * Scheduled allocation date 引当予定日.<p>
	 *
	 */
	public MCDate schd_so_dt() {
		return getConstDate(offset + 75, $schd_so_dt);
	}

	/**
	 * Scheduled allocation date 引当予定日.<p>
	 *
	 */
	public void schd_so_dt(MCDate value) {
		setConstDate(offset + 75, $schd_so_dt, value);
	}


	/**
	 * Extra days for scheduled usage 使用予定余裕日数.<p>
	 *
	 */
	public MCNumber margin_days() {
		return getConstNumber(offset + 76, $margin_days);
	}

	/**
	 * Extra days for scheduled usage 使用予定余裕日数.<p>
	 *
	 */
	public void margin_days(MCNumber value) {
		setConstNumber(offset + 76, $margin_days, value);
	}

	/**
	 * Extra days for scheduled usage 使用予定余裕日数.<p>
	 *
	 */
	public void margin_days(int value) {
		setConstNumber(offset + 76, $margin_days, value);
	}

	/**
	 * Extra days for scheduled usage 使用予定余裕日数.<p>
	 *
	 */
	public void margin_days(long value) {
		setConstNumber(offset + 76, $margin_days, value);
	}

	/**
	 * Extra days for scheduled usage 使用予定余裕日数.<p>
	 *
	 */
	public void margin_days(float value) {
		setConstNumber(offset + 76, $margin_days, value);
	}

	/**
	 * Extra days for scheduled usage 使用予定余裕日数.<p>
	 *
	 */
	public void margin_days(double value) {
		setConstNumber(offset + 76, $margin_days, value);
	}


	/**
	 * Storage location cd. 格納場所ＣＤ.<p>
	 *
	 */
	public String strg_loc_cd() {
		return getConstString(offset + 77, $strg_loc_cd);
	}

	/**
	 * Storage location cd. 格納場所ＣＤ.<p>
	 *
	 */
	public void strg_loc_cd(String value) {
		setConstString(offset + 77, $strg_loc_cd, value);
	}


	/**
	 * Storage location name 格納場所名.<p>
	 *
	 */
	public String strg_loc_nm() {
		return getConstString(offset + 78, $strg_loc_nm);
	}

	/**
	 * Storage location name 格納場所名.<p>
	 *
	 */
	public void strg_loc_nm(String value) {
		setConstString(offset + 78, $strg_loc_nm, value);
	}


	/**
	 * Mfg. location cd. 製造場所ＣＤ.<p>
	 *
	 */
	public String mfg_loc_cd() {
		return getConstString(offset + 79, $mfg_loc_cd);
	}

	/**
	 * Mfg. location cd. 製造場所ＣＤ.<p>
	 *
	 */
	public void mfg_loc_cd(String value) {
		setConstString(offset + 79, $mfg_loc_cd, value);
	}


	/**
	 * Mfg. location name 製造場所名.<p>
	 *
	 */
	public String mfg_loc_nm() {
		return getConstString(offset + 80, $mfg_loc_nm);
	}

	/**
	 * Mfg. location name 製造場所名.<p>
	 *
	 */
	public void mfg_loc_nm(String value) {
		setConstString(offset + 80, $mfg_loc_nm, value);
	}


	/**
	 * Supplier cd. 発注先ＣＤ.<p>
	 *
	 */
	public String sppl_cd() {
		return getConstString(offset + 81, $sppl_cd);
	}

	/**
	 * Supplier cd. 発注先ＣＤ.<p>
	 *
	 */
	public void sppl_cd(String value) {
		setConstString(offset + 81, $sppl_cd, value);
	}


	/**
	 * Supplier name 発注先名.<p>
	 *
	 */
	public String sppl_nm() {
		return getConstString(offset + 82, $sppl_nm);
	}

	/**
	 * Supplier name 発注先名.<p>
	 *
	 */
	public void sppl_nm(String value) {
		setConstString(offset + 82, $sppl_nm, value);
	}


	/**
	 * Maker cd. メーカＣＤ.<p>
	 *
	 */
	public String maker_cd() {
		return getConstString(offset + 83, $maker_cd);
	}

	/**
	 * Maker cd. メーカＣＤ.<p>
	 *
	 */
	public void maker_cd(String value) {
		setConstString(offset + 83, $maker_cd, value);
	}


	/**
	 * Maker name メーカ名.<p>
	 *
	 */
	public String maker_nm() {
		return getConstString(offset + 84, $maker_nm);
	}

	/**
	 * Maker name メーカ名.<p>
	 *
	 */
	public void maker_nm(String value) {
		setConstString(offset + 84, $maker_nm, value);
	}


	/**
	 * Requested location cd. 依頼先場所ＣＤ.<p>
	 *
	 */
	public String rqst_loc_cd() {
		return getConstString(offset + 85, $rqst_loc_cd);
	}

	/**
	 * Requested location cd. 依頼先場所ＣＤ.<p>
	 *
	 */
	public void rqst_loc_cd(String value) {
		setConstString(offset + 85, $rqst_loc_cd, value);
	}


	/**
	 * Location name (Requested) 依頼先場所名.<p>
	 *
	 */
	public String rqst_loc_nm() {
		return getConstString(offset + 86, $rqst_loc_nm);
	}

	/**
	 * Location name (Requested) 依頼先場所名.<p>
	 *
	 */
	public void rqst_loc_nm(String value) {
		setConstString(offset + 86, $rqst_loc_nm, value);
	}


	/**
	 * Requested WG cd. 依頼先ワーキンググループＣＤ.<p>
	 *
	 */
	public String rqst_wg_cd() {
		return getConstString(offset + 87, $rqst_wg_cd);
	}

	/**
	 * Requested WG cd. 依頼先ワーキンググループＣＤ.<p>
	 *
	 */
	public void rqst_wg_cd(String value) {
		setConstString(offset + 87, $rqst_wg_cd, value);
	}


	/**
	 * Requested WG name 依頼先ワーキンググループ名.<p>
	 *
	 */
	public String rqst_wg_nm() {
		return getConstString(offset + 88, $rqst_wg_nm);
	}

	/**
	 * Requested WG name 依頼先ワーキンググループ名.<p>
	 *
	 */
	public void rqst_wg_nm(String value) {
		setConstString(offset + 88, $rqst_wg_nm, value);
	}


	/**
	 * Operation pattern 工程パタン.<p>
	 *
	 */
	public String oper_ptn() {
		return getConstString(offset + 89, $oper_ptn);
	}

	/**
	 * Operation pattern 工程パタン.<p>
	 *
	 */
	public void oper_ptn(String value) {
		setConstString(offset + 89, $oper_ptn, value);
	}


	/**
	 * BOM pattern 構成パタン.<p>
	 *
	 */
	public String bom_ptn() {
		return getConstString(offset + 90, $bom_ptn);
	}

	/**
	 * BOM pattern 構成パタン.<p>
	 *
	 */
	public void bom_ptn(String value) {
		setConstString(offset + 90, $bom_ptn, value);
	}


	/**
	 * Requirements No. 所要ＮＯ.<p>
	 *
	 */
	public String rqmt_no() {
		return getConstString(offset + 91, $rqmt_no);
	}

	/**
	 * Requirements No. 所要ＮＯ.<p>
	 *
	 */
	public void rqmt_no(String value) {
		setConstString(offset + 91, $rqmt_no, value);
	}


	/**
	 * Disallow procurement 手配不許可.<p>
	 *
	 */
	public boolean not_fix_flg() {
		return getConstBoolean(offset + 92, $not_fix_flg);
	}

	/**
	 * Disallow procurement 手配不許可.<p>
	 *
	 */
	public void not_fix_flg(boolean value) {
		setConstBoolean(offset + 92, $not_fix_flg, value);
	}


	public mcframe.clientMSUB.MSUBP5020.SnoWrkNoR sno_wrk_no_p(){
		return (mcframe.clientMSUB.MSUBP5020.SnoWrkNoR) getConstInnerRow(offset + 93, $sno_wrk_no_p);
	}
	
	public void sno_wrk_no_p(mcframe.clientMSUB.MSUBP5020.SnoWrkNoR row){
		setConstInnerRow(offset + 93, $sno_wrk_no_p, row);
	}


	/**
	 * Order generation type オーダ生成区分.<p>
	 *
	 */
	public String ord_gnrt_typ() {
		return getConstString(offset + 94, $ord_gnrt_typ);
	}

	/**
	 * Order generation type オーダ生成区分.<p>
	 *
	 */
	public void ord_gnrt_typ(String value) {
		setConstString(offset + 94, $ord_gnrt_typ, value);
	}


	/**
	 * Order generation type name オーダ生成区分名.<p>
	 *
	 */
	public String ord_gnrt_typ_nm() {
		return getConstString(offset + 95, $ord_gnrt_typ_nm);
	}

	/**
	 * Order generation type name オーダ生成区分名.<p>
	 *
	 */
	public void ord_gnrt_typ_nm(String value) {
		setConstString(offset + 95, $ord_gnrt_typ_nm, value);
	}


	/**
	 * Simulation No. シミュレーションＮＯ.<p>
	 *
	 */
	public String sim_mrp_no() {
		return getConstString(offset + 96, $sim_mrp_no);
	}

	/**
	 * Simulation No. シミュレーションＮＯ.<p>
	 *
	 */
	public void sim_mrp_no(String value) {
		setConstString(offset + 96, $sim_mrp_no, value);
	}


	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public String wg_cd() {
		return getConstString(offset + 97, $wg_cd);
	}

	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public void wg_cd(String value) {
		setConstString(offset + 97, $wg_cd, value);
	}


	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public String wg_nm() {
		return getConstString(offset + 98, $wg_nm);
	}

	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public void wg_nm(String value) {
		setConstString(offset + 98, $wg_nm, value);
	}


	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public String intr_rmrks() {
		return getConstString(offset + 99, $intr_rmrks);
	}

	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public void intr_rmrks(String value) {
		setConstString(offset + 99, $intr_rmrks, value);
	}


	/**
	 * Firm date 確定日.<p>
	 *
	 */
	public MCDate fix_dt() {
		return getConstDate(offset + 100, $fix_dt);
	}

	/**
	 * Firm date 確定日.<p>
	 *
	 */
	public void fix_dt(MCDate value) {
		setConstDate(offset + 100, $fix_dt, value);
	}


	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public String sub_char1() {
		return getConstString(offset + 101, $sub_char1);
	}

	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public void sub_char1(String value) {
		setConstString(offset + 101, $sub_char1, value);
	}


	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public String sub_char2() {
		return getConstString(offset + 102, $sub_char2);
	}

	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public void sub_char2(String value) {
		setConstString(offset + 102, $sub_char2, value);
	}


	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public String sub_char3() {
		return getConstString(offset + 103, $sub_char3);
	}

	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public void sub_char3(String value) {
		setConstString(offset + 103, $sub_char3, value);
	}


	/**
	 * Order import オーダ受信.<p>
	 *
	 */
	public boolean ord_rcv_flg() {
		return getConstBoolean(offset + 104, $ord_rcv_flg);
	}

	/**
	 * Order import オーダ受信.<p>
	 *
	 */
	public void ord_rcv_flg(boolean value) {
		setConstBoolean(offset + 104, $ord_rcv_flg, value);
	}


	/**
	 * Export Order オーダ送信.<p>
	 *
	 */
	public boolean ord_snd_flg() {
		return getConstBoolean(offset + 105, $ord_snd_flg);
	}

	/**
	 * Export Order オーダ送信.<p>
	 *
	 */
	public void ord_snd_flg(boolean value) {
		setConstBoolean(offset + 105, $ord_snd_flg, value);
	}


	/**
	 * External system cd. 外部システムＣＤ.<p>
	 *
	 */
	public String ext_sys_cd() {
		return getConstString(offset + 106, $ext_sys_cd);
	}

	/**
	 * External system cd. 外部システムＣＤ.<p>
	 *
	 */
	public void ext_sys_cd(String value) {
		setConstString(offset + 106, $ext_sys_cd, value);
	}


	/**
	 * External system name 外部システム名.<p>
	 *
	 */
	public String ext_sys_nm() {
		return getConstString(offset + 107, $ext_sys_nm);
	}

	/**
	 * External system name 外部システム名.<p>
	 *
	 */
	public void ext_sys_nm(String value) {
		setConstString(offset + 107, $ext_sys_nm, value);
	}


	/**
	 * External item order No. 外部品目オーダＮＯ.<p>
	 *
	 */
	public String ext_itm_ord_no() {
		return getConstString(offset + 108, $ext_itm_ord_no);
	}

	/**
	 * External item order No. 外部品目オーダＮＯ.<p>
	 *
	 */
	public void ext_itm_ord_no(String value) {
		setConstString(offset + 108, $ext_itm_ord_no, value);
	}


	/**
	 * Scheduler frozen target スケジューラ凍結対象.<p>
	 *
	 */
	public boolean for_scheduler_frozen_flg() {
		return getConstBoolean(offset + 109, $for_scheduler_frozen_flg);
	}

	/**
	 * Scheduler frozen target スケジューラ凍結対象.<p>
	 *
	 */
	public void for_scheduler_frozen_flg(boolean value) {
		setConstBoolean(offset + 109, $for_scheduler_frozen_flg, value);
	}


	/**
	 * Scheduler frozen スケジューラ凍結.<p>
	 *
	 */
	public boolean scheduler_frozen_flg() {
		return getConstBoolean(offset + 110, $scheduler_frozen_flg);
	}

	/**
	 * Scheduler frozen スケジューラ凍結.<p>
	 *
	 */
	public void scheduler_frozen_flg(boolean value) {
		setConstBoolean(offset + 110, $scheduler_frozen_flg, value);
	}


	/**
	 * Shortage of required qty. 必要数量不足.<p>
	 *
	 */
	public boolean schd_yield_red_flg() {
		return getConstBoolean(offset + 111, $schd_yield_red_flg);
	}

	/**
	 * Shortage of required qty. 必要数量不足.<p>
	 *
	 */
	public void schd_yield_red_flg(boolean value) {
		setConstBoolean(offset + 111, $schd_yield_red_flg, value);
	}


	/**
	 * Start date delayed 着手日遅れ.<p>
	 *
	 */
	public boolean st_dt_red_flg() {
		return getConstBoolean(offset + 112, $st_dt_red_flg);
	}

	/**
	 * Start date delayed 着手日遅れ.<p>
	 *
	 */
	public void st_dt_red_flg(boolean value) {
		setConstBoolean(offset + 112, $st_dt_red_flg, value);
	}


	/**
	 * End date delayed 終了日遅れ.<p>
	 *
	 */
	public boolean end_dt_red_flg() {
		return getConstBoolean(offset + 113, $end_dt_red_flg);
	}

	/**
	 * End date delayed 終了日遅れ.<p>
	 *
	 */
	public void end_dt_red_flg(boolean value) {
		setConstBoolean(offset + 113, $end_dt_red_flg, value);
	}


	/**
	 * Available date delayed 使用可能予定日遅れ.<p>
	 *
	 */
	public boolean avl_schd_dt_red_flg() {
		return getConstBoolean(offset + 114, $avl_schd_dt_red_flg);
	}

	/**
	 * Available date delayed 使用可能予定日遅れ.<p>
	 *
	 */
	public void avl_schd_dt_red_flg(boolean value) {
		setConstBoolean(offset + 114, $avl_schd_dt_red_flg, value);
	}


	/**
	 * Allocation schedule delayed 引当予定遅れ.<p>
	 *
	 */
	public boolean alloc_pln_red_flg() {
		return getConstBoolean(offset + 115, $alloc_pln_red_flg);
	}

	/**
	 * Allocation schedule delayed 引当予定遅れ.<p>
	 *
	 */
	public void alloc_pln_red_flg(boolean value) {
		setConstBoolean(offset + 115, $alloc_pln_red_flg, value);
	}


	/**
	 * Surplus order 余剰オーダ.<p>
	 *
	 */
	public boolean surplus_ord_flg() {
		return getConstBoolean(offset + 116, $surplus_ord_flg);
	}

	/**
	 * Surplus order 余剰オーダ.<p>
	 *
	 */
	public void surplus_ord_flg(boolean value) {
		setConstBoolean(offset + 116, $surplus_ord_flg, value);
	}


	/**
	 * No abnormality 異常なし.<p>
	 *
	 */
	public boolean no_problem_flg() {
		return getConstBoolean(offset + 117, $no_problem_flg);
	}

	/**
	 * No abnormality 異常なし.<p>
	 *
	 */
	public void no_problem_flg(boolean value) {
		setConstBoolean(offset + 117, $no_problem_flg, value);
	}


	public mcframe.clientMAUB.MAUBP5170.ItmGrpR itm_grp_p(){
		return (mcframe.clientMAUB.MAUBP5170.ItmGrpR) getConstInnerRow(offset + 118, $itm_grp_p);
	}
	
	public void itm_grp_p(mcframe.clientMAUB.MAUBP5170.ItmGrpR row){
		setConstInnerRow(offset + 118, $itm_grp_p, row);
	}


	public mcframe.clientMAUB.MAUBP5190.BpGrpR bp_grp_p(){
		return (mcframe.clientMAUB.MAUBP5190.BpGrpR) getConstInnerRow(offset + 119, $bp_grp_p);
	}
	
	public void bp_grp_p(mcframe.clientMAUB.MAUBP5190.BpGrpR row){
		setConstInnerRow(offset + 119, $bp_grp_p, row);
	}


	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public String ins_usr_id() {
		return getConstString(offset + 120, $ins_usr_id);
	}

	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public void ins_usr_id(String value) {
		setConstString(offset + 120, $ins_usr_id, value);
	}


	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public String ins_usr_nm() {
		return getConstString(offset + 121, $ins_usr_nm);
	}

	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public void ins_usr_nm(String value) {
		setConstString(offset + 121, $ins_usr_nm, value);
	}


	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public String ins_func_id() {
		return getConstString(offset + 122, $ins_func_id);
	}

	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public void ins_func_id(String value) {
		setConstString(offset + 122, $ins_func_id, value);
	}


	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public String ins_func_nm() {
		return getConstString(offset + 123, $ins_func_nm);
	}

	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public void ins_func_nm(String value) {
		setConstString(offset + 123, $ins_func_nm, value);
	}


	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public MCTimestamp ins_ts() {
		return getConstTimestamp(offset + 124, $ins_ts);
	}

	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public void ins_ts(MCTimestamp value) {
		setConstTimestamp(offset + 124, $ins_ts, value);
	}


	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public String upd_usr_id() {
		return getConstString(offset + 125, $upd_usr_id);
	}

	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public void upd_usr_id(String value) {
		setConstString(offset + 125, $upd_usr_id, value);
	}


	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public String upd_usr_nm() {
		return getConstString(offset + 126, $upd_usr_nm);
	}

	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public void upd_usr_nm(String value) {
		setConstString(offset + 126, $upd_usr_nm, value);
	}


	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public String upd_func_id() {
		return getConstString(offset + 127, $upd_func_id);
	}

	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public void upd_func_id(String value) {
		setConstString(offset + 127, $upd_func_id, value);
	}


	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public String upd_func_nm() {
		return getConstString(offset + 128, $upd_func_nm);
	}

	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public void upd_func_nm(String value) {
		setConstString(offset + 128, $upd_func_nm, value);
	}


	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public MCTimestamp upd_ts() {
		return getConstTimestamp(offset + 129, $upd_ts);
	}

	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public void upd_ts(MCTimestamp value) {
		setConstTimestamp(offset + 129, $upd_ts, value);
	}


	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public String upd_srv_req_no() {
		return getConstString(offset + 130, $upd_srv_req_no);
	}

	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public void upd_srv_req_no(String value) {
		setConstString(offset + 130, $upd_srv_req_no, value);
	}


	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public MCNumber dec_place() {
		return getConstNumber(offset + 131, $dec_place);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void dec_place(MCNumber value) {
		setConstNumber(offset + 131, $dec_place, value);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void dec_place(int value) {
		setConstNumber(offset + 131, $dec_place, value);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void dec_place(long value) {
		setConstNumber(offset + 131, $dec_place, value);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void dec_place(float value) {
		setConstNumber(offset + 131, $dec_place, value);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void dec_place(double value) {
		setConstNumber(offset + 131, $dec_place, value);
	}


	/**
	 * For active ingredient 有効成分対象.<p>
	 *
	 */
	public boolean cont_fctr_flg() {
		return getConstBoolean(offset + 132, $cont_fctr_flg);
	}

	/**
	 * For active ingredient 有効成分対象.<p>
	 *
	 */
	public void cont_fctr_flg(boolean value) {
		setConstBoolean(offset + 132, $cont_fctr_flg, value);
	}


	/**
	 * Active ingredient number of decimal places 有効成分小数部有効桁数.<p>
	 *
	 */
	public MCNumber cont_fctr_dec_place() {
		return getConstNumber(offset + 133, $cont_fctr_dec_place);
	}

	/**
	 * Active ingredient number of decimal places 有効成分小数部有効桁数.<p>
	 *
	 */
	public void cont_fctr_dec_place(MCNumber value) {
		setConstNumber(offset + 133, $cont_fctr_dec_place, value);
	}

	/**
	 * Active ingredient number of decimal places 有効成分小数部有効桁数.<p>
	 *
	 */
	public void cont_fctr_dec_place(int value) {
		setConstNumber(offset + 133, $cont_fctr_dec_place, value);
	}

	/**
	 * Active ingredient number of decimal places 有効成分小数部有効桁数.<p>
	 *
	 */
	public void cont_fctr_dec_place(long value) {
		setConstNumber(offset + 133, $cont_fctr_dec_place, value);
	}

	/**
	 * Active ingredient number of decimal places 有効成分小数部有効桁数.<p>
	 *
	 */
	public void cont_fctr_dec_place(float value) {
		setConstNumber(offset + 133, $cont_fctr_dec_place, value);
	}

	/**
	 * Active ingredient number of decimal places 有効成分小数部有効桁数.<p>
	 *
	 */
	public void cont_fctr_dec_place(double value) {
		setConstNumber(offset + 133, $cont_fctr_dec_place, value);
	}


	/**
	 * Rounding type (Active ingredient conversion) 有効成分換算端数処理区分.<p>
	 *
	 */
	public String cont_fctr_rnd_typ() {
		return getConstString(offset + 134, $cont_fctr_rnd_typ);
	}

	/**
	 * Rounding type (Active ingredient conversion) 有効成分換算端数処理区分.<p>
	 *
	 */
	public void cont_fctr_rnd_typ(String value) {
		setConstString(offset + 134, $cont_fctr_rnd_typ, value);
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
		if ($base_unit_cd.equalsIgnoreCase(name)) {
			return base_unit_cd();
		}
		if ($base_unit_nm.equalsIgnoreCase(name)) {
			return base_unit_nm();
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
		if ($arr_yield_rate.equalsIgnoreCase(name)) {
			return arr_yield_rate();
		}
		if ($purc_rate.equalsIgnoreCase(name)) {
			return purc_rate();
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
		if ($base_unit_cd.equalsIgnoreCase(name)) {
			return base_unit_cd();
		}
		if ($base_unit_nm.equalsIgnoreCase(name)) {
			return base_unit_nm();
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
		if ($arr_yield_rate.equalsIgnoreCase(name)) {
			return arr_yield_rate();
		}
		if ($purc_rate.equalsIgnoreCase(name)) {
			return purc_rate();
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
		if ($base_unit_cd.equalsIgnoreCase(name)) {
			base_unit_cd(value);
			return;
		}
		if ($base_unit_nm.equalsIgnoreCase(name)) {
			base_unit_nm(value);
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
		if ($arr_yield_rate.equalsIgnoreCase(name)) {
			arr_yield_rate(value);
			return;
		}
		if ($purc_rate.equalsIgnoreCase(name)) {
			purc_rate(value);
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
		if ($arr_yield_rate.equalsIgnoreCase(name)) {
			arr_yield_rate(value);
			return;
		}
		if ($purc_rate.equalsIgnoreCase(name)) {
			purc_rate(value);
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
		if ($arr_yield_rate.equalsIgnoreCase(name)) {
			arr_yield_rate(value);
			return;
		}
		if ($purc_rate.equalsIgnoreCase(name)) {
			purc_rate(value);
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
		if ($arr_yield_rate.equalsIgnoreCase(name)) {
			arr_yield_rate(value);
			return;
		}
		if ($purc_rate.equalsIgnoreCase(name)) {
			purc_rate(value);
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
		if ($arr_yield_rate.equalsIgnoreCase(name)) {
			arr_yield_rate(value);
			return;
		}
		if ($purc_rate.equalsIgnoreCase(name)) {
			purc_rate(value);
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
		if ($base_unit_cd.equalsIgnoreCase(name)) {
			base_unit_cd(value);
			return;
		}
		if ($base_unit_nm.equalsIgnoreCase(name)) {
			base_unit_nm(value);
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
		if ($arr_yield_rate.equalsIgnoreCase(name)) {
			arr_yield_rate(value);
			return;
		}
		if ($purc_rate.equalsIgnoreCase(name)) {
			purc_rate(value);
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
		if ($arr_yield_rate.equalsIgnoreCase(name)) {
			arr_yield_rate(value);
			return;
		}
		if ($purc_rate.equalsIgnoreCase(name)) {
			purc_rate(value);
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
		if ($arr_yield_rate.equalsIgnoreCase(name)) {
			arr_yield_rate(value);
			return;
		}
		if ($purc_rate.equalsIgnoreCase(name)) {
			purc_rate(value);
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
		if ($arr_yield_rate.equalsIgnoreCase(name)) {
			arr_yield_rate(value);
			return;
		}
		if ($purc_rate.equalsIgnoreCase(name)) {
			purc_rate(value);
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
		if ($arr_yield_rate.equalsIgnoreCase(name)) {
			arr_yield_rate(value);
			return;
		}
		if ($purc_rate.equalsIgnoreCase(name)) {
			purc_rate(value);
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

	public MCRow getInnerRow(String name) {
		if ($itm_p.equalsIgnoreCase(name)) {
			return itm_p();
		}
		if ($ver_no_p.equalsIgnoreCase(name)) {
			return ver_no_p();
		}
		if ($inst_qty_p.equalsIgnoreCase(name)) {
			return inst_qty_p();
		}
		if ($yield_schd_qty_p.equalsIgnoreCase(name)) {
			return yield_schd_qty_p();
		}
		if ($inst_yield_schd_qty_p.equalsIgnoreCase(name)) {
			return inst_yield_schd_qty_p();
		}
		if ($yield_act_qty_p.equalsIgnoreCase(name)) {
			return yield_act_qty_p();
		}
		if ($purc_act_qty_p.equalsIgnoreCase(name)) {
			return purc_act_qty_p();
		}
		if ($insp_act_qty_p.equalsIgnoreCase(name)) {
			return insp_act_qty_p();
		}
		if ($yield_remain_qty_p.equalsIgnoreCase(name)) {
			return yield_remain_qty_p();
		}
		if ($purc_remain_qty_p.equalsIgnoreCase(name)) {
			return purc_remain_qty_p();
		}
		if ($insp_remain_qty_p.equalsIgnoreCase(name)) {
			return insp_remain_qty_p();
		}
		if ($schd_alloc_qty_p.equalsIgnoreCase(name)) {
			return schd_alloc_qty_p();
		}
		if ($surplus_qty_p.equalsIgnoreCase(name)) {
			return surplus_qty_p();
		}
		if ($abort_qty_p.equalsIgnoreCase(name)) {
			return abort_qty_p();
		}
		if ($cont_fctr_inst_qty_p.equalsIgnoreCase(name)) {
			return cont_fctr_inst_qty_p();
		}
		if ($cont_fctr_schd_yield_qty_p.equalsIgnoreCase(name)) {
			return cont_fctr_schd_yield_qty_p();
		}
		if ($cont_unit_p.equalsIgnoreCase(name)) {
			return cont_unit_p();
		}
		if ($std_cont_p.equalsIgnoreCase(name)) {
			return std_cont_p();
		}
		if ($sno_wrk_no_p.equalsIgnoreCase(name)) {
			return sno_wrk_no_p();
		}
		if ($itm_grp_p.equalsIgnoreCase(name)) {
			return itm_grp_p();
		}
		if ($bp_grp_p.equalsIgnoreCase(name)) {
			return bp_grp_p();
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
		if ($ver_no_p.equalsIgnoreCase(name)) {
			ver_no_p(
				((MCContainerMeta) ver_no_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5250.VerNoR.class, value)
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
		if ($inst_yield_schd_qty_p.equalsIgnoreCase(name)) {
			inst_yield_schd_qty_p(
				((MCContainerMeta) inst_yield_schd_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($yield_act_qty_p.equalsIgnoreCase(name)) {
			yield_act_qty_p(
				((MCContainerMeta) yield_act_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($purc_act_qty_p.equalsIgnoreCase(name)) {
			purc_act_qty_p(
				((MCContainerMeta) purc_act_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($insp_act_qty_p.equalsIgnoreCase(name)) {
			insp_act_qty_p(
				((MCContainerMeta) insp_act_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($yield_remain_qty_p.equalsIgnoreCase(name)) {
			yield_remain_qty_p(
				((MCContainerMeta) yield_remain_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($purc_remain_qty_p.equalsIgnoreCase(name)) {
			purc_remain_qty_p(
				((MCContainerMeta) purc_remain_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($insp_remain_qty_p.equalsIgnoreCase(name)) {
			insp_remain_qty_p(
				((MCContainerMeta) insp_remain_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($schd_alloc_qty_p.equalsIgnoreCase(name)) {
			schd_alloc_qty_p(
				((MCContainerMeta) schd_alloc_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($surplus_qty_p.equalsIgnoreCase(name)) {
			surplus_qty_p(
				((MCContainerMeta) surplus_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($abort_qty_p.equalsIgnoreCase(name)) {
			abort_qty_p(
				((MCContainerMeta) abort_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($cont_fctr_inst_qty_p.equalsIgnoreCase(name)) {
			cont_fctr_inst_qty_p(
				((MCContainerMeta) cont_fctr_inst_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5260.ContQtyR.class, value)
			);
			return;
		}
		if ($cont_fctr_schd_yield_qty_p.equalsIgnoreCase(name)) {
			cont_fctr_schd_yield_qty_p(
				((MCContainerMeta) cont_fctr_schd_yield_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5260.ContQtyR.class, value)
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
		if ($sno_wrk_no_p.equalsIgnoreCase(name)) {
			sno_wrk_no_p(
				((MCContainerMeta) sno_wrk_no_p_META).castInnerRow(mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.class, value)
			);
			return;
		}
		if ($itm_grp_p.equalsIgnoreCase(name)) {
			itm_grp_p(
				((MCContainerMeta) itm_grp_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5170.ItmGrpR.class, value)
			);
			return;
		}
		if ($bp_grp_p.equalsIgnoreCase(name)) {
			bp_grp_p(
				((MCContainerMeta) bp_grp_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5190.BpGrpR.class, value)
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

	public String ver_no() {
		return ver_no_p().ver_no();
	}

	public void ver_no(String value) {
		ver_no_p().ver_no(value);
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

	/**
	 * Output scheduled qty. (Order/PO) 出来高予定数量（指図・発注）.<p>
	 *
	 */
	public MCNumber inst_yield_schd_qty() {
		return inst_yield_schd_qty_p().qty();
	}

	/**
	 * Output scheduled qty. (Order/PO) 出来高予定数量（指図・発注）.<p>
	 *
	 */
	public void inst_yield_schd_qty(MCNumber value) {
		inst_yield_schd_qty_p().qty(value);
	}

	/**
	 * Output scheduled qty. (Order/PO) 出来高予定数量（指図・発注）.<p>
	 *
	 */
	public void inst_yield_schd_qty(int value) {
		inst_yield_schd_qty_p().qty(value);
	}

	/**
	 * Output scheduled qty. (Order/PO) 出来高予定数量（指図・発注）.<p>
	 *
	 */
	public void inst_yield_schd_qty(long value) {
		inst_yield_schd_qty_p().qty(value);
	}

	/**
	 * Output scheduled qty. (Order/PO) 出来高予定数量（指図・発注）.<p>
	 *
	 */
	public void inst_yield_schd_qty(float value) {
		inst_yield_schd_qty_p().qty(value);
	}

	/**
	 * Output scheduled qty. (Order/PO) 出来高予定数量（指図・発注）.<p>
	 *
	 */
	public void inst_yield_schd_qty(double value) {
		inst_yield_schd_qty_p().qty(value);
	}

	/**
	 * Receipt/output result qty. 入荷・出来高実績数量.<p>
	 *
	 */
	public MCNumber yield_act_qty() {
		return yield_act_qty_p().qty();
	}

	/**
	 * Receipt/output result qty. 入荷・出来高実績数量.<p>
	 *
	 */
	public void yield_act_qty(MCNumber value) {
		yield_act_qty_p().qty(value);
	}

	/**
	 * Receipt/output result qty. 入荷・出来高実績数量.<p>
	 *
	 */
	public void yield_act_qty(int value) {
		yield_act_qty_p().qty(value);
	}

	/**
	 * Receipt/output result qty. 入荷・出来高実績数量.<p>
	 *
	 */
	public void yield_act_qty(long value) {
		yield_act_qty_p().qty(value);
	}

	/**
	 * Receipt/output result qty. 入荷・出来高実績数量.<p>
	 *
	 */
	public void yield_act_qty(float value) {
		yield_act_qty_p().qty(value);
	}

	/**
	 * Receipt/output result qty. 入荷・出来高実績数量.<p>
	 *
	 */
	public void yield_act_qty(double value) {
		yield_act_qty_p().qty(value);
	}

	/**
	 * Purchase result qty. 仕入実績数量.<p>
	 *
	 */
	public MCNumber purc_act_qty() {
		return purc_act_qty_p().qty();
	}

	/**
	 * Purchase result qty. 仕入実績数量.<p>
	 *
	 */
	public void purc_act_qty(MCNumber value) {
		purc_act_qty_p().qty(value);
	}

	/**
	 * Purchase result qty. 仕入実績数量.<p>
	 *
	 */
	public void purc_act_qty(int value) {
		purc_act_qty_p().qty(value);
	}

	/**
	 * Purchase result qty. 仕入実績数量.<p>
	 *
	 */
	public void purc_act_qty(long value) {
		purc_act_qty_p().qty(value);
	}

	/**
	 * Purchase result qty. 仕入実績数量.<p>
	 *
	 */
	public void purc_act_qty(float value) {
		purc_act_qty_p().qty(value);
	}

	/**
	 * Purchase result qty. 仕入実績数量.<p>
	 *
	 */
	public void purc_act_qty(double value) {
		purc_act_qty_p().qty(value);
	}

	/**
	 * Inspection result qty. 検査実績数量.<p>
	 *
	 */
	public MCNumber insp_act_qty() {
		return insp_act_qty_p().qty();
	}

	/**
	 * Inspection result qty. 検査実績数量.<p>
	 *
	 */
	public void insp_act_qty(MCNumber value) {
		insp_act_qty_p().qty(value);
	}

	/**
	 * Inspection result qty. 検査実績数量.<p>
	 *
	 */
	public void insp_act_qty(int value) {
		insp_act_qty_p().qty(value);
	}

	/**
	 * Inspection result qty. 検査実績数量.<p>
	 *
	 */
	public void insp_act_qty(long value) {
		insp_act_qty_p().qty(value);
	}

	/**
	 * Inspection result qty. 検査実績数量.<p>
	 *
	 */
	public void insp_act_qty(float value) {
		insp_act_qty_p().qty(value);
	}

	/**
	 * Inspection result qty. 検査実績数量.<p>
	 *
	 */
	public void insp_act_qty(double value) {
		insp_act_qty_p().qty(value);
	}

	/**
	 * Remaining receipt/output 入荷・出来高残数.<p>
	 *
	 */
	public MCNumber yield_remain_qty() {
		return yield_remain_qty_p().qty();
	}

	/**
	 * Remaining receipt/output 入荷・出来高残数.<p>
	 *
	 */
	public void yield_remain_qty(MCNumber value) {
		yield_remain_qty_p().qty(value);
	}

	/**
	 * Remaining receipt/output 入荷・出来高残数.<p>
	 *
	 */
	public void yield_remain_qty(int value) {
		yield_remain_qty_p().qty(value);
	}

	/**
	 * Remaining receipt/output 入荷・出来高残数.<p>
	 *
	 */
	public void yield_remain_qty(long value) {
		yield_remain_qty_p().qty(value);
	}

	/**
	 * Remaining receipt/output 入荷・出来高残数.<p>
	 *
	 */
	public void yield_remain_qty(float value) {
		yield_remain_qty_p().qty(value);
	}

	/**
	 * Remaining receipt/output 入荷・出来高残数.<p>
	 *
	 */
	public void yield_remain_qty(double value) {
		yield_remain_qty_p().qty(value);
	}

	/**
	 * Remaining purchase qty. 仕入残数.<p>
	 *
	 */
	public MCNumber purc_remain_qty() {
		return purc_remain_qty_p().qty();
	}

	/**
	 * Remaining purchase qty. 仕入残数.<p>
	 *
	 */
	public void purc_remain_qty(MCNumber value) {
		purc_remain_qty_p().qty(value);
	}

	/**
	 * Remaining purchase qty. 仕入残数.<p>
	 *
	 */
	public void purc_remain_qty(int value) {
		purc_remain_qty_p().qty(value);
	}

	/**
	 * Remaining purchase qty. 仕入残数.<p>
	 *
	 */
	public void purc_remain_qty(long value) {
		purc_remain_qty_p().qty(value);
	}

	/**
	 * Remaining purchase qty. 仕入残数.<p>
	 *
	 */
	public void purc_remain_qty(float value) {
		purc_remain_qty_p().qty(value);
	}

	/**
	 * Remaining purchase qty. 仕入残数.<p>
	 *
	 */
	public void purc_remain_qty(double value) {
		purc_remain_qty_p().qty(value);
	}

	/**
	 * Remaining inspection qty. 検査残数.<p>
	 *
	 */
	public MCNumber insp_remain_qty() {
		return insp_remain_qty_p().qty();
	}

	/**
	 * Remaining inspection qty. 検査残数.<p>
	 *
	 */
	public void insp_remain_qty(MCNumber value) {
		insp_remain_qty_p().qty(value);
	}

	/**
	 * Remaining inspection qty. 検査残数.<p>
	 *
	 */
	public void insp_remain_qty(int value) {
		insp_remain_qty_p().qty(value);
	}

	/**
	 * Remaining inspection qty. 検査残数.<p>
	 *
	 */
	public void insp_remain_qty(long value) {
		insp_remain_qty_p().qty(value);
	}

	/**
	 * Remaining inspection qty. 検査残数.<p>
	 *
	 */
	public void insp_remain_qty(float value) {
		insp_remain_qty_p().qty(value);
	}

	/**
	 * Remaining inspection qty. 検査残数.<p>
	 *
	 */
	public void insp_remain_qty(double value) {
		insp_remain_qty_p().qty(value);
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

	/**
	 * Surplus qty. 余剰数量.<p>
	 *
	 */
	public MCNumber surplus_qty() {
		return surplus_qty_p().qty();
	}

	/**
	 * Surplus qty. 余剰数量.<p>
	 *
	 */
	public void surplus_qty(MCNumber value) {
		surplus_qty_p().qty(value);
	}

	/**
	 * Surplus qty. 余剰数量.<p>
	 *
	 */
	public void surplus_qty(int value) {
		surplus_qty_p().qty(value);
	}

	/**
	 * Surplus qty. 余剰数量.<p>
	 *
	 */
	public void surplus_qty(long value) {
		surplus_qty_p().qty(value);
	}

	/**
	 * Surplus qty. 余剰数量.<p>
	 *
	 */
	public void surplus_qty(float value) {
		surplus_qty_p().qty(value);
	}

	/**
	 * Surplus qty. 余剰数量.<p>
	 *
	 */
	public void surplus_qty(double value) {
		surplus_qty_p().qty(value);
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
	 * Active ingredient (Order scheduled qty.) 有効成分(指図予定数量).<p>
	 *
	 */
	public MCNumber cont_fctr_inst_qty() {
		return cont_fctr_inst_qty_p().cont_qty();
	}

	/**
	 * Active ingredient (Order scheduled qty.) 有効成分(指図予定数量).<p>
	 *
	 */
	public void cont_fctr_inst_qty(MCNumber value) {
		cont_fctr_inst_qty_p().cont_qty(value);
	}

	/**
	 * Active ingredient (Order scheduled qty.) 有効成分(指図予定数量).<p>
	 *
	 */
	public void cont_fctr_inst_qty(int value) {
		cont_fctr_inst_qty_p().cont_qty(value);
	}

	/**
	 * Active ingredient (Order scheduled qty.) 有効成分(指図予定数量).<p>
	 *
	 */
	public void cont_fctr_inst_qty(long value) {
		cont_fctr_inst_qty_p().cont_qty(value);
	}

	/**
	 * Active ingredient (Order scheduled qty.) 有効成分(指図予定数量).<p>
	 *
	 */
	public void cont_fctr_inst_qty(float value) {
		cont_fctr_inst_qty_p().cont_qty(value);
	}

	/**
	 * Active ingredient (Order scheduled qty.) 有効成分(指図予定数量).<p>
	 *
	 */
	public void cont_fctr_inst_qty(double value) {
		cont_fctr_inst_qty_p().cont_qty(value);
	}

	/**
	 * Active ingredient (Output scheduled qty.) 有効成分(出来高予定数量).<p>
	 *
	 */
	public MCNumber cont_fctr_schd_yield_qty() {
		return cont_fctr_schd_yield_qty_p().cont_qty();
	}

	/**
	 * Active ingredient (Output scheduled qty.) 有効成分(出来高予定数量).<p>
	 *
	 */
	public void cont_fctr_schd_yield_qty(MCNumber value) {
		cont_fctr_schd_yield_qty_p().cont_qty(value);
	}

	/**
	 * Active ingredient (Output scheduled qty.) 有効成分(出来高予定数量).<p>
	 *
	 */
	public void cont_fctr_schd_yield_qty(int value) {
		cont_fctr_schd_yield_qty_p().cont_qty(value);
	}

	/**
	 * Active ingredient (Output scheduled qty.) 有効成分(出来高予定数量).<p>
	 *
	 */
	public void cont_fctr_schd_yield_qty(long value) {
		cont_fctr_schd_yield_qty_p().cont_qty(value);
	}

	/**
	 * Active ingredient (Output scheduled qty.) 有効成分(出来高予定数量).<p>
	 *
	 */
	public void cont_fctr_schd_yield_qty(float value) {
		cont_fctr_schd_yield_qty_p().cont_qty(value);
	}

	/**
	 * Active ingredient (Output scheduled qty.) 有効成分(出来高予定数量).<p>
	 *
	 */
	public void cont_fctr_schd_yield_qty(double value) {
		cont_fctr_schd_yield_qty_p().cont_qty(value);
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

	/**
	 * Standard coefficient 標準係数.<p>
	 *
	 */
	public MCNumber std_cont_fctr() {
		return std_cont_p().std_cont_fctr();
	}

	/**
	 * Standard coefficient 標準係数.<p>
	 *
	 */
	public void std_cont_fctr(MCNumber value) {
		std_cont_p().std_cont_fctr(value);
	}

	/**
	 * Standard coefficient 標準係数.<p>
	 *
	 */
	public void std_cont_fctr(int value) {
		std_cont_p().std_cont_fctr(value);
	}

	/**
	 * Standard coefficient 標準係数.<p>
	 *
	 */
	public void std_cont_fctr(long value) {
		std_cont_p().std_cont_fctr(value);
	}

	/**
	 * Standard coefficient 標準係数.<p>
	 *
	 */
	public void std_cont_fctr(float value) {
		std_cont_p().std_cont_fctr(value);
	}

	/**
	 * Standard coefficient 標準係数.<p>
	 *
	 */
	public void std_cont_fctr(double value) {
		std_cont_p().std_cont_fctr(value);
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
	 * Supplier classification cd. 1 発注先分類ＣＤ１.<p>
	 *
	 */
	public String bp_grp_cd1() {
		return bp_grp_p().bp_grp_cd1();
	}

	/**
	 * Supplier classification cd. 1 発注先分類ＣＤ１.<p>
	 *
	 */
	public void bp_grp_cd1(String value) {
		bp_grp_p().bp_grp_cd1(value);
	}

	/**
	 * Supplier classification name 1 発注先分類名１.<p>
	 *
	 */
	public String bp_grp_nm1() {
		return bp_grp_p().bp_grp_nm1();
	}

	/**
	 * Supplier classification name 1 発注先分類名１.<p>
	 *
	 */
	public void bp_grp_nm1(String value) {
		bp_grp_p().bp_grp_nm1(value);
	}

	/**
	 * Supplier classification cd. 2 発注先分類ＣＤ２.<p>
	 *
	 */
	public String bp_grp_cd2() {
		return bp_grp_p().bp_grp_cd2();
	}

	/**
	 * Supplier classification cd. 2 発注先分類ＣＤ２.<p>
	 *
	 */
	public void bp_grp_cd2(String value) {
		bp_grp_p().bp_grp_cd2(value);
	}

	/**
	 * Supplier classification name 2 発注先分類名２.<p>
	 *
	 */
	public String bp_grp_nm2() {
		return bp_grp_p().bp_grp_nm2();
	}

	/**
	 * Supplier classification name 2 発注先分類名２.<p>
	 *
	 */
	public void bp_grp_nm2(String value) {
		bp_grp_p().bp_grp_nm2(value);
	}

	/**
	 * Supplier classification cd. 3 発注先分類ＣＤ３.<p>
	 *
	 */
	public String bp_grp_cd3() {
		return bp_grp_p().bp_grp_cd3();
	}

	/**
	 * Supplier classification cd. 3 発注先分類ＣＤ３.<p>
	 *
	 */
	public void bp_grp_cd3(String value) {
		bp_grp_p().bp_grp_cd3(value);
	}

	/**
	 * Supplier classification name 3 発注先分類名３.<p>
	 *
	 */
	public String bp_grp_nm3() {
		return bp_grp_p().bp_grp_nm3();
	}

	/**
	 * Supplier classification name 3 発注先分類名３.<p>
	 *
	 */
	public void bp_grp_nm3(String value) {
		bp_grp_p().bp_grp_nm3(value);
	}

	/**
	 * Supplier classification cd. 4 発注先分類ＣＤ４.<p>
	 *
	 */
	public String bp_grp_cd4() {
		return bp_grp_p().bp_grp_cd4();
	}

	/**
	 * Supplier classification cd. 4 発注先分類ＣＤ４.<p>
	 *
	 */
	public void bp_grp_cd4(String value) {
		bp_grp_p().bp_grp_cd4(value);
	}

	/**
	 * Supplier classification name 4 発注先分類名４.<p>
	 *
	 */
	public String bp_grp_nm4() {
		return bp_grp_p().bp_grp_nm4();
	}

	/**
	 * Supplier classification name 4 発注先分類名４.<p>
	 *
	 */
	public void bp_grp_nm4(String value) {
		bp_grp_p().bp_grp_nm4(value);
	}

	/**
	 * Supplier classification cd. 5 発注先分類ＣＤ５.<p>
	 *
	 */
	public String bp_grp_cd5() {
		return bp_grp_p().bp_grp_cd5();
	}

	/**
	 * Supplier classification cd. 5 発注先分類ＣＤ５.<p>
	 *
	 */
	public void bp_grp_cd5(String value) {
		bp_grp_p().bp_grp_cd5(value);
	}

	/**
	 * Supplier classification name 5 発注先分類名５.<p>
	 *
	 */
	public String bp_grp_nm5() {
		return bp_grp_p().bp_grp_nm5();
	}

	/**
	 * Supplier classification name 5 発注先分類名５.<p>
	 *
	 */
	public void bp_grp_nm5(String value) {
		bp_grp_p().bp_grp_nm5(value);
	}

	/**
	 * Supplier classification cd. 6 発注先分類ＣＤ６.<p>
	 *
	 */
	public String bp_grp_cd6() {
		return bp_grp_p().bp_grp_cd6();
	}

	/**
	 * Supplier classification cd. 6 発注先分類ＣＤ６.<p>
	 *
	 */
	public void bp_grp_cd6(String value) {
		bp_grp_p().bp_grp_cd6(value);
	}

	/**
	 * Supplier classification name 6 発注先分類名６.<p>
	 *
	 */
	public String bp_grp_nm6() {
		return bp_grp_p().bp_grp_nm6();
	}

	/**
	 * Supplier classification name 6 発注先分類名６.<p>
	 *
	 */
	public void bp_grp_nm6(String value) {
		bp_grp_p().bp_grp_nm6(value);
	}

	/**
	 * Supplier classification cd. 7 発注先分類ＣＤ７.<p>
	 *
	 */
	public String bp_grp_cd7() {
		return bp_grp_p().bp_grp_cd7();
	}

	/**
	 * Supplier classification cd. 7 発注先分類ＣＤ７.<p>
	 *
	 */
	public void bp_grp_cd7(String value) {
		bp_grp_p().bp_grp_cd7(value);
	}

	/**
	 * Supplier classification name 7 発注先分類名７.<p>
	 *
	 */
	public String bp_grp_nm7() {
		return bp_grp_p().bp_grp_nm7();
	}

	/**
	 * Supplier classification name 7 発注先分類名７.<p>
	 *
	 */
	public void bp_grp_nm7(String value) {
		bp_grp_p().bp_grp_nm7(value);
	}

	/**
	 * Supplier classification cd. 8 発注先分類ＣＤ８.<p>
	 *
	 */
	public String bp_grp_cd8() {
		return bp_grp_p().bp_grp_cd8();
	}

	/**
	 * Supplier classification cd. 8 発注先分類ＣＤ８.<p>
	 *
	 */
	public void bp_grp_cd8(String value) {
		bp_grp_p().bp_grp_cd8(value);
	}

	/**
	 * Supplier classification name 8 発注先分類名８.<p>
	 *
	 */
	public String bp_grp_nm8() {
		return bp_grp_p().bp_grp_nm8();
	}

	/**
	 * Supplier classification name 8 発注先分類名８.<p>
	 *
	 */
	public void bp_grp_nm8(String value) {
		bp_grp_p().bp_grp_nm8(value);
	}

	/**
	 * Supplier classification cd. 9 発注先分類ＣＤ９.<p>
	 *
	 */
	public String bp_grp_cd9() {
		return bp_grp_p().bp_grp_cd9();
	}

	/**
	 * Supplier classification cd. 9 発注先分類ＣＤ９.<p>
	 *
	 */
	public void bp_grp_cd9(String value) {
		bp_grp_p().bp_grp_cd9(value);
	}

	/**
	 * Supplier classification name 9 発注先分類名９.<p>
	 *
	 */
	public String bp_grp_nm9() {
		return bp_grp_p().bp_grp_nm9();
	}

	/**
	 * Supplier classification name 9 発注先分類名９.<p>
	 *
	 */
	public void bp_grp_nm9(String value) {
		bp_grp_p().bp_grp_nm9(value);
	}

	/**
	 * Supplier classification cd. 10 発注先分類ＣＤ１０.<p>
	 *
	 */
	public String bp_grp_cd10() {
		return bp_grp_p().bp_grp_cd10();
	}

	/**
	 * Supplier classification cd. 10 発注先分類ＣＤ１０.<p>
	 *
	 */
	public void bp_grp_cd10(String value) {
		bp_grp_p().bp_grp_cd10(value);
	}

	/**
	 * Supplier classification name 10 発注先分類名１０.<p>
	 *
	 */
	public String bp_grp_nm10() {
		return bp_grp_p().bp_grp_nm10();
	}

	/**
	 * Supplier classification name 10 発注先分類名１０.<p>
	 *
	 */
	public void bp_grp_nm10(String value) {
		bp_grp_p().bp_grp_nm10(value);
	}

}

