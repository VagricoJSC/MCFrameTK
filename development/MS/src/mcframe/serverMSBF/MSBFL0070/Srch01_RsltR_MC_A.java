package mcframe.serverMSBF.MSBFL0070;

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
 * ブロック"Srch01_Rslt"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class Srch01_RsltR_MC_A extends MCConstRow {

	/**
	 * Item 品目.<p>
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
	/**
	 * Order qty. (SKU) 指図数量（荷）.<p>
	 *
	 */
	public static final String $inst_pack_unit_qty = "inst_pack_unit_qty";
	/**
	 * SKU 荷姿単位.<p>
	 *
	 */
	public static final String $pack_unit_cd = "pack_unit_cd";
	/**
	 * SKU name 荷姿単位名.<p>
	 *
	 */
	public static final String $pack_unit_nm = "pack_unit_nm";
	/**
	 * SKU number of decimal places 荷姿単位小数部有効桁数.<p>
	 *
	 */
	public static final String $pack_unit_dec_place = "pack_unit_dec_place";
	/**
	 * Order qty. (Base) 指図数量（基）.<p>
	 *
	 */
	public static final String $inst_base_unit_qty = "inst_base_unit_qty";
	/**
	 * Remaining (Base unit) 残数（基）.<p>
	 *
	 */
	public static final String $rem_base_unit_qty = "rem_base_unit_qty";
	/**
	 * Base unit 基準単位.<p>
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
	/**
	 * Conforming qty. 良品数量.<p>
	 *
	 */
	public static final String $good_qty = "good_qty";
	/**
	 * Defective qty. 不良品数量.<p>
	 *
	 */
	public static final String $dfct_qty = "dfct_qty";
	/**
	 * Total inventory qty. at result 実績時在庫総数.<p>
	 *
	 */
	public static final String $act_ttl_qty = "act_ttl_qty";
	/**
	 * Inventory total qty. at decision 判定時在庫総数.<p>
	 *
	 */
	public static final String $judg_ttl_qty = "judg_ttl_qty";
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
	 * Supplier 発注先.<p>
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
	 * Specific result confirmation required 規格実績確認必須.<p>
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
	 * Inspection report printed 検査成績書発行済.<p>
	 *
	 */
	public static final String $insp_rslt_prnt_flg = "insp_rslt_prnt_flg";
	/**
	 * Inspection report printed date and time 検査成績書発行日時.<p>
	 *
	 */
	public static final String $insp_rslt_prnt_tm = "insp_rslt_prnt_tm";
	/**
	 * Start date 開始日.<p>
	 *
	 */
	public static final String $st_dt = "st_dt";
	/**
	 * Start time 開始時刻.<p>
	 *
	 */
	public static final String $st_hm = "st_hm";
	/**
	 * End date 終了日.<p>
	 *
	 */
	public static final String $end_dt = "end_dt";
	/**
	 * End time 終了時刻.<p>
	 *
	 */
	public static final String $end_hm = "end_hm";
	/**
	 * PIC 担当者.<p>
	 *
	 */
	public static final String $act_usr_cd = "act_usr_cd";
	/**
	 * PIC name 担当者名.<p>
	 *
	 */
	public static final String $act_usr_nm = "act_usr_nm";
	/**
	 * Dept. in charge 担当部門.<p>
	 *
	 */
	public static final String $act_dpt_cd = "act_dpt_cd";
	/**
	 * Dept. in charge name 担当部門名.<p>
	 *
	 */
	public static final String $act_dpt_nm = "act_dpt_nm";
	/**
	 * Decision result 判定結果.<p>
	 *
	 */
	public static final String $insp_judg_rslt_typ = "insp_judg_rslt_typ";
	/**
	 * Decision result name 判定結果名.<p>
	 *
	 */
	public static final String $insp_judg_rslt_typ_nm = "insp_judg_rslt_typ_nm";
	/**
	 * Decision date 判定日.<p>
	 *
	 */
	public static final String $judg_dt = "judg_dt";
	/**
	 * Decision PIC 判定者.<p>
	 *
	 */
	public static final String $judg_usr_cd = "judg_usr_cd";
	/**
	 * Decision PIC name 判定者名.<p>
	 *
	 */
	public static final String $judg_usr_nm = "judg_usr_nm";
	/**
	 * Decision dept. 判定部門.<p>
	 *
	 */
	public static final String $judg_dpt_cd = "judg_dpt_cd";
	/**
	 * Decision dept. name 判定部門名.<p>
	 *
	 */
	public static final String $judg_dpt_nm = "judg_dpt_nm";
	/**
	 * Decision reason 判定理由.<p>
	 *
	 */
	public static final String $judg_rsn = "judg_rsn";
	/**
	 * Defective reason 不良理由.<p>
	 *
	 */
	public static final String $dfct_rsn_cd = "dfct_rsn_cd";
	/**
	 * Defective reason name 不良理由名.<p>
	 *
	 */
	public static final String $dfct_rsn_nm = "dfct_rsn_nm";
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
	 * Grading 格付.<p>
	 *
	 */
	public static final String $gd_cd = "gd_cd";
	/**
	 * Grading name 格付名.<p>
	 *
	 */
	public static final String $gd_nm = "gd_nm";
	/**
	 * Sampling order qty. 抜取指図数量.<p>
	 *
	 */
	public static final String $smpl_inst_qty = "smpl_inst_qty";
	/**
	 * Sampling order unit 抜取指図単位.<p>
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
	/**
	 * Standard coefficient 標準係数.<p>
	 *
	 */
	public static final String $std_cont_fctr = "std_cont_fctr";
	/**
	 * Actual coefficient 実際係数.<p>
	 *
	 */
	public static final String $act_cont_fctr = "act_cont_fctr";
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
	 * Re-inspection for expiration 期限再検査.<p>
	 *
	 */
	public static final String $lmt_up_flg = "lmt_up_flg";
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
	 * Expiration date 有効期限.<p>
	 *
	 */
	public static final String $vld_dt = "vld_dt";
	/**
	 * Usage expiration date 使用期限.<p>
	 *
	 */
	public static final String $lmt_dt = "lmt_dt";
	/**
	 * Current expiration date 現有効期限.<p>
	 *
	 */
	public static final String $vld_dt_now = "vld_dt_now";
	/**
	 * Current usage expiration date 現使用期限.<p>
	 *
	 */
	public static final String $lmt_dt_now = "lmt_dt_now";
	/**
	 * For active ingredient 有効成分対象.<p>
	 *
	 */
	public static final String $cont_fctr_flg = "cont_fctr_flg";
	/**
	 * Result internal remarks 実績内部備考.<p>
	 *
	 */
	public static final String $intr_rmrks = "intr_rmrks";
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
	 * Allow inspecting usage 検査中使用許可.<p>
	 *
	 */
	public static final String $in_prmt_insp_flg = "in_prmt_insp_flg";
	/**
	 * With specific inspection concession 規格検査特採あり.<p>
	 *
	 */
	public static final String $spec_sp_flg = "spec_sp_flg";
	/**
	 * With specific inspection rejected 規格検査不合格あり.<p>
	 *
	 */
	public static final String $spec_ng_flg = "spec_ng_flg";
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
	 * Entry user 登録ユーザ.<p>
	 *
	 */
	public static final String $ins_usr_id = "ins_usr_id";
	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public static final String $ins_usr_nm = "ins_usr_nm";
	/**
	 * Entry function 登録機能.<p>
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
	 * Update user 更新ユーザ.<p>
	 *
	 */
	public static final String $upd_usr_id = "upd_usr_id";
	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public static final String $upd_usr_nm = "upd_usr_nm";
	/**
	 * Update function 更新機能.<p>
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
	 * Request No. リクエストＮＯ.<p>
	 *
	 */
	public static final String $upd_srv_req_no = "upd_srv_req_no";
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
	/**
	 * Inspection pattern cd. 検査パタンＣＤ.<p>
	 *
	 */
	public static final String $insp_ptn_cd = "insp_ptn_cd";
	/**
	 * Factory/Distribution warehouse cd. 工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public static final String $to_site_cd = "to_site_cd";
	/**
	 * Master application date マスタ適用日.<p>
	 *
	 */
	public static final String $master_dt = "master_dt";
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


	public static final MCMeta itm_cd_META = createCommonMeta($itm_cd, mcframe.commonMA.meta.MA_META.ITM_CD);
	public static final MCMeta itm_sub1_META = createCommonMeta($itm_sub1, mcframe.commonMA.meta.MA_META.ITM_SUB1);
	public static final MCMeta itm_sub2_META = createCommonMeta($itm_sub2, mcframe.commonMA.meta.MA_META.ITM_SUB2);
	public static final MCMeta itm_sub3_META = createCommonMeta($itm_sub3, mcframe.commonMA.meta.MA_META.ITM_SUB3);
	public static final MCMeta itm_nm_META = createCommonMeta($itm_nm, mcframe.commonMA.meta.MA_META.ITM_NM);
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
	public static final MCMeta insp_sts_typ_META = createCommonMeta($insp_sts_typ, mcframe.commonMS.meta.MS_META.INSP_STS_TYP);
	public static final MCMeta insp_sts_typ_nm_META = createCommonMeta($insp_sts_typ_nm, mcframe.commonMS.meta.MS_META.INSP_STS_TYP_NM);
	public static final MCMeta insp_aprv_sts_typ_META = createCommonMeta($insp_aprv_sts_typ, mcframe.commonMS.meta.MS_META.INSP_APRV_STS_TYP);
	public static final MCMeta insp_aprv_sts_typ_nm_META = createCommonMeta($insp_aprv_sts_typ_nm, mcframe.commonMS.meta.MS_META.INSP_APRV_STS_TYP_NM);
	public static final MCMeta inst_pack_unit_qty_META = createCommonMeta($inst_pack_unit_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta pack_unit_cd_META = createCommonMeta($pack_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta pack_unit_nm_META = createCommonMeta($pack_unit_nm, mcframe.commonMA.meta.MA_META.UNIT_NM);
	public static final MCMeta pack_unit_dec_place_META = createCommonMeta($pack_unit_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta inst_base_unit_qty_META = createCommonMeta($inst_base_unit_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta rem_base_unit_qty_META = createCommonMeta($rem_base_unit_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta base_unit_cd_META = createCommonMeta($base_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta base_unit_nm_META = createCommonMeta($base_unit_nm, mcframe.commonMA.meta.MA_META.UNIT_NM);
	public static final MCMeta base_unit_dec_place_META = createCommonMeta($base_unit_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta base_unit_rnd_typ_META = createCommonMeta($base_unit_rnd_typ, mcframe.commonMA.meta.MA_META.RND_TYP);
	public static final MCMeta good_qty_META = createCommonMeta($good_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta dfct_qty_META = createCommonMeta($dfct_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta act_ttl_qty_META = createCommonMeta($act_ttl_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta judg_ttl_qty_META = createCommonMeta($judg_ttl_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta mfg_loc_cd_META = createCommonMeta($mfg_loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta mfg_loc_nm_META = createCommonMeta($mfg_loc_nm, mcframe.commonMA.meta.MA_META.LOC_NM);
	public static final MCMeta sppl_cd_META = createCommonMeta($sppl_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta sppl_nm_META = createCommonMeta($sppl_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta maker_cd_META = createCommonMeta($maker_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta maker_nm_META = createCommonMeta($maker_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta bp_lot_no_META = createCommonMeta($bp_lot_no, mcframe.commonMA.meta.MA_META.BP_LOT_NO);
	public static final MCMeta std_insp_flg_META = createCommonMeta($std_insp_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta std_req_flg_META = createCommonMeta($std_req_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta std_cnf_req_flg_META = createCommonMeta($std_cnf_req_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta std_cmpl_flg_META = createCommonMeta($std_cmpl_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta std_cnf_cmpl_flg_META = createCommonMeta($std_cnf_cmpl_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta insp_rslt_prnt_flg_META = createCommonMeta($insp_rslt_prnt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta insp_rslt_prnt_tm_META = createCommonMeta($insp_rslt_prnt_tm, mcframe.commonMA.meta.MA_META.TM);
	public static final MCMeta st_dt_META = createCommonMeta($st_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta st_hm_META = createCommonMeta($st_hm, mcframe.commonMA.meta.MA_META.HM);
	public static final MCMeta end_dt_META = createCommonMeta($end_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta end_hm_META = createCommonMeta($end_hm, mcframe.commonMA.meta.MA_META.HM);
	public static final MCMeta act_usr_cd_META = createCommonMeta($act_usr_cd, mcframe.commonMA.meta.MA_META.USR_CD);
	public static final MCMeta act_usr_nm_META = createCommonMeta($act_usr_nm, mcframe.commonMA.meta.MA_META.USR_NM);
	public static final MCMeta act_dpt_cd_META = createCommonMeta($act_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta act_dpt_nm_META = createCommonMeta($act_dpt_nm, mcframe.commonMA.meta.MA_META.DPT_NM);
	public static final MCMeta insp_judg_rslt_typ_META = createCommonMeta($insp_judg_rslt_typ, mcframe.commonMS.meta.MS_META.INSP_JUDG_RSLT_TYP);
	public static final MCMeta insp_judg_rslt_typ_nm_META = createCommonMeta($insp_judg_rslt_typ_nm, mcframe.commonMS.meta.MS_META.INSP_JUDG_RSLT_TYP_NM);
	public static final MCMeta judg_dt_META = createCommonMeta($judg_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta judg_usr_cd_META = createCommonMeta($judg_usr_cd, mcframe.commonMA.meta.MA_META.USR_CD);
	public static final MCMeta judg_usr_nm_META = createCommonMeta($judg_usr_nm, mcframe.commonMA.meta.MA_META.USR_NM);
	public static final MCMeta judg_dpt_cd_META = createCommonMeta($judg_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta judg_dpt_nm_META = createCommonMeta($judg_dpt_nm, mcframe.commonMA.meta.MA_META.DPT_NM);
	public static final MCMeta judg_rsn_META = createCommonMeta($judg_rsn, mcframe.commonMS.meta.MS_META.INSP_JUDG_RSN);
	public static final MCMeta dfct_rsn_cd_META = createCommonMeta($dfct_rsn_cd, mcframe.commonMA.meta.MA_META.BIZ_RSN_CD);
	public static final MCMeta dfct_rsn_nm_META = createCommonMeta($dfct_rsn_nm, mcframe.commonMA.meta.MA_META.BIZ_RSN_NM);
	public static final MCMeta quality_typ_META = createCommonMeta($quality_typ, mcframe.commonMA.meta.MA_META.QUALITY_TYP);
	public static final MCMeta quality_typ_nm_META = createCommonMeta($quality_typ_nm, mcframe.commonMA.meta.MA_META.QUALITY_TYP_NM);
	public static final MCMeta gd_cd_META = createCommonMeta($gd_cd, mcframe.commonMA.meta.MA_META.STK_GD_CD);
	public static final MCMeta gd_nm_META = createCommonMeta($gd_nm, mcframe.commonMA.meta.MA_META.STK_GD_NM);
	public static final MCMeta smpl_inst_qty_META = createCommonMeta($smpl_inst_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta smpl_inst_unit_cd_META = createCommonMeta($smpl_inst_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta smpl_inst_unit_nm_META = createCommonMeta($smpl_inst_unit_nm, mcframe.commonMA.meta.MA_META.UNIT_NM);
	public static final MCMeta smpl_inst_unit_dec_place_META = createCommonMeta($smpl_inst_unit_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta std_cont_fctr_META = createCommonMeta($std_cont_fctr, mcframe.commonMA.meta.MA_META.STD_CONT_FCTR);
	public static final MCMeta act_cont_fctr_META = createCommonMeta($act_cont_fctr, mcframe.commonMA.meta.MA_META.ACT_CONT_FCTR);
	public static final MCMeta vld_dt_upd_flg_META = createCommonMeta($vld_dt_upd_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta vld_pd_META = createCommonMeta($vld_pd, mcframe.commonMA.meta.MA_META.VLD_PD);
	public static final MCMeta lmt_pd_META = createCommonMeta($lmt_pd, mcframe.commonMA.meta.MA_META.LMT_PD);
	public static final MCMeta calc_pd_typ_META = createCommonMeta($calc_pd_typ, mcframe.commonMA.meta.MA_META.CALC_PD_TYP);
	public static final MCMeta calc_pd_typ_nm_META = createCommonMeta($calc_pd_typ_nm, mcframe.commonMA.meta.MA_META.CALC_PD_TYP_NM);
	public static final MCMeta lmt_dt_frm_typ_META = createCommonMeta($lmt_dt_frm_typ, mcframe.commonMA.meta.MA_META.LMT_DT_FRM_TYP);
	public static final MCMeta lmt_dt_frm_typ_nm_META = createCommonMeta($lmt_dt_frm_typ_nm, mcframe.commonMA.meta.MA_META.LMT_DT_FRM_TYP_NM);
	public static final MCMeta lmt_up_flg_META = createCommonMeta($lmt_up_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta lmt_ctl_flg_META = createCommonMeta($lmt_ctl_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta lmt_ctl_categ_META = createCommonMeta($lmt_ctl_categ, mcframe.commonMA.meta.MA_META.LMT_CTL_CATEG);
	public static final MCMeta lmt_dt_frm_META = createCommonMeta($lmt_dt_frm, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta vld_dt_META = createCommonMeta($vld_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta lmt_dt_META = createCommonMeta($lmt_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta vld_dt_now_META = createCommonMeta($vld_dt_now, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta lmt_dt_now_META = createCommonMeta($lmt_dt_now, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta cont_fctr_flg_META = createCommonMeta($cont_fctr_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta intr_rmrks_META = createCommonMeta($intr_rmrks, mcframe.commonMS.meta.MS_META.INSP_ACT_INTR_RMRKS);
	public static final MCMeta lot_rmrks_META = createCommonMeta($lot_rmrks, mcframe.commonMS.meta.MS_META.LOT_RMRKS);
	public static final MCMeta sub_char1_META = createCommonMeta($sub_char1, mcframe.commonMS.meta.MS_META.INSP_ACT_SUB_CHAR1);
	public static final MCMeta sub_char2_META = createCommonMeta($sub_char2, mcframe.commonMS.meta.MS_META.INSP_ACT_SUB_CHAR2);
	public static final MCMeta sub_char3_META = createCommonMeta($sub_char3, mcframe.commonMS.meta.MS_META.INSP_ACT_SUB_CHAR3);
	public static final MCMeta in_prmt_insp_flg_META = createCommonMeta($in_prmt_insp_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta spec_sp_flg_META = createCommonMeta($spec_sp_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta spec_ng_flg_META = createCommonMeta($spec_ng_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta inst_upd_cntr_META = createCommonMeta($inst_upd_cntr, mcframe.commonMA.meta.MA_META.UPD_CNT);
	public static final MCMeta act_upd_cntr_META = createCommonMeta($act_upd_cntr, mcframe.commonMA.meta.MA_META.UPD_CNT);
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
	public static final MCMeta std_insp_ng_flg_META = createCommonMeta($std_insp_ng_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta std_insp_sp_flg_META = createCommonMeta($std_insp_sp_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta insp_ptn_cd_META = createCommonMeta($insp_ptn_cd, mcframe.commonMA.meta.MA_META.INSP_PTN_CD);
	public static final MCMeta to_site_cd_META = createCommonMeta($to_site_cd, mcframe.commonMA.meta.MA_META.SITE_CD);
	public static final MCMeta master_dt_META = createCommonMeta($master_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta lims_flg_META = createCommonMeta($lims_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta ext_sys_cd_META = createCommonMeta($ext_sys_cd, mcframe.commonMA.meta.MA_META.EXT_SYS_CD);
	public static final MCMeta ext_sys_nm_META = createCommonMeta($ext_sys_nm, mcframe.commonMA.meta.MA_META.EXT_SYS_NM);
	public static final MCMeta ext_insp_act_no_META = createCommonMeta($ext_insp_act_no, mcframe.commonMA.meta.MA_META.EXT_INSP_ACT_NO);

	protected static final ConstMetaList<Srch01_RsltR> constMetas = new ConstMetaList<Srch01_RsltR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			itm_cd_META,
			itm_sub1_META,
			itm_sub2_META,
			itm_sub3_META,
			itm_nm_META,
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
			insp_sts_typ_META,
			insp_sts_typ_nm_META,
			insp_aprv_sts_typ_META,
			insp_aprv_sts_typ_nm_META,
			inst_pack_unit_qty_META,
			pack_unit_cd_META,
			pack_unit_nm_META,
			pack_unit_dec_place_META,
			inst_base_unit_qty_META,
			rem_base_unit_qty_META,
			base_unit_cd_META,
			base_unit_nm_META,
			base_unit_dec_place_META,
			base_unit_rnd_typ_META,
			good_qty_META,
			dfct_qty_META,
			act_ttl_qty_META,
			judg_ttl_qty_META,
			mfg_loc_cd_META,
			mfg_loc_nm_META,
			sppl_cd_META,
			sppl_nm_META,
			maker_cd_META,
			maker_nm_META,
			bp_lot_no_META,
			std_insp_flg_META,
			std_req_flg_META,
			std_cnf_req_flg_META,
			std_cmpl_flg_META,
			std_cnf_cmpl_flg_META,
			insp_rslt_prnt_flg_META,
			insp_rslt_prnt_tm_META,
			st_dt_META,
			st_hm_META,
			end_dt_META,
			end_hm_META,
			act_usr_cd_META,
			act_usr_nm_META,
			act_dpt_cd_META,
			act_dpt_nm_META,
			insp_judg_rslt_typ_META,
			insp_judg_rslt_typ_nm_META,
			judg_dt_META,
			judg_usr_cd_META,
			judg_usr_nm_META,
			judg_dpt_cd_META,
			judg_dpt_nm_META,
			judg_rsn_META,
			dfct_rsn_cd_META,
			dfct_rsn_nm_META,
			quality_typ_META,
			quality_typ_nm_META,
			gd_cd_META,
			gd_nm_META,
			smpl_inst_qty_META,
			smpl_inst_unit_cd_META,
			smpl_inst_unit_nm_META,
			smpl_inst_unit_dec_place_META,
			std_cont_fctr_META,
			act_cont_fctr_META,
			vld_dt_upd_flg_META,
			vld_pd_META,
			lmt_pd_META,
			calc_pd_typ_META,
			calc_pd_typ_nm_META,
			lmt_dt_frm_typ_META,
			lmt_dt_frm_typ_nm_META,
			lmt_up_flg_META,
			lmt_ctl_flg_META,
			lmt_ctl_categ_META,
			lmt_dt_frm_META,
			vld_dt_META,
			lmt_dt_META,
			vld_dt_now_META,
			lmt_dt_now_META,
			cont_fctr_flg_META,
			intr_rmrks_META,
			lot_rmrks_META,
			sub_char1_META,
			sub_char2_META,
			sub_char3_META,
			in_prmt_insp_flg_META,
			spec_sp_flg_META,
			spec_ng_flg_META,
			inst_upd_cntr_META,
			act_upd_cntr_META,
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
			std_insp_ng_flg_META,
			std_insp_sp_flg_META,
			insp_ptn_cd_META,
			to_site_cd_META,
			master_dt_META,
			lims_flg_META,
			ext_sys_cd_META,
			ext_sys_nm_META,
			ext_insp_act_no_META
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
				{$insp_mtd_typ, "MAC_INSP_MTD_TYP"},	// insp_mtd_typ
				{$insp_typ, "MSC_INSP_TYP"},	// insp_typ
				{$insp_sts_typ, "MSC_INSP_STS_TYP"},	// insp_sts_typ
				{$insp_aprv_sts_typ, "MSC_INSP_APRV_STS_TYP"},	// insp_aprv_sts_typ
				{$insp_judg_rslt_typ, "MSC_INSP_JUDG_RSLT_TYP"},	// insp_judg_rslt_typ
				{$quality_typ, "MAC_QUALITY_TYP"},	// quality_typ
				{$calc_pd_typ, "MAC_CALC_PD_TYP"},	// calc_pd_typ
				{$lmt_dt_frm_typ, "MAC_LMT_DT_FRM_TYP"}	// lmt_dt_frm_typ
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
	protected Srch01_RsltR_MC_A(ConstMetaList<? extends Srch01_RsltR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch01_RsltR clone() {
		return (Srch01_RsltR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch01_RsltR createInstance() {
		return (Srch01_RsltR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch01_RsltR getValues(String... names) {
		return (Srch01_RsltR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * Item 品目.<p>
	 *
	 */
	public String itm_cd() {
		return getConstString(offset + 0, $itm_cd);
	}

	/**
	 * Item 品目.<p>
	 *
	 */
	public void itm_cd(String value) {
		setConstString(offset + 0, $itm_cd, value);
	}


	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public String itm_sub1() {
		return getConstString(offset + 1, $itm_sub1);
	}

	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public void itm_sub1(String value) {
		setConstString(offset + 1, $itm_sub1, value);
	}


	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public String itm_sub2() {
		return getConstString(offset + 2, $itm_sub2);
	}

	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public void itm_sub2(String value) {
		setConstString(offset + 2, $itm_sub2, value);
	}


	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public String itm_sub3() {
		return getConstString(offset + 3, $itm_sub3);
	}

	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public void itm_sub3(String value) {
		setConstString(offset + 3, $itm_sub3, value);
	}


	/**
	 * Item name 品名.<p>
	 *
	 */
	public String itm_nm() {
		return getConstString(offset + 4, $itm_nm);
	}

	/**
	 * Item name 品名.<p>
	 *
	 */
	public void itm_nm(String value) {
		setConstString(offset + 4, $itm_nm, value);
	}


	/**
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public String lot_no() {
		return getConstString(offset + 5, $lot_no);
	}

	/**
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public void lot_no(String value) {
		setConstString(offset + 5, $lot_no, value);
	}


	/**
	 * Sublot No. サブロットＮＯ.<p>
	 *
	 */
	public String sublot_no() {
		return getConstString(offset + 6, $sublot_no);
	}

	/**
	 * Sublot No. サブロットＮＯ.<p>
	 *
	 */
	public void sublot_no(String value) {
		setConstString(offset + 6, $sublot_no, value);
	}


	/**
	 * Version No. 版ＮＯ.<p>
	 *
	 */
	public String ver_no() {
		return getConstString(offset + 7, $ver_no);
	}

	/**
	 * Version No. 版ＮＯ.<p>
	 *
	 */
	public void ver_no(String value) {
		setConstString(offset + 7, $ver_no, value);
	}


	/**
	 * Inspection No. 検査ＮＯ.<p>
	 *
	 */
	public String insp_no() {
		return getConstString(offset + 8, $insp_no);
	}

	/**
	 * Inspection No. 検査ＮＯ.<p>
	 *
	 */
	public void insp_no(String value) {
		setConstString(offset + 8, $insp_no, value);
	}


	/**
	 * Inspection result No. 検査実績ＮＯ.<p>
	 *
	 */
	public String insp_act_no() {
		return getConstString(offset + 9, $insp_act_no);
	}

	/**
	 * Inspection result No. 検査実績ＮＯ.<p>
	 *
	 */
	public void insp_act_no(String value) {
		setConstString(offset + 9, $insp_act_no, value);
	}


	/**
	 * Number of inspections 検査回数.<p>
	 *
	 */
	public MCNumber insp_freq() {
		return getConstNumber(offset + 10, $insp_freq);
	}

	/**
	 * Number of inspections 検査回数.<p>
	 *
	 */
	public void insp_freq(MCNumber value) {
		setConstNumber(offset + 10, $insp_freq, value);
	}

	/**
	 * Number of inspections 検査回数.<p>
	 *
	 */
	public void insp_freq(int value) {
		setConstNumber(offset + 10, $insp_freq, value);
	}

	/**
	 * Number of inspections 検査回数.<p>
	 *
	 */
	public void insp_freq(long value) {
		setConstNumber(offset + 10, $insp_freq, value);
	}

	/**
	 * Number of inspections 検査回数.<p>
	 *
	 */
	public void insp_freq(float value) {
		setConstNumber(offset + 10, $insp_freq, value);
	}

	/**
	 * Number of inspections 検査回数.<p>
	 *
	 */
	public void insp_freq(double value) {
		setConstNumber(offset + 10, $insp_freq, value);
	}


	/**
	 * Inspection method type 検査方法区分.<p>
	 *
	 */
	public String insp_mtd_typ() {
		return getConstString(offset + 11, $insp_mtd_typ);
	}

	/**
	 * Inspection method type 検査方法区分.<p>
	 *
	 */
	public void insp_mtd_typ(String value) {
		setConstString(offset + 11, $insp_mtd_typ, value);
	}


	/**
	 * Inspection method type name 検査方法区分名.<p>
	 *
	 */
	public String insp_mtd_typ_nm() {
		return getConstString(offset + 12, $insp_mtd_typ_nm);
	}

	/**
	 * Inspection method type name 検査方法区分名.<p>
	 *
	 */
	public void insp_mtd_typ_nm(String value) {
		setConstString(offset + 12, $insp_mtd_typ_nm, value);
	}


	/**
	 * Inspection classification type 検査種類区分.<p>
	 *
	 */
	public String insp_typ() {
		return getConstString(offset + 13, $insp_typ);
	}

	/**
	 * Inspection classification type 検査種類区分.<p>
	 *
	 */
	public void insp_typ(String value) {
		setConstString(offset + 13, $insp_typ, value);
	}


	/**
	 * Inspection classification type name 検査種類区分名.<p>
	 *
	 */
	public String insp_typ_nm() {
		return getConstString(offset + 14, $insp_typ_nm);
	}

	/**
	 * Inspection classification type name 検査種類区分名.<p>
	 *
	 */
	public void insp_typ_nm(String value) {
		setConstString(offset + 14, $insp_typ_nm, value);
	}


	/**
	 * Inspection status type 検査状況区分.<p>
	 *
	 */
	public String insp_sts_typ() {
		return getConstString(offset + 15, $insp_sts_typ);
	}

	/**
	 * Inspection status type 検査状況区分.<p>
	 *
	 */
	public void insp_sts_typ(String value) {
		setConstString(offset + 15, $insp_sts_typ, value);
	}


	/**
	 * Inspection status type name 検査状況区分名.<p>
	 *
	 */
	public String insp_sts_typ_nm() {
		return getConstString(offset + 16, $insp_sts_typ_nm);
	}

	/**
	 * Inspection status type name 検査状況区分名.<p>
	 *
	 */
	public void insp_sts_typ_nm(String value) {
		setConstString(offset + 16, $insp_sts_typ_nm, value);
	}


	/**
	 * Inspection approval status type 検査承認状況区分.<p>
	 *
	 */
	public String insp_aprv_sts_typ() {
		return getConstString(offset + 17, $insp_aprv_sts_typ);
	}

	/**
	 * Inspection approval status type 検査承認状況区分.<p>
	 *
	 */
	public void insp_aprv_sts_typ(String value) {
		setConstString(offset + 17, $insp_aprv_sts_typ, value);
	}


	/**
	 * Inspection approval status type name 検査承認状況区分名.<p>
	 *
	 */
	public String insp_aprv_sts_typ_nm() {
		return getConstString(offset + 18, $insp_aprv_sts_typ_nm);
	}

	/**
	 * Inspection approval status type name 検査承認状況区分名.<p>
	 *
	 */
	public void insp_aprv_sts_typ_nm(String value) {
		setConstString(offset + 18, $insp_aprv_sts_typ_nm, value);
	}


	/**
	 * Order qty. (SKU) 指図数量（荷）.<p>
	 *
	 */
	public MCNumber inst_pack_unit_qty() {
		return getConstNumber(offset + 19, $inst_pack_unit_qty);
	}

	/**
	 * Order qty. (SKU) 指図数量（荷）.<p>
	 *
	 */
	public void inst_pack_unit_qty(MCNumber value) {
		setConstNumber(offset + 19, $inst_pack_unit_qty, value);
	}

	/**
	 * Order qty. (SKU) 指図数量（荷）.<p>
	 *
	 */
	public void inst_pack_unit_qty(int value) {
		setConstNumber(offset + 19, $inst_pack_unit_qty, value);
	}

	/**
	 * Order qty. (SKU) 指図数量（荷）.<p>
	 *
	 */
	public void inst_pack_unit_qty(long value) {
		setConstNumber(offset + 19, $inst_pack_unit_qty, value);
	}

	/**
	 * Order qty. (SKU) 指図数量（荷）.<p>
	 *
	 */
	public void inst_pack_unit_qty(float value) {
		setConstNumber(offset + 19, $inst_pack_unit_qty, value);
	}

	/**
	 * Order qty. (SKU) 指図数量（荷）.<p>
	 *
	 */
	public void inst_pack_unit_qty(double value) {
		setConstNumber(offset + 19, $inst_pack_unit_qty, value);
	}


	/**
	 * SKU 荷姿単位.<p>
	 *
	 */
	public String pack_unit_cd() {
		return getConstString(offset + 20, $pack_unit_cd);
	}

	/**
	 * SKU 荷姿単位.<p>
	 *
	 */
	public void pack_unit_cd(String value) {
		setConstString(offset + 20, $pack_unit_cd, value);
	}


	/**
	 * SKU name 荷姿単位名.<p>
	 *
	 */
	public String pack_unit_nm() {
		return getConstString(offset + 21, $pack_unit_nm);
	}

	/**
	 * SKU name 荷姿単位名.<p>
	 *
	 */
	public void pack_unit_nm(String value) {
		setConstString(offset + 21, $pack_unit_nm, value);
	}


	/**
	 * SKU number of decimal places 荷姿単位小数部有効桁数.<p>
	 *
	 */
	public MCNumber pack_unit_dec_place() {
		return getConstNumber(offset + 22, $pack_unit_dec_place);
	}

	/**
	 * SKU number of decimal places 荷姿単位小数部有効桁数.<p>
	 *
	 */
	public void pack_unit_dec_place(MCNumber value) {
		setConstNumber(offset + 22, $pack_unit_dec_place, value);
	}

	/**
	 * SKU number of decimal places 荷姿単位小数部有効桁数.<p>
	 *
	 */
	public void pack_unit_dec_place(int value) {
		setConstNumber(offset + 22, $pack_unit_dec_place, value);
	}

	/**
	 * SKU number of decimal places 荷姿単位小数部有効桁数.<p>
	 *
	 */
	public void pack_unit_dec_place(long value) {
		setConstNumber(offset + 22, $pack_unit_dec_place, value);
	}

	/**
	 * SKU number of decimal places 荷姿単位小数部有効桁数.<p>
	 *
	 */
	public void pack_unit_dec_place(float value) {
		setConstNumber(offset + 22, $pack_unit_dec_place, value);
	}

	/**
	 * SKU number of decimal places 荷姿単位小数部有効桁数.<p>
	 *
	 */
	public void pack_unit_dec_place(double value) {
		setConstNumber(offset + 22, $pack_unit_dec_place, value);
	}


	/**
	 * Order qty. (Base) 指図数量（基）.<p>
	 *
	 */
	public MCNumber inst_base_unit_qty() {
		return getConstNumber(offset + 23, $inst_base_unit_qty);
	}

	/**
	 * Order qty. (Base) 指図数量（基）.<p>
	 *
	 */
	public void inst_base_unit_qty(MCNumber value) {
		setConstNumber(offset + 23, $inst_base_unit_qty, value);
	}

	/**
	 * Order qty. (Base) 指図数量（基）.<p>
	 *
	 */
	public void inst_base_unit_qty(int value) {
		setConstNumber(offset + 23, $inst_base_unit_qty, value);
	}

	/**
	 * Order qty. (Base) 指図数量（基）.<p>
	 *
	 */
	public void inst_base_unit_qty(long value) {
		setConstNumber(offset + 23, $inst_base_unit_qty, value);
	}

	/**
	 * Order qty. (Base) 指図数量（基）.<p>
	 *
	 */
	public void inst_base_unit_qty(float value) {
		setConstNumber(offset + 23, $inst_base_unit_qty, value);
	}

	/**
	 * Order qty. (Base) 指図数量（基）.<p>
	 *
	 */
	public void inst_base_unit_qty(double value) {
		setConstNumber(offset + 23, $inst_base_unit_qty, value);
	}


	/**
	 * Remaining (Base unit) 残数（基）.<p>
	 *
	 */
	public MCNumber rem_base_unit_qty() {
		return getConstNumber(offset + 24, $rem_base_unit_qty);
	}

	/**
	 * Remaining (Base unit) 残数（基）.<p>
	 *
	 */
	public void rem_base_unit_qty(MCNumber value) {
		setConstNumber(offset + 24, $rem_base_unit_qty, value);
	}

	/**
	 * Remaining (Base unit) 残数（基）.<p>
	 *
	 */
	public void rem_base_unit_qty(int value) {
		setConstNumber(offset + 24, $rem_base_unit_qty, value);
	}

	/**
	 * Remaining (Base unit) 残数（基）.<p>
	 *
	 */
	public void rem_base_unit_qty(long value) {
		setConstNumber(offset + 24, $rem_base_unit_qty, value);
	}

	/**
	 * Remaining (Base unit) 残数（基）.<p>
	 *
	 */
	public void rem_base_unit_qty(float value) {
		setConstNumber(offset + 24, $rem_base_unit_qty, value);
	}

	/**
	 * Remaining (Base unit) 残数（基）.<p>
	 *
	 */
	public void rem_base_unit_qty(double value) {
		setConstNumber(offset + 24, $rem_base_unit_qty, value);
	}


	/**
	 * Base unit 基準単位.<p>
	 *
	 */
	public String base_unit_cd() {
		return getConstString(offset + 25, $base_unit_cd);
	}

	/**
	 * Base unit 基準単位.<p>
	 *
	 */
	public void base_unit_cd(String value) {
		setConstString(offset + 25, $base_unit_cd, value);
	}


	/**
	 * Base unit name 基準単位名.<p>
	 *
	 */
	public String base_unit_nm() {
		return getConstString(offset + 26, $base_unit_nm);
	}

	/**
	 * Base unit name 基準単位名.<p>
	 *
	 */
	public void base_unit_nm(String value) {
		setConstString(offset + 26, $base_unit_nm, value);
	}


	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public MCNumber base_unit_dec_place() {
		return getConstNumber(offset + 27, $base_unit_dec_place);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(MCNumber value) {
		setConstNumber(offset + 27, $base_unit_dec_place, value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(int value) {
		setConstNumber(offset + 27, $base_unit_dec_place, value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(long value) {
		setConstNumber(offset + 27, $base_unit_dec_place, value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(float value) {
		setConstNumber(offset + 27, $base_unit_dec_place, value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(double value) {
		setConstNumber(offset + 27, $base_unit_dec_place, value);
	}


	/**
	 * Base unit rounding type 基準単位端数処理区分.<p>
	 *
	 */
	public String base_unit_rnd_typ() {
		return getConstString(offset + 28, $base_unit_rnd_typ);
	}

	/**
	 * Base unit rounding type 基準単位端数処理区分.<p>
	 *
	 */
	public void base_unit_rnd_typ(String value) {
		setConstString(offset + 28, $base_unit_rnd_typ, value);
	}


	/**
	 * Conforming qty. 良品数量.<p>
	 *
	 */
	public MCNumber good_qty() {
		return getConstNumber(offset + 29, $good_qty);
	}

	/**
	 * Conforming qty. 良品数量.<p>
	 *
	 */
	public void good_qty(MCNumber value) {
		setConstNumber(offset + 29, $good_qty, value);
	}

	/**
	 * Conforming qty. 良品数量.<p>
	 *
	 */
	public void good_qty(int value) {
		setConstNumber(offset + 29, $good_qty, value);
	}

	/**
	 * Conforming qty. 良品数量.<p>
	 *
	 */
	public void good_qty(long value) {
		setConstNumber(offset + 29, $good_qty, value);
	}

	/**
	 * Conforming qty. 良品数量.<p>
	 *
	 */
	public void good_qty(float value) {
		setConstNumber(offset + 29, $good_qty, value);
	}

	/**
	 * Conforming qty. 良品数量.<p>
	 *
	 */
	public void good_qty(double value) {
		setConstNumber(offset + 29, $good_qty, value);
	}


	/**
	 * Defective qty. 不良品数量.<p>
	 *
	 */
	public MCNumber dfct_qty() {
		return getConstNumber(offset + 30, $dfct_qty);
	}

	/**
	 * Defective qty. 不良品数量.<p>
	 *
	 */
	public void dfct_qty(MCNumber value) {
		setConstNumber(offset + 30, $dfct_qty, value);
	}

	/**
	 * Defective qty. 不良品数量.<p>
	 *
	 */
	public void dfct_qty(int value) {
		setConstNumber(offset + 30, $dfct_qty, value);
	}

	/**
	 * Defective qty. 不良品数量.<p>
	 *
	 */
	public void dfct_qty(long value) {
		setConstNumber(offset + 30, $dfct_qty, value);
	}

	/**
	 * Defective qty. 不良品数量.<p>
	 *
	 */
	public void dfct_qty(float value) {
		setConstNumber(offset + 30, $dfct_qty, value);
	}

	/**
	 * Defective qty. 不良品数量.<p>
	 *
	 */
	public void dfct_qty(double value) {
		setConstNumber(offset + 30, $dfct_qty, value);
	}


	/**
	 * Total inventory qty. at result 実績時在庫総数.<p>
	 *
	 */
	public MCNumber act_ttl_qty() {
		return getConstNumber(offset + 31, $act_ttl_qty);
	}

	/**
	 * Total inventory qty. at result 実績時在庫総数.<p>
	 *
	 */
	public void act_ttl_qty(MCNumber value) {
		setConstNumber(offset + 31, $act_ttl_qty, value);
	}

	/**
	 * Total inventory qty. at result 実績時在庫総数.<p>
	 *
	 */
	public void act_ttl_qty(int value) {
		setConstNumber(offset + 31, $act_ttl_qty, value);
	}

	/**
	 * Total inventory qty. at result 実績時在庫総数.<p>
	 *
	 */
	public void act_ttl_qty(long value) {
		setConstNumber(offset + 31, $act_ttl_qty, value);
	}

	/**
	 * Total inventory qty. at result 実績時在庫総数.<p>
	 *
	 */
	public void act_ttl_qty(float value) {
		setConstNumber(offset + 31, $act_ttl_qty, value);
	}

	/**
	 * Total inventory qty. at result 実績時在庫総数.<p>
	 *
	 */
	public void act_ttl_qty(double value) {
		setConstNumber(offset + 31, $act_ttl_qty, value);
	}


	/**
	 * Inventory total qty. at decision 判定時在庫総数.<p>
	 *
	 */
	public MCNumber judg_ttl_qty() {
		return getConstNumber(offset + 32, $judg_ttl_qty);
	}

	/**
	 * Inventory total qty. at decision 判定時在庫総数.<p>
	 *
	 */
	public void judg_ttl_qty(MCNumber value) {
		setConstNumber(offset + 32, $judg_ttl_qty, value);
	}

	/**
	 * Inventory total qty. at decision 判定時在庫総数.<p>
	 *
	 */
	public void judg_ttl_qty(int value) {
		setConstNumber(offset + 32, $judg_ttl_qty, value);
	}

	/**
	 * Inventory total qty. at decision 判定時在庫総数.<p>
	 *
	 */
	public void judg_ttl_qty(long value) {
		setConstNumber(offset + 32, $judg_ttl_qty, value);
	}

	/**
	 * Inventory total qty. at decision 判定時在庫総数.<p>
	 *
	 */
	public void judg_ttl_qty(float value) {
		setConstNumber(offset + 32, $judg_ttl_qty, value);
	}

	/**
	 * Inventory total qty. at decision 判定時在庫総数.<p>
	 *
	 */
	public void judg_ttl_qty(double value) {
		setConstNumber(offset + 32, $judg_ttl_qty, value);
	}


	/**
	 * Mfg. location cd. 製造場所ＣＤ.<p>
	 *
	 */
	public String mfg_loc_cd() {
		return getConstString(offset + 33, $mfg_loc_cd);
	}

	/**
	 * Mfg. location cd. 製造場所ＣＤ.<p>
	 *
	 */
	public void mfg_loc_cd(String value) {
		setConstString(offset + 33, $mfg_loc_cd, value);
	}


	/**
	 * Mfg. location name 製造場所名.<p>
	 *
	 */
	public String mfg_loc_nm() {
		return getConstString(offset + 34, $mfg_loc_nm);
	}

	/**
	 * Mfg. location name 製造場所名.<p>
	 *
	 */
	public void mfg_loc_nm(String value) {
		setConstString(offset + 34, $mfg_loc_nm, value);
	}


	/**
	 * Supplier 発注先.<p>
	 *
	 */
	public String sppl_cd() {
		return getConstString(offset + 35, $sppl_cd);
	}

	/**
	 * Supplier 発注先.<p>
	 *
	 */
	public void sppl_cd(String value) {
		setConstString(offset + 35, $sppl_cd, value);
	}


	/**
	 * Supplier name 発注先名.<p>
	 *
	 */
	public String sppl_nm() {
		return getConstString(offset + 36, $sppl_nm);
	}

	/**
	 * Supplier name 発注先名.<p>
	 *
	 */
	public void sppl_nm(String value) {
		setConstString(offset + 36, $sppl_nm, value);
	}


	/**
	 * Maker cd. メーカＣＤ.<p>
	 *
	 */
	public String maker_cd() {
		return getConstString(offset + 37, $maker_cd);
	}

	/**
	 * Maker cd. メーカＣＤ.<p>
	 *
	 */
	public void maker_cd(String value) {
		setConstString(offset + 37, $maker_cd, value);
	}


	/**
	 * Maker name メーカ名.<p>
	 *
	 */
	public String maker_nm() {
		return getConstString(offset + 38, $maker_nm);
	}

	/**
	 * Maker name メーカ名.<p>
	 *
	 */
	public void maker_nm(String value) {
		setConstString(offset + 38, $maker_nm, value);
	}


	/**
	 * Vendor lot No. 業者ロットＮＯ.<p>
	 *
	 */
	public String bp_lot_no() {
		return getConstString(offset + 39, $bp_lot_no);
	}

	/**
	 * Vendor lot No. 業者ロットＮＯ.<p>
	 *
	 */
	public void bp_lot_no(String value) {
		setConstString(offset + 39, $bp_lot_no, value);
	}


	/**
	 * For specific inspection 規格検査対象.<p>
	 *
	 */
	public boolean std_insp_flg() {
		return getConstBoolean(offset + 40, $std_insp_flg);
	}

	/**
	 * For specific inspection 規格検査対象.<p>
	 *
	 */
	public void std_insp_flg(boolean value) {
		setConstBoolean(offset + 40, $std_insp_flg, value);
	}


	/**
	 * Specific inspection required 規格検査必須.<p>
	 *
	 */
	public boolean std_req_flg() {
		return getConstBoolean(offset + 41, $std_req_flg);
	}

	/**
	 * Specific inspection required 規格検査必須.<p>
	 *
	 */
	public void std_req_flg(boolean value) {
		setConstBoolean(offset + 41, $std_req_flg, value);
	}


	/**
	 * Specific result confirmation required 規格実績確認必須.<p>
	 *
	 */
	public boolean std_cnf_req_flg() {
		return getConstBoolean(offset + 42, $std_cnf_req_flg);
	}

	/**
	 * Specific result confirmation required 規格実績確認必須.<p>
	 *
	 */
	public void std_cnf_req_flg(boolean value) {
		setConstBoolean(offset + 42, $std_cnf_req_flg, value);
	}


	/**
	 * Specific inspection input 規格検査入力済.<p>
	 *
	 */
	public boolean std_cmpl_flg() {
		return getConstBoolean(offset + 43, $std_cmpl_flg);
	}

	/**
	 * Specific inspection input 規格検査入力済.<p>
	 *
	 */
	public void std_cmpl_flg(boolean value) {
		setConstBoolean(offset + 43, $std_cmpl_flg, value);
	}


	/**
	 * Specific inspection confirmed 規格検査確認済.<p>
	 *
	 */
	public boolean std_cnf_cmpl_flg() {
		return getConstBoolean(offset + 44, $std_cnf_cmpl_flg);
	}

	/**
	 * Specific inspection confirmed 規格検査確認済.<p>
	 *
	 */
	public void std_cnf_cmpl_flg(boolean value) {
		setConstBoolean(offset + 44, $std_cnf_cmpl_flg, value);
	}


	/**
	 * Inspection report printed 検査成績書発行済.<p>
	 *
	 */
	public boolean insp_rslt_prnt_flg() {
		return getConstBoolean(offset + 45, $insp_rslt_prnt_flg);
	}

	/**
	 * Inspection report printed 検査成績書発行済.<p>
	 *
	 */
	public void insp_rslt_prnt_flg(boolean value) {
		setConstBoolean(offset + 45, $insp_rslt_prnt_flg, value);
	}


	/**
	 * Inspection report printed date and time 検査成績書発行日時.<p>
	 *
	 */
	public MCDate insp_rslt_prnt_tm() {
		return getConstDate(offset + 46, $insp_rslt_prnt_tm);
	}

	/**
	 * Inspection report printed date and time 検査成績書発行日時.<p>
	 *
	 */
	public void insp_rslt_prnt_tm(MCDate value) {
		setConstDate(offset + 46, $insp_rslt_prnt_tm, value);
	}


	/**
	 * Start date 開始日.<p>
	 *
	 */
	public MCDate st_dt() {
		return getConstDate(offset + 47, $st_dt);
	}

	/**
	 * Start date 開始日.<p>
	 *
	 */
	public void st_dt(MCDate value) {
		setConstDate(offset + 47, $st_dt, value);
	}


	/**
	 * Start time 開始時刻.<p>
	 *
	 */
	public MCDate st_hm() {
		return getConstDate(offset + 48, $st_hm);
	}

	/**
	 * Start time 開始時刻.<p>
	 *
	 */
	public void st_hm(MCDate value) {
		setConstDate(offset + 48, $st_hm, value);
	}


	/**
	 * End date 終了日.<p>
	 *
	 */
	public MCDate end_dt() {
		return getConstDate(offset + 49, $end_dt);
	}

	/**
	 * End date 終了日.<p>
	 *
	 */
	public void end_dt(MCDate value) {
		setConstDate(offset + 49, $end_dt, value);
	}


	/**
	 * End time 終了時刻.<p>
	 *
	 */
	public MCDate end_hm() {
		return getConstDate(offset + 50, $end_hm);
	}

	/**
	 * End time 終了時刻.<p>
	 *
	 */
	public void end_hm(MCDate value) {
		setConstDate(offset + 50, $end_hm, value);
	}


	/**
	 * PIC 担当者.<p>
	 *
	 */
	public String act_usr_cd() {
		return getConstString(offset + 51, $act_usr_cd);
	}

	/**
	 * PIC 担当者.<p>
	 *
	 */
	public void act_usr_cd(String value) {
		setConstString(offset + 51, $act_usr_cd, value);
	}


	/**
	 * PIC name 担当者名.<p>
	 *
	 */
	public String act_usr_nm() {
		return getConstString(offset + 52, $act_usr_nm);
	}

	/**
	 * PIC name 担当者名.<p>
	 *
	 */
	public void act_usr_nm(String value) {
		setConstString(offset + 52, $act_usr_nm, value);
	}


	/**
	 * Dept. in charge 担当部門.<p>
	 *
	 */
	public String act_dpt_cd() {
		return getConstString(offset + 53, $act_dpt_cd);
	}

	/**
	 * Dept. in charge 担当部門.<p>
	 *
	 */
	public void act_dpt_cd(String value) {
		setConstString(offset + 53, $act_dpt_cd, value);
	}


	/**
	 * Dept. in charge name 担当部門名.<p>
	 *
	 */
	public String act_dpt_nm() {
		return getConstString(offset + 54, $act_dpt_nm);
	}

	/**
	 * Dept. in charge name 担当部門名.<p>
	 *
	 */
	public void act_dpt_nm(String value) {
		setConstString(offset + 54, $act_dpt_nm, value);
	}


	/**
	 * Decision result 判定結果.<p>
	 *
	 */
	public String insp_judg_rslt_typ() {
		return getConstString(offset + 55, $insp_judg_rslt_typ);
	}

	/**
	 * Decision result 判定結果.<p>
	 *
	 */
	public void insp_judg_rslt_typ(String value) {
		setConstString(offset + 55, $insp_judg_rslt_typ, value);
	}


	/**
	 * Decision result name 判定結果名.<p>
	 *
	 */
	public String insp_judg_rslt_typ_nm() {
		return getConstString(offset + 56, $insp_judg_rslt_typ_nm);
	}

	/**
	 * Decision result name 判定結果名.<p>
	 *
	 */
	public void insp_judg_rslt_typ_nm(String value) {
		setConstString(offset + 56, $insp_judg_rslt_typ_nm, value);
	}


	/**
	 * Decision date 判定日.<p>
	 *
	 */
	public MCDate judg_dt() {
		return getConstDate(offset + 57, $judg_dt);
	}

	/**
	 * Decision date 判定日.<p>
	 *
	 */
	public void judg_dt(MCDate value) {
		setConstDate(offset + 57, $judg_dt, value);
	}


	/**
	 * Decision PIC 判定者.<p>
	 *
	 */
	public String judg_usr_cd() {
		return getConstString(offset + 58, $judg_usr_cd);
	}

	/**
	 * Decision PIC 判定者.<p>
	 *
	 */
	public void judg_usr_cd(String value) {
		setConstString(offset + 58, $judg_usr_cd, value);
	}


	/**
	 * Decision PIC name 判定者名.<p>
	 *
	 */
	public String judg_usr_nm() {
		return getConstString(offset + 59, $judg_usr_nm);
	}

	/**
	 * Decision PIC name 判定者名.<p>
	 *
	 */
	public void judg_usr_nm(String value) {
		setConstString(offset + 59, $judg_usr_nm, value);
	}


	/**
	 * Decision dept. 判定部門.<p>
	 *
	 */
	public String judg_dpt_cd() {
		return getConstString(offset + 60, $judg_dpt_cd);
	}

	/**
	 * Decision dept. 判定部門.<p>
	 *
	 */
	public void judg_dpt_cd(String value) {
		setConstString(offset + 60, $judg_dpt_cd, value);
	}


	/**
	 * Decision dept. name 判定部門名.<p>
	 *
	 */
	public String judg_dpt_nm() {
		return getConstString(offset + 61, $judg_dpt_nm);
	}

	/**
	 * Decision dept. name 判定部門名.<p>
	 *
	 */
	public void judg_dpt_nm(String value) {
		setConstString(offset + 61, $judg_dpt_nm, value);
	}


	/**
	 * Decision reason 判定理由.<p>
	 *
	 */
	public String judg_rsn() {
		return getConstString(offset + 62, $judg_rsn);
	}

	/**
	 * Decision reason 判定理由.<p>
	 *
	 */
	public void judg_rsn(String value) {
		setConstString(offset + 62, $judg_rsn, value);
	}


	/**
	 * Defective reason 不良理由.<p>
	 *
	 */
	public String dfct_rsn_cd() {
		return getConstString(offset + 63, $dfct_rsn_cd);
	}

	/**
	 * Defective reason 不良理由.<p>
	 *
	 */
	public void dfct_rsn_cd(String value) {
		setConstString(offset + 63, $dfct_rsn_cd, value);
	}


	/**
	 * Defective reason name 不良理由名.<p>
	 *
	 */
	public String dfct_rsn_nm() {
		return getConstString(offset + 64, $dfct_rsn_nm);
	}

	/**
	 * Defective reason name 不良理由名.<p>
	 *
	 */
	public void dfct_rsn_nm(String value) {
		setConstString(offset + 64, $dfct_rsn_nm, value);
	}


	/**
	 * Conforming type 良品区分.<p>
	 *
	 */
	public String quality_typ() {
		return getConstString(offset + 65, $quality_typ);
	}

	/**
	 * Conforming type 良品区分.<p>
	 *
	 */
	public void quality_typ(String value) {
		setConstString(offset + 65, $quality_typ, value);
	}


	/**
	 * Conforming type name 良品区分名.<p>
	 *
	 */
	public String quality_typ_nm() {
		return getConstString(offset + 66, $quality_typ_nm);
	}

	/**
	 * Conforming type name 良品区分名.<p>
	 *
	 */
	public void quality_typ_nm(String value) {
		setConstString(offset + 66, $quality_typ_nm, value);
	}


	/**
	 * Grading 格付.<p>
	 *
	 */
	public String gd_cd() {
		return getConstString(offset + 67, $gd_cd);
	}

	/**
	 * Grading 格付.<p>
	 *
	 */
	public void gd_cd(String value) {
		setConstString(offset + 67, $gd_cd, value);
	}


	/**
	 * Grading name 格付名.<p>
	 *
	 */
	public String gd_nm() {
		return getConstString(offset + 68, $gd_nm);
	}

	/**
	 * Grading name 格付名.<p>
	 *
	 */
	public void gd_nm(String value) {
		setConstString(offset + 68, $gd_nm, value);
	}


	/**
	 * Sampling order qty. 抜取指図数量.<p>
	 *
	 */
	public MCNumber smpl_inst_qty() {
		return getConstNumber(offset + 69, $smpl_inst_qty);
	}

	/**
	 * Sampling order qty. 抜取指図数量.<p>
	 *
	 */
	public void smpl_inst_qty(MCNumber value) {
		setConstNumber(offset + 69, $smpl_inst_qty, value);
	}

	/**
	 * Sampling order qty. 抜取指図数量.<p>
	 *
	 */
	public void smpl_inst_qty(int value) {
		setConstNumber(offset + 69, $smpl_inst_qty, value);
	}

	/**
	 * Sampling order qty. 抜取指図数量.<p>
	 *
	 */
	public void smpl_inst_qty(long value) {
		setConstNumber(offset + 69, $smpl_inst_qty, value);
	}

	/**
	 * Sampling order qty. 抜取指図数量.<p>
	 *
	 */
	public void smpl_inst_qty(float value) {
		setConstNumber(offset + 69, $smpl_inst_qty, value);
	}

	/**
	 * Sampling order qty. 抜取指図数量.<p>
	 *
	 */
	public void smpl_inst_qty(double value) {
		setConstNumber(offset + 69, $smpl_inst_qty, value);
	}


	/**
	 * Sampling order unit 抜取指図単位.<p>
	 *
	 */
	public String smpl_inst_unit_cd() {
		return getConstString(offset + 70, $smpl_inst_unit_cd);
	}

	/**
	 * Sampling order unit 抜取指図単位.<p>
	 *
	 */
	public void smpl_inst_unit_cd(String value) {
		setConstString(offset + 70, $smpl_inst_unit_cd, value);
	}


	/**
	 * Sampling order unit name 抜取指図単位名.<p>
	 *
	 */
	public String smpl_inst_unit_nm() {
		return getConstString(offset + 71, $smpl_inst_unit_nm);
	}

	/**
	 * Sampling order unit name 抜取指図単位名.<p>
	 *
	 */
	public void smpl_inst_unit_nm(String value) {
		setConstString(offset + 71, $smpl_inst_unit_nm, value);
	}


	/**
	 * Sampling order unit number of decimal places 抜取指図単位小数部有効桁数.<p>
	 *
	 */
	public MCNumber smpl_inst_unit_dec_place() {
		return getConstNumber(offset + 72, $smpl_inst_unit_dec_place);
	}

	/**
	 * Sampling order unit number of decimal places 抜取指図単位小数部有効桁数.<p>
	 *
	 */
	public void smpl_inst_unit_dec_place(MCNumber value) {
		setConstNumber(offset + 72, $smpl_inst_unit_dec_place, value);
	}

	/**
	 * Sampling order unit number of decimal places 抜取指図単位小数部有効桁数.<p>
	 *
	 */
	public void smpl_inst_unit_dec_place(int value) {
		setConstNumber(offset + 72, $smpl_inst_unit_dec_place, value);
	}

	/**
	 * Sampling order unit number of decimal places 抜取指図単位小数部有効桁数.<p>
	 *
	 */
	public void smpl_inst_unit_dec_place(long value) {
		setConstNumber(offset + 72, $smpl_inst_unit_dec_place, value);
	}

	/**
	 * Sampling order unit number of decimal places 抜取指図単位小数部有効桁数.<p>
	 *
	 */
	public void smpl_inst_unit_dec_place(float value) {
		setConstNumber(offset + 72, $smpl_inst_unit_dec_place, value);
	}

	/**
	 * Sampling order unit number of decimal places 抜取指図単位小数部有効桁数.<p>
	 *
	 */
	public void smpl_inst_unit_dec_place(double value) {
		setConstNumber(offset + 72, $smpl_inst_unit_dec_place, value);
	}


	/**
	 * Standard coefficient 標準係数.<p>
	 *
	 */
	public MCNumber std_cont_fctr() {
		return getConstNumber(offset + 73, $std_cont_fctr);
	}

	/**
	 * Standard coefficient 標準係数.<p>
	 *
	 */
	public void std_cont_fctr(MCNumber value) {
		setConstNumber(offset + 73, $std_cont_fctr, value);
	}

	/**
	 * Standard coefficient 標準係数.<p>
	 *
	 */
	public void std_cont_fctr(int value) {
		setConstNumber(offset + 73, $std_cont_fctr, value);
	}

	/**
	 * Standard coefficient 標準係数.<p>
	 *
	 */
	public void std_cont_fctr(long value) {
		setConstNumber(offset + 73, $std_cont_fctr, value);
	}

	/**
	 * Standard coefficient 標準係数.<p>
	 *
	 */
	public void std_cont_fctr(float value) {
		setConstNumber(offset + 73, $std_cont_fctr, value);
	}

	/**
	 * Standard coefficient 標準係数.<p>
	 *
	 */
	public void std_cont_fctr(double value) {
		setConstNumber(offset + 73, $std_cont_fctr, value);
	}


	/**
	 * Actual coefficient 実際係数.<p>
	 *
	 */
	public MCNumber act_cont_fctr() {
		return getConstNumber(offset + 74, $act_cont_fctr);
	}

	/**
	 * Actual coefficient 実際係数.<p>
	 *
	 */
	public void act_cont_fctr(MCNumber value) {
		setConstNumber(offset + 74, $act_cont_fctr, value);
	}

	/**
	 * Actual coefficient 実際係数.<p>
	 *
	 */
	public void act_cont_fctr(int value) {
		setConstNumber(offset + 74, $act_cont_fctr, value);
	}

	/**
	 * Actual coefficient 実際係数.<p>
	 *
	 */
	public void act_cont_fctr(long value) {
		setConstNumber(offset + 74, $act_cont_fctr, value);
	}

	/**
	 * Actual coefficient 実際係数.<p>
	 *
	 */
	public void act_cont_fctr(float value) {
		setConstNumber(offset + 74, $act_cont_fctr, value);
	}

	/**
	 * Actual coefficient 実際係数.<p>
	 *
	 */
	public void act_cont_fctr(double value) {
		setConstNumber(offset + 74, $act_cont_fctr, value);
	}


	/**
	 * Expiration date update 有効期限更新.<p>
	 *
	 */
	public boolean vld_dt_upd_flg() {
		return getConstBoolean(offset + 75, $vld_dt_upd_flg);
	}

	/**
	 * Expiration date update 有効期限更新.<p>
	 *
	 */
	public void vld_dt_upd_flg(boolean value) {
		setConstBoolean(offset + 75, $vld_dt_upd_flg, value);
	}


	/**
	 * Valid period 有効期間.<p>
	 *
	 */
	public MCNumber vld_pd() {
		return getConstNumber(offset + 76, $vld_pd);
	}

	/**
	 * Valid period 有効期間.<p>
	 *
	 */
	public void vld_pd(MCNumber value) {
		setConstNumber(offset + 76, $vld_pd, value);
	}

	/**
	 * Valid period 有効期間.<p>
	 *
	 */
	public void vld_pd(int value) {
		setConstNumber(offset + 76, $vld_pd, value);
	}

	/**
	 * Valid period 有効期間.<p>
	 *
	 */
	public void vld_pd(long value) {
		setConstNumber(offset + 76, $vld_pd, value);
	}

	/**
	 * Valid period 有効期間.<p>
	 *
	 */
	public void vld_pd(float value) {
		setConstNumber(offset + 76, $vld_pd, value);
	}

	/**
	 * Valid period 有効期間.<p>
	 *
	 */
	public void vld_pd(double value) {
		setConstNumber(offset + 76, $vld_pd, value);
	}


	/**
	 * Period until expiration 使用期間.<p>
	 *
	 */
	public MCNumber lmt_pd() {
		return getConstNumber(offset + 77, $lmt_pd);
	}

	/**
	 * Period until expiration 使用期間.<p>
	 *
	 */
	public void lmt_pd(MCNumber value) {
		setConstNumber(offset + 77, $lmt_pd, value);
	}

	/**
	 * Period until expiration 使用期間.<p>
	 *
	 */
	public void lmt_pd(int value) {
		setConstNumber(offset + 77, $lmt_pd, value);
	}

	/**
	 * Period until expiration 使用期間.<p>
	 *
	 */
	public void lmt_pd(long value) {
		setConstNumber(offset + 77, $lmt_pd, value);
	}

	/**
	 * Period until expiration 使用期間.<p>
	 *
	 */
	public void lmt_pd(float value) {
		setConstNumber(offset + 77, $lmt_pd, value);
	}

	/**
	 * Period until expiration 使用期間.<p>
	 *
	 */
	public void lmt_pd(double value) {
		setConstNumber(offset + 77, $lmt_pd, value);
	}


	/**
	 * Period calculation type 期間計算区分.<p>
	 *
	 */
	public String calc_pd_typ() {
		return getConstString(offset + 78, $calc_pd_typ);
	}

	/**
	 * Period calculation type 期間計算区分.<p>
	 *
	 */
	public void calc_pd_typ(String value) {
		setConstString(offset + 78, $calc_pd_typ, value);
	}


	/**
	 * Period calculation type name 期間計算区分名.<p>
	 *
	 */
	public String calc_pd_typ_nm() {
		return getConstString(offset + 79, $calc_pd_typ_nm);
	}

	/**
	 * Period calculation type name 期間計算区分名.<p>
	 *
	 */
	public void calc_pd_typ_nm(String value) {
		setConstString(offset + 79, $calc_pd_typ_nm, value);
	}


	/**
	 * Expiration base date type 期限起算日区分.<p>
	 *
	 */
	public String lmt_dt_frm_typ() {
		return getConstString(offset + 80, $lmt_dt_frm_typ);
	}

	/**
	 * Expiration base date type 期限起算日区分.<p>
	 *
	 */
	public void lmt_dt_frm_typ(String value) {
		setConstString(offset + 80, $lmt_dt_frm_typ, value);
	}


	/**
	 * Expiration base date type name 期限起算日区分名.<p>
	 *
	 */
	public String lmt_dt_frm_typ_nm() {
		return getConstString(offset + 81, $lmt_dt_frm_typ_nm);
	}

	/**
	 * Expiration base date type name 期限起算日区分名.<p>
	 *
	 */
	public void lmt_dt_frm_typ_nm(String value) {
		setConstString(offset + 81, $lmt_dt_frm_typ_nm, value);
	}


	/**
	 * Re-inspection for expiration 期限再検査.<p>
	 *
	 */
	public boolean lmt_up_flg() {
		return getConstBoolean(offset + 82, $lmt_up_flg);
	}

	/**
	 * Re-inspection for expiration 期限再検査.<p>
	 *
	 */
	public void lmt_up_flg(boolean value) {
		setConstBoolean(offset + 82, $lmt_up_flg, value);
	}


	/**
	 * For expiration management 期限管理対象.<p>
	 *
	 */
	public boolean lmt_ctl_flg() {
		return getConstBoolean(offset + 83, $lmt_ctl_flg);
	}

	/**
	 * For expiration management 期限管理対象.<p>
	 *
	 */
	public void lmt_ctl_flg(boolean value) {
		setConstBoolean(offset + 83, $lmt_ctl_flg, value);
	}


	/**
	 * Expiration management type 期限管理種別.<p>
	 *
	 */
	public String lmt_ctl_categ() {
		return getConstString(offset + 84, $lmt_ctl_categ);
	}

	/**
	 * Expiration management type 期限管理種別.<p>
	 *
	 */
	public void lmt_ctl_categ(String value) {
		setConstString(offset + 84, $lmt_ctl_categ, value);
	}


	/**
	 * Base date 起算日.<p>
	 *
	 */
	public MCDate lmt_dt_frm() {
		return getConstDate(offset + 85, $lmt_dt_frm);
	}

	/**
	 * Base date 起算日.<p>
	 *
	 */
	public void lmt_dt_frm(MCDate value) {
		setConstDate(offset + 85, $lmt_dt_frm, value);
	}


	/**
	 * Expiration date 有効期限.<p>
	 *
	 */
	public MCDate vld_dt() {
		return getConstDate(offset + 86, $vld_dt);
	}

	/**
	 * Expiration date 有効期限.<p>
	 *
	 */
	public void vld_dt(MCDate value) {
		setConstDate(offset + 86, $vld_dt, value);
	}


	/**
	 * Usage expiration date 使用期限.<p>
	 *
	 */
	public MCDate lmt_dt() {
		return getConstDate(offset + 87, $lmt_dt);
	}

	/**
	 * Usage expiration date 使用期限.<p>
	 *
	 */
	public void lmt_dt(MCDate value) {
		setConstDate(offset + 87, $lmt_dt, value);
	}


	/**
	 * Current expiration date 現有効期限.<p>
	 *
	 */
	public MCDate vld_dt_now() {
		return getConstDate(offset + 88, $vld_dt_now);
	}

	/**
	 * Current expiration date 現有効期限.<p>
	 *
	 */
	public void vld_dt_now(MCDate value) {
		setConstDate(offset + 88, $vld_dt_now, value);
	}


	/**
	 * Current usage expiration date 現使用期限.<p>
	 *
	 */
	public MCDate lmt_dt_now() {
		return getConstDate(offset + 89, $lmt_dt_now);
	}

	/**
	 * Current usage expiration date 現使用期限.<p>
	 *
	 */
	public void lmt_dt_now(MCDate value) {
		setConstDate(offset + 89, $lmt_dt_now, value);
	}


	/**
	 * For active ingredient 有効成分対象.<p>
	 *
	 */
	public boolean cont_fctr_flg() {
		return getConstBoolean(offset + 90, $cont_fctr_flg);
	}

	/**
	 * For active ingredient 有効成分対象.<p>
	 *
	 */
	public void cont_fctr_flg(boolean value) {
		setConstBoolean(offset + 90, $cont_fctr_flg, value);
	}


	/**
	 * Result internal remarks 実績内部備考.<p>
	 *
	 */
	public String intr_rmrks() {
		return getConstString(offset + 91, $intr_rmrks);
	}

	/**
	 * Result internal remarks 実績内部備考.<p>
	 *
	 */
	public void intr_rmrks(String value) {
		setConstString(offset + 91, $intr_rmrks, value);
	}


	/**
	 * Lot remarks ロット備考.<p>
	 *
	 */
	public String lot_rmrks() {
		return getConstString(offset + 92, $lot_rmrks);
	}

	/**
	 * Lot remarks ロット備考.<p>
	 *
	 */
	public void lot_rmrks(String value) {
		setConstString(offset + 92, $lot_rmrks, value);
	}


	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public String sub_char1() {
		return getConstString(offset + 93, $sub_char1);
	}

	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public void sub_char1(String value) {
		setConstString(offset + 93, $sub_char1, value);
	}


	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public String sub_char2() {
		return getConstString(offset + 94, $sub_char2);
	}

	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public void sub_char2(String value) {
		setConstString(offset + 94, $sub_char2, value);
	}


	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public String sub_char3() {
		return getConstString(offset + 95, $sub_char3);
	}

	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public void sub_char3(String value) {
		setConstString(offset + 95, $sub_char3, value);
	}


	/**
	 * Allow inspecting usage 検査中使用許可.<p>
	 *
	 */
	public boolean in_prmt_insp_flg() {
		return getConstBoolean(offset + 96, $in_prmt_insp_flg);
	}

	/**
	 * Allow inspecting usage 検査中使用許可.<p>
	 *
	 */
	public void in_prmt_insp_flg(boolean value) {
		setConstBoolean(offset + 96, $in_prmt_insp_flg, value);
	}


	/**
	 * With specific inspection concession 規格検査特採あり.<p>
	 *
	 */
	public boolean spec_sp_flg() {
		return getConstBoolean(offset + 97, $spec_sp_flg);
	}

	/**
	 * With specific inspection concession 規格検査特採あり.<p>
	 *
	 */
	public void spec_sp_flg(boolean value) {
		setConstBoolean(offset + 97, $spec_sp_flg, value);
	}


	/**
	 * With specific inspection rejected 規格検査不合格あり.<p>
	 *
	 */
	public boolean spec_ng_flg() {
		return getConstBoolean(offset + 98, $spec_ng_flg);
	}

	/**
	 * With specific inspection rejected 規格検査不合格あり.<p>
	 *
	 */
	public void spec_ng_flg(boolean value) {
		setConstBoolean(offset + 98, $spec_ng_flg, value);
	}


	/**
	 * Inspection order update counter 検査指図更新カウンタ.<p>
	 *
	 */
	public MCNumber inst_upd_cntr() {
		return getConstNumber(offset + 99, $inst_upd_cntr);
	}

	/**
	 * Inspection order update counter 検査指図更新カウンタ.<p>
	 *
	 */
	public void inst_upd_cntr(MCNumber value) {
		setConstNumber(offset + 99, $inst_upd_cntr, value);
	}

	/**
	 * Inspection order update counter 検査指図更新カウンタ.<p>
	 *
	 */
	public void inst_upd_cntr(int value) {
		setConstNumber(offset + 99, $inst_upd_cntr, value);
	}

	/**
	 * Inspection order update counter 検査指図更新カウンタ.<p>
	 *
	 */
	public void inst_upd_cntr(long value) {
		setConstNumber(offset + 99, $inst_upd_cntr, value);
	}

	/**
	 * Inspection order update counter 検査指図更新カウンタ.<p>
	 *
	 */
	public void inst_upd_cntr(float value) {
		setConstNumber(offset + 99, $inst_upd_cntr, value);
	}

	/**
	 * Inspection order update counter 検査指図更新カウンタ.<p>
	 *
	 */
	public void inst_upd_cntr(double value) {
		setConstNumber(offset + 99, $inst_upd_cntr, value);
	}


	/**
	 * Inspection result update counter 検査実績更新カウンタ.<p>
	 *
	 */
	public MCNumber act_upd_cntr() {
		return getConstNumber(offset + 100, $act_upd_cntr);
	}

	/**
	 * Inspection result update counter 検査実績更新カウンタ.<p>
	 *
	 */
	public void act_upd_cntr(MCNumber value) {
		setConstNumber(offset + 100, $act_upd_cntr, value);
	}

	/**
	 * Inspection result update counter 検査実績更新カウンタ.<p>
	 *
	 */
	public void act_upd_cntr(int value) {
		setConstNumber(offset + 100, $act_upd_cntr, value);
	}

	/**
	 * Inspection result update counter 検査実績更新カウンタ.<p>
	 *
	 */
	public void act_upd_cntr(long value) {
		setConstNumber(offset + 100, $act_upd_cntr, value);
	}

	/**
	 * Inspection result update counter 検査実績更新カウンタ.<p>
	 *
	 */
	public void act_upd_cntr(float value) {
		setConstNumber(offset + 100, $act_upd_cntr, value);
	}

	/**
	 * Inspection result update counter 検査実績更新カウンタ.<p>
	 *
	 */
	public void act_upd_cntr(double value) {
		setConstNumber(offset + 100, $act_upd_cntr, value);
	}


	/**
	 * Entry user 登録ユーザ.<p>
	 *
	 */
	public String ins_usr_id() {
		return getConstString(offset + 101, $ins_usr_id);
	}

	/**
	 * Entry user 登録ユーザ.<p>
	 *
	 */
	public void ins_usr_id(String value) {
		setConstString(offset + 101, $ins_usr_id, value);
	}


	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public String ins_usr_nm() {
		return getConstString(offset + 102, $ins_usr_nm);
	}

	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public void ins_usr_nm(String value) {
		setConstString(offset + 102, $ins_usr_nm, value);
	}


	/**
	 * Entry function 登録機能.<p>
	 *
	 */
	public String ins_func_id() {
		return getConstString(offset + 103, $ins_func_id);
	}

	/**
	 * Entry function 登録機能.<p>
	 *
	 */
	public void ins_func_id(String value) {
		setConstString(offset + 103, $ins_func_id, value);
	}


	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public String ins_func_nm() {
		return getConstString(offset + 104, $ins_func_nm);
	}

	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public void ins_func_nm(String value) {
		setConstString(offset + 104, $ins_func_nm, value);
	}


	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public MCTimestamp ins_ts() {
		return getConstTimestamp(offset + 105, $ins_ts);
	}

	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public void ins_ts(MCTimestamp value) {
		setConstTimestamp(offset + 105, $ins_ts, value);
	}


	/**
	 * Update user 更新ユーザ.<p>
	 *
	 */
	public String upd_usr_id() {
		return getConstString(offset + 106, $upd_usr_id);
	}

	/**
	 * Update user 更新ユーザ.<p>
	 *
	 */
	public void upd_usr_id(String value) {
		setConstString(offset + 106, $upd_usr_id, value);
	}


	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public String upd_usr_nm() {
		return getConstString(offset + 107, $upd_usr_nm);
	}

	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public void upd_usr_nm(String value) {
		setConstString(offset + 107, $upd_usr_nm, value);
	}


	/**
	 * Update function 更新機能.<p>
	 *
	 */
	public String upd_func_id() {
		return getConstString(offset + 108, $upd_func_id);
	}

	/**
	 * Update function 更新機能.<p>
	 *
	 */
	public void upd_func_id(String value) {
		setConstString(offset + 108, $upd_func_id, value);
	}


	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public String upd_func_nm() {
		return getConstString(offset + 109, $upd_func_nm);
	}

	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public void upd_func_nm(String value) {
		setConstString(offset + 109, $upd_func_nm, value);
	}


	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public MCTimestamp upd_ts() {
		return getConstTimestamp(offset + 110, $upd_ts);
	}

	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public void upd_ts(MCTimestamp value) {
		setConstTimestamp(offset + 110, $upd_ts, value);
	}


	/**
	 * Request No. リクエストＮＯ.<p>
	 *
	 */
	public String upd_srv_req_no() {
		return getConstString(offset + 111, $upd_srv_req_no);
	}

	/**
	 * Request No. リクエストＮＯ.<p>
	 *
	 */
	public void upd_srv_req_no(String value) {
		setConstString(offset + 111, $upd_srv_req_no, value);
	}


	/**
	 * With specific inspection rejected flg. 規格検査不合格有りＦＬＧ.<p>
	 *
	 */
	public boolean std_insp_ng_flg() {
		return getConstBoolean(offset + 112, $std_insp_ng_flg);
	}

	/**
	 * With specific inspection rejected flg. 規格検査不合格有りＦＬＧ.<p>
	 *
	 */
	public void std_insp_ng_flg(boolean value) {
		setConstBoolean(offset + 112, $std_insp_ng_flg, value);
	}


	/**
	 * With specific inspection concession flg. 規格検査特採有りＦＬＧ.<p>
	 *
	 */
	public boolean std_insp_sp_flg() {
		return getConstBoolean(offset + 113, $std_insp_sp_flg);
	}

	/**
	 * With specific inspection concession flg. 規格検査特採有りＦＬＧ.<p>
	 *
	 */
	public void std_insp_sp_flg(boolean value) {
		setConstBoolean(offset + 113, $std_insp_sp_flg, value);
	}


	/**
	 * Inspection pattern cd. 検査パタンＣＤ.<p>
	 *
	 */
	public String insp_ptn_cd() {
		return getConstString(offset + 114, $insp_ptn_cd);
	}

	/**
	 * Inspection pattern cd. 検査パタンＣＤ.<p>
	 *
	 */
	public void insp_ptn_cd(String value) {
		setConstString(offset + 114, $insp_ptn_cd, value);
	}


	/**
	 * Factory/Distribution warehouse cd. 工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public String to_site_cd() {
		return getConstString(offset + 115, $to_site_cd);
	}

	/**
	 * Factory/Distribution warehouse cd. 工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public void to_site_cd(String value) {
		setConstString(offset + 115, $to_site_cd, value);
	}


	/**
	 * Master application date マスタ適用日.<p>
	 *
	 */
	public MCDate master_dt() {
		return getConstDate(offset + 116, $master_dt);
	}

	/**
	 * Master application date マスタ適用日.<p>
	 *
	 */
	public void master_dt(MCDate value) {
		setConstDate(offset + 116, $master_dt, value);
	}


	/**
	 * LIMS ＬＩＭＳ.<p>
	 *
	 */
	public boolean lims_flg() {
		return getConstBoolean(offset + 117, $lims_flg);
	}

	/**
	 * LIMS ＬＩＭＳ.<p>
	 *
	 */
	public void lims_flg(boolean value) {
		setConstBoolean(offset + 117, $lims_flg, value);
	}


	/**
	 * External system cd. 外部システムＣＤ.<p>
	 *
	 */
	public String ext_sys_cd() {
		return getConstString(offset + 118, $ext_sys_cd);
	}

	/**
	 * External system cd. 外部システムＣＤ.<p>
	 *
	 */
	public void ext_sys_cd(String value) {
		setConstString(offset + 118, $ext_sys_cd, value);
	}


	/**
	 * External system name 外部システム名.<p>
	 *
	 */
	public String ext_sys_nm() {
		return getConstString(offset + 119, $ext_sys_nm);
	}

	/**
	 * External system name 外部システム名.<p>
	 *
	 */
	public void ext_sys_nm(String value) {
		setConstString(offset + 119, $ext_sys_nm, value);
	}


	/**
	 * External inspection result No. 外部検査実績ＮＯ.<p>
	 *
	 */
	public String ext_insp_act_no() {
		return getConstString(offset + 120, $ext_insp_act_no);
	}

	/**
	 * External inspection result No. 外部検査実績ＮＯ.<p>
	 *
	 */
	public void ext_insp_act_no(String value) {
		setConstString(offset + 120, $ext_insp_act_no, value);
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
		if ($pack_unit_cd.equalsIgnoreCase(name)) {
			return pack_unit_cd();
		}
		if ($pack_unit_nm.equalsIgnoreCase(name)) {
			return pack_unit_nm();
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
		if ($bp_lot_no.equalsIgnoreCase(name)) {
			return bp_lot_no();
		}
		if ($act_usr_cd.equalsIgnoreCase(name)) {
			return act_usr_cd();
		}
		if ($act_usr_nm.equalsIgnoreCase(name)) {
			return act_usr_nm();
		}
		if ($act_dpt_cd.equalsIgnoreCase(name)) {
			return act_dpt_cd();
		}
		if ($act_dpt_nm.equalsIgnoreCase(name)) {
			return act_dpt_nm();
		}
		if ($insp_judg_rslt_typ.equalsIgnoreCase(name)) {
			return insp_judg_rslt_typ();
		}
		if ($insp_judg_rslt_typ_nm.equalsIgnoreCase(name)) {
			return insp_judg_rslt_typ_nm();
		}
		if ($judg_usr_cd.equalsIgnoreCase(name)) {
			return judg_usr_cd();
		}
		if ($judg_usr_nm.equalsIgnoreCase(name)) {
			return judg_usr_nm();
		}
		if ($judg_dpt_cd.equalsIgnoreCase(name)) {
			return judg_dpt_cd();
		}
		if ($judg_dpt_nm.equalsIgnoreCase(name)) {
			return judg_dpt_nm();
		}
		if ($judg_rsn.equalsIgnoreCase(name)) {
			return judg_rsn();
		}
		if ($dfct_rsn_cd.equalsIgnoreCase(name)) {
			return dfct_rsn_cd();
		}
		if ($dfct_rsn_nm.equalsIgnoreCase(name)) {
			return dfct_rsn_nm();
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
		if ($intr_rmrks.equalsIgnoreCase(name)) {
			return intr_rmrks();
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
		if ($insp_ptn_cd.equalsIgnoreCase(name)) {
			return insp_ptn_cd();
		}
		if ($to_site_cd.equalsIgnoreCase(name)) {
			return to_site_cd();
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
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($insp_freq.equalsIgnoreCase(name)) {
			return insp_freq();
		}
		if ($inst_pack_unit_qty.equalsIgnoreCase(name)) {
			return inst_pack_unit_qty();
		}
		if ($pack_unit_dec_place.equalsIgnoreCase(name)) {
			return pack_unit_dec_place();
		}
		if ($inst_base_unit_qty.equalsIgnoreCase(name)) {
			return inst_base_unit_qty();
		}
		if ($rem_base_unit_qty.equalsIgnoreCase(name)) {
			return rem_base_unit_qty();
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			return base_unit_dec_place();
		}
		if ($good_qty.equalsIgnoreCase(name)) {
			return good_qty();
		}
		if ($dfct_qty.equalsIgnoreCase(name)) {
			return dfct_qty();
		}
		if ($act_ttl_qty.equalsIgnoreCase(name)) {
			return act_ttl_qty();
		}
		if ($judg_ttl_qty.equalsIgnoreCase(name)) {
			return judg_ttl_qty();
		}
		if ($smpl_inst_qty.equalsIgnoreCase(name)) {
			return smpl_inst_qty();
		}
		if ($smpl_inst_unit_dec_place.equalsIgnoreCase(name)) {
			return smpl_inst_unit_dec_place();
		}
		if ($std_cont_fctr.equalsIgnoreCase(name)) {
			return std_cont_fctr();
		}
		if ($act_cont_fctr.equalsIgnoreCase(name)) {
			return act_cont_fctr();
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
		if ($insp_rslt_prnt_tm.equalsIgnoreCase(name)) {
			return insp_rslt_prnt_tm();
		}
		if ($st_dt.equalsIgnoreCase(name)) {
			return st_dt();
		}
		if ($st_hm.equalsIgnoreCase(name)) {
			return st_hm();
		}
		if ($end_dt.equalsIgnoreCase(name)) {
			return end_dt();
		}
		if ($end_hm.equalsIgnoreCase(name)) {
			return end_hm();
		}
		if ($judg_dt.equalsIgnoreCase(name)) {
			return judg_dt();
		}
		if ($lmt_dt_frm.equalsIgnoreCase(name)) {
			return lmt_dt_frm();
		}
		if ($vld_dt.equalsIgnoreCase(name)) {
			return vld_dt();
		}
		if ($lmt_dt.equalsIgnoreCase(name)) {
			return lmt_dt();
		}
		if ($vld_dt_now.equalsIgnoreCase(name)) {
			return vld_dt_now();
		}
		if ($lmt_dt_now.equalsIgnoreCase(name)) {
			return lmt_dt_now();
		}
		if ($master_dt.equalsIgnoreCase(name)) {
			return master_dt();
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
		if ($insp_rslt_prnt_flg.equalsIgnoreCase(name)) {
			return insp_rslt_prnt_flg();
		}
		if ($vld_dt_upd_flg.equalsIgnoreCase(name)) {
			return vld_dt_upd_flg();
		}
		if ($lmt_up_flg.equalsIgnoreCase(name)) {
			return lmt_up_flg();
		}
		if ($lmt_ctl_flg.equalsIgnoreCase(name)) {
			return lmt_ctl_flg();
		}
		if ($cont_fctr_flg.equalsIgnoreCase(name)) {
			return cont_fctr_flg();
		}
		if ($in_prmt_insp_flg.equalsIgnoreCase(name)) {
			return in_prmt_insp_flg();
		}
		if ($spec_sp_flg.equalsIgnoreCase(name)) {
			return spec_sp_flg();
		}
		if ($spec_ng_flg.equalsIgnoreCase(name)) {
			return spec_ng_flg();
		}
		if ($std_insp_ng_flg.equalsIgnoreCase(name)) {
			return std_insp_ng_flg();
		}
		if ($std_insp_sp_flg.equalsIgnoreCase(name)) {
			return std_insp_sp_flg();
		}
		if ($lims_flg.equalsIgnoreCase(name)) {
			return lims_flg();
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
		if ($pack_unit_cd.equalsIgnoreCase(name)) {
			return pack_unit_cd();
		}
		if ($pack_unit_nm.equalsIgnoreCase(name)) {
			return pack_unit_nm();
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
		if ($bp_lot_no.equalsIgnoreCase(name)) {
			return bp_lot_no();
		}
		if ($act_usr_cd.equalsIgnoreCase(name)) {
			return act_usr_cd();
		}
		if ($act_usr_nm.equalsIgnoreCase(name)) {
			return act_usr_nm();
		}
		if ($act_dpt_cd.equalsIgnoreCase(name)) {
			return act_dpt_cd();
		}
		if ($act_dpt_nm.equalsIgnoreCase(name)) {
			return act_dpt_nm();
		}
		if ($insp_judg_rslt_typ.equalsIgnoreCase(name)) {
			return insp_judg_rslt_typ();
		}
		if ($insp_judg_rslt_typ_nm.equalsIgnoreCase(name)) {
			return insp_judg_rslt_typ_nm();
		}
		if ($judg_usr_cd.equalsIgnoreCase(name)) {
			return judg_usr_cd();
		}
		if ($judg_usr_nm.equalsIgnoreCase(name)) {
			return judg_usr_nm();
		}
		if ($judg_dpt_cd.equalsIgnoreCase(name)) {
			return judg_dpt_cd();
		}
		if ($judg_dpt_nm.equalsIgnoreCase(name)) {
			return judg_dpt_nm();
		}
		if ($judg_rsn.equalsIgnoreCase(name)) {
			return judg_rsn();
		}
		if ($dfct_rsn_cd.equalsIgnoreCase(name)) {
			return dfct_rsn_cd();
		}
		if ($dfct_rsn_nm.equalsIgnoreCase(name)) {
			return dfct_rsn_nm();
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
		if ($intr_rmrks.equalsIgnoreCase(name)) {
			return intr_rmrks();
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
		if ($insp_ptn_cd.equalsIgnoreCase(name)) {
			return insp_ptn_cd();
		}
		if ($to_site_cd.equalsIgnoreCase(name)) {
			return to_site_cd();
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
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($insp_freq.equalsIgnoreCase(name)) {
			return insp_freq();
		}
		if ($inst_pack_unit_qty.equalsIgnoreCase(name)) {
			return inst_pack_unit_qty();
		}
		if ($pack_unit_dec_place.equalsIgnoreCase(name)) {
			return pack_unit_dec_place();
		}
		if ($inst_base_unit_qty.equalsIgnoreCase(name)) {
			return inst_base_unit_qty();
		}
		if ($rem_base_unit_qty.equalsIgnoreCase(name)) {
			return rem_base_unit_qty();
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			return base_unit_dec_place();
		}
		if ($good_qty.equalsIgnoreCase(name)) {
			return good_qty();
		}
		if ($dfct_qty.equalsIgnoreCase(name)) {
			return dfct_qty();
		}
		if ($act_ttl_qty.equalsIgnoreCase(name)) {
			return act_ttl_qty();
		}
		if ($judg_ttl_qty.equalsIgnoreCase(name)) {
			return judg_ttl_qty();
		}
		if ($smpl_inst_qty.equalsIgnoreCase(name)) {
			return smpl_inst_qty();
		}
		if ($smpl_inst_unit_dec_place.equalsIgnoreCase(name)) {
			return smpl_inst_unit_dec_place();
		}
		if ($std_cont_fctr.equalsIgnoreCase(name)) {
			return std_cont_fctr();
		}
		if ($act_cont_fctr.equalsIgnoreCase(name)) {
			return act_cont_fctr();
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
		if ($insp_rslt_prnt_tm.equalsIgnoreCase(name)) {
			return insp_rslt_prnt_tm();
		}
		if ($st_dt.equalsIgnoreCase(name)) {
			return st_dt();
		}
		if ($st_hm.equalsIgnoreCase(name)) {
			return st_hm();
		}
		if ($end_dt.equalsIgnoreCase(name)) {
			return end_dt();
		}
		if ($end_hm.equalsIgnoreCase(name)) {
			return end_hm();
		}
		if ($judg_dt.equalsIgnoreCase(name)) {
			return judg_dt();
		}
		if ($lmt_dt_frm.equalsIgnoreCase(name)) {
			return lmt_dt_frm();
		}
		if ($vld_dt.equalsIgnoreCase(name)) {
			return vld_dt();
		}
		if ($lmt_dt.equalsIgnoreCase(name)) {
			return lmt_dt();
		}
		if ($vld_dt_now.equalsIgnoreCase(name)) {
			return vld_dt_now();
		}
		if ($lmt_dt_now.equalsIgnoreCase(name)) {
			return lmt_dt_now();
		}
		if ($master_dt.equalsIgnoreCase(name)) {
			return master_dt();
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
		if ($insp_rslt_prnt_flg.equalsIgnoreCase(name)) {
			return insp_rslt_prnt_flg();
		}
		if ($vld_dt_upd_flg.equalsIgnoreCase(name)) {
			return vld_dt_upd_flg();
		}
		if ($lmt_up_flg.equalsIgnoreCase(name)) {
			return lmt_up_flg();
		}
		if ($lmt_ctl_flg.equalsIgnoreCase(name)) {
			return lmt_ctl_flg();
		}
		if ($cont_fctr_flg.equalsIgnoreCase(name)) {
			return cont_fctr_flg();
		}
		if ($in_prmt_insp_flg.equalsIgnoreCase(name)) {
			return in_prmt_insp_flg();
		}
		if ($spec_sp_flg.equalsIgnoreCase(name)) {
			return spec_sp_flg();
		}
		if ($spec_ng_flg.equalsIgnoreCase(name)) {
			return spec_ng_flg();
		}
		if ($std_insp_ng_flg.equalsIgnoreCase(name)) {
			return std_insp_ng_flg();
		}
		if ($std_insp_sp_flg.equalsIgnoreCase(name)) {
			return std_insp_sp_flg();
		}
		if ($lims_flg.equalsIgnoreCase(name)) {
			return lims_flg();
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
		if ($pack_unit_cd.equalsIgnoreCase(name)) {
			pack_unit_cd(value);
			return;
		}
		if ($pack_unit_nm.equalsIgnoreCase(name)) {
			pack_unit_nm(value);
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
		if ($bp_lot_no.equalsIgnoreCase(name)) {
			bp_lot_no(value);
			return;
		}
		if ($act_usr_cd.equalsIgnoreCase(name)) {
			act_usr_cd(value);
			return;
		}
		if ($act_usr_nm.equalsIgnoreCase(name)) {
			act_usr_nm(value);
			return;
		}
		if ($act_dpt_cd.equalsIgnoreCase(name)) {
			act_dpt_cd(value);
			return;
		}
		if ($act_dpt_nm.equalsIgnoreCase(name)) {
			act_dpt_nm(value);
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
		if ($judg_usr_cd.equalsIgnoreCase(name)) {
			judg_usr_cd(value);
			return;
		}
		if ($judg_usr_nm.equalsIgnoreCase(name)) {
			judg_usr_nm(value);
			return;
		}
		if ($judg_dpt_cd.equalsIgnoreCase(name)) {
			judg_dpt_cd(value);
			return;
		}
		if ($judg_dpt_nm.equalsIgnoreCase(name)) {
			judg_dpt_nm(value);
			return;
		}
		if ($judg_rsn.equalsIgnoreCase(name)) {
			judg_rsn(value);
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
		if ($intr_rmrks.equalsIgnoreCase(name)) {
			intr_rmrks(value);
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
		if ($insp_ptn_cd.equalsIgnoreCase(name)) {
			insp_ptn_cd(value);
			return;
		}
		if ($to_site_cd.equalsIgnoreCase(name)) {
			to_site_cd(value);
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
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($insp_freq.equalsIgnoreCase(name)) {
			insp_freq(value);
			return;
		}
		if ($inst_pack_unit_qty.equalsIgnoreCase(name)) {
			inst_pack_unit_qty(value);
			return;
		}
		if ($pack_unit_dec_place.equalsIgnoreCase(name)) {
			pack_unit_dec_place(value);
			return;
		}
		if ($inst_base_unit_qty.equalsIgnoreCase(name)) {
			inst_base_unit_qty(value);
			return;
		}
		if ($rem_base_unit_qty.equalsIgnoreCase(name)) {
			rem_base_unit_qty(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($good_qty.equalsIgnoreCase(name)) {
			good_qty(value);
			return;
		}
		if ($dfct_qty.equalsIgnoreCase(name)) {
			dfct_qty(value);
			return;
		}
		if ($act_ttl_qty.equalsIgnoreCase(name)) {
			act_ttl_qty(value);
			return;
		}
		if ($judg_ttl_qty.equalsIgnoreCase(name)) {
			judg_ttl_qty(value);
			return;
		}
		if ($smpl_inst_qty.equalsIgnoreCase(name)) {
			smpl_inst_qty(value);
			return;
		}
		if ($smpl_inst_unit_dec_place.equalsIgnoreCase(name)) {
			smpl_inst_unit_dec_place(value);
			return;
		}
		if ($std_cont_fctr.equalsIgnoreCase(name)) {
			std_cont_fctr(value);
			return;
		}
		if ($act_cont_fctr.equalsIgnoreCase(name)) {
			act_cont_fctr(value);
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
		if ($inst_pack_unit_qty.equalsIgnoreCase(name)) {
			inst_pack_unit_qty(value);
			return;
		}
		if ($pack_unit_dec_place.equalsIgnoreCase(name)) {
			pack_unit_dec_place(value);
			return;
		}
		if ($inst_base_unit_qty.equalsIgnoreCase(name)) {
			inst_base_unit_qty(value);
			return;
		}
		if ($rem_base_unit_qty.equalsIgnoreCase(name)) {
			rem_base_unit_qty(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($good_qty.equalsIgnoreCase(name)) {
			good_qty(value);
			return;
		}
		if ($dfct_qty.equalsIgnoreCase(name)) {
			dfct_qty(value);
			return;
		}
		if ($act_ttl_qty.equalsIgnoreCase(name)) {
			act_ttl_qty(value);
			return;
		}
		if ($judg_ttl_qty.equalsIgnoreCase(name)) {
			judg_ttl_qty(value);
			return;
		}
		if ($smpl_inst_qty.equalsIgnoreCase(name)) {
			smpl_inst_qty(value);
			return;
		}
		if ($smpl_inst_unit_dec_place.equalsIgnoreCase(name)) {
			smpl_inst_unit_dec_place(value);
			return;
		}
		if ($std_cont_fctr.equalsIgnoreCase(name)) {
			std_cont_fctr(value);
			return;
		}
		if ($act_cont_fctr.equalsIgnoreCase(name)) {
			act_cont_fctr(value);
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
		if ($inst_pack_unit_qty.equalsIgnoreCase(name)) {
			inst_pack_unit_qty(value);
			return;
		}
		if ($pack_unit_dec_place.equalsIgnoreCase(name)) {
			pack_unit_dec_place(value);
			return;
		}
		if ($inst_base_unit_qty.equalsIgnoreCase(name)) {
			inst_base_unit_qty(value);
			return;
		}
		if ($rem_base_unit_qty.equalsIgnoreCase(name)) {
			rem_base_unit_qty(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($good_qty.equalsIgnoreCase(name)) {
			good_qty(value);
			return;
		}
		if ($dfct_qty.equalsIgnoreCase(name)) {
			dfct_qty(value);
			return;
		}
		if ($act_ttl_qty.equalsIgnoreCase(name)) {
			act_ttl_qty(value);
			return;
		}
		if ($judg_ttl_qty.equalsIgnoreCase(name)) {
			judg_ttl_qty(value);
			return;
		}
		if ($smpl_inst_qty.equalsIgnoreCase(name)) {
			smpl_inst_qty(value);
			return;
		}
		if ($smpl_inst_unit_dec_place.equalsIgnoreCase(name)) {
			smpl_inst_unit_dec_place(value);
			return;
		}
		if ($std_cont_fctr.equalsIgnoreCase(name)) {
			std_cont_fctr(value);
			return;
		}
		if ($act_cont_fctr.equalsIgnoreCase(name)) {
			act_cont_fctr(value);
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
		if ($inst_pack_unit_qty.equalsIgnoreCase(name)) {
			inst_pack_unit_qty(value);
			return;
		}
		if ($pack_unit_dec_place.equalsIgnoreCase(name)) {
			pack_unit_dec_place(value);
			return;
		}
		if ($inst_base_unit_qty.equalsIgnoreCase(name)) {
			inst_base_unit_qty(value);
			return;
		}
		if ($rem_base_unit_qty.equalsIgnoreCase(name)) {
			rem_base_unit_qty(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($good_qty.equalsIgnoreCase(name)) {
			good_qty(value);
			return;
		}
		if ($dfct_qty.equalsIgnoreCase(name)) {
			dfct_qty(value);
			return;
		}
		if ($act_ttl_qty.equalsIgnoreCase(name)) {
			act_ttl_qty(value);
			return;
		}
		if ($judg_ttl_qty.equalsIgnoreCase(name)) {
			judg_ttl_qty(value);
			return;
		}
		if ($smpl_inst_qty.equalsIgnoreCase(name)) {
			smpl_inst_qty(value);
			return;
		}
		if ($smpl_inst_unit_dec_place.equalsIgnoreCase(name)) {
			smpl_inst_unit_dec_place(value);
			return;
		}
		if ($std_cont_fctr.equalsIgnoreCase(name)) {
			std_cont_fctr(value);
			return;
		}
		if ($act_cont_fctr.equalsIgnoreCase(name)) {
			act_cont_fctr(value);
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
		if ($inst_pack_unit_qty.equalsIgnoreCase(name)) {
			inst_pack_unit_qty(value);
			return;
		}
		if ($pack_unit_dec_place.equalsIgnoreCase(name)) {
			pack_unit_dec_place(value);
			return;
		}
		if ($inst_base_unit_qty.equalsIgnoreCase(name)) {
			inst_base_unit_qty(value);
			return;
		}
		if ($rem_base_unit_qty.equalsIgnoreCase(name)) {
			rem_base_unit_qty(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($good_qty.equalsIgnoreCase(name)) {
			good_qty(value);
			return;
		}
		if ($dfct_qty.equalsIgnoreCase(name)) {
			dfct_qty(value);
			return;
		}
		if ($act_ttl_qty.equalsIgnoreCase(name)) {
			act_ttl_qty(value);
			return;
		}
		if ($judg_ttl_qty.equalsIgnoreCase(name)) {
			judg_ttl_qty(value);
			return;
		}
		if ($smpl_inst_qty.equalsIgnoreCase(name)) {
			smpl_inst_qty(value);
			return;
		}
		if ($smpl_inst_unit_dec_place.equalsIgnoreCase(name)) {
			smpl_inst_unit_dec_place(value);
			return;
		}
		if ($std_cont_fctr.equalsIgnoreCase(name)) {
			std_cont_fctr(value);
			return;
		}
		if ($act_cont_fctr.equalsIgnoreCase(name)) {
			act_cont_fctr(value);
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
		if ($insp_rslt_prnt_tm.equalsIgnoreCase(name)) {
			insp_rslt_prnt_tm(value);
			return;
		}
		if ($st_dt.equalsIgnoreCase(name)) {
			st_dt(value);
			return;
		}
		if ($st_hm.equalsIgnoreCase(name)) {
			st_hm(value);
			return;
		}
		if ($end_dt.equalsIgnoreCase(name)) {
			end_dt(value);
			return;
		}
		if ($end_hm.equalsIgnoreCase(name)) {
			end_hm(value);
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
		if ($vld_dt.equalsIgnoreCase(name)) {
			vld_dt(value);
			return;
		}
		if ($lmt_dt.equalsIgnoreCase(name)) {
			lmt_dt(value);
			return;
		}
		if ($vld_dt_now.equalsIgnoreCase(name)) {
			vld_dt_now(value);
			return;
		}
		if ($lmt_dt_now.equalsIgnoreCase(name)) {
			lmt_dt_now(value);
			return;
		}
		if ($master_dt.equalsIgnoreCase(name)) {
			master_dt(value);
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
		if ($insp_rslt_prnt_flg.equalsIgnoreCase(name)) {
			insp_rslt_prnt_flg(value);
			return;
		}
		if ($vld_dt_upd_flg.equalsIgnoreCase(name)) {
			vld_dt_upd_flg(value);
			return;
		}
		if ($lmt_up_flg.equalsIgnoreCase(name)) {
			lmt_up_flg(value);
			return;
		}
		if ($lmt_ctl_flg.equalsIgnoreCase(name)) {
			lmt_ctl_flg(value);
			return;
		}
		if ($cont_fctr_flg.equalsIgnoreCase(name)) {
			cont_fctr_flg(value);
			return;
		}
		if ($in_prmt_insp_flg.equalsIgnoreCase(name)) {
			in_prmt_insp_flg(value);
			return;
		}
		if ($spec_sp_flg.equalsIgnoreCase(name)) {
			spec_sp_flg(value);
			return;
		}
		if ($spec_ng_flg.equalsIgnoreCase(name)) {
			spec_ng_flg(value);
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
		if ($lims_flg.equalsIgnoreCase(name)) {
			lims_flg(value);
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
		if ($pack_unit_cd.equalsIgnoreCase(name)) {
			pack_unit_cd(value);
			return;
		}
		if ($pack_unit_nm.equalsIgnoreCase(name)) {
			pack_unit_nm(value);
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
		if ($bp_lot_no.equalsIgnoreCase(name)) {
			bp_lot_no(value);
			return;
		}
		if ($act_usr_cd.equalsIgnoreCase(name)) {
			act_usr_cd(value);
			return;
		}
		if ($act_usr_nm.equalsIgnoreCase(name)) {
			act_usr_nm(value);
			return;
		}
		if ($act_dpt_cd.equalsIgnoreCase(name)) {
			act_dpt_cd(value);
			return;
		}
		if ($act_dpt_nm.equalsIgnoreCase(name)) {
			act_dpt_nm(value);
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
		if ($judg_usr_cd.equalsIgnoreCase(name)) {
			judg_usr_cd(value);
			return;
		}
		if ($judg_usr_nm.equalsIgnoreCase(name)) {
			judg_usr_nm(value);
			return;
		}
		if ($judg_dpt_cd.equalsIgnoreCase(name)) {
			judg_dpt_cd(value);
			return;
		}
		if ($judg_dpt_nm.equalsIgnoreCase(name)) {
			judg_dpt_nm(value);
			return;
		}
		if ($judg_rsn.equalsIgnoreCase(name)) {
			judg_rsn(value);
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
		if ($intr_rmrks.equalsIgnoreCase(name)) {
			intr_rmrks(value);
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
		if ($insp_ptn_cd.equalsIgnoreCase(name)) {
			insp_ptn_cd(value);
			return;
		}
		if ($to_site_cd.equalsIgnoreCase(name)) {
			to_site_cd(value);
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
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($insp_freq.equalsIgnoreCase(name)) {
			insp_freq(value);
			return;
		}
		if ($inst_pack_unit_qty.equalsIgnoreCase(name)) {
			inst_pack_unit_qty(value);
			return;
		}
		if ($pack_unit_dec_place.equalsIgnoreCase(name)) {
			pack_unit_dec_place(value);
			return;
		}
		if ($inst_base_unit_qty.equalsIgnoreCase(name)) {
			inst_base_unit_qty(value);
			return;
		}
		if ($rem_base_unit_qty.equalsIgnoreCase(name)) {
			rem_base_unit_qty(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($good_qty.equalsIgnoreCase(name)) {
			good_qty(value);
			return;
		}
		if ($dfct_qty.equalsIgnoreCase(name)) {
			dfct_qty(value);
			return;
		}
		if ($act_ttl_qty.equalsIgnoreCase(name)) {
			act_ttl_qty(value);
			return;
		}
		if ($judg_ttl_qty.equalsIgnoreCase(name)) {
			judg_ttl_qty(value);
			return;
		}
		if ($smpl_inst_qty.equalsIgnoreCase(name)) {
			smpl_inst_qty(value);
			return;
		}
		if ($smpl_inst_unit_dec_place.equalsIgnoreCase(name)) {
			smpl_inst_unit_dec_place(value);
			return;
		}
		if ($std_cont_fctr.equalsIgnoreCase(name)) {
			std_cont_fctr(value);
			return;
		}
		if ($act_cont_fctr.equalsIgnoreCase(name)) {
			act_cont_fctr(value);
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
		if ($inst_pack_unit_qty.equalsIgnoreCase(name)) {
			inst_pack_unit_qty(value);
			return;
		}
		if ($pack_unit_dec_place.equalsIgnoreCase(name)) {
			pack_unit_dec_place(value);
			return;
		}
		if ($inst_base_unit_qty.equalsIgnoreCase(name)) {
			inst_base_unit_qty(value);
			return;
		}
		if ($rem_base_unit_qty.equalsIgnoreCase(name)) {
			rem_base_unit_qty(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($good_qty.equalsIgnoreCase(name)) {
			good_qty(value);
			return;
		}
		if ($dfct_qty.equalsIgnoreCase(name)) {
			dfct_qty(value);
			return;
		}
		if ($act_ttl_qty.equalsIgnoreCase(name)) {
			act_ttl_qty(value);
			return;
		}
		if ($judg_ttl_qty.equalsIgnoreCase(name)) {
			judg_ttl_qty(value);
			return;
		}
		if ($smpl_inst_qty.equalsIgnoreCase(name)) {
			smpl_inst_qty(value);
			return;
		}
		if ($smpl_inst_unit_dec_place.equalsIgnoreCase(name)) {
			smpl_inst_unit_dec_place(value);
			return;
		}
		if ($std_cont_fctr.equalsIgnoreCase(name)) {
			std_cont_fctr(value);
			return;
		}
		if ($act_cont_fctr.equalsIgnoreCase(name)) {
			act_cont_fctr(value);
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
		if ($inst_pack_unit_qty.equalsIgnoreCase(name)) {
			inst_pack_unit_qty(value);
			return;
		}
		if ($pack_unit_dec_place.equalsIgnoreCase(name)) {
			pack_unit_dec_place(value);
			return;
		}
		if ($inst_base_unit_qty.equalsIgnoreCase(name)) {
			inst_base_unit_qty(value);
			return;
		}
		if ($rem_base_unit_qty.equalsIgnoreCase(name)) {
			rem_base_unit_qty(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($good_qty.equalsIgnoreCase(name)) {
			good_qty(value);
			return;
		}
		if ($dfct_qty.equalsIgnoreCase(name)) {
			dfct_qty(value);
			return;
		}
		if ($act_ttl_qty.equalsIgnoreCase(name)) {
			act_ttl_qty(value);
			return;
		}
		if ($judg_ttl_qty.equalsIgnoreCase(name)) {
			judg_ttl_qty(value);
			return;
		}
		if ($smpl_inst_qty.equalsIgnoreCase(name)) {
			smpl_inst_qty(value);
			return;
		}
		if ($smpl_inst_unit_dec_place.equalsIgnoreCase(name)) {
			smpl_inst_unit_dec_place(value);
			return;
		}
		if ($std_cont_fctr.equalsIgnoreCase(name)) {
			std_cont_fctr(value);
			return;
		}
		if ($act_cont_fctr.equalsIgnoreCase(name)) {
			act_cont_fctr(value);
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
		if ($inst_pack_unit_qty.equalsIgnoreCase(name)) {
			inst_pack_unit_qty(value);
			return;
		}
		if ($pack_unit_dec_place.equalsIgnoreCase(name)) {
			pack_unit_dec_place(value);
			return;
		}
		if ($inst_base_unit_qty.equalsIgnoreCase(name)) {
			inst_base_unit_qty(value);
			return;
		}
		if ($rem_base_unit_qty.equalsIgnoreCase(name)) {
			rem_base_unit_qty(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($good_qty.equalsIgnoreCase(name)) {
			good_qty(value);
			return;
		}
		if ($dfct_qty.equalsIgnoreCase(name)) {
			dfct_qty(value);
			return;
		}
		if ($act_ttl_qty.equalsIgnoreCase(name)) {
			act_ttl_qty(value);
			return;
		}
		if ($judg_ttl_qty.equalsIgnoreCase(name)) {
			judg_ttl_qty(value);
			return;
		}
		if ($smpl_inst_qty.equalsIgnoreCase(name)) {
			smpl_inst_qty(value);
			return;
		}
		if ($smpl_inst_unit_dec_place.equalsIgnoreCase(name)) {
			smpl_inst_unit_dec_place(value);
			return;
		}
		if ($std_cont_fctr.equalsIgnoreCase(name)) {
			std_cont_fctr(value);
			return;
		}
		if ($act_cont_fctr.equalsIgnoreCase(name)) {
			act_cont_fctr(value);
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
		if ($inst_pack_unit_qty.equalsIgnoreCase(name)) {
			inst_pack_unit_qty(value);
			return;
		}
		if ($pack_unit_dec_place.equalsIgnoreCase(name)) {
			pack_unit_dec_place(value);
			return;
		}
		if ($inst_base_unit_qty.equalsIgnoreCase(name)) {
			inst_base_unit_qty(value);
			return;
		}
		if ($rem_base_unit_qty.equalsIgnoreCase(name)) {
			rem_base_unit_qty(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($good_qty.equalsIgnoreCase(name)) {
			good_qty(value);
			return;
		}
		if ($dfct_qty.equalsIgnoreCase(name)) {
			dfct_qty(value);
			return;
		}
		if ($act_ttl_qty.equalsIgnoreCase(name)) {
			act_ttl_qty(value);
			return;
		}
		if ($judg_ttl_qty.equalsIgnoreCase(name)) {
			judg_ttl_qty(value);
			return;
		}
		if ($smpl_inst_qty.equalsIgnoreCase(name)) {
			smpl_inst_qty(value);
			return;
		}
		if ($smpl_inst_unit_dec_place.equalsIgnoreCase(name)) {
			smpl_inst_unit_dec_place(value);
			return;
		}
		if ($std_cont_fctr.equalsIgnoreCase(name)) {
			std_cont_fctr(value);
			return;
		}
		if ($act_cont_fctr.equalsIgnoreCase(name)) {
			act_cont_fctr(value);
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
		if ($insp_rslt_prnt_tm.equalsIgnoreCase(name)) {
			insp_rslt_prnt_tm(value);
			return;
		}
		if ($st_dt.equalsIgnoreCase(name)) {
			st_dt(value);
			return;
		}
		if ($st_hm.equalsIgnoreCase(name)) {
			st_hm(value);
			return;
		}
		if ($end_dt.equalsIgnoreCase(name)) {
			end_dt(value);
			return;
		}
		if ($end_hm.equalsIgnoreCase(name)) {
			end_hm(value);
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
		if ($vld_dt.equalsIgnoreCase(name)) {
			vld_dt(value);
			return;
		}
		if ($lmt_dt.equalsIgnoreCase(name)) {
			lmt_dt(value);
			return;
		}
		if ($vld_dt_now.equalsIgnoreCase(name)) {
			vld_dt_now(value);
			return;
		}
		if ($lmt_dt_now.equalsIgnoreCase(name)) {
			lmt_dt_now(value);
			return;
		}
		if ($master_dt.equalsIgnoreCase(name)) {
			master_dt(value);
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
		if ($insp_rslt_prnt_flg.equalsIgnoreCase(name)) {
			insp_rslt_prnt_flg(value);
			return;
		}
		if ($vld_dt_upd_flg.equalsIgnoreCase(name)) {
			vld_dt_upd_flg(value);
			return;
		}
		if ($lmt_up_flg.equalsIgnoreCase(name)) {
			lmt_up_flg(value);
			return;
		}
		if ($lmt_ctl_flg.equalsIgnoreCase(name)) {
			lmt_ctl_flg(value);
			return;
		}
		if ($cont_fctr_flg.equalsIgnoreCase(name)) {
			cont_fctr_flg(value);
			return;
		}
		if ($in_prmt_insp_flg.equalsIgnoreCase(name)) {
			in_prmt_insp_flg(value);
			return;
		}
		if ($spec_sp_flg.equalsIgnoreCase(name)) {
			spec_sp_flg(value);
			return;
		}
		if ($spec_ng_flg.equalsIgnoreCase(name)) {
			spec_ng_flg(value);
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
		if ($lims_flg.equalsIgnoreCase(name)) {
			lims_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

