package mcframe.serverMABS.MABSL0340;

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
 * ブロック"Srch01_Rslt1"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class Srch01_Rslt1R_MC_A extends MCConstRow {

	/**
	 * Logical delete 論理削除.<p>
	 *
	 */
	public static final String $del_flg = "del_flg";
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
	 * Unit cd. 単位ＣＤ.<p>
	 *
	 */
	public static final String $unit_cd = "unit_cd";
	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public static final String $dec_place = "dec_place";
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
	 * Mfg. order unit type (Item) 製造指図単位区分（品目）.<p>
	 *
	 */
	public static final String $mfg_inst_unit_typ_itm = "mfg_inst_unit_typ_itm";
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
	public static final String $mfg_inst_unit_typ_nm_mst = "mfg_inst_unit_typ_nm_mst";
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
	 * MRP processing type (Item) ＭＲＰ処理区分（品目）.<p>
	 *
	 */
	public static final String $mrp_proc_typ_itm = "mrp_proc_typ_itm";
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
	public static final String $mrp_proc_typ_nm_mst = "mrp_proc_typ_nm_mst";
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
	 * Requirements type (Item) 所要区分（品目）.<p>
	 *
	 */
	public static final String $rqmt_typ_itm = "rqmt_typ_itm";
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
	public static final String $rqmt_typ_nm_mst = "rqmt_typ_nm_mst";
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
	 * Production planning type (Item) 生産計画立案区分（品目）.<p>
	 *
	 */
	public static final String $prod_pln_typ_itm = "prod_pln_typ_itm";
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
	public static final String $prod_pln_typ_nm_mst = "prod_pln_typ_nm_mst";
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
	 * Number of months for demand disaggregation by day (Item) 需要日ばらし月数（品目）.<p>
	 *
	 */
	public static final String $dmnd_date_div_mons_itm = "dmnd_date_div_mons_itm";
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
	 * Allocation extra days (Item) 引当余裕日数（品目）.<p>
	 *
	 */
	public static final String $alloc_margin_days_itm = "alloc_margin_days_itm";
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
	 * MRP allocation extra days (Item) ＭＲＰ引当余裕日数（品目）.<p>
	 *
	 */
	public static final String $mrp_alloc_margin_days_itm = "mrp_alloc_margin_days_itm";
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
	 * Days to consider unfirm transport request in MRP (Item) ＭＲＰ未確定移送依頼考慮日数（品目）.<p>
	 *
	 */
	public static final String $mrp_opn_xfr_days_itm = "mrp_opn_xfr_days_itm";
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
	/**
	 * Requirements suppression qty. (Default) 所要抑制量（既定）.<p>
	 *
	 */
	public static final String $rqmt_rstr_qty_mst = "rqmt_rstr_qty_mst";
	/**
	 * Requirements restricted qty. 所要抑制量.<p>
	 *
	 */
	public static final String $rqmt_rstr_qty = "rqmt_rstr_qty";
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


	public static final MCMeta del_flg_META = createCommonMeta($del_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta itm_cd_META = createCommonMeta($itm_cd, mcframe.commonMA.meta.MA_META.ITM_CD);
	public static final MCMeta itm_sub1_META = createCommonMeta($itm_sub1, mcframe.commonMA.meta.MA_META.ITM_SUB1);
	public static final MCMeta itm_sub2_META = createCommonMeta($itm_sub2, mcframe.commonMA.meta.MA_META.ITM_SUB2);
	public static final MCMeta itm_sub3_META = createCommonMeta($itm_sub3, mcframe.commonMA.meta.MA_META.ITM_SUB3);
	public static final MCMeta itm_nm_META = createCommonMeta($itm_nm, mcframe.commonMA.meta.MA_META.ITM_NM);
	public static final MCMeta unit_cd_META = createCommonMeta($unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta dec_place_META = createCommonMeta($dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta itm_typ_META = createCommonMeta($itm_typ, mcframe.commonMA.meta.MA_META.ITM_TYP);
	public static final MCMeta itm_typ_nm_META = createCommonMeta($itm_typ_nm, mcframe.commonMA.meta.MA_META.ITM_TYP_NM);
	public static final MCMeta itm_typ_d_cd_META = createCommonMeta($itm_typ_d_cd, mcframe.commonMA.meta.MA_META.ITM_TYP_D_CD);
	public static final MCMeta itm_typ_d_nm_META = createCommonMeta($itm_typ_d_nm, mcframe.commonMA.meta.MA_META.ITM_TYP_D_NM);
	public static final MCMeta wg_cd_META = createCommonMeta($wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta wg_nm_META = createCommonMeta($wg_nm, mcframe.commonMA.meta.MA_META.WG_NM);
	public static final MCMeta mfg_inst_unit_typ_itm_META = createCommonMeta($mfg_inst_unit_typ_itm, mcframe.commonMA.meta.MA_META.MFG_INST_UNIT_TYP);
	public static final MCMeta mfg_inst_unit_typ_wg_META = createCommonMeta($mfg_inst_unit_typ_wg, mcframe.commonMA.meta.MA_META.MFG_INST_UNIT_TYP);
	public static final MCMeta mfg_inst_unit_typ_mst_META = createCommonMeta($mfg_inst_unit_typ_mst, mcframe.commonMA.meta.MA_META.MFG_INST_UNIT_TYP);
	public static final MCMeta mfg_inst_unit_typ_nm_mst_META = createCommonMeta($mfg_inst_unit_typ_nm_mst, mcframe.commonMA.meta.MA_META.MFG_INST_UNIT_TYP_NM);
	public static final MCMeta mfg_inst_unit_typ_META = createCommonMeta($mfg_inst_unit_typ, mcframe.commonMA.meta.MA_META.MFG_INST_UNIT_TYP);
	public static final MCMeta mfg_inst_unit_typ_nm_META = createCommonMeta($mfg_inst_unit_typ_nm, mcframe.commonMA.meta.MA_META.MFG_INST_UNIT_TYP_NM);
	public static final MCMeta mrp_proc_typ_itm_META = createCommonMeta($mrp_proc_typ_itm, mcframe.commonMA.meta.MA_META.MRP_PROC_TYP);
	public static final MCMeta mrp_proc_typ_wg_META = createCommonMeta($mrp_proc_typ_wg, mcframe.commonMA.meta.MA_META.MRP_PROC_TYP);
	public static final MCMeta mrp_proc_typ_mst_META = createCommonMeta($mrp_proc_typ_mst, mcframe.commonMA.meta.MA_META.MRP_PROC_TYP);
	public static final MCMeta mrp_proc_typ_nm_mst_META = createCommonMeta($mrp_proc_typ_nm_mst, mcframe.commonMA.meta.MA_META.MRP_PROC_TYP_NM);
	public static final MCMeta mrp_proc_typ_META = createCommonMeta($mrp_proc_typ, mcframe.commonMA.meta.MA_META.MRP_PROC_TYP);
	public static final MCMeta mrp_proc_typ_nm_META = createCommonMeta($mrp_proc_typ_nm, mcframe.commonMA.meta.MA_META.MRP_PROC_TYP_NM);
	public static final MCMeta rqmt_typ_itm_META = createCommonMeta($rqmt_typ_itm, mcframe.commonMA.meta.MA_META.RQMT_TYP);
	public static final MCMeta rqmt_typ_wg_META = createCommonMeta($rqmt_typ_wg, mcframe.commonMA.meta.MA_META.RQMT_TYP);
	public static final MCMeta rqmt_typ_mst_META = createCommonMeta($rqmt_typ_mst, mcframe.commonMA.meta.MA_META.RQMT_TYP);
	public static final MCMeta rqmt_typ_nm_mst_META = createCommonMeta($rqmt_typ_nm_mst, mcframe.commonMA.meta.MA_META.RQMT_TYP_NM);
	public static final MCMeta rqmt_typ_META = createCommonMeta($rqmt_typ, mcframe.commonMA.meta.MA_META.RQMT_TYP);
	public static final MCMeta rqmt_typ_nm_META = createCommonMeta($rqmt_typ_nm, mcframe.commonMA.meta.MA_META.RQMT_TYP_NM);
	public static final MCMeta prod_pln_typ_itm_META = createCommonMeta($prod_pln_typ_itm, mcframe.commonMA.meta.MA_META.PROD_PLN_TYP);
	public static final MCMeta prod_pln_typ_wg_META = createCommonMeta($prod_pln_typ_wg, mcframe.commonMA.meta.MA_META.PROD_PLN_TYP);
	public static final MCMeta prod_pln_typ_mst_META = createCommonMeta($prod_pln_typ_mst, mcframe.commonMA.meta.MA_META.PROD_PLN_TYP);
	public static final MCMeta prod_pln_typ_nm_mst_META = createCommonMeta($prod_pln_typ_nm_mst, mcframe.commonMA.meta.MA_META.PROD_PLN_TYP_NM);
	public static final MCMeta prod_pln_typ_META = createCommonMeta($prod_pln_typ, mcframe.commonMA.meta.MA_META.PROD_PLN_TYP);
	public static final MCMeta prod_pln_typ_nm_META = createCommonMeta($prod_pln_typ_nm, mcframe.commonMA.meta.MA_META.PROD_PLN_TYP_NM);
	public static final MCMeta dmnd_date_div_mons_itm_META = createCommonMeta($dmnd_date_div_mons_itm, mcframe.commonMA.meta.MA_META.MONS);
	public static final MCMeta dmnd_date_div_mons_wg_META = createCommonMeta($dmnd_date_div_mons_wg, mcframe.commonMA.meta.MA_META.MONS);
	public static final MCMeta dmnd_date_div_mons_mst_META = createCommonMeta($dmnd_date_div_mons_mst, mcframe.commonMA.meta.MA_META.MONS);
	public static final MCMeta dmnd_date_div_mons_META = createCommonMeta($dmnd_date_div_mons, mcframe.commonMA.meta.MA_META.MONS);
	public static final MCMeta alloc_margin_days_itm_META = createCommonMeta($alloc_margin_days_itm, mcframe.commonMA.meta.MA_META.DAYS);
	public static final MCMeta alloc_margin_days_wg_META = createCommonMeta($alloc_margin_days_wg, mcframe.commonMA.meta.MA_META.DAYS);
	public static final MCMeta alloc_margin_days_mst_META = createCommonMeta($alloc_margin_days_mst, mcframe.commonMA.meta.MA_META.DAYS);
	public static final MCMeta alloc_margin_days_META = createCommonMeta($alloc_margin_days, mcframe.commonMA.meta.MA_META.DAYS);
	public static final MCMeta mrp_alloc_margin_days_itm_META = createCommonMeta($mrp_alloc_margin_days_itm, mcframe.commonMA.meta.MA_META.DAYS);
	public static final MCMeta mrp_alloc_margin_days_wg_META = createCommonMeta($mrp_alloc_margin_days_wg, mcframe.commonMA.meta.MA_META.DAYS);
	public static final MCMeta mrp_alloc_margin_days_mst_META = createCommonMeta($mrp_alloc_margin_days_mst, mcframe.commonMA.meta.MA_META.DAYS);
	public static final MCMeta mrp_alloc_margin_days_META = createCommonMeta($mrp_alloc_margin_days, mcframe.commonMA.meta.MA_META.DAYS);
	public static final MCMeta mrp_opn_xfr_days_itm_META = createCommonMeta($mrp_opn_xfr_days_itm, mcframe.commonMA.meta.MA_META.DAYS);
	public static final MCMeta mrp_opn_xfr_days_wg_META = createCommonMeta($mrp_opn_xfr_days_wg, mcframe.commonMA.meta.MA_META.DAYS);
	public static final MCMeta mrp_opn_xfr_days_mst_META = createCommonMeta($mrp_opn_xfr_days_mst, mcframe.commonMA.meta.MA_META.DAYS);
	public static final MCMeta mrp_opn_xfr_days_META = createCommonMeta($mrp_opn_xfr_days, mcframe.commonMA.meta.MA_META.DAYS);
	public static final MCMeta rqmt_rstr_qty_mst_META = createCommonMeta($rqmt_rstr_qty_mst, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta rqmt_rstr_qty_META = createCommonMeta($rqmt_rstr_qty, mcframe.commonMA.meta.MA_META.QTY);
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

	protected static final ConstMetaList<Srch01_Rslt1R> constMetas = new ConstMetaList<Srch01_Rslt1R>(
		MCConstRow.constMetas,
		new MCMeta[]{
			del_flg_META,
			itm_cd_META,
			itm_sub1_META,
			itm_sub2_META,
			itm_sub3_META,
			itm_nm_META,
			unit_cd_META,
			dec_place_META,
			itm_typ_META,
			itm_typ_nm_META,
			itm_typ_d_cd_META,
			itm_typ_d_nm_META,
			wg_cd_META,
			wg_nm_META,
			mfg_inst_unit_typ_itm_META,
			mfg_inst_unit_typ_wg_META,
			mfg_inst_unit_typ_mst_META,
			mfg_inst_unit_typ_nm_mst_META,
			mfg_inst_unit_typ_META,
			mfg_inst_unit_typ_nm_META,
			mrp_proc_typ_itm_META,
			mrp_proc_typ_wg_META,
			mrp_proc_typ_mst_META,
			mrp_proc_typ_nm_mst_META,
			mrp_proc_typ_META,
			mrp_proc_typ_nm_META,
			rqmt_typ_itm_META,
			rqmt_typ_wg_META,
			rqmt_typ_mst_META,
			rqmt_typ_nm_mst_META,
			rqmt_typ_META,
			rqmt_typ_nm_META,
			prod_pln_typ_itm_META,
			prod_pln_typ_wg_META,
			prod_pln_typ_mst_META,
			prod_pln_typ_nm_mst_META,
			prod_pln_typ_META,
			prod_pln_typ_nm_META,
			dmnd_date_div_mons_itm_META,
			dmnd_date_div_mons_wg_META,
			dmnd_date_div_mons_mst_META,
			dmnd_date_div_mons_META,
			alloc_margin_days_itm_META,
			alloc_margin_days_wg_META,
			alloc_margin_days_mst_META,
			alloc_margin_days_META,
			mrp_alloc_margin_days_itm_META,
			mrp_alloc_margin_days_wg_META,
			mrp_alloc_margin_days_mst_META,
			mrp_alloc_margin_days_META,
			mrp_opn_xfr_days_itm_META,
			mrp_opn_xfr_days_wg_META,
			mrp_opn_xfr_days_mst_META,
			mrp_opn_xfr_days_META,
			rqmt_rstr_qty_mst_META,
			rqmt_rstr_qty_META,
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
				{$itm_typ, "MAC_ITM_TYP"},	// itm_typ
				{$mfg_inst_unit_typ_mst, "MAC_MFG_INST_UNIT_TYP"},	// mfg_inst_unit_typ_mst
				{$mfg_inst_unit_typ, "MAC_MFG_INST_UNIT_TYP"},	// mfg_inst_unit_typ
				{$mrp_proc_typ_mst, "MAC_MRP_PROC_TYP"},	// mrp_proc_typ_mst
				{$mrp_proc_typ, "MAC_MRP_PROC_TYP"},	// mrp_proc_typ
				{$rqmt_typ_mst, "MAC_RQMT_TYP"},	// rqmt_typ_mst
				{$rqmt_typ, "MAC_RQMT_TYP"},	// rqmt_typ
				{$prod_pln_typ_mst, "MAC_PROD_PLN_TYP"},	// prod_pln_typ_mst
				{$prod_pln_typ, "MAC_PROD_PLN_TYP"},	// prod_pln_typ
				{$inpt_itm_add_typ, "MAC_INPT_ITM_ADD_TYP"},	// inpt_itm_add_typ
				{$inpt_itm_del_typ, "MAC_INPT_ITM_DEL_TYP"},	// inpt_itm_del_typ
				{$sch_tgt_typ, "MAC_SCH_TGT_TYP"}	// sch_tgt_typ
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
	protected Srch01_Rslt1R_MC_A(ConstMetaList<? extends Srch01_Rslt1R> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch01_Rslt1R clone() {
		return (Srch01_Rslt1R) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch01_Rslt1R createInstance() {
		return (Srch01_Rslt1R) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch01_Rslt1R getValues(String... names) {
		return (Srch01_Rslt1R) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * Logical delete 論理削除.<p>
	 *
	 */
	public boolean del_flg() {
		return getConstBoolean(offset + 0, $del_flg);
	}

	/**
	 * Logical delete 論理削除.<p>
	 *
	 */
	public void del_flg(boolean value) {
		setConstBoolean(offset + 0, $del_flg, value);
	}


	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public String itm_cd() {
		return getConstString(offset + 1, $itm_cd);
	}

	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public void itm_cd(String value) {
		setConstString(offset + 1, $itm_cd, value);
	}


	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public String itm_sub1() {
		return getConstString(offset + 2, $itm_sub1);
	}

	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public void itm_sub1(String value) {
		setConstString(offset + 2, $itm_sub1, value);
	}


	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public String itm_sub2() {
		return getConstString(offset + 3, $itm_sub2);
	}

	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public void itm_sub2(String value) {
		setConstString(offset + 3, $itm_sub2, value);
	}


	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public String itm_sub3() {
		return getConstString(offset + 4, $itm_sub3);
	}

	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public void itm_sub3(String value) {
		setConstString(offset + 4, $itm_sub3, value);
	}


	/**
	 * Item name 品名.<p>
	 *
	 */
	public String itm_nm() {
		return getConstString(offset + 5, $itm_nm);
	}

	/**
	 * Item name 品名.<p>
	 *
	 */
	public void itm_nm(String value) {
		setConstString(offset + 5, $itm_nm, value);
	}


	/**
	 * Unit cd. 単位ＣＤ.<p>
	 *
	 */
	public String unit_cd() {
		return getConstString(offset + 6, $unit_cd);
	}

	/**
	 * Unit cd. 単位ＣＤ.<p>
	 *
	 */
	public void unit_cd(String value) {
		setConstString(offset + 6, $unit_cd, value);
	}


	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public MCNumber dec_place() {
		return getConstNumber(offset + 7, $dec_place);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void dec_place(MCNumber value) {
		setConstNumber(offset + 7, $dec_place, value);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void dec_place(int value) {
		setConstNumber(offset + 7, $dec_place, value);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void dec_place(long value) {
		setConstNumber(offset + 7, $dec_place, value);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void dec_place(float value) {
		setConstNumber(offset + 7, $dec_place, value);
	}

	/**
	 * Number of decimal places 小数部有効桁数.<p>
	 *
	 */
	public void dec_place(double value) {
		setConstNumber(offset + 7, $dec_place, value);
	}


	/**
	 * Item type 品目区分.<p>
	 *
	 */
	public String itm_typ() {
		return getConstString(offset + 8, $itm_typ);
	}

	/**
	 * Item type 品目区分.<p>
	 *
	 */
	public void itm_typ(String value) {
		setConstString(offset + 8, $itm_typ, value);
	}


	/**
	 * Item type name 品目区分名.<p>
	 *
	 */
	public String itm_typ_nm() {
		return getConstString(offset + 9, $itm_typ_nm);
	}

	/**
	 * Item type name 品目区分名.<p>
	 *
	 */
	public void itm_typ_nm(String value) {
		setConstString(offset + 9, $itm_typ_nm, value);
	}


	/**
	 * Item type details cd. 品目区分詳細ＣＤ.<p>
	 *
	 */
	public String itm_typ_d_cd() {
		return getConstString(offset + 10, $itm_typ_d_cd);
	}

	/**
	 * Item type details cd. 品目区分詳細ＣＤ.<p>
	 *
	 */
	public void itm_typ_d_cd(String value) {
		setConstString(offset + 10, $itm_typ_d_cd, value);
	}


	/**
	 * Item type details name 品目区分詳細名.<p>
	 *
	 */
	public String itm_typ_d_nm() {
		return getConstString(offset + 11, $itm_typ_d_nm);
	}

	/**
	 * Item type details name 品目区分詳細名.<p>
	 *
	 */
	public void itm_typ_d_nm(String value) {
		setConstString(offset + 11, $itm_typ_d_nm, value);
	}


	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public String wg_cd() {
		return getConstString(offset + 12, $wg_cd);
	}

	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public void wg_cd(String value) {
		setConstString(offset + 12, $wg_cd, value);
	}


	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public String wg_nm() {
		return getConstString(offset + 13, $wg_nm);
	}

	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public void wg_nm(String value) {
		setConstString(offset + 13, $wg_nm, value);
	}


	/**
	 * Mfg. order unit type (Item) 製造指図単位区分（品目）.<p>
	 *
	 */
	public String mfg_inst_unit_typ_itm() {
		return getConstString(offset + 14, $mfg_inst_unit_typ_itm);
	}

	/**
	 * Mfg. order unit type (Item) 製造指図単位区分（品目）.<p>
	 *
	 */
	public void mfg_inst_unit_typ_itm(String value) {
		setConstString(offset + 14, $mfg_inst_unit_typ_itm, value);
	}


	/**
	 * Mfg. order unit type (WG) 製造指図単位区分（ＷＧ）.<p>
	 *
	 */
	public String mfg_inst_unit_typ_wg() {
		return getConstString(offset + 15, $mfg_inst_unit_typ_wg);
	}

	/**
	 * Mfg. order unit type (WG) 製造指図単位区分（ＷＧ）.<p>
	 *
	 */
	public void mfg_inst_unit_typ_wg(String value) {
		setConstString(offset + 15, $mfg_inst_unit_typ_wg, value);
	}


	/**
	 * Mfg. order unit type (Default) 製造指図単位区分（既定）.<p>
	 *
	 */
	public String mfg_inst_unit_typ_mst() {
		return getConstString(offset + 16, $mfg_inst_unit_typ_mst);
	}

	/**
	 * Mfg. order unit type (Default) 製造指図単位区分（既定）.<p>
	 *
	 */
	public void mfg_inst_unit_typ_mst(String value) {
		setConstString(offset + 16, $mfg_inst_unit_typ_mst, value);
	}


	/**
	 * Mfg. order unit type name (Default) 製造指図単位区分名（既定）.<p>
	 *
	 */
	public String mfg_inst_unit_typ_nm_mst() {
		return getConstString(offset + 17, $mfg_inst_unit_typ_nm_mst);
	}

	/**
	 * Mfg. order unit type name (Default) 製造指図単位区分名（既定）.<p>
	 *
	 */
	public void mfg_inst_unit_typ_nm_mst(String value) {
		setConstString(offset + 17, $mfg_inst_unit_typ_nm_mst, value);
	}


	/**
	 * Mfg. order unit type 製造指図単位区分.<p>
	 *
	 */
	public String mfg_inst_unit_typ() {
		return getConstString(offset + 18, $mfg_inst_unit_typ);
	}

	/**
	 * Mfg. order unit type 製造指図単位区分.<p>
	 *
	 */
	public void mfg_inst_unit_typ(String value) {
		setConstString(offset + 18, $mfg_inst_unit_typ, value);
	}


	/**
	 * Mfg. order unit type name 製造指図単位区分名.<p>
	 *
	 */
	public String mfg_inst_unit_typ_nm() {
		return getConstString(offset + 19, $mfg_inst_unit_typ_nm);
	}

	/**
	 * Mfg. order unit type name 製造指図単位区分名.<p>
	 *
	 */
	public void mfg_inst_unit_typ_nm(String value) {
		setConstString(offset + 19, $mfg_inst_unit_typ_nm, value);
	}


	/**
	 * MRP processing type (Item) ＭＲＰ処理区分（品目）.<p>
	 *
	 */
	public String mrp_proc_typ_itm() {
		return getConstString(offset + 20, $mrp_proc_typ_itm);
	}

	/**
	 * MRP processing type (Item) ＭＲＰ処理区分（品目）.<p>
	 *
	 */
	public void mrp_proc_typ_itm(String value) {
		setConstString(offset + 20, $mrp_proc_typ_itm, value);
	}


	/**
	 * MRP processing type (WG) ＭＲＰ処理区分（ＷＧ）.<p>
	 *
	 */
	public String mrp_proc_typ_wg() {
		return getConstString(offset + 21, $mrp_proc_typ_wg);
	}

	/**
	 * MRP processing type (WG) ＭＲＰ処理区分（ＷＧ）.<p>
	 *
	 */
	public void mrp_proc_typ_wg(String value) {
		setConstString(offset + 21, $mrp_proc_typ_wg, value);
	}


	/**
	 * MRP processing type (Default) ＭＲＰ処理区分（既定）.<p>
	 *
	 */
	public String mrp_proc_typ_mst() {
		return getConstString(offset + 22, $mrp_proc_typ_mst);
	}

	/**
	 * MRP processing type (Default) ＭＲＰ処理区分（既定）.<p>
	 *
	 */
	public void mrp_proc_typ_mst(String value) {
		setConstString(offset + 22, $mrp_proc_typ_mst, value);
	}


	/**
	 * MRP processing type name (Default) ＭＲＰ処理区分名（既定）.<p>
	 *
	 */
	public String mrp_proc_typ_nm_mst() {
		return getConstString(offset + 23, $mrp_proc_typ_nm_mst);
	}

	/**
	 * MRP processing type name (Default) ＭＲＰ処理区分名（既定）.<p>
	 *
	 */
	public void mrp_proc_typ_nm_mst(String value) {
		setConstString(offset + 23, $mrp_proc_typ_nm_mst, value);
	}


	/**
	 * MRP process type ＭＲＰ処理区分.<p>
	 *
	 */
	public String mrp_proc_typ() {
		return getConstString(offset + 24, $mrp_proc_typ);
	}

	/**
	 * MRP process type ＭＲＰ処理区分.<p>
	 *
	 */
	public void mrp_proc_typ(String value) {
		setConstString(offset + 24, $mrp_proc_typ, value);
	}


	/**
	 * MRP processing type name ＭＲＰ処理区分名.<p>
	 *
	 */
	public String mrp_proc_typ_nm() {
		return getConstString(offset + 25, $mrp_proc_typ_nm);
	}

	/**
	 * MRP processing type name ＭＲＰ処理区分名.<p>
	 *
	 */
	public void mrp_proc_typ_nm(String value) {
		setConstString(offset + 25, $mrp_proc_typ_nm, value);
	}


	/**
	 * Requirements type (Item) 所要区分（品目）.<p>
	 *
	 */
	public String rqmt_typ_itm() {
		return getConstString(offset + 26, $rqmt_typ_itm);
	}

	/**
	 * Requirements type (Item) 所要区分（品目）.<p>
	 *
	 */
	public void rqmt_typ_itm(String value) {
		setConstString(offset + 26, $rqmt_typ_itm, value);
	}


	/**
	 * Requirements type (WG) 所要区分（ＷＧ）.<p>
	 *
	 */
	public String rqmt_typ_wg() {
		return getConstString(offset + 27, $rqmt_typ_wg);
	}

	/**
	 * Requirements type (WG) 所要区分（ＷＧ）.<p>
	 *
	 */
	public void rqmt_typ_wg(String value) {
		setConstString(offset + 27, $rqmt_typ_wg, value);
	}


	/**
	 * Requirements type (Default) 所要区分（既定）.<p>
	 *
	 */
	public String rqmt_typ_mst() {
		return getConstString(offset + 28, $rqmt_typ_mst);
	}

	/**
	 * Requirements type (Default) 所要区分（既定）.<p>
	 *
	 */
	public void rqmt_typ_mst(String value) {
		setConstString(offset + 28, $rqmt_typ_mst, value);
	}


	/**
	 * Requirements type name (Default) 所要区分名（既定）.<p>
	 *
	 */
	public String rqmt_typ_nm_mst() {
		return getConstString(offset + 29, $rqmt_typ_nm_mst);
	}

	/**
	 * Requirements type name (Default) 所要区分名（既定）.<p>
	 *
	 */
	public void rqmt_typ_nm_mst(String value) {
		setConstString(offset + 29, $rqmt_typ_nm_mst, value);
	}


	/**
	 * Requirements type 所要区分.<p>
	 *
	 */
	public String rqmt_typ() {
		return getConstString(offset + 30, $rqmt_typ);
	}

	/**
	 * Requirements type 所要区分.<p>
	 *
	 */
	public void rqmt_typ(String value) {
		setConstString(offset + 30, $rqmt_typ, value);
	}


	/**
	 * Requirements type name 所要区分名.<p>
	 *
	 */
	public String rqmt_typ_nm() {
		return getConstString(offset + 31, $rqmt_typ_nm);
	}

	/**
	 * Requirements type name 所要区分名.<p>
	 *
	 */
	public void rqmt_typ_nm(String value) {
		setConstString(offset + 31, $rqmt_typ_nm, value);
	}


	/**
	 * Production planning type (Item) 生産計画立案区分（品目）.<p>
	 *
	 */
	public String prod_pln_typ_itm() {
		return getConstString(offset + 32, $prod_pln_typ_itm);
	}

	/**
	 * Production planning type (Item) 生産計画立案区分（品目）.<p>
	 *
	 */
	public void prod_pln_typ_itm(String value) {
		setConstString(offset + 32, $prod_pln_typ_itm, value);
	}


	/**
	 * Production planning type (WG) 生産計画立案区分（ＷＧ）.<p>
	 *
	 */
	public String prod_pln_typ_wg() {
		return getConstString(offset + 33, $prod_pln_typ_wg);
	}

	/**
	 * Production planning type (WG) 生産計画立案区分（ＷＧ）.<p>
	 *
	 */
	public void prod_pln_typ_wg(String value) {
		setConstString(offset + 33, $prod_pln_typ_wg, value);
	}


	/**
	 * Production planning type (Default) 生産計画立案区分（既定）.<p>
	 *
	 */
	public String prod_pln_typ_mst() {
		return getConstString(offset + 34, $prod_pln_typ_mst);
	}

	/**
	 * Production planning type (Default) 生産計画立案区分（既定）.<p>
	 *
	 */
	public void prod_pln_typ_mst(String value) {
		setConstString(offset + 34, $prod_pln_typ_mst, value);
	}


	/**
	 * Production planning type name (Default) 生産計画立案区分名（既定）.<p>
	 *
	 */
	public String prod_pln_typ_nm_mst() {
		return getConstString(offset + 35, $prod_pln_typ_nm_mst);
	}

	/**
	 * Production planning type name (Default) 生産計画立案区分名（既定）.<p>
	 *
	 */
	public void prod_pln_typ_nm_mst(String value) {
		setConstString(offset + 35, $prod_pln_typ_nm_mst, value);
	}


	/**
	 * Production planning type 生産計画立案区分.<p>
	 *
	 */
	public String prod_pln_typ() {
		return getConstString(offset + 36, $prod_pln_typ);
	}

	/**
	 * Production planning type 生産計画立案区分.<p>
	 *
	 */
	public void prod_pln_typ(String value) {
		setConstString(offset + 36, $prod_pln_typ, value);
	}


	/**
	 * Production planning type name 生産計画立案区分名.<p>
	 *
	 */
	public String prod_pln_typ_nm() {
		return getConstString(offset + 37, $prod_pln_typ_nm);
	}

	/**
	 * Production planning type name 生産計画立案区分名.<p>
	 *
	 */
	public void prod_pln_typ_nm(String value) {
		setConstString(offset + 37, $prod_pln_typ_nm, value);
	}


	/**
	 * Number of months for demand disaggregation by day (Item) 需要日ばらし月数（品目）.<p>
	 *
	 */
	public MCNumber dmnd_date_div_mons_itm() {
		return getConstNumber(offset + 38, $dmnd_date_div_mons_itm);
	}

	/**
	 * Number of months for demand disaggregation by day (Item) 需要日ばらし月数（品目）.<p>
	 *
	 */
	public void dmnd_date_div_mons_itm(MCNumber value) {
		setConstNumber(offset + 38, $dmnd_date_div_mons_itm, value);
	}

	/**
	 * Number of months for demand disaggregation by day (Item) 需要日ばらし月数（品目）.<p>
	 *
	 */
	public void dmnd_date_div_mons_itm(int value) {
		setConstNumber(offset + 38, $dmnd_date_div_mons_itm, value);
	}

	/**
	 * Number of months for demand disaggregation by day (Item) 需要日ばらし月数（品目）.<p>
	 *
	 */
	public void dmnd_date_div_mons_itm(long value) {
		setConstNumber(offset + 38, $dmnd_date_div_mons_itm, value);
	}

	/**
	 * Number of months for demand disaggregation by day (Item) 需要日ばらし月数（品目）.<p>
	 *
	 */
	public void dmnd_date_div_mons_itm(float value) {
		setConstNumber(offset + 38, $dmnd_date_div_mons_itm, value);
	}

	/**
	 * Number of months for demand disaggregation by day (Item) 需要日ばらし月数（品目）.<p>
	 *
	 */
	public void dmnd_date_div_mons_itm(double value) {
		setConstNumber(offset + 38, $dmnd_date_div_mons_itm, value);
	}


	/**
	 * Number of months for demand disaggregation by day (WG) 需要日ばらし月数（ＷＧ）.<p>
	 *
	 */
	public MCNumber dmnd_date_div_mons_wg() {
		return getConstNumber(offset + 39, $dmnd_date_div_mons_wg);
	}

	/**
	 * Number of months for demand disaggregation by day (WG) 需要日ばらし月数（ＷＧ）.<p>
	 *
	 */
	public void dmnd_date_div_mons_wg(MCNumber value) {
		setConstNumber(offset + 39, $dmnd_date_div_mons_wg, value);
	}

	/**
	 * Number of months for demand disaggregation by day (WG) 需要日ばらし月数（ＷＧ）.<p>
	 *
	 */
	public void dmnd_date_div_mons_wg(int value) {
		setConstNumber(offset + 39, $dmnd_date_div_mons_wg, value);
	}

	/**
	 * Number of months for demand disaggregation by day (WG) 需要日ばらし月数（ＷＧ）.<p>
	 *
	 */
	public void dmnd_date_div_mons_wg(long value) {
		setConstNumber(offset + 39, $dmnd_date_div_mons_wg, value);
	}

	/**
	 * Number of months for demand disaggregation by day (WG) 需要日ばらし月数（ＷＧ）.<p>
	 *
	 */
	public void dmnd_date_div_mons_wg(float value) {
		setConstNumber(offset + 39, $dmnd_date_div_mons_wg, value);
	}

	/**
	 * Number of months for demand disaggregation by day (WG) 需要日ばらし月数（ＷＧ）.<p>
	 *
	 */
	public void dmnd_date_div_mons_wg(double value) {
		setConstNumber(offset + 39, $dmnd_date_div_mons_wg, value);
	}


	/**
	 * Number of months for demand disaggregation by day (Default) 需要日ばらし月数（既定）.<p>
	 *
	 */
	public MCNumber dmnd_date_div_mons_mst() {
		return getConstNumber(offset + 40, $dmnd_date_div_mons_mst);
	}

	/**
	 * Number of months for demand disaggregation by day (Default) 需要日ばらし月数（既定）.<p>
	 *
	 */
	public void dmnd_date_div_mons_mst(MCNumber value) {
		setConstNumber(offset + 40, $dmnd_date_div_mons_mst, value);
	}

	/**
	 * Number of months for demand disaggregation by day (Default) 需要日ばらし月数（既定）.<p>
	 *
	 */
	public void dmnd_date_div_mons_mst(int value) {
		setConstNumber(offset + 40, $dmnd_date_div_mons_mst, value);
	}

	/**
	 * Number of months for demand disaggregation by day (Default) 需要日ばらし月数（既定）.<p>
	 *
	 */
	public void dmnd_date_div_mons_mst(long value) {
		setConstNumber(offset + 40, $dmnd_date_div_mons_mst, value);
	}

	/**
	 * Number of months for demand disaggregation by day (Default) 需要日ばらし月数（既定）.<p>
	 *
	 */
	public void dmnd_date_div_mons_mst(float value) {
		setConstNumber(offset + 40, $dmnd_date_div_mons_mst, value);
	}

	/**
	 * Number of months for demand disaggregation by day (Default) 需要日ばらし月数（既定）.<p>
	 *
	 */
	public void dmnd_date_div_mons_mst(double value) {
		setConstNumber(offset + 40, $dmnd_date_div_mons_mst, value);
	}


	/**
	 * Number of months for demand disaggregation by day 需要日ばらし月数.<p>
	 *
	 */
	public MCNumber dmnd_date_div_mons() {
		return getConstNumber(offset + 41, $dmnd_date_div_mons);
	}

	/**
	 * Number of months for demand disaggregation by day 需要日ばらし月数.<p>
	 *
	 */
	public void dmnd_date_div_mons(MCNumber value) {
		setConstNumber(offset + 41, $dmnd_date_div_mons, value);
	}

	/**
	 * Number of months for demand disaggregation by day 需要日ばらし月数.<p>
	 *
	 */
	public void dmnd_date_div_mons(int value) {
		setConstNumber(offset + 41, $dmnd_date_div_mons, value);
	}

	/**
	 * Number of months for demand disaggregation by day 需要日ばらし月数.<p>
	 *
	 */
	public void dmnd_date_div_mons(long value) {
		setConstNumber(offset + 41, $dmnd_date_div_mons, value);
	}

	/**
	 * Number of months for demand disaggregation by day 需要日ばらし月数.<p>
	 *
	 */
	public void dmnd_date_div_mons(float value) {
		setConstNumber(offset + 41, $dmnd_date_div_mons, value);
	}

	/**
	 * Number of months for demand disaggregation by day 需要日ばらし月数.<p>
	 *
	 */
	public void dmnd_date_div_mons(double value) {
		setConstNumber(offset + 41, $dmnd_date_div_mons, value);
	}


	/**
	 * Allocation extra days (Item) 引当余裕日数（品目）.<p>
	 *
	 */
	public MCNumber alloc_margin_days_itm() {
		return getConstNumber(offset + 42, $alloc_margin_days_itm);
	}

	/**
	 * Allocation extra days (Item) 引当余裕日数（品目）.<p>
	 *
	 */
	public void alloc_margin_days_itm(MCNumber value) {
		setConstNumber(offset + 42, $alloc_margin_days_itm, value);
	}

	/**
	 * Allocation extra days (Item) 引当余裕日数（品目）.<p>
	 *
	 */
	public void alloc_margin_days_itm(int value) {
		setConstNumber(offset + 42, $alloc_margin_days_itm, value);
	}

	/**
	 * Allocation extra days (Item) 引当余裕日数（品目）.<p>
	 *
	 */
	public void alloc_margin_days_itm(long value) {
		setConstNumber(offset + 42, $alloc_margin_days_itm, value);
	}

	/**
	 * Allocation extra days (Item) 引当余裕日数（品目）.<p>
	 *
	 */
	public void alloc_margin_days_itm(float value) {
		setConstNumber(offset + 42, $alloc_margin_days_itm, value);
	}

	/**
	 * Allocation extra days (Item) 引当余裕日数（品目）.<p>
	 *
	 */
	public void alloc_margin_days_itm(double value) {
		setConstNumber(offset + 42, $alloc_margin_days_itm, value);
	}


	/**
	 * Allocation extra days (WG) 引当余裕日数（ＷＧ）.<p>
	 *
	 */
	public MCNumber alloc_margin_days_wg() {
		return getConstNumber(offset + 43, $alloc_margin_days_wg);
	}

	/**
	 * Allocation extra days (WG) 引当余裕日数（ＷＧ）.<p>
	 *
	 */
	public void alloc_margin_days_wg(MCNumber value) {
		setConstNumber(offset + 43, $alloc_margin_days_wg, value);
	}

	/**
	 * Allocation extra days (WG) 引当余裕日数（ＷＧ）.<p>
	 *
	 */
	public void alloc_margin_days_wg(int value) {
		setConstNumber(offset + 43, $alloc_margin_days_wg, value);
	}

	/**
	 * Allocation extra days (WG) 引当余裕日数（ＷＧ）.<p>
	 *
	 */
	public void alloc_margin_days_wg(long value) {
		setConstNumber(offset + 43, $alloc_margin_days_wg, value);
	}

	/**
	 * Allocation extra days (WG) 引当余裕日数（ＷＧ）.<p>
	 *
	 */
	public void alloc_margin_days_wg(float value) {
		setConstNumber(offset + 43, $alloc_margin_days_wg, value);
	}

	/**
	 * Allocation extra days (WG) 引当余裕日数（ＷＧ）.<p>
	 *
	 */
	public void alloc_margin_days_wg(double value) {
		setConstNumber(offset + 43, $alloc_margin_days_wg, value);
	}


	/**
	 * Allocation extra days (Default) 引当余裕日数（既定）.<p>
	 *
	 */
	public MCNumber alloc_margin_days_mst() {
		return getConstNumber(offset + 44, $alloc_margin_days_mst);
	}

	/**
	 * Allocation extra days (Default) 引当余裕日数（既定）.<p>
	 *
	 */
	public void alloc_margin_days_mst(MCNumber value) {
		setConstNumber(offset + 44, $alloc_margin_days_mst, value);
	}

	/**
	 * Allocation extra days (Default) 引当余裕日数（既定）.<p>
	 *
	 */
	public void alloc_margin_days_mst(int value) {
		setConstNumber(offset + 44, $alloc_margin_days_mst, value);
	}

	/**
	 * Allocation extra days (Default) 引当余裕日数（既定）.<p>
	 *
	 */
	public void alloc_margin_days_mst(long value) {
		setConstNumber(offset + 44, $alloc_margin_days_mst, value);
	}

	/**
	 * Allocation extra days (Default) 引当余裕日数（既定）.<p>
	 *
	 */
	public void alloc_margin_days_mst(float value) {
		setConstNumber(offset + 44, $alloc_margin_days_mst, value);
	}

	/**
	 * Allocation extra days (Default) 引当余裕日数（既定）.<p>
	 *
	 */
	public void alloc_margin_days_mst(double value) {
		setConstNumber(offset + 44, $alloc_margin_days_mst, value);
	}


	/**
	 * Allocation extra days 引当余裕日数.<p>
	 *
	 */
	public MCNumber alloc_margin_days() {
		return getConstNumber(offset + 45, $alloc_margin_days);
	}

	/**
	 * Allocation extra days 引当余裕日数.<p>
	 *
	 */
	public void alloc_margin_days(MCNumber value) {
		setConstNumber(offset + 45, $alloc_margin_days, value);
	}

	/**
	 * Allocation extra days 引当余裕日数.<p>
	 *
	 */
	public void alloc_margin_days(int value) {
		setConstNumber(offset + 45, $alloc_margin_days, value);
	}

	/**
	 * Allocation extra days 引当余裕日数.<p>
	 *
	 */
	public void alloc_margin_days(long value) {
		setConstNumber(offset + 45, $alloc_margin_days, value);
	}

	/**
	 * Allocation extra days 引当余裕日数.<p>
	 *
	 */
	public void alloc_margin_days(float value) {
		setConstNumber(offset + 45, $alloc_margin_days, value);
	}

	/**
	 * Allocation extra days 引当余裕日数.<p>
	 *
	 */
	public void alloc_margin_days(double value) {
		setConstNumber(offset + 45, $alloc_margin_days, value);
	}


	/**
	 * MRP allocation extra days (Item) ＭＲＰ引当余裕日数（品目）.<p>
	 *
	 */
	public MCNumber mrp_alloc_margin_days_itm() {
		return getConstNumber(offset + 46, $mrp_alloc_margin_days_itm);
	}

	/**
	 * MRP allocation extra days (Item) ＭＲＰ引当余裕日数（品目）.<p>
	 *
	 */
	public void mrp_alloc_margin_days_itm(MCNumber value) {
		setConstNumber(offset + 46, $mrp_alloc_margin_days_itm, value);
	}

	/**
	 * MRP allocation extra days (Item) ＭＲＰ引当余裕日数（品目）.<p>
	 *
	 */
	public void mrp_alloc_margin_days_itm(int value) {
		setConstNumber(offset + 46, $mrp_alloc_margin_days_itm, value);
	}

	/**
	 * MRP allocation extra days (Item) ＭＲＰ引当余裕日数（品目）.<p>
	 *
	 */
	public void mrp_alloc_margin_days_itm(long value) {
		setConstNumber(offset + 46, $mrp_alloc_margin_days_itm, value);
	}

	/**
	 * MRP allocation extra days (Item) ＭＲＰ引当余裕日数（品目）.<p>
	 *
	 */
	public void mrp_alloc_margin_days_itm(float value) {
		setConstNumber(offset + 46, $mrp_alloc_margin_days_itm, value);
	}

	/**
	 * MRP allocation extra days (Item) ＭＲＰ引当余裕日数（品目）.<p>
	 *
	 */
	public void mrp_alloc_margin_days_itm(double value) {
		setConstNumber(offset + 46, $mrp_alloc_margin_days_itm, value);
	}


	/**
	 * MRP allocation extra days (WG) ＭＲＰ引当余裕日数（ＷＧ）.<p>
	 *
	 */
	public MCNumber mrp_alloc_margin_days_wg() {
		return getConstNumber(offset + 47, $mrp_alloc_margin_days_wg);
	}

	/**
	 * MRP allocation extra days (WG) ＭＲＰ引当余裕日数（ＷＧ）.<p>
	 *
	 */
	public void mrp_alloc_margin_days_wg(MCNumber value) {
		setConstNumber(offset + 47, $mrp_alloc_margin_days_wg, value);
	}

	/**
	 * MRP allocation extra days (WG) ＭＲＰ引当余裕日数（ＷＧ）.<p>
	 *
	 */
	public void mrp_alloc_margin_days_wg(int value) {
		setConstNumber(offset + 47, $mrp_alloc_margin_days_wg, value);
	}

	/**
	 * MRP allocation extra days (WG) ＭＲＰ引当余裕日数（ＷＧ）.<p>
	 *
	 */
	public void mrp_alloc_margin_days_wg(long value) {
		setConstNumber(offset + 47, $mrp_alloc_margin_days_wg, value);
	}

	/**
	 * MRP allocation extra days (WG) ＭＲＰ引当余裕日数（ＷＧ）.<p>
	 *
	 */
	public void mrp_alloc_margin_days_wg(float value) {
		setConstNumber(offset + 47, $mrp_alloc_margin_days_wg, value);
	}

	/**
	 * MRP allocation extra days (WG) ＭＲＰ引当余裕日数（ＷＧ）.<p>
	 *
	 */
	public void mrp_alloc_margin_days_wg(double value) {
		setConstNumber(offset + 47, $mrp_alloc_margin_days_wg, value);
	}


	/**
	 * MRP allocation extra days (Default) ＭＲＰ引当余裕日数（既定）.<p>
	 *
	 */
	public MCNumber mrp_alloc_margin_days_mst() {
		return getConstNumber(offset + 48, $mrp_alloc_margin_days_mst);
	}

	/**
	 * MRP allocation extra days (Default) ＭＲＰ引当余裕日数（既定）.<p>
	 *
	 */
	public void mrp_alloc_margin_days_mst(MCNumber value) {
		setConstNumber(offset + 48, $mrp_alloc_margin_days_mst, value);
	}

	/**
	 * MRP allocation extra days (Default) ＭＲＰ引当余裕日数（既定）.<p>
	 *
	 */
	public void mrp_alloc_margin_days_mst(int value) {
		setConstNumber(offset + 48, $mrp_alloc_margin_days_mst, value);
	}

	/**
	 * MRP allocation extra days (Default) ＭＲＰ引当余裕日数（既定）.<p>
	 *
	 */
	public void mrp_alloc_margin_days_mst(long value) {
		setConstNumber(offset + 48, $mrp_alloc_margin_days_mst, value);
	}

	/**
	 * MRP allocation extra days (Default) ＭＲＰ引当余裕日数（既定）.<p>
	 *
	 */
	public void mrp_alloc_margin_days_mst(float value) {
		setConstNumber(offset + 48, $mrp_alloc_margin_days_mst, value);
	}

	/**
	 * MRP allocation extra days (Default) ＭＲＰ引当余裕日数（既定）.<p>
	 *
	 */
	public void mrp_alloc_margin_days_mst(double value) {
		setConstNumber(offset + 48, $mrp_alloc_margin_days_mst, value);
	}


	/**
	 * MRP allocation extra days ＭＲＰ引当余裕日数.<p>
	 *
	 */
	public MCNumber mrp_alloc_margin_days() {
		return getConstNumber(offset + 49, $mrp_alloc_margin_days);
	}

	/**
	 * MRP allocation extra days ＭＲＰ引当余裕日数.<p>
	 *
	 */
	public void mrp_alloc_margin_days(MCNumber value) {
		setConstNumber(offset + 49, $mrp_alloc_margin_days, value);
	}

	/**
	 * MRP allocation extra days ＭＲＰ引当余裕日数.<p>
	 *
	 */
	public void mrp_alloc_margin_days(int value) {
		setConstNumber(offset + 49, $mrp_alloc_margin_days, value);
	}

	/**
	 * MRP allocation extra days ＭＲＰ引当余裕日数.<p>
	 *
	 */
	public void mrp_alloc_margin_days(long value) {
		setConstNumber(offset + 49, $mrp_alloc_margin_days, value);
	}

	/**
	 * MRP allocation extra days ＭＲＰ引当余裕日数.<p>
	 *
	 */
	public void mrp_alloc_margin_days(float value) {
		setConstNumber(offset + 49, $mrp_alloc_margin_days, value);
	}

	/**
	 * MRP allocation extra days ＭＲＰ引当余裕日数.<p>
	 *
	 */
	public void mrp_alloc_margin_days(double value) {
		setConstNumber(offset + 49, $mrp_alloc_margin_days, value);
	}


	/**
	 * Days to consider unfirm transport request in MRP (Item) ＭＲＰ未確定移送依頼考慮日数（品目）.<p>
	 *
	 */
	public MCNumber mrp_opn_xfr_days_itm() {
		return getConstNumber(offset + 50, $mrp_opn_xfr_days_itm);
	}

	/**
	 * Days to consider unfirm transport request in MRP (Item) ＭＲＰ未確定移送依頼考慮日数（品目）.<p>
	 *
	 */
	public void mrp_opn_xfr_days_itm(MCNumber value) {
		setConstNumber(offset + 50, $mrp_opn_xfr_days_itm, value);
	}

	/**
	 * Days to consider unfirm transport request in MRP (Item) ＭＲＰ未確定移送依頼考慮日数（品目）.<p>
	 *
	 */
	public void mrp_opn_xfr_days_itm(int value) {
		setConstNumber(offset + 50, $mrp_opn_xfr_days_itm, value);
	}

	/**
	 * Days to consider unfirm transport request in MRP (Item) ＭＲＰ未確定移送依頼考慮日数（品目）.<p>
	 *
	 */
	public void mrp_opn_xfr_days_itm(long value) {
		setConstNumber(offset + 50, $mrp_opn_xfr_days_itm, value);
	}

	/**
	 * Days to consider unfirm transport request in MRP (Item) ＭＲＰ未確定移送依頼考慮日数（品目）.<p>
	 *
	 */
	public void mrp_opn_xfr_days_itm(float value) {
		setConstNumber(offset + 50, $mrp_opn_xfr_days_itm, value);
	}

	/**
	 * Days to consider unfirm transport request in MRP (Item) ＭＲＰ未確定移送依頼考慮日数（品目）.<p>
	 *
	 */
	public void mrp_opn_xfr_days_itm(double value) {
		setConstNumber(offset + 50, $mrp_opn_xfr_days_itm, value);
	}


	/**
	 * Days to consider unfirm transport request in MRP (WG) ＭＲＰ未確定移送依頼考慮日数（ＷＧ）.<p>
	 *
	 */
	public MCNumber mrp_opn_xfr_days_wg() {
		return getConstNumber(offset + 51, $mrp_opn_xfr_days_wg);
	}

	/**
	 * Days to consider unfirm transport request in MRP (WG) ＭＲＰ未確定移送依頼考慮日数（ＷＧ）.<p>
	 *
	 */
	public void mrp_opn_xfr_days_wg(MCNumber value) {
		setConstNumber(offset + 51, $mrp_opn_xfr_days_wg, value);
	}

	/**
	 * Days to consider unfirm transport request in MRP (WG) ＭＲＰ未確定移送依頼考慮日数（ＷＧ）.<p>
	 *
	 */
	public void mrp_opn_xfr_days_wg(int value) {
		setConstNumber(offset + 51, $mrp_opn_xfr_days_wg, value);
	}

	/**
	 * Days to consider unfirm transport request in MRP (WG) ＭＲＰ未確定移送依頼考慮日数（ＷＧ）.<p>
	 *
	 */
	public void mrp_opn_xfr_days_wg(long value) {
		setConstNumber(offset + 51, $mrp_opn_xfr_days_wg, value);
	}

	/**
	 * Days to consider unfirm transport request in MRP (WG) ＭＲＰ未確定移送依頼考慮日数（ＷＧ）.<p>
	 *
	 */
	public void mrp_opn_xfr_days_wg(float value) {
		setConstNumber(offset + 51, $mrp_opn_xfr_days_wg, value);
	}

	/**
	 * Days to consider unfirm transport request in MRP (WG) ＭＲＰ未確定移送依頼考慮日数（ＷＧ）.<p>
	 *
	 */
	public void mrp_opn_xfr_days_wg(double value) {
		setConstNumber(offset + 51, $mrp_opn_xfr_days_wg, value);
	}


	/**
	 * Days to consider unfirm transport request in MRP (Default) ＭＲＰ未確定移送依頼考慮日数（既定）.<p>
	 *
	 */
	public MCNumber mrp_opn_xfr_days_mst() {
		return getConstNumber(offset + 52, $mrp_opn_xfr_days_mst);
	}

	/**
	 * Days to consider unfirm transport request in MRP (Default) ＭＲＰ未確定移送依頼考慮日数（既定）.<p>
	 *
	 */
	public void mrp_opn_xfr_days_mst(MCNumber value) {
		setConstNumber(offset + 52, $mrp_opn_xfr_days_mst, value);
	}

	/**
	 * Days to consider unfirm transport request in MRP (Default) ＭＲＰ未確定移送依頼考慮日数（既定）.<p>
	 *
	 */
	public void mrp_opn_xfr_days_mst(int value) {
		setConstNumber(offset + 52, $mrp_opn_xfr_days_mst, value);
	}

	/**
	 * Days to consider unfirm transport request in MRP (Default) ＭＲＰ未確定移送依頼考慮日数（既定）.<p>
	 *
	 */
	public void mrp_opn_xfr_days_mst(long value) {
		setConstNumber(offset + 52, $mrp_opn_xfr_days_mst, value);
	}

	/**
	 * Days to consider unfirm transport request in MRP (Default) ＭＲＰ未確定移送依頼考慮日数（既定）.<p>
	 *
	 */
	public void mrp_opn_xfr_days_mst(float value) {
		setConstNumber(offset + 52, $mrp_opn_xfr_days_mst, value);
	}

	/**
	 * Days to consider unfirm transport request in MRP (Default) ＭＲＰ未確定移送依頼考慮日数（既定）.<p>
	 *
	 */
	public void mrp_opn_xfr_days_mst(double value) {
		setConstNumber(offset + 52, $mrp_opn_xfr_days_mst, value);
	}


	/**
	 * Days to consider unfirm transport request in MRP ＭＲＰ未確定移送依頼考慮日数.<p>
	 *
	 */
	public MCNumber mrp_opn_xfr_days() {
		return getConstNumber(offset + 53, $mrp_opn_xfr_days);
	}

	/**
	 * Days to consider unfirm transport request in MRP ＭＲＰ未確定移送依頼考慮日数.<p>
	 *
	 */
	public void mrp_opn_xfr_days(MCNumber value) {
		setConstNumber(offset + 53, $mrp_opn_xfr_days, value);
	}

	/**
	 * Days to consider unfirm transport request in MRP ＭＲＰ未確定移送依頼考慮日数.<p>
	 *
	 */
	public void mrp_opn_xfr_days(int value) {
		setConstNumber(offset + 53, $mrp_opn_xfr_days, value);
	}

	/**
	 * Days to consider unfirm transport request in MRP ＭＲＰ未確定移送依頼考慮日数.<p>
	 *
	 */
	public void mrp_opn_xfr_days(long value) {
		setConstNumber(offset + 53, $mrp_opn_xfr_days, value);
	}

	/**
	 * Days to consider unfirm transport request in MRP ＭＲＰ未確定移送依頼考慮日数.<p>
	 *
	 */
	public void mrp_opn_xfr_days(float value) {
		setConstNumber(offset + 53, $mrp_opn_xfr_days, value);
	}

	/**
	 * Days to consider unfirm transport request in MRP ＭＲＰ未確定移送依頼考慮日数.<p>
	 *
	 */
	public void mrp_opn_xfr_days(double value) {
		setConstNumber(offset + 53, $mrp_opn_xfr_days, value);
	}


	/**
	 * Requirements suppression qty. (Default) 所要抑制量（既定）.<p>
	 *
	 */
	public MCNumber rqmt_rstr_qty_mst() {
		return getConstNumber(offset + 54, $rqmt_rstr_qty_mst);
	}

	/**
	 * Requirements suppression qty. (Default) 所要抑制量（既定）.<p>
	 *
	 */
	public void rqmt_rstr_qty_mst(MCNumber value) {
		setConstNumber(offset + 54, $rqmt_rstr_qty_mst, value);
	}

	/**
	 * Requirements suppression qty. (Default) 所要抑制量（既定）.<p>
	 *
	 */
	public void rqmt_rstr_qty_mst(int value) {
		setConstNumber(offset + 54, $rqmt_rstr_qty_mst, value);
	}

	/**
	 * Requirements suppression qty. (Default) 所要抑制量（既定）.<p>
	 *
	 */
	public void rqmt_rstr_qty_mst(long value) {
		setConstNumber(offset + 54, $rqmt_rstr_qty_mst, value);
	}

	/**
	 * Requirements suppression qty. (Default) 所要抑制量（既定）.<p>
	 *
	 */
	public void rqmt_rstr_qty_mst(float value) {
		setConstNumber(offset + 54, $rqmt_rstr_qty_mst, value);
	}

	/**
	 * Requirements suppression qty. (Default) 所要抑制量（既定）.<p>
	 *
	 */
	public void rqmt_rstr_qty_mst(double value) {
		setConstNumber(offset + 54, $rqmt_rstr_qty_mst, value);
	}


	/**
	 * Requirements restricted qty. 所要抑制量.<p>
	 *
	 */
	public MCNumber rqmt_rstr_qty() {
		return getConstNumber(offset + 55, $rqmt_rstr_qty);
	}

	/**
	 * Requirements restricted qty. 所要抑制量.<p>
	 *
	 */
	public void rqmt_rstr_qty(MCNumber value) {
		setConstNumber(offset + 55, $rqmt_rstr_qty, value);
	}

	/**
	 * Requirements restricted qty. 所要抑制量.<p>
	 *
	 */
	public void rqmt_rstr_qty(int value) {
		setConstNumber(offset + 55, $rqmt_rstr_qty, value);
	}

	/**
	 * Requirements restricted qty. 所要抑制量.<p>
	 *
	 */
	public void rqmt_rstr_qty(long value) {
		setConstNumber(offset + 55, $rqmt_rstr_qty, value);
	}

	/**
	 * Requirements restricted qty. 所要抑制量.<p>
	 *
	 */
	public void rqmt_rstr_qty(float value) {
		setConstNumber(offset + 55, $rqmt_rstr_qty, value);
	}

	/**
	 * Requirements restricted qty. 所要抑制量.<p>
	 *
	 */
	public void rqmt_rstr_qty(double value) {
		setConstNumber(offset + 55, $rqmt_rstr_qty, value);
	}


	/**
	 * Allow input item addition (Default) 投入品追加許可（既定）.<p>
	 *
	 */
	public boolean inpt_itm_add_flg() {
		return getConstBoolean(offset + 56, $inpt_itm_add_flg);
	}

	/**
	 * Allow input item addition (Default) 投入品追加許可（既定）.<p>
	 *
	 */
	public void inpt_itm_add_flg(boolean value) {
		setConstBoolean(offset + 56, $inpt_itm_add_flg, value);
	}


	/**
	 * Input item addition allowed type 投入品追加許可区分.<p>
	 *
	 */
	public String inpt_itm_add_typ() {
		return getConstString(offset + 57, $inpt_itm_add_typ);
	}

	/**
	 * Input item addition allowed type 投入品追加許可区分.<p>
	 *
	 */
	public void inpt_itm_add_typ(String value) {
		setConstString(offset + 57, $inpt_itm_add_typ, value);
	}


	/**
	 * Allow input item addition type name 投入品追加許可区分名.<p>
	 *
	 */
	public String inpt_itm_add_typ_nm() {
		return getConstString(offset + 58, $inpt_itm_add_typ_nm);
	}

	/**
	 * Allow input item addition type name 投入品追加許可区分名.<p>
	 *
	 */
	public void inpt_itm_add_typ_nm(String value) {
		setConstString(offset + 58, $inpt_itm_add_typ_nm, value);
	}


	/**
	 * Allow input item deletion (Default) 投入品削除許可（既定）.<p>
	 *
	 */
	public boolean inpt_itm_del_flg() {
		return getConstBoolean(offset + 59, $inpt_itm_del_flg);
	}

	/**
	 * Allow input item deletion (Default) 投入品削除許可（既定）.<p>
	 *
	 */
	public void inpt_itm_del_flg(boolean value) {
		setConstBoolean(offset + 59, $inpt_itm_del_flg, value);
	}


	/**
	 * Input item deletion allowed type 投入品削除許可区分.<p>
	 *
	 */
	public String inpt_itm_del_typ() {
		return getConstString(offset + 60, $inpt_itm_del_typ);
	}

	/**
	 * Input item deletion allowed type 投入品削除許可区分.<p>
	 *
	 */
	public void inpt_itm_del_typ(String value) {
		setConstString(offset + 60, $inpt_itm_del_typ, value);
	}


	/**
	 * Allow input item deletion type name 投入品削除許可区分名.<p>
	 *
	 */
	public String inpt_itm_del_typ_nm() {
		return getConstString(offset + 61, $inpt_itm_del_typ_nm);
	}

	/**
	 * Allow input item deletion type name 投入品削除許可区分名.<p>
	 *
	 */
	public void inpt_itm_del_typ_nm(String value) {
		setConstString(offset + 61, $inpt_itm_del_typ_nm, value);
	}


	/**
	 * Scheduler (Default) スケジューラ（既定）.<p>
	 *
	 */
	public boolean sch_flg() {
		return getConstBoolean(offset + 62, $sch_flg);
	}

	/**
	 * Scheduler (Default) スケジューラ（既定）.<p>
	 *
	 */
	public void sch_flg(boolean value) {
		setConstBoolean(offset + 62, $sch_flg, value);
	}


	/**
	 * Scheduler target type スケジューラ対象区分.<p>
	 *
	 */
	public String sch_tgt_typ() {
		return getConstString(offset + 63, $sch_tgt_typ);
	}

	/**
	 * Scheduler target type スケジューラ対象区分.<p>
	 *
	 */
	public void sch_tgt_typ(String value) {
		setConstString(offset + 63, $sch_tgt_typ, value);
	}


	/**
	 * Scheduler target type name スケジューラ対象区分名.<p>
	 *
	 */
	public String sch_tgt_typ_nm() {
		return getConstString(offset + 64, $sch_tgt_typ_nm);
	}

	/**
	 * Scheduler target type name スケジューラ対象区分名.<p>
	 *
	 */
	public void sch_tgt_typ_nm(String value) {
		setConstString(offset + 64, $sch_tgt_typ_nm, value);
	}


	/**
	 * Memo 1 メモ１.<p>
	 *
	 */
	public String memo1() {
		return getConstString(offset + 65, $memo1);
	}

	/**
	 * Memo 1 メモ１.<p>
	 *
	 */
	public void memo1(String value) {
		setConstString(offset + 65, $memo1, value);
	}


	/**
	 * Memo 2 メモ２.<p>
	 *
	 */
	public String memo2() {
		return getConstString(offset + 66, $memo2);
	}

	/**
	 * Memo 2 メモ２.<p>
	 *
	 */
	public void memo2(String value) {
		setConstString(offset + 66, $memo2, value);
	}


	/**
	 * Memo 3 メモ３.<p>
	 *
	 */
	public String memo3() {
		return getConstString(offset + 67, $memo3);
	}

	/**
	 * Memo 3 メモ３.<p>
	 *
	 */
	public void memo3(String value) {
		setConstString(offset + 67, $memo3, value);
	}


	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public String ins_usr_id() {
		return getConstString(offset + 68, $ins_usr_id);
	}

	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public void ins_usr_id(String value) {
		setConstString(offset + 68, $ins_usr_id, value);
	}


	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public String ins_usr_nm() {
		return getConstString(offset + 69, $ins_usr_nm);
	}

	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public void ins_usr_nm(String value) {
		setConstString(offset + 69, $ins_usr_nm, value);
	}


	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public MCTimestamp ins_ts() {
		return getConstTimestamp(offset + 70, $ins_ts);
	}

	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public void ins_ts(MCTimestamp value) {
		setConstTimestamp(offset + 70, $ins_ts, value);
	}


	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public String ins_func_id() {
		return getConstString(offset + 71, $ins_func_id);
	}

	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public void ins_func_id(String value) {
		setConstString(offset + 71, $ins_func_id, value);
	}


	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public String ins_func_nm() {
		return getConstString(offset + 72, $ins_func_nm);
	}

	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public void ins_func_nm(String value) {
		setConstString(offset + 72, $ins_func_nm, value);
	}


	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public MCNumber upd_cntr() {
		return getConstNumber(offset + 73, $upd_cntr);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(MCNumber value) {
		setConstNumber(offset + 73, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(int value) {
		setConstNumber(offset + 73, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(long value) {
		setConstNumber(offset + 73, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(float value) {
		setConstNumber(offset + 73, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(double value) {
		setConstNumber(offset + 73, $upd_cntr, value);
	}


	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public String upd_usr_id() {
		return getConstString(offset + 74, $upd_usr_id);
	}

	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public void upd_usr_id(String value) {
		setConstString(offset + 74, $upd_usr_id, value);
	}


	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public String upd_usr_nm() {
		return getConstString(offset + 75, $upd_usr_nm);
	}

	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public void upd_usr_nm(String value) {
		setConstString(offset + 75, $upd_usr_nm, value);
	}


	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public MCTimestamp upd_ts() {
		return getConstTimestamp(offset + 76, $upd_ts);
	}

	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public void upd_ts(MCTimestamp value) {
		setConstTimestamp(offset + 76, $upd_ts, value);
	}


	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public String upd_func_id() {
		return getConstString(offset + 77, $upd_func_id);
	}

	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public void upd_func_id(String value) {
		setConstString(offset + 77, $upd_func_id, value);
	}


	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public String upd_func_nm() {
		return getConstString(offset + 78, $upd_func_nm);
	}

	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public void upd_func_nm(String value) {
		setConstString(offset + 78, $upd_func_nm, value);
	}


	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public String upd_srv_req_no() {
		return getConstString(offset + 79, $upd_srv_req_no);
	}

	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public void upd_srv_req_no(String value) {
		setConstString(offset + 79, $upd_srv_req_no, value);
	}


	/**
	 * Logical delete user ID 論理削除ユーザＩＤ.<p>
	 *
	 */
	public String del_usr_id() {
		return getConstString(offset + 80, $del_usr_id);
	}

	/**
	 * Logical delete user ID 論理削除ユーザＩＤ.<p>
	 *
	 */
	public void del_usr_id(String value) {
		setConstString(offset + 80, $del_usr_id, value);
	}


	/**
	 * Logical delete user name 論理削除ユーザ名.<p>
	 *
	 */
	public String del_usr_nm() {
		return getConstString(offset + 81, $del_usr_nm);
	}

	/**
	 * Logical delete user name 論理削除ユーザ名.<p>
	 *
	 */
	public void del_usr_nm(String value) {
		setConstString(offset + 81, $del_usr_nm, value);
	}


	/**
	 * Logical delete date and time 論理削除日時.<p>
	 *
	 */
	public MCTimestamp del_ts() {
		return getConstTimestamp(offset + 82, $del_ts);
	}

	/**
	 * Logical delete date and time 論理削除日時.<p>
	 *
	 */
	public void del_ts(MCTimestamp value) {
		setConstTimestamp(offset + 82, $del_ts, value);
	}


	public String getString(String name) {
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
		if ($unit_cd.equalsIgnoreCase(name)) {
			return unit_cd();
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
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			return wg_nm();
		}
		if ($mfg_inst_unit_typ_itm.equalsIgnoreCase(name)) {
			return mfg_inst_unit_typ_itm();
		}
		if ($mfg_inst_unit_typ_wg.equalsIgnoreCase(name)) {
			return mfg_inst_unit_typ_wg();
		}
		if ($mfg_inst_unit_typ_mst.equalsIgnoreCase(name)) {
			return mfg_inst_unit_typ_mst();
		}
		if ($mfg_inst_unit_typ_nm_mst.equalsIgnoreCase(name)) {
			return mfg_inst_unit_typ_nm_mst();
		}
		if ($mfg_inst_unit_typ.equalsIgnoreCase(name)) {
			return mfg_inst_unit_typ();
		}
		if ($mfg_inst_unit_typ_nm.equalsIgnoreCase(name)) {
			return mfg_inst_unit_typ_nm();
		}
		if ($mrp_proc_typ_itm.equalsIgnoreCase(name)) {
			return mrp_proc_typ_itm();
		}
		if ($mrp_proc_typ_wg.equalsIgnoreCase(name)) {
			return mrp_proc_typ_wg();
		}
		if ($mrp_proc_typ_mst.equalsIgnoreCase(name)) {
			return mrp_proc_typ_mst();
		}
		if ($mrp_proc_typ_nm_mst.equalsIgnoreCase(name)) {
			return mrp_proc_typ_nm_mst();
		}
		if ($mrp_proc_typ.equalsIgnoreCase(name)) {
			return mrp_proc_typ();
		}
		if ($mrp_proc_typ_nm.equalsIgnoreCase(name)) {
			return mrp_proc_typ_nm();
		}
		if ($rqmt_typ_itm.equalsIgnoreCase(name)) {
			return rqmt_typ_itm();
		}
		if ($rqmt_typ_wg.equalsIgnoreCase(name)) {
			return rqmt_typ_wg();
		}
		if ($rqmt_typ_mst.equalsIgnoreCase(name)) {
			return rqmt_typ_mst();
		}
		if ($rqmt_typ_nm_mst.equalsIgnoreCase(name)) {
			return rqmt_typ_nm_mst();
		}
		if ($rqmt_typ.equalsIgnoreCase(name)) {
			return rqmt_typ();
		}
		if ($rqmt_typ_nm.equalsIgnoreCase(name)) {
			return rqmt_typ_nm();
		}
		if ($prod_pln_typ_itm.equalsIgnoreCase(name)) {
			return prod_pln_typ_itm();
		}
		if ($prod_pln_typ_wg.equalsIgnoreCase(name)) {
			return prod_pln_typ_wg();
		}
		if ($prod_pln_typ_mst.equalsIgnoreCase(name)) {
			return prod_pln_typ_mst();
		}
		if ($prod_pln_typ_nm_mst.equalsIgnoreCase(name)) {
			return prod_pln_typ_nm_mst();
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
		if ($dec_place.equalsIgnoreCase(name)) {
			return dec_place();
		}
		if ($dmnd_date_div_mons_itm.equalsIgnoreCase(name)) {
			return dmnd_date_div_mons_itm();
		}
		if ($dmnd_date_div_mons_wg.equalsIgnoreCase(name)) {
			return dmnd_date_div_mons_wg();
		}
		if ($dmnd_date_div_mons_mst.equalsIgnoreCase(name)) {
			return dmnd_date_div_mons_mst();
		}
		if ($dmnd_date_div_mons.equalsIgnoreCase(name)) {
			return dmnd_date_div_mons();
		}
		if ($alloc_margin_days_itm.equalsIgnoreCase(name)) {
			return alloc_margin_days_itm();
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
		if ($mrp_alloc_margin_days_itm.equalsIgnoreCase(name)) {
			return mrp_alloc_margin_days_itm();
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
		if ($mrp_opn_xfr_days_itm.equalsIgnoreCase(name)) {
			return mrp_opn_xfr_days_itm();
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
		if ($rqmt_rstr_qty_mst.equalsIgnoreCase(name)) {
			return rqmt_rstr_qty_mst();
		}
		if ($rqmt_rstr_qty.equalsIgnoreCase(name)) {
			return rqmt_rstr_qty();
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
		if ($unit_cd.equalsIgnoreCase(name)) {
			return unit_cd();
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
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			return wg_nm();
		}
		if ($mfg_inst_unit_typ_itm.equalsIgnoreCase(name)) {
			return mfg_inst_unit_typ_itm();
		}
		if ($mfg_inst_unit_typ_wg.equalsIgnoreCase(name)) {
			return mfg_inst_unit_typ_wg();
		}
		if ($mfg_inst_unit_typ_mst.equalsIgnoreCase(name)) {
			return mfg_inst_unit_typ_mst();
		}
		if ($mfg_inst_unit_typ_nm_mst.equalsIgnoreCase(name)) {
			return mfg_inst_unit_typ_nm_mst();
		}
		if ($mfg_inst_unit_typ.equalsIgnoreCase(name)) {
			return mfg_inst_unit_typ();
		}
		if ($mfg_inst_unit_typ_nm.equalsIgnoreCase(name)) {
			return mfg_inst_unit_typ_nm();
		}
		if ($mrp_proc_typ_itm.equalsIgnoreCase(name)) {
			return mrp_proc_typ_itm();
		}
		if ($mrp_proc_typ_wg.equalsIgnoreCase(name)) {
			return mrp_proc_typ_wg();
		}
		if ($mrp_proc_typ_mst.equalsIgnoreCase(name)) {
			return mrp_proc_typ_mst();
		}
		if ($mrp_proc_typ_nm_mst.equalsIgnoreCase(name)) {
			return mrp_proc_typ_nm_mst();
		}
		if ($mrp_proc_typ.equalsIgnoreCase(name)) {
			return mrp_proc_typ();
		}
		if ($mrp_proc_typ_nm.equalsIgnoreCase(name)) {
			return mrp_proc_typ_nm();
		}
		if ($rqmt_typ_itm.equalsIgnoreCase(name)) {
			return rqmt_typ_itm();
		}
		if ($rqmt_typ_wg.equalsIgnoreCase(name)) {
			return rqmt_typ_wg();
		}
		if ($rqmt_typ_mst.equalsIgnoreCase(name)) {
			return rqmt_typ_mst();
		}
		if ($rqmt_typ_nm_mst.equalsIgnoreCase(name)) {
			return rqmt_typ_nm_mst();
		}
		if ($rqmt_typ.equalsIgnoreCase(name)) {
			return rqmt_typ();
		}
		if ($rqmt_typ_nm.equalsIgnoreCase(name)) {
			return rqmt_typ_nm();
		}
		if ($prod_pln_typ_itm.equalsIgnoreCase(name)) {
			return prod_pln_typ_itm();
		}
		if ($prod_pln_typ_wg.equalsIgnoreCase(name)) {
			return prod_pln_typ_wg();
		}
		if ($prod_pln_typ_mst.equalsIgnoreCase(name)) {
			return prod_pln_typ_mst();
		}
		if ($prod_pln_typ_nm_mst.equalsIgnoreCase(name)) {
			return prod_pln_typ_nm_mst();
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
		if ($dec_place.equalsIgnoreCase(name)) {
			return dec_place();
		}
		if ($dmnd_date_div_mons_itm.equalsIgnoreCase(name)) {
			return dmnd_date_div_mons_itm();
		}
		if ($dmnd_date_div_mons_wg.equalsIgnoreCase(name)) {
			return dmnd_date_div_mons_wg();
		}
		if ($dmnd_date_div_mons_mst.equalsIgnoreCase(name)) {
			return dmnd_date_div_mons_mst();
		}
		if ($dmnd_date_div_mons.equalsIgnoreCase(name)) {
			return dmnd_date_div_mons();
		}
		if ($alloc_margin_days_itm.equalsIgnoreCase(name)) {
			return alloc_margin_days_itm();
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
		if ($mrp_alloc_margin_days_itm.equalsIgnoreCase(name)) {
			return mrp_alloc_margin_days_itm();
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
		if ($mrp_opn_xfr_days_itm.equalsIgnoreCase(name)) {
			return mrp_opn_xfr_days_itm();
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
		if ($rqmt_rstr_qty_mst.equalsIgnoreCase(name)) {
			return rqmt_rstr_qty_mst();
		}
		if ($rqmt_rstr_qty.equalsIgnoreCase(name)) {
			return rqmt_rstr_qty();
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
		if ($unit_cd.equalsIgnoreCase(name)) {
			unit_cd(value);
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
		if ($wg_cd.equalsIgnoreCase(name)) {
			wg_cd(value);
			return;
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			wg_nm(value);
			return;
		}
		if ($mfg_inst_unit_typ_itm.equalsIgnoreCase(name)) {
			mfg_inst_unit_typ_itm(value);
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
		if ($mfg_inst_unit_typ_nm_mst.equalsIgnoreCase(name)) {
			mfg_inst_unit_typ_nm_mst(value);
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
		if ($mrp_proc_typ_itm.equalsIgnoreCase(name)) {
			mrp_proc_typ_itm(value);
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
		if ($mrp_proc_typ_nm_mst.equalsIgnoreCase(name)) {
			mrp_proc_typ_nm_mst(value);
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
		if ($rqmt_typ_itm.equalsIgnoreCase(name)) {
			rqmt_typ_itm(value);
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
		if ($rqmt_typ_nm_mst.equalsIgnoreCase(name)) {
			rqmt_typ_nm_mst(value);
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
		if ($prod_pln_typ_itm.equalsIgnoreCase(name)) {
			prod_pln_typ_itm(value);
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
		if ($prod_pln_typ_nm_mst.equalsIgnoreCase(name)) {
			prod_pln_typ_nm_mst(value);
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
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($dmnd_date_div_mons_itm.equalsIgnoreCase(name)) {
			dmnd_date_div_mons_itm(value);
			return;
		}
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
		if ($alloc_margin_days_itm.equalsIgnoreCase(name)) {
			alloc_margin_days_itm(value);
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
		if ($mrp_alloc_margin_days_itm.equalsIgnoreCase(name)) {
			mrp_alloc_margin_days_itm(value);
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
		if ($mrp_opn_xfr_days_itm.equalsIgnoreCase(name)) {
			mrp_opn_xfr_days_itm(value);
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
		if ($rqmt_rstr_qty_mst.equalsIgnoreCase(name)) {
			rqmt_rstr_qty_mst(value);
			return;
		}
		if ($rqmt_rstr_qty.equalsIgnoreCase(name)) {
			rqmt_rstr_qty(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($dmnd_date_div_mons_itm.equalsIgnoreCase(name)) {
			dmnd_date_div_mons_itm(value);
			return;
		}
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
		if ($alloc_margin_days_itm.equalsIgnoreCase(name)) {
			alloc_margin_days_itm(value);
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
		if ($mrp_alloc_margin_days_itm.equalsIgnoreCase(name)) {
			mrp_alloc_margin_days_itm(value);
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
		if ($mrp_opn_xfr_days_itm.equalsIgnoreCase(name)) {
			mrp_opn_xfr_days_itm(value);
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
		if ($rqmt_rstr_qty_mst.equalsIgnoreCase(name)) {
			rqmt_rstr_qty_mst(value);
			return;
		}
		if ($rqmt_rstr_qty.equalsIgnoreCase(name)) {
			rqmt_rstr_qty(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($dmnd_date_div_mons_itm.equalsIgnoreCase(name)) {
			dmnd_date_div_mons_itm(value);
			return;
		}
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
		if ($alloc_margin_days_itm.equalsIgnoreCase(name)) {
			alloc_margin_days_itm(value);
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
		if ($mrp_alloc_margin_days_itm.equalsIgnoreCase(name)) {
			mrp_alloc_margin_days_itm(value);
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
		if ($mrp_opn_xfr_days_itm.equalsIgnoreCase(name)) {
			mrp_opn_xfr_days_itm(value);
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
		if ($rqmt_rstr_qty_mst.equalsIgnoreCase(name)) {
			rqmt_rstr_qty_mst(value);
			return;
		}
		if ($rqmt_rstr_qty.equalsIgnoreCase(name)) {
			rqmt_rstr_qty(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($dmnd_date_div_mons_itm.equalsIgnoreCase(name)) {
			dmnd_date_div_mons_itm(value);
			return;
		}
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
		if ($alloc_margin_days_itm.equalsIgnoreCase(name)) {
			alloc_margin_days_itm(value);
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
		if ($mrp_alloc_margin_days_itm.equalsIgnoreCase(name)) {
			mrp_alloc_margin_days_itm(value);
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
		if ($mrp_opn_xfr_days_itm.equalsIgnoreCase(name)) {
			mrp_opn_xfr_days_itm(value);
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
		if ($rqmt_rstr_qty_mst.equalsIgnoreCase(name)) {
			rqmt_rstr_qty_mst(value);
			return;
		}
		if ($rqmt_rstr_qty.equalsIgnoreCase(name)) {
			rqmt_rstr_qty(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($dmnd_date_div_mons_itm.equalsIgnoreCase(name)) {
			dmnd_date_div_mons_itm(value);
			return;
		}
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
		if ($alloc_margin_days_itm.equalsIgnoreCase(name)) {
			alloc_margin_days_itm(value);
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
		if ($mrp_alloc_margin_days_itm.equalsIgnoreCase(name)) {
			mrp_alloc_margin_days_itm(value);
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
		if ($mrp_opn_xfr_days_itm.equalsIgnoreCase(name)) {
			mrp_opn_xfr_days_itm(value);
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
		if ($rqmt_rstr_qty_mst.equalsIgnoreCase(name)) {
			rqmt_rstr_qty_mst(value);
			return;
		}
		if ($rqmt_rstr_qty.equalsIgnoreCase(name)) {
			rqmt_rstr_qty(value);
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
		if ($unit_cd.equalsIgnoreCase(name)) {
			unit_cd(value);
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
		if ($wg_cd.equalsIgnoreCase(name)) {
			wg_cd(value);
			return;
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			wg_nm(value);
			return;
		}
		if ($mfg_inst_unit_typ_itm.equalsIgnoreCase(name)) {
			mfg_inst_unit_typ_itm(value);
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
		if ($mfg_inst_unit_typ_nm_mst.equalsIgnoreCase(name)) {
			mfg_inst_unit_typ_nm_mst(value);
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
		if ($mrp_proc_typ_itm.equalsIgnoreCase(name)) {
			mrp_proc_typ_itm(value);
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
		if ($mrp_proc_typ_nm_mst.equalsIgnoreCase(name)) {
			mrp_proc_typ_nm_mst(value);
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
		if ($rqmt_typ_itm.equalsIgnoreCase(name)) {
			rqmt_typ_itm(value);
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
		if ($rqmt_typ_nm_mst.equalsIgnoreCase(name)) {
			rqmt_typ_nm_mst(value);
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
		if ($prod_pln_typ_itm.equalsIgnoreCase(name)) {
			prod_pln_typ_itm(value);
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
		if ($prod_pln_typ_nm_mst.equalsIgnoreCase(name)) {
			prod_pln_typ_nm_mst(value);
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
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($dmnd_date_div_mons_itm.equalsIgnoreCase(name)) {
			dmnd_date_div_mons_itm(value);
			return;
		}
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
		if ($alloc_margin_days_itm.equalsIgnoreCase(name)) {
			alloc_margin_days_itm(value);
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
		if ($mrp_alloc_margin_days_itm.equalsIgnoreCase(name)) {
			mrp_alloc_margin_days_itm(value);
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
		if ($mrp_opn_xfr_days_itm.equalsIgnoreCase(name)) {
			mrp_opn_xfr_days_itm(value);
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
		if ($rqmt_rstr_qty_mst.equalsIgnoreCase(name)) {
			rqmt_rstr_qty_mst(value);
			return;
		}
		if ($rqmt_rstr_qty.equalsIgnoreCase(name)) {
			rqmt_rstr_qty(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($dmnd_date_div_mons_itm.equalsIgnoreCase(name)) {
			dmnd_date_div_mons_itm(value);
			return;
		}
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
		if ($alloc_margin_days_itm.equalsIgnoreCase(name)) {
			alloc_margin_days_itm(value);
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
		if ($mrp_alloc_margin_days_itm.equalsIgnoreCase(name)) {
			mrp_alloc_margin_days_itm(value);
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
		if ($mrp_opn_xfr_days_itm.equalsIgnoreCase(name)) {
			mrp_opn_xfr_days_itm(value);
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
		if ($rqmt_rstr_qty_mst.equalsIgnoreCase(name)) {
			rqmt_rstr_qty_mst(value);
			return;
		}
		if ($rqmt_rstr_qty.equalsIgnoreCase(name)) {
			rqmt_rstr_qty(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($dmnd_date_div_mons_itm.equalsIgnoreCase(name)) {
			dmnd_date_div_mons_itm(value);
			return;
		}
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
		if ($alloc_margin_days_itm.equalsIgnoreCase(name)) {
			alloc_margin_days_itm(value);
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
		if ($mrp_alloc_margin_days_itm.equalsIgnoreCase(name)) {
			mrp_alloc_margin_days_itm(value);
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
		if ($mrp_opn_xfr_days_itm.equalsIgnoreCase(name)) {
			mrp_opn_xfr_days_itm(value);
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
		if ($rqmt_rstr_qty_mst.equalsIgnoreCase(name)) {
			rqmt_rstr_qty_mst(value);
			return;
		}
		if ($rqmt_rstr_qty.equalsIgnoreCase(name)) {
			rqmt_rstr_qty(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($dmnd_date_div_mons_itm.equalsIgnoreCase(name)) {
			dmnd_date_div_mons_itm(value);
			return;
		}
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
		if ($alloc_margin_days_itm.equalsIgnoreCase(name)) {
			alloc_margin_days_itm(value);
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
		if ($mrp_alloc_margin_days_itm.equalsIgnoreCase(name)) {
			mrp_alloc_margin_days_itm(value);
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
		if ($mrp_opn_xfr_days_itm.equalsIgnoreCase(name)) {
			mrp_opn_xfr_days_itm(value);
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
		if ($rqmt_rstr_qty_mst.equalsIgnoreCase(name)) {
			rqmt_rstr_qty_mst(value);
			return;
		}
		if ($rqmt_rstr_qty.equalsIgnoreCase(name)) {
			rqmt_rstr_qty(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($dmnd_date_div_mons_itm.equalsIgnoreCase(name)) {
			dmnd_date_div_mons_itm(value);
			return;
		}
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
		if ($alloc_margin_days_itm.equalsIgnoreCase(name)) {
			alloc_margin_days_itm(value);
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
		if ($mrp_alloc_margin_days_itm.equalsIgnoreCase(name)) {
			mrp_alloc_margin_days_itm(value);
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
		if ($mrp_opn_xfr_days_itm.equalsIgnoreCase(name)) {
			mrp_opn_xfr_days_itm(value);
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
		if ($rqmt_rstr_qty_mst.equalsIgnoreCase(name)) {
			rqmt_rstr_qty_mst(value);
			return;
		}
		if ($rqmt_rstr_qty.equalsIgnoreCase(name)) {
			rqmt_rstr_qty(value);
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



}

