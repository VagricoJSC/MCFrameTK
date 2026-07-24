package mcframe.serverMSBA.MSBAL0020;

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
 * ブロック"Srch01_Rslt2"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class Srch01_Rslt2R_MC_A extends MCConstRow {

	/**
	 * Inventory request from other WG replied No. ＷＧ間依頼回答ＮＯ.<p>
	 *
	 */
	public static final String $wg_rqst_prms_no = "wg_rqst_prms_no";
	/**
	 * No. of inventory request from other WG ＷＧ間依頼ＮＯ.<p>
	 *
	 */
	public static final String $wg_rqst_no = "wg_rqst_no";
	/**
	 * Firm 確定.<p>
	 *
	 */
	public static final String $fix_flg = "fix_flg";
	/**
	 * Firm date 確定日.<p>
	 *
	 */
	public static final String $fix_dt = "fix_dt";
	/**
	 * Notification 通知.<p>
	 *
	 */
	public static final String $prms_ntc_flg = "prms_ntc_flg";
	/**
	 * Notification date 通知日.<p>
	 *
	 */
	public static final String $prms_dt = "prms_dt";
	/**
	 * Re-Notification 再通知.<p>
	 *
	 */
	public static final String $re_prms_ntc_flg = "re_prms_ntc_flg";
	/**
	 * Re-Notification date 再通知日.<p>
	 *
	 */
	public static final String $re_prms_dt = "re_prms_dt";
	/**
	 * Cancel 取消.<p>
	 *
	 */
	public static final String $can_flg = "can_flg";
	/**
	 * Request classification type 依頼種類区分.<p>
	 *
	 */
	public static final String $wg_rqst_typ = "wg_rqst_typ";
	/**
	 * Request classification type name 依頼種類区分名.<p>
	 *
	 */
	public static final String $wg_rqst_typ_nm = "wg_rqst_typ_nm";
	/**
	 * GR location cd. 入庫場所ＣＤ.<p>
	 *
	 */
	public static final String $gr_loc_cd = "gr_loc_cd";
	/**
	 * GR location name 入庫場所名.<p>
	 *
	 */
	public static final String $gr_loc_nm = "gr_loc_nm";
	/**
	 * GR WG cd. 入庫ワーキンググループＣＤ.<p>
	 *
	 */
	public static final String $gr_wg_cd = "gr_wg_cd";
	/**
	 * GR WG name 入庫ワーキンググループ名.<p>
	 *
	 */
	public static final String $gr_wg_nm = "gr_wg_nm";
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
	 * Asset management type 資産管理区分.<p>
	 *
	 */
	public static final String $asset_mng_typ = "asset_mng_typ";
	/**
	 * Discount item 値引品目.<p>
	 *
	 */
	public static final String $dscnt_itm_flg = "dscnt_itm_flg";
	/**
	 * Transaction unit cd. 取引単位ＣＤ.<p>
	 *
	 */
	public static final String $prms_trd_unit_cd = "prms_trd_unit_cd";
	/**
	 * Transaction unit name 取引単位名.<p>
	 *
	 */
	public static final String $prms_trd_unit_nm = "prms_trd_unit_nm";
	/**
	 * Transaction unit number of decimal places 取引単位小数部有効桁数.<p>
	 *
	 */
	public static final String $prms_trd_unit_dec_place = "prms_trd_unit_dec_place";
	/**
	 * Transaction unit rounding type 取引単位端数処理区分.<p>
	 *
	 */
	public static final String $prms_trd_unit_rnd_typ = "prms_trd_unit_rnd_typ";
	/**
	 * Transaction unit base qty. 取引単位基準数量.<p>
	 *
	 */
	public static final String $prms_trd_unit_conv_base_qty = "prms_trd_unit_conv_base_qty";
	/**
	 * Transaction unit conversion qty. 取引単位換算数量.<p>
	 *
	 */
	public static final String $prms_trd_unit_conv_qty = "prms_trd_unit_conv_qty";
	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public static final String $prms_trd_unit_qty = "prms_trd_unit_qty";
	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public static final String $prms_base_unit_cd = "prms_base_unit_cd";
	/**
	 * Base unit name 基準単位名.<p>
	 *
	 */
	public static final String $prms_base_unit_nm = "prms_base_unit_nm";
	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public static final String $prms_base_unit_dec_place = "prms_base_unit_dec_place";
	/**
	 * Base unit rounding type 基準単位端数処理区分.<p>
	 *
	 */
	public static final String $prms_base_unit_rnd_typ = "prms_base_unit_rnd_typ";
	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public static final String $prms_base_unit_qty = "prms_base_unit_qty";
	/**
	 * Replied GR date 回答入庫日.<p>
	 *
	 */
	public static final String $gr_schd_dt = "gr_schd_dt";
	/**
	 * Replied GR time 回答入庫時刻.<p>
	 *
	 */
	public static final String $gr_schd_hm = "gr_schd_hm";
	/**
	 * Replied GI date 回答出庫日.<p>
	 *
	 */
	public static final String $gi_schd_dt = "gi_schd_dt";
	/**
	 * Replied GI time 回答出庫時刻.<p>
	 *
	 */
	public static final String $gi_schd_hm = "gi_schd_hm";
	/**
	 * GI location cd. 出庫場所ＣＤ.<p>
	 *
	 */
	public static final String $gi_loc_cd = "gi_loc_cd";
	/**
	 * GI location name 出庫場所名.<p>
	 *
	 */
	public static final String $gi_loc_nm = "gi_loc_nm";
	/**
	 * For GI rack/line 出庫棚・ライン対象.<p>
	 *
	 */
	public static final String $gi_str_ln_tgt_flg = "gi_str_ln_tgt_flg";
	/**
	 * GI rack/line cd. 出庫棚・ラインＣＤ.<p>
	 *
	 */
	public static final String $gi_str_ln_cd = "gi_str_ln_cd";
	/**
	 * GI rack/line name 出庫棚・ライン名.<p>
	 *
	 */
	public static final String $gi_str_ln_nm = "gi_str_ln_nm";
	/**
	 * Without GI rack/line 出庫棚・ライン無.<p>
	 *
	 */
	public static final String $gi_str_ln_cd_none_flg = "gi_str_ln_cd_none_flg";
	/**
	 * GI WG cd. 出庫ワーキンググループＣＤ.<p>
	 *
	 */
	public static final String $gi_wg_cd = "gi_wg_cd";
	/**
	 * GI WG name 出庫ワーキンググループ名.<p>
	 *
	 */
	public static final String $gi_wg_nm = "gi_wg_nm";
	/**
	 * GI distribution group cd. 出庫物流グループＣＤ.<p>
	 *
	 */
	public static final String $gi_lg_grp_cd = "gi_lg_grp_cd";
	/**
	 * GI distribution group name 出庫物流グループ名.<p>
	 *
	 */
	public static final String $gi_lg_grp_nm = "gi_lg_grp_nm";
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
	 * BOM pattern 構成パタン.<p>
	 *
	 */
	public static final String $bom_ptn = "bom_ptn";
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
	 * Replied remarks 回答備考.<p>
	 *
	 */
	public static final String $prms_rmrks = "prms_rmrks";
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
	 * Last firmed 前回確定.<p>
	 *
	 */
	public static final String $last_fix_flg = "last_fix_flg";
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
	 * Inventory request from other WG replied update counter ＷＧ間依頼回答更新カウンタ.<p>
	 *
	 */
	public static final String $wg_rqst_prms_upd_cntr = "wg_rqst_prms_upd_cntr";
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
	public static final String $org_prms_base_unit_qty = "org_prms_base_unit_qty";


	public static final MCMeta wg_rqst_prms_no_META = createCommonMeta($wg_rqst_prms_no, mcframe.commonMA.meta.MA_META.WG_RQST_PRMS_NO);
	public static final MCMeta wg_rqst_no_META = createCommonMeta($wg_rqst_no, mcframe.commonMA.meta.MA_META.WG_RQST_NO);
	public static final MCMeta fix_flg_META = createCommonMeta($fix_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta fix_dt_META = createCommonMeta($fix_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta prms_ntc_flg_META = createCommonMeta($prms_ntc_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta prms_dt_META = createCommonMeta($prms_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta re_prms_ntc_flg_META = createCommonMeta($re_prms_ntc_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta re_prms_dt_META = createCommonMeta($re_prms_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta can_flg_META = createCommonMeta($can_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta wg_rqst_typ_META = createCommonMeta($wg_rqst_typ, mcframe.commonMS.meta.MS_META.WG_RQST_TYP);
	public static final MCMeta wg_rqst_typ_nm_META = createCommonMeta($wg_rqst_typ_nm, mcframe.commonMS.meta.MS_META.WG_RQST_TYP_NM);
	public static final MCMeta gr_loc_cd_META = createCommonMeta($gr_loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta gr_loc_nm_META = createCommonMeta($gr_loc_nm, mcframe.commonMA.meta.MA_META.LOC_NM);
	public static final MCMeta gr_wg_cd_META = createCommonMeta($gr_wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta gr_wg_nm_META = createCommonMeta($gr_wg_nm, mcframe.commonMA.meta.MA_META.WG_NM);
	public static final MCMeta wg_cd_META = createCommonMeta($wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta wg_nm_META = createCommonMeta($wg_nm, mcframe.commonMA.meta.MA_META.WG_NM);
	public static final MCMeta itm_cd_META = createCommonMeta($itm_cd, mcframe.commonMA.meta.MA_META.ITM_CD);
	public static final MCMeta itm_sub1_META = createCommonMeta($itm_sub1, mcframe.commonMA.meta.MA_META.ITM_SUB1);
	public static final MCMeta itm_sub2_META = createCommonMeta($itm_sub2, mcframe.commonMA.meta.MA_META.ITM_SUB2);
	public static final MCMeta itm_sub3_META = createCommonMeta($itm_sub3, mcframe.commonMA.meta.MA_META.ITM_SUB3);
	public static final MCMeta itm_nm_META = createCommonMeta($itm_nm, mcframe.commonMA.meta.MA_META.ITM_NM);
	public static final MCMeta asset_mng_typ_META = createCommonMeta($asset_mng_typ, mcframe.commonMA.meta.MA_META.ASSET_MNG_TYP);
	public static final MCMeta dscnt_itm_flg_META = createCommonMeta($dscnt_itm_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta prms_trd_unit_cd_META = createCommonMeta($prms_trd_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta prms_trd_unit_nm_META = createCommonMeta($prms_trd_unit_nm, mcframe.commonMA.meta.MA_META.UNIT_NM);
	public static final MCMeta prms_trd_unit_dec_place_META = createCommonMeta($prms_trd_unit_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta prms_trd_unit_rnd_typ_META = createCommonMeta($prms_trd_unit_rnd_typ, mcframe.commonMA.meta.MA_META.RND_TYP);
	public static final MCMeta prms_trd_unit_conv_base_qty_META = createCommonMeta($prms_trd_unit_conv_base_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta prms_trd_unit_conv_qty_META = createCommonMeta($prms_trd_unit_conv_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta prms_trd_unit_qty_META = createCommonMeta($prms_trd_unit_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta prms_base_unit_cd_META = createCommonMeta($prms_base_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta prms_base_unit_nm_META = createCommonMeta($prms_base_unit_nm, mcframe.commonMA.meta.MA_META.UNIT_NM);
	public static final MCMeta prms_base_unit_dec_place_META = createCommonMeta($prms_base_unit_dec_place, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta prms_base_unit_rnd_typ_META = createCommonMeta($prms_base_unit_rnd_typ, mcframe.commonMA.meta.MA_META.RND_TYP);
	public static final MCMeta prms_base_unit_qty_META = createCommonMeta($prms_base_unit_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta gr_schd_dt_META = createCommonMeta($gr_schd_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta gr_schd_hm_META = createCommonMeta($gr_schd_hm, mcframe.commonMA.meta.MA_META.HM);
	public static final MCMeta gi_schd_dt_META = createCommonMeta($gi_schd_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta gi_schd_hm_META = createCommonMeta($gi_schd_hm, mcframe.commonMA.meta.MA_META.HM);
	public static final MCMeta gi_loc_cd_META = createCommonMeta($gi_loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta gi_loc_nm_META = createCommonMeta($gi_loc_nm, mcframe.commonMA.meta.MA_META.LOC_NM);
	public static final MCMeta gi_str_ln_tgt_flg_META = createCommonMeta($gi_str_ln_tgt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta gi_str_ln_cd_META = createCommonMeta($gi_str_ln_cd, mcframe.commonMA.meta.MA_META.STR_LN_CD);
	public static final MCMeta gi_str_ln_nm_META = createCommonMeta($gi_str_ln_nm, mcframe.commonMA.meta.MA_META.STR_LN_NM);
	public static final MCMeta gi_str_ln_cd_none_flg_META = createCommonMeta($gi_str_ln_cd_none_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta gi_wg_cd_META = createCommonMeta($gi_wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta gi_wg_nm_META = createCommonMeta($gi_wg_nm, mcframe.commonMA.meta.MA_META.WG_NM);
	public static final MCMeta gi_lg_grp_cd_META = createCommonMeta($gi_lg_grp_cd, mcframe.commonMA.meta.MA_META.LG_GRP_CD);
	public static final MCMeta gi_lg_grp_nm_META = createCommonMeta($gi_lg_grp_nm, mcframe.commonMA.meta.MA_META.LG_GRP_NM);
	public static final MCMeta mfg_loc_cd_META = createCommonMeta($mfg_loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta mfg_loc_nm_META = createCommonMeta($mfg_loc_nm, mcframe.commonMA.meta.MA_META.LOC_NM);
	public static final MCMeta bom_ptn_META = createCommonMeta($bom_ptn, mcframe.commonMA.meta.MA_META.BOM_PTN);
	public static final MCMeta sppl_cd_META = createCommonMeta($sppl_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta sppl_nm_META = createCommonMeta($sppl_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta maker_cd_META = createCommonMeta($maker_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta maker_nm_META = createCommonMeta($maker_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta prms_rmrks_META = createCommonMeta($prms_rmrks, mcframe.commonMS.meta.MS_META.WG_RQST_PRMS_RMRKS);
	public static final MCMeta intr_rmrks_META = createCommonMeta($intr_rmrks, mcframe.commonMS.meta.MS_META.WG_RQST_PRMS_INTR_RMRKS);
	public static final MCMeta sub_char1_META = createCommonMeta($sub_char1, mcframe.commonMS.meta.MS_META.WG_RQST_PRMS_SUB_CHAR1);
	public static final MCMeta sub_char2_META = createCommonMeta($sub_char2, mcframe.commonMS.meta.MS_META.WG_RQST_PRMS_SUB_CHAR2);
	public static final MCMeta sub_char3_META = createCommonMeta($sub_char3, mcframe.commonMS.meta.MS_META.WG_RQST_PRMS_SUB_CHAR3);
	public static final MCMeta last_fix_flg_META = createCommonMeta($last_fix_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta ins_usr_id_META = createCommonMeta($ins_usr_id, mcframe.commonMA.meta.MA_META.FCM_USR_ID);
	public static final MCMeta ins_usr_nm_META = createCommonMeta($ins_usr_nm, mcframe.commonMA.meta.MA_META.FCM_USR_NM);
	public static final MCMeta ins_func_id_META = createCommonMeta($ins_func_id, mcframe.commonMA.meta.MA_META.FUNC_ID);
	public static final MCMeta ins_func_nm_META = createCommonMeta($ins_func_nm, mcframe.commonMA.meta.MA_META.FUNC_NM);
	public static final MCMeta ins_ts_META = createCommonMeta($ins_ts, mcframe.commonMA.meta.MA_META.SYS_TS);
	public static final MCMeta wg_rqst_prms_upd_cntr_META = createCommonMeta($wg_rqst_prms_upd_cntr, mcframe.commonMA.meta.MA_META.UPD_CNT);
	public static final MCMeta upd_usr_id_META = createCommonMeta($upd_usr_id, mcframe.commonMA.meta.MA_META.FCM_USR_ID);
	public static final MCMeta upd_usr_nm_META = createCommonMeta($upd_usr_nm, mcframe.commonMA.meta.MA_META.FCM_USR_NM);
	public static final MCMeta upd_func_id_META = createCommonMeta($upd_func_id, mcframe.commonMA.meta.MA_META.FUNC_ID);
	public static final MCMeta upd_func_nm_META = createCommonMeta($upd_func_nm, mcframe.commonMA.meta.MA_META.FUNC_NM);
	public static final MCMeta upd_ts_META = createCommonMeta($upd_ts, mcframe.commonMA.meta.MA_META.SYS_TS);
	public static final MCMeta upd_srv_req_no_META = createCommonMeta($upd_srv_req_no, mcframe.commonMA.meta.MA_META.SRV_REQ_NO);
	public static final MCMeta org_prms_base_unit_qty_META = createCommonMeta($org_prms_base_unit_qty, mcframe.commonMA.meta.MA_META.QTY);

	protected static final ConstMetaList<Srch01_Rslt2R> constMetas = new ConstMetaList<Srch01_Rslt2R>(
		MCConstRow.constMetas,
		new MCMeta[]{
			wg_rqst_prms_no_META,
			wg_rqst_no_META,
			fix_flg_META,
			fix_dt_META,
			prms_ntc_flg_META,
			prms_dt_META,
			re_prms_ntc_flg_META,
			re_prms_dt_META,
			can_flg_META,
			wg_rqst_typ_META,
			wg_rqst_typ_nm_META,
			gr_loc_cd_META,
			gr_loc_nm_META,
			gr_wg_cd_META,
			gr_wg_nm_META,
			wg_cd_META,
			wg_nm_META,
			itm_cd_META,
			itm_sub1_META,
			itm_sub2_META,
			itm_sub3_META,
			itm_nm_META,
			asset_mng_typ_META,
			dscnt_itm_flg_META,
			prms_trd_unit_cd_META,
			prms_trd_unit_nm_META,
			prms_trd_unit_dec_place_META,
			prms_trd_unit_rnd_typ_META,
			prms_trd_unit_conv_base_qty_META,
			prms_trd_unit_conv_qty_META,
			prms_trd_unit_qty_META,
			prms_base_unit_cd_META,
			prms_base_unit_nm_META,
			prms_base_unit_dec_place_META,
			prms_base_unit_rnd_typ_META,
			prms_base_unit_qty_META,
			gr_schd_dt_META,
			gr_schd_hm_META,
			gi_schd_dt_META,
			gi_schd_hm_META,
			gi_loc_cd_META,
			gi_loc_nm_META,
			gi_str_ln_tgt_flg_META,
			gi_str_ln_cd_META,
			gi_str_ln_nm_META,
			gi_str_ln_cd_none_flg_META,
			gi_wg_cd_META,
			gi_wg_nm_META,
			gi_lg_grp_cd_META,
			gi_lg_grp_nm_META,
			mfg_loc_cd_META,
			mfg_loc_nm_META,
			bom_ptn_META,
			sppl_cd_META,
			sppl_nm_META,
			maker_cd_META,
			maker_nm_META,
			prms_rmrks_META,
			intr_rmrks_META,
			sub_char1_META,
			sub_char2_META,
			sub_char3_META,
			last_fix_flg_META,
			ins_usr_id_META,
			ins_usr_nm_META,
			ins_func_id_META,
			ins_func_nm_META,
			ins_ts_META,
			wg_rqst_prms_upd_cntr_META,
			upd_usr_id_META,
			upd_usr_nm_META,
			upd_func_id_META,
			upd_func_nm_META,
			upd_ts_META,
			upd_srv_req_no_META,
			org_prms_base_unit_qty_META
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
				{$wg_rqst_typ, "MSC_WG_RQST_TYP"}	// wg_rqst_typ
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
	protected Srch01_Rslt2R_MC_A(ConstMetaList<? extends Srch01_Rslt2R> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch01_Rslt2R clone() {
		return (Srch01_Rslt2R) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch01_Rslt2R createInstance() {
		return (Srch01_Rslt2R) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch01_Rslt2R getValues(String... names) {
		return (Srch01_Rslt2R) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * Inventory request from other WG replied No. ＷＧ間依頼回答ＮＯ.<p>
	 *
	 */
	public String wg_rqst_prms_no() {
		return getConstString(offset + 0, $wg_rqst_prms_no);
	}

	/**
	 * Inventory request from other WG replied No. ＷＧ間依頼回答ＮＯ.<p>
	 *
	 */
	public void wg_rqst_prms_no(String value) {
		setConstString(offset + 0, $wg_rqst_prms_no, value);
	}


	/**
	 * No. of inventory request from other WG ＷＧ間依頼ＮＯ.<p>
	 *
	 */
	public String wg_rqst_no() {
		return getConstString(offset + 1, $wg_rqst_no);
	}

	/**
	 * No. of inventory request from other WG ＷＧ間依頼ＮＯ.<p>
	 *
	 */
	public void wg_rqst_no(String value) {
		setConstString(offset + 1, $wg_rqst_no, value);
	}


	/**
	 * Firm 確定.<p>
	 *
	 */
	public boolean fix_flg() {
		return getConstBoolean(offset + 2, $fix_flg);
	}

	/**
	 * Firm 確定.<p>
	 *
	 */
	public void fix_flg(boolean value) {
		setConstBoolean(offset + 2, $fix_flg, value);
	}


	/**
	 * Firm date 確定日.<p>
	 *
	 */
	public MCDate fix_dt() {
		return getConstDate(offset + 3, $fix_dt);
	}

	/**
	 * Firm date 確定日.<p>
	 *
	 */
	public void fix_dt(MCDate value) {
		setConstDate(offset + 3, $fix_dt, value);
	}


	/**
	 * Notification 通知.<p>
	 *
	 */
	public boolean prms_ntc_flg() {
		return getConstBoolean(offset + 4, $prms_ntc_flg);
	}

	/**
	 * Notification 通知.<p>
	 *
	 */
	public void prms_ntc_flg(boolean value) {
		setConstBoolean(offset + 4, $prms_ntc_flg, value);
	}


	/**
	 * Notification date 通知日.<p>
	 *
	 */
	public MCDate prms_dt() {
		return getConstDate(offset + 5, $prms_dt);
	}

	/**
	 * Notification date 通知日.<p>
	 *
	 */
	public void prms_dt(MCDate value) {
		setConstDate(offset + 5, $prms_dt, value);
	}


	/**
	 * Re-Notification 再通知.<p>
	 *
	 */
	public boolean re_prms_ntc_flg() {
		return getConstBoolean(offset + 6, $re_prms_ntc_flg);
	}

	/**
	 * Re-Notification 再通知.<p>
	 *
	 */
	public void re_prms_ntc_flg(boolean value) {
		setConstBoolean(offset + 6, $re_prms_ntc_flg, value);
	}


	/**
	 * Re-Notification date 再通知日.<p>
	 *
	 */
	public MCDate re_prms_dt() {
		return getConstDate(offset + 7, $re_prms_dt);
	}

	/**
	 * Re-Notification date 再通知日.<p>
	 *
	 */
	public void re_prms_dt(MCDate value) {
		setConstDate(offset + 7, $re_prms_dt, value);
	}


	/**
	 * Cancel 取消.<p>
	 *
	 */
	public boolean can_flg() {
		return getConstBoolean(offset + 8, $can_flg);
	}

	/**
	 * Cancel 取消.<p>
	 *
	 */
	public void can_flg(boolean value) {
		setConstBoolean(offset + 8, $can_flg, value);
	}


	/**
	 * Request classification type 依頼種類区分.<p>
	 *
	 */
	public String wg_rqst_typ() {
		return getConstString(offset + 9, $wg_rqst_typ);
	}

	/**
	 * Request classification type 依頼種類区分.<p>
	 *
	 */
	public void wg_rqst_typ(String value) {
		setConstString(offset + 9, $wg_rqst_typ, value);
	}


	/**
	 * Request classification type name 依頼種類区分名.<p>
	 *
	 */
	public String wg_rqst_typ_nm() {
		return getConstString(offset + 10, $wg_rqst_typ_nm);
	}

	/**
	 * Request classification type name 依頼種類区分名.<p>
	 *
	 */
	public void wg_rqst_typ_nm(String value) {
		setConstString(offset + 10, $wg_rqst_typ_nm, value);
	}


	/**
	 * GR location cd. 入庫場所ＣＤ.<p>
	 *
	 */
	public String gr_loc_cd() {
		return getConstString(offset + 11, $gr_loc_cd);
	}

	/**
	 * GR location cd. 入庫場所ＣＤ.<p>
	 *
	 */
	public void gr_loc_cd(String value) {
		setConstString(offset + 11, $gr_loc_cd, value);
	}


	/**
	 * GR location name 入庫場所名.<p>
	 *
	 */
	public String gr_loc_nm() {
		return getConstString(offset + 12, $gr_loc_nm);
	}

	/**
	 * GR location name 入庫場所名.<p>
	 *
	 */
	public void gr_loc_nm(String value) {
		setConstString(offset + 12, $gr_loc_nm, value);
	}


	/**
	 * GR WG cd. 入庫ワーキンググループＣＤ.<p>
	 *
	 */
	public String gr_wg_cd() {
		return getConstString(offset + 13, $gr_wg_cd);
	}

	/**
	 * GR WG cd. 入庫ワーキンググループＣＤ.<p>
	 *
	 */
	public void gr_wg_cd(String value) {
		setConstString(offset + 13, $gr_wg_cd, value);
	}


	/**
	 * GR WG name 入庫ワーキンググループ名.<p>
	 *
	 */
	public String gr_wg_nm() {
		return getConstString(offset + 14, $gr_wg_nm);
	}

	/**
	 * GR WG name 入庫ワーキンググループ名.<p>
	 *
	 */
	public void gr_wg_nm(String value) {
		setConstString(offset + 14, $gr_wg_nm, value);
	}


	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public String wg_cd() {
		return getConstString(offset + 15, $wg_cd);
	}

	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public void wg_cd(String value) {
		setConstString(offset + 15, $wg_cd, value);
	}


	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public String wg_nm() {
		return getConstString(offset + 16, $wg_nm);
	}

	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public void wg_nm(String value) {
		setConstString(offset + 16, $wg_nm, value);
	}


	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public String itm_cd() {
		return getConstString(offset + 17, $itm_cd);
	}

	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public void itm_cd(String value) {
		setConstString(offset + 17, $itm_cd, value);
	}


	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public String itm_sub1() {
		return getConstString(offset + 18, $itm_sub1);
	}

	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public void itm_sub1(String value) {
		setConstString(offset + 18, $itm_sub1, value);
	}


	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public String itm_sub2() {
		return getConstString(offset + 19, $itm_sub2);
	}

	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public void itm_sub2(String value) {
		setConstString(offset + 19, $itm_sub2, value);
	}


	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public String itm_sub3() {
		return getConstString(offset + 20, $itm_sub3);
	}

	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public void itm_sub3(String value) {
		setConstString(offset + 20, $itm_sub3, value);
	}


	/**
	 * Item name 品名.<p>
	 *
	 */
	public String itm_nm() {
		return getConstString(offset + 21, $itm_nm);
	}

	/**
	 * Item name 品名.<p>
	 *
	 */
	public void itm_nm(String value) {
		setConstString(offset + 21, $itm_nm, value);
	}


	/**
	 * Asset management type 資産管理区分.<p>
	 *
	 */
	public String asset_mng_typ() {
		return getConstString(offset + 22, $asset_mng_typ);
	}

	/**
	 * Asset management type 資産管理区分.<p>
	 *
	 */
	public void asset_mng_typ(String value) {
		setConstString(offset + 22, $asset_mng_typ, value);
	}


	/**
	 * Discount item 値引品目.<p>
	 *
	 */
	public boolean dscnt_itm_flg() {
		return getConstBoolean(offset + 23, $dscnt_itm_flg);
	}

	/**
	 * Discount item 値引品目.<p>
	 *
	 */
	public void dscnt_itm_flg(boolean value) {
		setConstBoolean(offset + 23, $dscnt_itm_flg, value);
	}


	/**
	 * Transaction unit cd. 取引単位ＣＤ.<p>
	 *
	 */
	public String prms_trd_unit_cd() {
		return getConstString(offset + 24, $prms_trd_unit_cd);
	}

	/**
	 * Transaction unit cd. 取引単位ＣＤ.<p>
	 *
	 */
	public void prms_trd_unit_cd(String value) {
		setConstString(offset + 24, $prms_trd_unit_cd, value);
	}


	/**
	 * Transaction unit name 取引単位名.<p>
	 *
	 */
	public String prms_trd_unit_nm() {
		return getConstString(offset + 25, $prms_trd_unit_nm);
	}

	/**
	 * Transaction unit name 取引単位名.<p>
	 *
	 */
	public void prms_trd_unit_nm(String value) {
		setConstString(offset + 25, $prms_trd_unit_nm, value);
	}


	/**
	 * Transaction unit number of decimal places 取引単位小数部有効桁数.<p>
	 *
	 */
	public MCNumber prms_trd_unit_dec_place() {
		return getConstNumber(offset + 26, $prms_trd_unit_dec_place);
	}

	/**
	 * Transaction unit number of decimal places 取引単位小数部有効桁数.<p>
	 *
	 */
	public void prms_trd_unit_dec_place(MCNumber value) {
		setConstNumber(offset + 26, $prms_trd_unit_dec_place, value);
	}

	/**
	 * Transaction unit number of decimal places 取引単位小数部有効桁数.<p>
	 *
	 */
	public void prms_trd_unit_dec_place(int value) {
		setConstNumber(offset + 26, $prms_trd_unit_dec_place, value);
	}

	/**
	 * Transaction unit number of decimal places 取引単位小数部有効桁数.<p>
	 *
	 */
	public void prms_trd_unit_dec_place(long value) {
		setConstNumber(offset + 26, $prms_trd_unit_dec_place, value);
	}

	/**
	 * Transaction unit number of decimal places 取引単位小数部有効桁数.<p>
	 *
	 */
	public void prms_trd_unit_dec_place(float value) {
		setConstNumber(offset + 26, $prms_trd_unit_dec_place, value);
	}

	/**
	 * Transaction unit number of decimal places 取引単位小数部有効桁数.<p>
	 *
	 */
	public void prms_trd_unit_dec_place(double value) {
		setConstNumber(offset + 26, $prms_trd_unit_dec_place, value);
	}


	/**
	 * Transaction unit rounding type 取引単位端数処理区分.<p>
	 *
	 */
	public String prms_trd_unit_rnd_typ() {
		return getConstString(offset + 27, $prms_trd_unit_rnd_typ);
	}

	/**
	 * Transaction unit rounding type 取引単位端数処理区分.<p>
	 *
	 */
	public void prms_trd_unit_rnd_typ(String value) {
		setConstString(offset + 27, $prms_trd_unit_rnd_typ, value);
	}


	/**
	 * Transaction unit base qty. 取引単位基準数量.<p>
	 *
	 */
	public MCNumber prms_trd_unit_conv_base_qty() {
		return getConstNumber(offset + 28, $prms_trd_unit_conv_base_qty);
	}

	/**
	 * Transaction unit base qty. 取引単位基準数量.<p>
	 *
	 */
	public void prms_trd_unit_conv_base_qty(MCNumber value) {
		setConstNumber(offset + 28, $prms_trd_unit_conv_base_qty, value);
	}

	/**
	 * Transaction unit base qty. 取引単位基準数量.<p>
	 *
	 */
	public void prms_trd_unit_conv_base_qty(int value) {
		setConstNumber(offset + 28, $prms_trd_unit_conv_base_qty, value);
	}

	/**
	 * Transaction unit base qty. 取引単位基準数量.<p>
	 *
	 */
	public void prms_trd_unit_conv_base_qty(long value) {
		setConstNumber(offset + 28, $prms_trd_unit_conv_base_qty, value);
	}

	/**
	 * Transaction unit base qty. 取引単位基準数量.<p>
	 *
	 */
	public void prms_trd_unit_conv_base_qty(float value) {
		setConstNumber(offset + 28, $prms_trd_unit_conv_base_qty, value);
	}

	/**
	 * Transaction unit base qty. 取引単位基準数量.<p>
	 *
	 */
	public void prms_trd_unit_conv_base_qty(double value) {
		setConstNumber(offset + 28, $prms_trd_unit_conv_base_qty, value);
	}


	/**
	 * Transaction unit conversion qty. 取引単位換算数量.<p>
	 *
	 */
	public MCNumber prms_trd_unit_conv_qty() {
		return getConstNumber(offset + 29, $prms_trd_unit_conv_qty);
	}

	/**
	 * Transaction unit conversion qty. 取引単位換算数量.<p>
	 *
	 */
	public void prms_trd_unit_conv_qty(MCNumber value) {
		setConstNumber(offset + 29, $prms_trd_unit_conv_qty, value);
	}

	/**
	 * Transaction unit conversion qty. 取引単位換算数量.<p>
	 *
	 */
	public void prms_trd_unit_conv_qty(int value) {
		setConstNumber(offset + 29, $prms_trd_unit_conv_qty, value);
	}

	/**
	 * Transaction unit conversion qty. 取引単位換算数量.<p>
	 *
	 */
	public void prms_trd_unit_conv_qty(long value) {
		setConstNumber(offset + 29, $prms_trd_unit_conv_qty, value);
	}

	/**
	 * Transaction unit conversion qty. 取引単位換算数量.<p>
	 *
	 */
	public void prms_trd_unit_conv_qty(float value) {
		setConstNumber(offset + 29, $prms_trd_unit_conv_qty, value);
	}

	/**
	 * Transaction unit conversion qty. 取引単位換算数量.<p>
	 *
	 */
	public void prms_trd_unit_conv_qty(double value) {
		setConstNumber(offset + 29, $prms_trd_unit_conv_qty, value);
	}


	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public MCNumber prms_trd_unit_qty() {
		return getConstNumber(offset + 30, $prms_trd_unit_qty);
	}

	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public void prms_trd_unit_qty(MCNumber value) {
		setConstNumber(offset + 30, $prms_trd_unit_qty, value);
	}

	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public void prms_trd_unit_qty(int value) {
		setConstNumber(offset + 30, $prms_trd_unit_qty, value);
	}

	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public void prms_trd_unit_qty(long value) {
		setConstNumber(offset + 30, $prms_trd_unit_qty, value);
	}

	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public void prms_trd_unit_qty(float value) {
		setConstNumber(offset + 30, $prms_trd_unit_qty, value);
	}

	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public void prms_trd_unit_qty(double value) {
		setConstNumber(offset + 30, $prms_trd_unit_qty, value);
	}


	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public String prms_base_unit_cd() {
		return getConstString(offset + 31, $prms_base_unit_cd);
	}

	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public void prms_base_unit_cd(String value) {
		setConstString(offset + 31, $prms_base_unit_cd, value);
	}


	/**
	 * Base unit name 基準単位名.<p>
	 *
	 */
	public String prms_base_unit_nm() {
		return getConstString(offset + 32, $prms_base_unit_nm);
	}

	/**
	 * Base unit name 基準単位名.<p>
	 *
	 */
	public void prms_base_unit_nm(String value) {
		setConstString(offset + 32, $prms_base_unit_nm, value);
	}


	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public MCNumber prms_base_unit_dec_place() {
		return getConstNumber(offset + 33, $prms_base_unit_dec_place);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void prms_base_unit_dec_place(MCNumber value) {
		setConstNumber(offset + 33, $prms_base_unit_dec_place, value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void prms_base_unit_dec_place(int value) {
		setConstNumber(offset + 33, $prms_base_unit_dec_place, value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void prms_base_unit_dec_place(long value) {
		setConstNumber(offset + 33, $prms_base_unit_dec_place, value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void prms_base_unit_dec_place(float value) {
		setConstNumber(offset + 33, $prms_base_unit_dec_place, value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void prms_base_unit_dec_place(double value) {
		setConstNumber(offset + 33, $prms_base_unit_dec_place, value);
	}


	/**
	 * Base unit rounding type 基準単位端数処理区分.<p>
	 *
	 */
	public String prms_base_unit_rnd_typ() {
		return getConstString(offset + 34, $prms_base_unit_rnd_typ);
	}

	/**
	 * Base unit rounding type 基準単位端数処理区分.<p>
	 *
	 */
	public void prms_base_unit_rnd_typ(String value) {
		setConstString(offset + 34, $prms_base_unit_rnd_typ, value);
	}


	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public MCNumber prms_base_unit_qty() {
		return getConstNumber(offset + 35, $prms_base_unit_qty);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void prms_base_unit_qty(MCNumber value) {
		setConstNumber(offset + 35, $prms_base_unit_qty, value);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void prms_base_unit_qty(int value) {
		setConstNumber(offset + 35, $prms_base_unit_qty, value);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void prms_base_unit_qty(long value) {
		setConstNumber(offset + 35, $prms_base_unit_qty, value);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void prms_base_unit_qty(float value) {
		setConstNumber(offset + 35, $prms_base_unit_qty, value);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void prms_base_unit_qty(double value) {
		setConstNumber(offset + 35, $prms_base_unit_qty, value);
	}


	/**
	 * Replied GR date 回答入庫日.<p>
	 *
	 */
	public MCDate gr_schd_dt() {
		return getConstDate(offset + 36, $gr_schd_dt);
	}

	/**
	 * Replied GR date 回答入庫日.<p>
	 *
	 */
	public void gr_schd_dt(MCDate value) {
		setConstDate(offset + 36, $gr_schd_dt, value);
	}


	/**
	 * Replied GR time 回答入庫時刻.<p>
	 *
	 */
	public MCDate gr_schd_hm() {
		return getConstDate(offset + 37, $gr_schd_hm);
	}

	/**
	 * Replied GR time 回答入庫時刻.<p>
	 *
	 */
	public void gr_schd_hm(MCDate value) {
		setConstDate(offset + 37, $gr_schd_hm, value);
	}


	/**
	 * Replied GI date 回答出庫日.<p>
	 *
	 */
	public MCDate gi_schd_dt() {
		return getConstDate(offset + 38, $gi_schd_dt);
	}

	/**
	 * Replied GI date 回答出庫日.<p>
	 *
	 */
	public void gi_schd_dt(MCDate value) {
		setConstDate(offset + 38, $gi_schd_dt, value);
	}


	/**
	 * Replied GI time 回答出庫時刻.<p>
	 *
	 */
	public MCDate gi_schd_hm() {
		return getConstDate(offset + 39, $gi_schd_hm);
	}

	/**
	 * Replied GI time 回答出庫時刻.<p>
	 *
	 */
	public void gi_schd_hm(MCDate value) {
		setConstDate(offset + 39, $gi_schd_hm, value);
	}


	/**
	 * GI location cd. 出庫場所ＣＤ.<p>
	 *
	 */
	public String gi_loc_cd() {
		return getConstString(offset + 40, $gi_loc_cd);
	}

	/**
	 * GI location cd. 出庫場所ＣＤ.<p>
	 *
	 */
	public void gi_loc_cd(String value) {
		setConstString(offset + 40, $gi_loc_cd, value);
	}


	/**
	 * GI location name 出庫場所名.<p>
	 *
	 */
	public String gi_loc_nm() {
		return getConstString(offset + 41, $gi_loc_nm);
	}

	/**
	 * GI location name 出庫場所名.<p>
	 *
	 */
	public void gi_loc_nm(String value) {
		setConstString(offset + 41, $gi_loc_nm, value);
	}


	/**
	 * For GI rack/line 出庫棚・ライン対象.<p>
	 *
	 */
	public boolean gi_str_ln_tgt_flg() {
		return getConstBoolean(offset + 42, $gi_str_ln_tgt_flg);
	}

	/**
	 * For GI rack/line 出庫棚・ライン対象.<p>
	 *
	 */
	public void gi_str_ln_tgt_flg(boolean value) {
		setConstBoolean(offset + 42, $gi_str_ln_tgt_flg, value);
	}


	/**
	 * GI rack/line cd. 出庫棚・ラインＣＤ.<p>
	 *
	 */
	public String gi_str_ln_cd() {
		return getConstString(offset + 43, $gi_str_ln_cd);
	}

	/**
	 * GI rack/line cd. 出庫棚・ラインＣＤ.<p>
	 *
	 */
	public void gi_str_ln_cd(String value) {
		setConstString(offset + 43, $gi_str_ln_cd, value);
	}


	/**
	 * GI rack/line name 出庫棚・ライン名.<p>
	 *
	 */
	public String gi_str_ln_nm() {
		return getConstString(offset + 44, $gi_str_ln_nm);
	}

	/**
	 * GI rack/line name 出庫棚・ライン名.<p>
	 *
	 */
	public void gi_str_ln_nm(String value) {
		setConstString(offset + 44, $gi_str_ln_nm, value);
	}


	/**
	 * Without GI rack/line 出庫棚・ライン無.<p>
	 *
	 */
	public boolean gi_str_ln_cd_none_flg() {
		return getConstBoolean(offset + 45, $gi_str_ln_cd_none_flg);
	}

	/**
	 * Without GI rack/line 出庫棚・ライン無.<p>
	 *
	 */
	public void gi_str_ln_cd_none_flg(boolean value) {
		setConstBoolean(offset + 45, $gi_str_ln_cd_none_flg, value);
	}


	/**
	 * GI WG cd. 出庫ワーキンググループＣＤ.<p>
	 *
	 */
	public String gi_wg_cd() {
		return getConstString(offset + 46, $gi_wg_cd);
	}

	/**
	 * GI WG cd. 出庫ワーキンググループＣＤ.<p>
	 *
	 */
	public void gi_wg_cd(String value) {
		setConstString(offset + 46, $gi_wg_cd, value);
	}


	/**
	 * GI WG name 出庫ワーキンググループ名.<p>
	 *
	 */
	public String gi_wg_nm() {
		return getConstString(offset + 47, $gi_wg_nm);
	}

	/**
	 * GI WG name 出庫ワーキンググループ名.<p>
	 *
	 */
	public void gi_wg_nm(String value) {
		setConstString(offset + 47, $gi_wg_nm, value);
	}


	/**
	 * GI distribution group cd. 出庫物流グループＣＤ.<p>
	 *
	 */
	public String gi_lg_grp_cd() {
		return getConstString(offset + 48, $gi_lg_grp_cd);
	}

	/**
	 * GI distribution group cd. 出庫物流グループＣＤ.<p>
	 *
	 */
	public void gi_lg_grp_cd(String value) {
		setConstString(offset + 48, $gi_lg_grp_cd, value);
	}


	/**
	 * GI distribution group name 出庫物流グループ名.<p>
	 *
	 */
	public String gi_lg_grp_nm() {
		return getConstString(offset + 49, $gi_lg_grp_nm);
	}

	/**
	 * GI distribution group name 出庫物流グループ名.<p>
	 *
	 */
	public void gi_lg_grp_nm(String value) {
		setConstString(offset + 49, $gi_lg_grp_nm, value);
	}


	/**
	 * Mfg. location cd. 製造場所ＣＤ.<p>
	 *
	 */
	public String mfg_loc_cd() {
		return getConstString(offset + 50, $mfg_loc_cd);
	}

	/**
	 * Mfg. location cd. 製造場所ＣＤ.<p>
	 *
	 */
	public void mfg_loc_cd(String value) {
		setConstString(offset + 50, $mfg_loc_cd, value);
	}


	/**
	 * Mfg. location name 製造場所名.<p>
	 *
	 */
	public String mfg_loc_nm() {
		return getConstString(offset + 51, $mfg_loc_nm);
	}

	/**
	 * Mfg. location name 製造場所名.<p>
	 *
	 */
	public void mfg_loc_nm(String value) {
		setConstString(offset + 51, $mfg_loc_nm, value);
	}


	/**
	 * BOM pattern 構成パタン.<p>
	 *
	 */
	public String bom_ptn() {
		return getConstString(offset + 52, $bom_ptn);
	}

	/**
	 * BOM pattern 構成パタン.<p>
	 *
	 */
	public void bom_ptn(String value) {
		setConstString(offset + 52, $bom_ptn, value);
	}


	/**
	 * Supplier cd. 発注先ＣＤ.<p>
	 *
	 */
	public String sppl_cd() {
		return getConstString(offset + 53, $sppl_cd);
	}

	/**
	 * Supplier cd. 発注先ＣＤ.<p>
	 *
	 */
	public void sppl_cd(String value) {
		setConstString(offset + 53, $sppl_cd, value);
	}


	/**
	 * Supplier name 発注先名.<p>
	 *
	 */
	public String sppl_nm() {
		return getConstString(offset + 54, $sppl_nm);
	}

	/**
	 * Supplier name 発注先名.<p>
	 *
	 */
	public void sppl_nm(String value) {
		setConstString(offset + 54, $sppl_nm, value);
	}


	/**
	 * Maker cd. メーカＣＤ.<p>
	 *
	 */
	public String maker_cd() {
		return getConstString(offset + 55, $maker_cd);
	}

	/**
	 * Maker cd. メーカＣＤ.<p>
	 *
	 */
	public void maker_cd(String value) {
		setConstString(offset + 55, $maker_cd, value);
	}


	/**
	 * Maker name メーカ名.<p>
	 *
	 */
	public String maker_nm() {
		return getConstString(offset + 56, $maker_nm);
	}

	/**
	 * Maker name メーカ名.<p>
	 *
	 */
	public void maker_nm(String value) {
		setConstString(offset + 56, $maker_nm, value);
	}


	/**
	 * Replied remarks 回答備考.<p>
	 *
	 */
	public String prms_rmrks() {
		return getConstString(offset + 57, $prms_rmrks);
	}

	/**
	 * Replied remarks 回答備考.<p>
	 *
	 */
	public void prms_rmrks(String value) {
		setConstString(offset + 57, $prms_rmrks, value);
	}


	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public String intr_rmrks() {
		return getConstString(offset + 58, $intr_rmrks);
	}

	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public void intr_rmrks(String value) {
		setConstString(offset + 58, $intr_rmrks, value);
	}


	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public String sub_char1() {
		return getConstString(offset + 59, $sub_char1);
	}

	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public void sub_char1(String value) {
		setConstString(offset + 59, $sub_char1, value);
	}


	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public String sub_char2() {
		return getConstString(offset + 60, $sub_char2);
	}

	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public void sub_char2(String value) {
		setConstString(offset + 60, $sub_char2, value);
	}


	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public String sub_char3() {
		return getConstString(offset + 61, $sub_char3);
	}

	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public void sub_char3(String value) {
		setConstString(offset + 61, $sub_char3, value);
	}


	/**
	 * Last firmed 前回確定.<p>
	 *
	 */
	public boolean last_fix_flg() {
		return getConstBoolean(offset + 62, $last_fix_flg);
	}

	/**
	 * Last firmed 前回確定.<p>
	 *
	 */
	public void last_fix_flg(boolean value) {
		setConstBoolean(offset + 62, $last_fix_flg, value);
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
	 * Inventory request from other WG replied update counter ＷＧ間依頼回答更新カウンタ.<p>
	 *
	 */
	public MCNumber wg_rqst_prms_upd_cntr() {
		return getConstNumber(offset + 68, $wg_rqst_prms_upd_cntr);
	}

	/**
	 * Inventory request from other WG replied update counter ＷＧ間依頼回答更新カウンタ.<p>
	 *
	 */
	public void wg_rqst_prms_upd_cntr(MCNumber value) {
		setConstNumber(offset + 68, $wg_rqst_prms_upd_cntr, value);
	}

	/**
	 * Inventory request from other WG replied update counter ＷＧ間依頼回答更新カウンタ.<p>
	 *
	 */
	public void wg_rqst_prms_upd_cntr(int value) {
		setConstNumber(offset + 68, $wg_rqst_prms_upd_cntr, value);
	}

	/**
	 * Inventory request from other WG replied update counter ＷＧ間依頼回答更新カウンタ.<p>
	 *
	 */
	public void wg_rqst_prms_upd_cntr(long value) {
		setConstNumber(offset + 68, $wg_rqst_prms_upd_cntr, value);
	}

	/**
	 * Inventory request from other WG replied update counter ＷＧ間依頼回答更新カウンタ.<p>
	 *
	 */
	public void wg_rqst_prms_upd_cntr(float value) {
		setConstNumber(offset + 68, $wg_rqst_prms_upd_cntr, value);
	}

	/**
	 * Inventory request from other WG replied update counter ＷＧ間依頼回答更新カウンタ.<p>
	 *
	 */
	public void wg_rqst_prms_upd_cntr(double value) {
		setConstNumber(offset + 68, $wg_rqst_prms_upd_cntr, value);
	}


	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public String upd_usr_id() {
		return getConstString(offset + 69, $upd_usr_id);
	}

	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public void upd_usr_id(String value) {
		setConstString(offset + 69, $upd_usr_id, value);
	}


	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public String upd_usr_nm() {
		return getConstString(offset + 70, $upd_usr_nm);
	}

	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public void upd_usr_nm(String value) {
		setConstString(offset + 70, $upd_usr_nm, value);
	}


	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public String upd_func_id() {
		return getConstString(offset + 71, $upd_func_id);
	}

	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public void upd_func_id(String value) {
		setConstString(offset + 71, $upd_func_id, value);
	}


	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public String upd_func_nm() {
		return getConstString(offset + 72, $upd_func_nm);
	}

	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public void upd_func_nm(String value) {
		setConstString(offset + 72, $upd_func_nm, value);
	}


	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public MCTimestamp upd_ts() {
		return getConstTimestamp(offset + 73, $upd_ts);
	}

	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public void upd_ts(MCTimestamp value) {
		setConstTimestamp(offset + 73, $upd_ts, value);
	}


	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public String upd_srv_req_no() {
		return getConstString(offset + 74, $upd_srv_req_no);
	}

	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public void upd_srv_req_no(String value) {
		setConstString(offset + 74, $upd_srv_req_no, value);
	}


	public MCNumber org_prms_base_unit_qty() {
		return getConstNumber(offset + 75, $org_prms_base_unit_qty);
	}

	public void org_prms_base_unit_qty(MCNumber value) {
		setConstNumber(offset + 75, $org_prms_base_unit_qty, value);
	}

	public void org_prms_base_unit_qty(int value) {
		setConstNumber(offset + 75, $org_prms_base_unit_qty, value);
	}

	public void org_prms_base_unit_qty(long value) {
		setConstNumber(offset + 75, $org_prms_base_unit_qty, value);
	}

	public void org_prms_base_unit_qty(float value) {
		setConstNumber(offset + 75, $org_prms_base_unit_qty, value);
	}

	public void org_prms_base_unit_qty(double value) {
		setConstNumber(offset + 75, $org_prms_base_unit_qty, value);
	}


	public String getString(String name) {
		if ($wg_rqst_prms_no.equalsIgnoreCase(name)) {
			return wg_rqst_prms_no();
		}
		if ($wg_rqst_no.equalsIgnoreCase(name)) {
			return wg_rqst_no();
		}
		if ($wg_rqst_typ.equalsIgnoreCase(name)) {
			return wg_rqst_typ();
		}
		if ($wg_rqst_typ_nm.equalsIgnoreCase(name)) {
			return wg_rqst_typ_nm();
		}
		if ($gr_loc_cd.equalsIgnoreCase(name)) {
			return gr_loc_cd();
		}
		if ($gr_loc_nm.equalsIgnoreCase(name)) {
			return gr_loc_nm();
		}
		if ($gr_wg_cd.equalsIgnoreCase(name)) {
			return gr_wg_cd();
		}
		if ($gr_wg_nm.equalsIgnoreCase(name)) {
			return gr_wg_nm();
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			return wg_nm();
		}
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
		if ($asset_mng_typ.equalsIgnoreCase(name)) {
			return asset_mng_typ();
		}
		if ($prms_trd_unit_cd.equalsIgnoreCase(name)) {
			return prms_trd_unit_cd();
		}
		if ($prms_trd_unit_nm.equalsIgnoreCase(name)) {
			return prms_trd_unit_nm();
		}
		if ($prms_trd_unit_rnd_typ.equalsIgnoreCase(name)) {
			return prms_trd_unit_rnd_typ();
		}
		if ($prms_base_unit_cd.equalsIgnoreCase(name)) {
			return prms_base_unit_cd();
		}
		if ($prms_base_unit_nm.equalsIgnoreCase(name)) {
			return prms_base_unit_nm();
		}
		if ($prms_base_unit_rnd_typ.equalsIgnoreCase(name)) {
			return prms_base_unit_rnd_typ();
		}
		if ($gi_loc_cd.equalsIgnoreCase(name)) {
			return gi_loc_cd();
		}
		if ($gi_loc_nm.equalsIgnoreCase(name)) {
			return gi_loc_nm();
		}
		if ($gi_str_ln_cd.equalsIgnoreCase(name)) {
			return gi_str_ln_cd();
		}
		if ($gi_str_ln_nm.equalsIgnoreCase(name)) {
			return gi_str_ln_nm();
		}
		if ($gi_wg_cd.equalsIgnoreCase(name)) {
			return gi_wg_cd();
		}
		if ($gi_wg_nm.equalsIgnoreCase(name)) {
			return gi_wg_nm();
		}
		if ($gi_lg_grp_cd.equalsIgnoreCase(name)) {
			return gi_lg_grp_cd();
		}
		if ($gi_lg_grp_nm.equalsIgnoreCase(name)) {
			return gi_lg_grp_nm();
		}
		if ($mfg_loc_cd.equalsIgnoreCase(name)) {
			return mfg_loc_cd();
		}
		if ($mfg_loc_nm.equalsIgnoreCase(name)) {
			return mfg_loc_nm();
		}
		if ($bom_ptn.equalsIgnoreCase(name)) {
			return bom_ptn();
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
		if ($prms_rmrks.equalsIgnoreCase(name)) {
			return prms_rmrks();
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
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($prms_trd_unit_dec_place.equalsIgnoreCase(name)) {
			return prms_trd_unit_dec_place();
		}
		if ($prms_trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			return prms_trd_unit_conv_base_qty();
		}
		if ($prms_trd_unit_conv_qty.equalsIgnoreCase(name)) {
			return prms_trd_unit_conv_qty();
		}
		if ($prms_trd_unit_qty.equalsIgnoreCase(name)) {
			return prms_trd_unit_qty();
		}
		if ($prms_base_unit_dec_place.equalsIgnoreCase(name)) {
			return prms_base_unit_dec_place();
		}
		if ($prms_base_unit_qty.equalsIgnoreCase(name)) {
			return prms_base_unit_qty();
		}
		if ($wg_rqst_prms_upd_cntr.equalsIgnoreCase(name)) {
			return wg_rqst_prms_upd_cntr();
		}
		if ($org_prms_base_unit_qty.equalsIgnoreCase(name)) {
			return org_prms_base_unit_qty();
		}
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		if ($fix_dt.equalsIgnoreCase(name)) {
			return fix_dt();
		}
		if ($prms_dt.equalsIgnoreCase(name)) {
			return prms_dt();
		}
		if ($re_prms_dt.equalsIgnoreCase(name)) {
			return re_prms_dt();
		}
		if ($gr_schd_dt.equalsIgnoreCase(name)) {
			return gr_schd_dt();
		}
		if ($gr_schd_hm.equalsIgnoreCase(name)) {
			return gr_schd_hm();
		}
		if ($gi_schd_dt.equalsIgnoreCase(name)) {
			return gi_schd_dt();
		}
		if ($gi_schd_hm.equalsIgnoreCase(name)) {
			return gi_schd_hm();
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
		if ($fix_flg.equalsIgnoreCase(name)) {
			return fix_flg();
		}
		if ($prms_ntc_flg.equalsIgnoreCase(name)) {
			return prms_ntc_flg();
		}
		if ($re_prms_ntc_flg.equalsIgnoreCase(name)) {
			return re_prms_ntc_flg();
		}
		if ($can_flg.equalsIgnoreCase(name)) {
			return can_flg();
		}
		if ($dscnt_itm_flg.equalsIgnoreCase(name)) {
			return dscnt_itm_flg();
		}
		if ($gi_str_ln_tgt_flg.equalsIgnoreCase(name)) {
			return gi_str_ln_tgt_flg();
		}
		if ($gi_str_ln_cd_none_flg.equalsIgnoreCase(name)) {
			return gi_str_ln_cd_none_flg();
		}
		if ($last_fix_flg.equalsIgnoreCase(name)) {
			return last_fix_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($wg_rqst_prms_no.equalsIgnoreCase(name)) {
			return wg_rqst_prms_no();
		}
		if ($wg_rqst_no.equalsIgnoreCase(name)) {
			return wg_rqst_no();
		}
		if ($wg_rqst_typ.equalsIgnoreCase(name)) {
			return wg_rqst_typ();
		}
		if ($wg_rqst_typ_nm.equalsIgnoreCase(name)) {
			return wg_rqst_typ_nm();
		}
		if ($gr_loc_cd.equalsIgnoreCase(name)) {
			return gr_loc_cd();
		}
		if ($gr_loc_nm.equalsIgnoreCase(name)) {
			return gr_loc_nm();
		}
		if ($gr_wg_cd.equalsIgnoreCase(name)) {
			return gr_wg_cd();
		}
		if ($gr_wg_nm.equalsIgnoreCase(name)) {
			return gr_wg_nm();
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			return wg_nm();
		}
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
		if ($asset_mng_typ.equalsIgnoreCase(name)) {
			return asset_mng_typ();
		}
		if ($prms_trd_unit_cd.equalsIgnoreCase(name)) {
			return prms_trd_unit_cd();
		}
		if ($prms_trd_unit_nm.equalsIgnoreCase(name)) {
			return prms_trd_unit_nm();
		}
		if ($prms_trd_unit_rnd_typ.equalsIgnoreCase(name)) {
			return prms_trd_unit_rnd_typ();
		}
		if ($prms_base_unit_cd.equalsIgnoreCase(name)) {
			return prms_base_unit_cd();
		}
		if ($prms_base_unit_nm.equalsIgnoreCase(name)) {
			return prms_base_unit_nm();
		}
		if ($prms_base_unit_rnd_typ.equalsIgnoreCase(name)) {
			return prms_base_unit_rnd_typ();
		}
		if ($gi_loc_cd.equalsIgnoreCase(name)) {
			return gi_loc_cd();
		}
		if ($gi_loc_nm.equalsIgnoreCase(name)) {
			return gi_loc_nm();
		}
		if ($gi_str_ln_cd.equalsIgnoreCase(name)) {
			return gi_str_ln_cd();
		}
		if ($gi_str_ln_nm.equalsIgnoreCase(name)) {
			return gi_str_ln_nm();
		}
		if ($gi_wg_cd.equalsIgnoreCase(name)) {
			return gi_wg_cd();
		}
		if ($gi_wg_nm.equalsIgnoreCase(name)) {
			return gi_wg_nm();
		}
		if ($gi_lg_grp_cd.equalsIgnoreCase(name)) {
			return gi_lg_grp_cd();
		}
		if ($gi_lg_grp_nm.equalsIgnoreCase(name)) {
			return gi_lg_grp_nm();
		}
		if ($mfg_loc_cd.equalsIgnoreCase(name)) {
			return mfg_loc_cd();
		}
		if ($mfg_loc_nm.equalsIgnoreCase(name)) {
			return mfg_loc_nm();
		}
		if ($bom_ptn.equalsIgnoreCase(name)) {
			return bom_ptn();
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
		if ($prms_rmrks.equalsIgnoreCase(name)) {
			return prms_rmrks();
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
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($prms_trd_unit_dec_place.equalsIgnoreCase(name)) {
			return prms_trd_unit_dec_place();
		}
		if ($prms_trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			return prms_trd_unit_conv_base_qty();
		}
		if ($prms_trd_unit_conv_qty.equalsIgnoreCase(name)) {
			return prms_trd_unit_conv_qty();
		}
		if ($prms_trd_unit_qty.equalsIgnoreCase(name)) {
			return prms_trd_unit_qty();
		}
		if ($prms_base_unit_dec_place.equalsIgnoreCase(name)) {
			return prms_base_unit_dec_place();
		}
		if ($prms_base_unit_qty.equalsIgnoreCase(name)) {
			return prms_base_unit_qty();
		}
		if ($wg_rqst_prms_upd_cntr.equalsIgnoreCase(name)) {
			return wg_rqst_prms_upd_cntr();
		}
		if ($org_prms_base_unit_qty.equalsIgnoreCase(name)) {
			return org_prms_base_unit_qty();
		}
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($fix_dt.equalsIgnoreCase(name)) {
			return fix_dt();
		}
		if ($prms_dt.equalsIgnoreCase(name)) {
			return prms_dt();
		}
		if ($re_prms_dt.equalsIgnoreCase(name)) {
			return re_prms_dt();
		}
		if ($gr_schd_dt.equalsIgnoreCase(name)) {
			return gr_schd_dt();
		}
		if ($gr_schd_hm.equalsIgnoreCase(name)) {
			return gr_schd_hm();
		}
		if ($gi_schd_dt.equalsIgnoreCase(name)) {
			return gi_schd_dt();
		}
		if ($gi_schd_hm.equalsIgnoreCase(name)) {
			return gi_schd_hm();
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
		if ($fix_flg.equalsIgnoreCase(name)) {
			return fix_flg();
		}
		if ($prms_ntc_flg.equalsIgnoreCase(name)) {
			return prms_ntc_flg();
		}
		if ($re_prms_ntc_flg.equalsIgnoreCase(name)) {
			return re_prms_ntc_flg();
		}
		if ($can_flg.equalsIgnoreCase(name)) {
			return can_flg();
		}
		if ($dscnt_itm_flg.equalsIgnoreCase(name)) {
			return dscnt_itm_flg();
		}
		if ($gi_str_ln_tgt_flg.equalsIgnoreCase(name)) {
			return gi_str_ln_tgt_flg();
		}
		if ($gi_str_ln_cd_none_flg.equalsIgnoreCase(name)) {
			return gi_str_ln_cd_none_flg();
		}
		if ($last_fix_flg.equalsIgnoreCase(name)) {
			return last_fix_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($wg_rqst_prms_no.equalsIgnoreCase(name)) {
			wg_rqst_prms_no(value);
			return;
		}
		if ($wg_rqst_no.equalsIgnoreCase(name)) {
			wg_rqst_no(value);
			return;
		}
		if ($wg_rqst_typ.equalsIgnoreCase(name)) {
			wg_rqst_typ(value);
			return;
		}
		if ($wg_rqst_typ_nm.equalsIgnoreCase(name)) {
			wg_rqst_typ_nm(value);
			return;
		}
		if ($gr_loc_cd.equalsIgnoreCase(name)) {
			gr_loc_cd(value);
			return;
		}
		if ($gr_loc_nm.equalsIgnoreCase(name)) {
			gr_loc_nm(value);
			return;
		}
		if ($gr_wg_cd.equalsIgnoreCase(name)) {
			gr_wg_cd(value);
			return;
		}
		if ($gr_wg_nm.equalsIgnoreCase(name)) {
			gr_wg_nm(value);
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
		if ($asset_mng_typ.equalsIgnoreCase(name)) {
			asset_mng_typ(value);
			return;
		}
		if ($prms_trd_unit_cd.equalsIgnoreCase(name)) {
			prms_trd_unit_cd(value);
			return;
		}
		if ($prms_trd_unit_nm.equalsIgnoreCase(name)) {
			prms_trd_unit_nm(value);
			return;
		}
		if ($prms_trd_unit_rnd_typ.equalsIgnoreCase(name)) {
			prms_trd_unit_rnd_typ(value);
			return;
		}
		if ($prms_base_unit_cd.equalsIgnoreCase(name)) {
			prms_base_unit_cd(value);
			return;
		}
		if ($prms_base_unit_nm.equalsIgnoreCase(name)) {
			prms_base_unit_nm(value);
			return;
		}
		if ($prms_base_unit_rnd_typ.equalsIgnoreCase(name)) {
			prms_base_unit_rnd_typ(value);
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
		if ($gi_str_ln_cd.equalsIgnoreCase(name)) {
			gi_str_ln_cd(value);
			return;
		}
		if ($gi_str_ln_nm.equalsIgnoreCase(name)) {
			gi_str_ln_nm(value);
			return;
		}
		if ($gi_wg_cd.equalsIgnoreCase(name)) {
			gi_wg_cd(value);
			return;
		}
		if ($gi_wg_nm.equalsIgnoreCase(name)) {
			gi_wg_nm(value);
			return;
		}
		if ($gi_lg_grp_cd.equalsIgnoreCase(name)) {
			gi_lg_grp_cd(value);
			return;
		}
		if ($gi_lg_grp_nm.equalsIgnoreCase(name)) {
			gi_lg_grp_nm(value);
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
		if ($bom_ptn.equalsIgnoreCase(name)) {
			bom_ptn(value);
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
		if ($prms_rmrks.equalsIgnoreCase(name)) {
			prms_rmrks(value);
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
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($prms_trd_unit_dec_place.equalsIgnoreCase(name)) {
			prms_trd_unit_dec_place(value);
			return;
		}
		if ($prms_trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			prms_trd_unit_conv_base_qty(value);
			return;
		}
		if ($prms_trd_unit_conv_qty.equalsIgnoreCase(name)) {
			prms_trd_unit_conv_qty(value);
			return;
		}
		if ($prms_trd_unit_qty.equalsIgnoreCase(name)) {
			prms_trd_unit_qty(value);
			return;
		}
		if ($prms_base_unit_dec_place.equalsIgnoreCase(name)) {
			prms_base_unit_dec_place(value);
			return;
		}
		if ($prms_base_unit_qty.equalsIgnoreCase(name)) {
			prms_base_unit_qty(value);
			return;
		}
		if ($wg_rqst_prms_upd_cntr.equalsIgnoreCase(name)) {
			wg_rqst_prms_upd_cntr(value);
			return;
		}
		if ($org_prms_base_unit_qty.equalsIgnoreCase(name)) {
			org_prms_base_unit_qty(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($prms_trd_unit_dec_place.equalsIgnoreCase(name)) {
			prms_trd_unit_dec_place(value);
			return;
		}
		if ($prms_trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			prms_trd_unit_conv_base_qty(value);
			return;
		}
		if ($prms_trd_unit_conv_qty.equalsIgnoreCase(name)) {
			prms_trd_unit_conv_qty(value);
			return;
		}
		if ($prms_trd_unit_qty.equalsIgnoreCase(name)) {
			prms_trd_unit_qty(value);
			return;
		}
		if ($prms_base_unit_dec_place.equalsIgnoreCase(name)) {
			prms_base_unit_dec_place(value);
			return;
		}
		if ($prms_base_unit_qty.equalsIgnoreCase(name)) {
			prms_base_unit_qty(value);
			return;
		}
		if ($wg_rqst_prms_upd_cntr.equalsIgnoreCase(name)) {
			wg_rqst_prms_upd_cntr(value);
			return;
		}
		if ($org_prms_base_unit_qty.equalsIgnoreCase(name)) {
			org_prms_base_unit_qty(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($prms_trd_unit_dec_place.equalsIgnoreCase(name)) {
			prms_trd_unit_dec_place(value);
			return;
		}
		if ($prms_trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			prms_trd_unit_conv_base_qty(value);
			return;
		}
		if ($prms_trd_unit_conv_qty.equalsIgnoreCase(name)) {
			prms_trd_unit_conv_qty(value);
			return;
		}
		if ($prms_trd_unit_qty.equalsIgnoreCase(name)) {
			prms_trd_unit_qty(value);
			return;
		}
		if ($prms_base_unit_dec_place.equalsIgnoreCase(name)) {
			prms_base_unit_dec_place(value);
			return;
		}
		if ($prms_base_unit_qty.equalsIgnoreCase(name)) {
			prms_base_unit_qty(value);
			return;
		}
		if ($wg_rqst_prms_upd_cntr.equalsIgnoreCase(name)) {
			wg_rqst_prms_upd_cntr(value);
			return;
		}
		if ($org_prms_base_unit_qty.equalsIgnoreCase(name)) {
			org_prms_base_unit_qty(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($prms_trd_unit_dec_place.equalsIgnoreCase(name)) {
			prms_trd_unit_dec_place(value);
			return;
		}
		if ($prms_trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			prms_trd_unit_conv_base_qty(value);
			return;
		}
		if ($prms_trd_unit_conv_qty.equalsIgnoreCase(name)) {
			prms_trd_unit_conv_qty(value);
			return;
		}
		if ($prms_trd_unit_qty.equalsIgnoreCase(name)) {
			prms_trd_unit_qty(value);
			return;
		}
		if ($prms_base_unit_dec_place.equalsIgnoreCase(name)) {
			prms_base_unit_dec_place(value);
			return;
		}
		if ($prms_base_unit_qty.equalsIgnoreCase(name)) {
			prms_base_unit_qty(value);
			return;
		}
		if ($wg_rqst_prms_upd_cntr.equalsIgnoreCase(name)) {
			wg_rqst_prms_upd_cntr(value);
			return;
		}
		if ($org_prms_base_unit_qty.equalsIgnoreCase(name)) {
			org_prms_base_unit_qty(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($prms_trd_unit_dec_place.equalsIgnoreCase(name)) {
			prms_trd_unit_dec_place(value);
			return;
		}
		if ($prms_trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			prms_trd_unit_conv_base_qty(value);
			return;
		}
		if ($prms_trd_unit_conv_qty.equalsIgnoreCase(name)) {
			prms_trd_unit_conv_qty(value);
			return;
		}
		if ($prms_trd_unit_qty.equalsIgnoreCase(name)) {
			prms_trd_unit_qty(value);
			return;
		}
		if ($prms_base_unit_dec_place.equalsIgnoreCase(name)) {
			prms_base_unit_dec_place(value);
			return;
		}
		if ($prms_base_unit_qty.equalsIgnoreCase(name)) {
			prms_base_unit_qty(value);
			return;
		}
		if ($wg_rqst_prms_upd_cntr.equalsIgnoreCase(name)) {
			wg_rqst_prms_upd_cntr(value);
			return;
		}
		if ($org_prms_base_unit_qty.equalsIgnoreCase(name)) {
			org_prms_base_unit_qty(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($fix_dt.equalsIgnoreCase(name)) {
			fix_dt(value);
			return;
		}
		if ($prms_dt.equalsIgnoreCase(name)) {
			prms_dt(value);
			return;
		}
		if ($re_prms_dt.equalsIgnoreCase(name)) {
			re_prms_dt(value);
			return;
		}
		if ($gr_schd_dt.equalsIgnoreCase(name)) {
			gr_schd_dt(value);
			return;
		}
		if ($gr_schd_hm.equalsIgnoreCase(name)) {
			gr_schd_hm(value);
			return;
		}
		if ($gi_schd_dt.equalsIgnoreCase(name)) {
			gi_schd_dt(value);
			return;
		}
		if ($gi_schd_hm.equalsIgnoreCase(name)) {
			gi_schd_hm(value);
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
		if ($fix_flg.equalsIgnoreCase(name)) {
			fix_flg(value);
			return;
		}
		if ($prms_ntc_flg.equalsIgnoreCase(name)) {
			prms_ntc_flg(value);
			return;
		}
		if ($re_prms_ntc_flg.equalsIgnoreCase(name)) {
			re_prms_ntc_flg(value);
			return;
		}
		if ($can_flg.equalsIgnoreCase(name)) {
			can_flg(value);
			return;
		}
		if ($dscnt_itm_flg.equalsIgnoreCase(name)) {
			dscnt_itm_flg(value);
			return;
		}
		if ($gi_str_ln_tgt_flg.equalsIgnoreCase(name)) {
			gi_str_ln_tgt_flg(value);
			return;
		}
		if ($gi_str_ln_cd_none_flg.equalsIgnoreCase(name)) {
			gi_str_ln_cd_none_flg(value);
			return;
		}
		if ($last_fix_flg.equalsIgnoreCase(name)) {
			last_fix_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($wg_rqst_prms_no.equalsIgnoreCase(name)) {
			wg_rqst_prms_no(value);
			return;
		}
		if ($wg_rqst_no.equalsIgnoreCase(name)) {
			wg_rqst_no(value);
			return;
		}
		if ($wg_rqst_typ.equalsIgnoreCase(name)) {
			wg_rqst_typ(value);
			return;
		}
		if ($wg_rqst_typ_nm.equalsIgnoreCase(name)) {
			wg_rqst_typ_nm(value);
			return;
		}
		if ($gr_loc_cd.equalsIgnoreCase(name)) {
			gr_loc_cd(value);
			return;
		}
		if ($gr_loc_nm.equalsIgnoreCase(name)) {
			gr_loc_nm(value);
			return;
		}
		if ($gr_wg_cd.equalsIgnoreCase(name)) {
			gr_wg_cd(value);
			return;
		}
		if ($gr_wg_nm.equalsIgnoreCase(name)) {
			gr_wg_nm(value);
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
		if ($asset_mng_typ.equalsIgnoreCase(name)) {
			asset_mng_typ(value);
			return;
		}
		if ($prms_trd_unit_cd.equalsIgnoreCase(name)) {
			prms_trd_unit_cd(value);
			return;
		}
		if ($prms_trd_unit_nm.equalsIgnoreCase(name)) {
			prms_trd_unit_nm(value);
			return;
		}
		if ($prms_trd_unit_rnd_typ.equalsIgnoreCase(name)) {
			prms_trd_unit_rnd_typ(value);
			return;
		}
		if ($prms_base_unit_cd.equalsIgnoreCase(name)) {
			prms_base_unit_cd(value);
			return;
		}
		if ($prms_base_unit_nm.equalsIgnoreCase(name)) {
			prms_base_unit_nm(value);
			return;
		}
		if ($prms_base_unit_rnd_typ.equalsIgnoreCase(name)) {
			prms_base_unit_rnd_typ(value);
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
		if ($gi_str_ln_cd.equalsIgnoreCase(name)) {
			gi_str_ln_cd(value);
			return;
		}
		if ($gi_str_ln_nm.equalsIgnoreCase(name)) {
			gi_str_ln_nm(value);
			return;
		}
		if ($gi_wg_cd.equalsIgnoreCase(name)) {
			gi_wg_cd(value);
			return;
		}
		if ($gi_wg_nm.equalsIgnoreCase(name)) {
			gi_wg_nm(value);
			return;
		}
		if ($gi_lg_grp_cd.equalsIgnoreCase(name)) {
			gi_lg_grp_cd(value);
			return;
		}
		if ($gi_lg_grp_nm.equalsIgnoreCase(name)) {
			gi_lg_grp_nm(value);
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
		if ($bom_ptn.equalsIgnoreCase(name)) {
			bom_ptn(value);
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
		if ($prms_rmrks.equalsIgnoreCase(name)) {
			prms_rmrks(value);
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
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($prms_trd_unit_dec_place.equalsIgnoreCase(name)) {
			prms_trd_unit_dec_place(value);
			return;
		}
		if ($prms_trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			prms_trd_unit_conv_base_qty(value);
			return;
		}
		if ($prms_trd_unit_conv_qty.equalsIgnoreCase(name)) {
			prms_trd_unit_conv_qty(value);
			return;
		}
		if ($prms_trd_unit_qty.equalsIgnoreCase(name)) {
			prms_trd_unit_qty(value);
			return;
		}
		if ($prms_base_unit_dec_place.equalsIgnoreCase(name)) {
			prms_base_unit_dec_place(value);
			return;
		}
		if ($prms_base_unit_qty.equalsIgnoreCase(name)) {
			prms_base_unit_qty(value);
			return;
		}
		if ($wg_rqst_prms_upd_cntr.equalsIgnoreCase(name)) {
			wg_rqst_prms_upd_cntr(value);
			return;
		}
		if ($org_prms_base_unit_qty.equalsIgnoreCase(name)) {
			org_prms_base_unit_qty(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($prms_trd_unit_dec_place.equalsIgnoreCase(name)) {
			prms_trd_unit_dec_place(value);
			return;
		}
		if ($prms_trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			prms_trd_unit_conv_base_qty(value);
			return;
		}
		if ($prms_trd_unit_conv_qty.equalsIgnoreCase(name)) {
			prms_trd_unit_conv_qty(value);
			return;
		}
		if ($prms_trd_unit_qty.equalsIgnoreCase(name)) {
			prms_trd_unit_qty(value);
			return;
		}
		if ($prms_base_unit_dec_place.equalsIgnoreCase(name)) {
			prms_base_unit_dec_place(value);
			return;
		}
		if ($prms_base_unit_qty.equalsIgnoreCase(name)) {
			prms_base_unit_qty(value);
			return;
		}
		if ($wg_rqst_prms_upd_cntr.equalsIgnoreCase(name)) {
			wg_rqst_prms_upd_cntr(value);
			return;
		}
		if ($org_prms_base_unit_qty.equalsIgnoreCase(name)) {
			org_prms_base_unit_qty(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($prms_trd_unit_dec_place.equalsIgnoreCase(name)) {
			prms_trd_unit_dec_place(value);
			return;
		}
		if ($prms_trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			prms_trd_unit_conv_base_qty(value);
			return;
		}
		if ($prms_trd_unit_conv_qty.equalsIgnoreCase(name)) {
			prms_trd_unit_conv_qty(value);
			return;
		}
		if ($prms_trd_unit_qty.equalsIgnoreCase(name)) {
			prms_trd_unit_qty(value);
			return;
		}
		if ($prms_base_unit_dec_place.equalsIgnoreCase(name)) {
			prms_base_unit_dec_place(value);
			return;
		}
		if ($prms_base_unit_qty.equalsIgnoreCase(name)) {
			prms_base_unit_qty(value);
			return;
		}
		if ($wg_rqst_prms_upd_cntr.equalsIgnoreCase(name)) {
			wg_rqst_prms_upd_cntr(value);
			return;
		}
		if ($org_prms_base_unit_qty.equalsIgnoreCase(name)) {
			org_prms_base_unit_qty(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($prms_trd_unit_dec_place.equalsIgnoreCase(name)) {
			prms_trd_unit_dec_place(value);
			return;
		}
		if ($prms_trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			prms_trd_unit_conv_base_qty(value);
			return;
		}
		if ($prms_trd_unit_conv_qty.equalsIgnoreCase(name)) {
			prms_trd_unit_conv_qty(value);
			return;
		}
		if ($prms_trd_unit_qty.equalsIgnoreCase(name)) {
			prms_trd_unit_qty(value);
			return;
		}
		if ($prms_base_unit_dec_place.equalsIgnoreCase(name)) {
			prms_base_unit_dec_place(value);
			return;
		}
		if ($prms_base_unit_qty.equalsIgnoreCase(name)) {
			prms_base_unit_qty(value);
			return;
		}
		if ($wg_rqst_prms_upd_cntr.equalsIgnoreCase(name)) {
			wg_rqst_prms_upd_cntr(value);
			return;
		}
		if ($org_prms_base_unit_qty.equalsIgnoreCase(name)) {
			org_prms_base_unit_qty(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($prms_trd_unit_dec_place.equalsIgnoreCase(name)) {
			prms_trd_unit_dec_place(value);
			return;
		}
		if ($prms_trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			prms_trd_unit_conv_base_qty(value);
			return;
		}
		if ($prms_trd_unit_conv_qty.equalsIgnoreCase(name)) {
			prms_trd_unit_conv_qty(value);
			return;
		}
		if ($prms_trd_unit_qty.equalsIgnoreCase(name)) {
			prms_trd_unit_qty(value);
			return;
		}
		if ($prms_base_unit_dec_place.equalsIgnoreCase(name)) {
			prms_base_unit_dec_place(value);
			return;
		}
		if ($prms_base_unit_qty.equalsIgnoreCase(name)) {
			prms_base_unit_qty(value);
			return;
		}
		if ($wg_rqst_prms_upd_cntr.equalsIgnoreCase(name)) {
			wg_rqst_prms_upd_cntr(value);
			return;
		}
		if ($org_prms_base_unit_qty.equalsIgnoreCase(name)) {
			org_prms_base_unit_qty(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($fix_dt.equalsIgnoreCase(name)) {
			fix_dt(value);
			return;
		}
		if ($prms_dt.equalsIgnoreCase(name)) {
			prms_dt(value);
			return;
		}
		if ($re_prms_dt.equalsIgnoreCase(name)) {
			re_prms_dt(value);
			return;
		}
		if ($gr_schd_dt.equalsIgnoreCase(name)) {
			gr_schd_dt(value);
			return;
		}
		if ($gr_schd_hm.equalsIgnoreCase(name)) {
			gr_schd_hm(value);
			return;
		}
		if ($gi_schd_dt.equalsIgnoreCase(name)) {
			gi_schd_dt(value);
			return;
		}
		if ($gi_schd_hm.equalsIgnoreCase(name)) {
			gi_schd_hm(value);
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
		if ($fix_flg.equalsIgnoreCase(name)) {
			fix_flg(value);
			return;
		}
		if ($prms_ntc_flg.equalsIgnoreCase(name)) {
			prms_ntc_flg(value);
			return;
		}
		if ($re_prms_ntc_flg.equalsIgnoreCase(name)) {
			re_prms_ntc_flg(value);
			return;
		}
		if ($can_flg.equalsIgnoreCase(name)) {
			can_flg(value);
			return;
		}
		if ($dscnt_itm_flg.equalsIgnoreCase(name)) {
			dscnt_itm_flg(value);
			return;
		}
		if ($gi_str_ln_tgt_flg.equalsIgnoreCase(name)) {
			gi_str_ln_tgt_flg(value);
			return;
		}
		if ($gi_str_ln_cd_none_flg.equalsIgnoreCase(name)) {
			gi_str_ln_cd_none_flg(value);
			return;
		}
		if ($last_fix_flg.equalsIgnoreCase(name)) {
			last_fix_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

