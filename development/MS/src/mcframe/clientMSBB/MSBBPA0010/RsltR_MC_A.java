package mcframe.clientMSBB.MSBBPA0010;

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
	 * Sales forecast No. 顧客期間内示ＮＯ.<p>
	 *
	 */
	public static final String $cst_frcst_no = "cst_frcst_no";
	/**
	 * Customer forecast list issue date 得意先内示書発行日.<p>
	 *
	 */
	public static final String $cst_frcst_prnt_dt = "cst_frcst_prnt_dt";
	/**
	 * Customer cd. 得意先ＣＤ.<p>
	 *
	 */
	public static final String $cst_cd = "cst_cd";
	/**
	 * Customer name 得意先名.<p>
	 *
	 */
	public static final String $cst_nm = "cst_nm";
	/**
	 * Delivery destination cd. 納品先ＣＤ.<p>
	 *
	 */
	public static final String $dlv_cd = "dlv_cd";
	/**
	 * Delivery destination name 納品先名.<p>
	 *
	 */
	public static final String $dlv_nm = "dlv_nm";
	/**
	 * Dept. in charge cd. 担当部門ＣＤ.<p>
	 *
	 */
	public static final String $frcst_dpt_cd = "frcst_dpt_cd";
	/**
	 * Dept. in charge name 担当部門名.<p>
	 *
	 */
	public static final String $frcst_dpt_nm = "frcst_dpt_nm";
	/**
	 * PIC cd. 担当者ＣＤ.<p>
	 *
	 */
	public static final String $frcst_usr_cd = "frcst_usr_cd";
	/**
	 * PIC name 担当者名.<p>
	 *
	 */
	public static final String $frcst_usr_nm = "frcst_usr_nm";
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
	 * Receiving date 受付日.<p>
	 *
	 */
	public static final String $rcpt_dt = "rcpt_dt";
	/**
	 * Customer forecast list No. 得意先内示書ＮＯ.<p>
	 *
	 */
	public static final String $cst_frcst_slip_no = "cst_frcst_slip_no";
	/**
	 * Cancel 取消.<p>
	 *
	 */
	public static final String $can_flg = "can_flg";
	/**
	 * Canceling reason cd. 取消理由ＣＤ.<p>
	 *
	 */
	public static final String $can_rsn_cd = "can_rsn_cd";
	/**
	 * Canceling reason name 取消理由名.<p>
	 *
	 */
	public static final String $can_rsn_nm = "can_rsn_nm";
	/**
	 * Cancel remarks 取消備考.<p>
	 *
	 */
	public static final String $can_rmrks = "can_rmrks";
	/**
	 * Internal remarks 内部備考.<p>
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
	/**
	 * Firm 確定.<p>
	 *
	 */
	public static final String $fix_flg = "fix_flg";
	/**
	 * Customer item cd. 得意先品目ＣＤ.<p>
	 *
	 */
	public static final String $cst_itm_cd = "cst_itm_cd";
	/**
	 * Customer item name 得意先品名.<p>
	 *
	 */
	public static final String $cst_itm_nm = "cst_itm_nm";
	public static final String $itm_p = "itm_p";
	/**
	 * Forecast period type 内示期間区分.<p>
	 *
	 */
	public static final String $frcst_period_typ = "frcst_period_typ";
	/**
	 * Forecast period type name 内示期間区分名.<p>
	 *
	 */
	public static final String $frcst_period_typ_nm = "frcst_period_typ_nm";
	/**
	 * Forecast period start date 内示期間開始日.<p>
	 *
	 */
	public static final String $frcst_st_dt = "frcst_st_dt";
	/**
	 * Forecast period end date 内示期間終了日.<p>
	 *
	 */
	public static final String $frcst_end_dt = "frcst_end_dt";
	/**
	 * Forecast period 内示期間.<p>
	 *
	 */
	public static final String $frcst_dt = "frcst_dt";
	public static final String $trd_qty_p = "trd_qty_p";
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
	 * Transaction unit number of decimal places 取引単位小数部有効桁数.<p>
	 *
	 */
	public static final String $qty_dec_place = "qty_dec_place";
	public static final String $base_qty_p = "base_qty_p";
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
	public static final String $base_qty_dec_place = "base_qty_dec_place";
	public static final String $last_qty_p = "last_qty_p";
	/**
	 * Last customer forecast list issue date 前回得意先内示書発行日.<p>
	 *
	 */
	public static final String $last_cst_frcst_prnt_dt = "last_cst_frcst_prnt_dt";
	/**
	 * Last reception date 前回受付日.<p>
	 *
	 */
	public static final String $last_rcpt_dt = "last_rcpt_dt";
	public static final String $spln_qty_p = "spln_qty_p";
	public static final String $slo_qty_p = "slo_qty_p";
	public static final String $mly_net_frcst_qty_p = "mly_net_frcst_qty_p";
	/**
	 * GI source location cd. 出庫元場所ＣＤ.<p>
	 *
	 */
	public static final String $gi_loc_cd = "gi_loc_cd";
	/**
	 * GI source location name 出庫元場所名.<p>
	 *
	 */
	public static final String $gi_loc_nm = "gi_loc_nm";
	/**
	 * Customer forecast list details No. 得意先内示書明細ＮＯ.<p>
	 *
	 */
	public static final String $cst_frcst_slip_d_no = "cst_frcst_slip_d_no";
	public static final String $prms_qty_p = "prms_qty_p";
	/**
	 * Lower priority 下位優先.<p>
	 *
	 */
	public static final String $frcst_stop_flg = "frcst_stop_flg";
	/**
	 * Display order 表示順.<p>
	 *
	 */
	public static final String $disp_seq = "disp_seq";
	/**
	 * Details internal remarks 明細内部備考.<p>
	 *
	 */
	public static final String $dtl_intr_rmrks = "dtl_intr_rmrks";
	/**
	 * Details spare 1 明細予備１.<p>
	 *
	 */
	public static final String $dtl_sub_char1 = "dtl_sub_char1";
	/**
	 * Details spare 2 明細予備２.<p>
	 *
	 */
	public static final String $dtl_sub_char2 = "dtl_sub_char2";
	/**
	 * Details spare 3 明細予備３.<p>
	 *
	 */
	public static final String $dtl_sub_char3 = "dtl_sub_char3";
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
	 * Sales forecast details No. 顧客期間内示明細ＮＯ.<p>
	 *
	 */
	public static final String $cst_frcst_d_no = "cst_frcst_d_no";
	public static final String $dlv_grp_p = "dlv_grp_p";
	public static final String $cst_grp_p = "cst_grp_p";
	public static final String $itm_grp_p = "itm_grp_p";
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

	public static final String $itm_cd = $itm_p + ".itm_cd";
	public static final String $itm_sub1 = $itm_p + ".itm_sub1";
	public static final String $itm_sub2 = $itm_p + ".itm_sub2";
	public static final String $itm_sub3 = $itm_p + ".itm_sub3";
	public static final String $itm_nm = $itm_p + ".itm_nm";
	public static final String $trd_unit_qty = $trd_qty_p + ".qty";
	public static final String $base_unit_qty = $base_qty_p + ".qty";
	public static final String $last_qty = $last_qty_p + ".qty";
	public static final String $spln_qty = $spln_qty_p + ".qty";
	public static final String $slo_qty = $slo_qty_p + ".qty";
	public static final String $mly_net_frcst_qty = $mly_net_frcst_qty_p + ".qty";
	public static final String $prms_qty = $prms_qty_p + ".qty";
	public static final String $dlv_grp_cd1 = $dlv_grp_p + ".bp_grp_cd1";
	public static final String $dlv_grp_nm1 = $dlv_grp_p + ".bp_grp_nm1";
	public static final String $dlv_grp_cd2 = $dlv_grp_p + ".bp_grp_cd2";
	public static final String $dlv_grp_nm2 = $dlv_grp_p + ".bp_grp_nm2";
	public static final String $dlv_grp_cd3 = $dlv_grp_p + ".bp_grp_cd3";
	public static final String $dlv_grp_nm3 = $dlv_grp_p + ".bp_grp_nm3";
	public static final String $dlv_grp_cd4 = $dlv_grp_p + ".bp_grp_cd4";
	public static final String $dlv_grp_nm4 = $dlv_grp_p + ".bp_grp_nm4";
	public static final String $dlv_grp_cd5 = $dlv_grp_p + ".bp_grp_cd5";
	public static final String $dlv_grp_nm5 = $dlv_grp_p + ".bp_grp_nm5";
	public static final String $dlv_grp_cd6 = $dlv_grp_p + ".bp_grp_cd6";
	public static final String $dlv_grp_nm6 = $dlv_grp_p + ".bp_grp_nm6";
	public static final String $dlv_grp_cd7 = $dlv_grp_p + ".bp_grp_cd7";
	public static final String $dlv_grp_nm7 = $dlv_grp_p + ".bp_grp_nm7";
	public static final String $dlv_grp_cd8 = $dlv_grp_p + ".bp_grp_cd8";
	public static final String $dlv_grp_nm8 = $dlv_grp_p + ".bp_grp_nm8";
	public static final String $dlv_grp_cd9 = $dlv_grp_p + ".bp_grp_cd9";
	public static final String $dlv_grp_nm9 = $dlv_grp_p + ".bp_grp_nm9";
	public static final String $dlv_grp_cd10 = $dlv_grp_p + ".bp_grp_cd10";
	public static final String $dlv_grp_nm10 = $dlv_grp_p + ".bp_grp_nm10";
	public static final String $cst_grp_cd1 = $cst_grp_p + ".bp_grp_cd1";
	public static final String $cst_grp_nm1 = $cst_grp_p + ".bp_grp_nm1";
	public static final String $cst_grp_cd2 = $cst_grp_p + ".bp_grp_cd2";
	public static final String $cst_grp_nm2 = $cst_grp_p + ".bp_grp_nm2";
	public static final String $cst_grp_cd3 = $cst_grp_p + ".bp_grp_cd3";
	public static final String $cst_grp_nm3 = $cst_grp_p + ".bp_grp_nm3";
	public static final String $cst_grp_cd4 = $cst_grp_p + ".bp_grp_cd4";
	public static final String $cst_grp_nm4 = $cst_grp_p + ".bp_grp_nm4";
	public static final String $cst_grp_cd5 = $cst_grp_p + ".bp_grp_cd5";
	public static final String $cst_grp_nm5 = $cst_grp_p + ".bp_grp_nm5";
	public static final String $cst_grp_cd6 = $cst_grp_p + ".bp_grp_cd6";
	public static final String $cst_grp_nm6 = $cst_grp_p + ".bp_grp_nm6";
	public static final String $cst_grp_cd7 = $cst_grp_p + ".bp_grp_cd7";
	public static final String $cst_grp_nm7 = $cst_grp_p + ".bp_grp_nm7";
	public static final String $cst_grp_cd8 = $cst_grp_p + ".bp_grp_cd8";
	public static final String $cst_grp_nm8 = $cst_grp_p + ".bp_grp_nm8";
	public static final String $cst_grp_cd9 = $cst_grp_p + ".bp_grp_cd9";
	public static final String $cst_grp_nm9 = $cst_grp_p + ".bp_grp_nm9";
	public static final String $cst_grp_cd10 = $cst_grp_p + ".bp_grp_cd10";
	public static final String $cst_grp_nm10 = $cst_grp_p + ".bp_grp_nm10";
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

	public static final MCMeta cst_frcst_no_META = createCommonMeta($cst_frcst_no, mcframe.commonMA.meta.MA_META.CST_FRCST_NO);
	public static final MCMeta cst_frcst_prnt_dt_META = createCommonMeta($cst_frcst_prnt_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta cst_cd_META = createCommonMeta($cst_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta cst_nm_META = createCommonMeta($cst_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta dlv_cd_META = createCommonMeta($dlv_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta dlv_nm_META = createCommonMeta($dlv_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta frcst_dpt_cd_META = createCommonMeta($frcst_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta frcst_dpt_nm_META = createCommonMeta($frcst_dpt_nm, mcframe.commonMA.meta.MA_META.DPT_NM);
	public static final MCMeta frcst_usr_cd_META = createCommonMeta($frcst_usr_cd, mcframe.commonMA.meta.MA_META.USR_CD);
	public static final MCMeta frcst_usr_nm_META = createCommonMeta($frcst_usr_nm, mcframe.commonMA.meta.MA_META.USR_NM);
	public static final MCMeta wrk_no_META = createCommonMeta($wrk_no, mcframe.commonMA.meta.MA_META.WRK_NO);
	public static final MCMeta wrk_nm_META = createCommonMeta($wrk_nm, mcframe.commonMA.meta.MA_META.WRK_NM);
	public static final MCMeta rcpt_dt_META = createCommonMeta($rcpt_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta cst_frcst_slip_no_META = createCommonMeta($cst_frcst_slip_no, mcframe.commonMA.meta.MA_META.CST_FRCST_SLIP_NO);
	public static final MCMeta can_flg_META = createCommonMeta($can_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta can_rsn_cd_META = createCommonMeta($can_rsn_cd, mcframe.commonMS.meta.MS_META.SLO_RSN_CD);
	public static final MCMeta can_rsn_nm_META = createCommonMeta($can_rsn_nm, mcframe.commonMS.meta.MS_META.SLO_RSN_NM);
	public static final MCMeta can_rmrks_META = createCommonMeta($can_rmrks, mcframe.commonMS.meta.MS_META.CST_FRCST_CAN_RMRKS);
	public static final MCMeta intr_rmrks_META = createCommonMeta($intr_rmrks, mcframe.commonMS.meta.MS_META.CST_FRCST_INTR_RMRKS);
	public static final MCMeta sub_char1_META = createCommonMeta($sub_char1, mcframe.commonMS.meta.MS_META.CST_FRCST_SUB_CHAR1);
	public static final MCMeta sub_char2_META = createCommonMeta($sub_char2, mcframe.commonMS.meta.MS_META.CST_FRCST_SUB_CHAR2);
	public static final MCMeta sub_char3_META = createCommonMeta($sub_char3, mcframe.commonMS.meta.MS_META.CST_FRCST_SUB_CHAR3);
	public static final MCMeta fix_flg_META = createCommonMeta($fix_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta cst_itm_cd_META = createCommonMeta($cst_itm_cd, mcframe.commonMA.meta.MA_META.BP_ITM_CD);
	public static final MCMeta cst_itm_nm_META = createCommonMeta($cst_itm_nm, mcframe.commonMA.meta.MA_META.BP_ITM_NM);
	public static final MCMeta itm_p_META = createInnerRowMeta($itm_p, mcframe.clientMAUB.MAUBP5030.ItmR.class);
	public static final MCMeta frcst_period_typ_META = createCommonMeta($frcst_period_typ, mcframe.commonMS.meta.MS_META.PERIOD_TYP);
	public static final MCMeta frcst_period_typ_nm_META = createCommonMeta($frcst_period_typ_nm, mcframe.commonMS.meta.MS_META.PERIOD_TYP_NM);
	public static final MCMeta frcst_st_dt_META = createCommonMeta($frcst_st_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta frcst_end_dt_META = createCommonMeta($frcst_end_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta frcst_dt_META = createCommonMeta($frcst_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta trd_qty_p_META = createInnerRowMeta($trd_qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta trd_unit_cd_META = createCommonMeta($trd_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta trd_unit_nm_META = createCommonMeta($trd_unit_nm, mcframe.commonMA.meta.MA_META.UNIT_NM);
	public static final MCMeta qty_dec_place_META = createCommonMeta($qty_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta base_qty_p_META = createInnerRowMeta($base_qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta base_unit_cd_META = createCommonMeta($base_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta base_unit_nm_META = createCommonMeta($base_unit_nm, mcframe.commonMA.meta.MA_META.UNIT_NM);
	public static final MCMeta base_qty_dec_place_META = createCommonMeta($base_qty_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta last_qty_p_META = createInnerRowMeta($last_qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta last_cst_frcst_prnt_dt_META = createCommonMeta($last_cst_frcst_prnt_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta last_rcpt_dt_META = createCommonMeta($last_rcpt_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta spln_qty_p_META = createInnerRowMeta($spln_qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta slo_qty_p_META = createInnerRowMeta($slo_qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta mly_net_frcst_qty_p_META = createInnerRowMeta($mly_net_frcst_qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta gi_loc_cd_META = createCommonMeta($gi_loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta gi_loc_nm_META = createCommonMeta($gi_loc_nm, mcframe.commonMA.meta.MA_META.LOC_NM);
	public static final MCMeta cst_frcst_slip_d_no_META = createCommonMeta($cst_frcst_slip_d_no, mcframe.commonMA.meta.MA_META.CST_FRCST_SLIP_D_NO);
	public static final MCMeta prms_qty_p_META = createInnerRowMeta($prms_qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta frcst_stop_flg_META = createCommonMeta($frcst_stop_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta disp_seq_META = createCommonMeta($disp_seq, mcframe.commonMA.meta.MA_META.DISP_SEQ);
	public static final MCMeta dtl_intr_rmrks_META = createCommonMeta($dtl_intr_rmrks, mcframe.commonMS.meta.MS_META.CST_FRCST_D_INTR_RMRKS);
	public static final MCMeta dtl_sub_char1_META = createCommonMeta($dtl_sub_char1, mcframe.commonMS.meta.MS_META.CST_FRCST_D_SUB_CHAR1);
	public static final MCMeta dtl_sub_char2_META = createCommonMeta($dtl_sub_char2, mcframe.commonMS.meta.MS_META.CST_FRCST_D_SUB_CHAR2);
	public static final MCMeta dtl_sub_char3_META = createCommonMeta($dtl_sub_char3, mcframe.commonMS.meta.MS_META.CST_FRCST_D_SUB_CHAR3);
	public static final MCMeta itm_typ_META = createCommonMeta($itm_typ, mcframe.commonMA.meta.MA_META.ITM_TYP);
	public static final MCMeta itm_typ_nm_META = createCommonMeta($itm_typ_nm, mcframe.commonMA.meta.MA_META.ITM_TYP_NM);
	public static final MCMeta itm_typ_d_cd_META = createCommonMeta($itm_typ_d_cd, mcframe.commonMA.meta.MA_META.ITM_TYP_D_CD);
	public static final MCMeta itm_typ_d_nm_META = createCommonMeta($itm_typ_d_nm, mcframe.commonMA.meta.MA_META.ITM_TYP_D_NM);
	public static final MCMeta cst_frcst_d_no_META = createCommonMeta($cst_frcst_d_no, mcframe.commonMA.meta.MA_META.CST_FRCST_D_NO);
	public static final MCMeta dlv_grp_p_META = createInnerRowMeta($dlv_grp_p, mcframe.clientMAUB.MAUBP5190.BpGrpR.class);
	public static final MCMeta cst_grp_p_META = createInnerRowMeta($cst_grp_p, mcframe.clientMAUB.MAUBP5190.BpGrpR.class);
	public static final MCMeta itm_grp_p_META = createInnerRowMeta($itm_grp_p, mcframe.clientMAUB.MAUBP5170.ItmGrpR.class);
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

	protected static final ConstMetaList<RsltR> constMetas = new ConstMetaList<RsltR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			cst_frcst_no_META,
			cst_frcst_prnt_dt_META,
			cst_cd_META,
			cst_nm_META,
			dlv_cd_META,
			dlv_nm_META,
			frcst_dpt_cd_META,
			frcst_dpt_nm_META,
			frcst_usr_cd_META,
			frcst_usr_nm_META,
			wrk_no_META,
			wrk_nm_META,
			rcpt_dt_META,
			cst_frcst_slip_no_META,
			can_flg_META,
			can_rsn_cd_META,
			can_rsn_nm_META,
			can_rmrks_META,
			intr_rmrks_META,
			sub_char1_META,
			sub_char2_META,
			sub_char3_META,
			fix_flg_META,
			cst_itm_cd_META,
			cst_itm_nm_META,
			itm_p_META,
			frcst_period_typ_META,
			frcst_period_typ_nm_META,
			frcst_st_dt_META,
			frcst_end_dt_META,
			frcst_dt_META,
			trd_qty_p_META,
			trd_unit_cd_META,
			trd_unit_nm_META,
			qty_dec_place_META,
			base_qty_p_META,
			base_unit_cd_META,
			base_unit_nm_META,
			base_qty_dec_place_META,
			last_qty_p_META,
			last_cst_frcst_prnt_dt_META,
			last_rcpt_dt_META,
			spln_qty_p_META,
			slo_qty_p_META,
			mly_net_frcst_qty_p_META,
			gi_loc_cd_META,
			gi_loc_nm_META,
			cst_frcst_slip_d_no_META,
			prms_qty_p_META,
			frcst_stop_flg_META,
			disp_seq_META,
			dtl_intr_rmrks_META,
			dtl_sub_char1_META,
			dtl_sub_char2_META,
			dtl_sub_char3_META,
			itm_typ_META,
			itm_typ_nm_META,
			itm_typ_d_cd_META,
			itm_typ_d_nm_META,
			cst_frcst_d_no_META,
			dlv_grp_p_META,
			cst_grp_p_META,
			itm_grp_p_META,
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
			upd_srv_req_no_META
		},
		new String[][]{
			{
				"itm_cd",
				"itm_sub1",
				"itm_sub2",
				"itm_sub3",
				"itm_nm",
				"trd_unit_qty",
				"base_unit_qty",
				"last_qty",
				"spln_qty",
				"slo_qty",
				"mly_net_frcst_qty",
				"prms_qty",
				"dlv_grp_cd1",
				"dlv_grp_nm1",
				"dlv_grp_cd2",
				"dlv_grp_nm2",
				"dlv_grp_cd3",
				"dlv_grp_nm3",
				"dlv_grp_cd4",
				"dlv_grp_nm4",
				"dlv_grp_cd5",
				"dlv_grp_nm5",
				"dlv_grp_cd6",
				"dlv_grp_nm6",
				"dlv_grp_cd7",
				"dlv_grp_nm7",
				"dlv_grp_cd8",
				"dlv_grp_nm8",
				"dlv_grp_cd9",
				"dlv_grp_nm9",
				"dlv_grp_cd10",
				"dlv_grp_nm10",
				"cst_grp_cd1",
				"cst_grp_nm1",
				"cst_grp_cd2",
				"cst_grp_nm2",
				"cst_grp_cd3",
				"cst_grp_nm3",
				"cst_grp_cd4",
				"cst_grp_nm4",
				"cst_grp_cd5",
				"cst_grp_nm5",
				"cst_grp_cd6",
				"cst_grp_nm6",
				"cst_grp_cd7",
				"cst_grp_nm7",
				"cst_grp_cd8",
				"cst_grp_nm8",
				"cst_grp_cd9",
				"cst_grp_nm9",
				"cst_grp_cd10",
				"cst_grp_nm10",
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
				"itm_grp_nm10"
			},
			{
				$itm_cd,
				$itm_sub1,
				$itm_sub2,
				$itm_sub3,
				$itm_nm,
				$trd_unit_qty,
				$base_unit_qty,
				$last_qty,
				$spln_qty,
				$slo_qty,
				$mly_net_frcst_qty,
				$prms_qty,
				$dlv_grp_cd1,
				$dlv_grp_nm1,
				$dlv_grp_cd2,
				$dlv_grp_nm2,
				$dlv_grp_cd3,
				$dlv_grp_nm3,
				$dlv_grp_cd4,
				$dlv_grp_nm4,
				$dlv_grp_cd5,
				$dlv_grp_nm5,
				$dlv_grp_cd6,
				$dlv_grp_nm6,
				$dlv_grp_cd7,
				$dlv_grp_nm7,
				$dlv_grp_cd8,
				$dlv_grp_nm8,
				$dlv_grp_cd9,
				$dlv_grp_nm9,
				$dlv_grp_cd10,
				$dlv_grp_nm10,
				$cst_grp_cd1,
				$cst_grp_nm1,
				$cst_grp_cd2,
				$cst_grp_nm2,
				$cst_grp_cd3,
				$cst_grp_nm3,
				$cst_grp_cd4,
				$cst_grp_nm4,
				$cst_grp_cd5,
				$cst_grp_nm5,
				$cst_grp_cd6,
				$cst_grp_nm6,
				$cst_grp_cd7,
				$cst_grp_nm7,
				$cst_grp_cd8,
				$cst_grp_nm8,
				$cst_grp_cd9,
				$cst_grp_nm9,
				$cst_grp_cd10,
				$cst_grp_nm10,
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
				$itm_grp_nm10
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
				{$wrk_no, "WRK"},	// wrk_no
				{$wrk_nm, "WRK"},	// wrk_nm
				{$base_qty_p + ".qty", "BASE_UNIT"},	// base_qty_p.qty
				{$base_unit_cd, "BASE_UNIT"},	// base_unit_cd
				{$base_unit_nm, "BASE_UNIT"},	// base_unit_nm
				{$base_qty_dec_place, "BASE_UNIT"}	// base_qty_dec_place
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
	 * Sales forecast No. 顧客期間内示ＮＯ.<p>
	 *
	 */
	public String cst_frcst_no() {
		return getConstString(offset + 0, $cst_frcst_no);
	}

	/**
	 * Sales forecast No. 顧客期間内示ＮＯ.<p>
	 *
	 */
	public void cst_frcst_no(String value) {
		setConstString(offset + 0, $cst_frcst_no, value);
	}


	/**
	 * Customer forecast list issue date 得意先内示書発行日.<p>
	 *
	 */
	public MCDate cst_frcst_prnt_dt() {
		return getConstDate(offset + 1, $cst_frcst_prnt_dt);
	}

	/**
	 * Customer forecast list issue date 得意先内示書発行日.<p>
	 *
	 */
	public void cst_frcst_prnt_dt(MCDate value) {
		setConstDate(offset + 1, $cst_frcst_prnt_dt, value);
	}


	/**
	 * Customer cd. 得意先ＣＤ.<p>
	 *
	 */
	public String cst_cd() {
		return getConstString(offset + 2, $cst_cd);
	}

	/**
	 * Customer cd. 得意先ＣＤ.<p>
	 *
	 */
	public void cst_cd(String value) {
		setConstString(offset + 2, $cst_cd, value);
	}


	/**
	 * Customer name 得意先名.<p>
	 *
	 */
	public String cst_nm() {
		return getConstString(offset + 3, $cst_nm);
	}

	/**
	 * Customer name 得意先名.<p>
	 *
	 */
	public void cst_nm(String value) {
		setConstString(offset + 3, $cst_nm, value);
	}


	/**
	 * Delivery destination cd. 納品先ＣＤ.<p>
	 *
	 */
	public String dlv_cd() {
		return getConstString(offset + 4, $dlv_cd);
	}

	/**
	 * Delivery destination cd. 納品先ＣＤ.<p>
	 *
	 */
	public void dlv_cd(String value) {
		setConstString(offset + 4, $dlv_cd, value);
	}


	/**
	 * Delivery destination name 納品先名.<p>
	 *
	 */
	public String dlv_nm() {
		return getConstString(offset + 5, $dlv_nm);
	}

	/**
	 * Delivery destination name 納品先名.<p>
	 *
	 */
	public void dlv_nm(String value) {
		setConstString(offset + 5, $dlv_nm, value);
	}


	/**
	 * Dept. in charge cd. 担当部門ＣＤ.<p>
	 *
	 */
	public String frcst_dpt_cd() {
		return getConstString(offset + 6, $frcst_dpt_cd);
	}

	/**
	 * Dept. in charge cd. 担当部門ＣＤ.<p>
	 *
	 */
	public void frcst_dpt_cd(String value) {
		setConstString(offset + 6, $frcst_dpt_cd, value);
	}


	/**
	 * Dept. in charge name 担当部門名.<p>
	 *
	 */
	public String frcst_dpt_nm() {
		return getConstString(offset + 7, $frcst_dpt_nm);
	}

	/**
	 * Dept. in charge name 担当部門名.<p>
	 *
	 */
	public void frcst_dpt_nm(String value) {
		setConstString(offset + 7, $frcst_dpt_nm, value);
	}


	/**
	 * PIC cd. 担当者ＣＤ.<p>
	 *
	 */
	public String frcst_usr_cd() {
		return getConstString(offset + 8, $frcst_usr_cd);
	}

	/**
	 * PIC cd. 担当者ＣＤ.<p>
	 *
	 */
	public void frcst_usr_cd(String value) {
		setConstString(offset + 8, $frcst_usr_cd, value);
	}


	/**
	 * PIC name 担当者名.<p>
	 *
	 */
	public String frcst_usr_nm() {
		return getConstString(offset + 9, $frcst_usr_nm);
	}

	/**
	 * PIC name 担当者名.<p>
	 *
	 */
	public void frcst_usr_nm(String value) {
		setConstString(offset + 9, $frcst_usr_nm, value);
	}


	/**
	 * Sales project No. 案件ＮＯ.<p>
	 *
	 */
	public String wrk_no() {
		return getConstString(offset + 10, $wrk_no);
	}

	/**
	 * Sales project No. 案件ＮＯ.<p>
	 *
	 */
	public void wrk_no(String value) {
		setConstString(offset + 10, $wrk_no, value);
	}


	/**
	 * Sales project name 案件名.<p>
	 *
	 */
	public String wrk_nm() {
		return getConstString(offset + 11, $wrk_nm);
	}

	/**
	 * Sales project name 案件名.<p>
	 *
	 */
	public void wrk_nm(String value) {
		setConstString(offset + 11, $wrk_nm, value);
	}


	/**
	 * Receiving date 受付日.<p>
	 *
	 */
	public MCDate rcpt_dt() {
		return getConstDate(offset + 12, $rcpt_dt);
	}

	/**
	 * Receiving date 受付日.<p>
	 *
	 */
	public void rcpt_dt(MCDate value) {
		setConstDate(offset + 12, $rcpt_dt, value);
	}


	/**
	 * Customer forecast list No. 得意先内示書ＮＯ.<p>
	 *
	 */
	public String cst_frcst_slip_no() {
		return getConstString(offset + 13, $cst_frcst_slip_no);
	}

	/**
	 * Customer forecast list No. 得意先内示書ＮＯ.<p>
	 *
	 */
	public void cst_frcst_slip_no(String value) {
		setConstString(offset + 13, $cst_frcst_slip_no, value);
	}


	/**
	 * Cancel 取消.<p>
	 *
	 */
	public boolean can_flg() {
		return getConstBoolean(offset + 14, $can_flg);
	}

	/**
	 * Cancel 取消.<p>
	 *
	 */
	public void can_flg(boolean value) {
		setConstBoolean(offset + 14, $can_flg, value);
	}


	/**
	 * Canceling reason cd. 取消理由ＣＤ.<p>
	 *
	 */
	public String can_rsn_cd() {
		return getConstString(offset + 15, $can_rsn_cd);
	}

	/**
	 * Canceling reason cd. 取消理由ＣＤ.<p>
	 *
	 */
	public void can_rsn_cd(String value) {
		setConstString(offset + 15, $can_rsn_cd, value);
	}


	/**
	 * Canceling reason name 取消理由名.<p>
	 *
	 */
	public String can_rsn_nm() {
		return getConstString(offset + 16, $can_rsn_nm);
	}

	/**
	 * Canceling reason name 取消理由名.<p>
	 *
	 */
	public void can_rsn_nm(String value) {
		setConstString(offset + 16, $can_rsn_nm, value);
	}


	/**
	 * Cancel remarks 取消備考.<p>
	 *
	 */
	public String can_rmrks() {
		return getConstString(offset + 17, $can_rmrks);
	}

	/**
	 * Cancel remarks 取消備考.<p>
	 *
	 */
	public void can_rmrks(String value) {
		setConstString(offset + 17, $can_rmrks, value);
	}


	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public String intr_rmrks() {
		return getConstString(offset + 18, $intr_rmrks);
	}

	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public void intr_rmrks(String value) {
		setConstString(offset + 18, $intr_rmrks, value);
	}


	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public String sub_char1() {
		return getConstString(offset + 19, $sub_char1);
	}

	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public void sub_char1(String value) {
		setConstString(offset + 19, $sub_char1, value);
	}


	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public String sub_char2() {
		return getConstString(offset + 20, $sub_char2);
	}

	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public void sub_char2(String value) {
		setConstString(offset + 20, $sub_char2, value);
	}


	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public String sub_char3() {
		return getConstString(offset + 21, $sub_char3);
	}

	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public void sub_char3(String value) {
		setConstString(offset + 21, $sub_char3, value);
	}


	/**
	 * Firm 確定.<p>
	 *
	 */
	public boolean fix_flg() {
		return getConstBoolean(offset + 22, $fix_flg);
	}

	/**
	 * Firm 確定.<p>
	 *
	 */
	public void fix_flg(boolean value) {
		setConstBoolean(offset + 22, $fix_flg, value);
	}


	/**
	 * Customer item cd. 得意先品目ＣＤ.<p>
	 *
	 */
	public String cst_itm_cd() {
		return getConstString(offset + 23, $cst_itm_cd);
	}

	/**
	 * Customer item cd. 得意先品目ＣＤ.<p>
	 *
	 */
	public void cst_itm_cd(String value) {
		setConstString(offset + 23, $cst_itm_cd, value);
	}


	/**
	 * Customer item name 得意先品名.<p>
	 *
	 */
	public String cst_itm_nm() {
		return getConstString(offset + 24, $cst_itm_nm);
	}

	/**
	 * Customer item name 得意先品名.<p>
	 *
	 */
	public void cst_itm_nm(String value) {
		setConstString(offset + 24, $cst_itm_nm, value);
	}


	public mcframe.clientMAUB.MAUBP5030.ItmR itm_p(){
		return (mcframe.clientMAUB.MAUBP5030.ItmR) getConstInnerRow(offset + 25, $itm_p);
	}
	
	public void itm_p(mcframe.clientMAUB.MAUBP5030.ItmR row){
		setConstInnerRow(offset + 25, $itm_p, row);
	}


	/**
	 * Forecast period type 内示期間区分.<p>
	 *
	 */
	public String frcst_period_typ() {
		return getConstString(offset + 26, $frcst_period_typ);
	}

	/**
	 * Forecast period type 内示期間区分.<p>
	 *
	 */
	public void frcst_period_typ(String value) {
		setConstString(offset + 26, $frcst_period_typ, value);
	}


	/**
	 * Forecast period type name 内示期間区分名.<p>
	 *
	 */
	public String frcst_period_typ_nm() {
		return getConstString(offset + 27, $frcst_period_typ_nm);
	}

	/**
	 * Forecast period type name 内示期間区分名.<p>
	 *
	 */
	public void frcst_period_typ_nm(String value) {
		setConstString(offset + 27, $frcst_period_typ_nm, value);
	}


	/**
	 * Forecast period start date 内示期間開始日.<p>
	 *
	 */
	public MCDate frcst_st_dt() {
		return getConstDate(offset + 28, $frcst_st_dt);
	}

	/**
	 * Forecast period start date 内示期間開始日.<p>
	 *
	 */
	public void frcst_st_dt(MCDate value) {
		setConstDate(offset + 28, $frcst_st_dt, value);
	}


	/**
	 * Forecast period end date 内示期間終了日.<p>
	 *
	 */
	public MCDate frcst_end_dt() {
		return getConstDate(offset + 29, $frcst_end_dt);
	}

	/**
	 * Forecast period end date 内示期間終了日.<p>
	 *
	 */
	public void frcst_end_dt(MCDate value) {
		setConstDate(offset + 29, $frcst_end_dt, value);
	}


	/**
	 * Forecast period 内示期間.<p>
	 *
	 */
	public MCDate frcst_dt() {
		return getConstDate(offset + 30, $frcst_dt);
	}

	/**
	 * Forecast period 内示期間.<p>
	 *
	 */
	public void frcst_dt(MCDate value) {
		setConstDate(offset + 30, $frcst_dt, value);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR trd_qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 31, $trd_qty_p);
	}
	
	public void trd_qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 31, $trd_qty_p, row);
	}


	/**
	 * Transaction unit cd. 取引単位ＣＤ.<p>
	 *
	 */
	public String trd_unit_cd() {
		return getConstString(offset + 32, $trd_unit_cd);
	}

	/**
	 * Transaction unit cd. 取引単位ＣＤ.<p>
	 *
	 */
	public void trd_unit_cd(String value) {
		setConstString(offset + 32, $trd_unit_cd, value);
	}


	/**
	 * Transaction unit name 取引単位名.<p>
	 *
	 */
	public String trd_unit_nm() {
		return getConstString(offset + 33, $trd_unit_nm);
	}

	/**
	 * Transaction unit name 取引単位名.<p>
	 *
	 */
	public void trd_unit_nm(String value) {
		setConstString(offset + 33, $trd_unit_nm, value);
	}


	/**
	 * Transaction unit number of decimal places 取引単位小数部有効桁数.<p>
	 *
	 */
	public MCNumber qty_dec_place() {
		return getConstNumber(offset + 34, $qty_dec_place);
	}

	/**
	 * Transaction unit number of decimal places 取引単位小数部有効桁数.<p>
	 *
	 */
	public void qty_dec_place(MCNumber value) {
		setConstNumber(offset + 34, $qty_dec_place, value);
	}

	/**
	 * Transaction unit number of decimal places 取引単位小数部有効桁数.<p>
	 *
	 */
	public void qty_dec_place(int value) {
		setConstNumber(offset + 34, $qty_dec_place, value);
	}

	/**
	 * Transaction unit number of decimal places 取引単位小数部有効桁数.<p>
	 *
	 */
	public void qty_dec_place(long value) {
		setConstNumber(offset + 34, $qty_dec_place, value);
	}

	/**
	 * Transaction unit number of decimal places 取引単位小数部有効桁数.<p>
	 *
	 */
	public void qty_dec_place(float value) {
		setConstNumber(offset + 34, $qty_dec_place, value);
	}

	/**
	 * Transaction unit number of decimal places 取引単位小数部有効桁数.<p>
	 *
	 */
	public void qty_dec_place(double value) {
		setConstNumber(offset + 34, $qty_dec_place, value);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR base_qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 35, $base_qty_p);
	}
	
	public void base_qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 35, $base_qty_p, row);
	}


	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public String base_unit_cd() {
		return getConstString(offset + 36, $base_unit_cd);
	}

	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public void base_unit_cd(String value) {
		setConstString(offset + 36, $base_unit_cd, value);
	}


	/**
	 * Base unit name 基準単位名.<p>
	 *
	 */
	public String base_unit_nm() {
		return getConstString(offset + 37, $base_unit_nm);
	}

	/**
	 * Base unit name 基準単位名.<p>
	 *
	 */
	public void base_unit_nm(String value) {
		setConstString(offset + 37, $base_unit_nm, value);
	}


	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public MCNumber base_qty_dec_place() {
		return getConstNumber(offset + 38, $base_qty_dec_place);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_qty_dec_place(MCNumber value) {
		setConstNumber(offset + 38, $base_qty_dec_place, value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_qty_dec_place(int value) {
		setConstNumber(offset + 38, $base_qty_dec_place, value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_qty_dec_place(long value) {
		setConstNumber(offset + 38, $base_qty_dec_place, value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_qty_dec_place(float value) {
		setConstNumber(offset + 38, $base_qty_dec_place, value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_qty_dec_place(double value) {
		setConstNumber(offset + 38, $base_qty_dec_place, value);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR last_qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 39, $last_qty_p);
	}
	
	public void last_qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 39, $last_qty_p, row);
	}


	/**
	 * Last customer forecast list issue date 前回得意先内示書発行日.<p>
	 *
	 */
	public MCDate last_cst_frcst_prnt_dt() {
		return getConstDate(offset + 40, $last_cst_frcst_prnt_dt);
	}

	/**
	 * Last customer forecast list issue date 前回得意先内示書発行日.<p>
	 *
	 */
	public void last_cst_frcst_prnt_dt(MCDate value) {
		setConstDate(offset + 40, $last_cst_frcst_prnt_dt, value);
	}


	/**
	 * Last reception date 前回受付日.<p>
	 *
	 */
	public MCDate last_rcpt_dt() {
		return getConstDate(offset + 41, $last_rcpt_dt);
	}

	/**
	 * Last reception date 前回受付日.<p>
	 *
	 */
	public void last_rcpt_dt(MCDate value) {
		setConstDate(offset + 41, $last_rcpt_dt, value);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR spln_qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 42, $spln_qty_p);
	}
	
	public void spln_qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 42, $spln_qty_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR slo_qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 43, $slo_qty_p);
	}
	
	public void slo_qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 43, $slo_qty_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR mly_net_frcst_qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 44, $mly_net_frcst_qty_p);
	}
	
	public void mly_net_frcst_qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 44, $mly_net_frcst_qty_p, row);
	}


	/**
	 * GI source location cd. 出庫元場所ＣＤ.<p>
	 *
	 */
	public String gi_loc_cd() {
		return getConstString(offset + 45, $gi_loc_cd);
	}

	/**
	 * GI source location cd. 出庫元場所ＣＤ.<p>
	 *
	 */
	public void gi_loc_cd(String value) {
		setConstString(offset + 45, $gi_loc_cd, value);
	}


	/**
	 * GI source location name 出庫元場所名.<p>
	 *
	 */
	public String gi_loc_nm() {
		return getConstString(offset + 46, $gi_loc_nm);
	}

	/**
	 * GI source location name 出庫元場所名.<p>
	 *
	 */
	public void gi_loc_nm(String value) {
		setConstString(offset + 46, $gi_loc_nm, value);
	}


	/**
	 * Customer forecast list details No. 得意先内示書明細ＮＯ.<p>
	 *
	 */
	public String cst_frcst_slip_d_no() {
		return getConstString(offset + 47, $cst_frcst_slip_d_no);
	}

	/**
	 * Customer forecast list details No. 得意先内示書明細ＮＯ.<p>
	 *
	 */
	public void cst_frcst_slip_d_no(String value) {
		setConstString(offset + 47, $cst_frcst_slip_d_no, value);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR prms_qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 48, $prms_qty_p);
	}
	
	public void prms_qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 48, $prms_qty_p, row);
	}


	/**
	 * Lower priority 下位優先.<p>
	 *
	 */
	public boolean frcst_stop_flg() {
		return getConstBoolean(offset + 49, $frcst_stop_flg);
	}

	/**
	 * Lower priority 下位優先.<p>
	 *
	 */
	public void frcst_stop_flg(boolean value) {
		setConstBoolean(offset + 49, $frcst_stop_flg, value);
	}


	/**
	 * Display order 表示順.<p>
	 *
	 */
	public MCNumber disp_seq() {
		return getConstNumber(offset + 50, $disp_seq);
	}

	/**
	 * Display order 表示順.<p>
	 *
	 */
	public void disp_seq(MCNumber value) {
		setConstNumber(offset + 50, $disp_seq, value);
	}

	/**
	 * Display order 表示順.<p>
	 *
	 */
	public void disp_seq(int value) {
		setConstNumber(offset + 50, $disp_seq, value);
	}

	/**
	 * Display order 表示順.<p>
	 *
	 */
	public void disp_seq(long value) {
		setConstNumber(offset + 50, $disp_seq, value);
	}

	/**
	 * Display order 表示順.<p>
	 *
	 */
	public void disp_seq(float value) {
		setConstNumber(offset + 50, $disp_seq, value);
	}

	/**
	 * Display order 表示順.<p>
	 *
	 */
	public void disp_seq(double value) {
		setConstNumber(offset + 50, $disp_seq, value);
	}


	/**
	 * Details internal remarks 明細内部備考.<p>
	 *
	 */
	public String dtl_intr_rmrks() {
		return getConstString(offset + 51, $dtl_intr_rmrks);
	}

	/**
	 * Details internal remarks 明細内部備考.<p>
	 *
	 */
	public void dtl_intr_rmrks(String value) {
		setConstString(offset + 51, $dtl_intr_rmrks, value);
	}


	/**
	 * Details spare 1 明細予備１.<p>
	 *
	 */
	public String dtl_sub_char1() {
		return getConstString(offset + 52, $dtl_sub_char1);
	}

	/**
	 * Details spare 1 明細予備１.<p>
	 *
	 */
	public void dtl_sub_char1(String value) {
		setConstString(offset + 52, $dtl_sub_char1, value);
	}


	/**
	 * Details spare 2 明細予備２.<p>
	 *
	 */
	public String dtl_sub_char2() {
		return getConstString(offset + 53, $dtl_sub_char2);
	}

	/**
	 * Details spare 2 明細予備２.<p>
	 *
	 */
	public void dtl_sub_char2(String value) {
		setConstString(offset + 53, $dtl_sub_char2, value);
	}


	/**
	 * Details spare 3 明細予備３.<p>
	 *
	 */
	public String dtl_sub_char3() {
		return getConstString(offset + 54, $dtl_sub_char3);
	}

	/**
	 * Details spare 3 明細予備３.<p>
	 *
	 */
	public void dtl_sub_char3(String value) {
		setConstString(offset + 54, $dtl_sub_char3, value);
	}


	/**
	 * Item type 品目区分.<p>
	 *
	 */
	public String itm_typ() {
		return getConstString(offset + 55, $itm_typ);
	}

	/**
	 * Item type 品目区分.<p>
	 *
	 */
	public void itm_typ(String value) {
		setConstString(offset + 55, $itm_typ, value);
	}


	/**
	 * Item type name 品目区分名.<p>
	 *
	 */
	public String itm_typ_nm() {
		return getConstString(offset + 56, $itm_typ_nm);
	}

	/**
	 * Item type name 品目区分名.<p>
	 *
	 */
	public void itm_typ_nm(String value) {
		setConstString(offset + 56, $itm_typ_nm, value);
	}


	/**
	 * Item type details cd. 品目区分詳細ＣＤ.<p>
	 *
	 */
	public String itm_typ_d_cd() {
		return getConstString(offset + 57, $itm_typ_d_cd);
	}

	/**
	 * Item type details cd. 品目区分詳細ＣＤ.<p>
	 *
	 */
	public void itm_typ_d_cd(String value) {
		setConstString(offset + 57, $itm_typ_d_cd, value);
	}


	/**
	 * Item type details name 品目区分詳細名.<p>
	 *
	 */
	public String itm_typ_d_nm() {
		return getConstString(offset + 58, $itm_typ_d_nm);
	}

	/**
	 * Item type details name 品目区分詳細名.<p>
	 *
	 */
	public void itm_typ_d_nm(String value) {
		setConstString(offset + 58, $itm_typ_d_nm, value);
	}


	/**
	 * Sales forecast details No. 顧客期間内示明細ＮＯ.<p>
	 *
	 */
	public String cst_frcst_d_no() {
		return getConstString(offset + 59, $cst_frcst_d_no);
	}

	/**
	 * Sales forecast details No. 顧客期間内示明細ＮＯ.<p>
	 *
	 */
	public void cst_frcst_d_no(String value) {
		setConstString(offset + 59, $cst_frcst_d_no, value);
	}


	public mcframe.clientMAUB.MAUBP5190.BpGrpR dlv_grp_p(){
		return (mcframe.clientMAUB.MAUBP5190.BpGrpR) getConstInnerRow(offset + 60, $dlv_grp_p);
	}
	
	public void dlv_grp_p(mcframe.clientMAUB.MAUBP5190.BpGrpR row){
		setConstInnerRow(offset + 60, $dlv_grp_p, row);
	}


	public mcframe.clientMAUB.MAUBP5190.BpGrpR cst_grp_p(){
		return (mcframe.clientMAUB.MAUBP5190.BpGrpR) getConstInnerRow(offset + 61, $cst_grp_p);
	}
	
	public void cst_grp_p(mcframe.clientMAUB.MAUBP5190.BpGrpR row){
		setConstInnerRow(offset + 61, $cst_grp_p, row);
	}


	public mcframe.clientMAUB.MAUBP5170.ItmGrpR itm_grp_p(){
		return (mcframe.clientMAUB.MAUBP5170.ItmGrpR) getConstInnerRow(offset + 62, $itm_grp_p);
	}
	
	public void itm_grp_p(mcframe.clientMAUB.MAUBP5170.ItmGrpR row){
		setConstInnerRow(offset + 62, $itm_grp_p, row);
	}


	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public String ins_usr_id() {
		return getConstString(offset + 63, $ins_usr_id);
	}

	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public void ins_usr_id(String value) {
		setConstString(offset + 63, $ins_usr_id, value);
	}


	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public String ins_usr_nm() {
		return getConstString(offset + 64, $ins_usr_nm);
	}

	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public void ins_usr_nm(String value) {
		setConstString(offset + 64, $ins_usr_nm, value);
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
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public MCTimestamp ins_ts() {
		return getConstTimestamp(offset + 67, $ins_ts);
	}

	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public void ins_ts(MCTimestamp value) {
		setConstTimestamp(offset + 67, $ins_ts, value);
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
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public String upd_func_id() {
		return getConstString(offset + 70, $upd_func_id);
	}

	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public void upd_func_id(String value) {
		setConstString(offset + 70, $upd_func_id, value);
	}


	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public String upd_func_nm() {
		return getConstString(offset + 71, $upd_func_nm);
	}

	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public void upd_func_nm(String value) {
		setConstString(offset + 71, $upd_func_nm, value);
	}


	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public MCTimestamp upd_ts() {
		return getConstTimestamp(offset + 72, $upd_ts);
	}

	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public void upd_ts(MCTimestamp value) {
		setConstTimestamp(offset + 72, $upd_ts, value);
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


	public String getString(String name) {
		if ($cst_frcst_no.equalsIgnoreCase(name)) {
			return cst_frcst_no();
		}
		if ($cst_cd.equalsIgnoreCase(name)) {
			return cst_cd();
		}
		if ($cst_nm.equalsIgnoreCase(name)) {
			return cst_nm();
		}
		if ($dlv_cd.equalsIgnoreCase(name)) {
			return dlv_cd();
		}
		if ($dlv_nm.equalsIgnoreCase(name)) {
			return dlv_nm();
		}
		if ($frcst_dpt_cd.equalsIgnoreCase(name)) {
			return frcst_dpt_cd();
		}
		if ($frcst_dpt_nm.equalsIgnoreCase(name)) {
			return frcst_dpt_nm();
		}
		if ($frcst_usr_cd.equalsIgnoreCase(name)) {
			return frcst_usr_cd();
		}
		if ($frcst_usr_nm.equalsIgnoreCase(name)) {
			return frcst_usr_nm();
		}
		if ($wrk_no.equalsIgnoreCase(name)) {
			return wrk_no();
		}
		if ($wrk_nm.equalsIgnoreCase(name)) {
			return wrk_nm();
		}
		if ($cst_frcst_slip_no.equalsIgnoreCase(name)) {
			return cst_frcst_slip_no();
		}
		if ($can_rsn_cd.equalsIgnoreCase(name)) {
			return can_rsn_cd();
		}
		if ($can_rsn_nm.equalsIgnoreCase(name)) {
			return can_rsn_nm();
		}
		if ($can_rmrks.equalsIgnoreCase(name)) {
			return can_rmrks();
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
		if ($cst_itm_cd.equalsIgnoreCase(name)) {
			return cst_itm_cd();
		}
		if ($cst_itm_nm.equalsIgnoreCase(name)) {
			return cst_itm_nm();
		}
		if ($frcst_period_typ.equalsIgnoreCase(name)) {
			return frcst_period_typ();
		}
		if ($frcst_period_typ_nm.equalsIgnoreCase(name)) {
			return frcst_period_typ_nm();
		}
		if ($trd_unit_cd.equalsIgnoreCase(name)) {
			return trd_unit_cd();
		}
		if ($trd_unit_nm.equalsIgnoreCase(name)) {
			return trd_unit_nm();
		}
		if ($base_unit_cd.equalsIgnoreCase(name)) {
			return base_unit_cd();
		}
		if ($base_unit_nm.equalsIgnoreCase(name)) {
			return base_unit_nm();
		}
		if ($gi_loc_cd.equalsIgnoreCase(name)) {
			return gi_loc_cd();
		}
		if ($gi_loc_nm.equalsIgnoreCase(name)) {
			return gi_loc_nm();
		}
		if ($cst_frcst_slip_d_no.equalsIgnoreCase(name)) {
			return cst_frcst_slip_d_no();
		}
		if ($dtl_intr_rmrks.equalsIgnoreCase(name)) {
			return dtl_intr_rmrks();
		}
		if ($dtl_sub_char1.equalsIgnoreCase(name)) {
			return dtl_sub_char1();
		}
		if ($dtl_sub_char2.equalsIgnoreCase(name)) {
			return dtl_sub_char2();
		}
		if ($dtl_sub_char3.equalsIgnoreCase(name)) {
			return dtl_sub_char3();
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
		if ($cst_frcst_d_no.equalsIgnoreCase(name)) {
			return cst_frcst_d_no();
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
		if ($qty_dec_place.equalsIgnoreCase(name)) {
			return qty_dec_place();
		}
		if ($base_qty_dec_place.equalsIgnoreCase(name)) {
			return base_qty_dec_place();
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			return disp_seq();
		}
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		if ($cst_frcst_prnt_dt.equalsIgnoreCase(name)) {
			return cst_frcst_prnt_dt();
		}
		if ($rcpt_dt.equalsIgnoreCase(name)) {
			return rcpt_dt();
		}
		if ($frcst_st_dt.equalsIgnoreCase(name)) {
			return frcst_st_dt();
		}
		if ($frcst_end_dt.equalsIgnoreCase(name)) {
			return frcst_end_dt();
		}
		if ($frcst_dt.equalsIgnoreCase(name)) {
			return frcst_dt();
		}
		if ($last_cst_frcst_prnt_dt.equalsIgnoreCase(name)) {
			return last_cst_frcst_prnt_dt();
		}
		if ($last_rcpt_dt.equalsIgnoreCase(name)) {
			return last_rcpt_dt();
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
		if ($can_flg.equalsIgnoreCase(name)) {
			return can_flg();
		}
		if ($fix_flg.equalsIgnoreCase(name)) {
			return fix_flg();
		}
		if ($frcst_stop_flg.equalsIgnoreCase(name)) {
			return frcst_stop_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($cst_frcst_no.equalsIgnoreCase(name)) {
			return cst_frcst_no();
		}
		if ($cst_cd.equalsIgnoreCase(name)) {
			return cst_cd();
		}
		if ($cst_nm.equalsIgnoreCase(name)) {
			return cst_nm();
		}
		if ($dlv_cd.equalsIgnoreCase(name)) {
			return dlv_cd();
		}
		if ($dlv_nm.equalsIgnoreCase(name)) {
			return dlv_nm();
		}
		if ($frcst_dpt_cd.equalsIgnoreCase(name)) {
			return frcst_dpt_cd();
		}
		if ($frcst_dpt_nm.equalsIgnoreCase(name)) {
			return frcst_dpt_nm();
		}
		if ($frcst_usr_cd.equalsIgnoreCase(name)) {
			return frcst_usr_cd();
		}
		if ($frcst_usr_nm.equalsIgnoreCase(name)) {
			return frcst_usr_nm();
		}
		if ($wrk_no.equalsIgnoreCase(name)) {
			return wrk_no();
		}
		if ($wrk_nm.equalsIgnoreCase(name)) {
			return wrk_nm();
		}
		if ($cst_frcst_slip_no.equalsIgnoreCase(name)) {
			return cst_frcst_slip_no();
		}
		if ($can_rsn_cd.equalsIgnoreCase(name)) {
			return can_rsn_cd();
		}
		if ($can_rsn_nm.equalsIgnoreCase(name)) {
			return can_rsn_nm();
		}
		if ($can_rmrks.equalsIgnoreCase(name)) {
			return can_rmrks();
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
		if ($cst_itm_cd.equalsIgnoreCase(name)) {
			return cst_itm_cd();
		}
		if ($cst_itm_nm.equalsIgnoreCase(name)) {
			return cst_itm_nm();
		}
		if ($frcst_period_typ.equalsIgnoreCase(name)) {
			return frcst_period_typ();
		}
		if ($frcst_period_typ_nm.equalsIgnoreCase(name)) {
			return frcst_period_typ_nm();
		}
		if ($trd_unit_cd.equalsIgnoreCase(name)) {
			return trd_unit_cd();
		}
		if ($trd_unit_nm.equalsIgnoreCase(name)) {
			return trd_unit_nm();
		}
		if ($base_unit_cd.equalsIgnoreCase(name)) {
			return base_unit_cd();
		}
		if ($base_unit_nm.equalsIgnoreCase(name)) {
			return base_unit_nm();
		}
		if ($gi_loc_cd.equalsIgnoreCase(name)) {
			return gi_loc_cd();
		}
		if ($gi_loc_nm.equalsIgnoreCase(name)) {
			return gi_loc_nm();
		}
		if ($cst_frcst_slip_d_no.equalsIgnoreCase(name)) {
			return cst_frcst_slip_d_no();
		}
		if ($dtl_intr_rmrks.equalsIgnoreCase(name)) {
			return dtl_intr_rmrks();
		}
		if ($dtl_sub_char1.equalsIgnoreCase(name)) {
			return dtl_sub_char1();
		}
		if ($dtl_sub_char2.equalsIgnoreCase(name)) {
			return dtl_sub_char2();
		}
		if ($dtl_sub_char3.equalsIgnoreCase(name)) {
			return dtl_sub_char3();
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
		if ($cst_frcst_d_no.equalsIgnoreCase(name)) {
			return cst_frcst_d_no();
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
		if ($qty_dec_place.equalsIgnoreCase(name)) {
			return qty_dec_place();
		}
		if ($base_qty_dec_place.equalsIgnoreCase(name)) {
			return base_qty_dec_place();
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			return disp_seq();
		}
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($cst_frcst_prnt_dt.equalsIgnoreCase(name)) {
			return cst_frcst_prnt_dt();
		}
		if ($rcpt_dt.equalsIgnoreCase(name)) {
			return rcpt_dt();
		}
		if ($frcst_st_dt.equalsIgnoreCase(name)) {
			return frcst_st_dt();
		}
		if ($frcst_end_dt.equalsIgnoreCase(name)) {
			return frcst_end_dt();
		}
		if ($frcst_dt.equalsIgnoreCase(name)) {
			return frcst_dt();
		}
		if ($last_cst_frcst_prnt_dt.equalsIgnoreCase(name)) {
			return last_cst_frcst_prnt_dt();
		}
		if ($last_rcpt_dt.equalsIgnoreCase(name)) {
			return last_rcpt_dt();
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
		if ($can_flg.equalsIgnoreCase(name)) {
			return can_flg();
		}
		if ($fix_flg.equalsIgnoreCase(name)) {
			return fix_flg();
		}
		if ($frcst_stop_flg.equalsIgnoreCase(name)) {
			return frcst_stop_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($cst_frcst_no.equalsIgnoreCase(name)) {
			cst_frcst_no(value);
			return;
		}
		if ($cst_cd.equalsIgnoreCase(name)) {
			cst_cd(value);
			return;
		}
		if ($cst_nm.equalsIgnoreCase(name)) {
			cst_nm(value);
			return;
		}
		if ($dlv_cd.equalsIgnoreCase(name)) {
			dlv_cd(value);
			return;
		}
		if ($dlv_nm.equalsIgnoreCase(name)) {
			dlv_nm(value);
			return;
		}
		if ($frcst_dpt_cd.equalsIgnoreCase(name)) {
			frcst_dpt_cd(value);
			return;
		}
		if ($frcst_dpt_nm.equalsIgnoreCase(name)) {
			frcst_dpt_nm(value);
			return;
		}
		if ($frcst_usr_cd.equalsIgnoreCase(name)) {
			frcst_usr_cd(value);
			return;
		}
		if ($frcst_usr_nm.equalsIgnoreCase(name)) {
			frcst_usr_nm(value);
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
		if ($cst_frcst_slip_no.equalsIgnoreCase(name)) {
			cst_frcst_slip_no(value);
			return;
		}
		if ($can_rsn_cd.equalsIgnoreCase(name)) {
			can_rsn_cd(value);
			return;
		}
		if ($can_rsn_nm.equalsIgnoreCase(name)) {
			can_rsn_nm(value);
			return;
		}
		if ($can_rmrks.equalsIgnoreCase(name)) {
			can_rmrks(value);
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
		if ($cst_itm_cd.equalsIgnoreCase(name)) {
			cst_itm_cd(value);
			return;
		}
		if ($cst_itm_nm.equalsIgnoreCase(name)) {
			cst_itm_nm(value);
			return;
		}
		if ($frcst_period_typ.equalsIgnoreCase(name)) {
			frcst_period_typ(value);
			return;
		}
		if ($frcst_period_typ_nm.equalsIgnoreCase(name)) {
			frcst_period_typ_nm(value);
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
		if ($base_unit_cd.equalsIgnoreCase(name)) {
			base_unit_cd(value);
			return;
		}
		if ($base_unit_nm.equalsIgnoreCase(name)) {
			base_unit_nm(value);
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
		if ($cst_frcst_slip_d_no.equalsIgnoreCase(name)) {
			cst_frcst_slip_d_no(value);
			return;
		}
		if ($dtl_intr_rmrks.equalsIgnoreCase(name)) {
			dtl_intr_rmrks(value);
			return;
		}
		if ($dtl_sub_char1.equalsIgnoreCase(name)) {
			dtl_sub_char1(value);
			return;
		}
		if ($dtl_sub_char2.equalsIgnoreCase(name)) {
			dtl_sub_char2(value);
			return;
		}
		if ($dtl_sub_char3.equalsIgnoreCase(name)) {
			dtl_sub_char3(value);
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
		if ($cst_frcst_d_no.equalsIgnoreCase(name)) {
			cst_frcst_d_no(value);
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
		if ($qty_dec_place.equalsIgnoreCase(name)) {
			qty_dec_place(value);
			return;
		}
		if ($base_qty_dec_place.equalsIgnoreCase(name)) {
			base_qty_dec_place(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($qty_dec_place.equalsIgnoreCase(name)) {
			qty_dec_place(value);
			return;
		}
		if ($base_qty_dec_place.equalsIgnoreCase(name)) {
			base_qty_dec_place(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($qty_dec_place.equalsIgnoreCase(name)) {
			qty_dec_place(value);
			return;
		}
		if ($base_qty_dec_place.equalsIgnoreCase(name)) {
			base_qty_dec_place(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($qty_dec_place.equalsIgnoreCase(name)) {
			qty_dec_place(value);
			return;
		}
		if ($base_qty_dec_place.equalsIgnoreCase(name)) {
			base_qty_dec_place(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($qty_dec_place.equalsIgnoreCase(name)) {
			qty_dec_place(value);
			return;
		}
		if ($base_qty_dec_place.equalsIgnoreCase(name)) {
			base_qty_dec_place(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($cst_frcst_prnt_dt.equalsIgnoreCase(name)) {
			cst_frcst_prnt_dt(value);
			return;
		}
		if ($rcpt_dt.equalsIgnoreCase(name)) {
			rcpt_dt(value);
			return;
		}
		if ($frcst_st_dt.equalsIgnoreCase(name)) {
			frcst_st_dt(value);
			return;
		}
		if ($frcst_end_dt.equalsIgnoreCase(name)) {
			frcst_end_dt(value);
			return;
		}
		if ($frcst_dt.equalsIgnoreCase(name)) {
			frcst_dt(value);
			return;
		}
		if ($last_cst_frcst_prnt_dt.equalsIgnoreCase(name)) {
			last_cst_frcst_prnt_dt(value);
			return;
		}
		if ($last_rcpt_dt.equalsIgnoreCase(name)) {
			last_rcpt_dt(value);
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
		if ($can_flg.equalsIgnoreCase(name)) {
			can_flg(value);
			return;
		}
		if ($fix_flg.equalsIgnoreCase(name)) {
			fix_flg(value);
			return;
		}
		if ($frcst_stop_flg.equalsIgnoreCase(name)) {
			frcst_stop_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($cst_frcst_no.equalsIgnoreCase(name)) {
			cst_frcst_no(value);
			return;
		}
		if ($cst_cd.equalsIgnoreCase(name)) {
			cst_cd(value);
			return;
		}
		if ($cst_nm.equalsIgnoreCase(name)) {
			cst_nm(value);
			return;
		}
		if ($dlv_cd.equalsIgnoreCase(name)) {
			dlv_cd(value);
			return;
		}
		if ($dlv_nm.equalsIgnoreCase(name)) {
			dlv_nm(value);
			return;
		}
		if ($frcst_dpt_cd.equalsIgnoreCase(name)) {
			frcst_dpt_cd(value);
			return;
		}
		if ($frcst_dpt_nm.equalsIgnoreCase(name)) {
			frcst_dpt_nm(value);
			return;
		}
		if ($frcst_usr_cd.equalsIgnoreCase(name)) {
			frcst_usr_cd(value);
			return;
		}
		if ($frcst_usr_nm.equalsIgnoreCase(name)) {
			frcst_usr_nm(value);
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
		if ($cst_frcst_slip_no.equalsIgnoreCase(name)) {
			cst_frcst_slip_no(value);
			return;
		}
		if ($can_rsn_cd.equalsIgnoreCase(name)) {
			can_rsn_cd(value);
			return;
		}
		if ($can_rsn_nm.equalsIgnoreCase(name)) {
			can_rsn_nm(value);
			return;
		}
		if ($can_rmrks.equalsIgnoreCase(name)) {
			can_rmrks(value);
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
		if ($cst_itm_cd.equalsIgnoreCase(name)) {
			cst_itm_cd(value);
			return;
		}
		if ($cst_itm_nm.equalsIgnoreCase(name)) {
			cst_itm_nm(value);
			return;
		}
		if ($frcst_period_typ.equalsIgnoreCase(name)) {
			frcst_period_typ(value);
			return;
		}
		if ($frcst_period_typ_nm.equalsIgnoreCase(name)) {
			frcst_period_typ_nm(value);
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
		if ($base_unit_cd.equalsIgnoreCase(name)) {
			base_unit_cd(value);
			return;
		}
		if ($base_unit_nm.equalsIgnoreCase(name)) {
			base_unit_nm(value);
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
		if ($cst_frcst_slip_d_no.equalsIgnoreCase(name)) {
			cst_frcst_slip_d_no(value);
			return;
		}
		if ($dtl_intr_rmrks.equalsIgnoreCase(name)) {
			dtl_intr_rmrks(value);
			return;
		}
		if ($dtl_sub_char1.equalsIgnoreCase(name)) {
			dtl_sub_char1(value);
			return;
		}
		if ($dtl_sub_char2.equalsIgnoreCase(name)) {
			dtl_sub_char2(value);
			return;
		}
		if ($dtl_sub_char3.equalsIgnoreCase(name)) {
			dtl_sub_char3(value);
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
		if ($cst_frcst_d_no.equalsIgnoreCase(name)) {
			cst_frcst_d_no(value);
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
		if ($qty_dec_place.equalsIgnoreCase(name)) {
			qty_dec_place(value);
			return;
		}
		if ($base_qty_dec_place.equalsIgnoreCase(name)) {
			base_qty_dec_place(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($qty_dec_place.equalsIgnoreCase(name)) {
			qty_dec_place(value);
			return;
		}
		if ($base_qty_dec_place.equalsIgnoreCase(name)) {
			base_qty_dec_place(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($qty_dec_place.equalsIgnoreCase(name)) {
			qty_dec_place(value);
			return;
		}
		if ($base_qty_dec_place.equalsIgnoreCase(name)) {
			base_qty_dec_place(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($qty_dec_place.equalsIgnoreCase(name)) {
			qty_dec_place(value);
			return;
		}
		if ($base_qty_dec_place.equalsIgnoreCase(name)) {
			base_qty_dec_place(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($qty_dec_place.equalsIgnoreCase(name)) {
			qty_dec_place(value);
			return;
		}
		if ($base_qty_dec_place.equalsIgnoreCase(name)) {
			base_qty_dec_place(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($cst_frcst_prnt_dt.equalsIgnoreCase(name)) {
			cst_frcst_prnt_dt(value);
			return;
		}
		if ($rcpt_dt.equalsIgnoreCase(name)) {
			rcpt_dt(value);
			return;
		}
		if ($frcst_st_dt.equalsIgnoreCase(name)) {
			frcst_st_dt(value);
			return;
		}
		if ($frcst_end_dt.equalsIgnoreCase(name)) {
			frcst_end_dt(value);
			return;
		}
		if ($frcst_dt.equalsIgnoreCase(name)) {
			frcst_dt(value);
			return;
		}
		if ($last_cst_frcst_prnt_dt.equalsIgnoreCase(name)) {
			last_cst_frcst_prnt_dt(value);
			return;
		}
		if ($last_rcpt_dt.equalsIgnoreCase(name)) {
			last_rcpt_dt(value);
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
		if ($can_flg.equalsIgnoreCase(name)) {
			can_flg(value);
			return;
		}
		if ($fix_flg.equalsIgnoreCase(name)) {
			fix_flg(value);
			return;
		}
		if ($frcst_stop_flg.equalsIgnoreCase(name)) {
			frcst_stop_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}

	public MCRow getInnerRow(String name) {
		if ($itm_p.equalsIgnoreCase(name)) {
			return itm_p();
		}
		if ($trd_qty_p.equalsIgnoreCase(name)) {
			return trd_qty_p();
		}
		if ($base_qty_p.equalsIgnoreCase(name)) {
			return base_qty_p();
		}
		if ($last_qty_p.equalsIgnoreCase(name)) {
			return last_qty_p();
		}
		if ($spln_qty_p.equalsIgnoreCase(name)) {
			return spln_qty_p();
		}
		if ($slo_qty_p.equalsIgnoreCase(name)) {
			return slo_qty_p();
		}
		if ($mly_net_frcst_qty_p.equalsIgnoreCase(name)) {
			return mly_net_frcst_qty_p();
		}
		if ($prms_qty_p.equalsIgnoreCase(name)) {
			return prms_qty_p();
		}
		if ($dlv_grp_p.equalsIgnoreCase(name)) {
			return dlv_grp_p();
		}
		if ($cst_grp_p.equalsIgnoreCase(name)) {
			return cst_grp_p();
		}
		if ($itm_grp_p.equalsIgnoreCase(name)) {
			return itm_grp_p();
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
		if ($trd_qty_p.equalsIgnoreCase(name)) {
			trd_qty_p(
				((MCContainerMeta) trd_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($base_qty_p.equalsIgnoreCase(name)) {
			base_qty_p(
				((MCContainerMeta) base_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($last_qty_p.equalsIgnoreCase(name)) {
			last_qty_p(
				((MCContainerMeta) last_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($spln_qty_p.equalsIgnoreCase(name)) {
			spln_qty_p(
				((MCContainerMeta) spln_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($slo_qty_p.equalsIgnoreCase(name)) {
			slo_qty_p(
				((MCContainerMeta) slo_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($mly_net_frcst_qty_p.equalsIgnoreCase(name)) {
			mly_net_frcst_qty_p(
				((MCContainerMeta) mly_net_frcst_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($prms_qty_p.equalsIgnoreCase(name)) {
			prms_qty_p(
				((MCContainerMeta) prms_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($dlv_grp_p.equalsIgnoreCase(name)) {
			dlv_grp_p(
				((MCContainerMeta) dlv_grp_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5190.BpGrpR.class, value)
			);
			return;
		}
		if ($cst_grp_p.equalsIgnoreCase(name)) {
			cst_grp_p(
				((MCContainerMeta) cst_grp_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5190.BpGrpR.class, value)
			);
			return;
		}
		if ($itm_grp_p.equalsIgnoreCase(name)) {
			itm_grp_p(
				((MCContainerMeta) itm_grp_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5170.ItmGrpR.class, value)
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

	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public MCNumber trd_unit_qty() {
		return trd_qty_p().qty();
	}

	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public void trd_unit_qty(MCNumber value) {
		trd_qty_p().qty(value);
	}

	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public void trd_unit_qty(int value) {
		trd_qty_p().qty(value);
	}

	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public void trd_unit_qty(long value) {
		trd_qty_p().qty(value);
	}

	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public void trd_unit_qty(float value) {
		trd_qty_p().qty(value);
	}

	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public void trd_unit_qty(double value) {
		trd_qty_p().qty(value);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public MCNumber base_unit_qty() {
		return base_qty_p().qty();
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(MCNumber value) {
		base_qty_p().qty(value);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(int value) {
		base_qty_p().qty(value);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(long value) {
		base_qty_p().qty(value);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(float value) {
		base_qty_p().qty(value);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(double value) {
		base_qty_p().qty(value);
	}

	/**
	 * Last forecast base unit qty. 前回内示基準単位数量.<p>
	 *
	 */
	public MCNumber last_qty() {
		return last_qty_p().qty();
	}

	/**
	 * Last forecast base unit qty. 前回内示基準単位数量.<p>
	 *
	 */
	public void last_qty(MCNumber value) {
		last_qty_p().qty(value);
	}

	/**
	 * Last forecast base unit qty. 前回内示基準単位数量.<p>
	 *
	 */
	public void last_qty(int value) {
		last_qty_p().qty(value);
	}

	/**
	 * Last forecast base unit qty. 前回内示基準単位数量.<p>
	 *
	 */
	public void last_qty(long value) {
		last_qty_p().qty(value);
	}

	/**
	 * Last forecast base unit qty. 前回内示基準単位数量.<p>
	 *
	 */
	public void last_qty(float value) {
		last_qty_p().qty(value);
	}

	/**
	 * Last forecast base unit qty. 前回内示基準単位数量.<p>
	 *
	 */
	public void last_qty(double value) {
		last_qty_p().qty(value);
	}

	/**
	 * Monthly sales plan qty. 月次販売計画数量.<p>
	 *
	 */
	public MCNumber spln_qty() {
		return spln_qty_p().qty();
	}

	/**
	 * Monthly sales plan qty. 月次販売計画数量.<p>
	 *
	 */
	public void spln_qty(MCNumber value) {
		spln_qty_p().qty(value);
	}

	/**
	 * Monthly sales plan qty. 月次販売計画数量.<p>
	 *
	 */
	public void spln_qty(int value) {
		spln_qty_p().qty(value);
	}

	/**
	 * Monthly sales plan qty. 月次販売計画数量.<p>
	 *
	 */
	public void spln_qty(long value) {
		spln_qty_p().qty(value);
	}

	/**
	 * Monthly sales plan qty. 月次販売計画数量.<p>
	 *
	 */
	public void spln_qty(float value) {
		spln_qty_p().qty(value);
	}

	/**
	 * Monthly sales plan qty. 月次販売計画数量.<p>
	 *
	 */
	public void spln_qty(double value) {
		spln_qty_p().qty(value);
	}

	/**
	 * Sales order qty. 受注数量.<p>
	 *
	 */
	public MCNumber slo_qty() {
		return slo_qty_p().qty();
	}

	/**
	 * Sales order qty. 受注数量.<p>
	 *
	 */
	public void slo_qty(MCNumber value) {
		slo_qty_p().qty(value);
	}

	/**
	 * Sales order qty. 受注数量.<p>
	 *
	 */
	public void slo_qty(int value) {
		slo_qty_p().qty(value);
	}

	/**
	 * Sales order qty. 受注数量.<p>
	 *
	 */
	public void slo_qty(long value) {
		slo_qty_p().qty(value);
	}

	/**
	 * Sales order qty. 受注数量.<p>
	 *
	 */
	public void slo_qty(float value) {
		slo_qty_p().qty(value);
	}

	/**
	 * Sales order qty. 受注数量.<p>
	 *
	 */
	public void slo_qty(double value) {
		slo_qty_p().qty(value);
	}

	/**
	 * Monthly net forecast qty. 月次正味内示数量.<p>
	 *
	 */
	public MCNumber mly_net_frcst_qty() {
		return mly_net_frcst_qty_p().qty();
	}

	/**
	 * Monthly net forecast qty. 月次正味内示数量.<p>
	 *
	 */
	public void mly_net_frcst_qty(MCNumber value) {
		mly_net_frcst_qty_p().qty(value);
	}

	/**
	 * Monthly net forecast qty. 月次正味内示数量.<p>
	 *
	 */
	public void mly_net_frcst_qty(int value) {
		mly_net_frcst_qty_p().qty(value);
	}

	/**
	 * Monthly net forecast qty. 月次正味内示数量.<p>
	 *
	 */
	public void mly_net_frcst_qty(long value) {
		mly_net_frcst_qty_p().qty(value);
	}

	/**
	 * Monthly net forecast qty. 月次正味内示数量.<p>
	 *
	 */
	public void mly_net_frcst_qty(float value) {
		mly_net_frcst_qty_p().qty(value);
	}

	/**
	 * Monthly net forecast qty. 月次正味内示数量.<p>
	 *
	 */
	public void mly_net_frcst_qty(double value) {
		mly_net_frcst_qty_p().qty(value);
	}

	/**
	 * Replied qty. 回答数量.<p>
	 *
	 */
	public MCNumber prms_qty() {
		return prms_qty_p().qty();
	}

	/**
	 * Replied qty. 回答数量.<p>
	 *
	 */
	public void prms_qty(MCNumber value) {
		prms_qty_p().qty(value);
	}

	/**
	 * Replied qty. 回答数量.<p>
	 *
	 */
	public void prms_qty(int value) {
		prms_qty_p().qty(value);
	}

	/**
	 * Replied qty. 回答数量.<p>
	 *
	 */
	public void prms_qty(long value) {
		prms_qty_p().qty(value);
	}

	/**
	 * Replied qty. 回答数量.<p>
	 *
	 */
	public void prms_qty(float value) {
		prms_qty_p().qty(value);
	}

	/**
	 * Replied qty. 回答数量.<p>
	 *
	 */
	public void prms_qty(double value) {
		prms_qty_p().qty(value);
	}

	/**
	 * Delivery destination classification cd. 1 納品先分類ＣＤ１.<p>
	 *
	 */
	public String dlv_grp_cd1() {
		return dlv_grp_p().bp_grp_cd1();
	}

	/**
	 * Delivery destination classification cd. 1 納品先分類ＣＤ１.<p>
	 *
	 */
	public void dlv_grp_cd1(String value) {
		dlv_grp_p().bp_grp_cd1(value);
	}

	/**
	 * Delivery destination classification name 1 納品先分類名１.<p>
	 *
	 */
	public String dlv_grp_nm1() {
		return dlv_grp_p().bp_grp_nm1();
	}

	/**
	 * Delivery destination classification name 1 納品先分類名１.<p>
	 *
	 */
	public void dlv_grp_nm1(String value) {
		dlv_grp_p().bp_grp_nm1(value);
	}

	/**
	 * Delivery destination classification cd. 2 納品先分類ＣＤ２.<p>
	 *
	 */
	public String dlv_grp_cd2() {
		return dlv_grp_p().bp_grp_cd2();
	}

	/**
	 * Delivery destination classification cd. 2 納品先分類ＣＤ２.<p>
	 *
	 */
	public void dlv_grp_cd2(String value) {
		dlv_grp_p().bp_grp_cd2(value);
	}

	/**
	 * Delivery destination classification name 2 納品先分類名２.<p>
	 *
	 */
	public String dlv_grp_nm2() {
		return dlv_grp_p().bp_grp_nm2();
	}

	/**
	 * Delivery destination classification name 2 納品先分類名２.<p>
	 *
	 */
	public void dlv_grp_nm2(String value) {
		dlv_grp_p().bp_grp_nm2(value);
	}

	/**
	 * Delivery destination classification cd. 3 納品先分類ＣＤ３.<p>
	 *
	 */
	public String dlv_grp_cd3() {
		return dlv_grp_p().bp_grp_cd3();
	}

	/**
	 * Delivery destination classification cd. 3 納品先分類ＣＤ３.<p>
	 *
	 */
	public void dlv_grp_cd3(String value) {
		dlv_grp_p().bp_grp_cd3(value);
	}

	/**
	 * Delivery destination classification name 3 納品先分類名３.<p>
	 *
	 */
	public String dlv_grp_nm3() {
		return dlv_grp_p().bp_grp_nm3();
	}

	/**
	 * Delivery destination classification name 3 納品先分類名３.<p>
	 *
	 */
	public void dlv_grp_nm3(String value) {
		dlv_grp_p().bp_grp_nm3(value);
	}

	/**
	 * Delivery destination classification cd. 4 納品先分類ＣＤ４.<p>
	 *
	 */
	public String dlv_grp_cd4() {
		return dlv_grp_p().bp_grp_cd4();
	}

	/**
	 * Delivery destination classification cd. 4 納品先分類ＣＤ４.<p>
	 *
	 */
	public void dlv_grp_cd4(String value) {
		dlv_grp_p().bp_grp_cd4(value);
	}

	/**
	 * Delivery destination classification name 4 納品先分類名４.<p>
	 *
	 */
	public String dlv_grp_nm4() {
		return dlv_grp_p().bp_grp_nm4();
	}

	/**
	 * Delivery destination classification name 4 納品先分類名４.<p>
	 *
	 */
	public void dlv_grp_nm4(String value) {
		dlv_grp_p().bp_grp_nm4(value);
	}

	/**
	 * Delivery destination classification cd. 5 納品先分類ＣＤ５.<p>
	 *
	 */
	public String dlv_grp_cd5() {
		return dlv_grp_p().bp_grp_cd5();
	}

	/**
	 * Delivery destination classification cd. 5 納品先分類ＣＤ５.<p>
	 *
	 */
	public void dlv_grp_cd5(String value) {
		dlv_grp_p().bp_grp_cd5(value);
	}

	/**
	 * Delivery destination classification name 5 納品先分類名５.<p>
	 *
	 */
	public String dlv_grp_nm5() {
		return dlv_grp_p().bp_grp_nm5();
	}

	/**
	 * Delivery destination classification name 5 納品先分類名５.<p>
	 *
	 */
	public void dlv_grp_nm5(String value) {
		dlv_grp_p().bp_grp_nm5(value);
	}

	/**
	 * Delivery destination classification cd. 6 納品先分類ＣＤ６.<p>
	 *
	 */
	public String dlv_grp_cd6() {
		return dlv_grp_p().bp_grp_cd6();
	}

	/**
	 * Delivery destination classification cd. 6 納品先分類ＣＤ６.<p>
	 *
	 */
	public void dlv_grp_cd6(String value) {
		dlv_grp_p().bp_grp_cd6(value);
	}

	/**
	 * Delivery destination classification name 6 納品先分類名６.<p>
	 *
	 */
	public String dlv_grp_nm6() {
		return dlv_grp_p().bp_grp_nm6();
	}

	/**
	 * Delivery destination classification name 6 納品先分類名６.<p>
	 *
	 */
	public void dlv_grp_nm6(String value) {
		dlv_grp_p().bp_grp_nm6(value);
	}

	/**
	 * Delivery destination classification cd. 7 納品先分類ＣＤ７.<p>
	 *
	 */
	public String dlv_grp_cd7() {
		return dlv_grp_p().bp_grp_cd7();
	}

	/**
	 * Delivery destination classification cd. 7 納品先分類ＣＤ７.<p>
	 *
	 */
	public void dlv_grp_cd7(String value) {
		dlv_grp_p().bp_grp_cd7(value);
	}

	/**
	 * Delivery destination classification name 7 納品先分類名７.<p>
	 *
	 */
	public String dlv_grp_nm7() {
		return dlv_grp_p().bp_grp_nm7();
	}

	/**
	 * Delivery destination classification name 7 納品先分類名７.<p>
	 *
	 */
	public void dlv_grp_nm7(String value) {
		dlv_grp_p().bp_grp_nm7(value);
	}

	/**
	 * Delivery destination classification cd. 8 納品先分類ＣＤ８.<p>
	 *
	 */
	public String dlv_grp_cd8() {
		return dlv_grp_p().bp_grp_cd8();
	}

	/**
	 * Delivery destination classification cd. 8 納品先分類ＣＤ８.<p>
	 *
	 */
	public void dlv_grp_cd8(String value) {
		dlv_grp_p().bp_grp_cd8(value);
	}

	/**
	 * Delivery destination classification name 8 納品先分類名８.<p>
	 *
	 */
	public String dlv_grp_nm8() {
		return dlv_grp_p().bp_grp_nm8();
	}

	/**
	 * Delivery destination classification name 8 納品先分類名８.<p>
	 *
	 */
	public void dlv_grp_nm8(String value) {
		dlv_grp_p().bp_grp_nm8(value);
	}

	/**
	 * Delivery destination classification cd. 9 納品先分類ＣＤ９.<p>
	 *
	 */
	public String dlv_grp_cd9() {
		return dlv_grp_p().bp_grp_cd9();
	}

	/**
	 * Delivery destination classification cd. 9 納品先分類ＣＤ９.<p>
	 *
	 */
	public void dlv_grp_cd9(String value) {
		dlv_grp_p().bp_grp_cd9(value);
	}

	/**
	 * Delivery destination classification name 9 納品先分類名９.<p>
	 *
	 */
	public String dlv_grp_nm9() {
		return dlv_grp_p().bp_grp_nm9();
	}

	/**
	 * Delivery destination classification name 9 納品先分類名９.<p>
	 *
	 */
	public void dlv_grp_nm9(String value) {
		dlv_grp_p().bp_grp_nm9(value);
	}

	/**
	 * Delivery destination classification cd. 10 納品先分類ＣＤ１０.<p>
	 *
	 */
	public String dlv_grp_cd10() {
		return dlv_grp_p().bp_grp_cd10();
	}

	/**
	 * Delivery destination classification cd. 10 納品先分類ＣＤ１０.<p>
	 *
	 */
	public void dlv_grp_cd10(String value) {
		dlv_grp_p().bp_grp_cd10(value);
	}

	/**
	 * Delivery destination classification name 10 納品先分類名１０.<p>
	 *
	 */
	public String dlv_grp_nm10() {
		return dlv_grp_p().bp_grp_nm10();
	}

	/**
	 * Delivery destination classification name 10 納品先分類名１０.<p>
	 *
	 */
	public void dlv_grp_nm10(String value) {
		dlv_grp_p().bp_grp_nm10(value);
	}

	/**
	 * Customer classification cd. 1 得意先分類ＣＤ１.<p>
	 *
	 */
	public String cst_grp_cd1() {
		return cst_grp_p().bp_grp_cd1();
	}

	/**
	 * Customer classification cd. 1 得意先分類ＣＤ１.<p>
	 *
	 */
	public void cst_grp_cd1(String value) {
		cst_grp_p().bp_grp_cd1(value);
	}

	/**
	 * Customer classification name 1 得意先分類名１.<p>
	 *
	 */
	public String cst_grp_nm1() {
		return cst_grp_p().bp_grp_nm1();
	}

	/**
	 * Customer classification name 1 得意先分類名１.<p>
	 *
	 */
	public void cst_grp_nm1(String value) {
		cst_grp_p().bp_grp_nm1(value);
	}

	/**
	 * Customer classification cd. 2 得意先分類ＣＤ２.<p>
	 *
	 */
	public String cst_grp_cd2() {
		return cst_grp_p().bp_grp_cd2();
	}

	/**
	 * Customer classification cd. 2 得意先分類ＣＤ２.<p>
	 *
	 */
	public void cst_grp_cd2(String value) {
		cst_grp_p().bp_grp_cd2(value);
	}

	/**
	 * Customer classification name 2 得意先分類名２.<p>
	 *
	 */
	public String cst_grp_nm2() {
		return cst_grp_p().bp_grp_nm2();
	}

	/**
	 * Customer classification name 2 得意先分類名２.<p>
	 *
	 */
	public void cst_grp_nm2(String value) {
		cst_grp_p().bp_grp_nm2(value);
	}

	/**
	 * Customer classification cd. 3 得意先分類ＣＤ３.<p>
	 *
	 */
	public String cst_grp_cd3() {
		return cst_grp_p().bp_grp_cd3();
	}

	/**
	 * Customer classification cd. 3 得意先分類ＣＤ３.<p>
	 *
	 */
	public void cst_grp_cd3(String value) {
		cst_grp_p().bp_grp_cd3(value);
	}

	/**
	 * Customer classification name 3 得意先分類名３.<p>
	 *
	 */
	public String cst_grp_nm3() {
		return cst_grp_p().bp_grp_nm3();
	}

	/**
	 * Customer classification name 3 得意先分類名３.<p>
	 *
	 */
	public void cst_grp_nm3(String value) {
		cst_grp_p().bp_grp_nm3(value);
	}

	/**
	 * Customer classification cd. 4 得意先分類ＣＤ４.<p>
	 *
	 */
	public String cst_grp_cd4() {
		return cst_grp_p().bp_grp_cd4();
	}

	/**
	 * Customer classification cd. 4 得意先分類ＣＤ４.<p>
	 *
	 */
	public void cst_grp_cd4(String value) {
		cst_grp_p().bp_grp_cd4(value);
	}

	/**
	 * Customer classification name 4 得意先分類名４.<p>
	 *
	 */
	public String cst_grp_nm4() {
		return cst_grp_p().bp_grp_nm4();
	}

	/**
	 * Customer classification name 4 得意先分類名４.<p>
	 *
	 */
	public void cst_grp_nm4(String value) {
		cst_grp_p().bp_grp_nm4(value);
	}

	/**
	 * Customer classification cd. 5 得意先分類ＣＤ５.<p>
	 *
	 */
	public String cst_grp_cd5() {
		return cst_grp_p().bp_grp_cd5();
	}

	/**
	 * Customer classification cd. 5 得意先分類ＣＤ５.<p>
	 *
	 */
	public void cst_grp_cd5(String value) {
		cst_grp_p().bp_grp_cd5(value);
	}

	/**
	 * Customer classification name 5 得意先分類名５.<p>
	 *
	 */
	public String cst_grp_nm5() {
		return cst_grp_p().bp_grp_nm5();
	}

	/**
	 * Customer classification name 5 得意先分類名５.<p>
	 *
	 */
	public void cst_grp_nm5(String value) {
		cst_grp_p().bp_grp_nm5(value);
	}

	/**
	 * Customer classification cd. 6 得意先分類ＣＤ６.<p>
	 *
	 */
	public String cst_grp_cd6() {
		return cst_grp_p().bp_grp_cd6();
	}

	/**
	 * Customer classification cd. 6 得意先分類ＣＤ６.<p>
	 *
	 */
	public void cst_grp_cd6(String value) {
		cst_grp_p().bp_grp_cd6(value);
	}

	/**
	 * Customer classification name 6 得意先分類名６.<p>
	 *
	 */
	public String cst_grp_nm6() {
		return cst_grp_p().bp_grp_nm6();
	}

	/**
	 * Customer classification name 6 得意先分類名６.<p>
	 *
	 */
	public void cst_grp_nm6(String value) {
		cst_grp_p().bp_grp_nm6(value);
	}

	/**
	 * Customer classification cd. 7 得意先分類ＣＤ７.<p>
	 *
	 */
	public String cst_grp_cd7() {
		return cst_grp_p().bp_grp_cd7();
	}

	/**
	 * Customer classification cd. 7 得意先分類ＣＤ７.<p>
	 *
	 */
	public void cst_grp_cd7(String value) {
		cst_grp_p().bp_grp_cd7(value);
	}

	/**
	 * Customer classification name 7 得意先分類名７.<p>
	 *
	 */
	public String cst_grp_nm7() {
		return cst_grp_p().bp_grp_nm7();
	}

	/**
	 * Customer classification name 7 得意先分類名７.<p>
	 *
	 */
	public void cst_grp_nm7(String value) {
		cst_grp_p().bp_grp_nm7(value);
	}

	/**
	 * Customer classification cd. 8 得意先分類ＣＤ８.<p>
	 *
	 */
	public String cst_grp_cd8() {
		return cst_grp_p().bp_grp_cd8();
	}

	/**
	 * Customer classification cd. 8 得意先分類ＣＤ８.<p>
	 *
	 */
	public void cst_grp_cd8(String value) {
		cst_grp_p().bp_grp_cd8(value);
	}

	/**
	 * Customer classification name 8 得意先分類名８.<p>
	 *
	 */
	public String cst_grp_nm8() {
		return cst_grp_p().bp_grp_nm8();
	}

	/**
	 * Customer classification name 8 得意先分類名８.<p>
	 *
	 */
	public void cst_grp_nm8(String value) {
		cst_grp_p().bp_grp_nm8(value);
	}

	/**
	 * Customer classification cd. 9 得意先分類ＣＤ９.<p>
	 *
	 */
	public String cst_grp_cd9() {
		return cst_grp_p().bp_grp_cd9();
	}

	/**
	 * Customer classification cd. 9 得意先分類ＣＤ９.<p>
	 *
	 */
	public void cst_grp_cd9(String value) {
		cst_grp_p().bp_grp_cd9(value);
	}

	/**
	 * Customer classification name 9 得意先分類名９.<p>
	 *
	 */
	public String cst_grp_nm9() {
		return cst_grp_p().bp_grp_nm9();
	}

	/**
	 * Customer classification name 9 得意先分類名９.<p>
	 *
	 */
	public void cst_grp_nm9(String value) {
		cst_grp_p().bp_grp_nm9(value);
	}

	/**
	 * Customer classification cd. 10 得意先分類ＣＤ１０.<p>
	 *
	 */
	public String cst_grp_cd10() {
		return cst_grp_p().bp_grp_cd10();
	}

	/**
	 * Customer classification cd. 10 得意先分類ＣＤ１０.<p>
	 *
	 */
	public void cst_grp_cd10(String value) {
		cst_grp_p().bp_grp_cd10(value);
	}

	/**
	 * Customer classification name 10 得意先分類名１０.<p>
	 *
	 */
	public String cst_grp_nm10() {
		return cst_grp_p().bp_grp_nm10();
	}

	/**
	 * Customer classification name 10 得意先分類名１０.<p>
	 *
	 */
	public void cst_grp_nm10(String value) {
		cst_grp_p().bp_grp_nm10(value);
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

}

