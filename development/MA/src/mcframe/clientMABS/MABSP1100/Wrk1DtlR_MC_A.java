package mcframe.clientMABS.MABSP1100;

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
 * ブロック"Wrk1Dtl"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class Wrk1DtlR_MC_A extends MCConstRow {

	/**
	 * Select 選択.<p>
	 *
	 */
	public static final String $check = "check";
	/**
	 * Logical delete 論理削除.<p>
	 *
	 */
	public static final String $del_flg = "del_flg";
	public static final String $itm_p = "itm_p";
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
	 * Mfg. location supplier 製造場所発注先.<p>
	 *
	 */
	public static final String $loc_sppl_cd = "loc_sppl_cd";
	/**
	 * BOM pattern 構成パタン.<p>
	 *
	 */
	public static final String $bom_ptn = "bom_ptn";
	public static final String $dt_p = "dt_p";
	/**
	 * Operation pattern 工程パタン.<p>
	 *
	 */
	public static final String $oper_ptn = "oper_ptn";
	/**
	 * Mfg. LT 製造ＬＴ.<p>
	 *
	 */
	public static final String $mfg_lt = "mfg_lt";
	public static final String $mfg_lt_add_qty_p = "mfg_lt_add_qty_p";
	/**
	 * Purchase LT 購入ＬＴ.<p>
	 *
	 */
	public static final String $purc_lt = "purc_lt";
	public static final String $purc_lt_add_qty_p = "purc_lt_add_qty_p";
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
	 * Acceptance LT 検収ＬＴ.<p>
	 *
	 */
	public static final String $accpt_insp_lt = "accpt_insp_lt";
	/**
	 * Safety LT 安全ＬＴ.<p>
	 *
	 */
	public static final String $buf_lt = "buf_lt";
	/**
	 * Order auto-firming period (Date) オーダ自動確定期間（日）.<p>
	 *
	 */
	public static final String $ord_fix_pd = "ord_fix_pd";
	/**
	 * Aggregation (by day of week) type 曜日まとめ区分.<p>
	 *
	 */
	public static final String $sz_day_week_typ = "sz_day_week_typ";
	/**
	 * Aggregation (by day of week) type name 曜日まとめ区分名.<p>
	 *
	 */
	public static final String $sz_day_week_typ_nm = "sz_day_week_typ_nm";
	/**
	 * Aggregation (by day of week) period (Week) 曜日まとめ期間（週）.<p>
	 *
	 */
	public static final String $sz_week = "sz_week";
	/**
	 * Lot sizing period (Days) ロットまとめ期間（日）.<p>
	 *
	 */
	public static final String $lot_sz_pd = "lot_sz_pd";
	public static final String $min_lot_qty_p = "min_lot_qty_p";
	public static final String $batch_lot_qty_p = "batch_lot_qty_p";
	public static final String $max_lot_qty_p = "max_lot_qty_p";
	/**
	 * Number of max. order 最大オーダ件数.<p>
	 *
	 */
	public static final String $max_order = "max_order";
	/**
	 * Priority 優先順.<p>
	 *
	 */
	public static final String $prio = "prio";
	/**
	 * Order ratio オーダ比率.<p>
	 *
	 */
	public static final String $order_ratio = "order_ratio";
	public static final String $yield_schd_qty_p = "yield_schd_qty_p";
	public static final String $mfg_inst_qty_p = "mfg_inst_qty_p";
	public static final String $fxd_rqmt_qty_p = "fxd_rqmt_qty_p";
	/**
	 * Lot numbering timing type ロット発番タイミング区分.<p>
	 *
	 */
	public static final String $lot_issue_typ = "lot_issue_typ";
	/**
	 * Lot numbering timing type name ロット発番タイミング区分名.<p>
	 *
	 */
	public static final String $lot_issue_typ_nm = "lot_issue_typ_nm";
	/**
	 * Allow backflush バックフラッシュ許可.<p>
	 *
	 */
	public static final String $bkf_flg = "bkf_flg";
	/**
	 * Rack/Line storage 棚・ライン格納.<p>
	 *
	 */
	public static final String $ln_stk_flg = "ln_stk_flg";
	/**
	 * For long LT 先行手配対象.<p>
	 *
	 */
	public static final String $pre_po_tgt_flg = "pre_po_tgt_flg";
	/**
	 * Issue record sheet at mfg. order 製造指図時記録書発行.<p>
	 *
	 */
	public static final String $inst_rec_issue_flg = "inst_rec_issue_flg";
	/**
	 * Not for mfg. approval 製造承認対象外.<p>
	 *
	 */
	public static final String $no_mfg_aprv_flg = "no_mfg_aprv_flg";
	/**
	 * Item min. yield 品目下限収率.<p>
	 *
	 */
	public static final String $itm_lower_yield = "itm_lower_yield";
	/**
	 * Item standard yield 品目標準収率.<p>
	 *
	 */
	public static final String $itm_std_yield = "itm_std_yield";
	/**
	 * Item max. yield 品目上限収率.<p>
	 *
	 */
	public static final String $itm_upper_yield = "itm_upper_yield";
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
	 * Purchase request destination WG cd. 購買依頼先ワーキンググループＣＤ.<p>
	 *
	 */
	public static final String $rqst_wg_cd = "rqst_wg_cd";
	/**
	 * Purchase requested WG name 購買依頼先ワーキンググループ名.<p>
	 *
	 */
	public static final String $rqst_wg_nm = "rqst_wg_nm";
	/**
	 * PO batch 発注バッチ.<p>
	 *
	 */
	public static final String $po_batch_flg = "po_batch_flg";
	/**
	 * Resource cd. 1 資源ＣＤ１.<p>
	 *
	 */
	public static final String $rsrc_cd1 = "rsrc_cd1";
	/**
	 * Resource name 1 資源名１.<p>
	 *
	 */
	public static final String $rsrc_nm1 = "rsrc_nm1";
	/**
	 * Resource standard value 1 資源標準値１.<p>
	 *
	 */
	public static final String $rsrc_std_qty1 = "rsrc_std_qty1";
	public static final String $rsrc_unit_qty1_p = "rsrc_unit_qty1_p";
	/**
	 * Resource cd. 2 資源ＣＤ２.<p>
	 *
	 */
	public static final String $rsrc_cd2 = "rsrc_cd2";
	/**
	 * Resource name 2 資源名２.<p>
	 *
	 */
	public static final String $rsrc_nm2 = "rsrc_nm2";
	/**
	 * Resource standard value 2 資源標準値２.<p>
	 *
	 */
	public static final String $rsrc_std_qty2 = "rsrc_std_qty2";
	public static final String $rsrc_unit_qty2_p = "rsrc_unit_qty2_p";
	public static final String $sno_p = "sno_p";
	/**
	 * Not for MRP ＭＲＰ対象外.<p>
	 *
	 */
	public static final String $not_mrp_flg = "not_mrp_flg";
	/**
	 * Cost ratio 原価比率.<p>
	 *
	 */
	public static final String $cost_ratio = "cost_ratio";
	/**
	 * Memo 1 メモ１.<p>
	 *
	 */
	public static final String $memo1 = "memo1";
	/**
	 * Memo 2 メモ２.<p>
	 *
	 */
	public static final String $memo2 = "memo2";
	/**
	 * Memo 3 メモ３.<p>
	 *
	 */
	public static final String $memo3 = "memo3";
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
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public static final String $ins_ts = "ins_ts";
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
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public static final String $upd_cntr = "upd_cntr";
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
	 * Update date and time 更新日時.<p>
	 *
	 */
	public static final String $upd_ts = "upd_ts";
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
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public static final String $upd_srv_req_no = "upd_srv_req_no";
	/**
	 * Logical delete user ID 論理削除ユーザＩＤ.<p>
	 *
	 */
	public static final String $del_usr_id = "del_usr_id";
	/**
	 * Logical delete user name 論理削除ユーザ名.<p>
	 *
	 */
	public static final String $del_usr_nm = "del_usr_nm";
	/**
	 * Logical delete date and time 論理削除日時.<p>
	 *
	 */
	public static final String $del_ts = "del_ts";

	public static final String $itm_cd = $itm_p + ".itm_cd";
	public static final String $itm_sub1 = $itm_p + ".itm_sub1";
	public static final String $itm_sub2 = $itm_p + ".itm_sub2";
	public static final String $itm_sub3 = $itm_p + ".itm_sub3";
	public static final String $st_dt_key = $dt_p + ".st_dt_key";
	public static final String $st_dt = $dt_p + ".st_dt";
	public static final String $end_dt = $dt_p + ".end_dt";
	public static final String $mfg_lt_add_qty = $mfg_lt_add_qty_p + ".qty";
	public static final String $purc_lt_add_qty = $purc_lt_add_qty_p + ".qty";
	public static final String $min_lot_qty = $min_lot_qty_p + ".qty";
	public static final String $batch_lot_qty = $batch_lot_qty_p + ".qty";
	public static final String $max_lot_qty = $max_lot_qty_p + ".qty";
	public static final String $yield_schd_qty = $yield_schd_qty_p + ".qty";
	public static final String $mfg_inst_qty = $mfg_inst_qty_p + ".qty";
	public static final String $fxd_rqmt_qty = $fxd_rqmt_qty_p + ".qty";
	public static final String $rsrc_unit_qty1 = $rsrc_unit_qty1_p + ".qty";
	public static final String $rsrc_unit_qty2 = $rsrc_unit_qty2_p + ".qty";
	public static final String $sno1 = $sno_p + ".sno1";
	public static final String $sno2 = $sno_p + ".sno2";
	public static final String $sno3 = $sno_p + ".sno3";
	public static final String $sno4 = $sno_p + ".sno4";

	public static final MCMeta check_META = createCommonMeta($check, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta del_flg_META = createCommonMeta($del_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta itm_p_META = createInnerRowMeta($itm_p, mcframe.clientMAUB.MAUBP5030.ItmR.class);
	public static final MCMeta wg_cd_META = createCommonMeta($wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta wg_nm_META = createCommonMeta($wg_nm, mcframe.commonMA.meta.MA_META.WG_NM);
	public static final MCMeta mfg_loc_cd_META = createCommonMeta($mfg_loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta mfg_loc_nm_META = createCommonMeta($mfg_loc_nm, mcframe.commonMA.meta.MA_META.LOC_NM);
	public static final MCMeta loc_sppl_cd_META = createCommonMeta($loc_sppl_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta bom_ptn_META = createCommonMeta($bom_ptn, mcframe.commonMA.meta.MA_META.BOM_PTN);
	public static final MCMeta dt_p_META = createInnerRowMeta($dt_p, mcframe.clientMAUB.MAUBP5010.DtR.class);
	public static final MCMeta oper_ptn_META = createCommonMeta($oper_ptn, mcframe.commonMA.meta.MA_META.OPER_PTN);
	public static final MCMeta mfg_lt_META = createCommonMeta($mfg_lt, mcframe.commonMA.meta.MA_META.LT);
	public static final MCMeta mfg_lt_add_qty_p_META = createInnerRowMeta($mfg_lt_add_qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta purc_lt_META = createCommonMeta($purc_lt, mcframe.commonMA.meta.MA_META.LT);
	public static final MCMeta purc_lt_add_qty_p_META = createInnerRowMeta($purc_lt_add_qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta purc_basis_typ_META = createCommonMeta($purc_basis_typ, mcframe.commonMA.meta.MA_META.PURC_BASIS_TYP);
	public static final MCMeta purc_basis_typ_nm_META = createCommonMeta($purc_basis_typ_nm, mcframe.commonMA.meta.MA_META.PURC_BASIS_TYP_NM);
	public static final MCMeta accpt_insp_lt_META = createCommonMeta($accpt_insp_lt, mcframe.commonMA.meta.MA_META.LT);
	public static final MCMeta buf_lt_META = createCommonMeta($buf_lt, mcframe.commonMA.meta.MA_META.LT);
	public static final MCMeta ord_fix_pd_META = createCommonMeta($ord_fix_pd, mcframe.commonMA.meta.MA_META.ORD_FIX_PD);
	public static final MCMeta sz_day_week_typ_META = createCommonMeta($sz_day_week_typ, mcframe.commonMA.meta.MA_META.DAY_WEEK_TYP);
	public static final MCMeta sz_day_week_typ_nm_META = createCommonMeta($sz_day_week_typ_nm, mcframe.commonMA.meta.MA_META.DAY_WEEK_TYP_NM);
	public static final MCMeta sz_week_META = createCommonMeta($sz_week, mcframe.commonMA.meta.MA_META.SZ_WEEK);
	public static final MCMeta lot_sz_pd_META = createCommonMeta($lot_sz_pd, mcframe.commonMA.meta.MA_META.LOT_SZ_PD);
	public static final MCMeta min_lot_qty_p_META = createInnerRowMeta($min_lot_qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta batch_lot_qty_p_META = createInnerRowMeta($batch_lot_qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta max_lot_qty_p_META = createInnerRowMeta($max_lot_qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta max_order_META = createCommonMeta($max_order, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta prio_META = createCommonMeta($prio, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta order_ratio_META = createCommonMeta($order_ratio, mcframe.commonMA.meta.MA_META.ORDER_RATIO);
	public static final MCMeta yield_schd_qty_p_META = createInnerRowMeta($yield_schd_qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta mfg_inst_qty_p_META = createInnerRowMeta($mfg_inst_qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta fxd_rqmt_qty_p_META = createInnerRowMeta($fxd_rqmt_qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta lot_issue_typ_META = createCommonMeta($lot_issue_typ, mcframe.commonMA.meta.MA_META.LOT_ISSUE_TYP);
	public static final MCMeta lot_issue_typ_nm_META = createCommonMeta($lot_issue_typ_nm, mcframe.commonMA.meta.MA_META.LOT_ISSUE_TYP_NM);
	public static final MCMeta bkf_flg_META = createCommonMeta($bkf_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta ln_stk_flg_META = createCommonMeta($ln_stk_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta pre_po_tgt_flg_META = createCommonMeta($pre_po_tgt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta inst_rec_issue_flg_META = createCommonMeta($inst_rec_issue_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta no_mfg_aprv_flg_META = createCommonMeta($no_mfg_aprv_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta itm_lower_yield_META = createCommonMeta($itm_lower_yield, mcframe.commonMA.meta.MA_META.YIELD);
	public static final MCMeta itm_std_yield_META = createCommonMeta($itm_std_yield, mcframe.commonMA.meta.MA_META.YIELD);
	public static final MCMeta itm_upper_yield_META = createCommonMeta($itm_upper_yield, mcframe.commonMA.meta.MA_META.YIELD);
	public static final MCMeta purc_id_typ_META = createCommonMeta($purc_id_typ, mcframe.commonMA.meta.MA_META.PURC_ID_TYP);
	public static final MCMeta purc_id_typ_nm_META = createCommonMeta($purc_id_typ_nm, mcframe.commonMA.meta.MA_META.PURC_ID_TYP_NM);
	public static final MCMeta rqst_wg_cd_META = createCommonMeta($rqst_wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta rqst_wg_nm_META = createCommonMeta($rqst_wg_nm, mcframe.commonMA.meta.MA_META.WG_NM);
	public static final MCMeta po_batch_flg_META = createCommonMeta($po_batch_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta rsrc_cd1_META = createCommonMeta($rsrc_cd1, mcframe.commonMA.meta.MA_META.RSRC_CD);
	public static final MCMeta rsrc_nm1_META = createCommonMeta($rsrc_nm1, mcframe.commonMA.meta.MA_META.RSRC_NM);
	public static final MCMeta rsrc_std_qty1_META = createCommonMeta($rsrc_std_qty1, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta rsrc_unit_qty1_p_META = createInnerRowMeta($rsrc_unit_qty1_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta rsrc_cd2_META = createCommonMeta($rsrc_cd2, mcframe.commonMA.meta.MA_META.RSRC_CD);
	public static final MCMeta rsrc_nm2_META = createCommonMeta($rsrc_nm2, mcframe.commonMA.meta.MA_META.RSRC_NM);
	public static final MCMeta rsrc_std_qty2_META = createCommonMeta($rsrc_std_qty2, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta rsrc_unit_qty2_p_META = createInnerRowMeta($rsrc_unit_qty2_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta sno_p_META = createInnerRowMeta($sno_p, mcframe.clientMAUB.MAUBP5070.SnoR.class);
	public static final MCMeta not_mrp_flg_META = createCommonMeta($not_mrp_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta cost_ratio_META = createCommonMeta($cost_ratio, mcframe.commonMA.meta.MA_META.COST_RATIO);
	public static final MCMeta memo1_META = createCommonMeta($memo1, mcframe.commonMA.meta.MA_META.MST_MEMO1);
	public static final MCMeta memo2_META = createCommonMeta($memo2, mcframe.commonMA.meta.MA_META.MST_MEMO2);
	public static final MCMeta memo3_META = createCommonMeta($memo3, mcframe.commonMA.meta.MA_META.MST_MEMO3);
	public static final MCMeta ins_usr_id_META = createCommonMeta($ins_usr_id, mcframe.commonMA.meta.MA_META.FCM_USR_ID);
	public static final MCMeta ins_usr_nm_META = createCommonMeta($ins_usr_nm, mcframe.commonMA.meta.MA_META.FCM_USR_NM);
	public static final MCMeta ins_ts_META = createCommonMeta($ins_ts, mcframe.commonMA.meta.MA_META.SYS_TS);
	public static final MCMeta ins_func_id_META = createCommonMeta($ins_func_id, mcframe.commonMA.meta.MA_META.FUNC_ID);
	public static final MCMeta ins_func_nm_META = createCommonMeta($ins_func_nm, mcframe.commonMA.meta.MA_META.FUNC_NM);
	public static final MCMeta upd_cntr_META = createCommonMeta($upd_cntr, mcframe.commonMA.meta.MA_META.UPD_CNT);
	public static final MCMeta upd_usr_id_META = createCommonMeta($upd_usr_id, mcframe.commonMA.meta.MA_META.FCM_USR_ID);
	public static final MCMeta upd_usr_nm_META = createCommonMeta($upd_usr_nm, mcframe.commonMA.meta.MA_META.FCM_USR_NM);
	public static final MCMeta upd_ts_META = createCommonMeta($upd_ts, mcframe.commonMA.meta.MA_META.SYS_TS);
	public static final MCMeta upd_func_id_META = createCommonMeta($upd_func_id, mcframe.commonMA.meta.MA_META.FUNC_ID);
	public static final MCMeta upd_func_nm_META = createCommonMeta($upd_func_nm, mcframe.commonMA.meta.MA_META.FUNC_NM);
	public static final MCMeta upd_srv_req_no_META = createCommonMeta($upd_srv_req_no, mcframe.commonMA.meta.MA_META.SRV_REQ_NO);
	public static final MCMeta del_usr_id_META = createCommonMeta($del_usr_id, mcframe.commonMA.meta.MA_META.FCM_USR_ID);
	public static final MCMeta del_usr_nm_META = createCommonMeta($del_usr_nm, mcframe.commonMA.meta.MA_META.FCM_USR_NM);
	public static final MCMeta del_ts_META = createCommonMeta($del_ts, mcframe.commonMA.meta.MA_META.SYS_TS);

	protected static final ConstMetaList<Wrk1DtlR> constMetas = new ConstMetaList<Wrk1DtlR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			check_META,
			del_flg_META,
			itm_p_META,
			wg_cd_META,
			wg_nm_META,
			mfg_loc_cd_META,
			mfg_loc_nm_META,
			loc_sppl_cd_META,
			bom_ptn_META,
			dt_p_META,
			oper_ptn_META,
			mfg_lt_META,
			mfg_lt_add_qty_p_META,
			purc_lt_META,
			purc_lt_add_qty_p_META,
			purc_basis_typ_META,
			purc_basis_typ_nm_META,
			accpt_insp_lt_META,
			buf_lt_META,
			ord_fix_pd_META,
			sz_day_week_typ_META,
			sz_day_week_typ_nm_META,
			sz_week_META,
			lot_sz_pd_META,
			min_lot_qty_p_META,
			batch_lot_qty_p_META,
			max_lot_qty_p_META,
			max_order_META,
			prio_META,
			order_ratio_META,
			yield_schd_qty_p_META,
			mfg_inst_qty_p_META,
			fxd_rqmt_qty_p_META,
			lot_issue_typ_META,
			lot_issue_typ_nm_META,
			bkf_flg_META,
			ln_stk_flg_META,
			pre_po_tgt_flg_META,
			inst_rec_issue_flg_META,
			no_mfg_aprv_flg_META,
			itm_lower_yield_META,
			itm_std_yield_META,
			itm_upper_yield_META,
			purc_id_typ_META,
			purc_id_typ_nm_META,
			rqst_wg_cd_META,
			rqst_wg_nm_META,
			po_batch_flg_META,
			rsrc_cd1_META,
			rsrc_nm1_META,
			rsrc_std_qty1_META,
			rsrc_unit_qty1_p_META,
			rsrc_cd2_META,
			rsrc_nm2_META,
			rsrc_std_qty2_META,
			rsrc_unit_qty2_p_META,
			sno_p_META,
			not_mrp_flg_META,
			cost_ratio_META,
			memo1_META,
			memo2_META,
			memo3_META,
			ins_usr_id_META,
			ins_usr_nm_META,
			ins_ts_META,
			ins_func_id_META,
			ins_func_nm_META,
			upd_cntr_META,
			upd_usr_id_META,
			upd_usr_nm_META,
			upd_ts_META,
			upd_func_id_META,
			upd_func_nm_META,
			upd_srv_req_no_META,
			del_usr_id_META,
			del_usr_nm_META,
			del_ts_META
		},
		new String[][]{
			{
				"itm_cd",
				"itm_sub1",
				"itm_sub2",
				"itm_sub3",
				"st_dt_key",
				"st_dt",
				"end_dt",
				"mfg_lt_add_qty",
				"purc_lt_add_qty",
				"min_lot_qty",
				"batch_lot_qty",
				"max_lot_qty",
				"yield_schd_qty",
				"mfg_inst_qty",
				"fxd_rqmt_qty",
				"rsrc_unit_qty1",
				"rsrc_unit_qty2",
				"sno1",
				"sno2",
				"sno3",
				"sno4"
			},
			{
				$itm_cd,
				$itm_sub1,
				$itm_sub2,
				$itm_sub3,
				$st_dt_key,
				$st_dt,
				$end_dt,
				$mfg_lt_add_qty,
				$purc_lt_add_qty,
				$min_lot_qty,
				$batch_lot_qty,
				$max_lot_qty,
				$yield_schd_qty,
				$mfg_inst_qty,
				$fxd_rqmt_qty,
				$rsrc_unit_qty1,
				$rsrc_unit_qty2,
				$sno1,
				$sno2,
				$sno3,
				$sno4
			}
		}
	);

	/**
	 * "KEYS"グループのキー項目情報です。
	 */
	protected static final MCKeyList KEYS = new MCKeyList(
		null,
		new String[]{
			$itm_p + ".itm_cd",	// itm_p.itm_cd
			$itm_p + ".itm_sub1",	// itm_p.itm_sub1
			$itm_p + ".itm_sub2",	// itm_p.itm_sub2
			$itm_p + ".itm_sub3",	// itm_p.itm_sub3
			$wg_cd,	// wg_cd
			$mfg_loc_cd,	// mfg_loc_cd
			$bom_ptn,	// bom_ptn
			$dt_p + ".st_dt"	// dt_p.st_dt
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
				{$mfg_loc_cd, "loc_nm;sppl_cd;rsrc_cd1;rsrc_cd2"},	// mfg_loc_cd
				{$sz_day_week_typ, "day_week_typ_nm"},	// sz_day_week_typ
				{$rqst_wg_cd, "wg_nm"},	// rqst_wg_cd
				{$rsrc_cd1, "rsrc_nm"},	// rsrc_cd1
				{$rsrc_cd2, "rsrc_nm"}	// rsrc_cd2
			}
		)),
		new MCExtMap.Entry($$LIST_IN, new MCExtList(
			new String[][]{
				{$wg_cd, "true"},	// wg_cd
				{$mfg_loc_cd, "MAC_LOC_IS_SRCH_TYP.MFG_WG_ALL;wg_cd"}	// mfg_loc_cd
			}
		)),
		new MCExtMap.Entry($$LIST_IN_BASE, new MCExtList(
			new String[][]{
				{$wg_cd, "wr_flg"},	// wg_cd
				{$mfg_loc_cd, "loc_is_srch_typ;wg_cd"}	// mfg_loc_cd
			}
		)),
		new MCExtMap.Entry($$DISP_CTL, new MCExtList(
			new String[][]{
				{$wg_cd, "WG"},	// wg_cd
				{$wg_nm, "WG"},	// wg_nm
				{$ln_stk_flg, "STR_LN"},	// ln_stk_flg
				{$no_mfg_aprv_flg, "MFG_APRV"},	// no_mfg_aprv_flg
				{$itm_lower_yield, "YIELD"},	// itm_lower_yield
				{$itm_std_yield, "YIELD"},	// itm_std_yield
				{$itm_upper_yield, "YIELD"},	// itm_upper_yield
				{$rqst_wg_cd, "WG"},	// rqst_wg_cd
				{$rqst_wg_nm, "WG"}	// rqst_wg_nm
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
	protected Wrk1DtlR_MC_A(ConstMetaList<? extends Wrk1DtlR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Wrk1DtlR clone() {
		return (Wrk1DtlR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Wrk1DtlR createInstance() {
		return (Wrk1DtlR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Wrk1DtlR getValues(String... names) {
		return (Wrk1DtlR) super.getValues(names);
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


	/**
	 * Logical delete 論理削除.<p>
	 *
	 */
	public boolean del_flg() {
		return getConstBoolean(offset + 1, $del_flg);
	}

	/**
	 * Logical delete 論理削除.<p>
	 *
	 */
	public void del_flg(boolean value) {
		setConstBoolean(offset + 1, $del_flg, value);
	}


	public mcframe.clientMAUB.MAUBP5030.ItmR itm_p(){
		return (mcframe.clientMAUB.MAUBP5030.ItmR) getConstInnerRow(offset + 2, $itm_p);
	}
	
	public void itm_p(mcframe.clientMAUB.MAUBP5030.ItmR row){
		setConstInnerRow(offset + 2, $itm_p, row);
	}


	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public String wg_cd() {
		return getConstString(offset + 3, $wg_cd);
	}

	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public void wg_cd(String value) {
		setConstString(offset + 3, $wg_cd, value);
	}


	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public String wg_nm() {
		return getConstString(offset + 4, $wg_nm);
	}

	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public void wg_nm(String value) {
		setConstString(offset + 4, $wg_nm, value);
	}


	/**
	 * Mfg. location cd. 製造場所ＣＤ.<p>
	 *
	 */
	public String mfg_loc_cd() {
		return getConstString(offset + 5, $mfg_loc_cd);
	}

	/**
	 * Mfg. location cd. 製造場所ＣＤ.<p>
	 *
	 */
	public void mfg_loc_cd(String value) {
		setConstString(offset + 5, $mfg_loc_cd, value);
	}


	/**
	 * Mfg. location name 製造場所名.<p>
	 *
	 */
	public String mfg_loc_nm() {
		return getConstString(offset + 6, $mfg_loc_nm);
	}

	/**
	 * Mfg. location name 製造場所名.<p>
	 *
	 */
	public void mfg_loc_nm(String value) {
		setConstString(offset + 6, $mfg_loc_nm, value);
	}


	/**
	 * Mfg. location supplier 製造場所発注先.<p>
	 *
	 */
	public String loc_sppl_cd() {
		return getConstString(offset + 7, $loc_sppl_cd);
	}

	/**
	 * Mfg. location supplier 製造場所発注先.<p>
	 *
	 */
	public void loc_sppl_cd(String value) {
		setConstString(offset + 7, $loc_sppl_cd, value);
	}


	/**
	 * BOM pattern 構成パタン.<p>
	 *
	 */
	public String bom_ptn() {
		return getConstString(offset + 8, $bom_ptn);
	}

	/**
	 * BOM pattern 構成パタン.<p>
	 *
	 */
	public void bom_ptn(String value) {
		setConstString(offset + 8, $bom_ptn, value);
	}


	public mcframe.clientMAUB.MAUBP5010.DtR dt_p(){
		return (mcframe.clientMAUB.MAUBP5010.DtR) getConstInnerRow(offset + 9, $dt_p);
	}
	
	public void dt_p(mcframe.clientMAUB.MAUBP5010.DtR row){
		setConstInnerRow(offset + 9, $dt_p, row);
	}


	/**
	 * Operation pattern 工程パタン.<p>
	 *
	 */
	public String oper_ptn() {
		return getConstString(offset + 10, $oper_ptn);
	}

	/**
	 * Operation pattern 工程パタン.<p>
	 *
	 */
	public void oper_ptn(String value) {
		setConstString(offset + 10, $oper_ptn, value);
	}


	/**
	 * Mfg. LT 製造ＬＴ.<p>
	 *
	 */
	public MCNumber mfg_lt() {
		return getConstNumber(offset + 11, $mfg_lt);
	}

	/**
	 * Mfg. LT 製造ＬＴ.<p>
	 *
	 */
	public void mfg_lt(MCNumber value) {
		setConstNumber(offset + 11, $mfg_lt, value);
	}

	/**
	 * Mfg. LT 製造ＬＴ.<p>
	 *
	 */
	public void mfg_lt(int value) {
		setConstNumber(offset + 11, $mfg_lt, value);
	}

	/**
	 * Mfg. LT 製造ＬＴ.<p>
	 *
	 */
	public void mfg_lt(long value) {
		setConstNumber(offset + 11, $mfg_lt, value);
	}

	/**
	 * Mfg. LT 製造ＬＴ.<p>
	 *
	 */
	public void mfg_lt(float value) {
		setConstNumber(offset + 11, $mfg_lt, value);
	}

	/**
	 * Mfg. LT 製造ＬＴ.<p>
	 *
	 */
	public void mfg_lt(double value) {
		setConstNumber(offset + 11, $mfg_lt, value);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR mfg_lt_add_qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 12, $mfg_lt_add_qty_p);
	}
	
	public void mfg_lt_add_qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 12, $mfg_lt_add_qty_p, row);
	}


	/**
	 * Purchase LT 購入ＬＴ.<p>
	 *
	 */
	public MCNumber purc_lt() {
		return getConstNumber(offset + 13, $purc_lt);
	}

	/**
	 * Purchase LT 購入ＬＴ.<p>
	 *
	 */
	public void purc_lt(MCNumber value) {
		setConstNumber(offset + 13, $purc_lt, value);
	}

	/**
	 * Purchase LT 購入ＬＴ.<p>
	 *
	 */
	public void purc_lt(int value) {
		setConstNumber(offset + 13, $purc_lt, value);
	}

	/**
	 * Purchase LT 購入ＬＴ.<p>
	 *
	 */
	public void purc_lt(long value) {
		setConstNumber(offset + 13, $purc_lt, value);
	}

	/**
	 * Purchase LT 購入ＬＴ.<p>
	 *
	 */
	public void purc_lt(float value) {
		setConstNumber(offset + 13, $purc_lt, value);
	}

	/**
	 * Purchase LT 購入ＬＴ.<p>
	 *
	 */
	public void purc_lt(double value) {
		setConstNumber(offset + 13, $purc_lt, value);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR purc_lt_add_qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 14, $purc_lt_add_qty_p);
	}
	
	public void purc_lt_add_qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 14, $purc_lt_add_qty_p, row);
	}


	/**
	 * Purchase recording type 仕入計上区分.<p>
	 *
	 */
	public String purc_basis_typ() {
		return getConstString(offset + 15, $purc_basis_typ);
	}

	/**
	 * Purchase recording type 仕入計上区分.<p>
	 *
	 */
	public void purc_basis_typ(String value) {
		setConstString(offset + 15, $purc_basis_typ, value);
	}


	/**
	 * Purchase recording type name 仕入計上区分名.<p>
	 *
	 */
	public String purc_basis_typ_nm() {
		return getConstString(offset + 16, $purc_basis_typ_nm);
	}

	/**
	 * Purchase recording type name 仕入計上区分名.<p>
	 *
	 */
	public void purc_basis_typ_nm(String value) {
		setConstString(offset + 16, $purc_basis_typ_nm, value);
	}


	/**
	 * Acceptance LT 検収ＬＴ.<p>
	 *
	 */
	public MCNumber accpt_insp_lt() {
		return getConstNumber(offset + 17, $accpt_insp_lt);
	}

	/**
	 * Acceptance LT 検収ＬＴ.<p>
	 *
	 */
	public void accpt_insp_lt(MCNumber value) {
		setConstNumber(offset + 17, $accpt_insp_lt, value);
	}

	/**
	 * Acceptance LT 検収ＬＴ.<p>
	 *
	 */
	public void accpt_insp_lt(int value) {
		setConstNumber(offset + 17, $accpt_insp_lt, value);
	}

	/**
	 * Acceptance LT 検収ＬＴ.<p>
	 *
	 */
	public void accpt_insp_lt(long value) {
		setConstNumber(offset + 17, $accpt_insp_lt, value);
	}

	/**
	 * Acceptance LT 検収ＬＴ.<p>
	 *
	 */
	public void accpt_insp_lt(float value) {
		setConstNumber(offset + 17, $accpt_insp_lt, value);
	}

	/**
	 * Acceptance LT 検収ＬＴ.<p>
	 *
	 */
	public void accpt_insp_lt(double value) {
		setConstNumber(offset + 17, $accpt_insp_lt, value);
	}


	/**
	 * Safety LT 安全ＬＴ.<p>
	 *
	 */
	public MCNumber buf_lt() {
		return getConstNumber(offset + 18, $buf_lt);
	}

	/**
	 * Safety LT 安全ＬＴ.<p>
	 *
	 */
	public void buf_lt(MCNumber value) {
		setConstNumber(offset + 18, $buf_lt, value);
	}

	/**
	 * Safety LT 安全ＬＴ.<p>
	 *
	 */
	public void buf_lt(int value) {
		setConstNumber(offset + 18, $buf_lt, value);
	}

	/**
	 * Safety LT 安全ＬＴ.<p>
	 *
	 */
	public void buf_lt(long value) {
		setConstNumber(offset + 18, $buf_lt, value);
	}

	/**
	 * Safety LT 安全ＬＴ.<p>
	 *
	 */
	public void buf_lt(float value) {
		setConstNumber(offset + 18, $buf_lt, value);
	}

	/**
	 * Safety LT 安全ＬＴ.<p>
	 *
	 */
	public void buf_lt(double value) {
		setConstNumber(offset + 18, $buf_lt, value);
	}


	/**
	 * Order auto-firming period (Date) オーダ自動確定期間（日）.<p>
	 *
	 */
	public MCNumber ord_fix_pd() {
		return getConstNumber(offset + 19, $ord_fix_pd);
	}

	/**
	 * Order auto-firming period (Date) オーダ自動確定期間（日）.<p>
	 *
	 */
	public void ord_fix_pd(MCNumber value) {
		setConstNumber(offset + 19, $ord_fix_pd, value);
	}

	/**
	 * Order auto-firming period (Date) オーダ自動確定期間（日）.<p>
	 *
	 */
	public void ord_fix_pd(int value) {
		setConstNumber(offset + 19, $ord_fix_pd, value);
	}

	/**
	 * Order auto-firming period (Date) オーダ自動確定期間（日）.<p>
	 *
	 */
	public void ord_fix_pd(long value) {
		setConstNumber(offset + 19, $ord_fix_pd, value);
	}

	/**
	 * Order auto-firming period (Date) オーダ自動確定期間（日）.<p>
	 *
	 */
	public void ord_fix_pd(float value) {
		setConstNumber(offset + 19, $ord_fix_pd, value);
	}

	/**
	 * Order auto-firming period (Date) オーダ自動確定期間（日）.<p>
	 *
	 */
	public void ord_fix_pd(double value) {
		setConstNumber(offset + 19, $ord_fix_pd, value);
	}


	/**
	 * Aggregation (by day of week) type 曜日まとめ区分.<p>
	 *
	 */
	public String sz_day_week_typ() {
		return getConstString(offset + 20, $sz_day_week_typ);
	}

	/**
	 * Aggregation (by day of week) type 曜日まとめ区分.<p>
	 *
	 */
	public void sz_day_week_typ(String value) {
		setConstString(offset + 20, $sz_day_week_typ, value);
	}


	/**
	 * Aggregation (by day of week) type name 曜日まとめ区分名.<p>
	 *
	 */
	public String sz_day_week_typ_nm() {
		return getConstString(offset + 21, $sz_day_week_typ_nm);
	}

	/**
	 * Aggregation (by day of week) type name 曜日まとめ区分名.<p>
	 *
	 */
	public void sz_day_week_typ_nm(String value) {
		setConstString(offset + 21, $sz_day_week_typ_nm, value);
	}


	/**
	 * Aggregation (by day of week) period (Week) 曜日まとめ期間（週）.<p>
	 *
	 */
	public MCNumber sz_week() {
		return getConstNumber(offset + 22, $sz_week);
	}

	/**
	 * Aggregation (by day of week) period (Week) 曜日まとめ期間（週）.<p>
	 *
	 */
	public void sz_week(MCNumber value) {
		setConstNumber(offset + 22, $sz_week, value);
	}

	/**
	 * Aggregation (by day of week) period (Week) 曜日まとめ期間（週）.<p>
	 *
	 */
	public void sz_week(int value) {
		setConstNumber(offset + 22, $sz_week, value);
	}

	/**
	 * Aggregation (by day of week) period (Week) 曜日まとめ期間（週）.<p>
	 *
	 */
	public void sz_week(long value) {
		setConstNumber(offset + 22, $sz_week, value);
	}

	/**
	 * Aggregation (by day of week) period (Week) 曜日まとめ期間（週）.<p>
	 *
	 */
	public void sz_week(float value) {
		setConstNumber(offset + 22, $sz_week, value);
	}

	/**
	 * Aggregation (by day of week) period (Week) 曜日まとめ期間（週）.<p>
	 *
	 */
	public void sz_week(double value) {
		setConstNumber(offset + 22, $sz_week, value);
	}


	/**
	 * Lot sizing period (Days) ロットまとめ期間（日）.<p>
	 *
	 */
	public MCNumber lot_sz_pd() {
		return getConstNumber(offset + 23, $lot_sz_pd);
	}

	/**
	 * Lot sizing period (Days) ロットまとめ期間（日）.<p>
	 *
	 */
	public void lot_sz_pd(MCNumber value) {
		setConstNumber(offset + 23, $lot_sz_pd, value);
	}

	/**
	 * Lot sizing period (Days) ロットまとめ期間（日）.<p>
	 *
	 */
	public void lot_sz_pd(int value) {
		setConstNumber(offset + 23, $lot_sz_pd, value);
	}

	/**
	 * Lot sizing period (Days) ロットまとめ期間（日）.<p>
	 *
	 */
	public void lot_sz_pd(long value) {
		setConstNumber(offset + 23, $lot_sz_pd, value);
	}

	/**
	 * Lot sizing period (Days) ロットまとめ期間（日）.<p>
	 *
	 */
	public void lot_sz_pd(float value) {
		setConstNumber(offset + 23, $lot_sz_pd, value);
	}

	/**
	 * Lot sizing period (Days) ロットまとめ期間（日）.<p>
	 *
	 */
	public void lot_sz_pd(double value) {
		setConstNumber(offset + 23, $lot_sz_pd, value);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR min_lot_qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 24, $min_lot_qty_p);
	}
	
	public void min_lot_qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 24, $min_lot_qty_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR batch_lot_qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 25, $batch_lot_qty_p);
	}
	
	public void batch_lot_qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 25, $batch_lot_qty_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR max_lot_qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 26, $max_lot_qty_p);
	}
	
	public void max_lot_qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 26, $max_lot_qty_p, row);
	}


	/**
	 * Number of max. order 最大オーダ件数.<p>
	 *
	 */
	public MCNumber max_order() {
		return getConstNumber(offset + 27, $max_order);
	}

	/**
	 * Number of max. order 最大オーダ件数.<p>
	 *
	 */
	public void max_order(MCNumber value) {
		setConstNumber(offset + 27, $max_order, value);
	}

	/**
	 * Number of max. order 最大オーダ件数.<p>
	 *
	 */
	public void max_order(int value) {
		setConstNumber(offset + 27, $max_order, value);
	}

	/**
	 * Number of max. order 最大オーダ件数.<p>
	 *
	 */
	public void max_order(long value) {
		setConstNumber(offset + 27, $max_order, value);
	}

	/**
	 * Number of max. order 最大オーダ件数.<p>
	 *
	 */
	public void max_order(float value) {
		setConstNumber(offset + 27, $max_order, value);
	}

	/**
	 * Number of max. order 最大オーダ件数.<p>
	 *
	 */
	public void max_order(double value) {
		setConstNumber(offset + 27, $max_order, value);
	}


	/**
	 * Priority 優先順.<p>
	 *
	 */
	public MCNumber prio() {
		return getConstNumber(offset + 28, $prio);
	}

	/**
	 * Priority 優先順.<p>
	 *
	 */
	public void prio(MCNumber value) {
		setConstNumber(offset + 28, $prio, value);
	}

	/**
	 * Priority 優先順.<p>
	 *
	 */
	public void prio(int value) {
		setConstNumber(offset + 28, $prio, value);
	}

	/**
	 * Priority 優先順.<p>
	 *
	 */
	public void prio(long value) {
		setConstNumber(offset + 28, $prio, value);
	}

	/**
	 * Priority 優先順.<p>
	 *
	 */
	public void prio(float value) {
		setConstNumber(offset + 28, $prio, value);
	}

	/**
	 * Priority 優先順.<p>
	 *
	 */
	public void prio(double value) {
		setConstNumber(offset + 28, $prio, value);
	}


	/**
	 * Order ratio オーダ比率.<p>
	 *
	 */
	public MCNumber order_ratio() {
		return getConstNumber(offset + 29, $order_ratio);
	}

	/**
	 * Order ratio オーダ比率.<p>
	 *
	 */
	public void order_ratio(MCNumber value) {
		setConstNumber(offset + 29, $order_ratio, value);
	}

	/**
	 * Order ratio オーダ比率.<p>
	 *
	 */
	public void order_ratio(int value) {
		setConstNumber(offset + 29, $order_ratio, value);
	}

	/**
	 * Order ratio オーダ比率.<p>
	 *
	 */
	public void order_ratio(long value) {
		setConstNumber(offset + 29, $order_ratio, value);
	}

	/**
	 * Order ratio オーダ比率.<p>
	 *
	 */
	public void order_ratio(float value) {
		setConstNumber(offset + 29, $order_ratio, value);
	}

	/**
	 * Order ratio オーダ比率.<p>
	 *
	 */
	public void order_ratio(double value) {
		setConstNumber(offset + 29, $order_ratio, value);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR yield_schd_qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 30, $yield_schd_qty_p);
	}
	
	public void yield_schd_qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 30, $yield_schd_qty_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR mfg_inst_qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 31, $mfg_inst_qty_p);
	}
	
	public void mfg_inst_qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 31, $mfg_inst_qty_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR fxd_rqmt_qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 32, $fxd_rqmt_qty_p);
	}
	
	public void fxd_rqmt_qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 32, $fxd_rqmt_qty_p, row);
	}


	/**
	 * Lot numbering timing type ロット発番タイミング区分.<p>
	 *
	 */
	public String lot_issue_typ() {
		return getConstString(offset + 33, $lot_issue_typ);
	}

	/**
	 * Lot numbering timing type ロット発番タイミング区分.<p>
	 *
	 */
	public void lot_issue_typ(String value) {
		setConstString(offset + 33, $lot_issue_typ, value);
	}


	/**
	 * Lot numbering timing type name ロット発番タイミング区分名.<p>
	 *
	 */
	public String lot_issue_typ_nm() {
		return getConstString(offset + 34, $lot_issue_typ_nm);
	}

	/**
	 * Lot numbering timing type name ロット発番タイミング区分名.<p>
	 *
	 */
	public void lot_issue_typ_nm(String value) {
		setConstString(offset + 34, $lot_issue_typ_nm, value);
	}


	/**
	 * Allow backflush バックフラッシュ許可.<p>
	 *
	 */
	public boolean bkf_flg() {
		return getConstBoolean(offset + 35, $bkf_flg);
	}

	/**
	 * Allow backflush バックフラッシュ許可.<p>
	 *
	 */
	public void bkf_flg(boolean value) {
		setConstBoolean(offset + 35, $bkf_flg, value);
	}


	/**
	 * Rack/Line storage 棚・ライン格納.<p>
	 *
	 */
	public boolean ln_stk_flg() {
		return getConstBoolean(offset + 36, $ln_stk_flg);
	}

	/**
	 * Rack/Line storage 棚・ライン格納.<p>
	 *
	 */
	public void ln_stk_flg(boolean value) {
		setConstBoolean(offset + 36, $ln_stk_flg, value);
	}


	/**
	 * For long LT 先行手配対象.<p>
	 *
	 */
	public boolean pre_po_tgt_flg() {
		return getConstBoolean(offset + 37, $pre_po_tgt_flg);
	}

	/**
	 * For long LT 先行手配対象.<p>
	 *
	 */
	public void pre_po_tgt_flg(boolean value) {
		setConstBoolean(offset + 37, $pre_po_tgt_flg, value);
	}


	/**
	 * Issue record sheet at mfg. order 製造指図時記録書発行.<p>
	 *
	 */
	public boolean inst_rec_issue_flg() {
		return getConstBoolean(offset + 38, $inst_rec_issue_flg);
	}

	/**
	 * Issue record sheet at mfg. order 製造指図時記録書発行.<p>
	 *
	 */
	public void inst_rec_issue_flg(boolean value) {
		setConstBoolean(offset + 38, $inst_rec_issue_flg, value);
	}


	/**
	 * Not for mfg. approval 製造承認対象外.<p>
	 *
	 */
	public boolean no_mfg_aprv_flg() {
		return getConstBoolean(offset + 39, $no_mfg_aprv_flg);
	}

	/**
	 * Not for mfg. approval 製造承認対象外.<p>
	 *
	 */
	public void no_mfg_aprv_flg(boolean value) {
		setConstBoolean(offset + 39, $no_mfg_aprv_flg, value);
	}


	/**
	 * Item min. yield 品目下限収率.<p>
	 *
	 */
	public MCNumber itm_lower_yield() {
		return getConstNumber(offset + 40, $itm_lower_yield);
	}

	/**
	 * Item min. yield 品目下限収率.<p>
	 *
	 */
	public void itm_lower_yield(MCNumber value) {
		setConstNumber(offset + 40, $itm_lower_yield, value);
	}

	/**
	 * Item min. yield 品目下限収率.<p>
	 *
	 */
	public void itm_lower_yield(int value) {
		setConstNumber(offset + 40, $itm_lower_yield, value);
	}

	/**
	 * Item min. yield 品目下限収率.<p>
	 *
	 */
	public void itm_lower_yield(long value) {
		setConstNumber(offset + 40, $itm_lower_yield, value);
	}

	/**
	 * Item min. yield 品目下限収率.<p>
	 *
	 */
	public void itm_lower_yield(float value) {
		setConstNumber(offset + 40, $itm_lower_yield, value);
	}

	/**
	 * Item min. yield 品目下限収率.<p>
	 *
	 */
	public void itm_lower_yield(double value) {
		setConstNumber(offset + 40, $itm_lower_yield, value);
	}


	/**
	 * Item standard yield 品目標準収率.<p>
	 *
	 */
	public MCNumber itm_std_yield() {
		return getConstNumber(offset + 41, $itm_std_yield);
	}

	/**
	 * Item standard yield 品目標準収率.<p>
	 *
	 */
	public void itm_std_yield(MCNumber value) {
		setConstNumber(offset + 41, $itm_std_yield, value);
	}

	/**
	 * Item standard yield 品目標準収率.<p>
	 *
	 */
	public void itm_std_yield(int value) {
		setConstNumber(offset + 41, $itm_std_yield, value);
	}

	/**
	 * Item standard yield 品目標準収率.<p>
	 *
	 */
	public void itm_std_yield(long value) {
		setConstNumber(offset + 41, $itm_std_yield, value);
	}

	/**
	 * Item standard yield 品目標準収率.<p>
	 *
	 */
	public void itm_std_yield(float value) {
		setConstNumber(offset + 41, $itm_std_yield, value);
	}

	/**
	 * Item standard yield 品目標準収率.<p>
	 *
	 */
	public void itm_std_yield(double value) {
		setConstNumber(offset + 41, $itm_std_yield, value);
	}


	/**
	 * Item max. yield 品目上限収率.<p>
	 *
	 */
	public MCNumber itm_upper_yield() {
		return getConstNumber(offset + 42, $itm_upper_yield);
	}

	/**
	 * Item max. yield 品目上限収率.<p>
	 *
	 */
	public void itm_upper_yield(MCNumber value) {
		setConstNumber(offset + 42, $itm_upper_yield, value);
	}

	/**
	 * Item max. yield 品目上限収率.<p>
	 *
	 */
	public void itm_upper_yield(int value) {
		setConstNumber(offset + 42, $itm_upper_yield, value);
	}

	/**
	 * Item max. yield 品目上限収率.<p>
	 *
	 */
	public void itm_upper_yield(long value) {
		setConstNumber(offset + 42, $itm_upper_yield, value);
	}

	/**
	 * Item max. yield 品目上限収率.<p>
	 *
	 */
	public void itm_upper_yield(float value) {
		setConstNumber(offset + 42, $itm_upper_yield, value);
	}

	/**
	 * Item max. yield 品目上限収率.<p>
	 *
	 */
	public void itm_upper_yield(double value) {
		setConstNumber(offset + 42, $itm_upper_yield, value);
	}


	/**
	 * Purchase identification type 購買識別区分.<p>
	 *
	 */
	public String purc_id_typ() {
		return getConstString(offset + 43, $purc_id_typ);
	}

	/**
	 * Purchase identification type 購買識別区分.<p>
	 *
	 */
	public void purc_id_typ(String value) {
		setConstString(offset + 43, $purc_id_typ, value);
	}


	/**
	 * Purchase identification type name 購買識別区分名.<p>
	 *
	 */
	public String purc_id_typ_nm() {
		return getConstString(offset + 44, $purc_id_typ_nm);
	}

	/**
	 * Purchase identification type name 購買識別区分名.<p>
	 *
	 */
	public void purc_id_typ_nm(String value) {
		setConstString(offset + 44, $purc_id_typ_nm, value);
	}


	/**
	 * Purchase request destination WG cd. 購買依頼先ワーキンググループＣＤ.<p>
	 *
	 */
	public String rqst_wg_cd() {
		return getConstString(offset + 45, $rqst_wg_cd);
	}

	/**
	 * Purchase request destination WG cd. 購買依頼先ワーキンググループＣＤ.<p>
	 *
	 */
	public void rqst_wg_cd(String value) {
		setConstString(offset + 45, $rqst_wg_cd, value);
	}


	/**
	 * Purchase requested WG name 購買依頼先ワーキンググループ名.<p>
	 *
	 */
	public String rqst_wg_nm() {
		return getConstString(offset + 46, $rqst_wg_nm);
	}

	/**
	 * Purchase requested WG name 購買依頼先ワーキンググループ名.<p>
	 *
	 */
	public void rqst_wg_nm(String value) {
		setConstString(offset + 46, $rqst_wg_nm, value);
	}


	/**
	 * PO batch 発注バッチ.<p>
	 *
	 */
	public boolean po_batch_flg() {
		return getConstBoolean(offset + 47, $po_batch_flg);
	}

	/**
	 * PO batch 発注バッチ.<p>
	 *
	 */
	public void po_batch_flg(boolean value) {
		setConstBoolean(offset + 47, $po_batch_flg, value);
	}


	/**
	 * Resource cd. 1 資源ＣＤ１.<p>
	 *
	 */
	public String rsrc_cd1() {
		return getConstString(offset + 48, $rsrc_cd1);
	}

	/**
	 * Resource cd. 1 資源ＣＤ１.<p>
	 *
	 */
	public void rsrc_cd1(String value) {
		setConstString(offset + 48, $rsrc_cd1, value);
	}


	/**
	 * Resource name 1 資源名１.<p>
	 *
	 */
	public String rsrc_nm1() {
		return getConstString(offset + 49, $rsrc_nm1);
	}

	/**
	 * Resource name 1 資源名１.<p>
	 *
	 */
	public void rsrc_nm1(String value) {
		setConstString(offset + 49, $rsrc_nm1, value);
	}


	/**
	 * Resource standard value 1 資源標準値１.<p>
	 *
	 */
	public MCNumber rsrc_std_qty1() {
		return getConstNumber(offset + 50, $rsrc_std_qty1);
	}

	/**
	 * Resource standard value 1 資源標準値１.<p>
	 *
	 */
	public void rsrc_std_qty1(MCNumber value) {
		setConstNumber(offset + 50, $rsrc_std_qty1, value);
	}

	/**
	 * Resource standard value 1 資源標準値１.<p>
	 *
	 */
	public void rsrc_std_qty1(int value) {
		setConstNumber(offset + 50, $rsrc_std_qty1, value);
	}

	/**
	 * Resource standard value 1 資源標準値１.<p>
	 *
	 */
	public void rsrc_std_qty1(long value) {
		setConstNumber(offset + 50, $rsrc_std_qty1, value);
	}

	/**
	 * Resource standard value 1 資源標準値１.<p>
	 *
	 */
	public void rsrc_std_qty1(float value) {
		setConstNumber(offset + 50, $rsrc_std_qty1, value);
	}

	/**
	 * Resource standard value 1 資源標準値１.<p>
	 *
	 */
	public void rsrc_std_qty1(double value) {
		setConstNumber(offset + 50, $rsrc_std_qty1, value);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR rsrc_unit_qty1_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 51, $rsrc_unit_qty1_p);
	}
	
	public void rsrc_unit_qty1_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 51, $rsrc_unit_qty1_p, row);
	}


	/**
	 * Resource cd. 2 資源ＣＤ２.<p>
	 *
	 */
	public String rsrc_cd2() {
		return getConstString(offset + 52, $rsrc_cd2);
	}

	/**
	 * Resource cd. 2 資源ＣＤ２.<p>
	 *
	 */
	public void rsrc_cd2(String value) {
		setConstString(offset + 52, $rsrc_cd2, value);
	}


	/**
	 * Resource name 2 資源名２.<p>
	 *
	 */
	public String rsrc_nm2() {
		return getConstString(offset + 53, $rsrc_nm2);
	}

	/**
	 * Resource name 2 資源名２.<p>
	 *
	 */
	public void rsrc_nm2(String value) {
		setConstString(offset + 53, $rsrc_nm2, value);
	}


	/**
	 * Resource standard value 2 資源標準値２.<p>
	 *
	 */
	public MCNumber rsrc_std_qty2() {
		return getConstNumber(offset + 54, $rsrc_std_qty2);
	}

	/**
	 * Resource standard value 2 資源標準値２.<p>
	 *
	 */
	public void rsrc_std_qty2(MCNumber value) {
		setConstNumber(offset + 54, $rsrc_std_qty2, value);
	}

	/**
	 * Resource standard value 2 資源標準値２.<p>
	 *
	 */
	public void rsrc_std_qty2(int value) {
		setConstNumber(offset + 54, $rsrc_std_qty2, value);
	}

	/**
	 * Resource standard value 2 資源標準値２.<p>
	 *
	 */
	public void rsrc_std_qty2(long value) {
		setConstNumber(offset + 54, $rsrc_std_qty2, value);
	}

	/**
	 * Resource standard value 2 資源標準値２.<p>
	 *
	 */
	public void rsrc_std_qty2(float value) {
		setConstNumber(offset + 54, $rsrc_std_qty2, value);
	}

	/**
	 * Resource standard value 2 資源標準値２.<p>
	 *
	 */
	public void rsrc_std_qty2(double value) {
		setConstNumber(offset + 54, $rsrc_std_qty2, value);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR rsrc_unit_qty2_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 55, $rsrc_unit_qty2_p);
	}
	
	public void rsrc_unit_qty2_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 55, $rsrc_unit_qty2_p, row);
	}


	public mcframe.clientMAUB.MAUBP5070.SnoR sno_p(){
		return (mcframe.clientMAUB.MAUBP5070.SnoR) getConstInnerRow(offset + 56, $sno_p);
	}
	
	public void sno_p(mcframe.clientMAUB.MAUBP5070.SnoR row){
		setConstInnerRow(offset + 56, $sno_p, row);
	}


	/**
	 * Not for MRP ＭＲＰ対象外.<p>
	 *
	 */
	public boolean not_mrp_flg() {
		return getConstBoolean(offset + 57, $not_mrp_flg);
	}

	/**
	 * Not for MRP ＭＲＰ対象外.<p>
	 *
	 */
	public void not_mrp_flg(boolean value) {
		setConstBoolean(offset + 57, $not_mrp_flg, value);
	}


	/**
	 * Cost ratio 原価比率.<p>
	 *
	 */
	public MCNumber cost_ratio() {
		return getConstNumber(offset + 58, $cost_ratio);
	}

	/**
	 * Cost ratio 原価比率.<p>
	 *
	 */
	public void cost_ratio(MCNumber value) {
		setConstNumber(offset + 58, $cost_ratio, value);
	}

	/**
	 * Cost ratio 原価比率.<p>
	 *
	 */
	public void cost_ratio(int value) {
		setConstNumber(offset + 58, $cost_ratio, value);
	}

	/**
	 * Cost ratio 原価比率.<p>
	 *
	 */
	public void cost_ratio(long value) {
		setConstNumber(offset + 58, $cost_ratio, value);
	}

	/**
	 * Cost ratio 原価比率.<p>
	 *
	 */
	public void cost_ratio(float value) {
		setConstNumber(offset + 58, $cost_ratio, value);
	}

	/**
	 * Cost ratio 原価比率.<p>
	 *
	 */
	public void cost_ratio(double value) {
		setConstNumber(offset + 58, $cost_ratio, value);
	}


	/**
	 * Memo 1 メモ１.<p>
	 *
	 */
	public String memo1() {
		return getConstString(offset + 59, $memo1);
	}

	/**
	 * Memo 1 メモ１.<p>
	 *
	 */
	public void memo1(String value) {
		setConstString(offset + 59, $memo1, value);
	}


	/**
	 * Memo 2 メモ２.<p>
	 *
	 */
	public String memo2() {
		return getConstString(offset + 60, $memo2);
	}

	/**
	 * Memo 2 メモ２.<p>
	 *
	 */
	public void memo2(String value) {
		setConstString(offset + 60, $memo2, value);
	}


	/**
	 * Memo 3 メモ３.<p>
	 *
	 */
	public String memo3() {
		return getConstString(offset + 61, $memo3);
	}

	/**
	 * Memo 3 メモ３.<p>
	 *
	 */
	public void memo3(String value) {
		setConstString(offset + 61, $memo3, value);
	}


	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public String ins_usr_id() {
		return getConstString(offset + 62, $ins_usr_id);
	}

	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public void ins_usr_id(String value) {
		setConstString(offset + 62, $ins_usr_id, value);
	}


	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public String ins_usr_nm() {
		return getConstString(offset + 63, $ins_usr_nm);
	}

	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public void ins_usr_nm(String value) {
		setConstString(offset + 63, $ins_usr_nm, value);
	}


	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public MCTimestamp ins_ts() {
		return getConstTimestamp(offset + 64, $ins_ts);
	}

	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public void ins_ts(MCTimestamp value) {
		setConstTimestamp(offset + 64, $ins_ts, value);
	}


	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public String ins_func_id() {
		return getConstString(offset + 65, $ins_func_id);
	}

	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public void ins_func_id(String value) {
		setConstString(offset + 65, $ins_func_id, value);
	}


	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public String ins_func_nm() {
		return getConstString(offset + 66, $ins_func_nm);
	}

	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public void ins_func_nm(String value) {
		setConstString(offset + 66, $ins_func_nm, value);
	}


	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public MCNumber upd_cntr() {
		return getConstNumber(offset + 67, $upd_cntr);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(MCNumber value) {
		setConstNumber(offset + 67, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(int value) {
		setConstNumber(offset + 67, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(long value) {
		setConstNumber(offset + 67, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(float value) {
		setConstNumber(offset + 67, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(double value) {
		setConstNumber(offset + 67, $upd_cntr, value);
	}


	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public String upd_usr_id() {
		return getConstString(offset + 68, $upd_usr_id);
	}

	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public void upd_usr_id(String value) {
		setConstString(offset + 68, $upd_usr_id, value);
	}


	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public String upd_usr_nm() {
		return getConstString(offset + 69, $upd_usr_nm);
	}

	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public void upd_usr_nm(String value) {
		setConstString(offset + 69, $upd_usr_nm, value);
	}


	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public MCTimestamp upd_ts() {
		return getConstTimestamp(offset + 70, $upd_ts);
	}

	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public void upd_ts(MCTimestamp value) {
		setConstTimestamp(offset + 70, $upd_ts, value);
	}


	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public String upd_func_id() {
		return getConstString(offset + 71, $upd_func_id);
	}

	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public void upd_func_id(String value) {
		setConstString(offset + 71, $upd_func_id, value);
	}


	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public String upd_func_nm() {
		return getConstString(offset + 72, $upd_func_nm);
	}

	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public void upd_func_nm(String value) {
		setConstString(offset + 72, $upd_func_nm, value);
	}


	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public String upd_srv_req_no() {
		return getConstString(offset + 73, $upd_srv_req_no);
	}

	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public void upd_srv_req_no(String value) {
		setConstString(offset + 73, $upd_srv_req_no, value);
	}


	/**
	 * Logical delete user ID 論理削除ユーザＩＤ.<p>
	 *
	 */
	public String del_usr_id() {
		return getConstString(offset + 74, $del_usr_id);
	}

	/**
	 * Logical delete user ID 論理削除ユーザＩＤ.<p>
	 *
	 */
	public void del_usr_id(String value) {
		setConstString(offset + 74, $del_usr_id, value);
	}


	/**
	 * Logical delete user name 論理削除ユーザ名.<p>
	 *
	 */
	public String del_usr_nm() {
		return getConstString(offset + 75, $del_usr_nm);
	}

	/**
	 * Logical delete user name 論理削除ユーザ名.<p>
	 *
	 */
	public void del_usr_nm(String value) {
		setConstString(offset + 75, $del_usr_nm, value);
	}


	/**
	 * Logical delete date and time 論理削除日時.<p>
	 *
	 */
	public MCTimestamp del_ts() {
		return getConstTimestamp(offset + 76, $del_ts);
	}

	/**
	 * Logical delete date and time 論理削除日時.<p>
	 *
	 */
	public void del_ts(MCTimestamp value) {
		setConstTimestamp(offset + 76, $del_ts, value);
	}


	public String getString(String name) {
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			return wg_nm();
		}
		if ($mfg_loc_cd.equalsIgnoreCase(name)) {
			return mfg_loc_cd();
		}
		if ($mfg_loc_nm.equalsIgnoreCase(name)) {
			return mfg_loc_nm();
		}
		if ($loc_sppl_cd.equalsIgnoreCase(name)) {
			return loc_sppl_cd();
		}
		if ($bom_ptn.equalsIgnoreCase(name)) {
			return bom_ptn();
		}
		if ($oper_ptn.equalsIgnoreCase(name)) {
			return oper_ptn();
		}
		if ($purc_basis_typ.equalsIgnoreCase(name)) {
			return purc_basis_typ();
		}
		if ($purc_basis_typ_nm.equalsIgnoreCase(name)) {
			return purc_basis_typ_nm();
		}
		if ($sz_day_week_typ.equalsIgnoreCase(name)) {
			return sz_day_week_typ();
		}
		if ($sz_day_week_typ_nm.equalsIgnoreCase(name)) {
			return sz_day_week_typ_nm();
		}
		if ($lot_issue_typ.equalsIgnoreCase(name)) {
			return lot_issue_typ();
		}
		if ($lot_issue_typ_nm.equalsIgnoreCase(name)) {
			return lot_issue_typ_nm();
		}
		if ($purc_id_typ.equalsIgnoreCase(name)) {
			return purc_id_typ();
		}
		if ($purc_id_typ_nm.equalsIgnoreCase(name)) {
			return purc_id_typ_nm();
		}
		if ($rqst_wg_cd.equalsIgnoreCase(name)) {
			return rqst_wg_cd();
		}
		if ($rqst_wg_nm.equalsIgnoreCase(name)) {
			return rqst_wg_nm();
		}
		if ($rsrc_cd1.equalsIgnoreCase(name)) {
			return rsrc_cd1();
		}
		if ($rsrc_nm1.equalsIgnoreCase(name)) {
			return rsrc_nm1();
		}
		if ($rsrc_cd2.equalsIgnoreCase(name)) {
			return rsrc_cd2();
		}
		if ($rsrc_nm2.equalsIgnoreCase(name)) {
			return rsrc_nm2();
		}
		if ($memo1.equalsIgnoreCase(name)) {
			return memo1();
		}
		if ($memo2.equalsIgnoreCase(name)) {
			return memo2();
		}
		if ($memo3.equalsIgnoreCase(name)) {
			return memo3();
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
		if ($del_usr_id.equalsIgnoreCase(name)) {
			return del_usr_id();
		}
		if ($del_usr_nm.equalsIgnoreCase(name)) {
			return del_usr_nm();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($mfg_lt.equalsIgnoreCase(name)) {
			return mfg_lt();
		}
		if ($purc_lt.equalsIgnoreCase(name)) {
			return purc_lt();
		}
		if ($accpt_insp_lt.equalsIgnoreCase(name)) {
			return accpt_insp_lt();
		}
		if ($buf_lt.equalsIgnoreCase(name)) {
			return buf_lt();
		}
		if ($ord_fix_pd.equalsIgnoreCase(name)) {
			return ord_fix_pd();
		}
		if ($sz_week.equalsIgnoreCase(name)) {
			return sz_week();
		}
		if ($lot_sz_pd.equalsIgnoreCase(name)) {
			return lot_sz_pd();
		}
		if ($max_order.equalsIgnoreCase(name)) {
			return max_order();
		}
		if ($prio.equalsIgnoreCase(name)) {
			return prio();
		}
		if ($order_ratio.equalsIgnoreCase(name)) {
			return order_ratio();
		}
		if ($itm_lower_yield.equalsIgnoreCase(name)) {
			return itm_lower_yield();
		}
		if ($itm_std_yield.equalsIgnoreCase(name)) {
			return itm_std_yield();
		}
		if ($itm_upper_yield.equalsIgnoreCase(name)) {
			return itm_upper_yield();
		}
		if ($rsrc_std_qty1.equalsIgnoreCase(name)) {
			return rsrc_std_qty1();
		}
		if ($rsrc_std_qty2.equalsIgnoreCase(name)) {
			return rsrc_std_qty2();
		}
		if ($cost_ratio.equalsIgnoreCase(name)) {
			return cost_ratio();
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			return upd_cntr();
		}
		return super.getNumber(name);
	}
	public MCTimestamp getTimestamp(String name) {
		if ($ins_ts.equalsIgnoreCase(name)) {
			return ins_ts();
		}
		if ($upd_ts.equalsIgnoreCase(name)) {
			return upd_ts();
		}
		if ($del_ts.equalsIgnoreCase(name)) {
			return del_ts();
		}
		return super.getTimestamp(name);
	}
	public boolean getBoolean(String name) {
		if ($check.equalsIgnoreCase(name)) {
			return check();
		}
		if ($del_flg.equalsIgnoreCase(name)) {
			return del_flg();
		}
		if ($bkf_flg.equalsIgnoreCase(name)) {
			return bkf_flg();
		}
		if ($ln_stk_flg.equalsIgnoreCase(name)) {
			return ln_stk_flg();
		}
		if ($pre_po_tgt_flg.equalsIgnoreCase(name)) {
			return pre_po_tgt_flg();
		}
		if ($inst_rec_issue_flg.equalsIgnoreCase(name)) {
			return inst_rec_issue_flg();
		}
		if ($no_mfg_aprv_flg.equalsIgnoreCase(name)) {
			return no_mfg_aprv_flg();
		}
		if ($po_batch_flg.equalsIgnoreCase(name)) {
			return po_batch_flg();
		}
		if ($not_mrp_flg.equalsIgnoreCase(name)) {
			return not_mrp_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			return wg_nm();
		}
		if ($mfg_loc_cd.equalsIgnoreCase(name)) {
			return mfg_loc_cd();
		}
		if ($mfg_loc_nm.equalsIgnoreCase(name)) {
			return mfg_loc_nm();
		}
		if ($loc_sppl_cd.equalsIgnoreCase(name)) {
			return loc_sppl_cd();
		}
		if ($bom_ptn.equalsIgnoreCase(name)) {
			return bom_ptn();
		}
		if ($oper_ptn.equalsIgnoreCase(name)) {
			return oper_ptn();
		}
		if ($purc_basis_typ.equalsIgnoreCase(name)) {
			return purc_basis_typ();
		}
		if ($purc_basis_typ_nm.equalsIgnoreCase(name)) {
			return purc_basis_typ_nm();
		}
		if ($sz_day_week_typ.equalsIgnoreCase(name)) {
			return sz_day_week_typ();
		}
		if ($sz_day_week_typ_nm.equalsIgnoreCase(name)) {
			return sz_day_week_typ_nm();
		}
		if ($lot_issue_typ.equalsIgnoreCase(name)) {
			return lot_issue_typ();
		}
		if ($lot_issue_typ_nm.equalsIgnoreCase(name)) {
			return lot_issue_typ_nm();
		}
		if ($purc_id_typ.equalsIgnoreCase(name)) {
			return purc_id_typ();
		}
		if ($purc_id_typ_nm.equalsIgnoreCase(name)) {
			return purc_id_typ_nm();
		}
		if ($rqst_wg_cd.equalsIgnoreCase(name)) {
			return rqst_wg_cd();
		}
		if ($rqst_wg_nm.equalsIgnoreCase(name)) {
			return rqst_wg_nm();
		}
		if ($rsrc_cd1.equalsIgnoreCase(name)) {
			return rsrc_cd1();
		}
		if ($rsrc_nm1.equalsIgnoreCase(name)) {
			return rsrc_nm1();
		}
		if ($rsrc_cd2.equalsIgnoreCase(name)) {
			return rsrc_cd2();
		}
		if ($rsrc_nm2.equalsIgnoreCase(name)) {
			return rsrc_nm2();
		}
		if ($memo1.equalsIgnoreCase(name)) {
			return memo1();
		}
		if ($memo2.equalsIgnoreCase(name)) {
			return memo2();
		}
		if ($memo3.equalsIgnoreCase(name)) {
			return memo3();
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
		if ($del_usr_id.equalsIgnoreCase(name)) {
			return del_usr_id();
		}
		if ($del_usr_nm.equalsIgnoreCase(name)) {
			return del_usr_nm();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($mfg_lt.equalsIgnoreCase(name)) {
			return mfg_lt();
		}
		if ($purc_lt.equalsIgnoreCase(name)) {
			return purc_lt();
		}
		if ($accpt_insp_lt.equalsIgnoreCase(name)) {
			return accpt_insp_lt();
		}
		if ($buf_lt.equalsIgnoreCase(name)) {
			return buf_lt();
		}
		if ($ord_fix_pd.equalsIgnoreCase(name)) {
			return ord_fix_pd();
		}
		if ($sz_week.equalsIgnoreCase(name)) {
			return sz_week();
		}
		if ($lot_sz_pd.equalsIgnoreCase(name)) {
			return lot_sz_pd();
		}
		if ($max_order.equalsIgnoreCase(name)) {
			return max_order();
		}
		if ($prio.equalsIgnoreCase(name)) {
			return prio();
		}
		if ($order_ratio.equalsIgnoreCase(name)) {
			return order_ratio();
		}
		if ($itm_lower_yield.equalsIgnoreCase(name)) {
			return itm_lower_yield();
		}
		if ($itm_std_yield.equalsIgnoreCase(name)) {
			return itm_std_yield();
		}
		if ($itm_upper_yield.equalsIgnoreCase(name)) {
			return itm_upper_yield();
		}
		if ($rsrc_std_qty1.equalsIgnoreCase(name)) {
			return rsrc_std_qty1();
		}
		if ($rsrc_std_qty2.equalsIgnoreCase(name)) {
			return rsrc_std_qty2();
		}
		if ($cost_ratio.equalsIgnoreCase(name)) {
			return cost_ratio();
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			return upd_cntr();
		}
		return super.getNumberNE(name);
	}
	public MCTimestamp getTimestampNE(String name) {
		if ($ins_ts.equalsIgnoreCase(name)) {
			return ins_ts();
		}
		if ($upd_ts.equalsIgnoreCase(name)) {
			return upd_ts();
		}
		if ($del_ts.equalsIgnoreCase(name)) {
			return del_ts();
		}
		return super.getTimestampNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($check.equalsIgnoreCase(name)) {
			return check();
		}
		if ($del_flg.equalsIgnoreCase(name)) {
			return del_flg();
		}
		if ($bkf_flg.equalsIgnoreCase(name)) {
			return bkf_flg();
		}
		if ($ln_stk_flg.equalsIgnoreCase(name)) {
			return ln_stk_flg();
		}
		if ($pre_po_tgt_flg.equalsIgnoreCase(name)) {
			return pre_po_tgt_flg();
		}
		if ($inst_rec_issue_flg.equalsIgnoreCase(name)) {
			return inst_rec_issue_flg();
		}
		if ($no_mfg_aprv_flg.equalsIgnoreCase(name)) {
			return no_mfg_aprv_flg();
		}
		if ($po_batch_flg.equalsIgnoreCase(name)) {
			return po_batch_flg();
		}
		if ($not_mrp_flg.equalsIgnoreCase(name)) {
			return not_mrp_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($wg_cd.equalsIgnoreCase(name)) {
			wg_cd(value);
			return;
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			wg_nm(value);
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
		if ($loc_sppl_cd.equalsIgnoreCase(name)) {
			loc_sppl_cd(value);
			return;
		}
		if ($bom_ptn.equalsIgnoreCase(name)) {
			bom_ptn(value);
			return;
		}
		if ($oper_ptn.equalsIgnoreCase(name)) {
			oper_ptn(value);
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
		if ($sz_day_week_typ.equalsIgnoreCase(name)) {
			sz_day_week_typ(value);
			return;
		}
		if ($sz_day_week_typ_nm.equalsIgnoreCase(name)) {
			sz_day_week_typ_nm(value);
			return;
		}
		if ($lot_issue_typ.equalsIgnoreCase(name)) {
			lot_issue_typ(value);
			return;
		}
		if ($lot_issue_typ_nm.equalsIgnoreCase(name)) {
			lot_issue_typ_nm(value);
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
		if ($rqst_wg_cd.equalsIgnoreCase(name)) {
			rqst_wg_cd(value);
			return;
		}
		if ($rqst_wg_nm.equalsIgnoreCase(name)) {
			rqst_wg_nm(value);
			return;
		}
		if ($rsrc_cd1.equalsIgnoreCase(name)) {
			rsrc_cd1(value);
			return;
		}
		if ($rsrc_nm1.equalsIgnoreCase(name)) {
			rsrc_nm1(value);
			return;
		}
		if ($rsrc_cd2.equalsIgnoreCase(name)) {
			rsrc_cd2(value);
			return;
		}
		if ($rsrc_nm2.equalsIgnoreCase(name)) {
			rsrc_nm2(value);
			return;
		}
		if ($memo1.equalsIgnoreCase(name)) {
			memo1(value);
			return;
		}
		if ($memo2.equalsIgnoreCase(name)) {
			memo2(value);
			return;
		}
		if ($memo3.equalsIgnoreCase(name)) {
			memo3(value);
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
		if ($del_usr_id.equalsIgnoreCase(name)) {
			del_usr_id(value);
			return;
		}
		if ($del_usr_nm.equalsIgnoreCase(name)) {
			del_usr_nm(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($mfg_lt.equalsIgnoreCase(name)) {
			mfg_lt(value);
			return;
		}
		if ($purc_lt.equalsIgnoreCase(name)) {
			purc_lt(value);
			return;
		}
		if ($accpt_insp_lt.equalsIgnoreCase(name)) {
			accpt_insp_lt(value);
			return;
		}
		if ($buf_lt.equalsIgnoreCase(name)) {
			buf_lt(value);
			return;
		}
		if ($ord_fix_pd.equalsIgnoreCase(name)) {
			ord_fix_pd(value);
			return;
		}
		if ($sz_week.equalsIgnoreCase(name)) {
			sz_week(value);
			return;
		}
		if ($lot_sz_pd.equalsIgnoreCase(name)) {
			lot_sz_pd(value);
			return;
		}
		if ($max_order.equalsIgnoreCase(name)) {
			max_order(value);
			return;
		}
		if ($prio.equalsIgnoreCase(name)) {
			prio(value);
			return;
		}
		if ($order_ratio.equalsIgnoreCase(name)) {
			order_ratio(value);
			return;
		}
		if ($itm_lower_yield.equalsIgnoreCase(name)) {
			itm_lower_yield(value);
			return;
		}
		if ($itm_std_yield.equalsIgnoreCase(name)) {
			itm_std_yield(value);
			return;
		}
		if ($itm_upper_yield.equalsIgnoreCase(name)) {
			itm_upper_yield(value);
			return;
		}
		if ($rsrc_std_qty1.equalsIgnoreCase(name)) {
			rsrc_std_qty1(value);
			return;
		}
		if ($rsrc_std_qty2.equalsIgnoreCase(name)) {
			rsrc_std_qty2(value);
			return;
		}
		if ($cost_ratio.equalsIgnoreCase(name)) {
			cost_ratio(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($mfg_lt.equalsIgnoreCase(name)) {
			mfg_lt(value);
			return;
		}
		if ($purc_lt.equalsIgnoreCase(name)) {
			purc_lt(value);
			return;
		}
		if ($accpt_insp_lt.equalsIgnoreCase(name)) {
			accpt_insp_lt(value);
			return;
		}
		if ($buf_lt.equalsIgnoreCase(name)) {
			buf_lt(value);
			return;
		}
		if ($ord_fix_pd.equalsIgnoreCase(name)) {
			ord_fix_pd(value);
			return;
		}
		if ($sz_week.equalsIgnoreCase(name)) {
			sz_week(value);
			return;
		}
		if ($lot_sz_pd.equalsIgnoreCase(name)) {
			lot_sz_pd(value);
			return;
		}
		if ($max_order.equalsIgnoreCase(name)) {
			max_order(value);
			return;
		}
		if ($prio.equalsIgnoreCase(name)) {
			prio(value);
			return;
		}
		if ($order_ratio.equalsIgnoreCase(name)) {
			order_ratio(value);
			return;
		}
		if ($itm_lower_yield.equalsIgnoreCase(name)) {
			itm_lower_yield(value);
			return;
		}
		if ($itm_std_yield.equalsIgnoreCase(name)) {
			itm_std_yield(value);
			return;
		}
		if ($itm_upper_yield.equalsIgnoreCase(name)) {
			itm_upper_yield(value);
			return;
		}
		if ($rsrc_std_qty1.equalsIgnoreCase(name)) {
			rsrc_std_qty1(value);
			return;
		}
		if ($rsrc_std_qty2.equalsIgnoreCase(name)) {
			rsrc_std_qty2(value);
			return;
		}
		if ($cost_ratio.equalsIgnoreCase(name)) {
			cost_ratio(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($mfg_lt.equalsIgnoreCase(name)) {
			mfg_lt(value);
			return;
		}
		if ($purc_lt.equalsIgnoreCase(name)) {
			purc_lt(value);
			return;
		}
		if ($accpt_insp_lt.equalsIgnoreCase(name)) {
			accpt_insp_lt(value);
			return;
		}
		if ($buf_lt.equalsIgnoreCase(name)) {
			buf_lt(value);
			return;
		}
		if ($ord_fix_pd.equalsIgnoreCase(name)) {
			ord_fix_pd(value);
			return;
		}
		if ($sz_week.equalsIgnoreCase(name)) {
			sz_week(value);
			return;
		}
		if ($lot_sz_pd.equalsIgnoreCase(name)) {
			lot_sz_pd(value);
			return;
		}
		if ($max_order.equalsIgnoreCase(name)) {
			max_order(value);
			return;
		}
		if ($prio.equalsIgnoreCase(name)) {
			prio(value);
			return;
		}
		if ($order_ratio.equalsIgnoreCase(name)) {
			order_ratio(value);
			return;
		}
		if ($itm_lower_yield.equalsIgnoreCase(name)) {
			itm_lower_yield(value);
			return;
		}
		if ($itm_std_yield.equalsIgnoreCase(name)) {
			itm_std_yield(value);
			return;
		}
		if ($itm_upper_yield.equalsIgnoreCase(name)) {
			itm_upper_yield(value);
			return;
		}
		if ($rsrc_std_qty1.equalsIgnoreCase(name)) {
			rsrc_std_qty1(value);
			return;
		}
		if ($rsrc_std_qty2.equalsIgnoreCase(name)) {
			rsrc_std_qty2(value);
			return;
		}
		if ($cost_ratio.equalsIgnoreCase(name)) {
			cost_ratio(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($mfg_lt.equalsIgnoreCase(name)) {
			mfg_lt(value);
			return;
		}
		if ($purc_lt.equalsIgnoreCase(name)) {
			purc_lt(value);
			return;
		}
		if ($accpt_insp_lt.equalsIgnoreCase(name)) {
			accpt_insp_lt(value);
			return;
		}
		if ($buf_lt.equalsIgnoreCase(name)) {
			buf_lt(value);
			return;
		}
		if ($ord_fix_pd.equalsIgnoreCase(name)) {
			ord_fix_pd(value);
			return;
		}
		if ($sz_week.equalsIgnoreCase(name)) {
			sz_week(value);
			return;
		}
		if ($lot_sz_pd.equalsIgnoreCase(name)) {
			lot_sz_pd(value);
			return;
		}
		if ($max_order.equalsIgnoreCase(name)) {
			max_order(value);
			return;
		}
		if ($prio.equalsIgnoreCase(name)) {
			prio(value);
			return;
		}
		if ($order_ratio.equalsIgnoreCase(name)) {
			order_ratio(value);
			return;
		}
		if ($itm_lower_yield.equalsIgnoreCase(name)) {
			itm_lower_yield(value);
			return;
		}
		if ($itm_std_yield.equalsIgnoreCase(name)) {
			itm_std_yield(value);
			return;
		}
		if ($itm_upper_yield.equalsIgnoreCase(name)) {
			itm_upper_yield(value);
			return;
		}
		if ($rsrc_std_qty1.equalsIgnoreCase(name)) {
			rsrc_std_qty1(value);
			return;
		}
		if ($rsrc_std_qty2.equalsIgnoreCase(name)) {
			rsrc_std_qty2(value);
			return;
		}
		if ($cost_ratio.equalsIgnoreCase(name)) {
			cost_ratio(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($mfg_lt.equalsIgnoreCase(name)) {
			mfg_lt(value);
			return;
		}
		if ($purc_lt.equalsIgnoreCase(name)) {
			purc_lt(value);
			return;
		}
		if ($accpt_insp_lt.equalsIgnoreCase(name)) {
			accpt_insp_lt(value);
			return;
		}
		if ($buf_lt.equalsIgnoreCase(name)) {
			buf_lt(value);
			return;
		}
		if ($ord_fix_pd.equalsIgnoreCase(name)) {
			ord_fix_pd(value);
			return;
		}
		if ($sz_week.equalsIgnoreCase(name)) {
			sz_week(value);
			return;
		}
		if ($lot_sz_pd.equalsIgnoreCase(name)) {
			lot_sz_pd(value);
			return;
		}
		if ($max_order.equalsIgnoreCase(name)) {
			max_order(value);
			return;
		}
		if ($prio.equalsIgnoreCase(name)) {
			prio(value);
			return;
		}
		if ($order_ratio.equalsIgnoreCase(name)) {
			order_ratio(value);
			return;
		}
		if ($itm_lower_yield.equalsIgnoreCase(name)) {
			itm_lower_yield(value);
			return;
		}
		if ($itm_std_yield.equalsIgnoreCase(name)) {
			itm_std_yield(value);
			return;
		}
		if ($itm_upper_yield.equalsIgnoreCase(name)) {
			itm_upper_yield(value);
			return;
		}
		if ($rsrc_std_qty1.equalsIgnoreCase(name)) {
			rsrc_std_qty1(value);
			return;
		}
		if ($rsrc_std_qty2.equalsIgnoreCase(name)) {
			rsrc_std_qty2(value);
			return;
		}
		if ($cost_ratio.equalsIgnoreCase(name)) {
			cost_ratio(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
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
		if ($del_ts.equalsIgnoreCase(name)) {
			del_ts(value);
			return;
		}
		super.setTimestamp(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($check.equalsIgnoreCase(name)) {
			check(value);
			return;
		}
		if ($del_flg.equalsIgnoreCase(name)) {
			del_flg(value);
			return;
		}
		if ($bkf_flg.equalsIgnoreCase(name)) {
			bkf_flg(value);
			return;
		}
		if ($ln_stk_flg.equalsIgnoreCase(name)) {
			ln_stk_flg(value);
			return;
		}
		if ($pre_po_tgt_flg.equalsIgnoreCase(name)) {
			pre_po_tgt_flg(value);
			return;
		}
		if ($inst_rec_issue_flg.equalsIgnoreCase(name)) {
			inst_rec_issue_flg(value);
			return;
		}
		if ($no_mfg_aprv_flg.equalsIgnoreCase(name)) {
			no_mfg_aprv_flg(value);
			return;
		}
		if ($po_batch_flg.equalsIgnoreCase(name)) {
			po_batch_flg(value);
			return;
		}
		if ($not_mrp_flg.equalsIgnoreCase(name)) {
			not_mrp_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($wg_cd.equalsIgnoreCase(name)) {
			wg_cd(value);
			return;
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			wg_nm(value);
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
		if ($loc_sppl_cd.equalsIgnoreCase(name)) {
			loc_sppl_cd(value);
			return;
		}
		if ($bom_ptn.equalsIgnoreCase(name)) {
			bom_ptn(value);
			return;
		}
		if ($oper_ptn.equalsIgnoreCase(name)) {
			oper_ptn(value);
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
		if ($sz_day_week_typ.equalsIgnoreCase(name)) {
			sz_day_week_typ(value);
			return;
		}
		if ($sz_day_week_typ_nm.equalsIgnoreCase(name)) {
			sz_day_week_typ_nm(value);
			return;
		}
		if ($lot_issue_typ.equalsIgnoreCase(name)) {
			lot_issue_typ(value);
			return;
		}
		if ($lot_issue_typ_nm.equalsIgnoreCase(name)) {
			lot_issue_typ_nm(value);
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
		if ($rqst_wg_cd.equalsIgnoreCase(name)) {
			rqst_wg_cd(value);
			return;
		}
		if ($rqst_wg_nm.equalsIgnoreCase(name)) {
			rqst_wg_nm(value);
			return;
		}
		if ($rsrc_cd1.equalsIgnoreCase(name)) {
			rsrc_cd1(value);
			return;
		}
		if ($rsrc_nm1.equalsIgnoreCase(name)) {
			rsrc_nm1(value);
			return;
		}
		if ($rsrc_cd2.equalsIgnoreCase(name)) {
			rsrc_cd2(value);
			return;
		}
		if ($rsrc_nm2.equalsIgnoreCase(name)) {
			rsrc_nm2(value);
			return;
		}
		if ($memo1.equalsIgnoreCase(name)) {
			memo1(value);
			return;
		}
		if ($memo2.equalsIgnoreCase(name)) {
			memo2(value);
			return;
		}
		if ($memo3.equalsIgnoreCase(name)) {
			memo3(value);
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
		if ($del_usr_id.equalsIgnoreCase(name)) {
			del_usr_id(value);
			return;
		}
		if ($del_usr_nm.equalsIgnoreCase(name)) {
			del_usr_nm(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($mfg_lt.equalsIgnoreCase(name)) {
			mfg_lt(value);
			return;
		}
		if ($purc_lt.equalsIgnoreCase(name)) {
			purc_lt(value);
			return;
		}
		if ($accpt_insp_lt.equalsIgnoreCase(name)) {
			accpt_insp_lt(value);
			return;
		}
		if ($buf_lt.equalsIgnoreCase(name)) {
			buf_lt(value);
			return;
		}
		if ($ord_fix_pd.equalsIgnoreCase(name)) {
			ord_fix_pd(value);
			return;
		}
		if ($sz_week.equalsIgnoreCase(name)) {
			sz_week(value);
			return;
		}
		if ($lot_sz_pd.equalsIgnoreCase(name)) {
			lot_sz_pd(value);
			return;
		}
		if ($max_order.equalsIgnoreCase(name)) {
			max_order(value);
			return;
		}
		if ($prio.equalsIgnoreCase(name)) {
			prio(value);
			return;
		}
		if ($order_ratio.equalsIgnoreCase(name)) {
			order_ratio(value);
			return;
		}
		if ($itm_lower_yield.equalsIgnoreCase(name)) {
			itm_lower_yield(value);
			return;
		}
		if ($itm_std_yield.equalsIgnoreCase(name)) {
			itm_std_yield(value);
			return;
		}
		if ($itm_upper_yield.equalsIgnoreCase(name)) {
			itm_upper_yield(value);
			return;
		}
		if ($rsrc_std_qty1.equalsIgnoreCase(name)) {
			rsrc_std_qty1(value);
			return;
		}
		if ($rsrc_std_qty2.equalsIgnoreCase(name)) {
			rsrc_std_qty2(value);
			return;
		}
		if ($cost_ratio.equalsIgnoreCase(name)) {
			cost_ratio(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($mfg_lt.equalsIgnoreCase(name)) {
			mfg_lt(value);
			return;
		}
		if ($purc_lt.equalsIgnoreCase(name)) {
			purc_lt(value);
			return;
		}
		if ($accpt_insp_lt.equalsIgnoreCase(name)) {
			accpt_insp_lt(value);
			return;
		}
		if ($buf_lt.equalsIgnoreCase(name)) {
			buf_lt(value);
			return;
		}
		if ($ord_fix_pd.equalsIgnoreCase(name)) {
			ord_fix_pd(value);
			return;
		}
		if ($sz_week.equalsIgnoreCase(name)) {
			sz_week(value);
			return;
		}
		if ($lot_sz_pd.equalsIgnoreCase(name)) {
			lot_sz_pd(value);
			return;
		}
		if ($max_order.equalsIgnoreCase(name)) {
			max_order(value);
			return;
		}
		if ($prio.equalsIgnoreCase(name)) {
			prio(value);
			return;
		}
		if ($order_ratio.equalsIgnoreCase(name)) {
			order_ratio(value);
			return;
		}
		if ($itm_lower_yield.equalsIgnoreCase(name)) {
			itm_lower_yield(value);
			return;
		}
		if ($itm_std_yield.equalsIgnoreCase(name)) {
			itm_std_yield(value);
			return;
		}
		if ($itm_upper_yield.equalsIgnoreCase(name)) {
			itm_upper_yield(value);
			return;
		}
		if ($rsrc_std_qty1.equalsIgnoreCase(name)) {
			rsrc_std_qty1(value);
			return;
		}
		if ($rsrc_std_qty2.equalsIgnoreCase(name)) {
			rsrc_std_qty2(value);
			return;
		}
		if ($cost_ratio.equalsIgnoreCase(name)) {
			cost_ratio(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($mfg_lt.equalsIgnoreCase(name)) {
			mfg_lt(value);
			return;
		}
		if ($purc_lt.equalsIgnoreCase(name)) {
			purc_lt(value);
			return;
		}
		if ($accpt_insp_lt.equalsIgnoreCase(name)) {
			accpt_insp_lt(value);
			return;
		}
		if ($buf_lt.equalsIgnoreCase(name)) {
			buf_lt(value);
			return;
		}
		if ($ord_fix_pd.equalsIgnoreCase(name)) {
			ord_fix_pd(value);
			return;
		}
		if ($sz_week.equalsIgnoreCase(name)) {
			sz_week(value);
			return;
		}
		if ($lot_sz_pd.equalsIgnoreCase(name)) {
			lot_sz_pd(value);
			return;
		}
		if ($max_order.equalsIgnoreCase(name)) {
			max_order(value);
			return;
		}
		if ($prio.equalsIgnoreCase(name)) {
			prio(value);
			return;
		}
		if ($order_ratio.equalsIgnoreCase(name)) {
			order_ratio(value);
			return;
		}
		if ($itm_lower_yield.equalsIgnoreCase(name)) {
			itm_lower_yield(value);
			return;
		}
		if ($itm_std_yield.equalsIgnoreCase(name)) {
			itm_std_yield(value);
			return;
		}
		if ($itm_upper_yield.equalsIgnoreCase(name)) {
			itm_upper_yield(value);
			return;
		}
		if ($rsrc_std_qty1.equalsIgnoreCase(name)) {
			rsrc_std_qty1(value);
			return;
		}
		if ($rsrc_std_qty2.equalsIgnoreCase(name)) {
			rsrc_std_qty2(value);
			return;
		}
		if ($cost_ratio.equalsIgnoreCase(name)) {
			cost_ratio(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($mfg_lt.equalsIgnoreCase(name)) {
			mfg_lt(value);
			return;
		}
		if ($purc_lt.equalsIgnoreCase(name)) {
			purc_lt(value);
			return;
		}
		if ($accpt_insp_lt.equalsIgnoreCase(name)) {
			accpt_insp_lt(value);
			return;
		}
		if ($buf_lt.equalsIgnoreCase(name)) {
			buf_lt(value);
			return;
		}
		if ($ord_fix_pd.equalsIgnoreCase(name)) {
			ord_fix_pd(value);
			return;
		}
		if ($sz_week.equalsIgnoreCase(name)) {
			sz_week(value);
			return;
		}
		if ($lot_sz_pd.equalsIgnoreCase(name)) {
			lot_sz_pd(value);
			return;
		}
		if ($max_order.equalsIgnoreCase(name)) {
			max_order(value);
			return;
		}
		if ($prio.equalsIgnoreCase(name)) {
			prio(value);
			return;
		}
		if ($order_ratio.equalsIgnoreCase(name)) {
			order_ratio(value);
			return;
		}
		if ($itm_lower_yield.equalsIgnoreCase(name)) {
			itm_lower_yield(value);
			return;
		}
		if ($itm_std_yield.equalsIgnoreCase(name)) {
			itm_std_yield(value);
			return;
		}
		if ($itm_upper_yield.equalsIgnoreCase(name)) {
			itm_upper_yield(value);
			return;
		}
		if ($rsrc_std_qty1.equalsIgnoreCase(name)) {
			rsrc_std_qty1(value);
			return;
		}
		if ($rsrc_std_qty2.equalsIgnoreCase(name)) {
			rsrc_std_qty2(value);
			return;
		}
		if ($cost_ratio.equalsIgnoreCase(name)) {
			cost_ratio(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($mfg_lt.equalsIgnoreCase(name)) {
			mfg_lt(value);
			return;
		}
		if ($purc_lt.equalsIgnoreCase(name)) {
			purc_lt(value);
			return;
		}
		if ($accpt_insp_lt.equalsIgnoreCase(name)) {
			accpt_insp_lt(value);
			return;
		}
		if ($buf_lt.equalsIgnoreCase(name)) {
			buf_lt(value);
			return;
		}
		if ($ord_fix_pd.equalsIgnoreCase(name)) {
			ord_fix_pd(value);
			return;
		}
		if ($sz_week.equalsIgnoreCase(name)) {
			sz_week(value);
			return;
		}
		if ($lot_sz_pd.equalsIgnoreCase(name)) {
			lot_sz_pd(value);
			return;
		}
		if ($max_order.equalsIgnoreCase(name)) {
			max_order(value);
			return;
		}
		if ($prio.equalsIgnoreCase(name)) {
			prio(value);
			return;
		}
		if ($order_ratio.equalsIgnoreCase(name)) {
			order_ratio(value);
			return;
		}
		if ($itm_lower_yield.equalsIgnoreCase(name)) {
			itm_lower_yield(value);
			return;
		}
		if ($itm_std_yield.equalsIgnoreCase(name)) {
			itm_std_yield(value);
			return;
		}
		if ($itm_upper_yield.equalsIgnoreCase(name)) {
			itm_upper_yield(value);
			return;
		}
		if ($rsrc_std_qty1.equalsIgnoreCase(name)) {
			rsrc_std_qty1(value);
			return;
		}
		if ($rsrc_std_qty2.equalsIgnoreCase(name)) {
			rsrc_std_qty2(value);
			return;
		}
		if ($cost_ratio.equalsIgnoreCase(name)) {
			cost_ratio(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
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
		if ($del_ts.equalsIgnoreCase(name)) {
			del_ts(value);
			return;
		}
		super.setTimestampNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($check.equalsIgnoreCase(name)) {
			check(value);
			return;
		}
		if ($del_flg.equalsIgnoreCase(name)) {
			del_flg(value);
			return;
		}
		if ($bkf_flg.equalsIgnoreCase(name)) {
			bkf_flg(value);
			return;
		}
		if ($ln_stk_flg.equalsIgnoreCase(name)) {
			ln_stk_flg(value);
			return;
		}
		if ($pre_po_tgt_flg.equalsIgnoreCase(name)) {
			pre_po_tgt_flg(value);
			return;
		}
		if ($inst_rec_issue_flg.equalsIgnoreCase(name)) {
			inst_rec_issue_flg(value);
			return;
		}
		if ($no_mfg_aprv_flg.equalsIgnoreCase(name)) {
			no_mfg_aprv_flg(value);
			return;
		}
		if ($po_batch_flg.equalsIgnoreCase(name)) {
			po_batch_flg(value);
			return;
		}
		if ($not_mrp_flg.equalsIgnoreCase(name)) {
			not_mrp_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}

	public MCRow getInnerRow(String name) {
		if ($itm_p.equalsIgnoreCase(name)) {
			return itm_p();
		}
		if ($dt_p.equalsIgnoreCase(name)) {
			return dt_p();
		}
		if ($mfg_lt_add_qty_p.equalsIgnoreCase(name)) {
			return mfg_lt_add_qty_p();
		}
		if ($purc_lt_add_qty_p.equalsIgnoreCase(name)) {
			return purc_lt_add_qty_p();
		}
		if ($min_lot_qty_p.equalsIgnoreCase(name)) {
			return min_lot_qty_p();
		}
		if ($batch_lot_qty_p.equalsIgnoreCase(name)) {
			return batch_lot_qty_p();
		}
		if ($max_lot_qty_p.equalsIgnoreCase(name)) {
			return max_lot_qty_p();
		}
		if ($yield_schd_qty_p.equalsIgnoreCase(name)) {
			return yield_schd_qty_p();
		}
		if ($mfg_inst_qty_p.equalsIgnoreCase(name)) {
			return mfg_inst_qty_p();
		}
		if ($fxd_rqmt_qty_p.equalsIgnoreCase(name)) {
			return fxd_rqmt_qty_p();
		}
		if ($rsrc_unit_qty1_p.equalsIgnoreCase(name)) {
			return rsrc_unit_qty1_p();
		}
		if ($rsrc_unit_qty2_p.equalsIgnoreCase(name)) {
			return rsrc_unit_qty2_p();
		}
		if ($sno_p.equalsIgnoreCase(name)) {
			return sno_p();
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
		if ($dt_p.equalsIgnoreCase(name)) {
			dt_p(
				((MCContainerMeta) dt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5010.DtR.class, value)
			);
			return;
		}
		if ($mfg_lt_add_qty_p.equalsIgnoreCase(name)) {
			mfg_lt_add_qty_p(
				((MCContainerMeta) mfg_lt_add_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($purc_lt_add_qty_p.equalsIgnoreCase(name)) {
			purc_lt_add_qty_p(
				((MCContainerMeta) purc_lt_add_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($min_lot_qty_p.equalsIgnoreCase(name)) {
			min_lot_qty_p(
				((MCContainerMeta) min_lot_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($batch_lot_qty_p.equalsIgnoreCase(name)) {
			batch_lot_qty_p(
				((MCContainerMeta) batch_lot_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($max_lot_qty_p.equalsIgnoreCase(name)) {
			max_lot_qty_p(
				((MCContainerMeta) max_lot_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($yield_schd_qty_p.equalsIgnoreCase(name)) {
			yield_schd_qty_p(
				((MCContainerMeta) yield_schd_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($mfg_inst_qty_p.equalsIgnoreCase(name)) {
			mfg_inst_qty_p(
				((MCContainerMeta) mfg_inst_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($fxd_rqmt_qty_p.equalsIgnoreCase(name)) {
			fxd_rqmt_qty_p(
				((MCContainerMeta) fxd_rqmt_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($rsrc_unit_qty1_p.equalsIgnoreCase(name)) {
			rsrc_unit_qty1_p(
				((MCContainerMeta) rsrc_unit_qty1_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($rsrc_unit_qty2_p.equalsIgnoreCase(name)) {
			rsrc_unit_qty2_p(
				((MCContainerMeta) rsrc_unit_qty2_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($sno_p.equalsIgnoreCase(name)) {
			sno_p(
				((MCContainerMeta) sno_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5070.SnoR.class, value)
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

	public MCDate st_dt_key() {
		return dt_p().st_dt_key();
	}

	public void st_dt_key(MCDate value) {
		dt_p().st_dt_key(value);
	}

	public MCDate st_dt() {
		return dt_p().st_dt();
	}

	public void st_dt(MCDate value) {
		dt_p().st_dt(value);
	}

	public MCDate end_dt() {
		return dt_p().end_dt();
	}

	public void end_dt(MCDate value) {
		dt_p().end_dt(value);
	}

	/**
	 * Mfg. LT adds base qty. 製造ＬＴ加算基準数量.<p>
	 *
	 */
	public MCNumber mfg_lt_add_qty() {
		return mfg_lt_add_qty_p().qty();
	}

	/**
	 * Mfg. LT adds base qty. 製造ＬＴ加算基準数量.<p>
	 *
	 */
	public void mfg_lt_add_qty(MCNumber value) {
		mfg_lt_add_qty_p().qty(value);
	}

	/**
	 * Mfg. LT adds base qty. 製造ＬＴ加算基準数量.<p>
	 *
	 */
	public void mfg_lt_add_qty(int value) {
		mfg_lt_add_qty_p().qty(value);
	}

	/**
	 * Mfg. LT adds base qty. 製造ＬＴ加算基準数量.<p>
	 *
	 */
	public void mfg_lt_add_qty(long value) {
		mfg_lt_add_qty_p().qty(value);
	}

	/**
	 * Mfg. LT adds base qty. 製造ＬＴ加算基準数量.<p>
	 *
	 */
	public void mfg_lt_add_qty(float value) {
		mfg_lt_add_qty_p().qty(value);
	}

	/**
	 * Mfg. LT adds base qty. 製造ＬＴ加算基準数量.<p>
	 *
	 */
	public void mfg_lt_add_qty(double value) {
		mfg_lt_add_qty_p().qty(value);
	}

	/**
	 * Purchase LT adds standard qty. 購入ＬＴ加算基準数量.<p>
	 *
	 */
	public MCNumber purc_lt_add_qty() {
		return purc_lt_add_qty_p().qty();
	}

	/**
	 * Purchase LT adds standard qty. 購入ＬＴ加算基準数量.<p>
	 *
	 */
	public void purc_lt_add_qty(MCNumber value) {
		purc_lt_add_qty_p().qty(value);
	}

	/**
	 * Purchase LT adds standard qty. 購入ＬＴ加算基準数量.<p>
	 *
	 */
	public void purc_lt_add_qty(int value) {
		purc_lt_add_qty_p().qty(value);
	}

	/**
	 * Purchase LT adds standard qty. 購入ＬＴ加算基準数量.<p>
	 *
	 */
	public void purc_lt_add_qty(long value) {
		purc_lt_add_qty_p().qty(value);
	}

	/**
	 * Purchase LT adds standard qty. 購入ＬＴ加算基準数量.<p>
	 *
	 */
	public void purc_lt_add_qty(float value) {
		purc_lt_add_qty_p().qty(value);
	}

	/**
	 * Purchase LT adds standard qty. 購入ＬＴ加算基準数量.<p>
	 *
	 */
	public void purc_lt_add_qty(double value) {
		purc_lt_add_qty_p().qty(value);
	}

	/**
	 * Min. lot qty. 最小ロット数量.<p>
	 *
	 */
	public MCNumber min_lot_qty() {
		return min_lot_qty_p().qty();
	}

	/**
	 * Min. lot qty. 最小ロット数量.<p>
	 *
	 */
	public void min_lot_qty(MCNumber value) {
		min_lot_qty_p().qty(value);
	}

	/**
	 * Min. lot qty. 最小ロット数量.<p>
	 *
	 */
	public void min_lot_qty(int value) {
		min_lot_qty_p().qty(value);
	}

	/**
	 * Min. lot qty. 最小ロット数量.<p>
	 *
	 */
	public void min_lot_qty(long value) {
		min_lot_qty_p().qty(value);
	}

	/**
	 * Min. lot qty. 最小ロット数量.<p>
	 *
	 */
	public void min_lot_qty(float value) {
		min_lot_qty_p().qty(value);
	}

	/**
	 * Min. lot qty. 最小ロット数量.<p>
	 *
	 */
	public void min_lot_qty(double value) {
		min_lot_qty_p().qty(value);
	}

	/**
	 * Increments lot qty. 刻みロット数量.<p>
	 *
	 */
	public MCNumber batch_lot_qty() {
		return batch_lot_qty_p().qty();
	}

	/**
	 * Increments lot qty. 刻みロット数量.<p>
	 *
	 */
	public void batch_lot_qty(MCNumber value) {
		batch_lot_qty_p().qty(value);
	}

	/**
	 * Increments lot qty. 刻みロット数量.<p>
	 *
	 */
	public void batch_lot_qty(int value) {
		batch_lot_qty_p().qty(value);
	}

	/**
	 * Increments lot qty. 刻みロット数量.<p>
	 *
	 */
	public void batch_lot_qty(long value) {
		batch_lot_qty_p().qty(value);
	}

	/**
	 * Increments lot qty. 刻みロット数量.<p>
	 *
	 */
	public void batch_lot_qty(float value) {
		batch_lot_qty_p().qty(value);
	}

	/**
	 * Increments lot qty. 刻みロット数量.<p>
	 *
	 */
	public void batch_lot_qty(double value) {
		batch_lot_qty_p().qty(value);
	}

	/**
	 * Max. lot qty. 最大ロット数量.<p>
	 *
	 */
	public MCNumber max_lot_qty() {
		return max_lot_qty_p().qty();
	}

	/**
	 * Max. lot qty. 最大ロット数量.<p>
	 *
	 */
	public void max_lot_qty(MCNumber value) {
		max_lot_qty_p().qty(value);
	}

	/**
	 * Max. lot qty. 最大ロット数量.<p>
	 *
	 */
	public void max_lot_qty(int value) {
		max_lot_qty_p().qty(value);
	}

	/**
	 * Max. lot qty. 最大ロット数量.<p>
	 *
	 */
	public void max_lot_qty(long value) {
		max_lot_qty_p().qty(value);
	}

	/**
	 * Max. lot qty. 最大ロット数量.<p>
	 *
	 */
	public void max_lot_qty(float value) {
		max_lot_qty_p().qty(value);
	}

	/**
	 * Max. lot qty. 最大ロット数量.<p>
	 *
	 */
	public void max_lot_qty(double value) {
		max_lot_qty_p().qty(value);
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
	 * Mfg. order qty. 製造指図数量.<p>
	 *
	 */
	public MCNumber mfg_inst_qty() {
		return mfg_inst_qty_p().qty();
	}

	/**
	 * Mfg. order qty. 製造指図数量.<p>
	 *
	 */
	public void mfg_inst_qty(MCNumber value) {
		mfg_inst_qty_p().qty(value);
	}

	/**
	 * Mfg. order qty. 製造指図数量.<p>
	 *
	 */
	public void mfg_inst_qty(int value) {
		mfg_inst_qty_p().qty(value);
	}

	/**
	 * Mfg. order qty. 製造指図数量.<p>
	 *
	 */
	public void mfg_inst_qty(long value) {
		mfg_inst_qty_p().qty(value);
	}

	/**
	 * Mfg. order qty. 製造指図数量.<p>
	 *
	 */
	public void mfg_inst_qty(float value) {
		mfg_inst_qty_p().qty(value);
	}

	/**
	 * Mfg. order qty. 製造指図数量.<p>
	 *
	 */
	public void mfg_inst_qty(double value) {
		mfg_inst_qty_p().qty(value);
	}

	/**
	 * Fixed required qty. 固定必要数量.<p>
	 *
	 */
	public MCNumber fxd_rqmt_qty() {
		return fxd_rqmt_qty_p().qty();
	}

	/**
	 * Fixed required qty. 固定必要数量.<p>
	 *
	 */
	public void fxd_rqmt_qty(MCNumber value) {
		fxd_rqmt_qty_p().qty(value);
	}

	/**
	 * Fixed required qty. 固定必要数量.<p>
	 *
	 */
	public void fxd_rqmt_qty(int value) {
		fxd_rqmt_qty_p().qty(value);
	}

	/**
	 * Fixed required qty. 固定必要数量.<p>
	 *
	 */
	public void fxd_rqmt_qty(long value) {
		fxd_rqmt_qty_p().qty(value);
	}

	/**
	 * Fixed required qty. 固定必要数量.<p>
	 *
	 */
	public void fxd_rqmt_qty(float value) {
		fxd_rqmt_qty_p().qty(value);
	}

	/**
	 * Fixed required qty. 固定必要数量.<p>
	 *
	 */
	public void fxd_rqmt_qty(double value) {
		fxd_rqmt_qty_p().qty(value);
	}

	/**
	 * Resource unit qty. 1 資源単位数量１.<p>
	 *
	 */
	public MCNumber rsrc_unit_qty1() {
		return rsrc_unit_qty1_p().qty();
	}

	/**
	 * Resource unit qty. 1 資源単位数量１.<p>
	 *
	 */
	public void rsrc_unit_qty1(MCNumber value) {
		rsrc_unit_qty1_p().qty(value);
	}

	/**
	 * Resource unit qty. 1 資源単位数量１.<p>
	 *
	 */
	public void rsrc_unit_qty1(int value) {
		rsrc_unit_qty1_p().qty(value);
	}

	/**
	 * Resource unit qty. 1 資源単位数量１.<p>
	 *
	 */
	public void rsrc_unit_qty1(long value) {
		rsrc_unit_qty1_p().qty(value);
	}

	/**
	 * Resource unit qty. 1 資源単位数量１.<p>
	 *
	 */
	public void rsrc_unit_qty1(float value) {
		rsrc_unit_qty1_p().qty(value);
	}

	/**
	 * Resource unit qty. 1 資源単位数量１.<p>
	 *
	 */
	public void rsrc_unit_qty1(double value) {
		rsrc_unit_qty1_p().qty(value);
	}

	/**
	 * Resource unit qty. 2 資源単位数量２.<p>
	 *
	 */
	public MCNumber rsrc_unit_qty2() {
		return rsrc_unit_qty2_p().qty();
	}

	/**
	 * Resource unit qty. 2 資源単位数量２.<p>
	 *
	 */
	public void rsrc_unit_qty2(MCNumber value) {
		rsrc_unit_qty2_p().qty(value);
	}

	/**
	 * Resource unit qty. 2 資源単位数量２.<p>
	 *
	 */
	public void rsrc_unit_qty2(int value) {
		rsrc_unit_qty2_p().qty(value);
	}

	/**
	 * Resource unit qty. 2 資源単位数量２.<p>
	 *
	 */
	public void rsrc_unit_qty2(long value) {
		rsrc_unit_qty2_p().qty(value);
	}

	/**
	 * Resource unit qty. 2 資源単位数量２.<p>
	 *
	 */
	public void rsrc_unit_qty2(float value) {
		rsrc_unit_qty2_p().qty(value);
	}

	/**
	 * Resource unit qty. 2 資源単位数量２.<p>
	 *
	 */
	public void rsrc_unit_qty2(double value) {
		rsrc_unit_qty2_p().qty(value);
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

}

