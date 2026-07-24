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
 * ブロック"Wrk10Dtl"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class Wrk10DtlR_MC_A extends MCConstRow {

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
	 * Mfg. order unit type (WG) 製造指図単位区分（ＷＧ）.<p>
	 *
	 */
	public static final String $mfg_inst_unit_typ_wg = "mfg_inst_unit_typ_wg";
	/**
	 * Mfg. order unit type (Default) 製造指図単位区分（既定）.<p>
	 *
	 */
	public static final String $mfg_inst_unit_typ_mst = "mfg_inst_unit_typ_mst";
	/**
	 * Mfg. order unit type name (Default) 製造指図単位区分名（既定）.<p>
	 *
	 */
	public static final String $mfg_inst_unit_typ_mst_nm = "mfg_inst_unit_typ_mst_nm";
	/**
	 * Mfg. order unit type 製造指図単位区分.<p>
	 *
	 */
	public static final String $mfg_inst_unit_typ = "mfg_inst_unit_typ";
	/**
	 * Mfg. order unit type name 製造指図単位区分名.<p>
	 *
	 */
	public static final String $mfg_inst_unit_typ_nm = "mfg_inst_unit_typ_nm";
	/**
	 * MRP processing type (WG) ＭＲＰ処理区分（ＷＧ）.<p>
	 *
	 */
	public static final String $mrp_proc_typ_wg = "mrp_proc_typ_wg";
	/**
	 * MRP processing type (Default) ＭＲＰ処理区分（既定）.<p>
	 *
	 */
	public static final String $mrp_proc_typ_mst = "mrp_proc_typ_mst";
	/**
	 * MRP processing type name (Default) ＭＲＰ処理区分名（既定）.<p>
	 *
	 */
	public static final String $mrp_proc_typ_mst_nm = "mrp_proc_typ_mst_nm";
	/**
	 * MRP process type ＭＲＰ処理区分.<p>
	 *
	 */
	public static final String $mrp_proc_typ = "mrp_proc_typ";
	/**
	 * MRP processing type name ＭＲＰ処理区分名.<p>
	 *
	 */
	public static final String $mrp_proc_typ_nm = "mrp_proc_typ_nm";
	/**
	 * Requirements type (WG) 所要区分（ＷＧ）.<p>
	 *
	 */
	public static final String $rqmt_typ_wg = "rqmt_typ_wg";
	/**
	 * Requirements type (Default) 所要区分（既定）.<p>
	 *
	 */
	public static final String $rqmt_typ_mst = "rqmt_typ_mst";
	/**
	 * Requirements type name (Default) 所要区分名（既定）.<p>
	 *
	 */
	public static final String $rqmt_typ_mst_nm = "rqmt_typ_mst_nm";
	/**
	 * Requirements type 所要区分.<p>
	 *
	 */
	public static final String $rqmt_typ = "rqmt_typ";
	/**
	 * Requirements type name 所要区分名.<p>
	 *
	 */
	public static final String $rqmt_typ_nm = "rqmt_typ_nm";
	/**
	 * Production planning type (WG) 生産計画立案区分（ＷＧ）.<p>
	 *
	 */
	public static final String $prod_pln_typ_wg = "prod_pln_typ_wg";
	/**
	 * Production planning type (Default) 生産計画立案区分（既定）.<p>
	 *
	 */
	public static final String $prod_pln_typ_mst = "prod_pln_typ_mst";
	/**
	 * Production planning type name (Default) 生産計画立案区分名（既定）.<p>
	 *
	 */
	public static final String $prod_pln_typ_mst_nm = "prod_pln_typ_mst_nm";
	/**
	 * Production planning type 生産計画立案区分.<p>
	 *
	 */
	public static final String $prod_pln_typ = "prod_pln_typ";
	/**
	 * Production planning type name 生産計画立案区分名.<p>
	 *
	 */
	public static final String $prod_pln_typ_nm = "prod_pln_typ_nm";
	/**
	 * Number of months for demand disaggregation by day (WG) 需要日ばらし月数（ＷＧ）.<p>
	 *
	 */
	public static final String $dmnd_date_div_mons_wg = "dmnd_date_div_mons_wg";
	/**
	 * Number of months for demand disaggregation by day (Default) 需要日ばらし月数（既定）.<p>
	 *
	 */
	public static final String $dmnd_date_div_mons_mst = "dmnd_date_div_mons_mst";
	/**
	 * Number of months for demand disaggregation by day 需要日ばらし月数.<p>
	 *
	 */
	public static final String $dmnd_date_div_mons = "dmnd_date_div_mons";
	/**
	 * Allocation extra days (WG) 引当余裕日数（ＷＧ）.<p>
	 *
	 */
	public static final String $alloc_margin_days_wg = "alloc_margin_days_wg";
	/**
	 * Allocation extra days (Default) 引当余裕日数（既定）.<p>
	 *
	 */
	public static final String $alloc_margin_days_mst = "alloc_margin_days_mst";
	/**
	 * Allocation extra days 引当余裕日数.<p>
	 *
	 */
	public static final String $alloc_margin_days = "alloc_margin_days";
	/**
	 * MRP allocation extra days (WG) ＭＲＰ引当余裕日数（ＷＧ）.<p>
	 *
	 */
	public static final String $mrp_alloc_margin_days_wg = "mrp_alloc_margin_days_wg";
	/**
	 * MRP allocation extra days (Default) ＭＲＰ引当余裕日数（既定）.<p>
	 *
	 */
	public static final String $mrp_alloc_margin_days_mst = "mrp_alloc_margin_days_mst";
	/**
	 * MRP allocation extra days ＭＲＰ引当余裕日数.<p>
	 *
	 */
	public static final String $mrp_alloc_margin_days = "mrp_alloc_margin_days";
	/**
	 * Days to consider unfirm transport request in MRP (WG) ＭＲＰ未確定移送依頼考慮日数（ＷＧ）.<p>
	 *
	 */
	public static final String $mrp_opn_xfr_days_wg = "mrp_opn_xfr_days_wg";
	/**
	 * Days to consider unfirm transport request in MRP (Default) ＭＲＰ未確定移送依頼考慮日数（既定）.<p>
	 *
	 */
	public static final String $mrp_opn_xfr_days_mst = "mrp_opn_xfr_days_mst";
	/**
	 * Days to consider unfirm transport request in MRP ＭＲＰ未確定移送依頼考慮日数.<p>
	 *
	 */
	public static final String $mrp_opn_xfr_days = "mrp_opn_xfr_days";
	public static final String $qty_mst_p = "qty_mst_p";
	public static final String $qty_p = "qty_p";
	/**
	 * Allow input item addition (Default) 投入品追加許可（既定）.<p>
	 *
	 */
	public static final String $inpt_itm_add_flg = "inpt_itm_add_flg";
	/**
	 * Input item addition allowed type 投入品追加許可区分.<p>
	 *
	 */
	public static final String $inpt_itm_add_typ = "inpt_itm_add_typ";
	/**
	 * Allow input item addition type name 投入品追加許可区分名.<p>
	 *
	 */
	public static final String $inpt_itm_add_typ_nm = "inpt_itm_add_typ_nm";
	/**
	 * Allow input item deletion (Default) 投入品削除許可（既定）.<p>
	 *
	 */
	public static final String $inpt_itm_del_flg = "inpt_itm_del_flg";
	/**
	 * Input item deletion allowed type 投入品削除許可区分.<p>
	 *
	 */
	public static final String $inpt_itm_del_typ = "inpt_itm_del_typ";
	/**
	 * Allow input item deletion type name 投入品削除許可区分名.<p>
	 *
	 */
	public static final String $inpt_itm_del_typ_nm = "inpt_itm_del_typ_nm";
	/**
	 * Scheduler (Default) スケジューラ（既定）.<p>
	 *
	 */
	public static final String $sch_flg = "sch_flg";
	/**
	 * Scheduler target type スケジューラ対象区分.<p>
	 *
	 */
	public static final String $sch_tgt_typ = "sch_tgt_typ";
	/**
	 * Scheduler target type name スケジューラ対象区分名.<p>
	 *
	 */
	public static final String $sch_tgt_typ_nm = "sch_tgt_typ_nm";
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
	public static final String $rqmt_rstr_qty_mst = $qty_mst_p + ".qty";
	public static final String $rqmt_rstr_qty = $qty_p + ".qty";

	public static final MCMeta check_META = createCommonMeta($check, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta del_flg_META = createCommonMeta($del_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta itm_p_META = createInnerRowMeta($itm_p, mcframe.clientMAUB.MAUBP5030.ItmR.class);
	public static final MCMeta wg_cd_META = createCommonMeta($wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta wg_nm_META = createCommonMeta($wg_nm, mcframe.commonMA.meta.MA_META.WG_NM);
	public static final MCMeta mfg_inst_unit_typ_wg_META = createCommonMeta($mfg_inst_unit_typ_wg, mcframe.commonMA.meta.MA_META.MFG_INST_UNIT_TYP);
	public static final MCMeta mfg_inst_unit_typ_mst_META = createCommonMeta($mfg_inst_unit_typ_mst, mcframe.commonMA.meta.MA_META.MFG_INST_UNIT_TYP);
	public static final MCMeta mfg_inst_unit_typ_mst_nm_META = createCommonMeta($mfg_inst_unit_typ_mst_nm, mcframe.commonMA.meta.MA_META.MFG_INST_UNIT_TYP_NM);
	public static final MCMeta mfg_inst_unit_typ_META = createCommonMeta($mfg_inst_unit_typ, mcframe.commonMA.meta.MA_META.MFG_INST_UNIT_TYP);
	public static final MCMeta mfg_inst_unit_typ_nm_META = createCommonMeta($mfg_inst_unit_typ_nm, mcframe.commonMA.meta.MA_META.MFG_INST_UNIT_TYP_NM);
	public static final MCMeta mrp_proc_typ_wg_META = createCommonMeta($mrp_proc_typ_wg, mcframe.commonMA.meta.MA_META.MRP_PROC_TYP);
	public static final MCMeta mrp_proc_typ_mst_META = createCommonMeta($mrp_proc_typ_mst, mcframe.commonMA.meta.MA_META.MRP_PROC_TYP);
	public static final MCMeta mrp_proc_typ_mst_nm_META = createCommonMeta($mrp_proc_typ_mst_nm, mcframe.commonMA.meta.MA_META.MRP_PROC_TYP_NM);
	public static final MCMeta mrp_proc_typ_META = createCommonMeta($mrp_proc_typ, mcframe.commonMA.meta.MA_META.MRP_PROC_TYP);
	public static final MCMeta mrp_proc_typ_nm_META = createCommonMeta($mrp_proc_typ_nm, mcframe.commonMA.meta.MA_META.MRP_PROC_TYP_NM);
	public static final MCMeta rqmt_typ_wg_META = createCommonMeta($rqmt_typ_wg, mcframe.commonMA.meta.MA_META.RQMT_TYP);
	public static final MCMeta rqmt_typ_mst_META = createCommonMeta($rqmt_typ_mst, mcframe.commonMA.meta.MA_META.RQMT_TYP);
	public static final MCMeta rqmt_typ_mst_nm_META = createCommonMeta($rqmt_typ_mst_nm, mcframe.commonMA.meta.MA_META.RQMT_TYP_NM);
	public static final MCMeta rqmt_typ_META = createCommonMeta($rqmt_typ, mcframe.commonMA.meta.MA_META.RQMT_TYP);
	public static final MCMeta rqmt_typ_nm_META = createCommonMeta($rqmt_typ_nm, mcframe.commonMA.meta.MA_META.RQMT_TYP_NM);
	public static final MCMeta prod_pln_typ_wg_META = createCommonMeta($prod_pln_typ_wg, mcframe.commonMA.meta.MA_META.PROD_PLN_TYP);
	public static final MCMeta prod_pln_typ_mst_META = createCommonMeta($prod_pln_typ_mst, mcframe.commonMA.meta.MA_META.PROD_PLN_TYP);
	public static final MCMeta prod_pln_typ_mst_nm_META = createCommonMeta($prod_pln_typ_mst_nm, mcframe.commonMA.meta.MA_META.PROD_PLN_TYP_NM);
	public static final MCMeta prod_pln_typ_META = createCommonMeta($prod_pln_typ, mcframe.commonMA.meta.MA_META.PROD_PLN_TYP);
	public static final MCMeta prod_pln_typ_nm_META = createCommonMeta($prod_pln_typ_nm, mcframe.commonMA.meta.MA_META.PROD_PLN_TYP_NM);
	public static final MCMeta dmnd_date_div_mons_wg_META = createCommonMeta($dmnd_date_div_mons_wg, mcframe.commonMA.meta.MA_META.MONS);
	public static final MCMeta dmnd_date_div_mons_mst_META = createCommonMeta($dmnd_date_div_mons_mst, mcframe.commonMA.meta.MA_META.MONS);
	public static final MCMeta dmnd_date_div_mons_META = createCommonMeta($dmnd_date_div_mons, mcframe.commonMA.meta.MA_META.MONS);
	public static final MCMeta alloc_margin_days_wg_META = createCommonMeta($alloc_margin_days_wg, mcframe.commonMA.meta.MA_META.DAYS);
	public static final MCMeta alloc_margin_days_mst_META = createCommonMeta($alloc_margin_days_mst, mcframe.commonMA.meta.MA_META.DAYS);
	public static final MCMeta alloc_margin_days_META = createCommonMeta($alloc_margin_days, mcframe.commonMA.meta.MA_META.DAYS);
	public static final MCMeta mrp_alloc_margin_days_wg_META = createCommonMeta($mrp_alloc_margin_days_wg, mcframe.commonMA.meta.MA_META.DAYS);
	public static final MCMeta mrp_alloc_margin_days_mst_META = createCommonMeta($mrp_alloc_margin_days_mst, mcframe.commonMA.meta.MA_META.DAYS);
	public static final MCMeta mrp_alloc_margin_days_META = createCommonMeta($mrp_alloc_margin_days, mcframe.commonMA.meta.MA_META.DAYS);
	public static final MCMeta mrp_opn_xfr_days_wg_META = createCommonMeta($mrp_opn_xfr_days_wg, mcframe.commonMA.meta.MA_META.DAYS);
	public static final MCMeta mrp_opn_xfr_days_mst_META = createCommonMeta($mrp_opn_xfr_days_mst, mcframe.commonMA.meta.MA_META.DAYS);
	public static final MCMeta mrp_opn_xfr_days_META = createCommonMeta($mrp_opn_xfr_days, mcframe.commonMA.meta.MA_META.DAYS);
	public static final MCMeta qty_mst_p_META = createInnerRowMeta($qty_mst_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta qty_p_META = createInnerRowMeta($qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta inpt_itm_add_flg_META = createCommonMeta($inpt_itm_add_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta inpt_itm_add_typ_META = createCommonMeta($inpt_itm_add_typ, mcframe.commonMA.meta.MA_META.INPT_ITM_ADD_TYP);
	public static final MCMeta inpt_itm_add_typ_nm_META = createCommonMeta($inpt_itm_add_typ_nm, mcframe.commonMA.meta.MA_META.INPT_ITM_ADD_TYP_NM);
	public static final MCMeta inpt_itm_del_flg_META = createCommonMeta($inpt_itm_del_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta inpt_itm_del_typ_META = createCommonMeta($inpt_itm_del_typ, mcframe.commonMA.meta.MA_META.INPT_ITM_DEL_TYP);
	public static final MCMeta inpt_itm_del_typ_nm_META = createCommonMeta($inpt_itm_del_typ_nm, mcframe.commonMA.meta.MA_META.INPT_ITM_DEL_TYP_NM);
	public static final MCMeta sch_flg_META = createCommonMeta($sch_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sch_tgt_typ_META = createCommonMeta($sch_tgt_typ, mcframe.commonMA.meta.MA_META.SCH_TGT_TYP);
	public static final MCMeta sch_tgt_typ_nm_META = createCommonMeta($sch_tgt_typ_nm, mcframe.commonMA.meta.MA_META.SCH_TGT_TYP_NM);
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

	protected static final ConstMetaList<Wrk10DtlR> constMetas = new ConstMetaList<Wrk10DtlR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			check_META,
			del_flg_META,
			itm_p_META,
			wg_cd_META,
			wg_nm_META,
			mfg_inst_unit_typ_wg_META,
			mfg_inst_unit_typ_mst_META,
			mfg_inst_unit_typ_mst_nm_META,
			mfg_inst_unit_typ_META,
			mfg_inst_unit_typ_nm_META,
			mrp_proc_typ_wg_META,
			mrp_proc_typ_mst_META,
			mrp_proc_typ_mst_nm_META,
			mrp_proc_typ_META,
			mrp_proc_typ_nm_META,
			rqmt_typ_wg_META,
			rqmt_typ_mst_META,
			rqmt_typ_mst_nm_META,
			rqmt_typ_META,
			rqmt_typ_nm_META,
			prod_pln_typ_wg_META,
			prod_pln_typ_mst_META,
			prod_pln_typ_mst_nm_META,
			prod_pln_typ_META,
			prod_pln_typ_nm_META,
			dmnd_date_div_mons_wg_META,
			dmnd_date_div_mons_mst_META,
			dmnd_date_div_mons_META,
			alloc_margin_days_wg_META,
			alloc_margin_days_mst_META,
			alloc_margin_days_META,
			mrp_alloc_margin_days_wg_META,
			mrp_alloc_margin_days_mst_META,
			mrp_alloc_margin_days_META,
			mrp_opn_xfr_days_wg_META,
			mrp_opn_xfr_days_mst_META,
			mrp_opn_xfr_days_META,
			qty_mst_p_META,
			qty_p_META,
			inpt_itm_add_flg_META,
			inpt_itm_add_typ_META,
			inpt_itm_add_typ_nm_META,
			inpt_itm_del_flg_META,
			inpt_itm_del_typ_META,
			inpt_itm_del_typ_nm_META,
			sch_flg_META,
			sch_tgt_typ_META,
			sch_tgt_typ_nm_META,
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
				"rqmt_rstr_qty_mst",
				"rqmt_rstr_qty"
			},
			{
				$itm_cd,
				$itm_sub1,
				$itm_sub2,
				$itm_sub3,
				$rqmt_rstr_qty_mst,
				$rqmt_rstr_qty
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
			$wg_cd	// wg_cd
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
				{$wg_cd, "wg_nm;mfg_inst_unit_typ;mrp_proc_typ;rqmt_typ;prod_pln_typ;dmnd_date_div_mons;alloc_margin_days;mrp_alloc_margin_days;mrp_opn_xfr_days"},	// wg_cd
				{$mfg_inst_unit_typ_mst, "mfg_inst_unit_typ_nm"},	// mfg_inst_unit_typ_mst
				{$mrp_proc_typ_mst, "mrp_proc_typ_nm"},	// mrp_proc_typ_mst
				{$rqmt_typ_mst, "rqmt_typ_nm"},	// rqmt_typ_mst
				{$prod_pln_typ_mst, "prod_pln_typ_nm"}	// prod_pln_typ_mst
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
	protected Wrk10DtlR_MC_A(ConstMetaList<? extends Wrk10DtlR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Wrk10DtlR clone() {
		return (Wrk10DtlR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Wrk10DtlR createInstance() {
		return (Wrk10DtlR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Wrk10DtlR getValues(String... names) {
		return (Wrk10DtlR) super.getValues(names);
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
	 * Mfg. order unit type (WG) 製造指図単位区分（ＷＧ）.<p>
	 *
	 */
	public String mfg_inst_unit_typ_wg() {
		return getConstString(offset + 5, $mfg_inst_unit_typ_wg);
	}

	/**
	 * Mfg. order unit type (WG) 製造指図単位区分（ＷＧ）.<p>
	 *
	 */
	public void mfg_inst_unit_typ_wg(String value) {
		setConstString(offset + 5, $mfg_inst_unit_typ_wg, value);
	}


	/**
	 * Mfg. order unit type (Default) 製造指図単位区分（既定）.<p>
	 *
	 */
	public String mfg_inst_unit_typ_mst() {
		return getConstString(offset + 6, $mfg_inst_unit_typ_mst);
	}

	/**
	 * Mfg. order unit type (Default) 製造指図単位区分（既定）.<p>
	 *
	 */
	public void mfg_inst_unit_typ_mst(String value) {
		setConstString(offset + 6, $mfg_inst_unit_typ_mst, value);
	}


	/**
	 * Mfg. order unit type name (Default) 製造指図単位区分名（既定）.<p>
	 *
	 */
	public String mfg_inst_unit_typ_mst_nm() {
		return getConstString(offset + 7, $mfg_inst_unit_typ_mst_nm);
	}

	/**
	 * Mfg. order unit type name (Default) 製造指図単位区分名（既定）.<p>
	 *
	 */
	public void mfg_inst_unit_typ_mst_nm(String value) {
		setConstString(offset + 7, $mfg_inst_unit_typ_mst_nm, value);
	}


	/**
	 * Mfg. order unit type 製造指図単位区分.<p>
	 *
	 */
	public String mfg_inst_unit_typ() {
		return getConstString(offset + 8, $mfg_inst_unit_typ);
	}

	/**
	 * Mfg. order unit type 製造指図単位区分.<p>
	 *
	 */
	public void mfg_inst_unit_typ(String value) {
		setConstString(offset + 8, $mfg_inst_unit_typ, value);
	}


	/**
	 * Mfg. order unit type name 製造指図単位区分名.<p>
	 *
	 */
	public String mfg_inst_unit_typ_nm() {
		return getConstString(offset + 9, $mfg_inst_unit_typ_nm);
	}

	/**
	 * Mfg. order unit type name 製造指図単位区分名.<p>
	 *
	 */
	public void mfg_inst_unit_typ_nm(String value) {
		setConstString(offset + 9, $mfg_inst_unit_typ_nm, value);
	}


	/**
	 * MRP processing type (WG) ＭＲＰ処理区分（ＷＧ）.<p>
	 *
	 */
	public String mrp_proc_typ_wg() {
		return getConstString(offset + 10, $mrp_proc_typ_wg);
	}

	/**
	 * MRP processing type (WG) ＭＲＰ処理区分（ＷＧ）.<p>
	 *
	 */
	public void mrp_proc_typ_wg(String value) {
		setConstString(offset + 10, $mrp_proc_typ_wg, value);
	}


	/**
	 * MRP processing type (Default) ＭＲＰ処理区分（既定）.<p>
	 *
	 */
	public String mrp_proc_typ_mst() {
		return getConstString(offset + 11, $mrp_proc_typ_mst);
	}

	/**
	 * MRP processing type (Default) ＭＲＰ処理区分（既定）.<p>
	 *
	 */
	public void mrp_proc_typ_mst(String value) {
		setConstString(offset + 11, $mrp_proc_typ_mst, value);
	}


	/**
	 * MRP processing type name (Default) ＭＲＰ処理区分名（既定）.<p>
	 *
	 */
	public String mrp_proc_typ_mst_nm() {
		return getConstString(offset + 12, $mrp_proc_typ_mst_nm);
	}

	/**
	 * MRP processing type name (Default) ＭＲＰ処理区分名（既定）.<p>
	 *
	 */
	public void mrp_proc_typ_mst_nm(String value) {
		setConstString(offset + 12, $mrp_proc_typ_mst_nm, value);
	}


	/**
	 * MRP process type ＭＲＰ処理区分.<p>
	 *
	 */
	public String mrp_proc_typ() {
		return getConstString(offset + 13, $mrp_proc_typ);
	}

	/**
	 * MRP process type ＭＲＰ処理区分.<p>
	 *
	 */
	public void mrp_proc_typ(String value) {
		setConstString(offset + 13, $mrp_proc_typ, value);
	}


	/**
	 * MRP processing type name ＭＲＰ処理区分名.<p>
	 *
	 */
	public String mrp_proc_typ_nm() {
		return getConstString(offset + 14, $mrp_proc_typ_nm);
	}

	/**
	 * MRP processing type name ＭＲＰ処理区分名.<p>
	 *
	 */
	public void mrp_proc_typ_nm(String value) {
		setConstString(offset + 14, $mrp_proc_typ_nm, value);
	}


	/**
	 * Requirements type (WG) 所要区分（ＷＧ）.<p>
	 *
	 */
	public String rqmt_typ_wg() {
		return getConstString(offset + 15, $rqmt_typ_wg);
	}

	/**
	 * Requirements type (WG) 所要区分（ＷＧ）.<p>
	 *
	 */
	public void rqmt_typ_wg(String value) {
		setConstString(offset + 15, $rqmt_typ_wg, value);
	}


	/**
	 * Requirements type (Default) 所要区分（既定）.<p>
	 *
	 */
	public String rqmt_typ_mst() {
		return getConstString(offset + 16, $rqmt_typ_mst);
	}

	/**
	 * Requirements type (Default) 所要区分（既定）.<p>
	 *
	 */
	public void rqmt_typ_mst(String value) {
		setConstString(offset + 16, $rqmt_typ_mst, value);
	}


	/**
	 * Requirements type name (Default) 所要区分名（既定）.<p>
	 *
	 */
	public String rqmt_typ_mst_nm() {
		return getConstString(offset + 17, $rqmt_typ_mst_nm);
	}

	/**
	 * Requirements type name (Default) 所要区分名（既定）.<p>
	 *
	 */
	public void rqmt_typ_mst_nm(String value) {
		setConstString(offset + 17, $rqmt_typ_mst_nm, value);
	}


	/**
	 * Requirements type 所要区分.<p>
	 *
	 */
	public String rqmt_typ() {
		return getConstString(offset + 18, $rqmt_typ);
	}

	/**
	 * Requirements type 所要区分.<p>
	 *
	 */
	public void rqmt_typ(String value) {
		setConstString(offset + 18, $rqmt_typ, value);
	}


	/**
	 * Requirements type name 所要区分名.<p>
	 *
	 */
	public String rqmt_typ_nm() {
		return getConstString(offset + 19, $rqmt_typ_nm);
	}

	/**
	 * Requirements type name 所要区分名.<p>
	 *
	 */
	public void rqmt_typ_nm(String value) {
		setConstString(offset + 19, $rqmt_typ_nm, value);
	}


	/**
	 * Production planning type (WG) 生産計画立案区分（ＷＧ）.<p>
	 *
	 */
	public String prod_pln_typ_wg() {
		return getConstString(offset + 20, $prod_pln_typ_wg);
	}

	/**
	 * Production planning type (WG) 生産計画立案区分（ＷＧ）.<p>
	 *
	 */
	public void prod_pln_typ_wg(String value) {
		setConstString(offset + 20, $prod_pln_typ_wg, value);
	}


	/**
	 * Production planning type (Default) 生産計画立案区分（既定）.<p>
	 *
	 */
	public String prod_pln_typ_mst() {
		return getConstString(offset + 21, $prod_pln_typ_mst);
	}

	/**
	 * Production planning type (Default) 生産計画立案区分（既定）.<p>
	 *
	 */
	public void prod_pln_typ_mst(String value) {
		setConstString(offset + 21, $prod_pln_typ_mst, value);
	}


	/**
	 * Production planning type name (Default) 生産計画立案区分名（既定）.<p>
	 *
	 */
	public String prod_pln_typ_mst_nm() {
		return getConstString(offset + 22, $prod_pln_typ_mst_nm);
	}

	/**
	 * Production planning type name (Default) 生産計画立案区分名（既定）.<p>
	 *
	 */
	public void prod_pln_typ_mst_nm(String value) {
		setConstString(offset + 22, $prod_pln_typ_mst_nm, value);
	}


	/**
	 * Production planning type 生産計画立案区分.<p>
	 *
	 */
	public String prod_pln_typ() {
		return getConstString(offset + 23, $prod_pln_typ);
	}

	/**
	 * Production planning type 生産計画立案区分.<p>
	 *
	 */
	public void prod_pln_typ(String value) {
		setConstString(offset + 23, $prod_pln_typ, value);
	}


	/**
	 * Production planning type name 生産計画立案区分名.<p>
	 *
	 */
	public String prod_pln_typ_nm() {
		return getConstString(offset + 24, $prod_pln_typ_nm);
	}

	/**
	 * Production planning type name 生産計画立案区分名.<p>
	 *
	 */
	public void prod_pln_typ_nm(String value) {
		setConstString(offset + 24, $prod_pln_typ_nm, value);
	}


	/**
	 * Number of months for demand disaggregation by day (WG) 需要日ばらし月数（ＷＧ）.<p>
	 *
	 */
	public MCNumber dmnd_date_div_mons_wg() {
		return getConstNumber(offset + 25, $dmnd_date_div_mons_wg);
	}

	/**
	 * Number of months for demand disaggregation by day (WG) 需要日ばらし月数（ＷＧ）.<p>
	 *
	 */
	public void dmnd_date_div_mons_wg(MCNumber value) {
		setConstNumber(offset + 25, $dmnd_date_div_mons_wg, value);
	}

	/**
	 * Number of months for demand disaggregation by day (WG) 需要日ばらし月数（ＷＧ）.<p>
	 *
	 */
	public void dmnd_date_div_mons_wg(int value) {
		setConstNumber(offset + 25, $dmnd_date_div_mons_wg, value);
	}

	/**
	 * Number of months for demand disaggregation by day (WG) 需要日ばらし月数（ＷＧ）.<p>
	 *
	 */
	public void dmnd_date_div_mons_wg(long value) {
		setConstNumber(offset + 25, $dmnd_date_div_mons_wg, value);
	}

	/**
	 * Number of months for demand disaggregation by day (WG) 需要日ばらし月数（ＷＧ）.<p>
	 *
	 */
	public void dmnd_date_div_mons_wg(float value) {
		setConstNumber(offset + 25, $dmnd_date_div_mons_wg, value);
	}

	/**
	 * Number of months for demand disaggregation by day (WG) 需要日ばらし月数（ＷＧ）.<p>
	 *
	 */
	public void dmnd_date_div_mons_wg(double value) {
		setConstNumber(offset + 25, $dmnd_date_div_mons_wg, value);
	}


	/**
	 * Number of months for demand disaggregation by day (Default) 需要日ばらし月数（既定）.<p>
	 *
	 */
	public MCNumber dmnd_date_div_mons_mst() {
		return getConstNumber(offset + 26, $dmnd_date_div_mons_mst);
	}

	/**
	 * Number of months for demand disaggregation by day (Default) 需要日ばらし月数（既定）.<p>
	 *
	 */
	public void dmnd_date_div_mons_mst(MCNumber value) {
		setConstNumber(offset + 26, $dmnd_date_div_mons_mst, value);
	}

	/**
	 * Number of months for demand disaggregation by day (Default) 需要日ばらし月数（既定）.<p>
	 *
	 */
	public void dmnd_date_div_mons_mst(int value) {
		setConstNumber(offset + 26, $dmnd_date_div_mons_mst, value);
	}

	/**
	 * Number of months for demand disaggregation by day (Default) 需要日ばらし月数（既定）.<p>
	 *
	 */
	public void dmnd_date_div_mons_mst(long value) {
		setConstNumber(offset + 26, $dmnd_date_div_mons_mst, value);
	}

	/**
	 * Number of months for demand disaggregation by day (Default) 需要日ばらし月数（既定）.<p>
	 *
	 */
	public void dmnd_date_div_mons_mst(float value) {
		setConstNumber(offset + 26, $dmnd_date_div_mons_mst, value);
	}

	/**
	 * Number of months for demand disaggregation by day (Default) 需要日ばらし月数（既定）.<p>
	 *
	 */
	public void dmnd_date_div_mons_mst(double value) {
		setConstNumber(offset + 26, $dmnd_date_div_mons_mst, value);
	}


	/**
	 * Number of months for demand disaggregation by day 需要日ばらし月数.<p>
	 *
	 */
	public MCNumber dmnd_date_div_mons() {
		return getConstNumber(offset + 27, $dmnd_date_div_mons);
	}

	/**
	 * Number of months for demand disaggregation by day 需要日ばらし月数.<p>
	 *
	 */
	public void dmnd_date_div_mons(MCNumber value) {
		setConstNumber(offset + 27, $dmnd_date_div_mons, value);
	}

	/**
	 * Number of months for demand disaggregation by day 需要日ばらし月数.<p>
	 *
	 */
	public void dmnd_date_div_mons(int value) {
		setConstNumber(offset + 27, $dmnd_date_div_mons, value);
	}

	/**
	 * Number of months for demand disaggregation by day 需要日ばらし月数.<p>
	 *
	 */
	public void dmnd_date_div_mons(long value) {
		setConstNumber(offset + 27, $dmnd_date_div_mons, value);
	}

	/**
	 * Number of months for demand disaggregation by day 需要日ばらし月数.<p>
	 *
	 */
	public void dmnd_date_div_mons(float value) {
		setConstNumber(offset + 27, $dmnd_date_div_mons, value);
	}

	/**
	 * Number of months for demand disaggregation by day 需要日ばらし月数.<p>
	 *
	 */
	public void dmnd_date_div_mons(double value) {
		setConstNumber(offset + 27, $dmnd_date_div_mons, value);
	}


	/**
	 * Allocation extra days (WG) 引当余裕日数（ＷＧ）.<p>
	 *
	 */
	public MCNumber alloc_margin_days_wg() {
		return getConstNumber(offset + 28, $alloc_margin_days_wg);
	}

	/**
	 * Allocation extra days (WG) 引当余裕日数（ＷＧ）.<p>
	 *
	 */
	public void alloc_margin_days_wg(MCNumber value) {
		setConstNumber(offset + 28, $alloc_margin_days_wg, value);
	}

	/**
	 * Allocation extra days (WG) 引当余裕日数（ＷＧ）.<p>
	 *
	 */
	public void alloc_margin_days_wg(int value) {
		setConstNumber(offset + 28, $alloc_margin_days_wg, value);
	}

	/**
	 * Allocation extra days (WG) 引当余裕日数（ＷＧ）.<p>
	 *
	 */
	public void alloc_margin_days_wg(long value) {
		setConstNumber(offset + 28, $alloc_margin_days_wg, value);
	}

	/**
	 * Allocation extra days (WG) 引当余裕日数（ＷＧ）.<p>
	 *
	 */
	public void alloc_margin_days_wg(float value) {
		setConstNumber(offset + 28, $alloc_margin_days_wg, value);
	}

	/**
	 * Allocation extra days (WG) 引当余裕日数（ＷＧ）.<p>
	 *
	 */
	public void alloc_margin_days_wg(double value) {
		setConstNumber(offset + 28, $alloc_margin_days_wg, value);
	}


	/**
	 * Allocation extra days (Default) 引当余裕日数（既定）.<p>
	 *
	 */
	public MCNumber alloc_margin_days_mst() {
		return getConstNumber(offset + 29, $alloc_margin_days_mst);
	}

	/**
	 * Allocation extra days (Default) 引当余裕日数（既定）.<p>
	 *
	 */
	public void alloc_margin_days_mst(MCNumber value) {
		setConstNumber(offset + 29, $alloc_margin_days_mst, value);
	}

	/**
	 * Allocation extra days (Default) 引当余裕日数（既定）.<p>
	 *
	 */
	public void alloc_margin_days_mst(int value) {
		setConstNumber(offset + 29, $alloc_margin_days_mst, value);
	}

	/**
	 * Allocation extra days (Default) 引当余裕日数（既定）.<p>
	 *
	 */
	public void alloc_margin_days_mst(long value) {
		setConstNumber(offset + 29, $alloc_margin_days_mst, value);
	}

	/**
	 * Allocation extra days (Default) 引当余裕日数（既定）.<p>
	 *
	 */
	public void alloc_margin_days_mst(float value) {
		setConstNumber(offset + 29, $alloc_margin_days_mst, value);
	}

	/**
	 * Allocation extra days (Default) 引当余裕日数（既定）.<p>
	 *
	 */
	public void alloc_margin_days_mst(double value) {
		setConstNumber(offset + 29, $alloc_margin_days_mst, value);
	}


	/**
	 * Allocation extra days 引当余裕日数.<p>
	 *
	 */
	public MCNumber alloc_margin_days() {
		return getConstNumber(offset + 30, $alloc_margin_days);
	}

	/**
	 * Allocation extra days 引当余裕日数.<p>
	 *
	 */
	public void alloc_margin_days(MCNumber value) {
		setConstNumber(offset + 30, $alloc_margin_days, value);
	}

	/**
	 * Allocation extra days 引当余裕日数.<p>
	 *
	 */
	public void alloc_margin_days(int value) {
		setConstNumber(offset + 30, $alloc_margin_days, value);
	}

	/**
	 * Allocation extra days 引当余裕日数.<p>
	 *
	 */
	public void alloc_margin_days(long value) {
		setConstNumber(offset + 30, $alloc_margin_days, value);
	}

	/**
	 * Allocation extra days 引当余裕日数.<p>
	 *
	 */
	public void alloc_margin_days(float value) {
		setConstNumber(offset + 30, $alloc_margin_days, value);
	}

	/**
	 * Allocation extra days 引当余裕日数.<p>
	 *
	 */
	public void alloc_margin_days(double value) {
		setConstNumber(offset + 30, $alloc_margin_days, value);
	}


	/**
	 * MRP allocation extra days (WG) ＭＲＰ引当余裕日数（ＷＧ）.<p>
	 *
	 */
	public MCNumber mrp_alloc_margin_days_wg() {
		return getConstNumber(offset + 31, $mrp_alloc_margin_days_wg);
	}

	/**
	 * MRP allocation extra days (WG) ＭＲＰ引当余裕日数（ＷＧ）.<p>
	 *
	 */
	public void mrp_alloc_margin_days_wg(MCNumber value) {
		setConstNumber(offset + 31, $mrp_alloc_margin_days_wg, value);
	}

	/**
	 * MRP allocation extra days (WG) ＭＲＰ引当余裕日数（ＷＧ）.<p>
	 *
	 */
	public void mrp_alloc_margin_days_wg(int value) {
		setConstNumber(offset + 31, $mrp_alloc_margin_days_wg, value);
	}

	/**
	 * MRP allocation extra days (WG) ＭＲＰ引当余裕日数（ＷＧ）.<p>
	 *
	 */
	public void mrp_alloc_margin_days_wg(long value) {
		setConstNumber(offset + 31, $mrp_alloc_margin_days_wg, value);
	}

	/**
	 * MRP allocation extra days (WG) ＭＲＰ引当余裕日数（ＷＧ）.<p>
	 *
	 */
	public void mrp_alloc_margin_days_wg(float value) {
		setConstNumber(offset + 31, $mrp_alloc_margin_days_wg, value);
	}

	/**
	 * MRP allocation extra days (WG) ＭＲＰ引当余裕日数（ＷＧ）.<p>
	 *
	 */
	public void mrp_alloc_margin_days_wg(double value) {
		setConstNumber(offset + 31, $mrp_alloc_margin_days_wg, value);
	}


	/**
	 * MRP allocation extra days (Default) ＭＲＰ引当余裕日数（既定）.<p>
	 *
	 */
	public MCNumber mrp_alloc_margin_days_mst() {
		return getConstNumber(offset + 32, $mrp_alloc_margin_days_mst);
	}

	/**
	 * MRP allocation extra days (Default) ＭＲＰ引当余裕日数（既定）.<p>
	 *
	 */
	public void mrp_alloc_margin_days_mst(MCNumber value) {
		setConstNumber(offset + 32, $mrp_alloc_margin_days_mst, value);
	}

	/**
	 * MRP allocation extra days (Default) ＭＲＰ引当余裕日数（既定）.<p>
	 *
	 */
	public void mrp_alloc_margin_days_mst(int value) {
		setConstNumber(offset + 32, $mrp_alloc_margin_days_mst, value);
	}

	/**
	 * MRP allocation extra days (Default) ＭＲＰ引当余裕日数（既定）.<p>
	 *
	 */
	public void mrp_alloc_margin_days_mst(long value) {
		setConstNumber(offset + 32, $mrp_alloc_margin_days_mst, value);
	}

	/**
	 * MRP allocation extra days (Default) ＭＲＰ引当余裕日数（既定）.<p>
	 *
	 */
	public void mrp_alloc_margin_days_mst(float value) {
		setConstNumber(offset + 32, $mrp_alloc_margin_days_mst, value);
	}

	/**
	 * MRP allocation extra days (Default) ＭＲＰ引当余裕日数（既定）.<p>
	 *
	 */
	public void mrp_alloc_margin_days_mst(double value) {
		setConstNumber(offset + 32, $mrp_alloc_margin_days_mst, value);
	}


	/**
	 * MRP allocation extra days ＭＲＰ引当余裕日数.<p>
	 *
	 */
	public MCNumber mrp_alloc_margin_days() {
		return getConstNumber(offset + 33, $mrp_alloc_margin_days);
	}

	/**
	 * MRP allocation extra days ＭＲＰ引当余裕日数.<p>
	 *
	 */
	public void mrp_alloc_margin_days(MCNumber value) {
		setConstNumber(offset + 33, $mrp_alloc_margin_days, value);
	}

	/**
	 * MRP allocation extra days ＭＲＰ引当余裕日数.<p>
	 *
	 */
	public void mrp_alloc_margin_days(int value) {
		setConstNumber(offset + 33, $mrp_alloc_margin_days, value);
	}

	/**
	 * MRP allocation extra days ＭＲＰ引当余裕日数.<p>
	 *
	 */
	public void mrp_alloc_margin_days(long value) {
		setConstNumber(offset + 33, $mrp_alloc_margin_days, value);
	}

	/**
	 * MRP allocation extra days ＭＲＰ引当余裕日数.<p>
	 *
	 */
	public void mrp_alloc_margin_days(float value) {
		setConstNumber(offset + 33, $mrp_alloc_margin_days, value);
	}

	/**
	 * MRP allocation extra days ＭＲＰ引当余裕日数.<p>
	 *
	 */
	public void mrp_alloc_margin_days(double value) {
		setConstNumber(offset + 33, $mrp_alloc_margin_days, value);
	}


	/**
	 * Days to consider unfirm transport request in MRP (WG) ＭＲＰ未確定移送依頼考慮日数（ＷＧ）.<p>
	 *
	 */
	public MCNumber mrp_opn_xfr_days_wg() {
		return getConstNumber(offset + 34, $mrp_opn_xfr_days_wg);
	}

	/**
	 * Days to consider unfirm transport request in MRP (WG) ＭＲＰ未確定移送依頼考慮日数（ＷＧ）.<p>
	 *
	 */
	public void mrp_opn_xfr_days_wg(MCNumber value) {
		setConstNumber(offset + 34, $mrp_opn_xfr_days_wg, value);
	}

	/**
	 * Days to consider unfirm transport request in MRP (WG) ＭＲＰ未確定移送依頼考慮日数（ＷＧ）.<p>
	 *
	 */
	public void mrp_opn_xfr_days_wg(int value) {
		setConstNumber(offset + 34, $mrp_opn_xfr_days_wg, value);
	}

	/**
	 * Days to consider unfirm transport request in MRP (WG) ＭＲＰ未確定移送依頼考慮日数（ＷＧ）.<p>
	 *
	 */
	public void mrp_opn_xfr_days_wg(long value) {
		setConstNumber(offset + 34, $mrp_opn_xfr_days_wg, value);
	}

	/**
	 * Days to consider unfirm transport request in MRP (WG) ＭＲＰ未確定移送依頼考慮日数（ＷＧ）.<p>
	 *
	 */
	public void mrp_opn_xfr_days_wg(float value) {
		setConstNumber(offset + 34, $mrp_opn_xfr_days_wg, value);
	}

	/**
	 * Days to consider unfirm transport request in MRP (WG) ＭＲＰ未確定移送依頼考慮日数（ＷＧ）.<p>
	 *
	 */
	public void mrp_opn_xfr_days_wg(double value) {
		setConstNumber(offset + 34, $mrp_opn_xfr_days_wg, value);
	}


	/**
	 * Days to consider unfirm transport request in MRP (Default) ＭＲＰ未確定移送依頼考慮日数（既定）.<p>
	 *
	 */
	public MCNumber mrp_opn_xfr_days_mst() {
		return getConstNumber(offset + 35, $mrp_opn_xfr_days_mst);
	}

	/**
	 * Days to consider unfirm transport request in MRP (Default) ＭＲＰ未確定移送依頼考慮日数（既定）.<p>
	 *
	 */
	public void mrp_opn_xfr_days_mst(MCNumber value) {
		setConstNumber(offset + 35, $mrp_opn_xfr_days_mst, value);
	}

	/**
	 * Days to consider unfirm transport request in MRP (Default) ＭＲＰ未確定移送依頼考慮日数（既定）.<p>
	 *
	 */
	public void mrp_opn_xfr_days_mst(int value) {
		setConstNumber(offset + 35, $mrp_opn_xfr_days_mst, value);
	}

	/**
	 * Days to consider unfirm transport request in MRP (Default) ＭＲＰ未確定移送依頼考慮日数（既定）.<p>
	 *
	 */
	public void mrp_opn_xfr_days_mst(long value) {
		setConstNumber(offset + 35, $mrp_opn_xfr_days_mst, value);
	}

	/**
	 * Days to consider unfirm transport request in MRP (Default) ＭＲＰ未確定移送依頼考慮日数（既定）.<p>
	 *
	 */
	public void mrp_opn_xfr_days_mst(float value) {
		setConstNumber(offset + 35, $mrp_opn_xfr_days_mst, value);
	}

	/**
	 * Days to consider unfirm transport request in MRP (Default) ＭＲＰ未確定移送依頼考慮日数（既定）.<p>
	 *
	 */
	public void mrp_opn_xfr_days_mst(double value) {
		setConstNumber(offset + 35, $mrp_opn_xfr_days_mst, value);
	}


	/**
	 * Days to consider unfirm transport request in MRP ＭＲＰ未確定移送依頼考慮日数.<p>
	 *
	 */
	public MCNumber mrp_opn_xfr_days() {
		return getConstNumber(offset + 36, $mrp_opn_xfr_days);
	}

	/**
	 * Days to consider unfirm transport request in MRP ＭＲＰ未確定移送依頼考慮日数.<p>
	 *
	 */
	public void mrp_opn_xfr_days(MCNumber value) {
		setConstNumber(offset + 36, $mrp_opn_xfr_days, value);
	}

	/**
	 * Days to consider unfirm transport request in MRP ＭＲＰ未確定移送依頼考慮日数.<p>
	 *
	 */
	public void mrp_opn_xfr_days(int value) {
		setConstNumber(offset + 36, $mrp_opn_xfr_days, value);
	}

	/**
	 * Days to consider unfirm transport request in MRP ＭＲＰ未確定移送依頼考慮日数.<p>
	 *
	 */
	public void mrp_opn_xfr_days(long value) {
		setConstNumber(offset + 36, $mrp_opn_xfr_days, value);
	}

	/**
	 * Days to consider unfirm transport request in MRP ＭＲＰ未確定移送依頼考慮日数.<p>
	 *
	 */
	public void mrp_opn_xfr_days(float value) {
		setConstNumber(offset + 36, $mrp_opn_xfr_days, value);
	}

	/**
	 * Days to consider unfirm transport request in MRP ＭＲＰ未確定移送依頼考慮日数.<p>
	 *
	 */
	public void mrp_opn_xfr_days(double value) {
		setConstNumber(offset + 36, $mrp_opn_xfr_days, value);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR qty_mst_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 37, $qty_mst_p);
	}
	
	public void qty_mst_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 37, $qty_mst_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 38, $qty_p);
	}
	
	public void qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 38, $qty_p, row);
	}


	/**
	 * Allow input item addition (Default) 投入品追加許可（既定）.<p>
	 *
	 */
	public boolean inpt_itm_add_flg() {
		return getConstBoolean(offset + 39, $inpt_itm_add_flg);
	}

	/**
	 * Allow input item addition (Default) 投入品追加許可（既定）.<p>
	 *
	 */
	public void inpt_itm_add_flg(boolean value) {
		setConstBoolean(offset + 39, $inpt_itm_add_flg, value);
	}


	/**
	 * Input item addition allowed type 投入品追加許可区分.<p>
	 *
	 */
	public String inpt_itm_add_typ() {
		return getConstString(offset + 40, $inpt_itm_add_typ);
	}

	/**
	 * Input item addition allowed type 投入品追加許可区分.<p>
	 *
	 */
	public void inpt_itm_add_typ(String value) {
		setConstString(offset + 40, $inpt_itm_add_typ, value);
	}


	/**
	 * Allow input item addition type name 投入品追加許可区分名.<p>
	 *
	 */
	public String inpt_itm_add_typ_nm() {
		return getConstString(offset + 41, $inpt_itm_add_typ_nm);
	}

	/**
	 * Allow input item addition type name 投入品追加許可区分名.<p>
	 *
	 */
	public void inpt_itm_add_typ_nm(String value) {
		setConstString(offset + 41, $inpt_itm_add_typ_nm, value);
	}


	/**
	 * Allow input item deletion (Default) 投入品削除許可（既定）.<p>
	 *
	 */
	public boolean inpt_itm_del_flg() {
		return getConstBoolean(offset + 42, $inpt_itm_del_flg);
	}

	/**
	 * Allow input item deletion (Default) 投入品削除許可（既定）.<p>
	 *
	 */
	public void inpt_itm_del_flg(boolean value) {
		setConstBoolean(offset + 42, $inpt_itm_del_flg, value);
	}


	/**
	 * Input item deletion allowed type 投入品削除許可区分.<p>
	 *
	 */
	public String inpt_itm_del_typ() {
		return getConstString(offset + 43, $inpt_itm_del_typ);
	}

	/**
	 * Input item deletion allowed type 投入品削除許可区分.<p>
	 *
	 */
	public void inpt_itm_del_typ(String value) {
		setConstString(offset + 43, $inpt_itm_del_typ, value);
	}


	/**
	 * Allow input item deletion type name 投入品削除許可区分名.<p>
	 *
	 */
	public String inpt_itm_del_typ_nm() {
		return getConstString(offset + 44, $inpt_itm_del_typ_nm);
	}

	/**
	 * Allow input item deletion type name 投入品削除許可区分名.<p>
	 *
	 */
	public void inpt_itm_del_typ_nm(String value) {
		setConstString(offset + 44, $inpt_itm_del_typ_nm, value);
	}


	/**
	 * Scheduler (Default) スケジューラ（既定）.<p>
	 *
	 */
	public boolean sch_flg() {
		return getConstBoolean(offset + 45, $sch_flg);
	}

	/**
	 * Scheduler (Default) スケジューラ（既定）.<p>
	 *
	 */
	public void sch_flg(boolean value) {
		setConstBoolean(offset + 45, $sch_flg, value);
	}


	/**
	 * Scheduler target type スケジューラ対象区分.<p>
	 *
	 */
	public String sch_tgt_typ() {
		return getConstString(offset + 46, $sch_tgt_typ);
	}

	/**
	 * Scheduler target type スケジューラ対象区分.<p>
	 *
	 */
	public void sch_tgt_typ(String value) {
		setConstString(offset + 46, $sch_tgt_typ, value);
	}


	/**
	 * Scheduler target type name スケジューラ対象区分名.<p>
	 *
	 */
	public String sch_tgt_typ_nm() {
		return getConstString(offset + 47, $sch_tgt_typ_nm);
	}

	/**
	 * Scheduler target type name スケジューラ対象区分名.<p>
	 *
	 */
	public void sch_tgt_typ_nm(String value) {
		setConstString(offset + 47, $sch_tgt_typ_nm, value);
	}


	/**
	 * Memo 1 メモ１.<p>
	 *
	 */
	public String memo1() {
		return getConstString(offset + 48, $memo1);
	}

	/**
	 * Memo 1 メモ１.<p>
	 *
	 */
	public void memo1(String value) {
		setConstString(offset + 48, $memo1, value);
	}


	/**
	 * Memo 2 メモ２.<p>
	 *
	 */
	public String memo2() {
		return getConstString(offset + 49, $memo2);
	}

	/**
	 * Memo 2 メモ２.<p>
	 *
	 */
	public void memo2(String value) {
		setConstString(offset + 49, $memo2, value);
	}


	/**
	 * Memo 3 メモ３.<p>
	 *
	 */
	public String memo3() {
		return getConstString(offset + 50, $memo3);
	}

	/**
	 * Memo 3 メモ３.<p>
	 *
	 */
	public void memo3(String value) {
		setConstString(offset + 50, $memo3, value);
	}


	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public String ins_usr_id() {
		return getConstString(offset + 51, $ins_usr_id);
	}

	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public void ins_usr_id(String value) {
		setConstString(offset + 51, $ins_usr_id, value);
	}


	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public String ins_usr_nm() {
		return getConstString(offset + 52, $ins_usr_nm);
	}

	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public void ins_usr_nm(String value) {
		setConstString(offset + 52, $ins_usr_nm, value);
	}


	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public MCTimestamp ins_ts() {
		return getConstTimestamp(offset + 53, $ins_ts);
	}

	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public void ins_ts(MCTimestamp value) {
		setConstTimestamp(offset + 53, $ins_ts, value);
	}


	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public String ins_func_id() {
		return getConstString(offset + 54, $ins_func_id);
	}

	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public void ins_func_id(String value) {
		setConstString(offset + 54, $ins_func_id, value);
	}


	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public String ins_func_nm() {
		return getConstString(offset + 55, $ins_func_nm);
	}

	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public void ins_func_nm(String value) {
		setConstString(offset + 55, $ins_func_nm, value);
	}


	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public MCNumber upd_cntr() {
		return getConstNumber(offset + 56, $upd_cntr);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(MCNumber value) {
		setConstNumber(offset + 56, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(int value) {
		setConstNumber(offset + 56, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(long value) {
		setConstNumber(offset + 56, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(float value) {
		setConstNumber(offset + 56, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(double value) {
		setConstNumber(offset + 56, $upd_cntr, value);
	}


	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public String upd_usr_id() {
		return getConstString(offset + 57, $upd_usr_id);
	}

	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public void upd_usr_id(String value) {
		setConstString(offset + 57, $upd_usr_id, value);
	}


	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public String upd_usr_nm() {
		return getConstString(offset + 58, $upd_usr_nm);
	}

	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public void upd_usr_nm(String value) {
		setConstString(offset + 58, $upd_usr_nm, value);
	}


	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public MCTimestamp upd_ts() {
		return getConstTimestamp(offset + 59, $upd_ts);
	}

	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public void upd_ts(MCTimestamp value) {
		setConstTimestamp(offset + 59, $upd_ts, value);
	}


	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public String upd_func_id() {
		return getConstString(offset + 60, $upd_func_id);
	}

	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public void upd_func_id(String value) {
		setConstString(offset + 60, $upd_func_id, value);
	}


	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public String upd_func_nm() {
		return getConstString(offset + 61, $upd_func_nm);
	}

	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public void upd_func_nm(String value) {
		setConstString(offset + 61, $upd_func_nm, value);
	}


	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public String upd_srv_req_no() {
		return getConstString(offset + 62, $upd_srv_req_no);
	}

	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public void upd_srv_req_no(String value) {
		setConstString(offset + 62, $upd_srv_req_no, value);
	}


	/**
	 * Logical delete user ID 論理削除ユーザＩＤ.<p>
	 *
	 */
	public String del_usr_id() {
		return getConstString(offset + 63, $del_usr_id);
	}

	/**
	 * Logical delete user ID 論理削除ユーザＩＤ.<p>
	 *
	 */
	public void del_usr_id(String value) {
		setConstString(offset + 63, $del_usr_id, value);
	}


	/**
	 * Logical delete user name 論理削除ユーザ名.<p>
	 *
	 */
	public String del_usr_nm() {
		return getConstString(offset + 64, $del_usr_nm);
	}

	/**
	 * Logical delete user name 論理削除ユーザ名.<p>
	 *
	 */
	public void del_usr_nm(String value) {
		setConstString(offset + 64, $del_usr_nm, value);
	}


	/**
	 * Logical delete date and time 論理削除日時.<p>
	 *
	 */
	public MCTimestamp del_ts() {
		return getConstTimestamp(offset + 65, $del_ts);
	}

	/**
	 * Logical delete date and time 論理削除日時.<p>
	 *
	 */
	public void del_ts(MCTimestamp value) {
		setConstTimestamp(offset + 65, $del_ts, value);
	}


	public String getString(String name) {
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			return wg_nm();
		}
		if ($mfg_inst_unit_typ_wg.equalsIgnoreCase(name)) {
			return mfg_inst_unit_typ_wg();
		}
		if ($mfg_inst_unit_typ_mst.equalsIgnoreCase(name)) {
			return mfg_inst_unit_typ_mst();
		}
		if ($mfg_inst_unit_typ_mst_nm.equalsIgnoreCase(name)) {
			return mfg_inst_unit_typ_mst_nm();
		}
		if ($mfg_inst_unit_typ.equalsIgnoreCase(name)) {
			return mfg_inst_unit_typ();
		}
		if ($mfg_inst_unit_typ_nm.equalsIgnoreCase(name)) {
			return mfg_inst_unit_typ_nm();
		}
		if ($mrp_proc_typ_wg.equalsIgnoreCase(name)) {
			return mrp_proc_typ_wg();
		}
		if ($mrp_proc_typ_mst.equalsIgnoreCase(name)) {
			return mrp_proc_typ_mst();
		}
		if ($mrp_proc_typ_mst_nm.equalsIgnoreCase(name)) {
			return mrp_proc_typ_mst_nm();
		}
		if ($mrp_proc_typ.equalsIgnoreCase(name)) {
			return mrp_proc_typ();
		}
		if ($mrp_proc_typ_nm.equalsIgnoreCase(name)) {
			return mrp_proc_typ_nm();
		}
		if ($rqmt_typ_wg.equalsIgnoreCase(name)) {
			return rqmt_typ_wg();
		}
		if ($rqmt_typ_mst.equalsIgnoreCase(name)) {
			return rqmt_typ_mst();
		}
		if ($rqmt_typ_mst_nm.equalsIgnoreCase(name)) {
			return rqmt_typ_mst_nm();
		}
		if ($rqmt_typ.equalsIgnoreCase(name)) {
			return rqmt_typ();
		}
		if ($rqmt_typ_nm.equalsIgnoreCase(name)) {
			return rqmt_typ_nm();
		}
		if ($prod_pln_typ_wg.equalsIgnoreCase(name)) {
			return prod_pln_typ_wg();
		}
		if ($prod_pln_typ_mst.equalsIgnoreCase(name)) {
			return prod_pln_typ_mst();
		}
		if ($prod_pln_typ_mst_nm.equalsIgnoreCase(name)) {
			return prod_pln_typ_mst_nm();
		}
		if ($prod_pln_typ.equalsIgnoreCase(name)) {
			return prod_pln_typ();
		}
		if ($prod_pln_typ_nm.equalsIgnoreCase(name)) {
			return prod_pln_typ_nm();
		}
		if ($inpt_itm_add_typ.equalsIgnoreCase(name)) {
			return inpt_itm_add_typ();
		}
		if ($inpt_itm_add_typ_nm.equalsIgnoreCase(name)) {
			return inpt_itm_add_typ_nm();
		}
		if ($inpt_itm_del_typ.equalsIgnoreCase(name)) {
			return inpt_itm_del_typ();
		}
		if ($inpt_itm_del_typ_nm.equalsIgnoreCase(name)) {
			return inpt_itm_del_typ_nm();
		}
		if ($sch_tgt_typ.equalsIgnoreCase(name)) {
			return sch_tgt_typ();
		}
		if ($sch_tgt_typ_nm.equalsIgnoreCase(name)) {
			return sch_tgt_typ_nm();
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
		if ($dmnd_date_div_mons_wg.equalsIgnoreCase(name)) {
			return dmnd_date_div_mons_wg();
		}
		if ($dmnd_date_div_mons_mst.equalsIgnoreCase(name)) {
			return dmnd_date_div_mons_mst();
		}
		if ($dmnd_date_div_mons.equalsIgnoreCase(name)) {
			return dmnd_date_div_mons();
		}
		if ($alloc_margin_days_wg.equalsIgnoreCase(name)) {
			return alloc_margin_days_wg();
		}
		if ($alloc_margin_days_mst.equalsIgnoreCase(name)) {
			return alloc_margin_days_mst();
		}
		if ($alloc_margin_days.equalsIgnoreCase(name)) {
			return alloc_margin_days();
		}
		if ($mrp_alloc_margin_days_wg.equalsIgnoreCase(name)) {
			return mrp_alloc_margin_days_wg();
		}
		if ($mrp_alloc_margin_days_mst.equalsIgnoreCase(name)) {
			return mrp_alloc_margin_days_mst();
		}
		if ($mrp_alloc_margin_days.equalsIgnoreCase(name)) {
			return mrp_alloc_margin_days();
		}
		if ($mrp_opn_xfr_days_wg.equalsIgnoreCase(name)) {
			return mrp_opn_xfr_days_wg();
		}
		if ($mrp_opn_xfr_days_mst.equalsIgnoreCase(name)) {
			return mrp_opn_xfr_days_mst();
		}
		if ($mrp_opn_xfr_days.equalsIgnoreCase(name)) {
			return mrp_opn_xfr_days();
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
		if ($inpt_itm_add_flg.equalsIgnoreCase(name)) {
			return inpt_itm_add_flg();
		}
		if ($inpt_itm_del_flg.equalsIgnoreCase(name)) {
			return inpt_itm_del_flg();
		}
		if ($sch_flg.equalsIgnoreCase(name)) {
			return sch_flg();
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
		if ($mfg_inst_unit_typ_wg.equalsIgnoreCase(name)) {
			return mfg_inst_unit_typ_wg();
		}
		if ($mfg_inst_unit_typ_mst.equalsIgnoreCase(name)) {
			return mfg_inst_unit_typ_mst();
		}
		if ($mfg_inst_unit_typ_mst_nm.equalsIgnoreCase(name)) {
			return mfg_inst_unit_typ_mst_nm();
		}
		if ($mfg_inst_unit_typ.equalsIgnoreCase(name)) {
			return mfg_inst_unit_typ();
		}
		if ($mfg_inst_unit_typ_nm.equalsIgnoreCase(name)) {
			return mfg_inst_unit_typ_nm();
		}
		if ($mrp_proc_typ_wg.equalsIgnoreCase(name)) {
			return mrp_proc_typ_wg();
		}
		if ($mrp_proc_typ_mst.equalsIgnoreCase(name)) {
			return mrp_proc_typ_mst();
		}
		if ($mrp_proc_typ_mst_nm.equalsIgnoreCase(name)) {
			return mrp_proc_typ_mst_nm();
		}
		if ($mrp_proc_typ.equalsIgnoreCase(name)) {
			return mrp_proc_typ();
		}
		if ($mrp_proc_typ_nm.equalsIgnoreCase(name)) {
			return mrp_proc_typ_nm();
		}
		if ($rqmt_typ_wg.equalsIgnoreCase(name)) {
			return rqmt_typ_wg();
		}
		if ($rqmt_typ_mst.equalsIgnoreCase(name)) {
			return rqmt_typ_mst();
		}
		if ($rqmt_typ_mst_nm.equalsIgnoreCase(name)) {
			return rqmt_typ_mst_nm();
		}
		if ($rqmt_typ.equalsIgnoreCase(name)) {
			return rqmt_typ();
		}
		if ($rqmt_typ_nm.equalsIgnoreCase(name)) {
			return rqmt_typ_nm();
		}
		if ($prod_pln_typ_wg.equalsIgnoreCase(name)) {
			return prod_pln_typ_wg();
		}
		if ($prod_pln_typ_mst.equalsIgnoreCase(name)) {
			return prod_pln_typ_mst();
		}
		if ($prod_pln_typ_mst_nm.equalsIgnoreCase(name)) {
			return prod_pln_typ_mst_nm();
		}
		if ($prod_pln_typ.equalsIgnoreCase(name)) {
			return prod_pln_typ();
		}
		if ($prod_pln_typ_nm.equalsIgnoreCase(name)) {
			return prod_pln_typ_nm();
		}
		if ($inpt_itm_add_typ.equalsIgnoreCase(name)) {
			return inpt_itm_add_typ();
		}
		if ($inpt_itm_add_typ_nm.equalsIgnoreCase(name)) {
			return inpt_itm_add_typ_nm();
		}
		if ($inpt_itm_del_typ.equalsIgnoreCase(name)) {
			return inpt_itm_del_typ();
		}
		if ($inpt_itm_del_typ_nm.equalsIgnoreCase(name)) {
			return inpt_itm_del_typ_nm();
		}
		if ($sch_tgt_typ.equalsIgnoreCase(name)) {
			return sch_tgt_typ();
		}
		if ($sch_tgt_typ_nm.equalsIgnoreCase(name)) {
			return sch_tgt_typ_nm();
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
		if ($dmnd_date_div_mons_wg.equalsIgnoreCase(name)) {
			return dmnd_date_div_mons_wg();
		}
		if ($dmnd_date_div_mons_mst.equalsIgnoreCase(name)) {
			return dmnd_date_div_mons_mst();
		}
		if ($dmnd_date_div_mons.equalsIgnoreCase(name)) {
			return dmnd_date_div_mons();
		}
		if ($alloc_margin_days_wg.equalsIgnoreCase(name)) {
			return alloc_margin_days_wg();
		}
		if ($alloc_margin_days_mst.equalsIgnoreCase(name)) {
			return alloc_margin_days_mst();
		}
		if ($alloc_margin_days.equalsIgnoreCase(name)) {
			return alloc_margin_days();
		}
		if ($mrp_alloc_margin_days_wg.equalsIgnoreCase(name)) {
			return mrp_alloc_margin_days_wg();
		}
		if ($mrp_alloc_margin_days_mst.equalsIgnoreCase(name)) {
			return mrp_alloc_margin_days_mst();
		}
		if ($mrp_alloc_margin_days.equalsIgnoreCase(name)) {
			return mrp_alloc_margin_days();
		}
		if ($mrp_opn_xfr_days_wg.equalsIgnoreCase(name)) {
			return mrp_opn_xfr_days_wg();
		}
		if ($mrp_opn_xfr_days_mst.equalsIgnoreCase(name)) {
			return mrp_opn_xfr_days_mst();
		}
		if ($mrp_opn_xfr_days.equalsIgnoreCase(name)) {
			return mrp_opn_xfr_days();
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
		if ($inpt_itm_add_flg.equalsIgnoreCase(name)) {
			return inpt_itm_add_flg();
		}
		if ($inpt_itm_del_flg.equalsIgnoreCase(name)) {
			return inpt_itm_del_flg();
		}
		if ($sch_flg.equalsIgnoreCase(name)) {
			return sch_flg();
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
		if ($mfg_inst_unit_typ_wg.equalsIgnoreCase(name)) {
			mfg_inst_unit_typ_wg(value);
			return;
		}
		if ($mfg_inst_unit_typ_mst.equalsIgnoreCase(name)) {
			mfg_inst_unit_typ_mst(value);
			return;
		}
		if ($mfg_inst_unit_typ_mst_nm.equalsIgnoreCase(name)) {
			mfg_inst_unit_typ_mst_nm(value);
			return;
		}
		if ($mfg_inst_unit_typ.equalsIgnoreCase(name)) {
			mfg_inst_unit_typ(value);
			return;
		}
		if ($mfg_inst_unit_typ_nm.equalsIgnoreCase(name)) {
			mfg_inst_unit_typ_nm(value);
			return;
		}
		if ($mrp_proc_typ_wg.equalsIgnoreCase(name)) {
			mrp_proc_typ_wg(value);
			return;
		}
		if ($mrp_proc_typ_mst.equalsIgnoreCase(name)) {
			mrp_proc_typ_mst(value);
			return;
		}
		if ($mrp_proc_typ_mst_nm.equalsIgnoreCase(name)) {
			mrp_proc_typ_mst_nm(value);
			return;
		}
		if ($mrp_proc_typ.equalsIgnoreCase(name)) {
			mrp_proc_typ(value);
			return;
		}
		if ($mrp_proc_typ_nm.equalsIgnoreCase(name)) {
			mrp_proc_typ_nm(value);
			return;
		}
		if ($rqmt_typ_wg.equalsIgnoreCase(name)) {
			rqmt_typ_wg(value);
			return;
		}
		if ($rqmt_typ_mst.equalsIgnoreCase(name)) {
			rqmt_typ_mst(value);
			return;
		}
		if ($rqmt_typ_mst_nm.equalsIgnoreCase(name)) {
			rqmt_typ_mst_nm(value);
			return;
		}
		if ($rqmt_typ.equalsIgnoreCase(name)) {
			rqmt_typ(value);
			return;
		}
		if ($rqmt_typ_nm.equalsIgnoreCase(name)) {
			rqmt_typ_nm(value);
			return;
		}
		if ($prod_pln_typ_wg.equalsIgnoreCase(name)) {
			prod_pln_typ_wg(value);
			return;
		}
		if ($prod_pln_typ_mst.equalsIgnoreCase(name)) {
			prod_pln_typ_mst(value);
			return;
		}
		if ($prod_pln_typ_mst_nm.equalsIgnoreCase(name)) {
			prod_pln_typ_mst_nm(value);
			return;
		}
		if ($prod_pln_typ.equalsIgnoreCase(name)) {
			prod_pln_typ(value);
			return;
		}
		if ($prod_pln_typ_nm.equalsIgnoreCase(name)) {
			prod_pln_typ_nm(value);
			return;
		}
		if ($inpt_itm_add_typ.equalsIgnoreCase(name)) {
			inpt_itm_add_typ(value);
			return;
		}
		if ($inpt_itm_add_typ_nm.equalsIgnoreCase(name)) {
			inpt_itm_add_typ_nm(value);
			return;
		}
		if ($inpt_itm_del_typ.equalsIgnoreCase(name)) {
			inpt_itm_del_typ(value);
			return;
		}
		if ($inpt_itm_del_typ_nm.equalsIgnoreCase(name)) {
			inpt_itm_del_typ_nm(value);
			return;
		}
		if ($sch_tgt_typ.equalsIgnoreCase(name)) {
			sch_tgt_typ(value);
			return;
		}
		if ($sch_tgt_typ_nm.equalsIgnoreCase(name)) {
			sch_tgt_typ_nm(value);
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
		if ($dmnd_date_div_mons_wg.equalsIgnoreCase(name)) {
			dmnd_date_div_mons_wg(value);
			return;
		}
		if ($dmnd_date_div_mons_mst.equalsIgnoreCase(name)) {
			dmnd_date_div_mons_mst(value);
			return;
		}
		if ($dmnd_date_div_mons.equalsIgnoreCase(name)) {
			dmnd_date_div_mons(value);
			return;
		}
		if ($alloc_margin_days_wg.equalsIgnoreCase(name)) {
			alloc_margin_days_wg(value);
			return;
		}
		if ($alloc_margin_days_mst.equalsIgnoreCase(name)) {
			alloc_margin_days_mst(value);
			return;
		}
		if ($alloc_margin_days.equalsIgnoreCase(name)) {
			alloc_margin_days(value);
			return;
		}
		if ($mrp_alloc_margin_days_wg.equalsIgnoreCase(name)) {
			mrp_alloc_margin_days_wg(value);
			return;
		}
		if ($mrp_alloc_margin_days_mst.equalsIgnoreCase(name)) {
			mrp_alloc_margin_days_mst(value);
			return;
		}
		if ($mrp_alloc_margin_days.equalsIgnoreCase(name)) {
			mrp_alloc_margin_days(value);
			return;
		}
		if ($mrp_opn_xfr_days_wg.equalsIgnoreCase(name)) {
			mrp_opn_xfr_days_wg(value);
			return;
		}
		if ($mrp_opn_xfr_days_mst.equalsIgnoreCase(name)) {
			mrp_opn_xfr_days_mst(value);
			return;
		}
		if ($mrp_opn_xfr_days.equalsIgnoreCase(name)) {
			mrp_opn_xfr_days(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($dmnd_date_div_mons_wg.equalsIgnoreCase(name)) {
			dmnd_date_div_mons_wg(value);
			return;
		}
		if ($dmnd_date_div_mons_mst.equalsIgnoreCase(name)) {
			dmnd_date_div_mons_mst(value);
			return;
		}
		if ($dmnd_date_div_mons.equalsIgnoreCase(name)) {
			dmnd_date_div_mons(value);
			return;
		}
		if ($alloc_margin_days_wg.equalsIgnoreCase(name)) {
			alloc_margin_days_wg(value);
			return;
		}
		if ($alloc_margin_days_mst.equalsIgnoreCase(name)) {
			alloc_margin_days_mst(value);
			return;
		}
		if ($alloc_margin_days.equalsIgnoreCase(name)) {
			alloc_margin_days(value);
			return;
		}
		if ($mrp_alloc_margin_days_wg.equalsIgnoreCase(name)) {
			mrp_alloc_margin_days_wg(value);
			return;
		}
		if ($mrp_alloc_margin_days_mst.equalsIgnoreCase(name)) {
			mrp_alloc_margin_days_mst(value);
			return;
		}
		if ($mrp_alloc_margin_days.equalsIgnoreCase(name)) {
			mrp_alloc_margin_days(value);
			return;
		}
		if ($mrp_opn_xfr_days_wg.equalsIgnoreCase(name)) {
			mrp_opn_xfr_days_wg(value);
			return;
		}
		if ($mrp_opn_xfr_days_mst.equalsIgnoreCase(name)) {
			mrp_opn_xfr_days_mst(value);
			return;
		}
		if ($mrp_opn_xfr_days.equalsIgnoreCase(name)) {
			mrp_opn_xfr_days(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($dmnd_date_div_mons_wg.equalsIgnoreCase(name)) {
			dmnd_date_div_mons_wg(value);
			return;
		}
		if ($dmnd_date_div_mons_mst.equalsIgnoreCase(name)) {
			dmnd_date_div_mons_mst(value);
			return;
		}
		if ($dmnd_date_div_mons.equalsIgnoreCase(name)) {
			dmnd_date_div_mons(value);
			return;
		}
		if ($alloc_margin_days_wg.equalsIgnoreCase(name)) {
			alloc_margin_days_wg(value);
			return;
		}
		if ($alloc_margin_days_mst.equalsIgnoreCase(name)) {
			alloc_margin_days_mst(value);
			return;
		}
		if ($alloc_margin_days.equalsIgnoreCase(name)) {
			alloc_margin_days(value);
			return;
		}
		if ($mrp_alloc_margin_days_wg.equalsIgnoreCase(name)) {
			mrp_alloc_margin_days_wg(value);
			return;
		}
		if ($mrp_alloc_margin_days_mst.equalsIgnoreCase(name)) {
			mrp_alloc_margin_days_mst(value);
			return;
		}
		if ($mrp_alloc_margin_days.equalsIgnoreCase(name)) {
			mrp_alloc_margin_days(value);
			return;
		}
		if ($mrp_opn_xfr_days_wg.equalsIgnoreCase(name)) {
			mrp_opn_xfr_days_wg(value);
			return;
		}
		if ($mrp_opn_xfr_days_mst.equalsIgnoreCase(name)) {
			mrp_opn_xfr_days_mst(value);
			return;
		}
		if ($mrp_opn_xfr_days.equalsIgnoreCase(name)) {
			mrp_opn_xfr_days(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($dmnd_date_div_mons_wg.equalsIgnoreCase(name)) {
			dmnd_date_div_mons_wg(value);
			return;
		}
		if ($dmnd_date_div_mons_mst.equalsIgnoreCase(name)) {
			dmnd_date_div_mons_mst(value);
			return;
		}
		if ($dmnd_date_div_mons.equalsIgnoreCase(name)) {
			dmnd_date_div_mons(value);
			return;
		}
		if ($alloc_margin_days_wg.equalsIgnoreCase(name)) {
			alloc_margin_days_wg(value);
			return;
		}
		if ($alloc_margin_days_mst.equalsIgnoreCase(name)) {
			alloc_margin_days_mst(value);
			return;
		}
		if ($alloc_margin_days.equalsIgnoreCase(name)) {
			alloc_margin_days(value);
			return;
		}
		if ($mrp_alloc_margin_days_wg.equalsIgnoreCase(name)) {
			mrp_alloc_margin_days_wg(value);
			return;
		}
		if ($mrp_alloc_margin_days_mst.equalsIgnoreCase(name)) {
			mrp_alloc_margin_days_mst(value);
			return;
		}
		if ($mrp_alloc_margin_days.equalsIgnoreCase(name)) {
			mrp_alloc_margin_days(value);
			return;
		}
		if ($mrp_opn_xfr_days_wg.equalsIgnoreCase(name)) {
			mrp_opn_xfr_days_wg(value);
			return;
		}
		if ($mrp_opn_xfr_days_mst.equalsIgnoreCase(name)) {
			mrp_opn_xfr_days_mst(value);
			return;
		}
		if ($mrp_opn_xfr_days.equalsIgnoreCase(name)) {
			mrp_opn_xfr_days(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($dmnd_date_div_mons_wg.equalsIgnoreCase(name)) {
			dmnd_date_div_mons_wg(value);
			return;
		}
		if ($dmnd_date_div_mons_mst.equalsIgnoreCase(name)) {
			dmnd_date_div_mons_mst(value);
			return;
		}
		if ($dmnd_date_div_mons.equalsIgnoreCase(name)) {
			dmnd_date_div_mons(value);
			return;
		}
		if ($alloc_margin_days_wg.equalsIgnoreCase(name)) {
			alloc_margin_days_wg(value);
			return;
		}
		if ($alloc_margin_days_mst.equalsIgnoreCase(name)) {
			alloc_margin_days_mst(value);
			return;
		}
		if ($alloc_margin_days.equalsIgnoreCase(name)) {
			alloc_margin_days(value);
			return;
		}
		if ($mrp_alloc_margin_days_wg.equalsIgnoreCase(name)) {
			mrp_alloc_margin_days_wg(value);
			return;
		}
		if ($mrp_alloc_margin_days_mst.equalsIgnoreCase(name)) {
			mrp_alloc_margin_days_mst(value);
			return;
		}
		if ($mrp_alloc_margin_days.equalsIgnoreCase(name)) {
			mrp_alloc_margin_days(value);
			return;
		}
		if ($mrp_opn_xfr_days_wg.equalsIgnoreCase(name)) {
			mrp_opn_xfr_days_wg(value);
			return;
		}
		if ($mrp_opn_xfr_days_mst.equalsIgnoreCase(name)) {
			mrp_opn_xfr_days_mst(value);
			return;
		}
		if ($mrp_opn_xfr_days.equalsIgnoreCase(name)) {
			mrp_opn_xfr_days(value);
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
		if ($inpt_itm_add_flg.equalsIgnoreCase(name)) {
			inpt_itm_add_flg(value);
			return;
		}
		if ($inpt_itm_del_flg.equalsIgnoreCase(name)) {
			inpt_itm_del_flg(value);
			return;
		}
		if ($sch_flg.equalsIgnoreCase(name)) {
			sch_flg(value);
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
		if ($mfg_inst_unit_typ_wg.equalsIgnoreCase(name)) {
			mfg_inst_unit_typ_wg(value);
			return;
		}
		if ($mfg_inst_unit_typ_mst.equalsIgnoreCase(name)) {
			mfg_inst_unit_typ_mst(value);
			return;
		}
		if ($mfg_inst_unit_typ_mst_nm.equalsIgnoreCase(name)) {
			mfg_inst_unit_typ_mst_nm(value);
			return;
		}
		if ($mfg_inst_unit_typ.equalsIgnoreCase(name)) {
			mfg_inst_unit_typ(value);
			return;
		}
		if ($mfg_inst_unit_typ_nm.equalsIgnoreCase(name)) {
			mfg_inst_unit_typ_nm(value);
			return;
		}
		if ($mrp_proc_typ_wg.equalsIgnoreCase(name)) {
			mrp_proc_typ_wg(value);
			return;
		}
		if ($mrp_proc_typ_mst.equalsIgnoreCase(name)) {
			mrp_proc_typ_mst(value);
			return;
		}
		if ($mrp_proc_typ_mst_nm.equalsIgnoreCase(name)) {
			mrp_proc_typ_mst_nm(value);
			return;
		}
		if ($mrp_proc_typ.equalsIgnoreCase(name)) {
			mrp_proc_typ(value);
			return;
		}
		if ($mrp_proc_typ_nm.equalsIgnoreCase(name)) {
			mrp_proc_typ_nm(value);
			return;
		}
		if ($rqmt_typ_wg.equalsIgnoreCase(name)) {
			rqmt_typ_wg(value);
			return;
		}
		if ($rqmt_typ_mst.equalsIgnoreCase(name)) {
			rqmt_typ_mst(value);
			return;
		}
		if ($rqmt_typ_mst_nm.equalsIgnoreCase(name)) {
			rqmt_typ_mst_nm(value);
			return;
		}
		if ($rqmt_typ.equalsIgnoreCase(name)) {
			rqmt_typ(value);
			return;
		}
		if ($rqmt_typ_nm.equalsIgnoreCase(name)) {
			rqmt_typ_nm(value);
			return;
		}
		if ($prod_pln_typ_wg.equalsIgnoreCase(name)) {
			prod_pln_typ_wg(value);
			return;
		}
		if ($prod_pln_typ_mst.equalsIgnoreCase(name)) {
			prod_pln_typ_mst(value);
			return;
		}
		if ($prod_pln_typ_mst_nm.equalsIgnoreCase(name)) {
			prod_pln_typ_mst_nm(value);
			return;
		}
		if ($prod_pln_typ.equalsIgnoreCase(name)) {
			prod_pln_typ(value);
			return;
		}
		if ($prod_pln_typ_nm.equalsIgnoreCase(name)) {
			prod_pln_typ_nm(value);
			return;
		}
		if ($inpt_itm_add_typ.equalsIgnoreCase(name)) {
			inpt_itm_add_typ(value);
			return;
		}
		if ($inpt_itm_add_typ_nm.equalsIgnoreCase(name)) {
			inpt_itm_add_typ_nm(value);
			return;
		}
		if ($inpt_itm_del_typ.equalsIgnoreCase(name)) {
			inpt_itm_del_typ(value);
			return;
		}
		if ($inpt_itm_del_typ_nm.equalsIgnoreCase(name)) {
			inpt_itm_del_typ_nm(value);
			return;
		}
		if ($sch_tgt_typ.equalsIgnoreCase(name)) {
			sch_tgt_typ(value);
			return;
		}
		if ($sch_tgt_typ_nm.equalsIgnoreCase(name)) {
			sch_tgt_typ_nm(value);
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
		if ($dmnd_date_div_mons_wg.equalsIgnoreCase(name)) {
			dmnd_date_div_mons_wg(value);
			return;
		}
		if ($dmnd_date_div_mons_mst.equalsIgnoreCase(name)) {
			dmnd_date_div_mons_mst(value);
			return;
		}
		if ($dmnd_date_div_mons.equalsIgnoreCase(name)) {
			dmnd_date_div_mons(value);
			return;
		}
		if ($alloc_margin_days_wg.equalsIgnoreCase(name)) {
			alloc_margin_days_wg(value);
			return;
		}
		if ($alloc_margin_days_mst.equalsIgnoreCase(name)) {
			alloc_margin_days_mst(value);
			return;
		}
		if ($alloc_margin_days.equalsIgnoreCase(name)) {
			alloc_margin_days(value);
			return;
		}
		if ($mrp_alloc_margin_days_wg.equalsIgnoreCase(name)) {
			mrp_alloc_margin_days_wg(value);
			return;
		}
		if ($mrp_alloc_margin_days_mst.equalsIgnoreCase(name)) {
			mrp_alloc_margin_days_mst(value);
			return;
		}
		if ($mrp_alloc_margin_days.equalsIgnoreCase(name)) {
			mrp_alloc_margin_days(value);
			return;
		}
		if ($mrp_opn_xfr_days_wg.equalsIgnoreCase(name)) {
			mrp_opn_xfr_days_wg(value);
			return;
		}
		if ($mrp_opn_xfr_days_mst.equalsIgnoreCase(name)) {
			mrp_opn_xfr_days_mst(value);
			return;
		}
		if ($mrp_opn_xfr_days.equalsIgnoreCase(name)) {
			mrp_opn_xfr_days(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($dmnd_date_div_mons_wg.equalsIgnoreCase(name)) {
			dmnd_date_div_mons_wg(value);
			return;
		}
		if ($dmnd_date_div_mons_mst.equalsIgnoreCase(name)) {
			dmnd_date_div_mons_mst(value);
			return;
		}
		if ($dmnd_date_div_mons.equalsIgnoreCase(name)) {
			dmnd_date_div_mons(value);
			return;
		}
		if ($alloc_margin_days_wg.equalsIgnoreCase(name)) {
			alloc_margin_days_wg(value);
			return;
		}
		if ($alloc_margin_days_mst.equalsIgnoreCase(name)) {
			alloc_margin_days_mst(value);
			return;
		}
		if ($alloc_margin_days.equalsIgnoreCase(name)) {
			alloc_margin_days(value);
			return;
		}
		if ($mrp_alloc_margin_days_wg.equalsIgnoreCase(name)) {
			mrp_alloc_margin_days_wg(value);
			return;
		}
		if ($mrp_alloc_margin_days_mst.equalsIgnoreCase(name)) {
			mrp_alloc_margin_days_mst(value);
			return;
		}
		if ($mrp_alloc_margin_days.equalsIgnoreCase(name)) {
			mrp_alloc_margin_days(value);
			return;
		}
		if ($mrp_opn_xfr_days_wg.equalsIgnoreCase(name)) {
			mrp_opn_xfr_days_wg(value);
			return;
		}
		if ($mrp_opn_xfr_days_mst.equalsIgnoreCase(name)) {
			mrp_opn_xfr_days_mst(value);
			return;
		}
		if ($mrp_opn_xfr_days.equalsIgnoreCase(name)) {
			mrp_opn_xfr_days(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($dmnd_date_div_mons_wg.equalsIgnoreCase(name)) {
			dmnd_date_div_mons_wg(value);
			return;
		}
		if ($dmnd_date_div_mons_mst.equalsIgnoreCase(name)) {
			dmnd_date_div_mons_mst(value);
			return;
		}
		if ($dmnd_date_div_mons.equalsIgnoreCase(name)) {
			dmnd_date_div_mons(value);
			return;
		}
		if ($alloc_margin_days_wg.equalsIgnoreCase(name)) {
			alloc_margin_days_wg(value);
			return;
		}
		if ($alloc_margin_days_mst.equalsIgnoreCase(name)) {
			alloc_margin_days_mst(value);
			return;
		}
		if ($alloc_margin_days.equalsIgnoreCase(name)) {
			alloc_margin_days(value);
			return;
		}
		if ($mrp_alloc_margin_days_wg.equalsIgnoreCase(name)) {
			mrp_alloc_margin_days_wg(value);
			return;
		}
		if ($mrp_alloc_margin_days_mst.equalsIgnoreCase(name)) {
			mrp_alloc_margin_days_mst(value);
			return;
		}
		if ($mrp_alloc_margin_days.equalsIgnoreCase(name)) {
			mrp_alloc_margin_days(value);
			return;
		}
		if ($mrp_opn_xfr_days_wg.equalsIgnoreCase(name)) {
			mrp_opn_xfr_days_wg(value);
			return;
		}
		if ($mrp_opn_xfr_days_mst.equalsIgnoreCase(name)) {
			mrp_opn_xfr_days_mst(value);
			return;
		}
		if ($mrp_opn_xfr_days.equalsIgnoreCase(name)) {
			mrp_opn_xfr_days(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($dmnd_date_div_mons_wg.equalsIgnoreCase(name)) {
			dmnd_date_div_mons_wg(value);
			return;
		}
		if ($dmnd_date_div_mons_mst.equalsIgnoreCase(name)) {
			dmnd_date_div_mons_mst(value);
			return;
		}
		if ($dmnd_date_div_mons.equalsIgnoreCase(name)) {
			dmnd_date_div_mons(value);
			return;
		}
		if ($alloc_margin_days_wg.equalsIgnoreCase(name)) {
			alloc_margin_days_wg(value);
			return;
		}
		if ($alloc_margin_days_mst.equalsIgnoreCase(name)) {
			alloc_margin_days_mst(value);
			return;
		}
		if ($alloc_margin_days.equalsIgnoreCase(name)) {
			alloc_margin_days(value);
			return;
		}
		if ($mrp_alloc_margin_days_wg.equalsIgnoreCase(name)) {
			mrp_alloc_margin_days_wg(value);
			return;
		}
		if ($mrp_alloc_margin_days_mst.equalsIgnoreCase(name)) {
			mrp_alloc_margin_days_mst(value);
			return;
		}
		if ($mrp_alloc_margin_days.equalsIgnoreCase(name)) {
			mrp_alloc_margin_days(value);
			return;
		}
		if ($mrp_opn_xfr_days_wg.equalsIgnoreCase(name)) {
			mrp_opn_xfr_days_wg(value);
			return;
		}
		if ($mrp_opn_xfr_days_mst.equalsIgnoreCase(name)) {
			mrp_opn_xfr_days_mst(value);
			return;
		}
		if ($mrp_opn_xfr_days.equalsIgnoreCase(name)) {
			mrp_opn_xfr_days(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($dmnd_date_div_mons_wg.equalsIgnoreCase(name)) {
			dmnd_date_div_mons_wg(value);
			return;
		}
		if ($dmnd_date_div_mons_mst.equalsIgnoreCase(name)) {
			dmnd_date_div_mons_mst(value);
			return;
		}
		if ($dmnd_date_div_mons.equalsIgnoreCase(name)) {
			dmnd_date_div_mons(value);
			return;
		}
		if ($alloc_margin_days_wg.equalsIgnoreCase(name)) {
			alloc_margin_days_wg(value);
			return;
		}
		if ($alloc_margin_days_mst.equalsIgnoreCase(name)) {
			alloc_margin_days_mst(value);
			return;
		}
		if ($alloc_margin_days.equalsIgnoreCase(name)) {
			alloc_margin_days(value);
			return;
		}
		if ($mrp_alloc_margin_days_wg.equalsIgnoreCase(name)) {
			mrp_alloc_margin_days_wg(value);
			return;
		}
		if ($mrp_alloc_margin_days_mst.equalsIgnoreCase(name)) {
			mrp_alloc_margin_days_mst(value);
			return;
		}
		if ($mrp_alloc_margin_days.equalsIgnoreCase(name)) {
			mrp_alloc_margin_days(value);
			return;
		}
		if ($mrp_opn_xfr_days_wg.equalsIgnoreCase(name)) {
			mrp_opn_xfr_days_wg(value);
			return;
		}
		if ($mrp_opn_xfr_days_mst.equalsIgnoreCase(name)) {
			mrp_opn_xfr_days_mst(value);
			return;
		}
		if ($mrp_opn_xfr_days.equalsIgnoreCase(name)) {
			mrp_opn_xfr_days(value);
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
		if ($inpt_itm_add_flg.equalsIgnoreCase(name)) {
			inpt_itm_add_flg(value);
			return;
		}
		if ($inpt_itm_del_flg.equalsIgnoreCase(name)) {
			inpt_itm_del_flg(value);
			return;
		}
		if ($sch_flg.equalsIgnoreCase(name)) {
			sch_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}

	public MCRow getInnerRow(String name) {
		if ($itm_p.equalsIgnoreCase(name)) {
			return itm_p();
		}
		if ($qty_mst_p.equalsIgnoreCase(name)) {
			return qty_mst_p();
		}
		if ($qty_p.equalsIgnoreCase(name)) {
			return qty_p();
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
		if ($qty_mst_p.equalsIgnoreCase(name)) {
			qty_mst_p(
				((MCContainerMeta) qty_mst_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($qty_p.equalsIgnoreCase(name)) {
			qty_p(
				((MCContainerMeta) qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
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

	/**
	 * Requirements suppression qty. (Default) 所要抑制量（既定）.<p>
	 *
	 */
	public MCNumber rqmt_rstr_qty_mst() {
		return qty_mst_p().qty();
	}

	/**
	 * Requirements suppression qty. (Default) 所要抑制量（既定）.<p>
	 *
	 */
	public void rqmt_rstr_qty_mst(MCNumber value) {
		qty_mst_p().qty(value);
	}

	/**
	 * Requirements suppression qty. (Default) 所要抑制量（既定）.<p>
	 *
	 */
	public void rqmt_rstr_qty_mst(int value) {
		qty_mst_p().qty(value);
	}

	/**
	 * Requirements suppression qty. (Default) 所要抑制量（既定）.<p>
	 *
	 */
	public void rqmt_rstr_qty_mst(long value) {
		qty_mst_p().qty(value);
	}

	/**
	 * Requirements suppression qty. (Default) 所要抑制量（既定）.<p>
	 *
	 */
	public void rqmt_rstr_qty_mst(float value) {
		qty_mst_p().qty(value);
	}

	/**
	 * Requirements suppression qty. (Default) 所要抑制量（既定）.<p>
	 *
	 */
	public void rqmt_rstr_qty_mst(double value) {
		qty_mst_p().qty(value);
	}

	/**
	 * Requirements restricted qty. 所要抑制量.<p>
	 *
	 */
	public MCNumber rqmt_rstr_qty() {
		return qty_p().qty();
	}

	/**
	 * Requirements restricted qty. 所要抑制量.<p>
	 *
	 */
	public void rqmt_rstr_qty(MCNumber value) {
		qty_p().qty(value);
	}

	/**
	 * Requirements restricted qty. 所要抑制量.<p>
	 *
	 */
	public void rqmt_rstr_qty(int value) {
		qty_p().qty(value);
	}

	/**
	 * Requirements restricted qty. 所要抑制量.<p>
	 *
	 */
	public void rqmt_rstr_qty(long value) {
		qty_p().qty(value);
	}

	/**
	 * Requirements restricted qty. 所要抑制量.<p>
	 *
	 */
	public void rqmt_rstr_qty(float value) {
		qty_p().qty(value);
	}

	/**
	 * Requirements restricted qty. 所要抑制量.<p>
	 *
	 */
	public void rqmt_rstr_qty(double value) {
		qty_p().qty(value);
	}

}

