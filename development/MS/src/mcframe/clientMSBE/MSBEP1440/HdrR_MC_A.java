package mcframe.clientMSBE.MSBEP1440;

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
 * ブロック"Hdr"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class HdrR_MC_A extends MCConstRow {

	/**
	 * Transaction cd. 取引ＣＤ.<p>
	 *
	 */
	public static final String $trd_cd = "trd_cd";
	/**
	 * Transaction name 取引名.<p>
	 *
	 */
	public static final String $trd_nm = "trd_nm";
	/**
	 * Transaction pattern type 取引パタン区分.<p>
	 *
	 */
	public static final String $trd_ptn_typ = "trd_ptn_typ";
	/**
	 * Recording month 計上年月.<p>
	 *
	 */
	public static final String $ac_ym = "ac_ym";
	/**
	 * Shipping result No. 出荷実績ＮＯ.<p>
	 *
	 */
	public static final String $ship_act_no = "ship_act_no";
	/**
	 * Shipping result No. rev. number 出荷実績ＮＯ改訂番号.<p>
	 *
	 */
	public static final String $ship_act_rev = "ship_act_rev";
	/**
	 * Latest 最新.<p>
	 *
	 */
	public static final String $latest_flg = "latest_flg";
	/**
	 * Cancel 取消.<p>
	 *
	 */
	public static final String $can_flg = "can_flg";
	/**
	 * Shipping order No. 出荷指図ＮＯ.<p>
	 *
	 */
	public static final String $ship_inst_no = "ship_inst_no";
	/**
	 * I/V No. Ｉ／Ｖ ＮＯ.<p>
	 *
	 */
	public static final String $iv_no = "iv_no";
	/**
	 * Delivery note No. 納品書ＮＯ.<p>
	 *
	 */
	public static final String $dlv_slip_no = "dlv_slip_no";
	public static final String $ac_dt_p = "ac_dt_p";
	public static final String $can_ac_dt_p = "can_ac_dt_p";
	public static final String $ship_ymdhm_p = "ship_ymdhm_p";
	public static final String $dlv_ymdhm_p = "dlv_ymdhm_p";
	public static final String $ss_ymdhm_p = "ss_ymdhm_p";
	public static final String $ds_ymdhm_p = "ds_ymdhm_p";
	public static final String $inst_ymdhm_p = "inst_ymdhm_p";
	/**
	 * Receiving point identification type 送付先識別区分.<p>
	 *
	 */
	public static final String $ship_to_id_typ = "ship_to_id_typ";
	/**
	 * Receiving point identification type name 送付先識別区分名.<p>
	 *
	 */
	public static final String $ship_to_id_typ_nm = "ship_to_id_typ_nm";
	/**
	 * Receiving point identification cd. 送付先識別ＣＤ.<p>
	 *
	 */
	public static final String $ship_to_id_cd = "ship_to_id_cd";
	/**
	 * Receiving point Identification name 送付先識別名.<p>
	 *
	 */
	public static final String $ship_to_id_nm = "ship_to_id_nm";
	public static final String $ship_to_addr_p = "ship_to_addr_p";
	/**
	 * Miscellaneous receiving point 送付先諸口.<p>
	 *
	 */
	public static final String $ship_to_sundry_flg = "ship_to_sundry_flg";
	/**
	 * Receiving point stopover type 配送先経由区分.<p>
	 *
	 */
	public static final String $via_dlv_typ = "via_dlv_typ";
	/**
	 * Receiving point stopover name 配送先経由区分名.<p>
	 *
	 */
	public static final String $via_dlv_typ_nm = "via_dlv_typ_nm";
	/**
	 * Delivery destination identification type 納品先識別区分.<p>
	 *
	 */
	public static final String $dlv_id_typ = "dlv_id_typ";
	/**
	 * Delivery destination identification type name 納品先識別区分名.<p>
	 *
	 */
	public static final String $dlv_id_typ_nm = "dlv_id_typ_nm";
	/**
	 * Delivery destination identification cd. 納品先識別ＣＤ.<p>
	 *
	 */
	public static final String $dlv_id_cd = "dlv_id_cd";
	/**
	 * Delivery destination identification name 納品先識別名.<p>
	 *
	 */
	public static final String $dlv_id_nm = "dlv_id_nm";
	public static final String $dlv_addr_p = "dlv_addr_p";
	/**
	 * Miscellaneous delivery destination 納品先諸口.<p>
	 *
	 */
	public static final String $dlv_sundry_flg = "dlv_sundry_flg";
	/**
	 * Delivery destination price print 納品先価格印字.<p>
	 *
	 */
	public static final String $dlv_pri_prnt_flg = "dlv_pri_prnt_flg";
	/**
	 * For delivery destination rack/line 納品先棚・ライン対象.<p>
	 *
	 */
	public static final String $dlv_str_ln_tgt_flg = "dlv_str_ln_tgt_flg";
	/**
	 * Delivery destination cd. 納品先ＣＤ.<p>
	 *
	 */
	public static final String $dlv_cd = "dlv_cd";
	/**
	 * Delivery destination supplier cd. 納品先発注先ＣＤ.<p>
	 *
	 */
	public static final String $dlv_sppl_cd = "dlv_sppl_cd";
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
	 * Customer PIC cd. 得意先担当者ＣＤ.<p>
	 *
	 */
	public static final String $cst_usr_cd = "cst_usr_cd";
	/**
	 * Customer PIC name 得意先担当者名.<p>
	 *
	 */
	public static final String $cst_dpt_cd = "cst_dpt_cd";
	/**
	 * Customer invoice transaction 得意先インボイス取引.<p>
	 *
	 */
	public static final String $cst_iv_flg = "cst_iv_flg";
	public static final String $rqst_usr_dpt_p = "rqst_usr_dpt_p";
	public static final String $ship_usr_dpt_p = "ship_usr_dpt_p";
	/**
	 * Ignore lot check ロットチェック無視.<p>
	 *
	 */
	public static final String $lot_chk_off_flg = "lot_chk_off_flg";
	/**
	 * Shipping distribution group cd. 出荷物流グループＣＤ.<p>
	 *
	 */
	public static final String $ship_fr_lg_grp_cd = "ship_fr_lg_grp_cd";
	/**
	 * Shipping distribution group name 出荷物流グループ名.<p>
	 *
	 */
	public static final String $ship_fr_lg_grp_nm = "ship_fr_lg_grp_nm";
	/**
	 * Shipping conditions cd. 出荷条件ＣＤ.<p>
	 *
	 */
	public static final String $ship_term_cd = "ship_term_cd";
	/**
	 * Shipping conditions name 出荷条件名.<p>
	 *
	 */
	public static final String $ship_term_nm = "ship_term_nm";
	/**
	 * Weight 重量.<p>
	 *
	 */
	public static final String $ship_wt = "ship_wt";
	/**
	 * Volume 容積.<p>
	 *
	 */
	public static final String $ship_dim = "ship_dim";
	/**
	 * Delivery note issued (At order) 指図時納品書発行済.<p>
	 *
	 */
	public static final String $inst_dlv_prnted_flg = "inst_dlv_prnted_flg";
	/**
	 * Delivery note immediate issue 納品書即時発行.<p>
	 *
	 */
	public static final String $dlv_slip_prnt_flg = "dlv_slip_prnt_flg";
	/**
	 * Shipping guide?immediate issue 出荷案内書即時発行.<p>
	 *
	 */
	public static final String $ship_adv_prnt_flg = "ship_adv_prnt_flg";
	/**
	 * Delivery note issued 納品書発行済.<p>
	 *
	 */
	public static final String $dlv_slip_prnted_flg = "dlv_slip_prnted_flg";
	/**
	 * Shipping guide issued 出荷案内書発行済.<p>
	 *
	 */
	public static final String $ship_adv_prnted_flg = "ship_adv_prnted_flg";
	/**
	 * Unplanned 計画外.<p>
	 *
	 */
	public static final String $uplnd_flg = "uplnd_flg";
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
	 * Shipping result update counter 出荷実績更新カウンタ.<p>
	 *
	 */
	public static final String $ship_act_upd_cntr = "ship_act_upd_cntr";
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
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public static final String $ins_ts = "ins_ts";
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
	 * Issue delivery note 納品書発行.<p>
	 *
	 */
	public static final String $dlv_slip_prnt_btn_flg = "dlv_slip_prnt_btn_flg";
	/**
	 * Shipping guide issue 出荷案内書発行.<p>
	 *
	 */
	public static final String $ship_adv_prnt_btn_flg = "ship_adv_prnt_btn_flg";
	/**
	 * Report output locale cd. 帳票出力ロケールＣＤ.<p>
	 *
	 */
	public static final String $prnt_lcl_cd = "prnt_lcl_cd";
	public static final String $non_dlv_prnt_flg = "non_dlv_prnt_flg";
	public static final String $non_adv_prnt_flg = "non_adv_prnt_flg";

	public static final String $ac_dt = $ac_dt_p + ".ac_dt";
	public static final String $can_ac_dt_for_input = $can_ac_dt_p + ".can_ac_dt_for_input";
	public static final String $can_ac_dt = $can_ac_dt_p + ".can_ac_dt_for_call";
	public static final String $ac_dt_after_srch = $can_ac_dt_p + ".ac_dt_after_srch";
	public static final String $ship_dt = $ship_ymdhm_p + ".ymd";
	public static final String $ship_hm = $ship_ymdhm_p + ".hm";
	public static final String $dlv_dt = $dlv_ymdhm_p + ".ymd";
	public static final String $dlv_hm = $dlv_ymdhm_p + ".hm";
	public static final String $ship_schd_dt = $ss_ymdhm_p + ".ymd";
	public static final String $ship_schd_hm = $ss_ymdhm_p + ".hm";
	public static final String $dlv_schd_dt = $ds_ymdhm_p + ".ymd";
	public static final String $dlv_schd_hm = $ds_ymdhm_p + ".hm";
	public static final String $ship_inst_dt = $inst_ymdhm_p + ".ymd";
	public static final String $ship_inst_hm = $inst_ymdhm_p + ".hm";
	public static final String $ship_to_show_dtl = $ship_to_addr_p + ".show_dtl";
	public static final String $ship_to_lg_grp_cd = $ship_to_addr_p + ".lg_grp_cd";
	public static final String $ship_to_lg_grp_nm = $ship_to_addr_p + ".lg_grp_nm";
	public static final String $ship_to_cntry_cd = $ship_to_addr_p + ".cntry_cd";
	public static final String $ship_to_cntry_nm = $ship_to_addr_p + ".cntry_nm";
	public static final String $ship_to_zip_cd = $ship_to_addr_p + ".zip_cd";
	public static final String $ship_to_addr1 = $ship_to_addr_p + ".addr1";
	public static final String $ship_to_addr2 = $ship_to_addr_p + ".addr2";
	public static final String $ship_to_addr3 = $ship_to_addr_p + ".addr3";
	public static final String $ship_to_addr4 = $ship_to_addr_p + ".addr4";
	public static final String $ship_to_cntct_dpt = $ship_to_addr_p + ".cntct_dpt";
	public static final String $ship_to_cntct_psn = $ship_to_addr_p + ".cntct_psn";
	public static final String $ship_to_tel = $ship_to_addr_p + ".tel";
	public static final String $ship_to_fax = $ship_to_addr_p + ".fax";
	public static final String $dlv_show_dtl = $dlv_addr_p + ".show_dtl";
	public static final String $dlv_lg_grp_cd = $dlv_addr_p + ".lg_grp_cd";
	public static final String $dlv_lg_grp_nm = $dlv_addr_p + ".lg_grp_nm";
	public static final String $dlv_cntry_cd = $dlv_addr_p + ".cntry_cd";
	public static final String $dlv_cntry_nm = $dlv_addr_p + ".cntry_nm";
	public static final String $dlv_zip_cd = $dlv_addr_p + ".zip_cd";
	public static final String $dlv_addr1 = $dlv_addr_p + ".addr1";
	public static final String $dlv_addr2 = $dlv_addr_p + ".addr2";
	public static final String $dlv_addr3 = $dlv_addr_p + ".addr3";
	public static final String $dlv_addr4 = $dlv_addr_p + ".addr4";
	public static final String $dlv_cntct_dpt = $dlv_addr_p + ".cntct_dpt";
	public static final String $dlv_cntct_psn = $dlv_addr_p + ".cntct_psn";
	public static final String $dlv_tel = $dlv_addr_p + ".tel";
	public static final String $dlv_fax = $dlv_addr_p + ".fax";
	public static final String $rqst_usr_cd = $rqst_usr_dpt_p + ".usr_cd";
	public static final String $rqst_usr_nm = $rqst_usr_dpt_p + ".usr_nm";
	public static final String $rqst_dpt_cd = $rqst_usr_dpt_p + ".dpt_cd";
	public static final String $rqst_dpt_nm = $rqst_usr_dpt_p + ".dpt_nm";
	public static final String $ship_usr_cd = $ship_usr_dpt_p + ".usr_cd";
	public static final String $ship_usr_nm = $ship_usr_dpt_p + ".usr_nm";
	public static final String $ship_dpt_cd = $ship_usr_dpt_p + ".dpt_cd";
	public static final String $ship_dpt_nm = $ship_usr_dpt_p + ".dpt_nm";

	public static final MCMeta trd_cd_META = createCommonMeta($trd_cd, mcframe.commonMA.meta.MA_META.TRD_CD);
	public static final MCMeta trd_nm_META = createCommonMeta($trd_nm, mcframe.commonMA.meta.MA_META.TRD_NM);
	public static final MCMeta trd_ptn_typ_META = createCommonMeta($trd_ptn_typ, mcframe.commonMA.meta.MA_META.TRD_PTN_TYP);
	public static final MCMeta ac_ym_META = createCommonMeta($ac_ym, mcframe.commonMA.meta.MA_META.YM);
	public static final MCMeta ship_act_no_META = createCommonMeta($ship_act_no, mcframe.commonMA.meta.MA_META.SHIP_ACT_NO);
	public static final MCMeta ship_act_rev_META = createCommonMeta($ship_act_rev, mcframe.commonMA.meta.MA_META.SLIP_REV);
	public static final MCMeta latest_flg_META = createCommonMeta($latest_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta can_flg_META = createCommonMeta($can_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta ship_inst_no_META = createCommonMeta($ship_inst_no, mcframe.commonMA.meta.MA_META.SHIP_INST_NO);
	public static final MCMeta iv_no_META = createCommonMeta($iv_no, mcframe.commonMA.meta.MA_META.IV_NO);
	public static final MCMeta dlv_slip_no_META = createCommonMeta($dlv_slip_no, mcframe.commonMA.meta.MA_META.DLV_SLIP_NO);
	public static final MCMeta ac_dt_p_META = createInnerRowMeta($ac_dt_p, mcframe.clientMAUB.MAUBP0310.AcDtR.class);
	public static final MCMeta can_ac_dt_p_META = createInnerRowMeta($can_ac_dt_p, mcframe.clientMAUB.MAUBP0330.CanAcDtR.class);
	public static final MCMeta ship_ymdhm_p_META = createInnerRowMeta($ship_ymdhm_p, mcframe.clientMAUB.MAUBP0110.YmdHmR.class);
	public static final MCMeta dlv_ymdhm_p_META = createInnerRowMeta($dlv_ymdhm_p, mcframe.clientMAUB.MAUBP0110.YmdHmR.class);
	public static final MCMeta ss_ymdhm_p_META = createInnerRowMeta($ss_ymdhm_p, mcframe.clientMAUB.MAUBP0110.YmdHmR.class);
	public static final MCMeta ds_ymdhm_p_META = createInnerRowMeta($ds_ymdhm_p, mcframe.clientMAUB.MAUBP0110.YmdHmR.class);
	public static final MCMeta inst_ymdhm_p_META = createInnerRowMeta($inst_ymdhm_p, mcframe.clientMAUB.MAUBP0110.YmdHmR.class);
	public static final MCMeta ship_to_id_typ_META = createCommonMeta($ship_to_id_typ, mcframe.commonMS.meta.MS_META.SHIP_TO_ID_TYP);
	public static final MCMeta ship_to_id_typ_nm_META = createCommonMeta($ship_to_id_typ_nm, mcframe.commonMS.meta.MS_META.SHIP_TO_ID_TYP_NM);
	public static final MCMeta ship_to_id_cd_META = createCommonMeta($ship_to_id_cd, mcframe.commonMS.meta.MS_META.SHIP_TO_ID_CD);
	public static final MCMeta ship_to_id_nm_META = createCommonMeta($ship_to_id_nm, mcframe.commonMS.meta.MS_META.SHIP_TO_ID_NM);
	public static final MCMeta ship_to_addr_p_META = createInnerRowMeta($ship_to_addr_p, mcframe.clientMAUB.MAUBP0410.AddrR.class);
	public static final MCMeta ship_to_sundry_flg_META = createCommonMeta($ship_to_sundry_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta via_dlv_typ_META = createCommonMeta($via_dlv_typ, mcframe.commonMA.meta.MA_META.VIA_DLV_TYP);
	public static final MCMeta via_dlv_typ_nm_META = createCommonMeta($via_dlv_typ_nm, mcframe.commonMA.meta.MA_META.VIA_DLV_TYP_NM);
	public static final MCMeta dlv_id_typ_META = createCommonMeta($dlv_id_typ, mcframe.commonMS.meta.MS_META.DLV_ID_TYP);
	public static final MCMeta dlv_id_typ_nm_META = createCommonMeta($dlv_id_typ_nm, mcframe.commonMS.meta.MS_META.DLV_ID_TYP_NM);
	public static final MCMeta dlv_id_cd_META = createCommonMeta($dlv_id_cd, mcframe.commonMS.meta.MS_META.DLV_ID_CD);
	public static final MCMeta dlv_id_nm_META = createCommonMeta($dlv_id_nm, mcframe.commonMS.meta.MS_META.DLV_ID_NM);
	public static final MCMeta dlv_addr_p_META = createInnerRowMeta($dlv_addr_p, mcframe.clientMAUB.MAUBP0410.AddrR.class);
	public static final MCMeta dlv_sundry_flg_META = createCommonMeta($dlv_sundry_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta dlv_pri_prnt_flg_META = createCommonMeta($dlv_pri_prnt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta dlv_str_ln_tgt_flg_META = createCommonMeta($dlv_str_ln_tgt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta dlv_cd_META = createCommonMeta($dlv_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta dlv_sppl_cd_META = createCommonMeta($dlv_sppl_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta cst_cd_META = createCommonMeta($cst_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta cst_nm_META = createCommonMeta($cst_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta cst_usr_cd_META = createCommonMeta($cst_usr_cd, mcframe.commonMA.meta.MA_META.USR_CD);
	public static final MCMeta cst_dpt_cd_META = createCommonMeta($cst_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta cst_iv_flg_META = createCommonMeta($cst_iv_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta rqst_usr_dpt_p_META = createInnerRowMeta($rqst_usr_dpt_p, mcframe.clientMAUB.MAUBP0320.UsrDptR.class);
	public static final MCMeta ship_usr_dpt_p_META = createInnerRowMeta($ship_usr_dpt_p, mcframe.clientMAUB.MAUBP0320.UsrDptR.class);
	public static final MCMeta lot_chk_off_flg_META = createCommonMeta($lot_chk_off_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta ship_fr_lg_grp_cd_META = createCommonMeta($ship_fr_lg_grp_cd, mcframe.commonMA.meta.MA_META.LG_GRP_CD);
	public static final MCMeta ship_fr_lg_grp_nm_META = createCommonMeta($ship_fr_lg_grp_nm, mcframe.commonMA.meta.MA_META.LG_GRP_NM);
	public static final MCMeta ship_term_cd_META = createCommonMeta($ship_term_cd, mcframe.commonMA.meta.MA_META.SHIP_TERM_CD);
	public static final MCMeta ship_term_nm_META = createCommonMeta($ship_term_nm, mcframe.commonMA.meta.MA_META.SHIP_TERM_NM);
	public static final MCMeta ship_wt_META = createCommonMeta($ship_wt, mcframe.commonMA.meta.MA_META.WT);
	public static final MCMeta ship_dim_META = createCommonMeta($ship_dim, mcframe.commonMA.meta.MA_META.DIM);
	public static final MCMeta inst_dlv_prnted_flg_META = createCommonMeta($inst_dlv_prnted_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta dlv_slip_prnt_flg_META = createCommonMeta($dlv_slip_prnt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta ship_adv_prnt_flg_META = createCommonMeta($ship_adv_prnt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta dlv_slip_prnted_flg_META = createCommonMeta($dlv_slip_prnted_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta ship_adv_prnted_flg_META = createCommonMeta($ship_adv_prnted_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta uplnd_flg_META = createCommonMeta($uplnd_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta intr_rmrks_META = createCommonMeta($intr_rmrks, mcframe.commonMS.meta.MS_META.SHIP_ACT_INTR_RMRKS);
	public static final MCMeta sub_char1_META = createCommonMeta($sub_char1, mcframe.commonMS.meta.MS_META.SHIP_ACT_SUB_CHAR1);
	public static final MCMeta sub_char2_META = createCommonMeta($sub_char2, mcframe.commonMS.meta.MS_META.SHIP_ACT_SUB_CHAR2);
	public static final MCMeta sub_char3_META = createCommonMeta($sub_char3, mcframe.commonMS.meta.MS_META.SHIP_ACT_SUB_CHAR3);
	public static final MCMeta ship_act_upd_cntr_META = createCommonMeta($ship_act_upd_cntr, mcframe.commonMA.meta.MA_META.UPD_CNT);
	public static final MCMeta ins_usr_id_META = createCommonMeta($ins_usr_id, mcframe.commonMA.meta.MA_META.FCM_USR_ID);
	public static final MCMeta ins_usr_nm_META = createCommonMeta($ins_usr_nm, mcframe.commonMA.meta.MA_META.FCM_USR_NM);
	public static final MCMeta ins_func_id_META = createCommonMeta($ins_func_id, mcframe.commonMA.meta.MA_META.FUNC_ID);
	public static final MCMeta ins_func_nm_META = createCommonMeta($ins_func_nm, mcframe.commonMA.meta.MA_META.FUNC_NM);
	public static final MCMeta upd_usr_id_META = createCommonMeta($upd_usr_id, mcframe.commonMA.meta.MA_META.FCM_USR_ID);
	public static final MCMeta upd_usr_nm_META = createCommonMeta($upd_usr_nm, mcframe.commonMA.meta.MA_META.FCM_USR_NM);
	public static final MCMeta upd_func_id_META = createCommonMeta($upd_func_id, mcframe.commonMA.meta.MA_META.FUNC_ID);
	public static final MCMeta upd_func_nm_META = createCommonMeta($upd_func_nm, mcframe.commonMA.meta.MA_META.FUNC_NM);
	public static final MCMeta ins_ts_META = createCommonMeta($ins_ts, mcframe.commonMA.meta.MA_META.SYS_TS);
	public static final MCMeta upd_ts_META = createCommonMeta($upd_ts, mcframe.commonMA.meta.MA_META.SYS_TS);
	public static final MCMeta upd_srv_req_no_META = createCommonMeta($upd_srv_req_no, mcframe.commonMA.meta.MA_META.SRV_REQ_NO);
	public static final MCMeta dlv_slip_prnt_btn_flg_META = createCommonMeta($dlv_slip_prnt_btn_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta ship_adv_prnt_btn_flg_META = createCommonMeta($ship_adv_prnt_btn_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta prnt_lcl_cd_META = createCommonMeta($prnt_lcl_cd, mcframe.commonMA.meta.MA_META.LCL_CD);
	public static final MCMeta non_dlv_prnt_flg_META = createCommonMeta($non_dlv_prnt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta non_adv_prnt_flg_META = createCommonMeta($non_adv_prnt_flg, mcframe.commonMA.meta.MA_META.FLG);

	protected static final ConstMetaList<HdrR> constMetas = new ConstMetaList<HdrR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			trd_cd_META,
			trd_nm_META,
			trd_ptn_typ_META,
			ac_ym_META,
			ship_act_no_META,
			ship_act_rev_META,
			latest_flg_META,
			can_flg_META,
			ship_inst_no_META,
			iv_no_META,
			dlv_slip_no_META,
			ac_dt_p_META,
			can_ac_dt_p_META,
			ship_ymdhm_p_META,
			dlv_ymdhm_p_META,
			ss_ymdhm_p_META,
			ds_ymdhm_p_META,
			inst_ymdhm_p_META,
			ship_to_id_typ_META,
			ship_to_id_typ_nm_META,
			ship_to_id_cd_META,
			ship_to_id_nm_META,
			ship_to_addr_p_META,
			ship_to_sundry_flg_META,
			via_dlv_typ_META,
			via_dlv_typ_nm_META,
			dlv_id_typ_META,
			dlv_id_typ_nm_META,
			dlv_id_cd_META,
			dlv_id_nm_META,
			dlv_addr_p_META,
			dlv_sundry_flg_META,
			dlv_pri_prnt_flg_META,
			dlv_str_ln_tgt_flg_META,
			dlv_cd_META,
			dlv_sppl_cd_META,
			cst_cd_META,
			cst_nm_META,
			cst_usr_cd_META,
			cst_dpt_cd_META,
			cst_iv_flg_META,
			rqst_usr_dpt_p_META,
			ship_usr_dpt_p_META,
			lot_chk_off_flg_META,
			ship_fr_lg_grp_cd_META,
			ship_fr_lg_grp_nm_META,
			ship_term_cd_META,
			ship_term_nm_META,
			ship_wt_META,
			ship_dim_META,
			inst_dlv_prnted_flg_META,
			dlv_slip_prnt_flg_META,
			ship_adv_prnt_flg_META,
			dlv_slip_prnted_flg_META,
			ship_adv_prnted_flg_META,
			uplnd_flg_META,
			intr_rmrks_META,
			sub_char1_META,
			sub_char2_META,
			sub_char3_META,
			ship_act_upd_cntr_META,
			ins_usr_id_META,
			ins_usr_nm_META,
			ins_func_id_META,
			ins_func_nm_META,
			upd_usr_id_META,
			upd_usr_nm_META,
			upd_func_id_META,
			upd_func_nm_META,
			ins_ts_META,
			upd_ts_META,
			upd_srv_req_no_META,
			dlv_slip_prnt_btn_flg_META,
			ship_adv_prnt_btn_flg_META,
			prnt_lcl_cd_META,
			non_dlv_prnt_flg_META,
			non_adv_prnt_flg_META
		},
		new String[][]{
			{
				"ac_dt",
				"can_ac_dt_for_input",
				"can_ac_dt",
				"ac_dt_after_srch",
				"ship_dt",
				"ship_hm",
				"dlv_dt",
				"dlv_hm",
				"ship_schd_dt",
				"ship_schd_hm",
				"dlv_schd_dt",
				"dlv_schd_hm",
				"ship_inst_dt",
				"ship_inst_hm",
				"ship_to_lg_grp_cd",
				"ship_to_lg_grp_nm",
				"ship_to_cntry_cd",
				"ship_to_cntry_nm",
				"ship_to_zip_cd",
				"ship_to_addr1",
				"ship_to_addr2",
				"ship_to_addr3",
				"ship_to_addr4",
				"ship_to_cntct_dpt",
				"ship_to_cntct_psn",
				"ship_to_tel",
				"ship_to_fax",
				"dlv_lg_grp_cd",
				"dlv_lg_grp_nm",
				"dlv_cntry_cd",
				"dlv_cntry_nm",
				"dlv_zip_cd",
				"dlv_addr1",
				"dlv_addr2",
				"dlv_addr3",
				"dlv_addr4",
				"dlv_cntct_dpt",
				"dlv_cntct_psn",
				"dlv_tel",
				"dlv_fax",
				"rqst_usr_cd",
				"rqst_usr_nm",
				"rqst_dpt_cd",
				"rqst_dpt_nm",
				"ship_usr_cd",
				"ship_usr_nm",
				"ship_dpt_cd",
				"ship_dpt_nm"
			},
			{
				$ac_dt,
				$can_ac_dt_for_input,
				$can_ac_dt,
				$ac_dt_after_srch,
				$ship_dt,
				$ship_hm,
				$dlv_dt,
				$dlv_hm,
				$ship_schd_dt,
				$ship_schd_hm,
				$dlv_schd_dt,
				$dlv_schd_hm,
				$ship_inst_dt,
				$ship_inst_hm,
				$ship_to_lg_grp_cd,
				$ship_to_lg_grp_nm,
				$ship_to_cntry_cd,
				$ship_to_cntry_nm,
				$ship_to_zip_cd,
				$ship_to_addr1,
				$ship_to_addr2,
				$ship_to_addr3,
				$ship_to_addr4,
				$ship_to_cntct_dpt,
				$ship_to_cntct_psn,
				$ship_to_tel,
				$ship_to_fax,
				$dlv_lg_grp_cd,
				$dlv_lg_grp_nm,
				$dlv_cntry_cd,
				$dlv_cntry_nm,
				$dlv_zip_cd,
				$dlv_addr1,
				$dlv_addr2,
				$dlv_addr3,
				$dlv_addr4,
				$dlv_cntct_dpt,
				$dlv_cntct_psn,
				$dlv_tel,
				$dlv_fax,
				$rqst_usr_cd,
				$rqst_usr_nm,
				$rqst_dpt_cd,
				$rqst_dpt_nm,
				$ship_usr_cd,
				$ship_usr_nm,
				$ship_dpt_cd,
				$ship_dpt_nm
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
				{$ship_to_id_cd, "ship_to_id_nm;lg_grp_cd;lg_grp_nm;zip_cd;addr1;addr2;addr3;addr4;ship_to_cntct_dpt;ship_to_cntct_psn;tel;fax;ship_to_sundry_flg;lg_grp_cd;lg_grp_nm;cntry_cd;cntry_nm;via_dlv_typ"},	// ship_to_id_cd
				{$dlv_id_cd, "dlv_id_nm;str_ln_tgt_flg;zip_cd;addr1;addr2;addr3;addr4;dlv_cntct_dpt;dlv_cntct_psn;tel;fax;dlv_sundry_flg;sppl_cd;pri_prnt_flg;cntry_cd;cntry_nm;prnt_lcl_cd"},	// dlv_id_cd
				{$dlv_cd, "def_cst_cd"},	// dlv_cd
				{$cst_cd, "bp_nm;cst_usr_cd;cst_dpt_cd;cst_iv_flg"},	// cst_cd
				{$rqst_usr_dpt_p + ".dpt_cd", "dpt_nm"},	// rqst_usr_dpt_p.dpt_cd
				{$ship_usr_dpt_p + ".dpt_cd", "dpt_nm"},	// ship_usr_dpt_p.dpt_cd
				{$ship_fr_lg_grp_cd, "lg_grp_nm;ship_slip_act_flg;ship_slip_act_flg"}	// ship_fr_lg_grp_cd
			}
		)),
		new MCExtMap.Entry($$LIST_IN, new MCExtList(
			new String[][]{
				{$ship_to_id_cd, "ship_to_id_typ;ship_dt"},	// ship_to_id_cd
				{$dlv_id_cd, "dlv_id_typ;ship_dt"},	// dlv_id_cd
				{$dlv_cd, "MAC_BP_IS_SRCH_TYP.DLV;ship_dt"},	// dlv_cd
				{$cst_cd, "MAC_BP_IS_SRCH_TYP.CST_NOT_SUNDRY;ship_dt"},	// cst_cd
				{$rqst_usr_dpt_p + ".dpt_cd", "rqst_usr_cd;ac_dt;MAC_DPT_IS_SRCH_TYP.SCE"},	// rqst_usr_dpt_p.dpt_cd
				{$ship_usr_dpt_p + ".dpt_cd", "ship_usr_cd;ship_dt;MAC_DPT_IS_SRCH_TYP.SHIP"},	// ship_usr_dpt_p.dpt_cd
				{$ship_fr_lg_grp_cd, "true;true"}	// ship_fr_lg_grp_cd
			}
		)),
		new MCExtMap.Entry($$LIST_IN_BASE, new MCExtList(
			new String[][]{
				{$ship_to_id_cd, "ship_to_id_typ;base_dt"},	// ship_to_id_cd
				{$dlv_id_cd, "dlv_id_typ;base_dt"},	// dlv_id_cd
				{$dlv_cd, "bp_is_srch_typ;dt"},	// dlv_cd
				{$cst_cd, "bp_is_srch_typ;dt"},	// cst_cd
				{$rqst_usr_dpt_p + ".dpt_cd", "usr_cd;dt;dpt_is_srch_typ"},	// rqst_usr_dpt_p.dpt_cd
				{$ship_usr_dpt_p + ".dpt_cd", "usr_cd;dt;dpt_is_srch_typ"},	// ship_usr_dpt_p.dpt_cd
				{$ship_fr_lg_grp_cd, "rd_flg;wr_flg"}	// ship_fr_lg_grp_cd
			}
		)),
		new MCExtMap.Entry($$DISP_CTL, new MCExtList(
			new String[][]{
				{$dlv_str_ln_tgt_flg, "STR_LN"},	// dlv_str_ln_tgt_flg
				{$ship_fr_lg_grp_cd, "LG_GRP"},	// ship_fr_lg_grp_cd
				{$ship_fr_lg_grp_nm, "LG_GRP"}	// ship_fr_lg_grp_nm
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
	protected HdrR_MC_A(ConstMetaList<? extends HdrR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public HdrR clone() {
		return (HdrR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public HdrR createInstance() {
		return (HdrR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public HdrR getValues(String... names) {
		return (HdrR) super.getValues(names);
	}



	/**
	 * Transaction cd. 取引ＣＤ.<p>
	 *
	 */
	public String trd_cd() {
		return getConstString(offset + 0, $trd_cd);
	}

	/**
	 * Transaction cd. 取引ＣＤ.<p>
	 *
	 */
	public void trd_cd(String value) {
		setConstString(offset + 0, $trd_cd, value);
	}


	/**
	 * Transaction name 取引名.<p>
	 *
	 */
	public String trd_nm() {
		return getConstString(offset + 1, $trd_nm);
	}

	/**
	 * Transaction name 取引名.<p>
	 *
	 */
	public void trd_nm(String value) {
		setConstString(offset + 1, $trd_nm, value);
	}


	/**
	 * Transaction pattern type 取引パタン区分.<p>
	 *
	 */
	public String trd_ptn_typ() {
		return getConstString(offset + 2, $trd_ptn_typ);
	}

	/**
	 * Transaction pattern type 取引パタン区分.<p>
	 *
	 */
	public void trd_ptn_typ(String value) {
		setConstString(offset + 2, $trd_ptn_typ, value);
	}


	/**
	 * Recording month 計上年月.<p>
	 *
	 */
	public MCDate ac_ym() {
		return getConstDate(offset + 3, $ac_ym);
	}

	/**
	 * Recording month 計上年月.<p>
	 *
	 */
	public void ac_ym(MCDate value) {
		setConstDate(offset + 3, $ac_ym, value);
	}


	/**
	 * Shipping result No. 出荷実績ＮＯ.<p>
	 *
	 */
	public String ship_act_no() {
		return getConstString(offset + 4, $ship_act_no);
	}

	/**
	 * Shipping result No. 出荷実績ＮＯ.<p>
	 *
	 */
	public void ship_act_no(String value) {
		setConstString(offset + 4, $ship_act_no, value);
	}


	/**
	 * Shipping result No. rev. number 出荷実績ＮＯ改訂番号.<p>
	 *
	 */
	public MCNumber ship_act_rev() {
		return getConstNumber(offset + 5, $ship_act_rev);
	}

	/**
	 * Shipping result No. rev. number 出荷実績ＮＯ改訂番号.<p>
	 *
	 */
	public void ship_act_rev(MCNumber value) {
		setConstNumber(offset + 5, $ship_act_rev, value);
	}

	/**
	 * Shipping result No. rev. number 出荷実績ＮＯ改訂番号.<p>
	 *
	 */
	public void ship_act_rev(int value) {
		setConstNumber(offset + 5, $ship_act_rev, value);
	}

	/**
	 * Shipping result No. rev. number 出荷実績ＮＯ改訂番号.<p>
	 *
	 */
	public void ship_act_rev(long value) {
		setConstNumber(offset + 5, $ship_act_rev, value);
	}

	/**
	 * Shipping result No. rev. number 出荷実績ＮＯ改訂番号.<p>
	 *
	 */
	public void ship_act_rev(float value) {
		setConstNumber(offset + 5, $ship_act_rev, value);
	}

	/**
	 * Shipping result No. rev. number 出荷実績ＮＯ改訂番号.<p>
	 *
	 */
	public void ship_act_rev(double value) {
		setConstNumber(offset + 5, $ship_act_rev, value);
	}


	/**
	 * Latest 最新.<p>
	 *
	 */
	public boolean latest_flg() {
		return getConstBoolean(offset + 6, $latest_flg);
	}

	/**
	 * Latest 最新.<p>
	 *
	 */
	public void latest_flg(boolean value) {
		setConstBoolean(offset + 6, $latest_flg, value);
	}


	/**
	 * Cancel 取消.<p>
	 *
	 */
	public boolean can_flg() {
		return getConstBoolean(offset + 7, $can_flg);
	}

	/**
	 * Cancel 取消.<p>
	 *
	 */
	public void can_flg(boolean value) {
		setConstBoolean(offset + 7, $can_flg, value);
	}


	/**
	 * Shipping order No. 出荷指図ＮＯ.<p>
	 *
	 */
	public String ship_inst_no() {
		return getConstString(offset + 8, $ship_inst_no);
	}

	/**
	 * Shipping order No. 出荷指図ＮＯ.<p>
	 *
	 */
	public void ship_inst_no(String value) {
		setConstString(offset + 8, $ship_inst_no, value);
	}


	/**
	 * I/V No. Ｉ／Ｖ ＮＯ.<p>
	 *
	 */
	public String iv_no() {
		return getConstString(offset + 9, $iv_no);
	}

	/**
	 * I/V No. Ｉ／Ｖ ＮＯ.<p>
	 *
	 */
	public void iv_no(String value) {
		setConstString(offset + 9, $iv_no, value);
	}


	/**
	 * Delivery note No. 納品書ＮＯ.<p>
	 *
	 */
	public String dlv_slip_no() {
		return getConstString(offset + 10, $dlv_slip_no);
	}

	/**
	 * Delivery note No. 納品書ＮＯ.<p>
	 *
	 */
	public void dlv_slip_no(String value) {
		setConstString(offset + 10, $dlv_slip_no, value);
	}


	public mcframe.clientMAUB.MAUBP0310.AcDtR ac_dt_p(){
		return (mcframe.clientMAUB.MAUBP0310.AcDtR) getConstInnerRow(offset + 11, $ac_dt_p);
	}
	
	public void ac_dt_p(mcframe.clientMAUB.MAUBP0310.AcDtR row){
		setConstInnerRow(offset + 11, $ac_dt_p, row);
	}


	public mcframe.clientMAUB.MAUBP0330.CanAcDtR can_ac_dt_p(){
		return (mcframe.clientMAUB.MAUBP0330.CanAcDtR) getConstInnerRow(offset + 12, $can_ac_dt_p);
	}
	
	public void can_ac_dt_p(mcframe.clientMAUB.MAUBP0330.CanAcDtR row){
		setConstInnerRow(offset + 12, $can_ac_dt_p, row);
	}


	public mcframe.clientMAUB.MAUBP0110.YmdHmR ship_ymdhm_p(){
		return (mcframe.clientMAUB.MAUBP0110.YmdHmR) getConstInnerRow(offset + 13, $ship_ymdhm_p);
	}
	
	public void ship_ymdhm_p(mcframe.clientMAUB.MAUBP0110.YmdHmR row){
		setConstInnerRow(offset + 13, $ship_ymdhm_p, row);
	}


	public mcframe.clientMAUB.MAUBP0110.YmdHmR dlv_ymdhm_p(){
		return (mcframe.clientMAUB.MAUBP0110.YmdHmR) getConstInnerRow(offset + 14, $dlv_ymdhm_p);
	}
	
	public void dlv_ymdhm_p(mcframe.clientMAUB.MAUBP0110.YmdHmR row){
		setConstInnerRow(offset + 14, $dlv_ymdhm_p, row);
	}


	public mcframe.clientMAUB.MAUBP0110.YmdHmR ss_ymdhm_p(){
		return (mcframe.clientMAUB.MAUBP0110.YmdHmR) getConstInnerRow(offset + 15, $ss_ymdhm_p);
	}
	
	public void ss_ymdhm_p(mcframe.clientMAUB.MAUBP0110.YmdHmR row){
		setConstInnerRow(offset + 15, $ss_ymdhm_p, row);
	}


	public mcframe.clientMAUB.MAUBP0110.YmdHmR ds_ymdhm_p(){
		return (mcframe.clientMAUB.MAUBP0110.YmdHmR) getConstInnerRow(offset + 16, $ds_ymdhm_p);
	}
	
	public void ds_ymdhm_p(mcframe.clientMAUB.MAUBP0110.YmdHmR row){
		setConstInnerRow(offset + 16, $ds_ymdhm_p, row);
	}


	public mcframe.clientMAUB.MAUBP0110.YmdHmR inst_ymdhm_p(){
		return (mcframe.clientMAUB.MAUBP0110.YmdHmR) getConstInnerRow(offset + 17, $inst_ymdhm_p);
	}
	
	public void inst_ymdhm_p(mcframe.clientMAUB.MAUBP0110.YmdHmR row){
		setConstInnerRow(offset + 17, $inst_ymdhm_p, row);
	}


	/**
	 * Receiving point identification type 送付先識別区分.<p>
	 *
	 */
	public String ship_to_id_typ() {
		return getConstString(offset + 18, $ship_to_id_typ);
	}

	/**
	 * Receiving point identification type 送付先識別区分.<p>
	 *
	 */
	public void ship_to_id_typ(String value) {
		setConstString(offset + 18, $ship_to_id_typ, value);
	}


	/**
	 * Receiving point identification type name 送付先識別区分名.<p>
	 *
	 */
	public String ship_to_id_typ_nm() {
		return getConstString(offset + 19, $ship_to_id_typ_nm);
	}

	/**
	 * Receiving point identification type name 送付先識別区分名.<p>
	 *
	 */
	public void ship_to_id_typ_nm(String value) {
		setConstString(offset + 19, $ship_to_id_typ_nm, value);
	}


	/**
	 * Receiving point identification cd. 送付先識別ＣＤ.<p>
	 *
	 */
	public String ship_to_id_cd() {
		return getConstString(offset + 20, $ship_to_id_cd);
	}

	/**
	 * Receiving point identification cd. 送付先識別ＣＤ.<p>
	 *
	 */
	public void ship_to_id_cd(String value) {
		setConstString(offset + 20, $ship_to_id_cd, value);
	}


	/**
	 * Receiving point Identification name 送付先識別名.<p>
	 *
	 */
	public String ship_to_id_nm() {
		return getConstString(offset + 21, $ship_to_id_nm);
	}

	/**
	 * Receiving point Identification name 送付先識別名.<p>
	 *
	 */
	public void ship_to_id_nm(String value) {
		setConstString(offset + 21, $ship_to_id_nm, value);
	}


	public mcframe.clientMAUB.MAUBP0410.AddrR ship_to_addr_p(){
		return (mcframe.clientMAUB.MAUBP0410.AddrR) getConstInnerRow(offset + 22, $ship_to_addr_p);
	}
	
	public void ship_to_addr_p(mcframe.clientMAUB.MAUBP0410.AddrR row){
		setConstInnerRow(offset + 22, $ship_to_addr_p, row);
	}


	/**
	 * Miscellaneous receiving point 送付先諸口.<p>
	 *
	 */
	public boolean ship_to_sundry_flg() {
		return getConstBoolean(offset + 23, $ship_to_sundry_flg);
	}

	/**
	 * Miscellaneous receiving point 送付先諸口.<p>
	 *
	 */
	public void ship_to_sundry_flg(boolean value) {
		setConstBoolean(offset + 23, $ship_to_sundry_flg, value);
	}


	/**
	 * Receiving point stopover type 配送先経由区分.<p>
	 *
	 */
	public String via_dlv_typ() {
		return getConstString(offset + 24, $via_dlv_typ);
	}

	/**
	 * Receiving point stopover type 配送先経由区分.<p>
	 *
	 */
	public void via_dlv_typ(String value) {
		setConstString(offset + 24, $via_dlv_typ, value);
	}


	/**
	 * Receiving point stopover name 配送先経由区分名.<p>
	 *
	 */
	public String via_dlv_typ_nm() {
		return getConstString(offset + 25, $via_dlv_typ_nm);
	}

	/**
	 * Receiving point stopover name 配送先経由区分名.<p>
	 *
	 */
	public void via_dlv_typ_nm(String value) {
		setConstString(offset + 25, $via_dlv_typ_nm, value);
	}


	/**
	 * Delivery destination identification type 納品先識別区分.<p>
	 *
	 */
	public String dlv_id_typ() {
		return getConstString(offset + 26, $dlv_id_typ);
	}

	/**
	 * Delivery destination identification type 納品先識別区分.<p>
	 *
	 */
	public void dlv_id_typ(String value) {
		setConstString(offset + 26, $dlv_id_typ, value);
	}


	/**
	 * Delivery destination identification type name 納品先識別区分名.<p>
	 *
	 */
	public String dlv_id_typ_nm() {
		return getConstString(offset + 27, $dlv_id_typ_nm);
	}

	/**
	 * Delivery destination identification type name 納品先識別区分名.<p>
	 *
	 */
	public void dlv_id_typ_nm(String value) {
		setConstString(offset + 27, $dlv_id_typ_nm, value);
	}


	/**
	 * Delivery destination identification cd. 納品先識別ＣＤ.<p>
	 *
	 */
	public String dlv_id_cd() {
		return getConstString(offset + 28, $dlv_id_cd);
	}

	/**
	 * Delivery destination identification cd. 納品先識別ＣＤ.<p>
	 *
	 */
	public void dlv_id_cd(String value) {
		setConstString(offset + 28, $dlv_id_cd, value);
	}


	/**
	 * Delivery destination identification name 納品先識別名.<p>
	 *
	 */
	public String dlv_id_nm() {
		return getConstString(offset + 29, $dlv_id_nm);
	}

	/**
	 * Delivery destination identification name 納品先識別名.<p>
	 *
	 */
	public void dlv_id_nm(String value) {
		setConstString(offset + 29, $dlv_id_nm, value);
	}


	public mcframe.clientMAUB.MAUBP0410.AddrR dlv_addr_p(){
		return (mcframe.clientMAUB.MAUBP0410.AddrR) getConstInnerRow(offset + 30, $dlv_addr_p);
	}
	
	public void dlv_addr_p(mcframe.clientMAUB.MAUBP0410.AddrR row){
		setConstInnerRow(offset + 30, $dlv_addr_p, row);
	}


	/**
	 * Miscellaneous delivery destination 納品先諸口.<p>
	 *
	 */
	public boolean dlv_sundry_flg() {
		return getConstBoolean(offset + 31, $dlv_sundry_flg);
	}

	/**
	 * Miscellaneous delivery destination 納品先諸口.<p>
	 *
	 */
	public void dlv_sundry_flg(boolean value) {
		setConstBoolean(offset + 31, $dlv_sundry_flg, value);
	}


	/**
	 * Delivery destination price print 納品先価格印字.<p>
	 *
	 */
	public boolean dlv_pri_prnt_flg() {
		return getConstBoolean(offset + 32, $dlv_pri_prnt_flg);
	}

	/**
	 * Delivery destination price print 納品先価格印字.<p>
	 *
	 */
	public void dlv_pri_prnt_flg(boolean value) {
		setConstBoolean(offset + 32, $dlv_pri_prnt_flg, value);
	}


	/**
	 * For delivery destination rack/line 納品先棚・ライン対象.<p>
	 *
	 */
	public boolean dlv_str_ln_tgt_flg() {
		return getConstBoolean(offset + 33, $dlv_str_ln_tgt_flg);
	}

	/**
	 * For delivery destination rack/line 納品先棚・ライン対象.<p>
	 *
	 */
	public void dlv_str_ln_tgt_flg(boolean value) {
		setConstBoolean(offset + 33, $dlv_str_ln_tgt_flg, value);
	}


	/**
	 * Delivery destination cd. 納品先ＣＤ.<p>
	 *
	 */
	public String dlv_cd() {
		return getConstString(offset + 34, $dlv_cd);
	}

	/**
	 * Delivery destination cd. 納品先ＣＤ.<p>
	 *
	 */
	public void dlv_cd(String value) {
		setConstString(offset + 34, $dlv_cd, value);
	}


	/**
	 * Delivery destination supplier cd. 納品先発注先ＣＤ.<p>
	 *
	 */
	public String dlv_sppl_cd() {
		return getConstString(offset + 35, $dlv_sppl_cd);
	}

	/**
	 * Delivery destination supplier cd. 納品先発注先ＣＤ.<p>
	 *
	 */
	public void dlv_sppl_cd(String value) {
		setConstString(offset + 35, $dlv_sppl_cd, value);
	}


	/**
	 * Customer cd. 得意先ＣＤ.<p>
	 *
	 */
	public String cst_cd() {
		return getConstString(offset + 36, $cst_cd);
	}

	/**
	 * Customer cd. 得意先ＣＤ.<p>
	 *
	 */
	public void cst_cd(String value) {
		setConstString(offset + 36, $cst_cd, value);
	}


	/**
	 * Customer name 得意先名.<p>
	 *
	 */
	public String cst_nm() {
		return getConstString(offset + 37, $cst_nm);
	}

	/**
	 * Customer name 得意先名.<p>
	 *
	 */
	public void cst_nm(String value) {
		setConstString(offset + 37, $cst_nm, value);
	}


	/**
	 * Customer PIC cd. 得意先担当者ＣＤ.<p>
	 *
	 */
	public String cst_usr_cd() {
		return getConstString(offset + 38, $cst_usr_cd);
	}

	/**
	 * Customer PIC cd. 得意先担当者ＣＤ.<p>
	 *
	 */
	public void cst_usr_cd(String value) {
		setConstString(offset + 38, $cst_usr_cd, value);
	}


	/**
	 * Customer PIC name 得意先担当者名.<p>
	 *
	 */
	public String cst_dpt_cd() {
		return getConstString(offset + 39, $cst_dpt_cd);
	}

	/**
	 * Customer PIC name 得意先担当者名.<p>
	 *
	 */
	public void cst_dpt_cd(String value) {
		setConstString(offset + 39, $cst_dpt_cd, value);
	}


	/**
	 * Customer invoice transaction 得意先インボイス取引.<p>
	 *
	 */
	public boolean cst_iv_flg() {
		return getConstBoolean(offset + 40, $cst_iv_flg);
	}

	/**
	 * Customer invoice transaction 得意先インボイス取引.<p>
	 *
	 */
	public void cst_iv_flg(boolean value) {
		setConstBoolean(offset + 40, $cst_iv_flg, value);
	}


	public mcframe.clientMAUB.MAUBP0320.UsrDptR rqst_usr_dpt_p(){
		return (mcframe.clientMAUB.MAUBP0320.UsrDptR) getConstInnerRow(offset + 41, $rqst_usr_dpt_p);
	}
	
	public void rqst_usr_dpt_p(mcframe.clientMAUB.MAUBP0320.UsrDptR row){
		setConstInnerRow(offset + 41, $rqst_usr_dpt_p, row);
	}


	public mcframe.clientMAUB.MAUBP0320.UsrDptR ship_usr_dpt_p(){
		return (mcframe.clientMAUB.MAUBP0320.UsrDptR) getConstInnerRow(offset + 42, $ship_usr_dpt_p);
	}
	
	public void ship_usr_dpt_p(mcframe.clientMAUB.MAUBP0320.UsrDptR row){
		setConstInnerRow(offset + 42, $ship_usr_dpt_p, row);
	}


	/**
	 * Ignore lot check ロットチェック無視.<p>
	 *
	 */
	public boolean lot_chk_off_flg() {
		return getConstBoolean(offset + 43, $lot_chk_off_flg);
	}

	/**
	 * Ignore lot check ロットチェック無視.<p>
	 *
	 */
	public void lot_chk_off_flg(boolean value) {
		setConstBoolean(offset + 43, $lot_chk_off_flg, value);
	}


	/**
	 * Shipping distribution group cd. 出荷物流グループＣＤ.<p>
	 *
	 */
	public String ship_fr_lg_grp_cd() {
		return getConstString(offset + 44, $ship_fr_lg_grp_cd);
	}

	/**
	 * Shipping distribution group cd. 出荷物流グループＣＤ.<p>
	 *
	 */
	public void ship_fr_lg_grp_cd(String value) {
		setConstString(offset + 44, $ship_fr_lg_grp_cd, value);
	}


	/**
	 * Shipping distribution group name 出荷物流グループ名.<p>
	 *
	 */
	public String ship_fr_lg_grp_nm() {
		return getConstString(offset + 45, $ship_fr_lg_grp_nm);
	}

	/**
	 * Shipping distribution group name 出荷物流グループ名.<p>
	 *
	 */
	public void ship_fr_lg_grp_nm(String value) {
		setConstString(offset + 45, $ship_fr_lg_grp_nm, value);
	}


	/**
	 * Shipping conditions cd. 出荷条件ＣＤ.<p>
	 *
	 */
	public String ship_term_cd() {
		return getConstString(offset + 46, $ship_term_cd);
	}

	/**
	 * Shipping conditions cd. 出荷条件ＣＤ.<p>
	 *
	 */
	public void ship_term_cd(String value) {
		setConstString(offset + 46, $ship_term_cd, value);
	}


	/**
	 * Shipping conditions name 出荷条件名.<p>
	 *
	 */
	public String ship_term_nm() {
		return getConstString(offset + 47, $ship_term_nm);
	}

	/**
	 * Shipping conditions name 出荷条件名.<p>
	 *
	 */
	public void ship_term_nm(String value) {
		setConstString(offset + 47, $ship_term_nm, value);
	}


	/**
	 * Weight 重量.<p>
	 *
	 */
	public MCNumber ship_wt() {
		return getConstNumber(offset + 48, $ship_wt);
	}

	/**
	 * Weight 重量.<p>
	 *
	 */
	public void ship_wt(MCNumber value) {
		setConstNumber(offset + 48, $ship_wt, value);
	}

	/**
	 * Weight 重量.<p>
	 *
	 */
	public void ship_wt(int value) {
		setConstNumber(offset + 48, $ship_wt, value);
	}

	/**
	 * Weight 重量.<p>
	 *
	 */
	public void ship_wt(long value) {
		setConstNumber(offset + 48, $ship_wt, value);
	}

	/**
	 * Weight 重量.<p>
	 *
	 */
	public void ship_wt(float value) {
		setConstNumber(offset + 48, $ship_wt, value);
	}

	/**
	 * Weight 重量.<p>
	 *
	 */
	public void ship_wt(double value) {
		setConstNumber(offset + 48, $ship_wt, value);
	}


	/**
	 * Volume 容積.<p>
	 *
	 */
	public MCNumber ship_dim() {
		return getConstNumber(offset + 49, $ship_dim);
	}

	/**
	 * Volume 容積.<p>
	 *
	 */
	public void ship_dim(MCNumber value) {
		setConstNumber(offset + 49, $ship_dim, value);
	}

	/**
	 * Volume 容積.<p>
	 *
	 */
	public void ship_dim(int value) {
		setConstNumber(offset + 49, $ship_dim, value);
	}

	/**
	 * Volume 容積.<p>
	 *
	 */
	public void ship_dim(long value) {
		setConstNumber(offset + 49, $ship_dim, value);
	}

	/**
	 * Volume 容積.<p>
	 *
	 */
	public void ship_dim(float value) {
		setConstNumber(offset + 49, $ship_dim, value);
	}

	/**
	 * Volume 容積.<p>
	 *
	 */
	public void ship_dim(double value) {
		setConstNumber(offset + 49, $ship_dim, value);
	}


	/**
	 * Delivery note issued (At order) 指図時納品書発行済.<p>
	 *
	 */
	public boolean inst_dlv_prnted_flg() {
		return getConstBoolean(offset + 50, $inst_dlv_prnted_flg);
	}

	/**
	 * Delivery note issued (At order) 指図時納品書発行済.<p>
	 *
	 */
	public void inst_dlv_prnted_flg(boolean value) {
		setConstBoolean(offset + 50, $inst_dlv_prnted_flg, value);
	}


	/**
	 * Delivery note immediate issue 納品書即時発行.<p>
	 *
	 */
	public boolean dlv_slip_prnt_flg() {
		return getConstBoolean(offset + 51, $dlv_slip_prnt_flg);
	}

	/**
	 * Delivery note immediate issue 納品書即時発行.<p>
	 *
	 */
	public void dlv_slip_prnt_flg(boolean value) {
		setConstBoolean(offset + 51, $dlv_slip_prnt_flg, value);
	}


	/**
	 * Shipping guide?immediate issue 出荷案内書即時発行.<p>
	 *
	 */
	public boolean ship_adv_prnt_flg() {
		return getConstBoolean(offset + 52, $ship_adv_prnt_flg);
	}

	/**
	 * Shipping guide?immediate issue 出荷案内書即時発行.<p>
	 *
	 */
	public void ship_adv_prnt_flg(boolean value) {
		setConstBoolean(offset + 52, $ship_adv_prnt_flg, value);
	}


	/**
	 * Delivery note issued 納品書発行済.<p>
	 *
	 */
	public boolean dlv_slip_prnted_flg() {
		return getConstBoolean(offset + 53, $dlv_slip_prnted_flg);
	}

	/**
	 * Delivery note issued 納品書発行済.<p>
	 *
	 */
	public void dlv_slip_prnted_flg(boolean value) {
		setConstBoolean(offset + 53, $dlv_slip_prnted_flg, value);
	}


	/**
	 * Shipping guide issued 出荷案内書発行済.<p>
	 *
	 */
	public boolean ship_adv_prnted_flg() {
		return getConstBoolean(offset + 54, $ship_adv_prnted_flg);
	}

	/**
	 * Shipping guide issued 出荷案内書発行済.<p>
	 *
	 */
	public void ship_adv_prnted_flg(boolean value) {
		setConstBoolean(offset + 54, $ship_adv_prnted_flg, value);
	}


	/**
	 * Unplanned 計画外.<p>
	 *
	 */
	public boolean uplnd_flg() {
		return getConstBoolean(offset + 55, $uplnd_flg);
	}

	/**
	 * Unplanned 計画外.<p>
	 *
	 */
	public void uplnd_flg(boolean value) {
		setConstBoolean(offset + 55, $uplnd_flg, value);
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
	 * Shipping result update counter 出荷実績更新カウンタ.<p>
	 *
	 */
	public MCNumber ship_act_upd_cntr() {
		return getConstNumber(offset + 60, $ship_act_upd_cntr);
	}

	/**
	 * Shipping result update counter 出荷実績更新カウンタ.<p>
	 *
	 */
	public void ship_act_upd_cntr(MCNumber value) {
		setConstNumber(offset + 60, $ship_act_upd_cntr, value);
	}

	/**
	 * Shipping result update counter 出荷実績更新カウンタ.<p>
	 *
	 */
	public void ship_act_upd_cntr(int value) {
		setConstNumber(offset + 60, $ship_act_upd_cntr, value);
	}

	/**
	 * Shipping result update counter 出荷実績更新カウンタ.<p>
	 *
	 */
	public void ship_act_upd_cntr(long value) {
		setConstNumber(offset + 60, $ship_act_upd_cntr, value);
	}

	/**
	 * Shipping result update counter 出荷実績更新カウンタ.<p>
	 *
	 */
	public void ship_act_upd_cntr(float value) {
		setConstNumber(offset + 60, $ship_act_upd_cntr, value);
	}

	/**
	 * Shipping result update counter 出荷実績更新カウンタ.<p>
	 *
	 */
	public void ship_act_upd_cntr(double value) {
		setConstNumber(offset + 60, $ship_act_upd_cntr, value);
	}


	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public String ins_usr_id() {
		return getConstString(offset + 61, $ins_usr_id);
	}

	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public void ins_usr_id(String value) {
		setConstString(offset + 61, $ins_usr_id, value);
	}


	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public String ins_usr_nm() {
		return getConstString(offset + 62, $ins_usr_nm);
	}

	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public void ins_usr_nm(String value) {
		setConstString(offset + 62, $ins_usr_nm, value);
	}


	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public String ins_func_id() {
		return getConstString(offset + 63, $ins_func_id);
	}

	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public void ins_func_id(String value) {
		setConstString(offset + 63, $ins_func_id, value);
	}


	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public String ins_func_nm() {
		return getConstString(offset + 64, $ins_func_nm);
	}

	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public void ins_func_nm(String value) {
		setConstString(offset + 64, $ins_func_nm, value);
	}


	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public String upd_usr_id() {
		return getConstString(offset + 65, $upd_usr_id);
	}

	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public void upd_usr_id(String value) {
		setConstString(offset + 65, $upd_usr_id, value);
	}


	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public String upd_usr_nm() {
		return getConstString(offset + 66, $upd_usr_nm);
	}

	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public void upd_usr_nm(String value) {
		setConstString(offset + 66, $upd_usr_nm, value);
	}


	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public String upd_func_id() {
		return getConstString(offset + 67, $upd_func_id);
	}

	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public void upd_func_id(String value) {
		setConstString(offset + 67, $upd_func_id, value);
	}


	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public String upd_func_nm() {
		return getConstString(offset + 68, $upd_func_nm);
	}

	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public void upd_func_nm(String value) {
		setConstString(offset + 68, $upd_func_nm, value);
	}


	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public MCTimestamp ins_ts() {
		return getConstTimestamp(offset + 69, $ins_ts);
	}

	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public void ins_ts(MCTimestamp value) {
		setConstTimestamp(offset + 69, $ins_ts, value);
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
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public String upd_srv_req_no() {
		return getConstString(offset + 71, $upd_srv_req_no);
	}

	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public void upd_srv_req_no(String value) {
		setConstString(offset + 71, $upd_srv_req_no, value);
	}


	/**
	 * Issue delivery note 納品書発行.<p>
	 *
	 */
	public boolean dlv_slip_prnt_btn_flg() {
		return getConstBoolean(offset + 72, $dlv_slip_prnt_btn_flg);
	}

	/**
	 * Issue delivery note 納品書発行.<p>
	 *
	 */
	public void dlv_slip_prnt_btn_flg(boolean value) {
		setConstBoolean(offset + 72, $dlv_slip_prnt_btn_flg, value);
	}


	/**
	 * Shipping guide issue 出荷案内書発行.<p>
	 *
	 */
	public boolean ship_adv_prnt_btn_flg() {
		return getConstBoolean(offset + 73, $ship_adv_prnt_btn_flg);
	}

	/**
	 * Shipping guide issue 出荷案内書発行.<p>
	 *
	 */
	public void ship_adv_prnt_btn_flg(boolean value) {
		setConstBoolean(offset + 73, $ship_adv_prnt_btn_flg, value);
	}


	/**
	 * Report output locale cd. 帳票出力ロケールＣＤ.<p>
	 *
	 */
	public String prnt_lcl_cd() {
		return getConstString(offset + 74, $prnt_lcl_cd);
	}

	/**
	 * Report output locale cd. 帳票出力ロケールＣＤ.<p>
	 *
	 */
	public void prnt_lcl_cd(String value) {
		setConstString(offset + 74, $prnt_lcl_cd, value);
	}


	public boolean non_dlv_prnt_flg() {
		return getConstBoolean(offset + 75, $non_dlv_prnt_flg);
	}

	public void non_dlv_prnt_flg(boolean value) {
		setConstBoolean(offset + 75, $non_dlv_prnt_flg, value);
	}


	public boolean non_adv_prnt_flg() {
		return getConstBoolean(offset + 76, $non_adv_prnt_flg);
	}

	public void non_adv_prnt_flg(boolean value) {
		setConstBoolean(offset + 76, $non_adv_prnt_flg, value);
	}


	public String getString(String name) {
		if ($trd_cd.equalsIgnoreCase(name)) {
			return trd_cd();
		}
		if ($trd_nm.equalsIgnoreCase(name)) {
			return trd_nm();
		}
		if ($trd_ptn_typ.equalsIgnoreCase(name)) {
			return trd_ptn_typ();
		}
		if ($ship_act_no.equalsIgnoreCase(name)) {
			return ship_act_no();
		}
		if ($ship_inst_no.equalsIgnoreCase(name)) {
			return ship_inst_no();
		}
		if ($iv_no.equalsIgnoreCase(name)) {
			return iv_no();
		}
		if ($dlv_slip_no.equalsIgnoreCase(name)) {
			return dlv_slip_no();
		}
		if ($ship_to_id_typ.equalsIgnoreCase(name)) {
			return ship_to_id_typ();
		}
		if ($ship_to_id_typ_nm.equalsIgnoreCase(name)) {
			return ship_to_id_typ_nm();
		}
		if ($ship_to_id_cd.equalsIgnoreCase(name)) {
			return ship_to_id_cd();
		}
		if ($ship_to_id_nm.equalsIgnoreCase(name)) {
			return ship_to_id_nm();
		}
		if ($via_dlv_typ.equalsIgnoreCase(name)) {
			return via_dlv_typ();
		}
		if ($via_dlv_typ_nm.equalsIgnoreCase(name)) {
			return via_dlv_typ_nm();
		}
		if ($dlv_id_typ.equalsIgnoreCase(name)) {
			return dlv_id_typ();
		}
		if ($dlv_id_typ_nm.equalsIgnoreCase(name)) {
			return dlv_id_typ_nm();
		}
		if ($dlv_id_cd.equalsIgnoreCase(name)) {
			return dlv_id_cd();
		}
		if ($dlv_id_nm.equalsIgnoreCase(name)) {
			return dlv_id_nm();
		}
		if ($dlv_cd.equalsIgnoreCase(name)) {
			return dlv_cd();
		}
		if ($dlv_sppl_cd.equalsIgnoreCase(name)) {
			return dlv_sppl_cd();
		}
		if ($cst_cd.equalsIgnoreCase(name)) {
			return cst_cd();
		}
		if ($cst_nm.equalsIgnoreCase(name)) {
			return cst_nm();
		}
		if ($cst_usr_cd.equalsIgnoreCase(name)) {
			return cst_usr_cd();
		}
		if ($cst_dpt_cd.equalsIgnoreCase(name)) {
			return cst_dpt_cd();
		}
		if ($ship_fr_lg_grp_cd.equalsIgnoreCase(name)) {
			return ship_fr_lg_grp_cd();
		}
		if ($ship_fr_lg_grp_nm.equalsIgnoreCase(name)) {
			return ship_fr_lg_grp_nm();
		}
		if ($ship_term_cd.equalsIgnoreCase(name)) {
			return ship_term_cd();
		}
		if ($ship_term_nm.equalsIgnoreCase(name)) {
			return ship_term_nm();
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
		if ($prnt_lcl_cd.equalsIgnoreCase(name)) {
			return prnt_lcl_cd();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($ship_act_rev.equalsIgnoreCase(name)) {
			return ship_act_rev();
		}
		if ($ship_wt.equalsIgnoreCase(name)) {
			return ship_wt();
		}
		if ($ship_dim.equalsIgnoreCase(name)) {
			return ship_dim();
		}
		if ($ship_act_upd_cntr.equalsIgnoreCase(name)) {
			return ship_act_upd_cntr();
		}
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		if ($ac_ym.equalsIgnoreCase(name)) {
			return ac_ym();
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
		if ($latest_flg.equalsIgnoreCase(name)) {
			return latest_flg();
		}
		if ($can_flg.equalsIgnoreCase(name)) {
			return can_flg();
		}
		if ($ship_to_sundry_flg.equalsIgnoreCase(name)) {
			return ship_to_sundry_flg();
		}
		if ($dlv_sundry_flg.equalsIgnoreCase(name)) {
			return dlv_sundry_flg();
		}
		if ($dlv_pri_prnt_flg.equalsIgnoreCase(name)) {
			return dlv_pri_prnt_flg();
		}
		if ($dlv_str_ln_tgt_flg.equalsIgnoreCase(name)) {
			return dlv_str_ln_tgt_flg();
		}
		if ($cst_iv_flg.equalsIgnoreCase(name)) {
			return cst_iv_flg();
		}
		if ($lot_chk_off_flg.equalsIgnoreCase(name)) {
			return lot_chk_off_flg();
		}
		if ($inst_dlv_prnted_flg.equalsIgnoreCase(name)) {
			return inst_dlv_prnted_flg();
		}
		if ($dlv_slip_prnt_flg.equalsIgnoreCase(name)) {
			return dlv_slip_prnt_flg();
		}
		if ($ship_adv_prnt_flg.equalsIgnoreCase(name)) {
			return ship_adv_prnt_flg();
		}
		if ($dlv_slip_prnted_flg.equalsIgnoreCase(name)) {
			return dlv_slip_prnted_flg();
		}
		if ($ship_adv_prnted_flg.equalsIgnoreCase(name)) {
			return ship_adv_prnted_flg();
		}
		if ($uplnd_flg.equalsIgnoreCase(name)) {
			return uplnd_flg();
		}
		if ($dlv_slip_prnt_btn_flg.equalsIgnoreCase(name)) {
			return dlv_slip_prnt_btn_flg();
		}
		if ($ship_adv_prnt_btn_flg.equalsIgnoreCase(name)) {
			return ship_adv_prnt_btn_flg();
		}
		if ($non_dlv_prnt_flg.equalsIgnoreCase(name)) {
			return non_dlv_prnt_flg();
		}
		if ($non_adv_prnt_flg.equalsIgnoreCase(name)) {
			return non_adv_prnt_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($trd_cd.equalsIgnoreCase(name)) {
			return trd_cd();
		}
		if ($trd_nm.equalsIgnoreCase(name)) {
			return trd_nm();
		}
		if ($trd_ptn_typ.equalsIgnoreCase(name)) {
			return trd_ptn_typ();
		}
		if ($ship_act_no.equalsIgnoreCase(name)) {
			return ship_act_no();
		}
		if ($ship_inst_no.equalsIgnoreCase(name)) {
			return ship_inst_no();
		}
		if ($iv_no.equalsIgnoreCase(name)) {
			return iv_no();
		}
		if ($dlv_slip_no.equalsIgnoreCase(name)) {
			return dlv_slip_no();
		}
		if ($ship_to_id_typ.equalsIgnoreCase(name)) {
			return ship_to_id_typ();
		}
		if ($ship_to_id_typ_nm.equalsIgnoreCase(name)) {
			return ship_to_id_typ_nm();
		}
		if ($ship_to_id_cd.equalsIgnoreCase(name)) {
			return ship_to_id_cd();
		}
		if ($ship_to_id_nm.equalsIgnoreCase(name)) {
			return ship_to_id_nm();
		}
		if ($via_dlv_typ.equalsIgnoreCase(name)) {
			return via_dlv_typ();
		}
		if ($via_dlv_typ_nm.equalsIgnoreCase(name)) {
			return via_dlv_typ_nm();
		}
		if ($dlv_id_typ.equalsIgnoreCase(name)) {
			return dlv_id_typ();
		}
		if ($dlv_id_typ_nm.equalsIgnoreCase(name)) {
			return dlv_id_typ_nm();
		}
		if ($dlv_id_cd.equalsIgnoreCase(name)) {
			return dlv_id_cd();
		}
		if ($dlv_id_nm.equalsIgnoreCase(name)) {
			return dlv_id_nm();
		}
		if ($dlv_cd.equalsIgnoreCase(name)) {
			return dlv_cd();
		}
		if ($dlv_sppl_cd.equalsIgnoreCase(name)) {
			return dlv_sppl_cd();
		}
		if ($cst_cd.equalsIgnoreCase(name)) {
			return cst_cd();
		}
		if ($cst_nm.equalsIgnoreCase(name)) {
			return cst_nm();
		}
		if ($cst_usr_cd.equalsIgnoreCase(name)) {
			return cst_usr_cd();
		}
		if ($cst_dpt_cd.equalsIgnoreCase(name)) {
			return cst_dpt_cd();
		}
		if ($ship_fr_lg_grp_cd.equalsIgnoreCase(name)) {
			return ship_fr_lg_grp_cd();
		}
		if ($ship_fr_lg_grp_nm.equalsIgnoreCase(name)) {
			return ship_fr_lg_grp_nm();
		}
		if ($ship_term_cd.equalsIgnoreCase(name)) {
			return ship_term_cd();
		}
		if ($ship_term_nm.equalsIgnoreCase(name)) {
			return ship_term_nm();
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
		if ($prnt_lcl_cd.equalsIgnoreCase(name)) {
			return prnt_lcl_cd();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($ship_act_rev.equalsIgnoreCase(name)) {
			return ship_act_rev();
		}
		if ($ship_wt.equalsIgnoreCase(name)) {
			return ship_wt();
		}
		if ($ship_dim.equalsIgnoreCase(name)) {
			return ship_dim();
		}
		if ($ship_act_upd_cntr.equalsIgnoreCase(name)) {
			return ship_act_upd_cntr();
		}
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($ac_ym.equalsIgnoreCase(name)) {
			return ac_ym();
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
		if ($latest_flg.equalsIgnoreCase(name)) {
			return latest_flg();
		}
		if ($can_flg.equalsIgnoreCase(name)) {
			return can_flg();
		}
		if ($ship_to_sundry_flg.equalsIgnoreCase(name)) {
			return ship_to_sundry_flg();
		}
		if ($dlv_sundry_flg.equalsIgnoreCase(name)) {
			return dlv_sundry_flg();
		}
		if ($dlv_pri_prnt_flg.equalsIgnoreCase(name)) {
			return dlv_pri_prnt_flg();
		}
		if ($dlv_str_ln_tgt_flg.equalsIgnoreCase(name)) {
			return dlv_str_ln_tgt_flg();
		}
		if ($cst_iv_flg.equalsIgnoreCase(name)) {
			return cst_iv_flg();
		}
		if ($lot_chk_off_flg.equalsIgnoreCase(name)) {
			return lot_chk_off_flg();
		}
		if ($inst_dlv_prnted_flg.equalsIgnoreCase(name)) {
			return inst_dlv_prnted_flg();
		}
		if ($dlv_slip_prnt_flg.equalsIgnoreCase(name)) {
			return dlv_slip_prnt_flg();
		}
		if ($ship_adv_prnt_flg.equalsIgnoreCase(name)) {
			return ship_adv_prnt_flg();
		}
		if ($dlv_slip_prnted_flg.equalsIgnoreCase(name)) {
			return dlv_slip_prnted_flg();
		}
		if ($ship_adv_prnted_flg.equalsIgnoreCase(name)) {
			return ship_adv_prnted_flg();
		}
		if ($uplnd_flg.equalsIgnoreCase(name)) {
			return uplnd_flg();
		}
		if ($dlv_slip_prnt_btn_flg.equalsIgnoreCase(name)) {
			return dlv_slip_prnt_btn_flg();
		}
		if ($ship_adv_prnt_btn_flg.equalsIgnoreCase(name)) {
			return ship_adv_prnt_btn_flg();
		}
		if ($non_dlv_prnt_flg.equalsIgnoreCase(name)) {
			return non_dlv_prnt_flg();
		}
		if ($non_adv_prnt_flg.equalsIgnoreCase(name)) {
			return non_adv_prnt_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($trd_cd.equalsIgnoreCase(name)) {
			trd_cd(value);
			return;
		}
		if ($trd_nm.equalsIgnoreCase(name)) {
			trd_nm(value);
			return;
		}
		if ($trd_ptn_typ.equalsIgnoreCase(name)) {
			trd_ptn_typ(value);
			return;
		}
		if ($ship_act_no.equalsIgnoreCase(name)) {
			ship_act_no(value);
			return;
		}
		if ($ship_inst_no.equalsIgnoreCase(name)) {
			ship_inst_no(value);
			return;
		}
		if ($iv_no.equalsIgnoreCase(name)) {
			iv_no(value);
			return;
		}
		if ($dlv_slip_no.equalsIgnoreCase(name)) {
			dlv_slip_no(value);
			return;
		}
		if ($ship_to_id_typ.equalsIgnoreCase(name)) {
			ship_to_id_typ(value);
			return;
		}
		if ($ship_to_id_typ_nm.equalsIgnoreCase(name)) {
			ship_to_id_typ_nm(value);
			return;
		}
		if ($ship_to_id_cd.equalsIgnoreCase(name)) {
			ship_to_id_cd(value);
			return;
		}
		if ($ship_to_id_nm.equalsIgnoreCase(name)) {
			ship_to_id_nm(value);
			return;
		}
		if ($via_dlv_typ.equalsIgnoreCase(name)) {
			via_dlv_typ(value);
			return;
		}
		if ($via_dlv_typ_nm.equalsIgnoreCase(name)) {
			via_dlv_typ_nm(value);
			return;
		}
		if ($dlv_id_typ.equalsIgnoreCase(name)) {
			dlv_id_typ(value);
			return;
		}
		if ($dlv_id_typ_nm.equalsIgnoreCase(name)) {
			dlv_id_typ_nm(value);
			return;
		}
		if ($dlv_id_cd.equalsIgnoreCase(name)) {
			dlv_id_cd(value);
			return;
		}
		if ($dlv_id_nm.equalsIgnoreCase(name)) {
			dlv_id_nm(value);
			return;
		}
		if ($dlv_cd.equalsIgnoreCase(name)) {
			dlv_cd(value);
			return;
		}
		if ($dlv_sppl_cd.equalsIgnoreCase(name)) {
			dlv_sppl_cd(value);
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
		if ($cst_usr_cd.equalsIgnoreCase(name)) {
			cst_usr_cd(value);
			return;
		}
		if ($cst_dpt_cd.equalsIgnoreCase(name)) {
			cst_dpt_cd(value);
			return;
		}
		if ($ship_fr_lg_grp_cd.equalsIgnoreCase(name)) {
			ship_fr_lg_grp_cd(value);
			return;
		}
		if ($ship_fr_lg_grp_nm.equalsIgnoreCase(name)) {
			ship_fr_lg_grp_nm(value);
			return;
		}
		if ($ship_term_cd.equalsIgnoreCase(name)) {
			ship_term_cd(value);
			return;
		}
		if ($ship_term_nm.equalsIgnoreCase(name)) {
			ship_term_nm(value);
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
		if ($prnt_lcl_cd.equalsIgnoreCase(name)) {
			prnt_lcl_cd(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($ship_act_rev.equalsIgnoreCase(name)) {
			ship_act_rev(value);
			return;
		}
		if ($ship_wt.equalsIgnoreCase(name)) {
			ship_wt(value);
			return;
		}
		if ($ship_dim.equalsIgnoreCase(name)) {
			ship_dim(value);
			return;
		}
		if ($ship_act_upd_cntr.equalsIgnoreCase(name)) {
			ship_act_upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($ship_act_rev.equalsIgnoreCase(name)) {
			ship_act_rev(value);
			return;
		}
		if ($ship_wt.equalsIgnoreCase(name)) {
			ship_wt(value);
			return;
		}
		if ($ship_dim.equalsIgnoreCase(name)) {
			ship_dim(value);
			return;
		}
		if ($ship_act_upd_cntr.equalsIgnoreCase(name)) {
			ship_act_upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($ship_act_rev.equalsIgnoreCase(name)) {
			ship_act_rev(value);
			return;
		}
		if ($ship_wt.equalsIgnoreCase(name)) {
			ship_wt(value);
			return;
		}
		if ($ship_dim.equalsIgnoreCase(name)) {
			ship_dim(value);
			return;
		}
		if ($ship_act_upd_cntr.equalsIgnoreCase(name)) {
			ship_act_upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($ship_act_rev.equalsIgnoreCase(name)) {
			ship_act_rev(value);
			return;
		}
		if ($ship_wt.equalsIgnoreCase(name)) {
			ship_wt(value);
			return;
		}
		if ($ship_dim.equalsIgnoreCase(name)) {
			ship_dim(value);
			return;
		}
		if ($ship_act_upd_cntr.equalsIgnoreCase(name)) {
			ship_act_upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($ship_act_rev.equalsIgnoreCase(name)) {
			ship_act_rev(value);
			return;
		}
		if ($ship_wt.equalsIgnoreCase(name)) {
			ship_wt(value);
			return;
		}
		if ($ship_dim.equalsIgnoreCase(name)) {
			ship_dim(value);
			return;
		}
		if ($ship_act_upd_cntr.equalsIgnoreCase(name)) {
			ship_act_upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($ac_ym.equalsIgnoreCase(name)) {
			ac_ym(value);
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
		if ($latest_flg.equalsIgnoreCase(name)) {
			latest_flg(value);
			return;
		}
		if ($can_flg.equalsIgnoreCase(name)) {
			can_flg(value);
			return;
		}
		if ($ship_to_sundry_flg.equalsIgnoreCase(name)) {
			ship_to_sundry_flg(value);
			return;
		}
		if ($dlv_sundry_flg.equalsIgnoreCase(name)) {
			dlv_sundry_flg(value);
			return;
		}
		if ($dlv_pri_prnt_flg.equalsIgnoreCase(name)) {
			dlv_pri_prnt_flg(value);
			return;
		}
		if ($dlv_str_ln_tgt_flg.equalsIgnoreCase(name)) {
			dlv_str_ln_tgt_flg(value);
			return;
		}
		if ($cst_iv_flg.equalsIgnoreCase(name)) {
			cst_iv_flg(value);
			return;
		}
		if ($lot_chk_off_flg.equalsIgnoreCase(name)) {
			lot_chk_off_flg(value);
			return;
		}
		if ($inst_dlv_prnted_flg.equalsIgnoreCase(name)) {
			inst_dlv_prnted_flg(value);
			return;
		}
		if ($dlv_slip_prnt_flg.equalsIgnoreCase(name)) {
			dlv_slip_prnt_flg(value);
			return;
		}
		if ($ship_adv_prnt_flg.equalsIgnoreCase(name)) {
			ship_adv_prnt_flg(value);
			return;
		}
		if ($dlv_slip_prnted_flg.equalsIgnoreCase(name)) {
			dlv_slip_prnted_flg(value);
			return;
		}
		if ($ship_adv_prnted_flg.equalsIgnoreCase(name)) {
			ship_adv_prnted_flg(value);
			return;
		}
		if ($uplnd_flg.equalsIgnoreCase(name)) {
			uplnd_flg(value);
			return;
		}
		if ($dlv_slip_prnt_btn_flg.equalsIgnoreCase(name)) {
			dlv_slip_prnt_btn_flg(value);
			return;
		}
		if ($ship_adv_prnt_btn_flg.equalsIgnoreCase(name)) {
			ship_adv_prnt_btn_flg(value);
			return;
		}
		if ($non_dlv_prnt_flg.equalsIgnoreCase(name)) {
			non_dlv_prnt_flg(value);
			return;
		}
		if ($non_adv_prnt_flg.equalsIgnoreCase(name)) {
			non_adv_prnt_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($trd_cd.equalsIgnoreCase(name)) {
			trd_cd(value);
			return;
		}
		if ($trd_nm.equalsIgnoreCase(name)) {
			trd_nm(value);
			return;
		}
		if ($trd_ptn_typ.equalsIgnoreCase(name)) {
			trd_ptn_typ(value);
			return;
		}
		if ($ship_act_no.equalsIgnoreCase(name)) {
			ship_act_no(value);
			return;
		}
		if ($ship_inst_no.equalsIgnoreCase(name)) {
			ship_inst_no(value);
			return;
		}
		if ($iv_no.equalsIgnoreCase(name)) {
			iv_no(value);
			return;
		}
		if ($dlv_slip_no.equalsIgnoreCase(name)) {
			dlv_slip_no(value);
			return;
		}
		if ($ship_to_id_typ.equalsIgnoreCase(name)) {
			ship_to_id_typ(value);
			return;
		}
		if ($ship_to_id_typ_nm.equalsIgnoreCase(name)) {
			ship_to_id_typ_nm(value);
			return;
		}
		if ($ship_to_id_cd.equalsIgnoreCase(name)) {
			ship_to_id_cd(value);
			return;
		}
		if ($ship_to_id_nm.equalsIgnoreCase(name)) {
			ship_to_id_nm(value);
			return;
		}
		if ($via_dlv_typ.equalsIgnoreCase(name)) {
			via_dlv_typ(value);
			return;
		}
		if ($via_dlv_typ_nm.equalsIgnoreCase(name)) {
			via_dlv_typ_nm(value);
			return;
		}
		if ($dlv_id_typ.equalsIgnoreCase(name)) {
			dlv_id_typ(value);
			return;
		}
		if ($dlv_id_typ_nm.equalsIgnoreCase(name)) {
			dlv_id_typ_nm(value);
			return;
		}
		if ($dlv_id_cd.equalsIgnoreCase(name)) {
			dlv_id_cd(value);
			return;
		}
		if ($dlv_id_nm.equalsIgnoreCase(name)) {
			dlv_id_nm(value);
			return;
		}
		if ($dlv_cd.equalsIgnoreCase(name)) {
			dlv_cd(value);
			return;
		}
		if ($dlv_sppl_cd.equalsIgnoreCase(name)) {
			dlv_sppl_cd(value);
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
		if ($cst_usr_cd.equalsIgnoreCase(name)) {
			cst_usr_cd(value);
			return;
		}
		if ($cst_dpt_cd.equalsIgnoreCase(name)) {
			cst_dpt_cd(value);
			return;
		}
		if ($ship_fr_lg_grp_cd.equalsIgnoreCase(name)) {
			ship_fr_lg_grp_cd(value);
			return;
		}
		if ($ship_fr_lg_grp_nm.equalsIgnoreCase(name)) {
			ship_fr_lg_grp_nm(value);
			return;
		}
		if ($ship_term_cd.equalsIgnoreCase(name)) {
			ship_term_cd(value);
			return;
		}
		if ($ship_term_nm.equalsIgnoreCase(name)) {
			ship_term_nm(value);
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
		if ($prnt_lcl_cd.equalsIgnoreCase(name)) {
			prnt_lcl_cd(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($ship_act_rev.equalsIgnoreCase(name)) {
			ship_act_rev(value);
			return;
		}
		if ($ship_wt.equalsIgnoreCase(name)) {
			ship_wt(value);
			return;
		}
		if ($ship_dim.equalsIgnoreCase(name)) {
			ship_dim(value);
			return;
		}
		if ($ship_act_upd_cntr.equalsIgnoreCase(name)) {
			ship_act_upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($ship_act_rev.equalsIgnoreCase(name)) {
			ship_act_rev(value);
			return;
		}
		if ($ship_wt.equalsIgnoreCase(name)) {
			ship_wt(value);
			return;
		}
		if ($ship_dim.equalsIgnoreCase(name)) {
			ship_dim(value);
			return;
		}
		if ($ship_act_upd_cntr.equalsIgnoreCase(name)) {
			ship_act_upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($ship_act_rev.equalsIgnoreCase(name)) {
			ship_act_rev(value);
			return;
		}
		if ($ship_wt.equalsIgnoreCase(name)) {
			ship_wt(value);
			return;
		}
		if ($ship_dim.equalsIgnoreCase(name)) {
			ship_dim(value);
			return;
		}
		if ($ship_act_upd_cntr.equalsIgnoreCase(name)) {
			ship_act_upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($ship_act_rev.equalsIgnoreCase(name)) {
			ship_act_rev(value);
			return;
		}
		if ($ship_wt.equalsIgnoreCase(name)) {
			ship_wt(value);
			return;
		}
		if ($ship_dim.equalsIgnoreCase(name)) {
			ship_dim(value);
			return;
		}
		if ($ship_act_upd_cntr.equalsIgnoreCase(name)) {
			ship_act_upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($ship_act_rev.equalsIgnoreCase(name)) {
			ship_act_rev(value);
			return;
		}
		if ($ship_wt.equalsIgnoreCase(name)) {
			ship_wt(value);
			return;
		}
		if ($ship_dim.equalsIgnoreCase(name)) {
			ship_dim(value);
			return;
		}
		if ($ship_act_upd_cntr.equalsIgnoreCase(name)) {
			ship_act_upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($ac_ym.equalsIgnoreCase(name)) {
			ac_ym(value);
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
		if ($latest_flg.equalsIgnoreCase(name)) {
			latest_flg(value);
			return;
		}
		if ($can_flg.equalsIgnoreCase(name)) {
			can_flg(value);
			return;
		}
		if ($ship_to_sundry_flg.equalsIgnoreCase(name)) {
			ship_to_sundry_flg(value);
			return;
		}
		if ($dlv_sundry_flg.equalsIgnoreCase(name)) {
			dlv_sundry_flg(value);
			return;
		}
		if ($dlv_pri_prnt_flg.equalsIgnoreCase(name)) {
			dlv_pri_prnt_flg(value);
			return;
		}
		if ($dlv_str_ln_tgt_flg.equalsIgnoreCase(name)) {
			dlv_str_ln_tgt_flg(value);
			return;
		}
		if ($cst_iv_flg.equalsIgnoreCase(name)) {
			cst_iv_flg(value);
			return;
		}
		if ($lot_chk_off_flg.equalsIgnoreCase(name)) {
			lot_chk_off_flg(value);
			return;
		}
		if ($inst_dlv_prnted_flg.equalsIgnoreCase(name)) {
			inst_dlv_prnted_flg(value);
			return;
		}
		if ($dlv_slip_prnt_flg.equalsIgnoreCase(name)) {
			dlv_slip_prnt_flg(value);
			return;
		}
		if ($ship_adv_prnt_flg.equalsIgnoreCase(name)) {
			ship_adv_prnt_flg(value);
			return;
		}
		if ($dlv_slip_prnted_flg.equalsIgnoreCase(name)) {
			dlv_slip_prnted_flg(value);
			return;
		}
		if ($ship_adv_prnted_flg.equalsIgnoreCase(name)) {
			ship_adv_prnted_flg(value);
			return;
		}
		if ($uplnd_flg.equalsIgnoreCase(name)) {
			uplnd_flg(value);
			return;
		}
		if ($dlv_slip_prnt_btn_flg.equalsIgnoreCase(name)) {
			dlv_slip_prnt_btn_flg(value);
			return;
		}
		if ($ship_adv_prnt_btn_flg.equalsIgnoreCase(name)) {
			ship_adv_prnt_btn_flg(value);
			return;
		}
		if ($non_dlv_prnt_flg.equalsIgnoreCase(name)) {
			non_dlv_prnt_flg(value);
			return;
		}
		if ($non_adv_prnt_flg.equalsIgnoreCase(name)) {
			non_adv_prnt_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}

	public MCRow getInnerRow(String name) {
		if ($ac_dt_p.equalsIgnoreCase(name)) {
			return ac_dt_p();
		}
		if ($can_ac_dt_p.equalsIgnoreCase(name)) {
			return can_ac_dt_p();
		}
		if ($ship_ymdhm_p.equalsIgnoreCase(name)) {
			return ship_ymdhm_p();
		}
		if ($dlv_ymdhm_p.equalsIgnoreCase(name)) {
			return dlv_ymdhm_p();
		}
		if ($ss_ymdhm_p.equalsIgnoreCase(name)) {
			return ss_ymdhm_p();
		}
		if ($ds_ymdhm_p.equalsIgnoreCase(name)) {
			return ds_ymdhm_p();
		}
		if ($inst_ymdhm_p.equalsIgnoreCase(name)) {
			return inst_ymdhm_p();
		}
		if ($ship_to_addr_p.equalsIgnoreCase(name)) {
			return ship_to_addr_p();
		}
		if ($dlv_addr_p.equalsIgnoreCase(name)) {
			return dlv_addr_p();
		}
		if ($rqst_usr_dpt_p.equalsIgnoreCase(name)) {
			return rqst_usr_dpt_p();
		}
		if ($ship_usr_dpt_p.equalsIgnoreCase(name)) {
			return ship_usr_dpt_p();
		}
		return super.getInnerRow(name);
	}

	public void setInnerRow(String name, MCRow value) {
		if ($ac_dt_p.equalsIgnoreCase(name)) {
			ac_dt_p(
				((MCContainerMeta) ac_dt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP0310.AcDtR.class, value)
			);
			return;
		}
		if ($can_ac_dt_p.equalsIgnoreCase(name)) {
			can_ac_dt_p(
				((MCContainerMeta) can_ac_dt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP0330.CanAcDtR.class, value)
			);
			return;
		}
		if ($ship_ymdhm_p.equalsIgnoreCase(name)) {
			ship_ymdhm_p(
				((MCContainerMeta) ship_ymdhm_p_META).castInnerRow(mcframe.clientMAUB.MAUBP0110.YmdHmR.class, value)
			);
			return;
		}
		if ($dlv_ymdhm_p.equalsIgnoreCase(name)) {
			dlv_ymdhm_p(
				((MCContainerMeta) dlv_ymdhm_p_META).castInnerRow(mcframe.clientMAUB.MAUBP0110.YmdHmR.class, value)
			);
			return;
		}
		if ($ss_ymdhm_p.equalsIgnoreCase(name)) {
			ss_ymdhm_p(
				((MCContainerMeta) ss_ymdhm_p_META).castInnerRow(mcframe.clientMAUB.MAUBP0110.YmdHmR.class, value)
			);
			return;
		}
		if ($ds_ymdhm_p.equalsIgnoreCase(name)) {
			ds_ymdhm_p(
				((MCContainerMeta) ds_ymdhm_p_META).castInnerRow(mcframe.clientMAUB.MAUBP0110.YmdHmR.class, value)
			);
			return;
		}
		if ($inst_ymdhm_p.equalsIgnoreCase(name)) {
			inst_ymdhm_p(
				((MCContainerMeta) inst_ymdhm_p_META).castInnerRow(mcframe.clientMAUB.MAUBP0110.YmdHmR.class, value)
			);
			return;
		}
		if ($ship_to_addr_p.equalsIgnoreCase(name)) {
			ship_to_addr_p(
				((MCContainerMeta) ship_to_addr_p_META).castInnerRow(mcframe.clientMAUB.MAUBP0410.AddrR.class, value)
			);
			return;
		}
		if ($dlv_addr_p.equalsIgnoreCase(name)) {
			dlv_addr_p(
				((MCContainerMeta) dlv_addr_p_META).castInnerRow(mcframe.clientMAUB.MAUBP0410.AddrR.class, value)
			);
			return;
		}
		if ($rqst_usr_dpt_p.equalsIgnoreCase(name)) {
			rqst_usr_dpt_p(
				((MCContainerMeta) rqst_usr_dpt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP0320.UsrDptR.class, value)
			);
			return;
		}
		if ($ship_usr_dpt_p.equalsIgnoreCase(name)) {
			ship_usr_dpt_p(
				((MCContainerMeta) ship_usr_dpt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP0320.UsrDptR.class, value)
			);
			return;
		}
		super.setInnerRow(name, value);
	}


	public MCDate ac_dt() {
		return ac_dt_p().ac_dt();
	}

	public void ac_dt(MCDate value) {
		ac_dt_p().ac_dt(value);
	}

	public MCDate can_ac_dt_for_input() {
		return can_ac_dt_p().can_ac_dt_for_input();
	}

	public void can_ac_dt_for_input(MCDate value) {
		can_ac_dt_p().can_ac_dt_for_input(value);
	}

	public MCDate can_ac_dt() {
		return can_ac_dt_p().can_ac_dt_for_call();
	}

	public void can_ac_dt(MCDate value) {
		can_ac_dt_p().can_ac_dt_for_call(value);
	}

	public MCDate ac_dt_after_srch() {
		return can_ac_dt_p().ac_dt_after_srch();
	}

	public void ac_dt_after_srch(MCDate value) {
		can_ac_dt_p().ac_dt_after_srch(value);
	}

	/**
	 * Shipping date and time 出荷日時.<p>
	 *
	 */
	public MCDate ship_dt() {
		return ship_ymdhm_p().ymd();
	}

	/**
	 * Shipping date and time 出荷日時.<p>
	 *
	 */
	public void ship_dt(MCDate value) {
		ship_ymdhm_p().ymd(value);
	}

	public MCDate ship_hm() {
		return ship_ymdhm_p().hm();
	}

	public void ship_hm(MCDate value) {
		ship_ymdhm_p().hm(value);
	}

	/**
	 * Delivery date and time 納品日時.<p>
	 *
	 */
	public MCDate dlv_dt() {
		return dlv_ymdhm_p().ymd();
	}

	/**
	 * Delivery date and time 納品日時.<p>
	 *
	 */
	public void dlv_dt(MCDate value) {
		dlv_ymdhm_p().ymd(value);
	}

	public MCDate dlv_hm() {
		return dlv_ymdhm_p().hm();
	}

	public void dlv_hm(MCDate value) {
		dlv_ymdhm_p().hm(value);
	}

	/**
	 * Scheduled shipping date and time 出荷予定日時.<p>
	 *
	 */
	public MCDate ship_schd_dt() {
		return ss_ymdhm_p().ymd();
	}

	/**
	 * Scheduled shipping date and time 出荷予定日時.<p>
	 *
	 */
	public void ship_schd_dt(MCDate value) {
		ss_ymdhm_p().ymd(value);
	}

	public MCDate ship_schd_hm() {
		return ss_ymdhm_p().hm();
	}

	public void ship_schd_hm(MCDate value) {
		ss_ymdhm_p().hm(value);
	}

	/**
	 * Scheduled delivery date and time 納品予定日時.<p>
	 *
	 */
	public MCDate dlv_schd_dt() {
		return ds_ymdhm_p().ymd();
	}

	/**
	 * Scheduled delivery date and time 納品予定日時.<p>
	 *
	 */
	public void dlv_schd_dt(MCDate value) {
		ds_ymdhm_p().ymd(value);
	}

	public MCDate dlv_schd_hm() {
		return ds_ymdhm_p().hm();
	}

	public void dlv_schd_hm(MCDate value) {
		ds_ymdhm_p().hm(value);
	}

	/**
	 * Shipping order date and time 出荷指図日時.<p>
	 *
	 */
	public MCDate ship_inst_dt() {
		return inst_ymdhm_p().ymd();
	}

	/**
	 * Shipping order date and time 出荷指図日時.<p>
	 *
	 */
	public void ship_inst_dt(MCDate value) {
		inst_ymdhm_p().ymd(value);
	}

	public MCDate ship_inst_hm() {
		return inst_ymdhm_p().hm();
	}

	public void ship_inst_hm(MCDate value) {
		inst_ymdhm_p().hm(value);
	}

	/**
	 * Receiving point distribution group cd. 送付先物流グループＣＤ.<p>
	 *
	 */
	public String ship_to_lg_grp_cd() {
		return ship_to_addr_p().lg_grp_cd();
	}

	/**
	 * Receiving point distribution group cd. 送付先物流グループＣＤ.<p>
	 *
	 */
	public void ship_to_lg_grp_cd(String value) {
		ship_to_addr_p().lg_grp_cd(value);
	}

	/**
	 * Receiving point distribution group name 送付先物流グループ名.<p>
	 *
	 */
	public String ship_to_lg_grp_nm() {
		return ship_to_addr_p().lg_grp_nm();
	}

	/**
	 * Receiving point distribution group name 送付先物流グループ名.<p>
	 *
	 */
	public void ship_to_lg_grp_nm(String value) {
		ship_to_addr_p().lg_grp_nm(value);
	}

	/**
	 * Receiving point country cd. 送付先国ＣＤ.<p>
	 *
	 */
	public String ship_to_cntry_cd() {
		return ship_to_addr_p().cntry_cd();
	}

	/**
	 * Receiving point country cd. 送付先国ＣＤ.<p>
	 *
	 */
	public void ship_to_cntry_cd(String value) {
		ship_to_addr_p().cntry_cd(value);
	}

	/**
	 * Receiving point country name 送付先国名.<p>
	 *
	 */
	public String ship_to_cntry_nm() {
		return ship_to_addr_p().cntry_nm();
	}

	/**
	 * Receiving point country name 送付先国名.<p>
	 *
	 */
	public void ship_to_cntry_nm(String value) {
		ship_to_addr_p().cntry_nm(value);
	}

	/**
	 * Receiving point zip code 送付先郵便番号.<p>
	 *
	 */
	public String ship_to_zip_cd() {
		return ship_to_addr_p().zip_cd();
	}

	/**
	 * Receiving point zip code 送付先郵便番号.<p>
	 *
	 */
	public void ship_to_zip_cd(String value) {
		ship_to_addr_p().zip_cd(value);
	}

	/**
	 * Receiving point address 1 送付先住所１.<p>
	 *
	 */
	public String ship_to_addr1() {
		return ship_to_addr_p().addr1();
	}

	/**
	 * Receiving point address 1 送付先住所１.<p>
	 *
	 */
	public void ship_to_addr1(String value) {
		ship_to_addr_p().addr1(value);
	}

	/**
	 * Receiving point address 2 送付先住所２.<p>
	 *
	 */
	public String ship_to_addr2() {
		return ship_to_addr_p().addr2();
	}

	/**
	 * Receiving point address 2 送付先住所２.<p>
	 *
	 */
	public void ship_to_addr2(String value) {
		ship_to_addr_p().addr2(value);
	}

	/**
	 * Receiving point address 3 送付先住所３.<p>
	 *
	 */
	public String ship_to_addr3() {
		return ship_to_addr_p().addr3();
	}

	/**
	 * Receiving point address 3 送付先住所３.<p>
	 *
	 */
	public void ship_to_addr3(String value) {
		ship_to_addr_p().addr3(value);
	}

	/**
	 * Receiving point address 4 送付先住所４.<p>
	 *
	 */
	public String ship_to_addr4() {
		return ship_to_addr_p().addr4();
	}

	/**
	 * Receiving point address 4 送付先住所４.<p>
	 *
	 */
	public void ship_to_addr4(String value) {
		ship_to_addr_p().addr4(value);
	}

	/**
	 * Receiving point dept. 送付先部署.<p>
	 *
	 */
	public String ship_to_cntct_dpt() {
		return ship_to_addr_p().cntct_dpt();
	}

	/**
	 * Receiving point dept. 送付先部署.<p>
	 *
	 */
	public void ship_to_cntct_dpt(String value) {
		ship_to_addr_p().cntct_dpt(value);
	}

	/**
	 * Receiving point PIC 送付先担当者.<p>
	 *
	 */
	public String ship_to_cntct_psn() {
		return ship_to_addr_p().cntct_psn();
	}

	/**
	 * Receiving point PIC 送付先担当者.<p>
	 *
	 */
	public void ship_to_cntct_psn(String value) {
		ship_to_addr_p().cntct_psn(value);
	}

	/**
	 * Receiving point TEL 送付先ＴＥＬ.<p>
	 *
	 */
	public String ship_to_tel() {
		return ship_to_addr_p().tel();
	}

	/**
	 * Receiving point TEL 送付先ＴＥＬ.<p>
	 *
	 */
	public void ship_to_tel(String value) {
		ship_to_addr_p().tel(value);
	}

	/**
	 * Receiving point FAX 送付先ＦＡＸ.<p>
	 *
	 */
	public String ship_to_fax() {
		return ship_to_addr_p().fax();
	}

	/**
	 * Receiving point FAX 送付先ＦＡＸ.<p>
	 *
	 */
	public void ship_to_fax(String value) {
		ship_to_addr_p().fax(value);
	}

	/**
	 * Delivery destination distribution group cd. 納品先物流グループＣＤ.<p>
	 *
	 */
	public String dlv_lg_grp_cd() {
		return dlv_addr_p().lg_grp_cd();
	}

	/**
	 * Delivery destination distribution group cd. 納品先物流グループＣＤ.<p>
	 *
	 */
	public void dlv_lg_grp_cd(String value) {
		dlv_addr_p().lg_grp_cd(value);
	}

	/**
	 * Delivery destination distribution group name 納品先物流グループ名.<p>
	 *
	 */
	public String dlv_lg_grp_nm() {
		return dlv_addr_p().lg_grp_nm();
	}

	/**
	 * Delivery destination distribution group name 納品先物流グループ名.<p>
	 *
	 */
	public void dlv_lg_grp_nm(String value) {
		dlv_addr_p().lg_grp_nm(value);
	}

	/**
	 * Delivery destination country cd. 納品先国ＣＤ.<p>
	 *
	 */
	public String dlv_cntry_cd() {
		return dlv_addr_p().cntry_cd();
	}

	/**
	 * Delivery destination country cd. 納品先国ＣＤ.<p>
	 *
	 */
	public void dlv_cntry_cd(String value) {
		dlv_addr_p().cntry_cd(value);
	}

	/**
	 * Delivery destination country name 納品先国名.<p>
	 *
	 */
	public String dlv_cntry_nm() {
		return dlv_addr_p().cntry_nm();
	}

	/**
	 * Delivery destination country name 納品先国名.<p>
	 *
	 */
	public void dlv_cntry_nm(String value) {
		dlv_addr_p().cntry_nm(value);
	}

	/**
	 * Zip code (Delivery destination) 納品先郵便番号.<p>
	 *
	 */
	public String dlv_zip_cd() {
		return dlv_addr_p().zip_cd();
	}

	/**
	 * Zip code (Delivery destination) 納品先郵便番号.<p>
	 *
	 */
	public void dlv_zip_cd(String value) {
		dlv_addr_p().zip_cd(value);
	}

	/**
	 * Address 1 (Delivery destination) 納品先住所１.<p>
	 *
	 */
	public String dlv_addr1() {
		return dlv_addr_p().addr1();
	}

	/**
	 * Address 1 (Delivery destination) 納品先住所１.<p>
	 *
	 */
	public void dlv_addr1(String value) {
		dlv_addr_p().addr1(value);
	}

	/**
	 * Address 2 (Delivery destination) 納品先住所２.<p>
	 *
	 */
	public String dlv_addr2() {
		return dlv_addr_p().addr2();
	}

	/**
	 * Address 2 (Delivery destination) 納品先住所２.<p>
	 *
	 */
	public void dlv_addr2(String value) {
		dlv_addr_p().addr2(value);
	}

	/**
	 * Address 3 (Delivery destination) 納品先住所３.<p>
	 *
	 */
	public String dlv_addr3() {
		return dlv_addr_p().addr3();
	}

	/**
	 * Address 3 (Delivery destination) 納品先住所３.<p>
	 *
	 */
	public void dlv_addr3(String value) {
		dlv_addr_p().addr3(value);
	}

	/**
	 * Address 4 (Delivery destination) 納品先住所４.<p>
	 *
	 */
	public String dlv_addr4() {
		return dlv_addr_p().addr4();
	}

	/**
	 * Address 4 (Delivery destination) 納品先住所４.<p>
	 *
	 */
	public void dlv_addr4(String value) {
		dlv_addr_p().addr4(value);
	}

	/**
	 * Delivery destination dept. 納品先部署.<p>
	 *
	 */
	public String dlv_cntct_dpt() {
		return dlv_addr_p().cntct_dpt();
	}

	/**
	 * Delivery destination dept. 納品先部署.<p>
	 *
	 */
	public void dlv_cntct_dpt(String value) {
		dlv_addr_p().cntct_dpt(value);
	}

	/**
	 * Delivery destination PIC 納品先担当者.<p>
	 *
	 */
	public String dlv_cntct_psn() {
		return dlv_addr_p().cntct_psn();
	}

	/**
	 * Delivery destination PIC 納品先担当者.<p>
	 *
	 */
	public void dlv_cntct_psn(String value) {
		dlv_addr_p().cntct_psn(value);
	}

	/**
	 * TEL (Delivery destination) 納品先ＴＥＬ.<p>
	 *
	 */
	public String dlv_tel() {
		return dlv_addr_p().tel();
	}

	/**
	 * TEL (Delivery destination) 納品先ＴＥＬ.<p>
	 *
	 */
	public void dlv_tel(String value) {
		dlv_addr_p().tel(value);
	}

	/**
	 * FAX (Delivery destination) 納品先ＦＡＸ.<p>
	 *
	 */
	public String dlv_fax() {
		return dlv_addr_p().fax();
	}

	/**
	 * FAX (Delivery destination) 納品先ＦＡＸ.<p>
	 *
	 */
	public void dlv_fax(String value) {
		dlv_addr_p().fax(value);
	}

	/**
	 * Requesting PIC cd. 依頼元担当者ＣＤ.<p>
	 *
	 */
	public String rqst_usr_cd() {
		return rqst_usr_dpt_p().usr_cd();
	}

	/**
	 * Requesting PIC cd. 依頼元担当者ＣＤ.<p>
	 *
	 */
	public void rqst_usr_cd(String value) {
		rqst_usr_dpt_p().usr_cd(value);
	}

	/**
	 * Requesting PIC name 依頼元担当者名.<p>
	 *
	 */
	public String rqst_usr_nm() {
		return rqst_usr_dpt_p().usr_nm();
	}

	/**
	 * Requesting PIC name 依頼元担当者名.<p>
	 *
	 */
	public void rqst_usr_nm(String value) {
		rqst_usr_dpt_p().usr_nm(value);
	}

	/**
	 * Requesting dept. cd. 依頼元部門ＣＤ.<p>
	 *
	 */
	public String rqst_dpt_cd() {
		return rqst_usr_dpt_p().dpt_cd();
	}

	/**
	 * Requesting dept. cd. 依頼元部門ＣＤ.<p>
	 *
	 */
	public void rqst_dpt_cd(String value) {
		rqst_usr_dpt_p().dpt_cd(value);
	}

	/**
	 * Requesting dept. name 依頼元部門名.<p>
	 *
	 */
	public String rqst_dpt_nm() {
		return rqst_usr_dpt_p().dpt_nm();
	}

	/**
	 * Requesting dept. name 依頼元部門名.<p>
	 *
	 */
	public void rqst_dpt_nm(String value) {
		rqst_usr_dpt_p().dpt_nm(value);
	}

	/**
	 * Shipping PIC cd. 出荷担当者ＣＤ.<p>
	 *
	 */
	public String ship_usr_cd() {
		return ship_usr_dpt_p().usr_cd();
	}

	/**
	 * Shipping PIC cd. 出荷担当者ＣＤ.<p>
	 *
	 */
	public void ship_usr_cd(String value) {
		ship_usr_dpt_p().usr_cd(value);
	}

	/**
	 * Shipping PIC name 出荷担当者名.<p>
	 *
	 */
	public String ship_usr_nm() {
		return ship_usr_dpt_p().usr_nm();
	}

	/**
	 * Shipping PIC name 出荷担当者名.<p>
	 *
	 */
	public void ship_usr_nm(String value) {
		ship_usr_dpt_p().usr_nm(value);
	}

	/**
	 * Shipping dept. cd. 出荷部門ＣＤ.<p>
	 *
	 */
	public String ship_dpt_cd() {
		return ship_usr_dpt_p().dpt_cd();
	}

	/**
	 * Shipping dept. cd. 出荷部門ＣＤ.<p>
	 *
	 */
	public void ship_dpt_cd(String value) {
		ship_usr_dpt_p().dpt_cd(value);
	}

	/**
	 * Shipping dept. name 出荷部門名.<p>
	 *
	 */
	public String ship_dpt_nm() {
		return ship_usr_dpt_p().dpt_nm();
	}

	/**
	 * Shipping dept. name 出荷部門名.<p>
	 *
	 */
	public void ship_dpt_nm(String value) {
		ship_usr_dpt_p().dpt_nm(value);
	}

}

