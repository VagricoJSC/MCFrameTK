package mcframe.clientMSBC.MSBCP0290;

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
 * ブロック"RsltDisp"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class RsltDispR_MC_A extends MCConstRow {

	/**
	 * Item order No. 品目オーダＮＯ.<p>
	 *
	 */
	public static final String $itm_ord_no = "itm_ord_no";
	/**
	 * Order type オーダ区分.<p>
	 *
	 */
	public static final String $itm_ord_typ = "itm_ord_typ";
	/**
	 * Order type name オーダ区分名.<p>
	 *
	 */
	public static final String $itm_ord_typ_nm = "itm_ord_typ_nm";
	/**
	 * Load status type for the item order 品目オーダ負荷状況区分.<p>
	 *
	 */
	public static final String $itm_ord_ld_sts_typ = "itm_ord_ld_sts_typ";
	/**
	 * Load status type name for the item order 品目オーダ負荷状況区分名.<p>
	 *
	 */
	public static final String $itm_ord_ld_sts_typ_nm = "itm_ord_ld_sts_typ_nm";
	public static final String $itm_p = "itm_p";
	/**
	 * Mfg. start date 製造着手日.<p>
	 *
	 */
	public static final String $mfg_st_dt = "mfg_st_dt";
	/**
	 * Mfg. end date 製造終了日.<p>
	 *
	 */
	public static final String $mfg_end_dt = "mfg_end_dt";
	/**
	 * Mfg. LT 製造ＬＴ.<p>
	 *
	 */
	public static final String $mfg_lt = "mfg_lt";
	public static final String $inst_qty_p = "inst_qty_p";
	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public static final String $unit_cd = "unit_cd";
	/**
	 * Base unit name 基準単位名.<p>
	 *
	 */
	public static final String $unit_nm = "unit_nm";
	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public static final String $dec_place = "dec_place";
	/**
	 * Resource cd. 1 資源ＣＤ１.<p>
	 *
	 */
	public static final String $rsrc_cd1 = "rsrc_cd1";
	/**
	 * Resource name 1 資源名１.<p>
	 *
	 */
	public static final String $rsrc_nm1 = "rsrc_nm1";
	public static final String $rsrc_act_qty1_p = "rsrc_act_qty1_p";
	/**
	 * Resource unit name 1 資源単位名１.<p>
	 *
	 */
	public static final String $rsrc_unit_nm1 = "rsrc_unit_nm1";
	/**
	 * Resource number of decimal places 1 資源小数部有効桁数１.<p>
	 *
	 */
	public static final String $rsrc_dec_place1 = "rsrc_dec_place1";
	/**
	 * Rounding type 1 端数処理区分１.<p>
	 *
	 */
	public static final String $rsrc_rnd_typ1 = "rsrc_rnd_typ1";
	/**
	 * Resource cd. 2 資源ＣＤ２.<p>
	 *
	 */
	public static final String $rsrc_cd2 = "rsrc_cd2";
	/**
	 * Resource name 2 資源名２.<p>
	 *
	 */
	public static final String $rsrc_nm2 = "rsrc_nm2";
	public static final String $rsrc_act_qty2_p = "rsrc_act_qty2_p";
	/**
	 * Resource unit name 2 資源単位名２.<p>
	 *
	 */
	public static final String $rsrc_unit_nm2 = "rsrc_unit_nm2";
	/**
	 * Resource number of decimal places 2 資源小数部有効桁数２.<p>
	 *
	 */
	public static final String $rsrc_dec_place2 = "rsrc_dec_place2";
	/**
	 * Rounding type 2 端数処理区分２.<p>
	 *
	 */
	public static final String $rsrc_rnd_typ2 = "rsrc_rnd_typ2";
	public static final String $sno_wrk_no_p = "sno_wrk_no_p";
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
	 * Storage location cd. 格納場所ＣＤ.<p>
	 *
	 */
	public static final String $strg_loc_cd = "strg_loc_cd";
	/**
	 * Storage location name 格納場所名.<p>
	 *
	 */
	public static final String $strg_loc_nm = "strg_loc_nm";
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
	 * Disallow procurement 手配不許可.<p>
	 *
	 */
	public static final String $not_fix_flg = "not_fix_flg";
	/**
	 * Master application date マスタ適用日.<p>
	 *
	 */
	public static final String $master_dt = "master_dt";
	/**
	 * Requirements No. 所要ＮＯ.<p>
	 *
	 */
	public static final String $rqmt_no = "rqmt_no";
	/**
	 * GR/GI progress management No. 受払進捗管理ＮＯ.<p>
	 *
	 */
	public static final String $io_schd_pr_no = "io_schd_pr_no";
	/**
	 * Order/PO contact remarks 指図・発注連絡備考.<p>
	 *
	 */
	public static final String $inst_po_cnt_rmrks = "inst_po_cnt_rmrks";
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
	 * Item 品目.<p>
	 *
	 */
	public static final String $disp_itm_cd = "disp_itm_cd";
	/**
	 * SEIBAN No. 手配ＮＯ.<p>
	 *
	 */
	public static final String $disp_sno = "disp_sno";
	/**
	 * Record ID レコードＩＤ.<p>
	 *
	 */
	public static final String $record_id = "record_id";
	/**
	 * Record group ID レコードグループＩＤ.<p>
	 *
	 */
	public static final String $record_grp_id = "record_grp_id";
	/**
	 * Load status type for the item order before change 変更前品目オーダ負荷状況区分.<p>
	 *
	 */
	public static final String $old_itm_ord_ld_sts_typ = "old_itm_ord_ld_sts_typ";
	/**
	 * Load status type name for the item order before change 変更前品目オーダ負荷状況区分名.<p>
	 *
	 */
	public static final String $old_itm_ord_ld_sts_typ_nm = "old_itm_ord_ld_sts_typ_nm";
	/**
	 * Mfg. start date before change 変更前製造着手日.<p>
	 *
	 */
	public static final String $old_mfg_st_dt = "old_mfg_st_dt";
	/**
	 * Mfg. end date before change 変更前製造終了日.<p>
	 *
	 */
	public static final String $old_mfg_end_dt = "old_mfg_end_dt";
	/**
	 * LT for Gantt display ガント表示用ＬＴ.<p>
	 *
	 */
	public static final String $gantt_lt = "gantt_lt";

	public static final String $itm_cd = $itm_p + ".itm_cd";
	public static final String $itm_sub1 = $itm_p + ".itm_sub1";
	public static final String $itm_sub2 = $itm_p + ".itm_sub2";
	public static final String $itm_sub3 = $itm_p + ".itm_sub3";
	public static final String $itm_nm = $itm_p + ".itm_nm";
	public static final String $qty = $inst_qty_p + ".qty";
	public static final String $rsrc_act_qty1 = $rsrc_act_qty1_p + ".qty";
	public static final String $rsrc_act_qty2 = $rsrc_act_qty2_p + ".qty";
	public static final String $sno1 = $sno_wrk_no_p + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno1 + "";
	public static final String $sno2 = $sno_wrk_no_p + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno2 + "";
	public static final String $sno3 = $sno_wrk_no_p + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno3 + "";
	public static final String $sno4 = $sno_wrk_no_p + "." + mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.$sno4 + "";
	public static final String $wrk_no = $sno_wrk_no_p + ".wrk_no";
	public static final String $wrk_nm = $sno_wrk_no_p + ".wrk_nm";
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

	public static final MCMeta itm_ord_no_META = createCommonMeta($itm_ord_no, mcframe.commonMA.meta.MA_META.ITM_ORD_NO);
	public static final MCMeta itm_ord_typ_META = createCommonMeta($itm_ord_typ, mcframe.commonMS.meta.MS_META.ITM_ORD_TYP);
	public static final MCMeta itm_ord_typ_nm_META = createCommonMeta($itm_ord_typ_nm, mcframe.commonMS.meta.MS_META.ITM_ORD_TYP_NM);
	public static final MCMeta itm_ord_ld_sts_typ_META = createCommonMeta($itm_ord_ld_sts_typ, mcframe.commonMS.meta.MS_META.ITM_ORD_LD_STS_TYP);
	public static final MCMeta itm_ord_ld_sts_typ_nm_META = createCommonMeta($itm_ord_ld_sts_typ_nm, mcframe.commonMS.meta.MS_META.ITM_ORD_LD_STS_TYP_NM);
	public static final MCMeta itm_p_META = createInnerRowMeta($itm_p, mcframe.clientMAUB.MAUBP5030.ItmR.class);
	public static final MCMeta mfg_st_dt_META = createCommonMeta($mfg_st_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta mfg_end_dt_META = createCommonMeta($mfg_end_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta mfg_lt_META = createCommonMeta($mfg_lt, mcframe.commonMA.meta.MA_META.LT);
	public static final MCMeta inst_qty_p_META = createInnerRowMeta($inst_qty_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta unit_cd_META = createCommonMeta($unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta unit_nm_META = createCommonMeta($unit_nm, mcframe.commonMA.meta.MA_META.UNIT_NM);
	public static final MCMeta dec_place_META = createCommonMeta($dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta rsrc_cd1_META = createCommonMeta($rsrc_cd1, mcframe.commonMA.meta.MA_META.RSRC_CD);
	public static final MCMeta rsrc_nm1_META = createCommonMeta($rsrc_nm1, mcframe.commonMA.meta.MA_META.RSRC_NM);
	public static final MCMeta rsrc_act_qty1_p_META = createInnerRowMeta($rsrc_act_qty1_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta rsrc_unit_nm1_META = createCommonMeta($rsrc_unit_nm1, mcframe.commonMA.meta.MA_META.RSRC_UNIT_NM);
	public static final MCMeta rsrc_dec_place1_META = createCommonMeta($rsrc_dec_place1, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta rsrc_rnd_typ1_META = createCommonMeta($rsrc_rnd_typ1, mcframe.commonMA.meta.MA_META.RND_TYP);
	public static final MCMeta rsrc_cd2_META = createCommonMeta($rsrc_cd2, mcframe.commonMA.meta.MA_META.RSRC_CD);
	public static final MCMeta rsrc_nm2_META = createCommonMeta($rsrc_nm2, mcframe.commonMA.meta.MA_META.RSRC_NM);
	public static final MCMeta rsrc_act_qty2_p_META = createInnerRowMeta($rsrc_act_qty2_p, mcframe.clientMAUB.MAUBP5040.QtyR.class);
	public static final MCMeta rsrc_unit_nm2_META = createCommonMeta($rsrc_unit_nm2, mcframe.commonMA.meta.MA_META.RSRC_UNIT_NM);
	public static final MCMeta rsrc_dec_place2_META = createCommonMeta($rsrc_dec_place2, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta rsrc_rnd_typ2_META = createCommonMeta($rsrc_rnd_typ2, mcframe.commonMA.meta.MA_META.RND_TYP);
	public static final MCMeta sno_wrk_no_p_META = createInnerRowMeta($sno_wrk_no_p, mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.class);
	public static final MCMeta mfg_loc_cd_META = createCommonMeta($mfg_loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta mfg_loc_nm_META = createCommonMeta($mfg_loc_nm, mcframe.commonMA.meta.MA_META.LOC_NM);
	public static final MCMeta bom_ptn_META = createCommonMeta($bom_ptn, mcframe.commonMA.meta.MA_META.BOM_PTN);
	public static final MCMeta strg_loc_cd_META = createCommonMeta($strg_loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta strg_loc_nm_META = createCommonMeta($strg_loc_nm, mcframe.commonMA.meta.MA_META.LOC_NM);
	public static final MCMeta wg_cd_META = createCommonMeta($wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta wg_nm_META = createCommonMeta($wg_nm, mcframe.commonMA.meta.MA_META.WG_NM);
	public static final MCMeta not_fix_flg_META = createCommonMeta($not_fix_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta master_dt_META = createCommonMeta($master_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta rqmt_no_META = createCommonMeta($rqmt_no, mcframe.commonMA.meta.MA_META.RQMT_NO);
	public static final MCMeta io_schd_pr_no_META = createCommonMeta($io_schd_pr_no, mcframe.commonMA.meta.MA_META.IO_SCHD_PR_NO);
	public static final MCMeta inst_po_cnt_rmrks_META = createCommonMeta($inst_po_cnt_rmrks, mcframe.commonMS.meta.MS_META.INST_PO_CNT_RMRKS);
	public static final MCMeta intr_rmrks_META = createCommonMeta($intr_rmrks, mcframe.commonMS.meta.MS_META.IORD_INTR_RMRKS);
	public static final MCMeta sub_char1_META = createCommonMeta($sub_char1, mcframe.commonMS.meta.MS_META.IORD_SUB_CHAR1);
	public static final MCMeta sub_char2_META = createCommonMeta($sub_char2, mcframe.commonMS.meta.MS_META.IORD_SUB_CHAR2);
	public static final MCMeta sub_char3_META = createCommonMeta($sub_char3, mcframe.commonMS.meta.MS_META.IORD_SUB_CHAR3);
	public static final MCMeta itm_grp_p_META = createInnerRowMeta($itm_grp_p, mcframe.clientMAUB.MAUBP5170.ItmGrpR.class);
	public static final MCMeta ins_usr_id_META = createCommonMeta($ins_usr_id, mcframe.commonMA.meta.MA_META.FCM_USR_ID);
	public static final MCMeta ins_usr_nm_META = createCommonMeta($ins_usr_nm, mcframe.commonMA.meta.MA_META.FCM_USR_NM);
	public static final MCMeta ins_func_id_META = createCommonMeta($ins_func_id, mcframe.commonMA.meta.MA_META.FUNC_ID);
	public static final MCMeta ins_func_nm_META = createCommonMeta($ins_func_nm, mcframe.commonMA.meta.MA_META.FUNC_NM);
	public static final MCMeta ins_ts_META = createCommonMeta($ins_ts, mcframe.commonMA.meta.MA_META.SYS_TS);
	public static final MCMeta upd_cntr_META = createCommonMeta($upd_cntr, mcframe.commonMA.meta.MA_META.UPD_CNT);
	public static final MCMeta upd_usr_id_META = createCommonMeta($upd_usr_id, mcframe.commonMA.meta.MA_META.FCM_USR_ID);
	public static final MCMeta upd_usr_nm_META = createCommonMeta($upd_usr_nm, mcframe.commonMA.meta.MA_META.FCM_USR_NM);
	public static final MCMeta upd_func_id_META = createCommonMeta($upd_func_id, mcframe.commonMA.meta.MA_META.FUNC_ID);
	public static final MCMeta upd_func_nm_META = createCommonMeta($upd_func_nm, mcframe.commonMA.meta.MA_META.FUNC_NM);
	public static final MCMeta upd_ts_META = createCommonMeta($upd_ts, mcframe.commonMA.meta.MA_META.SYS_TS);
	public static final MCMeta upd_srv_req_no_META = createCommonMeta($upd_srv_req_no, mcframe.commonMA.meta.MA_META.SRV_REQ_NO);
	public static final MCMeta disp_itm_cd_META = createStringMeta($disp_itm_cd);
	public static final MCMeta disp_sno_META = createStringMeta($disp_sno);
	public static final MCMeta record_id_META = createStringMeta($record_id);
	public static final MCMeta record_grp_id_META = createStringMeta($record_grp_id);
	public static final MCMeta old_itm_ord_ld_sts_typ_META = createCommonMeta($old_itm_ord_ld_sts_typ, mcframe.commonMS.meta.MS_META.ITM_ORD_LD_STS_TYP);
	public static final MCMeta old_itm_ord_ld_sts_typ_nm_META = createCommonMeta($old_itm_ord_ld_sts_typ_nm, mcframe.commonMS.meta.MS_META.ITM_ORD_LD_STS_TYP_NM);
	public static final MCMeta old_mfg_st_dt_META = createCommonMeta($old_mfg_st_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta old_mfg_end_dt_META = createCommonMeta($old_mfg_end_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta gantt_lt_META = createCommonMeta($gantt_lt, mcframe.commonMA.meta.MA_META.LT);

	protected static final ConstMetaList<RsltDispR> constMetas = new ConstMetaList<RsltDispR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			itm_ord_no_META,
			itm_ord_typ_META,
			itm_ord_typ_nm_META,
			itm_ord_ld_sts_typ_META,
			itm_ord_ld_sts_typ_nm_META,
			itm_p_META,
			mfg_st_dt_META,
			mfg_end_dt_META,
			mfg_lt_META,
			inst_qty_p_META,
			unit_cd_META,
			unit_nm_META,
			dec_place_META,
			rsrc_cd1_META,
			rsrc_nm1_META,
			rsrc_act_qty1_p_META,
			rsrc_unit_nm1_META,
			rsrc_dec_place1_META,
			rsrc_rnd_typ1_META,
			rsrc_cd2_META,
			rsrc_nm2_META,
			rsrc_act_qty2_p_META,
			rsrc_unit_nm2_META,
			rsrc_dec_place2_META,
			rsrc_rnd_typ2_META,
			sno_wrk_no_p_META,
			mfg_loc_cd_META,
			mfg_loc_nm_META,
			bom_ptn_META,
			strg_loc_cd_META,
			strg_loc_nm_META,
			wg_cd_META,
			wg_nm_META,
			not_fix_flg_META,
			master_dt_META,
			rqmt_no_META,
			io_schd_pr_no_META,
			inst_po_cnt_rmrks_META,
			intr_rmrks_META,
			sub_char1_META,
			sub_char2_META,
			sub_char3_META,
			itm_grp_p_META,
			ins_usr_id_META,
			ins_usr_nm_META,
			ins_func_id_META,
			ins_func_nm_META,
			ins_ts_META,
			upd_cntr_META,
			upd_usr_id_META,
			upd_usr_nm_META,
			upd_func_id_META,
			upd_func_nm_META,
			upd_ts_META,
			upd_srv_req_no_META,
			disp_itm_cd_META,
			disp_sno_META,
			record_id_META,
			record_grp_id_META,
			old_itm_ord_ld_sts_typ_META,
			old_itm_ord_ld_sts_typ_nm_META,
			old_mfg_st_dt_META,
			old_mfg_end_dt_META,
			gantt_lt_META
		},
		new String[][]{
			{
				"itm_cd",
				"itm_sub1",
				"itm_sub2",
				"itm_sub3",
				"itm_nm",
				"qty",
				"rsrc_act_qty1",
				"rsrc_act_qty2",
				"sno1",
				"sno2",
				"sno3",
				"sno4",
				"wrk_no",
				"wrk_nm",
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
				$qty,
				$rsrc_act_qty1,
				$rsrc_act_qty2,
				$sno1,
				$sno2,
				$sno3,
				$sno4,
				$wrk_no,
				$wrk_nm,
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
	protected RsltDispR_MC_A(ConstMetaList<? extends RsltDispR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public RsltDispR clone() {
		return (RsltDispR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public RsltDispR createInstance() {
		return (RsltDispR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public RsltDispR getValues(String... names) {
		return (RsltDispR) super.getValues(names);
	}



	/**
	 * Item order No. 品目オーダＮＯ.<p>
	 *
	 */
	public String itm_ord_no() {
		return getConstString(offset + 0, $itm_ord_no);
	}

	/**
	 * Item order No. 品目オーダＮＯ.<p>
	 *
	 */
	public void itm_ord_no(String value) {
		setConstString(offset + 0, $itm_ord_no, value);
	}


	/**
	 * Order type オーダ区分.<p>
	 *
	 */
	public String itm_ord_typ() {
		return getConstString(offset + 1, $itm_ord_typ);
	}

	/**
	 * Order type オーダ区分.<p>
	 *
	 */
	public void itm_ord_typ(String value) {
		setConstString(offset + 1, $itm_ord_typ, value);
	}


	/**
	 * Order type name オーダ区分名.<p>
	 *
	 */
	public String itm_ord_typ_nm() {
		return getConstString(offset + 2, $itm_ord_typ_nm);
	}

	/**
	 * Order type name オーダ区分名.<p>
	 *
	 */
	public void itm_ord_typ_nm(String value) {
		setConstString(offset + 2, $itm_ord_typ_nm, value);
	}


	/**
	 * Load status type for the item order 品目オーダ負荷状況区分.<p>
	 *
	 */
	public String itm_ord_ld_sts_typ() {
		return getConstString(offset + 3, $itm_ord_ld_sts_typ);
	}

	/**
	 * Load status type for the item order 品目オーダ負荷状況区分.<p>
	 *
	 */
	public void itm_ord_ld_sts_typ(String value) {
		setConstString(offset + 3, $itm_ord_ld_sts_typ, value);
	}


	/**
	 * Load status type name for the item order 品目オーダ負荷状況区分名.<p>
	 *
	 */
	public String itm_ord_ld_sts_typ_nm() {
		return getConstString(offset + 4, $itm_ord_ld_sts_typ_nm);
	}

	/**
	 * Load status type name for the item order 品目オーダ負荷状況区分名.<p>
	 *
	 */
	public void itm_ord_ld_sts_typ_nm(String value) {
		setConstString(offset + 4, $itm_ord_ld_sts_typ_nm, value);
	}


	public mcframe.clientMAUB.MAUBP5030.ItmR itm_p(){
		return (mcframe.clientMAUB.MAUBP5030.ItmR) getConstInnerRow(offset + 5, $itm_p);
	}
	
	public void itm_p(mcframe.clientMAUB.MAUBP5030.ItmR row){
		setConstInnerRow(offset + 5, $itm_p, row);
	}


	/**
	 * Mfg. start date 製造着手日.<p>
	 *
	 */
	public MCDate mfg_st_dt() {
		return getConstDate(offset + 6, $mfg_st_dt);
	}

	/**
	 * Mfg. start date 製造着手日.<p>
	 *
	 */
	public void mfg_st_dt(MCDate value) {
		setConstDate(offset + 6, $mfg_st_dt, value);
	}


	/**
	 * Mfg. end date 製造終了日.<p>
	 *
	 */
	public MCDate mfg_end_dt() {
		return getConstDate(offset + 7, $mfg_end_dt);
	}

	/**
	 * Mfg. end date 製造終了日.<p>
	 *
	 */
	public void mfg_end_dt(MCDate value) {
		setConstDate(offset + 7, $mfg_end_dt, value);
	}


	/**
	 * Mfg. LT 製造ＬＴ.<p>
	 *
	 */
	public MCNumber mfg_lt() {
		return getConstNumber(offset + 8, $mfg_lt);
	}

	/**
	 * Mfg. LT 製造ＬＴ.<p>
	 *
	 */
	public void mfg_lt(MCNumber value) {
		setConstNumber(offset + 8, $mfg_lt, value);
	}

	/**
	 * Mfg. LT 製造ＬＴ.<p>
	 *
	 */
	public void mfg_lt(int value) {
		setConstNumber(offset + 8, $mfg_lt, value);
	}

	/**
	 * Mfg. LT 製造ＬＴ.<p>
	 *
	 */
	public void mfg_lt(long value) {
		setConstNumber(offset + 8, $mfg_lt, value);
	}

	/**
	 * Mfg. LT 製造ＬＴ.<p>
	 *
	 */
	public void mfg_lt(float value) {
		setConstNumber(offset + 8, $mfg_lt, value);
	}

	/**
	 * Mfg. LT 製造ＬＴ.<p>
	 *
	 */
	public void mfg_lt(double value) {
		setConstNumber(offset + 8, $mfg_lt, value);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR inst_qty_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 9, $inst_qty_p);
	}
	
	public void inst_qty_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 9, $inst_qty_p, row);
	}


	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public String unit_cd() {
		return getConstString(offset + 10, $unit_cd);
	}

	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public void unit_cd(String value) {
		setConstString(offset + 10, $unit_cd, value);
	}


	/**
	 * Base unit name 基準単位名.<p>
	 *
	 */
	public String unit_nm() {
		return getConstString(offset + 11, $unit_nm);
	}

	/**
	 * Base unit name 基準単位名.<p>
	 *
	 */
	public void unit_nm(String value) {
		setConstString(offset + 11, $unit_nm, value);
	}


	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public MCNumber dec_place() {
		return getConstNumber(offset + 12, $dec_place);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void dec_place(MCNumber value) {
		setConstNumber(offset + 12, $dec_place, value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void dec_place(int value) {
		setConstNumber(offset + 12, $dec_place, value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void dec_place(long value) {
		setConstNumber(offset + 12, $dec_place, value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void dec_place(float value) {
		setConstNumber(offset + 12, $dec_place, value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void dec_place(double value) {
		setConstNumber(offset + 12, $dec_place, value);
	}


	/**
	 * Resource cd. 1 資源ＣＤ１.<p>
	 *
	 */
	public String rsrc_cd1() {
		return getConstString(offset + 13, $rsrc_cd1);
	}

	/**
	 * Resource cd. 1 資源ＣＤ１.<p>
	 *
	 */
	public void rsrc_cd1(String value) {
		setConstString(offset + 13, $rsrc_cd1, value);
	}


	/**
	 * Resource name 1 資源名１.<p>
	 *
	 */
	public String rsrc_nm1() {
		return getConstString(offset + 14, $rsrc_nm1);
	}

	/**
	 * Resource name 1 資源名１.<p>
	 *
	 */
	public void rsrc_nm1(String value) {
		setConstString(offset + 14, $rsrc_nm1, value);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR rsrc_act_qty1_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 15, $rsrc_act_qty1_p);
	}
	
	public void rsrc_act_qty1_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 15, $rsrc_act_qty1_p, row);
	}


	/**
	 * Resource unit name 1 資源単位名１.<p>
	 *
	 */
	public String rsrc_unit_nm1() {
		return getConstString(offset + 16, $rsrc_unit_nm1);
	}

	/**
	 * Resource unit name 1 資源単位名１.<p>
	 *
	 */
	public void rsrc_unit_nm1(String value) {
		setConstString(offset + 16, $rsrc_unit_nm1, value);
	}


	/**
	 * Resource number of decimal places 1 資源小数部有効桁数１.<p>
	 *
	 */
	public MCNumber rsrc_dec_place1() {
		return getConstNumber(offset + 17, $rsrc_dec_place1);
	}

	/**
	 * Resource number of decimal places 1 資源小数部有効桁数１.<p>
	 *
	 */
	public void rsrc_dec_place1(MCNumber value) {
		setConstNumber(offset + 17, $rsrc_dec_place1, value);
	}

	/**
	 * Resource number of decimal places 1 資源小数部有効桁数１.<p>
	 *
	 */
	public void rsrc_dec_place1(int value) {
		setConstNumber(offset + 17, $rsrc_dec_place1, value);
	}

	/**
	 * Resource number of decimal places 1 資源小数部有効桁数１.<p>
	 *
	 */
	public void rsrc_dec_place1(long value) {
		setConstNumber(offset + 17, $rsrc_dec_place1, value);
	}

	/**
	 * Resource number of decimal places 1 資源小数部有効桁数１.<p>
	 *
	 */
	public void rsrc_dec_place1(float value) {
		setConstNumber(offset + 17, $rsrc_dec_place1, value);
	}

	/**
	 * Resource number of decimal places 1 資源小数部有効桁数１.<p>
	 *
	 */
	public void rsrc_dec_place1(double value) {
		setConstNumber(offset + 17, $rsrc_dec_place1, value);
	}


	/**
	 * Rounding type 1 端数処理区分１.<p>
	 *
	 */
	public String rsrc_rnd_typ1() {
		return getConstString(offset + 18, $rsrc_rnd_typ1);
	}

	/**
	 * Rounding type 1 端数処理区分１.<p>
	 *
	 */
	public void rsrc_rnd_typ1(String value) {
		setConstString(offset + 18, $rsrc_rnd_typ1, value);
	}


	/**
	 * Resource cd. 2 資源ＣＤ２.<p>
	 *
	 */
	public String rsrc_cd2() {
		return getConstString(offset + 19, $rsrc_cd2);
	}

	/**
	 * Resource cd. 2 資源ＣＤ２.<p>
	 *
	 */
	public void rsrc_cd2(String value) {
		setConstString(offset + 19, $rsrc_cd2, value);
	}


	/**
	 * Resource name 2 資源名２.<p>
	 *
	 */
	public String rsrc_nm2() {
		return getConstString(offset + 20, $rsrc_nm2);
	}

	/**
	 * Resource name 2 資源名２.<p>
	 *
	 */
	public void rsrc_nm2(String value) {
		setConstString(offset + 20, $rsrc_nm2, value);
	}


	public mcframe.clientMAUB.MAUBP5040.QtyR rsrc_act_qty2_p(){
		return (mcframe.clientMAUB.MAUBP5040.QtyR) getConstInnerRow(offset + 21, $rsrc_act_qty2_p);
	}
	
	public void rsrc_act_qty2_p(mcframe.clientMAUB.MAUBP5040.QtyR row){
		setConstInnerRow(offset + 21, $rsrc_act_qty2_p, row);
	}


	/**
	 * Resource unit name 2 資源単位名２.<p>
	 *
	 */
	public String rsrc_unit_nm2() {
		return getConstString(offset + 22, $rsrc_unit_nm2);
	}

	/**
	 * Resource unit name 2 資源単位名２.<p>
	 *
	 */
	public void rsrc_unit_nm2(String value) {
		setConstString(offset + 22, $rsrc_unit_nm2, value);
	}


	/**
	 * Resource number of decimal places 2 資源小数部有効桁数２.<p>
	 *
	 */
	public MCNumber rsrc_dec_place2() {
		return getConstNumber(offset + 23, $rsrc_dec_place2);
	}

	/**
	 * Resource number of decimal places 2 資源小数部有効桁数２.<p>
	 *
	 */
	public void rsrc_dec_place2(MCNumber value) {
		setConstNumber(offset + 23, $rsrc_dec_place2, value);
	}

	/**
	 * Resource number of decimal places 2 資源小数部有効桁数２.<p>
	 *
	 */
	public void rsrc_dec_place2(int value) {
		setConstNumber(offset + 23, $rsrc_dec_place2, value);
	}

	/**
	 * Resource number of decimal places 2 資源小数部有効桁数２.<p>
	 *
	 */
	public void rsrc_dec_place2(long value) {
		setConstNumber(offset + 23, $rsrc_dec_place2, value);
	}

	/**
	 * Resource number of decimal places 2 資源小数部有効桁数２.<p>
	 *
	 */
	public void rsrc_dec_place2(float value) {
		setConstNumber(offset + 23, $rsrc_dec_place2, value);
	}

	/**
	 * Resource number of decimal places 2 資源小数部有効桁数２.<p>
	 *
	 */
	public void rsrc_dec_place2(double value) {
		setConstNumber(offset + 23, $rsrc_dec_place2, value);
	}


	/**
	 * Rounding type 2 端数処理区分２.<p>
	 *
	 */
	public String rsrc_rnd_typ2() {
		return getConstString(offset + 24, $rsrc_rnd_typ2);
	}

	/**
	 * Rounding type 2 端数処理区分２.<p>
	 *
	 */
	public void rsrc_rnd_typ2(String value) {
		setConstString(offset + 24, $rsrc_rnd_typ2, value);
	}


	public mcframe.clientMSUB.MSUBP5020.SnoWrkNoR sno_wrk_no_p(){
		return (mcframe.clientMSUB.MSUBP5020.SnoWrkNoR) getConstInnerRow(offset + 25, $sno_wrk_no_p);
	}
	
	public void sno_wrk_no_p(mcframe.clientMSUB.MSUBP5020.SnoWrkNoR row){
		setConstInnerRow(offset + 25, $sno_wrk_no_p, row);
	}


	/**
	 * Mfg. location cd. 製造場所ＣＤ.<p>
	 *
	 */
	public String mfg_loc_cd() {
		return getConstString(offset + 26, $mfg_loc_cd);
	}

	/**
	 * Mfg. location cd. 製造場所ＣＤ.<p>
	 *
	 */
	public void mfg_loc_cd(String value) {
		setConstString(offset + 26, $mfg_loc_cd, value);
	}


	/**
	 * Mfg. location name 製造場所名.<p>
	 *
	 */
	public String mfg_loc_nm() {
		return getConstString(offset + 27, $mfg_loc_nm);
	}

	/**
	 * Mfg. location name 製造場所名.<p>
	 *
	 */
	public void mfg_loc_nm(String value) {
		setConstString(offset + 27, $mfg_loc_nm, value);
	}


	/**
	 * BOM pattern 構成パタン.<p>
	 *
	 */
	public String bom_ptn() {
		return getConstString(offset + 28, $bom_ptn);
	}

	/**
	 * BOM pattern 構成パタン.<p>
	 *
	 */
	public void bom_ptn(String value) {
		setConstString(offset + 28, $bom_ptn, value);
	}


	/**
	 * Storage location cd. 格納場所ＣＤ.<p>
	 *
	 */
	public String strg_loc_cd() {
		return getConstString(offset + 29, $strg_loc_cd);
	}

	/**
	 * Storage location cd. 格納場所ＣＤ.<p>
	 *
	 */
	public void strg_loc_cd(String value) {
		setConstString(offset + 29, $strg_loc_cd, value);
	}


	/**
	 * Storage location name 格納場所名.<p>
	 *
	 */
	public String strg_loc_nm() {
		return getConstString(offset + 30, $strg_loc_nm);
	}

	/**
	 * Storage location name 格納場所名.<p>
	 *
	 */
	public void strg_loc_nm(String value) {
		setConstString(offset + 30, $strg_loc_nm, value);
	}


	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public String wg_cd() {
		return getConstString(offset + 31, $wg_cd);
	}

	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public void wg_cd(String value) {
		setConstString(offset + 31, $wg_cd, value);
	}


	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public String wg_nm() {
		return getConstString(offset + 32, $wg_nm);
	}

	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public void wg_nm(String value) {
		setConstString(offset + 32, $wg_nm, value);
	}


	/**
	 * Disallow procurement 手配不許可.<p>
	 *
	 */
	public boolean not_fix_flg() {
		return getConstBoolean(offset + 33, $not_fix_flg);
	}

	/**
	 * Disallow procurement 手配不許可.<p>
	 *
	 */
	public void not_fix_flg(boolean value) {
		setConstBoolean(offset + 33, $not_fix_flg, value);
	}


	/**
	 * Master application date マスタ適用日.<p>
	 *
	 */
	public MCDate master_dt() {
		return getConstDate(offset + 34, $master_dt);
	}

	/**
	 * Master application date マスタ適用日.<p>
	 *
	 */
	public void master_dt(MCDate value) {
		setConstDate(offset + 34, $master_dt, value);
	}


	/**
	 * Requirements No. 所要ＮＯ.<p>
	 *
	 */
	public String rqmt_no() {
		return getConstString(offset + 35, $rqmt_no);
	}

	/**
	 * Requirements No. 所要ＮＯ.<p>
	 *
	 */
	public void rqmt_no(String value) {
		setConstString(offset + 35, $rqmt_no, value);
	}


	/**
	 * GR/GI progress management No. 受払進捗管理ＮＯ.<p>
	 *
	 */
	public String io_schd_pr_no() {
		return getConstString(offset + 36, $io_schd_pr_no);
	}

	/**
	 * GR/GI progress management No. 受払進捗管理ＮＯ.<p>
	 *
	 */
	public void io_schd_pr_no(String value) {
		setConstString(offset + 36, $io_schd_pr_no, value);
	}


	/**
	 * Order/PO contact remarks 指図・発注連絡備考.<p>
	 *
	 */
	public String inst_po_cnt_rmrks() {
		return getConstString(offset + 37, $inst_po_cnt_rmrks);
	}

	/**
	 * Order/PO contact remarks 指図・発注連絡備考.<p>
	 *
	 */
	public void inst_po_cnt_rmrks(String value) {
		setConstString(offset + 37, $inst_po_cnt_rmrks, value);
	}


	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public String intr_rmrks() {
		return getConstString(offset + 38, $intr_rmrks);
	}

	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public void intr_rmrks(String value) {
		setConstString(offset + 38, $intr_rmrks, value);
	}


	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public String sub_char1() {
		return getConstString(offset + 39, $sub_char1);
	}

	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public void sub_char1(String value) {
		setConstString(offset + 39, $sub_char1, value);
	}


	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public String sub_char2() {
		return getConstString(offset + 40, $sub_char2);
	}

	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public void sub_char2(String value) {
		setConstString(offset + 40, $sub_char2, value);
	}


	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public String sub_char3() {
		return getConstString(offset + 41, $sub_char3);
	}

	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public void sub_char3(String value) {
		setConstString(offset + 41, $sub_char3, value);
	}


	public mcframe.clientMAUB.MAUBP5170.ItmGrpR itm_grp_p(){
		return (mcframe.clientMAUB.MAUBP5170.ItmGrpR) getConstInnerRow(offset + 42, $itm_grp_p);
	}
	
	public void itm_grp_p(mcframe.clientMAUB.MAUBP5170.ItmGrpR row){
		setConstInnerRow(offset + 42, $itm_grp_p, row);
	}


	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public String ins_usr_id() {
		return getConstString(offset + 43, $ins_usr_id);
	}

	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public void ins_usr_id(String value) {
		setConstString(offset + 43, $ins_usr_id, value);
	}


	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public String ins_usr_nm() {
		return getConstString(offset + 44, $ins_usr_nm);
	}

	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public void ins_usr_nm(String value) {
		setConstString(offset + 44, $ins_usr_nm, value);
	}


	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public String ins_func_id() {
		return getConstString(offset + 45, $ins_func_id);
	}

	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public void ins_func_id(String value) {
		setConstString(offset + 45, $ins_func_id, value);
	}


	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public String ins_func_nm() {
		return getConstString(offset + 46, $ins_func_nm);
	}

	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public void ins_func_nm(String value) {
		setConstString(offset + 46, $ins_func_nm, value);
	}


	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public MCTimestamp ins_ts() {
		return getConstTimestamp(offset + 47, $ins_ts);
	}

	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public void ins_ts(MCTimestamp value) {
		setConstTimestamp(offset + 47, $ins_ts, value);
	}


	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public MCNumber upd_cntr() {
		return getConstNumber(offset + 48, $upd_cntr);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(MCNumber value) {
		setConstNumber(offset + 48, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(int value) {
		setConstNumber(offset + 48, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(long value) {
		setConstNumber(offset + 48, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(float value) {
		setConstNumber(offset + 48, $upd_cntr, value);
	}

	/**
	 * Update counter 更新カウンタ.<p>
	 *
	 */
	public void upd_cntr(double value) {
		setConstNumber(offset + 48, $upd_cntr, value);
	}


	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public String upd_usr_id() {
		return getConstString(offset + 49, $upd_usr_id);
	}

	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public void upd_usr_id(String value) {
		setConstString(offset + 49, $upd_usr_id, value);
	}


	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public String upd_usr_nm() {
		return getConstString(offset + 50, $upd_usr_nm);
	}

	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public void upd_usr_nm(String value) {
		setConstString(offset + 50, $upd_usr_nm, value);
	}


	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public String upd_func_id() {
		return getConstString(offset + 51, $upd_func_id);
	}

	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public void upd_func_id(String value) {
		setConstString(offset + 51, $upd_func_id, value);
	}


	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public String upd_func_nm() {
		return getConstString(offset + 52, $upd_func_nm);
	}

	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public void upd_func_nm(String value) {
		setConstString(offset + 52, $upd_func_nm, value);
	}


	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public MCTimestamp upd_ts() {
		return getConstTimestamp(offset + 53, $upd_ts);
	}

	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public void upd_ts(MCTimestamp value) {
		setConstTimestamp(offset + 53, $upd_ts, value);
	}


	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public String upd_srv_req_no() {
		return getConstString(offset + 54, $upd_srv_req_no);
	}

	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public void upd_srv_req_no(String value) {
		setConstString(offset + 54, $upd_srv_req_no, value);
	}


	/**
	 * Item 品目.<p>
	 *
	 */
	public String disp_itm_cd() {
		return getConstString(offset + 55, $disp_itm_cd);
	}

	/**
	 * Item 品目.<p>
	 *
	 */
	public void disp_itm_cd(String value) {
		setConstString(offset + 55, $disp_itm_cd, value);
	}


	/**
	 * SEIBAN No. 手配ＮＯ.<p>
	 *
	 */
	public String disp_sno() {
		return getConstString(offset + 56, $disp_sno);
	}

	/**
	 * SEIBAN No. 手配ＮＯ.<p>
	 *
	 */
	public void disp_sno(String value) {
		setConstString(offset + 56, $disp_sno, value);
	}


	/**
	 * Record ID レコードＩＤ.<p>
	 *
	 */
	public String record_id() {
		return getConstString(offset + 57, $record_id);
	}

	/**
	 * Record ID レコードＩＤ.<p>
	 *
	 */
	public void record_id(String value) {
		setConstString(offset + 57, $record_id, value);
	}


	/**
	 * Record group ID レコードグループＩＤ.<p>
	 *
	 */
	public String record_grp_id() {
		return getConstString(offset + 58, $record_grp_id);
	}

	/**
	 * Record group ID レコードグループＩＤ.<p>
	 *
	 */
	public void record_grp_id(String value) {
		setConstString(offset + 58, $record_grp_id, value);
	}


	/**
	 * Load status type for the item order before change 変更前品目オーダ負荷状況区分.<p>
	 *
	 */
	public String old_itm_ord_ld_sts_typ() {
		return getConstString(offset + 59, $old_itm_ord_ld_sts_typ);
	}

	/**
	 * Load status type for the item order before change 変更前品目オーダ負荷状況区分.<p>
	 *
	 */
	public void old_itm_ord_ld_sts_typ(String value) {
		setConstString(offset + 59, $old_itm_ord_ld_sts_typ, value);
	}


	/**
	 * Load status type name for the item order before change 変更前品目オーダ負荷状況区分名.<p>
	 *
	 */
	public String old_itm_ord_ld_sts_typ_nm() {
		return getConstString(offset + 60, $old_itm_ord_ld_sts_typ_nm);
	}

	/**
	 * Load status type name for the item order before change 変更前品目オーダ負荷状況区分名.<p>
	 *
	 */
	public void old_itm_ord_ld_sts_typ_nm(String value) {
		setConstString(offset + 60, $old_itm_ord_ld_sts_typ_nm, value);
	}


	/**
	 * Mfg. start date before change 変更前製造着手日.<p>
	 *
	 */
	public MCDate old_mfg_st_dt() {
		return getConstDate(offset + 61, $old_mfg_st_dt);
	}

	/**
	 * Mfg. start date before change 変更前製造着手日.<p>
	 *
	 */
	public void old_mfg_st_dt(MCDate value) {
		setConstDate(offset + 61, $old_mfg_st_dt, value);
	}


	/**
	 * Mfg. end date before change 変更前製造終了日.<p>
	 *
	 */
	public MCDate old_mfg_end_dt() {
		return getConstDate(offset + 62, $old_mfg_end_dt);
	}

	/**
	 * Mfg. end date before change 変更前製造終了日.<p>
	 *
	 */
	public void old_mfg_end_dt(MCDate value) {
		setConstDate(offset + 62, $old_mfg_end_dt, value);
	}


	/**
	 * LT for Gantt display ガント表示用ＬＴ.<p>
	 *
	 */
	public MCNumber gantt_lt() {
		return getConstNumber(offset + 63, $gantt_lt);
	}

	/**
	 * LT for Gantt display ガント表示用ＬＴ.<p>
	 *
	 */
	public void gantt_lt(MCNumber value) {
		setConstNumber(offset + 63, $gantt_lt, value);
	}

	/**
	 * LT for Gantt display ガント表示用ＬＴ.<p>
	 *
	 */
	public void gantt_lt(int value) {
		setConstNumber(offset + 63, $gantt_lt, value);
	}

	/**
	 * LT for Gantt display ガント表示用ＬＴ.<p>
	 *
	 */
	public void gantt_lt(long value) {
		setConstNumber(offset + 63, $gantt_lt, value);
	}

	/**
	 * LT for Gantt display ガント表示用ＬＴ.<p>
	 *
	 */
	public void gantt_lt(float value) {
		setConstNumber(offset + 63, $gantt_lt, value);
	}

	/**
	 * LT for Gantt display ガント表示用ＬＴ.<p>
	 *
	 */
	public void gantt_lt(double value) {
		setConstNumber(offset + 63, $gantt_lt, value);
	}


	public String getString(String name) {
		if ($itm_ord_no.equalsIgnoreCase(name)) {
			return itm_ord_no();
		}
		if ($itm_ord_typ.equalsIgnoreCase(name)) {
			return itm_ord_typ();
		}
		if ($itm_ord_typ_nm.equalsIgnoreCase(name)) {
			return itm_ord_typ_nm();
		}
		if ($itm_ord_ld_sts_typ.equalsIgnoreCase(name)) {
			return itm_ord_ld_sts_typ();
		}
		if ($itm_ord_ld_sts_typ_nm.equalsIgnoreCase(name)) {
			return itm_ord_ld_sts_typ_nm();
		}
		if ($unit_cd.equalsIgnoreCase(name)) {
			return unit_cd();
		}
		if ($unit_nm.equalsIgnoreCase(name)) {
			return unit_nm();
		}
		if ($rsrc_cd1.equalsIgnoreCase(name)) {
			return rsrc_cd1();
		}
		if ($rsrc_nm1.equalsIgnoreCase(name)) {
			return rsrc_nm1();
		}
		if ($rsrc_unit_nm1.equalsIgnoreCase(name)) {
			return rsrc_unit_nm1();
		}
		if ($rsrc_rnd_typ1.equalsIgnoreCase(name)) {
			return rsrc_rnd_typ1();
		}
		if ($rsrc_cd2.equalsIgnoreCase(name)) {
			return rsrc_cd2();
		}
		if ($rsrc_nm2.equalsIgnoreCase(name)) {
			return rsrc_nm2();
		}
		if ($rsrc_unit_nm2.equalsIgnoreCase(name)) {
			return rsrc_unit_nm2();
		}
		if ($rsrc_rnd_typ2.equalsIgnoreCase(name)) {
			return rsrc_rnd_typ2();
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
		if ($strg_loc_cd.equalsIgnoreCase(name)) {
			return strg_loc_cd();
		}
		if ($strg_loc_nm.equalsIgnoreCase(name)) {
			return strg_loc_nm();
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			return wg_nm();
		}
		if ($rqmt_no.equalsIgnoreCase(name)) {
			return rqmt_no();
		}
		if ($io_schd_pr_no.equalsIgnoreCase(name)) {
			return io_schd_pr_no();
		}
		if ($inst_po_cnt_rmrks.equalsIgnoreCase(name)) {
			return inst_po_cnt_rmrks();
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
		if ($disp_itm_cd.equalsIgnoreCase(name)) {
			return disp_itm_cd();
		}
		if ($disp_sno.equalsIgnoreCase(name)) {
			return disp_sno();
		}
		if ($record_id.equalsIgnoreCase(name)) {
			return record_id();
		}
		if ($record_grp_id.equalsIgnoreCase(name)) {
			return record_grp_id();
		}
		if ($old_itm_ord_ld_sts_typ.equalsIgnoreCase(name)) {
			return old_itm_ord_ld_sts_typ();
		}
		if ($old_itm_ord_ld_sts_typ_nm.equalsIgnoreCase(name)) {
			return old_itm_ord_ld_sts_typ_nm();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($mfg_lt.equalsIgnoreCase(name)) {
			return mfg_lt();
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			return dec_place();
		}
		if ($rsrc_dec_place1.equalsIgnoreCase(name)) {
			return rsrc_dec_place1();
		}
		if ($rsrc_dec_place2.equalsIgnoreCase(name)) {
			return rsrc_dec_place2();
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			return upd_cntr();
		}
		if ($gantt_lt.equalsIgnoreCase(name)) {
			return gantt_lt();
		}
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		if ($mfg_st_dt.equalsIgnoreCase(name)) {
			return mfg_st_dt();
		}
		if ($mfg_end_dt.equalsIgnoreCase(name)) {
			return mfg_end_dt();
		}
		if ($master_dt.equalsIgnoreCase(name)) {
			return master_dt();
		}
		if ($old_mfg_st_dt.equalsIgnoreCase(name)) {
			return old_mfg_st_dt();
		}
		if ($old_mfg_end_dt.equalsIgnoreCase(name)) {
			return old_mfg_end_dt();
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
		if ($not_fix_flg.equalsIgnoreCase(name)) {
			return not_fix_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($itm_ord_no.equalsIgnoreCase(name)) {
			return itm_ord_no();
		}
		if ($itm_ord_typ.equalsIgnoreCase(name)) {
			return itm_ord_typ();
		}
		if ($itm_ord_typ_nm.equalsIgnoreCase(name)) {
			return itm_ord_typ_nm();
		}
		if ($itm_ord_ld_sts_typ.equalsIgnoreCase(name)) {
			return itm_ord_ld_sts_typ();
		}
		if ($itm_ord_ld_sts_typ_nm.equalsIgnoreCase(name)) {
			return itm_ord_ld_sts_typ_nm();
		}
		if ($unit_cd.equalsIgnoreCase(name)) {
			return unit_cd();
		}
		if ($unit_nm.equalsIgnoreCase(name)) {
			return unit_nm();
		}
		if ($rsrc_cd1.equalsIgnoreCase(name)) {
			return rsrc_cd1();
		}
		if ($rsrc_nm1.equalsIgnoreCase(name)) {
			return rsrc_nm1();
		}
		if ($rsrc_unit_nm1.equalsIgnoreCase(name)) {
			return rsrc_unit_nm1();
		}
		if ($rsrc_rnd_typ1.equalsIgnoreCase(name)) {
			return rsrc_rnd_typ1();
		}
		if ($rsrc_cd2.equalsIgnoreCase(name)) {
			return rsrc_cd2();
		}
		if ($rsrc_nm2.equalsIgnoreCase(name)) {
			return rsrc_nm2();
		}
		if ($rsrc_unit_nm2.equalsIgnoreCase(name)) {
			return rsrc_unit_nm2();
		}
		if ($rsrc_rnd_typ2.equalsIgnoreCase(name)) {
			return rsrc_rnd_typ2();
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
		if ($strg_loc_cd.equalsIgnoreCase(name)) {
			return strg_loc_cd();
		}
		if ($strg_loc_nm.equalsIgnoreCase(name)) {
			return strg_loc_nm();
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			return wg_nm();
		}
		if ($rqmt_no.equalsIgnoreCase(name)) {
			return rqmt_no();
		}
		if ($io_schd_pr_no.equalsIgnoreCase(name)) {
			return io_schd_pr_no();
		}
		if ($inst_po_cnt_rmrks.equalsIgnoreCase(name)) {
			return inst_po_cnt_rmrks();
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
		if ($disp_itm_cd.equalsIgnoreCase(name)) {
			return disp_itm_cd();
		}
		if ($disp_sno.equalsIgnoreCase(name)) {
			return disp_sno();
		}
		if ($record_id.equalsIgnoreCase(name)) {
			return record_id();
		}
		if ($record_grp_id.equalsIgnoreCase(name)) {
			return record_grp_id();
		}
		if ($old_itm_ord_ld_sts_typ.equalsIgnoreCase(name)) {
			return old_itm_ord_ld_sts_typ();
		}
		if ($old_itm_ord_ld_sts_typ_nm.equalsIgnoreCase(name)) {
			return old_itm_ord_ld_sts_typ_nm();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($mfg_lt.equalsIgnoreCase(name)) {
			return mfg_lt();
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			return dec_place();
		}
		if ($rsrc_dec_place1.equalsIgnoreCase(name)) {
			return rsrc_dec_place1();
		}
		if ($rsrc_dec_place2.equalsIgnoreCase(name)) {
			return rsrc_dec_place2();
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			return upd_cntr();
		}
		if ($gantt_lt.equalsIgnoreCase(name)) {
			return gantt_lt();
		}
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($mfg_st_dt.equalsIgnoreCase(name)) {
			return mfg_st_dt();
		}
		if ($mfg_end_dt.equalsIgnoreCase(name)) {
			return mfg_end_dt();
		}
		if ($master_dt.equalsIgnoreCase(name)) {
			return master_dt();
		}
		if ($old_mfg_st_dt.equalsIgnoreCase(name)) {
			return old_mfg_st_dt();
		}
		if ($old_mfg_end_dt.equalsIgnoreCase(name)) {
			return old_mfg_end_dt();
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
		if ($not_fix_flg.equalsIgnoreCase(name)) {
			return not_fix_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($itm_ord_no.equalsIgnoreCase(name)) {
			itm_ord_no(value);
			return;
		}
		if ($itm_ord_typ.equalsIgnoreCase(name)) {
			itm_ord_typ(value);
			return;
		}
		if ($itm_ord_typ_nm.equalsIgnoreCase(name)) {
			itm_ord_typ_nm(value);
			return;
		}
		if ($itm_ord_ld_sts_typ.equalsIgnoreCase(name)) {
			itm_ord_ld_sts_typ(value);
			return;
		}
		if ($itm_ord_ld_sts_typ_nm.equalsIgnoreCase(name)) {
			itm_ord_ld_sts_typ_nm(value);
			return;
		}
		if ($unit_cd.equalsIgnoreCase(name)) {
			unit_cd(value);
			return;
		}
		if ($unit_nm.equalsIgnoreCase(name)) {
			unit_nm(value);
			return;
		}
		if ($rsrc_cd1.equalsIgnoreCase(name)) {
			rsrc_cd1(value);
			return;
		}
		if ($rsrc_nm1.equalsIgnoreCase(name)) {
			rsrc_nm1(value);
			return;
		}
		if ($rsrc_unit_nm1.equalsIgnoreCase(name)) {
			rsrc_unit_nm1(value);
			return;
		}
		if ($rsrc_rnd_typ1.equalsIgnoreCase(name)) {
			rsrc_rnd_typ1(value);
			return;
		}
		if ($rsrc_cd2.equalsIgnoreCase(name)) {
			rsrc_cd2(value);
			return;
		}
		if ($rsrc_nm2.equalsIgnoreCase(name)) {
			rsrc_nm2(value);
			return;
		}
		if ($rsrc_unit_nm2.equalsIgnoreCase(name)) {
			rsrc_unit_nm2(value);
			return;
		}
		if ($rsrc_rnd_typ2.equalsIgnoreCase(name)) {
			rsrc_rnd_typ2(value);
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
		if ($strg_loc_cd.equalsIgnoreCase(name)) {
			strg_loc_cd(value);
			return;
		}
		if ($strg_loc_nm.equalsIgnoreCase(name)) {
			strg_loc_nm(value);
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
		if ($rqmt_no.equalsIgnoreCase(name)) {
			rqmt_no(value);
			return;
		}
		if ($io_schd_pr_no.equalsIgnoreCase(name)) {
			io_schd_pr_no(value);
			return;
		}
		if ($inst_po_cnt_rmrks.equalsIgnoreCase(name)) {
			inst_po_cnt_rmrks(value);
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
		if ($disp_itm_cd.equalsIgnoreCase(name)) {
			disp_itm_cd(value);
			return;
		}
		if ($disp_sno.equalsIgnoreCase(name)) {
			disp_sno(value);
			return;
		}
		if ($record_id.equalsIgnoreCase(name)) {
			record_id(value);
			return;
		}
		if ($record_grp_id.equalsIgnoreCase(name)) {
			record_grp_id(value);
			return;
		}
		if ($old_itm_ord_ld_sts_typ.equalsIgnoreCase(name)) {
			old_itm_ord_ld_sts_typ(value);
			return;
		}
		if ($old_itm_ord_ld_sts_typ_nm.equalsIgnoreCase(name)) {
			old_itm_ord_ld_sts_typ_nm(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($mfg_lt.equalsIgnoreCase(name)) {
			mfg_lt(value);
			return;
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($rsrc_dec_place1.equalsIgnoreCase(name)) {
			rsrc_dec_place1(value);
			return;
		}
		if ($rsrc_dec_place2.equalsIgnoreCase(name)) {
			rsrc_dec_place2(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		if ($gantt_lt.equalsIgnoreCase(name)) {
			gantt_lt(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($mfg_lt.equalsIgnoreCase(name)) {
			mfg_lt(value);
			return;
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($rsrc_dec_place1.equalsIgnoreCase(name)) {
			rsrc_dec_place1(value);
			return;
		}
		if ($rsrc_dec_place2.equalsIgnoreCase(name)) {
			rsrc_dec_place2(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		if ($gantt_lt.equalsIgnoreCase(name)) {
			gantt_lt(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($mfg_lt.equalsIgnoreCase(name)) {
			mfg_lt(value);
			return;
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($rsrc_dec_place1.equalsIgnoreCase(name)) {
			rsrc_dec_place1(value);
			return;
		}
		if ($rsrc_dec_place2.equalsIgnoreCase(name)) {
			rsrc_dec_place2(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		if ($gantt_lt.equalsIgnoreCase(name)) {
			gantt_lt(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($mfg_lt.equalsIgnoreCase(name)) {
			mfg_lt(value);
			return;
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($rsrc_dec_place1.equalsIgnoreCase(name)) {
			rsrc_dec_place1(value);
			return;
		}
		if ($rsrc_dec_place2.equalsIgnoreCase(name)) {
			rsrc_dec_place2(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		if ($gantt_lt.equalsIgnoreCase(name)) {
			gantt_lt(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($mfg_lt.equalsIgnoreCase(name)) {
			mfg_lt(value);
			return;
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($rsrc_dec_place1.equalsIgnoreCase(name)) {
			rsrc_dec_place1(value);
			return;
		}
		if ($rsrc_dec_place2.equalsIgnoreCase(name)) {
			rsrc_dec_place2(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		if ($gantt_lt.equalsIgnoreCase(name)) {
			gantt_lt(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($mfg_st_dt.equalsIgnoreCase(name)) {
			mfg_st_dt(value);
			return;
		}
		if ($mfg_end_dt.equalsIgnoreCase(name)) {
			mfg_end_dt(value);
			return;
		}
		if ($master_dt.equalsIgnoreCase(name)) {
			master_dt(value);
			return;
		}
		if ($old_mfg_st_dt.equalsIgnoreCase(name)) {
			old_mfg_st_dt(value);
			return;
		}
		if ($old_mfg_end_dt.equalsIgnoreCase(name)) {
			old_mfg_end_dt(value);
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
		if ($not_fix_flg.equalsIgnoreCase(name)) {
			not_fix_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($itm_ord_no.equalsIgnoreCase(name)) {
			itm_ord_no(value);
			return;
		}
		if ($itm_ord_typ.equalsIgnoreCase(name)) {
			itm_ord_typ(value);
			return;
		}
		if ($itm_ord_typ_nm.equalsIgnoreCase(name)) {
			itm_ord_typ_nm(value);
			return;
		}
		if ($itm_ord_ld_sts_typ.equalsIgnoreCase(name)) {
			itm_ord_ld_sts_typ(value);
			return;
		}
		if ($itm_ord_ld_sts_typ_nm.equalsIgnoreCase(name)) {
			itm_ord_ld_sts_typ_nm(value);
			return;
		}
		if ($unit_cd.equalsIgnoreCase(name)) {
			unit_cd(value);
			return;
		}
		if ($unit_nm.equalsIgnoreCase(name)) {
			unit_nm(value);
			return;
		}
		if ($rsrc_cd1.equalsIgnoreCase(name)) {
			rsrc_cd1(value);
			return;
		}
		if ($rsrc_nm1.equalsIgnoreCase(name)) {
			rsrc_nm1(value);
			return;
		}
		if ($rsrc_unit_nm1.equalsIgnoreCase(name)) {
			rsrc_unit_nm1(value);
			return;
		}
		if ($rsrc_rnd_typ1.equalsIgnoreCase(name)) {
			rsrc_rnd_typ1(value);
			return;
		}
		if ($rsrc_cd2.equalsIgnoreCase(name)) {
			rsrc_cd2(value);
			return;
		}
		if ($rsrc_nm2.equalsIgnoreCase(name)) {
			rsrc_nm2(value);
			return;
		}
		if ($rsrc_unit_nm2.equalsIgnoreCase(name)) {
			rsrc_unit_nm2(value);
			return;
		}
		if ($rsrc_rnd_typ2.equalsIgnoreCase(name)) {
			rsrc_rnd_typ2(value);
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
		if ($strg_loc_cd.equalsIgnoreCase(name)) {
			strg_loc_cd(value);
			return;
		}
		if ($strg_loc_nm.equalsIgnoreCase(name)) {
			strg_loc_nm(value);
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
		if ($rqmt_no.equalsIgnoreCase(name)) {
			rqmt_no(value);
			return;
		}
		if ($io_schd_pr_no.equalsIgnoreCase(name)) {
			io_schd_pr_no(value);
			return;
		}
		if ($inst_po_cnt_rmrks.equalsIgnoreCase(name)) {
			inst_po_cnt_rmrks(value);
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
		if ($disp_itm_cd.equalsIgnoreCase(name)) {
			disp_itm_cd(value);
			return;
		}
		if ($disp_sno.equalsIgnoreCase(name)) {
			disp_sno(value);
			return;
		}
		if ($record_id.equalsIgnoreCase(name)) {
			record_id(value);
			return;
		}
		if ($record_grp_id.equalsIgnoreCase(name)) {
			record_grp_id(value);
			return;
		}
		if ($old_itm_ord_ld_sts_typ.equalsIgnoreCase(name)) {
			old_itm_ord_ld_sts_typ(value);
			return;
		}
		if ($old_itm_ord_ld_sts_typ_nm.equalsIgnoreCase(name)) {
			old_itm_ord_ld_sts_typ_nm(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($mfg_lt.equalsIgnoreCase(name)) {
			mfg_lt(value);
			return;
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($rsrc_dec_place1.equalsIgnoreCase(name)) {
			rsrc_dec_place1(value);
			return;
		}
		if ($rsrc_dec_place2.equalsIgnoreCase(name)) {
			rsrc_dec_place2(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		if ($gantt_lt.equalsIgnoreCase(name)) {
			gantt_lt(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($mfg_lt.equalsIgnoreCase(name)) {
			mfg_lt(value);
			return;
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($rsrc_dec_place1.equalsIgnoreCase(name)) {
			rsrc_dec_place1(value);
			return;
		}
		if ($rsrc_dec_place2.equalsIgnoreCase(name)) {
			rsrc_dec_place2(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		if ($gantt_lt.equalsIgnoreCase(name)) {
			gantt_lt(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($mfg_lt.equalsIgnoreCase(name)) {
			mfg_lt(value);
			return;
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($rsrc_dec_place1.equalsIgnoreCase(name)) {
			rsrc_dec_place1(value);
			return;
		}
		if ($rsrc_dec_place2.equalsIgnoreCase(name)) {
			rsrc_dec_place2(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		if ($gantt_lt.equalsIgnoreCase(name)) {
			gantt_lt(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($mfg_lt.equalsIgnoreCase(name)) {
			mfg_lt(value);
			return;
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($rsrc_dec_place1.equalsIgnoreCase(name)) {
			rsrc_dec_place1(value);
			return;
		}
		if ($rsrc_dec_place2.equalsIgnoreCase(name)) {
			rsrc_dec_place2(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		if ($gantt_lt.equalsIgnoreCase(name)) {
			gantt_lt(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($mfg_lt.equalsIgnoreCase(name)) {
			mfg_lt(value);
			return;
		}
		if ($dec_place.equalsIgnoreCase(name)) {
			dec_place(value);
			return;
		}
		if ($rsrc_dec_place1.equalsIgnoreCase(name)) {
			rsrc_dec_place1(value);
			return;
		}
		if ($rsrc_dec_place2.equalsIgnoreCase(name)) {
			rsrc_dec_place2(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		if ($gantt_lt.equalsIgnoreCase(name)) {
			gantt_lt(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($mfg_st_dt.equalsIgnoreCase(name)) {
			mfg_st_dt(value);
			return;
		}
		if ($mfg_end_dt.equalsIgnoreCase(name)) {
			mfg_end_dt(value);
			return;
		}
		if ($master_dt.equalsIgnoreCase(name)) {
			master_dt(value);
			return;
		}
		if ($old_mfg_st_dt.equalsIgnoreCase(name)) {
			old_mfg_st_dt(value);
			return;
		}
		if ($old_mfg_end_dt.equalsIgnoreCase(name)) {
			old_mfg_end_dt(value);
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
		if ($not_fix_flg.equalsIgnoreCase(name)) {
			not_fix_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}

	public MCRow getInnerRow(String name) {
		if ($itm_p.equalsIgnoreCase(name)) {
			return itm_p();
		}
		if ($inst_qty_p.equalsIgnoreCase(name)) {
			return inst_qty_p();
		}
		if ($rsrc_act_qty1_p.equalsIgnoreCase(name)) {
			return rsrc_act_qty1_p();
		}
		if ($rsrc_act_qty2_p.equalsIgnoreCase(name)) {
			return rsrc_act_qty2_p();
		}
		if ($sno_wrk_no_p.equalsIgnoreCase(name)) {
			return sno_wrk_no_p();
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
		if ($inst_qty_p.equalsIgnoreCase(name)) {
			inst_qty_p(
				((MCContainerMeta) inst_qty_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($rsrc_act_qty1_p.equalsIgnoreCase(name)) {
			rsrc_act_qty1_p(
				((MCContainerMeta) rsrc_act_qty1_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($rsrc_act_qty2_p.equalsIgnoreCase(name)) {
			rsrc_act_qty2_p(
				((MCContainerMeta) rsrc_act_qty2_p_META).castInnerRow(mcframe.clientMAUB.MAUBP5040.QtyR.class, value)
			);
			return;
		}
		if ($sno_wrk_no_p.equalsIgnoreCase(name)) {
			sno_wrk_no_p(
				((MCContainerMeta) sno_wrk_no_p_META).castInnerRow(mcframe.clientMSUB.MSUBP5020.SnoWrkNoR.class, value)
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

	public MCNumber qty() {
		return inst_qty_p().qty();
	}

	public void qty(MCNumber value) {
		inst_qty_p().qty(value);
	}

	public void qty(int value) {
		inst_qty_p().qty(value);
	}

	public void qty(long value) {
		inst_qty_p().qty(value);
	}

	public void qty(float value) {
		inst_qty_p().qty(value);
	}

	public void qty(double value) {
		inst_qty_p().qty(value);
	}

	/**
	 * Actual value 1 実際値１.<p>
	 *
	 */
	public MCNumber rsrc_act_qty1() {
		return rsrc_act_qty1_p().qty();
	}

	/**
	 * Actual value 1 実際値１.<p>
	 *
	 */
	public void rsrc_act_qty1(MCNumber value) {
		rsrc_act_qty1_p().qty(value);
	}

	/**
	 * Actual value 1 実際値１.<p>
	 *
	 */
	public void rsrc_act_qty1(int value) {
		rsrc_act_qty1_p().qty(value);
	}

	/**
	 * Actual value 1 実際値１.<p>
	 *
	 */
	public void rsrc_act_qty1(long value) {
		rsrc_act_qty1_p().qty(value);
	}

	/**
	 * Actual value 1 実際値１.<p>
	 *
	 */
	public void rsrc_act_qty1(float value) {
		rsrc_act_qty1_p().qty(value);
	}

	/**
	 * Actual value 1 実際値１.<p>
	 *
	 */
	public void rsrc_act_qty1(double value) {
		rsrc_act_qty1_p().qty(value);
	}

	/**
	 * Actual Value 2 実際値２.<p>
	 *
	 */
	public MCNumber rsrc_act_qty2() {
		return rsrc_act_qty2_p().qty();
	}

	/**
	 * Actual Value 2 実際値２.<p>
	 *
	 */
	public void rsrc_act_qty2(MCNumber value) {
		rsrc_act_qty2_p().qty(value);
	}

	/**
	 * Actual Value 2 実際値２.<p>
	 *
	 */
	public void rsrc_act_qty2(int value) {
		rsrc_act_qty2_p().qty(value);
	}

	/**
	 * Actual Value 2 実際値２.<p>
	 *
	 */
	public void rsrc_act_qty2(long value) {
		rsrc_act_qty2_p().qty(value);
	}

	/**
	 * Actual Value 2 実際値２.<p>
	 *
	 */
	public void rsrc_act_qty2(float value) {
		rsrc_act_qty2_p().qty(value);
	}

	/**
	 * Actual Value 2 実際値２.<p>
	 *
	 */
	public void rsrc_act_qty2(double value) {
		rsrc_act_qty2_p().qty(value);
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

