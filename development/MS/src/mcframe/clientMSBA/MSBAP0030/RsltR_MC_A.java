package mcframe.clientMSBA.MSBAP0030;

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
	 * Demand disaggregation by day 需要日ばらし.<p>
	 *
	 */
	public static final String $dly_div_flg = "dly_div_flg";
	/**
	 * Demand No. 需要ＮＯ.<p>
	 *
	 */
	public static final String $dmnd_no = "dmnd_no";
	/**
	 * Demand period start date 需要期間開始日.<p>
	 *
	 */
	public static final String $dmnd_st_dt = "dmnd_st_dt";
	/**
	 * Demand period end date 需要期間終了日.<p>
	 *
	 */
	public static final String $dmnd_end_dt = "dmnd_end_dt";
	/**
	 * Demand date 需要日.<p>
	 *
	 */
	public static final String $dmnd_dt = "dmnd_dt";
	/**
	 * Delivery schedule period start date 納品予定期間開始日.<p>
	 *
	 */
	public static final String $dlv_schd_st_dt = "dlv_schd_st_dt";
	/**
	 * Delivery schedule period end date 納品予定期間終了日.<p>
	 *
	 */
	public static final String $dlv_schd_end_dt = "dlv_schd_end_dt";
	/**
	 * Demand period type 需要期間区分.<p>
	 *
	 */
	public static final String $dmnd_period_typ = "dmnd_period_typ";
	/**
	 * Demand period type name 需要期間区分名.<p>
	 *
	 */
	public static final String $dmnd_period_typ_nm = "dmnd_period_typ_nm";
	/**
	 * Demand type 需要区分.<p>
	 *
	 */
	public static final String $dmnd_typ = "dmnd_typ";
	/**
	 * Demand type name 需要区分名.<p>
	 *
	 */
	public static final String $dmnd_typ_nm = "dmnd_typ_nm";
	public static final String $itm_p = "itm_p";
	/**
	 * SEIBAN No. 1 management type 手配ＮＯ１管理区分.<p>
	 *
	 */
	public static final String $sno1_mng_typ = "sno1_mng_typ";
	/**
	 * SEIBAN No. 2 management type 手配ＮＯ２管理区分.<p>
	 *
	 */
	public static final String $sno2_mng_typ = "sno2_mng_typ";
	/**
	 * SEIBAN No. 3 management type 手配ＮＯ３管理区分.<p>
	 *
	 */
	public static final String $sno3_mng_typ = "sno3_mng_typ";
	/**
	 * SEIBAN No. 4 management type 手配ＮＯ４管理区分.<p>
	 *
	 */
	public static final String $sno4_mng_typ = "sno4_mng_typ";
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
	public static final String $input_qty_p = "input_qty_p";
	public static final String $dmnd_qty_p = "dmnd_qty_p";
	public static final String $rec_qty_p = "rec_qty_p";
	public static final String $dmnd_usr_dpt_p = "dmnd_usr_dpt_p";
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
	 * Demand location cd. 需要場所ＣＤ.<p>
	 *
	 */
	public static final String $dmnd_loc_cd = "dmnd_loc_cd";
	/**
	 * Demand location name 需要場所名.<p>
	 *
	 */
	public static final String $dmnd_loc_nm = "dmnd_loc_nm";
	/**
	 * Mfg. location group cd. 製造場所グループＣＤ.<p>
	 *
	 */
	public static final String $dmnd_loc_grp_cd = "dmnd_loc_grp_cd";
	/**
	 * Mfg. location group name 製造場所グループ名.<p>
	 *
	 */
	public static final String $dmnd_loc_grp_nm = "dmnd_loc_grp_nm";
	/**
	 * Distribution group cd. 物流グループＣＤ.<p>
	 *
	 */
	public static final String $dmnd_lg_grp_cd = "dmnd_lg_grp_cd";
	/**
	 * Distribution group name 物流グループ名.<p>
	 *
	 */
	public static final String $dmnd_lg_grp_nm = "dmnd_lg_grp_nm";
	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public static final String $dmnd_wg_cd = "dmnd_wg_cd";
	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public static final String $dmnd_wg_nm = "dmnd_wg_nm";
	/**
	 * Factory/Distribution warehouse cd. 工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public static final String $dmnd_site_cd = "dmnd_site_cd";
	/**
	 * Factory/Distribution warehouse name 工場・物流倉庫名.<p>
	 *
	 */
	public static final String $dmnd_site_nm = "dmnd_site_nm";
	/**
	 * Receiving point distribution group cd. 出荷先物流グループＣＤ.<p>
	 *
	 */
	public static final String $to_lg_grp_cd = "to_lg_grp_cd";
	/**
	 * Shipping conditions cd. 出荷条件ＣＤ.<p>
	 *
	 */
	public static final String $ship_term_cd = "ship_term_cd";
	/**
	 * Shipping LT (For demand) 出荷ＬＴ（需要情報用）.<p>
	 *
	 */
	public static final String $bp_ship_lt = "bp_ship_lt";
	/**
	 * Movement LT 移動ＬＴ.<p>
	 *
	 */
	public static final String $xfr_lt = "xfr_lt";
	/**
	 * Without demand LT 需要情報ＬＴ無し.<p>
	 *
	 */
	public static final String $non_dmnd_lt_flg = "non_dmnd_lt_flg";
	/**
	 * Shipping LT 出荷ＬＴ.<p>
	 *
	 */
	public static final String $ship_lt = "ship_lt";
	public static final String $sno_wrk_no_p = "sno_wrk_no_p";
	/**
	 * Number of months for demand disaggregation by day 需要日ばらし月数.<p>
	 *
	 */
	public static final String $dmnd_date_div_mons = "dmnd_date_div_mons";
	/**
	 * Plan month 計画月度.<p>
	 *
	 */
	public static final String $ym = "ym";
	/**
	 * Sales plan version 販売計画バージョン.<p>
	 *
	 */
	public static final String $spln_vers = "spln_vers";
	/**
	 * Plan item cd. 計画品目ＣＤ.<p>
	 *
	 */
	public static final String $spln_itm_cd = "spln_itm_cd";
	/**
	 * Plan item name 計画品名.<p>
	 *
	 */
	public static final String $spln_itm_nm = "spln_itm_nm";
	/**
	 * Currency cd. 通貨ＣＤ.<p>
	 *
	 */
	public static final String $cur_cd = "cur_cd";
	/**
	 * Currency name 通貨名.<p>
	 *
	 */
	public static final String $cur_nm = "cur_nm";
	/**
	 * Sales forecast No. 顧客期間内示ＮＯ.<p>
	 *
	 */
	public static final String $cst_frcst_no = "cst_frcst_no";
	/**
	 * Sales forecast details No. 顧客期間内示明細ＮＯ.<p>
	 *
	 */
	public static final String $cst_frcst_d_no = "cst_frcst_d_no";
	/**
	 * Sales order No. 受注ＮＯ.<p>
	 *
	 */
	public static final String $slo_no = "slo_no";
	/**
	 * Sales order details No. 受注明細ＮＯ.<p>
	 *
	 */
	public static final String $slo_d_no = "slo_d_no";
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
	public static final String $itm_grp_p = "itm_grp_p";
	public static final String $dlv_grp_p = "dlv_grp_p";
	public static final String $cst_grp_p = "cst_grp_p";
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
	 * Demand update counter 需要情報更新カウンタ.<p>
	 *
	 */
	public static final String $dmnd_upd_cntr = "dmnd_upd_cntr";
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
	public static final String $input_qty = $input_qty_p + ".qty";
	public static final String $dmnd_qty = $dmnd_qty_p + ".qty";
	public static final String $rec_qty = $rec_qty_p + ".qty";
	public static final String $dmnd_usr_cd = $dmnd_usr_dpt_p + ".usr_cd";
	public static final String $dmnd_usr_nm = $dmnd_usr_dpt_p + ".usr_nm";
	public static final String $dmnd_dpt_cd = $dmnd_usr_dpt_p + ".dpt_cd";
	public static final String $dmnd_dpt_nm = $dmnd_usr_dpt_p + ".dpt_nm";
	public static final String $sno1 = $sno_wrk_no_p + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno1 + "";
	public static final String $sno2 = $sno_wrk_no_p + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno2 + "";
	public static final String $sno3 = $sno_wrk_no_p + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno3 + "";
	public static final String $sno4 = $sno_wrk_no_p + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno4 + "";
	public static final String $wrk_no = $sno_wrk_no_p + ".wrk_no";
	public static final String $wrk_nm = $sno_wrk_no_p + ".wrk_nm";
	public static final String $rtn_sts_typ = $rts_msg_p + ".rtn_sts_typ";
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

	public static final MCMeta check_META = createCommonMeta($check, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta dly_div_flg_META = createCommonMeta($dly_div_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta dmnd_no_META = createCommonMeta($dmnd_no, mcframe.commonMA.meta.MA_META.DMND_NO);
	public static final MCMeta dmnd_st_dt_META = createCommonMeta($dmnd_st_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta dmnd_end_dt_META = createCommonMeta($dmnd_end_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta dmnd_dt_META = createCommonMeta($dmnd_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta dlv_schd_st_dt_META = createCommonMeta($dlv_schd_st_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta dlv_schd_end_dt_META = createCommonMeta($dlv_schd_end_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta dmnd_period_typ_META = createCommonMeta($dmnd_period_typ, mcframe.commonMA.meta.MA_META.PERIOD_TYP);
	public static final MCMeta dmnd_period_typ_nm_META = createCommonMeta($dmnd_period_typ_nm, mcframe.commonMA.meta.MA_META.PERIOD_TYP_NM);
	public static final MCMeta dmnd_typ_META = createCommonMeta($dmnd_typ, mcframe.commonMS.meta.MS_META.DMND_TYP);
	public static final MCMeta dmnd_typ_nm_META = createCommonMeta($dmnd_typ_nm, mcframe.commonMS.meta.MS_META.DMND_TYP_NM);
	public static final MCMeta itm_p_META = createInnerRowMeta($itm_p, mcframe.clientMAUB.MAUBP5030.ItmR.class);
	public static final MCMeta sno1_mng_typ_META = createCommonMeta($sno1_mng_typ, mcframe.commonMA.meta.MA_META.SNO_MNG_TYP);
	public static final MCMeta sno2_mng_typ_META = createCommonMeta($sno2_mng_typ, mcframe.commonMA.meta.MA_META.SNO_MNG_TYP);
	public static final MCMeta sno3_mng_typ_META = createCommonMeta($sno3_mng_typ, mcframe.commonMA.meta.MA_META.SNO_MNG_TYP);
	public static final MCMeta sno4_mng_typ_META = createCommonMeta($sno4_mng_typ, mcframe.commonMA.meta.MA_META.SNO_MNG_TYP);
	public static final MCMeta base_unit_cd_META = createCommonMeta($base_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta base_unit_nm_META = createCommonMeta($base_unit_nm, mcframe.commonMA.meta.MA_META.UNIT_NM);
	public static final MCMeta base_unit_dec_place_META = createCommonMeta($base_unit_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta input_qty_p_META = createInnerRowMeta($input_qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta dmnd_qty_p_META = createInnerRowMeta($dmnd_qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta rec_qty_p_META = createInnerRowMeta($rec_qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta dmnd_usr_dpt_p_META = createInnerRowMeta($dmnd_usr_dpt_p, mcframe.clientMAUB.MAUBP5230.UsrDptR.class);
	public static final MCMeta dlv_cd_META = createCommonMeta($dlv_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta dlv_nm_META = createCommonMeta($dlv_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta cst_cd_META = createCommonMeta($cst_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta cst_nm_META = createCommonMeta($cst_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta dmnd_loc_cd_META = createCommonMeta($dmnd_loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta dmnd_loc_nm_META = createCommonMeta($dmnd_loc_nm, mcframe.commonMA.meta.MA_META.LOC_NM);
	public static final MCMeta dmnd_loc_grp_cd_META = createCommonMeta($dmnd_loc_grp_cd, mcframe.commonMA.meta.MA_META.LOC_GRP_CD);
	public static final MCMeta dmnd_loc_grp_nm_META = createCommonMeta($dmnd_loc_grp_nm, mcframe.commonMA.meta.MA_META.LOC_GRP_NM);
	public static final MCMeta dmnd_lg_grp_cd_META = createCommonMeta($dmnd_lg_grp_cd, mcframe.commonMA.meta.MA_META.LG_GRP_CD);
	public static final MCMeta dmnd_lg_grp_nm_META = createCommonMeta($dmnd_lg_grp_nm, mcframe.commonMA.meta.MA_META.LG_GRP_NM);
	public static final MCMeta dmnd_wg_cd_META = createCommonMeta($dmnd_wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta dmnd_wg_nm_META = createCommonMeta($dmnd_wg_nm, mcframe.commonMA.meta.MA_META.WG_NM);
	public static final MCMeta dmnd_site_cd_META = createCommonMeta($dmnd_site_cd, mcframe.commonMA.meta.MA_META.SITE_CD);
	public static final MCMeta dmnd_site_nm_META = createCommonMeta($dmnd_site_nm, mcframe.commonMA.meta.MA_META.SITE_NM);
	public static final MCMeta to_lg_grp_cd_META = createCommonMeta($to_lg_grp_cd, mcframe.commonMA.meta.MA_META.LG_GRP_CD);
	public static final MCMeta ship_term_cd_META = createCommonMeta($ship_term_cd, mcframe.commonMA.meta.MA_META.SHIP_TERM_CD);
	public static final MCMeta bp_ship_lt_META = createCommonMeta($bp_ship_lt, mcframe.commonMA.meta.MA_META.LT);
	public static final MCMeta xfr_lt_META = createCommonMeta($xfr_lt, mcframe.commonMA.meta.MA_META.LT);
	public static final MCMeta non_dmnd_lt_flg_META = createCommonMeta($non_dmnd_lt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta ship_lt_META = createCommonMeta($ship_lt, mcframe.commonMA.meta.MA_META.LT);
	public static final MCMeta sno_wrk_no_p_META = createInnerRowMeta($sno_wrk_no_p, mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.class);
	public static final MCMeta dmnd_date_div_mons_META = createCommonMeta($dmnd_date_div_mons, mcframe.commonMA.meta.MA_META.MONS);
	public static final MCMeta ym_META = createCommonMeta($ym, mcframe.commonMA.meta.MA_META.YM);
	public static final MCMeta spln_vers_META = createCommonMeta($spln_vers, mcframe.commonMS.meta.MS_META.SPLN_VERS);
	public static final MCMeta spln_itm_cd_META = createCommonMeta($spln_itm_cd, mcframe.commonMA.meta.MA_META.SPLN_ITM_CD);
	public static final MCMeta spln_itm_nm_META = createCommonMeta($spln_itm_nm, mcframe.commonMA.meta.MA_META.SPLN_ITM_NM);
	public static final MCMeta cur_cd_META = createCommonMeta($cur_cd, mcframe.commonMA.meta.MA_META.CUR_CD);
	public static final MCMeta cur_nm_META = createCommonMeta($cur_nm, mcframe.commonMA.meta.MA_META.CUR_NM);
	public static final MCMeta cst_frcst_no_META = createCommonMeta($cst_frcst_no, mcframe.commonMA.meta.MA_META.CST_FRCST_NO);
	public static final MCMeta cst_frcst_d_no_META = createCommonMeta($cst_frcst_d_no, mcframe.commonMA.meta.MA_META.CST_FRCST_D_NO);
	public static final MCMeta slo_no_META = createCommonMeta($slo_no, mcframe.commonMA.meta.MA_META.SLO_NO);
	public static final MCMeta slo_d_no_META = createCommonMeta($slo_d_no, mcframe.commonMA.meta.MA_META.SLO_D_NO);
	public static final MCMeta intr_rmrks_META = createCommonMeta($intr_rmrks, mcframe.commonMS.meta.MS_META.DMND_INTR_RMRKS);
	public static final MCMeta sub_char1_META = createCommonMeta($sub_char1, mcframe.commonMS.meta.MS_META.DMND_SUB_CHAR1);
	public static final MCMeta sub_char2_META = createCommonMeta($sub_char2, mcframe.commonMS.meta.MS_META.DMND_SUB_CHAR2);
	public static final MCMeta sub_char3_META = createCommonMeta($sub_char3, mcframe.commonMS.meta.MS_META.DMND_SUB_CHAR3);
	public static final MCMeta itm_typ_META = createCommonMeta($itm_typ, mcframe.commonMA.meta.MA_META.ITM_TYP);
	public static final MCMeta itm_typ_nm_META = createCommonMeta($itm_typ_nm, mcframe.commonMA.meta.MA_META.ITM_TYP_NM);
	public static final MCMeta itm_typ_d_cd_META = createCommonMeta($itm_typ_d_cd, mcframe.commonMA.meta.MA_META.ITM_TYP_D_CD);
	public static final MCMeta itm_typ_d_nm_META = createCommonMeta($itm_typ_d_nm, mcframe.commonMA.meta.MA_META.ITM_TYP_D_NM);
	public static final MCMeta rts_msg_p_META = createInnerRowMeta($rts_msg_p, mcframe.clientMAUB.MAUBP5310.RtnMsgR.class);
	public static final MCMeta itm_grp_p_META = createInnerRowMeta($itm_grp_p, mcframe.clientMAUB.MAUBP5170.ItmGrpR.class);
	public static final MCMeta dlv_grp_p_META = createInnerRowMeta($dlv_grp_p, mcframe.clientMAUB.MAUBP5190.BpGrpR.class);
	public static final MCMeta cst_grp_p_META = createInnerRowMeta($cst_grp_p, mcframe.clientMAUB.MAUBP5190.BpGrpR.class);
	public static final MCMeta ins_usr_id_META = createCommonMeta($ins_usr_id, mcframe.commonMA.meta.MA_META.FCM_USR_ID);
	public static final MCMeta ins_usr_nm_META = createCommonMeta($ins_usr_nm, mcframe.commonMA.meta.MA_META.FCM_USR_NM);
	public static final MCMeta ins_func_id_META = createCommonMeta($ins_func_id, mcframe.commonMA.meta.MA_META.FUNC_ID);
	public static final MCMeta ins_func_nm_META = createCommonMeta($ins_func_nm, mcframe.commonMA.meta.MA_META.FUNC_NM);
	public static final MCMeta ins_ts_META = createCommonMeta($ins_ts, mcframe.commonMA.meta.MA_META.SYS_TS);
	public static final MCMeta dmnd_upd_cntr_META = createCommonMeta($dmnd_upd_cntr, mcframe.commonMA.meta.MA_META.UPD_CNT);
	public static final MCMeta upd_usr_id_META = createCommonMeta($upd_usr_id, mcframe.commonMA.meta.MA_META.FCM_USR_ID);
	public static final MCMeta upd_usr_nm_META = createCommonMeta($upd_usr_nm, mcframe.commonMA.meta.MA_META.FCM_USR_NM);
	public static final MCMeta upd_func_id_META = createCommonMeta($upd_func_id, mcframe.commonMA.meta.MA_META.FUNC_ID);
	public static final MCMeta upd_func_nm_META = createCommonMeta($upd_func_nm, mcframe.commonMA.meta.MA_META.FUNC_NM);
	public static final MCMeta upd_ts_META = createCommonMeta($upd_ts, mcframe.commonMA.meta.MA_META.SYS_TS);
	public static final MCMeta upd_srv_req_no_META = createCommonMeta($upd_srv_req_no, mcframe.commonMA.meta.MA_META.SRV_REQ_NO);

	protected static final ConstMetaList<RsltR> constMetas = new ConstMetaList<RsltR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			check_META,
			dly_div_flg_META,
			dmnd_no_META,
			dmnd_st_dt_META,
			dmnd_end_dt_META,
			dmnd_dt_META,
			dlv_schd_st_dt_META,
			dlv_schd_end_dt_META,
			dmnd_period_typ_META,
			dmnd_period_typ_nm_META,
			dmnd_typ_META,
			dmnd_typ_nm_META,
			itm_p_META,
			sno1_mng_typ_META,
			sno2_mng_typ_META,
			sno3_mng_typ_META,
			sno4_mng_typ_META,
			base_unit_cd_META,
			base_unit_nm_META,
			base_unit_dec_place_META,
			input_qty_p_META,
			dmnd_qty_p_META,
			rec_qty_p_META,
			dmnd_usr_dpt_p_META,
			dlv_cd_META,
			dlv_nm_META,
			cst_cd_META,
			cst_nm_META,
			dmnd_loc_cd_META,
			dmnd_loc_nm_META,
			dmnd_loc_grp_cd_META,
			dmnd_loc_grp_nm_META,
			dmnd_lg_grp_cd_META,
			dmnd_lg_grp_nm_META,
			dmnd_wg_cd_META,
			dmnd_wg_nm_META,
			dmnd_site_cd_META,
			dmnd_site_nm_META,
			to_lg_grp_cd_META,
			ship_term_cd_META,
			bp_ship_lt_META,
			xfr_lt_META,
			non_dmnd_lt_flg_META,
			ship_lt_META,
			sno_wrk_no_p_META,
			dmnd_date_div_mons_META,
			ym_META,
			spln_vers_META,
			spln_itm_cd_META,
			spln_itm_nm_META,
			cur_cd_META,
			cur_nm_META,
			cst_frcst_no_META,
			cst_frcst_d_no_META,
			slo_no_META,
			slo_d_no_META,
			intr_rmrks_META,
			sub_char1_META,
			sub_char2_META,
			sub_char3_META,
			itm_typ_META,
			itm_typ_nm_META,
			itm_typ_d_cd_META,
			itm_typ_d_nm_META,
			rts_msg_p_META,
			itm_grp_p_META,
			dlv_grp_p_META,
			cst_grp_p_META,
			ins_usr_id_META,
			ins_usr_nm_META,
			ins_func_id_META,
			ins_func_nm_META,
			ins_ts_META,
			dmnd_upd_cntr_META,
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
				"input_qty",
				"dmnd_qty",
				"rec_qty",
				"dmnd_usr_cd",
				"dmnd_usr_nm",
				"dmnd_dpt_cd",
				"dmnd_dpt_nm",
				"sno1",
				"sno2",
				"sno3",
				"sno4",
				"wrk_no",
				"wrk_nm",
				"rtn_sts_typ",
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
				"cst_grp_nm10"
			},
			{
				$itm_cd,
				$itm_sub1,
				$itm_sub2,
				$itm_sub3,
				$itm_nm,
				$input_qty,
				$dmnd_qty,
				$rec_qty,
				$dmnd_usr_cd,
				$dmnd_usr_nm,
				$dmnd_dpt_cd,
				$dmnd_dpt_nm,
				$sno1,
				$sno2,
				$sno3,
				$sno4,
				$wrk_no,
				$wrk_nm,
				$rtn_sts_typ,
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
				$cst_grp_nm10
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
				{$dmnd_period_typ, "period_typ_nm"},	// dmnd_period_typ
				{$itm_p + ".itm_cd", "itm_nm;itm_sub1;itm_sub2;itm_sub3;sno1_mng_typ;sno2_mng_typ;sno3_mng_typ;sno4_mng_typ;unit_cd;unit_nm;dec_place;ship_term_cd"},	// itm_p.itm_cd
				{$itm_p + ".itm_sub1", "itm_nm;itm_sub2;itm_sub3;sno1_mng_typ;sno2_mng_typ;sno3_mng_typ;sno4_mng_typ;unit_cd;unit_nm;dec_place;ship_term_cd"},	// itm_p.itm_sub1
				{$itm_p + ".itm_sub2", "itm_nm;itm_sub3;sno1_mng_typ;sno2_mng_typ;sno3_mng_typ;sno4_mng_typ;unit_cd;unit_nm;dec_place;ship_term_cd"},	// itm_p.itm_sub2
				{$itm_p + ".itm_sub3", "itm_nm;sno1_mng_typ;sno2_mng_typ;sno3_mng_typ;sno4_mng_typ;unit_cd;unit_nm;dec_place;ship_term_cd"},	// itm_p.itm_sub3
				{$dmnd_usr_dpt_p + ".dpt_cd", "dpt_nm"},	// dmnd_usr_dpt_p.dpt_cd
				{$dlv_cd, "bp_nm;lg_grp_cd"},	// dlv_cd
				{$cst_cd, "bp_nm;ship_lt"},	// cst_cd
				{$dmnd_loc_cd, "loc_nm;wg_cd;wg_nm;site_cd;site_nm;loc_grp_cd;loc_grp_nm;lg_grp_cd;lg_grp_nm;site_cd;site_nm"}	// dmnd_loc_cd
			}
		)),
		new MCExtMap.Entry($$LIST_IN, new MCExtList(
			new String[][]{
				{$itm_p + ".itm_cd", "MAC_ITM_IS_SRCH_TYP.NOT_ASSET3"},	// itm_p.itm_cd
				{$itm_p + ".itm_sub1", "MAC_ITM_IS_SRCH_TYP.NOT_ASSET3;itm_cd"},	// itm_p.itm_sub1
				{$itm_p + ".itm_sub2", "MAC_ITM_IS_SRCH_TYP.NOT_ASSET3;itm_cd;itm_sub1"},	// itm_p.itm_sub2
				{$itm_p + ".itm_sub3", "MAC_ITM_IS_SRCH_TYP.NOT_ASSET3;itm_cd;itm_sub1;itm_sub2"},	// itm_p.itm_sub3
				{$dmnd_usr_dpt_p + ".dpt_cd", "dmnd_dt;dmnd_usr_cd;MAC_DPT_IS_SRCH_TYP.SLS"},	// dmnd_usr_dpt_p.dpt_cd
				{$dlv_cd, "MAC_BP_IS_SRCH_TYP.DLV"},	// dlv_cd
				{$cst_cd, "MAC_BP_IS_SRCH_TYP.CST"},	// cst_cd
				{$dmnd_loc_cd, "dlv_cd;dmnd_dpt_cd;dmnd_dt;itm_cd;itm_sub1;itm_sub2;itm_sub3"},	// dmnd_loc_cd
				{$ship_term_cd, "dmnd_lg_grp_cd;to_lg_grp_cd;true"}	// ship_term_cd
			}
		)),
		new MCExtMap.Entry($$LIST_IN_BASE, new MCExtList(
			new String[][]{
				{$itm_p + ".itm_cd", "itm_is_srch_typ"},	// itm_p.itm_cd
				{$itm_p + ".itm_sub1", "itm_is_srch_typ;itm_cd"},	// itm_p.itm_sub1
				{$itm_p + ".itm_sub2", "itm_is_srch_typ;itm_cd;itm_sub1"},	// itm_p.itm_sub2
				{$itm_p + ".itm_sub3", "itm_is_srch_typ;itm_cd;itm_sub1;itm_sub2"},	// itm_p.itm_sub3
				{$dmnd_usr_dpt_p + ".dpt_cd", "dt;usr_cd;dpt_is_srch_typ"},	// dmnd_usr_dpt_p.dpt_cd
				{$dlv_cd, "bp_is_srch_typ"},	// dlv_cd
				{$cst_cd, "bp_is_srch_typ"},	// cst_cd
				{$dmnd_loc_cd, "dlv_cd;sls_dpt_cd;dt;itm_cd;itm_sub1;itm_sub2;itm_sub3"},	// dmnd_loc_cd
				{$ship_term_cd, "fr_lg_grp_cd;to_lg_grp_cd;mode_nullval_flg"}	// ship_term_cd
			}
		)),
		new MCExtMap.Entry($$DISP_CTL, new MCExtList(
			new String[][]{
				{$dmnd_loc_grp_cd, "LOC_GRP"},	// dmnd_loc_grp_cd
				{$dmnd_loc_grp_nm, "LOC_GRP"},	// dmnd_loc_grp_nm
				{$dmnd_lg_grp_cd, "LG_GRP"},	// dmnd_lg_grp_cd
				{$dmnd_lg_grp_nm, "LG_GRP"},	// dmnd_lg_grp_nm
				{$dmnd_wg_cd, "WG"},	// dmnd_wg_cd
				{$dmnd_wg_nm, "WG"},	// dmnd_wg_nm
				{$dmnd_site_cd, "SITE"},	// dmnd_site_cd
				{$dmnd_site_nm, "SITE"},	// dmnd_site_nm
				{$to_lg_grp_cd, "LG_GRP"}	// to_lg_grp_cd
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
	 * Demand disaggregation by day 需要日ばらし.<p>
	 *
	 */
	public boolean dly_div_flg() {
		return getConstBoolean(offset + 1, $dly_div_flg);
	}

	/**
	 * Demand disaggregation by day 需要日ばらし.<p>
	 *
	 */
	public void dly_div_flg(boolean value) {
		setConstBoolean(offset + 1, $dly_div_flg, value);
	}


	/**
	 * Demand No. 需要ＮＯ.<p>
	 *
	 */
	public String dmnd_no() {
		return getConstString(offset + 2, $dmnd_no);
	}

	/**
	 * Demand No. 需要ＮＯ.<p>
	 *
	 */
	public void dmnd_no(String value) {
		setConstString(offset + 2, $dmnd_no, value);
	}


	/**
	 * Demand period start date 需要期間開始日.<p>
	 *
	 */
	public MCDate dmnd_st_dt() {
		return getConstDate(offset + 3, $dmnd_st_dt);
	}

	/**
	 * Demand period start date 需要期間開始日.<p>
	 *
	 */
	public void dmnd_st_dt(MCDate value) {
		setConstDate(offset + 3, $dmnd_st_dt, value);
	}


	/**
	 * Demand period end date 需要期間終了日.<p>
	 *
	 */
	public MCDate dmnd_end_dt() {
		return getConstDate(offset + 4, $dmnd_end_dt);
	}

	/**
	 * Demand period end date 需要期間終了日.<p>
	 *
	 */
	public void dmnd_end_dt(MCDate value) {
		setConstDate(offset + 4, $dmnd_end_dt, value);
	}


	/**
	 * Demand date 需要日.<p>
	 *
	 */
	public MCDate dmnd_dt() {
		return getConstDate(offset + 5, $dmnd_dt);
	}

	/**
	 * Demand date 需要日.<p>
	 *
	 */
	public void dmnd_dt(MCDate value) {
		setConstDate(offset + 5, $dmnd_dt, value);
	}


	/**
	 * Delivery schedule period start date 納品予定期間開始日.<p>
	 *
	 */
	public MCDate dlv_schd_st_dt() {
		return getConstDate(offset + 6, $dlv_schd_st_dt);
	}

	/**
	 * Delivery schedule period start date 納品予定期間開始日.<p>
	 *
	 */
	public void dlv_schd_st_dt(MCDate value) {
		setConstDate(offset + 6, $dlv_schd_st_dt, value);
	}


	/**
	 * Delivery schedule period end date 納品予定期間終了日.<p>
	 *
	 */
	public MCDate dlv_schd_end_dt() {
		return getConstDate(offset + 7, $dlv_schd_end_dt);
	}

	/**
	 * Delivery schedule period end date 納品予定期間終了日.<p>
	 *
	 */
	public void dlv_schd_end_dt(MCDate value) {
		setConstDate(offset + 7, $dlv_schd_end_dt, value);
	}


	/**
	 * Demand period type 需要期間区分.<p>
	 *
	 */
	public String dmnd_period_typ() {
		return getConstString(offset + 8, $dmnd_period_typ);
	}

	/**
	 * Demand period type 需要期間区分.<p>
	 *
	 */
	public void dmnd_period_typ(String value) {
		setConstString(offset + 8, $dmnd_period_typ, value);
	}


	/**
	 * Demand period type name 需要期間区分名.<p>
	 *
	 */
	public String dmnd_period_typ_nm() {
		return getConstString(offset + 9, $dmnd_period_typ_nm);
	}

	/**
	 * Demand period type name 需要期間区分名.<p>
	 *
	 */
	public void dmnd_period_typ_nm(String value) {
		setConstString(offset + 9, $dmnd_period_typ_nm, value);
	}


	/**
	 * Demand type 需要区分.<p>
	 *
	 */
	public String dmnd_typ() {
		return getConstString(offset + 10, $dmnd_typ);
	}

	/**
	 * Demand type 需要区分.<p>
	 *
	 */
	public void dmnd_typ(String value) {
		setConstString(offset + 10, $dmnd_typ, value);
	}


	/**
	 * Demand type name 需要区分名.<p>
	 *
	 */
	public String dmnd_typ_nm() {
		return getConstString(offset + 11, $dmnd_typ_nm);
	}

	/**
	 * Demand type name 需要区分名.<p>
	 *
	 */
	public void dmnd_typ_nm(String value) {
		setConstString(offset + 11, $dmnd_typ_nm, value);
	}


	public mcframe.clientMAUB.MAUBP5030.ItmR itm_p(){
		return (mcframe.clientMAUB.MAUBP5030.ItmR) getConstInnerRow(offset + 12, $itm_p);
	}
	
	public void itm_p(mcframe.clientMAUB.MAUBP5030.ItmR row){
		setConstInnerRow(offset + 12, $itm_p, row);
	}


	/**
	 * SEIBAN No. 1 management type 手配ＮＯ１管理区分.<p>
	 *
	 */
	public String sno1_mng_typ() {
		return getConstString(offset + 13, $sno1_mng_typ);
	}

	/**
	 * SEIBAN No. 1 management type 手配ＮＯ１管理区分.<p>
	 *
	 */
	public void sno1_mng_typ(String value) {
		setConstString(offset + 13, $sno1_mng_typ, value);
	}


	/**
	 * SEIBAN No. 2 management type 手配ＮＯ２管理区分.<p>
	 *
	 */
	public String sno2_mng_typ() {
		return getConstString(offset + 14, $sno2_mng_typ);
	}

	/**
	 * SEIBAN No. 2 management type 手配ＮＯ２管理区分.<p>
	 *
	 */
	public void sno2_mng_typ(String value) {
		setConstString(offset + 14, $sno2_mng_typ, value);
	}


	/**
	 * SEIBAN No. 3 management type 手配ＮＯ３管理区分.<p>
	 *
	 */
	public String sno3_mng_typ() {
		return getConstString(offset + 15, $sno3_mng_typ);
	}

	/**
	 * SEIBAN No. 3 management type 手配ＮＯ３管理区分.<p>
	 *
	 */
	public void sno3_mng_typ(String value) {
		setConstString(offset + 15, $sno3_mng_typ, value);
	}


	/**
	 * SEIBAN No. 4 management type 手配ＮＯ４管理区分.<p>
	 *
	 */
	public String sno4_mng_typ() {
		return getConstString(offset + 16, $sno4_mng_typ);
	}

	/**
	 * SEIBAN No. 4 management type 手配ＮＯ４管理区分.<p>
	 *
	 */
	public void sno4_mng_typ(String value) {
		setConstString(offset + 16, $sno4_mng_typ, value);
	}


	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public String base_unit_cd() {
		return getConstString(offset + 17, $base_unit_cd);
	}

	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public void base_unit_cd(String value) {
		setConstString(offset + 17, $base_unit_cd, value);
	}


	/**
	 * Base unit name 基準単位名.<p>
	 *
	 */
	public String base_unit_nm() {
		return getConstString(offset + 18, $base_unit_nm);
	}

	/**
	 * Base unit name 基準単位名.<p>
	 *
	 */
	public void base_unit_nm(String value) {
		setConstString(offset + 18, $base_unit_nm, value);
	}


	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public MCNumber base_unit_dec_place() {
		return getConstNumber(offset + 19, $base_unit_dec_place);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(MCNumber value) {
		setConstNumber(offset + 19, $base_unit_dec_place, value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(int value) {
		setConstNumber(offset + 19, $base_unit_dec_place, value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(long value) {
		setConstNumber(offset + 19, $base_unit_dec_place, value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(float value) {
		setConstNumber(offset + 19, $base_unit_dec_place, value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(double value) {
		setConstNumber(offset + 19, $base_unit_dec_place, value);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR input_qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 20, $input_qty_p);
	}
	
	public void input_qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 20, $input_qty_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR dmnd_qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 21, $dmnd_qty_p);
	}
	
	public void dmnd_qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 21, $dmnd_qty_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR rec_qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 22, $rec_qty_p);
	}
	
	public void rec_qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 22, $rec_qty_p, row);
	}


	public mcframe.clientMAUB.MAUBP5230.UsrDptR dmnd_usr_dpt_p(){
		return (mcframe.clientMAUB.MAUBP5230.UsrDptR) getConstInnerRow(offset + 23, $dmnd_usr_dpt_p);
	}
	
	public void dmnd_usr_dpt_p(mcframe.clientMAUB.MAUBP5230.UsrDptR row){
		setConstInnerRow(offset + 23, $dmnd_usr_dpt_p, row);
	}


	/**
	 * Delivery destination cd. 納品先ＣＤ.<p>
	 *
	 */
	public String dlv_cd() {
		return getConstString(offset + 24, $dlv_cd);
	}

	/**
	 * Delivery destination cd. 納品先ＣＤ.<p>
	 *
	 */
	public void dlv_cd(String value) {
		setConstString(offset + 24, $dlv_cd, value);
	}


	/**
	 * Delivery destination name 納品先名.<p>
	 *
	 */
	public String dlv_nm() {
		return getConstString(offset + 25, $dlv_nm);
	}

	/**
	 * Delivery destination name 納品先名.<p>
	 *
	 */
	public void dlv_nm(String value) {
		setConstString(offset + 25, $dlv_nm, value);
	}


	/**
	 * Customer cd. 得意先ＣＤ.<p>
	 *
	 */
	public String cst_cd() {
		return getConstString(offset + 26, $cst_cd);
	}

	/**
	 * Customer cd. 得意先ＣＤ.<p>
	 *
	 */
	public void cst_cd(String value) {
		setConstString(offset + 26, $cst_cd, value);
	}


	/**
	 * Customer name 得意先名.<p>
	 *
	 */
	public String cst_nm() {
		return getConstString(offset + 27, $cst_nm);
	}

	/**
	 * Customer name 得意先名.<p>
	 *
	 */
	public void cst_nm(String value) {
		setConstString(offset + 27, $cst_nm, value);
	}


	/**
	 * Demand location cd. 需要場所ＣＤ.<p>
	 *
	 */
	public String dmnd_loc_cd() {
		return getConstString(offset + 28, $dmnd_loc_cd);
	}

	/**
	 * Demand location cd. 需要場所ＣＤ.<p>
	 *
	 */
	public void dmnd_loc_cd(String value) {
		setConstString(offset + 28, $dmnd_loc_cd, value);
	}


	/**
	 * Demand location name 需要場所名.<p>
	 *
	 */
	public String dmnd_loc_nm() {
		return getConstString(offset + 29, $dmnd_loc_nm);
	}

	/**
	 * Demand location name 需要場所名.<p>
	 *
	 */
	public void dmnd_loc_nm(String value) {
		setConstString(offset + 29, $dmnd_loc_nm, value);
	}


	/**
	 * Mfg. location group cd. 製造場所グループＣＤ.<p>
	 *
	 */
	public String dmnd_loc_grp_cd() {
		return getConstString(offset + 30, $dmnd_loc_grp_cd);
	}

	/**
	 * Mfg. location group cd. 製造場所グループＣＤ.<p>
	 *
	 */
	public void dmnd_loc_grp_cd(String value) {
		setConstString(offset + 30, $dmnd_loc_grp_cd, value);
	}


	/**
	 * Mfg. location group name 製造場所グループ名.<p>
	 *
	 */
	public String dmnd_loc_grp_nm() {
		return getConstString(offset + 31, $dmnd_loc_grp_nm);
	}

	/**
	 * Mfg. location group name 製造場所グループ名.<p>
	 *
	 */
	public void dmnd_loc_grp_nm(String value) {
		setConstString(offset + 31, $dmnd_loc_grp_nm, value);
	}


	/**
	 * Distribution group cd. 物流グループＣＤ.<p>
	 *
	 */
	public String dmnd_lg_grp_cd() {
		return getConstString(offset + 32, $dmnd_lg_grp_cd);
	}

	/**
	 * Distribution group cd. 物流グループＣＤ.<p>
	 *
	 */
	public void dmnd_lg_grp_cd(String value) {
		setConstString(offset + 32, $dmnd_lg_grp_cd, value);
	}


	/**
	 * Distribution group name 物流グループ名.<p>
	 *
	 */
	public String dmnd_lg_grp_nm() {
		return getConstString(offset + 33, $dmnd_lg_grp_nm);
	}

	/**
	 * Distribution group name 物流グループ名.<p>
	 *
	 */
	public void dmnd_lg_grp_nm(String value) {
		setConstString(offset + 33, $dmnd_lg_grp_nm, value);
	}


	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public String dmnd_wg_cd() {
		return getConstString(offset + 34, $dmnd_wg_cd);
	}

	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public void dmnd_wg_cd(String value) {
		setConstString(offset + 34, $dmnd_wg_cd, value);
	}


	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public String dmnd_wg_nm() {
		return getConstString(offset + 35, $dmnd_wg_nm);
	}

	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public void dmnd_wg_nm(String value) {
		setConstString(offset + 35, $dmnd_wg_nm, value);
	}


	/**
	 * Factory/Distribution warehouse cd. 工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public String dmnd_site_cd() {
		return getConstString(offset + 36, $dmnd_site_cd);
	}

	/**
	 * Factory/Distribution warehouse cd. 工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public void dmnd_site_cd(String value) {
		setConstString(offset + 36, $dmnd_site_cd, value);
	}


	/**
	 * Factory/Distribution warehouse name 工場・物流倉庫名.<p>
	 *
	 */
	public String dmnd_site_nm() {
		return getConstString(offset + 37, $dmnd_site_nm);
	}

	/**
	 * Factory/Distribution warehouse name 工場・物流倉庫名.<p>
	 *
	 */
	public void dmnd_site_nm(String value) {
		setConstString(offset + 37, $dmnd_site_nm, value);
	}


	/**
	 * Receiving point distribution group cd. 出荷先物流グループＣＤ.<p>
	 *
	 */
	public String to_lg_grp_cd() {
		return getConstString(offset + 38, $to_lg_grp_cd);
	}

	/**
	 * Receiving point distribution group cd. 出荷先物流グループＣＤ.<p>
	 *
	 */
	public void to_lg_grp_cd(String value) {
		setConstString(offset + 38, $to_lg_grp_cd, value);
	}


	/**
	 * Shipping conditions cd. 出荷条件ＣＤ.<p>
	 *
	 */
	public String ship_term_cd() {
		return getConstString(offset + 39, $ship_term_cd);
	}

	/**
	 * Shipping conditions cd. 出荷条件ＣＤ.<p>
	 *
	 */
	public void ship_term_cd(String value) {
		setConstString(offset + 39, $ship_term_cd, value);
	}


	/**
	 * Shipping LT (For demand) 出荷ＬＴ（需要情報用）.<p>
	 *
	 */
	public MCNumber bp_ship_lt() {
		return getConstNumber(offset + 40, $bp_ship_lt);
	}

	/**
	 * Shipping LT (For demand) 出荷ＬＴ（需要情報用）.<p>
	 *
	 */
	public void bp_ship_lt(MCNumber value) {
		setConstNumber(offset + 40, $bp_ship_lt, value);
	}

	/**
	 * Shipping LT (For demand) 出荷ＬＴ（需要情報用）.<p>
	 *
	 */
	public void bp_ship_lt(int value) {
		setConstNumber(offset + 40, $bp_ship_lt, value);
	}

	/**
	 * Shipping LT (For demand) 出荷ＬＴ（需要情報用）.<p>
	 *
	 */
	public void bp_ship_lt(long value) {
		setConstNumber(offset + 40, $bp_ship_lt, value);
	}

	/**
	 * Shipping LT (For demand) 出荷ＬＴ（需要情報用）.<p>
	 *
	 */
	public void bp_ship_lt(float value) {
		setConstNumber(offset + 40, $bp_ship_lt, value);
	}

	/**
	 * Shipping LT (For demand) 出荷ＬＴ（需要情報用）.<p>
	 *
	 */
	public void bp_ship_lt(double value) {
		setConstNumber(offset + 40, $bp_ship_lt, value);
	}


	/**
	 * Movement LT 移動ＬＴ.<p>
	 *
	 */
	public MCNumber xfr_lt() {
		return getConstNumber(offset + 41, $xfr_lt);
	}

	/**
	 * Movement LT 移動ＬＴ.<p>
	 *
	 */
	public void xfr_lt(MCNumber value) {
		setConstNumber(offset + 41, $xfr_lt, value);
	}

	/**
	 * Movement LT 移動ＬＴ.<p>
	 *
	 */
	public void xfr_lt(int value) {
		setConstNumber(offset + 41, $xfr_lt, value);
	}

	/**
	 * Movement LT 移動ＬＴ.<p>
	 *
	 */
	public void xfr_lt(long value) {
		setConstNumber(offset + 41, $xfr_lt, value);
	}

	/**
	 * Movement LT 移動ＬＴ.<p>
	 *
	 */
	public void xfr_lt(float value) {
		setConstNumber(offset + 41, $xfr_lt, value);
	}

	/**
	 * Movement LT 移動ＬＴ.<p>
	 *
	 */
	public void xfr_lt(double value) {
		setConstNumber(offset + 41, $xfr_lt, value);
	}


	/**
	 * Without demand LT 需要情報ＬＴ無し.<p>
	 *
	 */
	public boolean non_dmnd_lt_flg() {
		return getConstBoolean(offset + 42, $non_dmnd_lt_flg);
	}

	/**
	 * Without demand LT 需要情報ＬＴ無し.<p>
	 *
	 */
	public void non_dmnd_lt_flg(boolean value) {
		setConstBoolean(offset + 42, $non_dmnd_lt_flg, value);
	}


	/**
	 * Shipping LT 出荷ＬＴ.<p>
	 *
	 */
	public MCNumber ship_lt() {
		return getConstNumber(offset + 43, $ship_lt);
	}

	/**
	 * Shipping LT 出荷ＬＴ.<p>
	 *
	 */
	public void ship_lt(MCNumber value) {
		setConstNumber(offset + 43, $ship_lt, value);
	}

	/**
	 * Shipping LT 出荷ＬＴ.<p>
	 *
	 */
	public void ship_lt(int value) {
		setConstNumber(offset + 43, $ship_lt, value);
	}

	/**
	 * Shipping LT 出荷ＬＴ.<p>
	 *
	 */
	public void ship_lt(long value) {
		setConstNumber(offset + 43, $ship_lt, value);
	}

	/**
	 * Shipping LT 出荷ＬＴ.<p>
	 *
	 */
	public void ship_lt(float value) {
		setConstNumber(offset + 43, $ship_lt, value);
	}

	/**
	 * Shipping LT 出荷ＬＴ.<p>
	 *
	 */
	public void ship_lt(double value) {
		setConstNumber(offset + 43, $ship_lt, value);
	}


	public mcframe.clientMSUB.MSUBP5020.SnoWrkNoR sno_wrk_no_p(){
		return (mcframe.clientMSUB.MSUBP5020.SnoWrkNoR) getConstInnerRow(offset + 44, $sno_wrk_no_p);
	}
	
	public void sno_wrk_no_p(mcframe.clientMSUB.MSUBP5020.SnoWrkNoR row){
		setConstInnerRow(offset + 44, $sno_wrk_no_p, row);
	}


	/**
	 * Number of months for demand disaggregation by day 需要日ばらし月数.<p>
	 *
	 */
	public MCNumber dmnd_date_div_mons() {
		return getConstNumber(offset + 45, $dmnd_date_div_mons);
	}

	/**
	 * Number of months for demand disaggregation by day 需要日ばらし月数.<p>
	 *
	 */
	public void dmnd_date_div_mons(MCNumber value) {
		setConstNumber(offset + 45, $dmnd_date_div_mons, value);
	}

	/**
	 * Number of months for demand disaggregation by day 需要日ばらし月数.<p>
	 *
	 */
	public void dmnd_date_div_mons(int value) {
		setConstNumber(offset + 45, $dmnd_date_div_mons, value);
	}

	/**
	 * Number of months for demand disaggregation by day 需要日ばらし月数.<p>
	 *
	 */
	public void dmnd_date_div_mons(long value) {
		setConstNumber(offset + 45, $dmnd_date_div_mons, value);
	}

	/**
	 * Number of months for demand disaggregation by day 需要日ばらし月数.<p>
	 *
	 */
	public void dmnd_date_div_mons(float value) {
		setConstNumber(offset + 45, $dmnd_date_div_mons, value);
	}

	/**
	 * Number of months for demand disaggregation by day 需要日ばらし月数.<p>
	 *
	 */
	public void dmnd_date_div_mons(double value) {
		setConstNumber(offset + 45, $dmnd_date_div_mons, value);
	}


	/**
	 * Plan month 計画月度.<p>
	 *
	 */
	public MCDate ym() {
		return getConstDate(offset + 46, $ym);
	}

	/**
	 * Plan month 計画月度.<p>
	 *
	 */
	public void ym(MCDate value) {
		setConstDate(offset + 46, $ym, value);
	}


	/**
	 * Sales plan version 販売計画バージョン.<p>
	 *
	 */
	public String spln_vers() {
		return getConstString(offset + 47, $spln_vers);
	}

	/**
	 * Sales plan version 販売計画バージョン.<p>
	 *
	 */
	public void spln_vers(String value) {
		setConstString(offset + 47, $spln_vers, value);
	}


	/**
	 * Plan item cd. 計画品目ＣＤ.<p>
	 *
	 */
	public String spln_itm_cd() {
		return getConstString(offset + 48, $spln_itm_cd);
	}

	/**
	 * Plan item cd. 計画品目ＣＤ.<p>
	 *
	 */
	public void spln_itm_cd(String value) {
		setConstString(offset + 48, $spln_itm_cd, value);
	}


	/**
	 * Plan item name 計画品名.<p>
	 *
	 */
	public String spln_itm_nm() {
		return getConstString(offset + 49, $spln_itm_nm);
	}

	/**
	 * Plan item name 計画品名.<p>
	 *
	 */
	public void spln_itm_nm(String value) {
		setConstString(offset + 49, $spln_itm_nm, value);
	}


	/**
	 * Currency cd. 通貨ＣＤ.<p>
	 *
	 */
	public String cur_cd() {
		return getConstString(offset + 50, $cur_cd);
	}

	/**
	 * Currency cd. 通貨ＣＤ.<p>
	 *
	 */
	public void cur_cd(String value) {
		setConstString(offset + 50, $cur_cd, value);
	}


	/**
	 * Currency name 通貨名.<p>
	 *
	 */
	public String cur_nm() {
		return getConstString(offset + 51, $cur_nm);
	}

	/**
	 * Currency name 通貨名.<p>
	 *
	 */
	public void cur_nm(String value) {
		setConstString(offset + 51, $cur_nm, value);
	}


	/**
	 * Sales forecast No. 顧客期間内示ＮＯ.<p>
	 *
	 */
	public String cst_frcst_no() {
		return getConstString(offset + 52, $cst_frcst_no);
	}

	/**
	 * Sales forecast No. 顧客期間内示ＮＯ.<p>
	 *
	 */
	public void cst_frcst_no(String value) {
		setConstString(offset + 52, $cst_frcst_no, value);
	}


	/**
	 * Sales forecast details No. 顧客期間内示明細ＮＯ.<p>
	 *
	 */
	public String cst_frcst_d_no() {
		return getConstString(offset + 53, $cst_frcst_d_no);
	}

	/**
	 * Sales forecast details No. 顧客期間内示明細ＮＯ.<p>
	 *
	 */
	public void cst_frcst_d_no(String value) {
		setConstString(offset + 53, $cst_frcst_d_no, value);
	}


	/**
	 * Sales order No. 受注ＮＯ.<p>
	 *
	 */
	public String slo_no() {
		return getConstString(offset + 54, $slo_no);
	}

	/**
	 * Sales order No. 受注ＮＯ.<p>
	 *
	 */
	public void slo_no(String value) {
		setConstString(offset + 54, $slo_no, value);
	}


	/**
	 * Sales order details No. 受注明細ＮＯ.<p>
	 *
	 */
	public String slo_d_no() {
		return getConstString(offset + 55, $slo_d_no);
	}

	/**
	 * Sales order details No. 受注明細ＮＯ.<p>
	 *
	 */
	public void slo_d_no(String value) {
		setConstString(offset + 55, $slo_d_no, value);
	}


	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public String intr_rmrks() {
		return getConstString(offset + 56, $intr_rmrks);
	}

	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public void intr_rmrks(String value) {
		setConstString(offset + 56, $intr_rmrks, value);
	}


	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public String sub_char1() {
		return getConstString(offset + 57, $sub_char1);
	}

	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public void sub_char1(String value) {
		setConstString(offset + 57, $sub_char1, value);
	}


	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public String sub_char2() {
		return getConstString(offset + 58, $sub_char2);
	}

	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public void sub_char2(String value) {
		setConstString(offset + 58, $sub_char2, value);
	}


	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public String sub_char3() {
		return getConstString(offset + 59, $sub_char3);
	}

	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public void sub_char3(String value) {
		setConstString(offset + 59, $sub_char3, value);
	}


	/**
	 * Item type 品目区分.<p>
	 *
	 */
	public String itm_typ() {
		return getConstString(offset + 60, $itm_typ);
	}

	/**
	 * Item type 品目区分.<p>
	 *
	 */
	public void itm_typ(String value) {
		setConstString(offset + 60, $itm_typ, value);
	}


	/**
	 * Item type name 品目区分名.<p>
	 *
	 */
	public String itm_typ_nm() {
		return getConstString(offset + 61, $itm_typ_nm);
	}

	/**
	 * Item type name 品目区分名.<p>
	 *
	 */
	public void itm_typ_nm(String value) {
		setConstString(offset + 61, $itm_typ_nm, value);
	}


	/**
	 * Item type details cd. 品目区分詳細ＣＤ.<p>
	 *
	 */
	public String itm_typ_d_cd() {
		return getConstString(offset + 62, $itm_typ_d_cd);
	}

	/**
	 * Item type details cd. 品目区分詳細ＣＤ.<p>
	 *
	 */
	public void itm_typ_d_cd(String value) {
		setConstString(offset + 62, $itm_typ_d_cd, value);
	}


	/**
	 * Item type details name 品目区分詳細名.<p>
	 *
	 */
	public String itm_typ_d_nm() {
		return getConstString(offset + 63, $itm_typ_d_nm);
	}

	/**
	 * Item type details name 品目区分詳細名.<p>
	 *
	 */
	public void itm_typ_d_nm(String value) {
		setConstString(offset + 63, $itm_typ_d_nm, value);
	}


	public mcframe.clientMAUB.MAUBP5310.RtnMsgR rts_msg_p(){
		return (mcframe.clientMAUB.MAUBP5310.RtnMsgR) getConstInnerRow(offset + 64, $rts_msg_p);
	}
	
	public void rts_msg_p(mcframe.clientMAUB.MAUBP5310.RtnMsgR row){
		setConstInnerRow(offset + 64, $rts_msg_p, row);
	}


	public mcframe.clientMAUB.MAUBP5170.ItmGrpR itm_grp_p(){
		return (mcframe.clientMAUB.MAUBP5170.ItmGrpR) getConstInnerRow(offset + 65, $itm_grp_p);
	}
	
	public void itm_grp_p(mcframe.clientMAUB.MAUBP5170.ItmGrpR row){
		setConstInnerRow(offset + 65, $itm_grp_p, row);
	}


	public mcframe.clientMAUB.MAUBP5190.BpGrpR dlv_grp_p(){
		return (mcframe.clientMAUB.MAUBP5190.BpGrpR) getConstInnerRow(offset + 66, $dlv_grp_p);
	}
	
	public void dlv_grp_p(mcframe.clientMAUB.MAUBP5190.BpGrpR row){
		setConstInnerRow(offset + 66, $dlv_grp_p, row);
	}


	public mcframe.clientMAUB.MAUBP5190.BpGrpR cst_grp_p(){
		return (mcframe.clientMAUB.MAUBP5190.BpGrpR) getConstInnerRow(offset + 67, $cst_grp_p);
	}
	
	public void cst_grp_p(mcframe.clientMAUB.MAUBP5190.BpGrpR row){
		setConstInnerRow(offset + 67, $cst_grp_p, row);
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
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public String ins_func_id() {
		return getConstString(offset + 70, $ins_func_id);
	}

	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public void ins_func_id(String value) {
		setConstString(offset + 70, $ins_func_id, value);
	}


	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public String ins_func_nm() {
		return getConstString(offset + 71, $ins_func_nm);
	}

	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public void ins_func_nm(String value) {
		setConstString(offset + 71, $ins_func_nm, value);
	}


	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public MCTimestamp ins_ts() {
		return getConstTimestamp(offset + 72, $ins_ts);
	}

	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public void ins_ts(MCTimestamp value) {
		setConstTimestamp(offset + 72, $ins_ts, value);
	}


	/**
	 * Demand update counter 需要情報更新カウンタ.<p>
	 *
	 */
	public MCNumber dmnd_upd_cntr() {
		return getConstNumber(offset + 73, $dmnd_upd_cntr);
	}

	/**
	 * Demand update counter 需要情報更新カウンタ.<p>
	 *
	 */
	public void dmnd_upd_cntr(MCNumber value) {
		setConstNumber(offset + 73, $dmnd_upd_cntr, value);
	}

	/**
	 * Demand update counter 需要情報更新カウンタ.<p>
	 *
	 */
	public void dmnd_upd_cntr(int value) {
		setConstNumber(offset + 73, $dmnd_upd_cntr, value);
	}

	/**
	 * Demand update counter 需要情報更新カウンタ.<p>
	 *
	 */
	public void dmnd_upd_cntr(long value) {
		setConstNumber(offset + 73, $dmnd_upd_cntr, value);
	}

	/**
	 * Demand update counter 需要情報更新カウンタ.<p>
	 *
	 */
	public void dmnd_upd_cntr(float value) {
		setConstNumber(offset + 73, $dmnd_upd_cntr, value);
	}

	/**
	 * Demand update counter 需要情報更新カウンタ.<p>
	 *
	 */
	public void dmnd_upd_cntr(double value) {
		setConstNumber(offset + 73, $dmnd_upd_cntr, value);
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
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public String upd_func_id() {
		return getConstString(offset + 76, $upd_func_id);
	}

	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public void upd_func_id(String value) {
		setConstString(offset + 76, $upd_func_id, value);
	}


	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public String upd_func_nm() {
		return getConstString(offset + 77, $upd_func_nm);
	}

	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public void upd_func_nm(String value) {
		setConstString(offset + 77, $upd_func_nm, value);
	}


	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public MCTimestamp upd_ts() {
		return getConstTimestamp(offset + 78, $upd_ts);
	}

	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public void upd_ts(MCTimestamp value) {
		setConstTimestamp(offset + 78, $upd_ts, value);
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


	public String getString(String name) {
		if ($dmnd_no.equalsIgnoreCase(name)) {
			return dmnd_no();
		}
		if ($dmnd_period_typ.equalsIgnoreCase(name)) {
			return dmnd_period_typ();
		}
		if ($dmnd_period_typ_nm.equalsIgnoreCase(name)) {
			return dmnd_period_typ_nm();
		}
		if ($dmnd_typ.equalsIgnoreCase(name)) {
			return dmnd_typ();
		}
		if ($dmnd_typ_nm.equalsIgnoreCase(name)) {
			return dmnd_typ_nm();
		}
		if ($sno1_mng_typ.equalsIgnoreCase(name)) {
			return sno1_mng_typ();
		}
		if ($sno2_mng_typ.equalsIgnoreCase(name)) {
			return sno2_mng_typ();
		}
		if ($sno3_mng_typ.equalsIgnoreCase(name)) {
			return sno3_mng_typ();
		}
		if ($sno4_mng_typ.equalsIgnoreCase(name)) {
			return sno4_mng_typ();
		}
		if ($base_unit_cd.equalsIgnoreCase(name)) {
			return base_unit_cd();
		}
		if ($base_unit_nm.equalsIgnoreCase(name)) {
			return base_unit_nm();
		}
		if ($dlv_cd.equalsIgnoreCase(name)) {
			return dlv_cd();
		}
		if ($dlv_nm.equalsIgnoreCase(name)) {
			return dlv_nm();
		}
		if ($cst_cd.equalsIgnoreCase(name)) {
			return cst_cd();
		}
		if ($cst_nm.equalsIgnoreCase(name)) {
			return cst_nm();
		}
		if ($dmnd_loc_cd.equalsIgnoreCase(name)) {
			return dmnd_loc_cd();
		}
		if ($dmnd_loc_nm.equalsIgnoreCase(name)) {
			return dmnd_loc_nm();
		}
		if ($dmnd_loc_grp_cd.equalsIgnoreCase(name)) {
			return dmnd_loc_grp_cd();
		}
		if ($dmnd_loc_grp_nm.equalsIgnoreCase(name)) {
			return dmnd_loc_grp_nm();
		}
		if ($dmnd_lg_grp_cd.equalsIgnoreCase(name)) {
			return dmnd_lg_grp_cd();
		}
		if ($dmnd_lg_grp_nm.equalsIgnoreCase(name)) {
			return dmnd_lg_grp_nm();
		}
		if ($dmnd_wg_cd.equalsIgnoreCase(name)) {
			return dmnd_wg_cd();
		}
		if ($dmnd_wg_nm.equalsIgnoreCase(name)) {
			return dmnd_wg_nm();
		}
		if ($dmnd_site_cd.equalsIgnoreCase(name)) {
			return dmnd_site_cd();
		}
		if ($dmnd_site_nm.equalsIgnoreCase(name)) {
			return dmnd_site_nm();
		}
		if ($to_lg_grp_cd.equalsIgnoreCase(name)) {
			return to_lg_grp_cd();
		}
		if ($ship_term_cd.equalsIgnoreCase(name)) {
			return ship_term_cd();
		}
		if ($spln_vers.equalsIgnoreCase(name)) {
			return spln_vers();
		}
		if ($spln_itm_cd.equalsIgnoreCase(name)) {
			return spln_itm_cd();
		}
		if ($spln_itm_nm.equalsIgnoreCase(name)) {
			return spln_itm_nm();
		}
		if ($cur_cd.equalsIgnoreCase(name)) {
			return cur_cd();
		}
		if ($cur_nm.equalsIgnoreCase(name)) {
			return cur_nm();
		}
		if ($cst_frcst_no.equalsIgnoreCase(name)) {
			return cst_frcst_no();
		}
		if ($cst_frcst_d_no.equalsIgnoreCase(name)) {
			return cst_frcst_d_no();
		}
		if ($slo_no.equalsIgnoreCase(name)) {
			return slo_no();
		}
		if ($slo_d_no.equalsIgnoreCase(name)) {
			return slo_d_no();
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
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			return base_unit_dec_place();
		}
		if ($bp_ship_lt.equalsIgnoreCase(name)) {
			return bp_ship_lt();
		}
		if ($xfr_lt.equalsIgnoreCase(name)) {
			return xfr_lt();
		}
		if ($ship_lt.equalsIgnoreCase(name)) {
			return ship_lt();
		}
		if ($dmnd_date_div_mons.equalsIgnoreCase(name)) {
			return dmnd_date_div_mons();
		}
		if ($dmnd_upd_cntr.equalsIgnoreCase(name)) {
			return dmnd_upd_cntr();
		}
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		if ($dmnd_st_dt.equalsIgnoreCase(name)) {
			return dmnd_st_dt();
		}
		if ($dmnd_end_dt.equalsIgnoreCase(name)) {
			return dmnd_end_dt();
		}
		if ($dmnd_dt.equalsIgnoreCase(name)) {
			return dmnd_dt();
		}
		if ($dlv_schd_st_dt.equalsIgnoreCase(name)) {
			return dlv_schd_st_dt();
		}
		if ($dlv_schd_end_dt.equalsIgnoreCase(name)) {
			return dlv_schd_end_dt();
		}
		if ($ym.equalsIgnoreCase(name)) {
			return ym();
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
		if ($dly_div_flg.equalsIgnoreCase(name)) {
			return dly_div_flg();
		}
		if ($non_dmnd_lt_flg.equalsIgnoreCase(name)) {
			return non_dmnd_lt_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($dmnd_no.equalsIgnoreCase(name)) {
			return dmnd_no();
		}
		if ($dmnd_period_typ.equalsIgnoreCase(name)) {
			return dmnd_period_typ();
		}
		if ($dmnd_period_typ_nm.equalsIgnoreCase(name)) {
			return dmnd_period_typ_nm();
		}
		if ($dmnd_typ.equalsIgnoreCase(name)) {
			return dmnd_typ();
		}
		if ($dmnd_typ_nm.equalsIgnoreCase(name)) {
			return dmnd_typ_nm();
		}
		if ($sno1_mng_typ.equalsIgnoreCase(name)) {
			return sno1_mng_typ();
		}
		if ($sno2_mng_typ.equalsIgnoreCase(name)) {
			return sno2_mng_typ();
		}
		if ($sno3_mng_typ.equalsIgnoreCase(name)) {
			return sno3_mng_typ();
		}
		if ($sno4_mng_typ.equalsIgnoreCase(name)) {
			return sno4_mng_typ();
		}
		if ($base_unit_cd.equalsIgnoreCase(name)) {
			return base_unit_cd();
		}
		if ($base_unit_nm.equalsIgnoreCase(name)) {
			return base_unit_nm();
		}
		if ($dlv_cd.equalsIgnoreCase(name)) {
			return dlv_cd();
		}
		if ($dlv_nm.equalsIgnoreCase(name)) {
			return dlv_nm();
		}
		if ($cst_cd.equalsIgnoreCase(name)) {
			return cst_cd();
		}
		if ($cst_nm.equalsIgnoreCase(name)) {
			return cst_nm();
		}
		if ($dmnd_loc_cd.equalsIgnoreCase(name)) {
			return dmnd_loc_cd();
		}
		if ($dmnd_loc_nm.equalsIgnoreCase(name)) {
			return dmnd_loc_nm();
		}
		if ($dmnd_loc_grp_cd.equalsIgnoreCase(name)) {
			return dmnd_loc_grp_cd();
		}
		if ($dmnd_loc_grp_nm.equalsIgnoreCase(name)) {
			return dmnd_loc_grp_nm();
		}
		if ($dmnd_lg_grp_cd.equalsIgnoreCase(name)) {
			return dmnd_lg_grp_cd();
		}
		if ($dmnd_lg_grp_nm.equalsIgnoreCase(name)) {
			return dmnd_lg_grp_nm();
		}
		if ($dmnd_wg_cd.equalsIgnoreCase(name)) {
			return dmnd_wg_cd();
		}
		if ($dmnd_wg_nm.equalsIgnoreCase(name)) {
			return dmnd_wg_nm();
		}
		if ($dmnd_site_cd.equalsIgnoreCase(name)) {
			return dmnd_site_cd();
		}
		if ($dmnd_site_nm.equalsIgnoreCase(name)) {
			return dmnd_site_nm();
		}
		if ($to_lg_grp_cd.equalsIgnoreCase(name)) {
			return to_lg_grp_cd();
		}
		if ($ship_term_cd.equalsIgnoreCase(name)) {
			return ship_term_cd();
		}
		if ($spln_vers.equalsIgnoreCase(name)) {
			return spln_vers();
		}
		if ($spln_itm_cd.equalsIgnoreCase(name)) {
			return spln_itm_cd();
		}
		if ($spln_itm_nm.equalsIgnoreCase(name)) {
			return spln_itm_nm();
		}
		if ($cur_cd.equalsIgnoreCase(name)) {
			return cur_cd();
		}
		if ($cur_nm.equalsIgnoreCase(name)) {
			return cur_nm();
		}
		if ($cst_frcst_no.equalsIgnoreCase(name)) {
			return cst_frcst_no();
		}
		if ($cst_frcst_d_no.equalsIgnoreCase(name)) {
			return cst_frcst_d_no();
		}
		if ($slo_no.equalsIgnoreCase(name)) {
			return slo_no();
		}
		if ($slo_d_no.equalsIgnoreCase(name)) {
			return slo_d_no();
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
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			return base_unit_dec_place();
		}
		if ($bp_ship_lt.equalsIgnoreCase(name)) {
			return bp_ship_lt();
		}
		if ($xfr_lt.equalsIgnoreCase(name)) {
			return xfr_lt();
		}
		if ($ship_lt.equalsIgnoreCase(name)) {
			return ship_lt();
		}
		if ($dmnd_date_div_mons.equalsIgnoreCase(name)) {
			return dmnd_date_div_mons();
		}
		if ($dmnd_upd_cntr.equalsIgnoreCase(name)) {
			return dmnd_upd_cntr();
		}
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($dmnd_st_dt.equalsIgnoreCase(name)) {
			return dmnd_st_dt();
		}
		if ($dmnd_end_dt.equalsIgnoreCase(name)) {
			return dmnd_end_dt();
		}
		if ($dmnd_dt.equalsIgnoreCase(name)) {
			return dmnd_dt();
		}
		if ($dlv_schd_st_dt.equalsIgnoreCase(name)) {
			return dlv_schd_st_dt();
		}
		if ($dlv_schd_end_dt.equalsIgnoreCase(name)) {
			return dlv_schd_end_dt();
		}
		if ($ym.equalsIgnoreCase(name)) {
			return ym();
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
		if ($dly_div_flg.equalsIgnoreCase(name)) {
			return dly_div_flg();
		}
		if ($non_dmnd_lt_flg.equalsIgnoreCase(name)) {
			return non_dmnd_lt_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($dmnd_no.equalsIgnoreCase(name)) {
			dmnd_no(value);
			return;
		}
		if ($dmnd_period_typ.equalsIgnoreCase(name)) {
			dmnd_period_typ(value);
			return;
		}
		if ($dmnd_period_typ_nm.equalsIgnoreCase(name)) {
			dmnd_period_typ_nm(value);
			return;
		}
		if ($dmnd_typ.equalsIgnoreCase(name)) {
			dmnd_typ(value);
			return;
		}
		if ($dmnd_typ_nm.equalsIgnoreCase(name)) {
			dmnd_typ_nm(value);
			return;
		}
		if ($sno1_mng_typ.equalsIgnoreCase(name)) {
			sno1_mng_typ(value);
			return;
		}
		if ($sno2_mng_typ.equalsIgnoreCase(name)) {
			sno2_mng_typ(value);
			return;
		}
		if ($sno3_mng_typ.equalsIgnoreCase(name)) {
			sno3_mng_typ(value);
			return;
		}
		if ($sno4_mng_typ.equalsIgnoreCase(name)) {
			sno4_mng_typ(value);
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
		if ($dlv_cd.equalsIgnoreCase(name)) {
			dlv_cd(value);
			return;
		}
		if ($dlv_nm.equalsIgnoreCase(name)) {
			dlv_nm(value);
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
		if ($dmnd_loc_cd.equalsIgnoreCase(name)) {
			dmnd_loc_cd(value);
			return;
		}
		if ($dmnd_loc_nm.equalsIgnoreCase(name)) {
			dmnd_loc_nm(value);
			return;
		}
		if ($dmnd_loc_grp_cd.equalsIgnoreCase(name)) {
			dmnd_loc_grp_cd(value);
			return;
		}
		if ($dmnd_loc_grp_nm.equalsIgnoreCase(name)) {
			dmnd_loc_grp_nm(value);
			return;
		}
		if ($dmnd_lg_grp_cd.equalsIgnoreCase(name)) {
			dmnd_lg_grp_cd(value);
			return;
		}
		if ($dmnd_lg_grp_nm.equalsIgnoreCase(name)) {
			dmnd_lg_grp_nm(value);
			return;
		}
		if ($dmnd_wg_cd.equalsIgnoreCase(name)) {
			dmnd_wg_cd(value);
			return;
		}
		if ($dmnd_wg_nm.equalsIgnoreCase(name)) {
			dmnd_wg_nm(value);
			return;
		}
		if ($dmnd_site_cd.equalsIgnoreCase(name)) {
			dmnd_site_cd(value);
			return;
		}
		if ($dmnd_site_nm.equalsIgnoreCase(name)) {
			dmnd_site_nm(value);
			return;
		}
		if ($to_lg_grp_cd.equalsIgnoreCase(name)) {
			to_lg_grp_cd(value);
			return;
		}
		if ($ship_term_cd.equalsIgnoreCase(name)) {
			ship_term_cd(value);
			return;
		}
		if ($spln_vers.equalsIgnoreCase(name)) {
			spln_vers(value);
			return;
		}
		if ($spln_itm_cd.equalsIgnoreCase(name)) {
			spln_itm_cd(value);
			return;
		}
		if ($spln_itm_nm.equalsIgnoreCase(name)) {
			spln_itm_nm(value);
			return;
		}
		if ($cur_cd.equalsIgnoreCase(name)) {
			cur_cd(value);
			return;
		}
		if ($cur_nm.equalsIgnoreCase(name)) {
			cur_nm(value);
			return;
		}
		if ($cst_frcst_no.equalsIgnoreCase(name)) {
			cst_frcst_no(value);
			return;
		}
		if ($cst_frcst_d_no.equalsIgnoreCase(name)) {
			cst_frcst_d_no(value);
			return;
		}
		if ($slo_no.equalsIgnoreCase(name)) {
			slo_no(value);
			return;
		}
		if ($slo_d_no.equalsIgnoreCase(name)) {
			slo_d_no(value);
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
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($bp_ship_lt.equalsIgnoreCase(name)) {
			bp_ship_lt(value);
			return;
		}
		if ($xfr_lt.equalsIgnoreCase(name)) {
			xfr_lt(value);
			return;
		}
		if ($ship_lt.equalsIgnoreCase(name)) {
			ship_lt(value);
			return;
		}
		if ($dmnd_date_div_mons.equalsIgnoreCase(name)) {
			dmnd_date_div_mons(value);
			return;
		}
		if ($dmnd_upd_cntr.equalsIgnoreCase(name)) {
			dmnd_upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($bp_ship_lt.equalsIgnoreCase(name)) {
			bp_ship_lt(value);
			return;
		}
		if ($xfr_lt.equalsIgnoreCase(name)) {
			xfr_lt(value);
			return;
		}
		if ($ship_lt.equalsIgnoreCase(name)) {
			ship_lt(value);
			return;
		}
		if ($dmnd_date_div_mons.equalsIgnoreCase(name)) {
			dmnd_date_div_mons(value);
			return;
		}
		if ($dmnd_upd_cntr.equalsIgnoreCase(name)) {
			dmnd_upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($bp_ship_lt.equalsIgnoreCase(name)) {
			bp_ship_lt(value);
			return;
		}
		if ($xfr_lt.equalsIgnoreCase(name)) {
			xfr_lt(value);
			return;
		}
		if ($ship_lt.equalsIgnoreCase(name)) {
			ship_lt(value);
			return;
		}
		if ($dmnd_date_div_mons.equalsIgnoreCase(name)) {
			dmnd_date_div_mons(value);
			return;
		}
		if ($dmnd_upd_cntr.equalsIgnoreCase(name)) {
			dmnd_upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($bp_ship_lt.equalsIgnoreCase(name)) {
			bp_ship_lt(value);
			return;
		}
		if ($xfr_lt.equalsIgnoreCase(name)) {
			xfr_lt(value);
			return;
		}
		if ($ship_lt.equalsIgnoreCase(name)) {
			ship_lt(value);
			return;
		}
		if ($dmnd_date_div_mons.equalsIgnoreCase(name)) {
			dmnd_date_div_mons(value);
			return;
		}
		if ($dmnd_upd_cntr.equalsIgnoreCase(name)) {
			dmnd_upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($bp_ship_lt.equalsIgnoreCase(name)) {
			bp_ship_lt(value);
			return;
		}
		if ($xfr_lt.equalsIgnoreCase(name)) {
			xfr_lt(value);
			return;
		}
		if ($ship_lt.equalsIgnoreCase(name)) {
			ship_lt(value);
			return;
		}
		if ($dmnd_date_div_mons.equalsIgnoreCase(name)) {
			dmnd_date_div_mons(value);
			return;
		}
		if ($dmnd_upd_cntr.equalsIgnoreCase(name)) {
			dmnd_upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($dmnd_st_dt.equalsIgnoreCase(name)) {
			dmnd_st_dt(value);
			return;
		}
		if ($dmnd_end_dt.equalsIgnoreCase(name)) {
			dmnd_end_dt(value);
			return;
		}
		if ($dmnd_dt.equalsIgnoreCase(name)) {
			dmnd_dt(value);
			return;
		}
		if ($dlv_schd_st_dt.equalsIgnoreCase(name)) {
			dlv_schd_st_dt(value);
			return;
		}
		if ($dlv_schd_end_dt.equalsIgnoreCase(name)) {
			dlv_schd_end_dt(value);
			return;
		}
		if ($ym.equalsIgnoreCase(name)) {
			ym(value);
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
		if ($dly_div_flg.equalsIgnoreCase(name)) {
			dly_div_flg(value);
			return;
		}
		if ($non_dmnd_lt_flg.equalsIgnoreCase(name)) {
			non_dmnd_lt_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($dmnd_no.equalsIgnoreCase(name)) {
			dmnd_no(value);
			return;
		}
		if ($dmnd_period_typ.equalsIgnoreCase(name)) {
			dmnd_period_typ(value);
			return;
		}
		if ($dmnd_period_typ_nm.equalsIgnoreCase(name)) {
			dmnd_period_typ_nm(value);
			return;
		}
		if ($dmnd_typ.equalsIgnoreCase(name)) {
			dmnd_typ(value);
			return;
		}
		if ($dmnd_typ_nm.equalsIgnoreCase(name)) {
			dmnd_typ_nm(value);
			return;
		}
		if ($sno1_mng_typ.equalsIgnoreCase(name)) {
			sno1_mng_typ(value);
			return;
		}
		if ($sno2_mng_typ.equalsIgnoreCase(name)) {
			sno2_mng_typ(value);
			return;
		}
		if ($sno3_mng_typ.equalsIgnoreCase(name)) {
			sno3_mng_typ(value);
			return;
		}
		if ($sno4_mng_typ.equalsIgnoreCase(name)) {
			sno4_mng_typ(value);
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
		if ($dlv_cd.equalsIgnoreCase(name)) {
			dlv_cd(value);
			return;
		}
		if ($dlv_nm.equalsIgnoreCase(name)) {
			dlv_nm(value);
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
		if ($dmnd_loc_cd.equalsIgnoreCase(name)) {
			dmnd_loc_cd(value);
			return;
		}
		if ($dmnd_loc_nm.equalsIgnoreCase(name)) {
			dmnd_loc_nm(value);
			return;
		}
		if ($dmnd_loc_grp_cd.equalsIgnoreCase(name)) {
			dmnd_loc_grp_cd(value);
			return;
		}
		if ($dmnd_loc_grp_nm.equalsIgnoreCase(name)) {
			dmnd_loc_grp_nm(value);
			return;
		}
		if ($dmnd_lg_grp_cd.equalsIgnoreCase(name)) {
			dmnd_lg_grp_cd(value);
			return;
		}
		if ($dmnd_lg_grp_nm.equalsIgnoreCase(name)) {
			dmnd_lg_grp_nm(value);
			return;
		}
		if ($dmnd_wg_cd.equalsIgnoreCase(name)) {
			dmnd_wg_cd(value);
			return;
		}
		if ($dmnd_wg_nm.equalsIgnoreCase(name)) {
			dmnd_wg_nm(value);
			return;
		}
		if ($dmnd_site_cd.equalsIgnoreCase(name)) {
			dmnd_site_cd(value);
			return;
		}
		if ($dmnd_site_nm.equalsIgnoreCase(name)) {
			dmnd_site_nm(value);
			return;
		}
		if ($to_lg_grp_cd.equalsIgnoreCase(name)) {
			to_lg_grp_cd(value);
			return;
		}
		if ($ship_term_cd.equalsIgnoreCase(name)) {
			ship_term_cd(value);
			return;
		}
		if ($spln_vers.equalsIgnoreCase(name)) {
			spln_vers(value);
			return;
		}
		if ($spln_itm_cd.equalsIgnoreCase(name)) {
			spln_itm_cd(value);
			return;
		}
		if ($spln_itm_nm.equalsIgnoreCase(name)) {
			spln_itm_nm(value);
			return;
		}
		if ($cur_cd.equalsIgnoreCase(name)) {
			cur_cd(value);
			return;
		}
		if ($cur_nm.equalsIgnoreCase(name)) {
			cur_nm(value);
			return;
		}
		if ($cst_frcst_no.equalsIgnoreCase(name)) {
			cst_frcst_no(value);
			return;
		}
		if ($cst_frcst_d_no.equalsIgnoreCase(name)) {
			cst_frcst_d_no(value);
			return;
		}
		if ($slo_no.equalsIgnoreCase(name)) {
			slo_no(value);
			return;
		}
		if ($slo_d_no.equalsIgnoreCase(name)) {
			slo_d_no(value);
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
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($bp_ship_lt.equalsIgnoreCase(name)) {
			bp_ship_lt(value);
			return;
		}
		if ($xfr_lt.equalsIgnoreCase(name)) {
			xfr_lt(value);
			return;
		}
		if ($ship_lt.equalsIgnoreCase(name)) {
			ship_lt(value);
			return;
		}
		if ($dmnd_date_div_mons.equalsIgnoreCase(name)) {
			dmnd_date_div_mons(value);
			return;
		}
		if ($dmnd_upd_cntr.equalsIgnoreCase(name)) {
			dmnd_upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($bp_ship_lt.equalsIgnoreCase(name)) {
			bp_ship_lt(value);
			return;
		}
		if ($xfr_lt.equalsIgnoreCase(name)) {
			xfr_lt(value);
			return;
		}
		if ($ship_lt.equalsIgnoreCase(name)) {
			ship_lt(value);
			return;
		}
		if ($dmnd_date_div_mons.equalsIgnoreCase(name)) {
			dmnd_date_div_mons(value);
			return;
		}
		if ($dmnd_upd_cntr.equalsIgnoreCase(name)) {
			dmnd_upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($bp_ship_lt.equalsIgnoreCase(name)) {
			bp_ship_lt(value);
			return;
		}
		if ($xfr_lt.equalsIgnoreCase(name)) {
			xfr_lt(value);
			return;
		}
		if ($ship_lt.equalsIgnoreCase(name)) {
			ship_lt(value);
			return;
		}
		if ($dmnd_date_div_mons.equalsIgnoreCase(name)) {
			dmnd_date_div_mons(value);
			return;
		}
		if ($dmnd_upd_cntr.equalsIgnoreCase(name)) {
			dmnd_upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($bp_ship_lt.equalsIgnoreCase(name)) {
			bp_ship_lt(value);
			return;
		}
		if ($xfr_lt.equalsIgnoreCase(name)) {
			xfr_lt(value);
			return;
		}
		if ($ship_lt.equalsIgnoreCase(name)) {
			ship_lt(value);
			return;
		}
		if ($dmnd_date_div_mons.equalsIgnoreCase(name)) {
			dmnd_date_div_mons(value);
			return;
		}
		if ($dmnd_upd_cntr.equalsIgnoreCase(name)) {
			dmnd_upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($bp_ship_lt.equalsIgnoreCase(name)) {
			bp_ship_lt(value);
			return;
		}
		if ($xfr_lt.equalsIgnoreCase(name)) {
			xfr_lt(value);
			return;
		}
		if ($ship_lt.equalsIgnoreCase(name)) {
			ship_lt(value);
			return;
		}
		if ($dmnd_date_div_mons.equalsIgnoreCase(name)) {
			dmnd_date_div_mons(value);
			return;
		}
		if ($dmnd_upd_cntr.equalsIgnoreCase(name)) {
			dmnd_upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($dmnd_st_dt.equalsIgnoreCase(name)) {
			dmnd_st_dt(value);
			return;
		}
		if ($dmnd_end_dt.equalsIgnoreCase(name)) {
			dmnd_end_dt(value);
			return;
		}
		if ($dmnd_dt.equalsIgnoreCase(name)) {
			dmnd_dt(value);
			return;
		}
		if ($dlv_schd_st_dt.equalsIgnoreCase(name)) {
			dlv_schd_st_dt(value);
			return;
		}
		if ($dlv_schd_end_dt.equalsIgnoreCase(name)) {
			dlv_schd_end_dt(value);
			return;
		}
		if ($ym.equalsIgnoreCase(name)) {
			ym(value);
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
		if ($dly_div_flg.equalsIgnoreCase(name)) {
			dly_div_flg(value);
			return;
		}
		if ($non_dmnd_lt_flg.equalsIgnoreCase(name)) {
			non_dmnd_lt_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}

	public MCRow getInnerRow(String name) {
		if ($itm_p.equalsIgnoreCase(name)) {
			return itm_p();
		}
		if ($input_qty_p.equalsIgnoreCase(name)) {
			return input_qty_p();
		}
		if ($dmnd_qty_p.equalsIgnoreCase(name)) {
			return dmnd_qty_p();
		}
		if ($rec_qty_p.equalsIgnoreCase(name)) {
			return rec_qty_p();
		}
		if ($dmnd_usr_dpt_p.equalsIgnoreCase(name)) {
			return dmnd_usr_dpt_p();
		}
		if ($sno_wrk_no_p.equalsIgnoreCase(name)) {
			return sno_wrk_no_p();
		}
		if ($rts_msg_p.equalsIgnoreCase(name)) {
			return rts_msg_p();
		}
		if ($itm_grp_p.equalsIgnoreCase(name)) {
			return itm_grp_p();
		}
		if ($dlv_grp_p.equalsIgnoreCase(name)) {
			return dlv_grp_p();
		}
		if ($cst_grp_p.equalsIgnoreCase(name)) {
			return cst_grp_p();
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
		if ($input_qty_p.equalsIgnoreCase(name)) {
			input_qty_p(
				((MCContainerMeta) input_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($dmnd_qty_p.equalsIgnoreCase(name)) {
			dmnd_qty_p(
				((MCContainerMeta) dmnd_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($rec_qty_p.equalsIgnoreCase(name)) {
			rec_qty_p(
				((MCContainerMeta) rec_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($dmnd_usr_dpt_p.equalsIgnoreCase(name)) {
			dmnd_usr_dpt_p(
				((MCContainerMeta) dmnd_usr_dpt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5230.UsrDptR.class, value)
			);
			return;
		}
		if ($sno_wrk_no_p.equalsIgnoreCase(name)) {
			sno_wrk_no_p(
				((MCContainerMeta) sno_wrk_no_p_META).castInnerRow(mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.class, value)
			);
			return;
		}
		if ($rts_msg_p.equalsIgnoreCase(name)) {
			rts_msg_p(
				((MCContainerMeta) rts_msg_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5310.RtnMsgR.class, value)
			);
			return;
		}
		if ($itm_grp_p.equalsIgnoreCase(name)) {
			itm_grp_p(
				((MCContainerMeta) itm_grp_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5170.ItmGrpR.class, value)
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
	 * Entry qty. 登録数量.<p>
	 *
	 */
	public MCNumber input_qty() {
		return input_qty_p().qty();
	}

	/**
	 * Entry qty. 登録数量.<p>
	 *
	 */
	public void input_qty(MCNumber value) {
		input_qty_p().qty(value);
	}

	/**
	 * Entry qty. 登録数量.<p>
	 *
	 */
	public void input_qty(int value) {
		input_qty_p().qty(value);
	}

	/**
	 * Entry qty. 登録数量.<p>
	 *
	 */
	public void input_qty(long value) {
		input_qty_p().qty(value);
	}

	/**
	 * Entry qty. 登録数量.<p>
	 *
	 */
	public void input_qty(float value) {
		input_qty_p().qty(value);
	}

	/**
	 * Entry qty. 登録数量.<p>
	 *
	 */
	public void input_qty(double value) {
		input_qty_p().qty(value);
	}

	/**
	 * Demand qty. 需要数量.<p>
	 *
	 */
	public MCNumber dmnd_qty() {
		return dmnd_qty_p().qty();
	}

	/**
	 * Demand qty. 需要数量.<p>
	 *
	 */
	public void dmnd_qty(MCNumber value) {
		dmnd_qty_p().qty(value);
	}

	/**
	 * Demand qty. 需要数量.<p>
	 *
	 */
	public void dmnd_qty(int value) {
		dmnd_qty_p().qty(value);
	}

	/**
	 * Demand qty. 需要数量.<p>
	 *
	 */
	public void dmnd_qty(long value) {
		dmnd_qty_p().qty(value);
	}

	/**
	 * Demand qty. 需要数量.<p>
	 *
	 */
	public void dmnd_qty(float value) {
		dmnd_qty_p().qty(value);
	}

	/**
	 * Demand qty. 需要数量.<p>
	 *
	 */
	public void dmnd_qty(double value) {
		dmnd_qty_p().qty(value);
	}

	/**
	 * Matching qty. 消込数量.<p>
	 *
	 */
	public MCNumber rec_qty() {
		return rec_qty_p().qty();
	}

	/**
	 * Matching qty. 消込数量.<p>
	 *
	 */
	public void rec_qty(MCNumber value) {
		rec_qty_p().qty(value);
	}

	/**
	 * Matching qty. 消込数量.<p>
	 *
	 */
	public void rec_qty(int value) {
		rec_qty_p().qty(value);
	}

	/**
	 * Matching qty. 消込数量.<p>
	 *
	 */
	public void rec_qty(long value) {
		rec_qty_p().qty(value);
	}

	/**
	 * Matching qty. 消込数量.<p>
	 *
	 */
	public void rec_qty(float value) {
		rec_qty_p().qty(value);
	}

	/**
	 * Matching qty. 消込数量.<p>
	 *
	 */
	public void rec_qty(double value) {
		rec_qty_p().qty(value);
	}

	/**
	 * PIC cd. 担当者ＣＤ.<p>
	 *
	 */
	public String dmnd_usr_cd() {
		return dmnd_usr_dpt_p().usr_cd();
	}

	/**
	 * PIC cd. 担当者ＣＤ.<p>
	 *
	 */
	public void dmnd_usr_cd(String value) {
		dmnd_usr_dpt_p().usr_cd(value);
	}

	/**
	 * PIC name 担当者名.<p>
	 *
	 */
	public String dmnd_usr_nm() {
		return dmnd_usr_dpt_p().usr_nm();
	}

	/**
	 * PIC name 担当者名.<p>
	 *
	 */
	public void dmnd_usr_nm(String value) {
		dmnd_usr_dpt_p().usr_nm(value);
	}

	/**
	 * Demand source dept. cd. 需要元部門ＣＤ.<p>
	 *
	 */
	public String dmnd_dpt_cd() {
		return dmnd_usr_dpt_p().dpt_cd();
	}

	/**
	 * Demand source dept. cd. 需要元部門ＣＤ.<p>
	 *
	 */
	public void dmnd_dpt_cd(String value) {
		dmnd_usr_dpt_p().dpt_cd(value);
	}

	/**
	 * Demand source dept. name 需要元部門名.<p>
	 *
	 */
	public String dmnd_dpt_nm() {
		return dmnd_usr_dpt_p().dpt_nm();
	}

	/**
	 * Demand source dept. name 需要元部門名.<p>
	 *
	 */
	public void dmnd_dpt_nm(String value) {
		dmnd_usr_dpt_p().dpt_nm(value);
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

	public String rtn_sts_typ() {
		return rts_msg_p().rtn_sts_typ();
	}

	public void rtn_sts_typ(String value) {
		rts_msg_p().rtn_sts_typ(value);
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

}

