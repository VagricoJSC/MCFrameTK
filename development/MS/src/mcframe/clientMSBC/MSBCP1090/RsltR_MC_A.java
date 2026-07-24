package mcframe.clientMSBC.MSBCP1090;

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
	 * Mfg. status (Input) 製造状況区分（投入）.<p>
	 *
	 */
	public static final String $inpt_mfg_sts_typ = "inpt_mfg_sts_typ";
	/**
	 * Mfg. status name (Input) 製造状況区分名（投入）.<p>
	 *
	 */
	public static final String $inpt_mfg_sts_typ_nm = "inpt_mfg_sts_typ_nm";
	/**
	 * Production method type 生産方法区分.<p>
	 *
	 */
	public static final String $mfg_mtd_typ = "mfg_mtd_typ";
	/**
	 * Production method type name 生産方法区分名.<p>
	 *
	 */
	public static final String $mfg_mtd_typ_nm = "mfg_mtd_typ_nm";
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
	 * Operation cd. 工程ＣＤ.<p>
	 *
	 */
	public static final String $oper_cd = "oper_cd";
	/**
	 * Operation name 工程名.<p>
	 *
	 */
	public static final String $oper_nm = "oper_nm";
	public static final String $chd_itm_p = "chd_itm_p";
	public static final String $ver_no_p = "ver_no_p";
	public static final String $inpt_qty_p = "inpt_qty_p";
	public static final String $loss_qty_p = "loss_qty_p";
	/**
	 * Loss reason cd. ロス理由ＣＤ.<p>
	 *
	 */
	public static final String $loss_rsn_cd = "loss_rsn_cd";
	/**
	 * Loss reason name ロス理由名.<p>
	 *
	 */
	public static final String $loss_rsn_nm = "loss_rsn_nm";
	public static final String $sum_loss_qty_p = "sum_loss_qty_p";
	public static final String $sum_fxd_loss_qty_p = "sum_fxd_loss_qty_p";
	public static final String $inpt_rem_qty_p = "inpt_rem_qty_p";
	/**
	 * Cancel remaining 打切.<p>
	 *
	 */
	public static final String $abort_flg = "abort_flg";
	/**
	 * Cancel remaining orders started 着手打切.<p>
	 *
	 */
	public static final String $schd_abort_flg = "schd_abort_flg";
	public static final String $schd_inpt_qty_p = "schd_inpt_qty_p";
	public static final String $schd_rqmt_qty_p = "schd_rqmt_qty_p";
	public static final String $schd_fxd_rqmt_qty_p = "schd_fxd_rqmt_qty_p";
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
	 * Progress 進捗率.<p>
	 *
	 */
	public static final String $pr_rate = "pr_rate";
	public static final String $lot_no_p = "lot_no_p";
	/**
	 * Lot No. (Order) ロットＮＯ（指図）.<p>
	 *
	 */
	public static final String $inst_lot_no = "inst_lot_no";
	/**
	 * Sublot No. (Order) サブロットＮＯ（指図）.<p>
	 *
	 */
	public static final String $inst_sublot_no = "inst_sublot_no";
	public static final String $act_tm_p = "act_tm_p";
	public static final String $ac_dt_p = "ac_dt_p";
	public static final String $schd_tm_p = "schd_tm_p";
	public static final String $sno_p = "sno_p";
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
	 * Input reason cd. 投入理由ＣＤ.<p>
	 *
	 */
	public static final String $inpt_rsn_cd = "inpt_rsn_cd";
	/**
	 * Input reason name 投入理由名.<p>
	 *
	 */
	public static final String $inpt_rsn_nm = "inpt_rsn_nm";
	/**
	 * Input location cd. 投入場所ＣＤ.<p>
	 *
	 */
	public static final String $inpt_loc_cd = "inpt_loc_cd";
	/**
	 * Input location name 投入場所名.<p>
	 *
	 */
	public static final String $inpt_loc_nm = "inpt_loc_nm";
	public static final String $inpt_str_ln_p = "inpt_str_ln_p";
	/**
	 * For active ingredient 有効成分対象.<p>
	 *
	 */
	public static final String $cont_fctr_flg = "cont_fctr_flg";
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
	public static final String $act_cont_fctr_p = "act_cont_fctr_p";
	public static final String $cont_fctr_unit_cd_p = "cont_fctr_unit_cd_p";
	public static final String $std_cont_fctr_p = "std_cont_fctr_p";
	public static final String $cont_inpt_qty_p = "cont_inpt_qty_p";
	public static final String $cont_loss_qty_p = "cont_loss_qty_p";
	public static final String $cont_fxd_loss_qty_p = "cont_fxd_loss_qty_p";
	public static final String $cont_schd_inpt_qty_p = "cont_schd_inpt_qty_p";
	public static final String $cont_schd_rqmt_qty_p = "cont_schd_rqmt_qty_p";
	public static final String $cont_schd_fxd_rqmt_qty_p = "cont_schd_fxd_rqmt_qty_p";
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
	 * Alternative group cd. 代替グループＣＤ.<p>
	 *
	 */
	public static final String $alt_grp_cd = "alt_grp_cd";
	/**
	 * Alternative group name 代替グループ名.<p>
	 *
	 */
	public static final String $alt_grp_nm = "alt_grp_nm";
	/**
	 * Alternative group sequence number 代替グループ連番.<p>
	 *
	 */
	public static final String $alt_grp_seq = "alt_grp_seq";
	/**
	 * Specify alternative item 代替品目指定.<p>
	 *
	 */
	public static final String $alt_itm_fix_flg = "alt_itm_fix_flg";
	/**
	 * Alternative item selection type 代替品目選択区分.<p>
	 *
	 */
	public static final String $alt_itm_typ = "alt_itm_typ";
	/**
	 * Alternative item selection type name 代替品目選択区分名.<p>
	 *
	 */
	public static final String $alt_itm_typ_nm = "alt_itm_typ_nm";
	/**
	 * Alternative item allocation priority 代替品目引当優先順位.<p>
	 *
	 */
	public static final String $alt_alloc_prio = "alt_alloc_prio";
	/**
	 * Input schedule No. 投入予定ＮＯ.<p>
	 *
	 */
	public static final String $inpt_schd_no = "inpt_schd_no";
	/**
	 * Input result No. 投入実績ＮＯ.<p>
	 *
	 */
	public static final String $inpt_act_no = "inpt_act_no";
	/**
	 * Loss result No. ロス実績ＮＯ.<p>
	 *
	 */
	public static final String $loss_act_no = "loss_act_no";
	/**
	 * MES ID ＭＥＳＩＤ.<p>
	 *
	 */
	public static final String $mes_id = "mes_id";
	/**
	 * Data No. データＮＯ.<p>
	 *
	 */
	public static final String $data_no = "data_no";
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
	 * External input result No. 外部投入実績ＮＯ.<p>
	 *
	 */
	public static final String $ext_inpt_act_no = "ext_inpt_act_no";
	/**
	 * Input display sequence 投入表示順.<p>
	 *
	 */
	public static final String $disp_seq = "disp_seq";
	public static final String $par_itm_p = "par_itm_p";
	public static final String $st_act_p = "st_act_p";
	public static final String $st_ac_dt_p = "st_ac_dt_p";
	public static final String $end_act_p = "end_act_p";
	public static final String $end_ac_dt_p = "end_ac_dt_p";
	public static final String $base_unit_mfg_inst_qty_p = "base_unit_mfg_inst_qty_p";
	public static final String $base_unit_yield_schd_qty_p = "base_unit_yield_schd_qty_p";
	public static final String $base_unit_st_act_qty_p = "base_unit_st_act_qty_p";
	public static final String $base_unit_yield_qty_p = "base_unit_yield_qty_p";
	public static final String $base_unit_dfct_qty_p = "base_unit_dfct_qty_p";
	/**
	 * Parent base unit cd. 親基準単位ＣＤ.<p>
	 *
	 */
	public static final String $par_base_unit_cd = "par_base_unit_cd";
	/**
	 * Parent base unit name 親基準単位名.<p>
	 *
	 */
	public static final String $par_base_unit_nm = "par_base_unit_nm";
	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public static final String $par_base_unit_dec_place = "par_base_unit_dec_place";
	/**
	 * Parent lot No. (Output) 親ロットＮＯ（出来高）.<p>
	 *
	 */
	public static final String $par_act_lot_no = "par_act_lot_no";
	/**
	 * Parent sublot No. (Output) 親サブロットＮＯ（出来高）.<p>
	 *
	 */
	public static final String $par_act_sublot_no = "par_act_sublot_no";
	/**
	 * Parent lot No. (Order) 親ロットＮＯ（指図）.<p>
	 *
	 */
	public static final String $par_inst_lot_no = "par_inst_lot_no";
	/**
	 * Parent sublot No. (Order) 親サブロットＮＯ（指図）.<p>
	 *
	 */
	public static final String $par_inst_sublot_no = "par_inst_sublot_no";
	/**
	 * Mfg. status (Operation) 製造状況区分（工程）.<p>
	 *
	 */
	public static final String $oper_mfg_sts_typ = "oper_mfg_sts_typ";
	/**
	 * Mfg. status name (Operation) 製造状況区分名（工程）.<p>
	 *
	 */
	public static final String $oper_mfg_sts_typ_nm = "oper_mfg_sts_typ_nm";
	public static final String $oper_unit_act_qty_p = "oper_unit_act_qty_p";
	public static final String $oper_unit_schd_qty_p = "oper_unit_schd_qty_p";
	/**
	 * Operation unit cd. 工程単位ＣＤ.<p>
	 *
	 */
	public static final String $oper_unit_cd = "oper_unit_cd";
	/**
	 * Operation unit name 工程単位名.<p>
	 *
	 */
	public static final String $oper_unit_nm = "oper_unit_nm";
	/**
	 * Operation unit number of decimal places 工程単位小数部有効桁数.<p>
	 *
	 */
	public static final String $oper_unit_dec_place = "oper_unit_dec_place";
	public static final String $par_sno_p = "par_sno_p";
	/**
	 * Allocation 引当.<p>
	 *
	 */
	public static final String $alloc_flg = "alloc_flg";
	/**
	 * Input control type 投入制御区分.<p>
	 *
	 */
	public static final String $inpt_ctl_typ = "inpt_ctl_typ";
	/**
	 * Input control type name 投入制御区分名.<p>
	 *
	 */
	public static final String $inpt_ctl_typ_nm = "inpt_ctl_typ_nm";
	/**
	 * Copy-from child item 引継対象子品目.<p>
	 *
	 */
	public static final String $main_itm_flg = "main_itm_flg";
	/**
	 * Child item for yield calculation 収率計算用子品目.<p>
	 *
	 */
	public static final String $yield_calc_flg = "yield_calc_flg";
	/**
	 * Backflush update バックフラッシュ更新.<p>
	 *
	 */
	public static final String $bkf_upd_flg = "bkf_upd_flg";
	/**
	 * Allow mixed lots ロット混在可.<p>
	 *
	 */
	public static final String $lot_mix_flg = "lot_mix_flg";
	/**
	 * Allow mixed sublots サブロット混在可.<p>
	 *
	 */
	public static final String $sublot_mix_flg = "sublot_mix_flg";
	public static final String $inst_ver_no_p = "inst_ver_no_p";
	/**
	 * Inventory management type 在庫管理区分.<p>
	 *
	 */
	public static final String $stk_mng_typ = "stk_mng_typ";
	/**
	 * Inventory management type name 在庫管理区分名.<p>
	 *
	 */
	public static final String $stk_mng_typ_nm = "stk_mng_typ_nm";
	/**
	 * Input item backflush type 投入品バックフラッシュ区分.<p>
	 *
	 */
	public static final String $bkf_typ = "bkf_typ";
	/**
	 * Input item backflush type name 投入品バックフラッシュ区分名.<p>
	 *
	 */
	public static final String $bkf_typ_nm = "bkf_typ_nm";
	/**
	 * Allocation control type 引当制御区分.<p>
	 *
	 */
	public static final String $alloc_ctl_typ = "alloc_ctl_typ";
	/**
	 * Allocation control type name 引当制御区分名.<p>
	 *
	 */
	public static final String $alloc_ctl_typ_nm = "alloc_ctl_typ_nm";
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
	 * BP cd. 取引先ＣＤ.<p>
	 *
	 */
	public static final String $stk_bp_cd = "stk_bp_cd";
	/**
	 * BP name 取引先名.<p>
	 *
	 */
	public static final String $stk_bp_nm = "stk_bp_nm";
	/**
	 * Arriving point cd. 着荷先ＣＤ.<p>
	 *
	 */
	public static final String $stk_arrv_bp_cd = "stk_arrv_bp_cd";
	/**
	 * Arriving point name 着荷先名.<p>
	 *
	 */
	public static final String $stk_arrv_bp_nm = "stk_arrv_bp_nm";
	public static final String $acxfr_act_qty_p = "acxfr_act_qty_p";
	public static final String $cont_acxfr_act_qty_p = "cont_acxfr_act_qty_p";
	/**
	 * Other accounting transfer reason cd. 他勘定振替理由ＣＤ.<p>
	 *
	 */
	public static final String $acxfr_act_rsn_cd = "acxfr_act_rsn_cd";
	/**
	 * Other accounting transfer reason name 他勘定振替理由名.<p>
	 *
	 */
	public static final String $acxfr_act_rsn_nm = "acxfr_act_rsn_nm";
	/**
	 * Other accounting transfer charged dept. cd. 他勘定振替負担部門ＣＤ.<p>
	 *
	 */
	public static final String $acxfr_act_bd_dpt_cd = "acxfr_act_bd_dpt_cd";
	/**
	 * Other accounting transfer charged dept. name 他勘定振替負担部門名.<p>
	 *
	 */
	public static final String $acxfr_act_bd_dpt_nm = "acxfr_act_bd_dpt_nm";
	/**
	 * Input schedule internal remarks 投入予定内部備考.<p>
	 *
	 */
	public static final String $inpt_schd_intr_rmrks = "inpt_schd_intr_rmrks";
	/**
	 * Input schedule order sheet remarks 投入予定指図書備考.<p>
	 *
	 */
	public static final String $inpt_schd_inst_rpt_rmrks = "inpt_schd_inst_rpt_rmrks";
	/**
	 * Input schedule spare 1 投入予定予備１.<p>
	 *
	 */
	public static final String $inpt_schd_sub_char1 = "inpt_schd_sub_char1";
	/**
	 * Input schedule spare 2 投入予定予備２.<p>
	 *
	 */
	public static final String $inpt_schd_sub_char2 = "inpt_schd_sub_char2";
	/**
	 * Input schedule spare 3 投入予定予備３.<p>
	 *
	 */
	public static final String $inpt_schd_sub_char3 = "inpt_schd_sub_char3";
	/**
	 * Input result internal remarks 投入実績内部備考.<p>
	 *
	 */
	public static final String $inpt_act_intr_rmrks = "inpt_act_intr_rmrks";
	/**
	 * Input result record sheet remarks 投入実績記録書備考.<p>
	 *
	 */
	public static final String $inpt_act_rpt_rmrks = "inpt_act_rpt_rmrks";
	/**
	 * Input result transaction remarks 投入実績取引備考.<p>
	 *
	 */
	public static final String $inpt_act_trd_rmrks = "inpt_act_trd_rmrks";
	/**
	 * Input result spare 1 投入実績予備１.<p>
	 *
	 */
	public static final String $inpt_act_sub_char1 = "inpt_act_sub_char1";
	/**
	 * Input result spare 2 投入実績予備２.<p>
	 *
	 */
	public static final String $inpt_act_sub_char2 = "inpt_act_sub_char2";
	/**
	 * Input result spare 3 投入実績予備３.<p>
	 *
	 */
	public static final String $inpt_act_sub_char3 = "inpt_act_sub_char3";
	/**
	 * Loss result internal remarks ロス実績内部備考.<p>
	 *
	 */
	public static final String $loss_act_intr_rmrks = "loss_act_intr_rmrks";
	/**
	 * Loss result transaction remarks ロス実績取引備考.<p>
	 *
	 */
	public static final String $loss_act_trd_rmrks = "loss_act_trd_rmrks";
	/**
	 * Loss result spare 1 ロス実績予備１.<p>
	 *
	 */
	public static final String $loss_act_sub_char1 = "loss_act_sub_char1";
	/**
	 * Loss result spare 2 ロス実績予備２.<p>
	 *
	 */
	public static final String $loss_act_sub_char2 = "loss_act_sub_char2";
	/**
	 * Loss result spare 3 ロス実績予備３.<p>
	 *
	 */
	public static final String $loss_act_sub_char3 = "loss_act_sub_char3";
	/**
	 * Mfg. record sheet remarks 製造記録書備考.<p>
	 *
	 */
	public static final String $mfg_act_rpt_rmrks = "mfg_act_rpt_rmrks";
	/**
	 * Mfg. internal remarks 製造内部備考.<p>
	 *
	 */
	public static final String $mfg_act_intr_rmrks = "mfg_act_intr_rmrks";
	/**
	 * Mfg. result spare 1 製造実績予備１.<p>
	 *
	 */
	public static final String $mfg_act_sub_char1 = "mfg_act_sub_char1";
	/**
	 * Mfg. result spare 2 製造実績予備２.<p>
	 *
	 */
	public static final String $mfg_act_sub_char2 = "mfg_act_sub_char2";
	/**
	 * Mfg. result spare 3 製造実績予備３.<p>
	 *
	 */
	public static final String $mfg_act_sub_char3 = "mfg_act_sub_char3";
	/**
	 * Operation internal remarks 工程内部備考.<p>
	 *
	 */
	public static final String $oper_act_intr_rmrks = "oper_act_intr_rmrks";
	/**
	 * Operation record sheet remarks 工程記録書備考.<p>
	 *
	 */
	public static final String $oper_act_rpt_rmrks = "oper_act_rpt_rmrks";
	/**
	 * Operation spare 1 工程予備１.<p>
	 *
	 */
	public static final String $oper_act_sub_char1 = "oper_act_sub_char1";
	/**
	 * Operation spare 2 工程予備２.<p>
	 *
	 */
	public static final String $oper_act_sub_char2 = "oper_act_sub_char2";
	/**
	 * Operation spare 3 工程予備３.<p>
	 *
	 */
	public static final String $oper_act_sub_char3 = "oper_act_sub_char3";
	/**
	 * Item actual yield 品目実際収率.<p>
	 *
	 */
	public static final String $itm_yield = "itm_yield";
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
	 * Operation actual yield 工程実際収率.<p>
	 *
	 */
	public static final String $oper_yield = "oper_yield";
	/**
	 * Operation min. yield 工程下限収率.<p>
	 *
	 */
	public static final String $oper_lower_yield = "oper_lower_yield";
	/**
	 * Operation standard yield 工程標準収率.<p>
	 *
	 */
	public static final String $oper_std_yield = "oper_std_yield";
	/**
	 * Operation max. yield 工程上限収率.<p>
	 *
	 */
	public static final String $oper_upper_yield = "oper_upper_yield";
	/**
	 * Subcontractor cd. 外注先ＣＤ.<p>
	 *
	 */
	public static final String $sppl_cd = "sppl_cd";
	/**
	 * Subcontractor name 外注先名.<p>
	 *
	 */
	public static final String $sppl_nm = "sppl_nm";
	/**
	 * Mfg. rack/line cd. 製造棚・ラインＣＤ.<p>
	 *
	 */
	public static final String $mfg_str_ln_cd = "mfg_str_ln_cd";
	/**
	 * Mfg. rack/line name 製造棚・ライン名.<p>
	 *
	 */
	public static final String $mfg_str_ln_nm = "mfg_str_ln_nm";
	/**
	 * Without mfg. rack/line 製造棚・ライン無.<p>
	 *
	 */
	public static final String $mfg_str_ln_cd_none_flg = "mfg_str_ln_cd_none_flg";
	/**
	 * Operation location cd. 工程場所ＣＤ.<p>
	 *
	 */
	public static final String $oper_loc_cd = "oper_loc_cd";
	/**
	 * Operation location name 工程場所名.<p>
	 *
	 */
	public static final String $oper_loc_nm = "oper_loc_nm";
	/**
	 * Operation rack/line cd. 工程棚・ラインＣＤ.<p>
	 *
	 */
	public static final String $oper_str_ln_cd = "oper_str_ln_cd";
	/**
	 * Operation rack/line name 工程棚・ライン名.<p>
	 *
	 */
	public static final String $oper_str_ln_nm = "oper_str_ln_nm";
	/**
	 * Without operation rack/line 工程棚・ライン無.<p>
	 *
	 */
	public static final String $oper_str_ln_cd_none_flg = "oper_str_ln_cd_none_flg";
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
	 * Factory/Distribution warehouse cd. 工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public static final String $site_cd = "site_cd";
	/**
	 * Factory/Distribution warehouse name 工場・物流倉庫名.<p>
	 *
	 */
	public static final String $site_nm = "site_nm";
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
	 * BOM pattern 構成パタン.<p>
	 *
	 */
	public static final String $bom_ptn = "bom_ptn";
	/**
	 * Operation pattern 工程パタン.<p>
	 *
	 */
	public static final String $oper_ptn = "oper_ptn";
	/**
	 * Item order No. 品目オーダＮＯ.<p>
	 *
	 */
	public static final String $itm_ord_no = "itm_ord_no";
	/**
	 * Mfg. order No. 製造指図ＮＯ.<p>
	 *
	 */
	public static final String $mfg_inst_no = "mfg_inst_no";
	/**
	 * Split sequence number 分割連番.<p>
	 *
	 */
	public static final String $div_seq = "div_seq";
	/**
	 * PO details No. 発注明細ＮＯ.<p>
	 *
	 */
	public static final String $po_d_no = "po_d_no";
	/**
	 * Mfg. result No. 製造実績ＮＯ.<p>
	 *
	 */
	public static final String $mfg_act_no = "mfg_act_no";
	/**
	 * Operation order No. 工程指図ＮＯ.<p>
	 *
	 */
	public static final String $oper_inst_no = "oper_inst_no";
	/**
	 * Operation result No. 工程実績ＮＯ.<p>
	 *
	 */
	public static final String $oper_act_no = "oper_act_no";
	/**
	 * Operation sequence number 工程連番.<p>
	 *
	 */
	public static final String $oper_seq = "oper_seq";
	/**
	 * Routing 工順.<p>
	 *
	 */
	public static final String $oper_disp_seq = "oper_disp_seq";
	/**
	 * Operation PIC cd. 工程担当者ＣＤ.<p>
	 *
	 */
	public static final String $oper_usr_cd = "oper_usr_cd";
	/**
	 * Operation PIC name 工程担当者名.<p>
	 *
	 */
	public static final String $oper_usr_nm = "oper_usr_nm";
	/**
	 * Child item type 子品目区分.<p>
	 *
	 */
	public static final String $chd_itm_typ = "chd_itm_typ";
	/**
	 * Child item type name 子品目区分名.<p>
	 *
	 */
	public static final String $chd_itm_typ_nm = "chd_itm_typ_nm";
	/**
	 * Child item type details cd. 子品目区分詳細ＣＤ.<p>
	 *
	 */
	public static final String $chd_itm_typ_d_cd = "chd_itm_typ_d_cd";
	/**
	 * Child item type details name 子品目区分詳細名.<p>
	 *
	 */
	public static final String $chd_itm_typ_d_nm = "chd_itm_typ_d_nm";
	/**
	 * Parent item type 親品目区分.<p>
	 *
	 */
	public static final String $par_itm_typ = "par_itm_typ";
	/**
	 * Parent item type name 親品目区分名.<p>
	 *
	 */
	public static final String $par_itm_typ_nm = "par_itm_typ_nm";
	/**
	 * Parent item type details cd. 親品目区分詳細ＣＤ.<p>
	 *
	 */
	public static final String $par_itm_typ_d_cd = "par_itm_typ_d_cd";
	/**
	 * Parent item type details name 親品目区分詳細名.<p>
	 *
	 */
	public static final String $par_itm_typ_d_nm = "par_itm_typ_d_nm";
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
	public static final String $chd_itm_grp_p = "chd_itm_grp_p";
	public static final String $par_itm_grp_p = "par_itm_grp_p";

	public static final String $chd_itm_cd = $chd_itm_p + ".itm_cd";
	public static final String $chd_itm_sub1 = $chd_itm_p + ".itm_sub1";
	public static final String $chd_itm_sub2 = $chd_itm_p + ".itm_sub2";
	public static final String $chd_itm_sub3 = $chd_itm_p + ".itm_sub3";
	public static final String $chd_itm_nm = $chd_itm_p + ".itm_nm";
	public static final String $ver_no = $ver_no_p + ".ver_no";
	public static final String $base_unit_inpt_qty = $inpt_qty_p + ".qty";
	public static final String $loss_qty = $loss_qty_p + ".qty";
	public static final String $base_unit_loss_qty = $sum_loss_qty_p + ".qty";
	public static final String $base_unit_fxd_loss_qty = $sum_fxd_loss_qty_p + ".qty";
	public static final String $base_unit_inpt_rem_qty = $inpt_rem_qty_p + ".qty";
	public static final String $base_unit_schd_inpt_qty = $schd_inpt_qty_p + ".qty";
	public static final String $base_unit_schd_rqmt_qty = $schd_rqmt_qty_p + ".qty";
	public static final String $base_unit_schd_fxd_rqmt_qty = $schd_fxd_rqmt_qty_p + ".qty";
	public static final String $crt_lot_flg = $lot_no_p + ".crt_lot_flg";
	public static final String $act_lot_no = $lot_no_p + ".lot_no";
	public static final String $act_sublot_no = $lot_no_p + ".sublot_no";
	public static final String $act_dt = $act_tm_p + ".ymd";
	public static final String $act_hm = $act_tm_p + ".hm";
	public static final String $ac_dt = $ac_dt_p + ".ac_dt";
	public static final String $schd_dt = $schd_tm_p + ".ymd";
	public static final String $schd_hm = $schd_tm_p + ".hm";
	public static final String $sno1 = $sno_p + ".sno1";
	public static final String $sno2 = $sno_p + ".sno2";
	public static final String $sno3 = $sno_p + ".sno3";
	public static final String $sno4 = $sno_p + ".sno4";
	public static final String $inpt_str_ln_cd = $inpt_str_ln_p + ".str_ln_cd";
	public static final String $inpt_str_ln_nm = $inpt_str_ln_p + ".str_ln_nm";
	public static final String $inpt_str_ln_cd_none_flg = $inpt_str_ln_p + ".str_ln_cd_none_flg";
	public static final String $act_cont_fctr = $act_cont_fctr_p + ".act_cont_fctr";
	public static final String $cont_fctr_unit_cd = $cont_fctr_unit_cd_p + ".cont_fctr_unit_cd";
	public static final String $cont_fctr_unit_nm = $cont_fctr_unit_cd_p + ".cont_fctr_unit_nm";
	public static final String $std_cont_fctr = $std_cont_fctr_p + ".std_cont_fctr";
	public static final String $cont_inpt_qty = $cont_inpt_qty_p + ".cont_qty";
	public static final String $cont_loss_qty = $cont_loss_qty_p + ".cont_qty";
	public static final String $cont_fxd_loss_qty = $cont_fxd_loss_qty_p + ".cont_qty";
	public static final String $cont_schd_inpt_qty = $cont_schd_inpt_qty_p + ".cont_qty";
	public static final String $cont_schd_rqmt_qty = $cont_schd_rqmt_qty_p + ".cont_qty";
	public static final String $cont_schd_fxd_rqmt_qty = $cont_schd_fxd_rqmt_qty_p + ".cont_qty";
	public static final String $par_itm_cd = $par_itm_p + ".itm_cd";
	public static final String $par_itm_sub1 = $par_itm_p + ".itm_sub1";
	public static final String $par_itm_sub2 = $par_itm_p + ".itm_sub2";
	public static final String $par_itm_sub3 = $par_itm_p + ".itm_sub3";
	public static final String $par_itm_nm = $par_itm_p + ".itm_nm";
	public static final String $st_act_dt = $st_act_p + ".ymd";
	public static final String $st_act_hm = $st_act_p + ".hm";
	public static final String $st_ac_dt = $st_ac_dt_p + ".ac_dt";
	public static final String $end_act_dt = $end_act_p + ".ymd";
	public static final String $end_act_hm = $end_act_p + ".hm";
	public static final String $end_ac_dt = $end_ac_dt_p + ".ac_dt";
	public static final String $base_unit_mfg_inst_qty = $base_unit_mfg_inst_qty_p + ".qty";
	public static final String $base_unit_yield_schd_qty = $base_unit_yield_schd_qty_p + ".qty";
	public static final String $base_unit_st_act_qty = $base_unit_st_act_qty_p + ".qty";
	public static final String $base_unit_yield_qty = $base_unit_yield_qty_p + ".qty";
	public static final String $base_unit_dfct_qty = $base_unit_dfct_qty_p + ".qty";
	public static final String $oper_unit_act_qty = $oper_unit_act_qty_p + ".qty";
	public static final String $oper_unit_schd_qty = $oper_unit_schd_qty_p + ".qty";
	public static final String $par_sno1 = $par_sno_p + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno1 + "";
	public static final String $par_sno2 = $par_sno_p + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno2 + "";
	public static final String $par_sno3 = $par_sno_p + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno3 + "";
	public static final String $par_sno4 = $par_sno_p + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno4 + "";
	public static final String $wrk_no = $par_sno_p + ".wrk_no";
	public static final String $wrk_nm = $par_sno_p + ".wrk_nm";
	public static final String $inpt_schd_ver_no = $inst_ver_no_p + ".ver_no";
	public static final String $acxfr_act_qty = $acxfr_act_qty_p + ".qty";
	public static final String $cont_acxfr_act_qty = $cont_acxfr_act_qty_p + ".cont_qty";
	public static final String $chd_itm_grp_cd1 = $chd_itm_grp_p + ".itm_grp_cd1";
	public static final String $chd_itm_grp_nm1 = $chd_itm_grp_p + ".itm_grp_nm1";
	public static final String $chd_itm_grp_cd2 = $chd_itm_grp_p + ".itm_grp_cd2";
	public static final String $chd_itm_grp_nm2 = $chd_itm_grp_p + ".itm_grp_nm2";
	public static final String $chd_itm_grp_cd3 = $chd_itm_grp_p + ".itm_grp_cd3";
	public static final String $chd_itm_grp_nm3 = $chd_itm_grp_p + ".itm_grp_nm3";
	public static final String $chd_itm_grp_cd4 = $chd_itm_grp_p + ".itm_grp_cd4";
	public static final String $chd_itm_grp_nm4 = $chd_itm_grp_p + ".itm_grp_nm4";
	public static final String $chd_itm_grp_cd5 = $chd_itm_grp_p + ".itm_grp_cd5";
	public static final String $chd_itm_grp_nm5 = $chd_itm_grp_p + ".itm_grp_nm5";
	public static final String $chd_itm_grp_cd6 = $chd_itm_grp_p + ".itm_grp_cd6";
	public static final String $chd_itm_grp_nm6 = $chd_itm_grp_p + ".itm_grp_nm6";
	public static final String $chd_itm_grp_cd7 = $chd_itm_grp_p + ".itm_grp_cd7";
	public static final String $chd_itm_grp_nm7 = $chd_itm_grp_p + ".itm_grp_nm7";
	public static final String $chd_itm_grp_cd8 = $chd_itm_grp_p + ".itm_grp_cd8";
	public static final String $chd_itm_grp_nm8 = $chd_itm_grp_p + ".itm_grp_nm8";
	public static final String $chd_itm_grp_cd9 = $chd_itm_grp_p + ".itm_grp_cd9";
	public static final String $chd_itm_grp_nm9 = $chd_itm_grp_p + ".itm_grp_nm9";
	public static final String $chd_itm_grp_cd10 = $chd_itm_grp_p + ".itm_grp_cd10";
	public static final String $chd_itm_grp_nm10 = $chd_itm_grp_p + ".itm_grp_nm10";
	public static final String $par_itm_grp_cd1 = $par_itm_grp_p + ".itm_grp_cd1";
	public static final String $par_itm_grp_nm1 = $par_itm_grp_p + ".itm_grp_nm1";
	public static final String $par_itm_grp_cd2 = $par_itm_grp_p + ".itm_grp_cd2";
	public static final String $par_itm_grp_nm2 = $par_itm_grp_p + ".itm_grp_nm2";
	public static final String $par_itm_grp_cd3 = $par_itm_grp_p + ".itm_grp_cd3";
	public static final String $par_itm_grp_nm3 = $par_itm_grp_p + ".itm_grp_nm3";
	public static final String $par_itm_grp_cd4 = $par_itm_grp_p + ".itm_grp_cd4";
	public static final String $par_itm_grp_nm4 = $par_itm_grp_p + ".itm_grp_nm4";
	public static final String $par_itm_grp_cd5 = $par_itm_grp_p + ".itm_grp_cd5";
	public static final String $par_itm_grp_nm5 = $par_itm_grp_p + ".itm_grp_nm5";
	public static final String $par_itm_grp_cd6 = $par_itm_grp_p + ".itm_grp_cd6";
	public static final String $par_itm_grp_nm6 = $par_itm_grp_p + ".itm_grp_nm6";
	public static final String $par_itm_grp_cd7 = $par_itm_grp_p + ".itm_grp_cd7";
	public static final String $par_itm_grp_nm7 = $par_itm_grp_p + ".itm_grp_nm7";
	public static final String $par_itm_grp_cd8 = $par_itm_grp_p + ".itm_grp_cd8";
	public static final String $par_itm_grp_nm8 = $par_itm_grp_p + ".itm_grp_nm8";
	public static final String $par_itm_grp_cd9 = $par_itm_grp_p + ".itm_grp_cd9";
	public static final String $par_itm_grp_nm9 = $par_itm_grp_p + ".itm_grp_nm9";
	public static final String $par_itm_grp_cd10 = $par_itm_grp_p + ".itm_grp_cd10";
	public static final String $par_itm_grp_nm10 = $par_itm_grp_p + ".itm_grp_nm10";

	public static final MCMeta inpt_mfg_sts_typ_META = createCommonMeta($inpt_mfg_sts_typ, mcframe.commonMS.meta.MS_META.MFG_STS_TYP);
	public static final MCMeta inpt_mfg_sts_typ_nm_META = createCommonMeta($inpt_mfg_sts_typ_nm, mcframe.commonMS.meta.MS_META.MFG_STS_TYP_NM);
	public static final MCMeta mfg_mtd_typ_META = createCommonMeta($mfg_mtd_typ, mcframe.commonMS.meta.MS_META.MFG_MTD_TYP);
	public static final MCMeta mfg_mtd_typ_nm_META = createCommonMeta($mfg_mtd_typ_nm, mcframe.commonMS.meta.MS_META.MFG_MTD_TYP_NM);
	public static final MCMeta mfg_loc_cd_META = createCommonMeta($mfg_loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta mfg_loc_nm_META = createCommonMeta($mfg_loc_nm, mcframe.commonMA.meta.MA_META.LOC_NM);
	public static final MCMeta oper_cd_META = createCommonMeta($oper_cd, mcframe.commonMA.meta.MA_META.OPER_CD);
	public static final MCMeta oper_nm_META = createCommonMeta($oper_nm, mcframe.commonMA.meta.MA_META.OPER_NM);
	public static final MCMeta chd_itm_p_META = createInnerRowMeta($chd_itm_p, mcframe.clientMAUB.MAUBP5030.ItmR.class);
	public static final MCMeta ver_no_p_META = createInnerRowMeta($ver_no_p, mcframe.clientMAUB.MAUBP5250.VerNoR.class);
	public static final MCMeta inpt_qty_p_META = createInnerRowMeta($inpt_qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta loss_qty_p_META = createInnerRowMeta($loss_qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta loss_rsn_cd_META = createCommonMeta($loss_rsn_cd, mcframe.commonMA.meta.MA_META.BIZ_RSN_CD);
	public static final MCMeta loss_rsn_nm_META = createCommonMeta($loss_rsn_nm, mcframe.commonMA.meta.MA_META.BIZ_RSN_NM);
	public static final MCMeta sum_loss_qty_p_META = createInnerRowMeta($sum_loss_qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta sum_fxd_loss_qty_p_META = createInnerRowMeta($sum_fxd_loss_qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta inpt_rem_qty_p_META = createInnerRowMeta($inpt_rem_qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta abort_flg_META = createCommonMeta($abort_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta schd_abort_flg_META = createCommonMeta($schd_abort_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta schd_inpt_qty_p_META = createInnerRowMeta($schd_inpt_qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta schd_rqmt_qty_p_META = createInnerRowMeta($schd_rqmt_qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta schd_fxd_rqmt_qty_p_META = createInnerRowMeta($schd_fxd_rqmt_qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta base_unit_cd_META = createCommonMeta($base_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta base_unit_nm_META = createCommonMeta($base_unit_nm, mcframe.commonMA.meta.MA_META.UNIT_NM);
	public static final MCMeta base_unit_dec_place_META = createCommonMeta($base_unit_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta pr_rate_META = createCommonMeta($pr_rate, mcframe.commonMA.meta.MA_META.PER);
	public static final MCMeta lot_no_p_META = createInnerRowMeta($lot_no_p, mcframe.clientMSUB.MSUBP5030.LotNoR.class);
	public static final MCMeta inst_lot_no_META = createCommonMeta($inst_lot_no, mcframe.commonMA.meta.MA_META.LOT_NO);
	public static final MCMeta inst_sublot_no_META = createCommonMeta($inst_sublot_no, mcframe.commonMA.meta.MA_META.SUBLOT_NO);
	public static final MCMeta act_tm_p_META = createInnerRowMeta($act_tm_p, mcframe.clientMAUB.MAUBP5320.YmdHmR.class);
	public static final MCMeta ac_dt_p_META = createInnerRowMeta($ac_dt_p, mcframe.clientMAUB.MAUBP5220.AcDtR.class);
	public static final MCMeta schd_tm_p_META = createInnerRowMeta($schd_tm_p, mcframe.clientMAUB.MAUBP5320.YmdHmR.class);
	public static final MCMeta sno_p_META = createInnerRowMeta($sno_p, mcframe.clientMAUB.MAUBP5070.SnoR.class);
	public static final MCMeta gd_cd_META = createCommonMeta($gd_cd, mcframe.commonMA.meta.MA_META.STK_GD_CD);
	public static final MCMeta gd_nm_META = createCommonMeta($gd_nm, mcframe.commonMA.meta.MA_META.STK_GD_NM);
	public static final MCMeta inpt_rsn_cd_META = createCommonMeta($inpt_rsn_cd, mcframe.commonMA.meta.MA_META.BIZ_RSN_CD);
	public static final MCMeta inpt_rsn_nm_META = createCommonMeta($inpt_rsn_nm, mcframe.commonMA.meta.MA_META.BIZ_RSN_NM);
	public static final MCMeta inpt_loc_cd_META = createCommonMeta($inpt_loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta inpt_loc_nm_META = createCommonMeta($inpt_loc_nm, mcframe.commonMA.meta.MA_META.LOC_NM);
	public static final MCMeta inpt_str_ln_p_META = createInnerRowMeta($inpt_str_ln_p, mcframe.clientMAUB.MAUBP5120.StrLnR.class);
	public static final MCMeta cont_fctr_flg_META = createCommonMeta($cont_fctr_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta cont_fctr_rnd_typ_META = createCommonMeta($cont_fctr_rnd_typ, mcframe.commonMA.meta.MA_META.RND_TYP);
	public static final MCMeta cont_fctr_dec_place_META = createCommonMeta($cont_fctr_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta act_cont_fctr_p_META = createInnerRowMeta($act_cont_fctr_p, mcframe.clientMAUB.MAUBP5290.ActContFctrR.class);
	public static final MCMeta cont_fctr_unit_cd_p_META = createInnerRowMeta($cont_fctr_unit_cd_p, mcframe.clientMAUB.MAUBP5270.ContFctrUnitR.class);
	public static final MCMeta std_cont_fctr_p_META = createInnerRowMeta($std_cont_fctr_p, mcframe.clientMAUB.MAUBP5280.StdContFctrR.class);
	public static final MCMeta cont_inpt_qty_p_META = createInnerRowMeta($cont_inpt_qty_p, mcframe.clientMAUB.MAUBP5260.ContQtyR.class);
	public static final MCMeta cont_loss_qty_p_META = createInnerRowMeta($cont_loss_qty_p, mcframe.clientMAUB.MAUBP5260.ContQtyR.class);
	public static final MCMeta cont_fxd_loss_qty_p_META = createInnerRowMeta($cont_fxd_loss_qty_p, mcframe.clientMAUB.MAUBP5260.ContQtyR.class);
	public static final MCMeta cont_schd_inpt_qty_p_META = createInnerRowMeta($cont_schd_inpt_qty_p, mcframe.clientMAUB.MAUBP5260.ContQtyR.class);
	public static final MCMeta cont_schd_rqmt_qty_p_META = createInnerRowMeta($cont_schd_rqmt_qty_p, mcframe.clientMAUB.MAUBP5260.ContQtyR.class);
	public static final MCMeta cont_schd_fxd_rqmt_qty_p_META = createInnerRowMeta($cont_schd_fxd_rqmt_qty_p, mcframe.clientMAUB.MAUBP5260.ContQtyR.class);
	public static final MCMeta prov_typ_META = createCommonMeta($prov_typ, mcframe.commonMA.meta.MA_META.PROV_TYP);
	public static final MCMeta prov_typ_nm_META = createCommonMeta($prov_typ_nm, mcframe.commonMA.meta.MA_META.PROV_TYP_NM);
	public static final MCMeta alt_grp_cd_META = createCommonMeta($alt_grp_cd, mcframe.commonMA.meta.MA_META.ALT_GRP_CD);
	public static final MCMeta alt_grp_nm_META = createCommonMeta($alt_grp_nm, mcframe.commonMA.meta.MA_META.ALT_GRP_NM);
	public static final MCMeta alt_grp_seq_META = createCommonMeta($alt_grp_seq, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta alt_itm_fix_flg_META = createCommonMeta($alt_itm_fix_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta alt_itm_typ_META = createCommonMeta($alt_itm_typ, mcframe.commonMA.meta.MA_META.ALT_ITM_TYP);
	public static final MCMeta alt_itm_typ_nm_META = createCommonMeta($alt_itm_typ_nm, mcframe.commonMA.meta.MA_META.ALT_ITM_TYP_NM);
	public static final MCMeta alt_alloc_prio_META = createCommonMeta($alt_alloc_prio, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta inpt_schd_no_META = createCommonMeta($inpt_schd_no, mcframe.commonMA.meta.MA_META.INPT_SCHD_NO);
	public static final MCMeta inpt_act_no_META = createCommonMeta($inpt_act_no, mcframe.commonMA.meta.MA_META.INPT_ACT_NO);
	public static final MCMeta loss_act_no_META = createCommonMeta($loss_act_no, mcframe.commonMA.meta.MA_META.LOSS_ACT_NO);
	public static final MCMeta mes_id_META = createCommonMeta($mes_id, mcframe.commonMS.meta.MS_META.MES_ID);
	public static final MCMeta data_no_META = createCommonMeta($data_no, mcframe.commonMA.meta.MA_META.IF_DATA_NO);
	public static final MCMeta ext_sys_cd_META = createCommonMeta($ext_sys_cd, mcframe.commonMA.meta.MA_META.EXT_SYS_CD);
	public static final MCMeta ext_sys_nm_META = createCommonMeta($ext_sys_nm, mcframe.commonMA.meta.MA_META.EXT_SYS_NM);
	public static final MCMeta ext_inpt_act_no_META = createCommonMeta($ext_inpt_act_no, mcframe.commonMA.meta.MA_META.EXT_INPT_ACT_NO);
	public static final MCMeta disp_seq_META = createCommonMeta($disp_seq, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta par_itm_p_META = createInnerRowMeta($par_itm_p, mcframe.clientMAUB.MAUBP5030.ItmR.class);
	public static final MCMeta st_act_p_META = createInnerRowMeta($st_act_p, mcframe.clientMAUB.MAUBP5320.YmdHmR.class);
	public static final MCMeta st_ac_dt_p_META = createInnerRowMeta($st_ac_dt_p, mcframe.clientMAUB.MAUBP5220.AcDtR.class);
	public static final MCMeta end_act_p_META = createInnerRowMeta($end_act_p, mcframe.clientMAUB.MAUBP5320.YmdHmR.class);
	public static final MCMeta end_ac_dt_p_META = createInnerRowMeta($end_ac_dt_p, mcframe.clientMAUB.MAUBP5220.AcDtR.class);
	public static final MCMeta base_unit_mfg_inst_qty_p_META = createInnerRowMeta($base_unit_mfg_inst_qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta base_unit_yield_schd_qty_p_META = createInnerRowMeta($base_unit_yield_schd_qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta base_unit_st_act_qty_p_META = createInnerRowMeta($base_unit_st_act_qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta base_unit_yield_qty_p_META = createInnerRowMeta($base_unit_yield_qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta base_unit_dfct_qty_p_META = createInnerRowMeta($base_unit_dfct_qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta par_base_unit_cd_META = createCommonMeta($par_base_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta par_base_unit_nm_META = createCommonMeta($par_base_unit_nm, mcframe.commonMA.meta.MA_META.UNIT_NM);
	public static final MCMeta par_base_unit_dec_place_META = createCommonMeta($par_base_unit_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta par_act_lot_no_META = createCommonMeta($par_act_lot_no, mcframe.commonMA.meta.MA_META.LOT_NO);
	public static final MCMeta par_act_sublot_no_META = createCommonMeta($par_act_sublot_no, mcframe.commonMA.meta.MA_META.SUBLOT_NO);
	public static final MCMeta par_inst_lot_no_META = createCommonMeta($par_inst_lot_no, mcframe.commonMA.meta.MA_META.LOT_NO);
	public static final MCMeta par_inst_sublot_no_META = createCommonMeta($par_inst_sublot_no, mcframe.commonMA.meta.MA_META.SUBLOT_NO);
	public static final MCMeta oper_mfg_sts_typ_META = createCommonMeta($oper_mfg_sts_typ, mcframe.commonMS.meta.MS_META.MFG_STS_TYP);
	public static final MCMeta oper_mfg_sts_typ_nm_META = createCommonMeta($oper_mfg_sts_typ_nm, mcframe.commonMS.meta.MS_META.MFG_STS_TYP_NM);
	public static final MCMeta oper_unit_act_qty_p_META = createInnerRowMeta($oper_unit_act_qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta oper_unit_schd_qty_p_META = createInnerRowMeta($oper_unit_schd_qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta oper_unit_cd_META = createCommonMeta($oper_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta oper_unit_nm_META = createCommonMeta($oper_unit_nm, mcframe.commonMA.meta.MA_META.UNIT_NM);
	public static final MCMeta oper_unit_dec_place_META = createCommonMeta($oper_unit_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta par_sno_p_META = createInnerRowMeta($par_sno_p, mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.class);
	public static final MCMeta alloc_flg_META = createCommonMeta($alloc_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta inpt_ctl_typ_META = createCommonMeta($inpt_ctl_typ, mcframe.commonMA.meta.MA_META.INPT_CTL_TYP);
	public static final MCMeta inpt_ctl_typ_nm_META = createCommonMeta($inpt_ctl_typ_nm, mcframe.commonMA.meta.MA_META.INPT_CTL_TYP_NM);
	public static final MCMeta main_itm_flg_META = createCommonMeta($main_itm_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta yield_calc_flg_META = createCommonMeta($yield_calc_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta bkf_upd_flg_META = createCommonMeta($bkf_upd_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta lot_mix_flg_META = createCommonMeta($lot_mix_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sublot_mix_flg_META = createCommonMeta($sublot_mix_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta inst_ver_no_p_META = createInnerRowMeta($inst_ver_no_p, mcframe.clientMAUB.MAUBP5250.VerNoR.class);
	public static final MCMeta stk_mng_typ_META = createCommonMeta($stk_mng_typ, mcframe.commonMA.meta.MA_META.STK_MNG_TYP);
	public static final MCMeta stk_mng_typ_nm_META = createCommonMeta($stk_mng_typ_nm, mcframe.commonMA.meta.MA_META.STK_MNG_TYP_NM);
	public static final MCMeta bkf_typ_META = createCommonMeta($bkf_typ, mcframe.commonMA.meta.MA_META.BKF_TYP);
	public static final MCMeta bkf_typ_nm_META = createCommonMeta($bkf_typ_nm, mcframe.commonMA.meta.MA_META.BKF_TYP_NM);
	public static final MCMeta alloc_ctl_typ_META = createCommonMeta($alloc_ctl_typ, mcframe.commonMA.meta.MA_META.ALLOC_CTL_TYP);
	public static final MCMeta alloc_ctl_typ_nm_META = createCommonMeta($alloc_ctl_typ_nm, mcframe.commonMA.meta.MA_META.ALLOC_CTL_TYP_NM);
	public static final MCMeta stk_id_typ_META = createCommonMeta($stk_id_typ, mcframe.commonMS.meta.MS_META.STK_ID_TYP);
	public static final MCMeta stk_id_typ_nm_META = createCommonMeta($stk_id_typ_nm, mcframe.commonMS.meta.MS_META.STK_ID_TYP_NM);
	public static final MCMeta stk_bp_cd_META = createCommonMeta($stk_bp_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta stk_bp_nm_META = createCommonMeta($stk_bp_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta stk_arrv_bp_cd_META = createCommonMeta($stk_arrv_bp_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta stk_arrv_bp_nm_META = createCommonMeta($stk_arrv_bp_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta acxfr_act_qty_p_META = createInnerRowMeta($acxfr_act_qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta cont_acxfr_act_qty_p_META = createInnerRowMeta($cont_acxfr_act_qty_p, mcframe.clientMAUB.MAUBP5260.ContQtyR.class);
	public static final MCMeta acxfr_act_rsn_cd_META = createCommonMeta($acxfr_act_rsn_cd, mcframe.commonMA.meta.MA_META.BIZ_RSN_CD);
	public static final MCMeta acxfr_act_rsn_nm_META = createCommonMeta($acxfr_act_rsn_nm, mcframe.commonMA.meta.MA_META.BIZ_RSN_NM);
	public static final MCMeta acxfr_act_bd_dpt_cd_META = createCommonMeta($acxfr_act_bd_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta acxfr_act_bd_dpt_nm_META = createCommonMeta($acxfr_act_bd_dpt_nm, mcframe.commonMA.meta.MA_META.DPT_NM);
	public static final MCMeta inpt_schd_intr_rmrks_META = createCommonMeta($inpt_schd_intr_rmrks, mcframe.commonMS.meta.MS_META.INPT_SCHD_INTR_RMRKS);
	public static final MCMeta inpt_schd_inst_rpt_rmrks_META = createCommonMeta($inpt_schd_inst_rpt_rmrks, mcframe.commonMS.meta.MS_META.INPT_SCHD_RPT_RMRKS);
	public static final MCMeta inpt_schd_sub_char1_META = createCommonMeta($inpt_schd_sub_char1, mcframe.commonMS.meta.MS_META.INPT_SCHD_SUB_CHAR1);
	public static final MCMeta inpt_schd_sub_char2_META = createCommonMeta($inpt_schd_sub_char2, mcframe.commonMS.meta.MS_META.INPT_SCHD_SUB_CHAR2);
	public static final MCMeta inpt_schd_sub_char3_META = createCommonMeta($inpt_schd_sub_char3, mcframe.commonMS.meta.MS_META.INPT_SCHD_SUB_CHAR3);
	public static final MCMeta inpt_act_intr_rmrks_META = createCommonMeta($inpt_act_intr_rmrks, mcframe.commonMS.meta.MS_META.INPT_ACT_INTR_RMRKS);
	public static final MCMeta inpt_act_rpt_rmrks_META = createCommonMeta($inpt_act_rpt_rmrks, mcframe.commonMS.meta.MS_META.INPT_ACT_RPT_RMRKS);
	public static final MCMeta inpt_act_trd_rmrks_META = createCommonMeta($inpt_act_trd_rmrks, mcframe.commonMA.meta.MA_META.TRD_RMRKS);
	public static final MCMeta inpt_act_sub_char1_META = createCommonMeta($inpt_act_sub_char1, mcframe.commonMS.meta.MS_META.INPT_ACT_SUB_CHAR1);
	public static final MCMeta inpt_act_sub_char2_META = createCommonMeta($inpt_act_sub_char2, mcframe.commonMS.meta.MS_META.INPT_ACT_SUB_CHAR2);
	public static final MCMeta inpt_act_sub_char3_META = createCommonMeta($inpt_act_sub_char3, mcframe.commonMS.meta.MS_META.INPT_ACT_SUB_CHAR3);
	public static final MCMeta loss_act_intr_rmrks_META = createCommonMeta($loss_act_intr_rmrks, mcframe.commonMS.meta.MS_META.LOSS_ACT_INTR_RMRKS);
	public static final MCMeta loss_act_trd_rmrks_META = createCommonMeta($loss_act_trd_rmrks, mcframe.commonMA.meta.MA_META.TRD_RMRKS);
	public static final MCMeta loss_act_sub_char1_META = createCommonMeta($loss_act_sub_char1, mcframe.commonMS.meta.MS_META.LOSS_ACT_SUB_CHAR1);
	public static final MCMeta loss_act_sub_char2_META = createCommonMeta($loss_act_sub_char2, mcframe.commonMS.meta.MS_META.LOSS_ACT_SUB_CHAR2);
	public static final MCMeta loss_act_sub_char3_META = createCommonMeta($loss_act_sub_char3, mcframe.commonMS.meta.MS_META.LOSS_ACT_SUB_CHAR3);
	public static final MCMeta mfg_act_rpt_rmrks_META = createCommonMeta($mfg_act_rpt_rmrks, mcframe.commonMS.meta.MS_META.MFG_ACT_RPT_RMRKS);
	public static final MCMeta mfg_act_intr_rmrks_META = createCommonMeta($mfg_act_intr_rmrks, mcframe.commonMS.meta.MS_META.MFG_ACT_INTR_RMRKS);
	public static final MCMeta mfg_act_sub_char1_META = createCommonMeta($mfg_act_sub_char1, mcframe.commonMS.meta.MS_META.MFG_ACT_SUB_CHAR1);
	public static final MCMeta mfg_act_sub_char2_META = createCommonMeta($mfg_act_sub_char2, mcframe.commonMS.meta.MS_META.MFG_ACT_SUB_CHAR2);
	public static final MCMeta mfg_act_sub_char3_META = createCommonMeta($mfg_act_sub_char3, mcframe.commonMS.meta.MS_META.MFG_ACT_SUB_CHAR3);
	public static final MCMeta oper_act_intr_rmrks_META = createCommonMeta($oper_act_intr_rmrks, mcframe.commonMS.meta.MS_META.OPER_ACT_INTR_RMRKS);
	public static final MCMeta oper_act_rpt_rmrks_META = createCommonMeta($oper_act_rpt_rmrks, mcframe.commonMS.meta.MS_META.OPER_ACT_RPT_RMRKS);
	public static final MCMeta oper_act_sub_char1_META = createCommonMeta($oper_act_sub_char1, mcframe.commonMS.meta.MS_META.OPER_ACT_SUB_CHAR1);
	public static final MCMeta oper_act_sub_char2_META = createCommonMeta($oper_act_sub_char2, mcframe.commonMS.meta.MS_META.OPER_ACT_SUB_CHAR2);
	public static final MCMeta oper_act_sub_char3_META = createCommonMeta($oper_act_sub_char3, mcframe.commonMS.meta.MS_META.OPER_ACT_SUB_CHAR3);
	public static final MCMeta itm_yield_META = createCommonMeta($itm_yield, mcframe.commonMA.meta.MA_META.YIELD);
	public static final MCMeta itm_lower_yield_META = createCommonMeta($itm_lower_yield, mcframe.commonMA.meta.MA_META.YIELD);
	public static final MCMeta itm_std_yield_META = createCommonMeta($itm_std_yield, mcframe.commonMA.meta.MA_META.YIELD);
	public static final MCMeta itm_upper_yield_META = createCommonMeta($itm_upper_yield, mcframe.commonMA.meta.MA_META.YIELD);
	public static final MCMeta oper_yield_META = createCommonMeta($oper_yield, mcframe.commonMA.meta.MA_META.YIELD);
	public static final MCMeta oper_lower_yield_META = createCommonMeta($oper_lower_yield, mcframe.commonMA.meta.MA_META.YIELD);
	public static final MCMeta oper_std_yield_META = createCommonMeta($oper_std_yield, mcframe.commonMA.meta.MA_META.YIELD);
	public static final MCMeta oper_upper_yield_META = createCommonMeta($oper_upper_yield, mcframe.commonMA.meta.MA_META.YIELD);
	public static final MCMeta sppl_cd_META = createCommonMeta($sppl_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta sppl_nm_META = createCommonMeta($sppl_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta mfg_str_ln_cd_META = createCommonMeta($mfg_str_ln_cd, mcframe.commonMA.meta.MA_META.STR_LN_CD);
	public static final MCMeta mfg_str_ln_nm_META = createCommonMeta($mfg_str_ln_nm, mcframe.commonMA.meta.MA_META.STR_LN_NM);
	public static final MCMeta mfg_str_ln_cd_none_flg_META = createCommonMeta($mfg_str_ln_cd_none_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta oper_loc_cd_META = createCommonMeta($oper_loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta oper_loc_nm_META = createCommonMeta($oper_loc_nm, mcframe.commonMA.meta.MA_META.LOC_NM);
	public static final MCMeta oper_str_ln_cd_META = createCommonMeta($oper_str_ln_cd, mcframe.commonMA.meta.MA_META.STR_LN_CD);
	public static final MCMeta oper_str_ln_nm_META = createCommonMeta($oper_str_ln_nm, mcframe.commonMA.meta.MA_META.STR_LN_NM);
	public static final MCMeta oper_str_ln_cd_none_flg_META = createCommonMeta($oper_str_ln_cd_none_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta mfg_loc_grp_cd_META = createCommonMeta($mfg_loc_grp_cd, mcframe.commonMA.meta.MA_META.LOC_GRP_CD);
	public static final MCMeta mfg_loc_grp_nm_META = createCommonMeta($mfg_loc_grp_nm, mcframe.commonMA.meta.MA_META.LOC_GRP_NM);
	public static final MCMeta site_cd_META = createCommonMeta($site_cd, mcframe.commonMA.meta.MA_META.SITE_CD);
	public static final MCMeta site_nm_META = createCommonMeta($site_nm, mcframe.commonMA.meta.MA_META.SITE_NM);
	public static final MCMeta wg_cd_META = createCommonMeta($wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta wg_nm_META = createCommonMeta($wg_nm, mcframe.commonMA.meta.MA_META.WG_NM);
	public static final MCMeta bom_ptn_META = createCommonMeta($bom_ptn, mcframe.commonMA.meta.MA_META.BOM_PTN);
	public static final MCMeta oper_ptn_META = createCommonMeta($oper_ptn, mcframe.commonMA.meta.MA_META.OPER_PTN);
	public static final MCMeta itm_ord_no_META = createCommonMeta($itm_ord_no, mcframe.commonMA.meta.MA_META.ITM_ORD_NO);
	public static final MCMeta mfg_inst_no_META = createCommonMeta($mfg_inst_no, mcframe.commonMA.meta.MA_META.MFG_INST_NO);
	public static final MCMeta div_seq_META = createCommonMeta($div_seq, mcframe.commonMS.meta.MS_META.DIV_SEQ);
	public static final MCMeta po_d_no_META = createCommonMeta($po_d_no, mcframe.commonMA.meta.MA_META.MFG_ACT_NO);
	public static final MCMeta mfg_act_no_META = createCommonMeta($mfg_act_no, mcframe.commonMA.meta.MA_META.MFG_ACT_NO);
	public static final MCMeta oper_inst_no_META = createCommonMeta($oper_inst_no, mcframe.commonMA.meta.MA_META.OPER_INST_NO);
	public static final MCMeta oper_act_no_META = createCommonMeta($oper_act_no, mcframe.commonMA.meta.MA_META.OPER_ACT_NO);
	public static final MCMeta oper_seq_META = createCommonMeta($oper_seq, mcframe.commonMA.meta.MA_META.OPER_SEQ);
	public static final MCMeta oper_disp_seq_META = createCommonMeta($oper_disp_seq, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta oper_usr_cd_META = createCommonMeta($oper_usr_cd, mcframe.commonMA.meta.MA_META.USR_CD);
	public static final MCMeta oper_usr_nm_META = createCommonMeta($oper_usr_nm, mcframe.commonMA.meta.MA_META.USR_NM);
	public static final MCMeta chd_itm_typ_META = createCommonMeta($chd_itm_typ, mcframe.commonMA.meta.MA_META.ITM_TYP);
	public static final MCMeta chd_itm_typ_nm_META = createCommonMeta($chd_itm_typ_nm, mcframe.commonMA.meta.MA_META.ITM_TYP_NM);
	public static final MCMeta chd_itm_typ_d_cd_META = createCommonMeta($chd_itm_typ_d_cd, mcframe.commonMA.meta.MA_META.ITM_TYP_D_CD);
	public static final MCMeta chd_itm_typ_d_nm_META = createCommonMeta($chd_itm_typ_d_nm, mcframe.commonMA.meta.MA_META.ITM_TYP_D_NM);
	public static final MCMeta par_itm_typ_META = createCommonMeta($par_itm_typ, mcframe.commonMA.meta.MA_META.ITM_TYP);
	public static final MCMeta par_itm_typ_nm_META = createCommonMeta($par_itm_typ_nm, mcframe.commonMA.meta.MA_META.ITM_TYP_NM);
	public static final MCMeta par_itm_typ_d_cd_META = createCommonMeta($par_itm_typ_d_cd, mcframe.commonMA.meta.MA_META.ITM_TYP_D_CD);
	public static final MCMeta par_itm_typ_d_nm_META = createCommonMeta($par_itm_typ_d_nm, mcframe.commonMA.meta.MA_META.ITM_TYP_D_NM);
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
	public static final MCMeta chd_itm_grp_p_META = createInnerRowMeta($chd_itm_grp_p, mcframe.clientMAUB.MAUBP5170.ItmGrpR.class);
	public static final MCMeta par_itm_grp_p_META = createInnerRowMeta($par_itm_grp_p, mcframe.clientMAUB.MAUBP5170.ItmGrpR.class);

	protected static final ConstMetaList<RsltR> constMetas = new ConstMetaList<RsltR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			inpt_mfg_sts_typ_META,
			inpt_mfg_sts_typ_nm_META,
			mfg_mtd_typ_META,
			mfg_mtd_typ_nm_META,
			mfg_loc_cd_META,
			mfg_loc_nm_META,
			oper_cd_META,
			oper_nm_META,
			chd_itm_p_META,
			ver_no_p_META,
			inpt_qty_p_META,
			loss_qty_p_META,
			loss_rsn_cd_META,
			loss_rsn_nm_META,
			sum_loss_qty_p_META,
			sum_fxd_loss_qty_p_META,
			inpt_rem_qty_p_META,
			abort_flg_META,
			schd_abort_flg_META,
			schd_inpt_qty_p_META,
			schd_rqmt_qty_p_META,
			schd_fxd_rqmt_qty_p_META,
			base_unit_cd_META,
			base_unit_nm_META,
			base_unit_dec_place_META,
			pr_rate_META,
			lot_no_p_META,
			inst_lot_no_META,
			inst_sublot_no_META,
			act_tm_p_META,
			ac_dt_p_META,
			schd_tm_p_META,
			sno_p_META,
			gd_cd_META,
			gd_nm_META,
			inpt_rsn_cd_META,
			inpt_rsn_nm_META,
			inpt_loc_cd_META,
			inpt_loc_nm_META,
			inpt_str_ln_p_META,
			cont_fctr_flg_META,
			cont_fctr_rnd_typ_META,
			cont_fctr_dec_place_META,
			act_cont_fctr_p_META,
			cont_fctr_unit_cd_p_META,
			std_cont_fctr_p_META,
			cont_inpt_qty_p_META,
			cont_loss_qty_p_META,
			cont_fxd_loss_qty_p_META,
			cont_schd_inpt_qty_p_META,
			cont_schd_rqmt_qty_p_META,
			cont_schd_fxd_rqmt_qty_p_META,
			prov_typ_META,
			prov_typ_nm_META,
			alt_grp_cd_META,
			alt_grp_nm_META,
			alt_grp_seq_META,
			alt_itm_fix_flg_META,
			alt_itm_typ_META,
			alt_itm_typ_nm_META,
			alt_alloc_prio_META,
			inpt_schd_no_META,
			inpt_act_no_META,
			loss_act_no_META,
			mes_id_META,
			data_no_META,
			ext_sys_cd_META,
			ext_sys_nm_META,
			ext_inpt_act_no_META,
			disp_seq_META,
			par_itm_p_META,
			st_act_p_META,
			st_ac_dt_p_META,
			end_act_p_META,
			end_ac_dt_p_META,
			base_unit_mfg_inst_qty_p_META,
			base_unit_yield_schd_qty_p_META,
			base_unit_st_act_qty_p_META,
			base_unit_yield_qty_p_META,
			base_unit_dfct_qty_p_META,
			par_base_unit_cd_META,
			par_base_unit_nm_META,
			par_base_unit_dec_place_META,
			par_act_lot_no_META,
			par_act_sublot_no_META,
			par_inst_lot_no_META,
			par_inst_sublot_no_META,
			oper_mfg_sts_typ_META,
			oper_mfg_sts_typ_nm_META,
			oper_unit_act_qty_p_META,
			oper_unit_schd_qty_p_META,
			oper_unit_cd_META,
			oper_unit_nm_META,
			oper_unit_dec_place_META,
			par_sno_p_META,
			alloc_flg_META,
			inpt_ctl_typ_META,
			inpt_ctl_typ_nm_META,
			main_itm_flg_META,
			yield_calc_flg_META,
			bkf_upd_flg_META,
			lot_mix_flg_META,
			sublot_mix_flg_META,
			inst_ver_no_p_META,
			stk_mng_typ_META,
			stk_mng_typ_nm_META,
			bkf_typ_META,
			bkf_typ_nm_META,
			alloc_ctl_typ_META,
			alloc_ctl_typ_nm_META,
			stk_id_typ_META,
			stk_id_typ_nm_META,
			stk_bp_cd_META,
			stk_bp_nm_META,
			stk_arrv_bp_cd_META,
			stk_arrv_bp_nm_META,
			acxfr_act_qty_p_META,
			cont_acxfr_act_qty_p_META,
			acxfr_act_rsn_cd_META,
			acxfr_act_rsn_nm_META,
			acxfr_act_bd_dpt_cd_META,
			acxfr_act_bd_dpt_nm_META,
			inpt_schd_intr_rmrks_META,
			inpt_schd_inst_rpt_rmrks_META,
			inpt_schd_sub_char1_META,
			inpt_schd_sub_char2_META,
			inpt_schd_sub_char3_META,
			inpt_act_intr_rmrks_META,
			inpt_act_rpt_rmrks_META,
			inpt_act_trd_rmrks_META,
			inpt_act_sub_char1_META,
			inpt_act_sub_char2_META,
			inpt_act_sub_char3_META,
			loss_act_intr_rmrks_META,
			loss_act_trd_rmrks_META,
			loss_act_sub_char1_META,
			loss_act_sub_char2_META,
			loss_act_sub_char3_META,
			mfg_act_rpt_rmrks_META,
			mfg_act_intr_rmrks_META,
			mfg_act_sub_char1_META,
			mfg_act_sub_char2_META,
			mfg_act_sub_char3_META,
			oper_act_intr_rmrks_META,
			oper_act_rpt_rmrks_META,
			oper_act_sub_char1_META,
			oper_act_sub_char2_META,
			oper_act_sub_char3_META,
			itm_yield_META,
			itm_lower_yield_META,
			itm_std_yield_META,
			itm_upper_yield_META,
			oper_yield_META,
			oper_lower_yield_META,
			oper_std_yield_META,
			oper_upper_yield_META,
			sppl_cd_META,
			sppl_nm_META,
			mfg_str_ln_cd_META,
			mfg_str_ln_nm_META,
			mfg_str_ln_cd_none_flg_META,
			oper_loc_cd_META,
			oper_loc_nm_META,
			oper_str_ln_cd_META,
			oper_str_ln_nm_META,
			oper_str_ln_cd_none_flg_META,
			mfg_loc_grp_cd_META,
			mfg_loc_grp_nm_META,
			site_cd_META,
			site_nm_META,
			wg_cd_META,
			wg_nm_META,
			bom_ptn_META,
			oper_ptn_META,
			itm_ord_no_META,
			mfg_inst_no_META,
			div_seq_META,
			po_d_no_META,
			mfg_act_no_META,
			oper_inst_no_META,
			oper_act_no_META,
			oper_seq_META,
			oper_disp_seq_META,
			oper_usr_cd_META,
			oper_usr_nm_META,
			chd_itm_typ_META,
			chd_itm_typ_nm_META,
			chd_itm_typ_d_cd_META,
			chd_itm_typ_d_nm_META,
			par_itm_typ_META,
			par_itm_typ_nm_META,
			par_itm_typ_d_cd_META,
			par_itm_typ_d_nm_META,
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
			chd_itm_grp_p_META,
			par_itm_grp_p_META
		},
		new String[][]{
			{
				"chd_itm_cd",
				"chd_itm_sub1",
				"chd_itm_sub2",
				"chd_itm_sub3",
				"chd_itm_nm",
				"ver_no",
				"base_unit_inpt_qty",
				"loss_qty",
				"base_unit_loss_qty",
				"base_unit_fxd_loss_qty",
				"base_unit_inpt_rem_qty",
				"base_unit_schd_inpt_qty",
				"base_unit_schd_rqmt_qty",
				"base_unit_schd_fxd_rqmt_qty",
				"crt_lot_flg",
				"act_lot_no",
				"act_sublot_no",
				"act_dt",
				"act_hm",
				"ac_dt",
				"schd_dt",
				"schd_hm",
				"sno1",
				"sno2",
				"sno3",
				"sno4",
				"inpt_str_ln_cd",
				"inpt_str_ln_nm",
				"inpt_str_ln_cd_none_flg",
				"act_cont_fctr",
				"cont_fctr_unit_cd",
				"cont_fctr_unit_nm",
				"std_cont_fctr",
				"cont_inpt_qty",
				"cont_loss_qty",
				"cont_fxd_loss_qty",
				"cont_schd_inpt_qty",
				"cont_schd_rqmt_qty",
				"cont_schd_fxd_rqmt_qty",
				"par_itm_cd",
				"par_itm_sub1",
				"par_itm_sub2",
				"par_itm_sub3",
				"par_itm_nm",
				"st_act_dt",
				"st_act_hm",
				"st_ac_dt",
				"end_act_dt",
				"end_act_hm",
				"end_ac_dt",
				"base_unit_mfg_inst_qty",
				"base_unit_yield_schd_qty",
				"base_unit_st_act_qty",
				"base_unit_yield_qty",
				"base_unit_dfct_qty",
				"oper_unit_act_qty",
				"oper_unit_schd_qty",
				"par_sno1",
				"par_sno2",
				"par_sno3",
				"par_sno4",
				"wrk_no",
				"wrk_nm",
				"inpt_schd_ver_no",
				"acxfr_act_qty",
				"cont_acxfr_act_qty",
				"chd_itm_grp_cd1",
				"chd_itm_grp_nm1",
				"chd_itm_grp_cd2",
				"chd_itm_grp_nm2",
				"chd_itm_grp_cd3",
				"chd_itm_grp_nm3",
				"chd_itm_grp_cd4",
				"chd_itm_grp_nm4",
				"chd_itm_grp_cd5",
				"chd_itm_grp_nm5",
				"chd_itm_grp_cd6",
				"chd_itm_grp_nm6",
				"chd_itm_grp_cd7",
				"chd_itm_grp_nm7",
				"chd_itm_grp_cd8",
				"chd_itm_grp_nm8",
				"chd_itm_grp_cd9",
				"chd_itm_grp_nm9",
				"chd_itm_grp_cd10",
				"chd_itm_grp_nm10",
				"par_itm_grp_cd1",
				"par_itm_grp_nm1",
				"par_itm_grp_cd2",
				"par_itm_grp_nm2",
				"par_itm_grp_cd3",
				"par_itm_grp_nm3",
				"par_itm_grp_cd4",
				"par_itm_grp_nm4",
				"par_itm_grp_cd5",
				"par_itm_grp_nm5",
				"par_itm_grp_cd6",
				"par_itm_grp_nm6",
				"par_itm_grp_cd7",
				"par_itm_grp_nm7",
				"par_itm_grp_cd8",
				"par_itm_grp_nm8",
				"par_itm_grp_cd9",
				"par_itm_grp_nm9",
				"par_itm_grp_cd10",
				"par_itm_grp_nm10"
			},
			{
				$chd_itm_cd,
				$chd_itm_sub1,
				$chd_itm_sub2,
				$chd_itm_sub3,
				$chd_itm_nm,
				$ver_no,
				$base_unit_inpt_qty,
				$loss_qty,
				$base_unit_loss_qty,
				$base_unit_fxd_loss_qty,
				$base_unit_inpt_rem_qty,
				$base_unit_schd_inpt_qty,
				$base_unit_schd_rqmt_qty,
				$base_unit_schd_fxd_rqmt_qty,
				$crt_lot_flg,
				$act_lot_no,
				$act_sublot_no,
				$act_dt,
				$act_hm,
				$ac_dt,
				$schd_dt,
				$schd_hm,
				$sno1,
				$sno2,
				$sno3,
				$sno4,
				$inpt_str_ln_cd,
				$inpt_str_ln_nm,
				$inpt_str_ln_cd_none_flg,
				$act_cont_fctr,
				$cont_fctr_unit_cd,
				$cont_fctr_unit_nm,
				$std_cont_fctr,
				$cont_inpt_qty,
				$cont_loss_qty,
				$cont_fxd_loss_qty,
				$cont_schd_inpt_qty,
				$cont_schd_rqmt_qty,
				$cont_schd_fxd_rqmt_qty,
				$par_itm_cd,
				$par_itm_sub1,
				$par_itm_sub2,
				$par_itm_sub3,
				$par_itm_nm,
				$st_act_dt,
				$st_act_hm,
				$st_ac_dt,
				$end_act_dt,
				$end_act_hm,
				$end_ac_dt,
				$base_unit_mfg_inst_qty,
				$base_unit_yield_schd_qty,
				$base_unit_st_act_qty,
				$base_unit_yield_qty,
				$base_unit_dfct_qty,
				$oper_unit_act_qty,
				$oper_unit_schd_qty,
				$par_sno1,
				$par_sno2,
				$par_sno3,
				$par_sno4,
				$wrk_no,
				$wrk_nm,
				$inpt_schd_ver_no,
				$acxfr_act_qty,
				$cont_acxfr_act_qty,
				$chd_itm_grp_cd1,
				$chd_itm_grp_nm1,
				$chd_itm_grp_cd2,
				$chd_itm_grp_nm2,
				$chd_itm_grp_cd3,
				$chd_itm_grp_nm3,
				$chd_itm_grp_cd4,
				$chd_itm_grp_nm4,
				$chd_itm_grp_cd5,
				$chd_itm_grp_nm5,
				$chd_itm_grp_cd6,
				$chd_itm_grp_nm6,
				$chd_itm_grp_cd7,
				$chd_itm_grp_nm7,
				$chd_itm_grp_cd8,
				$chd_itm_grp_nm8,
				$chd_itm_grp_cd9,
				$chd_itm_grp_nm9,
				$chd_itm_grp_cd10,
				$chd_itm_grp_nm10,
				$par_itm_grp_cd1,
				$par_itm_grp_nm1,
				$par_itm_grp_cd2,
				$par_itm_grp_nm2,
				$par_itm_grp_cd3,
				$par_itm_grp_nm3,
				$par_itm_grp_cd4,
				$par_itm_grp_nm4,
				$par_itm_grp_cd5,
				$par_itm_grp_nm5,
				$par_itm_grp_cd6,
				$par_itm_grp_nm6,
				$par_itm_grp_cd7,
				$par_itm_grp_nm7,
				$par_itm_grp_cd8,
				$par_itm_grp_nm8,
				$par_itm_grp_cd9,
				$par_itm_grp_nm9,
				$par_itm_grp_cd10,
				$par_itm_grp_nm10
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
				{$gd_cd, "STK_GD"},	// gd_cd
				{$gd_nm, "STK_GD"},	// gd_nm
				{$itm_yield, "YIELD"},	// itm_yield
				{$itm_lower_yield, "YIELD"},	// itm_lower_yield
				{$itm_std_yield, "YIELD"},	// itm_std_yield
				{$itm_upper_yield, "YIELD"},	// itm_upper_yield
				{$oper_yield, "YIELD"},	// oper_yield
				{$oper_lower_yield, "YIELD"},	// oper_lower_yield
				{$oper_std_yield, "YIELD"},	// oper_std_yield
				{$oper_upper_yield, "YIELD"},	// oper_upper_yield
				{$mfg_str_ln_cd, "STR_LN"},	// mfg_str_ln_cd
				{$mfg_str_ln_nm, "STR_LN"},	// mfg_str_ln_nm
				{$mfg_str_ln_cd_none_flg, "STR_LN"},	// mfg_str_ln_cd_none_flg
				{$oper_str_ln_cd, "STR_LN"},	// oper_str_ln_cd
				{$oper_str_ln_nm, "STR_LN"},	// oper_str_ln_nm
				{$oper_str_ln_cd_none_flg, "STR_LN"},	// oper_str_ln_cd_none_flg
				{$mfg_loc_grp_cd, "LOC_GRP"},	// mfg_loc_grp_cd
				{$mfg_loc_grp_nm, "LOC_GRP"},	// mfg_loc_grp_nm
				{$site_cd, "SITE"},	// site_cd
				{$site_nm, "SITE"},	// site_nm
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
	 * Mfg. status (Input) 製造状況区分（投入）.<p>
	 *
	 */
	public String inpt_mfg_sts_typ() {
		return getConstString(offset + 0, $inpt_mfg_sts_typ);
	}

	/**
	 * Mfg. status (Input) 製造状況区分（投入）.<p>
	 *
	 */
	public void inpt_mfg_sts_typ(String value) {
		setConstString(offset + 0, $inpt_mfg_sts_typ, value);
	}


	/**
	 * Mfg. status name (Input) 製造状況区分名（投入）.<p>
	 *
	 */
	public String inpt_mfg_sts_typ_nm() {
		return getConstString(offset + 1, $inpt_mfg_sts_typ_nm);
	}

	/**
	 * Mfg. status name (Input) 製造状況区分名（投入）.<p>
	 *
	 */
	public void inpt_mfg_sts_typ_nm(String value) {
		setConstString(offset + 1, $inpt_mfg_sts_typ_nm, value);
	}


	/**
	 * Production method type 生産方法区分.<p>
	 *
	 */
	public String mfg_mtd_typ() {
		return getConstString(offset + 2, $mfg_mtd_typ);
	}

	/**
	 * Production method type 生産方法区分.<p>
	 *
	 */
	public void mfg_mtd_typ(String value) {
		setConstString(offset + 2, $mfg_mtd_typ, value);
	}


	/**
	 * Production method type name 生産方法区分名.<p>
	 *
	 */
	public String mfg_mtd_typ_nm() {
		return getConstString(offset + 3, $mfg_mtd_typ_nm);
	}

	/**
	 * Production method type name 生産方法区分名.<p>
	 *
	 */
	public void mfg_mtd_typ_nm(String value) {
		setConstString(offset + 3, $mfg_mtd_typ_nm, value);
	}


	/**
	 * Mfg. location cd. 製造場所ＣＤ.<p>
	 *
	 */
	public String mfg_loc_cd() {
		return getConstString(offset + 4, $mfg_loc_cd);
	}

	/**
	 * Mfg. location cd. 製造場所ＣＤ.<p>
	 *
	 */
	public void mfg_loc_cd(String value) {
		setConstString(offset + 4, $mfg_loc_cd, value);
	}


	/**
	 * Mfg. location name 製造場所名.<p>
	 *
	 */
	public String mfg_loc_nm() {
		return getConstString(offset + 5, $mfg_loc_nm);
	}

	/**
	 * Mfg. location name 製造場所名.<p>
	 *
	 */
	public void mfg_loc_nm(String value) {
		setConstString(offset + 5, $mfg_loc_nm, value);
	}


	/**
	 * Operation cd. 工程ＣＤ.<p>
	 *
	 */
	public String oper_cd() {
		return getConstString(offset + 6, $oper_cd);
	}

	/**
	 * Operation cd. 工程ＣＤ.<p>
	 *
	 */
	public void oper_cd(String value) {
		setConstString(offset + 6, $oper_cd, value);
	}


	/**
	 * Operation name 工程名.<p>
	 *
	 */
	public String oper_nm() {
		return getConstString(offset + 7, $oper_nm);
	}

	/**
	 * Operation name 工程名.<p>
	 *
	 */
	public void oper_nm(String value) {
		setConstString(offset + 7, $oper_nm, value);
	}


	public mcframe.clientMAUB.MAUBP5030.ItmR chd_itm_p(){
		return (mcframe.clientMAUB.MAUBP5030.ItmR) getConstInnerRow(offset + 8, $chd_itm_p);
	}
	
	public void chd_itm_p(mcframe.clientMAUB.MAUBP5030.ItmR row){
		setConstInnerRow(offset + 8, $chd_itm_p, row);
	}


	public mcframe.clientMAUB.MAUBP5250.VerNoR ver_no_p(){
		return (mcframe.clientMAUB.MAUBP5250.VerNoR) getConstInnerRow(offset + 9, $ver_no_p);
	}
	
	public void ver_no_p(mcframe.clientMAUB.MAUBP5250.VerNoR row){
		setConstInnerRow(offset + 9, $ver_no_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR inpt_qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 10, $inpt_qty_p);
	}
	
	public void inpt_qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 10, $inpt_qty_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR loss_qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 11, $loss_qty_p);
	}
	
	public void loss_qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 11, $loss_qty_p, row);
	}


	/**
	 * Loss reason cd. ロス理由ＣＤ.<p>
	 *
	 */
	public String loss_rsn_cd() {
		return getConstString(offset + 12, $loss_rsn_cd);
	}

	/**
	 * Loss reason cd. ロス理由ＣＤ.<p>
	 *
	 */
	public void loss_rsn_cd(String value) {
		setConstString(offset + 12, $loss_rsn_cd, value);
	}


	/**
	 * Loss reason name ロス理由名.<p>
	 *
	 */
	public String loss_rsn_nm() {
		return getConstString(offset + 13, $loss_rsn_nm);
	}

	/**
	 * Loss reason name ロス理由名.<p>
	 *
	 */
	public void loss_rsn_nm(String value) {
		setConstString(offset + 13, $loss_rsn_nm, value);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR sum_loss_qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 14, $sum_loss_qty_p);
	}
	
	public void sum_loss_qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 14, $sum_loss_qty_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR sum_fxd_loss_qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 15, $sum_fxd_loss_qty_p);
	}
	
	public void sum_fxd_loss_qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 15, $sum_fxd_loss_qty_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR inpt_rem_qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 16, $inpt_rem_qty_p);
	}
	
	public void inpt_rem_qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 16, $inpt_rem_qty_p, row);
	}


	/**
	 * Cancel remaining 打切.<p>
	 *
	 */
	public boolean abort_flg() {
		return getConstBoolean(offset + 17, $abort_flg);
	}

	/**
	 * Cancel remaining 打切.<p>
	 *
	 */
	public void abort_flg(boolean value) {
		setConstBoolean(offset + 17, $abort_flg, value);
	}


	/**
	 * Cancel remaining orders started 着手打切.<p>
	 *
	 */
	public boolean schd_abort_flg() {
		return getConstBoolean(offset + 18, $schd_abort_flg);
	}

	/**
	 * Cancel remaining orders started 着手打切.<p>
	 *
	 */
	public void schd_abort_flg(boolean value) {
		setConstBoolean(offset + 18, $schd_abort_flg, value);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR schd_inpt_qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 19, $schd_inpt_qty_p);
	}
	
	public void schd_inpt_qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 19, $schd_inpt_qty_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR schd_rqmt_qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 20, $schd_rqmt_qty_p);
	}
	
	public void schd_rqmt_qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 20, $schd_rqmt_qty_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR schd_fxd_rqmt_qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 21, $schd_fxd_rqmt_qty_p);
	}
	
	public void schd_fxd_rqmt_qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 21, $schd_fxd_rqmt_qty_p, row);
	}


	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public String base_unit_cd() {
		return getConstString(offset + 22, $base_unit_cd);
	}

	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public void base_unit_cd(String value) {
		setConstString(offset + 22, $base_unit_cd, value);
	}


	/**
	 * Base unit name 基準単位名.<p>
	 *
	 */
	public String base_unit_nm() {
		return getConstString(offset + 23, $base_unit_nm);
	}

	/**
	 * Base unit name 基準単位名.<p>
	 *
	 */
	public void base_unit_nm(String value) {
		setConstString(offset + 23, $base_unit_nm, value);
	}


	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public MCNumber base_unit_dec_place() {
		return getConstNumber(offset + 24, $base_unit_dec_place);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(MCNumber value) {
		setConstNumber(offset + 24, $base_unit_dec_place, value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(int value) {
		setConstNumber(offset + 24, $base_unit_dec_place, value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(long value) {
		setConstNumber(offset + 24, $base_unit_dec_place, value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(float value) {
		setConstNumber(offset + 24, $base_unit_dec_place, value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(double value) {
		setConstNumber(offset + 24, $base_unit_dec_place, value);
	}


	/**
	 * Progress 進捗率.<p>
	 *
	 */
	public MCNumber pr_rate() {
		return getConstNumber(offset + 25, $pr_rate);
	}

	/**
	 * Progress 進捗率.<p>
	 *
	 */
	public void pr_rate(MCNumber value) {
		setConstNumber(offset + 25, $pr_rate, value);
	}

	/**
	 * Progress 進捗率.<p>
	 *
	 */
	public void pr_rate(int value) {
		setConstNumber(offset + 25, $pr_rate, value);
	}

	/**
	 * Progress 進捗率.<p>
	 *
	 */
	public void pr_rate(long value) {
		setConstNumber(offset + 25, $pr_rate, value);
	}

	/**
	 * Progress 進捗率.<p>
	 *
	 */
	public void pr_rate(float value) {
		setConstNumber(offset + 25, $pr_rate, value);
	}

	/**
	 * Progress 進捗率.<p>
	 *
	 */
	public void pr_rate(double value) {
		setConstNumber(offset + 25, $pr_rate, value);
	}


	public mcframe.clientMSUB.MSUBP5030.LotNoR lot_no_p(){
		return (mcframe.clientMSUB.MSUBP5030.LotNoR) getConstInnerRow(offset + 26, $lot_no_p);
	}
	
	public void lot_no_p(mcframe.clientMSUB.MSUBP5030.LotNoR row){
		setConstInnerRow(offset + 26, $lot_no_p, row);
	}


	/**
	 * Lot No. (Order) ロットＮＯ（指図）.<p>
	 *
	 */
	public String inst_lot_no() {
		return getConstString(offset + 27, $inst_lot_no);
	}

	/**
	 * Lot No. (Order) ロットＮＯ（指図）.<p>
	 *
	 */
	public void inst_lot_no(String value) {
		setConstString(offset + 27, $inst_lot_no, value);
	}


	/**
	 * Sublot No. (Order) サブロットＮＯ（指図）.<p>
	 *
	 */
	public String inst_sublot_no() {
		return getConstString(offset + 28, $inst_sublot_no);
	}

	/**
	 * Sublot No. (Order) サブロットＮＯ（指図）.<p>
	 *
	 */
	public void inst_sublot_no(String value) {
		setConstString(offset + 28, $inst_sublot_no, value);
	}


	public mcframe.clientMAUB.MAUBP5320.YmdHmR act_tm_p(){
		return (mcframe.clientMAUB.MAUBP5320.YmdHmR) getConstInnerRow(offset + 29, $act_tm_p);
	}
	
	public void act_tm_p(mcframe.clientMAUB.MAUBP5320.YmdHmR row){
		setConstInnerRow(offset + 29, $act_tm_p, row);
	}


	public mcframe.clientMAUB.MAUBP5220.AcDtR ac_dt_p(){
		return (mcframe.clientMAUB.MAUBP5220.AcDtR) getConstInnerRow(offset + 30, $ac_dt_p);
	}
	
	public void ac_dt_p(mcframe.clientMAUB.MAUBP5220.AcDtR row){
		setConstInnerRow(offset + 30, $ac_dt_p, row);
	}


	public mcframe.clientMAUB.MAUBP5320.YmdHmR schd_tm_p(){
		return (mcframe.clientMAUB.MAUBP5320.YmdHmR) getConstInnerRow(offset + 31, $schd_tm_p);
	}
	
	public void schd_tm_p(mcframe.clientMAUB.MAUBP5320.YmdHmR row){
		setConstInnerRow(offset + 31, $schd_tm_p, row);
	}


	public mcframe.clientMAUB.MAUBP5070.SnoR sno_p(){
		return (mcframe.clientMAUB.MAUBP5070.SnoR) getConstInnerRow(offset + 32, $sno_p);
	}
	
	public void sno_p(mcframe.clientMAUB.MAUBP5070.SnoR row){
		setConstInnerRow(offset + 32, $sno_p, row);
	}


	/**
	 * Grading cd. 格付ＣＤ.<p>
	 *
	 */
	public String gd_cd() {
		return getConstString(offset + 33, $gd_cd);
	}

	/**
	 * Grading cd. 格付ＣＤ.<p>
	 *
	 */
	public void gd_cd(String value) {
		setConstString(offset + 33, $gd_cd, value);
	}


	/**
	 * Grading name 格付名.<p>
	 *
	 */
	public String gd_nm() {
		return getConstString(offset + 34, $gd_nm);
	}

	/**
	 * Grading name 格付名.<p>
	 *
	 */
	public void gd_nm(String value) {
		setConstString(offset + 34, $gd_nm, value);
	}


	/**
	 * Input reason cd. 投入理由ＣＤ.<p>
	 *
	 */
	public String inpt_rsn_cd() {
		return getConstString(offset + 35, $inpt_rsn_cd);
	}

	/**
	 * Input reason cd. 投入理由ＣＤ.<p>
	 *
	 */
	public void inpt_rsn_cd(String value) {
		setConstString(offset + 35, $inpt_rsn_cd, value);
	}


	/**
	 * Input reason name 投入理由名.<p>
	 *
	 */
	public String inpt_rsn_nm() {
		return getConstString(offset + 36, $inpt_rsn_nm);
	}

	/**
	 * Input reason name 投入理由名.<p>
	 *
	 */
	public void inpt_rsn_nm(String value) {
		setConstString(offset + 36, $inpt_rsn_nm, value);
	}


	/**
	 * Input location cd. 投入場所ＣＤ.<p>
	 *
	 */
	public String inpt_loc_cd() {
		return getConstString(offset + 37, $inpt_loc_cd);
	}

	/**
	 * Input location cd. 投入場所ＣＤ.<p>
	 *
	 */
	public void inpt_loc_cd(String value) {
		setConstString(offset + 37, $inpt_loc_cd, value);
	}


	/**
	 * Input location name 投入場所名.<p>
	 *
	 */
	public String inpt_loc_nm() {
		return getConstString(offset + 38, $inpt_loc_nm);
	}

	/**
	 * Input location name 投入場所名.<p>
	 *
	 */
	public void inpt_loc_nm(String value) {
		setConstString(offset + 38, $inpt_loc_nm, value);
	}


	public mcframe.clientMAUB.MAUBP5120.StrLnR inpt_str_ln_p(){
		return (mcframe.clientMAUB.MAUBP5120.StrLnR) getConstInnerRow(offset + 39, $inpt_str_ln_p);
	}
	
	public void inpt_str_ln_p(mcframe.clientMAUB.MAUBP5120.StrLnR row){
		setConstInnerRow(offset + 39, $inpt_str_ln_p, row);
	}


	/**
	 * For active ingredient 有効成分対象.<p>
	 *
	 */
	public boolean cont_fctr_flg() {
		return getConstBoolean(offset + 40, $cont_fctr_flg);
	}

	/**
	 * For active ingredient 有効成分対象.<p>
	 *
	 */
	public void cont_fctr_flg(boolean value) {
		setConstBoolean(offset + 40, $cont_fctr_flg, value);
	}


	/**
	 * Rounding type (Active ingredient conversion) 有効成分換算端数処理区分.<p>
	 *
	 */
	public String cont_fctr_rnd_typ() {
		return getConstString(offset + 41, $cont_fctr_rnd_typ);
	}

	/**
	 * Rounding type (Active ingredient conversion) 有効成分換算端数処理区分.<p>
	 *
	 */
	public void cont_fctr_rnd_typ(String value) {
		setConstString(offset + 41, $cont_fctr_rnd_typ, value);
	}


	/**
	 * Active ingredient number of decimal places 有効成分小数部有効桁数.<p>
	 *
	 */
	public MCNumber cont_fctr_dec_place() {
		return getConstNumber(offset + 42, $cont_fctr_dec_place);
	}

	/**
	 * Active ingredient number of decimal places 有効成分小数部有効桁数.<p>
	 *
	 */
	public void cont_fctr_dec_place(MCNumber value) {
		setConstNumber(offset + 42, $cont_fctr_dec_place, value);
	}

	/**
	 * Active ingredient number of decimal places 有効成分小数部有効桁数.<p>
	 *
	 */
	public void cont_fctr_dec_place(int value) {
		setConstNumber(offset + 42, $cont_fctr_dec_place, value);
	}

	/**
	 * Active ingredient number of decimal places 有効成分小数部有効桁数.<p>
	 *
	 */
	public void cont_fctr_dec_place(long value) {
		setConstNumber(offset + 42, $cont_fctr_dec_place, value);
	}

	/**
	 * Active ingredient number of decimal places 有効成分小数部有効桁数.<p>
	 *
	 */
	public void cont_fctr_dec_place(float value) {
		setConstNumber(offset + 42, $cont_fctr_dec_place, value);
	}

	/**
	 * Active ingredient number of decimal places 有効成分小数部有効桁数.<p>
	 *
	 */
	public void cont_fctr_dec_place(double value) {
		setConstNumber(offset + 42, $cont_fctr_dec_place, value);
	}


	public mcframe.clientMAUB.MAUBP5290.ActContFctrR act_cont_fctr_p(){
		return (mcframe.clientMAUB.MAUBP5290.ActContFctrR) getConstInnerRow(offset + 43, $act_cont_fctr_p);
	}
	
	public void act_cont_fctr_p(mcframe.clientMAUB.MAUBP5290.ActContFctrR row){
		setConstInnerRow(offset + 43, $act_cont_fctr_p, row);
	}


	public mcframe.clientMAUB.MAUBP5270.ContFctrUnitR cont_fctr_unit_cd_p(){
		return (mcframe.clientMAUB.MAUBP5270.ContFctrUnitR) getConstInnerRow(offset + 44, $cont_fctr_unit_cd_p);
	}
	
	public void cont_fctr_unit_cd_p(mcframe.clientMAUB.MAUBP5270.ContFctrUnitR row){
		setConstInnerRow(offset + 44, $cont_fctr_unit_cd_p, row);
	}


	public mcframe.clientMAUB.MAUBP5280.StdContFctrR std_cont_fctr_p(){
		return (mcframe.clientMAUB.MAUBP5280.StdContFctrR) getConstInnerRow(offset + 45, $std_cont_fctr_p);
	}
	
	public void std_cont_fctr_p(mcframe.clientMAUB.MAUBP5280.StdContFctrR row){
		setConstInnerRow(offset + 45, $std_cont_fctr_p, row);
	}


	public mcframe.clientMAUB.MAUBP5260.ContQtyR cont_inpt_qty_p(){
		return (mcframe.clientMAUB.MAUBP5260.ContQtyR) getConstInnerRow(offset + 46, $cont_inpt_qty_p);
	}
	
	public void cont_inpt_qty_p(mcframe.clientMAUB.MAUBP5260.ContQtyR row){
		setConstInnerRow(offset + 46, $cont_inpt_qty_p, row);
	}


	public mcframe.clientMAUB.MAUBP5260.ContQtyR cont_loss_qty_p(){
		return (mcframe.clientMAUB.MAUBP5260.ContQtyR) getConstInnerRow(offset + 47, $cont_loss_qty_p);
	}
	
	public void cont_loss_qty_p(mcframe.clientMAUB.MAUBP5260.ContQtyR row){
		setConstInnerRow(offset + 47, $cont_loss_qty_p, row);
	}


	public mcframe.clientMAUB.MAUBP5260.ContQtyR cont_fxd_loss_qty_p(){
		return (mcframe.clientMAUB.MAUBP5260.ContQtyR) getConstInnerRow(offset + 48, $cont_fxd_loss_qty_p);
	}
	
	public void cont_fxd_loss_qty_p(mcframe.clientMAUB.MAUBP5260.ContQtyR row){
		setConstInnerRow(offset + 48, $cont_fxd_loss_qty_p, row);
	}


	public mcframe.clientMAUB.MAUBP5260.ContQtyR cont_schd_inpt_qty_p(){
		return (mcframe.clientMAUB.MAUBP5260.ContQtyR) getConstInnerRow(offset + 49, $cont_schd_inpt_qty_p);
	}
	
	public void cont_schd_inpt_qty_p(mcframe.clientMAUB.MAUBP5260.ContQtyR row){
		setConstInnerRow(offset + 49, $cont_schd_inpt_qty_p, row);
	}


	public mcframe.clientMAUB.MAUBP5260.ContQtyR cont_schd_rqmt_qty_p(){
		return (mcframe.clientMAUB.MAUBP5260.ContQtyR) getConstInnerRow(offset + 50, $cont_schd_rqmt_qty_p);
	}
	
	public void cont_schd_rqmt_qty_p(mcframe.clientMAUB.MAUBP5260.ContQtyR row){
		setConstInnerRow(offset + 50, $cont_schd_rqmt_qty_p, row);
	}


	public mcframe.clientMAUB.MAUBP5260.ContQtyR cont_schd_fxd_rqmt_qty_p(){
		return (mcframe.clientMAUB.MAUBP5260.ContQtyR) getConstInnerRow(offset + 51, $cont_schd_fxd_rqmt_qty_p);
	}
	
	public void cont_schd_fxd_rqmt_qty_p(mcframe.clientMAUB.MAUBP5260.ContQtyR row){
		setConstInnerRow(offset + 51, $cont_schd_fxd_rqmt_qty_p, row);
	}


	/**
	 * Supply type 支給区分.<p>
	 *
	 */
	public String prov_typ() {
		return getConstString(offset + 52, $prov_typ);
	}

	/**
	 * Supply type 支給区分.<p>
	 *
	 */
	public void prov_typ(String value) {
		setConstString(offset + 52, $prov_typ, value);
	}


	/**
	 * Supply type name 支給区分名.<p>
	 *
	 */
	public String prov_typ_nm() {
		return getConstString(offset + 53, $prov_typ_nm);
	}

	/**
	 * Supply type name 支給区分名.<p>
	 *
	 */
	public void prov_typ_nm(String value) {
		setConstString(offset + 53, $prov_typ_nm, value);
	}


	/**
	 * Alternative group cd. 代替グループＣＤ.<p>
	 *
	 */
	public String alt_grp_cd() {
		return getConstString(offset + 54, $alt_grp_cd);
	}

	/**
	 * Alternative group cd. 代替グループＣＤ.<p>
	 *
	 */
	public void alt_grp_cd(String value) {
		setConstString(offset + 54, $alt_grp_cd, value);
	}


	/**
	 * Alternative group name 代替グループ名.<p>
	 *
	 */
	public String alt_grp_nm() {
		return getConstString(offset + 55, $alt_grp_nm);
	}

	/**
	 * Alternative group name 代替グループ名.<p>
	 *
	 */
	public void alt_grp_nm(String value) {
		setConstString(offset + 55, $alt_grp_nm, value);
	}


	/**
	 * Alternative group sequence number 代替グループ連番.<p>
	 *
	 */
	public MCNumber alt_grp_seq() {
		return getConstNumber(offset + 56, $alt_grp_seq);
	}

	/**
	 * Alternative group sequence number 代替グループ連番.<p>
	 *
	 */
	public void alt_grp_seq(MCNumber value) {
		setConstNumber(offset + 56, $alt_grp_seq, value);
	}

	/**
	 * Alternative group sequence number 代替グループ連番.<p>
	 *
	 */
	public void alt_grp_seq(int value) {
		setConstNumber(offset + 56, $alt_grp_seq, value);
	}

	/**
	 * Alternative group sequence number 代替グループ連番.<p>
	 *
	 */
	public void alt_grp_seq(long value) {
		setConstNumber(offset + 56, $alt_grp_seq, value);
	}

	/**
	 * Alternative group sequence number 代替グループ連番.<p>
	 *
	 */
	public void alt_grp_seq(float value) {
		setConstNumber(offset + 56, $alt_grp_seq, value);
	}

	/**
	 * Alternative group sequence number 代替グループ連番.<p>
	 *
	 */
	public void alt_grp_seq(double value) {
		setConstNumber(offset + 56, $alt_grp_seq, value);
	}


	/**
	 * Specify alternative item 代替品目指定.<p>
	 *
	 */
	public boolean alt_itm_fix_flg() {
		return getConstBoolean(offset + 57, $alt_itm_fix_flg);
	}

	/**
	 * Specify alternative item 代替品目指定.<p>
	 *
	 */
	public void alt_itm_fix_flg(boolean value) {
		setConstBoolean(offset + 57, $alt_itm_fix_flg, value);
	}


	/**
	 * Alternative item selection type 代替品目選択区分.<p>
	 *
	 */
	public String alt_itm_typ() {
		return getConstString(offset + 58, $alt_itm_typ);
	}

	/**
	 * Alternative item selection type 代替品目選択区分.<p>
	 *
	 */
	public void alt_itm_typ(String value) {
		setConstString(offset + 58, $alt_itm_typ, value);
	}


	/**
	 * Alternative item selection type name 代替品目選択区分名.<p>
	 *
	 */
	public String alt_itm_typ_nm() {
		return getConstString(offset + 59, $alt_itm_typ_nm);
	}

	/**
	 * Alternative item selection type name 代替品目選択区分名.<p>
	 *
	 */
	public void alt_itm_typ_nm(String value) {
		setConstString(offset + 59, $alt_itm_typ_nm, value);
	}


	/**
	 * Alternative item allocation priority 代替品目引当優先順位.<p>
	 *
	 */
	public MCNumber alt_alloc_prio() {
		return getConstNumber(offset + 60, $alt_alloc_prio);
	}

	/**
	 * Alternative item allocation priority 代替品目引当優先順位.<p>
	 *
	 */
	public void alt_alloc_prio(MCNumber value) {
		setConstNumber(offset + 60, $alt_alloc_prio, value);
	}

	/**
	 * Alternative item allocation priority 代替品目引当優先順位.<p>
	 *
	 */
	public void alt_alloc_prio(int value) {
		setConstNumber(offset + 60, $alt_alloc_prio, value);
	}

	/**
	 * Alternative item allocation priority 代替品目引当優先順位.<p>
	 *
	 */
	public void alt_alloc_prio(long value) {
		setConstNumber(offset + 60, $alt_alloc_prio, value);
	}

	/**
	 * Alternative item allocation priority 代替品目引当優先順位.<p>
	 *
	 */
	public void alt_alloc_prio(float value) {
		setConstNumber(offset + 60, $alt_alloc_prio, value);
	}

	/**
	 * Alternative item allocation priority 代替品目引当優先順位.<p>
	 *
	 */
	public void alt_alloc_prio(double value) {
		setConstNumber(offset + 60, $alt_alloc_prio, value);
	}


	/**
	 * Input schedule No. 投入予定ＮＯ.<p>
	 *
	 */
	public String inpt_schd_no() {
		return getConstString(offset + 61, $inpt_schd_no);
	}

	/**
	 * Input schedule No. 投入予定ＮＯ.<p>
	 *
	 */
	public void inpt_schd_no(String value) {
		setConstString(offset + 61, $inpt_schd_no, value);
	}


	/**
	 * Input result No. 投入実績ＮＯ.<p>
	 *
	 */
	public String inpt_act_no() {
		return getConstString(offset + 62, $inpt_act_no);
	}

	/**
	 * Input result No. 投入実績ＮＯ.<p>
	 *
	 */
	public void inpt_act_no(String value) {
		setConstString(offset + 62, $inpt_act_no, value);
	}


	/**
	 * Loss result No. ロス実績ＮＯ.<p>
	 *
	 */
	public String loss_act_no() {
		return getConstString(offset + 63, $loss_act_no);
	}

	/**
	 * Loss result No. ロス実績ＮＯ.<p>
	 *
	 */
	public void loss_act_no(String value) {
		setConstString(offset + 63, $loss_act_no, value);
	}


	/**
	 * MES ID ＭＥＳＩＤ.<p>
	 *
	 */
	public String mes_id() {
		return getConstString(offset + 64, $mes_id);
	}

	/**
	 * MES ID ＭＥＳＩＤ.<p>
	 *
	 */
	public void mes_id(String value) {
		setConstString(offset + 64, $mes_id, value);
	}


	/**
	 * Data No. データＮＯ.<p>
	 *
	 */
	public MCNumber data_no() {
		return getConstNumber(offset + 65, $data_no);
	}

	/**
	 * Data No. データＮＯ.<p>
	 *
	 */
	public void data_no(MCNumber value) {
		setConstNumber(offset + 65, $data_no, value);
	}

	/**
	 * Data No. データＮＯ.<p>
	 *
	 */
	public void data_no(int value) {
		setConstNumber(offset + 65, $data_no, value);
	}

	/**
	 * Data No. データＮＯ.<p>
	 *
	 */
	public void data_no(long value) {
		setConstNumber(offset + 65, $data_no, value);
	}

	/**
	 * Data No. データＮＯ.<p>
	 *
	 */
	public void data_no(float value) {
		setConstNumber(offset + 65, $data_no, value);
	}

	/**
	 * Data No. データＮＯ.<p>
	 *
	 */
	public void data_no(double value) {
		setConstNumber(offset + 65, $data_no, value);
	}


	/**
	 * External system cd. 外部システムＣＤ.<p>
	 *
	 */
	public String ext_sys_cd() {
		return getConstString(offset + 66, $ext_sys_cd);
	}

	/**
	 * External system cd. 外部システムＣＤ.<p>
	 *
	 */
	public void ext_sys_cd(String value) {
		setConstString(offset + 66, $ext_sys_cd, value);
	}


	/**
	 * External system name 外部システム名.<p>
	 *
	 */
	public String ext_sys_nm() {
		return getConstString(offset + 67, $ext_sys_nm);
	}

	/**
	 * External system name 外部システム名.<p>
	 *
	 */
	public void ext_sys_nm(String value) {
		setConstString(offset + 67, $ext_sys_nm, value);
	}


	/**
	 * External input result No. 外部投入実績ＮＯ.<p>
	 *
	 */
	public String ext_inpt_act_no() {
		return getConstString(offset + 68, $ext_inpt_act_no);
	}

	/**
	 * External input result No. 外部投入実績ＮＯ.<p>
	 *
	 */
	public void ext_inpt_act_no(String value) {
		setConstString(offset + 68, $ext_inpt_act_no, value);
	}


	/**
	 * Input display sequence 投入表示順.<p>
	 *
	 */
	public MCNumber disp_seq() {
		return getConstNumber(offset + 69, $disp_seq);
	}

	/**
	 * Input display sequence 投入表示順.<p>
	 *
	 */
	public void disp_seq(MCNumber value) {
		setConstNumber(offset + 69, $disp_seq, value);
	}

	/**
	 * Input display sequence 投入表示順.<p>
	 *
	 */
	public void disp_seq(int value) {
		setConstNumber(offset + 69, $disp_seq, value);
	}

	/**
	 * Input display sequence 投入表示順.<p>
	 *
	 */
	public void disp_seq(long value) {
		setConstNumber(offset + 69, $disp_seq, value);
	}

	/**
	 * Input display sequence 投入表示順.<p>
	 *
	 */
	public void disp_seq(float value) {
		setConstNumber(offset + 69, $disp_seq, value);
	}

	/**
	 * Input display sequence 投入表示順.<p>
	 *
	 */
	public void disp_seq(double value) {
		setConstNumber(offset + 69, $disp_seq, value);
	}


	public mcframe.clientMAUB.MAUBP5030.ItmR par_itm_p(){
		return (mcframe.clientMAUB.MAUBP5030.ItmR) getConstInnerRow(offset + 70, $par_itm_p);
	}
	
	public void par_itm_p(mcframe.clientMAUB.MAUBP5030.ItmR row){
		setConstInnerRow(offset + 70, $par_itm_p, row);
	}


	public mcframe.clientMAUB.MAUBP5320.YmdHmR st_act_p(){
		return (mcframe.clientMAUB.MAUBP5320.YmdHmR) getConstInnerRow(offset + 71, $st_act_p);
	}
	
	public void st_act_p(mcframe.clientMAUB.MAUBP5320.YmdHmR row){
		setConstInnerRow(offset + 71, $st_act_p, row);
	}


	public mcframe.clientMAUB.MAUBP5220.AcDtR st_ac_dt_p(){
		return (mcframe.clientMAUB.MAUBP5220.AcDtR) getConstInnerRow(offset + 72, $st_ac_dt_p);
	}
	
	public void st_ac_dt_p(mcframe.clientMAUB.MAUBP5220.AcDtR row){
		setConstInnerRow(offset + 72, $st_ac_dt_p, row);
	}


	public mcframe.clientMAUB.MAUBP5320.YmdHmR end_act_p(){
		return (mcframe.clientMAUB.MAUBP5320.YmdHmR) getConstInnerRow(offset + 73, $end_act_p);
	}
	
	public void end_act_p(mcframe.clientMAUB.MAUBP5320.YmdHmR row){
		setConstInnerRow(offset + 73, $end_act_p, row);
	}


	public mcframe.clientMAUB.MAUBP5220.AcDtR end_ac_dt_p(){
		return (mcframe.clientMAUB.MAUBP5220.AcDtR) getConstInnerRow(offset + 74, $end_ac_dt_p);
	}
	
	public void end_ac_dt_p(mcframe.clientMAUB.MAUBP5220.AcDtR row){
		setConstInnerRow(offset + 74, $end_ac_dt_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR base_unit_mfg_inst_qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 75, $base_unit_mfg_inst_qty_p);
	}
	
	public void base_unit_mfg_inst_qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 75, $base_unit_mfg_inst_qty_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR base_unit_yield_schd_qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 76, $base_unit_yield_schd_qty_p);
	}
	
	public void base_unit_yield_schd_qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 76, $base_unit_yield_schd_qty_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR base_unit_st_act_qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 77, $base_unit_st_act_qty_p);
	}
	
	public void base_unit_st_act_qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 77, $base_unit_st_act_qty_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR base_unit_yield_qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 78, $base_unit_yield_qty_p);
	}
	
	public void base_unit_yield_qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 78, $base_unit_yield_qty_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR base_unit_dfct_qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 79, $base_unit_dfct_qty_p);
	}
	
	public void base_unit_dfct_qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 79, $base_unit_dfct_qty_p, row);
	}


	/**
	 * Parent base unit cd. 親基準単位ＣＤ.<p>
	 *
	 */
	public String par_base_unit_cd() {
		return getConstString(offset + 80, $par_base_unit_cd);
	}

	/**
	 * Parent base unit cd. 親基準単位ＣＤ.<p>
	 *
	 */
	public void par_base_unit_cd(String value) {
		setConstString(offset + 80, $par_base_unit_cd, value);
	}


	/**
	 * Parent base unit name 親基準単位名.<p>
	 *
	 */
	public String par_base_unit_nm() {
		return getConstString(offset + 81, $par_base_unit_nm);
	}

	/**
	 * Parent base unit name 親基準単位名.<p>
	 *
	 */
	public void par_base_unit_nm(String value) {
		setConstString(offset + 81, $par_base_unit_nm, value);
	}


	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public MCNumber par_base_unit_dec_place() {
		return getConstNumber(offset + 82, $par_base_unit_dec_place);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void par_base_unit_dec_place(MCNumber value) {
		setConstNumber(offset + 82, $par_base_unit_dec_place, value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void par_base_unit_dec_place(int value) {
		setConstNumber(offset + 82, $par_base_unit_dec_place, value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void par_base_unit_dec_place(long value) {
		setConstNumber(offset + 82, $par_base_unit_dec_place, value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void par_base_unit_dec_place(float value) {
		setConstNumber(offset + 82, $par_base_unit_dec_place, value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void par_base_unit_dec_place(double value) {
		setConstNumber(offset + 82, $par_base_unit_dec_place, value);
	}


	/**
	 * Parent lot No. (Output) 親ロットＮＯ（出来高）.<p>
	 *
	 */
	public String par_act_lot_no() {
		return getConstString(offset + 83, $par_act_lot_no);
	}

	/**
	 * Parent lot No. (Output) 親ロットＮＯ（出来高）.<p>
	 *
	 */
	public void par_act_lot_no(String value) {
		setConstString(offset + 83, $par_act_lot_no, value);
	}


	/**
	 * Parent sublot No. (Output) 親サブロットＮＯ（出来高）.<p>
	 *
	 */
	public String par_act_sublot_no() {
		return getConstString(offset + 84, $par_act_sublot_no);
	}

	/**
	 * Parent sublot No. (Output) 親サブロットＮＯ（出来高）.<p>
	 *
	 */
	public void par_act_sublot_no(String value) {
		setConstString(offset + 84, $par_act_sublot_no, value);
	}


	/**
	 * Parent lot No. (Order) 親ロットＮＯ（指図）.<p>
	 *
	 */
	public String par_inst_lot_no() {
		return getConstString(offset + 85, $par_inst_lot_no);
	}

	/**
	 * Parent lot No. (Order) 親ロットＮＯ（指図）.<p>
	 *
	 */
	public void par_inst_lot_no(String value) {
		setConstString(offset + 85, $par_inst_lot_no, value);
	}


	/**
	 * Parent sublot No. (Order) 親サブロットＮＯ（指図）.<p>
	 *
	 */
	public String par_inst_sublot_no() {
		return getConstString(offset + 86, $par_inst_sublot_no);
	}

	/**
	 * Parent sublot No. (Order) 親サブロットＮＯ（指図）.<p>
	 *
	 */
	public void par_inst_sublot_no(String value) {
		setConstString(offset + 86, $par_inst_sublot_no, value);
	}


	/**
	 * Mfg. status (Operation) 製造状況区分（工程）.<p>
	 *
	 */
	public String oper_mfg_sts_typ() {
		return getConstString(offset + 87, $oper_mfg_sts_typ);
	}

	/**
	 * Mfg. status (Operation) 製造状況区分（工程）.<p>
	 *
	 */
	public void oper_mfg_sts_typ(String value) {
		setConstString(offset + 87, $oper_mfg_sts_typ, value);
	}


	/**
	 * Mfg. status name (Operation) 製造状況区分名（工程）.<p>
	 *
	 */
	public String oper_mfg_sts_typ_nm() {
		return getConstString(offset + 88, $oper_mfg_sts_typ_nm);
	}

	/**
	 * Mfg. status name (Operation) 製造状況区分名（工程）.<p>
	 *
	 */
	public void oper_mfg_sts_typ_nm(String value) {
		setConstString(offset + 88, $oper_mfg_sts_typ_nm, value);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR oper_unit_act_qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 89, $oper_unit_act_qty_p);
	}
	
	public void oper_unit_act_qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 89, $oper_unit_act_qty_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR oper_unit_schd_qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 90, $oper_unit_schd_qty_p);
	}
	
	public void oper_unit_schd_qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 90, $oper_unit_schd_qty_p, row);
	}


	/**
	 * Operation unit cd. 工程単位ＣＤ.<p>
	 *
	 */
	public String oper_unit_cd() {
		return getConstString(offset + 91, $oper_unit_cd);
	}

	/**
	 * Operation unit cd. 工程単位ＣＤ.<p>
	 *
	 */
	public void oper_unit_cd(String value) {
		setConstString(offset + 91, $oper_unit_cd, value);
	}


	/**
	 * Operation unit name 工程単位名.<p>
	 *
	 */
	public String oper_unit_nm() {
		return getConstString(offset + 92, $oper_unit_nm);
	}

	/**
	 * Operation unit name 工程単位名.<p>
	 *
	 */
	public void oper_unit_nm(String value) {
		setConstString(offset + 92, $oper_unit_nm, value);
	}


	/**
	 * Operation unit number of decimal places 工程単位小数部有効桁数.<p>
	 *
	 */
	public MCNumber oper_unit_dec_place() {
		return getConstNumber(offset + 93, $oper_unit_dec_place);
	}

	/**
	 * Operation unit number of decimal places 工程単位小数部有効桁数.<p>
	 *
	 */
	public void oper_unit_dec_place(MCNumber value) {
		setConstNumber(offset + 93, $oper_unit_dec_place, value);
	}

	/**
	 * Operation unit number of decimal places 工程単位小数部有効桁数.<p>
	 *
	 */
	public void oper_unit_dec_place(int value) {
		setConstNumber(offset + 93, $oper_unit_dec_place, value);
	}

	/**
	 * Operation unit number of decimal places 工程単位小数部有効桁数.<p>
	 *
	 */
	public void oper_unit_dec_place(long value) {
		setConstNumber(offset + 93, $oper_unit_dec_place, value);
	}

	/**
	 * Operation unit number of decimal places 工程単位小数部有効桁数.<p>
	 *
	 */
	public void oper_unit_dec_place(float value) {
		setConstNumber(offset + 93, $oper_unit_dec_place, value);
	}

	/**
	 * Operation unit number of decimal places 工程単位小数部有効桁数.<p>
	 *
	 */
	public void oper_unit_dec_place(double value) {
		setConstNumber(offset + 93, $oper_unit_dec_place, value);
	}


	public mcframe.clientMSUB.MSUBP5020.SnoWrkNoR par_sno_p(){
		return (mcframe.clientMSUB.MSUBP5020.SnoWrkNoR) getConstInnerRow(offset + 94, $par_sno_p);
	}
	
	public void par_sno_p(mcframe.clientMSUB.MSUBP5020.SnoWrkNoR row){
		setConstInnerRow(offset + 94, $par_sno_p, row);
	}


	/**
	 * Allocation 引当.<p>
	 *
	 */
	public boolean alloc_flg() {
		return getConstBoolean(offset + 95, $alloc_flg);
	}

	/**
	 * Allocation 引当.<p>
	 *
	 */
	public void alloc_flg(boolean value) {
		setConstBoolean(offset + 95, $alloc_flg, value);
	}


	/**
	 * Input control type 投入制御区分.<p>
	 *
	 */
	public String inpt_ctl_typ() {
		return getConstString(offset + 96, $inpt_ctl_typ);
	}

	/**
	 * Input control type 投入制御区分.<p>
	 *
	 */
	public void inpt_ctl_typ(String value) {
		setConstString(offset + 96, $inpt_ctl_typ, value);
	}


	/**
	 * Input control type name 投入制御区分名.<p>
	 *
	 */
	public String inpt_ctl_typ_nm() {
		return getConstString(offset + 97, $inpt_ctl_typ_nm);
	}

	/**
	 * Input control type name 投入制御区分名.<p>
	 *
	 */
	public void inpt_ctl_typ_nm(String value) {
		setConstString(offset + 97, $inpt_ctl_typ_nm, value);
	}


	/**
	 * Copy-from child item 引継対象子品目.<p>
	 *
	 */
	public boolean main_itm_flg() {
		return getConstBoolean(offset + 98, $main_itm_flg);
	}

	/**
	 * Copy-from child item 引継対象子品目.<p>
	 *
	 */
	public void main_itm_flg(boolean value) {
		setConstBoolean(offset + 98, $main_itm_flg, value);
	}


	/**
	 * Child item for yield calculation 収率計算用子品目.<p>
	 *
	 */
	public boolean yield_calc_flg() {
		return getConstBoolean(offset + 99, $yield_calc_flg);
	}

	/**
	 * Child item for yield calculation 収率計算用子品目.<p>
	 *
	 */
	public void yield_calc_flg(boolean value) {
		setConstBoolean(offset + 99, $yield_calc_flg, value);
	}


	/**
	 * Backflush update バックフラッシュ更新.<p>
	 *
	 */
	public boolean bkf_upd_flg() {
		return getConstBoolean(offset + 100, $bkf_upd_flg);
	}

	/**
	 * Backflush update バックフラッシュ更新.<p>
	 *
	 */
	public void bkf_upd_flg(boolean value) {
		setConstBoolean(offset + 100, $bkf_upd_flg, value);
	}


	/**
	 * Allow mixed lots ロット混在可.<p>
	 *
	 */
	public boolean lot_mix_flg() {
		return getConstBoolean(offset + 101, $lot_mix_flg);
	}

	/**
	 * Allow mixed lots ロット混在可.<p>
	 *
	 */
	public void lot_mix_flg(boolean value) {
		setConstBoolean(offset + 101, $lot_mix_flg, value);
	}


	/**
	 * Allow mixed sublots サブロット混在可.<p>
	 *
	 */
	public boolean sublot_mix_flg() {
		return getConstBoolean(offset + 102, $sublot_mix_flg);
	}

	/**
	 * Allow mixed sublots サブロット混在可.<p>
	 *
	 */
	public void sublot_mix_flg(boolean value) {
		setConstBoolean(offset + 102, $sublot_mix_flg, value);
	}


	public mcframe.clientMAUB.MAUBP5250.VerNoR inst_ver_no_p(){
		return (mcframe.clientMAUB.MAUBP5250.VerNoR) getConstInnerRow(offset + 103, $inst_ver_no_p);
	}
	
	public void inst_ver_no_p(mcframe.clientMAUB.MAUBP5250.VerNoR row){
		setConstInnerRow(offset + 103, $inst_ver_no_p, row);
	}


	/**
	 * Inventory management type 在庫管理区分.<p>
	 *
	 */
	public String stk_mng_typ() {
		return getConstString(offset + 104, $stk_mng_typ);
	}

	/**
	 * Inventory management type 在庫管理区分.<p>
	 *
	 */
	public void stk_mng_typ(String value) {
		setConstString(offset + 104, $stk_mng_typ, value);
	}


	/**
	 * Inventory management type name 在庫管理区分名.<p>
	 *
	 */
	public String stk_mng_typ_nm() {
		return getConstString(offset + 105, $stk_mng_typ_nm);
	}

	/**
	 * Inventory management type name 在庫管理区分名.<p>
	 *
	 */
	public void stk_mng_typ_nm(String value) {
		setConstString(offset + 105, $stk_mng_typ_nm, value);
	}


	/**
	 * Input item backflush type 投入品バックフラッシュ区分.<p>
	 *
	 */
	public String bkf_typ() {
		return getConstString(offset + 106, $bkf_typ);
	}

	/**
	 * Input item backflush type 投入品バックフラッシュ区分.<p>
	 *
	 */
	public void bkf_typ(String value) {
		setConstString(offset + 106, $bkf_typ, value);
	}


	/**
	 * Input item backflush type name 投入品バックフラッシュ区分名.<p>
	 *
	 */
	public String bkf_typ_nm() {
		return getConstString(offset + 107, $bkf_typ_nm);
	}

	/**
	 * Input item backflush type name 投入品バックフラッシュ区分名.<p>
	 *
	 */
	public void bkf_typ_nm(String value) {
		setConstString(offset + 107, $bkf_typ_nm, value);
	}


	/**
	 * Allocation control type 引当制御区分.<p>
	 *
	 */
	public String alloc_ctl_typ() {
		return getConstString(offset + 108, $alloc_ctl_typ);
	}

	/**
	 * Allocation control type 引当制御区分.<p>
	 *
	 */
	public void alloc_ctl_typ(String value) {
		setConstString(offset + 108, $alloc_ctl_typ, value);
	}


	/**
	 * Allocation control type name 引当制御区分名.<p>
	 *
	 */
	public String alloc_ctl_typ_nm() {
		return getConstString(offset + 109, $alloc_ctl_typ_nm);
	}

	/**
	 * Allocation control type name 引当制御区分名.<p>
	 *
	 */
	public void alloc_ctl_typ_nm(String value) {
		setConstString(offset + 109, $alloc_ctl_typ_nm, value);
	}


	/**
	 * Inventory identification type 在庫識別区分.<p>
	 *
	 */
	public String stk_id_typ() {
		return getConstString(offset + 110, $stk_id_typ);
	}

	/**
	 * Inventory identification type 在庫識別区分.<p>
	 *
	 */
	public void stk_id_typ(String value) {
		setConstString(offset + 110, $stk_id_typ, value);
	}


	/**
	 * Inventory identification type name 在庫識別区分名.<p>
	 *
	 */
	public String stk_id_typ_nm() {
		return getConstString(offset + 111, $stk_id_typ_nm);
	}

	/**
	 * Inventory identification type name 在庫識別区分名.<p>
	 *
	 */
	public void stk_id_typ_nm(String value) {
		setConstString(offset + 111, $stk_id_typ_nm, value);
	}


	/**
	 * BP cd. 取引先ＣＤ.<p>
	 *
	 */
	public String stk_bp_cd() {
		return getConstString(offset + 112, $stk_bp_cd);
	}

	/**
	 * BP cd. 取引先ＣＤ.<p>
	 *
	 */
	public void stk_bp_cd(String value) {
		setConstString(offset + 112, $stk_bp_cd, value);
	}


	/**
	 * BP name 取引先名.<p>
	 *
	 */
	public String stk_bp_nm() {
		return getConstString(offset + 113, $stk_bp_nm);
	}

	/**
	 * BP name 取引先名.<p>
	 *
	 */
	public void stk_bp_nm(String value) {
		setConstString(offset + 113, $stk_bp_nm, value);
	}


	/**
	 * Arriving point cd. 着荷先ＣＤ.<p>
	 *
	 */
	public String stk_arrv_bp_cd() {
		return getConstString(offset + 114, $stk_arrv_bp_cd);
	}

	/**
	 * Arriving point cd. 着荷先ＣＤ.<p>
	 *
	 */
	public void stk_arrv_bp_cd(String value) {
		setConstString(offset + 114, $stk_arrv_bp_cd, value);
	}


	/**
	 * Arriving point name 着荷先名.<p>
	 *
	 */
	public String stk_arrv_bp_nm() {
		return getConstString(offset + 115, $stk_arrv_bp_nm);
	}

	/**
	 * Arriving point name 着荷先名.<p>
	 *
	 */
	public void stk_arrv_bp_nm(String value) {
		setConstString(offset + 115, $stk_arrv_bp_nm, value);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR acxfr_act_qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 116, $acxfr_act_qty_p);
	}
	
	public void acxfr_act_qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 116, $acxfr_act_qty_p, row);
	}


	public mcframe.clientMAUB.MAUBP5260.ContQtyR cont_acxfr_act_qty_p(){
		return (mcframe.clientMAUB.MAUBP5260.ContQtyR) getConstInnerRow(offset + 117, $cont_acxfr_act_qty_p);
	}
	
	public void cont_acxfr_act_qty_p(mcframe.clientMAUB.MAUBP5260.ContQtyR row){
		setConstInnerRow(offset + 117, $cont_acxfr_act_qty_p, row);
	}


	/**
	 * Other accounting transfer reason cd. 他勘定振替理由ＣＤ.<p>
	 *
	 */
	public String acxfr_act_rsn_cd() {
		return getConstString(offset + 118, $acxfr_act_rsn_cd);
	}

	/**
	 * Other accounting transfer reason cd. 他勘定振替理由ＣＤ.<p>
	 *
	 */
	public void acxfr_act_rsn_cd(String value) {
		setConstString(offset + 118, $acxfr_act_rsn_cd, value);
	}


	/**
	 * Other accounting transfer reason name 他勘定振替理由名.<p>
	 *
	 */
	public String acxfr_act_rsn_nm() {
		return getConstString(offset + 119, $acxfr_act_rsn_nm);
	}

	/**
	 * Other accounting transfer reason name 他勘定振替理由名.<p>
	 *
	 */
	public void acxfr_act_rsn_nm(String value) {
		setConstString(offset + 119, $acxfr_act_rsn_nm, value);
	}


	/**
	 * Other accounting transfer charged dept. cd. 他勘定振替負担部門ＣＤ.<p>
	 *
	 */
	public String acxfr_act_bd_dpt_cd() {
		return getConstString(offset + 120, $acxfr_act_bd_dpt_cd);
	}

	/**
	 * Other accounting transfer charged dept. cd. 他勘定振替負担部門ＣＤ.<p>
	 *
	 */
	public void acxfr_act_bd_dpt_cd(String value) {
		setConstString(offset + 120, $acxfr_act_bd_dpt_cd, value);
	}


	/**
	 * Other accounting transfer charged dept. name 他勘定振替負担部門名.<p>
	 *
	 */
	public String acxfr_act_bd_dpt_nm() {
		return getConstString(offset + 121, $acxfr_act_bd_dpt_nm);
	}

	/**
	 * Other accounting transfer charged dept. name 他勘定振替負担部門名.<p>
	 *
	 */
	public void acxfr_act_bd_dpt_nm(String value) {
		setConstString(offset + 121, $acxfr_act_bd_dpt_nm, value);
	}


	/**
	 * Input schedule internal remarks 投入予定内部備考.<p>
	 *
	 */
	public String inpt_schd_intr_rmrks() {
		return getConstString(offset + 122, $inpt_schd_intr_rmrks);
	}

	/**
	 * Input schedule internal remarks 投入予定内部備考.<p>
	 *
	 */
	public void inpt_schd_intr_rmrks(String value) {
		setConstString(offset + 122, $inpt_schd_intr_rmrks, value);
	}


	/**
	 * Input schedule order sheet remarks 投入予定指図書備考.<p>
	 *
	 */
	public String inpt_schd_inst_rpt_rmrks() {
		return getConstString(offset + 123, $inpt_schd_inst_rpt_rmrks);
	}

	/**
	 * Input schedule order sheet remarks 投入予定指図書備考.<p>
	 *
	 */
	public void inpt_schd_inst_rpt_rmrks(String value) {
		setConstString(offset + 123, $inpt_schd_inst_rpt_rmrks, value);
	}


	/**
	 * Input schedule spare 1 投入予定予備１.<p>
	 *
	 */
	public String inpt_schd_sub_char1() {
		return getConstString(offset + 124, $inpt_schd_sub_char1);
	}

	/**
	 * Input schedule spare 1 投入予定予備１.<p>
	 *
	 */
	public void inpt_schd_sub_char1(String value) {
		setConstString(offset + 124, $inpt_schd_sub_char1, value);
	}


	/**
	 * Input schedule spare 2 投入予定予備２.<p>
	 *
	 */
	public String inpt_schd_sub_char2() {
		return getConstString(offset + 125, $inpt_schd_sub_char2);
	}

	/**
	 * Input schedule spare 2 投入予定予備２.<p>
	 *
	 */
	public void inpt_schd_sub_char2(String value) {
		setConstString(offset + 125, $inpt_schd_sub_char2, value);
	}


	/**
	 * Input schedule spare 3 投入予定予備３.<p>
	 *
	 */
	public String inpt_schd_sub_char3() {
		return getConstString(offset + 126, $inpt_schd_sub_char3);
	}

	/**
	 * Input schedule spare 3 投入予定予備３.<p>
	 *
	 */
	public void inpt_schd_sub_char3(String value) {
		setConstString(offset + 126, $inpt_schd_sub_char3, value);
	}


	/**
	 * Input result internal remarks 投入実績内部備考.<p>
	 *
	 */
	public String inpt_act_intr_rmrks() {
		return getConstString(offset + 127, $inpt_act_intr_rmrks);
	}

	/**
	 * Input result internal remarks 投入実績内部備考.<p>
	 *
	 */
	public void inpt_act_intr_rmrks(String value) {
		setConstString(offset + 127, $inpt_act_intr_rmrks, value);
	}


	/**
	 * Input result record sheet remarks 投入実績記録書備考.<p>
	 *
	 */
	public String inpt_act_rpt_rmrks() {
		return getConstString(offset + 128, $inpt_act_rpt_rmrks);
	}

	/**
	 * Input result record sheet remarks 投入実績記録書備考.<p>
	 *
	 */
	public void inpt_act_rpt_rmrks(String value) {
		setConstString(offset + 128, $inpt_act_rpt_rmrks, value);
	}


	/**
	 * Input result transaction remarks 投入実績取引備考.<p>
	 *
	 */
	public String inpt_act_trd_rmrks() {
		return getConstString(offset + 129, $inpt_act_trd_rmrks);
	}

	/**
	 * Input result transaction remarks 投入実績取引備考.<p>
	 *
	 */
	public void inpt_act_trd_rmrks(String value) {
		setConstString(offset + 129, $inpt_act_trd_rmrks, value);
	}


	/**
	 * Input result spare 1 投入実績予備１.<p>
	 *
	 */
	public String inpt_act_sub_char1() {
		return getConstString(offset + 130, $inpt_act_sub_char1);
	}

	/**
	 * Input result spare 1 投入実績予備１.<p>
	 *
	 */
	public void inpt_act_sub_char1(String value) {
		setConstString(offset + 130, $inpt_act_sub_char1, value);
	}


	/**
	 * Input result spare 2 投入実績予備２.<p>
	 *
	 */
	public String inpt_act_sub_char2() {
		return getConstString(offset + 131, $inpt_act_sub_char2);
	}

	/**
	 * Input result spare 2 投入実績予備２.<p>
	 *
	 */
	public void inpt_act_sub_char2(String value) {
		setConstString(offset + 131, $inpt_act_sub_char2, value);
	}


	/**
	 * Input result spare 3 投入実績予備３.<p>
	 *
	 */
	public String inpt_act_sub_char3() {
		return getConstString(offset + 132, $inpt_act_sub_char3);
	}

	/**
	 * Input result spare 3 投入実績予備３.<p>
	 *
	 */
	public void inpt_act_sub_char3(String value) {
		setConstString(offset + 132, $inpt_act_sub_char3, value);
	}


	/**
	 * Loss result internal remarks ロス実績内部備考.<p>
	 *
	 */
	public String loss_act_intr_rmrks() {
		return getConstString(offset + 133, $loss_act_intr_rmrks);
	}

	/**
	 * Loss result internal remarks ロス実績内部備考.<p>
	 *
	 */
	public void loss_act_intr_rmrks(String value) {
		setConstString(offset + 133, $loss_act_intr_rmrks, value);
	}


	/**
	 * Loss result transaction remarks ロス実績取引備考.<p>
	 *
	 */
	public String loss_act_trd_rmrks() {
		return getConstString(offset + 134, $loss_act_trd_rmrks);
	}

	/**
	 * Loss result transaction remarks ロス実績取引備考.<p>
	 *
	 */
	public void loss_act_trd_rmrks(String value) {
		setConstString(offset + 134, $loss_act_trd_rmrks, value);
	}


	/**
	 * Loss result spare 1 ロス実績予備１.<p>
	 *
	 */
	public String loss_act_sub_char1() {
		return getConstString(offset + 135, $loss_act_sub_char1);
	}

	/**
	 * Loss result spare 1 ロス実績予備１.<p>
	 *
	 */
	public void loss_act_sub_char1(String value) {
		setConstString(offset + 135, $loss_act_sub_char1, value);
	}


	/**
	 * Loss result spare 2 ロス実績予備２.<p>
	 *
	 */
	public String loss_act_sub_char2() {
		return getConstString(offset + 136, $loss_act_sub_char2);
	}

	/**
	 * Loss result spare 2 ロス実績予備２.<p>
	 *
	 */
	public void loss_act_sub_char2(String value) {
		setConstString(offset + 136, $loss_act_sub_char2, value);
	}


	/**
	 * Loss result spare 3 ロス実績予備３.<p>
	 *
	 */
	public String loss_act_sub_char3() {
		return getConstString(offset + 137, $loss_act_sub_char3);
	}

	/**
	 * Loss result spare 3 ロス実績予備３.<p>
	 *
	 */
	public void loss_act_sub_char3(String value) {
		setConstString(offset + 137, $loss_act_sub_char3, value);
	}


	/**
	 * Mfg. record sheet remarks 製造記録書備考.<p>
	 *
	 */
	public String mfg_act_rpt_rmrks() {
		return getConstString(offset + 138, $mfg_act_rpt_rmrks);
	}

	/**
	 * Mfg. record sheet remarks 製造記録書備考.<p>
	 *
	 */
	public void mfg_act_rpt_rmrks(String value) {
		setConstString(offset + 138, $mfg_act_rpt_rmrks, value);
	}


	/**
	 * Mfg. internal remarks 製造内部備考.<p>
	 *
	 */
	public String mfg_act_intr_rmrks() {
		return getConstString(offset + 139, $mfg_act_intr_rmrks);
	}

	/**
	 * Mfg. internal remarks 製造内部備考.<p>
	 *
	 */
	public void mfg_act_intr_rmrks(String value) {
		setConstString(offset + 139, $mfg_act_intr_rmrks, value);
	}


	/**
	 * Mfg. result spare 1 製造実績予備１.<p>
	 *
	 */
	public String mfg_act_sub_char1() {
		return getConstString(offset + 140, $mfg_act_sub_char1);
	}

	/**
	 * Mfg. result spare 1 製造実績予備１.<p>
	 *
	 */
	public void mfg_act_sub_char1(String value) {
		setConstString(offset + 140, $mfg_act_sub_char1, value);
	}


	/**
	 * Mfg. result spare 2 製造実績予備２.<p>
	 *
	 */
	public String mfg_act_sub_char2() {
		return getConstString(offset + 141, $mfg_act_sub_char2);
	}

	/**
	 * Mfg. result spare 2 製造実績予備２.<p>
	 *
	 */
	public void mfg_act_sub_char2(String value) {
		setConstString(offset + 141, $mfg_act_sub_char2, value);
	}


	/**
	 * Mfg. result spare 3 製造実績予備３.<p>
	 *
	 */
	public String mfg_act_sub_char3() {
		return getConstString(offset + 142, $mfg_act_sub_char3);
	}

	/**
	 * Mfg. result spare 3 製造実績予備３.<p>
	 *
	 */
	public void mfg_act_sub_char3(String value) {
		setConstString(offset + 142, $mfg_act_sub_char3, value);
	}


	/**
	 * Operation internal remarks 工程内部備考.<p>
	 *
	 */
	public String oper_act_intr_rmrks() {
		return getConstString(offset + 143, $oper_act_intr_rmrks);
	}

	/**
	 * Operation internal remarks 工程内部備考.<p>
	 *
	 */
	public void oper_act_intr_rmrks(String value) {
		setConstString(offset + 143, $oper_act_intr_rmrks, value);
	}


	/**
	 * Operation record sheet remarks 工程記録書備考.<p>
	 *
	 */
	public String oper_act_rpt_rmrks() {
		return getConstString(offset + 144, $oper_act_rpt_rmrks);
	}

	/**
	 * Operation record sheet remarks 工程記録書備考.<p>
	 *
	 */
	public void oper_act_rpt_rmrks(String value) {
		setConstString(offset + 144, $oper_act_rpt_rmrks, value);
	}


	/**
	 * Operation spare 1 工程予備１.<p>
	 *
	 */
	public String oper_act_sub_char1() {
		return getConstString(offset + 145, $oper_act_sub_char1);
	}

	/**
	 * Operation spare 1 工程予備１.<p>
	 *
	 */
	public void oper_act_sub_char1(String value) {
		setConstString(offset + 145, $oper_act_sub_char1, value);
	}


	/**
	 * Operation spare 2 工程予備２.<p>
	 *
	 */
	public String oper_act_sub_char2() {
		return getConstString(offset + 146, $oper_act_sub_char2);
	}

	/**
	 * Operation spare 2 工程予備２.<p>
	 *
	 */
	public void oper_act_sub_char2(String value) {
		setConstString(offset + 146, $oper_act_sub_char2, value);
	}


	/**
	 * Operation spare 3 工程予備３.<p>
	 *
	 */
	public String oper_act_sub_char3() {
		return getConstString(offset + 147, $oper_act_sub_char3);
	}

	/**
	 * Operation spare 3 工程予備３.<p>
	 *
	 */
	public void oper_act_sub_char3(String value) {
		setConstString(offset + 147, $oper_act_sub_char3, value);
	}


	/**
	 * Item actual yield 品目実際収率.<p>
	 *
	 */
	public MCNumber itm_yield() {
		return getConstNumber(offset + 148, $itm_yield);
	}

	/**
	 * Item actual yield 品目実際収率.<p>
	 *
	 */
	public void itm_yield(MCNumber value) {
		setConstNumber(offset + 148, $itm_yield, value);
	}

	/**
	 * Item actual yield 品目実際収率.<p>
	 *
	 */
	public void itm_yield(int value) {
		setConstNumber(offset + 148, $itm_yield, value);
	}

	/**
	 * Item actual yield 品目実際収率.<p>
	 *
	 */
	public void itm_yield(long value) {
		setConstNumber(offset + 148, $itm_yield, value);
	}

	/**
	 * Item actual yield 品目実際収率.<p>
	 *
	 */
	public void itm_yield(float value) {
		setConstNumber(offset + 148, $itm_yield, value);
	}

	/**
	 * Item actual yield 品目実際収率.<p>
	 *
	 */
	public void itm_yield(double value) {
		setConstNumber(offset + 148, $itm_yield, value);
	}


	/**
	 * Item min. yield 品目下限収率.<p>
	 *
	 */
	public MCNumber itm_lower_yield() {
		return getConstNumber(offset + 149, $itm_lower_yield);
	}

	/**
	 * Item min. yield 品目下限収率.<p>
	 *
	 */
	public void itm_lower_yield(MCNumber value) {
		setConstNumber(offset + 149, $itm_lower_yield, value);
	}

	/**
	 * Item min. yield 品目下限収率.<p>
	 *
	 */
	public void itm_lower_yield(int value) {
		setConstNumber(offset + 149, $itm_lower_yield, value);
	}

	/**
	 * Item min. yield 品目下限収率.<p>
	 *
	 */
	public void itm_lower_yield(long value) {
		setConstNumber(offset + 149, $itm_lower_yield, value);
	}

	/**
	 * Item min. yield 品目下限収率.<p>
	 *
	 */
	public void itm_lower_yield(float value) {
		setConstNumber(offset + 149, $itm_lower_yield, value);
	}

	/**
	 * Item min. yield 品目下限収率.<p>
	 *
	 */
	public void itm_lower_yield(double value) {
		setConstNumber(offset + 149, $itm_lower_yield, value);
	}


	/**
	 * Item standard yield 品目標準収率.<p>
	 *
	 */
	public MCNumber itm_std_yield() {
		return getConstNumber(offset + 150, $itm_std_yield);
	}

	/**
	 * Item standard yield 品目標準収率.<p>
	 *
	 */
	public void itm_std_yield(MCNumber value) {
		setConstNumber(offset + 150, $itm_std_yield, value);
	}

	/**
	 * Item standard yield 品目標準収率.<p>
	 *
	 */
	public void itm_std_yield(int value) {
		setConstNumber(offset + 150, $itm_std_yield, value);
	}

	/**
	 * Item standard yield 品目標準収率.<p>
	 *
	 */
	public void itm_std_yield(long value) {
		setConstNumber(offset + 150, $itm_std_yield, value);
	}

	/**
	 * Item standard yield 品目標準収率.<p>
	 *
	 */
	public void itm_std_yield(float value) {
		setConstNumber(offset + 150, $itm_std_yield, value);
	}

	/**
	 * Item standard yield 品目標準収率.<p>
	 *
	 */
	public void itm_std_yield(double value) {
		setConstNumber(offset + 150, $itm_std_yield, value);
	}


	/**
	 * Item max. yield 品目上限収率.<p>
	 *
	 */
	public MCNumber itm_upper_yield() {
		return getConstNumber(offset + 151, $itm_upper_yield);
	}

	/**
	 * Item max. yield 品目上限収率.<p>
	 *
	 */
	public void itm_upper_yield(MCNumber value) {
		setConstNumber(offset + 151, $itm_upper_yield, value);
	}

	/**
	 * Item max. yield 品目上限収率.<p>
	 *
	 */
	public void itm_upper_yield(int value) {
		setConstNumber(offset + 151, $itm_upper_yield, value);
	}

	/**
	 * Item max. yield 品目上限収率.<p>
	 *
	 */
	public void itm_upper_yield(long value) {
		setConstNumber(offset + 151, $itm_upper_yield, value);
	}

	/**
	 * Item max. yield 品目上限収率.<p>
	 *
	 */
	public void itm_upper_yield(float value) {
		setConstNumber(offset + 151, $itm_upper_yield, value);
	}

	/**
	 * Item max. yield 品目上限収率.<p>
	 *
	 */
	public void itm_upper_yield(double value) {
		setConstNumber(offset + 151, $itm_upper_yield, value);
	}


	/**
	 * Operation actual yield 工程実際収率.<p>
	 *
	 */
	public MCNumber oper_yield() {
		return getConstNumber(offset + 152, $oper_yield);
	}

	/**
	 * Operation actual yield 工程実際収率.<p>
	 *
	 */
	public void oper_yield(MCNumber value) {
		setConstNumber(offset + 152, $oper_yield, value);
	}

	/**
	 * Operation actual yield 工程実際収率.<p>
	 *
	 */
	public void oper_yield(int value) {
		setConstNumber(offset + 152, $oper_yield, value);
	}

	/**
	 * Operation actual yield 工程実際収率.<p>
	 *
	 */
	public void oper_yield(long value) {
		setConstNumber(offset + 152, $oper_yield, value);
	}

	/**
	 * Operation actual yield 工程実際収率.<p>
	 *
	 */
	public void oper_yield(float value) {
		setConstNumber(offset + 152, $oper_yield, value);
	}

	/**
	 * Operation actual yield 工程実際収率.<p>
	 *
	 */
	public void oper_yield(double value) {
		setConstNumber(offset + 152, $oper_yield, value);
	}


	/**
	 * Operation min. yield 工程下限収率.<p>
	 *
	 */
	public MCNumber oper_lower_yield() {
		return getConstNumber(offset + 153, $oper_lower_yield);
	}

	/**
	 * Operation min. yield 工程下限収率.<p>
	 *
	 */
	public void oper_lower_yield(MCNumber value) {
		setConstNumber(offset + 153, $oper_lower_yield, value);
	}

	/**
	 * Operation min. yield 工程下限収率.<p>
	 *
	 */
	public void oper_lower_yield(int value) {
		setConstNumber(offset + 153, $oper_lower_yield, value);
	}

	/**
	 * Operation min. yield 工程下限収率.<p>
	 *
	 */
	public void oper_lower_yield(long value) {
		setConstNumber(offset + 153, $oper_lower_yield, value);
	}

	/**
	 * Operation min. yield 工程下限収率.<p>
	 *
	 */
	public void oper_lower_yield(float value) {
		setConstNumber(offset + 153, $oper_lower_yield, value);
	}

	/**
	 * Operation min. yield 工程下限収率.<p>
	 *
	 */
	public void oper_lower_yield(double value) {
		setConstNumber(offset + 153, $oper_lower_yield, value);
	}


	/**
	 * Operation standard yield 工程標準収率.<p>
	 *
	 */
	public MCNumber oper_std_yield() {
		return getConstNumber(offset + 154, $oper_std_yield);
	}

	/**
	 * Operation standard yield 工程標準収率.<p>
	 *
	 */
	public void oper_std_yield(MCNumber value) {
		setConstNumber(offset + 154, $oper_std_yield, value);
	}

	/**
	 * Operation standard yield 工程標準収率.<p>
	 *
	 */
	public void oper_std_yield(int value) {
		setConstNumber(offset + 154, $oper_std_yield, value);
	}

	/**
	 * Operation standard yield 工程標準収率.<p>
	 *
	 */
	public void oper_std_yield(long value) {
		setConstNumber(offset + 154, $oper_std_yield, value);
	}

	/**
	 * Operation standard yield 工程標準収率.<p>
	 *
	 */
	public void oper_std_yield(float value) {
		setConstNumber(offset + 154, $oper_std_yield, value);
	}

	/**
	 * Operation standard yield 工程標準収率.<p>
	 *
	 */
	public void oper_std_yield(double value) {
		setConstNumber(offset + 154, $oper_std_yield, value);
	}


	/**
	 * Operation max. yield 工程上限収率.<p>
	 *
	 */
	public MCNumber oper_upper_yield() {
		return getConstNumber(offset + 155, $oper_upper_yield);
	}

	/**
	 * Operation max. yield 工程上限収率.<p>
	 *
	 */
	public void oper_upper_yield(MCNumber value) {
		setConstNumber(offset + 155, $oper_upper_yield, value);
	}

	/**
	 * Operation max. yield 工程上限収率.<p>
	 *
	 */
	public void oper_upper_yield(int value) {
		setConstNumber(offset + 155, $oper_upper_yield, value);
	}

	/**
	 * Operation max. yield 工程上限収率.<p>
	 *
	 */
	public void oper_upper_yield(long value) {
		setConstNumber(offset + 155, $oper_upper_yield, value);
	}

	/**
	 * Operation max. yield 工程上限収率.<p>
	 *
	 */
	public void oper_upper_yield(float value) {
		setConstNumber(offset + 155, $oper_upper_yield, value);
	}

	/**
	 * Operation max. yield 工程上限収率.<p>
	 *
	 */
	public void oper_upper_yield(double value) {
		setConstNumber(offset + 155, $oper_upper_yield, value);
	}


	/**
	 * Subcontractor cd. 外注先ＣＤ.<p>
	 *
	 */
	public String sppl_cd() {
		return getConstString(offset + 156, $sppl_cd);
	}

	/**
	 * Subcontractor cd. 外注先ＣＤ.<p>
	 *
	 */
	public void sppl_cd(String value) {
		setConstString(offset + 156, $sppl_cd, value);
	}


	/**
	 * Subcontractor name 外注先名.<p>
	 *
	 */
	public String sppl_nm() {
		return getConstString(offset + 157, $sppl_nm);
	}

	/**
	 * Subcontractor name 外注先名.<p>
	 *
	 */
	public void sppl_nm(String value) {
		setConstString(offset + 157, $sppl_nm, value);
	}


	/**
	 * Mfg. rack/line cd. 製造棚・ラインＣＤ.<p>
	 *
	 */
	public String mfg_str_ln_cd() {
		return getConstString(offset + 158, $mfg_str_ln_cd);
	}

	/**
	 * Mfg. rack/line cd. 製造棚・ラインＣＤ.<p>
	 *
	 */
	public void mfg_str_ln_cd(String value) {
		setConstString(offset + 158, $mfg_str_ln_cd, value);
	}


	/**
	 * Mfg. rack/line name 製造棚・ライン名.<p>
	 *
	 */
	public String mfg_str_ln_nm() {
		return getConstString(offset + 159, $mfg_str_ln_nm);
	}

	/**
	 * Mfg. rack/line name 製造棚・ライン名.<p>
	 *
	 */
	public void mfg_str_ln_nm(String value) {
		setConstString(offset + 159, $mfg_str_ln_nm, value);
	}


	/**
	 * Without mfg. rack/line 製造棚・ライン無.<p>
	 *
	 */
	public boolean mfg_str_ln_cd_none_flg() {
		return getConstBoolean(offset + 160, $mfg_str_ln_cd_none_flg);
	}

	/**
	 * Without mfg. rack/line 製造棚・ライン無.<p>
	 *
	 */
	public void mfg_str_ln_cd_none_flg(boolean value) {
		setConstBoolean(offset + 160, $mfg_str_ln_cd_none_flg, value);
	}


	/**
	 * Operation location cd. 工程場所ＣＤ.<p>
	 *
	 */
	public String oper_loc_cd() {
		return getConstString(offset + 161, $oper_loc_cd);
	}

	/**
	 * Operation location cd. 工程場所ＣＤ.<p>
	 *
	 */
	public void oper_loc_cd(String value) {
		setConstString(offset + 161, $oper_loc_cd, value);
	}


	/**
	 * Operation location name 工程場所名.<p>
	 *
	 */
	public String oper_loc_nm() {
		return getConstString(offset + 162, $oper_loc_nm);
	}

	/**
	 * Operation location name 工程場所名.<p>
	 *
	 */
	public void oper_loc_nm(String value) {
		setConstString(offset + 162, $oper_loc_nm, value);
	}


	/**
	 * Operation rack/line cd. 工程棚・ラインＣＤ.<p>
	 *
	 */
	public String oper_str_ln_cd() {
		return getConstString(offset + 163, $oper_str_ln_cd);
	}

	/**
	 * Operation rack/line cd. 工程棚・ラインＣＤ.<p>
	 *
	 */
	public void oper_str_ln_cd(String value) {
		setConstString(offset + 163, $oper_str_ln_cd, value);
	}


	/**
	 * Operation rack/line name 工程棚・ライン名.<p>
	 *
	 */
	public String oper_str_ln_nm() {
		return getConstString(offset + 164, $oper_str_ln_nm);
	}

	/**
	 * Operation rack/line name 工程棚・ライン名.<p>
	 *
	 */
	public void oper_str_ln_nm(String value) {
		setConstString(offset + 164, $oper_str_ln_nm, value);
	}


	/**
	 * Without operation rack/line 工程棚・ライン無.<p>
	 *
	 */
	public boolean oper_str_ln_cd_none_flg() {
		return getConstBoolean(offset + 165, $oper_str_ln_cd_none_flg);
	}

	/**
	 * Without operation rack/line 工程棚・ライン無.<p>
	 *
	 */
	public void oper_str_ln_cd_none_flg(boolean value) {
		setConstBoolean(offset + 165, $oper_str_ln_cd_none_flg, value);
	}


	/**
	 * Mfg. location group cd. 製造場所グループＣＤ.<p>
	 *
	 */
	public String mfg_loc_grp_cd() {
		return getConstString(offset + 166, $mfg_loc_grp_cd);
	}

	/**
	 * Mfg. location group cd. 製造場所グループＣＤ.<p>
	 *
	 */
	public void mfg_loc_grp_cd(String value) {
		setConstString(offset + 166, $mfg_loc_grp_cd, value);
	}


	/**
	 * Mfg. location group name 製造場所グループ名.<p>
	 *
	 */
	public String mfg_loc_grp_nm() {
		return getConstString(offset + 167, $mfg_loc_grp_nm);
	}

	/**
	 * Mfg. location group name 製造場所グループ名.<p>
	 *
	 */
	public void mfg_loc_grp_nm(String value) {
		setConstString(offset + 167, $mfg_loc_grp_nm, value);
	}


	/**
	 * Factory/Distribution warehouse cd. 工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public String site_cd() {
		return getConstString(offset + 168, $site_cd);
	}

	/**
	 * Factory/Distribution warehouse cd. 工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public void site_cd(String value) {
		setConstString(offset + 168, $site_cd, value);
	}


	/**
	 * Factory/Distribution warehouse name 工場・物流倉庫名.<p>
	 *
	 */
	public String site_nm() {
		return getConstString(offset + 169, $site_nm);
	}

	/**
	 * Factory/Distribution warehouse name 工場・物流倉庫名.<p>
	 *
	 */
	public void site_nm(String value) {
		setConstString(offset + 169, $site_nm, value);
	}


	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public String wg_cd() {
		return getConstString(offset + 170, $wg_cd);
	}

	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public void wg_cd(String value) {
		setConstString(offset + 170, $wg_cd, value);
	}


	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public String wg_nm() {
		return getConstString(offset + 171, $wg_nm);
	}

	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public void wg_nm(String value) {
		setConstString(offset + 171, $wg_nm, value);
	}


	/**
	 * BOM pattern 構成パタン.<p>
	 *
	 */
	public String bom_ptn() {
		return getConstString(offset + 172, $bom_ptn);
	}

	/**
	 * BOM pattern 構成パタン.<p>
	 *
	 */
	public void bom_ptn(String value) {
		setConstString(offset + 172, $bom_ptn, value);
	}


	/**
	 * Operation pattern 工程パタン.<p>
	 *
	 */
	public String oper_ptn() {
		return getConstString(offset + 173, $oper_ptn);
	}

	/**
	 * Operation pattern 工程パタン.<p>
	 *
	 */
	public void oper_ptn(String value) {
		setConstString(offset + 173, $oper_ptn, value);
	}


	/**
	 * Item order No. 品目オーダＮＯ.<p>
	 *
	 */
	public String itm_ord_no() {
		return getConstString(offset + 174, $itm_ord_no);
	}

	/**
	 * Item order No. 品目オーダＮＯ.<p>
	 *
	 */
	public void itm_ord_no(String value) {
		setConstString(offset + 174, $itm_ord_no, value);
	}


	/**
	 * Mfg. order No. 製造指図ＮＯ.<p>
	 *
	 */
	public String mfg_inst_no() {
		return getConstString(offset + 175, $mfg_inst_no);
	}

	/**
	 * Mfg. order No. 製造指図ＮＯ.<p>
	 *
	 */
	public void mfg_inst_no(String value) {
		setConstString(offset + 175, $mfg_inst_no, value);
	}


	/**
	 * Split sequence number 分割連番.<p>
	 *
	 */
	public MCNumber div_seq() {
		return getConstNumber(offset + 176, $div_seq);
	}

	/**
	 * Split sequence number 分割連番.<p>
	 *
	 */
	public void div_seq(MCNumber value) {
		setConstNumber(offset + 176, $div_seq, value);
	}

	/**
	 * Split sequence number 分割連番.<p>
	 *
	 */
	public void div_seq(int value) {
		setConstNumber(offset + 176, $div_seq, value);
	}

	/**
	 * Split sequence number 分割連番.<p>
	 *
	 */
	public void div_seq(long value) {
		setConstNumber(offset + 176, $div_seq, value);
	}

	/**
	 * Split sequence number 分割連番.<p>
	 *
	 */
	public void div_seq(float value) {
		setConstNumber(offset + 176, $div_seq, value);
	}

	/**
	 * Split sequence number 分割連番.<p>
	 *
	 */
	public void div_seq(double value) {
		setConstNumber(offset + 176, $div_seq, value);
	}


	/**
	 * PO details No. 発注明細ＮＯ.<p>
	 *
	 */
	public String po_d_no() {
		return getConstString(offset + 177, $po_d_no);
	}

	/**
	 * PO details No. 発注明細ＮＯ.<p>
	 *
	 */
	public void po_d_no(String value) {
		setConstString(offset + 177, $po_d_no, value);
	}


	/**
	 * Mfg. result No. 製造実績ＮＯ.<p>
	 *
	 */
	public String mfg_act_no() {
		return getConstString(offset + 178, $mfg_act_no);
	}

	/**
	 * Mfg. result No. 製造実績ＮＯ.<p>
	 *
	 */
	public void mfg_act_no(String value) {
		setConstString(offset + 178, $mfg_act_no, value);
	}


	/**
	 * Operation order No. 工程指図ＮＯ.<p>
	 *
	 */
	public String oper_inst_no() {
		return getConstString(offset + 179, $oper_inst_no);
	}

	/**
	 * Operation order No. 工程指図ＮＯ.<p>
	 *
	 */
	public void oper_inst_no(String value) {
		setConstString(offset + 179, $oper_inst_no, value);
	}


	/**
	 * Operation result No. 工程実績ＮＯ.<p>
	 *
	 */
	public String oper_act_no() {
		return getConstString(offset + 180, $oper_act_no);
	}

	/**
	 * Operation result No. 工程実績ＮＯ.<p>
	 *
	 */
	public void oper_act_no(String value) {
		setConstString(offset + 180, $oper_act_no, value);
	}


	/**
	 * Operation sequence number 工程連番.<p>
	 *
	 */
	public MCNumber oper_seq() {
		return getConstNumber(offset + 181, $oper_seq);
	}

	/**
	 * Operation sequence number 工程連番.<p>
	 *
	 */
	public void oper_seq(MCNumber value) {
		setConstNumber(offset + 181, $oper_seq, value);
	}

	/**
	 * Operation sequence number 工程連番.<p>
	 *
	 */
	public void oper_seq(int value) {
		setConstNumber(offset + 181, $oper_seq, value);
	}

	/**
	 * Operation sequence number 工程連番.<p>
	 *
	 */
	public void oper_seq(long value) {
		setConstNumber(offset + 181, $oper_seq, value);
	}

	/**
	 * Operation sequence number 工程連番.<p>
	 *
	 */
	public void oper_seq(float value) {
		setConstNumber(offset + 181, $oper_seq, value);
	}

	/**
	 * Operation sequence number 工程連番.<p>
	 *
	 */
	public void oper_seq(double value) {
		setConstNumber(offset + 181, $oper_seq, value);
	}


	/**
	 * Routing 工順.<p>
	 *
	 */
	public MCNumber oper_disp_seq() {
		return getConstNumber(offset + 182, $oper_disp_seq);
	}

	/**
	 * Routing 工順.<p>
	 *
	 */
	public void oper_disp_seq(MCNumber value) {
		setConstNumber(offset + 182, $oper_disp_seq, value);
	}

	/**
	 * Routing 工順.<p>
	 *
	 */
	public void oper_disp_seq(int value) {
		setConstNumber(offset + 182, $oper_disp_seq, value);
	}

	/**
	 * Routing 工順.<p>
	 *
	 */
	public void oper_disp_seq(long value) {
		setConstNumber(offset + 182, $oper_disp_seq, value);
	}

	/**
	 * Routing 工順.<p>
	 *
	 */
	public void oper_disp_seq(float value) {
		setConstNumber(offset + 182, $oper_disp_seq, value);
	}

	/**
	 * Routing 工順.<p>
	 *
	 */
	public void oper_disp_seq(double value) {
		setConstNumber(offset + 182, $oper_disp_seq, value);
	}


	/**
	 * Operation PIC cd. 工程担当者ＣＤ.<p>
	 *
	 */
	public String oper_usr_cd() {
		return getConstString(offset + 183, $oper_usr_cd);
	}

	/**
	 * Operation PIC cd. 工程担当者ＣＤ.<p>
	 *
	 */
	public void oper_usr_cd(String value) {
		setConstString(offset + 183, $oper_usr_cd, value);
	}


	/**
	 * Operation PIC name 工程担当者名.<p>
	 *
	 */
	public String oper_usr_nm() {
		return getConstString(offset + 184, $oper_usr_nm);
	}

	/**
	 * Operation PIC name 工程担当者名.<p>
	 *
	 */
	public void oper_usr_nm(String value) {
		setConstString(offset + 184, $oper_usr_nm, value);
	}


	/**
	 * Child item type 子品目区分.<p>
	 *
	 */
	public String chd_itm_typ() {
		return getConstString(offset + 185, $chd_itm_typ);
	}

	/**
	 * Child item type 子品目区分.<p>
	 *
	 */
	public void chd_itm_typ(String value) {
		setConstString(offset + 185, $chd_itm_typ, value);
	}


	/**
	 * Child item type name 子品目区分名.<p>
	 *
	 */
	public String chd_itm_typ_nm() {
		return getConstString(offset + 186, $chd_itm_typ_nm);
	}

	/**
	 * Child item type name 子品目区分名.<p>
	 *
	 */
	public void chd_itm_typ_nm(String value) {
		setConstString(offset + 186, $chd_itm_typ_nm, value);
	}


	/**
	 * Child item type details cd. 子品目区分詳細ＣＤ.<p>
	 *
	 */
	public String chd_itm_typ_d_cd() {
		return getConstString(offset + 187, $chd_itm_typ_d_cd);
	}

	/**
	 * Child item type details cd. 子品目区分詳細ＣＤ.<p>
	 *
	 */
	public void chd_itm_typ_d_cd(String value) {
		setConstString(offset + 187, $chd_itm_typ_d_cd, value);
	}


	/**
	 * Child item type details name 子品目区分詳細名.<p>
	 *
	 */
	public String chd_itm_typ_d_nm() {
		return getConstString(offset + 188, $chd_itm_typ_d_nm);
	}

	/**
	 * Child item type details name 子品目区分詳細名.<p>
	 *
	 */
	public void chd_itm_typ_d_nm(String value) {
		setConstString(offset + 188, $chd_itm_typ_d_nm, value);
	}


	/**
	 * Parent item type 親品目区分.<p>
	 *
	 */
	public String par_itm_typ() {
		return getConstString(offset + 189, $par_itm_typ);
	}

	/**
	 * Parent item type 親品目区分.<p>
	 *
	 */
	public void par_itm_typ(String value) {
		setConstString(offset + 189, $par_itm_typ, value);
	}


	/**
	 * Parent item type name 親品目区分名.<p>
	 *
	 */
	public String par_itm_typ_nm() {
		return getConstString(offset + 190, $par_itm_typ_nm);
	}

	/**
	 * Parent item type name 親品目区分名.<p>
	 *
	 */
	public void par_itm_typ_nm(String value) {
		setConstString(offset + 190, $par_itm_typ_nm, value);
	}


	/**
	 * Parent item type details cd. 親品目区分詳細ＣＤ.<p>
	 *
	 */
	public String par_itm_typ_d_cd() {
		return getConstString(offset + 191, $par_itm_typ_d_cd);
	}

	/**
	 * Parent item type details cd. 親品目区分詳細ＣＤ.<p>
	 *
	 */
	public void par_itm_typ_d_cd(String value) {
		setConstString(offset + 191, $par_itm_typ_d_cd, value);
	}


	/**
	 * Parent item type details name 親品目区分詳細名.<p>
	 *
	 */
	public String par_itm_typ_d_nm() {
		return getConstString(offset + 192, $par_itm_typ_d_nm);
	}

	/**
	 * Parent item type details name 親品目区分詳細名.<p>
	 *
	 */
	public void par_itm_typ_d_nm(String value) {
		setConstString(offset + 192, $par_itm_typ_d_nm, value);
	}


	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public String ins_usr_id() {
		return getConstString(offset + 193, $ins_usr_id);
	}

	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public void ins_usr_id(String value) {
		setConstString(offset + 193, $ins_usr_id, value);
	}


	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public String ins_usr_nm() {
		return getConstString(offset + 194, $ins_usr_nm);
	}

	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public void ins_usr_nm(String value) {
		setConstString(offset + 194, $ins_usr_nm, value);
	}


	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public String ins_func_id() {
		return getConstString(offset + 195, $ins_func_id);
	}

	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public void ins_func_id(String value) {
		setConstString(offset + 195, $ins_func_id, value);
	}


	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public String ins_func_nm() {
		return getConstString(offset + 196, $ins_func_nm);
	}

	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public void ins_func_nm(String value) {
		setConstString(offset + 196, $ins_func_nm, value);
	}


	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public MCTimestamp ins_ts() {
		return getConstTimestamp(offset + 197, $ins_ts);
	}

	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public void ins_ts(MCTimestamp value) {
		setConstTimestamp(offset + 197, $ins_ts, value);
	}


	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public String upd_usr_id() {
		return getConstString(offset + 198, $upd_usr_id);
	}

	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public void upd_usr_id(String value) {
		setConstString(offset + 198, $upd_usr_id, value);
	}


	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public String upd_usr_nm() {
		return getConstString(offset + 199, $upd_usr_nm);
	}

	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public void upd_usr_nm(String value) {
		setConstString(offset + 199, $upd_usr_nm, value);
	}


	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public String upd_func_id() {
		return getConstString(offset + 200, $upd_func_id);
	}

	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public void upd_func_id(String value) {
		setConstString(offset + 200, $upd_func_id, value);
	}


	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public String upd_func_nm() {
		return getConstString(offset + 201, $upd_func_nm);
	}

	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public void upd_func_nm(String value) {
		setConstString(offset + 201, $upd_func_nm, value);
	}


	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public MCTimestamp upd_ts() {
		return getConstTimestamp(offset + 202, $upd_ts);
	}

	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public void upd_ts(MCTimestamp value) {
		setConstTimestamp(offset + 202, $upd_ts, value);
	}


	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public String upd_srv_req_no() {
		return getConstString(offset + 203, $upd_srv_req_no);
	}

	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public void upd_srv_req_no(String value) {
		setConstString(offset + 203, $upd_srv_req_no, value);
	}


	public mcframe.clientMAUB.MAUBP5170.ItmGrpR chd_itm_grp_p(){
		return (mcframe.clientMAUB.MAUBP5170.ItmGrpR) getConstInnerRow(offset + 204, $chd_itm_grp_p);
	}
	
	public void chd_itm_grp_p(mcframe.clientMAUB.MAUBP5170.ItmGrpR row){
		setConstInnerRow(offset + 204, $chd_itm_grp_p, row);
	}


	public mcframe.clientMAUB.MAUBP5170.ItmGrpR par_itm_grp_p(){
		return (mcframe.clientMAUB.MAUBP5170.ItmGrpR) getConstInnerRow(offset + 205, $par_itm_grp_p);
	}
	
	public void par_itm_grp_p(mcframe.clientMAUB.MAUBP5170.ItmGrpR row){
		setConstInnerRow(offset + 205, $par_itm_grp_p, row);
	}


	public String getString(String name) {
		if ($inpt_mfg_sts_typ.equalsIgnoreCase(name)) {
			return inpt_mfg_sts_typ();
		}
		if ($inpt_mfg_sts_typ_nm.equalsIgnoreCase(name)) {
			return inpt_mfg_sts_typ_nm();
		}
		if ($mfg_mtd_typ.equalsIgnoreCase(name)) {
			return mfg_mtd_typ();
		}
		if ($mfg_mtd_typ_nm.equalsIgnoreCase(name)) {
			return mfg_mtd_typ_nm();
		}
		if ($mfg_loc_cd.equalsIgnoreCase(name)) {
			return mfg_loc_cd();
		}
		if ($mfg_loc_nm.equalsIgnoreCase(name)) {
			return mfg_loc_nm();
		}
		if ($oper_cd.equalsIgnoreCase(name)) {
			return oper_cd();
		}
		if ($oper_nm.equalsIgnoreCase(name)) {
			return oper_nm();
		}
		if ($loss_rsn_cd.equalsIgnoreCase(name)) {
			return loss_rsn_cd();
		}
		if ($loss_rsn_nm.equalsIgnoreCase(name)) {
			return loss_rsn_nm();
		}
		if ($base_unit_cd.equalsIgnoreCase(name)) {
			return base_unit_cd();
		}
		if ($base_unit_nm.equalsIgnoreCase(name)) {
			return base_unit_nm();
		}
		if ($inst_lot_no.equalsIgnoreCase(name)) {
			return inst_lot_no();
		}
		if ($inst_sublot_no.equalsIgnoreCase(name)) {
			return inst_sublot_no();
		}
		if ($gd_cd.equalsIgnoreCase(name)) {
			return gd_cd();
		}
		if ($gd_nm.equalsIgnoreCase(name)) {
			return gd_nm();
		}
		if ($inpt_rsn_cd.equalsIgnoreCase(name)) {
			return inpt_rsn_cd();
		}
		if ($inpt_rsn_nm.equalsIgnoreCase(name)) {
			return inpt_rsn_nm();
		}
		if ($inpt_loc_cd.equalsIgnoreCase(name)) {
			return inpt_loc_cd();
		}
		if ($inpt_loc_nm.equalsIgnoreCase(name)) {
			return inpt_loc_nm();
		}
		if ($cont_fctr_rnd_typ.equalsIgnoreCase(name)) {
			return cont_fctr_rnd_typ();
		}
		if ($prov_typ.equalsIgnoreCase(name)) {
			return prov_typ();
		}
		if ($prov_typ_nm.equalsIgnoreCase(name)) {
			return prov_typ_nm();
		}
		if ($alt_grp_cd.equalsIgnoreCase(name)) {
			return alt_grp_cd();
		}
		if ($alt_grp_nm.equalsIgnoreCase(name)) {
			return alt_grp_nm();
		}
		if ($alt_itm_typ.equalsIgnoreCase(name)) {
			return alt_itm_typ();
		}
		if ($alt_itm_typ_nm.equalsIgnoreCase(name)) {
			return alt_itm_typ_nm();
		}
		if ($inpt_schd_no.equalsIgnoreCase(name)) {
			return inpt_schd_no();
		}
		if ($inpt_act_no.equalsIgnoreCase(name)) {
			return inpt_act_no();
		}
		if ($loss_act_no.equalsIgnoreCase(name)) {
			return loss_act_no();
		}
		if ($mes_id.equalsIgnoreCase(name)) {
			return mes_id();
		}
		if ($ext_sys_cd.equalsIgnoreCase(name)) {
			return ext_sys_cd();
		}
		if ($ext_sys_nm.equalsIgnoreCase(name)) {
			return ext_sys_nm();
		}
		if ($ext_inpt_act_no.equalsIgnoreCase(name)) {
			return ext_inpt_act_no();
		}
		if ($par_base_unit_cd.equalsIgnoreCase(name)) {
			return par_base_unit_cd();
		}
		if ($par_base_unit_nm.equalsIgnoreCase(name)) {
			return par_base_unit_nm();
		}
		if ($par_act_lot_no.equalsIgnoreCase(name)) {
			return par_act_lot_no();
		}
		if ($par_act_sublot_no.equalsIgnoreCase(name)) {
			return par_act_sublot_no();
		}
		if ($par_inst_lot_no.equalsIgnoreCase(name)) {
			return par_inst_lot_no();
		}
		if ($par_inst_sublot_no.equalsIgnoreCase(name)) {
			return par_inst_sublot_no();
		}
		if ($oper_mfg_sts_typ.equalsIgnoreCase(name)) {
			return oper_mfg_sts_typ();
		}
		if ($oper_mfg_sts_typ_nm.equalsIgnoreCase(name)) {
			return oper_mfg_sts_typ_nm();
		}
		if ($oper_unit_cd.equalsIgnoreCase(name)) {
			return oper_unit_cd();
		}
		if ($oper_unit_nm.equalsIgnoreCase(name)) {
			return oper_unit_nm();
		}
		if ($inpt_ctl_typ.equalsIgnoreCase(name)) {
			return inpt_ctl_typ();
		}
		if ($inpt_ctl_typ_nm.equalsIgnoreCase(name)) {
			return inpt_ctl_typ_nm();
		}
		if ($stk_mng_typ.equalsIgnoreCase(name)) {
			return stk_mng_typ();
		}
		if ($stk_mng_typ_nm.equalsIgnoreCase(name)) {
			return stk_mng_typ_nm();
		}
		if ($bkf_typ.equalsIgnoreCase(name)) {
			return bkf_typ();
		}
		if ($bkf_typ_nm.equalsIgnoreCase(name)) {
			return bkf_typ_nm();
		}
		if ($alloc_ctl_typ.equalsIgnoreCase(name)) {
			return alloc_ctl_typ();
		}
		if ($alloc_ctl_typ_nm.equalsIgnoreCase(name)) {
			return alloc_ctl_typ_nm();
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
		if ($stk_arrv_bp_cd.equalsIgnoreCase(name)) {
			return stk_arrv_bp_cd();
		}
		if ($stk_arrv_bp_nm.equalsIgnoreCase(name)) {
			return stk_arrv_bp_nm();
		}
		if ($acxfr_act_rsn_cd.equalsIgnoreCase(name)) {
			return acxfr_act_rsn_cd();
		}
		if ($acxfr_act_rsn_nm.equalsIgnoreCase(name)) {
			return acxfr_act_rsn_nm();
		}
		if ($acxfr_act_bd_dpt_cd.equalsIgnoreCase(name)) {
			return acxfr_act_bd_dpt_cd();
		}
		if ($acxfr_act_bd_dpt_nm.equalsIgnoreCase(name)) {
			return acxfr_act_bd_dpt_nm();
		}
		if ($inpt_schd_intr_rmrks.equalsIgnoreCase(name)) {
			return inpt_schd_intr_rmrks();
		}
		if ($inpt_schd_inst_rpt_rmrks.equalsIgnoreCase(name)) {
			return inpt_schd_inst_rpt_rmrks();
		}
		if ($inpt_schd_sub_char1.equalsIgnoreCase(name)) {
			return inpt_schd_sub_char1();
		}
		if ($inpt_schd_sub_char2.equalsIgnoreCase(name)) {
			return inpt_schd_sub_char2();
		}
		if ($inpt_schd_sub_char3.equalsIgnoreCase(name)) {
			return inpt_schd_sub_char3();
		}
		if ($inpt_act_intr_rmrks.equalsIgnoreCase(name)) {
			return inpt_act_intr_rmrks();
		}
		if ($inpt_act_rpt_rmrks.equalsIgnoreCase(name)) {
			return inpt_act_rpt_rmrks();
		}
		if ($inpt_act_trd_rmrks.equalsIgnoreCase(name)) {
			return inpt_act_trd_rmrks();
		}
		if ($inpt_act_sub_char1.equalsIgnoreCase(name)) {
			return inpt_act_sub_char1();
		}
		if ($inpt_act_sub_char2.equalsIgnoreCase(name)) {
			return inpt_act_sub_char2();
		}
		if ($inpt_act_sub_char3.equalsIgnoreCase(name)) {
			return inpt_act_sub_char3();
		}
		if ($loss_act_intr_rmrks.equalsIgnoreCase(name)) {
			return loss_act_intr_rmrks();
		}
		if ($loss_act_trd_rmrks.equalsIgnoreCase(name)) {
			return loss_act_trd_rmrks();
		}
		if ($loss_act_sub_char1.equalsIgnoreCase(name)) {
			return loss_act_sub_char1();
		}
		if ($loss_act_sub_char2.equalsIgnoreCase(name)) {
			return loss_act_sub_char2();
		}
		if ($loss_act_sub_char3.equalsIgnoreCase(name)) {
			return loss_act_sub_char3();
		}
		if ($mfg_act_rpt_rmrks.equalsIgnoreCase(name)) {
			return mfg_act_rpt_rmrks();
		}
		if ($mfg_act_intr_rmrks.equalsIgnoreCase(name)) {
			return mfg_act_intr_rmrks();
		}
		if ($mfg_act_sub_char1.equalsIgnoreCase(name)) {
			return mfg_act_sub_char1();
		}
		if ($mfg_act_sub_char2.equalsIgnoreCase(name)) {
			return mfg_act_sub_char2();
		}
		if ($mfg_act_sub_char3.equalsIgnoreCase(name)) {
			return mfg_act_sub_char3();
		}
		if ($oper_act_intr_rmrks.equalsIgnoreCase(name)) {
			return oper_act_intr_rmrks();
		}
		if ($oper_act_rpt_rmrks.equalsIgnoreCase(name)) {
			return oper_act_rpt_rmrks();
		}
		if ($oper_act_sub_char1.equalsIgnoreCase(name)) {
			return oper_act_sub_char1();
		}
		if ($oper_act_sub_char2.equalsIgnoreCase(name)) {
			return oper_act_sub_char2();
		}
		if ($oper_act_sub_char3.equalsIgnoreCase(name)) {
			return oper_act_sub_char3();
		}
		if ($sppl_cd.equalsIgnoreCase(name)) {
			return sppl_cd();
		}
		if ($sppl_nm.equalsIgnoreCase(name)) {
			return sppl_nm();
		}
		if ($mfg_str_ln_cd.equalsIgnoreCase(name)) {
			return mfg_str_ln_cd();
		}
		if ($mfg_str_ln_nm.equalsIgnoreCase(name)) {
			return mfg_str_ln_nm();
		}
		if ($oper_loc_cd.equalsIgnoreCase(name)) {
			return oper_loc_cd();
		}
		if ($oper_loc_nm.equalsIgnoreCase(name)) {
			return oper_loc_nm();
		}
		if ($oper_str_ln_cd.equalsIgnoreCase(name)) {
			return oper_str_ln_cd();
		}
		if ($oper_str_ln_nm.equalsIgnoreCase(name)) {
			return oper_str_ln_nm();
		}
		if ($mfg_loc_grp_cd.equalsIgnoreCase(name)) {
			return mfg_loc_grp_cd();
		}
		if ($mfg_loc_grp_nm.equalsIgnoreCase(name)) {
			return mfg_loc_grp_nm();
		}
		if ($site_cd.equalsIgnoreCase(name)) {
			return site_cd();
		}
		if ($site_nm.equalsIgnoreCase(name)) {
			return site_nm();
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			return wg_nm();
		}
		if ($bom_ptn.equalsIgnoreCase(name)) {
			return bom_ptn();
		}
		if ($oper_ptn.equalsIgnoreCase(name)) {
			return oper_ptn();
		}
		if ($itm_ord_no.equalsIgnoreCase(name)) {
			return itm_ord_no();
		}
		if ($mfg_inst_no.equalsIgnoreCase(name)) {
			return mfg_inst_no();
		}
		if ($po_d_no.equalsIgnoreCase(name)) {
			return po_d_no();
		}
		if ($mfg_act_no.equalsIgnoreCase(name)) {
			return mfg_act_no();
		}
		if ($oper_inst_no.equalsIgnoreCase(name)) {
			return oper_inst_no();
		}
		if ($oper_act_no.equalsIgnoreCase(name)) {
			return oper_act_no();
		}
		if ($oper_usr_cd.equalsIgnoreCase(name)) {
			return oper_usr_cd();
		}
		if ($oper_usr_nm.equalsIgnoreCase(name)) {
			return oper_usr_nm();
		}
		if ($chd_itm_typ.equalsIgnoreCase(name)) {
			return chd_itm_typ();
		}
		if ($chd_itm_typ_nm.equalsIgnoreCase(name)) {
			return chd_itm_typ_nm();
		}
		if ($chd_itm_typ_d_cd.equalsIgnoreCase(name)) {
			return chd_itm_typ_d_cd();
		}
		if ($chd_itm_typ_d_nm.equalsIgnoreCase(name)) {
			return chd_itm_typ_d_nm();
		}
		if ($par_itm_typ.equalsIgnoreCase(name)) {
			return par_itm_typ();
		}
		if ($par_itm_typ_nm.equalsIgnoreCase(name)) {
			return par_itm_typ_nm();
		}
		if ($par_itm_typ_d_cd.equalsIgnoreCase(name)) {
			return par_itm_typ_d_cd();
		}
		if ($par_itm_typ_d_nm.equalsIgnoreCase(name)) {
			return par_itm_typ_d_nm();
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
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			return base_unit_dec_place();
		}
		if ($pr_rate.equalsIgnoreCase(name)) {
			return pr_rate();
		}
		if ($cont_fctr_dec_place.equalsIgnoreCase(name)) {
			return cont_fctr_dec_place();
		}
		if ($alt_grp_seq.equalsIgnoreCase(name)) {
			return alt_grp_seq();
		}
		if ($alt_alloc_prio.equalsIgnoreCase(name)) {
			return alt_alloc_prio();
		}
		if ($data_no.equalsIgnoreCase(name)) {
			return data_no();
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			return disp_seq();
		}
		if ($par_base_unit_dec_place.equalsIgnoreCase(name)) {
			return par_base_unit_dec_place();
		}
		if ($oper_unit_dec_place.equalsIgnoreCase(name)) {
			return oper_unit_dec_place();
		}
		if ($itm_yield.equalsIgnoreCase(name)) {
			return itm_yield();
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
		if ($oper_yield.equalsIgnoreCase(name)) {
			return oper_yield();
		}
		if ($oper_lower_yield.equalsIgnoreCase(name)) {
			return oper_lower_yield();
		}
		if ($oper_std_yield.equalsIgnoreCase(name)) {
			return oper_std_yield();
		}
		if ($oper_upper_yield.equalsIgnoreCase(name)) {
			return oper_upper_yield();
		}
		if ($div_seq.equalsIgnoreCase(name)) {
			return div_seq();
		}
		if ($oper_seq.equalsIgnoreCase(name)) {
			return oper_seq();
		}
		if ($oper_disp_seq.equalsIgnoreCase(name)) {
			return oper_disp_seq();
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
		return super.getTimestamp(name);
	}
	public boolean getBoolean(String name) {
		if ($abort_flg.equalsIgnoreCase(name)) {
			return abort_flg();
		}
		if ($schd_abort_flg.equalsIgnoreCase(name)) {
			return schd_abort_flg();
		}
		if ($cont_fctr_flg.equalsIgnoreCase(name)) {
			return cont_fctr_flg();
		}
		if ($alt_itm_fix_flg.equalsIgnoreCase(name)) {
			return alt_itm_fix_flg();
		}
		if ($alloc_flg.equalsIgnoreCase(name)) {
			return alloc_flg();
		}
		if ($main_itm_flg.equalsIgnoreCase(name)) {
			return main_itm_flg();
		}
		if ($yield_calc_flg.equalsIgnoreCase(name)) {
			return yield_calc_flg();
		}
		if ($bkf_upd_flg.equalsIgnoreCase(name)) {
			return bkf_upd_flg();
		}
		if ($lot_mix_flg.equalsIgnoreCase(name)) {
			return lot_mix_flg();
		}
		if ($sublot_mix_flg.equalsIgnoreCase(name)) {
			return sublot_mix_flg();
		}
		if ($mfg_str_ln_cd_none_flg.equalsIgnoreCase(name)) {
			return mfg_str_ln_cd_none_flg();
		}
		if ($oper_str_ln_cd_none_flg.equalsIgnoreCase(name)) {
			return oper_str_ln_cd_none_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($inpt_mfg_sts_typ.equalsIgnoreCase(name)) {
			return inpt_mfg_sts_typ();
		}
		if ($inpt_mfg_sts_typ_nm.equalsIgnoreCase(name)) {
			return inpt_mfg_sts_typ_nm();
		}
		if ($mfg_mtd_typ.equalsIgnoreCase(name)) {
			return mfg_mtd_typ();
		}
		if ($mfg_mtd_typ_nm.equalsIgnoreCase(name)) {
			return mfg_mtd_typ_nm();
		}
		if ($mfg_loc_cd.equalsIgnoreCase(name)) {
			return mfg_loc_cd();
		}
		if ($mfg_loc_nm.equalsIgnoreCase(name)) {
			return mfg_loc_nm();
		}
		if ($oper_cd.equalsIgnoreCase(name)) {
			return oper_cd();
		}
		if ($oper_nm.equalsIgnoreCase(name)) {
			return oper_nm();
		}
		if ($loss_rsn_cd.equalsIgnoreCase(name)) {
			return loss_rsn_cd();
		}
		if ($loss_rsn_nm.equalsIgnoreCase(name)) {
			return loss_rsn_nm();
		}
		if ($base_unit_cd.equalsIgnoreCase(name)) {
			return base_unit_cd();
		}
		if ($base_unit_nm.equalsIgnoreCase(name)) {
			return base_unit_nm();
		}
		if ($inst_lot_no.equalsIgnoreCase(name)) {
			return inst_lot_no();
		}
		if ($inst_sublot_no.equalsIgnoreCase(name)) {
			return inst_sublot_no();
		}
		if ($gd_cd.equalsIgnoreCase(name)) {
			return gd_cd();
		}
		if ($gd_nm.equalsIgnoreCase(name)) {
			return gd_nm();
		}
		if ($inpt_rsn_cd.equalsIgnoreCase(name)) {
			return inpt_rsn_cd();
		}
		if ($inpt_rsn_nm.equalsIgnoreCase(name)) {
			return inpt_rsn_nm();
		}
		if ($inpt_loc_cd.equalsIgnoreCase(name)) {
			return inpt_loc_cd();
		}
		if ($inpt_loc_nm.equalsIgnoreCase(name)) {
			return inpt_loc_nm();
		}
		if ($cont_fctr_rnd_typ.equalsIgnoreCase(name)) {
			return cont_fctr_rnd_typ();
		}
		if ($prov_typ.equalsIgnoreCase(name)) {
			return prov_typ();
		}
		if ($prov_typ_nm.equalsIgnoreCase(name)) {
			return prov_typ_nm();
		}
		if ($alt_grp_cd.equalsIgnoreCase(name)) {
			return alt_grp_cd();
		}
		if ($alt_grp_nm.equalsIgnoreCase(name)) {
			return alt_grp_nm();
		}
		if ($alt_itm_typ.equalsIgnoreCase(name)) {
			return alt_itm_typ();
		}
		if ($alt_itm_typ_nm.equalsIgnoreCase(name)) {
			return alt_itm_typ_nm();
		}
		if ($inpt_schd_no.equalsIgnoreCase(name)) {
			return inpt_schd_no();
		}
		if ($inpt_act_no.equalsIgnoreCase(name)) {
			return inpt_act_no();
		}
		if ($loss_act_no.equalsIgnoreCase(name)) {
			return loss_act_no();
		}
		if ($mes_id.equalsIgnoreCase(name)) {
			return mes_id();
		}
		if ($ext_sys_cd.equalsIgnoreCase(name)) {
			return ext_sys_cd();
		}
		if ($ext_sys_nm.equalsIgnoreCase(name)) {
			return ext_sys_nm();
		}
		if ($ext_inpt_act_no.equalsIgnoreCase(name)) {
			return ext_inpt_act_no();
		}
		if ($par_base_unit_cd.equalsIgnoreCase(name)) {
			return par_base_unit_cd();
		}
		if ($par_base_unit_nm.equalsIgnoreCase(name)) {
			return par_base_unit_nm();
		}
		if ($par_act_lot_no.equalsIgnoreCase(name)) {
			return par_act_lot_no();
		}
		if ($par_act_sublot_no.equalsIgnoreCase(name)) {
			return par_act_sublot_no();
		}
		if ($par_inst_lot_no.equalsIgnoreCase(name)) {
			return par_inst_lot_no();
		}
		if ($par_inst_sublot_no.equalsIgnoreCase(name)) {
			return par_inst_sublot_no();
		}
		if ($oper_mfg_sts_typ.equalsIgnoreCase(name)) {
			return oper_mfg_sts_typ();
		}
		if ($oper_mfg_sts_typ_nm.equalsIgnoreCase(name)) {
			return oper_mfg_sts_typ_nm();
		}
		if ($oper_unit_cd.equalsIgnoreCase(name)) {
			return oper_unit_cd();
		}
		if ($oper_unit_nm.equalsIgnoreCase(name)) {
			return oper_unit_nm();
		}
		if ($inpt_ctl_typ.equalsIgnoreCase(name)) {
			return inpt_ctl_typ();
		}
		if ($inpt_ctl_typ_nm.equalsIgnoreCase(name)) {
			return inpt_ctl_typ_nm();
		}
		if ($stk_mng_typ.equalsIgnoreCase(name)) {
			return stk_mng_typ();
		}
		if ($stk_mng_typ_nm.equalsIgnoreCase(name)) {
			return stk_mng_typ_nm();
		}
		if ($bkf_typ.equalsIgnoreCase(name)) {
			return bkf_typ();
		}
		if ($bkf_typ_nm.equalsIgnoreCase(name)) {
			return bkf_typ_nm();
		}
		if ($alloc_ctl_typ.equalsIgnoreCase(name)) {
			return alloc_ctl_typ();
		}
		if ($alloc_ctl_typ_nm.equalsIgnoreCase(name)) {
			return alloc_ctl_typ_nm();
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
		if ($stk_arrv_bp_cd.equalsIgnoreCase(name)) {
			return stk_arrv_bp_cd();
		}
		if ($stk_arrv_bp_nm.equalsIgnoreCase(name)) {
			return stk_arrv_bp_nm();
		}
		if ($acxfr_act_rsn_cd.equalsIgnoreCase(name)) {
			return acxfr_act_rsn_cd();
		}
		if ($acxfr_act_rsn_nm.equalsIgnoreCase(name)) {
			return acxfr_act_rsn_nm();
		}
		if ($acxfr_act_bd_dpt_cd.equalsIgnoreCase(name)) {
			return acxfr_act_bd_dpt_cd();
		}
		if ($acxfr_act_bd_dpt_nm.equalsIgnoreCase(name)) {
			return acxfr_act_bd_dpt_nm();
		}
		if ($inpt_schd_intr_rmrks.equalsIgnoreCase(name)) {
			return inpt_schd_intr_rmrks();
		}
		if ($inpt_schd_inst_rpt_rmrks.equalsIgnoreCase(name)) {
			return inpt_schd_inst_rpt_rmrks();
		}
		if ($inpt_schd_sub_char1.equalsIgnoreCase(name)) {
			return inpt_schd_sub_char1();
		}
		if ($inpt_schd_sub_char2.equalsIgnoreCase(name)) {
			return inpt_schd_sub_char2();
		}
		if ($inpt_schd_sub_char3.equalsIgnoreCase(name)) {
			return inpt_schd_sub_char3();
		}
		if ($inpt_act_intr_rmrks.equalsIgnoreCase(name)) {
			return inpt_act_intr_rmrks();
		}
		if ($inpt_act_rpt_rmrks.equalsIgnoreCase(name)) {
			return inpt_act_rpt_rmrks();
		}
		if ($inpt_act_trd_rmrks.equalsIgnoreCase(name)) {
			return inpt_act_trd_rmrks();
		}
		if ($inpt_act_sub_char1.equalsIgnoreCase(name)) {
			return inpt_act_sub_char1();
		}
		if ($inpt_act_sub_char2.equalsIgnoreCase(name)) {
			return inpt_act_sub_char2();
		}
		if ($inpt_act_sub_char3.equalsIgnoreCase(name)) {
			return inpt_act_sub_char3();
		}
		if ($loss_act_intr_rmrks.equalsIgnoreCase(name)) {
			return loss_act_intr_rmrks();
		}
		if ($loss_act_trd_rmrks.equalsIgnoreCase(name)) {
			return loss_act_trd_rmrks();
		}
		if ($loss_act_sub_char1.equalsIgnoreCase(name)) {
			return loss_act_sub_char1();
		}
		if ($loss_act_sub_char2.equalsIgnoreCase(name)) {
			return loss_act_sub_char2();
		}
		if ($loss_act_sub_char3.equalsIgnoreCase(name)) {
			return loss_act_sub_char3();
		}
		if ($mfg_act_rpt_rmrks.equalsIgnoreCase(name)) {
			return mfg_act_rpt_rmrks();
		}
		if ($mfg_act_intr_rmrks.equalsIgnoreCase(name)) {
			return mfg_act_intr_rmrks();
		}
		if ($mfg_act_sub_char1.equalsIgnoreCase(name)) {
			return mfg_act_sub_char1();
		}
		if ($mfg_act_sub_char2.equalsIgnoreCase(name)) {
			return mfg_act_sub_char2();
		}
		if ($mfg_act_sub_char3.equalsIgnoreCase(name)) {
			return mfg_act_sub_char3();
		}
		if ($oper_act_intr_rmrks.equalsIgnoreCase(name)) {
			return oper_act_intr_rmrks();
		}
		if ($oper_act_rpt_rmrks.equalsIgnoreCase(name)) {
			return oper_act_rpt_rmrks();
		}
		if ($oper_act_sub_char1.equalsIgnoreCase(name)) {
			return oper_act_sub_char1();
		}
		if ($oper_act_sub_char2.equalsIgnoreCase(name)) {
			return oper_act_sub_char2();
		}
		if ($oper_act_sub_char3.equalsIgnoreCase(name)) {
			return oper_act_sub_char3();
		}
		if ($sppl_cd.equalsIgnoreCase(name)) {
			return sppl_cd();
		}
		if ($sppl_nm.equalsIgnoreCase(name)) {
			return sppl_nm();
		}
		if ($mfg_str_ln_cd.equalsIgnoreCase(name)) {
			return mfg_str_ln_cd();
		}
		if ($mfg_str_ln_nm.equalsIgnoreCase(name)) {
			return mfg_str_ln_nm();
		}
		if ($oper_loc_cd.equalsIgnoreCase(name)) {
			return oper_loc_cd();
		}
		if ($oper_loc_nm.equalsIgnoreCase(name)) {
			return oper_loc_nm();
		}
		if ($oper_str_ln_cd.equalsIgnoreCase(name)) {
			return oper_str_ln_cd();
		}
		if ($oper_str_ln_nm.equalsIgnoreCase(name)) {
			return oper_str_ln_nm();
		}
		if ($mfg_loc_grp_cd.equalsIgnoreCase(name)) {
			return mfg_loc_grp_cd();
		}
		if ($mfg_loc_grp_nm.equalsIgnoreCase(name)) {
			return mfg_loc_grp_nm();
		}
		if ($site_cd.equalsIgnoreCase(name)) {
			return site_cd();
		}
		if ($site_nm.equalsIgnoreCase(name)) {
			return site_nm();
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			return wg_nm();
		}
		if ($bom_ptn.equalsIgnoreCase(name)) {
			return bom_ptn();
		}
		if ($oper_ptn.equalsIgnoreCase(name)) {
			return oper_ptn();
		}
		if ($itm_ord_no.equalsIgnoreCase(name)) {
			return itm_ord_no();
		}
		if ($mfg_inst_no.equalsIgnoreCase(name)) {
			return mfg_inst_no();
		}
		if ($po_d_no.equalsIgnoreCase(name)) {
			return po_d_no();
		}
		if ($mfg_act_no.equalsIgnoreCase(name)) {
			return mfg_act_no();
		}
		if ($oper_inst_no.equalsIgnoreCase(name)) {
			return oper_inst_no();
		}
		if ($oper_act_no.equalsIgnoreCase(name)) {
			return oper_act_no();
		}
		if ($oper_usr_cd.equalsIgnoreCase(name)) {
			return oper_usr_cd();
		}
		if ($oper_usr_nm.equalsIgnoreCase(name)) {
			return oper_usr_nm();
		}
		if ($chd_itm_typ.equalsIgnoreCase(name)) {
			return chd_itm_typ();
		}
		if ($chd_itm_typ_nm.equalsIgnoreCase(name)) {
			return chd_itm_typ_nm();
		}
		if ($chd_itm_typ_d_cd.equalsIgnoreCase(name)) {
			return chd_itm_typ_d_cd();
		}
		if ($chd_itm_typ_d_nm.equalsIgnoreCase(name)) {
			return chd_itm_typ_d_nm();
		}
		if ($par_itm_typ.equalsIgnoreCase(name)) {
			return par_itm_typ();
		}
		if ($par_itm_typ_nm.equalsIgnoreCase(name)) {
			return par_itm_typ_nm();
		}
		if ($par_itm_typ_d_cd.equalsIgnoreCase(name)) {
			return par_itm_typ_d_cd();
		}
		if ($par_itm_typ_d_nm.equalsIgnoreCase(name)) {
			return par_itm_typ_d_nm();
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
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			return base_unit_dec_place();
		}
		if ($pr_rate.equalsIgnoreCase(name)) {
			return pr_rate();
		}
		if ($cont_fctr_dec_place.equalsIgnoreCase(name)) {
			return cont_fctr_dec_place();
		}
		if ($alt_grp_seq.equalsIgnoreCase(name)) {
			return alt_grp_seq();
		}
		if ($alt_alloc_prio.equalsIgnoreCase(name)) {
			return alt_alloc_prio();
		}
		if ($data_no.equalsIgnoreCase(name)) {
			return data_no();
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			return disp_seq();
		}
		if ($par_base_unit_dec_place.equalsIgnoreCase(name)) {
			return par_base_unit_dec_place();
		}
		if ($oper_unit_dec_place.equalsIgnoreCase(name)) {
			return oper_unit_dec_place();
		}
		if ($itm_yield.equalsIgnoreCase(name)) {
			return itm_yield();
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
		if ($oper_yield.equalsIgnoreCase(name)) {
			return oper_yield();
		}
		if ($oper_lower_yield.equalsIgnoreCase(name)) {
			return oper_lower_yield();
		}
		if ($oper_std_yield.equalsIgnoreCase(name)) {
			return oper_std_yield();
		}
		if ($oper_upper_yield.equalsIgnoreCase(name)) {
			return oper_upper_yield();
		}
		if ($div_seq.equalsIgnoreCase(name)) {
			return div_seq();
		}
		if ($oper_seq.equalsIgnoreCase(name)) {
			return oper_seq();
		}
		if ($oper_disp_seq.equalsIgnoreCase(name)) {
			return oper_disp_seq();
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
		return super.getTimestampNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($abort_flg.equalsIgnoreCase(name)) {
			return abort_flg();
		}
		if ($schd_abort_flg.equalsIgnoreCase(name)) {
			return schd_abort_flg();
		}
		if ($cont_fctr_flg.equalsIgnoreCase(name)) {
			return cont_fctr_flg();
		}
		if ($alt_itm_fix_flg.equalsIgnoreCase(name)) {
			return alt_itm_fix_flg();
		}
		if ($alloc_flg.equalsIgnoreCase(name)) {
			return alloc_flg();
		}
		if ($main_itm_flg.equalsIgnoreCase(name)) {
			return main_itm_flg();
		}
		if ($yield_calc_flg.equalsIgnoreCase(name)) {
			return yield_calc_flg();
		}
		if ($bkf_upd_flg.equalsIgnoreCase(name)) {
			return bkf_upd_flg();
		}
		if ($lot_mix_flg.equalsIgnoreCase(name)) {
			return lot_mix_flg();
		}
		if ($sublot_mix_flg.equalsIgnoreCase(name)) {
			return sublot_mix_flg();
		}
		if ($mfg_str_ln_cd_none_flg.equalsIgnoreCase(name)) {
			return mfg_str_ln_cd_none_flg();
		}
		if ($oper_str_ln_cd_none_flg.equalsIgnoreCase(name)) {
			return oper_str_ln_cd_none_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($inpt_mfg_sts_typ.equalsIgnoreCase(name)) {
			inpt_mfg_sts_typ(value);
			return;
		}
		if ($inpt_mfg_sts_typ_nm.equalsIgnoreCase(name)) {
			inpt_mfg_sts_typ_nm(value);
			return;
		}
		if ($mfg_mtd_typ.equalsIgnoreCase(name)) {
			mfg_mtd_typ(value);
			return;
		}
		if ($mfg_mtd_typ_nm.equalsIgnoreCase(name)) {
			mfg_mtd_typ_nm(value);
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
		if ($oper_cd.equalsIgnoreCase(name)) {
			oper_cd(value);
			return;
		}
		if ($oper_nm.equalsIgnoreCase(name)) {
			oper_nm(value);
			return;
		}
		if ($loss_rsn_cd.equalsIgnoreCase(name)) {
			loss_rsn_cd(value);
			return;
		}
		if ($loss_rsn_nm.equalsIgnoreCase(name)) {
			loss_rsn_nm(value);
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
		if ($inst_lot_no.equalsIgnoreCase(name)) {
			inst_lot_no(value);
			return;
		}
		if ($inst_sublot_no.equalsIgnoreCase(name)) {
			inst_sublot_no(value);
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
		if ($inpt_rsn_cd.equalsIgnoreCase(name)) {
			inpt_rsn_cd(value);
			return;
		}
		if ($inpt_rsn_nm.equalsIgnoreCase(name)) {
			inpt_rsn_nm(value);
			return;
		}
		if ($inpt_loc_cd.equalsIgnoreCase(name)) {
			inpt_loc_cd(value);
			return;
		}
		if ($inpt_loc_nm.equalsIgnoreCase(name)) {
			inpt_loc_nm(value);
			return;
		}
		if ($cont_fctr_rnd_typ.equalsIgnoreCase(name)) {
			cont_fctr_rnd_typ(value);
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
		if ($alt_grp_cd.equalsIgnoreCase(name)) {
			alt_grp_cd(value);
			return;
		}
		if ($alt_grp_nm.equalsIgnoreCase(name)) {
			alt_grp_nm(value);
			return;
		}
		if ($alt_itm_typ.equalsIgnoreCase(name)) {
			alt_itm_typ(value);
			return;
		}
		if ($alt_itm_typ_nm.equalsIgnoreCase(name)) {
			alt_itm_typ_nm(value);
			return;
		}
		if ($inpt_schd_no.equalsIgnoreCase(name)) {
			inpt_schd_no(value);
			return;
		}
		if ($inpt_act_no.equalsIgnoreCase(name)) {
			inpt_act_no(value);
			return;
		}
		if ($loss_act_no.equalsIgnoreCase(name)) {
			loss_act_no(value);
			return;
		}
		if ($mes_id.equalsIgnoreCase(name)) {
			mes_id(value);
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
		if ($ext_inpt_act_no.equalsIgnoreCase(name)) {
			ext_inpt_act_no(value);
			return;
		}
		if ($par_base_unit_cd.equalsIgnoreCase(name)) {
			par_base_unit_cd(value);
			return;
		}
		if ($par_base_unit_nm.equalsIgnoreCase(name)) {
			par_base_unit_nm(value);
			return;
		}
		if ($par_act_lot_no.equalsIgnoreCase(name)) {
			par_act_lot_no(value);
			return;
		}
		if ($par_act_sublot_no.equalsIgnoreCase(name)) {
			par_act_sublot_no(value);
			return;
		}
		if ($par_inst_lot_no.equalsIgnoreCase(name)) {
			par_inst_lot_no(value);
			return;
		}
		if ($par_inst_sublot_no.equalsIgnoreCase(name)) {
			par_inst_sublot_no(value);
			return;
		}
		if ($oper_mfg_sts_typ.equalsIgnoreCase(name)) {
			oper_mfg_sts_typ(value);
			return;
		}
		if ($oper_mfg_sts_typ_nm.equalsIgnoreCase(name)) {
			oper_mfg_sts_typ_nm(value);
			return;
		}
		if ($oper_unit_cd.equalsIgnoreCase(name)) {
			oper_unit_cd(value);
			return;
		}
		if ($oper_unit_nm.equalsIgnoreCase(name)) {
			oper_unit_nm(value);
			return;
		}
		if ($inpt_ctl_typ.equalsIgnoreCase(name)) {
			inpt_ctl_typ(value);
			return;
		}
		if ($inpt_ctl_typ_nm.equalsIgnoreCase(name)) {
			inpt_ctl_typ_nm(value);
			return;
		}
		if ($stk_mng_typ.equalsIgnoreCase(name)) {
			stk_mng_typ(value);
			return;
		}
		if ($stk_mng_typ_nm.equalsIgnoreCase(name)) {
			stk_mng_typ_nm(value);
			return;
		}
		if ($bkf_typ.equalsIgnoreCase(name)) {
			bkf_typ(value);
			return;
		}
		if ($bkf_typ_nm.equalsIgnoreCase(name)) {
			bkf_typ_nm(value);
			return;
		}
		if ($alloc_ctl_typ.equalsIgnoreCase(name)) {
			alloc_ctl_typ(value);
			return;
		}
		if ($alloc_ctl_typ_nm.equalsIgnoreCase(name)) {
			alloc_ctl_typ_nm(value);
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
		if ($stk_arrv_bp_cd.equalsIgnoreCase(name)) {
			stk_arrv_bp_cd(value);
			return;
		}
		if ($stk_arrv_bp_nm.equalsIgnoreCase(name)) {
			stk_arrv_bp_nm(value);
			return;
		}
		if ($acxfr_act_rsn_cd.equalsIgnoreCase(name)) {
			acxfr_act_rsn_cd(value);
			return;
		}
		if ($acxfr_act_rsn_nm.equalsIgnoreCase(name)) {
			acxfr_act_rsn_nm(value);
			return;
		}
		if ($acxfr_act_bd_dpt_cd.equalsIgnoreCase(name)) {
			acxfr_act_bd_dpt_cd(value);
			return;
		}
		if ($acxfr_act_bd_dpt_nm.equalsIgnoreCase(name)) {
			acxfr_act_bd_dpt_nm(value);
			return;
		}
		if ($inpt_schd_intr_rmrks.equalsIgnoreCase(name)) {
			inpt_schd_intr_rmrks(value);
			return;
		}
		if ($inpt_schd_inst_rpt_rmrks.equalsIgnoreCase(name)) {
			inpt_schd_inst_rpt_rmrks(value);
			return;
		}
		if ($inpt_schd_sub_char1.equalsIgnoreCase(name)) {
			inpt_schd_sub_char1(value);
			return;
		}
		if ($inpt_schd_sub_char2.equalsIgnoreCase(name)) {
			inpt_schd_sub_char2(value);
			return;
		}
		if ($inpt_schd_sub_char3.equalsIgnoreCase(name)) {
			inpt_schd_sub_char3(value);
			return;
		}
		if ($inpt_act_intr_rmrks.equalsIgnoreCase(name)) {
			inpt_act_intr_rmrks(value);
			return;
		}
		if ($inpt_act_rpt_rmrks.equalsIgnoreCase(name)) {
			inpt_act_rpt_rmrks(value);
			return;
		}
		if ($inpt_act_trd_rmrks.equalsIgnoreCase(name)) {
			inpt_act_trd_rmrks(value);
			return;
		}
		if ($inpt_act_sub_char1.equalsIgnoreCase(name)) {
			inpt_act_sub_char1(value);
			return;
		}
		if ($inpt_act_sub_char2.equalsIgnoreCase(name)) {
			inpt_act_sub_char2(value);
			return;
		}
		if ($inpt_act_sub_char3.equalsIgnoreCase(name)) {
			inpt_act_sub_char3(value);
			return;
		}
		if ($loss_act_intr_rmrks.equalsIgnoreCase(name)) {
			loss_act_intr_rmrks(value);
			return;
		}
		if ($loss_act_trd_rmrks.equalsIgnoreCase(name)) {
			loss_act_trd_rmrks(value);
			return;
		}
		if ($loss_act_sub_char1.equalsIgnoreCase(name)) {
			loss_act_sub_char1(value);
			return;
		}
		if ($loss_act_sub_char2.equalsIgnoreCase(name)) {
			loss_act_sub_char2(value);
			return;
		}
		if ($loss_act_sub_char3.equalsIgnoreCase(name)) {
			loss_act_sub_char3(value);
			return;
		}
		if ($mfg_act_rpt_rmrks.equalsIgnoreCase(name)) {
			mfg_act_rpt_rmrks(value);
			return;
		}
		if ($mfg_act_intr_rmrks.equalsIgnoreCase(name)) {
			mfg_act_intr_rmrks(value);
			return;
		}
		if ($mfg_act_sub_char1.equalsIgnoreCase(name)) {
			mfg_act_sub_char1(value);
			return;
		}
		if ($mfg_act_sub_char2.equalsIgnoreCase(name)) {
			mfg_act_sub_char2(value);
			return;
		}
		if ($mfg_act_sub_char3.equalsIgnoreCase(name)) {
			mfg_act_sub_char3(value);
			return;
		}
		if ($oper_act_intr_rmrks.equalsIgnoreCase(name)) {
			oper_act_intr_rmrks(value);
			return;
		}
		if ($oper_act_rpt_rmrks.equalsIgnoreCase(name)) {
			oper_act_rpt_rmrks(value);
			return;
		}
		if ($oper_act_sub_char1.equalsIgnoreCase(name)) {
			oper_act_sub_char1(value);
			return;
		}
		if ($oper_act_sub_char2.equalsIgnoreCase(name)) {
			oper_act_sub_char2(value);
			return;
		}
		if ($oper_act_sub_char3.equalsIgnoreCase(name)) {
			oper_act_sub_char3(value);
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
		if ($mfg_str_ln_cd.equalsIgnoreCase(name)) {
			mfg_str_ln_cd(value);
			return;
		}
		if ($mfg_str_ln_nm.equalsIgnoreCase(name)) {
			mfg_str_ln_nm(value);
			return;
		}
		if ($oper_loc_cd.equalsIgnoreCase(name)) {
			oper_loc_cd(value);
			return;
		}
		if ($oper_loc_nm.equalsIgnoreCase(name)) {
			oper_loc_nm(value);
			return;
		}
		if ($oper_str_ln_cd.equalsIgnoreCase(name)) {
			oper_str_ln_cd(value);
			return;
		}
		if ($oper_str_ln_nm.equalsIgnoreCase(name)) {
			oper_str_ln_nm(value);
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
		if ($site_cd.equalsIgnoreCase(name)) {
			site_cd(value);
			return;
		}
		if ($site_nm.equalsIgnoreCase(name)) {
			site_nm(value);
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
		if ($bom_ptn.equalsIgnoreCase(name)) {
			bom_ptn(value);
			return;
		}
		if ($oper_ptn.equalsIgnoreCase(name)) {
			oper_ptn(value);
			return;
		}
		if ($itm_ord_no.equalsIgnoreCase(name)) {
			itm_ord_no(value);
			return;
		}
		if ($mfg_inst_no.equalsIgnoreCase(name)) {
			mfg_inst_no(value);
			return;
		}
		if ($po_d_no.equalsIgnoreCase(name)) {
			po_d_no(value);
			return;
		}
		if ($mfg_act_no.equalsIgnoreCase(name)) {
			mfg_act_no(value);
			return;
		}
		if ($oper_inst_no.equalsIgnoreCase(name)) {
			oper_inst_no(value);
			return;
		}
		if ($oper_act_no.equalsIgnoreCase(name)) {
			oper_act_no(value);
			return;
		}
		if ($oper_usr_cd.equalsIgnoreCase(name)) {
			oper_usr_cd(value);
			return;
		}
		if ($oper_usr_nm.equalsIgnoreCase(name)) {
			oper_usr_nm(value);
			return;
		}
		if ($chd_itm_typ.equalsIgnoreCase(name)) {
			chd_itm_typ(value);
			return;
		}
		if ($chd_itm_typ_nm.equalsIgnoreCase(name)) {
			chd_itm_typ_nm(value);
			return;
		}
		if ($chd_itm_typ_d_cd.equalsIgnoreCase(name)) {
			chd_itm_typ_d_cd(value);
			return;
		}
		if ($chd_itm_typ_d_nm.equalsIgnoreCase(name)) {
			chd_itm_typ_d_nm(value);
			return;
		}
		if ($par_itm_typ.equalsIgnoreCase(name)) {
			par_itm_typ(value);
			return;
		}
		if ($par_itm_typ_nm.equalsIgnoreCase(name)) {
			par_itm_typ_nm(value);
			return;
		}
		if ($par_itm_typ_d_cd.equalsIgnoreCase(name)) {
			par_itm_typ_d_cd(value);
			return;
		}
		if ($par_itm_typ_d_nm.equalsIgnoreCase(name)) {
			par_itm_typ_d_nm(value);
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
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($pr_rate.equalsIgnoreCase(name)) {
			pr_rate(value);
			return;
		}
		if ($cont_fctr_dec_place.equalsIgnoreCase(name)) {
			cont_fctr_dec_place(value);
			return;
		}
		if ($alt_grp_seq.equalsIgnoreCase(name)) {
			alt_grp_seq(value);
			return;
		}
		if ($alt_alloc_prio.equalsIgnoreCase(name)) {
			alt_alloc_prio(value);
			return;
		}
		if ($data_no.equalsIgnoreCase(name)) {
			data_no(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($par_base_unit_dec_place.equalsIgnoreCase(name)) {
			par_base_unit_dec_place(value);
			return;
		}
		if ($oper_unit_dec_place.equalsIgnoreCase(name)) {
			oper_unit_dec_place(value);
			return;
		}
		if ($itm_yield.equalsIgnoreCase(name)) {
			itm_yield(value);
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
		if ($oper_yield.equalsIgnoreCase(name)) {
			oper_yield(value);
			return;
		}
		if ($oper_lower_yield.equalsIgnoreCase(name)) {
			oper_lower_yield(value);
			return;
		}
		if ($oper_std_yield.equalsIgnoreCase(name)) {
			oper_std_yield(value);
			return;
		}
		if ($oper_upper_yield.equalsIgnoreCase(name)) {
			oper_upper_yield(value);
			return;
		}
		if ($div_seq.equalsIgnoreCase(name)) {
			div_seq(value);
			return;
		}
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		if ($oper_disp_seq.equalsIgnoreCase(name)) {
			oper_disp_seq(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($pr_rate.equalsIgnoreCase(name)) {
			pr_rate(value);
			return;
		}
		if ($cont_fctr_dec_place.equalsIgnoreCase(name)) {
			cont_fctr_dec_place(value);
			return;
		}
		if ($alt_grp_seq.equalsIgnoreCase(name)) {
			alt_grp_seq(value);
			return;
		}
		if ($alt_alloc_prio.equalsIgnoreCase(name)) {
			alt_alloc_prio(value);
			return;
		}
		if ($data_no.equalsIgnoreCase(name)) {
			data_no(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($par_base_unit_dec_place.equalsIgnoreCase(name)) {
			par_base_unit_dec_place(value);
			return;
		}
		if ($oper_unit_dec_place.equalsIgnoreCase(name)) {
			oper_unit_dec_place(value);
			return;
		}
		if ($itm_yield.equalsIgnoreCase(name)) {
			itm_yield(value);
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
		if ($oper_yield.equalsIgnoreCase(name)) {
			oper_yield(value);
			return;
		}
		if ($oper_lower_yield.equalsIgnoreCase(name)) {
			oper_lower_yield(value);
			return;
		}
		if ($oper_std_yield.equalsIgnoreCase(name)) {
			oper_std_yield(value);
			return;
		}
		if ($oper_upper_yield.equalsIgnoreCase(name)) {
			oper_upper_yield(value);
			return;
		}
		if ($div_seq.equalsIgnoreCase(name)) {
			div_seq(value);
			return;
		}
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		if ($oper_disp_seq.equalsIgnoreCase(name)) {
			oper_disp_seq(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($pr_rate.equalsIgnoreCase(name)) {
			pr_rate(value);
			return;
		}
		if ($cont_fctr_dec_place.equalsIgnoreCase(name)) {
			cont_fctr_dec_place(value);
			return;
		}
		if ($alt_grp_seq.equalsIgnoreCase(name)) {
			alt_grp_seq(value);
			return;
		}
		if ($alt_alloc_prio.equalsIgnoreCase(name)) {
			alt_alloc_prio(value);
			return;
		}
		if ($data_no.equalsIgnoreCase(name)) {
			data_no(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($par_base_unit_dec_place.equalsIgnoreCase(name)) {
			par_base_unit_dec_place(value);
			return;
		}
		if ($oper_unit_dec_place.equalsIgnoreCase(name)) {
			oper_unit_dec_place(value);
			return;
		}
		if ($itm_yield.equalsIgnoreCase(name)) {
			itm_yield(value);
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
		if ($oper_yield.equalsIgnoreCase(name)) {
			oper_yield(value);
			return;
		}
		if ($oper_lower_yield.equalsIgnoreCase(name)) {
			oper_lower_yield(value);
			return;
		}
		if ($oper_std_yield.equalsIgnoreCase(name)) {
			oper_std_yield(value);
			return;
		}
		if ($oper_upper_yield.equalsIgnoreCase(name)) {
			oper_upper_yield(value);
			return;
		}
		if ($div_seq.equalsIgnoreCase(name)) {
			div_seq(value);
			return;
		}
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		if ($oper_disp_seq.equalsIgnoreCase(name)) {
			oper_disp_seq(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($pr_rate.equalsIgnoreCase(name)) {
			pr_rate(value);
			return;
		}
		if ($cont_fctr_dec_place.equalsIgnoreCase(name)) {
			cont_fctr_dec_place(value);
			return;
		}
		if ($alt_grp_seq.equalsIgnoreCase(name)) {
			alt_grp_seq(value);
			return;
		}
		if ($alt_alloc_prio.equalsIgnoreCase(name)) {
			alt_alloc_prio(value);
			return;
		}
		if ($data_no.equalsIgnoreCase(name)) {
			data_no(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($par_base_unit_dec_place.equalsIgnoreCase(name)) {
			par_base_unit_dec_place(value);
			return;
		}
		if ($oper_unit_dec_place.equalsIgnoreCase(name)) {
			oper_unit_dec_place(value);
			return;
		}
		if ($itm_yield.equalsIgnoreCase(name)) {
			itm_yield(value);
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
		if ($oper_yield.equalsIgnoreCase(name)) {
			oper_yield(value);
			return;
		}
		if ($oper_lower_yield.equalsIgnoreCase(name)) {
			oper_lower_yield(value);
			return;
		}
		if ($oper_std_yield.equalsIgnoreCase(name)) {
			oper_std_yield(value);
			return;
		}
		if ($oper_upper_yield.equalsIgnoreCase(name)) {
			oper_upper_yield(value);
			return;
		}
		if ($div_seq.equalsIgnoreCase(name)) {
			div_seq(value);
			return;
		}
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		if ($oper_disp_seq.equalsIgnoreCase(name)) {
			oper_disp_seq(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($pr_rate.equalsIgnoreCase(name)) {
			pr_rate(value);
			return;
		}
		if ($cont_fctr_dec_place.equalsIgnoreCase(name)) {
			cont_fctr_dec_place(value);
			return;
		}
		if ($alt_grp_seq.equalsIgnoreCase(name)) {
			alt_grp_seq(value);
			return;
		}
		if ($alt_alloc_prio.equalsIgnoreCase(name)) {
			alt_alloc_prio(value);
			return;
		}
		if ($data_no.equalsIgnoreCase(name)) {
			data_no(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($par_base_unit_dec_place.equalsIgnoreCase(name)) {
			par_base_unit_dec_place(value);
			return;
		}
		if ($oper_unit_dec_place.equalsIgnoreCase(name)) {
			oper_unit_dec_place(value);
			return;
		}
		if ($itm_yield.equalsIgnoreCase(name)) {
			itm_yield(value);
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
		if ($oper_yield.equalsIgnoreCase(name)) {
			oper_yield(value);
			return;
		}
		if ($oper_lower_yield.equalsIgnoreCase(name)) {
			oper_lower_yield(value);
			return;
		}
		if ($oper_std_yield.equalsIgnoreCase(name)) {
			oper_std_yield(value);
			return;
		}
		if ($oper_upper_yield.equalsIgnoreCase(name)) {
			oper_upper_yield(value);
			return;
		}
		if ($div_seq.equalsIgnoreCase(name)) {
			div_seq(value);
			return;
		}
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		if ($oper_disp_seq.equalsIgnoreCase(name)) {
			oper_disp_seq(value);
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
		super.setTimestamp(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($abort_flg.equalsIgnoreCase(name)) {
			abort_flg(value);
			return;
		}
		if ($schd_abort_flg.equalsIgnoreCase(name)) {
			schd_abort_flg(value);
			return;
		}
		if ($cont_fctr_flg.equalsIgnoreCase(name)) {
			cont_fctr_flg(value);
			return;
		}
		if ($alt_itm_fix_flg.equalsIgnoreCase(name)) {
			alt_itm_fix_flg(value);
			return;
		}
		if ($alloc_flg.equalsIgnoreCase(name)) {
			alloc_flg(value);
			return;
		}
		if ($main_itm_flg.equalsIgnoreCase(name)) {
			main_itm_flg(value);
			return;
		}
		if ($yield_calc_flg.equalsIgnoreCase(name)) {
			yield_calc_flg(value);
			return;
		}
		if ($bkf_upd_flg.equalsIgnoreCase(name)) {
			bkf_upd_flg(value);
			return;
		}
		if ($lot_mix_flg.equalsIgnoreCase(name)) {
			lot_mix_flg(value);
			return;
		}
		if ($sublot_mix_flg.equalsIgnoreCase(name)) {
			sublot_mix_flg(value);
			return;
		}
		if ($mfg_str_ln_cd_none_flg.equalsIgnoreCase(name)) {
			mfg_str_ln_cd_none_flg(value);
			return;
		}
		if ($oper_str_ln_cd_none_flg.equalsIgnoreCase(name)) {
			oper_str_ln_cd_none_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($inpt_mfg_sts_typ.equalsIgnoreCase(name)) {
			inpt_mfg_sts_typ(value);
			return;
		}
		if ($inpt_mfg_sts_typ_nm.equalsIgnoreCase(name)) {
			inpt_mfg_sts_typ_nm(value);
			return;
		}
		if ($mfg_mtd_typ.equalsIgnoreCase(name)) {
			mfg_mtd_typ(value);
			return;
		}
		if ($mfg_mtd_typ_nm.equalsIgnoreCase(name)) {
			mfg_mtd_typ_nm(value);
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
		if ($oper_cd.equalsIgnoreCase(name)) {
			oper_cd(value);
			return;
		}
		if ($oper_nm.equalsIgnoreCase(name)) {
			oper_nm(value);
			return;
		}
		if ($loss_rsn_cd.equalsIgnoreCase(name)) {
			loss_rsn_cd(value);
			return;
		}
		if ($loss_rsn_nm.equalsIgnoreCase(name)) {
			loss_rsn_nm(value);
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
		if ($inst_lot_no.equalsIgnoreCase(name)) {
			inst_lot_no(value);
			return;
		}
		if ($inst_sublot_no.equalsIgnoreCase(name)) {
			inst_sublot_no(value);
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
		if ($inpt_rsn_cd.equalsIgnoreCase(name)) {
			inpt_rsn_cd(value);
			return;
		}
		if ($inpt_rsn_nm.equalsIgnoreCase(name)) {
			inpt_rsn_nm(value);
			return;
		}
		if ($inpt_loc_cd.equalsIgnoreCase(name)) {
			inpt_loc_cd(value);
			return;
		}
		if ($inpt_loc_nm.equalsIgnoreCase(name)) {
			inpt_loc_nm(value);
			return;
		}
		if ($cont_fctr_rnd_typ.equalsIgnoreCase(name)) {
			cont_fctr_rnd_typ(value);
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
		if ($alt_grp_cd.equalsIgnoreCase(name)) {
			alt_grp_cd(value);
			return;
		}
		if ($alt_grp_nm.equalsIgnoreCase(name)) {
			alt_grp_nm(value);
			return;
		}
		if ($alt_itm_typ.equalsIgnoreCase(name)) {
			alt_itm_typ(value);
			return;
		}
		if ($alt_itm_typ_nm.equalsIgnoreCase(name)) {
			alt_itm_typ_nm(value);
			return;
		}
		if ($inpt_schd_no.equalsIgnoreCase(name)) {
			inpt_schd_no(value);
			return;
		}
		if ($inpt_act_no.equalsIgnoreCase(name)) {
			inpt_act_no(value);
			return;
		}
		if ($loss_act_no.equalsIgnoreCase(name)) {
			loss_act_no(value);
			return;
		}
		if ($mes_id.equalsIgnoreCase(name)) {
			mes_id(value);
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
		if ($ext_inpt_act_no.equalsIgnoreCase(name)) {
			ext_inpt_act_no(value);
			return;
		}
		if ($par_base_unit_cd.equalsIgnoreCase(name)) {
			par_base_unit_cd(value);
			return;
		}
		if ($par_base_unit_nm.equalsIgnoreCase(name)) {
			par_base_unit_nm(value);
			return;
		}
		if ($par_act_lot_no.equalsIgnoreCase(name)) {
			par_act_lot_no(value);
			return;
		}
		if ($par_act_sublot_no.equalsIgnoreCase(name)) {
			par_act_sublot_no(value);
			return;
		}
		if ($par_inst_lot_no.equalsIgnoreCase(name)) {
			par_inst_lot_no(value);
			return;
		}
		if ($par_inst_sublot_no.equalsIgnoreCase(name)) {
			par_inst_sublot_no(value);
			return;
		}
		if ($oper_mfg_sts_typ.equalsIgnoreCase(name)) {
			oper_mfg_sts_typ(value);
			return;
		}
		if ($oper_mfg_sts_typ_nm.equalsIgnoreCase(name)) {
			oper_mfg_sts_typ_nm(value);
			return;
		}
		if ($oper_unit_cd.equalsIgnoreCase(name)) {
			oper_unit_cd(value);
			return;
		}
		if ($oper_unit_nm.equalsIgnoreCase(name)) {
			oper_unit_nm(value);
			return;
		}
		if ($inpt_ctl_typ.equalsIgnoreCase(name)) {
			inpt_ctl_typ(value);
			return;
		}
		if ($inpt_ctl_typ_nm.equalsIgnoreCase(name)) {
			inpt_ctl_typ_nm(value);
			return;
		}
		if ($stk_mng_typ.equalsIgnoreCase(name)) {
			stk_mng_typ(value);
			return;
		}
		if ($stk_mng_typ_nm.equalsIgnoreCase(name)) {
			stk_mng_typ_nm(value);
			return;
		}
		if ($bkf_typ.equalsIgnoreCase(name)) {
			bkf_typ(value);
			return;
		}
		if ($bkf_typ_nm.equalsIgnoreCase(name)) {
			bkf_typ_nm(value);
			return;
		}
		if ($alloc_ctl_typ.equalsIgnoreCase(name)) {
			alloc_ctl_typ(value);
			return;
		}
		if ($alloc_ctl_typ_nm.equalsIgnoreCase(name)) {
			alloc_ctl_typ_nm(value);
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
		if ($stk_arrv_bp_cd.equalsIgnoreCase(name)) {
			stk_arrv_bp_cd(value);
			return;
		}
		if ($stk_arrv_bp_nm.equalsIgnoreCase(name)) {
			stk_arrv_bp_nm(value);
			return;
		}
		if ($acxfr_act_rsn_cd.equalsIgnoreCase(name)) {
			acxfr_act_rsn_cd(value);
			return;
		}
		if ($acxfr_act_rsn_nm.equalsIgnoreCase(name)) {
			acxfr_act_rsn_nm(value);
			return;
		}
		if ($acxfr_act_bd_dpt_cd.equalsIgnoreCase(name)) {
			acxfr_act_bd_dpt_cd(value);
			return;
		}
		if ($acxfr_act_bd_dpt_nm.equalsIgnoreCase(name)) {
			acxfr_act_bd_dpt_nm(value);
			return;
		}
		if ($inpt_schd_intr_rmrks.equalsIgnoreCase(name)) {
			inpt_schd_intr_rmrks(value);
			return;
		}
		if ($inpt_schd_inst_rpt_rmrks.equalsIgnoreCase(name)) {
			inpt_schd_inst_rpt_rmrks(value);
			return;
		}
		if ($inpt_schd_sub_char1.equalsIgnoreCase(name)) {
			inpt_schd_sub_char1(value);
			return;
		}
		if ($inpt_schd_sub_char2.equalsIgnoreCase(name)) {
			inpt_schd_sub_char2(value);
			return;
		}
		if ($inpt_schd_sub_char3.equalsIgnoreCase(name)) {
			inpt_schd_sub_char3(value);
			return;
		}
		if ($inpt_act_intr_rmrks.equalsIgnoreCase(name)) {
			inpt_act_intr_rmrks(value);
			return;
		}
		if ($inpt_act_rpt_rmrks.equalsIgnoreCase(name)) {
			inpt_act_rpt_rmrks(value);
			return;
		}
		if ($inpt_act_trd_rmrks.equalsIgnoreCase(name)) {
			inpt_act_trd_rmrks(value);
			return;
		}
		if ($inpt_act_sub_char1.equalsIgnoreCase(name)) {
			inpt_act_sub_char1(value);
			return;
		}
		if ($inpt_act_sub_char2.equalsIgnoreCase(name)) {
			inpt_act_sub_char2(value);
			return;
		}
		if ($inpt_act_sub_char3.equalsIgnoreCase(name)) {
			inpt_act_sub_char3(value);
			return;
		}
		if ($loss_act_intr_rmrks.equalsIgnoreCase(name)) {
			loss_act_intr_rmrks(value);
			return;
		}
		if ($loss_act_trd_rmrks.equalsIgnoreCase(name)) {
			loss_act_trd_rmrks(value);
			return;
		}
		if ($loss_act_sub_char1.equalsIgnoreCase(name)) {
			loss_act_sub_char1(value);
			return;
		}
		if ($loss_act_sub_char2.equalsIgnoreCase(name)) {
			loss_act_sub_char2(value);
			return;
		}
		if ($loss_act_sub_char3.equalsIgnoreCase(name)) {
			loss_act_sub_char3(value);
			return;
		}
		if ($mfg_act_rpt_rmrks.equalsIgnoreCase(name)) {
			mfg_act_rpt_rmrks(value);
			return;
		}
		if ($mfg_act_intr_rmrks.equalsIgnoreCase(name)) {
			mfg_act_intr_rmrks(value);
			return;
		}
		if ($mfg_act_sub_char1.equalsIgnoreCase(name)) {
			mfg_act_sub_char1(value);
			return;
		}
		if ($mfg_act_sub_char2.equalsIgnoreCase(name)) {
			mfg_act_sub_char2(value);
			return;
		}
		if ($mfg_act_sub_char3.equalsIgnoreCase(name)) {
			mfg_act_sub_char3(value);
			return;
		}
		if ($oper_act_intr_rmrks.equalsIgnoreCase(name)) {
			oper_act_intr_rmrks(value);
			return;
		}
		if ($oper_act_rpt_rmrks.equalsIgnoreCase(name)) {
			oper_act_rpt_rmrks(value);
			return;
		}
		if ($oper_act_sub_char1.equalsIgnoreCase(name)) {
			oper_act_sub_char1(value);
			return;
		}
		if ($oper_act_sub_char2.equalsIgnoreCase(name)) {
			oper_act_sub_char2(value);
			return;
		}
		if ($oper_act_sub_char3.equalsIgnoreCase(name)) {
			oper_act_sub_char3(value);
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
		if ($mfg_str_ln_cd.equalsIgnoreCase(name)) {
			mfg_str_ln_cd(value);
			return;
		}
		if ($mfg_str_ln_nm.equalsIgnoreCase(name)) {
			mfg_str_ln_nm(value);
			return;
		}
		if ($oper_loc_cd.equalsIgnoreCase(name)) {
			oper_loc_cd(value);
			return;
		}
		if ($oper_loc_nm.equalsIgnoreCase(name)) {
			oper_loc_nm(value);
			return;
		}
		if ($oper_str_ln_cd.equalsIgnoreCase(name)) {
			oper_str_ln_cd(value);
			return;
		}
		if ($oper_str_ln_nm.equalsIgnoreCase(name)) {
			oper_str_ln_nm(value);
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
		if ($site_cd.equalsIgnoreCase(name)) {
			site_cd(value);
			return;
		}
		if ($site_nm.equalsIgnoreCase(name)) {
			site_nm(value);
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
		if ($bom_ptn.equalsIgnoreCase(name)) {
			bom_ptn(value);
			return;
		}
		if ($oper_ptn.equalsIgnoreCase(name)) {
			oper_ptn(value);
			return;
		}
		if ($itm_ord_no.equalsIgnoreCase(name)) {
			itm_ord_no(value);
			return;
		}
		if ($mfg_inst_no.equalsIgnoreCase(name)) {
			mfg_inst_no(value);
			return;
		}
		if ($po_d_no.equalsIgnoreCase(name)) {
			po_d_no(value);
			return;
		}
		if ($mfg_act_no.equalsIgnoreCase(name)) {
			mfg_act_no(value);
			return;
		}
		if ($oper_inst_no.equalsIgnoreCase(name)) {
			oper_inst_no(value);
			return;
		}
		if ($oper_act_no.equalsIgnoreCase(name)) {
			oper_act_no(value);
			return;
		}
		if ($oper_usr_cd.equalsIgnoreCase(name)) {
			oper_usr_cd(value);
			return;
		}
		if ($oper_usr_nm.equalsIgnoreCase(name)) {
			oper_usr_nm(value);
			return;
		}
		if ($chd_itm_typ.equalsIgnoreCase(name)) {
			chd_itm_typ(value);
			return;
		}
		if ($chd_itm_typ_nm.equalsIgnoreCase(name)) {
			chd_itm_typ_nm(value);
			return;
		}
		if ($chd_itm_typ_d_cd.equalsIgnoreCase(name)) {
			chd_itm_typ_d_cd(value);
			return;
		}
		if ($chd_itm_typ_d_nm.equalsIgnoreCase(name)) {
			chd_itm_typ_d_nm(value);
			return;
		}
		if ($par_itm_typ.equalsIgnoreCase(name)) {
			par_itm_typ(value);
			return;
		}
		if ($par_itm_typ_nm.equalsIgnoreCase(name)) {
			par_itm_typ_nm(value);
			return;
		}
		if ($par_itm_typ_d_cd.equalsIgnoreCase(name)) {
			par_itm_typ_d_cd(value);
			return;
		}
		if ($par_itm_typ_d_nm.equalsIgnoreCase(name)) {
			par_itm_typ_d_nm(value);
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
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($pr_rate.equalsIgnoreCase(name)) {
			pr_rate(value);
			return;
		}
		if ($cont_fctr_dec_place.equalsIgnoreCase(name)) {
			cont_fctr_dec_place(value);
			return;
		}
		if ($alt_grp_seq.equalsIgnoreCase(name)) {
			alt_grp_seq(value);
			return;
		}
		if ($alt_alloc_prio.equalsIgnoreCase(name)) {
			alt_alloc_prio(value);
			return;
		}
		if ($data_no.equalsIgnoreCase(name)) {
			data_no(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($par_base_unit_dec_place.equalsIgnoreCase(name)) {
			par_base_unit_dec_place(value);
			return;
		}
		if ($oper_unit_dec_place.equalsIgnoreCase(name)) {
			oper_unit_dec_place(value);
			return;
		}
		if ($itm_yield.equalsIgnoreCase(name)) {
			itm_yield(value);
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
		if ($oper_yield.equalsIgnoreCase(name)) {
			oper_yield(value);
			return;
		}
		if ($oper_lower_yield.equalsIgnoreCase(name)) {
			oper_lower_yield(value);
			return;
		}
		if ($oper_std_yield.equalsIgnoreCase(name)) {
			oper_std_yield(value);
			return;
		}
		if ($oper_upper_yield.equalsIgnoreCase(name)) {
			oper_upper_yield(value);
			return;
		}
		if ($div_seq.equalsIgnoreCase(name)) {
			div_seq(value);
			return;
		}
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		if ($oper_disp_seq.equalsIgnoreCase(name)) {
			oper_disp_seq(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($pr_rate.equalsIgnoreCase(name)) {
			pr_rate(value);
			return;
		}
		if ($cont_fctr_dec_place.equalsIgnoreCase(name)) {
			cont_fctr_dec_place(value);
			return;
		}
		if ($alt_grp_seq.equalsIgnoreCase(name)) {
			alt_grp_seq(value);
			return;
		}
		if ($alt_alloc_prio.equalsIgnoreCase(name)) {
			alt_alloc_prio(value);
			return;
		}
		if ($data_no.equalsIgnoreCase(name)) {
			data_no(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($par_base_unit_dec_place.equalsIgnoreCase(name)) {
			par_base_unit_dec_place(value);
			return;
		}
		if ($oper_unit_dec_place.equalsIgnoreCase(name)) {
			oper_unit_dec_place(value);
			return;
		}
		if ($itm_yield.equalsIgnoreCase(name)) {
			itm_yield(value);
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
		if ($oper_yield.equalsIgnoreCase(name)) {
			oper_yield(value);
			return;
		}
		if ($oper_lower_yield.equalsIgnoreCase(name)) {
			oper_lower_yield(value);
			return;
		}
		if ($oper_std_yield.equalsIgnoreCase(name)) {
			oper_std_yield(value);
			return;
		}
		if ($oper_upper_yield.equalsIgnoreCase(name)) {
			oper_upper_yield(value);
			return;
		}
		if ($div_seq.equalsIgnoreCase(name)) {
			div_seq(value);
			return;
		}
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		if ($oper_disp_seq.equalsIgnoreCase(name)) {
			oper_disp_seq(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($pr_rate.equalsIgnoreCase(name)) {
			pr_rate(value);
			return;
		}
		if ($cont_fctr_dec_place.equalsIgnoreCase(name)) {
			cont_fctr_dec_place(value);
			return;
		}
		if ($alt_grp_seq.equalsIgnoreCase(name)) {
			alt_grp_seq(value);
			return;
		}
		if ($alt_alloc_prio.equalsIgnoreCase(name)) {
			alt_alloc_prio(value);
			return;
		}
		if ($data_no.equalsIgnoreCase(name)) {
			data_no(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($par_base_unit_dec_place.equalsIgnoreCase(name)) {
			par_base_unit_dec_place(value);
			return;
		}
		if ($oper_unit_dec_place.equalsIgnoreCase(name)) {
			oper_unit_dec_place(value);
			return;
		}
		if ($itm_yield.equalsIgnoreCase(name)) {
			itm_yield(value);
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
		if ($oper_yield.equalsIgnoreCase(name)) {
			oper_yield(value);
			return;
		}
		if ($oper_lower_yield.equalsIgnoreCase(name)) {
			oper_lower_yield(value);
			return;
		}
		if ($oper_std_yield.equalsIgnoreCase(name)) {
			oper_std_yield(value);
			return;
		}
		if ($oper_upper_yield.equalsIgnoreCase(name)) {
			oper_upper_yield(value);
			return;
		}
		if ($div_seq.equalsIgnoreCase(name)) {
			div_seq(value);
			return;
		}
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		if ($oper_disp_seq.equalsIgnoreCase(name)) {
			oper_disp_seq(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($pr_rate.equalsIgnoreCase(name)) {
			pr_rate(value);
			return;
		}
		if ($cont_fctr_dec_place.equalsIgnoreCase(name)) {
			cont_fctr_dec_place(value);
			return;
		}
		if ($alt_grp_seq.equalsIgnoreCase(name)) {
			alt_grp_seq(value);
			return;
		}
		if ($alt_alloc_prio.equalsIgnoreCase(name)) {
			alt_alloc_prio(value);
			return;
		}
		if ($data_no.equalsIgnoreCase(name)) {
			data_no(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($par_base_unit_dec_place.equalsIgnoreCase(name)) {
			par_base_unit_dec_place(value);
			return;
		}
		if ($oper_unit_dec_place.equalsIgnoreCase(name)) {
			oper_unit_dec_place(value);
			return;
		}
		if ($itm_yield.equalsIgnoreCase(name)) {
			itm_yield(value);
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
		if ($oper_yield.equalsIgnoreCase(name)) {
			oper_yield(value);
			return;
		}
		if ($oper_lower_yield.equalsIgnoreCase(name)) {
			oper_lower_yield(value);
			return;
		}
		if ($oper_std_yield.equalsIgnoreCase(name)) {
			oper_std_yield(value);
			return;
		}
		if ($oper_upper_yield.equalsIgnoreCase(name)) {
			oper_upper_yield(value);
			return;
		}
		if ($div_seq.equalsIgnoreCase(name)) {
			div_seq(value);
			return;
		}
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		if ($oper_disp_seq.equalsIgnoreCase(name)) {
			oper_disp_seq(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($pr_rate.equalsIgnoreCase(name)) {
			pr_rate(value);
			return;
		}
		if ($cont_fctr_dec_place.equalsIgnoreCase(name)) {
			cont_fctr_dec_place(value);
			return;
		}
		if ($alt_grp_seq.equalsIgnoreCase(name)) {
			alt_grp_seq(value);
			return;
		}
		if ($alt_alloc_prio.equalsIgnoreCase(name)) {
			alt_alloc_prio(value);
			return;
		}
		if ($data_no.equalsIgnoreCase(name)) {
			data_no(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($par_base_unit_dec_place.equalsIgnoreCase(name)) {
			par_base_unit_dec_place(value);
			return;
		}
		if ($oper_unit_dec_place.equalsIgnoreCase(name)) {
			oper_unit_dec_place(value);
			return;
		}
		if ($itm_yield.equalsIgnoreCase(name)) {
			itm_yield(value);
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
		if ($oper_yield.equalsIgnoreCase(name)) {
			oper_yield(value);
			return;
		}
		if ($oper_lower_yield.equalsIgnoreCase(name)) {
			oper_lower_yield(value);
			return;
		}
		if ($oper_std_yield.equalsIgnoreCase(name)) {
			oper_std_yield(value);
			return;
		}
		if ($oper_upper_yield.equalsIgnoreCase(name)) {
			oper_upper_yield(value);
			return;
		}
		if ($div_seq.equalsIgnoreCase(name)) {
			div_seq(value);
			return;
		}
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		if ($oper_disp_seq.equalsIgnoreCase(name)) {
			oper_disp_seq(value);
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
		super.setTimestampNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($abort_flg.equalsIgnoreCase(name)) {
			abort_flg(value);
			return;
		}
		if ($schd_abort_flg.equalsIgnoreCase(name)) {
			schd_abort_flg(value);
			return;
		}
		if ($cont_fctr_flg.equalsIgnoreCase(name)) {
			cont_fctr_flg(value);
			return;
		}
		if ($alt_itm_fix_flg.equalsIgnoreCase(name)) {
			alt_itm_fix_flg(value);
			return;
		}
		if ($alloc_flg.equalsIgnoreCase(name)) {
			alloc_flg(value);
			return;
		}
		if ($main_itm_flg.equalsIgnoreCase(name)) {
			main_itm_flg(value);
			return;
		}
		if ($yield_calc_flg.equalsIgnoreCase(name)) {
			yield_calc_flg(value);
			return;
		}
		if ($bkf_upd_flg.equalsIgnoreCase(name)) {
			bkf_upd_flg(value);
			return;
		}
		if ($lot_mix_flg.equalsIgnoreCase(name)) {
			lot_mix_flg(value);
			return;
		}
		if ($sublot_mix_flg.equalsIgnoreCase(name)) {
			sublot_mix_flg(value);
			return;
		}
		if ($mfg_str_ln_cd_none_flg.equalsIgnoreCase(name)) {
			mfg_str_ln_cd_none_flg(value);
			return;
		}
		if ($oper_str_ln_cd_none_flg.equalsIgnoreCase(name)) {
			oper_str_ln_cd_none_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}

	public MCRow getInnerRow(String name) {
		if ($chd_itm_p.equalsIgnoreCase(name)) {
			return chd_itm_p();
		}
		if ($ver_no_p.equalsIgnoreCase(name)) {
			return ver_no_p();
		}
		if ($inpt_qty_p.equalsIgnoreCase(name)) {
			return inpt_qty_p();
		}
		if ($loss_qty_p.equalsIgnoreCase(name)) {
			return loss_qty_p();
		}
		if ($sum_loss_qty_p.equalsIgnoreCase(name)) {
			return sum_loss_qty_p();
		}
		if ($sum_fxd_loss_qty_p.equalsIgnoreCase(name)) {
			return sum_fxd_loss_qty_p();
		}
		if ($inpt_rem_qty_p.equalsIgnoreCase(name)) {
			return inpt_rem_qty_p();
		}
		if ($schd_inpt_qty_p.equalsIgnoreCase(name)) {
			return schd_inpt_qty_p();
		}
		if ($schd_rqmt_qty_p.equalsIgnoreCase(name)) {
			return schd_rqmt_qty_p();
		}
		if ($schd_fxd_rqmt_qty_p.equalsIgnoreCase(name)) {
			return schd_fxd_rqmt_qty_p();
		}
		if ($lot_no_p.equalsIgnoreCase(name)) {
			return lot_no_p();
		}
		if ($act_tm_p.equalsIgnoreCase(name)) {
			return act_tm_p();
		}
		if ($ac_dt_p.equalsIgnoreCase(name)) {
			return ac_dt_p();
		}
		if ($schd_tm_p.equalsIgnoreCase(name)) {
			return schd_tm_p();
		}
		if ($sno_p.equalsIgnoreCase(name)) {
			return sno_p();
		}
		if ($inpt_str_ln_p.equalsIgnoreCase(name)) {
			return inpt_str_ln_p();
		}
		if ($act_cont_fctr_p.equalsIgnoreCase(name)) {
			return act_cont_fctr_p();
		}
		if ($cont_fctr_unit_cd_p.equalsIgnoreCase(name)) {
			return cont_fctr_unit_cd_p();
		}
		if ($std_cont_fctr_p.equalsIgnoreCase(name)) {
			return std_cont_fctr_p();
		}
		if ($cont_inpt_qty_p.equalsIgnoreCase(name)) {
			return cont_inpt_qty_p();
		}
		if ($cont_loss_qty_p.equalsIgnoreCase(name)) {
			return cont_loss_qty_p();
		}
		if ($cont_fxd_loss_qty_p.equalsIgnoreCase(name)) {
			return cont_fxd_loss_qty_p();
		}
		if ($cont_schd_inpt_qty_p.equalsIgnoreCase(name)) {
			return cont_schd_inpt_qty_p();
		}
		if ($cont_schd_rqmt_qty_p.equalsIgnoreCase(name)) {
			return cont_schd_rqmt_qty_p();
		}
		if ($cont_schd_fxd_rqmt_qty_p.equalsIgnoreCase(name)) {
			return cont_schd_fxd_rqmt_qty_p();
		}
		if ($par_itm_p.equalsIgnoreCase(name)) {
			return par_itm_p();
		}
		if ($st_act_p.equalsIgnoreCase(name)) {
			return st_act_p();
		}
		if ($st_ac_dt_p.equalsIgnoreCase(name)) {
			return st_ac_dt_p();
		}
		if ($end_act_p.equalsIgnoreCase(name)) {
			return end_act_p();
		}
		if ($end_ac_dt_p.equalsIgnoreCase(name)) {
			return end_ac_dt_p();
		}
		if ($base_unit_mfg_inst_qty_p.equalsIgnoreCase(name)) {
			return base_unit_mfg_inst_qty_p();
		}
		if ($base_unit_yield_schd_qty_p.equalsIgnoreCase(name)) {
			return base_unit_yield_schd_qty_p();
		}
		if ($base_unit_st_act_qty_p.equalsIgnoreCase(name)) {
			return base_unit_st_act_qty_p();
		}
		if ($base_unit_yield_qty_p.equalsIgnoreCase(name)) {
			return base_unit_yield_qty_p();
		}
		if ($base_unit_dfct_qty_p.equalsIgnoreCase(name)) {
			return base_unit_dfct_qty_p();
		}
		if ($oper_unit_act_qty_p.equalsIgnoreCase(name)) {
			return oper_unit_act_qty_p();
		}
		if ($oper_unit_schd_qty_p.equalsIgnoreCase(name)) {
			return oper_unit_schd_qty_p();
		}
		if ($par_sno_p.equalsIgnoreCase(name)) {
			return par_sno_p();
		}
		if ($inst_ver_no_p.equalsIgnoreCase(name)) {
			return inst_ver_no_p();
		}
		if ($acxfr_act_qty_p.equalsIgnoreCase(name)) {
			return acxfr_act_qty_p();
		}
		if ($cont_acxfr_act_qty_p.equalsIgnoreCase(name)) {
			return cont_acxfr_act_qty_p();
		}
		if ($chd_itm_grp_p.equalsIgnoreCase(name)) {
			return chd_itm_grp_p();
		}
		if ($par_itm_grp_p.equalsIgnoreCase(name)) {
			return par_itm_grp_p();
		}
		return super.getInnerRow(name);
	}

	public void setInnerRow(String name, MCRow value) {
		if ($chd_itm_p.equalsIgnoreCase(name)) {
			chd_itm_p(
				((MCContainerMeta) chd_itm_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5030.ItmR.class, value)
			);
			return;
		}
		if ($ver_no_p.equalsIgnoreCase(name)) {
			ver_no_p(
				((MCContainerMeta) ver_no_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5250.VerNoR.class, value)
			);
			return;
		}
		if ($inpt_qty_p.equalsIgnoreCase(name)) {
			inpt_qty_p(
				((MCContainerMeta) inpt_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($loss_qty_p.equalsIgnoreCase(name)) {
			loss_qty_p(
				((MCContainerMeta) loss_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($sum_loss_qty_p.equalsIgnoreCase(name)) {
			sum_loss_qty_p(
				((MCContainerMeta) sum_loss_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($sum_fxd_loss_qty_p.equalsIgnoreCase(name)) {
			sum_fxd_loss_qty_p(
				((MCContainerMeta) sum_fxd_loss_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($inpt_rem_qty_p.equalsIgnoreCase(name)) {
			inpt_rem_qty_p(
				((MCContainerMeta) inpt_rem_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($schd_inpt_qty_p.equalsIgnoreCase(name)) {
			schd_inpt_qty_p(
				((MCContainerMeta) schd_inpt_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($schd_rqmt_qty_p.equalsIgnoreCase(name)) {
			schd_rqmt_qty_p(
				((MCContainerMeta) schd_rqmt_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($schd_fxd_rqmt_qty_p.equalsIgnoreCase(name)) {
			schd_fxd_rqmt_qty_p(
				((MCContainerMeta) schd_fxd_rqmt_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($lot_no_p.equalsIgnoreCase(name)) {
			lot_no_p(
				((MCContainerMeta) lot_no_p_META).castInnerRow(mcframe.clientMSUB.MSUBP5030.LotNoR.class, value)
			);
			return;
		}
		if ($act_tm_p.equalsIgnoreCase(name)) {
			act_tm_p(
				((MCContainerMeta) act_tm_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5320.YmdHmR.class, value)
			);
			return;
		}
		if ($ac_dt_p.equalsIgnoreCase(name)) {
			ac_dt_p(
				((MCContainerMeta) ac_dt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5220.AcDtR.class, value)
			);
			return;
		}
		if ($schd_tm_p.equalsIgnoreCase(name)) {
			schd_tm_p(
				((MCContainerMeta) schd_tm_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5320.YmdHmR.class, value)
			);
			return;
		}
		if ($sno_p.equalsIgnoreCase(name)) {
			sno_p(
				((MCContainerMeta) sno_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5070.SnoR.class, value)
			);
			return;
		}
		if ($inpt_str_ln_p.equalsIgnoreCase(name)) {
			inpt_str_ln_p(
				((MCContainerMeta) inpt_str_ln_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5120.StrLnR.class, value)
			);
			return;
		}
		if ($act_cont_fctr_p.equalsIgnoreCase(name)) {
			act_cont_fctr_p(
				((MCContainerMeta) act_cont_fctr_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5290.ActContFctrR.class, value)
			);
			return;
		}
		if ($cont_fctr_unit_cd_p.equalsIgnoreCase(name)) {
			cont_fctr_unit_cd_p(
				((MCContainerMeta) cont_fctr_unit_cd_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5270.ContFctrUnitR.class, value)
			);
			return;
		}
		if ($std_cont_fctr_p.equalsIgnoreCase(name)) {
			std_cont_fctr_p(
				((MCContainerMeta) std_cont_fctr_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5280.StdContFctrR.class, value)
			);
			return;
		}
		if ($cont_inpt_qty_p.equalsIgnoreCase(name)) {
			cont_inpt_qty_p(
				((MCContainerMeta) cont_inpt_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5260.ContQtyR.class, value)
			);
			return;
		}
		if ($cont_loss_qty_p.equalsIgnoreCase(name)) {
			cont_loss_qty_p(
				((MCContainerMeta) cont_loss_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5260.ContQtyR.class, value)
			);
			return;
		}
		if ($cont_fxd_loss_qty_p.equalsIgnoreCase(name)) {
			cont_fxd_loss_qty_p(
				((MCContainerMeta) cont_fxd_loss_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5260.ContQtyR.class, value)
			);
			return;
		}
		if ($cont_schd_inpt_qty_p.equalsIgnoreCase(name)) {
			cont_schd_inpt_qty_p(
				((MCContainerMeta) cont_schd_inpt_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5260.ContQtyR.class, value)
			);
			return;
		}
		if ($cont_schd_rqmt_qty_p.equalsIgnoreCase(name)) {
			cont_schd_rqmt_qty_p(
				((MCContainerMeta) cont_schd_rqmt_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5260.ContQtyR.class, value)
			);
			return;
		}
		if ($cont_schd_fxd_rqmt_qty_p.equalsIgnoreCase(name)) {
			cont_schd_fxd_rqmt_qty_p(
				((MCContainerMeta) cont_schd_fxd_rqmt_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5260.ContQtyR.class, value)
			);
			return;
		}
		if ($par_itm_p.equalsIgnoreCase(name)) {
			par_itm_p(
				((MCContainerMeta) par_itm_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5030.ItmR.class, value)
			);
			return;
		}
		if ($st_act_p.equalsIgnoreCase(name)) {
			st_act_p(
				((MCContainerMeta) st_act_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5320.YmdHmR.class, value)
			);
			return;
		}
		if ($st_ac_dt_p.equalsIgnoreCase(name)) {
			st_ac_dt_p(
				((MCContainerMeta) st_ac_dt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5220.AcDtR.class, value)
			);
			return;
		}
		if ($end_act_p.equalsIgnoreCase(name)) {
			end_act_p(
				((MCContainerMeta) end_act_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5320.YmdHmR.class, value)
			);
			return;
		}
		if ($end_ac_dt_p.equalsIgnoreCase(name)) {
			end_ac_dt_p(
				((MCContainerMeta) end_ac_dt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5220.AcDtR.class, value)
			);
			return;
		}
		if ($base_unit_mfg_inst_qty_p.equalsIgnoreCase(name)) {
			base_unit_mfg_inst_qty_p(
				((MCContainerMeta) base_unit_mfg_inst_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($base_unit_yield_schd_qty_p.equalsIgnoreCase(name)) {
			base_unit_yield_schd_qty_p(
				((MCContainerMeta) base_unit_yield_schd_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($base_unit_st_act_qty_p.equalsIgnoreCase(name)) {
			base_unit_st_act_qty_p(
				((MCContainerMeta) base_unit_st_act_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($base_unit_yield_qty_p.equalsIgnoreCase(name)) {
			base_unit_yield_qty_p(
				((MCContainerMeta) base_unit_yield_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($base_unit_dfct_qty_p.equalsIgnoreCase(name)) {
			base_unit_dfct_qty_p(
				((MCContainerMeta) base_unit_dfct_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($oper_unit_act_qty_p.equalsIgnoreCase(name)) {
			oper_unit_act_qty_p(
				((MCContainerMeta) oper_unit_act_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($oper_unit_schd_qty_p.equalsIgnoreCase(name)) {
			oper_unit_schd_qty_p(
				((MCContainerMeta) oper_unit_schd_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($par_sno_p.equalsIgnoreCase(name)) {
			par_sno_p(
				((MCContainerMeta) par_sno_p_META).castInnerRow(mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.class, value)
			);
			return;
		}
		if ($inst_ver_no_p.equalsIgnoreCase(name)) {
			inst_ver_no_p(
				((MCContainerMeta) inst_ver_no_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5250.VerNoR.class, value)
			);
			return;
		}
		if ($acxfr_act_qty_p.equalsIgnoreCase(name)) {
			acxfr_act_qty_p(
				((MCContainerMeta) acxfr_act_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($cont_acxfr_act_qty_p.equalsIgnoreCase(name)) {
			cont_acxfr_act_qty_p(
				((MCContainerMeta) cont_acxfr_act_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5260.ContQtyR.class, value)
			);
			return;
		}
		if ($chd_itm_grp_p.equalsIgnoreCase(name)) {
			chd_itm_grp_p(
				((MCContainerMeta) chd_itm_grp_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5170.ItmGrpR.class, value)
			);
			return;
		}
		if ($par_itm_grp_p.equalsIgnoreCase(name)) {
			par_itm_grp_p(
				((MCContainerMeta) par_itm_grp_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5170.ItmGrpR.class, value)
			);
			return;
		}
		super.setInnerRow(name, value);
	}


	/**
	 * Child item cd. 子品目ＣＤ.<p>
	 *
	 */
	public String chd_itm_cd() {
		return chd_itm_p().itm_cd();
	}

	/**
	 * Child item cd. 子品目ＣＤ.<p>
	 *
	 */
	public void chd_itm_cd(String value) {
		chd_itm_p().itm_cd(value);
	}

	/**
	 * Child branch No. 1 子枝番１.<p>
	 *
	 */
	public String chd_itm_sub1() {
		return chd_itm_p().itm_sub1();
	}

	/**
	 * Child branch No. 1 子枝番１.<p>
	 *
	 */
	public void chd_itm_sub1(String value) {
		chd_itm_p().itm_sub1(value);
	}

	/**
	 * Child branch No. 2 子枝番２.<p>
	 *
	 */
	public String chd_itm_sub2() {
		return chd_itm_p().itm_sub2();
	}

	/**
	 * Child branch No. 2 子枝番２.<p>
	 *
	 */
	public void chd_itm_sub2(String value) {
		chd_itm_p().itm_sub2(value);
	}

	/**
	 * Child branch No. 3 子枝番３.<p>
	 *
	 */
	public String chd_itm_sub3() {
		return chd_itm_p().itm_sub3();
	}

	/**
	 * Child branch No. 3 子枝番３.<p>
	 *
	 */
	public void chd_itm_sub3(String value) {
		chd_itm_p().itm_sub3(value);
	}

	/**
	 * Child item name 子品名.<p>
	 *
	 */
	public String chd_itm_nm() {
		return chd_itm_p().itm_nm();
	}

	/**
	 * Child item name 子品名.<p>
	 *
	 */
	public void chd_itm_nm(String value) {
		chd_itm_p().itm_nm(value);
	}

	public String ver_no() {
		return ver_no_p().ver_no();
	}

	public void ver_no(String value) {
		ver_no_p().ver_no(value);
	}

	/**
	 * Input qty. 投入数量.<p>
	 *
	 */
	public MCNumber base_unit_inpt_qty() {
		return inpt_qty_p().qty();
	}

	/**
	 * Input qty. 投入数量.<p>
	 *
	 */
	public void base_unit_inpt_qty(MCNumber value) {
		inpt_qty_p().qty(value);
	}

	/**
	 * Input qty. 投入数量.<p>
	 *
	 */
	public void base_unit_inpt_qty(int value) {
		inpt_qty_p().qty(value);
	}

	/**
	 * Input qty. 投入数量.<p>
	 *
	 */
	public void base_unit_inpt_qty(long value) {
		inpt_qty_p().qty(value);
	}

	/**
	 * Input qty. 投入数量.<p>
	 *
	 */
	public void base_unit_inpt_qty(float value) {
		inpt_qty_p().qty(value);
	}

	/**
	 * Input qty. 投入数量.<p>
	 *
	 */
	public void base_unit_inpt_qty(double value) {
		inpt_qty_p().qty(value);
	}

	/**
	 * Loss qty. ロス数量.<p>
	 *
	 */
	public MCNumber loss_qty() {
		return loss_qty_p().qty();
	}

	/**
	 * Loss qty. ロス数量.<p>
	 *
	 */
	public void loss_qty(MCNumber value) {
		loss_qty_p().qty(value);
	}

	/**
	 * Loss qty. ロス数量.<p>
	 *
	 */
	public void loss_qty(int value) {
		loss_qty_p().qty(value);
	}

	/**
	 * Loss qty. ロス数量.<p>
	 *
	 */
	public void loss_qty(long value) {
		loss_qty_p().qty(value);
	}

	/**
	 * Loss qty. ロス数量.<p>
	 *
	 */
	public void loss_qty(float value) {
		loss_qty_p().qty(value);
	}

	/**
	 * Loss qty. ロス数量.<p>
	 *
	 */
	public void loss_qty(double value) {
		loss_qty_p().qty(value);
	}

	/**
	 * Loss qty. (Non-constant total) ロス数量（固定以外合計）.<p>
	 *
	 */
	public MCNumber base_unit_loss_qty() {
		return sum_loss_qty_p().qty();
	}

	/**
	 * Loss qty. (Non-constant total) ロス数量（固定以外合計）.<p>
	 *
	 */
	public void base_unit_loss_qty(MCNumber value) {
		sum_loss_qty_p().qty(value);
	}

	/**
	 * Loss qty. (Non-constant total) ロス数量（固定以外合計）.<p>
	 *
	 */
	public void base_unit_loss_qty(int value) {
		sum_loss_qty_p().qty(value);
	}

	/**
	 * Loss qty. (Non-constant total) ロス数量（固定以外合計）.<p>
	 *
	 */
	public void base_unit_loss_qty(long value) {
		sum_loss_qty_p().qty(value);
	}

	/**
	 * Loss qty. (Non-constant total) ロス数量（固定以外合計）.<p>
	 *
	 */
	public void base_unit_loss_qty(float value) {
		sum_loss_qty_p().qty(value);
	}

	/**
	 * Loss qty. (Non-constant total) ロス数量（固定以外合計）.<p>
	 *
	 */
	public void base_unit_loss_qty(double value) {
		sum_loss_qty_p().qty(value);
	}

	/**
	 * Constant loss qty. (Total constant loss) 固定ロス数量（固定ロス合計）.<p>
	 *
	 */
	public MCNumber base_unit_fxd_loss_qty() {
		return sum_fxd_loss_qty_p().qty();
	}

	/**
	 * Constant loss qty. (Total constant loss) 固定ロス数量（固定ロス合計）.<p>
	 *
	 */
	public void base_unit_fxd_loss_qty(MCNumber value) {
		sum_fxd_loss_qty_p().qty(value);
	}

	/**
	 * Constant loss qty. (Total constant loss) 固定ロス数量（固定ロス合計）.<p>
	 *
	 */
	public void base_unit_fxd_loss_qty(int value) {
		sum_fxd_loss_qty_p().qty(value);
	}

	/**
	 * Constant loss qty. (Total constant loss) 固定ロス数量（固定ロス合計）.<p>
	 *
	 */
	public void base_unit_fxd_loss_qty(long value) {
		sum_fxd_loss_qty_p().qty(value);
	}

	/**
	 * Constant loss qty. (Total constant loss) 固定ロス数量（固定ロス合計）.<p>
	 *
	 */
	public void base_unit_fxd_loss_qty(float value) {
		sum_fxd_loss_qty_p().qty(value);
	}

	/**
	 * Constant loss qty. (Total constant loss) 固定ロス数量（固定ロス合計）.<p>
	 *
	 */
	public void base_unit_fxd_loss_qty(double value) {
		sum_fxd_loss_qty_p().qty(value);
	}

	/**
	 * Remaining input qty. 投入残数量.<p>
	 *
	 */
	public MCNumber base_unit_inpt_rem_qty() {
		return inpt_rem_qty_p().qty();
	}

	/**
	 * Remaining input qty. 投入残数量.<p>
	 *
	 */
	public void base_unit_inpt_rem_qty(MCNumber value) {
		inpt_rem_qty_p().qty(value);
	}

	/**
	 * Remaining input qty. 投入残数量.<p>
	 *
	 */
	public void base_unit_inpt_rem_qty(int value) {
		inpt_rem_qty_p().qty(value);
	}

	/**
	 * Remaining input qty. 投入残数量.<p>
	 *
	 */
	public void base_unit_inpt_rem_qty(long value) {
		inpt_rem_qty_p().qty(value);
	}

	/**
	 * Remaining input qty. 投入残数量.<p>
	 *
	 */
	public void base_unit_inpt_rem_qty(float value) {
		inpt_rem_qty_p().qty(value);
	}

	/**
	 * Remaining input qty. 投入残数量.<p>
	 *
	 */
	public void base_unit_inpt_rem_qty(double value) {
		inpt_rem_qty_p().qty(value);
	}

	/**
	 * Schedule input qty. 予定投入数量.<p>
	 *
	 */
	public MCNumber base_unit_schd_inpt_qty() {
		return schd_inpt_qty_p().qty();
	}

	/**
	 * Schedule input qty. 予定投入数量.<p>
	 *
	 */
	public void base_unit_schd_inpt_qty(MCNumber value) {
		schd_inpt_qty_p().qty(value);
	}

	/**
	 * Schedule input qty. 予定投入数量.<p>
	 *
	 */
	public void base_unit_schd_inpt_qty(int value) {
		schd_inpt_qty_p().qty(value);
	}

	/**
	 * Schedule input qty. 予定投入数量.<p>
	 *
	 */
	public void base_unit_schd_inpt_qty(long value) {
		schd_inpt_qty_p().qty(value);
	}

	/**
	 * Schedule input qty. 予定投入数量.<p>
	 *
	 */
	public void base_unit_schd_inpt_qty(float value) {
		schd_inpt_qty_p().qty(value);
	}

	/**
	 * Schedule input qty. 予定投入数量.<p>
	 *
	 */
	public void base_unit_schd_inpt_qty(double value) {
		schd_inpt_qty_p().qty(value);
	}

	/**
	 * Schedule required qty. 予定必要数量.<p>
	 *
	 */
	public MCNumber base_unit_schd_rqmt_qty() {
		return schd_rqmt_qty_p().qty();
	}

	/**
	 * Schedule required qty. 予定必要数量.<p>
	 *
	 */
	public void base_unit_schd_rqmt_qty(MCNumber value) {
		schd_rqmt_qty_p().qty(value);
	}

	/**
	 * Schedule required qty. 予定必要数量.<p>
	 *
	 */
	public void base_unit_schd_rqmt_qty(int value) {
		schd_rqmt_qty_p().qty(value);
	}

	/**
	 * Schedule required qty. 予定必要数量.<p>
	 *
	 */
	public void base_unit_schd_rqmt_qty(long value) {
		schd_rqmt_qty_p().qty(value);
	}

	/**
	 * Schedule required qty. 予定必要数量.<p>
	 *
	 */
	public void base_unit_schd_rqmt_qty(float value) {
		schd_rqmt_qty_p().qty(value);
	}

	/**
	 * Schedule required qty. 予定必要数量.<p>
	 *
	 */
	public void base_unit_schd_rqmt_qty(double value) {
		schd_rqmt_qty_p().qty(value);
	}

	/**
	 * Schedule constant loss qty. 予定固定ロス数量.<p>
	 *
	 */
	public MCNumber base_unit_schd_fxd_rqmt_qty() {
		return schd_fxd_rqmt_qty_p().qty();
	}

	/**
	 * Schedule constant loss qty. 予定固定ロス数量.<p>
	 *
	 */
	public void base_unit_schd_fxd_rqmt_qty(MCNumber value) {
		schd_fxd_rqmt_qty_p().qty(value);
	}

	/**
	 * Schedule constant loss qty. 予定固定ロス数量.<p>
	 *
	 */
	public void base_unit_schd_fxd_rqmt_qty(int value) {
		schd_fxd_rqmt_qty_p().qty(value);
	}

	/**
	 * Schedule constant loss qty. 予定固定ロス数量.<p>
	 *
	 */
	public void base_unit_schd_fxd_rqmt_qty(long value) {
		schd_fxd_rqmt_qty_p().qty(value);
	}

	/**
	 * Schedule constant loss qty. 予定固定ロス数量.<p>
	 *
	 */
	public void base_unit_schd_fxd_rqmt_qty(float value) {
		schd_fxd_rqmt_qty_p().qty(value);
	}

	/**
	 * Schedule constant loss qty. 予定固定ロス数量.<p>
	 *
	 */
	public void base_unit_schd_fxd_rqmt_qty(double value) {
		schd_fxd_rqmt_qty_p().qty(value);
	}

	public boolean crt_lot_flg() {
		return lot_no_p().crt_lot_flg();
	}

	public void crt_lot_flg(boolean value) {
		lot_no_p().crt_lot_flg(value);
	}

	/**
	 * Lot No. (Result) ロットＮＯ（実績）.<p>
	 *
	 */
	public String act_lot_no() {
		return lot_no_p().lot_no();
	}

	/**
	 * Lot No. (Result) ロットＮＯ（実績）.<p>
	 *
	 */
	public void act_lot_no(String value) {
		lot_no_p().lot_no(value);
	}

	/**
	 * Sublot No. (Result) サブロットＮＯ（実績）.<p>
	 *
	 */
	public String act_sublot_no() {
		return lot_no_p().sublot_no();
	}

	/**
	 * Sublot No. (Result) サブロットＮＯ（実績）.<p>
	 *
	 */
	public void act_sublot_no(String value) {
		lot_no_p().sublot_no(value);
	}

	/**
	 * Actual date 実績日.<p>
	 *
	 */
	public MCDate act_dt() {
		return act_tm_p().ymd();
	}

	/**
	 * Actual date 実績日.<p>
	 *
	 */
	public void act_dt(MCDate value) {
		act_tm_p().ymd(value);
	}

	/**
	 * Actual time 実績時刻.<p>
	 *
	 */
	public MCDate act_hm() {
		return act_tm_p().hm();
	}

	/**
	 * Actual time 実績時刻.<p>
	 *
	 */
	public void act_hm(MCDate value) {
		act_tm_p().hm(value);
	}

	/**
	 * Recording date 計上日.<p>
	 *
	 */
	public MCDate ac_dt() {
		return ac_dt_p().ac_dt();
	}

	/**
	 * Recording date 計上日.<p>
	 *
	 */
	public void ac_dt(MCDate value) {
		ac_dt_p().ac_dt(value);
	}

	/**
	 * Scheduled input date 投入予定日.<p>
	 *
	 */
	public MCDate schd_dt() {
		return schd_tm_p().ymd();
	}

	/**
	 * Scheduled input date 投入予定日.<p>
	 *
	 */
	public void schd_dt(MCDate value) {
		schd_tm_p().ymd(value);
	}

	/**
	 * Input schedule time 投入予定時刻.<p>
	 *
	 */
	public MCDate schd_hm() {
		return schd_tm_p().hm();
	}

	/**
	 * Input schedule time 投入予定時刻.<p>
	 *
	 */
	public void schd_hm(MCDate value) {
		schd_tm_p().hm(value);
	}

	/**
	 * SEIBAN No. 1 手配ＮＯ１.<p>
	 *
	 */
	public String sno1() {
		return sno_p().sno1();
	}

	/**
	 * SEIBAN No. 1 手配ＮＯ１.<p>
	 *
	 */
	public void sno1(String value) {
		sno_p().sno1(value);
	}

	/**
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public String sno2() {
		return sno_p().sno2();
	}

	/**
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public void sno2(String value) {
		sno_p().sno2(value);
	}

	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public String sno3() {
		return sno_p().sno3();
	}

	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public void sno3(String value) {
		sno_p().sno3(value);
	}

	/**
	 * SEIBAN No. 4 手配ＮＯ４.<p>
	 *
	 */
	public String sno4() {
		return sno_p().sno4();
	}

	/**
	 * SEIBAN No. 4 手配ＮＯ４.<p>
	 *
	 */
	public void sno4(String value) {
		sno_p().sno4(value);
	}

	/**
	 * Input rack/line cd. 投入棚・ラインＣＤ.<p>
	 *
	 */
	public String inpt_str_ln_cd() {
		return inpt_str_ln_p().str_ln_cd();
	}

	/**
	 * Input rack/line cd. 投入棚・ラインＣＤ.<p>
	 *
	 */
	public void inpt_str_ln_cd(String value) {
		inpt_str_ln_p().str_ln_cd(value);
	}

	/**
	 * Input rack/line name 投入棚・ライン名.<p>
	 *
	 */
	public String inpt_str_ln_nm() {
		return inpt_str_ln_p().str_ln_nm();
	}

	/**
	 * Input rack/line name 投入棚・ライン名.<p>
	 *
	 */
	public void inpt_str_ln_nm(String value) {
		inpt_str_ln_p().str_ln_nm(value);
	}

	/**
	 * Without input rack/line 投入棚・ライン無.<p>
	 *
	 */
	public boolean inpt_str_ln_cd_none_flg() {
		return inpt_str_ln_p().str_ln_cd_none_flg();
	}

	/**
	 * Without input rack/line 投入棚・ライン無.<p>
	 *
	 */
	public void inpt_str_ln_cd_none_flg(boolean value) {
		inpt_str_ln_p().str_ln_cd_none_flg(value);
	}

	public MCNumber act_cont_fctr() {
		return act_cont_fctr_p().act_cont_fctr();
	}

	public void act_cont_fctr(MCNumber value) {
		act_cont_fctr_p().act_cont_fctr(value);
	}

	public void act_cont_fctr(int value) {
		act_cont_fctr_p().act_cont_fctr(value);
	}

	public void act_cont_fctr(long value) {
		act_cont_fctr_p().act_cont_fctr(value);
	}

	public void act_cont_fctr(float value) {
		act_cont_fctr_p().act_cont_fctr(value);
	}

	public void act_cont_fctr(double value) {
		act_cont_fctr_p().act_cont_fctr(value);
	}

	public String cont_fctr_unit_cd() {
		return cont_fctr_unit_cd_p().cont_fctr_unit_cd();
	}

	public void cont_fctr_unit_cd(String value) {
		cont_fctr_unit_cd_p().cont_fctr_unit_cd(value);
	}

	public String cont_fctr_unit_nm() {
		return cont_fctr_unit_cd_p().cont_fctr_unit_nm();
	}

	public void cont_fctr_unit_nm(String value) {
		cont_fctr_unit_cd_p().cont_fctr_unit_nm(value);
	}

	public MCNumber std_cont_fctr() {
		return std_cont_fctr_p().std_cont_fctr();
	}

	public void std_cont_fctr(MCNumber value) {
		std_cont_fctr_p().std_cont_fctr(value);
	}

	public void std_cont_fctr(int value) {
		std_cont_fctr_p().std_cont_fctr(value);
	}

	public void std_cont_fctr(long value) {
		std_cont_fctr_p().std_cont_fctr(value);
	}

	public void std_cont_fctr(float value) {
		std_cont_fctr_p().std_cont_fctr(value);
	}

	public void std_cont_fctr(double value) {
		std_cont_fctr_p().std_cont_fctr(value);
	}

	/**
	 * Active ingredient (Input qty.) 有効成分（投入数量）.<p>
	 *
	 */
	public MCNumber cont_inpt_qty() {
		return cont_inpt_qty_p().cont_qty();
	}

	/**
	 * Active ingredient (Input qty.) 有効成分（投入数量）.<p>
	 *
	 */
	public void cont_inpt_qty(MCNumber value) {
		cont_inpt_qty_p().cont_qty(value);
	}

	/**
	 * Active ingredient (Input qty.) 有効成分（投入数量）.<p>
	 *
	 */
	public void cont_inpt_qty(int value) {
		cont_inpt_qty_p().cont_qty(value);
	}

	/**
	 * Active ingredient (Input qty.) 有効成分（投入数量）.<p>
	 *
	 */
	public void cont_inpt_qty(long value) {
		cont_inpt_qty_p().cont_qty(value);
	}

	/**
	 * Active ingredient (Input qty.) 有効成分（投入数量）.<p>
	 *
	 */
	public void cont_inpt_qty(float value) {
		cont_inpt_qty_p().cont_qty(value);
	}

	/**
	 * Active ingredient (Input qty.) 有効成分（投入数量）.<p>
	 *
	 */
	public void cont_inpt_qty(double value) {
		cont_inpt_qty_p().cont_qty(value);
	}

	/**
	 * Active ingredient (Loss qty.) 有効成分（ロス数量）.<p>
	 *
	 */
	public MCNumber cont_loss_qty() {
		return cont_loss_qty_p().cont_qty();
	}

	/**
	 * Active ingredient (Loss qty.) 有効成分（ロス数量）.<p>
	 *
	 */
	public void cont_loss_qty(MCNumber value) {
		cont_loss_qty_p().cont_qty(value);
	}

	/**
	 * Active ingredient (Loss qty.) 有効成分（ロス数量）.<p>
	 *
	 */
	public void cont_loss_qty(int value) {
		cont_loss_qty_p().cont_qty(value);
	}

	/**
	 * Active ingredient (Loss qty.) 有効成分（ロス数量）.<p>
	 *
	 */
	public void cont_loss_qty(long value) {
		cont_loss_qty_p().cont_qty(value);
	}

	/**
	 * Active ingredient (Loss qty.) 有効成分（ロス数量）.<p>
	 *
	 */
	public void cont_loss_qty(float value) {
		cont_loss_qty_p().cont_qty(value);
	}

	/**
	 * Active ingredient (Loss qty.) 有効成分（ロス数量）.<p>
	 *
	 */
	public void cont_loss_qty(double value) {
		cont_loss_qty_p().cont_qty(value);
	}

	/**
	 * Active ingredient (Constant loss qty.) 有効成分（固定ロス数量）.<p>
	 *
	 */
	public MCNumber cont_fxd_loss_qty() {
		return cont_fxd_loss_qty_p().cont_qty();
	}

	/**
	 * Active ingredient (Constant loss qty.) 有効成分（固定ロス数量）.<p>
	 *
	 */
	public void cont_fxd_loss_qty(MCNumber value) {
		cont_fxd_loss_qty_p().cont_qty(value);
	}

	/**
	 * Active ingredient (Constant loss qty.) 有効成分（固定ロス数量）.<p>
	 *
	 */
	public void cont_fxd_loss_qty(int value) {
		cont_fxd_loss_qty_p().cont_qty(value);
	}

	/**
	 * Active ingredient (Constant loss qty.) 有効成分（固定ロス数量）.<p>
	 *
	 */
	public void cont_fxd_loss_qty(long value) {
		cont_fxd_loss_qty_p().cont_qty(value);
	}

	/**
	 * Active ingredient (Constant loss qty.) 有効成分（固定ロス数量）.<p>
	 *
	 */
	public void cont_fxd_loss_qty(float value) {
		cont_fxd_loss_qty_p().cont_qty(value);
	}

	/**
	 * Active ingredient (Constant loss qty.) 有効成分（固定ロス数量）.<p>
	 *
	 */
	public void cont_fxd_loss_qty(double value) {
		cont_fxd_loss_qty_p().cont_qty(value);
	}

	/**
	 * Active ingredient (Schedule input qty.) 有効成分（予定投入数量）.<p>
	 *
	 */
	public MCNumber cont_schd_inpt_qty() {
		return cont_schd_inpt_qty_p().cont_qty();
	}

	/**
	 * Active ingredient (Schedule input qty.) 有効成分（予定投入数量）.<p>
	 *
	 */
	public void cont_schd_inpt_qty(MCNumber value) {
		cont_schd_inpt_qty_p().cont_qty(value);
	}

	/**
	 * Active ingredient (Schedule input qty.) 有効成分（予定投入数量）.<p>
	 *
	 */
	public void cont_schd_inpt_qty(int value) {
		cont_schd_inpt_qty_p().cont_qty(value);
	}

	/**
	 * Active ingredient (Schedule input qty.) 有効成分（予定投入数量）.<p>
	 *
	 */
	public void cont_schd_inpt_qty(long value) {
		cont_schd_inpt_qty_p().cont_qty(value);
	}

	/**
	 * Active ingredient (Schedule input qty.) 有効成分（予定投入数量）.<p>
	 *
	 */
	public void cont_schd_inpt_qty(float value) {
		cont_schd_inpt_qty_p().cont_qty(value);
	}

	/**
	 * Active ingredient (Schedule input qty.) 有効成分（予定投入数量）.<p>
	 *
	 */
	public void cont_schd_inpt_qty(double value) {
		cont_schd_inpt_qty_p().cont_qty(value);
	}

	/**
	 * Active ingredient (Schedule required qty.) 有効成分（予定必要数量）.<p>
	 *
	 */
	public MCNumber cont_schd_rqmt_qty() {
		return cont_schd_rqmt_qty_p().cont_qty();
	}

	/**
	 * Active ingredient (Schedule required qty.) 有効成分（予定必要数量）.<p>
	 *
	 */
	public void cont_schd_rqmt_qty(MCNumber value) {
		cont_schd_rqmt_qty_p().cont_qty(value);
	}

	/**
	 * Active ingredient (Schedule required qty.) 有効成分（予定必要数量）.<p>
	 *
	 */
	public void cont_schd_rqmt_qty(int value) {
		cont_schd_rqmt_qty_p().cont_qty(value);
	}

	/**
	 * Active ingredient (Schedule required qty.) 有効成分（予定必要数量）.<p>
	 *
	 */
	public void cont_schd_rqmt_qty(long value) {
		cont_schd_rqmt_qty_p().cont_qty(value);
	}

	/**
	 * Active ingredient (Schedule required qty.) 有効成分（予定必要数量）.<p>
	 *
	 */
	public void cont_schd_rqmt_qty(float value) {
		cont_schd_rqmt_qty_p().cont_qty(value);
	}

	/**
	 * Active ingredient (Schedule required qty.) 有効成分（予定必要数量）.<p>
	 *
	 */
	public void cont_schd_rqmt_qty(double value) {
		cont_schd_rqmt_qty_p().cont_qty(value);
	}

	/**
	 * Active ingredient (Schedule constant loss qty.) 有効成分（予定固定ロス数量）.<p>
	 *
	 */
	public MCNumber cont_schd_fxd_rqmt_qty() {
		return cont_schd_fxd_rqmt_qty_p().cont_qty();
	}

	/**
	 * Active ingredient (Schedule constant loss qty.) 有効成分（予定固定ロス数量）.<p>
	 *
	 */
	public void cont_schd_fxd_rqmt_qty(MCNumber value) {
		cont_schd_fxd_rqmt_qty_p().cont_qty(value);
	}

	/**
	 * Active ingredient (Schedule constant loss qty.) 有効成分（予定固定ロス数量）.<p>
	 *
	 */
	public void cont_schd_fxd_rqmt_qty(int value) {
		cont_schd_fxd_rqmt_qty_p().cont_qty(value);
	}

	/**
	 * Active ingredient (Schedule constant loss qty.) 有効成分（予定固定ロス数量）.<p>
	 *
	 */
	public void cont_schd_fxd_rqmt_qty(long value) {
		cont_schd_fxd_rqmt_qty_p().cont_qty(value);
	}

	/**
	 * Active ingredient (Schedule constant loss qty.) 有効成分（予定固定ロス数量）.<p>
	 *
	 */
	public void cont_schd_fxd_rqmt_qty(float value) {
		cont_schd_fxd_rqmt_qty_p().cont_qty(value);
	}

	/**
	 * Active ingredient (Schedule constant loss qty.) 有効成分（予定固定ロス数量）.<p>
	 *
	 */
	public void cont_schd_fxd_rqmt_qty(double value) {
		cont_schd_fxd_rqmt_qty_p().cont_qty(value);
	}

	/**
	 * Parent item cd. 親品目ＣＤ.<p>
	 *
	 */
	public String par_itm_cd() {
		return par_itm_p().itm_cd();
	}

	/**
	 * Parent item cd. 親品目ＣＤ.<p>
	 *
	 */
	public void par_itm_cd(String value) {
		par_itm_p().itm_cd(value);
	}

	/**
	 * Parent branch No. 1 親枝番１.<p>
	 *
	 */
	public String par_itm_sub1() {
		return par_itm_p().itm_sub1();
	}

	/**
	 * Parent branch No. 1 親枝番１.<p>
	 *
	 */
	public void par_itm_sub1(String value) {
		par_itm_p().itm_sub1(value);
	}

	/**
	 * Parent branch No. 2 親枝番２.<p>
	 *
	 */
	public String par_itm_sub2() {
		return par_itm_p().itm_sub2();
	}

	/**
	 * Parent branch No. 2 親枝番２.<p>
	 *
	 */
	public void par_itm_sub2(String value) {
		par_itm_p().itm_sub2(value);
	}

	/**
	 * Parent branch No. 3 親枝番３.<p>
	 *
	 */
	public String par_itm_sub3() {
		return par_itm_p().itm_sub3();
	}

	/**
	 * Parent branch No. 3 親枝番３.<p>
	 *
	 */
	public void par_itm_sub3(String value) {
		par_itm_p().itm_sub3(value);
	}

	/**
	 * Parent item name 親品名.<p>
	 *
	 */
	public String par_itm_nm() {
		return par_itm_p().itm_nm();
	}

	/**
	 * Parent item name 親品名.<p>
	 *
	 */
	public void par_itm_nm(String value) {
		par_itm_p().itm_nm(value);
	}

	/**
	 * Actual start date 着手実績日.<p>
	 *
	 */
	public MCDate st_act_dt() {
		return st_act_p().ymd();
	}

	/**
	 * Actual start date 着手実績日.<p>
	 *
	 */
	public void st_act_dt(MCDate value) {
		st_act_p().ymd(value);
	}

	/**
	 * Actual start time 着手実績時刻.<p>
	 *
	 */
	public MCDate st_act_hm() {
		return st_act_p().hm();
	}

	/**
	 * Actual start time 着手実績時刻.<p>
	 *
	 */
	public void st_act_hm(MCDate value) {
		st_act_p().hm(value);
	}

	/**
	 * Start recording date 着手計上日.<p>
	 *
	 */
	public MCDate st_ac_dt() {
		return st_ac_dt_p().ac_dt();
	}

	/**
	 * Start recording date 着手計上日.<p>
	 *
	 */
	public void st_ac_dt(MCDate value) {
		st_ac_dt_p().ac_dt(value);
	}

	/**
	 * Actual end date 終了実績日.<p>
	 *
	 */
	public MCDate end_act_dt() {
		return end_act_p().ymd();
	}

	/**
	 * Actual end date 終了実績日.<p>
	 *
	 */
	public void end_act_dt(MCDate value) {
		end_act_p().ymd(value);
	}

	/**
	 * Actual end time 終了実績時刻.<p>
	 *
	 */
	public MCDate end_act_hm() {
		return end_act_p().hm();
	}

	/**
	 * Actual end time 終了実績時刻.<p>
	 *
	 */
	public void end_act_hm(MCDate value) {
		end_act_p().hm(value);
	}

	/**
	 * End recording date 終了計上日.<p>
	 *
	 */
	public MCDate end_ac_dt() {
		return end_ac_dt_p().ac_dt();
	}

	/**
	 * End recording date 終了計上日.<p>
	 *
	 */
	public void end_ac_dt(MCDate value) {
		end_ac_dt_p().ac_dt(value);
	}

	/**
	 * Mfg. order qty. 製造指図数量.<p>
	 *
	 */
	public MCNumber base_unit_mfg_inst_qty() {
		return base_unit_mfg_inst_qty_p().qty();
	}

	/**
	 * Mfg. order qty. 製造指図数量.<p>
	 *
	 */
	public void base_unit_mfg_inst_qty(MCNumber value) {
		base_unit_mfg_inst_qty_p().qty(value);
	}

	/**
	 * Mfg. order qty. 製造指図数量.<p>
	 *
	 */
	public void base_unit_mfg_inst_qty(int value) {
		base_unit_mfg_inst_qty_p().qty(value);
	}

	/**
	 * Mfg. order qty. 製造指図数量.<p>
	 *
	 */
	public void base_unit_mfg_inst_qty(long value) {
		base_unit_mfg_inst_qty_p().qty(value);
	}

	/**
	 * Mfg. order qty. 製造指図数量.<p>
	 *
	 */
	public void base_unit_mfg_inst_qty(float value) {
		base_unit_mfg_inst_qty_p().qty(value);
	}

	/**
	 * Mfg. order qty. 製造指図数量.<p>
	 *
	 */
	public void base_unit_mfg_inst_qty(double value) {
		base_unit_mfg_inst_qty_p().qty(value);
	}

	/**
	 * Output scheduled qty. 出来高予定数量.<p>
	 *
	 */
	public MCNumber base_unit_yield_schd_qty() {
		return base_unit_yield_schd_qty_p().qty();
	}

	/**
	 * Output scheduled qty. 出来高予定数量.<p>
	 *
	 */
	public void base_unit_yield_schd_qty(MCNumber value) {
		base_unit_yield_schd_qty_p().qty(value);
	}

	/**
	 * Output scheduled qty. 出来高予定数量.<p>
	 *
	 */
	public void base_unit_yield_schd_qty(int value) {
		base_unit_yield_schd_qty_p().qty(value);
	}

	/**
	 * Output scheduled qty. 出来高予定数量.<p>
	 *
	 */
	public void base_unit_yield_schd_qty(long value) {
		base_unit_yield_schd_qty_p().qty(value);
	}

	/**
	 * Output scheduled qty. 出来高予定数量.<p>
	 *
	 */
	public void base_unit_yield_schd_qty(float value) {
		base_unit_yield_schd_qty_p().qty(value);
	}

	/**
	 * Output scheduled qty. 出来高予定数量.<p>
	 *
	 */
	public void base_unit_yield_schd_qty(double value) {
		base_unit_yield_schd_qty_p().qty(value);
	}

	/**
	 * Start qty. 着手数量.<p>
	 *
	 */
	public MCNumber base_unit_st_act_qty() {
		return base_unit_st_act_qty_p().qty();
	}

	/**
	 * Start qty. 着手数量.<p>
	 *
	 */
	public void base_unit_st_act_qty(MCNumber value) {
		base_unit_st_act_qty_p().qty(value);
	}

	/**
	 * Start qty. 着手数量.<p>
	 *
	 */
	public void base_unit_st_act_qty(int value) {
		base_unit_st_act_qty_p().qty(value);
	}

	/**
	 * Start qty. 着手数量.<p>
	 *
	 */
	public void base_unit_st_act_qty(long value) {
		base_unit_st_act_qty_p().qty(value);
	}

	/**
	 * Start qty. 着手数量.<p>
	 *
	 */
	public void base_unit_st_act_qty(float value) {
		base_unit_st_act_qty_p().qty(value);
	}

	/**
	 * Start qty. 着手数量.<p>
	 *
	 */
	public void base_unit_st_act_qty(double value) {
		base_unit_st_act_qty_p().qty(value);
	}

	/**
	 * Conforming qty. 良品数量.<p>
	 *
	 */
	public MCNumber base_unit_yield_qty() {
		return base_unit_yield_qty_p().qty();
	}

	/**
	 * Conforming qty. 良品数量.<p>
	 *
	 */
	public void base_unit_yield_qty(MCNumber value) {
		base_unit_yield_qty_p().qty(value);
	}

	/**
	 * Conforming qty. 良品数量.<p>
	 *
	 */
	public void base_unit_yield_qty(int value) {
		base_unit_yield_qty_p().qty(value);
	}

	/**
	 * Conforming qty. 良品数量.<p>
	 *
	 */
	public void base_unit_yield_qty(long value) {
		base_unit_yield_qty_p().qty(value);
	}

	/**
	 * Conforming qty. 良品数量.<p>
	 *
	 */
	public void base_unit_yield_qty(float value) {
		base_unit_yield_qty_p().qty(value);
	}

	/**
	 * Conforming qty. 良品数量.<p>
	 *
	 */
	public void base_unit_yield_qty(double value) {
		base_unit_yield_qty_p().qty(value);
	}

	/**
	 * Defective qty. 不良数量.<p>
	 *
	 */
	public MCNumber base_unit_dfct_qty() {
		return base_unit_dfct_qty_p().qty();
	}

	/**
	 * Defective qty. 不良数量.<p>
	 *
	 */
	public void base_unit_dfct_qty(MCNumber value) {
		base_unit_dfct_qty_p().qty(value);
	}

	/**
	 * Defective qty. 不良数量.<p>
	 *
	 */
	public void base_unit_dfct_qty(int value) {
		base_unit_dfct_qty_p().qty(value);
	}

	/**
	 * Defective qty. 不良数量.<p>
	 *
	 */
	public void base_unit_dfct_qty(long value) {
		base_unit_dfct_qty_p().qty(value);
	}

	/**
	 * Defective qty. 不良数量.<p>
	 *
	 */
	public void base_unit_dfct_qty(float value) {
		base_unit_dfct_qty_p().qty(value);
	}

	/**
	 * Defective qty. 不良数量.<p>
	 *
	 */
	public void base_unit_dfct_qty(double value) {
		base_unit_dfct_qty_p().qty(value);
	}

	/**
	 * Operation unit result qty. 工程単位実績数量.<p>
	 *
	 */
	public MCNumber oper_unit_act_qty() {
		return oper_unit_act_qty_p().qty();
	}

	/**
	 * Operation unit result qty. 工程単位実績数量.<p>
	 *
	 */
	public void oper_unit_act_qty(MCNumber value) {
		oper_unit_act_qty_p().qty(value);
	}

	/**
	 * Operation unit result qty. 工程単位実績数量.<p>
	 *
	 */
	public void oper_unit_act_qty(int value) {
		oper_unit_act_qty_p().qty(value);
	}

	/**
	 * Operation unit result qty. 工程単位実績数量.<p>
	 *
	 */
	public void oper_unit_act_qty(long value) {
		oper_unit_act_qty_p().qty(value);
	}

	/**
	 * Operation unit result qty. 工程単位実績数量.<p>
	 *
	 */
	public void oper_unit_act_qty(float value) {
		oper_unit_act_qty_p().qty(value);
	}

	/**
	 * Operation unit result qty. 工程単位実績数量.<p>
	 *
	 */
	public void oper_unit_act_qty(double value) {
		oper_unit_act_qty_p().qty(value);
	}

	/**
	 * Operation unit scheduled qty. 工程単位予定数量.<p>
	 *
	 */
	public MCNumber oper_unit_schd_qty() {
		return oper_unit_schd_qty_p().qty();
	}

	/**
	 * Operation unit scheduled qty. 工程単位予定数量.<p>
	 *
	 */
	public void oper_unit_schd_qty(MCNumber value) {
		oper_unit_schd_qty_p().qty(value);
	}

	/**
	 * Operation unit scheduled qty. 工程単位予定数量.<p>
	 *
	 */
	public void oper_unit_schd_qty(int value) {
		oper_unit_schd_qty_p().qty(value);
	}

	/**
	 * Operation unit scheduled qty. 工程単位予定数量.<p>
	 *
	 */
	public void oper_unit_schd_qty(long value) {
		oper_unit_schd_qty_p().qty(value);
	}

	/**
	 * Operation unit scheduled qty. 工程単位予定数量.<p>
	 *
	 */
	public void oper_unit_schd_qty(float value) {
		oper_unit_schd_qty_p().qty(value);
	}

	/**
	 * Operation unit scheduled qty. 工程単位予定数量.<p>
	 *
	 */
	public void oper_unit_schd_qty(double value) {
		oper_unit_schd_qty_p().qty(value);
	}

	/**
	 * Parent SEIBAN No. 1 親手配ＮＯ１.<p>
	 *
	 */
	public String par_sno1() {
		return par_sno_p().sno1();
	}

	/**
	 * Parent SEIBAN No. 1 親手配ＮＯ１.<p>
	 *
	 */
	public void par_sno1(String value) {
		par_sno_p().sno1(value);
	}

	/**
	 * Parent SEIBAN No. 2 親手配ＮＯ２.<p>
	 *
	 */
	public String par_sno2() {
		return par_sno_p().sno2();
	}

	/**
	 * Parent SEIBAN No. 2 親手配ＮＯ２.<p>
	 *
	 */
	public void par_sno2(String value) {
		par_sno_p().sno2(value);
	}

	/**
	 * Parent SEIBAN No. 3 親手配ＮＯ３.<p>
	 *
	 */
	public String par_sno3() {
		return par_sno_p().sno3();
	}

	/**
	 * Parent SEIBAN No. 3 親手配ＮＯ３.<p>
	 *
	 */
	public void par_sno3(String value) {
		par_sno_p().sno3(value);
	}

	/**
	 * Parent SEIBAN No. 4 親手配ＮＯ４.<p>
	 *
	 */
	public String par_sno4() {
		return par_sno_p().sno4();
	}

	/**
	 * Parent SEIBAN No. 4 親手配ＮＯ４.<p>
	 *
	 */
	public void par_sno4(String value) {
		par_sno_p().sno4(value);
	}

	public String wrk_no() {
		return par_sno_p().wrk_no();
	}

	public void wrk_no(String value) {
		par_sno_p().wrk_no(value);
	}

	public String wrk_nm() {
		return par_sno_p().wrk_nm();
	}

	public void wrk_nm(String value) {
		par_sno_p().wrk_nm(value);
	}

	/**
	 * Version No. (Order) 版ＮＯ(指図).<p>
	 *
	 */
	public String inpt_schd_ver_no() {
		return inst_ver_no_p().ver_no();
	}

	/**
	 * Version No. (Order) 版ＮＯ(指図).<p>
	 *
	 */
	public void inpt_schd_ver_no(String value) {
		inst_ver_no_p().ver_no(value);
	}

	/**
	 * Other accounting transfer qty. 他勘定振替数量.<p>
	 *
	 */
	public MCNumber acxfr_act_qty() {
		return acxfr_act_qty_p().qty();
	}

	/**
	 * Other accounting transfer qty. 他勘定振替数量.<p>
	 *
	 */
	public void acxfr_act_qty(MCNumber value) {
		acxfr_act_qty_p().qty(value);
	}

	/**
	 * Other accounting transfer qty. 他勘定振替数量.<p>
	 *
	 */
	public void acxfr_act_qty(int value) {
		acxfr_act_qty_p().qty(value);
	}

	/**
	 * Other accounting transfer qty. 他勘定振替数量.<p>
	 *
	 */
	public void acxfr_act_qty(long value) {
		acxfr_act_qty_p().qty(value);
	}

	/**
	 * Other accounting transfer qty. 他勘定振替数量.<p>
	 *
	 */
	public void acxfr_act_qty(float value) {
		acxfr_act_qty_p().qty(value);
	}

	/**
	 * Other accounting transfer qty. 他勘定振替数量.<p>
	 *
	 */
	public void acxfr_act_qty(double value) {
		acxfr_act_qty_p().qty(value);
	}

	/**
	 * Active ingredient (Other accounting transfer qty.) 有効成分（他勘定振替数量）.<p>
	 *
	 */
	public MCNumber cont_acxfr_act_qty() {
		return cont_acxfr_act_qty_p().cont_qty();
	}

	/**
	 * Active ingredient (Other accounting transfer qty.) 有効成分（他勘定振替数量）.<p>
	 *
	 */
	public void cont_acxfr_act_qty(MCNumber value) {
		cont_acxfr_act_qty_p().cont_qty(value);
	}

	/**
	 * Active ingredient (Other accounting transfer qty.) 有効成分（他勘定振替数量）.<p>
	 *
	 */
	public void cont_acxfr_act_qty(int value) {
		cont_acxfr_act_qty_p().cont_qty(value);
	}

	/**
	 * Active ingredient (Other accounting transfer qty.) 有効成分（他勘定振替数量）.<p>
	 *
	 */
	public void cont_acxfr_act_qty(long value) {
		cont_acxfr_act_qty_p().cont_qty(value);
	}

	/**
	 * Active ingredient (Other accounting transfer qty.) 有効成分（他勘定振替数量）.<p>
	 *
	 */
	public void cont_acxfr_act_qty(float value) {
		cont_acxfr_act_qty_p().cont_qty(value);
	}

	/**
	 * Active ingredient (Other accounting transfer qty.) 有効成分（他勘定振替数量）.<p>
	 *
	 */
	public void cont_acxfr_act_qty(double value) {
		cont_acxfr_act_qty_p().cont_qty(value);
	}

	/**
	 * Child item classification cd. 1 子品目分類ＣＤ１.<p>
	 *
	 */
	public String chd_itm_grp_cd1() {
		return chd_itm_grp_p().itm_grp_cd1();
	}

	/**
	 * Child item classification cd. 1 子品目分類ＣＤ１.<p>
	 *
	 */
	public void chd_itm_grp_cd1(String value) {
		chd_itm_grp_p().itm_grp_cd1(value);
	}

	/**
	 * Child item classification name 1 子品目分類名１.<p>
	 *
	 */
	public String chd_itm_grp_nm1() {
		return chd_itm_grp_p().itm_grp_nm1();
	}

	/**
	 * Child item classification name 1 子品目分類名１.<p>
	 *
	 */
	public void chd_itm_grp_nm1(String value) {
		chd_itm_grp_p().itm_grp_nm1(value);
	}

	/**
	 * Child item classification cd. 2 子品目分類ＣＤ２.<p>
	 *
	 */
	public String chd_itm_grp_cd2() {
		return chd_itm_grp_p().itm_grp_cd2();
	}

	/**
	 * Child item classification cd. 2 子品目分類ＣＤ２.<p>
	 *
	 */
	public void chd_itm_grp_cd2(String value) {
		chd_itm_grp_p().itm_grp_cd2(value);
	}

	/**
	 * Child item classification name 2 子品目分類名２.<p>
	 *
	 */
	public String chd_itm_grp_nm2() {
		return chd_itm_grp_p().itm_grp_nm2();
	}

	/**
	 * Child item classification name 2 子品目分類名２.<p>
	 *
	 */
	public void chd_itm_grp_nm2(String value) {
		chd_itm_grp_p().itm_grp_nm2(value);
	}

	/**
	 * Child item classification cd. 3 子品目分類ＣＤ３.<p>
	 *
	 */
	public String chd_itm_grp_cd3() {
		return chd_itm_grp_p().itm_grp_cd3();
	}

	/**
	 * Child item classification cd. 3 子品目分類ＣＤ３.<p>
	 *
	 */
	public void chd_itm_grp_cd3(String value) {
		chd_itm_grp_p().itm_grp_cd3(value);
	}

	/**
	 * Child item classification name 3 子品目分類名３.<p>
	 *
	 */
	public String chd_itm_grp_nm3() {
		return chd_itm_grp_p().itm_grp_nm3();
	}

	/**
	 * Child item classification name 3 子品目分類名３.<p>
	 *
	 */
	public void chd_itm_grp_nm3(String value) {
		chd_itm_grp_p().itm_grp_nm3(value);
	}

	/**
	 * Child item classification cd. 4 子品目分類ＣＤ４.<p>
	 *
	 */
	public String chd_itm_grp_cd4() {
		return chd_itm_grp_p().itm_grp_cd4();
	}

	/**
	 * Child item classification cd. 4 子品目分類ＣＤ４.<p>
	 *
	 */
	public void chd_itm_grp_cd4(String value) {
		chd_itm_grp_p().itm_grp_cd4(value);
	}

	/**
	 * Child item classification name 4 子品目分類名４.<p>
	 *
	 */
	public String chd_itm_grp_nm4() {
		return chd_itm_grp_p().itm_grp_nm4();
	}

	/**
	 * Child item classification name 4 子品目分類名４.<p>
	 *
	 */
	public void chd_itm_grp_nm4(String value) {
		chd_itm_grp_p().itm_grp_nm4(value);
	}

	/**
	 * Child item classification cd. 5 子品目分類ＣＤ５.<p>
	 *
	 */
	public String chd_itm_grp_cd5() {
		return chd_itm_grp_p().itm_grp_cd5();
	}

	/**
	 * Child item classification cd. 5 子品目分類ＣＤ５.<p>
	 *
	 */
	public void chd_itm_grp_cd5(String value) {
		chd_itm_grp_p().itm_grp_cd5(value);
	}

	/**
	 * Child item classification name 5 子品目分類名５.<p>
	 *
	 */
	public String chd_itm_grp_nm5() {
		return chd_itm_grp_p().itm_grp_nm5();
	}

	/**
	 * Child item classification name 5 子品目分類名５.<p>
	 *
	 */
	public void chd_itm_grp_nm5(String value) {
		chd_itm_grp_p().itm_grp_nm5(value);
	}

	/**
	 * Child item classification cd. 6 子品目分類ＣＤ６.<p>
	 *
	 */
	public String chd_itm_grp_cd6() {
		return chd_itm_grp_p().itm_grp_cd6();
	}

	/**
	 * Child item classification cd. 6 子品目分類ＣＤ６.<p>
	 *
	 */
	public void chd_itm_grp_cd6(String value) {
		chd_itm_grp_p().itm_grp_cd6(value);
	}

	/**
	 * Child item classification name 6 子品目分類名６.<p>
	 *
	 */
	public String chd_itm_grp_nm6() {
		return chd_itm_grp_p().itm_grp_nm6();
	}

	/**
	 * Child item classification name 6 子品目分類名６.<p>
	 *
	 */
	public void chd_itm_grp_nm6(String value) {
		chd_itm_grp_p().itm_grp_nm6(value);
	}

	/**
	 * Child item classification cd. 7 子品目分類ＣＤ７.<p>
	 *
	 */
	public String chd_itm_grp_cd7() {
		return chd_itm_grp_p().itm_grp_cd7();
	}

	/**
	 * Child item classification cd. 7 子品目分類ＣＤ７.<p>
	 *
	 */
	public void chd_itm_grp_cd7(String value) {
		chd_itm_grp_p().itm_grp_cd7(value);
	}

	/**
	 * Child item classification name 7 子品目分類名７.<p>
	 *
	 */
	public String chd_itm_grp_nm7() {
		return chd_itm_grp_p().itm_grp_nm7();
	}

	/**
	 * Child item classification name 7 子品目分類名７.<p>
	 *
	 */
	public void chd_itm_grp_nm7(String value) {
		chd_itm_grp_p().itm_grp_nm7(value);
	}

	/**
	 * Child item classification cd. 8 子品目分類ＣＤ８.<p>
	 *
	 */
	public String chd_itm_grp_cd8() {
		return chd_itm_grp_p().itm_grp_cd8();
	}

	/**
	 * Child item classification cd. 8 子品目分類ＣＤ８.<p>
	 *
	 */
	public void chd_itm_grp_cd8(String value) {
		chd_itm_grp_p().itm_grp_cd8(value);
	}

	/**
	 * Child item classification name 8 子品目分類名８.<p>
	 *
	 */
	public String chd_itm_grp_nm8() {
		return chd_itm_grp_p().itm_grp_nm8();
	}

	/**
	 * Child item classification name 8 子品目分類名８.<p>
	 *
	 */
	public void chd_itm_grp_nm8(String value) {
		chd_itm_grp_p().itm_grp_nm8(value);
	}

	/**
	 * Child item classification cd. 9 子品目分類ＣＤ９.<p>
	 *
	 */
	public String chd_itm_grp_cd9() {
		return chd_itm_grp_p().itm_grp_cd9();
	}

	/**
	 * Child item classification cd. 9 子品目分類ＣＤ９.<p>
	 *
	 */
	public void chd_itm_grp_cd9(String value) {
		chd_itm_grp_p().itm_grp_cd9(value);
	}

	/**
	 * Child item classification name 9 子品目分類名９.<p>
	 *
	 */
	public String chd_itm_grp_nm9() {
		return chd_itm_grp_p().itm_grp_nm9();
	}

	/**
	 * Child item classification name 9 子品目分類名９.<p>
	 *
	 */
	public void chd_itm_grp_nm9(String value) {
		chd_itm_grp_p().itm_grp_nm9(value);
	}

	/**
	 * Child item classification cd. 10 子品目分類ＣＤ１０.<p>
	 *
	 */
	public String chd_itm_grp_cd10() {
		return chd_itm_grp_p().itm_grp_cd10();
	}

	/**
	 * Child item classification cd. 10 子品目分類ＣＤ１０.<p>
	 *
	 */
	public void chd_itm_grp_cd10(String value) {
		chd_itm_grp_p().itm_grp_cd10(value);
	}

	/**
	 * Child item classification name 10 子品目分類名１０.<p>
	 *
	 */
	public String chd_itm_grp_nm10() {
		return chd_itm_grp_p().itm_grp_nm10();
	}

	/**
	 * Child item classification name 10 子品目分類名１０.<p>
	 *
	 */
	public void chd_itm_grp_nm10(String value) {
		chd_itm_grp_p().itm_grp_nm10(value);
	}

	/**
	 * Parent item classification cd. 1 親品目分類ＣＤ１.<p>
	 *
	 */
	public String par_itm_grp_cd1() {
		return par_itm_grp_p().itm_grp_cd1();
	}

	/**
	 * Parent item classification cd. 1 親品目分類ＣＤ１.<p>
	 *
	 */
	public void par_itm_grp_cd1(String value) {
		par_itm_grp_p().itm_grp_cd1(value);
	}

	/**
	 * Parent item classification name 1 親品目分類名１.<p>
	 *
	 */
	public String par_itm_grp_nm1() {
		return par_itm_grp_p().itm_grp_nm1();
	}

	/**
	 * Parent item classification name 1 親品目分類名１.<p>
	 *
	 */
	public void par_itm_grp_nm1(String value) {
		par_itm_grp_p().itm_grp_nm1(value);
	}

	/**
	 * Parent item classification cd. 2 親品目分類ＣＤ２.<p>
	 *
	 */
	public String par_itm_grp_cd2() {
		return par_itm_grp_p().itm_grp_cd2();
	}

	/**
	 * Parent item classification cd. 2 親品目分類ＣＤ２.<p>
	 *
	 */
	public void par_itm_grp_cd2(String value) {
		par_itm_grp_p().itm_grp_cd2(value);
	}

	/**
	 * Parent item classification name 2 親品目分類名２.<p>
	 *
	 */
	public String par_itm_grp_nm2() {
		return par_itm_grp_p().itm_grp_nm2();
	}

	/**
	 * Parent item classification name 2 親品目分類名２.<p>
	 *
	 */
	public void par_itm_grp_nm2(String value) {
		par_itm_grp_p().itm_grp_nm2(value);
	}

	/**
	 * Parent item classification cd. 3 親品目分類ＣＤ３.<p>
	 *
	 */
	public String par_itm_grp_cd3() {
		return par_itm_grp_p().itm_grp_cd3();
	}

	/**
	 * Parent item classification cd. 3 親品目分類ＣＤ３.<p>
	 *
	 */
	public void par_itm_grp_cd3(String value) {
		par_itm_grp_p().itm_grp_cd3(value);
	}

	/**
	 * Parent item classification name 3 親品目分類名３.<p>
	 *
	 */
	public String par_itm_grp_nm3() {
		return par_itm_grp_p().itm_grp_nm3();
	}

	/**
	 * Parent item classification name 3 親品目分類名３.<p>
	 *
	 */
	public void par_itm_grp_nm3(String value) {
		par_itm_grp_p().itm_grp_nm3(value);
	}

	/**
	 * Parent item classification cd. 4 親品目分類ＣＤ４.<p>
	 *
	 */
	public String par_itm_grp_cd4() {
		return par_itm_grp_p().itm_grp_cd4();
	}

	/**
	 * Parent item classification cd. 4 親品目分類ＣＤ４.<p>
	 *
	 */
	public void par_itm_grp_cd4(String value) {
		par_itm_grp_p().itm_grp_cd4(value);
	}

	/**
	 * Parent item classification name 4 親品目分類名４.<p>
	 *
	 */
	public String par_itm_grp_nm4() {
		return par_itm_grp_p().itm_grp_nm4();
	}

	/**
	 * Parent item classification name 4 親品目分類名４.<p>
	 *
	 */
	public void par_itm_grp_nm4(String value) {
		par_itm_grp_p().itm_grp_nm4(value);
	}

	/**
	 * Parent item classification cd. 5 親品目分類ＣＤ５.<p>
	 *
	 */
	public String par_itm_grp_cd5() {
		return par_itm_grp_p().itm_grp_cd5();
	}

	/**
	 * Parent item classification cd. 5 親品目分類ＣＤ５.<p>
	 *
	 */
	public void par_itm_grp_cd5(String value) {
		par_itm_grp_p().itm_grp_cd5(value);
	}

	/**
	 * Parent item classification name 5 親品目分類名５.<p>
	 *
	 */
	public String par_itm_grp_nm5() {
		return par_itm_grp_p().itm_grp_nm5();
	}

	/**
	 * Parent item classification name 5 親品目分類名５.<p>
	 *
	 */
	public void par_itm_grp_nm5(String value) {
		par_itm_grp_p().itm_grp_nm5(value);
	}

	/**
	 * Parent item classification cd. 6 親品目分類ＣＤ６.<p>
	 *
	 */
	public String par_itm_grp_cd6() {
		return par_itm_grp_p().itm_grp_cd6();
	}

	/**
	 * Parent item classification cd. 6 親品目分類ＣＤ６.<p>
	 *
	 */
	public void par_itm_grp_cd6(String value) {
		par_itm_grp_p().itm_grp_cd6(value);
	}

	/**
	 * Parent item classification name 6 親品目分類名６.<p>
	 *
	 */
	public String par_itm_grp_nm6() {
		return par_itm_grp_p().itm_grp_nm6();
	}

	/**
	 * Parent item classification name 6 親品目分類名６.<p>
	 *
	 */
	public void par_itm_grp_nm6(String value) {
		par_itm_grp_p().itm_grp_nm6(value);
	}

	/**
	 * Parent item classification cd. 7 親品目分類ＣＤ７.<p>
	 *
	 */
	public String par_itm_grp_cd7() {
		return par_itm_grp_p().itm_grp_cd7();
	}

	/**
	 * Parent item classification cd. 7 親品目分類ＣＤ７.<p>
	 *
	 */
	public void par_itm_grp_cd7(String value) {
		par_itm_grp_p().itm_grp_cd7(value);
	}

	/**
	 * Parent item classification name 7 親品目分類名７.<p>
	 *
	 */
	public String par_itm_grp_nm7() {
		return par_itm_grp_p().itm_grp_nm7();
	}

	/**
	 * Parent item classification name 7 親品目分類名７.<p>
	 *
	 */
	public void par_itm_grp_nm7(String value) {
		par_itm_grp_p().itm_grp_nm7(value);
	}

	/**
	 * Parent item classification cd. 8 親品目分類ＣＤ８.<p>
	 *
	 */
	public String par_itm_grp_cd8() {
		return par_itm_grp_p().itm_grp_cd8();
	}

	/**
	 * Parent item classification cd. 8 親品目分類ＣＤ８.<p>
	 *
	 */
	public void par_itm_grp_cd8(String value) {
		par_itm_grp_p().itm_grp_cd8(value);
	}

	/**
	 * Parent item classification name 8 親品目分類名８.<p>
	 *
	 */
	public String par_itm_grp_nm8() {
		return par_itm_grp_p().itm_grp_nm8();
	}

	/**
	 * Parent item classification name 8 親品目分類名８.<p>
	 *
	 */
	public void par_itm_grp_nm8(String value) {
		par_itm_grp_p().itm_grp_nm8(value);
	}

	/**
	 * Parent item classification cd. 9 親品目分類ＣＤ９.<p>
	 *
	 */
	public String par_itm_grp_cd9() {
		return par_itm_grp_p().itm_grp_cd9();
	}

	/**
	 * Parent item classification cd. 9 親品目分類ＣＤ９.<p>
	 *
	 */
	public void par_itm_grp_cd9(String value) {
		par_itm_grp_p().itm_grp_cd9(value);
	}

	/**
	 * Parent item classification name 9 親品目分類名９.<p>
	 *
	 */
	public String par_itm_grp_nm9() {
		return par_itm_grp_p().itm_grp_nm9();
	}

	/**
	 * Parent item classification name 9 親品目分類名９.<p>
	 *
	 */
	public void par_itm_grp_nm9(String value) {
		par_itm_grp_p().itm_grp_nm9(value);
	}

	/**
	 * Parent item classification cd. 10 親品目分類ＣＤ１０.<p>
	 *
	 */
	public String par_itm_grp_cd10() {
		return par_itm_grp_p().itm_grp_cd10();
	}

	/**
	 * Parent item classification cd. 10 親品目分類ＣＤ１０.<p>
	 *
	 */
	public void par_itm_grp_cd10(String value) {
		par_itm_grp_p().itm_grp_cd10(value);
	}

	/**
	 * Parent item classification name 10 親品目分類名１０.<p>
	 *
	 */
	public String par_itm_grp_nm10() {
		return par_itm_grp_p().itm_grp_nm10();
	}

	/**
	 * Parent item classification name 10 親品目分類名１０.<p>
	 *
	 */
	public void par_itm_grp_nm10(String value) {
		par_itm_grp_p().itm_grp_nm10(value);
	}

}

