package mcframe.clientMSBD.MSBDP0210;

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
	 * Select 選択.<p>
	 *
	 */
	public static final String $check = "check";
	/**
	 * Firm 確定.<p>
	 *
	 */
	public static final String $fix_flg = "fix_flg";
	/**
	 * Cancel 取消.<p>
	 *
	 */
	public static final String $del_flg = "del_flg";
	/**
	 * Pickup responsibility 引取責任.<p>
	 *
	 */
	public static final String $purc_commit_flg = "purc_commit_flg";
	public static final String $itm_p = "itm_p";
	/**
	 * Forecast period type 内示期間区分.<p>
	 *
	 */
	public static final String $pf_period_typ = "pf_period_typ";
	/**
	 * Forecast period type name 内示期間区分名.<p>
	 *
	 */
	public static final String $pf_period_typ_nm = "pf_period_typ_nm";
	/**
	 * Forecast period start date 内示期間開始日.<p>
	 *
	 */
	public static final String $pf_period_st_dt = "pf_period_st_dt";
	/**
	 * Forecast period end date 内示期間終了日.<p>
	 *
	 */
	public static final String $pf_period_end_dt = "pf_period_end_dt";
	/**
	 * Firm period 確定期間.<p>
	 *
	 */
	public static final String $fix_period_flg = "fix_period_flg";
	/**
	 * Last firmed period 前回確定期間.<p>
	 *
	 */
	public static final String $pre_fix_period_flg = "pre_fix_period_flg";
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
	public static final String $trd_unit_dec_place = "trd_unit_dec_place";
	/**
	 * Transaction unit conversion base qty. 取引単位換算基準数量.<p>
	 *
	 */
	public static final String $trd_unit_conv_base_qty = "trd_unit_conv_base_qty";
	/**
	 * Transaction unit conversion qty. 取引単位換算数量.<p>
	 *
	 */
	public static final String $trd_unit_conv_qty = "trd_unit_conv_qty";
	public static final String $trd_unit_schd_qty_p = "trd_unit_schd_qty_p";
	public static final String $trd_unit_pf_qty_p = "trd_unit_pf_qty_p";
	public static final String $trd_unit_prms_qty_p = "trd_unit_prms_qty_p";
	/**
	 * Last unit cd. 前回単位ＣＤ.<p>
	 *
	 */
	public static final String $pre_trd_unit_cd = "pre_trd_unit_cd";
	/**
	 * Last unit name 前回単位名.<p>
	 *
	 */
	public static final String $pre_trd_unit_nm = "pre_trd_unit_nm";
	/**
	 * Last unit number of decimal places 前回単位小数部有効桁数.<p>
	 *
	 */
	public static final String $pre_trd_unit_dec_place = "pre_trd_unit_dec_place";
	public static final String $pre_trd_unit_pf_qty_p = "pre_trd_unit_pf_qty_p";
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
	 * Base unit rounding type 基準単位端数処理区分.<p>
	 *
	 */
	public static final String $base_unit_rnd_typ = "base_unit_rnd_typ";
	public static final String $base_unit_schd_qty_p = "base_unit_schd_qty_p";
	public static final String $base_unit_pf_qty_p = "base_unit_pf_qty_p";
	public static final String $base_unit_prms_qty_p = "base_unit_prms_qty_p";
	public static final String $pre_base_unit_pf_qty_p = "pre_base_unit_pf_qty_p";
	/**
	 * Details report remarks 明細帳票備考.<p>
	 *
	 */
	public static final String $dtl_rpt_rmrks = "dtl_rpt_rmrks";
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
	 * Latest 最新.<p>
	 *
	 */
	public static final String $latest_flg = "latest_flg";
	/**
	 * Forecast date 内示日.<p>
	 *
	 */
	public static final String $pf_dt = "pf_dt";
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
	 * For subcontract 下請対象.<p>
	 *
	 */
	public static final String $subcon_flg = "subcon_flg";
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
	public static final String $usr_dpt_p = "usr_dpt_p";
	/**
	 * Issued 発行済.<p>
	 *
	 */
	public static final String $pf_rpt_flg = "pf_rpt_flg";
	/**
	 * Issue date and time 発行日時.<p>
	 *
	 */
	public static final String $pf_rpt_dt = "pf_rpt_dt";
	/**
	 * Forecast list No. 内示書ＮＯ.<p>
	 *
	 */
	public static final String $pf_rpt_no = "pf_rpt_no";
	/**
	 * Cancel issued 取消発行済.<p>
	 *
	 */
	public static final String $del_pf_rpt_flg = "del_pf_rpt_flg";
	/**
	 * Cancellation issue date and time 取消発行日時.<p>
	 *
	 */
	public static final String $del_pf_rpt_dt = "del_pf_rpt_dt";
	/**
	 * Header report remarks ヘッダ帳票備考.<p>
	 *
	 */
	public static final String $hdr_rpt_rmrks = "hdr_rpt_rmrks";
	/**
	 * Header internal remarks ヘッダ内部備考.<p>
	 *
	 */
	public static final String $hdr_intr_rmrks = "hdr_intr_rmrks";
	/**
	 * Header spare 1 ヘッダ予備１.<p>
	 *
	 */
	public static final String $hdr_sub_char1 = "hdr_sub_char1";
	/**
	 * Header spare 2 ヘッダ予備２.<p>
	 *
	 */
	public static final String $hdr_sub_char2 = "hdr_sub_char2";
	/**
	 * Header spare 3 ヘッダ予備３.<p>
	 *
	 */
	public static final String $hdr_sub_char3 = "hdr_sub_char3";
	/**
	 * Last forecast date 前回内示日.<p>
	 *
	 */
	public static final String $pre_pf_dt = "pre_pf_dt";
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
	public static final String $rtn_msg_p = "rtn_msg_p";
	public static final String $sppl_grp_p = "sppl_grp_p";
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
	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public static final String $upd_cntr = "upd_cntr";
	/**
	 * Purchase forecast details No. 購買内示明細ＮＯ.<p>
	 *
	 */
	public static final String $purc_frcst_d_no = "purc_frcst_d_no";
	/**
	 * Purchase forecast firm No. 購買内示確定ＮＯ.<p>
	 *
	 */
	public static final String $purc_frcst_fix_no = "purc_frcst_fix_no";
	/**
	 * Purchase forecast No. 購買内示ＮＯ.<p>
	 *
	 */
	public static final String $purc_frcst_no = "purc_frcst_no";

	public static final String $itm_cd = $itm_p + ".itm_cd";
	public static final String $itm_sub1 = $itm_p + ".itm_sub1";
	public static final String $itm_sub2 = $itm_p + ".itm_sub2";
	public static final String $itm_sub3 = $itm_p + ".itm_sub3";
	public static final String $itm_nm = $itm_p + ".itm_nm";
	public static final String $trd_unit_schd_qty = $trd_unit_schd_qty_p + ".qty";
	public static final String $trd_unit_pf_qty = $trd_unit_pf_qty_p + ".qty";
	public static final String $trd_unit_prms_qty = $trd_unit_prms_qty_p + ".qty";
	public static final String $pre_trd_unit_pf_qty = $pre_trd_unit_pf_qty_p + ".qty";
	public static final String $base_unit_schd_qty = $base_unit_schd_qty_p + ".qty";
	public static final String $base_unit_pf_qty = $base_unit_pf_qty_p + ".qty";
	public static final String $base_unit_prms_qty = $base_unit_prms_qty_p + ".qty";
	public static final String $pre_base_unit_pf_qty = $pre_base_unit_pf_qty_p + ".qty";
	public static final String $pf_usr_cd = $usr_dpt_p + ".usr_cd";
	public static final String $pf_usr_nm = $usr_dpt_p + ".usr_nm";
	public static final String $pf_dpt_cd = $usr_dpt_p + ".dpt_cd";
	public static final String $pf_dpt_nm = $usr_dpt_p + ".dpt_nm";
	public static final String $rtn_sts_typ = $rtn_msg_p + ".rtn_sts_typ";
	public static final String $sppl_grp_cd1 = $sppl_grp_p + ".bp_grp_cd1";
	public static final String $sppl_grp_nm1 = $sppl_grp_p + ".bp_grp_nm1";
	public static final String $sppl_grp_cd2 = $sppl_grp_p + ".bp_grp_cd2";
	public static final String $sppl_grp_nm2 = $sppl_grp_p + ".bp_grp_nm2";
	public static final String $sppl_grp_cd3 = $sppl_grp_p + ".bp_grp_cd3";
	public static final String $sppl_grp_nm3 = $sppl_grp_p + ".bp_grp_nm3";
	public static final String $sppl_grp_cd4 = $sppl_grp_p + ".bp_grp_cd4";
	public static final String $sppl_grp_nm4 = $sppl_grp_p + ".bp_grp_nm4";
	public static final String $sppl_grp_cd5 = $sppl_grp_p + ".bp_grp_cd5";
	public static final String $sppl_grp_nm5 = $sppl_grp_p + ".bp_grp_nm5";
	public static final String $sppl_grp_cd6 = $sppl_grp_p + ".bp_grp_cd6";
	public static final String $sppl_grp_nm6 = $sppl_grp_p + ".bp_grp_nm6";
	public static final String $sppl_grp_cd7 = $sppl_grp_p + ".bp_grp_cd7";
	public static final String $sppl_grp_nm7 = $sppl_grp_p + ".bp_grp_nm7";
	public static final String $sppl_grp_cd8 = $sppl_grp_p + ".bp_grp_cd8";
	public static final String $sppl_grp_nm8 = $sppl_grp_p + ".bp_grp_nm8";
	public static final String $sppl_grp_cd9 = $sppl_grp_p + ".bp_grp_cd9";
	public static final String $sppl_grp_nm9 = $sppl_grp_p + ".bp_grp_nm9";
	public static final String $sppl_grp_cd10 = $sppl_grp_p + ".bp_grp_cd10";
	public static final String $sppl_grp_nm10 = $sppl_grp_p + ".bp_grp_nm10";
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

	public static final MCMeta check_META = createCommonMeta($check, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta fix_flg_META = createCommonMeta($fix_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta del_flg_META = createCommonMeta($del_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta purc_commit_flg_META = createCommonMeta($purc_commit_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta itm_p_META = createInnerRowMeta($itm_p, mcframe.clientMAUB.MAUBP5030.ItmR.class);
	public static final MCMeta pf_period_typ_META = createCommonMeta($pf_period_typ, mcframe.commonMA.meta.MA_META.PERIOD_TYP);
	public static final MCMeta pf_period_typ_nm_META = createCommonMeta($pf_period_typ_nm, mcframe.commonMA.meta.MA_META.PERIOD_TYP_NM);
	public static final MCMeta pf_period_st_dt_META = createCommonMeta($pf_period_st_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta pf_period_end_dt_META = createCommonMeta($pf_period_end_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta fix_period_flg_META = createCommonMeta($fix_period_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta pre_fix_period_flg_META = createCommonMeta($pre_fix_period_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta trd_unit_cd_META = createCommonMeta($trd_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta trd_unit_nm_META = createCommonMeta($trd_unit_nm, mcframe.commonMA.meta.MA_META.UNIT_NM);
	public static final MCMeta trd_unit_dec_place_META = createCommonMeta($trd_unit_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta trd_unit_conv_base_qty_META = createCommonMeta($trd_unit_conv_base_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta trd_unit_conv_qty_META = createCommonMeta($trd_unit_conv_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta trd_unit_schd_qty_p_META = createInnerRowMeta($trd_unit_schd_qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta trd_unit_pf_qty_p_META = createInnerRowMeta($trd_unit_pf_qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta trd_unit_prms_qty_p_META = createInnerRowMeta($trd_unit_prms_qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta pre_trd_unit_cd_META = createCommonMeta($pre_trd_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta pre_trd_unit_nm_META = createCommonMeta($pre_trd_unit_nm, mcframe.commonMA.meta.MA_META.UNIT_NM);
	public static final MCMeta pre_trd_unit_dec_place_META = createCommonMeta($pre_trd_unit_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta pre_trd_unit_pf_qty_p_META = createInnerRowMeta($pre_trd_unit_pf_qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta base_unit_cd_META = createCommonMeta($base_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta base_unit_nm_META = createCommonMeta($base_unit_nm, mcframe.commonMA.meta.MA_META.UNIT_NM);
	public static final MCMeta base_unit_dec_place_META = createCommonMeta($base_unit_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta base_unit_rnd_typ_META = createCommonMeta($base_unit_rnd_typ, mcframe.commonMA.meta.MA_META.RND_TYP);
	public static final MCMeta base_unit_schd_qty_p_META = createInnerRowMeta($base_unit_schd_qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta base_unit_pf_qty_p_META = createInnerRowMeta($base_unit_pf_qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta base_unit_prms_qty_p_META = createInnerRowMeta($base_unit_prms_qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta pre_base_unit_pf_qty_p_META = createInnerRowMeta($pre_base_unit_pf_qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta dtl_rpt_rmrks_META = createCommonMeta($dtl_rpt_rmrks, mcframe.commonMS.meta.MS_META.PF_FIX_RPT_RMRKS);
	public static final MCMeta dtl_intr_rmrks_META = createCommonMeta($dtl_intr_rmrks, mcframe.commonMS.meta.MS_META.PF_FIX_INTR_RMRKS);
	public static final MCMeta dtl_sub_char1_META = createCommonMeta($dtl_sub_char1, mcframe.commonMS.meta.MS_META.PF_FIX_SUB_CHAR1);
	public static final MCMeta dtl_sub_char2_META = createCommonMeta($dtl_sub_char2, mcframe.commonMS.meta.MS_META.PF_FIX_SUB_CHAR2);
	public static final MCMeta dtl_sub_char3_META = createCommonMeta($dtl_sub_char3, mcframe.commonMS.meta.MS_META.PF_FIX_SUB_CHAR3);
	public static final MCMeta latest_flg_META = createCommonMeta($latest_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta pf_dt_META = createCommonMeta($pf_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta sppl_cd_META = createCommonMeta($sppl_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta sppl_nm_META = createCommonMeta($sppl_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta subcon_flg_META = createCommonMeta($subcon_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta wg_cd_META = createCommonMeta($wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta wg_nm_META = createCommonMeta($wg_nm, mcframe.commonMA.meta.MA_META.WG_NM);
	public static final MCMeta usr_dpt_p_META = createInnerRowMeta($usr_dpt_p, mcframe.clientMAUB.MAUBP5230.UsrDptR.class);
	public static final MCMeta pf_rpt_flg_META = createCommonMeta($pf_rpt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta pf_rpt_dt_META = createCommonMeta($pf_rpt_dt, mcframe.commonMA.meta.MA_META.TM);
	public static final MCMeta pf_rpt_no_META = createCommonMeta($pf_rpt_no, mcframe.commonMA.meta.MA_META.PF_RPT_NO);
	public static final MCMeta del_pf_rpt_flg_META = createCommonMeta($del_pf_rpt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta del_pf_rpt_dt_META = createCommonMeta($del_pf_rpt_dt, mcframe.commonMA.meta.MA_META.TM);
	public static final MCMeta hdr_rpt_rmrks_META = createCommonMeta($hdr_rpt_rmrks, mcframe.commonMS.meta.MS_META.PF_HDR_RPT_RMRKS);
	public static final MCMeta hdr_intr_rmrks_META = createCommonMeta($hdr_intr_rmrks, mcframe.commonMS.meta.MS_META.PF_HDR_INTR_RMRKS);
	public static final MCMeta hdr_sub_char1_META = createCommonMeta($hdr_sub_char1, mcframe.commonMS.meta.MS_META.PF_HDR_SUB_CHAR1);
	public static final MCMeta hdr_sub_char2_META = createCommonMeta($hdr_sub_char2, mcframe.commonMS.meta.MS_META.PF_HDR_SUB_CHAR2);
	public static final MCMeta hdr_sub_char3_META = createCommonMeta($hdr_sub_char3, mcframe.commonMS.meta.MS_META.PF_HDR_SUB_CHAR3);
	public static final MCMeta pre_pf_dt_META = createCommonMeta($pre_pf_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta itm_typ_META = createCommonMeta($itm_typ, mcframe.commonMA.meta.MA_META.ITM_TYP);
	public static final MCMeta itm_typ_nm_META = createCommonMeta($itm_typ_nm, mcframe.commonMA.meta.MA_META.ITM_TYP_NM);
	public static final MCMeta itm_typ_d_cd_META = createCommonMeta($itm_typ_d_cd, mcframe.commonMA.meta.MA_META.ITM_TYP_D_CD);
	public static final MCMeta itm_typ_d_nm_META = createCommonMeta($itm_typ_d_nm, mcframe.commonMA.meta.MA_META.ITM_TYP_D_NM);
	public static final MCMeta rtn_msg_p_META = createInnerRowMeta($rtn_msg_p, mcframe.clientMAUB.MAUBP5310.RtnMsgR.class);
	public static final MCMeta sppl_grp_p_META = createInnerRowMeta($sppl_grp_p, mcframe.clientMAUB.MAUBP5190.BpGrpR.class);
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
	public static final MCMeta upd_cntr_META = createCommonMeta($upd_cntr, mcframe.commonMA.meta.MA_META.UPD_CNT);
	public static final MCMeta purc_frcst_d_no_META = createCommonMeta($purc_frcst_d_no, mcframe.commonMA.meta.MA_META.PURC_FRCST_D_NO);
	public static final MCMeta purc_frcst_fix_no_META = createCommonMeta($purc_frcst_fix_no, mcframe.commonMA.meta.MA_META.PURC_FRCST_FIX_NO);
	public static final MCMeta purc_frcst_no_META = createCommonMeta($purc_frcst_no, mcframe.commonMA.meta.MA_META.PURC_FRCST_NO);

	protected static final ConstMetaList<RsltR> constMetas = new ConstMetaList<RsltR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			check_META,
			fix_flg_META,
			del_flg_META,
			purc_commit_flg_META,
			itm_p_META,
			pf_period_typ_META,
			pf_period_typ_nm_META,
			pf_period_st_dt_META,
			pf_period_end_dt_META,
			fix_period_flg_META,
			pre_fix_period_flg_META,
			trd_unit_cd_META,
			trd_unit_nm_META,
			trd_unit_dec_place_META,
			trd_unit_conv_base_qty_META,
			trd_unit_conv_qty_META,
			trd_unit_schd_qty_p_META,
			trd_unit_pf_qty_p_META,
			trd_unit_prms_qty_p_META,
			pre_trd_unit_cd_META,
			pre_trd_unit_nm_META,
			pre_trd_unit_dec_place_META,
			pre_trd_unit_pf_qty_p_META,
			base_unit_cd_META,
			base_unit_nm_META,
			base_unit_dec_place_META,
			base_unit_rnd_typ_META,
			base_unit_schd_qty_p_META,
			base_unit_pf_qty_p_META,
			base_unit_prms_qty_p_META,
			pre_base_unit_pf_qty_p_META,
			dtl_rpt_rmrks_META,
			dtl_intr_rmrks_META,
			dtl_sub_char1_META,
			dtl_sub_char2_META,
			dtl_sub_char3_META,
			latest_flg_META,
			pf_dt_META,
			sppl_cd_META,
			sppl_nm_META,
			subcon_flg_META,
			wg_cd_META,
			wg_nm_META,
			usr_dpt_p_META,
			pf_rpt_flg_META,
			pf_rpt_dt_META,
			pf_rpt_no_META,
			del_pf_rpt_flg_META,
			del_pf_rpt_dt_META,
			hdr_rpt_rmrks_META,
			hdr_intr_rmrks_META,
			hdr_sub_char1_META,
			hdr_sub_char2_META,
			hdr_sub_char3_META,
			pre_pf_dt_META,
			itm_typ_META,
			itm_typ_nm_META,
			itm_typ_d_cd_META,
			itm_typ_d_nm_META,
			rtn_msg_p_META,
			sppl_grp_p_META,
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
			upd_srv_req_no_META,
			upd_cntr_META,
			purc_frcst_d_no_META,
			purc_frcst_fix_no_META,
			purc_frcst_no_META
		},
		new String[][]{
			{
				"itm_cd",
				"itm_sub1",
				"itm_sub2",
				"itm_sub3",
				"itm_nm",
				"trd_unit_schd_qty",
				"trd_unit_pf_qty",
				"trd_unit_prms_qty",
				"pre_trd_unit_pf_qty",
				"base_unit_schd_qty",
				"base_unit_pf_qty",
				"base_unit_prms_qty",
				"pre_base_unit_pf_qty",
				"pf_usr_cd",
				"pf_usr_nm",
				"pf_dpt_cd",
				"pf_dpt_nm",
				"rtn_sts_typ",
				"sppl_grp_cd1",
				"sppl_grp_nm1",
				"sppl_grp_cd2",
				"sppl_grp_nm2",
				"sppl_grp_cd3",
				"sppl_grp_nm3",
				"sppl_grp_cd4",
				"sppl_grp_nm4",
				"sppl_grp_cd5",
				"sppl_grp_nm5",
				"sppl_grp_cd6",
				"sppl_grp_nm6",
				"sppl_grp_cd7",
				"sppl_grp_nm7",
				"sppl_grp_cd8",
				"sppl_grp_nm8",
				"sppl_grp_cd9",
				"sppl_grp_nm9",
				"sppl_grp_cd10",
				"sppl_grp_nm10",
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
				$trd_unit_schd_qty,
				$trd_unit_pf_qty,
				$trd_unit_prms_qty,
				$pre_trd_unit_pf_qty,
				$base_unit_schd_qty,
				$base_unit_pf_qty,
				$base_unit_prms_qty,
				$pre_base_unit_pf_qty,
				$pf_usr_cd,
				$pf_usr_nm,
				$pf_dpt_cd,
				$pf_dpt_nm,
				$rtn_sts_typ,
				$sppl_grp_cd1,
				$sppl_grp_nm1,
				$sppl_grp_cd2,
				$sppl_grp_nm2,
				$sppl_grp_cd3,
				$sppl_grp_nm3,
				$sppl_grp_cd4,
				$sppl_grp_nm4,
				$sppl_grp_cd5,
				$sppl_grp_nm5,
				$sppl_grp_cd6,
				$sppl_grp_nm6,
				$sppl_grp_cd7,
				$sppl_grp_nm7,
				$sppl_grp_cd8,
				$sppl_grp_nm8,
				$sppl_grp_cd9,
				$sppl_grp_nm9,
				$sppl_grp_cd10,
				$sppl_grp_nm10,
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
				{$usr_dpt_p + ".dpt_cd", "dpt_nm"}	// usr_dpt_p.dpt_cd
			}
		)),
		new MCExtMap.Entry($$LIST_IN, new MCExtList(
			new String[][]{
				{$usr_dpt_p + ".dpt_cd", "pf_usr_cd;MAC_DPT_IS_SRCH_TYP.PURC;true;pf_dt"}	// usr_dpt_p.dpt_cd
			}
		)),
		new MCExtMap.Entry($$LIST_IN_BASE, new MCExtList(
			new String[][]{
				{$usr_dpt_p + ".dpt_cd", "usr_cd;dpt_is_srch_typ;wr_flg;dt"}	// usr_dpt_p.dpt_cd
			}
		)),
		new MCExtMap.Entry($$DISP_CTL, new MCExtList(
			new String[][]{
				{$base_unit_cd, "BASE_UNIT"},	// base_unit_cd
				{$base_unit_nm, "BASE_UNIT"},	// base_unit_nm
				{$base_unit_dec_place, "BASE_UNIT"},	// base_unit_dec_place
				{$base_unit_rnd_typ, "BASE_UNIT"},	// base_unit_rnd_typ
				{$base_unit_schd_qty_p + ".qty", "BASE_UNIT"},	// base_unit_schd_qty_p.qty
				{$base_unit_pf_qty_p + ".qty", "BASE_UNIT"},	// base_unit_pf_qty_p.qty
				{$base_unit_prms_qty_p + ".qty", "BASE_UNIT"},	// base_unit_prms_qty_p.qty
				{$pre_base_unit_pf_qty_p + ".qty", "BASE_UNIT"},	// pre_base_unit_pf_qty_p.qty
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
	 * Firm 確定.<p>
	 *
	 */
	public boolean fix_flg() {
		return getConstBoolean(offset + 1, $fix_flg);
	}

	/**
	 * Firm 確定.<p>
	 *
	 */
	public void fix_flg(boolean value) {
		setConstBoolean(offset + 1, $fix_flg, value);
	}


	/**
	 * Cancel 取消.<p>
	 *
	 */
	public boolean del_flg() {
		return getConstBoolean(offset + 2, $del_flg);
	}

	/**
	 * Cancel 取消.<p>
	 *
	 */
	public void del_flg(boolean value) {
		setConstBoolean(offset + 2, $del_flg, value);
	}


	/**
	 * Pickup responsibility 引取責任.<p>
	 *
	 */
	public boolean purc_commit_flg() {
		return getConstBoolean(offset + 3, $purc_commit_flg);
	}

	/**
	 * Pickup responsibility 引取責任.<p>
	 *
	 */
	public void purc_commit_flg(boolean value) {
		setConstBoolean(offset + 3, $purc_commit_flg, value);
	}


	public mcframe.clientMAUB.MAUBP5030.ItmR itm_p(){
		return (mcframe.clientMAUB.MAUBP5030.ItmR) getConstInnerRow(offset + 4, $itm_p);
	}
	
	public void itm_p(mcframe.clientMAUB.MAUBP5030.ItmR row){
		setConstInnerRow(offset + 4, $itm_p, row);
	}


	/**
	 * Forecast period type 内示期間区分.<p>
	 *
	 */
	public String pf_period_typ() {
		return getConstString(offset + 5, $pf_period_typ);
	}

	/**
	 * Forecast period type 内示期間区分.<p>
	 *
	 */
	public void pf_period_typ(String value) {
		setConstString(offset + 5, $pf_period_typ, value);
	}


	/**
	 * Forecast period type name 内示期間区分名.<p>
	 *
	 */
	public String pf_period_typ_nm() {
		return getConstString(offset + 6, $pf_period_typ_nm);
	}

	/**
	 * Forecast period type name 内示期間区分名.<p>
	 *
	 */
	public void pf_period_typ_nm(String value) {
		setConstString(offset + 6, $pf_period_typ_nm, value);
	}


	/**
	 * Forecast period start date 内示期間開始日.<p>
	 *
	 */
	public MCDate pf_period_st_dt() {
		return getConstDate(offset + 7, $pf_period_st_dt);
	}

	/**
	 * Forecast period start date 内示期間開始日.<p>
	 *
	 */
	public void pf_period_st_dt(MCDate value) {
		setConstDate(offset + 7, $pf_period_st_dt, value);
	}


	/**
	 * Forecast period end date 内示期間終了日.<p>
	 *
	 */
	public MCDate pf_period_end_dt() {
		return getConstDate(offset + 8, $pf_period_end_dt);
	}

	/**
	 * Forecast period end date 内示期間終了日.<p>
	 *
	 */
	public void pf_period_end_dt(MCDate value) {
		setConstDate(offset + 8, $pf_period_end_dt, value);
	}


	/**
	 * Firm period 確定期間.<p>
	 *
	 */
	public boolean fix_period_flg() {
		return getConstBoolean(offset + 9, $fix_period_flg);
	}

	/**
	 * Firm period 確定期間.<p>
	 *
	 */
	public void fix_period_flg(boolean value) {
		setConstBoolean(offset + 9, $fix_period_flg, value);
	}


	/**
	 * Last firmed period 前回確定期間.<p>
	 *
	 */
	public boolean pre_fix_period_flg() {
		return getConstBoolean(offset + 10, $pre_fix_period_flg);
	}

	/**
	 * Last firmed period 前回確定期間.<p>
	 *
	 */
	public void pre_fix_period_flg(boolean value) {
		setConstBoolean(offset + 10, $pre_fix_period_flg, value);
	}


	/**
	 * Transaction unit cd. 取引単位ＣＤ.<p>
	 *
	 */
	public String trd_unit_cd() {
		return getConstString(offset + 11, $trd_unit_cd);
	}

	/**
	 * Transaction unit cd. 取引単位ＣＤ.<p>
	 *
	 */
	public void trd_unit_cd(String value) {
		setConstString(offset + 11, $trd_unit_cd, value);
	}


	/**
	 * Transaction unit name 取引単位名.<p>
	 *
	 */
	public String trd_unit_nm() {
		return getConstString(offset + 12, $trd_unit_nm);
	}

	/**
	 * Transaction unit name 取引単位名.<p>
	 *
	 */
	public void trd_unit_nm(String value) {
		setConstString(offset + 12, $trd_unit_nm, value);
	}


	/**
	 * Transaction unit number of decimal places 取引単位小数部有効桁数.<p>
	 *
	 */
	public MCNumber trd_unit_dec_place() {
		return getConstNumber(offset + 13, $trd_unit_dec_place);
	}

	/**
	 * Transaction unit number of decimal places 取引単位小数部有効桁数.<p>
	 *
	 */
	public void trd_unit_dec_place(MCNumber value) {
		setConstNumber(offset + 13, $trd_unit_dec_place, value);
	}

	/**
	 * Transaction unit number of decimal places 取引単位小数部有効桁数.<p>
	 *
	 */
	public void trd_unit_dec_place(int value) {
		setConstNumber(offset + 13, $trd_unit_dec_place, value);
	}

	/**
	 * Transaction unit number of decimal places 取引単位小数部有効桁数.<p>
	 *
	 */
	public void trd_unit_dec_place(long value) {
		setConstNumber(offset + 13, $trd_unit_dec_place, value);
	}

	/**
	 * Transaction unit number of decimal places 取引単位小数部有効桁数.<p>
	 *
	 */
	public void trd_unit_dec_place(float value) {
		setConstNumber(offset + 13, $trd_unit_dec_place, value);
	}

	/**
	 * Transaction unit number of decimal places 取引単位小数部有効桁数.<p>
	 *
	 */
	public void trd_unit_dec_place(double value) {
		setConstNumber(offset + 13, $trd_unit_dec_place, value);
	}


	/**
	 * Transaction unit conversion base qty. 取引単位換算基準数量.<p>
	 *
	 */
	public MCNumber trd_unit_conv_base_qty() {
		return getConstNumber(offset + 14, $trd_unit_conv_base_qty);
	}

	/**
	 * Transaction unit conversion base qty. 取引単位換算基準数量.<p>
	 *
	 */
	public void trd_unit_conv_base_qty(MCNumber value) {
		setConstNumber(offset + 14, $trd_unit_conv_base_qty, value);
	}

	/**
	 * Transaction unit conversion base qty. 取引単位換算基準数量.<p>
	 *
	 */
	public void trd_unit_conv_base_qty(int value) {
		setConstNumber(offset + 14, $trd_unit_conv_base_qty, value);
	}

	/**
	 * Transaction unit conversion base qty. 取引単位換算基準数量.<p>
	 *
	 */
	public void trd_unit_conv_base_qty(long value) {
		setConstNumber(offset + 14, $trd_unit_conv_base_qty, value);
	}

	/**
	 * Transaction unit conversion base qty. 取引単位換算基準数量.<p>
	 *
	 */
	public void trd_unit_conv_base_qty(float value) {
		setConstNumber(offset + 14, $trd_unit_conv_base_qty, value);
	}

	/**
	 * Transaction unit conversion base qty. 取引単位換算基準数量.<p>
	 *
	 */
	public void trd_unit_conv_base_qty(double value) {
		setConstNumber(offset + 14, $trd_unit_conv_base_qty, value);
	}


	/**
	 * Transaction unit conversion qty. 取引単位換算数量.<p>
	 *
	 */
	public MCNumber trd_unit_conv_qty() {
		return getConstNumber(offset + 15, $trd_unit_conv_qty);
	}

	/**
	 * Transaction unit conversion qty. 取引単位換算数量.<p>
	 *
	 */
	public void trd_unit_conv_qty(MCNumber value) {
		setConstNumber(offset + 15, $trd_unit_conv_qty, value);
	}

	/**
	 * Transaction unit conversion qty. 取引単位換算数量.<p>
	 *
	 */
	public void trd_unit_conv_qty(int value) {
		setConstNumber(offset + 15, $trd_unit_conv_qty, value);
	}

	/**
	 * Transaction unit conversion qty. 取引単位換算数量.<p>
	 *
	 */
	public void trd_unit_conv_qty(long value) {
		setConstNumber(offset + 15, $trd_unit_conv_qty, value);
	}

	/**
	 * Transaction unit conversion qty. 取引単位換算数量.<p>
	 *
	 */
	public void trd_unit_conv_qty(float value) {
		setConstNumber(offset + 15, $trd_unit_conv_qty, value);
	}

	/**
	 * Transaction unit conversion qty. 取引単位換算数量.<p>
	 *
	 */
	public void trd_unit_conv_qty(double value) {
		setConstNumber(offset + 15, $trd_unit_conv_qty, value);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR trd_unit_schd_qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 16, $trd_unit_schd_qty_p);
	}
	
	public void trd_unit_schd_qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 16, $trd_unit_schd_qty_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR trd_unit_pf_qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 17, $trd_unit_pf_qty_p);
	}
	
	public void trd_unit_pf_qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 17, $trd_unit_pf_qty_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR trd_unit_prms_qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 18, $trd_unit_prms_qty_p);
	}
	
	public void trd_unit_prms_qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 18, $trd_unit_prms_qty_p, row);
	}


	/**
	 * Last unit cd. 前回単位ＣＤ.<p>
	 *
	 */
	public String pre_trd_unit_cd() {
		return getConstString(offset + 19, $pre_trd_unit_cd);
	}

	/**
	 * Last unit cd. 前回単位ＣＤ.<p>
	 *
	 */
	public void pre_trd_unit_cd(String value) {
		setConstString(offset + 19, $pre_trd_unit_cd, value);
	}


	/**
	 * Last unit name 前回単位名.<p>
	 *
	 */
	public String pre_trd_unit_nm() {
		return getConstString(offset + 20, $pre_trd_unit_nm);
	}

	/**
	 * Last unit name 前回単位名.<p>
	 *
	 */
	public void pre_trd_unit_nm(String value) {
		setConstString(offset + 20, $pre_trd_unit_nm, value);
	}


	/**
	 * Last unit number of decimal places 前回単位小数部有効桁数.<p>
	 *
	 */
	public MCNumber pre_trd_unit_dec_place() {
		return getConstNumber(offset + 21, $pre_trd_unit_dec_place);
	}

	/**
	 * Last unit number of decimal places 前回単位小数部有効桁数.<p>
	 *
	 */
	public void pre_trd_unit_dec_place(MCNumber value) {
		setConstNumber(offset + 21, $pre_trd_unit_dec_place, value);
	}

	/**
	 * Last unit number of decimal places 前回単位小数部有効桁数.<p>
	 *
	 */
	public void pre_trd_unit_dec_place(int value) {
		setConstNumber(offset + 21, $pre_trd_unit_dec_place, value);
	}

	/**
	 * Last unit number of decimal places 前回単位小数部有効桁数.<p>
	 *
	 */
	public void pre_trd_unit_dec_place(long value) {
		setConstNumber(offset + 21, $pre_trd_unit_dec_place, value);
	}

	/**
	 * Last unit number of decimal places 前回単位小数部有効桁数.<p>
	 *
	 */
	public void pre_trd_unit_dec_place(float value) {
		setConstNumber(offset + 21, $pre_trd_unit_dec_place, value);
	}

	/**
	 * Last unit number of decimal places 前回単位小数部有効桁数.<p>
	 *
	 */
	public void pre_trd_unit_dec_place(double value) {
		setConstNumber(offset + 21, $pre_trd_unit_dec_place, value);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR pre_trd_unit_pf_qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 22, $pre_trd_unit_pf_qty_p);
	}
	
	public void pre_trd_unit_pf_qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 22, $pre_trd_unit_pf_qty_p, row);
	}


	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public String base_unit_cd() {
		return getConstString(offset + 23, $base_unit_cd);
	}

	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public void base_unit_cd(String value) {
		setConstString(offset + 23, $base_unit_cd, value);
	}


	/**
	 * Base unit name 基準単位名.<p>
	 *
	 */
	public String base_unit_nm() {
		return getConstString(offset + 24, $base_unit_nm);
	}

	/**
	 * Base unit name 基準単位名.<p>
	 *
	 */
	public void base_unit_nm(String value) {
		setConstString(offset + 24, $base_unit_nm, value);
	}


	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public MCNumber base_unit_dec_place() {
		return getConstNumber(offset + 25, $base_unit_dec_place);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(MCNumber value) {
		setConstNumber(offset + 25, $base_unit_dec_place, value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(int value) {
		setConstNumber(offset + 25, $base_unit_dec_place, value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(long value) {
		setConstNumber(offset + 25, $base_unit_dec_place, value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(float value) {
		setConstNumber(offset + 25, $base_unit_dec_place, value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(double value) {
		setConstNumber(offset + 25, $base_unit_dec_place, value);
	}


	/**
	 * Base unit rounding type 基準単位端数処理区分.<p>
	 *
	 */
	public String base_unit_rnd_typ() {
		return getConstString(offset + 26, $base_unit_rnd_typ);
	}

	/**
	 * Base unit rounding type 基準単位端数処理区分.<p>
	 *
	 */
	public void base_unit_rnd_typ(String value) {
		setConstString(offset + 26, $base_unit_rnd_typ, value);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR base_unit_schd_qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 27, $base_unit_schd_qty_p);
	}
	
	public void base_unit_schd_qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 27, $base_unit_schd_qty_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR base_unit_pf_qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 28, $base_unit_pf_qty_p);
	}
	
	public void base_unit_pf_qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 28, $base_unit_pf_qty_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR base_unit_prms_qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 29, $base_unit_prms_qty_p);
	}
	
	public void base_unit_prms_qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 29, $base_unit_prms_qty_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR pre_base_unit_pf_qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 30, $pre_base_unit_pf_qty_p);
	}
	
	public void pre_base_unit_pf_qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 30, $pre_base_unit_pf_qty_p, row);
	}


	/**
	 * Details report remarks 明細帳票備考.<p>
	 *
	 */
	public String dtl_rpt_rmrks() {
		return getConstString(offset + 31, $dtl_rpt_rmrks);
	}

	/**
	 * Details report remarks 明細帳票備考.<p>
	 *
	 */
	public void dtl_rpt_rmrks(String value) {
		setConstString(offset + 31, $dtl_rpt_rmrks, value);
	}


	/**
	 * Details internal remarks 明細内部備考.<p>
	 *
	 */
	public String dtl_intr_rmrks() {
		return getConstString(offset + 32, $dtl_intr_rmrks);
	}

	/**
	 * Details internal remarks 明細内部備考.<p>
	 *
	 */
	public void dtl_intr_rmrks(String value) {
		setConstString(offset + 32, $dtl_intr_rmrks, value);
	}


	/**
	 * Details spare 1 明細予備１.<p>
	 *
	 */
	public String dtl_sub_char1() {
		return getConstString(offset + 33, $dtl_sub_char1);
	}

	/**
	 * Details spare 1 明細予備１.<p>
	 *
	 */
	public void dtl_sub_char1(String value) {
		setConstString(offset + 33, $dtl_sub_char1, value);
	}


	/**
	 * Details spare 2 明細予備２.<p>
	 *
	 */
	public String dtl_sub_char2() {
		return getConstString(offset + 34, $dtl_sub_char2);
	}

	/**
	 * Details spare 2 明細予備２.<p>
	 *
	 */
	public void dtl_sub_char2(String value) {
		setConstString(offset + 34, $dtl_sub_char2, value);
	}


	/**
	 * Details spare 3 明細予備３.<p>
	 *
	 */
	public String dtl_sub_char3() {
		return getConstString(offset + 35, $dtl_sub_char3);
	}

	/**
	 * Details spare 3 明細予備３.<p>
	 *
	 */
	public void dtl_sub_char3(String value) {
		setConstString(offset + 35, $dtl_sub_char3, value);
	}


	/**
	 * Latest 最新.<p>
	 *
	 */
	public boolean latest_flg() {
		return getConstBoolean(offset + 36, $latest_flg);
	}

	/**
	 * Latest 最新.<p>
	 *
	 */
	public void latest_flg(boolean value) {
		setConstBoolean(offset + 36, $latest_flg, value);
	}


	/**
	 * Forecast date 内示日.<p>
	 *
	 */
	public MCDate pf_dt() {
		return getConstDate(offset + 37, $pf_dt);
	}

	/**
	 * Forecast date 内示日.<p>
	 *
	 */
	public void pf_dt(MCDate value) {
		setConstDate(offset + 37, $pf_dt, value);
	}


	/**
	 * Supplier cd. 発注先ＣＤ.<p>
	 *
	 */
	public String sppl_cd() {
		return getConstString(offset + 38, $sppl_cd);
	}

	/**
	 * Supplier cd. 発注先ＣＤ.<p>
	 *
	 */
	public void sppl_cd(String value) {
		setConstString(offset + 38, $sppl_cd, value);
	}


	/**
	 * Supplier name 発注先名.<p>
	 *
	 */
	public String sppl_nm() {
		return getConstString(offset + 39, $sppl_nm);
	}

	/**
	 * Supplier name 発注先名.<p>
	 *
	 */
	public void sppl_nm(String value) {
		setConstString(offset + 39, $sppl_nm, value);
	}


	/**
	 * For subcontract 下請対象.<p>
	 *
	 */
	public boolean subcon_flg() {
		return getConstBoolean(offset + 40, $subcon_flg);
	}

	/**
	 * For subcontract 下請対象.<p>
	 *
	 */
	public void subcon_flg(boolean value) {
		setConstBoolean(offset + 40, $subcon_flg, value);
	}


	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public String wg_cd() {
		return getConstString(offset + 41, $wg_cd);
	}

	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public void wg_cd(String value) {
		setConstString(offset + 41, $wg_cd, value);
	}


	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public String wg_nm() {
		return getConstString(offset + 42, $wg_nm);
	}

	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public void wg_nm(String value) {
		setConstString(offset + 42, $wg_nm, value);
	}


	public mcframe.clientMAUB.MAUBP5230.UsrDptR usr_dpt_p(){
		return (mcframe.clientMAUB.MAUBP5230.UsrDptR) getConstInnerRow(offset + 43, $usr_dpt_p);
	}
	
	public void usr_dpt_p(mcframe.clientMAUB.MAUBP5230.UsrDptR row){
		setConstInnerRow(offset + 43, $usr_dpt_p, row);
	}


	/**
	 * Issued 発行済.<p>
	 *
	 */
	public boolean pf_rpt_flg() {
		return getConstBoolean(offset + 44, $pf_rpt_flg);
	}

	/**
	 * Issued 発行済.<p>
	 *
	 */
	public void pf_rpt_flg(boolean value) {
		setConstBoolean(offset + 44, $pf_rpt_flg, value);
	}


	/**
	 * Issue date and time 発行日時.<p>
	 *
	 */
	public MCDate pf_rpt_dt() {
		return getConstDate(offset + 45, $pf_rpt_dt);
	}

	/**
	 * Issue date and time 発行日時.<p>
	 *
	 */
	public void pf_rpt_dt(MCDate value) {
		setConstDate(offset + 45, $pf_rpt_dt, value);
	}


	/**
	 * Forecast list No. 内示書ＮＯ.<p>
	 *
	 */
	public String pf_rpt_no() {
		return getConstString(offset + 46, $pf_rpt_no);
	}

	/**
	 * Forecast list No. 内示書ＮＯ.<p>
	 *
	 */
	public void pf_rpt_no(String value) {
		setConstString(offset + 46, $pf_rpt_no, value);
	}


	/**
	 * Cancel issued 取消発行済.<p>
	 *
	 */
	public boolean del_pf_rpt_flg() {
		return getConstBoolean(offset + 47, $del_pf_rpt_flg);
	}

	/**
	 * Cancel issued 取消発行済.<p>
	 *
	 */
	public void del_pf_rpt_flg(boolean value) {
		setConstBoolean(offset + 47, $del_pf_rpt_flg, value);
	}


	/**
	 * Cancellation issue date and time 取消発行日時.<p>
	 *
	 */
	public MCDate del_pf_rpt_dt() {
		return getConstDate(offset + 48, $del_pf_rpt_dt);
	}

	/**
	 * Cancellation issue date and time 取消発行日時.<p>
	 *
	 */
	public void del_pf_rpt_dt(MCDate value) {
		setConstDate(offset + 48, $del_pf_rpt_dt, value);
	}


	/**
	 * Header report remarks ヘッダ帳票備考.<p>
	 *
	 */
	public String hdr_rpt_rmrks() {
		return getConstString(offset + 49, $hdr_rpt_rmrks);
	}

	/**
	 * Header report remarks ヘッダ帳票備考.<p>
	 *
	 */
	public void hdr_rpt_rmrks(String value) {
		setConstString(offset + 49, $hdr_rpt_rmrks, value);
	}


	/**
	 * Header internal remarks ヘッダ内部備考.<p>
	 *
	 */
	public String hdr_intr_rmrks() {
		return getConstString(offset + 50, $hdr_intr_rmrks);
	}

	/**
	 * Header internal remarks ヘッダ内部備考.<p>
	 *
	 */
	public void hdr_intr_rmrks(String value) {
		setConstString(offset + 50, $hdr_intr_rmrks, value);
	}


	/**
	 * Header spare 1 ヘッダ予備１.<p>
	 *
	 */
	public String hdr_sub_char1() {
		return getConstString(offset + 51, $hdr_sub_char1);
	}

	/**
	 * Header spare 1 ヘッダ予備１.<p>
	 *
	 */
	public void hdr_sub_char1(String value) {
		setConstString(offset + 51, $hdr_sub_char1, value);
	}


	/**
	 * Header spare 2 ヘッダ予備２.<p>
	 *
	 */
	public String hdr_sub_char2() {
		return getConstString(offset + 52, $hdr_sub_char2);
	}

	/**
	 * Header spare 2 ヘッダ予備２.<p>
	 *
	 */
	public void hdr_sub_char2(String value) {
		setConstString(offset + 52, $hdr_sub_char2, value);
	}


	/**
	 * Header spare 3 ヘッダ予備３.<p>
	 *
	 */
	public String hdr_sub_char3() {
		return getConstString(offset + 53, $hdr_sub_char3);
	}

	/**
	 * Header spare 3 ヘッダ予備３.<p>
	 *
	 */
	public void hdr_sub_char3(String value) {
		setConstString(offset + 53, $hdr_sub_char3, value);
	}


	/**
	 * Last forecast date 前回内示日.<p>
	 *
	 */
	public MCDate pre_pf_dt() {
		return getConstDate(offset + 54, $pre_pf_dt);
	}

	/**
	 * Last forecast date 前回内示日.<p>
	 *
	 */
	public void pre_pf_dt(MCDate value) {
		setConstDate(offset + 54, $pre_pf_dt, value);
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


	public mcframe.clientMAUB.MAUBP5310.RtnMsgR rtn_msg_p(){
		return (mcframe.clientMAUB.MAUBP5310.RtnMsgR) getConstInnerRow(offset + 59, $rtn_msg_p);
	}
	
	public void rtn_msg_p(mcframe.clientMAUB.MAUBP5310.RtnMsgR row){
		setConstInnerRow(offset + 59, $rtn_msg_p, row);
	}


	public mcframe.clientMAUB.MAUBP5190.BpGrpR sppl_grp_p(){
		return (mcframe.clientMAUB.MAUBP5190.BpGrpR) getConstInnerRow(offset + 60, $sppl_grp_p);
	}
	
	public void sppl_grp_p(mcframe.clientMAUB.MAUBP5190.BpGrpR row){
		setConstInnerRow(offset + 60, $sppl_grp_p, row);
	}


	public mcframe.clientMAUB.MAUBP5170.ItmGrpR itm_grp_p(){
		return (mcframe.clientMAUB.MAUBP5170.ItmGrpR) getConstInnerRow(offset + 61, $itm_grp_p);
	}
	
	public void itm_grp_p(mcframe.clientMAUB.MAUBP5170.ItmGrpR row){
		setConstInnerRow(offset + 61, $itm_grp_p, row);
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
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public String ins_func_id() {
		return getConstString(offset + 64, $ins_func_id);
	}

	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public void ins_func_id(String value) {
		setConstString(offset + 64, $ins_func_id, value);
	}


	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public String ins_func_nm() {
		return getConstString(offset + 65, $ins_func_nm);
	}

	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public void ins_func_nm(String value) {
		setConstString(offset + 65, $ins_func_nm, value);
	}


	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public MCTimestamp ins_ts() {
		return getConstTimestamp(offset + 66, $ins_ts);
	}

	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public void ins_ts(MCTimestamp value) {
		setConstTimestamp(offset + 66, $ins_ts, value);
	}


	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public String upd_usr_id() {
		return getConstString(offset + 67, $upd_usr_id);
	}

	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public void upd_usr_id(String value) {
		setConstString(offset + 67, $upd_usr_id, value);
	}


	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public String upd_usr_nm() {
		return getConstString(offset + 68, $upd_usr_nm);
	}

	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public void upd_usr_nm(String value) {
		setConstString(offset + 68, $upd_usr_nm, value);
	}


	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public String upd_func_id() {
		return getConstString(offset + 69, $upd_func_id);
	}

	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public void upd_func_id(String value) {
		setConstString(offset + 69, $upd_func_id, value);
	}


	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public String upd_func_nm() {
		return getConstString(offset + 70, $upd_func_nm);
	}

	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public void upd_func_nm(String value) {
		setConstString(offset + 70, $upd_func_nm, value);
	}


	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public MCTimestamp upd_ts() {
		return getConstTimestamp(offset + 71, $upd_ts);
	}

	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public void upd_ts(MCTimestamp value) {
		setConstTimestamp(offset + 71, $upd_ts, value);
	}


	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public String upd_srv_req_no() {
		return getConstString(offset + 72, $upd_srv_req_no);
	}

	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public void upd_srv_req_no(String value) {
		setConstString(offset + 72, $upd_srv_req_no, value);
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
	 * Purchase forecast details No. 購買内示明細ＮＯ.<p>
	 *
	 */
	public String purc_frcst_d_no() {
		return getConstString(offset + 74, $purc_frcst_d_no);
	}

	/**
	 * Purchase forecast details No. 購買内示明細ＮＯ.<p>
	 *
	 */
	public void purc_frcst_d_no(String value) {
		setConstString(offset + 74, $purc_frcst_d_no, value);
	}


	/**
	 * Purchase forecast firm No. 購買内示確定ＮＯ.<p>
	 *
	 */
	public String purc_frcst_fix_no() {
		return getConstString(offset + 75, $purc_frcst_fix_no);
	}

	/**
	 * Purchase forecast firm No. 購買内示確定ＮＯ.<p>
	 *
	 */
	public void purc_frcst_fix_no(String value) {
		setConstString(offset + 75, $purc_frcst_fix_no, value);
	}


	/**
	 * Purchase forecast No. 購買内示ＮＯ.<p>
	 *
	 */
	public String purc_frcst_no() {
		return getConstString(offset + 76, $purc_frcst_no);
	}

	/**
	 * Purchase forecast No. 購買内示ＮＯ.<p>
	 *
	 */
	public void purc_frcst_no(String value) {
		setConstString(offset + 76, $purc_frcst_no, value);
	}


	public String getString(String name) {
		if ($pf_period_typ.equalsIgnoreCase(name)) {
			return pf_period_typ();
		}
		if ($pf_period_typ_nm.equalsIgnoreCase(name)) {
			return pf_period_typ_nm();
		}
		if ($trd_unit_cd.equalsIgnoreCase(name)) {
			return trd_unit_cd();
		}
		if ($trd_unit_nm.equalsIgnoreCase(name)) {
			return trd_unit_nm();
		}
		if ($pre_trd_unit_cd.equalsIgnoreCase(name)) {
			return pre_trd_unit_cd();
		}
		if ($pre_trd_unit_nm.equalsIgnoreCase(name)) {
			return pre_trd_unit_nm();
		}
		if ($base_unit_cd.equalsIgnoreCase(name)) {
			return base_unit_cd();
		}
		if ($base_unit_nm.equalsIgnoreCase(name)) {
			return base_unit_nm();
		}
		if ($base_unit_rnd_typ.equalsIgnoreCase(name)) {
			return base_unit_rnd_typ();
		}
		if ($dtl_rpt_rmrks.equalsIgnoreCase(name)) {
			return dtl_rpt_rmrks();
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
		if ($sppl_cd.equalsIgnoreCase(name)) {
			return sppl_cd();
		}
		if ($sppl_nm.equalsIgnoreCase(name)) {
			return sppl_nm();
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			return wg_nm();
		}
		if ($pf_rpt_no.equalsIgnoreCase(name)) {
			return pf_rpt_no();
		}
		if ($hdr_rpt_rmrks.equalsIgnoreCase(name)) {
			return hdr_rpt_rmrks();
		}
		if ($hdr_intr_rmrks.equalsIgnoreCase(name)) {
			return hdr_intr_rmrks();
		}
		if ($hdr_sub_char1.equalsIgnoreCase(name)) {
			return hdr_sub_char1();
		}
		if ($hdr_sub_char2.equalsIgnoreCase(name)) {
			return hdr_sub_char2();
		}
		if ($hdr_sub_char3.equalsIgnoreCase(name)) {
			return hdr_sub_char3();
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
		if ($purc_frcst_d_no.equalsIgnoreCase(name)) {
			return purc_frcst_d_no();
		}
		if ($purc_frcst_fix_no.equalsIgnoreCase(name)) {
			return purc_frcst_fix_no();
		}
		if ($purc_frcst_no.equalsIgnoreCase(name)) {
			return purc_frcst_no();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			return trd_unit_dec_place();
		}
		if ($trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			return trd_unit_conv_base_qty();
		}
		if ($trd_unit_conv_qty.equalsIgnoreCase(name)) {
			return trd_unit_conv_qty();
		}
		if ($pre_trd_unit_dec_place.equalsIgnoreCase(name)) {
			return pre_trd_unit_dec_place();
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			return base_unit_dec_place();
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			return upd_cntr();
		}
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		if ($pf_period_st_dt.equalsIgnoreCase(name)) {
			return pf_period_st_dt();
		}
		if ($pf_period_end_dt.equalsIgnoreCase(name)) {
			return pf_period_end_dt();
		}
		if ($pf_dt.equalsIgnoreCase(name)) {
			return pf_dt();
		}
		if ($pf_rpt_dt.equalsIgnoreCase(name)) {
			return pf_rpt_dt();
		}
		if ($del_pf_rpt_dt.equalsIgnoreCase(name)) {
			return del_pf_rpt_dt();
		}
		if ($pre_pf_dt.equalsIgnoreCase(name)) {
			return pre_pf_dt();
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
		if ($check.equalsIgnoreCase(name)) {
			return check();
		}
		if ($fix_flg.equalsIgnoreCase(name)) {
			return fix_flg();
		}
		if ($del_flg.equalsIgnoreCase(name)) {
			return del_flg();
		}
		if ($purc_commit_flg.equalsIgnoreCase(name)) {
			return purc_commit_flg();
		}
		if ($fix_period_flg.equalsIgnoreCase(name)) {
			return fix_period_flg();
		}
		if ($pre_fix_period_flg.equalsIgnoreCase(name)) {
			return pre_fix_period_flg();
		}
		if ($latest_flg.equalsIgnoreCase(name)) {
			return latest_flg();
		}
		if ($subcon_flg.equalsIgnoreCase(name)) {
			return subcon_flg();
		}
		if ($pf_rpt_flg.equalsIgnoreCase(name)) {
			return pf_rpt_flg();
		}
		if ($del_pf_rpt_flg.equalsIgnoreCase(name)) {
			return del_pf_rpt_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($pf_period_typ.equalsIgnoreCase(name)) {
			return pf_period_typ();
		}
		if ($pf_period_typ_nm.equalsIgnoreCase(name)) {
			return pf_period_typ_nm();
		}
		if ($trd_unit_cd.equalsIgnoreCase(name)) {
			return trd_unit_cd();
		}
		if ($trd_unit_nm.equalsIgnoreCase(name)) {
			return trd_unit_nm();
		}
		if ($pre_trd_unit_cd.equalsIgnoreCase(name)) {
			return pre_trd_unit_cd();
		}
		if ($pre_trd_unit_nm.equalsIgnoreCase(name)) {
			return pre_trd_unit_nm();
		}
		if ($base_unit_cd.equalsIgnoreCase(name)) {
			return base_unit_cd();
		}
		if ($base_unit_nm.equalsIgnoreCase(name)) {
			return base_unit_nm();
		}
		if ($base_unit_rnd_typ.equalsIgnoreCase(name)) {
			return base_unit_rnd_typ();
		}
		if ($dtl_rpt_rmrks.equalsIgnoreCase(name)) {
			return dtl_rpt_rmrks();
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
		if ($sppl_cd.equalsIgnoreCase(name)) {
			return sppl_cd();
		}
		if ($sppl_nm.equalsIgnoreCase(name)) {
			return sppl_nm();
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			return wg_nm();
		}
		if ($pf_rpt_no.equalsIgnoreCase(name)) {
			return pf_rpt_no();
		}
		if ($hdr_rpt_rmrks.equalsIgnoreCase(name)) {
			return hdr_rpt_rmrks();
		}
		if ($hdr_intr_rmrks.equalsIgnoreCase(name)) {
			return hdr_intr_rmrks();
		}
		if ($hdr_sub_char1.equalsIgnoreCase(name)) {
			return hdr_sub_char1();
		}
		if ($hdr_sub_char2.equalsIgnoreCase(name)) {
			return hdr_sub_char2();
		}
		if ($hdr_sub_char3.equalsIgnoreCase(name)) {
			return hdr_sub_char3();
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
		if ($purc_frcst_d_no.equalsIgnoreCase(name)) {
			return purc_frcst_d_no();
		}
		if ($purc_frcst_fix_no.equalsIgnoreCase(name)) {
			return purc_frcst_fix_no();
		}
		if ($purc_frcst_no.equalsIgnoreCase(name)) {
			return purc_frcst_no();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			return trd_unit_dec_place();
		}
		if ($trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			return trd_unit_conv_base_qty();
		}
		if ($trd_unit_conv_qty.equalsIgnoreCase(name)) {
			return trd_unit_conv_qty();
		}
		if ($pre_trd_unit_dec_place.equalsIgnoreCase(name)) {
			return pre_trd_unit_dec_place();
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			return base_unit_dec_place();
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			return upd_cntr();
		}
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($pf_period_st_dt.equalsIgnoreCase(name)) {
			return pf_period_st_dt();
		}
		if ($pf_period_end_dt.equalsIgnoreCase(name)) {
			return pf_period_end_dt();
		}
		if ($pf_dt.equalsIgnoreCase(name)) {
			return pf_dt();
		}
		if ($pf_rpt_dt.equalsIgnoreCase(name)) {
			return pf_rpt_dt();
		}
		if ($del_pf_rpt_dt.equalsIgnoreCase(name)) {
			return del_pf_rpt_dt();
		}
		if ($pre_pf_dt.equalsIgnoreCase(name)) {
			return pre_pf_dt();
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
		if ($check.equalsIgnoreCase(name)) {
			return check();
		}
		if ($fix_flg.equalsIgnoreCase(name)) {
			return fix_flg();
		}
		if ($del_flg.equalsIgnoreCase(name)) {
			return del_flg();
		}
		if ($purc_commit_flg.equalsIgnoreCase(name)) {
			return purc_commit_flg();
		}
		if ($fix_period_flg.equalsIgnoreCase(name)) {
			return fix_period_flg();
		}
		if ($pre_fix_period_flg.equalsIgnoreCase(name)) {
			return pre_fix_period_flg();
		}
		if ($latest_flg.equalsIgnoreCase(name)) {
			return latest_flg();
		}
		if ($subcon_flg.equalsIgnoreCase(name)) {
			return subcon_flg();
		}
		if ($pf_rpt_flg.equalsIgnoreCase(name)) {
			return pf_rpt_flg();
		}
		if ($del_pf_rpt_flg.equalsIgnoreCase(name)) {
			return del_pf_rpt_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($pf_period_typ.equalsIgnoreCase(name)) {
			pf_period_typ(value);
			return;
		}
		if ($pf_period_typ_nm.equalsIgnoreCase(name)) {
			pf_period_typ_nm(value);
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
		if ($pre_trd_unit_cd.equalsIgnoreCase(name)) {
			pre_trd_unit_cd(value);
			return;
		}
		if ($pre_trd_unit_nm.equalsIgnoreCase(name)) {
			pre_trd_unit_nm(value);
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
		if ($base_unit_rnd_typ.equalsIgnoreCase(name)) {
			base_unit_rnd_typ(value);
			return;
		}
		if ($dtl_rpt_rmrks.equalsIgnoreCase(name)) {
			dtl_rpt_rmrks(value);
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
		if ($sppl_cd.equalsIgnoreCase(name)) {
			sppl_cd(value);
			return;
		}
		if ($sppl_nm.equalsIgnoreCase(name)) {
			sppl_nm(value);
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
		if ($pf_rpt_no.equalsIgnoreCase(name)) {
			pf_rpt_no(value);
			return;
		}
		if ($hdr_rpt_rmrks.equalsIgnoreCase(name)) {
			hdr_rpt_rmrks(value);
			return;
		}
		if ($hdr_intr_rmrks.equalsIgnoreCase(name)) {
			hdr_intr_rmrks(value);
			return;
		}
		if ($hdr_sub_char1.equalsIgnoreCase(name)) {
			hdr_sub_char1(value);
			return;
		}
		if ($hdr_sub_char2.equalsIgnoreCase(name)) {
			hdr_sub_char2(value);
			return;
		}
		if ($hdr_sub_char3.equalsIgnoreCase(name)) {
			hdr_sub_char3(value);
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
		if ($purc_frcst_d_no.equalsIgnoreCase(name)) {
			purc_frcst_d_no(value);
			return;
		}
		if ($purc_frcst_fix_no.equalsIgnoreCase(name)) {
			purc_frcst_fix_no(value);
			return;
		}
		if ($purc_frcst_no.equalsIgnoreCase(name)) {
			purc_frcst_no(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			trd_unit_dec_place(value);
			return;
		}
		if ($trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			trd_unit_conv_base_qty(value);
			return;
		}
		if ($trd_unit_conv_qty.equalsIgnoreCase(name)) {
			trd_unit_conv_qty(value);
			return;
		}
		if ($pre_trd_unit_dec_place.equalsIgnoreCase(name)) {
			pre_trd_unit_dec_place(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			trd_unit_dec_place(value);
			return;
		}
		if ($trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			trd_unit_conv_base_qty(value);
			return;
		}
		if ($trd_unit_conv_qty.equalsIgnoreCase(name)) {
			trd_unit_conv_qty(value);
			return;
		}
		if ($pre_trd_unit_dec_place.equalsIgnoreCase(name)) {
			pre_trd_unit_dec_place(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			trd_unit_dec_place(value);
			return;
		}
		if ($trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			trd_unit_conv_base_qty(value);
			return;
		}
		if ($trd_unit_conv_qty.equalsIgnoreCase(name)) {
			trd_unit_conv_qty(value);
			return;
		}
		if ($pre_trd_unit_dec_place.equalsIgnoreCase(name)) {
			pre_trd_unit_dec_place(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			trd_unit_dec_place(value);
			return;
		}
		if ($trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			trd_unit_conv_base_qty(value);
			return;
		}
		if ($trd_unit_conv_qty.equalsIgnoreCase(name)) {
			trd_unit_conv_qty(value);
			return;
		}
		if ($pre_trd_unit_dec_place.equalsIgnoreCase(name)) {
			pre_trd_unit_dec_place(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			trd_unit_dec_place(value);
			return;
		}
		if ($trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			trd_unit_conv_base_qty(value);
			return;
		}
		if ($trd_unit_conv_qty.equalsIgnoreCase(name)) {
			trd_unit_conv_qty(value);
			return;
		}
		if ($pre_trd_unit_dec_place.equalsIgnoreCase(name)) {
			pre_trd_unit_dec_place(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($pf_period_st_dt.equalsIgnoreCase(name)) {
			pf_period_st_dt(value);
			return;
		}
		if ($pf_period_end_dt.equalsIgnoreCase(name)) {
			pf_period_end_dt(value);
			return;
		}
		if ($pf_dt.equalsIgnoreCase(name)) {
			pf_dt(value);
			return;
		}
		if ($pf_rpt_dt.equalsIgnoreCase(name)) {
			pf_rpt_dt(value);
			return;
		}
		if ($del_pf_rpt_dt.equalsIgnoreCase(name)) {
			del_pf_rpt_dt(value);
			return;
		}
		if ($pre_pf_dt.equalsIgnoreCase(name)) {
			pre_pf_dt(value);
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
		if ($check.equalsIgnoreCase(name)) {
			check(value);
			return;
		}
		if ($fix_flg.equalsIgnoreCase(name)) {
			fix_flg(value);
			return;
		}
		if ($del_flg.equalsIgnoreCase(name)) {
			del_flg(value);
			return;
		}
		if ($purc_commit_flg.equalsIgnoreCase(name)) {
			purc_commit_flg(value);
			return;
		}
		if ($fix_period_flg.equalsIgnoreCase(name)) {
			fix_period_flg(value);
			return;
		}
		if ($pre_fix_period_flg.equalsIgnoreCase(name)) {
			pre_fix_period_flg(value);
			return;
		}
		if ($latest_flg.equalsIgnoreCase(name)) {
			latest_flg(value);
			return;
		}
		if ($subcon_flg.equalsIgnoreCase(name)) {
			subcon_flg(value);
			return;
		}
		if ($pf_rpt_flg.equalsIgnoreCase(name)) {
			pf_rpt_flg(value);
			return;
		}
		if ($del_pf_rpt_flg.equalsIgnoreCase(name)) {
			del_pf_rpt_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($pf_period_typ.equalsIgnoreCase(name)) {
			pf_period_typ(value);
			return;
		}
		if ($pf_period_typ_nm.equalsIgnoreCase(name)) {
			pf_period_typ_nm(value);
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
		if ($pre_trd_unit_cd.equalsIgnoreCase(name)) {
			pre_trd_unit_cd(value);
			return;
		}
		if ($pre_trd_unit_nm.equalsIgnoreCase(name)) {
			pre_trd_unit_nm(value);
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
		if ($base_unit_rnd_typ.equalsIgnoreCase(name)) {
			base_unit_rnd_typ(value);
			return;
		}
		if ($dtl_rpt_rmrks.equalsIgnoreCase(name)) {
			dtl_rpt_rmrks(value);
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
		if ($sppl_cd.equalsIgnoreCase(name)) {
			sppl_cd(value);
			return;
		}
		if ($sppl_nm.equalsIgnoreCase(name)) {
			sppl_nm(value);
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
		if ($pf_rpt_no.equalsIgnoreCase(name)) {
			pf_rpt_no(value);
			return;
		}
		if ($hdr_rpt_rmrks.equalsIgnoreCase(name)) {
			hdr_rpt_rmrks(value);
			return;
		}
		if ($hdr_intr_rmrks.equalsIgnoreCase(name)) {
			hdr_intr_rmrks(value);
			return;
		}
		if ($hdr_sub_char1.equalsIgnoreCase(name)) {
			hdr_sub_char1(value);
			return;
		}
		if ($hdr_sub_char2.equalsIgnoreCase(name)) {
			hdr_sub_char2(value);
			return;
		}
		if ($hdr_sub_char3.equalsIgnoreCase(name)) {
			hdr_sub_char3(value);
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
		if ($purc_frcst_d_no.equalsIgnoreCase(name)) {
			purc_frcst_d_no(value);
			return;
		}
		if ($purc_frcst_fix_no.equalsIgnoreCase(name)) {
			purc_frcst_fix_no(value);
			return;
		}
		if ($purc_frcst_no.equalsIgnoreCase(name)) {
			purc_frcst_no(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			trd_unit_dec_place(value);
			return;
		}
		if ($trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			trd_unit_conv_base_qty(value);
			return;
		}
		if ($trd_unit_conv_qty.equalsIgnoreCase(name)) {
			trd_unit_conv_qty(value);
			return;
		}
		if ($pre_trd_unit_dec_place.equalsIgnoreCase(name)) {
			pre_trd_unit_dec_place(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			trd_unit_dec_place(value);
			return;
		}
		if ($trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			trd_unit_conv_base_qty(value);
			return;
		}
		if ($trd_unit_conv_qty.equalsIgnoreCase(name)) {
			trd_unit_conv_qty(value);
			return;
		}
		if ($pre_trd_unit_dec_place.equalsIgnoreCase(name)) {
			pre_trd_unit_dec_place(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			trd_unit_dec_place(value);
			return;
		}
		if ($trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			trd_unit_conv_base_qty(value);
			return;
		}
		if ($trd_unit_conv_qty.equalsIgnoreCase(name)) {
			trd_unit_conv_qty(value);
			return;
		}
		if ($pre_trd_unit_dec_place.equalsIgnoreCase(name)) {
			pre_trd_unit_dec_place(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			trd_unit_dec_place(value);
			return;
		}
		if ($trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			trd_unit_conv_base_qty(value);
			return;
		}
		if ($trd_unit_conv_qty.equalsIgnoreCase(name)) {
			trd_unit_conv_qty(value);
			return;
		}
		if ($pre_trd_unit_dec_place.equalsIgnoreCase(name)) {
			pre_trd_unit_dec_place(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			trd_unit_dec_place(value);
			return;
		}
		if ($trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			trd_unit_conv_base_qty(value);
			return;
		}
		if ($trd_unit_conv_qty.equalsIgnoreCase(name)) {
			trd_unit_conv_qty(value);
			return;
		}
		if ($pre_trd_unit_dec_place.equalsIgnoreCase(name)) {
			pre_trd_unit_dec_place(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($pf_period_st_dt.equalsIgnoreCase(name)) {
			pf_period_st_dt(value);
			return;
		}
		if ($pf_period_end_dt.equalsIgnoreCase(name)) {
			pf_period_end_dt(value);
			return;
		}
		if ($pf_dt.equalsIgnoreCase(name)) {
			pf_dt(value);
			return;
		}
		if ($pf_rpt_dt.equalsIgnoreCase(name)) {
			pf_rpt_dt(value);
			return;
		}
		if ($del_pf_rpt_dt.equalsIgnoreCase(name)) {
			del_pf_rpt_dt(value);
			return;
		}
		if ($pre_pf_dt.equalsIgnoreCase(name)) {
			pre_pf_dt(value);
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
		if ($check.equalsIgnoreCase(name)) {
			check(value);
			return;
		}
		if ($fix_flg.equalsIgnoreCase(name)) {
			fix_flg(value);
			return;
		}
		if ($del_flg.equalsIgnoreCase(name)) {
			del_flg(value);
			return;
		}
		if ($purc_commit_flg.equalsIgnoreCase(name)) {
			purc_commit_flg(value);
			return;
		}
		if ($fix_period_flg.equalsIgnoreCase(name)) {
			fix_period_flg(value);
			return;
		}
		if ($pre_fix_period_flg.equalsIgnoreCase(name)) {
			pre_fix_period_flg(value);
			return;
		}
		if ($latest_flg.equalsIgnoreCase(name)) {
			latest_flg(value);
			return;
		}
		if ($subcon_flg.equalsIgnoreCase(name)) {
			subcon_flg(value);
			return;
		}
		if ($pf_rpt_flg.equalsIgnoreCase(name)) {
			pf_rpt_flg(value);
			return;
		}
		if ($del_pf_rpt_flg.equalsIgnoreCase(name)) {
			del_pf_rpt_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}

	public MCRow getInnerRow(String name) {
		if ($itm_p.equalsIgnoreCase(name)) {
			return itm_p();
		}
		if ($trd_unit_schd_qty_p.equalsIgnoreCase(name)) {
			return trd_unit_schd_qty_p();
		}
		if ($trd_unit_pf_qty_p.equalsIgnoreCase(name)) {
			return trd_unit_pf_qty_p();
		}
		if ($trd_unit_prms_qty_p.equalsIgnoreCase(name)) {
			return trd_unit_prms_qty_p();
		}
		if ($pre_trd_unit_pf_qty_p.equalsIgnoreCase(name)) {
			return pre_trd_unit_pf_qty_p();
		}
		if ($base_unit_schd_qty_p.equalsIgnoreCase(name)) {
			return base_unit_schd_qty_p();
		}
		if ($base_unit_pf_qty_p.equalsIgnoreCase(name)) {
			return base_unit_pf_qty_p();
		}
		if ($base_unit_prms_qty_p.equalsIgnoreCase(name)) {
			return base_unit_prms_qty_p();
		}
		if ($pre_base_unit_pf_qty_p.equalsIgnoreCase(name)) {
			return pre_base_unit_pf_qty_p();
		}
		if ($usr_dpt_p.equalsIgnoreCase(name)) {
			return usr_dpt_p();
		}
		if ($rtn_msg_p.equalsIgnoreCase(name)) {
			return rtn_msg_p();
		}
		if ($sppl_grp_p.equalsIgnoreCase(name)) {
			return sppl_grp_p();
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
		if ($trd_unit_schd_qty_p.equalsIgnoreCase(name)) {
			trd_unit_schd_qty_p(
				((MCContainerMeta) trd_unit_schd_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($trd_unit_pf_qty_p.equalsIgnoreCase(name)) {
			trd_unit_pf_qty_p(
				((MCContainerMeta) trd_unit_pf_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($trd_unit_prms_qty_p.equalsIgnoreCase(name)) {
			trd_unit_prms_qty_p(
				((MCContainerMeta) trd_unit_prms_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($pre_trd_unit_pf_qty_p.equalsIgnoreCase(name)) {
			pre_trd_unit_pf_qty_p(
				((MCContainerMeta) pre_trd_unit_pf_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($base_unit_schd_qty_p.equalsIgnoreCase(name)) {
			base_unit_schd_qty_p(
				((MCContainerMeta) base_unit_schd_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($base_unit_pf_qty_p.equalsIgnoreCase(name)) {
			base_unit_pf_qty_p(
				((MCContainerMeta) base_unit_pf_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($base_unit_prms_qty_p.equalsIgnoreCase(name)) {
			base_unit_prms_qty_p(
				((MCContainerMeta) base_unit_prms_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($pre_base_unit_pf_qty_p.equalsIgnoreCase(name)) {
			pre_base_unit_pf_qty_p(
				((MCContainerMeta) pre_base_unit_pf_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($usr_dpt_p.equalsIgnoreCase(name)) {
			usr_dpt_p(
				((MCContainerMeta) usr_dpt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5230.UsrDptR.class, value)
			);
			return;
		}
		if ($rtn_msg_p.equalsIgnoreCase(name)) {
			rtn_msg_p(
				((MCContainerMeta) rtn_msg_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5310.RtnMsgR.class, value)
			);
			return;
		}
		if ($sppl_grp_p.equalsIgnoreCase(name)) {
			sppl_grp_p(
				((MCContainerMeta) sppl_grp_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5190.BpGrpR.class, value)
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
	 * Scheduled qty. 予定数量.<p>
	 *
	 */
	public MCNumber trd_unit_schd_qty() {
		return trd_unit_schd_qty_p().qty();
	}

	/**
	 * Scheduled qty. 予定数量.<p>
	 *
	 */
	public void trd_unit_schd_qty(MCNumber value) {
		trd_unit_schd_qty_p().qty(value);
	}

	/**
	 * Scheduled qty. 予定数量.<p>
	 *
	 */
	public void trd_unit_schd_qty(int value) {
		trd_unit_schd_qty_p().qty(value);
	}

	/**
	 * Scheduled qty. 予定数量.<p>
	 *
	 */
	public void trd_unit_schd_qty(long value) {
		trd_unit_schd_qty_p().qty(value);
	}

	/**
	 * Scheduled qty. 予定数量.<p>
	 *
	 */
	public void trd_unit_schd_qty(float value) {
		trd_unit_schd_qty_p().qty(value);
	}

	/**
	 * Scheduled qty. 予定数量.<p>
	 *
	 */
	public void trd_unit_schd_qty(double value) {
		trd_unit_schd_qty_p().qty(value);
	}

	/**
	 * Forecast qty. 内示数量.<p>
	 *
	 */
	public MCNumber trd_unit_pf_qty() {
		return trd_unit_pf_qty_p().qty();
	}

	/**
	 * Forecast qty. 内示数量.<p>
	 *
	 */
	public void trd_unit_pf_qty(MCNumber value) {
		trd_unit_pf_qty_p().qty(value);
	}

	/**
	 * Forecast qty. 内示数量.<p>
	 *
	 */
	public void trd_unit_pf_qty(int value) {
		trd_unit_pf_qty_p().qty(value);
	}

	/**
	 * Forecast qty. 内示数量.<p>
	 *
	 */
	public void trd_unit_pf_qty(long value) {
		trd_unit_pf_qty_p().qty(value);
	}

	/**
	 * Forecast qty. 内示数量.<p>
	 *
	 */
	public void trd_unit_pf_qty(float value) {
		trd_unit_pf_qty_p().qty(value);
	}

	/**
	 * Forecast qty. 内示数量.<p>
	 *
	 */
	public void trd_unit_pf_qty(double value) {
		trd_unit_pf_qty_p().qty(value);
	}

	/**
	 * Replied qty. 回答数量.<p>
	 *
	 */
	public MCNumber trd_unit_prms_qty() {
		return trd_unit_prms_qty_p().qty();
	}

	/**
	 * Replied qty. 回答数量.<p>
	 *
	 */
	public void trd_unit_prms_qty(MCNumber value) {
		trd_unit_prms_qty_p().qty(value);
	}

	/**
	 * Replied qty. 回答数量.<p>
	 *
	 */
	public void trd_unit_prms_qty(int value) {
		trd_unit_prms_qty_p().qty(value);
	}

	/**
	 * Replied qty. 回答数量.<p>
	 *
	 */
	public void trd_unit_prms_qty(long value) {
		trd_unit_prms_qty_p().qty(value);
	}

	/**
	 * Replied qty. 回答数量.<p>
	 *
	 */
	public void trd_unit_prms_qty(float value) {
		trd_unit_prms_qty_p().qty(value);
	}

	/**
	 * Replied qty. 回答数量.<p>
	 *
	 */
	public void trd_unit_prms_qty(double value) {
		trd_unit_prms_qty_p().qty(value);
	}

	/**
	 * Last forecast qty. 前回内示数量.<p>
	 *
	 */
	public MCNumber pre_trd_unit_pf_qty() {
		return pre_trd_unit_pf_qty_p().qty();
	}

	/**
	 * Last forecast qty. 前回内示数量.<p>
	 *
	 */
	public void pre_trd_unit_pf_qty(MCNumber value) {
		pre_trd_unit_pf_qty_p().qty(value);
	}

	/**
	 * Last forecast qty. 前回内示数量.<p>
	 *
	 */
	public void pre_trd_unit_pf_qty(int value) {
		pre_trd_unit_pf_qty_p().qty(value);
	}

	/**
	 * Last forecast qty. 前回内示数量.<p>
	 *
	 */
	public void pre_trd_unit_pf_qty(long value) {
		pre_trd_unit_pf_qty_p().qty(value);
	}

	/**
	 * Last forecast qty. 前回内示数量.<p>
	 *
	 */
	public void pre_trd_unit_pf_qty(float value) {
		pre_trd_unit_pf_qty_p().qty(value);
	}

	/**
	 * Last forecast qty. 前回内示数量.<p>
	 *
	 */
	public void pre_trd_unit_pf_qty(double value) {
		pre_trd_unit_pf_qty_p().qty(value);
	}

	/**
	 * Base unit scheduled qty. 基準単位予定数量.<p>
	 *
	 */
	public MCNumber base_unit_schd_qty() {
		return base_unit_schd_qty_p().qty();
	}

	/**
	 * Base unit scheduled qty. 基準単位予定数量.<p>
	 *
	 */
	public void base_unit_schd_qty(MCNumber value) {
		base_unit_schd_qty_p().qty(value);
	}

	/**
	 * Base unit scheduled qty. 基準単位予定数量.<p>
	 *
	 */
	public void base_unit_schd_qty(int value) {
		base_unit_schd_qty_p().qty(value);
	}

	/**
	 * Base unit scheduled qty. 基準単位予定数量.<p>
	 *
	 */
	public void base_unit_schd_qty(long value) {
		base_unit_schd_qty_p().qty(value);
	}

	/**
	 * Base unit scheduled qty. 基準単位予定数量.<p>
	 *
	 */
	public void base_unit_schd_qty(float value) {
		base_unit_schd_qty_p().qty(value);
	}

	/**
	 * Base unit scheduled qty. 基準単位予定数量.<p>
	 *
	 */
	public void base_unit_schd_qty(double value) {
		base_unit_schd_qty_p().qty(value);
	}

	/**
	 * Base unit forecast qty. 基準単位内示数量.<p>
	 *
	 */
	public MCNumber base_unit_pf_qty() {
		return base_unit_pf_qty_p().qty();
	}

	/**
	 * Base unit forecast qty. 基準単位内示数量.<p>
	 *
	 */
	public void base_unit_pf_qty(MCNumber value) {
		base_unit_pf_qty_p().qty(value);
	}

	/**
	 * Base unit forecast qty. 基準単位内示数量.<p>
	 *
	 */
	public void base_unit_pf_qty(int value) {
		base_unit_pf_qty_p().qty(value);
	}

	/**
	 * Base unit forecast qty. 基準単位内示数量.<p>
	 *
	 */
	public void base_unit_pf_qty(long value) {
		base_unit_pf_qty_p().qty(value);
	}

	/**
	 * Base unit forecast qty. 基準単位内示数量.<p>
	 *
	 */
	public void base_unit_pf_qty(float value) {
		base_unit_pf_qty_p().qty(value);
	}

	/**
	 * Base unit forecast qty. 基準単位内示数量.<p>
	 *
	 */
	public void base_unit_pf_qty(double value) {
		base_unit_pf_qty_p().qty(value);
	}

	/**
	 * Base unit replied qty. 基準単位回答数量.<p>
	 *
	 */
	public MCNumber base_unit_prms_qty() {
		return base_unit_prms_qty_p().qty();
	}

	/**
	 * Base unit replied qty. 基準単位回答数量.<p>
	 *
	 */
	public void base_unit_prms_qty(MCNumber value) {
		base_unit_prms_qty_p().qty(value);
	}

	/**
	 * Base unit replied qty. 基準単位回答数量.<p>
	 *
	 */
	public void base_unit_prms_qty(int value) {
		base_unit_prms_qty_p().qty(value);
	}

	/**
	 * Base unit replied qty. 基準単位回答数量.<p>
	 *
	 */
	public void base_unit_prms_qty(long value) {
		base_unit_prms_qty_p().qty(value);
	}

	/**
	 * Base unit replied qty. 基準単位回答数量.<p>
	 *
	 */
	public void base_unit_prms_qty(float value) {
		base_unit_prms_qty_p().qty(value);
	}

	/**
	 * Base unit replied qty. 基準単位回答数量.<p>
	 *
	 */
	public void base_unit_prms_qty(double value) {
		base_unit_prms_qty_p().qty(value);
	}

	/**
	 * Base unit last forecast qty. 基準単位前回内示数量.<p>
	 *
	 */
	public MCNumber pre_base_unit_pf_qty() {
		return pre_base_unit_pf_qty_p().qty();
	}

	/**
	 * Base unit last forecast qty. 基準単位前回内示数量.<p>
	 *
	 */
	public void pre_base_unit_pf_qty(MCNumber value) {
		pre_base_unit_pf_qty_p().qty(value);
	}

	/**
	 * Base unit last forecast qty. 基準単位前回内示数量.<p>
	 *
	 */
	public void pre_base_unit_pf_qty(int value) {
		pre_base_unit_pf_qty_p().qty(value);
	}

	/**
	 * Base unit last forecast qty. 基準単位前回内示数量.<p>
	 *
	 */
	public void pre_base_unit_pf_qty(long value) {
		pre_base_unit_pf_qty_p().qty(value);
	}

	/**
	 * Base unit last forecast qty. 基準単位前回内示数量.<p>
	 *
	 */
	public void pre_base_unit_pf_qty(float value) {
		pre_base_unit_pf_qty_p().qty(value);
	}

	/**
	 * Base unit last forecast qty. 基準単位前回内示数量.<p>
	 *
	 */
	public void pre_base_unit_pf_qty(double value) {
		pre_base_unit_pf_qty_p().qty(value);
	}

	/**
	 * Forecast PIC cd. 内示担当者ＣＤ.<p>
	 *
	 */
	public String pf_usr_cd() {
		return usr_dpt_p().usr_cd();
	}

	/**
	 * Forecast PIC cd. 内示担当者ＣＤ.<p>
	 *
	 */
	public void pf_usr_cd(String value) {
		usr_dpt_p().usr_cd(value);
	}

	/**
	 * Forecast PIC name 内示担当者名.<p>
	 *
	 */
	public String pf_usr_nm() {
		return usr_dpt_p().usr_nm();
	}

	/**
	 * Forecast PIC name 内示担当者名.<p>
	 *
	 */
	public void pf_usr_nm(String value) {
		usr_dpt_p().usr_nm(value);
	}

	/**
	 * Forecast dept. cd. 内示部門ＣＤ.<p>
	 *
	 */
	public String pf_dpt_cd() {
		return usr_dpt_p().dpt_cd();
	}

	/**
	 * Forecast dept. cd. 内示部門ＣＤ.<p>
	 *
	 */
	public void pf_dpt_cd(String value) {
		usr_dpt_p().dpt_cd(value);
	}

	/**
	 * Forecast dept. name 内示部門名.<p>
	 *
	 */
	public String pf_dpt_nm() {
		return usr_dpt_p().dpt_nm();
	}

	/**
	 * Forecast dept. name 内示部門名.<p>
	 *
	 */
	public void pf_dpt_nm(String value) {
		usr_dpt_p().dpt_nm(value);
	}

	public String rtn_sts_typ() {
		return rtn_msg_p().rtn_sts_typ();
	}

	public void rtn_sts_typ(String value) {
		rtn_msg_p().rtn_sts_typ(value);
	}

	/**
	 * Supplier classification cd. 1 発注先分類ＣＤ１.<p>
	 *
	 */
	public String sppl_grp_cd1() {
		return sppl_grp_p().bp_grp_cd1();
	}

	/**
	 * Supplier classification cd. 1 発注先分類ＣＤ１.<p>
	 *
	 */
	public void sppl_grp_cd1(String value) {
		sppl_grp_p().bp_grp_cd1(value);
	}

	/**
	 * Supplier classification name 1 発注先分類名１.<p>
	 *
	 */
	public String sppl_grp_nm1() {
		return sppl_grp_p().bp_grp_nm1();
	}

	/**
	 * Supplier classification name 1 発注先分類名１.<p>
	 *
	 */
	public void sppl_grp_nm1(String value) {
		sppl_grp_p().bp_grp_nm1(value);
	}

	/**
	 * Supplier classification cd. 2 発注先分類ＣＤ２.<p>
	 *
	 */
	public String sppl_grp_cd2() {
		return sppl_grp_p().bp_grp_cd2();
	}

	/**
	 * Supplier classification cd. 2 発注先分類ＣＤ２.<p>
	 *
	 */
	public void sppl_grp_cd2(String value) {
		sppl_grp_p().bp_grp_cd2(value);
	}

	/**
	 * Supplier classification name 2 発注先分類名２.<p>
	 *
	 */
	public String sppl_grp_nm2() {
		return sppl_grp_p().bp_grp_nm2();
	}

	/**
	 * Supplier classification name 2 発注先分類名２.<p>
	 *
	 */
	public void sppl_grp_nm2(String value) {
		sppl_grp_p().bp_grp_nm2(value);
	}

	/**
	 * Supplier classification cd. 3 発注先分類ＣＤ３.<p>
	 *
	 */
	public String sppl_grp_cd3() {
		return sppl_grp_p().bp_grp_cd3();
	}

	/**
	 * Supplier classification cd. 3 発注先分類ＣＤ３.<p>
	 *
	 */
	public void sppl_grp_cd3(String value) {
		sppl_grp_p().bp_grp_cd3(value);
	}

	/**
	 * Supplier classification name 3 発注先分類名３.<p>
	 *
	 */
	public String sppl_grp_nm3() {
		return sppl_grp_p().bp_grp_nm3();
	}

	/**
	 * Supplier classification name 3 発注先分類名３.<p>
	 *
	 */
	public void sppl_grp_nm3(String value) {
		sppl_grp_p().bp_grp_nm3(value);
	}

	/**
	 * Supplier classification cd. 4 発注先分類ＣＤ４.<p>
	 *
	 */
	public String sppl_grp_cd4() {
		return sppl_grp_p().bp_grp_cd4();
	}

	/**
	 * Supplier classification cd. 4 発注先分類ＣＤ４.<p>
	 *
	 */
	public void sppl_grp_cd4(String value) {
		sppl_grp_p().bp_grp_cd4(value);
	}

	/**
	 * Supplier classification name 4 発注先分類名４.<p>
	 *
	 */
	public String sppl_grp_nm4() {
		return sppl_grp_p().bp_grp_nm4();
	}

	/**
	 * Supplier classification name 4 発注先分類名４.<p>
	 *
	 */
	public void sppl_grp_nm4(String value) {
		sppl_grp_p().bp_grp_nm4(value);
	}

	/**
	 * Supplier classification cd. 5 発注先分類ＣＤ５.<p>
	 *
	 */
	public String sppl_grp_cd5() {
		return sppl_grp_p().bp_grp_cd5();
	}

	/**
	 * Supplier classification cd. 5 発注先分類ＣＤ５.<p>
	 *
	 */
	public void sppl_grp_cd5(String value) {
		sppl_grp_p().bp_grp_cd5(value);
	}

	/**
	 * Supplier classification name 5 発注先分類名５.<p>
	 *
	 */
	public String sppl_grp_nm5() {
		return sppl_grp_p().bp_grp_nm5();
	}

	/**
	 * Supplier classification name 5 発注先分類名５.<p>
	 *
	 */
	public void sppl_grp_nm5(String value) {
		sppl_grp_p().bp_grp_nm5(value);
	}

	/**
	 * Supplier classification cd. 6 発注先分類ＣＤ６.<p>
	 *
	 */
	public String sppl_grp_cd6() {
		return sppl_grp_p().bp_grp_cd6();
	}

	/**
	 * Supplier classification cd. 6 発注先分類ＣＤ６.<p>
	 *
	 */
	public void sppl_grp_cd6(String value) {
		sppl_grp_p().bp_grp_cd6(value);
	}

	/**
	 * Supplier classification name 6 発注先分類名６.<p>
	 *
	 */
	public String sppl_grp_nm6() {
		return sppl_grp_p().bp_grp_nm6();
	}

	/**
	 * Supplier classification name 6 発注先分類名６.<p>
	 *
	 */
	public void sppl_grp_nm6(String value) {
		sppl_grp_p().bp_grp_nm6(value);
	}

	/**
	 * Supplier classification cd. 7 発注先分類ＣＤ７.<p>
	 *
	 */
	public String sppl_grp_cd7() {
		return sppl_grp_p().bp_grp_cd7();
	}

	/**
	 * Supplier classification cd. 7 発注先分類ＣＤ７.<p>
	 *
	 */
	public void sppl_grp_cd7(String value) {
		sppl_grp_p().bp_grp_cd7(value);
	}

	/**
	 * Supplier classification name 7 発注先分類名７.<p>
	 *
	 */
	public String sppl_grp_nm7() {
		return sppl_grp_p().bp_grp_nm7();
	}

	/**
	 * Supplier classification name 7 発注先分類名７.<p>
	 *
	 */
	public void sppl_grp_nm7(String value) {
		sppl_grp_p().bp_grp_nm7(value);
	}

	/**
	 * Supplier classification cd. 8 発注先分類ＣＤ８.<p>
	 *
	 */
	public String sppl_grp_cd8() {
		return sppl_grp_p().bp_grp_cd8();
	}

	/**
	 * Supplier classification cd. 8 発注先分類ＣＤ８.<p>
	 *
	 */
	public void sppl_grp_cd8(String value) {
		sppl_grp_p().bp_grp_cd8(value);
	}

	/**
	 * Supplier classification name 8 発注先分類名８.<p>
	 *
	 */
	public String sppl_grp_nm8() {
		return sppl_grp_p().bp_grp_nm8();
	}

	/**
	 * Supplier classification name 8 発注先分類名８.<p>
	 *
	 */
	public void sppl_grp_nm8(String value) {
		sppl_grp_p().bp_grp_nm8(value);
	}

	/**
	 * Supplier classification cd. 9 発注先分類ＣＤ９.<p>
	 *
	 */
	public String sppl_grp_cd9() {
		return sppl_grp_p().bp_grp_cd9();
	}

	/**
	 * Supplier classification cd. 9 発注先分類ＣＤ９.<p>
	 *
	 */
	public void sppl_grp_cd9(String value) {
		sppl_grp_p().bp_grp_cd9(value);
	}

	/**
	 * Supplier classification name 9 発注先分類名９.<p>
	 *
	 */
	public String sppl_grp_nm9() {
		return sppl_grp_p().bp_grp_nm9();
	}

	/**
	 * Supplier classification name 9 発注先分類名９.<p>
	 *
	 */
	public void sppl_grp_nm9(String value) {
		sppl_grp_p().bp_grp_nm9(value);
	}

	/**
	 * Supplier classification cd. 10 発注先分類ＣＤ１０.<p>
	 *
	 */
	public String sppl_grp_cd10() {
		return sppl_grp_p().bp_grp_cd10();
	}

	/**
	 * Supplier classification cd. 10 発注先分類ＣＤ１０.<p>
	 *
	 */
	public void sppl_grp_cd10(String value) {
		sppl_grp_p().bp_grp_cd10(value);
	}

	/**
	 * Supplier classification name 10 発注先分類名１０.<p>
	 *
	 */
	public String sppl_grp_nm10() {
		return sppl_grp_p().bp_grp_nm10();
	}

	/**
	 * Supplier classification name 10 発注先分類名１０.<p>
	 *
	 */
	public void sppl_grp_nm10(String value) {
		sppl_grp_p().bp_grp_nm10(value);
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

