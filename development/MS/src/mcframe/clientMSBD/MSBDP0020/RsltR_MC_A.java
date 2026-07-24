package mcframe.clientMSBD.MSBDP0020;

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
	public static final String $itm_p = "itm_p";
	/**
	 * Pickup responsibility 引取責任.<p>
	 *
	 */
	public static final String $purc_commit_flg = "purc_commit_flg";
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
	 * Year month 年月.<p>
	 *
	 */
	public static final String $ym = "ym";
	/**
	 * Start date 開始日.<p>
	 *
	 */
	public static final String $ym_st_dt = "ym_st_dt";
	/**
	 * End date 終了日.<p>
	 *
	 */
	public static final String $ym_end_dt = "ym_end_dt";
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
	public static final String $trd_unit_pf_qty_p = "trd_unit_pf_qty_p";
	public static final String $trd_unit_bf_qty_p = "trd_unit_bf_qty_p";
	public static final String $trd_unit_po_qty_p = "trd_unit_po_qty_p";
	public static final String $trd_unit_diff_qty_p = "trd_unit_diff_qty_p";
	/**
	 * Pickup rate 引取率.<p>
	 *
	 */
	public static final String $trd_rate = "trd_rate";
	public static final String $trd_unit_monthly_pf_qty_p = "trd_unit_monthly_pf_qty_p";
	public static final String $trd_unit_tendays_pf_qty_p = "trd_unit_tendays_pf_qty_p";
	public static final String $trd_unit_weekly_pf_qty_p = "trd_unit_weekly_pf_qty_p";
	public static final String $trd_unit_monthly_po_qty_p = "trd_unit_monthly_po_qty_p";
	public static final String $trd_unit_weekly_po_qty_p = "trd_unit_weekly_po_qty_p";
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
	public static final String $base_unit_pf_qty_p = "base_unit_pf_qty_p";
	public static final String $base_unit_bf_qty_p = "base_unit_bf_qty_p";
	public static final String $base_unit_po_qty_p = "base_unit_po_qty_p";
	public static final String $base_unit_diff_qty_p = "base_unit_diff_qty_p";
	public static final String $base_unit_monthly_pf_qty_p = "base_unit_monthly_pf_qty_p";
	public static final String $base_unit_tendays_pf_qty_p = "base_unit_tendays_pf_qty_p";
	public static final String $base_unit_weekly_pf_qty_p = "base_unit_weekly_pf_qty_p";
	public static final String $base_unit_monthly_po_qty_p = "base_unit_monthly_po_qty_p";
	public static final String $base_unit_weekly_po_qty_p = "base_unit_weekly_po_qty_p";
	/**
	 * Start date (Month, 10 days) 開始日（月・旬）.<p>
	 *
	 */
	public static final String $monthly_ym_st_dt = "monthly_ym_st_dt";
	/**
	 * End date (Month, 10 days) 終了日（月・旬）.<p>
	 *
	 */
	public static final String $monthly_ym_end_dt = "monthly_ym_end_dt";
	/**
	 * Start date (Week) 開始日（週）.<p>
	 *
	 */
	public static final String $week_ym_st_dt = "week_ym_st_dt";
	/**
	 * End date (Week) 終了日（週）.<p>
	 *
	 */
	public static final String $week_ym_end_dt = "week_ym_end_dt";
	/**
	 * Month 月.<p>
	 *
	 */
	public static final String $monthly_flg = "monthly_flg";
	/**
	 * 10 days 旬.<p>
	 *
	 */
	public static final String $tendays_flg = "tendays_flg";
	/**
	 * Week 週.<p>
	 *
	 */
	public static final String $weekly_flg = "weekly_flg";
	/**
	 * Remaining processed 残処理済.<p>
	 *
	 */
	public static final String $cmpl_flg = "cmpl_flg";
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
	public static final String $rts_msg_p = "rts_msg_p";
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

	public static final String $itm_cd = $itm_p + ".itm_cd";
	public static final String $itm_sub1 = $itm_p + ".itm_sub1";
	public static final String $itm_sub2 = $itm_p + ".itm_sub2";
	public static final String $itm_sub3 = $itm_p + ".itm_sub3";
	public static final String $itm_nm = $itm_p + ".itm_nm";
	public static final String $trd_unit_pf_qty = $trd_unit_pf_qty_p + ".qty";
	public static final String $trd_unit_bf_qty = $trd_unit_bf_qty_p + ".qty";
	public static final String $trd_unit_po_qty = $trd_unit_po_qty_p + ".qty";
	public static final String $trd_unit_diff_qty = $trd_unit_diff_qty_p + ".qty";
	public static final String $trd_unit_monthly_pf_qty = $trd_unit_monthly_pf_qty_p + ".qty";
	public static final String $trd_unit_tendays_pf_qty = $trd_unit_tendays_pf_qty_p + ".qty";
	public static final String $trd_unit_weekly_pf_qty = $trd_unit_weekly_pf_qty_p + ".qty";
	public static final String $trd_unit_monthly_po_qty = $trd_unit_monthly_po_qty_p + ".qty";
	public static final String $trd_unit_weekly_po_qty = $trd_unit_weekly_po_qty_p + ".qty";
	public static final String $base_unit_pf_qty = $base_unit_pf_qty_p + ".qty";
	public static final String $base_unit_bf_qty = $base_unit_bf_qty_p + ".qty";
	public static final String $base_unit_po_qty = $base_unit_po_qty_p + ".qty";
	public static final String $base_unit_diff_qty = $base_unit_diff_qty_p + ".qty";
	public static final String $base_unit_monthly_pf_qty = $base_unit_monthly_pf_qty_p + ".qty";
	public static final String $base_unit_tendays_pf_qty = $base_unit_tendays_pf_qty_p + ".qty";
	public static final String $base_unit_weekly_pf_qty = $base_unit_weekly_pf_qty_p + ".qty";
	public static final String $base_unit_monthly_po_qty = $base_unit_monthly_po_qty_p + ".qty";
	public static final String $base_unit_weekly_po_qty = $base_unit_weekly_po_qty_p + ".qty";
	public static final String $rtn_sts_typ = $rts_msg_p + ".rtn_sts_typ";
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
	public static final MCMeta sppl_cd_META = createCommonMeta($sppl_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta sppl_nm_META = createCommonMeta($sppl_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta subcon_flg_META = createCommonMeta($subcon_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta itm_p_META = createInnerRowMeta($itm_p, mcframe.clientMAUB.MAUBP5030.ItmR.class);
	public static final MCMeta purc_commit_flg_META = createCommonMeta($purc_commit_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta wg_cd_META = createCommonMeta($wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta wg_nm_META = createCommonMeta($wg_nm, mcframe.commonMA.meta.MA_META.WG_NM);
	public static final MCMeta ym_META = createCommonMeta($ym, mcframe.commonMA.meta.MA_META.YM);
	public static final MCMeta ym_st_dt_META = createCommonMeta($ym_st_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta ym_end_dt_META = createCommonMeta($ym_end_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta trd_unit_cd_META = createCommonMeta($trd_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta trd_unit_nm_META = createCommonMeta($trd_unit_nm, mcframe.commonMA.meta.MA_META.UNIT_NM);
	public static final MCMeta trd_unit_dec_place_META = createCommonMeta($trd_unit_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta trd_unit_conv_base_qty_META = createCommonMeta($trd_unit_conv_base_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta trd_unit_conv_qty_META = createCommonMeta($trd_unit_conv_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta trd_unit_pf_qty_p_META = createInnerRowMeta($trd_unit_pf_qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta trd_unit_bf_qty_p_META = createInnerRowMeta($trd_unit_bf_qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta trd_unit_po_qty_p_META = createInnerRowMeta($trd_unit_po_qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta trd_unit_diff_qty_p_META = createInnerRowMeta($trd_unit_diff_qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta trd_rate_META = createCommonMeta($trd_rate, mcframe.commonMA.meta.MA_META.RATE);
	public static final MCMeta trd_unit_monthly_pf_qty_p_META = createInnerRowMeta($trd_unit_monthly_pf_qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta trd_unit_tendays_pf_qty_p_META = createInnerRowMeta($trd_unit_tendays_pf_qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta trd_unit_weekly_pf_qty_p_META = createInnerRowMeta($trd_unit_weekly_pf_qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta trd_unit_monthly_po_qty_p_META = createInnerRowMeta($trd_unit_monthly_po_qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta trd_unit_weekly_po_qty_p_META = createInnerRowMeta($trd_unit_weekly_po_qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta base_unit_cd_META = createCommonMeta($base_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta base_unit_nm_META = createCommonMeta($base_unit_nm, mcframe.commonMA.meta.MA_META.UNIT_NM);
	public static final MCMeta base_unit_dec_place_META = createCommonMeta($base_unit_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta base_unit_rnd_typ_META = createCommonMeta($base_unit_rnd_typ, mcframe.commonMA.meta.MA_META.RND_TYP);
	public static final MCMeta base_unit_pf_qty_p_META = createInnerRowMeta($base_unit_pf_qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta base_unit_bf_qty_p_META = createInnerRowMeta($base_unit_bf_qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta base_unit_po_qty_p_META = createInnerRowMeta($base_unit_po_qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta base_unit_diff_qty_p_META = createInnerRowMeta($base_unit_diff_qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta base_unit_monthly_pf_qty_p_META = createInnerRowMeta($base_unit_monthly_pf_qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta base_unit_tendays_pf_qty_p_META = createInnerRowMeta($base_unit_tendays_pf_qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta base_unit_weekly_pf_qty_p_META = createInnerRowMeta($base_unit_weekly_pf_qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta base_unit_monthly_po_qty_p_META = createInnerRowMeta($base_unit_monthly_po_qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta base_unit_weekly_po_qty_p_META = createInnerRowMeta($base_unit_weekly_po_qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta monthly_ym_st_dt_META = createCommonMeta($monthly_ym_st_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta monthly_ym_end_dt_META = createCommonMeta($monthly_ym_end_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta week_ym_st_dt_META = createCommonMeta($week_ym_st_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta week_ym_end_dt_META = createCommonMeta($week_ym_end_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta monthly_flg_META = createCommonMeta($monthly_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta tendays_flg_META = createCommonMeta($tendays_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta weekly_flg_META = createCommonMeta($weekly_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta cmpl_flg_META = createCommonMeta($cmpl_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta intr_rmrks_META = createCommonMeta($intr_rmrks, mcframe.commonMS.meta.MS_META.PF_BAL_INTR_RMRKS);
	public static final MCMeta sub_char1_META = createCommonMeta($sub_char1, mcframe.commonMS.meta.MS_META.PF_BAL_SUB_CHAR1);
	public static final MCMeta sub_char2_META = createCommonMeta($sub_char2, mcframe.commonMS.meta.MS_META.PF_BAL_SUB_CHAR2);
	public static final MCMeta sub_char3_META = createCommonMeta($sub_char3, mcframe.commonMS.meta.MS_META.PF_BAL_SUB_CHAR3);
	public static final MCMeta itm_typ_META = createCommonMeta($itm_typ, mcframe.commonMA.meta.MA_META.ITM_TYP);
	public static final MCMeta itm_typ_nm_META = createCommonMeta($itm_typ_nm, mcframe.commonMA.meta.MA_META.ITM_TYP_NM);
	public static final MCMeta itm_typ_d_cd_META = createCommonMeta($itm_typ_d_cd, mcframe.commonMA.meta.MA_META.ITM_TYP_D_CD);
	public static final MCMeta itm_typ_d_nm_META = createCommonMeta($itm_typ_d_nm, mcframe.commonMA.meta.MA_META.ITM_TYP_D_NM);
	public static final MCMeta rts_msg_p_META = createInnerRowMeta($rts_msg_p, mcframe.clientMAUB.MAUBP5310.RtnMsgR.class);
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

	protected static final ConstMetaList<RsltR> constMetas = new ConstMetaList<RsltR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			check_META,
			sppl_cd_META,
			sppl_nm_META,
			subcon_flg_META,
			itm_p_META,
			purc_commit_flg_META,
			wg_cd_META,
			wg_nm_META,
			ym_META,
			ym_st_dt_META,
			ym_end_dt_META,
			trd_unit_cd_META,
			trd_unit_nm_META,
			trd_unit_dec_place_META,
			trd_unit_conv_base_qty_META,
			trd_unit_conv_qty_META,
			trd_unit_pf_qty_p_META,
			trd_unit_bf_qty_p_META,
			trd_unit_po_qty_p_META,
			trd_unit_diff_qty_p_META,
			trd_rate_META,
			trd_unit_monthly_pf_qty_p_META,
			trd_unit_tendays_pf_qty_p_META,
			trd_unit_weekly_pf_qty_p_META,
			trd_unit_monthly_po_qty_p_META,
			trd_unit_weekly_po_qty_p_META,
			base_unit_cd_META,
			base_unit_nm_META,
			base_unit_dec_place_META,
			base_unit_rnd_typ_META,
			base_unit_pf_qty_p_META,
			base_unit_bf_qty_p_META,
			base_unit_po_qty_p_META,
			base_unit_diff_qty_p_META,
			base_unit_monthly_pf_qty_p_META,
			base_unit_tendays_pf_qty_p_META,
			base_unit_weekly_pf_qty_p_META,
			base_unit_monthly_po_qty_p_META,
			base_unit_weekly_po_qty_p_META,
			monthly_ym_st_dt_META,
			monthly_ym_end_dt_META,
			week_ym_st_dt_META,
			week_ym_end_dt_META,
			monthly_flg_META,
			tendays_flg_META,
			weekly_flg_META,
			cmpl_flg_META,
			intr_rmrks_META,
			sub_char1_META,
			sub_char2_META,
			sub_char3_META,
			itm_typ_META,
			itm_typ_nm_META,
			itm_typ_d_cd_META,
			itm_typ_d_nm_META,
			rts_msg_p_META,
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
			upd_cntr_META
		},
		new String[][]{
			{
				"itm_cd",
				"itm_sub1",
				"itm_sub2",
				"itm_sub3",
				"itm_nm",
				"trd_unit_pf_qty",
				"trd_unit_bf_qty",
				"trd_unit_po_qty",
				"trd_unit_diff_qty",
				"trd_unit_monthly_pf_qty",
				"trd_unit_tendays_pf_qty",
				"trd_unit_weekly_pf_qty",
				"trd_unit_monthly_po_qty",
				"trd_unit_weekly_po_qty",
				"base_unit_pf_qty",
				"base_unit_bf_qty",
				"base_unit_po_qty",
				"base_unit_diff_qty",
				"base_unit_monthly_pf_qty",
				"base_unit_tendays_pf_qty",
				"base_unit_weekly_pf_qty",
				"base_unit_monthly_po_qty",
				"base_unit_weekly_po_qty",
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
				$trd_unit_pf_qty,
				$trd_unit_bf_qty,
				$trd_unit_po_qty,
				$trd_unit_diff_qty,
				$trd_unit_monthly_pf_qty,
				$trd_unit_tendays_pf_qty,
				$trd_unit_weekly_pf_qty,
				$trd_unit_monthly_po_qty,
				$trd_unit_weekly_po_qty,
				$base_unit_pf_qty,
				$base_unit_bf_qty,
				$base_unit_po_qty,
				$base_unit_diff_qty,
				$base_unit_monthly_pf_qty,
				$base_unit_tendays_pf_qty,
				$base_unit_weekly_pf_qty,
				$base_unit_monthly_po_qty,
				$base_unit_weekly_po_qty,
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
				{$wg_cd, "WG"},	// wg_cd
				{$wg_nm, "WG"},	// wg_nm
				{$base_unit_cd, "BASE_UNIT"},	// base_unit_cd
				{$base_unit_nm, "BASE_UNIT"},	// base_unit_nm
				{$base_unit_dec_place, "BASE_UNIT"},	// base_unit_dec_place
				{$base_unit_rnd_typ, "BASE_UNIT"},	// base_unit_rnd_typ
				{$base_unit_pf_qty_p + ".qty", "BASE_UNIT"},	// base_unit_pf_qty_p.qty
				{$base_unit_bf_qty_p + ".qty", "BASE_UNIT"},	// base_unit_bf_qty_p.qty
				{$base_unit_po_qty_p + ".qty", "BASE_UNIT"},	// base_unit_po_qty_p.qty
				{$base_unit_diff_qty_p + ".qty", "BASE_UNIT"},	// base_unit_diff_qty_p.qty
				{$base_unit_monthly_pf_qty_p + ".qty", "BASE_UNIT"},	// base_unit_monthly_pf_qty_p.qty
				{$base_unit_tendays_pf_qty_p + ".qty", "BASE_UNIT"},	// base_unit_tendays_pf_qty_p.qty
				{$base_unit_weekly_pf_qty_p + ".qty", "BASE_UNIT"},	// base_unit_weekly_pf_qty_p.qty
				{$base_unit_monthly_po_qty_p + ".qty", "BASE_UNIT"},	// base_unit_monthly_po_qty_p.qty
				{$base_unit_weekly_po_qty_p + ".qty", "BASE_UNIT"}	// base_unit_weekly_po_qty_p.qty
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
	 * Supplier cd. 発注先ＣＤ.<p>
	 *
	 */
	public String sppl_cd() {
		return getConstString(offset + 1, $sppl_cd);
	}

	/**
	 * Supplier cd. 発注先ＣＤ.<p>
	 *
	 */
	public void sppl_cd(String value) {
		setConstString(offset + 1, $sppl_cd, value);
	}


	/**
	 * Supplier name 発注先名.<p>
	 *
	 */
	public String sppl_nm() {
		return getConstString(offset + 2, $sppl_nm);
	}

	/**
	 * Supplier name 発注先名.<p>
	 *
	 */
	public void sppl_nm(String value) {
		setConstString(offset + 2, $sppl_nm, value);
	}


	/**
	 * For subcontract 下請対象.<p>
	 *
	 */
	public boolean subcon_flg() {
		return getConstBoolean(offset + 3, $subcon_flg);
	}

	/**
	 * For subcontract 下請対象.<p>
	 *
	 */
	public void subcon_flg(boolean value) {
		setConstBoolean(offset + 3, $subcon_flg, value);
	}


	public mcframe.clientMAUB.MAUBP5030.ItmR itm_p(){
		return (mcframe.clientMAUB.MAUBP5030.ItmR) getConstInnerRow(offset + 4, $itm_p);
	}
	
	public void itm_p(mcframe.clientMAUB.MAUBP5030.ItmR row){
		setConstInnerRow(offset + 4, $itm_p, row);
	}


	/**
	 * Pickup responsibility 引取責任.<p>
	 *
	 */
	public boolean purc_commit_flg() {
		return getConstBoolean(offset + 5, $purc_commit_flg);
	}

	/**
	 * Pickup responsibility 引取責任.<p>
	 *
	 */
	public void purc_commit_flg(boolean value) {
		setConstBoolean(offset + 5, $purc_commit_flg, value);
	}


	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public String wg_cd() {
		return getConstString(offset + 6, $wg_cd);
	}

	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public void wg_cd(String value) {
		setConstString(offset + 6, $wg_cd, value);
	}


	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public String wg_nm() {
		return getConstString(offset + 7, $wg_nm);
	}

	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public void wg_nm(String value) {
		setConstString(offset + 7, $wg_nm, value);
	}


	/**
	 * Year month 年月.<p>
	 *
	 */
	public MCDate ym() {
		return getConstDate(offset + 8, $ym);
	}

	/**
	 * Year month 年月.<p>
	 *
	 */
	public void ym(MCDate value) {
		setConstDate(offset + 8, $ym, value);
	}


	/**
	 * Start date 開始日.<p>
	 *
	 */
	public MCDate ym_st_dt() {
		return getConstDate(offset + 9, $ym_st_dt);
	}

	/**
	 * Start date 開始日.<p>
	 *
	 */
	public void ym_st_dt(MCDate value) {
		setConstDate(offset + 9, $ym_st_dt, value);
	}


	/**
	 * End date 終了日.<p>
	 *
	 */
	public MCDate ym_end_dt() {
		return getConstDate(offset + 10, $ym_end_dt);
	}

	/**
	 * End date 終了日.<p>
	 *
	 */
	public void ym_end_dt(MCDate value) {
		setConstDate(offset + 10, $ym_end_dt, value);
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


	public mcframe.clientMAUB.MAUBP5040.QtyR trd_unit_pf_qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 16, $trd_unit_pf_qty_p);
	}
	
	public void trd_unit_pf_qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 16, $trd_unit_pf_qty_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR trd_unit_bf_qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 17, $trd_unit_bf_qty_p);
	}
	
	public void trd_unit_bf_qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 17, $trd_unit_bf_qty_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR trd_unit_po_qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 18, $trd_unit_po_qty_p);
	}
	
	public void trd_unit_po_qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 18, $trd_unit_po_qty_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR trd_unit_diff_qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 19, $trd_unit_diff_qty_p);
	}
	
	public void trd_unit_diff_qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 19, $trd_unit_diff_qty_p, row);
	}


	/**
	 * Pickup rate 引取率.<p>
	 *
	 */
	public MCNumber trd_rate() {
		return getConstNumber(offset + 20, $trd_rate);
	}

	/**
	 * Pickup rate 引取率.<p>
	 *
	 */
	public void trd_rate(MCNumber value) {
		setConstNumber(offset + 20, $trd_rate, value);
	}

	/**
	 * Pickup rate 引取率.<p>
	 *
	 */
	public void trd_rate(int value) {
		setConstNumber(offset + 20, $trd_rate, value);
	}

	/**
	 * Pickup rate 引取率.<p>
	 *
	 */
	public void trd_rate(long value) {
		setConstNumber(offset + 20, $trd_rate, value);
	}

	/**
	 * Pickup rate 引取率.<p>
	 *
	 */
	public void trd_rate(float value) {
		setConstNumber(offset + 20, $trd_rate, value);
	}

	/**
	 * Pickup rate 引取率.<p>
	 *
	 */
	public void trd_rate(double value) {
		setConstNumber(offset + 20, $trd_rate, value);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR trd_unit_monthly_pf_qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 21, $trd_unit_monthly_pf_qty_p);
	}
	
	public void trd_unit_monthly_pf_qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 21, $trd_unit_monthly_pf_qty_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR trd_unit_tendays_pf_qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 22, $trd_unit_tendays_pf_qty_p);
	}
	
	public void trd_unit_tendays_pf_qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 22, $trd_unit_tendays_pf_qty_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR trd_unit_weekly_pf_qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 23, $trd_unit_weekly_pf_qty_p);
	}
	
	public void trd_unit_weekly_pf_qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 23, $trd_unit_weekly_pf_qty_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR trd_unit_monthly_po_qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 24, $trd_unit_monthly_po_qty_p);
	}
	
	public void trd_unit_monthly_po_qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 24, $trd_unit_monthly_po_qty_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR trd_unit_weekly_po_qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 25, $trd_unit_weekly_po_qty_p);
	}
	
	public void trd_unit_weekly_po_qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 25, $trd_unit_weekly_po_qty_p, row);
	}


	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public String base_unit_cd() {
		return getConstString(offset + 26, $base_unit_cd);
	}

	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public void base_unit_cd(String value) {
		setConstString(offset + 26, $base_unit_cd, value);
	}


	/**
	 * Base unit name 基準単位名.<p>
	 *
	 */
	public String base_unit_nm() {
		return getConstString(offset + 27, $base_unit_nm);
	}

	/**
	 * Base unit name 基準単位名.<p>
	 *
	 */
	public void base_unit_nm(String value) {
		setConstString(offset + 27, $base_unit_nm, value);
	}


	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public MCNumber base_unit_dec_place() {
		return getConstNumber(offset + 28, $base_unit_dec_place);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(MCNumber value) {
		setConstNumber(offset + 28, $base_unit_dec_place, value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(int value) {
		setConstNumber(offset + 28, $base_unit_dec_place, value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(long value) {
		setConstNumber(offset + 28, $base_unit_dec_place, value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(float value) {
		setConstNumber(offset + 28, $base_unit_dec_place, value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(double value) {
		setConstNumber(offset + 28, $base_unit_dec_place, value);
	}


	/**
	 * Base unit rounding type 基準単位端数処理区分.<p>
	 *
	 */
	public String base_unit_rnd_typ() {
		return getConstString(offset + 29, $base_unit_rnd_typ);
	}

	/**
	 * Base unit rounding type 基準単位端数処理区分.<p>
	 *
	 */
	public void base_unit_rnd_typ(String value) {
		setConstString(offset + 29, $base_unit_rnd_typ, value);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR base_unit_pf_qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 30, $base_unit_pf_qty_p);
	}
	
	public void base_unit_pf_qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 30, $base_unit_pf_qty_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR base_unit_bf_qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 31, $base_unit_bf_qty_p);
	}
	
	public void base_unit_bf_qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 31, $base_unit_bf_qty_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR base_unit_po_qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 32, $base_unit_po_qty_p);
	}
	
	public void base_unit_po_qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 32, $base_unit_po_qty_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR base_unit_diff_qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 33, $base_unit_diff_qty_p);
	}
	
	public void base_unit_diff_qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 33, $base_unit_diff_qty_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR base_unit_monthly_pf_qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 34, $base_unit_monthly_pf_qty_p);
	}
	
	public void base_unit_monthly_pf_qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 34, $base_unit_monthly_pf_qty_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR base_unit_tendays_pf_qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 35, $base_unit_tendays_pf_qty_p);
	}
	
	public void base_unit_tendays_pf_qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 35, $base_unit_tendays_pf_qty_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR base_unit_weekly_pf_qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 36, $base_unit_weekly_pf_qty_p);
	}
	
	public void base_unit_weekly_pf_qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 36, $base_unit_weekly_pf_qty_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR base_unit_monthly_po_qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 37, $base_unit_monthly_po_qty_p);
	}
	
	public void base_unit_monthly_po_qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 37, $base_unit_monthly_po_qty_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR base_unit_weekly_po_qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 38, $base_unit_weekly_po_qty_p);
	}
	
	public void base_unit_weekly_po_qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 38, $base_unit_weekly_po_qty_p, row);
	}


	/**
	 * Start date (Month, 10 days) 開始日（月・旬）.<p>
	 *
	 */
	public MCDate monthly_ym_st_dt() {
		return getConstDate(offset + 39, $monthly_ym_st_dt);
	}

	/**
	 * Start date (Month, 10 days) 開始日（月・旬）.<p>
	 *
	 */
	public void monthly_ym_st_dt(MCDate value) {
		setConstDate(offset + 39, $monthly_ym_st_dt, value);
	}


	/**
	 * End date (Month, 10 days) 終了日（月・旬）.<p>
	 *
	 */
	public MCDate monthly_ym_end_dt() {
		return getConstDate(offset + 40, $monthly_ym_end_dt);
	}

	/**
	 * End date (Month, 10 days) 終了日（月・旬）.<p>
	 *
	 */
	public void monthly_ym_end_dt(MCDate value) {
		setConstDate(offset + 40, $monthly_ym_end_dt, value);
	}


	/**
	 * Start date (Week) 開始日（週）.<p>
	 *
	 */
	public MCDate week_ym_st_dt() {
		return getConstDate(offset + 41, $week_ym_st_dt);
	}

	/**
	 * Start date (Week) 開始日（週）.<p>
	 *
	 */
	public void week_ym_st_dt(MCDate value) {
		setConstDate(offset + 41, $week_ym_st_dt, value);
	}


	/**
	 * End date (Week) 終了日（週）.<p>
	 *
	 */
	public MCDate week_ym_end_dt() {
		return getConstDate(offset + 42, $week_ym_end_dt);
	}

	/**
	 * End date (Week) 終了日（週）.<p>
	 *
	 */
	public void week_ym_end_dt(MCDate value) {
		setConstDate(offset + 42, $week_ym_end_dt, value);
	}


	/**
	 * Month 月.<p>
	 *
	 */
	public boolean monthly_flg() {
		return getConstBoolean(offset + 43, $monthly_flg);
	}

	/**
	 * Month 月.<p>
	 *
	 */
	public void monthly_flg(boolean value) {
		setConstBoolean(offset + 43, $monthly_flg, value);
	}


	/**
	 * 10 days 旬.<p>
	 *
	 */
	public boolean tendays_flg() {
		return getConstBoolean(offset + 44, $tendays_flg);
	}

	/**
	 * 10 days 旬.<p>
	 *
	 */
	public void tendays_flg(boolean value) {
		setConstBoolean(offset + 44, $tendays_flg, value);
	}


	/**
	 * Week 週.<p>
	 *
	 */
	public boolean weekly_flg() {
		return getConstBoolean(offset + 45, $weekly_flg);
	}

	/**
	 * Week 週.<p>
	 *
	 */
	public void weekly_flg(boolean value) {
		setConstBoolean(offset + 45, $weekly_flg, value);
	}


	/**
	 * Remaining processed 残処理済.<p>
	 *
	 */
	public boolean cmpl_flg() {
		return getConstBoolean(offset + 46, $cmpl_flg);
	}

	/**
	 * Remaining processed 残処理済.<p>
	 *
	 */
	public void cmpl_flg(boolean value) {
		setConstBoolean(offset + 46, $cmpl_flg, value);
	}


	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public String intr_rmrks() {
		return getConstString(offset + 47, $intr_rmrks);
	}

	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public void intr_rmrks(String value) {
		setConstString(offset + 47, $intr_rmrks, value);
	}


	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public String sub_char1() {
		return getConstString(offset + 48, $sub_char1);
	}

	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public void sub_char1(String value) {
		setConstString(offset + 48, $sub_char1, value);
	}


	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public String sub_char2() {
		return getConstString(offset + 49, $sub_char2);
	}

	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public void sub_char2(String value) {
		setConstString(offset + 49, $sub_char2, value);
	}


	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public String sub_char3() {
		return getConstString(offset + 50, $sub_char3);
	}

	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public void sub_char3(String value) {
		setConstString(offset + 50, $sub_char3, value);
	}


	/**
	 * Item type 品目区分.<p>
	 *
	 */
	public String itm_typ() {
		return getConstString(offset + 51, $itm_typ);
	}

	/**
	 * Item type 品目区分.<p>
	 *
	 */
	public void itm_typ(String value) {
		setConstString(offset + 51, $itm_typ, value);
	}


	/**
	 * Item type name 品目区分名.<p>
	 *
	 */
	public String itm_typ_nm() {
		return getConstString(offset + 52, $itm_typ_nm);
	}

	/**
	 * Item type name 品目区分名.<p>
	 *
	 */
	public void itm_typ_nm(String value) {
		setConstString(offset + 52, $itm_typ_nm, value);
	}


	/**
	 * Item type details cd. 品目区分詳細ＣＤ.<p>
	 *
	 */
	public String itm_typ_d_cd() {
		return getConstString(offset + 53, $itm_typ_d_cd);
	}

	/**
	 * Item type details cd. 品目区分詳細ＣＤ.<p>
	 *
	 */
	public void itm_typ_d_cd(String value) {
		setConstString(offset + 53, $itm_typ_d_cd, value);
	}


	/**
	 * Item type details name 品目区分詳細名.<p>
	 *
	 */
	public String itm_typ_d_nm() {
		return getConstString(offset + 54, $itm_typ_d_nm);
	}

	/**
	 * Item type details name 品目区分詳細名.<p>
	 *
	 */
	public void itm_typ_d_nm(String value) {
		setConstString(offset + 54, $itm_typ_d_nm, value);
	}


	public mcframe.clientMAUB.MAUBP5310.RtnMsgR rts_msg_p(){
		return (mcframe.clientMAUB.MAUBP5310.RtnMsgR) getConstInnerRow(offset + 55, $rts_msg_p);
	}
	
	public void rts_msg_p(mcframe.clientMAUB.MAUBP5310.RtnMsgR row){
		setConstInnerRow(offset + 55, $rts_msg_p, row);
	}


	public mcframe.clientMAUB.MAUBP5190.BpGrpR sppl_grp_p(){
		return (mcframe.clientMAUB.MAUBP5190.BpGrpR) getConstInnerRow(offset + 56, $sppl_grp_p);
	}
	
	public void sppl_grp_p(mcframe.clientMAUB.MAUBP5190.BpGrpR row){
		setConstInnerRow(offset + 56, $sppl_grp_p, row);
	}


	public mcframe.clientMAUB.MAUBP5170.ItmGrpR itm_grp_p(){
		return (mcframe.clientMAUB.MAUBP5170.ItmGrpR) getConstInnerRow(offset + 57, $itm_grp_p);
	}
	
	public void itm_grp_p(mcframe.clientMAUB.MAUBP5170.ItmGrpR row){
		setConstInnerRow(offset + 57, $itm_grp_p, row);
	}


	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public String ins_usr_id() {
		return getConstString(offset + 58, $ins_usr_id);
	}

	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public void ins_usr_id(String value) {
		setConstString(offset + 58, $ins_usr_id, value);
	}


	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public String ins_usr_nm() {
		return getConstString(offset + 59, $ins_usr_nm);
	}

	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public void ins_usr_nm(String value) {
		setConstString(offset + 59, $ins_usr_nm, value);
	}


	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public String ins_func_id() {
		return getConstString(offset + 60, $ins_func_id);
	}

	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public void ins_func_id(String value) {
		setConstString(offset + 60, $ins_func_id, value);
	}


	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public String ins_func_nm() {
		return getConstString(offset + 61, $ins_func_nm);
	}

	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public void ins_func_nm(String value) {
		setConstString(offset + 61, $ins_func_nm, value);
	}


	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public MCTimestamp ins_ts() {
		return getConstTimestamp(offset + 62, $ins_ts);
	}

	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public void ins_ts(MCTimestamp value) {
		setConstTimestamp(offset + 62, $ins_ts, value);
	}


	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public String upd_usr_id() {
		return getConstString(offset + 63, $upd_usr_id);
	}

	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public void upd_usr_id(String value) {
		setConstString(offset + 63, $upd_usr_id, value);
	}


	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public String upd_usr_nm() {
		return getConstString(offset + 64, $upd_usr_nm);
	}

	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public void upd_usr_nm(String value) {
		setConstString(offset + 64, $upd_usr_nm, value);
	}


	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public String upd_func_id() {
		return getConstString(offset + 65, $upd_func_id);
	}

	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public void upd_func_id(String value) {
		setConstString(offset + 65, $upd_func_id, value);
	}


	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public String upd_func_nm() {
		return getConstString(offset + 66, $upd_func_nm);
	}

	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public void upd_func_nm(String value) {
		setConstString(offset + 66, $upd_func_nm, value);
	}


	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public MCTimestamp upd_ts() {
		return getConstTimestamp(offset + 67, $upd_ts);
	}

	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public void upd_ts(MCTimestamp value) {
		setConstTimestamp(offset + 67, $upd_ts, value);
	}


	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public String upd_srv_req_no() {
		return getConstString(offset + 68, $upd_srv_req_no);
	}

	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public void upd_srv_req_no(String value) {
		setConstString(offset + 68, $upd_srv_req_no, value);
	}


	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public MCNumber upd_cntr() {
		return getConstNumber(offset + 69, $upd_cntr);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(MCNumber value) {
		setConstNumber(offset + 69, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(int value) {
		setConstNumber(offset + 69, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(long value) {
		setConstNumber(offset + 69, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(float value) {
		setConstNumber(offset + 69, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(double value) {
		setConstNumber(offset + 69, $upd_cntr, value);
	}


	public String getString(String name) {
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
		if ($base_unit_rnd_typ.equalsIgnoreCase(name)) {
			return base_unit_rnd_typ();
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
		if ($trd_rate.equalsIgnoreCase(name)) {
			return trd_rate();
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
		if ($ym.equalsIgnoreCase(name)) {
			return ym();
		}
		if ($ym_st_dt.equalsIgnoreCase(name)) {
			return ym_st_dt();
		}
		if ($ym_end_dt.equalsIgnoreCase(name)) {
			return ym_end_dt();
		}
		if ($monthly_ym_st_dt.equalsIgnoreCase(name)) {
			return monthly_ym_st_dt();
		}
		if ($monthly_ym_end_dt.equalsIgnoreCase(name)) {
			return monthly_ym_end_dt();
		}
		if ($week_ym_st_dt.equalsIgnoreCase(name)) {
			return week_ym_st_dt();
		}
		if ($week_ym_end_dt.equalsIgnoreCase(name)) {
			return week_ym_end_dt();
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
		if ($subcon_flg.equalsIgnoreCase(name)) {
			return subcon_flg();
		}
		if ($purc_commit_flg.equalsIgnoreCase(name)) {
			return purc_commit_flg();
		}
		if ($monthly_flg.equalsIgnoreCase(name)) {
			return monthly_flg();
		}
		if ($tendays_flg.equalsIgnoreCase(name)) {
			return tendays_flg();
		}
		if ($weekly_flg.equalsIgnoreCase(name)) {
			return weekly_flg();
		}
		if ($cmpl_flg.equalsIgnoreCase(name)) {
			return cmpl_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
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
		if ($base_unit_rnd_typ.equalsIgnoreCase(name)) {
			return base_unit_rnd_typ();
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
		if ($trd_rate.equalsIgnoreCase(name)) {
			return trd_rate();
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
		if ($ym.equalsIgnoreCase(name)) {
			return ym();
		}
		if ($ym_st_dt.equalsIgnoreCase(name)) {
			return ym_st_dt();
		}
		if ($ym_end_dt.equalsIgnoreCase(name)) {
			return ym_end_dt();
		}
		if ($monthly_ym_st_dt.equalsIgnoreCase(name)) {
			return monthly_ym_st_dt();
		}
		if ($monthly_ym_end_dt.equalsIgnoreCase(name)) {
			return monthly_ym_end_dt();
		}
		if ($week_ym_st_dt.equalsIgnoreCase(name)) {
			return week_ym_st_dt();
		}
		if ($week_ym_end_dt.equalsIgnoreCase(name)) {
			return week_ym_end_dt();
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
		if ($subcon_flg.equalsIgnoreCase(name)) {
			return subcon_flg();
		}
		if ($purc_commit_flg.equalsIgnoreCase(name)) {
			return purc_commit_flg();
		}
		if ($monthly_flg.equalsIgnoreCase(name)) {
			return monthly_flg();
		}
		if ($tendays_flg.equalsIgnoreCase(name)) {
			return tendays_flg();
		}
		if ($weekly_flg.equalsIgnoreCase(name)) {
			return weekly_flg();
		}
		if ($cmpl_flg.equalsIgnoreCase(name)) {
			return cmpl_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
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
		if ($base_unit_rnd_typ.equalsIgnoreCase(name)) {
			base_unit_rnd_typ(value);
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
		if ($trd_rate.equalsIgnoreCase(name)) {
			trd_rate(value);
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
		if ($trd_rate.equalsIgnoreCase(name)) {
			trd_rate(value);
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
		if ($trd_rate.equalsIgnoreCase(name)) {
			trd_rate(value);
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
		if ($trd_rate.equalsIgnoreCase(name)) {
			trd_rate(value);
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
		if ($trd_rate.equalsIgnoreCase(name)) {
			trd_rate(value);
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
		if ($ym.equalsIgnoreCase(name)) {
			ym(value);
			return;
		}
		if ($ym_st_dt.equalsIgnoreCase(name)) {
			ym_st_dt(value);
			return;
		}
		if ($ym_end_dt.equalsIgnoreCase(name)) {
			ym_end_dt(value);
			return;
		}
		if ($monthly_ym_st_dt.equalsIgnoreCase(name)) {
			monthly_ym_st_dt(value);
			return;
		}
		if ($monthly_ym_end_dt.equalsIgnoreCase(name)) {
			monthly_ym_end_dt(value);
			return;
		}
		if ($week_ym_st_dt.equalsIgnoreCase(name)) {
			week_ym_st_dt(value);
			return;
		}
		if ($week_ym_end_dt.equalsIgnoreCase(name)) {
			week_ym_end_dt(value);
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
		if ($subcon_flg.equalsIgnoreCase(name)) {
			subcon_flg(value);
			return;
		}
		if ($purc_commit_flg.equalsIgnoreCase(name)) {
			purc_commit_flg(value);
			return;
		}
		if ($monthly_flg.equalsIgnoreCase(name)) {
			monthly_flg(value);
			return;
		}
		if ($tendays_flg.equalsIgnoreCase(name)) {
			tendays_flg(value);
			return;
		}
		if ($weekly_flg.equalsIgnoreCase(name)) {
			weekly_flg(value);
			return;
		}
		if ($cmpl_flg.equalsIgnoreCase(name)) {
			cmpl_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
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
		if ($base_unit_rnd_typ.equalsIgnoreCase(name)) {
			base_unit_rnd_typ(value);
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
		if ($trd_rate.equalsIgnoreCase(name)) {
			trd_rate(value);
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
		if ($trd_rate.equalsIgnoreCase(name)) {
			trd_rate(value);
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
		if ($trd_rate.equalsIgnoreCase(name)) {
			trd_rate(value);
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
		if ($trd_rate.equalsIgnoreCase(name)) {
			trd_rate(value);
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
		if ($trd_rate.equalsIgnoreCase(name)) {
			trd_rate(value);
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
		if ($ym.equalsIgnoreCase(name)) {
			ym(value);
			return;
		}
		if ($ym_st_dt.equalsIgnoreCase(name)) {
			ym_st_dt(value);
			return;
		}
		if ($ym_end_dt.equalsIgnoreCase(name)) {
			ym_end_dt(value);
			return;
		}
		if ($monthly_ym_st_dt.equalsIgnoreCase(name)) {
			monthly_ym_st_dt(value);
			return;
		}
		if ($monthly_ym_end_dt.equalsIgnoreCase(name)) {
			monthly_ym_end_dt(value);
			return;
		}
		if ($week_ym_st_dt.equalsIgnoreCase(name)) {
			week_ym_st_dt(value);
			return;
		}
		if ($week_ym_end_dt.equalsIgnoreCase(name)) {
			week_ym_end_dt(value);
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
		if ($subcon_flg.equalsIgnoreCase(name)) {
			subcon_flg(value);
			return;
		}
		if ($purc_commit_flg.equalsIgnoreCase(name)) {
			purc_commit_flg(value);
			return;
		}
		if ($monthly_flg.equalsIgnoreCase(name)) {
			monthly_flg(value);
			return;
		}
		if ($tendays_flg.equalsIgnoreCase(name)) {
			tendays_flg(value);
			return;
		}
		if ($weekly_flg.equalsIgnoreCase(name)) {
			weekly_flg(value);
			return;
		}
		if ($cmpl_flg.equalsIgnoreCase(name)) {
			cmpl_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}

	public MCRow getInnerRow(String name) {
		if ($itm_p.equalsIgnoreCase(name)) {
			return itm_p();
		}
		if ($trd_unit_pf_qty_p.equalsIgnoreCase(name)) {
			return trd_unit_pf_qty_p();
		}
		if ($trd_unit_bf_qty_p.equalsIgnoreCase(name)) {
			return trd_unit_bf_qty_p();
		}
		if ($trd_unit_po_qty_p.equalsIgnoreCase(name)) {
			return trd_unit_po_qty_p();
		}
		if ($trd_unit_diff_qty_p.equalsIgnoreCase(name)) {
			return trd_unit_diff_qty_p();
		}
		if ($trd_unit_monthly_pf_qty_p.equalsIgnoreCase(name)) {
			return trd_unit_monthly_pf_qty_p();
		}
		if ($trd_unit_tendays_pf_qty_p.equalsIgnoreCase(name)) {
			return trd_unit_tendays_pf_qty_p();
		}
		if ($trd_unit_weekly_pf_qty_p.equalsIgnoreCase(name)) {
			return trd_unit_weekly_pf_qty_p();
		}
		if ($trd_unit_monthly_po_qty_p.equalsIgnoreCase(name)) {
			return trd_unit_monthly_po_qty_p();
		}
		if ($trd_unit_weekly_po_qty_p.equalsIgnoreCase(name)) {
			return trd_unit_weekly_po_qty_p();
		}
		if ($base_unit_pf_qty_p.equalsIgnoreCase(name)) {
			return base_unit_pf_qty_p();
		}
		if ($base_unit_bf_qty_p.equalsIgnoreCase(name)) {
			return base_unit_bf_qty_p();
		}
		if ($base_unit_po_qty_p.equalsIgnoreCase(name)) {
			return base_unit_po_qty_p();
		}
		if ($base_unit_diff_qty_p.equalsIgnoreCase(name)) {
			return base_unit_diff_qty_p();
		}
		if ($base_unit_monthly_pf_qty_p.equalsIgnoreCase(name)) {
			return base_unit_monthly_pf_qty_p();
		}
		if ($base_unit_tendays_pf_qty_p.equalsIgnoreCase(name)) {
			return base_unit_tendays_pf_qty_p();
		}
		if ($base_unit_weekly_pf_qty_p.equalsIgnoreCase(name)) {
			return base_unit_weekly_pf_qty_p();
		}
		if ($base_unit_monthly_po_qty_p.equalsIgnoreCase(name)) {
			return base_unit_monthly_po_qty_p();
		}
		if ($base_unit_weekly_po_qty_p.equalsIgnoreCase(name)) {
			return base_unit_weekly_po_qty_p();
		}
		if ($rts_msg_p.equalsIgnoreCase(name)) {
			return rts_msg_p();
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
		if ($trd_unit_pf_qty_p.equalsIgnoreCase(name)) {
			trd_unit_pf_qty_p(
				((MCContainerMeta) trd_unit_pf_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($trd_unit_bf_qty_p.equalsIgnoreCase(name)) {
			trd_unit_bf_qty_p(
				((MCContainerMeta) trd_unit_bf_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($trd_unit_po_qty_p.equalsIgnoreCase(name)) {
			trd_unit_po_qty_p(
				((MCContainerMeta) trd_unit_po_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($trd_unit_diff_qty_p.equalsIgnoreCase(name)) {
			trd_unit_diff_qty_p(
				((MCContainerMeta) trd_unit_diff_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($trd_unit_monthly_pf_qty_p.equalsIgnoreCase(name)) {
			trd_unit_monthly_pf_qty_p(
				((MCContainerMeta) trd_unit_monthly_pf_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($trd_unit_tendays_pf_qty_p.equalsIgnoreCase(name)) {
			trd_unit_tendays_pf_qty_p(
				((MCContainerMeta) trd_unit_tendays_pf_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($trd_unit_weekly_pf_qty_p.equalsIgnoreCase(name)) {
			trd_unit_weekly_pf_qty_p(
				((MCContainerMeta) trd_unit_weekly_pf_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($trd_unit_monthly_po_qty_p.equalsIgnoreCase(name)) {
			trd_unit_monthly_po_qty_p(
				((MCContainerMeta) trd_unit_monthly_po_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($trd_unit_weekly_po_qty_p.equalsIgnoreCase(name)) {
			trd_unit_weekly_po_qty_p(
				((MCContainerMeta) trd_unit_weekly_po_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($base_unit_pf_qty_p.equalsIgnoreCase(name)) {
			base_unit_pf_qty_p(
				((MCContainerMeta) base_unit_pf_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($base_unit_bf_qty_p.equalsIgnoreCase(name)) {
			base_unit_bf_qty_p(
				((MCContainerMeta) base_unit_bf_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($base_unit_po_qty_p.equalsIgnoreCase(name)) {
			base_unit_po_qty_p(
				((MCContainerMeta) base_unit_po_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($base_unit_diff_qty_p.equalsIgnoreCase(name)) {
			base_unit_diff_qty_p(
				((MCContainerMeta) base_unit_diff_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($base_unit_monthly_pf_qty_p.equalsIgnoreCase(name)) {
			base_unit_monthly_pf_qty_p(
				((MCContainerMeta) base_unit_monthly_pf_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($base_unit_tendays_pf_qty_p.equalsIgnoreCase(name)) {
			base_unit_tendays_pf_qty_p(
				((MCContainerMeta) base_unit_tendays_pf_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($base_unit_weekly_pf_qty_p.equalsIgnoreCase(name)) {
			base_unit_weekly_pf_qty_p(
				((MCContainerMeta) base_unit_weekly_pf_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($base_unit_monthly_po_qty_p.equalsIgnoreCase(name)) {
			base_unit_monthly_po_qty_p(
				((MCContainerMeta) base_unit_monthly_po_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($base_unit_weekly_po_qty_p.equalsIgnoreCase(name)) {
			base_unit_weekly_po_qty_p(
				((MCContainerMeta) base_unit_weekly_po_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($rts_msg_p.equalsIgnoreCase(name)) {
			rts_msg_p(
				((MCContainerMeta) rts_msg_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5310.RtnMsgR.class, value)
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
	 * Carry-over qty. 繰越数量.<p>
	 *
	 */
	public MCNumber trd_unit_bf_qty() {
		return trd_unit_bf_qty_p().qty();
	}

	/**
	 * Carry-over qty. 繰越数量.<p>
	 *
	 */
	public void trd_unit_bf_qty(MCNumber value) {
		trd_unit_bf_qty_p().qty(value);
	}

	/**
	 * Carry-over qty. 繰越数量.<p>
	 *
	 */
	public void trd_unit_bf_qty(int value) {
		trd_unit_bf_qty_p().qty(value);
	}

	/**
	 * Carry-over qty. 繰越数量.<p>
	 *
	 */
	public void trd_unit_bf_qty(long value) {
		trd_unit_bf_qty_p().qty(value);
	}

	/**
	 * Carry-over qty. 繰越数量.<p>
	 *
	 */
	public void trd_unit_bf_qty(float value) {
		trd_unit_bf_qty_p().qty(value);
	}

	/**
	 * Carry-over qty. 繰越数量.<p>
	 *
	 */
	public void trd_unit_bf_qty(double value) {
		trd_unit_bf_qty_p().qty(value);
	}

	/**
	 * PO placed qty. 発注済数量.<p>
	 *
	 */
	public MCNumber trd_unit_po_qty() {
		return trd_unit_po_qty_p().qty();
	}

	/**
	 * PO placed qty. 発注済数量.<p>
	 *
	 */
	public void trd_unit_po_qty(MCNumber value) {
		trd_unit_po_qty_p().qty(value);
	}

	/**
	 * PO placed qty. 発注済数量.<p>
	 *
	 */
	public void trd_unit_po_qty(int value) {
		trd_unit_po_qty_p().qty(value);
	}

	/**
	 * PO placed qty. 発注済数量.<p>
	 *
	 */
	public void trd_unit_po_qty(long value) {
		trd_unit_po_qty_p().qty(value);
	}

	/**
	 * PO placed qty. 発注済数量.<p>
	 *
	 */
	public void trd_unit_po_qty(float value) {
		trd_unit_po_qty_p().qty(value);
	}

	/**
	 * PO placed qty. 発注済数量.<p>
	 *
	 */
	public void trd_unit_po_qty(double value) {
		trd_unit_po_qty_p().qty(value);
	}

	/**
	 * Variance qty. 差異数量.<p>
	 *
	 */
	public MCNumber trd_unit_diff_qty() {
		return trd_unit_diff_qty_p().qty();
	}

	/**
	 * Variance qty. 差異数量.<p>
	 *
	 */
	public void trd_unit_diff_qty(MCNumber value) {
		trd_unit_diff_qty_p().qty(value);
	}

	/**
	 * Variance qty. 差異数量.<p>
	 *
	 */
	public void trd_unit_diff_qty(int value) {
		trd_unit_diff_qty_p().qty(value);
	}

	/**
	 * Variance qty. 差異数量.<p>
	 *
	 */
	public void trd_unit_diff_qty(long value) {
		trd_unit_diff_qty_p().qty(value);
	}

	/**
	 * Variance qty. 差異数量.<p>
	 *
	 */
	public void trd_unit_diff_qty(float value) {
		trd_unit_diff_qty_p().qty(value);
	}

	/**
	 * Variance qty. 差異数量.<p>
	 *
	 */
	public void trd_unit_diff_qty(double value) {
		trd_unit_diff_qty_p().qty(value);
	}

	/**
	 * Forecast qty. (Monthly) 内示数量（月）.<p>
	 *
	 */
	public MCNumber trd_unit_monthly_pf_qty() {
		return trd_unit_monthly_pf_qty_p().qty();
	}

	/**
	 * Forecast qty. (Monthly) 内示数量（月）.<p>
	 *
	 */
	public void trd_unit_monthly_pf_qty(MCNumber value) {
		trd_unit_monthly_pf_qty_p().qty(value);
	}

	/**
	 * Forecast qty. (Monthly) 内示数量（月）.<p>
	 *
	 */
	public void trd_unit_monthly_pf_qty(int value) {
		trd_unit_monthly_pf_qty_p().qty(value);
	}

	/**
	 * Forecast qty. (Monthly) 内示数量（月）.<p>
	 *
	 */
	public void trd_unit_monthly_pf_qty(long value) {
		trd_unit_monthly_pf_qty_p().qty(value);
	}

	/**
	 * Forecast qty. (Monthly) 内示数量（月）.<p>
	 *
	 */
	public void trd_unit_monthly_pf_qty(float value) {
		trd_unit_monthly_pf_qty_p().qty(value);
	}

	/**
	 * Forecast qty. (Monthly) 内示数量（月）.<p>
	 *
	 */
	public void trd_unit_monthly_pf_qty(double value) {
		trd_unit_monthly_pf_qty_p().qty(value);
	}

	/**
	 * Forecast qty. (10 days) 内示数量（旬）.<p>
	 *
	 */
	public MCNumber trd_unit_tendays_pf_qty() {
		return trd_unit_tendays_pf_qty_p().qty();
	}

	/**
	 * Forecast qty. (10 days) 内示数量（旬）.<p>
	 *
	 */
	public void trd_unit_tendays_pf_qty(MCNumber value) {
		trd_unit_tendays_pf_qty_p().qty(value);
	}

	/**
	 * Forecast qty. (10 days) 内示数量（旬）.<p>
	 *
	 */
	public void trd_unit_tendays_pf_qty(int value) {
		trd_unit_tendays_pf_qty_p().qty(value);
	}

	/**
	 * Forecast qty. (10 days) 内示数量（旬）.<p>
	 *
	 */
	public void trd_unit_tendays_pf_qty(long value) {
		trd_unit_tendays_pf_qty_p().qty(value);
	}

	/**
	 * Forecast qty. (10 days) 内示数量（旬）.<p>
	 *
	 */
	public void trd_unit_tendays_pf_qty(float value) {
		trd_unit_tendays_pf_qty_p().qty(value);
	}

	/**
	 * Forecast qty. (10 days) 内示数量（旬）.<p>
	 *
	 */
	public void trd_unit_tendays_pf_qty(double value) {
		trd_unit_tendays_pf_qty_p().qty(value);
	}

	/**
	 * Forecast qty. (Week) 内示数量（週）.<p>
	 *
	 */
	public MCNumber trd_unit_weekly_pf_qty() {
		return trd_unit_weekly_pf_qty_p().qty();
	}

	/**
	 * Forecast qty. (Week) 内示数量（週）.<p>
	 *
	 */
	public void trd_unit_weekly_pf_qty(MCNumber value) {
		trd_unit_weekly_pf_qty_p().qty(value);
	}

	/**
	 * Forecast qty. (Week) 内示数量（週）.<p>
	 *
	 */
	public void trd_unit_weekly_pf_qty(int value) {
		trd_unit_weekly_pf_qty_p().qty(value);
	}

	/**
	 * Forecast qty. (Week) 内示数量（週）.<p>
	 *
	 */
	public void trd_unit_weekly_pf_qty(long value) {
		trd_unit_weekly_pf_qty_p().qty(value);
	}

	/**
	 * Forecast qty. (Week) 内示数量（週）.<p>
	 *
	 */
	public void trd_unit_weekly_pf_qty(float value) {
		trd_unit_weekly_pf_qty_p().qty(value);
	}

	/**
	 * Forecast qty. (Week) 内示数量（週）.<p>
	 *
	 */
	public void trd_unit_weekly_pf_qty(double value) {
		trd_unit_weekly_pf_qty_p().qty(value);
	}

	/**
	 * PO placed qty. (Month, 10 days) 発注済数量（月・旬）.<p>
	 *
	 */
	public MCNumber trd_unit_monthly_po_qty() {
		return trd_unit_monthly_po_qty_p().qty();
	}

	/**
	 * PO placed qty. (Month, 10 days) 発注済数量（月・旬）.<p>
	 *
	 */
	public void trd_unit_monthly_po_qty(MCNumber value) {
		trd_unit_monthly_po_qty_p().qty(value);
	}

	/**
	 * PO placed qty. (Month, 10 days) 発注済数量（月・旬）.<p>
	 *
	 */
	public void trd_unit_monthly_po_qty(int value) {
		trd_unit_monthly_po_qty_p().qty(value);
	}

	/**
	 * PO placed qty. (Month, 10 days) 発注済数量（月・旬）.<p>
	 *
	 */
	public void trd_unit_monthly_po_qty(long value) {
		trd_unit_monthly_po_qty_p().qty(value);
	}

	/**
	 * PO placed qty. (Month, 10 days) 発注済数量（月・旬）.<p>
	 *
	 */
	public void trd_unit_monthly_po_qty(float value) {
		trd_unit_monthly_po_qty_p().qty(value);
	}

	/**
	 * PO placed qty. (Month, 10 days) 発注済数量（月・旬）.<p>
	 *
	 */
	public void trd_unit_monthly_po_qty(double value) {
		trd_unit_monthly_po_qty_p().qty(value);
	}

	/**
	 * PO placed qty. (Week) 発注済数量（週）.<p>
	 *
	 */
	public MCNumber trd_unit_weekly_po_qty() {
		return trd_unit_weekly_po_qty_p().qty();
	}

	/**
	 * PO placed qty. (Week) 発注済数量（週）.<p>
	 *
	 */
	public void trd_unit_weekly_po_qty(MCNumber value) {
		trd_unit_weekly_po_qty_p().qty(value);
	}

	/**
	 * PO placed qty. (Week) 発注済数量（週）.<p>
	 *
	 */
	public void trd_unit_weekly_po_qty(int value) {
		trd_unit_weekly_po_qty_p().qty(value);
	}

	/**
	 * PO placed qty. (Week) 発注済数量（週）.<p>
	 *
	 */
	public void trd_unit_weekly_po_qty(long value) {
		trd_unit_weekly_po_qty_p().qty(value);
	}

	/**
	 * PO placed qty. (Week) 発注済数量（週）.<p>
	 *
	 */
	public void trd_unit_weekly_po_qty(float value) {
		trd_unit_weekly_po_qty_p().qty(value);
	}

	/**
	 * PO placed qty. (Week) 発注済数量（週）.<p>
	 *
	 */
	public void trd_unit_weekly_po_qty(double value) {
		trd_unit_weekly_po_qty_p().qty(value);
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
	 * Base unit carry-over qty. 基準単位繰越数量.<p>
	 *
	 */
	public MCNumber base_unit_bf_qty() {
		return base_unit_bf_qty_p().qty();
	}

	/**
	 * Base unit carry-over qty. 基準単位繰越数量.<p>
	 *
	 */
	public void base_unit_bf_qty(MCNumber value) {
		base_unit_bf_qty_p().qty(value);
	}

	/**
	 * Base unit carry-over qty. 基準単位繰越数量.<p>
	 *
	 */
	public void base_unit_bf_qty(int value) {
		base_unit_bf_qty_p().qty(value);
	}

	/**
	 * Base unit carry-over qty. 基準単位繰越数量.<p>
	 *
	 */
	public void base_unit_bf_qty(long value) {
		base_unit_bf_qty_p().qty(value);
	}

	/**
	 * Base unit carry-over qty. 基準単位繰越数量.<p>
	 *
	 */
	public void base_unit_bf_qty(float value) {
		base_unit_bf_qty_p().qty(value);
	}

	/**
	 * Base unit carry-over qty. 基準単位繰越数量.<p>
	 *
	 */
	public void base_unit_bf_qty(double value) {
		base_unit_bf_qty_p().qty(value);
	}

	/**
	 * Base unit PO placed qty. 基準単位発注済数量.<p>
	 *
	 */
	public MCNumber base_unit_po_qty() {
		return base_unit_po_qty_p().qty();
	}

	/**
	 * Base unit PO placed qty. 基準単位発注済数量.<p>
	 *
	 */
	public void base_unit_po_qty(MCNumber value) {
		base_unit_po_qty_p().qty(value);
	}

	/**
	 * Base unit PO placed qty. 基準単位発注済数量.<p>
	 *
	 */
	public void base_unit_po_qty(int value) {
		base_unit_po_qty_p().qty(value);
	}

	/**
	 * Base unit PO placed qty. 基準単位発注済数量.<p>
	 *
	 */
	public void base_unit_po_qty(long value) {
		base_unit_po_qty_p().qty(value);
	}

	/**
	 * Base unit PO placed qty. 基準単位発注済数量.<p>
	 *
	 */
	public void base_unit_po_qty(float value) {
		base_unit_po_qty_p().qty(value);
	}

	/**
	 * Base unit PO placed qty. 基準単位発注済数量.<p>
	 *
	 */
	public void base_unit_po_qty(double value) {
		base_unit_po_qty_p().qty(value);
	}

	/**
	 * Base unit variance qty. 基準単位差異数量.<p>
	 *
	 */
	public MCNumber base_unit_diff_qty() {
		return base_unit_diff_qty_p().qty();
	}

	/**
	 * Base unit variance qty. 基準単位差異数量.<p>
	 *
	 */
	public void base_unit_diff_qty(MCNumber value) {
		base_unit_diff_qty_p().qty(value);
	}

	/**
	 * Base unit variance qty. 基準単位差異数量.<p>
	 *
	 */
	public void base_unit_diff_qty(int value) {
		base_unit_diff_qty_p().qty(value);
	}

	/**
	 * Base unit variance qty. 基準単位差異数量.<p>
	 *
	 */
	public void base_unit_diff_qty(long value) {
		base_unit_diff_qty_p().qty(value);
	}

	/**
	 * Base unit variance qty. 基準単位差異数量.<p>
	 *
	 */
	public void base_unit_diff_qty(float value) {
		base_unit_diff_qty_p().qty(value);
	}

	/**
	 * Base unit variance qty. 基準単位差異数量.<p>
	 *
	 */
	public void base_unit_diff_qty(double value) {
		base_unit_diff_qty_p().qty(value);
	}

	/**
	 * Base unit forecast qty. (Monthly) 基準単位内示数量（月）.<p>
	 *
	 */
	public MCNumber base_unit_monthly_pf_qty() {
		return base_unit_monthly_pf_qty_p().qty();
	}

	/**
	 * Base unit forecast qty. (Monthly) 基準単位内示数量（月）.<p>
	 *
	 */
	public void base_unit_monthly_pf_qty(MCNumber value) {
		base_unit_monthly_pf_qty_p().qty(value);
	}

	/**
	 * Base unit forecast qty. (Monthly) 基準単位内示数量（月）.<p>
	 *
	 */
	public void base_unit_monthly_pf_qty(int value) {
		base_unit_monthly_pf_qty_p().qty(value);
	}

	/**
	 * Base unit forecast qty. (Monthly) 基準単位内示数量（月）.<p>
	 *
	 */
	public void base_unit_monthly_pf_qty(long value) {
		base_unit_monthly_pf_qty_p().qty(value);
	}

	/**
	 * Base unit forecast qty. (Monthly) 基準単位内示数量（月）.<p>
	 *
	 */
	public void base_unit_monthly_pf_qty(float value) {
		base_unit_monthly_pf_qty_p().qty(value);
	}

	/**
	 * Base unit forecast qty. (Monthly) 基準単位内示数量（月）.<p>
	 *
	 */
	public void base_unit_monthly_pf_qty(double value) {
		base_unit_monthly_pf_qty_p().qty(value);
	}

	/**
	 * Base unit forecast qty. (10 days) 基準単位内示数量（旬）.<p>
	 *
	 */
	public MCNumber base_unit_tendays_pf_qty() {
		return base_unit_tendays_pf_qty_p().qty();
	}

	/**
	 * Base unit forecast qty. (10 days) 基準単位内示数量（旬）.<p>
	 *
	 */
	public void base_unit_tendays_pf_qty(MCNumber value) {
		base_unit_tendays_pf_qty_p().qty(value);
	}

	/**
	 * Base unit forecast qty. (10 days) 基準単位内示数量（旬）.<p>
	 *
	 */
	public void base_unit_tendays_pf_qty(int value) {
		base_unit_tendays_pf_qty_p().qty(value);
	}

	/**
	 * Base unit forecast qty. (10 days) 基準単位内示数量（旬）.<p>
	 *
	 */
	public void base_unit_tendays_pf_qty(long value) {
		base_unit_tendays_pf_qty_p().qty(value);
	}

	/**
	 * Base unit forecast qty. (10 days) 基準単位内示数量（旬）.<p>
	 *
	 */
	public void base_unit_tendays_pf_qty(float value) {
		base_unit_tendays_pf_qty_p().qty(value);
	}

	/**
	 * Base unit forecast qty. (10 days) 基準単位内示数量（旬）.<p>
	 *
	 */
	public void base_unit_tendays_pf_qty(double value) {
		base_unit_tendays_pf_qty_p().qty(value);
	}

	/**
	 * Base unit forecast qty. (Week) 基準単位内示数量（週）.<p>
	 *
	 */
	public MCNumber base_unit_weekly_pf_qty() {
		return base_unit_weekly_pf_qty_p().qty();
	}

	/**
	 * Base unit forecast qty. (Week) 基準単位内示数量（週）.<p>
	 *
	 */
	public void base_unit_weekly_pf_qty(MCNumber value) {
		base_unit_weekly_pf_qty_p().qty(value);
	}

	/**
	 * Base unit forecast qty. (Week) 基準単位内示数量（週）.<p>
	 *
	 */
	public void base_unit_weekly_pf_qty(int value) {
		base_unit_weekly_pf_qty_p().qty(value);
	}

	/**
	 * Base unit forecast qty. (Week) 基準単位内示数量（週）.<p>
	 *
	 */
	public void base_unit_weekly_pf_qty(long value) {
		base_unit_weekly_pf_qty_p().qty(value);
	}

	/**
	 * Base unit forecast qty. (Week) 基準単位内示数量（週）.<p>
	 *
	 */
	public void base_unit_weekly_pf_qty(float value) {
		base_unit_weekly_pf_qty_p().qty(value);
	}

	/**
	 * Base unit forecast qty. (Week) 基準単位内示数量（週）.<p>
	 *
	 */
	public void base_unit_weekly_pf_qty(double value) {
		base_unit_weekly_pf_qty_p().qty(value);
	}

	/**
	 * Base unit PO placed qty. (Monthly/10 days) 基準単位発注済数量（月・旬）.<p>
	 *
	 */
	public MCNumber base_unit_monthly_po_qty() {
		return base_unit_monthly_po_qty_p().qty();
	}

	/**
	 * Base unit PO placed qty. (Monthly/10 days) 基準単位発注済数量（月・旬）.<p>
	 *
	 */
	public void base_unit_monthly_po_qty(MCNumber value) {
		base_unit_monthly_po_qty_p().qty(value);
	}

	/**
	 * Base unit PO placed qty. (Monthly/10 days) 基準単位発注済数量（月・旬）.<p>
	 *
	 */
	public void base_unit_monthly_po_qty(int value) {
		base_unit_monthly_po_qty_p().qty(value);
	}

	/**
	 * Base unit PO placed qty. (Monthly/10 days) 基準単位発注済数量（月・旬）.<p>
	 *
	 */
	public void base_unit_monthly_po_qty(long value) {
		base_unit_monthly_po_qty_p().qty(value);
	}

	/**
	 * Base unit PO placed qty. (Monthly/10 days) 基準単位発注済数量（月・旬）.<p>
	 *
	 */
	public void base_unit_monthly_po_qty(float value) {
		base_unit_monthly_po_qty_p().qty(value);
	}

	/**
	 * Base unit PO placed qty. (Monthly/10 days) 基準単位発注済数量（月・旬）.<p>
	 *
	 */
	public void base_unit_monthly_po_qty(double value) {
		base_unit_monthly_po_qty_p().qty(value);
	}

	/**
	 * Base unit PO placed qty. (Weekly) 基準単位発注済数量（週）.<p>
	 *
	 */
	public MCNumber base_unit_weekly_po_qty() {
		return base_unit_weekly_po_qty_p().qty();
	}

	/**
	 * Base unit PO placed qty. (Weekly) 基準単位発注済数量（週）.<p>
	 *
	 */
	public void base_unit_weekly_po_qty(MCNumber value) {
		base_unit_weekly_po_qty_p().qty(value);
	}

	/**
	 * Base unit PO placed qty. (Weekly) 基準単位発注済数量（週）.<p>
	 *
	 */
	public void base_unit_weekly_po_qty(int value) {
		base_unit_weekly_po_qty_p().qty(value);
	}

	/**
	 * Base unit PO placed qty. (Weekly) 基準単位発注済数量（週）.<p>
	 *
	 */
	public void base_unit_weekly_po_qty(long value) {
		base_unit_weekly_po_qty_p().qty(value);
	}

	/**
	 * Base unit PO placed qty. (Weekly) 基準単位発注済数量（週）.<p>
	 *
	 */
	public void base_unit_weekly_po_qty(float value) {
		base_unit_weekly_po_qty_p().qty(value);
	}

	/**
	 * Base unit PO placed qty. (Weekly) 基準単位発注済数量（週）.<p>
	 *
	 */
	public void base_unit_weekly_po_qty(double value) {
		base_unit_weekly_po_qty_p().qty(value);
	}

	public String rtn_sts_typ() {
		return rts_msg_p().rtn_sts_typ();
	}

	public void rtn_sts_typ(String value) {
		rts_msg_p().rtn_sts_typ(value);
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

