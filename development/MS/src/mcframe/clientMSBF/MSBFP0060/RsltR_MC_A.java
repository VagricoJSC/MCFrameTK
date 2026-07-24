package mcframe.clientMSBF.MSBFP0060;

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
	 * Inspection status type 検査状況区分.<p>
	 *
	 */
	public static final String $insp_sts_typ = "insp_sts_typ";
	/**
	 * Inspection status type name 検査状況区分名.<p>
	 *
	 */
	public static final String $insp_sts_typ_nm = "insp_sts_typ_nm";
	/**
	 * Inspection approval status type 検査承認状況区分.<p>
	 *
	 */
	public static final String $insp_aprv_sts_typ = "insp_aprv_sts_typ";
	/**
	 * Inspection approval status type name 検査承認状況区分名.<p>
	 *
	 */
	public static final String $insp_aprv_sts_typ_nm = "insp_aprv_sts_typ_nm";
	public static final String $itm_p = "itm_p";
	/**
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public static final String $lot_no = "lot_no";
	/**
	 * Sublot No. サブロットＮＯ.<p>
	 *
	 */
	public static final String $sublot_no = "sublot_no";
	/**
	 * Version No. 版ＮＯ.<p>
	 *
	 */
	public static final String $ver_no = "ver_no";
	/**
	 * Inspection No. 検査ＮＯ.<p>
	 *
	 */
	public static final String $insp_no = "insp_no";
	/**
	 * Inspection result No. 検査実績ＮＯ.<p>
	 *
	 */
	public static final String $insp_act_no = "insp_act_no";
	/**
	 * Number of inspections 検査回数.<p>
	 *
	 */
	public static final String $insp_freq = "insp_freq";
	/**
	 * Inspection method type 検査方法区分.<p>
	 *
	 */
	public static final String $insp_mtd_typ = "insp_mtd_typ";
	/**
	 * Inspection method type name 検査方法区分名.<p>
	 *
	 */
	public static final String $insp_mtd_typ_nm = "insp_mtd_typ_nm";
	/**
	 * Inspection classification type 検査種類区分.<p>
	 *
	 */
	public static final String $insp_typ = "insp_typ";
	/**
	 * Inspection classification type name 検査種類区分名.<p>
	 *
	 */
	public static final String $insp_typ_nm = "insp_typ_nm";
	/**
	 * Inspection pattern cd. 検査パタンＣＤ.<p>
	 *
	 */
	public static final String $insp_ptn_cd = "insp_ptn_cd";
	/**
	 * Inspection pattern name 検査パタン名.<p>
	 *
	 */
	public static final String $insp_ptn_nm = "insp_ptn_nm";
	public static final String $inst_pack_unit_qty_p = "inst_pack_unit_qty_p";
	/**
	 * SKU cd. 荷姿単位ＣＤ.<p>
	 *
	 */
	public static final String $inst_pack_unit_cd = "inst_pack_unit_cd";
	/**
	 * SKU name 荷姿単位名.<p>
	 *
	 */
	public static final String $inst_pack_unit_nm = "inst_pack_unit_nm";
	/**
	 * SKU number of decimal places 荷姿単位小数部有効桁数.<p>
	 *
	 */
	public static final String $inst_pack_unit_dec_place = "inst_pack_unit_dec_place";
	public static final String $inst_base_unit_qty_p = "inst_base_unit_qty_p";
	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public static final String $inst_base_unit_cd = "inst_base_unit_cd";
	/**
	 * Base unit name 基準単位名.<p>
	 *
	 */
	public static final String $inst_base_unit_nm = "inst_base_unit_nm";
	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public static final String $inst_base_unit_dec_place = "inst_base_unit_dec_place";
	/**
	 * Base unit rounding type 基準単位端数処理区分.<p>
	 *
	 */
	public static final String $inst_base_unit_rnd_typ = "inst_base_unit_rnd_typ";
	public static final String $act_ttl_qty_p = "act_ttl_qty_p";
	/**
	 * For specific inspection 規格検査対象.<p>
	 *
	 */
	public static final String $std_insp_flg = "std_insp_flg";
	/**
	 * Specific inspection required 規格検査必須.<p>
	 *
	 */
	public static final String $std_req_flg = "std_req_flg";
	/**
	 * Specific inspection confirmation required 規格検査確認必須.<p>
	 *
	 */
	public static final String $std_cnf_req_flg = "std_cnf_req_flg";
	/**
	 * Specific inspection input 規格検査入力済.<p>
	 *
	 */
	public static final String $std_cmpl_flg = "std_cmpl_flg";
	/**
	 * Specific inspection confirmed 規格検査確認済.<p>
	 *
	 */
	public static final String $std_cnf_cmpl_flg = "std_cnf_cmpl_flg";
	/**
	 * Specific inspection column qty. 規格検査項目数.<p>
	 *
	 */
	public static final String $std_insp_point_cnt = "std_insp_point_cnt";
	/**
	 * Specific inspection completed qty. 規格検査完了数.<p>
	 *
	 */
	public static final String $std_insp_cmpl_cnt = "std_insp_cmpl_cnt";
	/**
	 * Specific inspection confirmation qty. 規格検査確認数.<p>
	 *
	 */
	public static final String $std_insp_cnf_cmpl_cnt = "std_insp_cnf_cmpl_cnt";
	/**
	 * Order date 指図日.<p>
	 *
	 */
	public static final String $inst_dt = "inst_dt";
	public static final String $inst_st_dt_p = "inst_st_dt_p";
	public static final String $inst_end_dt_p = "inst_end_dt_p";
	public static final String $st_dt_p = "st_dt_p";
	public static final String $end_dt_p = "end_dt_p";
	/**
	 * Decision result type 判定結果区分.<p>
	 *
	 */
	public static final String $insp_judg_rslt_typ = "insp_judg_rslt_typ";
	/**
	 * Decision result type name 判定結果区分名.<p>
	 *
	 */
	public static final String $insp_judg_rslt_typ_nm = "insp_judg_rslt_typ_nm";
	public static final String $rem_base_unit_qty_p = "rem_base_unit_qty_p";
	public static final String $good_qty_p = "good_qty_p";
	public static final String $dfct_qty_p = "dfct_qty_p";
	/**
	 * Conforming type 良品区分.<p>
	 *
	 */
	public static final String $quality_typ = "quality_typ";
	/**
	 * Conforming type name 良品区分名.<p>
	 *
	 */
	public static final String $quality_typ_nm = "quality_typ_nm";
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
	 * Defective reason cd. 不良理由ＣＤ.<p>
	 *
	 */
	public static final String $dfct_rsn_cd = "dfct_rsn_cd";
	/**
	 * Defective reason name 不良理由名.<p>
	 *
	 */
	public static final String $dfct_rsn_nm = "dfct_rsn_nm";
	public static final String $act_usr_cd_p = "act_usr_cd_p";
	/**
	 * Decision date 判定日.<p>
	 *
	 */
	public static final String $judg_dt = "judg_dt";
	public static final String $judg_usr_cd_p = "judg_usr_cd_p";
	public static final String $judg_rsn_p = "judg_rsn_p";
	public static final String $smpl_inst_qty_p = "smpl_inst_qty_p";
	/**
	 * Sampling order unit cd. 抜取指図単位ＣＤ.<p>
	 *
	 */
	public static final String $smpl_inst_unit_cd = "smpl_inst_unit_cd";
	/**
	 * Sampling order unit name 抜取指図単位名.<p>
	 *
	 */
	public static final String $smpl_inst_unit_nm = "smpl_inst_unit_nm";
	/**
	 * Sampling order unit number of decimal places 抜取指図単位小数部有効桁数.<p>
	 *
	 */
	public static final String $smpl_inst_unit_dec_place = "smpl_inst_unit_dec_place";
	public static final String $std_cont_fctr_p = "std_cont_fctr_p";
	public static final String $act_cont_fctr_p = "act_cont_fctr_p";
	/**
	 * Expiration date update 有効期限更新.<p>
	 *
	 */
	public static final String $vld_dt_upd_flg = "vld_dt_upd_flg";
	/**
	 * Valid period 有効期間.<p>
	 *
	 */
	public static final String $vld_pd = "vld_pd";
	/**
	 * Period until expiration 使用期間.<p>
	 *
	 */
	public static final String $lmt_pd = "lmt_pd";
	/**
	 * Period calculation type 期間計算区分.<p>
	 *
	 */
	public static final String $calc_pd_typ = "calc_pd_typ";
	/**
	 * Period calculation type name 期間計算区分名.<p>
	 *
	 */
	public static final String $calc_pd_typ_nm = "calc_pd_typ_nm";
	/**
	 * Expiration base date type 期限起算日区分.<p>
	 *
	 */
	public static final String $lmt_dt_frm_typ = "lmt_dt_frm_typ";
	/**
	 * Expiration base date type name 期限起算日区分名.<p>
	 *
	 */
	public static final String $lmt_dt_frm_typ_nm = "lmt_dt_frm_typ_nm";
	/**
	 * For expiration management 期限管理対象.<p>
	 *
	 */
	public static final String $lmt_ctl_flg = "lmt_ctl_flg";
	/**
	 * Expiration management type 期限管理種別.<p>
	 *
	 */
	public static final String $lmt_ctl_categ = "lmt_ctl_categ";
	/**
	 * Base date 起算日.<p>
	 *
	 */
	public static final String $lmt_dt_frm = "lmt_dt_frm";
	/**
	 * Current expiration date 現有効期限.<p>
	 *
	 */
	public static final String $vld_dt_now = "vld_dt_now";
	/**
	 * Expiration date 有効期限.<p>
	 *
	 */
	public static final String $vld_dt = "vld_dt";
	/**
	 * Current usage expiration date 現使用期限.<p>
	 *
	 */
	public static final String $lmt_dt_now = "lmt_dt_now";
	/**
	 * Usage expiration date 使用期限.<p>
	 *
	 */
	public static final String $lmt_dt = "lmt_dt";
	/**
	 * Specific inspection No. 規格書ＮＯ.<p>
	 *
	 */
	public static final String $insp_std_no = "insp_std_no";
	/**
	 * Re-inspection for expiration 期限再検査.<p>
	 *
	 */
	public static final String $lmt_up_flg = "lmt_up_flg";
	/**
	 * Allow inspecting usage 検査中使用許可.<p>
	 *
	 */
	public static final String $in_prmt_insp_flg = "in_prmt_insp_flg";
	/**
	 * Result internal remarks 実績内部備考.<p>
	 *
	 */
	public static final String $act_intr_rmrks = "act_intr_rmrks";
	/**
	 * Lot remarks ロット備考.<p>
	 *
	 */
	public static final String $lot_rmrks = "lot_rmrks";
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
	 * Factory/Distribution warehouse cd. 工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public static final String $to_site_cd = "to_site_cd";
	/**
	 * Factory/Distribution warehouse name 工場・物流倉庫名.<p>
	 *
	 */
	public static final String $to_site_nm = "to_site_nm";
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
	 * Vendor lot No. 業者ロットＮＯ.<p>
	 *
	 */
	public static final String $bp_lot_no = "bp_lot_no";
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
	 * Storage location cd. 格納場所ＣＤ.<p>
	 *
	 */
	public static final String $loc_cd = "loc_cd";
	/**
	 * Inspection implementation unit type 検査実施単位区分.<p>
	 *
	 */
	public static final String $insp_bind_typ = "insp_bind_typ";
	/**
	 * Inspection implementation unit type name 検査実施単位区分名.<p>
	 *
	 */
	public static final String $insp_bind_typ_nm = "insp_bind_typ_nm";
	/**
	 * Inspection report printed date and time 検査成績書発行日時.<p>
	 *
	 */
	public static final String $insp_rslt_prnt_tm = "insp_rslt_prnt_tm";
	/**
	 * Inspection report printed 検査成績書発行済.<p>
	 *
	 */
	public static final String $insp_rslt_prnt_flg = "insp_rslt_prnt_flg";
	/**
	 * Source No. 1 作成元ＮＯ１.<p>
	 *
	 */
	public static final String $src_no1 = "src_no1";
	/**
	 * Source No. 2 作成元ＮＯ２.<p>
	 *
	 */
	public static final String $src_no2 = "src_no2";
	/**
	 * LIMS ＬＩＭＳ.<p>
	 *
	 */
	public static final String $lims_flg = "lims_flg";
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
	 * External inspection result No. 外部検査実績ＮＯ.<p>
	 *
	 */
	public static final String $ext_insp_act_no = "ext_insp_act_no";
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
	 * Inspection order update counter 検査指図更新カウンタ.<p>
	 *
	 */
	public static final String $inst_upd_cntr = "inst_upd_cntr";
	/**
	 * Inspection result update counter 検査実績更新カウンタ.<p>
	 *
	 */
	public static final String $act_upd_cntr = "act_upd_cntr";
	/**
	 * For active ingredient 有効成分対象.<p>
	 *
	 */
	public static final String $cont_fctr_flg = "cont_fctr_flg";
	/**
	 * With specific inspection rejected flg. 規格検査不合格有りＦＬＧ.<p>
	 *
	 */
	public static final String $std_insp_ng_flg = "std_insp_ng_flg";
	/**
	 * With specific inspection concession flg. 規格検査特採有りＦＬＧ.<p>
	 *
	 */
	public static final String $std_insp_sp_flg = "std_insp_sp_flg";

	public static final String $itm_cd = $itm_p + ".itm_cd";
	public static final String $itm_sub1 = $itm_p + ".itm_sub1";
	public static final String $itm_sub2 = $itm_p + ".itm_sub2";
	public static final String $itm_sub3 = $itm_p + ".itm_sub3";
	public static final String $itm_nm = $itm_p + ".itm_nm";
	public static final String $inst_pack_unit_qty = $inst_pack_unit_qty_p + ".qty";
	public static final String $inst_base_unit_qty = $inst_base_unit_qty_p + ".qty";
	public static final String $act_ttl_qty = $act_ttl_qty_p + ".qty";
	public static final String $inst_st_dt = $inst_st_dt_p + ".ymd";
	public static final String $inst_st_hm = $inst_st_dt_p + ".hm";
	public static final String $inst_end_dt = $inst_end_dt_p + ".ymd";
	public static final String $inst_end_hm = $inst_end_dt_p + ".hm";
	public static final String $st_dt = $st_dt_p + ".ymd";
	public static final String $st_hm = $st_dt_p + ".hm";
	public static final String $end_dt = $end_dt_p + ".ymd";
	public static final String $end_hm = $end_dt_p + ".hm";
	public static final String $rem_base_unit_qty = $rem_base_unit_qty_p + ".qty";
	public static final String $good_qty = $good_qty_p + ".qty";
	public static final String $dfct_qty = $dfct_qty_p + ".qty";
	public static final String $act_usr_cd = $act_usr_cd_p + ".usr_cd";
	public static final String $act_usr_nm = $act_usr_cd_p + ".usr_nm";
	public static final String $act_dpt_cd = $act_usr_cd_p + ".dpt_cd";
	public static final String $act_dpt_nm = $act_usr_cd_p + ".dpt_nm";
	public static final String $judg_usr_cd = $judg_usr_cd_p + ".usr_cd";
	public static final String $judg_usr_nm = $judg_usr_cd_p + ".usr_nm";
	public static final String $judg_dpt_cd = $judg_usr_cd_p + ".dpt_cd";
	public static final String $judg_dpt_nm = $judg_usr_cd_p + ".dpt_nm";
	public static final String $judg_rsn = $judg_rsn_p + ".txt";
	public static final String $smpl_inst_qty = $smpl_inst_qty_p + ".qty";
	public static final String $std_cont_fctr = $std_cont_fctr_p + ".std_cont_fctr";
	public static final String $act_cont_fctr = $act_cont_fctr_p + ".act_cont_fctr";
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
	public static final MCMeta insp_sts_typ_META = createCommonMeta($insp_sts_typ, mcframe.commonMS.meta.MS_META.INSP_STS_TYP);
	public static final MCMeta insp_sts_typ_nm_META = createCommonMeta($insp_sts_typ_nm, mcframe.commonMS.meta.MS_META.INSP_STS_TYP_NM);
	public static final MCMeta insp_aprv_sts_typ_META = createCommonMeta($insp_aprv_sts_typ, mcframe.commonMS.meta.MS_META.INSP_APRV_STS_TYP);
	public static final MCMeta insp_aprv_sts_typ_nm_META = createCommonMeta($insp_aprv_sts_typ_nm, mcframe.commonMS.meta.MS_META.INSP_APRV_STS_TYP_NM);
	public static final MCMeta itm_p_META = createInnerRowMeta($itm_p, mcframe.clientMAUB.MAUBP5030.ItmR.class);
	public static final MCMeta lot_no_META = createCommonMeta($lot_no, mcframe.commonMA.meta.MA_META.LOT_NO);
	public static final MCMeta sublot_no_META = createCommonMeta($sublot_no, mcframe.commonMA.meta.MA_META.SUBLOT_NO);
	public static final MCMeta ver_no_META = createCommonMeta($ver_no, mcframe.commonMA.meta.MA_META.VER_NO);
	public static final MCMeta insp_no_META = createCommonMeta($insp_no, mcframe.commonMA.meta.MA_META.INSP_NO);
	public static final MCMeta insp_act_no_META = createCommonMeta($insp_act_no, mcframe.commonMA.meta.MA_META.INSP_ACT_NO);
	public static final MCMeta insp_freq_META = createCommonMeta($insp_freq, mcframe.commonMS.meta.MS_META.INSP_FREQ);
	public static final MCMeta insp_mtd_typ_META = createCommonMeta($insp_mtd_typ, mcframe.commonMA.meta.MA_META.INSP_MTD_TYP);
	public static final MCMeta insp_mtd_typ_nm_META = createCommonMeta($insp_mtd_typ_nm, mcframe.commonMA.meta.MA_META.INSP_MTD_TYP_NM);
	public static final MCMeta insp_typ_META = createCommonMeta($insp_typ, mcframe.commonMS.meta.MS_META.INSP_TYP);
	public static final MCMeta insp_typ_nm_META = createCommonMeta($insp_typ_nm, mcframe.commonMS.meta.MS_META.INSP_TYP_NM);
	public static final MCMeta insp_ptn_cd_META = createCommonMeta($insp_ptn_cd, mcframe.commonMA.meta.MA_META.INSP_PTN_CD);
	public static final MCMeta insp_ptn_nm_META = createCommonMeta($insp_ptn_nm, mcframe.commonMA.meta.MA_META.INSP_PTN_NM);
	public static final MCMeta inst_pack_unit_qty_p_META = createInnerRowMeta($inst_pack_unit_qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta inst_pack_unit_cd_META = createCommonMeta($inst_pack_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta inst_pack_unit_nm_META = createCommonMeta($inst_pack_unit_nm, mcframe.commonMA.meta.MA_META.UNIT_NM);
	public static final MCMeta inst_pack_unit_dec_place_META = createCommonMeta($inst_pack_unit_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta inst_base_unit_qty_p_META = createInnerRowMeta($inst_base_unit_qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta inst_base_unit_cd_META = createCommonMeta($inst_base_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta inst_base_unit_nm_META = createCommonMeta($inst_base_unit_nm, mcframe.commonMA.meta.MA_META.UNIT_NM);
	public static final MCMeta inst_base_unit_dec_place_META = createCommonMeta($inst_base_unit_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta inst_base_unit_rnd_typ_META = createCommonMeta($inst_base_unit_rnd_typ, mcframe.commonMA.meta.MA_META.RND_TYP);
	public static final MCMeta act_ttl_qty_p_META = createInnerRowMeta($act_ttl_qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta std_insp_flg_META = createCommonMeta($std_insp_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta std_req_flg_META = createCommonMeta($std_req_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta std_cnf_req_flg_META = createCommonMeta($std_cnf_req_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta std_cmpl_flg_META = createCommonMeta($std_cmpl_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta std_cnf_cmpl_flg_META = createCommonMeta($std_cnf_cmpl_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta std_insp_point_cnt_META = createCommonMeta($std_insp_point_cnt, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta std_insp_cmpl_cnt_META = createCommonMeta($std_insp_cmpl_cnt, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta std_insp_cnf_cmpl_cnt_META = createCommonMeta($std_insp_cnf_cmpl_cnt, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta inst_dt_META = createCommonMeta($inst_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta inst_st_dt_p_META = createInnerRowMeta($inst_st_dt_p, mcframe.clientMAUB.MAUBP5320.YmdHmR.class);
	public static final MCMeta inst_end_dt_p_META = createInnerRowMeta($inst_end_dt_p, mcframe.clientMAUB.MAUBP5320.YmdHmR.class);
	public static final MCMeta st_dt_p_META = createInnerRowMeta($st_dt_p, mcframe.clientMAUB.MAUBP5320.YmdHmR.class);
	public static final MCMeta end_dt_p_META = createInnerRowMeta($end_dt_p, mcframe.clientMAUB.MAUBP5320.YmdHmR.class);
	public static final MCMeta insp_judg_rslt_typ_META = createCommonMeta($insp_judg_rslt_typ, mcframe.commonMS.meta.MS_META.INSP_JUDG_RSLT_TYP);
	public static final MCMeta insp_judg_rslt_typ_nm_META = createCommonMeta($insp_judg_rslt_typ_nm, mcframe.commonMS.meta.MS_META.INSP_JUDG_RSLT_TYP_NM);
	public static final MCMeta rem_base_unit_qty_p_META = createInnerRowMeta($rem_base_unit_qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta good_qty_p_META = createInnerRowMeta($good_qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta dfct_qty_p_META = createInnerRowMeta($dfct_qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta quality_typ_META = createCommonMeta($quality_typ, mcframe.commonMA.meta.MA_META.QUALITY_TYP);
	public static final MCMeta quality_typ_nm_META = createCommonMeta($quality_typ_nm, mcframe.commonMA.meta.MA_META.QUALITY_TYP_NM);
	public static final MCMeta gd_cd_META = createCommonMeta($gd_cd, mcframe.commonMA.meta.MA_META.STK_GD_CD);
	public static final MCMeta gd_nm_META = createCommonMeta($gd_nm, mcframe.commonMA.meta.MA_META.STK_GD_NM);
	public static final MCMeta dfct_rsn_cd_META = createCommonMeta($dfct_rsn_cd, mcframe.commonMA.meta.MA_META.BIZ_RSN_CD);
	public static final MCMeta dfct_rsn_nm_META = createCommonMeta($dfct_rsn_nm, mcframe.commonMA.meta.MA_META.BIZ_RSN_NM);
	public static final MCMeta act_usr_cd_p_META = createInnerRowMeta($act_usr_cd_p, mcframe.clientMAUB.MAUBP5230.UsrDptR.class);
	public static final MCMeta judg_dt_META = createCommonMeta($judg_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta judg_usr_cd_p_META = createInnerRowMeta($judg_usr_cd_p, mcframe.clientMAUB.MAUBP5230.UsrDptR.class);
	public static final MCMeta judg_rsn_p_META = createInnerRowMeta($judg_rsn_p, mcframe.clientMAUB.MAUBP5370.TxtR.class);
	public static final MCMeta smpl_inst_qty_p_META = createInnerRowMeta($smpl_inst_qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta smpl_inst_unit_cd_META = createCommonMeta($smpl_inst_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta smpl_inst_unit_nm_META = createCommonMeta($smpl_inst_unit_nm, mcframe.commonMA.meta.MA_META.UNIT_NM);
	public static final MCMeta smpl_inst_unit_dec_place_META = createCommonMeta($smpl_inst_unit_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta std_cont_fctr_p_META = createInnerRowMeta($std_cont_fctr_p, mcframe.clientMAUB.MAUBP5280.StdContFctrR.class);
	public static final MCMeta act_cont_fctr_p_META = createInnerRowMeta($act_cont_fctr_p, mcframe.clientMAUB.MAUBP5290.ActContFctrR.class);
	public static final MCMeta vld_dt_upd_flg_META = createCommonMeta($vld_dt_upd_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta vld_pd_META = createCommonMeta($vld_pd, mcframe.commonMA.meta.MA_META.VLD_PD);
	public static final MCMeta lmt_pd_META = createCommonMeta($lmt_pd, mcframe.commonMA.meta.MA_META.LMT_PD);
	public static final MCMeta calc_pd_typ_META = createCommonMeta($calc_pd_typ, mcframe.commonMA.meta.MA_META.CALC_PD_TYP);
	public static final MCMeta calc_pd_typ_nm_META = createCommonMeta($calc_pd_typ_nm, mcframe.commonMA.meta.MA_META.CALC_PD_TYP_NM);
	public static final MCMeta lmt_dt_frm_typ_META = createCommonMeta($lmt_dt_frm_typ, mcframe.commonMA.meta.MA_META.LMT_DT_FRM_TYP);
	public static final MCMeta lmt_dt_frm_typ_nm_META = createCommonMeta($lmt_dt_frm_typ_nm, mcframe.commonMA.meta.MA_META.LMT_DT_FRM_TYP_NM);
	public static final MCMeta lmt_ctl_flg_META = createCommonMeta($lmt_ctl_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta lmt_ctl_categ_META = createCommonMeta($lmt_ctl_categ, mcframe.commonMA.meta.MA_META.LMT_CTL_CATEG);
	public static final MCMeta lmt_dt_frm_META = createCommonMeta($lmt_dt_frm, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta vld_dt_now_META = createCommonMeta($vld_dt_now, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta vld_dt_META = createCommonMeta($vld_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta lmt_dt_now_META = createCommonMeta($lmt_dt_now, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta lmt_dt_META = createCommonMeta($lmt_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta insp_std_no_META = createCommonMeta($insp_std_no, mcframe.commonMA.meta.MA_META.INSP_STD_NO);
	public static final MCMeta lmt_up_flg_META = createCommonMeta($lmt_up_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta in_prmt_insp_flg_META = createCommonMeta($in_prmt_insp_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta act_intr_rmrks_META = createCommonMeta($act_intr_rmrks, mcframe.commonMS.meta.MS_META.INSP_ACT_INTR_RMRKS);
	public static final MCMeta lot_rmrks_META = createCommonMeta($lot_rmrks, mcframe.commonMS.meta.MS_META.LOT_RMRKS);
	public static final MCMeta sub_char1_META = createCommonMeta($sub_char1, mcframe.commonMS.meta.MS_META.INSP_ACT_SUB_CHAR1);
	public static final MCMeta sub_char2_META = createCommonMeta($sub_char2, mcframe.commonMS.meta.MS_META.INSP_ACT_SUB_CHAR2);
	public static final MCMeta sub_char3_META = createCommonMeta($sub_char3, mcframe.commonMS.meta.MS_META.INSP_ACT_SUB_CHAR3);
	public static final MCMeta to_site_cd_META = createCommonMeta($to_site_cd, mcframe.commonMA.meta.MA_META.SITE_CD);
	public static final MCMeta to_site_nm_META = createCommonMeta($to_site_nm, mcframe.commonMA.meta.MA_META.SITE_NM);
	public static final MCMeta sppl_cd_META = createCommonMeta($sppl_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta sppl_nm_META = createCommonMeta($sppl_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta maker_cd_META = createCommonMeta($maker_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta maker_nm_META = createCommonMeta($maker_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta bp_lot_no_META = createCommonMeta($bp_lot_no, mcframe.commonMA.meta.MA_META.BP_LOT_NO);
	public static final MCMeta mfg_loc_cd_META = createCommonMeta($mfg_loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta mfg_loc_nm_META = createCommonMeta($mfg_loc_nm, mcframe.commonMA.meta.MA_META.LOC_NM);
	public static final MCMeta loc_cd_META = createCommonMeta($loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta insp_bind_typ_META = createCommonMeta($insp_bind_typ, mcframe.commonMA.meta.MA_META.INSP_BIND_TYP);
	public static final MCMeta insp_bind_typ_nm_META = createCommonMeta($insp_bind_typ_nm, mcframe.commonMA.meta.MA_META.INSP_BIND_TYP_NM);
	public static final MCMeta insp_rslt_prnt_tm_META = createCommonMeta($insp_rslt_prnt_tm, mcframe.commonMA.meta.MA_META.TM);
	public static final MCMeta insp_rslt_prnt_flg_META = createCommonMeta($insp_rslt_prnt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta src_no1_META = createCommonMeta($src_no1, mcframe.commonMA.meta.MA_META.SRC_NO);
	public static final MCMeta src_no2_META = createCommonMeta($src_no2, mcframe.commonMA.meta.MA_META.SRC_NO);
	public static final MCMeta lims_flg_META = createCommonMeta($lims_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta ext_sys_cd_META = createCommonMeta($ext_sys_cd, mcframe.commonMA.meta.MA_META.EXT_SYS_CD);
	public static final MCMeta ext_sys_nm_META = createCommonMeta($ext_sys_nm, mcframe.commonMA.meta.MA_META.EXT_SYS_NM);
	public static final MCMeta ext_insp_act_no_META = createCommonMeta($ext_insp_act_no, mcframe.commonMA.meta.MA_META.EXT_INSP_ACT_NO);
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
	public static final MCMeta inst_upd_cntr_META = createCommonMeta($inst_upd_cntr, mcframe.commonMA.meta.MA_META.UPD_CNT);
	public static final MCMeta act_upd_cntr_META = createCommonMeta($act_upd_cntr, mcframe.commonMA.meta.MA_META.UPD_CNT);
	public static final MCMeta cont_fctr_flg_META = createCommonMeta($cont_fctr_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta std_insp_ng_flg_META = createCommonMeta($std_insp_ng_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta std_insp_sp_flg_META = createCommonMeta($std_insp_sp_flg, mcframe.commonMA.meta.MA_META.FLG);

	protected static final ConstMetaList<RsltR> constMetas = new ConstMetaList<RsltR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			check_META,
			insp_sts_typ_META,
			insp_sts_typ_nm_META,
			insp_aprv_sts_typ_META,
			insp_aprv_sts_typ_nm_META,
			itm_p_META,
			lot_no_META,
			sublot_no_META,
			ver_no_META,
			insp_no_META,
			insp_act_no_META,
			insp_freq_META,
			insp_mtd_typ_META,
			insp_mtd_typ_nm_META,
			insp_typ_META,
			insp_typ_nm_META,
			insp_ptn_cd_META,
			insp_ptn_nm_META,
			inst_pack_unit_qty_p_META,
			inst_pack_unit_cd_META,
			inst_pack_unit_nm_META,
			inst_pack_unit_dec_place_META,
			inst_base_unit_qty_p_META,
			inst_base_unit_cd_META,
			inst_base_unit_nm_META,
			inst_base_unit_dec_place_META,
			inst_base_unit_rnd_typ_META,
			act_ttl_qty_p_META,
			std_insp_flg_META,
			std_req_flg_META,
			std_cnf_req_flg_META,
			std_cmpl_flg_META,
			std_cnf_cmpl_flg_META,
			std_insp_point_cnt_META,
			std_insp_cmpl_cnt_META,
			std_insp_cnf_cmpl_cnt_META,
			inst_dt_META,
			inst_st_dt_p_META,
			inst_end_dt_p_META,
			st_dt_p_META,
			end_dt_p_META,
			insp_judg_rslt_typ_META,
			insp_judg_rslt_typ_nm_META,
			rem_base_unit_qty_p_META,
			good_qty_p_META,
			dfct_qty_p_META,
			quality_typ_META,
			quality_typ_nm_META,
			gd_cd_META,
			gd_nm_META,
			dfct_rsn_cd_META,
			dfct_rsn_nm_META,
			act_usr_cd_p_META,
			judg_dt_META,
			judg_usr_cd_p_META,
			judg_rsn_p_META,
			smpl_inst_qty_p_META,
			smpl_inst_unit_cd_META,
			smpl_inst_unit_nm_META,
			smpl_inst_unit_dec_place_META,
			std_cont_fctr_p_META,
			act_cont_fctr_p_META,
			vld_dt_upd_flg_META,
			vld_pd_META,
			lmt_pd_META,
			calc_pd_typ_META,
			calc_pd_typ_nm_META,
			lmt_dt_frm_typ_META,
			lmt_dt_frm_typ_nm_META,
			lmt_ctl_flg_META,
			lmt_ctl_categ_META,
			lmt_dt_frm_META,
			vld_dt_now_META,
			vld_dt_META,
			lmt_dt_now_META,
			lmt_dt_META,
			insp_std_no_META,
			lmt_up_flg_META,
			in_prmt_insp_flg_META,
			act_intr_rmrks_META,
			lot_rmrks_META,
			sub_char1_META,
			sub_char2_META,
			sub_char3_META,
			to_site_cd_META,
			to_site_nm_META,
			sppl_cd_META,
			sppl_nm_META,
			maker_cd_META,
			maker_nm_META,
			bp_lot_no_META,
			mfg_loc_cd_META,
			mfg_loc_nm_META,
			loc_cd_META,
			insp_bind_typ_META,
			insp_bind_typ_nm_META,
			insp_rslt_prnt_tm_META,
			insp_rslt_prnt_flg_META,
			src_no1_META,
			src_no2_META,
			lims_flg_META,
			ext_sys_cd_META,
			ext_sys_nm_META,
			ext_insp_act_no_META,
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
			inst_upd_cntr_META,
			act_upd_cntr_META,
			cont_fctr_flg_META,
			std_insp_ng_flg_META,
			std_insp_sp_flg_META
		},
		new String[][]{
			{
				"itm_cd",
				"itm_sub1",
				"itm_sub2",
				"itm_sub3",
				"itm_nm",
				"inst_pack_unit_qty",
				"inst_base_unit_qty",
				"act_ttl_qty",
				"inst_st_dt",
				"inst_st_hm",
				"inst_end_dt",
				"inst_end_hm",
				"st_dt",
				"st_hm",
				"end_dt",
				"end_hm",
				"rem_base_unit_qty",
				"good_qty",
				"dfct_qty",
				"act_usr_cd",
				"act_usr_nm",
				"act_dpt_cd",
				"act_dpt_nm",
				"judg_usr_cd",
				"judg_usr_nm",
				"judg_dpt_cd",
				"judg_dpt_nm",
				"judg_rsn",
				"smpl_inst_qty",
				"std_cont_fctr",
				"act_cont_fctr",
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
				$inst_pack_unit_qty,
				$inst_base_unit_qty,
				$act_ttl_qty,
				$inst_st_dt,
				$inst_st_hm,
				$inst_end_dt,
				$inst_end_hm,
				$st_dt,
				$st_hm,
				$end_dt,
				$end_hm,
				$rem_base_unit_qty,
				$good_qty,
				$dfct_qty,
				$act_usr_cd,
				$act_usr_nm,
				$act_dpt_cd,
				$act_dpt_nm,
				$judg_usr_cd,
				$judg_usr_nm,
				$judg_dpt_cd,
				$judg_dpt_nm,
				$judg_rsn,
				$smpl_inst_qty,
				$std_cont_fctr,
				$act_cont_fctr,
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
				{$dfct_rsn_cd, "biz_rsn_nm"},	// dfct_rsn_cd
				{$act_usr_cd_p + ".dpt_cd", "dpt_nm"},	// act_usr_cd_p.dpt_cd
				{$judg_usr_cd_p + ".dpt_cd", "dpt_nm"}	// judg_usr_cd_p.dpt_cd
			}
		)),
		new MCExtMap.Entry($$LIST_IN, new MCExtList(
			new String[][]{
				{$act_usr_cd_p + ".dpt_cd", "st_dt;act_usr_cd;MAC_DPT_IS_SRCH_TYP.INSP"},	// act_usr_cd_p.dpt_cd
				{$judg_usr_cd_p + ".dpt_cd", "judg_usr_cd;judg_dt;MAC_DPT_IS_SRCH_TYP.INSP"}	// judg_usr_cd_p.dpt_cd
			}
		)),
		new MCExtMap.Entry($$LIST_IN_BASE, new MCExtList(
			new String[][]{
				{$act_usr_cd_p + ".dpt_cd", "dt;usr_cd;dpt_is_srch_typ"},	// act_usr_cd_p.dpt_cd
				{$judg_usr_cd_p + ".dpt_cd", "usr_cd;dt;dpt_is_srch_typ"}	// judg_usr_cd_p.dpt_cd
			}
		)),
		new MCExtMap.Entry($$DISP_CTL, new MCExtList(
			new String[][]{
				{$insp_aprv_sts_typ, "MFG_APRV"},	// insp_aprv_sts_typ
				{$insp_aprv_sts_typ_nm, "MFG_APRV"},	// insp_aprv_sts_typ_nm
				{$ver_no, "VER_NO"},	// ver_no
				{$insp_judg_rslt_typ, "MFG_APRV"},	// insp_judg_rslt_typ
				{$insp_judg_rslt_typ_nm, "MFG_APRV"},	// insp_judg_rslt_typ_nm
				{$gd_cd, "STK_GD"},	// gd_cd
				{$gd_nm, "STK_GD"},	// gd_nm
				{$judg_dt, "MFG_APRV"},	// judg_dt
				{$judg_usr_cd_p + ".usr_cd", "MFG_APRV"},	// judg_usr_cd_p.usr_cd
				{$judg_usr_cd_p + ".usr_nm", "MFG_APRV"},	// judg_usr_cd_p.usr_nm
				{$judg_usr_cd_p + ".dpt_cd", "MFG_APRV"},	// judg_usr_cd_p.dpt_cd
				{$judg_usr_cd_p + ".dpt_nm", "MFG_APRV"},	// judg_usr_cd_p.dpt_nm
				{$judg_rsn_p + ".txt", "MFG_APRV"},	// judg_rsn_p.txt
				{$std_cont_fctr_p + ".std_cont_fctr", "CONT_FCTR"},	// std_cont_fctr_p.std_cont_fctr
				{$act_cont_fctr_p + ".act_cont_fctr", "CONT_FCTR"},	// act_cont_fctr_p.act_cont_fctr
				{$in_prmt_insp_flg, "IN_PRMT_INSP"},	// in_prmt_insp_flg
				{$to_site_cd, "SITE"},	// to_site_cd
				{$to_site_nm, "SITE"},	// to_site_nm
				{$maker_cd, "MAKER"},	// maker_cd
				{$maker_nm, "MAKER"}	// maker_nm
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
	 * Inspection status type 検査状況区分.<p>
	 *
	 */
	public String insp_sts_typ() {
		return getConstString(offset + 1, $insp_sts_typ);
	}

	/**
	 * Inspection status type 検査状況区分.<p>
	 *
	 */
	public void insp_sts_typ(String value) {
		setConstString(offset + 1, $insp_sts_typ, value);
	}


	/**
	 * Inspection status type name 検査状況区分名.<p>
	 *
	 */
	public String insp_sts_typ_nm() {
		return getConstString(offset + 2, $insp_sts_typ_nm);
	}

	/**
	 * Inspection status type name 検査状況区分名.<p>
	 *
	 */
	public void insp_sts_typ_nm(String value) {
		setConstString(offset + 2, $insp_sts_typ_nm, value);
	}


	/**
	 * Inspection approval status type 検査承認状況区分.<p>
	 *
	 */
	public String insp_aprv_sts_typ() {
		return getConstString(offset + 3, $insp_aprv_sts_typ);
	}

	/**
	 * Inspection approval status type 検査承認状況区分.<p>
	 *
	 */
	public void insp_aprv_sts_typ(String value) {
		setConstString(offset + 3, $insp_aprv_sts_typ, value);
	}


	/**
	 * Inspection approval status type name 検査承認状況区分名.<p>
	 *
	 */
	public String insp_aprv_sts_typ_nm() {
		return getConstString(offset + 4, $insp_aprv_sts_typ_nm);
	}

	/**
	 * Inspection approval status type name 検査承認状況区分名.<p>
	 *
	 */
	public void insp_aprv_sts_typ_nm(String value) {
		setConstString(offset + 4, $insp_aprv_sts_typ_nm, value);
	}


	public mcframe.clientMAUB.MAUBP5030.ItmR itm_p(){
		return (mcframe.clientMAUB.MAUBP5030.ItmR) getConstInnerRow(offset + 5, $itm_p);
	}
	
	public void itm_p(mcframe.clientMAUB.MAUBP5030.ItmR row){
		setConstInnerRow(offset + 5, $itm_p, row);
	}


	/**
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public String lot_no() {
		return getConstString(offset + 6, $lot_no);
	}

	/**
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public void lot_no(String value) {
		setConstString(offset + 6, $lot_no, value);
	}


	/**
	 * Sublot No. サブロットＮＯ.<p>
	 *
	 */
	public String sublot_no() {
		return getConstString(offset + 7, $sublot_no);
	}

	/**
	 * Sublot No. サブロットＮＯ.<p>
	 *
	 */
	public void sublot_no(String value) {
		setConstString(offset + 7, $sublot_no, value);
	}


	/**
	 * Version No. 版ＮＯ.<p>
	 *
	 */
	public String ver_no() {
		return getConstString(offset + 8, $ver_no);
	}

	/**
	 * Version No. 版ＮＯ.<p>
	 *
	 */
	public void ver_no(String value) {
		setConstString(offset + 8, $ver_no, value);
	}


	/**
	 * Inspection No. 検査ＮＯ.<p>
	 *
	 */
	public String insp_no() {
		return getConstString(offset + 9, $insp_no);
	}

	/**
	 * Inspection No. 検査ＮＯ.<p>
	 *
	 */
	public void insp_no(String value) {
		setConstString(offset + 9, $insp_no, value);
	}


	/**
	 * Inspection result No. 検査実績ＮＯ.<p>
	 *
	 */
	public String insp_act_no() {
		return getConstString(offset + 10, $insp_act_no);
	}

	/**
	 * Inspection result No. 検査実績ＮＯ.<p>
	 *
	 */
	public void insp_act_no(String value) {
		setConstString(offset + 10, $insp_act_no, value);
	}


	/**
	 * Number of inspections 検査回数.<p>
	 *
	 */
	public MCNumber insp_freq() {
		return getConstNumber(offset + 11, $insp_freq);
	}

	/**
	 * Number of inspections 検査回数.<p>
	 *
	 */
	public void insp_freq(MCNumber value) {
		setConstNumber(offset + 11, $insp_freq, value);
	}

	/**
	 * Number of inspections 検査回数.<p>
	 *
	 */
	public void insp_freq(int value) {
		setConstNumber(offset + 11, $insp_freq, value);
	}

	/**
	 * Number of inspections 検査回数.<p>
	 *
	 */
	public void insp_freq(long value) {
		setConstNumber(offset + 11, $insp_freq, value);
	}

	/**
	 * Number of inspections 検査回数.<p>
	 *
	 */
	public void insp_freq(float value) {
		setConstNumber(offset + 11, $insp_freq, value);
	}

	/**
	 * Number of inspections 検査回数.<p>
	 *
	 */
	public void insp_freq(double value) {
		setConstNumber(offset + 11, $insp_freq, value);
	}


	/**
	 * Inspection method type 検査方法区分.<p>
	 *
	 */
	public String insp_mtd_typ() {
		return getConstString(offset + 12, $insp_mtd_typ);
	}

	/**
	 * Inspection method type 検査方法区分.<p>
	 *
	 */
	public void insp_mtd_typ(String value) {
		setConstString(offset + 12, $insp_mtd_typ, value);
	}


	/**
	 * Inspection method type name 検査方法区分名.<p>
	 *
	 */
	public String insp_mtd_typ_nm() {
		return getConstString(offset + 13, $insp_mtd_typ_nm);
	}

	/**
	 * Inspection method type name 検査方法区分名.<p>
	 *
	 */
	public void insp_mtd_typ_nm(String value) {
		setConstString(offset + 13, $insp_mtd_typ_nm, value);
	}


	/**
	 * Inspection classification type 検査種類区分.<p>
	 *
	 */
	public String insp_typ() {
		return getConstString(offset + 14, $insp_typ);
	}

	/**
	 * Inspection classification type 検査種類区分.<p>
	 *
	 */
	public void insp_typ(String value) {
		setConstString(offset + 14, $insp_typ, value);
	}


	/**
	 * Inspection classification type name 検査種類区分名.<p>
	 *
	 */
	public String insp_typ_nm() {
		return getConstString(offset + 15, $insp_typ_nm);
	}

	/**
	 * Inspection classification type name 検査種類区分名.<p>
	 *
	 */
	public void insp_typ_nm(String value) {
		setConstString(offset + 15, $insp_typ_nm, value);
	}


	/**
	 * Inspection pattern cd. 検査パタンＣＤ.<p>
	 *
	 */
	public String insp_ptn_cd() {
		return getConstString(offset + 16, $insp_ptn_cd);
	}

	/**
	 * Inspection pattern cd. 検査パタンＣＤ.<p>
	 *
	 */
	public void insp_ptn_cd(String value) {
		setConstString(offset + 16, $insp_ptn_cd, value);
	}


	/**
	 * Inspection pattern name 検査パタン名.<p>
	 *
	 */
	public String insp_ptn_nm() {
		return getConstString(offset + 17, $insp_ptn_nm);
	}

	/**
	 * Inspection pattern name 検査パタン名.<p>
	 *
	 */
	public void insp_ptn_nm(String value) {
		setConstString(offset + 17, $insp_ptn_nm, value);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR inst_pack_unit_qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 18, $inst_pack_unit_qty_p);
	}
	
	public void inst_pack_unit_qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 18, $inst_pack_unit_qty_p, row);
	}


	/**
	 * SKU cd. 荷姿単位ＣＤ.<p>
	 *
	 */
	public String inst_pack_unit_cd() {
		return getConstString(offset + 19, $inst_pack_unit_cd);
	}

	/**
	 * SKU cd. 荷姿単位ＣＤ.<p>
	 *
	 */
	public void inst_pack_unit_cd(String value) {
		setConstString(offset + 19, $inst_pack_unit_cd, value);
	}


	/**
	 * SKU name 荷姿単位名.<p>
	 *
	 */
	public String inst_pack_unit_nm() {
		return getConstString(offset + 20, $inst_pack_unit_nm);
	}

	/**
	 * SKU name 荷姿単位名.<p>
	 *
	 */
	public void inst_pack_unit_nm(String value) {
		setConstString(offset + 20, $inst_pack_unit_nm, value);
	}


	/**
	 * SKU number of decimal places 荷姿単位小数部有効桁数.<p>
	 *
	 */
	public MCNumber inst_pack_unit_dec_place() {
		return getConstNumber(offset + 21, $inst_pack_unit_dec_place);
	}

	/**
	 * SKU number of decimal places 荷姿単位小数部有効桁数.<p>
	 *
	 */
	public void inst_pack_unit_dec_place(MCNumber value) {
		setConstNumber(offset + 21, $inst_pack_unit_dec_place, value);
	}

	/**
	 * SKU number of decimal places 荷姿単位小数部有効桁数.<p>
	 *
	 */
	public void inst_pack_unit_dec_place(int value) {
		setConstNumber(offset + 21, $inst_pack_unit_dec_place, value);
	}

	/**
	 * SKU number of decimal places 荷姿単位小数部有効桁数.<p>
	 *
	 */
	public void inst_pack_unit_dec_place(long value) {
		setConstNumber(offset + 21, $inst_pack_unit_dec_place, value);
	}

	/**
	 * SKU number of decimal places 荷姿単位小数部有効桁数.<p>
	 *
	 */
	public void inst_pack_unit_dec_place(float value) {
		setConstNumber(offset + 21, $inst_pack_unit_dec_place, value);
	}

	/**
	 * SKU number of decimal places 荷姿単位小数部有効桁数.<p>
	 *
	 */
	public void inst_pack_unit_dec_place(double value) {
		setConstNumber(offset + 21, $inst_pack_unit_dec_place, value);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR inst_base_unit_qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 22, $inst_base_unit_qty_p);
	}
	
	public void inst_base_unit_qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 22, $inst_base_unit_qty_p, row);
	}


	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public String inst_base_unit_cd() {
		return getConstString(offset + 23, $inst_base_unit_cd);
	}

	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public void inst_base_unit_cd(String value) {
		setConstString(offset + 23, $inst_base_unit_cd, value);
	}


	/**
	 * Base unit name 基準単位名.<p>
	 *
	 */
	public String inst_base_unit_nm() {
		return getConstString(offset + 24, $inst_base_unit_nm);
	}

	/**
	 * Base unit name 基準単位名.<p>
	 *
	 */
	public void inst_base_unit_nm(String value) {
		setConstString(offset + 24, $inst_base_unit_nm, value);
	}


	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public MCNumber inst_base_unit_dec_place() {
		return getConstNumber(offset + 25, $inst_base_unit_dec_place);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void inst_base_unit_dec_place(MCNumber value) {
		setConstNumber(offset + 25, $inst_base_unit_dec_place, value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void inst_base_unit_dec_place(int value) {
		setConstNumber(offset + 25, $inst_base_unit_dec_place, value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void inst_base_unit_dec_place(long value) {
		setConstNumber(offset + 25, $inst_base_unit_dec_place, value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void inst_base_unit_dec_place(float value) {
		setConstNumber(offset + 25, $inst_base_unit_dec_place, value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void inst_base_unit_dec_place(double value) {
		setConstNumber(offset + 25, $inst_base_unit_dec_place, value);
	}


	/**
	 * Base unit rounding type 基準単位端数処理区分.<p>
	 *
	 */
	public String inst_base_unit_rnd_typ() {
		return getConstString(offset + 26, $inst_base_unit_rnd_typ);
	}

	/**
	 * Base unit rounding type 基準単位端数処理区分.<p>
	 *
	 */
	public void inst_base_unit_rnd_typ(String value) {
		setConstString(offset + 26, $inst_base_unit_rnd_typ, value);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR act_ttl_qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 27, $act_ttl_qty_p);
	}
	
	public void act_ttl_qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 27, $act_ttl_qty_p, row);
	}


	/**
	 * For specific inspection 規格検査対象.<p>
	 *
	 */
	public boolean std_insp_flg() {
		return getConstBoolean(offset + 28, $std_insp_flg);
	}

	/**
	 * For specific inspection 規格検査対象.<p>
	 *
	 */
	public void std_insp_flg(boolean value) {
		setConstBoolean(offset + 28, $std_insp_flg, value);
	}


	/**
	 * Specific inspection required 規格検査必須.<p>
	 *
	 */
	public boolean std_req_flg() {
		return getConstBoolean(offset + 29, $std_req_flg);
	}

	/**
	 * Specific inspection required 規格検査必須.<p>
	 *
	 */
	public void std_req_flg(boolean value) {
		setConstBoolean(offset + 29, $std_req_flg, value);
	}


	/**
	 * Specific inspection confirmation required 規格検査確認必須.<p>
	 *
	 */
	public boolean std_cnf_req_flg() {
		return getConstBoolean(offset + 30, $std_cnf_req_flg);
	}

	/**
	 * Specific inspection confirmation required 規格検査確認必須.<p>
	 *
	 */
	public void std_cnf_req_flg(boolean value) {
		setConstBoolean(offset + 30, $std_cnf_req_flg, value);
	}


	/**
	 * Specific inspection input 規格検査入力済.<p>
	 *
	 */
	public boolean std_cmpl_flg() {
		return getConstBoolean(offset + 31, $std_cmpl_flg);
	}

	/**
	 * Specific inspection input 規格検査入力済.<p>
	 *
	 */
	public void std_cmpl_flg(boolean value) {
		setConstBoolean(offset + 31, $std_cmpl_flg, value);
	}


	/**
	 * Specific inspection confirmed 規格検査確認済.<p>
	 *
	 */
	public boolean std_cnf_cmpl_flg() {
		return getConstBoolean(offset + 32, $std_cnf_cmpl_flg);
	}

	/**
	 * Specific inspection confirmed 規格検査確認済.<p>
	 *
	 */
	public void std_cnf_cmpl_flg(boolean value) {
		setConstBoolean(offset + 32, $std_cnf_cmpl_flg, value);
	}


	/**
	 * Specific inspection column qty. 規格検査項目数.<p>
	 *
	 */
	public MCNumber std_insp_point_cnt() {
		return getConstNumber(offset + 33, $std_insp_point_cnt);
	}

	/**
	 * Specific inspection column qty. 規格検査項目数.<p>
	 *
	 */
	public void std_insp_point_cnt(MCNumber value) {
		setConstNumber(offset + 33, $std_insp_point_cnt, value);
	}

	/**
	 * Specific inspection column qty. 規格検査項目数.<p>
	 *
	 */
	public void std_insp_point_cnt(int value) {
		setConstNumber(offset + 33, $std_insp_point_cnt, value);
	}

	/**
	 * Specific inspection column qty. 規格検査項目数.<p>
	 *
	 */
	public void std_insp_point_cnt(long value) {
		setConstNumber(offset + 33, $std_insp_point_cnt, value);
	}

	/**
	 * Specific inspection column qty. 規格検査項目数.<p>
	 *
	 */
	public void std_insp_point_cnt(float value) {
		setConstNumber(offset + 33, $std_insp_point_cnt, value);
	}

	/**
	 * Specific inspection column qty. 規格検査項目数.<p>
	 *
	 */
	public void std_insp_point_cnt(double value) {
		setConstNumber(offset + 33, $std_insp_point_cnt, value);
	}


	/**
	 * Specific inspection completed qty. 規格検査完了数.<p>
	 *
	 */
	public MCNumber std_insp_cmpl_cnt() {
		return getConstNumber(offset + 34, $std_insp_cmpl_cnt);
	}

	/**
	 * Specific inspection completed qty. 規格検査完了数.<p>
	 *
	 */
	public void std_insp_cmpl_cnt(MCNumber value) {
		setConstNumber(offset + 34, $std_insp_cmpl_cnt, value);
	}

	/**
	 * Specific inspection completed qty. 規格検査完了数.<p>
	 *
	 */
	public void std_insp_cmpl_cnt(int value) {
		setConstNumber(offset + 34, $std_insp_cmpl_cnt, value);
	}

	/**
	 * Specific inspection completed qty. 規格検査完了数.<p>
	 *
	 */
	public void std_insp_cmpl_cnt(long value) {
		setConstNumber(offset + 34, $std_insp_cmpl_cnt, value);
	}

	/**
	 * Specific inspection completed qty. 規格検査完了数.<p>
	 *
	 */
	public void std_insp_cmpl_cnt(float value) {
		setConstNumber(offset + 34, $std_insp_cmpl_cnt, value);
	}

	/**
	 * Specific inspection completed qty. 規格検査完了数.<p>
	 *
	 */
	public void std_insp_cmpl_cnt(double value) {
		setConstNumber(offset + 34, $std_insp_cmpl_cnt, value);
	}


	/**
	 * Specific inspection confirmation qty. 規格検査確認数.<p>
	 *
	 */
	public MCNumber std_insp_cnf_cmpl_cnt() {
		return getConstNumber(offset + 35, $std_insp_cnf_cmpl_cnt);
	}

	/**
	 * Specific inspection confirmation qty. 規格検査確認数.<p>
	 *
	 */
	public void std_insp_cnf_cmpl_cnt(MCNumber value) {
		setConstNumber(offset + 35, $std_insp_cnf_cmpl_cnt, value);
	}

	/**
	 * Specific inspection confirmation qty. 規格検査確認数.<p>
	 *
	 */
	public void std_insp_cnf_cmpl_cnt(int value) {
		setConstNumber(offset + 35, $std_insp_cnf_cmpl_cnt, value);
	}

	/**
	 * Specific inspection confirmation qty. 規格検査確認数.<p>
	 *
	 */
	public void std_insp_cnf_cmpl_cnt(long value) {
		setConstNumber(offset + 35, $std_insp_cnf_cmpl_cnt, value);
	}

	/**
	 * Specific inspection confirmation qty. 規格検査確認数.<p>
	 *
	 */
	public void std_insp_cnf_cmpl_cnt(float value) {
		setConstNumber(offset + 35, $std_insp_cnf_cmpl_cnt, value);
	}

	/**
	 * Specific inspection confirmation qty. 規格検査確認数.<p>
	 *
	 */
	public void std_insp_cnf_cmpl_cnt(double value) {
		setConstNumber(offset + 35, $std_insp_cnf_cmpl_cnt, value);
	}


	/**
	 * Order date 指図日.<p>
	 *
	 */
	public MCDate inst_dt() {
		return getConstDate(offset + 36, $inst_dt);
	}

	/**
	 * Order date 指図日.<p>
	 *
	 */
	public void inst_dt(MCDate value) {
		setConstDate(offset + 36, $inst_dt, value);
	}


	public mcframe.clientMAUB.MAUBP5320.YmdHmR inst_st_dt_p(){
		return (mcframe.clientMAUB.MAUBP5320.YmdHmR) getConstInnerRow(offset + 37, $inst_st_dt_p);
	}
	
	public void inst_st_dt_p(mcframe.clientMAUB.MAUBP5320.YmdHmR row){
		setConstInnerRow(offset + 37, $inst_st_dt_p, row);
	}


	public mcframe.clientMAUB.MAUBP5320.YmdHmR inst_end_dt_p(){
		return (mcframe.clientMAUB.MAUBP5320.YmdHmR) getConstInnerRow(offset + 38, $inst_end_dt_p);
	}
	
	public void inst_end_dt_p(mcframe.clientMAUB.MAUBP5320.YmdHmR row){
		setConstInnerRow(offset + 38, $inst_end_dt_p, row);
	}


	public mcframe.clientMAUB.MAUBP5320.YmdHmR st_dt_p(){
		return (mcframe.clientMAUB.MAUBP5320.YmdHmR) getConstInnerRow(offset + 39, $st_dt_p);
	}
	
	public void st_dt_p(mcframe.clientMAUB.MAUBP5320.YmdHmR row){
		setConstInnerRow(offset + 39, $st_dt_p, row);
	}


	public mcframe.clientMAUB.MAUBP5320.YmdHmR end_dt_p(){
		return (mcframe.clientMAUB.MAUBP5320.YmdHmR) getConstInnerRow(offset + 40, $end_dt_p);
	}
	
	public void end_dt_p(mcframe.clientMAUB.MAUBP5320.YmdHmR row){
		setConstInnerRow(offset + 40, $end_dt_p, row);
	}


	/**
	 * Decision result type 判定結果区分.<p>
	 *
	 */
	public String insp_judg_rslt_typ() {
		return getConstString(offset + 41, $insp_judg_rslt_typ);
	}

	/**
	 * Decision result type 判定結果区分.<p>
	 *
	 */
	public void insp_judg_rslt_typ(String value) {
		setConstString(offset + 41, $insp_judg_rslt_typ, value);
	}


	/**
	 * Decision result type name 判定結果区分名.<p>
	 *
	 */
	public String insp_judg_rslt_typ_nm() {
		return getConstString(offset + 42, $insp_judg_rslt_typ_nm);
	}

	/**
	 * Decision result type name 判定結果区分名.<p>
	 *
	 */
	public void insp_judg_rslt_typ_nm(String value) {
		setConstString(offset + 42, $insp_judg_rslt_typ_nm, value);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR rem_base_unit_qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 43, $rem_base_unit_qty_p);
	}
	
	public void rem_base_unit_qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 43, $rem_base_unit_qty_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR good_qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 44, $good_qty_p);
	}
	
	public void good_qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 44, $good_qty_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR dfct_qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 45, $dfct_qty_p);
	}
	
	public void dfct_qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 45, $dfct_qty_p, row);
	}


	/**
	 * Conforming type 良品区分.<p>
	 *
	 */
	public String quality_typ() {
		return getConstString(offset + 46, $quality_typ);
	}

	/**
	 * Conforming type 良品区分.<p>
	 *
	 */
	public void quality_typ(String value) {
		setConstString(offset + 46, $quality_typ, value);
	}


	/**
	 * Conforming type name 良品区分名.<p>
	 *
	 */
	public String quality_typ_nm() {
		return getConstString(offset + 47, $quality_typ_nm);
	}

	/**
	 * Conforming type name 良品区分名.<p>
	 *
	 */
	public void quality_typ_nm(String value) {
		setConstString(offset + 47, $quality_typ_nm, value);
	}


	/**
	 * Grading cd. 格付ＣＤ.<p>
	 *
	 */
	public String gd_cd() {
		return getConstString(offset + 48, $gd_cd);
	}

	/**
	 * Grading cd. 格付ＣＤ.<p>
	 *
	 */
	public void gd_cd(String value) {
		setConstString(offset + 48, $gd_cd, value);
	}


	/**
	 * Grading name 格付名.<p>
	 *
	 */
	public String gd_nm() {
		return getConstString(offset + 49, $gd_nm);
	}

	/**
	 * Grading name 格付名.<p>
	 *
	 */
	public void gd_nm(String value) {
		setConstString(offset + 49, $gd_nm, value);
	}


	/**
	 * Defective reason cd. 不良理由ＣＤ.<p>
	 *
	 */
	public String dfct_rsn_cd() {
		return getConstString(offset + 50, $dfct_rsn_cd);
	}

	/**
	 * Defective reason cd. 不良理由ＣＤ.<p>
	 *
	 */
	public void dfct_rsn_cd(String value) {
		setConstString(offset + 50, $dfct_rsn_cd, value);
	}


	/**
	 * Defective reason name 不良理由名.<p>
	 *
	 */
	public String dfct_rsn_nm() {
		return getConstString(offset + 51, $dfct_rsn_nm);
	}

	/**
	 * Defective reason name 不良理由名.<p>
	 *
	 */
	public void dfct_rsn_nm(String value) {
		setConstString(offset + 51, $dfct_rsn_nm, value);
	}


	public mcframe.clientMAUB.MAUBP5230.UsrDptR act_usr_cd_p(){
		return (mcframe.clientMAUB.MAUBP5230.UsrDptR) getConstInnerRow(offset + 52, $act_usr_cd_p);
	}
	
	public void act_usr_cd_p(mcframe.clientMAUB.MAUBP5230.UsrDptR row){
		setConstInnerRow(offset + 52, $act_usr_cd_p, row);
	}


	/**
	 * Decision date 判定日.<p>
	 *
	 */
	public MCDate judg_dt() {
		return getConstDate(offset + 53, $judg_dt);
	}

	/**
	 * Decision date 判定日.<p>
	 *
	 */
	public void judg_dt(MCDate value) {
		setConstDate(offset + 53, $judg_dt, value);
	}


	public mcframe.clientMAUB.MAUBP5230.UsrDptR judg_usr_cd_p(){
		return (mcframe.clientMAUB.MAUBP5230.UsrDptR) getConstInnerRow(offset + 54, $judg_usr_cd_p);
	}
	
	public void judg_usr_cd_p(mcframe.clientMAUB.MAUBP5230.UsrDptR row){
		setConstInnerRow(offset + 54, $judg_usr_cd_p, row);
	}


	public mcframe.clientMAUB.MAUBP5370.TxtR judg_rsn_p(){
		return (mcframe.clientMAUB.MAUBP5370.TxtR) getConstInnerRow(offset + 55, $judg_rsn_p);
	}
	
	public void judg_rsn_p(mcframe.clientMAUB.MAUBP5370.TxtR row){
		setConstInnerRow(offset + 55, $judg_rsn_p, row);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR smpl_inst_qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 56, $smpl_inst_qty_p);
	}
	
	public void smpl_inst_qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 56, $smpl_inst_qty_p, row);
	}


	/**
	 * Sampling order unit cd. 抜取指図単位ＣＤ.<p>
	 *
	 */
	public String smpl_inst_unit_cd() {
		return getConstString(offset + 57, $smpl_inst_unit_cd);
	}

	/**
	 * Sampling order unit cd. 抜取指図単位ＣＤ.<p>
	 *
	 */
	public void smpl_inst_unit_cd(String value) {
		setConstString(offset + 57, $smpl_inst_unit_cd, value);
	}


	/**
	 * Sampling order unit name 抜取指図単位名.<p>
	 *
	 */
	public String smpl_inst_unit_nm() {
		return getConstString(offset + 58, $smpl_inst_unit_nm);
	}

	/**
	 * Sampling order unit name 抜取指図単位名.<p>
	 *
	 */
	public void smpl_inst_unit_nm(String value) {
		setConstString(offset + 58, $smpl_inst_unit_nm, value);
	}


	/**
	 * Sampling order unit number of decimal places 抜取指図単位小数部有効桁数.<p>
	 *
	 */
	public MCNumber smpl_inst_unit_dec_place() {
		return getConstNumber(offset + 59, $smpl_inst_unit_dec_place);
	}

	/**
	 * Sampling order unit number of decimal places 抜取指図単位小数部有効桁数.<p>
	 *
	 */
	public void smpl_inst_unit_dec_place(MCNumber value) {
		setConstNumber(offset + 59, $smpl_inst_unit_dec_place, value);
	}

	/**
	 * Sampling order unit number of decimal places 抜取指図単位小数部有効桁数.<p>
	 *
	 */
	public void smpl_inst_unit_dec_place(int value) {
		setConstNumber(offset + 59, $smpl_inst_unit_dec_place, value);
	}

	/**
	 * Sampling order unit number of decimal places 抜取指図単位小数部有効桁数.<p>
	 *
	 */
	public void smpl_inst_unit_dec_place(long value) {
		setConstNumber(offset + 59, $smpl_inst_unit_dec_place, value);
	}

	/**
	 * Sampling order unit number of decimal places 抜取指図単位小数部有効桁数.<p>
	 *
	 */
	public void smpl_inst_unit_dec_place(float value) {
		setConstNumber(offset + 59, $smpl_inst_unit_dec_place, value);
	}

	/**
	 * Sampling order unit number of decimal places 抜取指図単位小数部有効桁数.<p>
	 *
	 */
	public void smpl_inst_unit_dec_place(double value) {
		setConstNumber(offset + 59, $smpl_inst_unit_dec_place, value);
	}


	public mcframe.clientMAUB.MAUBP5280.StdContFctrR std_cont_fctr_p(){
		return (mcframe.clientMAUB.MAUBP5280.StdContFctrR) getConstInnerRow(offset + 60, $std_cont_fctr_p);
	}
	
	public void std_cont_fctr_p(mcframe.clientMAUB.MAUBP5280.StdContFctrR row){
		setConstInnerRow(offset + 60, $std_cont_fctr_p, row);
	}


	public mcframe.clientMAUB.MAUBP5290.ActContFctrR act_cont_fctr_p(){
		return (mcframe.clientMAUB.MAUBP5290.ActContFctrR) getConstInnerRow(offset + 61, $act_cont_fctr_p);
	}
	
	public void act_cont_fctr_p(mcframe.clientMAUB.MAUBP5290.ActContFctrR row){
		setConstInnerRow(offset + 61, $act_cont_fctr_p, row);
	}


	/**
	 * Expiration date update 有効期限更新.<p>
	 *
	 */
	public boolean vld_dt_upd_flg() {
		return getConstBoolean(offset + 62, $vld_dt_upd_flg);
	}

	/**
	 * Expiration date update 有効期限更新.<p>
	 *
	 */
	public void vld_dt_upd_flg(boolean value) {
		setConstBoolean(offset + 62, $vld_dt_upd_flg, value);
	}


	/**
	 * Valid period 有効期間.<p>
	 *
	 */
	public MCNumber vld_pd() {
		return getConstNumber(offset + 63, $vld_pd);
	}

	/**
	 * Valid period 有効期間.<p>
	 *
	 */
	public void vld_pd(MCNumber value) {
		setConstNumber(offset + 63, $vld_pd, value);
	}

	/**
	 * Valid period 有効期間.<p>
	 *
	 */
	public void vld_pd(int value) {
		setConstNumber(offset + 63, $vld_pd, value);
	}

	/**
	 * Valid period 有効期間.<p>
	 *
	 */
	public void vld_pd(long value) {
		setConstNumber(offset + 63, $vld_pd, value);
	}

	/**
	 * Valid period 有効期間.<p>
	 *
	 */
	public void vld_pd(float value) {
		setConstNumber(offset + 63, $vld_pd, value);
	}

	/**
	 * Valid period 有効期間.<p>
	 *
	 */
	public void vld_pd(double value) {
		setConstNumber(offset + 63, $vld_pd, value);
	}


	/**
	 * Period until expiration 使用期間.<p>
	 *
	 */
	public MCNumber lmt_pd() {
		return getConstNumber(offset + 64, $lmt_pd);
	}

	/**
	 * Period until expiration 使用期間.<p>
	 *
	 */
	public void lmt_pd(MCNumber value) {
		setConstNumber(offset + 64, $lmt_pd, value);
	}

	/**
	 * Period until expiration 使用期間.<p>
	 *
	 */
	public void lmt_pd(int value) {
		setConstNumber(offset + 64, $lmt_pd, value);
	}

	/**
	 * Period until expiration 使用期間.<p>
	 *
	 */
	public void lmt_pd(long value) {
		setConstNumber(offset + 64, $lmt_pd, value);
	}

	/**
	 * Period until expiration 使用期間.<p>
	 *
	 */
	public void lmt_pd(float value) {
		setConstNumber(offset + 64, $lmt_pd, value);
	}

	/**
	 * Period until expiration 使用期間.<p>
	 *
	 */
	public void lmt_pd(double value) {
		setConstNumber(offset + 64, $lmt_pd, value);
	}


	/**
	 * Period calculation type 期間計算区分.<p>
	 *
	 */
	public String calc_pd_typ() {
		return getConstString(offset + 65, $calc_pd_typ);
	}

	/**
	 * Period calculation type 期間計算区分.<p>
	 *
	 */
	public void calc_pd_typ(String value) {
		setConstString(offset + 65, $calc_pd_typ, value);
	}


	/**
	 * Period calculation type name 期間計算区分名.<p>
	 *
	 */
	public String calc_pd_typ_nm() {
		return getConstString(offset + 66, $calc_pd_typ_nm);
	}

	/**
	 * Period calculation type name 期間計算区分名.<p>
	 *
	 */
	public void calc_pd_typ_nm(String value) {
		setConstString(offset + 66, $calc_pd_typ_nm, value);
	}


	/**
	 * Expiration base date type 期限起算日区分.<p>
	 *
	 */
	public String lmt_dt_frm_typ() {
		return getConstString(offset + 67, $lmt_dt_frm_typ);
	}

	/**
	 * Expiration base date type 期限起算日区分.<p>
	 *
	 */
	public void lmt_dt_frm_typ(String value) {
		setConstString(offset + 67, $lmt_dt_frm_typ, value);
	}


	/**
	 * Expiration base date type name 期限起算日区分名.<p>
	 *
	 */
	public String lmt_dt_frm_typ_nm() {
		return getConstString(offset + 68, $lmt_dt_frm_typ_nm);
	}

	/**
	 * Expiration base date type name 期限起算日区分名.<p>
	 *
	 */
	public void lmt_dt_frm_typ_nm(String value) {
		setConstString(offset + 68, $lmt_dt_frm_typ_nm, value);
	}


	/**
	 * For expiration management 期限管理対象.<p>
	 *
	 */
	public boolean lmt_ctl_flg() {
		return getConstBoolean(offset + 69, $lmt_ctl_flg);
	}

	/**
	 * For expiration management 期限管理対象.<p>
	 *
	 */
	public void lmt_ctl_flg(boolean value) {
		setConstBoolean(offset + 69, $lmt_ctl_flg, value);
	}


	/**
	 * Expiration management type 期限管理種別.<p>
	 *
	 */
	public String lmt_ctl_categ() {
		return getConstString(offset + 70, $lmt_ctl_categ);
	}

	/**
	 * Expiration management type 期限管理種別.<p>
	 *
	 */
	public void lmt_ctl_categ(String value) {
		setConstString(offset + 70, $lmt_ctl_categ, value);
	}


	/**
	 * Base date 起算日.<p>
	 *
	 */
	public MCDate lmt_dt_frm() {
		return getConstDate(offset + 71, $lmt_dt_frm);
	}

	/**
	 * Base date 起算日.<p>
	 *
	 */
	public void lmt_dt_frm(MCDate value) {
		setConstDate(offset + 71, $lmt_dt_frm, value);
	}


	/**
	 * Current expiration date 現有効期限.<p>
	 *
	 */
	public MCDate vld_dt_now() {
		return getConstDate(offset + 72, $vld_dt_now);
	}

	/**
	 * Current expiration date 現有効期限.<p>
	 *
	 */
	public void vld_dt_now(MCDate value) {
		setConstDate(offset + 72, $vld_dt_now, value);
	}


	/**
	 * Expiration date 有効期限.<p>
	 *
	 */
	public MCDate vld_dt() {
		return getConstDate(offset + 73, $vld_dt);
	}

	/**
	 * Expiration date 有効期限.<p>
	 *
	 */
	public void vld_dt(MCDate value) {
		setConstDate(offset + 73, $vld_dt, value);
	}


	/**
	 * Current usage expiration date 現使用期限.<p>
	 *
	 */
	public MCDate lmt_dt_now() {
		return getConstDate(offset + 74, $lmt_dt_now);
	}

	/**
	 * Current usage expiration date 現使用期限.<p>
	 *
	 */
	public void lmt_dt_now(MCDate value) {
		setConstDate(offset + 74, $lmt_dt_now, value);
	}


	/**
	 * Usage expiration date 使用期限.<p>
	 *
	 */
	public MCDate lmt_dt() {
		return getConstDate(offset + 75, $lmt_dt);
	}

	/**
	 * Usage expiration date 使用期限.<p>
	 *
	 */
	public void lmt_dt(MCDate value) {
		setConstDate(offset + 75, $lmt_dt, value);
	}


	/**
	 * Specific inspection No. 規格書ＮＯ.<p>
	 *
	 */
	public String insp_std_no() {
		return getConstString(offset + 76, $insp_std_no);
	}

	/**
	 * Specific inspection No. 規格書ＮＯ.<p>
	 *
	 */
	public void insp_std_no(String value) {
		setConstString(offset + 76, $insp_std_no, value);
	}


	/**
	 * Re-inspection for expiration 期限再検査.<p>
	 *
	 */
	public boolean lmt_up_flg() {
		return getConstBoolean(offset + 77, $lmt_up_flg);
	}

	/**
	 * Re-inspection for expiration 期限再検査.<p>
	 *
	 */
	public void lmt_up_flg(boolean value) {
		setConstBoolean(offset + 77, $lmt_up_flg, value);
	}


	/**
	 * Allow inspecting usage 検査中使用許可.<p>
	 *
	 */
	public boolean in_prmt_insp_flg() {
		return getConstBoolean(offset + 78, $in_prmt_insp_flg);
	}

	/**
	 * Allow inspecting usage 検査中使用許可.<p>
	 *
	 */
	public void in_prmt_insp_flg(boolean value) {
		setConstBoolean(offset + 78, $in_prmt_insp_flg, value);
	}


	/**
	 * Result internal remarks 実績内部備考.<p>
	 *
	 */
	public String act_intr_rmrks() {
		return getConstString(offset + 79, $act_intr_rmrks);
	}

	/**
	 * Result internal remarks 実績内部備考.<p>
	 *
	 */
	public void act_intr_rmrks(String value) {
		setConstString(offset + 79, $act_intr_rmrks, value);
	}


	/**
	 * Lot remarks ロット備考.<p>
	 *
	 */
	public String lot_rmrks() {
		return getConstString(offset + 80, $lot_rmrks);
	}

	/**
	 * Lot remarks ロット備考.<p>
	 *
	 */
	public void lot_rmrks(String value) {
		setConstString(offset + 80, $lot_rmrks, value);
	}


	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public String sub_char1() {
		return getConstString(offset + 81, $sub_char1);
	}

	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public void sub_char1(String value) {
		setConstString(offset + 81, $sub_char1, value);
	}


	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public String sub_char2() {
		return getConstString(offset + 82, $sub_char2);
	}

	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public void sub_char2(String value) {
		setConstString(offset + 82, $sub_char2, value);
	}


	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public String sub_char3() {
		return getConstString(offset + 83, $sub_char3);
	}

	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public void sub_char3(String value) {
		setConstString(offset + 83, $sub_char3, value);
	}


	/**
	 * Factory/Distribution warehouse cd. 工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public String to_site_cd() {
		return getConstString(offset + 84, $to_site_cd);
	}

	/**
	 * Factory/Distribution warehouse cd. 工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public void to_site_cd(String value) {
		setConstString(offset + 84, $to_site_cd, value);
	}


	/**
	 * Factory/Distribution warehouse name 工場・物流倉庫名.<p>
	 *
	 */
	public String to_site_nm() {
		return getConstString(offset + 85, $to_site_nm);
	}

	/**
	 * Factory/Distribution warehouse name 工場・物流倉庫名.<p>
	 *
	 */
	public void to_site_nm(String value) {
		setConstString(offset + 85, $to_site_nm, value);
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
	 * Vendor lot No. 業者ロットＮＯ.<p>
	 *
	 */
	public String bp_lot_no() {
		return getConstString(offset + 90, $bp_lot_no);
	}

	/**
	 * Vendor lot No. 業者ロットＮＯ.<p>
	 *
	 */
	public void bp_lot_no(String value) {
		setConstString(offset + 90, $bp_lot_no, value);
	}


	/**
	 * Mfg. location cd. 製造場所ＣＤ.<p>
	 *
	 */
	public String mfg_loc_cd() {
		return getConstString(offset + 91, $mfg_loc_cd);
	}

	/**
	 * Mfg. location cd. 製造場所ＣＤ.<p>
	 *
	 */
	public void mfg_loc_cd(String value) {
		setConstString(offset + 91, $mfg_loc_cd, value);
	}


	/**
	 * Mfg. location name 製造場所名.<p>
	 *
	 */
	public String mfg_loc_nm() {
		return getConstString(offset + 92, $mfg_loc_nm);
	}

	/**
	 * Mfg. location name 製造場所名.<p>
	 *
	 */
	public void mfg_loc_nm(String value) {
		setConstString(offset + 92, $mfg_loc_nm, value);
	}


	/**
	 * Storage location cd. 格納場所ＣＤ.<p>
	 *
	 */
	public String loc_cd() {
		return getConstString(offset + 93, $loc_cd);
	}

	/**
	 * Storage location cd. 格納場所ＣＤ.<p>
	 *
	 */
	public void loc_cd(String value) {
		setConstString(offset + 93, $loc_cd, value);
	}


	/**
	 * Inspection implementation unit type 検査実施単位区分.<p>
	 *
	 */
	public String insp_bind_typ() {
		return getConstString(offset + 94, $insp_bind_typ);
	}

	/**
	 * Inspection implementation unit type 検査実施単位区分.<p>
	 *
	 */
	public void insp_bind_typ(String value) {
		setConstString(offset + 94, $insp_bind_typ, value);
	}


	/**
	 * Inspection implementation unit type name 検査実施単位区分名.<p>
	 *
	 */
	public String insp_bind_typ_nm() {
		return getConstString(offset + 95, $insp_bind_typ_nm);
	}

	/**
	 * Inspection implementation unit type name 検査実施単位区分名.<p>
	 *
	 */
	public void insp_bind_typ_nm(String value) {
		setConstString(offset + 95, $insp_bind_typ_nm, value);
	}


	/**
	 * Inspection report printed date and time 検査成績書発行日時.<p>
	 *
	 */
	public MCDate insp_rslt_prnt_tm() {
		return getConstDate(offset + 96, $insp_rslt_prnt_tm);
	}

	/**
	 * Inspection report printed date and time 検査成績書発行日時.<p>
	 *
	 */
	public void insp_rslt_prnt_tm(MCDate value) {
		setConstDate(offset + 96, $insp_rslt_prnt_tm, value);
	}


	/**
	 * Inspection report printed 検査成績書発行済.<p>
	 *
	 */
	public boolean insp_rslt_prnt_flg() {
		return getConstBoolean(offset + 97, $insp_rslt_prnt_flg);
	}

	/**
	 * Inspection report printed 検査成績書発行済.<p>
	 *
	 */
	public void insp_rslt_prnt_flg(boolean value) {
		setConstBoolean(offset + 97, $insp_rslt_prnt_flg, value);
	}


	/**
	 * Source No. 1 作成元ＮＯ１.<p>
	 *
	 */
	public String src_no1() {
		return getConstString(offset + 98, $src_no1);
	}

	/**
	 * Source No. 1 作成元ＮＯ１.<p>
	 *
	 */
	public void src_no1(String value) {
		setConstString(offset + 98, $src_no1, value);
	}


	/**
	 * Source No. 2 作成元ＮＯ２.<p>
	 *
	 */
	public String src_no2() {
		return getConstString(offset + 99, $src_no2);
	}

	/**
	 * Source No. 2 作成元ＮＯ２.<p>
	 *
	 */
	public void src_no2(String value) {
		setConstString(offset + 99, $src_no2, value);
	}


	/**
	 * LIMS ＬＩＭＳ.<p>
	 *
	 */
	public boolean lims_flg() {
		return getConstBoolean(offset + 100, $lims_flg);
	}

	/**
	 * LIMS ＬＩＭＳ.<p>
	 *
	 */
	public void lims_flg(boolean value) {
		setConstBoolean(offset + 100, $lims_flg, value);
	}


	/**
	 * External system cd. 外部システムＣＤ.<p>
	 *
	 */
	public String ext_sys_cd() {
		return getConstString(offset + 101, $ext_sys_cd);
	}

	/**
	 * External system cd. 外部システムＣＤ.<p>
	 *
	 */
	public void ext_sys_cd(String value) {
		setConstString(offset + 101, $ext_sys_cd, value);
	}


	/**
	 * External system name 外部システム名.<p>
	 *
	 */
	public String ext_sys_nm() {
		return getConstString(offset + 102, $ext_sys_nm);
	}

	/**
	 * External system name 外部システム名.<p>
	 *
	 */
	public void ext_sys_nm(String value) {
		setConstString(offset + 102, $ext_sys_nm, value);
	}


	/**
	 * External inspection result No. 外部検査実績ＮＯ.<p>
	 *
	 */
	public String ext_insp_act_no() {
		return getConstString(offset + 103, $ext_insp_act_no);
	}

	/**
	 * External inspection result No. 外部検査実績ＮＯ.<p>
	 *
	 */
	public void ext_insp_act_no(String value) {
		setConstString(offset + 103, $ext_insp_act_no, value);
	}


	/**
	 * Item type 品目区分.<p>
	 *
	 */
	public String itm_typ() {
		return getConstString(offset + 104, $itm_typ);
	}

	/**
	 * Item type 品目区分.<p>
	 *
	 */
	public void itm_typ(String value) {
		setConstString(offset + 104, $itm_typ, value);
	}


	/**
	 * Item type name 品目区分名.<p>
	 *
	 */
	public String itm_typ_nm() {
		return getConstString(offset + 105, $itm_typ_nm);
	}

	/**
	 * Item type name 品目区分名.<p>
	 *
	 */
	public void itm_typ_nm(String value) {
		setConstString(offset + 105, $itm_typ_nm, value);
	}


	/**
	 * Item type details cd. 品目区分詳細ＣＤ.<p>
	 *
	 */
	public String itm_typ_d_cd() {
		return getConstString(offset + 106, $itm_typ_d_cd);
	}

	/**
	 * Item type details cd. 品目区分詳細ＣＤ.<p>
	 *
	 */
	public void itm_typ_d_cd(String value) {
		setConstString(offset + 106, $itm_typ_d_cd, value);
	}


	/**
	 * Item type details name 品目区分詳細名.<p>
	 *
	 */
	public String itm_typ_d_nm() {
		return getConstString(offset + 107, $itm_typ_d_nm);
	}

	/**
	 * Item type details name 品目区分詳細名.<p>
	 *
	 */
	public void itm_typ_d_nm(String value) {
		setConstString(offset + 107, $itm_typ_d_nm, value);
	}


	public mcframe.clientMAUB.MAUBP5310.RtnMsgR rts_msg_p(){
		return (mcframe.clientMAUB.MAUBP5310.RtnMsgR) getConstInnerRow(offset + 108, $rts_msg_p);
	}
	
	public void rts_msg_p(mcframe.clientMAUB.MAUBP5310.RtnMsgR row){
		setConstInnerRow(offset + 108, $rts_msg_p, row);
	}


	public mcframe.clientMAUB.MAUBP5190.BpGrpR sppl_grp_p(){
		return (mcframe.clientMAUB.MAUBP5190.BpGrpR) getConstInnerRow(offset + 109, $sppl_grp_p);
	}
	
	public void sppl_grp_p(mcframe.clientMAUB.MAUBP5190.BpGrpR row){
		setConstInnerRow(offset + 109, $sppl_grp_p, row);
	}


	public mcframe.clientMAUB.MAUBP5170.ItmGrpR itm_grp_p(){
		return (mcframe.clientMAUB.MAUBP5170.ItmGrpR) getConstInnerRow(offset + 110, $itm_grp_p);
	}
	
	public void itm_grp_p(mcframe.clientMAUB.MAUBP5170.ItmGrpR row){
		setConstInnerRow(offset + 110, $itm_grp_p, row);
	}


	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public String ins_usr_id() {
		return getConstString(offset + 111, $ins_usr_id);
	}

	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public void ins_usr_id(String value) {
		setConstString(offset + 111, $ins_usr_id, value);
	}


	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public String ins_usr_nm() {
		return getConstString(offset + 112, $ins_usr_nm);
	}

	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public void ins_usr_nm(String value) {
		setConstString(offset + 112, $ins_usr_nm, value);
	}


	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public String ins_func_id() {
		return getConstString(offset + 113, $ins_func_id);
	}

	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public void ins_func_id(String value) {
		setConstString(offset + 113, $ins_func_id, value);
	}


	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public String ins_func_nm() {
		return getConstString(offset + 114, $ins_func_nm);
	}

	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public void ins_func_nm(String value) {
		setConstString(offset + 114, $ins_func_nm, value);
	}


	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public MCTimestamp ins_ts() {
		return getConstTimestamp(offset + 115, $ins_ts);
	}

	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public void ins_ts(MCTimestamp value) {
		setConstTimestamp(offset + 115, $ins_ts, value);
	}


	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public String upd_usr_id() {
		return getConstString(offset + 116, $upd_usr_id);
	}

	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public void upd_usr_id(String value) {
		setConstString(offset + 116, $upd_usr_id, value);
	}


	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public String upd_usr_nm() {
		return getConstString(offset + 117, $upd_usr_nm);
	}

	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public void upd_usr_nm(String value) {
		setConstString(offset + 117, $upd_usr_nm, value);
	}


	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public String upd_func_id() {
		return getConstString(offset + 118, $upd_func_id);
	}

	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public void upd_func_id(String value) {
		setConstString(offset + 118, $upd_func_id, value);
	}


	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public String upd_func_nm() {
		return getConstString(offset + 119, $upd_func_nm);
	}

	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public void upd_func_nm(String value) {
		setConstString(offset + 119, $upd_func_nm, value);
	}


	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public MCTimestamp upd_ts() {
		return getConstTimestamp(offset + 120, $upd_ts);
	}

	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public void upd_ts(MCTimestamp value) {
		setConstTimestamp(offset + 120, $upd_ts, value);
	}


	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public String upd_srv_req_no() {
		return getConstString(offset + 121, $upd_srv_req_no);
	}

	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public void upd_srv_req_no(String value) {
		setConstString(offset + 121, $upd_srv_req_no, value);
	}


	/**
	 * Inspection order update counter 検査指図更新カウンタ.<p>
	 *
	 */
	public MCNumber inst_upd_cntr() {
		return getConstNumber(offset + 122, $inst_upd_cntr);
	}

	/**
	 * Inspection order update counter 検査指図更新カウンタ.<p>
	 *
	 */
	public void inst_upd_cntr(MCNumber value) {
		setConstNumber(offset + 122, $inst_upd_cntr, value);
	}

	/**
	 * Inspection order update counter 検査指図更新カウンタ.<p>
	 *
	 */
	public void inst_upd_cntr(int value) {
		setConstNumber(offset + 122, $inst_upd_cntr, value);
	}

	/**
	 * Inspection order update counter 検査指図更新カウンタ.<p>
	 *
	 */
	public void inst_upd_cntr(long value) {
		setConstNumber(offset + 122, $inst_upd_cntr, value);
	}

	/**
	 * Inspection order update counter 検査指図更新カウンタ.<p>
	 *
	 */
	public void inst_upd_cntr(float value) {
		setConstNumber(offset + 122, $inst_upd_cntr, value);
	}

	/**
	 * Inspection order update counter 検査指図更新カウンタ.<p>
	 *
	 */
	public void inst_upd_cntr(double value) {
		setConstNumber(offset + 122, $inst_upd_cntr, value);
	}


	/**
	 * Inspection result update counter 検査実績更新カウンタ.<p>
	 *
	 */
	public MCNumber act_upd_cntr() {
		return getConstNumber(offset + 123, $act_upd_cntr);
	}

	/**
	 * Inspection result update counter 検査実績更新カウンタ.<p>
	 *
	 */
	public void act_upd_cntr(MCNumber value) {
		setConstNumber(offset + 123, $act_upd_cntr, value);
	}

	/**
	 * Inspection result update counter 検査実績更新カウンタ.<p>
	 *
	 */
	public void act_upd_cntr(int value) {
		setConstNumber(offset + 123, $act_upd_cntr, value);
	}

	/**
	 * Inspection result update counter 検査実績更新カウンタ.<p>
	 *
	 */
	public void act_upd_cntr(long value) {
		setConstNumber(offset + 123, $act_upd_cntr, value);
	}

	/**
	 * Inspection result update counter 検査実績更新カウンタ.<p>
	 *
	 */
	public void act_upd_cntr(float value) {
		setConstNumber(offset + 123, $act_upd_cntr, value);
	}

	/**
	 * Inspection result update counter 検査実績更新カウンタ.<p>
	 *
	 */
	public void act_upd_cntr(double value) {
		setConstNumber(offset + 123, $act_upd_cntr, value);
	}


	/**
	 * For active ingredient 有効成分対象.<p>
	 *
	 */
	public boolean cont_fctr_flg() {
		return getConstBoolean(offset + 124, $cont_fctr_flg);
	}

	/**
	 * For active ingredient 有効成分対象.<p>
	 *
	 */
	public void cont_fctr_flg(boolean value) {
		setConstBoolean(offset + 124, $cont_fctr_flg, value);
	}


	/**
	 * With specific inspection rejected flg. 規格検査不合格有りＦＬＧ.<p>
	 *
	 */
	public boolean std_insp_ng_flg() {
		return getConstBoolean(offset + 125, $std_insp_ng_flg);
	}

	/**
	 * With specific inspection rejected flg. 規格検査不合格有りＦＬＧ.<p>
	 *
	 */
	public void std_insp_ng_flg(boolean value) {
		setConstBoolean(offset + 125, $std_insp_ng_flg, value);
	}


	/**
	 * With specific inspection concession flg. 規格検査特採有りＦＬＧ.<p>
	 *
	 */
	public boolean std_insp_sp_flg() {
		return getConstBoolean(offset + 126, $std_insp_sp_flg);
	}

	/**
	 * With specific inspection concession flg. 規格検査特採有りＦＬＧ.<p>
	 *
	 */
	public void std_insp_sp_flg(boolean value) {
		setConstBoolean(offset + 126, $std_insp_sp_flg, value);
	}


	public String getString(String name) {
		if ($insp_sts_typ.equalsIgnoreCase(name)) {
			return insp_sts_typ();
		}
		if ($insp_sts_typ_nm.equalsIgnoreCase(name)) {
			return insp_sts_typ_nm();
		}
		if ($insp_aprv_sts_typ.equalsIgnoreCase(name)) {
			return insp_aprv_sts_typ();
		}
		if ($insp_aprv_sts_typ_nm.equalsIgnoreCase(name)) {
			return insp_aprv_sts_typ_nm();
		}
		if ($lot_no.equalsIgnoreCase(name)) {
			return lot_no();
		}
		if ($sublot_no.equalsIgnoreCase(name)) {
			return sublot_no();
		}
		if ($ver_no.equalsIgnoreCase(name)) {
			return ver_no();
		}
		if ($insp_no.equalsIgnoreCase(name)) {
			return insp_no();
		}
		if ($insp_act_no.equalsIgnoreCase(name)) {
			return insp_act_no();
		}
		if ($insp_mtd_typ.equalsIgnoreCase(name)) {
			return insp_mtd_typ();
		}
		if ($insp_mtd_typ_nm.equalsIgnoreCase(name)) {
			return insp_mtd_typ_nm();
		}
		if ($insp_typ.equalsIgnoreCase(name)) {
			return insp_typ();
		}
		if ($insp_typ_nm.equalsIgnoreCase(name)) {
			return insp_typ_nm();
		}
		if ($insp_ptn_cd.equalsIgnoreCase(name)) {
			return insp_ptn_cd();
		}
		if ($insp_ptn_nm.equalsIgnoreCase(name)) {
			return insp_ptn_nm();
		}
		if ($inst_pack_unit_cd.equalsIgnoreCase(name)) {
			return inst_pack_unit_cd();
		}
		if ($inst_pack_unit_nm.equalsIgnoreCase(name)) {
			return inst_pack_unit_nm();
		}
		if ($inst_base_unit_cd.equalsIgnoreCase(name)) {
			return inst_base_unit_cd();
		}
		if ($inst_base_unit_nm.equalsIgnoreCase(name)) {
			return inst_base_unit_nm();
		}
		if ($inst_base_unit_rnd_typ.equalsIgnoreCase(name)) {
			return inst_base_unit_rnd_typ();
		}
		if ($insp_judg_rslt_typ.equalsIgnoreCase(name)) {
			return insp_judg_rslt_typ();
		}
		if ($insp_judg_rslt_typ_nm.equalsIgnoreCase(name)) {
			return insp_judg_rslt_typ_nm();
		}
		if ($quality_typ.equalsIgnoreCase(name)) {
			return quality_typ();
		}
		if ($quality_typ_nm.equalsIgnoreCase(name)) {
			return quality_typ_nm();
		}
		if ($gd_cd.equalsIgnoreCase(name)) {
			return gd_cd();
		}
		if ($gd_nm.equalsIgnoreCase(name)) {
			return gd_nm();
		}
		if ($dfct_rsn_cd.equalsIgnoreCase(name)) {
			return dfct_rsn_cd();
		}
		if ($dfct_rsn_nm.equalsIgnoreCase(name)) {
			return dfct_rsn_nm();
		}
		if ($smpl_inst_unit_cd.equalsIgnoreCase(name)) {
			return smpl_inst_unit_cd();
		}
		if ($smpl_inst_unit_nm.equalsIgnoreCase(name)) {
			return smpl_inst_unit_nm();
		}
		if ($calc_pd_typ.equalsIgnoreCase(name)) {
			return calc_pd_typ();
		}
		if ($calc_pd_typ_nm.equalsIgnoreCase(name)) {
			return calc_pd_typ_nm();
		}
		if ($lmt_dt_frm_typ.equalsIgnoreCase(name)) {
			return lmt_dt_frm_typ();
		}
		if ($lmt_dt_frm_typ_nm.equalsIgnoreCase(name)) {
			return lmt_dt_frm_typ_nm();
		}
		if ($lmt_ctl_categ.equalsIgnoreCase(name)) {
			return lmt_ctl_categ();
		}
		if ($insp_std_no.equalsIgnoreCase(name)) {
			return insp_std_no();
		}
		if ($act_intr_rmrks.equalsIgnoreCase(name)) {
			return act_intr_rmrks();
		}
		if ($lot_rmrks.equalsIgnoreCase(name)) {
			return lot_rmrks();
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
		if ($to_site_cd.equalsIgnoreCase(name)) {
			return to_site_cd();
		}
		if ($to_site_nm.equalsIgnoreCase(name)) {
			return to_site_nm();
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
		if ($bp_lot_no.equalsIgnoreCase(name)) {
			return bp_lot_no();
		}
		if ($mfg_loc_cd.equalsIgnoreCase(name)) {
			return mfg_loc_cd();
		}
		if ($mfg_loc_nm.equalsIgnoreCase(name)) {
			return mfg_loc_nm();
		}
		if ($loc_cd.equalsIgnoreCase(name)) {
			return loc_cd();
		}
		if ($insp_bind_typ.equalsIgnoreCase(name)) {
			return insp_bind_typ();
		}
		if ($insp_bind_typ_nm.equalsIgnoreCase(name)) {
			return insp_bind_typ_nm();
		}
		if ($src_no1.equalsIgnoreCase(name)) {
			return src_no1();
		}
		if ($src_no2.equalsIgnoreCase(name)) {
			return src_no2();
		}
		if ($ext_sys_cd.equalsIgnoreCase(name)) {
			return ext_sys_cd();
		}
		if ($ext_sys_nm.equalsIgnoreCase(name)) {
			return ext_sys_nm();
		}
		if ($ext_insp_act_no.equalsIgnoreCase(name)) {
			return ext_insp_act_no();
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
		if ($insp_freq.equalsIgnoreCase(name)) {
			return insp_freq();
		}
		if ($inst_pack_unit_dec_place.equalsIgnoreCase(name)) {
			return inst_pack_unit_dec_place();
		}
		if ($inst_base_unit_dec_place.equalsIgnoreCase(name)) {
			return inst_base_unit_dec_place();
		}
		if ($std_insp_point_cnt.equalsIgnoreCase(name)) {
			return std_insp_point_cnt();
		}
		if ($std_insp_cmpl_cnt.equalsIgnoreCase(name)) {
			return std_insp_cmpl_cnt();
		}
		if ($std_insp_cnf_cmpl_cnt.equalsIgnoreCase(name)) {
			return std_insp_cnf_cmpl_cnt();
		}
		if ($smpl_inst_unit_dec_place.equalsIgnoreCase(name)) {
			return smpl_inst_unit_dec_place();
		}
		if ($vld_pd.equalsIgnoreCase(name)) {
			return vld_pd();
		}
		if ($lmt_pd.equalsIgnoreCase(name)) {
			return lmt_pd();
		}
		if ($inst_upd_cntr.equalsIgnoreCase(name)) {
			return inst_upd_cntr();
		}
		if ($act_upd_cntr.equalsIgnoreCase(name)) {
			return act_upd_cntr();
		}
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		if ($inst_dt.equalsIgnoreCase(name)) {
			return inst_dt();
		}
		if ($judg_dt.equalsIgnoreCase(name)) {
			return judg_dt();
		}
		if ($lmt_dt_frm.equalsIgnoreCase(name)) {
			return lmt_dt_frm();
		}
		if ($vld_dt_now.equalsIgnoreCase(name)) {
			return vld_dt_now();
		}
		if ($vld_dt.equalsIgnoreCase(name)) {
			return vld_dt();
		}
		if ($lmt_dt_now.equalsIgnoreCase(name)) {
			return lmt_dt_now();
		}
		if ($lmt_dt.equalsIgnoreCase(name)) {
			return lmt_dt();
		}
		if ($insp_rslt_prnt_tm.equalsIgnoreCase(name)) {
			return insp_rslt_prnt_tm();
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
		if ($std_insp_flg.equalsIgnoreCase(name)) {
			return std_insp_flg();
		}
		if ($std_req_flg.equalsIgnoreCase(name)) {
			return std_req_flg();
		}
		if ($std_cnf_req_flg.equalsIgnoreCase(name)) {
			return std_cnf_req_flg();
		}
		if ($std_cmpl_flg.equalsIgnoreCase(name)) {
			return std_cmpl_flg();
		}
		if ($std_cnf_cmpl_flg.equalsIgnoreCase(name)) {
			return std_cnf_cmpl_flg();
		}
		if ($vld_dt_upd_flg.equalsIgnoreCase(name)) {
			return vld_dt_upd_flg();
		}
		if ($lmt_ctl_flg.equalsIgnoreCase(name)) {
			return lmt_ctl_flg();
		}
		if ($lmt_up_flg.equalsIgnoreCase(name)) {
			return lmt_up_flg();
		}
		if ($in_prmt_insp_flg.equalsIgnoreCase(name)) {
			return in_prmt_insp_flg();
		}
		if ($insp_rslt_prnt_flg.equalsIgnoreCase(name)) {
			return insp_rslt_prnt_flg();
		}
		if ($lims_flg.equalsIgnoreCase(name)) {
			return lims_flg();
		}
		if ($cont_fctr_flg.equalsIgnoreCase(name)) {
			return cont_fctr_flg();
		}
		if ($std_insp_ng_flg.equalsIgnoreCase(name)) {
			return std_insp_ng_flg();
		}
		if ($std_insp_sp_flg.equalsIgnoreCase(name)) {
			return std_insp_sp_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($insp_sts_typ.equalsIgnoreCase(name)) {
			return insp_sts_typ();
		}
		if ($insp_sts_typ_nm.equalsIgnoreCase(name)) {
			return insp_sts_typ_nm();
		}
		if ($insp_aprv_sts_typ.equalsIgnoreCase(name)) {
			return insp_aprv_sts_typ();
		}
		if ($insp_aprv_sts_typ_nm.equalsIgnoreCase(name)) {
			return insp_aprv_sts_typ_nm();
		}
		if ($lot_no.equalsIgnoreCase(name)) {
			return lot_no();
		}
		if ($sublot_no.equalsIgnoreCase(name)) {
			return sublot_no();
		}
		if ($ver_no.equalsIgnoreCase(name)) {
			return ver_no();
		}
		if ($insp_no.equalsIgnoreCase(name)) {
			return insp_no();
		}
		if ($insp_act_no.equalsIgnoreCase(name)) {
			return insp_act_no();
		}
		if ($insp_mtd_typ.equalsIgnoreCase(name)) {
			return insp_mtd_typ();
		}
		if ($insp_mtd_typ_nm.equalsIgnoreCase(name)) {
			return insp_mtd_typ_nm();
		}
		if ($insp_typ.equalsIgnoreCase(name)) {
			return insp_typ();
		}
		if ($insp_typ_nm.equalsIgnoreCase(name)) {
			return insp_typ_nm();
		}
		if ($insp_ptn_cd.equalsIgnoreCase(name)) {
			return insp_ptn_cd();
		}
		if ($insp_ptn_nm.equalsIgnoreCase(name)) {
			return insp_ptn_nm();
		}
		if ($inst_pack_unit_cd.equalsIgnoreCase(name)) {
			return inst_pack_unit_cd();
		}
		if ($inst_pack_unit_nm.equalsIgnoreCase(name)) {
			return inst_pack_unit_nm();
		}
		if ($inst_base_unit_cd.equalsIgnoreCase(name)) {
			return inst_base_unit_cd();
		}
		if ($inst_base_unit_nm.equalsIgnoreCase(name)) {
			return inst_base_unit_nm();
		}
		if ($inst_base_unit_rnd_typ.equalsIgnoreCase(name)) {
			return inst_base_unit_rnd_typ();
		}
		if ($insp_judg_rslt_typ.equalsIgnoreCase(name)) {
			return insp_judg_rslt_typ();
		}
		if ($insp_judg_rslt_typ_nm.equalsIgnoreCase(name)) {
			return insp_judg_rslt_typ_nm();
		}
		if ($quality_typ.equalsIgnoreCase(name)) {
			return quality_typ();
		}
		if ($quality_typ_nm.equalsIgnoreCase(name)) {
			return quality_typ_nm();
		}
		if ($gd_cd.equalsIgnoreCase(name)) {
			return gd_cd();
		}
		if ($gd_nm.equalsIgnoreCase(name)) {
			return gd_nm();
		}
		if ($dfct_rsn_cd.equalsIgnoreCase(name)) {
			return dfct_rsn_cd();
		}
		if ($dfct_rsn_nm.equalsIgnoreCase(name)) {
			return dfct_rsn_nm();
		}
		if ($smpl_inst_unit_cd.equalsIgnoreCase(name)) {
			return smpl_inst_unit_cd();
		}
		if ($smpl_inst_unit_nm.equalsIgnoreCase(name)) {
			return smpl_inst_unit_nm();
		}
		if ($calc_pd_typ.equalsIgnoreCase(name)) {
			return calc_pd_typ();
		}
		if ($calc_pd_typ_nm.equalsIgnoreCase(name)) {
			return calc_pd_typ_nm();
		}
		if ($lmt_dt_frm_typ.equalsIgnoreCase(name)) {
			return lmt_dt_frm_typ();
		}
		if ($lmt_dt_frm_typ_nm.equalsIgnoreCase(name)) {
			return lmt_dt_frm_typ_nm();
		}
		if ($lmt_ctl_categ.equalsIgnoreCase(name)) {
			return lmt_ctl_categ();
		}
		if ($insp_std_no.equalsIgnoreCase(name)) {
			return insp_std_no();
		}
		if ($act_intr_rmrks.equalsIgnoreCase(name)) {
			return act_intr_rmrks();
		}
		if ($lot_rmrks.equalsIgnoreCase(name)) {
			return lot_rmrks();
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
		if ($to_site_cd.equalsIgnoreCase(name)) {
			return to_site_cd();
		}
		if ($to_site_nm.equalsIgnoreCase(name)) {
			return to_site_nm();
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
		if ($bp_lot_no.equalsIgnoreCase(name)) {
			return bp_lot_no();
		}
		if ($mfg_loc_cd.equalsIgnoreCase(name)) {
			return mfg_loc_cd();
		}
		if ($mfg_loc_nm.equalsIgnoreCase(name)) {
			return mfg_loc_nm();
		}
		if ($loc_cd.equalsIgnoreCase(name)) {
			return loc_cd();
		}
		if ($insp_bind_typ.equalsIgnoreCase(name)) {
			return insp_bind_typ();
		}
		if ($insp_bind_typ_nm.equalsIgnoreCase(name)) {
			return insp_bind_typ_nm();
		}
		if ($src_no1.equalsIgnoreCase(name)) {
			return src_no1();
		}
		if ($src_no2.equalsIgnoreCase(name)) {
			return src_no2();
		}
		if ($ext_sys_cd.equalsIgnoreCase(name)) {
			return ext_sys_cd();
		}
		if ($ext_sys_nm.equalsIgnoreCase(name)) {
			return ext_sys_nm();
		}
		if ($ext_insp_act_no.equalsIgnoreCase(name)) {
			return ext_insp_act_no();
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
		if ($insp_freq.equalsIgnoreCase(name)) {
			return insp_freq();
		}
		if ($inst_pack_unit_dec_place.equalsIgnoreCase(name)) {
			return inst_pack_unit_dec_place();
		}
		if ($inst_base_unit_dec_place.equalsIgnoreCase(name)) {
			return inst_base_unit_dec_place();
		}
		if ($std_insp_point_cnt.equalsIgnoreCase(name)) {
			return std_insp_point_cnt();
		}
		if ($std_insp_cmpl_cnt.equalsIgnoreCase(name)) {
			return std_insp_cmpl_cnt();
		}
		if ($std_insp_cnf_cmpl_cnt.equalsIgnoreCase(name)) {
			return std_insp_cnf_cmpl_cnt();
		}
		if ($smpl_inst_unit_dec_place.equalsIgnoreCase(name)) {
			return smpl_inst_unit_dec_place();
		}
		if ($vld_pd.equalsIgnoreCase(name)) {
			return vld_pd();
		}
		if ($lmt_pd.equalsIgnoreCase(name)) {
			return lmt_pd();
		}
		if ($inst_upd_cntr.equalsIgnoreCase(name)) {
			return inst_upd_cntr();
		}
		if ($act_upd_cntr.equalsIgnoreCase(name)) {
			return act_upd_cntr();
		}
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($inst_dt.equalsIgnoreCase(name)) {
			return inst_dt();
		}
		if ($judg_dt.equalsIgnoreCase(name)) {
			return judg_dt();
		}
		if ($lmt_dt_frm.equalsIgnoreCase(name)) {
			return lmt_dt_frm();
		}
		if ($vld_dt_now.equalsIgnoreCase(name)) {
			return vld_dt_now();
		}
		if ($vld_dt.equalsIgnoreCase(name)) {
			return vld_dt();
		}
		if ($lmt_dt_now.equalsIgnoreCase(name)) {
			return lmt_dt_now();
		}
		if ($lmt_dt.equalsIgnoreCase(name)) {
			return lmt_dt();
		}
		if ($insp_rslt_prnt_tm.equalsIgnoreCase(name)) {
			return insp_rslt_prnt_tm();
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
		if ($std_insp_flg.equalsIgnoreCase(name)) {
			return std_insp_flg();
		}
		if ($std_req_flg.equalsIgnoreCase(name)) {
			return std_req_flg();
		}
		if ($std_cnf_req_flg.equalsIgnoreCase(name)) {
			return std_cnf_req_flg();
		}
		if ($std_cmpl_flg.equalsIgnoreCase(name)) {
			return std_cmpl_flg();
		}
		if ($std_cnf_cmpl_flg.equalsIgnoreCase(name)) {
			return std_cnf_cmpl_flg();
		}
		if ($vld_dt_upd_flg.equalsIgnoreCase(name)) {
			return vld_dt_upd_flg();
		}
		if ($lmt_ctl_flg.equalsIgnoreCase(name)) {
			return lmt_ctl_flg();
		}
		if ($lmt_up_flg.equalsIgnoreCase(name)) {
			return lmt_up_flg();
		}
		if ($in_prmt_insp_flg.equalsIgnoreCase(name)) {
			return in_prmt_insp_flg();
		}
		if ($insp_rslt_prnt_flg.equalsIgnoreCase(name)) {
			return insp_rslt_prnt_flg();
		}
		if ($lims_flg.equalsIgnoreCase(name)) {
			return lims_flg();
		}
		if ($cont_fctr_flg.equalsIgnoreCase(name)) {
			return cont_fctr_flg();
		}
		if ($std_insp_ng_flg.equalsIgnoreCase(name)) {
			return std_insp_ng_flg();
		}
		if ($std_insp_sp_flg.equalsIgnoreCase(name)) {
			return std_insp_sp_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($insp_sts_typ.equalsIgnoreCase(name)) {
			insp_sts_typ(value);
			return;
		}
		if ($insp_sts_typ_nm.equalsIgnoreCase(name)) {
			insp_sts_typ_nm(value);
			return;
		}
		if ($insp_aprv_sts_typ.equalsIgnoreCase(name)) {
			insp_aprv_sts_typ(value);
			return;
		}
		if ($insp_aprv_sts_typ_nm.equalsIgnoreCase(name)) {
			insp_aprv_sts_typ_nm(value);
			return;
		}
		if ($lot_no.equalsIgnoreCase(name)) {
			lot_no(value);
			return;
		}
		if ($sublot_no.equalsIgnoreCase(name)) {
			sublot_no(value);
			return;
		}
		if ($ver_no.equalsIgnoreCase(name)) {
			ver_no(value);
			return;
		}
		if ($insp_no.equalsIgnoreCase(name)) {
			insp_no(value);
			return;
		}
		if ($insp_act_no.equalsIgnoreCase(name)) {
			insp_act_no(value);
			return;
		}
		if ($insp_mtd_typ.equalsIgnoreCase(name)) {
			insp_mtd_typ(value);
			return;
		}
		if ($insp_mtd_typ_nm.equalsIgnoreCase(name)) {
			insp_mtd_typ_nm(value);
			return;
		}
		if ($insp_typ.equalsIgnoreCase(name)) {
			insp_typ(value);
			return;
		}
		if ($insp_typ_nm.equalsIgnoreCase(name)) {
			insp_typ_nm(value);
			return;
		}
		if ($insp_ptn_cd.equalsIgnoreCase(name)) {
			insp_ptn_cd(value);
			return;
		}
		if ($insp_ptn_nm.equalsIgnoreCase(name)) {
			insp_ptn_nm(value);
			return;
		}
		if ($inst_pack_unit_cd.equalsIgnoreCase(name)) {
			inst_pack_unit_cd(value);
			return;
		}
		if ($inst_pack_unit_nm.equalsIgnoreCase(name)) {
			inst_pack_unit_nm(value);
			return;
		}
		if ($inst_base_unit_cd.equalsIgnoreCase(name)) {
			inst_base_unit_cd(value);
			return;
		}
		if ($inst_base_unit_nm.equalsIgnoreCase(name)) {
			inst_base_unit_nm(value);
			return;
		}
		if ($inst_base_unit_rnd_typ.equalsIgnoreCase(name)) {
			inst_base_unit_rnd_typ(value);
			return;
		}
		if ($insp_judg_rslt_typ.equalsIgnoreCase(name)) {
			insp_judg_rslt_typ(value);
			return;
		}
		if ($insp_judg_rslt_typ_nm.equalsIgnoreCase(name)) {
			insp_judg_rslt_typ_nm(value);
			return;
		}
		if ($quality_typ.equalsIgnoreCase(name)) {
			quality_typ(value);
			return;
		}
		if ($quality_typ_nm.equalsIgnoreCase(name)) {
			quality_typ_nm(value);
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
		if ($dfct_rsn_cd.equalsIgnoreCase(name)) {
			dfct_rsn_cd(value);
			return;
		}
		if ($dfct_rsn_nm.equalsIgnoreCase(name)) {
			dfct_rsn_nm(value);
			return;
		}
		if ($smpl_inst_unit_cd.equalsIgnoreCase(name)) {
			smpl_inst_unit_cd(value);
			return;
		}
		if ($smpl_inst_unit_nm.equalsIgnoreCase(name)) {
			smpl_inst_unit_nm(value);
			return;
		}
		if ($calc_pd_typ.equalsIgnoreCase(name)) {
			calc_pd_typ(value);
			return;
		}
		if ($calc_pd_typ_nm.equalsIgnoreCase(name)) {
			calc_pd_typ_nm(value);
			return;
		}
		if ($lmt_dt_frm_typ.equalsIgnoreCase(name)) {
			lmt_dt_frm_typ(value);
			return;
		}
		if ($lmt_dt_frm_typ_nm.equalsIgnoreCase(name)) {
			lmt_dt_frm_typ_nm(value);
			return;
		}
		if ($lmt_ctl_categ.equalsIgnoreCase(name)) {
			lmt_ctl_categ(value);
			return;
		}
		if ($insp_std_no.equalsIgnoreCase(name)) {
			insp_std_no(value);
			return;
		}
		if ($act_intr_rmrks.equalsIgnoreCase(name)) {
			act_intr_rmrks(value);
			return;
		}
		if ($lot_rmrks.equalsIgnoreCase(name)) {
			lot_rmrks(value);
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
		if ($to_site_cd.equalsIgnoreCase(name)) {
			to_site_cd(value);
			return;
		}
		if ($to_site_nm.equalsIgnoreCase(name)) {
			to_site_nm(value);
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
		if ($bp_lot_no.equalsIgnoreCase(name)) {
			bp_lot_no(value);
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
		if ($loc_cd.equalsIgnoreCase(name)) {
			loc_cd(value);
			return;
		}
		if ($insp_bind_typ.equalsIgnoreCase(name)) {
			insp_bind_typ(value);
			return;
		}
		if ($insp_bind_typ_nm.equalsIgnoreCase(name)) {
			insp_bind_typ_nm(value);
			return;
		}
		if ($src_no1.equalsIgnoreCase(name)) {
			src_no1(value);
			return;
		}
		if ($src_no2.equalsIgnoreCase(name)) {
			src_no2(value);
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
		if ($ext_insp_act_no.equalsIgnoreCase(name)) {
			ext_insp_act_no(value);
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
		if ($insp_freq.equalsIgnoreCase(name)) {
			insp_freq(value);
			return;
		}
		if ($inst_pack_unit_dec_place.equalsIgnoreCase(name)) {
			inst_pack_unit_dec_place(value);
			return;
		}
		if ($inst_base_unit_dec_place.equalsIgnoreCase(name)) {
			inst_base_unit_dec_place(value);
			return;
		}
		if ($std_insp_point_cnt.equalsIgnoreCase(name)) {
			std_insp_point_cnt(value);
			return;
		}
		if ($std_insp_cmpl_cnt.equalsIgnoreCase(name)) {
			std_insp_cmpl_cnt(value);
			return;
		}
		if ($std_insp_cnf_cmpl_cnt.equalsIgnoreCase(name)) {
			std_insp_cnf_cmpl_cnt(value);
			return;
		}
		if ($smpl_inst_unit_dec_place.equalsIgnoreCase(name)) {
			smpl_inst_unit_dec_place(value);
			return;
		}
		if ($vld_pd.equalsIgnoreCase(name)) {
			vld_pd(value);
			return;
		}
		if ($lmt_pd.equalsIgnoreCase(name)) {
			lmt_pd(value);
			return;
		}
		if ($inst_upd_cntr.equalsIgnoreCase(name)) {
			inst_upd_cntr(value);
			return;
		}
		if ($act_upd_cntr.equalsIgnoreCase(name)) {
			act_upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($insp_freq.equalsIgnoreCase(name)) {
			insp_freq(value);
			return;
		}
		if ($inst_pack_unit_dec_place.equalsIgnoreCase(name)) {
			inst_pack_unit_dec_place(value);
			return;
		}
		if ($inst_base_unit_dec_place.equalsIgnoreCase(name)) {
			inst_base_unit_dec_place(value);
			return;
		}
		if ($std_insp_point_cnt.equalsIgnoreCase(name)) {
			std_insp_point_cnt(value);
			return;
		}
		if ($std_insp_cmpl_cnt.equalsIgnoreCase(name)) {
			std_insp_cmpl_cnt(value);
			return;
		}
		if ($std_insp_cnf_cmpl_cnt.equalsIgnoreCase(name)) {
			std_insp_cnf_cmpl_cnt(value);
			return;
		}
		if ($smpl_inst_unit_dec_place.equalsIgnoreCase(name)) {
			smpl_inst_unit_dec_place(value);
			return;
		}
		if ($vld_pd.equalsIgnoreCase(name)) {
			vld_pd(value);
			return;
		}
		if ($lmt_pd.equalsIgnoreCase(name)) {
			lmt_pd(value);
			return;
		}
		if ($inst_upd_cntr.equalsIgnoreCase(name)) {
			inst_upd_cntr(value);
			return;
		}
		if ($act_upd_cntr.equalsIgnoreCase(name)) {
			act_upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($insp_freq.equalsIgnoreCase(name)) {
			insp_freq(value);
			return;
		}
		if ($inst_pack_unit_dec_place.equalsIgnoreCase(name)) {
			inst_pack_unit_dec_place(value);
			return;
		}
		if ($inst_base_unit_dec_place.equalsIgnoreCase(name)) {
			inst_base_unit_dec_place(value);
			return;
		}
		if ($std_insp_point_cnt.equalsIgnoreCase(name)) {
			std_insp_point_cnt(value);
			return;
		}
		if ($std_insp_cmpl_cnt.equalsIgnoreCase(name)) {
			std_insp_cmpl_cnt(value);
			return;
		}
		if ($std_insp_cnf_cmpl_cnt.equalsIgnoreCase(name)) {
			std_insp_cnf_cmpl_cnt(value);
			return;
		}
		if ($smpl_inst_unit_dec_place.equalsIgnoreCase(name)) {
			smpl_inst_unit_dec_place(value);
			return;
		}
		if ($vld_pd.equalsIgnoreCase(name)) {
			vld_pd(value);
			return;
		}
		if ($lmt_pd.equalsIgnoreCase(name)) {
			lmt_pd(value);
			return;
		}
		if ($inst_upd_cntr.equalsIgnoreCase(name)) {
			inst_upd_cntr(value);
			return;
		}
		if ($act_upd_cntr.equalsIgnoreCase(name)) {
			act_upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($insp_freq.equalsIgnoreCase(name)) {
			insp_freq(value);
			return;
		}
		if ($inst_pack_unit_dec_place.equalsIgnoreCase(name)) {
			inst_pack_unit_dec_place(value);
			return;
		}
		if ($inst_base_unit_dec_place.equalsIgnoreCase(name)) {
			inst_base_unit_dec_place(value);
			return;
		}
		if ($std_insp_point_cnt.equalsIgnoreCase(name)) {
			std_insp_point_cnt(value);
			return;
		}
		if ($std_insp_cmpl_cnt.equalsIgnoreCase(name)) {
			std_insp_cmpl_cnt(value);
			return;
		}
		if ($std_insp_cnf_cmpl_cnt.equalsIgnoreCase(name)) {
			std_insp_cnf_cmpl_cnt(value);
			return;
		}
		if ($smpl_inst_unit_dec_place.equalsIgnoreCase(name)) {
			smpl_inst_unit_dec_place(value);
			return;
		}
		if ($vld_pd.equalsIgnoreCase(name)) {
			vld_pd(value);
			return;
		}
		if ($lmt_pd.equalsIgnoreCase(name)) {
			lmt_pd(value);
			return;
		}
		if ($inst_upd_cntr.equalsIgnoreCase(name)) {
			inst_upd_cntr(value);
			return;
		}
		if ($act_upd_cntr.equalsIgnoreCase(name)) {
			act_upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($insp_freq.equalsIgnoreCase(name)) {
			insp_freq(value);
			return;
		}
		if ($inst_pack_unit_dec_place.equalsIgnoreCase(name)) {
			inst_pack_unit_dec_place(value);
			return;
		}
		if ($inst_base_unit_dec_place.equalsIgnoreCase(name)) {
			inst_base_unit_dec_place(value);
			return;
		}
		if ($std_insp_point_cnt.equalsIgnoreCase(name)) {
			std_insp_point_cnt(value);
			return;
		}
		if ($std_insp_cmpl_cnt.equalsIgnoreCase(name)) {
			std_insp_cmpl_cnt(value);
			return;
		}
		if ($std_insp_cnf_cmpl_cnt.equalsIgnoreCase(name)) {
			std_insp_cnf_cmpl_cnt(value);
			return;
		}
		if ($smpl_inst_unit_dec_place.equalsIgnoreCase(name)) {
			smpl_inst_unit_dec_place(value);
			return;
		}
		if ($vld_pd.equalsIgnoreCase(name)) {
			vld_pd(value);
			return;
		}
		if ($lmt_pd.equalsIgnoreCase(name)) {
			lmt_pd(value);
			return;
		}
		if ($inst_upd_cntr.equalsIgnoreCase(name)) {
			inst_upd_cntr(value);
			return;
		}
		if ($act_upd_cntr.equalsIgnoreCase(name)) {
			act_upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($inst_dt.equalsIgnoreCase(name)) {
			inst_dt(value);
			return;
		}
		if ($judg_dt.equalsIgnoreCase(name)) {
			judg_dt(value);
			return;
		}
		if ($lmt_dt_frm.equalsIgnoreCase(name)) {
			lmt_dt_frm(value);
			return;
		}
		if ($vld_dt_now.equalsIgnoreCase(name)) {
			vld_dt_now(value);
			return;
		}
		if ($vld_dt.equalsIgnoreCase(name)) {
			vld_dt(value);
			return;
		}
		if ($lmt_dt_now.equalsIgnoreCase(name)) {
			lmt_dt_now(value);
			return;
		}
		if ($lmt_dt.equalsIgnoreCase(name)) {
			lmt_dt(value);
			return;
		}
		if ($insp_rslt_prnt_tm.equalsIgnoreCase(name)) {
			insp_rslt_prnt_tm(value);
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
		if ($std_insp_flg.equalsIgnoreCase(name)) {
			std_insp_flg(value);
			return;
		}
		if ($std_req_flg.equalsIgnoreCase(name)) {
			std_req_flg(value);
			return;
		}
		if ($std_cnf_req_flg.equalsIgnoreCase(name)) {
			std_cnf_req_flg(value);
			return;
		}
		if ($std_cmpl_flg.equalsIgnoreCase(name)) {
			std_cmpl_flg(value);
			return;
		}
		if ($std_cnf_cmpl_flg.equalsIgnoreCase(name)) {
			std_cnf_cmpl_flg(value);
			return;
		}
		if ($vld_dt_upd_flg.equalsIgnoreCase(name)) {
			vld_dt_upd_flg(value);
			return;
		}
		if ($lmt_ctl_flg.equalsIgnoreCase(name)) {
			lmt_ctl_flg(value);
			return;
		}
		if ($lmt_up_flg.equalsIgnoreCase(name)) {
			lmt_up_flg(value);
			return;
		}
		if ($in_prmt_insp_flg.equalsIgnoreCase(name)) {
			in_prmt_insp_flg(value);
			return;
		}
		if ($insp_rslt_prnt_flg.equalsIgnoreCase(name)) {
			insp_rslt_prnt_flg(value);
			return;
		}
		if ($lims_flg.equalsIgnoreCase(name)) {
			lims_flg(value);
			return;
		}
		if ($cont_fctr_flg.equalsIgnoreCase(name)) {
			cont_fctr_flg(value);
			return;
		}
		if ($std_insp_ng_flg.equalsIgnoreCase(name)) {
			std_insp_ng_flg(value);
			return;
		}
		if ($std_insp_sp_flg.equalsIgnoreCase(name)) {
			std_insp_sp_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($insp_sts_typ.equalsIgnoreCase(name)) {
			insp_sts_typ(value);
			return;
		}
		if ($insp_sts_typ_nm.equalsIgnoreCase(name)) {
			insp_sts_typ_nm(value);
			return;
		}
		if ($insp_aprv_sts_typ.equalsIgnoreCase(name)) {
			insp_aprv_sts_typ(value);
			return;
		}
		if ($insp_aprv_sts_typ_nm.equalsIgnoreCase(name)) {
			insp_aprv_sts_typ_nm(value);
			return;
		}
		if ($lot_no.equalsIgnoreCase(name)) {
			lot_no(value);
			return;
		}
		if ($sublot_no.equalsIgnoreCase(name)) {
			sublot_no(value);
			return;
		}
		if ($ver_no.equalsIgnoreCase(name)) {
			ver_no(value);
			return;
		}
		if ($insp_no.equalsIgnoreCase(name)) {
			insp_no(value);
			return;
		}
		if ($insp_act_no.equalsIgnoreCase(name)) {
			insp_act_no(value);
			return;
		}
		if ($insp_mtd_typ.equalsIgnoreCase(name)) {
			insp_mtd_typ(value);
			return;
		}
		if ($insp_mtd_typ_nm.equalsIgnoreCase(name)) {
			insp_mtd_typ_nm(value);
			return;
		}
		if ($insp_typ.equalsIgnoreCase(name)) {
			insp_typ(value);
			return;
		}
		if ($insp_typ_nm.equalsIgnoreCase(name)) {
			insp_typ_nm(value);
			return;
		}
		if ($insp_ptn_cd.equalsIgnoreCase(name)) {
			insp_ptn_cd(value);
			return;
		}
		if ($insp_ptn_nm.equalsIgnoreCase(name)) {
			insp_ptn_nm(value);
			return;
		}
		if ($inst_pack_unit_cd.equalsIgnoreCase(name)) {
			inst_pack_unit_cd(value);
			return;
		}
		if ($inst_pack_unit_nm.equalsIgnoreCase(name)) {
			inst_pack_unit_nm(value);
			return;
		}
		if ($inst_base_unit_cd.equalsIgnoreCase(name)) {
			inst_base_unit_cd(value);
			return;
		}
		if ($inst_base_unit_nm.equalsIgnoreCase(name)) {
			inst_base_unit_nm(value);
			return;
		}
		if ($inst_base_unit_rnd_typ.equalsIgnoreCase(name)) {
			inst_base_unit_rnd_typ(value);
			return;
		}
		if ($insp_judg_rslt_typ.equalsIgnoreCase(name)) {
			insp_judg_rslt_typ(value);
			return;
		}
		if ($insp_judg_rslt_typ_nm.equalsIgnoreCase(name)) {
			insp_judg_rslt_typ_nm(value);
			return;
		}
		if ($quality_typ.equalsIgnoreCase(name)) {
			quality_typ(value);
			return;
		}
		if ($quality_typ_nm.equalsIgnoreCase(name)) {
			quality_typ_nm(value);
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
		if ($dfct_rsn_cd.equalsIgnoreCase(name)) {
			dfct_rsn_cd(value);
			return;
		}
		if ($dfct_rsn_nm.equalsIgnoreCase(name)) {
			dfct_rsn_nm(value);
			return;
		}
		if ($smpl_inst_unit_cd.equalsIgnoreCase(name)) {
			smpl_inst_unit_cd(value);
			return;
		}
		if ($smpl_inst_unit_nm.equalsIgnoreCase(name)) {
			smpl_inst_unit_nm(value);
			return;
		}
		if ($calc_pd_typ.equalsIgnoreCase(name)) {
			calc_pd_typ(value);
			return;
		}
		if ($calc_pd_typ_nm.equalsIgnoreCase(name)) {
			calc_pd_typ_nm(value);
			return;
		}
		if ($lmt_dt_frm_typ.equalsIgnoreCase(name)) {
			lmt_dt_frm_typ(value);
			return;
		}
		if ($lmt_dt_frm_typ_nm.equalsIgnoreCase(name)) {
			lmt_dt_frm_typ_nm(value);
			return;
		}
		if ($lmt_ctl_categ.equalsIgnoreCase(name)) {
			lmt_ctl_categ(value);
			return;
		}
		if ($insp_std_no.equalsIgnoreCase(name)) {
			insp_std_no(value);
			return;
		}
		if ($act_intr_rmrks.equalsIgnoreCase(name)) {
			act_intr_rmrks(value);
			return;
		}
		if ($lot_rmrks.equalsIgnoreCase(name)) {
			lot_rmrks(value);
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
		if ($to_site_cd.equalsIgnoreCase(name)) {
			to_site_cd(value);
			return;
		}
		if ($to_site_nm.equalsIgnoreCase(name)) {
			to_site_nm(value);
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
		if ($bp_lot_no.equalsIgnoreCase(name)) {
			bp_lot_no(value);
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
		if ($loc_cd.equalsIgnoreCase(name)) {
			loc_cd(value);
			return;
		}
		if ($insp_bind_typ.equalsIgnoreCase(name)) {
			insp_bind_typ(value);
			return;
		}
		if ($insp_bind_typ_nm.equalsIgnoreCase(name)) {
			insp_bind_typ_nm(value);
			return;
		}
		if ($src_no1.equalsIgnoreCase(name)) {
			src_no1(value);
			return;
		}
		if ($src_no2.equalsIgnoreCase(name)) {
			src_no2(value);
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
		if ($ext_insp_act_no.equalsIgnoreCase(name)) {
			ext_insp_act_no(value);
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
		if ($insp_freq.equalsIgnoreCase(name)) {
			insp_freq(value);
			return;
		}
		if ($inst_pack_unit_dec_place.equalsIgnoreCase(name)) {
			inst_pack_unit_dec_place(value);
			return;
		}
		if ($inst_base_unit_dec_place.equalsIgnoreCase(name)) {
			inst_base_unit_dec_place(value);
			return;
		}
		if ($std_insp_point_cnt.equalsIgnoreCase(name)) {
			std_insp_point_cnt(value);
			return;
		}
		if ($std_insp_cmpl_cnt.equalsIgnoreCase(name)) {
			std_insp_cmpl_cnt(value);
			return;
		}
		if ($std_insp_cnf_cmpl_cnt.equalsIgnoreCase(name)) {
			std_insp_cnf_cmpl_cnt(value);
			return;
		}
		if ($smpl_inst_unit_dec_place.equalsIgnoreCase(name)) {
			smpl_inst_unit_dec_place(value);
			return;
		}
		if ($vld_pd.equalsIgnoreCase(name)) {
			vld_pd(value);
			return;
		}
		if ($lmt_pd.equalsIgnoreCase(name)) {
			lmt_pd(value);
			return;
		}
		if ($inst_upd_cntr.equalsIgnoreCase(name)) {
			inst_upd_cntr(value);
			return;
		}
		if ($act_upd_cntr.equalsIgnoreCase(name)) {
			act_upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($insp_freq.equalsIgnoreCase(name)) {
			insp_freq(value);
			return;
		}
		if ($inst_pack_unit_dec_place.equalsIgnoreCase(name)) {
			inst_pack_unit_dec_place(value);
			return;
		}
		if ($inst_base_unit_dec_place.equalsIgnoreCase(name)) {
			inst_base_unit_dec_place(value);
			return;
		}
		if ($std_insp_point_cnt.equalsIgnoreCase(name)) {
			std_insp_point_cnt(value);
			return;
		}
		if ($std_insp_cmpl_cnt.equalsIgnoreCase(name)) {
			std_insp_cmpl_cnt(value);
			return;
		}
		if ($std_insp_cnf_cmpl_cnt.equalsIgnoreCase(name)) {
			std_insp_cnf_cmpl_cnt(value);
			return;
		}
		if ($smpl_inst_unit_dec_place.equalsIgnoreCase(name)) {
			smpl_inst_unit_dec_place(value);
			return;
		}
		if ($vld_pd.equalsIgnoreCase(name)) {
			vld_pd(value);
			return;
		}
		if ($lmt_pd.equalsIgnoreCase(name)) {
			lmt_pd(value);
			return;
		}
		if ($inst_upd_cntr.equalsIgnoreCase(name)) {
			inst_upd_cntr(value);
			return;
		}
		if ($act_upd_cntr.equalsIgnoreCase(name)) {
			act_upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($insp_freq.equalsIgnoreCase(name)) {
			insp_freq(value);
			return;
		}
		if ($inst_pack_unit_dec_place.equalsIgnoreCase(name)) {
			inst_pack_unit_dec_place(value);
			return;
		}
		if ($inst_base_unit_dec_place.equalsIgnoreCase(name)) {
			inst_base_unit_dec_place(value);
			return;
		}
		if ($std_insp_point_cnt.equalsIgnoreCase(name)) {
			std_insp_point_cnt(value);
			return;
		}
		if ($std_insp_cmpl_cnt.equalsIgnoreCase(name)) {
			std_insp_cmpl_cnt(value);
			return;
		}
		if ($std_insp_cnf_cmpl_cnt.equalsIgnoreCase(name)) {
			std_insp_cnf_cmpl_cnt(value);
			return;
		}
		if ($smpl_inst_unit_dec_place.equalsIgnoreCase(name)) {
			smpl_inst_unit_dec_place(value);
			return;
		}
		if ($vld_pd.equalsIgnoreCase(name)) {
			vld_pd(value);
			return;
		}
		if ($lmt_pd.equalsIgnoreCase(name)) {
			lmt_pd(value);
			return;
		}
		if ($inst_upd_cntr.equalsIgnoreCase(name)) {
			inst_upd_cntr(value);
			return;
		}
		if ($act_upd_cntr.equalsIgnoreCase(name)) {
			act_upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($insp_freq.equalsIgnoreCase(name)) {
			insp_freq(value);
			return;
		}
		if ($inst_pack_unit_dec_place.equalsIgnoreCase(name)) {
			inst_pack_unit_dec_place(value);
			return;
		}
		if ($inst_base_unit_dec_place.equalsIgnoreCase(name)) {
			inst_base_unit_dec_place(value);
			return;
		}
		if ($std_insp_point_cnt.equalsIgnoreCase(name)) {
			std_insp_point_cnt(value);
			return;
		}
		if ($std_insp_cmpl_cnt.equalsIgnoreCase(name)) {
			std_insp_cmpl_cnt(value);
			return;
		}
		if ($std_insp_cnf_cmpl_cnt.equalsIgnoreCase(name)) {
			std_insp_cnf_cmpl_cnt(value);
			return;
		}
		if ($smpl_inst_unit_dec_place.equalsIgnoreCase(name)) {
			smpl_inst_unit_dec_place(value);
			return;
		}
		if ($vld_pd.equalsIgnoreCase(name)) {
			vld_pd(value);
			return;
		}
		if ($lmt_pd.equalsIgnoreCase(name)) {
			lmt_pd(value);
			return;
		}
		if ($inst_upd_cntr.equalsIgnoreCase(name)) {
			inst_upd_cntr(value);
			return;
		}
		if ($act_upd_cntr.equalsIgnoreCase(name)) {
			act_upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($insp_freq.equalsIgnoreCase(name)) {
			insp_freq(value);
			return;
		}
		if ($inst_pack_unit_dec_place.equalsIgnoreCase(name)) {
			inst_pack_unit_dec_place(value);
			return;
		}
		if ($inst_base_unit_dec_place.equalsIgnoreCase(name)) {
			inst_base_unit_dec_place(value);
			return;
		}
		if ($std_insp_point_cnt.equalsIgnoreCase(name)) {
			std_insp_point_cnt(value);
			return;
		}
		if ($std_insp_cmpl_cnt.equalsIgnoreCase(name)) {
			std_insp_cmpl_cnt(value);
			return;
		}
		if ($std_insp_cnf_cmpl_cnt.equalsIgnoreCase(name)) {
			std_insp_cnf_cmpl_cnt(value);
			return;
		}
		if ($smpl_inst_unit_dec_place.equalsIgnoreCase(name)) {
			smpl_inst_unit_dec_place(value);
			return;
		}
		if ($vld_pd.equalsIgnoreCase(name)) {
			vld_pd(value);
			return;
		}
		if ($lmt_pd.equalsIgnoreCase(name)) {
			lmt_pd(value);
			return;
		}
		if ($inst_upd_cntr.equalsIgnoreCase(name)) {
			inst_upd_cntr(value);
			return;
		}
		if ($act_upd_cntr.equalsIgnoreCase(name)) {
			act_upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($inst_dt.equalsIgnoreCase(name)) {
			inst_dt(value);
			return;
		}
		if ($judg_dt.equalsIgnoreCase(name)) {
			judg_dt(value);
			return;
		}
		if ($lmt_dt_frm.equalsIgnoreCase(name)) {
			lmt_dt_frm(value);
			return;
		}
		if ($vld_dt_now.equalsIgnoreCase(name)) {
			vld_dt_now(value);
			return;
		}
		if ($vld_dt.equalsIgnoreCase(name)) {
			vld_dt(value);
			return;
		}
		if ($lmt_dt_now.equalsIgnoreCase(name)) {
			lmt_dt_now(value);
			return;
		}
		if ($lmt_dt.equalsIgnoreCase(name)) {
			lmt_dt(value);
			return;
		}
		if ($insp_rslt_prnt_tm.equalsIgnoreCase(name)) {
			insp_rslt_prnt_tm(value);
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
		if ($std_insp_flg.equalsIgnoreCase(name)) {
			std_insp_flg(value);
			return;
		}
		if ($std_req_flg.equalsIgnoreCase(name)) {
			std_req_flg(value);
			return;
		}
		if ($std_cnf_req_flg.equalsIgnoreCase(name)) {
			std_cnf_req_flg(value);
			return;
		}
		if ($std_cmpl_flg.equalsIgnoreCase(name)) {
			std_cmpl_flg(value);
			return;
		}
		if ($std_cnf_cmpl_flg.equalsIgnoreCase(name)) {
			std_cnf_cmpl_flg(value);
			return;
		}
		if ($vld_dt_upd_flg.equalsIgnoreCase(name)) {
			vld_dt_upd_flg(value);
			return;
		}
		if ($lmt_ctl_flg.equalsIgnoreCase(name)) {
			lmt_ctl_flg(value);
			return;
		}
		if ($lmt_up_flg.equalsIgnoreCase(name)) {
			lmt_up_flg(value);
			return;
		}
		if ($in_prmt_insp_flg.equalsIgnoreCase(name)) {
			in_prmt_insp_flg(value);
			return;
		}
		if ($insp_rslt_prnt_flg.equalsIgnoreCase(name)) {
			insp_rslt_prnt_flg(value);
			return;
		}
		if ($lims_flg.equalsIgnoreCase(name)) {
			lims_flg(value);
			return;
		}
		if ($cont_fctr_flg.equalsIgnoreCase(name)) {
			cont_fctr_flg(value);
			return;
		}
		if ($std_insp_ng_flg.equalsIgnoreCase(name)) {
			std_insp_ng_flg(value);
			return;
		}
		if ($std_insp_sp_flg.equalsIgnoreCase(name)) {
			std_insp_sp_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}

	public MCRow getInnerRow(String name) {
		if ($itm_p.equalsIgnoreCase(name)) {
			return itm_p();
		}
		if ($inst_pack_unit_qty_p.equalsIgnoreCase(name)) {
			return inst_pack_unit_qty_p();
		}
		if ($inst_base_unit_qty_p.equalsIgnoreCase(name)) {
			return inst_base_unit_qty_p();
		}
		if ($act_ttl_qty_p.equalsIgnoreCase(name)) {
			return act_ttl_qty_p();
		}
		if ($inst_st_dt_p.equalsIgnoreCase(name)) {
			return inst_st_dt_p();
		}
		if ($inst_end_dt_p.equalsIgnoreCase(name)) {
			return inst_end_dt_p();
		}
		if ($st_dt_p.equalsIgnoreCase(name)) {
			return st_dt_p();
		}
		if ($end_dt_p.equalsIgnoreCase(name)) {
			return end_dt_p();
		}
		if ($rem_base_unit_qty_p.equalsIgnoreCase(name)) {
			return rem_base_unit_qty_p();
		}
		if ($good_qty_p.equalsIgnoreCase(name)) {
			return good_qty_p();
		}
		if ($dfct_qty_p.equalsIgnoreCase(name)) {
			return dfct_qty_p();
		}
		if ($act_usr_cd_p.equalsIgnoreCase(name)) {
			return act_usr_cd_p();
		}
		if ($judg_usr_cd_p.equalsIgnoreCase(name)) {
			return judg_usr_cd_p();
		}
		if ($judg_rsn_p.equalsIgnoreCase(name)) {
			return judg_rsn_p();
		}
		if ($smpl_inst_qty_p.equalsIgnoreCase(name)) {
			return smpl_inst_qty_p();
		}
		if ($std_cont_fctr_p.equalsIgnoreCase(name)) {
			return std_cont_fctr_p();
		}
		if ($act_cont_fctr_p.equalsIgnoreCase(name)) {
			return act_cont_fctr_p();
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
		if ($inst_pack_unit_qty_p.equalsIgnoreCase(name)) {
			inst_pack_unit_qty_p(
				((MCContainerMeta) inst_pack_unit_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($inst_base_unit_qty_p.equalsIgnoreCase(name)) {
			inst_base_unit_qty_p(
				((MCContainerMeta) inst_base_unit_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($act_ttl_qty_p.equalsIgnoreCase(name)) {
			act_ttl_qty_p(
				((MCContainerMeta) act_ttl_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($inst_st_dt_p.equalsIgnoreCase(name)) {
			inst_st_dt_p(
				((MCContainerMeta) inst_st_dt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5320.YmdHmR.class, value)
			);
			return;
		}
		if ($inst_end_dt_p.equalsIgnoreCase(name)) {
			inst_end_dt_p(
				((MCContainerMeta) inst_end_dt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5320.YmdHmR.class, value)
			);
			return;
		}
		if ($st_dt_p.equalsIgnoreCase(name)) {
			st_dt_p(
				((MCContainerMeta) st_dt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5320.YmdHmR.class, value)
			);
			return;
		}
		if ($end_dt_p.equalsIgnoreCase(name)) {
			end_dt_p(
				((MCContainerMeta) end_dt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5320.YmdHmR.class, value)
			);
			return;
		}
		if ($rem_base_unit_qty_p.equalsIgnoreCase(name)) {
			rem_base_unit_qty_p(
				((MCContainerMeta) rem_base_unit_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($good_qty_p.equalsIgnoreCase(name)) {
			good_qty_p(
				((MCContainerMeta) good_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($dfct_qty_p.equalsIgnoreCase(name)) {
			dfct_qty_p(
				((MCContainerMeta) dfct_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($act_usr_cd_p.equalsIgnoreCase(name)) {
			act_usr_cd_p(
				((MCContainerMeta) act_usr_cd_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5230.UsrDptR.class, value)
			);
			return;
		}
		if ($judg_usr_cd_p.equalsIgnoreCase(name)) {
			judg_usr_cd_p(
				((MCContainerMeta) judg_usr_cd_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5230.UsrDptR.class, value)
			);
			return;
		}
		if ($judg_rsn_p.equalsIgnoreCase(name)) {
			judg_rsn_p(
				((MCContainerMeta) judg_rsn_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5370.TxtR.class, value)
			);
			return;
		}
		if ($smpl_inst_qty_p.equalsIgnoreCase(name)) {
			smpl_inst_qty_p(
				((MCContainerMeta) smpl_inst_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($std_cont_fctr_p.equalsIgnoreCase(name)) {
			std_cont_fctr_p(
				((MCContainerMeta) std_cont_fctr_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5280.StdContFctrR.class, value)
			);
			return;
		}
		if ($act_cont_fctr_p.equalsIgnoreCase(name)) {
			act_cont_fctr_p(
				((MCContainerMeta) act_cont_fctr_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5290.ActContFctrR.class, value)
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
	 * Order qty. (SKU) 指図数量（荷）.<p>
	 *
	 */
	public MCNumber inst_pack_unit_qty() {
		return inst_pack_unit_qty_p().qty();
	}

	/**
	 * Order qty. (SKU) 指図数量（荷）.<p>
	 *
	 */
	public void inst_pack_unit_qty(MCNumber value) {
		inst_pack_unit_qty_p().qty(value);
	}

	/**
	 * Order qty. (SKU) 指図数量（荷）.<p>
	 *
	 */
	public void inst_pack_unit_qty(int value) {
		inst_pack_unit_qty_p().qty(value);
	}

	/**
	 * Order qty. (SKU) 指図数量（荷）.<p>
	 *
	 */
	public void inst_pack_unit_qty(long value) {
		inst_pack_unit_qty_p().qty(value);
	}

	/**
	 * Order qty. (SKU) 指図数量（荷）.<p>
	 *
	 */
	public void inst_pack_unit_qty(float value) {
		inst_pack_unit_qty_p().qty(value);
	}

	/**
	 * Order qty. (SKU) 指図数量（荷）.<p>
	 *
	 */
	public void inst_pack_unit_qty(double value) {
		inst_pack_unit_qty_p().qty(value);
	}

	/**
	 * Order qty. (Base) 指図数量（基）.<p>
	 *
	 */
	public MCNumber inst_base_unit_qty() {
		return inst_base_unit_qty_p().qty();
	}

	/**
	 * Order qty. (Base) 指図数量（基）.<p>
	 *
	 */
	public void inst_base_unit_qty(MCNumber value) {
		inst_base_unit_qty_p().qty(value);
	}

	/**
	 * Order qty. (Base) 指図数量（基）.<p>
	 *
	 */
	public void inst_base_unit_qty(int value) {
		inst_base_unit_qty_p().qty(value);
	}

	/**
	 * Order qty. (Base) 指図数量（基）.<p>
	 *
	 */
	public void inst_base_unit_qty(long value) {
		inst_base_unit_qty_p().qty(value);
	}

	/**
	 * Order qty. (Base) 指図数量（基）.<p>
	 *
	 */
	public void inst_base_unit_qty(float value) {
		inst_base_unit_qty_p().qty(value);
	}

	/**
	 * Order qty. (Base) 指図数量（基）.<p>
	 *
	 */
	public void inst_base_unit_qty(double value) {
		inst_base_unit_qty_p().qty(value);
	}

	/**
	 * Total inventory qty. at result (Base) 実績時在庫総数量（基）.<p>
	 *
	 */
	public MCNumber act_ttl_qty() {
		return act_ttl_qty_p().qty();
	}

	/**
	 * Total inventory qty. at result (Base) 実績時在庫総数量（基）.<p>
	 *
	 */
	public void act_ttl_qty(MCNumber value) {
		act_ttl_qty_p().qty(value);
	}

	/**
	 * Total inventory qty. at result (Base) 実績時在庫総数量（基）.<p>
	 *
	 */
	public void act_ttl_qty(int value) {
		act_ttl_qty_p().qty(value);
	}

	/**
	 * Total inventory qty. at result (Base) 実績時在庫総数量（基）.<p>
	 *
	 */
	public void act_ttl_qty(long value) {
		act_ttl_qty_p().qty(value);
	}

	/**
	 * Total inventory qty. at result (Base) 実績時在庫総数量（基）.<p>
	 *
	 */
	public void act_ttl_qty(float value) {
		act_ttl_qty_p().qty(value);
	}

	/**
	 * Total inventory qty. at result (Base) 実績時在庫総数量（基）.<p>
	 *
	 */
	public void act_ttl_qty(double value) {
		act_ttl_qty_p().qty(value);
	}

	/**
	 * Scheduled start date 開始予定日.<p>
	 *
	 */
	public MCDate inst_st_dt() {
		return inst_st_dt_p().ymd();
	}

	/**
	 * Scheduled start date 開始予定日.<p>
	 *
	 */
	public void inst_st_dt(MCDate value) {
		inst_st_dt_p().ymd(value);
	}

	/**
	 * Scheduled start time 開始予定時刻.<p>
	 *
	 */
	public MCDate inst_st_hm() {
		return inst_st_dt_p().hm();
	}

	/**
	 * Scheduled start time 開始予定時刻.<p>
	 *
	 */
	public void inst_st_hm(MCDate value) {
		inst_st_dt_p().hm(value);
	}

	/**
	 * Scheduled end date 終了予定日.<p>
	 *
	 */
	public MCDate inst_end_dt() {
		return inst_end_dt_p().ymd();
	}

	/**
	 * Scheduled end date 終了予定日.<p>
	 *
	 */
	public void inst_end_dt(MCDate value) {
		inst_end_dt_p().ymd(value);
	}

	/**
	 * Scheduled end time 終了予定時刻.<p>
	 *
	 */
	public MCDate inst_end_hm() {
		return inst_end_dt_p().hm();
	}

	/**
	 * Scheduled end time 終了予定時刻.<p>
	 *
	 */
	public void inst_end_hm(MCDate value) {
		inst_end_dt_p().hm(value);
	}

	/**
	 * Start date 開始日.<p>
	 *
	 */
	public MCDate st_dt() {
		return st_dt_p().ymd();
	}

	/**
	 * Start date 開始日.<p>
	 *
	 */
	public void st_dt(MCDate value) {
		st_dt_p().ymd(value);
	}

	/**
	 * Start time 開始時刻.<p>
	 *
	 */
	public MCDate st_hm() {
		return st_dt_p().hm();
	}

	/**
	 * Start time 開始時刻.<p>
	 *
	 */
	public void st_hm(MCDate value) {
		st_dt_p().hm(value);
	}

	/**
	 * End date 終了日.<p>
	 *
	 */
	public MCDate end_dt() {
		return end_dt_p().ymd();
	}

	/**
	 * End date 終了日.<p>
	 *
	 */
	public void end_dt(MCDate value) {
		end_dt_p().ymd(value);
	}

	/**
	 * End time 終了時刻.<p>
	 *
	 */
	public MCDate end_hm() {
		return end_dt_p().hm();
	}

	/**
	 * End time 終了時刻.<p>
	 *
	 */
	public void end_hm(MCDate value) {
		end_dt_p().hm(value);
	}

	/**
	 * Remaining qty. (Base unit) 残数量（基）.<p>
	 *
	 */
	public MCNumber rem_base_unit_qty() {
		return rem_base_unit_qty_p().qty();
	}

	/**
	 * Remaining qty. (Base unit) 残数量（基）.<p>
	 *
	 */
	public void rem_base_unit_qty(MCNumber value) {
		rem_base_unit_qty_p().qty(value);
	}

	/**
	 * Remaining qty. (Base unit) 残数量（基）.<p>
	 *
	 */
	public void rem_base_unit_qty(int value) {
		rem_base_unit_qty_p().qty(value);
	}

	/**
	 * Remaining qty. (Base unit) 残数量（基）.<p>
	 *
	 */
	public void rem_base_unit_qty(long value) {
		rem_base_unit_qty_p().qty(value);
	}

	/**
	 * Remaining qty. (Base unit) 残数量（基）.<p>
	 *
	 */
	public void rem_base_unit_qty(float value) {
		rem_base_unit_qty_p().qty(value);
	}

	/**
	 * Remaining qty. (Base unit) 残数量（基）.<p>
	 *
	 */
	public void rem_base_unit_qty(double value) {
		rem_base_unit_qty_p().qty(value);
	}

	/**
	 * Conforming qty. (Base) 良品数量（基）.<p>
	 *
	 */
	public MCNumber good_qty() {
		return good_qty_p().qty();
	}

	/**
	 * Conforming qty. (Base) 良品数量（基）.<p>
	 *
	 */
	public void good_qty(MCNumber value) {
		good_qty_p().qty(value);
	}

	/**
	 * Conforming qty. (Base) 良品数量（基）.<p>
	 *
	 */
	public void good_qty(int value) {
		good_qty_p().qty(value);
	}

	/**
	 * Conforming qty. (Base) 良品数量（基）.<p>
	 *
	 */
	public void good_qty(long value) {
		good_qty_p().qty(value);
	}

	/**
	 * Conforming qty. (Base) 良品数量（基）.<p>
	 *
	 */
	public void good_qty(float value) {
		good_qty_p().qty(value);
	}

	/**
	 * Conforming qty. (Base) 良品数量（基）.<p>
	 *
	 */
	public void good_qty(double value) {
		good_qty_p().qty(value);
	}

	/**
	 * Defective item qty. (Base) 不良品数量（基）.<p>
	 *
	 */
	public MCNumber dfct_qty() {
		return dfct_qty_p().qty();
	}

	/**
	 * Defective item qty. (Base) 不良品数量（基）.<p>
	 *
	 */
	public void dfct_qty(MCNumber value) {
		dfct_qty_p().qty(value);
	}

	/**
	 * Defective item qty. (Base) 不良品数量（基）.<p>
	 *
	 */
	public void dfct_qty(int value) {
		dfct_qty_p().qty(value);
	}

	/**
	 * Defective item qty. (Base) 不良品数量（基）.<p>
	 *
	 */
	public void dfct_qty(long value) {
		dfct_qty_p().qty(value);
	}

	/**
	 * Defective item qty. (Base) 不良品数量（基）.<p>
	 *
	 */
	public void dfct_qty(float value) {
		dfct_qty_p().qty(value);
	}

	/**
	 * Defective item qty. (Base) 不良品数量（基）.<p>
	 *
	 */
	public void dfct_qty(double value) {
		dfct_qty_p().qty(value);
	}

	/**
	 * Result PIC cd. 実績担当者ＣＤ.<p>
	 *
	 */
	public String act_usr_cd() {
		return act_usr_cd_p().usr_cd();
	}

	/**
	 * Result PIC cd. 実績担当者ＣＤ.<p>
	 *
	 */
	public void act_usr_cd(String value) {
		act_usr_cd_p().usr_cd(value);
	}

	/**
	 * Result PIC name 実績担当者名.<p>
	 *
	 */
	public String act_usr_nm() {
		return act_usr_cd_p().usr_nm();
	}

	/**
	 * Result PIC name 実績担当者名.<p>
	 *
	 */
	public void act_usr_nm(String value) {
		act_usr_cd_p().usr_nm(value);
	}

	/**
	 * Result dept. cd. 実績部門ＣＤ.<p>
	 *
	 */
	public String act_dpt_cd() {
		return act_usr_cd_p().dpt_cd();
	}

	/**
	 * Result dept. cd. 実績部門ＣＤ.<p>
	 *
	 */
	public void act_dpt_cd(String value) {
		act_usr_cd_p().dpt_cd(value);
	}

	/**
	 * Result dept. name 実績部門名.<p>
	 *
	 */
	public String act_dpt_nm() {
		return act_usr_cd_p().dpt_nm();
	}

	/**
	 * Result dept. name 実績部門名.<p>
	 *
	 */
	public void act_dpt_nm(String value) {
		act_usr_cd_p().dpt_nm(value);
	}

	/**
	 * Decision PIC cd. 判定者ＣＤ.<p>
	 *
	 */
	public String judg_usr_cd() {
		return judg_usr_cd_p().usr_cd();
	}

	/**
	 * Decision PIC cd. 判定者ＣＤ.<p>
	 *
	 */
	public void judg_usr_cd(String value) {
		judg_usr_cd_p().usr_cd(value);
	}

	/**
	 * Decision PIC name 判定者名.<p>
	 *
	 */
	public String judg_usr_nm() {
		return judg_usr_cd_p().usr_nm();
	}

	/**
	 * Decision PIC name 判定者名.<p>
	 *
	 */
	public void judg_usr_nm(String value) {
		judg_usr_cd_p().usr_nm(value);
	}

	/**
	 * Decision dept. cd. 判定部門ＣＤ.<p>
	 *
	 */
	public String judg_dpt_cd() {
		return judg_usr_cd_p().dpt_cd();
	}

	/**
	 * Decision dept. cd. 判定部門ＣＤ.<p>
	 *
	 */
	public void judg_dpt_cd(String value) {
		judg_usr_cd_p().dpt_cd(value);
	}

	/**
	 * Decision dept. name 判定部門名.<p>
	 *
	 */
	public String judg_dpt_nm() {
		return judg_usr_cd_p().dpt_nm();
	}

	/**
	 * Decision dept. name 判定部門名.<p>
	 *
	 */
	public void judg_dpt_nm(String value) {
		judg_usr_cd_p().dpt_nm(value);
	}

	/**
	 * Decision reason 判定理由.<p>
	 *
	 */
	public String judg_rsn() {
		return judg_rsn_p().txt();
	}

	/**
	 * Decision reason 判定理由.<p>
	 *
	 */
	public void judg_rsn(String value) {
		judg_rsn_p().txt(value);
	}

	/**
	 * Sampling order qty. 抜取指図数.<p>
	 *
	 */
	public MCNumber smpl_inst_qty() {
		return smpl_inst_qty_p().qty();
	}

	/**
	 * Sampling order qty. 抜取指図数.<p>
	 *
	 */
	public void smpl_inst_qty(MCNumber value) {
		smpl_inst_qty_p().qty(value);
	}

	/**
	 * Sampling order qty. 抜取指図数.<p>
	 *
	 */
	public void smpl_inst_qty(int value) {
		smpl_inst_qty_p().qty(value);
	}

	/**
	 * Sampling order qty. 抜取指図数.<p>
	 *
	 */
	public void smpl_inst_qty(long value) {
		smpl_inst_qty_p().qty(value);
	}

	/**
	 * Sampling order qty. 抜取指図数.<p>
	 *
	 */
	public void smpl_inst_qty(float value) {
		smpl_inst_qty_p().qty(value);
	}

	/**
	 * Sampling order qty. 抜取指図数.<p>
	 *
	 */
	public void smpl_inst_qty(double value) {
		smpl_inst_qty_p().qty(value);
	}

	/**
	 * Standard coefficient 標準係数.<p>
	 *
	 */
	public MCNumber std_cont_fctr() {
		return std_cont_fctr_p().std_cont_fctr();
	}

	/**
	 * Standard coefficient 標準係数.<p>
	 *
	 */
	public void std_cont_fctr(MCNumber value) {
		std_cont_fctr_p().std_cont_fctr(value);
	}

	/**
	 * Standard coefficient 標準係数.<p>
	 *
	 */
	public void std_cont_fctr(int value) {
		std_cont_fctr_p().std_cont_fctr(value);
	}

	/**
	 * Standard coefficient 標準係数.<p>
	 *
	 */
	public void std_cont_fctr(long value) {
		std_cont_fctr_p().std_cont_fctr(value);
	}

	/**
	 * Standard coefficient 標準係数.<p>
	 *
	 */
	public void std_cont_fctr(float value) {
		std_cont_fctr_p().std_cont_fctr(value);
	}

	/**
	 * Standard coefficient 標準係数.<p>
	 *
	 */
	public void std_cont_fctr(double value) {
		std_cont_fctr_p().std_cont_fctr(value);
	}

	/**
	 * Actual coefficient 実際係数.<p>
	 *
	 */
	public MCNumber act_cont_fctr() {
		return act_cont_fctr_p().act_cont_fctr();
	}

	/**
	 * Actual coefficient 実際係数.<p>
	 *
	 */
	public void act_cont_fctr(MCNumber value) {
		act_cont_fctr_p().act_cont_fctr(value);
	}

	/**
	 * Actual coefficient 実際係数.<p>
	 *
	 */
	public void act_cont_fctr(int value) {
		act_cont_fctr_p().act_cont_fctr(value);
	}

	/**
	 * Actual coefficient 実際係数.<p>
	 *
	 */
	public void act_cont_fctr(long value) {
		act_cont_fctr_p().act_cont_fctr(value);
	}

	/**
	 * Actual coefficient 実際係数.<p>
	 *
	 */
	public void act_cont_fctr(float value) {
		act_cont_fctr_p().act_cont_fctr(value);
	}

	/**
	 * Actual coefficient 実際係数.<p>
	 *
	 */
	public void act_cont_fctr(double value) {
		act_cont_fctr_p().act_cont_fctr(value);
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

